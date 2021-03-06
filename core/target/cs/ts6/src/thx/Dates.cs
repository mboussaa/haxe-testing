// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class Dates : global::haxe.lang.HxObject {
		
		public Dates(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public Dates() {
			global::thx.Dates.__hx_ctor_thx_Dates(this);
		}
		
		
		public static void __hx_ctor_thx_Dates(global::thx.Dates __temp_me83) {
		}
		
		
		public static int compare(global::Date a, global::Date b) {
			unchecked {
				double a1 = ( ((double) (((long) (( ((long) (global::System.TimeZone.CurrentTimeZone.ToUniversalTime(((global::System.DateTime) (a.date) )).Ticks) ) - ((long) (global::Date.epochTicks) ) )) )) ) / ((double) (global::System.TimeSpan.TicksPerMillisecond) ) );
				double b1 = ( ((double) (((long) (( ((long) (global::System.TimeZone.CurrentTimeZone.ToUniversalTime(((global::System.DateTime) (b.date) )).Ticks) ) - ((long) (global::Date.epochTicks) ) )) )) ) / ((double) (global::System.TimeSpan.TicksPerMillisecond) ) );
				if (( a1 < b1 )) {
					return -1;
				}
				else if (( a1 > b1 )) {
					return 1;
				}
				else {
					return 0;
				}
				
			}
		}
		
		
		public static global::Date create(int year, global::haxe.lang.Null<int> month, global::haxe.lang.Null<int> day, global::haxe.lang.Null<int> hour, global::haxe.lang.Null<int> minute, global::haxe.lang.Null<int> second) {
			unchecked {
				global::haxe.lang.Null<int> __temp_second80 = ( ( ! (second.hasValue) ) ? (new global::haxe.lang.Null<int>(0, true)) : (second) );
				global::haxe.lang.Null<int> __temp_minute79 = ( ( ! (minute.hasValue) ) ? (new global::haxe.lang.Null<int>(0, true)) : (minute) );
				global::haxe.lang.Null<int> __temp_hour78 = ( ( ! (hour.hasValue) ) ? (new global::haxe.lang.Null<int>(0, true)) : (hour) );
				global::haxe.lang.Null<int> __temp_day77 = ( ( ! (day.hasValue) ) ? (new global::haxe.lang.Null<int>(1, true)) : (day) );
				global::haxe.lang.Null<int> __temp_month76 = ( ( ! (month.hasValue) ) ? (new global::haxe.lang.Null<int>(0, true)) : (month) );
				__temp_minute79 = new global::haxe.lang.Null<int>(( (__temp_minute79).@value + ((int) (global::System.Math.Floor(((double) (( ((double) ((__temp_second80).@value) ) / 60 )) ))) ) ), true);
				__temp_second80 = new global::haxe.lang.Null<int>(((int) (( (__temp_second80).@value % (new global::haxe.lang.Null<int>(60, true)).@value )) ), true);
				if (( (__temp_second80).@value < 0 )) {
					__temp_second80 = new global::haxe.lang.Null<int>(( (__temp_second80).@value + 60 ), true);
				}
				
				__temp_hour78 = new global::haxe.lang.Null<int>(( (__temp_hour78).@value + ((int) (global::System.Math.Floor(((double) (( ((double) ((__temp_minute79).@value) ) / 60 )) ))) ) ), true);
				__temp_minute79 = new global::haxe.lang.Null<int>(((int) (( (__temp_minute79).@value % (new global::haxe.lang.Null<int>(60, true)).@value )) ), true);
				if (( (__temp_minute79).@value < 0 )) {
					__temp_minute79 = new global::haxe.lang.Null<int>(( (__temp_minute79).@value + 60 ), true);
				}
				
				__temp_day77 = new global::haxe.lang.Null<int>(( (__temp_day77).@value + ((int) (global::System.Math.Floor(((double) (( ((double) ((__temp_hour78).@value) ) / 24 )) ))) ) ), true);
				__temp_hour78 = new global::haxe.lang.Null<int>(((int) (( (__temp_hour78).@value % (new global::haxe.lang.Null<int>(24, true)).@value )) ), true);
				if (( (__temp_hour78).@value < 0 )) {
					__temp_hour78 = new global::haxe.lang.Null<int>(( (__temp_hour78).@value + 24 ), true);
				}
				
				if (global::haxe.lang.Runtime.eq((__temp_day77).toDynamic(), 0)) {
					{
						__temp_month76 = new global::haxe.lang.Null<int>(( (__temp_month76).@value - 1 ), true);
					}
					
					if (( (__temp_month76).@value < 0 )) {
						__temp_month76 = new global::haxe.lang.Null<int>(11, true);
						 -- year;
					}
					
					__temp_day77 = new global::haxe.lang.Null<int>(global::thx.Dates.daysInMonth(year, (__temp_month76).@value), true);
				}
				
				year += ((int) (global::System.Math.Floor(((double) (( ((double) ((__temp_month76).@value) ) / 12 )) ))) );
				__temp_month76 = new global::haxe.lang.Null<int>(((int) (( (__temp_month76).@value % (new global::haxe.lang.Null<int>(12, true)).@value )) ), true);
				if (( (__temp_month76).@value < 0 )) {
					__temp_month76 = new global::haxe.lang.Null<int>(( (__temp_month76).@value + 12 ), true);
				}
				
				int days = global::thx.Dates.daysInMonth(year, (__temp_month76).@value);
				while (( (__temp_day77).@value > days )) {
					if (( (__temp_day77).@value > days )) {
						__temp_day77 = new global::haxe.lang.Null<int>(((int) (( (__temp_day77).@value - (new global::haxe.lang.Null<int>(days, true)).@value )) ), true);
						{
							__temp_month76 = new global::haxe.lang.Null<int>(( (__temp_month76).@value + 1 ), true);
						}
						
					}
					
					if (( (__temp_month76).@value > 11 )) {
						__temp_month76 = new global::haxe.lang.Null<int>(((int) (( (__temp_month76).@value - (new global::haxe.lang.Null<int>(12, true)).@value )) ), true);
						 ++ year;
					}
					
					days = global::thx.Dates.daysInMonth(year, (__temp_month76).@value);
				}
				
				return new global::Date(year, (__temp_month76).@value, (__temp_day77).@value, (__temp_hour78).@value, (__temp_minute79).@value, (__temp_second80).@value);
			}
		}
		
		
		public static global::Array<object> daysRange(global::Date start, global::Date end) {
			unchecked {
				if (( global::thx.Dates.compare(end, start) < 0 )) {
					return new global::Array<object>(new object[]{});
				}
				
				global::Array<object> days = new global::Array<object>(new object[]{});
				while ( ! (global::thx.Dates.sameDay(start, end)) ) {
					days.push(start);
					start = global::thx.Dates.jump(start, global::thx.TimePeriod.Day, 1);
				}
				
				days.push(end);
				return days;
			}
		}
		
		
		public static bool @equals(global::Date self, global::Date other) {
			return ( ( ((double) (((long) (( ((long) (global::System.TimeZone.CurrentTimeZone.ToUniversalTime(((global::System.DateTime) (self.date) )).Ticks) ) - ((long) (global::Date.epochTicks) ) )) )) ) / ((double) (global::System.TimeSpan.TicksPerMillisecond) ) ) == ( ((double) (((long) (( ((long) (global::System.TimeZone.CurrentTimeZone.ToUniversalTime(((global::System.DateTime) (other.date) )).Ticks) ) - ((long) (global::Date.epochTicks) ) )) )) ) / ((double) (global::System.TimeSpan.TicksPerMillisecond) ) ) );
		}
		
		
		public static bool nearEquals(global::Date self, global::Date other, global::haxe.lang.Null<int> units, global::thx.TimePeriod period) {
			unchecked {
				global::haxe.lang.Null<int> __temp_units81 = ( ( ! (units.hasValue) ) ? (new global::haxe.lang.Null<int>(1, true)) : (units) );
				if (( null == period )) {
					period = global::thx.TimePeriod.Second;
				}
				
				if (( (__temp_units81).@value < 0 )) {
					__temp_units81 = new global::haxe.lang.Null<int>(( - ((__temp_units81).@value) ), true);
				}
				
				global::Date min = global::thx.Dates.jump(self, period, ( - ((__temp_units81).@value) ));
				global::Date max = global::thx.Dates.jump(self, period, (__temp_units81).@value);
				if (( global::thx.Dates.compare(min, other) <= 0 )) {
					return ( global::thx.Dates.compare(max, other) >= 0 );
				}
				else {
					return false;
				}
				
			}
		}
		
		
		public static bool greater(global::Date self, global::Date other) {
			return ( global::thx.Dates.compare(self, other) > 0 );
		}
		
		
		public static bool more(global::Date self, global::Date other) {
			return ( global::thx.Dates.compare(self, other) > 0 );
		}
		
		
		public static bool less(global::Date self, global::Date other) {
			return ( global::thx.Dates.compare(self, other) < 0 );
		}
		
		
		public static bool greaterEquals(global::Date self, global::Date other) {
			return ( global::thx.Dates.compare(self, other) >= 0 );
		}
		
		
		public static bool moreEqual(global::Date self, global::Date other) {
			return ( global::thx.Dates.compare(self, other) >= 0 );
		}
		
		
		public static bool lessEquals(global::Date self, global::Date other) {
			return ( global::thx.Dates.compare(self, other) <= 0 );
		}
		
		
		public static bool lessEqual(global::Date self, global::Date other) {
			return ( global::thx.Dates.compare(self, other) <= 0 );
		}
		
		
		public static bool isLeapYear(int year) {
			unchecked {
				if (( ( year % 4 ) != 0 )) {
					return false;
				}
				
				if (( ( year % 100 ) == 0 )) {
					return ( ( year % 400 ) == 0 );
				}
				
				return true;
			}
		}
		
		
		public static bool isInLeapYear(global::Date d) {
			return global::thx.Dates.isLeapYear(d.date.Year);
		}
		
		
		public static int daysInMonth(int year, int month) {
			unchecked {
				switch (month) {
					case 1:
					{
						if (global::thx.Dates.isLeapYear(year)) {
							return 29;
						}
						else {
							return 28;
						}
						
					}
					
					
					case 0:
					case 2:
					case 4:
					case 6:
					case 7:
					case 9:
					case 11:
					{
						return 31;
					}
					
					
					case 3:
					case 5:
					case 8:
					case 10:
					{
						return 30;
					}
					
					
					default:
					{
						throw global::haxe.lang.HaxeException.wrap(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("Invalid month \"", global::haxe.lang.Runtime.toString(month)), "\".  Month should be a number, Jan=0, Dec=11"));
					}
					
				}
				
			}
		}
		
		
		public static int numDaysInMonth(int month, int year) {
			return global::thx.Dates.daysInMonth(year, month);
		}
		
		
		public static int daysInThisMonth(global::Date d) {
			unchecked {
				return global::thx.Dates.daysInMonth(d.date.Year, ( d.date.Month - 1 ));
			}
		}
		
		
		public static int numDaysInThisMonth(global::Date d) {
			return global::thx.Dates.daysInThisMonth(d);
		}
		
		
		public static bool sameYear(global::Date self, global::Date other) {
			return ( self.date.Year == other.date.Year );
		}
		
		
		public static bool sameMonth(global::Date self, global::Date other) {
			unchecked {
				if (global::thx.Dates.sameYear(self, other)) {
					return ( ( self.date.Month - 1 ) == ( other.date.Month - 1 ) );
				}
				else {
					return false;
				}
				
			}
		}
		
		
		public static bool sameDay(global::Date self, global::Date other) {
			if (global::thx.Dates.sameMonth(self, other)) {
				return ( self.date.Day == other.date.Day );
			}
			else {
				return false;
			}
			
		}
		
		
		public static bool sameHour(global::Date self, global::Date other) {
			if (global::thx.Dates.sameDay(self, other)) {
				return ( self.date.Hour == other.date.Hour );
			}
			else {
				return false;
			}
			
		}
		
		
		public static bool sameMinute(global::Date self, global::Date other) {
			if (global::thx.Dates.sameHour(self, other)) {
				return ( self.date.Minute == other.date.Minute );
			}
			else {
				return false;
			}
			
		}
		
		
		public static global::Date snapNext(global::Date date, global::thx.TimePeriod period) {
			double this1 = global::thx._Timestamp.Timestamp_Impl_.snapNext(((double) (( ((double) (((long) (( ((long) (global::System.TimeZone.CurrentTimeZone.ToUniversalTime(((global::System.DateTime) (date.date) )).Ticks) ) - ((long) (global::Date.epochTicks) ) )) )) ) / ((double) (global::System.TimeSpan.TicksPerMillisecond) ) )) ), period);
			return new global::Date(((global::System.DateTime) (global::System.TimeZone.CurrentTimeZone.ToLocalTime(((global::System.DateTime) (new global::System.DateTime(((long) (( ((long) (( ((double) (this1) ) * ((double) (global::System.TimeSpan.TicksPerMillisecond) ) )) ) + ((long) (global::Date.epochTicks) ) )) ))) ))) ));
		}
		
		
		public static global::Date snapPrev(global::Date date, global::thx.TimePeriod period) {
			double this1 = global::thx._Timestamp.Timestamp_Impl_.snapPrev(((double) (( ((double) (((long) (( ((long) (global::System.TimeZone.CurrentTimeZone.ToUniversalTime(((global::System.DateTime) (date.date) )).Ticks) ) - ((long) (global::Date.epochTicks) ) )) )) ) / ((double) (global::System.TimeSpan.TicksPerMillisecond) ) )) ), period);
			return new global::Date(((global::System.DateTime) (global::System.TimeZone.CurrentTimeZone.ToLocalTime(((global::System.DateTime) (new global::System.DateTime(((long) (( ((long) (( ((double) (this1) ) * ((double) (global::System.TimeSpan.TicksPerMillisecond) ) )) ) + ((long) (global::Date.epochTicks) ) )) ))) ))) ));
		}
		
		
		public static global::Date snapTo(global::Date date, global::thx.TimePeriod period) {
			double this1 = global::thx._Timestamp.Timestamp_Impl_.snapTo(((double) (( ((double) (((long) (( ((long) (global::System.TimeZone.CurrentTimeZone.ToUniversalTime(((global::System.DateTime) (date.date) )).Ticks) ) - ((long) (global::Date.epochTicks) ) )) )) ) / ((double) (global::System.TimeSpan.TicksPerMillisecond) ) )) ), period);
			return new global::Date(((global::System.DateTime) (global::System.TimeZone.CurrentTimeZone.ToLocalTime(((global::System.DateTime) (new global::System.DateTime(((long) (( ((long) (( ((double) (this1) ) * ((double) (global::System.TimeSpan.TicksPerMillisecond) ) )) ) + ((long) (global::Date.epochTicks) ) )) ))) ))) ));
		}
		
		
		public static global::Date jump(global::Date date, global::thx.TimePeriod period, int amount) {
			unchecked {
				int sec = date.date.Second;
				int min = date.date.Minute;
				int hour = date.date.Hour;
				int day = date.date.Day;
				int month = ( date.date.Month - 1 );
				int year = date.date.Year;
				switch (period.index) {
					case 0:
					{
						sec += amount;
						break;
					}
					
					
					case 1:
					{
						min += amount;
						break;
					}
					
					
					case 2:
					{
						hour += amount;
						break;
					}
					
					
					case 3:
					{
						day += amount;
						break;
					}
					
					
					case 4:
					{
						day += ( amount * 7 );
						break;
					}
					
					
					case 5:
					{
						month += amount;
						break;
					}
					
					
					case 6:
					{
						year += amount;
						break;
					}
					
					
				}
				
				return global::thx.Dates.create(year, new global::haxe.lang.Null<int>(month, true), new global::haxe.lang.Null<int>(day, true), new global::haxe.lang.Null<int>(hour, true), new global::haxe.lang.Null<int>(min, true), new global::haxe.lang.Null<int>(sec, true));
			}
		}
		
		
		public static global::Date max(global::Date self, global::Date other) {
			if (( ( ((double) (((long) (( ((long) (global::System.TimeZone.CurrentTimeZone.ToUniversalTime(((global::System.DateTime) (self.date) )).Ticks) ) - ((long) (global::Date.epochTicks) ) )) )) ) / ((double) (global::System.TimeSpan.TicksPerMillisecond) ) ) > ( ((double) (((long) (( ((long) (global::System.TimeZone.CurrentTimeZone.ToUniversalTime(((global::System.DateTime) (other.date) )).Ticks) ) - ((long) (global::Date.epochTicks) ) )) )) ) / ((double) (global::System.TimeSpan.TicksPerMillisecond) ) ) )) {
				return self;
			}
			else {
				return other;
			}
			
		}
		
		
		public static global::Date min(global::Date self, global::Date other) {
			if (( ( ((double) (((long) (( ((long) (global::System.TimeZone.CurrentTimeZone.ToUniversalTime(((global::System.DateTime) (self.date) )).Ticks) ) - ((long) (global::Date.epochTicks) ) )) )) ) / ((double) (global::System.TimeSpan.TicksPerMillisecond) ) ) < ( ((double) (((long) (( ((long) (global::System.TimeZone.CurrentTimeZone.ToUniversalTime(((global::System.DateTime) (other.date) )).Ticks) ) - ((long) (global::Date.epochTicks) ) )) )) ) / ((double) (global::System.TimeSpan.TicksPerMillisecond) ) ) )) {
				return self;
			}
			else {
				return other;
			}
			
		}
		
		
		public static global::Date snapToWeekDay(global::Date date, int day, global::haxe.lang.Null<int> firstDayOfWk) {
			unchecked {
				global::haxe.lang.Null<int> __temp_firstDayOfWk82 = ( ( ! (firstDayOfWk.hasValue) ) ? (new global::haxe.lang.Null<int>(0, true)) : (firstDayOfWk) );
				int d = ((int) (global::haxe.lang.Runtime.toInt(((object) (date.date.DayOfWeek) ))) );
				int s = day;
				if (( s < (__temp_firstDayOfWk82).@value )) {
					s += 7;
				}
				
				if (( d < (__temp_firstDayOfWk82).@value )) {
					d += 7;
				}
				
				return global::thx.Dates.jump(date, global::thx.TimePeriod.Day, ( s - d ));
			}
		}
		
		
		public static global::Date snapNextWeekDay(global::Date date, int day) {
			unchecked {
				int d = ((int) (global::haxe.lang.Runtime.toInt(((object) (date.date.DayOfWeek) ))) );
				int s = day;
				if (( s < d )) {
					s += 7;
				}
				
				return global::thx.Dates.jump(date, global::thx.TimePeriod.Day, ( s - d ));
			}
		}
		
		
		public static global::Date snapPrevWeekDay(global::Date date, int day) {
			unchecked {
				int d = ((int) (global::haxe.lang.Runtime.toInt(((object) (date.date.DayOfWeek) ))) );
				int s = day;
				if (( s > d )) {
					s -= 7;
				}
				
				return global::thx.Dates.jump(date, global::thx.TimePeriod.Day, ( s - d ));
			}
		}
		
		
		public static global::Date prevYear(global::Date d) {
			unchecked {
				return global::thx.Dates.jump(d, global::thx.TimePeriod.Year, -1);
			}
		}
		
		
		public static global::Date nextYear(global::Date d) {
			unchecked {
				return global::thx.Dates.jump(d, global::thx.TimePeriod.Year, 1);
			}
		}
		
		
		public static global::Date prevMonth(global::Date d) {
			unchecked {
				return global::thx.Dates.jump(d, global::thx.TimePeriod.Month, -1);
			}
		}
		
		
		public static global::Date nextMonth(global::Date d) {
			unchecked {
				return global::thx.Dates.jump(d, global::thx.TimePeriod.Month, 1);
			}
		}
		
		
		public static global::Date prevWeek(global::Date d) {
			unchecked {
				return global::thx.Dates.jump(d, global::thx.TimePeriod.Week, -1);
			}
		}
		
		
		public static global::Date nextWeek(global::Date d) {
			unchecked {
				return global::thx.Dates.jump(d, global::thx.TimePeriod.Week, 1);
			}
		}
		
		
		public static global::Date prevDay(global::Date d) {
			unchecked {
				return global::thx.Dates.jump(d, global::thx.TimePeriod.Day, -1);
			}
		}
		
		
		public static global::Date nextDay(global::Date d) {
			unchecked {
				return global::thx.Dates.jump(d, global::thx.TimePeriod.Day, 1);
			}
		}
		
		
		public static global::Date prevHour(global::Date d) {
			unchecked {
				return global::thx.Dates.jump(d, global::thx.TimePeriod.Hour, -1);
			}
		}
		
		
		public static global::Date nextHour(global::Date d) {
			unchecked {
				return global::thx.Dates.jump(d, global::thx.TimePeriod.Hour, 1);
			}
		}
		
		
		public static global::Date prevMinute(global::Date d) {
			unchecked {
				return global::thx.Dates.jump(d, global::thx.TimePeriod.Minute, -1);
			}
		}
		
		
		public static global::Date nextMinute(global::Date d) {
			unchecked {
				return global::thx.Dates.jump(d, global::thx.TimePeriod.Minute, 1);
			}
		}
		
		
		public static global::Date prevSecond(global::Date d) {
			unchecked {
				return global::thx.Dates.jump(d, global::thx.TimePeriod.Second, -1);
			}
		}
		
		
		public static global::Date nextSecond(global::Date d) {
			unchecked {
				return global::thx.Dates.jump(d, global::thx.TimePeriod.Second, 1);
			}
		}
		
		
		public static global::Date withYear(global::Date date, int year) {
			unchecked {
				return global::thx.Dates.create(year, new global::haxe.lang.Null<int>(( date.date.Month - 1 ), true), new global::haxe.lang.Null<int>(date.date.Day, true), new global::haxe.lang.Null<int>(date.date.Hour, true), new global::haxe.lang.Null<int>(date.date.Minute, true), new global::haxe.lang.Null<int>(date.date.Second, true));
			}
		}
		
		
		public static global::Date withMonth(global::Date date, int month) {
			return global::thx.Dates.create(date.date.Year, new global::haxe.lang.Null<int>(month, true), new global::haxe.lang.Null<int>(date.date.Day, true), new global::haxe.lang.Null<int>(date.date.Hour, true), new global::haxe.lang.Null<int>(date.date.Minute, true), new global::haxe.lang.Null<int>(date.date.Second, true));
		}
		
		
		public static global::Date withDay(global::Date date, int day) {
			unchecked {
				return global::thx.Dates.create(date.date.Year, new global::haxe.lang.Null<int>(( date.date.Month - 1 ), true), new global::haxe.lang.Null<int>(day, true), new global::haxe.lang.Null<int>(date.date.Hour, true), new global::haxe.lang.Null<int>(date.date.Minute, true), new global::haxe.lang.Null<int>(date.date.Second, true));
			}
		}
		
		
		public static global::Date withHour(global::Date date, int hour) {
			unchecked {
				return global::thx.Dates.create(date.date.Year, new global::haxe.lang.Null<int>(( date.date.Month - 1 ), true), new global::haxe.lang.Null<int>(date.date.Day, true), new global::haxe.lang.Null<int>(hour, true), new global::haxe.lang.Null<int>(date.date.Minute, true), new global::haxe.lang.Null<int>(date.date.Second, true));
			}
		}
		
		
		public static global::Date withMinute(global::Date date, int minute) {
			unchecked {
				return global::thx.Dates.create(date.date.Year, new global::haxe.lang.Null<int>(( date.date.Month - 1 ), true), new global::haxe.lang.Null<int>(date.date.Day, true), new global::haxe.lang.Null<int>(date.date.Hour, true), new global::haxe.lang.Null<int>(minute, true), new global::haxe.lang.Null<int>(date.date.Second, true));
			}
		}
		
		
		public static global::Date withSecond(global::Date date, int second) {
			unchecked {
				return global::thx.Dates.create(date.date.Year, new global::haxe.lang.Null<int>(( date.date.Month - 1 ), true), new global::haxe.lang.Null<int>(date.date.Day, true), new global::haxe.lang.Null<int>(date.date.Hour, true), new global::haxe.lang.Null<int>(date.date.Minute, true), new global::haxe.lang.Null<int>(second, true));
			}
		}
		
		
		public static global::thx.Either parseDate(string s) {
			try {
				return global::thx.Either.Right(global::Date.fromString(s));
			}
			catch (global::System.Exception __temp_catchallException1){
				global::haxe.lang.Exceptions.exception = __temp_catchallException1;
				object __temp_catchall2 = __temp_catchallException1;
				if (( __temp_catchall2 is global::haxe.lang.HaxeException )) {
					__temp_catchall2 = ((global::haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
				}
				
				{
					object e = __temp_catchall2;
					return global::thx.Either.Left(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("", s), " could not be parsed to a valid Date value."));
				}
				
			}
			
			
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::thx.Dates(global::haxe.lang.EmptyObject.EMPTY);
		}
		
		
		public static new object __hx_create(global::Array arr) {
			return new global::thx.Dates();
		}
		
		
	}
}


