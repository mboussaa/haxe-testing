// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Objects_toMap_123__Fun extends haxe.lang.Function
{
	public Objects_toMap_123__Fun()
	{
		//line 123 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		super(2, 0);
	}
	
	
	public static thx.Objects_toMap_123__Fun __hx_current;
	
	@Override public java.lang.Object __hx_invoke2_o(double __fn_float1, java.lang.Object __fn_dyn1, double __fn_float2, java.lang.Object __fn_dyn2)
	{
		//line 123 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		java.lang.Object t = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (((java.lang.Object) (__fn_float2) )) : (((java.lang.Object) (__fn_dyn2) )) );
		//line 123 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		haxe.ds.StringMap map = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((haxe.ds.StringMap) (((java.lang.Object) (__fn_float1) )) )) : (((haxe.ds.StringMap) (__fn_dyn1) )) );
		//line 124 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		map.set(haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(t, "_0", true)), ((java.lang.Object) (haxe.lang.Runtime.getField(t, "_1", true)) ));
		//line 125 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		return map;
	}
	
	
}


