// Generated by Haxe 3.3.0
package thx._BitMatrix;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class BitMatrix_Impl__xor_120__Fun extends haxe.lang.Function
{
	public BitMatrix_Impl__xor_120__Fun()
	{
		//line 120 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
		super(2, 0);
	}
	
	
	public static thx._BitMatrix.BitMatrix_Impl__xor_120__Fun __hx_current;
	
	@Override public java.lang.Object __hx_invoke2_o(double __fn_float1, java.lang.Object __fn_dyn1, double __fn_float2, java.lang.Object __fn_dyn2)
	{
		//line 120 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
		boolean r = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (haxe.lang.Runtime.toBool(((java.lang.Object) (__fn_float2) ))) : (haxe.lang.Runtime.toBool(__fn_dyn2)) );
		//line 120 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
		boolean l = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (haxe.lang.Runtime.toBool(((java.lang.Object) (__fn_float1) ))) : (haxe.lang.Runtime.toBool(__fn_dyn1)) );
		//line 120 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
		if ( ! ((( l &&  ! (r)  ))) ) 
		{
			//line 120 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
			if ( ! (l) ) 
			{
				//line 120 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
				return r;
			}
			else
			{
				//line 120 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
				return false;
			}
			
		}
		else
		{
			//line 120 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitMatrix.hx"
			return true;
		}
		
	}
	
	
}


