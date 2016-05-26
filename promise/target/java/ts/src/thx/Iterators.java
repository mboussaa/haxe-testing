// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Iterators extends haxe.lang.HxObject
{
	public Iterators(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Iterators()
	{
		//line 15 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		thx.Iterators.__hx_ctor_thx_Iterators(this);
	}
	
	
	public static void __hx_ctor_thx_Iterators(thx.Iterators __temp_me96)
	{
	}
	
	
	public static <T> boolean all(java.lang.Object it, haxe.lang.Function predicate)
	{
		//line 20 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(it, "hasNext", null)))
		{
			//line 20 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			T element = ((T) (haxe.lang.Runtime.callField(it, "next", null)) );
			//line 21 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			if ( ! (haxe.lang.Runtime.toBool(predicate.__hx_invoke1_o(0.0, element))) ) 
			{
				//line 22 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
				return false;
			}
			
		}
		
		//line 23 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		return true;
	}
	
	
	public static <T> boolean any(java.lang.Object it, haxe.lang.Function predicate)
	{
		//line 30 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(it, "hasNext", null)))
		{
			//line 30 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			T element = ((T) (haxe.lang.Runtime.callField(it, "next", null)) );
			//line 31 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			if (haxe.lang.Runtime.toBool(predicate.__hx_invoke1_o(0.0, element))) 
			{
				//line 32 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
				return true;
			}
			
		}
		
		//line 33 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		return false;
	}
	
	
	public static <T> boolean equals(java.lang.Object a, java.lang.Object b, haxe.lang.Function equality)
	{
		//line 42 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		if (( null == equality )) 
		{
			//line 42 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			equality = ((haxe.lang.Function) (new haxe.lang.Closure(thx.Functions.class, "equality")) );
		}
		
		//line 43 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		boolean an = false;
		//line 43 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		boolean bn = false;
		//line 44 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		while (true)
		{
			//line 45 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			an = haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(a, "hasNext", null));
			//line 46 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			bn = haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(b, "hasNext", null));
			//line 47 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			if ((  ! (an)  &&  ! (bn)  )) 
			{
				//line 48 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
				return true;
			}
			
			//line 49 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			if ((  ! (an)  ||  ! (bn)  )) 
			{
				//line 50 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
				return false;
			}
			
			//line 51 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			if ( ! (haxe.lang.Runtime.toBool(equality.__hx_invoke2_o(0.0, ((T) (haxe.lang.Runtime.callField(a, "next", null)) ), 0.0, ((T) (haxe.lang.Runtime.callField(b, "next", null)) )))) ) 
			{
				//line 52 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
				return false;
			}
			
		}
		
	}
	
	
	public static <T> java.lang.Object get(java.lang.Object it, int index)
	{
		//line 63 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		int pos = 0;
		//line 64 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(it, "hasNext", null)))
		{
			//line 64 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			T i = ((T) (haxe.lang.Runtime.callField(it, "next", null)) );
			//line 65 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			if (( pos++ == index )) 
			{
				//line 66 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
				return i;
			}
			
		}
		
		//line 68 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		return null;
	}
	
	
	public static <T> haxe.ds.Option getOption(java.lang.Object it, int index)
	{
		//line 75 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		java.lang.Object value = ((java.lang.Object) (thx.Iterators.get(((java.lang.Object) (it) ), ((int) (index) ))) );
		//line 75 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		if (( null == value )) 
		{
			//line 75 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			return haxe.ds.Option.None;
		}
		else
		{
			//line 75 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			return haxe.ds.Option.Some(value);
		}
		
	}
	
	
	public static <TIn, TOut> void eachPair(java.lang.Object it, haxe.lang.Function handler)
	{
		//line 81 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		thx.Arrays.eachPair(((haxe.root.Array<TIn>) (((haxe.root.Array) (thx.Iterators.toArray(((java.lang.Object) (it) ))) )) ), ((haxe.lang.Function) (handler) ));
	}
	
	
	public static <TElement> haxe.root.Array<TElement> filter(java.lang.Object it, haxe.lang.Function predicate)
	{
		//line 87 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		return ((haxe.root.Array<TElement>) (thx.Iterators.reduce(((java.lang.Object) (it) ), ((haxe.lang.Function) (new thx.Iterators_filter_87__Fun<TElement>(predicate)) ), ((haxe.root.Array<TElement>) (new haxe.root.Array<TElement>(( (TElement[]) (new java.lang.Object[] {}) ))) ))) );
	}
	
	
	public static <T, TFind> java.lang.Object find(java.lang.Object it, haxe.lang.Function f)
	{
		//line 97 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(it, "hasNext", null)))
		{
			//line 97 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			T element = ((T) (haxe.lang.Runtime.callField(it, "next", null)) );
			//line 98 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			if (haxe.lang.Runtime.toBool(f.__hx_invoke1_o(0.0, element))) 
			{
				//line 99 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
				return element;
			}
			
		}
		
		//line 100 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		return null;
	}
	
	
	public static <T, TFind> haxe.ds.Option findOption(java.lang.Object it, haxe.lang.Function f)
	{
		//line 107 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		java.lang.Object value = ((java.lang.Object) (thx.Iterators.find(((java.lang.Object) (it) ), ((haxe.lang.Function) (f) ))) );
		//line 107 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		if (( null == value )) 
		{
			//line 107 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			return haxe.ds.Option.None;
		}
		else
		{
			//line 107 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			return haxe.ds.Option.Some(value);
		}
		
	}
	
	
	public static <T, TFind> java.lang.Object first(java.lang.Object it)
	{
		//line 113 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		if (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(it, "hasNext", null))) 
		{
			//line 113 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			return ((T) (haxe.lang.Runtime.callField(it, "next", null)) );
		}
		else
		{
			//line 113 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			return null;
		}
		
	}
	
	
	public static <T> boolean hasElements(java.lang.Object it)
	{
		//line 119 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		return haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(it, "hasNext", null));
	}
	
	
	public static <T> int indexOf(java.lang.Object it, T element)
	{
		//line 125 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		int pos = 0;
		//line 126 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(it, "hasNext", null)))
		{
			//line 126 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			T v = ((T) (haxe.lang.Runtime.callField(it, "next", null)) );
			//line 127 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			if (haxe.lang.Runtime.eq(element, v)) 
			{
				//line 128 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
				return pos;
			}
			
			//line 129 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			 ++ pos;
		}
		
		//line 131 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		return -1;
	}
	
	
	public static <T> boolean isEmpty(java.lang.Object it)
	{
		//line 138 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		return  ! (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(it, "hasNext", null))) ;
	}
	
	
	public static boolean isIterator(java.lang.Object v)
	{
		//line 147 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		haxe.root.Array<java.lang.String> fields = ( (( haxe.root.Reflect.isObject(v) && ( ((java.lang.Object) (null) ) == ((java.lang.Object) (((java.lang.Class) (haxe.root.Type.getClass(((java.lang.Object) (v) ))) )) ) ) )) ? (haxe.root.Reflect.fields(v)) : (haxe.root.Type.getInstanceFields(((java.lang.Class) (haxe.root.Type.getClass(((java.lang.Object) (v) ))) ))) );
		//line 148 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		if ((  ! (((boolean) (haxe.root.Lambda.has(((java.lang.Object) (fields) ), haxe.lang.Runtime.toString("next"))) ))  ||  ! (((boolean) (haxe.root.Lambda.has(((java.lang.Object) (fields) ), haxe.lang.Runtime.toString("hasNext"))) ))  )) 
		{
			//line 148 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			return false;
		}
		
		//line 149 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		if (haxe.root.Reflect.isFunction(haxe.lang.Runtime.getField(v, "next", false))) 
		{
			//line 149 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			return haxe.root.Reflect.isFunction(haxe.lang.Runtime.getField(v, "hasNext", false));
		}
		else
		{
			//line 149 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			return false;
		}
		
	}
	
	
	public static <T, TFind> java.lang.Object last(java.lang.Object it)
	{
		//line 156 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		T buf = null;
		//line 157 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(it, "hasNext", null)))
		{
			//line 157 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			buf = ((T) (haxe.lang.Runtime.callField(it, "next", null)) );
		}
		
		//line 158 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		return buf;
	}
	
	
	public static <A> void forEach(java.lang.Object it, haxe.lang.Function proc)
	{
		//line 166 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(it, "hasNext", null)))
		{
			//line 167 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			proc.__hx_invoke1_o(0.0, ((A) (haxe.lang.Runtime.callField(it, "next", null)) ));
		}
		
	}
	
	
	public static <T, S> haxe.root.Array<S> map(java.lang.Object it, haxe.lang.Function f)
	{
		//line 175 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		haxe.root.Array<S> acc = new haxe.root.Array<S>(( (S[]) (new java.lang.Object[] {}) ));
		//line 176 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(it, "hasNext", null)))
		{
			//line 176 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			T v = ((T) (haxe.lang.Runtime.callField(it, "next", null)) );
			//line 177 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			acc.push(((S) (f.__hx_invoke1_o(0.0, v)) ));
		}
		
		//line 178 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		return acc;
	}
	
	
	public static <T, S> java.lang.Object fmap(java.lang.Object it, haxe.lang.Function f)
	{
		//line 186 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		return new thx.MapIterator<T, S>(it, f);
	}
	
	
	public static <T, S> haxe.root.Array<S> mapi(java.lang.Object it, haxe.lang.Function f)
	{
		//line 192 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		haxe.root.Array<S> acc = new haxe.root.Array<S>(( (S[]) (new java.lang.Object[] {}) ));
		//line 192 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		int i = 0;
		//line 194 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(it, "hasNext", null)))
		{
			//line 194 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			T v = ((T) (haxe.lang.Runtime.callField(it, "next", null)) );
			//line 195 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			acc.push(((S) (f.__hx_invoke2_o(0.0, v, ((double) (i++) ), haxe.lang.Runtime.undefined)) ));
		}
		
		//line 196 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		return acc;
	}
	
	
	public static <T, S> java.lang.Object fmapi(java.lang.Object it, haxe.lang.Function f)
	{
		//line 205 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		return new thx.MapIIterator<T, S>(it, f);
	}
	
	
	public static <T> haxe.root.Array<T> order(java.lang.Object it, haxe.lang.Function sort)
	{
		//line 211 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		haxe.root.Array<T> n = ((haxe.root.Array<T>) (((haxe.root.Array) (thx.Iterators.toArray(((java.lang.Object) (it) ))) )) );
		//line 212 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		n.sort(sort);
		//line 213 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		return n;
	}
	
	
	public static <TElement, TAcc> TAcc reduce(java.lang.Object it, haxe.lang.Function callback, TAcc initial)
	{
		//line 220 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		TAcc result = initial;
		//line 221 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(it, "hasNext", null)))
		{
			//line 222 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			result = ((TAcc) (callback.__hx_invoke2_o(0.0, result, 0.0, ((TElement) (haxe.lang.Runtime.callField(it, "next", null)) ))) );
		}
		
		//line 224 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		return result;
	}
	
	
	public static <TElement, TAcc> TAcc reducei(java.lang.Object it, haxe.lang.Function callback, TAcc initial)
	{
		//line 230 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		TAcc[] initial1 = ( (TAcc[]) (new java.lang.Object[] {initial}) );
		//line 231 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		thx.Iterators.mapi(((java.lang.Object) (it) ), ((haxe.lang.Function) (new thx.Iterators_reducei_231__Fun<TAcc, TElement>(initial1, callback)) ));
		//line 232 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		return initial1[0];
	}
	
	
	public static <A, B> B foldLeft(java.lang.Object it, B zero, haxe.lang.Function f)
	{
		//line 236 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		return ((B) (thx.Iterators.reduce(((java.lang.Object) (it) ), ((haxe.lang.Function) (f) ), ((B) (zero) ))) );
	}
	
	
	public static <A, B> B foldMap(java.lang.Object it, haxe.lang.Function f, java.lang.Object m)
	{
		//line 242 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		java.lang.Object tmp = ((java.lang.Object) (thx.Iterators.fmap(((java.lang.Object) (it) ), ((haxe.lang.Function) (f) ))) );
		//line 242 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		B tmp1 = ((B) (thx._Monoid.Monoid_Impl_.get_zero(((java.lang.Object) (m) ))) );
		//line 242 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		java.lang.Object _e = m;
		//line 242 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		return ((B) (thx.Iterators.foldLeft(((java.lang.Object) (tmp) ), ((B) (tmp1) ), ((haxe.lang.Function) (new thx.Iterators_foldMap_242__Fun<B>(_e)) ))) );
	}
	
	
	public static <T> haxe.root.Array<T> toArray(java.lang.Object it)
	{
		//line 248 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		haxe.root.Array<T> elements = new haxe.root.Array<T>(( (T[]) (new java.lang.Object[] {}) ));
		//line 249 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(it, "hasNext", null)))
		{
			//line 249 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			T element = ((T) (haxe.lang.Runtime.callField(it, "next", null)) );
			//line 250 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			elements.push(element);
		}
		
		//line 251 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		return elements;
	}
	
	
	public static <T1, T2> java.lang.Object unzip(java.lang.Object it)
	{
		//line 258 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		haxe.root.Array<T1> a1 = new haxe.root.Array<T1>(( (T1[]) (new java.lang.Object[] {}) ));
		//line 258 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		haxe.root.Array<T2> a2 = new haxe.root.Array<T2>(( (T2[]) (new java.lang.Object[] {}) ));
		//line 259 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		thx.Iterators.forEach(((java.lang.Object) (it) ), ((haxe.lang.Function) (new thx.Iterators_unzip_259__Fun<T2, T1>(a2, a1)) ));
		//line 263 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		java.lang.Object this1 = new haxe.lang.DynamicObject(new java.lang.String[]{"_0", "_1"}, new java.lang.Object[]{a1, a2}, new java.lang.String[]{}, new double[]{});
		//line 263 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		return ((java.lang.Object) (this1) );
	}
	
	
	public static <T1, T2, T3> java.lang.Object unzip3(java.lang.Object it)
	{
		//line 270 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		haxe.root.Array<T1> a1 = new haxe.root.Array<T1>(( (T1[]) (new java.lang.Object[] {}) ));
		//line 270 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		haxe.root.Array<T2> a2 = new haxe.root.Array<T2>(( (T2[]) (new java.lang.Object[] {}) ));
		//line 270 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		haxe.root.Array<T3> a3 = new haxe.root.Array<T3>(( (T3[]) (new java.lang.Object[] {}) ));
		//line 271 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		thx.Iterators.forEach(((java.lang.Object) (it) ), ((haxe.lang.Function) (new thx.Iterators_unzip3_271__Fun<T3, T2, T1>(a3, a2, a1)) ));
		//line 276 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		java.lang.Object this1 = new haxe.lang.DynamicObject(new java.lang.String[]{"_0", "_1", "_2"}, new java.lang.Object[]{a1, a2, a3}, new java.lang.String[]{}, new double[]{});
		//line 276 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		return ((java.lang.Object) (this1) );
	}
	
	
	public static <T1, T2, T3, T4> java.lang.Object unzip4(java.lang.Object it)
	{
		//line 283 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		haxe.root.Array<T1> a1 = new haxe.root.Array<T1>(( (T1[]) (new java.lang.Object[] {}) ));
		//line 283 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		haxe.root.Array<T2> a2 = new haxe.root.Array<T2>(( (T2[]) (new java.lang.Object[] {}) ));
		//line 283 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		haxe.root.Array<T3> a3 = new haxe.root.Array<T3>(( (T3[]) (new java.lang.Object[] {}) ));
		//line 283 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		haxe.root.Array<T4> a4 = new haxe.root.Array<T4>(( (T4[]) (new java.lang.Object[] {}) ));
		//line 284 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		thx.Iterators.forEach(((java.lang.Object) (it) ), ((haxe.lang.Function) (new thx.Iterators_unzip4_284__Fun<T4, T3, T2, T1>(a4, a3, a2, a1)) ));
		//line 290 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		java.lang.Object this1 = new haxe.lang.DynamicObject(new java.lang.String[]{"_0", "_1", "_2", "_3"}, new java.lang.Object[]{a1, a2, a3, a4}, new java.lang.String[]{}, new double[]{});
		//line 290 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		return ((java.lang.Object) (this1) );
	}
	
	
	public static <T1, T2, T3, T4, T5> java.lang.Object unzip5(java.lang.Object it)
	{
		//line 297 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		haxe.root.Array<T1> a1 = new haxe.root.Array<T1>(( (T1[]) (new java.lang.Object[] {}) ));
		//line 297 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		haxe.root.Array<T2> a2 = new haxe.root.Array<T2>(( (T2[]) (new java.lang.Object[] {}) ));
		//line 297 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		haxe.root.Array<T3> a3 = new haxe.root.Array<T3>(( (T3[]) (new java.lang.Object[] {}) ));
		//line 297 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		haxe.root.Array<T4> a4 = new haxe.root.Array<T4>(( (T4[]) (new java.lang.Object[] {}) ));
		//line 297 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		haxe.root.Array<T5> a5 = new haxe.root.Array<T5>(( (T5[]) (new java.lang.Object[] {}) ));
		//line 298 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		thx.Iterators.forEach(((java.lang.Object) (it) ), ((haxe.lang.Function) (new thx.Iterators_unzip5_298__Fun<T5, T4, T3, T2, T1>(a5, a4, a3, a2, a1)) ));
		//line 305 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		java.lang.Object this1 = new haxe.lang.DynamicObject(new java.lang.String[]{"_0", "_1", "_2", "_3", "_4"}, new java.lang.Object[]{a1, a2, a3, a4, a5}, new java.lang.String[]{}, new double[]{});
		//line 305 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		return ((java.lang.Object) (this1) );
	}
	
	
	public static <T1, T2> haxe.root.Array<java.lang.Object> zip(java.lang.Object it1, java.lang.Object it2)
	{
		//line 312 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		haxe.root.Array<java.lang.Object> array = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{});
		//line 313 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		while (( haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(it1, "hasNext", null)) && haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(it2, "hasNext", null)) ))
		{
			//line 314 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			java.lang.Object this1 = null;
			//line 314 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			{
				//line 314 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
				T1 __temp_odecl1 = ((T1) (haxe.lang.Runtime.callField(it1, "next", null)) );
				//line 314 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
				T2 __temp_odecl2 = ((T2) (haxe.lang.Runtime.callField(it2, "next", null)) );
				//line 314 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
				this1 = new haxe.lang.DynamicObject(new java.lang.String[]{"_0", "_1"}, new java.lang.Object[]{__temp_odecl1, __temp_odecl2}, new java.lang.String[]{}, new double[]{});
			}
			
			//line 314 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			array.push(((java.lang.Object) (this1) ));
		}
		
		//line 315 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		return array;
	}
	
	
	public static <T1, T2, T3> haxe.root.Array<java.lang.Object> zip3(java.lang.Object it1, java.lang.Object it2, java.lang.Object it3)
	{
		//line 322 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		haxe.root.Array<java.lang.Object> array = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{});
		//line 323 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		while (( ( haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(it1, "hasNext", null)) && haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(it2, "hasNext", null)) ) && haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(it3, "hasNext", null)) ))
		{
			//line 324 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			java.lang.Object this1 = null;
			//line 324 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			{
				//line 324 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
				T1 __temp_odecl1 = ((T1) (haxe.lang.Runtime.callField(it1, "next", null)) );
				//line 324 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
				T2 __temp_odecl2 = ((T2) (haxe.lang.Runtime.callField(it2, "next", null)) );
				//line 324 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
				T3 __temp_odecl3 = ((T3) (haxe.lang.Runtime.callField(it3, "next", null)) );
				//line 324 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
				this1 = new haxe.lang.DynamicObject(new java.lang.String[]{"_0", "_1", "_2"}, new java.lang.Object[]{__temp_odecl1, __temp_odecl2, __temp_odecl3}, new java.lang.String[]{}, new double[]{});
			}
			
			//line 324 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			array.push(((java.lang.Object) (this1) ));
		}
		
		//line 325 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		return array;
	}
	
	
	public static <T1, T2, T3, T4> haxe.root.Array<java.lang.Object> zip4(java.lang.Object it1, java.lang.Object it2, java.lang.Object it3, java.lang.Object it4)
	{
		//line 332 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		haxe.root.Array<java.lang.Object> array = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{});
		//line 333 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		while (( ( ( haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(it1, "hasNext", null)) && haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(it2, "hasNext", null)) ) && haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(it3, "hasNext", null)) ) && haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(it4, "hasNext", null)) ))
		{
			//line 334 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			java.lang.Object this1 = null;
			//line 334 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			{
				//line 334 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
				T1 __temp_odecl1 = ((T1) (haxe.lang.Runtime.callField(it1, "next", null)) );
				//line 334 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
				T2 __temp_odecl2 = ((T2) (haxe.lang.Runtime.callField(it2, "next", null)) );
				//line 334 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
				T3 __temp_odecl3 = ((T3) (haxe.lang.Runtime.callField(it3, "next", null)) );
				//line 334 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
				T4 __temp_odecl4 = ((T4) (haxe.lang.Runtime.callField(it4, "next", null)) );
				//line 334 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
				this1 = new haxe.lang.DynamicObject(new java.lang.String[]{"_0", "_1", "_2", "_3"}, new java.lang.Object[]{__temp_odecl1, __temp_odecl2, __temp_odecl3, __temp_odecl4}, new java.lang.String[]{}, new double[]{});
			}
			
			//line 334 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			array.push(((java.lang.Object) (this1) ));
		}
		
		//line 335 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		return array;
	}
	
	
	public static <T1, T2, T3, T4, T5> haxe.root.Array<java.lang.Object> zip5(java.lang.Object it1, java.lang.Object it2, java.lang.Object it3, java.lang.Object it4, java.lang.Object it5)
	{
		//line 342 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		haxe.root.Array<java.lang.Object> array = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{});
		//line 343 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		while (( ( ( ( haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(it1, "hasNext", null)) && haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(it2, "hasNext", null)) ) && haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(it3, "hasNext", null)) ) && haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(it4, "hasNext", null)) ) && haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(it5, "hasNext", null)) ))
		{
			//line 344 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			java.lang.Object this1 = null;
			//line 344 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			{
				//line 344 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
				T1 __temp_odecl1 = ((T1) (haxe.lang.Runtime.callField(it1, "next", null)) );
				//line 344 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
				T2 __temp_odecl2 = ((T2) (haxe.lang.Runtime.callField(it2, "next", null)) );
				//line 344 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
				T3 __temp_odecl3 = ((T3) (haxe.lang.Runtime.callField(it3, "next", null)) );
				//line 344 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
				T4 __temp_odecl4 = ((T4) (haxe.lang.Runtime.callField(it4, "next", null)) );
				//line 344 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
				T5 __temp_odecl5 = ((T5) (haxe.lang.Runtime.callField(it5, "next", null)) );
				//line 344 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
				this1 = new haxe.lang.DynamicObject(new java.lang.String[]{"_0", "_1", "_2", "_3", "_4"}, new java.lang.Object[]{__temp_odecl1, __temp_odecl2, __temp_odecl3, __temp_odecl4, __temp_odecl5}, new java.lang.String[]{}, new double[]{});
			}
			
			//line 344 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			array.push(((java.lang.Object) (this1) ));
		}
		
		//line 345 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		return array;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 15 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		return new thx.Iterators(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 15 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		return new thx.Iterators();
	}
	
	
}


