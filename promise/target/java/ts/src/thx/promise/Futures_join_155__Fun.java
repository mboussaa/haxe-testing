// Generated by Haxe 3.3.0
package thx.promise;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Futures_join_155__Fun<T1> extends haxe.lang.Function
{
	public Futures_join_155__Fun(java.lang.Object[] v1, int[] counter, haxe.lang.Function complete)
	{
		//line 155 "/shared/promise/src/thx/promise/Future.hx"
		super(1, 0);
		//line 155 "/shared/promise/src/thx/promise/Future.hx"
		this.v1 = v1;
		//line 155 "/shared/promise/src/thx/promise/Future.hx"
		this.counter = counter;
		//line 155 "/shared/promise/src/thx/promise/Future.hx"
		this.complete = complete;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 155 "/shared/promise/src/thx/promise/Future.hx"
		T1 v = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((T1) (((java.lang.Object) (__fn_float1) )) )) : (((T1) (__fn_dyn1) )) );
		//line 156 "/shared/promise/src/thx/promise/Future.hx"
		this.counter[0]++;
		//line 157 "/shared/promise/src/thx/promise/Future.hx"
		this.v1[0] = v;
		//line 158 "/shared/promise/src/thx/promise/Future.hx"
		this.complete.__hx_invoke0_o();
		//line 155 "/shared/promise/src/thx/promise/Future.hx"
		return null;
	}
	
	
	public java.lang.Object[] v1;
	
	public int[] counter;
	
	public haxe.lang.Function complete;
	
}


