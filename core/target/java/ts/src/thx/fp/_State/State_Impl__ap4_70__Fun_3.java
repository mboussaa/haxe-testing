// Generated by Haxe 3.3.0
package thx.fp._State;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class State_Impl__ap4_70__Fun_3<C, B, A, E, D> extends haxe.lang.Function
{
	public State_Impl__ap4_70__Fun_3(haxe.lang.Function f1, C c, B b, A a)
	{
		//line 70 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/State.hx"
		super(1, 0);
		//line 70 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/State.hx"
		this.f1 = f1;
		//line 70 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/State.hx"
		this.c = c;
		//line 70 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/State.hx"
		this.b = b;
		//line 70 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/State.hx"
		this.a = a;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 70 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/State.hx"
		D d = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((D) (((java.lang.Object) (__fn_float1) )) )) : (((D) (__fn_dyn1) )) );
		//line 70 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/State.hx"
		return ((E) (this.f1.__hx_invoke4_o(0.0, this.a, 0.0, this.b, 0.0, this.c, 0.0, d)) );
	}
	
	
	public haxe.lang.Function f1;
	
	public C c;
	
	public B b;
	
	public A a;
	
}


