// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Functions1_memoize_107__Fun<TOut, TIn> extends haxe.lang.Function
{
	public Functions1_memoize_107__Fun(haxe.lang.Function resolver, haxe.ds.StringMap<TOut> map, haxe.lang.Function callback)
	{
		//line 107 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		super(1, 0);
		//line 107 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		this.resolver = resolver;
		//line 107 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		this.map = map;
		//line 107 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		this.callback = callback;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 107 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		TIn v1 = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((TIn) (((java.lang.Object) (__fn_float1) )) )) : (((TIn) (__fn_dyn1) )) );
		//line 108 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		java.lang.String key = haxe.lang.Runtime.toString(this.resolver.__hx_invoke1_o(0.0, v1));
		//line 109 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		if (this.map.exists(key)) 
		{
			//line 110 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
			return ((java.lang.Object) (this.map.get(key)) );
		}
		
		//line 111 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		TOut result = ((TOut) (this.callback.__hx_invoke1_o(0.0, v1)) );
		//line 112 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		this.map.set(key, result);
		//line 113 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		return result;
	}
	
	
	public haxe.lang.Function resolver;
	
	public haxe.ds.StringMap<TOut> map;
	
	public haxe.lang.Function callback;
	
}


