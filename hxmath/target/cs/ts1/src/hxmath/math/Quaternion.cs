// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace hxmath.math {
	public class QuaternionDefault : global::haxe.lang.HxObject {
		
		public QuaternionDefault(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public QuaternionDefault(double s, double x, double y, double z) {
			global::hxmath.math.QuaternionDefault.__hx_ctor_hxmath_math_QuaternionDefault(this, s, x, y, z);
		}
		
		
		public static void __hx_ctor_hxmath_math_QuaternionDefault(global::hxmath.math.QuaternionDefault __temp_me36, double s, double x, double y, double z) {
			__temp_me36.s = s;
			__temp_me36.x = x;
			__temp_me36.y = y;
			__temp_me36.z = z;
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::hxmath.math.QuaternionDefault(global::haxe.lang.EmptyObject.EMPTY);
		}
		
		
		public static new object __hx_create(global::Array arr) {
			unchecked {
				return new global::hxmath.math.QuaternionDefault(((double) (global::haxe.lang.Runtime.toDouble(arr[0])) ), ((double) (global::haxe.lang.Runtime.toDouble(arr[1])) ), ((double) (global::haxe.lang.Runtime.toDouble(arr[2])) ), ((double) (global::haxe.lang.Runtime.toDouble(arr[3])) ));
			}
		}
		
		
		public double s;
		
		public double x;
		
		public double y;
		
		public double z;
		
		public virtual string toString() {
			return global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("[", global::haxe.lang.Runtime.toString(this.s)), ", ("), global::haxe.lang.Runtime.toString(this.x)), ", "), global::haxe.lang.Runtime.toString(this.y)), ", "), global::haxe.lang.Runtime.toString(this.z)), ")]");
		}
		
		
		public override double __hx_setField_f(string field, int hash, double @value, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 122:
					{
						this.z = ((double) (@value) );
						return @value;
					}
					
					
					case 121:
					{
						this.y = ((double) (@value) );
						return @value;
					}
					
					
					case 120:
					{
						this.x = ((double) (@value) );
						return @value;
					}
					
					
					case 115:
					{
						this.s = ((double) (@value) );
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
					case 122:
					{
						this.z = ((double) (global::haxe.lang.Runtime.toDouble(@value)) );
						return @value;
					}
					
					
					case 121:
					{
						this.y = ((double) (global::haxe.lang.Runtime.toDouble(@value)) );
						return @value;
					}
					
					
					case 120:
					{
						this.x = ((double) (global::haxe.lang.Runtime.toDouble(@value)) );
						return @value;
					}
					
					
					case 115:
					{
						this.s = ((double) (global::haxe.lang.Runtime.toDouble(@value)) );
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
					case 946786476:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "toString", 946786476)) );
					}
					
					
					case 122:
					{
						return this.z;
					}
					
					
					case 121:
					{
						return this.y;
					}
					
					
					case 120:
					{
						return this.x;
					}
					
					
					case 115:
					{
						return this.s;
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
					case 122:
					{
						return this.z;
					}
					
					
					case 121:
					{
						return this.y;
					}
					
					
					case 120:
					{
						return this.x;
					}
					
					
					case 115:
					{
						return this.s;
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
					case 946786476:
					{
						return this.toString();
					}
					
					
					default:
					{
						return base.__hx_invokeField(field, hash, dynargs);
					}
					
				}
				
			}
		}
		
		
		public override void __hx_getFields(global::Array<object> baseArr) {
			baseArr.push("z");
			baseArr.push("y");
			baseArr.push("x");
			baseArr.push("s");
			{
				base.__hx_getFields(baseArr);
			}
			
		}
		
		
		public override string ToString(){
			return this.toString();
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace hxmath.math._Quaternion {
	public sealed class Quaternion_Impl_ {
		
		static Quaternion_Impl_() {
			unchecked {
				global::hxmath.math._Quaternion.Quaternion_Impl_.elementCount = 4;
			}
		}
		
		
		public static int elementCount;
		
		
		
		
		
		
		
		
		
		
		
		
		
		public static global::hxmath.math.QuaternionDefault _new(double s, double x, double y, double z) {
			return ((global::hxmath.math.QuaternionDefault) (new global::hxmath.math.QuaternionDefault(s, x, y, z)) );
		}
		
		
		public static global::hxmath.math.QuaternionDefault fromArray(global::Array<double> rawData) {
			unchecked {
				if (( rawData.length != 4 )) {
					throw global::haxe.lang.HaxeException.wrap("Invalid rawData.");
				}
				
				return ((global::hxmath.math.QuaternionDefault) (new global::hxmath.math.QuaternionDefault(rawData[0], rawData[1], rawData[2], rawData[3])) );
			}
		}
		
		
		public static global::hxmath.math.QuaternionDefault fromAxisAngle(double angleDegrees, global::hxmath.math.Vector3Default axis) {
			unchecked {
				double angleRadians = ( ( global::Math.PI / 180 ) * angleDegrees );
				double cosHalfAngle = global::System.Math.Cos(((double) (( angleRadians / 2.0 )) ));
				double sinHalfAngle = global::System.Math.Sin(((double) (( angleRadians / 2.0 )) ));
				return ((global::hxmath.math.QuaternionDefault) (new global::hxmath.math.QuaternionDefault(cosHalfAngle, ( sinHalfAngle * axis.x ), ( sinHalfAngle * axis.y ), ( sinHalfAngle * axis.z ))) );
			}
		}
		
		
		public static global::hxmath.math.QuaternionDefault multiplyScalar(global::hxmath.math.QuaternionDefault a, double s) {
			global::hxmath.math.QuaternionDefault self = ((global::hxmath.math.QuaternionDefault) (new global::hxmath.math.QuaternionDefault(a.s, a.x, a.y, a.z)) );
			self.s *= s;
			self.x *= s;
			self.y *= s;
			self.z *= s;
			return self;
		}
		
		
		public static global::hxmath.math.QuaternionDefault multiply(global::hxmath.math.QuaternionDefault a, global::hxmath.math.QuaternionDefault b) {
			return ((global::hxmath.math.QuaternionDefault) (new global::hxmath.math.QuaternionDefault(( ( ( ( a.s * b.s ) - ( a.x * b.x ) ) - ( a.y * b.y ) ) - ( a.z * b.z ) ), ( ( ( ( a.s * b.x ) + ( b.s * a.x ) ) + ( a.y * b.z ) ) - ( a.z * b.y ) ), ( ( ( ( a.s * b.y ) + ( b.s * a.y ) ) + ( a.z * b.x ) ) - ( a.x * b.z ) ), ( ( ( ( a.s * b.z ) + ( b.s * a.z ) ) + ( a.x * b.y ) ) - ( a.y * b.x ) ))) );
		}
		
		
		public static global::hxmath.math.QuaternionDefault @add(global::hxmath.math.QuaternionDefault a, global::hxmath.math.QuaternionDefault b) {
			global::hxmath.math.QuaternionDefault self = ((global::hxmath.math.QuaternionDefault) (new global::hxmath.math.QuaternionDefault(a.s, a.x, a.y, a.z)) );
			self.s += b.s;
			self.x += b.x;
			self.y += b.y;
			self.z += b.z;
			return self;
		}
		
		
		public static global::hxmath.math.QuaternionDefault subtract(global::hxmath.math.QuaternionDefault a, global::hxmath.math.QuaternionDefault b) {
			global::hxmath.math.QuaternionDefault self = ((global::hxmath.math.QuaternionDefault) (new global::hxmath.math.QuaternionDefault(a.s, a.x, a.y, a.z)) );
			self.s -= b.s;
			self.x -= b.x;
			self.y -= b.y;
			self.z -= b.z;
			return self;
		}
		
		
		public static global::hxmath.math.QuaternionDefault conjugate(global::hxmath.math.QuaternionDefault a) {
			return ((global::hxmath.math.QuaternionDefault) (new global::hxmath.math.QuaternionDefault(a.s,  - (a.x) ,  - (a.y) ,  - (a.z) )) );
		}
		
		
		public static global::hxmath.math.QuaternionDefault negate(global::hxmath.math.QuaternionDefault a) {
			return ((global::hxmath.math.QuaternionDefault) (new global::hxmath.math.QuaternionDefault( - (a.s) ,  - (a.x) ,  - (a.y) ,  - (a.z) )) );
		}
		
		
		public static bool @equals(global::hxmath.math.QuaternionDefault a, global::hxmath.math.QuaternionDefault b) {
			if ( ! ((( ( a == null ) && ( b == null ) ))) ) {
				if (( ( ( ( ( a != null ) && ( b != null ) ) && ( a.s == b.s ) ) && ( a.x == b.x ) ) && ( a.y == b.y ) )) {
					return ( a.z == b.z );
				}
				else {
					return false;
				}
				
			}
			else {
				return true;
			}
			
		}
		
		
		public static global::hxmath.math.QuaternionDefault lerp(global::hxmath.math.QuaternionDefault a, global::hxmath.math.QuaternionDefault b, double t) {
			double s = ( 1.0 - t );
			global::hxmath.math.QuaternionDefault self = ((global::hxmath.math.QuaternionDefault) (new global::hxmath.math.QuaternionDefault(a.s, a.x, a.y, a.z)) );
			self.s *= s;
			self.x *= s;
			self.y *= s;
			self.z *= s;
			global::hxmath.math.QuaternionDefault self1 = ((global::hxmath.math.QuaternionDefault) (new global::hxmath.math.QuaternionDefault(b.s, b.x, b.y, b.z)) );
			self1.s *= t;
			self1.x *= t;
			self1.y *= t;
			self1.z *= t;
			global::hxmath.math.QuaternionDefault self2 = ((global::hxmath.math.QuaternionDefault) (new global::hxmath.math.QuaternionDefault(self.s, self.x, self.y, self.z)) );
			self2.s += self1.s;
			self2.x += self1.x;
			self2.y += self1.y;
			self2.z += self1.z;
			return self2;
		}
		
		
		public static global::hxmath.math.QuaternionDefault slerp(global::hxmath.math.QuaternionDefault a, global::hxmath.math.QuaternionDefault b, double t) {
			unchecked {
				double cosHalfTheta = ( ( ( ( a.s * b.s ) + ( a.x * b.x ) ) + ( a.y * b.y ) ) + ( a.z * b.z ) );
				if (( global::System.Math.Abs(((double) (cosHalfTheta) )) >= 1.0 )) {
					return a;
				}
				
				double halfTheta = global::System.Math.Acos(((double) (cosHalfTheta) ));
				double sinHalfTheta = global::System.Math.Sqrt(((double) (( 1.0 - ( cosHalfTheta * cosHalfTheta ) )) ));
				if (( global::System.Math.Abs(((double) (sinHalfTheta) )) < 1e-3 )) {
					double s = ( 1.0 - t );
					global::hxmath.math.QuaternionDefault self = ((global::hxmath.math.QuaternionDefault) (new global::hxmath.math.QuaternionDefault(a.s, a.x, a.y, a.z)) );
					self.s *= s;
					self.x *= s;
					self.y *= s;
					self.z *= s;
					global::hxmath.math.QuaternionDefault self1 = ((global::hxmath.math.QuaternionDefault) (new global::hxmath.math.QuaternionDefault(b.s, b.x, b.y, b.z)) );
					self1.s *= t;
					self1.x *= t;
					self1.y *= t;
					self1.z *= t;
					global::hxmath.math.QuaternionDefault self2 = ((global::hxmath.math.QuaternionDefault) (new global::hxmath.math.QuaternionDefault(self.s, self.x, self.y, self.z)) );
					self2.s += self1.s;
					self2.x += self1.x;
					self2.y += self1.y;
					self2.z += self1.z;
					global::hxmath.math.QuaternionDefault self3 = ((global::hxmath.math.QuaternionDefault) (self2) );
					double length = global::System.Math.Sqrt(((double) (( ( ( ( self3.s * self3.s ) + ( self3.x * self3.x ) ) + ( self3.y * self3.y ) ) + ( self3.z * self3.z ) )) ));
					if (( length > 0.0 )) {
						double k = ( 1.0 / length );
						{
							self3.s *= k;
							self3.x *= k;
							self3.y *= k;
							self3.z *= k;
						}
						
					}
					
					return self3;
				}
				
				double ta = ( global::System.Math.Sin(((double) (( (( 1 - t )) * halfTheta )) )) / sinHalfTheta );
				double tb = ( global::System.Math.Sin(((double) (( t * halfTheta )) )) / sinHalfTheta );
				global::hxmath.math.QuaternionDefault result = ((global::hxmath.math.QuaternionDefault) (new global::hxmath.math.QuaternionDefault(((double) (0) ), ((double) (0) ), ((double) (0) ), ((double) (0) ))) );
				result.x = ( ( a.x * ta ) + ( b.x * tb ) );
				result.y = ( ( a.y * ta ) + ( b.y * tb ) );
				result.z = ( ( a.z * ta ) + ( b.z * tb ) );
				result.s = ( ( a.s * ta ) + ( b.s * tb ) );
				return result;
			}
		}
		
		
		public static double dot(global::hxmath.math.QuaternionDefault a, global::hxmath.math.QuaternionDefault b) {
			return ( ( ( ( a.s * b.s ) + ( a.x * b.x ) ) + ( a.y * b.y ) ) + ( a.z * b.z ) );
		}
		
		
		public static global::hxmath.math.QuaternionDefault @set(global::hxmath.math.QuaternionDefault this1, double s, double x, double y, double z) {
			global::hxmath.math.QuaternionDefault self = this1;
			self.s = s;
			self.x = x;
			self.y = y;
			self.z = z;
			return self;
		}
		
		
		public static global::hxmath.math.QuaternionDefault invert(global::hxmath.math.QuaternionDefault this1) {
			global::hxmath.math.QuaternionDefault self = this1;
			global::hxmath.math.QuaternionDefault self1 = ((global::hxmath.math.QuaternionDefault) (new global::hxmath.math.QuaternionDefault(self.s, self.x, self.y, self.z)) );
			self1.x =  - (self1.x) ;
			self1.y =  - (self1.y) ;
			self1.z =  - (self1.z) ;
			global::hxmath.math.QuaternionDefault self2 = ((global::hxmath.math.QuaternionDefault) (self1) );
			double length = global::System.Math.Sqrt(((double) (( ( ( ( self2.s * self2.s ) + ( self2.x * self2.x ) ) + ( self2.y * self2.y ) ) + ( self2.z * self2.z ) )) ));
			if (( length > 0.0 )) {
				double k = ( 1.0 / length );
				{
					self2.s *= k;
					self2.x *= k;
					self2.y *= k;
					self2.z *= k;
				}
				
			}
			
			return self2;
		}
		
		
		public static global::hxmath.math.QuaternionDefault multiplyWithScalar(global::hxmath.math.QuaternionDefault this1, double s) {
			global::hxmath.math.QuaternionDefault self = this1;
			self.s *= s;
			self.x *= s;
			self.y *= s;
			self.z *= s;
			return self;
		}
		
		
		public static global::hxmath.math.QuaternionDefault addWith(global::hxmath.math.QuaternionDefault this1, global::hxmath.math.QuaternionDefault a) {
			global::hxmath.math.QuaternionDefault self = this1;
			self.s += a.s;
			self.x += a.x;
			self.y += a.y;
			self.z += a.z;
			return self;
		}
		
		
		public static global::hxmath.math.QuaternionDefault subtractWith(global::hxmath.math.QuaternionDefault this1, global::hxmath.math.QuaternionDefault a) {
			global::hxmath.math.QuaternionDefault self = this1;
			self.s -= a.s;
			self.x -= a.x;
			self.y -= a.y;
			self.z -= a.z;
			return self;
		}
		
		
		public static void copyTo(global::hxmath.math.QuaternionDefault this1, global::hxmath.math.QuaternionDefault target) {
			unchecked {
				global::hxmath.math.QuaternionDefault self = this1;
				{
					int _g = 0;
					while (( _g < 4 )) {
						int i = _g++;
						{
							object tmp = null;
							switch (i) {
								case 0:
								{
									tmp = self.s;
									break;
								}
								
								
								case 1:
								{
									tmp = self.x;
									break;
								}
								
								
								case 2:
								{
									tmp = self.y;
									break;
								}
								
								
								case 3:
								{
									tmp = self.z;
									break;
								}
								
								
								default:
								{
									throw global::haxe.lang.HaxeException.wrap("Invalid element");
								}
								
							}
							
							double @value = ((double) (global::haxe.lang.Runtime.toDouble(tmp)) );
							switch (i) {
								case 0:
								{
									target.s = @value;
									break;
								}
								
								
								case 1:
								{
									target.x = @value;
									break;
								}
								
								
								case 2:
								{
									target.y = @value;
									break;
								}
								
								
								case 3:
								{
									target.z = @value;
									break;
								}
								
								
								default:
								{
									throw global::haxe.lang.HaxeException.wrap("Invalid element");
								}
								
							}
							
						}
						
					}
					
				}
				
			}
		}
		
		
		public static void copyToShape(global::hxmath.math.QuaternionDefault this1, object target) {
			global::hxmath.math.QuaternionDefault self = this1;
			global::haxe.lang.Runtime.setField_f(target, "s", 115, self.s);
			global::haxe.lang.Runtime.setField_f(target, "x", 120, self.x);
			global::haxe.lang.Runtime.setField_f(target, "y", 121, self.y);
			global::haxe.lang.Runtime.setField_f(target, "z", 122, self.z);
		}
		
		
		public static void copyFromShape(global::hxmath.math.QuaternionDefault this1, object source) {
			global::hxmath.math.QuaternionDefault self = this1;
			self.s = global::haxe.lang.Runtime.getField_f(source, "s", 115, true);
			self.x = global::haxe.lang.Runtime.getField_f(source, "x", 120, true);
			self.y = global::haxe.lang.Runtime.getField_f(source, "y", 121, true);
			self.z = global::haxe.lang.Runtime.getField_f(source, "z", 122, true);
		}
		
		
		public static global::hxmath.math.QuaternionDefault clone(global::hxmath.math.QuaternionDefault this1) {
			global::hxmath.math.QuaternionDefault self = this1;
			return ((global::hxmath.math.QuaternionDefault) (new global::hxmath.math.QuaternionDefault(self.s, self.x, self.y, self.z)) );
		}
		
		
		public static double getArrayElement(global::hxmath.math.QuaternionDefault this1, int i) {
			unchecked {
				global::hxmath.math.QuaternionDefault self = this1;
				switch (i) {
					case 0:
					{
						return self.s;
					}
					
					
					case 1:
					{
						return self.x;
					}
					
					
					case 2:
					{
						return self.y;
					}
					
					
					case 3:
					{
						return self.z;
					}
					
					
					default:
					{
						throw global::haxe.lang.HaxeException.wrap("Invalid element");
					}
					
				}
				
			}
		}
		
		
		public static double setArrayElement(global::hxmath.math.QuaternionDefault this1, int i, double @value) {
			unchecked {
				global::hxmath.math.QuaternionDefault self = this1;
				switch (i) {
					case 0:
					{
						return self.s = @value;
					}
					
					
					case 1:
					{
						return self.x = @value;
					}
					
					
					case 2:
					{
						return self.y = @value;
					}
					
					
					case 3:
					{
						return self.z = @value;
					}
					
					
					default:
					{
						throw global::haxe.lang.HaxeException.wrap("Invalid element");
					}
					
				}
				
			}
		}
		
		
		public static global::hxmath.math.QuaternionDefault applyScalarFunc(global::hxmath.math.QuaternionDefault this1, global::haxe.lang.Function func) {
			unchecked {
				global::hxmath.math.QuaternionDefault self = this1;
				{
					int _g = 0;
					while (( _g < 4 )) {
						int i = _g++;
						{
							object tmp = null;
							switch (i) {
								case 0:
								{
									tmp = self.s;
									break;
								}
								
								
								case 1:
								{
									tmp = self.x;
									break;
								}
								
								
								case 2:
								{
									tmp = self.y;
									break;
								}
								
								
								case 3:
								{
									tmp = self.z;
									break;
								}
								
								
								default:
								{
									throw global::haxe.lang.HaxeException.wrap("Invalid element");
								}
								
							}
							
							double @value = ((double) (func.__hx_invoke1_f(((double) (global::haxe.lang.Runtime.toDouble(tmp)) ), global::haxe.lang.Runtime.undefined)) );
							switch (i) {
								case 0:
								{
									self.s = @value;
									break;
								}
								
								
								case 1:
								{
									self.x = @value;
									break;
								}
								
								
								case 2:
								{
									self.y = @value;
									break;
								}
								
								
								case 3:
								{
									self.z = @value;
									break;
								}
								
								
								default:
								{
									throw global::haxe.lang.HaxeException.wrap("Invalid element");
								}
								
							}
							
						}
						
					}
					
				}
				
				return self;
			}
		}
		
		
		public static global::hxmath.math.QuaternionDefault log(global::hxmath.math.QuaternionDefault this1) {
			global::hxmath.math.QuaternionDefault self = this1;
			double theta = global::System.Math.Acos(((double) (self.s) ));
			double sinTheta = global::System.Math.Sin(((double) (theta) ));
			if (( sinTheta > 0.0 )) {
				double k = ( theta / sinTheta );
				return ((global::hxmath.math.QuaternionDefault) (new global::hxmath.math.QuaternionDefault(0.0, ( k * self.x ), ( k * self.y ), ( k * self.z ))) );
			}
			else {
				return ((global::hxmath.math.QuaternionDefault) (new global::hxmath.math.QuaternionDefault(((double) (0) ), ((double) (0) ), ((double) (0) ), ((double) (0) ))) );
			}
			
		}
		
		
		public static global::hxmath.math.QuaternionDefault exp(global::hxmath.math.QuaternionDefault this1) {
			global::hxmath.math.QuaternionDefault self = this1;
			double theta = global::System.Math.Sqrt(((double) (( ( ( self.x * self.x ) + ( self.y * self.y ) ) + ( self.z * self.z ) )) ));
			double sinTheta = global::System.Math.Sin(((double) (theta) ));
			double cosTheta = global::System.Math.Cos(((double) (theta) ));
			if (( theta > 0.0 )) {
				return ((global::hxmath.math.QuaternionDefault) (new global::hxmath.math.QuaternionDefault(cosTheta, ( sinTheta * self.x ), ( sinTheta * self.y ), ( sinTheta * self.z ))) );
			}
			else {
				return ((global::hxmath.math.QuaternionDefault) (new global::hxmath.math.QuaternionDefault(cosTheta, ((double) (0) ), ((double) (0) ), ((double) (0) ))) );
			}
			
		}
		
		
		public static global::hxmath.math.Vector3Default rotate(global::hxmath.math.QuaternionDefault this1, global::hxmath.math.Vector3Default u) {
			global::hxmath.math.QuaternionDefault self = this1;
			double a = ( 2.0 * (( ( ( self.x * u.x ) + ( self.y * u.y ) ) + ( self.z * u.z ) )) );
			double b = ( ( ( ( self.s * self.s ) - ( self.x * self.x ) ) - ( self.y * self.y ) ) - ( self.z * self.z ) );
			double c = ( 2.0 * self.s );
			return ((global::hxmath.math.Vector3Default) (new global::hxmath.math.Vector3Default(( ( ( a * self.x ) + ( b * u.x ) ) + ( c * (( ( self.y * u.z ) - ( self.z * u.y ) )) ) ), ( ( ( a * self.y ) + ( b * u.y ) ) + ( c * (( ( self.z * u.x ) - ( self.x * u.z ) )) ) ), ( ( ( a * self.z ) + ( b * u.z ) ) + ( c * (( ( self.x * u.y ) - ( self.y * u.x ) )) ) ))) );
		}
		
		
		public static double angleWith(global::hxmath.math.QuaternionDefault this1, global::hxmath.math.QuaternionDefault b) {
			global::hxmath.math.QuaternionDefault self = this1;
			return ( 2.0 * global::System.Math.Acos(((double) (( (( ( ( ( self.s * b.s ) + ( self.x * b.x ) ) + ( self.y * b.y ) ) + ( self.z * b.z ) )) / (( global::System.Math.Sqrt(((double) (( ( ( ( self.s * self.s ) + ( self.x * self.x ) ) + ( self.y * self.y ) ) + ( self.z * self.z ) )) )) * global::System.Math.Sqrt(((double) (( ( ( ( b.s * b.s ) + ( b.x * b.x ) ) + ( b.y * b.y ) ) + ( b.z * b.z ) )) )) )) )) )) );
		}
		
		
		public static global::hxmath.math.QuaternionDefault normalize(global::hxmath.math.QuaternionDefault this1) {
			global::hxmath.math.QuaternionDefault self = this1;
			double length = global::System.Math.Sqrt(((double) (( ( ( ( self.s * self.s ) + ( self.x * self.x ) ) + ( self.y * self.y ) ) + ( self.z * self.z ) )) ));
			if (( length > 0.0 )) {
				double k = ( 1.0 / length );
				{
					self.s *= k;
					self.x *= k;
					self.y *= k;
					self.z *= k;
				}
				
			}
			
			return self;
		}
		
		
		public static global::hxmath.math.QuaternionDefault applyConjugate(global::hxmath.math.QuaternionDefault this1) {
			global::hxmath.math.QuaternionDefault self = this1;
			self.x =  - (self.x) ;
			self.y =  - (self.y) ;
			self.z =  - (self.z) ;
			return self;
		}
		
		
		public static global::hxmath.math.QuaternionDefault applyInvert(global::hxmath.math.QuaternionDefault this1) {
			global::hxmath.math.QuaternionDefault self = this1;
			self.x =  - (self.x) ;
			self.y =  - (self.y) ;
			self.z =  - (self.z) ;
			global::hxmath.math.QuaternionDefault self1 = ((global::hxmath.math.QuaternionDefault) (self) );
			double length = global::System.Math.Sqrt(((double) (( ( ( ( self1.s * self1.s ) + ( self1.x * self1.x ) ) + ( self1.y * self1.y ) ) + ( self1.z * self1.z ) )) ));
			if (( length > 0.0 )) {
				double k = ( 1.0 / length );
				{
					self1.s *= k;
					self1.x *= k;
					self1.y *= k;
					self1.z *= k;
				}
				
			}
			
			return self1;
		}
		
		
		public static global::hxmath.math.QuaternionDefault get_zero() {
			return ((global::hxmath.math.QuaternionDefault) (new global::hxmath.math.QuaternionDefault(((double) (0) ), ((double) (0) ), ((double) (0) ), ((double) (0) ))) );
		}
		
		
		public static global::hxmath.math.QuaternionDefault get_identity() {
			unchecked {
				return ((global::hxmath.math.QuaternionDefault) (new global::hxmath.math.QuaternionDefault(((double) (1) ), ((double) (0) ), ((double) (0) ), ((double) (0) ))) );
			}
		}
		
		
		public static double get_length(global::hxmath.math.QuaternionDefault this1) {
			global::hxmath.math.QuaternionDefault self = this1;
			return global::System.Math.Sqrt(((double) (( ( ( ( self.s * self.s ) + ( self.x * self.x ) ) + ( self.y * self.y ) ) + ( self.z * self.z ) )) ));
		}
		
		
		public static double get_lengthSq(global::hxmath.math.QuaternionDefault this1) {
			global::hxmath.math.QuaternionDefault self = this1;
			return ( ( ( ( self.s * self.s ) + ( self.x * self.x ) ) + ( self.y * self.y ) ) + ( self.z * self.z ) );
		}
		
		
		public static global::hxmath.math.Matrix3x3Default get_matrix(global::hxmath.math.QuaternionDefault this1) {
			unchecked {
				global::hxmath.math.QuaternionDefault self = this1;
				double s = self.s;
				double x = self.x;
				double y = self.y;
				double z = self.z;
				return ((global::hxmath.math.Matrix3x3Default) (new global::hxmath.math.Matrix3x3Default(( 1 - ( 2 * (( ( y * y ) + ( z * z ) )) ) ), ( 2 * (( ( x * y ) - ( s * z ) )) ), ( 2 * (( ( s * y ) + ( x * z ) )) ), ( 2 * (( ( x * y ) + ( s * z ) )) ), ( 1 - ( 2 * (( ( x * x ) + ( z * z ) )) ) ), ( 2 * (( ( y * z ) - ( s * x ) )) ), ( 2 * (( ( x * z ) - ( s * y ) )) ), ( 2 * (( ( y * z ) + ( s * x ) )) ), ( 1 - ( 2 * (( ( x * x ) + ( y * y ) )) ) ))) );
			}
		}
		
		
		public static global::hxmath.math.QuaternionDefault get_normal(global::hxmath.math.QuaternionDefault this1) {
			global::hxmath.math.QuaternionDefault self = this1;
			double _g = ( 1.0 / global::System.Math.Sqrt(((double) (( ( ( ( self.s * self.s ) + ( self.x * self.x ) ) + ( self.y * self.y ) ) + ( self.z * self.z ) )) )) );
			global::hxmath.math.QuaternionDefault self1 = ((global::hxmath.math.QuaternionDefault) (new global::hxmath.math.QuaternionDefault(self.s, self.x, self.y, self.z)) );
			self1.s *= _g;
			self1.x *= _g;
			self1.y *= _g;
			self1.z *= _g;
			return self1;
		}
		
		
	}
}


