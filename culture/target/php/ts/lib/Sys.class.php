<?php

// Generated by Haxe 3.3.0
class Sys {
	public function __construct(){}
	static function hexit($code) {
		exit($code);
	}
	static function time() {
		return microtime(true);
	}
	static function cpuTime() {
		$tmp = microtime(true);
		$tmp1 = $_SERVER['REQUEST_TIME'];
		return $tmp - $tmp1;
	}
	function __toString() { return 'Sys'; }
}
