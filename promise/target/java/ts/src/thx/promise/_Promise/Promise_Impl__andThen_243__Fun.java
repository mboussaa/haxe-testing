// Generated by Haxe 3.3.0
package thx.promise._Promise;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Promise_Impl__andThen_243__Fun<B> extends haxe.lang.Function
{
	public Promise_Impl__andThen_243__Fun()
	{
		//line 243 "/shared/promise/src/thx/promise/Promise.hx"
		super(1, 0);
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 243 "/shared/promise/src/thx/promise/Promise.hx"
		thx.Error err = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((thx.Error) (((java.lang.Object) (__fn_float1) )) )) : (((thx.Error) (__fn_dyn1) )) );
		//line 243 "/shared/promise/src/thx/promise/Promise.hx"
		return ((thx.promise.Future<thx.Either>) (thx.promise._Promise.Promise_Impl_.error(((thx.Error) (err) ))) );
	}
	
	
}


