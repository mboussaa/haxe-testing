<?php

// Generated by Haxe 3.3.0
class utest__TestAssert_Sample extends Enum {
	public static $None;
	public static function Rec($s) { return new utest__TestAssert_Sample("Rec", 2, array($s)); }
	public static function Some($s) { return new utest__TestAssert_Sample("Some", 1, array($s)); }
	public static $__constructors = array(0 => 'None', 2 => 'Rec', 1 => 'Some');
	}
utest__TestAssert_Sample::$None = new utest__TestAssert_Sample("None", 0);
