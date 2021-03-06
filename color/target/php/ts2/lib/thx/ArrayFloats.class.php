<?php

// Generated by Haxe 3.3.0
class thx_ArrayFloats {
	public function __construct(){}
	static function average($arr) {
		$tmp = thx_ArrayFloats::sum($arr);
		return $tmp / $arr->length;
	}
	static function compact($arr) {
		return $arr->filter(array(new _hx_lambda(array(), "thx_ArrayFloats_0"), 'execute'));
	}
	static function max($arr) {
		$tmp = thx_Arrays::maxBy($arr, (isset(thx_Floats::$order) ? thx_Floats::$order: array("thx_Floats", "order")));
		return thx_Options::get($tmp);
	}
	static function min($arr) {
		$tmp = thx_Arrays::minBy($arr, (isset(thx_Floats::$order) ? thx_Floats::$order: array("thx_Floats", "order")));
		return thx_Options::get($tmp);
	}
	static function resize($array, $length, $fill = null) {
		if($fill === null) {
			$fill = 0.0;
		}
		while($array->length < $length) {
			$array->push($fill);
		}
		$tmp = $array->length - $length;
		$array->splice($length, $tmp);
		return $array;
	}
	static function standardDeviation($array) {
		if($array->length < 2) {
			return 0.0;
		}
		$mean = thx_ArrayFloats::average($array);
		$tmp = thx_Arrays::reduce($array, array(new _hx_lambda(array(&$mean), "thx_ArrayFloats_1"), 'execute'), 0);
		$variance = $tmp / ($array->length - 1);
		return Math::sqrt($variance);
	}
	static function sum($arr) {
		return thx_Arrays::reduce($arr, array(new _hx_lambda(array(), "thx_ArrayFloats_2"), 'execute'), 0.0);
	}
	function __toString() { return 'thx.ArrayFloats'; }
}
function thx_ArrayFloats_0($v) {
	{
		if(null !== $v) {
			return Math::isFinite($v);
		} else {
			return false;
		}
	}
}
function thx_ArrayFloats_1(&$mean, $acc, $val) {
	{
		$tmp1 = Math::pow($val - $mean, 2);
		return $acc + $tmp1;
	}
}
function thx_ArrayFloats_2($tot, $v) {
	{
		return $tot + $v;
	}
}
