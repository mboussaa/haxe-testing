// Generated by Haxe 3.3.0
package thx.fp;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ComparableOrdMap extends haxe.lang.HxObject
{
	public ComparableOrdMap(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public ComparableOrdMap()
	{
		//line 91 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/Maps.hx"
		thx.fp.ComparableOrdMap.__hx_ctor_thx_fp_ComparableOrdMap(this);
	}
	
	
	public static void __hx_ctor_thx_fp_ComparableOrdMap(thx.fp.ComparableOrdMap __temp_me236)
	{
	}
	
	
	public static <V, T> boolean exists(thx.fp.MapImpl map, T key)
	{
		//line 93 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/Maps.hx"
		return ((boolean) (thx.Options.toBool(((haxe.ds.Option) (thx.fp._Map.Map_Impl_.lookup(((thx.fp.MapImpl) (map) ), ((T) (key) ), ((haxe.lang.Function) (thx._Ord.Ord_Impl_.forComparableOrd()) ))) ))) );
	}
	
	
	public static <V, T> haxe.ds.Option get(thx.fp.MapImpl map, T key)
	{
		//line 96 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/Maps.hx"
		return ((haxe.ds.Option) (thx.fp._Map.Map_Impl_.lookup(((thx.fp.MapImpl) (map) ), ((T) (key) ), ((haxe.lang.Function) (thx._Ord.Ord_Impl_.forComparableOrd()) ))) );
	}
	
	
	public static <V, T> V getAlt(thx.fp.MapImpl map, T key, V alt)
	{
		//line 99 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/Maps.hx"
		return ((V) (thx.Options.getOrElse(((haxe.ds.Option) (thx.fp._Map.Map_Impl_.lookup(((thx.fp.MapImpl) (map) ), ((T) (key) ), ((haxe.lang.Function) (thx._Ord.Ord_Impl_.forComparableOrd()) ))) ), ((V) (alt) ))) );
	}
	
	
	public static <V, T> thx.fp.MapImpl set(thx.fp.MapImpl map, T key, V value)
	{
		//line 102 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/Maps.hx"
		return ((thx.fp.MapImpl) (thx.fp._Map.Map_Impl_.insert(((thx.fp.MapImpl) (map) ), ((T) (key) ), ((V) (value) ), ((haxe.lang.Function) (thx._Ord.Ord_Impl_.forComparableOrd()) ))) );
	}
	
	
	public static <V, T> thx.fp.MapImpl remove(thx.fp.MapImpl map, T key)
	{
		//line 105 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/Maps.hx"
		return ((thx.fp.MapImpl) (thx.fp._Map.Map_Impl_.delete(((thx.fp.MapImpl) (map) ), ((T) (key) ), ((haxe.lang.Function) (thx._Ord.Ord_Impl_.forComparableOrd()) ))) );
	}
	
	
	public static <V, T> thx.fp.MapImpl fromNative(haxe.IMap<T, V> map)
	{
		//line 108 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/Maps.hx"
		return ((thx.fp.MapImpl) (thx.fp._Map.Map_Impl_.fromNative(((haxe.IMap<T, V>) (map) ), ((haxe.lang.Function) (thx._Ord.Ord_Impl_.forComparableOrd()) ))) );
	}
	
	
	public static <V, T> thx.fp.MapImpl merge(thx.fp.MapImpl a, thx.fp.MapImpl b)
	{
		//line 111 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/Maps.hx"
		return ((thx.fp.MapImpl) (thx.fp._Map.Map_Impl_.foldLeftTuples(((thx.fp.MapImpl) (b) ), ((java.lang.Object) (a) ), ((haxe.lang.Function) (new thx.fp.ComparableOrdMap_merge_111__Fun<V, T>()) ))) );
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 91 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/Maps.hx"
		return new thx.fp.ComparableOrdMap(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 91 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/Maps.hx"
		return new thx.fp.ComparableOrdMap();
	}
	
	
}

