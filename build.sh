# remove all containers 
#
echo "remove all containers";
docker stop $(docker ps -a -q);
docker rm $(docker ps -a -q);
rm -rf /shared/statistics/*;

# run InfluxDB
#
echo "run InfluxDB Time Series DB container";
docker run -d -p 8083:8083 -p 8086:8086 --expose 8090 --expose 8099 -e PRE_CREATE_DB="cadvisorDB" --name influxdb tutum/influxdb:0.8.8

# run CAdvisor
#
echo "run CAdvisor container";
docker run --volume=/:/rootfs:ro --volume=/var/run:/var/run:rw --volume=/sys:/sys:ro --volume=/var/lib/docker/:/var/lib/docker:ro --publish=8080:8080 --detach=true --name=cadvisor google/cadvisor:0.19.3 -logtostderr -storage_driver_host=10.0.2.15:8086 -storage_driver_db=cadvisorDB -storage_driver=influxdb --storage_duration=0m1s

# compile all tests to different target platforms
#
#echo "compile all tests to different targets";
#docker run -w /shared -it --rm -v /shared:/shared --name=haxe_compilation mboussaa/haxe /bin/bash -c "./compileAll.sh"

sleep 5s;

# start tests
#
echo "start tests execution"
#declare -a arr=("java" "js" "cpp" "cs" "php")
declare -a arr=("php")
#declare -A animals=( ["moo"]="cow" ["woof"]="dog")
#echo "${animals["moo"]}"
#for sound in "${!animals[@]}" 
#do 
#echo "$sound - ${animals["$sound"]}" 
#done
for (( i=1; i<=7; i++ ))
do
for j in "${arr[@]}"
do
TIMEFORMAT='%3R'
time(docker run -w /shared -it --rm -v /shared:/shared --name=haxe_"$j"_hxmath_"$i" mboussaa/haxe /bin/bash -c "./run.sh '$j' hxmath '$i' 1") 2>> /shared/statistics/time_"$j".csv
done
done

#docker run -w /shared/hxmath -it --rm -v /shared:/shared --name=haxe_java_"$i" mboussaa/haxe /bin/bash -c "./run_java.sh '$i'"
#docker run -w /shared/hxmath -it --rm -v /shared:/shared --name=haxe_js_"$i" mboussaa/haxe /bin/bash -c "./run_js.sh '$i'"
#echo "docker run -w /shared/hxmath -it --rm -v /shared:/shared --name=haxe_run mboussaa/haxe /bin/bash -c "./run_c++.sh "$i"""
#docker run -w /shared/hxmath -it --rm -v /shared:/shared --name=haxe_cpp_"$i" mboussaa/haxe /bin/bash -c "./run_c++.sh '$i'"
#docker run -w /shared/hxmath -it --rm -v /shared:/shared --name=haxe_cs_"$i" mboussaa/haxe /bin/bash -c "./run_cs.sh '$i'"
#done 

