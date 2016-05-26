// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TestQueryString extends haxe.lang.HxObject
{
	public TestQueryString(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public TestQueryString()
	{
		//line 7 "/shared/core/thx/TestQueryString.hx"
		thx.TestQueryString.__hx_ctor_thx_TestQueryString(this);
	}
	
	
	public static void __hx_ctor_thx_TestQueryString(thx.TestQueryString __temp_me197)
	{
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 6 "/shared/core/thx/TestQueryString.hx"
		return new thx.TestQueryString(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 6 "/shared/core/thx/TestQueryString.hx"
		return new thx.TestQueryString();
	}
	
	
	public void testBasics()
	{
		//line 10 "/shared/core/thx/TestQueryString.hx"
		utest.Assert.same(new haxe.lang.DynamicObject(new java.lang.String[]{"foo"}, new java.lang.Object[]{"bar"}, new java.lang.String[]{}, new double[]{}), thx._QueryString.QueryString_Impl_.toObject(thx._QueryString.QueryString_Impl_.parseWithSymbols("?foo=bar", thx._QueryString.QueryString_Impl_.separator, thx._QueryString.QueryString_Impl_.assignment, thx._QueryString.QueryString_Impl_.decodeURIComponent)), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestQueryString", "TestQueryString.hx", "testBasics"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (10) )) )}));
		//line 15 "/shared/core/thx/TestQueryString.hx"
		utest.Assert.same(new haxe.lang.DynamicObject(new java.lang.String[]{"foo"}, new java.lang.Object[]{"bar"}, new java.lang.String[]{}, new double[]{}), thx._QueryString.QueryString_Impl_.toObject(thx._QueryString.QueryString_Impl_.parseWithSymbols("#foo=bar", thx._QueryString.QueryString_Impl_.separator, thx._QueryString.QueryString_Impl_.assignment, thx._QueryString.QueryString_Impl_.decodeURIComponent)), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestQueryString", "TestQueryString.hx", "testBasics"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (15) )) )}));
		//line 20 "/shared/core/thx/TestQueryString.hx"
		utest.Assert.same(new haxe.lang.DynamicObject(new java.lang.String[]{"foo"}, new java.lang.Object[]{"bar"}, new java.lang.String[]{}, new double[]{}), thx._QueryString.QueryString_Impl_.toObject(thx._QueryString.QueryString_Impl_.parseWithSymbols("foo=bar", thx._QueryString.QueryString_Impl_.separator, thx._QueryString.QueryString_Impl_.assignment, thx._QueryString.QueryString_Impl_.decodeURIComponent)), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestQueryString", "TestQueryString.hx", "testBasics"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (20) )) )}));
		//line 25 "/shared/core/thx/TestQueryString.hx"
		utest.Assert.same(new haxe.lang.DynamicObject(new java.lang.String[]{"foo"}, new java.lang.Object[]{null}, new java.lang.String[]{}, new double[]{}), thx._QueryString.QueryString_Impl_.toObject(thx._QueryString.QueryString_Impl_.parseWithSymbols("foo", thx._QueryString.QueryString_Impl_.separator, thx._QueryString.QueryString_Impl_.assignment, thx._QueryString.QueryString_Impl_.decodeURIComponent)), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestQueryString", "TestQueryString.hx", "testBasics"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (25) )) )}));
		//line 30 "/shared/core/thx/TestQueryString.hx"
		utest.Assert.equals("foo", thx._QueryString.QueryString_Impl_.toStringWithSymbols(((haxe.ds.StringMap<haxe.root.Array<java.lang.String>>) (thx._QueryString.QueryString_Impl_.parseWithSymbols("foo", thx._QueryString.QueryString_Impl_.separator, thx._QueryString.QueryString_Impl_.assignment, thx._QueryString.QueryString_Impl_.decodeURIComponent)) ), thx._QueryString.QueryString_Impl_.separator, thx._QueryString.QueryString_Impl_.assignment, thx._QueryString.QueryString_Impl_.encodeURIComponent), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestQueryString", "TestQueryString.hx", "testBasics"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (30) )) )}));
		//line 35 "/shared/core/thx/TestQueryString.hx"
		utest.Assert.same(new haxe.lang.DynamicObject(new java.lang.String[]{"foo", "key"}, new java.lang.Object[]{null, null}, new java.lang.String[]{}, new double[]{}), thx._QueryString.QueryString_Impl_.toObject(thx._QueryString.QueryString_Impl_.parseWithSymbols("foo&key", thx._QueryString.QueryString_Impl_.separator, thx._QueryString.QueryString_Impl_.assignment, thx._QueryString.QueryString_Impl_.decodeURIComponent)), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestQueryString", "TestQueryString.hx", "testBasics"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (35) )) )}));
		//line 40 "/shared/core/thx/TestQueryString.hx"
		utest.Assert.same(new haxe.lang.DynamicObject(new java.lang.String[]{"foo", "key"}, new java.lang.Object[]{"bar", null}, new java.lang.String[]{}, new double[]{}), thx._QueryString.QueryString_Impl_.toObject(thx._QueryString.QueryString_Impl_.parseWithSymbols("foo=bar&key", thx._QueryString.QueryString_Impl_.separator, thx._QueryString.QueryString_Impl_.assignment, thx._QueryString.QueryString_Impl_.decodeURIComponent)), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestQueryString", "TestQueryString.hx", "testBasics"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (40) )) )}));
		//line 45 "/shared/core/thx/TestQueryString.hx"
		utest.Assert.same(new haxe.lang.DynamicObject(new java.lang.String[]{}, new java.lang.Object[]{}, new java.lang.String[]{}, new double[]{}), thx._QueryString.QueryString_Impl_.toObject(thx._QueryString.QueryString_Impl_.parseWithSymbols("?", thx._QueryString.QueryString_Impl_.separator, thx._QueryString.QueryString_Impl_.assignment, thx._QueryString.QueryString_Impl_.decodeURIComponent)), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestQueryString", "TestQueryString.hx", "testBasics"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (45) )) )}));
		//line 50 "/shared/core/thx/TestQueryString.hx"
		utest.Assert.same(new haxe.lang.DynamicObject(new java.lang.String[]{}, new java.lang.Object[]{}, new java.lang.String[]{}, new double[]{}), thx._QueryString.QueryString_Impl_.toObject(thx._QueryString.QueryString_Impl_.parseWithSymbols("#", thx._QueryString.QueryString_Impl_.separator, thx._QueryString.QueryString_Impl_.assignment, thx._QueryString.QueryString_Impl_.decodeURIComponent)), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestQueryString", "TestQueryString.hx", "testBasics"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (50) )) )}));
		//line 55 "/shared/core/thx/TestQueryString.hx"
		utest.Assert.same(new haxe.lang.DynamicObject(new java.lang.String[]{}, new java.lang.Object[]{}, new java.lang.String[]{}, new double[]{}), thx._QueryString.QueryString_Impl_.toObject(thx._QueryString.QueryString_Impl_.parseWithSymbols(" ", thx._QueryString.QueryString_Impl_.separator, thx._QueryString.QueryString_Impl_.assignment, thx._QueryString.QueryString_Impl_.decodeURIComponent)), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestQueryString", "TestQueryString.hx", "testBasics"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (55) )) )}));
		//line 60 "/shared/core/thx/TestQueryString.hx"
		utest.Assert.same(new haxe.lang.DynamicObject(new java.lang.String[]{"foo"}, new java.lang.Object[]{new haxe.root.Array<java.lang.String>(new java.lang.String[]{"bar", "baz"})}, new java.lang.String[]{}, new double[]{}), thx._QueryString.QueryString_Impl_.toObject(thx._QueryString.QueryString_Impl_.parseWithSymbols("foo=bar&foo=baz", thx._QueryString.QueryString_Impl_.separator, thx._QueryString.QueryString_Impl_.assignment, thx._QueryString.QueryString_Impl_.decodeURIComponent)), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestQueryString", "TestQueryString.hx", "testBasics"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (60) )) )}));
		//line 65 "/shared/core/thx/TestQueryString.hx"
		utest.Assert.same(new haxe.lang.DynamicObject(new java.lang.String[]{"foo faz"}, new java.lang.Object[]{"bar baz  "}, new java.lang.String[]{}, new double[]{}), thx._QueryString.QueryString_Impl_.toObject(thx._QueryString.QueryString_Impl_.parseWithSymbols("foo+faz=bar+baz++", thx._QueryString.QueryString_Impl_.separator, thx._QueryString.QueryString_Impl_.assignment, thx._QueryString.QueryString_Impl_.decodeURIComponent)), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestQueryString", "TestQueryString.hx", "testBasics"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (65) )) )}));
		//line 70 "/shared/core/thx/TestQueryString.hx"
		utest.Assert.equals("foo=bar", thx._QueryString.QueryString_Impl_.toStringWithSymbols(((haxe.ds.StringMap<haxe.root.Array<java.lang.String>>) (thx._QueryString.QueryString_Impl_.fromObject(new haxe.lang.DynamicObject(new java.lang.String[]{"foo"}, new java.lang.Object[]{"bar"}, new java.lang.String[]{}, new double[]{}))) ), thx._QueryString.QueryString_Impl_.separator, thx._QueryString.QueryString_Impl_.assignment, thx._QueryString.QueryString_Impl_.encodeURIComponent), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestQueryString", "TestQueryString.hx", "testBasics"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (70) )) )}));
		//line 75 "/shared/core/thx/TestQueryString.hx"
		haxe.ds.StringMap<haxe.root.Array<java.lang.String>> qs = thx._QueryString.QueryString_Impl_.fromObject(new haxe.lang.DynamicObject(new java.lang.String[]{"bar", "foo"}, new java.lang.Object[]{"baz", "bar"}, new java.lang.String[]{}, new double[]{}));
		//line 76 "/shared/core/thx/TestQueryString.hx"
		utest.Assert.same(new haxe.root.Array(new java.lang.Object[]{"bar"}), ((haxe.root.Array<java.lang.String>) (((haxe.ds.StringMap<haxe.root.Array<java.lang.String>>) (qs) ).get("foo")) ), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestQueryString", "TestQueryString.hx", "testBasics"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (76) )) )}));
		//line 77 "/shared/core/thx/TestQueryString.hx"
		utest.Assert.same(new haxe.root.Array(new java.lang.Object[]{"baz"}), ((haxe.root.Array<java.lang.String>) (((haxe.ds.StringMap<haxe.root.Array<java.lang.String>>) (qs) ).get("bar")) ), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestQueryString", "TestQueryString.hx", "testBasics"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (77) )) )}));
		//line 79 "/shared/core/thx/TestQueryString.hx"
		java.lang.String qs1 = thx._QueryString.QueryString_Impl_.toStringWithSymbols(((haxe.ds.StringMap<haxe.root.Array<java.lang.String>>) (thx._QueryString.QueryString_Impl_.fromObject(new haxe.lang.DynamicObject(new java.lang.String[]{"foo bar"}, new java.lang.Object[]{"baz faz"}, new java.lang.String[]{}, new double[]{}))) ), thx._QueryString.QueryString_Impl_.separator, thx._QueryString.QueryString_Impl_.assignment, thx._QueryString.QueryString_Impl_.encodeURIComponent);
		//line 80 "/shared/core/thx/TestQueryString.hx"
		utest.Assert.isTrue(( haxe.lang.Runtime.valEq("foo%20bar=baz%20faz", qs1) || haxe.lang.Runtime.valEq("foo+bar=baz+faz", qs1) ), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestQueryString", "TestQueryString.hx", "testBasics"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (80) )) )}));
		//line 85 "/shared/core/thx/TestQueryString.hx"
		java.lang.String qs2 = thx._QueryString.QueryString_Impl_.toStringWithSymbols(((haxe.ds.StringMap<haxe.root.Array<java.lang.String>>) (thx._QueryString.QueryString_Impl_.fromObject(new haxe.lang.DynamicObject(new java.lang.String[]{"abc", "foo"}, new java.lang.Object[]{"abc", new haxe.root.Array<java.lang.String>(new java.lang.String[]{"bar", "baz"})}, new java.lang.String[]{}, new double[]{}))) ), thx._QueryString.QueryString_Impl_.separator, thx._QueryString.QueryString_Impl_.assignment, thx._QueryString.QueryString_Impl_.encodeURIComponent);
		//line 86 "/shared/core/thx/TestQueryString.hx"
		utest.Assert.isTrue(( ( ( ( ( haxe.lang.Runtime.valEq("abc=abc&foo=bar&foo=baz", qs2) || haxe.lang.Runtime.valEq("foo=bar&abc=abc&foo=baz", qs2) ) || haxe.lang.Runtime.valEq("foo=bar&foo=baz&abc=abc", qs2) ) || haxe.lang.Runtime.valEq("abc=abc&foo=baz&foo=bar", qs2) ) || haxe.lang.Runtime.valEq("foo=bar&abc=abc&foo=baz", qs2) ) || haxe.lang.Runtime.valEq("foo=bar&foo=baz&abc=abc", qs2) ), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestQueryString", "TestQueryString.hx", "testBasics"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (86) )) )}));
		//line 95 "/shared/core/thx/TestQueryString.hx"
		java.lang.String qs3 = thx._QueryString.QueryString_Impl_.toStringWithSymbols(((haxe.ds.StringMap<haxe.root.Array<java.lang.String>>) (thx._QueryString.QueryString_Impl_.parseWithSymbols("a=b&c=d", thx._QueryString.QueryString_Impl_.separator, thx._QueryString.QueryString_Impl_.assignment, thx._QueryString.QueryString_Impl_.decodeURIComponent)) ), thx._QueryString.QueryString_Impl_.separator, thx._QueryString.QueryString_Impl_.assignment, thx._QueryString.QueryString_Impl_.encodeURIComponent);
		//line 96 "/shared/core/thx/TestQueryString.hx"
		utest.Assert.isTrue(( haxe.lang.Runtime.valEq("a=b&c=d", qs3) || haxe.lang.Runtime.valEq("c=d&a=b", qs3) ), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestQueryString", "TestQueryString.hx", "testBasics"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (96) )) )}));
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 6 "/shared/core/thx/TestQueryString.hx"
		{
			//line 6 "/shared/core/thx/TestQueryString.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "/shared/core/thx/TestQueryString.hx"
			switch (field.hashCode())
			{
				case 1223535927:
				{
					//line 6 "/shared/core/thx/TestQueryString.hx"
					if (field.equals("testBasics")) 
					{
						//line 6 "/shared/core/thx/TestQueryString.hx"
						__temp_executeDef1 = false;
						//line 6 "/shared/core/thx/TestQueryString.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testBasics")) );
					}
					
					//line 6 "/shared/core/thx/TestQueryString.hx"
					break;
				}
				
				
			}
			
			//line 6 "/shared/core/thx/TestQueryString.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "/shared/core/thx/TestQueryString.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 6 "/shared/core/thx/TestQueryString.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 6 "/shared/core/thx/TestQueryString.hx"
		{
			//line 6 "/shared/core/thx/TestQueryString.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "/shared/core/thx/TestQueryString.hx"
			switch (field.hashCode())
			{
				case 1223535927:
				{
					//line 6 "/shared/core/thx/TestQueryString.hx"
					if (field.equals("testBasics")) 
					{
						//line 6 "/shared/core/thx/TestQueryString.hx"
						__temp_executeDef1 = false;
						//line 6 "/shared/core/thx/TestQueryString.hx"
						this.testBasics();
					}
					
					//line 6 "/shared/core/thx/TestQueryString.hx"
					break;
				}
				
				
			}
			
			//line 6 "/shared/core/thx/TestQueryString.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "/shared/core/thx/TestQueryString.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 6 "/shared/core/thx/TestQueryString.hx"
		return null;
	}
	
	
}

