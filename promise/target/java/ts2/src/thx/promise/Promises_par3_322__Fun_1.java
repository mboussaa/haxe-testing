// Generated by Haxe 3.3.0
package thx.promise;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Promises_par3_322__Fun_1<T2, T1, T4, T3> extends haxe.lang.Function
{
	public Promises_par3_322__Fun_1(haxe.lang.Function f1, T2 b, T1 a)
	{
		//line 322 "/shared/promise/src/thx/promise/Promise.hx"
		super(1, 0);
		//line 322 "/shared/promise/src/thx/promise/Promise.hx"
		this.f1 = f1;
		//line 322 "/shared/promise/src/thx/promise/Promise.hx"
		this.b = b;
		//line 322 "/shared/promise/src/thx/promise/Promise.hx"
		this.a = a;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 322 "/shared/promise/src/thx/promise/Promise.hx"
		T3 c = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((T3) (((java.lang.Object) (__fn_float1) )) )) : (((T3) (__fn_dyn1) )) );
		//line 322 "/shared/promise/src/thx/promise/Promise.hx"
		return ((T4) (this.f1.__hx_invoke3_o(0.0, this.a, 0.0, this.b, 0.0, c)) );
	}
	
	
	public haxe.lang.Function f1;
	
	public T2 b;
	
	public T1 a;
	
}

