// Generated by Haxe 3.3.0
package thx.promise;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Promises_par4_325__Fun_0<T4, T5, T3, T2, T1> extends haxe.lang.Function
{
	public Promises_par4_325__Fun_0(haxe.lang.Function f1)
	{
		//line 325 "/shared/promise/src/thx/promise/Promise.hx"
		super(3, 0);
		//line 325 "/shared/promise/src/thx/promise/Promise.hx"
		this.f1 = f1;
	}
	
	
	@Override public java.lang.Object __hx_invoke3_o(double __fn_float1, java.lang.Object __fn_dyn1, double __fn_float2, java.lang.Object __fn_dyn2, double __fn_float3, java.lang.Object __fn_dyn3)
	{
		//line 325 "/shared/promise/src/thx/promise/Promise.hx"
		T3 c = ( (( __fn_dyn3 == haxe.lang.Runtime.undefined )) ? (((T3) (((java.lang.Object) (__fn_float3) )) )) : (((T3) (__fn_dyn3) )) );
		//line 325 "/shared/promise/src/thx/promise/Promise.hx"
		T2 b = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (((T2) (((java.lang.Object) (__fn_float2) )) )) : (((T2) (__fn_dyn2) )) );
		//line 325 "/shared/promise/src/thx/promise/Promise.hx"
		T1 a = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((T1) (((java.lang.Object) (__fn_float1) )) )) : (((T1) (__fn_dyn1) )) );
		//line 325 "/shared/promise/src/thx/promise/Promise.hx"
		return new thx.promise.Promises_par4_325__Fun_1<T3, T2, T1, T5, T4>(this.f1, c, b, a);
	}
	
	
	public haxe.lang.Function f1;
	
}

