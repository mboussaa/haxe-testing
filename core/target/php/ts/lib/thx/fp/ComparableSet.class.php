<?php

// Generated by Haxe 3.3.0
class thx_fp_ComparableSet {
	public function __construct(){}
	static function exists($set, $value) {
		return thx_fp__Set_Set_Impl_::member($set, $value, array(new _hx_lambda(array(), "thx_fp_ComparableSet_0"), 'execute'));
	}
	static function set($set, $value) {
		return thx_fp__Set_Set_Impl_::insert($set, $value, array(new _hx_lambda(array(), "thx_fp_ComparableSet_1"), 'execute'));
	}
	function __toString() { return 'thx.fp.ComparableSet'; }
}
function thx_fp_ComparableSet_0($a, $b) {
	{
		$tmp = $a->compareTo($b);
		return thx__Ord_Ordering_Impl_::fromInt($tmp);
	}
}
function thx_fp_ComparableSet_1($a, $b) {
	{
		$tmp = $a->compareTo($b);
		return thx__Ord_Ordering_Impl_::fromInt($tmp);
	}
}
