// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TestBitSet_testClone_219__Fun extends haxe.lang.Function
{
	public TestBitSet_testClone_219__Fun(haxe.root.Array<java.lang.Object> this2)
	{
		//line 219 "/shared/core/test/thx/TestBitSet.hx"
		super(2, 0);
		//line 219 "/shared/core/test/thx/TestBitSet.hx"
		this.this2 = this2;
	}
	
	
	@Override public java.lang.Object __hx_invoke2_o(double __fn_float1, java.lang.Object __fn_dyn1, double __fn_float2, java.lang.Object __fn_dyn2)
	{
		//line 219 "/shared/core/test/thx/TestBitSet.hx"
		int i1 = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (((int) (__fn_float2) )) : (((int) (haxe.lang.Runtime.toInt(__fn_dyn2)) )) );
		//line 219 "/shared/core/test/thx/TestBitSet.hx"
		haxe.root.Array<java.lang.Object> acc1 = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((haxe.root.Array<java.lang.Object>) (((java.lang.Object) (__fn_float1) )) )) : (((haxe.root.Array<java.lang.Object>) (__fn_dyn1) )) );
		//line 219 "/shared/core/test/thx/TestBitSet.hx"
		thx._BitSet.BitSet_Impl_.setAt(acc1, i1, thx._BitSet.BitSet_Impl_.at(((haxe.root.Array<java.lang.Object>) (this.this2) ), i1));
		//line 219 "/shared/core/test/thx/TestBitSet.hx"
		return acc1;
	}
	
	
	public haxe.root.Array<java.lang.Object> this2;
	
}


