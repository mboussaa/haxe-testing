// Generated by Haxe 3.3.0
package thx.promise._Promise;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Promise_Impl__map_226__Fun_0<U, T> extends haxe.lang.Function
{
	public Promise_Impl__map_226__Fun_0(haxe.lang.Function success)
	{
		//line 226 "/shared/promise/src/thx/promise/Promise.hx"
		super(1, 0);
		//line 226 "/shared/promise/src/thx/promise/Promise.hx"
		this.success = success;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 226 "/shared/promise/src/thx/promise/Promise.hx"
		T v = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((T) (((java.lang.Object) (__fn_float1) )) )) : (((T) (__fn_dyn1) )) );
		//line 226 "/shared/promise/src/thx/promise/Promise.hx"
		return ((thx.promise.Future<thx.Either>) (thx.promise._Promise.Promise_Impl_.value(((U) (this.success.__hx_invoke1_o(0.0, v)) ))) );
	}
	
	
	public haxe.lang.Function success;
	
}


