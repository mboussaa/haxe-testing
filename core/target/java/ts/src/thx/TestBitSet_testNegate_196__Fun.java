// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TestBitSet_testNegate_196__Fun extends haxe.lang.Function
{
	public TestBitSet_testNegate_196__Fun()
	{
		//line 196 "/shared/core/thx/TestBitSet.hx"
		super(3, 0);
	}
	
	
	public static thx.TestBitSet_testNegate_196__Fun __hx_current;
	
	@Override public java.lang.Object __hx_invoke3_o(double __fn_float1, java.lang.Object __fn_dyn1, double __fn_float2, java.lang.Object __fn_dyn2, double __fn_float3, java.lang.Object __fn_dyn3)
	{
		//line 196 "/shared/core/thx/TestBitSet.hx"
		int i5 = ( (( __fn_dyn3 == haxe.lang.Runtime.undefined )) ? (((int) (__fn_float3) )) : (((int) (haxe.lang.Runtime.toInt(__fn_dyn3)) )) );
		//line 196 "/shared/core/thx/TestBitSet.hx"
		java.lang.String char5 = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (haxe.lang.Runtime.toString(__fn_float2)) : (haxe.lang.Runtime.toString(__fn_dyn2)) );
		//line 196 "/shared/core/thx/TestBitSet.hx"
		haxe.root.Array<java.lang.Object> acc5 = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((haxe.root.Array<java.lang.Object>) (((java.lang.Object) (__fn_float1) )) )) : (((haxe.root.Array<java.lang.Object>) (__fn_dyn1) )) );
		//line 196 "/shared/core/thx/TestBitSet.hx"
		thx._BitSet.BitSet_Impl_.setAt(acc5, i5, haxe.lang.Runtime.valEq(char5, "1"));
		//line 196 "/shared/core/thx/TestBitSet.hx"
		return acc5;
	}
	
	
}


