// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TestError extends haxe.lang.HxObject
{
	public TestError(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public TestError()
	{
		//line 9 "/shared/core/thx/TestError.hx"
		thx.TestError.__hx_ctor_thx_TestError(this);
	}
	
	
	public static void __hx_ctor_thx_TestError(thx.TestError __temp_me179)
	{
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 8 "/shared/core/thx/TestError.hx"
		return new thx.TestError(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 8 "/shared/core/thx/TestError.hx"
		return new thx.TestError();
	}
	
	
	public void testAbstract()
	{
		//line 12 "/shared/core/thx/TestError.hx"
		thx.error.AbstractMethod error = new thx.error.AbstractMethod(((java.lang.Object) (new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestError", "TestError.hx", "testAbstract"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (12) )) )})) ));
		//line 14 "/shared/core/thx/TestError.hx"
		utest.Assert.notNull(error, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestError", "TestError.hx", "testAbstract"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (14) )) )}));
		//line 15 "/shared/core/thx/TestError.hx"
		utest.Assert.stringContains("TestError", error.message, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestError", "TestError.hx", "testAbstract"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (15) )) )}));
		//line 16 "/shared/core/thx/TestError.hx"
		utest.Assert.stringContains("testAbstract", error.message, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestError", "TestError.hx", "testAbstract"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (16) )) )}));
		//line 17 "/shared/core/thx/TestError.hx"
		utest.Assert.stringContains("is abstract", error.message, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestError", "TestError.hx", "testAbstract"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (17) )) )}));
	}
	
	
	public void testNotImplemented()
	{
		//line 21 "/shared/core/thx/TestError.hx"
		thx.error.NotImplemented error = new thx.error.NotImplemented(((java.lang.Object) (new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestError", "TestError.hx", "testNotImplemented"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (21) )) )})) ));
		//line 23 "/shared/core/thx/TestError.hx"
		utest.Assert.notNull(error, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestError", "TestError.hx", "testNotImplemented"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (23) )) )}));
		//line 24 "/shared/core/thx/TestError.hx"
		utest.Assert.stringContains("TestError", error.message, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestError", "TestError.hx", "testNotImplemented"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (24) )) )}));
		//line 25 "/shared/core/thx/TestError.hx"
		utest.Assert.stringContains("testNotImplemented", error.message, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestError", "TestError.hx", "testNotImplemented"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (25) )) )}));
		//line 26 "/shared/core/thx/TestError.hx"
		utest.Assert.stringContains("needs to be implemented", error.message, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestError", "TestError.hx", "testNotImplemented"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (26) )) )}));
	}
	
	
	public void testNullArgument()
	{
		//line 29 "/shared/core/thx/TestError.hx"
		thx.TestError _gthis = this;
		//line 30 "/shared/core/thx/TestError.hx"
		utest.Assert.raises(new thx.TestError_testNullArgument_30__Fun(_gthis), thx.error.NullArgument.class, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestError", "TestError.hx", "testNullArgument"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (30) )) )}));
		//line 31 "/shared/core/thx/TestError.hx"
		this.nullInt(1);
	}
	
	
	public void testNullArgumentUsing()
	{
		//line 34 "/shared/core/thx/TestError.hx"
		thx.TestError _gthis = this;
		//line 35 "/shared/core/thx/TestError.hx"
		utest.Assert.raises(new thx.TestError_testNullArgumentUsing_35__Fun(_gthis), thx.error.NullArgument.class, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestError", "TestError.hx", "testNullArgumentUsing"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (35) )) )}));
		//line 36 "/shared/core/thx/TestError.hx"
		this.nullUsingInt(1);
	}
	
	
	public void testEmptyArray()
	{
		//line 39 "/shared/core/thx/TestError.hx"
		thx.TestError _gthis = this;
		//line 40 "/shared/core/thx/TestError.hx"
		utest.Assert.raises(new thx.TestError_testEmptyArray_40__Fun(_gthis), thx.error.NullArgument.class, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestError", "TestError.hx", "testEmptyArray"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (40) )) )}));
		//line 41 "/shared/core/thx/TestError.hx"
		utest.Assert.raises(new thx.TestError_testEmptyArray_41__Fun(_gthis), thx.error.NullArgument.class, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestError", "TestError.hx", "testEmptyArray"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (41) )) )}));
		//line 42 "/shared/core/thx/TestError.hx"
		this.emptyArray(new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{1}));
	}
	
	
	public void testEmptyString()
	{
		//line 45 "/shared/core/thx/TestError.hx"
		thx.TestError _gthis = this;
		//line 46 "/shared/core/thx/TestError.hx"
		utest.Assert.raises(new thx.TestError_testEmptyString_46__Fun(_gthis), thx.error.NullArgument.class, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestError", "TestError.hx", "testEmptyString"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (46) )) )}));
		//line 47 "/shared/core/thx/TestError.hx"
		utest.Assert.raises(new thx.TestError_testEmptyString_47__Fun(_gthis), thx.error.NullArgument.class, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestError", "TestError.hx", "testEmptyString"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (47) )) )}));
		//line 48 "/shared/core/thx/TestError.hx"
		this.emptyString("a");
	}
	
	
	public void testEmptyIterator()
	{
		//line 51 "/shared/core/thx/TestError.hx"
		thx.TestError _gthis = this;
		//line 52 "/shared/core/thx/TestError.hx"
		haxe.root.IntIterator it = new haxe.root.IntIterator(0, 0);
		//line 53 "/shared/core/thx/TestError.hx"
		utest.Assert.raises(new thx.TestError_testEmptyIterator_53__Fun(_gthis), thx.error.NullArgument.class, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestError", "TestError.hx", "testEmptyIterator"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (53) )) )}));
		//line 54 "/shared/core/thx/TestError.hx"
		utest.Assert.raises(new thx.TestError_testEmptyIterator_54__Fun(it, _gthis), thx.error.NullArgument.class, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestError", "TestError.hx", "testEmptyIterator"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (54) )) )}));
		//line 55 "/shared/core/thx/TestError.hx"
		haxe.root.IntIterator it1 = new haxe.root.IntIterator(0, 4);
		//line 56 "/shared/core/thx/TestError.hx"
		this.emptyIterator(it1);
	}
	
	
	public void testEmptyIterable()
	{
		//line 59 "/shared/core/thx/TestError.hx"
		thx.TestError _gthis = this;
		//line 60 "/shared/core/thx/TestError.hx"
		java.lang.Object it = null;
		//line 60 "/shared/core/thx/TestError.hx"
		{
			//line 60 "/shared/core/thx/TestError.hx"
			haxe.lang.Function __temp_odecl1 = ( (( thx.TestError_testEmptyIterable_60__Fun.__hx_current != null )) ? (thx.TestError_testEmptyIterable_60__Fun.__hx_current) : (thx.TestError_testEmptyIterable_60__Fun.__hx_current = ((thx.TestError_testEmptyIterable_60__Fun) (new thx.TestError_testEmptyIterable_60__Fun()) )) );
			//line 60 "/shared/core/thx/TestError.hx"
			it = new haxe.lang.DynamicObject(new java.lang.String[]{"iterator"}, new java.lang.Object[]{__temp_odecl1}, new java.lang.String[]{}, new double[]{});
		}
		
		//line 61 "/shared/core/thx/TestError.hx"
		utest.Assert.raises(new thx.TestError_testEmptyIterable_61__Fun(_gthis), thx.error.NullArgument.class, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestError", "TestError.hx", "testEmptyIterable"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (61) )) )}));
		//line 62 "/shared/core/thx/TestError.hx"
		utest.Assert.raises(new thx.TestError_testEmptyIterable_62__Fun(it, _gthis), thx.error.NullArgument.class, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestError", "TestError.hx", "testEmptyIterable"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (62) )) )}));
		//line 63 "/shared/core/thx/TestError.hx"
		java.lang.Object it1 = null;
		//line 63 "/shared/core/thx/TestError.hx"
		{
			//line 63 "/shared/core/thx/TestError.hx"
			haxe.lang.Function __temp_odecl2 = ( (( thx.TestError_testEmptyIterable_63__Fun.__hx_current != null )) ? (thx.TestError_testEmptyIterable_63__Fun.__hx_current) : (thx.TestError_testEmptyIterable_63__Fun.__hx_current = ((thx.TestError_testEmptyIterable_63__Fun) (new thx.TestError_testEmptyIterable_63__Fun()) )) );
			//line 63 "/shared/core/thx/TestError.hx"
			it1 = new haxe.lang.DynamicObject(new java.lang.String[]{"iterator"}, new java.lang.Object[]{__temp_odecl2}, new java.lang.String[]{}, new double[]{});
		}
		
		//line 64 "/shared/core/thx/TestError.hx"
		this.emptyIterable(it1);
	}
	
	
	public void nullInt(java.lang.Object i)
	{
		//line 32 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/NullArgument.hx"
		if (( null == i )) 
		{
			//line 32 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/NullArgument.hx"
			throw haxe.lang.HaxeException.wrap(new thx.error.NullArgument("argument \"i\" cannot be null", new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestError", "NullArgument.hx", "nullInt"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (32) )) )})));
		}
		
	}
	
	
	public void nullUsingInt(java.lang.Object i)
	{
		//line 32 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/NullArgument.hx"
		if (( null == i )) 
		{
			//line 32 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/NullArgument.hx"
			throw haxe.lang.HaxeException.wrap(new thx.error.NullArgument("argument \"this\" cannot be null", new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestError", "NullArgument.hx", "nullUsingInt"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (32) )) )})));
		}
		
	}
	
	
	public void emptyArray(haxe.root.Array<java.lang.Object> arr)
	{
		//line 51 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/NullArgument.hx"
		if (( null == arr )) 
		{
			//line 52 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/NullArgument.hx"
			throw haxe.lang.HaxeException.wrap(new thx.error.NullArgument("Array argument \"this\" cannot be null", new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestError", "NullArgument.hx", "emptyArray"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (52) )) )})));
		}
		else
		{
			//line 53 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/NullArgument.hx"
			if (( arr.length == 0 )) 
			{
				//line 54 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/NullArgument.hx"
				throw haxe.lang.HaxeException.wrap(new thx.error.NullArgument("Array argument \"this\" cannot be empty", new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestError", "NullArgument.hx", "emptyArray"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (54) )) )})));
			}
			
		}
		
	}
	
	
	public void emptyString(java.lang.String s)
	{
		//line 57 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/NullArgument.hx"
		if (( null == s )) 
		{
			//line 58 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/NullArgument.hx"
			throw haxe.lang.HaxeException.wrap(new thx.error.NullArgument("String argument \"this\" cannot be null", new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestError", "NullArgument.hx", "emptyString"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (58) )) )})));
		}
		else
		{
			//line 59 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/NullArgument.hx"
			if (haxe.lang.Runtime.valEq(s, "")) 
			{
				//line 60 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/NullArgument.hx"
				throw haxe.lang.HaxeException.wrap(new thx.error.NullArgument("String argument \"this\" cannot be empty", new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestError", "NullArgument.hx", "emptyString"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (60) )) )})));
			}
			
		}
		
	}
	
	
	public void emptyIterator(java.lang.Object it)
	{
		//line 64 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/NullArgument.hx"
		if (( null == it )) 
		{
			//line 65 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/NullArgument.hx"
			throw haxe.lang.HaxeException.wrap(new thx.error.NullArgument("Iterator argument \"this\" cannot be null", new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestError", "NullArgument.hx", "emptyIterator"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (65) )) )})));
		}
		else
		{
			//line 66 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/NullArgument.hx"
			if ( ! (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(it, "hasNext", null))) ) 
			{
				//line 67 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/NullArgument.hx"
				throw haxe.lang.HaxeException.wrap(new thx.error.NullArgument("Iterator argument \"this\" cannot be empty", new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestError", "NullArgument.hx", "emptyIterator"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (67) )) )})));
			}
			
		}
		
	}
	
	
	public void emptyIterable(java.lang.Object it)
	{
		//line 72 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/NullArgument.hx"
		if (( null == it )) 
		{
			//line 73 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/NullArgument.hx"
			throw haxe.lang.HaxeException.wrap(new thx.error.NullArgument("Iterable argument \"this\" cannot be null", new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestError", "NullArgument.hx", "emptyIterable"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (73) )) )})));
		}
		else
		{
			//line 74 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/NullArgument.hx"
			if ( ! (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(((java.lang.Object) (haxe.lang.Runtime.callField(it, "iterator", null)) ), "hasNext", null))) ) 
			{
				//line 75 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/NullArgument.hx"
				throw haxe.lang.HaxeException.wrap(new thx.error.NullArgument("Iterable argument \"this\" cannot be empty", new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestError", "NullArgument.hx", "emptyIterable"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (75) )) )})));
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 8 "/shared/core/thx/TestError.hx"
		{
			//line 8 "/shared/core/thx/TestError.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "/shared/core/thx/TestError.hx"
			switch (field.hashCode())
			{
				case -1806102305:
				{
					//line 8 "/shared/core/thx/TestError.hx"
					if (field.equals("emptyIterable")) 
					{
						//line 8 "/shared/core/thx/TestError.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/thx/TestError.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "emptyIterable")) );
					}
					
					//line 8 "/shared/core/thx/TestError.hx"
					break;
				}
				
				
				case -1847728428:
				{
					//line 8 "/shared/core/thx/TestError.hx"
					if (field.equals("testAbstract")) 
					{
						//line 8 "/shared/core/thx/TestError.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/thx/TestError.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testAbstract")) );
					}
					
					//line 8 "/shared/core/thx/TestError.hx"
					break;
				}
				
				
				case -1806084901:
				{
					//line 8 "/shared/core/thx/TestError.hx"
					if (field.equals("emptyIterator")) 
					{
						//line 8 "/shared/core/thx/TestError.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/thx/TestError.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "emptyIterator")) );
					}
					
					//line 8 "/shared/core/thx/TestError.hx"
					break;
				}
				
				
				case 1912099169:
				{
					//line 8 "/shared/core/thx/TestError.hx"
					if (field.equals("testNotImplemented")) 
					{
						//line 8 "/shared/core/thx/TestError.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/thx/TestError.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testNotImplemented")) );
					}
					
					//line 8 "/shared/core/thx/TestError.hx"
					break;
				}
				
				
				case 1183114174:
				{
					//line 8 "/shared/core/thx/TestError.hx"
					if (field.equals("emptyString")) 
					{
						//line 8 "/shared/core/thx/TestError.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/thx/TestError.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "emptyString")) );
					}
					
					//line 8 "/shared/core/thx/TestError.hx"
					break;
				}
				
				
				case -649830634:
				{
					//line 8 "/shared/core/thx/TestError.hx"
					if (field.equals("testNullArgument")) 
					{
						//line 8 "/shared/core/thx/TestError.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/thx/TestError.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testNullArgument")) );
					}
					
					//line 8 "/shared/core/thx/TestError.hx"
					break;
				}
				
				
				case -1086896884:
				{
					//line 8 "/shared/core/thx/TestError.hx"
					if (field.equals("emptyArray")) 
					{
						//line 8 "/shared/core/thx/TestError.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/thx/TestError.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "emptyArray")) );
					}
					
					//line 8 "/shared/core/thx/TestError.hx"
					break;
				}
				
				
				case -1743959282:
				{
					//line 8 "/shared/core/thx/TestError.hx"
					if (field.equals("testNullArgumentUsing")) 
					{
						//line 8 "/shared/core/thx/TestError.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/thx/TestError.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testNullArgumentUsing")) );
					}
					
					//line 8 "/shared/core/thx/TestError.hx"
					break;
				}
				
				
				case -246368398:
				{
					//line 8 "/shared/core/thx/TestError.hx"
					if (field.equals("nullUsingInt")) 
					{
						//line 8 "/shared/core/thx/TestError.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/thx/TestError.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "nullUsingInt")) );
					}
					
					//line 8 "/shared/core/thx/TestError.hx"
					break;
				}
				
				
				case -1800906946:
				{
					//line 8 "/shared/core/thx/TestError.hx"
					if (field.equals("testEmptyArray")) 
					{
						//line 8 "/shared/core/thx/TestError.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/thx/TestError.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testEmptyArray")) );
					}
					
					//line 8 "/shared/core/thx/TestError.hx"
					break;
				}
				
				
				case -2001168152:
				{
					//line 8 "/shared/core/thx/TestError.hx"
					if (field.equals("nullInt")) 
					{
						//line 8 "/shared/core/thx/TestError.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/thx/TestError.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "nullInt")) );
					}
					
					//line 8 "/shared/core/thx/TestError.hx"
					break;
				}
				
				
				case 523638732:
				{
					//line 8 "/shared/core/thx/TestError.hx"
					if (field.equals("testEmptyString")) 
					{
						//line 8 "/shared/core/thx/TestError.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/thx/TestError.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testEmptyString")) );
					}
					
					//line 8 "/shared/core/thx/TestError.hx"
					break;
				}
				
				
				case 93157741:
				{
					//line 8 "/shared/core/thx/TestError.hx"
					if (field.equals("testEmptyIterable")) 
					{
						//line 8 "/shared/core/thx/TestError.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/thx/TestError.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testEmptyIterable")) );
					}
					
					//line 8 "/shared/core/thx/TestError.hx"
					break;
				}
				
				
				case 93175145:
				{
					//line 8 "/shared/core/thx/TestError.hx"
					if (field.equals("testEmptyIterator")) 
					{
						//line 8 "/shared/core/thx/TestError.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/thx/TestError.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testEmptyIterator")) );
					}
					
					//line 8 "/shared/core/thx/TestError.hx"
					break;
				}
				
				
			}
			
			//line 8 "/shared/core/thx/TestError.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "/shared/core/thx/TestError.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 8 "/shared/core/thx/TestError.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 8 "/shared/core/thx/TestError.hx"
		{
			//line 8 "/shared/core/thx/TestError.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "/shared/core/thx/TestError.hx"
			switch (field.hashCode())
			{
				case -1806102305:
				{
					//line 8 "/shared/core/thx/TestError.hx"
					if (field.equals("emptyIterable")) 
					{
						//line 8 "/shared/core/thx/TestError.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/thx/TestError.hx"
						this.emptyIterable(dynargs.__get(0));
					}
					
					//line 8 "/shared/core/thx/TestError.hx"
					break;
				}
				
				
				case -1847728428:
				{
					//line 8 "/shared/core/thx/TestError.hx"
					if (field.equals("testAbstract")) 
					{
						//line 8 "/shared/core/thx/TestError.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/thx/TestError.hx"
						this.testAbstract();
					}
					
					//line 8 "/shared/core/thx/TestError.hx"
					break;
				}
				
				
				case -1806084901:
				{
					//line 8 "/shared/core/thx/TestError.hx"
					if (field.equals("emptyIterator")) 
					{
						//line 8 "/shared/core/thx/TestError.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/thx/TestError.hx"
						this.emptyIterator(dynargs.__get(0));
					}
					
					//line 8 "/shared/core/thx/TestError.hx"
					break;
				}
				
				
				case 1912099169:
				{
					//line 8 "/shared/core/thx/TestError.hx"
					if (field.equals("testNotImplemented")) 
					{
						//line 8 "/shared/core/thx/TestError.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/thx/TestError.hx"
						this.testNotImplemented();
					}
					
					//line 8 "/shared/core/thx/TestError.hx"
					break;
				}
				
				
				case 1183114174:
				{
					//line 8 "/shared/core/thx/TestError.hx"
					if (field.equals("emptyString")) 
					{
						//line 8 "/shared/core/thx/TestError.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/thx/TestError.hx"
						this.emptyString(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 8 "/shared/core/thx/TestError.hx"
					break;
				}
				
				
				case -649830634:
				{
					//line 8 "/shared/core/thx/TestError.hx"
					if (field.equals("testNullArgument")) 
					{
						//line 8 "/shared/core/thx/TestError.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/thx/TestError.hx"
						this.testNullArgument();
					}
					
					//line 8 "/shared/core/thx/TestError.hx"
					break;
				}
				
				
				case -1086896884:
				{
					//line 8 "/shared/core/thx/TestError.hx"
					if (field.equals("emptyArray")) 
					{
						//line 8 "/shared/core/thx/TestError.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/thx/TestError.hx"
						this.emptyArray(((haxe.root.Array<java.lang.Object>) (dynargs.__get(0)) ));
					}
					
					//line 8 "/shared/core/thx/TestError.hx"
					break;
				}
				
				
				case -1743959282:
				{
					//line 8 "/shared/core/thx/TestError.hx"
					if (field.equals("testNullArgumentUsing")) 
					{
						//line 8 "/shared/core/thx/TestError.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/thx/TestError.hx"
						this.testNullArgumentUsing();
					}
					
					//line 8 "/shared/core/thx/TestError.hx"
					break;
				}
				
				
				case -246368398:
				{
					//line 8 "/shared/core/thx/TestError.hx"
					if (field.equals("nullUsingInt")) 
					{
						//line 8 "/shared/core/thx/TestError.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/thx/TestError.hx"
						this.nullUsingInt(dynargs.__get(0));
					}
					
					//line 8 "/shared/core/thx/TestError.hx"
					break;
				}
				
				
				case -1800906946:
				{
					//line 8 "/shared/core/thx/TestError.hx"
					if (field.equals("testEmptyArray")) 
					{
						//line 8 "/shared/core/thx/TestError.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/thx/TestError.hx"
						this.testEmptyArray();
					}
					
					//line 8 "/shared/core/thx/TestError.hx"
					break;
				}
				
				
				case -2001168152:
				{
					//line 8 "/shared/core/thx/TestError.hx"
					if (field.equals("nullInt")) 
					{
						//line 8 "/shared/core/thx/TestError.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/thx/TestError.hx"
						this.nullInt(dynargs.__get(0));
					}
					
					//line 8 "/shared/core/thx/TestError.hx"
					break;
				}
				
				
				case 523638732:
				{
					//line 8 "/shared/core/thx/TestError.hx"
					if (field.equals("testEmptyString")) 
					{
						//line 8 "/shared/core/thx/TestError.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/thx/TestError.hx"
						this.testEmptyString();
					}
					
					//line 8 "/shared/core/thx/TestError.hx"
					break;
				}
				
				
				case 93157741:
				{
					//line 8 "/shared/core/thx/TestError.hx"
					if (field.equals("testEmptyIterable")) 
					{
						//line 8 "/shared/core/thx/TestError.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/thx/TestError.hx"
						this.testEmptyIterable();
					}
					
					//line 8 "/shared/core/thx/TestError.hx"
					break;
				}
				
				
				case 93175145:
				{
					//line 8 "/shared/core/thx/TestError.hx"
					if (field.equals("testEmptyIterator")) 
					{
						//line 8 "/shared/core/thx/TestError.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/thx/TestError.hx"
						this.testEmptyIterator();
					}
					
					//line 8 "/shared/core/thx/TestError.hx"
					break;
				}
				
				
			}
			
			//line 8 "/shared/core/thx/TestError.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "/shared/core/thx/TestError.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 8 "/shared/core/thx/TestError.hx"
		return null;
	}
	
	
}


