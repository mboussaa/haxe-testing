// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TestStaticResource extends haxe.lang.HxObject
{
	public TestStaticResource(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public TestStaticResource(int i)
	{
		//line 7 "/shared/core/test/thx/TestStaticResource.hx"
		thx.TestStaticResource.__hx_ctor_thx_TestStaticResource(this, i);
	}
	
	
	public static void __hx_ctor_thx_TestStaticResource(thx.TestStaticResource __temp_me32, int i)
	{
		//line 8 "/shared/core/test/thx/TestStaticResource.hx"
		__temp_me32.x = i;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 5 "/shared/core/test/thx/TestStaticResource.hx"
		return new thx.TestStaticResource(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 5 "/shared/core/test/thx/TestStaticResource.hx"
		return new thx.TestStaticResource(((int) (haxe.lang.Runtime.toInt(arr.__get(0))) ));
	}
	
	
	public int x;
	
	public void testBasics()
	{
		//line 12 "/shared/core/test/thx/TestStaticResource.hx"
		int _g1 = 0;
		//line 12 "/shared/core/test/thx/TestStaticResource.hx"
		int _g = this.x;
		//line 12 "/shared/core/test/thx/TestStaticResource.hx"
		while (( _g1 < _g ))
		{
			//line 12 "/shared/core/test/thx/TestStaticResource.hx"
			 ++ _g1;
			//line 13 "/shared/core/test/thx/TestStaticResource.hx"
			utest.Assert.equals(1, thx.ResourceTest.a, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestStaticResource", "TestStaticResource.hx", "testBasics"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (13) )) )}));
			//line 14 "/shared/core/test/thx/TestStaticResource.hx"
			utest.Assert.notNull(thx.ResourceTest.b, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestStaticResource", "TestStaticResource.hx", "testBasics"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (14) )) )}));
			//line 15 "/shared/core/test/thx/TestStaticResource.hx"
			utest.Assert.equals("thx", haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(thx.ResourceTest.b, "s", true)), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestStaticResource", "TestStaticResource.hx", "testBasics"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (15) )) )}));
			//line 16 "/shared/core/test/thx/TestStaticResource.hx"
			utest.Assert.isTrue(thx.ResourceTest.c, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestStaticResource", "TestStaticResource.hx", "testBasics"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (16) )) )}));
			//line 17 "/shared/core/test/thx/TestStaticResource.hx"
			utest.Assert.equals("haxe", thx.ResourceTest.d, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestStaticResource", "TestStaticResource.hx", "testBasics"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (17) )) )}));
			//line 18 "/shared/core/test/thx/TestStaticResource.hx"
			utest.Assert.equals("value", haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(thx.ResourceTest.fileJson, "some", true)), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestStaticResource", "TestStaticResource.hx", "testBasics"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (18) )) )}));
			//line 19 "/shared/core/test/thx/TestStaticResource.hx"
			utest.Assert.equals("some text\n", thx.ResourceTest.fileText, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestStaticResource", "TestStaticResource.hx", "testBasics"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (19) )) )}));
		}
		
	}
	
	
	public void testDir()
	{
		//line 23 "/shared/core/test/thx/TestStaticResource.hx"
		int _g1 = 0;
		//line 23 "/shared/core/test/thx/TestStaticResource.hx"
		int _g = this.x;
		//line 23 "/shared/core/test/thx/TestStaticResource.hx"
		while (( _g1 < _g ))
		{
			//line 23 "/shared/core/test/thx/TestStaticResource.hx"
			 ++ _g1;
			//line 24 "/shared/core/test/thx/TestStaticResource.hx"
			utest.Assert.equals("some text\n", thx.ResourceDir.text, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestStaticResource", "TestStaticResource.hx", "testDir"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (24) )) )}));
			//line 25 "/shared/core/test/thx/TestStaticResource.hx"
			utest.Assert.equals("value", haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(thx.ResourceDir.object, "some", true)), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestStaticResource", "TestStaticResource.hx", "testDir"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (25) )) )}));
		}
		
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 5 "/shared/core/test/thx/TestStaticResource.hx"
		{
			//line 5 "/shared/core/test/thx/TestStaticResource.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "/shared/core/test/thx/TestStaticResource.hx"
			switch (field.hashCode())
			{
				case 120:
				{
					//line 5 "/shared/core/test/thx/TestStaticResource.hx"
					if (field.equals("x")) 
					{
						//line 5 "/shared/core/test/thx/TestStaticResource.hx"
						__temp_executeDef1 = false;
						//line 5 "/shared/core/test/thx/TestStaticResource.hx"
						this.x = ((int) (value) );
						//line 5 "/shared/core/test/thx/TestStaticResource.hx"
						return value;
					}
					
					//line 5 "/shared/core/test/thx/TestStaticResource.hx"
					break;
				}
				
				
			}
			
			//line 5 "/shared/core/test/thx/TestStaticResource.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "/shared/core/test/thx/TestStaticResource.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 5 "/shared/core/test/thx/TestStaticResource.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 5 "/shared/core/test/thx/TestStaticResource.hx"
		{
			//line 5 "/shared/core/test/thx/TestStaticResource.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "/shared/core/test/thx/TestStaticResource.hx"
			switch (field.hashCode())
			{
				case 120:
				{
					//line 5 "/shared/core/test/thx/TestStaticResource.hx"
					if (field.equals("x")) 
					{
						//line 5 "/shared/core/test/thx/TestStaticResource.hx"
						__temp_executeDef1 = false;
						//line 5 "/shared/core/test/thx/TestStaticResource.hx"
						this.x = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 5 "/shared/core/test/thx/TestStaticResource.hx"
						return value;
					}
					
					//line 5 "/shared/core/test/thx/TestStaticResource.hx"
					break;
				}
				
				
			}
			
			//line 5 "/shared/core/test/thx/TestStaticResource.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "/shared/core/test/thx/TestStaticResource.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 5 "/shared/core/test/thx/TestStaticResource.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 5 "/shared/core/test/thx/TestStaticResource.hx"
		{
			//line 5 "/shared/core/test/thx/TestStaticResource.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "/shared/core/test/thx/TestStaticResource.hx"
			switch (field.hashCode())
			{
				case -1422481765:
				{
					//line 5 "/shared/core/test/thx/TestStaticResource.hx"
					if (field.equals("testDir")) 
					{
						//line 5 "/shared/core/test/thx/TestStaticResource.hx"
						__temp_executeDef1 = false;
						//line 5 "/shared/core/test/thx/TestStaticResource.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testDir")) );
					}
					
					//line 5 "/shared/core/test/thx/TestStaticResource.hx"
					break;
				}
				
				
				case 120:
				{
					//line 5 "/shared/core/test/thx/TestStaticResource.hx"
					if (field.equals("x")) 
					{
						//line 5 "/shared/core/test/thx/TestStaticResource.hx"
						__temp_executeDef1 = false;
						//line 5 "/shared/core/test/thx/TestStaticResource.hx"
						return this.x;
					}
					
					//line 5 "/shared/core/test/thx/TestStaticResource.hx"
					break;
				}
				
				
				case 1223535927:
				{
					//line 5 "/shared/core/test/thx/TestStaticResource.hx"
					if (field.equals("testBasics")) 
					{
						//line 5 "/shared/core/test/thx/TestStaticResource.hx"
						__temp_executeDef1 = false;
						//line 5 "/shared/core/test/thx/TestStaticResource.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testBasics")) );
					}
					
					//line 5 "/shared/core/test/thx/TestStaticResource.hx"
					break;
				}
				
				
			}
			
			//line 5 "/shared/core/test/thx/TestStaticResource.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "/shared/core/test/thx/TestStaticResource.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 5 "/shared/core/test/thx/TestStaticResource.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 5 "/shared/core/test/thx/TestStaticResource.hx"
		{
			//line 5 "/shared/core/test/thx/TestStaticResource.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "/shared/core/test/thx/TestStaticResource.hx"
			switch (field.hashCode())
			{
				case 120:
				{
					//line 5 "/shared/core/test/thx/TestStaticResource.hx"
					if (field.equals("x")) 
					{
						//line 5 "/shared/core/test/thx/TestStaticResource.hx"
						__temp_executeDef1 = false;
						//line 5 "/shared/core/test/thx/TestStaticResource.hx"
						return ((double) (this.x) );
					}
					
					//line 5 "/shared/core/test/thx/TestStaticResource.hx"
					break;
				}
				
				
			}
			
			//line 5 "/shared/core/test/thx/TestStaticResource.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "/shared/core/test/thx/TestStaticResource.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 5 "/shared/core/test/thx/TestStaticResource.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 5 "/shared/core/test/thx/TestStaticResource.hx"
		{
			//line 5 "/shared/core/test/thx/TestStaticResource.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "/shared/core/test/thx/TestStaticResource.hx"
			switch (field.hashCode())
			{
				case -1422481765:
				{
					//line 5 "/shared/core/test/thx/TestStaticResource.hx"
					if (field.equals("testDir")) 
					{
						//line 5 "/shared/core/test/thx/TestStaticResource.hx"
						__temp_executeDef1 = false;
						//line 5 "/shared/core/test/thx/TestStaticResource.hx"
						this.testDir();
					}
					
					//line 5 "/shared/core/test/thx/TestStaticResource.hx"
					break;
				}
				
				
				case 1223535927:
				{
					//line 5 "/shared/core/test/thx/TestStaticResource.hx"
					if (field.equals("testBasics")) 
					{
						//line 5 "/shared/core/test/thx/TestStaticResource.hx"
						__temp_executeDef1 = false;
						//line 5 "/shared/core/test/thx/TestStaticResource.hx"
						this.testBasics();
					}
					
					//line 5 "/shared/core/test/thx/TestStaticResource.hx"
					break;
				}
				
				
			}
			
			//line 5 "/shared/core/test/thx/TestStaticResource.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "/shared/core/test/thx/TestStaticResource.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 5 "/shared/core/test/thx/TestStaticResource.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 5 "/shared/core/test/thx/TestStaticResource.hx"
		baseArr.push("x");
		//line 5 "/shared/core/test/thx/TestStaticResource.hx"
		{
			//line 5 "/shared/core/test/thx/TestStaticResource.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


