<?php

// Generated by Haxe 3.3.0
class thx_TestStaticResource {
	public function __construct() {}
	public function testBasics() {
		utest_Assert::equals(1, thx_ResourceTest::$a, null, _hx_anonymous(array("fileName" => "TestStaticResource.hx", "lineNumber" => 9, "className" => "thx.TestStaticResource", "methodName" => "testBasics")));
		utest_Assert::notNull(thx_ResourceTest::$b, null, _hx_anonymous(array("fileName" => "TestStaticResource.hx", "lineNumber" => 10, "className" => "thx.TestStaticResource", "methodName" => "testBasics")));
		utest_Assert::equals("thx", thx_ResourceTest::$b->s, null, _hx_anonymous(array("fileName" => "TestStaticResource.hx", "lineNumber" => 11, "className" => "thx.TestStaticResource", "methodName" => "testBasics")));
		utest_Assert::isTrue(thx_ResourceTest::$c, null, _hx_anonymous(array("fileName" => "TestStaticResource.hx", "lineNumber" => 12, "className" => "thx.TestStaticResource", "methodName" => "testBasics")));
		utest_Assert::equals("haxe", thx_ResourceTest::$d, null, _hx_anonymous(array("fileName" => "TestStaticResource.hx", "lineNumber" => 13, "className" => "thx.TestStaticResource", "methodName" => "testBasics")));
		utest_Assert::equals("value", thx_ResourceTest::$fileJson->some, null, _hx_anonymous(array("fileName" => "TestStaticResource.hx", "lineNumber" => 14, "className" => "thx.TestStaticResource", "methodName" => "testBasics")));
		utest_Assert::equals("some text\x0A", thx_ResourceTest::$fileText, null, _hx_anonymous(array("fileName" => "TestStaticResource.hx", "lineNumber" => 15, "className" => "thx.TestStaticResource", "methodName" => "testBasics")));
	}
	public function testDir() {
		utest_Assert::equals("some text\x0A", thx_ResourceDir::$text, null, _hx_anonymous(array("fileName" => "TestStaticResource.hx", "lineNumber" => 19, "className" => "thx.TestStaticResource", "methodName" => "testDir")));
		utest_Assert::equals("value", thx_ResourceDir::$object->some, null, _hx_anonymous(array("fileName" => "TestStaticResource.hx", "lineNumber" => 20, "className" => "thx.TestStaticResource", "methodName" => "testDir")));
	}
	function __toString() { return 'thx.TestStaticResource'; }
}