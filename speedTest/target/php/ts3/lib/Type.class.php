<?php

// Generated by Haxe 3.3.0
class Type {
	public function __construct(){}
	static function getClass($o) {
		if($o === null) {
			return null;
		}
		$tmp = is_array($o);
		if($tmp) {
			$tmp1 = null;
			$tmp2 = count($o);
			if($tmp2 === 2) {
				$tmp1 = is_callable($o);
			} else {
				$tmp1 = false;
			}
			if($tmp1) {
				return null;
			}
			return _hx_ttype("Array");
		}
		$tmp3 = is_string($o);
		if($tmp3) {
			$tmp4 = _hx_is_lambda($o);
			if($tmp4) {
				return null;
			}
			return _hx_ttype("String");
		}
		$tmp5 = !is_object($o);
		if($tmp5) {
			return null;
		}
		$c = get_class($o);
		$tmp6 = null;
		$tmp7 = null;
		if($c !== false) {
			$tmp7 = $c === "_hx_anonymous";
		} else {
			$tmp7 = true;
		}
		if(!$tmp7) {
			$tmp6 = is_subclass_of($c, "enum");
		} else {
			$tmp6 = true;
		}
		if($tmp6) {
			return null;
		} else {
			return _hx_ttype($c);
		}
	}
	static function getEnum($o) {
		$tmp = !$o instanceof Enum;
		if($tmp) {
			return null;
		} else {
			return _hx_ttype(get_class($o));
		}
	}
	static function getClassName($c) {
		if($c === null) {
			return null;
		}
		return $c->__qname__;
	}
	static function getEnumName($e) {
		return $e->__qname__;
	}
	static function getInstanceFields($c) {
		if($c->__qname__ === "String") {
			return (new _hx_array(array("substr", "charAt", "charCodeAt", "indexOf", "lastIndexOf", "split", "toLowerCase", "toUpperCase", "toString", "length")));
		}
		if($c->__qname__ === "Array") {
			return (new _hx_array(array("push", "concat", "join", "pop", "reverse", "shift", "slice", "sort", "splice", "toString", "copy", "unshift", "insert", "remove", "iterator", "length")));
		}
		
		$rfl = $c->__rfl__();
		if($rfl === null) return new _hx_array(array());
		$r = array();
		$internals = array('__construct', '__call', '__get', '__set', '__isset', '__unset', '__toString');
		$ms = $rfl->getMethods();
		while(list(, $m) = each($ms)) {
			$n = $m->getName();
			if(!$m->isStatic() && !in_array($n, $internals)) $r[] = $n;
		}
		$ps = $rfl->getProperties();
		while(list(, $p) = each($ps))
			if(!$p->isStatic() && ($name = $p->getName()) !== '__dynamics') $r[] = $name;
		;
		return new _hx_array(array_values(array_unique($r)));
	}
	static function typeof($v) {
		if($v === null) {
			return ValueType::$TNull;
		}
		$tmp = is_array($v);
		if($tmp) {
			$tmp1 = is_callable($v);
			if($tmp1) {
				return ValueType::$TFunction;
			}
			return ValueType::TClass(_hx_qtype("Array"));
		}
		$tmp2 = is_string($v);
		if($tmp2) {
			$tmp3 = _hx_is_lambda($v);
			if($tmp3) {
				return ValueType::$TFunction;
			}
			return ValueType::TClass(_hx_qtype("String"));
		}
		$tmp4 = is_bool($v);
		if($tmp4) {
			return ValueType::$TBool;
		}
		$tmp5 = is_int($v);
		if($tmp5) {
			return ValueType::$TInt;
		}
		$tmp6 = is_float($v);
		if($tmp6) {
			return ValueType::$TFloat;
		}
		$tmp7 = $v instanceof _hx_anonymous;
		if($tmp7) {
			return ValueType::$TObject;
		}
		$tmp8 = $v instanceof _hx_enum;
		if($tmp8) {
			return ValueType::$TObject;
		}
		$tmp9 = $v instanceof _hx_class;
		if($tmp9) {
			return ValueType::$TObject;
		}
		$c = _hx_ttype(get_class($v));
		$tmp10 = $c instanceof _hx_enum;
		if($tmp10) {
			return ValueType::TEnum($c);
		}
		$tmp11 = $c instanceof _hx_class;
		if($tmp11) {
			return ValueType::TClass($c);
		}
		return ValueType::$TUnknown;
	}
	static function enumConstructor($e) {
		return $e->tag;
	}
	static function enumParameters($e) {
		if(_hx_field($e, "params") === null) {
			return (new _hx_array(array()));
		} else {
			return new _hx_array($e->params);
		}
	}
	function __toString() { return 'Type'; }
}
