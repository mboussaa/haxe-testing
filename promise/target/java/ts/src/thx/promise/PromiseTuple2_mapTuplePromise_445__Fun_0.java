// Generated by Haxe 3.3.0
package thx.promise;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class PromiseTuple2_mapTuplePromise_445__Fun_0<TOut, T2, T1> extends haxe.lang.Function
{
	public PromiseTuple2_mapTuplePromise_445__Fun_0(haxe.lang.Function success)
	{
		//line 446 "/shared/promise/src/thx/promise/Promise.hx"
		super(1, 0);
		//line 446 "/shared/promise/src/thx/promise/Promise.hx"
		this.success = success;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 445 "/shared/promise/src/thx/promise/Promise.hx"
		java.lang.Object t = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((java.lang.Object) (__fn_float1) )) : (((java.lang.Object) (__fn_dyn1) )) );
		//line 446 "/shared/promise/src/thx/promise/Promise.hx"
		return ((thx.promise.Future<thx.Either>) (this.success.__hx_invoke2_o(0.0, ((T1) (haxe.lang.Runtime.getField(t, "_0", true)) ), 0.0, ((T2) (haxe.lang.Runtime.getField(t, "_1", true)) ))) );
	}
	
	
	public haxe.lang.Function success;
	
}


