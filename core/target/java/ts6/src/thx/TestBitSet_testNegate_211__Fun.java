// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TestBitSet_testNegate_211__Fun extends haxe.lang.Function
{
	public TestBitSet_testNegate_211__Fun()
	{
		//line 211 "/shared/core/test/thx/TestBitSet.hx"
		super(3, 0);
	}
	
	
	public static thx.TestBitSet_testNegate_211__Fun __hx_current;
	
	@Override public java.lang.Object __hx_invoke3_o(double __fn_float1, java.lang.Object __fn_dyn1, double __fn_float2, java.lang.Object __fn_dyn2, double __fn_float3, java.lang.Object __fn_dyn3)
	{
		//line 211 "/shared/core/test/thx/TestBitSet.hx"
		int i1 = ( (( __fn_dyn3 == haxe.lang.Runtime.undefined )) ? (((int) (__fn_float3) )) : (((int) (haxe.lang.Runtime.toInt(__fn_dyn3)) )) );
		//line 211 "/shared/core/test/thx/TestBitSet.hx"
		java.lang.String char1 = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (haxe.lang.Runtime.toString(__fn_float2)) : (haxe.lang.Runtime.toString(__fn_dyn2)) );
		//line 211 "/shared/core/test/thx/TestBitSet.hx"
		haxe.root.Array<java.lang.Object> acc1 = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((haxe.root.Array<java.lang.Object>) (((java.lang.Object) (__fn_float1) )) )) : (((haxe.root.Array<java.lang.Object>) (__fn_dyn1) )) );
		//line 211 "/shared/core/test/thx/TestBitSet.hx"
		thx._BitSet.BitSet_Impl_.setAt(acc1, i1, haxe.lang.Runtime.valEq(char1, "1"));
		//line 211 "/shared/core/test/thx/TestBitSet.hx"
		return acc1;
	}
	
	
}


