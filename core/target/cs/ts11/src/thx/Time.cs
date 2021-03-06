// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx._Time {
	public sealed class Time_Impl_ {
		
		static Time_Impl_() {
			unchecked {
				global::thx._Time.Time_Impl_.zero = ((long) (0) );
				global::thx._Time.Time_Impl_.oneDay = ((long) (24) );
			}
		}
		
		
		public static long zero;
		
		public static long oneDay;
		
		public static long fromDays(int days) {
			unchecked {
				return global::thx._Time.Time_Impl_.create(( 24 * days ), new global::haxe.lang.Null<int>(0, true), new global::haxe.lang.Null<int>(0, true), new global::haxe.lang.Null<int>(0, true));
			}
		}
		
		
		public static long fromHours(int hours) {
			return global::thx._Time.Time_Impl_.create(hours, new global::haxe.lang.Null<int>(0, true), new global::haxe.lang.Null<int>(0, true), new global::haxe.lang.Null<int>(0, true));
		}
		
		
		public static long fromMinutes(int minutes) {
			return global::thx._Time.Time_Impl_.create(0, new global::haxe.lang.Null<int>(minutes, true), new global::haxe.lang.Null<int>(0, true), new global::haxe.lang.Null<int>(0, true));
		}
		
		
		public static long fromSeconds(int seconds) {
			return global::thx._Time.Time_Impl_.create(0, new global::haxe.lang.Null<int>(0, true), new global::haxe.lang.Null<int>(seconds, true), new global::haxe.lang.Null<int>(0, true));
		}
		
		
		public static long fromMilliseconds(int milliseconds) {
			return global::thx._Time.Time_Impl_.create(0, new global::haxe.lang.Null<int>(0, true), new global::haxe.lang.Null<int>(0, true), new global::haxe.lang.Null<int>(milliseconds, true));
		}
		
		
		public static long timeToTicks(int hours, int minutes, int seconds) {
			unchecked {
				return ((long) (( (((long) (( ((long) (( ((long) (( hours * 3600 )) ) + ((long) (( minutes * 60 )) ) )) ) + ((long) (seconds) ) )) )) * ((long) (global::thx._DateTimeUtc.DateTimeUtc_Impl_.ticksPerSecondI64) ) )) );
			}
		}
		
		
		public static long fromString(string s) {
			unchecked {
				global::EReg pattern = new global::EReg("^([-+])?(?:(\\d+)[.](\\d{1,2})|(\\d+))[:](\\d{2})(?:[:](\\d{2})(?:\\.(\\d+))?)?$", "");
				if ( ! (pattern.match(s)) ) {
					throw global::haxe.lang.HaxeException.wrap(new global::thx.Error(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("unable to parse Time string: \"", s), "\""), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"fromString", "thx._Time.Time_Impl_", "Time.hx"}, new int[]{1981972957}, new double[]{((double) (32) )})));
				}
				
				string smticks = pattern.matched(7);
				int mticks = 0;
				if ( ! (string.Equals(null, smticks)) ) {
					smticks = global::haxe.lang.Runtime.concat("1", global::haxe.lang.StringExt.substring(global::thx.Strings.rpad(smticks, "0", 7), 0, new global::haxe.lang.Null<int>(7, true)));
					mticks = ( (global::Std.parseInt(smticks)).@value - 10000000 );
				}
				
				int days = 0;
				int hours = 0;
				global::haxe.lang.Null<int> minutes = global::Std.parseInt(pattern.matched(5));
				global::haxe.lang.Null<int> seconds = global::Std.parseInt(pattern.matched(6));
				if ( ! (string.Equals(null, pattern.matched(2))) ) {
					days = (global::Std.parseInt(pattern.matched(2))).@value;
					hours = (global::Std.parseInt(pattern.matched(3))).@value;
				}
				else {
					hours = (global::Std.parseInt(pattern.matched(4))).@value;
				}
				
				long time = ((long) (( ((long) (global::thx._Time.Time_Impl_.create(( ( days * 24 ) + hours ), minutes, seconds, default(global::haxe.lang.Null<int>))) ) + ((long) (mticks) ) )) );
				if (string.Equals(pattern.matched(1), "-")) {
					return ((long) (global::haxe._Int64.Int64_Impl_.neg(((long) (time) ))) );
				}
				else {
					return time;
				}
				
			}
		}
		
		
		public static int compare(long a, long b) {
			return global::thx.Int64s.compare(((long) (a) ), ((long) (b) ));
		}
		
		
		public static long create(int hours, global::haxe.lang.Null<int> minutes, global::haxe.lang.Null<int> seconds, global::haxe.lang.Null<int> milliseconds) {
			global::haxe.lang.Null<int> __temp_milliseconds145 = ( ( ! (milliseconds.hasValue) ) ? (new global::haxe.lang.Null<int>(0, true)) : (milliseconds) );
			global::haxe.lang.Null<int> __temp_seconds144 = ( ( ! (seconds.hasValue) ) ? (new global::haxe.lang.Null<int>(0, true)) : (seconds) );
			global::haxe.lang.Null<int> __temp_minutes143 = ( ( ! (minutes.hasValue) ) ? (new global::haxe.lang.Null<int>(0, true)) : (minutes) );
			return ((long) (( ((long) (global::thx._Time.Time_Impl_.timeToTicks(hours, (__temp_minutes143).@value, (__temp_seconds144).@value)) ) + ((long) (( ((long) ((__temp_milliseconds145).@value) ) * ((long) (global::thx._DateTimeUtc.DateTimeUtc_Impl_.ticksPerMillisecondI64) ) )) ) )) );
		}
		
		
		public static long createDays(int days, global::haxe.lang.Null<int> hours, global::haxe.lang.Null<int> minutes, global::haxe.lang.Null<int> seconds, global::haxe.lang.Null<int> milliseconds) {
			unchecked {
				global::haxe.lang.Null<int> __temp_milliseconds149 = ( ( ! (milliseconds.hasValue) ) ? (new global::haxe.lang.Null<int>(0, true)) : (milliseconds) );
				global::haxe.lang.Null<int> __temp_seconds148 = ( ( ! (seconds.hasValue) ) ? (new global::haxe.lang.Null<int>(0, true)) : (seconds) );
				global::haxe.lang.Null<int> __temp_minutes147 = ( ( ! (minutes.hasValue) ) ? (new global::haxe.lang.Null<int>(0, true)) : (minutes) );
				global::haxe.lang.Null<int> __temp_hours146 = ( ( ! (hours.hasValue) ) ? (new global::haxe.lang.Null<int>(0, true)) : (hours) );
				return global::thx._Time.Time_Impl_.create(( ( days * 24 ) + (__temp_hours146).@value ), __temp_minutes147, __temp_seconds148, __temp_milliseconds149);
			}
		}
		
		
		public static long _new(long ticks) {
			return ((long) (ticks) );
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		public static long abs(long this1) {
			if (((bool) (( ((long) (this1) ) < ((long) (0) ) )) )) {
				return ((long) (global::haxe._Int64.Int64_Impl_.neg(((long) (this1) ))) );
			}
			else {
				return ((long) (this1) );
			}
			
		}
		
		
		public static long withHours(long this1, int hours) {
			unchecked {
				long x = ((long) (( ((long) (( ((long) (this1) ) / ((long) (global::thx._DateTimeUtc.DateTimeUtc_Impl_.ticksPerMinuteI64) ) )) ) % ((long) (60) ) )) );
				if (( ((bool) (( ((long) (x) ) < -2147483648 )) ) || ((bool) (( ((long) (x) ) > 2147483647 )) ) )) {
					throw global::haxe.lang.HaxeException.wrap("Overflow");
				}
				
				int tmp = ((int) (((long) (x) )) );
				long x1 = ((long) (( ((long) (( ((long) (this1) ) / ((long) (global::thx._DateTimeUtc.DateTimeUtc_Impl_.ticksPerSecondI64) ) )) ) % ((long) (60) ) )) );
				if (( ((bool) (( ((long) (x1) ) < -2147483648 )) ) || ((bool) (( ((long) (x1) ) > 2147483647 )) ) )) {
					throw global::haxe.lang.HaxeException.wrap("Overflow");
				}
				
				int tmp1 = ((int) (((long) (x1) )) );
				long x2 = ((long) (( ((long) (( ((long) (this1) ) / ((long) (global::thx._DateTimeUtc.DateTimeUtc_Impl_.ticksPerMillisecondI64) ) )) ) % ((long) (global::thx._DateTimeUtc.DateTimeUtc_Impl_.thousandI64) ) )) );
				if (( ((bool) (( ((long) (x2) ) < -2147483648 )) ) || ((bool) (( ((long) (x2) ) > 2147483647 )) ) )) {
					throw global::haxe.lang.HaxeException.wrap("Overflow");
				}
				
				return global::thx._Time.Time_Impl_.create(hours, new global::haxe.lang.Null<int>(tmp, true), new global::haxe.lang.Null<int>(tmp1, true), new global::haxe.lang.Null<int>(((int) (((long) (x2) )) ), true));
			}
		}
		
		
		public static long withMinutes(long this1, int minutes) {
			unchecked {
				long x = ((long) (( ((long) (( ((long) (this1) ) / ((long) (global::thx._DateTimeUtc.DateTimeUtc_Impl_.ticksPerHourI64) ) )) ) % ((long) (24) ) )) );
				if (( ((bool) (( ((long) (x) ) < -2147483648 )) ) || ((bool) (( ((long) (x) ) > 2147483647 )) ) )) {
					throw global::haxe.lang.HaxeException.wrap("Overflow");
				}
				
				int tmp = ((int) (((long) (x) )) );
				long x1 = ((long) (( ((long) (( ((long) (this1) ) / ((long) (global::thx._DateTimeUtc.DateTimeUtc_Impl_.ticksPerSecondI64) ) )) ) % ((long) (60) ) )) );
				if (( ((bool) (( ((long) (x1) ) < -2147483648 )) ) || ((bool) (( ((long) (x1) ) > 2147483647 )) ) )) {
					throw global::haxe.lang.HaxeException.wrap("Overflow");
				}
				
				int tmp1 = ((int) (((long) (x1) )) );
				long x2 = ((long) (( ((long) (( ((long) (this1) ) / ((long) (global::thx._DateTimeUtc.DateTimeUtc_Impl_.ticksPerMillisecondI64) ) )) ) % ((long) (global::thx._DateTimeUtc.DateTimeUtc_Impl_.thousandI64) ) )) );
				if (( ((bool) (( ((long) (x2) ) < -2147483648 )) ) || ((bool) (( ((long) (x2) ) > 2147483647 )) ) )) {
					throw global::haxe.lang.HaxeException.wrap("Overflow");
				}
				
				return global::thx._Time.Time_Impl_.create(tmp, new global::haxe.lang.Null<int>(minutes, true), new global::haxe.lang.Null<int>(tmp1, true), new global::haxe.lang.Null<int>(((int) (((long) (x2) )) ), true));
			}
		}
		
		
		public static long withSeconds(long this1, int seconds) {
			unchecked {
				long x = ((long) (( ((long) (( ((long) (this1) ) / ((long) (global::thx._DateTimeUtc.DateTimeUtc_Impl_.ticksPerHourI64) ) )) ) % ((long) (24) ) )) );
				if (( ((bool) (( ((long) (x) ) < -2147483648 )) ) || ((bool) (( ((long) (x) ) > 2147483647 )) ) )) {
					throw global::haxe.lang.HaxeException.wrap("Overflow");
				}
				
				int tmp = ((int) (((long) (x) )) );
				long x1 = ((long) (( ((long) (( ((long) (this1) ) / ((long) (global::thx._DateTimeUtc.DateTimeUtc_Impl_.ticksPerMinuteI64) ) )) ) % ((long) (60) ) )) );
				if (( ((bool) (( ((long) (x1) ) < -2147483648 )) ) || ((bool) (( ((long) (x1) ) > 2147483647 )) ) )) {
					throw global::haxe.lang.HaxeException.wrap("Overflow");
				}
				
				int tmp1 = ((int) (((long) (x1) )) );
				long x2 = ((long) (( ((long) (( ((long) (this1) ) / ((long) (global::thx._DateTimeUtc.DateTimeUtc_Impl_.ticksPerMillisecondI64) ) )) ) % ((long) (global::thx._DateTimeUtc.DateTimeUtc_Impl_.thousandI64) ) )) );
				if (( ((bool) (( ((long) (x2) ) < -2147483648 )) ) || ((bool) (( ((long) (x2) ) > 2147483647 )) ) )) {
					throw global::haxe.lang.HaxeException.wrap("Overflow");
				}
				
				return global::thx._Time.Time_Impl_.create(tmp, new global::haxe.lang.Null<int>(tmp1, true), new global::haxe.lang.Null<int>(seconds, true), new global::haxe.lang.Null<int>(((int) (((long) (x2) )) ), true));
			}
		}
		
		
		public static long withMilliseconds(long this1, int milliseconds) {
			unchecked {
				long x = ((long) (( ((long) (( ((long) (this1) ) / ((long) (global::thx._DateTimeUtc.DateTimeUtc_Impl_.ticksPerHourI64) ) )) ) % ((long) (24) ) )) );
				if (( ((bool) (( ((long) (x) ) < -2147483648 )) ) || ((bool) (( ((long) (x) ) > 2147483647 )) ) )) {
					throw global::haxe.lang.HaxeException.wrap("Overflow");
				}
				
				int tmp = ((int) (((long) (x) )) );
				long x1 = ((long) (( ((long) (( ((long) (this1) ) / ((long) (global::thx._DateTimeUtc.DateTimeUtc_Impl_.ticksPerMinuteI64) ) )) ) % ((long) (60) ) )) );
				if (( ((bool) (( ((long) (x1) ) < -2147483648 )) ) || ((bool) (( ((long) (x1) ) > 2147483647 )) ) )) {
					throw global::haxe.lang.HaxeException.wrap("Overflow");
				}
				
				int tmp1 = ((int) (((long) (x1) )) );
				long x2 = ((long) (( ((long) (( ((long) (this1) ) / ((long) (global::thx._DateTimeUtc.DateTimeUtc_Impl_.ticksPerSecondI64) ) )) ) % ((long) (60) ) )) );
				if (( ((bool) (( ((long) (x2) ) < -2147483648 )) ) || ((bool) (( ((long) (x2) ) > 2147483647 )) ) )) {
					throw global::haxe.lang.HaxeException.wrap("Overflow");
				}
				
				return global::thx._Time.Time_Impl_.create(tmp, new global::haxe.lang.Null<int>(tmp1, true), new global::haxe.lang.Null<int>(((int) (((long) (x2) )) ), true), new global::haxe.lang.Null<int>(milliseconds, true));
			}
		}
		
		
		public static long negate(long this1) {
			return ((long) (global::haxe._Int64.Int64_Impl_.neg(((long) (this1) ))) );
		}
		
		
		public static long @add(long this1, long that) {
			return ((long) (( ((long) (this1) ) + ((long) (that) ) )) );
		}
		
		
		public static long addTicks(long this1, long that) {
			return ((long) (( ((long) (this1) ) + ((long) (that) ) )) );
		}
		
		
		public static long subtract(long this1, long that) {
			return ((long) (( ((long) (this1) ) - ((long) (that) ) )) );
		}
		
		
		public static int compareTo(long this1, long that) {
			return global::thx.Int64s.compare(((long) (this1) ), ((long) (that) ));
		}
		
		
		public static bool equalsTo(long this1, long that) {
			return ( ((long) (this1) ) == ((long) (that) ) );
		}
		
		
		public static bool @equals(long self, long that) {
			return ( ((long) (self) ) == ((long) (that) ) );
		}
		
		
		public static bool notEqualsTo(long self, long that) {
			return ( ((long) (self) ) != ((long) (that) ) );
		}
		
		
		public static bool notEquals(long this1, long that) {
			return ( ((long) (this1) ) != ((long) (that) ) );
		}
		
		
		public static bool greaterThan(long self, long that) {
			unchecked {
				long a = ((long) (self) );
				long b = ((long) (that) );
				return ( (( (((bool) (( ((long) (a) ) < ((long) (b) ) )) )) ? (-1) : (( (((bool) (( ((long) (a) ) > ((long) (b) ) )) )) ? (1) : (0) )) )) > 0 );
			}
		}
		
		
		public static bool greater(long this1, long that) {
			unchecked {
				long b = ((long) (that) );
				return ( (( (((bool) (( ((long) (this1) ) < ((long) (b) ) )) )) ? (-1) : (( (((bool) (( ((long) (this1) ) > ((long) (b) ) )) )) ? (1) : (0) )) )) > 0 );
			}
		}
		
		
		public static bool greaterEqualsTo(long self, long that) {
			unchecked {
				long a = ((long) (self) );
				long b = ((long) (that) );
				return ( (( (((bool) (( ((long) (a) ) < ((long) (b) ) )) )) ? (-1) : (( (((bool) (( ((long) (a) ) > ((long) (b) ) )) )) ? (1) : (0) )) )) >= 0 );
			}
		}
		
		
		public static bool greaterEquals(long this1, long that) {
			unchecked {
				long b = ((long) (that) );
				return ( (( (((bool) (( ((long) (this1) ) < ((long) (b) ) )) )) ? (-1) : (( (((bool) (( ((long) (this1) ) > ((long) (b) ) )) )) ? (1) : (0) )) )) >= 0 );
			}
		}
		
		
		public static bool lessThan(long self, long that) {
			unchecked {
				long a = ((long) (self) );
				long b = ((long) (that) );
				return ( (( (((bool) (( ((long) (a) ) < ((long) (b) ) )) )) ? (-1) : (( (((bool) (( ((long) (a) ) > ((long) (b) ) )) )) ? (1) : (0) )) )) < 0 );
			}
		}
		
		
		public static bool less(long this1, long that) {
			unchecked {
				long b = ((long) (that) );
				return ( (( (((bool) (( ((long) (this1) ) < ((long) (b) ) )) )) ? (-1) : (( (((bool) (( ((long) (this1) ) > ((long) (b) ) )) )) ? (1) : (0) )) )) < 0 );
			}
		}
		
		
		public static bool lessEqualsTo(long self, long that) {
			unchecked {
				long a = ((long) (self) );
				long b = ((long) (that) );
				return ( (( (((bool) (( ((long) (a) ) < ((long) (b) ) )) )) ? (-1) : (( (((bool) (( ((long) (a) ) > ((long) (b) ) )) )) ? (1) : (0) )) )) <= 0 );
			}
		}
		
		
		public static bool lessEquals(long this1, long that) {
			unchecked {
				long b = ((long) (that) );
				return ( (( (((bool) (( ((long) (this1) ) < ((long) (b) ) )) )) ? (-1) : (( (((bool) (( ((long) (this1) ) > ((long) (b) ) )) )) ? (1) : (0) )) )) <= 0 );
			}
		}
		
		
		public static long toDateTimeUtc(long this1) {
			return ((long) (this1) );
		}
		
		
		public static string toString(long this1) {
			unchecked {
				long timeAbs = global::thx._Time.Time_Impl_.abs(this1);
				long x = ((long) (( ((long) (timeAbs) ) % ((long) (global::thx._DateTimeUtc.DateTimeUtc_Impl_.ticksPerSecondI64) ) )) );
				if (( ((bool) (( ((long) (x) ) < -2147483648 )) ) || ((bool) (( ((long) (x) ) > 2147483647 )) ) )) {
					throw global::haxe.lang.HaxeException.wrap("Overflow");
				}
				
				int ticksInSecondAbs = ((int) (((long) (x) )) );
				string decimals = ( (( ticksInSecondAbs != 0 )) ? (global::haxe.lang.Runtime.concat(".", global::thx.Strings.trimCharsRight(global::thx.Ints.lpad(ticksInSecondAbs, "0", 7), "0"))) : ("") );
				string tmp = ( (((bool) (( ((long) (this1) ) < ((long) (0) ) )) )) ? ("-") : ("") );
				string tmp1 = global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("", (global::haxe.lang.Runtime.concat("", global::Std.@string(((long) (( ((long) (timeAbs) ) / ((long) (global::thx._DateTimeUtc.DateTimeUtc_Impl_.ticksPerHourI64) ) )) ))))), ":");
				long x1 = ((long) (( ((long) (( ((long) (timeAbs) ) / ((long) (global::thx._DateTimeUtc.DateTimeUtc_Impl_.ticksPerMinuteI64) ) )) ) % ((long) (60) ) )) );
				if (( ((bool) (( ((long) (x1) ) < -2147483648 )) ) || ((bool) (( ((long) (x1) ) > 2147483647 )) ) )) {
					throw global::haxe.lang.HaxeException.wrap("Overflow");
				}
				
				string tmp2 = global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(tmp1, global::thx.Ints.lpad(((int) (((long) (x1) )) ), "0", 2)), ":");
				long x2 = ((long) (( ((long) (( ((long) (timeAbs) ) / ((long) (global::thx._DateTimeUtc.DateTimeUtc_Impl_.ticksPerSecondI64) ) )) ) % ((long) (60) ) )) );
				if (( ((bool) (( ((long) (x2) ) < -2147483648 )) ) || ((bool) (( ((long) (x2) ) > 2147483647 )) ) )) {
					throw global::haxe.lang.HaxeException.wrap("Overflow");
				}
				
				return global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(tmp, (global::haxe.lang.Runtime.concat(tmp2, global::thx.Ints.lpad(((int) (((long) (x2) )) ), "0", 2)))), decimals);
			}
		}
		
		
		public static string toGmtString(long this1) {
			unchecked {
				long x = ((long) (( ((long) (this1) ) / ((long) (global::thx._DateTimeUtc.DateTimeUtc_Impl_.ticksPerHourI64) ) )) );
				if (( ((bool) (( ((long) (x) ) < -2147483648 )) ) || ((bool) (( ((long) (x) ) > 2147483647 )) ) )) {
					throw global::haxe.lang.HaxeException.wrap("Overflow");
				}
				
				string h = global::thx.Ints.lpad(((int) (((long) (x) )) ), "0", 2);
				if (((bool) (( ((long) (this1) ) >= ((long) (0) ) )) )) {
					h = global::haxe.lang.Runtime.concat("+", h);
				}
				
				string tmp = global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("", h), ":");
				long x1 = ((long) (( ((long) (( ((long) (this1) ) / ((long) (global::thx._DateTimeUtc.DateTimeUtc_Impl_.ticksPerMinuteI64) ) )) ) % ((long) (60) ) )) );
				if (( ((bool) (( ((long) (x1) ) < -2147483648 )) ) || ((bool) (( ((long) (x1) ) > 2147483647 )) ) )) {
					throw global::haxe.lang.HaxeException.wrap("Overflow");
				}
				
				return global::haxe.lang.Runtime.concat(tmp, global::thx.Ints.lpad(((int) (((long) (x1) )) ), "0", 2));
			}
		}
		
		
		public static long get_ticks(long this1) {
			return this1;
		}
		
		
		public static int get_days(long this1) {
			unchecked {
				long x = ((long) (( ((long) (this1) ) / ((long) (global::thx._DateTimeUtc.DateTimeUtc_Impl_.ticksPerDayI64) ) )) );
				if (( ((bool) (( ((long) (x) ) < -2147483648 )) ) || ((bool) (( ((long) (x) ) > 2147483647 )) ) )) {
					throw global::haxe.lang.HaxeException.wrap("Overflow");
				}
				
				return ((int) (((long) (x) )) );
			}
		}
		
		
		public static int get_hours(long this1) {
			unchecked {
				long x = ((long) (( ((long) (( ((long) (this1) ) / ((long) (global::thx._DateTimeUtc.DateTimeUtc_Impl_.ticksPerHourI64) ) )) ) % ((long) (24) ) )) );
				if (( ((bool) (( ((long) (x) ) < -2147483648 )) ) || ((bool) (( ((long) (x) ) > 2147483647 )) ) )) {
					throw global::haxe.lang.HaxeException.wrap("Overflow");
				}
				
				return ((int) (((long) (x) )) );
			}
		}
		
		
		public static int get_minutes(long this1) {
			unchecked {
				long x = ((long) (( ((long) (( ((long) (this1) ) / ((long) (global::thx._DateTimeUtc.DateTimeUtc_Impl_.ticksPerMinuteI64) ) )) ) % ((long) (60) ) )) );
				if (( ((bool) (( ((long) (x) ) < -2147483648 )) ) || ((bool) (( ((long) (x) ) > 2147483647 )) ) )) {
					throw global::haxe.lang.HaxeException.wrap("Overflow");
				}
				
				return ((int) (((long) (x) )) );
			}
		}
		
		
		public static int get_seconds(long this1) {
			unchecked {
				long x = ((long) (( ((long) (( ((long) (this1) ) / ((long) (global::thx._DateTimeUtc.DateTimeUtc_Impl_.ticksPerSecondI64) ) )) ) % ((long) (60) ) )) );
				if (( ((bool) (( ((long) (x) ) < -2147483648 )) ) || ((bool) (( ((long) (x) ) > 2147483647 )) ) )) {
					throw global::haxe.lang.HaxeException.wrap("Overflow");
				}
				
				return ((int) (((long) (x) )) );
			}
		}
		
		
		public static int get_milliseconds(long this1) {
			unchecked {
				long x = ((long) (( ((long) (( ((long) (this1) ) / ((long) (global::thx._DateTimeUtc.DateTimeUtc_Impl_.ticksPerMillisecondI64) ) )) ) % ((long) (global::thx._DateTimeUtc.DateTimeUtc_Impl_.thousandI64) ) )) );
				if (( ((bool) (( ((long) (x) ) < -2147483648 )) ) || ((bool) (( ((long) (x) ) > 2147483647 )) ) )) {
					throw global::haxe.lang.HaxeException.wrap("Overflow");
				}
				
				return ((int) (((long) (x) )) );
			}
		}
		
		
		public static int get_microseconds(long this1) {
			unchecked {
				long x = ((long) (( ((long) (( ((long) (this1) ) / ((long) (global::thx._DateTimeUtc.DateTimeUtc_Impl_.ticksPerMicrosecondI64) ) )) ) % ((long) (global::thx._DateTimeUtc.DateTimeUtc_Impl_.tenThousandI64) ) )) );
				if (( ((bool) (( ((long) (x) ) < -2147483648 )) ) || ((bool) (( ((long) (x) ) > 2147483647 )) ) )) {
					throw global::haxe.lang.HaxeException.wrap("Overflow");
				}
				
				return ((int) (((long) (x) )) );
			}
		}
		
		
		public static int get_ticksInSecond(long this1) {
			unchecked {
				long x = ((long) (( ((long) (this1) ) % ((long) (global::thx._DateTimeUtc.DateTimeUtc_Impl_.ticksPerSecondI64) ) )) );
				if (( ((bool) (( ((long) (x) ) < -2147483648 )) ) || ((bool) (( ((long) (x) ) > 2147483647 )) ) )) {
					throw global::haxe.lang.HaxeException.wrap("Overflow");
				}
				
				return ((int) (((long) (x) )) );
			}
		}
		
		
		public static long get_totalDays(long this1) {
			return ((long) (( ((long) (this1) ) / ((long) (global::thx._DateTimeUtc.DateTimeUtc_Impl_.ticksPerDayI64) ) )) );
		}
		
		
		public static long get_totalHours(long this1) {
			return ((long) (( ((long) (this1) ) / ((long) (global::thx._DateTimeUtc.DateTimeUtc_Impl_.ticksPerHourI64) ) )) );
		}
		
		
		public static long get_totalMinutes(long this1) {
			return ((long) (( ((long) (this1) ) / ((long) (global::thx._DateTimeUtc.DateTimeUtc_Impl_.ticksPerMinuteI64) ) )) );
		}
		
		
		public static long get_totalSeconds(long this1) {
			return ((long) (( ((long) (this1) ) / ((long) (global::thx._DateTimeUtc.DateTimeUtc_Impl_.ticksPerSecondI64) ) )) );
		}
		
		
		public static long get_totalMilliseconds(long this1) {
			return ((long) (( ((long) (this1) ) / ((long) (global::thx._DateTimeUtc.DateTimeUtc_Impl_.ticksPerMillisecondI64) ) )) );
		}
		
		
		public static long get_totalMicroseconds(long this1) {
			return ((long) (( ((long) (this1) ) / ((long) (global::thx._DateTimeUtc.DateTimeUtc_Impl_.ticksPerMicrosecondI64) ) )) );
		}
		
		
		public static bool get_isNegative(long this1) {
			return ((bool) (( ((long) (this1) ) < ((long) (0) ) )) );
		}
		
		
	}
}


