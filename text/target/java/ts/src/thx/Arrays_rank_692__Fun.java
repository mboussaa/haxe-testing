// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Arrays_rank_692__Fun<T> extends haxe.lang.Function
{
	public Arrays_rank_692__Fun(haxe.ds.IntMap<java.lang.Object> usedIndexes, haxe.lang.Function compare, haxe.root.Array<java.lang.Object> arr)
	{
		//line 692 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		super(3, 0);
		//line 692 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		this.usedIndexes = usedIndexes;
		//line 692 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		this.compare = compare;
		//line 692 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		this.arr = arr;
	}
	
	
	@Override public java.lang.Object __hx_invoke3_o(double __fn_float1, java.lang.Object __fn_dyn1, double __fn_float2, java.lang.Object __fn_dyn2, double __fn_float3, java.lang.Object __fn_dyn3)
	{
		//line 692 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		int i1 = ( (( __fn_dyn3 == haxe.lang.Runtime.undefined )) ? (((int) (__fn_float3) )) : (((int) (haxe.lang.Runtime.toInt(__fn_dyn3)) )) );
		//line 692 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		java.lang.Object x = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (((java.lang.Object) (__fn_float2) )) : (((java.lang.Object) (__fn_dyn2) )) );
		//line 692 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		haxe.root.Array<java.lang.Object> acc = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((haxe.root.Array<java.lang.Object>) (((java.lang.Object) (__fn_float1) )) )) : (((haxe.root.Array<java.lang.Object>) (__fn_dyn1) )) );
		//line 693 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		int index = ( (( ( i1 > 0 ) && ( ((int) (this.compare.__hx_invoke2_f(0.0, ((T) (haxe.lang.Runtime.getField(((java.lang.Object) (this.arr.__get(( i1 - 1 ))) ), "_0", true)) ), 0.0, ((T) (haxe.lang.Runtime.getField(((java.lang.Object) (x) ), "_0", true)) ))) ) == 0 ) )) ? (((int) (haxe.lang.Runtime.toInt(acc.__get(((int) (haxe.lang.Runtime.getField_f(((java.lang.Object) (this.arr.__get(( i1 - 1 ))) ), "_1", true)) )))) )) : (i1) );
		//line 694 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		while (((haxe.ds.IntMap<java.lang.Object>) (this.usedIndexes) ).exists(((int) (index) )))
		{
			//line 695 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
			 ++ index;
		}
		
		//line 697 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		thx._Set.Set_Impl_.add(((haxe.IMap<java.lang.Object, java.lang.Object>) (((haxe.IMap) (this.usedIndexes) )) ), ((java.lang.Object) (index) ));
		//line 698 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		acc.__set(((int) (haxe.lang.Runtime.getField_f(((java.lang.Object) (x) ), "_1", true)) ), index);
		//line 699 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		return acc;
	}
	
	
	public haxe.ds.IntMap<java.lang.Object> usedIndexes;
	
	public haxe.lang.Function compare;
	
	public haxe.root.Array<java.lang.Object> arr;
	
}


