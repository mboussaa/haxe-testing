// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace hxmath.math {
	public class Matrix3x3Default : global::haxe.lang.HxObject {
		
		public Matrix3x3Default(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public Matrix3x3Default(double m00, double m10, double m20, double m01, double m11, double m21, double m02, double m12, double m22) {
			global::hxmath.math.Matrix3x3Default.__hx_ctor_hxmath_math_Matrix3x3Default(this, m00, m10, m20, m01, m11, m21, m02, m12, m22);
		}
		
		
		public static void __hx_ctor_hxmath_math_Matrix3x3Default(global::hxmath.math.Matrix3x3Default __temp_me34, double m00, double m10, double m20, double m01, double m11, double m21, double m02, double m12, double m22) {
			__temp_me34.m00 = m00;
			__temp_me34.m10 = m10;
			__temp_me34.m20 = m20;
			__temp_me34.m01 = m01;
			__temp_me34.m11 = m11;
			__temp_me34.m21 = m21;
			__temp_me34.m02 = m02;
			__temp_me34.m12 = m12;
			__temp_me34.m22 = m22;
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::hxmath.math.Matrix3x3Default(global::haxe.lang.EmptyObject.EMPTY);
		}
		
		
		public static new object __hx_create(global::Array arr) {
			unchecked {
				return new global::hxmath.math.Matrix3x3Default(((double) (global::haxe.lang.Runtime.toDouble(arr[0])) ), ((double) (global::haxe.lang.Runtime.toDouble(arr[1])) ), ((double) (global::haxe.lang.Runtime.toDouble(arr[2])) ), ((double) (global::haxe.lang.Runtime.toDouble(arr[3])) ), ((double) (global::haxe.lang.Runtime.toDouble(arr[4])) ), ((double) (global::haxe.lang.Runtime.toDouble(arr[5])) ), ((double) (global::haxe.lang.Runtime.toDouble(arr[6])) ), ((double) (global::haxe.lang.Runtime.toDouble(arr[7])) ), ((double) (global::haxe.lang.Runtime.toDouble(arr[8])) ));
			}
		}
		
		
		public double m00;
		
		public double m01;
		
		public double m02;
		
		public double m10;
		
		public double m11;
		
		public double m12;
		
		public double m20;
		
		public double m21;
		
		public double m22;
		
		public virtual string toString() {
			return global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("[[", global::haxe.lang.Runtime.toString(this.m00)), ", "), global::haxe.lang.Runtime.toString(this.m10)), ", "), global::haxe.lang.Runtime.toString(this.m20)), "], ["), global::haxe.lang.Runtime.toString(this.m01)), ", "), global::haxe.lang.Runtime.toString(this.m11)), ", "), global::haxe.lang.Runtime.toString(this.m21)), "], ["), global::haxe.lang.Runtime.toString(this.m02)), ", "), global::haxe.lang.Runtime.toString(this.m12)), ", "), global::haxe.lang.Runtime.toString(this.m22)), "]]");
		}
		
		
		public override double __hx_setField_f(string field, int hash, double @value, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 5431661:
					{
						this.m22 = ((double) (@value) );
						return @value;
					}
					
					
					case 5431660:
					{
						this.m21 = ((double) (@value) );
						return @value;
					}
					
					
					case 5431659:
					{
						this.m20 = ((double) (@value) );
						return @value;
					}
					
					
					case 5431438:
					{
						this.m12 = ((double) (@value) );
						return @value;
					}
					
					
					case 5431437:
					{
						this.m11 = ((double) (@value) );
						return @value;
					}
					
					
					case 5431436:
					{
						this.m10 = ((double) (@value) );
						return @value;
					}
					
					
					case 5431215:
					{
						this.m02 = ((double) (@value) );
						return @value;
					}
					
					
					case 5431214:
					{
						this.m01 = ((double) (@value) );
						return @value;
					}
					
					
					case 5431213:
					{
						this.m00 = ((double) (@value) );
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
					case 5431661:
					{
						this.m22 = ((double) (global::haxe.lang.Runtime.toDouble(@value)) );
						return @value;
					}
					
					
					case 5431660:
					{
						this.m21 = ((double) (global::haxe.lang.Runtime.toDouble(@value)) );
						return @value;
					}
					
					
					case 5431659:
					{
						this.m20 = ((double) (global::haxe.lang.Runtime.toDouble(@value)) );
						return @value;
					}
					
					
					case 5431438:
					{
						this.m12 = ((double) (global::haxe.lang.Runtime.toDouble(@value)) );
						return @value;
					}
					
					
					case 5431437:
					{
						this.m11 = ((double) (global::haxe.lang.Runtime.toDouble(@value)) );
						return @value;
					}
					
					
					case 5431436:
					{
						this.m10 = ((double) (global::haxe.lang.Runtime.toDouble(@value)) );
						return @value;
					}
					
					
					case 5431215:
					{
						this.m02 = ((double) (global::haxe.lang.Runtime.toDouble(@value)) );
						return @value;
					}
					
					
					case 5431214:
					{
						this.m01 = ((double) (global::haxe.lang.Runtime.toDouble(@value)) );
						return @value;
					}
					
					
					case 5431213:
					{
						this.m00 = ((double) (global::haxe.lang.Runtime.toDouble(@value)) );
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
					
					
					case 5431661:
					{
						return this.m22;
					}
					
					
					case 5431660:
					{
						return this.m21;
					}
					
					
					case 5431659:
					{
						return this.m20;
					}
					
					
					case 5431438:
					{
						return this.m12;
					}
					
					
					case 5431437:
					{
						return this.m11;
					}
					
					
					case 5431436:
					{
						return this.m10;
					}
					
					
					case 5431215:
					{
						return this.m02;
					}
					
					
					case 5431214:
					{
						return this.m01;
					}
					
					
					case 5431213:
					{
						return this.m00;
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
					case 5431661:
					{
						return this.m22;
					}
					
					
					case 5431660:
					{
						return this.m21;
					}
					
					
					case 5431659:
					{
						return this.m20;
					}
					
					
					case 5431438:
					{
						return this.m12;
					}
					
					
					case 5431437:
					{
						return this.m11;
					}
					
					
					case 5431436:
					{
						return this.m10;
					}
					
					
					case 5431215:
					{
						return this.m02;
					}
					
					
					case 5431214:
					{
						return this.m01;
					}
					
					
					case 5431213:
					{
						return this.m00;
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
			baseArr.push("m22");
			baseArr.push("m21");
			baseArr.push("m20");
			baseArr.push("m12");
			baseArr.push("m11");
			baseArr.push("m10");
			baseArr.push("m02");
			baseArr.push("m01");
			baseArr.push("m00");
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
namespace hxmath.math._Matrix3x3 {
	public sealed class Matrix3x3_Impl_ {
		
		static Matrix3x3_Impl_() {
			unchecked {
				global::hxmath.math._Matrix3x3.Matrix3x3_Impl_.elementCount = 9;
			}
		}
		
		
		public static int elementCount;
		
		
		
		
		
		
		
		
		
		public static global::hxmath.math.Matrix3x3Default _new(double m00, double m10, double m20, double m01, double m11, double m21, double m02, double m12, double m22) {
			return ((global::hxmath.math.Matrix3x3Default) (new global::hxmath.math.Matrix3x3Default(m00, m10, m20, m01, m11, m21, m02, m12, m22)) );
		}
		
		
		public static global::hxmath.math.Matrix3x3Default fromArray(global::Array<double> rawData) {
			unchecked {
				if (( rawData.length != 9 )) {
					throw global::haxe.lang.HaxeException.wrap("Invalid rawData.");
				}
				
				return ((global::hxmath.math.Matrix3x3Default) (new global::hxmath.math.Matrix3x3Default(rawData[0], rawData[1], rawData[2], rawData[3], rawData[4], rawData[5], rawData[6], rawData[7], rawData[8])) );
			}
		}
		
		
		public static global::hxmath.math.Matrix3x3Default fromMatrix3x3Shape(global::hxmath.math.Matrix3x3Default other) {
			return ((global::hxmath.math.Matrix3x3Default) (new global::hxmath.math.Matrix3x3Default(other.m00, other.m10, other.m20, other.m01, other.m11, other.m21, other.m02, other.m12, other.m22)) );
		}
		
		
		public static global::hxmath.math.Matrix3x3Default multiplyScalar(double s, global::hxmath.math.Matrix3x3Default a) {
			return ((global::hxmath.math.Matrix3x3Default) (new global::hxmath.math.Matrix3x3Default(( s * a.m00 ), ( s * a.m10 ), ( s * a.m20 ), ( s * a.m01 ), ( s * a.m11 ), ( s * a.m21 ), ( s * a.m02 ), ( s * a.m12 ), ( s * a.m22 ))) );
		}
		
		
		public static global::hxmath.math.Vector3Default multiplyVector(global::hxmath.math.Matrix3x3Default a, global::hxmath.math.Vector3Default v) {
			return ((global::hxmath.math.Vector3Default) (new global::hxmath.math.Vector3Default(( ( ( a.m00 * v.x ) + ( a.m10 * v.y ) ) + ( a.m20 * v.z ) ), ( ( ( a.m01 * v.x ) + ( a.m11 * v.y ) ) + ( a.m21 * v.z ) ), ( ( ( a.m02 * v.x ) + ( a.m12 * v.y ) ) + ( a.m22 * v.z ) ))) );
		}
		
		
		public static global::hxmath.math.Matrix3x3Default multiply(global::hxmath.math.Matrix3x3Default a, global::hxmath.math.Matrix3x3Default b) {
			return ((global::hxmath.math.Matrix3x3Default) (new global::hxmath.math.Matrix3x3Default(( ( ( a.m00 * b.m00 ) + ( a.m10 * b.m01 ) ) + ( a.m20 * b.m02 ) ), ( ( ( a.m00 * b.m10 ) + ( a.m10 * b.m11 ) ) + ( a.m20 * b.m12 ) ), ( ( ( a.m00 * b.m20 ) + ( a.m10 * b.m21 ) ) + ( a.m20 * b.m22 ) ), ( ( ( a.m01 * b.m00 ) + ( a.m11 * b.m01 ) ) + ( a.m21 * b.m02 ) ), ( ( ( a.m01 * b.m10 ) + ( a.m11 * b.m11 ) ) + ( a.m21 * b.m12 ) ), ( ( ( a.m01 * b.m20 ) + ( a.m11 * b.m21 ) ) + ( a.m21 * b.m22 ) ), ( ( ( a.m02 * b.m00 ) + ( a.m12 * b.m01 ) ) + ( a.m22 * b.m02 ) ), ( ( ( a.m02 * b.m10 ) + ( a.m12 * b.m11 ) ) + ( a.m22 * b.m12 ) ), ( ( ( a.m02 * b.m20 ) + ( a.m12 * b.m21 ) ) + ( a.m22 * b.m22 ) ))) );
		}
		
		
		public static global::hxmath.math.Matrix3x3Default @add(global::hxmath.math.Matrix3x3Default a, global::hxmath.math.Matrix3x3Default b) {
			global::hxmath.math.Matrix3x3Default self = ((global::hxmath.math.Matrix3x3Default) (new global::hxmath.math.Matrix3x3Default(a.m00, a.m10, a.m20, a.m01, a.m11, a.m21, a.m02, a.m12, a.m22)) );
			self.m00 += b.m00;
			self.m10 += b.m10;
			self.m20 += b.m20;
			self.m01 += b.m01;
			self.m11 += b.m11;
			self.m21 += b.m21;
			self.m02 += b.m02;
			self.m12 += b.m12;
			self.m22 += b.m22;
			return self;
		}
		
		
		public static global::hxmath.math.Matrix3x3Default subtract(global::hxmath.math.Matrix3x3Default a, global::hxmath.math.Matrix3x3Default b) {
			global::hxmath.math.Matrix3x3Default self = ((global::hxmath.math.Matrix3x3Default) (new global::hxmath.math.Matrix3x3Default(a.m00, a.m10, a.m20, a.m01, a.m11, a.m21, a.m02, a.m12, a.m22)) );
			self.m00 -= b.m00;
			self.m10 -= b.m10;
			self.m20 -= b.m20;
			self.m01 -= b.m01;
			self.m11 -= b.m11;
			self.m21 -= b.m21;
			self.m02 -= b.m02;
			self.m12 -= b.m12;
			self.m22 -= b.m22;
			return self;
		}
		
		
		public static global::hxmath.math.Matrix3x3Default negate(global::hxmath.math.Matrix3x3Default a) {
			return ((global::hxmath.math.Matrix3x3Default) (new global::hxmath.math.Matrix3x3Default( - (a.m00) ,  - (a.m10) ,  - (a.m20) ,  - (a.m01) ,  - (a.m11) ,  - (a.m21) ,  - (a.m02) ,  - (a.m12) ,  - (a.m22) )) );
		}
		
		
		public static bool @equals(global::hxmath.math.Matrix3x3Default a, global::hxmath.math.Matrix3x3Default b) {
			if ( ! ((( ( a == null ) && ( b == null ) ))) ) {
				if (( ( ( ( ( ( ( ( ( ( a != null ) && ( b != null ) ) && ( a.m00 == b.m00 ) ) && ( a.m10 == b.m10 ) ) && ( a.m20 == b.m20 ) ) && ( a.m01 == b.m01 ) ) && ( a.m11 == b.m11 ) ) && ( a.m21 == b.m21 ) ) && ( a.m02 == b.m02 ) ) && ( a.m12 == b.m12 ) )) {
					return ( a.m22 == b.m22 );
				}
				else {
					return false;
				}
				
			}
			else {
				return true;
			}
			
		}
		
		
		public static global::hxmath.math.Matrix3x3Default rotationX(double angleDegrees) {
			unchecked {
				double angleRadians = ( ( global::Math.PI / 180 ) * angleDegrees );
				double s = global::System.Math.Sin(((double) (angleRadians) ));
				double c = global::System.Math.Cos(((double) (angleRadians) ));
				return ((global::hxmath.math.Matrix3x3Default) (new global::hxmath.math.Matrix3x3Default(((double) (1) ), ((double) (0) ), ((double) (0) ), ((double) (0) ), c,  - (s) , ((double) (0) ), s, c)) );
			}
		}
		
		
		public static global::hxmath.math.Matrix3x3Default rotationY(double angleDegrees) {
			unchecked {
				double angleRadians = ( ( global::Math.PI / 180 ) * angleDegrees );
				double s = global::System.Math.Sin(((double) (angleRadians) ));
				double c = global::System.Math.Cos(((double) (angleRadians) ));
				return ((global::hxmath.math.Matrix3x3Default) (new global::hxmath.math.Matrix3x3Default(c, ((double) (0) ), s, ((double) (0) ), ((double) (1) ), ((double) (0) ),  - (s) , ((double) (0) ), c)) );
			}
		}
		
		
		public static global::hxmath.math.Matrix3x3Default rotationZ(double angleDegrees) {
			unchecked {
				double angleRadians = ( ( global::Math.PI / 180 ) * angleDegrees );
				double s = global::System.Math.Sin(((double) (angleRadians) ));
				double c = global::System.Math.Cos(((double) (angleRadians) ));
				return ((global::hxmath.math.Matrix3x3Default) (new global::hxmath.math.Matrix3x3Default(c,  - (s) , ((double) (0) ), s, c, ((double) (0) ), ((double) (0) ), ((double) (0) ), ((double) (1) ))) );
			}
		}
		
		
		public static global::hxmath.math.Matrix3x3Default scale(double sx, double sy, double sz) {
			return ((global::hxmath.math.Matrix3x3Default) (new global::hxmath.math.Matrix3x3Default(sx, 0.0, 0.0, 0.0, sy, 0.0, 0.0, 0.0, sz)) );
		}
		
		
		public static global::hxmath.math.Matrix3x3Default @set(global::hxmath.math.Matrix3x3Default this1, double m00, double m10, double m20, double m01, double m11, double m21, double m02, double m12, double m22) {
			global::hxmath.math.Matrix3x3Default self = this1;
			self.m00 = m00;
			self.m10 = m10;
			self.m20 = m20;
			self.m01 = m01;
			self.m11 = m11;
			self.m21 = m21;
			self.m02 = m02;
			self.m12 = m12;
			self.m22 = m22;
			return self;
		}
		
		
		public static global::hxmath.math.Matrix3x3Default addWith(global::hxmath.math.Matrix3x3Default this1, global::hxmath.math.Matrix3x3Default a) {
			global::hxmath.math.Matrix3x3Default self = this1;
			self.m00 += a.m00;
			self.m10 += a.m10;
			self.m20 += a.m20;
			self.m01 += a.m01;
			self.m11 += a.m11;
			self.m21 += a.m21;
			self.m02 += a.m02;
			self.m12 += a.m12;
			self.m22 += a.m22;
			return self;
		}
		
		
		public static global::hxmath.math.Matrix3x3Default subtractWith(global::hxmath.math.Matrix3x3Default this1, global::hxmath.math.Matrix3x3Default a) {
			global::hxmath.math.Matrix3x3Default self = this1;
			self.m00 -= a.m00;
			self.m10 -= a.m10;
			self.m20 -= a.m20;
			self.m01 -= a.m01;
			self.m11 -= a.m11;
			self.m21 -= a.m21;
			self.m02 -= a.m02;
			self.m12 -= a.m12;
			self.m22 -= a.m22;
			return self;
		}
		
		
		public static void copyTo(global::hxmath.math.Matrix3x3Default this1, global::hxmath.math.Matrix3x3Default target) {
			unchecked {
				global::hxmath.math.Matrix3x3Default self = this1;
				{
					int _g = 0;
					while (( _g < 9 )) {
						int i = _g++;
						{
							object tmp = null;
							switch (i) {
								case 0:
								{
									tmp = self.m00;
									break;
								}
								
								
								case 1:
								{
									tmp = self.m10;
									break;
								}
								
								
								case 2:
								{
									tmp = self.m20;
									break;
								}
								
								
								case 3:
								{
									tmp = self.m01;
									break;
								}
								
								
								case 4:
								{
									tmp = self.m11;
									break;
								}
								
								
								case 5:
								{
									tmp = self.m21;
									break;
								}
								
								
								case 6:
								{
									tmp = self.m02;
									break;
								}
								
								
								case 7:
								{
									tmp = self.m12;
									break;
								}
								
								
								case 8:
								{
									tmp = self.m22;
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
									target.m00 = @value;
									break;
								}
								
								
								case 1:
								{
									target.m10 = @value;
									break;
								}
								
								
								case 2:
								{
									target.m20 = @value;
									break;
								}
								
								
								case 3:
								{
									target.m01 = @value;
									break;
								}
								
								
								case 4:
								{
									target.m11 = @value;
									break;
								}
								
								
								case 5:
								{
									target.m21 = @value;
									break;
								}
								
								
								case 6:
								{
									target.m02 = @value;
									break;
								}
								
								
								case 7:
								{
									target.m12 = @value;
									break;
								}
								
								
								case 8:
								{
									target.m22 = @value;
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
		
		
		public static void copyToShape(global::hxmath.math.Matrix3x3Default this1, object target) {
			global::hxmath.math.Matrix3x3Default self = this1;
			global::haxe.lang.Runtime.setField_f(target, "m00", 5431213, self.m00);
			global::haxe.lang.Runtime.setField_f(target, "m01", 5431214, self.m01);
			global::haxe.lang.Runtime.setField_f(target, "m02", 5431215, self.m02);
			global::haxe.lang.Runtime.setField_f(target, "m10", 5431436, self.m10);
			global::haxe.lang.Runtime.setField_f(target, "m11", 5431437, self.m11);
			global::haxe.lang.Runtime.setField_f(target, "m12", 5431438, self.m12);
			global::haxe.lang.Runtime.setField_f(target, "m20", 5431659, self.m20);
			global::haxe.lang.Runtime.setField_f(target, "m21", 5431660, self.m21);
			global::haxe.lang.Runtime.setField_f(target, "m22", 5431661, self.m22);
		}
		
		
		public static void copyFromShape(global::hxmath.math.Matrix3x3Default this1, object source) {
			global::hxmath.math.Matrix3x3Default self = this1;
			self.m00 = global::haxe.lang.Runtime.getField_f(source, "m00", 5431213, true);
			self.m01 = global::haxe.lang.Runtime.getField_f(source, "m01", 5431214, true);
			self.m02 = global::haxe.lang.Runtime.getField_f(source, "m02", 5431215, true);
			self.m10 = global::haxe.lang.Runtime.getField_f(source, "m10", 5431436, true);
			self.m11 = global::haxe.lang.Runtime.getField_f(source, "m11", 5431437, true);
			self.m12 = global::haxe.lang.Runtime.getField_f(source, "m12", 5431438, true);
			self.m20 = global::haxe.lang.Runtime.getField_f(source, "m20", 5431659, true);
			self.m21 = global::haxe.lang.Runtime.getField_f(source, "m21", 5431660, true);
			self.m22 = global::haxe.lang.Runtime.getField_f(source, "m22", 5431661, true);
		}
		
		
		public static global::hxmath.math.Matrix3x3Default clone(global::hxmath.math.Matrix3x3Default this1) {
			global::hxmath.math.Matrix3x3Default self = this1;
			return ((global::hxmath.math.Matrix3x3Default) (new global::hxmath.math.Matrix3x3Default(self.m00, self.m10, self.m20, self.m01, self.m11, self.m21, self.m02, self.m12, self.m22)) );
		}
		
		
		public static double getArrayElement(global::hxmath.math.Matrix3x3Default this1, int i) {
			unchecked {
				global::hxmath.math.Matrix3x3Default self = this1;
				switch (i) {
					case 0:
					{
						return self.m00;
					}
					
					
					case 1:
					{
						return self.m10;
					}
					
					
					case 2:
					{
						return self.m20;
					}
					
					
					case 3:
					{
						return self.m01;
					}
					
					
					case 4:
					{
						return self.m11;
					}
					
					
					case 5:
					{
						return self.m21;
					}
					
					
					case 6:
					{
						return self.m02;
					}
					
					
					case 7:
					{
						return self.m12;
					}
					
					
					case 8:
					{
						return self.m22;
					}
					
					
					default:
					{
						throw global::haxe.lang.HaxeException.wrap("Invalid element");
					}
					
				}
				
			}
		}
		
		
		public static double setArrayElement(global::hxmath.math.Matrix3x3Default this1, int i, double @value) {
			unchecked {
				global::hxmath.math.Matrix3x3Default self = this1;
				switch (i) {
					case 0:
					{
						return self.m00 = @value;
					}
					
					
					case 1:
					{
						return self.m10 = @value;
					}
					
					
					case 2:
					{
						return self.m20 = @value;
					}
					
					
					case 3:
					{
						return self.m01 = @value;
					}
					
					
					case 4:
					{
						return self.m11 = @value;
					}
					
					
					case 5:
					{
						return self.m21 = @value;
					}
					
					
					case 6:
					{
						return self.m02 = @value;
					}
					
					
					case 7:
					{
						return self.m12 = @value;
					}
					
					
					case 8:
					{
						return self.m22 = @value;
					}
					
					
					default:
					{
						throw global::haxe.lang.HaxeException.wrap("Invalid element");
					}
					
				}
				
			}
		}
		
		
		public static double getElement(global::hxmath.math.Matrix3x3Default this1, int column, int row) {
			unchecked {
				global::hxmath.math.Matrix3x3Default self = this1;
				object tmp = null;
				switch (( ( row * 3 ) + column )) {
					case 0:
					{
						tmp = self.m00;
						break;
					}
					
					
					case 1:
					{
						tmp = self.m10;
						break;
					}
					
					
					case 2:
					{
						tmp = self.m20;
						break;
					}
					
					
					case 3:
					{
						tmp = self.m01;
						break;
					}
					
					
					case 4:
					{
						tmp = self.m11;
						break;
					}
					
					
					case 5:
					{
						tmp = self.m21;
						break;
					}
					
					
					case 6:
					{
						tmp = self.m02;
						break;
					}
					
					
					case 7:
					{
						tmp = self.m12;
						break;
					}
					
					
					case 8:
					{
						tmp = self.m22;
						break;
					}
					
					
					default:
					{
						throw global::haxe.lang.HaxeException.wrap("Invalid element");
					}
					
				}
				
				return ((double) (global::haxe.lang.Runtime.toDouble(tmp)) );
			}
		}
		
		
		public static double setElement(global::hxmath.math.Matrix3x3Default this1, int column, int row, double @value) {
			unchecked {
				global::hxmath.math.Matrix3x3Default self = this1;
				object tmp = null;
				switch (( ( row * 3 ) + column )) {
					case 0:
					{
						tmp = self.m00 = @value;
						break;
					}
					
					
					case 1:
					{
						tmp = self.m10 = @value;
						break;
					}
					
					
					case 2:
					{
						tmp = self.m20 = @value;
						break;
					}
					
					
					case 3:
					{
						tmp = self.m01 = @value;
						break;
					}
					
					
					case 4:
					{
						tmp = self.m11 = @value;
						break;
					}
					
					
					case 5:
					{
						tmp = self.m21 = @value;
						break;
					}
					
					
					case 6:
					{
						tmp = self.m02 = @value;
						break;
					}
					
					
					case 7:
					{
						tmp = self.m12 = @value;
						break;
					}
					
					
					case 8:
					{
						tmp = self.m22 = @value;
						break;
					}
					
					
					default:
					{
						throw global::haxe.lang.HaxeException.wrap("Invalid element");
					}
					
				}
				
				return ((double) (global::haxe.lang.Runtime.toDouble(tmp)) );
			}
		}
		
		
		public static global::hxmath.math.Vector3Default col(global::hxmath.math.Matrix3x3Default this1, int index) {
			unchecked {
				global::hxmath.math.Matrix3x3Default self = this1;
				switch (index) {
					case 0:
					{
						return ((global::hxmath.math.Vector3Default) (new global::hxmath.math.Vector3Default(self.m00, self.m01, self.m02)) );
					}
					
					
					case 1:
					{
						return ((global::hxmath.math.Vector3Default) (new global::hxmath.math.Vector3Default(self.m10, self.m11, self.m12)) );
					}
					
					
					case 2:
					{
						return ((global::hxmath.math.Vector3Default) (new global::hxmath.math.Vector3Default(self.m20, self.m21, self.m22)) );
					}
					
					
					default:
					{
						throw global::haxe.lang.HaxeException.wrap("Invalid column");
					}
					
				}
				
			}
		}
		
		
		public static global::hxmath.math.Vector3Default row(global::hxmath.math.Matrix3x3Default this1, int index) {
			unchecked {
				global::hxmath.math.Matrix3x3Default self = this1;
				switch (index) {
					case 0:
					{
						return ((global::hxmath.math.Vector3Default) (new global::hxmath.math.Vector3Default(self.m00, self.m10, self.m20)) );
					}
					
					
					case 1:
					{
						return ((global::hxmath.math.Vector3Default) (new global::hxmath.math.Vector3Default(self.m01, self.m11, self.m21)) );
					}
					
					
					case 2:
					{
						return ((global::hxmath.math.Vector3Default) (new global::hxmath.math.Vector3Default(self.m02, self.m12, self.m22)) );
					}
					
					
					default:
					{
						throw global::haxe.lang.HaxeException.wrap("Invalid row");
					}
					
				}
				
			}
		}
		
		
		public static global::hxmath.math.Matrix3x3Default applyScalarFunc(global::hxmath.math.Matrix3x3Default this1, global::haxe.lang.Function func) {
			unchecked {
				global::hxmath.math.Matrix3x3Default self = this1;
				{
					int _g = 0;
					while (( _g < 9 )) {
						int i = _g++;
						{
							object tmp = null;
							switch (i) {
								case 0:
								{
									tmp = self.m00;
									break;
								}
								
								
								case 1:
								{
									tmp = self.m10;
									break;
								}
								
								
								case 2:
								{
									tmp = self.m20;
									break;
								}
								
								
								case 3:
								{
									tmp = self.m01;
									break;
								}
								
								
								case 4:
								{
									tmp = self.m11;
									break;
								}
								
								
								case 5:
								{
									tmp = self.m21;
									break;
								}
								
								
								case 6:
								{
									tmp = self.m02;
									break;
								}
								
								
								case 7:
								{
									tmp = self.m12;
									break;
								}
								
								
								case 8:
								{
									tmp = self.m22;
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
									self.m00 = @value;
									break;
								}
								
								
								case 1:
								{
									self.m10 = @value;
									break;
								}
								
								
								case 2:
								{
									self.m20 = @value;
									break;
								}
								
								
								case 3:
								{
									self.m01 = @value;
									break;
								}
								
								
								case 4:
								{
									self.m11 = @value;
									break;
								}
								
								
								case 5:
								{
									self.m21 = @value;
									break;
								}
								
								
								case 6:
								{
									self.m02 = @value;
									break;
								}
								
								
								case 7:
								{
									self.m12 = @value;
									break;
								}
								
								
								case 8:
								{
									self.m22 = @value;
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
		
		
		public static global::hxmath.math.Matrix3x3Default get_zero() {
			return ((global::hxmath.math.Matrix3x3Default) (new global::hxmath.math.Matrix3x3Default(0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0)) );
		}
		
		
		public static global::hxmath.math.Matrix3x3Default get_identity() {
			return ((global::hxmath.math.Matrix3x3Default) (new global::hxmath.math.Matrix3x3Default(1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0)) );
		}
		
		
		public static double get_det(global::hxmath.math.Matrix3x3Default this1) {
			global::hxmath.math.Matrix3x3Default self = this1;
			double m00 = self.m00;
			double m10 = self.m10;
			double m20 = self.m20;
			double m01 = self.m01;
			double m11 = self.m11;
			double m21 = self.m21;
			double m02 = self.m02;
			double m12 = self.m12;
			double m22 = self.m22;
			return ( ( ( m00 * (( ( m11 * m22 ) - ( m21 * m12 ) )) ) - ( m10 * (( ( m01 * m22 ) - ( m21 * m02 ) )) ) ) + ( m20 * (( ( m01 * m12 ) - ( m11 * m02 ) )) ) );
		}
		
		
		public static global::hxmath.math.Matrix3x3Default get_transpose(global::hxmath.math.Matrix3x3Default this1) {
			global::hxmath.math.Matrix3x3Default self = this1;
			return ((global::hxmath.math.Matrix3x3Default) (new global::hxmath.math.Matrix3x3Default(self.m00, self.m01, self.m02, self.m10, self.m11, self.m12, self.m20, self.m21, self.m22)) );
		}
		
		
	}
}


