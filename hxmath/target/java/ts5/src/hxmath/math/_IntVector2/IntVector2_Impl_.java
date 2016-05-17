// Generated by Haxe 3.3.0
package hxmath.math._IntVector2;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public final class IntVector2_Impl_
{
	static
	{
		//line 30 "/shared/hxmath/hxmath/math/IntVector2.hx"
		hxmath.math._IntVector2.IntVector2_Impl_.elementCount = 2;
	}
	
	public static int elementCount;
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static hxmath.math.IntVector2Default _new(int x, int y)
	{
		//line 56 "/shared/hxmath/hxmath/math/IntVector2.hx"
		hxmath.math.IntVector2Default this1 = new hxmath.math.IntVector2Default(x, y);
		//line 56 "/shared/hxmath/hxmath/math/IntVector2.hx"
		return ((hxmath.math.IntVector2Default) (this1) );
	}
	
	
	public static hxmath.math.IntVector2Default fromArray(haxe.root.Array<java.lang.Object> rawData)
	{
		//line 69 "/shared/hxmath/hxmath/math/IntVector2.hx"
		if (( rawData.length != 2 )) 
		{
			//line 71 "/shared/hxmath/hxmath/math/IntVector2.hx"
			throw haxe.lang.HaxeException.wrap("Invalid rawData.");
		}
		
		//line 74 "/shared/hxmath/hxmath/math/IntVector2.hx"
		return hxmath.math._IntVector2.IntVector2_Impl_._new(((int) (haxe.lang.Runtime.toInt(rawData.__get(0))) ), ((int) (haxe.lang.Runtime.toInt(rawData.__get(1))) ));
	}
	
	
	public static hxmath.math.Vector2Default toVector2(hxmath.math.IntVector2Default this1)
	{
		//line 84 "/shared/hxmath/hxmath/math/IntVector2.hx"
		hxmath.math.IntVector2Default self = this1;
		//line 85 "/shared/hxmath/hxmath/math/IntVector2.hx"
		hxmath.math.Vector2Default this2 = new hxmath.math.Vector2Default(((double) (self.x) ), ((double) (self.y) ));
		//line 85 "/shared/hxmath/hxmath/math/IntVector2.hx"
		return ((hxmath.math.Vector2Default) (this2) );
	}
	
	
	public static int dot(hxmath.math.IntVector2Default a, hxmath.math.IntVector2Default b)
	{
		//line 98 "/shared/hxmath/hxmath/math/IntVector2.hx"
		return ( ( a.x * b.x ) + ( a.y * b.y ) );
	}
	
	
	public static hxmath.math.IntVector2Default multiply(hxmath.math.IntVector2Default a, int s)
	{
		//line 114 "/shared/hxmath/hxmath/math/IntVector2.hx"
		hxmath.math.IntVector2Default self = ((hxmath.math.IntVector2Default) (hxmath.math._IntVector2.IntVector2_Impl_._new(a.x, a.y)) );
		//line 114 "/shared/hxmath/hxmath/math/IntVector2.hx"
		self.x *= s;
		//line 114 "/shared/hxmath/hxmath/math/IntVector2.hx"
		self.y *= s;
		//line 114 "/shared/hxmath/hxmath/math/IntVector2.hx"
		return self;
	}
	
	
	public static hxmath.math.IntVector2Default add(hxmath.math.IntVector2Default a, hxmath.math.IntVector2Default b)
	{
		//line 128 "/shared/hxmath/hxmath/math/IntVector2.hx"
		hxmath.math.IntVector2Default self = ((hxmath.math.IntVector2Default) (hxmath.math._IntVector2.IntVector2_Impl_._new(a.x, a.y)) );
		//line 128 "/shared/hxmath/hxmath/math/IntVector2.hx"
		self.x += b.x;
		//line 128 "/shared/hxmath/hxmath/math/IntVector2.hx"
		self.y += b.y;
		//line 128 "/shared/hxmath/hxmath/math/IntVector2.hx"
		return self;
	}
	
	
	public static hxmath.math.IntVector2Default subtract(hxmath.math.IntVector2Default a, hxmath.math.IntVector2Default b)
	{
		//line 142 "/shared/hxmath/hxmath/math/IntVector2.hx"
		hxmath.math.IntVector2Default self = ((hxmath.math.IntVector2Default) (hxmath.math._IntVector2.IntVector2_Impl_._new(a.x, a.y)) );
		//line 142 "/shared/hxmath/hxmath/math/IntVector2.hx"
		self.x -= b.x;
		//line 142 "/shared/hxmath/hxmath/math/IntVector2.hx"
		self.y -= b.y;
		//line 142 "/shared/hxmath/hxmath/math/IntVector2.hx"
		return self;
	}
	
	
	public static hxmath.math.IntVector2Default negate(hxmath.math.IntVector2Default a)
	{
		//line 155 "/shared/hxmath/hxmath/math/IntVector2.hx"
		return hxmath.math._IntVector2.IntVector2_Impl_._new( - (a.x) ,  - (a.y) );
	}
	
	
	public static boolean equals(hxmath.math.IntVector2Default a, hxmath.math.IntVector2Default b)
	{
		//line 171 "/shared/hxmath/hxmath/math/IntVector2.hx"
		if ( ! ((( ( a == null ) && ( b == null ) ))) ) 
		{
			//line 172 "/shared/hxmath/hxmath/math/IntVector2.hx"
			if (( ( ( a != null ) && ( b != null ) ) && ( a.x == b.x ) )) 
			{
				//line 171 "/shared/hxmath/hxmath/math/IntVector2.hx"
				return ( a.y == b.y );
			}
			else
			{
				//line 171 "/shared/hxmath/hxmath/math/IntVector2.hx"
				return false;
			}
			
		}
		else
		{
			//line 171 "/shared/hxmath/hxmath/math/IntVector2.hx"
			return true;
		}
		
	}
	
	
	public static hxmath.math.IntVector2Default max(hxmath.math.IntVector2Default a, hxmath.math.IntVector2Default b)
	{
		//line 187 "/shared/hxmath/hxmath/math/IntVector2.hx"
		hxmath.math.IntVector2Default self = ((hxmath.math.IntVector2Default) (hxmath.math._IntVector2.IntVector2_Impl_._new(a.x, a.y)) );
		//line 187 "/shared/hxmath/hxmath/math/IntVector2.hx"
		int a1 = self.x;
		//line 187 "/shared/hxmath/hxmath/math/IntVector2.hx"
		int b1 = b.x;
		//line 187 "/shared/hxmath/hxmath/math/IntVector2.hx"
		self.x = ( (( b1 > a1 )) ? (b1) : (a1) );
		//line 187 "/shared/hxmath/hxmath/math/IntVector2.hx"
		int a2 = self.y;
		//line 187 "/shared/hxmath/hxmath/math/IntVector2.hx"
		int b2 = b.y;
		//line 187 "/shared/hxmath/hxmath/math/IntVector2.hx"
		self.y = ( (( b2 > a2 )) ? (b2) : (a2) );
		//line 187 "/shared/hxmath/hxmath/math/IntVector2.hx"
		return self;
	}
	
	
	public static hxmath.math.IntVector2Default min(hxmath.math.IntVector2Default a, hxmath.math.IntVector2Default b)
	{
		//line 200 "/shared/hxmath/hxmath/math/IntVector2.hx"
		hxmath.math.IntVector2Default self = ((hxmath.math.IntVector2Default) (hxmath.math._IntVector2.IntVector2_Impl_._new(a.x, a.y)) );
		//line 200 "/shared/hxmath/hxmath/math/IntVector2.hx"
		int a1 = self.x;
		//line 200 "/shared/hxmath/hxmath/math/IntVector2.hx"
		int b1 = b.x;
		//line 200 "/shared/hxmath/hxmath/math/IntVector2.hx"
		self.x = ( (( b1 < a1 )) ? (b1) : (a1) );
		//line 200 "/shared/hxmath/hxmath/math/IntVector2.hx"
		int a2 = self.y;
		//line 200 "/shared/hxmath/hxmath/math/IntVector2.hx"
		int b2 = b.y;
		//line 200 "/shared/hxmath/hxmath/math/IntVector2.hx"
		self.y = ( (( b2 < a2 )) ? (b2) : (a2) );
		//line 200 "/shared/hxmath/hxmath/math/IntVector2.hx"
		return self;
	}
	
	
	public static hxmath.math.IntVector2Default set(hxmath.math.IntVector2Default this1, int x, int y)
	{
		//line 213 "/shared/hxmath/hxmath/math/IntVector2.hx"
		hxmath.math.IntVector2Default self = this1;
		//line 215 "/shared/hxmath/hxmath/math/IntVector2.hx"
		self.x = x;
		//line 216 "/shared/hxmath/hxmath/math/IntVector2.hx"
		self.y = y;
		//line 218 "/shared/hxmath/hxmath/math/IntVector2.hx"
		return self;
	}
	
	
	public static hxmath.math.IntVector2Default multiplyWith(hxmath.math.IntVector2Default this1, int s)
	{
		//line 230 "/shared/hxmath/hxmath/math/IntVector2.hx"
		hxmath.math.IntVector2Default self = this1;
		//line 232 "/shared/hxmath/hxmath/math/IntVector2.hx"
		self.x *= s;
		//line 233 "/shared/hxmath/hxmath/math/IntVector2.hx"
		self.y *= s;
		//line 235 "/shared/hxmath/hxmath/math/IntVector2.hx"
		return self;
	}
	
	
	public static hxmath.math.IntVector2Default addWith(hxmath.math.IntVector2Default this1, hxmath.math.IntVector2Default a)
	{
		//line 247 "/shared/hxmath/hxmath/math/IntVector2.hx"
		hxmath.math.IntVector2Default self = this1;
		//line 249 "/shared/hxmath/hxmath/math/IntVector2.hx"
		self.x += a.x;
		//line 250 "/shared/hxmath/hxmath/math/IntVector2.hx"
		self.y += a.y;
		//line 252 "/shared/hxmath/hxmath/math/IntVector2.hx"
		return self;
	}
	
	
	public static hxmath.math.IntVector2Default subtractWith(hxmath.math.IntVector2Default this1, hxmath.math.IntVector2Default a)
	{
		//line 264 "/shared/hxmath/hxmath/math/IntVector2.hx"
		hxmath.math.IntVector2Default self = this1;
		//line 266 "/shared/hxmath/hxmath/math/IntVector2.hx"
		self.x -= a.x;
		//line 267 "/shared/hxmath/hxmath/math/IntVector2.hx"
		self.y -= a.y;
		//line 269 "/shared/hxmath/hxmath/math/IntVector2.hx"
		return self;
	}
	
	
	public static hxmath.math.IntVector2Default maxWith(hxmath.math.IntVector2Default this1, hxmath.math.IntVector2Default a)
	{
		//line 281 "/shared/hxmath/hxmath/math/IntVector2.hx"
		hxmath.math.IntVector2Default self = this1;
		//line 283 "/shared/hxmath/hxmath/math/IntVector2.hx"
		int a1 = self.x;
		//line 283 "/shared/hxmath/hxmath/math/IntVector2.hx"
		int b = a.x;
		//line 283 "/shared/hxmath/hxmath/math/IntVector2.hx"
		self.x = ( (( b > a1 )) ? (b) : (a1) );
		//line 284 "/shared/hxmath/hxmath/math/IntVector2.hx"
		int a2 = self.y;
		//line 284 "/shared/hxmath/hxmath/math/IntVector2.hx"
		int b1 = a.y;
		//line 284 "/shared/hxmath/hxmath/math/IntVector2.hx"
		self.y = ( (( b1 > a2 )) ? (b1) : (a2) );
		//line 286 "/shared/hxmath/hxmath/math/IntVector2.hx"
		return self;
	}
	
	
	public static hxmath.math.IntVector2Default minWith(hxmath.math.IntVector2Default this1, hxmath.math.IntVector2Default a)
	{
		//line 298 "/shared/hxmath/hxmath/math/IntVector2.hx"
		hxmath.math.IntVector2Default self = this1;
		//line 300 "/shared/hxmath/hxmath/math/IntVector2.hx"
		int a1 = self.x;
		//line 300 "/shared/hxmath/hxmath/math/IntVector2.hx"
		int b = a.x;
		//line 300 "/shared/hxmath/hxmath/math/IntVector2.hx"
		self.x = ( (( b < a1 )) ? (b) : (a1) );
		//line 301 "/shared/hxmath/hxmath/math/IntVector2.hx"
		int a2 = self.y;
		//line 301 "/shared/hxmath/hxmath/math/IntVector2.hx"
		int b1 = a.y;
		//line 301 "/shared/hxmath/hxmath/math/IntVector2.hx"
		self.y = ( (( b1 < a2 )) ? (b1) : (a2) );
		//line 303 "/shared/hxmath/hxmath/math/IntVector2.hx"
		return self;
	}
	
	
	public static void copyTo(hxmath.math.IntVector2Default this1, hxmath.math.IntVector2Default target)
	{
		//line 314 "/shared/hxmath/hxmath/math/IntVector2.hx"
		hxmath.math.IntVector2Default self = this1;
		//line 316 "/shared/hxmath/hxmath/math/IntVector2.hx"
		{
			//line 316 "/shared/hxmath/hxmath/math/IntVector2.hx"
			int _g = 0;
			//line 316 "/shared/hxmath/hxmath/math/IntVector2.hx"
			while (( _g < 2 ))
			{
				//line 316 "/shared/hxmath/hxmath/math/IntVector2.hx"
				int i = _g++;
				//line 318 "/shared/hxmath/hxmath/math/IntVector2.hx"
				{
					//line 318 "/shared/hxmath/hxmath/math/IntVector2.hx"
					java.lang.Object tmp = null;
					//line 318 "/shared/hxmath/hxmath/math/IntVector2.hx"
					switch (i)
					{
						case 0:
						{
							//line 318 "/shared/hxmath/hxmath/math/IntVector2.hx"
							tmp = self.x;
							//line 318 "/shared/hxmath/hxmath/math/IntVector2.hx"
							break;
						}
						
						
						case 1:
						{
							//line 318 "/shared/hxmath/hxmath/math/IntVector2.hx"
							tmp = self.y;
							//line 318 "/shared/hxmath/hxmath/math/IntVector2.hx"
							break;
						}
						
						
						default:
						{
							//line 318 "/shared/hxmath/hxmath/math/IntVector2.hx"
							throw haxe.lang.HaxeException.wrap("Invalid element");
						}
						
					}
					
					//line 318 "/shared/hxmath/hxmath/math/IntVector2.hx"
					int value = ((int) (haxe.lang.Runtime.toInt(tmp)) );
					//line 318 "/shared/hxmath/hxmath/math/IntVector2.hx"
					switch (i)
					{
						case 0:
						{
							//line 318 "/shared/hxmath/hxmath/math/IntVector2.hx"
							target.x = value;
							//line 318 "/shared/hxmath/hxmath/math/IntVector2.hx"
							break;
						}
						
						
						case 1:
						{
							//line 318 "/shared/hxmath/hxmath/math/IntVector2.hx"
							target.y = value;
							//line 318 "/shared/hxmath/hxmath/math/IntVector2.hx"
							break;
						}
						
						
						default:
						{
							//line 318 "/shared/hxmath/hxmath/math/IntVector2.hx"
							throw haxe.lang.HaxeException.wrap("Invalid element");
						}
						
					}
					
				}
				
			}
			
		}
		
	}
	
	
	public static hxmath.math.IntVector2Default clone(hxmath.math.IntVector2Default this1)
	{
		//line 329 "/shared/hxmath/hxmath/math/IntVector2.hx"
		hxmath.math.IntVector2Default self = this1;
		//line 330 "/shared/hxmath/hxmath/math/IntVector2.hx"
		return hxmath.math._IntVector2.IntVector2_Impl_._new(self.x, self.y);
	}
	
	
	public static int getArrayElement(hxmath.math.IntVector2Default this1, int i)
	{
		//line 342 "/shared/hxmath/hxmath/math/IntVector2.hx"
		hxmath.math.IntVector2Default self = this1;
		//line 343 "/shared/hxmath/hxmath/math/IntVector2.hx"
		switch (i)
		{
			case 0:
			{
				//line 346 "/shared/hxmath/hxmath/math/IntVector2.hx"
				return self.x;
			}
			
			
			case 1:
			{
				//line 348 "/shared/hxmath/hxmath/math/IntVector2.hx"
				return self.y;
			}
			
			
			default:
			{
				//line 350 "/shared/hxmath/hxmath/math/IntVector2.hx"
				throw haxe.lang.HaxeException.wrap("Invalid element");
			}
			
		}
		
	}
	
	
	public static int setArrayElement(hxmath.math.IntVector2Default this1, int i, int value)
	{
		//line 364 "/shared/hxmath/hxmath/math/IntVector2.hx"
		hxmath.math.IntVector2Default self = this1;
		//line 365 "/shared/hxmath/hxmath/math/IntVector2.hx"
		switch (i)
		{
			case 0:
			{
				//line 368 "/shared/hxmath/hxmath/math/IntVector2.hx"
				return self.x = value;
			}
			
			
			case 1:
			{
				//line 370 "/shared/hxmath/hxmath/math/IntVector2.hx"
				return self.y = value;
			}
			
			
			default:
			{
				//line 372 "/shared/hxmath/hxmath/math/IntVector2.hx"
				throw haxe.lang.HaxeException.wrap("Invalid element");
			}
			
		}
		
	}
	
	
	public static hxmath.math.IntVector2Default applyNegate(hxmath.math.IntVector2Default this1)
	{
		//line 383 "/shared/hxmath/hxmath/math/IntVector2.hx"
		hxmath.math.IntVector2Default self = this1;
		//line 385 "/shared/hxmath/hxmath/math/IntVector2.hx"
		self.x =  - (self.x) ;
		//line 386 "/shared/hxmath/hxmath/math/IntVector2.hx"
		self.y =  - (self.y) ;
		//line 388 "/shared/hxmath/hxmath/math/IntVector2.hx"
		return self;
	}
	
	
	public static hxmath.math.IntVector2Default applyScalarFunc(hxmath.math.IntVector2Default this1, haxe.lang.Function func)
	{
		//line 399 "/shared/hxmath/hxmath/math/IntVector2.hx"
		hxmath.math.IntVector2Default self = this1;
		//line 401 "/shared/hxmath/hxmath/math/IntVector2.hx"
		{
			//line 401 "/shared/hxmath/hxmath/math/IntVector2.hx"
			int _g = 0;
			//line 401 "/shared/hxmath/hxmath/math/IntVector2.hx"
			while (( _g < 2 ))
			{
				//line 401 "/shared/hxmath/hxmath/math/IntVector2.hx"
				int i = _g++;
				//line 403 "/shared/hxmath/hxmath/math/IntVector2.hx"
				{
					//line 403 "/shared/hxmath/hxmath/math/IntVector2.hx"
					java.lang.Object tmp = null;
					//line 403 "/shared/hxmath/hxmath/math/IntVector2.hx"
					switch (i)
					{
						case 0:
						{
							//line 403 "/shared/hxmath/hxmath/math/IntVector2.hx"
							tmp = self.x;
							//line 403 "/shared/hxmath/hxmath/math/IntVector2.hx"
							break;
						}
						
						
						case 1:
						{
							//line 403 "/shared/hxmath/hxmath/math/IntVector2.hx"
							tmp = self.y;
							//line 403 "/shared/hxmath/hxmath/math/IntVector2.hx"
							break;
						}
						
						
						default:
						{
							//line 403 "/shared/hxmath/hxmath/math/IntVector2.hx"
							throw haxe.lang.HaxeException.wrap("Invalid element");
						}
						
					}
					
					//line 403 "/shared/hxmath/hxmath/math/IntVector2.hx"
					int value = ((int) (func.__hx_invoke1_f(((double) (((int) (haxe.lang.Runtime.toInt(tmp)) )) ), haxe.lang.Runtime.undefined)) );
					//line 403 "/shared/hxmath/hxmath/math/IntVector2.hx"
					switch (i)
					{
						case 0:
						{
							//line 403 "/shared/hxmath/hxmath/math/IntVector2.hx"
							self.x = value;
							//line 403 "/shared/hxmath/hxmath/math/IntVector2.hx"
							break;
						}
						
						
						case 1:
						{
							//line 403 "/shared/hxmath/hxmath/math/IntVector2.hx"
							self.y = value;
							//line 403 "/shared/hxmath/hxmath/math/IntVector2.hx"
							break;
						}
						
						
						default:
						{
							//line 403 "/shared/hxmath/hxmath/math/IntVector2.hx"
							throw haxe.lang.HaxeException.wrap("Invalid element");
						}
						
					}
					
				}
				
			}
			
		}
		
		//line 406 "/shared/hxmath/hxmath/math/IntVector2.hx"
		return self;
	}
	
	
	public static hxmath.math.IntVector2Default rotateLeft(hxmath.math.IntVector2Default this1)
	{
		//line 416 "/shared/hxmath/hxmath/math/IntVector2.hx"
		hxmath.math.IntVector2Default self = this1;
		//line 418 "/shared/hxmath/hxmath/math/IntVector2.hx"
		int newX =  - (self.y) ;
		//line 419 "/shared/hxmath/hxmath/math/IntVector2.hx"
		self.y = self.x;
		//line 420 "/shared/hxmath/hxmath/math/IntVector2.hx"
		self.x = newX;
		//line 422 "/shared/hxmath/hxmath/math/IntVector2.hx"
		return self;
	}
	
	
	public static hxmath.math.IntVector2Default rotateRight(hxmath.math.IntVector2Default this1)
	{
		//line 432 "/shared/hxmath/hxmath/math/IntVector2.hx"
		hxmath.math.IntVector2Default self = this1;
		//line 434 "/shared/hxmath/hxmath/math/IntVector2.hx"
		int newX = self.y;
		//line 435 "/shared/hxmath/hxmath/math/IntVector2.hx"
		self.y =  - (self.x) ;
		//line 436 "/shared/hxmath/hxmath/math/IntVector2.hx"
		self.x = newX;
		//line 438 "/shared/hxmath/hxmath/math/IntVector2.hx"
		return self;
	}
	
	
	public static hxmath.math.IntVector2Default get_zero()
	{
		//line 443 "/shared/hxmath/hxmath/math/IntVector2.hx"
		return hxmath.math._IntVector2.IntVector2_Impl_._new(0, 0);
	}
	
	
	public static hxmath.math.IntVector2Default get_xAxis()
	{
		//line 448 "/shared/hxmath/hxmath/math/IntVector2.hx"
		return hxmath.math._IntVector2.IntVector2_Impl_._new(1, 0);
	}
	
	
	public static hxmath.math.IntVector2Default get_yAxis()
	{
		//line 453 "/shared/hxmath/hxmath/math/IntVector2.hx"
		return hxmath.math._IntVector2.IntVector2_Impl_._new(0, 1);
	}
	
	
	public static int get_lengthSq(hxmath.math.IntVector2Default this1)
	{
		//line 458 "/shared/hxmath/hxmath/math/IntVector2.hx"
		hxmath.math.IntVector2Default self = this1;
		//line 459 "/shared/hxmath/hxmath/math/IntVector2.hx"
		return ( ( self.x * self.x ) + ( self.y * self.y ) );
	}
	
	
	public static hxmath.math.IntVector2Default get_rotatedLeft(hxmath.math.IntVector2Default this1)
	{
		//line 466 "/shared/hxmath/hxmath/math/IntVector2.hx"
		hxmath.math.IntVector2Default self = this1;
		//line 467 "/shared/hxmath/hxmath/math/IntVector2.hx"
		hxmath.math.IntVector2Default self1 = ((hxmath.math.IntVector2Default) (hxmath.math._IntVector2.IntVector2_Impl_._new(self.x, self.y)) );
		//line 467 "/shared/hxmath/hxmath/math/IntVector2.hx"
		int newX =  - (self1.y) ;
		//line 467 "/shared/hxmath/hxmath/math/IntVector2.hx"
		self1.y = self1.x;
		//line 467 "/shared/hxmath/hxmath/math/IntVector2.hx"
		self1.x = newX;
		//line 467 "/shared/hxmath/hxmath/math/IntVector2.hx"
		return self1;
	}
	
	
	public static hxmath.math.IntVector2Default get_rotatedRight(hxmath.math.IntVector2Default this1)
	{
		//line 473 "/shared/hxmath/hxmath/math/IntVector2.hx"
		hxmath.math.IntVector2Default self = this1;
		//line 474 "/shared/hxmath/hxmath/math/IntVector2.hx"
		hxmath.math.IntVector2Default self1 = ((hxmath.math.IntVector2Default) (hxmath.math._IntVector2.IntVector2_Impl_._new(self.x, self.y)) );
		//line 474 "/shared/hxmath/hxmath/math/IntVector2.hx"
		int newX = self1.y;
		//line 474 "/shared/hxmath/hxmath/math/IntVector2.hx"
		self1.y =  - (self1.x) ;
		//line 474 "/shared/hxmath/hxmath/math/IntVector2.hx"
		self1.x = newX;
		//line 474 "/shared/hxmath/hxmath/math/IntVector2.hx"
		return self1;
	}
	
	
}


