// Generated by Haxe 3.3.0
package thx._Ord;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Ord_Impl__fromIntComparison_77__Fun<A> extends haxe.lang.Function
{
	public Ord_Impl__fromIntComparison_77__Fun(haxe.lang.Function f)
	{
		//line 77 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ord.hx"
		super(2, 0);
		//line 77 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ord.hx"
		this.f = f;
	}
	
	
	@Override public java.lang.Object __hx_invoke2_o(double __fn_float1, java.lang.Object __fn_dyn1, double __fn_float2, java.lang.Object __fn_dyn2)
	{
		//line 77 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ord.hx"
		A b = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (((A) (((java.lang.Object) (__fn_float2) )) )) : (((A) (__fn_dyn2) )) );
		//line 77 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ord.hx"
		A a = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((A) (((java.lang.Object) (__fn_float1) )) )) : (((A) (__fn_dyn1) )) );
		//line 77 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ord.hx"
		return thx._Ord.Ordering_Impl_.fromInt(((int) (this.f.__hx_invoke2_f(0.0, a, 0.0, b)) ));
	}
	
	
	public haxe.lang.Function f;
	
}


