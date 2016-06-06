// Generated by Haxe 3.3.0
package thx.color._Lab;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public final class Lab_Impl_
{
	public static haxe.root.Array<java.lang.Object> create(double l, double a, double b)
	{
		//line 42 "/shared/color/src/thx/color/Lab.hx"
		haxe.root.Array<java.lang.Object> this1 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (l) ), ((java.lang.Object) (a) ), ((java.lang.Object) (b) )});
		//line 42 "/shared/color/src/thx/color/Lab.hx"
		return ((haxe.root.Array<java.lang.Object>) (this1) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> fromFloats(haxe.root.Array<java.lang.Object> arr)
	{
		//line 45 "/shared/color/src/thx/color/Lab.hx"
		thx.ArrayFloats.resize(arr, 3, null);
		//line 46 "/shared/color/src/thx/color/Lab.hx"
		haxe.root.Array<java.lang.Object> this1 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (((double) (haxe.lang.Runtime.toDouble(arr.__get(0))) )) ), ((java.lang.Object) (((double) (haxe.lang.Runtime.toDouble(arr.__get(1))) )) ), ((java.lang.Object) (((double) (haxe.lang.Runtime.toDouble(arr.__get(2))) )) )});
		//line 46 "/shared/color/src/thx/color/Lab.hx"
		return ((haxe.root.Array<java.lang.Object>) (this1) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> fromString(java.lang.String color)
	{
		//line 50 "/shared/color/src/thx/color/Lab.hx"
		thx.color.parse.ColorInfo info = thx.color.parse.ColorParser.parseColor(color);
		//line 51 "/shared/color/src/thx/color/Lab.hx"
		if (( null == info )) 
		{
			//line 52 "/shared/color/src/thx/color/Lab.hx"
			return null;
		}
		
		//line 54 "/shared/color/src/thx/color/Lab.hx"
		try 
		{
			//line 54 "/shared/color/src/thx/color/Lab.hx"
			java.lang.String _g = info.name;
			//line 54 "/shared/color/src/thx/color/Lab.hx"
			{
				//line 54 "/shared/color/src/thx/color/Lab.hx"
				java.lang.String __temp_svar3 = (_g);
				//line 54 "/shared/color/src/thx/color/Lab.hx"
				int __temp_hash5 = __temp_svar3.hashCode();
				//line 54 "/shared/color/src/thx/color/Lab.hx"
				boolean __temp_executeDef4 = true;
				//line 54 "/shared/color/src/thx/color/Lab.hx"
				switch (__temp_hash5)
				{
					case 106893:
					case -1161297937:
					case -1360595858:
					{
						//line 54 "/shared/color/src/thx/color/Lab.hx"
						if (( (( ( __temp_hash5 == 106893 ) && __temp_svar3.equals("lab") )) || ( (( ( __temp_hash5 == -1161297937 ) && __temp_svar3.equals("l*a*b*") )) || __temp_svar3.equals("cielab") ) )) 
						{
							//line 54 "/shared/color/src/thx/color/Lab.hx"
							__temp_executeDef4 = false;
							//line 54 "/shared/color/src/thx/color/Lab.hx"
							return thx.color._Lab.Lab_Impl_.fromFloats(thx.color.parse.ColorParser.getFloatChannels(info.channels, 3, false));
						}
						
						//line 54 "/shared/color/src/thx/color/Lab.hx"
						break;
					}
					
					
				}
				
				//line 54 "/shared/color/src/thx/color/Lab.hx"
				if (__temp_executeDef4) 
				{
					//line 54 "/shared/color/src/thx/color/Lab.hx"
					return null;
				}
				else
				{
					//line 54 "/shared/color/src/thx/color/Lab.hx"
					throw null;
				}
				
			}
			
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 54 "/shared/color/src/thx/color/Lab.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 54 "/shared/color/src/thx/color/Lab.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 54 "/shared/color/src/thx/color/Lab.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 54 "/shared/color/src/thx/color/Lab.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 54 "/shared/color/src/thx/color/Lab.hx"
			{
				//line 54 "/shared/color/src/thx/color/Lab.hx"
				java.lang.Object e = __temp_catchall2;
				//line 54 "/shared/color/src/thx/color/Lab.hx"
				return null;
			}
			
		}
		
		
	}
	
	
	public static haxe.root.Array<java.lang.Object> _new(haxe.root.Array<java.lang.Object> channels)
	{
		//line 62 "/shared/color/src/thx/color/Lab.hx"
		return ((haxe.root.Array<java.lang.Object>) (channels) );
	}
	
	
	
	
	
	
	
	
	public static double distance(haxe.root.Array<java.lang.Object> this1, haxe.root.Array<java.lang.Object> other)
	{
		//line 70 "/shared/color/src/thx/color/Lab.hx"
		return ( ( ( (( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) ) - ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(0))) ) )) * (( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) ) - ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(0))) ) )) ) + ( (( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) ) - ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(1))) ) )) * (( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) ) - ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(1))) ) )) ) ) + ( (( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) ) - ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(2))) ) )) * (( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) ) - ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(2))) ) )) ) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> interpolate(haxe.root.Array<java.lang.Object> this1, haxe.root.Array<java.lang.Object> other, double t)
	{
		//line 75 "/shared/color/src/thx/color/Lab.hx"
		return ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (thx.Floats.interpolate(t, ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) ), ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(0))) ))) ), ((java.lang.Object) (thx.Floats.interpolate(t, ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) ), ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(1))) ))) ), ((java.lang.Object) (thx.Floats.interpolate(t, ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) ), ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(2))) ))) )})) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> match(haxe.root.Array<java.lang.Object> this1, java.lang.Object palette)
	{
		//line 72 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/NullArgument.hx"
		if (( null == palette )) 
		{
			//line 73 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/NullArgument.hx"
			throw haxe.lang.HaxeException.wrap(new thx.error.NullArgument("Iterable argument \"this\" cannot be null", new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.color._Lab.Lab_Impl_", "NullArgument.hx", "match"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (73) )) )})));
		}
		else
		{
			//line 74 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/NullArgument.hx"
			if ( ! (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(((java.lang.Object) (haxe.lang.Runtime.callField(palette, "iterator", null)) ), "hasNext", null))) ) 
			{
				//line 75 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/NullArgument.hx"
				throw haxe.lang.HaxeException.wrap(new thx.error.NullArgument("Iterable argument \"this\" cannot be empty", new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.color._Lab.Lab_Impl_", "NullArgument.hx", "match"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (75) )) )})));
			}
			
		}
		
		//line 83 "/shared/color/src/thx/color/Lab.hx"
		double dist = java.lang.Double.POSITIVE_INFINITY;
		//line 83 "/shared/color/src/thx/color/Lab.hx"
		haxe.root.Array<java.lang.Object> closest = null;
		//line 85 "/shared/color/src/thx/color/Lab.hx"
		{
			//line 85 "/shared/color/src/thx/color/Lab.hx"
			java.lang.Object tmp = ((java.lang.Object) (haxe.lang.Runtime.callField(palette, "iterator", null)) );
			//line 85 "/shared/color/src/thx/color/Lab.hx"
			while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(tmp, "hasNext", null)))
			{
				//line 85 "/shared/color/src/thx/color/Lab.hx"
				haxe.root.Array<java.lang.Object> color = ((haxe.root.Array<java.lang.Object>) (haxe.lang.Runtime.callField(tmp, "next", null)) );
				//line 86 "/shared/color/src/thx/color/Lab.hx"
				double ndist = thx.color._Lab.Lab_Impl_.distance(this1, color);
				//line 87 "/shared/color/src/thx/color/Lab.hx"
				if (( ndist < dist )) 
				{
					//line 88 "/shared/color/src/thx/color/Lab.hx"
					dist = ndist;
					//line 89 "/shared/color/src/thx/color/Lab.hx"
					closest = color;
				}
				
			}
			
		}
		
		//line 92 "/shared/color/src/thx/color/Lab.hx"
		return closest;
	}
	
	
	public static haxe.root.Array<java.lang.Object> min(haxe.root.Array<java.lang.Object> this1, haxe.root.Array<java.lang.Object> other)
	{
		//line 96 "/shared/color/src/thx/color/Lab.hx"
		haxe.root.Array<java.lang.Object> this2 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (java.lang.Math.min(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) ), ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(0))) ))) ), ((java.lang.Object) (java.lang.Math.min(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) ), ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(1))) ))) ), ((java.lang.Object) (java.lang.Math.min(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) ), ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(2))) ))) )});
		//line 96 "/shared/color/src/thx/color/Lab.hx"
		return ((haxe.root.Array<java.lang.Object>) (this2) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> max(haxe.root.Array<java.lang.Object> this1, haxe.root.Array<java.lang.Object> other)
	{
		//line 99 "/shared/color/src/thx/color/Lab.hx"
		haxe.root.Array<java.lang.Object> this2 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (java.lang.Math.max(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) ), ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(0))) ))) ), ((java.lang.Object) (java.lang.Math.max(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) ), ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(1))) ))) ), ((java.lang.Object) (java.lang.Math.max(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) ), ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(2))) ))) )});
		//line 99 "/shared/color/src/thx/color/Lab.hx"
		return ((haxe.root.Array<java.lang.Object>) (this2) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> roundTo(haxe.root.Array<java.lang.Object> this1, int decimals)
	{
		//line 102 "/shared/color/src/thx/color/Lab.hx"
		haxe.root.Array<java.lang.Object> this2 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (thx.Floats.roundTo(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) ), decimals)) ), ((java.lang.Object) (thx.Floats.roundTo(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) ), decimals)) ), ((java.lang.Object) (thx.Floats.roundTo(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) ), decimals)) )});
		//line 102 "/shared/color/src/thx/color/Lab.hx"
		return ((haxe.root.Array<java.lang.Object>) (this2) );
	}
	
	
	public static boolean equals(haxe.root.Array<java.lang.Object> this1, haxe.root.Array<java.lang.Object> other)
	{
		//line 105 "/shared/color/src/thx/color/Lab.hx"
		return thx.color._Lab.Lab_Impl_.nearEquals(this1, other, null);
	}
	
	
	public static boolean nearEquals(haxe.root.Array<java.lang.Object> this1, haxe.root.Array<java.lang.Object> other, java.lang.Object tolerance)
	{
		//line 108 "/shared/color/src/thx/color/Lab.hx"
		java.lang.Object __temp_tolerance136 = ( (haxe.lang.Runtime.eq(tolerance, null)) ? (((java.lang.Object) (1e-9) )) : (tolerance) );
		//line 108 "/shared/color/src/thx/color/Lab.hx"
		if (( thx.Floats.nearEquals(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) ), ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(0))) ), __temp_tolerance136) && thx.Floats.nearEquals(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) ), ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(1))) ), __temp_tolerance136) )) 
		{
			//line 108 "/shared/color/src/thx/color/Lab.hx"
			return thx.Floats.nearEquals(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) ), ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(2))) ), __temp_tolerance136);
		}
		else
		{
			//line 108 "/shared/color/src/thx/color/Lab.hx"
			return false;
		}
		
	}
	
	
	public static haxe.root.Array<java.lang.Object> withL(haxe.root.Array<java.lang.Object> this1, double newl)
	{
		//line 111 "/shared/color/src/thx/color/Lab.hx"
		haxe.root.Array<java.lang.Object> this2 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (newl) ), ((java.lang.Object) (((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) )) ), ((java.lang.Object) (((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) )) )});
		//line 111 "/shared/color/src/thx/color/Lab.hx"
		return ((haxe.root.Array<java.lang.Object>) (this2) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> withA(haxe.root.Array<java.lang.Object> this1, double newa)
	{
		//line 114 "/shared/color/src/thx/color/Lab.hx"
		haxe.root.Array<java.lang.Object> this2 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) )) ), ((java.lang.Object) (newa) ), ((java.lang.Object) (((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) )) )});
		//line 114 "/shared/color/src/thx/color/Lab.hx"
		return ((haxe.root.Array<java.lang.Object>) (this2) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> withB(haxe.root.Array<java.lang.Object> this1, double newb)
	{
		//line 117 "/shared/color/src/thx/color/Lab.hx"
		haxe.root.Array<java.lang.Object> this2 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) )) ), ((java.lang.Object) (((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) )) ), ((java.lang.Object) (newb) )});
		//line 117 "/shared/color/src/thx/color/Lab.hx"
		return ((haxe.root.Array<java.lang.Object>) (this2) );
	}
	
	
	public static java.lang.String toString(haxe.root.Array<java.lang.Object> this1)
	{
		//line 120 "/shared/color/src/thx/color/Lab.hx"
		return ( ( ( ( ( ( "lab(" + haxe.lang.Runtime.toString(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) )) ) + "," ) + haxe.lang.Runtime.toString(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) )) ) + "," ) + haxe.lang.Runtime.toString(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) )) ) + ")" );
	}
	
	
	public static haxe.root.Array<java.lang.Object> toLCh(haxe.root.Array<java.lang.Object> this1)
	{
		//line 123 "/shared/color/src/thx/color/Lab.hx"
		double h = ( ( java.lang.Math.atan2(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) ), ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) )) * 180 ) / java.lang.Math.PI );
		//line 123 "/shared/color/src/thx/color/Lab.hx"
		double c = java.lang.Math.sqrt(( ( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) ) * ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) ) ) + ( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) ) * ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) ) ) ));
		//line 125 "/shared/color/src/thx/color/Lab.hx"
		haxe.root.Array<java.lang.Object> this2 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) )) ), ((java.lang.Object) (c) ), ((java.lang.Object) (h) )});
		//line 125 "/shared/color/src/thx/color/Lab.hx"
		return ((haxe.root.Array<java.lang.Object>) (this2) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> toLuv(haxe.root.Array<java.lang.Object> this1)
	{
		//line 129 "/shared/color/src/thx/color/Lab.hx"
		return thx.color._Rgbx.Rgbx_Impl_.toLuv(thx.color._Lab.Lab_Impl_.toRgbx(this1));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toCmy(haxe.root.Array<java.lang.Object> this1)
	{
		//line 132 "/shared/color/src/thx/color/Lab.hx"
		return thx.color._Rgbx.Rgbx_Impl_.toCmy(thx.color._Lab.Lab_Impl_.toRgbx(this1));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toCmyk(haxe.root.Array<java.lang.Object> this1)
	{
		//line 135 "/shared/color/src/thx/color/Lab.hx"
		return thx.color._Rgbx.Rgbx_Impl_.toCmyk(thx.color._Lab.Lab_Impl_.toRgbx(this1));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toCubeHelix(haxe.root.Array<java.lang.Object> this1)
	{
		//line 138 "/shared/color/src/thx/color/Lab.hx"
		return thx.color._Rgbx.Rgbx_Impl_.toCubeHelixWithGamma(((haxe.root.Array<java.lang.Object>) (thx.color._Lab.Lab_Impl_.toRgbx(this1)) ), ((double) (1) ));
	}
	
	
	public static double toGrey(haxe.root.Array<java.lang.Object> this1)
	{
		//line 141 "/shared/color/src/thx/color/Lab.hx"
		return thx.color._Rgbx.Rgbx_Impl_.toGrey(thx.color._Lab.Lab_Impl_.toRgbx(this1));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toHsl(haxe.root.Array<java.lang.Object> this1)
	{
		//line 144 "/shared/color/src/thx/color/Lab.hx"
		return thx.color._Rgbx.Rgbx_Impl_.toHsl(thx.color._Lab.Lab_Impl_.toRgbx(this1));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toHsv(haxe.root.Array<java.lang.Object> this1)
	{
		//line 147 "/shared/color/src/thx/color/Lab.hx"
		return thx.color._Rgbx.Rgbx_Impl_.toHsv(thx.color._Lab.Lab_Impl_.toRgbx(this1));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toHunterLab(haxe.root.Array<java.lang.Object> this1)
	{
		//line 150 "/shared/color/src/thx/color/Lab.hx"
		return thx.color._Xyz.Xyz_Impl_.toHunterLab(thx.color._Lab.Lab_Impl_.toXyz(this1));
	}
	
	
	public static int toRgb(haxe.root.Array<java.lang.Object> this1)
	{
		//line 153 "/shared/color/src/thx/color/Lab.hx"
		return thx.color._Rgbx.Rgbx_Impl_.toRgb(thx.color._Lab.Lab_Impl_.toRgbx(this1));
	}
	
	
	public static int toRgba(haxe.root.Array<java.lang.Object> this1)
	{
		//line 156 "/shared/color/src/thx/color/Lab.hx"
		return thx.color._Rgbxa.Rgbxa_Impl_.toRgba(thx.color._Lab.Lab_Impl_.toRgbxa(this1));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toRgbx(haxe.root.Array<java.lang.Object> this1)
	{
		//line 159 "/shared/color/src/thx/color/Lab.hx"
		return thx.color._Xyz.Xyz_Impl_.toRgbx(thx.color._Lab.Lab_Impl_.toXyz(this1));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toRgbxa(haxe.root.Array<java.lang.Object> this1)
	{
		//line 162 "/shared/color/src/thx/color/Lab.hx"
		return thx.color._Rgbx.Rgbx_Impl_.toRgbxa(thx.color._Lab.Lab_Impl_.toRgbx(this1));
	}
	
	
	public static double toTemperature(haxe.root.Array<java.lang.Object> this1)
	{
		//line 165 "/shared/color/src/thx/color/Lab.hx"
		return thx.color._Rgbx.Rgbx_Impl_.toTemperature(thx.color._Lab.Lab_Impl_.toRgbx(this1));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toXyz(haxe.root.Array<java.lang.Object> this1)
	{
		//line 168 "/shared/color/src/thx/color/Lab.hx"
		haxe.lang.Function f = ( (( thx.color._Lab.Lab_Impl__toXyz_168__Fun.__hx_current != null )) ? (thx.color._Lab.Lab_Impl__toXyz_168__Fun.__hx_current) : (thx.color._Lab.Lab_Impl__toXyz_168__Fun.__hx_current = ((thx.color._Lab.Lab_Impl__toXyz_168__Fun) (new thx.color._Lab.Lab_Impl__toXyz_168__Fun()) )) );
		//line 175 "/shared/color/src/thx/color/Lab.hx"
		double x = ( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (thx.color._Xyz.Xyz_Impl_.whiteReference) ).__get(0))) ) * ((double) (f.__hx_invoke1_f(( ( 0.00862068965517241367 * (( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) ) + 16 )) ) + ( 0.002 * ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) ) ) ), haxe.lang.Runtime.undefined)) ) );
		//line 175 "/shared/color/src/thx/color/Lab.hx"
		double y = ( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (thx.color._Xyz.Xyz_Impl_.whiteReference) ).__get(1))) ) * ((double) (f.__hx_invoke1_f(( 0.00862068965517241367 * (( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) ) + 16 )) ), haxe.lang.Runtime.undefined)) ) );
		//line 175 "/shared/color/src/thx/color/Lab.hx"
		double z = ( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (thx.color._Xyz.Xyz_Impl_.whiteReference) ).__get(2))) ) * ((double) (f.__hx_invoke1_f(( ( 0.00862068965517241367 * (( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) ) + 16 )) ) - ( 0.005 * ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) ) ) ), haxe.lang.Runtime.undefined)) ) );
		//line 179 "/shared/color/src/thx/color/Lab.hx"
		haxe.root.Array<java.lang.Object> this2 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (x) ), ((java.lang.Object) (y) ), ((java.lang.Object) (z) )});
		//line 179 "/shared/color/src/thx/color/Lab.hx"
		return ((haxe.root.Array<java.lang.Object>) (this2) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> toYuv(haxe.root.Array<java.lang.Object> this1)
	{
		//line 183 "/shared/color/src/thx/color/Lab.hx"
		return thx.color._Rgbx.Rgbx_Impl_.toYuv(thx.color._Lab.Lab_Impl_.toRgbx(this1));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toYxy(haxe.root.Array<java.lang.Object> this1)
	{
		//line 186 "/shared/color/src/thx/color/Lab.hx"
		return thx.color._Xyz.Xyz_Impl_.toYxy(thx.color._Lab.Lab_Impl_.toXyz(this1));
	}
	
	
	public static double get_l(haxe.root.Array<java.lang.Object> this1)
	{
		//line 189 "/shared/color/src/thx/color/Lab.hx"
		return ((double) (haxe.lang.Runtime.toDouble(this1.__get(0))) );
	}
	
	
	public static double get_a(haxe.root.Array<java.lang.Object> this1)
	{
		//line 191 "/shared/color/src/thx/color/Lab.hx"
		return ((double) (haxe.lang.Runtime.toDouble(this1.__get(1))) );
	}
	
	
	public static double get_b(haxe.root.Array<java.lang.Object> this1)
	{
		//line 193 "/shared/color/src/thx/color/Lab.hx"
		return ((double) (haxe.lang.Runtime.toDouble(this1.__get(2))) );
	}
	
	
}

