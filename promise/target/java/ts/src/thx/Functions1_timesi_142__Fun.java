// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Functions1_timesi_142__Fun<TOut, TIn> extends haxe.lang.Function
{
	public Functions1_timesi_142__Fun(int n, haxe.lang.Function callback)
	{
		//line 143 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		super(1, 0);
		//line 143 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		this.n = n;
		//line 143 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		this.callback = callback;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 142 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		TIn value = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((TIn) (((java.lang.Object) (__fn_float1) )) )) : (((TIn) (__fn_dyn1) )) );
		//line 143 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		return ((haxe.root.Array<TOut>) (((haxe.root.Array) (thx.Ints.range(this.n, null, null).map(((haxe.lang.Function) (new thx.Functions1_timesi_143__Fun<TIn, TOut>(value, this.callback)) ))) )) );
	}
	
	
	public int n;
	
	public haxe.lang.Function callback;
	
}


