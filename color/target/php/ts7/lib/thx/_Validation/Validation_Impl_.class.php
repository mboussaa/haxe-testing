<?php

// Generated by Haxe 3.3.0
class thx__Validation_Validation_Impl_ {
	public function __construct(){}
	static function validation($e) {
		return $e;
	}
	static function vnel($e) {
		return $e;
	}
	static function pure($a) {
		return thx_Either::Right($a);
	}
	static function success($a) {
		return thx_Either::Right($a);
	}
	static function failure($e) {
		return thx_Either::Left($e);
	}
	static function nn($a, $e) {
		if($a === null) {
			return thx_Either::Left($e);
		} else {
			return thx_Either::Right($a);
		}
	}
	static function successNel($a) {
		return thx_Either::Right($a);
	}
	static function failureNel($e) {
		$tmp = thx__Nel_Nel_Impl_::pure($e);
		return thx_Either::Left($tmp);
	}
	static function nnNel($a, $e) {
		if($a === null) {
			$tmp = thx__Nel_Nel_Impl_::pure($e);
			return thx_Either::Left($tmp);
		} else {
			return thx_Either::Right($a);
		}
	}
	static function get_either($this1) {
		return $this1;
	}
	static function map($this1, $f) {
		$tmp = thx_Either::Right($f);
		return thx__Validation_Validation_Impl_::ap($this1, $tmp, array(new _hx_lambda(array(), "thx__Validation_Validation_Impl__0"), 'execute'));
	}
	static function foldLeft($this1, $b, $f) {
		$tmp = $this1->index;
		switch($tmp) {
		case 0:{
			return $b;
		}break;
		case 1:{
			return call_user_func_array($f, array($b, _hx_deref($this1)->params[0]));
		}break;
		}
	}
	static function foldMap($this1, $f, $m) {
		$tmp = thx_Eithers::map($this1, $f);
		$tmp1 = thx__Monoid_Monoid_Impl_::get_zero($m);
		$_e = $m;
		$tmp2 = array(new _hx_lambda(array(&$_e), "thx__Validation_Validation_Impl__1"), 'execute');
		return thx__Validation_Validation_Impl_::foldLeft($tmp, $tmp1, $tmp2);
	}
	static function ap($this1, $v, $s) {
		$tmp = $this1->index;
		switch($tmp) {
		case 0:{
			$e0 = _hx_deref($this1)->params[0];
			$_g = $v;
			$tmp1 = $_g->index;
			switch($tmp1) {
			case 0:{
				$tmp2 = call_user_func_array(thx__Semigroup_Semigroup_Impl_::get_append($s), array($e0, _hx_deref($_g)->params[0]));
				return thx_Either::Left($tmp2);
			}break;
			case 1:{
				return thx_Either::Left($e0);
			}break;
			}
		}break;
		case 1:{
			$a = _hx_deref($this1)->params[0];
			$_g1 = $v;
			$tmp3 = $_g1->index;
			switch($tmp3) {
			case 0:{
				return thx_Either::Left(_hx_deref($_g1)->params[0]);
			}break;
			case 1:{
				$tmp4 = _hx_deref($_g1)->params[0]($a);
				return thx_Either::Right($tmp4);
			}break;
			}
		}break;
		}
	}
	static function zip($this1, $v, $s) {
		return thx__Validation_Validation_Impl_::ap($this1, thx_Eithers::map($v, array(new _hx_lambda(array(), "thx__Validation_Validation_Impl__2"), 'execute')), $s);
	}
	static function leftMap($this1, $f) {
		return thx_Eithers::leftMap($this1, $f);
	}
	static function wrapNel($this1) {
		return thx_Eithers::leftMap($this1, (isset(thx__Nel_Nel_Impl_::$pure) ? thx__Nel_Nel_Impl_::$pure: array("thx__Nel_Nel_Impl_", "pure")));
	}
	static function ensure($this1, $p, $error) {
		$tmp = $this1->index === 1;
		if($tmp) {
			$tmp1 = call_user_func_array($p, array(_hx_deref($this1)->params[0]));
			if($tmp1) {
				return $this1;
			} else {
				return thx_Either::Left($error);
			}
		} else {
			return $this1;
		}
	}
	static function flatMapV($this1, $f) {
		$tmp = $this1->index;
		switch($tmp) {
		case 0:{
			return thx_Either::Left(_hx_deref($this1)->params[0]);
		}break;
		case 1:{
			return call_user_func_array($f, array(_hx_deref($this1)->params[0]));
		}break;
		}
	}
	static function val2($f, $v1, $v2, $s) {
		$f1 = thx_Functions2::curry($f);
		$tmp = thx_Either::Right($f1);
		$tmp1 = thx__Validation_Validation_Impl_::ap($v1, $tmp, array(new _hx_lambda(array(), "thx__Validation_Validation_Impl__3"), 'execute'));
		return thx__Validation_Validation_Impl_::ap($v2, $tmp1, $s);
	}
	static function val3($f, $v1, $v2, $v3, $s) {
		$f1 = $f;
		$tmp = array(new _hx_lambda(array(&$f1), "thx__Validation_Validation_Impl__4"), 'execute');
		$f2 = thx_Functions2::curry($tmp);
		$tmp1 = thx_Either::Right($f2);
		$tmp2 = thx__Validation_Validation_Impl_::ap($v1, $tmp1, array(new _hx_lambda(array(), "thx__Validation_Validation_Impl__5"), 'execute'));
		$tmp3 = thx__Validation_Validation_Impl_::ap($v2, $tmp2, $s);
		return thx__Validation_Validation_Impl_::ap($v3, $tmp3, $s);
	}
	static function val4($f, $v1, $v2, $v3, $v4, $s) {
		$f1 = $f;
		$f2 = array(new _hx_lambda(array(&$f1), "thx__Validation_Validation_Impl__6"), 'execute');
		$tmp = array(new _hx_lambda(array(&$f2), "thx__Validation_Validation_Impl__7"), 'execute');
		$f3 = thx_Functions2::curry($tmp);
		$tmp1 = thx_Either::Right($f3);
		$tmp2 = thx__Validation_Validation_Impl_::ap($v1, $tmp1, array(new _hx_lambda(array(), "thx__Validation_Validation_Impl__8"), 'execute'));
		$tmp3 = thx__Validation_Validation_Impl_::ap($v2, $tmp2, $s);
		$tmp4 = thx__Validation_Validation_Impl_::ap($v3, $tmp3, $s);
		return thx__Validation_Validation_Impl_::ap($v4, $tmp4, $s);
	}
	static function val5($f, $v1, $v2, $v3, $v4, $v5, $s) {
		$f1 = $f;
		$f2 = array(new _hx_lambda(array(&$f1), "thx__Validation_Validation_Impl__9"), 'execute');
		$f3 = array(new _hx_lambda(array(&$f2), "thx__Validation_Validation_Impl__10"), 'execute');
		$tmp = array(new _hx_lambda(array(&$f3), "thx__Validation_Validation_Impl__11"), 'execute');
		$f4 = thx_Functions2::curry($tmp);
		$tmp1 = thx_Either::Right($f4);
		$tmp2 = thx__Validation_Validation_Impl_::ap($v1, $tmp1, array(new _hx_lambda(array(), "thx__Validation_Validation_Impl__12"), 'execute'));
		$tmp3 = thx__Validation_Validation_Impl_::ap($v2, $tmp2, $s);
		$tmp4 = thx__Validation_Validation_Impl_::ap($v3, $tmp3, $s);
		$tmp5 = thx__Validation_Validation_Impl_::ap($v4, $tmp4, $s);
		return thx__Validation_Validation_Impl_::ap($v5, $tmp5, $s);
	}
	static function val6($f, $v1, $v2, $v3, $v4, $v5, $v6, $s) {
		$f1 = $f;
		$f2 = array(new _hx_lambda(array(&$f1), "thx__Validation_Validation_Impl__13"), 'execute');
		$f3 = array(new _hx_lambda(array(&$f2), "thx__Validation_Validation_Impl__14"), 'execute');
		$f4 = array(new _hx_lambda(array(&$f3), "thx__Validation_Validation_Impl__15"), 'execute');
		$tmp = array(new _hx_lambda(array(&$f4), "thx__Validation_Validation_Impl__16"), 'execute');
		$f5 = thx_Functions2::curry($tmp);
		$tmp1 = thx_Either::Right($f5);
		$tmp2 = thx__Validation_Validation_Impl_::ap($v1, $tmp1, array(new _hx_lambda(array(), "thx__Validation_Validation_Impl__17"), 'execute'));
		$tmp3 = thx__Validation_Validation_Impl_::ap($v2, $tmp2, $s);
		$tmp4 = thx__Validation_Validation_Impl_::ap($v3, $tmp3, $s);
		$tmp5 = thx__Validation_Validation_Impl_::ap($v4, $tmp4, $s);
		$tmp6 = thx__Validation_Validation_Impl_::ap($v5, $tmp5, $s);
		return thx__Validation_Validation_Impl_::ap($v6, $tmp6, $s);
	}
	static function val7($f, $v1, $v2, $v3, $v4, $v5, $v6, $v7, $s) {
		$f1 = $f;
		$f2 = array(new _hx_lambda(array(&$f1), "thx__Validation_Validation_Impl__18"), 'execute');
		$f3 = array(new _hx_lambda(array(&$f2), "thx__Validation_Validation_Impl__19"), 'execute');
		$f4 = array(new _hx_lambda(array(&$f3), "thx__Validation_Validation_Impl__20"), 'execute');
		$f5 = array(new _hx_lambda(array(&$f4), "thx__Validation_Validation_Impl__21"), 'execute');
		$tmp = array(new _hx_lambda(array(&$f5), "thx__Validation_Validation_Impl__22"), 'execute');
		$f6 = thx_Functions2::curry($tmp);
		$tmp1 = thx_Either::Right($f6);
		$tmp2 = thx__Validation_Validation_Impl_::ap($v1, $tmp1, array(new _hx_lambda(array(), "thx__Validation_Validation_Impl__23"), 'execute'));
		$tmp3 = thx__Validation_Validation_Impl_::ap($v2, $tmp2, $s);
		$tmp4 = thx__Validation_Validation_Impl_::ap($v3, $tmp3, $s);
		$tmp5 = thx__Validation_Validation_Impl_::ap($v4, $tmp4, $s);
		$tmp6 = thx__Validation_Validation_Impl_::ap($v5, $tmp5, $s);
		$tmp7 = thx__Validation_Validation_Impl_::ap($v6, $tmp6, $s);
		return thx__Validation_Validation_Impl_::ap($v7, $tmp7, $s);
	}
	static function val8($f, $v1, $v2, $v3, $v4, $v5, $v6, $v7, $v8, $s) {
		$f1 = $f;
		$f2 = array(new _hx_lambda(array(&$f1), "thx__Validation_Validation_Impl__24"), 'execute');
		$f3 = array(new _hx_lambda(array(&$f2), "thx__Validation_Validation_Impl__25"), 'execute');
		$f4 = array(new _hx_lambda(array(&$f3), "thx__Validation_Validation_Impl__26"), 'execute');
		$f5 = array(new _hx_lambda(array(&$f4), "thx__Validation_Validation_Impl__27"), 'execute');
		$f6 = array(new _hx_lambda(array(&$f5), "thx__Validation_Validation_Impl__28"), 'execute');
		$tmp = array(new _hx_lambda(array(&$f6), "thx__Validation_Validation_Impl__29"), 'execute');
		$f7 = thx_Functions2::curry($tmp);
		$tmp1 = thx_Either::Right($f7);
		$tmp2 = thx__Validation_Validation_Impl_::ap($v1, $tmp1, array(new _hx_lambda(array(), "thx__Validation_Validation_Impl__30"), 'execute'));
		$tmp3 = thx__Validation_Validation_Impl_::ap($v2, $tmp2, $s);
		$tmp4 = thx__Validation_Validation_Impl_::ap($v3, $tmp3, $s);
		$tmp5 = thx__Validation_Validation_Impl_::ap($v4, $tmp4, $s);
		$tmp6 = thx__Validation_Validation_Impl_::ap($v5, $tmp5, $s);
		$tmp7 = thx__Validation_Validation_Impl_::ap($v6, $tmp6, $s);
		$tmp8 = thx__Validation_Validation_Impl_::ap($v7, $tmp7, $s);
		return thx__Validation_Validation_Impl_::ap($v8, $tmp8, $s);
	}
	static $__properties__ = array("get_either" => "get_either");
	function __toString() { return 'thx._Validation.Validation_Impl_'; }
}
function thx__Validation_Validation_Impl__0($e1, $e2) {
	{
		throw new HException("Unreachable");
	}
}
function thx__Validation_Validation_Impl__1(&$_e, $a0, $a1) {
	{
		return thx__Monoid_Monoid_Impl_::append($_e, $a0, $a1);
	}
}
function thx__Validation_Validation_Impl__2($b) {
	{
		$_1 = $b;
		return array(new _hx_lambda(array(&$_1), "thx__Validation_Validation_Impl__31"), 'execute');
	}
}
function thx__Validation_Validation_Impl__3($e1, $e2) {
	{
		throw new HException("Unreachable");
	}
}
function thx__Validation_Validation_Impl__4(&$f1, $a, $b) {
	{
		return array(new _hx_lambda(array(&$a, &$b, &$f1), "thx__Validation_Validation_Impl__32"), 'execute');
	}
}
function thx__Validation_Validation_Impl__5($e1, $e2) {
	{
		throw new HException("Unreachable");
	}
}
function thx__Validation_Validation_Impl__6(&$f1, $a, $b, $c) {
	{
		return array(new _hx_lambda(array(&$a, &$b, &$c, &$f1), "thx__Validation_Validation_Impl__33"), 'execute');
	}
}
function thx__Validation_Validation_Impl__7(&$f2, $a1, $b1) {
	{
		return array(new _hx_lambda(array(&$a1, &$b1, &$f2), "thx__Validation_Validation_Impl__34"), 'execute');
	}
}
function thx__Validation_Validation_Impl__8($e1, $e2) {
	{
		throw new HException("Unreachable");
	}
}
function thx__Validation_Validation_Impl__9(&$f1, $a, $b, $c, $d) {
	{
		return array(new _hx_lambda(array(&$a, &$b, &$c, &$d, &$f1), "thx__Validation_Validation_Impl__35"), 'execute');
	}
}
function thx__Validation_Validation_Impl__10(&$f2, $a1, $b1, $c1) {
	{
		return array(new _hx_lambda(array(&$a1, &$b1, &$c1, &$f2), "thx__Validation_Validation_Impl__36"), 'execute');
	}
}
function thx__Validation_Validation_Impl__11(&$f3, $a2, $b2) {
	{
		return array(new _hx_lambda(array(&$a2, &$b2, &$f3), "thx__Validation_Validation_Impl__37"), 'execute');
	}
}
function thx__Validation_Validation_Impl__12($e1, $e2) {
	{
		throw new HException("Unreachable");
	}
}
function thx__Validation_Validation_Impl__13(&$f1, $a, $b, $c, $d, $e) {
	{
		return array(new _hx_lambda(array(&$a, &$b, &$c, &$d, &$e, &$f1), "thx__Validation_Validation_Impl__38"), 'execute');
	}
}
function thx__Validation_Validation_Impl__14(&$f2, $a1, $b1, $c1, $d1) {
	{
		return array(new _hx_lambda(array(&$a1, &$b1, &$c1, &$d1, &$f2), "thx__Validation_Validation_Impl__39"), 'execute');
	}
}
function thx__Validation_Validation_Impl__15(&$f3, $a2, $b2, $c2) {
	{
		return array(new _hx_lambda(array(&$a2, &$b2, &$c2, &$f3), "thx__Validation_Validation_Impl__40"), 'execute');
	}
}
function thx__Validation_Validation_Impl__16(&$f4, $a3, $b3) {
	{
		return array(new _hx_lambda(array(&$a3, &$b3, &$f4), "thx__Validation_Validation_Impl__41"), 'execute');
	}
}
function thx__Validation_Validation_Impl__17($e11, $e2) {
	{
		throw new HException("Unreachable");
	}
}
function thx__Validation_Validation_Impl__18(&$f1, $a, $b, $c, $d, $e, $f0) {
	{
		return array(new _hx_lambda(array(&$a, &$b, &$c, &$d, &$e, &$f0, &$f1), "thx__Validation_Validation_Impl__42"), 'execute');
	}
}
function thx__Validation_Validation_Impl__19(&$f2, $a1, $b1, $c1, $d1, $e1) {
	{
		return array(new _hx_lambda(array(&$a1, &$b1, &$c1, &$d1, &$e1, &$f2), "thx__Validation_Validation_Impl__43"), 'execute');
	}
}
function thx__Validation_Validation_Impl__20(&$f3, $a2, $b2, $c2, $d2) {
	{
		return array(new _hx_lambda(array(&$a2, &$b2, &$c2, &$d2, &$f3), "thx__Validation_Validation_Impl__44"), 'execute');
	}
}
function thx__Validation_Validation_Impl__21(&$f4, $a3, $b3, $c3) {
	{
		return array(new _hx_lambda(array(&$a3, &$b3, &$c3, &$f4), "thx__Validation_Validation_Impl__45"), 'execute');
	}
}
function thx__Validation_Validation_Impl__22(&$f5, $a4, $b4) {
	{
		return array(new _hx_lambda(array(&$a4, &$b4, &$f5), "thx__Validation_Validation_Impl__46"), 'execute');
	}
}
function thx__Validation_Validation_Impl__23($e11, $e21) {
	{
		throw new HException("Unreachable");
	}
}
function thx__Validation_Validation_Impl__24(&$f1, $a, $b, $c, $d, $e, $f0, $g) {
	{
		return array(new _hx_lambda(array(&$a, &$b, &$c, &$d, &$e, &$f0, &$f1, &$g), "thx__Validation_Validation_Impl__47"), 'execute');
	}
}
function thx__Validation_Validation_Impl__25(&$f2, $a1, $b1, $c1, $d1, $e1, $f01) {
	{
		return array(new _hx_lambda(array(&$a1, &$b1, &$c1, &$d1, &$e1, &$f01, &$f2), "thx__Validation_Validation_Impl__48"), 'execute');
	}
}
function thx__Validation_Validation_Impl__26(&$f3, $a2, $b2, $c2, $d2, $e2) {
	{
		return array(new _hx_lambda(array(&$a2, &$b2, &$c2, &$d2, &$e2, &$f3), "thx__Validation_Validation_Impl__49"), 'execute');
	}
}
function thx__Validation_Validation_Impl__27(&$f4, $a3, $b3, $c3, $d3) {
	{
		return array(new _hx_lambda(array(&$a3, &$b3, &$c3, &$d3, &$f4), "thx__Validation_Validation_Impl__50"), 'execute');
	}
}
function thx__Validation_Validation_Impl__28(&$f5, $a4, $b4, $c4) {
	{
		return array(new _hx_lambda(array(&$a4, &$b4, &$c4, &$f5), "thx__Validation_Validation_Impl__51"), 'execute');
	}
}
function thx__Validation_Validation_Impl__29(&$f6, $a5, $b5) {
	{
		return array(new _hx_lambda(array(&$a5, &$b5, &$f6), "thx__Validation_Validation_Impl__52"), 'execute');
	}
}
function thx__Validation_Validation_Impl__30($e11, $e21) {
	{
		throw new HException("Unreachable");
	}
}
function thx__Validation_Validation_Impl__31(&$_1, $_0) {
	{
		return thx__Tuple_Tuple2_Impl_::of($_0, $_1);
	}
}
function thx__Validation_Validation_Impl__32(&$a, &$b, &$f1, $c) {
	{
		return call_user_func_array($f1, array($a, $b, $c));
	}
}
function thx__Validation_Validation_Impl__33(&$a, &$b, &$c, &$f1, $d) {
	{
		return call_user_func_array($f1, array($a, $b, $c, $d));
	}
}
function thx__Validation_Validation_Impl__34(&$a1, &$b1, &$f2, $c1) {
	{
		return call_user_func_array($f2, array($a1, $b1, $c1));
	}
}
function thx__Validation_Validation_Impl__35(&$a, &$b, &$c, &$d, &$f1, $e) {
	{
		return call_user_func_array($f1, array($a, $b, $c, $d, $e));
	}
}
function thx__Validation_Validation_Impl__36(&$a1, &$b1, &$c1, &$f2, $d1) {
	{
		return call_user_func_array($f2, array($a1, $b1, $c1, $d1));
	}
}
function thx__Validation_Validation_Impl__37(&$a2, &$b2, &$f3, $c2) {
	{
		return call_user_func_array($f3, array($a2, $b2, $c2));
	}
}
function thx__Validation_Validation_Impl__38(&$a, &$b, &$c, &$d, &$e, &$f1, $f0) {
	{
		return call_user_func_array($f1, array($a, $b, $c, $d, $e, $f0));
	}
}
function thx__Validation_Validation_Impl__39(&$a1, &$b1, &$c1, &$d1, &$f2, $e1) {
	{
		return call_user_func_array($f2, array($a1, $b1, $c1, $d1, $e1));
	}
}
function thx__Validation_Validation_Impl__40(&$a2, &$b2, &$c2, &$f3, $d2) {
	{
		return call_user_func_array($f3, array($a2, $b2, $c2, $d2));
	}
}
function thx__Validation_Validation_Impl__41(&$a3, &$b3, &$f4, $c3) {
	{
		return call_user_func_array($f4, array($a3, $b3, $c3));
	}
}
function thx__Validation_Validation_Impl__42(&$a, &$b, &$c, &$d, &$e, &$f0, &$f1, $g) {
	{
		return call_user_func_array($f1, array($a, $b, $c, $d, $e, $f0, $g));
	}
}
function thx__Validation_Validation_Impl__43(&$a1, &$b1, &$c1, &$d1, &$e1, &$f2, $f01) {
	{
		return call_user_func_array($f2, array($a1, $b1, $c1, $d1, $e1, $f01));
	}
}
function thx__Validation_Validation_Impl__44(&$a2, &$b2, &$c2, &$d2, &$f3, $e2) {
	{
		return call_user_func_array($f3, array($a2, $b2, $c2, $d2, $e2));
	}
}
function thx__Validation_Validation_Impl__45(&$a3, &$b3, &$c3, &$f4, $d3) {
	{
		return call_user_func_array($f4, array($a3, $b3, $c3, $d3));
	}
}
function thx__Validation_Validation_Impl__46(&$a4, &$b4, &$f5, $c4) {
	{
		return call_user_func_array($f5, array($a4, $b4, $c4));
	}
}
function thx__Validation_Validation_Impl__47(&$a, &$b, &$c, &$d, &$e, &$f0, &$f1, &$g, $h) {
	{
		return call_user_func_array($f1, array($a, $b, $c, $d, $e, $f0, $g, $h));
	}
}
function thx__Validation_Validation_Impl__48(&$a1, &$b1, &$c1, &$d1, &$e1, &$f01, &$f2, $g1) {
	{
		return call_user_func_array($f2, array($a1, $b1, $c1, $d1, $e1, $f01, $g1));
	}
}
function thx__Validation_Validation_Impl__49(&$a2, &$b2, &$c2, &$d2, &$e2, &$f3, $f02) {
	{
		return call_user_func_array($f3, array($a2, $b2, $c2, $d2, $e2, $f02));
	}
}
function thx__Validation_Validation_Impl__50(&$a3, &$b3, &$c3, &$d3, &$f4, $e3) {
	{
		return call_user_func_array($f4, array($a3, $b3, $c3, $d3, $e3));
	}
}
function thx__Validation_Validation_Impl__51(&$a4, &$b4, &$c4, &$f5, $d4) {
	{
		return call_user_func_array($f5, array($a4, $b4, $c4, $d4));
	}
}
function thx__Validation_Validation_Impl__52(&$a5, &$b5, &$f6, $c5) {
	{
		return call_user_func_array($f6, array($a5, $b5, $c5));
	}
}