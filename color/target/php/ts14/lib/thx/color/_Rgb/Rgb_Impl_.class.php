<?php

// Generated by Haxe 3.3.0
class thx_color__Rgb_Rgb_Impl_ {
	public function __construct(){}
	static function create($red, $green, $blue) {
		return ($red & 255) << 16 | ($green & 255) << 8 | $blue & 255;
	}
	static function createf($red, $green, $blue) {
		$red1 = Math::round($red * 255);
		$green1 = Math::round($green * 255);
		$blue1 = Math::round($blue * 255);
		return ($red1 & 255) << 16 | ($green1 & 255) << 8 | $blue1 & 255;
	}
	static function fromString($color) {
		$info = thx_color_parse_ColorParser::parseHex($color);
		if(null === $info) {
			$info = thx_color_parse_ColorParser::parseColor($color);
		}
		if(null === $info) {
			return null;
		}
		try {
			if($info->name === "rgb") {
				$tmp = thx_color_parse_ColorParser::getInt8Channels($info->channels, 3);
				return thx_color__Rgb_Rgb_Impl_::fromInts($tmp);
			} else {
				return null;
			}
		}catch(Exception $__hx__e) {
			$_ex_ = ($__hx__e instanceof HException) && $__hx__e->getCode() == null ? $__hx__e->e : $__hx__e;
			$e = $_ex_;
			{
				return null;
			}
		}
	}
	static function fromInts($arr) {
		thx_ArrayInts::resize($arr, 3, null);
		return ($arr->a[0] & 255) << 16 | ($arr->a[1] & 255) << 8 | $arr->a[2] & 255;
	}
	static function _new($rgb) {
		return $rgb;
	}
	static function darker($this1, $t) {
		$tmp = thx_color__Rgb_Rgb_Impl_::toRgbx($this1);
		return thx_color__Rgbx_Rgbx_Impl_::toRgb(thx_color__Rgbx_Rgbx_Impl_::darker($tmp, $t));
	}
	static function lighter($this1, $t) {
		$tmp = thx_color__Rgb_Rgb_Impl_::toRgbx($this1);
		return thx_color__Rgbx_Rgbx_Impl_::toRgb(thx_color__Rgbx_Rgbx_Impl_::lighter($tmp, $t));
	}
	static function interpolate($this1, $other, $t) {
		$tmp = thx_color__Rgb_Rgb_Impl_::toRgbx($this1);
		$tmp1 = thx_color__Rgb_Rgb_Impl_::toRgbx($other);
		return thx_color__Rgbx_Rgbx_Impl_::toRgb(thx_color__Rgbx_Rgbx_Impl_::interpolate($tmp, $tmp1, $t));
	}
	static function min($this1, $other) {
		$a = thx_color__Rgb_Rgb_Impl_::get_red($this1);
		$b = thx_color__Rgb_Rgb_Impl_::get_red($other);
		$red = null;
		if($a < $b) {
			$red = $a;
		} else {
			$red = $b;
		}
		$a1 = thx_color__Rgb_Rgb_Impl_::get_green($this1);
		$b1 = thx_color__Rgb_Rgb_Impl_::get_green($other);
		$green = null;
		if($a1 < $b1) {
			$green = $a1;
		} else {
			$green = $b1;
		}
		$a2 = thx_color__Rgb_Rgb_Impl_::get_blue($this1);
		$b2 = thx_color__Rgb_Rgb_Impl_::get_blue($other);
		$blue = null;
		if($a2 < $b2) {
			$blue = $a2;
		} else {
			$blue = $b2;
		}
		return ($red & 255) << 16 | ($green & 255) << 8 | $blue & 255;
	}
	static function max($this1, $other) {
		$a = thx_color__Rgb_Rgb_Impl_::get_red($this1);
		$b = thx_color__Rgb_Rgb_Impl_::get_red($other);
		$red = null;
		if($a > $b) {
			$red = $a;
		} else {
			$red = $b;
		}
		$a1 = thx_color__Rgb_Rgb_Impl_::get_green($this1);
		$b1 = thx_color__Rgb_Rgb_Impl_::get_green($other);
		$green = null;
		if($a1 > $b1) {
			$green = $a1;
		} else {
			$green = $b1;
		}
		$a2 = thx_color__Rgb_Rgb_Impl_::get_blue($this1);
		$b2 = thx_color__Rgb_Rgb_Impl_::get_blue($other);
		$blue = null;
		if($a2 > $b2) {
			$blue = $a2;
		} else {
			$blue = $b2;
		}
		return ($red & 255) << 16 | ($green & 255) << 8 | $blue & 255;
	}
	static function withAlpha($this1, $alpha) {
		return thx_color__Rgba_Rgba_Impl_::fromInts((new _hx_array(array(thx_color__Rgb_Rgb_Impl_::get_red($this1), thx_color__Rgb_Rgb_Impl_::get_green($this1), thx_color__Rgb_Rgb_Impl_::get_blue($this1), $alpha))));
	}
	static function withAlphaf($this1, $newalpha) {
		$tmp = thx_color__Rgb_Rgb_Impl_::get_red($this1);
		$tmp1 = thx_color__Rgb_Rgb_Impl_::get_green($this1);
		$tmp2 = thx_color__Rgb_Rgb_Impl_::get_blue($this1);
		$tmp3 = Math::round(255 * $newalpha);
		return thx_color__Rgba_Rgba_Impl_::fromInts((new _hx_array(array($tmp, $tmp1, $tmp2, $tmp3))));
	}
	static function withRed($this1, $newred) {
		return thx_color__Rgb_Rgb_Impl_::fromInts((new _hx_array(array($newred, thx_color__Rgb_Rgb_Impl_::get_green($this1), thx_color__Rgb_Rgb_Impl_::get_blue($this1)))));
	}
	static function withGreen($this1, $newgreen) {
		return thx_color__Rgb_Rgb_Impl_::fromInts((new _hx_array(array(thx_color__Rgb_Rgb_Impl_::get_red($this1), $newgreen, thx_color__Rgb_Rgb_Impl_::get_blue($this1)))));
	}
	static function withBlue($this1, $newblue) {
		return thx_color__Rgb_Rgb_Impl_::fromInts((new _hx_array(array(thx_color__Rgb_Rgb_Impl_::get_red($this1), thx_color__Rgb_Rgb_Impl_::get_green($this1), $newblue))));
	}
	static function toCss3($this1) {
		return "rgb(" . _hx_string_rec(thx_color__Rgb_Rgb_Impl_::get_red($this1), "") . "," . _hx_string_rec(thx_color__Rgb_Rgb_Impl_::get_green($this1), "") . "," . _hx_string_rec(thx_color__Rgb_Rgb_Impl_::get_blue($this1), "") . ")";
	}
	static function toString($this1) {
		return thx_color__Rgb_Rgb_Impl_::toHex($this1, null);
	}
	static function toHex($this1, $prefix = null) {
		if($prefix === null) {
			$prefix = "#";
		}
		$tmp = "" . _hx_string_or_null($prefix);
		$tmp1 = StringTools::hex(thx_color__Rgb_Rgb_Impl_::get_red($this1), 2);
		$tmp2 = _hx_string_or_null($tmp) . _hx_string_or_null($tmp1);
		$tmp3 = StringTools::hex(thx_color__Rgb_Rgb_Impl_::get_green($this1), 2);
		$tmp4 = _hx_string_or_null($tmp2) . _hx_string_or_null($tmp3);
		$tmp5 = StringTools::hex(thx_color__Rgb_Rgb_Impl_::get_blue($this1), 2);
		return _hx_string_or_null($tmp4) . _hx_string_or_null($tmp5);
	}
	static function equals($this1, $other) {
		$tmp = null;
		if(thx_color__Rgb_Rgb_Impl_::get_red($this1) === thx_color__Rgb_Rgb_Impl_::get_red($other)) {
			$tmp = thx_color__Rgb_Rgb_Impl_::get_green($this1) === thx_color__Rgb_Rgb_Impl_::get_green($other);
		} else {
			$tmp = false;
		}
		if($tmp) {
			return thx_color__Rgb_Rgb_Impl_::get_blue($this1) === thx_color__Rgb_Rgb_Impl_::get_blue($other);
		} else {
			return false;
		}
	}
	static function toLab($this1) {
		$tmp = thx_color__Rgb_Rgb_Impl_::toXyz($this1);
		return thx_color__Xyz_Xyz_Impl_::toLab($tmp);
	}
	static function toLCh($this1) {
		$tmp = thx_color__Rgb_Rgb_Impl_::toLab($this1);
		return thx_color__Lab_Lab_Impl_::toLCh($tmp);
	}
	static function toLuv($this1) {
		$tmp = thx_color__Rgb_Rgb_Impl_::toRgbx($this1);
		return thx_color__Rgbx_Rgbx_Impl_::toLuv($tmp);
	}
	static function toCmy($this1) {
		$tmp = thx_color__Rgb_Rgb_Impl_::toRgbx($this1);
		return thx_color__Rgbx_Rgbx_Impl_::toCmy($tmp);
	}
	static function toCmyk($this1) {
		$tmp = thx_color__Rgb_Rgb_Impl_::toRgbx($this1);
		return thx_color__Rgbx_Rgbx_Impl_::toCmyk($tmp);
	}
	static function toCubeHelix($this1) {
		$this2 = thx_color__Rgb_Rgb_Impl_::toRgbx($this1);
		return thx_color__Rgbx_Rgbx_Impl_::toCubeHelixWithGamma($this2, 1);
	}
	static function toGrey($this1) {
		$tmp = thx_color__Rgb_Rgb_Impl_::toRgbx($this1);
		return thx_color__Rgbx_Rgbx_Impl_::toGrey($tmp);
	}
	static function toHsl($this1) {
		$tmp = thx_color__Rgb_Rgb_Impl_::toRgbx($this1);
		return thx_color__Rgbx_Rgbx_Impl_::toHsl($tmp);
	}
	static function toHsv($this1) {
		$tmp = thx_color__Rgb_Rgb_Impl_::toRgbx($this1);
		return thx_color__Rgbx_Rgbx_Impl_::toHsv($tmp);
	}
	static function toHunterLab($this1) {
		$tmp = thx_color__Rgb_Rgb_Impl_::toXyz($this1);
		return thx_color__Xyz_Xyz_Impl_::toHunterLab($tmp);
	}
	static function toRgbx($this1) {
		return thx_color__Rgbx_Rgbx_Impl_::fromInts((new _hx_array(array(thx_color__Rgb_Rgb_Impl_::get_red($this1), thx_color__Rgb_Rgb_Impl_::get_green($this1), thx_color__Rgb_Rgb_Impl_::get_blue($this1)))));
	}
	static function toRgba($this1) {
		return thx_color__Rgb_Rgb_Impl_::withAlpha($this1, 255);
	}
	static function toRgbxa($this1) {
		return thx_color__Rgba_Rgba_Impl_::toRgbxa(thx_color__Rgb_Rgb_Impl_::toRgba($this1));
	}
	static function toTemperature($this1) {
		$tmp = thx_color__Rgb_Rgb_Impl_::toRgbx($this1);
		return thx_color__Rgbx_Rgbx_Impl_::toTemperature($tmp);
	}
	static function toYuv($this1) {
		$tmp = thx_color__Rgb_Rgb_Impl_::toRgbx($this1);
		return thx_color__Rgbx_Rgbx_Impl_::toYuv($tmp);
	}
	static function toYxy($this1) {
		$tmp = thx_color__Rgb_Rgb_Impl_::toRgbx($this1);
		return thx_color__Rgbx_Rgbx_Impl_::toYxy($tmp);
	}
	static function toXyz($this1) {
		$tmp = thx_color__Rgb_Rgb_Impl_::toRgbx($this1);
		return thx_color__Rgbx_Rgbx_Impl_::toXyz($tmp);
	}
	static function get_red($this1) {
		return $this1 >> 16 & 255;
	}
	static function get_green($this1) {
		return $this1 >> 8 & 255;
	}
	static function get_blue($this1) {
		return $this1 & 255;
	}
	static $__properties__ = array("get_blue" => "get_blue","get_green" => "get_green","get_red" => "get_red");
	function __toString() { return 'thx.color._Rgb.Rgb_Impl_'; }
}