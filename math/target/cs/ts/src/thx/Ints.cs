// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class Ints : global::haxe.lang.HxObject {
		
		static Ints() {
			global::thx.Ints.pattern_parse = new global::EReg("^[ \t\r\n]*[+-]?(\\d+|0x[0-9A-F]+)", "i");
			global::thx.Ints.BASE = "0123456789abcdefghijklmnopqrstuvwxyz";
			global::thx.Ints.order = ((global::haxe.lang.Function) (( (( global::thx.Ints_Anon_268__Fun.__hx_current != null )) ? (global::thx.Ints_Anon_268__Fun.__hx_current) : (global::thx.Ints_Anon_268__Fun.__hx_current = ((global::thx.Ints_Anon_268__Fun) (new global::thx.Ints_Anon_268__Fun()) )) )) );
			object __temp_stmt2 = null;
			{
				global::haxe.lang.Function __temp_odecl1 = ( (( global::thx.Ints_Anon_271__Fun.__hx_current != null )) ? (global::thx.Ints_Anon_271__Fun.__hx_current) : (global::thx.Ints_Anon_271__Fun.__hx_current = ((global::thx.Ints_Anon_271__Fun) (new global::thx.Ints_Anon_271__Fun()) )) );
				__temp_stmt2 = new global::haxe.lang.DynamicObject(new int[]{265544154}, new object[]{__temp_odecl1}, new int[]{1357975336}, new double[]{((double) (0) )});
			}
			
			global::thx.Ints.monoid = ((object) (__temp_stmt2) );
		}
		
		
		public Ints(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public Ints() {
			global::thx.Ints.__hx_ctor_thx_Ints(this);
		}
		
		
		public static void __hx_ctor_thx_Ints(global::thx.Ints __temp_me112) {
		}
		
		
		public static global::EReg pattern_parse;
		
		public static int abs(int v) {
			if (( v < 0 )) {
				return  - (v) ;
			}
			else {
				return v;
			}
			
		}
		
		
		public static bool canParse(string s) {
			return global::thx.Ints.pattern_parse.match(s);
		}
		
		
		public static int clamp(int v, int min, int max) {
			if (( v < min )) {
				return min;
			}
			else if (( v > max )) {
				return max;
			}
			else {
				return v;
			}
			
		}
		
		
		public static int clampSym(int v, int max) {
			int min =  - (max) ;
			if (( v < min )) {
				return min;
			}
			else if (( v > max )) {
				return max;
			}
			else {
				return v;
			}
			
		}
		
		
		public static int compare(int a, int b) {
			return ( a - b );
		}
		
		
		public static int gcd(int m, int n) {
			if (( m < 0 )) {
				m =  - (m) ;
			}
			else {
				m = m;
			}
			
			if (( n < 0 )) {
				n =  - (n) ;
			}
			else {
				n = n;
			}
			
			if (( n == 0 )) {
				return m;
			}
			
			return global::thx.Ints.gcd(n, ( m % n ));
		}
		
		
		public static int interpolate(double f, double a, double b) {
			return global::Math.round(( a + ( (( b - a )) * f ) ));
		}
		
		
		public static bool isEven(int v) {
			unchecked {
				return ( ( v % 2 ) == 0 );
			}
		}
		
		
		public static bool isOdd(int v) {
			unchecked {
				return ( ( v % 2 ) != 0 );
			}
		}
		
		
		public static string lpad(int v, string pad, int len) {
			if (string.Equals(pad, null)) {
				pad = "0";
			}
			
			bool neg = false;
			if (( v < 0 )) {
				neg = true;
				v =  - (v) ;
			}
			
			return global::haxe.lang.Runtime.concat((( (neg) ? ("-") : ("") )), global::StringTools.lpad(global::haxe.lang.Runtime.concat("", global::haxe.lang.Runtime.toString(v)), pad, len));
		}
		
		
		public static int lcm(int m, int n) {
			if (( m < 0 )) {
				m =  - (m) ;
			}
			else {
				m = m;
			}
			
			if (( n < 0 )) {
				n =  - (n) ;
			}
			else {
				n = n;
			}
			
			if (( n == 0 )) {
				return m;
			}
			
			return ( m * (((int) (( n / global::thx.Ints.gcd(m, n) )) )) );
		}
		
		
		public static string rpad(int v, string pad, int len) {
			if (string.Equals(pad, null)) {
				pad = "0";
			}
			
			return global::StringTools.rpad(global::haxe.lang.Runtime.concat("", global::haxe.lang.Runtime.toString(v)), pad, len);
		}
		
		
		public static int max(int a, int b) {
			if (( a > b )) {
				return a;
			}
			else {
				return b;
			}
			
		}
		
		
		public static int min(int a, int b) {
			if (( a < b )) {
				return a;
			}
			else {
				return b;
			}
			
		}
		
		
		public static global::haxe.lang.Null<int> parse(string s, global::haxe.lang.Null<int> @base) {
			unchecked {
				if (( @base.hasValue && (( ( (@base).@value < 2 ) || ( (@base).@value > global::thx.Ints.BASE.Length ) )) )) {
					throw global::haxe.lang.HaxeException.wrap(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("invalid base ", global::haxe.lang.Runtime.toString((@base).toDynamic())), ", it must be between 2 and "), global::haxe.lang.Runtime.toString(global::thx.Ints.BASE.Length)));
				}
				
				s = s.Trim().ToLowerInvariant();
				int sign = default(int);
				if (s.StartsWith("+")) {
					s = global::haxe.lang.StringExt.substring(s, 1, default(global::haxe.lang.Null<int>));
					sign = 1;
				}
				else if (s.StartsWith("-")) {
					s = global::haxe.lang.StringExt.substring(s, 1, default(global::haxe.lang.Null<int>));
					sign = -1;
				}
				else {
					sign = 1;
				}
				
				if (( s.Length == 0 )) {
					return default(global::haxe.lang.Null<int>);
				}
				
				if (s.StartsWith("0x")) {
					if (( @base.hasValue && ( ! (global::haxe.lang.Runtime.eq(16, (@base).toDynamic())) ) )) {
						return default(global::haxe.lang.Null<int>);
					}
					
					@base = new global::haxe.lang.Null<int>(16, true);
					s = global::haxe.lang.StringExt.substring(s, 2, default(global::haxe.lang.Null<int>));
				}
				else if ( ! (@base.hasValue) ) {
					@base = new global::haxe.lang.Null<int>(10, true);
				}
				
				int[] acc = new int[]{0};
				try {
					global::thx.Strings.map<object>(((string) (s) ), ((global::haxe.lang.Function) (new global::thx.Ints_parse_160__Fun(@base, acc)) ));
				}
				catch (global::System.Exception __temp_catchallException1){
					global::haxe.lang.Exceptions.exception = __temp_catchallException1;
					object __temp_catchall2 = __temp_catchallException1;
					if (( __temp_catchall2 is global::haxe.lang.HaxeException )) {
						__temp_catchall2 = ((global::haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
					}
					
					{
						object e = __temp_catchall2;
					}
					
				}
				
				
				return new global::haxe.lang.Null<int>(( acc[0] * sign ), true);
			}
		}
		
		
		public static int random(global::haxe.lang.Null<int> min, int max) {
			unchecked {
				int __temp_min109 = ( ( ! (min.hasValue) ) ? (0) : ((min).@value) );
				return ( global::Std.random(( max + 1 )) + __temp_min109 );
			}
		}
		
		
		public static global::Array<int> range(int start, global::haxe.lang.Null<int> stop, global::haxe.lang.Null<int> step) {
			unchecked {
				int __temp_step110 = ( ( ! (step.hasValue) ) ? (1) : ((step).@value) );
				if ( ! (stop.hasValue) ) {
					stop = new global::haxe.lang.Null<int>(start, true);
					start = 0;
				}
				
				if (( ( ((double) ((( (stop).@value - start ))) ) / __temp_step110 ) == global::Math.POSITIVE_INFINITY )) {
					throw global::haxe.lang.HaxeException.wrap("infinite range");
				}
				
				global::Array<int> range = new global::Array<int>(new int[]{});
				int i = -1;
				int j = default(int);
				if (( __temp_step110 < 0 )) {
					while (true) {
						j = ( start + ( __temp_step110 *  ++ i ) );
						if ( ! ((( j > (stop).@value ))) ) {
							break;
						}
						
						range.push(j);
					}
					
				}
				else {
					while (true) {
						j = ( start + ( __temp_step110 *  ++ i ) );
						if ( ! ((( j < (stop).@value ))) ) {
							break;
						}
						
						range.push(j);
					}
					
				}
				
				return range;
			}
		}
		
		
		public static object rangeIter(int start, global::haxe.lang.Null<int> stop, global::haxe.lang.Null<int> step) {
			unchecked {
				int __temp_step111 = ( ( ! (step.hasValue) ) ? (1) : ((step).@value) );
				return new global::thx.RangeIterator(start, stop, new global::haxe.lang.Null<int>(__temp_step111, true));
			}
		}
		
		
		public static string BASE;
		
		public static string toString(int @value, int @base) {
			unchecked {
				if (( ( @base < 2 ) || ( @base > global::thx.Ints.BASE.Length ) )) {
					throw global::haxe.lang.HaxeException.wrap(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("invalid base ", global::haxe.lang.Runtime.toString(@base)), ", it must be between 2 and "), global::haxe.lang.Runtime.toString(global::thx.Ints.BASE.Length)));
				}
				
				if (( ( @base == 10 ) || ( @value == 0 ) )) {
					return global::haxe.lang.Runtime.concat("", global::haxe.lang.Runtime.toString(@value));
				}
				
				string buf = "";
				int abs = ( (( @value < 0 )) ? ( - (@value) ) : (@value) );
				while (( abs > 0 )) {
					buf = global::haxe.lang.Runtime.concat(global::haxe.lang.StringExt.charAt(global::thx.Ints.BASE, ( abs % @base )), buf);
					abs = ((int) (( abs / @base )) );
				}
				
				return global::haxe.lang.Runtime.concat((( (( @value < 0 )) ? ("-") : ("") )), buf);
			}
		}
		
		
		public static string toBase(int @value, int @base) {
			return global::thx.Ints.toString(@value, @base);
		}
		
		
		public static bool toBool(int v) {
			return ( v != 0 );
		}
		
		
		public static int toInt(string s, global::haxe.lang.Null<int> @base) {
			return (global::thx.Ints.parse(s, @base)).@value;
		}
		
		
		public static int sign(int @value) {
			unchecked {
				if (( @value < 0 )) {
					return -1;
				}
				else {
					return 1;
				}
				
			}
		}
		
		
		public static int wrapCircular(int v, int max) {
			v %= max;
			if (( v < 0 )) {
				v += max;
			}
			
			return v;
		}
		
		
		public static global::haxe.lang.Function order;
		
		public static object monoid;
		
		public static new object __hx_createEmpty() {
			return new global::thx.Ints(global::haxe.lang.EmptyObject.EMPTY);
		}
		
		
		public static new object __hx_create(global::Array arr) {
			return new global::thx.Ints();
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class Ints_parse_160__Fun : global::haxe.lang.Function {
		
		public Ints_parse_160__Fun(global::haxe.lang.Null<int> @base, int[] acc) : base(1, 0) {
			this.@base = @base;
			this.acc = acc;
		}
		
		
		public override object __hx_invoke1_o(double __fn_float1, object __fn_dyn1) {
			string c = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (global::haxe.lang.Runtime.toString(__fn_float1)) : (global::haxe.lang.Runtime.toString(__fn_dyn1)) );
			int i = global::haxe.lang.StringExt.indexOf(global::thx.Ints.BASE, c, default(global::haxe.lang.Null<int>));
			if (( ( i < 0 ) || ( i >= (this.@base).@value ) )) {
				throw global::haxe.lang.HaxeException.wrap("invalid");
			}
			
			this.acc[0] = ( ( this.acc[0] * (this.@base).@value ) + i );
			return null;
		}
		
		
		public global::haxe.lang.Null<int> @base;
		
		public int[] acc;
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class Ints_Anon_268__Fun : global::haxe.lang.Function {
		
		public Ints_Anon_268__Fun() : base(2, 0) {
		}
		
		
		public static global::thx.Ints_Anon_268__Fun __hx_current;
		
		public override object __hx_invoke2_o(double __fn_float1, object __fn_dyn1, double __fn_float2, object __fn_dyn2) {
			int i1 = ( (( __fn_dyn2 == global::haxe.lang.Runtime.undefined )) ? (((int) (__fn_float2) )) : (((int) (global::haxe.lang.Runtime.toInt(__fn_dyn2)) )) );
			int i0 = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((int) (__fn_float1) )) : (((int) (global::haxe.lang.Runtime.toInt(__fn_dyn1)) )) );
			if (( i0 > i1 )) {
				return global::thx.OrderingImpl.GT;
			}
			else if (( i0 == i1 )) {
				return global::thx.OrderingImpl.EQ;
			}
			else {
				return global::thx.OrderingImpl.LT;
			}
			
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class Ints_Anon_271__Fun : global::haxe.lang.Function {
		
		public Ints_Anon_271__Fun() : base(2, 1) {
		}
		
		
		public static global::thx.Ints_Anon_271__Fun __hx_current;
		
		public override double __hx_invoke2_f(double __fn_float1, object __fn_dyn1, double __fn_float2, object __fn_dyn2) {
			int b = ( (( __fn_dyn2 == global::haxe.lang.Runtime.undefined )) ? (((int) (__fn_float2) )) : (((int) (global::haxe.lang.Runtime.toInt(__fn_dyn2)) )) );
			int a = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((int) (__fn_float1) )) : (((int) (global::haxe.lang.Runtime.toInt(__fn_dyn1)) )) );
			return ((double) (( a + b )) );
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class RangeIterator : global::haxe.lang.HxObject {
		
		public RangeIterator(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public RangeIterator(int start, global::haxe.lang.Null<int> stop, global::haxe.lang.Null<int> step) {
			global::thx.RangeIterator.__hx_ctor_thx_RangeIterator(this, start, stop, step);
		}
		
		
		public static void __hx_ctor_thx_RangeIterator(global::thx.RangeIterator __temp_me114, int start, global::haxe.lang.Null<int> stop, global::haxe.lang.Null<int> step) {
			unchecked {
				int __temp_step113 = ( ( ! (step.hasValue) ) ? (1) : ((step).@value) );
				__temp_me114.current = start;
				__temp_me114.stop = stop;
				__temp_me114.step = __temp_step113;
			}
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::thx.RangeIterator(global::haxe.lang.EmptyObject.EMPTY);
		}
		
		
		public static new object __hx_create(global::Array arr) {
			unchecked {
				return new global::thx.RangeIterator(((int) (global::haxe.lang.Runtime.toInt(arr[0])) ), global::haxe.lang.Null<object>.ofDynamic<int>(arr[1]), global::haxe.lang.Null<object>.ofDynamic<int>(arr[2]));
			}
		}
		
		
		public int current;
		
		public global::haxe.lang.Null<int> stop;
		
		public int step;
		
		public virtual bool hasNext() {
			if ( ! (((  ! (this.stop.hasValue)  || ( ( this.step >= 0 ) && ( this.current < (this.stop).@value ) ) ))) ) {
				if (( this.step < 0 )) {
					return ( this.current > (this.stop).@value );
				}
				else {
					return false;
				}
				
			}
			else {
				return true;
			}
			
		}
		
		
		public virtual int next() {
			int result = this.current;
			this.current += this.step;
			return result;
		}
		
		
		public override double __hx_setField_f(string field, int hash, double @value, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 1281091404:
					{
						this.step = ((int) (@value) );
						return @value;
					}
					
					
					case 1273207865:
					{
						this.current = ((int) (@value) );
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
					case 1281091404:
					{
						this.step = ((int) (global::haxe.lang.Runtime.toInt(@value)) );
						return @value;
					}
					
					
					case 1281093634:
					{
						this.stop = global::haxe.lang.Null<object>.ofDynamic<int>(@value);
						return @value;
					}
					
					
					case 1273207865:
					{
						this.current = ((int) (global::haxe.lang.Runtime.toInt(@value)) );
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
					case 1224901875:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "next", 1224901875)) );
					}
					
					
					case 407283053:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "hasNext", 407283053)) );
					}
					
					
					case 1281091404:
					{
						return this.step;
					}
					
					
					case 1281093634:
					{
						return (this.stop).toDynamic();
					}
					
					
					case 1273207865:
					{
						return this.current;
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
					case 1281091404:
					{
						return ((double) (this.step) );
					}
					
					
					case 1273207865:
					{
						return ((double) (this.current) );
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
					case 1224901875:
					{
						return this.next();
					}
					
					
					case 407283053:
					{
						return this.hasNext();
					}
					
					
					default:
					{
						return base.__hx_invokeField(field, hash, dynargs);
					}
					
				}
				
			}
		}
		
		
		public override void __hx_getFields(global::Array<object> baseArr) {
			baseArr.push("step");
			baseArr.push("stop");
			baseArr.push("current");
			{
				base.__hx_getFields(baseArr);
			}
			
		}
		
		
	}
}


