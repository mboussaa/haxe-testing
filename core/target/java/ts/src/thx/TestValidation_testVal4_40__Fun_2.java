// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TestValidation_testVal4_40__Fun_2 extends haxe.lang.Function
{
	public TestValidation_testVal4_40__Fun_2(haxe.lang.Function f1)
	{
		//line 40 "/shared/core/thx/TestValidation.hx"
		super(3, 0);
		//line 40 "/shared/core/thx/TestValidation.hx"
		this.f1 = f1;
	}
	
	
	@Override public java.lang.Object __hx_invoke3_o(double __fn_float1, java.lang.Object __fn_dyn1, double __fn_float2, java.lang.Object __fn_dyn2, double __fn_float3, java.lang.Object __fn_dyn3)
	{
		//line 40 "/shared/core/thx/TestValidation.hx"
		boolean c = ( (( __fn_dyn3 == haxe.lang.Runtime.undefined )) ? (haxe.lang.Runtime.toBool(((java.lang.Object) (__fn_float3) ))) : (haxe.lang.Runtime.toBool(__fn_dyn3)) );
		//line 40 "/shared/core/thx/TestValidation.hx"
		boolean b = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (haxe.lang.Runtime.toBool(((java.lang.Object) (__fn_float2) ))) : (haxe.lang.Runtime.toBool(__fn_dyn2)) );
		//line 40 "/shared/core/thx/TestValidation.hx"
		boolean a = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (haxe.lang.Runtime.toBool(((java.lang.Object) (__fn_float1) ))) : (haxe.lang.Runtime.toBool(__fn_dyn1)) );
		//line 40 "/shared/core/thx/TestValidation.hx"
		return new thx.TestValidation_testVal4_40__Fun_3(this.f1, c, b, a);
	}
	
	
	public haxe.lang.Function f1;
	
}


