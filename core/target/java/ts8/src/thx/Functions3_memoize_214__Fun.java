// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Functions3_memoize_214__Fun<TOut, T3, T2, T1> extends haxe.lang.Function
{
	public Functions3_memoize_214__Fun(haxe.lang.Function resolver, haxe.ds.StringMap<TOut> map, haxe.lang.Function callback)
	{
		//line 214 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		super(3, 0);
		//line 214 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		this.resolver = resolver;
		//line 214 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		this.map = map;
		//line 214 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		this.callback = callback;
	}
	
	
	@Override public java.lang.Object __hx_invoke3_o(double __fn_float1, java.lang.Object __fn_dyn1, double __fn_float2, java.lang.Object __fn_dyn2, double __fn_float3, java.lang.Object __fn_dyn3)
	{
		//line 214 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		T3 v31 = ( (( __fn_dyn3 == haxe.lang.Runtime.undefined )) ? (((T3) (((java.lang.Object) (__fn_float3) )) )) : (((T3) (__fn_dyn3) )) );
		//line 214 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		T2 v21 = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (((T2) (((java.lang.Object) (__fn_float2) )) )) : (((T2) (__fn_dyn2) )) );
		//line 214 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		T1 v11 = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((T1) (((java.lang.Object) (__fn_float1) )) )) : (((T1) (__fn_dyn1) )) );
		//line 215 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		java.lang.String key = haxe.lang.Runtime.toString(this.resolver.__hx_invoke3_o(0.0, v11, 0.0, v21, 0.0, v31));
		//line 216 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		if (this.map.exists(key)) 
		{
			//line 217 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
			return ((java.lang.Object) (this.map.get(key)) );
		}
		
		//line 218 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		TOut result = ((TOut) (this.callback.__hx_invoke3_o(0.0, v11, 0.0, v21, 0.0, v31)) );
		//line 219 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		this.map.set(key, result);
		//line 220 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		return result;
	}
	
	
	public haxe.lang.Function resolver;
	
	public haxe.ds.StringMap<TOut> map;
	
	public haxe.lang.Function callback;
	
}

