#/bin/bash
#
# delete peviously compiled generated code
#echo "delete peviously compiled generated code"
#rm -rf /shared/thx.color/target/*

for (( i=1; i<=19; i++ ))
do

haxe -cp src -cp test -main TS"$i".hx -lib thx.core -lib utest -lib nanotest -cpp target/cpp/ts"$i"
haxe -cp src -cp test -main TS"$i".hx -lib thx.core -lib utest -lib nanotest -java target/java/ts"$i"
haxe -cp src -cp test -main TS"$i".hx -lib thx.core -lib utest -lib nanotest -cs target/cs/ts"$i"
haxe -cp src -cp test -main TS"$i".hx -lib thx.core -lib utest -lib nanotest -php target/php/ts"$i"
haxe -cp src -cp test -main TS"$i".hx -lib hxnodejs -lib thx.core -lib utest -lib nanotest -js target/js/ts"$i"/ts"$i".js

done
#for (( i=1; i<=7; i++ ))
#do

#haxe -cp . -main test/TS"$i".hx -lib nanotest -cpp target/cpp/TS"$i" -D EXIT_ON_FINISH
#haxe -cp . -main test/TS"$i".hx -lib nanotest -java target/java/TS"$i" -debug -D HXJAVA_DEBUGGER -dce no -D EXIT_ON_FINISH
#haxe -cp . -main test/TS"$i".hx -lib nanotest -cs target/cs/TS"$i" -D EXIT_ON_FINISH
#haxe -cp . -main test/TS"$i".hx -lib nanotest -php target/php/TS"$i" -D EXIT_ON_FINISH
#haxe -cp . -main test/TS"$i".hx -lib nanotest -lib hxnodejs -js target/js/TS"$i"/TS"$i".js -debug -dce no -D EXIT_ON_FINISH

#done

#-cp src
#-cp test
#-lib thx.core
#-lib utest
#-lib nanotest
#-main TestAll
#-cpp target/cpp

