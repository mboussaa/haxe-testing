// Generated by Haxe 3.3.0
package thx.promise._Promise;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Promise_Impl__ap_229__Fun_1<T, U> extends haxe.lang.Function
{
	public Promise_Impl__ap_229__Fun_1(thx.promise.Future<thx.Either> _e)
	{
		//line 229 "/shared/promise/src/thx/promise/Promise.hx"
		super(1, 0);
		//line 229 "/shared/promise/src/thx/promise/Promise.hx"
		this._e = _e;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 229 "/shared/promise/src/thx/promise/Promise.hx"
		haxe.lang.Function success = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((haxe.lang.Function) (((java.lang.Object) (__fn_float1) )) )) : (((haxe.lang.Function) (__fn_dyn1) )) );
		//line 229 "/shared/promise/src/thx/promise/Promise.hx"
		return ((thx.promise.Future<thx.Either>) (thx.promise._Promise.Promise_Impl_.map(((thx.promise.Future<thx.Either>) (this._e) ), ((haxe.lang.Function) (success) ))) );
	}
	
	
	public thx.promise.Future<thx.Either> _e;
	
}


