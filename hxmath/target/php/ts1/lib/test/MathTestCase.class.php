<?php

// Generated by Haxe 3.3.0
class test_MathTestCase extends nanotest_NanoTestCase {
	public function __construct($posInfos = null) { if(!php_Boot::$skip_constructor) {
		parent::__construct($posInfos);
	}}
	public function randomFloat($center = null, $width = null, $precision = null) {
		if($precision === null) {
			$precision = 1e-4;
		}
		if($width === null) {
			$width = 1.0;
		}
		if($center === null) {
			$center = 0.0;
		}
		$tmp = Math::random();
		$tmp1 = Math::floor((($tmp - 0.5) * $width + $center) / $precision);
		return $tmp1 * $precision;
	}
	public function randomInt() {
		$tmp = Math::random();
		return Math::floor($tmp * 10);
	}
	public function randomArray($size, $distribution = null) {
		$data = new _hx_array(array());
		$distribution1 = null;
		if($distribution === null) {
			$distribution1 = new test_Distribution();
		} else {
			$distribution1 = $distribution;
		}
		{
			$_g1 = 0;
			while($_g1 < $size) {
				++$_g1;
				$tmp = $this->randomFloat($distribution1->center, $distribution1->width, $distribution1->precision);
				$data->push($tmp);
				unset($tmp);
			}
		}
		return $data;
	}
	public function assertApproxEquals($expected, $actual, $tolerance = null, $p = null) {
		if($tolerance === null) {
			$tolerance = 1e-6;
		}
		$tmp = Math::abs($expected - $actual);
		if($tmp < $tolerance) {
			$this->success($p);
		} else {
			$this->fail("expected " . _hx_string_rec($expected, "") . " +-" . _hx_string_rec($tolerance, "") . " but was " . _hx_string_rec($actual, ""), $p);
		}
	}
	public function randomVector2($precision = null) {
		if($precision === null) {
			$precision = 1e-4;
		}
		$distribution = new test_Distribution();
		$distribution->precision = $precision;
		$rawData = $this->randomArray(2, $distribution);
		if($rawData->length !== 2) {
			throw new HException("Invalid rawData.");
		}
		$this1 = new hxmath_math_Vector2Default($rawData[0], $rawData[1]);
		return $this1;
	}
	public function randomVector3($precision = null) {
		if($precision === null) {
			$precision = 1e-4;
		}
		$distribution = new test_Distribution();
		$distribution->precision = $precision;
		$rawData = $this->randomArray(3, $distribution);
		if($rawData->length !== 3) {
			throw new HException("Invalid rawData.");
		}
		$this1 = new hxmath_math_Vector3Default($rawData[0], $rawData[1], $rawData[2]);
		return $this1;
	}
	public function randomVector4($precision = null) {
		if($precision === null) {
			$precision = 1e-4;
		}
		$distribution = new test_Distribution();
		$distribution->precision = $precision;
		$rawData = $this->randomArray(4, $distribution);
		if($rawData->length !== 4) {
			throw new HException("Invalid rawData.");
		}
		$this1 = new hxmath_math_Vector4Default($rawData[0], $rawData[1], $rawData[2], $rawData[3]);
		return $this1;
	}
	public function randomMatrix2x2($precision = null) {
		if($precision === null) {
			$precision = 1e-4;
		}
		$distribution = new test_Distribution();
		$distribution->precision = $precision;
		$rawData = $this->randomArray(4, $distribution);
		if($rawData->length !== 4) {
			throw new HException("Invalid rawData.");
		}
		$this1 = new hxmath_math_Matrix2x2Default($rawData[0], $rawData[1], $rawData[2], $rawData[3]);
		return $this1;
	}
	public function randomMatrix3x2($precision = null) {
		if($precision === null) {
			$precision = 1e-4;
		}
		$distribution = new test_Distribution();
		$distribution->precision = $precision;
		$rawData = $this->randomArray(6, $distribution);
		if($rawData->length !== 6) {
			throw new HException("Invalid rawData.");
		}
		$this1 = new hxmath_math_Matrix3x2Default($rawData[0], $rawData[1], $rawData[2], $rawData[3], $rawData[4], $rawData[5]);
		return $this1;
	}
	public function randomMatrix3x3($precision = null) {
		if($precision === null) {
			$precision = 1e-4;
		}
		$distribution = new test_Distribution();
		$distribution->precision = $precision;
		$rawData = $this->randomArray(9, $distribution);
		if($rawData->length !== 9) {
			throw new HException("Invalid rawData.");
		}
		$this1 = new hxmath_math_Matrix3x3Default($rawData[0], $rawData[1], $rawData[2], $rawData[3], $rawData[4], $rawData[5], $rawData[6], $rawData[7], $rawData[8]);
		return $this1;
	}
	public function randomMatrix4x4($precision = null) {
		if($precision === null) {
			$precision = 1e-4;
		}
		$distribution = new test_Distribution();
		$distribution->precision = $precision;
		$rawData = $this->randomArray(16, $distribution);
		if($rawData->length !== 16) {
			throw new HException("Invalid rawData.");
		}
		$this1 = new hxmath_math_Matrix4x4Default($rawData[0], $rawData[1], $rawData[2], $rawData[3], $rawData[4], $rawData[5], $rawData[6], $rawData[7], $rawData[8], $rawData[9], $rawData[10], $rawData[11], $rawData[12], $rawData[13], $rawData[14], $rawData[15]);
		return $this1;
	}
	public function randomQuaternion($precision = null) {
		if($precision === null) {
			$precision = 1e-4;
		}
		$distribution = new test_Distribution();
		$distribution->precision = $precision;
		$rawData = $this->randomArray(4, $distribution);
		if($rawData->length !== 4) {
			throw new HException("Invalid rawData.");
		}
		$this1 = new hxmath_math_QuaternionDefault($rawData[0], $rawData[1], $rawData[2], $rawData[3]);
		return $this1;
	}
	public function randomIntVector2() {
		$tmp = $this->randomInt();
		$tmp1 = $this->randomInt();
		return hxmath_math__IntVector2_IntVector2_Impl_::_new($tmp, $tmp1);
	}
	public function randomShortVector2() {
		$tmp = $this->randomInt();
		$tmp1 = $this->randomInt();
		return hxmath_math__ShortVector2_ShortVector2_Impl_::_new($tmp, $tmp1);
	}
	public function randomFrame2($precision = null) {
		if($precision === null) {
			$precision = 1e-4;
		}
		$tmp = $this->randomVector2($precision);
		$tmp1 = $this->randomFloat(0.0, 1.0, $precision);
		return hxmath_frames__Frame2_Frame2_Impl_::_new($tmp, $tmp1 * Math::$PI);
	}
	public function randomFrame3($precision = null) {
		if($precision === null) {
			$precision = 1e-4;
		}
		$tmp = $this->randomVector3($precision);
		$this1 = $this->randomQuaternion($precision);
		$self = $this1;
		$tmp1 = $self->s * $self->s + $self->x * $self->x + $self->y * $self->y + $self->z * $self->z;
		$tmp2 = Math::sqrt($tmp1);
		$_g = 1.0 / $tmp2;
		$this2 = new hxmath_math_QuaternionDefault($self->s, $self->x, $self->y, $self->z);
		$self1 = $this2;
		$self1->s *= $_g;
		$self1->x *= $_g;
		$self1->y *= $_g;
		$self1->z *= $_g;
		return hxmath_frames__Frame3_Frame3_Impl_::_new($tmp, $self1);
	}
	function __toString() { return 'test.MathTestCase'; }
}
