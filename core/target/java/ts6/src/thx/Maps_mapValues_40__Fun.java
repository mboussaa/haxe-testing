// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Maps_mapValues_40__Fun<TValueA, TValueB, TKey> extends haxe.lang.Function
{
	public Maps_mapValues_40__Fun(haxe.lang.Function f)
	{
		//line 40 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Maps.hx"
		super(2, 0);
		//line 40 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Maps.hx"
		this.f = f;
	}
	
	
	@Override public java.lang.Object __hx_invoke2_o(double __fn_float1, java.lang.Object __fn_dyn1, double __fn_float2, java.lang.Object __fn_dyn2)
	{
		//line 40 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Maps.hx"
		java.lang.Object t = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (((java.lang.Object) (__fn_float2) )) : (((java.lang.Object) (__fn_dyn2) )) );
		//line 40 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Maps.hx"
		haxe.IMap<TKey, TValueB> m = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((haxe.IMap<TKey, TValueB>) (((java.lang.Object) (__fn_float1) )) )) : (((haxe.IMap<TKey, TValueB>) (__fn_dyn1) )) );
		//line 41 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Maps.hx"
		m.set(((TKey) (haxe.lang.Runtime.getField(t, "_0", true)) ), ((TValueB) (this.f.__hx_invoke1_o(0.0, ((TValueA) (haxe.lang.Runtime.getField(t, "_1", true)) ))) ));
		//line 42 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Maps.hx"
		return m;
	}
	
	
	public haxe.lang.Function f;
	
}

