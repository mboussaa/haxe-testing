// Generated by Haxe 3.3.0
package thx.fp._State;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class State_Impl__ap7_85__Fun<A, B, C, D, E, F, G, H, S> extends haxe.lang.Function
{
	public State_Impl__ap7_85__Fun(haxe.lang.Function this1, haxe.lang.Function f6)
	{
		//line 85 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/State.hx"
		super(1, 0);
		//line 85 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/State.hx"
		this.this1 = this1;
		//line 85 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/State.hx"
		this.f6 = f6;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 85 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/State.hx"
		S s = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((S) (((java.lang.Object) (__fn_float1) )) )) : (((S) (__fn_dyn1) )) );
		//line 85 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/State.hx"
		return ((java.lang.Object) (thx._Tuple.Tuple2_Impl_.map(((java.lang.Object) (((haxe.lang.Function) (this.this1) ).__hx_invoke1_o(0.0, s)) ), ((haxe.lang.Function) (this.f6) ))) );
	}
	
	
	public haxe.lang.Function this1;
	
	public haxe.lang.Function f6;
	
}

