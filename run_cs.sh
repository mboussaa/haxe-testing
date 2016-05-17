for (( i=1; i<="$3"; i++ ))
do
mono "$1"/target/cs/ts"$2"/bin/TS"$2".exe
done
