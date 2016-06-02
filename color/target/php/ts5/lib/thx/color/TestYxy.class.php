<?php

// Generated by Haxe 3.3.0
class thx_color_TestYxy extends nanotest_NanoTestCase {
	public function __construct($posInfos = null) { if(!php_Boot::$skip_constructor) {
		parent::__construct($posInfos);
	}}
	public function testBasics() {
		$color = (new _hx_array(array(0.5, 0.4, 0.3)));
		$this->assertEquals(0.5, $color[0], _hx_anonymous(array("fileName" => "TestYxy.hx", "lineNumber" => 11, "className" => "thx.color.TestYxy", "methodName" => "testBasics")));
		$this->assertEquals(0.4, $color[1], _hx_anonymous(array("fileName" => "TestYxy.hx", "lineNumber" => 12, "className" => "thx.color.TestYxy", "methodName" => "testBasics")));
		$this->assertEquals(0.3, $color[2], _hx_anonymous(array("fileName" => "TestYxy.hx", "lineNumber" => 13, "className" => "thx.color.TestYxy", "methodName" => "testBasics")));
	}
	public function testString() {
		$this->assertEquals("yxy(0.5,0.4,0.3)", thx_color__Yxy_Yxy_Impl_::toString((new _hx_array(array(0.5, 0.4, 0.3)))), _hx_anonymous(array("fileName" => "TestYxy.hx", "lineNumber" => 18, "className" => "thx.color.TestYxy", "methodName" => "testString")));
	}
	public function testParse() {
		$color = thx_color__Yxy_Yxy_Impl_::fromString("yxy(0.5,0.4,0.3)");
		$this->assertEquals("yxy(0.5,0.4,0.3)", thx_color__Yxy_Yxy_Impl_::toString($color), _hx_anonymous(array("fileName" => "TestYxy.hx", "lineNumber" => 23, "className" => "thx.color.TestYxy", "methodName" => "testParse")));
	}
	public function testFromFloat() {
		$s = thx_color__Yxy_Yxy_Impl_::fromString("yxy(0.5,0.4,0.3)");
		$f = thx_color__Yxy_Yxy_Impl_::fromFloats((new _hx_array(array(0.5, 0.4, 0.3))));
		$tmp = thx_color__Yxy_Yxy_Impl_::equals($s, $f);
		$this->assertTrue($tmp, _hx_anonymous(array("fileName" => "TestYxy.hx", "lineNumber" => 29, "className" => "thx.color.TestYxy", "methodName" => "testFromFloat")));
	}
	function __toString() { return 'thx.color.TestYxy'; }
}