// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Arrays_traverseValidation_925__Fun<T, U, E> extends haxe.lang.Function
{
	public Arrays_traverseValidation_925__Fun(haxe.lang.Function s, haxe.lang.Function f)
	{
		//line 926 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		super(2, 0);
		//line 926 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		this.s = s;
		//line 926 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		this.f = f;
	}
	
	
	@Override public java.lang.Object __hx_invoke2_o(double __fn_float1, java.lang.Object __fn_dyn1, double __fn_float2, java.lang.Object __fn_dyn2)
	{
		//line 925 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		T t = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (((T) (((java.lang.Object) (__fn_float2) )) )) : (((T) (__fn_dyn2) )) );
		//line 925 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		thx.Either acc = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((thx.Either) (((java.lang.Object) (__fn_float1) )) )) : (((thx.Either) (__fn_dyn1) )) );
		//line 926 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		return ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (this.f.__hx_invoke1_o(0.0, t)) ), ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (acc) ), ((thx.Either) (thx.Either.Right(new thx.Arrays_traverseValidation_926__Fun_0<U>())) ), ((haxe.lang.Function) (new thx.Arrays_traverseValidation_926__Fun<E>()) ))) ), ((haxe.lang.Function) (this.s) ))) );
	}
	
	
	public haxe.lang.Function s;
	
	public haxe.lang.Function f;
	
}


