<?php

// Generated by Haxe 3.3.0
class thx_Options {
	public function __construct(){}
	static function ofValue($value) {
		if(null === $value) {
			return haxe_ds_Option::$None;
		} else {
			return haxe_ds_Option::Some($value);
		}
	}
	static function maybe($value) {
		if(null === $value) {
			return haxe_ds_Option::$None;
		} else {
			return haxe_ds_Option::Some($value);
		}
	}
	static function equals($a, $b, $eq = null) {
		$tmp = $a->index;
		switch($tmp) {
		case 0:{
			$tmp1 = $b->index === 0;
			if($tmp1) {
				$a1 = _hx_deref($a)->params[0];
				$b1 = _hx_deref($b)->params[0];
				$tmp2 = null === $eq;
				if($tmp2) {
					$eq = array(new _hx_lambda(array(), "thx_Options_0"), 'execute');
				}
				return call_user_func_array($eq, array($a1, $b1));
			} else {
				return false;
			}
		}break;
		case 1:{
			if($b->index === 1) {
				return true;
			} else {
				return false;
			}
		}break;
		}
	}
	static function equalsValue($a, $b, $eq = null) {
		$tmp = null;
		if(null === $b) {
			$tmp = haxe_ds_Option::$None;
		} else {
			$tmp = haxe_ds_Option::Some($b);
		}
		return thx_Options::equals($a, $tmp, $eq);
	}
	static function map($option, $callback) {
		$tmp = $option->index;
		switch($tmp) {
		case 0:{
			$tmp1 = call_user_func_array($callback, array(_hx_deref($option)->params[0]));
			return haxe_ds_Option::Some($tmp1);
		}break;
		case 1:{
			return haxe_ds_Option::$None;
		}break;
		}
	}
	static function ap($option, $fopt) {
		$tmp = $option->index;
		switch($tmp) {
		case 0:{
			$v = _hx_deref($option)->params[0];
			return thx_Options::map($fopt, array(new _hx_lambda(array(&$v), "thx_Options_1"), 'execute'));
		}break;
		case 1:{
			return haxe_ds_Option::$None;
		}break;
		}
	}
	static function flatMap($option, $callback) {
		$tmp = $option->index;
		switch($tmp) {
		case 0:{
			return call_user_func_array($callback, array(_hx_deref($option)->params[0]));
		}break;
		case 1:{
			return haxe_ds_Option::$None;
		}break;
		}
	}
	static function join($option) {
		switch($option->index) {
		case 0:{
			return _hx_deref($option)->params[0];
		}break;
		case 1:{
			return haxe_ds_Option::$None;
		}break;
		}
	}
	static function cata($option, $ifNone, $f) {
		$tmp = $option->index;
		switch($tmp) {
		case 0:{
			return call_user_func_array($f, array(_hx_deref($option)->params[0]));
		}break;
		case 1:{
			return $ifNone;
		}break;
		}
	}
	static function foldLeft($option, $b, $f) {
		$tmp = $option->index;
		switch($tmp) {
		case 0:{
			return call_user_func_array($f, array($b, _hx_deref($option)->params[0]));
		}break;
		case 1:{
			return $b;
		}break;
		}
	}
	static function foldMap($option, $f, $m) {
		$tmp = thx_Options::map($option, $f);
		$tmp1 = thx__Monoid_Monoid_Impl_::get_zero($m);
		$_e = $m;
		$tmp2 = array(new _hx_lambda(array(&$_e), "thx_Options_2"), 'execute');
		return thx_Options::foldLeft($tmp, $tmp1, $tmp2);
	}
	static function filter($option, $f) {
		$tmp = $option->index === 0;
		if($tmp) {
			$tmp1 = call_user_func_array($f, array(_hx_deref($option)->params[0]));
			if($tmp1) {
				return $option;
			} else {
				return haxe_ds_Option::$None;
			}
		} else {
			return haxe_ds_Option::$None;
		}
	}
	static function toArray($option) {
		switch($option->index) {
		case 0:{
			return (new _hx_array(array(_hx_deref($option)->params[0])));
		}break;
		case 1:{
			return (new _hx_array(array()));
		}break;
		}
	}
	static function toBool($option) {
		switch($option->index) {
		case 0:{
			return true;
		}break;
		case 1:{
			return false;
		}break;
		}
	}
	static function isNone($option) {
		return !thx_Options::toBool($option);
	}
	static function toOption($value) {
		if(null === $value) {
			return haxe_ds_Option::$None;
		} else {
			return haxe_ds_Option::Some($value);
		}
	}
	static function get($option) {
		switch($option->index) {
		case 0:{
			return _hx_deref($option)->params[0];
		}break;
		case 1:{
			return null;
		}break;
		}
	}
	static function getOrElse($option, $alt) {
		switch($option->index) {
		case 0:{
			return _hx_deref($option)->params[0];
		}break;
		case 1:{
			return $alt;
		}break;
		}
	}
	static function orElse($option, $alt) {
		switch($option->index) {
		case 0:{
			return $option;
		}break;
		case 1:{
			return $alt;
		}break;
		}
	}
	static function all($option, $f) {
		$tmp = $option->index;
		switch($tmp) {
		case 0:{
			return call_user_func_array($f, array(_hx_deref($option)->params[0]));
		}break;
		case 1:{
			return true;
		}break;
		}
	}
	static function any($option, $f) {
		$tmp = $option->index;
		switch($tmp) {
		case 0:{
			return call_user_func_array($f, array(_hx_deref($option)->params[0]));
		}break;
		case 1:{
			return false;
		}break;
		}
	}
	static function traverseValidation($option, $f) {
		$tmp = $option->index;
		switch($tmp) {
		case 0:{
			$this1 = call_user_func_array($f, array(_hx_deref($option)->params[0]));
			$tmp1 = thx_Either::Right(array(new _hx_lambda(array(), "thx_Options_3"), 'execute'));
			return thx__Validation_Validation_Impl_::ap($this1, $tmp1, array(new _hx_lambda(array(), "thx_Options_4"), 'execute'));
		}break;
		case 1:{
			return thx_Either::Right(haxe_ds_Option::$None);
		}break;
		}
	}
	static function toSuccess($option, $error) {
		$tmp = $option->index;
		switch($tmp) {
		case 0:{
			return thx_Either::Right(_hx_deref($option)->params[0]);
		}break;
		case 1:{
			return thx_Either::Left($error);
		}break;
		}
	}
	static function toSuccessNel($option, $error) {
		$tmp = $option->index;
		switch($tmp) {
		case 0:{
			return thx_Either::Right(_hx_deref($option)->params[0]);
		}break;
		case 1:{
			$tmp1 = thx__Nel_Nel_Impl_::pure($error);
			return thx_Either::Left($tmp1);
		}break;
		}
	}
	static function toFailure($error, $value) {
		$tmp = $error->index;
		switch($tmp) {
		case 0:{
			return thx_Either::Left(_hx_deref($error)->params[0]);
		}break;
		case 1:{
			return thx_Either::Right($value);
		}break;
		}
	}
	static function toFailureNel($error, $value) {
		$tmp = $error->index;
		switch($tmp) {
		case 0:{
			$tmp1 = thx__Nel_Nel_Impl_::pure(_hx_deref($error)->params[0]);
			return thx_Either::Left($tmp1);
		}break;
		case 1:{
			return thx_Either::Right($value);
		}break;
		}
	}
	static function ap2($f, $v1, $v2) {
		$tmp = thx_Functions2::curry($f);
		$tmp1 = thx_Options::map($v1, $tmp);
		return thx_Options::ap($v2, $tmp1);
	}
	static function ap3($f, $v1, $v2, $v3) {
		$f1 = $f;
		$tmp = array(new _hx_lambda(array(&$f1), "thx_Options_5"), 'execute');
		$tmp1 = thx_Functions2::curry($tmp);
		$tmp2 = thx_Options::map($v1, $tmp1);
		$tmp3 = thx_Options::ap($v2, $tmp2);
		return thx_Options::ap($v3, $tmp3);
	}
	static function ap4($f, $v1, $v2, $v3, $v4) {
		$f1 = $f;
		$f2 = array(new _hx_lambda(array(&$f1), "thx_Options_6"), 'execute');
		$tmp = array(new _hx_lambda(array(&$f2), "thx_Options_7"), 'execute');
		$tmp1 = thx_Functions2::curry($tmp);
		$tmp2 = thx_Options::map($v1, $tmp1);
		$tmp3 = thx_Options::ap($v2, $tmp2);
		$tmp4 = thx_Options::ap($v3, $tmp3);
		return thx_Options::ap($v4, $tmp4);
	}
	static function ap5($f, $v1, $v2, $v3, $v4, $v5) {
		$f1 = $f;
		$f2 = array(new _hx_lambda(array(&$f1), "thx_Options_8"), 'execute');
		$f3 = array(new _hx_lambda(array(&$f2), "thx_Options_9"), 'execute');
		$tmp = array(new _hx_lambda(array(&$f3), "thx_Options_10"), 'execute');
		$tmp1 = thx_Functions2::curry($tmp);
		$tmp2 = thx_Options::map($v1, $tmp1);
		$tmp3 = thx_Options::ap($v2, $tmp2);
		$tmp4 = thx_Options::ap($v3, $tmp3);
		$tmp5 = thx_Options::ap($v4, $tmp4);
		return thx_Options::ap($v5, $tmp5);
	}
	static function ap6($f, $v1, $v2, $v3, $v4, $v5, $v6) {
		$f1 = $f;
		$f2 = array(new _hx_lambda(array(&$f1), "thx_Options_11"), 'execute');
		$f3 = array(new _hx_lambda(array(&$f2), "thx_Options_12"), 'execute');
		$f4 = array(new _hx_lambda(array(&$f3), "thx_Options_13"), 'execute');
		$tmp = array(new _hx_lambda(array(&$f4), "thx_Options_14"), 'execute');
		$tmp1 = thx_Functions2::curry($tmp);
		$tmp2 = thx_Options::map($v1, $tmp1);
		$tmp3 = thx_Options::ap($v2, $tmp2);
		$tmp4 = thx_Options::ap($v3, $tmp3);
		$tmp5 = thx_Options::ap($v4, $tmp4);
		$tmp6 = thx_Options::ap($v5, $tmp5);
		return thx_Options::ap($v6, $tmp6);
	}
	static function ap7($f, $v1, $v2, $v3, $v4, $v5, $v6, $v7) {
		$f1 = $f;
		$f2 = array(new _hx_lambda(array(&$f1), "thx_Options_15"), 'execute');
		$f3 = array(new _hx_lambda(array(&$f2), "thx_Options_16"), 'execute');
		$f4 = array(new _hx_lambda(array(&$f3), "thx_Options_17"), 'execute');
		$f5 = array(new _hx_lambda(array(&$f4), "thx_Options_18"), 'execute');
		$tmp = array(new _hx_lambda(array(&$f5), "thx_Options_19"), 'execute');
		$tmp1 = thx_Functions2::curry($tmp);
		$tmp2 = thx_Options::map($v1, $tmp1);
		$tmp3 = thx_Options::ap($v2, $tmp2);
		$tmp4 = thx_Options::ap($v3, $tmp3);
		$tmp5 = thx_Options::ap($v4, $tmp4);
		$tmp6 = thx_Options::ap($v5, $tmp5);
		$tmp7 = thx_Options::ap($v6, $tmp6);
		return thx_Options::ap($v7, $tmp7);
	}
	static function ap8($f, $v1, $v2, $v3, $v4, $v5, $v6, $v7, $v8) {
		$f1 = $f;
		$f2 = array(new _hx_lambda(array(&$f1), "thx_Options_20"), 'execute');
		$f3 = array(new _hx_lambda(array(&$f2), "thx_Options_21"), 'execute');
		$f4 = array(new _hx_lambda(array(&$f3), "thx_Options_22"), 'execute');
		$f5 = array(new _hx_lambda(array(&$f4), "thx_Options_23"), 'execute');
		$f6 = array(new _hx_lambda(array(&$f5), "thx_Options_24"), 'execute');
		$tmp = array(new _hx_lambda(array(&$f6), "thx_Options_25"), 'execute');
		$tmp1 = thx_Functions2::curry($tmp);
		$tmp2 = thx_Options::map($v1, $tmp1);
		$tmp3 = thx_Options::ap($v2, $tmp2);
		$tmp4 = thx_Options::ap($v3, $tmp3);
		$tmp5 = thx_Options::ap($v4, $tmp4);
		$tmp6 = thx_Options::ap($v5, $tmp5);
		$tmp7 = thx_Options::ap($v6, $tmp6);
		$tmp8 = thx_Options::ap($v7, $tmp7);
		return thx_Options::ap($v8, $tmp8);
	}
	function __toString() { return 'thx.Options'; }
}
function thx_Options_0($a2, $b2) {
	{
		return (is_object($_t = $a2) && ($_t instanceof Enum) ? $_t == $b2 : _hx_equal($_t, $b2));
	}
}
function thx_Options_1(&$v, $f) {
	{
		return call_user_func_array($f, array($v));
	}
}
function thx_Options_2(&$_e, $a0, $a1) {
	{
		return thx__Monoid_Monoid_Impl_::append($_e, $a0, $a1);
	}
}
function thx_Options_3($v) {
	{
		return haxe_ds_Option::Some($v);
	}
}
function thx_Options_4($e1, $e2) {
	{
		throw new HException("Unreachable");
	}
}
function thx_Options_5(&$f1, $a, $b) {
	{
		return array(new _hx_lambda(array(&$a, &$b, &$f1), "thx_Options_26"), 'execute');
	}
}
function thx_Options_6(&$f1, $a, $b, $c) {
	{
		return array(new _hx_lambda(array(&$a, &$b, &$c, &$f1), "thx_Options_27"), 'execute');
	}
}
function thx_Options_7(&$f2, $a1, $b1) {
	{
		return array(new _hx_lambda(array(&$a1, &$b1, &$f2), "thx_Options_28"), 'execute');
	}
}
function thx_Options_8(&$f1, $a, $b, $c, $d) {
	{
		return array(new _hx_lambda(array(&$a, &$b, &$c, &$d, &$f1), "thx_Options_29"), 'execute');
	}
}
function thx_Options_9(&$f2, $a1, $b1, $c1) {
	{
		return array(new _hx_lambda(array(&$a1, &$b1, &$c1, &$f2), "thx_Options_30"), 'execute');
	}
}
function thx_Options_10(&$f3, $a2, $b2) {
	{
		return array(new _hx_lambda(array(&$a2, &$b2, &$f3), "thx_Options_31"), 'execute');
	}
}
function thx_Options_11(&$f1, $a, $b, $c, $d, $e) {
	{
		return array(new _hx_lambda(array(&$a, &$b, &$c, &$d, &$e, &$f1), "thx_Options_32"), 'execute');
	}
}
function thx_Options_12(&$f2, $a1, $b1, $c1, $d1) {
	{
		return array(new _hx_lambda(array(&$a1, &$b1, &$c1, &$d1, &$f2), "thx_Options_33"), 'execute');
	}
}
function thx_Options_13(&$f3, $a2, $b2, $c2) {
	{
		return array(new _hx_lambda(array(&$a2, &$b2, &$c2, &$f3), "thx_Options_34"), 'execute');
	}
}
function thx_Options_14(&$f4, $a3, $b3) {
	{
		return array(new _hx_lambda(array(&$a3, &$b3, &$f4), "thx_Options_35"), 'execute');
	}
}
function thx_Options_15(&$f1, $a, $b, $c, $d, $e, $f0) {
	{
		return array(new _hx_lambda(array(&$a, &$b, &$c, &$d, &$e, &$f0, &$f1), "thx_Options_36"), 'execute');
	}
}
function thx_Options_16(&$f2, $a1, $b1, $c1, $d1, $e1) {
	{
		return array(new _hx_lambda(array(&$a1, &$b1, &$c1, &$d1, &$e1, &$f2), "thx_Options_37"), 'execute');
	}
}
function thx_Options_17(&$f3, $a2, $b2, $c2, $d2) {
	{
		return array(new _hx_lambda(array(&$a2, &$b2, &$c2, &$d2, &$f3), "thx_Options_38"), 'execute');
	}
}
function thx_Options_18(&$f4, $a3, $b3, $c3) {
	{
		return array(new _hx_lambda(array(&$a3, &$b3, &$c3, &$f4), "thx_Options_39"), 'execute');
	}
}
function thx_Options_19(&$f5, $a4, $b4) {
	{
		return array(new _hx_lambda(array(&$a4, &$b4, &$f5), "thx_Options_40"), 'execute');
	}
}
function thx_Options_20(&$f1, $a, $b, $c, $d, $e, $f0, $g) {
	{
		return array(new _hx_lambda(array(&$a, &$b, &$c, &$d, &$e, &$f0, &$f1, &$g), "thx_Options_41"), 'execute');
	}
}
function thx_Options_21(&$f2, $a1, $b1, $c1, $d1, $e1, $f01) {
	{
		return array(new _hx_lambda(array(&$a1, &$b1, &$c1, &$d1, &$e1, &$f01, &$f2), "thx_Options_42"), 'execute');
	}
}
function thx_Options_22(&$f3, $a2, $b2, $c2, $d2, $e2) {
	{
		return array(new _hx_lambda(array(&$a2, &$b2, &$c2, &$d2, &$e2, &$f3), "thx_Options_43"), 'execute');
	}
}
function thx_Options_23(&$f4, $a3, $b3, $c3, $d3) {
	{
		return array(new _hx_lambda(array(&$a3, &$b3, &$c3, &$d3, &$f4), "thx_Options_44"), 'execute');
	}
}
function thx_Options_24(&$f5, $a4, $b4, $c4) {
	{
		return array(new _hx_lambda(array(&$a4, &$b4, &$c4, &$f5), "thx_Options_45"), 'execute');
	}
}
function thx_Options_25(&$f6, $a5, $b5) {
	{
		return array(new _hx_lambda(array(&$a5, &$b5, &$f6), "thx_Options_46"), 'execute');
	}
}
function thx_Options_26(&$a, &$b, &$f1, $c) {
	{
		return call_user_func_array($f1, array($a, $b, $c));
	}
}
function thx_Options_27(&$a, &$b, &$c, &$f1, $d) {
	{
		return call_user_func_array($f1, array($a, $b, $c, $d));
	}
}
function thx_Options_28(&$a1, &$b1, &$f2, $c1) {
	{
		return call_user_func_array($f2, array($a1, $b1, $c1));
	}
}
function thx_Options_29(&$a, &$b, &$c, &$d, &$f1, $e) {
	{
		return call_user_func_array($f1, array($a, $b, $c, $d, $e));
	}
}
function thx_Options_30(&$a1, &$b1, &$c1, &$f2, $d1) {
	{
		return call_user_func_array($f2, array($a1, $b1, $c1, $d1));
	}
}
function thx_Options_31(&$a2, &$b2, &$f3, $c2) {
	{
		return call_user_func_array($f3, array($a2, $b2, $c2));
	}
}
function thx_Options_32(&$a, &$b, &$c, &$d, &$e, &$f1, $f0) {
	{
		return call_user_func_array($f1, array($a, $b, $c, $d, $e, $f0));
	}
}
function thx_Options_33(&$a1, &$b1, &$c1, &$d1, &$f2, $e1) {
	{
		return call_user_func_array($f2, array($a1, $b1, $c1, $d1, $e1));
	}
}
function thx_Options_34(&$a2, &$b2, &$c2, &$f3, $d2) {
	{
		return call_user_func_array($f3, array($a2, $b2, $c2, $d2));
	}
}
function thx_Options_35(&$a3, &$b3, &$f4, $c3) {
	{
		return call_user_func_array($f4, array($a3, $b3, $c3));
	}
}
function thx_Options_36(&$a, &$b, &$c, &$d, &$e, &$f0, &$f1, $g) {
	{
		return call_user_func_array($f1, array($a, $b, $c, $d, $e, $f0, $g));
	}
}
function thx_Options_37(&$a1, &$b1, &$c1, &$d1, &$e1, &$f2, $f01) {
	{
		return call_user_func_array($f2, array($a1, $b1, $c1, $d1, $e1, $f01));
	}
}
function thx_Options_38(&$a2, &$b2, &$c2, &$d2, &$f3, $e2) {
	{
		return call_user_func_array($f3, array($a2, $b2, $c2, $d2, $e2));
	}
}
function thx_Options_39(&$a3, &$b3, &$c3, &$f4, $d3) {
	{
		return call_user_func_array($f4, array($a3, $b3, $c3, $d3));
	}
}
function thx_Options_40(&$a4, &$b4, &$f5, $c4) {
	{
		return call_user_func_array($f5, array($a4, $b4, $c4));
	}
}
function thx_Options_41(&$a, &$b, &$c, &$d, &$e, &$f0, &$f1, &$g, $h) {
	{
		return call_user_func_array($f1, array($a, $b, $c, $d, $e, $f0, $g, $h));
	}
}
function thx_Options_42(&$a1, &$b1, &$c1, &$d1, &$e1, &$f01, &$f2, $g1) {
	{
		return call_user_func_array($f2, array($a1, $b1, $c1, $d1, $e1, $f01, $g1));
	}
}
function thx_Options_43(&$a2, &$b2, &$c2, &$d2, &$e2, &$f3, $f02) {
	{
		return call_user_func_array($f3, array($a2, $b2, $c2, $d2, $e2, $f02));
	}
}
function thx_Options_44(&$a3, &$b3, &$c3, &$d3, &$f4, $e3) {
	{
		return call_user_func_array($f4, array($a3, $b3, $c3, $d3, $e3));
	}
}
function thx_Options_45(&$a4, &$b4, &$c4, &$f5, $d4) {
	{
		return call_user_func_array($f5, array($a4, $b4, $c4, $d4));
	}
}
function thx_Options_46(&$a5, &$b5, &$f6, $c5) {
	{
		return call_user_func_array($f6, array($a5, $b5, $c5));
	}
}
