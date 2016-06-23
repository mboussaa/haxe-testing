// Generated by Haxe 3.3.0
package thx.fp._List;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public final class List_Impl_
{
	public static <A> thx.fp.ListImpl empty()
	{
		//line 9 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
		return thx.fp.ListImpl.Nil;
	}
	
	
	public static <A> thx.fp.ListImpl bin(A x, thx.fp.ListImpl xs)
	{
		//line 12 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
		return thx.fp.ListImpl.Cons(x, xs);
	}
	
	
	public static <A> thx.fp.ListImpl singleton(A x)
	{
		//line 15 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
		return thx.fp.ListImpl.Cons(x, thx.fp.ListImpl.Nil);
	}
	
	
	public static <A> thx.fp.ListImpl fromArray(haxe.root.Array<A> arr)
	{
		//line 19 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
		haxe.root.Array<A> _e = arr;
		//line 19 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
		return ((thx.fp.ListImpl) ((new thx.fp._List.List_Impl__fromArray_19__Fun<A>(_e)).__hx_invoke2_o(0.0, new thx.fp._List.List_Impl__fromArray_19__Fun_0<A>(), 0.0, ((thx.fp.ListImpl) (thx.fp._List.List_Impl_.empty()) ))) );
	}
	
	
	public static <B, A> B foldLeft(thx.fp.ListImpl this1, B b, haxe.lang.Function f)
	{
		//line 22 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
		switch (this1.index)
		{
			case 0:
			{
				//line 22 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
				return b;
			}
			
			
			case 1:
			{
				//line 24 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
				thx.fp.ListImpl xs = ((thx.fp.ListImpl) (this1.params[1]) );
				//line 24 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
				A x = ((A) (this1.params[0]) );
				//line 22 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
				return ((B) (thx.fp._List.List_Impl_.foldLeft(((thx.fp.ListImpl) (xs) ), ((B) (f.__hx_invoke2_o(0.0, b, 0.0, x)) ), ((haxe.lang.Function) (f) ))) );
			}
			
			
		}
		
		//line 21 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
		return null;
	}
	
	
	public static <B, A> B foldMap(thx.fp.ListImpl this1, haxe.lang.Function f, java.lang.Object m)
	{
		//line 28 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
		thx.fp.ListImpl tmp = ((thx.fp.ListImpl) (thx.fp._List.List_Impl_.map(((thx.fp.ListImpl) (this1) ), ((haxe.lang.Function) (f) ))) );
		//line 28 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
		B tmp1 = ((B) (thx._Monoid.Monoid_Impl_.get_zero(((java.lang.Object) (m) ))) );
		//line 28 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
		java.lang.Object _e = m;
		//line 28 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
		return ((B) (thx.fp._List.List_Impl_.foldLeft(((thx.fp.ListImpl) (tmp) ), ((java.lang.Object) (tmp1) ), ((haxe.lang.Function) (new thx.fp._List.List_Impl__foldMap_28__Fun<B>(_e)) ))) );
	}
	
	
	public static <B, A> thx.fp.ListImpl flatMap(thx.fp.ListImpl this1, haxe.lang.Function f)
	{
		//line 31 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
		switch (this1.index)
		{
			case 0:
			{
				//line 31 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
				return thx.fp.ListImpl.Nil;
			}
			
			
			case 1:
			{
				//line 33 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
				thx.fp.ListImpl xs = ((thx.fp.ListImpl) (this1.params[1]) );
				//line 33 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
				A x = ((A) (this1.params[0]) );
				//line 31 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
				return ((thx.fp.ListImpl) (thx.fp._List.List_Impl_.concat(((thx.fp.ListImpl) (f.__hx_invoke1_o(0.0, x)) ), ((thx.fp.ListImpl) (thx.fp._List.List_Impl_.flatMap(((thx.fp.ListImpl) (xs) ), ((haxe.lang.Function) (f) ))) ))) );
			}
			
			
		}
		
		//line 30 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
		return null;
	}
	
	
	public static <A> thx.fp.ListImpl concat(thx.fp.ListImpl this1, thx.fp.ListImpl that)
	{
		//line 37 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
		switch (this1.index)
		{
			case 0:
			{
				//line 37 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
				switch (that.index)
				{
					case 0:
					{
						//line 37 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
						return thx.fp.ListImpl.Nil;
					}
					
					
					default:
					{
						//line 37 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
						return that;
					}
					
				}
				
			}
			
			
			case 1:
			{
				//line 37 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
				switch (that.index)
				{
					case 0:
					{
						//line 40 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
						thx.fp.ListImpl l = this1;
						//line 37 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
						return l;
					}
					
					
					default:
					{
						//line 37 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
						switch (((thx.fp.ListImpl) (this1.params[1]) ).index)
						{
							case 0:
							{
								//line 41 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
								A x = ((A) (this1.params[0]) );
								//line 37 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
								return thx.fp.ListImpl.Cons(x, that);
							}
							
							
							default:
							{
								//line 43 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
								A x1 = ((A) (this1.params[0]) );
								//line 43 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
								thx.fp.ListImpl xs = ((thx.fp.ListImpl) (this1.params[1]) );
								//line 37 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
								return thx.fp.ListImpl.Cons(x1, ((thx.fp.ListImpl) (thx.fp._List.List_Impl_.concat(((thx.fp.ListImpl) (xs) ), ((thx.fp.ListImpl) (that) ))) ));
							}
							
						}
						
					}
					
				}
				
			}
			
			
		}
		
		//line 36 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
		return null;
	}
	
	
	public static <A> thx.fp.ListImpl prepend(thx.fp.ListImpl this1, A x)
	{
		//line 48 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
		return thx.fp.ListImpl.Cons(x, this1);
	}
	
	
	public static <A> haxe.root.Array<A> toArray(thx.fp.ListImpl this1)
	{
		//line 52 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
		return ((haxe.root.Array<A>) (thx.fp._List.List_Impl_.foldLeft(((thx.fp.ListImpl) (this1) ), ((java.lang.Object) (new haxe.root.Array<A>(( (A[]) (new java.lang.Object[] {}) ))) ), ((haxe.lang.Function) (new thx.fp._List.List_Impl__toArray_52__Fun<A>()) ))) );
	}
	
	
	public static <A> thx.fp.ListImpl intersperse(thx.fp.ListImpl this1, A a)
	{
		//line 58 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
		haxe.lang.Function[] go = ( (haxe.lang.Function[]) (new haxe.lang.Function[] {null}) );
		//line 58 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
		go[0] = new thx.fp._List.List_Impl__intersperse_58__Fun<A>(go, a);
		//line 58 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
		haxe.lang.Function go1 = go[0];
		//line 65 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
		switch (this1.index)
		{
			case 0:
			{
				//line 65 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
				return thx.fp.ListImpl.Nil;
			}
			
			
			case 1:
			{
				//line 67 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
				thx.fp.ListImpl xs1 = ((thx.fp.ListImpl) (this1.params[1]) );
				//line 67 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
				A x1 = ((A) (this1.params[0]) );
				//line 65 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
				return thx.fp.ListImpl.Cons(x1, ((thx.fp.ListImpl) (go1.__hx_invoke1_o(0.0, xs1)) ));
			}
			
			
		}
		
		//line 57 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
		return null;
	}
	
	
	public static <B, A> thx.fp.ListImpl map(thx.fp.ListImpl this1, haxe.lang.Function f)
	{
		//line 72 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
		switch (this1.index)
		{
			case 0:
			{
				//line 72 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
				return thx.fp.ListImpl.Nil;
			}
			
			
			case 1:
			{
				//line 74 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
				thx.fp.ListImpl xs = ((thx.fp.ListImpl) (this1.params[1]) );
				//line 74 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
				A x = ((A) (this1.params[0]) );
				//line 72 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
				return thx.fp.ListImpl.Cons(((B) (f.__hx_invoke1_o(0.0, x)) ), ((thx.fp.ListImpl) (thx.fp._List.List_Impl_.map(((thx.fp.ListImpl) (xs) ), ((haxe.lang.Function) (f) ))) ));
			}
			
			
		}
		
		//line 71 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
		return null;
	}
	
	
	public static <B, A> thx.fp.ListImpl zipAp(thx.fp.ListImpl this1, thx.fp.ListImpl other)
	{
		//line 78 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
		switch (this1.index)
		{
			case 0:
			{
				//line 78 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
				return thx.fp.ListImpl.Nil;
			}
			
			
			case 1:
			{
				//line 80 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
				thx.fp.ListImpl xs = ((thx.fp.ListImpl) (this1.params[1]) );
				//line 80 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
				A x = ((A) (this1.params[0]) );
				//line 81 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
				switch (other.index)
				{
					case 0:
					{
						//line 78 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
						return thx.fp.ListImpl.Nil;
					}
					
					
					case 1:
					{
						//line 83 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
						thx.fp.ListImpl ys = ((thx.fp.ListImpl) (((thx.fp.ListImpl) (other) ).params[1]) );
						//line 83 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
						haxe.lang.Function y = ((haxe.lang.Function) (((thx.fp.ListImpl) (other) ).params[0]) );
						//line 78 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
						return thx.fp.ListImpl.Cons(((B) (y.__hx_invoke1_o(0.0, x)) ), ((thx.fp.ListImpl) (thx.fp._List.List_Impl_.zipAp(((thx.fp.ListImpl) (xs) ), ((thx.fp.ListImpl) (ys) ))) ));
					}
					
					
				}
				
				//line 80 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
				break;
			}
			
			
		}
		
		//line 77 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
		return null;
	}
	
	
	public static <A, B, C> thx.fp.ListImpl zip2Ap(haxe.lang.Function f, thx.fp.ListImpl ax, thx.fp.ListImpl bx)
	{
		//line 91 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
		return ((thx.fp.ListImpl) (thx.fp._List.List_Impl_.zipAp(((thx.fp.ListImpl) (bx) ), ((thx.fp.ListImpl) (thx.fp._List.List_Impl_.map(((thx.fp.ListImpl) (ax) ), ((haxe.lang.Function) (thx.Functions2.curry(((haxe.lang.Function) (f) ))) ))) ))) );
	}
	
	
	public static <A, B, C, D> thx.fp.ListImpl zip3Ap(haxe.lang.Function f, thx.fp.ListImpl ax, thx.fp.ListImpl bx, thx.fp.ListImpl cx)
	{
		//line 97 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
		haxe.lang.Function f1 = f;
		//line 97 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
		return ((thx.fp.ListImpl) (thx.fp._List.List_Impl_.zipAp(((thx.fp.ListImpl) (cx) ), ((thx.fp.ListImpl) (thx.fp._List.List_Impl_.zip2Ap(((haxe.lang.Function) (new thx.fp._List.List_Impl__zip3Ap_97__Fun<C, D, B, A>(f1)) ), ((thx.fp.ListImpl) (ax) ), ((thx.fp.ListImpl) (bx) ))) ))) );
	}
	
	
	public static <A, B, C, D, E> thx.fp.ListImpl zip4Ap(haxe.lang.Function f, thx.fp.ListImpl ax, thx.fp.ListImpl bx, thx.fp.ListImpl cx, thx.fp.ListImpl dx)
	{
		//line 103 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
		haxe.lang.Function f1 = f;
		//line 103 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
		return ((thx.fp.ListImpl) (thx.fp._List.List_Impl_.zipAp(((thx.fp.ListImpl) (dx) ), ((thx.fp.ListImpl) (thx.fp._List.List_Impl_.zip3Ap(((haxe.lang.Function) (new thx.fp._List.List_Impl__zip4Ap_103__Fun<D, E, C, B, A>(f1)) ), ((thx.fp.ListImpl) (ax) ), ((thx.fp.ListImpl) (bx) ), ((thx.fp.ListImpl) (cx) ))) ))) );
	}
	
	
	public static <A, B, C, D, E, F> thx.fp.ListImpl zip5Ap(haxe.lang.Function f, thx.fp.ListImpl ax, thx.fp.ListImpl bx, thx.fp.ListImpl cx, thx.fp.ListImpl dx, thx.fp.ListImpl ex)
	{
		//line 109 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
		haxe.lang.Function f1 = f;
		//line 109 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
		return ((thx.fp.ListImpl) (thx.fp._List.List_Impl_.zipAp(((thx.fp.ListImpl) (ex) ), ((thx.fp.ListImpl) (thx.fp._List.List_Impl_.zip4Ap(((haxe.lang.Function) (new thx.fp._List.List_Impl__zip5Ap_109__Fun<E, F, D, C, B, A>(f1)) ), ((thx.fp.ListImpl) (ax) ), ((thx.fp.ListImpl) (bx) ), ((thx.fp.ListImpl) (cx) ), ((thx.fp.ListImpl) (dx) ))) ))) );
	}
	
	
	public static <A> java.lang.String toStringWithShow(thx.fp.ListImpl this1, haxe.lang.Function show)
	{
		//line 112 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
		return ( ( "[" + haxe.lang.Runtime.toString(thx.fp._List.List_Impl_.foldLeft(((thx.fp.ListImpl) (thx.fp._List.List_Impl_.intersperse(((thx.fp.ListImpl) (thx.fp._List.List_Impl_.map(((thx.fp.ListImpl) (this1) ), ((haxe.lang.Function) (show) ))) ), haxe.lang.Runtime.toString(","))) ), ((java.lang.Object) ("") ), ((haxe.lang.Function) (( (( thx.fp._List.List_Impl__toStringWithShow_112__Fun.__hx_current != null )) ? (thx.fp._List.List_Impl__toStringWithShow_112__Fun.__hx_current) : (thx.fp._List.List_Impl__toStringWithShow_112__Fun.__hx_current = ((thx.fp._List.List_Impl__toStringWithShow_112__Fun) (new thx.fp._List.List_Impl__toStringWithShow_112__Fun()) )) )) ))) ) + "]" );
	}
	
	
}

