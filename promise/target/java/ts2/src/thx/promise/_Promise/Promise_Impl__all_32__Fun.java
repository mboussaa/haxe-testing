// Generated by Haxe 3.3.0
package thx.promise._Promise;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Promise_Impl__all_32__Fun<T> extends haxe.lang.Function
{
	public Promise_Impl__all_32__Fun(haxe.root.Array<thx.promise.Future<thx.Either>> arr)
	{
		//line 32 "/shared/promise/src/thx/promise/Promise.hx"
		super(2, 0);
		//line 32 "/shared/promise/src/thx/promise/Promise.hx"
		this.arr = arr;
	}
	
	
	@Override public java.lang.Object __hx_invoke2_o(double __fn_float1, java.lang.Object __fn_dyn1, double __fn_float2, java.lang.Object __fn_dyn2)
	{
		//line 32 "/shared/promise/src/thx/promise/Promise.hx"
		haxe.lang.Function reject = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (((haxe.lang.Function) (((java.lang.Object) (__fn_float2) )) )) : (((haxe.lang.Function) (__fn_dyn2) )) );
		//line 32 "/shared/promise/src/thx/promise/Promise.hx"
		haxe.lang.Function resolve = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((haxe.lang.Function) (((java.lang.Object) (__fn_float1) )) )) : (((haxe.lang.Function) (__fn_dyn1) )) );
		//line 33 "/shared/promise/src/thx/promise/Promise.hx"
		haxe.root.Array<T> results = new haxe.root.Array<T>(( (T[]) (new java.lang.Object[] {}) ));
		//line 33 "/shared/promise/src/thx/promise/Promise.hx"
		int[] counter = new int[]{0};
		//line 33 "/shared/promise/src/thx/promise/Promise.hx"
		boolean[] hasError = new boolean[]{false};
		//line 40 "/shared/promise/src/thx/promise/Promise.hx"
		{
			//line 40 "/shared/promise/src/thx/promise/Promise.hx"
			int _g1 = 0;
			//line 40 "/shared/promise/src/thx/promise/Promise.hx"
			int _g = this.arr.length;
			//line 40 "/shared/promise/src/thx/promise/Promise.hx"
			while (( _g1 < _g ))
			{
				//line 40 "/shared/promise/src/thx/promise/Promise.hx"
				int i = _g1++;
				//line 41 "/shared/promise/src/thx/promise/Promise.hx"
				thx.promise._Promise.Promise_Impl_.either(((thx.promise.Future<thx.Either>) (this.arr.__get(i)) ), ((haxe.lang.Function) (new thx.promise._Promise.Promise_Impl__all_42__Fun<T>(results, resolve, i, hasError, counter, this.arr)) ), ((haxe.lang.Function) (new thx.promise._Promise.Promise_Impl__all_50__Fun(reject, hasError)) ));
			}
			
		}
		
		//line 32 "/shared/promise/src/thx/promise/Promise.hx"
		return null;
	}
	
	
	public haxe.root.Array<thx.promise.Future<thx.Either>> arr;
	
}

