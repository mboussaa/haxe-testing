// Generated by Haxe 3.3.0
package thx.promise;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Future_sequence_18__Fun<T1> extends haxe.lang.Function
{
	public Future_sequence_18__Fun(haxe.lang.Function[] poll, int index, haxe.root.Array<T1> acc)
	{
		//line 18 "/shared/promise/src/thx/promise/Future.hx"
		super(1, 0);
		//line 18 "/shared/promise/src/thx/promise/Future.hx"
		this.poll = poll;
		//line 18 "/shared/promise/src/thx/promise/Future.hx"
		this.index = index;
		//line 18 "/shared/promise/src/thx/promise/Future.hx"
		this.acc = acc;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 18 "/shared/promise/src/thx/promise/Future.hx"
		T1 v = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((T1) (((java.lang.Object) (__fn_float1) )) )) : (((T1) (__fn_dyn1) )) );
		//line 19 "/shared/promise/src/thx/promise/Future.hx"
		this.acc.__set(this.index, v);
		//line 20 "/shared/promise/src/thx/promise/Future.hx"
		this.poll[0].__hx_invoke1_o(((double) (( this.index + 1 )) ), haxe.lang.Runtime.undefined);
		//line 18 "/shared/promise/src/thx/promise/Future.hx"
		return null;
	}
	
	
	public haxe.lang.Function[] poll;
	
	public int index;
	
	public haxe.root.Array<T1> acc;
	
}

