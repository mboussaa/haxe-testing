// Generated by Haxe 3.3.0
package hxmath.math;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Matrix3x3Default extends haxe.lang.HxObject
{
	public Matrix3x3Default(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Matrix3x3Default(double m00, double m10, double m20, double m01, double m11, double m21, double m02, double m12, double m22)
	{
		//line 36 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		hxmath.math.Matrix3x3Default.__hx_ctor_hxmath_math_Matrix3x3Default(this, m00, m10, m20, m01, m11, m21, m02, m12, m22);
	}
	
	
	public static void __hx_ctor_hxmath_math_Matrix3x3Default(hxmath.math.Matrix3x3Default __temp_me22, double m00, double m10, double m20, double m01, double m11, double m21, double m02, double m12, double m22)
	{
		//line 41 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		__temp_me22.m00 = m00;
		//line 42 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		__temp_me22.m10 = m10;
		//line 43 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		__temp_me22.m20 = m20;
		//line 45 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		__temp_me22.m01 = m01;
		//line 46 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		__temp_me22.m11 = m11;
		//line 47 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		__temp_me22.m21 = m21;
		//line 49 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		__temp_me22.m02 = m02;
		//line 50 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		__temp_me22.m12 = m12;
		//line 51 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		__temp_me22.m22 = m22;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		return new hxmath.math.Matrix3x3Default(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		return new hxmath.math.Matrix3x3Default(((double) (haxe.lang.Runtime.toDouble(arr.__get(0))) ), ((double) (haxe.lang.Runtime.toDouble(arr.__get(1))) ), ((double) (haxe.lang.Runtime.toDouble(arr.__get(2))) ), ((double) (haxe.lang.Runtime.toDouble(arr.__get(3))) ), ((double) (haxe.lang.Runtime.toDouble(arr.__get(4))) ), ((double) (haxe.lang.Runtime.toDouble(arr.__get(5))) ), ((double) (haxe.lang.Runtime.toDouble(arr.__get(6))) ), ((double) (haxe.lang.Runtime.toDouble(arr.__get(7))) ), ((double) (haxe.lang.Runtime.toDouble(arr.__get(8))) ));
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
	
	@Override public java.lang.String toString()
	{
		//line 56 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		return ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( "[[" + haxe.lang.Runtime.toString(this.m00) ) + ", " ) + haxe.lang.Runtime.toString(this.m10) ) + ", " ) + haxe.lang.Runtime.toString(this.m20) ) + "], [" ) + haxe.lang.Runtime.toString(this.m01) ) + ", " ) + haxe.lang.Runtime.toString(this.m11) ) + ", " ) + haxe.lang.Runtime.toString(this.m21) ) + "], [" ) + haxe.lang.Runtime.toString(this.m02) ) + ", " ) + haxe.lang.Runtime.toString(this.m12) ) + ", " ) + haxe.lang.Runtime.toString(this.m22) ) + "]]" );
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		{
			//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
			boolean __temp_executeDef1 = true;
			//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
			switch (field.hashCode())
			{
				case 106349:
				{
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					if (field.equals("m22")) 
					{
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						__temp_executeDef1 = false;
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						this.m22 = ((double) (value) );
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						return value;
					}
					
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					break;
				}
				
				
				case 106285:
				{
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					if (field.equals("m00")) 
					{
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						__temp_executeDef1 = false;
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						this.m00 = ((double) (value) );
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						return value;
					}
					
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					break;
				}
				
				
				case 106348:
				{
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					if (field.equals("m21")) 
					{
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						__temp_executeDef1 = false;
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						this.m21 = ((double) (value) );
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						return value;
					}
					
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					break;
				}
				
				
				case 106286:
				{
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					if (field.equals("m01")) 
					{
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						__temp_executeDef1 = false;
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						this.m01 = ((double) (value) );
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						return value;
					}
					
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					break;
				}
				
				
				case 106347:
				{
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					if (field.equals("m20")) 
					{
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						__temp_executeDef1 = false;
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						this.m20 = ((double) (value) );
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						return value;
					}
					
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					break;
				}
				
				
				case 106287:
				{
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					if (field.equals("m02")) 
					{
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						__temp_executeDef1 = false;
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						this.m02 = ((double) (value) );
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						return value;
					}
					
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					break;
				}
				
				
				case 106318:
				{
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					if (field.equals("m12")) 
					{
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						__temp_executeDef1 = false;
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						this.m12 = ((double) (value) );
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						return value;
					}
					
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					break;
				}
				
				
				case 106316:
				{
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					if (field.equals("m10")) 
					{
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						__temp_executeDef1 = false;
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						this.m10 = ((double) (value) );
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						return value;
					}
					
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					break;
				}
				
				
				case 106317:
				{
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					if (field.equals("m11")) 
					{
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						__temp_executeDef1 = false;
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						this.m11 = ((double) (value) );
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						return value;
					}
					
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					break;
				}
				
				
			}
			
			//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
			if (__temp_executeDef1) 
			{
				//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		{
			//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
			boolean __temp_executeDef1 = true;
			//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
			switch (field.hashCode())
			{
				case 106349:
				{
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					if (field.equals("m22")) 
					{
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						__temp_executeDef1 = false;
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						this.m22 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						return value;
					}
					
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					break;
				}
				
				
				case 106285:
				{
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					if (field.equals("m00")) 
					{
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						__temp_executeDef1 = false;
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						this.m00 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						return value;
					}
					
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					break;
				}
				
				
				case 106348:
				{
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					if (field.equals("m21")) 
					{
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						__temp_executeDef1 = false;
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						this.m21 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						return value;
					}
					
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					break;
				}
				
				
				case 106286:
				{
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					if (field.equals("m01")) 
					{
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						__temp_executeDef1 = false;
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						this.m01 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						return value;
					}
					
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					break;
				}
				
				
				case 106347:
				{
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					if (field.equals("m20")) 
					{
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						__temp_executeDef1 = false;
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						this.m20 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						return value;
					}
					
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					break;
				}
				
				
				case 106287:
				{
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					if (field.equals("m02")) 
					{
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						__temp_executeDef1 = false;
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						this.m02 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						return value;
					}
					
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					break;
				}
				
				
				case 106318:
				{
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					if (field.equals("m12")) 
					{
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						__temp_executeDef1 = false;
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						this.m12 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						return value;
					}
					
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					break;
				}
				
				
				case 106316:
				{
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					if (field.equals("m10")) 
					{
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						__temp_executeDef1 = false;
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						this.m10 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						return value;
					}
					
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					break;
				}
				
				
				case 106317:
				{
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					if (field.equals("m11")) 
					{
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						__temp_executeDef1 = false;
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						this.m11 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						return value;
					}
					
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					break;
				}
				
				
			}
			
			//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
			if (__temp_executeDef1) 
			{
				//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		{
			//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
			boolean __temp_executeDef1 = true;
			//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
			switch (field.hashCode())
			{
				case -1776922004:
				{
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					if (field.equals("toString")) 
					{
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						__temp_executeDef1 = false;
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toString")) );
					}
					
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					break;
				}
				
				
				case 106285:
				{
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					if (field.equals("m00")) 
					{
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						__temp_executeDef1 = false;
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						return this.m00;
					}
					
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					break;
				}
				
				
				case 106349:
				{
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					if (field.equals("m22")) 
					{
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						__temp_executeDef1 = false;
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						return this.m22;
					}
					
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					break;
				}
				
				
				case 106286:
				{
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					if (field.equals("m01")) 
					{
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						__temp_executeDef1 = false;
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						return this.m01;
					}
					
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					break;
				}
				
				
				case 106348:
				{
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					if (field.equals("m21")) 
					{
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						__temp_executeDef1 = false;
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						return this.m21;
					}
					
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					break;
				}
				
				
				case 106287:
				{
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					if (field.equals("m02")) 
					{
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						__temp_executeDef1 = false;
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						return this.m02;
					}
					
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					break;
				}
				
				
				case 106347:
				{
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					if (field.equals("m20")) 
					{
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						__temp_executeDef1 = false;
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						return this.m20;
					}
					
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					break;
				}
				
				
				case 106316:
				{
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					if (field.equals("m10")) 
					{
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						__temp_executeDef1 = false;
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						return this.m10;
					}
					
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					break;
				}
				
				
				case 106318:
				{
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					if (field.equals("m12")) 
					{
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						__temp_executeDef1 = false;
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						return this.m12;
					}
					
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					break;
				}
				
				
				case 106317:
				{
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					if (field.equals("m11")) 
					{
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						__temp_executeDef1 = false;
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						return this.m11;
					}
					
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					break;
				}
				
				
			}
			
			//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
			if (__temp_executeDef1) 
			{
				//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		{
			//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
			boolean __temp_executeDef1 = true;
			//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
			switch (field.hashCode())
			{
				case 106349:
				{
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					if (field.equals("m22")) 
					{
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						__temp_executeDef1 = false;
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						return this.m22;
					}
					
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					break;
				}
				
				
				case 106285:
				{
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					if (field.equals("m00")) 
					{
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						__temp_executeDef1 = false;
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						return this.m00;
					}
					
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					break;
				}
				
				
				case 106348:
				{
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					if (field.equals("m21")) 
					{
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						__temp_executeDef1 = false;
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						return this.m21;
					}
					
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					break;
				}
				
				
				case 106286:
				{
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					if (field.equals("m01")) 
					{
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						__temp_executeDef1 = false;
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						return this.m01;
					}
					
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					break;
				}
				
				
				case 106347:
				{
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					if (field.equals("m20")) 
					{
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						__temp_executeDef1 = false;
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						return this.m20;
					}
					
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					break;
				}
				
				
				case 106287:
				{
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					if (field.equals("m02")) 
					{
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						__temp_executeDef1 = false;
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						return this.m02;
					}
					
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					break;
				}
				
				
				case 106318:
				{
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					if (field.equals("m12")) 
					{
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						__temp_executeDef1 = false;
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						return this.m12;
					}
					
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					break;
				}
				
				
				case 106316:
				{
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					if (field.equals("m10")) 
					{
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						__temp_executeDef1 = false;
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						return this.m10;
					}
					
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					break;
				}
				
				
				case 106317:
				{
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					if (field.equals("m11")) 
					{
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						__temp_executeDef1 = false;
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						return this.m11;
					}
					
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					break;
				}
				
				
			}
			
			//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
			if (__temp_executeDef1) 
			{
				//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		{
			//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
			boolean __temp_executeDef1 = true;
			//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
			switch (field.hashCode())
			{
				case -1776922004:
				{
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					if (field.equals("toString")) 
					{
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						__temp_executeDef1 = false;
						//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
						return this.toString();
					}
					
					//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
					break;
				}
				
				
			}
			
			//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
			if (__temp_executeDef1) 
			{
				//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		baseArr.push("m22");
		//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		baseArr.push("m21");
		//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		baseArr.push("m20");
		//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		baseArr.push("m12");
		//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		baseArr.push("m11");
		//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		baseArr.push("m10");
		//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		baseArr.push("m02");
		//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		baseArr.push("m01");
		//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		baseArr.push("m00");
		//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
		{
			//line 22 "/shared/hxmath/hxmath/math/Matrix3x3.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


