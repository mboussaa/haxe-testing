
# Tool for non-functional testing of Haxe code generators

Latest docker image: mboussaa/haxe https://hub.docker.com/r/mboussaa/haxe/

Library documentation: http://tbrosman.github.io/hxmath

## What it is
A docker image for non functional testing of Haxe code generators.

## Case study
Hxmath library 

http://tbrosman.github.io/hxmath

A 2D/3D math library for Haxe implemented using abstracts for maximum compatibility with existing libraries (specifically OpenFL).

## Target platforms
-Java

-C++

-C#

-Nodejs

-PHP

-Flash

-AS3

...

## Performance properties
-Execution time

-Compilation time

-Memory usage

-CPU time

...

## Performance properties
-google/cadvisor:0.19.3

-tatum/influxdb:0.8.8

-docker version 1.6

## How to use
1- install docker

2- docker pull mboussaa/haxe

3- cd /

3- git clone https://github.com/mboussaa/haxe-performance-testing.git

5- cd /shared/hxmath/ 

6- you can compile and run to a single platform For example:
```
haxe test_cpp.hxml
```
This will compile to cpp target and run binaries

----------------------------------------------------------------------------------------------
1- If you want to compile all test suites and haxe library to different target platforms.

For that, we have prepared a compilation script. Thus, you have to run the following command:
```
docker run -it -w /shared/ -v /shared:/shared --name=haxe mboussaa/haxe /bin/bash -c "./compileAll.sh"
```
4- Time to run some test cases to specific target platform
``` 
docker run -w /shared/hxmath -it -v /shared:/shared --name=haxe_run mboussaa/haxe /bin/bash -c "./run_java.sh 1"
```
In this example, we compile test suite number 1 with java target. Available testsuites range from 1 to 9. you can modify the target by using for example run_js.sh or run_cs.sh

## TODO
-Automatic test data generation

-set monitoring components for haxe

-gather non-functional properties

...



-
