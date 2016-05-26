<?php

// Generated by Haxe 3.3.0
class thx_Bools {
	public function __construct(){}
	static function compare($a, $b) {
		if($a === $b) {
			return 0;
		} else {
			if($a) {
				return -1;
			} else {
				return 1;
			}
		}
	}
	static function toInt($v) {
		if($v) {
			return 1;
		} else {
			return 0;
		}
	}
	static function canParse($v) {
		$_g = strtolower($v);
		if($_g === null) {
			return true;
		} else {
			switch($_g) {
			case "0":case "1":case "false":case "off":case "on":case "true":{
				return true;
			}break;
			default:{
				return false;
			}break;
			}
		}
	}
	static function parse($v) {
		$_g = strtolower($v);
		if($_g === null) {
			return false;
		} else {
			switch($_g) {
			case "1":case "on":case "true":{
				return true;
			}break;
			case "0":case "false":case "off":{
				return false;
			}break;
			default:{
				throw new HException("unable to parse \"" . _hx_string_or_null($_g) . "\"");
			}break;
			}
		}
	}
	static function hxor($a, $b) {
		return $a !== $b;
	}
	static function option($cond, $a) {
		if($cond) {
			return haxe_ds_Option::Some($a);
		} else {
			return haxe_ds_Option::$None;
		}
	}
	function __toString() { return 'thx.Bools'; }
}
