<?php

// Generated by Haxe 3.3.0
class thx_CollectBehavior implements thx_IAssertBehavior{
	public function __construct() {
		if(!php_Boot::$skip_constructor) {
		$this->failures = 0;
		$this->warnings = 0;
		$this->successes = 0;
	}}
	public $successes;
	public $warnings;
	public $failures;
	public function success($pos) {
		$this->successes++;
	}
	public function warn($message, $pos) {
		$this->warnings++;
	}
	public function fail($message, $pos) {
		$this->failures++;
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
	function __toString() { return 'thx.CollectBehavior'; }
}
