<?php

if(version_compare(PHP_VERSION, '5.1.0', '<')) {
    exit('Your current PHP version is: ' . PHP_VERSION . '. Haxe/PHP generates code for version 5.1.0 or later');
} else if(version_compare(PHP_VERSION, '5.4.0', '<')) {
	trigger_error('Your current PHP version is: ' . PHP_VERSION . '. Code generated by Haxe/PHP might not work for versions < 5.4.0', E_USER_WARNING);
}
;
require_once dirname(__FILE__).'/lib/php/Boot.class.php';

TS15::main();

?>