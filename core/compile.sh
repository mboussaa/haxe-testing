for (( i=4; i<=4; i++ ))
do

#haxe -cp src -cp test -main TS"$i".hx -lib thx.core -lib utest -lib nanotest -cpp target/cpp/ts"$i"
#haxe -cp src -cp test -main TS"$i".hx -lib thx.core -lib utest -lib nanotest -java target/java/ts"$i"
#haxe -cp src -cp test -main TS"$i".hx -lib thx.core -lib utest -lib nanotest -cs target/cs/ts"$i"
haxe -cp src -cp test -main TS"$i".hx -lib utest -lib nanotest -php target/php/ts"$i"
haxe -cp src -cp test -main TS"$i".hx -lib hxnodejs -lib utest -lib nanotest -js target/js/ts"$i"/ts"$i".js

done
