<?php

// Generated by Haxe 3.3.0
class thx_culture_TestDateFormatInfo {
	public function __construct() {}
	public function testInvariant() {
		$dt = thx_culture_DateFormatInfo::$invariant;
		utest_Assert::equals("Gregorian", $dt->nameCalendar, null, _hx_anonymous(array("fileName" => "TestDateFormatInfo.hx", "lineNumber" => 11, "className" => "thx.culture.TestDateFormatInfo", "methodName" => "testInvariant")));
		utest_Assert::equals("Sunday", $dt->firstDayOfWeekName, null, _hx_anonymous(array("fileName" => "TestDateFormatInfo.hx", "lineNumber" => 12, "className" => "thx.culture.TestDateFormatInfo", "methodName" => "testInvariant")));
		utest_Assert::equals("AM", $dt->designatorAm, null, _hx_anonymous(array("fileName" => "TestDateFormatInfo.hx", "lineNumber" => 13, "className" => "thx.culture.TestDateFormatInfo", "methodName" => "testInvariant")));
		utest_Assert::equals("PM", $dt->designatorPm, null, _hx_anonymous(array("fileName" => "TestDateFormatInfo.hx", "lineNumber" => 14, "className" => "thx.culture.TestDateFormatInfo", "methodName" => "testInvariant")));
		utest_Assert::equals("January", $dt->nameMonths[0], null, _hx_anonymous(array("fileName" => "TestDateFormatInfo.hx", "lineNumber" => 15, "className" => "thx.culture.TestDateFormatInfo", "methodName" => "testInvariant")));
	}
	function __toString() { return 'thx.culture.TestDateFormatInfo'; }
}
