<?php

// Generated by Haxe 3.3.0
class utest_Assert {
	public function __construct(){}
	static $results;
	static function isTrue($cond, $msg = null, $pos = null) {
		if(utest_Assert::$results === null) {
			throw new HException("Assert.results is not currently bound to any assert context");
		}
		$tmp = null === $msg;
		if($tmp) {
			$msg = "expected true";
		}
		if($cond) {
			$tmp1 = utest_Assertation::Success($pos);
			utest_Assert::$results->add($tmp1);
		} else {
			$tmp2 = utest_Assertation::Failure($msg, $pos);
			utest_Assert::$results->add($tmp2);
		}
	}
	static function isFalse($value, $msg = null, $pos = null) {
		$tmp = null === $msg;
		if($tmp) {
			$msg = "expected false";
		}
		utest_Assert::isTrue($value === false, $msg, $pos);
	}
	static function isNull($value, $msg = null, $pos = null) {
		if($msg === null) {
			$tmp = utest_Assert::q($value);
			$msg = "expected null but it is " . _hx_string_or_null($tmp);
		}
		utest_Assert::isTrue($value === null, $msg, $pos);
	}
	static function notNull($value, $msg = null, $pos = null) {
		$tmp = null === $msg;
		if($tmp) {
			$msg = "expected not null";
		}
		utest_Assert::isTrue($value !== null, $msg, $pos);
	}
	static function is($value, $type, $msg = null, $pos = null) {
		if($msg === null) {
			$tmp = utest_Assert::typeToString($type);
			$tmp1 = "expected type " . _hx_string_or_null($tmp) . " but it is ";
			$tmp2 = utest_Assert::typeToString($value);
			$msg = _hx_string_or_null($tmp1) . _hx_string_or_null($tmp2);
		}
		$tmp3 = Std::is($value, $type);
		utest_Assert::isTrue($tmp3, $msg, $pos);
	}
	static function notEquals($expected, $value, $msg = null, $pos = null) {
		if($msg === null) {
			$tmp = utest_Assert::q($expected);
			$tmp1 = "expected " . _hx_string_or_null($tmp) . " and test value ";
			$tmp2 = utest_Assert::q($value);
			$msg = _hx_string_or_null($tmp1) . _hx_string_or_null($tmp2) . " should be different";
		}
		utest_Assert::isFalse(_hx_equal($expected, $value), $msg, $pos);
	}
	static function equals($expected, $value, $msg = null, $pos = null) {
		if($msg === null) {
			$tmp = utest_Assert::q($expected);
			$tmp1 = "expected " . _hx_string_or_null($tmp) . " but it is ";
			$tmp2 = utest_Assert::q($value);
			$msg = _hx_string_or_null($tmp1) . _hx_string_or_null($tmp2);
		}
		utest_Assert::isTrue(_hx_equal($expected, $value), $msg, $pos);
	}
	static function match($pattern, $value, $msg = null, $pos = null) {
		if($msg === null) {
			$tmp = utest_Assert::q($value);
			$msg = "the value " . _hx_string_or_null($tmp) . " does not match the provided pattern";
		}
		$tmp1 = $pattern->match($value);
		utest_Assert::isTrue($tmp1, $msg, $pos);
	}
	static function floatEquals($expected, $value, $approx = null, $msg = null, $pos = null) {
		if($msg === null) {
			$tmp = utest_Assert::q($expected);
			$tmp1 = "expected " . _hx_string_or_null($tmp) . " but it is ";
			$tmp2 = utest_Assert::q($value);
			$msg = _hx_string_or_null($tmp1) . _hx_string_or_null($tmp2);
		}
		$tmp3 = utest_Assert::_floatEquals($expected, $value, $approx);
		utest_Assert::isTrue($tmp3, $msg, $pos);
		return;
	}
	static function _floatEquals($expected, $value, $approx = null) {
		$tmp = Math::isNaN($expected);
		if($tmp) {
			return Math::isNaN($value);
		} else {
			$tmp1 = Math::isNaN($value);
			if($tmp1) {
				return false;
			} else {
				$tmp2 = null;
				$tmp3 = !Math::isFinite($expected);
				if($tmp3) {
					$tmp2 = !Math::isFinite($value);
				} else {
					$tmp2 = false;
				}
				if($tmp2) {
					return (is_object($_t = ($expected > 0)) && ($_t instanceof Enum) ? $_t == $value > 0 : _hx_equal($_t, $value > 0));
				}
			}
		}
		$tmp4 = null === $approx;
		if($tmp4) {
			$approx = 1e-5;
		}
		$tmp5 = Math::abs($value - $expected);
		return $tmp5 <= $approx;
	}
	static function getTypeName($v) {
		$_g = Type::typeof($v);
		switch($_g->index) {
		case 0:{
			return "`null`";
		}break;
		case 1:{
			return "Int";
		}break;
		case 2:{
			return "Float";
		}break;
		case 3:{
			return "Bool";
		}break;
		case 4:{
			return "Object";
		}break;
		case 5:{
			return "function";
		}break;
		case 6:{
			return Type::getClassName(_hx_deref($_g)->params[0]);
		}break;
		case 7:{
			return Type::getEnumName(_hx_deref($_g)->params[0]);
		}break;
		case 8:{
			return "`Unknown`";
		}break;
		}
	}
	static function isIterable($v, $isAnonym) {
		$fields = null;
		if($isAnonym) {
			$fields = Reflect::fields($v);
		} else {
			$tmp = Type::getClass($v);
			$fields = Type::getInstanceFields($tmp);
		}
		$tmp1 = !Lambda::has($fields, "iterator");
		if($tmp1) {
			return false;
		}
		$tmp2 = Reflect::field($v, "iterator");
		return Reflect::isFunction($tmp2);
	}
	static function isIterator($v, $isAnonym) {
		$fields = null;
		if($isAnonym) {
			$fields = Reflect::fields($v);
		} else {
			$tmp = Type::getClass($v);
			$fields = Type::getInstanceFields($tmp);
		}
		$tmp1 = null;
		$tmp2 = !(!Lambda::has($fields, "next"));
		if($tmp2) {
			$tmp1 = !Lambda::has($fields, "hasNext");
		} else {
			$tmp1 = true;
		}
		if($tmp1) {
			return false;
		}
		$tmp3 = Reflect::field($v, "next");
		$tmp4 = Reflect::isFunction($tmp3);
		if($tmp4) {
			$tmp5 = Reflect::field($v, "hasNext");
			return Reflect::isFunction($tmp5);
		} else {
			return false;
		}
	}
	static function sameAs($expected, $value, $status, $approx) {
		$texpected = utest_Assert::getTypeName($expected);
		$tvalue = utest_Assert::getTypeName($value);
		$tmp = null;
		if($texpected !== $tvalue) {
			$tmp1 = null;
			$tmp2 = null;
			if($texpected === "Int") {
				$tmp2 = $tvalue === "Float";
			} else {
				$tmp2 = false;
			}
			if(!$tmp2) {
				if($texpected === "Float") {
					$tmp1 = $tvalue === "Int";
				} else {
					$tmp1 = false;
				}
			} else {
				$tmp1 = true;
			}
			$tmp = !$tmp1;
		} else {
			$tmp = false;
		}
		if($tmp) {
			$tmp3 = "expected type " . _hx_string_or_null($texpected) . " but it is " . _hx_string_or_null($tvalue);
			$tmp4 = null;
			if($status->path === "") {
				$tmp4 = "";
			} else {
				$tmp4 = " for field " . _hx_string_or_null($status->path);
			}
			$status->error = _hx_string_or_null($tmp3) . _hx_string_or_null($tmp4);
			return false;
		}
		$_g = Type::typeof($expected);
		$tmp5 = $_g->index;
		switch($tmp5) {
		case 0:case 3:{
			if(!_hx_equal($expected, $value)) {
				$tmp6 = utest_Assert::q($expected);
				$tmp7 = "expected " . _hx_string_or_null($tmp6) . " but it is ";
				$tmp8 = utest_Assert::q($value);
				$tmp9 = _hx_string_or_null($tmp7) . _hx_string_or_null($tmp8);
				$tmp10 = null;
				if($status->path === "") {
					$tmp10 = "";
				} else {
					$tmp10 = " for field " . _hx_string_or_null($status->path);
				}
				$status->error = _hx_string_or_null($tmp9) . _hx_string_or_null($tmp10);
				return false;
			}
			return true;
		}break;
		case 1:case 2:{
			$tmp11 = !utest_Assert::_floatEquals($expected, $value, $approx);
			if($tmp11) {
				$tmp12 = utest_Assert::q($expected);
				$tmp13 = "expected " . _hx_string_or_null($tmp12) . " but it is ";
				$tmp14 = utest_Assert::q($value);
				$tmp15 = _hx_string_or_null($tmp13) . _hx_string_or_null($tmp14);
				$tmp16 = null;
				if($status->path === "") {
					$tmp16 = "";
				} else {
					$tmp16 = " for field " . _hx_string_or_null($status->path);
				}
				$status->error = _hx_string_or_null($tmp15) . _hx_string_or_null($tmp16);
				return false;
			}
			return true;
		}break;
		case 4:{
			$tmp17 = null;
			if(!$status->recursive) {
				$tmp17 = $status->path === "";
			} else {
				$tmp17 = true;
			}
			if($tmp17) {
				$tfields = Reflect::fields($value);
				$fields = Reflect::fields($expected);
				$path = $status->path;
				{
					$_g1 = 0;
					while($_g1 < $fields->length) {
						$field = $fields[$_g1];
						++$_g1;
						$tfields->remove($field);
						$tmp18 = null;
						if($path === "") {
							$tmp18 = $field;
						} else {
							$tmp18 = _hx_string_or_null($path) . "." . _hx_string_or_null($field);
						}
						$status->path = $tmp18;
						$tmp19 = !_hx_has_field($value, $field);
						if($tmp19) {
							$tmp20 = "expected field " . _hx_string_or_null($status->path) . " does not exist in ";
							$tmp21 = utest_Assert::q($value);
							$status->error = _hx_string_or_null($tmp20) . _hx_string_or_null($tmp21);
							return false;
							unset($tmp21,$tmp20);
						}
						$e = Reflect::field($expected, $field);
						$tmp22 = Reflect::isFunction($e);
						if($tmp22) {
							continue;
						}
						$v = Reflect::field($value, $field);
						$tmp23 = !utest_Assert::sameAs($e, $v, $status, $approx);
						if($tmp23) {
							return false;
						}
						unset($v,$tmp23,$tmp22,$tmp19,$tmp18,$field,$e);
					}
				}
				$tmp24 = $tfields->length > 0;
				if($tmp24) {
					$tmp25 = $tfields->join(", ");
					$status->error = "the tested object has extra field(s) (" . _hx_string_or_null($tmp25) . ") not included in the expected ones";
					return false;
				}
			}
			$tmp26 = utest_Assert::isIterator($expected, true);
			if($tmp26) {
				$tmp27 = !utest_Assert::isIterator($value, true);
				if($tmp27) {
					$tmp28 = null;
					if($status->path === "") {
						$tmp28 = "";
					} else {
						$tmp28 = " for field " . _hx_string_or_null($status->path);
					}
					$status->error = "expected Iterable but it is not " . _hx_string_or_null($tmp28);
					return false;
				}
				$tmp29 = null;
				if(!$status->recursive) {
					$tmp29 = $status->path === "";
				} else {
					$tmp29 = true;
				}
				if($tmp29) {
					$evalues = Lambda::harray(_hx_anonymous(array("iterator" => array(new _hx_lambda(array(&$expected), "utest_Assert_0"), 'execute'))));
					$vvalues = Lambda::harray(_hx_anonymous(array("iterator" => array(new _hx_lambda(array(&$value), "utest_Assert_1"), 'execute'))));
					$tmp30 = $evalues->length !== $vvalues->length;
					if($tmp30) {
						$tmp31 = "expected " . _hx_string_rec($evalues->length, "") . " values in Iterator but they are " . _hx_string_rec($vvalues->length, "");
						$tmp32 = null;
						if($status->path === "") {
							$tmp32 = "";
						} else {
							$tmp32 = " for field " . _hx_string_or_null($status->path);
						}
						$status->error = _hx_string_or_null($tmp31) . _hx_string_or_null($tmp32);
						return false;
					}
					$path1 = $status->path;
					{
						$_g11 = 0;
						$_g2 = $evalues->length;
						while($_g11 < $_g2) {
							$i = $_g11++;
							$tmp33 = null;
							if($path1 === "") {
								$tmp33 = "iterator[" . _hx_string_rec($i, "") . "]";
							} else {
								$tmp33 = _hx_string_or_null($path1) . "[" . _hx_string_rec($i, "") . "]";
							}
							$status->path = $tmp33;
							$tmp34 = !utest_Assert::sameAs($evalues[$i], $vvalues[$i], $status, $approx);
							if($tmp34) {
								$tmp35 = utest_Assert::q($expected);
								$tmp36 = "expected " . _hx_string_or_null($tmp35) . " but it is ";
								$tmp37 = utest_Assert::q($value);
								$tmp38 = _hx_string_or_null($tmp36) . _hx_string_or_null($tmp37);
								$tmp39 = null;
								if($status->path === "") {
									$tmp39 = "";
								} else {
									$tmp39 = " for field " . _hx_string_or_null($status->path);
								}
								$status->error = _hx_string_or_null($tmp38) . _hx_string_or_null($tmp39);
								return false;
								unset($tmp39,$tmp38,$tmp37,$tmp36,$tmp35);
							}
							unset($tmp34,$tmp33,$i);
						}
					}
				}
				return true;
			}
			$tmp40 = utest_Assert::isIterable($expected, true);
			if($tmp40) {
				$tmp41 = !utest_Assert::isIterable($value, true);
				if($tmp41) {
					$tmp42 = null;
					if($status->path === "") {
						$tmp42 = "";
					} else {
						$tmp42 = " for field " . _hx_string_or_null($status->path);
					}
					$status->error = "expected Iterator but it is not " . _hx_string_or_null($tmp42);
					return false;
				}
				$tmp43 = null;
				if(!$status->recursive) {
					$tmp43 = $status->path === "";
				} else {
					$tmp43 = true;
				}
				if($tmp43) {
					$evalues1 = Lambda::harray($expected);
					$vvalues1 = Lambda::harray($value);
					$tmp44 = $evalues1->length !== $vvalues1->length;
					if($tmp44) {
						$tmp45 = "expected " . _hx_string_rec($evalues1->length, "") . " values in Iterable but they are " . _hx_string_rec($vvalues1->length, "");
						$tmp46 = null;
						if($status->path === "") {
							$tmp46 = "";
						} else {
							$tmp46 = " for field " . _hx_string_or_null($status->path);
						}
						$status->error = _hx_string_or_null($tmp45) . _hx_string_or_null($tmp46);
						return false;
					}
					$path2 = $status->path;
					{
						$_g12 = 0;
						$_g3 = $evalues1->length;
						while($_g12 < $_g3) {
							$i1 = $_g12++;
							$tmp47 = null;
							if($path2 === "") {
								$tmp47 = "iterable[" . _hx_string_rec($i1, "") . "]";
							} else {
								$tmp47 = _hx_string_or_null($path2) . "[" . _hx_string_rec($i1, "") . "]";
							}
							$status->path = $tmp47;
							$tmp48 = !utest_Assert::sameAs($evalues1[$i1], $vvalues1[$i1], $status, $approx);
							if($tmp48) {
								return false;
							}
							unset($tmp48,$tmp47,$i1);
						}
					}
				}
				return true;
			}
			return true;
		}break;
		case 5:{
			$tmp49 = !Reflect::compareMethods($expected, $value);
			if($tmp49) {
				$tmp50 = null;
				if($status->path === "") {
					$tmp50 = "";
				} else {
					$tmp50 = " for field " . _hx_string_or_null($status->path);
				}
				$status->error = "expected same function reference" . _hx_string_or_null($tmp50);
				return false;
			}
			return true;
		}break;
		case 6:{
			$cexpected = Type::getClassName(_hx_deref($_g)->params[0]);
			$tmp51 = Type::getClass($value);
			$cvalue = Type::getClassName($tmp51);
			if($cexpected !== $cvalue) {
				$tmp52 = utest_Assert::q($cexpected);
				$tmp53 = "expected instance of " . _hx_string_or_null($tmp52) . " but it is ";
				$tmp54 = utest_Assert::q($cvalue);
				$tmp55 = _hx_string_or_null($tmp53) . _hx_string_or_null($tmp54);
				$tmp56 = null;
				if($status->path === "") {
					$tmp56 = "";
				} else {
					$tmp56 = " for field " . _hx_string_or_null($status->path);
				}
				$status->error = _hx_string_or_null($tmp55) . _hx_string_or_null($tmp56);
				return false;
			}
			$tmp57 = null;
			$tmp58 = Std::is($expected, _hx_qtype("String"));
			if($tmp58) {
				$tmp57 = !_hx_equal($expected, $value);
			} else {
				$tmp57 = false;
			}
			if($tmp57) {
				$tmp59 = Std::string($expected);
				$tmp60 = "expected '" . _hx_string_or_null($tmp59) . "' but it is '";
				$tmp61 = Std::string($value);
				$status->error = _hx_string_or_null($tmp60) . _hx_string_or_null($tmp61) . "'";
				return false;
			}
			$tmp62 = Std::is($expected, _hx_qtype("Array"));
			if($tmp62) {
				$tmp63 = null;
				if(!$status->recursive) {
					$tmp63 = $status->path === "";
				} else {
					$tmp63 = true;
				}
				if($tmp63) {
					$tmp64 = !_hx_equal(_hx_len($expected), _hx_len($value));
					if($tmp64) {
						$tmp65 = Std::string(_hx_len($expected));
						$tmp66 = "expected " . _hx_string_or_null($tmp65) . " elements but they are ";
						$tmp67 = Std::string(_hx_len($value));
						$tmp68 = _hx_string_or_null($tmp66) . _hx_string_or_null($tmp67);
						$tmp69 = null;
						if($status->path === "") {
							$tmp69 = "";
						} else {
							$tmp69 = " for field " . _hx_string_or_null($status->path);
						}
						$status->error = _hx_string_or_null($tmp68) . _hx_string_or_null($tmp69);
						return false;
					}
					$path3 = $status->path;
					{
						$_g13 = 0;
						$_g4 = _hx_len($expected);
						while($_g13 < $_g4) {
							$i2 = $_g13++;
							$tmp70 = null;
							if($path3 === "") {
								$tmp70 = "array[" . _hx_string_rec($i2, "") . "]";
							} else {
								$tmp70 = _hx_string_or_null($path3) . "[" . _hx_string_rec($i2, "") . "]";
							}
							$status->path = $tmp70;
							$tmp71 = !utest_Assert::sameAs($expected[$i2], $value[$i2], $status, $approx);
							if($tmp71) {
								$tmp72 = utest_Assert::q($expected[$i2]);
								$tmp73 = "expected " . _hx_string_or_null($tmp72) . " but it is ";
								$tmp74 = utest_Assert::q($value[$i2]);
								$tmp75 = _hx_string_or_null($tmp73) . _hx_string_or_null($tmp74);
								$tmp76 = null;
								if($status->path === "") {
									$tmp76 = "";
								} else {
									$tmp76 = " for field " . _hx_string_or_null($status->path);
								}
								$status->error = _hx_string_or_null($tmp75) . _hx_string_or_null($tmp76);
								return false;
								unset($tmp76,$tmp75,$tmp74,$tmp73,$tmp72);
							}
							unset($tmp71,$tmp70,$i2);
						}
					}
				}
				return true;
			}
			$tmp77 = Std::is($expected, _hx_qtype("Date"));
			if($tmp77) {
				$tmp78 = $expected->getTime();
				$tmp79 = $value->getTime();
				if(!_hx_equal($tmp78, $tmp79)) {
					$tmp80 = utest_Assert::q($expected);
					$tmp81 = "expected " . _hx_string_or_null($tmp80) . " but it is ";
					$tmp82 = utest_Assert::q($value);
					$tmp83 = _hx_string_or_null($tmp81) . _hx_string_or_null($tmp82);
					$tmp84 = null;
					if($status->path === "") {
						$tmp84 = "";
					} else {
						$tmp84 = " for field " . _hx_string_or_null($status->path);
					}
					$status->error = _hx_string_or_null($tmp83) . _hx_string_or_null($tmp84);
					return false;
				}
				return true;
			}
			$tmp85 = Std::is($expected, _hx_qtype("haxe.io.Bytes"));
			if($tmp85) {
				$tmp86 = null;
				if(!$status->recursive) {
					$tmp86 = $status->path === "";
				} else {
					$tmp86 = true;
				}
				if($tmp86) {
					$ebytes = $expected;
					$vbytes = $value;
					if($ebytes->length !== $vbytes->length) {
						return false;
					}
					{
						$_g14 = 0;
						$_g5 = $ebytes->length;
						while($_g14 < $_g5) {
							$i3 = $_g14++;
							$tmp87 = ord($ebytes->b->s[$i3]);
							$tmp88 = ord($vbytes->b->s[$i3]);
							if($tmp87 !== $tmp88) {
								$tmp89 = ord($ebytes->b->s[$i3]);
								$tmp90 = "expected byte " . _hx_string_rec($tmp89, "") . " but it is ";
								$tmp91 = ord($vbytes->b->s[$i3]);
								$tmp92 = _hx_string_or_null($tmp90) . _hx_string_rec($tmp91, "");
								$tmp93 = null;
								if($status->path === "") {
									$tmp93 = "";
								} else {
									$tmp93 = " for field " . _hx_string_or_null($status->path);
								}
								$status->error = _hx_string_or_null($tmp92) . _hx_string_or_null($tmp93);
								return false;
								unset($tmp93,$tmp92,$tmp91,$tmp90,$tmp89);
							}
							unset($tmp88,$tmp87,$i3);
						}
					}
				}
				return true;
			}
			$tmp94 = Std::is($expected, _hx_qtype("haxe.IMap"));
			if($tmp94) {
				$tmp95 = null;
				if(!$status->recursive) {
					$tmp95 = $status->path === "";
				} else {
					$tmp95 = true;
				}
				if($tmp95) {
					$map = $expected;
					$vmap = $value;
					$_g6 = (new _hx_array(array()));
					{
						$tmp96 = $map->keys();
						while(true) {
							$tmp97 = !$tmp96->hasNext();
							if($tmp97) {
								break;
							}
							$k = $tmp96->next();
							$_g6->push($k);
							unset($tmp97,$k);
						}
					}
					$keys = $_g6;
					$_g15 = (new _hx_array(array()));
					{
						$tmp98 = $vmap->keys();
						while(true) {
							$tmp99 = !$tmp98->hasNext();
							if($tmp99) {
								break;
							}
							$k1 = $tmp98->next();
							$_g15->push($k1);
							unset($tmp99,$k1);
						}
					}
					$vkeys = $_g15;
					$tmp100 = $keys->length !== $vkeys->length;
					if($tmp100) {
						$tmp101 = "expected " . _hx_string_rec($keys->length, "") . " keys but they are " . _hx_string_rec($vkeys->length, "");
						$tmp102 = null;
						if($status->path === "") {
							$tmp102 = "";
						} else {
							$tmp102 = " for field " . _hx_string_or_null($status->path);
						}
						$status->error = _hx_string_or_null($tmp101) . _hx_string_or_null($tmp102);
						return false;
					}
					$path4 = $status->path;
					{
						$_g21 = 0;
						while($_g21 < $keys->length) {
							$key = $keys[$_g21];
							++$_g21;
							$tmp103 = null;
							if($path4 === "") {
								$tmp104 = Std::string($key);
								$tmp103 = "hash[" . _hx_string_or_null($tmp104) . "]";
								unset($tmp104);
							} else {
								$tmp105 = _hx_string_or_null($path4) . "[";
								$tmp106 = Std::string($key);
								$tmp103 = _hx_string_or_null($tmp105) . _hx_string_or_null($tmp106) . "]";
								unset($tmp106,$tmp105);
							}
							$status->path = $tmp103;
							$tmp107 = $map->get($key);
							$tmp108 = $vmap->get($key);
							$tmp109 = !utest_Assert::sameAs($tmp107, $tmp108, $status, $approx);
							if($tmp109) {
								$tmp110 = utest_Assert::q($expected);
								$tmp111 = "expected " . _hx_string_or_null($tmp110) . " but it is ";
								$tmp112 = utest_Assert::q($value);
								$tmp113 = _hx_string_or_null($tmp111) . _hx_string_or_null($tmp112);
								$tmp114 = null;
								if($status->path === "") {
									$tmp114 = "";
								} else {
									$tmp114 = " for field " . _hx_string_or_null($status->path);
								}
								$status->error = _hx_string_or_null($tmp113) . _hx_string_or_null($tmp114);
								return false;
								unset($tmp114,$tmp113,$tmp112,$tmp111,$tmp110);
							}
							unset($tmp109,$tmp108,$tmp107,$tmp103,$key);
						}
					}
				}
				return true;
			}
			$tmp115 = utest_Assert::isIterator($expected, false);
			if($tmp115) {
				$tmp116 = null;
				if(!$status->recursive) {
					$tmp116 = $status->path === "";
				} else {
					$tmp116 = true;
				}
				if($tmp116) {
					$evalues2 = Lambda::harray(_hx_anonymous(array("iterator" => array(new _hx_lambda(array(&$expected), "utest_Assert_2"), 'execute'))));
					$vvalues2 = Lambda::harray(_hx_anonymous(array("iterator" => array(new _hx_lambda(array(&$value), "utest_Assert_3"), 'execute'))));
					$tmp117 = $evalues2->length !== $vvalues2->length;
					if($tmp117) {
						$tmp118 = "expected " . _hx_string_rec($evalues2->length, "") . " values in Iterator but they are " . _hx_string_rec($vvalues2->length, "");
						$tmp119 = null;
						if($status->path === "") {
							$tmp119 = "";
						} else {
							$tmp119 = " for field " . _hx_string_or_null($status->path);
						}
						$status->error = _hx_string_or_null($tmp118) . _hx_string_or_null($tmp119);
						return false;
					}
					$path5 = $status->path;
					{
						$_g16 = 0;
						$_g7 = $evalues2->length;
						while($_g16 < $_g7) {
							$i4 = $_g16++;
							$tmp120 = null;
							if($path5 === "") {
								$tmp120 = "iterator[" . _hx_string_rec($i4, "") . "]";
							} else {
								$tmp120 = _hx_string_or_null($path5) . "[" . _hx_string_rec($i4, "") . "]";
							}
							$status->path = $tmp120;
							$tmp121 = !utest_Assert::sameAs($evalues2[$i4], $vvalues2[$i4], $status, $approx);
							if($tmp121) {
								$tmp122 = utest_Assert::q($expected);
								$tmp123 = "expected " . _hx_string_or_null($tmp122) . " but it is ";
								$tmp124 = utest_Assert::q($value);
								$tmp125 = _hx_string_or_null($tmp123) . _hx_string_or_null($tmp124);
								$tmp126 = null;
								if($status->path === "") {
									$tmp126 = "";
								} else {
									$tmp126 = " for field " . _hx_string_or_null($status->path);
								}
								$status->error = _hx_string_or_null($tmp125) . _hx_string_or_null($tmp126);
								return false;
								unset($tmp126,$tmp125,$tmp124,$tmp123,$tmp122);
							}
							unset($tmp121,$tmp120,$i4);
						}
					}
				}
				return true;
			}
			$tmp127 = utest_Assert::isIterable($expected, false);
			if($tmp127) {
				$tmp128 = null;
				if(!$status->recursive) {
					$tmp128 = $status->path === "";
				} else {
					$tmp128 = true;
				}
				if($tmp128) {
					$evalues3 = Lambda::harray($expected);
					$vvalues3 = Lambda::harray($value);
					$tmp129 = $evalues3->length !== $vvalues3->length;
					if($tmp129) {
						$tmp130 = "expected " . _hx_string_rec($evalues3->length, "") . " values in Iterable but they are " . _hx_string_rec($vvalues3->length, "");
						$tmp131 = null;
						if($status->path === "") {
							$tmp131 = "";
						} else {
							$tmp131 = " for field " . _hx_string_or_null($status->path);
						}
						$status->error = _hx_string_or_null($tmp130) . _hx_string_or_null($tmp131);
						return false;
					}
					$path6 = $status->path;
					{
						$_g17 = 0;
						$_g8 = $evalues3->length;
						while($_g17 < $_g8) {
							$i5 = $_g17++;
							$tmp132 = null;
							if($path6 === "") {
								$tmp132 = "iterable[" . _hx_string_rec($i5, "") . "]";
							} else {
								$tmp132 = _hx_string_or_null($path6) . "[" . _hx_string_rec($i5, "") . "]";
							}
							$status->path = $tmp132;
							$tmp133 = !utest_Assert::sameAs($evalues3[$i5], $vvalues3[$i5], $status, $approx);
							if($tmp133) {
								return false;
							}
							unset($tmp133,$tmp132,$i5);
						}
					}
				}
				return true;
			}
			$tmp134 = null;
			if(!$status->recursive) {
				$tmp134 = $status->path === "";
			} else {
				$tmp134 = true;
			}
			if($tmp134) {
				$tmp135 = Type::getClass($expected);
				$fields1 = Type::getInstanceFields($tmp135);
				$path7 = $status->path;
				{
					$_g9 = 0;
					while($_g9 < $fields1->length) {
						$field1 = $fields1[$_g9];
						++$_g9;
						$tmp136 = null;
						if($path7 === "") {
							$tmp136 = $field1;
						} else {
							$tmp136 = _hx_string_or_null($path7) . "." . _hx_string_or_null($field1);
						}
						$status->path = $tmp136;
						$e1 = Reflect::field($expected, $field1);
						$tmp137 = Reflect::isFunction($e1);
						if($tmp137) {
							continue;
						}
						$v1 = Reflect::field($value, $field1);
						$tmp138 = !utest_Assert::sameAs($e1, $v1, $status, $approx);
						if($tmp138) {
							return false;
						}
						unset($v1,$tmp138,$tmp137,$tmp136,$field1,$e1);
					}
				}
			}
			return true;
		}break;
		case 7:{
			$eexpected = Type::getEnumName(_hx_deref($_g)->params[0]);
			$tmp139 = Type::getEnum($value);
			$evalue = Type::getEnumName($tmp139);
			if($eexpected !== $evalue) {
				$tmp140 = utest_Assert::q($eexpected);
				$tmp141 = "expected enumeration of " . _hx_string_or_null($tmp140) . " but it is ";
				$tmp142 = utest_Assert::q($evalue);
				$tmp143 = _hx_string_or_null($tmp141) . _hx_string_or_null($tmp142);
				$tmp144 = null;
				if($status->path === "") {
					$tmp144 = "";
				} else {
					$tmp144 = " for field " . _hx_string_or_null($status->path);
				}
				$status->error = _hx_string_or_null($tmp143) . _hx_string_or_null($tmp144);
				return false;
			}
			$tmp145 = null;
			if(!$status->recursive) {
				$tmp145 = $status->path === "";
			} else {
				$tmp145 = true;
			}
			if($tmp145) {
				$tmp146 = $expected->index !== $value->index;
				if($tmp146) {
					$tmp147 = utest_Assert::q(Type::enumConstructor($expected));
					$tmp148 = "expected " . _hx_string_or_null($tmp147) . " but it is ";
					$tmp149 = utest_Assert::q(Type::enumConstructor($value));
					$tmp150 = _hx_string_or_null($tmp148) . _hx_string_or_null($tmp149);
					$tmp151 = null;
					if($status->path === "") {
						$tmp151 = "";
					} else {
						$tmp151 = " for field " . _hx_string_or_null($status->path);
					}
					$status->error = _hx_string_or_null($tmp150) . _hx_string_or_null($tmp151);
					return false;
				}
				$eparams = Type::enumParameters($expected);
				$vparams = Type::enumParameters($value);
				$path8 = $status->path;
				{
					$_g18 = 0;
					$_g10 = $eparams->length;
					while($_g18 < $_g10) {
						$i6 = $_g18++;
						$tmp152 = null;
						if($path8 === "") {
							$tmp152 = "enum[" . _hx_string_rec($i6, "") . "]";
						} else {
							$tmp152 = _hx_string_or_null($path8) . "[" . _hx_string_rec($i6, "") . "]";
						}
						$status->path = $tmp152;
						$tmp153 = !utest_Assert::sameAs($eparams[$i6], $vparams[$i6], $status, $approx);
						if($tmp153) {
							$tmp154 = utest_Assert::q($expected);
							$tmp155 = "expected " . _hx_string_or_null($tmp154) . " but it is ";
							$tmp156 = utest_Assert::q($value);
							$tmp157 = _hx_string_or_null($tmp155) . _hx_string_or_null($tmp156);
							$tmp158 = null;
							if($status->path === "") {
								$tmp158 = "";
							} else {
								$tmp158 = " for field " . _hx_string_or_null($status->path);
							}
							$status->error = _hx_string_or_null($tmp157) . _hx_string_or_null($tmp158);
							return false;
							unset($tmp158,$tmp157,$tmp156,$tmp155,$tmp154);
						}
						unset($tmp153,$tmp152,$i6);
					}
				}
			}
			return true;
		}break;
		case 8:{
			throw new HException("Unable to compare two unknown types");
		}break;
		}
	}
	static function q($v) {
		$tmp = Std::is($v, _hx_qtype("String"));
		if($tmp) {
			$s = $v;
			$tmp1 = str_replace("\"", "\\\"", $s);
			return "\"" . _hx_string_or_null($tmp1) . "\"";
		} else {
			return Std::string($v);
		}
	}
	static function same($expected, $value, $recursive = null, $msg = null, $approx = null, $pos = null) {
		$tmp = null === $approx;
		if($tmp) {
			$approx = 1e-5;
		}
		$tmp1 = null;
		if(null === $recursive) {
			$tmp1 = true;
		} else {
			$tmp1 = $recursive;
		}
		$status = _hx_anonymous(array("recursive" => $tmp1, "path" => "", "error" => null));
		$tmp2 = utest_Assert::sameAs($expected, $value, $status, $approx);
		if($tmp2) {
			utest_Assert::pass($msg, $pos);
		} else {
			$tmp3 = null;
			if($msg === null) {
				$tmp3 = $status->error;
			} else {
				$tmp3 = $msg;
			}
			utest_Assert::fail($tmp3, $pos);
		}
	}
	static function raises($method, $type = null, $msgNotThrown = null, $msgWrongType = null, $pos = null) {
		try {
			call_user_func($method);
			$name = Type::getClassName($type);
			$tmp = $name === null;
			if($tmp) {
				$name = "Dynamic";
			}
			$tmp1 = null === $msgNotThrown;
			if($tmp1) {
				$msgNotThrown = "exception of type " . _hx_string_or_null($name) . " not raised";
			}
			utest_Assert::fail($msgNotThrown, $pos);
		}catch(Exception $__hx__e) {
			$_ex_ = ($__hx__e instanceof HException) && $__hx__e->getCode() == null ? $__hx__e->e : $__hx__e;
			$ex = $_ex_;
			{
				if(null === $type) {
					utest_Assert::pass(null, $pos);
				} else {
					$name1 = Type::getClassName($type);
					if(null === $msgWrongType) {
						$tmp2 = "expected throw of type " . _hx_string_or_null($name1) . " but it is ";
						$tmp3 = Std::string($ex);
						$msgWrongType = _hx_string_or_null($tmp2) . _hx_string_or_null($tmp3);
					}
					$tmp4 = Std::is($ex, $type);
					utest_Assert::isTrue($tmp4, $msgWrongType, $pos);
				}
			}
		}
	}
	static function allows($possibilities, $value, $msg = null, $pos = null) {
		$tmp = Lambda::has($possibilities, $value);
		if($tmp) {
			utest_Assert::isTrue(true, $msg, $pos);
		} else {
			$tmp1 = null;
			if($msg === null) {
				$tmp2 = utest_Assert::q($value);
				$tmp3 = "value " . _hx_string_or_null($tmp2) . " not found in the expected possibilities ";
				$tmp4 = Std::string($possibilities);
				$tmp1 = _hx_string_or_null($tmp3) . _hx_string_or_null($tmp4);
			} else {
				$tmp1 = $msg;
			}
			utest_Assert::fail($tmp1, $pos);
		}
	}
	static function contains($match, $values, $msg = null, $pos = null) {
		$tmp = Lambda::has($values, $match);
		if($tmp) {
			utest_Assert::isTrue(true, $msg, $pos);
		} else {
			$tmp1 = null;
			if($msg === null) {
				$tmp2 = utest_Assert::q($values);
				$tmp3 = "values " . _hx_string_or_null($tmp2) . " do not contain ";
				$tmp4 = Std::string($match);
				$tmp1 = _hx_string_or_null($tmp3) . _hx_string_or_null($tmp4);
			} else {
				$tmp1 = $msg;
			}
			utest_Assert::fail($tmp1, $pos);
		}
	}
	static function notContains($match, $values, $msg = null, $pos = null) {
		$tmp = !Lambda::has($values, $match);
		if($tmp) {
			utest_Assert::isTrue(true, $msg, $pos);
		} else {
			$tmp1 = null;
			if($msg === null) {
				$tmp2 = utest_Assert::q($values);
				$tmp3 = "values " . _hx_string_or_null($tmp2) . " do contain ";
				$tmp4 = Std::string($match);
				$tmp1 = _hx_string_or_null($tmp3) . _hx_string_or_null($tmp4);
			} else {
				$tmp1 = $msg;
			}
			utest_Assert::fail($tmp1, $pos);
		}
	}
	static function stringContains($match, $value, $msg = null, $pos = null) {
		$tmp = null;
		if($value !== null) {
			$tmp1 = _hx_index_of($value, $match, null);
			$tmp = $tmp1 >= 0;
		} else {
			$tmp = false;
		}
		if($tmp) {
			utest_Assert::isTrue(true, $msg, $pos);
		} else {
			$tmp2 = null;
			if($msg === null) {
				$tmp3 = utest_Assert::q($value);
				$tmp4 = "value " . _hx_string_or_null($tmp3) . " does not contain ";
				$tmp5 = utest_Assert::q($match);
				$tmp2 = _hx_string_or_null($tmp4) . _hx_string_or_null($tmp5);
			} else {
				$tmp2 = $msg;
			}
			utest_Assert::fail($tmp2, $pos);
		}
	}
	static function stringSequence($sequence, $value, $msg = null, $pos = null) {
		if(null === $value) {
			$tmp = null;
			if($msg === null) {
				$tmp = "null argument value";
			} else {
				$tmp = $msg;
			}
			utest_Assert::fail($tmp, $pos);
			return;
		}
		$p = 0;
		{
			$_g = 0;
			while($_g < $sequence->length) {
				$s = $sequence[$_g];
				++$_g;
				$p2 = _hx_index_of($value, $s, $p);
				if($p2 < 0) {
					if($msg === null) {
						$msg = "expected '" . _hx_string_or_null($s) . "' after ";
						if($p > 0) {
							$cut = _hx_substr($value, 0, $p);
							$tmp1 = strlen($cut) > 30;
							if($tmp1) {
								$tmp2 = _hx_substr($cut, -27, null);
								$cut = "..." . _hx_string_or_null($tmp2);
								unset($tmp2);
							}
							$msg .= " '" . _hx_string_or_null($cut) . "'";
							unset($tmp1,$cut);
						} else {
							$msg .= " begin";
						}
					}
					utest_Assert::fail($msg, $pos);
					return;
				}
				$p = $p2 + strlen($s);
				unset($s,$p2);
			}
		}
		utest_Assert::isTrue(true, $msg, $pos);
	}
	static function pass($msg = null, $pos = null) {
		if($msg === null) {
			$msg = "pass expected";
		}
		utest_Assert::isTrue(true, $msg, $pos);
	}
	static function fail($msg = null, $pos = null) {
		if($msg === null) {
			$msg = "failure expected";
		}
		utest_Assert::isTrue(false, $msg, $pos);
	}
	static function warn($msg) {
		$tmp = utest_Assertation::Warning($msg);
		utest_Assert::$results->add($tmp);
	}
	static function createAsync($f = null, $timeout = null) { return call_user_func_array(self::$createAsync, array($f, $timeout)); }
	public static $createAsync = null;
	static function createEvent($f, $timeout = null) { return call_user_func_array(self::$createEvent, array($f, $timeout)); }
	public static $createEvent = null;
	static function typeToString($t) {
		try {
			$_t = Type::getClass($t);
			if($_t !== null) {
				$t = $_t;
			}
		}catch(Exception $__hx__e) {
			$_ex_ = ($__hx__e instanceof HException) && $__hx__e->getCode() == null ? $__hx__e->e : $__hx__e;
			$e = $_ex_;
			{}
		}
		try {
			return Type::getClassName($t);
		}catch(Exception $__hx__e) {
			$_ex_ = ($__hx__e instanceof HException) && $__hx__e->getCode() == null ? $__hx__e->e : $__hx__e;
			$e1 = $_ex_;
			{}
		}
		try {
			$_t1 = Type::getEnum($t);
			if($_t1 !== null) {
				$t = $_t1;
			}
		}catch(Exception $__hx__e) {
			$_ex_ = ($__hx__e instanceof HException) && $__hx__e->getCode() == null ? $__hx__e->e : $__hx__e;
			$e2 = $_ex_;
			{}
		}
		try {
			return Type::getEnumName($t);
		}catch(Exception $__hx__e) {
			$_ex_ = ($__hx__e instanceof HException) && $__hx__e->getCode() == null ? $__hx__e->e : $__hx__e;
			$e3 = $_ex_;
			{}
		}
		try {
			$tmp = Type::typeof($t);
			return Std::string($tmp);
		}catch(Exception $__hx__e) {
			$_ex_ = ($__hx__e instanceof HException) && $__hx__e->getCode() == null ? $__hx__e->e : $__hx__e;
			$e4 = $_ex_;
			{}
		}
		try {
			return Std::string($t);
		}catch(Exception $__hx__e) {
			$_ex_ = ($__hx__e instanceof HException) && $__hx__e->getCode() == null ? $__hx__e->e : $__hx__e;
			$e5 = $_ex_;
			{}
		}
		return "<unable to retrieve type name>";
	}
	function __toString() { return 'utest.Assert'; }
}
utest_Assert::$createAsync = array(new _hx_lambda(array(), "utest_Assert_4"), 'execute');
utest_Assert::$createEvent = array(new _hx_lambda(array(), "utest_Assert_5"), 'execute');
function utest_Assert_0(&$expected) {
	{
		return $expected;
	}
}
function utest_Assert_1(&$value) {
	{
		return $value;
	}
}
function utest_Assert_2(&$expected) {
	{
		return $expected;
	}
}
function utest_Assert_3(&$value) {
	{
		return $value;
	}
}
function utest_Assert_4($f, $timeout) {
	{
		return array(new _hx_lambda(array(), "utest_Assert_6"), 'execute');
	}
}
function utest_Assert_5($f, $timeout) {
	{
		return array(new _hx_lambda(array(), "utest_Assert_7"), 'execute');
	}
}
function utest_Assert_6() {
	{}
}
function utest_Assert_7($e) {
	{}
}
