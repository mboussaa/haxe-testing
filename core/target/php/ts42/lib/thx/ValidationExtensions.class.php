<?php

// Generated by Haxe 3.3.0
class thx_ValidationExtensions {
	public function __construct(){}
	static function leftMapNel($n, $f) {
		return thx_Eithers::leftMap($n, array(new _hx_lambda(array(&$f), "thx_ValidationExtensions_0"), 'execute'));
	}
	static function ensureNel($v, $p, $error) {
		$tmp = $v->index === 1;
		if($tmp) {
			$a = _hx_deref($v)->params[0];
			$tmp1 = call_user_func_array($p, array($a));
			if($tmp1) {
				return $v;
			} else {
				$tmp2 = thx__Nel_Nel_Impl_::pure($error);
				return thx_Either::Left($tmp2);
			}
		} else {
			return $v;
		}
	}
	function __toString() { return 'thx.ValidationExtensions'; }
}
function thx_ValidationExtensions_0(&$f, $n1) {
	{
		return thx__Nel_Nel_Impl_::map($n1, $f);
	}
}