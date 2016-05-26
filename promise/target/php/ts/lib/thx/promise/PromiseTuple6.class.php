<?php

// Generated by Haxe 3.3.0
class thx_promise_PromiseTuple6 {
	public function __construct(){}
	static function mapTuplePromise($promise, $success) {
		return thx_promise__Promise_Promise_Impl_::flatMapEither($promise, array(new _hx_lambda(array(&$success), "thx_promise_PromiseTuple6_0"), 'execute'), array(new _hx_lambda(array(), "thx_promise_PromiseTuple6_1"), 'execute'));
	}
	static function mapTuple($promise, $success) {
		return thx_promise__Promise_Promise_Impl_::map($promise, array(new _hx_lambda(array(&$success), "thx_promise_PromiseTuple6_2"), 'execute'));
	}
	static function tuple($promise, $success, $failure = null) {
		$tmp = null;
		if(null === $failure) {
			$tmp = array(new _hx_lambda(array(), "thx_promise_PromiseTuple6_3"), 'execute');
		} else {
			$tmp = $failure;
		}
		return thx_promise__Promise_Promise_Impl_::either($promise, array(new _hx_lambda(array(&$success), "thx_promise_PromiseTuple6_4"), 'execute'), $tmp);
	}
	function __toString() { return 'thx.promise.PromiseTuple6'; }
}
function thx_promise_PromiseTuple6_0(&$success, $t) {
	{
		return call_user_func_array($success, array($t->_0, $t->_1, $t->_2, $t->_3, $t->_4, $t->_5));
	}
}
function thx_promise_PromiseTuple6_1($err) {
	{
		return thx_promise__Promise_Promise_Impl_::error($err);
	}
}
function thx_promise_PromiseTuple6_2(&$success, $t) {
	{
		return call_user_func_array($success, array($t->_0, $t->_1, $t->_2, $t->_3, $t->_4, $t->_5));
	}
}
function thx_promise_PromiseTuple6_3($_) {
	{}
}
function thx_promise_PromiseTuple6_4(&$success, $t) {
	{
		call_user_func_array($success, array($t->_0, $t->_1, $t->_2, $t->_3, $t->_4, $t->_5));
	}
}
