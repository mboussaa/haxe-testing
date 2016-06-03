# remove all containers 
#
echo "remove all containers";
docker stop $(docker ps -a -q);
docker rm $(docker ps -a -q);
rm -rf /shared/stats/*;
mkdir /shared/stats/statistics

# run InfluxDB
#
echo "run InfluxDB Time Series DB container";
docker run -d -p 8083:8083 -p 8086:8086 --expose 8090 --expose 8099 -e PRE_CREATE_DB="cadvisorDB" --name influxdb tutum/influxdb:0.8.8

# run CAdvisor
#
echo "run CAdvisor container";
docker run --volume=/:/rootfs:ro --volume=/var/run:/var/run:rw --volume=/sys:/sys:ro --volume=/var/lib/docker/:/var/lib/docker:ro --publish=8080:8080 --detach=true --name=cadvisor google/cadvisor:0.19.3 -logtostderr -storage_driver_host=10.0.0.1:8086 -storage_driver_db=cadvisorDB -storage_driver=influxdb --storage_duration=0m1s

# compile all tests to different target platforms
#
#echo "compile all tests to different targets";
#docker run -w /shared -it --rm -v /shared:/shared --name=haxe_compilation mboussaa/haxe /bin/bash -c "./compileAll.sh"

sleep 5s;

# start tests
#
echo "start tests execution"
declare -a target=("java" "js" "cpp" "cs" "php")
declare -A bench=(["color"]="19")
declare -A loop_hxmath=(["1"]="70" ["2"]="80" ["3"]="90" ["4"]="100" ["5"]="100" ["6"]="100" ["7"]="100")
declare -A loop_color=(["1"]="700" ["2"]="700" ["3"]="650" ["4"]="650" ["5"]="700" ["6"]="500" ["7"]="700" ["8"]="700" ["9"]="650" ["10"]="700" ["11"]="700" ["12"]="700" ["13"]="500" ["14"]="700" ["15"]="700" ["16"]="700" ["17"]="700" ["18"]="700" ["19"]="500")
#echo "${animals["moo"]}"
#for sound in "${!animals[@]}" 
#do 
#echo "$sound - ${animals["$sound"]}" 
#done

for ts in "${!bench[@]}" 
do 
for (( i=1; i<=${bench["$ts"]}; i++ ))
do
for j in "${target[@]}"
do
tab=loop_$ts[$i]
echo ${!tab}
echo "***************************************************************************************************"
TIMEFORMAT='%3R'

echo "running !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!:::::::::::::::::::::::::::::::::::::::::: '$j' '$ts' '$i' ${!tab}";
time(docker run -w /shared -it --rm -v /shared:/shared --name=haxe_"$j"_"$ts"_"$i" mboussaa/haxe /bin/bash -c "./run.sh '$j' '$ts' '$i' ${!tab}") 2>> /shared/stats/statistics/time_"$ts"_"$j".csv
done
done

sleep 60s;
for (( i=1; i<=${bench["$ts"]}; i++ ))
do
for j in "${target[@]}"
do
curl -o /shared/stats/statistics/influxdb.json -G 'http://10.0.0.1:8086/db/cadvisorDB/series?u=root&p=root&pretty=true' --data-urlencode "q=select container_name, max(memory_usage) from stats where container_name ='haxe_"$j"_"$ts"_"$i"' and memory_usage <> 0 group by container_name"
python3 /shared/JSON2CSVFILE.py
cat /shared/stats/statistics/memory >> /shared/stats/statistics/memory_"$ts"_"$j"
done
done


paste -d ',' /shared/stats/statistics/time_"$ts"_java.csv  /shared/stats/statistics/time_"$ts"_js.csv  /shared/stats/statistics/time_"$ts"_cpp.csv  /shared/stats/statistics/time_"$ts"_cs.csv  /shared/stats/statistics/time_"$ts"_php.csv> /shared/stats/time_"$ts".csv;
paste -d ',' /shared/stats/statistics/memory_"$ts"_java  /shared/stats/statistics/memory_"$ts"_js  /shared/stats/statistics/memory_"$ts"_cpp  /shared/stats/statistics/memory_"$ts"_cs /shared/stats/statistics/memory_"$ts"_php  > /shared/stats/memory_"$ts".csv;

done
#docker run -w /shared/hxmath -it --rm -v /shared:/shared --name=haxe_java_"$i" mboussaa/haxe /bin/bash -c "./run_java.sh '$i'"
#docker run -w /shared/hxmath -it --rm -v /shared:/shared --name=haxe_js_"$i" mboussaa/haxe /bin/bash -c "./run_js.sh '$i'"
#echo "docker run -w /shared/hxmath -it --rm -v /shared:/shared --name=haxe_run mboussaa/haxe /bin/bash -c "./run_c++.sh "$i"""
#docker run -w /shared/hxmath -it --rm -v /shared:/shared --name=haxe_cpp_"$i" mboussaa/haxe /bin/bash -c "./run_c++.sh '$i'"
#docker run -w /shared/hxmath -it --rm -v /shared:/shared --name=haxe_cs_"$i" mboussaa/haxe /bin/bash -c "./run_cs.sh '$i'"
#done 

