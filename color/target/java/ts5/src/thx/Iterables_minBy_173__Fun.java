// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Iterables_minBy_173__Fun<B, A> extends haxe.lang.Function
{
	public Iterables_minBy_173__Fun(haxe.lang.Function ord, haxe.lang.Function f, A a)
	{
		//line 173 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterables.hx"
		super(1, 0);
		//line 173 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterables.hx"
		this.ord = ord;
		//line 173 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterables.hx"
		this.f = f;
		//line 173 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterables.hx"
		this.a = a;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 173 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterables.hx"
		A a0 = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((A) (((java.lang.Object) (__fn_float1) )) )) : (((A) (__fn_dyn1) )) );
		//line 173 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterables.hx"
		return ( ((thx.OrderingImpl) (this.ord.__hx_invoke2_o(0.0, ((B) (this.f.__hx_invoke1_o(0.0, a0)) ), 0.0, ((B) (this.f.__hx_invoke1_o(0.0, this.a)) ))) ) == thx.OrderingImpl.LT );
	}
	
	
	public haxe.lang.Function ord;
	
	public haxe.lang.Function f;
	
	public A a;
	
}


