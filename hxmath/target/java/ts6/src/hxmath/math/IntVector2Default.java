// Generated by Haxe 3.3.0
package hxmath.math;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class IntVector2Default extends haxe.lang.HxObject
{
	public IntVector2Default(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public IntVector2Default(int x, int y)
	{
		//line 11 "/shared/hxmath/hxmath/math/IntVector2.hx"
		hxmath.math.IntVector2Default.__hx_ctor_hxmath_math_IntVector2Default(this, x, y);
	}
	
	
	public static void __hx_ctor_hxmath_math_IntVector2Default(hxmath.math.IntVector2Default __temp_me18, int x, int y)
	{
		//line 13 "/shared/hxmath/hxmath/math/IntVector2.hx"
		__temp_me18.x = x;
		//line 14 "/shared/hxmath/hxmath/math/IntVector2.hx"
		__temp_me18.y = y;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
		return new hxmath.math.IntVector2Default(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
		return new hxmath.math.IntVector2Default(((int) (haxe.lang.Runtime.toInt(arr.__get(0))) ), ((int) (haxe.lang.Runtime.toInt(arr.__get(1))) ));
	}
	
	
	public int x;
	
	public int y;
	
	@Override public java.lang.String toString()
	{
		//line 19 "/shared/hxmath/hxmath/math/IntVector2.hx"
		return ( ( ( ( "(" + this.x ) + ", " ) + this.y ) + ")" );
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
		{
			//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
			switch (field.hashCode())
			{
				case 121:
				{
					//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
					if (field.equals("y")) 
					{
						//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
						__temp_executeDef1 = false;
						//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
						this.y = ((int) (value) );
						//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
						return value;
					}
					
					//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
					break;
				}
				
				
				case 120:
				{
					//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
					if (field.equals("x")) 
					{
						//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
						__temp_executeDef1 = false;
						//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
						this.x = ((int) (value) );
						//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
						return value;
					}
					
					//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
					break;
				}
				
				
			}
			
			//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
		{
			//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
			switch (field.hashCode())
			{
				case 121:
				{
					//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
					if (field.equals("y")) 
					{
						//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
						__temp_executeDef1 = false;
						//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
						this.y = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
						return value;
					}
					
					//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
					break;
				}
				
				
				case 120:
				{
					//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
					if (field.equals("x")) 
					{
						//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
						__temp_executeDef1 = false;
						//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
						this.x = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
						return value;
					}
					
					//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
					break;
				}
				
				
			}
			
			//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
		{
			//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
			switch (field.hashCode())
			{
				case -1776922004:
				{
					//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
					if (field.equals("toString")) 
					{
						//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
						__temp_executeDef1 = false;
						//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toString")) );
					}
					
					//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
					break;
				}
				
				
				case 120:
				{
					//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
					if (field.equals("x")) 
					{
						//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
						__temp_executeDef1 = false;
						//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
						return this.x;
					}
					
					//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
					break;
				}
				
				
				case 121:
				{
					//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
					if (field.equals("y")) 
					{
						//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
						__temp_executeDef1 = false;
						//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
						return this.y;
					}
					
					//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
					break;
				}
				
				
			}
			
			//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
		{
			//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
			switch (field.hashCode())
			{
				case 121:
				{
					//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
					if (field.equals("y")) 
					{
						//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
						__temp_executeDef1 = false;
						//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
						return ((double) (this.y) );
					}
					
					//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
					break;
				}
				
				
				case 120:
				{
					//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
					if (field.equals("x")) 
					{
						//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
						__temp_executeDef1 = false;
						//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
						return ((double) (this.x) );
					}
					
					//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
					break;
				}
				
				
			}
			
			//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
		{
			//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
			switch (field.hashCode())
			{
				case -1776922004:
				{
					//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
					if (field.equals("toString")) 
					{
						//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
						__temp_executeDef1 = false;
						//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
						return this.toString();
					}
					
					//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
					break;
				}
				
				
			}
			
			//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
		baseArr.push("y");
		//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
		baseArr.push("x");
		//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
		{
			//line 6 "/shared/hxmath/hxmath/math/IntVector2.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


