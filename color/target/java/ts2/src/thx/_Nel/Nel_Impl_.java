// Generated by Haxe 3.3.0
package thx._Nel;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public final class Nel_Impl_
{
	public static <A> thx.NonEmptyList nel(A hd, haxe.root.Array<A> tl)
	{
		//line 9 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
		haxe.ds.Option _g = ((haxe.ds.Option) (thx._Nel.Nel_Impl_.fromArray(((haxe.root.Array<A>) (tl) ))) );
		//line 9 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
		switch (_g.index)
		{
			case 0:
			{
				//line 10 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
				thx.NonEmptyList nel = ((thx.NonEmptyList) (_g.params[0]) );
				//line 9 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
				return ((thx.NonEmptyList) (thx._Nel.Nel_Impl_.cons(((A) (hd) ), ((thx.NonEmptyList) (nel) ))) );
			}
			
			
			case 1:
			{
				//line 9 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
				return ((thx.NonEmptyList) (thx._Nel.Nel_Impl_.pure(((A) (hd) ))) );
			}
			
			
		}
		
		//line 8 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
		return null;
	}
	
	
	public static <A> thx.NonEmptyList pure(A a)
	{
		//line 16 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
		return thx.NonEmptyList.Single(a);
	}
	
	
	public static <A> thx.NonEmptyList cons(A a, thx.NonEmptyList nl)
	{
		//line 19 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
		return thx.NonEmptyList.ConsNel(a, nl);
	}
	
	
	public static <A> haxe.ds.Option fromArray(haxe.root.Array<A> arr)
	{
		//line 23 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
		if (( arr.length == 0 )) 
		{
			//line 22 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
			return haxe.ds.Option.None;
		}
		else
		{
			//line 24 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
			thx.NonEmptyList res = thx.NonEmptyList.Single(((haxe.root.Array<A>) (arr) ).__get(( arr.length - 1 )));
			//line 25 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
			{
				//line 25 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
				java.lang.Object tmp = thx.Ints.rangeIter(( arr.length - 2 ), -1, -1);
				//line 25 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
				while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(tmp, "hasNext", null)))
				{
					//line 25 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
					int i = ((int) (haxe.lang.Runtime.toInt(haxe.lang.Runtime.callField(tmp, "next", null))) );
					//line 26 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
					res = thx.NonEmptyList.ConsNel(((A) (((haxe.root.Array<A>) (arr) ).__get(i)) ), res);
				}
				
			}
			
			//line 22 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
			return haxe.ds.Option.Some(res);
		}
		
	}
	
	
	public static <B, A> thx.NonEmptyList map(thx.NonEmptyList this1, haxe.lang.Function f)
	{
		//line 33 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
		haxe.lang.Function fb = f;
		//line 33 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
		return ((thx.NonEmptyList) (thx._Nel.Nel_Impl_.flatMap(((thx.NonEmptyList) (this1) ), ((haxe.lang.Function) (new thx._Nel.Nel_Impl__map_33__Fun<B, A>(fb)) ))) );
	}
	
	
	public static <B, A> thx.NonEmptyList flatMap(thx.NonEmptyList this1, haxe.lang.Function f)
	{
		//line 36 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
		switch (this1.index)
		{
			case 0:
			{
				//line 37 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
				A x = ((A) (this1.params[0]) );
				//line 36 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
				return ((thx.NonEmptyList) (f.__hx_invoke1_o(0.0, x)) );
			}
			
			
			case 1:
			{
				//line 38 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
				thx.NonEmptyList xs = ((thx.NonEmptyList) (this1.params[1]) );
				//line 38 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
				A x1 = ((A) (this1.params[0]) );
				//line 36 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
				return ((thx.NonEmptyList) (thx._Nel.Nel_Impl_.append(((thx.NonEmptyList) (f.__hx_invoke1_o(0.0, x1)) ), ((thx.NonEmptyList) (thx._Nel.Nel_Impl_.flatMap(((thx.NonEmptyList) (xs) ), ((haxe.lang.Function) (f) ))) ))) );
			}
			
			
		}
		
		//line 35 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
		return null;
	}
	
	
	public static <A> A fold(thx.NonEmptyList this1, haxe.lang.Function s)
	{
		//line 42 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
		switch (this1.index)
		{
			case 0:
			{
				//line 43 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
				A x = ((A) (this1.params[0]) );
				//line 42 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
				return x;
			}
			
			
			case 1:
			{
				//line 44 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
				thx.NonEmptyList xs = ((thx.NonEmptyList) (this1.params[1]) );
				//line 44 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
				A x1 = ((A) (this1.params[0]) );
				//line 42 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
				return ((A) (((haxe.lang.Function) (thx._Semigroup.Semigroup_Impl_.get_append(((haxe.lang.Function) (s) ))) ).__hx_invoke2_o(0.0, x1, 0.0, ((A) (thx._Nel.Nel_Impl_.fold(((thx.NonEmptyList) (xs) ), ((haxe.lang.Function) (s) ))) ))) );
			}
			
			
		}
		
		//line 41 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
		return null;
	}
	
	
	public static <A> thx.NonEmptyList append(thx.NonEmptyList this1, thx.NonEmptyList nel)
	{
		//line 50 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
		switch (this1.index)
		{
			case 0:
			{
				//line 51 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
				A x = ((A) (this1.params[0]) );
				//line 50 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
				return thx.NonEmptyList.ConsNel(x, nel);
			}
			
			
			case 1:
			{
				//line 52 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
				thx.NonEmptyList xs = ((thx.NonEmptyList) (this1.params[1]) );
				//line 52 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
				A x1 = ((A) (this1.params[0]) );
				//line 50 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
				return thx.NonEmptyList.ConsNel(x1, ((thx.NonEmptyList) (thx._Nel.Nel_Impl_.append(((thx.NonEmptyList) (xs) ), ((thx.NonEmptyList) (nel) ))) ));
			}
			
			
		}
		
		//line 48 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
		return null;
	}
	
	
	public static <A> haxe.root.Array<A> toArray(thx.NonEmptyList this1)
	{
		//line 56 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
		haxe.lang.Function[] go = ( (haxe.lang.Function[]) (new haxe.lang.Function[] {null}) );
		//line 56 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
		go[0] = new thx._Nel.Nel_Impl__toArray_56__Fun<A>(go);
		//line 56 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
		haxe.lang.Function go1 = go[0];
		//line 63 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
		haxe.root.Array<A> result = ((haxe.root.Array<A>) (go1.__hx_invoke2_o(0.0, new haxe.root.Array<A>(( (A[]) (new java.lang.Object[] {}) )), 0.0, this1)) ).copy();
		//line 63 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
		result.reverse();
		//line 63 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
		return result;
	}
	
	
	public static <A> haxe.lang.Function semigroup()
	{
		//line 67 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Nel.hx"
		return new thx._Nel.Nel_Impl__semigroup_67__Fun<A>();
	}
	
	
}

