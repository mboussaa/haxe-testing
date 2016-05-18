// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx.color {
	public class TestCmy : global::haxe.lang.HxObject {
		
		public TestCmy(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public TestCmy() {
			global::thx.color.TestCmy.__hx_ctor_thx_color_TestCmy(this);
		}
		
		
		public static void __hx_ctor_thx_color_TestCmy(global::thx.color.TestCmy __temp_me160) {
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::thx.color.TestCmy(global::haxe.lang.EmptyObject.EMPTY);
		}
		
		
		public static new object __hx_create(global::Array arr) {
			return new global::thx.color.TestCmy();
		}
		
		
		public virtual void testBasics() {
			unchecked {
				global::Array<double> color = ((global::Array<double>) (new global::Array<double>(new double[]{0.5, 0.5, 0.5})) );
				global::utest.Assert.@equals(0.5, ((global::Array<double>) (color) )[0], null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testBasics", "thx.color.TestCmy", "TestCmy.hx"}, new int[]{1981972957}, new double[]{((double) (10) )}));
				global::utest.Assert.@equals(0.5, ((global::Array<double>) (color) )[1], null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testBasics", "thx.color.TestCmy", "TestCmy.hx"}, new int[]{1981972957}, new double[]{((double) (11) )}));
				global::utest.Assert.@equals(0.5, ((global::Array<double>) (color) )[2], null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testBasics", "thx.color.TestCmy", "TestCmy.hx"}, new int[]{1981972957}, new double[]{((double) (12) )}));
				color = global::thx.color._Cmy.Cmy_Impl_.normalize(((global::Array<double>) (new global::Array<double>(new double[]{((double) (2) ), ((double) (-2) ), ((double) (2) )})) ));
				global::utest.Assert.@equals(1, ((global::Array<double>) (color) )[0], null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testBasics", "thx.color.TestCmy", "TestCmy.hx"}, new int[]{1981972957}, new double[]{((double) (15) )}));
				global::utest.Assert.@equals(0, ((global::Array<double>) (color) )[1], null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testBasics", "thx.color.TestCmy", "TestCmy.hx"}, new int[]{1981972957}, new double[]{((double) (16) )}));
				global::utest.Assert.@equals(1, ((global::Array<double>) (color) )[2], null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testBasics", "thx.color.TestCmy", "TestCmy.hx"}, new int[]{1981972957}, new double[]{((double) (17) )}));
			}
		}
		
		
		public virtual void testString() {
			unchecked {
				global::utest.Assert.@equals("cmy(0.5,0.5,0.5)", global::thx.color._Cmy.Cmy_Impl_.toString(((global::Array<double>) (new global::Array<double>(new double[]{0.5, 0.5, 0.5})) )), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testString", "thx.color.TestCmy", "TestCmy.hx"}, new int[]{1981972957}, new double[]{((double) (22) )}));
			}
		}
		
		
		public virtual void testParse() {
			unchecked {
				global::utest.Assert.@equals("cmy(0.5,0.5,0.5)", global::thx.color._Cmy.Cmy_Impl_.toString(global::thx.color._Cmy.Cmy_Impl_.fromString("cmy(0.5,0.5,0.5)")), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testParse", "thx.color.TestCmy", "TestCmy.hx"}, new int[]{1981972957}, new double[]{((double) (27) )}));
			}
		}
		
		
		public virtual void testFromFloat() {
			unchecked {
				global::utest.Assert.isTrue(global::thx.color._Cmy.Cmy_Impl_.@equals(global::thx.color._Cmy.Cmy_Impl_.fromString("cmy(0.5,0.5,0.5)"), global::thx.color._Cmy.Cmy_Impl_.fromFloats(new global::Array<double>(new double[]{0.5, 0.5, 0.5}))), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testFromFloat", "thx.color.TestCmy", "TestCmy.hx"}, new int[]{1981972957}, new double[]{((double) (33) )}));
			}
		}
		
		
		public override object __hx_getField(string field, int hash, bool throwErrors, bool isCheck, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 1784294688:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testFromFloat", 1784294688)) );
					}
					
					
					case 106417793:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testParse", 106417793)) );
					}
					
					
					case 707030723:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testString", 707030723)) );
					}
					
					
					case 1847555063:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testBasics", 1847555063)) );
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
					case 1784294688:
					{
						this.testFromFloat();
						break;
					}
					
					
					case 106417793:
					{
						this.testParse();
						break;
					}
					
					
					case 707030723:
					{
						this.testString();
						break;
					}
					
					
					case 1847555063:
					{
						this.testBasics();
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

