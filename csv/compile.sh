for (( i=1; i<=1; i++ ))
do

haxe -cp src -cp test -main TS"$i".hx -lib thx.csv -lib thx.core -lib utest -lib nanotest -cpp target/cpp/ts"$i"
haxe -cp src -cp test -main TS"$i".hx -lib thx.csv -lib thx.core -lib utest -lib nanotest -java target/java/ts"$i"
haxe -cp src -cp test -main TS"$i".hx -lib thx.csv -lib thx.core -lib utest -lib nanotest -cs target/cs/ts"$i"
haxe -cp src -cp test -main TS"$i".hx -lib thx.csv -lib thx.core -lib utest -lib nanotest -php target/php/ts"$i"
haxe -cp src -cp test -main TS"$i".hx -lib thx.csv -lib hxnodejs -lib thx.core -lib utest -lib nanotest -js target/js/ts"$i"/ts"$i".js

done
