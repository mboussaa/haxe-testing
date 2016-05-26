// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx.bigint {
	public class Bigs : global::haxe.lang.HxObject {
		
		static Bigs() {
			unchecked {
				global::thx.bigint.Bigs.BASE = 10000000;
				global::thx.bigint.Bigs.DOUBLE_BASE = 100000000000000.0;
				global::thx.bigint.Bigs.LOG_BASE = 7;
				global::thx.bigint.Bigs.MAX_INT = 2147483647;
				global::thx.bigint.Bigs.MAX_INT_ARR = global::thx.bigint.Bigs.smallToArray(global::thx.bigint.Bigs.MAX_INT);
				global::thx.bigint.Bigs.LOG_MAX_INT = global::System.Math.Log(((double) (global::thx.bigint.Bigs.MAX_INT) ));
				object __temp_stmt2 = null;
				{
					global::Array<int> powers = new global::Array<int>(new int[]{1});
					while (( powers[( powers.length - 1 )] <= 10000000 )) {
						powers.push(( 2 * powers[( powers.length - 1 )] ));
					}
					
					__temp_stmt2 = powers;
				}
				
				object __temp_stmt1 = global::Array<object>.__hx_cast<int>(((global::Array) (__temp_stmt2) ));
				global::thx.bigint.Bigs.powersOfTwo = ((global::Array<int>) (__temp_stmt1) );
				global::thx.bigint.Bigs.bigPowersOfTwo = global::thx.bigint.Bigs.powersOfTwo.map<object>(((global::haxe.lang.Function) (( (( global::thx.bigint.Bigs_Anon_19__Fun.__hx_current != null )) ? (global::thx.bigint.Bigs_Anon_19__Fun.__hx_current) : (global::thx.bigint.Bigs_Anon_19__Fun.__hx_current = ((global::thx.bigint.Bigs_Anon_19__Fun) (new global::thx.bigint.Bigs_Anon_19__Fun()) )) )) ));
				global::thx.bigint.Bigs.powers2Length = global::thx.bigint.Bigs.powersOfTwo.length;
				global::thx.bigint.Bigs.highestPower2 = global::thx.bigint.Bigs.powersOfTwo[( global::thx.bigint.Bigs.powers2Length - 1 )];
				global::thx.bigint.Bigs.bigHighestPower2 = ((global::thx.bigint.BigIntImpl) (new global::thx.bigint.Small(((int) (global::thx.bigint.Bigs.highestPower2) ))) );
			}
		}
		
		
		public Bigs(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public Bigs() {
			global::thx.bigint.Bigs.__hx_ctor_thx_bigint_Bigs(this);
		}
		
		
		public static void __hx_ctor_thx_bigint_Bigs(global::thx.bigint.Bigs __temp_me97) {
		}
		
		
		public static int BASE;
		
		public static double DOUBLE_BASE;
		
		public static int LOG_BASE;
		
		public static int MAX_INT;
		
		public static global::Array<int> MAX_INT_ARR;
		
		public static double LOG_MAX_INT;
		
		public static global::Array<int> powersOfTwo;
		
		public static global::Array<object> bigPowersOfTwo;
		
		public static int powers2Length;
		
		public static int highestPower2;
		
		public static global::thx.bigint.BigIntImpl bigHighestPower2;
		
		public static bool isPrecise(int @value) {
			if ((  - (global::thx.bigint.Bigs.MAX_INT)  < @value )) {
				return ( @value < global::thx.bigint.Bigs.MAX_INT );
			}
			else {
				return false;
			}
			
		}
		
		
		public static bool canMultiply(int a, int b) {
			if (( ( a == 0 ) || ( b == 0 ) )) {
				return true;
			}
			
			int v = ( a * b );
			if (( a != ( ((double) (v) ) / b ) )) {
				return false;
			}
			
			return global::thx.bigint.Bigs.isPrecise(v);
		}
		
		
		public static bool canPower(int a, int b) {
			if (( ( a == 0 ) || ( b == 0 ) )) {
				return true;
			}
			
			double a1 = global::System.Math.Abs(((double) (a) ));
			double b1 = global::System.Math.Abs(((double) (b) ));
			int v = default(int);
			try {
				v = ((int) (global::System.Math.Pow(((double) (a1) ), ((double) (b1) ))) );
			}
			catch (global::System.Exception __temp_catchallException1){
				global::haxe.lang.Exceptions.exception = __temp_catchallException1;
				object __temp_catchall2 = __temp_catchallException1;
				if (( __temp_catchall2 is global::haxe.lang.HaxeException )) {
					__temp_catchall2 = ((global::haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
				}
				
				{
					object e = __temp_catchall2;
					return false;
				}
				
			}
			
			
			if (( ((int) (global::System.Math.Pow(((double) (v) ), ((double) (( 1.0 / b1 )) ))) ) != a1 )) {
				return false;
			}
			
			return global::thx.bigint.Bigs.isPrecise(v);
		}
		
		
		public static bool canAdd(int a, int b) {
			int v = ( a + b );
			if (( ( ( a > 0 ) && ( b > 0 ) ) && ( v < 0 ) )) {
				return false;
			}
			
			return global::thx.bigint.Bigs.isPrecise(v);
		}
		
		
		public static global::Array<int> smallToArray(int n) {
			unchecked {
				global::thx.Assert.isTrue(( n >= 0 ), global::haxe.lang.Runtime.concat("Bigs.smallToArray should always be non-negative: ", global::haxe.lang.Runtime.toString(n)), new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"smallToArray", "thx.bigint.Bigs", "Bigs.hx"}, new int[]{1981972957}, new double[]{((double) (57) )}));
				if (( n < 10000000 )) {
					return new global::Array<int>(new int[]{n});
				}
				
				if (( n < 100000000000000.0 )) {
					return new global::Array<int>(new int[]{( n % 10000000 ), ((int) (global::System.Math.Floor(((double) (( ((double) (n) ) / 10000000 )) ))) )});
				}
				
				return new global::Array<int>(new int[]{( n % 10000000 ), ( ((int) (global::System.Math.Floor(((double) (( ((double) (n) ) / 10000000 )) ))) ) % 10000000 ), ((int) (global::System.Math.Floor(((double) (( n / 100000000000000.0 )) ))) )});
			}
		}
		
		
		public static global::haxe.lang.Null<int> arrayToSmall(global::Array<int> arr) {
			unchecked {
				global::thx.bigint.Bigs.trim(arr);
				int length = arr.length;
				if (( ( length < 4 ) && ( global::thx.bigint.Bigs.compareToAbs(arr, global::thx.bigint.Bigs.MAX_INT_ARR) < 0 ) )) {
					switch (length) {
						case 0:
						{
							return new global::haxe.lang.Null<int>(0, true);
						}
						
						
						case 1:
						{
							return new global::haxe.lang.Null<int>(arr[0], true);
						}
						
						
						case 2:
						{
							return new global::haxe.lang.Null<int>(( arr[0] + ( arr[1] * 10000000 ) ), true);
						}
						
						
						default:
						{
							return new global::haxe.lang.Null<int>(( arr[0] + ( (( arr[1] + ( arr[2] * 10000000 ) )) * 10000000 ) ), true);
						}
						
					}
					
				}
				
				return default(global::haxe.lang.Null<int>);
			}
		}
		
		
		public static void trim(global::Array<int> v) {
			unchecked {
				while (( v.length > 1 )) {
					if (( v[( v.length - 1 )] != 0 )) {
						break;
					}
					
					v.pop();
				}
				
			}
		}
		
		
		public static global::Array<int> createArray(int length) {
			global::Array<int> x = new global::Array<int>(new int[]{});
			{
				int _g1 = 0;
				while (( _g1 < length )) {
					x[_g1++] = 0;
				}
				
			}
			
			return x;
		}
		
		
		public static global::Array<double> createFloatArray(int length) {
			global::Array<double> x = new global::Array<double>(new double[]{});
			{
				int _g1 = 0;
				while (( _g1 < length )) {
					x[_g1++] = 0.0;
				}
				
			}
			
			return x;
		}
		
		
		public static global::Array<int> @add(global::Array<int> a, global::Array<int> b) {
			unchecked {
				int l_a = a.length;
				int l_b = b.length;
				global::Array<int> r = new global::Array<int>(new int[]{});
				int carry = 0;
				int sum = default(int);
				int i = 0;
				while (( i < l_b )) {
					sum = ( ( a[i] + b[i] ) + carry );
					if (( sum >= 10000000 )) {
						carry = 1;
					}
					else {
						carry = 0;
					}
					
					r[i++] = ( sum - ( carry * 10000000 ) );
				}
				
				while (( i < l_a )) {
					sum = ( a[i] + carry );
					if (( sum == 10000000 )) {
						carry = 1;
					}
					else {
						carry = 0;
					}
					
					r[i++] = ( sum - ( carry * 10000000 ) );
				}
				
				if (( carry > 0 )) {
					r.push(carry);
				}
				
				return r;
			}
		}
		
		
		public static global::Array<int> addAny(global::Array<int> a, global::Array<int> b) {
			if (( a.length >= b.length )) {
				return global::thx.bigint.Bigs.@add(a, b);
			}
			
			return global::thx.bigint.Bigs.@add(b, a);
		}
		
		
		public static global::Array<int> addSmall(global::Array<int> a, int carry) {
			unchecked {
				int l = a.length;
				global::Array<int> r = new global::Array<int>(new int[]{});
				int sum = default(int);
				int i = 0;
				while (( i < l )) {
					sum = ( ( a[i] - 10000000 ) + carry );
					carry = ((int) (global::System.Math.Floor(((double) (( ((double) (sum) ) / 10000000 )) ))) );
					r[i++] = ( sum - ( carry * 10000000 ) );
					 ++ carry;
				}
				
				while (( carry > 0 )) {
					r[i++] = ( carry % 10000000 );
					carry = ((int) (global::System.Math.Floor(((double) (( ((double) (carry) ) / 10000000 )) ))) );
				}
				
				return r;
			}
		}
		
		
		public static int compareToAbs(global::Array<int> a, global::Array<int> b) {
			unchecked {
				if (( a.length != b.length )) {
					if (( a.length > b.length )) {
						return 1;
					}
					else {
						return -1;
					}
					
				}
				
				int i = a.length;
				while ((  -- i >= 0 )) {
					if (( a[i] != b[i] )) {
						if (( a[i] > b[i] )) {
							return 1;
						}
						else {
							return -1;
						}
						
					}
					
				}
				
				return 0;
			}
		}
		
		
		public static global::Array<int> subtract(global::Array<int> a, global::Array<int> b) {
			unchecked {
				int a_l = a.length;
				int b_l = b.length;
				global::Array<int> r = new global::Array<int>(new int[]{});
				int borrow = 0;
				int i = 0;
				int difference = default(int);
				while (( i < b_l )) {
					difference = ( ( a[i] - borrow ) - b[i] );
					if (( difference < 0 )) {
						difference += 10000000;
						borrow = 1;
					}
					else {
						borrow = 0;
					}
					
					r[i++] = difference;
				}
				
				while (( i < a_l )) {
					difference = ( a[i] - borrow );
					if (( difference < 0 )) {
						difference += 10000000;
					}
					else {
						r[i++] = difference;
						break;
					}
					
					r[i++] = difference;
				}
				
				while (( i < a_l )) {
					r[i] = a[i];
					 ++ i;
				}
				
				global::thx.bigint.Bigs.trim(r);
				return r;
			}
		}
		
		
		public static global::thx.bigint.BigIntImpl subtractAny(global::Array<int> a, global::Array<int> b, bool sign) {
			global::Array<int> @value = null;
			if (( global::thx.bigint.Bigs.compareToAbs(a, b) >= 0 )) {
				@value = global::thx.bigint.Bigs.subtract(a, b);
			}
			else {
				@value = global::thx.bigint.Bigs.subtract(b, a);
				sign =  ! (sign) ;
			}
			
			global::haxe.lang.Null<int> n = global::thx.bigint.Bigs.arrayToSmall(@value);
			if (n.hasValue) {
				if (sign) {
					n = new global::haxe.lang.Null<int>(( - ((n).@value) ), true);
				}
				
				return new global::thx.bigint.Small((n).@value);
			}
			
			return new global::thx.bigint.Big(@value, sign);
		}
		
		
		public static global::thx.bigint.BigIntImpl subtractSmall(global::Array<int> a, int b, bool sign) {
			unchecked {
				int l = a.length;
				global::Array<int> r = new global::Array<int>(new int[]{});
				int carry =  - (b) ;
				int difference = default(int);
				{
					int _g1 = 0;
					while (( _g1 < l )) {
						int i = _g1++;
						difference = ( a[i] + carry );
						carry = ((int) (global::System.Math.Floor(((double) (( ((double) (difference) ) / 10000000 )) ))) );
						r[i] = ( (( difference < 0 )) ? (( ( difference % 10000000 ) + 10000000 )) : (difference) );
					}
					
				}
				
				global::haxe.lang.Null<int> n = global::thx.bigint.Bigs.arrayToSmall(r);
				if (n.hasValue) {
					if (sign) {
						n = new global::haxe.lang.Null<int>(( - ((n).@value) ), true);
					}
					
					return new global::thx.bigint.Small((n).@value);
				}
				
				return new global::thx.bigint.Big(r, sign);
			}
		}
		
		
		public static global::Array<int> multiplyLong(global::Array<int> a, global::Array<int> b) {
			unchecked {
				int a_l = a.length;
				int b_l = b.length;
				global::Array<double> r = global::thx.bigint.Bigs.createFloatArray(( a_l + b_l ));
				double product = default(double);
				double carry = default(double);
				double a_i = default(double);
				double b_j = default(double);
				{
					int _g1 = 0;
					while (( _g1 < a_l )) {
						int i = _g1++;
						a_i = ((double) (a[i]) );
						{
							int _g3 = 0;
							while (( _g3 < b_l )) {
								int j = _g3++;
								b_j = ((double) (b[j]) );
								product = ( ( a_i * b_j ) + r[( i + j )] );
								double @value = ( product / 10000000 );
								if (( @value < 0.0 )) {
									carry = global::System.Math.Ceiling(((double) (@value) ));
								}
								else {
									carry = global::System.Math.Floor(((double) (@value) ));
								}
								
								int tmp = ( i + j );
								double value1 = ( product - ( carry * 10000000 ) );
								r[tmp] = ( (( value1 < 0.0 )) ? (global::System.Math.Ceiling(((double) (value1) ))) : (global::System.Math.Floor(((double) (value1) ))) );
								r[( ( i + j ) + 1 )] += carry;
							}
							
						}
						
					}
					
				}
				
				global::Array<int> arr = r.map<int>(((global::haxe.lang.Function) (( (( global::thx.bigint.Bigs_multiplyLong_235__Fun.__hx_current != null )) ? (global::thx.bigint.Bigs_multiplyLong_235__Fun.__hx_current) : (global::thx.bigint.Bigs_multiplyLong_235__Fun.__hx_current = ((global::thx.bigint.Bigs_multiplyLong_235__Fun) (new global::thx.bigint.Bigs_multiplyLong_235__Fun()) )) )) ));
				global::thx.bigint.Bigs.trim(arr);
				return arr;
			}
		}
		
		
		public static global::Array<int> multiplySmall(global::Array<int> a, int b) {
			unchecked {
				int l = a.length;
				global::Array<double> r = new global::Array<double>(new double[]{});
				double carry = 0.0;
				double product = default(double);
				int i = 0;
				double bf = ((double) (b) );
				while (( i < l )) {
					product = ( carry + ( a[i] * bf ) );
					double @value = ( product / 10000000 );
					if (( @value < 0.0 )) {
						carry = global::System.Math.Ceiling(((double) (@value) ));
					}
					else {
						carry = global::System.Math.Floor(((double) (@value) ));
					}
					
					r[i++] = ( product - ( carry * 10000000 ) );
				}
				
				while (( carry > 0 )) {
					r[i++] = ( carry % 10000000 );
					double value1 = ( carry / 10000000 );
					if (( value1 < 0.0 )) {
						carry = global::System.Math.Ceiling(((double) (value1) ));
					}
					else {
						carry = global::System.Math.Floor(((double) (value1) ));
					}
					
				}
				
				global::Array<int> arr = r.map<int>(((global::haxe.lang.Function) (( (( global::thx.bigint.Bigs_multiplySmall_257__Fun.__hx_current != null )) ? (global::thx.bigint.Bigs_multiplySmall_257__Fun.__hx_current) : (global::thx.bigint.Bigs_multiplySmall_257__Fun.__hx_current = ((global::thx.bigint.Bigs_multiplySmall_257__Fun) (new global::thx.bigint.Bigs_multiplySmall_257__Fun()) )) )) ));
				global::thx.bigint.Bigs.trim(arr);
				return arr;
			}
		}
		
		
		public static global::Array<int> shiftLeft(global::Array<int> x, int n) {
			global::Array<int> r = new global::Array<int>(new int[]{});
			while (( n-- > 0 )) {
				r.push(0);
			}
			
			return r.concat(x);
		}
		
		
		public static global::Array<int> multiplyKaratsuba(global::Array<int> x, global::Array<int> y) {
			unchecked {
				int a = x.length;
				int b = y.length;
				int n = ( (( a > b )) ? (a) : (b) );
				if (( n <= 400 )) {
					return global::thx.bigint.Bigs.multiplyLong(x, y);
				}
				
				n = ((int) (global::System.Math.Ceiling(((double) (( ((double) (n) ) / 2 )) ))) );
				global::Array<int> b1 = x.slice(n, default(global::haxe.lang.Null<int>));
				global::Array<int> a1 = x.slice(0, new global::haxe.lang.Null<int>(n, true));
				global::Array<int> d = y.slice(n, default(global::haxe.lang.Null<int>));
				global::Array<int> c = y.slice(0, new global::haxe.lang.Null<int>(n, true));
				global::Array<int> ac = global::thx.bigint.Bigs.multiplyKaratsuba(a1, c);
				global::Array<int> bd = global::thx.bigint.Bigs.multiplyKaratsuba(b1, d);
				return global::thx.bigint.Bigs.addAny(global::thx.bigint.Bigs.addAny(ac, global::thx.bigint.Bigs.shiftLeft(global::thx.bigint.Bigs.subtract(global::thx.bigint.Bigs.subtract(global::thx.bigint.Bigs.multiplyKaratsuba(global::thx.bigint.Bigs.addAny(a1, b1), global::thx.bigint.Bigs.addAny(c, d)), ac), bd), n)), global::thx.bigint.Bigs.shiftLeft(bd, ( 2 * n )));
			}
		}
		
		
		public static global::thx.bigint.BigIntImpl fromInt(int @value) {
			unchecked {
				int abs = ( (( @value < 0 )) ? ( - (@value) ) : (@value) );
				if (( abs < 10000000 )) {
					return new global::thx.bigint.Small(((int) (@value) ));
				}
				else {
					return new global::thx.bigint.Big(global::thx.bigint.Bigs.smallToArray(abs), ( @value < 0 ));
				}
				
			}
		}
		
		
		public static global::thx.bigint.BigIntImpl fromInt64(long @value) {
			unchecked {
				return global::thx.bigint.Bigs.parseBase(global::haxe.lang.Runtime.concat("", global::Std.@string(((long) (@value) ))), 10);
			}
		}
		
		
		public static long toInt64(global::thx.bigint.BigIntImpl @value) {
			return global::thx.Int64s.parse(@value.toString());
		}
		
		
		public static global::thx.bigint.BigIntImpl fromFloat(double @value) {
			unchecked {
				if (( global::System.Double.IsNaN(((double) (@value) )) ||  ! (((  ! (global::System.Double.IsInfinity(((double) (@value) )))  &&  ! (global::System.Double.IsNaN(((double) (@value) )))  )))  )) {
					throw global::haxe.lang.HaxeException.wrap(new global::thx.Error("Conversion to BigInt failed. Number is NaN or Infinite", null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"fromFloat", "thx.bigint.Bigs", "Bigs.hx"}, new int[]{1981972957}, new double[]{((double) (305) )})));
				}
				
				double noFractions = ( @value - ( @value % 1 ) );
				global::thx.bigint.BigIntImpl result = global::thx.bigint.Small.zero;
				bool neg = ( noFractions < 0.0 );
				double rest = ( (neg) ? ( - (noFractions) ) : (noFractions) );
				int i = 0;
				double curr = default(double);
				while (( rest >= 1 )) {
					curr = ( rest % 2 );
					rest /= ((double) (2) );
					if (( curr >= 1 )) {
						result = result.@add(global::thx.bigint.Small.one.shiftLeft(i));
					}
					
					 ++ i;
				}
				
				if (neg) {
					return result.negate();
				}
				else {
					return result;
				}
				
			}
		}
		
		
		public static global::Array<int> square(global::Array<int> a) {
			unchecked {
				int l = a.length;
				global::Array<double> r = global::thx.bigint.Bigs.createFloatArray(( l + l ));
				double product = default(double);
				double carry = default(double);
				double a_i = default(double);
				double a_j = default(double);
				{
					int _g1 = 0;
					while (( _g1 < l )) {
						int i = _g1++;
						a_i = ((double) (a[i]) );
						{
							int _g3 = 0;
							while (( _g3 < l )) {
								int j = _g3++;
								a_j = ((double) (a[j]) );
								product = ( ( a_i * a_j ) + r[( i + j )] );
								double @value = ( product / 10000000 );
								if (( @value < 0.0 )) {
									carry = global::System.Math.Ceiling(((double) (@value) ));
								}
								else {
									carry = global::System.Math.Floor(((double) (@value) ));
								}
								
								int tmp = ( i + j );
								double value1 = ( product - ( carry * 10000000 ) );
								r[tmp] = ( (( value1 < 0.0 )) ? (global::System.Math.Ceiling(((double) (value1) ))) : (global::System.Math.Floor(((double) (value1) ))) );
								r[( ( i + j ) + 1 )] += carry;
							}
							
						}
						
					}
					
				}
				
				global::Array<int> arr = r.map<int>(((global::haxe.lang.Function) (( (( global::thx.bigint.Bigs_square_342__Fun.__hx_current != null )) ? (global::thx.bigint.Bigs_square_342__Fun.__hx_current) : (global::thx.bigint.Bigs_square_342__Fun.__hx_current = ((global::thx.bigint.Bigs_square_342__Fun) (new global::thx.bigint.Bigs_square_342__Fun()) )) )) ));
				global::thx.bigint.Bigs.trim(arr);
				return arr;
			}
		}
		
		
		public static global::Array<object> divMod1(global::Array<int> a, global::Array<int> b) {
			unchecked {
				int a_l = a.length;
				int b_l = b.length;
				global::Array<double> result = global::thx.bigint.Bigs.createFloatArray(b.length);
				double divisorMostSignificantDigit = ((double) (b[( b_l - 1 )]) );
				int lambda = ((int) (global::System.Math.Ceiling(((double) (( 10000000 / (( 2 * divisorMostSignificantDigit )) )) ))) );
				global::Array<double> remainder = global::thx.bigint.Bigs.multiplySmall(a, lambda).map<double>(((global::haxe.lang.Function) (( (( global::thx.bigint.Bigs_divMod1_354__Fun.__hx_current != null )) ? (global::thx.bigint.Bigs_divMod1_354__Fun.__hx_current) : (global::thx.bigint.Bigs_divMod1_354__Fun.__hx_current = ((global::thx.bigint.Bigs_divMod1_354__Fun) (new global::thx.bigint.Bigs_divMod1_354__Fun()) )) )) ));
				global::Array<int> divisor = global::thx.bigint.Bigs.multiplySmall(b, lambda);
				double quotientDigit = default(double);
				int shift = default(int);
				double carry = default(double);
				double borrow = default(double);
				int l = default(int);
				double q = default(double);
				if (( remainder.length <= a_l )) {
					remainder.push(0.0);
				}
				
				divisor.push(0);
				divisorMostSignificantDigit = ((double) (divisor[( b_l - 1 )]) );
				shift = ( a_l - b_l );
				while (( shift >= 0 )) {
					quotientDigit = 9999999.0;
					quotientDigit = global::System.Math.Floor(((double) (( (( ( remainder[( shift + b_l )] * 10000000 ) + remainder[( ( shift + b_l ) - 1 )] )) / divisorMostSignificantDigit )) ));
					carry = 0.0;
					borrow = 0.0;
					l = divisor.length;
					{
						int _g1 = 0;
						while (( _g1 < l )) {
							int i = _g1++;
							carry += ( quotientDigit * ((double) (divisor[i]) ) );
							double @value = ( carry / 10000000 );
							if (( @value < 0.0 )) {
								q = global::System.Math.Ceiling(((double) (@value) ));
							}
							else {
								q = global::System.Math.Floor(((double) (@value) ));
							}
							
							borrow += ( remainder[( shift + i )] - (( carry - ( q * 10000000 ) )) );
							carry = q;
							if (( borrow < 0.0 )) {
								remainder[( shift + i )] = ( borrow + 10000000 );
								borrow = -1.0;
							}
							else {
								remainder[( shift + i )] = borrow;
								borrow = 0.0;
							}
							
						}
						
					}
					
					while (( borrow != 0 )) {
						 -- quotientDigit;
						carry = ((double) (0) );
						{
							int _g11 = 0;
							while (( _g11 < l )) {
								int i1 = _g11++;
								carry += ( ( remainder[( shift + i1 )] - 10000000 ) + divisor[i1] );
								if (( carry < 0 )) {
									remainder[( shift + i1 )] = ( carry + 10000000 );
									carry = ((double) (0) );
								}
								else {
									remainder[( shift + i1 )] = carry;
									carry = ((double) (1) );
								}
								
							}
							
						}
						
						borrow += carry;
					}
					
					result[shift] = quotientDigit;
					 -- shift;
				}
				
				global::Array<int> remainder1 = ((global::Array<int>) (global::Array<object>.__hx_cast<int>(((global::Array) (global::haxe.lang.Runtime.getField(global::thx.bigint.Bigs.divModSmall(remainder.map<int>(((global::haxe.lang.Function) (( (( global::thx.bigint.Bigs_divMod1_400__Fun.__hx_current != null )) ? (global::thx.bigint.Bigs_divMod1_400__Fun.__hx_current) : (global::thx.bigint.Bigs_divMod1_400__Fun.__hx_current = ((global::thx.bigint.Bigs_divMod1_400__Fun) (new global::thx.bigint.Bigs_divMod1_400__Fun()) )) )) )), lambda), "q", 113, true)) ))) );
				global::Array<int> arr = result.map<int>(((global::haxe.lang.Function) (( (( global::thx.bigint.Bigs_divMod1_402__Fun.__hx_current != null )) ? (global::thx.bigint.Bigs_divMod1_402__Fun.__hx_current) : (global::thx.bigint.Bigs_divMod1_402__Fun.__hx_current = ((global::thx.bigint.Bigs_divMod1_402__Fun) (new global::thx.bigint.Bigs_divMod1_402__Fun()) )) )) ));
				global::thx.bigint.Bigs.trim(arr);
				object __temp_stmt3 = null;
				{
					global::haxe.lang.Null<int> __temp_odecl1 = global::thx.bigint.Bigs.arrayToSmall(arr);
					__temp_stmt3 = new global::haxe.lang.DynamicObject(new int[]{4896960, 2137714887}, new object[]{arr, (__temp_odecl1).toDynamic()}, new int[]{}, new double[]{});
				}
				
				object __temp_stmt4 = null;
				{
					global::haxe.lang.Null<int> __temp_odecl2 = global::thx.bigint.Bigs.arrayToSmall(remainder1);
					__temp_stmt4 = new global::haxe.lang.DynamicObject(new int[]{4896960, 2137714887}, new object[]{remainder1, (__temp_odecl2).toDynamic()}, new int[]{}, new double[]{});
				}
				
				return new global::Array<object>(new object[]{__temp_stmt3, __temp_stmt4});
			}
		}
		
		
		public static global::Array<object> divMod2(global::Array<int> a, global::Array<int> b) {
			unchecked {
				int a_l = a.length;
				int b_l = b.length;
				global::Array<int> result = new global::Array<int>(new int[]{});
				global::Array<int> part = new global::Array<int>(new int[]{});
				int guess = default(int);
				int xlen = default(int);
				int highx = default(int);
				int highy = default(int);
				global::Array<int> check = null;
				while (( a_l != 0 )) {
					part.unshift(a[ -- a_l]);
					if (( global::thx.bigint.Bigs.compareToAbs(part, b) < 0 )) {
						result.push(0);
						continue;
					}
					
					xlen = part.length;
					highx = ( ( part[( xlen - 1 )] * 10000000 ) + part[( xlen - 2 )] );
					highy = ( ( b[( b_l - 1 )] * 10000000 ) + b[( b_l - 2 )] );
					if (( xlen > b_l )) {
						highx = ( (( highx + 1 )) * 10000000 );
					}
					
					guess = ((int) (global::System.Math.Ceiling(((double) (( ((double) (highx) ) / highy )) ))) );
					while (true) {
						check = global::thx.bigint.Bigs.multiplySmall(b, guess);
						if (( global::thx.bigint.Bigs.compareToAbs(check, part) <= 0 )) {
							break;
						}
						
						 -- guess;
						if ( ! ((( guess != 0 ))) ) {
							break;
						}
						
					}
					
					result.push(guess);
					part = global::thx.bigint.Bigs.subtract(part, check);
				}
				
				result.reverse();
				object __temp_stmt3 = null;
				{
					global::haxe.lang.Null<int> __temp_odecl1 = global::thx.bigint.Bigs.arrayToSmall(result);
					__temp_stmt3 = new global::haxe.lang.DynamicObject(new int[]{4896960, 2137714887}, new object[]{result, (__temp_odecl1).toDynamic()}, new int[]{}, new double[]{});
				}
				
				object __temp_stmt4 = null;
				{
					global::haxe.lang.Null<int> __temp_odecl2 = global::thx.bigint.Bigs.arrayToSmall(part);
					__temp_stmt4 = new global::haxe.lang.DynamicObject(new int[]{4896960, 2137714887}, new object[]{part, (__temp_odecl2).toDynamic()}, new int[]{}, new double[]{});
				}
				
				return new global::Array<object>(new object[]{__temp_stmt3, __temp_stmt4});
			}
		}
		
		
		public static object divModSmall(global::Array<int> @value, int lambda) {
			unchecked {
				int length = @value.length;
				global::Array<int> quotient = global::thx.bigint.Bigs.createArray(length);
				int i = default(int);
				double q = default(double);
				double remainder = default(double);
				double divisor = default(double);
				remainder = ((double) (0) );
				i = ( length - 1 );
				while (( i >= 0 )) {
					divisor = ( ( remainder * 10000000 ) + @value[i] );
					double value1 = ( divisor / lambda );
					if (( value1 < 0.0 )) {
						q = global::System.Math.Ceiling(((double) (value1) ));
					}
					else {
						q = global::System.Math.Floor(((double) (value1) ));
					}
					
					remainder = ( divisor - ( q * lambda ) );
					quotient[i--] = ((int) (q) );
				}
				
				{
					int __temp_odecl1 = ( (( remainder < 0.0 )) ? (((int) (global::System.Math.Ceiling(((double) (remainder) ))) )) : (((int) (global::System.Math.Floor(((double) (remainder) ))) )) );
					return new global::haxe.lang.DynamicObject(new int[]{113}, new object[]{quotient}, new int[]{114}, new double[]{((double) (__temp_odecl1) )});
				}
				
			}
		}
		
		
		public static global::thx.bigint.BigIntImpl parseBase(string text, int @base) {
			unchecked {
				global::thx.bigint.BigIntImpl val = global::thx.bigint.Small.zero;
				global::thx.bigint.BigIntImpl pow = global::thx.bigint.Small.one;
				global::thx.bigint.Small bigBase = new global::thx.bigint.Small(((int) (@base) ));
				bool isNegative = string.Equals(global::haxe.lang.StringExt.substring(text, 0, new global::haxe.lang.Null<int>(1, true)), "-");
				if (( ( 2 > @base ) || ( @base > 36 ) )) {
					throw global::haxe.lang.HaxeException.wrap(new global::thx.Error(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("base (", global::haxe.lang.Runtime.toString(@base)), ") must be a number between 2 ad 36"), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"parseBase", "thx.bigint.Bigs", "Bigs.hx"}, new int[]{1981972957}, new double[]{((double) (475) )})));
				}
				
				if (isNegative) {
					text = global::haxe.lang.StringExt.substring(text, 1, default(global::haxe.lang.Null<int>));
				}
				
				text = global::thx.Strings.trimCharsLeft(text, "0").ToLowerInvariant();
				if (( text.Length == 0 )) {
					text = "0";
				}
				
				int e = default(int);
				bool tmp = default(bool);
				if (( @base == 10 )) {
					e = global::haxe.lang.StringExt.indexOf(text, "e", default(global::haxe.lang.Null<int>));
					tmp = ( e > 0 );
				}
				else {
					tmp = false;
				}
				
				if (tmp) {
					string sexp = global::haxe.lang.StringExt.substring(text, ( e + 1 ), default(global::haxe.lang.Null<int>));
					text = global::haxe.lang.StringExt.substring(text, 0, new global::haxe.lang.Null<int>(e, true));
					global::haxe.lang.Null<int> exp = ( (sexp.StartsWith("+")) ? (global::Std.parseInt(global::haxe.lang.StringExt.substring(sexp, 1, default(global::haxe.lang.Null<int>)))) : (global::Std.parseInt(sexp)) );
					int decimalPlace = global::haxe.lang.StringExt.indexOf(text, ".", default(global::haxe.lang.Null<int>));
					if (( decimalPlace >= 0 )) {
						exp = new global::haxe.lang.Null<int>(((int) (( (exp).@value - (new global::haxe.lang.Null<int>(( text.Length - decimalPlace ), true)).@value )) ), true);
						text = global::haxe.lang.Runtime.concat(global::haxe.lang.StringExt.substring(text, 0, new global::haxe.lang.Null<int>(decimalPlace, true)), global::haxe.lang.StringExt.substring(text, ( 1 + decimalPlace ), default(global::haxe.lang.Null<int>)));
					}
					
					text = global::thx.Strings.rpad(text, "0", ( text.Length + (exp).@value ));
				}
				
				int length = text.Length;
				if (( length <= ( global::thx.bigint.Bigs.LOG_MAX_INT / global::System.Math.Log(((double) (@base) )) ) )) {
					return new global::thx.bigint.Small(((int) (( (global::thx.Ints.parse(text, new global::haxe.lang.Null<int>(@base, true))).@value * (( (isNegative) ? (-1) : (1) )) )) ));
				}
				
				global::Array<object> digits = new global::Array<object>(new object[]{});
				{
					int _g1 = 0;
					while (( _g1 < length )) {
						global::haxe.lang.Null<int> charCode = global::haxe.lang.StringExt.charCodeAt(text, _g1++);
						if (( ( 48 <= (charCode).@value ) && ( (charCode).@value <= 57 ) )) {
							digits.push(new global::thx.bigint.Small(((int) (( (charCode).@value - 48 )) )));
						}
						else if (( ( 97 <= (charCode).@value ) && ( (charCode).@value <= 122 ) )) {
							digits.push(new global::thx.bigint.Small(((int) (( (charCode).@value - 87 )) )));
						}
						else {
							throw global::haxe.lang.HaxeException.wrap(new global::thx.Error(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("", text), " is not a valid string"), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"parseBase", "thx.bigint.Bigs", "Bigs.hx"}, new int[]{1981972957}, new double[]{((double) (509) )})));
						}
						
					}
					
				}
				
				digits.reverse();
				global::thx.bigint.BigIntImpl mul = null;
				{
					int _g11 = 0;
					int _g = digits.length;
					while (( _g11 < _g )) {
						mul = ((global::thx.bigint.Small) (digits[_g11++]) ).multiply(pow);
						val = val.@add(mul);
						pow = pow.multiply(bigBase);
					}
					
				}
				
				if (isNegative) {
					return val.negate();
				}
				else {
					return val;
				}
				
			}
		}
		
		
		public static global::thx.bigint.BigIntImpl bitwise(global::thx.bigint.BigIntImpl x, global::thx.bigint.BigIntImpl y, global::haxe.lang.Function fn) {
			unchecked {
				bool xSign = global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.getField(x, "sign", 1280544829, true));
				bool ySign = global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.getField(y, "sign", 1280544829, true));
				global::thx.bigint.BigIntImpl xRem = ( (xSign) ? (x.not()) : (x) );
				global::thx.bigint.BigIntImpl yRem = ( (ySign) ? (y.not()) : (y) );
				global::Array<int> xBits = new global::Array<int>(new int[]{});
				global::Array<int> yBits = new global::Array<int>(new int[]{});
				bool xStop = false;
				bool yStop = false;
				while ((  ! (xStop)  ||  ! (yStop)  )) {
					if (xRem.isZero()) {
						xStop = true;
						xBits.push(( (xSign) ? (1) : (0) ));
					}
					else if (xSign) {
						xBits.push(( (xRem.isEven()) ? (1) : (0) ));
					}
					else {
						xBits.push(( (xRem.isEven()) ? (0) : (1) ));
					}
					
					if (yRem.isZero()) {
						yStop = true;
						yBits.push(( (ySign) ? (1) : (0) ));
					}
					else if (ySign) {
						yBits.push(( (yRem.isEven()) ? (1) : (0) ));
					}
					else {
						yBits.push(( (yRem.isEven()) ? (0) : (1) ));
					}
					
					xRem = xRem.divide(global::thx.bigint.Small.two);
					yRem = yRem.divide(global::thx.bigint.Small.two);
				}
				
				global::Array<int> result = new global::Array<int>(new int[]{});
				{
					int _g1 = 0;
					int _g = xBits.length;
					while (( _g1 < _g )) {
						int i = _g1++;
						result.push(((int) (fn.__hx_invoke2_f(((double) (xBits[i]) ), global::haxe.lang.Runtime.undefined, ((double) (yBits[i]) ), global::haxe.lang.Runtime.undefined)) ));
					}
					
				}
				
				global::thx.bigint.BigIntImpl a = global::thx.bigint.Bigs.fromInt((result.pop()).@value);
				global::thx.bigint.BigIntImpl p = global::thx.bigint.Small.two.pow(global::thx.bigint.Bigs.fromInt(result.length));
				global::thx.bigint.BigIntImpl sum = a.negate().multiply(p);
				while (( result.length > 0 )) {
					a = global::thx.bigint.Bigs.fromInt((result.pop()).@value);
					p = global::thx.bigint.Small.two.pow(global::thx.bigint.Bigs.fromInt(result.length));
					sum = sum.@add(a.multiply(p));
				}
				
				return sum;
			}
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::thx.bigint.Bigs(global::haxe.lang.EmptyObject.EMPTY);
		}
		
		
		public static new object __hx_create(global::Array arr) {
			return new global::thx.bigint.Bigs();
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx.bigint {
	public class Bigs_multiplyLong_235__Fun : global::haxe.lang.Function {
		
		public Bigs_multiplyLong_235__Fun() : base(1, 1) {
		}
		
		
		public static global::thx.bigint.Bigs_multiplyLong_235__Fun __hx_current;
		
		public override double __hx_invoke1_f(double __fn_float1, object __fn_dyn1) {
			double v = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((double) (__fn_float1) )) : (((double) (global::haxe.lang.Runtime.toDouble(__fn_dyn1)) )) );
			return ((double) (((int) (v) )) );
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx.bigint {
	public class Bigs_multiplySmall_257__Fun : global::haxe.lang.Function {
		
		public Bigs_multiplySmall_257__Fun() : base(1, 1) {
		}
		
		
		public static global::thx.bigint.Bigs_multiplySmall_257__Fun __hx_current;
		
		public override double __hx_invoke1_f(double __fn_float1, object __fn_dyn1) {
			double v = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((double) (__fn_float1) )) : (((double) (global::haxe.lang.Runtime.toDouble(__fn_dyn1)) )) );
			return ((double) (((int) (v) )) );
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx.bigint {
	public class Bigs_square_342__Fun : global::haxe.lang.Function {
		
		public Bigs_square_342__Fun() : base(1, 1) {
		}
		
		
		public static global::thx.bigint.Bigs_square_342__Fun __hx_current;
		
		public override double __hx_invoke1_f(double __fn_float1, object __fn_dyn1) {
			double v = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((double) (__fn_float1) )) : (((double) (global::haxe.lang.Runtime.toDouble(__fn_dyn1)) )) );
			return ((double) (((int) (v) )) );
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx.bigint {
	public class Bigs_divMod1_354__Fun : global::haxe.lang.Function {
		
		public Bigs_divMod1_354__Fun() : base(1, 1) {
		}
		
		
		public static global::thx.bigint.Bigs_divMod1_354__Fun __hx_current;
		
		public override double __hx_invoke1_f(double __fn_float1, object __fn_dyn1) {
			int v = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((int) (__fn_float1) )) : (((int) (global::haxe.lang.Runtime.toInt(__fn_dyn1)) )) );
			return ((double) (v) );
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx.bigint {
	public class Bigs_divMod1_400__Fun : global::haxe.lang.Function {
		
		public Bigs_divMod1_400__Fun() : base(1, 1) {
		}
		
		
		public static global::thx.bigint.Bigs_divMod1_400__Fun __hx_current;
		
		public override double __hx_invoke1_f(double __fn_float1, object __fn_dyn1) {
			double v1 = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((double) (__fn_float1) )) : (((double) (global::haxe.lang.Runtime.toDouble(__fn_dyn1)) )) );
			return ((double) (((int) (v1) )) );
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx.bigint {
	public class Bigs_divMod1_402__Fun : global::haxe.lang.Function {
		
		public Bigs_divMod1_402__Fun() : base(1, 1) {
		}
		
		
		public static global::thx.bigint.Bigs_divMod1_402__Fun __hx_current;
		
		public override double __hx_invoke1_f(double __fn_float1, object __fn_dyn1) {
			double v2 = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((double) (__fn_float1) )) : (((double) (global::haxe.lang.Runtime.toDouble(__fn_dyn1)) )) );
			return ((double) (((int) (v2) )) );
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx.bigint {
	public class Bigs_Anon_19__Fun : global::haxe.lang.Function {
		
		public Bigs_Anon_19__Fun() : base(1, 0) {
		}
		
		
		public static global::thx.bigint.Bigs_Anon_19__Fun __hx_current;
		
		public override object __hx_invoke1_o(double __fn_float1, object __fn_dyn1) {
			int v = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((int) (__fn_float1) )) : (((int) (global::haxe.lang.Runtime.toInt(__fn_dyn1)) )) );
			return new global::thx.bigint.Small(((int) (v) ));
		}
		
		
	}
}


