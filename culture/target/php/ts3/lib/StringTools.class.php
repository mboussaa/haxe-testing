<?php

// Generated by Haxe 3.3.0
class StringTools {
	public function __construct(){}
	static function htmlEscape($s, $quotes = null) {
		$s = _hx_explode(">", _hx_explode("<", _hx_explode("&", $s)->join("&amp;"))->join("&lt;"))->join("&gt;");
		if($quotes) {
			return _hx_explode("'", _hx_explode("\"", $s)->join("&quot;"))->join("&#039;");
		} else {
			return $s;
		}
	}
	static function startsWith($s, $start) {
		$tmp = strlen($s) >= strlen($start);
		if($tmp) {
			$tmp1 = _hx_substr($s, 0, strlen($start));
			return $tmp1 === $start;
		} else {
			return false;
		}
	}
	function __toString() { return 'StringTools'; }
}
