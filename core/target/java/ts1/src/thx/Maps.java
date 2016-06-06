// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Maps extends haxe.lang.HxObject
{
	public Maps(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Maps()
	{
		//line 17 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Maps.hx"
		thx.Maps.__hx_ctor_thx_Maps(this);
	}
	
	
	public static void __hx_ctor_thx_Maps(thx.Maps __temp_me100)
	{
	}
	
	
	public static <TKey, TValue> haxe.IMap<TKey, TValue> copyTo(haxe.IMap<TKey, TValue> src, haxe.IMap<TKey, TValue> dst)
	{
		//line 23 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Maps.hx"
		{
			//line 23 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Maps.hx"
			java.lang.Object tmp = src.keys();
			//line 23 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Maps.hx"
			while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(tmp, "hasNext", null)))
			{
				//line 23 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Maps.hx"
				TKey key = ((TKey) (haxe.lang.Runtime.callField(tmp, "next", null)) );
				//line 24 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Maps.hx"
				dst.set(key, ((TValue) (src.get(key)) ));
			}
			
		}
		
		//line 25 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Maps.hx"
		return dst;
	}
	
	
	public static <TKey, TValue> haxe.root.Array<java.lang.Object> tuples(haxe.IMap<TKey, TValue> map)
	{
		//line 32 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Maps.hx"
		return ((haxe.root.Array<java.lang.Object>) (thx.Iterators.map(((java.lang.Object) (map.keys()) ), ((haxe.lang.Function) (new thx.Maps_tuples_32__Fun<TValue, TKey>(map)) ))) );
	}
	
	
	public static <TKey, TValueA, TValueB> haxe.IMap<TKey, TValueB> mapValues(haxe.IMap<TKey, TValueA> map, haxe.lang.Function f, haxe.IMap<TKey, TValueB> acc)
	{
		//line 40 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Maps.hx"
		return ((haxe.IMap<TKey, TValueB>) (thx.Maps.reduce(((haxe.IMap<TKey, TValueA>) (map) ), ((haxe.lang.Function) (new thx.Maps_mapValues_40__Fun<TValueA, TValueB, TKey>(f)) ), ((haxe.IMap<TKey, TValueB>) (acc) ))) );
	}
	
	
	public static <TKey, TValue, TOut> TOut reduce(haxe.IMap<TKey, TValue> map, haxe.lang.Function f, TOut acc)
	{
		//line 49 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Maps.hx"
		return ((TOut) (thx.Arrays.reduce(((haxe.root.Array<java.lang.Object>) (thx.Maps.tuples(((haxe.IMap<TKey, TValue>) (map) ))) ), ((haxe.lang.Function) (f) ), ((java.lang.Object) (acc) ))) );
	}
	
	
	public static <TKey, TValue> haxe.root.Array<TValue> values(haxe.IMap<TKey, TValue> map)
	{
		//line 55 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Maps.hx"
		return ((haxe.root.Array<TValue>) (((haxe.root.Array) (thx.Iterators.map(((java.lang.Object) (map.keys()) ), ((haxe.lang.Function) (new thx.Maps_values_55__Fun<TValue, TKey>(map)) ))) )) );
	}
	
	
	public static <TKey, TValue> haxe.ds.Option getOption(haxe.IMap<TKey, TValue> map, TKey key)
	{
		//line 63 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Maps.hx"
		java.lang.Object value = map.get(key);
		//line 63 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Maps.hx"
		if (( null == value )) 
		{
			//line 63 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Maps.hx"
			return haxe.ds.Option.None;
		}
		else
		{
			//line 63 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Maps.hx"
			return haxe.ds.Option.Some(value);
		}
		
	}
	
	
	public static <T> java.lang.Object toObject(haxe.ds.StringMap<T> map)
	{
		//line 69 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Maps.hx"
		return ((java.lang.Object) (thx.Arrays.reduce(((haxe.root.Array<java.lang.Object>) (thx.Maps.tuples(((haxe.IMap<java.lang.String, T>) (map) ))) ), ((haxe.lang.Function) (new thx.Maps_toObject_69__Fun<T>()) ), ((java.lang.Object) (new haxe.lang.DynamicObject(new java.lang.String[]{}, new java.lang.Object[]{}, new java.lang.String[]{}, new double[]{})) ))) );
	}
	
	
	public static <TKey, TValue> TValue getAlt(haxe.IMap<TKey, TValue> map, TKey key, TValue alt)
	{
		//line 79 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Maps.hx"
		java.lang.Object v = ((java.lang.Object) (map.get(key)) );
		//line 80 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Maps.hx"
		if (( null == v )) 
		{
			//line 80 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Maps.hx"
			return alt;
		}
		else
		{
			//line 80 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Maps.hx"
			return ((TValue) (v) );
		}
		
	}
	
	
	public static boolean isMap(java.lang.Object v)
	{
		//line 87 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Maps.hx"
		return ( v instanceof haxe.IMap );
	}
	
	
	public static <TKey, TValue> java.lang.String string(haxe.IMap<TKey, TValue> m)
	{
		//line 90 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Maps.hx"
		return ( ( "[" + ((haxe.root.Array<java.lang.String>) (((haxe.root.Array) (((haxe.root.Array<java.lang.Object>) (thx.Maps.tuples(((haxe.IMap<TKey, TValue>) (m) ))) ).map(((haxe.lang.Function) (new thx.Maps_string_90__Fun<TValue, TKey>()) ))) )) ).join(", ") ) + "]" );
	}
	
	
	public static <TKey, TValue> haxe.IMap<TKey, TValue> merge(haxe.IMap<TKey, TValue> dest, haxe.root.Array<haxe.IMap<TKey, TValue>> sources)
	{
		//line 106 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Maps.hx"
		return ((haxe.IMap<TKey, TValue>) (thx.Arrays.reduce(((haxe.root.Array<haxe.IMap<TKey, TValue>>) (sources) ), ((haxe.lang.Function) (new thx.Maps_merge_106__Fun<TValue, TKey>()) ), ((java.lang.Object) (dest) ))) );
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 17 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Maps.hx"
		return new thx.Maps(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 17 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Maps.hx"
		return new thx.Maps();
	}
	
	
}


