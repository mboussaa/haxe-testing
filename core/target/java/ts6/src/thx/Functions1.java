// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Functions1 extends haxe.lang.HxObject
{
	public Functions1(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Functions1()
	{
		//line 67 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		thx.Functions1.__hx_ctor_thx_Functions1(this);
	}
	
	
	public static void __hx_ctor_thx_Functions1(thx.Functions1 __temp_me81)
	{
	}
	
	
	public static <TIn, TRet1, TRet2> haxe.lang.Function compose(haxe.lang.Function fa, haxe.lang.Function fb)
	{
		//line 73 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		return new thx.Functions1_compose_73__Fun<TRet2, TRet1, TIn>(fb, fa);
	}
	
	
	public static <A, B, C> haxe.lang.Function map(haxe.lang.Function fab, haxe.lang.Function fbc)
	{
		//line 79 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		return new thx.Functions1_map_79__Fun<B, C, A>(fbc, fab);
	}
	
	
	public static <A, B, C> haxe.lang.Function contramap(haxe.lang.Function fbc, haxe.lang.Function fab)
	{
		//line 85 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		return new thx.Functions1_contramap_85__Fun<B, C, A>(fbc, fab);
	}
	
	
	public static <TIn> haxe.lang.Function join(haxe.lang.Function fa, haxe.lang.Function fb)
	{
		//line 92 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		return new thx.Functions1_join_92__Fun<TIn>(fb, fa);
	}
	
	
	public static <TIn, TOut> haxe.lang.Function memoize(haxe.lang.Function callback, haxe.lang.Function resolver)
	{
		//line 104 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		if (( null == resolver )) 
		{
			//line 105 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
			resolver = new thx.Functions1_memoize_105__Fun<TIn>();
		}
		
		//line 106 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		haxe.ds.StringMap<TOut> map = new haxe.ds.StringMap<TOut>();
		//line 107 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		return new thx.Functions1_memoize_107__Fun<TOut, TIn>(resolver, map, callback);
	}
	
	
	public static <T1> haxe.lang.Function negate(haxe.lang.Function callback)
	{
		//line 121 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		return new thx.Functions1_negate_121__Fun<T1>(callback);
	}
	
	
	public static <T> void noop(T _1)
	{
	}
	
	
	public static <TIn, TOut> haxe.lang.Function times(int n, haxe.lang.Function callback)
	{
		//line 133 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		return new thx.Functions1_times_133__Fun<TOut, TIn>(n, callback);
	}
	
	
	public static <TIn, TOut> haxe.lang.Function timesi(int n, haxe.lang.Function callback)
	{
		//line 142 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		return new thx.Functions1_timesi_142__Fun<TOut, TIn>(n, callback);
	}
	
	
	public static <T1, T2, TReturn> haxe.lang.Function swapArguments(haxe.lang.Function callback)
	{
		//line 149 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		return new thx.Functions1_swapArguments_149__Fun<TReturn, T1, T2>(callback);
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 67 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		return new thx.Functions1(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 67 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Functions.hx"
		return new thx.Functions1();
	}
	
	
}

