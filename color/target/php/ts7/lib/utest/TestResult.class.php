<?php

// Generated by Haxe 3.3.0
class utest_TestResult {
	public function __construct() {}
	public $pack;
	public $cls;
	public $method;
	public $setup;
	public $teardown;
	public $assertations;
	public function allOk() {
		{
			$tmp = $this->assertations->iterator();
			while(true) {
				$tmp1 = !$tmp->hasNext();
				if($tmp1) {
					break;
				}
				$l = $tmp->next();
				if($l->index === 0) {
					break;
				} else {
					return false;
				}
				unset($tmp1,$l);
			}
		}
		return true;
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
	static function ofHandler($handler) {
		$r = new utest_TestResult();
		$tmp = Type::getClass($handler->fixture->target);
		$path = _hx_explode(".", Type::getClassName($tmp));
		$r->cls = $path->pop();
		$r->pack = $path->join(".");
		$r->method = $handler->fixture->method;
		$r->setup = $handler->fixture->setup;
		$r->teardown = $handler->fixture->teardown;
		$r->assertations = $handler->results;
		return $r;
	}
	function __toString() { return 'utest.TestResult'; }
}
