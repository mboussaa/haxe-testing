<?php

// Generated by Haxe 3.3.0
class thx_DefaultAssertBehavior implements thx_IAssertBehavior{
	public function __construct() {}
	public function success($pos) {}
	public function warn($message, $pos) {
		haxe_Log::trace($message, $pos);
	}
	public function fail($message, $pos) {
		throw new HException(new thx_error_AssertError($message, $pos));
	}
	function __toString() { return 'thx.DefaultAssertBehavior'; }
}
