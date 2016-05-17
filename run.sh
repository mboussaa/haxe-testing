
#--java
if [ $1 = "java" ] 
then
for (( i=1; i<="$4"; i++ ))
do
java -jar "$2"/target/java/ts"$3"/TS"$3".jar
done
fi

#--js
if [ $1 = "js" ]
then
for (( i=1; i<="$4"; i++ ))
do
/usr/bin/X11/node "$2"/target/js/ts"$3"/TS"$3".js
done
fi

#--c++
if [ $1 = "cpp" ]
then
for (( i=1; i<="$4"; i++ ))
do
 "$2"/target/cpp/ts"$3"/TS"$3"
done
fi

#--cs
if [ $1 = "cs" ]
then
for (( i=1; i<="$4"; i++ ))
do
mono "$2"/target/cs/ts"$3"/bin/TS"$3".exe
done
fi

#--php
if [ $1 = "php" ]
then
for (( i=1; i<="$4"; i++ ))
do
php "$2"/target/php/ts"$3"/index.php
done
fi

