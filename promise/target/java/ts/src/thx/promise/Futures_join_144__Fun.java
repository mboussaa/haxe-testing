// Generated by Haxe 3.3.0
package thx.promise;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Futures_join_144__Fun<T2, T1> extends haxe.lang.Function
{
	public Futures_join_144__Fun(thx.promise.Future<T2> p2, thx.promise.Future<T1> p1)
	{
		//line 144 "/shared/promise/src/thx/promise/Future.hx"
		super(1, 0);
		//line 144 "/shared/promise/src/thx/promise/Future.hx"
		this.p2 = p2;
		//line 144 "/shared/promise/src/thx/promise/Future.hx"
		this.p1 = p1;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 144 "/shared/promise/src/thx/promise/Future.hx"
		haxe.lang.Function callback = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((haxe.lang.Function) (((java.lang.Object) (__fn_float1) )) )) : (((haxe.lang.Function) (__fn_dyn1) )) );
		//line 145 "/shared/promise/src/thx/promise/Future.hx"
		int[] counter = new int[]{0};
		//line 145 "/shared/promise/src/thx/promise/Future.hx"
		java.lang.Object[] v1 = ( (java.lang.Object[]) (new java.lang.Object[] {null}) );
		//line 145 "/shared/promise/src/thx/promise/Future.hx"
		java.lang.Object[] v2 = ( (java.lang.Object[]) (new java.lang.Object[] {null}) );
		//line 149 "/shared/promise/src/thx/promise/Future.hx"
		haxe.lang.Function complete = new thx.promise.Futures_join_149__Fun<T2, T1>(v2, v1, counter, callback);
		//line 155 "/shared/promise/src/thx/promise/Future.hx"
		this.p1.then(new thx.promise.Futures_join_155__Fun<T1>(v1, counter, complete));
		//line 161 "/shared/promise/src/thx/promise/Future.hx"
		this.p2.then(new thx.promise.Futures_join_161__Fun<T2>(v2, counter, complete));
		//line 144 "/shared/promise/src/thx/promise/Future.hx"
		return null;
	}
	
	
	public thx.promise.Future<T2> p2;
	
	public thx.promise.Future<T1> p1;
	
}


