// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Effects extends haxe.lang.HxObject
{
	static
	{
		//line 6 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Effects.hx"
		thx.Effects.logger = ((haxe.lang.Function) (haxe.Log.trace) );
	}
	
	public Effects(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Effects()
	{
		//line 5 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Effects.hx"
		thx.Effects.__hx_ctor_thx_Effects(this);
	}
	
	
	public static void __hx_ctor_thx_Effects(thx.Effects __temp_me75)
	{
	}
	
	
	public static haxe.lang.Function logger;
	
	public static <T, TAny> T tap(T input, haxe.lang.Function f)
	{
		//line 9 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Effects.hx"
		f.__hx_invoke1_o(0.0, input);
		//line 10 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Effects.hx"
		return input;
	}
	
	
	public static <T, TAny> T traced(T input, haxe.lang.Function f)
	{
		//line 14 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Effects.hx"
		haxe.Log.trace.__hx_invoke2_o(0.0, haxe.lang.Runtime.toString(f.__hx_invoke1_o(0.0, input)), 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.Effects", "Effects.hx", "traced"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (14) )) )}));
		//line 15 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Effects.hx"
		return input;
	}
	
	
	public static <T> T log(T input, java.lang.Object pos)
	{
		//line 19 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Effects.hx"
		java.lang.Object a2 = pos;
		//line 19 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Effects.hx"
		(new thx.Effects_log_19__Fun(a2)).__hx_invoke1_o(0.0, input);
		//line 19 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Effects.hx"
		return ((T) (input) );
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 5 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Effects.hx"
		return new thx.Effects(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 5 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Effects.hx"
		return new thx.Effects();
	}
	
	
}


