// Generated by Haxe 3.3.0
package thx.fp;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TestState_testFlatMap_25__Fun extends haxe.lang.Function
{
	public TestState_testFlatMap_25__Fun(haxe.lang.Function this1, haxe.lang.Function f1)
	{
		//line 25 "/shared/core/test/thx/fp/TestState.hx"
		super(1, 0);
		//line 25 "/shared/core/test/thx/fp/TestState.hx"
		this.this1 = this1;
		//line 25 "/shared/core/test/thx/fp/TestState.hx"
		this.f1 = f1;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 25 "/shared/core/test/thx/fp/TestState.hx"
		java.lang.String s1 = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (haxe.lang.Runtime.toString(__fn_float1)) : (haxe.lang.Runtime.toString(__fn_dyn1)) );
		//line 25 "/shared/core/test/thx/fp/TestState.hx"
		return ((java.lang.Object) (thx._Tuple.Tuple2_Impl_.map(((java.lang.Object) (((haxe.lang.Function) (this.this1) ).__hx_invoke1_o(0.0, s1)) ), ((haxe.lang.Function) (this.f1) ))) );
	}
	
	
	public haxe.lang.Function this1;
	
	public haxe.lang.Function f1;
	
}

