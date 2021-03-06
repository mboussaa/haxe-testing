<?php

// Generated by Haxe 3.3.0
class thx_Arrays {
	public function __construct(){}
	static function append($array, $element) {
		$array->push($element);
		return $array;
	}
	static function appendIf($array, $cond, $element) {
		if($cond) {
			$array->push($element);
		}
		return $array;
	}
	static function applyIndexes($array, $indexes, $incrementDuplicates = null) {
		if($incrementDuplicates === null) {
			$incrementDuplicates = false;
		}
		$tmp = $indexes->length !== $array->length;
		if($tmp) {
			throw new HException(new thx_Error("`Arrays.applyIndexes` can only be applied to two arrays with the same length", null, _hx_anonymous(array("fileName" => "Arrays.hx", "lineNumber" => 54, "className" => "thx.Arrays", "methodName" => "applyIndexes"))));
		}
		$result = (new _hx_array(array()));
		if($incrementDuplicates) {
			$usedIndexes = thx__Set_Set_Impl_::createInt(null);
			{
				$_g1 = 0;
				$_g = $array->length;
				while($_g1 < $_g) {
					$i = $_g1++;
					$index = $indexes[$i];
					while(true) {
						$tmp1 = !$usedIndexes->exists($index);
						if($tmp1) {
							break;
						}
						++$index;
						unset($tmp1);
					}
					thx__Set_Set_Impl_::add($usedIndexes, $index);
					$result[$index] = $array[$i];
					unset($index,$i);
				}
			}
		} else {
			$_g11 = 0;
			$_g2 = $array->length;
			while($_g11 < $_g2) {
				$i1 = $_g11++;
				$result[$indexes[$i1]] = $array[$i1];
				unset($i1);
			}
		}
		return $result;
	}
	static function monoid() {
		return _hx_anonymous(array("zero" => (new _hx_array(array())), "append" => array(new _hx_lambda(array(), "thx_Arrays_0"), 'execute')));
	}
	static function after($array, $element) {
		$tmp = thx__ReadonlyArray_ReadonlyArray_Impl_::indexOf($array, $element, null);
		return $array->slice($tmp + 1, null);
	}
	static function atIndex($array, $i) {
		$tmp = null;
		if($i >= 0) {
			$tmp = $i < $array->length;
		} else {
			$tmp = false;
		}
		if($tmp) {
			return haxe_ds_Option::Some($array[$i]);
		} else {
			return haxe_ds_Option::$None;
		}
	}
	static function getOption($array, $i) {
		$value = $array[$i];
		if(null === $value) {
			return haxe_ds_Option::$None;
		} else {
			return haxe_ds_Option::Some($value);
		}
	}
	static function each($arr, $effect) {
		$_g1 = 0;
		$_g = $arr->length;
		while($_g1 < $_g) {
			$i = $_g1++;
			call_user_func_array($effect, array($arr[$i]));
			unset($i);
		}
	}
	static function eachi($arr, $effect) {
		$_g1 = 0;
		$_g = $arr->length;
		while($_g1 < $_g) {
			$i = $_g1++;
			call_user_func_array($effect, array($arr[$i], $i));
			unset($i);
		}
	}
	static function all($arr, $predicate) {
		{
			$_g1 = 0;
			$_g = $arr->length;
			while($_g1 < $_g) {
				$i = $_g1++;
				$tmp = !call_user_func_array($predicate, array($arr[$i]));
				if($tmp) {
					return false;
				}
				unset($tmp,$i);
			}
		}
		return true;
	}
	static function any($arr, $predicate) {
		{
			$_g1 = 0;
			$_g = $arr->length;
			while($_g1 < $_g) {
				$i = $_g1++;
				$tmp = call_user_func_array($predicate, array($arr[$i]));
				if($tmp) {
					return true;
				}
				unset($tmp,$i);
			}
		}
		return false;
	}
	static function at($arr, $indexes) {
		return $indexes->map(array(new _hx_lambda(array(&$arr), "thx_Arrays_1"), 'execute'));
	}
	static function before($array, $element) {
		$tmp = thx__ReadonlyArray_ReadonlyArray_Impl_::indexOf($array, $element, null);
		return $array->slice(0, $tmp);
	}
	static function commonsFromStart($self, $other, $equality = null) {
		$tmp = null === $equality;
		if($tmp) {
			$equality = (isset(thx_Functions::$equality) ? thx_Functions::$equality: array("thx_Functions", "equality"));
		}
		$count = 0;
		{
			$_g = 0;
			$_g1 = thx_Arrays::zip($self, $other);
			while($_g < $_g1->length) {
				$pair = $_g1[$_g];
				++$_g;
				$tmp1 = call_user_func_array($equality, array($pair->_0, $pair->_1));
				if($tmp1) {
					++$count;
				} else {
					break;
				}
				unset($tmp1,$pair);
			}
		}
		return $self->slice(0, $count);
	}
	static function compact($arr) {
		return $arr->filter(array(new _hx_lambda(array(), "thx_Arrays_2"), 'execute'));
	}
	static function compare($a, $b) {
		$v = $a->length - $b->length;
		if($v !== 0) {
			return $v;
		}
		{
			$_g1 = 0;
			$_g = $a->length;
			while($_g1 < $_g) {
				$i = $_g1++;
				$v = thx_Dynamics::compare($a[$i], $b[$i]);
				if($v !== 0) {
					return $v;
				}
				unset($i);
			}
		}
		return 0;
	}
	static function contains($array, $element, $eq = null) {
		if(null === $eq) {
			$tmp = thx__ReadonlyArray_ReadonlyArray_Impl_::indexOf($array, $element, null);
			return $tmp >= 0;
		} else {
			{
				$_g1 = 0;
				$_g = $array->length;
				while($_g1 < $_g) {
					$i = $_g1++;
					$tmp1 = call_user_func_array($eq, array($array[$i], $element));
					if($tmp1) {
						return true;
					}
					unset($tmp1,$i);
				}
			}
			return false;
		}
	}
	static function containsAll($array, $elements, $eq = null) {
		{
			$tmp = $elements->iterator();
			while(true) {
				$tmp1 = !$tmp->hasNext();
				if($tmp1) {
					break;
				}
				$el = $tmp->next();
				$tmp2 = !thx_Arrays::contains($array, $el, $eq);
				if($tmp2) {
					return false;
				}
				unset($tmp2,$tmp1,$el);
			}
		}
		return true;
	}
	static function containsAny($array, $elements, $eq = null) {
		{
			$tmp = $elements->iterator();
			while(true) {
				$tmp1 = !$tmp->hasNext();
				if($tmp1) {
					break;
				}
				$el = $tmp->next();
				$tmp2 = thx_Arrays::contains($array, $el, $eq);
				if($tmp2) {
					return true;
				}
				unset($tmp2,$tmp1,$el);
			}
		}
		return false;
	}
	static function create($length, $fillWith) {
		$arr = (new _hx_array(array()));
		{
			$_g1 = 0;
			while($_g1 < $length) {
				$i = $_g1++;
				$arr[$i] = $fillWith;
				unset($i);
			}
		}
		return $arr;
	}
	static function cross($a, $b) {
		$r = (new _hx_array(array()));
		{
			$tmp = $a->iterator();
			while(true) {
				$tmp1 = !$tmp->hasNext();
				if($tmp1) {
					break;
				}
				$va = $tmp->next();
				{
					$tmp2 = $b->iterator();
					while(true) {
						$tmp3 = !$tmp2->hasNext();
						if($tmp3) {
							break;
						}
						$vb = $tmp2->next();
						$r->push((new _hx_array(array($va, $vb))));
						unset($vb,$tmp3);
					}
					unset($tmp2);
				}
				unset($va,$tmp1);
			}
		}
		return $r;
	}
	static function crossMulti($array) {
		$acopy = $array->copy();
		$result = $acopy->shift()->map(array(new _hx_lambda(array(), "thx_Arrays_3"), 'execute'));
		while($acopy->length > 0) {
			$array1 = $acopy->shift();
			$tresult = $result;
			$result = (new _hx_array(array()));
			{
				$tmp = $array1->iterator();
				while(true) {
					$tmp1 = !$tmp->hasNext();
					if($tmp1) {
						break;
					}
					$v1 = $tmp->next();
					$_g = 0;
					while($_g < $tresult->length) {
						$ar = $tresult[$_g];
						++$_g;
						$t = $ar->copy();
						$t->push($v1);
						$result->push($t);
						unset($t,$ar);
					}
					unset($v1,$tmp1,$_g);
				}
				unset($tmp);
			}
			unset($tresult,$array1);
		}
		return $result;
	}
	static function distinct($array, $predicate = null) {
		$result = (new _hx_array(array()));
		$tmp = $array->length <= 1;
		if($tmp) {
			return $array->copy();
		}
		$tmp1 = null === $predicate;
		if($tmp1) {
			$predicate = (isset(thx_Functions::$equality) ? thx_Functions::$equality: array("thx_Functions", "equality"));
		}
		{
			$tmp2 = $array->iterator();
			while(true) {
				$tmp3 = !$tmp2->hasNext();
				if($tmp3) {
					break;
				}
				$v = $tmp2->next();
				$keep = !thx_Arrays::any($result, array(new _hx_lambda(array(&$predicate, &$v), "thx_Arrays_4"), 'execute'));
				if($keep) {
					$result->push($v);
				}
				unset($v,$tmp3,$keep);
			}
		}
		return $result;
	}
	static function eachPair($array, $callback) {
		$_g1 = 0;
		$_g = $array->length;
		while($_g1 < $_g) {
			$i = $_g1++;
			{
				$_g3 = $i;
				$_g2 = $array->length;
				while($_g3 < $_g2) {
					$j = $_g3++;
					$tmp = !call_user_func_array($callback, array($array[$i], $array[$j]));
					if($tmp) {
						return;
					}
					unset($tmp,$j);
				}
				unset($_g3,$_g2);
			}
			unset($i);
		}
	}
	static function equals($a, $b, $equality = null) {
		$tmp = null;
		$tmp1 = null;
		if($a !== null) {
			$tmp1 = $b === null;
		} else {
			$tmp1 = true;
		}
		if(!$tmp1) {
			$tmp = $a->length !== $b->length;
		} else {
			$tmp = true;
		}
		if($tmp) {
			return false;
		}
		$tmp2 = null === $equality;
		if($tmp2) {
			$equality = (isset(thx_Functions::$equality) ? thx_Functions::$equality: array("thx_Functions", "equality"));
		}
		{
			$_g1 = 0;
			$_g = $a->length;
			while($_g1 < $_g) {
				$i = $_g1++;
				$tmp3 = !call_user_func_array($equality, array($a[$i], $b[$i]));
				if($tmp3) {
					return false;
				}
				unset($tmp3,$i);
			}
		}
		return true;
	}
	static function extract($a, $predicate) {
		{
			$_g1 = 0;
			$_g = $a->length;
			while($_g1 < $_g) {
				$i = $_g1++;
				$tmp = call_user_func_array($predicate, array($a[$i]));
				if($tmp) {
					$tmp1 = $a->splice($i, 1);
					return $tmp1[0];
					unset($tmp1);
				}
				unset($tmp,$i);
			}
		}
		return null;
	}
	static function filterNull($a) {
		$arr = (new _hx_array(array()));
		{
			$tmp = $a->iterator();
			while(true) {
				$tmp1 = !$tmp->hasNext();
				if($tmp1) {
					break;
				}
				$v = $tmp->next();
				if(null !== $v) {
					$arr->push($v);
				}
				unset($v,$tmp1);
			}
		}
		return $arr;
	}
	static function filterOption($a) {
		return thx_Arrays::reduce($a, array(new _hx_lambda(array(), "thx_Arrays_5"), 'execute'), (new _hx_array(array())));
	}
	static function find($array, $predicate) {
		{
			$tmp = $array->iterator();
			while(true) {
				$tmp1 = !$tmp->hasNext();
				if($tmp1) {
					break;
				}
				$element = $tmp->next();
				$tmp2 = call_user_func_array($predicate, array($element));
				if($tmp2) {
					return $element;
				}
				unset($tmp2,$tmp1,$element);
			}
		}
		return null;
	}
	static function findi($array, $predicate) {
		{
			$_g1 = 0;
			$_g = $array->length;
			while($_g1 < $_g) {
				$i = $_g1++;
				$tmp = call_user_func_array($predicate, array($array[$i], $i));
				if($tmp) {
					return $array[$i];
				}
				unset($tmp,$i);
			}
		}
		return null;
	}
	static function findiOption($array, $predicate) {
		{
			$_g1 = 0;
			$_g = $array->length;
			while($_g1 < $_g) {
				$i = $_g1++;
				$tmp = call_user_func_array($predicate, array($array[$i], $i));
				if($tmp) {
					return haxe_ds_Option::Some($array[$i]);
				}
				unset($tmp,$i);
			}
		}
		return haxe_ds_Option::$None;
	}
	static function findOption($array, $predicate) {
		{
			$tmp = $array->iterator();
			while(true) {
				$tmp1 = !$tmp->hasNext();
				if($tmp1) {
					break;
				}
				$element = $tmp->next();
				$tmp2 = call_user_func_array($predicate, array($element));
				if($tmp2) {
					return haxe_ds_Option::Some($element);
				}
				unset($tmp2,$tmp1,$element);
			}
		}
		return haxe_ds_Option::$None;
	}
	static function findIndex($array, $predicate) {
		{
			$_g1 = 0;
			$_g = $array->length;
			while($_g1 < $_g) {
				$i = $_g1++;
				$tmp = call_user_func_array($predicate, array($array[$i]));
				if($tmp) {
					return $i;
				}
				unset($tmp,$i);
			}
		}
		return -1;
	}
	static function findLast($array, $predicate) {
		$len = $array->length;
		$j = null;
		{
			$_g1 = 0;
			while($_g1 < $len) {
				$i = $_g1++;
				$j = $len - $i - 1;
				$tmp = call_user_func_array($predicate, array($array[$j]));
				if($tmp) {
					return $array[$j];
				}
				unset($tmp,$i);
			}
		}
		return null;
	}
	static function first($array) {
		return $array[0];
	}
	static function flatMap($array, $callback) {
		$tmp = $array->map($callback);
		return thx_Arrays::flatten($tmp);
	}
	static function flatten($array) {
		return thx_Arrays::reduce($array, array(new _hx_lambda(array(), "thx_Arrays_6"), 'execute'), (new _hx_array(array())));
	}
	static function from($array, $element) {
		$tmp = thx__ReadonlyArray_ReadonlyArray_Impl_::indexOf($array, $element, null);
		return $array->slice($tmp, null);
	}
	static function groupByAppend($arr, $resolver, $map) {
		{
			$_g1 = 0;
			$_g = $arr->length;
			while($_g1 < $_g) {
				$i = $_g1++;
				$v = $arr[$i];
				$key = call_user_func_array($resolver, array($v));
				$acc = $map->get($key);
				if(null === $acc) {
					$map->set($key, (new _hx_array(array($v))));
				} else {
					$acc->push($v);
				}
				unset($v,$key,$i,$acc);
			}
		}
		return $map;
	}
	static function spanByIndex($arr, $spanKey) {
		$acc = (new _hx_array(array()));
		$cur = null;
		$j = -1;
		{
			$_g1 = 0;
			$_g = $arr->length;
			while($_g1 < $_g) {
				$i = $_g1++;
				$k = call_user_func_array($spanKey, array($i));
				if($k === null) {
					throw new HException(new thx_Error("spanKey function returned null for index " . _hx_string_rec($i, ""), null, _hx_anonymous(array("fileName" => "Arrays.hx", "lineNumber" => 569, "className" => "thx.Arrays", "methodName" => "spanByIndex"))));
				}
				if((is_object($_t = $cur) && ($_t instanceof Enum) ? $_t == $k : _hx_equal($_t, $k))) {
					_hx_array_get($acc, $j)->push($arr[$i]);
				} else {
					$cur = $k;
					++$j;
					$acc->push((new _hx_array(array($arr[$i]))));
				}
				unset($k,$i,$_t);
			}
		}
		return $acc;
	}
	static function hasElements($array) {
		if(null !== $array) {
			return $array->length > 0;
		} else {
			return false;
		}
	}
	static function head($array) {
		return $array[0];
	}
	static function ifEmpty($array, $alt) {
		$tmp = null;
		if(null !== $array) {
			$tmp = 0 !== $array->length;
		} else {
			$tmp = false;
		}
		if($tmp) {
			return $array;
		} else {
			return $alt;
		}
	}
	static function initial($array) {
		$tmp = $array->length - 1;
		return $array->slice(0, $tmp);
	}
	static function intersperse($array, $value) {
		$tmp = $array->length * 2 - 1;
		$tmp1 = thx_Arrays::create($tmp, $value);
		return thx_Arrays::reducei($array, array(new _hx_lambda(array(), "thx_Arrays_7"), 'execute'), $tmp1);
	}
	static function isEmpty($array) {
		if(null !== $array) {
			return $array->length === 0;
		} else {
			return true;
		}
	}
	static function last($array) {
		return $array[$array->length - 1];
	}
	static function map($array, $callback) {
		$r = (new _hx_array(array()));
		{
			$_g1 = 0;
			$_g = $array->length;
			while($_g1 < $_g) {
				$i = $_g1++;
				$tmp = call_user_func_array($callback, array($array[$i]));
				$r->push($tmp);
				unset($tmp,$i);
			}
		}
		return $r;
	}
	static function mapi($array, $callback) {
		$r = (new _hx_array(array()));
		{
			$_g1 = 0;
			$_g = $array->length;
			while($_g1 < $_g) {
				$i = $_g1++;
				$tmp = call_user_func_array($callback, array($array[$i], $i));
				$r->push($tmp);
				unset($tmp,$i);
			}
		}
		return $r;
	}
	static function mapRight($array, $callback) {
		$i = $array->length;
		$result = (new _hx_array(array()));
		while(true) {
			$tmp = --$i;
			if(!($tmp >= 0)) {
				break;
			}
			$tmp1 = call_user_func_array($callback, array($array[$i]));
			$result->push($tmp1);
			unset($tmp1,$tmp);
		}
		return $result;
	}
	static function order($array, $sort) {
		$n = $array->copy();
		$n->sort($sort);
		return $n;
	}
	static function pull($array, $toRemove, $equality = null) {
		$tmp = $toRemove->iterator();
		while(true) {
			$tmp1 = !$tmp->hasNext();
			if($tmp1) {
				break;
			}
			$element = $tmp->next();
			thx_Arrays::removeAll($array, $element, $equality);
			unset($tmp1,$element);
		}
	}
	static function pushIf($array, $condition, $value) {
		if($condition) {
			$array->push($value);
		}
		return $array;
	}
	static function rank($array, $compare, $incrementDuplicates = null) {
		if($incrementDuplicates === null) {
			$incrementDuplicates = true;
		}
		$arr = thx_Arrays::mapi($array, array(new _hx_lambda(array(), "thx_Arrays_8"), 'execute'));
		$arr->sort(array(new _hx_lambda(array(&$compare), "thx_Arrays_9"), 'execute'));
		if($incrementDuplicates) {
			$usedIndexes = thx__Set_Set_Impl_::createInt(null);
			return thx_Arrays::reducei($arr, array(new _hx_lambda(array(&$arr, &$compare, &$usedIndexes), "thx_Arrays_10"), 'execute'), (new _hx_array(array())));
		} else {
			return thx_Arrays::reducei($arr, array(new _hx_lambda(array(&$arr, &$compare), "thx_Arrays_11"), 'execute'), (new _hx_array(array())));
		}
	}
	static function reduce($array, $f, $initial) {
		{
			$tmp = $array->iterator();
			while(true) {
				$tmp1 = !$tmp->hasNext();
				if($tmp1) {
					break;
				}
				$v = $tmp->next();
				$initial = call_user_func_array($f, array($initial, $v));
				unset($v,$tmp1);
			}
		}
		return $initial;
	}
	static function foldLeft($array, $init, $f) {
		return thx_Arrays::reduce($array, $f, $init);
	}
	static function foldLeftEither($array, $init, $f) {
		$acc = thx_Either::Right($init);
		{
			$tmp = $array->iterator();
			while(true) {
				$tmp1 = !$tmp->hasNext();
				if($tmp1) {
					break;
				}
				$a = $tmp->next();
				$tmp2 = $acc->index;
				switch($tmp2) {
				case 0:{
					return $acc;
				}break;
				case 1:{
					$acc = call_user_func_array($f, array(_hx_deref($acc)->params[0], $a));
				}break;
				}
				unset($tmp2,$tmp1,$a);
			}
		}
		return $acc;
	}
	static function foldMap($array, $f, $m) {
		$array1 = $array->map($f);
		$init = thx__Monoid_Monoid_Impl_::get_zero($m);
		$_e = $m;
		$tmp = array(new _hx_lambda(array(&$_e), "thx_Arrays_12"), 'execute');
		return thx_Arrays::reduce($array1, $tmp, $init);
	}
	static function fold($array, $m) {
		return thx_Arrays::foldMap($array, (isset(thx_Functions::$identity) ? thx_Functions::$identity: array("thx_Functions", "identity")), $m);
	}
	static function nel($array) {
		return thx__Nel_Nel_Impl_::fromArray($array);
	}
	static function foldS($array, $s) {
		$tmp = thx_Arrays::nel($array);
		return thx_Options::map($tmp, array(new _hx_lambda(array(&$s), "thx_Arrays_13"), 'execute'));
	}
	static function resize($array, $length, $fill) {
		while($array->length < $length) {
			$array->push($fill);
		}
		$tmp = $array->length - $length;
		$array->splice($length, $tmp);
		return $array;
	}
	static function reducei($array, $f, $initial) {
		{
			$_g1 = 0;
			$_g = $array->length;
			while($_g1 < $_g) {
				$i = $_g1++;
				$initial = call_user_func_array($f, array($initial, $array[$i], $i));
				unset($i);
			}
		}
		return $initial;
	}
	static function reduceRight($array, $f, $initial) {
		$i = $array->length;
		while(true) {
			$tmp = --$i;
			if(!($tmp >= 0)) {
				break;
			}
			$initial = call_user_func_array($f, array($initial, $array[$i]));
			unset($tmp);
		}
		return $initial;
	}
	static function removeAll($array, $element, $equality = null) {
		$tmp = null === $equality;
		if($tmp) {
			$equality = (isset(thx_Functions::$equality) ? thx_Functions::$equality: array("thx_Functions", "equality"));
		}
		$i = $array->length;
		while(true) {
			$tmp1 = --$i;
			if(!($tmp1 >= 0)) {
				break;
			}
			$tmp2 = call_user_func_array($equality, array($array[$i], $element));
			if($tmp2) {
				$array->splice($i, 1);
			}
			unset($tmp2,$tmp1);
		}
	}
	static function rest($array) {
		return $array->slice(1, null);
	}
	static function reversed($array) {
		$result = $array->copy();
		$result->reverse();
		return $result;
	}
	static function sample($array, $n) {
		$b = $array->length;
		$tmp = $n < $b;
		if($tmp) {
			$n = $n;
		} else {
			$n = $b;
		}
		$copy = $array->copy();
		$result = (new _hx_array(array()));
		{
			$_g1 = 0;
			$_g = $n;
			while($_g1 < $_g) {
				++$_g1;
				$tmp1 = Std::random($copy->length);
				$tmp2 = $copy->splice($tmp1, 1);
				$result->push($tmp2[0]);
				unset($tmp2,$tmp1);
			}
		}
		return $result;
	}
	static function sampleOne($array) {
		$index = Std::random($array->length);
		return $array[$index];
	}
	static function string($arr) {
		$strings = $arr->map((isset(thx_Dynamics::$string) ? thx_Dynamics::$string: array("thx_Dynamics", "string")));
		$tmp = $strings->join(", ");
		return "[" . _hx_string_or_null($tmp) . "]";
	}
	static function shuffle($a) {
		$t = thx_Ints::range($a->length, null, null);
		$array = (new _hx_array(array()));
		while($t->length > 0) {
			$pos = Std::random($t->length);
			$index = $t[$pos];
			$t->splice($pos, 1);
			$array->push($a[$index]);
			unset($pos,$index);
		}
		return $array;
	}
	static function split($array, $parts) {
		$tmp = $array->length / $parts;
		$len = Math::ceil($tmp);
		return thx_Arrays::splitBy($array, $len);
	}
	static function splitBy($array, $len) {
		$res = (new _hx_array(array()));
		$b = $array->length;
		$tmp = $len < $b;
		if($tmp) {
			$len = $len;
		} else {
			$len = $b;
		}
		{
			$_g1 = 0;
			$tmp1 = $array->length / $len;
			$_g = Math::ceil($tmp1);
			while($_g1 < $_g) {
				$p = $_g1++;
				$tmp2 = $array->slice($p * $len, ($p + 1) * $len);
				$res->push($tmp2);
				unset($tmp2,$p);
			}
		}
		return $res;
	}
	static function splitByPad($arr, $len, $pad) {
		$res = thx_Arrays::splitBy($arr, $len);
		while($res[$res->length - 1]->length < $len) {
			$tmp = $res[$res->length - 1];
			$tmp->push($pad);
			unset($tmp);
		}
		return $res;
	}
	static function tail($array) {
		return $array->slice(1, null);
	}
	static function take($arr, $n) {
		return $arr->slice(0, $n);
	}
	static function takeLast($arr, $n) {
		$tmp = $arr->length - $n;
		return $arr->slice($tmp, null);
	}
	static function traverseOption($arr, $f) {
		$tmp = haxe_ds_Option::Some((new _hx_array(array())));
		return thx_Arrays::reduce($arr, array(new _hx_lambda(array(&$f), "thx_Arrays_14"), 'execute'), $tmp);
	}
	static function traverseValidation($arr, $f, $s) {
		return thx_Arrays::reduce($arr, array(new _hx_lambda(array(&$f, &$s), "thx_Arrays_15"), 'execute'), thx_Either::Right((new _hx_array(array()))));
	}
	static function traverseValidationIndexed($arr, $f, $s) {
		return thx_Arrays::reducei($arr, array(new _hx_lambda(array(&$f, &$s), "thx_Arrays_16"), 'execute'), thx_Either::Right((new _hx_array(array()))));
	}
	static function rotate($arr) {
		$result = (new _hx_array(array()));
		{
			$_g1 = 0;
			$_g = $arr[0]->length;
			while($_g1 < $_g) {
				$i = $_g1++;
				$row = (new _hx_array(array()));
				$result->push($row);
				{
					$_g3 = 0;
					$_g2 = $arr->length;
					while($_g3 < $_g2) {
						$j = $_g3++;
						$row->push($arr[$j][$i]);
						unset($j);
					}
					unset($_g3,$_g2);
				}
				unset($row,$i);
			}
		}
		return $result;
	}
	static function sliding2($arr, $f) {
		$tmp = $arr->length < 2;
		if($tmp) {
			return (new _hx_array(array()));
		} else {
			$result = (new _hx_array(array()));
			{
				$_g1 = 0;
				$_g = $arr->length - 1;
				while($_g1 < $_g) {
					$i = $_g1++;
					$tmp1 = call_user_func_array($f, array($arr[$i], $arr[$i + 1]));
					$result->push($tmp1);
					unset($tmp1,$i);
				}
			}
			return $result;
		}
	}
	static function unzip($array) {
		$a1 = (new _hx_array(array()));
		$a2 = (new _hx_array(array()));
		$array->map(array(new _hx_lambda(array(&$a1, &$a2), "thx_Arrays_17"), 'execute'));
		return _hx_anonymous(array("_0" => $a1, "_1" => $a2));
	}
	static function unzip3($array) {
		$a1 = (new _hx_array(array()));
		$a2 = (new _hx_array(array()));
		$a3 = (new _hx_array(array()));
		$array->map(array(new _hx_lambda(array(&$a1, &$a2, &$a3), "thx_Arrays_18"), 'execute'));
		return _hx_anonymous(array("_0" => $a1, "_1" => $a2, "_2" => $a3));
	}
	static function unzip4($array) {
		$a1 = (new _hx_array(array()));
		$a2 = (new _hx_array(array()));
		$a3 = (new _hx_array(array()));
		$a4 = (new _hx_array(array()));
		$array->map(array(new _hx_lambda(array(&$a1, &$a2, &$a3, &$a4), "thx_Arrays_19"), 'execute'));
		return _hx_anonymous(array("_0" => $a1, "_1" => $a2, "_2" => $a3, "_3" => $a4));
	}
	static function unzip5($array) {
		$a1 = (new _hx_array(array()));
		$a2 = (new _hx_array(array()));
		$a3 = (new _hx_array(array()));
		$a4 = (new _hx_array(array()));
		$a5 = (new _hx_array(array()));
		$array->map(array(new _hx_lambda(array(&$a1, &$a2, &$a3, &$a4, &$a5), "thx_Arrays_20"), 'execute'));
		return _hx_anonymous(array("_0" => $a1, "_1" => $a2, "_2" => $a3, "_3" => $a4, "_4" => $a5));
	}
	static function zip($array1, $array2) {
		$a = $array1->length;
		$b = $array2->length;
		$length = null;
		if($a < $b) {
			$length = $a;
		} else {
			$length = $b;
		}
		$array = (new _hx_array(array()));
		{
			$_g1 = 0;
			$_g = $length;
			while($_g1 < $_g) {
				$i = $_g1++;
				$array->push(_hx_anonymous(array("_0" => $array1[$i], "_1" => $array2[$i])));
				unset($i);
			}
		}
		return $array;
	}
	static function zip3($array1, $array2, $array3) {
		$length = thx_ArrayInts::min((new _hx_array(array($array1->length, $array2->length, $array3->length))));
		$array = (new _hx_array(array()));
		{
			$_g1 = 0;
			while($_g1 < $length) {
				$i = $_g1++;
				$array->push(_hx_anonymous(array("_0" => $array1[$i], "_1" => $array2[$i], "_2" => $array3[$i])));
				unset($i);
			}
		}
		return $array;
	}
	static function zip4($array1, $array2, $array3, $array4) {
		$length = thx_ArrayInts::min((new _hx_array(array($array1->length, $array2->length, $array3->length, $array4->length))));
		$array = (new _hx_array(array()));
		{
			$_g1 = 0;
			while($_g1 < $length) {
				$i = $_g1++;
				$array->push(_hx_anonymous(array("_0" => $array1[$i], "_1" => $array2[$i], "_2" => $array3[$i], "_3" => $array4[$i])));
				unset($i);
			}
		}
		return $array;
	}
	static function zip5($array1, $array2, $array3, $array4, $array5) {
		$length = thx_ArrayInts::min((new _hx_array(array($array1->length, $array2->length, $array3->length, $array4->length, $array5->length))));
		$array = (new _hx_array(array()));
		{
			$_g1 = 0;
			while($_g1 < $length) {
				$i = $_g1++;
				$array->push(_hx_anonymous(array("_0" => $array1[$i], "_1" => $array2[$i], "_2" => $array3[$i], "_3" => $array4[$i], "_4" => $array5[$i])));
				unset($i);
			}
		}
		return $array;
	}
	static function zipAp($ax, $fx) {
		$result = (new _hx_array(array()));
		{
			$_g1 = 0;
			$a = $ax->length;
			$b = $fx->length;
			$_g = null;
			if($a < $b) {
				$_g = $a;
			} else {
				$_g = $b;
			}
			while($_g1 < $_g) {
				$i = $_g1++;
				$tmp = $fx[$i]($ax[$i]);
				$result->push($tmp);
				unset($tmp,$i);
			}
		}
		return $result;
	}
	static function zip2Ap($f, $ax, $bx) {
		$tmp = thx_Functions2::curry($f);
		$tmp1 = $ax->map($tmp);
		return thx_Arrays::zipAp($bx, $tmp1);
	}
	static function zip3Ap($f, $ax, $bx, $cx) {
		$f1 = $f;
		$tmp = array(new _hx_lambda(array(&$f1), "thx_Arrays_21"), 'execute');
		$tmp1 = thx_Arrays::zip2Ap($tmp, $ax, $bx);
		return thx_Arrays::zipAp($cx, $tmp1);
	}
	static function zip4Ap($f, $ax, $bx, $cx, $dx) {
		$f1 = $f;
		$tmp = array(new _hx_lambda(array(&$f1), "thx_Arrays_22"), 'execute');
		$tmp1 = thx_Arrays::zip3Ap($tmp, $ax, $bx, $cx);
		return thx_Arrays::zipAp($dx, $tmp1);
	}
	static function zip5Ap($f, $ax, $bx, $cx, $dx, $ex) {
		$f1 = $f;
		$tmp = array(new _hx_lambda(array(&$f1), "thx_Arrays_23"), 'execute');
		$tmp1 = thx_Arrays::zip4Ap($tmp, $ax, $bx, $cx, $dx);
		return thx_Arrays::zipAp($ex, $tmp1);
	}
	static function withPrepend($arr, $el) {
		return _hx_deref((new _hx_array(array($el))))->concat($arr);
	}
	static function with($arr, $el) {
		return $arr->concat((new _hx_array(array($el))));
	}
	static function withSlice($arr, $other, $start, $length = null) {
		if($length === null) {
			$length = 0;
		}
		$tmp = $arr->slice(0, $start)->concat($other);
		$tmp1 = $arr->slice($start + $length, null);
		return $tmp->concat($tmp1);
	}
	static function withInsert($arr, $el, $pos) {
		$tmp = $arr->slice(0, $pos)->concat((new _hx_array(array($el))));
		$tmp1 = $arr->slice($pos, null);
		return $tmp->concat($tmp1);
	}
	static function maxBy($arr, $ord) {
		$tmp = $arr->length === 0;
		if($tmp) {
			return haxe_ds_Option::$None;
		} else {
			$_e = $ord;
			$tmp1 = array(new _hx_lambda(array(&$_e), "thx_Arrays_24"), 'execute');
			$tmp2 = thx_Arrays::reduce($arr, $tmp1, $arr[0]);
			return haxe_ds_Option::Some($tmp2);
		}
	}
	static function minBy($arr, $ord) {
		$tmp = $arr->length === 0;
		if($tmp) {
			return haxe_ds_Option::$None;
		} else {
			$_e = $ord;
			$tmp1 = array(new _hx_lambda(array(&$_e), "thx_Arrays_25"), 'execute');
			$tmp2 = thx_Arrays::reduce($arr, $tmp1, $arr[0]);
			return haxe_ds_Option::Some($tmp2);
		}
	}
	static function toMap($arr, $keyOrder) {
		$m = thx_fp_MapImpl::$Tip;
		$collisions = (new _hx_array(array()));
		{
			$_g1 = 0;
			$_g = $arr->length;
			while($_g1 < $_g) {
				$i = $_g1++;
				$tuple = $arr[$i];
				$tmp = thx_fp__Map_Map_Impl_::lookup($m, $tuple->_0, $keyOrder);
				if(thx_Options::isNone($tmp)) {
					$m = thx_fp__Map_Map_Impl_::insert($m, $tuple->_0, $tuple->_1, $keyOrder);
				} else {
					$collisions->push($tuple->_0);
				}
				unset($tuple,$tmp,$i);
			}
		}
		$tmp1 = thx__Nel_Nel_Impl_::fromArray($collisions);
		return thx_Options::toFailure($tmp1, $m);
	}
	function __toString() { return 'thx.Arrays'; }
}
function thx_Arrays_0($a, $b) {
	{
		return $a->concat($b);
	}
}
function thx_Arrays_1(&$arr, $i) {
	{
		return $arr[$i];
	}
}
function thx_Arrays_2($v) {
	{
		return null !== $v;
	}
}
function thx_Arrays_3($v) {
	{
		return (new _hx_array(array($v)));
	}
}
function thx_Arrays_4(&$predicate, &$v, $r) {
	{
		return call_user_func_array($predicate, array($r, $v));
	}
}
function thx_Arrays_5($acc, $maybeV) {
	{
		$tmp = $maybeV->index;
		switch($tmp) {
		case 0:{
			$acc->push(_hx_deref($maybeV)->params[0]);
		}break;
		case 1:{}break;
		}
		return $acc;
	}
}
function thx_Arrays_6($acc, $element) {
	{
		return $acc->concat($element);
	}
}
function thx_Arrays_7($acc, $v, $i) {
	{
		$acc[$i * 2] = $v;
		return $acc;
	}
}
function thx_Arrays_8($v, $i) {
	{
		return _hx_anonymous(array("_0" => $v, "_1" => $i));
	}
}
function thx_Arrays_9(&$compare, $a, $b) {
	{
		return call_user_func_array($compare, array($a->_0, $b->_0));
	}
}
function thx_Arrays_10(&$arr, &$compare, &$usedIndexes, $acc, $x, $i1) {
	{
		$index = null;
		$tmp = null;
		if($i1 > 0) {
			$tmp1 = call_user_func_array($compare, array($arr[$i1 - 1]->_0, $x->_0));
			$tmp = $tmp1 === 0;
		} else {
			$tmp = false;
		}
		if($tmp) {
			$index = $acc[$arr[$i1 - 1]->_1];
		} else {
			$index = $i1;
		}
		while(true) {
			$tmp2 = !$usedIndexes->exists($index);
			if($tmp2) {
				break;
			}
			++$index;
			unset($tmp2);
		}
		thx__Set_Set_Impl_::add($usedIndexes, $index);
		$acc[$x->_1] = $index;
		return $acc;
	}
}
function thx_Arrays_11(&$arr, &$compare, $acc1, $x1, $i2) {
	{
		$tmp3 = $x1->_1;
		$tmp4 = null;
		$tmp5 = null;
		if($i2 > 0) {
			$tmp6 = call_user_func_array($compare, array($arr[$i2 - 1]->_0, $x1->_0));
			$tmp5 = $tmp6 === 0;
		} else {
			$tmp5 = false;
		}
		if($tmp5) {
			$tmp4 = $acc1[$arr[$i2 - 1]->_1];
		} else {
			$tmp4 = $i2;
		}
		$acc1[$tmp3] = $tmp4;
		return $acc1;
	}
}
function thx_Arrays_12(&$_e, $a0, $a1) {
	{
		return thx__Monoid_Monoid_Impl_::append($_e, $a0, $a1);
	}
}
function thx_Arrays_13(&$s, $x) {
	{
		return thx__Nel_Nel_Impl_::fold($x, $s);
	}
}
function thx_Arrays_14(&$f, $acc, $t) {
	{
		$tmp1 = call_user_func_array($f, array($t));
		$tmp2 = thx_Options::map($acc, array(new _hx_lambda(array(), "thx_Arrays_26"), 'execute'));
		return thx_Options::ap($tmp1, $tmp2);
	}
}
function thx_Arrays_15(&$f, &$s, $acc, $t) {
	{
		$tmp = call_user_func_array($f, array($t));
		$tmp1 = thx_Either::Right(array(new _hx_lambda(array(), "thx_Arrays_27"), 'execute'));
		$tmp2 = thx__Validation_Validation_Impl_::ap($acc, $tmp1, array(new _hx_lambda(array(), "thx_Arrays_28"), 'execute'));
		return thx__Validation_Validation_Impl_::ap($tmp, $tmp2, $s);
	}
}
function thx_Arrays_16(&$f, &$s, $acc, $t, $i) {
	{
		$tmp = call_user_func_array($f, array($t, $i));
		$tmp1 = thx_Either::Right(array(new _hx_lambda(array(), "thx_Arrays_29"), 'execute'));
		$tmp2 = thx__Validation_Validation_Impl_::ap($acc, $tmp1, array(new _hx_lambda(array(), "thx_Arrays_30"), 'execute'));
		return thx__Validation_Validation_Impl_::ap($tmp, $tmp2, $s);
	}
}
function thx_Arrays_17(&$a1, &$a2, $t) {
	{
		$a1->push($t->_0);
		$a2->push($t->_1);
	}
}
function thx_Arrays_18(&$a1, &$a2, &$a3, $t) {
	{
		$a1->push($t->_0);
		$a2->push($t->_1);
		$a3->push($t->_2);
	}
}
function thx_Arrays_19(&$a1, &$a2, &$a3, &$a4, $t) {
	{
		$a1->push($t->_0);
		$a2->push($t->_1);
		$a3->push($t->_2);
		$a4->push($t->_3);
	}
}
function thx_Arrays_20(&$a1, &$a2, &$a3, &$a4, &$a5, $t) {
	{
		$a1->push($t->_0);
		$a2->push($t->_1);
		$a3->push($t->_2);
		$a4->push($t->_3);
		$a5->push($t->_4);
	}
}
function thx_Arrays_21(&$f1, $a, $b) {
	{
		return array(new _hx_lambda(array(&$a, &$b, &$f1), "thx_Arrays_31"), 'execute');
	}
}
function thx_Arrays_22(&$f1, $a, $b, $c) {
	{
		return array(new _hx_lambda(array(&$a, &$b, &$c, &$f1), "thx_Arrays_32"), 'execute');
	}
}
function thx_Arrays_23(&$f1, $a, $b, $c, $d) {
	{
		return array(new _hx_lambda(array(&$a, &$b, &$c, &$d, &$f1), "thx_Arrays_33"), 'execute');
	}
}
function thx_Arrays_24(&$_e, $a0, $a1) {
	{
		return thx__Ord_Ord_Impl_::max($_e, $a0, $a1);
	}
}
function thx_Arrays_25(&$_e, $a0, $a1) {
	{
		return thx__Ord_Ord_Impl_::min($_e, $a0, $a1);
	}
}
function thx_Arrays_26($ux) {
	{
		return array(new _hx_lambda(array(&$ux), "thx_Arrays_34"), 'execute');
	}
}
function thx_Arrays_27($ux) {
	{
		return array(new _hx_lambda(array(&$ux), "thx_Arrays_35"), 'execute');
	}
}
function thx_Arrays_28($e1, $e2) {
	{
		throw new HException("Unreachable");
	}
}
function thx_Arrays_29($ux) {
	{
		return array(new _hx_lambda(array(&$ux), "thx_Arrays_36"), 'execute');
	}
}
function thx_Arrays_30($e1, $e2) {
	{
		throw new HException("Unreachable");
	}
}
function thx_Arrays_31(&$a, &$b, &$f1, $c) {
	{
		return call_user_func_array($f1, array($a, $b, $c));
	}
}
function thx_Arrays_32(&$a, &$b, &$c, &$f1, $d) {
	{
		return call_user_func_array($f1, array($a, $b, $c, $d));
	}
}
function thx_Arrays_33(&$a, &$b, &$c, &$d, &$f1, $e) {
	{
		return call_user_func_array($f1, array($a, $b, $c, $d, $e));
	}
}
function thx_Arrays_34(&$ux, $u) {
	{
		$ux->push($u);
		return $ux;
	}
}
function thx_Arrays_35(&$ux, $u) {
	{
		$ux->push($u);
		return $ux;
	}
}
function thx_Arrays_36(&$ux, $u) {
	{
		$ux->push($u);
		return $ux;
	}
}
