<?php

// Generated by Haxe 3.3.0
class nanotest_NanoTestStatus extends Enum {
	public static function ERROR($message, $callStack) { return new nanotest_NanoTestStatus("ERROR", 2, array($message, $callStack)); }
	public static function FAIL($message, $posInfos) { return new nanotest_NanoTestStatus("FAIL", 1, array($message, $posInfos)); }
	public static function SUCCESS($posInfos) { return new nanotest_NanoTestStatus("SUCCESS", 0, array($posInfos)); }
	public static $__constructors = array(2 => 'ERROR', 1 => 'FAIL', 0 => 'SUCCESS');
	}
