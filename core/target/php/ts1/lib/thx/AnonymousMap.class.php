<?php

// Generated by Haxe 3.3.0
class thx_AnonymousMap implements haxe_IMap{
	public function __construct($o) {
		if(!php_Boot::$skip_constructor) {
		$this->o = $o;
	}}
	public $o;
	public function get($k) {
		return Reflect::field($this->o, $k);
	}
	public function getOption($k) {
		$value = $this->get($k);
		if(null === $value) {
			return haxe_ds_Option::$None;
		} else {
			return haxe_ds_Option::Some($value);
		}
	}
	public function getObject() {
		return $this->o;
	}
	public function set($k, $v) {
		$this->o->{$k} = $v;
	}
	public function exists($k) {
		return _hx_has_field($this->o, $k);
	}
	public function remove($k) {
		return Reflect::deleteField($this->o, $k);
	}
	public function keys() {
		return Reflect::fields($this->o)->iterator();
	}
	public function iterator() {
		$tmp = $this->keys();
		$o = $this->o;
		$tmp1 = array(new _hx_lambda(array(&$o), "thx_AnonymousMap_0"), 'execute');
		return thx_Iterators::fmap($tmp, $tmp1);
	}
	public function toString() {
		$tmp = thx_Maps::tuples($this)->map(array(new _hx_lambda(array(), "thx_AnonymousMap_1"), 'execute'))->join(", ");
		return "{ " . _hx_string_or_null($tmp) . " }";
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
	function __toString() { return $this->toString(); }
}
function thx_AnonymousMap_0(&$o, $a1) {
	{
		return Reflect::field($o, $a1);
	}
}
function thx_AnonymousMap_1($t) {
	{
		$tmp1 = _hx_string_or_null($t->_0) . " => ";
		$tmp2 = Std::string($t->_1);
		return _hx_string_or_null($tmp1) . _hx_string_or_null($tmp2);
	}
}