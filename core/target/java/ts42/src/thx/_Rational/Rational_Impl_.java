// Generated by Haxe 3.3.0
package thx._Rational;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public final class Rational_Impl_
{
	static
	{
		//line 4 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		thx._Rational.Rational_Impl_.zero = ((java.lang.Object) (new haxe.lang.DynamicObject(new java.lang.String[]{"den", "num"}, new java.lang.Object[]{thx._BigInt.BigInt_Impl_.zero, thx._BigInt.BigInt_Impl_.one}, new java.lang.String[]{}, new double[]{})) );
	}
	
	public static java.lang.Object zero;
	
	
	
	
	
	public static java.lang.Object fromString(java.lang.String s)
	{
		//line 10 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		haxe.root.Array<java.lang.String> parts = ((haxe.root.Array<java.lang.String>) (((haxe.root.Array) (haxe.lang.StringExt.split(s, "/").map(((haxe.lang.Function) (new haxe.lang.Closure(haxe.root.StringTools.class, "trim")) ))) )) );
		//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		if (( parts.length > 2 )) 
		{
			//line 12 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
			throw haxe.lang.HaxeException.wrap(new thx.Error(( ( "string \"" + s ) + "\" cannot be parsed to a Rational" ), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx._Rational.Rational_Impl_", "Rational.hx", "fromString"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (12) )) )})));
		}
		
		//line 13 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		if (( parts.length == 1 )) 
		{
			//line 14 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
			return thx._Rational.Rational_Impl_.create(((thx.bigint.BigIntImpl) (thx.bigint.Bigs.parseBase(parts.__get(0), 10)) ), thx._BigInt.BigInt_Impl_.one);
		}
		
		//line 15 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		return thx._Rational.Rational_Impl_.create(((thx.bigint.BigIntImpl) (thx.bigint.Bigs.parseBase(parts.__get(0), 10)) ), ((thx.bigint.BigIntImpl) (thx.bigint.Bigs.parseBase(parts.__get(1), 10)) ));
	}
	
	
	public static java.lang.Object fromBigInt(thx.bigint.BigIntImpl i)
	{
		//line 19 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		return thx._Rational.Rational_Impl_.create(i, thx._BigInt.BigInt_Impl_.one);
	}
	
	
	public static java.lang.Object fromInt(int i)
	{
		//line 22 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		return thx._Rational.Rational_Impl_.create(((thx.bigint.BigIntImpl) (thx.bigint.Bigs.fromInt(i)) ), thx._BigInt.BigInt_Impl_.one);
	}
	
	
	public static java.lang.Object create(thx.bigint.BigIntImpl num, thx.bigint.BigIntImpl den)
	{
		//line 25 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		if (thx._BigInt.BigInt_Impl_.equals(den, ((thx.bigint.BigIntImpl) (thx.bigint.Bigs.fromInt(0)) ))) 
		{
			//line 26 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
			throw haxe.lang.HaxeException.wrap(new thx.Error("division by zero", null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx._Rational.Rational_Impl_", "Rational.hx", "create"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (26) )) )})));
		}
		
		//line 27 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		int g = thx.Ints.gcd(((thx.bigint.BigIntImpl) (num) ).toInt(), ((thx.bigint.BigIntImpl) (den) ).toInt());
		//line 28 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		num = thx.bigint.Bigs.fromInt(((int) (((thx.bigint.BigIntImpl) (((thx.bigint.BigIntImpl) (num) ).divide(((thx.bigint.BigIntImpl) (thx.bigint.Bigs.fromInt(g)) ))) ).toInt()) ));
		//line 29 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		den = thx.bigint.Bigs.fromInt(((int) (((thx.bigint.BigIntImpl) (((thx.bigint.BigIntImpl) (den) ).divide(((thx.bigint.BigIntImpl) (thx.bigint.Bigs.fromInt(g)) ))) ).toInt()) ));
		//line 30 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		if (thx._BigInt.BigInt_Impl_.less(den, ((thx.bigint.BigIntImpl) (thx.bigint.Bigs.fromInt(0)) ))) 
		{
			//line 31 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
			num = ((thx.bigint.BigIntImpl) (((thx.bigint.BigIntImpl) (num) ).negate()) );
			//line 32 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
			den = ((thx.bigint.BigIntImpl) (((thx.bigint.BigIntImpl) (den) ).negate()) );
		}
		
		//line 34 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		if (thx._BigInt.BigInt_Impl_.equals(num, ((thx.bigint.BigIntImpl) (thx.bigint.Bigs.fromInt(0)) ))) 
		{
			//line 35 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
			den = ((thx.bigint.BigIntImpl) (thx.bigint.Bigs.fromInt(1)) );
		}
		
		//line 36 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		int num1 = ((thx.bigint.BigIntImpl) (num) ).toInt();
		//line 36 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		int den1 = ((thx.bigint.BigIntImpl) (den) ).toInt();
		//line 36 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		java.lang.Object this1 = null;
		//line 36 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		{
			//line 36 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
			thx.bigint.BigIntImpl __temp_odecl1 = ((thx.bigint.BigIntImpl) (thx.bigint.Bigs.fromInt(num1)) );
			//line 36 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
			thx.bigint.BigIntImpl __temp_odecl2 = ((thx.bigint.BigIntImpl) (thx.bigint.Bigs.fromInt(den1)) );
			//line 36 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
			this1 = new haxe.lang.DynamicObject(new java.lang.String[]{"den", "num"}, new java.lang.Object[]{__temp_odecl2, __temp_odecl1}, new java.lang.String[]{}, new double[]{});
		}
		
		//line 36 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		return ((java.lang.Object) (this1) );
	}
	
	
	public static java.lang.Object _new(int num, int den)
	{
		//line 39 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		java.lang.Object this1 = null;
		//line 40 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		{
			//line 40 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
			thx.bigint.BigIntImpl __temp_odecl1 = ((thx.bigint.BigIntImpl) (thx.bigint.Bigs.fromInt(num)) );
			//line 40 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
			thx.bigint.BigIntImpl __temp_odecl2 = ((thx.bigint.BigIntImpl) (thx.bigint.Bigs.fromInt(den)) );
			//line 40 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
			this1 = new haxe.lang.DynamicObject(new java.lang.String[]{"den", "num"}, new java.lang.Object[]{__temp_odecl2, __temp_odecl1}, new java.lang.String[]{}, new double[]{});
		}
		
		//line 39 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		return ((java.lang.Object) (this1) );
	}
	
	
	public static java.lang.Object abs(java.lang.Object this1)
	{
		//line 43 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		int num = ((thx.bigint.BigIntImpl) (((thx.bigint.BigIntImpl) (haxe.lang.Runtime.getField(((java.lang.Object) (this1) ), "num", true)) ).abs()) ).toInt();
		//line 43 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		int den = ((thx.bigint.BigIntImpl) (haxe.lang.Runtime.getField(((java.lang.Object) (this1) ), "den", true)) ).toInt();
		//line 43 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		java.lang.Object this2 = null;
		//line 43 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		{
			//line 43 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
			thx.bigint.BigIntImpl __temp_odecl1 = ((thx.bigint.BigIntImpl) (thx.bigint.Bigs.fromInt(num)) );
			//line 43 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
			thx.bigint.BigIntImpl __temp_odecl2 = ((thx.bigint.BigIntImpl) (thx.bigint.Bigs.fromInt(den)) );
			//line 43 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
			this2 = new haxe.lang.DynamicObject(new java.lang.String[]{"den", "num"}, new java.lang.Object[]{__temp_odecl2, __temp_odecl1}, new java.lang.String[]{}, new double[]{});
		}
		
		//line 43 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		return ((java.lang.Object) (this2) );
	}
	
	
	public static java.lang.Object negate(java.lang.Object this1)
	{
		//line 47 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		int num = ((thx.bigint.BigIntImpl) (((thx.bigint.BigIntImpl) (haxe.lang.Runtime.getField(((java.lang.Object) (this1) ), "num", true)) ).negate()) ).toInt();
		//line 47 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		int den = ((thx.bigint.BigIntImpl) (haxe.lang.Runtime.getField(((java.lang.Object) (this1) ), "den", true)) ).toInt();
		//line 47 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		java.lang.Object this2 = null;
		//line 47 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		{
			//line 47 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
			thx.bigint.BigIntImpl __temp_odecl1 = ((thx.bigint.BigIntImpl) (thx.bigint.Bigs.fromInt(num)) );
			//line 47 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
			thx.bigint.BigIntImpl __temp_odecl2 = ((thx.bigint.BigIntImpl) (thx.bigint.Bigs.fromInt(den)) );
			//line 47 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
			this2 = new haxe.lang.DynamicObject(new java.lang.String[]{"den", "num"}, new java.lang.Object[]{__temp_odecl2, __temp_odecl1}, new java.lang.String[]{}, new double[]{});
		}
		
		//line 47 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		return ((java.lang.Object) (this2) );
	}
	
	
	public static java.lang.Object add(java.lang.Object this1, java.lang.Object that)
	{
		//line 51 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		if (( thx._Rational.Rational_Impl_.compareTo(this1, thx._Rational.Rational_Impl_.zero) == 0 )) 
		{
			//line 51 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
			return that;
		}
		
		//line 52 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		if (( thx._Rational.Rational_Impl_.compareTo(that, thx._Rational.Rational_Impl_.zero) == 0 )) 
		{
			//line 52 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
			return this1;
		}
		
		//line 53 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		int f = thx.Ints.gcd(((thx.bigint.BigIntImpl) (haxe.lang.Runtime.getField(((java.lang.Object) (this1) ), "num", true)) ).toInt(), ((thx.bigint.BigIntImpl) (haxe.lang.Runtime.getField(((java.lang.Object) (that) ), "num", true)) ).toInt());
		//line 53 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		int g = thx.Ints.gcd(((thx.bigint.BigIntImpl) (haxe.lang.Runtime.getField(((java.lang.Object) (this1) ), "den", true)) ).toInt(), ((thx.bigint.BigIntImpl) (haxe.lang.Runtime.getField(((java.lang.Object) (that) ), "den", true)) ).toInt());
		//line 53 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		java.lang.Object s = thx._Rational.Rational_Impl_.create(thx.bigint.Bigs.fromInt(( ( ((int) (((thx.bigint.BigIntImpl) (((thx.bigint.BigIntImpl) (haxe.lang.Runtime.getField(((java.lang.Object) (this1) ), "num", true)) ).divide(((thx.bigint.BigIntImpl) (thx.bigint.Bigs.fromInt(f)) ))) ).toInt()) ) * ((int) (((thx.bigint.BigIntImpl) (((thx.bigint.BigIntImpl) (haxe.lang.Runtime.getField(((java.lang.Object) (that) ), "den", true)) ).divide(((thx.bigint.BigIntImpl) (thx.bigint.Bigs.fromInt(g)) ))) ).toInt()) ) ) + ( ((int) (((thx.bigint.BigIntImpl) (((thx.bigint.BigIntImpl) (haxe.lang.Runtime.getField(((java.lang.Object) (that) ), "num", true)) ).divide(((thx.bigint.BigIntImpl) (thx.bigint.Bigs.fromInt(f)) ))) ).toInt()) ) * ((int) (((thx.bigint.BigIntImpl) (((thx.bigint.BigIntImpl) (haxe.lang.Runtime.getField(((java.lang.Object) (this1) ), "den", true)) ).divide(((thx.bigint.BigIntImpl) (thx.bigint.Bigs.fromInt(g)) ))) ).toInt()) ) ) )), thx.bigint.Bigs.fromInt(thx.Ints.lcm(((thx.bigint.BigIntImpl) (haxe.lang.Runtime.getField(((java.lang.Object) (this1) ), "den", true)) ).toInt(), ((thx.bigint.BigIntImpl) (haxe.lang.Runtime.getField(((java.lang.Object) (that) ), "den", true)) ).toInt())));
		//line 61 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		haxe.lang.Runtime.setField(s, "num", ((thx.bigint.BigIntImpl) (haxe.lang.Runtime.getField(s, "num", true)) ).multiply(((thx.bigint.BigIntImpl) (thx.bigint.Bigs.fromInt(f)) )));
		//line 62 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		return s;
	}
	
	
	public static java.lang.Object subtract(java.lang.Object this1, java.lang.Object that)
	{
		//line 67 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		return thx._Rational.Rational_Impl_.add(this1, thx._Rational.Rational_Impl_.negate(that));
	}
	
	
	public static java.lang.Object multiply(java.lang.Object this1, java.lang.Object that)
	{
		//line 72 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		java.lang.Object c = thx._Rational.Rational_Impl_.create(((thx.bigint.BigIntImpl) (haxe.lang.Runtime.getField(((java.lang.Object) (this1) ), "num", true)) ), ((thx.bigint.BigIntImpl) (haxe.lang.Runtime.getField(((java.lang.Object) (that) ), "den", true)) ));
		//line 72 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		java.lang.Object d = thx._Rational.Rational_Impl_.create(((thx.bigint.BigIntImpl) (haxe.lang.Runtime.getField(((java.lang.Object) (that) ), "num", true)) ), ((thx.bigint.BigIntImpl) (haxe.lang.Runtime.getField(((java.lang.Object) (this1) ), "den", true)) ));
		//line 74 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		return thx._Rational.Rational_Impl_.create(((thx.bigint.BigIntImpl) (((thx.bigint.BigIntImpl) (haxe.lang.Runtime.getField(((java.lang.Object) (c) ), "num", true)) ).multiply(((thx.bigint.BigIntImpl) (haxe.lang.Runtime.getField(((java.lang.Object) (d) ), "num", true)) ))) ), ((thx.bigint.BigIntImpl) (((thx.bigint.BigIntImpl) (haxe.lang.Runtime.getField(((java.lang.Object) (c) ), "den", true)) ).multiply(((thx.bigint.BigIntImpl) (haxe.lang.Runtime.getField(((java.lang.Object) (d) ), "den", true)) ))) ));
	}
	
	
	public static java.lang.Object divide(java.lang.Object this1, java.lang.Object that)
	{
		//line 79 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		return thx._Rational.Rational_Impl_.multiply(this1, thx._Rational.Rational_Impl_.reciprocal(that));
	}
	
	
	public static java.lang.Object reciprocal(java.lang.Object this1)
	{
		//line 82 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		return thx._Rational.Rational_Impl_.create(((thx.bigint.BigIntImpl) (haxe.lang.Runtime.getField(((java.lang.Object) (this1) ), "den", true)) ), ((thx.bigint.BigIntImpl) (haxe.lang.Runtime.getField(((java.lang.Object) (this1) ), "num", true)) ));
	}
	
	
	public static boolean isZero(java.lang.Object this1)
	{
		//line 85 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		return ((thx.bigint.BigIntImpl) (haxe.lang.Runtime.getField(((java.lang.Object) (this1) ), "num", true)) ).isZero();
	}
	
	
	public static boolean isNegative(java.lang.Object this1)
	{
		//line 88 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		return haxe.lang.Runtime.toBool(haxe.lang.Runtime.getField(((thx.bigint.BigIntImpl) (haxe.lang.Runtime.getField(((java.lang.Object) (this1) ), "num", true)) ), "sign", true));
	}
	
	
	public static int compareTo(java.lang.Object this1, java.lang.Object that)
	{
		//line 91 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		thx.bigint.BigIntImpl lhs = ((thx.bigint.BigIntImpl) (((thx.bigint.BigIntImpl) (haxe.lang.Runtime.getField(((java.lang.Object) (this1) ), "num", true)) ).multiply(((thx.bigint.BigIntImpl) (haxe.lang.Runtime.getField(((java.lang.Object) (that) ), "den", true)) ))) );
		//line 91 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		thx.bigint.BigIntImpl rhs = ((thx.bigint.BigIntImpl) (((thx.bigint.BigIntImpl) (haxe.lang.Runtime.getField(((java.lang.Object) (this1) ), "den", true)) ).multiply(((thx.bigint.BigIntImpl) (haxe.lang.Runtime.getField(((java.lang.Object) (that) ), "num", true)) ))) );
		//line 93 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		return ((thx.bigint.BigIntImpl) (lhs) ).compareTo(rhs);
	}
	
	
	public static boolean greaterThan(java.lang.Object this1, java.lang.Object that)
	{
		//line 97 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		return ( thx._Rational.Rational_Impl_.compareTo(this1, that) > 0 );
	}
	
	
	public static boolean greater(java.lang.Object self, java.lang.Object that)
	{
		//line 101 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		return ( thx._Rational.Rational_Impl_.compareTo(self, that) > 0 );
	}
	
	
	public static boolean greaterEqualsTo(java.lang.Object this1, java.lang.Object that)
	{
		//line 104 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		return ( thx._Rational.Rational_Impl_.compareTo(this1, that) >= 0 );
	}
	
	
	public static boolean greaterEquals(java.lang.Object self, java.lang.Object that)
	{
		//line 108 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		return ( thx._Rational.Rational_Impl_.compareTo(self, that) >= 0 );
	}
	
	
	public static boolean lessThan(java.lang.Object this1, java.lang.Object that)
	{
		//line 111 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		return ( thx._Rational.Rational_Impl_.compareTo(this1, that) < 0 );
	}
	
	
	public static boolean less(java.lang.Object self, java.lang.Object that)
	{
		//line 115 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		return ( thx._Rational.Rational_Impl_.compareTo(self, that) < 0 );
	}
	
	
	public static boolean lessEqualsTo(java.lang.Object this1, java.lang.Object that)
	{
		//line 118 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		return ( thx._Rational.Rational_Impl_.compareTo(this1, that) <= 0 );
	}
	
	
	public static boolean lessEquals(java.lang.Object self, java.lang.Object that)
	{
		//line 122 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		return ( thx._Rational.Rational_Impl_.compareTo(self, that) <= 0 );
	}
	
	
	public static boolean equalsTo(java.lang.Object this1, java.lang.Object that)
	{
		//line 125 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		return ( thx._Rational.Rational_Impl_.compareTo(this1, that) == 0 );
	}
	
	
	public static boolean equals(java.lang.Object self, java.lang.Object that)
	{
		//line 129 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		return ( thx._Rational.Rational_Impl_.compareTo(self, that) == 0 );
	}
	
	
	public static boolean notEqualsTo(java.lang.Object this1, java.lang.Object that)
	{
		//line 132 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		return ( thx._Rational.Rational_Impl_.compareTo(this1, that) != 0 );
	}
	
	
	public static boolean notEquals(java.lang.Object self, java.lang.Object that)
	{
		//line 136 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		return ( thx._Rational.Rational_Impl_.compareTo(self, that) != 0 );
	}
	
	
	public static double toFloat(java.lang.Object this1)
	{
		//line 139 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		return ( ((thx.bigint.BigIntImpl) (haxe.lang.Runtime.getField(((java.lang.Object) (this1) ), "num", true)) ).toFloat() / ((thx.bigint.BigIntImpl) (haxe.lang.Runtime.getField(((java.lang.Object) (this1) ), "den", true)) ).toFloat() );
	}
	
	
	public static thx.bigint.DecimalImpl toDecimal(java.lang.Object this1, java.lang.Object extraScale)
	{
		//line 142 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		java.lang.Object __temp_extraScale137 = ( (haxe.lang.Runtime.eq(extraScale, null)) ? (((java.lang.Object) (0) )) : (extraScale) );
		//line 142 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		return ((thx.bigint.DecimalImpl) (thx._Decimal.Decimal_Impl_.fromBigInt(((thx.bigint.BigIntImpl) (haxe.lang.Runtime.getField(((java.lang.Object) (this1) ), "num", true)) ))) ).divide(thx._Decimal.Decimal_Impl_.fromBigInt(((thx.bigint.BigIntImpl) (haxe.lang.Runtime.getField(((java.lang.Object) (this1) ), "den", true)) )));
	}
	
	
	public static java.lang.String toString(java.lang.Object this1)
	{
		//line 145 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		if (thx._BigInt.BigInt_Impl_.equals(((thx.bigint.BigIntImpl) (haxe.lang.Runtime.getField(((java.lang.Object) (this1) ), "den", true)) ), ((thx.bigint.BigIntImpl) (thx.bigint.Bigs.fromInt(1)) ))) 
		{
			//line 146 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
			return ( "" + ((thx.bigint.BigIntImpl) (haxe.lang.Runtime.getField(((java.lang.Object) (this1) ), "num", true)) ).toString() );
		}
		else
		{
			//line 148 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
			return ( ( ( "" + ((thx.bigint.BigIntImpl) (haxe.lang.Runtime.getField(((java.lang.Object) (this1) ), "num", true)) ).toString() ) + "/" ) + ((thx.bigint.BigIntImpl) (haxe.lang.Runtime.getField(((java.lang.Object) (this1) ), "den", true)) ).toString() );
		}
		
	}
	
	
	public static thx.bigint.BigIntImpl get_num(java.lang.Object this1)
	{
		//line 151 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		return ((thx.bigint.BigIntImpl) (haxe.lang.Runtime.getField(this1, "num", true)) );
	}
	
	
	public static thx.bigint.BigIntImpl get_den(java.lang.Object this1)
	{
		//line 152 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Rational.hx"
		return ((thx.bigint.BigIntImpl) (haxe.lang.Runtime.getField(this1, "den", true)) );
	}
	
	
}

