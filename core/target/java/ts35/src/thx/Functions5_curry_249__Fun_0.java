// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Functions5_curry_249__Fun_0<D, C, B, A, F, E> extends haxe.lang.Function
{
	public Functions5_curry_249__Fun_0(haxe.lang.Function f, D d, C c, B b, A a)
	{
		//line 249 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		super(1, 0);
		//line 249 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		this.f = f;
		//line 249 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		this.d = d;
		//line 249 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		this.c = c;
		//line 249 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		this.b = b;
		//line 249 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		this.a = a;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 249 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		E e = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((E) (((java.lang.Object) (__fn_float1) )) )) : (((E) (__fn_dyn1) )) );
		//line 249 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		return ((F) (this.f.__hx_invoke5_o(0.0, this.a, 0.0, this.b, 0.0, this.c, 0.0, this.d, 0.0, e)) );
	}
	
	
	public haxe.lang.Function f;
	
	public D d;
	
	public C c;
	
	public B b;
	
	public A a;
	
}

