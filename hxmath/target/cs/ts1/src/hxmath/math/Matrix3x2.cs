// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace hxmath.math {
	public class Matrix3x2Default : global::haxe.lang.HxObject {
		
		public Matrix3x2Default(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public Matrix3x2Default(double a, double b, double c, double d, double tx, double ty) {
			global::hxmath.math.Matrix3x2Default.__hx_ctor_hxmath_math_Matrix3x2Default(this, a, b, c, d, tx, ty);
		}
		
		
		public static void __hx_ctor_hxmath_math_Matrix3x2Default(global::hxmath.math.Matrix3x2Default __temp_me33, double a, double b, double c, double d, double tx, double ty) {
			__temp_me33.a = a;
			__temp_me33.b = b;
			__temp_me33.c = c;
			__temp_me33.d = d;
			__temp_me33.tx = tx;
			__temp_me33.ty = ty;
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::hxmath.math.Matrix3x2Default(global::haxe.lang.EmptyObject.EMPTY);
		}
		
		
		public static new object __hx_create(global::Array arr) {
			unchecked {
				return new global::hxmath.math.Matrix3x2Default(((double) (global::haxe.lang.Runtime.toDouble(arr[0])) ), ((double) (global::haxe.lang.Runtime.toDouble(arr[1])) ), ((double) (global::haxe.lang.Runtime.toDouble(arr[2])) ), ((double) (global::haxe.lang.Runtime.toDouble(arr[3])) ), ((double) (global::haxe.lang.Runtime.toDouble(arr[4])) ), ((double) (global::haxe.lang.Runtime.toDouble(arr[5])) ));
			}
		}
		
		
		public double a;
		
		public double b;
		
		public double c;
		
		public double d;
		
		public double tx;
		
		public double ty;
		
		public virtual string toString() {
			return global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("[a: ", global::haxe.lang.Runtime.toString(this.a)), ", b: "), global::haxe.lang.Runtime.toString(this.b)), ", c: "), global::haxe.lang.Runtime.toString(this.c)), ", d: "), global::haxe.lang.Runtime.toString(this.d)), ", tx: "), global::haxe.lang.Runtime.toString(this.tx)), ", ty: "), global::haxe.lang.Runtime.toString(this.ty)), "]");
		}
		
		
		public override double __hx_setField_f(string field, int hash, double @value, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 25989:
					{
						this.ty = ((double) (@value) );
						return @value;
					}
					
					
					case 25988:
					{
						this.tx = ((double) (@value) );
						return @value;
					}
					
					
					case 100:
					{
						this.d = ((double) (@value) );
						return @value;
					}
					
					
					case 99:
					{
						this.c = ((double) (@value) );
						return @value;
					}
					
					
					case 98:
					{
						this.b = ((double) (@value) );
						return @value;
					}
					
					
					case 97:
					{
						this.a = ((double) (@value) );
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
					case 25989:
					{
						this.ty = ((double) (global::haxe.lang.Runtime.toDouble(@value)) );
						return @value;
					}
					
					
					case 25988:
					{
						this.tx = ((double) (global::haxe.lang.Runtime.toDouble(@value)) );
						return @value;
					}
					
					
					case 100:
					{
						this.d = ((double) (global::haxe.lang.Runtime.toDouble(@value)) );
						return @value;
					}
					
					
					case 99:
					{
						this.c = ((double) (global::haxe.lang.Runtime.toDouble(@value)) );
						return @value;
					}
					
					
					case 98:
					{
						this.b = ((double) (global::haxe.lang.Runtime.toDouble(@value)) );
						return @value;
					}
					
					
					case 97:
					{
						this.a = ((double) (global::haxe.lang.Runtime.toDouble(@value)) );
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
					
					
					case 25989:
					{
						return this.ty;
					}
					
					
					case 25988:
					{
						return this.tx;
					}
					
					
					case 100:
					{
						return this.d;
					}
					
					
					case 99:
					{
						return this.c;
					}
					
					
					case 98:
					{
						return this.b;
					}
					
					
					case 97:
					{
						return this.a;
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
					case 25989:
					{
						return this.ty;
					}
					
					
					case 25988:
					{
						return this.tx;
					}
					
					
					case 100:
					{
						return this.d;
					}
					
					
					case 99:
					{
						return this.c;
					}
					
					
					case 98:
					{
						return this.b;
					}
					
					
					case 97:
					{
						return this.a;
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
			baseArr.push("ty");
			baseArr.push("tx");
			baseArr.push("d");
			baseArr.push("c");
			baseArr.push("b");
			baseArr.push("a");
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
namespace hxmath.math._Matrix3x2 {
	public sealed class Matrix3x2_Impl_ {
		
		static Matrix3x2_Impl_() {
			unchecked {
				global::hxmath.math._Matrix3x2.Matrix3x2_Impl_.elementCount = 6;
			}
		}
		
		
		public static int elementCount;
		
		
		
		
		
		
		
		
		
		public static global::hxmath.math.Matrix3x2Default _new(double a, double b, double c, double d, double tx, double ty) {
			return ((global::hxmath.math.Matrix3x2Default) (new global::hxmath.math.Matrix3x2Default(a, b, c, d, tx, ty)) );
		}
		
		
		public static global::hxmath.math.Matrix3x2Default fromArray(global::Array<double> rawData) {
			unchecked {
				if (( rawData.length != 6 )) {
					throw global::haxe.lang.HaxeException.wrap("Invalid rawData.");
				}
				
				return ((global::hxmath.math.Matrix3x2Default) (new global::hxmath.math.Matrix3x2Default(rawData[0], rawData[1], rawData[2], rawData[3], rawData[4], rawData[5])) );
			}
		}
		
		
		public static global::hxmath.math.Matrix3x2Default fromMatrix3x2Shape(global::hxmath.math.Matrix3x2Default other) {
			return ((global::hxmath.math.Matrix3x2Default) (new global::hxmath.math.Matrix3x2Default(other.a, other.b, other.c, other.d, other.tx, other.ty)) );
		}
		
		
		public static global::hxmath.math.Matrix3x2Default multiplyScalar(double s, global::hxmath.math.Matrix3x2Default m) {
			return ((global::hxmath.math.Matrix3x2Default) (new global::hxmath.math.Matrix3x2Default(( s * m.a ), ( s * m.b ), ( s * m.c ), ( s * m.d ), ( s * m.tx ), ( s * m.ty ))) );
		}
		
		
		public static global::hxmath.math.Vector2Default transform(global::hxmath.math.Matrix3x2Default m, global::hxmath.math.Vector2Default v) {
			global::hxmath.math.Matrix2x2Default m1 = ((global::hxmath.math.Matrix2x2Default) (new global::hxmath.math.Matrix2x2Default(m.a, m.b, m.c, m.d)) );
			global::hxmath.math.Vector2Default a = ((global::hxmath.math.Vector2Default) (new global::hxmath.math.Vector2Default(( ( m1.a * v.x ) + ( m1.b * v.y ) ), ( ( m1.c * v.x ) + ( m1.d * v.y ) ))) );
			global::hxmath.math.Vector2Default b = ((global::hxmath.math.Vector2Default) (new global::hxmath.math.Vector2Default(m.tx, m.ty)) );
			global::hxmath.math.Vector2Default self = ((global::hxmath.math.Vector2Default) (new global::hxmath.math.Vector2Default(a.x, a.y)) );
			self.x += b.x;
			self.y += b.y;
			return self;
		}
		
		
		public static global::hxmath.math.Matrix3x2Default concat(global::hxmath.math.Matrix3x2Default m, global::hxmath.math.Matrix3x2Default n) {
			global::hxmath.math.Matrix2x2Default mLinear = ((global::hxmath.math.Matrix2x2Default) (new global::hxmath.math.Matrix2x2Default(m.a, m.b, m.c, m.d)) );
			global::hxmath.math.Matrix2x2Default nLinear = ((global::hxmath.math.Matrix2x2Default) (new global::hxmath.math.Matrix2x2Default(n.a, n.b, n.c, n.d)) );
			global::hxmath.math.Matrix2x2Default resultLinear = ((global::hxmath.math.Matrix2x2Default) (new global::hxmath.math.Matrix2x2Default(( ( mLinear.a * nLinear.a ) + ( mLinear.b * nLinear.c ) ), ( ( mLinear.a * nLinear.b ) + ( mLinear.b * nLinear.d ) ), ( ( mLinear.c * nLinear.a ) + ( mLinear.d * nLinear.c ) ), ( ( mLinear.c * nLinear.b ) + ( mLinear.d * nLinear.d ) ))) );
			global::hxmath.math.Vector2Default v = ((global::hxmath.math.Vector2Default) (new global::hxmath.math.Vector2Default(m.tx, m.ty)) );
			global::hxmath.math.Vector2Default a = ((global::hxmath.math.Vector2Default) (new global::hxmath.math.Vector2Default(( ( nLinear.a * v.x ) + ( nLinear.b * v.y ) ), ( ( nLinear.c * v.x ) + ( nLinear.d * v.y ) ))) );
			global::hxmath.math.Vector2Default b = ((global::hxmath.math.Vector2Default) (new global::hxmath.math.Vector2Default(n.tx, n.ty)) );
			global::hxmath.math.Vector2Default self = ((global::hxmath.math.Vector2Default) (new global::hxmath.math.Vector2Default(a.x, a.y)) );
			self.x += b.x;
			self.y += b.y;
			return ((global::hxmath.math.Matrix3x2Default) (new global::hxmath.math.Matrix3x2Default(resultLinear.a, resultLinear.b, resultLinear.c, resultLinear.d, self.x, self.y)) );
		}
		
		
		public static global::hxmath.math.Matrix3x2Default @add(global::hxmath.math.Matrix3x2Default m, global::hxmath.math.Matrix3x2Default n) {
			global::hxmath.math.Matrix3x2Default self = ((global::hxmath.math.Matrix3x2Default) (new global::hxmath.math.Matrix3x2Default(m.a, m.b, m.c, m.d, m.tx, m.ty)) );
			self.a += n.a;
			self.b += n.b;
			self.c += n.c;
			self.d += n.d;
			self.tx += n.tx;
			self.ty += n.ty;
			return self;
		}
		
		
		public static global::hxmath.math.Matrix3x2Default subtract(global::hxmath.math.Matrix3x2Default m, global::hxmath.math.Matrix3x2Default n) {
			global::hxmath.math.Matrix3x2Default self = ((global::hxmath.math.Matrix3x2Default) (new global::hxmath.math.Matrix3x2Default(m.a, m.b, m.c, m.d, m.tx, m.ty)) );
			self.a -= n.a;
			self.b -= n.b;
			self.c -= n.c;
			self.d -= n.d;
			self.tx -= n.tx;
			self.ty -= n.ty;
			return self;
		}
		
		
		public static global::hxmath.math.Matrix3x2Default negate(global::hxmath.math.Matrix3x2Default m) {
			return ((global::hxmath.math.Matrix3x2Default) (new global::hxmath.math.Matrix3x2Default( - (m.a) ,  - (m.b) ,  - (m.c) ,  - (m.d) ,  - (m.tx) ,  - (m.ty) )) );
		}
		
		
		public static bool @equals(global::hxmath.math.Matrix3x2Default m, global::hxmath.math.Matrix3x2Default n) {
			if ( ! ((( ( m == null ) && ( n == null ) ))) ) {
				if (( ( ( ( ( ( ( m != null ) && ( n != null ) ) && ( m.a == n.a ) ) && ( m.b == n.b ) ) && ( m.c == n.c ) ) && ( m.d == n.d ) ) && ( m.tx == n.tx ) )) {
					return ( m.ty == n.ty );
				}
				else {
					return false;
				}
				
			}
			else {
				return true;
			}
			
		}
		
		
		public static global::hxmath.math.Matrix3x2Default rotate(double angle) {
			global::hxmath.math.Matrix3x2Default m = ((global::hxmath.math.Matrix3x2Default) (new global::hxmath.math.Matrix3x2Default(1.0, 0.0, 0.0, 1.0, 0.0, 0.0)) );
			{
				global::hxmath.math.Matrix2x2Default self = ((global::hxmath.math.Matrix2x2Default) (new global::hxmath.math.Matrix2x2Default(0.0, 0.0, 0.0, 0.0)) );
				double s = global::System.Math.Sin(((double) (angle) ));
				double c = global::System.Math.Cos(((double) (angle) ));
				self.a = c;
				self.b =  - (s) ;
				self.c = s;
				self.d = c;
				m.a = self.a;
				m.b = self.b;
				m.c = self.c;
				m.d = self.d;
			}
			
			return m;
		}
		
		
		public static global::hxmath.math.Matrix3x2Default translate(global::hxmath.math.Vector2Default v) {
			global::hxmath.math.Matrix3x2Default m = ((global::hxmath.math.Matrix3x2Default) (new global::hxmath.math.Matrix3x2Default(1.0, 0.0, 0.0, 1.0, 0.0, 0.0)) );
			{
				m.tx = v.x;
				m.ty = v.y;
			}
			
			return m;
		}
		
		
		public static global::hxmath.math.Matrix3x2Default orbit(global::hxmath.math.Vector2Default center, double angle) {
			global::hxmath.math.Matrix3x2Default m = ((global::hxmath.math.Matrix3x2Default) (new global::hxmath.math.Matrix3x2Default(1.0, 0.0, 0.0, 1.0, 0.0, 0.0)) );
			{
				global::hxmath.math.Matrix2x2Default self = ((global::hxmath.math.Matrix2x2Default) (new global::hxmath.math.Matrix2x2Default(0.0, 0.0, 0.0, 0.0)) );
				double s = global::System.Math.Sin(((double) (angle) ));
				double c = global::System.Math.Cos(((double) (angle) ));
				self.a = c;
				self.b =  - (s) ;
				self.c = s;
				self.d = c;
				m.a = self.a;
				m.b = self.b;
				m.c = self.c;
				m.d = self.d;
			}
			
			{
				global::hxmath.math.Matrix2x2Default m1 = ((global::hxmath.math.Matrix2x2Default) (new global::hxmath.math.Matrix2x2Default(m.a, m.b, m.c, m.d)) );
				global::hxmath.math.Vector2Default b = ((global::hxmath.math.Vector2Default) (new global::hxmath.math.Vector2Default(( ( m1.a * center.x ) + ( m1.b * center.y ) ), ( ( m1.c * center.x ) + ( m1.d * center.y ) ))) );
				global::hxmath.math.Vector2Default self1 = ((global::hxmath.math.Vector2Default) (new global::hxmath.math.Vector2Default(center.x, center.y)) );
				self1.x -= b.x;
				self1.y -= b.y;
				m.tx = self1.x;
				m.ty = self1.y;
			}
			
			return m;
		}
		
		
		public static void copyTo(global::hxmath.math.Matrix3x2Default this1, global::hxmath.math.Matrix3x2Default target) {
			unchecked {
				global::hxmath.math.Matrix3x2Default self = this1;
				{
					int _g = 0;
					while (( _g < 6 )) {
						int i = _g++;
						{
							object tmp = null;
							switch (i) {
								case 0:
								{
									tmp = self.a;
									break;
								}
								
								
								case 1:
								{
									tmp = self.b;
									break;
								}
								
								
								case 2:
								{
									tmp = self.tx;
									break;
								}
								
								
								case 3:
								{
									tmp = self.c;
									break;
								}
								
								
								case 4:
								{
									tmp = self.d;
									break;
								}
								
								
								case 5:
								{
									tmp = self.ty;
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
									target.a = @value;
									break;
								}
								
								
								case 1:
								{
									target.b = @value;
									break;
								}
								
								
								case 2:
								{
									target.tx = @value;
									break;
								}
								
								
								case 3:
								{
									target.c = @value;
									break;
								}
								
								
								case 4:
								{
									target.d = @value;
									break;
								}
								
								
								case 5:
								{
									target.ty = @value;
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
		
		
		public static void copyToShape(global::hxmath.math.Matrix3x2Default this1, object target) {
			global::hxmath.math.Matrix3x2Default self = this1;
			global::haxe.lang.Runtime.setField_f(target, "a", 97, self.a);
			global::haxe.lang.Runtime.setField_f(target, "b", 98, self.b);
			global::haxe.lang.Runtime.setField_f(target, "c", 99, self.c);
			global::haxe.lang.Runtime.setField_f(target, "d", 100, self.d);
			global::haxe.lang.Runtime.setField_f(target, "tx", 25988, self.tx);
			global::haxe.lang.Runtime.setField_f(target, "ty", 25989, self.ty);
		}
		
		
		public static void copyFromShape(global::hxmath.math.Matrix3x2Default this1, object source) {
			global::hxmath.math.Matrix3x2Default self = this1;
			self.a = global::haxe.lang.Runtime.getField_f(source, "a", 97, true);
			self.b = global::haxe.lang.Runtime.getField_f(source, "b", 98, true);
			self.c = global::haxe.lang.Runtime.getField_f(source, "c", 99, true);
			self.d = global::haxe.lang.Runtime.getField_f(source, "d", 100, true);
			self.tx = global::haxe.lang.Runtime.getField_f(source, "tx", 25988, true);
			self.ty = global::haxe.lang.Runtime.getField_f(source, "ty", 25989, true);
		}
		
		
		public static global::hxmath.math.Matrix3x2Default setRotate(global::hxmath.math.Matrix3x2Default this1, double angle) {
			global::hxmath.math.Matrix3x2Default self = this1;
			double s = global::System.Math.Sin(((double) (angle) ));
			double c = global::System.Math.Cos(((double) (angle) ));
			self.a = c;
			self.b =  - (s) ;
			self.c = s;
			self.d = c;
			return self;
		}
		
		
		public static global::hxmath.math.Matrix3x2Default setTranslate(global::hxmath.math.Matrix3x2Default this1, double x, double y) {
			global::hxmath.math.Matrix3x2Default self = this1;
			self.tx = x;
			self.ty = y;
			return self;
		}
		
		
		public static global::hxmath.math.Matrix3x2Default @set(global::hxmath.math.Matrix3x2Default this1, double a, double b, double c, double d, double tx, double ty) {
			global::hxmath.math.Matrix3x2Default self = this1;
			self.a = a;
			self.b = b;
			self.c = c;
			self.d = d;
			self.tx = tx;
			self.ty = ty;
			return self;
		}
		
		
		public static global::hxmath.math.Matrix3x2Default addWith(global::hxmath.math.Matrix3x2Default this1, global::hxmath.math.Matrix3x2Default m) {
			global::hxmath.math.Matrix3x2Default self = this1;
			self.a += m.a;
			self.b += m.b;
			self.c += m.c;
			self.d += m.d;
			self.tx += m.tx;
			self.ty += m.ty;
			return self;
		}
		
		
		public static global::hxmath.math.Matrix3x2Default subtractWith(global::hxmath.math.Matrix3x2Default this1, global::hxmath.math.Matrix3x2Default m) {
			global::hxmath.math.Matrix3x2Default self = this1;
			self.a -= m.a;
			self.b -= m.b;
			self.c -= m.c;
			self.d -= m.d;
			self.tx -= m.tx;
			self.ty -= m.ty;
			return self;
		}
		
		
		public static global::hxmath.math.Matrix3x2Default clone(global::hxmath.math.Matrix3x2Default this1) {
			global::hxmath.math.Matrix3x2Default self = this1;
			return ((global::hxmath.math.Matrix3x2Default) (new global::hxmath.math.Matrix3x2Default(self.a, self.b, self.c, self.d, self.tx, self.ty)) );
		}
		
		
		public static double getArrayElement(global::hxmath.math.Matrix3x2Default this1, int i) {
			unchecked {
				global::hxmath.math.Matrix3x2Default self = this1;
				switch (i) {
					case 0:
					{
						return self.a;
					}
					
					
					case 1:
					{
						return self.b;
					}
					
					
					case 2:
					{
						return self.tx;
					}
					
					
					case 3:
					{
						return self.c;
					}
					
					
					case 4:
					{
						return self.d;
					}
					
					
					case 5:
					{
						return self.ty;
					}
					
					
					default:
					{
						throw global::haxe.lang.HaxeException.wrap("Invalid element");
					}
					
				}
				
			}
		}
		
		
		public static double setArrayElement(global::hxmath.math.Matrix3x2Default this1, int i, double @value) {
			unchecked {
				global::hxmath.math.Matrix3x2Default self = this1;
				switch (i) {
					case 0:
					{
						return self.a = @value;
					}
					
					
					case 1:
					{
						return self.b = @value;
					}
					
					
					case 2:
					{
						return self.tx = @value;
					}
					
					
					case 3:
					{
						return self.c = @value;
					}
					
					
					case 4:
					{
						return self.d = @value;
					}
					
					
					case 5:
					{
						return self.ty = @value;
					}
					
					
					default:
					{
						throw global::haxe.lang.HaxeException.wrap("Invalid element");
					}
					
				}
				
			}
		}
		
		
		public static double getElement(global::hxmath.math.Matrix3x2Default this1, int column, int row) {
			unchecked {
				global::hxmath.math.Matrix3x2Default self = this1;
				object tmp = null;
				switch (( ( row * 3 ) + column )) {
					case 0:
					{
						tmp = self.a;
						break;
					}
					
					
					case 1:
					{
						tmp = self.b;
						break;
					}
					
					
					case 2:
					{
						tmp = self.tx;
						break;
					}
					
					
					case 3:
					{
						tmp = self.c;
						break;
					}
					
					
					case 4:
					{
						tmp = self.d;
						break;
					}
					
					
					case 5:
					{
						tmp = self.ty;
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
		
		
		public static double setElement(global::hxmath.math.Matrix3x2Default this1, int column, int row, double @value) {
			unchecked {
				global::hxmath.math.Matrix3x2Default self = this1;
				object tmp = null;
				switch (( ( row * 3 ) + column )) {
					case 0:
					{
						tmp = self.a = @value;
						break;
					}
					
					
					case 1:
					{
						tmp = self.b = @value;
						break;
					}
					
					
					case 2:
					{
						tmp = self.tx = @value;
						break;
					}
					
					
					case 3:
					{
						tmp = self.c = @value;
						break;
					}
					
					
					case 4:
					{
						tmp = self.d = @value;
						break;
					}
					
					
					case 5:
					{
						tmp = self.ty = @value;
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
		
		
		public static global::hxmath.math.Vector2Default col(global::hxmath.math.Matrix3x2Default this1, int index) {
			unchecked {
				global::hxmath.math.Matrix3x2Default self = this1;
				switch (index) {
					case 0:
					{
						return ((global::hxmath.math.Vector2Default) (new global::hxmath.math.Vector2Default(self.a, self.c)) );
					}
					
					
					case 1:
					{
						return ((global::hxmath.math.Vector2Default) (new global::hxmath.math.Vector2Default(self.b, self.d)) );
					}
					
					
					case 2:
					{
						return ((global::hxmath.math.Vector2Default) (new global::hxmath.math.Vector2Default(self.tx, self.ty)) );
					}
					
					
					default:
					{
						throw global::haxe.lang.HaxeException.wrap("Invalid column");
					}
					
				}
				
			}
		}
		
		
		public static global::hxmath.math.Vector3Default row(global::hxmath.math.Matrix3x2Default this1, int index) {
			unchecked {
				global::hxmath.math.Matrix3x2Default self = this1;
				switch (index) {
					case 0:
					{
						return ((global::hxmath.math.Vector3Default) (new global::hxmath.math.Vector3Default(self.a, self.b, self.tx)) );
					}
					
					
					case 1:
					{
						return ((global::hxmath.math.Vector3Default) (new global::hxmath.math.Vector3Default(self.c, self.d, self.ty)) );
					}
					
					
					default:
					{
						throw global::haxe.lang.HaxeException.wrap("Invalid row");
					}
					
				}
				
			}
		}
		
		
		public static global::hxmath.math.Matrix3x2Default applyScalarFunc(global::hxmath.math.Matrix3x2Default this1, global::haxe.lang.Function func) {
			unchecked {
				global::hxmath.math.Matrix3x2Default self = this1;
				{
					int _g = 0;
					while (( _g < 6 )) {
						int i = _g++;
						{
							object tmp = null;
							switch (i) {
								case 0:
								{
									tmp = self.a;
									break;
								}
								
								
								case 1:
								{
									tmp = self.b;
									break;
								}
								
								
								case 2:
								{
									tmp = self.tx;
									break;
								}
								
								
								case 3:
								{
									tmp = self.c;
									break;
								}
								
								
								case 4:
								{
									tmp = self.d;
									break;
								}
								
								
								case 5:
								{
									tmp = self.ty;
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
									self.a = @value;
									break;
								}
								
								
								case 1:
								{
									self.b = @value;
									break;
								}
								
								
								case 2:
								{
									self.tx = @value;
									break;
								}
								
								
								case 3:
								{
									self.c = @value;
									break;
								}
								
								
								case 4:
								{
									self.d = @value;
									break;
								}
								
								
								case 5:
								{
									self.ty = @value;
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
		
		
		public static global::hxmath.math.Matrix3x2Default applySubMatrixTranspose(global::hxmath.math.Matrix3x2Default this1) {
			global::hxmath.math.Matrix3x2Default self = this1;
			double temp = self.c;
			self.c = self.b;
			self.b = temp;
			return self;
		}
		
		
		public static global::hxmath.math.Matrix3x2Default applyInvertFrame(global::hxmath.math.Matrix3x2Default this1) {
			global::hxmath.math.Matrix3x2Default self = this1;
			{
				double temp = self.c;
				self.c = self.b;
				self.b = temp;
			}
			
			double tx =  - ((( ( self.a * self.tx ) + ( self.b * self.ty ) ))) ;
			double ty =  - ((( ( self.c * self.tx ) + ( self.d * self.ty ) ))) ;
			self.tx = tx;
			self.ty = ty;
			return self;
		}
		
		
		public static global::hxmath.math.Matrix3x2Default get_zero() {
			return ((global::hxmath.math.Matrix3x2Default) (new global::hxmath.math.Matrix3x2Default(0.0, 0.0, 0.0, 0.0, 0.0, 0.0)) );
		}
		
		
		public static global::hxmath.math.Matrix3x2Default get_identity() {
			return ((global::hxmath.math.Matrix3x2Default) (new global::hxmath.math.Matrix3x2Default(1.0, 0.0, 0.0, 1.0, 0.0, 0.0)) );
		}
		
		
		public static global::hxmath.math.Vector2Default get_t(global::hxmath.math.Matrix3x2Default this1) {
			global::hxmath.math.Matrix3x2Default self = this1;
			return ((global::hxmath.math.Vector2Default) (new global::hxmath.math.Vector2Default(self.tx, self.ty)) );
		}
		
		
		public static global::hxmath.math.Vector2Default set_t(global::hxmath.math.Matrix3x2Default this1, global::hxmath.math.Vector2Default t) {
			global::hxmath.math.Matrix3x2Default self = this1;
			self.tx = t.x;
			self.ty = t.y;
			return t;
		}
		
		
		public static global::hxmath.math.Matrix2x2Default get_linearSubMatrix(global::hxmath.math.Matrix3x2Default this1) {
			global::hxmath.math.Matrix3x2Default self = this1;
			return ((global::hxmath.math.Matrix2x2Default) (new global::hxmath.math.Matrix2x2Default(self.a, self.b, self.c, self.d)) );
		}
		
		
		public static global::hxmath.math.Matrix2x2Default set_linearSubMatrix(global::hxmath.math.Matrix3x2Default this1, global::hxmath.math.Matrix2x2Default @value) {
			global::hxmath.math.Matrix3x2Default self = this1;
			self.a = @value.a;
			self.b = @value.b;
			self.c = @value.c;
			self.d = @value.d;
			return @value;
		}
		
		
	}
}


