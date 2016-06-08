for (( i=1; i<=2; i++ ))
do

haxe -cp src -cp test -main TS"$i".hx -lib utest -cpp target/cpp/ts"$i"
haxe -cp src -cp test -main TS"$i".hx -lib utest -java target/java/ts"$i"
haxe -cp src -cp test -main TS"$i".hx -lib utest -cs target/cs/ts"$i"
haxe -cp src -cp test -main TS"$i".hx -lib utest -php target/php/ts"$i"
haxe -cp src -cp test -main TS"$i".hx -lib hxnodejs -lib utest -js target/js/ts"$i"/ts"$i".js

done
