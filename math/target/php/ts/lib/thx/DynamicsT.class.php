<?php

// Generated by Haxe 3.3.0
class thx_DynamicsT {
	public function __construct(){}
	static function isEmpty($o) {
		return Reflect::fields($o)->length === 0;
	}
	static function exists($o, $name) {
		return _hx_has_field($o, $name);
	}
	static function fields($o) {
		return Reflect::fields($o);
	}
	static function merge($to, $from, $replacef = null) {
		$tmp = null === $replacef;
		if($tmp) {
			$replacef = array(new _hx_lambda(array(), "thx_DynamicsT_0"), 'execute');
		}
		{
			$_g = 0;
			$_g1 = Reflect::fields($from);
			while($_g < $_g1->length) {
				$field1 = $_g1[$_g];
				++$_g;
				$newv1 = Reflect::field($from, $field1);
				$tmp1 = _hx_has_field($to, $field1);
				if($tmp1) {
					$tmp2 = Reflect::field($to, $field1);
					$value = call_user_func_array($replacef, array($field1, $tmp2, $newv1));
					$to->{$field1} = $value;
					unset($value,$tmp2);
				} else {
					$to->{$field1} = $newv1;
				}
				unset($tmp1,$newv1,$field1);
			}
		}
		return $to;
	}
	static function size($o) {
		return Reflect::fields($o)->length;
	}
	static function values($o) {
		return Reflect::fields($o)->map(array(new _hx_lambda(array(&$o), "thx_DynamicsT_1"), 'execute'));
	}
	static function tuples($o) {
		return Reflect::fields($o)->map(array(new _hx_lambda(array(&$o), "thx_DynamicsT_2"), 'execute'));
	}
	function __toString() { return 'thx.DynamicsT'; }
}
function thx_DynamicsT_0($field, $oldv, $newv) {
	{
		return $newv;
	}
}
function thx_DynamicsT_1(&$o, $key) {
	{
		return Reflect::field($o, $key);
	}
}
function thx_DynamicsT_2(&$o, $key) {
	{
		$_1 = Reflect::field($o, $key);
		return _hx_anonymous(array("_0" => $key, "_1" => $_1));
	}
}
