// Generated by Haxe 3.3.0
package thx._BitMatrix;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class BitMatrix_Impl__combine_182__Fun extends haxe.lang.Function
{
	public BitMatrix_Impl__combine_182__Fun(haxe.root.Array<haxe.root.Array<java.lang.Object>> this1, haxe.root.Array<haxe.root.Array<java.lang.Object>> right, haxe.root.Array<haxe.root.Array<java.lang.Object>> left, haxe.lang.Function combiner)
	{
		//line 183 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
		super(2, 0);
		//line 183 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
		this.this1 = this1;
		//line 183 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
		this.right = right;
		//line 183 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
		this.left = left;
		//line 183 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
		this.combiner = combiner;
	}
	
	
	@Override public java.lang.Object __hx_invoke2_o(double __fn_float1, java.lang.Object __fn_dyn1, double __fn_float2, java.lang.Object __fn_dyn2)
	{
		//line 182 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
		int bitSetIndex = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (((int) (__fn_float2) )) : (((int) (haxe.lang.Runtime.toInt(__fn_dyn2)) )) );
		//line 182 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
		haxe.root.Array<haxe.root.Array<java.lang.Object>> acc = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((haxe.root.Array<haxe.root.Array<java.lang.Object>>) (((java.lang.Object) (__fn_float1) )) )) : (((haxe.root.Array<haxe.root.Array<java.lang.Object>>) (__fn_dyn1) )) );
		//line 183 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
		return ((haxe.root.Array<haxe.root.Array<java.lang.Object>>) (thx.Arrays.reduce(((haxe.root.Array<java.lang.Object>) (((haxe.root.Array) (thx.Ints.range(thx._BitMatrix.BitMatrix_Impl_.get_length(this.this1), null, null)) )) ), ((haxe.lang.Function) (new thx._BitMatrix.BitMatrix_Impl__combine_183__Fun(this.right, this.left, this.combiner, bitSetIndex)) ), ((haxe.root.Array<haxe.root.Array<java.lang.Object>>) (acc) ))) );
	}
	
	
	public haxe.root.Array<haxe.root.Array<java.lang.Object>> this1;
	
	public haxe.root.Array<haxe.root.Array<java.lang.Object>> right;
	
	public haxe.root.Array<haxe.root.Array<java.lang.Object>> left;
	
	public haxe.lang.Function combiner;
	
}


