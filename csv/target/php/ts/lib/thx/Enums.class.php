<?php

// Generated by Haxe 3.3.0
class thx_Enums {
	public function __construct(){}
	static function string($e) {
		$cons = Type::enumConstructor($e);
		$params = (new _hx_array(array()));
		{
			$_g = 0;
			$_g1 = Type::enumParameters($e);
			while($_g < $_g1->length) {
				$param = $_g1[$_g];
				++$_g;
				$tmp = thx_Dynamics::string($param);
				$params->push($tmp);
				unset($tmp,$param);
			}
		}
		$tmp1 = null;
		$tmp2 = $params->length === 0;
		if($tmp2) {
			$tmp1 = "";
		} else {
			$tmp3 = $params->join(", ");
			$tmp1 = "(" . _hx_string_or_null($tmp3) . ")";
		}
		return _hx_string_or_null($cons) . _hx_string_or_null($tmp1);
	}
	static function compare($a, $b) {
		$v = $a->index - $b->index;
		if($v !== 0) {
			return $v;
		}
		$tmp = Type::enumParameters($a);
		$tmp1 = Type::enumParameters($b);
		return thx_Arrays::compare($tmp, $tmp1);
	}
	static function sameConstructor($a, $b) {
		return $a->index === $b->index;
	}
	static function min($a, $b) {
		$tmp = thx_Enums::compare($a, $b);
		if($tmp < 0) {
			return $a;
		} else {
			return $b;
		}
	}
	static function max($a, $b) {
		$tmp = thx_Enums::compare($a, $b);
		if($tmp > 0) {
			return $a;
		} else {
			return $b;
		}
	}
	function __toString() { return 'thx.Enums'; }
}
