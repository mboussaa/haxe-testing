// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Arrays_zip4Ap_1092__Fun_0<C, B, A, E, D> extends haxe.lang.Function
{
	public Arrays_zip4Ap_1092__Fun_0(haxe.lang.Function f1, C c, B b, A a)
	{
		//line 1092 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		super(1, 0);
		//line 1092 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		this.f1 = f1;
		//line 1092 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		this.c = c;
		//line 1092 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		this.b = b;
		//line 1092 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		this.a = a;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 1092 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		D d = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((D) (((java.lang.Object) (__fn_float1) )) )) : (((D) (__fn_dyn1) )) );
		//line 1092 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		return ((E) (this.f1.__hx_invoke4_o(0.0, this.a, 0.0, this.b, 0.0, this.c, 0.0, d)) );
	}
	
	
	public haxe.lang.Function f1;
	
	public C c;
	
	public B b;
	
	public A a;
	
}

