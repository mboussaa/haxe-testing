// Generated by Haxe 3.3.0
package thx._Ord;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public final class Ord_Impl_
{
	public static <A> thx.OrderingImpl order(haxe.lang.Function this1, A a0, A a1)
	{
		//line 46 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ord.hx"
		return ((thx.OrderingImpl) (this1.__hx_invoke2_o(0.0, a0, 0.0, a1)) );
	}
	
	
	public static <A> A max(haxe.lang.Function this1, A a0, A a1)
	{
		//line 49 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ord.hx"
		thx.OrderingImpl _g = ((thx.OrderingImpl) (this1.__hx_invoke2_o(0.0, a0, 0.0, a1)) );
		//line 49 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ord.hx"
		switch (_g)
		{
			case GT:
			{
				//line 49 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ord.hx"
				return a0;
			}
			
			
			case LT:
			case EQ:
			{
				//line 49 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ord.hx"
				return a1;
			}
			
			
		}
		
		//line 48 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ord.hx"
		return null;
	}
	
	
	public static <A> A min(haxe.lang.Function this1, A a0, A a1)
	{
		//line 55 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ord.hx"
		thx.OrderingImpl _g = ((thx.OrderingImpl) (this1.__hx_invoke2_o(0.0, a0, 0.0, a1)) );
		//line 55 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ord.hx"
		switch (_g)
		{
			case GT:
			{
				//line 55 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ord.hx"
				return a1;
			}
			
			
			case LT:
			case EQ:
			{
				//line 55 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ord.hx"
				return a0;
			}
			
			
		}
		
		//line 54 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ord.hx"
		return null;
	}
	
	
	public static <A> boolean equal(haxe.lang.Function this1, A a0, A a1)
	{
		//line 61 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ord.hx"
		return ( ((thx.OrderingImpl) (this1.__hx_invoke2_o(0.0, a0, 0.0, a1)) ) == thx.OrderingImpl.EQ );
	}
	
	
	public static <B, A> haxe.lang.Function contramap(haxe.lang.Function this1, haxe.lang.Function f)
	{
		//line 64 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ord.hx"
		return new thx._Ord.Ord_Impl__contramap_64__Fun<A, B>(this1, f);
	}
	
	
	public static <A> haxe.lang.Function inverse(haxe.lang.Function this1)
	{
		//line 67 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ord.hx"
		return new thx._Ord.Ord_Impl__inverse_67__Fun<A>(this1);
	}
	
	
	public static <A> int intComparison(haxe.lang.Function this1, A a0, A a1)
	{
		//line 70 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ord.hx"
		thx.OrderingImpl _g = ((thx.OrderingImpl) (this1.__hx_invoke2_o(0.0, a0, 0.0, a1)) );
		//line 70 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ord.hx"
		switch (_g)
		{
			case LT:
			{
				//line 70 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ord.hx"
				return -1;
			}
			
			
			case GT:
			{
				//line 70 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ord.hx"
				return 1;
			}
			
			
			case EQ:
			{
				//line 70 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ord.hx"
				return 0;
			}
			
			
		}
		
		//line 69 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ord.hx"
		return 0;
	}
	
	
	public static <A> haxe.lang.Function fromIntComparison(haxe.lang.Function f)
	{
		//line 77 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ord.hx"
		return new thx._Ord.Ord_Impl__fromIntComparison_77__Fun<A>(f);
	}
	
	
	public static <T> haxe.lang.Function forComparable()
	{
		//line 80 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ord.hx"
		return new thx._Ord.Ord_Impl__forComparable_80__Fun<T>();
	}
	
	
	public static <T> haxe.lang.Function forComparableOrd()
	{
		//line 83 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ord.hx"
		return new thx._Ord.Ord_Impl__forComparableOrd_83__Fun<T>();
	}
	
	
}


