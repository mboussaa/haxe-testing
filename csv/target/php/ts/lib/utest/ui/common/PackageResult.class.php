<?php

// Generated by Haxe 3.3.0
class utest_ui_common_PackageResult {
	public function __construct($packageName) {
		if(!php_Boot::$skip_constructor) {
		$this->packageName = $packageName;
		$this->classes = new haxe_ds_StringMap();
		$this->packages = new haxe_ds_StringMap();
		$this->stats = new utest_ui_common_ResultStats();
	}}
	public $packageName;
	public $classes;
	public $packages;
	public $stats;
	public function addResult($result, $flattenPackage) {
		$pack = $this->getOrCreatePackage($result->pack, $flattenPackage, $this);
		$cls = $this->getOrCreateClass($pack, $result->cls, $result->setup, $result->teardown);
		$fix = $this->createFixture($result->method, $result->assertations);
		$cls->add($fix);
	}
	public function addClass($result) {
		$this->classes->set($result->className, $result);
		$this->stats->wire($result->stats);
	}
	public function addPackage($result) {
		$this->packages->set($result->packageName, $result);
		$this->stats->wire($result->stats);
	}
	public function existsPackage($name) {
		return $this->packages->exists($name);
	}
	public function existsClass($name) {
		return $this->classes->exists($name);
	}
	public function getPackage($name) {
		$tmp = null;
		if($this->packageName === null) {
			$tmp = $name === "";
		} else {
			$tmp = false;
		}
		if($tmp) {
			return $this;
		}
		return $this->packages->get($name);
	}
	public function getClass($name) {
		return $this->classes->get($name);
	}
	public function classNames($errorsHavePriority = null) {
		if($errorsHavePriority === null) {
			$errorsHavePriority = true;
		}
		$names = (new _hx_array(array()));
		{
			$tmp = $this->classes->keys();
			while(true) {
				$tmp1 = !$tmp->hasNext();
				if($tmp1) {
					break;
				}
				$name = $tmp->next();
				$names->push($name);
				unset($tmp1,$name);
			}
		}
		if($errorsHavePriority) {
			$me = $this;
			$names->sort(array(new _hx_lambda(array(&$me), "utest_ui_common_PackageResult_0"), 'execute'));
		} else {
			$names->sort(array(new _hx_lambda(array(), "utest_ui_common_PackageResult_1"), 'execute'));
		}
		return $names;
	}
	public function packageNames($errorsHavePriority = null) {
		if($errorsHavePriority === null) {
			$errorsHavePriority = true;
		}
		$names = (new _hx_array(array()));
		if($this->packageName === null) {
			$names->push("");
		}
		{
			$tmp = $this->packages->keys();
			while(true) {
				$tmp1 = !$tmp->hasNext();
				if($tmp1) {
					break;
				}
				$name = $tmp->next();
				$names->push($name);
				unset($tmp1,$name);
			}
		}
		if($errorsHavePriority) {
			$me = $this;
			$names->sort(array(new _hx_lambda(array(&$me), "utest_ui_common_PackageResult_2"), 'execute'));
		} else {
			$names->sort(array(new _hx_lambda(array(), "utest_ui_common_PackageResult_3"), 'execute'));
		}
		return $names;
	}
	public function createFixture($method, $assertations) {
		$f = new utest_ui_common_FixtureResult($method);
		{
			$tmp = $assertations->iterator();
			while(true) {
				$tmp1 = !$tmp->hasNext();
				if($tmp1) {
					break;
				}
				$assertation = $tmp->next();
				$f->add($assertation);
				unset($tmp1,$assertation);
			}
		}
		return $f;
	}
	public function getOrCreateClass($pack, $cls, $setup, $teardown) {
		$tmp = $pack->existsClass($cls);
		if($tmp) {
			return $pack->getClass($cls);
		}
		$c = new utest_ui_common_ClassResult($cls, $setup, $teardown);
		$pack->addClass($c);
		return $c;
	}
	public function getOrCreatePackage($pack, $flat, $ref) {
		$tmp = null;
		if($pack !== null) {
			$tmp = $pack === "";
		} else {
			$tmp = true;
		}
		if($tmp) {
			return $ref;
		}
		if($flat) {
			$tmp1 = $ref->existsPackage($pack);
			if($tmp1) {
				return $ref->getPackage($pack);
			}
			$p = new utest_ui_common_PackageResult($pack);
			$ref->addPackage($p);
			return $p;
		} else {
			$parts = _hx_explode(".", $pack);
			{
				$_g = 0;
				while($_g < $parts->length) {
					$part = $parts[$_g];
					++$_g;
					$ref = $this->getOrCreatePackage($part, true, $ref);
					unset($part);
				}
			}
			return $ref;
		}
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
	function __toString() { return 'utest.ui.common.PackageResult'; }
}
function utest_ui_common_PackageResult_0(&$me, $a, $b) {
	{
		$as = $me->getClass($a)->stats;
		$bs = $me->getClass($b)->stats;
		$tmp2 = $as->hasErrors;
		if($tmp2) {
			$tmp3 = !$bs->hasErrors;
			if($tmp3) {
				return -1;
			} else {
				$tmp4 = $as->errors === $bs->errors;
				if($tmp4) {
					return Reflect::compare($a, $b);
				} else {
					return Reflect::compare($as->errors, $bs->errors);
				}
			}
		} else {
			$tmp5 = $bs->hasErrors;
			if($tmp5) {
				return 1;
			} else {
				$tmp6 = $as->hasFailures;
				if($tmp6) {
					$tmp7 = !$bs->hasFailures;
					if($tmp7) {
						return -1;
					} else {
						$tmp8 = $as->failures === $bs->failures;
						if($tmp8) {
							return Reflect::compare($a, $b);
						} else {
							return Reflect::compare($as->failures, $bs->failures);
						}
					}
				} else {
					$tmp9 = $bs->hasFailures;
					if($tmp9) {
						return 1;
					} else {
						$tmp10 = $as->hasWarnings;
						if($tmp10) {
							$tmp11 = !$bs->hasWarnings;
							if($tmp11) {
								return -1;
							} else {
								$tmp12 = $as->warnings === $bs->warnings;
								if($tmp12) {
									return Reflect::compare($a, $b);
								} else {
									return Reflect::compare($as->warnings, $bs->warnings);
								}
							}
						} else {
							$tmp13 = $bs->hasWarnings;
							if($tmp13) {
								return 1;
							} else {
								return Reflect::compare($a, $b);
							}
						}
					}
				}
			}
		}
	}
}
function utest_ui_common_PackageResult_1($a1, $b1) {
	{
		return Reflect::compare($a1, $b1);
	}
}
function utest_ui_common_PackageResult_2(&$me, $a, $b) {
	{
		$as = $me->getPackage($a)->stats;
		$bs = $me->getPackage($b)->stats;
		$tmp2 = $as->hasErrors;
		if($tmp2) {
			$tmp3 = !$bs->hasErrors;
			if($tmp3) {
				return -1;
			} else {
				$tmp4 = $as->errors === $bs->errors;
				if($tmp4) {
					return Reflect::compare($a, $b);
				} else {
					return Reflect::compare($as->errors, $bs->errors);
				}
			}
		} else {
			$tmp5 = $bs->hasErrors;
			if($tmp5) {
				return 1;
			} else {
				$tmp6 = $as->hasFailures;
				if($tmp6) {
					$tmp7 = !$bs->hasFailures;
					if($tmp7) {
						return -1;
					} else {
						$tmp8 = $as->failures === $bs->failures;
						if($tmp8) {
							return Reflect::compare($a, $b);
						} else {
							return Reflect::compare($as->failures, $bs->failures);
						}
					}
				} else {
					$tmp9 = $bs->hasFailures;
					if($tmp9) {
						return 1;
					} else {
						$tmp10 = $as->hasWarnings;
						if($tmp10) {
							$tmp11 = !$bs->hasWarnings;
							if($tmp11) {
								return -1;
							} else {
								$tmp12 = $as->warnings === $bs->warnings;
								if($tmp12) {
									return Reflect::compare($a, $b);
								} else {
									return Reflect::compare($as->warnings, $bs->warnings);
								}
							}
						} else {
							$tmp13 = $bs->hasWarnings;
							if($tmp13) {
								return 1;
							} else {
								return Reflect::compare($a, $b);
							}
						}
					}
				}
			}
		}
	}
}
function utest_ui_common_PackageResult_3($a1, $b1) {
	{
		return Reflect::compare($a1, $b1);
	}
}
