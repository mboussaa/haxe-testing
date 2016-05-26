<?php

// Generated by Haxe 3.3.0
class Math {
	public function __construct(){}
	static $PI;
	static $NaN;
	static $POSITIVE_INFINITY;
	static $NEGATIVE_INFINITY;
	static function abs($v) {
		return abs($v);
	}
	static function log($v) {
		return log($v);
	}
	static function sqrt($v) {
		return sqrt($v);
	}
	static function round($v) {
		return (int) floor($v + 0.5);
	}
	static function floor($v) {
		return (int) floor($v);
	}
	static function ceil($v) {
		return (int) ceil($v);
	}
	static function pow($v, $exp) {
		return pow($v, $exp);
	}
	static function random() {
		$tmp = mt_rand();
		$tmp1 = mt_getrandmax();
		return $tmp / $tmp1;
	}
	static function isNaN($f) {
		return is_nan($f);
	}
	static function isFinite($f) {
		return is_finite($f);
	}
	static function fround($v) {
		return floor($v + 0.5);
	}
	static function ffloor($v) {
		return floor($v);
	}
	static function fceil($v) {
		return ceil($v);
	}
	function __toString() { return 'Math'; }
}
{
	Math::$PI = M_PI;
	Math::$NaN = acos(1.01);
	Math::$NEGATIVE_INFINITY = log(0);
	Math::$POSITIVE_INFINITY = -Math::$NEGATIVE_INFINITY;
}
