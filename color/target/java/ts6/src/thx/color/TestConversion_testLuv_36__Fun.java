// Generated by Haxe 3.3.0
package thx.color;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TestConversion_testLuv_36__Fun extends haxe.lang.Function
{
	public TestConversion_testLuv_36__Fun()
	{
		//line 36 "/shared/color/test/thx/color/TestConversion.hx"
		super(1, 0);
	}
	
	
	public static thx.color.TestConversion_testLuv_36__Fun __hx_current;
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 36 "/shared/color/test/thx/color/TestConversion.hx"
		java.lang.String name = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (haxe.lang.Runtime.toString(__fn_float1)) : (haxe.lang.Runtime.toString(__fn_dyn1)) );
		//line 37 "/shared/color/test/thx/color/TestConversion.hx"
		int expected = ((int) (haxe.lang.Runtime.toInt(((java.lang.Object) (thx.color.palettes.Web.names.get(name)) ))) );
		//line 37 "/shared/color/test/thx/color/TestConversion.hx"
		haxe.root.Array<java.lang.Object> color = thx.color._Rgb.Rgb_Impl_.toLuv(expected);
		//line 37 "/shared/color/test/thx/color/TestConversion.hx"
		int test = thx.color._Luv.Luv_Impl_.toRgb(color);
		//line 40 "/shared/color/test/thx/color/TestConversion.hx"
		utest.Assert.equals(thx.color._Rgb.Rgb_Impl_.toString(expected), thx.color._Rgb.Rgb_Impl_.toString(test), ( ( ( ( ( "expected " + thx.color._Rgb.Rgb_Impl_.toString(expected) ) + " but was " ) + thx.color._Rgb.Rgb_Impl_.toString(test) ) + " for " ) + name ), new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.color.TestConversion", "TestConversion.hx", "testLuv"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (40) )) )}));
		//line 36 "/shared/color/test/thx/color/TestConversion.hx"
		return null;
	}
	
	
}

