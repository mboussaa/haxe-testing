// Generated by Haxe 3.3.0
package thx.color;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TestConversion_testCmyk_56__Fun extends haxe.lang.Function
{
	public TestConversion_testCmyk_56__Fun()
	{
		//line 56 "/shared/color/test/thx/color/TestConversion.hx"
		super(1, 0);
	}
	
	
	public static thx.color.TestConversion_testCmyk_56__Fun __hx_current;
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 56 "/shared/color/test/thx/color/TestConversion.hx"
		java.lang.String name = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (haxe.lang.Runtime.toString(__fn_float1)) : (haxe.lang.Runtime.toString(__fn_dyn1)) );
		//line 57 "/shared/color/test/thx/color/TestConversion.hx"
		int expected = ((int) (haxe.lang.Runtime.toInt(((java.lang.Object) (thx.color.palettes.Web.names.get(name)) ))) );
		//line 57 "/shared/color/test/thx/color/TestConversion.hx"
		haxe.root.Array<java.lang.Object> color = thx.color._Rgb.Rgb_Impl_.toCmyk(expected);
		//line 57 "/shared/color/test/thx/color/TestConversion.hx"
		int test = thx.color._Cmyk.Cmyk_Impl_.toRgb(color);
		//line 60 "/shared/color/test/thx/color/TestConversion.hx"
		utest.Assert.equals(thx.color._Rgb.Rgb_Impl_.toString(expected), thx.color._Rgb.Rgb_Impl_.toString(test), ( ( ( ( ( "expected " + thx.color._Rgb.Rgb_Impl_.toString(expected) ) + " but was " ) + thx.color._Rgb.Rgb_Impl_.toString(test) ) + " for " ) + name ), new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.color.TestConversion", "TestConversion.hx", "testCmyk"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (60) )) )}));
		//line 56 "/shared/color/test/thx/color/TestConversion.hx"
		return null;
	}
	
	
}

