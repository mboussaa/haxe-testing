// Generated by Haxe 3.3.0
package thx.promise._Promise;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Promise_Impl__sequence_68__Fun<T> extends haxe.lang.Function
{
	public Promise_Impl__sequence_68__Fun(thx.promise.Future<thx.Either> p)
	{
		//line 68 "/shared/promise/src/thx/promise/Promise.hx"
		super(1, 0);
		//line 68 "/shared/promise/src/thx/promise/Promise.hx"
		this.p = p;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 68 "/shared/promise/src/thx/promise/Promise.hx"
		haxe.root.Array<T> arr1 = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((haxe.root.Array<T>) (((java.lang.Object) (__fn_float1) )) )) : (((haxe.root.Array<T>) (__fn_dyn1) )) );
		//line 68 "/shared/promise/src/thx/promise/Promise.hx"
		return ((thx.promise.Future<thx.Either>) (thx.promise._Promise.Promise_Impl_.map(((thx.promise.Future<thx.Either>) (this.p) ), ((haxe.lang.Function) (new thx.promise._Promise.Promise_Impl__sequence_68__Fun_0<T>(arr1)) ))) );
	}
	
	
	public thx.promise.Future<thx.Either> p;
	
}

