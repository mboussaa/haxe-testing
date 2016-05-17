// Generated by Haxe 3.3.0
package hxmath.math._Matrix2x2;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public final class Matrix2x2_Impl_
{
	static
	{
		//line 54 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		hxmath.math._Matrix2x2.Matrix2x2_Impl_.elementCount = 4;
	}
	
	public static int elementCount;
	
	
	
	
	
	
	
	
	
	public static hxmath.math.Matrix2x2Default _new(double a, double b, double c, double d)
	{
		//line 79 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		hxmath.math.Matrix2x2Default this1 = new hxmath.math.Matrix2x2Default(a, b, c, d);
		//line 79 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		return ((hxmath.math.Matrix2x2Default) (this1) );
	}
	
	
	public static hxmath.math.Matrix2x2Default fromArray(haxe.root.Array<java.lang.Object> rawData)
	{
		//line 91 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		if (( rawData.length != 4 )) 
		{
			//line 93 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
			throw haxe.lang.HaxeException.wrap("Invalid rawData.");
		}
		
		//line 96 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		hxmath.math.Matrix2x2Default this1 = new hxmath.math.Matrix2x2Default(((double) (haxe.lang.Runtime.toDouble(rawData.__get(0))) ), ((double) (haxe.lang.Runtime.toDouble(rawData.__get(1))) ), ((double) (haxe.lang.Runtime.toDouble(rawData.__get(2))) ), ((double) (haxe.lang.Runtime.toDouble(rawData.__get(3))) ));
		//line 96 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		return ((hxmath.math.Matrix2x2Default) (this1) );
	}
	
	
	public static hxmath.math.Matrix2x2Default fromMatrix2x2Shape(hxmath.math.Matrix2x2Default other)
	{
		//line 108 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		hxmath.math.Matrix2x2Default this1 = new hxmath.math.Matrix2x2Default(other.a, other.b, other.c, other.d);
		//line 108 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		return ((hxmath.math.Matrix2x2Default) (this1) );
	}
	
	
	public static hxmath.math.Matrix2x2Default multiplyScalar(double s, hxmath.math.Matrix2x2Default m)
	{
		//line 121 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		hxmath.math.Matrix2x2Default this1 = new hxmath.math.Matrix2x2Default(( s * m.a ), ( s * m.b ), ( s * m.c ), ( s * m.d ));
		//line 121 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		return ((hxmath.math.Matrix2x2Default) (this1) );
	}
	
	
	public static hxmath.math.Vector2Default multiplyVector(hxmath.math.Matrix2x2Default m, hxmath.math.Vector2Default v)
	{
		//line 136 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		hxmath.math.Vector2Default this1 = new hxmath.math.Vector2Default(( ( m.a * v.x ) + ( m.b * v.y ) ), ( ( m.c * v.x ) + ( m.d * v.y ) ));
		//line 136 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		return ((hxmath.math.Vector2Default) (this1) );
	}
	
	
	public static hxmath.math.Matrix2x2Default multiply(hxmath.math.Matrix2x2Default m, hxmath.math.Matrix2x2Default n)
	{
		//line 151 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		hxmath.math.Matrix2x2Default this1 = new hxmath.math.Matrix2x2Default(( ( m.a * n.a ) + ( m.b * n.c ) ), ( ( m.a * n.b ) + ( m.b * n.d ) ), ( ( m.c * n.a ) + ( m.d * n.c ) ), ( ( m.c * n.b ) + ( m.d * n.d ) ));
		//line 151 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		return ((hxmath.math.Matrix2x2Default) (this1) );
	}
	
	
	public static hxmath.math.Matrix2x2Default add(hxmath.math.Matrix2x2Default m, hxmath.math.Matrix2x2Default n)
	{
		//line 168 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		hxmath.math.Matrix2x2Default this1 = new hxmath.math.Matrix2x2Default(m.a, m.b, m.c, m.d);
		//line 168 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		hxmath.math.Matrix2x2Default self = ((hxmath.math.Matrix2x2Default) (this1) );
		//line 168 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		self.a += n.a;
		//line 168 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		self.b += n.b;
		//line 168 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		self.c += n.c;
		//line 168 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		self.d += n.d;
		//line 168 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		return self;
	}
	
	
	public static hxmath.math.Matrix2x2Default subtract(hxmath.math.Matrix2x2Default m, hxmath.math.Matrix2x2Default n)
	{
		//line 182 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		hxmath.math.Matrix2x2Default this1 = new hxmath.math.Matrix2x2Default(m.a, m.b, m.c, m.d);
		//line 182 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		hxmath.math.Matrix2x2Default self = ((hxmath.math.Matrix2x2Default) (this1) );
		//line 182 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		self.a -= n.a;
		//line 182 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		self.b -= n.b;
		//line 182 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		self.c -= n.c;
		//line 182 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		self.d -= n.d;
		//line 182 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		return self;
	}
	
	
	public static hxmath.math.Matrix2x2Default negate(hxmath.math.Matrix2x2Default m)
	{
		//line 195 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		hxmath.math.Matrix2x2Default this1 = new hxmath.math.Matrix2x2Default( - (m.a) ,  - (m.b) ,  - (m.c) ,  - (m.d) );
		//line 195 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		return ((hxmath.math.Matrix2x2Default) (this1) );
	}
	
	
	public static boolean equals(hxmath.math.Matrix2x2Default m, hxmath.math.Matrix2x2Default n)
	{
		//line 211 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		if ( ! ((( ( m == null ) && ( n == null ) ))) ) 
		{
			//line 212 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
			if (( ( ( ( ( m != null ) && ( n != null ) ) && ( m.a == n.a ) ) && ( m.b == n.b ) ) && ( m.c == n.c ) )) 
			{
				//line 211 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
				return ( m.d == n.d );
			}
			else
			{
				//line 211 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
				return false;
			}
			
		}
		else
		{
			//line 211 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
			return true;
		}
		
	}
	
	
	public static hxmath.math.Matrix2x2Default rotate(double angle)
	{
		//line 229 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		hxmath.math.Matrix2x2Default this1 = new hxmath.math.Matrix2x2Default(0.0, 0.0, 0.0, 0.0);
		//line 229 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		hxmath.math.Matrix2x2Default self = ((hxmath.math.Matrix2x2Default) (this1) );
		//line 229 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		double s = java.lang.Math.sin(angle);
		//line 229 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		double c = java.lang.Math.cos(angle);
		//line 229 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		self.a = c;
		//line 229 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		self.b =  - (s) ;
		//line 229 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		self.c = s;
		//line 229 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		self.d = c;
		//line 229 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		return self;
	}
	
	
	public static hxmath.math.Matrix2x2Default scale(double sx, double sy)
	{
		//line 242 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		hxmath.math.Matrix2x2Default this1 = new hxmath.math.Matrix2x2Default(sx, 0.0, 0.0, sy);
		//line 242 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		return ((hxmath.math.Matrix2x2Default) (this1) );
	}
	
	
	public static hxmath.math.Matrix2x2Default setRotate(hxmath.math.Matrix2x2Default this1, double angle)
	{
		//line 255 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		hxmath.math.Matrix2x2Default self = this1;
		//line 257 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		double s = java.lang.Math.sin(angle);
		//line 258 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		double c = java.lang.Math.cos(angle);
		//line 260 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		self.a = c;
		//line 261 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		self.b =  - (s) ;
		//line 262 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		self.c = s;
		//line 263 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		self.d = c;
		//line 265 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		return self;
	}
	
	
	public static hxmath.math.Matrix2x2Default set(hxmath.math.Matrix2x2Default this1, double a, double b, double c, double d)
	{
		//line 279 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		hxmath.math.Matrix2x2Default self = this1;
		//line 281 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		self.a = a;
		//line 282 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		self.b = b;
		//line 283 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		self.c = c;
		//line 284 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		self.d = d;
		//line 286 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		return this1;
	}
	
	
	public static hxmath.math.Matrix2x2Default addWith(hxmath.math.Matrix2x2Default this1, hxmath.math.Matrix2x2Default m)
	{
		//line 298 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		hxmath.math.Matrix2x2Default self = this1;
		//line 300 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		self.a += m.a;
		//line 301 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		self.b += m.b;
		//line 302 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		self.c += m.c;
		//line 303 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		self.d += m.d;
		//line 305 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		return self;
	}
	
	
	public static hxmath.math.Matrix2x2Default subtractWith(hxmath.math.Matrix2x2Default this1, hxmath.math.Matrix2x2Default m)
	{
		//line 317 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		hxmath.math.Matrix2x2Default self = this1;
		//line 319 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		self.a -= m.a;
		//line 320 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		self.b -= m.b;
		//line 321 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		self.c -= m.c;
		//line 322 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		self.d -= m.d;
		//line 324 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		return self;
	}
	
	
	public static void copyTo(hxmath.math.Matrix2x2Default this1, hxmath.math.Matrix2x2Default target)
	{
		//line 335 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		hxmath.math.Matrix2x2Default self = this1;
		//line 337 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		{
			//line 337 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
			int _g = 0;
			//line 337 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
			while (( _g < 4 ))
			{
				//line 337 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
				int i = _g++;
				//line 339 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
				{
					//line 339 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
					java.lang.Object tmp = null;
					//line 339 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
					switch (i)
					{
						case 0:
						{
							//line 339 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
							tmp = self.a;
							//line 339 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
							break;
						}
						
						
						case 1:
						{
							//line 339 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
							tmp = self.b;
							//line 339 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
							break;
						}
						
						
						case 2:
						{
							//line 339 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
							tmp = self.c;
							//line 339 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
							break;
						}
						
						
						case 3:
						{
							//line 339 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
							tmp = self.d;
							//line 339 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
							break;
						}
						
						
						default:
						{
							//line 339 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
							throw haxe.lang.HaxeException.wrap("Invalid element");
						}
						
					}
					
					//line 339 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
					double value = ((double) (haxe.lang.Runtime.toDouble(tmp)) );
					//line 339 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
					switch (i)
					{
						case 0:
						{
							//line 339 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
							target.a = value;
							//line 339 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
							break;
						}
						
						
						case 1:
						{
							//line 339 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
							target.b = value;
							//line 339 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
							break;
						}
						
						
						case 2:
						{
							//line 339 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
							target.c = value;
							//line 339 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
							break;
						}
						
						
						case 3:
						{
							//line 339 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
							target.d = value;
							//line 339 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
							break;
						}
						
						
						default:
						{
							//line 339 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
							throw haxe.lang.HaxeException.wrap("Invalid element");
						}
						
					}
					
				}
				
			}
			
		}
		
	}
	
	
	public static void copyToShape(hxmath.math.Matrix2x2Default this1, java.lang.Object target)
	{
		//line 350 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		hxmath.math.Matrix2x2Default self = this1;
		//line 352 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		haxe.lang.Runtime.setField_f(target, "a", self.a);
		//line 353 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		haxe.lang.Runtime.setField_f(target, "b", self.b);
		//line 354 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		haxe.lang.Runtime.setField_f(target, "c", self.c);
		//line 355 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		haxe.lang.Runtime.setField_f(target, "d", self.d);
	}
	
	
	public static void copyFromShape(hxmath.math.Matrix2x2Default this1, java.lang.Object source)
	{
		//line 365 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		hxmath.math.Matrix2x2Default self = this1;
		//line 367 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		self.a = haxe.lang.Runtime.getField_f(source, "a", true);
		//line 368 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		self.b = haxe.lang.Runtime.getField_f(source, "b", true);
		//line 369 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		self.c = haxe.lang.Runtime.getField_f(source, "c", true);
		//line 370 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		self.d = haxe.lang.Runtime.getField_f(source, "d", true);
	}
	
	
	public static hxmath.math.Matrix2x2Default clone(hxmath.math.Matrix2x2Default this1)
	{
		//line 380 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		hxmath.math.Matrix2x2Default self = this1;
		//line 381 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		hxmath.math.Matrix2x2Default this2 = new hxmath.math.Matrix2x2Default(self.a, self.b, self.c, self.d);
		//line 381 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		return ((hxmath.math.Matrix2x2Default) (this2) );
	}
	
	
	public static double getArrayElement(hxmath.math.Matrix2x2Default this1, int i)
	{
		//line 397 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		hxmath.math.Matrix2x2Default self = this1;
		//line 399 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		switch (i)
		{
			case 0:
			{
				//line 402 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
				return self.a;
			}
			
			
			case 1:
			{
				//line 404 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
				return self.b;
			}
			
			
			case 2:
			{
				//line 406 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
				return self.c;
			}
			
			
			case 3:
			{
				//line 408 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
				return self.d;
			}
			
			
			default:
			{
				//line 410 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
				throw haxe.lang.HaxeException.wrap("Invalid element");
			}
			
		}
		
	}
	
	
	public static double setArrayElement(hxmath.math.Matrix2x2Default this1, int i, double value)
	{
		//line 425 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		hxmath.math.Matrix2x2Default self = this1;
		//line 427 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		switch (i)
		{
			case 0:
			{
				//line 430 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
				return self.a = value;
			}
			
			
			case 1:
			{
				//line 432 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
				return self.b = value;
			}
			
			
			case 2:
			{
				//line 434 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
				return self.c = value;
			}
			
			
			case 3:
			{
				//line 436 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
				return self.d = value;
			}
			
			
			default:
			{
				//line 438 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
				throw haxe.lang.HaxeException.wrap("Invalid element");
			}
			
		}
		
	}
	
	
	public static double getElement(hxmath.math.Matrix2x2Default this1, int column, int row)
	{
		//line 452 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		hxmath.math.Matrix2x2Default self = this1;
		//line 453 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		java.lang.Object tmp = null;
		//line 453 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		switch (( ( row * 2 ) + column ))
		{
			case 0:
			{
				//line 453 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
				tmp = self.a;
				//line 453 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
				break;
			}
			
			
			case 1:
			{
				//line 453 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
				tmp = self.b;
				//line 453 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
				break;
			}
			
			
			case 2:
			{
				//line 453 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
				tmp = self.c;
				//line 453 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
				break;
			}
			
			
			case 3:
			{
				//line 453 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
				tmp = self.d;
				//line 453 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
				break;
			}
			
			
			default:
			{
				//line 453 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
				throw haxe.lang.HaxeException.wrap("Invalid element");
			}
			
		}
		
		//line 453 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		return ((double) (haxe.lang.Runtime.toDouble(tmp)) );
	}
	
	
	public static double setElement(hxmath.math.Matrix2x2Default this1, int column, int row, double value)
	{
		//line 467 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		hxmath.math.Matrix2x2Default self = this1;
		//line 468 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		java.lang.Object tmp = null;
		//line 468 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		switch (( ( row * 2 ) + column ))
		{
			case 0:
			{
				//line 468 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
				tmp = self.a = value;
				//line 468 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
				break;
			}
			
			
			case 1:
			{
				//line 468 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
				tmp = self.b = value;
				//line 468 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
				break;
			}
			
			
			case 2:
			{
				//line 468 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
				tmp = self.c = value;
				//line 468 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
				break;
			}
			
			
			case 3:
			{
				//line 468 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
				tmp = self.d = value;
				//line 468 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
				break;
			}
			
			
			default:
			{
				//line 468 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
				throw haxe.lang.HaxeException.wrap("Invalid element");
			}
			
		}
		
		//line 468 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		return ((double) (haxe.lang.Runtime.toDouble(tmp)) );
	}
	
	
	public static hxmath.math.Vector2Default col(hxmath.math.Matrix2x2Default this1, int index)
	{
		//line 479 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		hxmath.math.Matrix2x2Default self = this1;
		//line 481 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		switch (index)
		{
			case 0:
			{
				//line 484 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
				hxmath.math.Vector2Default this2 = new hxmath.math.Vector2Default(self.a, self.c);
				//line 484 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
				return ((hxmath.math.Vector2Default) (this2) );
			}
			
			
			case 1:
			{
				//line 486 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
				hxmath.math.Vector2Default this3 = new hxmath.math.Vector2Default(self.b, self.d);
				//line 486 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
				return ((hxmath.math.Vector2Default) (this3) );
			}
			
			
			default:
			{
				//line 488 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
				throw haxe.lang.HaxeException.wrap("Invalid column");
			}
			
		}
		
	}
	
	
	public static hxmath.math.Vector2Default row(hxmath.math.Matrix2x2Default this1, int index)
	{
		//line 500 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		hxmath.math.Matrix2x2Default self = this1;
		//line 502 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		switch (index)
		{
			case 0:
			{
				//line 505 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
				hxmath.math.Vector2Default this2 = new hxmath.math.Vector2Default(self.a, self.b);
				//line 505 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
				return ((hxmath.math.Vector2Default) (this2) );
			}
			
			
			case 1:
			{
				//line 507 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
				hxmath.math.Vector2Default this3 = new hxmath.math.Vector2Default(self.c, self.d);
				//line 507 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
				return ((hxmath.math.Vector2Default) (this3) );
			}
			
			
			default:
			{
				//line 509 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
				throw haxe.lang.HaxeException.wrap("Invalid row");
			}
			
		}
		
	}
	
	
	public static hxmath.math.Vector2Default transposeMultiplyVector(hxmath.math.Matrix2x2Default this1, hxmath.math.Vector2Default v)
	{
		//line 521 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		hxmath.math.Matrix2x2Default self = this1;
		//line 523 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		hxmath.math.Vector2Default this2 = new hxmath.math.Vector2Default(( ( self.a * v.x ) + ( self.c * v.y ) ), ( ( self.b * v.x ) + ( self.d * v.y ) ));
		//line 523 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		return ((hxmath.math.Vector2Default) (this2) );
	}
	
	
	public static hxmath.math.Matrix2x2Default applyScalarFunc(hxmath.math.Matrix2x2Default this1, haxe.lang.Function func)
	{
		//line 536 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		hxmath.math.Matrix2x2Default self = this1;
		//line 538 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		{
			//line 538 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
			int _g = 0;
			//line 538 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
			while (( _g < 4 ))
			{
				//line 538 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
				int i = _g++;
				//line 540 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
				{
					//line 540 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
					java.lang.Object tmp = null;
					//line 540 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
					switch (i)
					{
						case 0:
						{
							//line 540 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
							tmp = self.a;
							//line 540 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
							break;
						}
						
						
						case 1:
						{
							//line 540 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
							tmp = self.b;
							//line 540 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
							break;
						}
						
						
						case 2:
						{
							//line 540 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
							tmp = self.c;
							//line 540 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
							break;
						}
						
						
						case 3:
						{
							//line 540 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
							tmp = self.d;
							//line 540 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
							break;
						}
						
						
						default:
						{
							//line 540 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
							throw haxe.lang.HaxeException.wrap("Invalid element");
						}
						
					}
					
					//line 540 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
					double value = ((double) (func.__hx_invoke1_f(((double) (haxe.lang.Runtime.toDouble(tmp)) ), haxe.lang.Runtime.undefined)) );
					//line 540 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
					switch (i)
					{
						case 0:
						{
							//line 540 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
							self.a = value;
							//line 540 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
							break;
						}
						
						
						case 1:
						{
							//line 540 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
							self.b = value;
							//line 540 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
							break;
						}
						
						
						case 2:
						{
							//line 540 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
							self.c = value;
							//line 540 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
							break;
						}
						
						
						case 3:
						{
							//line 540 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
							self.d = value;
							//line 540 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
							break;
						}
						
						
						default:
						{
							//line 540 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
							throw haxe.lang.HaxeException.wrap("Invalid element");
						}
						
					}
					
				}
				
			}
			
		}
		
		//line 543 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		return self;
	}
	
	
	public static hxmath.math.Matrix2x2Default get_zero()
	{
		//line 548 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		hxmath.math.Matrix2x2Default this1 = new hxmath.math.Matrix2x2Default(0.0, 0.0, 0.0, 0.0);
		//line 548 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		return ((hxmath.math.Matrix2x2Default) (this1) );
	}
	
	
	public static hxmath.math.Matrix2x2Default get_identity()
	{
		//line 555 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		hxmath.math.Matrix2x2Default this1 = new hxmath.math.Matrix2x2Default(1.0, 0.0, 0.0, 1.0);
		//line 555 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		return ((hxmath.math.Matrix2x2Default) (this1) );
	}
	
	
	public static double get_det(hxmath.math.Matrix2x2Default this1)
	{
		//line 562 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		hxmath.math.Matrix2x2Default self = this1;
		//line 563 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		return ( ( self.a * self.d ) - ( self.b * self.c ) );
	}
	
	
	public static hxmath.math.Matrix2x2Default get_transpose(hxmath.math.Matrix2x2Default this1)
	{
		//line 570 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		hxmath.math.Matrix2x2Default self = this1;
		//line 571 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		hxmath.math.Matrix2x2Default this2 = new hxmath.math.Matrix2x2Default(self.a, self.c, self.b, self.d);
		//line 571 "/shared/hxmath/hxmath/math/Matrix2x2.hx"
		return ((hxmath.math.Matrix2x2Default) (this2) );
	}
	
	
}


