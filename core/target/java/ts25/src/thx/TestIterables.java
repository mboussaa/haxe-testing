// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TestIterables extends haxe.lang.HxObject
{
	public TestIterables(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public TestIterables(int i)
	{
		//line 10 "/shared/core/test/thx/TestIterables.hx"
		thx.TestIterables.__hx_ctor_thx_TestIterables(this, i);
	}
	
	
	public static void __hx_ctor_thx_TestIterables(thx.TestIterables __temp_me111, int i)
	{
		//line 11 "/shared/core/test/thx/TestIterables.hx"
		__temp_me111.x = i;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 8 "/shared/core/test/thx/TestIterables.hx"
		return new thx.TestIterables(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 8 "/shared/core/test/thx/TestIterables.hx"
		return new thx.TestIterables(((int) (haxe.lang.Runtime.toInt(arr.__get(0))) ));
	}
	
	
	public int x;
	
	public void testMin()
	{
		//line 15 "/shared/core/test/thx/TestIterables.hx"
		int _g1 = 0;
		//line 15 "/shared/core/test/thx/TestIterables.hx"
		int _g = this.x;
		//line 15 "/shared/core/test/thx/TestIterables.hx"
		while (( _g1 < _g ))
		{
			//line 15 "/shared/core/test/thx/TestIterables.hx"
			 ++ _g1;
			//line 16 "/shared/core/test/thx/TestIterables.hx"
			haxe.root.Array<java.lang.Object> a = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{3, 1, 2});
			//line 18 "/shared/core/test/thx/TestIterables.hx"
			utest.Assert.same(haxe.ds.Option.Some(1), ((haxe.ds.Option) (thx.Iterables.minBy(((java.lang.Object) (a) ), ((haxe.lang.Function) (new haxe.lang.Closure(thx.Functions.class, "identity")) ), ((haxe.lang.Function) (thx.Ints.order) ))) ), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestIterables", "TestIterables.hx", "testMin"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (18) )) )}));
			//line 19 "/shared/core/test/thx/TestIterables.hx"
			utest.Assert.same(haxe.ds.Option.None, ((haxe.ds.Option) (thx.Iterables.minBy(((java.lang.Object) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ), ((haxe.lang.Function) (new haxe.lang.Closure(thx.Functions.class, "identity")) ), ((haxe.lang.Function) (thx.Ints.order) ))) ), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestIterables", "TestIterables.hx", "testMin"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (19) )) )}));
		}
		
	}
	
	
	public void testMinBy()
	{
		//line 23 "/shared/core/test/thx/TestIterables.hx"
		int _g1 = 0;
		//line 23 "/shared/core/test/thx/TestIterables.hx"
		int _g = this.x;
		//line 23 "/shared/core/test/thx/TestIterables.hx"
		while (( _g1 < _g ))
		{
			//line 23 "/shared/core/test/thx/TestIterables.hx"
			 ++ _g1;
			//line 24 "/shared/core/test/thx/TestIterables.hx"
			haxe.root.Array<java.lang.Object> a = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{new haxe.lang.DynamicObject(new java.lang.String[]{}, new java.lang.Object[]{}, new java.lang.String[]{"a"}, new double[]{((double) (((double) (3) )) )}), new haxe.lang.DynamicObject(new java.lang.String[]{}, new java.lang.Object[]{}, new java.lang.String[]{"a"}, new double[]{((double) (((double) (1) )) )}), new haxe.lang.DynamicObject(new java.lang.String[]{}, new java.lang.Object[]{}, new java.lang.String[]{"a"}, new double[]{((double) (((double) (2) )) )})});
			//line 26 "/shared/core/test/thx/TestIterables.hx"
			utest.Assert.same(haxe.ds.Option.Some(new haxe.lang.DynamicObject(new java.lang.String[]{}, new java.lang.Object[]{}, new java.lang.String[]{"a"}, new double[]{((double) (((double) (1) )) )})), ((haxe.ds.Option) (thx.Iterables.minBy(((java.lang.Object) (a) ), ((haxe.lang.Function) (( (( thx.TestIterables_testMinBy_26__Fun.__hx_current != null )) ? (thx.TestIterables_testMinBy_26__Fun.__hx_current) : (thx.TestIterables_testMinBy_26__Fun.__hx_current = ((thx.TestIterables_testMinBy_26__Fun) (new thx.TestIterables_testMinBy_26__Fun()) )) )) ), ((haxe.lang.Function) (thx.Ints.order) ))) ), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestIterables", "TestIterables.hx", "testMinBy"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (26) )) )}));
			//line 27 "/shared/core/test/thx/TestIterables.hx"
			utest.Assert.same(haxe.ds.Option.None, ((haxe.ds.Option) (thx.Iterables.minBy(((java.lang.Object) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ), ((haxe.lang.Function) (( (( thx.TestIterables_testMinBy_27__Fun.__hx_current != null )) ? (thx.TestIterables_testMinBy_27__Fun.__hx_current) : (thx.TestIterables_testMinBy_27__Fun.__hx_current = ((thx.TestIterables_testMinBy_27__Fun) (new thx.TestIterables_testMinBy_27__Fun()) )) )) ), ((haxe.lang.Function) (thx.Ints.order) ))) ), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestIterables", "TestIterables.hx", "testMinBy"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (27) )) )}));
		}
		
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 8 "/shared/core/test/thx/TestIterables.hx"
		{
			//line 8 "/shared/core/test/thx/TestIterables.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "/shared/core/test/thx/TestIterables.hx"
			switch (field.hashCode())
			{
				case 120:
				{
					//line 8 "/shared/core/test/thx/TestIterables.hx"
					if (field.equals("x")) 
					{
						//line 8 "/shared/core/test/thx/TestIterables.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/test/thx/TestIterables.hx"
						this.x = ((int) (value) );
						//line 8 "/shared/core/test/thx/TestIterables.hx"
						return value;
					}
					
					//line 8 "/shared/core/test/thx/TestIterables.hx"
					break;
				}
				
				
			}
			
			//line 8 "/shared/core/test/thx/TestIterables.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "/shared/core/test/thx/TestIterables.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 8 "/shared/core/test/thx/TestIterables.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 8 "/shared/core/test/thx/TestIterables.hx"
		{
			//line 8 "/shared/core/test/thx/TestIterables.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "/shared/core/test/thx/TestIterables.hx"
			switch (field.hashCode())
			{
				case 120:
				{
					//line 8 "/shared/core/test/thx/TestIterables.hx"
					if (field.equals("x")) 
					{
						//line 8 "/shared/core/test/thx/TestIterables.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/test/thx/TestIterables.hx"
						this.x = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 8 "/shared/core/test/thx/TestIterables.hx"
						return value;
					}
					
					//line 8 "/shared/core/test/thx/TestIterables.hx"
					break;
				}
				
				
			}
			
			//line 8 "/shared/core/test/thx/TestIterables.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "/shared/core/test/thx/TestIterables.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 8 "/shared/core/test/thx/TestIterables.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 8 "/shared/core/test/thx/TestIterables.hx"
		{
			//line 8 "/shared/core/test/thx/TestIterables.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "/shared/core/test/thx/TestIterables.hx"
			switch (field.hashCode())
			{
				case -1197066025:
				{
					//line 8 "/shared/core/test/thx/TestIterables.hx"
					if (field.equals("testMinBy")) 
					{
						//line 8 "/shared/core/test/thx/TestIterables.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/test/thx/TestIterables.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testMinBy")) );
					}
					
					//line 8 "/shared/core/test/thx/TestIterables.hx"
					break;
				}
				
				
				case 120:
				{
					//line 8 "/shared/core/test/thx/TestIterables.hx"
					if (field.equals("x")) 
					{
						//line 8 "/shared/core/test/thx/TestIterables.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/test/thx/TestIterables.hx"
						return this.x;
					}
					
					//line 8 "/shared/core/test/thx/TestIterables.hx"
					break;
				}
				
				
				case -1422473120:
				{
					//line 8 "/shared/core/test/thx/TestIterables.hx"
					if (field.equals("testMin")) 
					{
						//line 8 "/shared/core/test/thx/TestIterables.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/test/thx/TestIterables.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testMin")) );
					}
					
					//line 8 "/shared/core/test/thx/TestIterables.hx"
					break;
				}
				
				
			}
			
			//line 8 "/shared/core/test/thx/TestIterables.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "/shared/core/test/thx/TestIterables.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 8 "/shared/core/test/thx/TestIterables.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 8 "/shared/core/test/thx/TestIterables.hx"
		{
			//line 8 "/shared/core/test/thx/TestIterables.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "/shared/core/test/thx/TestIterables.hx"
			switch (field.hashCode())
			{
				case 120:
				{
					//line 8 "/shared/core/test/thx/TestIterables.hx"
					if (field.equals("x")) 
					{
						//line 8 "/shared/core/test/thx/TestIterables.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/test/thx/TestIterables.hx"
						return ((double) (this.x) );
					}
					
					//line 8 "/shared/core/test/thx/TestIterables.hx"
					break;
				}
				
				
			}
			
			//line 8 "/shared/core/test/thx/TestIterables.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "/shared/core/test/thx/TestIterables.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 8 "/shared/core/test/thx/TestIterables.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 8 "/shared/core/test/thx/TestIterables.hx"
		{
			//line 8 "/shared/core/test/thx/TestIterables.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "/shared/core/test/thx/TestIterables.hx"
			switch (field.hashCode())
			{
				case -1197066025:
				{
					//line 8 "/shared/core/test/thx/TestIterables.hx"
					if (field.equals("testMinBy")) 
					{
						//line 8 "/shared/core/test/thx/TestIterables.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/test/thx/TestIterables.hx"
						this.testMinBy();
					}
					
					//line 8 "/shared/core/test/thx/TestIterables.hx"
					break;
				}
				
				
				case -1422473120:
				{
					//line 8 "/shared/core/test/thx/TestIterables.hx"
					if (field.equals("testMin")) 
					{
						//line 8 "/shared/core/test/thx/TestIterables.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/test/thx/TestIterables.hx"
						this.testMin();
					}
					
					//line 8 "/shared/core/test/thx/TestIterables.hx"
					break;
				}
				
				
			}
			
			//line 8 "/shared/core/test/thx/TestIterables.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "/shared/core/test/thx/TestIterables.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 8 "/shared/core/test/thx/TestIterables.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 8 "/shared/core/test/thx/TestIterables.hx"
		baseArr.push("x");
		//line 8 "/shared/core/test/thx/TestIterables.hx"
		{
			//line 8 "/shared/core/test/thx/TestIterables.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}

