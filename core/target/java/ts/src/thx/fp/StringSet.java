// Generated by Haxe 3.3.0
package thx.fp;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class StringSet extends haxe.lang.HxObject
{
	public StringSet(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public StringSet()
	{
		//line 5 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/Sets.hx"
		thx.fp.StringSet.__hx_ctor_thx_fp_StringSet(this);
	}
	
	
	public static void __hx_ctor_thx_fp_StringSet(thx.fp.StringSet __temp_me238)
	{
	}
	
	
	public static boolean exists(thx.fp.SetImpl set, java.lang.String value)
	{
		//line 7 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/Sets.hx"
		return ((boolean) (thx.fp._Set.Set_Impl_.member(((thx.fp.SetImpl) (set) ), haxe.lang.Runtime.toString(value), ((haxe.lang.Function) (thx._Ord.Ord_Impl_.fromIntComparison(((haxe.lang.Function) (new haxe.lang.Closure(thx.Strings.class, "compare")) ))) ))) );
	}
	
	
	public static thx.fp.SetImpl set(thx.fp.SetImpl set, java.lang.String value)
	{
		//line 10 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/Sets.hx"
		return ((thx.fp.SetImpl) (thx.fp._Set.Set_Impl_.insert(((thx.fp.SetImpl) (set) ), haxe.lang.Runtime.toString(value), ((haxe.lang.Function) (thx._Ord.Ord_Impl_.fromIntComparison(((haxe.lang.Function) (new haxe.lang.Closure(thx.Strings.class, "compare")) ))) ))) );
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 5 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/Sets.hx"
		return new thx.fp.StringSet(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 5 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/Sets.hx"
		return new thx.fp.StringSet();
	}
	
	
}


