// Generated by Haxe 3.3.0
package thx.promise._Promise;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Promise_Impl__mapAlwaysFuture_175__Fun<TOut, T> extends haxe.lang.Function
{
	public Promise_Impl__mapAlwaysFuture_175__Fun(haxe.lang.Function handler)
	{
		//line 175 "/shared/promise/src/thx/promise/Promise.hx"
		super(1, 0);
		//line 175 "/shared/promise/src/thx/promise/Promise.hx"
		this.handler = handler;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 175 "/shared/promise/src/thx/promise/Promise.hx"
		thx.Either _1 = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((thx.Either) (((java.lang.Object) (__fn_float1) )) )) : (((thx.Either) (__fn_dyn1) )) );
		//line 175 "/shared/promise/src/thx/promise/Promise.hx"
		return ((thx.promise.Future<TOut>) (this.handler.__hx_invoke0_o()) );
	}
	
	
	public haxe.lang.Function handler;
	
}

