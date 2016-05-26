// Generated by Haxe 3.3.0
package thx.math.random;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class PseudoRandom extends haxe.lang.HxObject
{
	public PseudoRandom(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public PseudoRandom(java.lang.Object seed)
	{
		//line 6 "/shared/math/src/thx/math/random/PseudoRandom.hx"
		thx.math.random.PseudoRandom.__hx_ctor_thx_math_random_PseudoRandom(this, seed);
	}
	
	
	public static void __hx_ctor_thx_math_random_PseudoRandom(thx.math.random.PseudoRandom __temp_me116, java.lang.Object seed)
	{
		//line 7 "/shared/math/src/thx/math/random/PseudoRandom.hx"
		int __temp_seed115 = ( (haxe.lang.Runtime.eq(seed, null)) ? (1) : (((int) (haxe.lang.Runtime.toInt(seed)) )) );
		//line 7 "/shared/math/src/thx/math/random/PseudoRandom.hx"
		__temp_me116.seed = __temp_seed115;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
		return new thx.math.random.PseudoRandom(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
		return new thx.math.random.PseudoRandom(((java.lang.Object) (arr.__get(0)) ));
	}
	
	
	public int seed;
	
	public int _int()
	{
		//line 10 "/shared/math/src/thx/math/random/PseudoRandom.hx"
		return ( (this.seed = ((int) (( ( this.seed * 48271.0 ) % 2147483647.0 )) )) & 1073741823 );
	}
	
	
	public double _float()
	{
		//line 13 "/shared/math/src/thx/math/random/PseudoRandom.hx"
		return ( this._int() / 1073741823.0 );
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
		{
			//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
			boolean __temp_executeDef1 = true;
			//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
			switch (field.hashCode())
			{
				case 3526257:
				{
					//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
					if (field.equals("seed")) 
					{
						//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
						__temp_executeDef1 = false;
						//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
						this.seed = ((int) (value) );
						//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
						return value;
					}
					
					//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
					break;
				}
				
				
			}
			
			//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
			if (__temp_executeDef1) 
			{
				//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
		{
			//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
			boolean __temp_executeDef1 = true;
			//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
			switch (field.hashCode())
			{
				case 3526257:
				{
					//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
					if (field.equals("seed")) 
					{
						//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
						__temp_executeDef1 = false;
						//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
						this.seed = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
						return value;
					}
					
					//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
					break;
				}
				
				
			}
			
			//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
			if (__temp_executeDef1) 
			{
				//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
		{
			//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
			boolean __temp_executeDef1 = true;
			//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
			switch (field.hashCode())
			{
				case 97526364:
				{
					//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
					if (field.equals("float")) 
					{
						//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
						__temp_executeDef1 = false;
						//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "float")) );
					}
					
					//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
					break;
				}
				
				
				case 3526257:
				{
					//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
					if (field.equals("seed")) 
					{
						//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
						__temp_executeDef1 = false;
						//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
						return this.seed;
					}
					
					//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
					break;
				}
				
				
				case 104431:
				{
					//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
					if (field.equals("int")) 
					{
						//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
						__temp_executeDef1 = false;
						//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "int")) );
					}
					
					//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
					break;
				}
				
				
			}
			
			//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
			if (__temp_executeDef1) 
			{
				//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
		{
			//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
			boolean __temp_executeDef1 = true;
			//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
			switch (field.hashCode())
			{
				case 3526257:
				{
					//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
					if (field.equals("seed")) 
					{
						//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
						__temp_executeDef1 = false;
						//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
						return ((double) (this.seed) );
					}
					
					//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
					break;
				}
				
				
			}
			
			//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
			if (__temp_executeDef1) 
			{
				//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
		{
			//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
			boolean __temp_executeDef1 = true;
			//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
			switch (field.hashCode())
			{
				case 97526364:
				{
					//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
					if (field.equals("float")) 
					{
						//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
						__temp_executeDef1 = false;
						//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
						return this._float();
					}
					
					//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
					break;
				}
				
				
				case 104431:
				{
					//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
					if (field.equals("int")) 
					{
						//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
						__temp_executeDef1 = false;
						//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
						return this._int();
					}
					
					//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
					break;
				}
				
				
			}
			
			//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
			if (__temp_executeDef1) 
			{
				//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
		baseArr.push("seed");
		//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
		{
			//line 3 "/shared/math/src/thx/math/random/PseudoRandom.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


