<?php

// Generated by Haxe 3.3.0
class thx_text_TestInflections {
	public function __construct() {}
	public function testUncountable() {
		$tmp = thx_text_Inflections::pluralize("information");
		utest_Assert::equals("information", $tmp, null, _hx_anonymous(array("fileName" => "TestInflections.hx", "lineNumber" => 10, "className" => "thx.text.TestInflections", "methodName" => "testUncountable")));
		$tmp1 = thx_text_Inflections::pluralize("news");
		utest_Assert::equals("news", $tmp1, null, _hx_anonymous(array("fileName" => "TestInflections.hx", "lineNumber" => 11, "className" => "thx.text.TestInflections", "methodName" => "testUncountable")));
	}
	public function testPluralize() {
		$tmp = thx_text_Inflections::pluralize("day");
		utest_Assert::equals("days", $tmp, null, _hx_anonymous(array("fileName" => "TestInflections.hx", "lineNumber" => 15, "className" => "thx.text.TestInflections", "methodName" => "testPluralize")));
		$tmp1 = thx_text_Inflections::pluralize("woman");
		utest_Assert::equals("women", $tmp1, null, _hx_anonymous(array("fileName" => "TestInflections.hx", "lineNumber" => 16, "className" => "thx.text.TestInflections", "methodName" => "testPluralize")));
		$tmp2 = thx_text_Inflections::pluralize("autobus");
		utest_Assert::equals("autobuses", $tmp2, null, _hx_anonymous(array("fileName" => "TestInflections.hx", "lineNumber" => 17, "className" => "thx.text.TestInflections", "methodName" => "testPluralize")));
		$tmp3 = thx_text_Inflections::pluralize("quiz");
		utest_Assert::equals("quizzes", $tmp3, null, _hx_anonymous(array("fileName" => "TestInflections.hx", "lineNumber" => 18, "className" => "thx.text.TestInflections", "methodName" => "testPluralize")));
	}
	public function testSingularize() {
		$tmp = thx_text_Inflections::singularize("days");
		utest_Assert::equals("day", $tmp, null, _hx_anonymous(array("fileName" => "TestInflections.hx", "lineNumber" => 22, "className" => "thx.text.TestInflections", "methodName" => "testSingularize")));
		$tmp1 = thx_text_Inflections::singularize("women");
		utest_Assert::equals("woman", $tmp1, null, _hx_anonymous(array("fileName" => "TestInflections.hx", "lineNumber" => 23, "className" => "thx.text.TestInflections", "methodName" => "testSingularize")));
		$tmp2 = thx_text_Inflections::singularize("autobuses");
		utest_Assert::equals("autobus", $tmp2, null, _hx_anonymous(array("fileName" => "TestInflections.hx", "lineNumber" => 24, "className" => "thx.text.TestInflections", "methodName" => "testSingularize")));
		$tmp3 = thx_text_Inflections::singularize("quizzes");
		utest_Assert::equals("quiz", $tmp3, null, _hx_anonymous(array("fileName" => "TestInflections.hx", "lineNumber" => 25, "className" => "thx.text.TestInflections", "methodName" => "testSingularize")));
	}
	function __toString() { return 'thx.text.TestInflections'; }
}
