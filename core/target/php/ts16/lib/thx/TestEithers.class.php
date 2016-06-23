<?php

// Generated by Haxe 3.3.0
class thx_TestEithers {
	public function __construct($i) {
		if(!php_Boot::$skip_constructor) {
		$this->x = $i;
	}}
	public $x;
	public function testIsLeft() {
		$_g1 = 0;
		$_g = $this->x;
		while($_g1 < $_g) {
			++$_g1;
			$tmp = thx_Either::Left(123);
			utest_Assert::isTrue(thx_Eithers::isLeft($tmp), null, _hx_anonymous(array("fileName" => "TestEithers.hx", "lineNumber" => 15, "className" => "thx.TestEithers", "methodName" => "testIsLeft")));
			$tmp1 = thx_Either::Right(123);
			utest_Assert::isFalse(thx_Eithers::isLeft($tmp1), null, _hx_anonymous(array("fileName" => "TestEithers.hx", "lineNumber" => 16, "className" => "thx.TestEithers", "methodName" => "testIsLeft")));
			unset($tmp1,$tmp);
		}
	}
	public function testIsRight() {
		$_g1 = 0;
		$_g = $this->x;
		while($_g1 < $_g) {
			++$_g1;
			$tmp = thx_Either::Left(123);
			utest_Assert::isFalse(thx_Eithers::isRight($tmp), null, _hx_anonymous(array("fileName" => "TestEithers.hx", "lineNumber" => 21, "className" => "thx.TestEithers", "methodName" => "testIsRight")));
			$tmp1 = thx_Either::Right(123);
			utest_Assert::isTrue(thx_Eithers::isRight($tmp1), null, _hx_anonymous(array("fileName" => "TestEithers.hx", "lineNumber" => 22, "className" => "thx.TestEithers", "methodName" => "testIsRight")));
			unset($tmp1,$tmp);
		}
	}
	public function testToLeft() {
		$_g1 = 0;
		$_g = $this->x;
		while($_g1 < $_g) {
			++$_g1;
			$tmp = thx_Either::Left(123);
			$_g2 = thx_Eithers::toLeft($tmp);
			$tmp1 = null;
			switch($_g2->index) {
			case 0:{
				$tmp1 = _hx_deref($_g2)->params[0];
			}break;
			case 1:{
				$tmp1 = null;
			}break;
			}
			utest_Assert::same(123, $tmp1, null, null, null, _hx_anonymous(array("fileName" => "TestEithers.hx", "lineNumber" => 27, "className" => "thx.TestEithers", "methodName" => "testToLeft")));
			$tmp2 = thx_Either::Right(123);
			$_g3 = thx_Eithers::toLeft($tmp2);
			$tmp3 = null;
			switch($_g3->index) {
			case 0:{
				$tmp3 = _hx_deref($_g3)->params[0];
			}break;
			case 1:{
				$tmp3 = null;
			}break;
			}
			utest_Assert::isNull($tmp3, null, _hx_anonymous(array("fileName" => "TestEithers.hx", "lineNumber" => 32, "className" => "thx.TestEithers", "methodName" => "testToLeft")));
			unset($tmp3,$tmp2,$tmp1,$tmp,$_g3,$_g2);
		}
	}
	public function testToRight() {
		$_g1 = 0;
		$_g = $this->x;
		while($_g1 < $_g) {
			++$_g1;
			$tmp = thx_Either::Right(123);
			$_g2 = thx_Eithers::toRight($tmp);
			$tmp1 = null;
			switch($_g2->index) {
			case 0:{
				$tmp1 = _hx_deref($_g2)->params[0];
			}break;
			case 1:{
				$tmp1 = null;
			}break;
			}
			utest_Assert::same(123, $tmp1, null, null, null, _hx_anonymous(array("fileName" => "TestEithers.hx", "lineNumber" => 40, "className" => "thx.TestEithers", "methodName" => "testToRight")));
			$tmp2 = thx_Either::Left(123);
			$_g3 = thx_Eithers::toRight($tmp2);
			$tmp3 = null;
			switch($_g3->index) {
			case 0:{
				$tmp3 = _hx_deref($_g3)->params[0];
			}break;
			case 1:{
				$tmp3 = null;
			}break;
			}
			utest_Assert::isNull($tmp3, null, _hx_anonymous(array("fileName" => "TestEithers.hx", "lineNumber" => 45, "className" => "thx.TestEithers", "methodName" => "testToRight")));
			unset($tmp3,$tmp2,$tmp1,$tmp,$_g3,$_g2);
		}
	}
	public function testToLeftUnsafe() {
		$_g1 = 0;
		$_g = $this->x;
		while($_g1 < $_g) {
			++$_g1;
			$tmp = thx_Either::Left(123);
			utest_Assert::same(123, thx_Eithers::toLeftUnsafe($tmp), null, null, null, _hx_anonymous(array("fileName" => "TestEithers.hx", "lineNumber" => 53, "className" => "thx.TestEithers", "methodName" => "testToLeftUnsafe")));
			$tmp1 = thx_Either::Right(123);
			utest_Assert::same(null, thx_Eithers::toLeftUnsafe($tmp1), null, null, null, _hx_anonymous(array("fileName" => "TestEithers.hx", "lineNumber" => 54, "className" => "thx.TestEithers", "methodName" => "testToLeftUnsafe")));
			unset($tmp1,$tmp);
		}
	}
	public function testToRightUnsafe() {
		$_g1 = 0;
		$_g = $this->x;
		while($_g1 < $_g) {
			++$_g1;
			$tmp = thx_Either::Right(123);
			utest_Assert::same(123, thx_Eithers::toRightUnsafe($tmp), null, null, null, _hx_anonymous(array("fileName" => "TestEithers.hx", "lineNumber" => 59, "className" => "thx.TestEithers", "methodName" => "testToRightUnsafe")));
			$tmp1 = thx_Either::Left(123);
			utest_Assert::same(null, thx_Eithers::toRightUnsafe($tmp1), null, null, null, _hx_anonymous(array("fileName" => "TestEithers.hx", "lineNumber" => 60, "className" => "thx.TestEithers", "methodName" => "testToRightUnsafe")));
			unset($tmp1,$tmp);
		}
	}
	public function testFlatMap() {
		$_g1 = 0;
		$_g = $this->x;
		while($_g1 < $_g) {
			++$_g1;
			$tmp = thx_Either::Left(5);
			$tmp1 = thx_Eithers::flatMap($tmp, array(new _hx_lambda(array(), "thx_TestEithers_0"), 'execute'));
			utest_Assert::same(5, thx_Eithers::toLeftUnsafe($tmp1), null, null, null, _hx_anonymous(array("fileName" => "TestEithers.hx", "lineNumber" => 65, "className" => "thx.TestEithers", "methodName" => "testFlatMap")));
			$tmp2 = thx_Either::Left(5);
			$tmp3 = thx_Eithers::flatMap($tmp2, array(new _hx_lambda(array(), "thx_TestEithers_1"), 'execute'));
			utest_Assert::same(5, thx_Eithers::toLeftUnsafe($tmp3), null, null, null, _hx_anonymous(array("fileName" => "TestEithers.hx", "lineNumber" => 69, "className" => "thx.TestEithers", "methodName" => "testFlatMap")));
			$tmp4 = thx_Either::Right(5);
			$tmp5 = thx_Eithers::flatMap($tmp4, array(new _hx_lambda(array(), "thx_TestEithers_2"), 'execute'));
			utest_Assert::same(10, thx_Eithers::toLeftUnsafe($tmp5), null, null, null, _hx_anonymous(array("fileName" => "TestEithers.hx", "lineNumber" => 73, "className" => "thx.TestEithers", "methodName" => "testFlatMap")));
			$tmp6 = thx_Either::Right(5);
			$tmp7 = thx_Eithers::flatMap($tmp6, array(new _hx_lambda(array(), "thx_TestEithers_3"), 'execute'));
			utest_Assert::same(null, thx_Eithers::toLeftUnsafe($tmp7), null, null, null, _hx_anonymous(array("fileName" => "TestEithers.hx", "lineNumber" => 77, "className" => "thx.TestEithers", "methodName" => "testFlatMap")));
			$tmp8 = thx_Either::Left(5);
			$tmp9 = thx_Eithers::flatMap($tmp8, array(new _hx_lambda(array(), "thx_TestEithers_4"), 'execute'));
			utest_Assert::same(null, thx_Eithers::toRightUnsafe($tmp9), null, null, null, _hx_anonymous(array("fileName" => "TestEithers.hx", "lineNumber" => 81, "className" => "thx.TestEithers", "methodName" => "testFlatMap")));
			$tmp10 = thx_Either::Left(5);
			$tmp11 = thx_Eithers::flatMap($tmp10, array(new _hx_lambda(array(), "thx_TestEithers_5"), 'execute'));
			utest_Assert::same(null, thx_Eithers::toRightUnsafe($tmp11), null, null, null, _hx_anonymous(array("fileName" => "TestEithers.hx", "lineNumber" => 85, "className" => "thx.TestEithers", "methodName" => "testFlatMap")));
			$tmp12 = thx_Either::Right(5);
			$tmp13 = thx_Eithers::flatMap($tmp12, array(new _hx_lambda(array(), "thx_TestEithers_6"), 'execute'));
			utest_Assert::same(null, thx_Eithers::toRightUnsafe($tmp13), null, null, null, _hx_anonymous(array("fileName" => "TestEithers.hx", "lineNumber" => 89, "className" => "thx.TestEithers", "methodName" => "testFlatMap")));
			$tmp14 = thx_Either::Right(5);
			$tmp15 = thx_Eithers::flatMap($tmp14, array(new _hx_lambda(array(), "thx_TestEithers_7"), 'execute'));
			utest_Assert::same(10, thx_Eithers::toRightUnsafe($tmp15), null, null, null, _hx_anonymous(array("fileName" => "TestEithers.hx", "lineNumber" => 93, "className" => "thx.TestEithers", "methodName" => "testFlatMap")));
			unset($tmp9,$tmp8,$tmp7,$tmp6,$tmp5,$tmp4,$tmp3,$tmp2,$tmp15,$tmp14,$tmp13,$tmp12,$tmp11,$tmp10,$tmp1,$tmp);
		}
	}
	public function testLeftMap() {
		$_g1 = 0;
		$_g = $this->x;
		while($_g1 < $_g) {
			++$_g1;
			$l = thx_Either::Left(1);
			$rt = thx_Either::Right(true);
			$l2 = thx_Either::Left(2);
			$tmp = thx_Eithers::leftMap($l, array(new _hx_lambda(array(), "thx_TestEithers_8"), 'execute'));
			utest_Assert::same($l2, $tmp, null, null, null, _hx_anonymous(array("fileName" => "TestEithers.hx", "lineNumber" => 103, "className" => "thx.TestEithers", "methodName" => "testLeftMap")));
			$tmp1 = thx_Eithers::leftMap($rt, array(new _hx_lambda(array(), "thx_TestEithers_9"), 'execute'));
			utest_Assert::same($rt, $tmp1, null, null, null, _hx_anonymous(array("fileName" => "TestEithers.hx", "lineNumber" => 104, "className" => "thx.TestEithers", "methodName" => "testLeftMap")));
			unset($tmp1,$tmp,$rt,$l2,$l);
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
	function __toString() { return 'thx.TestEithers'; }
}
function thx_TestEithers_0($r) {
	{
		return thx_Either::Left(10);
	}
}
function thx_TestEithers_1($r1) {
	{
		return thx_Either::Right(10);
	}
}
function thx_TestEithers_2($r2) {
	{
		return thx_Either::Left(10);
	}
}
function thx_TestEithers_3($r3) {
	{
		return thx_Either::Right(10);
	}
}
function thx_TestEithers_4($r4) {
	{
		return thx_Either::Left(10);
	}
}
function thx_TestEithers_5($r5) {
	{
		return thx_Either::Right(10);
	}
}
function thx_TestEithers_6($r6) {
	{
		return thx_Either::Left(10);
	}
}
function thx_TestEithers_7($r7) {
	{
		return thx_Either::Right(10);
	}
}
function thx_TestEithers_8($i) {
	{
		return $i + 1;
	}
}
function thx_TestEithers_9($i1) {
	{
		return $i1 + 1;
	}
}