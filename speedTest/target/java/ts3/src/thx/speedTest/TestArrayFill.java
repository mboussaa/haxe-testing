// Generated by Haxe 3.3.0
package thx.speedTest;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TestArrayFill extends haxe.lang.HxObject
{
	public TestArrayFill(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public TestArrayFill(int i)
	{
		//line 7 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
		thx.speedTest.TestArrayFill.__hx_ctor_thx_speedTest_TestArrayFill(this, i);
	}
	
	
	public static void __hx_ctor_thx_speedTest_TestArrayFill(thx.speedTest.TestArrayFill __temp_me32, int i)
	{
		//line 8 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
		__temp_me32.x = i;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
		return new thx.speedTest.TestArrayFill(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
		return new thx.speedTest.TestArrayFill(((int) (haxe.lang.Runtime.toInt(arr.__get(0))) ));
	}
	
	
	public int x;
	
	public void testInitialisation()
	{
		//line 12 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
		haxe.root.Array<java.lang.Object> x = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{});
		//line 19 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
		{
			//line 19 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
			int _g = 0;
			//line 19 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
			while (( _g < 10000000 ))
			{
				//line 19 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
				int i = _g++;
				//line 20 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
				x.__set(i, 0);
			}
			
		}
		
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
		{
			//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
			switch (field.hashCode())
			{
				case 120:
				{
					//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
					if (field.equals("x")) 
					{
						//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
						__temp_executeDef1 = false;
						//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
						this.x = ((int) (value) );
						//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
						return value;
					}
					
					//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
					break;
				}
				
				
			}
			
			//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
		{
			//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
			switch (field.hashCode())
			{
				case 120:
				{
					//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
					if (field.equals("x")) 
					{
						//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
						__temp_executeDef1 = false;
						//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
						this.x = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
						return value;
					}
					
					//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
					break;
				}
				
				
			}
			
			//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
		{
			//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
			switch (field.hashCode())
			{
				case 610284921:
				{
					//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
					if (field.equals("testInitialisation")) 
					{
						//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
						__temp_executeDef1 = false;
						//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testInitialisation")) );
					}
					
					//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
					break;
				}
				
				
				case 120:
				{
					//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
					if (field.equals("x")) 
					{
						//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
						__temp_executeDef1 = false;
						//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
						return this.x;
					}
					
					//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
					break;
				}
				
				
			}
			
			//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
		{
			//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
			switch (field.hashCode())
			{
				case 120:
				{
					//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
					if (field.equals("x")) 
					{
						//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
						__temp_executeDef1 = false;
						//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
						return ((double) (this.x) );
					}
					
					//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
					break;
				}
				
				
			}
			
			//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
		{
			//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
			switch (field.hashCode())
			{
				case 610284921:
				{
					//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
					if (field.equals("testInitialisation")) 
					{
						//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
						__temp_executeDef1 = false;
						//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
						this.testInitialisation();
					}
					
					//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
					break;
				}
				
				
			}
			
			//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
		baseArr.push("x");
		//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
		{
			//line 5 "/shared/speedTest/test/thx/speedTest/TestArrayFill.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


