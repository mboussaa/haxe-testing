<?php

// Generated by Haxe 3.3.0
class thx_fp_StringSet {
	public function __construct(){}
	static function exists($set, $value) {
		$tmp = thx__Ord_Ord_Impl_::fromIntComparison((isset(thx_Strings::$compare) ? thx_Strings::$compare: array("thx_Strings", "compare")));
		return thx_fp__Set_Set_Impl_::member($set, $value, $tmp);
	}
	static function set($set, $value) {
		$tmp = thx__Ord_Ord_Impl_::fromIntComparison((isset(thx_Strings::$compare) ? thx_Strings::$compare: array("thx_Strings", "compare")));
		return thx_fp__Set_Set_Impl_::insert($set, $value, $tmp);
	}
	function __toString() { return 'thx.fp.StringSet'; }
}
