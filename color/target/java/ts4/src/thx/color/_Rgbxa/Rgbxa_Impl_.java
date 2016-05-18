// Generated by Haxe 3.3.0
package thx.color._Rgbxa;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public final class Rgbxa_Impl_
{
	public static haxe.root.Array<java.lang.Object> create(double red, double green, double blue, double alpha)
	{
		//line 15 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		haxe.root.Array<java.lang.Object> this1 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (red) ), ((java.lang.Object) (green) ), ((java.lang.Object) (blue) ), ((java.lang.Object) (alpha) )});
		//line 15 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		return ((haxe.root.Array<java.lang.Object>) (this1) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> fromFloats(haxe.root.Array<java.lang.Object> arr)
	{
		//line 18 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		thx.ArrayFloats.resize(arr, 4, null);
		//line 19 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		haxe.root.Array<java.lang.Object> this1 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (((double) (haxe.lang.Runtime.toDouble(arr.__get(0))) )) ), ((java.lang.Object) (((double) (haxe.lang.Runtime.toDouble(arr.__get(1))) )) ), ((java.lang.Object) (((double) (haxe.lang.Runtime.toDouble(arr.__get(2))) )) ), ((java.lang.Object) (((double) (haxe.lang.Runtime.toDouble(arr.__get(3))) )) )});
		//line 19 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		return ((haxe.root.Array<java.lang.Object>) (this1) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> fromInts(haxe.root.Array<java.lang.Object> arr)
	{
		//line 23 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		thx.ArrayInts.resize(arr, 4, null);
		//line 24 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		haxe.root.Array<java.lang.Object> this1 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (( ((int) (haxe.lang.Runtime.toInt(arr.__get(0))) ) / 255.0 )) ), ((java.lang.Object) (( ((int) (haxe.lang.Runtime.toInt(arr.__get(1))) ) / 255.0 )) ), ((java.lang.Object) (( ((int) (haxe.lang.Runtime.toInt(arr.__get(2))) ) / 255.0 )) ), ((java.lang.Object) (( ((int) (haxe.lang.Runtime.toInt(arr.__get(3))) ) / 255.0 )) )});
		//line 24 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		return ((haxe.root.Array<java.lang.Object>) (this1) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> fromInt(int value)
	{
		//line 28 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		int rgba = value;
		//line 29 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		haxe.root.Array<java.lang.Object> this1 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (( ((double) ((( ( ((int) (rgba) ) >> 24 ) & 255 ))) ) / 255 )) ), ((java.lang.Object) (( ((double) ((( ( ((int) (rgba) ) >> 16 ) & 255 ))) ) / 255 )) ), ((java.lang.Object) (( ((double) ((( ( ((int) (rgba) ) >> 8 ) & 255 ))) ) / 255 )) ), ((java.lang.Object) (( ((double) ((( ((int) (rgba) ) & 255 ))) ) / 255 )) )});
		//line 29 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		return ((haxe.root.Array<java.lang.Object>) (this1) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> fromString(java.lang.String color)
	{
		//line 33 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		thx.color.parse.ColorInfo info = thx.color.parse.ColorParser.parseHex(color);
		//line 34 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		if (( null == info )) 
		{
			//line 35 "/shared/thx.color/src/thx/color/Rgbxa.hx"
			info = thx.color.parse.ColorParser.parseColor(color);
		}
		
		//line 36 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		if (( null == info )) 
		{
			//line 37 "/shared/thx.color/src/thx/color/Rgbxa.hx"
			return null;
		}
		
		//line 39 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		try 
		{
			//line 39 "/shared/thx.color/src/thx/color/Rgbxa.hx"
			java.lang.String _g = info.name;
			//line 39 "/shared/thx.color/src/thx/color/Rgbxa.hx"
			{
				//line 39 "/shared/thx.color/src/thx/color/Rgbxa.hx"
				java.lang.String __temp_svar3 = (_g);
				//line 39 "/shared/thx.color/src/thx/color/Rgbxa.hx"
				boolean __temp_executeDef4 = true;
				//line 39 "/shared/thx.color/src/thx/color/Rgbxa.hx"
				switch (__temp_svar3.hashCode())
				{
					case 112845:
					{
						//line 39 "/shared/thx.color/src/thx/color/Rgbxa.hx"
						if (__temp_svar3.equals("rgb")) 
						{
							//line 39 "/shared/thx.color/src/thx/color/Rgbxa.hx"
							__temp_executeDef4 = false;
							//line 39 "/shared/thx.color/src/thx/color/Rgbxa.hx"
							return thx.color._Rgbx.Rgbx_Impl_.toRgbxa(thx.color._Rgbx.Rgbx_Impl_.fromFloats(thx.color.parse.ColorParser.getFloatChannels(info.channels, 3, true)));
						}
						
						//line 39 "/shared/thx.color/src/thx/color/Rgbxa.hx"
						break;
					}
					
					
					case 3498292:
					{
						//line 39 "/shared/thx.color/src/thx/color/Rgbxa.hx"
						if (__temp_svar3.equals("rgba")) 
						{
							//line 39 "/shared/thx.color/src/thx/color/Rgbxa.hx"
							__temp_executeDef4 = false;
							//line 39 "/shared/thx.color/src/thx/color/Rgbxa.hx"
							return thx.color._Rgbxa.Rgbxa_Impl_.fromFloats(thx.color.parse.ColorParser.getFloatChannels(info.channels, 4, true));
						}
						
						//line 39 "/shared/thx.color/src/thx/color/Rgbxa.hx"
						break;
					}
					
					
				}
				
				//line 39 "/shared/thx.color/src/thx/color/Rgbxa.hx"
				if (__temp_executeDef4) 
				{
					//line 39 "/shared/thx.color/src/thx/color/Rgbxa.hx"
					return null;
				}
				else
				{
					//line 39 "/shared/thx.color/src/thx/color/Rgbxa.hx"
					throw null;
				}
				
			}
			
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 39 "/shared/thx.color/src/thx/color/Rgbxa.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 39 "/shared/thx.color/src/thx/color/Rgbxa.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 39 "/shared/thx.color/src/thx/color/Rgbxa.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 39 "/shared/thx.color/src/thx/color/Rgbxa.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 39 "/shared/thx.color/src/thx/color/Rgbxa.hx"
			{
				//line 39 "/shared/thx.color/src/thx/color/Rgbxa.hx"
				java.lang.Object e = __temp_catchall2;
				//line 39 "/shared/thx.color/src/thx/color/Rgbxa.hx"
				return null;
			}
			
		}
		
		
	}
	
	
	public static haxe.root.Array<java.lang.Object> _new(haxe.root.Array<java.lang.Object> channels)
	{
		//line 49 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		return ((haxe.root.Array<java.lang.Object>) (channels) );
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static haxe.root.Array<java.lang.Object> combineColor(haxe.root.Array<java.lang.Object> this1, haxe.root.Array<java.lang.Object> other)
	{
		//line 63 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		haxe.root.Array<java.lang.Object> this2 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (( ( (( 1 - ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(3))) ) )) * ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(0))) ) ) + ( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(3))) ) * ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) ) ) )) ), ((java.lang.Object) (( ( (( 1 - ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(3))) ) )) * ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(1))) ) ) + ( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(3))) ) * ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) ) ) )) ), ((java.lang.Object) (( ( (( 1 - ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(3))) ) )) * ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(2))) ) ) + ( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(3))) ) * ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) ) ) )) )});
		//line 63 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		return ((haxe.root.Array<java.lang.Object>) (this2) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> darker(haxe.root.Array<java.lang.Object> this1, double t)
	{
		//line 70 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		return thx.color._Rgbx.Rgbx_Impl_.withAlpha(thx.color._Rgbx.Rgbx_Impl_.darker(thx.color._Rgbxa.Rgbxa_Impl_.toRgbx(this1), t), ((double) (thx.color._Rgbxa.Rgbxa_Impl_.get_alpha(this1)) ));
	}
	
	
	public static haxe.root.Array<java.lang.Object> lighter(haxe.root.Array<java.lang.Object> this1, double t)
	{
		//line 73 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		return thx.color._Rgbx.Rgbx_Impl_.withAlpha(thx.color._Rgbx.Rgbx_Impl_.lighter(thx.color._Rgbxa.Rgbxa_Impl_.toRgbx(this1), t), ((double) (thx.color._Rgbxa.Rgbxa_Impl_.get_alpha(this1)) ));
	}
	
	
	public static haxe.root.Array<java.lang.Object> transparent(haxe.root.Array<java.lang.Object> this1, double t)
	{
		//line 76 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		return ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) )) ), ((java.lang.Object) (((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) )) ), ((java.lang.Object) (((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) )) ), ((java.lang.Object) (thx.Ints.interpolate(t, ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(3))) ), ((double) (0) ))) )})) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> opaque(haxe.root.Array<java.lang.Object> this1, double t)
	{
		//line 84 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		return ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) )) ), ((java.lang.Object) (((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) )) ), ((java.lang.Object) (((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) )) ), ((java.lang.Object) (thx.Ints.interpolate(t, ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(3))) ), ((double) (1) ))) )})) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> interpolate(haxe.root.Array<java.lang.Object> this1, haxe.root.Array<java.lang.Object> other, double t)
	{
		//line 92 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		return ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (thx.Ints.interpolate(t, ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) ), ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(0))) ))) ), ((java.lang.Object) (thx.Ints.interpolate(t, ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) ), ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(1))) ))) ), ((java.lang.Object) (thx.Ints.interpolate(t, ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) ), ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(2))) ))) ), ((java.lang.Object) (thx.Ints.interpolate(t, ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(3))) ), ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(3))) ))) )})) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> normalize(haxe.root.Array<java.lang.Object> this1)
	{
		//line 100 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		haxe.root.Array<java.lang.Object> this2 = null;
		//line 101 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		double v = ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) );
		//line 101 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		double tmp = ( (( v < 0 )) ? (((double) (0) )) : (( (( v > 1 )) ? (((double) (1) )) : (v) )) );
		//line 102 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		double v1 = ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) );
		//line 102 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		double tmp1 = ( (( v1 < 0 )) ? (((double) (0) )) : (( (( v1 > 1 )) ? (((double) (1) )) : (v1) )) );
		//line 103 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		double v2 = ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) );
		//line 103 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		double tmp2 = ( (( v2 < 0 )) ? (((double) (0) )) : (( (( v2 > 1 )) ? (((double) (1) )) : (v2) )) );
		//line 104 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		double v3 = ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(3))) );
		//line 100 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		this2 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (tmp) ), ((java.lang.Object) (tmp1) ), ((java.lang.Object) (tmp2) ), ((java.lang.Object) (( (( v3 < 0 )) ? (((double) (0) )) : (( (( v3 > 1 )) ? (((double) (1) )) : (v3) )) )) )});
		//line 100 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		return ((haxe.root.Array<java.lang.Object>) (this2) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> roundTo(haxe.root.Array<java.lang.Object> this1, int decimals)
	{
		//line 108 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		haxe.root.Array<java.lang.Object> this2 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (thx.Floats.roundTo(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) ), decimals)) ), ((java.lang.Object) (thx.Floats.roundTo(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) ), decimals)) ), ((java.lang.Object) (thx.Floats.roundTo(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) ), decimals)) ), ((java.lang.Object) (thx.Floats.roundTo(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(3))) ), decimals)) )});
		//line 108 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		return ((haxe.root.Array<java.lang.Object>) (this2) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> withAlpha(haxe.root.Array<java.lang.Object> this1, double newalpha)
	{
		//line 111 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		return ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (thx.color._Rgbxa.Rgbxa_Impl_.get_red(this1)) ), ((java.lang.Object) (thx.color._Rgbxa.Rgbxa_Impl_.get_green(this1)) ), ((java.lang.Object) (thx.color._Rgbxa.Rgbxa_Impl_.get_blue(this1)) ), ((java.lang.Object) (newalpha) )})) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> withRed(haxe.root.Array<java.lang.Object> this1, int newred)
	{
		//line 114 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		return ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (newred) ), ((java.lang.Object) (thx.color._Rgbxa.Rgbxa_Impl_.get_green(this1)) ), ((java.lang.Object) (thx.color._Rgbxa.Rgbxa_Impl_.get_blue(this1)) ), ((java.lang.Object) (thx.color._Rgbxa.Rgbxa_Impl_.get_alpha(this1)) )})) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> withGreen(haxe.root.Array<java.lang.Object> this1, int newgreen)
	{
		//line 117 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		return ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (thx.color._Rgbxa.Rgbxa_Impl_.get_red(this1)) ), ((java.lang.Object) (newgreen) ), ((java.lang.Object) (thx.color._Rgbxa.Rgbxa_Impl_.get_blue(this1)) ), ((java.lang.Object) (thx.color._Rgbxa.Rgbxa_Impl_.get_alpha(this1)) )})) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> withBlue(haxe.root.Array<java.lang.Object> this1, int newblue)
	{
		//line 120 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		return ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (thx.color._Rgbxa.Rgbxa_Impl_.get_red(this1)) ), ((java.lang.Object) (thx.color._Rgbxa.Rgbxa_Impl_.get_green(this1)) ), ((java.lang.Object) (newblue) ), ((java.lang.Object) (thx.color._Rgbxa.Rgbxa_Impl_.get_alpha(this1)) )})) );
	}
	
	
	public static java.lang.String toCss3(haxe.root.Array<java.lang.Object> this1)
	{
		//line 123 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		return thx.color._Rgbxa.Rgbxa_Impl_.toString(this1);
	}
	
	
	public static java.lang.String toString(haxe.root.Array<java.lang.Object> this1)
	{
		//line 126 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		return ( ( ( ( ( ( ( ( "rgba(" + haxe.lang.Runtime.toString(( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) ) * 100 )) ) + "%," ) + haxe.lang.Runtime.toString(( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) ) * 100 )) ) + "%," ) + haxe.lang.Runtime.toString(( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) ) * 100 )) ) + "%," ) + haxe.lang.Runtime.toString(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(3))) )) ) + ")" );
	}
	
	
	public static java.lang.String toHex(haxe.root.Array<java.lang.Object> this1, java.lang.String prefix)
	{
		//line 129 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		if (( prefix == null )) 
		{
			//line 129 "/shared/thx.color/src/thx/color/Rgbxa.hx"
			prefix = "#";
		}
		
		//line 129 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		return ( ( ( ( ( "" + prefix ) + haxe.root.StringTools.hex(thx.color._Rgbxa.Rgbxa_Impl_.get_alpha(this1), 2) ) + haxe.root.StringTools.hex(thx.color._Rgbxa.Rgbxa_Impl_.get_red(this1), 2) ) + haxe.root.StringTools.hex(thx.color._Rgbxa.Rgbxa_Impl_.get_green(this1), 2) ) + haxe.root.StringTools.hex(thx.color._Rgbxa.Rgbxa_Impl_.get_blue(this1), 2) );
	}
	
	
	public static boolean equals(haxe.root.Array<java.lang.Object> this1, haxe.root.Array<java.lang.Object> other)
	{
		//line 132 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		return thx.color._Rgbxa.Rgbxa_Impl_.nearEquals(this1, other, null);
	}
	
	
	public static boolean nearEquals(haxe.root.Array<java.lang.Object> this1, haxe.root.Array<java.lang.Object> other, java.lang.Object tolerance)
	{
		//line 135 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		java.lang.Object __temp_tolerance139 = ( (haxe.lang.Runtime.eq(tolerance, null)) ? (((java.lang.Object) (1e-9) )) : (tolerance) );
		//line 135 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		if (( ( thx.Floats.nearEquals(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) ), ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(0))) ), __temp_tolerance139) && thx.Floats.nearEquals(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) ), ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(1))) ), __temp_tolerance139) ) && thx.Floats.nearEquals(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) ), ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(2))) ), __temp_tolerance139) )) 
		{
			//line 135 "/shared/thx.color/src/thx/color/Rgbxa.hx"
			return thx.Floats.nearEquals(((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(3))) ), ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (other) ).__get(3))) ), __temp_tolerance139);
		}
		else
		{
			//line 135 "/shared/thx.color/src/thx/color/Rgbxa.hx"
			return false;
		}
		
	}
	
	
	public static haxe.root.Array<java.lang.Object> toHsla(haxe.root.Array<java.lang.Object> this1)
	{
		//line 138 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		return thx.color._Hsl.Hsl_Impl_.withAlpha(thx.color._Rgbx.Rgbx_Impl_.toHsl(thx.color._Rgbxa.Rgbxa_Impl_.toRgbx(this1)), ((double) (thx.color._Rgbxa.Rgbxa_Impl_.get_alpha(this1)) ));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toHsva(haxe.root.Array<java.lang.Object> this1)
	{
		//line 141 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		return thx.color._Hsv.Hsv_Impl_.withAlpha(thx.color._Rgbx.Rgbx_Impl_.toHsv(thx.color._Rgbxa.Rgbxa_Impl_.toRgbx(this1)), ((double) (thx.color._Rgbxa.Rgbxa_Impl_.get_alpha(this1)) ));
	}
	
	
	public static int toRgb(haxe.root.Array<java.lang.Object> this1)
	{
		//line 144 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		return thx.color._Rgbx.Rgbx_Impl_.toRgb(thx.color._Rgbxa.Rgbxa_Impl_.toRgbx(this1));
	}
	
	
	public static haxe.root.Array<java.lang.Object> toRgbx(haxe.root.Array<java.lang.Object> this1)
	{
		//line 147 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		return ((haxe.root.Array<java.lang.Object>) (((haxe.root.Array) (this1.slice(0, 3)) )) );
	}
	
	
	public static int toRgba(haxe.root.Array<java.lang.Object> this1)
	{
		//line 150 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		return thx.color._Rgba.Rgba_Impl_.fromFloats(new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) )) ), ((java.lang.Object) (((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) )) ), ((java.lang.Object) (((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) )) ), ((java.lang.Object) (((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(3))) )) )}));
	}
	
	
	public static int get_red(haxe.root.Array<java.lang.Object> this1)
	{
		//line 153 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		return ((int) (java.lang.Math.round(( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) ) * 255 ))) );
	}
	
	
	public static int get_green(haxe.root.Array<java.lang.Object> this1)
	{
		//line 155 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		return ((int) (java.lang.Math.round(( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) ) * 255 ))) );
	}
	
	
	public static int get_blue(haxe.root.Array<java.lang.Object> this1)
	{
		//line 157 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		return ((int) (java.lang.Math.round(( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) ) * 255 ))) );
	}
	
	
	public static int get_alpha(haxe.root.Array<java.lang.Object> this1)
	{
		//line 159 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		return ((int) (java.lang.Math.round(( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(3))) ) * 255 ))) );
	}
	
	
	public static double get_redf(haxe.root.Array<java.lang.Object> this1)
	{
		//line 162 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		return ((double) (haxe.lang.Runtime.toDouble(this1.__get(0))) );
	}
	
	
	public static double get_greenf(haxe.root.Array<java.lang.Object> this1)
	{
		//line 164 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		return ((double) (haxe.lang.Runtime.toDouble(this1.__get(1))) );
	}
	
	
	public static double get_bluef(haxe.root.Array<java.lang.Object> this1)
	{
		//line 166 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		return ((double) (haxe.lang.Runtime.toDouble(this1.__get(2))) );
	}
	
	
	public static double get_alphaf(haxe.root.Array<java.lang.Object> this1)
	{
		//line 168 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		return ((double) (haxe.lang.Runtime.toDouble(this1.__get(3))) );
	}
	
	
	public static boolean get_inSpace(haxe.root.Array<java.lang.Object> this1)
	{
		//line 171 "/shared/thx.color/src/thx/color/Rgbxa.hx"
		if (( ( ( ( ( ( ( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) ) >= 0 ) && ( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(0))) ) <= 1 ) ) && ( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) ) >= 0 ) ) && ( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(1))) ) <= 1 ) ) && ( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) ) >= 0 ) ) && ( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(2))) ) <= 1 ) ) && ( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(3))) ) >= 0 ) )) 
		{
			//line 171 "/shared/thx.color/src/thx/color/Rgbxa.hx"
			return ( ((double) (haxe.lang.Runtime.toDouble(((haxe.root.Array<java.lang.Object>) (this1) ).__get(3))) ) <= 1 );
		}
		else
		{
			//line 171 "/shared/thx.color/src/thx/color/Rgbxa.hx"
			return false;
		}
		
	}
	
	
}

