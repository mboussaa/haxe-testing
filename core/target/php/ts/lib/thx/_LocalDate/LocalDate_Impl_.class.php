<?php

// Generated by Haxe 3.3.0
class thx__LocalDate_LocalDate_Impl_ {
	public function __construct(){}
	static $millisPerSecond = 1000;
	static $millisPerMinute;
	static $millisPerHour;
	static $millisPerDay;
	static $daysPerYear = 365;
	static $daysPer4Years;
	static $daysPer100Years;
	static $daysPer400Years;
	static $unixEpochDays;
	static $DATE_PART_YEAR = 0;
	static $DATE_PART_DAY_OF_YEAR = 1;
	static $DATE_PART_MONTH = 2;
	static $DATE_PART_DAY = 3;
	static $daysToMonth365;
	static $daysToMonth366;
	static function now() {
		$tmp = Date::now();
		return thx__LocalDate_LocalDate_Impl_::fromDate($tmp);
	}
	static function fromInt($days) {
		return $days;
	}
	static function fromDate($date) {
		$tmp = $date->getTime();
		return thx__LocalDate_LocalDate_Impl_::fromTime($tmp);
	}
	static function fromTime($timestamp) {
		$tmp = $timestamp / thx__LocalDate_LocalDate_Impl_::$millisPerDay;
		$tmp1 = Std::int($tmp);
		return $tmp1 + thx__LocalDate_LocalDate_Impl_::$unixEpochDays;
	}
	static function fromString($s) {
		if($s === null) {
			throw new HException(new thx_Error("null String cannot be parsed to LocalDate", null, _hx_anonymous(array("fileName" => "LocalDate.hx", "lineNumber" => 66, "className" => "thx._LocalDate.LocalDate_Impl_", "methodName" => "fromString"))));
		}
		$pattern = new EReg("^([-])?(\\d+)[-](\\d{2})[-](\\d{2})\$", "");
		$tmp = !$pattern->match($s);
		if($tmp) {
			throw new HException(new thx_Error("unable to parse DateTime string: \"" . _hx_string_or_null($s) . "\"", null, _hx_anonymous(array("fileName" => "LocalDate.hx", "lineNumber" => 69, "className" => "thx._LocalDate.LocalDate_Impl_", "methodName" => "fromString"))));
		}
		$tmp1 = $pattern->matched(2);
		$tmp2 = Std::parseInt($tmp1);
		$tmp3 = $pattern->matched(3);
		$tmp4 = Std::parseInt($tmp3);
		$tmp5 = $pattern->matched(4);
		$tmp6 = Std::parseInt($tmp5);
		$date = thx__LocalDate_LocalDate_Impl_::create($tmp2, $tmp4, $tmp6);
		$tmp7 = $pattern->matched(1);
		if($tmp7 === "-") {
			return -$date;
		}
		return $date;
	}
	static function compare($a, $b) {
		return $a - $b;
	}
	static function create($year, $month, $day) {
		$days = thx__LocalDate_LocalDate_Impl_::dateToDays($year, $month, $day);
		return $days;
	}
	static function dateToDays($year, $month, $day) {
		$fixMonthYear = array(new _hx_lambda(array(&$month, &$year), "thx__LocalDate_LocalDate_Impl__0"), 'execute');
		while($day < 0) {
			--$month;
			call_user_func($fixMonthYear);
			$day += thx__DateTimeUtc_DateTimeUtc_Impl_::daysInMonth($year, $month);
		}
		call_user_func($fixMonthYear);
		$days = null;
		while(true) {
			$days = thx__DateTimeUtc_DateTimeUtc_Impl_::daysInMonth($year, $month);
			if(!($day > $days)) {
				break;
			}
			++$month;
			call_user_func($fixMonthYear);
			$day -= $days;
		}
		if($day === 0) {
			--$month;
			call_user_func($fixMonthYear);
			$day = thx__DateTimeUtc_DateTimeUtc_Impl_::daysInMonth($year, $month);
		}
		call_user_func($fixMonthYear);
		return thx__LocalDate_LocalDate_Impl_::rawDateToDays($year, $month, $day);
	}
	static function rawDateToDays($year, $month, $day) {
		$days = null;
		if(thx__DateTimeUtc_DateTimeUtc_Impl_::isLeapYear($year)) {
			$days = thx__LocalDate_LocalDate_Impl_::$daysToMonth366;
		} else {
			$days = thx__LocalDate_LocalDate_Impl_::$daysToMonth365;
		}
		$tmp = null;
		if($day >= 1) {
			$tmp = $day <= $days->a[$month] - $days[$month - 1];
		} else {
			$tmp = false;
		}
		if($tmp) {
			$y = $year - 1;
			$tmp1 = $y * 365;
			$tmp2 = Std::int($y / 4);
			$tmp3 = $tmp1 + $tmp2;
			$tmp4 = Std::int($y / 100);
			$tmp5 = $tmp3 - $tmp4;
			$tmp6 = Std::int($y / 400);
			return $tmp5 + $tmp6 + $days[$month - 1] + $day - 1;
		}
		throw new HException(new thx_Error("bad year-month-day " . _hx_string_rec($year, "") . "-" . _hx_string_rec($month, "") . "-" . _hx_string_rec($day, ""), null, _hx_anonymous(array("fileName" => "LocalDate.hx", "lineNumber" => 141, "className" => "thx._LocalDate.LocalDate_Impl_", "methodName" => "rawDateToDays"))));
	}
	static function daysRange($start, $end) {
		if($end - $start < 0) {
			return (new _hx_array(array()));
		}
		$days = (new _hx_array(array()));
		while($start !== $end) {
			$days->push($start);
			$start = thx__LocalDate_LocalDate_Impl_::jump($start, thx_TimePeriod::$Day, 1);
		}
		$days->push($end);
		return $days;
	}
	static function getDatePart($this1, $part) {
		$n = $this1;
		$tmp = $this1 / thx__LocalDate_LocalDate_Impl_::$daysPer400Years;
		$y400 = Std::int($tmp);
		$n = $this1 - $y400 * thx__LocalDate_LocalDate_Impl_::$daysPer400Years;
		$tmp1 = $n / thx__LocalDate_LocalDate_Impl_::$daysPer100Years;
		$y100 = Std::int($tmp1);
		$tmp2 = $y100 === 4;
		if($tmp2) {
			$y100 = 3;
		}
		$n -= $y100 * thx__LocalDate_LocalDate_Impl_::$daysPer100Years;
		$tmp3 = $n / thx__LocalDate_LocalDate_Impl_::$daysPer4Years;
		$y4 = Std::int($tmp3);
		$n -= $y4 * thx__LocalDate_LocalDate_Impl_::$daysPer4Years;
		$tmp4 = $n / thx__LocalDate_LocalDate_Impl_::$daysPerYear;
		$y1 = Std::int($tmp4);
		$tmp5 = $y1 === 4;
		if($tmp5) {
			$y1 = 3;
		}
		if($part === thx__LocalDate_LocalDate_Impl_::$DATE_PART_YEAR) {
			return $y400 * 400 + $y100 * 100 + $y4 * 4 + $y1 + 1;
		}
		$n -= $y1 * thx__LocalDate_LocalDate_Impl_::$daysPerYear;
		if($part === thx__LocalDate_LocalDate_Impl_::$DATE_PART_DAY_OF_YEAR) {
			return $n + 1;
		}
		$leapYear = null;
		if($y1 === 3) {
			if($y4 === 24) {
				$leapYear = $y100 === 3;
			} else {
				$leapYear = true;
			}
		} else {
			$leapYear = false;
		}
		$adays = null;
		if($leapYear) {
			$adays = thx__LocalDate_LocalDate_Impl_::$daysToMonth366;
		} else {
			$adays = thx__LocalDate_LocalDate_Impl_::$daysToMonth365;
		}
		$m = $n >> 6;
		while($n >= $adays[$m]) {
			++$m;
		}
		if($part === thx__LocalDate_LocalDate_Impl_::$DATE_PART_MONTH) {
			return $m;
		}
		return $n - $adays[$m - 1] + 1;
	}
	static function _new($days) {
		return $days;
	}
	static function min($this1, $other) {
		if(thx__LocalDate_LocalDate_Impl_::compareTo($this1, $other) <= 0) {
			return $this1;
		} else {
			return $other;
		}
	}
	static function max($this1, $other) {
		if(thx__LocalDate_LocalDate_Impl_::compareTo($this1, $other) >= 0) {
			return $this1;
		} else {
			return $other;
		}
	}
	static function jump($this1, $period, $amount) {
		$sec = 0;
		$min = 0;
		$hr = 0;
		$day = thx__LocalDate_LocalDate_Impl_::getDatePart($this1, thx__LocalDate_LocalDate_Impl_::$DATE_PART_DAY);
		$mon = thx__LocalDate_LocalDate_Impl_::getDatePart($this1, thx__LocalDate_LocalDate_Impl_::$DATE_PART_MONTH);
		$yr = thx__LocalDate_LocalDate_Impl_::getDatePart($this1, thx__LocalDate_LocalDate_Impl_::$DATE_PART_YEAR);
		switch($period->index) {
		case 0:{
			$sec = $amount;
		}break;
		case 1:{
			$min = $amount;
		}break;
		case 2:{
			$hr = $amount;
		}break;
		case 3:{
			$day += $amount;
		}break;
		case 4:{
			$day += $amount * 7;
		}break;
		case 5:{
			$mon += $amount;
		}break;
		case 6:{
			$yr += $amount;
		}break;
		}
		$time = thx__Time_Time_Impl_::create($hr, $min, $sec, null);
		$b = thx__DateTimeUtc_DateTimeUtc_Impl_::$ticksPerDayI64;
		$x = haxe__Int64_Int64_Impl_::divMod($time, $b)->quotient;
		if($x->high !== $x->low >> 31) {
			throw new HException("Overflow");
		}
		$tmp = $x->low / 7;
		$extraDays = Math::floor($tmp);
		return thx__LocalDate_LocalDate_Impl_::create($yr, $mon, $day + $extraDays);
	}
	static function daysInThisMonth($this1) {
		$tmp = thx__LocalDate_LocalDate_Impl_::getDatePart($this1, thx__LocalDate_LocalDate_Impl_::$DATE_PART_YEAR);
		$tmp1 = thx__LocalDate_LocalDate_Impl_::getDatePart($this1, thx__LocalDate_LocalDate_Impl_::$DATE_PART_MONTH);
		return thx__DateTimeUtc_DateTimeUtc_Impl_::daysInMonth($tmp, $tmp1);
	}
	static function prevYear($this1) {
		return thx__LocalDate_LocalDate_Impl_::jump($this1, thx_TimePeriod::$Year, -1);
	}
	static function nextYear($this1) {
		return thx__LocalDate_LocalDate_Impl_::jump($this1, thx_TimePeriod::$Year, 1);
	}
	static function prevMonth($this1) {
		return thx__LocalDate_LocalDate_Impl_::jump($this1, thx_TimePeriod::$Month, -1);
	}
	static function nextMonth($this1) {
		return thx__LocalDate_LocalDate_Impl_::jump($this1, thx_TimePeriod::$Month, 1);
	}
	static function prevWeek($this1) {
		return thx__LocalDate_LocalDate_Impl_::jump($this1, thx_TimePeriod::$Week, -1);
	}
	static function nextWeek($this1) {
		return thx__LocalDate_LocalDate_Impl_::jump($this1, thx_TimePeriod::$Week, 1);
	}
	static function prevDay($this1) {
		return thx__LocalDate_LocalDate_Impl_::jump($this1, thx_TimePeriod::$Day, -1);
	}
	static function nextDay($this1) {
		return thx__LocalDate_LocalDate_Impl_::jump($this1, thx_TimePeriod::$Day, 1);
	}
	static function snapToWeekDay($this1, $weekday, $firstDayOfWk = null) {
		if($firstDayOfWk === null) {
			$firstDayOfWk = 0;
		}
		$d = thx__LocalDate_LocalDate_Impl_::get_dayOfWeek($this1);
		$s = $weekday;
		$tmp = $s < $firstDayOfWk;
		if($tmp) {
			$s += 7;
		}
		$tmp1 = $d < $firstDayOfWk;
		if($tmp1) {
			$d += 7;
		}
		return thx__LocalDate_LocalDate_Impl_::jump($this1, thx_TimePeriod::$Day, $s - $d);
	}
	static function snapNextWeekDay($this1, $weekday) {
		$d = thx__LocalDate_LocalDate_Impl_::get_dayOfWeek($this1);
		$s = $weekday;
		$tmp = $s < $d;
		if($tmp) {
			$s += 7;
		}
		return thx__LocalDate_LocalDate_Impl_::jump($this1, thx_TimePeriod::$Day, $s - $d);
	}
	static function snapPrevWeekDay($this1, $weekday) {
		$d = thx__LocalDate_LocalDate_Impl_::get_dayOfWeek($this1);
		$s = $weekday;
		$tmp = $s > $d;
		if($tmp) {
			$s -= 7;
		}
		return thx__LocalDate_LocalDate_Impl_::jump($this1, thx_TimePeriod::$Day, $s - $d);
	}
	static function snapNext($this1, $period) {
		$tmp = $period->index;
		switch($tmp) {
		case 0:case 1:case 2:{
			return $this1;
		}break;
		case 3:{
			return $this1 + 1;
		}break;
		case 4:{
			$wd = thx__LocalDate_LocalDate_Impl_::get_dayOfWeek($this1);
			return $this1 + 7 - $wd;
		}break;
		case 5:{
			$tmp1 = thx__LocalDate_LocalDate_Impl_::getDatePart($this1, thx__LocalDate_LocalDate_Impl_::$DATE_PART_YEAR);
			$tmp2 = thx__LocalDate_LocalDate_Impl_::getDatePart($this1, thx__LocalDate_LocalDate_Impl_::$DATE_PART_MONTH);
			return thx__LocalDate_LocalDate_Impl_::create($tmp1, $tmp2 + 1, 1);
		}break;
		case 6:{
			$tmp3 = thx__LocalDate_LocalDate_Impl_::getDatePart($this1, thx__LocalDate_LocalDate_Impl_::$DATE_PART_YEAR);
			return thx__LocalDate_LocalDate_Impl_::create($tmp3 + 1, 1, 1);
		}break;
		}
	}
	static function snapPrev($this1, $period) {
		$tmp = $period->index;
		switch($tmp) {
		case 0:case 1:case 2:case 3:{
			return $this1 - 1;
		}break;
		case 4:{
			$wd = thx__LocalDate_LocalDate_Impl_::get_dayOfWeek($this1);
			return $this1 - $wd;
		}break;
		case 5:{
			$tmp1 = thx__LocalDate_LocalDate_Impl_::getDatePart($this1, thx__LocalDate_LocalDate_Impl_::$DATE_PART_YEAR);
			$tmp2 = thx__LocalDate_LocalDate_Impl_::getDatePart($this1, thx__LocalDate_LocalDate_Impl_::$DATE_PART_MONTH);
			return thx__LocalDate_LocalDate_Impl_::create($tmp1, $tmp2, 1);
		}break;
		case 6:{
			$tmp3 = thx__LocalDate_LocalDate_Impl_::getDatePart($this1, thx__LocalDate_LocalDate_Impl_::$DATE_PART_YEAR);
			return thx__LocalDate_LocalDate_Impl_::create($tmp3, 1, 1);
		}break;
		}
	}
	static function snapTo($this1, $period) {
		$tmp = $period->index;
		switch($tmp) {
		case 0:case 1:case 2:case 3:{
			return $this1;
		}break;
		case 4:{
			$wd = thx__LocalDate_LocalDate_Impl_::get_dayOfWeek($this1);
			$mod = null;
			if($wd <= 3) {
				$mod = -$wd;
			} else {
				$mod = 7 - $wd;
			}
			$tmp1 = thx__LocalDate_LocalDate_Impl_::getDatePart($this1, thx__LocalDate_LocalDate_Impl_::$DATE_PART_YEAR);
			$tmp2 = thx__LocalDate_LocalDate_Impl_::getDatePart($this1, thx__LocalDate_LocalDate_Impl_::$DATE_PART_MONTH);
			$tmp3 = thx__LocalDate_LocalDate_Impl_::getDatePart($this1, thx__LocalDate_LocalDate_Impl_::$DATE_PART_DAY);
			return thx__LocalDate_LocalDate_Impl_::create($tmp1, $tmp2, $tmp3 + $mod);
		}break;
		case 5:{
			$mod1 = null;
			$tmp4 = thx__LocalDate_LocalDate_Impl_::getDatePart($this1, thx__LocalDate_LocalDate_Impl_::$DATE_PART_DAY);
			$tmp5 = thx__LocalDate_LocalDate_Impl_::getDatePart($this1, thx__LocalDate_LocalDate_Impl_::$DATE_PART_YEAR);
			$tmp6 = thx__LocalDate_LocalDate_Impl_::getDatePart($this1, thx__LocalDate_LocalDate_Impl_::$DATE_PART_MONTH);
			$tmp7 = Math::round(thx__DateTimeUtc_DateTimeUtc_Impl_::daysInMonth($tmp5, $tmp6) / 2);
			if($tmp4 > $tmp7) {
				$mod1 = 1;
			} else {
				$mod1 = 0;
			}
			$tmp8 = thx__LocalDate_LocalDate_Impl_::getDatePart($this1, thx__LocalDate_LocalDate_Impl_::$DATE_PART_YEAR);
			$tmp9 = thx__LocalDate_LocalDate_Impl_::getDatePart($this1, thx__LocalDate_LocalDate_Impl_::$DATE_PART_MONTH);
			return thx__LocalDate_LocalDate_Impl_::create($tmp8, $tmp9 + $mod1, 1);
		}break;
		case 6:{
			$mod2 = null;
			$tmp10 = thx__LocalDate_LocalDate_Impl_::getDatePart($this1, thx__LocalDate_LocalDate_Impl_::$DATE_PART_YEAR);
			$that = thx__LocalDate_LocalDate_Impl_::create($tmp10, 6, 2);
			if($this1 - $that > 0) {
				$mod2 = 1;
			} else {
				$mod2 = 0;
			}
			$tmp11 = thx__LocalDate_LocalDate_Impl_::getDatePart($this1, thx__LocalDate_LocalDate_Impl_::$DATE_PART_YEAR);
			return thx__LocalDate_LocalDate_Impl_::create($tmp11 + $mod2, 1, 1);
		}break;
		}
	}
	static function sameYear($this1, $other) {
		$tmp = thx__LocalDate_LocalDate_Impl_::getDatePart($this1, thx__LocalDate_LocalDate_Impl_::$DATE_PART_YEAR);
		$tmp1 = thx__LocalDate_LocalDate_Impl_::getDatePart($other, thx__LocalDate_LocalDate_Impl_::$DATE_PART_YEAR);
		return $tmp === $tmp1;
	}
	static function sameMonth($this1, $other) {
		$tmp = thx__LocalDate_LocalDate_Impl_::sameYear($this1, $other);
		if($tmp) {
			$tmp1 = thx__LocalDate_LocalDate_Impl_::getDatePart($this1, thx__LocalDate_LocalDate_Impl_::$DATE_PART_MONTH);
			$tmp2 = thx__LocalDate_LocalDate_Impl_::getDatePart($other, thx__LocalDate_LocalDate_Impl_::$DATE_PART_MONTH);
			return $tmp1 === $tmp2;
		} else {
			return false;
		}
	}
	static function withYear($this1, $year) {
		$tmp = thx__LocalDate_LocalDate_Impl_::getDatePart($this1, thx__LocalDate_LocalDate_Impl_::$DATE_PART_MONTH);
		$tmp1 = thx__LocalDate_LocalDate_Impl_::getDatePart($this1, thx__LocalDate_LocalDate_Impl_::$DATE_PART_DAY);
		return thx__LocalDate_LocalDate_Impl_::create($year, $tmp, $tmp1);
	}
	static function withMonth($this1, $month) {
		$tmp = thx__LocalDate_LocalDate_Impl_::getDatePart($this1, thx__LocalDate_LocalDate_Impl_::$DATE_PART_YEAR);
		$tmp1 = thx__LocalDate_LocalDate_Impl_::getDatePart($this1, thx__LocalDate_LocalDate_Impl_::$DATE_PART_DAY);
		return thx__LocalDate_LocalDate_Impl_::create($tmp, $month, $tmp1);
	}
	static function withDay($this1, $day) {
		$tmp = thx__LocalDate_LocalDate_Impl_::getDatePart($this1, thx__LocalDate_LocalDate_Impl_::$DATE_PART_YEAR);
		$tmp1 = thx__LocalDate_LocalDate_Impl_::getDatePart($this1, thx__LocalDate_LocalDate_Impl_::$DATE_PART_MONTH);
		return thx__LocalDate_LocalDate_Impl_::create($tmp, $tmp1, $day);
	}
	static function add($this1, $days) {
		return $this1 + $days;
	}
	static function subtract($this1, $days) {
		return $this1 - $days;
	}
	static function subtractDate($this1, $date) {
		return $this1 - $date;
	}
	static function addDays($this1, $days) {
		return $this1 + $days;
	}
	static function addMonths($this1, $months) {
		$tmp = thx__LocalDate_LocalDate_Impl_::getDatePart($this1, thx__LocalDate_LocalDate_Impl_::$DATE_PART_YEAR);
		$tmp1 = thx__LocalDate_LocalDate_Impl_::getDatePart($this1, thx__LocalDate_LocalDate_Impl_::$DATE_PART_MONTH);
		$tmp2 = $tmp1 + $months;
		$tmp3 = thx__LocalDate_LocalDate_Impl_::getDatePart($this1, thx__LocalDate_LocalDate_Impl_::$DATE_PART_DAY);
		return thx__LocalDate_LocalDate_Impl_::create($tmp, $tmp2, $tmp3);
	}
	static function addYears($this1, $years) {
		return thx__LocalDate_LocalDate_Impl_::addMonths($this1, $years * 12);
	}
	static function compareTo($this1, $other) {
		$tmp = null;
		if(null === $other) {
			$tmp = $this1 === null;
		} else {
			$tmp = false;
		}
		if($tmp) {
			return 0;
		}
		if(null === $this1) {
			return -1;
		} else {
			if(null === $other) {
				return 1;
			}
		}
		return $this1 - $other;
	}
	static function equalsTo($this1, $that) {
		return $this1 === $that;
	}
	static function equals($self, $that) {
		return $self === $that;
	}
	static function notEqualsTo($this1, $that) {
		return $this1 !== $that;
	}
	static function notEquals($self, $that) {
		return $self !== $that;
	}
	static function nearEqualsTo($this1, $other, $span) {
		$v = $other - $this1;
		$days = null;
		if($v < 0) {
			$days = -$v;
		} else {
			$days = $v;
		}
		$this2 = thx__Time_Time_Impl_::abs($span);
		$b = thx__DateTimeUtc_DateTimeUtc_Impl_::$ticksPerDayI64;
		$x = haxe__Int64_Int64_Impl_::divMod($this2, $b)->quotient;
		if($x->high !== $x->low >> 31) {
			throw new HException("Overflow");
		}
		return $days <= $x->low;
	}
	static function greaterThan($this1, $that) {
		return $this1 - $that > 0;
	}
	static function greater($self, $that) {
		return $self - $that > 0;
	}
	static function greaterEqualsTo($this1, $that) {
		return $this1 - $that >= 0;
	}
	static function greaterEquals($self, $that) {
		return $self - $that >= 0;
	}
	static function lessThan($this1, $that) {
		return $this1 - $that < 0;
	}
	static function less($self, $that) {
		return $self - $that < 0;
	}
	static function lessEqualsTo($this1, $that) {
		return $this1 - $that <= 0;
	}
	static function lessEquals($self, $that) {
		return $self - $that <= 0;
	}
	static function toDate($this1) {
		$tmp = thx__LocalDate_LocalDate_Impl_::getDatePart($this1, thx__LocalDate_LocalDate_Impl_::$DATE_PART_YEAR);
		$tmp1 = thx__LocalDate_LocalDate_Impl_::getDatePart($this1, thx__LocalDate_LocalDate_Impl_::$DATE_PART_MONTH);
		$tmp2 = $tmp1 - 1;
		$tmp3 = thx__LocalDate_LocalDate_Impl_::getDatePart($this1, thx__LocalDate_LocalDate_Impl_::$DATE_PART_DAY);
		return new Date($tmp, $tmp2, $tmp3, 0, 0, 0);
	}
	static function toString($this1) {
		if(null === $this1) {
			return "";
		}
		$this2 = null;
		if($this1 < 0) {
			$this2 = -$this1;
		} else {
			$this2 = $this1;
		}
		$abs = $this2;
		$isneg = $this1 < 0;
		$tmp = null;
		if($isneg) {
			$tmp = "-";
		} else {
			$tmp = "";
		}
		$tmp1 = thx__LocalDate_LocalDate_Impl_::getDatePart($abs, thx__LocalDate_LocalDate_Impl_::$DATE_PART_YEAR);
		$tmp2 = "" . _hx_string_rec($tmp1, "") . "-";
		$tmp3 = thx__LocalDate_LocalDate_Impl_::getDatePart($abs, thx__LocalDate_LocalDate_Impl_::$DATE_PART_MONTH);
		$tmp4 = thx_Ints::lpad($tmp3, "0", 2);
		$tmp5 = _hx_string_or_null($tmp2) . _hx_string_or_null($tmp4) . "-";
		$tmp6 = thx__LocalDate_LocalDate_Impl_::getDatePart($abs, thx__LocalDate_LocalDate_Impl_::$DATE_PART_DAY);
		$tmp7 = thx_Ints::lpad($tmp6, "0", 2);
		return _hx_string_or_null($tmp) . _hx_string_or_null((_hx_string_or_null($tmp5) . _hx_string_or_null($tmp7)));
	}
	static function get_days($this1) {
		return $this1;
	}
	static function get_year($this1) {
		return thx__LocalDate_LocalDate_Impl_::getDatePart($this1, thx__LocalDate_LocalDate_Impl_::$DATE_PART_YEAR);
	}
	static function get_month($this1) {
		return thx__LocalDate_LocalDate_Impl_::getDatePart($this1, thx__LocalDate_LocalDate_Impl_::$DATE_PART_MONTH);
	}
	static function get_day($this1) {
		return thx__LocalDate_LocalDate_Impl_::getDatePart($this1, thx__LocalDate_LocalDate_Impl_::$DATE_PART_DAY);
	}
	static function get_dayOfWeek($this1) {
		return _hx_mod(($this1 + 1), 7);
	}
	static function get_dayOfYear($this1) {
		return thx__LocalDate_LocalDate_Impl_::getDatePart($this1, thx__LocalDate_LocalDate_Impl_::$DATE_PART_DAY_OF_YEAR);
	}
	static function get_isInLeapYear($this1) {
		$tmp = thx__LocalDate_LocalDate_Impl_::getDatePart($this1, thx__LocalDate_LocalDate_Impl_::$DATE_PART_YEAR);
		return thx__DateTimeUtc_DateTimeUtc_Impl_::isLeapYear($tmp);
	}
	static function get_monthDays($this1) {
		$tmp = thx__LocalDate_LocalDate_Impl_::getDatePart($this1, thx__LocalDate_LocalDate_Impl_::$DATE_PART_YEAR);
		$tmp1 = thx__LocalDate_LocalDate_Impl_::getDatePart($this1, thx__LocalDate_LocalDate_Impl_::$DATE_PART_MONTH);
		return thx__DateTimeUtc_DateTimeUtc_Impl_::daysInMonth($tmp, $tmp1);
	}
	static function self($this1) {
		return $this1;
	}
	static $__properties__ = array("get_dayOfYear" => "get_dayOfYear","get_dayOfWeek" => "get_dayOfWeek","get_monthDays" => "get_monthDays","get_isInLeapYear" => "get_isInLeapYear","get_day" => "get_day","get_month" => "get_month","get_year" => "get_year","get_days" => "get_days");
	function __toString() { return 'thx._LocalDate.LocalDate_Impl_'; }
}
thx__LocalDate_LocalDate_Impl_::$millisPerMinute = thx__LocalDate_LocalDate_Impl_::$millisPerSecond * 60;
thx__LocalDate_LocalDate_Impl_::$millisPerHour = thx__LocalDate_LocalDate_Impl_::$millisPerMinute * 60;
thx__LocalDate_LocalDate_Impl_::$millisPerDay = thx__LocalDate_LocalDate_Impl_::$millisPerHour * 24;
thx__LocalDate_LocalDate_Impl_::$daysPer4Years = thx__LocalDate_LocalDate_Impl_::$daysPerYear * 4 + 1;
thx__LocalDate_LocalDate_Impl_::$daysPer100Years = thx__LocalDate_LocalDate_Impl_::$daysPer4Years * 25 - 1;
thx__LocalDate_LocalDate_Impl_::$daysPer400Years = thx__LocalDate_LocalDate_Impl_::$daysPer100Years * 4 + 1;
thx__LocalDate_LocalDate_Impl_::$unixEpochDays = thx__LocalDate_LocalDate_Impl_::$daysPer400Years * 4 + thx__LocalDate_LocalDate_Impl_::$daysPer100Years * 3 + thx__LocalDate_LocalDate_Impl_::$daysPer4Years * 17 + thx__LocalDate_LocalDate_Impl_::$daysPerYear;
thx__LocalDate_LocalDate_Impl_::$daysToMonth365 = (new _hx_array(array(0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365)));
thx__LocalDate_LocalDate_Impl_::$daysToMonth366 = (new _hx_array(array(0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335, 366)));
function thx__LocalDate_LocalDate_Impl__0(&$month, &$year) {
	{
		if($month === 0) {
			--$year;
			$month = 12;
		} else {
			if($month < 0) {
				$month = -$month;
				$years = Math::ceil($month / 12);
				$year -= $years;
				$month = $years * 12 - $month;
			} else {
				if($month > 12) {
					$years1 = Math::floor($month / 12);
					$year += $years1;
					$month -= $years1 * 12;
				}
			}
		}
	}
}