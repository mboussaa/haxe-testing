// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ArrayStrings extends haxe.lang.HxObject
{
	public ArrayStrings(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public ArrayStrings()
	{
		//line 1266 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		thx.ArrayStrings.__hx_ctor_thx_ArrayStrings(this);
	}
	
	
	public static void __hx_ctor_thx_ArrayStrings(thx.ArrayStrings __temp_me53)
	{
	}
	
	
	public static haxe.root.Array<java.lang.String> compact(haxe.root.Array<java.lang.String> arr)
	{
		//line 1271 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		return arr.filter(( (( thx.ArrayStrings_compact_1271__Fun.__hx_current != null )) ? (thx.ArrayStrings_compact_1271__Fun.__hx_current) : (thx.ArrayStrings_compact_1271__Fun.__hx_current = ((thx.ArrayStrings_compact_1271__Fun) (new thx.ArrayStrings_compact_1271__Fun()) )) ));
	}
	
	
	public static java.lang.String max(haxe.root.Array<java.lang.String> arr)
	{
		//line 1277 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		return haxe.lang.Runtime.toString(thx.Options.getOrElse(((haxe.ds.Option) (thx.Arrays.maxBy(((haxe.root.Array<java.lang.String>) (arr) ), ((haxe.lang.Function) (thx.Strings.order) ))) ), haxe.lang.Runtime.toString(null)));
	}
	
	
	public static java.lang.String min(haxe.root.Array<java.lang.String> arr)
	{
		//line 1283 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		return haxe.lang.Runtime.toString(thx.Options.getOrElse(((haxe.ds.Option) (thx.Arrays.minBy(((haxe.root.Array<java.lang.String>) (arr) ), ((haxe.lang.Function) (thx.Strings.order) ))) ), haxe.lang.Runtime.toString(null)));
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 1266 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		return new thx.ArrayStrings(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 1266 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		return new thx.ArrayStrings();
	}
	
	
}

