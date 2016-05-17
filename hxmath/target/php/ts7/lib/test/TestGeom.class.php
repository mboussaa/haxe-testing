<?php

// Generated by Haxe 3.3.0
class test_TestGeom extends test_MathTestCase {
	public function __construct($posInfos = null) { if(!php_Boot::$skip_constructor) {
		parent::__construct($posInfos);
	}}
	public function testRectIntersect() {
		$a = new hxmath_geom_Rect(0.0, 0.0, 1.0, 1.0);
		$b = new hxmath_geom_Rect(1.0, 0.0, 1.0, 1.0);
		$c = new hxmath_geom_Rect(0.0, 1.0, 1.0, 1.0);
		$d = new hxmath_geom_Rect(1.0, 1.0, 1.0, 1.0);
		$tmp = null;
		$aStart = $a->x;
		$aWidth = $a->width;
		$bStart = $b->x;
		$bWidth = $b->width;
		$tmp1 = null;
		if(!($aStart >= $bStart + $bWidth)) {
			$tmp1 = $bStart >= $aStart + $aWidth;
		} else {
			$tmp1 = true;
		}
		if(!$tmp1) {
			$aStart1 = $a->y;
			$aWidth1 = $a->height;
			$bStart1 = $b->y;
			$bWidth1 = $b->height;
			$tmp2 = null;
			if(!($aStart1 >= $bStart1 + $bWidth1)) {
				$tmp2 = $bStart1 >= $aStart1 + $aWidth1;
			} else {
				$tmp2 = true;
			}
			$tmp = !$tmp2;
		} else {
			$tmp = false;
		}
		$this->assertFalse($tmp, _hx_anonymous(array("fileName" => "TestGeom.hx", "lineNumber" => 29, "className" => "test.TestGeom", "methodName" => "testRectIntersect")));
		$tmp3 = null;
		$aStart2 = $a->x;
		$aWidth2 = $a->width;
		$bStart2 = $c->x;
		$bWidth2 = $c->width;
		$tmp4 = null;
		if(!($aStart2 >= $bStart2 + $bWidth2)) {
			$tmp4 = $bStart2 >= $aStart2 + $aWidth2;
		} else {
			$tmp4 = true;
		}
		if(!$tmp4) {
			$aStart3 = $a->y;
			$aWidth3 = $a->height;
			$bStart3 = $c->y;
			$bWidth3 = $c->height;
			$tmp5 = null;
			if(!($aStart3 >= $bStart3 + $bWidth3)) {
				$tmp5 = $bStart3 >= $aStart3 + $aWidth3;
			} else {
				$tmp5 = true;
			}
			$tmp3 = !$tmp5;
		} else {
			$tmp3 = false;
		}
		$this->assertFalse($tmp3, _hx_anonymous(array("fileName" => "TestGeom.hx", "lineNumber" => 30, "className" => "test.TestGeom", "methodName" => "testRectIntersect")));
		$tmp6 = null;
		$aStart4 = $a->x;
		$aWidth4 = $a->width;
		$bStart4 = $d->x;
		$bWidth4 = $d->width;
		$tmp7 = null;
		if(!($aStart4 >= $bStart4 + $bWidth4)) {
			$tmp7 = $bStart4 >= $aStart4 + $aWidth4;
		} else {
			$tmp7 = true;
		}
		if(!$tmp7) {
			$aStart5 = $a->y;
			$aWidth5 = $a->height;
			$bStart5 = $d->y;
			$bWidth5 = $d->height;
			$tmp8 = null;
			if(!($aStart5 >= $bStart5 + $bWidth5)) {
				$tmp8 = $bStart5 >= $aStart5 + $aWidth5;
			} else {
				$tmp8 = true;
			}
			$tmp6 = !$tmp8;
		} else {
			$tmp6 = false;
		}
		$this->assertFalse($tmp6, _hx_anonymous(array("fileName" => "TestGeom.hx", "lineNumber" => 31, "className" => "test.TestGeom", "methodName" => "testRectIntersect")));
		$e = new hxmath_geom_Rect(0.5, 0.5, 1.0, 1.0);
		$tmp9 = null;
		$aStart6 = $a->x;
		$aWidth6 = $a->width;
		$bStart6 = $e->x;
		$bWidth6 = $e->width;
		$tmp10 = null;
		if(!($aStart6 >= $bStart6 + $bWidth6)) {
			$tmp10 = $bStart6 >= $aStart6 + $aWidth6;
		} else {
			$tmp10 = true;
		}
		if(!$tmp10) {
			$aStart7 = $a->y;
			$aWidth7 = $a->height;
			$bStart7 = $e->y;
			$bWidth7 = $e->height;
			$tmp11 = null;
			if(!($aStart7 >= $bStart7 + $bWidth7)) {
				$tmp11 = $bStart7 >= $aStart7 + $aWidth7;
			} else {
				$tmp11 = true;
			}
			$tmp9 = !$tmp11;
		} else {
			$tmp9 = false;
		}
		$this->assertTrue($tmp9, _hx_anonymous(array("fileName" => "TestGeom.hx", "lineNumber" => 35, "className" => "test.TestGeom", "methodName" => "testRectIntersect")));
		$tmp12 = null;
		$aStart8 = $b->x;
		$aWidth8 = $b->width;
		$bStart8 = $e->x;
		$bWidth8 = $e->width;
		$tmp13 = null;
		if(!($aStart8 >= $bStart8 + $bWidth8)) {
			$tmp13 = $bStart8 >= $aStart8 + $aWidth8;
		} else {
			$tmp13 = true;
		}
		if(!$tmp13) {
			$aStart9 = $b->y;
			$aWidth9 = $b->height;
			$bStart9 = $e->y;
			$bWidth9 = $e->height;
			$tmp14 = null;
			if(!($aStart9 >= $bStart9 + $bWidth9)) {
				$tmp14 = $bStart9 >= $aStart9 + $aWidth9;
			} else {
				$tmp14 = true;
			}
			$tmp12 = !$tmp14;
		} else {
			$tmp12 = false;
		}
		$this->assertTrue($tmp12, _hx_anonymous(array("fileName" => "TestGeom.hx", "lineNumber" => 36, "className" => "test.TestGeom", "methodName" => "testRectIntersect")));
		$tmp15 = null;
		$aStart10 = $c->x;
		$aWidth10 = $c->width;
		$bStart10 = $e->x;
		$bWidth10 = $e->width;
		$tmp16 = null;
		if(!($aStart10 >= $bStart10 + $bWidth10)) {
			$tmp16 = $bStart10 >= $aStart10 + $aWidth10;
		} else {
			$tmp16 = true;
		}
		if(!$tmp16) {
			$aStart11 = $c->y;
			$aWidth11 = $c->height;
			$bStart11 = $e->y;
			$bWidth11 = $e->height;
			$tmp17 = null;
			if(!($aStart11 >= $bStart11 + $bWidth11)) {
				$tmp17 = $bStart11 >= $aStart11 + $aWidth11;
			} else {
				$tmp17 = true;
			}
			$tmp15 = !$tmp17;
		} else {
			$tmp15 = false;
		}
		$this->assertTrue($tmp15, _hx_anonymous(array("fileName" => "TestGeom.hx", "lineNumber" => 37, "className" => "test.TestGeom", "methodName" => "testRectIntersect")));
		$tmp18 = null;
		$aStart12 = $d->x;
		$aWidth12 = $d->width;
		$bStart12 = $e->x;
		$bWidth12 = $e->width;
		$tmp19 = null;
		if(!($aStart12 >= $bStart12 + $bWidth12)) {
			$tmp19 = $bStart12 >= $aStart12 + $aWidth12;
		} else {
			$tmp19 = true;
		}
		if(!$tmp19) {
			$aStart13 = $d->y;
			$aWidth13 = $d->height;
			$bStart13 = $e->y;
			$bWidth13 = $e->height;
			$tmp20 = null;
			if(!($aStart13 >= $bStart13 + $bWidth13)) {
				$tmp20 = $bStart13 >= $aStart13 + $aWidth13;
			} else {
				$tmp20 = true;
			}
			$tmp18 = !$tmp20;
		} else {
			$tmp18 = false;
		}
		$this->assertTrue($tmp18, _hx_anonymous(array("fileName" => "TestGeom.hx", "lineNumber" => 38, "className" => "test.TestGeom", "methodName" => "testRectIntersect")));
		$contained = new hxmath_geom_Rect(0.25, 0.25, 0.5, 0.5);
		$tmp21 = null;
		$aStart14 = $a->x;
		$aWidth14 = $a->width;
		$bStart14 = $contained->x;
		$bWidth14 = $contained->width;
		$tmp22 = null;
		if(!($aStart14 >= $bStart14 + $bWidth14)) {
			$tmp22 = $bStart14 >= $aStart14 + $aWidth14;
		} else {
			$tmp22 = true;
		}
		if(!$tmp22) {
			$aStart15 = $a->y;
			$aWidth15 = $a->height;
			$bStart15 = $contained->y;
			$bWidth15 = $contained->height;
			$tmp23 = null;
			if(!($aStart15 >= $bStart15 + $bWidth15)) {
				$tmp23 = $bStart15 >= $aStart15 + $aWidth15;
			} else {
				$tmp23 = true;
			}
			$tmp21 = !$tmp23;
		} else {
			$tmp21 = false;
		}
		$this->assertTrue($tmp21, _hx_anonymous(array("fileName" => "TestGeom.hx", "lineNumber" => 42, "className" => "test.TestGeom", "methodName" => "testRectIntersect")));
		$tmp24 = null;
		$aStart16 = $contained->x;
		$aWidth16 = $contained->width;
		$bStart16 = $a->x;
		$bWidth16 = $a->width;
		$tmp25 = null;
		if(!($aStart16 >= $bStart16 + $bWidth16)) {
			$tmp25 = $bStart16 >= $aStart16 + $aWidth16;
		} else {
			$tmp25 = true;
		}
		if(!$tmp25) {
			$aStart17 = $contained->y;
			$aWidth17 = $contained->height;
			$bStart17 = $a->y;
			$bWidth17 = $a->height;
			$tmp26 = null;
			if(!($aStart17 >= $bStart17 + $bWidth17)) {
				$tmp26 = $bStart17 >= $aStart17 + $aWidth17;
			} else {
				$tmp26 = true;
			}
			$tmp24 = !$tmp26;
		} else {
			$tmp24 = false;
		}
		$this->assertTrue($tmp24, _hx_anonymous(array("fileName" => "TestGeom.hx", "lineNumber" => 43, "className" => "test.TestGeom", "methodName" => "testRectIntersect")));
		$straddling = new hxmath_geom_Rect(0.25, 0.25, 1.0, 0.5);
		$tmp27 = null;
		$aStart18 = $a->x;
		$aWidth18 = $a->width;
		$bStart18 = $straddling->x;
		$bWidth18 = $straddling->width;
		$tmp28 = null;
		if(!($aStart18 >= $bStart18 + $bWidth18)) {
			$tmp28 = $bStart18 >= $aStart18 + $aWidth18;
		} else {
			$tmp28 = true;
		}
		if(!$tmp28) {
			$aStart19 = $a->y;
			$aWidth19 = $a->height;
			$bStart19 = $straddling->y;
			$bWidth19 = $straddling->height;
			$tmp29 = null;
			if(!($aStart19 >= $bStart19 + $bWidth19)) {
				$tmp29 = $bStart19 >= $aStart19 + $aWidth19;
			} else {
				$tmp29 = true;
			}
			$tmp27 = !$tmp29;
		} else {
			$tmp27 = false;
		}
		$this->assertTrue($tmp27, _hx_anonymous(array("fileName" => "TestGeom.hx", "lineNumber" => 47, "className" => "test.TestGeom", "methodName" => "testRectIntersect")));
		$tmp30 = null;
		$aStart20 = $straddling->x;
		$aWidth20 = $straddling->width;
		$bStart20 = $a->x;
		$bWidth20 = $a->width;
		$tmp31 = null;
		if(!($aStart20 >= $bStart20 + $bWidth20)) {
			$tmp31 = $bStart20 >= $aStart20 + $aWidth20;
		} else {
			$tmp31 = true;
		}
		if(!$tmp31) {
			$aStart21 = $straddling->y;
			$aWidth21 = $straddling->height;
			$bStart21 = $a->y;
			$bWidth21 = $a->height;
			$tmp32 = null;
			if(!($aStart21 >= $bStart21 + $bWidth21)) {
				$tmp32 = $bStart21 >= $aStart21 + $aWidth21;
			} else {
				$tmp32 = true;
			}
			$tmp30 = !$tmp32;
		} else {
			$tmp30 = false;
		}
		$this->assertTrue($tmp30, _hx_anonymous(array("fileName" => "TestGeom.hx", "lineNumber" => 48, "className" => "test.TestGeom", "methodName" => "testRectIntersect")));
	}
	public function testRectMatrixConversion() {
		$m = $this->randomMatrix3x2(null);
		$m->a = Math::abs($m->a);
		$m->b = 0.0;
		$m->c = 0.0;
		$m->d = Math::abs($m->d);
		$tmp = $m->a < 1e-6;
		if($tmp) {
			$m->a += 1.0;
		}
		$tmp1 = $m->d < 1e-6;
		if($tmp1) {
			$m->d += 1.0;
		}
		$this1 = new hxmath_math_Matrix2x2Default($m->a, $m->b, $m->c, $m->d);
		$self = $this1;
		$matrixArea = $self->a * $self->d - $self->b * $self->c;
		$rect = new hxmath_geom_Rect($m->tx, $m->ty, $m->a, $m->d);
		$tmp2 = $rect->width * $rect->height;
		$this->assertEquals($matrixArea, $tmp2, _hx_anonymous(array("fileName" => "TestGeom.hx", "lineNumber" => 76, "className" => "test.TestGeom", "methodName" => "testRectMatrixConversion")));
		$this2 = new hxmath_math_Matrix3x2Default($rect->width, 0.0, 0.0, $rect->height, $rect->x, $rect->y);
		$m1 = $this2;
		$tmp3 = null;
		$tmp4 = null;
		if($m1 === null) {
			$tmp4 = $m === null;
		} else {
			$tmp4 = false;
		}
		if(!$tmp4) {
			$tmp5 = null;
			$tmp6 = null;
			$tmp7 = null;
			$tmp8 = null;
			$tmp9 = null;
			$tmp10 = null;
			if($m1 !== null) {
				$tmp10 = $m !== null;
			} else {
				$tmp10 = false;
			}
			if($tmp10) {
				$tmp9 = $m1->a === $m->a;
			} else {
				$tmp9 = false;
			}
			if($tmp9) {
				$tmp8 = $m1->b === $m->b;
			} else {
				$tmp8 = false;
			}
			if($tmp8) {
				$tmp7 = $m1->c === $m->c;
			} else {
				$tmp7 = false;
			}
			if($tmp7) {
				$tmp6 = $m1->d === $m->d;
			} else {
				$tmp6 = false;
			}
			if($tmp6) {
				$tmp5 = $m1->tx === $m->tx;
			} else {
				$tmp5 = false;
			}
			if($tmp5) {
				$tmp3 = $m1->ty === $m->ty;
			} else {
				$tmp3 = false;
			}
		} else {
			$tmp3 = true;
		}
		$this->assertTrue($tmp3, _hx_anonymous(array("fileName" => "TestGeom.hx", "lineNumber" => 77, "className" => "test.TestGeom", "methodName" => "testRectMatrixConversion")));
	}
	public function testRectTwoPointConstruction() {
		$this1 = new hxmath_math_Vector2Default(0.0, 0.0);
		$zero = $this1;
		$this2 = new hxmath_math_Vector2Default(1.0, 1.0);
		$one = $this2;
		$tmp = Math::min($zero->x, $one->x);
		$tmp1 = Math::min($zero->y, $one->y);
		$tmp2 = $one->x - $zero->x;
		$tmp3 = Math::abs($tmp2);
		$tmp4 = $one->y - $zero->y;
		$tmp5 = Math::abs($tmp4);
		$_this = new hxmath_geom_Rect($tmp, $tmp1, $tmp3, $tmp5);
		$tmp6 = $_this->width * $_this->height;
		$this->assertEquals(1.0, $tmp6, _hx_anonymous(array("fileName" => "TestGeom.hx", "lineNumber" => 85, "className" => "test.TestGeom", "methodName" => "testRectTwoPointConstruction")));
	}
	public function testRectContainsPoint() {
		$rect = new hxmath_geom_Rect(0.5, 0.5, 1.0, 1.0);
		{
			$_g = 0;
			while($_g < 4) {
				$i = $_g++;
				$this1 = new hxmath_math_Vector2Default($rect->x, $rect->y);
				$v = $this1;
				switch($i) {
				case 0:{}break;
				case 1:{
					$v->x += $rect->width;
				}break;
				case 2:{
					$v->x += $rect->width;
					$v->y += $rect->height;
				}break;
				case 3:{
					$v->y += $rect->height;
				}break;
				default:{
					throw new HException("Invalid vertex index.");
				}break;
				}
				$tmp = null;
				$aStart = $rect->x;
				$aWidth = $rect->width;
				$x = $v->x;
				$tmp1 = null;
				if($x >= $aStart) {
					$tmp1 = $x <= $aStart + $aWidth;
				} else {
					$tmp1 = false;
				}
				if($tmp1) {
					$aStart1 = $rect->y;
					$aWidth1 = $rect->height;
					$x1 = $v->y;
					if($x1 >= $aStart1) {
						$tmp = $x1 <= $aStart1 + $aWidth1;
					} else {
						$tmp = false;
					}
					unset($x1,$aWidth1,$aStart1);
				} else {
					$tmp = false;
				}
				$this->assertTrue($tmp, _hx_anonymous(array("fileName" => "TestGeom.hx", "lineNumber" => 96, "className" => "test.TestGeom", "methodName" => "testRectContainsPoint")));
				$this2 = new hxmath_math_Vector2Default($rect->x + 0.5 * $rect->width, $rect->y + 0.5 * $rect->height);
				$b = $this2;
				$this3 = new hxmath_math_Vector2Default($v->x, $v->y);
				$self = $this3;
				$self->x -= $b->x;
				$self->y -= $b->y;
				$this4 = new hxmath_math_Vector2Default($self->x, $self->y);
				$self1 = $this4;
				$self1->x *= 1.1;
				$self1->y *= 1.1;
				$this5 = new hxmath_math_Vector2Default($rect->x + 0.5 * $rect->width, $rect->y + 0.5 * $rect->height);
				$b1 = $this5;
				$this6 = new hxmath_math_Vector2Default($self1->x, $self1->y);
				$self2 = $this6;
				$self2->x += $b1->x;
				$self2->y += $b1->y;
				$tmp2 = null;
				$aStart2 = $rect->x;
				$aWidth2 = $rect->width;
				$x2 = $self2->x;
				$tmp3 = null;
				if($x2 >= $aStart2) {
					$tmp3 = $x2 <= $aStart2 + $aWidth2;
				} else {
					$tmp3 = false;
				}
				if($tmp3) {
					$aStart3 = $rect->y;
					$aWidth3 = $rect->height;
					$x3 = $self2->y;
					if($x3 >= $aStart3) {
						$tmp2 = $x3 <= $aStart3 + $aWidth3;
					} else {
						$tmp2 = false;
					}
					unset($x3,$aWidth3,$aStart3);
				} else {
					$tmp2 = false;
				}
				$this->assertFalse($tmp2, _hx_anonymous(array("fileName" => "TestGeom.hx", "lineNumber" => 100, "className" => "test.TestGeom", "methodName" => "testRectContainsPoint")));
				unset($x2,$x,$v,$tmp3,$tmp2,$tmp1,$tmp,$this6,$this5,$this4,$this3,$this2,$this1,$self2,$self1,$self,$i,$b1,$b,$aWidth2,$aWidth,$aStart2,$aStart);
			}
		}
	}
	public function testRectIntersectOverlapping() {
		return;
	}
	public function testRectIntersectContaining() {
		$outer = new hxmath_geom_Rect(0.0, 0.0, 1.0, 1.0);
		$inner = new hxmath_geom_Rect(0.25, 0.25, 0.5, 0.5);
		$innerLeft = new hxmath_geom_Rect(0.0, 0.25, 0.25, 0.5);
		$innerRight = new hxmath_geom_Rect(0.75, 0.25, 0.25, 0.5);
		$left = new hxmath_geom_Rect(-0.25, 0.25, 0.5, 0.5);
		$right = new hxmath_geom_Rect(0.75, 0.25, 0.5, 0.5);
		$_this = new hxmath_geom_Rect($outer->x, $outer->y, $outer->width, $outer->height);
		$tmp = $_this->x < $inner->x;
		if($tmp) {
			$_this->width -= $inner->x - $_this->x;
			$_this->x = $inner->x;
		}
		$tmp1 = $_this->y < $inner->y;
		if($tmp1) {
			$_this->height -= $inner->y - $_this->y;
			$_this->y = $inner->y;
		}
		$tmp2 = $_this->x + $_this->width > $inner->x + $inner->width;
		if($tmp2) {
			$tmp3 = $_this->x + $_this->width;
			$tmp4 = $inner->x + $inner->width;
			$_this->width -= $tmp3 - $tmp4;
		}
		$tmp5 = $_this->y + $_this->height > $inner->y + $inner->height;
		if($tmp5) {
			$tmp6 = $_this->y + $_this->height;
			$tmp7 = $inner->y + $inner->height;
			$_this->height -= $tmp6 - $tmp7;
		}
		$tmp8 = null;
		$tmp9 = null;
		$tmp10 = null;
		$tmp11 = null;
		if($inner !== null) {
			$tmp11 = $_this->x === $inner->x;
		} else {
			$tmp11 = false;
		}
		if($tmp11) {
			$tmp10 = $_this->y === $inner->y;
		} else {
			$tmp10 = false;
		}
		if($tmp10) {
			$tmp9 = $_this->width === $inner->width;
		} else {
			$tmp9 = false;
		}
		if($tmp9) {
			$tmp8 = $_this->height === $inner->height;
		} else {
			$tmp8 = false;
		}
		$this->assertTrue($tmp8, _hx_anonymous(array("fileName" => "TestGeom.hx", "lineNumber" => 150, "className" => "test.TestGeom", "methodName" => "testRectIntersectContaining")));
		$_this1 = new hxmath_geom_Rect($inner->x, $inner->y, $inner->width, $inner->height);
		$tmp12 = $_this1->x < $outer->x;
		if($tmp12) {
			$_this1->width -= $outer->x - $_this1->x;
			$_this1->x = $outer->x;
		}
		$tmp13 = $_this1->y < $outer->y;
		if($tmp13) {
			$_this1->height -= $outer->y - $_this1->y;
			$_this1->y = $outer->y;
		}
		$tmp14 = $_this1->x + $_this1->width > $outer->x + $outer->width;
		if($tmp14) {
			$tmp15 = $_this1->x + $_this1->width;
			$tmp16 = $outer->x + $outer->width;
			$_this1->width -= $tmp15 - $tmp16;
		}
		$tmp17 = $_this1->y + $_this1->height > $outer->y + $outer->height;
		if($tmp17) {
			$tmp18 = $_this1->y + $_this1->height;
			$tmp19 = $outer->y + $outer->height;
			$_this1->height -= $tmp18 - $tmp19;
		}
		$tmp20 = null;
		$tmp21 = null;
		$tmp22 = null;
		$tmp23 = null;
		if($inner !== null) {
			$tmp23 = $_this1->x === $inner->x;
		} else {
			$tmp23 = false;
		}
		if($tmp23) {
			$tmp22 = $_this1->y === $inner->y;
		} else {
			$tmp22 = false;
		}
		if($tmp22) {
			$tmp21 = $_this1->width === $inner->width;
		} else {
			$tmp21 = false;
		}
		if($tmp21) {
			$tmp20 = $_this1->height === $inner->height;
		} else {
			$tmp20 = false;
		}
		$this->assertTrue($tmp20, _hx_anonymous(array("fileName" => "TestGeom.hx", "lineNumber" => 152, "className" => "test.TestGeom", "methodName" => "testRectIntersectContaining")));
		$_this2 = new hxmath_geom_Rect($outer->x, $outer->y, $outer->width, $outer->height);
		$tmp24 = $_this2->x < $left->x;
		if($tmp24) {
			$_this2->width -= $left->x - $_this2->x;
			$_this2->x = $left->x;
		}
		$tmp25 = $_this2->y < $left->y;
		if($tmp25) {
			$_this2->height -= $left->y - $_this2->y;
			$_this2->y = $left->y;
		}
		$tmp26 = $_this2->x + $_this2->width > $left->x + $left->width;
		if($tmp26) {
			$tmp27 = $_this2->x + $_this2->width;
			$tmp28 = $left->x + $left->width;
			$_this2->width -= $tmp27 - $tmp28;
		}
		$tmp29 = $_this2->y + $_this2->height > $left->y + $left->height;
		if($tmp29) {
			$tmp30 = $_this2->y + $_this2->height;
			$tmp31 = $left->y + $left->height;
			$_this2->height -= $tmp30 - $tmp31;
		}
		$tmp32 = null;
		$tmp33 = null;
		$tmp34 = null;
		$tmp35 = null;
		if($innerLeft !== null) {
			$tmp35 = $_this2->x === $innerLeft->x;
		} else {
			$tmp35 = false;
		}
		if($tmp35) {
			$tmp34 = $_this2->y === $innerLeft->y;
		} else {
			$tmp34 = false;
		}
		if($tmp34) {
			$tmp33 = $_this2->width === $innerLeft->width;
		} else {
			$tmp33 = false;
		}
		if($tmp33) {
			$tmp32 = $_this2->height === $innerLeft->height;
		} else {
			$tmp32 = false;
		}
		$this->assertTrue($tmp32, _hx_anonymous(array("fileName" => "TestGeom.hx", "lineNumber" => 156, "className" => "test.TestGeom", "methodName" => "testRectIntersectContaining")));
		$_this3 = new hxmath_geom_Rect($left->x, $left->y, $left->width, $left->height);
		$tmp36 = $_this3->x < $outer->x;
		if($tmp36) {
			$_this3->width -= $outer->x - $_this3->x;
			$_this3->x = $outer->x;
		}
		$tmp37 = $_this3->y < $outer->y;
		if($tmp37) {
			$_this3->height -= $outer->y - $_this3->y;
			$_this3->y = $outer->y;
		}
		$tmp38 = $_this3->x + $_this3->width > $outer->x + $outer->width;
		if($tmp38) {
			$tmp39 = $_this3->x + $_this3->width;
			$tmp40 = $outer->x + $outer->width;
			$_this3->width -= $tmp39 - $tmp40;
		}
		$tmp41 = $_this3->y + $_this3->height > $outer->y + $outer->height;
		if($tmp41) {
			$tmp42 = $_this3->y + $_this3->height;
			$tmp43 = $outer->y + $outer->height;
			$_this3->height -= $tmp42 - $tmp43;
		}
		$tmp44 = null;
		$tmp45 = null;
		$tmp46 = null;
		$tmp47 = null;
		if($innerLeft !== null) {
			$tmp47 = $_this3->x === $innerLeft->x;
		} else {
			$tmp47 = false;
		}
		if($tmp47) {
			$tmp46 = $_this3->y === $innerLeft->y;
		} else {
			$tmp46 = false;
		}
		if($tmp46) {
			$tmp45 = $_this3->width === $innerLeft->width;
		} else {
			$tmp45 = false;
		}
		if($tmp45) {
			$tmp44 = $_this3->height === $innerLeft->height;
		} else {
			$tmp44 = false;
		}
		$this->assertTrue($tmp44, _hx_anonymous(array("fileName" => "TestGeom.hx", "lineNumber" => 158, "className" => "test.TestGeom", "methodName" => "testRectIntersectContaining")));
		$_this4 = new hxmath_geom_Rect($outer->x, $outer->y, $outer->width, $outer->height);
		$tmp48 = $_this4->x < $right->x;
		if($tmp48) {
			$_this4->width -= $right->x - $_this4->x;
			$_this4->x = $right->x;
		}
		$tmp49 = $_this4->y < $right->y;
		if($tmp49) {
			$_this4->height -= $right->y - $_this4->y;
			$_this4->y = $right->y;
		}
		$tmp50 = $_this4->x + $_this4->width > $right->x + $right->width;
		if($tmp50) {
			$tmp51 = $_this4->x + $_this4->width;
			$tmp52 = $right->x + $right->width;
			$_this4->width -= $tmp51 - $tmp52;
		}
		$tmp53 = $_this4->y + $_this4->height > $right->y + $right->height;
		if($tmp53) {
			$tmp54 = $_this4->y + $_this4->height;
			$tmp55 = $right->y + $right->height;
			$_this4->height -= $tmp54 - $tmp55;
		}
		$tmp56 = null;
		$tmp57 = null;
		$tmp58 = null;
		$tmp59 = null;
		if($innerRight !== null) {
			$tmp59 = $_this4->x === $innerRight->x;
		} else {
			$tmp59 = false;
		}
		if($tmp59) {
			$tmp58 = $_this4->y === $innerRight->y;
		} else {
			$tmp58 = false;
		}
		if($tmp58) {
			$tmp57 = $_this4->width === $innerRight->width;
		} else {
			$tmp57 = false;
		}
		if($tmp57) {
			$tmp56 = $_this4->height === $innerRight->height;
		} else {
			$tmp56 = false;
		}
		$this->assertTrue($tmp56, _hx_anonymous(array("fileName" => "TestGeom.hx", "lineNumber" => 160, "className" => "test.TestGeom", "methodName" => "testRectIntersectContaining")));
		$_this5 = new hxmath_geom_Rect($right->x, $right->y, $right->width, $right->height);
		$tmp60 = $_this5->x < $outer->x;
		if($tmp60) {
			$_this5->width -= $outer->x - $_this5->x;
			$_this5->x = $outer->x;
		}
		$tmp61 = $_this5->y < $outer->y;
		if($tmp61) {
			$_this5->height -= $outer->y - $_this5->y;
			$_this5->y = $outer->y;
		}
		$tmp62 = $_this5->x + $_this5->width > $outer->x + $outer->width;
		if($tmp62) {
			$tmp63 = $_this5->x + $_this5->width;
			$tmp64 = $outer->x + $outer->width;
			$_this5->width -= $tmp63 - $tmp64;
		}
		$tmp65 = $_this5->y + $_this5->height > $outer->y + $outer->height;
		if($tmp65) {
			$tmp66 = $_this5->y + $_this5->height;
			$tmp67 = $outer->y + $outer->height;
			$_this5->height -= $tmp66 - $tmp67;
		}
		$tmp68 = null;
		$tmp69 = null;
		$tmp70 = null;
		$tmp71 = null;
		if($innerRight !== null) {
			$tmp71 = $_this5->x === $innerRight->x;
		} else {
			$tmp71 = false;
		}
		if($tmp71) {
			$tmp70 = $_this5->y === $innerRight->y;
		} else {
			$tmp70 = false;
		}
		if($tmp70) {
			$tmp69 = $_this5->width === $innerRight->width;
		} else {
			$tmp69 = false;
		}
		if($tmp69) {
			$tmp68 = $_this5->height === $innerRight->height;
		} else {
			$tmp68 = false;
		}
		$this->assertTrue($tmp68, _hx_anonymous(array("fileName" => "TestGeom.hx", "lineNumber" => 162, "className" => "test.TestGeom", "methodName" => "testRectIntersectContaining")));
	}
	public function testRectToPointDistance() {
		$unit = new hxmath_geom_Rect(0.0, 0.0, 1.0, 1.0);
		$this1 = new hxmath_math_Vector2Default(-2.0, 0.5);
		$tmp = $this1;
		$this2 = new hxmath_math_Vector2Default(3.0, 0.5);
		$tmp1 = $this2;
		$this3 = new hxmath_math_Vector2Default(0.5, -2.0);
		$tmp2 = $this3;
		$this4 = new hxmath_math_Vector2Default(0.5, 3.0);
		$distanceOfTwo = (new _hx_array(array($tmp, $tmp1, $tmp2, $this4)));
		{
			$_g = 0;
			while($_g < $distanceOfTwo->length) {
				$point = $distanceOfTwo[$_g];
				++$_g;
				$tmp3 = $point->x;
				$tmp4 = $unit->x + 0.5 * $unit->width;
				$tmp5 = Math::abs($tmp3 - $tmp4);
				$tmp6 = $tmp5 - 0.5 * $unit->width;
				$dx = Math::max($tmp6, 0);
				$tmp7 = $point->y;
				$tmp8 = $unit->y + 0.5 * $unit->height;
				$tmp9 = Math::abs($tmp7 - $tmp8);
				$tmp10 = $tmp9 - 0.5 * $unit->height;
				$dy = Math::max($tmp10, 0);
				$tmp11 = Math::sqrt($dx * $dx + $dy * $dy);
				$this->assertApproxEquals(2.0, $tmp11, null, _hx_anonymous(array("fileName" => "TestGeom.hx", "lineNumber" => 176, "className" => "test.TestGeom", "methodName" => "testRectToPointDistance")));
				unset($tmp9,$tmp8,$tmp7,$tmp6,$tmp5,$tmp4,$tmp3,$tmp11,$tmp10,$point,$dy,$dx);
			}
		}
		$this5 = new hxmath_math_Vector2Default(0.75, 0.2);
		$inside = $this5;
		$tmp12 = $inside->x;
		$tmp13 = $unit->x + 0.5 * $unit->width;
		$tmp14 = Math::abs($tmp12 - $tmp13);
		$tmp15 = $tmp14 - 0.5 * $unit->width;
		$dx1 = Math::max($tmp15, 0);
		$tmp16 = $inside->y;
		$tmp17 = $unit->y + 0.5 * $unit->height;
		$tmp18 = Math::abs($tmp16 - $tmp17);
		$tmp19 = $tmp18 - 0.5 * $unit->height;
		$dy1 = Math::max($tmp19, 0);
		$tmp20 = Math::sqrt($dx1 * $dx1 + $dy1 * $dy1);
		$this->assertEquals(0.0, $tmp20, _hx_anonymous(array("fileName" => "TestGeom.hx", "lineNumber" => 180, "className" => "test.TestGeom", "methodName" => "testRectToPointDistance")));
		$this6 = new hxmath_math_Vector2Default(-0.5, -0.5);
		$diagonal = $this6;
		$tmp21 = $diagonal->x * $diagonal->x + $diagonal->y * $diagonal->y;
		$tmp22 = Math::sqrt($tmp21);
		$tmp23 = $diagonal->x;
		$tmp24 = $unit->x + 0.5 * $unit->width;
		$tmp25 = Math::abs($tmp23 - $tmp24);
		$tmp26 = $tmp25 - 0.5 * $unit->width;
		$dx2 = Math::max($tmp26, 0);
		$tmp27 = $diagonal->y;
		$tmp28 = $unit->y + 0.5 * $unit->height;
		$tmp29 = Math::abs($tmp27 - $tmp28);
		$tmp30 = $tmp29 - 0.5 * $unit->height;
		$dy2 = Math::max($tmp30, 0);
		$tmp31 = Math::sqrt($dx2 * $dx2 + $dy2 * $dy2);
		$this->assertApproxEquals($tmp22, $tmp31, null, _hx_anonymous(array("fileName" => "TestGeom.hx", "lineNumber" => 183, "className" => "test.TestGeom", "methodName" => "testRectToPointDistance")));
		$this7 = new hxmath_math_Vector2Default(1.0, 1.0);
		$corner = $this7;
		$tmp32 = $corner->x;
		$tmp33 = $unit->x + 0.5 * $unit->width;
		$tmp34 = Math::abs($tmp32 - $tmp33);
		$tmp35 = $tmp34 - 0.5 * $unit->width;
		$dx3 = Math::max($tmp35, 0);
		$tmp36 = $corner->y;
		$tmp37 = $unit->y + 0.5 * $unit->height;
		$tmp38 = Math::abs($tmp36 - $tmp37);
		$tmp39 = $tmp38 - 0.5 * $unit->height;
		$dy3 = Math::max($tmp39, 0);
		$tmp40 = Math::sqrt($dx3 * $dx3 + $dy3 * $dy3);
		$this->assertEquals(0.0, $tmp40, _hx_anonymous(array("fileName" => "TestGeom.hx", "lineNumber" => 186, "className" => "test.TestGeom", "methodName" => "testRectToPointDistance")));
	}
	public function testRectAddVector() {
		$unit = new hxmath_geom_Rect(0.0, 0.0, 1.0, 1.0);
		$this1 = new hxmath_math_Vector2Default(2.0, 2.0);
		$two = $this1;
		$expectedArea = ($unit->width + $two->x) * ($unit->height + $two->y);
		$_this = new hxmath_geom_Rect($unit->x, $unit->y, $unit->width, $unit->height);
		$tmp = $two->x < 0.0;
		if($tmp) {
			$_this->x += $two->x;
			$_this->width -= $two->x;
		} else {
			$_this->width += $two->x;
		}
		$tmp1 = $two->y < 0.0;
		if($tmp1) {
			$_this->y += $two->y;
			$_this->height -= $two->y;
		} else {
			$_this->height += $two->y;
		}
		$tmp2 = $_this->width * $_this->height;
		$this->assertApproxEquals($expectedArea, $tmp2, null, _hx_anonymous(array("fileName" => "TestGeom.hx", "lineNumber" => 199, "className" => "test.TestGeom", "methodName" => "testRectAddVector")));
		$this2 = new hxmath_math_Vector2Default($_this->x, $_this->y);
		$a = $this2;
		$this3 = new hxmath_math_Vector2Default($unit->x, $unit->y);
		$b = $this3;
		$this4 = new hxmath_math_Vector2Default($a->x, $a->y);
		$self = $this4;
		$self->x -= $b->x;
		$self->y -= $b->y;
		$self1 = $self;
		$tmp3 = $self1->x * $self1->x + $self1->y * $self1->y;
		$tmp4 = Math::sqrt($tmp3);
		$this->assertApproxEquals(0.0, $tmp4, null, _hx_anonymous(array("fileName" => "TestGeom.hx", "lineNumber" => 200, "className" => "test.TestGeom", "methodName" => "testRectAddVector")));
		$_this1 = new hxmath_geom_Rect($unit->x, $unit->y, $unit->width, $unit->height);
		$this5 = new hxmath_math_Vector2Default(-$two->x, -$two->y);
		$v = $this5;
		$tmp5 = $v->x < 0.0;
		if($tmp5) {
			$_this1->x += $v->x;
			$_this1->width -= $v->x;
		} else {
			$_this1->width += $v->x;
		}
		$tmp6 = $v->y < 0.0;
		if($tmp6) {
			$_this1->y += $v->y;
			$_this1->height -= $v->y;
		} else {
			$_this1->height += $v->y;
		}
		$tmp7 = $_this1->width * $_this1->height;
		$this->assertApproxEquals($expectedArea, $tmp7, null, _hx_anonymous(array("fileName" => "TestGeom.hx", "lineNumber" => 206, "className" => "test.TestGeom", "methodName" => "testRectAddVector")));
		$this6 = new hxmath_math_Vector2Default($_this1->x, $_this1->y);
		$a1 = $this6;
		$this7 = new hxmath_math_Vector2Default($a1->x, $a1->y);
		$self2 = $this7;
		$self2->x += $two->x;
		$self2->y += $two->y;
		$self3 = $self2;
		$tmp8 = $self3->x * $self3->x + $self3->y * $self3->y;
		$tmp9 = Math::sqrt($tmp8);
		$this->assertApproxEquals(0.0, $tmp9, null, _hx_anonymous(array("fileName" => "TestGeom.hx", "lineNumber" => 207, "className" => "test.TestGeom", "methodName" => "testRectAddVector")));
	}
	public function testRectDistanceAgainstRangeAlgorithm() {
		$_g = 0;
		while($_g < 100) {
			++$_g;
			$tmp = Math::random();
			$tmp1 = $tmp - 0.5;
			$tmp2 = Math::random();
			$tmp3 = $tmp2 - 0.5;
			$tmp4 = Math::random();
			$tmp5 = Math::random();
			$a = new hxmath_geom_Rect($tmp1, $tmp3, $tmp4, $tmp5);
			$tmp6 = Math::random();
			$tmp7 = $tmp6 - 0.5;
			$tmp8 = Math::random();
			$tmp9 = $tmp8 - 0.5;
			$tmp10 = Math::random();
			$tmp11 = Math::random();
			$b = new hxmath_geom_Rect($tmp7, $tmp9, $tmp10, $tmp11);
			$tmp12 = $b->x + 0.5 * $b->width;
			$tmp13 = $a->x + 0.5 * $a->width;
			$tmp14 = Math::abs($tmp12 - $tmp13);
			$tmp15 = 0.5 * ($a->width + $b->width);
			$dx = Math::max($tmp14 - $tmp15, 0);
			$tmp16 = $b->y + 0.5 * $b->height;
			$tmp17 = $a->y + 0.5 * $a->height;
			$tmp18 = Math::abs($tmp16 - $tmp17);
			$tmp19 = 0.5 * ($a->height + $b->height);
			$dy = Math::max($tmp18 - $tmp19, 0);
			$regularDist = Math::sqrt($dx * $dx + $dy * $dy);
			$tmp20 = $b->x + 0.5 * $b->width;
			$tmp21 = $a->x + 0.5 * $a->width;
			$tmp22 = Math::abs($tmp20 - $tmp21);
			$tmp23 = 0.5 * ($a->width + $b->width);
			$dx1 = Math::max($tmp22 - $tmp23, 0);
			$tmp24 = $b->y + 0.5 * $b->height;
			$tmp25 = $a->y + 0.5 * $a->height;
			$tmp26 = Math::abs($tmp24 - $tmp25);
			$tmp27 = 0.5 * ($a->height + $b->height);
			$dy1 = Math::max($tmp26 - $tmp27, 0);
			$rangeDistance = Math::sqrt($dx1 * $dx1 + $dy1 * $dy1);
			$this->assertApproxEquals($rangeDistance, $regularDist, null, _hx_anonymous(array("fileName" => "TestGeom.hx", "lineNumber" => 219, "className" => "test.TestGeom", "methodName" => "testRectDistanceAgainstRangeAlgorithm")));
			unset($tmp9,$tmp8,$tmp7,$tmp6,$tmp5,$tmp4,$tmp3,$tmp27,$tmp26,$tmp25,$tmp24,$tmp23,$tmp22,$tmp21,$tmp20,$tmp2,$tmp19,$tmp18,$tmp17,$tmp16,$tmp15,$tmp14,$tmp13,$tmp12,$tmp11,$tmp10,$tmp1,$tmp,$regularDist,$rangeDistance,$dy1,$dy,$dx1,$dx,$b,$a);
		}
	}
	public function testRay2Cast() {
		$this1 = new hxmath_math_Vector2Default(1.0, 1.0);
		$self = $this1;
		$this2 = new hxmath_math_Vector2Default($self->x, $self->y);
		$self1 = $this2;
		$tmp = $self1->x * $self1->x + $self1->y * $self1->y;
		$length = Math::sqrt($tmp);
		if($length > 0.0) {
			$self1->x /= $length;
			$self1->y /= $length;
		}
		$this3 = new hxmath_math_Vector2Default(0.0, 0.0);
		$tmp1 = $this3;
		$this4 = new hxmath_math_Vector2Default(1.0, 1.0);
		$self2 = $this4;
		$this5 = new hxmath_math_Vector2Default($self2->x, $self2->y);
		$self3 = $this5;
		$tmp2 = $self3->x * $self3->x + $self3->y * $self3->y;
		$length1 = Math::sqrt($tmp2);
		if($length1 > 0.0) {
			$self3->x /= $length1;
			$self3->y /= $length1;
		}
		$r = new hxmath_geom_Ray2($tmp1, $self3);
		$result = $r->intersectPoint($self1, null);
		$this->assertApproxEquals(1.0, $result, null, _hx_anonymous(array("fileName" => "TestGeom.hx", "lineNumber" => 229, "className" => "test.TestGeom", "methodName" => "testRay2Cast")));
	}
	public function rangeRectDistance($a, $b) {
		$aStart = $a->x;
		$aWidth = $a->width;
		$bStart = $b->x;
		$bWidth = $b->width;
		$minX = null;
		if($aStart + $aWidth < $bStart) {
			$minX = $bStart - ($aStart + $aWidth);
		} else {
			if($bStart + $bWidth < $aStart) {
				$minX = $aStart - ($bStart + $bWidth);
			} else {
				$minX = 0;
			}
		}
		$aStart1 = $a->y;
		$aWidth1 = $a->height;
		$bStart1 = $b->y;
		$bWidth1 = $b->height;
		$minY = null;
		if($aStart1 + $aWidth1 < $bStart1) {
			$minY = $bStart1 - ($aStart1 + $aWidth1);
		} else {
			if($bStart1 + $bWidth1 < $aStart1) {
				$minY = $aStart1 - ($bStart1 + $bWidth1);
			} else {
				$minY = 0;
			}
		}
		return Math::sqrt($minX * $minX + $minY * $minY);
	}
	function __toString() { return 'test.TestGeom'; }
}
