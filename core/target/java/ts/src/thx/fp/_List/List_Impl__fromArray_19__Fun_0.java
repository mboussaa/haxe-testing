// Generated by Haxe 3.3.0
package thx.fp._List;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class List_Impl__fromArray_19__Fun_0<A> extends haxe.lang.Function
{
	public List_Impl__fromArray_19__Fun_0()
	{
		//line 86 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/macro/lambda/SlambdaMacro.hx"
		super(2, 0);
	}
	
	
	@Override public java.lang.Object __hx_invoke2_o(double __fn_float1, java.lang.Object __fn_dyn1, double __fn_float2, java.lang.Object __fn_dyn2)
	{
		//line 19 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
		java.lang.Object _1 = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (((java.lang.Object) (__fn_float2) )) : (( (( __fn_dyn2 == null )) ? (null) : (((java.lang.Object) (__fn_dyn2) )) )) );
		//line 19 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
		thx.fp.ListImpl _0 = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((thx.fp.ListImpl) (((java.lang.Object) (__fn_float1) )) )) : (( (( __fn_dyn1 == null )) ? (null) : (((thx.fp.ListImpl) (__fn_dyn1) )) )) );
		//line 86 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/macro/lambda/SlambdaMacro.hx"
		return ((thx.fp.ListImpl) (thx.fp.ListImpl.Cons(_1, _0)) );
	}
	
	
}

