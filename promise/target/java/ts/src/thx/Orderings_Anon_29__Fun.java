// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Orderings_Anon_29__Fun extends haxe.lang.Function
{
	public Orderings_Anon_29__Fun()
	{
		//line 29 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ord.hx"
		super(2, 0);
	}
	
	
	public static thx.Orderings_Anon_29__Fun __hx_current;
	
	@Override public java.lang.Object __hx_invoke2_o(double __fn_float1, java.lang.Object __fn_dyn1, double __fn_float2, java.lang.Object __fn_dyn2)
	{
		//line 29 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ord.hx"
		thx.OrderingImpl o1 = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (((thx.OrderingImpl) (((java.lang.Object) (__fn_float2) )) )) : (((thx.OrderingImpl) (__fn_dyn2) )) );
		//line 29 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ord.hx"
		thx.OrderingImpl o0 = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((thx.OrderingImpl) (((java.lang.Object) (__fn_float1) )) )) : (((thx.OrderingImpl) (__fn_dyn1) )) );
		//line 29 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ord.hx"
		switch (o0)
		{
			case LT:
			{
				//line 29 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ord.hx"
				return thx.OrderingImpl.LT;
			}
			
			
			case GT:
			{
				//line 29 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ord.hx"
				return thx.OrderingImpl.GT;
			}
			
			
			case EQ:
			{
				//line 29 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ord.hx"
				return o1;
			}
			
			
		}
		
		//line 29 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ord.hx"
		return null;
	}
	
	
}


