// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Arrays_maxBy_1128__Fun<A> extends haxe.lang.Function
{
	public Arrays_maxBy_1128__Fun(haxe.lang.Function _e)
	{
		//line 1128 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		super(2, 0);
		//line 1128 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		this._e = _e;
	}
	
	
	@Override public java.lang.Object __hx_invoke2_o(double __fn_float1, java.lang.Object __fn_dyn1, double __fn_float2, java.lang.Object __fn_dyn2)
	{
		//line 1128 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		A a1 = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (((A) (((java.lang.Object) (__fn_float2) )) )) : (((A) (__fn_dyn2) )) );
		//line 1128 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		A a0 = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((A) (((java.lang.Object) (__fn_float1) )) )) : (((A) (__fn_dyn1) )) );
		//line 1128 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		return ((A) (thx._Ord.Ord_Impl_.max(((haxe.lang.Function) (this._e) ), ((A) (a0) ), ((A) (a1) ))) );
	}
	
	
	public haxe.lang.Function _e;
	
}


