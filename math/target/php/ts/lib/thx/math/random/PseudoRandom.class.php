<?php

// Generated by Haxe 3.3.0
class thx_math_random_PseudoRandom {
	public function __construct($seed = null) {
		if(!php_Boot::$skip_constructor) {
		if($seed === null) {
			$seed = 1;
		}
		$this->seed = $seed;
	}}
	public $seed;
	public function int() {
		$tmp = _hx_mod($this->seed * 48271.0, 2147483647.0);
		$tmp1 = $this->seed = Std::int($tmp);
		return $tmp1 & 1073741823;
	}
	public function float() {
		$tmp = $this->int();
		return $tmp / 1073741823.0;
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
	function __toString() { return 'thx.math.random.PseudoRandom'; }
}