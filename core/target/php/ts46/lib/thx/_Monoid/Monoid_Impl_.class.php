<?php

// Generated by Haxe 3.3.0
class thx__Monoid_Monoid_Impl_ {
	public function __construct(){}
	static function get_semigroup($this1) {
		return (isset($this1->append) ? $this1->append: array($this1, "append"));
	}
	static function get_zero($this1) {
		return $this1->zero;
	}
	static function append($this1, $a0, $a1) {
		return $this1->append($a0, $a1);
	}
	static $__properties__ = array("get_zero" => "get_zero","get_semigroup" => "get_semigroup");
	function __toString() { return 'thx._Monoid.Monoid_Impl_'; }
}
