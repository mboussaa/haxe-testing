// Generated by Haxe 3.3.0
package thx.promise;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TestFuture extends haxe.lang.HxObject
{
	public TestFuture(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public TestFuture()
	{
		//line 10 "/shared/promise/test/thx/promise/TestFuture.hx"
		thx.promise.TestFuture.__hx_ctor_thx_promise_TestFuture(this);
	}
	
	
	public static void __hx_ctor_thx_promise_TestFuture(thx.promise.TestFuture __temp_me130)
	{
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
		return new thx.promise.TestFuture(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
		return new thx.promise.TestFuture();
	}
	
	
	public void testThenBefore()
	{
		//line 13 "/shared/promise/test/thx/promise/TestFuture.hx"
		((thx.promise.Future<java.lang.Object>) (((thx.promise.Future) (thx.promise.Future.value(((java.lang.Object) (1) ))) )) ).then(( (( thx.promise.TestFuture_testThenBefore_13__Fun.__hx_current != null )) ? (thx.promise.TestFuture_testThenBefore_13__Fun.__hx_current) : (thx.promise.TestFuture_testThenBefore_13__Fun.__hx_current = ((thx.promise.TestFuture_testThenBefore_13__Fun) (new thx.promise.TestFuture_testThenBefore_13__Fun()) )) ));
	}
	
	
	public void testMap()
	{
		//line 48 "/shared/promise/test/thx/promise/TestFuture.hx"
		((thx.promise.Future<java.lang.String>) (((thx.promise.Future) (((thx.promise.Future<java.lang.Object>) (((thx.promise.Future) (thx.promise.Future.value(((java.lang.Object) (1) ))) )) ).map(((haxe.lang.Function) (( (( thx.promise.TestFuture_testMap_49__Fun.__hx_current != null )) ? (thx.promise.TestFuture_testMap_49__Fun.__hx_current) : (thx.promise.TestFuture_testMap_49__Fun.__hx_current = ((thx.promise.TestFuture_testMap_49__Fun) (new thx.promise.TestFuture_testMap_49__Fun()) )) )) ))) )) ).then(( (( thx.promise.TestFuture_testMap_50__Fun.__hx_current != null )) ? (thx.promise.TestFuture_testMap_50__Fun.__hx_current) : (thx.promise.TestFuture_testMap_50__Fun.__hx_current = ((thx.promise.TestFuture_testMap_50__Fun) (new thx.promise.TestFuture_testMap_50__Fun()) )) ));
	}
	
	
	public void testMapAsync()
	{
		//line 54 "/shared/promise/test/thx/promise/TestFuture.hx"
		((thx.promise.Future<java.lang.String>) (((thx.promise.Future) (((thx.promise.Future<java.lang.Object>) (((thx.promise.Future) (thx.promise.Future.value(((java.lang.Object) (1) ))) )) ).mapAsync(((haxe.lang.Function) (( (( thx.promise.TestFuture_testMapAsync_55__Fun.__hx_current != null )) ? (thx.promise.TestFuture_testMapAsync_55__Fun.__hx_current) : (thx.promise.TestFuture_testMapAsync_55__Fun.__hx_current = ((thx.promise.TestFuture_testMapAsync_55__Fun) (new thx.promise.TestFuture_testMapAsync_55__Fun()) )) )) ))) )) ).then(( (( thx.promise.TestFuture_testMapAsync_56__Fun.__hx_current != null )) ? (thx.promise.TestFuture_testMapAsync_56__Fun.__hx_current) : (thx.promise.TestFuture_testMapAsync_56__Fun.__hx_current = ((thx.promise.TestFuture_testMapAsync_56__Fun) (new thx.promise.TestFuture_testMapAsync_56__Fun()) )) ));
	}
	
	
	public void testFlatten()
	{
		//line 60 "/shared/promise/test/thx/promise/TestFuture.hx"
		thx.promise.Future<thx.promise.Future<java.lang.Object>> future = ((thx.promise.Future<thx.promise.Future<java.lang.Object>>) (thx.promise.Future.value(((thx.promise.Future<java.lang.Object>) (((thx.promise.Future) (thx.promise.Future.value(((java.lang.Object) (1) ))) )) ))) );
		//line 60 "/shared/promise/test/thx/promise/TestFuture.hx"
		((thx.promise.Future<java.lang.Object>) (((thx.promise.Future) (thx.promise.Future.create(((haxe.lang.Function) (new thx.promise.TestFuture_testFlatten_60__Fun(future)) ))) )) ).then(( (( thx.promise.TestFuture_testFlatten_62__Fun.__hx_current != null )) ? (thx.promise.TestFuture_testFlatten_62__Fun.__hx_current) : (thx.promise.TestFuture_testFlatten_62__Fun.__hx_current = ((thx.promise.TestFuture_testFlatten_62__Fun) (new thx.promise.TestFuture_testFlatten_62__Fun()) )) ));
	}
	
	
	public void testFlatMap()
	{
		//line 66 "/shared/promise/test/thx/promise/TestFuture.hx"
		((thx.promise.Future<java.lang.String>) (((thx.promise.Future) (((thx.promise.Future<java.lang.Object>) (((thx.promise.Future) (thx.promise.Future.value(((java.lang.Object) (1) ))) )) ).flatMap(((haxe.lang.Function) (( (( thx.promise.TestFuture_testFlatMap_67__Fun.__hx_current != null )) ? (thx.promise.TestFuture_testFlatMap_67__Fun.__hx_current) : (thx.promise.TestFuture_testFlatMap_67__Fun.__hx_current = ((thx.promise.TestFuture_testFlatMap_67__Fun) (new thx.promise.TestFuture_testFlatMap_67__Fun()) )) )) ))) )) ).then(( (( thx.promise.TestFuture_testFlatMap_68__Fun.__hx_current != null )) ? (thx.promise.TestFuture_testFlatMap_68__Fun.__hx_current) : (thx.promise.TestFuture_testFlatMap_68__Fun.__hx_current = ((thx.promise.TestFuture_testFlatMap_68__Fun) (new thx.promise.TestFuture_testFlatMap_68__Fun()) )) ));
	}
	
	
	public void testTuple3()
	{
		//line 95 "/shared/promise/test/thx/promise/TestFuture.hx"
		haxe.lang.Function done = ((haxe.lang.Function) (utest.Assert.createAsync.__hx_invoke2_o(0.0, null, 0.0, null)) );
		//line 97 "/shared/promise/test/thx/promise/TestFuture.hx"
		java.lang.Object this1 = new haxe.lang.DynamicObject(new java.lang.String[]{"_1"}, new java.lang.Object[]{"a"}, new java.lang.String[]{"_0", "_2"}, new double[]{((double) (((double) (1) )) ), ((double) (0.2) )});
		//line 96 "/shared/promise/test/thx/promise/TestFuture.hx"
		thx.promise.FutureTuple3.tuple(((thx.promise.Future<java.lang.Object>) (thx.promise.Future.value(((java.lang.Object) (this1) ))) ), ((haxe.lang.Function) (new thx.promise.TestFuture_testTuple3_98__Fun(done)) ));
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
		{
			//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
			boolean __temp_executeDef1 = true;
			//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
			switch (field.hashCode())
			{
				case 1757244573:
				{
					//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
					if (field.equals("testTuple3")) 
					{
						//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
						__temp_executeDef1 = false;
						//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testTuple3")) );
					}
					
					//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
					break;
				}
				
				
				case -274152914:
				{
					//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
					if (field.equals("testThenBefore")) 
					{
						//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
						__temp_executeDef1 = false;
						//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testThenBefore")) );
					}
					
					//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
					break;
				}
				
				
				case -1171441103:
				{
					//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
					if (field.equals("testFlatMap")) 
					{
						//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
						__temp_executeDef1 = false;
						//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testFlatMap")) );
					}
					
					//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
					break;
				}
				
				
				case -1422473366:
				{
					//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
					if (field.equals("testMap")) 
					{
						//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
						__temp_executeDef1 = false;
						//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testMap")) );
					}
					
					//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
					break;
				}
				
				
				case -1171403502:
				{
					//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
					if (field.equals("testFlatten")) 
					{
						//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
						__temp_executeDef1 = false;
						//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testFlatten")) );
					}
					
					//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
					break;
				}
				
				
				case 865688882:
				{
					//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
					if (field.equals("testMapAsync")) 
					{
						//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
						__temp_executeDef1 = false;
						//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testMapAsync")) );
					}
					
					//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
					break;
				}
				
				
			}
			
			//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
			if (__temp_executeDef1) 
			{
				//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
		{
			//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
			boolean __temp_executeDef1 = true;
			//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
			switch (field.hashCode())
			{
				case 1757244573:
				{
					//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
					if (field.equals("testTuple3")) 
					{
						//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
						__temp_executeDef1 = false;
						//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
						this.testTuple3();
					}
					
					//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
					break;
				}
				
				
				case -274152914:
				{
					//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
					if (field.equals("testThenBefore")) 
					{
						//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
						__temp_executeDef1 = false;
						//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
						this.testThenBefore();
					}
					
					//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
					break;
				}
				
				
				case -1171441103:
				{
					//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
					if (field.equals("testFlatMap")) 
					{
						//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
						__temp_executeDef1 = false;
						//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
						this.testFlatMap();
					}
					
					//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
					break;
				}
				
				
				case -1422473366:
				{
					//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
					if (field.equals("testMap")) 
					{
						//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
						__temp_executeDef1 = false;
						//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
						this.testMap();
					}
					
					//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
					break;
				}
				
				
				case -1171403502:
				{
					//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
					if (field.equals("testFlatten")) 
					{
						//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
						__temp_executeDef1 = false;
						//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
						this.testFlatten();
					}
					
					//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
					break;
				}
				
				
				case 865688882:
				{
					//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
					if (field.equals("testMapAsync")) 
					{
						//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
						__temp_executeDef1 = false;
						//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
						this.testMapAsync();
					}
					
					//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
					break;
				}
				
				
			}
			
			//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
			if (__temp_executeDef1) 
			{
				//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 9 "/shared/promise/test/thx/promise/TestFuture.hx"
		return null;
	}
	
	
}

