// Generated by Haxe 3.3.0
package thx._Validation;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Validation_Impl__foldMap_61__Fun<B> extends haxe.lang.Function
{
	public Validation_Impl__foldMap_61__Fun(java.lang.Object _e)
	{
		//line 61 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		super(2, 0);
		//line 61 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		this._e = _e;
	}
	
	
	@Override public java.lang.Object __hx_invoke2_o(double __fn_float1, java.lang.Object __fn_dyn1, double __fn_float2, java.lang.Object __fn_dyn2)
	{
		//line 61 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		B a1 = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (((B) (((java.lang.Object) (__fn_float2) )) )) : (((B) (__fn_dyn2) )) );
		//line 61 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		B a0 = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((B) (((java.lang.Object) (__fn_float1) )) )) : (((B) (__fn_dyn1) )) );
		//line 61 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		return ((B) (thx._Monoid.Monoid_Impl_.append(((java.lang.Object) (this._e) ), ((B) (a0) ), ((B) (a1) ))) );
	}
	
	
	public java.lang.Object _e;
	
}

