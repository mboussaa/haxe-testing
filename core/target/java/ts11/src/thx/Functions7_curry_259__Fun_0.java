// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Functions7_curry_259__Fun_0<F, E, D, C, B, A, H, G> extends haxe.lang.Function
{
	public Functions7_curry_259__Fun_0(F f0, haxe.lang.Function f, E e, D d, C c, B b, A a)
	{
		//line 259 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		super(1, 0);
		//line 259 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		this.f0 = f0;
		//line 259 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		this.f = f;
		//line 259 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		this.e = e;
		//line 259 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		this.d = d;
		//line 259 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		this.c = c;
		//line 259 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		this.b = b;
		//line 259 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		this.a = a;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 259 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		G g = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((G) (((java.lang.Object) (__fn_float1) )) )) : (((G) (__fn_dyn1) )) );
		//line 259 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		return ((H) (this.f.__hx_invokeDynamic(new haxe.root.Array(new java.lang.Object[]{this.a, this.b, this.c, this.d, this.e, this.f0, g}))) );
	}
	
	
	public F f0;
	
	public haxe.lang.Function f;
	
	public E e;
	
	public D d;
	
	public C c;
	
	public B b;
	
	public A a;
	
}


