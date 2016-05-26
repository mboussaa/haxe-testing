<?php

// Generated by Haxe 3.3.0
class thx_TestChar {
	public function __construct() {}
	public function testChar() {
		thx_Assert::isTrue(true, "Char value should be greater than zero: " . _hx_string_rec(120, ""), _hx_anonymous(array("fileName" => "Char.hx", "lineNumber" => 19, "className" => "thx._Char.Char_Impl_", "methodName" => "fromInt")));
		$char = 120;
		utest_Assert::equals(120, $char, null, _hx_anonymous(array("fileName" => "TestChar.hx", "lineNumber" => 13, "className" => "thx.TestChar", "methodName" => "testChar")));
		$tmp = thx__Char_Char_Impl_::toString($char);
		utest_Assert::equals("x", $tmp, null, _hx_anonymous(array("fileName" => "TestChar.hx", "lineNumber" => 14, "className" => "thx.TestChar", "methodName" => "testChar")));
		$i = haxe_Utf8::charCodeAt("y", 0);
		thx_Assert::isTrue($i >= 0, "Char value should be greater than zero: " . _hx_string_rec($i, ""), _hx_anonymous(array("fileName" => "Char.hx", "lineNumber" => 19, "className" => "thx._Char.Char_Impl_", "methodName" => "fromInt")));
		$char = $i;
		utest_Assert::equals(121, $char, null, _hx_anonymous(array("fileName" => "TestChar.hx", "lineNumber" => 18, "className" => "thx.TestChar", "methodName" => "testChar")));
		$tmp1 = thx__Char_Char_Impl_::toString($char);
		utest_Assert::equals("y", $tmp1, null, _hx_anonymous(array("fileName" => "TestChar.hx", "lineNumber" => 19, "className" => "thx.TestChar", "methodName" => "testChar")));
		$tmp2 = thx__Char_Char_Impl_::toUpperCase($char);
		utest_Assert::equals(89, $tmp2, null, _hx_anonymous(array("fileName" => "TestChar.hx", "lineNumber" => 21, "className" => "thx.TestChar", "methodName" => "testChar")));
		$tmp3 = thx__Char_Char_Impl_::toUpperCase($char);
		$tmp4 = thx__Char_Char_Impl_::toString($tmp3);
		utest_Assert::equals("Y", $tmp4, null, _hx_anonymous(array("fileName" => "TestChar.hx", "lineNumber" => 22, "className" => "thx.TestChar", "methodName" => "testChar")));
		$char = thx__Char_Char_Impl_::next($char);
		utest_Assert::equals(122, $char, null, _hx_anonymous(array("fileName" => "TestChar.hx", "lineNumber" => 26, "className" => "thx.TestChar", "methodName" => "testChar")));
		$tmp5 = thx__Char_Char_Impl_::toString($char);
		utest_Assert::equals("z", $tmp5, null, _hx_anonymous(array("fileName" => "TestChar.hx", "lineNumber" => 27, "className" => "thx.TestChar", "methodName" => "testChar")));
		$tmp6 = thx__Char_Char_Impl_::prev($char);
		utest_Assert::equals(121, $tmp6, null, _hx_anonymous(array("fileName" => "TestChar.hx", "lineNumber" => 29, "className" => "thx.TestChar", "methodName" => "testChar")));
	}
	public function testControl() {
		thx_Assert::isTrue(true, "Char value should be greater than zero: " . _hx_string_rec(7, ""), _hx_anonymous(array("fileName" => "Char.hx", "lineNumber" => 19, "className" => "thx._Char.Char_Impl_", "methodName" => "fromInt")));
		utest_Assert::isTrue(thx__Char_Char_Impl_::isControl(7), null, _hx_anonymous(array("fileName" => "TestChar.hx", "lineNumber" => 33, "className" => "thx.TestChar", "methodName" => "testControl")));
		$i = haxe_Utf8::charCodeAt("x", 0);
		thx_Assert::isTrue($i >= 0, "Char value should be greater than zero: " . _hx_string_rec($i, ""), _hx_anonymous(array("fileName" => "Char.hx", "lineNumber" => 19, "className" => "thx._Char.Char_Impl_", "methodName" => "fromInt")));
		utest_Assert::isFalse(thx__Char_Char_Impl_::isControl($i), null, _hx_anonymous(array("fileName" => "TestChar.hx", "lineNumber" => 34, "className" => "thx.TestChar", "methodName" => "testControl")));
	}
	public function testUtf8() {
		$i = haxe_Utf8::charCodeAt("☺", 0);
		thx_Assert::isTrue($i >= 0, "Char value should be greater than zero: " . _hx_string_rec($i, ""), _hx_anonymous(array("fileName" => "Char.hx", "lineNumber" => 19, "className" => "thx._Char.Char_Impl_", "methodName" => "fromInt")));
		utest_Assert::equals(9786, $i, null, _hx_anonymous(array("fileName" => "TestChar.hx", "lineNumber" => 38, "className" => "thx.TestChar", "methodName" => "testUtf8")));
		thx_Assert::isTrue(true, "Char value should be greater than zero: " . _hx_string_rec(9786, ""), _hx_anonymous(array("fileName" => "Char.hx", "lineNumber" => 19, "className" => "thx._Char.Char_Impl_", "methodName" => "fromInt")));
		$tmp = thx__Char_Char_Impl_::toString(9786);
		utest_Assert::equals("☺", $tmp, null, _hx_anonymous(array("fileName" => "TestChar.hx", "lineNumber" => 39, "className" => "thx.TestChar", "methodName" => "testUtf8")));
	}
	public function testArrayToString() {
		thx_Assert::isTrue(true, "Char value should be greater than zero: " . _hx_string_rec(120, ""), _hx_anonymous(array("fileName" => "Char.hx", "lineNumber" => 19, "className" => "thx._Char.Char_Impl_", "methodName" => "fromInt")));
		$tmp = 120;
		thx_Assert::isTrue(true, "Char value should be greater than zero: " . _hx_string_rec(121, ""), _hx_anonymous(array("fileName" => "Char.hx", "lineNumber" => 19, "className" => "thx._Char.Char_Impl_", "methodName" => "fromInt")));
		$tmp1 = 121;
		thx_Assert::isTrue(true, "Char value should be greater than zero: " . _hx_string_rec(122, ""), _hx_anonymous(array("fileName" => "Char.hx", "lineNumber" => 19, "className" => "thx._Char.Char_Impl_", "methodName" => "fromInt")));
		$tmp2 = thx__Char_Char_Impl_::arrayToString((new _hx_array(array($tmp, $tmp1, 122))));
		utest_Assert::equals("xyz", $tmp2, null, _hx_anonymous(array("fileName" => "TestChar.hx", "lineNumber" => 44, "className" => "thx.TestChar", "methodName" => "testArrayToString")));
	}
	function __toString() { return 'thx.TestChar'; }
}
