<?php

// Generated by Haxe 3.3.0
class haxe__Int32_Int32_Impl_ {
	public function __construct(){}
	static function mul($a, $b) {
		return $a * ($b & 65535) + ($a * (_hx_shift_right($b, 16)) << 16 << haxe__Int32_Int32_Impl_::$extraBits >> haxe__Int32_Int32_Impl_::$extraBits) << haxe__Int32_Int32_Impl_::$extraBits >> haxe__Int32_Int32_Impl_::$extraBits;
	}
	static function ucompare($a, $b) {
		if($a < 0) {
			if($b < 0) {
				return ~$b - ~$a << haxe__Int32_Int32_Impl_::$extraBits >> haxe__Int32_Int32_Impl_::$extraBits;
			} else {
				return 1;
			}
		}
		if($b < 0) {
			return -1;
		} else {
			return $a - $b << haxe__Int32_Int32_Impl_::$extraBits >> haxe__Int32_Int32_Impl_::$extraBits;
		}
	}
	static $extraBits;
	function __toString() { return 'haxe._Int32.Int32_Impl_'; }
}
haxe__Int32_Int32_Impl_::$extraBits = haxe__Int32_Int32_Impl__0();
function haxe__Int32_Int32_Impl__0() {
	{
		$tmp = PHP_INT_SIZE;
		return $tmp * 8 - 32;
	}
}
