<?php

// Generated by Haxe 3.3.0
class thx__QueryString_QueryStringValue_Impl_ {
	public function __construct(){}
	static function toString($this1) {
		$tmp = null;
		if($this1 !== null) {
			$tmp = $this1->length === 0;
		} else {
			$tmp = true;
		}
		if($tmp) {
			return null;
		} else {
			return $this1->join(",");
		}
	}
	function __toString() { return 'thx._QueryString.QueryStringValue_Impl_'; }
}
