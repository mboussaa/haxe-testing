// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Arrays_intersperse_607__Fun<T> extends haxe.lang.Function
{
	public Arrays_intersperse_607__Fun()
	{
		//line 607 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		super(3, 0);
	}
	
	
	@Override public java.lang.Object __hx_invoke3_o(double __fn_float1, java.lang.Object __fn_dyn1, double __fn_float2, java.lang.Object __fn_dyn2, double __fn_float3, java.lang.Object __fn_dyn3)
	{
		//line 607 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		int i = ( (( __fn_dyn3 == haxe.lang.Runtime.undefined )) ? (((int) (__fn_float3) )) : (((int) (haxe.lang.Runtime.toInt(__fn_dyn3)) )) );
		//line 607 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		T v = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (((T) (((java.lang.Object) (__fn_float2) )) )) : (((T) (__fn_dyn2) )) );
		//line 607 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		haxe.root.Array<T> acc = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((haxe.root.Array<T>) (((java.lang.Object) (__fn_float1) )) )) : (((haxe.root.Array<T>) (__fn_dyn1) )) );
		//line 608 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		acc.__set(( i * 2 ), v);
		//line 609 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		return acc;
	}
	
	
}


