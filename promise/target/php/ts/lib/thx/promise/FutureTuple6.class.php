<?php

// Generated by Haxe 3.3.0
class thx_promise_FutureTuple6 {
	public function __construct(){}
	static function mapTuple($future, $callback) {
		return $future->map(array(new _hx_lambda(array(&$callback), "thx_promise_FutureTuple6_0"), 'execute'));
	}
	static function mapTupleAsync($future, $callback) {
		return $future->mapAsync(array(new _hx_lambda(array(&$callback), "thx_promise_FutureTuple6_1"), 'execute'));
	}
	static function mapTupleFuture($future, $callback) {
		return $future->flatMap(array(new _hx_lambda(array(&$callback), "thx_promise_FutureTuple6_2"), 'execute'));
	}
	static function tuple($future, $callback) {
		return $future->then(array(new _hx_lambda(array(&$callback), "thx_promise_FutureTuple6_3"), 'execute'));
	}
	function __toString() { return 'thx.promise.FutureTuple6'; }
}
function thx_promise_FutureTuple6_0(&$callback, $t) {
	{
		return call_user_func_array($callback, array($t->_0, $t->_1, $t->_2, $t->_3, $t->_4, $t->_5));
	}
}
function thx_promise_FutureTuple6_1(&$callback, $t, $cb) {
	{
		call_user_func_array($callback, array($t->_0, $t->_1, $t->_2, $t->_3, $t->_4, $t->_5, $cb));
		return;
	}
}
function thx_promise_FutureTuple6_2(&$callback, $t) {
	{
		return call_user_func_array($callback, array($t->_0, $t->_1, $t->_2, $t->_3, $t->_4, $t->_5));
	}
}
function thx_promise_FutureTuple6_3(&$callback, $t) {
	{
		call_user_func_array($callback, array($t->_0, $t->_1, $t->_2, $t->_3, $t->_4, $t->_5));
	}
}