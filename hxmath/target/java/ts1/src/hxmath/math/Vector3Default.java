// Generated by Haxe 3.3.0
package hxmath.math;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Vector3Default extends haxe.lang.HxObject
{
	public Vector3Default(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Vector3Default(double x, double y, double z)
	{
		//line 19 "/shared/hxmath/hxmath/math/Vector3.hx"
		hxmath.math.Vector3Default.__hx_ctor_hxmath_math_Vector3Default(this, x, y, z);
	}
	
	
	public static void __hx_ctor_hxmath_math_Vector3Default(hxmath.math.Vector3Default __temp_me30, double x, double y, double z)
	{
		//line 21 "/shared/hxmath/hxmath/math/Vector3.hx"
		__temp_me30.x = x;
		//line 22 "/shared/hxmath/hxmath/math/Vector3.hx"
		__temp_me30.y = y;
		//line 23 "/shared/hxmath/hxmath/math/Vector3.hx"
		__temp_me30.z = z;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
		return new hxmath.math.Vector3Default(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
		return new hxmath.math.Vector3Default(((double) (haxe.lang.Runtime.toDouble(arr.__get(0))) ), ((double) (haxe.lang.Runtime.toDouble(arr.__get(1))) ), ((double) (haxe.lang.Runtime.toDouble(arr.__get(2))) ));
	}
	
	
	public double x;
	
	public double y;
	
	public double z;
	
	@Override public java.lang.String toString()
	{
		//line 28 "/shared/hxmath/hxmath/math/Vector3.hx"
		return ( ( ( ( ( ( "(" + haxe.lang.Runtime.toString(this.x) ) + ", " ) + haxe.lang.Runtime.toString(this.y) ) + ", " ) + haxe.lang.Runtime.toString(this.z) ) + ")" );
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
		{
			//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
			switch (field.hashCode())
			{
				case 122:
				{
					//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
					if (field.equals("z")) 
					{
						//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
						__temp_executeDef1 = false;
						//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
						this.z = ((double) (value) );
						//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
						return value;
					}
					
					//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
					break;
				}
				
				
				case 120:
				{
					//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
					if (field.equals("x")) 
					{
						//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
						__temp_executeDef1 = false;
						//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
						this.x = ((double) (value) );
						//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
						return value;
					}
					
					//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
					break;
				}
				
				
				case 121:
				{
					//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
					if (field.equals("y")) 
					{
						//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
						__temp_executeDef1 = false;
						//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
						this.y = ((double) (value) );
						//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
						return value;
					}
					
					//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
					break;
				}
				
				
			}
			
			//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
		{
			//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
			switch (field.hashCode())
			{
				case 122:
				{
					//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
					if (field.equals("z")) 
					{
						//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
						__temp_executeDef1 = false;
						//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
						this.z = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
						return value;
					}
					
					//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
					break;
				}
				
				
				case 120:
				{
					//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
					if (field.equals("x")) 
					{
						//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
						__temp_executeDef1 = false;
						//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
						this.x = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
						return value;
					}
					
					//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
					break;
				}
				
				
				case 121:
				{
					//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
					if (field.equals("y")) 
					{
						//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
						__temp_executeDef1 = false;
						//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
						this.y = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
						return value;
					}
					
					//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
					break;
				}
				
				
			}
			
			//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
		{
			//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
			switch (field.hashCode())
			{
				case -1776922004:
				{
					//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
					if (field.equals("toString")) 
					{
						//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
						__temp_executeDef1 = false;
						//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toString")) );
					}
					
					//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
					break;
				}
				
				
				case 120:
				{
					//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
					if (field.equals("x")) 
					{
						//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
						__temp_executeDef1 = false;
						//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
						return this.x;
					}
					
					//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
					break;
				}
				
				
				case 122:
				{
					//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
					if (field.equals("z")) 
					{
						//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
						__temp_executeDef1 = false;
						//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
						return this.z;
					}
					
					//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
					break;
				}
				
				
				case 121:
				{
					//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
					if (field.equals("y")) 
					{
						//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
						__temp_executeDef1 = false;
						//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
						return this.y;
					}
					
					//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
					break;
				}
				
				
			}
			
			//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
		{
			//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
			switch (field.hashCode())
			{
				case 122:
				{
					//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
					if (field.equals("z")) 
					{
						//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
						__temp_executeDef1 = false;
						//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
						return this.z;
					}
					
					//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
					break;
				}
				
				
				case 120:
				{
					//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
					if (field.equals("x")) 
					{
						//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
						__temp_executeDef1 = false;
						//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
						return this.x;
					}
					
					//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
					break;
				}
				
				
				case 121:
				{
					//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
					if (field.equals("y")) 
					{
						//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
						__temp_executeDef1 = false;
						//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
						return this.y;
					}
					
					//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
					break;
				}
				
				
			}
			
			//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
		{
			//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
			switch (field.hashCode())
			{
				case -1776922004:
				{
					//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
					if (field.equals("toString")) 
					{
						//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
						__temp_executeDef1 = false;
						//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
						return this.toString();
					}
					
					//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
					break;
				}
				
				
			}
			
			//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
		baseArr.push("z");
		//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
		baseArr.push("y");
		//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
		baseArr.push("x");
		//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
		{
			//line 13 "/shared/hxmath/hxmath/math/Vector3.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


