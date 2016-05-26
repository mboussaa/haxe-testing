<?php

// Generated by Haxe 3.3.0
class thx_TestOrderedSet {
	public function __construct() {}
	public function testCreate() {
		$set = thx__OrderedSet_OrderedSet_Impl_::create(null);
		utest_Assert::equals(0, $set->length, null, _hx_anonymous(array("fileName" => "TestOrderedSet.hx", "lineNumber" => 10, "className" => "thx.TestOrderedSet", "methodName" => "testCreate")));
		thx__OrderedSet_OrderedSet_Impl_::add($set, 1);
		thx__OrderedSet_OrderedSet_Impl_::add($set, 1);
		utest_Assert::equals(1, $set->length, null, _hx_anonymous(array("fileName" => "TestOrderedSet.hx", "lineNumber" => 13, "className" => "thx.TestOrderedSet", "methodName" => "testCreate")));
	}
	public function testOrderedSet() {
		$set = thx__OrderedSet_OrderedSet_Impl_::toOrderedSet((new _hx_array(array(1, 2, 2, 2, 3))));
		utest_Assert::same((new _hx_array(array(1, 2, 3))), thx__OrderedSet_OrderedSet_Impl_::toArray($set), null, null, null, _hx_anonymous(array("fileName" => "TestOrderedSet.hx", "lineNumber" => 18, "className" => "thx.TestOrderedSet", "methodName" => "testOrderedSet")));
	}
	public function testUnion() {
		$s1 = thx__OrderedSet_OrderedSet_Impl_::toOrderedSet((new _hx_array(array(1, 2, 3))));
		$s2 = thx__OrderedSet_OrderedSet_Impl_::toOrderedSet((new _hx_array(array(2, 2, 4))));
		$tmp = thx__OrderedSet_OrderedSet_Impl_::toArray($s2);
		$tmp1 = $s1->concat($tmp);
		$tmp2 = thx__OrderedSet_OrderedSet_Impl_::toOrderedSet($tmp1);
		utest_Assert::same((new _hx_array(array(1, 2, 3, 4))), thx__OrderedSet_OrderedSet_Impl_::toArray($tmp2), null, null, null, _hx_anonymous(array("fileName" => "TestOrderedSet.hx", "lineNumber" => 24, "className" => "thx.TestOrderedSet", "methodName" => "testUnion")));
	}
	public function testDifference() {
		$s1 = thx__OrderedSet_OrderedSet_Impl_::toOrderedSet((new _hx_array(array(1, 2, 3))));
		$s2 = thx__OrderedSet_OrderedSet_Impl_::toOrderedSet((new _hx_array(array(2, 2, 4))));
		$result = $s1->copy();
		{
			$tmp = $s2->iterator();
			while(true) {
				$tmp1 = !$tmp->hasNext();
				if($tmp1) {
					break;
				}
				$item = $tmp->next();
				$result->remove($item);
				unset($tmp1,$item);
			}
		}
		utest_Assert::same((new _hx_array(array(1, 3))), thx__OrderedSet_OrderedSet_Impl_::toArray($result), null, null, null, _hx_anonymous(array("fileName" => "TestOrderedSet.hx", "lineNumber" => 30, "className" => "thx.TestOrderedSet", "methodName" => "testDifference")));
	}
	public function testBooleans() {
		$this1 = thx__OrderedSet_OrderedSet_Impl_::toOrderedSet((new _hx_array(array(1, 2, 3))));
		$set = thx__OrderedSet_OrderedSet_Impl_::toOrderedSet((new _hx_array(array(2, 3, 4))));
		$tmp = thx__OrderedSet_OrderedSet_Impl_::toArray($set);
		$tmp1 = $this1->concat($tmp);
		$this2 = thx__OrderedSet_OrderedSet_Impl_::toOrderedSet($tmp1);
		$set1 = thx__OrderedSet_OrderedSet_Impl_::toOrderedSet((new _hx_array(array(2, 3))));
		$result = $this2->copy();
		{
			$tmp2 = $set1->iterator();
			while(true) {
				$tmp3 = !$tmp2->hasNext();
				if($tmp3) {
					break;
				}
				$item = $tmp2->next();
				$result->remove($item);
				unset($tmp3,$item);
			}
		}
		utest_Assert::same((new _hx_array(array(1, 4))), $result, null, null, null, _hx_anonymous(array("fileName" => "TestOrderedSet.hx", "lineNumber" => 35, "className" => "thx.TestOrderedSet", "methodName" => "testBooleans")));
	}
	function __toString() { return 'thx.TestOrderedSet'; }
}