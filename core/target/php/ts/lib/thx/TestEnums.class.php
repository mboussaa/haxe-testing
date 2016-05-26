<?php

// Generated by Haxe 3.3.0
class thx_TestEnums {
	public function __construct() {}
	public function testIssue20151201() {
		$e = thx_Enum20151201::Test(_hx_anonymous(array("oldId" => "1", "newId" => "2")));
		$s = thx_Enums::string($e);
		utest_Assert::stringContains("oldId : \"1\"", $s, null, _hx_anonymous(array("fileName" => "TestEnums.hx", "lineNumber" => 16, "className" => "thx.TestEnums", "methodName" => "testIssue20151201")));
		utest_Assert::stringContains("newId : \"2\"", $s, null, _hx_anonymous(array("fileName" => "TestEnums.hx", "lineNumber" => 17, "className" => "thx.TestEnums", "methodName" => "testIssue20151201")));
		utest_Assert::stringContains(", ", $s, null, _hx_anonymous(array("fileName" => "TestEnums.hx", "lineNumber" => 18, "className" => "thx.TestEnums", "methodName" => "testIssue20151201")));
		$tmp = StringTools::startsWith($s, "Test({");
		utest_Assert::isTrue($tmp, null, _hx_anonymous(array("fileName" => "TestEnums.hx", "lineNumber" => 19, "className" => "thx.TestEnums", "methodName" => "testIssue20151201")));
		$tmp1 = StringTools::endsWith($s, "})");
		utest_Assert::isTrue($tmp1, null, _hx_anonymous(array("fileName" => "TestEnums.hx", "lineNumber" => 20, "className" => "thx.TestEnums", "methodName" => "testIssue20151201")));
	}
	public function testCompare() {
		$tmp = thx__TestEnums_Sample::B(1);
		$tmp1 = thx__TestEnums_Sample::B(2);
		$tmp2 = (new _hx_array(array(thx__TestEnums_Sample::$A, $tmp, $tmp1)));
		$tmp3 = thx__TestEnums_Sample::B(2);
		$tmp4 = thx__TestEnums_Sample::B(1);
		$tmp5 = thx_Arrays::order((new _hx_array(array($tmp3, thx__TestEnums_Sample::$A, $tmp4))), (isset(thx_Enums::$compare) ? thx_Enums::$compare: array("thx_Enums", "compare")));
		utest_Assert::same($tmp2, $tmp5, null, null, null, _hx_anonymous(array("fileName" => "TestEnums.hx", "lineNumber" => 24, "className" => "thx.TestEnums", "methodName" => "testCompare")));
	}
	public function testString() {
		$tmp = thx_Enums::string(thx__TestEnums_Sample::$A);
		utest_Assert::equals("A", $tmp, null, _hx_anonymous(array("fileName" => "TestEnums.hx", "lineNumber" => 33, "className" => "thx.TestEnums", "methodName" => "testString")));
		$tmp1 = thx__TestEnums_Sample::B(1);
		$tmp2 = thx_Enums::string($tmp1);
		utest_Assert::equals("B(1)", $tmp2, null, _hx_anonymous(array("fileName" => "TestEnums.hx", "lineNumber" => 34, "className" => "thx.TestEnums", "methodName" => "testString")));
	}
	function __toString() { return 'thx.TestEnums'; }
}
