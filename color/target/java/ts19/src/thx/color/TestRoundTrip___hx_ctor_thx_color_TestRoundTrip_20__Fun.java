// Generated by Haxe 3.3.0
package thx.color;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TestRoundTrip___hx_ctor_thx_color_TestRoundTrip_20__Fun extends haxe.lang.Function
{
	public TestRoundTrip___hx_ctor_thx_color_TestRoundTrip_20__Fun()
	{
		//line 86 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/macro/lambda/SlambdaMacro.hx"
		super(1, 0);
	}
	
	
	public static thx.color.TestRoundTrip___hx_ctor_thx_color_TestRoundTrip_20__Fun __hx_current;
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 20 "/shared/color/test/thx/color/TestRoundTrip.hx"
		haxe.root.Array<java.lang.Object> _1 = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((haxe.root.Array<java.lang.Object>) (((java.lang.Object) (__fn_float1) )) )) : (( (( __fn_dyn1 == null )) ? (null) : (((haxe.root.Array<java.lang.Object>) (__fn_dyn1) )) )) );
		//line 20 "/shared/color/test/thx/color/TestRoundTrip.hx"
		{
			//line 22 "/shared/color/test/thx/color/TestRoundTrip.hx"
			int __temp_odecl1 = thx.color._Rgbx.Rgbx_Impl_.toRgb(_1);
			//line 23 "/shared/color/test/thx/color/TestRoundTrip.hx"
			haxe.root.Array<java.lang.Object> __temp_odecl2 = thx.color._Rgbx.Rgbx_Impl_.toLab(_1);
			//line 24 "/shared/color/test/thx/color/TestRoundTrip.hx"
			haxe.root.Array<java.lang.Object> __temp_odecl3 = thx.color._Rgbx.Rgbx_Impl_.toLCh(_1);
			//line 25 "/shared/color/test/thx/color/TestRoundTrip.hx"
			haxe.root.Array<java.lang.Object> __temp_odecl4 = thx.color._Rgbx.Rgbx_Impl_.toCmy(_1);
			//line 26 "/shared/color/test/thx/color/TestRoundTrip.hx"
			haxe.root.Array<java.lang.Object> __temp_odecl5 = thx.color._Rgbx.Rgbx_Impl_.toCmyk(_1);
			//line 27 "/shared/color/test/thx/color/TestRoundTrip.hx"
			haxe.root.Array<java.lang.Object> __temp_odecl6 = ((haxe.root.Array<java.lang.Object>) (thx.color._Rgbx.Rgbx_Impl_.toCubeHelixWithGamma(((haxe.root.Array<java.lang.Object>) (_1) ), ((double) (1) ))) );
			//line 28 "/shared/color/test/thx/color/TestRoundTrip.hx"
			double __temp_odecl7 = thx.color._Rgbx.Rgbx_Impl_.toGrey(_1);
			//line 29 "/shared/color/test/thx/color/TestRoundTrip.hx"
			haxe.root.Array<java.lang.Object> __temp_odecl8 = thx.color._Rgbx.Rgbx_Impl_.toHsl(_1);
			//line 30 "/shared/color/test/thx/color/TestRoundTrip.hx"
			haxe.root.Array<java.lang.Object> __temp_odecl9 = thx.color._Rgbx.Rgbx_Impl_.toHsv(_1);
			//line 31 "/shared/color/test/thx/color/TestRoundTrip.hx"
			haxe.root.Array<java.lang.Object> __temp_odecl10 = thx.color._Rgbx.Rgbx_Impl_.toHunterLab(_1);
			//line 32 "/shared/color/test/thx/color/TestRoundTrip.hx"
			haxe.root.Array<java.lang.Object> __temp_odecl11 = thx.color._Rgbx.Rgbx_Impl_.toXyz(_1);
			//line 33 "/shared/color/test/thx/color/TestRoundTrip.hx"
			haxe.root.Array<java.lang.Object> __temp_odecl12 = thx.color._Rgbx.Rgbx_Impl_.toYuv(_1);
			//line 34 "/shared/color/test/thx/color/TestRoundTrip.hx"
			haxe.root.Array<java.lang.Object> __temp_odecl13 = thx.color._Rgbx.Rgbx_Impl_.toYxy(_1);
			//line 20 "/shared/color/test/thx/color/TestRoundTrip.hx"
			return new haxe.lang.DynamicObject(new java.lang.String[]{"ch", "cmy", "cmyk", "hl", "hsl", "hsv", "lab", "lch", "rgbx", "xyz", "yuv", "yxy"}, new java.lang.Object[]{__temp_odecl6, __temp_odecl4, __temp_odecl5, __temp_odecl10, __temp_odecl8, __temp_odecl9, __temp_odecl2, __temp_odecl3, ((haxe.root.Array<java.lang.Object>) (_1) ), __temp_odecl11, __temp_odecl12, __temp_odecl13}, new java.lang.String[]{"g", "rgb"}, new double[]{((double) (__temp_odecl7) ), ((double) (((double) (__temp_odecl1) )) )});
		}
		
	}
	
	
}


