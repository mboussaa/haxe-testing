#/bin/bash
#
# delete peviously compiled generated code
echo "delete peviously compiled generated code"
rm -rf /shared/hxmath/target/*

for (( i=1; i<=7; i++ ))
do

haxe -cp . -main test/TS"$i".hx -lib nanotest -cpp target/cpp/ts"$i" 
haxe -cp . -main test/TS"$i".hx -lib nanotest -java target/java/ts"$i" 
haxe -cp . -main test/TS"$i".hx -lib nanotest -cs target/cs/ts"$i" 
haxe -cp . -main test/TS"$i".hx -lib nanotest -php target/php/ts"$i" 
haxe -cp . -main test/TS"$i".hx -lib nanotest -lib hxnodejs -js target/js/ts"$i"/TS"$i".js
done

