// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Enums extends haxe.lang.HxObject
{
	public Enums(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Enums()
	{
		//line 6 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Enums.hx"
		thx.Enums.__hx_ctor_thx_Enums(this);
	}
	
	
	public static void __hx_ctor_thx_Enums(thx.Enums __temp_me75)
	{
	}
	
	
	public static <T> java.lang.String string(T e)
	{
		//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Enums.hx"
		java.lang.String cons = haxe.root.Type.enumConstructor(e);
		//line 12 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Enums.hx"
		haxe.root.Array<java.lang.String> params = new haxe.root.Array<java.lang.String>(new java.lang.String[]{});
		//line 13 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Enums.hx"
		{
			//line 13 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Enums.hx"
			int _g = 0;
			//line 13 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Enums.hx"
			haxe.root.Array _g1 = haxe.root.Type.enumParameters(e);
			//line 13 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Enums.hx"
			while (( _g < _g1.length ))
			{
				//line 13 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Enums.hx"
				java.lang.Object param = _g1.__get(_g);
				//line 13 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Enums.hx"
				 ++ _g;
				//line 14 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Enums.hx"
				params.push(thx.Dynamics.string(param));
			}
			
		}
		
		//line 15 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Enums.hx"
		return ( cons + (( (( params.length == 0 )) ? ("") : (( ( "(" + params.join(", ") ) + ")" )) )) );
	}
	
	
	public static <T> int compare(T a, T b)
	{
		//line 24 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Enums.hx"
		int v = ( haxe.root.Type.enumIndex(a) - haxe.root.Type.enumIndex(b) );
		//line 25 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Enums.hx"
		if (( v != 0 )) 
		{
			//line 26 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Enums.hx"
			return v;
		}
		
		//line 27 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Enums.hx"
		return ((int) (thx.Arrays.compare(((haxe.root.Array<java.lang.Object>) (haxe.root.Type.enumParameters(a)) ), ((haxe.root.Array<java.lang.Object>) (haxe.root.Type.enumParameters(b)) ))) );
	}
	
	
	public static <T> boolean sameConstructor(T a, T b)
	{
		//line 34 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Enums.hx"
		return ( haxe.root.Type.enumIndex(a) == haxe.root.Type.enumIndex(b) );
	}
	
	
	public static <T> T min(T a, T b)
	{
		//line 41 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Enums.hx"
		if (( ((int) (thx.Enums.compare(((T) (a) ), ((T) (b) ))) ) < 0 )) 
		{
			//line 42 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Enums.hx"
			return a;
		}
		else
		{
			//line 44 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Enums.hx"
			return b;
		}
		
	}
	
	
	public static <T> T max(T a, T b)
	{
		//line 52 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Enums.hx"
		if (( ((int) (thx.Enums.compare(((T) (a) ), ((T) (b) ))) ) > 0 )) 
		{
			//line 53 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Enums.hx"
			return a;
		}
		else
		{
			//line 55 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Enums.hx"
			return b;
		}
		
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 6 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Enums.hx"
		return new thx.Enums(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 6 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Enums.hx"
		return new thx.Enums();
	}
	
	
}

