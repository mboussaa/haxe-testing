// Generated by Haxe 3.3.0
package thx.fp;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TestList_testZip5Ap_89__Fun_0 extends haxe.lang.Function
{
	public TestList_testZip5Ap_89__Fun_0(haxe.root.Array<java.lang.String> _e5)
	{
		//line 89 "/shared/core/test/thx/fp/TestList.hx"
		super(2, 0);
		//line 89 "/shared/core/test/thx/fp/TestList.hx"
		this._e5 = _e5;
	}
	
	
	@Override public java.lang.Object __hx_invoke2_o(double __fn_float1, java.lang.Object __fn_dyn1, double __fn_float2, java.lang.Object __fn_dyn2)
	{
		//line 89 "/shared/core/test/thx/fp/TestList.hx"
		thx.fp.ListImpl initial10 = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (((thx.fp.ListImpl) (((java.lang.Object) (__fn_float2) )) )) : (((thx.fp.ListImpl) (__fn_dyn2) )) );
		//line 89 "/shared/core/test/thx/fp/TestList.hx"
		haxe.lang.Function f5 = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((haxe.lang.Function) (((java.lang.Object) (__fn_float1) )) )) : (((haxe.lang.Function) (__fn_dyn1) )) );
		//line 89 "/shared/core/test/thx/fp/TestList.hx"
		thx.fp.ListImpl initial11 = initial10;
		//line 89 "/shared/core/test/thx/fp/TestList.hx"
		int i5 = this._e5.length;
		//line 89 "/shared/core/test/thx/fp/TestList.hx"
		while ((  -- i5 >= 0 ))
		{
			//line 89 "/shared/core/test/thx/fp/TestList.hx"
			initial11 = ((thx.fp.ListImpl) (f5.__hx_invoke2_o(0.0, initial11, 0.0, haxe.lang.Runtime.toString(((haxe.root.Array<java.lang.String>) (this._e5) ).__get(i5)))) );
		}
		
		//line 89 "/shared/core/test/thx/fp/TestList.hx"
		return initial11;
	}
	
	
	public haxe.root.Array<java.lang.String> _e5;
	
}


