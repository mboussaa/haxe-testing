// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Functions9_curry_269__Fun<I, J, H, G, F, E, D, C, B, A> extends haxe.lang.Function
{
	public Functions9_curry_269__Fun(haxe.lang.Function f)
	{
		//line 269 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		super(8, 0);
		//line 269 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		this.f = f;
	}
	
	
	@Override public java.lang.Object __hx_invokeDynamic(haxe.root.Array __fn_dynargs)
	{
		//line 269 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		H h = ((H) (__fn_dynargs.__get(7)) );
		//line 269 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		G g = ((G) (__fn_dynargs.__get(6)) );
		//line 269 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		F f0 = ((F) (__fn_dynargs.__get(5)) );
		//line 269 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		E e = ((E) (__fn_dynargs.__get(4)) );
		//line 269 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		D d = ((D) (__fn_dynargs.__get(3)) );
		//line 269 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		C c = ((C) (__fn_dynargs.__get(2)) );
		//line 269 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		B b = ((B) (__fn_dynargs.__get(1)) );
		//line 269 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		A a = ((A) (__fn_dynargs.__get(0)) );
		//line 269 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		return new thx.Functions9_curry_269__Fun_0<H, G, F, E, D, C, B, A, J, I>(h, g, f0, this.f, e, d, c, b, a);
	}
	
	
	public haxe.lang.Function f;
	
}


