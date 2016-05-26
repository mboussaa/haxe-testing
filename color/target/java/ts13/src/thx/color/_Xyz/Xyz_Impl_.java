// Generated by Haxe 3.3.0
package thx.color._Xyz;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public final class Xyz_Impl_
{
	static
	{
		//line 35 "/shared/color/src/thx/color/Xyz.hx"
		java.lang.Object __temp_stmt3 = null;
		//line 35 "/shared/color/src/thx/color/Xyz.hx"
		{
			//line 35 "/shared/color/src/thx/color/Xyz.hx"
			haxe.root.Array<java.lang.Object> this1 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (0.95047) ), ((java.lang.Object) (1) ), ((java.lang.Object) (1.08883) )});
			//line 35 "/shared/color/src/thx/color/Xyz.hx"
			__temp_stmt3 = ((haxe.root.Array<java.lang.Object>) (this1) );
		}
		
		//line 35 "/shared/color/src/thx/color/Xyz.hx"
		thx.color._Xyz.Xyz_Impl_.whiteReference = ((haxe.root.Array<java.lang.Object>) (__temp_stmt3) );
		//line 36 "/shared/color/src/thx/color/Xyz.hx"
		thx.color._Xyz.Xyz_Impl_.epsilon = 0.0088564516790356311;
		//line 37 "/shared/color/src/thx/color/Xyz.hx"
		thx.color._Xyz.Xyz_Impl_.kappa = 903.296296296296305;
	}
	
	public static haxe.root.Array<java.lang.Object> whiteReference;
	
	public static double epsilon;
	
	public static double kappa;
	
	
	
	
	
	
	
	
	
	
	
	public static haxe.root.Array<java.lang.Object> create(double x, double y, double z)
	{
		//line 47 "/shared/color/src/thx/color/Xyz.hx"
		haxe.root.Array<java.lang.Object> this1 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (x) ), ((java.lang.Object) (y) ), ((java.lang.Object) (z) )});
		//line 47 "/shared/color/src/thx/color/Xyz.hx"
		return ((haxe.root.Array<java.lang.Object>) (this1) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> fromFloats(haxe.root.Array<java.lang.Object> arr)
	{
		//line 50 "/shared/color/src/thx/color/Xyz.hx"
		thx.ArrayFloats.resize(arr, 3, null);
		//line 51 "/shared/color/src/thx/color/Xyz.hx"
		haxe.root.Array<java.lang.Object> this1 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (((double) (haxe.lang.Runtime.toDouble(arr.__get(0))) )) ), ((java.lang.Object) (((double) (haxe.lang.Runtime.toDouble(arr.__get(1))) )) ), ((java.lang.Object) (((double) (haxe.lang.Runtime.toDouble(arr.__get(2))) )) )});
		//line 51 "/shared/color/src/thx/color/Xyz.hx"
		return ((haxe.root.Array<java.lang.Object>) (this1) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> fromString(java.lang.String color)
	{
		//line 55 "/shared/color/src/thx/color/Xyz.hx"
		thx.color.parse.ColorInfo info = thx.color.parse.ColorParser.parseColor(color);
		//line 56 "/shared/color/src/thx/color/Xyz.hx"
		if (( null == info )) 
		{
			//line 57 "/shared/color/src/thx/color/Xyz.hx"
			return null;
		}
		
		//line 59 "/shared/color/src/thx/color/Xyz.hx"
		try 
		{
			//line 59 "/shared/color/src/thx/color/Xyz.hx"
			java.lang.String _g = info.name;
			//line 59 "/shared/color/src/thx/color/Xyz.hx"
			{
				//line 59 "/shared/color/src/thx/color/Xyz.hx"
				java.lang.String __temp_svar3 = (_g);
				//line 59 "/shared/color/src/thx/color/Xyz.hx"
				int __temp_hash5 = __temp_svar3.hashCode();
				//line 59 "/shared/color/src/thx/color/Xyz.hx"
				boolean __temp_executeDef4 = true;
				//line 59 "/shared/color/src/thx/color/Xyz.hx"
				switch (__temp_hash5)
				{
					case 119193:
					case -1360583558:
					{
						//line 59 "/shared/color/src/thx/color/Xyz.hx"
						if (( (( ( __temp_hash5 == 119193 ) && __temp_svar3.equals("xyz") )) || __temp_svar3.equals("ciexyz") )) 
						{
							//line 59 "/shared/color/src/thx/color/Xyz.hx"
							__temp_executeDef4 = false;
							//line 59 "/shared/color/src/thx/color/Xyz.hx"
							return ((haxe.root.Array<java.lang.Object>) (thx.color.parse.ColorParser.getFloatChannels(info.channels, 3, false)) );
						}
						
						//line 59 "/shared/color/src/thx/color/Xyz.hx"
						break;
					}
					
					
				}
				
				//line 59 "/shared/color/src/thx/color/Xyz.hx"
				if (__temp_executeDef4) 
				{
					//line 59 "/shared/color/src/thx/color/Xyz.hx"
					return null;
				}
				else
				{
					//line 59 "/shared/color/src/thx/color/Xyz.hx"
					throw null;
				}
				
			}
			
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 59 "/shared/color/src/thx/color/Xyz.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 59 "/shared/color/src/thx/color/Xyz.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 59 "/shared/color/src/thx/color/Xyz.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 59 "/shared/color/src/thx/color/Xyz.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 59 "/shared/color/src/thx/color/Xyz.hx"
			{
				//line 59 "/shared/color/src/thx/color/Xyz.hx"
				java.lang.Object e = __temp_catchall2;
				//line 59 "/shared/color/src/thx/color/Xyz.hx"
				return null;
			}
			
		}
		
		
	}
	
	
	public static haxe.root.Array<java.lang.Object> _new(haxe.root.Array<java.lang.Object> channels)
	{
		//line 67 "/shared/color/src/thx/color/Xyz.hx"
		return ((haxe.root.Array<java.lang.Object>) (channels) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> interpolate(haxe.root.Array<java.lang.Object> this1, haxe.root.Array<java.lang.Object> other, double t)
	{
		//line 71 "/shared/color/src/thx/color/Xyz.hx"
		return ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (thx.Floats.interpolate(t, ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) ), ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(0))) ))) ), ((java.lang.Object) (thx.Floats.interpolate(t, ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) ), ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(1))) ))) ), ((java.lang.Object) (thx.Floats.interpolate(t, ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) ), ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(2))) ))) )})) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> min(haxe.root.Array<java.lang.Object> this1, haxe.root.Array<java.lang.Object> other)
	{
		//line 78 "/shared/color/src/thx/color/Xyz.hx"
		haxe.root.Array<java.lang.Object> this2 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (java.lang.Math.min(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) ), ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(0))) ))) ), ((java.lang.Object) (java.lang.Math.min(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) ), ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(1))) ))) ), ((java.lang.Object) (java.lang.Math.min(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) ), ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(2))) ))) )});
		//line 78 "/shared/color/src/thx/color/Xyz.hx"
		return ((haxe.root.Array<java.lang.Object>) (this2) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> max(haxe.root.Array<java.lang.Object> this1, haxe.root.Array<java.lang.Object> other)
	{
		//line 81 "/shared/color/src/thx/color/Xyz.hx"
		haxe.root.Array<java.lang.Object> this2 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (java.lang.Math.max(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) ), ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(0))) ))) ), ((java.lang.Object) (java.lang.Math.max(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) ), ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(1))) ))) ), ((java.lang.Object) (java.lang.Math.max(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) ), ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(2))) ))) )});
		//line 81 "/shared/color/src/thx/color/Xyz.hx"
		return ((haxe.root.Array<java.lang.Object>) (this2) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> roundTo(haxe.root.Array<java.lang.Object> this1, int decimals)
	{
		//line 84 "/shared/color/src/thx/color/Xyz.hx"
		haxe.root.Array<java.lang.Object> this2 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (thx.Floats.roundTo(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) ), decimals)) ), ((java.lang.Object) (thx.Floats.roundTo(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) ), decimals)) ), ((java.lang.Object) (thx.Floats.roundTo(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) ), decimals)) )});
		//line 84 "/shared/color/src/thx/color/Xyz.hx"
		return ((haxe.root.Array<java.lang.Object>) (this2) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> withX(haxe.root.Array<java.lang.Object> this1, double newx)
	{
		//line 87 "/shared/color/src/thx/color/Xyz.hx"
		haxe.root.Array<java.lang.Object> this2 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (newx) ), ((java.lang.Object) (((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) )) ), ((java.lang.Object) (((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) )) )});
		//line 87 "/shared/color/src/thx/color/Xyz.hx"
		return ((haxe.root.Array<java.lang.Object>) (this2) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> withY(haxe.root.Array<java.lang.Object> this1, double newy)
	{
		//line 90 "/shared/color/src/thx/color/Xyz.hx"
		haxe.root.Array<java.lang.Object> this2 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) )) ), ((java.lang.Object) (newy) ), ((java.lang.Object) (((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) )) )});
		//line 90 "/shared/color/src/thx/color/Xyz.hx"
		return ((haxe.root.Array<java.lang.Object>) (this2) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> withZ(haxe.root.Array<java.lang.Object> this1, double newz)
	{
		//line 93 "/shared/color/src/thx/color/Xyz.hx"
		haxe.root.Array<java.lang.Object> this2 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) )) ), ((java.lang.Object) (((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) )) ), ((java.lang.Object) (newz) )});
		//line 93 "/shared/color/src/thx/color/Xyz.hx"
		return ((haxe.root.Array<java.lang.Object>) (this2) );
	}
	
	
	public static java.lang.String toString(haxe.root.Array<java.lang.Object> this1)
	{
		//line 96 "/shared/color/src/thx/color/Xyz.hx"
		return ( ( ( ( ( ( "xyz(" + haxe.lang.Runtime.toString(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) )) ) + "," ) + haxe.lang.Runtime.toString(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) )) ) + "," ) + haxe.lang.Runtime.toString(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) )) ) + ")" );
	}
	
	
	public static boolean equals(haxe.root.Array<java.lang.Object> this1, haxe.root.Array<java.lang.Object> other)
	{
		//line 99 "/shared/color/src/thx/color/Xyz.hx"
		return thx.color._Xyz.Xyz_Impl_.nearEquals(this1, other, null);
	}
	
	
	public static boolean nearEquals(haxe.root.Array<java.lang.Object> this1, haxe.root.Array<java.lang.Object> other, java.lang.Object tolerance)
	{
		//line 102 "/shared/color/src/thx/color/Xyz.hx"
		java.lang.Object __temp_tolerance147 = ( (haxe.lang.Runtime.eq(tolerance, null)) ? (((java.lang.Object) (1e-9) )) : (tolerance) );
		//line 102 "/shared/color/src/thx/color/Xyz.hx"
		if (( thx.Floats.nearEquals(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) ), ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(0))) ), __temp_tolerance147) && thx.Floats.nearEquals(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) ), ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(1))) ), __temp_tolerance147) )) 
		{
			//line 102 "/shared/color/src/thx/color/Xyz.hx"
			return thx.Floats.nearEquals(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) ), ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(2))) ), __temp_tolerance147);
		}
		else
		{
			//line 102 "/shared/color/src/thx/color/Xyz.hx"
			return false;
		}
		
	}
	
	
	public static haxe.root.Array<java.lang.Object> toLab(haxe.root.Array<java.lang.Object> this1)
	{
		//line 105 "/shared/color/src/thx/color/Xyz.hx"
		haxe.lang.Function f = ( (( thx.color._Xyz.Xyz_Impl__toLab_105__Fun.__hx_current != null )) ? (thx.color._Xyz.Xyz_Impl__toLab_105__Fun.__hx_current) : (thx.color._Xyz.Xyz_Impl__toLab_105__Fun.__hx_current = ((thx.color._Xyz.Xyz_Impl__toLab_105__Fun) (new thx.color._Xyz.Xyz_Impl__toLab_105__Fun()) )) );
		//line 112 "/shared/color/src/thx/color/Xyz.hx"
		double x1 = ( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) ) / ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (thx.color._Xyz.Xyz_Impl_.whiteReference) ).__get(0))) ) );
		//line 112 "/shared/color/src/thx/color/Xyz.hx"
		double y1 = ( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) ) / ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (thx.color._Xyz.Xyz_Impl_.whiteReference) ).__get(1))) ) );
		//line 112 "/shared/color/src/thx/color/Xyz.hx"
		double z1 = ( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) ) / ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (thx.color._Xyz.Xyz_Impl_.whiteReference) ).__get(2))) ) );
		//line 112 "/shared/color/src/thx/color/Xyz.hx"
		double fy1 = ((double) (f.__hx_invoke1_f(y1, haxe.lang.Runtime.undefined)) );
		//line 112 "/shared/color/src/thx/color/Xyz.hx"
		double l = ( ( 116 * fy1 ) - 16 );
		//line 112 "/shared/color/src/thx/color/Xyz.hx"
		double a = ( 500 * (( ((double) (f.__hx_invoke1_f(x1, haxe.lang.Runtime.undefined)) ) - fy1 )) );
		//line 112 "/shared/color/src/thx/color/Xyz.hx"
		double b = ( 200 * (( fy1 - ((double) (f.__hx_invoke1_f(z1, haxe.lang.Runtime.undefined)) ) )) );
		//line 119 "/shared/color/src/thx/color/Xyz.hx"
		haxe.root.Array<java.lang.Object> this2 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (l) ), ((java.lang.Object) (a) ), ((java.lang.Object) (b) )});
		//line 119 "/shared/color/src/thx/color/Xyz.hx"
		return ((haxe.root.Array<java.lang.Object>) (this2) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> toLCh(haxe.root.Array<java.lang.Object> this1)
	{
		//line 123 "/shared/color/src/thx/color/Xyz.hx"
		return thx.color._Lab.Lab_Impl_.toLCh(thx.color._Xyz.Xyz_Impl_.toLab(this1));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toLuv(haxe.root.Array<java.lang.Object> this1)
	{
		//line 126 "/shared/color/src/thx/color/Xyz.hx"
		double y = ( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) ) * 100 );
		//line 126 "/shared/color/src/thx/color/Xyz.hx"
		double f = ( y / (( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (thx.color._Xyz.Xyz_Impl_.whiteReference) ).__get(1))) ) * 100 )) );
		//line 126 "/shared/color/src/thx/color/Xyz.hx"
		double r = java.lang.Math.pow(0.206896551724137928, ((double) (3) ));
		//line 126 "/shared/color/src/thx/color/Xyz.hx"
		double l = ( (( f > r )) ? (( ( 116 * java.lang.Math.pow(f, 0.333333333333333315) ) - 16 )) : (( java.lang.Math.pow(9.66666666666666607, ((double) (3) )) * f )) );
		//line 126 "/shared/color/src/thx/color/Xyz.hx"
		double u = ( ( 13 * l ) * (( thx.color._Xyz.Xyz_Impl_.get_u(this1) - ( thx.color._Xyz.Xyz_Impl_.get_u(thx.color._Xyz.Xyz_Impl_.whiteReference) * 100 ) )) );
		//line 126 "/shared/color/src/thx/color/Xyz.hx"
		double v = ( ( 13 * l ) * (( thx.color._Xyz.Xyz_Impl_.get_v(this1) - ( thx.color._Xyz.Xyz_Impl_.get_v(thx.color._Xyz.Xyz_Impl_.whiteReference) * 100 ) )) );
		//line 136 "/shared/color/src/thx/color/Xyz.hx"
		haxe.root.Array<java.lang.Object> this2 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (( l / 100 )) ), ((java.lang.Object) (( u / 100 )) ), ((java.lang.Object) (( v / 100 )) )});
		//line 136 "/shared/color/src/thx/color/Xyz.hx"
		return ((haxe.root.Array<java.lang.Object>) (this2) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> toCmy(haxe.root.Array<java.lang.Object> this1)
	{
		//line 140 "/shared/color/src/thx/color/Xyz.hx"
		return thx.color._Rgbx.Rgbx_Impl_.toCmy(thx.color._Xyz.Xyz_Impl_.toRgbx(this1));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toCmyk(haxe.root.Array<java.lang.Object> this1)
	{
		//line 143 "/shared/color/src/thx/color/Xyz.hx"
		return thx.color._Rgbx.Rgbx_Impl_.toCmyk(thx.color._Xyz.Xyz_Impl_.toRgbx(this1));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toCubeHelix(haxe.root.Array<java.lang.Object> this1)
	{
		//line 146 "/shared/color/src/thx/color/Xyz.hx"
		return thx.color._Rgbx.Rgbx_Impl_.toCubeHelixWithGamma(((haxe.root.Array<java.lang.Object>) (thx.color._Xyz.Xyz_Impl_.toRgbx(this1)) ), ((double) (1) ));
	}
	
	
	public static double toGrey(haxe.root.Array<java.lang.Object> this1)
	{
		//line 149 "/shared/color/src/thx/color/Xyz.hx"
		return thx.color._Rgbx.Rgbx_Impl_.toGrey(thx.color._Xyz.Xyz_Impl_.toRgbx(this1));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toHsl(haxe.root.Array<java.lang.Object> this1)
	{
		//line 152 "/shared/color/src/thx/color/Xyz.hx"
		return thx.color._Rgbx.Rgbx_Impl_.toHsl(thx.color._Xyz.Xyz_Impl_.toRgbx(this1));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toHsv(haxe.root.Array<java.lang.Object> this1)
	{
		//line 155 "/shared/color/src/thx/color/Xyz.hx"
		return thx.color._Rgbx.Rgbx_Impl_.toHsv(thx.color._Xyz.Xyz_Impl_.toRgbx(this1));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toHunterLab(haxe.root.Array<java.lang.Object> this1)
	{
		//line 158 "/shared/color/src/thx/color/Xyz.hx"
		double l = ( 10.0 * java.lang.Math.sqrt(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) )) );
		//line 158 "/shared/color/src/thx/color/Xyz.hx"
		double a = ( (( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) ) != 0 )) ? (( 17.5 * (( (( ( 1.02 * ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) ) ) - ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) ) )) / java.lang.Math.sqrt(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) )) )) )) : (((double) (0) )) );
		//line 158 "/shared/color/src/thx/color/Xyz.hx"
		double b = ( (( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) ) != 0 )) ? (( 7.0 * (( (( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) ) - ( .847 * ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) ) ) )) / java.lang.Math.sqrt(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) )) )) )) : (((double) (0) )) );
		//line 161 "/shared/color/src/thx/color/Xyz.hx"
		haxe.root.Array<java.lang.Object> this2 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (l) ), ((java.lang.Object) (a) ), ((java.lang.Object) (b) )});
		//line 161 "/shared/color/src/thx/color/Xyz.hx"
		return ((haxe.root.Array<java.lang.Object>) (this2) );
	}
	
	
	public static int toRgb(haxe.root.Array<java.lang.Object> this1)
	{
		//line 165 "/shared/color/src/thx/color/Xyz.hx"
		return thx.color._Rgbx.Rgbx_Impl_.toRgb(thx.color._Xyz.Xyz_Impl_.toRgbx(this1));
	}
	
	
	public static int toRgba(haxe.root.Array<java.lang.Object> this1)
	{
		//line 168 "/shared/color/src/thx/color/Xyz.hx"
		return thx.color._Rgbxa.Rgbxa_Impl_.toRgba(thx.color._Xyz.Xyz_Impl_.toRgbxa(this1));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toRgbx(haxe.root.Array<java.lang.Object> this1)
	{
		//line 171 "/shared/color/src/thx/color/Xyz.hx"
		double x = ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) );
		//line 171 "/shared/color/src/thx/color/Xyz.hx"
		double y = ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) );
		//line 171 "/shared/color/src/thx/color/Xyz.hx"
		double z = ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) );
		//line 171 "/shared/color/src/thx/color/Xyz.hx"
		double r = ( ( ( x * 3.2406 ) + ( y * -1.5372 ) ) + ( z * -0.4986 ) );
		//line 171 "/shared/color/src/thx/color/Xyz.hx"
		double g = ( ( ( x * -0.9689 ) + ( y * 1.8758 ) ) + ( z * 0.0415 ) );
		//line 171 "/shared/color/src/thx/color/Xyz.hx"
		double b = ( ( ( x * 0.0557 ) + ( y * -0.204 ) ) + ( z * 1.0570 ) );
		//line 178 "/shared/color/src/thx/color/Xyz.hx"
		if (( r > 0.0031308 )) 
		{
			//line 178 "/shared/color/src/thx/color/Xyz.hx"
			r = ( ( 1.055 * java.lang.Math.pow(r, 0.416666666666666685) ) - 0.055 );
		}
		else
		{
			//line 178 "/shared/color/src/thx/color/Xyz.hx"
			r = ( 12.92 * r );
		}
		
		//line 179 "/shared/color/src/thx/color/Xyz.hx"
		if (( g > 0.0031308 )) 
		{
			//line 179 "/shared/color/src/thx/color/Xyz.hx"
			g = ( ( 1.055 * java.lang.Math.pow(g, 0.416666666666666685) ) - 0.055 );
		}
		else
		{
			//line 179 "/shared/color/src/thx/color/Xyz.hx"
			g = ( 12.92 * g );
		}
		
		//line 180 "/shared/color/src/thx/color/Xyz.hx"
		if (( b > 0.0031308 )) 
		{
			//line 180 "/shared/color/src/thx/color/Xyz.hx"
			b = ( ( 1.055 * java.lang.Math.pow(b, 0.416666666666666685) ) - 0.055 );
		}
		else
		{
			//line 180 "/shared/color/src/thx/color/Xyz.hx"
			b = ( 12.92 * b );
		}
		
		//line 182 "/shared/color/src/thx/color/Xyz.hx"
		haxe.root.Array<java.lang.Object> this2 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (r) ), ((java.lang.Object) (g) ), ((java.lang.Object) (b) )});
		//line 182 "/shared/color/src/thx/color/Xyz.hx"
		return ((haxe.root.Array<java.lang.Object>) (this2) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> toRgbxa(haxe.root.Array<java.lang.Object> this1)
	{
		//line 186 "/shared/color/src/thx/color/Xyz.hx"
		return thx.color._Rgbx.Rgbx_Impl_.toRgbxa(thx.color._Xyz.Xyz_Impl_.toRgbx(this1));
	}
	
	
	public static double toTemperature(haxe.root.Array<java.lang.Object> this1)
	{
		//line 189 "/shared/color/src/thx/color/Xyz.hx"
		return thx.color._Rgbx.Rgbx_Impl_.toTemperature(thx.color._Xyz.Xyz_Impl_.toRgbx(this1));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toYuv(haxe.root.Array<java.lang.Object> this1)
	{
		//line 192 "/shared/color/src/thx/color/Xyz.hx"
		return thx.color._Rgbx.Rgbx_Impl_.toYuv(thx.color._Xyz.Xyz_Impl_.toRgbx(this1));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toYxy(haxe.root.Array<java.lang.Object> this1)
	{
		//line 195 "/shared/color/src/thx/color/Xyz.hx"
		double sum = ( ( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) ) + ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) ) ) + ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) ) );
		//line 196 "/shared/color/src/thx/color/Xyz.hx"
		haxe.root.Array<java.lang.Object> this2 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) )) ), ((java.lang.Object) (( (( sum == 0 )) ? (((double) (1) )) : (( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) ) / sum )) )) ), ((java.lang.Object) (( (( sum == 0 )) ? (((double) (1) )) : (( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) ) / sum )) )) )});
		//line 196 "/shared/color/src/thx/color/Xyz.hx"
		return ((haxe.root.Array<java.lang.Object>) (this2) );
	}
	
	
	public static double get_x(haxe.root.Array<java.lang.Object> this1)
	{
		//line 204 "/shared/color/src/thx/color/Xyz.hx"
		return ((double) (haxe.lang.Runtime.toDouble(this1.__get(0))) );
	}
	
	
	public static double get_y(haxe.root.Array<java.lang.Object> this1)
	{
		//line 206 "/shared/color/src/thx/color/Xyz.hx"
		return ((double) (haxe.lang.Runtime.toDouble(this1.__get(1))) );
	}
	
	
	public static double get_z(haxe.root.Array<java.lang.Object> this1)
	{
		//line 208 "/shared/color/src/thx/color/Xyz.hx"
		return ((double) (haxe.lang.Runtime.toDouble(this1.__get(2))) );
	}
	
	
	public static double get_u(haxe.root.Array<java.lang.Object> this1)
	{
		//line 210 "/shared/color/src/thx/color/Xyz.hx"
		try 
		{
			//line 210 "/shared/color/src/thx/color/Xyz.hx"
			return ( ( 4 * ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) ) ) / (( ( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) ) + ( 15 * ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) ) ) ) + ( 3 * ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) ) ) )) );
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 210 "/shared/color/src/thx/color/Xyz.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 210 "/shared/color/src/thx/color/Xyz.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 210 "/shared/color/src/thx/color/Xyz.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 210 "/shared/color/src/thx/color/Xyz.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 210 "/shared/color/src/thx/color/Xyz.hx"
			{
				//line 210 "/shared/color/src/thx/color/Xyz.hx"
				java.lang.Object e = __temp_catchall2;
				//line 210 "/shared/color/src/thx/color/Xyz.hx"
				return ((double) (0) );
			}
			
		}
		
		
	}
	
	
	public static double get_v(haxe.root.Array<java.lang.Object> this1)
	{
		//line 212 "/shared/color/src/thx/color/Xyz.hx"
		try 
		{
			//line 212 "/shared/color/src/thx/color/Xyz.hx"
			return ( ( 9 * ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) ) ) / (( ( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) ) + ( 15 * ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) ) ) ) + ( 3 * ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) ) ) )) );
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 212 "/shared/color/src/thx/color/Xyz.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 212 "/shared/color/src/thx/color/Xyz.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 212 "/shared/color/src/thx/color/Xyz.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 212 "/shared/color/src/thx/color/Xyz.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 212 "/shared/color/src/thx/color/Xyz.hx"
			{
				//line 212 "/shared/color/src/thx/color/Xyz.hx"
				java.lang.Object e = __temp_catchall2;
				//line 212 "/shared/color/src/thx/color/Xyz.hx"
				return ((double) (0) );
			}
			
		}
		
		
	}
	
	
}


