<?php

// Generated by Haxe 3.3.0
class thx__Result_Result_Impl_ {
	public function __construct(){}
	static function success($value) {
		return thx_Either::Right($value);
	}
	static function failure($error) {
		return thx_Either::Left($error);
	}
	static function optionValue($this1) {
		$tmp = $this1->index === 1;
		if($tmp) {
			return haxe_ds_Option::Some(_hx_deref($this1)->params[0]);
		} else {
			return haxe_ds_Option::$None;
		}
	}
	static function optionError($this1) {
		$tmp = $this1->index === 0;
		if($tmp) {
			return haxe_ds_Option::Some(_hx_deref($this1)->params[0]);
		} else {
			return haxe_ds_Option::$None;
		}
	}
	static function value($this1) {
		if($this1->index === 1) {
			return _hx_deref($this1)->params[0];
		} else {
			return null;
		}
	}
	static function error($this1) {
		if($this1->index === 0) {
			return _hx_deref($this1)->params[0];
		} else {
			return null;
		}
	}
	static function get_isSuccess($this1) {
		if($this1->index === 1) {
			return true;
		} else {
			return false;
		}
	}
	static function get_isFailure($this1) {
		if($this1->index === 0) {
			return true;
		} else {
			return false;
		}
	}
	static $__properties__ = array("get_isFailure" => "get_isFailure","get_isSuccess" => "get_isSuccess");
	function __toString() { return 'thx._Result.Result_Impl_'; }
}