<?php

// Generated by Haxe 3.3.0
class HList implements IteratorAggregate{
	public function __construct() {
		if(!php_Boot::$skip_constructor) {
		$this->length = 0;
	}}
	public $h;
	public $q;
	public $length;
	public function add($item) {
		$x = array($item, null);
		if($this->h === null) {
			$this->h =& $x;
		} else {
			$this->q[1] =& $x;
		}
		$this->q =& $x;
		$this->length++;
	}
	public function remove($v) {
		$prev = null;
		$l = & $this->h;
		while($l !== null) {
			$tmp = $l[0] === $v;
			if($tmp) {
				if($prev === null) {
					$this->h =& $l[1];
				} else {
					$prev[1] =& $l[1];
				}
				$tmp1 = ($this->q === $l);
				if($tmp1) {
					$this->q =& $prev;
				}
				$this->length--;
				return true;
				unset($tmp1);
			}
			$prev =& $l;
			$l =& $l[1];
			unset($tmp);
		}
		return false;
	}
	public function iterator() {
		return new _hx_list_iterator($this);
	}
	public function getIterator() {
		return $this->iterator();
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
	function __toString() { return 'List'; }
}
