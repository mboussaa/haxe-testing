// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Iterators_filter_87__Fun<TElement> extends haxe.lang.Function
{
	public Iterators_filter_87__Fun(haxe.lang.Function predicate)
	{
		//line 87 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		super(2, 0);
		//line 87 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		this.predicate = predicate;
	}
	
	
	@Override public java.lang.Object __hx_invoke2_o(double __fn_float1, java.lang.Object __fn_dyn1, double __fn_float2, java.lang.Object __fn_dyn2)
	{
		//line 87 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		TElement element = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (((TElement) (((java.lang.Object) (__fn_float2) )) )) : (((TElement) (__fn_dyn2) )) );
		//line 87 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		haxe.root.Array<TElement> acc = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((haxe.root.Array<TElement>) (((java.lang.Object) (__fn_float1) )) )) : (((haxe.root.Array<TElement>) (__fn_dyn1) )) );
		//line 88 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		if (haxe.lang.Runtime.toBool(this.predicate.__hx_invoke1_o(0.0, element))) 
		{
			//line 89 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			acc.push(element);
		}
		
		//line 90 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		return acc;
	}
	
	
	public haxe.lang.Function predicate;
	
}


