<?php

// Generated by Haxe 3.3.0
class thx_TestDates {
	public function __construct() {}
	public function testCreate() {
		$tmp = new Date(2014, 11, 1, 0, 0, 0);
		$tmp1 = thx_Dates::create(2014, 11, 1, null, null, null);
		$tmp2 = _hx_anonymous(array("expected" => $tmp, "test" => $tmp1));
		$tmp3 = new Date(2015, 3, 1, 0, 0, 0);
		$tmp4 = thx_Dates::create(2014, 15, 1, null, null, null);
		$tmp5 = _hx_anonymous(array("expected" => $tmp3, "test" => $tmp4));
		$tmp6 = new Date(2013, 11, 1, 0, 0, 0);
		$tmp7 = thx_Dates::create(2014, -1, 1, null, null, null);
		$tmp8 = _hx_anonymous(array("expected" => $tmp6, "test" => $tmp7));
		$tmp9 = new Date(2014, 2, 4, 0, 0, 0);
		$tmp10 = thx_Dates::create(2014, 1, 32, null, null, null);
		$tmp11 = _hx_anonymous(array("expected" => $tmp9, "test" => $tmp10));
		$tmp12 = new Date(2013, 11, 31, 0, 0, 0);
		$tmp13 = thx_Dates::create(2014, 0, 0, null, null, null);
		$tmp14 = _hx_anonymous(array("expected" => $tmp12, "test" => $tmp13));
		$tmp15 = new Date(2014, 1, 2, 2, 0, 0);
		$tmp16 = thx_Dates::create(2014, 1, 1, 26, null, null);
		$tmp17 = _hx_anonymous(array("expected" => $tmp15, "test" => $tmp16));
		$tmp18 = new Date(2013, 11, 31, 23, 0, 0);
		$tmp19 = thx_Dates::create(2014, 0, 1, -1, null, null);
		$tmp20 = _hx_anonymous(array("expected" => $tmp18, "test" => $tmp19));
		$tmp21 = new Date(2014, 1, 1, 1, 5, 0);
		$tmp22 = thx_Dates::create(2014, 1, 1, 0, 65, null);
		$tmp23 = _hx_anonymous(array("expected" => $tmp21, "test" => $tmp22));
		$tmp24 = new Date(2013, 11, 31, 23, 59, 0);
		$tmp25 = thx_Dates::create(2014, 0, 1, 0, -1, null);
		$tmp26 = _hx_anonymous(array("expected" => $tmp24, "test" => $tmp25));
		$tmp27 = new Date(2014, 1, 1, 0, 1, 5);
		$tmp28 = thx_Dates::create(2014, 1, 1, 0, 0, 65);
		$tmp29 = _hx_anonymous(array("expected" => $tmp27, "test" => $tmp28));
		$tmp30 = new Date(2013, 11, 31, 23, 59, 59);
		$tmp31 = thx_Dates::create(2014, 0, 1, 0, 0, -1);
		_hx_deref((new _hx_array(array($tmp2, $tmp5, $tmp8, $tmp11, $tmp14, $tmp17, $tmp20, $tmp23, $tmp26, $tmp29, _hx_anonymous(array("expected" => $tmp30, "test" => $tmp31))))))->map(array(new _hx_lambda(array(), "thx_TestDates_0"), 'execute'));
	}
	public function testSnapNext() {
		$this->assertSnapNext("2014-01-01 10:07:00", "2014-01-01 10:06:10", thx_TimePeriod::$Minute, _hx_anonymous(array("fileName" => "TestDates.hx", "lineNumber" => 41, "className" => "thx.TestDates", "methodName" => "testSnapNext")));
		$this->assertSnapNext("2014-01-01 10:06:00", "2014-01-01 10:05:50", thx_TimePeriod::$Minute, _hx_anonymous(array("fileName" => "TestDates.hx", "lineNumber" => 42, "className" => "thx.TestDates", "methodName" => "testSnapNext")));
		$this->assertSnapNext("2014-01-01 11:00:00", "2014-01-01 10:10:10", thx_TimePeriod::$Hour, _hx_anonymous(array("fileName" => "TestDates.hx", "lineNumber" => 43, "className" => "thx.TestDates", "methodName" => "testSnapNext")));
		$this->assertSnapNext("2014-01-01 10:00:00", "2014-01-01 09:50:10", thx_TimePeriod::$Hour, _hx_anonymous(array("fileName" => "TestDates.hx", "lineNumber" => 44, "className" => "thx.TestDates", "methodName" => "testSnapNext")));
		$this->assertSnapNext("2014-01-02 00:00:00", "2014-01-01 10:00:00", thx_TimePeriod::$Day, _hx_anonymous(array("fileName" => "TestDates.hx", "lineNumber" => 45, "className" => "thx.TestDates", "methodName" => "testSnapNext")));
		$this->assertSnapNext("2014-01-01 00:00:00", "2013-12-31 20:00:00", thx_TimePeriod::$Day, _hx_anonymous(array("fileName" => "TestDates.hx", "lineNumber" => 46, "className" => "thx.TestDates", "methodName" => "testSnapNext")));
		$this->assertSnapNext("2014-12-21 00:00:00", "2014-12-17 11:00:00", thx_TimePeriod::$Week, _hx_anonymous(array("fileName" => "TestDates.hx", "lineNumber" => 47, "className" => "thx.TestDates", "methodName" => "testSnapNext")));
		$this->assertSnapNext("2014-12-21 00:00:00", "2014-12-18 00:00:00", thx_TimePeriod::$Week, _hx_anonymous(array("fileName" => "TestDates.hx", "lineNumber" => 48, "className" => "thx.TestDates", "methodName" => "testSnapNext")));
		$this->assertSnapNext("2015-01-01 00:00:00", "2014-12-12 00:00:00", thx_TimePeriod::$Month, _hx_anonymous(array("fileName" => "TestDates.hx", "lineNumber" => 49, "className" => "thx.TestDates", "methodName" => "testSnapNext")));
		$this->assertSnapNext("2015-01-01 00:00:00", "2014-12-18 00:00:00", thx_TimePeriod::$Month, _hx_anonymous(array("fileName" => "TestDates.hx", "lineNumber" => 50, "className" => "thx.TestDates", "methodName" => "testSnapNext")));
		$this->assertSnapNext("2015-01-01 00:00:00", "2014-05-12 00:00:00", thx_TimePeriod::$Year, _hx_anonymous(array("fileName" => "TestDates.hx", "lineNumber" => 51, "className" => "thx.TestDates", "methodName" => "testSnapNext")));
		$this->assertSnapNext("2015-01-01 00:00:00", "2014-12-18 00:00:00", thx_TimePeriod::$Year, _hx_anonymous(array("fileName" => "TestDates.hx", "lineNumber" => 52, "className" => "thx.TestDates", "methodName" => "testSnapNext")));
	}
	public function testSnapPrev() {
		$this->assertSnapPrev("2014-01-01 10:06:00", "2014-01-01 10:06:10", thx_TimePeriod::$Minute, _hx_anonymous(array("fileName" => "TestDates.hx", "lineNumber" => 56, "className" => "thx.TestDates", "methodName" => "testSnapPrev")));
		$this->assertSnapPrev("2014-01-01 10:05:00", "2014-01-01 10:05:50", thx_TimePeriod::$Minute, _hx_anonymous(array("fileName" => "TestDates.hx", "lineNumber" => 57, "className" => "thx.TestDates", "methodName" => "testSnapPrev")));
		$this->assertSnapPrev("2014-01-01 10:00:00", "2014-01-01 10:10:10", thx_TimePeriod::$Hour, _hx_anonymous(array("fileName" => "TestDates.hx", "lineNumber" => 58, "className" => "thx.TestDates", "methodName" => "testSnapPrev")));
		$this->assertSnapPrev("2014-01-01 09:00:00", "2014-01-01 09:50:10", thx_TimePeriod::$Hour, _hx_anonymous(array("fileName" => "TestDates.hx", "lineNumber" => 59, "className" => "thx.TestDates", "methodName" => "testSnapPrev")));
		$this->assertSnapPrev("2014-01-01 00:00:00", "2014-01-01 10:00:00", thx_TimePeriod::$Day, _hx_anonymous(array("fileName" => "TestDates.hx", "lineNumber" => 60, "className" => "thx.TestDates", "methodName" => "testSnapPrev")));
		$this->assertSnapPrev("2013-12-31 00:00:00", "2013-12-31 20:00:00", thx_TimePeriod::$Day, _hx_anonymous(array("fileName" => "TestDates.hx", "lineNumber" => 61, "className" => "thx.TestDates", "methodName" => "testSnapPrev")));
		$this->assertSnapPrev("2014-12-14 00:00:00", "2014-12-17 11:00:00", thx_TimePeriod::$Week, _hx_anonymous(array("fileName" => "TestDates.hx", "lineNumber" => 62, "className" => "thx.TestDates", "methodName" => "testSnapPrev")));
		$this->assertSnapPrev("2014-12-14 00:00:00", "2014-12-18 00:00:00", thx_TimePeriod::$Week, _hx_anonymous(array("fileName" => "TestDates.hx", "lineNumber" => 63, "className" => "thx.TestDates", "methodName" => "testSnapPrev")));
		$this->assertSnapPrev("2014-12-01 00:00:00", "2014-12-12 00:00:00", thx_TimePeriod::$Month, _hx_anonymous(array("fileName" => "TestDates.hx", "lineNumber" => 64, "className" => "thx.TestDates", "methodName" => "testSnapPrev")));
		$this->assertSnapPrev("2014-12-01 00:00:00", "2014-12-18 00:00:00", thx_TimePeriod::$Month, _hx_anonymous(array("fileName" => "TestDates.hx", "lineNumber" => 65, "className" => "thx.TestDates", "methodName" => "testSnapPrev")));
		$this->assertSnapPrev("2014-01-01 00:00:00", "2014-05-12 00:00:00", thx_TimePeriod::$Year, _hx_anonymous(array("fileName" => "TestDates.hx", "lineNumber" => 66, "className" => "thx.TestDates", "methodName" => "testSnapPrev")));
		$this->assertSnapPrev("2014-01-01 00:00:00", "2014-12-18 00:00:00", thx_TimePeriod::$Year, _hx_anonymous(array("fileName" => "TestDates.hx", "lineNumber" => 67, "className" => "thx.TestDates", "methodName" => "testSnapPrev")));
	}
	public function testSnapTo() {
		$this->assertSnapTo("2014-01-01 10:06:00", "2014-01-01 10:06:10", thx_TimePeriod::$Minute, _hx_anonymous(array("fileName" => "TestDates.hx", "lineNumber" => 71, "className" => "thx.TestDates", "methodName" => "testSnapTo")));
		$this->assertSnapTo("2014-01-01 10:06:00", "2014-01-01 10:05:50", thx_TimePeriod::$Minute, _hx_anonymous(array("fileName" => "TestDates.hx", "lineNumber" => 72, "className" => "thx.TestDates", "methodName" => "testSnapTo")));
		$this->assertSnapTo("2014-01-01 10:00:00", "2014-01-01 10:10:10", thx_TimePeriod::$Hour, _hx_anonymous(array("fileName" => "TestDates.hx", "lineNumber" => 73, "className" => "thx.TestDates", "methodName" => "testSnapTo")));
		$this->assertSnapTo("2014-01-01 10:00:00", "2014-01-01 09:50:10", thx_TimePeriod::$Hour, _hx_anonymous(array("fileName" => "TestDates.hx", "lineNumber" => 74, "className" => "thx.TestDates", "methodName" => "testSnapTo")));
		$this->assertSnapTo("2014-01-01 00:00:00", "2014-01-01 10:00:00", thx_TimePeriod::$Day, _hx_anonymous(array("fileName" => "TestDates.hx", "lineNumber" => 75, "className" => "thx.TestDates", "methodName" => "testSnapTo")));
		$this->assertSnapTo("2014-01-01 00:00:00", "2013-12-31 20:00:00", thx_TimePeriod::$Day, _hx_anonymous(array("fileName" => "TestDates.hx", "lineNumber" => 76, "className" => "thx.TestDates", "methodName" => "testSnapTo")));
		$this->assertSnapTo("2014-12-14 00:00:00", "2014-12-17 11:00:00", thx_TimePeriod::$Week, _hx_anonymous(array("fileName" => "TestDates.hx", "lineNumber" => 77, "className" => "thx.TestDates", "methodName" => "testSnapTo")));
		$this->assertSnapTo("2014-12-21 00:00:00", "2014-12-18 00:00:00", thx_TimePeriod::$Week, _hx_anonymous(array("fileName" => "TestDates.hx", "lineNumber" => 78, "className" => "thx.TestDates", "methodName" => "testSnapTo")));
		$this->assertSnapTo("2014-12-01 00:00:00", "2014-12-12 00:00:00", thx_TimePeriod::$Month, _hx_anonymous(array("fileName" => "TestDates.hx", "lineNumber" => 79, "className" => "thx.TestDates", "methodName" => "testSnapTo")));
		$this->assertSnapTo("2015-01-01 00:00:00", "2014-12-18 00:00:00", thx_TimePeriod::$Month, _hx_anonymous(array("fileName" => "TestDates.hx", "lineNumber" => 80, "className" => "thx.TestDates", "methodName" => "testSnapTo")));
		$this->assertSnapTo("2014-01-01 00:00:00", "2014-05-12 00:00:00", thx_TimePeriod::$Year, _hx_anonymous(array("fileName" => "TestDates.hx", "lineNumber" => 81, "className" => "thx.TestDates", "methodName" => "testSnapTo")));
		$this->assertSnapTo("2015-01-01 00:00:00", "2014-12-18 00:00:00", thx_TimePeriod::$Year, _hx_anonymous(array("fileName" => "TestDates.hx", "lineNumber" => 82, "className" => "thx.TestDates", "methodName" => "testSnapTo")));
	}
	public function assertSnapTo($expected, $date, $period, $pos = null) {
		$date1 = Date::fromString($date);
		$this1 = thx__Timestamp_Timestamp_Impl_::snapTo($date1->getTime(), $period);
		$t = Date::fromTime($this1);
		$tmp = Date::fromString($expected)->getTime();
		$tmp1 = $t->getTime();
		$tmp2 = "expected " . _hx_string_or_null($date) . " to snap to " . _hx_string_or_null($expected) . " for ";
		$tmp3 = Std::string($period);
		$tmp4 = _hx_string_or_null($tmp2) . _hx_string_or_null($tmp3) . " but it is ";
		$tmp5 = $t->toString();
		utest_Assert::floatEquals($tmp, $tmp1, null, _hx_string_or_null($tmp4) . _hx_string_or_null($tmp5), $pos);
	}
	public function assertSnapPrev($expected, $date, $period, $pos = null) {
		$date1 = Date::fromString($date);
		$this1 = thx__Timestamp_Timestamp_Impl_::snapPrev($date1->getTime(), $period);
		$t = Date::fromTime($this1);
		$tmp = Date::fromString($expected)->getTime();
		$tmp1 = $t->getTime();
		$tmp2 = "expected " . _hx_string_or_null($date) . " to snap before " . _hx_string_or_null($expected) . " for ";
		$tmp3 = Std::string($period);
		$tmp4 = _hx_string_or_null($tmp2) . _hx_string_or_null($tmp3) . " but it is ";
		$tmp5 = $t->toString();
		utest_Assert::floatEquals($tmp, $tmp1, null, _hx_string_or_null($tmp4) . _hx_string_or_null($tmp5), $pos);
	}
	public function assertSnapNext($expected, $date, $period, $pos = null) {
		$date1 = Date::fromString($date);
		$this1 = thx__Timestamp_Timestamp_Impl_::snapNext($date1->getTime(), $period);
		$t = Date::fromTime($this1);
		$tmp = Date::fromString($expected)->getTime();
		$tmp1 = $t->getTime();
		$tmp2 = "expected " . _hx_string_or_null($date) . " to snap after " . _hx_string_or_null($expected) . " for ";
		$tmp3 = Std::string($period);
		$tmp4 = _hx_string_or_null($tmp2) . _hx_string_or_null($tmp3) . " but it is ";
		$tmp5 = $t->toString();
		utest_Assert::floatEquals($tmp, $tmp1, null, _hx_string_or_null($tmp4) . _hx_string_or_null($tmp5), $pos);
	}
	function __toString() { return 'thx.TestDates'; }
}
function thx_TestDates_0($o) {
	{
		$tmp32 = $o->expected->getTime();
		$tmp33 = $o->test->getTime();
		$tmp34 = $o->expected->toString();
		$tmp35 = "expected " . _hx_string_or_null($tmp34) . " but was  ";
		$tmp36 = $o->test->toString();
		utest_Assert::floatEquals($tmp32, $tmp33, null, _hx_string_or_null($tmp35) . _hx_string_or_null($tmp36), _hx_anonymous(array("fileName" => "TestDates.hx", "lineNumber" => 36, "className" => "thx.TestDates", "methodName" => "testCreate")));
	}
}