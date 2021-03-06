// Generated by Haxe 3.3.0
package thx._Decimal;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public final class Decimal_Impl_
{
	static
	{
		//line 8 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		thx._Decimal.Decimal_Impl_.zero = thx.bigint.DecimalImpl.zero;
		//line 9 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		thx._Decimal.Decimal_Impl_.one = thx.bigint.DecimalImpl.one;
	}
	
	
	
	public static thx.bigint.DecimalImpl zero;
	
	public static thx.bigint.DecimalImpl one;
	
	public static thx.bigint.DecimalImpl fromInt64(long value)
	{
		//line 12 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return new thx.bigint.DecimalImpl(thx.bigint.Bigs.fromInt64(value), 0);
	}
	
	
	public static thx.bigint.DecimalImpl fromBigInt(thx.bigint.BigIntImpl value)
	{
		//line 15 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return new thx.bigint.DecimalImpl(value, 0);
	}
	
	
	public static thx.bigint.DecimalImpl fromInt(int value)
	{
		//line 18 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return thx.bigint.Decimals.fromInt(value);
	}
	
	
	public static thx.bigint.DecimalImpl fromFloat(double value)
	{
		//line 21 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return thx.bigint.Decimals.fromFloat(value);
	}
	
	
	public static thx.bigint.DecimalImpl fromString(java.lang.String value)
	{
		//line 24 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return thx.bigint.Decimals.parse(value);
	}
	
	
	public static thx.bigint.DecimalImpl randomBetween(thx.bigint.DecimalImpl a, thx.bigint.DecimalImpl b)
	{
		//line 27 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return thx.bigint.DecimalImpl.randomBetween(a, b);
	}
	
	
	public static int compare(thx.bigint.DecimalImpl a, thx.bigint.DecimalImpl b)
	{
		//line 30 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return ((thx.bigint.DecimalImpl) (a) ).compareTo(b);
	}
	
	
	public static boolean isZero(thx.bigint.DecimalImpl this1)
	{
		//line 33 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return this1.isZero();
	}
	
	
	public static thx.bigint.DecimalImpl abs(thx.bigint.DecimalImpl this1)
	{
		//line 36 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return this1.abs();
	}
	
	
	public static int compareTo(thx.bigint.DecimalImpl this1, thx.bigint.DecimalImpl that)
	{
		//line 39 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return this1.compareTo(that);
	}
	
	
	public static int compareAbs(thx.bigint.DecimalImpl this1, thx.bigint.DecimalImpl that)
	{
		//line 42 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return this1.compareToAbs(that);
	}
	
	
	public static thx.bigint.DecimalImpl next(thx.bigint.DecimalImpl this1)
	{
		//line 45 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return this1.next();
	}
	
	
	public static thx.bigint.DecimalImpl prev(thx.bigint.DecimalImpl this1)
	{
		//line 48 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return this1.prev();
	}
	
	
	public static thx.bigint.DecimalImpl square(thx.bigint.DecimalImpl this1)
	{
		//line 51 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return this1.square();
	}
	
	
	public static thx.bigint.DecimalImpl pow(thx.bigint.DecimalImpl this1, int exp)
	{
		//line 54 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return this1.pow(exp);
	}
	
	
	public static boolean isEven(thx.bigint.DecimalImpl this1)
	{
		//line 57 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return this1.isEven();
	}
	
	
	public static boolean isOdd(thx.bigint.DecimalImpl this1)
	{
		//line 60 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return this1.isOdd();
	}
	
	
	public static boolean isNegative(thx.bigint.DecimalImpl this1)
	{
		//line 63 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return this1.isNegative();
	}
	
	
	public static boolean isPositive(thx.bigint.DecimalImpl this1)
	{
		//line 66 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return ( this1.compareTo(thx._Decimal.Decimal_Impl_.zero) > 0 );
	}
	
	
	public static thx.bigint.DecimalImpl max(thx.bigint.DecimalImpl this1, thx.bigint.DecimalImpl that)
	{
		//line 69 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		if (thx._Decimal.Decimal_Impl_.greater(this1, that)) 
		{
			//line 69 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
			return this1;
		}
		else
		{
			//line 69 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
			return that;
		}
		
	}
	
	
	public static thx.bigint.DecimalImpl min(thx.bigint.DecimalImpl this1, thx.bigint.DecimalImpl that)
	{
		//line 72 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		if (thx._Decimal.Decimal_Impl_.less(this1, that)) 
		{
			//line 72 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
			return this1;
		}
		else
		{
			//line 72 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
			return that;
		}
		
	}
	
	
	public static thx.bigint.DecimalImpl ceil(thx.bigint.DecimalImpl this1)
	{
		//line 75 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return this1.ceilTo(0);
	}
	
	
	public static thx.bigint.DecimalImpl ceilTo(thx.bigint.DecimalImpl this1, int decimals)
	{
		//line 78 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return this1.ceilTo(decimals);
	}
	
	
	public static thx.bigint.DecimalImpl floor(thx.bigint.DecimalImpl this1)
	{
		//line 81 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return this1.floorTo(0);
	}
	
	
	public static thx.bigint.DecimalImpl floorTo(thx.bigint.DecimalImpl this1, int decimals)
	{
		//line 84 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return this1.floorTo(decimals);
	}
	
	
	public static thx.bigint.DecimalImpl round(thx.bigint.DecimalImpl this1)
	{
		//line 87 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return this1.roundTo(0);
	}
	
	
	public static thx.bigint.DecimalImpl roundTo(thx.bigint.DecimalImpl this1, int decimals)
	{
		//line 90 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return this1.roundTo(decimals);
	}
	
	
	public static thx.bigint.DecimalImpl scaleTo(thx.bigint.DecimalImpl this1, int decimals)
	{
		//line 93 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return this1.scaleTo(decimals);
	}
	
	
	public static thx.bigint.DecimalImpl trim(thx.bigint.DecimalImpl this1, java.lang.Object mindecimals)
	{
		//line 96 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return this1.trim(mindecimals);
	}
	
	
	public static boolean greaterThan(thx.bigint.DecimalImpl this1, thx.bigint.DecimalImpl that)
	{
		//line 99 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return ( ((thx.bigint.DecimalImpl) (this1) ).compareTo(that) > 0 );
	}
	
	
	public static boolean greater(thx.bigint.DecimalImpl self, thx.bigint.DecimalImpl that)
	{
		//line 103 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return ( ((thx.bigint.DecimalImpl) (self) ).compareTo(that) > 0 );
	}
	
	
	public static boolean greaterEqualsTo(thx.bigint.DecimalImpl this1, thx.bigint.DecimalImpl that)
	{
		//line 106 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return ( ((thx.bigint.DecimalImpl) (this1) ).compareTo(that) >= 0 );
	}
	
	
	public static boolean greaterEquals(thx.bigint.DecimalImpl self, thx.bigint.DecimalImpl that)
	{
		//line 110 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return ( ((thx.bigint.DecimalImpl) (self) ).compareTo(that) >= 0 );
	}
	
	
	public static boolean lessThan(thx.bigint.DecimalImpl this1, thx.bigint.DecimalImpl that)
	{
		//line 113 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return ( ((thx.bigint.DecimalImpl) (this1) ).compareTo(that) < 0 );
	}
	
	
	public static boolean less(thx.bigint.DecimalImpl self, thx.bigint.DecimalImpl that)
	{
		//line 117 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return ( ((thx.bigint.DecimalImpl) (self) ).compareTo(that) < 0 );
	}
	
	
	public static boolean lessEqualsTo(thx.bigint.DecimalImpl this1, thx.bigint.DecimalImpl that)
	{
		//line 120 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return ( ((thx.bigint.DecimalImpl) (this1) ).compareTo(that) <= 0 );
	}
	
	
	public static boolean lessEquals(thx.bigint.DecimalImpl self, thx.bigint.DecimalImpl that)
	{
		//line 124 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return ( ((thx.bigint.DecimalImpl) (self) ).compareTo(that) <= 0 );
	}
	
	
	public static boolean equalsTo(thx.bigint.DecimalImpl this1, thx.bigint.DecimalImpl that)
	{
		//line 127 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return ( ((thx.bigint.DecimalImpl) (this1) ).compareTo(that) == 0 );
	}
	
	
	public static boolean equals(thx.bigint.DecimalImpl self, thx.bigint.DecimalImpl that)
	{
		//line 131 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return ( ((thx.bigint.DecimalImpl) (self) ).compareTo(that) == 0 );
	}
	
	
	public static boolean notEqualsTo(thx.bigint.DecimalImpl this1, thx.bigint.DecimalImpl that)
	{
		//line 134 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return ( ((thx.bigint.DecimalImpl) (this1) ).compareTo(that) != 0 );
	}
	
	
	public static boolean notEquals(thx.bigint.DecimalImpl self, thx.bigint.DecimalImpl that)
	{
		//line 138 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return ( ((thx.bigint.DecimalImpl) (self) ).compareTo(that) != 0 );
	}
	
	
	public static thx.bigint.DecimalImpl add(thx.bigint.DecimalImpl this1, thx.bigint.DecimalImpl that)
	{
		//line 142 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return this1.add(that);
	}
	
	
	public static thx.bigint.DecimalImpl subtract(thx.bigint.DecimalImpl this1, thx.bigint.DecimalImpl that)
	{
		//line 146 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return this1.subtract(that);
	}
	
	
	public static thx.bigint.DecimalImpl negate(thx.bigint.DecimalImpl this1)
	{
		//line 150 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return this1.negate();
	}
	
	
	public static thx.bigint.DecimalImpl preIncrement(thx.bigint.DecimalImpl this1)
	{
		//line 154 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		this1 = ((thx.bigint.DecimalImpl) (((thx.bigint.DecimalImpl) (this1) ).add(thx._Decimal.Decimal_Impl_.one)) );
		//line 154 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return this1;
	}
	
	
	public static thx.bigint.DecimalImpl postIncrement(thx.bigint.DecimalImpl this1)
	{
		//line 158 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		thx.bigint.DecimalImpl v = this1;
		//line 159 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		this1 = ((thx.bigint.DecimalImpl) (((thx.bigint.DecimalImpl) (this1) ).add(thx._Decimal.Decimal_Impl_.one)) );
		//line 160 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return v;
	}
	
	
	public static thx.bigint.DecimalImpl preDecrement(thx.bigint.DecimalImpl this1)
	{
		//line 165 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		this1 = ((thx.bigint.DecimalImpl) (((thx.bigint.DecimalImpl) (this1) ).subtract(thx._Decimal.Decimal_Impl_.one)) );
		//line 165 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return this1;
	}
	
	
	public static thx.bigint.DecimalImpl postDecrement(thx.bigint.DecimalImpl this1)
	{
		//line 169 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		thx.bigint.DecimalImpl v = this1;
		//line 170 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		this1 = ((thx.bigint.DecimalImpl) (((thx.bigint.DecimalImpl) (this1) ).subtract(thx._Decimal.Decimal_Impl_.one)) );
		//line 171 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return v;
	}
	
	
	public static thx.bigint.DecimalImpl multiply(thx.bigint.DecimalImpl this1, thx.bigint.DecimalImpl that)
	{
		//line 176 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return this1.multiply(that);
	}
	
	
	public static thx.bigint.DecimalImpl divide(thx.bigint.DecimalImpl this1, thx.bigint.DecimalImpl that)
	{
		//line 180 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return this1.divide(that);
	}
	
	
	public static thx.bigint.DecimalImpl modulo(thx.bigint.DecimalImpl this1, thx.bigint.DecimalImpl that)
	{
		//line 184 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return this1.modulo(that);
	}
	
	
	public static int toInt(thx.bigint.DecimalImpl this1)
	{
		//line 187 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return this1.toInt();
	}
	
	
	public static long toInt64(thx.bigint.DecimalImpl this1)
	{
		//line 190 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return thx.bigint.Bigs.toInt64(((thx.bigint.BigIntImpl) (thx._Decimal.Decimal_Impl_.toBigInt(this1)) ));
	}
	
	
	public static thx.bigint.BigIntImpl toBigInt(thx.bigint.DecimalImpl this1)
	{
		//line 193 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return this1.value.divide(thx.bigint.Small.ten.pow(thx.bigint.Bigs.fromInt(this1.scale)));
	}
	
	
	public static double toFloat(thx.bigint.DecimalImpl this1)
	{
		//line 196 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return this1.toFloat();
	}
	
	
	public static java.lang.String toString(thx.bigint.DecimalImpl this1)
	{
		//line 199 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return this1.toString();
	}
	
	
	public static int get_divisionScale()
	{
		//line 202 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return thx.bigint.Decimals.divisionExtraScale;
	}
	
	
	public static int set_divisionScale(int v)
	{
		//line 205 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Decimal.hx"
		return thx.bigint.Decimals.divisionExtraScale = v;
	}
	
	
}


