<?php

// Generated by Haxe 3.3.0
class thx_culture_TestCulture {
	public function __construct() {}
	public function testInvariant() {
		utest_Assert::isFalse(thx_culture_Culture::$invariant->isNeutral, null, _hx_anonymous(array("fileName" => "TestCulture.hx", "lineNumber" => 10, "className" => "thx.culture.TestCulture", "methodName" => "testInvariant")));
		utest_Assert::isFalse(thx_culture_Culture::$invariant->isRightToLeft, null, _hx_anonymous(array("fileName" => "TestCulture.hx", "lineNumber" => 11, "className" => "thx.culture.TestCulture", "methodName" => "testInvariant")));
		utest_Assert::equals("", thx_culture_Culture::$invariant->code, null, _hx_anonymous(array("fileName" => "TestCulture.hx", "lineNumber" => 12, "className" => "thx.culture.TestCulture", "methodName" => "testInvariant")));
		utest_Assert::equals("iv", thx_culture_Culture::$invariant->iso2, null, _hx_anonymous(array("fileName" => "TestCulture.hx", "lineNumber" => 13, "className" => "thx.culture.TestCulture", "methodName" => "testInvariant")));
		utest_Assert::equals("IVL", thx_culture_Culture::$invariant->iso3, null, _hx_anonymous(array("fileName" => "TestCulture.hx", "lineNumber" => 14, "className" => "thx.culture.TestCulture", "methodName" => "testInvariant")));
		utest_Assert::equals("Invariant Language", thx_culture_Culture::$invariant->nameEnglish, null, _hx_anonymous(array("fileName" => "TestCulture.hx", "lineNumber" => 15, "className" => "thx.culture.TestCulture", "methodName" => "testInvariant")));
		utest_Assert::equals("Invariant Language", thx_culture_Culture::$invariant->nameNative, null, _hx_anonymous(array("fileName" => "TestCulture.hx", "lineNumber" => 16, "className" => "thx.culture.TestCulture", "methodName" => "testInvariant")));
	}
	function __toString() { return 'thx.culture.TestCulture'; }
}