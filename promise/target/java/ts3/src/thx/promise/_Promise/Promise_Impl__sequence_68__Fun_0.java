// Generated by Haxe 3.3.0
package thx.promise._Promise;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Promise_Impl__sequence_68__Fun_0<T> extends haxe.lang.Function
{
	public Promise_Impl__sequence_68__Fun_0(haxe.root.Array<T> arr1)
	{
		//line 68 "/shared/promise/src/thx/promise/Promise.hx"
		super(1, 0);
		//line 68 "/shared/promise/src/thx/promise/Promise.hx"
		this.arr1 = arr1;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 68 "/shared/promise/src/thx/promise/Promise.hx"
		T t = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((T) (((java.lang.Object) (__fn_float1) )) )) : (((T) (__fn_dyn1) )) );
		//line 68 "/shared/promise/src/thx/promise/Promise.hx"
		return this.arr1.concat(new haxe.root.Array<T>(( (T[]) (new java.lang.Object[] {t}) )));
	}
	
	
	public haxe.root.Array<T> arr1;
	
}


