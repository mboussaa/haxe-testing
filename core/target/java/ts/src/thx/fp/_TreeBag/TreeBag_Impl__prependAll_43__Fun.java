// Generated by Haxe 3.3.0
package thx.fp._TreeBag;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TreeBag_Impl__prependAll_43__Fun<A1> extends haxe.lang.Function
{
	public TreeBag_Impl__prependAll_43__Fun()
	{
		//line 43 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/TreeBag.hx"
		super(2, 0);
	}
	
	
	@Override public java.lang.Object __hx_invoke2_o(double __fn_float1, java.lang.Object __fn_dyn1, double __fn_float2, java.lang.Object __fn_dyn2)
	{
		//line 43 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/TreeBag.hx"
		A1 x = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (((A1) (((java.lang.Object) (__fn_float2) )) )) : (((A1) (__fn_dyn2) )) );
		//line 43 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/TreeBag.hx"
		thx.fp.TreeBagImpl acc = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((thx.fp.TreeBagImpl) (((java.lang.Object) (__fn_float1) )) )) : (((thx.fp.TreeBagImpl) (__fn_dyn1) )) );
		//line 43 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/TreeBag.hx"
		return ((thx.fp.TreeBagImpl) (thx.fp.TreeBagImpl.Cons(x, acc)) );
	}
	
	
}


