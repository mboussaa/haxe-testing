// Generated by Haxe 3.3.0
package thx._BitSet;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class BitSet_Impl__xor_201__Fun extends haxe.lang.Function
{
	public BitSet_Impl__xor_201__Fun()
	{
		//line 201 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitSet.hx"
		super(2, 0);
	}
	
	
	public static thx._BitSet.BitSet_Impl__xor_201__Fun __hx_current;
	
	@Override public java.lang.Object __hx_invoke2_o(double __fn_float1, java.lang.Object __fn_dyn1, double __fn_float2, java.lang.Object __fn_dyn2)
	{
		//line 201 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitSet.hx"
		boolean r = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (haxe.lang.Runtime.toBool(((java.lang.Object) (__fn_float2) ))) : (haxe.lang.Runtime.toBool(__fn_dyn2)) );
		//line 201 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitSet.hx"
		boolean l = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (haxe.lang.Runtime.toBool(((java.lang.Object) (__fn_float1) ))) : (haxe.lang.Runtime.toBool(__fn_dyn1)) );
		//line 201 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitSet.hx"
		if ( ! ((( l &&  ! (r)  ))) ) 
		{
			//line 201 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitSet.hx"
			if ( ! (l) ) 
			{
				//line 201 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitSet.hx"
				return r;
			}
			else
			{
				//line 201 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitSet.hx"
				return false;
			}
			
		}
		else
		{
			//line 201 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitSet.hx"
			return true;
		}
		
	}
	
	
}

