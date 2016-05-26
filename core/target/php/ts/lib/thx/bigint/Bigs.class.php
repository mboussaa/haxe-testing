<?php

// Generated by Haxe 3.3.0
class thx_bigint_Bigs {
	public function __construct(){}
	static $BASE = 10000000;
	static $DOUBLE_BASE = 100000000000000.0;
	static $LOG_BASE = 7;
	static $MAX_INT = 2147483647;
	static $MAX_INT_ARR;
	static $LOG_MAX_INT;
	static $powersOfTwo;
	static $bigPowersOfTwo;
	static $powers2Length;
	static $highestPower2;
	static $bigHighestPower2;
	static function isPrecise($value) {
		if(-thx_bigint_Bigs::$MAX_INT < $value) {
			return $value < thx_bigint_Bigs::$MAX_INT;
		} else {
			return false;
		}
	}
	static function canMultiply($a, $b) {
		$tmp = null;
		if($a !== 0) {
			$tmp = $b === 0;
		} else {
			$tmp = true;
		}
		if($tmp) {
			return true;
		}
		$v = $a * $b;
		if(!_hx_equal($a, $v / $b)) {
			return false;
		}
		return thx_bigint_Bigs::isPrecise($v);
	}
	static function canPower($a, $b) {
		$tmp = null;
		if($a !== 0) {
			$tmp = $b === 0;
		} else {
			$tmp = true;
		}
		if($tmp) {
			return true;
		}
		$a1 = Math::abs($a);
		$b1 = Math::abs($b);
		$v = null;
		try {
			$tmp1 = Math::pow($a1, $b1);
			$v = Std::int($tmp1);
		}catch(Exception $__hx__e) {
			$_ex_ = ($__hx__e instanceof HException) && $__hx__e->getCode() == null ? $__hx__e->e : $__hx__e;
			$e = $_ex_;
			{
				return false;
			}
		}
		$tmp2 = Math::pow($v, 1.0 / $b1);
		$tmp3 = Std::int($tmp2);
		if(!_hx_equal($tmp3, $a1)) {
			return false;
		}
		return thx_bigint_Bigs::isPrecise($v);
	}
	static function canAdd($a, $b) {
		$v = $a + $b;
		$tmp = null;
		$tmp1 = null;
		if($a > 0) {
			$tmp1 = $b > 0;
		} else {
			$tmp1 = false;
		}
		if($tmp1) {
			$tmp = $v < 0;
		} else {
			$tmp = false;
		}
		if($tmp) {
			return false;
		}
		return thx_bigint_Bigs::isPrecise($v);
	}
	static function smallToArray($n) {
		thx_Assert::isTrue($n >= 0, "Bigs.smallToArray should always be non-negative: " . _hx_string_rec($n, ""), _hx_anonymous(array("fileName" => "Bigs.hx", "lineNumber" => 57, "className" => "thx.bigint.Bigs", "methodName" => "smallToArray")));
		if($n < 10000000) {
			return (new _hx_array(array($n)));
		}
		if($n < 100000000000000.0) {
			$tmp = _hx_mod($n, 10000000);
			$tmp1 = Math::floor($n / 10000000);
			return (new _hx_array(array($tmp, $tmp1)));
		}
		$tmp2 = _hx_mod($n, 10000000);
		$tmp3 = Math::floor($n / 10000000);
		$tmp4 = _hx_mod($tmp3, 10000000);
		$tmp5 = Math::floor($n / 100000000000000.0);
		return (new _hx_array(array($tmp2, $tmp4, $tmp5)));
	}
	static function arrayToSmall($arr) {
		thx_bigint_Bigs::trim($arr);
		$length = $arr->length;
		$tmp = null;
		if($length < 4) {
			$tmp = thx_bigint_Bigs::compareToAbs($arr, thx_bigint_Bigs::$MAX_INT_ARR) < 0;
		} else {
			$tmp = false;
		}
		if($tmp) {
			switch($length) {
			case 0:{
				return 0;
			}break;
			case 1:{
				return $arr[0];
			}break;
			case 2:{
				return $arr->a[0] + $arr->a[1] * 10000000;
			}break;
			default:{
				return $arr->a[0] + ($arr->a[1] + $arr->a[2] * 10000000) * 10000000;
			}break;
			}
		}
		return null;
	}
	static function trim($v) {
		while($v->length > 1) {
			if($v[$v->length - 1] !== 0) {
				break;
			}
			$v->pop();
		}
	}
	static function createArray($length) {
		$x = (new _hx_array(array()));
		{
			$_g1 = 0;
			while($_g1 < $length) {
				$i = $_g1++;
				$x[$i] = 0;
				unset($i);
			}
		}
		return $x;
	}
	static function createFloatArray($length) {
		$x = (new _hx_array(array()));
		{
			$_g1 = 0;
			while($_g1 < $length) {
				$i = $_g1++;
				$x[$i] = 0.0;
				unset($i);
			}
		}
		return $x;
	}
	static function add($a, $b) {
		$l_a = $a->length;
		$l_b = $b->length;
		$r = (new _hx_array(array()));
		$carry = 0;
		$sum = null;
		$i = 0;
		while($i < $l_b) {
			$sum = $a->a[$i] + $b[$i] + $carry;
			if($sum >= 10000000) {
				$carry = 1;
			} else {
				$carry = 0;
			}
			$tmp = $i++;
			$r[$tmp] = $sum - $carry * 10000000;
			unset($tmp);
		}
		while($i < $l_a) {
			$sum = $a->a[$i] + $carry;
			if($sum === 10000000) {
				$carry = 1;
			} else {
				$carry = 0;
			}
			$tmp1 = $i++;
			$r[$tmp1] = $sum - $carry * 10000000;
			unset($tmp1);
		}
		if($carry > 0) {
			$r->push($carry);
		}
		return $r;
	}
	static function addAny($a, $b) {
		$tmp = $a->length >= $b->length;
		if($tmp) {
			return thx_bigint_Bigs::add($a, $b);
		}
		return thx_bigint_Bigs::add($b, $a);
	}
	static function addSmall($a, $carry) {
		$l = $a->length;
		$r = (new _hx_array(array()));
		$sum = null;
		$i = 0;
		while($i < $l) {
			$sum = $a->a[$i] - 10000000 + $carry;
			$carry = Math::floor($sum / 10000000);
			$tmp = $i++;
			$r[$tmp] = $sum - $carry * 10000000;
			++$carry;
			unset($tmp);
		}
		while($carry > 0) {
			$tmp1 = $i++;
			$r[$tmp1] = _hx_mod($carry, 10000000);
			$carry = Math::floor($carry / 10000000);
			unset($tmp1);
		}
		return $r;
	}
	static function compareToAbs($a, $b) {
		if($a->length !== $b->length) {
			if($a->length > $b->length) {
				return 1;
			} else {
				return -1;
			}
		}
		$i = $a->length;
		while(true) {
			$tmp = --$i;
			if(!($tmp >= 0)) {
				break;
			}
			if($a[$i] !== $b[$i]) {
				if($a->a[$i] > $b[$i]) {
					return 1;
				} else {
					return -1;
				}
			}
			unset($tmp);
		}
		return 0;
	}
	static function subtract($a, $b) {
		$a_l = $a->length;
		$b_l = $b->length;
		$r = (new _hx_array(array()));
		$borrow = 0;
		$i = 0;
		$difference = null;
		while($i < $b_l) {
			$difference = $a->a[$i] - $borrow - $b[$i];
			$tmp = $difference < 0;
			if($tmp) {
				$difference += 10000000;
				$borrow = 1;
			} else {
				$borrow = 0;
			}
			$tmp1 = $i++;
			$r[$tmp1] = $difference;
			unset($tmp1,$tmp);
		}
		while($i < $a_l) {
			$difference = $a->a[$i] - $borrow;
			if($difference < 0) {
				$difference += 10000000;
			} else {
				$tmp2 = $i++;
				$r[$tmp2] = $difference;
				break;
				unset($tmp2);
			}
			$tmp3 = $i++;
			$r[$tmp3] = $difference;
			unset($tmp3);
		}
		while($i < $a_l) {
			$r[$i] = $a[$i];
			++$i;
		}
		thx_bigint_Bigs::trim($r);
		return $r;
	}
	static function subtractAny($a, $b, $sign) {
		$value = null;
		if(thx_bigint_Bigs::compareToAbs($a, $b) >= 0) {
			$value = thx_bigint_Bigs::subtract($a, $b);
		} else {
			$value = thx_bigint_Bigs::subtract($b, $a);
			$sign = !$sign;
		}
		$n = thx_bigint_Bigs::arrayToSmall($value);
		$tmp = null !== $n;
		if($tmp) {
			if($sign) {
				$n = -$n;
			}
			return new thx_bigint_Small($n);
		}
		return new thx_bigint_Big($value, $sign);
	}
	static function subtractSmall($a, $b, $sign) {
		$l = $a->length;
		$r = (new _hx_array(array()));
		$carry = -$b;
		$difference = null;
		{
			$_g1 = 0;
			while($_g1 < $l) {
				$i = $_g1++;
				$difference = $a->a[$i] + $carry;
				$carry = Math::floor($difference / 10000000);
				$tmp = null;
				if($difference < 0) {
					$tmp = _hx_mod($difference, 10000000) + 10000000;
				} else {
					$tmp = $difference;
				}
				$r[$i] = $tmp;
				unset($tmp,$i);
			}
		}
		$n = thx_bigint_Bigs::arrayToSmall($r);
		$tmp1 = null !== $n;
		if($tmp1) {
			if($sign) {
				$n = -$n;
			}
			return new thx_bigint_Small($n);
		}
		return new thx_bigint_Big($r, $sign);
	}
	static function multiplyLong($a, $b) {
		$a_l = $a->length;
		$b_l = $b->length;
		$r = thx_bigint_Bigs::createFloatArray($a_l + $b_l);
		$product = null;
		$carry = null;
		$a_i = null;
		$b_j = null;
		{
			$_g1 = 0;
			while($_g1 < $a_l) {
				$i = $_g1++;
				$a_i = $a[$i];
				{
					$_g3 = 0;
					while($_g3 < $b_l) {
						$j = $_g3++;
						$b_j = $b[$j];
						$product = $a_i * $b_j + $r[$i + $j];
						$value = $product / 10000000;
						if($value < 0.0) {
							$carry = Math::fceil($value);
						} else {
							$carry = Math::ffloor($value);
						}
						$tmp = $i + $j;
						$value1 = $product - $carry * 10000000;
						$tmp1 = null;
						if($value1 < 0.0) {
							$tmp1 = Math::fceil($value1);
						} else {
							$tmp1 = Math::ffloor($value1);
						}
						$r[$tmp] = $tmp1;
						$r->a[$i + $j + 1] += $carry;
						unset($value1,$value,$tmp1,$tmp,$j);
					}
					unset($_g3);
				}
				unset($i);
			}
		}
		$arr = $r->map(array(new _hx_lambda(array(), "thx_bigint_Bigs_0"), 'execute'));
		thx_bigint_Bigs::trim($arr);
		return $arr;
	}
	static function multiplySmall($a, $b) {
		$l = $a->length;
		$r = (new _hx_array(array()));
		$carry = 0.0;
		$product = null;
		$i = 0;
		$bf = $b;
		while($i < $l) {
			$product = $carry + $a->a[$i] * $bf;
			$value = $product / 10000000;
			if($value < 0.0) {
				$carry = Math::fceil($value);
			} else {
				$carry = Math::ffloor($value);
			}
			$tmp = $i++;
			$r[$tmp] = $product - $carry * 10000000;
			unset($value,$tmp);
		}
		while($carry > 0) {
			$tmp1 = $i++;
			$r[$tmp1] = _hx_mod($carry, 10000000);
			$value1 = $carry / 10000000;
			if($value1 < 0.0) {
				$carry = Math::fceil($value1);
			} else {
				$carry = Math::ffloor($value1);
			}
			unset($value1,$tmp1);
		}
		$arr = $r->map(array(new _hx_lambda(array(), "thx_bigint_Bigs_1"), 'execute'));
		thx_bigint_Bigs::trim($arr);
		return $arr;
	}
	static function shiftLeft($x, $n) {
		$r = (new _hx_array(array()));
		while(true) {
			$tmp = $n--;
			if(!($tmp > 0)) {
				break;
			}
			$r->push(0);
			unset($tmp);
		}
		return $r->concat($x);
	}
	static function multiplyKaratsuba($x, $y) {
		$a = $x->length;
		$b = $y->length;
		$n = null;
		if($a > $b) {
			$n = $a;
		} else {
			$n = $b;
		}
		if($n <= 400) {
			return thx_bigint_Bigs::multiplyLong($x, $y);
		}
		$n = Math::ceil($n / 2);
		$b1 = $x->slice($n, null);
		$a1 = $x->slice(0, $n);
		$d = $y->slice($n, null);
		$c = $y->slice(0, $n);
		$ac = thx_bigint_Bigs::multiplyKaratsuba($a1, $c);
		$bd = thx_bigint_Bigs::multiplyKaratsuba($b1, $d);
		$tmp = thx_bigint_Bigs::addAny($a1, $b1);
		$tmp1 = thx_bigint_Bigs::addAny($c, $d);
		$abcd = thx_bigint_Bigs::multiplyKaratsuba($tmp, $tmp1);
		$tmp2 = thx_bigint_Bigs::subtract($abcd, $ac);
		$tmp3 = thx_bigint_Bigs::subtract($tmp2, $bd);
		$tmp4 = thx_bigint_Bigs::shiftLeft($tmp3, $n);
		$tmp5 = thx_bigint_Bigs::addAny($ac, $tmp4);
		$tmp6 = thx_bigint_Bigs::shiftLeft($bd, 2 * $n);
		return thx_bigint_Bigs::addAny($tmp5, $tmp6);
	}
	static function fromInt($value) {
		$abs = null;
		if($value < 0) {
			$abs = -$value;
		} else {
			$abs = $value;
		}
		if($abs < 10000000) {
			return new thx_bigint_Small($value);
		} else {
			$tmp = thx_bigint_Bigs::smallToArray($abs);
			return new thx_bigint_Big($tmp, $value < 0);
		}
	}
	static function fromInt64($value) {
		$tmp = haxe__Int64_Int64_Impl_::toString($value);
		return thx_bigint_Bigs::parseBase($tmp, 10);
	}
	static function toInt64($value) {
		$tmp = $value->toString();
		return thx_Int64s::parse($tmp);
	}
	static function fromFloat($value) {
		$tmp = null;
		$tmp1 = !Math::isNaN($value);
		if($tmp1) {
			$tmp = !Math::isFinite($value);
		} else {
			$tmp = true;
		}
		if($tmp) {
			throw new HException(new thx_Error("Conversion to BigInt failed. Number is NaN or Infinite", null, _hx_anonymous(array("fileName" => "Bigs.hx", "lineNumber" => 305, "className" => "thx.bigint.Bigs", "methodName" => "fromFloat"))));
		}
		$noFractions = $value - _hx_mod($value, 1);
		$result = thx_bigint_Small::$zero;
		$neg = $noFractions < 0.0;
		$rest = null;
		if($neg) {
			$rest = -$noFractions;
		} else {
			$rest = $noFractions;
		}
		$i = 0;
		$curr = null;
		while($rest >= 1) {
			$curr = _hx_mod($rest, 2);
			$rest /= 2;
			if($curr >= 1) {
				$tmp2 = thx_bigint_Small::$one->shiftLeft($i);
				$result = $result->add($tmp2);
				unset($tmp2);
			}
			++$i;
		}
		if($neg) {
			return $result->negate();
		} else {
			return $result;
		}
	}
	static function square($a) {
		$l = $a->length;
		$r = thx_bigint_Bigs::createFloatArray($l + $l);
		$product = null;
		$carry = null;
		$a_i = null;
		$a_j = null;
		{
			$_g1 = 0;
			while($_g1 < $l) {
				$i = $_g1++;
				$a_i = $a[$i];
				{
					$_g3 = 0;
					while($_g3 < $l) {
						$j = $_g3++;
						$a_j = $a[$j];
						$product = $a_i * $a_j + $r[$i + $j];
						$value = $product / 10000000;
						if($value < 0.0) {
							$carry = Math::fceil($value);
						} else {
							$carry = Math::ffloor($value);
						}
						$tmp = $i + $j;
						$value1 = $product - $carry * 10000000;
						$tmp1 = null;
						if($value1 < 0.0) {
							$tmp1 = Math::fceil($value1);
						} else {
							$tmp1 = Math::ffloor($value1);
						}
						$r[$tmp] = $tmp1;
						$r->a[$i + $j + 1] += $carry;
						unset($value1,$value,$tmp1,$tmp,$j);
					}
					unset($_g3);
				}
				unset($i);
			}
		}
		$arr = $r->map(array(new _hx_lambda(array(), "thx_bigint_Bigs_2"), 'execute'));
		thx_bigint_Bigs::trim($arr);
		return $arr;
	}
	static function divMod1($a, $b) {
		$a_l = $a->length;
		$b_l = $b->length;
		$result = thx_bigint_Bigs::createFloatArray($b->length);
		$divisorMostSignificantDigit = $b[$b_l - 1];
		$lambda = Math::ceil(10000000 / (2 * $divisorMostSignificantDigit));
		$remainder = thx_bigint_Bigs::multiplySmall($a, $lambda)->map(array(new _hx_lambda(array(), "thx_bigint_Bigs_3"), 'execute'));
		$divisor = thx_bigint_Bigs::multiplySmall($b, $lambda);
		$quotientDigit = null;
		$shift = null;
		$carry = null;
		$borrow = null;
		$l = null;
		$q = null;
		$tmp = $remainder->length <= $a_l;
		if($tmp) {
			$remainder->push(0.0);
		}
		$divisor->push(0);
		$divisorMostSignificantDigit = $divisor[$b_l - 1];
		$shift = $a_l - $b_l;
		while($shift >= 0) {
			$quotientDigit = 9999999.;
			$quotientDigit = Math::ffloor(($remainder->a[$shift + $b_l] * 10000000 + $remainder[$shift + $b_l - 1]) / $divisorMostSignificantDigit);
			$carry = 0.0;
			$borrow = 0.0;
			$l = $divisor->length;
			{
				$_g1 = 0;
				while($_g1 < $l) {
					$i = $_g1++;
					$carry += $quotientDigit * $divisor[$i];
					$value = $carry / 10000000;
					if($value < 0.0) {
						$q = Math::fceil($value);
					} else {
						$q = Math::ffloor($value);
					}
					$borrow += $remainder->a[$shift + $i] - ($carry - $q * 10000000);
					$carry = $q;
					if($borrow < 0.0) {
						$remainder[$shift + $i] = $borrow + 10000000;
						$borrow = -1.0;
					} else {
						$remainder[$shift + $i] = $borrow;
						$borrow = 0.0;
					}
					unset($value,$i);
				}
				unset($_g1);
			}
			while(!_hx_equal($borrow, 0)) {
				--$quotientDigit;
				$carry = 0;
				{
					$_g11 = 0;
					while($_g11 < $l) {
						$i1 = $_g11++;
						$carry += $remainder->a[$shift + $i1] - 10000000 + $divisor[$i1];
						if($carry < 0) {
							$remainder[$shift + $i1] = $carry + 10000000;
							$carry = 0;
						} else {
							$remainder[$shift + $i1] = $carry;
							$carry = 1;
						}
						unset($i1);
					}
					unset($_g11);
				}
				$borrow += $carry;
			}
			$result[$shift] = $quotientDigit;
			--$shift;
		}
		$arr = $remainder->map(array(new _hx_lambda(array(), "thx_bigint_Bigs_4"), 'execute'));
		$remainder1 = thx_bigint_Bigs::divModSmall($arr, $lambda)->q;
		$arr1 = $result->map(array(new _hx_lambda(array(), "thx_bigint_Bigs_5"), 'execute'));
		thx_bigint_Bigs::trim($arr1);
		$tmp1 = thx_bigint_Bigs::arrayToSmall($arr1);
		$q1 = _hx_anonymous(array("small" => $tmp1, "big" => $arr1));
		$tmp2 = thx_bigint_Bigs::arrayToSmall($remainder1);
		return (new _hx_array(array($q1, _hx_anonymous(array("small" => $tmp2, "big" => $remainder1)))));
	}
	static function divMod2($a, $b) {
		$a_l = $a->length;
		$b_l = $b->length;
		$result = (new _hx_array(array()));
		$part = (new _hx_array(array()));
		$guess = null;
		$xlen = null;
		$highx = null;
		$highy = null;
		$check = null;
		while($a_l !== 0) {
			$tmp = --$a_l;
			$part->unshift($a[$tmp]);
			if(thx_bigint_Bigs::compareToAbs($part, $b) < 0) {
				$result->push(0);
				continue;
			}
			$xlen = $part->length;
			$highx = $part->a[$xlen - 1] * 10000000 + $part[$xlen - 2];
			$highy = $b->a[$b_l - 1] * 10000000 + $b[$b_l - 2];
			if($xlen > $b_l) {
				$tmp1 = $highx + 1;
				$highx = $tmp1 * 10000000;
				unset($tmp1);
			}
			$guess = Math::ceil($highx / $highy);
			while(true) {
				$check = thx_bigint_Bigs::multiplySmall($b, $guess);
				if(thx_bigint_Bigs::compareToAbs($check, $part) <= 0) {
					break;
				}
				--$guess;
				if(!($guess !== 0)) {
					break;
				}
			}
			$result->push($guess);
			$part = thx_bigint_Bigs::subtract($part, $check);
			unset($tmp);
		}
		$result->reverse();
		$tmp2 = thx_bigint_Bigs::arrayToSmall($result);
		$tmp3 = _hx_anonymous(array("small" => $tmp2, "big" => $result));
		$tmp4 = thx_bigint_Bigs::arrayToSmall($part);
		return (new _hx_array(array($tmp3, _hx_anonymous(array("small" => $tmp4, "big" => $part)))));
	}
	static function divModSmall($value, $lambda) {
		$length = $value->length;
		$quotient = thx_bigint_Bigs::createArray($length);
		$i = null;
		$q = null;
		$remainder = null;
		$divisor = null;
		$remainder = 0;
		$i = $length - 1;
		while($i >= 0) {
			$divisor = $remainder * 10000000 + $value[$i];
			$value1 = $divisor / $lambda;
			if($value1 < 0.0) {
				$q = Math::fceil($value1);
			} else {
				$q = Math::ffloor($value1);
			}
			$remainder = $divisor - $q * $lambda;
			$tmp = $i--;
			$tmp1 = Std::int($q);
			$quotient[$tmp] = $tmp1;
			unset($value1,$tmp1,$tmp);
		}
		$tmp2 = null;
		if($remainder < 0.0) {
			$tmp2 = Math::ceil($remainder);
		} else {
			$tmp2 = Math::floor($remainder);
		}
		return _hx_anonymous(array("q" => $quotient, "r" => $tmp2));
	}
	static function parseBase($text, $base) {
		$val = thx_bigint_Small::$zero;
		$pow = thx_bigint_Small::$one;
		$bigBase = new thx_bigint_Small($base);
		$tmp = _hx_substring($text, 0, 1);
		$isNegative = $tmp === "-";
		$tmp1 = null;
		if(2 <= $base) {
			$tmp1 = $base > 36;
		} else {
			$tmp1 = true;
		}
		if($tmp1) {
			throw new HException(new thx_Error("base (" . _hx_string_rec($base, "") . ") must be a number between 2 ad 36", null, _hx_anonymous(array("fileName" => "Bigs.hx", "lineNumber" => 475, "className" => "thx.bigint.Bigs", "methodName" => "parseBase"))));
		}
		if($isNegative) {
			$text = _hx_substring($text, 1, null);
		}
		$text = strtolower(thx_Strings::trimCharsLeft($text, "0"));
		$tmp2 = strlen($text) === 0;
		if($tmp2) {
			$text = "0";
		}
		$e = null;
		$tmp3 = null;
		if($base === 10) {
			$e = _hx_index_of($text, "e", null);
			$tmp3 = $e > 0;
		} else {
			$tmp3 = false;
		}
		if($tmp3) {
			$sexp = _hx_substring($text, $e + 1, null);
			$text = _hx_substring($text, 0, $e);
			$exp = null;
			$tmp4 = StringTools::startsWith($sexp, "+");
			if($tmp4) {
				$tmp5 = _hx_substring($sexp, 1, null);
				$exp = Std::parseInt($tmp5);
			} else {
				$exp = Std::parseInt($sexp);
			}
			$decimalPlace = _hx_index_of($text, ".", null);
			if($decimalPlace >= 0) {
				$exp -= strlen($text) - $decimalPlace;
				$tmp6 = _hx_substring($text, 0, $decimalPlace);
				$tmp7 = _hx_substring($text, 1 + $decimalPlace, null);
				$text = _hx_string_or_null($tmp6) . _hx_string_or_null($tmp7);
			}
			$tmp8 = strlen($text) + $exp;
			$text = thx_Strings::rpad($text, "0", $tmp8);
		}
		$length = strlen($text);
		$tmp9 = thx_bigint_Bigs::$LOG_MAX_INT;
		$tmp10 = Math::log($base);
		if($length <= $tmp9 / $tmp10) {
			$tmp11 = thx_Ints::parse($text, $base);
			$tmp12 = null;
			if($isNegative) {
				$tmp12 = -1;
			} else {
				$tmp12 = 1;
			}
			return new thx_bigint_Small($tmp11 * $tmp12);
		}
		$digits = (new _hx_array(array()));
		{
			$_g1 = 0;
			while($_g1 < $length) {
				$i = $_g1++;
				$charCode = _hx_char_code_at($text, $i);
				$tmp13 = null;
				if(48 <= $charCode) {
					$tmp13 = $charCode <= 57;
				} else {
					$tmp13 = false;
				}
				if($tmp13) {
					$digits->push(new thx_bigint_Small($charCode - 48));
				} else {
					$tmp14 = null;
					if(97 <= $charCode) {
						$tmp14 = $charCode <= 122;
					} else {
						$tmp14 = false;
					}
					if($tmp14) {
						$digits->push(new thx_bigint_Small($charCode - 87));
					} else {
						throw new HException(new thx_Error("" . _hx_string_or_null($text) . " is not a valid string", null, _hx_anonymous(array("fileName" => "Bigs.hx", "lineNumber" => 509, "className" => "thx.bigint.Bigs", "methodName" => "parseBase"))));
					}
					unset($tmp14);
				}
				unset($tmp13,$i,$charCode);
			}
		}
		$digits->reverse();
		$mul = null;
		{
			$_g11 = 0;
			$_g = $digits->length;
			while($_g11 < $_g) {
				$i1 = $_g11++;
				$mul = _hx_array_get($digits, $i1)->multiply($pow);
				$val = $val->add($mul);
				$pow = $pow->multiply($bigBase);
				unset($i1);
			}
		}
		if($isNegative) {
			return $val->negate();
		} else {
			return $val;
		}
	}
	static function bitwise($x, $y, $fn) {
		$xSign = $x->sign;
		$ySign = $y->sign;
		$xRem = null;
		if($xSign) {
			$xRem = $x->not();
		} else {
			$xRem = $x;
		}
		$yRem = null;
		if($ySign) {
			$yRem = $y->not();
		} else {
			$yRem = $y;
		}
		$xBits = (new _hx_array(array()));
		$yBits = (new _hx_array(array()));
		$xStop = false;
		$yStop = false;
		while(true) {
			$tmp = null;
			if(!(!$xStop)) {
				$tmp = !$yStop;
			} else {
				$tmp = true;
			}
			if(!$tmp) {
				break;
			}
			$tmp1 = $xRem->isZero();
			if($tmp1) {
				$xStop = true;
				$tmp2 = null;
				if($xSign) {
					$tmp2 = 1;
				} else {
					$tmp2 = 0;
				}
				$xBits->push($tmp2);
				unset($tmp2);
			} else {
				if($xSign) {
					$tmp3 = null;
					$tmp4 = $xRem->isEven();
					if($tmp4) {
						$tmp3 = 1;
					} else {
						$tmp3 = 0;
					}
					$xBits->push($tmp3);
					unset($tmp4,$tmp3);
				} else {
					$tmp5 = null;
					$tmp6 = $xRem->isEven();
					if($tmp6) {
						$tmp5 = 0;
					} else {
						$tmp5 = 1;
					}
					$xBits->push($tmp5);
					unset($tmp6,$tmp5);
				}
			}
			$tmp7 = $yRem->isZero();
			if($tmp7) {
				$yStop = true;
				$tmp8 = null;
				if($ySign) {
					$tmp8 = 1;
				} else {
					$tmp8 = 0;
				}
				$yBits->push($tmp8);
				unset($tmp8);
			} else {
				if($ySign) {
					$tmp9 = null;
					$tmp10 = $yRem->isEven();
					if($tmp10) {
						$tmp9 = 1;
					} else {
						$tmp9 = 0;
					}
					$yBits->push($tmp9);
					unset($tmp9,$tmp10);
				} else {
					$tmp11 = null;
					$tmp12 = $yRem->isEven();
					if($tmp12) {
						$tmp11 = 0;
					} else {
						$tmp11 = 1;
					}
					$yBits->push($tmp11);
					unset($tmp12,$tmp11);
				}
			}
			$xRem = $xRem->divide(thx_bigint_Small::$two);
			$yRem = $yRem->divide(thx_bigint_Small::$two);
			unset($tmp7,$tmp1,$tmp);
		}
		$result = (new _hx_array(array()));
		{
			$_g1 = 0;
			$_g = $xBits->length;
			while($_g1 < $_g) {
				$i = $_g1++;
				$tmp13 = call_user_func_array($fn, array($xBits[$i], $yBits[$i]));
				$result->push($tmp13);
				unset($tmp13,$i);
			}
		}
		$tmp14 = $result->pop();
		$a = thx_bigint_Bigs::fromInt($tmp14);
		$tmp15 = thx_bigint_Bigs::fromInt($result->length);
		$p = thx_bigint_Small::$two->pow($tmp15);
		$sum = $a->negate()->multiply($p);
		while($result->length > 0) {
			$tmp16 = $result->pop();
			$a = thx_bigint_Bigs::fromInt($tmp16);
			$tmp17 = thx_bigint_Bigs::fromInt($result->length);
			$p = thx_bigint_Small::$two->pow($tmp17);
			$tmp18 = $a->multiply($p);
			$sum = $sum->add($tmp18);
			unset($tmp18,$tmp17,$tmp16);
		}
		return $sum;
	}
	function __toString() { return 'thx.bigint.Bigs'; }
}
thx_bigint_Bigs::$MAX_INT_ARR = thx_bigint_Bigs::smallToArray(thx_bigint_Bigs::$MAX_INT);
thx_bigint_Bigs::$LOG_MAX_INT = Math::log(thx_bigint_Bigs::$MAX_INT);
thx_bigint_Bigs::$powersOfTwo = thx_bigint_Bigs_6();
thx_bigint_Bigs::$bigPowersOfTwo = thx_bigint_Bigs::$powersOfTwo->map(array(new _hx_lambda(array(), "thx_bigint_Bigs_7"), 'execute'));
thx_bigint_Bigs::$powers2Length = thx_bigint_Bigs::$powersOfTwo->length;
thx_bigint_Bigs::$highestPower2 = thx_bigint_Bigs::$powersOfTwo[thx_bigint_Bigs::$powers2Length - 1];
thx_bigint_Bigs::$bigHighestPower2 = new thx_bigint_Small(thx_bigint_Bigs::$highestPower2);
function thx_bigint_Bigs_0($v) {
	{
		return Std::int($v);
	}
}
function thx_bigint_Bigs_1($v) {
	{
		return Std::int($v);
	}
}
function thx_bigint_Bigs_2($v) {
	{
		return Std::int($v);
	}
}
function thx_bigint_Bigs_3($v) {
	{
		return $v;
	}
}
function thx_bigint_Bigs_4($v1) {
	{
		return Std::int($v1);
	}
}
function thx_bigint_Bigs_5($v2) {
	{
		return Std::int($v2);
	}
}
function thx_bigint_Bigs_6() {
	{
		$powers = (new _hx_array(array(1)));
		while($powers->a[$powers->length - 1] <= 10000000) {
			$tmp = $powers[$powers->length - 1];
			$powers->push(2 * $tmp);
			unset($tmp);
		}
		return $powers;
	}
}
function thx_bigint_Bigs_7($v) {
	{
		return new thx_bigint_Small($v);
	}
}
