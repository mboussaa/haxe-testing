<?php

// Generated by Haxe 3.3.0
class hxmath_converters_flixel_Vector2Converter {
	public function __construct(){}
	static function copyToFlxPoint($v, $p) {
		$p->set_x($v->x);
		$p->set_y($v->y);
	}
	static function copyFromFlxPoint($v, $p) {
		$v->x = $p->x;
		$v->y = $p->y;
	}
	function __toString() { return 'hxmath.converters.flixel.Vector2Converter'; }
}
