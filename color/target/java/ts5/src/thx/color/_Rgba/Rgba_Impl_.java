// Generated by Haxe 3.3.0
package thx.color._Rgba;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public final class Rgba_Impl_
{
	public static int create(int red, int green, int blue, int alpha)
	{
		//line 16 "/shared/color/src/thx/color/Rgba.hx"
		return ( ( ( ( (( red & 255 )) << 24 ) | ( (( green & 255 )) << 16 ) ) | ( (( blue & 255 )) << 8 ) ) | ( alpha & 255 ) );
	}
	
	
	public static int fromFloats(haxe.root.Array<java.lang.Object> arr)
	{
		//line 19 "/shared/color/src/thx/color/Rgba.hx"
		haxe.root.Array<java.lang.Object> ints = ((haxe.root.Array<java.lang.Object>) (((haxe.root.Array) (thx.ArrayFloats.resize(arr, 4, null).map(((haxe.lang.Function) (( (( thx.color._Rgba.Rgba_Impl__fromFloats_19__Fun.__hx_current != null )) ? (thx.color._Rgba.Rgba_Impl__fromFloats_19__Fun.__hx_current) : (thx.color._Rgba.Rgba_Impl__fromFloats_19__Fun.__hx_current = ((thx.color._Rgba.Rgba_Impl__fromFloats_19__Fun) (new thx.color._Rgba.Rgba_Impl__fromFloats_19__Fun()) )) )) ))) )) );
		//line 20 "/shared/color/src/thx/color/Rgba.hx"
		return ((int) (( ( ( ( (( ((int) (haxe.lang.Runtime.toInt(ints.__get(0))) ) & 255 )) << 24 ) | ( (( ((int) (haxe.lang.Runtime.toInt(ints.__get(1))) ) & 255 )) << 16 ) ) | ( (( ((int) (haxe.lang.Runtime.toInt(ints.__get(2))) ) & 255 )) << 8 ) ) | ( ((int) (haxe.lang.Runtime.toInt(ints.__get(3))) ) & 255 ) )) );
	}
	
	
	public static int fromInt(int rgba)
	{
		//line 24 "/shared/color/src/thx/color/Rgba.hx"
		return rgba;
	}
	
	
	public static int fromInts(haxe.root.Array<java.lang.Object> arr)
	{
		//line 27 "/shared/color/src/thx/color/Rgba.hx"
		thx.ArrayInts.resize(arr, 4, null);
		//line 28 "/shared/color/src/thx/color/Rgba.hx"
		return ((int) (( ( ( ( (( ((int) (haxe.lang.Runtime.toInt(arr.__get(0))) ) & 255 )) << 24 ) | ( (( ((int) (haxe.lang.Runtime.toInt(arr.__get(1))) ) & 255 )) << 16 ) ) | ( (( ((int) (haxe.lang.Runtime.toInt(arr.__get(2))) ) & 255 )) << 8 ) ) | ( ((int) (haxe.lang.Runtime.toInt(arr.__get(3))) ) & 255 ) )) );
	}
	
	
	public static java.lang.Object fromString(java.lang.String color)
	{
		//line 32 "/shared/color/src/thx/color/Rgba.hx"
		thx.color.parse.ColorInfo info = thx.color.parse.ColorParser.parseHex(color);
		//line 33 "/shared/color/src/thx/color/Rgba.hx"
		if (( null == info )) 
		{
			//line 34 "/shared/color/src/thx/color/Rgba.hx"
			info = thx.color.parse.ColorParser.parseColor(color);
		}
		
		//line 35 "/shared/color/src/thx/color/Rgba.hx"
		if (( null == info )) 
		{
			//line 36 "/shared/color/src/thx/color/Rgba.hx"
			return null;
		}
		
		//line 38 "/shared/color/src/thx/color/Rgba.hx"
		try 
		{
			//line 38 "/shared/color/src/thx/color/Rgba.hx"
			java.lang.String _g = info.name;
			//line 38 "/shared/color/src/thx/color/Rgba.hx"
			{
				//line 38 "/shared/color/src/thx/color/Rgba.hx"
				java.lang.String __temp_svar3 = (_g);
				//line 38 "/shared/color/src/thx/color/Rgba.hx"
				boolean __temp_executeDef4 = true;
				//line 38 "/shared/color/src/thx/color/Rgba.hx"
				switch (__temp_svar3.hashCode())
				{
					case 112845:
					{
						//line 38 "/shared/color/src/thx/color/Rgba.hx"
						if (__temp_svar3.equals("rgb")) 
						{
							//line 38 "/shared/color/src/thx/color/Rgba.hx"
							__temp_executeDef4 = false;
							//line 38 "/shared/color/src/thx/color/Rgba.hx"
							return thx.color._Rgb.Rgb_Impl_.toRgba(thx.color._Rgb.Rgb_Impl_.fromInts(thx.color.parse.ColorParser.getInt8Channels(info.channels, 3)));
						}
						
						//line 38 "/shared/color/src/thx/color/Rgba.hx"
						break;
					}
					
					
					case 3498292:
					{
						//line 38 "/shared/color/src/thx/color/Rgba.hx"
						if (__temp_svar3.equals("rgba")) 
						{
							//line 38 "/shared/color/src/thx/color/Rgba.hx"
							__temp_executeDef4 = false;
							//line 38 "/shared/color/src/thx/color/Rgba.hx"
							return ( ( ( ( (( thx.color.parse.ColorParser.getInt8Channel(info.channels.__get(0)) & 255 )) << 24 ) | ( (( thx.color.parse.ColorParser.getInt8Channel(info.channels.__get(1)) & 255 )) << 16 ) ) | ( (( thx.color.parse.ColorParser.getInt8Channel(info.channels.__get(2)) & 255 )) << 8 ) ) | ( ((int) (java.lang.Math.round(( thx.color.parse.ColorParser.getFloatChannel(info.channels.__get(3), null) * 255 ))) ) & 255 ) );
						}
						
						//line 38 "/shared/color/src/thx/color/Rgba.hx"
						break;
					}
					
					
				}
				
				//line 38 "/shared/color/src/thx/color/Rgba.hx"
				if (__temp_executeDef4) 
				{
					//line 38 "/shared/color/src/thx/color/Rgba.hx"
					return null;
				}
				else
				{
					//line 38 "/shared/color/src/thx/color/Rgba.hx"
					throw null;
				}
				
			}
			
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 38 "/shared/color/src/thx/color/Rgba.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 38 "/shared/color/src/thx/color/Rgba.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 38 "/shared/color/src/thx/color/Rgba.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 38 "/shared/color/src/thx/color/Rgba.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 38 "/shared/color/src/thx/color/Rgba.hx"
			{
				//line 38 "/shared/color/src/thx/color/Rgba.hx"
				java.lang.Object e = __temp_catchall2;
				//line 38 "/shared/color/src/thx/color/Rgba.hx"
				return null;
			}
			
		}
		
		
	}
	
	
	public static int _new(int rgba)
	{
		//line 53 "/shared/color/src/thx/color/Rgba.hx"
		return ((int) (rgba) );
	}
	
	
	
	
	
	
	
	
	
	
	public static int combineColor(int this1, int other)
	{
		//line 62 "/shared/color/src/thx/color/Rgba.hx"
		double a = ( ((double) ((( ((int) (this1) ) & 255 ))) ) / 255 );
		//line 63 "/shared/color/src/thx/color/Rgba.hx"
		return thx.color._Rgb.Rgb_Impl_.fromInts(new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((int) (java.lang.Math.round(( ( (( 1 - a )) * thx.color._Rgb.Rgb_Impl_.get_red(other) ) + ( a * (( ( ((int) (this1) ) >> 24 ) & 255 )) ) ))) ), ((int) (java.lang.Math.round(( ( (( 1 - a )) * thx.color._Rgb.Rgb_Impl_.get_green(other) ) + ( a * (( ( ((int) (this1) ) >> 16 ) & 255 )) ) ))) ), ((int) (java.lang.Math.round(( ( (( 1 - a )) * thx.color._Rgb.Rgb_Impl_.get_blue(other) ) + ( a * (( ( ((int) (this1) ) >> 8 ) & 255 )) ) ))) )}));
	}
	
	
	public static int darker(int this1, double t)
	{
		//line 71 "/shared/color/src/thx/color/Rgba.hx"
		return thx.color._Rgbxa.Rgbxa_Impl_.toRgba(thx.color._Rgbxa.Rgbxa_Impl_.darker(thx.color._Rgba.Rgba_Impl_.toRgbxa(this1), t));
	}
	
	
	public static int lighter(int this1, double t)
	{
		//line 74 "/shared/color/src/thx/color/Rgba.hx"
		return thx.color._Rgbxa.Rgbxa_Impl_.toRgba(thx.color._Rgbxa.Rgbxa_Impl_.lighter(thx.color._Rgba.Rgba_Impl_.toRgbxa(this1), t));
	}
	
	
	public static int transparent(int this1, double t)
	{
		//line 77 "/shared/color/src/thx/color/Rgba.hx"
		return thx.color._Rgbxa.Rgbxa_Impl_.toRgba(thx.color._Rgbxa.Rgbxa_Impl_.transparent(thx.color._Rgba.Rgba_Impl_.toRgbxa(this1), t));
	}
	
	
	public static int opaque(int this1, double t)
	{
		//line 80 "/shared/color/src/thx/color/Rgba.hx"
		return thx.color._Rgbxa.Rgbxa_Impl_.toRgba(thx.color._Rgbxa.Rgbxa_Impl_.opaque(thx.color._Rgba.Rgba_Impl_.toRgbxa(this1), t));
	}
	
	
	public static int interpolate(int this1, int other, double t)
	{
		//line 83 "/shared/color/src/thx/color/Rgba.hx"
		return thx.color._Rgbxa.Rgbxa_Impl_.toRgba(thx.color._Rgbxa.Rgbxa_Impl_.interpolate(thx.color._Rgba.Rgba_Impl_.toRgbxa(this1), thx.color._Rgba.Rgba_Impl_.toRgbxa(other), t));
	}
	
	
	public static int withAlpha(int this1, int newalpha)
	{
		//line 86 "/shared/color/src/thx/color/Rgba.hx"
		return thx.color._Rgba.Rgba_Impl_.fromInts(new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{( ( ((int) (this1) ) >> 24 ) & 255 ), ( ( ((int) (this1) ) >> 16 ) & 255 ), ( ( ((int) (this1) ) >> 8 ) & 255 ), newalpha}));
	}
	
	
	public static int withAlphaf(int this1, double newalpha)
	{
		//line 89 "/shared/color/src/thx/color/Rgba.hx"
		return thx.color._Rgba.Rgba_Impl_.fromInts(new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{( ( ((int) (this1) ) >> 24 ) & 255 ), ( ( ((int) (this1) ) >> 16 ) & 255 ), ( ( ((int) (this1) ) >> 8 ) & 255 ), ((int) (java.lang.Math.round(( 255 * newalpha ))) )}));
	}
	
	
	public static int withRed(int this1, int newred)
	{
		//line 92 "/shared/color/src/thx/color/Rgba.hx"
		return thx.color._Rgba.Rgba_Impl_.fromInts(new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{newred, ( ( ((int) (this1) ) >> 16 ) & 255 ), ( ( ((int) (this1) ) >> 8 ) & 255 )}));
	}
	
	
	public static int withGreen(int this1, int newgreen)
	{
		//line 95 "/shared/color/src/thx/color/Rgba.hx"
		return thx.color._Rgba.Rgba_Impl_.fromInts(new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{( ( ((int) (this1) ) >> 24 ) & 255 ), newgreen, ( ( ((int) (this1) ) >> 8 ) & 255 )}));
	}
	
	
	public static int withBlue(int this1, int newblue)
	{
		//line 98 "/shared/color/src/thx/color/Rgba.hx"
		return thx.color._Rgba.Rgba_Impl_.fromInts(new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{( ( ((int) (this1) ) >> 24 ) & 255 ), ( ( ((int) (this1) ) >> 16 ) & 255 ), newblue}));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toHsla(int this1)
	{
		//line 101 "/shared/color/src/thx/color/Rgba.hx"
		return thx.color._Rgbxa.Rgbxa_Impl_.toHsla(thx.color._Rgba.Rgba_Impl_.toRgbxa(this1));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toHsva(int this1)
	{
		//line 104 "/shared/color/src/thx/color/Rgba.hx"
		return thx.color._Rgbxa.Rgbxa_Impl_.toHsva(thx.color._Rgba.Rgba_Impl_.toRgbxa(this1));
	}
	
	
	public static int toRgb(int this1)
	{
		//line 107 "/shared/color/src/thx/color/Rgba.hx"
		int this2 = ( ( ( (( ( ( ((int) (this1) ) >> 24 ) & 255 ) & 255 )) << 16 ) | ( (( ( ( ((int) (this1) ) >> 16 ) & 255 ) & 255 )) << 8 ) ) | ( ( ( ((int) (this1) ) >> 8 ) & 255 ) & 255 ) );
		//line 107 "/shared/color/src/thx/color/Rgba.hx"
		return ((int) (this2) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> toRgbx(int this1)
	{
		//line 110 "/shared/color/src/thx/color/Rgba.hx"
		return thx.color._Rgbx.Rgbx_Impl_.fromInts(new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{( ( ((int) (this1) ) >> 24 ) & 255 ), ( ( ((int) (this1) ) >> 16 ) & 255 ), ( ( ((int) (this1) ) >> 8 ) & 255 )}));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toRgbxa(int this1)
	{
		//line 113 "/shared/color/src/thx/color/Rgba.hx"
		return thx.color._Rgbxa.Rgbxa_Impl_.fromInts(new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{( ( ((int) (this1) ) >> 24 ) & 255 ), ( ( ((int) (this1) ) >> 16 ) & 255 ), ( ( ((int) (this1) ) >> 8 ) & 255 ), ( ((int) (this1) ) & 255 )}));
	}
	
	
	public static java.lang.String toCss3(int this1)
	{
		//line 116 "/shared/color/src/thx/color/Rgba.hx"
		return ( "" + this1 );
	}
	
	
	public static java.lang.String toString(int this1)
	{
		//line 119 "/shared/color/src/thx/color/Rgba.hx"
		return ( ( ( ( ( ( ( ( "rgba(" + (( ( ((int) (this1) ) >> 24 ) & 255 )) ) + "," ) + (( ( ((int) (this1) ) >> 16 ) & 255 )) ) + "," ) + (( ( ((int) (this1) ) >> 8 ) & 255 )) ) + "," ) + haxe.lang.Runtime.toString(( ((double) ((( ((int) (this1) ) & 255 ))) ) / 255 )) ) + ")" );
	}
	
	
	public static java.lang.String toHex(int this1, java.lang.String prefix)
	{
		//line 122 "/shared/color/src/thx/color/Rgba.hx"
		if (( prefix == null )) 
		{
			//line 122 "/shared/color/src/thx/color/Rgba.hx"
			prefix = "#";
		}
		
		//line 122 "/shared/color/src/thx/color/Rgba.hx"
		return ( ( ( ( ( "" + prefix ) + haxe.root.StringTools.hex(( ((int) (this1) ) & 255 ), 2) ) + haxe.root.StringTools.hex(( ( ((int) (this1) ) >> 24 ) & 255 ), 2) ) + haxe.root.StringTools.hex(( ( ((int) (this1) ) >> 16 ) & 255 ), 2) ) + haxe.root.StringTools.hex(( ( ((int) (this1) ) >> 8 ) & 255 ), 2) );
	}
	
	
	public static boolean equals(int this1, int other)
	{
		//line 125 "/shared/color/src/thx/color/Rgba.hx"
		if (( ( ( (( ( ((int) (this1) ) >> 24 ) & 255 )) == (( ( ((int) (other) ) >> 24 ) & 255 )) ) && ( (( ((int) (this1) ) & 255 )) == (( ((int) (other) ) & 255 )) ) ) && ( (( ( ((int) (this1) ) >> 16 ) & 255 )) == (( ( ((int) (other) ) >> 16 ) & 255 )) ) )) 
		{
			//line 125 "/shared/color/src/thx/color/Rgba.hx"
			return ( (( ( ((int) (this1) ) >> 8 ) & 255 )) == (( ( ((int) (other) ) >> 8 ) & 255 )) );
		}
		else
		{
			//line 125 "/shared/color/src/thx/color/Rgba.hx"
			return false;
		}
		
	}
	
	
	public static int get_alpha(int this1)
	{
		//line 128 "/shared/color/src/thx/color/Rgba.hx"
		return ( this1 & 255 );
	}
	
	
	public static int get_red(int this1)
	{
		//line 130 "/shared/color/src/thx/color/Rgba.hx"
		return ( ( this1 >> 24 ) & 255 );
	}
	
	
	public static int get_green(int this1)
	{
		//line 132 "/shared/color/src/thx/color/Rgba.hx"
		return ( ( this1 >> 16 ) & 255 );
	}
	
	
	public static int get_blue(int this1)
	{
		//line 134 "/shared/color/src/thx/color/Rgba.hx"
		return ( ( this1 >> 8 ) & 255 );
	}
	
	
}

