<?php

// Generated by Haxe 3.3.0
class hxmath_math__Quaternion_Quaternion_Impl_ {
	public function __construct(){}
	static $elementCount = 4;
	static function _new($s, $x, $y, $z) {
		$this1 = new hxmath_math_QuaternionDefault($s, $x, $y, $z);
		return $this1;
	}
	static function fromArray($rawData) {
		if($rawData->length !== 4) {
			throw new HException("Invalid rawData.");
		}
		$this1 = new hxmath_math_QuaternionDefault($rawData[0], $rawData[1], $rawData[2], $rawData[3]);
		return $this1;
	}
	static function fromAxisAngle($angleDegrees, $axis) {
		$angleRadians = Math::$PI / 180 * $angleDegrees;
		$cosHalfAngle = Math::cos($angleRadians / 2.0);
		$sinHalfAngle = Math::sin($angleRadians / 2.0);
		$this1 = new hxmath_math_QuaternionDefault($cosHalfAngle, $sinHalfAngle * $axis->x, $sinHalfAngle * $axis->y, $sinHalfAngle * $axis->z);
		return $this1;
	}
	static function multiplyScalar($a, $s) {
		$this1 = new hxmath_math_QuaternionDefault($a->s, $a->x, $a->y, $a->z);
		$self = $this1;
		$self->s *= $s;
		$self->x *= $s;
		$self->y *= $s;
		$self->z *= $s;
		return $self;
	}
	static function multiply($a, $b) {
		$this1 = new hxmath_math_QuaternionDefault($a->s * $b->s - $a->x * $b->x - $a->y * $b->y - $a->z * $b->z, $a->s * $b->x + $b->s * $a->x + $a->y * $b->z - $a->z * $b->y, $a->s * $b->y + $b->s * $a->y + $a->z * $b->x - $a->x * $b->z, $a->s * $b->z + $b->s * $a->z + $a->x * $b->y - $a->y * $b->x);
		return $this1;
	}
	static function add($a, $b) {
		$this1 = new hxmath_math_QuaternionDefault($a->s, $a->x, $a->y, $a->z);
		$self = $this1;
		$self->s += $b->s;
		$self->x += $b->x;
		$self->y += $b->y;
		$self->z += $b->z;
		return $self;
	}
	static function subtract($a, $b) {
		$this1 = new hxmath_math_QuaternionDefault($a->s, $a->x, $a->y, $a->z);
		$self = $this1;
		$self->s -= $b->s;
		$self->x -= $b->x;
		$self->y -= $b->y;
		$self->z -= $b->z;
		return $self;
	}
	static function conjugate($a) {
		$this1 = new hxmath_math_QuaternionDefault($a->s, -$a->x, -$a->y, -$a->z);
		return $this1;
	}
	static function negate($a) {
		$this1 = new hxmath_math_QuaternionDefault(-$a->s, -$a->x, -$a->y, -$a->z);
		return $this1;
	}
	static function equals($a, $b) {
		$tmp = null;
		if($a === null) {
			$tmp = $b === null;
		} else {
			$tmp = false;
		}
		if(!$tmp) {
			$tmp1 = null;
			$tmp2 = null;
			$tmp3 = null;
			$tmp4 = null;
			if($a !== null) {
				$tmp4 = $b !== null;
			} else {
				$tmp4 = false;
			}
			if($tmp4) {
				$tmp3 = $a->s === $b->s;
			} else {
				$tmp3 = false;
			}
			if($tmp3) {
				$tmp2 = $a->x === $b->x;
			} else {
				$tmp2 = false;
			}
			if($tmp2) {
				$tmp1 = $a->y === $b->y;
			} else {
				$tmp1 = false;
			}
			if($tmp1) {
				return $a->z === $b->z;
			} else {
				return false;
			}
		} else {
			return true;
		}
	}
	static function lerp($a, $b, $t) {
		$s = 1.0 - $t;
		$this1 = new hxmath_math_QuaternionDefault($a->s, $a->x, $a->y, $a->z);
		$self = $this1;
		$self->s *= $s;
		$self->x *= $s;
		$self->y *= $s;
		$self->z *= $s;
		$this2 = new hxmath_math_QuaternionDefault($b->s, $b->x, $b->y, $b->z);
		$self1 = $this2;
		$self1->s *= $t;
		$self1->x *= $t;
		$self1->y *= $t;
		$self1->z *= $t;
		$this3 = new hxmath_math_QuaternionDefault($self->s, $self->x, $self->y, $self->z);
		$self2 = $this3;
		$self2->s += $self1->s;
		$self2->x += $self1->x;
		$self2->y += $self1->y;
		$self2->z += $self1->z;
		return $self2;
	}
	static function slerp($a, $b, $t) {
		$cosHalfTheta = $a->s * $b->s + $a->x * $b->x + $a->y * $b->y + $a->z * $b->z;
		$tmp = Math::abs($cosHalfTheta);
		if($tmp >= 1.0) {
			return $a;
		}
		$halfTheta = Math::acos($cosHalfTheta);
		$sinHalfTheta = Math::sqrt(1.0 - $cosHalfTheta * $cosHalfTheta);
		$tmp1 = Math::abs($sinHalfTheta);
		if($tmp1 < 1e-3) {
			$s = 1.0 - $t;
			$this1 = new hxmath_math_QuaternionDefault($a->s, $a->x, $a->y, $a->z);
			$self = $this1;
			$self->s *= $s;
			$self->x *= $s;
			$self->y *= $s;
			$self->z *= $s;
			$this2 = new hxmath_math_QuaternionDefault($b->s, $b->x, $b->y, $b->z);
			$self1 = $this2;
			$self1->s *= $t;
			$self1->x *= $t;
			$self1->y *= $t;
			$self1->z *= $t;
			$this3 = new hxmath_math_QuaternionDefault($self->s, $self->x, $self->y, $self->z);
			$self2 = $this3;
			$self2->s += $self1->s;
			$self2->x += $self1->x;
			$self2->y += $self1->y;
			$self2->z += $self1->z;
			$self3 = $self2;
			$tmp2 = $self3->s * $self3->s + $self3->x * $self3->x + $self3->y * $self3->y + $self3->z * $self3->z;
			$length = Math::sqrt($tmp2);
			if($length > 0.0) {
				$k = 1.0 / $length;
				{
					$self3->s *= $k;
					$self3->x *= $k;
					$self3->y *= $k;
					$self3->z *= $k;
				}
			}
			return $self3;
		}
		$tmp3 = Math::sin((1 - $t) * $halfTheta);
		$ta = $tmp3 / $sinHalfTheta;
		$tmp4 = Math::sin($t * $halfTheta);
		$tb = $tmp4 / $sinHalfTheta;
		$this4 = new hxmath_math_QuaternionDefault(0, 0, 0, 0);
		$result = $this4;
		$tmp5 = $a->x * $ta;
		$tmp6 = $b->x * $tb;
		$result->x = $tmp5 + $tmp6;
		$tmp7 = $a->y * $ta;
		$tmp8 = $b->y * $tb;
		$result->y = $tmp7 + $tmp8;
		$tmp9 = $a->z * $ta;
		$tmp10 = $b->z * $tb;
		$result->z = $tmp9 + $tmp10;
		$tmp11 = $a->s * $ta;
		$tmp12 = $b->s * $tb;
		$result->s = $tmp11 + $tmp12;
		return $result;
	}
	static function dot($a, $b) {
		return $a->s * $b->s + $a->x * $b->x + $a->y * $b->y + $a->z * $b->z;
	}
	static function set($this1, $s, $x, $y, $z) {
		$self = $this1;
		$self->s = $s;
		$self->x = $x;
		$self->y = $y;
		$self->z = $z;
		return $self;
	}
	static function invert($this1) {
		$self = $this1;
		$this2 = new hxmath_math_QuaternionDefault($self->s, $self->x, $self->y, $self->z);
		$self1 = $this2;
		$self1->x = -$self1->x;
		$self1->y = -$self1->y;
		$self1->z = -$self1->z;
		$self2 = $self1;
		$tmp = $self2->s * $self2->s + $self2->x * $self2->x + $self2->y * $self2->y + $self2->z * $self2->z;
		$length = Math::sqrt($tmp);
		if($length > 0.0) {
			$k = 1.0 / $length;
			{
				$self2->s *= $k;
				$self2->x *= $k;
				$self2->y *= $k;
				$self2->z *= $k;
			}
		}
		return $self2;
	}
	static function multiplyWithScalar($this1, $s) {
		$self = $this1;
		$self->s *= $s;
		$self->x *= $s;
		$self->y *= $s;
		$self->z *= $s;
		return $self;
	}
	static function addWith($this1, $a) {
		$self = $this1;
		$self->s += $a->s;
		$self->x += $a->x;
		$self->y += $a->y;
		$self->z += $a->z;
		return $self;
	}
	static function subtractWith($this1, $a) {
		$self = $this1;
		$self->s -= $a->s;
		$self->x -= $a->x;
		$self->y -= $a->y;
		$self->z -= $a->z;
		return $self;
	}
	static function copyTo($this1, $target) {
		$self = $this1;
		{
			$_g = 0;
			while($_g < 4) {
				$i = $_g++;
				{
					$tmp = null;
					switch($i) {
					case 0:{
						$tmp = $self->s;
					}break;
					case 1:{
						$tmp = $self->x;
					}break;
					case 2:{
						$tmp = $self->y;
					}break;
					case 3:{
						$tmp = $self->z;
					}break;
					default:{
						throw new HException("Invalid element");
					}break;
					}
					$value = $tmp;
					switch($i) {
					case 0:{
						$target->s = $value;
					}break;
					case 1:{
						$target->x = $value;
					}break;
					case 2:{
						$target->y = $value;
					}break;
					case 3:{
						$target->z = $value;
					}break;
					default:{
						throw new HException("Invalid element");
					}break;
					}
					unset($value,$tmp);
				}
				unset($i);
			}
		}
	}
	static function copyToShape($this1, $target) {
		$self = $this1;
		$target->s = $self->s;
		$target->x = $self->x;
		$target->y = $self->y;
		$target->z = $self->z;
	}
	static function copyFromShape($this1, $source) {
		$self = $this1;
		$self->s = $source->s;
		$self->x = $source->x;
		$self->y = $source->y;
		$self->z = $source->z;
	}
	static function hclone($this1) {
		$self = $this1;
		$this2 = new hxmath_math_QuaternionDefault($self->s, $self->x, $self->y, $self->z);
		return $this2;
	}
	static function getArrayElement($this1, $i) {
		$self = $this1;
		switch($i) {
		case 0:{
			return $self->s;
		}break;
		case 1:{
			return $self->x;
		}break;
		case 2:{
			return $self->y;
		}break;
		case 3:{
			return $self->z;
		}break;
		default:{
			throw new HException("Invalid element");
		}break;
		}
	}
	static function setArrayElement($this1, $i, $value) {
		$self = $this1;
		switch($i) {
		case 0:{
			return $self->s = $value;
		}break;
		case 1:{
			return $self->x = $value;
		}break;
		case 2:{
			return $self->y = $value;
		}break;
		case 3:{
			return $self->z = $value;
		}break;
		default:{
			throw new HException("Invalid element");
		}break;
		}
	}
	static function applyScalarFunc($this1, $func) {
		$self = $this1;
		{
			$_g = 0;
			while($_g < 4) {
				$i = $_g++;
				{
					$tmp = null;
					switch($i) {
					case 0:{
						$tmp = $self->s;
					}break;
					case 1:{
						$tmp = $self->x;
					}break;
					case 2:{
						$tmp = $self->y;
					}break;
					case 3:{
						$tmp = $self->z;
					}break;
					default:{
						throw new HException("Invalid element");
					}break;
					}
					$value = call_user_func_array($func, array($tmp));
					switch($i) {
					case 0:{
						$self->s = $value;
					}break;
					case 1:{
						$self->x = $value;
					}break;
					case 2:{
						$self->y = $value;
					}break;
					case 3:{
						$self->z = $value;
					}break;
					default:{
						throw new HException("Invalid element");
					}break;
					}
					unset($value,$tmp);
				}
				unset($i);
			}
		}
		return $self;
	}
	static function log($this1) {
		$self = $this1;
		$theta = Math::acos($self->s);
		$sinTheta = Math::sin($theta);
		if($sinTheta > 0.0) {
			$k = $theta / $sinTheta;
			$this2 = new hxmath_math_QuaternionDefault(0.0, $k * $self->x, $k * $self->y, $k * $self->z);
			return $this2;
		} else {
			$this3 = new hxmath_math_QuaternionDefault(0, 0, 0, 0);
			return $this3;
		}
	}
	static function exp($this1) {
		$self = $this1;
		$tmp = $self->x * $self->x + $self->y * $self->y + $self->z * $self->z;
		$theta = Math::sqrt($tmp);
		$sinTheta = Math::sin($theta);
		$cosTheta = Math::cos($theta);
		if($theta > 0.0) {
			$this2 = new hxmath_math_QuaternionDefault($cosTheta, $sinTheta * $self->x, $sinTheta * $self->y, $sinTheta * $self->z);
			return $this2;
		} else {
			$this3 = new hxmath_math_QuaternionDefault($cosTheta, 0, 0, 0);
			return $this3;
		}
	}
	static function rotate($this1, $u) {
		$self = $this1;
		$a = 2.0 * ($self->x * $u->x + $self->y * $u->y + $self->z * $u->z);
		$b = $self->s * $self->s - $self->x * $self->x - $self->y * $self->y - $self->z * $self->z;
		$c = 2.0 * $self->s;
		$this2 = new hxmath_math_Vector3Default($a * $self->x + $b * $u->x + $c * ($self->y * $u->z - $self->z * $u->y), $a * $self->y + $b * $u->y + $c * ($self->z * $u->x - $self->x * $u->z), $a * $self->z + $b * $u->z + $c * ($self->x * $u->y - $self->y * $u->x));
		return $this2;
	}
	static function angleWith($this1, $b) {
		$self = $this1;
		$tmp = $self->s * $b->s + $self->x * $b->x + $self->y * $b->y + $self->z * $b->z;
		$tmp1 = $self->s * $self->s + $self->x * $self->x + $self->y * $self->y + $self->z * $self->z;
		$tmp2 = Math::sqrt($tmp1);
		$tmp3 = $b->s * $b->s + $b->x * $b->x + $b->y * $b->y + $b->z * $b->z;
		$tmp4 = Math::sqrt($tmp3);
		$tmp5 = Math::acos($tmp / ($tmp2 * $tmp4));
		return 2.0 * $tmp5;
	}
	static function normalize($this1) {
		$self = $this1;
		$tmp = $self->s * $self->s + $self->x * $self->x + $self->y * $self->y + $self->z * $self->z;
		$length = Math::sqrt($tmp);
		if($length > 0.0) {
			$k = 1.0 / $length;
			{
				$self->s *= $k;
				$self->x *= $k;
				$self->y *= $k;
				$self->z *= $k;
			}
		}
		return $self;
	}
	static function applyConjugate($this1) {
		$self = $this1;
		$self->x = -$self->x;
		$self->y = -$self->y;
		$self->z = -$self->z;
		return $self;
	}
	static function applyInvert($this1) {
		$self = $this1;
		$self->x = -$self->x;
		$self->y = -$self->y;
		$self->z = -$self->z;
		$self1 = $self;
		$tmp = $self1->s * $self1->s + $self1->x * $self1->x + $self1->y * $self1->y + $self1->z * $self1->z;
		$length = Math::sqrt($tmp);
		if($length > 0.0) {
			$k = 1.0 / $length;
			{
				$self1->s *= $k;
				$self1->x *= $k;
				$self1->y *= $k;
				$self1->z *= $k;
			}
		}
		return $self1;
	}
	static function get_zero() {
		$this1 = new hxmath_math_QuaternionDefault(0, 0, 0, 0);
		return $this1;
	}
	static function get_identity() {
		$this1 = new hxmath_math_QuaternionDefault(1, 0, 0, 0);
		return $this1;
	}
	static function get_length($this1) {
		$self = $this1;
		$tmp = $self->s * $self->s + $self->x * $self->x + $self->y * $self->y + $self->z * $self->z;
		return Math::sqrt($tmp);
	}
	static function get_lengthSq($this1) {
		$self = $this1;
		return $self->s * $self->s + $self->x * $self->x + $self->y * $self->y + $self->z * $self->z;
	}
	static function get_matrix($this1) {
		$self = $this1;
		$s = $self->s;
		$x = $self->x;
		$y = $self->y;
		$z = $self->z;
		$this2 = new hxmath_math_Matrix3x3Default(1 - 2 * ($y * $y + $z * $z), 2 * ($x * $y - $s * $z), 2 * ($s * $y + $x * $z), 2 * ($x * $y + $s * $z), 1 - 2 * ($x * $x + $z * $z), 2 * ($y * $z - $s * $x), 2 * ($x * $z - $s * $y), 2 * ($y * $z + $s * $x), 1 - 2 * ($x * $x + $y * $y));
		return $this2;
	}
	static function get_normal($this1) {
		$self = $this1;
		$tmp = $self->s * $self->s + $self->x * $self->x + $self->y * $self->y + $self->z * $self->z;
		$tmp1 = Math::sqrt($tmp);
		$_g = 1.0 / $tmp1;
		$this2 = new hxmath_math_QuaternionDefault($self->s, $self->x, $self->y, $self->z);
		$self1 = $this2;
		$self1->s *= $_g;
		$self1->x *= $_g;
		$self1->y *= $_g;
		$self1->z *= $_g;
		return $self1;
	}
	static $__properties__ = array("get_normal" => "get_normal","get_lengthSq" => "get_lengthSq","get_length" => "get_length","get_matrix" => "get_matrix","get_identity" => "get_identity","get_zero" => "get_zero");
	function __toString() { return 'hxmath.math._Quaternion.Quaternion_Impl_'; }
}
