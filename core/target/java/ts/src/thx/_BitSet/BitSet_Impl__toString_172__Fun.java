// Generated by Haxe 3.3.0
package thx._BitSet;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class BitSet_Impl__toString_172__Fun extends haxe.lang.Function
{
	public BitSet_Impl__toString_172__Fun(haxe.root.Array<java.lang.Object> this1)
	{
		//line 173 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitSet.hx"
		super(1, 0);
		//line 173 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitSet.hx"
		this.this1 = this1;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 172 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitSet.hx"
		int index = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((int) (__fn_float1) )) : (((int) (haxe.lang.Runtime.toInt(__fn_dyn1)) )) );
		//line 173 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitSet.hx"
		if (thx._BitSet.BitSet_Impl_.at(this.this1, index)) 
		{
			//line 173 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitSet.hx"
			return "1";
		}
		else
		{
			//line 173 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/BitSet.hx"
			return "0";
		}
		
	}
	
	
	public haxe.root.Array<java.lang.Object> this1;
	
}


