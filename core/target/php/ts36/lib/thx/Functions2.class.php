<?php

// Generated by Haxe 3.3.0
class thx_Functions2 {
	public function __construct(){}
	static function memoize($callback, $resolver = null) {
		if(null === $resolver) {
			$resolver = array(new _hx_lambda(array(), "thx_Functions2_0"), 'execute');
		}
		$map = new haxe_ds_StringMap();
		return array(new _hx_lambda(array(&$callback, &$map, &$resolver), "thx_Functions2_1"), 'execute');
	}
	static function curry($f) {
		return array(new _hx_lambda(array(&$f), "thx_Functions2_2"), 'execute');
	}
	static function negate($callback) {
		return array(new _hx_lambda(array(&$callback), "thx_Functions2_3"), 'execute');
	}
	function __toString() { return 'thx.Functions2'; }
}
function thx_Functions2_0($v1, $v2) {
	{
		$tmp = Std::string($v1);
		$tmp1 = "" . _hx_string_or_null($tmp) . ":";
		$tmp2 = Std::string($v2);
		return _hx_string_or_null($tmp1) . _hx_string_or_null($tmp2);
	}
}
function thx_Functions2_1(&$callback, &$map, &$resolver, $v11, $v21) {
	{
		$key = call_user_func_array($resolver, array($v11, $v21));
		$tmp3 = $map->exists($key);
		if($tmp3) {
			return $map->get($key);
		}
		$result = call_user_func_array($callback, array($v11, $v21));
		$map->set($key, $result);
		return $result;
	}
}
function thx_Functions2_2(&$f, $a) {
	{
		return array(new _hx_lambda(array(&$a, &$f), "thx_Functions2_4"), 'execute');
	}
}
function thx_Functions2_3(&$callback, $v1, $v2) {
	{
		return !call_user_func_array($callback, array($v1, $v2));
	}
}
function thx_Functions2_4(&$a, &$f, $b) {
	{
		return call_user_func_array($f, array($a, $b));
	}
}
