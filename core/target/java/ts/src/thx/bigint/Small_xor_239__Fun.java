// Generated by Haxe 3.3.0
package thx.bigint;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Small_xor_239__Fun extends haxe.lang.Function
{
	public Small_xor_239__Fun()
	{
		//line 239 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/bigint/Small.hx"
		super(2, 1);
	}
	
	
	public static thx.bigint.Small_xor_239__Fun __hx_current;
	
	@Override public double __hx_invoke2_f(double __fn_float1, java.lang.Object __fn_dyn1, double __fn_float2, java.lang.Object __fn_dyn2)
	{
		//line 239 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/bigint/Small.hx"
		int b = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (((int) (__fn_float2) )) : (((int) (haxe.lang.Runtime.toInt(__fn_dyn2)) )) );
		//line 239 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/bigint/Small.hx"
		int a = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((int) (__fn_float1) )) : (((int) (haxe.lang.Runtime.toInt(__fn_dyn1)) )) );
		//line 239 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/bigint/Small.hx"
		return ((double) (( a ^ b )) );
	}
	
	
}


