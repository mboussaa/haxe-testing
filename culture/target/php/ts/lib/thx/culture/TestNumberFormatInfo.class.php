<?php

// Generated by Haxe 3.3.0
class thx_culture_TestNumberFormatInfo {
	public function __construct() {}
	public function testInvariant() {
		$n = thx_culture_NumberFormatInfo::$invariant;
		utest_Assert::same((new _hx_array(array(3))), $n->groupSizesNumber, null, null, null, _hx_anonymous(array("fileName" => "TestNumberFormatInfo.hx", "lineNumber" => 12, "className" => "thx.culture.TestNumberFormatInfo", "methodName" => "testInvariant")));
		utest_Assert::equals(".", $n->separatorDecimalNumber, null, _hx_anonymous(array("fileName" => "TestNumberFormatInfo.hx", "lineNumber" => 13, "className" => "thx.culture.TestNumberFormatInfo", "methodName" => "testInvariant")));
		utest_Assert::equals(",", $n->separatorGroupNumber, null, _hx_anonymous(array("fileName" => "TestNumberFormatInfo.hx", "lineNumber" => 14, "className" => "thx.culture.TestNumberFormatInfo", "methodName" => "testInvariant")));
		utest_Assert::equals("-", $n->signNegative, null, _hx_anonymous(array("fileName" => "TestNumberFormatInfo.hx", "lineNumber" => 15, "className" => "thx.culture.TestNumberFormatInfo", "methodName" => "testInvariant")));
		utest_Assert::equals("+", $n->signPositive, null, _hx_anonymous(array("fileName" => "TestNumberFormatInfo.hx", "lineNumber" => 16, "className" => "thx.culture.TestNumberFormatInfo", "methodName" => "testInvariant")));
		utest_Assert::equals("NaN", $n->symbolNaN, null, _hx_anonymous(array("fileName" => "TestNumberFormatInfo.hx", "lineNumber" => 17, "className" => "thx.culture.TestNumberFormatInfo", "methodName" => "testInvariant")));
	}
	function __toString() { return 'thx.culture.TestNumberFormatInfo'; }
}
