// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ValidationExtensions extends haxe.lang.HxObject
{
	public ValidationExtensions(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public ValidationExtensions()
	{
		//line 139 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		thx.ValidationExtensions.__hx_ctor_thx_ValidationExtensions(this);
	}
	
	
	public static void __hx_ctor_thx_ValidationExtensions(thx.ValidationExtensions __temp_me112)
	{
	}
	
	
	public static <E, E0, A> thx.Either leftMapNel(thx.Either n, haxe.lang.Function f)
	{
		//line 141 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		return ((thx.Either) (thx.Eithers.leftMap(((thx.Either) (n) ), ((haxe.lang.Function) (new thx.ValidationExtensions_leftMapNel_141__Fun<E0, E>(f)) ))) );
	}
	
	
	public static <E, A> thx.Either ensureNel(thx.Either v, haxe.lang.Function p, E error)
	{
		//line 144 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		switch (v.index)
		{
			case 1:
			{
				//line 145 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
				A a = ((A) (((thx.Either) (v) ).params[0]) );
				//line 145 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
				if (haxe.lang.Runtime.toBool(p.__hx_invoke1_o(0.0, a))) 
				{
					//line 144 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
					return v;
				}
				else
				{
					//line 144 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
					return ((thx.Either) (thx.Either.Left(((thx.NonEmptyList) (thx._Nel.Nel_Impl_.pure(((E) (error) ))) ))) );
				}
				
			}
			
			
			default:
			{
				//line 144 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
				return v;
			}
			
		}
		
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 139 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		return new thx.ValidationExtensions(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 139 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Validation.hx"
		return new thx.ValidationExtensions();
	}
	
	
}


