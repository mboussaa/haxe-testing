<?php

// Generated by Haxe 3.3.0
class thx_NonEmptyList extends Enum {
	public static function ConsNel($x, $xs) { return new thx_NonEmptyList("ConsNel", 1, array($x, $xs)); }
	public static function Single($x) { return new thx_NonEmptyList("Single", 0, array($x)); }
	public static $__constructors = array(1 => 'ConsNel', 0 => 'Single');
	}
