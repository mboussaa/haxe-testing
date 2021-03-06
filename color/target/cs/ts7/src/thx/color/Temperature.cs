// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx.color._Temperature {
	public sealed class Temperature_Impl_ {
		
		public static global::Array<double> temperatureToRgbx(double kelvin) {
			unchecked {
				double t = ( kelvin / 100.0 );
				double r = default(double);
				double g = default(double);
				double b = default(double);
				if (( t < 66.0 )) {
					r = ((double) (1) );
				}
				else {
					r = ( t - 55.0 );
					r = ( (( ( 351.97690566805693 + ( 0.114206453784165 * r ) ) - ( 40.25366309332127 * global::System.Math.Log(((double) (r) )) ) )) / 255 );
					if (( r < 0 )) {
						r = ((double) (0) );
					}
					
					if (( r > 1 )) {
						r = ((double) (1) );
					}
					
				}
				
				if (( t < 66.0 )) {
					g = ( t - 2 );
					g = ( (( ( -155.254855627091786 - ( 0.44596950469579133 * g ) ) + ( 104.49216199393888 * global::System.Math.Log(((double) (g) )) ) )) / 255 );
					if (( g < 0 )) {
						g = ((double) (0) );
					}
					
					if (( g > 1 )) {
						g = ((double) (1) );
					}
					
				}
				else {
					g = ( t - 50 );
					g = ( (( ( 325.4494125711974 + ( 0.07943456536662342 * g ) ) - ( 28.0852963507957 * global::System.Math.Log(((double) (g) )) ) )) / 255 );
					if (( g < 0 )) {
						g = ((double) (0) );
					}
					
					if (( g > 1 )) {
						g = ((double) (1) );
					}
					
				}
				
				if (( t >= 66.0 )) {
					b = ((double) (1) );
				}
				else if (( t <= 20.0 )) {
					b = ((double) (0) );
				}
				else {
					b = ( t - 10 );
					b = ( (( ( -254.769351841209016 + ( 0.8274096064007395 * b ) ) + ( 115.67994401066147 * global::System.Math.Log(((double) (b) )) ) )) / 255 );
					if (( b < 0 )) {
						b = ((double) (0) );
					}
					
					if (( b > 1 )) {
						b = ((double) (1) );
					}
					
				}
				
				return ((global::Array<double>) (new global::Array<double>(new double[]{r, g, b})) );
			}
		}
		
		
		public static double create(double v) {
			return ((double) (v) );
		}
		
		
		public static global::haxe.lang.Null<double> fromString(string color) {
			unchecked {
				global::thx.color.parse.ColorInfo info = global::thx.color.parse.ColorParser.parseColor(color);
				if (( null == info )) {
					return default(global::haxe.lang.Null<double>);
				}
				
				try {
					if (string.Equals(info.name, "temperature")) {
						return new global::haxe.lang.Null<double>(((double) (global::thx.color.parse.ColorParser.getFloatChannels(info.channels, 1, false)[0]) ), true);
					}
					else {
						return default(global::haxe.lang.Null<double>);
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
						return default(global::haxe.lang.Null<double>);
					}
					
				}
				
				
			}
		}
		
		
		
		
		public static double _new(double kelvin) {
			return ((double) (kelvin) );
		}
		
		
		public static double interpolate(double this1, double other, double t) {
			return ((double) (global::thx.Floats.interpolate(t, ((double) (this1) ), ((double) (other) ))) );
		}
		
		
		public static double min(double this1, double other) {
			return ((double) (global::System.Math.Min(((double) (this1) ), ((double) (other) ))) );
		}
		
		
		public static double max(double this1, double other) {
			return ((double) (global::System.Math.Max(((double) (this1) ), ((double) (other) ))) );
		}
		
		
		public static double roundTo(double this1, int decimals) {
			return ((double) (global::thx.Floats.roundTo(((double) (this1) ), decimals)) );
		}
		
		
		public static string toString(double this1) {
			return global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("temperature(", global::haxe.lang.Runtime.toString(((double) (this1) ))), ")");
		}
		
		
		public static bool @equals(double this1, double other) {
			return global::thx.Floats.nearEquals(this1, other, default(global::haxe.lang.Null<double>));
		}
		
		
		public static bool nearEquals(double this1, double other, global::haxe.lang.Null<double> tolerance) {
			global::haxe.lang.Null<double> __temp_tolerance159 = ( ( ! (tolerance.hasValue) ) ? (new global::haxe.lang.Null<double>(1e-9, true)) : (tolerance) );
			return global::thx.Floats.nearEquals(this1, ((double) (other) ), __temp_tolerance159);
		}
		
		
		public static double get_kelvin(double this1) {
			return this1;
		}
		
		
		public static global::Array<double> toLab(double this1) {
			return global::thx.color._Xyz.Xyz_Impl_.toLab(global::thx.color._Temperature.Temperature_Impl_.toXyz(this1));
		}
		
		
		public static global::Array<double> toLCh(double this1) {
			return global::thx.color._Lab.Lab_Impl_.toLCh(global::thx.color._Temperature.Temperature_Impl_.toLab(this1));
		}
		
		
		public static global::Array<double> toLuv(double this1) {
			return global::thx.color._Rgbx.Rgbx_Impl_.toLuv(global::thx.color._Temperature.Temperature_Impl_.toRgbx(this1));
		}
		
		
		public static global::Array<double> toCmy(double this1) {
			return global::thx.color._Rgbx.Rgbx_Impl_.toCmy(global::thx.color._Temperature.Temperature_Impl_.toRgbx(this1));
		}
		
		
		public static global::Array<double> toCmyk(double this1) {
			return global::thx.color._Rgbx.Rgbx_Impl_.toCmyk(global::thx.color._Temperature.Temperature_Impl_.toRgbx(this1));
		}
		
		
		public static global::Array<double> toCubeHelix(double this1) {
			unchecked {
				return global::thx.color._Rgbx.Rgbx_Impl_.toCubeHelixWithGamma(((global::Array<double>) (global::thx.color._Temperature.Temperature_Impl_.toRgbx(this1)) ), ((double) (1) ));
			}
		}
		
		
		public static global::Array<double> toHsl(double this1) {
			return global::thx.color._Rgbx.Rgbx_Impl_.toHsl(global::thx.color._Temperature.Temperature_Impl_.toRgbx(this1));
		}
		
		
		public static global::Array<double> toHsv(double this1) {
			return global::thx.color._Rgbx.Rgbx_Impl_.toHsv(global::thx.color._Temperature.Temperature_Impl_.toRgbx(this1));
		}
		
		
		public static global::Array<double> toHunterLab(double this1) {
			return global::thx.color._Xyz.Xyz_Impl_.toHunterLab(global::thx.color._Temperature.Temperature_Impl_.toXyz(this1));
		}
		
		
		public static int toRgb(double this1) {
			return global::thx.color._Rgbx.Rgbx_Impl_.toRgb(global::thx.color._Temperature.Temperature_Impl_.toRgbx(this1));
		}
		
		
		public static int toRgba(double this1) {
			return global::thx.color._Rgbxa.Rgbxa_Impl_.toRgba(global::thx.color._Temperature.Temperature_Impl_.toRgbxa(this1));
		}
		
		
		public static global::Array<double> toRgbxTannerHelland(double this1) {
			unchecked {
				double t = ( ((double) (this1) ) / 100 );
				double r = default(double);
				double g = default(double);
				double b = default(double);
				if (( t <= 66 )) {
					r = ((double) (1) );
				}
				else {
					r = ( t - 60 );
					r = ( ( 329.698727446 * global::System.Math.Pow(((double) (r) ), ((double) (-0.1332047592) )) ) / 1 );
					if (( r < 0 )) {
						r = ((double) (0) );
					}
					
					if (( r > 1 )) {
						r = ((double) (1) );
					}
					
				}
				
				if (( t <= 66.0 )) {
					g = t;
					g = ( (( ( 99.4708025861 * global::System.Math.Log(((double) (t) )) ) - 161.1195681661 )) / 1 );
					if (( g < 0 )) {
						g = ((double) (0) );
					}
					
					if (( g > 1 )) {
						g = ((double) (1) );
					}
					
				}
				else {
					g = ( t - 60.0 );
					g = ( ( 288.1221695283 * global::System.Math.Pow(((double) (g) ), ((double) (-0.0755148492) )) ) / 1 );
					if (( g < 0 )) {
						g = ((double) (0) );
					}
					
					if (( g > 1 )) {
						g = ((double) (1) );
					}
					
				}
				
				if (( t >= 66.0 )) {
					b = ((double) (1) );
				}
				else if (( t <= 19.0 )) {
					b = ((double) (0) );
				}
				else {
					b = ( t - 10 );
					b = ( (( ( 138.5177312231 * global::System.Math.Log(((double) (b) )) ) - 305.0447927307 )) / 1 );
					if (( b < 0 )) {
						b = ((double) (0) );
					}
					
					if (( b > 1 )) {
						b = ((double) (1) );
					}
					
				}
				
				return ((global::Array<double>) (new global::Array<double>(new double[]{r, g, b})) );
			}
		}
		
		
		public static global::Array<double> toRgbx(double this1) {
			return global::thx.color._Temperature.Temperature_Impl_.temperatureToRgbx(this1);
		}
		
		
		public static global::Array<double> toRgbxa(double this1) {
			return global::thx.color._Rgbx.Rgbx_Impl_.toRgbxa(global::thx.color._Temperature.Temperature_Impl_.toRgbx(this1));
		}
		
		
		public static global::Array<double> toYuv(double this1) {
			return global::thx.color._Rgbx.Rgbx_Impl_.toYuv(global::thx.color._Temperature.Temperature_Impl_.toRgbx(this1));
		}
		
		
		public static global::Array<double> toXyz(double this1) {
			return global::thx.color._Rgbx.Rgbx_Impl_.toXyz(global::thx.color._Temperature.Temperature_Impl_.toRgbx(this1));
		}
		
		
		public static global::Array<double> toYxy(double this1) {
			return global::thx.color._Rgbx.Rgbx_Impl_.toYxy(global::thx.color._Temperature.Temperature_Impl_.toRgbx(this1));
		}
		
		
	}
}


