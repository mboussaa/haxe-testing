// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class Convert : global::haxe.lang.HxObject {
		
		public Convert(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public Convert() {
			global::thx.Convert.__hx_ctor_thx_Convert(this);
		}
		
		
		public static void __hx_ctor_thx_Convert(global::thx.Convert __temp_me90) {
		}
		
		
		public static string toString(object @value) {
			unchecked {
				global::ValueType _g = global::Type.@typeof(@value);
				switch (_g.index) {
					case 0:
					{
						return null;
					}
					
					
					case 1:
					case 2:
					case 3:
					{
						return global::haxe.lang.Runtime.concat("", global::Std.@string(@value));
					}
					
					
					case 4:
					{
						try {
							return global::haxe.format.JsonPrinter.print(@value, null, null);
						}
						catch (global::System.Exception __temp_catchallException1){
							global::haxe.lang.Exceptions.exception = __temp_catchallException1;
							object __temp_catchall2 = __temp_catchallException1;
							if (( __temp_catchall2 is global::haxe.lang.HaxeException )) {
								__temp_catchall2 = ((global::haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
							}
							
							{
								object e = __temp_catchall2;
								throw global::haxe.lang.HaxeException.wrap(new global::thx.Error("unable to convert object to String", null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"toString", "thx.Convert", "Convert.hx"}, new int[]{1981972957}, new double[]{((double) (15) )})));
							}
							
						}
						
						
					}
					
					
					case 6:
					{
						switch (global::Type.getClassName(((global::System.Type) (_g.@params[0]) ))) {
							case "Date":
							{
								return ((global::Date) (@value) ).toString();
							}
							
							
							case "String":
							{
								return global::haxe.lang.Runtime.toString(@value);
							}
							
							
							default:
							{
								if (( @value is global::haxe.IMap )) {
									try {
										return global::haxe.format.JsonPrinter.print(global::thx.Maps.toObject<object>(((global::haxe.ds.StringMap<object>) (global::haxe.ds.StringMap<object>.__hx_cast<object>(((global::haxe.ds.StringMap) (@value) ))) )), null, null);
									}
									catch (global::System.Exception __temp_catchallException3){
										global::haxe.lang.Exceptions.exception = __temp_catchallException3;
										object __temp_catchall4 = __temp_catchallException3;
										if (( __temp_catchall4 is global::haxe.lang.HaxeException )) {
											__temp_catchall4 = ((global::haxe.lang.HaxeException) (__temp_catchallException3) ).obj;
										}
										
										{
											object e1 = __temp_catchall4;
											throw global::haxe.lang.HaxeException.wrap(new global::thx.Error("unable to convert object to String", null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"toString", "thx.Convert", "Convert.hx"}, new int[]{1981972957}, new double[]{((double) (24) )})));
										}
										
									}
									
									
								}
								else {
									throw global::haxe.lang.HaxeException.wrap(new global::thx.Error(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("unable to convert ", global::Std.@string(@value)), " to String"), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"toString", "thx.Convert", "Convert.hx"}, new int[]{1981972957}, new double[]{((double) (26) )})));
								}
								
							}
							
						}
						
					}
					
					
					default:
					{
						throw global::haxe.lang.HaxeException.wrap(new global::thx.Error(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("unable to convert ", global::Std.@string(@value)), " to String"), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"toString", "thx.Convert", "Convert.hx"}, new int[]{1981972957}, new double[]{((double) (29) )})));
					}
					
				}
				
			}
		}
		
		
		public static string toStringOr(object @value, string alt) {
			if (( null == @value )) {
				return alt;
			}
			else {
				return global::thx.Convert.toString(@value);
			}
			
		}
		
		
		public static int toInt(object @value) {
			unchecked {
				if (( null == @value )) {
					throw global::haxe.lang.HaxeException.wrap(new global::thx.Error("unable to convert null to Int", null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"toInt", "thx.Convert", "Convert.hx"}, new int[]{1981972957}, new double[]{((double) (37) )})));
				}
				
				switch (global::thx.Types.toString(global::Type.@typeof(((object) (@value) )))) {
					case "Bool":
					{
						if (global::haxe.lang.Runtime.toBool(@value)) {
							return 1;
						}
						else {
							return 0;
						}
						
					}
					
					
					case "Float":
					{
						return ((int) (global::haxe.lang.Runtime.toInt(@value)) );
					}
					
					
					case "Int":
					{
						return ((int) (global::haxe.lang.Runtime.toInt(@value)) );
					}
					
					
					case "String":
					{
						if (global::thx.Ints.canParse(global::haxe.lang.Runtime.toString(@value))) {
							return (global::thx.Ints.parse(global::haxe.lang.Runtime.toString(@value), default(global::haxe.lang.Null<int>))).@value;
						}
						else {
							throw global::haxe.lang.HaxeException.wrap(new global::thx.Error(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("unable to convert ", global::Std.@string(@value)), " to Int"), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"toInt", "thx.Convert", "Convert.hx"}, new int[]{1981972957}, new double[]{((double) (48) )})));
						}
						
					}
					
					
					default:
					{
						throw global::haxe.lang.HaxeException.wrap(new global::thx.Error(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("unable to convert ", global::Std.@string(@value)), " to Int"), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"toInt", "thx.Convert", "Convert.hx"}, new int[]{1981972957}, new double[]{((double) (48) )})));
					}
					
				}
				
			}
		}
		
		
		public static int toIntOr(object @value, int alt) {
			try {
				return global::thx.Convert.toInt(@value);
			}
			catch (global::System.Exception __temp_catchallException1){
				global::haxe.lang.Exceptions.exception = __temp_catchallException1;
				object __temp_catchall2 = __temp_catchallException1;
				if (( __temp_catchall2 is global::haxe.lang.HaxeException )) {
					__temp_catchall2 = ((global::haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
				}
				
				if (( __temp_catchall2 is global::thx.Error )) {
					global::thx.Error e = ((global::thx.Error) (__temp_catchall2) );
					{
						return alt;
					}
					
				}
				else {
					throw;
				}
				
			}
			
			
			return default(int);
		}
		
		
		public static double toFloat(object @value) {
			unchecked {
				if (( null == @value )) {
					throw global::haxe.lang.HaxeException.wrap(new global::thx.Error("unable to convert null to Float", null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"toFloat", "thx.Convert", "Convert.hx"}, new int[]{1981972957}, new double[]{((double) (56) )})));
				}
				
				switch (global::thx.Types.toString(global::Type.@typeof(((object) (@value) )))) {
					case "Bool":
					{
						if (global::haxe.lang.Runtime.toBool(@value)) {
							return 1.0;
						}
						else {
							return 0.0;
						}
						
					}
					
					
					case "Date":
					{
						return ( ((double) (((long) (( ((long) (global::System.TimeZone.CurrentTimeZone.ToUniversalTime(((global::System.DateTime) (((global::Date) (@value) ).date) )).Ticks) ) - ((long) (global::Date.epochTicks) ) )) )) ) / ((double) (global::System.TimeSpan.TicksPerMillisecond) ) );
					}
					
					
					case "Float":
					case "Int":
					{
						return ((double) (global::haxe.lang.Runtime.toDouble(@value)) );
					}
					
					
					case "String":
					{
						if (global::thx.Floats.canParse(global::haxe.lang.Runtime.toString(@value))) {
							return global::thx.Floats.parse(global::haxe.lang.Runtime.toString(@value));
						}
						else {
							throw global::haxe.lang.HaxeException.wrap(new global::thx.Error(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("unable to convert ", global::Std.@string(@value)), " to Float"), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"toFloat", "thx.Convert", "Convert.hx"}, new int[]{1981972957}, new double[]{((double) (67) )})));
						}
						
					}
					
					
					default:
					{
						throw global::haxe.lang.HaxeException.wrap(new global::thx.Error(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("unable to convert ", global::Std.@string(@value)), " to Float"), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"toFloat", "thx.Convert", "Convert.hx"}, new int[]{1981972957}, new double[]{((double) (67) )})));
					}
					
				}
				
			}
		}
		
		
		public static double toFloatOr(object @value, double alt) {
			try {
				return global::thx.Convert.toFloat(@value);
			}
			catch (global::System.Exception __temp_catchallException1){
				global::haxe.lang.Exceptions.exception = __temp_catchallException1;
				object __temp_catchall2 = __temp_catchallException1;
				if (( __temp_catchall2 is global::haxe.lang.HaxeException )) {
					__temp_catchall2 = ((global::haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
				}
				
				if (( __temp_catchall2 is global::thx.Error )) {
					global::thx.Error e = ((global::thx.Error) (__temp_catchall2) );
					{
						return alt;
					}
					
				}
				else {
					throw;
				}
				
			}
			
			
			return default(double);
		}
		
		
		public static bool toBool(object @value) {
			unchecked {
				if (( null == @value )) {
					throw global::haxe.lang.HaxeException.wrap(new global::thx.Error("unable to convert null to Bool", null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"toBool", "thx.Convert", "Convert.hx"}, new int[]{1981972957}, new double[]{((double) (75) )})));
				}
				
				switch (global::thx.Types.toString(global::Type.@typeof(((object) (@value) )))) {
					case "Bool":
					{
						return global::haxe.lang.Runtime.toBool(@value);
					}
					
					
					case "Float":
					case "Int":
					{
						return ( ((double) (global::haxe.lang.Runtime.toDouble(@value)) ) != 0 );
					}
					
					
					case "String":
					{
						if (global::thx.Bools.canParse(global::haxe.lang.Runtime.toString(@value))) {
							return global::thx.Bools.parse(global::haxe.lang.Runtime.toString(@value));
						}
						else {
							throw global::haxe.lang.HaxeException.wrap(new global::thx.Error(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("unable to convert ", global::Std.@string(@value)), " to Bool"), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"toBool", "thx.Convert", "Convert.hx"}, new int[]{1981972957}, new double[]{((double) (84) )})));
						}
						
					}
					
					
					default:
					{
						throw global::haxe.lang.HaxeException.wrap(new global::thx.Error(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("unable to convert ", global::Std.@string(@value)), " to Bool"), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"toBool", "thx.Convert", "Convert.hx"}, new int[]{1981972957}, new double[]{((double) (84) )})));
					}
					
				}
				
			}
		}
		
		
		public static bool toBoolOr(object @value, bool alt) {
			try {
				return global::thx.Convert.toBool(@value);
			}
			catch (global::System.Exception __temp_catchallException1){
				global::haxe.lang.Exceptions.exception = __temp_catchallException1;
				object __temp_catchall2 = __temp_catchallException1;
				if (( __temp_catchall2 is global::haxe.lang.HaxeException )) {
					__temp_catchall2 = ((global::haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
				}
				
				if (( __temp_catchall2 is global::thx.Error )) {
					global::thx.Error e = ((global::thx.Error) (__temp_catchall2) );
					{
						return alt;
					}
					
				}
				else {
					throw;
				}
				
			}
			
			
			return default(bool);
		}
		
		
		public static global::Date toDate(object @value) {
			unchecked {
				if (( null == @value )) {
					throw global::haxe.lang.HaxeException.wrap(new global::thx.Error("unable to convert null to Date", null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"toDate", "thx.Convert", "Convert.hx"}, new int[]{1981972957}, new double[]{((double) (92) )})));
				}
				
				switch (global::thx.Types.toString(global::Type.@typeof(((object) (@value) )))) {
					case "Date":
					{
						return ((global::Date) (@value) );
					}
					
					
					case "Float":
					case "Int":
					{
						return new global::Date(((global::System.DateTime) (global::System.TimeZone.CurrentTimeZone.ToLocalTime(((global::System.DateTime) (new global::System.DateTime(((long) (( ((long) (( ((double) (global::haxe.lang.Runtime.toDouble(@value)) ) * ((double) (global::System.TimeSpan.TicksPerMillisecond) ) )) ) + ((long) (global::Date.epochTicks) ) )) ))) ))) ));
					}
					
					
					case "String":
					{
						try {
							return global::Date.fromString(global::haxe.lang.Runtime.toString(@value));
						}
						catch (global::System.Exception __temp_catchallException1){
							global::haxe.lang.Exceptions.exception = __temp_catchallException1;
							object __temp_catchall2 = __temp_catchallException1;
							if (( __temp_catchall2 is global::haxe.lang.HaxeException )) {
								__temp_catchall2 = ((global::haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
							}
							
							{
								object e = __temp_catchall2;
								throw global::haxe.lang.HaxeException.wrap(new global::thx.Error(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("unable to convert string ", global::Std.@string(@value)), " to Date"), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"toDate", "thx.Convert", "Convert.hx"}, new int[]{1981972957}, new double[]{((double) (100) )})));
							}
							
						}
						
						
					}
					
					
					default:
					{
						throw global::haxe.lang.HaxeException.wrap(new global::thx.Error(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("unable to convert ", global::Std.@string(@value)), " to Date"), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"toDate", "thx.Convert", "Convert.hx"}, new int[]{1981972957}, new double[]{((double) (104) )})));
					}
					
				}
				
			}
		}
		
		
		public static global::Date toDateOr(object @value, global::Date alt) {
			try {
				return global::thx.Convert.toDate(@value);
			}
			catch (global::System.Exception __temp_catchallException1){
				global::haxe.lang.Exceptions.exception = __temp_catchallException1;
				object __temp_catchall2 = __temp_catchallException1;
				if (( __temp_catchall2 is global::haxe.lang.HaxeException )) {
					__temp_catchall2 = ((global::haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
				}
				
				if (( __temp_catchall2 is global::thx.Error )) {
					global::thx.Error e = ((global::thx.Error) (__temp_catchall2) );
					{
						return alt;
					}
					
				}
				else {
					throw;
				}
				
			}
			
			
			return null;
		}
		
		
		public static global::Array<long> toDateTime(object @value) {
			unchecked {
				if (( null == @value )) {
					return null;
				}
				
				switch (global::thx.Types.toString(global::Type.@typeof(((object) (@value) )))) {
					case "Date":
					{
						return global::thx._DateTime.DateTime_Impl_.fromDate(((global::Date) (@value) ));
					}
					
					
					case "Float":
					case "Int":
					{
						return global::thx._DateTime.DateTime_Impl_.fromTime(((double) (global::haxe.lang.Runtime.toDouble(@value)) ));
					}
					
					
					case "String":
					{
						try {
							return global::thx._DateTime.DateTime_Impl_.fromString(global::haxe.lang.Runtime.toString(@value));
						}
						catch (global::System.Exception __temp_catchallException1){
							global::haxe.lang.Exceptions.exception = __temp_catchallException1;
							object __temp_catchall2 = __temp_catchallException1;
							if (( __temp_catchall2 is global::haxe.lang.HaxeException )) {
								__temp_catchall2 = ((global::haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
							}
							
							{
								object e = __temp_catchall2;
								throw global::haxe.lang.HaxeException.wrap(new global::thx.Error(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("unable to convert string ", global::Std.@string(@value)), " to DateTime"), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"toDateTime", "thx.Convert", "Convert.hx"}, new int[]{1981972957}, new double[]{((double) (120) )})));
							}
							
						}
						
						
					}
					
					
					default:
					{
						throw global::haxe.lang.HaxeException.wrap(new global::thx.Error(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("unable to convert ", global::Std.@string(@value)), " to DateTime"), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"toDateTime", "thx.Convert", "Convert.hx"}, new int[]{1981972957}, new double[]{((double) (124) )})));
					}
					
				}
				
			}
		}
		
		
		public static global::Array<long> toDateTimeOr(object @value, global::Array<long> alt) {
			global::Array<long> v = null;
			try {
				v = global::thx.Convert.toDateTime(@value);
			}
			catch (global::System.Exception __temp_catchallException1){
				global::haxe.lang.Exceptions.exception = __temp_catchallException1;
				object __temp_catchall2 = __temp_catchallException1;
				if (( __temp_catchall2 is global::haxe.lang.HaxeException )) {
					__temp_catchall2 = ((global::haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
				}
				
				if (( __temp_catchall2 is global::thx.Error )) {
					global::thx.Error e = ((global::thx.Error) (__temp_catchall2) );
					{
						v = null;
					}
					
				}
				else {
					throw;
				}
				
			}
			
			
			if (( null == v )) {
				return alt;
			}
			else {
				return v;
			}
			
		}
		
		
		public static global::haxe.lang.Null<long> toDateTimeUtc(object @value) {
			unchecked {
				if (( null == @value )) {
					return default(global::haxe.lang.Null<long>);
				}
				
				switch (global::thx.Types.toString(global::Type.@typeof(((object) (@value) )))) {
					case "Date":
					{
						return new global::haxe.lang.Null<long>(global::thx._DateTimeUtc.DateTimeUtc_Impl_.fromDate(((global::Date) (@value) )), true);
					}
					
					
					case "Float":
					case "Int":
					{
						return new global::haxe.lang.Null<long>(global::thx._DateTimeUtc.DateTimeUtc_Impl_.fromTime(((double) (global::haxe.lang.Runtime.toDouble(@value)) )), true);
					}
					
					
					case "String":
					{
						try {
							return new global::haxe.lang.Null<long>(global::thx._DateTimeUtc.DateTimeUtc_Impl_.fromString(global::haxe.lang.Runtime.toString(@value)), true);
						}
						catch (global::System.Exception __temp_catchallException1){
							global::haxe.lang.Exceptions.exception = __temp_catchallException1;
							object __temp_catchall2 = __temp_catchallException1;
							if (( __temp_catchall2 is global::haxe.lang.HaxeException )) {
								__temp_catchall2 = ((global::haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
							}
							
							{
								object e = __temp_catchall2;
								throw global::haxe.lang.HaxeException.wrap(new global::thx.Error(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("unable to convert string ", global::Std.@string(@value)), " to DateTimeUtc"), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"toDateTimeUtc", "thx.Convert", "Convert.hx"}, new int[]{1981972957}, new double[]{((double) (142) )})));
							}
							
						}
						
						
					}
					
					
					default:
					{
						throw global::haxe.lang.HaxeException.wrap(new global::thx.Error(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("unable to convert ", global::Std.@string(@value)), " to DateTimeUtc"), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"toDateTimeUtc", "thx.Convert", "Convert.hx"}, new int[]{1981972957}, new double[]{((double) (146) )})));
					}
					
				}
				
			}
		}
		
		
		public static global::haxe.lang.Null<long> toDateTimeUtcOr(object @value, long alt) {
			global::haxe.lang.Null<long> v = default(global::haxe.lang.Null<long>);
			try {
				v = global::thx.Convert.toDateTimeUtc(@value);
			}
			catch (global::System.Exception __temp_catchallException1){
				global::haxe.lang.Exceptions.exception = __temp_catchallException1;
				object __temp_catchall2 = __temp_catchallException1;
				if (( __temp_catchall2 is global::haxe.lang.HaxeException )) {
					__temp_catchall2 = ((global::haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
				}
				
				if (( __temp_catchall2 is global::thx.Error )) {
					global::thx.Error e = ((global::thx.Error) (__temp_catchall2) );
					{
						v = default(global::haxe.lang.Null<long>);
					}
					
				}
				else {
					throw;
				}
				
			}
			
			
			if ( ! (v.hasValue) ) {
				return new global::haxe.lang.Null<long>(alt, true);
			}
			else {
				return v;
			}
			
		}
		
		
		public static object toObject(object @value) {
			unchecked {
				if (( null == @value )) {
					return null;
				}
				
				if (global::Reflect.isObject(@value)) {
					return ((object) (@value) );
				}
				
				if (string.Equals(global::thx.Types.toString(global::Type.@typeof(((object) (@value) ))), "String")) {
					try {
						return new global::haxe.format.JsonParser(global::haxe.lang.Runtime.toString(@value)).parseRec();
					}
					catch (global::System.Exception __temp_catchallException1){
						global::haxe.lang.Exceptions.exception = __temp_catchallException1;
						object __temp_catchall2 = __temp_catchallException1;
						if (( __temp_catchall2 is global::haxe.lang.HaxeException )) {
							__temp_catchall2 = ((global::haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
						}
						
						{
							object e = __temp_catchall2;
							throw global::haxe.lang.HaxeException.wrap(new global::thx.Error(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("unable to convert string ", global::Std.@string(@value)), " to Object"), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"toObject", "thx.Convert", "Convert.hx"}, new int[]{1981972957}, new double[]{((double) (165) )})));
						}
						
					}
					
					
				}
				else {
					throw global::haxe.lang.HaxeException.wrap(new global::thx.Error(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("unable to convert ", global::Std.@string(@value)), " to Object"), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"toObject", "thx.Convert", "Convert.hx"}, new int[]{1981972957}, new double[]{((double) (167) )})));
				}
				
			}
		}
		
		
		public static object toObjectOr(object @value, object alt) {
			if (( null == @value )) {
				return alt;
			}
			
			try {
				return global::thx.Convert.toObject(@value);
			}
			catch (global::System.Exception __temp_catchallException1){
				global::haxe.lang.Exceptions.exception = __temp_catchallException1;
				object __temp_catchall2 = __temp_catchallException1;
				if (( __temp_catchall2 is global::haxe.lang.HaxeException )) {
					__temp_catchall2 = ((global::haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
				}
				
				if (( __temp_catchall2 is global::thx.Error )) {
					global::thx.Error e = ((global::thx.Error) (__temp_catchall2) );
					{
						return alt;
					}
					
				}
				else {
					throw;
				}
				
			}
			
			
			return null;
		}
		
		
		public static global::Array<object> toArrayString(object @value) {
			return global::thx.Convert.toArray<object>(((object) (@value) ), ((global::haxe.lang.Function) (new global::haxe.lang.Closure(typeof(global::thx.Convert), "toString", 946786476)) ));
		}
		
		
		public static global::Array<object> toArrayStringOr(object @value, global::Array<object> alt) {
			if (( null == @value )) {
				return alt;
			}
			
			try {
				return global::thx.Convert.toArrayString(@value);
			}
			catch (global::System.Exception __temp_catchallException1){
				global::haxe.lang.Exceptions.exception = __temp_catchallException1;
				object __temp_catchall2 = __temp_catchallException1;
				if (( __temp_catchall2 is global::haxe.lang.HaxeException )) {
					__temp_catchall2 = ((global::haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
				}
				
				if (( __temp_catchall2 is global::thx.Error )) {
					global::thx.Error e = ((global::thx.Error) (__temp_catchall2) );
					{
						return alt;
					}
					
				}
				else {
					throw;
				}
				
			}
			
			
			return null;
		}
		
		
		public static global::Array<int> toArrayInt(object @value) {
			return global::thx.Convert.toArray<int>(((object) (@value) ), ((global::haxe.lang.Function) (new global::haxe.lang.Closure(typeof(global::thx.Convert), "toInt", 336707124)) ));
		}
		
		
		public static global::Array<int> toArrayIntOr(object @value, global::Array<int> alt) {
			if (( null == @value )) {
				return alt;
			}
			
			try {
				return global::thx.Convert.toArrayInt(@value);
			}
			catch (global::System.Exception __temp_catchallException1){
				global::haxe.lang.Exceptions.exception = __temp_catchallException1;
				object __temp_catchall2 = __temp_catchallException1;
				if (( __temp_catchall2 is global::haxe.lang.HaxeException )) {
					__temp_catchall2 = ((global::haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
				}
				
				if (( __temp_catchall2 is global::thx.Error )) {
					global::thx.Error e = ((global::thx.Error) (__temp_catchall2) );
					{
						return alt;
					}
					
				}
				else {
					throw;
				}
				
			}
			
			
			return null;
		}
		
		
		public static global::Array<double> toArrayFloat(object @value) {
			return global::thx.Convert.toArray<double>(((object) (@value) ), ((global::haxe.lang.Function) (new global::haxe.lang.Closure(typeof(global::thx.Convert), "toFloat", 1327174177)) ));
		}
		
		
		public static global::Array<double> toArrayFloatOr(object @value, global::Array<double> alt) {
			if (( null == @value )) {
				return alt;
			}
			
			try {
				return global::thx.Convert.toArrayFloat(@value);
			}
			catch (global::System.Exception __temp_catchallException1){
				global::haxe.lang.Exceptions.exception = __temp_catchallException1;
				object __temp_catchall2 = __temp_catchallException1;
				if (( __temp_catchall2 is global::haxe.lang.HaxeException )) {
					__temp_catchall2 = ((global::haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
				}
				
				if (( __temp_catchall2 is global::thx.Error )) {
					global::thx.Error e = ((global::thx.Error) (__temp_catchall2) );
					{
						return alt;
					}
					
				}
				else {
					throw;
				}
				
			}
			
			
			return null;
		}
		
		
		public static global::Array<bool> toArrayBool(object @value) {
			return global::thx.Convert.toArray<bool>(((object) (@value) ), ((global::haxe.lang.Function) (new global::haxe.lang.Closure(typeof(global::thx.Convert), "toBool", 1993666373)) ));
		}
		
		
		public static global::Array<bool> toArrayBoolOr(object @value, global::Array<bool> alt) {
			if (( null == @value )) {
				return alt;
			}
			
			try {
				return global::thx.Convert.toArrayBool(@value);
			}
			catch (global::System.Exception __temp_catchallException1){
				global::haxe.lang.Exceptions.exception = __temp_catchallException1;
				object __temp_catchall2 = __temp_catchallException1;
				if (( __temp_catchall2 is global::haxe.lang.HaxeException )) {
					__temp_catchall2 = ((global::haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
				}
				
				if (( __temp_catchall2 is global::thx.Error )) {
					global::thx.Error e = ((global::thx.Error) (__temp_catchall2) );
					{
						return alt;
					}
					
				}
				else {
					throw;
				}
				
			}
			
			
			return null;
		}
		
		
		public static global::Array<object> toArrayDate(object @value) {
			return global::thx.Convert.toArray<object>(((object) (@value) ), ((global::haxe.lang.Function) (new global::haxe.lang.Closure(typeof(global::thx.Convert), "toDate", 2015150409)) ));
		}
		
		
		public static global::Array<object> toArrayDateOr(object @value, global::Array<object> alt) {
			if (( null == @value )) {
				return alt;
			}
			
			try {
				return global::thx.Convert.toArrayDate(@value);
			}
			catch (global::System.Exception __temp_catchallException1){
				global::haxe.lang.Exceptions.exception = __temp_catchallException1;
				object __temp_catchall2 = __temp_catchallException1;
				if (( __temp_catchall2 is global::haxe.lang.HaxeException )) {
					__temp_catchall2 = ((global::haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
				}
				
				if (( __temp_catchall2 is global::thx.Error )) {
					global::thx.Error e = ((global::thx.Error) (__temp_catchall2) );
					{
						return alt;
					}
					
				}
				else {
					throw;
				}
				
			}
			
			
			return null;
		}
		
		
		public static global::Array<object> toArrayDateTime(object @value) {
			return global::thx.Convert.toArray<object>(((object) (@value) ), ((global::haxe.lang.Function) (new global::haxe.lang.Closure(typeof(global::thx.Convert), "toDateTime", 1277661686)) ));
		}
		
		
		public static global::Array<object> toArrayDateTimeOr(object @value, global::Array<object> alt) {
			if (( null == @value )) {
				return alt;
			}
			
			try {
				return global::thx.Convert.toArrayDateTime(@value);
			}
			catch (global::System.Exception __temp_catchallException1){
				global::haxe.lang.Exceptions.exception = __temp_catchallException1;
				object __temp_catchall2 = __temp_catchallException1;
				if (( __temp_catchall2 is global::haxe.lang.HaxeException )) {
					__temp_catchall2 = ((global::haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
				}
				
				if (( __temp_catchall2 is global::thx.Error )) {
					global::thx.Error e = ((global::thx.Error) (__temp_catchall2) );
					{
						return alt;
					}
					
				}
				else {
					throw;
				}
				
			}
			
			
			return null;
		}
		
		
		public static global::Array<object> toArrayObject(object @value) {
			return global::thx.Convert.toArray<object>(((object) (@value) ), ((global::haxe.lang.Function) (new global::haxe.lang.Closure(typeof(global::thx.Convert), "toObject", 1014900378)) ));
		}
		
		
		public static global::Array<object> toArrayObjectOr(object @value, global::Array<object> alt) {
			if (( null == @value )) {
				return alt;
			}
			
			try {
				return global::thx.Convert.toArrayObject(@value);
			}
			catch (global::System.Exception __temp_catchallException1){
				global::haxe.lang.Exceptions.exception = __temp_catchallException1;
				object __temp_catchall2 = __temp_catchallException1;
				if (( __temp_catchall2 is global::haxe.lang.HaxeException )) {
					__temp_catchall2 = ((global::haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
				}
				
				if (( __temp_catchall2 is global::thx.Error )) {
					global::thx.Error e = ((global::thx.Error) (__temp_catchall2) );
					{
						return alt;
					}
					
				}
				else {
					throw;
				}
				
			}
			
			
			return null;
		}
		
		
		public static global::Array<T> toArray<T>(object @value, global::haxe.lang.Function convert) {
			unchecked {
				if (( null == @value )) {
					return new global::Array<T>(new T[]{});
				}
				
				if (( @value is global::Array )) {
					return ((global::Array<T>) (global::Array<object>.__hx_cast<T>(((global::Array) (global::haxe.lang.Runtime.callField(((global::Array) (@value) ), "map", 5442204, new global::Array<object>(new object[]{convert}))) ))) );
				}
				else {
					throw global::haxe.lang.HaxeException.wrap(new global::thx.Error(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("unable to convert ", global::Std.@string(@value)), " to Array<T>"), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"toArray", "thx.Convert", "Convert.hx"}, new int[]{1981972957}, new double[]{((double) (236) )})));
				}
				
			}
		}
		
		
		public static global::haxe.ds.StringMap<T> toMap<T>(object @value, global::haxe.lang.Function convert) {
			object obj = global::thx.Convert.toObject(@value);
			return ((global::haxe.ds.StringMap<T>) (global::haxe.ds.StringMap<object>.__hx_cast<T>(((global::haxe.ds.StringMap) (global::thx.Arrays.reduce<object, object>(((global::Array<object>) (global::Reflect.fields(obj)) ), ((global::haxe.lang.Function) (new global::thx.Convert_toMap_241__Fun<T>(obj, convert)) ), ((object) (new global::haxe.ds.StringMap<T>()) ))) ))) );
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::thx.Convert(global::haxe.lang.EmptyObject.EMPTY);
		}
		
		
		public static new object __hx_create(global::Array arr) {
			return new global::thx.Convert();
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class Convert_toMap_241__Fun<T> : global::haxe.lang.Function {
		
		public Convert_toMap_241__Fun(object obj, global::haxe.lang.Function convert) : base(2, 0) {
			this.obj = obj;
			this.convert = convert;
		}
		
		
		public override object __hx_invoke2_o(double __fn_float1, object __fn_dyn1, double __fn_float2, object __fn_dyn2) {
			string field = ( (( __fn_dyn2 == global::haxe.lang.Runtime.undefined )) ? (global::haxe.lang.Runtime.toString(__fn_float2)) : (global::haxe.lang.Runtime.toString(__fn_dyn2)) );
			global::haxe.ds.StringMap<T> map = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((global::haxe.ds.StringMap<T>) (global::haxe.ds.StringMap<object>.__hx_cast<T>(((global::haxe.ds.StringMap) (((object) (__fn_float1) )) ))) )) : (((global::haxe.ds.StringMap<T>) (global::haxe.ds.StringMap<object>.__hx_cast<T>(((global::haxe.ds.StringMap) (__fn_dyn1) ))) )) );
			map.@set(((string) (field) ), global::haxe.lang.Runtime.genericCast<T>(this.convert.__hx_invoke1_o(default(double), global::Reflect.field(this.obj, field))));
			return map;
		}
		
		
		public object obj;
		
		public global::haxe.lang.Function convert;
		
	}
}


