// Generated by Haxe 3.3.0
package thx.promise;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class FutureNil_nil_283__Fun extends haxe.lang.Function
{
	public FutureNil_nil_283__Fun(thx.promise.Future p)
	{
		//line 284 "/shared/promise/src/thx/promise/Future.hx"
		super(1, 0);
		//line 284 "/shared/promise/src/thx/promise/Future.hx"
		this.p = p;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 283 "/shared/promise/src/thx/promise/Future.hx"
		haxe.lang.Function callback = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((haxe.lang.Function) (((java.lang.Object) (__fn_float1) )) )) : (((haxe.lang.Function) (__fn_dyn1) )) );
		//line 284 "/shared/promise/src/thx/promise/Future.hx"
		this.p.then(new thx.promise.FutureNil_nil_284__Fun(callback));
		//line 284 "/shared/promise/src/thx/promise/Future.hx"
		return null;
	}
	
	
	public thx.promise.Future p;
	
}

