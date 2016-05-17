for (( i=1; i<="$3"; i++ ))
do
java -jar "$1"/target/java/ts"$2"/TS"$2".jar
done
