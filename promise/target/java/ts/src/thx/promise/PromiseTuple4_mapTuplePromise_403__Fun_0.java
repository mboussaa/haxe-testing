// Generated by Haxe 3.3.0
package thx.promise;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class PromiseTuple4_mapTuplePromise_403__Fun_0<TOut, T4, T3, T2, T1> extends haxe.lang.Function
{
	public PromiseTuple4_mapTuplePromise_403__Fun_0(haxe.lang.Function success)
	{
		//line 404 "/shared/promise/src/thx/promise/Promise.hx"
		super(1, 0);
		//line 404 "/shared/promise/src/thx/promise/Promise.hx"
		this.success = success;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 403 "/shared/promise/src/thx/promise/Promise.hx"
		java.lang.Object t = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((java.lang.Object) (__fn_float1) )) : (((java.lang.Object) (__fn_dyn1) )) );
		//line 404 "/shared/promise/src/thx/promise/Promise.hx"
		return ((thx.promise.Future<thx.Either>) (this.success.__hx_invoke4_o(0.0, ((T1) (haxe.lang.Runtime.getField(t, "_0", true)) ), 0.0, ((T2) (haxe.lang.Runtime.getField(t, "_1", true)) ), 0.0, ((T3) (haxe.lang.Runtime.getField(t, "_2", true)) ), 0.0, ((T4) (haxe.lang.Runtime.getField(t, "_3", true)) ))) );
	}
	
	
	public haxe.lang.Function success;
	
}


