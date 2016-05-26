// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TestAnonymousMap extends haxe.lang.HxObject
{
	public TestAnonymousMap(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public TestAnonymousMap()
	{
		//line 15 "/shared/core/thx/TestAnonymousMap.hx"
		thx.TestAnonymousMap.__hx_ctor_thx_TestAnonymousMap(this);
	}
	
	
	public static void __hx_ctor_thx_TestAnonymousMap(thx.TestAnonymousMap __temp_me157)
	{
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 14 "/shared/core/thx/TestAnonymousMap.hx"
		return new thx.TestAnonymousMap(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 14 "/shared/core/thx/TestAnonymousMap.hx"
		return new thx.TestAnonymousMap();
	}
	
	
	public void testFeatures()
	{
		//line 18 "/shared/core/thx/TestAnonymousMap.hx"
		thx.AnonymousMap map = new thx.AnonymousMap(((java.lang.Object) (new haxe.lang.DynamicObject(new java.lang.String[]{"name", "type"}, new java.lang.Object[]{"thx", "library"}, new java.lang.String[]{}, new double[]{})) ));
		//line 19 "/shared/core/thx/TestAnonymousMap.hx"
		utest.Assert.equals("thx", map.get("name"), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestAnonymousMap", "TestAnonymousMap.hx", "testFeatures"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (19) )) )}));
		//line 20 "/shared/core/thx/TestAnonymousMap.hx"
		utest.Assert.isTrue(map.exists("type"), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestAnonymousMap", "TestAnonymousMap.hx", "testFeatures"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (20) )) )}));
		//line 21 "/shared/core/thx/TestAnonymousMap.hx"
		map.remove("type");
		//line 22 "/shared/core/thx/TestAnonymousMap.hx"
		utest.Assert.isFalse(map.exists("type"), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestAnonymousMap", "TestAnonymousMap.hx", "testFeatures"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (22) )) )}));
		//line 23 "/shared/core/thx/TestAnonymousMap.hx"
		utest.Assert.same(new haxe.root.Array(new java.lang.Object[]{"name"}), ((haxe.root.Array<java.lang.String>) (((haxe.root.Array) (thx.Iterators.toArray(((java.lang.Object) (map.keys()) ))) )) ), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestAnonymousMap", "TestAnonymousMap.hx", "testFeatures"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (23) )) )}));
		//line 24 "/shared/core/thx/TestAnonymousMap.hx"
		utest.Assert.same(new haxe.root.Array(new java.lang.Object[]{"thx"}), ((haxe.root.Array<java.lang.Object>) (thx.Iterators.toArray(((java.lang.Object) (map.iterator()) ))) ), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestAnonymousMap", "TestAnonymousMap.hx", "testFeatures"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (24) )) )}));
	}
	
	
	public void testGetOption()
	{
		//line 28 "/shared/core/thx/TestAnonymousMap.hx"
		thx.AnonymousMap map = new thx.AnonymousMap(((java.lang.Object) (new haxe.lang.DynamicObject(new java.lang.String[]{}, new java.lang.Object[]{}, new java.lang.String[]{"key1"}, new double[]{((double) (((double) (1) )) )})) ));
		//line 30 "/shared/core/thx/TestAnonymousMap.hx"
		utest.Assert.same(((java.lang.Object) (thx.Options.get(((haxe.ds.Option) (map.getOption("key1")) ))) ), 1, null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestAnonymousMap", "TestAnonymousMap.hx", "testGetOption"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (30) )) )}));
		//line 31 "/shared/core/thx/TestAnonymousMap.hx"
		utest.Assert.same(((boolean) (thx.Options.toBool(((haxe.ds.Option) (map.getOption("key2")) ))) ), false, null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestAnonymousMap", "TestAnonymousMap.hx", "testGetOption"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (31) )) )}));
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 14 "/shared/core/thx/TestAnonymousMap.hx"
		{
			//line 14 "/shared/core/thx/TestAnonymousMap.hx"
			boolean __temp_executeDef1 = true;
			//line 14 "/shared/core/thx/TestAnonymousMap.hx"
			switch (field.hashCode())
			{
				case 1355582201:
				{
					//line 14 "/shared/core/thx/TestAnonymousMap.hx"
					if (field.equals("testGetOption")) 
					{
						//line 14 "/shared/core/thx/TestAnonymousMap.hx"
						__temp_executeDef1 = false;
						//line 14 "/shared/core/thx/TestAnonymousMap.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testGetOption")) );
					}
					
					//line 14 "/shared/core/thx/TestAnonymousMap.hx"
					break;
				}
				
				
				case 423680751:
				{
					//line 14 "/shared/core/thx/TestAnonymousMap.hx"
					if (field.equals("testFeatures")) 
					{
						//line 14 "/shared/core/thx/TestAnonymousMap.hx"
						__temp_executeDef1 = false;
						//line 14 "/shared/core/thx/TestAnonymousMap.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testFeatures")) );
					}
					
					//line 14 "/shared/core/thx/TestAnonymousMap.hx"
					break;
				}
				
				
			}
			
			//line 14 "/shared/core/thx/TestAnonymousMap.hx"
			if (__temp_executeDef1) 
			{
				//line 14 "/shared/core/thx/TestAnonymousMap.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 14 "/shared/core/thx/TestAnonymousMap.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 14 "/shared/core/thx/TestAnonymousMap.hx"
		{
			//line 14 "/shared/core/thx/TestAnonymousMap.hx"
			boolean __temp_executeDef1 = true;
			//line 14 "/shared/core/thx/TestAnonymousMap.hx"
			switch (field.hashCode())
			{
				case 1355582201:
				{
					//line 14 "/shared/core/thx/TestAnonymousMap.hx"
					if (field.equals("testGetOption")) 
					{
						//line 14 "/shared/core/thx/TestAnonymousMap.hx"
						__temp_executeDef1 = false;
						//line 14 "/shared/core/thx/TestAnonymousMap.hx"
						this.testGetOption();
					}
					
					//line 14 "/shared/core/thx/TestAnonymousMap.hx"
					break;
				}
				
				
				case 423680751:
				{
					//line 14 "/shared/core/thx/TestAnonymousMap.hx"
					if (field.equals("testFeatures")) 
					{
						//line 14 "/shared/core/thx/TestAnonymousMap.hx"
						__temp_executeDef1 = false;
						//line 14 "/shared/core/thx/TestAnonymousMap.hx"
						this.testFeatures();
					}
					
					//line 14 "/shared/core/thx/TestAnonymousMap.hx"
					break;
				}
				
				
			}
			
			//line 14 "/shared/core/thx/TestAnonymousMap.hx"
			if (__temp_executeDef1) 
			{
				//line 14 "/shared/core/thx/TestAnonymousMap.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 14 "/shared/core/thx/TestAnonymousMap.hx"
		return null;
	}
	
	
}


