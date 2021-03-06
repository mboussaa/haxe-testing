<?php

// Generated by Haxe 3.3.0
class test_TestStress extends test_MathTestCase {
	public function __construct($posInfos = null) {
		if(!php_Boot::$skip_constructor) {
		$this->a = 5;
		parent::__construct($posInfos);
	}}
	public $a;
	public function testDotProduct() {
		haxe_Log::trace("--Vector2 dot product--", _hx_anonymous(array("fileName" => "TestStress.hx", "lineNumber" => 12, "className" => "test.TestStress", "methodName" => "testDotProduct")));
		$time1Start = $this->a;
		$sum1 = 0.0;
		{
			$_g1 = 0;
			while($_g1 < 100000) {
				$i = $_g1++;
				$this1 = new hxmath_math_Vector2Default($i * 1.2, $i * 4.3);
				$a = $this1;
				$this2 = new hxmath_math_Vector2Default($i * 1.1, $i * 0.8);
				$b = $this2;
				$sum1 += $a->x * $b->x + $a->y * $b->y;
				unset($this2,$this1,$i,$b,$a);
			}
		}
		$time1End = $this->a;
		$time2Start = $this->a;
		$sum2 = 0.0;
		{
			$_g11 = 0;
			while($_g11 < 100000) {
				$i1 = $_g11++;
				$a1 = new hxmath_math_Vector2Default($i1 * 1.2, $i1 * 4.3);
				$b1 = new hxmath_math_Vector2Default($i1 * 1.1, $i1 * 0.8);
				$sum2 += $a1->x * $b1->x + $a1->y * $b1->y;
				unset($i1,$b1,$a1);
			}
		}
		$time2End = $this->a;
		$this->assertEquals($sum1, $sum2, _hx_anonymous(array("fileName" => "TestStress.hx", "lineNumber" => 43, "className" => "test.TestStress", "methodName" => "testDotProduct")));
		$time1 = $time1End - $time1Start;
		$time2 = $time2End - $time2Start;
		haxe_Log::trace("abstracts = " . _hx_string_rec($time1, ""), _hx_anonymous(array("fileName" => "TestStress.hx", "lineNumber" => 48, "className" => "test.TestStress", "methodName" => "testDotProduct")));
		haxe_Log::trace("direct = " . _hx_string_rec($time2, ""), _hx_anonymous(array("fileName" => "TestStress.hx", "lineNumber" => 49, "className" => "test.TestStress", "methodName" => "testDotProduct")));
		haxe_Log::trace("abstracts / direct = " . _hx_string_rec($time1 / $time2, ""), _hx_anonymous(array("fileName" => "TestStress.hx", "lineNumber" => 50, "className" => "test.TestStress", "methodName" => "testDotProduct")));
	}
	public function testMatrixProduct() {
		haxe_Log::trace("--Matrix3x3 matrix product--", _hx_anonymous(array("fileName" => "TestStress.hx", "lineNumber" => 55, "className" => "test.TestStress", "methodName" => "testMatrixProduct")));
		$time1Start = $this->a;
		$sum1 = 0.0;
		{
			$_g1 = 0;
			while($_g1 < 100000) {
				$i = $_g1++;
				$a = new hxmath_math_Matrix3x3Default($i * 1.2, $i * 4.3, $i * 1.2, $i * 4.3, $i * 1.2, $i * 4.3, $i * 1.2, $i * 4.3, $i * 1.2);
				$b = new hxmath_math_Matrix3x3Default($i * 1.1, $i * 0.8, $i * 1.1, $i * 0.8, $i * 1.1, $i * 0.8, $i * 1.1, $i * 0.8, $i * 1.1);
				$this1 = new hxmath_math_Matrix3x3Default($a->m00 * $b->m00 + $a->m10 * $b->m01 + $a->m20 * $b->m02, $a->m00 * $b->m10 + $a->m10 * $b->m11 + $a->m20 * $b->m12, $a->m00 * $b->m20 + $a->m10 * $b->m21 + $a->m20 * $b->m22, $a->m01 * $b->m00 + $a->m11 * $b->m01 + $a->m21 * $b->m02, $a->m01 * $b->m10 + $a->m11 * $b->m11 + $a->m21 * $b->m12, $a->m01 * $b->m20 + $a->m11 * $b->m21 + $a->m21 * $b->m22, $a->m02 * $b->m00 + $a->m12 * $b->m01 + $a->m22 * $b->m02, $a->m02 * $b->m10 + $a->m12 * $b->m11 + $a->m22 * $b->m12, $a->m02 * $b->m20 + $a->m12 * $b->m21 + $a->m22 * $b->m22);
				$c = $this1;
				$sum1 += $c->m00 + $c->m10 + $c->m20 + $c->m01 + $c->m11 + $c->m21 + $c->m02 + $c->m12 + $c->m22;
				unset($this1,$i,$c,$b,$a);
			}
		}
		$time1End = $this->a;
		$time2Start = $this->a;
		$sum2 = 0.0;
		{
			$_g11 = 0;
			while($_g11 < 100000) {
				$i1 = $_g11++;
				$a1 = new hxmath_math_Matrix3x3Default($i1 * 1.2, $i1 * 4.3, $i1 * 1.2, $i1 * 4.3, $i1 * 1.2, $i1 * 4.3, $i1 * 1.2, $i1 * 4.3, $i1 * 1.2);
				$b1 = new hxmath_math_Matrix3x3Default($i1 * 1.1, $i1 * 0.8, $i1 * 1.1, $i1 * 0.8, $i1 * 1.1, $i1 * 0.8, $i1 * 1.1, $i1 * 0.8, $i1 * 1.1);
				$c1 = new hxmath_math_Matrix3x3Default($a1->m00 * $b1->m00 + $a1->m10 * $b1->m01 + $a1->m20 * $b1->m02, $a1->m00 * $b1->m10 + $a1->m10 * $b1->m11 + $a1->m20 * $b1->m12, $a1->m00 * $b1->m20 + $a1->m10 * $b1->m21 + $a1->m20 * $b1->m22, $a1->m01 * $b1->m00 + $a1->m11 * $b1->m01 + $a1->m21 * $b1->m02, $a1->m01 * $b1->m10 + $a1->m11 * $b1->m11 + $a1->m21 * $b1->m12, $a1->m01 * $b1->m20 + $a1->m11 * $b1->m21 + $a1->m21 * $b1->m22, $a1->m02 * $b1->m00 + $a1->m12 * $b1->m01 + $a1->m22 * $b1->m02, $a1->m02 * $b1->m10 + $a1->m12 * $b1->m11 + $a1->m22 * $b1->m12, $a1->m02 * $b1->m20 + $a1->m12 * $b1->m21 + $a1->m22 * $b1->m22);
				$sum2 += $c1->m00 + $c1->m10 + $c1->m20 + $c1->m01 + $c1->m11 + $c1->m21 + $c1->m02 + $c1->m12 + $c1->m22;
				unset($i1,$c1,$b1,$a1);
			}
		}
		$time2End = $this->a;
		$this->assertEquals($sum1, $sum2, _hx_anonymous(array("fileName" => "TestStress.hx", "lineNumber" => 116, "className" => "test.TestStress", "methodName" => "testMatrixProduct")));
		$time1 = $time1End - $time1Start;
		$time2 = $time2End - $time2Start;
		haxe_Log::trace("abstracts = " . _hx_string_rec($time1, ""), _hx_anonymous(array("fileName" => "TestStress.hx", "lineNumber" => 121, "className" => "test.TestStress", "methodName" => "testMatrixProduct")));
		haxe_Log::trace("direct = " . _hx_string_rec($time2, ""), _hx_anonymous(array("fileName" => "TestStress.hx", "lineNumber" => 122, "className" => "test.TestStress", "methodName" => "testMatrixProduct")));
		haxe_Log::trace("abstracts / direct = " . _hx_string_rec($time1 / $time2, ""), _hx_anonymous(array("fileName" => "TestStress.hx", "lineNumber" => 123, "className" => "test.TestStress", "methodName" => "testMatrixProduct")));
	}
	public function testMatrix3x2Constructor() {
		haxe_Log::trace("--Matrix3x2 constructor--", _hx_anonymous(array("fileName" => "TestStress.hx", "lineNumber" => 128, "className" => "test.TestStress", "methodName" => "testMatrix3x2Constructor")));
		$abstractTimeStart = $this->a;
		$sum1 = 0.0;
		{
			$_g1 = 0;
			while($_g1 < 100000) {
				$i = $_g1++;
				$this1 = new hxmath_math_Matrix3x2Default($i * 1.2, $i * 4.3, $i * 1.2, $i * 4.3, $i * 1.2, $i * 4.3);
				$m = $this1;
				$sum1 += $m->a + $m->b + $m->c + $m->d + $m->tx + $m->ty;
				unset($this1,$m,$i);
			}
		}
		$abstractTimeEnd = $this->a;
		$classTimeStart = $this->a;
		$sum2 = 0.0;
		{
			$_g11 = 0;
			while($_g11 < 100000) {
				$i1 = $_g11++;
				$m1 = new hxmath_math_Matrix3x2Default($i1 * 1.2, $i1 * 4.3, $i1 * 1.2, $i1 * 4.3, $i1 * 1.2, $i1 * 4.3);
				$sum2 += $m1->a + $m1->b + $m1->c + $m1->d + $m1->tx + $m1->ty;
				unset($m1,$i1);
			}
		}
		$classTimeEnd = $this->a;
		$this->assertEquals($sum1, $sum2, _hx_anonymous(array("fileName" => "TestStress.hx", "lineNumber" => 160, "className" => "test.TestStress", "methodName" => "testMatrix3x2Constructor")));
		$abstractTime = $abstractTimeEnd - $abstractTimeStart;
		$classTime = $classTimeEnd - $classTimeStart;
		haxe_Log::trace("abstracts = " . _hx_string_rec($abstractTime, ""), _hx_anonymous(array("fileName" => "TestStress.hx", "lineNumber" => 165, "className" => "test.TestStress", "methodName" => "testMatrix3x2Constructor")));
		haxe_Log::trace("direct = " . _hx_string_rec($classTime, ""), _hx_anonymous(array("fileName" => "TestStress.hx", "lineNumber" => 166, "className" => "test.TestStress", "methodName" => "testMatrix3x2Constructor")));
		haxe_Log::trace("abstracts / direct = " . _hx_string_rec($abstractTime / $classTime, ""), _hx_anonymous(array("fileName" => "TestStress.hx", "lineNumber" => 167, "className" => "test.TestStress", "methodName" => "testMatrix3x2Constructor")));
	}
	public function testMatrix4x4Constructor() {
		haxe_Log::trace("--Matrix4x4 constructor--", _hx_anonymous(array("fileName" => "TestStress.hx", "lineNumber" => 172, "className" => "test.TestStress", "methodName" => "testMatrix4x4Constructor")));
		$abstractTimeStart = $this->a;
		$sum1 = 0.0;
		{
			$_g1 = 0;
			while($_g1 < 100000) {
				$i = $_g1++;
				$this1 = new hxmath_math_Matrix4x4Default($i * 1.2, $i * 4.3, $i * 1.2, $i * 4.3, $i * 1.2, $i * 4.3, $i * 1.2, $i * 4.3, $i * 1.2, $i * 4.3, $i * 1.2, $i * 4.3, $i * 1.2, $i * 4.3, $i * 1.2, $i * 4.3);
				$a = $this1;
				$sum1 += $a->m00 + $a->m10 + $a->m20 + $a->m30 + $a->m01 + $a->m11 + $a->m21 + $a->m31 + $a->m02 + $a->m12 + $a->m22 + $a->m32 + $a->m03 + $a->m13 + $a->m23 + $a->m33;
				unset($this1,$i,$a);
			}
		}
		$abstractTimeEnd = $this->a;
		$classTimeStart = $this->a;
		$sum2 = 0.0;
		{
			$_g11 = 0;
			while($_g11 < 100000) {
				$i1 = $_g11++;
				$a1 = new hxmath_math_Matrix4x4Default($i1 * 1.2, $i1 * 4.3, $i1 * 1.2, $i1 * 4.3, $i1 * 1.2, $i1 * 4.3, $i1 * 1.2, $i1 * 4.3, $i1 * 1.2, $i1 * 4.3, $i1 * 1.2, $i1 * 4.3, $i1 * 1.2, $i1 * 4.3, $i1 * 1.2, $i1 * 4.3);
				$sum2 += $a1->m00 + $a1->m10 + $a1->m20 + $a1->m30 + $a1->m01 + $a1->m11 + $a1->m21 + $a1->m31 + $a1->m02 + $a1->m12 + $a1->m22 + $a1->m32 + $a1->m03 + $a1->m13 + $a1->m23 + $a1->m33;
				unset($i1,$a1);
			}
		}
		$classTimeEnd = $this->a;
		$this->assertEquals($sum1, $sum2, _hx_anonymous(array("fileName" => "TestStress.hx", "lineNumber" => 216, "className" => "test.TestStress", "methodName" => "testMatrix4x4Constructor")));
		$abstractTime = $abstractTimeEnd - $abstractTimeStart;
		$classTime = $classTimeEnd - $classTimeStart;
		haxe_Log::trace("abstracts = " . _hx_string_rec($abstractTime, ""), _hx_anonymous(array("fileName" => "TestStress.hx", "lineNumber" => 221, "className" => "test.TestStress", "methodName" => "testMatrix4x4Constructor")));
		haxe_Log::trace("direct = " . _hx_string_rec($classTime, ""), _hx_anonymous(array("fileName" => "TestStress.hx", "lineNumber" => 222, "className" => "test.TestStress", "methodName" => "testMatrix4x4Constructor")));
		haxe_Log::trace("abstracts / direct = " . _hx_string_rec($abstractTime / $classTime, ""), _hx_anonymous(array("fileName" => "TestStress.hx", "lineNumber" => 223, "className" => "test.TestStress", "methodName" => "testMatrix4x4Constructor")));
	}
	public function __call($m, $a) {
		if(isset($this->$m) && is_callable($this->$m))
			return call_user_func_array($this->$m, $a);
		else if(isset($this->__dynamics[$m]) && is_callable($this->__dynamics[$m]))
			return call_user_func_array($this->__dynamics[$m], $a);
		else if('toString' == $m)
			return $this->__toString();
		else
			throw new HException('Unable to call <'.$m.'>');
	}
	function __toString() { return 'test.TestStress'; }
}
