// Generated by Haxe 3.3.0
package hxmath.math._Matrix3x3;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public final class Matrix3x3_Impl_
{
	static
	{
		//line 72 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		hxmath.math._Matrix3x3.Matrix3x3_Impl_.elementCount = 9;
	}
	
	public static int elementCount;
	
	
	
	
	
	
	
	
	
	public static hxmath.math.Matrix3x3Default _new(double m00, double m10, double m20, double m01, double m11, double m21, double m02, double m12, double m22)
	{
		//line 99 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		hxmath.math.Matrix3x3Default this1 = new hxmath.math.Matrix3x3Default(m00, m10, m20, m01, m11, m21, m02, m12, m22);
		//line 99 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		return ((hxmath.math.Matrix3x3Default) (this1) );
	}
	
	
	public static hxmath.math.Matrix3x3Default fromArray(haxe.root.Array<java.lang.Object> rawData)
	{
		//line 118 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		if (( rawData.length != 9 )) 
		{
			//line 120 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
			throw haxe.lang.HaxeException.wrap("Invalid rawData.");
		}
		
		//line 123 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		hxmath.math.Matrix3x3Default this1 = new hxmath.math.Matrix3x3Default(((double) (haxe.lang.Runtime.toDouble(rawData.__get(0))) ), ((double) (haxe.lang.Runtime.toDouble(rawData.__get(1))) ), ((double) (haxe.lang.Runtime.toDouble(rawData.__get(2))) ), ((double) (haxe.lang.Runtime.toDouble(rawData.__get(3))) ), ((double) (haxe.lang.Runtime.toDouble(rawData.__get(4))) ), ((double) (haxe.lang.Runtime.toDouble(rawData.__get(5))) ), ((double) (haxe.lang.Runtime.toDouble(rawData.__get(6))) ), ((double) (haxe.lang.Runtime.toDouble(rawData.__get(7))) ), ((double) (haxe.lang.Runtime.toDouble(rawData.__get(8))) ));
		//line 123 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		return ((hxmath.math.Matrix3x3Default) (this1) );
	}
	
	
	public static hxmath.math.Matrix3x3Default fromMatrix3x3Shape(hxmath.math.Matrix3x3Default other)
	{
		//line 138 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		hxmath.math.Matrix3x3Default this1 = new hxmath.math.Matrix3x3Default(other.m00, other.m10, other.m20, other.m01, other.m11, other.m21, other.m02, other.m12, other.m22);
		//line 138 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		return ((hxmath.math.Matrix3x3Default) (this1) );
	}
	
	
	public static hxmath.math.Matrix3x3Default multiplyScalar(double s, hxmath.math.Matrix3x3Default a)
	{
		//line 154 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		hxmath.math.Matrix3x3Default this1 = new hxmath.math.Matrix3x3Default(( s * a.m00 ), ( s * a.m10 ), ( s * a.m20 ), ( s * a.m01 ), ( s * a.m11 ), ( s * a.m21 ), ( s * a.m02 ), ( s * a.m12 ), ( s * a.m22 ));
		//line 154 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		return ((hxmath.math.Matrix3x3Default) (this1) );
	}
	
	
	public static hxmath.math.Vector3Default multiplyVector(hxmath.math.Matrix3x3Default a, hxmath.math.Vector3Default v)
	{
		//line 170 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		hxmath.math.Vector3Default this1 = new hxmath.math.Vector3Default(( ( ( a.m00 * v.x ) + ( a.m10 * v.y ) ) + ( a.m20 * v.z ) ), ( ( ( a.m01 * v.x ) + ( a.m11 * v.y ) ) + ( a.m21 * v.z ) ), ( ( ( a.m02 * v.x ) + ( a.m12 * v.y ) ) + ( a.m22 * v.z ) ));
		//line 170 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		return ((hxmath.math.Vector3Default) (this1) );
	}
	
	
	public static hxmath.math.Matrix3x3Default multiply(hxmath.math.Matrix3x3Default a, hxmath.math.Matrix3x3Default b)
	{
		//line 186 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		hxmath.math.Matrix3x3Default this1 = new hxmath.math.Matrix3x3Default(( ( ( a.m00 * b.m00 ) + ( a.m10 * b.m01 ) ) + ( a.m20 * b.m02 ) ), ( ( ( a.m00 * b.m10 ) + ( a.m10 * b.m11 ) ) + ( a.m20 * b.m12 ) ), ( ( ( a.m00 * b.m20 ) + ( a.m10 * b.m21 ) ) + ( a.m20 * b.m22 ) ), ( ( ( a.m01 * b.m00 ) + ( a.m11 * b.m01 ) ) + ( a.m21 * b.m02 ) ), ( ( ( a.m01 * b.m10 ) + ( a.m11 * b.m11 ) ) + ( a.m21 * b.m12 ) ), ( ( ( a.m01 * b.m20 ) + ( a.m11 * b.m21 ) ) + ( a.m21 * b.m22 ) ), ( ( ( a.m02 * b.m00 ) + ( a.m12 * b.m01 ) ) + ( a.m22 * b.m02 ) ), ( ( ( a.m02 * b.m10 ) + ( a.m12 * b.m11 ) ) + ( a.m22 * b.m12 ) ), ( ( ( a.m02 * b.m20 ) + ( a.m12 * b.m21 ) ) + ( a.m22 * b.m22 ) ));
		//line 186 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		return ((hxmath.math.Matrix3x3Default) (this1) );
	}
	
	
	public static hxmath.math.Matrix3x3Default add(hxmath.math.Matrix3x3Default a, hxmath.math.Matrix3x3Default b)
	{
		//line 210 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		hxmath.math.Matrix3x3Default this1 = new hxmath.math.Matrix3x3Default(a.m00, a.m10, a.m20, a.m01, a.m11, a.m21, a.m02, a.m12, a.m22);
		//line 210 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		hxmath.math.Matrix3x3Default self = ((hxmath.math.Matrix3x3Default) (this1) );
		//line 210 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m00 += b.m00;
		//line 210 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m10 += b.m10;
		//line 210 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m20 += b.m20;
		//line 210 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m01 += b.m01;
		//line 210 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m11 += b.m11;
		//line 210 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m21 += b.m21;
		//line 210 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m02 += b.m02;
		//line 210 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m12 += b.m12;
		//line 210 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m22 += b.m22;
		//line 210 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		return self;
	}
	
	
	public static hxmath.math.Matrix3x3Default subtract(hxmath.math.Matrix3x3Default a, hxmath.math.Matrix3x3Default b)
	{
		//line 224 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		hxmath.math.Matrix3x3Default this1 = new hxmath.math.Matrix3x3Default(a.m00, a.m10, a.m20, a.m01, a.m11, a.m21, a.m02, a.m12, a.m22);
		//line 224 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		hxmath.math.Matrix3x3Default self = ((hxmath.math.Matrix3x3Default) (this1) );
		//line 224 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m00 -= b.m00;
		//line 224 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m10 -= b.m10;
		//line 224 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m20 -= b.m20;
		//line 224 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m01 -= b.m01;
		//line 224 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m11 -= b.m11;
		//line 224 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m21 -= b.m21;
		//line 224 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m02 -= b.m02;
		//line 224 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m12 -= b.m12;
		//line 224 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m22 -= b.m22;
		//line 224 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		return self;
	}
	
	
	public static hxmath.math.Matrix3x3Default negate(hxmath.math.Matrix3x3Default a)
	{
		//line 237 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		hxmath.math.Matrix3x3Default this1 = new hxmath.math.Matrix3x3Default( - (a.m00) ,  - (a.m10) ,  - (a.m20) ,  - (a.m01) ,  - (a.m11) ,  - (a.m21) ,  - (a.m02) ,  - (a.m12) ,  - (a.m22) );
		//line 237 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		return ((hxmath.math.Matrix3x3Default) (this1) );
	}
	
	
	public static boolean equals(hxmath.math.Matrix3x3Default a, hxmath.math.Matrix3x3Default b)
	{
		//line 254 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		if ( ! ((( ( a == null ) && ( b == null ) ))) ) 
		{
			//line 255 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
			if (( ( ( ( ( ( ( ( ( ( a != null ) && ( b != null ) ) && ( a.m00 == b.m00 ) ) && ( a.m10 == b.m10 ) ) && ( a.m20 == b.m20 ) ) && ( a.m01 == b.m01 ) ) && ( a.m11 == b.m11 ) ) && ( a.m21 == b.m21 ) ) && ( a.m02 == b.m02 ) ) && ( a.m12 == b.m12 ) )) 
			{
				//line 254 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				return ( a.m22 == b.m22 );
			}
			else
			{
				//line 254 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				return false;
			}
			
		}
		else
		{
			//line 254 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
			return true;
		}
		
	}
	
	
	public static hxmath.math.Matrix3x3Default rotationX(double angleDegrees)
	{
		//line 276 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		double angleRadians = ( ( java.lang.Math.PI / 180 ) * angleDegrees );
		//line 277 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		double s = java.lang.Math.sin(angleRadians);
		//line 278 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		double c = java.lang.Math.cos(angleRadians);
		//line 279 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		hxmath.math.Matrix3x3Default this1 = new hxmath.math.Matrix3x3Default(((double) (1) ), ((double) (0) ), ((double) (0) ), ((double) (0) ), c,  - (s) , ((double) (0) ), s, c);
		//line 279 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		return ((hxmath.math.Matrix3x3Default) (this1) );
	}
	
	
	public static hxmath.math.Matrix3x3Default rotationY(double angleDegrees)
	{
		//line 293 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		double angleRadians = ( ( java.lang.Math.PI / 180 ) * angleDegrees );
		//line 294 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		double s = java.lang.Math.sin(angleRadians);
		//line 295 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		double c = java.lang.Math.cos(angleRadians);
		//line 296 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		hxmath.math.Matrix3x3Default this1 = new hxmath.math.Matrix3x3Default(c, ((double) (0) ), s, ((double) (0) ), ((double) (1) ), ((double) (0) ),  - (s) , ((double) (0) ), c);
		//line 296 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		return ((hxmath.math.Matrix3x3Default) (this1) );
	}
	
	
	public static hxmath.math.Matrix3x3Default rotationZ(double angleDegrees)
	{
		//line 310 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		double angleRadians = ( ( java.lang.Math.PI / 180 ) * angleDegrees );
		//line 311 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		double s = java.lang.Math.sin(angleRadians);
		//line 312 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		double c = java.lang.Math.cos(angleRadians);
		//line 313 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		hxmath.math.Matrix3x3Default this1 = new hxmath.math.Matrix3x3Default(c,  - (s) , ((double) (0) ), s, c, ((double) (0) ), ((double) (0) ), ((double) (0) ), ((double) (1) ));
		//line 313 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		return ((hxmath.math.Matrix3x3Default) (this1) );
	}
	
	
	public static hxmath.math.Matrix3x3Default scale(double sx, double sy, double sz)
	{
		//line 329 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		hxmath.math.Matrix3x3Default this1 = new hxmath.math.Matrix3x3Default(sx, 0.0, 0.0, 0.0, sy, 0.0, 0.0, 0.0, sz);
		//line 329 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		return ((hxmath.math.Matrix3x3Default) (this1) );
	}
	
	
	public static hxmath.math.Matrix3x3Default set(hxmath.math.Matrix3x3Default this1, double m00, double m10, double m20, double m01, double m11, double m21, double m02, double m12, double m22)
	{
		//line 354 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		hxmath.math.Matrix3x3Default self = this1;
		//line 356 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m00 = m00;
		//line 357 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m10 = m10;
		//line 358 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m20 = m20;
		//line 360 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m01 = m01;
		//line 361 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m11 = m11;
		//line 362 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m21 = m21;
		//line 364 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m02 = m02;
		//line 365 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m12 = m12;
		//line 366 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m22 = m22;
		//line 368 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		return self;
	}
	
	
	public static hxmath.math.Matrix3x3Default addWith(hxmath.math.Matrix3x3Default this1, hxmath.math.Matrix3x3Default a)
	{
		//line 380 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		hxmath.math.Matrix3x3Default self = this1;
		//line 382 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m00 += a.m00;
		//line 383 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m10 += a.m10;
		//line 384 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m20 += a.m20;
		//line 385 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m01 += a.m01;
		//line 386 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m11 += a.m11;
		//line 387 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m21 += a.m21;
		//line 388 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m02 += a.m02;
		//line 389 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m12 += a.m12;
		//line 390 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m22 += a.m22;
		//line 392 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		return self;
	}
	
	
	public static hxmath.math.Matrix3x3Default subtractWith(hxmath.math.Matrix3x3Default this1, hxmath.math.Matrix3x3Default a)
	{
		//line 404 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		hxmath.math.Matrix3x3Default self = this1;
		//line 406 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m00 -= a.m00;
		//line 407 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m10 -= a.m10;
		//line 408 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m20 -= a.m20;
		//line 409 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m01 -= a.m01;
		//line 410 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m11 -= a.m11;
		//line 411 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m21 -= a.m21;
		//line 412 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m02 -= a.m02;
		//line 413 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m12 -= a.m12;
		//line 414 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m22 -= a.m22;
		//line 416 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		return self;
	}
	
	
	public static void copyTo(hxmath.math.Matrix3x3Default this1, hxmath.math.Matrix3x3Default target)
	{
		//line 427 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		hxmath.math.Matrix3x3Default self = this1;
		//line 429 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		{
			//line 429 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
			int _g = 0;
			//line 429 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
			while (( _g < 9 ))
			{
				//line 429 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				int i = _g++;
				//line 431 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				{
					//line 431 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					java.lang.Object tmp = null;
					//line 431 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					switch (i)
					{
						case 0:
						{
							//line 431 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							tmp = self.m00;
							//line 431 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							break;
						}
						
						
						case 1:
						{
							//line 431 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							tmp = self.m10;
							//line 431 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							break;
						}
						
						
						case 2:
						{
							//line 431 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							tmp = self.m20;
							//line 431 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							break;
						}
						
						
						case 3:
						{
							//line 431 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							tmp = self.m01;
							//line 431 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							break;
						}
						
						
						case 4:
						{
							//line 431 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							tmp = self.m11;
							//line 431 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							break;
						}
						
						
						case 5:
						{
							//line 431 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							tmp = self.m21;
							//line 431 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							break;
						}
						
						
						case 6:
						{
							//line 431 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							tmp = self.m02;
							//line 431 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							break;
						}
						
						
						case 7:
						{
							//line 431 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							tmp = self.m12;
							//line 431 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							break;
						}
						
						
						case 8:
						{
							//line 431 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							tmp = self.m22;
							//line 431 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							break;
						}
						
						
						default:
						{
							//line 431 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							throw haxe.lang.HaxeException.wrap("Invalid element");
						}
						
					}
					
					//line 431 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					double value = ((double) (haxe.lang.Runtime.toDouble(tmp)) );
					//line 431 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					switch (i)
					{
						case 0:
						{
							//line 431 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							target.m00 = value;
							//line 431 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							break;
						}
						
						
						case 1:
						{
							//line 431 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							target.m10 = value;
							//line 431 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							break;
						}
						
						
						case 2:
						{
							//line 431 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							target.m20 = value;
							//line 431 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							break;
						}
						
						
						case 3:
						{
							//line 431 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							target.m01 = value;
							//line 431 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							break;
						}
						
						
						case 4:
						{
							//line 431 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							target.m11 = value;
							//line 431 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							break;
						}
						
						
						case 5:
						{
							//line 431 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							target.m21 = value;
							//line 431 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							break;
						}
						
						
						case 6:
						{
							//line 431 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							target.m02 = value;
							//line 431 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							break;
						}
						
						
						case 7:
						{
							//line 431 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							target.m12 = value;
							//line 431 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							break;
						}
						
						
						case 8:
						{
							//line 431 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							target.m22 = value;
							//line 431 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							break;
						}
						
						
						default:
						{
							//line 431 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							throw haxe.lang.HaxeException.wrap("Invalid element");
						}
						
					}
					
				}
				
			}
			
		}
		
	}
	
	
	public static void copyToShape(hxmath.math.Matrix3x3Default this1, java.lang.Object target)
	{
		//line 442 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		hxmath.math.Matrix3x3Default self = this1;
		//line 444 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		haxe.lang.Runtime.setField_f(target, "m00", self.m00);
		//line 445 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		haxe.lang.Runtime.setField_f(target, "m01", self.m01);
		//line 446 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		haxe.lang.Runtime.setField_f(target, "m02", self.m02);
		//line 448 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		haxe.lang.Runtime.setField_f(target, "m10", self.m10);
		//line 449 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		haxe.lang.Runtime.setField_f(target, "m11", self.m11);
		//line 450 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		haxe.lang.Runtime.setField_f(target, "m12", self.m12);
		//line 452 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		haxe.lang.Runtime.setField_f(target, "m20", self.m20);
		//line 453 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		haxe.lang.Runtime.setField_f(target, "m21", self.m21);
		//line 454 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		haxe.lang.Runtime.setField_f(target, "m22", self.m22);
	}
	
	
	public static void copyFromShape(hxmath.math.Matrix3x3Default this1, java.lang.Object source)
	{
		//line 464 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		hxmath.math.Matrix3x3Default self = this1;
		//line 466 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m00 = haxe.lang.Runtime.getField_f(source, "m00", true);
		//line 467 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m01 = haxe.lang.Runtime.getField_f(source, "m01", true);
		//line 468 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m02 = haxe.lang.Runtime.getField_f(source, "m02", true);
		//line 470 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m10 = haxe.lang.Runtime.getField_f(source, "m10", true);
		//line 471 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m11 = haxe.lang.Runtime.getField_f(source, "m11", true);
		//line 472 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m12 = haxe.lang.Runtime.getField_f(source, "m12", true);
		//line 474 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m20 = haxe.lang.Runtime.getField_f(source, "m20", true);
		//line 475 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m21 = haxe.lang.Runtime.getField_f(source, "m21", true);
		//line 476 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		self.m22 = haxe.lang.Runtime.getField_f(source, "m22", true);
	}
	
	
	public static hxmath.math.Matrix3x3Default clone(hxmath.math.Matrix3x3Default this1)
	{
		//line 486 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		hxmath.math.Matrix3x3Default self = this1;
		//line 487 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		hxmath.math.Matrix3x3Default this2 = new hxmath.math.Matrix3x3Default(self.m00, self.m10, self.m20, self.m01, self.m11, self.m21, self.m02, self.m12, self.m22);
		//line 487 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		return ((hxmath.math.Matrix3x3Default) (this2) );
	}
	
	
	public static double getArrayElement(hxmath.math.Matrix3x3Default this1, int i)
	{
		//line 503 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		hxmath.math.Matrix3x3Default self = this1;
		//line 505 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		switch (i)
		{
			case 0:
			{
				//line 508 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				return self.m00;
			}
			
			
			case 1:
			{
				//line 510 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				return self.m10;
			}
			
			
			case 2:
			{
				//line 512 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				return self.m20;
			}
			
			
			case 3:
			{
				//line 514 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				return self.m01;
			}
			
			
			case 4:
			{
				//line 516 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				return self.m11;
			}
			
			
			case 5:
			{
				//line 518 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				return self.m21;
			}
			
			
			case 6:
			{
				//line 520 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				return self.m02;
			}
			
			
			case 7:
			{
				//line 522 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				return self.m12;
			}
			
			
			case 8:
			{
				//line 524 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				return self.m22;
			}
			
			
			default:
			{
				//line 526 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				throw haxe.lang.HaxeException.wrap("Invalid element");
			}
			
		}
		
	}
	
	
	public static double setArrayElement(hxmath.math.Matrix3x3Default this1, int i, double value)
	{
		//line 541 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		hxmath.math.Matrix3x3Default self = this1;
		//line 543 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		switch (i)
		{
			case 0:
			{
				//line 546 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				return self.m00 = value;
			}
			
			
			case 1:
			{
				//line 548 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				return self.m10 = value;
			}
			
			
			case 2:
			{
				//line 550 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				return self.m20 = value;
			}
			
			
			case 3:
			{
				//line 552 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				return self.m01 = value;
			}
			
			
			case 4:
			{
				//line 554 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				return self.m11 = value;
			}
			
			
			case 5:
			{
				//line 556 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				return self.m21 = value;
			}
			
			
			case 6:
			{
				//line 558 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				return self.m02 = value;
			}
			
			
			case 7:
			{
				//line 560 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				return self.m12 = value;
			}
			
			
			case 8:
			{
				//line 562 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				return self.m22 = value;
			}
			
			
			default:
			{
				//line 564 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				throw haxe.lang.HaxeException.wrap("Invalid element");
			}
			
		}
		
	}
	
	
	public static double getElement(hxmath.math.Matrix3x3Default this1, int column, int row)
	{
		//line 578 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		hxmath.math.Matrix3x3Default self = this1;
		//line 579 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		java.lang.Object tmp = null;
		//line 579 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		switch (( ( row * 3 ) + column ))
		{
			case 0:
			{
				//line 579 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				tmp = self.m00;
				//line 579 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				break;
			}
			
			
			case 1:
			{
				//line 579 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				tmp = self.m10;
				//line 579 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				break;
			}
			
			
			case 2:
			{
				//line 579 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				tmp = self.m20;
				//line 579 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				break;
			}
			
			
			case 3:
			{
				//line 579 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				tmp = self.m01;
				//line 579 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				break;
			}
			
			
			case 4:
			{
				//line 579 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				tmp = self.m11;
				//line 579 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				break;
			}
			
			
			case 5:
			{
				//line 579 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				tmp = self.m21;
				//line 579 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				break;
			}
			
			
			case 6:
			{
				//line 579 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				tmp = self.m02;
				//line 579 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				break;
			}
			
			
			case 7:
			{
				//line 579 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				tmp = self.m12;
				//line 579 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				break;
			}
			
			
			case 8:
			{
				//line 579 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				tmp = self.m22;
				//line 579 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				break;
			}
			
			
			default:
			{
				//line 579 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				throw haxe.lang.HaxeException.wrap("Invalid element");
			}
			
		}
		
		//line 579 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		return ((double) (haxe.lang.Runtime.toDouble(tmp)) );
	}
	
	
	public static double setElement(hxmath.math.Matrix3x3Default this1, int column, int row, double value)
	{
		//line 593 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		hxmath.math.Matrix3x3Default self = this1;
		//line 594 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		java.lang.Object tmp = null;
		//line 594 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		switch (( ( row * 3 ) + column ))
		{
			case 0:
			{
				//line 594 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				tmp = self.m00 = value;
				//line 594 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				break;
			}
			
			
			case 1:
			{
				//line 594 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				tmp = self.m10 = value;
				//line 594 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				break;
			}
			
			
			case 2:
			{
				//line 594 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				tmp = self.m20 = value;
				//line 594 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				break;
			}
			
			
			case 3:
			{
				//line 594 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				tmp = self.m01 = value;
				//line 594 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				break;
			}
			
			
			case 4:
			{
				//line 594 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				tmp = self.m11 = value;
				//line 594 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				break;
			}
			
			
			case 5:
			{
				//line 594 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				tmp = self.m21 = value;
				//line 594 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				break;
			}
			
			
			case 6:
			{
				//line 594 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				tmp = self.m02 = value;
				//line 594 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				break;
			}
			
			
			case 7:
			{
				//line 594 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				tmp = self.m12 = value;
				//line 594 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				break;
			}
			
			
			case 8:
			{
				//line 594 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				tmp = self.m22 = value;
				//line 594 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				break;
			}
			
			
			default:
			{
				//line 594 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				throw haxe.lang.HaxeException.wrap("Invalid element");
			}
			
		}
		
		//line 594 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		return ((double) (haxe.lang.Runtime.toDouble(tmp)) );
	}
	
	
	public static hxmath.math.Vector3Default col(hxmath.math.Matrix3x3Default this1, int index)
	{
		//line 605 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		hxmath.math.Matrix3x3Default self = this1;
		//line 607 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		switch (index)
		{
			case 0:
			{
				//line 610 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				hxmath.math.Vector3Default this2 = new hxmath.math.Vector3Default(self.m00, self.m01, self.m02);
				//line 610 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				return ((hxmath.math.Vector3Default) (this2) );
			}
			
			
			case 1:
			{
				//line 612 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				hxmath.math.Vector3Default this3 = new hxmath.math.Vector3Default(self.m10, self.m11, self.m12);
				//line 612 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				return ((hxmath.math.Vector3Default) (this3) );
			}
			
			
			case 2:
			{
				//line 614 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				hxmath.math.Vector3Default this4 = new hxmath.math.Vector3Default(self.m20, self.m21, self.m22);
				//line 614 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				return ((hxmath.math.Vector3Default) (this4) );
			}
			
			
			default:
			{
				//line 616 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				throw haxe.lang.HaxeException.wrap("Invalid column");
			}
			
		}
		
	}
	
	
	public static hxmath.math.Vector3Default row(hxmath.math.Matrix3x3Default this1, int index)
	{
		//line 628 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		hxmath.math.Matrix3x3Default self = this1;
		//line 630 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		switch (index)
		{
			case 0:
			{
				//line 633 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				hxmath.math.Vector3Default this2 = new hxmath.math.Vector3Default(self.m00, self.m10, self.m20);
				//line 633 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				return ((hxmath.math.Vector3Default) (this2) );
			}
			
			
			case 1:
			{
				//line 635 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				hxmath.math.Vector3Default this3 = new hxmath.math.Vector3Default(self.m01, self.m11, self.m21);
				//line 635 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				return ((hxmath.math.Vector3Default) (this3) );
			}
			
			
			case 2:
			{
				//line 637 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				hxmath.math.Vector3Default this4 = new hxmath.math.Vector3Default(self.m02, self.m12, self.m22);
				//line 637 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				return ((hxmath.math.Vector3Default) (this4) );
			}
			
			
			default:
			{
				//line 639 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				throw haxe.lang.HaxeException.wrap("Invalid row");
			}
			
		}
		
	}
	
	
	public static hxmath.math.Matrix3x3Default applyScalarFunc(hxmath.math.Matrix3x3Default this1, haxe.lang.Function func)
	{
		//line 651 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		hxmath.math.Matrix3x3Default self = this1;
		//line 653 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		{
			//line 653 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
			int _g = 0;
			//line 653 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
			while (( _g < 9 ))
			{
				//line 653 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				int i = _g++;
				//line 655 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				{
					//line 655 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					java.lang.Object tmp = null;
					//line 655 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					switch (i)
					{
						case 0:
						{
							//line 655 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							tmp = self.m00;
							//line 655 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							break;
						}
						
						
						case 1:
						{
							//line 655 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							tmp = self.m10;
							//line 655 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							break;
						}
						
						
						case 2:
						{
							//line 655 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							tmp = self.m20;
							//line 655 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							break;
						}
						
						
						case 3:
						{
							//line 655 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							tmp = self.m01;
							//line 655 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							break;
						}
						
						
						case 4:
						{
							//line 655 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							tmp = self.m11;
							//line 655 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							break;
						}
						
						
						case 5:
						{
							//line 655 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							tmp = self.m21;
							//line 655 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							break;
						}
						
						
						case 6:
						{
							//line 655 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							tmp = self.m02;
							//line 655 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							break;
						}
						
						
						case 7:
						{
							//line 655 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							tmp = self.m12;
							//line 655 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							break;
						}
						
						
						case 8:
						{
							//line 655 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							tmp = self.m22;
							//line 655 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							break;
						}
						
						
						default:
						{
							//line 655 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							throw haxe.lang.HaxeException.wrap("Invalid element");
						}
						
					}
					
					//line 655 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					double value = ((double) (func.__hx_invoke1_f(((double) (haxe.lang.Runtime.toDouble(tmp)) ), haxe.lang.Runtime.undefined)) );
					//line 655 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					switch (i)
					{
						case 0:
						{
							//line 655 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							self.m00 = value;
							//line 655 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							break;
						}
						
						
						case 1:
						{
							//line 655 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							self.m10 = value;
							//line 655 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							break;
						}
						
						
						case 2:
						{
							//line 655 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							self.m20 = value;
							//line 655 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							break;
						}
						
						
						case 3:
						{
							//line 655 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							self.m01 = value;
							//line 655 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							break;
						}
						
						
						case 4:
						{
							//line 655 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							self.m11 = value;
							//line 655 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							break;
						}
						
						
						case 5:
						{
							//line 655 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							self.m21 = value;
							//line 655 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							break;
						}
						
						
						case 6:
						{
							//line 655 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							self.m02 = value;
							//line 655 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							break;
						}
						
						
						case 7:
						{
							//line 655 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							self.m12 = value;
							//line 655 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							break;
						}
						
						
						case 8:
						{
							//line 655 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							self.m22 = value;
							//line 655 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							break;
						}
						
						
						default:
						{
							//line 655 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
							throw haxe.lang.HaxeException.wrap("Invalid element");
						}
						
					}
					
				}
				
			}
			
		}
		
		//line 658 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		return self;
	}
	
	
	public static hxmath.math.Matrix3x3Default get_zero()
	{
		//line 663 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		hxmath.math.Matrix3x3Default this1 = new hxmath.math.Matrix3x3Default(0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
		//line 663 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		return ((hxmath.math.Matrix3x3Default) (this1) );
	}
	
	
	public static hxmath.math.Matrix3x3Default get_identity()
	{
		//line 671 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		hxmath.math.Matrix3x3Default this1 = new hxmath.math.Matrix3x3Default(1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0);
		//line 671 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		return ((hxmath.math.Matrix3x3Default) (this1) );
	}
	
	
	public static double get_det(hxmath.math.Matrix3x3Default this1)
	{
		//line 679 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		hxmath.math.Matrix3x3Default self = this1;
		//line 680 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		double m00 = self.m00;
		//line 680 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		double m10 = self.m10;
		//line 680 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		double m20 = self.m20;
		//line 680 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		double m01 = self.m01;
		//line 680 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		double m11 = self.m11;
		//line 680 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		double m21 = self.m21;
		//line 680 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		double m02 = self.m02;
		//line 680 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		double m12 = self.m12;
		//line 680 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		double m22 = self.m22;
		//line 680 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		return ( ( ( m00 * (( ( m11 * m22 ) - ( m21 * m12 ) )) ) - ( m10 * (( ( m01 * m22 ) - ( m21 * m02 ) )) ) ) + ( m20 * (( ( m01 * m12 ) - ( m11 * m02 ) )) ) );
	}
	
	
	public static hxmath.math.Matrix3x3Default get_transpose(hxmath.math.Matrix3x3Default this1)
	{
		//line 688 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		hxmath.math.Matrix3x3Default self = this1;
		//line 689 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		hxmath.math.Matrix3x3Default this2 = new hxmath.math.Matrix3x3Default(self.m00, self.m01, self.m02, self.m10, self.m11, self.m12, self.m20, self.m21, self.m22);
		//line 689 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		return ((hxmath.math.Matrix3x3Default) (this2) );
	}
	
	
}


