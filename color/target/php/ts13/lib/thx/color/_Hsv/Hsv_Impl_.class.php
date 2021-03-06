<?php

// Generated by Haxe 3.3.0
class thx_color__Hsv_Hsv_Impl_ {
	public function __construct(){}
	static function create($hue, $saturation, $value) {
		return (new _hx_array(array($hue, $saturation, $value)));
	}
	static function fromFloats($arr) {
		thx_ArrayFloats::resize($arr, 3, null);
		return (new _hx_array(array($arr[0], $arr[1], $arr[2])));
	}
	static function fromString($color) {
		$info = thx_color_parse_ColorParser::parseColor($color);
		if(null === $info) {
			return null;
		}
		try {
			if($info->name === "hsv") {
				$channels = thx_color_parse_ColorParser::getFloatChannels($info->channels, 3, false);
				return $channels;
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
	static function _new($channels) {
		return $channels;
	}
	static function analogous($this1, $spread = null) {
		if($spread === null) {
			$spread = 30.0;
		}
		return _hx_anonymous(array("_0" => thx_color__Hsv_Hsv_Impl_::rotate($this1, -$spread), "_1" => thx_color__Hsv_Hsv_Impl_::rotate($this1, $spread)));
	}
	static function complement($this1) {
		return thx_color__Hsv_Hsv_Impl_::rotate($this1, 180);
	}
	static function interpolate($this1, $other, $t) {
		return (new _hx_array(array(thx_Floats::interpolateAngle($t, $this1[0], $other[0], null), thx_Floats::interpolate($t, $this1[1], $other[1]), thx_Floats::interpolate($t, $this1[2], $other[2]))));
	}
	static function interpolateWidest($this1, $other, $t) {
		return (new _hx_array(array(thx_Floats::interpolateAngleWidest($t, $this1[0], $other[0], null), thx_Floats::interpolate($t, $this1[1], $other[1]), thx_Floats::interpolate($t, $this1[2], $other[2]))));
	}
	static function min($this1, $other) {
		$hue = Math::min($this1[0], $other[0]);
		$saturation = Math::min($this1[1], $other[1]);
		$value = Math::min($this1[2], $other[2]);
		return (new _hx_array(array($hue, $saturation, $value)));
	}
	static function max($this1, $other) {
		$hue = Math::max($this1[0], $other[0]);
		$saturation = Math::max($this1[1], $other[1]);
		$value = Math::max($this1[2], $other[2]);
		return (new _hx_array(array($hue, $saturation, $value)));
	}
	static function normalize($this1) {
		$hue = thx_Floats::wrapCircular($this1[0], 360);
		$this2 = null;
		$v = $this1[1];
		$tmp = null;
		if($v < 0) {
			$tmp = 0;
		} else {
			if($v > 1) {
				$tmp = 1;
			} else {
				$tmp = $v;
			}
		}
		$v1 = $this1[2];
		$tmp1 = null;
		if($v1 < 0) {
			$tmp1 = 0;
		} else {
			if($v1 > 1) {
				$tmp1 = 1;
			} else {
				$tmp1 = $v1;
			}
		}
		$this2 = (new _hx_array(array($hue, $tmp, $tmp1)));
		return $this2;
	}
	static function rotate($this1, $angle) {
		return thx_color__Hsv_Hsv_Impl_::normalize(thx_color__Hsv_Hsv_Impl_::withHue($this1, $this1->a[0] + $angle));
	}
	static function roundTo($this1, $decimals) {
		$hue = thx_Floats::roundTo($this1[0], $decimals);
		$saturation = thx_Floats::roundTo($this1[1], $decimals);
		$value = thx_Floats::roundTo($this1[2], $decimals);
		return (new _hx_array(array($hue, $saturation, $value)));
	}
	static function split($this1, $spread = null) {
		if($spread === null) {
			$spread = 144.0;
		}
		return _hx_anonymous(array("_0" => thx_color__Hsv_Hsv_Impl_::rotate($this1, -$spread), "_1" => thx_color__Hsv_Hsv_Impl_::rotate($this1, $spread)));
	}
	static function square($this1) {
		return thx_color__Hsv_Hsv_Impl_::tetrad($this1, 90);
	}
	static function tetrad($this1, $angle) {
		return _hx_anonymous(array("_0" => thx_color__Hsv_Hsv_Impl_::rotate($this1, 0), "_1" => thx_color__Hsv_Hsv_Impl_::rotate($this1, $angle), "_2" => thx_color__Hsv_Hsv_Impl_::rotate($this1, 180), "_3" => thx_color__Hsv_Hsv_Impl_::rotate($this1, 180 + $angle)));
	}
	static function triad($this1) {
		return _hx_anonymous(array("_0" => thx_color__Hsv_Hsv_Impl_::rotate($this1, -120), "_1" => thx_color__Hsv_Hsv_Impl_::rotate($this1, 0), "_2" => thx_color__Hsv_Hsv_Impl_::rotate($this1, 120)));
	}
	static function withAlpha($this1, $alpha) {
		$channels = $this1->concat((new _hx_array(array($alpha))));
		return $channels;
	}
	static function withHue($this1, $newhue) {
		return (new _hx_array(array($newhue, $this1[1], $this1[2])));
	}
	static function withValue($this1, $newvalue) {
		return (new _hx_array(array($this1[0], $this1[1], $newvalue)));
	}
	static function withSaturation($this1, $newsaturation) {
		return (new _hx_array(array($this1[0], $newsaturation, $this1[2])));
	}
	static function toString($this1) {
		return "hsv(" . _hx_string_rec($this1[0], "") . "," . _hx_string_rec($this1->a[1] * 100, "") . "%," . _hx_string_rec($this1->a[2] * 100, "") . "%)";
	}
	static function equals($this1, $other) {
		return thx_color__Hsv_Hsv_Impl_::nearEquals($this1, $other, null);
	}
	static function nearEquals($this1, $other, $tolerance = null) {
		if($tolerance === null) {
			$tolerance = 1e-9;
		}
		$tmp = null;
		$tmp1 = Math::abs(thx_Floats::angleDifference($this1[0], $other[0], 360.0));
		if($tmp1 <= $tolerance) {
			$tmp = thx_Floats::nearEquals($this1[1], $other[1], $tolerance);
		} else {
			$tmp = false;
		}
		if($tmp) {
			return thx_Floats::nearEquals($this1[2], $other[2], $tolerance);
		} else {
			return false;
		}
	}
	static function toLab($this1) {
		$tmp = thx_color__Hsv_Hsv_Impl_::toXyz($this1);
		return thx_color__Xyz_Xyz_Impl_::toLab($tmp);
	}
	static function toLCh($this1) {
		$tmp = thx_color__Hsv_Hsv_Impl_::toLab($this1);
		return thx_color__Lab_Lab_Impl_::toLCh($tmp);
	}
	static function toLuv($this1) {
		$tmp = thx_color__Hsv_Hsv_Impl_::toRgbx($this1);
		return thx_color__Rgbx_Rgbx_Impl_::toLuv($tmp);
	}
	static function toCmy($this1) {
		$tmp = thx_color__Hsv_Hsv_Impl_::toRgbx($this1);
		return thx_color__Rgbx_Rgbx_Impl_::toCmy($tmp);
	}
	static function toCmyk($this1) {
		$tmp = thx_color__Hsv_Hsv_Impl_::toRgbx($this1);
		return thx_color__Rgbx_Rgbx_Impl_::toCmyk($tmp);
	}
	static function toCubeHelix($this1) {
		$this2 = thx_color__Hsv_Hsv_Impl_::toRgbx($this1);
		return thx_color__Rgbx_Rgbx_Impl_::toCubeHelixWithGamma($this2, 1);
	}
	static function toGrey($this1) {
		$tmp = thx_color__Hsv_Hsv_Impl_::toRgbx($this1);
		return thx_color__Rgbx_Rgbx_Impl_::toGrey($tmp);
	}
	static function toHsl($this1) {
		$tmp = thx_color__Hsv_Hsv_Impl_::toRgbx($this1);
		return thx_color__Rgbx_Rgbx_Impl_::toHsl($tmp);
	}
	static function toHsva($this1) {
		return thx_color__Hsv_Hsv_Impl_::withAlpha($this1, 1.0);
	}
	static function toHunterLab($this1) {
		$tmp = thx_color__Hsv_Hsv_Impl_::toXyz($this1);
		return thx_color__Xyz_Xyz_Impl_::toHunterLab($tmp);
	}
	static function toRgb($this1) {
		$tmp = thx_color__Hsv_Hsv_Impl_::toRgbx($this1);
		return thx_color__Rgbx_Rgbx_Impl_::toRgb($tmp);
	}
	static function toRgba($this1) {
		$tmp = thx_color__Hsv_Hsv_Impl_::toRgbxa($this1);
		return thx_color__Rgbxa_Rgbxa_Impl_::toRgba($tmp);
	}
	static function toRgbx($this1) {
		if(_hx_equal($this1[1], 0)) {
			return (new _hx_array(array($this1[2], $this1[2], $this1[2])));
		}
		$r = null;
		$g = null;
		$b = null;
		$i = null;
		$f = null;
		$p = null;
		$q = null;
		$t = null;
		$h = $this1->a[0] / 60;
		$i = Math::floor($h);
		$f = $h - $i;
		$p = $this1->a[2] * (1 - $this1[1]);
		$q = $this1->a[2] * (1 - $f * $this1[1]);
		$t = $this1->a[2] * (1 - (1 - $f) * $this1[1]);
		switch($i) {
		case 0:{
			$r = $this1[2];
			$g = $t;
			$b = $p;
		}break;
		case 1:{
			$r = $q;
			$g = $this1[2];
			$b = $p;
		}break;
		case 2:{
			$r = $p;
			$g = $this1[2];
			$b = $t;
		}break;
		case 3:{
			$r = $p;
			$g = $q;
			$b = $this1[2];
		}break;
		case 4:{
			$r = $t;
			$g = $p;
			$b = $this1[2];
		}break;
		default:{
			$r = $this1[2];
			$g = $p;
			$b = $q;
		}break;
		}
		return (new _hx_array(array($r, $g, $b)));
	}
	static function toRgbxa($this1) {
		$tmp = thx_color__Hsv_Hsv_Impl_::toRgbx($this1);
		return thx_color__Rgbx_Rgbx_Impl_::toRgbxa($tmp);
	}
	static function toTemperature($this1) {
		$tmp = thx_color__Hsv_Hsv_Impl_::toRgbx($this1);
		return thx_color__Rgbx_Rgbx_Impl_::toTemperature($tmp);
	}
	static function toXyz($this1) {
		$tmp = thx_color__Hsv_Hsv_Impl_::toRgbx($this1);
		return thx_color__Rgbx_Rgbx_Impl_::toXyz($tmp);
	}
	static function toYuv($this1) {
		$tmp = thx_color__Hsv_Hsv_Impl_::toRgbx($this1);
		return thx_color__Rgbx_Rgbx_Impl_::toYuv($tmp);
	}
	static function toYxy($this1) {
		$tmp = thx_color__Hsv_Hsv_Impl_::toRgbx($this1);
		return thx_color__Rgbx_Rgbx_Impl_::toYxy($tmp);
	}
	static function get_hue($this1) {
		return $this1[0];
	}
	static function get_saturation($this1) {
		return $this1[1];
	}
	static function get_value($this1) {
		return $this1[2];
	}
	static $__properties__ = array("get_value" => "get_value","get_saturation" => "get_saturation","get_hue" => "get_hue");
	function __toString() { return 'thx.color._Hsv.Hsv_Impl_'; }
}
