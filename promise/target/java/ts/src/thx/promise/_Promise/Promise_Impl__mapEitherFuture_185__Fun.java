// Generated by Haxe 3.3.0
package thx.promise._Promise;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Promise_Impl__mapEitherFuture_185__Fun<TOut, T> extends haxe.lang.Function
{
	public Promise_Impl__mapEitherFuture_185__Fun(haxe.lang.Function success)
	{
		//line 185 "/shared/promise/src/thx/promise/Promise.hx"
		super(1, 0);
		//line 185 "/shared/promise/src/thx/promise/Promise.hx"
		this.success = success;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 185 "/shared/promise/src/thx/promise/Promise.hx"
		T v = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((T) (((java.lang.Object) (__fn_float1) )) )) : (((T) (__fn_dyn1) )) );
		//line 185 "/shared/promise/src/thx/promise/Promise.hx"
		return ((thx.promise.Future<TOut>) (thx.promise.Future.value(((TOut) (this.success.__hx_invoke1_o(0.0, v)) ))) );
	}
	
	
	public haxe.lang.Function success;
	
}


