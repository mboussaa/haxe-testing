// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Ints extends haxe.lang.HxObject
{
	static
	{
		//line 13 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		thx.Ints.pattern_parse = new haxe.root.EReg("^[ \t\r\n]*[+-]?(\\d+|0x[0-9A-F]+)", "i");
		//line 204 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		thx.Ints.BASE = "0123456789abcdefghijklmnopqrstuvwxyz";
		//line 267 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		thx.Ints.order = ((haxe.lang.Function) (( (( thx.Ints_Anon_268__Fun.__hx_current != null )) ? (thx.Ints_Anon_268__Fun.__hx_current) : (thx.Ints_Anon_268__Fun.__hx_current = ((thx.Ints_Anon_268__Fun) (new thx.Ints_Anon_268__Fun()) )) )) );
		//line 271 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		java.lang.Object __temp_stmt2 = null;
		//line 271 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		{
			//line 271 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			haxe.lang.Function __temp_odecl1 = ( (( thx.Ints_Anon_271__Fun.__hx_current != null )) ? (thx.Ints_Anon_271__Fun.__hx_current) : (thx.Ints_Anon_271__Fun.__hx_current = ((thx.Ints_Anon_271__Fun) (new thx.Ints_Anon_271__Fun()) )) );
			//line 271 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			__temp_stmt2 = new haxe.lang.DynamicObject(new java.lang.String[]{"append"}, new java.lang.Object[]{__temp_odecl1}, new java.lang.String[]{"zero"}, new double[]{((double) (((double) (0) )) )});
		}
		
		//line 270 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		thx.Ints.monoid = ((java.lang.Object) (__temp_stmt2) );
	}
	
	public Ints(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Ints()
	{
		//line 12 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		thx.Ints.__hx_ctor_thx_Ints(this);
	}
	
	
	public static void __hx_ctor_thx_Ints(thx.Ints __temp_me93)
	{
	}
	
	
	public static haxe.root.EReg pattern_parse;
	
	public static int abs(int v)
	{
		//line 18 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		if (( v < 0 )) 
		{
			//line 18 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			return  - (v) ;
		}
		else
		{
			//line 18 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			return v;
		}
		
	}
	
	
	public static boolean canParse(java.lang.String s)
	{
		//line 25 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		return thx.Ints.pattern_parse.match(s);
	}
	
	
	public static int clamp(int v, int min, int max)
	{
		//line 31 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		if (( v < min )) 
		{
			//line 31 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			return min;
		}
		else
		{
			//line 31 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			if (( v > max )) 
			{
				//line 31 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
				return max;
			}
			else
			{
				//line 31 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
				return v;
			}
			
		}
		
	}
	
	
	public static int clampSym(int v, int max)
	{
		//line 38 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		int min =  - (max) ;
		//line 38 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		if (( v < min )) 
		{
			//line 38 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			return min;
		}
		else
		{
			//line 38 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			if (( v > max )) 
			{
				//line 38 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
				return max;
			}
			else
			{
				//line 38 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
				return v;
			}
			
		}
		
	}
	
	
	public static int compare(int a, int b)
	{
		//line 46 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		return ( a - b );
	}
	
	
	public static int gcd(int m, int n)
	{
		//line 52 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		if (( m < 0 )) 
		{
			//line 52 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			m =  - (m) ;
		}
		else
		{
			//line 52 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			m = m;
		}
		
		//line 53 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		if (( n < 0 )) 
		{
			//line 53 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			n =  - (n) ;
		}
		else
		{
			//line 53 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			n = n;
		}
		
		//line 54 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		if (( n == 0 )) 
		{
			//line 54 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			return m;
		}
		
		//line 55 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		return thx.Ints.gcd(n, ( m % n ));
	}
	
	
	public static int interpolate(double f, double a, double b)
	{
		//line 64 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		return ((int) (java.lang.Math.round(( a + ( (( b - a )) * f ) ))) );
	}
	
	
	public static boolean isEven(int v)
	{
		//line 70 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		return ( ( v % 2 ) == 0 );
	}
	
	
	public static boolean isOdd(int v)
	{
		//line 76 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		return ( ( v % 2 ) != 0 );
	}
	
	
	public static java.lang.String lpad(int v, java.lang.String pad, int len)
	{
		//line 78 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		if (( pad == null )) 
		{
			//line 78 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			pad = "0";
		}
		
		//line 79 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		boolean neg = false;
		//line 80 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		if (( v < 0 )) 
		{
			//line 81 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			neg = true;
			//line 82 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			v =  - (v) ;
		}
		
		//line 84 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		return ( (( (neg) ? ("-") : ("") )) + haxe.root.StringTools.lpad(( "" + v ), pad, len) );
	}
	
	
	public static int lcm(int m, int n)
	{
		//line 91 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		if (( m < 0 )) 
		{
			//line 91 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			m =  - (m) ;
		}
		else
		{
			//line 91 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			m = m;
		}
		
		//line 92 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		if (( n < 0 )) 
		{
			//line 92 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			n =  - (n) ;
		}
		else
		{
			//line 92 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			n = n;
		}
		
		//line 93 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		if (( n == 0 )) 
		{
			//line 93 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			return m;
		}
		
		//line 94 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		return ( m * (((int) (( n / thx.Ints.gcd(m, n) )) )) );
	}
	
	
	public static java.lang.String rpad(int v, java.lang.String pad, int len)
	{
		//line 98 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		if (( pad == null )) 
		{
			//line 98 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			pad = "0";
		}
		
		//line 98 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		return haxe.root.StringTools.rpad(( "" + v ), pad, len);
	}
	
	
	public static int max(int a, int b)
	{
		//line 104 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		if (( a > b )) 
		{
			//line 104 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			return a;
		}
		else
		{
			//line 104 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			return b;
		}
		
	}
	
	
	public static int min(int a, int b)
	{
		//line 110 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		if (( a < b )) 
		{
			//line 110 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			return a;
		}
		else
		{
			//line 110 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			return b;
		}
		
	}
	
	
	public static java.lang.Object parse(java.lang.String s, java.lang.Object base)
	{
		//line 132 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		if (( ( ! (haxe.lang.Runtime.eq(base, null)) ) && (( ( haxe.lang.Runtime.compare(base, 2) < 0 ) || ( haxe.lang.Runtime.compare(base, thx.Ints.BASE.length()) > 0 ) )) )) 
		{
			//line 133 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			throw haxe.lang.HaxeException.wrap(( ( ( haxe.lang.Runtime.toString("invalid base ") + haxe.lang.Runtime.toString(base) ) + ", it must be between 2 and " ) + thx.Ints.BASE.length() ));
		}
		
		//line 135 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		s = s.trim().toLowerCase();
		//line 137 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		int sign = 0;
		//line 137 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		if (s.startsWith("+")) 
		{
			//line 138 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			s = haxe.lang.StringExt.substring(s, 1, null);
			//line 137 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			sign = 1;
		}
		else
		{
			//line 140 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			if (s.startsWith("-")) 
			{
				//line 141 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
				s = haxe.lang.StringExt.substring(s, 1, null);
				//line 137 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
				sign = -1;
			}
			else
			{
				//line 137 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
				sign = 1;
			}
			
		}
		
		//line 147 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		if (( s.length() == 0 )) 
		{
			//line 148 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			return null;
		}
		
		//line 150 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		if (s.startsWith("0x")) 
		{
			//line 151 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			if (( ( ! (( null == base )) ) && ( ! (haxe.lang.Runtime.eq(16, base)) ) )) 
			{
				//line 152 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
				return null;
			}
			
			//line 153 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			base = 16;
			//line 154 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			s = haxe.lang.StringExt.substring(s, 2, null);
		}
		else
		{
			//line 155 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			if (( null == base )) 
			{
				//line 156 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
				base = 10;
			}
			
		}
		
		//line 159 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		int[] acc = new int[]{0};
		//line 160 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		try 
		{
			//line 160 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			thx.Strings.map(haxe.lang.Runtime.toString(s), ((haxe.lang.Function) (new thx.Ints_parse_160__Fun(base, acc)) ));
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 160 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 164 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 164 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 164 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 164 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			{
				//line 164 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
				java.lang.Object e = __temp_catchall2;
			}
			
		}
		
		
		//line 165 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		return ( acc[0] * sign );
	}
	
	
	public static int random(java.lang.Object min, int max)
	{
		//line 178 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		int __temp_min90 = ( (haxe.lang.Runtime.eq(min, null)) ? (0) : (((int) (haxe.lang.Runtime.toInt(min)) )) );
		//line 178 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		return ( haxe.root.Std.random(( max + 1 )) + __temp_min90 );
	}
	
	
	public static haxe.root.Array<java.lang.Object> range(int start, java.lang.Object stop, java.lang.Object step)
	{
		//line 185 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		int __temp_step91 = ( (haxe.lang.Runtime.eq(step, null)) ? (1) : (((int) (haxe.lang.Runtime.toInt(step)) )) );
		//line 186 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		if (( null == stop )) 
		{
			//line 187 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			stop = start;
			//line 188 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			start = 0;
		}
		
		//line 190 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		if (( ( ((double) ((( ((int) (haxe.lang.Runtime.toInt(stop)) ) - ((int) (start) ) ))) ) / __temp_step91 ) == java.lang.Double.POSITIVE_INFINITY )) 
		{
			//line 190 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			throw haxe.lang.HaxeException.wrap("infinite range");
		}
		
		//line 191 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		haxe.root.Array<java.lang.Object> range = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{});
		//line 191 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		int i = -1;
		//line 191 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		int j = 0;
		//line 192 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		if (( __temp_step91 < 0 )) 
		{
			//line 193 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			while (true)
			{
				//line 193 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
				j = ( start + ( __temp_step91 *  ++ i ) );
				//line 193 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
				if ( ! ((( haxe.lang.Runtime.compare(j, stop) > 0 ))) ) 
				{
					//line 193 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
					break;
				}
				
				//line 193 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
				range.push(j);
			}
			
		}
		else
		{
			//line 195 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			while (true)
			{
				//line 195 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
				j = ( start + ( __temp_step91 *  ++ i ) );
				//line 195 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
				if ( ! ((( haxe.lang.Runtime.compare(j, stop) < 0 ))) ) 
				{
					//line 195 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
					break;
				}
				
				//line 195 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
				range.push(j);
			}
			
		}
		
		//line 196 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		return range;
	}
	
	
	public static java.lang.Object rangeIter(int start, java.lang.Object stop, java.lang.Object step)
	{
		//line 200 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		int __temp_step92 = ( (haxe.lang.Runtime.eq(step, null)) ? (1) : (((int) (haxe.lang.Runtime.toInt(step)) )) );
		//line 200 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		return new thx.RangeIterator(start, stop, __temp_step92);
	}
	
	
	public static java.lang.String BASE;
	
	public static java.lang.String toString(int value, int base)
	{
		//line 215 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		if (( ( base < 2 ) || ( base > thx.Ints.BASE.length() ) )) 
		{
			//line 216 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			throw haxe.lang.HaxeException.wrap(( ( ( "invalid base " + base ) + ", it must be between 2 and " ) + thx.Ints.BASE.length() ));
		}
		
		//line 217 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		if (( ( base == 10 ) || ( value == 0 ) )) 
		{
			//line 218 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			return ( "" + value );
		}
		
		//line 220 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		java.lang.String buf = "";
		//line 220 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		int abs = ( (( value < 0 )) ? ( - (value) ) : (value) );
		//line 222 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		while (( abs > 0 ))
		{
			//line 223 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			buf = ( haxe.lang.StringExt.charAt(thx.Ints.BASE, ( abs % base )) + buf );
			//line 224 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			abs = ((int) (( abs / base )) );
		}
		
		//line 227 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		return ( (( (( value < 0 )) ? ("-") : ("") )) + buf );
	}
	
	
	public static java.lang.String toBase(int value, int base)
	{
		//line 237 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		return thx.Ints.toString(value, base);
	}
	
	
	public static boolean toBool(int v)
	{
		//line 243 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		return ( v != 0 );
	}
	
	
	public static int toInt(java.lang.String s, java.lang.Object base)
	{
		//line 249 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		return ((int) (haxe.lang.Runtime.toInt(thx.Ints.parse(s, base))) );
	}
	
	
	public static int sign(int value)
	{
		//line 255 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		if (( value < 0 )) 
		{
			//line 255 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			return -1;
		}
		else
		{
			//line 255 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			return 1;
		}
		
	}
	
	
	public static int wrapCircular(int v, int max)
	{
		//line 261 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		v %= max;
		//line 262 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		if (( v < 0 )) 
		{
			//line 263 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
			v += max;
		}
		
		//line 264 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		return v;
	}
	
	
	public static haxe.lang.Function order;
	
	public static java.lang.Object monoid;
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 12 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		return new thx.Ints(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 12 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Ints.hx"
		return new thx.Ints();
	}
	
	
}


