// Generated by Haxe 3.3.0
package thx._BitMatrix;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class BitMatrix_Impl__concat_79__Fun extends haxe.lang.Function
{
	public BitMatrix_Impl__concat_79__Fun(haxe.root.Array<haxe.root.Array<java.lang.Object>> right, haxe.root.Array<haxe.root.Array<java.lang.Object>> left)
	{
		//line 79 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
		super(2, 0);
		//line 79 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
		this.right = right;
		//line 79 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
		this.left = left;
	}
	
	
	@Override public java.lang.Object __hx_invoke2_o(double __fn_float1, java.lang.Object __fn_dyn1, double __fn_float2, java.lang.Object __fn_dyn2)
	{
		//line 79 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
		int bitSetIndex = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (((int) (__fn_float2) )) : (((int) (haxe.lang.Runtime.toInt(__fn_dyn2)) )) );
		//line 79 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
		haxe.root.Array<haxe.root.Array<java.lang.Object>> bitSets1 = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((haxe.root.Array<haxe.root.Array<java.lang.Object>>) (((java.lang.Object) (__fn_float1) )) )) : (((haxe.root.Array<haxe.root.Array<java.lang.Object>>) (__fn_dyn1) )) );
		//line 80 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
		haxe.root.Array<java.lang.Object> this2 = thx._BitMatrix.BitMatrix_Impl_.bitSetAt(this.left, bitSetIndex);
		//line 80 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
		haxe.root.Array<java.lang.Object> right1 = thx._BitMatrix.BitMatrix_Impl_.bitSetAt(this.right, bitSetIndex);
		//line 80 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
		haxe.root.Array<java.lang.Object> left1 = ((haxe.root.Array<java.lang.Object>) (this2) );
		//line 80 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
		int length = ( ((int) (thx._BitSet.BitSet_Impl_.get_length(left1)) ) + ((int) (thx._BitSet.BitSet_Impl_.get_length(right1)) ) );
		//line 80 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
		haxe.root.Array<java.lang.Object> this3 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{length});
		//line 80 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
		int size = ( ((int) (( length / 32 )) ) + 1 );
		//line 80 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
		thx.Arrays.resize(((haxe.root.Array<java.lang.Object>) (((haxe.root.Array) (this3) )) ), ((int) (( size + 1 )) ), ((java.lang.Object) (0) ));
		//line 80 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
		haxe.root.Array<java.lang.Object> result = ((haxe.root.Array<java.lang.Object>) (this3) );
		//line 80 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
		int index = 0;
		//line 80 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
		{
			//line 80 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
			int _g1 = 0;
			//line 80 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
			int _g = ((int) (thx._BitSet.BitSet_Impl_.get_length(left1)) );
			//line 80 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
			while (( _g1 < _g ))
			{
				//line 80 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
				int leftIndex = _g1++;
				//line 80 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
				thx._BitSet.BitSet_Impl_.setAt(result, index++, thx._BitSet.BitSet_Impl_.at(left1, leftIndex));
			}
			
		}
		
		//line 80 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
		{
			//line 80 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
			int _g11 = 0;
			//line 80 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
			int _g2 = ((int) (thx._BitSet.BitSet_Impl_.get_length(right1)) );
			//line 80 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
			while (( _g11 < _g2 ))
			{
				//line 80 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
				int rightIndex = _g11++;
				//line 80 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
				thx._BitSet.BitSet_Impl_.setAt(result, index++, thx._BitSet.BitSet_Impl_.at(right1, rightIndex));
			}
			
		}
		
		//line 80 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
		bitSets1.__set(bitSetIndex, result);
		//line 81 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
		return bitSets1;
	}
	
	
	public haxe.root.Array<haxe.root.Array<java.lang.Object>> right;
	
	public haxe.root.Array<haxe.root.Array<java.lang.Object>> left;
	
}

