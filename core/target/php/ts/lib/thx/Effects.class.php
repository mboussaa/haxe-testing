<?php

// Generated by Haxe 3.3.0
class thx_Effects {
	public function __construct(){}
	static function logger() { $args = func_get_args(); return call_user_func_array(self::$logger, $args); }
	static $logger;
	static function tap($input, $f) {
		call_user_func_array($f, array($input));
		return $input;
	}
	static function traced($input, $f) {
		$tmp = call_user_func_array($f, array($input));
		haxe_Log::trace($tmp, _hx_anonymous(array("fileName" => "Effects.hx", "lineNumber" => 14, "className" => "thx.Effects", "methodName" => "traced")));
		return $input;
	}
	static function log($input, $pos = null) {
		$a2 = $pos;
		call_user_func_array((array(new _hx_lambda(array(&$a2), "thx_Effects_0"), 'execute')), array($input));
		return $input;
	}
	function __toString() { return 'thx.Effects'; }
}
thx_Effects::$logger = (isset(haxe_Log::$trace) ? haxe_Log::$trace: array("haxe_Log", "trace"));
function thx_Effects_0(&$a2, $a1) {
	{
		thx_Effects::logger($a1, $a2);
	}
}