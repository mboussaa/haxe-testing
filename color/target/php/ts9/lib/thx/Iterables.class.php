<?php

// Generated by Haxe 3.3.0
class thx_Iterables {
	public function __construct(){}
	static function all($it, $predicate) {
		$tmp = $it->iterator();
		return thx_Iterators::all($tmp, $predicate);
	}
	static function any($it, $predicate) {
		$tmp = $it->iterator();
		return thx_Iterators::any($tmp, $predicate);
	}
	static function eachPair($it, $handler) {
		$tmp = $it->iterator();
		thx_Iterators::eachPair($tmp, $handler);
		return;
	}
	static function equals($a, $b, $equality = null) {
		$tmp = $a->iterator();
		$tmp1 = $b->iterator();
		return thx_Iterators::equals($tmp, $tmp1, $equality);
	}
	static function filter($it, $predicate) {
		$tmp = $it->iterator();
		return thx_Iterators::filter($tmp, $predicate);
	}
	static function find($it, $predicate) {
		$tmp = $it->iterator();
		return thx_Iterators::find($tmp, $predicate);
	}
	static function findOption($it, $predicate) {
		$tmp = $it->iterator();
		$value = thx_Iterators::find($tmp, $predicate);
		if(null === $value) {
			return haxe_ds_Option::$None;
		} else {
			return haxe_ds_Option::Some($value);
		}
	}
	static function first($it) {
		$tmp = $it->iterator();
		return thx_Iterators::first($tmp);
	}
	static function get($it, $index) {
		$tmp = $it->iterator();
		return thx_Iterators::get($tmp, $index);
	}
	static function getOption($it, $index) {
		$tmp = $it->iterator();
		$value = thx_Iterators::get($tmp, $index);
		if(null === $value) {
			return haxe_ds_Option::$None;
		} else {
			return haxe_ds_Option::Some($value);
		}
	}
	static function last($it) {
		$tmp = $it->iterator();
		return thx_Iterators::last($tmp);
	}
	static function hasElements($it) {
		$it1 = $it->iterator();
		return $it1->hasNext();
	}
	static function indexOf($it, $element) {
		$tmp = $it->iterator();
		return thx_Iterators::indexOf($tmp, $element);
	}
	static function isEmpty($it) {
		$it1 = $it->iterator();
		return !$it1->hasNext();
	}
	static function isIterable($v) {
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
		$tmp4 = !Lambda::has($fields, "iterator");
		if($tmp4) {
			return false;
		}
		$tmp5 = Reflect::field($v, "iterator");
		return Reflect::isFunction($tmp5);
	}
	static function map($it, $f) {
		$tmp = $it->iterator();
		return thx_Iterators::map($tmp, $f);
	}
	static function fmap($it, $f) {
		return _hx_anonymous(array("iterator" => array(new _hx_lambda(array(&$f, &$it), "thx_Iterables_0"), 'execute')));
	}
	static function mapi($it, $f) {
		$tmp = $it->iterator();
		return thx_Iterators::mapi($tmp, $f);
	}
	static function fmapi($it, $f) {
		return _hx_anonymous(array("iterator" => array(new _hx_lambda(array(&$f, &$it), "thx_Iterables_1"), 'execute')));
	}
	static function order($it, $sort) {
		$tmp = $it->iterator();
		return thx_Iterators::order($tmp, $sort);
	}
	static function reduce($it, $callback, $initial) {
		$tmp = $it->iterator();
		return thx_Iterators::reduce($tmp, $callback, $initial);
	}
	static function reducei($it, $callback, $initial) {
		$tmp = $it->iterator();
		return thx_Iterators::reducei($tmp, $callback, $initial);
	}
	static function toArray($it) {
		$tmp = $it->iterator();
		return thx_Iterators::toArray($tmp);
	}
	static function minBy($it, $f, $ord) {
		$found = haxe_ds_Option::$None;
		{
			$tmp = $it->iterator();
			while(true) {
				$tmp1 = !$tmp->hasNext();
				if($tmp1) {
					break;
				}
				$a = $tmp->next();
				$tmp2 = thx_Options::any($found, array(new _hx_lambda(array(&$a, &$f, &$ord), "thx_Iterables_2"), 'execute'));
				if($tmp2) {
					$found = $found;
				} else {
					$found = haxe_ds_Option::Some($a);
				}
				unset($tmp2,$tmp1,$a);
			}
		}
		return $found;
	}
	static function maxBy($it, $f, $ord) {
		$tmp = thx__Ord_Ord_Impl_::inverse($ord);
		return thx_Iterables::minBy($it, $f, $tmp);
	}
	static function min($it, $ord) {
		return thx_Iterables::minBy($it, (isset(thx_Functions::$identity) ? thx_Functions::$identity: array("thx_Functions", "identity")), $ord);
	}
	static function max($it, $ord) {
		$ord1 = thx__Ord_Ord_Impl_::inverse($ord);
		return thx_Iterables::minBy($it, (isset(thx_Functions::$identity) ? thx_Functions::$identity: array("thx_Functions", "identity")), $ord1);
	}
	static function extremaBy($it, $f, $ord) {
		$found = haxe_ds_Option::$None;
		{
			$tmp = $it->iterator();
			while(true) {
				$tmp1 = !$tmp->hasNext();
				if($tmp1) {
					break;
				}
				$a = $tmp->next();
				$tmp2 = $found->index;
				switch($tmp2) {
				case 0:{
					$t = _hx_deref($found)->params[0];
					$tmp3 = call_user_func_array($f, array($a));
					$tmp4 = call_user_func_array($f, array($t->_0));
					$tmp5 = call_user_func_array($ord, array($tmp3, $tmp4));
					if($tmp5 === thx_OrderingImpl::$LT) {
						$found = haxe_ds_Option::Some(_hx_anonymous(array("_0" => $a, "_1" => $t->_1)));
					} else {
						$t1 = _hx_deref($found)->params[0];
						$tmp6 = call_user_func_array($f, array($a));
						$tmp7 = call_user_func_array($f, array($t1->_1));
						$tmp8 = call_user_func_array($ord, array($tmp6, $tmp7));
						if($tmp8 === thx_OrderingImpl::$GT) {
							$found = haxe_ds_Option::Some(_hx_anonymous(array("_0" => $t1->_0, "_1" => $a)));
						} else {
							$found = $found;
						}
					}
				}break;
				case 1:{
					$found = haxe_ds_Option::Some(_hx_anonymous(array("_0" => $a, "_1" => $a)));
				}break;
				default:{
					$found = $found;
				}break;
				}
				unset($tmp2,$tmp1,$a);
			}
		}
		return $found;
	}
	static function extrema($it, $ord) {
		return thx_Iterables::extremaBy($it, (isset(thx_Functions::$identity) ? thx_Functions::$identity: array("thx_Functions", "identity")), $ord);
	}
	static function unzip($it) {
		$tmp = $it->iterator();
		return thx_Iterators::unzip($tmp);
	}
	static function unzip3($it) {
		$tmp = $it->iterator();
		return thx_Iterators::unzip3($tmp);
	}
	static function unzip4($it) {
		$tmp = $it->iterator();
		return thx_Iterators::unzip4($tmp);
	}
	static function unzip5($it) {
		$tmp = $it->iterator();
		return thx_Iterators::unzip5($tmp);
	}
	static function zip($it1, $it2) {
		$tmp = $it1->iterator();
		$tmp1 = $it2->iterator();
		return thx_Iterators::zip($tmp, $tmp1);
	}
	static function zip3($it1, $it2, $it3) {
		$tmp = $it1->iterator();
		$tmp1 = $it2->iterator();
		$tmp2 = $it3->iterator();
		return thx_Iterators::zip3($tmp, $tmp1, $tmp2);
	}
	static function zip4($it1, $it2, $it3, $it4) {
		$tmp = $it1->iterator();
		$tmp1 = $it2->iterator();
		$tmp2 = $it3->iterator();
		$tmp3 = $it4->iterator();
		return thx_Iterators::zip4($tmp, $tmp1, $tmp2, $tmp3);
	}
	static function zip5($it1, $it2, $it3, $it4, $it5) {
		$tmp = $it1->iterator();
		$tmp1 = $it2->iterator();
		$tmp2 = $it3->iterator();
		$tmp3 = $it4->iterator();
		$tmp4 = $it5->iterator();
		return thx_Iterators::zip5($tmp, $tmp1, $tmp2, $tmp3, $tmp4);
	}
	function __toString() { return 'thx.Iterables'; }
}
function thx_Iterables_0(&$f, &$it) {
	{
		$tmp = $it->iterator();
		return thx_Iterators::fmap($tmp, $f);
	}
}
function thx_Iterables_1(&$f, &$it) {
	{
		$tmp = $it->iterator();
		return thx_Iterators::fmapi($tmp, $f);
	}
}
function thx_Iterables_2(&$a, &$f, &$ord, $a0) {
	{
		$tmp3 = call_user_func_array($f, array($a0));
		$tmp4 = call_user_func_array($f, array($a));
		$tmp5 = call_user_func_array($ord, array($tmp3, $tmp4));
		return $tmp5 === thx_OrderingImpl::$LT;
	}
}
