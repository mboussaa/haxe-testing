// Generated by Haxe 3.3.0
package thx.promise;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Future_flatten_55__Fun<T5> extends haxe.lang.Function
{
	public Future_flatten_55__Fun(thx.promise.Future<thx.promise.Future<T5>> future)
	{
		//line 56 "/shared/promise/src/thx/promise/Future.hx"
		super(1, 0);
		//line 56 "/shared/promise/src/thx/promise/Future.hx"
		this.future = future;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 55 "/shared/promise/src/thx/promise/Future.hx"
		haxe.lang.Function callback = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((haxe.lang.Function) (((java.lang.Object) (__fn_float1) )) )) : (((haxe.lang.Function) (__fn_dyn1) )) );
		//line 56 "/shared/promise/src/thx/promise/Future.hx"
		this.future.then(new thx.promise.Future_flatten_56__Fun<T5>(callback));
		//line 56 "/shared/promise/src/thx/promise/Future.hx"
		return null;
	}
	
	
	public thx.promise.Future<thx.promise.Future<T5>> future;
	
}

