// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Arrays_traverseOption_915__Fun<T, U> extends haxe.lang.Function
{
	public Arrays_traverseOption_915__Fun(haxe.lang.Function f)
	{
		//line 916 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		super(2, 0);
		//line 916 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		this.f = f;
	}
	
	
	@Override public java.lang.Object __hx_invoke2_o(double __fn_float1, java.lang.Object __fn_dyn1, double __fn_float2, java.lang.Object __fn_dyn2)
	{
		//line 915 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		T t = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (((T) (((java.lang.Object) (__fn_float2) )) )) : (((T) (__fn_dyn2) )) );
		//line 915 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		haxe.ds.Option acc = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((haxe.ds.Option) (((java.lang.Object) (__fn_float1) )) )) : (((haxe.ds.Option) (__fn_dyn1) )) );
		//line 916 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		return ((haxe.ds.Option) (thx.Options.ap(((haxe.ds.Option) (this.f.__hx_invoke1_o(0.0, t)) ), ((haxe.ds.Option) (thx.Options.map(((haxe.ds.Option) (acc) ), ((haxe.lang.Function) (new thx.Arrays_traverseOption_916__Fun<U>()) ))) ))) );
	}
	
	
	public haxe.lang.Function f;
	
}


