// Generated by Haxe 3.3.0
package thx.fp._Writer;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Writer_Impl__ap5_74__Fun_1<D, E, F, C, B, A> extends haxe.lang.Function
{
	public Writer_Impl__ap5_74__Fun_1(haxe.lang.Function f2)
	{
		//line 74 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/Writer.hx"
		super(3, 0);
		//line 74 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/Writer.hx"
		this.f2 = f2;
	}
	
	
	@Override public java.lang.Object __hx_invoke3_o(double __fn_float1, java.lang.Object __fn_dyn1, double __fn_float2, java.lang.Object __fn_dyn2, double __fn_float3, java.lang.Object __fn_dyn3)
	{
		//line 74 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/Writer.hx"
		C c1 = ( (( __fn_dyn3 == haxe.lang.Runtime.undefined )) ? (((C) (((java.lang.Object) (__fn_float3) )) )) : (((C) (__fn_dyn3) )) );
		//line 74 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/Writer.hx"
		B b1 = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (((B) (((java.lang.Object) (__fn_float2) )) )) : (((B) (__fn_dyn2) )) );
		//line 74 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/Writer.hx"
		A a1 = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((A) (((java.lang.Object) (__fn_float1) )) )) : (((A) (__fn_dyn1) )) );
		//line 74 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/Writer.hx"
		return new thx.fp._Writer.Writer_Impl__ap5_74__Fun_2<C, B, A, E, F, D>(this.f2, c1, b1, a1);
	}
	
	
	public haxe.lang.Function f2;
	
}

