<?php

// Generated by Haxe 3.3.0
class thx_TestMake {
	public function __construct() {}
	public function testConstructorLiteral() {
		$tmp = call_user_func_array((array(new _hx_lambda(array(), "thx_TestMake_0"), 'execute')), array("A", 1, 0.2, "D"));
		utest_Assert::same(_hx_anonymous(array("c" => "A", "b" => 1, "a" => 0.2, "d" => "D")), $tmp, null, null, null, _hx_anonymous(array("fileName" => "TestMake.hx", "lineNumber" => 10, "className" => "thx.TestMake", "methodName" => "testConstructorLiteral")));
	}
	public function testConstructorFromTypedef() {
		$constructor = array(new _hx_lambda(array(), "thx_TestMake_1"), 'execute');
		$tmp = call_user_func_array($constructor, array("A", 1, 0.2, "D"));
		utest_Assert::same(_hx_anonymous(array("c" => "A", "b" => 1, "a" => 0.2, "d" => "D")), $tmp, null, null, null, _hx_anonymous(array("fileName" => "TestMake.hx", "lineNumber" => 20, "className" => "thx.TestMake", "methodName" => "testConstructorFromTypedef")));
	}
	function __toString() { return 'thx.TestMake'; }
}
function thx_TestMake_0($c, $b, $a, $d) {
	{
		return _hx_anonymous(array("c" => $c, "b" => $b, "a" => $a, "d" => $d));
	}
}
function thx_TestMake_1($c, $b, $a, $d) {
	{
		$obj = _hx_anonymous(array("c" => $c, "b" => $b, "d" => $d));
		if(null !== $a) {
			$obj->a = $a;
		}
		return $obj;
	}
}
