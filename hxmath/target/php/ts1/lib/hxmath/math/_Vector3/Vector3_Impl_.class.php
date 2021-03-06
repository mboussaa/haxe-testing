<?php

// Generated by Haxe 3.3.0
class hxmath_math__Vector3_Vector3_Impl_ {
	public function __construct(){}
	static $elementCount = 3;
	static function _new($x, $y, $z) {
		$this1 = new hxmath_math_Vector3Default($x, $y, $z);
		return $this1;
	}
	static function fromArray($rawData) {
		if($rawData->length !== 3) {
			throw new HException("Invalid rawData.");
		}
		$this1 = new hxmath_math_Vector3Default($rawData[0], $rawData[1], $rawData[2]);
		return $this1;
	}
	static function fromVector3Shape($other) {
		$this1 = new hxmath_math_Vector3Default($other->x, $other->y, $other->z);
		return $this1;
	}
	static function dot($a, $b) {
		return $a->x * $b->x + $a->y * $b->y + $a->z * $b->z;
	}
	static function cross($a, $b) {
		$this1 = new hxmath_math_Vector3Default($a->x, $a->y, $a->z);
		$self = $this1;
		$newX = $self->y * $b->z - $self->z * $b->y;
		$newY = $self->z * $b->x - $self->x * $b->z;
		$newZ = $self->x * $b->y - $self->y * $b->x;
		$self->x = $newX;
		$self->y = $newY;
		$self->z = $newZ;
		return $self;
	}
	static function multiply($a, $s) {
		$this1 = new hxmath_math_Vector3Default($a->x, $a->y, $a->z);
		$self = $this1;
		$self->x *= $s;
		$self->y *= $s;
		$self->z *= $s;
		return $self;
	}
	static function divide($a, $s) {
		$this1 = new hxmath_math_Vector3Default($a->x, $a->y, $a->z);
		$self = $this1;
		$self->x /= $s;
		$self->y /= $s;
		$self->z /= $s;
		return $self;
	}
	static function add($a, $b) {
		$this1 = new hxmath_math_Vector3Default($a->x, $a->y, $a->z);
		$self = $this1;
		$self->x += $b->x;
		$self->y += $b->y;
		$self->z += $b->z;
		return $self;
	}
	static function subtract($a, $b) {
		$this1 = new hxmath_math_Vector3Default($a->x, $a->y, $a->z);
		$self = $this1;
		$self->x -= $b->x;
		$self->y -= $b->y;
		$self->z -= $b->z;
		return $self;
	}
	static function negate($a) {
		$this1 = new hxmath_math_Vector3Default(-$a->x, -$a->y, -$a->z);
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
			if($a !== null) {
				$tmp3 = $b !== null;
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
		$this1 = new hxmath_math_Vector3Default((1.0 - $t) * $a->x + $t * $b->x, (1.0 - $t) * $a->y + $t * $b->y, (1.0 - $t) * $a->z + $t * $b->z);
		return $this1;
	}
	static function max($a, $b) {
		$this1 = new hxmath_math_Vector3Default($a->x, $a->y, $a->z);
		$self = $this1;
		$self->x = Math::max($self->x, $b->x);
		$self->y = Math::max($self->y, $b->y);
		$self->z = Math::max($self->z, $b->z);
		return $self;
	}
	static function min($a, $b) {
		$this1 = new hxmath_math_Vector3Default($a->x, $a->y, $a->z);
		$self = $this1;
		$self->x = Math::min($self->x, $b->x);
		$self->y = Math::min($self->y, $b->y);
		$self->z = Math::min($self->z, $b->z);
		return $self;
	}
	static function project($a, $b) {
		$this1 = new hxmath_math_Vector3Default($a->x, $a->y, $a->z);
		$self = $this1;
		$s = ($self->x * $b->x + $self->y * $b->y + $self->z * $b->z) / ($b->x * $b->x + $b->y * $b->y + $b->z * $b->z);
		{
			$_g = 0;
			while($_g < 3) {
				$i = $_g++;
				{
					$tmp = null;
					switch($i) {
					case 0:{
						$tmp = $b->x;
					}break;
					case 1:{
						$tmp = $b->y;
					}break;
					case 2:{
						$tmp = $b->z;
					}break;
					default:{
						throw new HException("Invalid element");
					}break;
					}
					$value = $tmp;
					switch($i) {
					case 0:{
						$self->x = $value;
					}break;
					case 1:{
						$self->y = $value;
					}break;
					case 2:{
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
		{
			$self->x *= $s;
			$self->y *= $s;
			$self->z *= $s;
		}
		return $self;
	}
	static function reflect($v, $normal) {
		$this1 = new hxmath_math_Vector3Default($v->x, $v->y, $v->z);
		$self = $this1;
		$this2 = new hxmath_math_Vector3Default($self->x, $self->y, $self->z);
		$self1 = $this2;
		$s = ($self1->x * $normal->x + $self1->y * $normal->y + $self1->z * $normal->z) / ($normal->x * $normal->x + $normal->y * $normal->y + $normal->z * $normal->z);
		{
			$_g = 0;
			while($_g < 3) {
				$i = $_g++;
				{
					$tmp = null;
					switch($i) {
					case 0:{
						$tmp = $normal->x;
					}break;
					case 1:{
						$tmp = $normal->y;
					}break;
					case 2:{
						$tmp = $normal->z;
					}break;
					default:{
						throw new HException("Invalid element");
					}break;
					}
					$value = $tmp;
					switch($i) {
					case 0:{
						$self1->x = $value;
					}break;
					case 1:{
						$self1->y = $value;
					}break;
					case 2:{
						$self1->z = $value;
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
		{
			$self1->x *= $s;
			$self1->y *= $s;
			$self1->z *= $s;
		}
		{
			$self1->x *= 2.0;
			$self1->y *= 2.0;
			$self1->z *= 2.0;
		}
		{
			$self->x -= $self1->x;
			$self->y -= $self1->y;
			$self->z -= $self1->z;
		}
		return $self;
	}
	static function orthoNormalize($u, $v, $w) {
		{
			$tmp = $u->x * $u->x + $u->y * $u->y + $u->z * $u->z;
			$length = Math::sqrt($tmp);
			if($length > 0.0) {
				$u->x /= $length;
				$u->y /= $length;
				$u->z /= $length;
			}
		}
		{
			$this1 = new hxmath_math_Vector3Default($v->x, $v->y, $v->z);
			$self = $this1;
			$s = ($self->x * $u->x + $self->y * $u->y + $self->z * $u->z) / ($u->x * $u->x + $u->y * $u->y + $u->z * $u->z);
			{
				$_g = 0;
				while($_g < 3) {
					$i = $_g++;
					{
						$tmp1 = null;
						switch($i) {
						case 0:{
							$tmp1 = $u->x;
						}break;
						case 1:{
							$tmp1 = $u->y;
						}break;
						case 2:{
							$tmp1 = $u->z;
						}break;
						default:{
							throw new HException("Invalid element");
						}break;
						}
						$value = $tmp1;
						switch($i) {
						case 0:{
							$self->x = $value;
						}break;
						case 1:{
							$self->y = $value;
						}break;
						case 2:{
							$self->z = $value;
						}break;
						default:{
							throw new HException("Invalid element");
						}break;
						}
						unset($value,$tmp1);
					}
					unset($i);
				}
			}
			{
				$self->x *= $s;
				$self->y *= $s;
				$self->z *= $s;
			}
			$v->x -= $self->x;
			$v->y -= $self->y;
			$v->z -= $self->z;
		}
		{
			$tmp2 = $v->x * $v->x + $v->y * $v->y + $v->z * $v->z;
			$length1 = Math::sqrt($tmp2);
			if($length1 > 0.0) {
				$v->x /= $length1;
				$v->y /= $length1;
				$v->z /= $length1;
			}
		}
		{
			$this2 = new hxmath_math_Vector3Default($w->x, $w->y, $w->z);
			$self1 = $this2;
			$s1 = ($self1->x * $u->x + $self1->y * $u->y + $self1->z * $u->z) / ($u->x * $u->x + $u->y * $u->y + $u->z * $u->z);
			{
				$_g1 = 0;
				while($_g1 < 3) {
					$i1 = $_g1++;
					{
						$tmp3 = null;
						switch($i1) {
						case 0:{
							$tmp3 = $u->x;
						}break;
						case 1:{
							$tmp3 = $u->y;
						}break;
						case 2:{
							$tmp3 = $u->z;
						}break;
						default:{
							throw new HException("Invalid element");
						}break;
						}
						$value1 = $tmp3;
						switch($i1) {
						case 0:{
							$self1->x = $value1;
						}break;
						case 1:{
							$self1->y = $value1;
						}break;
						case 2:{
							$self1->z = $value1;
						}break;
						default:{
							throw new HException("Invalid element");
						}break;
						}
						unset($value1,$tmp3);
					}
					unset($i1);
				}
			}
			{
				$self1->x *= $s1;
				$self1->y *= $s1;
				$self1->z *= $s1;
			}
			$w->x -= $self1->x;
			$w->y -= $self1->y;
			$w->z -= $self1->z;
		}
		{
			$this3 = new hxmath_math_Vector3Default($w->x, $w->y, $w->z);
			$self2 = $this3;
			$s2 = ($self2->x * $v->x + $self2->y * $v->y + $self2->z * $v->z) / ($v->x * $v->x + $v->y * $v->y + $v->z * $v->z);
			{
				$_g2 = 0;
				while($_g2 < 3) {
					$i2 = $_g2++;
					{
						$tmp4 = null;
						switch($i2) {
						case 0:{
							$tmp4 = $v->x;
						}break;
						case 1:{
							$tmp4 = $v->y;
						}break;
						case 2:{
							$tmp4 = $v->z;
						}break;
						default:{
							throw new HException("Invalid element");
						}break;
						}
						$value2 = $tmp4;
						switch($i2) {
						case 0:{
							$self2->x = $value2;
						}break;
						case 1:{
							$self2->y = $value2;
						}break;
						case 2:{
							$self2->z = $value2;
						}break;
						default:{
							throw new HException("Invalid element");
						}break;
						}
						unset($value2,$tmp4);
					}
					unset($i2);
				}
			}
			{
				$self2->x *= $s2;
				$self2->y *= $s2;
				$self2->z *= $s2;
			}
			$w->x -= $self2->x;
			$w->y -= $self2->y;
			$w->z -= $self2->z;
		}
		{
			$tmp5 = $w->x * $w->x + $w->y * $w->y + $w->z * $w->z;
			$length2 = Math::sqrt($tmp5);
			if($length2 > 0.0) {
				$w->x /= $length2;
				$w->y /= $length2;
				$w->z /= $length2;
			}
		}
	}
	static function set($this1, $x, $y, $z) {
		$self = $this1;
		$self->x = $x;
		$self->y = $y;
		$self->z = $z;
		return $self;
	}
	static function crossWith($this1, $a) {
		$self = $this1;
		$newX = $self->y * $a->z - $self->z * $a->y;
		$newY = $self->z * $a->x - $self->x * $a->z;
		$newZ = $self->x * $a->y - $self->y * $a->x;
		$self->x = $newX;
		$self->y = $newY;
		$self->z = $newZ;
		return $self;
	}
	static function multiplyWith($this1, $s) {
		$self = $this1;
		$self->x *= $s;
		$self->y *= $s;
		$self->z *= $s;
		return $self;
	}
	static function divideWith($this1, $s) {
		$self = $this1;
		$self->x /= $s;
		$self->y /= $s;
		$self->z /= $s;
		return $self;
	}
	static function addWith($this1, $a) {
		$self = $this1;
		$self->x += $a->x;
		$self->y += $a->y;
		$self->z += $a->z;
		return $self;
	}
	static function subtractWith($this1, $a) {
		$self = $this1;
		$self->x -= $a->x;
		$self->y -= $a->y;
		$self->z -= $a->z;
		return $self;
	}
	static function maxWith($this1, $a) {
		$self = $this1;
		$self->x = Math::max($self->x, $a->x);
		$self->y = Math::max($self->y, $a->y);
		$self->z = Math::max($self->z, $a->z);
		return $self;
	}
	static function minWith($this1, $a) {
		$self = $this1;
		$self->x = Math::min($self->x, $a->x);
		$self->y = Math::min($self->y, $a->y);
		$self->z = Math::min($self->z, $a->z);
		return $self;
	}
	static function projectOnto($this1, $a) {
		$self = $this1;
		$s = ($self->x * $a->x + $self->y * $a->y + $self->z * $a->z) / ($a->x * $a->x + $a->y * $a->y + $a->z * $a->z);
		{
			$_g = 0;
			while($_g < 3) {
				$i = $_g++;
				{
					$tmp = null;
					switch($i) {
					case 0:{
						$tmp = $a->x;
					}break;
					case 1:{
						$tmp = $a->y;
					}break;
					case 2:{
						$tmp = $a->z;
					}break;
					default:{
						throw new HException("Invalid element");
					}break;
					}
					$value = $tmp;
					switch($i) {
					case 0:{
						$self->x = $value;
					}break;
					case 1:{
						$self->y = $value;
					}break;
					case 2:{
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
		{
			$self->x *= $s;
			$self->y *= $s;
			$self->z *= $s;
		}
		return $self;
	}
	static function projectOntoPlane($this1, $normal) {
		$self = $this1;
		{
			$this2 = new hxmath_math_Vector3Default($self->x, $self->y, $self->z);
			$self1 = $this2;
			$s = ($self1->x * $normal->x + $self1->y * $normal->y + $self1->z * $normal->z) / ($normal->x * $normal->x + $normal->y * $normal->y + $normal->z * $normal->z);
			{
				$_g = 0;
				while($_g < 3) {
					$i = $_g++;
					{
						$tmp = null;
						switch($i) {
						case 0:{
							$tmp = $normal->x;
						}break;
						case 1:{
							$tmp = $normal->y;
						}break;
						case 2:{
							$tmp = $normal->z;
						}break;
						default:{
							throw new HException("Invalid element");
						}break;
						}
						$value = $tmp;
						switch($i) {
						case 0:{
							$self1->x = $value;
						}break;
						case 1:{
							$self1->y = $value;
						}break;
						case 2:{
							$self1->z = $value;
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
			{
				$self1->x *= $s;
				$self1->y *= $s;
				$self1->z *= $s;
			}
			$self->x -= $self1->x;
			$self->y -= $self1->y;
			$self->z -= $self1->z;
		}
		return $self;
	}
	static function reflectBy($this1, $normal) {
		$self = $this1;
		$this2 = new hxmath_math_Vector3Default($self->x, $self->y, $self->z);
		$self1 = $this2;
		$s = ($self1->x * $normal->x + $self1->y * $normal->y + $self1->z * $normal->z) / ($normal->x * $normal->x + $normal->y * $normal->y + $normal->z * $normal->z);
		{
			$_g = 0;
			while($_g < 3) {
				$i = $_g++;
				{
					$tmp = null;
					switch($i) {
					case 0:{
						$tmp = $normal->x;
					}break;
					case 1:{
						$tmp = $normal->y;
					}break;
					case 2:{
						$tmp = $normal->z;
					}break;
					default:{
						throw new HException("Invalid element");
					}break;
					}
					$value = $tmp;
					switch($i) {
					case 0:{
						$self1->x = $value;
					}break;
					case 1:{
						$self1->y = $value;
					}break;
					case 2:{
						$self1->z = $value;
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
		{
			$self1->x *= $s;
			$self1->y *= $s;
			$self1->z *= $s;
		}
		{
			$self1->x *= 2.0;
			$self1->y *= 2.0;
			$self1->z *= 2.0;
		}
		{
			$self->x -= $self1->x;
			$self->y -= $self1->y;
			$self->z -= $self1->z;
		}
		return $self;
	}
	static function copyTo($this1, $target) {
		$self = $this1;
		{
			$_g = 0;
			while($_g < 3) {
				$i = $_g++;
				{
					$tmp = null;
					switch($i) {
					case 0:{
						$tmp = $self->x;
					}break;
					case 1:{
						$tmp = $self->y;
					}break;
					case 2:{
						$tmp = $self->z;
					}break;
					default:{
						throw new HException("Invalid element");
					}break;
					}
					$value = $tmp;
					switch($i) {
					case 0:{
						$target->x = $value;
					}break;
					case 1:{
						$target->y = $value;
					}break;
					case 2:{
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
		$target->x = $self->x;
		$target->y = $self->y;
		$target->z = $self->z;
	}
	static function copyFromShape($this1, $source) {
		$self = $this1;
		$self->x = $source->x;
		$self->y = $source->y;
		$self->z = $source->z;
	}
	static function hclone($this1) {
		$self = $this1;
		$this2 = new hxmath_math_Vector3Default($self->x, $self->y, $self->z);
		return $this2;
	}
	static function getArrayElement($this1, $i) {
		$self = $this1;
		switch($i) {
		case 0:{
			return $self->x;
		}break;
		case 1:{
			return $self->y;
		}break;
		case 2:{
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
			return $self->x = $value;
		}break;
		case 1:{
			return $self->y = $value;
		}break;
		case 2:{
			return $self->z = $value;
		}break;
		default:{
			throw new HException("Invalid element");
		}break;
		}
	}
	static function applyNegate($this1) {
		$self = $this1;
		$self->x = -$self->x;
		$self->y = -$self->y;
		$self->z = -$self->z;
		return $self;
	}
	static function applyScalarFunc($this1, $func) {
		$self = $this1;
		{
			$_g = 0;
			while($_g < 3) {
				$i = $_g++;
				{
					$tmp = null;
					switch($i) {
					case 0:{
						$tmp = $self->x;
					}break;
					case 1:{
						$tmp = $self->y;
					}break;
					case 2:{
						$tmp = $self->z;
					}break;
					default:{
						throw new HException("Invalid element");
					}break;
					}
					$value = call_user_func_array($func, array($tmp));
					switch($i) {
					case 0:{
						$self->x = $value;
					}break;
					case 1:{
						$self->y = $value;
					}break;
					case 2:{
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
	static function angleWith($this1, $b) {
		$self = $this1;
		$tmp = $self->x * $b->x + $self->y * $b->y + $self->z * $b->z;
		$tmp1 = $self->x * $self->x + $self->y * $self->y + $self->z * $self->z;
		$tmp2 = Math::sqrt($tmp1);
		$tmp3 = $b->x * $b->x + $b->y * $b->y + $b->z * $b->z;
		$tmp4 = Math::sqrt($tmp3);
		return Math::acos($tmp / ($tmp2 * $tmp4));
	}
	static function distanceTo($this1, $b) {
		$self = $this1;
		$this2 = new hxmath_math_Vector3Default($self->x, $self->y, $self->z);
		$self1 = $this2;
		$self1->x -= $b->x;
		$self1->y -= $b->y;
		$self1->z -= $b->z;
		$self2 = $self1;
		$tmp = $self2->x * $self2->x + $self2->y * $self2->y + $self2->z * $self2->z;
		return Math::sqrt($tmp);
	}
	static function normalize($this1) {
		$self = $this1;
		$tmp = $self->x * $self->x + $self->y * $self->y + $self->z * $self->z;
		$length = Math::sqrt($tmp);
		if($length > 0.0) {
			$self->x /= $length;
			$self->y /= $length;
			$self->z /= $length;
		}
		return $self;
	}
	static function normalizeTo($this1, $newLength) {
		$self = $this1;
		{
			$tmp = $self->x * $self->x + $self->y * $self->y + $self->z * $self->z;
			$length = Math::sqrt($tmp);
			if($length > 0.0) {
				$self->x /= $length;
				$self->y /= $length;
				$self->z /= $length;
			}
		}
		{
			$self->x *= $newLength;
			$self->y *= $newLength;
			$self->z *= $newLength;
		}
		return $self;
	}
	static function clamp($this1, $min, $max) {
		$self = $this1;
		$tmp = $self->x * $self->x + $self->y * $self->y + $self->z * $self->z;
		$length = Math::sqrt($tmp);
		if($length < $min) {
			{
				$tmp1 = $self->x * $self->x + $self->y * $self->y + $self->z * $self->z;
				$length1 = Math::sqrt($tmp1);
				if($length1 > 0.0) {
					$self->x /= $length1;
					$self->y /= $length1;
					$self->z /= $length1;
				}
			}
			{
				$self->x *= $min;
				$self->y *= $min;
				$self->z *= $min;
			}
		} else {
			if($length > $max) {
				{
					$tmp2 = $self->x * $self->x + $self->y * $self->y + $self->z * $self->z;
					$length2 = Math::sqrt($tmp2);
					if($length2 > 0.0) {
						$self->x /= $length2;
						$self->y /= $length2;
						$self->z /= $length2;
					}
				}
				{
					$self->x *= $max;
					$self->y *= $max;
					$self->z *= $max;
				}
			}
		}
		return $self;
	}
	static function get_length($this1) {
		$self = $this1;
		$tmp = $self->x * $self->x + $self->y * $self->y + $self->z * $self->z;
		return Math::sqrt($tmp);
	}
	static function get_lengthSq($this1) {
		$self = $this1;
		return $self->x * $self->x + $self->y * $self->y + $self->z * $self->z;
	}
	static function get_zero() {
		$this1 = new hxmath_math_Vector3Default(0.0, 0.0, 0.0);
		return $this1;
	}
	static function get_xAxis() {
		$this1 = new hxmath_math_Vector3Default(1.0, 0.0, 0.0);
		return $this1;
	}
	static function get_yAxis() {
		$this1 = new hxmath_math_Vector3Default(0.0, 1.0, 0.0);
		return $this1;
	}
	static function get_zAxis() {
		$this1 = new hxmath_math_Vector3Default(0.0, 0.0, 1.0);
		return $this1;
	}
	static $__properties__ = array("get_lengthSq" => "get_lengthSq","get_length" => "get_length","get_zAxis" => "get_zAxis","get_yAxis" => "get_yAxis","get_xAxis" => "get_xAxis","get_zero" => "get_zero");
	function __toString() { return 'hxmath.math._Vector3.Vector3_Impl_'; }
}
