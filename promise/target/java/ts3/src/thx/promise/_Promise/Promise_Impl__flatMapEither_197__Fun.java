// Generated by Haxe 3.3.0
package thx.promise._Promise;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Promise_Impl__flatMapEither_197__Fun<T, TOut> extends haxe.lang.Function
{
	public Promise_Impl__flatMapEither_197__Fun(thx.promise.Future<thx.Either> this1, haxe.lang.Function success, haxe.lang.Function failure)
	{
		//line 198 "/shared/promise/src/thx/promise/Promise.hx"
		super(2, 0);
		//line 198 "/shared/promise/src/thx/promise/Promise.hx"
		this.this1 = this1;
		//line 198 "/shared/promise/src/thx/promise/Promise.hx"
		this.success = success;
		//line 198 "/shared/promise/src/thx/promise/Promise.hx"
		this.failure = failure;
	}
	
	
	@Override public java.lang.Object __hx_invoke2_o(double __fn_float1, java.lang.Object __fn_dyn1, double __fn_float2, java.lang.Object __fn_dyn2)
	{
		//line 197 "/shared/promise/src/thx/promise/Promise.hx"
		haxe.lang.Function reject = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (((haxe.lang.Function) (((java.lang.Object) (__fn_float2) )) )) : (((haxe.lang.Function) (__fn_dyn2) )) );
		//line 197 "/shared/promise/src/thx/promise/Promise.hx"
		haxe.lang.Function resolve = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((haxe.lang.Function) (((java.lang.Object) (__fn_float1) )) )) : (((haxe.lang.Function) (__fn_dyn1) )) );
		//line 198 "/shared/promise/src/thx/promise/Promise.hx"
		this.this1.then(new thx.promise._Promise.Promise_Impl__flatMapEither_198__Fun<TOut, T>(this.success, resolve, reject, this.failure));
		//line 198 "/shared/promise/src/thx/promise/Promise.hx"
		return null;
	}
	
	
	public thx.promise.Future<thx.Either> this1;
	
	public haxe.lang.Function success;
	
	public haxe.lang.Function failure;
	
}

