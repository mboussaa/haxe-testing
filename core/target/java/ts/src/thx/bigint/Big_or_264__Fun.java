// Generated by Haxe 3.3.0
package thx.bigint;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Big_or_264__Fun extends haxe.lang.Function
{
	public Big_or_264__Fun()
	{
		//line 264 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/bigint/Big.hx"
		super(2, 1);
	}
	
	
	public static thx.bigint.Big_or_264__Fun __hx_current;
	
	@Override public double __hx_invoke2_f(double __fn_float1, java.lang.Object __fn_dyn1, double __fn_float2, java.lang.Object __fn_dyn2)
	{
		//line 264 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/bigint/Big.hx"
		int b = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (((int) (__fn_float2) )) : (((int) (haxe.lang.Runtime.toInt(__fn_dyn2)) )) );
		//line 264 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/bigint/Big.hx"
		int a = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((int) (__fn_float1) )) : (((int) (haxe.lang.Runtime.toInt(__fn_dyn1)) )) );
		//line 264 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/bigint/Big.hx"
		return ((double) (( a | b )) );
	}
	
	
}


