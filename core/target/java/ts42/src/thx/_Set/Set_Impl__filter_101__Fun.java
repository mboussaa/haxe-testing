// Generated by Haxe 3.3.0
package thx._Set;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Set_Impl__filter_101__Fun<T> extends haxe.lang.Function
{
	public Set_Impl__filter_101__Fun(haxe.lang.Function predicate)
	{
		//line 101 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Set.hx"
		super(2, 0);
		//line 101 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Set.hx"
		this.predicate = predicate;
	}
	
	
	@Override public java.lang.Object __hx_invoke2_o(double __fn_float1, java.lang.Object __fn_dyn1, double __fn_float2, java.lang.Object __fn_dyn2)
	{
		//line 101 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Set.hx"
		T v = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (((T) (((java.lang.Object) (__fn_float2) )) )) : (((T) (__fn_dyn2) )) );
		//line 101 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Set.hx"
		haxe.IMap<T, java.lang.Object> acc = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((haxe.IMap<T, java.lang.Object>) (((java.lang.Object) (__fn_float1) )) )) : (((haxe.IMap<T, java.lang.Object>) (__fn_dyn1) )) );
		//line 102 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Set.hx"
		if (haxe.lang.Runtime.toBool(this.predicate.__hx_invoke1_o(0.0, v))) 
		{
			//line 103 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Set.hx"
			thx._Set.Set_Impl_.add(((haxe.IMap<T, java.lang.Object>) (acc) ), ((T) (v) ));
		}
		
		//line 104 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Set.hx"
		return acc;
	}
	
	
	public haxe.lang.Function predicate;
	
}


