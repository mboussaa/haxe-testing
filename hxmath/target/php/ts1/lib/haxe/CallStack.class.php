<?php

// Generated by Haxe 3.3.0
class haxe_CallStack {
	public function __construct(){}
	static function exceptionStack() {
		return haxe_CallStack::makeStack("%e");
	}
	static function makeStack($s) {
		$tmp = !isset($GLOBALS[$s]);
		if($tmp) {
			return (new _hx_array(array()));
		}
		$a = $GLOBALS[$s];
		$m = (new _hx_array(array()));
		{
			$_g1 = 0;
			$tmp1 = null;
			if($s === "%s") {
				$tmp1 = 2;
			} else {
				$tmp1 = 0;
			}
			$_g = $a->length - $tmp1;
			while($_g1 < $_g) {
				$i = $_g1++;
				$d = _hx_explode("::", $a[$i]);
				$tmp2 = haxe_StackItem::Method($d[0], $d[1]);
				$m->unshift($tmp2);
				unset($tmp2,$i,$d);
			}
		}
		return $m;
	}
	function __toString() { return 'haxe.CallStack'; }
}
