<?php

// Generated by Haxe 3.3.0
class thx_Functions3 {
	public function __construct(){}
	static function memoize($callback, $resolver = null) {
		if(null === $resolver) {
			$resolver = array(new _hx_lambda(array(), "thx_Functions3_0"), 'execute');
		}
		$map = new haxe_ds_StringMap();
		return array(new _hx_lambda(array(&$callback, &$map, &$resolver), "thx_Functions3_1"), 'execute');
	}
	static function negate($callback) {
		return array(new _hx_lambda(array(&$callback), "thx_Functions3_2"), 'execute');
	}
	static function curry($f) {
		return array(new _hx_lambda(array(&$f), "thx_Functions3_3"), 'execute');
	}
	function __toString() { return 'thx.Functions3'; }
}
function thx_Functions3_0($v1, $v2, $v3) {
	{
		$tmp = Std::string($v1);
		$tmp1 = "" . _hx_string_or_null($tmp) . ":";
		$tmp2 = Std::string($v2);
		$tmp3 = _hx_string_or_null($tmp1) . _hx_string_or_null($tmp2) . ":";
		$tmp4 = Std::string($v3);
		return _hx_string_or_null($tmp3) . _hx_string_or_null($tmp4);
	}
}
function thx_Functions3_1(&$callback, &$map, &$resolver, $v11, $v21, $v31) {
	{
		$key = call_user_func_array($resolver, array($v11, $v21, $v31));
		$tmp5 = $map->exists($key);
		if($tmp5) {
			return $map->get($key);
		}
		$result = call_user_func_array($callback, array($v11, $v21, $v31));
		$map->set($key, $result);
		return $result;
	}
}
function thx_Functions3_2(&$callback, $v1, $v2, $v3) {
	{
		return !call_user_func_array($callback, array($v1, $v2, $v3));
	}
}
function thx_Functions3_3(&$f, $a, $b) {
	{
		return array(new _hx_lambda(array(&$a, &$b, &$f), "thx_Functions3_4"), 'execute');
	}
}
function thx_Functions3_4(&$a, &$b, &$f, $c) {
	{
		return call_user_func_array($f, array($a, $b, $c));
	}
}
