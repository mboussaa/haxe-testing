<?php

// Generated by Haxe 3.3.0
class thx_math_random_NativeRandom {
	public function __construct() {}
	public function int() {
		return Std::random(2147483647);
	}
	public function float() {
		return Math::random();
	}
	function __toString() { return 'thx.math.random.NativeRandom'; }
}