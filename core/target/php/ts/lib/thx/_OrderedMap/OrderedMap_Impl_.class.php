<?php

// Generated by Haxe 3.3.0
class thx__OrderedMap_OrderedMap_Impl_ {
	public function __construct(){}
	static function createString() {
		$inst = new thx_StringOrderedMap();
		return $inst;
	}
	static function createInt() {
		$inst = new thx_IntOrderedMap();
		return $inst;
	}
	static function createObject() {
		$inst = new thx_ObjectOrderedMap();
		return $inst;
	}
	static function createEnum() {
		$inst = new thx_EnumValueOrderedMap();
		return $inst;
	}
	static function _new($inst) {
		return $inst;
	}
	static function getOption($this1, $key) {
		$value = $this1->get($key);
		if(null === $value) {
			return haxe_ds_Option::$None;
		} else {
			return haxe_ds_Option::Some($value);
		}
	}
	static function hempty($this1) {
		$inst = $this1->hempty();
		return $inst;
	}
	static function copyTo($this1, $that) {
		{
			$tmp = $this1->keys();
			while(true) {
				$tmp1 = !$tmp->hasNext();
				if($tmp1) {
					break;
				}
				$key = $tmp->next();
				$tmp2 = $this1->get($key);
				$that->set($key, $tmp2);
				unset($tmp2,$tmp1,$key);
			}
		}
		return $that;
	}
	static function hclone($this1) {
		$inst = $this1->hempty();
		$that = $inst;
		{
			$tmp = $this1->keys();
			while(true) {
				$tmp1 = !$tmp->hasNext();
				if($tmp1) {
					break;
				}
				$key = $tmp->next();
				$tmp2 = $this1->get($key);
				$that->set($key, $tmp2);
				unset($tmp2,$tmp1,$key);
			}
		}
		return $that;
	}
	static function get($this1, $key) {
		return $this1->get($key);
	}
	static function at($this1, $index) {
		return $this1->at($index);
	}
	static function arrayWrite($this1, $k, $v) {
		return $this1->setValue($k, $v);
	}
	static function self($this1) {
		return $this1;
	}
	function __toString() { return 'thx._OrderedMap.OrderedMap_Impl_'; }
}
