// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class TestFloats : global::haxe.lang.HxObject {
		
		public TestFloats(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public TestFloats() {
			global::thx.TestFloats.__hx_ctor_thx_TestFloats(this);
		}
		
		
		public static void __hx_ctor_thx_TestFloats(global::thx.TestFloats __temp_me200) {
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::thx.TestFloats(global::haxe.lang.EmptyObject.EMPTY);
		}
		
		
		public static new object __hx_create(global::Array arr) {
			return new global::thx.TestFloats();
		}
		
		
		public virtual void testNormalize() {
			unchecked {
				global::utest.Assert.floatEquals(0.0, 0.0, default(global::haxe.lang.Null<double>), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testNormalize", "thx.TestFloats", "TestFloats.hx"}, new int[]{1981972957}, new double[]{((double) (16) )}));
				global::utest.Assert.floatEquals(1.0, 1.0, default(global::haxe.lang.Null<double>), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testNormalize", "thx.TestFloats", "TestFloats.hx"}, new int[]{1981972957}, new double[]{((double) (17) )}));
				global::utest.Assert.floatEquals(0.5, 0.5, default(global::haxe.lang.Null<double>), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testNormalize", "thx.TestFloats", "TestFloats.hx"}, new int[]{1981972957}, new double[]{((double) (18) )}));
				global::utest.Assert.floatEquals(0.0, ((double) (0) ), default(global::haxe.lang.Null<double>), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testNormalize", "thx.TestFloats", "TestFloats.hx"}, new int[]{1981972957}, new double[]{((double) (19) )}));
				global::utest.Assert.floatEquals(1.0, ((double) (1) ), default(global::haxe.lang.Null<double>), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testNormalize", "thx.TestFloats", "TestFloats.hx"}, new int[]{1981972957}, new double[]{((double) (20) )}));
			}
		}
		
		
		public virtual void testClamp() {
			unchecked {
				global::utest.Assert.floatEquals(((double) (10) ), ((double) (10) ), default(global::haxe.lang.Null<double>), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testClamp", "thx.TestFloats", "TestFloats.hx"}, new int[]{1981972957}, new double[]{((double) (24) )}));
				global::utest.Assert.floatEquals(((double) (10) ), ((double) (10) ), default(global::haxe.lang.Null<double>), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testClamp", "thx.TestFloats", "TestFloats.hx"}, new int[]{1981972957}, new double[]{((double) (25) )}));
				global::utest.Assert.floatEquals(((double) (50) ), ((double) (50) ), default(global::haxe.lang.Null<double>), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testClamp", "thx.TestFloats", "TestFloats.hx"}, new int[]{1981972957}, new double[]{((double) (26) )}));
				global::utest.Assert.floatEquals(((double) (100) ), ((double) (100) ), default(global::haxe.lang.Null<double>), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testClamp", "thx.TestFloats", "TestFloats.hx"}, new int[]{1981972957}, new double[]{((double) (27) )}));
				global::utest.Assert.floatEquals(((double) (100) ), ((double) (100) ), default(global::haxe.lang.Null<double>), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testClamp", "thx.TestFloats", "TestFloats.hx"}, new int[]{1981972957}, new double[]{((double) (28) )}));
			}
		}
		
		
		public virtual void testClampSym() {
			unchecked {
				double min = ((double) (-10) );
				double tmp = default(double);
				tmp = min;
				global::utest.Assert.floatEquals(((double) (-10) ), tmp, default(global::haxe.lang.Null<double>), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testClampSym", "thx.TestFloats", "TestFloats.hx"}, new int[]{1981972957}, new double[]{((double) (32) )}));
				double min1 = ((double) (-10) );
				double tmp1 = default(double);
				tmp1 = ((double) (10) );
				global::utest.Assert.floatEquals(((double) (10) ), tmp1, default(global::haxe.lang.Null<double>), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testClampSym", "thx.TestFloats", "TestFloats.hx"}, new int[]{1981972957}, new double[]{((double) (33) )}));
				double min2 = ((double) (-10) );
				double tmp2 = default(double);
				tmp2 = ((double) (0) );
				global::utest.Assert.floatEquals(((double) (0) ), tmp2, default(global::haxe.lang.Null<double>), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testClampSym", "thx.TestFloats", "TestFloats.hx"}, new int[]{1981972957}, new double[]{((double) (34) )}));
			}
		}
		
		
		public virtual void testCompare() {
			unchecked {
				global::utest.Assert.@equals(-1, -1, null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testCompare", "thx.TestFloats", "TestFloats.hx"}, new int[]{1981972957}, new double[]{((double) (38) )}));
				global::utest.Assert.@equals(-1, -1, null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testCompare", "thx.TestFloats", "TestFloats.hx"}, new int[]{1981972957}, new double[]{((double) (39) )}));
				global::utest.Assert.@equals(-1, -1, null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testCompare", "thx.TestFloats", "TestFloats.hx"}, new int[]{1981972957}, new double[]{((double) (40) )}));
				global::utest.Assert.@equals(-1, -1, null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testCompare", "thx.TestFloats", "TestFloats.hx"}, new int[]{1981972957}, new double[]{((double) (41) )}));
				double a =  - (global::Math.PI) ;
				double b = global::Math.PI;
				global::utest.Assert.@equals(-1, ( (( a < b )) ? (-1) : (( (( a > b )) ? (1) : (0) )) ), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testCompare", "thx.TestFloats", "TestFloats.hx"}, new int[]{1981972957}, new double[]{((double) (42) )}));
				global::utest.Assert.@equals(0, 0, null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testCompare", "thx.TestFloats", "TestFloats.hx"}, new int[]{1981972957}, new double[]{((double) (44) )}));
				global::utest.Assert.@equals(0, 0, null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testCompare", "thx.TestFloats", "TestFloats.hx"}, new int[]{1981972957}, new double[]{((double) (45) )}));
				global::utest.Assert.@equals(0, 0, null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testCompare", "thx.TestFloats", "TestFloats.hx"}, new int[]{1981972957}, new double[]{((double) (46) )}));
				double a1 = global::Math.PI;
				double b1 = global::Math.PI;
				global::utest.Assert.@equals(0, ( (( a1 < b1 )) ? (-1) : (( (( a1 > b1 )) ? (1) : (0) )) ), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testCompare", "thx.TestFloats", "TestFloats.hx"}, new int[]{1981972957}, new double[]{((double) (47) )}));
				global::utest.Assert.@equals(1, 1, null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testCompare", "thx.TestFloats", "TestFloats.hx"}, new int[]{1981972957}, new double[]{((double) (49) )}));
				global::utest.Assert.@equals(1, 1, null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testCompare", "thx.TestFloats", "TestFloats.hx"}, new int[]{1981972957}, new double[]{((double) (50) )}));
				global::utest.Assert.@equals(1, 1, null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testCompare", "thx.TestFloats", "TestFloats.hx"}, new int[]{1981972957}, new double[]{((double) (51) )}));
				double a2 = global::Math.PI;
				double b2 =  - (global::Math.PI) ;
				global::utest.Assert.@equals(1, ( (( a2 < b2 )) ? (-1) : (( (( a2 > b2 )) ? (1) : (0) )) ), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testCompare", "thx.TestFloats", "TestFloats.hx"}, new int[]{1981972957}, new double[]{((double) (52) )}));
			}
		}
		
		
		public virtual void testRound() {
			unchecked {
				global::utest.Assert.floatEquals(123.5, global::thx.Floats.roundTo(123.456, 1), default(global::haxe.lang.Null<double>), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testRound", "thx.TestFloats", "TestFloats.hx"}, new int[]{1981972957}, new double[]{((double) (57) )}));
				global::utest.Assert.floatEquals(123.46, global::thx.Floats.roundTo(123.456, 2), default(global::haxe.lang.Null<double>), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testRound", "thx.TestFloats", "TestFloats.hx"}, new int[]{1981972957}, new double[]{((double) (58) )}));
				global::utest.Assert.floatEquals(123.456, global::thx.Floats.roundTo(123.456, 3), default(global::haxe.lang.Null<double>), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testRound", "thx.TestFloats", "TestFloats.hx"}, new int[]{1981972957}, new double[]{((double) (59) )}));
				global::utest.Assert.floatEquals(123.456, global::thx.Floats.roundTo(123.456, 4), default(global::haxe.lang.Null<double>), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testRound", "thx.TestFloats", "TestFloats.hx"}, new int[]{1981972957}, new double[]{((double) (60) )}));
				global::utest.Assert.floatEquals(1234567890.1, global::thx.Floats.roundTo(1234567890.123456, 1), default(global::haxe.lang.Null<double>), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testRound", "thx.TestFloats", "TestFloats.hx"}, new int[]{1981972957}, new double[]{((double) (63) )}));
				global::utest.Assert.floatEquals(1234567890.12, global::thx.Floats.roundTo(1234567890.123456, 2), default(global::haxe.lang.Null<double>), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testRound", "thx.TestFloats", "TestFloats.hx"}, new int[]{1981972957}, new double[]{((double) (64) )}));
				global::utest.Assert.floatEquals(1234567890.123, global::thx.Floats.roundTo(1234567890.123456, 3), default(global::haxe.lang.Null<double>), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testRound", "thx.TestFloats", "TestFloats.hx"}, new int[]{1981972957}, new double[]{((double) (65) )}));
				global::utest.Assert.floatEquals(1234567890.1235, global::thx.Floats.roundTo(1234567890.123456, 4), default(global::haxe.lang.Null<double>), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testRound", "thx.TestFloats", "TestFloats.hx"}, new int[]{1981972957}, new double[]{((double) (66) )}));
			}
		}
		
		
		public virtual void testAngleDifference() {
			unchecked {
				global::Array<object> tests = new global::Array<object>(new object[]{new global::haxe.lang.DynamicObject(new int[]{}, new object[]{}, new int[]{97, 98, 100}, new double[]{((double) (30) ), ((double) (60) ), ((double) (30) )}), new global::haxe.lang.DynamicObject(new int[]{}, new object[]{}, new int[]{97, 98, 100}, new double[]{((double) (60) ), ((double) (30) ), ((double) (-30) )}), new global::haxe.lang.DynamicObject(new int[]{}, new object[]{}, new int[]{97, 98, 100}, new double[]{((double) (0) ), ((double) (190) ), ((double) (-170) )}), new global::haxe.lang.DynamicObject(new int[]{}, new object[]{}, new int[]{97, 98, 100}, new double[]{((double) (190) ), ((double) (0) ), ((double) (170) )}), new global::haxe.lang.DynamicObject(new int[]{}, new object[]{}, new int[]{97, 98, 100}, new double[]{((double) (400) ), ((double) (40) ), ((double) (0) )}), new global::haxe.lang.DynamicObject(new int[]{}, new object[]{}, new int[]{97, 98, 100}, new double[]{((double) (760) ), ((double) (40) ), ((double) (0) )})});
				{
					int _g = 0;
					while (( _g < tests.length )) {
						object test = tests[_g];
						 ++ _g;
						double d = global::thx.Floats.angleDifference(((double) (((int) (global::haxe.lang.Runtime.getField_f(test, "a", 97, true)) )) ), ((double) (((int) (global::haxe.lang.Runtime.getField_f(test, "b", 98, true)) )) ), default(global::haxe.lang.Null<double>));
						global::utest.Assert.@equals(((int) (global::haxe.lang.Runtime.getField_f(test, "d", 100, true)) ), d, global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("expected distance between ", global::haxe.lang.Runtime.toString(((int) (global::haxe.lang.Runtime.getField_f(test, "a", 97, true)) ))), " and "), global::haxe.lang.Runtime.toString(((int) (global::haxe.lang.Runtime.getField_f(test, "b", 98, true)) ))), " to be "), global::haxe.lang.Runtime.toString(((int) (global::haxe.lang.Runtime.getField_f(test, "d", 100, true)) ))), " but it is "), global::haxe.lang.Runtime.toString(d)), new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testAngleDifference", "thx.TestFloats", "TestFloats.hx"}, new int[]{1981972957}, new double[]{((double) (81) )}));
					}
					
				}
				
			}
		}
		
		
		public virtual void testInterpolateAngle() {
			unchecked {
				global::Array<object> tests = new global::Array<object>(new object[]{new global::haxe.lang.DynamicObject(new int[]{}, new object[]{}, new int[]{97, 98, 108, 115, 22196, 4945367}, new double[]{((double) (30) ), ((double) (330) ), ((double) (180) ), ((double) (0) ), ((double) (180) ), ((double) (0) )}), new global::haxe.lang.DynamicObject(new int[]{}, new object[]{}, new int[]{97, 98, 108, 115, 22196, 4945367}, new double[]{((double) (330) ), ((double) (30) ), ((double) (180) ), ((double) (0) ), ((double) (0) ), ((double) (180) )}), new global::haxe.lang.DynamicObject(new int[]{}, new object[]{}, new int[]{97, 98, 108, 115, 22196, 4945367}, new double[]{((double) (30) ), ((double) (120) ), ((double) (255) ), ((double) (75) ), ((double) (75) ), ((double) (255) )}), new global::haxe.lang.DynamicObject(new int[]{}, new object[]{}, new int[]{97, 98, 108, 115, 22196, 4945367}, new double[]{((double) (120) ), ((double) (30) ), ((double) (255) ), ((double) (75) ), ((double) (255) ), ((double) (75) )}), new global::haxe.lang.DynamicObject(new int[]{}, new object[]{}, new int[]{97, 98, 108, 115, 22196, 4945367}, new double[]{((double) (0) ), ((double) (180) ), ((double) (270) ), ((double) (90) ), ((double) (90) ), ((double) (270) )}), new global::haxe.lang.DynamicObject(new int[]{}, new object[]{}, new int[]{97, 98, 108, 115, 22196, 4945367}, new double[]{((double) (180) ), ((double) (0) ), ((double) (90) ), ((double) (270) ), ((double) (270) ), ((double) (90) )}), new global::haxe.lang.DynamicObject(new int[]{}, new object[]{}, new int[]{97, 98, 108, 115, 22196, 4945367}, new double[]{((double) (10) ), ((double) (200) ), ((double) (105) ), ((double) (285) ), ((double) (105) ), ((double) (285) )}), new global::haxe.lang.DynamicObject(new int[]{}, new object[]{}, new int[]{97, 98, 108, 115, 22196, 4945367}, new double[]{((double) (200) ), ((double) (10) ), ((double) (105) ), ((double) (285) ), ((double) (285) ), ((double) (105) )}), new global::haxe.lang.DynamicObject(new int[]{}, new object[]{}, new int[]{97, 98, 108, 115, 22196, 4945367}, new double[]{((double) (170) ), ((double) (340) ), ((double) (75) ), ((double) (255) ), ((double) (255) ), ((double) (75) )}), new global::haxe.lang.DynamicObject(new int[]{}, new object[]{}, new int[]{97, 98, 108, 115, 22196, 4945367}, new double[]{((double) (340) ), ((double) (170) ), ((double) (75) ), ((double) (255) ), ((double) (75) ), ((double) (255) )}), new global::haxe.lang.DynamicObject(new int[]{}, new object[]{}, new int[]{97, 98, 108, 115, 22196, 4945367}, new double[]{((double) (190) ), ((double) (350) ), ((double) (90) ), ((double) (270) ), ((double) (270) ), ((double) (90) )}), new global::haxe.lang.DynamicObject(new int[]{}, new object[]{}, new int[]{97, 98, 108, 115, 22196, 4945367}, new double[]{((double) (350) ), ((double) (190) ), ((double) (90) ), ((double) (270) ), ((double) (90) ), ((double) (270) )}), new global::haxe.lang.DynamicObject(new int[]{}, new object[]{}, new int[]{97, 98, 108, 115, 22196, 4945367}, new double[]{((double) (160) ), ((double) (350) ), ((double) (255) ), ((double) (75) ), ((double) (255) ), ((double) (75) )}), new global::haxe.lang.DynamicObject(new int[]{}, new object[]{}, new int[]{97, 98, 108, 115, 22196, 4945367}, new double[]{((double) (350) ), ((double) (160) ), ((double) (255) ), ((double) (75) ), ((double) (75) ), ((double) (255) )})});
				{
					int _g = 0;
					while (( _g < tests.length )) {
						object test = tests[_g];
						 ++ _g;
						double r = global::thx.Floats.interpolateAngle(0.5, ((double) (((int) (global::haxe.lang.Runtime.getField_f(test, "a", 97, true)) )) ), ((double) (((int) (global::haxe.lang.Runtime.getField_f(test, "b", 98, true)) )) ), default(global::haxe.lang.Null<double>));
						global::utest.Assert.@equals(((int) (global::haxe.lang.Runtime.getField_f(test, "s", 115, true)) ), r, global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("circular interpolation (shortest) at 50% between ", global::haxe.lang.Runtime.toString(((int) (global::haxe.lang.Runtime.getField_f(test, "a", 97, true)) ))), " and "), global::haxe.lang.Runtime.toString(((int) (global::haxe.lang.Runtime.getField_f(test, "b", 98, true)) ))), " should be "), global::haxe.lang.Runtime.toString(((int) (global::haxe.lang.Runtime.getField_f(test, "s", 115, true)) ))), " but it is "), global::haxe.lang.Runtime.toString(r)), new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testInterpolateAngle", "thx.TestFloats", "TestFloats.hx"}, new int[]{1981972957}, new double[]{((double) (111) )}));
						r = global::thx.Floats.interpolateAngleWidest(0.5, ((double) (((int) (global::haxe.lang.Runtime.getField_f(test, "a", 97, true)) )) ), ((double) (((int) (global::haxe.lang.Runtime.getField_f(test, "b", 98, true)) )) ), default(global::haxe.lang.Null<double>));
						global::utest.Assert.@equals(((int) (global::haxe.lang.Runtime.getField_f(test, "l", 108, true)) ), r, global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("circular interpolation (longest) at 50% between ", global::haxe.lang.Runtime.toString(((int) (global::haxe.lang.Runtime.getField_f(test, "a", 97, true)) ))), " and "), global::haxe.lang.Runtime.toString(((int) (global::haxe.lang.Runtime.getField_f(test, "b", 98, true)) ))), " should be "), global::haxe.lang.Runtime.toString(((int) (global::haxe.lang.Runtime.getField_f(test, "l", 108, true)) ))), " but it is "), global::haxe.lang.Runtime.toString(r)), new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testInterpolateAngle", "thx.TestFloats", "TestFloats.hx"}, new int[]{1981972957}, new double[]{((double) (114) )}));
						r = global::thx.Floats.interpolateAngleCW(0.5, ((double) (((int) (global::haxe.lang.Runtime.getField_f(test, "a", 97, true)) )) ), ((double) (((int) (global::haxe.lang.Runtime.getField_f(test, "b", 98, true)) )) ), default(global::haxe.lang.Null<double>));
						global::utest.Assert.@equals(((int) (global::haxe.lang.Runtime.getField_f(test, "cw", 22196, true)) ), r, global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("circular interpolation CW at 50% between ", global::haxe.lang.Runtime.toString(((int) (global::haxe.lang.Runtime.getField_f(test, "a", 97, true)) ))), " and "), global::haxe.lang.Runtime.toString(((int) (global::haxe.lang.Runtime.getField_f(test, "b", 98, true)) ))), " should be "), global::haxe.lang.Runtime.toString(((int) (global::haxe.lang.Runtime.getField_f(test, "cw", 22196, true)) ))), " but it is "), global::haxe.lang.Runtime.toString(r)), new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testInterpolateAngle", "thx.TestFloats", "TestFloats.hx"}, new int[]{1981972957}, new double[]{((double) (117) )}));
						r = global::thx.Floats.interpolateAngleCCW(0.5, ((double) (((int) (global::haxe.lang.Runtime.getField_f(test, "a", 97, true)) )) ), ((double) (((int) (global::haxe.lang.Runtime.getField_f(test, "b", 98, true)) )) ), default(global::haxe.lang.Null<double>));
						global::utest.Assert.@equals(((int) (global::haxe.lang.Runtime.getField_f(test, "ccw", 4945367, true)) ), r, global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("circular interpolation CCW at 50% between ", global::haxe.lang.Runtime.toString(((int) (global::haxe.lang.Runtime.getField_f(test, "a", 97, true)) ))), " and "), global::haxe.lang.Runtime.toString(((int) (global::haxe.lang.Runtime.getField_f(test, "b", 98, true)) ))), " should be "), global::haxe.lang.Runtime.toString(((int) (global::haxe.lang.Runtime.getField_f(test, "ccw", 4945367, true)) ))), " but it is "), global::haxe.lang.Runtime.toString(r)), new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testInterpolateAngle", "thx.TestFloats", "TestFloats.hx"}, new int[]{1981972957}, new double[]{((double) (120) )}));
					}
					
				}
				
			}
		}
		
		
		public override object __hx_getField(string field, int hash, bool throwErrors, bool isCheck, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 739961796:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testInterpolateAngle", 739961796)) );
					}
					
					
					case 2101966206:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testAngleDifference", 2101966206)) );
					}
					
					
					case 912799388:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testRound", 912799388)) );
					}
					
					
					case 1077020275:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testCompare", 1077020275)) );
					}
					
					
					case 1915348798:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testClampSym", 1915348798)) );
					}
					
					
					case 291156297:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testClamp", 291156297)) );
					}
					
					
					case 1591456987:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testNormalize", 1591456987)) );
					}
					
					
					default:
					{
						return base.__hx_getField(field, hash, throwErrors, isCheck, handleProperties);
					}
					
				}
				
			}
		}
		
		
		public override object __hx_invokeField(string field, int hash, global::Array dynargs) {
			unchecked {
				switch (hash) {
					case 739961796:
					{
						this.testInterpolateAngle();
						break;
					}
					
					
					case 2101966206:
					{
						this.testAngleDifference();
						break;
					}
					
					
					case 912799388:
					{
						this.testRound();
						break;
					}
					
					
					case 1077020275:
					{
						this.testCompare();
						break;
					}
					
					
					case 1915348798:
					{
						this.testClampSym();
						break;
					}
					
					
					case 291156297:
					{
						this.testClamp();
						break;
					}
					
					
					case 1591456987:
					{
						this.testNormalize();
						break;
					}
					
					
					default:
					{
						return base.__hx_invokeField(field, hash, dynargs);
					}
					
				}
				
				return null;
			}
		}
		
		
	}
}

