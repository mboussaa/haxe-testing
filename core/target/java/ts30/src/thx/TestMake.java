// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TestMake extends haxe.lang.HxObject
{
	public TestMake(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public TestMake(int i)
	{
		//line 7 "/shared/core/test/thx/TestMake.hx"
		thx.TestMake.__hx_ctor_thx_TestMake(this, i);
	}
	
	
	public static void __hx_ctor_thx_TestMake(thx.TestMake __temp_me33, int i)
	{
		//line 8 "/shared/core/test/thx/TestMake.hx"
		__temp_me33.x = i;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 5 "/shared/core/test/thx/TestMake.hx"
		return new thx.TestMake(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 5 "/shared/core/test/thx/TestMake.hx"
		return new thx.TestMake(((int) (haxe.lang.Runtime.toInt(arr.__get(0))) ));
	}
	
	
	public int x;
	
	public void testConstructorLiteral()
	{
		//line 12 "/shared/core/test/thx/TestMake.hx"
		int _g1 = 0;
		//line 12 "/shared/core/test/thx/TestMake.hx"
		int _g = this.x;
		//line 12 "/shared/core/test/thx/TestMake.hx"
		while (( _g1 < _g ))
		{
			//line 12 "/shared/core/test/thx/TestMake.hx"
			 ++ _g1;
			//line 13 "/shared/core/test/thx/TestMake.hx"
			haxe.lang.Function constructor = ( (( thx.TestMake_testConstructorLiteral_13__Fun.__hx_current != null )) ? (thx.TestMake_testConstructorLiteral_13__Fun.__hx_current) : (thx.TestMake_testConstructorLiteral_13__Fun.__hx_current = ((thx.TestMake_testConstructorLiteral_13__Fun) (new thx.TestMake_testConstructorLiteral_13__Fun()) )) );
			//line 14 "/shared/core/test/thx/TestMake.hx"
			utest.Assert.same(new haxe.lang.DynamicObject(new java.lang.String[]{"c", "d"}, new java.lang.Object[]{"A", "D"}, new java.lang.String[]{"a", "b"}, new double[]{((double) (0.2) ), ((double) (((double) (1) )) )}), ((java.lang.Object) (constructor.__hx_invoke4_o(0.0, "A", ((double) (1) ), haxe.lang.Runtime.undefined, 0.2, haxe.lang.Runtime.undefined, 0.0, "D")) ), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestMake", "TestMake.hx", "testConstructorLiteral"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (14) )) )}));
		}
		
	}
	
	
	public void testConstructorFromTypedef()
	{
		//line 23 "/shared/core/test/thx/TestMake.hx"
		int _g1 = 0;
		//line 23 "/shared/core/test/thx/TestMake.hx"
		int _g = this.x;
		//line 23 "/shared/core/test/thx/TestMake.hx"
		while (( _g1 < _g ))
		{
			//line 23 "/shared/core/test/thx/TestMake.hx"
			 ++ _g1;
			//line 24 "/shared/core/test/thx/TestMake.hx"
			haxe.lang.Function constructor = ( (( thx.TestMake_testConstructorFromTypedef_24__Fun.__hx_current != null )) ? (thx.TestMake_testConstructorFromTypedef_24__Fun.__hx_current) : (thx.TestMake_testConstructorFromTypedef_24__Fun.__hx_current = ((thx.TestMake_testConstructorFromTypedef_24__Fun) (new thx.TestMake_testConstructorFromTypedef_24__Fun()) )) );
			//line 25 "/shared/core/test/thx/TestMake.hx"
			utest.Assert.same(new haxe.lang.DynamicObject(new java.lang.String[]{"c", "d"}, new java.lang.Object[]{"A", "D"}, new java.lang.String[]{"a", "b"}, new double[]{((double) (0.2) ), ((double) (((double) (1) )) )}), ((java.lang.Object) (constructor.__hx_invoke4_o(0.0, "A", ((double) (1) ), haxe.lang.Runtime.undefined, 0.2, haxe.lang.Runtime.undefined, 0.0, "D")) ), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestMake", "TestMake.hx", "testConstructorFromTypedef"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (25) )) )}));
		}
		
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 5 "/shared/core/test/thx/TestMake.hx"
		{
			//line 5 "/shared/core/test/thx/TestMake.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "/shared/core/test/thx/TestMake.hx"
			switch (field.hashCode())
			{
				case 120:
				{
					//line 5 "/shared/core/test/thx/TestMake.hx"
					if (field.equals("x")) 
					{
						//line 5 "/shared/core/test/thx/TestMake.hx"
						__temp_executeDef1 = false;
						//line 5 "/shared/core/test/thx/TestMake.hx"
						this.x = ((int) (value) );
						//line 5 "/shared/core/test/thx/TestMake.hx"
						return value;
					}
					
					//line 5 "/shared/core/test/thx/TestMake.hx"
					break;
				}
				
				
			}
			
			//line 5 "/shared/core/test/thx/TestMake.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "/shared/core/test/thx/TestMake.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 5 "/shared/core/test/thx/TestMake.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 5 "/shared/core/test/thx/TestMake.hx"
		{
			//line 5 "/shared/core/test/thx/TestMake.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "/shared/core/test/thx/TestMake.hx"
			switch (field.hashCode())
			{
				case 120:
				{
					//line 5 "/shared/core/test/thx/TestMake.hx"
					if (field.equals("x")) 
					{
						//line 5 "/shared/core/test/thx/TestMake.hx"
						__temp_executeDef1 = false;
						//line 5 "/shared/core/test/thx/TestMake.hx"
						this.x = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 5 "/shared/core/test/thx/TestMake.hx"
						return value;
					}
					
					//line 5 "/shared/core/test/thx/TestMake.hx"
					break;
				}
				
				
			}
			
			//line 5 "/shared/core/test/thx/TestMake.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "/shared/core/test/thx/TestMake.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 5 "/shared/core/test/thx/TestMake.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 5 "/shared/core/test/thx/TestMake.hx"
		{
			//line 5 "/shared/core/test/thx/TestMake.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "/shared/core/test/thx/TestMake.hx"
			switch (field.hashCode())
			{
				case -1594710439:
				{
					//line 5 "/shared/core/test/thx/TestMake.hx"
					if (field.equals("testConstructorFromTypedef")) 
					{
						//line 5 "/shared/core/test/thx/TestMake.hx"
						__temp_executeDef1 = false;
						//line 5 "/shared/core/test/thx/TestMake.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testConstructorFromTypedef")) );
					}
					
					//line 5 "/shared/core/test/thx/TestMake.hx"
					break;
				}
				
				
				case 120:
				{
					//line 5 "/shared/core/test/thx/TestMake.hx"
					if (field.equals("x")) 
					{
						//line 5 "/shared/core/test/thx/TestMake.hx"
						__temp_executeDef1 = false;
						//line 5 "/shared/core/test/thx/TestMake.hx"
						return this.x;
					}
					
					//line 5 "/shared/core/test/thx/TestMake.hx"
					break;
				}
				
				
				case 884511623:
				{
					//line 5 "/shared/core/test/thx/TestMake.hx"
					if (field.equals("testConstructorLiteral")) 
					{
						//line 5 "/shared/core/test/thx/TestMake.hx"
						__temp_executeDef1 = false;
						//line 5 "/shared/core/test/thx/TestMake.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testConstructorLiteral")) );
					}
					
					//line 5 "/shared/core/test/thx/TestMake.hx"
					break;
				}
				
				
			}
			
			//line 5 "/shared/core/test/thx/TestMake.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "/shared/core/test/thx/TestMake.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 5 "/shared/core/test/thx/TestMake.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 5 "/shared/core/test/thx/TestMake.hx"
		{
			//line 5 "/shared/core/test/thx/TestMake.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "/shared/core/test/thx/TestMake.hx"
			switch (field.hashCode())
			{
				case 120:
				{
					//line 5 "/shared/core/test/thx/TestMake.hx"
					if (field.equals("x")) 
					{
						//line 5 "/shared/core/test/thx/TestMake.hx"
						__temp_executeDef1 = false;
						//line 5 "/shared/core/test/thx/TestMake.hx"
						return ((double) (this.x) );
					}
					
					//line 5 "/shared/core/test/thx/TestMake.hx"
					break;
				}
				
				
			}
			
			//line 5 "/shared/core/test/thx/TestMake.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "/shared/core/test/thx/TestMake.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 5 "/shared/core/test/thx/TestMake.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 5 "/shared/core/test/thx/TestMake.hx"
		{
			//line 5 "/shared/core/test/thx/TestMake.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "/shared/core/test/thx/TestMake.hx"
			switch (field.hashCode())
			{
				case -1594710439:
				{
					//line 5 "/shared/core/test/thx/TestMake.hx"
					if (field.equals("testConstructorFromTypedef")) 
					{
						//line 5 "/shared/core/test/thx/TestMake.hx"
						__temp_executeDef1 = false;
						//line 5 "/shared/core/test/thx/TestMake.hx"
						this.testConstructorFromTypedef();
					}
					
					//line 5 "/shared/core/test/thx/TestMake.hx"
					break;
				}
				
				
				case 884511623:
				{
					//line 5 "/shared/core/test/thx/TestMake.hx"
					if (field.equals("testConstructorLiteral")) 
					{
						//line 5 "/shared/core/test/thx/TestMake.hx"
						__temp_executeDef1 = false;
						//line 5 "/shared/core/test/thx/TestMake.hx"
						this.testConstructorLiteral();
					}
					
					//line 5 "/shared/core/test/thx/TestMake.hx"
					break;
				}
				
				
			}
			
			//line 5 "/shared/core/test/thx/TestMake.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "/shared/core/test/thx/TestMake.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 5 "/shared/core/test/thx/TestMake.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 5 "/shared/core/test/thx/TestMake.hx"
		baseArr.push("x");
		//line 5 "/shared/core/test/thx/TestMake.hx"
		{
			//line 5 "/shared/core/test/thx/TestMake.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


