// Generated by Haxe 3.3.0
package thx._Tuple;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public final class Tuple1_Impl_
{
	public static <T0> T0 _new(T0 _0)
	{
		//line 48 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Tuple.hx"
		return ((T0) (_0) );
	}
	
	
	
	
	public static <T0> T0 get__0(T0 this1)
	{
		//line 51 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Tuple.hx"
		return this1;
	}
	
	
	public static <T1, T0> java.lang.Object with(T0 this1, T1 v)
	{
		//line 58 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Tuple.hx"
		java.lang.Object this2 = new haxe.lang.DynamicObject(new java.lang.String[]{"_0", "_1"}, new java.lang.Object[]{((T0) (this1) ), v}, new java.lang.String[]{}, new double[]{});
		//line 58 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Tuple.hx"
		return ((java.lang.Object) (this2) );
	}
	
	
	public static <T0> java.lang.String toString(T0 this1)
	{
		//line 64 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Tuple.hx"
		return ( ( "Tuple1(" + haxe.root.Std.string(this1) ) + ")" );
	}
	
	
	public static <T> T arrayToTuple(haxe.root.Array<T> v)
	{
		//line 67 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Tuple.hx"
		T this1 = v.__get(0);
		//line 67 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Tuple.hx"
		return ((T) (this1) );
	}
	
	
}


