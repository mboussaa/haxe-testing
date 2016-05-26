// Generated by Haxe 3.3.0
package thx.color._HunterLab;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public final class HunterLab_Impl_
{
	public static haxe.root.Array<java.lang.Object> create(double l, double a, double b)
	{
		//line 16 "/shared/color/src/thx/color/HunterLab.hx"
		haxe.root.Array<java.lang.Object> this1 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (l) ), ((java.lang.Object) (a) ), ((java.lang.Object) (b) )});
		//line 16 "/shared/color/src/thx/color/HunterLab.hx"
		return ((haxe.root.Array<java.lang.Object>) (this1) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> fromFloats(haxe.root.Array<java.lang.Object> arr)
	{
		//line 19 "/shared/color/src/thx/color/HunterLab.hx"
		thx.ArrayFloats.resize(arr, 3, null);
		//line 20 "/shared/color/src/thx/color/HunterLab.hx"
		haxe.root.Array<java.lang.Object> this1 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (((double) (haxe.lang.Runtime.toDouble(arr.__get(0))) )) ), ((java.lang.Object) (((double) (haxe.lang.Runtime.toDouble(arr.__get(1))) )) ), ((java.lang.Object) (((double) (haxe.lang.Runtime.toDouble(arr.__get(2))) )) )});
		//line 20 "/shared/color/src/thx/color/HunterLab.hx"
		return ((haxe.root.Array<java.lang.Object>) (this1) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> fromString(java.lang.String color)
	{
		//line 24 "/shared/color/src/thx/color/HunterLab.hx"
		thx.color.parse.ColorInfo info = thx.color.parse.ColorParser.parseColor(color);
		//line 25 "/shared/color/src/thx/color/HunterLab.hx"
		if (( null == info )) 
		{
			//line 26 "/shared/color/src/thx/color/HunterLab.hx"
			return null;
		}
		
		//line 28 "/shared/color/src/thx/color/HunterLab.hx"
		try 
		{
			//line 28 "/shared/color/src/thx/color/HunterLab.hx"
			java.lang.String _g = info.name;
			//line 28 "/shared/color/src/thx/color/HunterLab.hx"
			{
				//line 28 "/shared/color/src/thx/color/HunterLab.hx"
				java.lang.String __temp_svar3 = (_g);
				//line 28 "/shared/color/src/thx/color/HunterLab.hx"
				boolean __temp_executeDef4 = true;
				//line 28 "/shared/color/src/thx/color/HunterLab.hx"
				switch (__temp_svar3.hashCode())
				{
					case 1012593165:
					{
						//line 28 "/shared/color/src/thx/color/HunterLab.hx"
						if (__temp_svar3.equals("hunterlab")) 
						{
							//line 28 "/shared/color/src/thx/color/HunterLab.hx"
							__temp_executeDef4 = false;
							//line 28 "/shared/color/src/thx/color/HunterLab.hx"
							return thx.color._HunterLab.HunterLab_Impl_.fromFloats(thx.color.parse.ColorParser.getFloatChannels(info.channels, 3, false));
						}
						
						//line 28 "/shared/color/src/thx/color/HunterLab.hx"
						break;
					}
					
					
				}
				
				//line 28 "/shared/color/src/thx/color/HunterLab.hx"
				if (__temp_executeDef4) 
				{
					//line 28 "/shared/color/src/thx/color/HunterLab.hx"
					return null;
				}
				else
				{
					//line 28 "/shared/color/src/thx/color/HunterLab.hx"
					throw null;
				}
				
			}
			
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 28 "/shared/color/src/thx/color/HunterLab.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 28 "/shared/color/src/thx/color/HunterLab.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 28 "/shared/color/src/thx/color/HunterLab.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 28 "/shared/color/src/thx/color/HunterLab.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 28 "/shared/color/src/thx/color/HunterLab.hx"
			{
				//line 28 "/shared/color/src/thx/color/HunterLab.hx"
				java.lang.Object e = __temp_catchall2;
				//line 28 "/shared/color/src/thx/color/HunterLab.hx"
				return null;
			}
			
		}
		
		
	}
	
	
	public static haxe.root.Array<java.lang.Object> _new(haxe.root.Array<java.lang.Object> channels)
	{
		//line 36 "/shared/color/src/thx/color/HunterLab.hx"
		return ((haxe.root.Array<java.lang.Object>) (channels) );
	}
	
	
	
	
	
	
	
	
	public static double distance(haxe.root.Array<java.lang.Object> this1, haxe.root.Array<java.lang.Object> other)
	{
		//line 44 "/shared/color/src/thx/color/HunterLab.hx"
		return ( ( ( (( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) ) - ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(0))) ) )) * (( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) ) - ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(0))) ) )) ) + ( (( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) ) - ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(1))) ) )) * (( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) ) - ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(1))) ) )) ) ) + ( (( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) ) - ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(2))) ) )) * (( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) ) - ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(2))) ) )) ) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> interpolate(haxe.root.Array<java.lang.Object> this1, haxe.root.Array<java.lang.Object> other, double t)
	{
		//line 49 "/shared/color/src/thx/color/HunterLab.hx"
		return ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (thx.Floats.interpolate(t, ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) ), ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(0))) ))) ), ((java.lang.Object) (thx.Floats.interpolate(t, ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) ), ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(1))) ))) ), ((java.lang.Object) (thx.Floats.interpolate(t, ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) ), ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(2))) ))) )})) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> match(haxe.root.Array<java.lang.Object> this1, java.lang.Object palette)
	{
		//line 72 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/NullArgument.hx"
		if (( null == palette )) 
		{
			//line 73 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/NullArgument.hx"
			throw haxe.lang.HaxeException.wrap(new thx.error.NullArgument("Iterable argument \"this\" cannot be null", new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.color._HunterLab.HunterLab_Impl_", "NullArgument.hx", "match"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (73) )) )})));
		}
		else
		{
			//line 74 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/NullArgument.hx"
			if ( ! (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(((java.lang.Object) (haxe.lang.Runtime.callField(palette, "iterator", null)) ), "hasNext", null))) ) 
			{
				//line 75 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/NullArgument.hx"
				throw haxe.lang.HaxeException.wrap(new thx.error.NullArgument("Iterable argument \"this\" cannot be empty", new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.color._HunterLab.HunterLab_Impl_", "NullArgument.hx", "match"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (75) )) )})));
			}
			
		}
		
		//line 57 "/shared/color/src/thx/color/HunterLab.hx"
		double dist = java.lang.Double.POSITIVE_INFINITY;
		//line 57 "/shared/color/src/thx/color/HunterLab.hx"
		haxe.root.Array<java.lang.Object> closest = null;
		//line 59 "/shared/color/src/thx/color/HunterLab.hx"
		{
			//line 59 "/shared/color/src/thx/color/HunterLab.hx"
			java.lang.Object tmp = ((java.lang.Object) (haxe.lang.Runtime.callField(palette, "iterator", null)) );
			//line 59 "/shared/color/src/thx/color/HunterLab.hx"
			while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(tmp, "hasNext", null)))
			{
				//line 59 "/shared/color/src/thx/color/HunterLab.hx"
				haxe.root.Array<java.lang.Object> color = ((haxe.root.Array<java.lang.Object>) (haxe.lang.Runtime.callField(tmp, "next", null)) );
				//line 60 "/shared/color/src/thx/color/HunterLab.hx"
				double ndist = thx.color._HunterLab.HunterLab_Impl_.distance(this1, color);
				//line 61 "/shared/color/src/thx/color/HunterLab.hx"
				if (( ndist < dist )) 
				{
					//line 62 "/shared/color/src/thx/color/HunterLab.hx"
					dist = ndist;
					//line 63 "/shared/color/src/thx/color/HunterLab.hx"
					closest = color;
				}
				
			}
			
		}
		
		//line 66 "/shared/color/src/thx/color/HunterLab.hx"
		return closest;
	}
	
	
	public static haxe.root.Array<java.lang.Object> min(haxe.root.Array<java.lang.Object> this1, haxe.root.Array<java.lang.Object> other)
	{
		//line 70 "/shared/color/src/thx/color/HunterLab.hx"
		haxe.root.Array<java.lang.Object> this2 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (java.lang.Math.min(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) ), ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(0))) ))) ), ((java.lang.Object) (java.lang.Math.min(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) ), ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(1))) ))) ), ((java.lang.Object) (java.lang.Math.min(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) ), ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(2))) ))) )});
		//line 70 "/shared/color/src/thx/color/HunterLab.hx"
		return ((haxe.root.Array<java.lang.Object>) (this2) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> max(haxe.root.Array<java.lang.Object> this1, haxe.root.Array<java.lang.Object> other)
	{
		//line 73 "/shared/color/src/thx/color/HunterLab.hx"
		haxe.root.Array<java.lang.Object> this2 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (java.lang.Math.max(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) ), ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(0))) ))) ), ((java.lang.Object) (java.lang.Math.max(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) ), ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(1))) ))) ), ((java.lang.Object) (java.lang.Math.max(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) ), ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(2))) ))) )});
		//line 73 "/shared/color/src/thx/color/HunterLab.hx"
		return ((haxe.root.Array<java.lang.Object>) (this2) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> roundTo(haxe.root.Array<java.lang.Object> this1, int decimals)
	{
		//line 76 "/shared/color/src/thx/color/HunterLab.hx"
		haxe.root.Array<java.lang.Object> this2 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (thx.Floats.roundTo(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) ), decimals)) ), ((java.lang.Object) (thx.Floats.roundTo(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) ), decimals)) ), ((java.lang.Object) (thx.Floats.roundTo(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) ), decimals)) )});
		//line 76 "/shared/color/src/thx/color/HunterLab.hx"
		return ((haxe.root.Array<java.lang.Object>) (this2) );
	}
	
	
	public static boolean equals(haxe.root.Array<java.lang.Object> this1, haxe.root.Array<java.lang.Object> other)
	{
		//line 79 "/shared/color/src/thx/color/HunterLab.hx"
		return thx.color._HunterLab.HunterLab_Impl_.nearEquals(this1, other, null);
	}
	
	
	public static boolean nearEquals(haxe.root.Array<java.lang.Object> this1, haxe.root.Array<java.lang.Object> other, java.lang.Object tolerance)
	{
		//line 82 "/shared/color/src/thx/color/HunterLab.hx"
		java.lang.Object __temp_tolerance131 = ( (haxe.lang.Runtime.eq(tolerance, null)) ? (((java.lang.Object) (1e-9) )) : (tolerance) );
		//line 82 "/shared/color/src/thx/color/HunterLab.hx"
		if (( thx.Floats.nearEquals(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) ), ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(0))) ), __temp_tolerance131) && thx.Floats.nearEquals(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) ), ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(1))) ), __temp_tolerance131) )) 
		{
			//line 82 "/shared/color/src/thx/color/HunterLab.hx"
			return thx.Floats.nearEquals(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) ), ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(2))) ), __temp_tolerance131);
		}
		else
		{
			//line 82 "/shared/color/src/thx/color/HunterLab.hx"
			return false;
		}
		
	}
	
	
	public static haxe.root.Array<java.lang.Object> withL(haxe.root.Array<java.lang.Object> this1, double newl)
	{
		//line 85 "/shared/color/src/thx/color/HunterLab.hx"
		haxe.root.Array<java.lang.Object> this2 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (newl) ), ((java.lang.Object) (((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) )) ), ((java.lang.Object) (((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) )) )});
		//line 85 "/shared/color/src/thx/color/HunterLab.hx"
		return ((haxe.root.Array<java.lang.Object>) (this2) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> withA(haxe.root.Array<java.lang.Object> this1, double newa)
	{
		//line 88 "/shared/color/src/thx/color/HunterLab.hx"
		haxe.root.Array<java.lang.Object> this2 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) )) ), ((java.lang.Object) (newa) ), ((java.lang.Object) (((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) )) )});
		//line 88 "/shared/color/src/thx/color/HunterLab.hx"
		return ((haxe.root.Array<java.lang.Object>) (this2) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> withB(haxe.root.Array<java.lang.Object> this1, double newb)
	{
		//line 91 "/shared/color/src/thx/color/HunterLab.hx"
		haxe.root.Array<java.lang.Object> this2 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) )) ), ((java.lang.Object) (((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) )) ), ((java.lang.Object) (newb) )});
		//line 91 "/shared/color/src/thx/color/HunterLab.hx"
		return ((haxe.root.Array<java.lang.Object>) (this2) );
	}
	
	
	public static java.lang.String toString(haxe.root.Array<java.lang.Object> this1)
	{
		//line 94 "/shared/color/src/thx/color/HunterLab.hx"
		return ( ( ( ( ( ( "hunterlab(" + haxe.lang.Runtime.toString(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) )) ) + "," ) + haxe.lang.Runtime.toString(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) )) ) + "," ) + haxe.lang.Runtime.toString(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) )) ) + ")" );
	}
	
	
	public static haxe.root.Array<java.lang.Object> toLab(haxe.root.Array<java.lang.Object> this1)
	{
		//line 97 "/shared/color/src/thx/color/HunterLab.hx"
		return thx.color._Xyz.Xyz_Impl_.toLab(thx.color._HunterLab.HunterLab_Impl_.toXyz(this1));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toLCh(haxe.root.Array<java.lang.Object> this1)
	{
		//line 100 "/shared/color/src/thx/color/HunterLab.hx"
		return thx.color._Lab.Lab_Impl_.toLCh(thx.color._HunterLab.HunterLab_Impl_.toLab(this1));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toLuv(haxe.root.Array<java.lang.Object> this1)
	{
		//line 103 "/shared/color/src/thx/color/HunterLab.hx"
		return thx.color._Rgbx.Rgbx_Impl_.toLuv(thx.color._HunterLab.HunterLab_Impl_.toRgbx(this1));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toCmy(haxe.root.Array<java.lang.Object> this1)
	{
		//line 106 "/shared/color/src/thx/color/HunterLab.hx"
		return thx.color._Rgbx.Rgbx_Impl_.toCmy(thx.color._HunterLab.HunterLab_Impl_.toRgbx(this1));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toCmyk(haxe.root.Array<java.lang.Object> this1)
	{
		//line 109 "/shared/color/src/thx/color/HunterLab.hx"
		return thx.color._Rgbx.Rgbx_Impl_.toCmyk(thx.color._HunterLab.HunterLab_Impl_.toRgbx(this1));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toCubeHelix(haxe.root.Array<java.lang.Object> this1)
	{
		//line 112 "/shared/color/src/thx/color/HunterLab.hx"
		return thx.color._Rgbx.Rgbx_Impl_.toCubeHelixWithGamma(((haxe.root.Array<java.lang.Object>) (thx.color._HunterLab.HunterLab_Impl_.toRgbx(this1)) ), ((double) (1) ));
	}
	
	
	public static double toGrey(haxe.root.Array<java.lang.Object> this1)
	{
		//line 115 "/shared/color/src/thx/color/HunterLab.hx"
		return thx.color._Rgbx.Rgbx_Impl_.toGrey(thx.color._HunterLab.HunterLab_Impl_.toRgbx(this1));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toHsl(haxe.root.Array<java.lang.Object> this1)
	{
		//line 118 "/shared/color/src/thx/color/HunterLab.hx"
		return thx.color._Rgbx.Rgbx_Impl_.toHsl(thx.color._HunterLab.HunterLab_Impl_.toRgbx(this1));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toHsv(haxe.root.Array<java.lang.Object> this1)
	{
		//line 121 "/shared/color/src/thx/color/HunterLab.hx"
		return thx.color._Rgbx.Rgbx_Impl_.toHsv(thx.color._HunterLab.HunterLab_Impl_.toRgbx(this1));
	}
	
	
	public static int toRgb(haxe.root.Array<java.lang.Object> this1)
	{
		//line 124 "/shared/color/src/thx/color/HunterLab.hx"
		return thx.color._Rgbx.Rgbx_Impl_.toRgb(thx.color._HunterLab.HunterLab_Impl_.toRgbx(this1));
	}
	
	
	public static int toRgba(haxe.root.Array<java.lang.Object> this1)
	{
		//line 127 "/shared/color/src/thx/color/HunterLab.hx"
		return thx.color._Rgbxa.Rgbxa_Impl_.toRgba(thx.color._HunterLab.HunterLab_Impl_.toRgbxa(this1));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toRgbx(haxe.root.Array<java.lang.Object> this1)
	{
		//line 130 "/shared/color/src/thx/color/HunterLab.hx"
		return thx.color._Xyz.Xyz_Impl_.toRgbx(thx.color._HunterLab.HunterLab_Impl_.toXyz(this1));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toRgbxa(haxe.root.Array<java.lang.Object> this1)
	{
		//line 133 "/shared/color/src/thx/color/HunterLab.hx"
		return thx.color._Rgbx.Rgbx_Impl_.toRgbxa(thx.color._HunterLab.HunterLab_Impl_.toRgbx(this1));
	}
	
	
	public static double toTemperature(haxe.root.Array<java.lang.Object> this1)
	{
		//line 136 "/shared/color/src/thx/color/HunterLab.hx"
		return thx.color._Rgbx.Rgbx_Impl_.toTemperature(thx.color._HunterLab.HunterLab_Impl_.toRgbx(this1));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toXyz(haxe.root.Array<java.lang.Object> this1)
	{
		//line 139 "/shared/color/src/thx/color/HunterLab.hx"
		double x = ( ( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) ) / 17.5 ) * (( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) ) / 10.0 )) );
		//line 139 "/shared/color/src/thx/color/HunterLab.hx"
		double l10 = ( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) ) / 10.0 );
		//line 139 "/shared/color/src/thx/color/HunterLab.hx"
		double y = ( l10 * l10 );
		//line 139 "/shared/color/src/thx/color/HunterLab.hx"
		double z = ( ( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) ) / 7.0 ) * (( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) ) / 10.0 )) );
		//line 144 "/shared/color/src/thx/color/HunterLab.hx"
		haxe.root.Array<java.lang.Object> this2 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (( (( x + y )) / 1.02 )) ), ((java.lang.Object) (y) ), ((java.lang.Object) ((  - ((( z - y )))  / 0.847 )) )});
		//line 144 "/shared/color/src/thx/color/HunterLab.hx"
		return ((haxe.root.Array<java.lang.Object>) (this2) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> toYuv(haxe.root.Array<java.lang.Object> this1)
	{
		//line 148 "/shared/color/src/thx/color/HunterLab.hx"
		return thx.color._Rgbx.Rgbx_Impl_.toYuv(thx.color._HunterLab.HunterLab_Impl_.toRgbx(this1));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toYxy(haxe.root.Array<java.lang.Object> this1)
	{
		//line 151 "/shared/color/src/thx/color/HunterLab.hx"
		return thx.color._Xyz.Xyz_Impl_.toYxy(thx.color._HunterLab.HunterLab_Impl_.toXyz(this1));
	}
	
	
	public static double get_l(haxe.root.Array<java.lang.Object> this1)
	{
		//line 154 "/shared/color/src/thx/color/HunterLab.hx"
		return ((double) (haxe.lang.Runtime.toDouble(this1.__get(0))) );
	}
	
	
	public static double get_a(haxe.root.Array<java.lang.Object> this1)
	{
		//line 156 "/shared/color/src/thx/color/HunterLab.hx"
		return ((double) (haxe.lang.Runtime.toDouble(this1.__get(1))) );
	}
	
	
	public static double get_b(haxe.root.Array<java.lang.Object> this1)
	{
		//line 158 "/shared/color/src/thx/color/HunterLab.hx"
		return ((double) (haxe.lang.Runtime.toDouble(this1.__get(2))) );
	}
	
	
}


