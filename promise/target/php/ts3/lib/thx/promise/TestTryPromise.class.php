<?php

// Generated by Haxe 3.3.0
class thx_promise_TestTryPromise {
	public function __construct($i) {
		if(!php_Boot::$skip_constructor) {
		$this->x = $i;
	}}
	public $x;
	public function testTryCreate() {
		$_g1 = 0;
		$_g = $this->x;
		while($_g1 < $_g) {
			++$_g1;
			$tmp = thx_promise__Promise_Promise_Impl_::create(array(new _hx_lambda(array(), "thx_promise_TestTryPromise_0"), 'execute'));
			$tmp1 = thx_promise__Promise_Promise_Impl_::success($tmp, array(new _hx_lambda(array(), "thx_promise_TestTryPromise_1"), 'execute'));
			$tmp2 = thx_promise__Promise_Promise_Impl_::failure($tmp1, array(new _hx_lambda(array(), "thx_promise_TestTryPromise_2"), 'execute'));
			thx_promise__Promise_Promise_Impl_::always($tmp2, utest_Assert::createAsync(null, null));
			unset($tmp2,$tmp1,$tmp);
		}
	}
	public function testTryEitherSuccess() {
		$_g1 = 0;
		$_g = $this->x;
		while($_g1 < $_g) {
			++$_g1;
			$done = utest_Assert::createAsync(null, null);
			thx_promise__Promise_Promise_Impl_::either(thx_promise__Promise_Promise_Impl_::$nil, array(new _hx_lambda(array(), "thx_promise_TestTryPromise_3"), 'execute'), array(new _hx_lambda(array(), "thx_promise_TestTryPromise_4"), 'execute'))->then(array(new _hx_lambda(array(&$done), "thx_promise_TestTryPromise_5"), 'execute'));
			unset($done);
		}
	}
	public function testTryEitherFailure() {
		$_g1 = 0;
		$_g = $this->x;
		while($_g1 < $_g) {
			++$_g1;
			$done = utest_Assert::createAsync(null, null);
			$tmp = thx_promise__Promise_Promise_Impl_::fail("no go", _hx_anonymous(array("fileName" => "TestTryPromise.hx", "lineNumber" => 42, "className" => "thx.promise.TestTryPromise", "methodName" => "testTryEitherFailure")));
			thx_promise__Promise_Promise_Impl_::either($tmp, array(new _hx_lambda(array(), "thx_promise_TestTryPromise_6"), 'execute'), array(new _hx_lambda(array(), "thx_promise_TestTryPromise_7"), 'execute'))->then(array(new _hx_lambda(array(&$done), "thx_promise_TestTryPromise_8"), 'execute'));
			unset($tmp,$done);
		}
	}
	public function testTrySuccess() {
		$_g1 = 0;
		$_g = $this->x;
		while($_g1 < $_g) {
			++$_g1;
			$tmp = thx_promise__Promise_Promise_Impl_::success(thx_promise__Promise_Promise_Impl_::$nil, array(new _hx_lambda(array(), "thx_promise_TestTryPromise_9"), 'execute'));
			$tmp1 = thx_promise__Promise_Promise_Impl_::success($tmp, array(new _hx_lambda(array(), "thx_promise_TestTryPromise_10"), 'execute'));
			$tmp2 = thx_promise__Promise_Promise_Impl_::failure($tmp1, array(new _hx_lambda(array(), "thx_promise_TestTryPromise_11"), 'execute'));
			thx_promise__Promise_Promise_Impl_::always($tmp2, utest_Assert::createAsync(null, null));
			unset($tmp2,$tmp1,$tmp);
		}
	}
	public function testTryReject() {
		$_g1 = 0;
		$_g = $this->x;
		while($_g1 < $_g) {
			++$_g1;
			$tmp = thx_promise__Promise_Promise_Impl_::fail("nops", _hx_anonymous(array("fileName" => "TestTryPromise.hx", "lineNumber" => 67, "className" => "thx.promise.TestTryPromise", "methodName" => "testTryReject")));
			$tmp1 = thx_promise__Promise_Promise_Impl_::failure($tmp, array(new _hx_lambda(array(), "thx_promise_TestTryPromise_12"), 'execute'));
			$tmp2 = thx_promise__Promise_Promise_Impl_::success($tmp1, array(new _hx_lambda(array(), "thx_promise_TestTryPromise_13"), 'execute'));
			$tmp3 = thx_promise__Promise_Promise_Impl_::failure($tmp2, array(new _hx_lambda(array(), "thx_promise_TestTryPromise_14"), 'execute'));
			thx_promise__Promise_Promise_Impl_::always($tmp3, utest_Assert::createAsync(null, null));
			unset($tmp3,$tmp2,$tmp1,$tmp);
		}
	}
	public function testTryAlways() {
		$_g1 = 0;
		$_g = $this->x;
		while($_g1 < $_g) {
			++$_g1;
			$tmp = thx_promise__Promise_Promise_Impl_::always(thx_promise__Promise_Promise_Impl_::$nil, array(new _hx_lambda(array(), "thx_promise_TestTryPromise_15"), 'execute'));
			$tmp1 = thx_promise__Promise_Promise_Impl_::failure($tmp, array(new _hx_lambda(array(), "thx_promise_TestTryPromise_16"), 'execute'));
			thx_promise__Promise_Promise_Impl_::always($tmp1, utest_Assert::createAsync(null, null));
			unset($tmp1,$tmp);
		}
	}
	public function testTryThrowFailure() {
		$_g1 = 0;
		$_g = $this->x;
		while($_g1 < $_g) {
			++$_g1;
			$_e = thx_promise__Promise_Promise_Impl_::fail("meh", _hx_anonymous(array("fileName" => "TestTryPromise.hx", "lineNumber" => 84, "className" => "thx.promise.TestTryPromise", "methodName" => "testTryThrowFailure")));
			$tmp = array(new _hx_lambda(array(&$_e), "thx_promise_TestTryPromise_17"), 'execute');
			utest_Assert::raises($tmp, _hx_qtype("thx.Error"), null, null, _hx_anonymous(array("fileName" => "TestTryPromise.hx", "lineNumber" => 84, "className" => "thx.promise.TestTryPromise", "methodName" => "testTryThrowFailure")));
			unset($tmp,$_e);
		}
	}
	public function testTryMap() {
		$_g1 = 0;
		$_g = $this->x;
		while($_g1 < $_g) {
			++$_g1;
			$tmp = thx_promise__Promise_Promise_Impl_::map(thx_promise__Promise_Promise_Impl_::$nil, array(new _hx_lambda(array(), "thx_promise_TestTryPromise_18"), 'execute'));
			$tmp1 = thx_promise__Promise_Promise_Impl_::failure($tmp, array(new _hx_lambda(array(), "thx_promise_TestTryPromise_19"), 'execute'));
			thx_promise__Promise_Promise_Impl_::always($tmp1, utest_Assert::createAsync(null, null));
			unset($tmp1,$tmp);
		}
	}
	public function testTryFlatMap() {
		$_g1 = 0;
		$_g = $this->x;
		while($_g1 < $_g) {
			++$_g1;
			$tmp = thx_promise__Promise_Promise_Impl_::flatMapEither(thx_promise__Promise_Promise_Impl_::$nil, array(new _hx_lambda(array(), "thx_promise_TestTryPromise_20"), 'execute'), array(new _hx_lambda(array(), "thx_promise_TestTryPromise_21"), 'execute'));
			$tmp1 = thx_promise__Promise_Promise_Impl_::failure($tmp, array(new _hx_lambda(array(), "thx_promise_TestTryPromise_22"), 'execute'));
			thx_promise__Promise_Promise_Impl_::always($tmp1, utest_Assert::createAsync(null, null));
			unset($tmp1,$tmp);
		}
	}
	public function testTryFlatMapEitherSuccess() {
		$_g1 = 0;
		$_g = $this->x;
		while($_g1 < $_g) {
			++$_g1;
			$tmp = thx_promise__Promise_Promise_Impl_::flatMapEither(thx_promise__Promise_Promise_Impl_::$nil, array(new _hx_lambda(array(), "thx_promise_TestTryPromise_23"), 'execute'), array(new _hx_lambda(array(), "thx_promise_TestTryPromise_24"), 'execute'));
			$tmp1 = thx_promise__Promise_Promise_Impl_::failure($tmp, array(new _hx_lambda(array(), "thx_promise_TestTryPromise_25"), 'execute'));
			thx_promise__Promise_Promise_Impl_::always($tmp1, utest_Assert::createAsync(null, null));
			unset($tmp1,$tmp);
		}
	}
	public function testTryFlatMapEitherFailure() {
		$_g1 = 0;
		$_g = $this->x;
		while($_g1 < $_g) {
			++$_g1;
			$tmp = thx_promise__Promise_Promise_Impl_::fail("bah", _hx_anonymous(array("fileName" => "TestTryPromise.hx", "lineNumber" => 116, "className" => "thx.promise.TestTryPromise", "methodName" => "testTryFlatMapEitherFailure")));
			$tmp1 = thx_promise__Promise_Promise_Impl_::flatMapEither($tmp, array(new _hx_lambda(array(), "thx_promise_TestTryPromise_26"), 'execute'), array(new _hx_lambda(array(), "thx_promise_TestTryPromise_27"), 'execute'));
			$tmp2 = thx_promise__Promise_Promise_Impl_::failure($tmp1, array(new _hx_lambda(array(), "thx_promise_TestTryPromise_28"), 'execute'));
			thx_promise__Promise_Promise_Impl_::always($tmp2, utest_Assert::createAsync(null, null));
			unset($tmp2,$tmp1,$tmp);
		}
	}
	public function testTryRecoverNull() {
		$_g1 = 0;
		$_g = $this->x;
		while($_g1 < $_g) {
			++$_g1;
			$tmp = thx_promise__Promise_Promise_Impl_::value(null);
			$tmp1 = thx_promise__Promise_Promise_Impl_::recoverNull($tmp, array(new _hx_lambda(array(), "thx_promise_TestTryPromise_29"), 'execute'));
			$tmp2 = thx_promise__Promise_Promise_Impl_::failure($tmp1, array(new _hx_lambda(array(), "thx_promise_TestTryPromise_30"), 'execute'));
			thx_promise__Promise_Promise_Impl_::always($tmp2, utest_Assert::createAsync(null, null));
			unset($tmp2,$tmp1,$tmp);
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
	function __toString() { return 'thx.promise.TestTryPromise'; }
}
function thx_promise_TestTryPromise_0($resolve, $reject) {
	{
		throw new HException("oh boy");
	}
}
function thx_promise_TestTryPromise_1($_) {
	{
		utest_Assert::fail("exception triggered resolve", _hx_anonymous(array("fileName" => "TestTryPromise.hx", "lineNumber" => 17, "className" => "thx.promise.TestTryPromise", "methodName" => "testTryCreate")));
	}
}
function thx_promise_TestTryPromise_2($_1) {
	{
		utest_Assert::pass(null, _hx_anonymous(array("fileName" => "TestTryPromise.hx", "lineNumber" => 18, "className" => "thx.promise.TestTryPromise", "methodName" => "testTryCreate")));
	}
}
function thx_promise_TestTryPromise_3($_) {
	{
		throw new HException("nops");
	}
}
function thx_promise_TestTryPromise_4($_1) {
	{
		utest_Assert::fail("no reason to get here", _hx_anonymous(array("fileName" => "TestTryPromise.hx", "lineNumber" => 28, "className" => "thx.promise.TestTryPromise", "methodName" => "testTryEitherSuccess")));
	}
}
function thx_promise_TestTryPromise_5(&$done, $r) {
	{
		$tmp = $r->index;
		switch($tmp) {
		case 0:{
			utest_Assert::pass(null, _hx_anonymous(array("fileName" => "TestTryPromise.hx", "lineNumber" => 32, "className" => "thx.promise.TestTryPromise", "methodName" => "testTryEitherSuccess")));
		}break;
		case 1:{
			utest_Assert::fail("not good", _hx_anonymous(array("fileName" => "TestTryPromise.hx", "lineNumber" => 33, "className" => "thx.promise.TestTryPromise", "methodName" => "testTryEitherSuccess")));
		}break;
		}
		call_user_func($done);
	}
}
function thx_promise_TestTryPromise_6($_) {
	{
		utest_Assert::fail("no reason to get here", _hx_anonymous(array("fileName" => "TestTryPromise.hx", "lineNumber" => 44, "className" => "thx.promise.TestTryPromise", "methodName" => "testTryEitherFailure")));
	}
}
function thx_promise_TestTryPromise_7($_1) {
	{
		throw new HException("nops");
	}
}
function thx_promise_TestTryPromise_8(&$done, $r) {
	{
		$tmp1 = $r->index;
		switch($tmp1) {
		case 0:{
			utest_Assert::pass(null, _hx_anonymous(array("fileName" => "TestTryPromise.hx", "lineNumber" => 49, "className" => "thx.promise.TestTryPromise", "methodName" => "testTryEitherFailure")));
		}break;
		case 1:{
			utest_Assert::fail("not good", _hx_anonymous(array("fileName" => "TestTryPromise.hx", "lineNumber" => 50, "className" => "thx.promise.TestTryPromise", "methodName" => "testTryEitherFailure")));
		}break;
		}
		call_user_func($done);
	}
}
function thx_promise_TestTryPromise_9($_) {
	{
		throw new HException("nops");
	}
}
function thx_promise_TestTryPromise_10($_1) {
	{
		utest_Assert::fail("not piped to a failing promise", _hx_anonymous(array("fileName" => "TestTryPromise.hx", "lineNumber" => 60, "className" => "thx.promise.TestTryPromise", "methodName" => "testTrySuccess")));
	}
}
function thx_promise_TestTryPromise_11($_2) {
	{
		utest_Assert::pass(null, _hx_anonymous(array("fileName" => "TestTryPromise.hx", "lineNumber" => 61, "className" => "thx.promise.TestTryPromise", "methodName" => "testTrySuccess")));
	}
}
function thx_promise_TestTryPromise_12($_) {
	{
		throw new HException("niet");
	}
}
function thx_promise_TestTryPromise_13($_1) {
	{
		utest_Assert::fail("not piped to a failing promise", _hx_anonymous(array("fileName" => "TestTryPromise.hx", "lineNumber" => 69, "className" => "thx.promise.TestTryPromise", "methodName" => "testTryReject")));
	}
}
function thx_promise_TestTryPromise_14($e) {
	{
		utest_Assert::stringContains("niet", $e->message, null, _hx_anonymous(array("fileName" => "TestTryPromise.hx", "lineNumber" => 70, "className" => "thx.promise.TestTryPromise", "methodName" => "testTryReject")));
	}
}
function thx_promise_TestTryPromise_15() {
	{
		throw new HException("bad");
	}
}
function thx_promise_TestTryPromise_16($e) {
	{
		utest_Assert::stringContains("bad", $e->message, null, _hx_anonymous(array("fileName" => "TestTryPromise.hx", "lineNumber" => 78, "className" => "thx.promise.TestTryPromise", "methodName" => "testTryAlways")));
	}
}
function thx_promise_TestTryPromise_17(&$_e) {
	{
		return thx_promise__Promise_Promise_Impl_::throwFailure($_e);
	}
}
function thx_promise_TestTryPromise_18($_) {
	{
		throw new HException("meh");
	}
}
function thx_promise_TestTryPromise_19($e) {
	{
		utest_Assert::stringContains("meh", $e->message, null, _hx_anonymous(array("fileName" => "TestTryPromise.hx", "lineNumber" => 91, "className" => "thx.promise.TestTryPromise", "methodName" => "testTryMap")));
	}
}
function thx_promise_TestTryPromise_20($_) {
	{
		throw new HException("meh");
	}
}
function thx_promise_TestTryPromise_21($err) {
	{
		return thx_promise__Promise_Promise_Impl_::error($err);
	}
}
function thx_promise_TestTryPromise_22($e) {
	{
		utest_Assert::stringContains("meh", $e->message, null, _hx_anonymous(array("fileName" => "TestTryPromise.hx", "lineNumber" => 99, "className" => "thx.promise.TestTryPromise", "methodName" => "testTryFlatMap")));
	}
}
function thx_promise_TestTryPromise_23($_) {
	{
		throw new HException("meh");
	}
}
function thx_promise_TestTryPromise_24($e) {
	{
		throw new HException("mah");
	}
}
function thx_promise_TestTryPromise_25($e1) {
	{
		utest_Assert::stringContains("meh", $e1->message, null, _hx_anonymous(array("fileName" => "TestTryPromise.hx", "lineNumber" => 110, "className" => "thx.promise.TestTryPromise", "methodName" => "testTryFlatMapEitherSuccess")));
	}
}
function thx_promise_TestTryPromise_26($_) {
	{
		throw new HException("meh");
	}
}
function thx_promise_TestTryPromise_27($e) {
	{
		throw new HException("mah");
	}
}
function thx_promise_TestTryPromise_28($e1) {
	{
		utest_Assert::stringContains("mah", $e1->message, null, _hx_anonymous(array("fileName" => "TestTryPromise.hx", "lineNumber" => 121, "className" => "thx.promise.TestTryPromise", "methodName" => "testTryFlatMapEitherFailure")));
	}
}
function thx_promise_TestTryPromise_29() {
	{
		throw new HException("meh");
	}
}
function thx_promise_TestTryPromise_30($e) {
	{
		utest_Assert::stringContains("meh", $e->message, null, _hx_anonymous(array("fileName" => "TestTryPromise.hx", "lineNumber" => 129, "className" => "thx.promise.TestTryPromise", "methodName" => "testTryRecoverNull")));
	}
}