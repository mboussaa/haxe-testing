
#--java
if [ $1 = "java" ] 
then
java -jar "$2"/target/java/ts"$3"/TS"$3".jar "$4"
fi

#--js
if [ $1 = "js" ]
then
/usr/bin/X11/node "$2"/target/js/ts"$3"/ts"$3".js "$4"
fi

#--c++
if [ $1 = "cpp" ]
then
 "$2"/target/cpp/ts"$3"/TS"$3" "$4"
fi

#--cs
if [ $1 = "cs" ]
then
mono "$2"/target/cs/ts"$3"/bin/TS"$3".exe "$4"
fi

#--php
if [ $1 = "php" ]
then
php "$2"/target/php/ts"$3"/index.php "$4"
fi

