<?php

// Generated by Haxe 3.3.0
class thx_Types {
	public function __construct(){}
	static function isAnonymousObject($v) {
		$tmp = Reflect::isObject($v);
		if($tmp) {
			$tmp1 = Type::getClass($v);
			return null === $tmp1;
		} else {
			return false;
		}
	}
	static function isPrimitive($v) {
		$_g = Type::typeof($v);
		switch($_g->index) {
		case 1:case 2:case 3:{
			return true;
		}break;
		case 6:{
			return Type::getClassName(_hx_deref($_g)->params[0]) === "String";
		}break;
		case 0:case 4:case 5:case 7:case 8:{
			return false;
		}break;
		}
	}
	static function isEnumValue($v) {
		$_g = Type::typeof($v);
		if($_g->index === 7) {
			return true;
		} else {
			return false;
		}
	}
	static function hasSuperClass($cls, $sup) {
		while(null !== $cls) {
			if($cls === $sup) {
				return true;
			}
			$cls = Type::getSuperClass($cls);
		}
		return false;
	}
	static function sameType($a, $b) {
		$tmp = Type::typeof($a);
		$tmp1 = thx_Types::toString($tmp);
		$tmp2 = Type::typeof($b);
		$tmp3 = thx_Types::toString($tmp2);
		return $tmp1 === $tmp3;
	}
	static function typeInheritance($type) {
		$tmp = $type->index;
		switch($tmp) {
		case 1:{
			return (new _hx_array(array("Int")));
		}break;
		case 2:{
			return (new _hx_array(array("Float")));
		}break;
		case 3:{
			return (new _hx_array(array("Bool")));
		}break;
		case 4:{
			return (new _hx_array(array("{}")));
		}break;
		case 5:{
			return (new _hx_array(array("Function")));
		}break;
		case 6:{
			$c = _hx_deref($type)->params[0];
			$classes = (new _hx_array(array()));
			while(null !== $c) {
				$classes->push($c);
				$c = Type::getSuperClass($c);
			}
			return $classes->map((isset(Type::$getClassName) ? Type::$getClassName: array("Type", "getClassName")));
		}break;
		case 7:{
			return (new _hx_array(array(Type::getEnumName(_hx_deref($type)->params[0]))));
		}break;
		default:{
			$tmp1 = Std::string($type);
			throw new HException("invalid type " . _hx_string_or_null($tmp1));
		}break;
		}
	}
	static function toString($type) {
		$tmp = $type->index;
		switch($tmp) {
		case 0:{
			return "Null";
		}break;
		case 1:{
			return "Int";
		}break;
		case 2:{
			return "Float";
		}break;
		case 3:{
			return "Bool";
		}break;
		case 4:{
			return "{}";
		}break;
		case 5:{
			return "Function";
		}break;
		case 6:{
			return Type::getClassName(_hx_deref($type)->params[0]);
		}break;
		case 7:{
			return Type::getEnumName(_hx_deref($type)->params[0]);
		}break;
		default:{
			$tmp1 = Std::string($type);
			throw new HException("invalid type " . _hx_string_or_null($tmp1));
		}break;
		}
	}
	static function valueTypeInheritance($value) {
		$tmp = Type::typeof($value);
		return thx_Types::typeInheritance($tmp);
	}
	static function valueTypeToString($value) {
		$tmp = Type::typeof($value);
		return thx_Types::toString($tmp);
	}
	static function anyValueToString($value) {
		$tmp = Std::is($value, _hx_qtype("ValueType"));
		if($tmp) {
			return thx_Types::toString($value);
		}
		$tmp1 = Std::is($value, _hx_qtype("Class"));
		if($tmp1) {
			return Type::getClassName($value);
		}
		$tmp2 = Std::is($value, _hx_qtype("Enum"));
		if($tmp2) {
			return Type::getEnumName($value);
		}
		$tmp3 = Type::typeof($value);
		return thx_Types::toString($tmp3);
	}
	function __toString() { return 'thx.Types'; }
}