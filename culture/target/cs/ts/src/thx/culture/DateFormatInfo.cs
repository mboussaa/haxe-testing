// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx.culture {
	public class DateFormatInfo : global::haxe.lang.HxObject {
		
		static DateFormatInfo() {
			global::thx.culture.DateFormatInfo.invariant = new global::thx.culture.DateFormatInfo(0, "FirstDay", "AM", "PM", 0, "Sunday", "Gregorian", null, new global::Array<object>(new object[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}), new global::Array<object>(new object[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"}), new global::Array<object>(new object[]{"Su", "Mo", "Tu", "We", "Th", "Fr", "Sa"}), new global::Array<object>(new object[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", ""}), new global::Array<object>(new object[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", ""}), new global::Array<object>(new object[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", ""}), new global::Array<object>(new object[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", ""}), "dddd, dd MMMM yyyy", "MM/dd/yyyy", "dddd, dd MMMM yyyy HH:mm:ss", "yyyy\'-\'MM\'-\'dd\'T\'HH\':\'mm\':\'ss", "MMMM dd", "ddd, dd MMM yyyy HH\':\'mm\':\'ss \'GMT\'", "HH:mm:ss", "HH:mm", "yyyy\'-\'MM\'-\'dd HH\':\'mm\':\'ss\'Z\'", "yyyy MMMM", "/", ":");
		}
		
		
		public DateFormatInfo(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public DateFormatInfo(int calendarWeekRuleIndex, string calendarWeekRuleName, string designatorAm, string designatorPm, int firstDayOfWeekIndex, string firstDayOfWeekName, string nameCalendar, string nameCalendarNative, global::Array<object> nameDays, global::Array<object> nameDaysAbbreviated, global::Array<object> nameDaysShortest, global::Array<object> nameMonths, global::Array<object> nameMonthsAbbreviated, global::Array<object> nameMonthGenitives, global::Array<object> nameMonthGenitivesAbbreviated, string patternDateLong, string patternDateShort, string patternDateTimeFull, string patternDateTimeSortable, string patternMonthDay, string patternRfc1123, string patternTimeLong, string patternTimeShort, string patternUniversalSortable, string patternYearMonth, string separatorDate, string separatorTime) {
			global::thx.culture.DateFormatInfo.__hx_ctor_thx_culture_DateFormatInfo(this, calendarWeekRuleIndex, calendarWeekRuleName, designatorAm, designatorPm, firstDayOfWeekIndex, firstDayOfWeekName, nameCalendar, nameCalendarNative, nameDays, nameDaysAbbreviated, nameDaysShortest, nameMonths, nameMonthsAbbreviated, nameMonthGenitives, nameMonthGenitivesAbbreviated, patternDateLong, patternDateShort, patternDateTimeFull, patternDateTimeSortable, patternMonthDay, patternRfc1123, patternTimeLong, patternTimeShort, patternUniversalSortable, patternYearMonth, separatorDate, separatorTime);
		}
		
		
		public static void __hx_ctor_thx_culture_DateFormatInfo(global::thx.culture.DateFormatInfo __temp_me38, int calendarWeekRuleIndex, string calendarWeekRuleName, string designatorAm, string designatorPm, int firstDayOfWeekIndex, string firstDayOfWeekName, string nameCalendar, string nameCalendarNative, global::Array<object> nameDays, global::Array<object> nameDaysAbbreviated, global::Array<object> nameDaysShortest, global::Array<object> nameMonths, global::Array<object> nameMonthsAbbreviated, global::Array<object> nameMonthGenitives, global::Array<object> nameMonthGenitivesAbbreviated, string patternDateLong, string patternDateShort, string patternDateTimeFull, string patternDateTimeSortable, string patternMonthDay, string patternRfc1123, string patternTimeLong, string patternTimeShort, string patternUniversalSortable, string patternYearMonth, string separatorDate, string separatorTime) {
			__temp_me38.calendarWeekRuleIndex = calendarWeekRuleIndex;
			__temp_me38.calendarWeekRuleName = calendarWeekRuleName;
			__temp_me38.designatorAm = designatorAm;
			__temp_me38.designatorPm = designatorPm;
			__temp_me38.firstDayOfWeekIndex = firstDayOfWeekIndex;
			__temp_me38.firstDayOfWeekName = firstDayOfWeekName;
			__temp_me38.nameCalendar = nameCalendar;
			__temp_me38.nameCalendarNative = nameCalendarNative;
			__temp_me38.nameDays = nameDays;
			__temp_me38.nameDaysAbbreviated = nameDaysAbbreviated;
			__temp_me38.nameDaysShortest = nameDaysShortest;
			__temp_me38.nameMonths = nameMonths;
			__temp_me38.nameMonthsAbbreviated = nameMonthsAbbreviated;
			__temp_me38.nameMonthGenitives = nameMonthGenitives;
			__temp_me38.nameMonthGenitivesAbbreviated = nameMonthGenitivesAbbreviated;
			__temp_me38.patternDateLong = patternDateLong;
			__temp_me38.patternDateShort = patternDateShort;
			__temp_me38.patternDateTimeFull = patternDateTimeFull;
			__temp_me38.patternDateTimeSortable = patternDateTimeSortable;
			__temp_me38.patternMonthDay = patternMonthDay;
			__temp_me38.patternRfc1123 = patternRfc1123;
			__temp_me38.patternTimeLong = patternTimeLong;
			__temp_me38.patternTimeShort = patternTimeShort;
			__temp_me38.patternUniversalSortable = patternUniversalSortable;
			__temp_me38.patternYearMonth = patternYearMonth;
			__temp_me38.separatorDate = separatorDate;
			__temp_me38.separatorTime = separatorTime;
		}
		
		
		public static global::thx.culture.DateFormatInfo invariant;
		
		public static global::thx.culture.DateFormatInfo fromObject(object o) {
			return new global::thx.culture.DateFormatInfo(((int) (global::haxe.lang.Runtime.toInt(global::haxe.lang.Runtime.getField(o, "calendarWeekRuleIndex", 1812362308, true))) ), global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(o, "calendarWeekRuleName", 554059097, true)), global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(o, "designatorAm", 726839840, true)), global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(o, "designatorPm", 726843185, true)), ((int) (global::haxe.lang.Runtime.toInt(global::haxe.lang.Runtime.getField(o, "firstDayOfWeekIndex", 931922363, true))) ), global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(o, "firstDayOfWeekName", 665670594, true)), global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(o, "nameCalendar", 106319913, true)), global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(o, "nameCalendarNative", 529765024, true)), ((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (global::haxe.lang.Runtime.getField(o, "nameDays", 1055554178, true)) ))) ), ((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (global::haxe.lang.Runtime.getField(o, "nameDaysAbbreviated", 742587063, true)) ))) ), ((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (global::haxe.lang.Runtime.getField(o, "nameDaysShortest", 635699692, true)) ))) ), ((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (global::haxe.lang.Runtime.getField(o, "nameMonths", 1273872862, true)) ))) ), ((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (global::haxe.lang.Runtime.getField(o, "nameMonthsAbbreviated", 1079146715, true)) ))) ), ((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (global::haxe.lang.Runtime.getField(o, "nameMonthGenitives", 667371489, true)) ))) ), ((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (global::haxe.lang.Runtime.getField(o, "nameMonthGenitivesAbbreviated", 699988920, true)) ))) ), global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(o, "patternDateLong", 584411450, true)), global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(o, "patternDateShort", 1528104702, true)), global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(o, "patternDateTimeFull", 453240570, true)), global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(o, "patternDateTimeSortable", 602680035, true)), global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(o, "patternMonthDay", 990364012, true)), global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(o, "patternRfc1123", 1700034528, true)), global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(o, "patternTimeLong", 908638873, true)), global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(o, "patternTimeShort", 816375999, true)), global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(o, "patternUniversalSortable", 354602035, true)), global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(o, "patternYearMonth", 980455379, true)), global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(o, "separatorDate", 694450483, true)), global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(o, "separatorTime", 872279826, true)));
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::thx.culture.DateFormatInfo(global::haxe.lang.EmptyObject.EMPTY);
		}
		
		
		public static new object __hx_create(global::Array arr) {
			unchecked {
				return new global::thx.culture.DateFormatInfo(((int) (global::haxe.lang.Runtime.toInt(arr[0])) ), global::haxe.lang.Runtime.toString(arr[1]), global::haxe.lang.Runtime.toString(arr[2]), global::haxe.lang.Runtime.toString(arr[3]), ((int) (global::haxe.lang.Runtime.toInt(arr[4])) ), global::haxe.lang.Runtime.toString(arr[5]), global::haxe.lang.Runtime.toString(arr[6]), global::haxe.lang.Runtime.toString(arr[7]), ((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (arr[8]) ))) ), ((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (arr[9]) ))) ), ((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (arr[10]) ))) ), ((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (arr[11]) ))) ), ((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (arr[12]) ))) ), ((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (arr[13]) ))) ), ((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (arr[14]) ))) ), global::haxe.lang.Runtime.toString(arr[15]), global::haxe.lang.Runtime.toString(arr[16]), global::haxe.lang.Runtime.toString(arr[17]), global::haxe.lang.Runtime.toString(arr[18]), global::haxe.lang.Runtime.toString(arr[19]), global::haxe.lang.Runtime.toString(arr[20]), global::haxe.lang.Runtime.toString(arr[21]), global::haxe.lang.Runtime.toString(arr[22]), global::haxe.lang.Runtime.toString(arr[23]), global::haxe.lang.Runtime.toString(arr[24]), global::haxe.lang.Runtime.toString(arr[25]), global::haxe.lang.Runtime.toString(arr[26]));
			}
		}
		
		
		public int calendarWeekRuleIndex;
		
		public string calendarWeekRuleName;
		
		public string designatorAm;
		
		public string designatorPm;
		
		public int firstDayOfWeekIndex;
		
		public string firstDayOfWeekName;
		
		public string nameCalendar;
		
		public string nameCalendarNative;
		
		public global::Array<object> nameDays;
		
		public global::Array<object> nameDaysAbbreviated;
		
		public global::Array<object> nameDaysShortest;
		
		public global::Array<object> nameMonths;
		
		public global::Array<object> nameMonthsAbbreviated;
		
		public global::Array<object> nameMonthGenitives;
		
		public global::Array<object> nameMonthGenitivesAbbreviated;
		
		public string patternDateLong;
		
		public string patternDateShort;
		
		public string patternDateTimeFull;
		
		public string patternDateTimeSortable;
		
		public string patternMonthDay;
		
		public string patternRfc1123;
		
		public string patternTimeLong;
		
		public string patternTimeShort;
		
		public string patternUniversalSortable;
		
		public string patternYearMonth;
		
		public string separatorDate;
		
		public string separatorTime;
		
		public virtual object toObject() {
			return new global::haxe.lang.DynamicObject(new int[]{106319913, 354602035, 453240570, 529765024, 554059097, 584411450, 602680035, 635699692, 665670594, 667371489, 694450483, 699988920, 726839840, 726843185, 742587063, 816375999, 872279826, 908638873, 980455379, 990364012, 1055554178, 1079146715, 1273872862, 1528104702, 1700034528}, new object[]{this.nameCalendar, this.patternUniversalSortable, this.patternDateTimeFull, this.nameCalendarNative, this.calendarWeekRuleName, this.patternDateLong, this.patternDateTimeSortable, this.nameDaysShortest, this.firstDayOfWeekName, this.nameMonthGenitives, this.separatorDate, this.nameMonthGenitivesAbbreviated, this.designatorAm, this.designatorPm, this.nameDaysAbbreviated, this.patternTimeShort, this.separatorTime, this.patternTimeLong, this.patternYearMonth, this.patternMonthDay, this.nameDays, this.nameMonthsAbbreviated, this.nameMonths, this.patternDateShort, this.patternRfc1123}, new int[]{931922363, 1812362308}, new double[]{((double) (this.firstDayOfWeekIndex) ), ((double) (this.calendarWeekRuleIndex) )});
		}
		
		
		public override double __hx_setField_f(string field, int hash, double @value, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 931922363:
					{
						this.firstDayOfWeekIndex = ((int) (@value) );
						return @value;
					}
					
					
					case 1812362308:
					{
						this.calendarWeekRuleIndex = ((int) (@value) );
						return @value;
					}
					
					
					default:
					{
						return base.__hx_setField_f(field, hash, @value, handleProperties);
					}
					
				}
				
			}
		}
		
		
		public override object __hx_setField(string field, int hash, object @value, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 872279826:
					{
						this.separatorTime = global::haxe.lang.Runtime.toString(@value);
						return @value;
					}
					
					
					case 694450483:
					{
						this.separatorDate = global::haxe.lang.Runtime.toString(@value);
						return @value;
					}
					
					
					case 980455379:
					{
						this.patternYearMonth = global::haxe.lang.Runtime.toString(@value);
						return @value;
					}
					
					
					case 354602035:
					{
						this.patternUniversalSortable = global::haxe.lang.Runtime.toString(@value);
						return @value;
					}
					
					
					case 816375999:
					{
						this.patternTimeShort = global::haxe.lang.Runtime.toString(@value);
						return @value;
					}
					
					
					case 908638873:
					{
						this.patternTimeLong = global::haxe.lang.Runtime.toString(@value);
						return @value;
					}
					
					
					case 1700034528:
					{
						this.patternRfc1123 = global::haxe.lang.Runtime.toString(@value);
						return @value;
					}
					
					
					case 990364012:
					{
						this.patternMonthDay = global::haxe.lang.Runtime.toString(@value);
						return @value;
					}
					
					
					case 602680035:
					{
						this.patternDateTimeSortable = global::haxe.lang.Runtime.toString(@value);
						return @value;
					}
					
					
					case 453240570:
					{
						this.patternDateTimeFull = global::haxe.lang.Runtime.toString(@value);
						return @value;
					}
					
					
					case 1528104702:
					{
						this.patternDateShort = global::haxe.lang.Runtime.toString(@value);
						return @value;
					}
					
					
					case 584411450:
					{
						this.patternDateLong = global::haxe.lang.Runtime.toString(@value);
						return @value;
					}
					
					
					case 699988920:
					{
						this.nameMonthGenitivesAbbreviated = ((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (@value) ))) );
						return @value;
					}
					
					
					case 667371489:
					{
						this.nameMonthGenitives = ((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (@value) ))) );
						return @value;
					}
					
					
					case 1079146715:
					{
						this.nameMonthsAbbreviated = ((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (@value) ))) );
						return @value;
					}
					
					
					case 1273872862:
					{
						this.nameMonths = ((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (@value) ))) );
						return @value;
					}
					
					
					case 635699692:
					{
						this.nameDaysShortest = ((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (@value) ))) );
						return @value;
					}
					
					
					case 742587063:
					{
						this.nameDaysAbbreviated = ((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (@value) ))) );
						return @value;
					}
					
					
					case 1055554178:
					{
						this.nameDays = ((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (@value) ))) );
						return @value;
					}
					
					
					case 529765024:
					{
						this.nameCalendarNative = global::haxe.lang.Runtime.toString(@value);
						return @value;
					}
					
					
					case 106319913:
					{
						this.nameCalendar = global::haxe.lang.Runtime.toString(@value);
						return @value;
					}
					
					
					case 665670594:
					{
						this.firstDayOfWeekName = global::haxe.lang.Runtime.toString(@value);
						return @value;
					}
					
					
					case 931922363:
					{
						this.firstDayOfWeekIndex = ((int) (global::haxe.lang.Runtime.toInt(@value)) );
						return @value;
					}
					
					
					case 726843185:
					{
						this.designatorPm = global::haxe.lang.Runtime.toString(@value);
						return @value;
					}
					
					
					case 726839840:
					{
						this.designatorAm = global::haxe.lang.Runtime.toString(@value);
						return @value;
					}
					
					
					case 554059097:
					{
						this.calendarWeekRuleName = global::haxe.lang.Runtime.toString(@value);
						return @value;
					}
					
					
					case 1812362308:
					{
						this.calendarWeekRuleIndex = ((int) (global::haxe.lang.Runtime.toInt(@value)) );
						return @value;
					}
					
					
					default:
					{
						return base.__hx_setField(field, hash, @value, handleProperties);
					}
					
				}
				
			}
		}
		
		
		public override object __hx_getField(string field, int hash, bool throwErrors, bool isCheck, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 1014900378:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "toObject", 1014900378)) );
					}
					
					
					case 872279826:
					{
						return this.separatorTime;
					}
					
					
					case 694450483:
					{
						return this.separatorDate;
					}
					
					
					case 980455379:
					{
						return this.patternYearMonth;
					}
					
					
					case 354602035:
					{
						return this.patternUniversalSortable;
					}
					
					
					case 816375999:
					{
						return this.patternTimeShort;
					}
					
					
					case 908638873:
					{
						return this.patternTimeLong;
					}
					
					
					case 1700034528:
					{
						return this.patternRfc1123;
					}
					
					
					case 990364012:
					{
						return this.patternMonthDay;
					}
					
					
					case 602680035:
					{
						return this.patternDateTimeSortable;
					}
					
					
					case 453240570:
					{
						return this.patternDateTimeFull;
					}
					
					
					case 1528104702:
					{
						return this.patternDateShort;
					}
					
					
					case 584411450:
					{
						return this.patternDateLong;
					}
					
					
					case 699988920:
					{
						return this.nameMonthGenitivesAbbreviated;
					}
					
					
					case 667371489:
					{
						return this.nameMonthGenitives;
					}
					
					
					case 1079146715:
					{
						return this.nameMonthsAbbreviated;
					}
					
					
					case 1273872862:
					{
						return this.nameMonths;
					}
					
					
					case 635699692:
					{
						return this.nameDaysShortest;
					}
					
					
					case 742587063:
					{
						return this.nameDaysAbbreviated;
					}
					
					
					case 1055554178:
					{
						return this.nameDays;
					}
					
					
					case 529765024:
					{
						return this.nameCalendarNative;
					}
					
					
					case 106319913:
					{
						return this.nameCalendar;
					}
					
					
					case 665670594:
					{
						return this.firstDayOfWeekName;
					}
					
					
					case 931922363:
					{
						return this.firstDayOfWeekIndex;
					}
					
					
					case 726843185:
					{
						return this.designatorPm;
					}
					
					
					case 726839840:
					{
						return this.designatorAm;
					}
					
					
					case 554059097:
					{
						return this.calendarWeekRuleName;
					}
					
					
					case 1812362308:
					{
						return this.calendarWeekRuleIndex;
					}
					
					
					default:
					{
						return base.__hx_getField(field, hash, throwErrors, isCheck, handleProperties);
					}
					
				}
				
			}
		}
		
		
		public override double __hx_getField_f(string field, int hash, bool throwErrors, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 931922363:
					{
						return ((double) (this.firstDayOfWeekIndex) );
					}
					
					
					case 1812362308:
					{
						return ((double) (this.calendarWeekRuleIndex) );
					}
					
					
					default:
					{
						return base.__hx_getField_f(field, hash, throwErrors, handleProperties);
					}
					
				}
				
			}
		}
		
		
		public override object __hx_invokeField(string field, int hash, global::Array dynargs) {
			unchecked {
				switch (hash) {
					case 1014900378:
					{
						return this.toObject();
					}
					
					
					default:
					{
						return base.__hx_invokeField(field, hash, dynargs);
					}
					
				}
				
			}
		}
		
		
		public override void __hx_getFields(global::Array<object> baseArr) {
			baseArr.push("separatorTime");
			baseArr.push("separatorDate");
			baseArr.push("patternYearMonth");
			baseArr.push("patternUniversalSortable");
			baseArr.push("patternTimeShort");
			baseArr.push("patternTimeLong");
			baseArr.push("patternRfc1123");
			baseArr.push("patternMonthDay");
			baseArr.push("patternDateTimeSortable");
			baseArr.push("patternDateTimeFull");
			baseArr.push("patternDateShort");
			baseArr.push("patternDateLong");
			baseArr.push("nameMonthGenitivesAbbreviated");
			baseArr.push("nameMonthGenitives");
			baseArr.push("nameMonthsAbbreviated");
			baseArr.push("nameMonths");
			baseArr.push("nameDaysShortest");
			baseArr.push("nameDaysAbbreviated");
			baseArr.push("nameDays");
			baseArr.push("nameCalendarNative");
			baseArr.push("nameCalendar");
			baseArr.push("firstDayOfWeekName");
			baseArr.push("firstDayOfWeekIndex");
			baseArr.push("designatorPm");
			baseArr.push("designatorAm");
			baseArr.push("calendarWeekRuleName");
			baseArr.push("calendarWeekRuleIndex");
			{
				base.__hx_getFields(baseArr);
			}
			
		}
		
		
	}
}


