// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Eithers extends haxe.lang.HxObject
{
	public Eithers(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Eithers()
	{
		//line 8 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
		thx.Eithers.__hx_ctor_thx_Eithers(this);
	}
	
	
	public static void __hx_ctor_thx_Eithers(thx.Eithers __temp_me65)
	{
	}
	
	
	public static <L, R> boolean isLeft(thx.Either either)
	{
		//line 13 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
		switch (either.index)
		{
			case 0:
			{
				//line 13 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
				return true;
			}
			
			
			case 1:
			{
				//line 13 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
				return false;
			}
			
			
		}
		
		//line 12 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
		return false;
	}
	
	
	public static <L, R> boolean isRight(thx.Either either)
	{
		//line 23 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
		switch (either.index)
		{
			case 0:
			{
				//line 23 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
				return false;
			}
			
			
			case 1:
			{
				//line 23 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
				return true;
			}
			
			
		}
		
		//line 22 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
		return false;
	}
	
	
	public static <L, R> haxe.ds.Option toLeft(thx.Either either)
	{
		//line 33 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
		switch (either.index)
		{
			case 0:
			{
				//line 34 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
				L v = ((L) (either.params[0]) );
				//line 33 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
				return haxe.ds.Option.Some(v);
			}
			
			
			case 1:
			{
				//line 33 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
				return haxe.ds.Option.None;
			}
			
			
		}
		
		//line 32 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
		return null;
	}
	
	
	public static <L, R> haxe.ds.Option toRight(thx.Either either)
	{
		//line 43 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
		switch (either.index)
		{
			case 0:
			{
				//line 43 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
				return haxe.ds.Option.None;
			}
			
			
			case 1:
			{
				//line 45 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
				R v = ((R) (either.params[0]) );
				//line 43 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
				return haxe.ds.Option.Some(v);
			}
			
			
		}
		
		//line 42 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
		return null;
	}
	
	
	public static <L, R> java.lang.Object toLeftUnsafe(thx.Either either)
	{
		//line 53 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
		switch (either.index)
		{
			case 0:
			{
				//line 54 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
				L v = ((L) (either.params[0]) );
				//line 53 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
				return v;
			}
			
			
			case 1:
			{
				//line 53 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
				return null;
			}
			
			
		}
		
		//line 52 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
		return null;
	}
	
	
	public static <L, R> java.lang.Object toRightUnsafe(thx.Either either)
	{
		//line 63 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
		switch (either.index)
		{
			case 0:
			{
				//line 63 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
				return null;
			}
			
			
			case 1:
			{
				//line 65 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
				R v = ((R) (either.params[0]) );
				//line 63 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
				return v;
			}
			
			
		}
		
		//line 62 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
		return null;
	}
	
	
	public static <L, RIn, ROut> thx.Either map(thx.Either either, haxe.lang.Function f)
	{
		//line 70 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
		switch (either.index)
		{
			case 0:
			{
				//line 71 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
				L v = ((L) (either.params[0]) );
				//line 70 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
				return thx.Either.Left(v);
			}
			
			
			case 1:
			{
				//line 72 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
				RIn v1 = ((RIn) (either.params[0]) );
				//line 70 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
				return thx.Either.Right(((ROut) (f.__hx_invoke1_o(0.0, v1)) ));
			}
			
			
		}
		
		//line 69 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
		return null;
	}
	
	
	public static <L, RIn, ROut> thx.Either flatMap(thx.Either either, haxe.lang.Function f)
	{
		//line 79 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
		switch (either.index)
		{
			case 0:
			{
				//line 80 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
				L v = ((L) (either.params[0]) );
				//line 79 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
				return thx.Either.Left(v);
			}
			
			
			case 1:
			{
				//line 81 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
				RIn v1 = ((RIn) (either.params[0]) );
				//line 79 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
				return ((thx.Either) (f.__hx_invoke1_o(0.0, v1)) );
			}
			
			
		}
		
		//line 78 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
		return null;
	}
	
	
	public static <LIn, LOut, R> thx.Either leftMap(thx.Either either, haxe.lang.Function f)
	{
		//line 86 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
		switch (either.index)
		{
			case 0:
			{
				//line 87 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
				LIn v = ((LIn) (either.params[0]) );
				//line 86 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
				return thx.Either.Left(((LOut) (f.__hx_invoke1_o(0.0, v)) ));
			}
			
			
			case 1:
			{
				//line 88 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
				R v1 = ((R) (either.params[0]) );
				//line 86 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
				return thx.Either.Right(v1);
			}
			
			
		}
		
		//line 85 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
		return null;
	}
	
	
	public static <L, R> R orThrow(thx.Either either, java.lang.String message)
	{
		//line 92 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
		switch (either.index)
		{
			case 0:
			{
				//line 93 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
				L v = ((L) (either.params[0]) );
				//line 93 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
				throw haxe.lang.HaxeException.wrap(new thx.Error(( ( ( "" + message ) + ": " ) + haxe.root.Std.string(v) ), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.Eithers", "Eithers.hx", "orThrow"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (93) )) )})));
			}
			
			
			case 1:
			{
				//line 94 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
				R v1 = ((R) (either.params[0]) );
				//line 92 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
				return v1;
			}
			
			
		}
		
		//line 91 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
		return null;
	}
	
	
	public static <E, T> thx.Either toVNel(thx.Either either)
	{
		//line 98 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
		switch (either.index)
		{
			case 0:
			{
				//line 99 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
				E e = ((E) (either.params[0]) );
				//line 98 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
				return ((thx.Either) (thx.Either.Left(((thx.NonEmptyList) (thx._Nel.Nel_Impl_.pure(((E) (e) ))) ))) );
			}
			
			
			case 1:
			{
				//line 100 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
				T v = ((T) (either.params[0]) );
				//line 98 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
				return ((thx.Either) (thx.Either.Right(v)) );
			}
			
			
		}
		
		//line 97 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
		return null;
	}
	
	
	public static <L, R, A> A cata(thx.Either either, haxe.lang.Function l, haxe.lang.Function r)
	{
		//line 104 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
		switch (either.index)
		{
			case 0:
			{
				//line 105 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
				L l0 = ((L) (either.params[0]) );
				//line 104 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
				return ((A) (l.__hx_invoke1_o(0.0, l0)) );
			}
			
			
			case 1:
			{
				//line 106 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
				R r0 = ((R) (either.params[0]) );
				//line 104 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
				return ((A) (r.__hx_invoke1_o(0.0, r0)) );
			}
			
			
		}
		
		//line 103 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
		return null;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 8 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
		return new thx.Eithers(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 8 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Eithers.hx"
		return new thx.Eithers();
	}
	
	
}


