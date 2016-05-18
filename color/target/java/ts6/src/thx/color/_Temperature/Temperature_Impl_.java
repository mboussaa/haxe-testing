// Generated by Haxe 3.3.0
package thx.color._Temperature;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public final class Temperature_Impl_
{
	public static haxe.root.Array<java.lang.Object> temperatureToRgbx(double kelvin)
	{
		//line 29 "/shared/thx.color/src/thx/color/Temperature.hx"
		double t = ( kelvin / 100.0 );
		//line 30 "/shared/thx.color/src/thx/color/Temperature.hx"
		double r = 0.0;
		//line 30 "/shared/thx.color/src/thx/color/Temperature.hx"
		double g = 0.0;
		//line 30 "/shared/thx.color/src/thx/color/Temperature.hx"
		double b = 0.0;
		//line 33 "/shared/thx.color/src/thx/color/Temperature.hx"
		if (( t < 66.0 )) 
		{
			//line 34 "/shared/thx.color/src/thx/color/Temperature.hx"
			r = ((double) (1) );
		}
		else
		{
			//line 36 "/shared/thx.color/src/thx/color/Temperature.hx"
			r = ( t - 55.0 );
			//line 37 "/shared/thx.color/src/thx/color/Temperature.hx"
			r = ( (( ( 351.97690566805693 + ( 0.114206453784165 * r ) ) - ( 40.25366309332127 * java.lang.Math.log(r) ) )) / 255 );
			//line 38 "/shared/thx.color/src/thx/color/Temperature.hx"
			if (( r < 0 )) 
			{
				//line 38 "/shared/thx.color/src/thx/color/Temperature.hx"
				r = ((double) (0) );
			}
			
			//line 39 "/shared/thx.color/src/thx/color/Temperature.hx"
			if (( r > 1 )) 
			{
				//line 39 "/shared/thx.color/src/thx/color/Temperature.hx"
				r = ((double) (1) );
			}
			
		}
		
		//line 43 "/shared/thx.color/src/thx/color/Temperature.hx"
		if (( t < 66.0 )) 
		{
			//line 44 "/shared/thx.color/src/thx/color/Temperature.hx"
			g = ( t - 2 );
			//line 45 "/shared/thx.color/src/thx/color/Temperature.hx"
			g = ( (( ( -155.254855627091786 - ( 0.44596950469579133 * g ) ) + ( 104.49216199393888 * java.lang.Math.log(g) ) )) / 255 );
			//line 46 "/shared/thx.color/src/thx/color/Temperature.hx"
			if (( g < 0 )) 
			{
				//line 46 "/shared/thx.color/src/thx/color/Temperature.hx"
				g = ((double) (0) );
			}
			
			//line 47 "/shared/thx.color/src/thx/color/Temperature.hx"
			if (( g > 1 )) 
			{
				//line 47 "/shared/thx.color/src/thx/color/Temperature.hx"
				g = ((double) (1) );
			}
			
		}
		else
		{
			//line 49 "/shared/thx.color/src/thx/color/Temperature.hx"
			g = ( t - 50 );
			//line 50 "/shared/thx.color/src/thx/color/Temperature.hx"
			g = ( (( ( 325.4494125711974 + ( 0.07943456536662342 * g ) ) - ( 28.0852963507957 * java.lang.Math.log(g) ) )) / 255 );
			//line 51 "/shared/thx.color/src/thx/color/Temperature.hx"
			if (( g < 0 )) 
			{
				//line 51 "/shared/thx.color/src/thx/color/Temperature.hx"
				g = ((double) (0) );
			}
			
			//line 52 "/shared/thx.color/src/thx/color/Temperature.hx"
			if (( g > 1 )) 
			{
				//line 52 "/shared/thx.color/src/thx/color/Temperature.hx"
				g = ((double) (1) );
			}
			
		}
		
		//line 56 "/shared/thx.color/src/thx/color/Temperature.hx"
		if (( t >= 66.0 )) 
		{
			//line 57 "/shared/thx.color/src/thx/color/Temperature.hx"
			b = ((double) (1) );
		}
		else
		{
			//line 58 "/shared/thx.color/src/thx/color/Temperature.hx"
			if (( t <= 20.0 )) 
			{
				//line 59 "/shared/thx.color/src/thx/color/Temperature.hx"
				b = ((double) (0) );
			}
			else
			{
				//line 61 "/shared/thx.color/src/thx/color/Temperature.hx"
				b = ( t - 10 );
				//line 62 "/shared/thx.color/src/thx/color/Temperature.hx"
				b = ( (( ( -254.769351841209016 + ( 0.8274096064007395 * b ) ) + ( 115.67994401066147 * java.lang.Math.log(b) ) )) / 255 );
				//line 63 "/shared/thx.color/src/thx/color/Temperature.hx"
				if (( b < 0 )) 
				{
					//line 63 "/shared/thx.color/src/thx/color/Temperature.hx"
					b = ((double) (0) );
				}
				
				//line 64 "/shared/thx.color/src/thx/color/Temperature.hx"
				if (( b > 1 )) 
				{
					//line 64 "/shared/thx.color/src/thx/color/Temperature.hx"
					b = ((double) (1) );
				}
				
			}
			
		}
		
		//line 67 "/shared/thx.color/src/thx/color/Temperature.hx"
		haxe.root.Array<java.lang.Object> this1 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (r) ), ((java.lang.Object) (g) ), ((java.lang.Object) (b) )});
		//line 67 "/shared/thx.color/src/thx/color/Temperature.hx"
		return ((haxe.root.Array<java.lang.Object>) (this1) );
	}
	
	
	public static double create(double v)
	{
		//line 71 "/shared/thx.color/src/thx/color/Temperature.hx"
		return ((double) (v) );
	}
	
	
	public static java.lang.Object fromString(java.lang.String color)
	{
		//line 74 "/shared/thx.color/src/thx/color/Temperature.hx"
		thx.color.parse.ColorInfo info = thx.color.parse.ColorParser.parseColor(color);
		//line 75 "/shared/thx.color/src/thx/color/Temperature.hx"
		if (( null == info )) 
		{
			//line 76 "/shared/thx.color/src/thx/color/Temperature.hx"
			return null;
		}
		
		//line 78 "/shared/thx.color/src/thx/color/Temperature.hx"
		try 
		{
			//line 78 "/shared/thx.color/src/thx/color/Temperature.hx"
			java.lang.String _g = info.name;
			//line 78 "/shared/thx.color/src/thx/color/Temperature.hx"
			{
				//line 78 "/shared/thx.color/src/thx/color/Temperature.hx"
				java.lang.String __temp_svar3 = (_g);
				//line 78 "/shared/thx.color/src/thx/color/Temperature.hx"
				boolean __temp_executeDef4 = true;
				//line 78 "/shared/thx.color/src/thx/color/Temperature.hx"
				switch (__temp_svar3.hashCode())
				{
					case 321701236:
					{
						//line 78 "/shared/thx.color/src/thx/color/Temperature.hx"
						if (__temp_svar3.equals("temperature")) 
						{
							//line 78 "/shared/thx.color/src/thx/color/Temperature.hx"
							__temp_executeDef4 = false;
							//line 78 "/shared/thx.color/src/thx/color/Temperature.hx"
							return ((double) (haxe.lang.Runtime.toDouble(thx.color.parse.ColorParser.getFloatChannels(info.channels, 1, false).__get(0))) );
						}
						
						//line 78 "/shared/thx.color/src/thx/color/Temperature.hx"
						break;
					}
					
					
				}
				
				//line 78 "/shared/thx.color/src/thx/color/Temperature.hx"
				if (__temp_executeDef4) 
				{
					//line 78 "/shared/thx.color/src/thx/color/Temperature.hx"
					return null;
				}
				else
				{
					//line 78 "/shared/thx.color/src/thx/color/Temperature.hx"
					throw null;
				}
				
			}
			
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 78 "/shared/thx.color/src/thx/color/Temperature.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 78 "/shared/thx.color/src/thx/color/Temperature.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 78 "/shared/thx.color/src/thx/color/Temperature.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 78 "/shared/thx.color/src/thx/color/Temperature.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 78 "/shared/thx.color/src/thx/color/Temperature.hx"
			{
				//line 78 "/shared/thx.color/src/thx/color/Temperature.hx"
				java.lang.Object e = __temp_catchall2;
				//line 78 "/shared/thx.color/src/thx/color/Temperature.hx"
				return null;
			}
			
		}
		
		
	}
	
	
	
	
	public static double _new(double kelvin)
	{
		//line 87 "/shared/thx.color/src/thx/color/Temperature.hx"
		return ((double) (kelvin) );
	}
	
	
	public static double interpolate(double this1, double other, double t)
	{
		//line 91 "/shared/thx.color/src/thx/color/Temperature.hx"
		return ((double) (thx.Floats.interpolate(t, ((double) (this1) ), ((double) (other) ))) );
	}
	
	
	public static double min(double this1, double other)
	{
		//line 94 "/shared/thx.color/src/thx/color/Temperature.hx"
		return ((double) (java.lang.Math.min(((double) (this1) ), ((double) (other) ))) );
	}
	
	
	public static double max(double this1, double other)
	{
		//line 97 "/shared/thx.color/src/thx/color/Temperature.hx"
		return ((double) (java.lang.Math.max(((double) (this1) ), ((double) (other) ))) );
	}
	
	
	public static double roundTo(double this1, int decimals)
	{
		//line 100 "/shared/thx.color/src/thx/color/Temperature.hx"
		return ((double) (thx.Floats.roundTo(((double) (this1) ), decimals)) );
	}
	
	
	public static java.lang.String toString(double this1)
	{
		//line 103 "/shared/thx.color/src/thx/color/Temperature.hx"
		return ( ( "temperature(" + haxe.lang.Runtime.toString(((double) (this1) )) ) + ")" );
	}
	
	
	public static boolean equals(double this1, double other)
	{
		//line 106 "/shared/thx.color/src/thx/color/Temperature.hx"
		return thx.Floats.nearEquals(this1, other, null);
	}
	
	
	public static boolean nearEquals(double this1, double other, java.lang.Object tolerance)
	{
		//line 109 "/shared/thx.color/src/thx/color/Temperature.hx"
		java.lang.Object __temp_tolerance140 = ( (haxe.lang.Runtime.eq(tolerance, null)) ? (((java.lang.Object) (1e-9) )) : (tolerance) );
		//line 109 "/shared/thx.color/src/thx/color/Temperature.hx"
		return thx.Floats.nearEquals(this1, ((double) (other) ), __temp_tolerance140);
	}
	
	
	public static double get_kelvin(double this1)
	{
		//line 112 "/shared/thx.color/src/thx/color/Temperature.hx"
		return this1;
	}
	
	
	public static haxe.root.Array<java.lang.Object> toLab(double this1)
	{
		//line 115 "/shared/thx.color/src/thx/color/Temperature.hx"
		return thx.color._Xyz.Xyz_Impl_.toLab(thx.color._Temperature.Temperature_Impl_.toXyz(this1));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toLCh(double this1)
	{
		//line 118 "/shared/thx.color/src/thx/color/Temperature.hx"
		return thx.color._Lab.Lab_Impl_.toLCh(thx.color._Temperature.Temperature_Impl_.toLab(this1));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toLuv(double this1)
	{
		//line 121 "/shared/thx.color/src/thx/color/Temperature.hx"
		return thx.color._Rgbx.Rgbx_Impl_.toLuv(thx.color._Temperature.Temperature_Impl_.toRgbx(this1));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toCmy(double this1)
	{
		//line 124 "/shared/thx.color/src/thx/color/Temperature.hx"
		return thx.color._Rgbx.Rgbx_Impl_.toCmy(thx.color._Temperature.Temperature_Impl_.toRgbx(this1));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toCmyk(double this1)
	{
		//line 127 "/shared/thx.color/src/thx/color/Temperature.hx"
		return thx.color._Rgbx.Rgbx_Impl_.toCmyk(thx.color._Temperature.Temperature_Impl_.toRgbx(this1));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toCubeHelix(double this1)
	{
		//line 130 "/shared/thx.color/src/thx/color/Temperature.hx"
		return thx.color._Rgbx.Rgbx_Impl_.toCubeHelixWithGamma(((haxe.root.Array<java.lang.Object>) (thx.color._Temperature.Temperature_Impl_.toRgbx(this1)) ), ((double) (1) ));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toHsl(double this1)
	{
		//line 133 "/shared/thx.color/src/thx/color/Temperature.hx"
		return thx.color._Rgbx.Rgbx_Impl_.toHsl(thx.color._Temperature.Temperature_Impl_.toRgbx(this1));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toHsv(double this1)
	{
		//line 136 "/shared/thx.color/src/thx/color/Temperature.hx"
		return thx.color._Rgbx.Rgbx_Impl_.toHsv(thx.color._Temperature.Temperature_Impl_.toRgbx(this1));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toHunterLab(double this1)
	{
		//line 139 "/shared/thx.color/src/thx/color/Temperature.hx"
		return thx.color._Xyz.Xyz_Impl_.toHunterLab(thx.color._Temperature.Temperature_Impl_.toXyz(this1));
	}
	
	
	public static int toRgb(double this1)
	{
		//line 142 "/shared/thx.color/src/thx/color/Temperature.hx"
		return thx.color._Rgbx.Rgbx_Impl_.toRgb(thx.color._Temperature.Temperature_Impl_.toRgbx(this1));
	}
	
	
	public static int toRgba(double this1)
	{
		//line 145 "/shared/thx.color/src/thx/color/Temperature.hx"
		return thx.color._Rgbxa.Rgbxa_Impl_.toRgba(thx.color._Temperature.Temperature_Impl_.toRgbxa(this1));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toRgbxTannerHelland(double this1)
	{
		//line 148 "/shared/thx.color/src/thx/color/Temperature.hx"
		double t = ( ((double) (this1) ) / 100 );
		//line 148 "/shared/thx.color/src/thx/color/Temperature.hx"
		double r = 0.0;
		//line 148 "/shared/thx.color/src/thx/color/Temperature.hx"
		double g = 0.0;
		//line 148 "/shared/thx.color/src/thx/color/Temperature.hx"
		double b = 0.0;
		//line 152 "/shared/thx.color/src/thx/color/Temperature.hx"
		if (( t <= 66 )) 
		{
			//line 153 "/shared/thx.color/src/thx/color/Temperature.hx"
			r = ((double) (1) );
		}
		else
		{
			//line 155 "/shared/thx.color/src/thx/color/Temperature.hx"
			r = ( t - 60 );
			//line 156 "/shared/thx.color/src/thx/color/Temperature.hx"
			r = ( ( 329.698727446 * java.lang.Math.pow(r, -0.1332047592) ) / 1 );
			//line 157 "/shared/thx.color/src/thx/color/Temperature.hx"
			if (( r < 0 )) 
			{
				//line 157 "/shared/thx.color/src/thx/color/Temperature.hx"
				r = ((double) (0) );
			}
			
			//line 158 "/shared/thx.color/src/thx/color/Temperature.hx"
			if (( r > 1 )) 
			{
				//line 158 "/shared/thx.color/src/thx/color/Temperature.hx"
				r = ((double) (1) );
			}
			
		}
		
		//line 162 "/shared/thx.color/src/thx/color/Temperature.hx"
		if (( t <= 66.0 )) 
		{
			//line 163 "/shared/thx.color/src/thx/color/Temperature.hx"
			g = t;
			//line 164 "/shared/thx.color/src/thx/color/Temperature.hx"
			g = ( (( ( 99.4708025861 * java.lang.Math.log(t) ) - 161.1195681661 )) / 1 );
			//line 165 "/shared/thx.color/src/thx/color/Temperature.hx"
			if (( g < 0 )) 
			{
				//line 165 "/shared/thx.color/src/thx/color/Temperature.hx"
				g = ((double) (0) );
			}
			
			//line 166 "/shared/thx.color/src/thx/color/Temperature.hx"
			if (( g > 1 )) 
			{
				//line 166 "/shared/thx.color/src/thx/color/Temperature.hx"
				g = ((double) (1) );
			}
			
		}
		else
		{
			//line 168 "/shared/thx.color/src/thx/color/Temperature.hx"
			g = ( t - 60.0 );
			//line 169 "/shared/thx.color/src/thx/color/Temperature.hx"
			g = ( ( 288.1221695283 * java.lang.Math.pow(g, -0.0755148492) ) / 1 );
			//line 170 "/shared/thx.color/src/thx/color/Temperature.hx"
			if (( g < 0 )) 
			{
				//line 170 "/shared/thx.color/src/thx/color/Temperature.hx"
				g = ((double) (0) );
			}
			
			//line 171 "/shared/thx.color/src/thx/color/Temperature.hx"
			if (( g > 1 )) 
			{
				//line 171 "/shared/thx.color/src/thx/color/Temperature.hx"
				g = ((double) (1) );
			}
			
		}
		
		//line 175 "/shared/thx.color/src/thx/color/Temperature.hx"
		if (( t >= 66.0 )) 
		{
			//line 176 "/shared/thx.color/src/thx/color/Temperature.hx"
			b = ((double) (1) );
		}
		else
		{
			//line 177 "/shared/thx.color/src/thx/color/Temperature.hx"
			if (( t <= 19.0 )) 
			{
				//line 178 "/shared/thx.color/src/thx/color/Temperature.hx"
				b = ((double) (0) );
			}
			else
			{
				//line 180 "/shared/thx.color/src/thx/color/Temperature.hx"
				b = ( t - 10 );
				//line 181 "/shared/thx.color/src/thx/color/Temperature.hx"
				b = ( (( ( 138.5177312231 * java.lang.Math.log(b) ) - 305.0447927307 )) / 1 );
				//line 182 "/shared/thx.color/src/thx/color/Temperature.hx"
				if (( b < 0 )) 
				{
					//line 182 "/shared/thx.color/src/thx/color/Temperature.hx"
					b = ((double) (0) );
				}
				
				//line 183 "/shared/thx.color/src/thx/color/Temperature.hx"
				if (( b > 1 )) 
				{
					//line 183 "/shared/thx.color/src/thx/color/Temperature.hx"
					b = ((double) (1) );
				}
				
			}
			
		}
		
		//line 185 "/shared/thx.color/src/thx/color/Temperature.hx"
		haxe.root.Array<java.lang.Object> this2 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (r) ), ((java.lang.Object) (g) ), ((java.lang.Object) (b) )});
		//line 185 "/shared/thx.color/src/thx/color/Temperature.hx"
		return ((haxe.root.Array<java.lang.Object>) (this2) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> toRgbx(double this1)
	{
		//line 189 "/shared/thx.color/src/thx/color/Temperature.hx"
		return thx.color._Temperature.Temperature_Impl_.temperatureToRgbx(this1);
	}
	
	
	public static haxe.root.Array<java.lang.Object> toRgbxa(double this1)
	{
		//line 192 "/shared/thx.color/src/thx/color/Temperature.hx"
		return thx.color._Rgbx.Rgbx_Impl_.toRgbxa(thx.color._Temperature.Temperature_Impl_.toRgbx(this1));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toYuv(double this1)
	{
		//line 195 "/shared/thx.color/src/thx/color/Temperature.hx"
		return thx.color._Rgbx.Rgbx_Impl_.toYuv(thx.color._Temperature.Temperature_Impl_.toRgbx(this1));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toXyz(double this1)
	{
		//line 198 "/shared/thx.color/src/thx/color/Temperature.hx"
		return thx.color._Rgbx.Rgbx_Impl_.toXyz(thx.color._Temperature.Temperature_Impl_.toRgbx(this1));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toYxy(double this1)
	{
		//line 201 "/shared/thx.color/src/thx/color/Temperature.hx"
		return thx.color._Rgbx.Rgbx_Impl_.toYxy(thx.color._Temperature.Temperature_Impl_.toRgbx(this1));
	}
	
	
}

