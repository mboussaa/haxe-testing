// Generated by Haxe 3.3.0
package thx.fp;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ComparableSet_exists_39__Fun<X> extends haxe.lang.Function
{
	public ComparableSet_exists_39__Fun()
	{
		//line 39 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/Sets.hx"
		super(2, 0);
	}
	
	
	@Override public java.lang.Object __hx_invoke2_o(double __fn_float1, java.lang.Object __fn_dyn1, double __fn_float2, java.lang.Object __fn_dyn2)
	{
		//line 39 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/Sets.hx"
		X b = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (((X) (((java.lang.Object) (__fn_float2) )) )) : (((X) (__fn_dyn2) )) );
		//line 39 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/Sets.hx"
		X a = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((X) (((java.lang.Object) (__fn_float1) )) )) : (((X) (__fn_dyn1) )) );
		//line 39 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/Sets.hx"
		return thx._Ord.Ordering_Impl_.fromInt(((int) (haxe.lang.Runtime.toInt(haxe.lang.Runtime.callField(a, "compareTo", new haxe.root.Array(new java.lang.Object[]{b})))) ));
	}
	
	
}


