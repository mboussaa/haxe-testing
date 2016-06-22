<?php

// Generated by Haxe 3.3.0
class thx_format_BigIntFormat {
	public function __construct(){}
	static function binary($i, $significantDigits = null) {
		if($significantDigits === null) {
			$significantDigits = 1;
		}
		$tmp = null;
		if($significantDigits === 0) {
			$tmp = $i->isZero();
		} else {
			$tmp = false;
		}
		if($tmp) {
			return "";
		} else {
			$s = $i->toStringWithBase(2);
			$tmp1 = null;
			if(strlen("0") !== 0) {
				$tmp1 = strlen($s) >= $significantDigits;
			} else {
				$tmp1 = true;
			}
			if($tmp1) {
				return $s;
			} else {
				return str_pad($s, Math::ceil(($significantDigits - strlen($s)) / strlen("0")) * strlen("0") + strlen($s), "0", STR_PAD_LEFT);
			}
		}
	}
	static function currency($i, $precision = null, $symbol = null, $culture = null) {
		return thx_format_DecimalFormat::currency(thx__Decimal_Decimal_Impl_::fromBigInt($i), $precision, $symbol, $culture);
	}
	static function customFormat($i, $pattern, $culture = null) {
		return thx_format_DecimalFormat::customFormat(thx__Decimal_Decimal_Impl_::fromBigInt($i), $pattern, $culture);
	}
	static function decimal($i, $significantDigits = null, $culture = null) {
		if($significantDigits === null) {
			$significantDigits = 1;
		}
		return thx_format_DecimalFormat::decimal(thx__Decimal_Decimal_Impl_::fromBigInt($i), $significantDigits, $culture);
	}
	static function exponential($i, $precision = null, $digits = null, $symbol = null, $culture = null) {
		if($symbol === null) {
			$symbol = "e";
		}
		if($digits === null) {
			$digits = 3;
		}
		if($precision === null) {
			$precision = 6;
		}
		return thx_format_DecimalFormat::exponential(thx__Decimal_Decimal_Impl_::fromBigInt($i), $precision, $digits, $symbol, $culture);
	}
	static function fixed($i, $precision = null, $culture = null) {
		return thx_format_DecimalFormat::fixed(thx__Decimal_Decimal_Impl_::fromBigInt($i), $precision, $culture);
	}
	static function format($i, $pattern, $culture = null) {
		return thx_format_DecimalFormat::format(thx__Decimal_Decimal_Impl_::fromBigInt($i), $pattern, $culture);
	}
	static function general($i, $significantDigits = null, $culture = null) {
		return thx_format_DecimalFormat::general(thx__Decimal_Decimal_Impl_::fromBigInt($i), $significantDigits, $culture);
	}
	static function hex($i, $significantDigits = null, $culture = null) {
		if($significantDigits === null) {
			$significantDigits = 1;
		}
		$nf = thx_format_BigIntFormat::numberFormat($culture);
		$tmp = null;
		if($significantDigits === 0) {
			$tmp = $i->isZero();
		} else {
			$tmp = false;
		}
		if($tmp) {
			return "";
		} else {
			$s = thx_format_BigIntFormat::toBase($i, 16, $culture);
			$tmp1 = null;
			if(strlen("0") !== 0) {
				$tmp1 = strlen($s) >= $significantDigits;
			} else {
				$tmp1 = true;
			}
			if($tmp1) {
				return $s;
			} else {
				return str_pad($s, Math::ceil(($significantDigits - strlen($s)) / strlen("0")) * strlen("0") + strlen($s), "0", STR_PAD_LEFT);
			}
		}
	}
	static function integer($i, $culture = null) {
		return thx_format_BigIntFormat::number($i, 0, $culture);
	}
	static function number($i, $precision = null, $culture = null) {
		return thx_format_DecimalFormat::number(thx__Decimal_Decimal_Impl_::fromBigInt($i), $precision, $culture);
	}
	static function octal($i, $significantDigits = null, $culture = null) {
		if($significantDigits === null) {
			$significantDigits = 1;
		}
		$tmp = null;
		if($significantDigits === 0) {
			$tmp = $i->isZero();
		} else {
			$tmp = false;
		}
		if($tmp) {
			return "";
		} else {
			$s = thx_format_BigIntFormat::toBase($i, 8, $culture);
			$tmp1 = null;
			if(strlen("0") !== 0) {
				$tmp1 = strlen($s) >= $significantDigits;
			} else {
				$tmp1 = true;
			}
			if($tmp1) {
				return $s;
			} else {
				return str_pad($s, Math::ceil(($significantDigits - strlen($s)) / strlen("0")) * strlen("0") + strlen($s), "0", STR_PAD_LEFT);
			}
		}
	}
	static function percent($i, $decimals = null, $culture = null) {
		return thx_format_DecimalFormat::percent(thx__Decimal_Decimal_Impl_::fromBigInt($i), $decimals, $culture);
	}
	static function permille($i, $decimals = null, $culture = null) {
		return thx_format_DecimalFormat::permille(thx__Decimal_Decimal_Impl_::fromBigInt($i), $decimals, $culture);
	}
	static function printf($i, $pattern, $culture = null) {
		return thx_format_DecimalFormat::printf(thx__Decimal_Decimal_Impl_::fromBigInt($i), $pattern, $culture);
	}
	static function toBase($value, $base, $culture = null) {
		$s = $value->toStringWithBase($base);
		if(!$value->sign) {
			return $s;
		}
		$tmp = _hx_substring($s, 1, null);
		return _hx_string_or_null(thx_format_BigIntFormat::numberFormat($culture)->signNegative) . _hx_string_or_null($tmp);
	}
	static function unit($i, $decimals, $unitSymbol, $culture = null) {
		return thx_format_DecimalFormat::unit(thx__Decimal_Decimal_Impl_::fromBigInt($i), $decimals, $unitSymbol, $culture);
	}
	static function numberFormat($culture) {
		$tmp = null;
		if(null !== $culture) {
			$tmp = null !== $culture->number;
		} else {
			$tmp = false;
		}
		if($tmp) {
			return $culture->number;
		} else {
			return thx_format_Format::get_defaultCulture()->number;
		}
	}
	function __toString() { return 'thx.format.BigIntFormat'; }
}