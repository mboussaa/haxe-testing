<?php

// Generated by Haxe 3.3.0
class haxe_Utf8 {
	public function __construct(){}
	static function charCodeAt($s, $index) {
		$tmp = haxe_Utf8::sub($s, $index, 1);
		return haxe_Utf8::uord($tmp);
	}
	static function uord($s) {
		$c = unpack('N', mb_convert_encoding($s, 'UCS-4BE', 'UTF-8'));
		return $c[1];
	}
	static function length($s) {
		return mb_strlen($s, "UTF-8");
	}
	static function compare($a, $b) {
		return strcmp($a, $b);
	}
	static function sub($s, $pos, $len) {
		return mb_substr($s, $pos, $len, "UTF-8");
	}
	function __toString() { return 'haxe.Utf8'; }
}
