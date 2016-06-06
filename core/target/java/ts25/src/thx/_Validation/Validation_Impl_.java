// Generated by Haxe 3.3.0
package thx._Validation;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public final class Validation_Impl_
{
	public static <E, A> thx.Either validation(thx.Either e)
	{
		//line 16 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		return e;
	}
	
	
	public static <E, A> thx.Either vnel(thx.Either e)
	{
		//line 19 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		return e;
	}
	
	
	public static <E, A> thx.Either pure(A a)
	{
		//line 22 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		return thx.Either.Right(a);
	}
	
	
	public static <E, A> thx.Either success(A a)
	{
		//line 25 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		return ((thx.Either) (thx.Either.Right(a)) );
	}
	
	
	public static <E, A> thx.Either failure(E e)
	{
		//line 28 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		return thx.Either.Left(e);
	}
	
	
	public static <E, A> thx.Either nn(java.lang.Object a, E e)
	{
		//line 32 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		if (( a == null )) 
		{
			//line 32 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
			return ((thx.Either) (thx.Either.Left(e)) );
		}
		else
		{
			//line 32 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
			return ((thx.Either) (thx.Either.Right(a)) );
		}
		
	}
	
	
	public static <E, A> thx.Either successNel(A a)
	{
		//line 35 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		return ((thx.Either) (thx.Either.Right(a)) );
	}
	
	
	public static <E, A> thx.Either failureNel(E e)
	{
		//line 38 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		return thx.Either.Left(((thx.NonEmptyList) (thx._Nel.Nel_Impl_.pure(((E) (e) ))) ));
	}
	
	
	public static <E, A> thx.Either nnNel(java.lang.Object a, E e)
	{
		//line 42 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		if (( a == null )) 
		{
			//line 42 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
			return ((thx.Either) (thx.Either.Left(((thx.NonEmptyList) (thx._Nel.Nel_Impl_.pure(((E) (e) ))) ))) );
		}
		else
		{
			//line 42 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
			return ((thx.Either) (thx.Either.Right(a)) );
		}
		
	}
	
	
	
	
	public static <E, A> thx.Either get_either(thx.Either this1)
	{
		//line 46 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		return this1;
	}
	
	
	public static <B, E, A> thx.Either map(thx.Either this1, haxe.lang.Function f)
	{
		//line 49 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		return ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (this1) ), ((thx.Either) (thx.Either.Right(f)) ), ((haxe.lang.Function) (new thx._Validation.Validation_Impl__map_49__Fun<E>()) ))) );
	}
	
	
	public static <B, E, A> B foldLeft(thx.Either this1, B b, haxe.lang.Function f)
	{
		//line 52 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		switch (this1.index)
		{
			case 0:
			{
				//line 52 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
				return b;
			}
			
			
			case 1:
			{
				//line 54 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
				A a = ((A) (this1.params[0]) );
				//line 52 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
				return ((B) (f.__hx_invoke2_o(0.0, b, 0.0, a)) );
			}
			
			
		}
		
		//line 51 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		return null;
	}
	
	
	public static <B, E, A> B foldMap(thx.Either this1, haxe.lang.Function f, java.lang.Object m)
	{
		//line 61 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		thx.Either tmp = ((thx.Either) (thx.Eithers.map(((thx.Either) (this1) ), ((haxe.lang.Function) (f) ))) );
		//line 61 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		B tmp1 = ((B) (thx._Monoid.Monoid_Impl_.get_zero(((java.lang.Object) (m) ))) );
		//line 61 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		java.lang.Object _e = m;
		//line 61 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		return ((B) (thx._Validation.Validation_Impl_.foldLeft(((thx.Either) (tmp) ), ((java.lang.Object) (tmp1) ), ((haxe.lang.Function) (new thx._Validation.Validation_Impl__foldMap_61__Fun<B>(_e)) ))) );
	}
	
	
	public static <B, E, A> thx.Either ap(thx.Either this1, thx.Either v, haxe.lang.Function s)
	{
		//line 64 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		switch (this1.index)
		{
			case 0:
			{
				//line 65 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
				E e0 = ((E) (this1.params[0]) );
				//line 66 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
				thx.Either _g = ((thx.Either) (v) );
				//line 66 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
				switch (_g.index)
				{
					case 0:
					{
						//line 67 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
						E e1 = ((E) (_g.params[0]) );
						//line 64 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
						return thx.Either.Left(((E) (((haxe.lang.Function) (thx._Semigroup.Semigroup_Impl_.get_append(((haxe.lang.Function) (s) ))) ).__hx_invoke2_o(0.0, e0, 0.0, e1)) ));
					}
					
					
					case 1:
					{
						//line 64 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
						return thx.Either.Left(e0);
					}
					
					
				}
				
				//line 65 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
				break;
			}
			
			
			case 1:
			{
				//line 70 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
				A a = ((A) (this1.params[0]) );
				//line 71 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
				thx.Either _g1 = ((thx.Either) (v) );
				//line 71 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
				switch (_g1.index)
				{
					case 0:
					{
						//line 72 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
						E e = ((E) (_g1.params[0]) );
						//line 64 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
						return thx.Either.Left(e);
					}
					
					
					case 1:
					{
						//line 73 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
						haxe.lang.Function f = ((haxe.lang.Function) (_g1.params[0]) );
						//line 64 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
						return thx.Either.Right(((B) (f.__hx_invoke1_o(0.0, a)) ));
					}
					
					
				}
				
				//line 70 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
				break;
			}
			
			
		}
		
		//line 63 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		return null;
	}
	
	
	public static <B, E, A> thx.Either zip(thx.Either this1, thx.Either v, haxe.lang.Function s)
	{
		//line 78 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		return ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (this1) ), ((thx.Either) (thx.Eithers.map(((thx.Either) (v) ), ((haxe.lang.Function) (new thx._Validation.Validation_Impl__zip_78__Fun<A, B>()) ))) ), ((haxe.lang.Function) (s) ))) );
	}
	
	
	public static <E0, E, A> thx.Either leftMap(thx.Either this1, haxe.lang.Function f)
	{
		//line 81 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		return ((thx.Either) (thx.Eithers.leftMap(((thx.Either) (this1) ), ((haxe.lang.Function) (f) ))) );
	}
	
	
	public static <E, A> thx.Either wrapNel(thx.Either this1)
	{
		//line 84 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		return ((thx.Either) (thx.Eithers.leftMap(((thx.Either) (this1) ), ((haxe.lang.Function) (new haxe.lang.Closure(thx._Nel.Nel_Impl_.class, "pure")) ))) );
	}
	
	
	public static <E, A> thx.Either ensure(thx.Either this1, haxe.lang.Function p, E error)
	{
		//line 87 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		switch (this1.index)
		{
			case 1:
			{
				//line 88 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
				A a = ((A) (this1.params[0]) );
				//line 88 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
				if (haxe.lang.Runtime.toBool(p.__hx_invoke1_o(0.0, a))) 
				{
					//line 87 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
					return this1;
				}
				else
				{
					//line 87 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
					return ((thx.Either) (thx.Either.Left(error)) );
				}
				
			}
			
			
			default:
			{
				//line 87 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
				return this1;
			}
			
		}
		
	}
	
	
	public static <B, E, A> thx.Either flatMapV(thx.Either this1, haxe.lang.Function f)
	{
		//line 96 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		switch (this1.index)
		{
			case 0:
			{
				//line 97 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
				E a = ((E) (this1.params[0]) );
				//line 96 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
				return thx.Either.Left(a);
			}
			
			
			case 1:
			{
				//line 98 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
				A b = ((A) (this1.params[0]) );
				//line 96 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
				return ((thx.Either) (f.__hx_invoke1_o(0.0, b)) );
			}
			
			
		}
		
		//line 95 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		return null;
	}
	
	
	public static <X, A, B, C> thx.Either val2(haxe.lang.Function f, thx.Either v1, thx.Either v2, haxe.lang.Function s)
	{
		//line 103 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		return ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (v2) ), ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (v1) ), ((thx.Either) (thx.Either.Right(((haxe.lang.Function) (thx.Functions2.curry(((haxe.lang.Function) (f) ))) ))) ), ((haxe.lang.Function) (new thx._Validation.Validation_Impl__val2_103__Fun<X>()) ))) ), ((haxe.lang.Function) (s) ))) );
	}
	
	
	public static <X, A, B, C, D> thx.Either val3(haxe.lang.Function f, thx.Either v1, thx.Either v2, thx.Either v3, haxe.lang.Function s)
	{
		//line 106 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		haxe.lang.Function f1 = f;
		//line 106 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		return ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (v3) ), ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (v2) ), ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (v1) ), ((thx.Either) (thx.Either.Right(((haxe.lang.Function) (thx.Functions2.curry(((haxe.lang.Function) (new thx._Validation.Validation_Impl__val3_106__Fun_0<C, D, B, A>(f1)) ))) ))) ), ((haxe.lang.Function) (new thx._Validation.Validation_Impl__val3_106__Fun<X>()) ))) ), ((haxe.lang.Function) (s) ))) ), ((haxe.lang.Function) (s) ))) );
	}
	
	
	public static <X, A, B, C, D, E> thx.Either val4(haxe.lang.Function f, thx.Either v1, thx.Either v2, thx.Either v3, thx.Either v4, haxe.lang.Function s)
	{
		//line 112 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		haxe.lang.Function f1 = f;
		//line 112 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		haxe.lang.Function f2 = new thx._Validation.Validation_Impl__val4_112__Fun_2<D, E, C, B, A>(f1);
		//line 112 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		return ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (v4) ), ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (v3) ), ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (v2) ), ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (v1) ), ((thx.Either) (thx.Either.Right(((haxe.lang.Function) (thx.Functions2.curry(((haxe.lang.Function) (new thx._Validation.Validation_Impl__val4_112__Fun_0<C, D, E, B, A>(f2)) ))) ))) ), ((haxe.lang.Function) (new thx._Validation.Validation_Impl__val4_112__Fun<X>()) ))) ), ((haxe.lang.Function) (s) ))) ), ((haxe.lang.Function) (s) ))) ), ((haxe.lang.Function) (s) ))) );
	}
	
	
	public static <X, A, B, C, D, E, F> thx.Either val5(haxe.lang.Function f, thx.Either v1, thx.Either v2, thx.Either v3, thx.Either v4, thx.Either v5, haxe.lang.Function s)
	{
		//line 118 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		haxe.lang.Function f1 = f;
		//line 118 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		haxe.lang.Function f2 = new thx._Validation.Validation_Impl__val5_118__Fun_4<E, F, D, C, B, A>(f1);
		//line 118 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		haxe.lang.Function f3 = new thx._Validation.Validation_Impl__val5_118__Fun_2<D, E, F, C, B, A>(f2);
		//line 118 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		return ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (v5) ), ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (v4) ), ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (v3) ), ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (v2) ), ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (v1) ), ((thx.Either) (thx.Either.Right(((haxe.lang.Function) (thx.Functions2.curry(((haxe.lang.Function) (new thx._Validation.Validation_Impl__val5_118__Fun_0<C, D, E, F, B, A>(f3)) ))) ))) ), ((haxe.lang.Function) (new thx._Validation.Validation_Impl__val5_118__Fun<X>()) ))) ), ((haxe.lang.Function) (s) ))) ), ((haxe.lang.Function) (s) ))) ), ((haxe.lang.Function) (s) ))) ), ((haxe.lang.Function) (s) ))) );
	}
	
	
	public static <X, A, B, C, D, E, F, G> thx.Either val6(haxe.lang.Function f, thx.Either v1, thx.Either v2, thx.Either v3, thx.Either v4, thx.Either v5, thx.Either v6, haxe.lang.Function s)
	{
		//line 124 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		haxe.lang.Function f1 = f;
		//line 124 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		haxe.lang.Function f2 = new thx._Validation.Validation_Impl__val6_124__Fun_6<F, G, E, D, C, B, A>(f1);
		//line 124 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		haxe.lang.Function f3 = new thx._Validation.Validation_Impl__val6_124__Fun_4<E, F, G, D, C, B, A>(f2);
		//line 124 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		haxe.lang.Function f4 = new thx._Validation.Validation_Impl__val6_124__Fun_2<D, E, F, G, C, B, A>(f3);
		//line 124 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		return ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (v6) ), ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (v5) ), ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (v4) ), ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (v3) ), ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (v2) ), ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (v1) ), ((thx.Either) (thx.Either.Right(((haxe.lang.Function) (thx.Functions2.curry(((haxe.lang.Function) (new thx._Validation.Validation_Impl__val6_124__Fun_0<C, D, E, F, G, B, A>(f4)) ))) ))) ), ((haxe.lang.Function) (new thx._Validation.Validation_Impl__val6_124__Fun<X>()) ))) ), ((haxe.lang.Function) (s) ))) ), ((haxe.lang.Function) (s) ))) ), ((haxe.lang.Function) (s) ))) ), ((haxe.lang.Function) (s) ))) ), ((haxe.lang.Function) (s) ))) );
	}
	
	
	public static <X, A, B, C, D, E, F, G, H> thx.Either val7(haxe.lang.Function f, thx.Either v1, thx.Either v2, thx.Either v3, thx.Either v4, thx.Either v5, thx.Either v6, thx.Either v7, haxe.lang.Function s)
	{
		//line 130 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		haxe.lang.Function f1 = f;
		//line 130 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		haxe.lang.Function f2 = new thx._Validation.Validation_Impl__val7_130__Fun_8<G, H, F, E, D, C, B, A>(f1);
		//line 130 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		haxe.lang.Function f3 = new thx._Validation.Validation_Impl__val7_130__Fun_6<F, G, H, E, D, C, B, A>(f2);
		//line 130 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		haxe.lang.Function f4 = new thx._Validation.Validation_Impl__val7_130__Fun_4<E, F, G, H, D, C, B, A>(f3);
		//line 130 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		haxe.lang.Function f5 = new thx._Validation.Validation_Impl__val7_130__Fun_2<D, E, F, G, H, C, B, A>(f4);
		//line 130 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		return ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (v7) ), ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (v6) ), ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (v5) ), ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (v4) ), ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (v3) ), ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (v2) ), ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (v1) ), ((thx.Either) (thx.Either.Right(((haxe.lang.Function) (thx.Functions2.curry(((haxe.lang.Function) (new thx._Validation.Validation_Impl__val7_130__Fun_0<C, D, E, F, G, H, B, A>(f5)) ))) ))) ), ((haxe.lang.Function) (new thx._Validation.Validation_Impl__val7_130__Fun<X>()) ))) ), ((haxe.lang.Function) (s) ))) ), ((haxe.lang.Function) (s) ))) ), ((haxe.lang.Function) (s) ))) ), ((haxe.lang.Function) (s) ))) ), ((haxe.lang.Function) (s) ))) ), ((haxe.lang.Function) (s) ))) );
	}
	
	
	public static <X, A, B, C, D, E, F, G, H, I> thx.Either val8(haxe.lang.Function f, thx.Either v1, thx.Either v2, thx.Either v3, thx.Either v4, thx.Either v5, thx.Either v6, thx.Either v7, thx.Either v8, haxe.lang.Function s)
	{
		//line 136 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		haxe.lang.Function f1 = f;
		//line 136 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		haxe.lang.Function f2 = new thx._Validation.Validation_Impl__val8_136__Fun_10<H, I, G, F, E, D, C, B, A>(f1);
		//line 136 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		haxe.lang.Function f3 = new thx._Validation.Validation_Impl__val8_136__Fun_8<G, H, I, F, E, D, C, B, A>(f2);
		//line 136 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		haxe.lang.Function f4 = new thx._Validation.Validation_Impl__val8_136__Fun_6<F, G, H, I, E, D, C, B, A>(f3);
		//line 136 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		haxe.lang.Function f5 = new thx._Validation.Validation_Impl__val8_136__Fun_4<E, F, G, H, I, D, C, B, A>(f4);
		//line 136 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		haxe.lang.Function f6 = new thx._Validation.Validation_Impl__val8_136__Fun_2<D, E, F, G, H, I, C, B, A>(f5);
		//line 136 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		return ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (v8) ), ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (v7) ), ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (v6) ), ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (v5) ), ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (v4) ), ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (v3) ), ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (v2) ), ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (v1) ), ((thx.Either) (thx.Either.Right(((haxe.lang.Function) (thx.Functions2.curry(((haxe.lang.Function) (new thx._Validation.Validation_Impl__val8_136__Fun_0<C, D, E, F, G, H, I, B, A>(f6)) ))) ))) ), ((haxe.lang.Function) (new thx._Validation.Validation_Impl__val8_136__Fun<X>()) ))) ), ((haxe.lang.Function) (s) ))) ), ((haxe.lang.Function) (s) ))) ), ((haxe.lang.Function) (s) ))) ), ((haxe.lang.Function) (s) ))) ), ((haxe.lang.Function) (s) ))) ), ((haxe.lang.Function) (s) ))) ), ((haxe.lang.Function) (s) ))) );
	}
	
	
}

