<?php

// Generated by Haxe 3.3.0
class thx_TestStaticResource {
	public function __construct($i) {
		if(!php_Boot::$skip_constructor) {
		$this->x = $i;
	}}
	public $x;
	public function testBasics() {
		$_g1 = 0;
		$_g = $this->x;
		while($_g1 < $_g) {
			++$_g1;
			utest_Assert::equals(1, thx_ResourceTest::$a, null, _hx_anonymous(array("fileName" => "TestStaticResource.hx", "lineNumber" => 13, "className" => "thx.TestStaticResource", "methodName" => "testBasics")));
			utest_Assert::notNull(thx_ResourceTest::$b, null, _hx_anonymous(array("fileName" => "TestStaticResource.hx", "lineNumber" => 14, "className" => "thx.TestStaticResource", "methodName" => "testBasics")));
			utest_Assert::equals("thx", thx_ResourceTest::$b->s, null, _hx_anonymous(array("fileName" => "TestStaticResource.hx", "lineNumber" => 15, "className" => "thx.TestStaticResource", "methodName" => "testBasics")));
			utest_Assert::isTrue(thx_ResourceTest::$c, null, _hx_anonymous(array("fileName" => "TestStaticResource.hx", "lineNumber" => 16, "className" => "thx.TestStaticResource", "methodName" => "testBasics")));
			utest_Assert::equals("haxe", thx_ResourceTest::$d, null, _hx_anonymous(array("fileName" => "TestStaticResource.hx", "lineNumber" => 17, "className" => "thx.TestStaticResource", "methodName" => "testBasics")));
			utest_Assert::equals("value", thx_ResourceTest::$fileJson->some, null, _hx_anonymous(array("fileName" => "TestStaticResource.hx", "lineNumber" => 18, "className" => "thx.TestStaticResource", "methodName" => "testBasics")));
			utest_Assert::equals("some text\x0A", thx_ResourceTest::$fileText, null, _hx_anonymous(array("fileName" => "TestStaticResource.hx", "lineNumber" => 19, "className" => "thx.TestStaticResource", "methodName" => "testBasics")));
		}
	}
	public function testDir() {
		$_g1 = 0;
		$_g = $this->x;
		while($_g1 < $_g) {
			++$_g1;
			utest_Assert::equals("some text\x0A", thx_ResourceDir::$text, null, _hx_anonymous(array("fileName" => "TestStaticResource.hx", "lineNumber" => 24, "className" => "thx.TestStaticResource", "methodName" => "testDir")));
			utest_Assert::equals("value", thx_ResourceDir::$object->some, null, _hx_anonymous(array("fileName" => "TestStaticResource.hx", "lineNumber" => 25, "className" => "thx.TestStaticResource", "methodName" => "testDir")));
		}
	}
	public function __call($m, $a) {
		if(isset($this->$m) && is_callable($this->$m))
			return call_user_func_array($this->$m, $a);
		else if(isset($this->__dynamics[$m]) && is_callable($this->__dynamics[$m]))
			return call_user_func_array($this->__dynamics[$m], $a);
		else if('toString' == $m)
			return $this->__toString();
		else
			throw new HException('Unable to call <'.$m.'>');
	}
	function __toString() { return 'thx.TestStaticResource'; }
}