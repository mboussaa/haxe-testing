<?php

// Generated by Haxe 3.3.0
class thx_fp_TestState {
	public function __construct() {}
	public function testMap() {
		$s = thx_fp__State_State_Impl_::map(thx_fp__State_State_Impl_::pure(1), array(new _hx_lambda(array(), "thx_fp_TestState_0"), 'execute'));
		$tmp = _hx_anonymous(array("_0" => "a", "_1" => 2));
		$tmp1 = call_user_func_array($s, array("a"));
		utest_Assert::same($tmp, $tmp1, null, null, null, _hx_anonymous(array("fileName" => "TestState.hx", "lineNumber" => 13, "className" => "thx.fp.TestState", "methodName" => "testMap")));
	}
	public function testFlatMap() {
		$s = thx_fp__State_State_Impl_::pure(1);
		$f = array(new _hx_lambda(array(&$s), "thx_fp_TestState_1"), 'execute');
		$tmp1 = _hx_anonymous(array("_0" => "ab", "_1" => 2));
		$tmp2 = thx_fp__State_State_Impl_::flatMap($s, $f);
		$tmp3 = call_user_func_array($tmp2, array("a"));
		utest_Assert::same($tmp1, $tmp3, null, null, null, _hx_anonymous(array("fileName" => "TestState.hx", "lineNumber" => 23, "className" => "thx.fp.TestState", "methodName" => "testFlatMap")));
	}
	function __toString() { return 'thx.fp.TestState'; }
}
function thx_fp_TestState_0($v) {
	{
		return $v + 1;
	}
}
function thx_fp_TestState_1(&$s, $i) {
	{
		$tmp = thx_fp__State_State_Impl_::modify($s, array(new _hx_lambda(array(), "thx_fp_TestState_2"), 'execute'));
		return thx_fp__State_State_Impl_::map($tmp, array(new _hx_lambda(array(&$i), "thx_fp_TestState_3"), 'execute'));
	}
}
function thx_fp_TestState_2($v) {
	{
		return _hx_string_or_null($v) . "b";
	}
}
function thx_fp_TestState_3(&$i, $v1) {
	{
		return $v1 + $i;
	}
}