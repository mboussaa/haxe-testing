// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx.color._Hsla {
	public sealed class Hsla_Impl_ {
		
		
		
		
		
		
		
		
		
		public static global::Array<double> create(double hue, double saturation, double lightness, double alpha) {
			return ((global::Array<double>) (new global::Array<double>(new double[]{hue, saturation, lightness, alpha})) );
		}
		
		
		public static global::Array<double> fromFloats(global::Array<double> arr) {
			unchecked {
				global::thx.ArrayFloats.resize(arr, 4, default(global::haxe.lang.Null<double>));
				return ((global::Array<double>) (new global::Array<double>(new double[]{arr[0], arr[1], arr[2], arr[3]})) );
			}
		}
		
		
		public static global::Array<double> fromString(string color) {
			unchecked {
				global::thx.color.parse.ColorInfo info = global::thx.color.parse.ColorParser.parseColor(color);
				if (( null == info )) {
					return null;
				}
				
				try {
					switch (info.name) {
						case "hsl":
						{
							return global::thx.color._Hsl.Hsl_Impl_.toHsla(((global::Array<double>) (global::thx.color.parse.ColorParser.getFloatChannels(info.channels, 3, false)) ));
						}
						
						
						case "hsla":
						{
							return ((global::Array<double>) (global::thx.color.parse.ColorParser.getFloatChannels(info.channels, 4, false)) );
						}
						
						
						default:
						{
							return null;
						}
						
					}
					
				}
				catch (global::System.Exception __temp_catchallException1){
					global::haxe.lang.Exceptions.exception = __temp_catchallException1;
					object __temp_catchall2 = __temp_catchallException1;
					if (( __temp_catchall2 is global::haxe.lang.HaxeException )) {
						__temp_catchall2 = ((global::haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
					}
					
					{
						object e = __temp_catchall2;
						return null;
					}
					
				}
				
				
			}
		}
		
		
		public static global::Array<double> _new(global::Array<double> channels) {
			return ((global::Array<double>) (channels) );
		}
		
		
		public static object analogous(global::Array<double> this1, global::haxe.lang.Null<double> spread) {
			double __temp_spread142 = ( ( ! (spread.hasValue) ) ? (30.0) : ((spread).@value) );
			object __temp_stmt3 = null;
			{
				global::Array<double> __temp_odecl1 = global::thx.color._Hsla.Hsla_Impl_.rotate(this1,  - (__temp_spread142) );
				global::Array<double> __temp_odecl2 = global::thx.color._Hsla.Hsla_Impl_.rotate(this1, __temp_spread142);
				__temp_stmt3 = new global::haxe.lang.DynamicObject(new int[]{21233, 21234}, new object[]{__temp_odecl1, __temp_odecl2}, new int[]{}, new double[]{});
			}
			
			return ((object) (__temp_stmt3) );
		}
		
		
		public static global::Array<double> complement(global::Array<double> this1) {
			unchecked {
				return global::thx.color._Hsla.Hsla_Impl_.rotate(this1, ((double) (180) ));
			}
		}
		
		
		public static global::Array<double> darker(global::Array<double> this1, double t) {
			unchecked {
				return ((global::Array<double>) (new global::Array<double>(new double[]{((global::Array<double>) (this1) )[0], ((global::Array<double>) (this1) )[1], global::thx.Floats.interpolate(t, ((global::Array<double>) (this1) )[2], ((double) (0) )), ((global::Array<double>) (this1) )[3]})) );
			}
		}
		
		
		public static global::Array<double> lighter(global::Array<double> this1, double t) {
			unchecked {
				return ((global::Array<double>) (new global::Array<double>(new double[]{((global::Array<double>) (this1) )[0], ((global::Array<double>) (this1) )[1], global::thx.Floats.interpolate(t, ((global::Array<double>) (this1) )[2], ((double) (1) )), ((global::Array<double>) (this1) )[3]})) );
			}
		}
		
		
		public static global::Array<double> normalize(global::Array<double> this1) {
			unchecked {
				double hue = global::thx.Floats.wrapCircular(((global::Array<double>) (this1) )[0], ((double) (360) ));
				global::Array<double> this2 = null;
				double v = ((global::Array<double>) (this1) )[1];
				double tmp = ( (( v < 0 )) ? (((double) (0) )) : (( (( v > 1 )) ? (((double) (1) )) : (v) )) );
				double v1 = ((global::Array<double>) (this1) )[2];
				double tmp1 = ( (( v1 < 0 )) ? (((double) (0) )) : (( (( v1 > 1 )) ? (((double) (1) )) : (v1) )) );
				double v2 = ((global::Array<double>) (this1) )[3];
				this2 = new global::Array<double>(new double[]{hue, tmp, tmp1, ( (( v2 < 0 )) ? (((double) (0) )) : (( (( v2 > 1 )) ? (((double) (1) )) : (v2) )) )});
				return ((global::Array<double>) (this2) );
			}
		}
		
		
		public static global::Array<double> roundTo(global::Array<double> this1, int decimals) {
			unchecked {
				return ((global::Array<double>) (new global::Array<double>(new double[]{global::thx.Floats.roundTo(((global::Array<double>) (this1) )[0], decimals), global::thx.Floats.roundTo(((global::Array<double>) (this1) )[1], decimals), global::thx.Floats.roundTo(((global::Array<double>) (this1) )[2], decimals), global::thx.Floats.roundTo(((global::Array<double>) (this1) )[3], decimals)})) );
			}
		}
		
		
		public static global::Array<double> transparent(global::Array<double> this1, double t) {
			unchecked {
				return ((global::Array<double>) (new global::Array<double>(new double[]{((global::Array<double>) (this1) )[0], ((global::Array<double>) (this1) )[1], ((global::Array<double>) (this1) )[2], global::thx.Floats.interpolate(t, ((global::Array<double>) (this1) )[3], ((double) (0) ))})) );
			}
		}
		
		
		public static global::Array<double> opaque(global::Array<double> this1, double t) {
			unchecked {
				return ((global::Array<double>) (new global::Array<double>(new double[]{((global::Array<double>) (this1) )[0], ((global::Array<double>) (this1) )[1], ((global::Array<double>) (this1) )[2], global::thx.Floats.interpolate(t, ((global::Array<double>) (this1) )[3], ((double) (1) ))})) );
			}
		}
		
		
		public static global::Array<double> interpolate(global::Array<double> this1, global::Array<double> other, double t) {
			unchecked {
				return ((global::Array<double>) (new global::Array<double>(new double[]{global::thx.Floats.interpolateAngle(t, ((global::Array<double>) (this1) )[0], ((global::Array<double>) (other) )[0], default(global::haxe.lang.Null<double>)), global::thx.Floats.interpolate(t, ((global::Array<double>) (this1) )[1], ((global::Array<double>) (other) )[1]), global::thx.Floats.interpolate(t, ((global::Array<double>) (this1) )[2], ((global::Array<double>) (other) )[2]), global::thx.Floats.interpolate(t, ((global::Array<double>) (this1) )[3], ((global::Array<double>) (other) )[3])})) );
			}
		}
		
		
		public static global::Array<double> rotate(global::Array<double> this1, double angle) {
			unchecked {
				return ((global::Array<double>) (new global::Array<double>(new double[]{( ((global::Array<double>) (this1) )[0] + angle ), ((global::Array<double>) (this1) )[1], ((global::Array<double>) (this1) )[2], ((global::Array<double>) (this1) )[3]})) );
			}
		}
		
		
		public static object split(global::Array<double> this1, global::haxe.lang.Null<double> spread) {
			double __temp_spread143 = ( ( ! (spread.hasValue) ) ? (150.0) : ((spread).@value) );
			object __temp_stmt3 = null;
			{
				global::Array<double> __temp_odecl1 = global::thx.color._Hsla.Hsla_Impl_.rotate(this1,  - (__temp_spread143) );
				global::Array<double> __temp_odecl2 = global::thx.color._Hsla.Hsla_Impl_.rotate(this1, __temp_spread143);
				__temp_stmt3 = new global::haxe.lang.DynamicObject(new int[]{21233, 21234}, new object[]{__temp_odecl1, __temp_odecl2}, new int[]{}, new double[]{});
			}
			
			return ((object) (__temp_stmt3) );
		}
		
		
		public static global::Array<double> withAlpha(global::Array<double> this1, double newalpha) {
			unchecked {
				return ((global::Array<double>) (new global::Array<double>(new double[]{((global::Array<double>) (this1) )[0], ((global::Array<double>) (this1) )[1], ((global::Array<double>) (this1) )[2], newalpha})) );
			}
		}
		
		
		public static global::Array<double> withHue(global::Array<double> this1, double newhue) {
			unchecked {
				return ((global::Array<double>) (new global::Array<double>(new double[]{newhue, ((global::Array<double>) (this1) )[1], ((global::Array<double>) (this1) )[2], ((global::Array<double>) (this1) )[3]})) );
			}
		}
		
		
		public static global::Array<double> withLightness(global::Array<double> this1, double newlightness) {
			unchecked {
				return ((global::Array<double>) (new global::Array<double>(new double[]{((global::Array<double>) (this1) )[0], ((global::Array<double>) (this1) )[1], newlightness, ((global::Array<double>) (this1) )[3]})) );
			}
		}
		
		
		public static global::Array<double> withSaturation(global::Array<double> this1, double newsaturation) {
			unchecked {
				return ((global::Array<double>) (new global::Array<double>(new double[]{((global::Array<double>) (this1) )[0], newsaturation, ((global::Array<double>) (this1) )[2], ((global::Array<double>) (this1) )[3]})) );
			}
		}
		
		
		public static string toCss3(global::Array<double> this1) {
			return global::thx.color._Hsla.Hsla_Impl_.toString(this1);
		}
		
		
		public static string toString(global::Array<double> this1) {
			unchecked {
				return global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("hsla(", global::haxe.lang.Runtime.toString(((global::Array<double>) (this1) )[0])), ","), global::haxe.lang.Runtime.toString(( ((global::Array<double>) (this1) )[1] * 100 ))), "%,"), global::haxe.lang.Runtime.toString(( ((global::Array<double>) (this1) )[2] * 100 ))), "%,"), global::haxe.lang.Runtime.toString(((global::Array<double>) (this1) )[3])), ")");
			}
		}
		
		
		public static bool @equals(global::Array<double> this1, global::Array<double> other) {
			return global::thx.color._Hsla.Hsla_Impl_.nearEquals(this1, other, default(global::haxe.lang.Null<double>));
		}
		
		
		public static bool nearEquals(global::Array<double> this1, global::Array<double> other, global::haxe.lang.Null<double> tolerance) {
			unchecked {
				global::haxe.lang.Null<double> __temp_tolerance144 = ( ( ! (tolerance.hasValue) ) ? (new global::haxe.lang.Null<double>(1e-9, true)) : (tolerance) );
				if (( ( ( global::System.Math.Abs(((double) (global::thx.Floats.angleDifference(((global::Array<double>) (this1) )[0], ((global::Array<double>) (other) )[0], new global::haxe.lang.Null<double>(360.0, true))) )) <= (__temp_tolerance144).@value ) && global::thx.Floats.nearEquals(((global::Array<double>) (this1) )[1], ((global::Array<double>) (other) )[1], __temp_tolerance144) ) && global::thx.Floats.nearEquals(((global::Array<double>) (this1) )[2], ((global::Array<double>) (other) )[2], __temp_tolerance144) )) {
					return global::thx.Floats.nearEquals(((global::Array<double>) (this1) )[3], ((global::Array<double>) (other) )[3], __temp_tolerance144);
				}
				else {
					return false;
				}
				
			}
		}
		
		
		public static global::Array<double> toHsl(global::Array<double> this1) {
			unchecked {
				return ((global::Array<double>) (this1.slice(0, new global::haxe.lang.Null<int>(3, true))) );
			}
		}
		
		
		public static global::Array<double> toHsva(global::Array<double> this1) {
			return global::thx.color._Rgbxa.Rgbxa_Impl_.toHsva(global::thx.color._Hsla.Hsla_Impl_.toRgbxa(this1));
		}
		
		
		public static int toRgb(global::Array<double> this1) {
			return global::thx.color._Rgbxa.Rgbxa_Impl_.toRgb(global::thx.color._Hsla.Hsla_Impl_.toRgbxa(this1));
		}
		
		
		public static int toRgba(global::Array<double> this1) {
			return global::thx.color._Rgbxa.Rgbxa_Impl_.toRgba(global::thx.color._Hsla.Hsla_Impl_.toRgbxa(this1));
		}
		
		
		public static global::Array<double> toRgbxa(global::Array<double> this1) {
			unchecked {
				return ((global::Array<double>) (new global::Array<double>(new double[]{global::thx.color._Hsl.Hsl_Impl_._c(( ((global::Array<double>) (this1) )[0] + 120 ), ((global::Array<double>) (this1) )[1], ((global::Array<double>) (this1) )[2]), global::thx.color._Hsl.Hsl_Impl_._c(((global::Array<double>) (this1) )[0], ((global::Array<double>) (this1) )[1], ((global::Array<double>) (this1) )[2]), global::thx.color._Hsl.Hsl_Impl_._c(( ((global::Array<double>) (this1) )[0] - 120 ), ((global::Array<double>) (this1) )[1], ((global::Array<double>) (this1) )[2]), ((global::Array<double>) (this1) )[3]})) );
			}
		}
		
		
		public static double get_hue(global::Array<double> this1) {
			return this1[0];
		}
		
		
		public static double get_saturation(global::Array<double> this1) {
			unchecked {
				return this1[1];
			}
		}
		
		
		public static double get_lightness(global::Array<double> this1) {
			unchecked {
				return this1[2];
			}
		}
		
		
		public static double get_alpha(global::Array<double> this1) {
			unchecked {
				return this1[3];
			}
		}
		
		
	}
}


