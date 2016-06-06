<?php

// Generated by Haxe 3.3.0
class thx_Iterators {
	public function __construct(){}
	static function all($it, $predicate) {
		while(true) {
			$tmp = !$it->hasNext();
			if($tmp) {
				break;
			}
			$element = $it->next();
			$tmp1 = !call_user_func_array($predicate, array($element));
			if($tmp1) {
				return false;
			}
			unset($tmp1,$tmp,$element);
		}
		return true;
	}
	static function any($it, $predicate) {
		while(true) {
			$tmp = !$it->hasNext();
			if($tmp) {
				break;
			}
			$element = $it->next();
			$tmp1 = call_user_func_array($predicate, array($element));
			if($tmp1) {
				return true;
			}
			unset($tmp1,$tmp,$element);
		}
		return false;
	}
	static function equals($a, $b, $equality = null) {
		$tmp = null === $equality;
		if($tmp) {
			$equality = (isset(thx_Functions::$equality) ? thx_Functions::$equality: array("thx_Functions", "equality"));
		}
		$an = null;
		$bn = null;
		while(true) {
			$an = $a->hasNext();
			$bn = $b->hasNext();
			$tmp1 = null;
			if(!$an) {
				$tmp1 = !$bn;
			} else {
				$tmp1 = false;
			}
			if($tmp1) {
				return true;
			}
			$tmp2 = null;
			if(!(!$an)) {
				$tmp2 = !$bn;
			} else {
				$tmp2 = true;
			}
			if($tmp2) {
				return false;
			}
			$tmp3 = $a->next();
			$tmp4 = $b->next();
			$tmp5 = !call_user_func_array($equality, array($tmp3, $tmp4));
			if($tmp5) {
				return false;
			}
			unset($tmp5,$tmp4,$tmp3,$tmp2,$tmp1);
		}
	}
	static function get($it, $index) {
		$pos = 0;
		while(true) {
			$tmp = !$it->hasNext();
			if($tmp) {
				break;
			}
			$i = $it->next();
			$tmp1 = $pos++;
			if($tmp1 === $index) {
				return $i;
			}
			unset($tmp1,$tmp,$i);
		}
		return null;
	}
	static function getOption($it, $index) {
		$value = thx_Iterators::get($it, $index);
		if(null === $value) {
			return haxe_ds_Option::$None;
		} else {
			return haxe_ds_Option::Some($value);
		}
	}
	static function eachPair($it, $handler) {
		$tmp = thx_Iterators::toArray($it);
		thx_Arrays::eachPair($tmp, $handler);
	}
	static function filter($it, $predicate) {
		return thx_Iterators::reduce($it, array(new _hx_lambda(array(&$predicate), "thx_Iterators_0"), 'execute'), (new _hx_array(array())));
	}
	static function find($it, $f) {
		while(true) {
			$tmp = !$it->hasNext();
			if($tmp) {
				break;
			}
			$element = $it->next();
			$tmp1 = call_user_func_array($f, array($element));
			if($tmp1) {
				return $element;
			}
			unset($tmp1,$tmp,$element);
		}
		return null;
	}
	static function findOption($it, $f) {
		$value = thx_Iterators::find($it, $f);
		if(null === $value) {
			return haxe_ds_Option::$None;
		} else {
			return haxe_ds_Option::Some($value);
		}
	}
	static function first($it) {
		$tmp = $it->hasNext();
		if($tmp) {
			return $it->next();
		} else {
			return null;
		}
	}
	static function hasElements($it) {
		return $it->hasNext();
	}
	static function indexOf($it, $element) {
		$pos = 0;
		while(true) {
			$tmp = !$it->hasNext();
			if($tmp) {
				break;
			}
			$v = $it->next();
			if((is_object($_t = $element) && ($_t instanceof Enum) ? $_t == $v : _hx_equal($_t, $v))) {
				return $pos;
			}
			++$pos;
			unset($v,$tmp,$_t);
		}
		return -1;
	}
	static function isEmpty($it) {
		return !$it->hasNext();
	}
	static function isIterator($v) {
		$fields = null;
		$tmp = null;
		$tmp1 = Reflect::isObject($v);
		if($tmp1) {
			$tmp2 = Type::getClass($v);
			$tmp = null === $tmp2;
		} else {
			$tmp = false;
		}
		if($tmp) {
			$fields = Reflect::fields($v);
		} else {
			$tmp3 = Type::getClass($v);
			$fields = Type::getInstanceFields($tmp3);
		}
		$tmp4 = null;
		$tmp5 = !(!Lambda::has($fields, "next"));
		if($tmp5) {
			$tmp4 = !Lambda::has($fields, "hasNext");
		} else {
			$tmp4 = true;
		}
		if($tmp4) {
			return false;
		}
		$tmp6 = Reflect::field($v, "next");
		$tmp7 = Reflect::isFunction($tmp6);
		if($tmp7) {
			$tmp8 = Reflect::field($v, "hasNext");
			return Reflect::isFunction($tmp8);
		} else {
			return false;
		}
	}
	static function last($it) {
		$buf = null;
		while(true) {
			$tmp = !$it->hasNext();
			if($tmp) {
				break;
			}
			$buf = $it->next();
			unset($tmp);
		}
		return $buf;
	}
	static function hforEach($it, $proc) {
		while(true) {
			$tmp = !$it->hasNext();
			if($tmp) {
				break;
			}
			$tmp1 = $it->next();
			call_user_func_array($proc, array($tmp1));
			unset($tmp1,$tmp);
		}
	}
	static function map($it, $f) {
		$acc = (new _hx_array(array()));
		while(true) {
			$tmp = !$it->hasNext();
			if($tmp) {
				break;
			}
			$v = $it->next();
			$tmp1 = call_user_func_array($f, array($v));
			$acc->push($tmp1);
			unset($v,$tmp1,$tmp);
		}
		return $acc;
	}
	static function fmap($it, $f) {
		return new thx_MapIterator($it, $f);
	}
	static function mapi($it, $f) {
		$acc = (new _hx_array(array()));
		$i = 0;
		while(true) {
			$tmp = !$it->hasNext();
			if($tmp) {
				break;
			}
			$v = $it->next();
			$tmp1 = $i++;
			$tmp2 = call_user_func_array($f, array($v, $tmp1));
			$acc->push($tmp2);
			unset($v,$tmp2,$tmp1,$tmp);
		}
		return $acc;
	}
	static function fmapi($it, $f) {
		return new thx_MapIIterator($it, $f);
	}
	static function order($it, $sort) {
		$n = thx_Iterators::toArray($it);
		$n->sort($sort);
		return $n;
	}
	static function reduce($it, $callback, $initial) {
		$result = $initial;
		while(true) {
			$tmp = !$it->hasNext();
			if($tmp) {
				break;
			}
			$tmp1 = $it->next();
			$result = call_user_func_array($callback, array($result, $tmp1));
			unset($tmp1,$tmp);
		}
		return $result;
	}
	static function reducei($it, $callback, $initial) {
		thx_Iterators::mapi($it, array(new _hx_lambda(array(&$callback, &$initial), "thx_Iterators_1"), 'execute'));
		return $initial;
	}
	static function foldLeft($it, $zero, $f) {
		return thx_Iterators::reduce($it, $f, $zero);
	}
	static function foldMap($it, $f, $m) {
		$tmp = thx_Iterators::fmap($it, $f);
		$tmp1 = thx__Monoid_Monoid_Impl_::get_zero($m);
		$_e = $m;
		$tmp2 = array(new _hx_lambda(array(&$_e), "thx_Iterators_2"), 'execute');
		return thx_Iterators::foldLeft($tmp, $tmp1, $tmp2);
	}
	static function toArray($it) {
		$elements = (new _hx_array(array()));
		while(true) {
			$tmp = !$it->hasNext();
			if($tmp) {
				break;
			}
			$element = $it->next();
			$elements->push($element);
			unset($tmp,$element);
		}
		return $elements;
	}
	static function unzip($it) {
		$a1 = (new _hx_array(array()));
		$a2 = (new _hx_array(array()));
		thx_Iterators::hforEach($it, array(new _hx_lambda(array(&$a1, &$a2), "thx_Iterators_3"), 'execute'));
		return _hx_anonymous(array("_0" => $a1, "_1" => $a2));
	}
	static function unzip3($it) {
		$a1 = (new _hx_array(array()));
		$a2 = (new _hx_array(array()));
		$a3 = (new _hx_array(array()));
		thx_Iterators::hforEach($it, array(new _hx_lambda(array(&$a1, &$a2, &$a3), "thx_Iterators_4"), 'execute'));
		return _hx_anonymous(array("_0" => $a1, "_1" => $a2, "_2" => $a3));
	}
	static function unzip4($it) {
		$a1 = (new _hx_array(array()));
		$a2 = (new _hx_array(array()));
		$a3 = (new _hx_array(array()));
		$a4 = (new _hx_array(array()));
		thx_Iterators::hforEach($it, array(new _hx_lambda(array(&$a1, &$a2, &$a3, &$a4), "thx_Iterators_5"), 'execute'));
		return _hx_anonymous(array("_0" => $a1, "_1" => $a2, "_2" => $a3, "_3" => $a4));
	}
	static function unzip5($it) {
		$a1 = (new _hx_array(array()));
		$a2 = (new _hx_array(array()));
		$a3 = (new _hx_array(array()));
		$a4 = (new _hx_array(array()));
		$a5 = (new _hx_array(array()));
		thx_Iterators::hforEach($it, array(new _hx_lambda(array(&$a1, &$a2, &$a3, &$a4, &$a5), "thx_Iterators_6"), 'execute'));
		return _hx_anonymous(array("_0" => $a1, "_1" => $a2, "_2" => $a3, "_3" => $a4, "_4" => $a5));
	}
	static function zip($it1, $it2) {
		$array = (new _hx_array(array()));
		while(true) {
			$tmp = null;
			$tmp1 = $it1->hasNext();
			if($tmp1) {
				$tmp = $it2->hasNext();
			} else {
				$tmp = false;
			}
			if(!$tmp) {
				break;
			}
			$_0 = $it1->next();
			$_1 = $it2->next();
			$array->push(_hx_anonymous(array("_0" => $_0, "_1" => $_1)));
			unset($tmp1,$tmp,$_1,$_0);
		}
		return $array;
	}
	static function zip3($it1, $it2, $it3) {
		$array = (new _hx_array(array()));
		while(true) {
			$tmp = null;
			$tmp1 = null;
			$tmp2 = $it1->hasNext();
			if($tmp2) {
				$tmp1 = $it2->hasNext();
			} else {
				$tmp1 = false;
			}
			if($tmp1) {
				$tmp = $it3->hasNext();
			} else {
				$tmp = false;
			}
			if(!$tmp) {
				break;
			}
			$_0 = $it1->next();
			$_1 = $it2->next();
			$_2 = $it3->next();
			$array->push(_hx_anonymous(array("_0" => $_0, "_1" => $_1, "_2" => $_2)));
			unset($tmp2,$tmp1,$tmp,$_2,$_1,$_0);
		}
		return $array;
	}
	static function zip4($it1, $it2, $it3, $it4) {
		$array = (new _hx_array(array()));
		while(true) {
			$tmp = null;
			$tmp1 = null;
			$tmp2 = null;
			$tmp3 = $it1->hasNext();
			if($tmp3) {
				$tmp2 = $it2->hasNext();
			} else {
				$tmp2 = false;
			}
			if($tmp2) {
				$tmp1 = $it3->hasNext();
			} else {
				$tmp1 = false;
			}
			if($tmp1) {
				$tmp = $it4->hasNext();
			} else {
				$tmp = false;
			}
			if(!$tmp) {
				break;
			}
			$_0 = $it1->next();
			$_1 = $it2->next();
			$_2 = $it3->next();
			$_3 = $it4->next();
			$array->push(_hx_anonymous(array("_0" => $_0, "_1" => $_1, "_2" => $_2, "_3" => $_3)));
			unset($tmp3,$tmp2,$tmp1,$tmp,$_3,$_2,$_1,$_0);
		}
		return $array;
	}
	static function zip5($it1, $it2, $it3, $it4, $it5) {
		$array = (new _hx_array(array()));
		while(true) {
			$tmp = null;
			$tmp1 = null;
			$tmp2 = null;
			$tmp3 = null;
			$tmp4 = $it1->hasNext();
			if($tmp4) {
				$tmp3 = $it2->hasNext();
			} else {
				$tmp3 = false;
			}
			if($tmp3) {
				$tmp2 = $it3->hasNext();
			} else {
				$tmp2 = false;
			}
			if($tmp2) {
				$tmp1 = $it4->hasNext();
			} else {
				$tmp1 = false;
			}
			if($tmp1) {
				$tmp = $it5->hasNext();
			} else {
				$tmp = false;
			}
			if(!$tmp) {
				break;
			}
			$_0 = $it1->next();
			$_1 = $it2->next();
			$_2 = $it3->next();
			$_3 = $it4->next();
			$_4 = $it5->next();
			$array->push(_hx_anonymous(array("_0" => $_0, "_1" => $_1, "_2" => $_2, "_3" => $_3, "_4" => $_4)));
			unset($tmp4,$tmp3,$tmp2,$tmp1,$tmp,$_4,$_3,$_2,$_1,$_0);
		}
		return $array;
	}
	function __toString() { return 'thx.Iterators'; }
}
function thx_Iterators_0(&$predicate, $acc, $element) {
	{
		$tmp = call_user_func_array($predicate, array($element));
		if($tmp) {
			$acc->push($element);
		}
		return $acc;
	}
}
function thx_Iterators_1(&$callback, &$initial, $v, $i) {
	{
		$initial = call_user_func_array($callback, array($initial, $v, $i));
	}
}
function thx_Iterators_2(&$_e, $a0, $a1) {
	{
		return thx__Monoid_Monoid_Impl_::append($_e, $a0, $a1);
	}
}
function thx_Iterators_3(&$a1, &$a2, $t) {
	{
		$a1->push($t->_0);
		$a2->push($t->_1);
	}
}
function thx_Iterators_4(&$a1, &$a2, &$a3, $t) {
	{
		$a1->push($t->_0);
		$a2->push($t->_1);
		$a3->push($t->_2);
	}
}
function thx_Iterators_5(&$a1, &$a2, &$a3, &$a4, $t) {
	{
		$a1->push($t->_0);
		$a2->push($t->_1);
		$a3->push($t->_2);
		$a4->push($t->_3);
	}
}
function thx_Iterators_6(&$a1, &$a2, &$a3, &$a4, &$a5, $t) {
	{
		$a1->push($t->_0);
		$a2->push($t->_1);
		$a3->push($t->_2);
		$a4->push($t->_3);
		$a5->push($t->_4);
	}
}