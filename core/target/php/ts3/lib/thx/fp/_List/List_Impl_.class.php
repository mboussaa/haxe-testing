<?php

// Generated by Haxe 3.3.0
class thx_fp__List_List_Impl_ {
	public function __construct(){}
	static function hempty() {
		return thx_fp_ListImpl::$Nil;
	}
	static function bin($x, $xs) {
		return thx_fp_ListImpl::Cons($x, $xs);
	}
	static function singleton($x) {
		return thx_fp_ListImpl::Cons($x, thx_fp_ListImpl::$Nil);
	}
	static function fromArray($arr) {
		$_e = $arr;
		$tmp = array(new _hx_lambda(array(&$_e), "thx_fp__List_List_Impl__0"), 'execute');
		return call_user_func_array($tmp, array(array(new _hx_lambda(array(), "thx_fp__List_List_Impl__1"), 'execute'), thx_fp__List_List_Impl_::hempty()));
	}
	static function foldLeft($this1, $b, $f) {
		$tmp = $this1->index;
		switch($tmp) {
		case 0:{
			return $b;
		}break;
		case 1:{
			$xs = _hx_deref($this1)->params[1];
			$tmp1 = call_user_func_array($f, array($b, _hx_deref($this1)->params[0]));
			return thx_fp__List_List_Impl_::foldLeft($xs, $tmp1, $f);
		}break;
		}
	}
	static function foldMap($this1, $f, $m) {
		$tmp = thx_fp__List_List_Impl_::map($this1, $f);
		$tmp1 = thx__Monoid_Monoid_Impl_::get_zero($m);
		$_e = $m;
		$tmp2 = array(new _hx_lambda(array(&$_e), "thx_fp__List_List_Impl__2"), 'execute');
		return thx_fp__List_List_Impl_::foldLeft($tmp, $tmp1, $tmp2);
	}
	static function flatMap($this1, $f) {
		$tmp = $this1->index;
		switch($tmp) {
		case 0:{
			return thx_fp_ListImpl::$Nil;
		}break;
		case 1:{
			$xs = _hx_deref($this1)->params[1];
			$tmp1 = call_user_func_array($f, array(_hx_deref($this1)->params[0]));
			$tmp2 = thx_fp__List_List_Impl_::flatMap($xs, $f);
			return thx_fp__List_List_Impl_::concat($tmp1, $tmp2);
		}break;
		}
	}
	static function concat($this1, $that) {
		$tmp = $this1->index;
		switch($tmp) {
		case 0:{
			if($that->index === 0) {
				return thx_fp_ListImpl::$Nil;
			} else {
				return $that;
			}
		}break;
		case 1:{
			$tmp1 = $that->index === 0;
			if($tmp1) {
				$l = $this1;
				return $l;
			} else {
				$tmp2 = _hx_deref($this1)->params[1]->index === 0;
				if($tmp2) {
					return thx_fp_ListImpl::Cons(_hx_deref($this1)->params[0], $that);
				} else {
					$x = _hx_deref($this1)->params[0];
					$tmp3 = thx_fp__List_List_Impl_::concat(_hx_deref($this1)->params[1], $that);
					return thx_fp_ListImpl::Cons($x, $tmp3);
				}
			}
		}break;
		}
	}
	static function prepend($this1, $x) {
		return thx_fp_ListImpl::Cons($x, $this1);
	}
	static function toArray($this1) {
		return thx_fp__List_List_Impl_::foldLeft($this1, (new _hx_array(array())), array(new _hx_lambda(array(), "thx_fp__List_List_Impl__3"), 'execute'));
	}
	static function intersperse($this1, $a) {
		$go = null;
		$go = array(new _hx_lambda(array(&$a, &$go), "thx_fp__List_List_Impl__4"), 'execute');
		$go1 = $go;
		$tmp3 = $this1->index;
		switch($tmp3) {
		case 0:{
			return thx_fp_ListImpl::$Nil;
		}break;
		case 1:{
			$xs1 = _hx_deref($this1)->params[1];
			$x1 = _hx_deref($this1)->params[0];
			$tmp4 = call_user_func_array($go1, array($xs1));
			return thx_fp_ListImpl::Cons($x1, $tmp4);
		}break;
		}
	}
	static function map($this1, $f) {
		$tmp = $this1->index;
		switch($tmp) {
		case 0:{
			return thx_fp_ListImpl::$Nil;
		}break;
		case 1:{
			$xs = _hx_deref($this1)->params[1];
			$tmp1 = call_user_func_array($f, array(_hx_deref($this1)->params[0]));
			$tmp2 = thx_fp__List_List_Impl_::map($xs, $f);
			return thx_fp_ListImpl::Cons($tmp1, $tmp2);
		}break;
		}
	}
	static function zipAp($this1, $other) {
		$tmp = $this1->index;
		switch($tmp) {
		case 0:{
			return thx_fp_ListImpl::$Nil;
		}break;
		case 1:{
			$xs = _hx_deref($this1)->params[1];
			$x = _hx_deref($this1)->params[0];
			$tmp1 = $other->index;
			switch($tmp1) {
			case 0:{
				return thx_fp_ListImpl::$Nil;
			}break;
			case 1:{
				$ys = _hx_deref($other)->params[1];
				$y = _hx_deref($other)->params[0];
				$tmp2 = call_user_func_array($y, array($x));
				$tmp3 = thx_fp__List_List_Impl_::zipAp($xs, $ys);
				return thx_fp_ListImpl::Cons($tmp2, $tmp3);
			}break;
			}
		}break;
		}
	}
	static function zip2Ap($f, $ax, $bx) {
		$tmp = thx_Functions2::curry($f);
		$tmp1 = thx_fp__List_List_Impl_::map($ax, $tmp);
		return thx_fp__List_List_Impl_::zipAp($bx, $tmp1);
	}
	static function zip3Ap($f, $ax, $bx, $cx) {
		$f1 = $f;
		$tmp = array(new _hx_lambda(array(&$f1), "thx_fp__List_List_Impl__5"), 'execute');
		$tmp1 = thx_fp__List_List_Impl_::zip2Ap($tmp, $ax, $bx);
		return thx_fp__List_List_Impl_::zipAp($cx, $tmp1);
	}
	static function zip4Ap($f, $ax, $bx, $cx, $dx) {
		$f1 = $f;
		$tmp = array(new _hx_lambda(array(&$f1), "thx_fp__List_List_Impl__6"), 'execute');
		$tmp1 = thx_fp__List_List_Impl_::zip3Ap($tmp, $ax, $bx, $cx);
		return thx_fp__List_List_Impl_::zipAp($dx, $tmp1);
	}
	static function zip5Ap($f, $ax, $bx, $cx, $dx, $ex) {
		$f1 = $f;
		$tmp = array(new _hx_lambda(array(&$f1), "thx_fp__List_List_Impl__7"), 'execute');
		$tmp1 = thx_fp__List_List_Impl_::zip4Ap($tmp, $ax, $bx, $cx, $dx);
		return thx_fp__List_List_Impl_::zipAp($ex, $tmp1);
	}
	static function toStringWithShow($this1, $show) {
		$l = thx_fp__List_List_Impl_::map($this1, $show);
		$tmp = thx_fp__List_List_Impl_::intersperse($l, ",");
		$tmp1 = thx_fp__List_List_Impl_::foldLeft($tmp, "", array(new _hx_lambda(array(), "thx_fp__List_List_Impl__8"), 'execute'));
		return "[" . _hx_string_or_null($tmp1) . "]";
	}
	function __toString() { return 'thx.fp._List.List_Impl_'; }
}
function thx_fp__List_List_Impl__0(&$_e, $f, $initial) {
	{
		$initial1 = $initial;
		$i = $_e->length;
		while(true) {
			$tmp1 = --$i;
			if(!($tmp1 >= 0)) {
				break;
			}
			$initial1 = call_user_func_array($f, array($initial1, $_e[$i]));
			unset($tmp1);
		}
		return $initial1;
	}
}
function thx_fp__List_List_Impl__1($_0, $_1) {
	{
		return thx_fp_ListImpl::Cons($_1, $_0);
	}
}
function thx_fp__List_List_Impl__2(&$_e, $a0, $a1) {
	{
		return thx__Monoid_Monoid_Impl_::append($_e, $a0, $a1);
	}
}
function thx_fp__List_List_Impl__3($acc, $a) {
	{
		$acc->push($a);
		return $acc;
	}
}
function thx_fp__List_List_Impl__4(&$a, &$go, $ls) {
	{
		$tmp = $ls->index;
		switch($tmp) {
		case 0:{
			return thx_fp_ListImpl::$Nil;
		}break;
		case 1:{
			$xs = _hx_deref($ls)->params[1];
			$x = _hx_deref($ls)->params[0];
			$tmp1 = call_user_func_array($go, array($xs));
			$tmp2 = thx_fp_ListImpl::Cons($x, $tmp1);
			return thx_fp_ListImpl::Cons($a, $tmp2);
		}break;
		}
	}
}
function thx_fp__List_List_Impl__5(&$f1, $a, $b) {
	{
		return array(new _hx_lambda(array(&$a, &$b, &$f1), "thx_fp__List_List_Impl__9"), 'execute');
	}
}
function thx_fp__List_List_Impl__6(&$f1, $a, $b, $c) {
	{
		return array(new _hx_lambda(array(&$a, &$b, &$c, &$f1), "thx_fp__List_List_Impl__10"), 'execute');
	}
}
function thx_fp__List_List_Impl__7(&$f1, $a, $b, $c, $d) {
	{
		return array(new _hx_lambda(array(&$a, &$b, &$c, &$d, &$f1), "thx_fp__List_List_Impl__11"), 'execute');
	}
}
function thx_fp__List_List_Impl__8($_0, $_1) {
	{
		return _hx_string_or_null($_0) . _hx_string_or_null($_1);
	}
}
function thx_fp__List_List_Impl__9(&$a, &$b, &$f1, $c) {
	{
		return call_user_func_array($f1, array($a, $b, $c));
	}
}
function thx_fp__List_List_Impl__10(&$a, &$b, &$c, &$f1, $d) {
	{
		return call_user_func_array($f1, array($a, $b, $c, $d));
	}
}
function thx_fp__List_List_Impl__11(&$a, &$b, &$c, &$d, &$f1, $e) {
	{
		return call_user_func_array($f1, array($a, $b, $c, $d, $e));
	}
}