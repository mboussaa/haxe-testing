// Generated by Haxe 3.3.0
package thx._BitMatrix;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class BitMatrix_Impl__expand_87__Fun extends haxe.lang.Function
{
	public BitMatrix_Impl__expand_87__Fun(int count)
	{
		//line 88 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
		super(1, 0);
		//line 88 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
		this.count = count;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 87 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
		haxe.root.Array<java.lang.Object> bitSet = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((haxe.root.Array<java.lang.Object>) (((java.lang.Object) (__fn_float1) )) )) : (((haxe.root.Array<java.lang.Object>) (__fn_dyn1) )) );
		//line 88 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
		return thx._BitSet.BitSet_Impl_.expand(bitSet, this.count);
	}
	
	
	public int count;
	
}


