// Generated by Haxe 3.3.0
package thx.promise;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Future_mapPromise_91__Fun<T, TOut> extends haxe.lang.Function
{
	public Future_mapPromise_91__Fun(haxe.lang.Function handler, thx.promise.Future<T> _gthis)
	{
		//line 92 "/shared/promise/src/thx/promise/Future.hx"
		super(2, 0);
		//line 92 "/shared/promise/src/thx/promise/Future.hx"
		this.handler = handler;
		//line 92 "/shared/promise/src/thx/promise/Future.hx"
		this._gthis = _gthis;
	}
	
	
	@Override public java.lang.Object __hx_invoke2_o(double __fn_float1, java.lang.Object __fn_dyn1, double __fn_float2, java.lang.Object __fn_dyn2)
	{
		//line 91 "/shared/promise/src/thx/promise/Future.hx"
		haxe.lang.Function reject = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (((haxe.lang.Function) (((java.lang.Object) (__fn_float2) )) )) : (((haxe.lang.Function) (__fn_dyn2) )) );
		//line 91 "/shared/promise/src/thx/promise/Future.hx"
		haxe.lang.Function resolve = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((haxe.lang.Function) (((java.lang.Object) (__fn_float1) )) )) : (((haxe.lang.Function) (__fn_dyn1) )) );
		//line 92 "/shared/promise/src/thx/promise/Future.hx"
		this._gthis.then(new thx.promise.Future_mapPromise_92__Fun<TOut, T>(resolve, reject, this.handler));
		//line 92 "/shared/promise/src/thx/promise/Future.hx"
		return null;
	}
	
	
	public haxe.lang.Function handler;
	
	public thx.promise.Future<T> _gthis;
	
}

