// Generated by Haxe 3.3.0
package thx._Functions;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Reader_Impl__flatMap_274__Fun<B, C, A> extends haxe.lang.Function
{
	public Reader_Impl__flatMap_274__Fun(haxe.lang.Function this1, haxe.lang.Function f)
	{
		//line 275 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		super(1, 0);
		//line 275 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		this.this1 = this1;
		//line 275 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		this.f = f;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 274 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		A a = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((A) (((java.lang.Object) (__fn_float1) )) )) : (((A) (__fn_dyn1) )) );
		//line 275 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		return ((C) (((haxe.lang.Function) (this.f.__hx_invoke1_o(0.0, ((B) (this.this1.__hx_invoke1_o(0.0, a)) ))) ).__hx_invoke1_o(0.0, a)) );
	}
	
	
	public haxe.lang.Function this1;
	
	public haxe.lang.Function f;
	
}


