<?php

// Generated by Haxe 3.3.0
class hxmath_math__Matrix4x4_Matrix4x4_Impl_ {
	public function __construct(){}
	static $elementCount = 16;
	static function _new($m00, $m10, $m20, $m30, $m01, $m11, $m21, $m31, $m02, $m12, $m22, $m32, $m03, $m13, $m23, $m33) {
		$this1 = new hxmath_math_Matrix4x4Default($m00, $m10, $m20, $m30, $m01, $m11, $m21, $m31, $m02, $m12, $m22, $m32, $m03, $m13, $m23, $m33);
		return $this1;
	}
	static function fromArray($rawData) {
		if($rawData->length !== 16) {
			throw new HException("Invalid rawData.");
		}
		$this1 = new hxmath_math_Matrix4x4Default($rawData[0], $rawData[1], $rawData[2], $rawData[3], $rawData[4], $rawData[5], $rawData[6], $rawData[7], $rawData[8], $rawData[9], $rawData[10], $rawData[11], $rawData[12], $rawData[13], $rawData[14], $rawData[15]);
		return $this1;
	}
	static function fromMatrix4x4Shape($other) {
		$this1 = new hxmath_math_Matrix4x4Default($other->m00, $other->m10, $other->m20, $other->m30, $other->m01, $other->m11, $other->m21, $other->m31, $other->m02, $other->m12, $other->m22, $other->m32, $other->m03, $other->m13, $other->m23, $other->m33);
		return $this1;
	}
	static function multiplyVector($a, $v) {
		$this1 = new hxmath_math_Vector4Default($a->m00 * $v->x + $a->m10 * $v->y + $a->m20 * $v->z + $a->m30 * $v->w, $a->m01 * $v->x + $a->m11 * $v->y + $a->m21 * $v->z + $a->m31 * $v->w, $a->m02 * $v->x + $a->m12 * $v->y + $a->m22 * $v->z + $a->m32 * $v->w, $a->m03 * $v->x + $a->m13 * $v->y + $a->m23 * $v->z + $a->m33 * $v->w);
		return $this1;
	}
	static function multiply($a, $b) {
		$this1 = new hxmath_math_Matrix4x4Default($a->m00 * $b->m00 + $a->m10 * $b->m01 + $a->m20 * $b->m02 + $a->m30 * $b->m03, $a->m00 * $b->m10 + $a->m10 * $b->m11 + $a->m20 * $b->m12 + $a->m30 * $b->m13, $a->m00 * $b->m20 + $a->m10 * $b->m21 + $a->m20 * $b->m22 + $a->m30 * $b->m23, $a->m00 * $b->m30 + $a->m10 * $b->m31 + $a->m20 * $b->m32 + $a->m30 * $b->m33, $a->m01 * $b->m00 + $a->m11 * $b->m01 + $a->m21 * $b->m02 + $a->m31 * $b->m03, $a->m01 * $b->m10 + $a->m11 * $b->m11 + $a->m21 * $b->m12 + $a->m31 * $b->m13, $a->m01 * $b->m20 + $a->m11 * $b->m21 + $a->m21 * $b->m22 + $a->m31 * $b->m23, $a->m01 * $b->m30 + $a->m11 * $b->m31 + $a->m21 * $b->m32 + $a->m31 * $b->m33, $a->m02 * $b->m00 + $a->m12 * $b->m01 + $a->m22 * $b->m02 + $a->m32 * $b->m03, $a->m02 * $b->m10 + $a->m12 * $b->m11 + $a->m22 * $b->m12 + $a->m32 * $b->m13, $a->m02 * $b->m20 + $a->m12 * $b->m21 + $a->m22 * $b->m22 + $a->m32 * $b->m23, $a->m02 * $b->m30 + $a->m12 * $b->m31 + $a->m22 * $b->m32 + $a->m32 * $b->m33, $a->m03 * $b->m00 + $a->m13 * $b->m01 + $a->m23 * $b->m02 + $a->m33 * $b->m03, $a->m03 * $b->m10 + $a->m13 * $b->m11 + $a->m23 * $b->m12 + $a->m33 * $b->m13, $a->m03 * $b->m20 + $a->m13 * $b->m21 + $a->m23 * $b->m22 + $a->m33 * $b->m23, $a->m03 * $b->m30 + $a->m13 * $b->m31 + $a->m23 * $b->m32 + $a->m33 * $b->m33);
		return $this1;
	}
	static function add($a, $b) {
		$this1 = new hxmath_math_Matrix4x4Default($a->m00, $a->m10, $a->m20, $a->m30, $a->m01, $a->m11, $a->m21, $a->m31, $a->m02, $a->m12, $a->m22, $a->m32, $a->m03, $a->m13, $a->m23, $a->m33);
		$self = $this1;
		$self->m00 += $b->m00;
		$self->m10 += $b->m10;
		$self->m20 += $b->m20;
		$self->m30 += $b->m30;
		$self->m01 += $b->m01;
		$self->m11 += $b->m11;
		$self->m21 += $b->m21;
		$self->m31 += $b->m31;
		$self->m02 += $b->m02;
		$self->m12 += $b->m12;
		$self->m22 += $b->m22;
		$self->m32 += $b->m32;
		$self->m03 += $b->m03;
		$self->m13 += $b->m13;
		$self->m23 += $b->m23;
		$self->m33 += $b->m33;
		return $self;
	}
	static function subtract($a, $b) {
		$this1 = new hxmath_math_Matrix4x4Default($a->m00, $a->m10, $a->m20, $a->m30, $a->m01, $a->m11, $a->m21, $a->m31, $a->m02, $a->m12, $a->m22, $a->m32, $a->m03, $a->m13, $a->m23, $a->m33);
		$self = $this1;
		$self->m00 -= $b->m00;
		$self->m10 -= $b->m10;
		$self->m20 -= $b->m20;
		$self->m30 -= $b->m30;
		$self->m01 -= $b->m01;
		$self->m11 -= $b->m11;
		$self->m21 -= $b->m21;
		$self->m31 -= $b->m31;
		$self->m02 -= $b->m02;
		$self->m12 -= $b->m12;
		$self->m22 -= $b->m22;
		$self->m32 -= $b->m32;
		$self->m03 -= $b->m03;
		$self->m13 -= $b->m13;
		$self->m23 -= $b->m23;
		$self->m33 -= $b->m33;
		return $self;
	}
	static function negate($a) {
		$this1 = new hxmath_math_Matrix4x4Default(-$a->m00, -$a->m10, -$a->m20, -$a->m30, -$a->m01, -$a->m11, -$a->m21, -$a->m31, -$a->m02, -$a->m12, -$a->m22, -$a->m32, -$a->m03, -$a->m13, -$a->m23, -$a->m33);
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
			$tmp5 = null;
			$tmp6 = null;
			$tmp7 = null;
			$tmp8 = null;
			$tmp9 = null;
			$tmp10 = null;
			$tmp11 = null;
			$tmp12 = null;
			$tmp13 = null;
			$tmp14 = null;
			$tmp15 = null;
			$tmp16 = null;
			if($a !== null) {
				$tmp16 = $b !== null;
			} else {
				$tmp16 = false;
			}
			if($tmp16) {
				$tmp15 = $a->m00 === $b->m00;
			} else {
				$tmp15 = false;
			}
			if($tmp15) {
				$tmp14 = $a->m10 === $b->m10;
			} else {
				$tmp14 = false;
			}
			if($tmp14) {
				$tmp13 = $a->m20 === $b->m20;
			} else {
				$tmp13 = false;
			}
			if($tmp13) {
				$tmp12 = $a->m30 === $b->m30;
			} else {
				$tmp12 = false;
			}
			if($tmp12) {
				$tmp11 = $a->m01 === $b->m01;
			} else {
				$tmp11 = false;
			}
			if($tmp11) {
				$tmp10 = $a->m11 === $b->m11;
			} else {
				$tmp10 = false;
			}
			if($tmp10) {
				$tmp9 = $a->m21 === $b->m21;
			} else {
				$tmp9 = false;
			}
			if($tmp9) {
				$tmp8 = $a->m31 === $b->m31;
			} else {
				$tmp8 = false;
			}
			if($tmp8) {
				$tmp7 = $a->m02 === $b->m02;
			} else {
				$tmp7 = false;
			}
			if($tmp7) {
				$tmp6 = $a->m12 === $b->m12;
			} else {
				$tmp6 = false;
			}
			if($tmp6) {
				$tmp5 = $a->m22 === $b->m22;
			} else {
				$tmp5 = false;
			}
			if($tmp5) {
				$tmp4 = $a->m32 === $b->m32;
			} else {
				$tmp4 = false;
			}
			if($tmp4) {
				$tmp3 = $a->m03 === $b->m03;
			} else {
				$tmp3 = false;
			}
			if($tmp3) {
				$tmp2 = $a->m13 === $b->m13;
			} else {
				$tmp2 = false;
			}
			if($tmp2) {
				$tmp1 = $a->m23 === $b->m23;
			} else {
				$tmp1 = false;
			}
			if($tmp1) {
				return $a->m33 === $b->m33;
			} else {
				return false;
			}
		} else {
			return true;
		}
	}
	static function set($this1, $m00, $m10, $m20, $m30, $m01, $m11, $m21, $m31, $m02, $m12, $m22, $m32, $m03, $m13, $m23, $m33) {
		$self = $this1;
		$self->m00 = $m00;
		$self->m10 = $m10;
		$self->m20 = $m20;
		$self->m30 = $m30;
		$self->m01 = $m01;
		$self->m11 = $m11;
		$self->m21 = $m21;
		$self->m31 = $m31;
		$self->m02 = $m02;
		$self->m12 = $m12;
		$self->m22 = $m22;
		$self->m32 = $m32;
		$self->m03 = $m03;
		$self->m13 = $m13;
		$self->m23 = $m23;
		$self->m33 = $m33;
		return $self;
	}
	static function addWith($this1, $a) {
		$self = $this1;
		$self->m00 += $a->m00;
		$self->m10 += $a->m10;
		$self->m20 += $a->m20;
		$self->m30 += $a->m30;
		$self->m01 += $a->m01;
		$self->m11 += $a->m11;
		$self->m21 += $a->m21;
		$self->m31 += $a->m31;
		$self->m02 += $a->m02;
		$self->m12 += $a->m12;
		$self->m22 += $a->m22;
		$self->m32 += $a->m32;
		$self->m03 += $a->m03;
		$self->m13 += $a->m13;
		$self->m23 += $a->m23;
		$self->m33 += $a->m33;
		return $self;
	}
	static function subtractWith($this1, $a) {
		$self = $this1;
		$self->m00 -= $a->m00;
		$self->m10 -= $a->m10;
		$self->m20 -= $a->m20;
		$self->m30 -= $a->m30;
		$self->m01 -= $a->m01;
		$self->m11 -= $a->m11;
		$self->m21 -= $a->m21;
		$self->m31 -= $a->m31;
		$self->m02 -= $a->m02;
		$self->m12 -= $a->m12;
		$self->m22 -= $a->m22;
		$self->m32 -= $a->m32;
		$self->m03 -= $a->m03;
		$self->m13 -= $a->m13;
		$self->m23 -= $a->m23;
		$self->m33 -= $a->m33;
		return $self;
	}
	static function copyTo($this1, $target) {
		$self = $this1;
		{
			$_g = 0;
			while($_g < 16) {
				$i = $_g++;
				{
					$tmp = null;
					switch($i) {
					case 0:{
						$tmp = $self->m00;
					}break;
					case 1:{
						$tmp = $self->m10;
					}break;
					case 2:{
						$tmp = $self->m20;
					}break;
					case 3:{
						$tmp = $self->m30;
					}break;
					case 4:{
						$tmp = $self->m01;
					}break;
					case 5:{
						$tmp = $self->m11;
					}break;
					case 6:{
						$tmp = $self->m21;
					}break;
					case 7:{
						$tmp = $self->m31;
					}break;
					case 8:{
						$tmp = $self->m02;
					}break;
					case 9:{
						$tmp = $self->m12;
					}break;
					case 10:{
						$tmp = $self->m22;
					}break;
					case 11:{
						$tmp = $self->m32;
					}break;
					case 12:{
						$tmp = $self->m03;
					}break;
					case 13:{
						$tmp = $self->m13;
					}break;
					case 14:{
						$tmp = $self->m23;
					}break;
					case 15:{
						$tmp = $self->m33;
					}break;
					default:{
						throw new HException("Invalid element");
					}break;
					}
					$value = $tmp;
					switch($i) {
					case 0:{
						$target->m00 = $value;
					}break;
					case 1:{
						$target->m10 = $value;
					}break;
					case 2:{
						$target->m20 = $value;
					}break;
					case 3:{
						$target->m30 = $value;
					}break;
					case 4:{
						$target->m01 = $value;
					}break;
					case 5:{
						$target->m11 = $value;
					}break;
					case 6:{
						$target->m21 = $value;
					}break;
					case 7:{
						$target->m31 = $value;
					}break;
					case 8:{
						$target->m02 = $value;
					}break;
					case 9:{
						$target->m12 = $value;
					}break;
					case 10:{
						$target->m22 = $value;
					}break;
					case 11:{
						$target->m32 = $value;
					}break;
					case 12:{
						$target->m03 = $value;
					}break;
					case 13:{
						$target->m13 = $value;
					}break;
					case 14:{
						$target->m23 = $value;
					}break;
					case 15:{
						$target->m33 = $value;
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
		$target->m00 = $self->m00;
		$target->m01 = $self->m01;
		$target->m02 = $self->m02;
		$target->m03 = $self->m03;
		$target->m10 = $self->m10;
		$target->m11 = $self->m11;
		$target->m12 = $self->m12;
		$target->m13 = $self->m13;
		$target->m20 = $self->m20;
		$target->m21 = $self->m21;
		$target->m22 = $self->m22;
		$target->m23 = $self->m23;
		$target->m30 = $self->m30;
		$target->m31 = $self->m31;
		$target->m32 = $self->m32;
		$target->m33 = $self->m33;
	}
	static function copyFromShape($this1, $source) {
		$self = $this1;
		$self->m00 = $source->m00;
		$self->m01 = $source->m01;
		$self->m02 = $source->m02;
		$self->m03 = $source->m03;
		$self->m10 = $source->m10;
		$self->m11 = $source->m11;
		$self->m12 = $source->m12;
		$self->m13 = $source->m13;
		$self->m20 = $source->m20;
		$self->m21 = $source->m21;
		$self->m22 = $source->m22;
		$self->m23 = $source->m23;
		$self->m30 = $source->m30;
		$self->m31 = $source->m31;
		$self->m32 = $source->m32;
		$self->m33 = $source->m33;
	}
	static function setRotateFromQuaternion($this1, $q) {
		$self = $this1;
		$s = $q->s;
		$x = $q->x;
		$y = $q->y;
		$z = $q->z;
		$self->m00 = 1 - 2 * ($y * $y + $z * $z);
		$self->m10 = 2 * ($x * $y - $s * $z);
		$self->m20 = 2 * ($s * $y + $x * $z);
		$self->m01 = 2 * ($x * $y + $s * $z);
		$self->m11 = 1 - 2 * ($x * $x + $z * $z);
		$self->m21 = 2 * ($y * $z - $s * $x);
		$self->m02 = 2 * ($x * $z - $s * $y);
		$self->m12 = 2 * ($y * $z + $s * $x);
		$self->m22 = 1 - 2 * ($x * $x + $y * $y);
		return $self;
	}
	static function setTranslate($this1, $x, $y, $z) {
		$self = $this1;
		$self->m30 = $x;
		$self->m31 = $y;
		$self->m32 = $z;
		$self->m33 = 1.0;
		return $self;
	}
	static function hclone($this1) {
		$self = $this1;
		$this2 = new hxmath_math_Matrix4x4Default($self->m00, $self->m10, $self->m20, $self->m30, $self->m01, $self->m11, $self->m21, $self->m31, $self->m02, $self->m12, $self->m22, $self->m32, $self->m03, $self->m13, $self->m23, $self->m33);
		return $this2;
	}
	static function getArrayElement($this1, $i) {
		$self = $this1;
		switch($i) {
		case 0:{
			return $self->m00;
		}break;
		case 1:{
			return $self->m10;
		}break;
		case 2:{
			return $self->m20;
		}break;
		case 3:{
			return $self->m30;
		}break;
		case 4:{
			return $self->m01;
		}break;
		case 5:{
			return $self->m11;
		}break;
		case 6:{
			return $self->m21;
		}break;
		case 7:{
			return $self->m31;
		}break;
		case 8:{
			return $self->m02;
		}break;
		case 9:{
			return $self->m12;
		}break;
		case 10:{
			return $self->m22;
		}break;
		case 11:{
			return $self->m32;
		}break;
		case 12:{
			return $self->m03;
		}break;
		case 13:{
			return $self->m13;
		}break;
		case 14:{
			return $self->m23;
		}break;
		case 15:{
			return $self->m33;
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
			return $self->m00 = $value;
		}break;
		case 1:{
			return $self->m10 = $value;
		}break;
		case 2:{
			return $self->m20 = $value;
		}break;
		case 3:{
			return $self->m30 = $value;
		}break;
		case 4:{
			return $self->m01 = $value;
		}break;
		case 5:{
			return $self->m11 = $value;
		}break;
		case 6:{
			return $self->m21 = $value;
		}break;
		case 7:{
			return $self->m31 = $value;
		}break;
		case 8:{
			return $self->m02 = $value;
		}break;
		case 9:{
			return $self->m12 = $value;
		}break;
		case 10:{
			return $self->m22 = $value;
		}break;
		case 11:{
			return $self->m32 = $value;
		}break;
		case 12:{
			return $self->m03 = $value;
		}break;
		case 13:{
			return $self->m13 = $value;
		}break;
		case 14:{
			return $self->m23 = $value;
		}break;
		case 15:{
			return $self->m33 = $value;
		}break;
		default:{
			throw new HException("Invalid element");
		}break;
		}
	}
	static function getElement($this1, $column, $row) {
		$self = $this1;
		$tmp = null;
		switch($row * 4 + $column) {
		case 0:{
			$tmp = $self->m00;
		}break;
		case 1:{
			$tmp = $self->m10;
		}break;
		case 2:{
			$tmp = $self->m20;
		}break;
		case 3:{
			$tmp = $self->m30;
		}break;
		case 4:{
			$tmp = $self->m01;
		}break;
		case 5:{
			$tmp = $self->m11;
		}break;
		case 6:{
			$tmp = $self->m21;
		}break;
		case 7:{
			$tmp = $self->m31;
		}break;
		case 8:{
			$tmp = $self->m02;
		}break;
		case 9:{
			$tmp = $self->m12;
		}break;
		case 10:{
			$tmp = $self->m22;
		}break;
		case 11:{
			$tmp = $self->m32;
		}break;
		case 12:{
			$tmp = $self->m03;
		}break;
		case 13:{
			$tmp = $self->m13;
		}break;
		case 14:{
			$tmp = $self->m23;
		}break;
		case 15:{
			$tmp = $self->m33;
		}break;
		default:{
			throw new HException("Invalid element");
		}break;
		}
		return $tmp;
	}
	static function setElement($this1, $column, $row, $value) {
		$self = $this1;
		$tmp = null;
		switch($row * 4 + $column) {
		case 0:{
			$tmp = $self->m00 = $value;
		}break;
		case 1:{
			$tmp = $self->m10 = $value;
		}break;
		case 2:{
			$tmp = $self->m20 = $value;
		}break;
		case 3:{
			$tmp = $self->m30 = $value;
		}break;
		case 4:{
			$tmp = $self->m01 = $value;
		}break;
		case 5:{
			$tmp = $self->m11 = $value;
		}break;
		case 6:{
			$tmp = $self->m21 = $value;
		}break;
		case 7:{
			$tmp = $self->m31 = $value;
		}break;
		case 8:{
			$tmp = $self->m02 = $value;
		}break;
		case 9:{
			$tmp = $self->m12 = $value;
		}break;
		case 10:{
			$tmp = $self->m22 = $value;
		}break;
		case 11:{
			$tmp = $self->m32 = $value;
		}break;
		case 12:{
			$tmp = $self->m03 = $value;
		}break;
		case 13:{
			$tmp = $self->m13 = $value;
		}break;
		case 14:{
			$tmp = $self->m23 = $value;
		}break;
		case 15:{
			$tmp = $self->m33 = $value;
		}break;
		default:{
			throw new HException("Invalid element");
		}break;
		}
		return $tmp;
	}
	static function col($this1, $index) {
		$self = $this1;
		switch($index) {
		case 0:{
			$this2 = new hxmath_math_Vector4Default($self->m00, $self->m01, $self->m02, $self->m03);
			return $this2;
		}break;
		case 1:{
			$this3 = new hxmath_math_Vector4Default($self->m10, $self->m11, $self->m12, $self->m13);
			return $this3;
		}break;
		case 2:{
			$this4 = new hxmath_math_Vector4Default($self->m20, $self->m21, $self->m22, $self->m23);
			return $this4;
		}break;
		case 3:{
			$this5 = new hxmath_math_Vector4Default($self->m30, $self->m31, $self->m32, $self->m33);
			return $this5;
		}break;
		default:{
			throw new HException("Invalid column");
		}break;
		}
	}
	static function row($this1, $index) {
		$self = $this1;
		switch($index) {
		case 0:{
			$this2 = new hxmath_math_Vector4Default($self->m00, $self->m10, $self->m20, $self->m30);
			return $this2;
		}break;
		case 1:{
			$this3 = new hxmath_math_Vector4Default($self->m01, $self->m11, $self->m21, $self->m31);
			return $this3;
		}break;
		case 2:{
			$this4 = new hxmath_math_Vector4Default($self->m02, $self->m12, $self->m22, $self->m32);
			return $this4;
		}break;
		case 3:{
			$this5 = new hxmath_math_Vector4Default($self->m03, $self->m13, $self->m23, $self->m33);
			return $this5;
		}break;
		default:{
			throw new HException("Invalid row");
		}break;
		}
	}
	static function applyScalarFunc($this1, $func) {
		$self = $this1;
		{
			$_g = 0;
			while($_g < 16) {
				$i = $_g++;
				{
					$tmp = null;
					switch($i) {
					case 0:{
						$tmp = $self->m00;
					}break;
					case 1:{
						$tmp = $self->m10;
					}break;
					case 2:{
						$tmp = $self->m20;
					}break;
					case 3:{
						$tmp = $self->m30;
					}break;
					case 4:{
						$tmp = $self->m01;
					}break;
					case 5:{
						$tmp = $self->m11;
					}break;
					case 6:{
						$tmp = $self->m21;
					}break;
					case 7:{
						$tmp = $self->m31;
					}break;
					case 8:{
						$tmp = $self->m02;
					}break;
					case 9:{
						$tmp = $self->m12;
					}break;
					case 10:{
						$tmp = $self->m22;
					}break;
					case 11:{
						$tmp = $self->m32;
					}break;
					case 12:{
						$tmp = $self->m03;
					}break;
					case 13:{
						$tmp = $self->m13;
					}break;
					case 14:{
						$tmp = $self->m23;
					}break;
					case 15:{
						$tmp = $self->m33;
					}break;
					default:{
						throw new HException("Invalid element");
					}break;
					}
					$value = call_user_func_array($func, array($tmp));
					switch($i) {
					case 0:{
						$self->m00 = $value;
					}break;
					case 1:{
						$self->m10 = $value;
					}break;
					case 2:{
						$self->m20 = $value;
					}break;
					case 3:{
						$self->m30 = $value;
					}break;
					case 4:{
						$self->m01 = $value;
					}break;
					case 5:{
						$self->m11 = $value;
					}break;
					case 6:{
						$self->m21 = $value;
					}break;
					case 7:{
						$self->m31 = $value;
					}break;
					case 8:{
						$self->m02 = $value;
					}break;
					case 9:{
						$self->m12 = $value;
					}break;
					case 10:{
						$self->m22 = $value;
					}break;
					case 11:{
						$self->m32 = $value;
					}break;
					case 12:{
						$self->m03 = $value;
					}break;
					case 13:{
						$self->m13 = $value;
					}break;
					case 14:{
						$self->m23 = $value;
					}break;
					case 15:{
						$self->m33 = $value;
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
	static function applySubMatrixTranspose($this1) {
		$self = $this1;
		$temp = $self->m01;
		$self->m01 = $self->m10;
		$self->m10 = $temp;
		$temp = $self->m02;
		$self->m02 = $self->m20;
		$self->m20 = $temp;
		$temp = $self->m12;
		$self->m12 = $self->m21;
		$self->m21 = $temp;
		return $self;
	}
	static function applyInvertFrame($this1) {
		$self = $this1;
		{
			$temp = $self->m01;
			$self->m01 = $self->m10;
			$self->m10 = $temp;
			$temp = $self->m02;
			$self->m02 = $self->m20;
			$self->m20 = $temp;
			$temp = $self->m12;
			$self->m12 = $self->m21;
			$self->m21 = $temp;
		}
		$tx = -($self->m00 * $self->m30 + $self->m10 * $self->m31 + $self->m20 * $self->m32);
		$ty = -($self->m01 * $self->m30 + $self->m11 * $self->m31 + $self->m21 * $self->m32);
		$tz = -($self->m02 * $self->m30 + $self->m12 * $self->m31 + $self->m22 * $self->m32);
		$self->m30 = $tx;
		$self->m31 = $ty;
		$self->m32 = $tz;
		return $self;
	}
	static function get_zero() {
		$this1 = new hxmath_math_Matrix4x4Default(0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
		return $this1;
	}
	static function get_identity() {
		$this1 = new hxmath_math_Matrix4x4Default(1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0);
		return $this1;
	}
	static function get_t($this1) {
		$self = $this1;
		$this2 = new hxmath_math_Vector3Default($self->m30, $self->m31, $self->m32);
		return $this2;
	}
	static function set_t($this1, $t) {
		$self = $this1;
		$self->m30 = $t->x;
		$self->m31 = $t->y;
		$self->m32 = $t->z;
		return $t;
	}
	static function get_transpose($this1) {
		$self = $this1;
		$this2 = new hxmath_math_Matrix4x4Default($self->m00, $self->m01, $self->m02, $self->m03, $self->m10, $self->m11, $self->m12, $self->m13, $self->m20, $self->m21, $self->m22, $self->m23, $self->m30, $self->m31, $self->m32, $self->m33);
		return $this2;
	}
	static function get_det($this1) {
		$self = $this1;
		$m00 = $self->m00;
		$m10 = $self->m10;
		$m20 = $self->m20;
		$m30 = $self->m30;
		$m01 = $self->m01;
		$m11 = $self->m11;
		$m21 = $self->m21;
		$m31 = $self->m31;
		$m02 = $self->m02;
		$m12 = $self->m12;
		$m22 = $self->m22;
		$m32 = $self->m32;
		$m03 = $self->m03;
		$m13 = $self->m13;
		$m23 = $self->m23;
		$m33 = $self->m33;
		return $m00 * ($m11 * ($m22 * $m33 - $m32 * $m23) - $m21 * ($m12 * $m33 - $m32 * $m13) + $m31 * ($m12 * $m23 - $m22 * $m13)) - $m10 * ($m01 * ($m22 * $m33 - $m32 * $m23) - $m21 * ($m02 * $m33 - $m32 * $m03) + $m31 * ($m02 * $m23 - $m22 * $m03)) + $m20 * ($m01 * ($m12 * $m33 - $m32 * $m13) - $m11 * ($m02 * $m33 - $m32 * $m03) + $m31 * ($m02 * $m13 - $m12 * $m03)) - $m30 * ($m01 * ($m12 * $m23 - $m22 * $m13) - $m11 * ($m02 * $m23 - $m22 * $m03) + $m21 * ($m02 * $m13 - $m12 * $m03));
	}
	static function get_subMatrix($this1) {
		$self = $this1;
		$this2 = new hxmath_math_Matrix3x3Default($self->m00, $self->m10, $self->m20, $self->m01, $self->m11, $self->m21, $self->m02, $self->m12, $self->m22);
		return $this2;
	}
	static $__properties__ = array("get_subMatrix" => "get_subMatrix","get_transpose" => "get_transpose","get_det" => "get_det","set_t" => "set_t","get_t" => "get_t","get_identity" => "get_identity","get_zero" => "get_zero");
	function __toString() { return 'hxmath.math._Matrix4x4.Matrix4x4_Impl_'; }
}
