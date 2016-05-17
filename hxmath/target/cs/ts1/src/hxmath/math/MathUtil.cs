// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace hxmath.math {
	public class MathUtil : global::haxe.lang.HxObject {
		
		static MathUtil() {
			global::hxmath.math.MathUtil.eps = 1e-6;
		}
		
		
		public MathUtil(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public MathUtil() {
			global::hxmath.math.MathUtil.__hx_ctor_hxmath_math_MathUtil(this);
		}
		
		
		public static void __hx_ctor_hxmath_math_MathUtil(global::hxmath.math.MathUtil __temp_me31) {
		}
		
		
		public static double eps;
		
		public static int intMax(int a, int b) {
			if (( b > a )) {
				return b;
			}
			else {
				return a;
			}
			
		}
		
		
		public static int intMin(int a, int b) {
			if (( b < a )) {
				return b;
			}
			else {
				return a;
			}
			
		}
		
		
		public static double lerpCyclic(double a, double b, double t, double max) {
			if (( global::System.Math.Abs(((double) (( a - b )) )) > ( 0.5 * max ) )) {
				if (( a < b )) {
					a += max;
				}
				else {
					b += max;
				}
				
			}
			
			double x = ( ( (( 1.0 - t )) * a ) + ( t * b ) );
			if (( x < 0 )) {
				return ( max - (  - (x)  % max ) );
			}
			else {
				return ( x % max );
			}
			
		}
		
		
		public static int sign(double x, global::haxe.lang.Null<double> w) {
			unchecked {
				double __temp_w30 = ( ( ! (w.hasValue) ) ? (((double) (0) )) : ((w).@value) );
				if (( global::System.Math.Abs(((double) (x) )) < __temp_w30 )) {
					return 0;
				}
				else if (( x <=  - (__temp_w30)  )) {
					return -1;
				}
				else {
					return 1;
				}
				
			}
		}
		
		
		public static double rangeDistance(double aStart, double aWidth, double bStart, double bWidth) {
			if (( ( aStart + aWidth ) < bStart )) {
				return ( bStart - (( aStart + aWidth )) );
			}
			else if (( ( bStart + bWidth ) < aStart )) {
				return ( aStart - (( bStart + bWidth )) );
			}
			else {
				return ((double) (0) );
			}
			
		}
		
		
		public static bool openRangeContains(double aStart, double aWidth, double x) {
			if (( x > aStart )) {
				return ( x < ( aStart + aWidth ) );
			}
			else {
				return false;
			}
			
		}
		
		
		public static bool openRangesIntersect(double aStart, double aWidth, double bStart, double bWidth) {
			return  ! ((( ( aStart >= ( bStart + bWidth ) ) || ( bStart >= ( aStart + aWidth ) ) ))) ;
		}
		
		
		public static bool closedRangeContains(double aStart, double aWidth, double x) {
			if (( x >= aStart )) {
				return ( x <= ( aStart + aWidth ) );
			}
			else {
				return false;
			}
			
		}
		
		
		public static double radToDeg(double rad) {
			unchecked {
				return ( ( 180 / global::Math.PI ) * rad );
			}
		}
		
		
		public static double degToRad(double deg) {
			unchecked {
				return ( ( global::Math.PI / 180 ) * deg );
			}
		}
		
		
		public static double wrap(double x, double n) {
			if (( x < 0 )) {
				return ( n - (  - (x)  % n ) );
			}
			else {
				return ( x % n );
			}
			
		}
		
		
		public static double clamp(double @value, double min, double max) {
			if (( @value < min )) {
				return min;
			}
			else if (( @value > max )) {
				return max;
			}
			else {
				return @value;
			}
			
		}
		
		
		public static int orient2d(global::hxmath.math.Vector2Default a, global::hxmath.math.Vector2Default b, global::hxmath.math.Vector2Default c) {
			unchecked {
				double result = ( ( (( a.x - c.x )) * (( b.y - c.y )) ) - ( (( a.y - c.y )) * (( b.x - c.x )) ) );
				if (( result > 0 )) {
					return ((int) (1) );
				}
				else if (( result < 0 )) {
					return ((int) (-1) );
				}
				else {
					return ((int) (0) );
				}
				
			}
		}
		
		
		public static double det2x2(double m00, double m10, double m01, double m11) {
			return ( ( m00 * m11 ) - ( m10 * m01 ) );
		}
		
		
		public static double det3x3(double m00, double m10, double m20, double m01, double m11, double m21, double m02, double m12, double m22) {
			return ( ( ( m00 * (( ( m11 * m22 ) - ( m21 * m12 ) )) ) - ( m10 * (( ( m01 * m22 ) - ( m21 * m02 ) )) ) ) + ( m20 * (( ( m01 * m12 ) - ( m11 * m02 ) )) ) );
		}
		
		
		public static double det4x4(double m00, double m10, double m20, double m30, double m01, double m11, double m21, double m31, double m02, double m12, double m22, double m32, double m03, double m13, double m23, double m33) {
			return ( ( ( ( m00 * (( ( ( m11 * (( ( m22 * m33 ) - ( m32 * m23 ) )) ) - ( m21 * (( ( m12 * m33 ) - ( m32 * m13 ) )) ) ) + ( m31 * (( ( m12 * m23 ) - ( m22 * m13 ) )) ) )) ) - ( m10 * (( ( ( m01 * (( ( m22 * m33 ) - ( m32 * m23 ) )) ) - ( m21 * (( ( m02 * m33 ) - ( m32 * m03 ) )) ) ) + ( m31 * (( ( m02 * m23 ) - ( m22 * m03 ) )) ) )) ) ) + ( m20 * (( ( ( m01 * (( ( m12 * m33 ) - ( m32 * m13 ) )) ) - ( m11 * (( ( m02 * m33 ) - ( m32 * m03 ) )) ) ) + ( m31 * (( ( m02 * m13 ) - ( m12 * m03 ) )) ) )) ) ) - ( m30 * (( ( ( m01 * (( ( m12 * m23 ) - ( m22 * m13 ) )) ) - ( m11 * (( ( m02 * m23 ) - ( m22 * m03 ) )) ) ) + ( m21 * (( ( m02 * m13 ) - ( m12 * m03 ) )) ) )) ) );
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::hxmath.math.MathUtil(global::haxe.lang.EmptyObject.EMPTY);
		}
		
		
		public static new object __hx_create(global::Array arr) {
			return new global::hxmath.math.MathUtil();
		}
		
		
	}
}


