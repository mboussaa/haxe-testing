<?php

// Generated by Haxe 3.3.0
class thx_TestIterables {
	public function __construct($i) {
		if(!php_Boot::$skip_constructor) {
		$this->x = $i;
	}}
	public $x;
	public function testMin() {
		$_g1 = 0;
		$_g = $this->x;
		while($_g1 < $_g) {
			++$_g1;
			$a = (new _hx_array(array(3, 1, 2)));
			$tmp = haxe_ds_Option::Some(1);
			$tmp1 = thx_Iterables::minBy($a, (isset(thx_Functions::$identity) ? thx_Functions::$identity: array("thx_Functions", "identity")), (isset(thx_Ints::$order) ? thx_Ints::$order: array("thx_Ints", "order")));
			utest_Assert::same($tmp, $tmp1, null, null, null, _hx_anonymous(array("fileName" => "TestIterables.hx", "lineNumber" => 18, "className" => "thx.TestIterables", "methodName" => "testMin")));
			$tmp2 = thx_Iterables::minBy((new _hx_array(array())), (isset(thx_Functions::$identity) ? thx_Functions::$identity: array("thx_Functions", "identity")), (isset(thx_Ints::$order) ? thx_Ints::$order: array("thx_Ints", "order")));
			utest_Assert::same(haxe_ds_Option::$None, $tmp2, null, null, null, _hx_anonymous(array("fileName" => "TestIterables.hx", "lineNumber" => 19, "className" => "thx.TestIterables", "methodName" => "testMin")));
			unset($tmp2,$tmp1,$tmp,$a);
		}
	}
	public function testMinBy() {
		$_g1 = 0;
		$_g = $this->x;
		while($_g1 < $_g) {
			++$_g1;
			$a = (new _hx_array(array(_hx_anonymous(array("a" => 3)), _hx_anonymous(array("a" => 1)), _hx_anonymous(array("a" => 2)))));
			$tmp = haxe_ds_Option::Some(_hx_anonymous(array("a" => 1)));
			$tmp1 = thx_Iterables::minBy($a, array(new _hx_lambda(array(), "thx_TestIterables_0"), 'execute'), (isset(thx_Ints::$order) ? thx_Ints::$order: array("thx_Ints", "order")));
			utest_Assert::same($tmp, $tmp1, null, null, null, _hx_anonymous(array("fileName" => "TestIterables.hx", "lineNumber" => 26, "className" => "thx.TestIterables", "methodName" => "testMinBy")));
			$tmp2 = thx_Iterables::minBy((new _hx_array(array())), array(new _hx_lambda(array(), "thx_TestIterables_1"), 'execute'), (isset(thx_Ints::$order) ? thx_Ints::$order: array("thx_Ints", "order")));
			utest_Assert::same(haxe_ds_Option::$None, $tmp2, null, null, null, _hx_anonymous(array("fileName" => "TestIterables.hx", "lineNumber" => 27, "className" => "thx.TestIterables", "methodName" => "testMinBy")));
			unset($tmp2,$tmp1,$tmp,$a);
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
	function __toString() { return 'thx.TestIterables'; }
}
function thx_TestIterables_0($o) {
	{
		return $o->a;
	}
}
function thx_TestIterables_1($o1) {
	{
		return $o1->a;
	}
}