// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx.color {
	public class TestLCh : global::haxe.lang.HxObject {
		
		public TestLCh(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public TestLCh(int i) {
			global::thx.color.TestLCh.__hx_ctor_thx_color_TestLCh(this, i);
		}
		
		
		public static void __hx_ctor_thx_color_TestLCh(global::thx.color.TestLCh __temp_me160, int i) {
			__temp_me160.x = i;
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::thx.color.TestLCh(((global::haxe.lang.EmptyObject) (global::haxe.lang.EmptyObject.EMPTY) ));
		}
		
		
		public static new object __hx_create(global::Array arr) {
			return new global::thx.color.TestLCh(((int) (global::haxe.lang.Runtime.toInt(arr[0])) ));
		}
		
		
		public int x;
		
		public virtual void testBasics() {
			unchecked {
				int _g1 = 0;
				int _g = this.x;
				while (( _g1 < _g )) {
					 ++ _g1;
					global::Array<double> color = global::thx.color._LCh.LCh_Impl_.normalize(((global::Array<double>) (new global::Array<double>(new double[]{0.5, 0.4, ((double) (-10) )})) ));
					global::utest.Assert.@equals(0.5, ((global::Array<double>) (color) )[0], null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testBasics", "thx.color.TestLCh", "TestLCh.hx"}, new int[]{1981972957}, new double[]{((double) (14) )}));
					global::utest.Assert.@equals(0.4, ((global::Array<double>) (color) )[1], null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testBasics", "thx.color.TestLCh", "TestLCh.hx"}, new int[]{1981972957}, new double[]{((double) (15) )}));
					global::utest.Assert.@equals(350, ((global::Array<double>) (color) )[2], null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testBasics", "thx.color.TestLCh", "TestLCh.hx"}, new int[]{1981972957}, new double[]{((double) (16) )}));
				}
				
			}
		}
		
		
		public virtual void testString() {
			unchecked {
				int _g1 = 0;
				int _g = this.x;
				while (( _g1 < _g )) {
					 ++ _g1;
					global::utest.Assert.@equals("lch(0.5,0.4,350)", global::thx.color._LCh.LCh_Impl_.toString(global::thx.color._LCh.LCh_Impl_.normalize(((global::Array<double>) (new global::Array<double>(new double[]{0.5, 0.4, ((double) (-10) )})) ))), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testString", "thx.color.TestLCh", "TestLCh.hx"}, new int[]{1981972957}, new double[]{((double) (22) )}));
				}
				
			}
		}
		
		
		public virtual void testParse() {
			unchecked {
				int _g1 = 0;
				int _g = this.x;
				while (( _g1 < _g )) {
					 ++ _g1;
					global::utest.Assert.@equals("lch(100,10,-10)", global::thx.color._LCh.LCh_Impl_.toString(global::thx.color._LCh.LCh_Impl_.fromString("cielch(100,10,-10)")), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testParse", "thx.color.TestLCh", "TestLCh.hx"}, new int[]{1981972957}, new double[]{((double) (28) )}));
				}
				
			}
		}
		
		
		public virtual void testFromFloat() {
			unchecked {
				int _g1 = 0;
				int _g = this.x;
				while (( _g1 < _g )) {
					 ++ _g1;
					global::utest.Assert.isTrue(global::thx.color._LCh.LCh_Impl_.@equals(global::thx.color._LCh.LCh_Impl_.fromString("cielch(100,10,-10)"), global::thx.color._LCh.LCh_Impl_.fromFloats(new global::Array<double>(new double[]{100.0, 10.0, -10.0}))), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testFromFloat", "thx.color.TestLCh", "TestLCh.hx"}, new int[]{1981972957}, new double[]{((double) (35) )}));
				}
				
			}
		}
		
		
		public override double __hx_setField_f(string field, int hash, double @value, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 120:
					{
						this.x = ((int) (@value) );
						return @value;
					}
					
					
					default:
					{
						return base.__hx_setField_f(field, hash, @value, handleProperties);
					}
					
				}
				
			}
		}
		
		
		public override object __hx_setField(string field, int hash, object @value, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 120:
					{
						this.x = ((int) (global::haxe.lang.Runtime.toInt(@value)) );
						return @value;
					}
					
					
					default:
					{
						return base.__hx_setField(field, hash, @value, handleProperties);
					}
					
				}
				
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
					
					
					case 120:
					{
						return this.x;
					}
					
					
					default:
					{
						return base.__hx_getField(field, hash, throwErrors, isCheck, handleProperties);
					}
					
				}
				
			}
		}
		
		
		public override double __hx_getField_f(string field, int hash, bool throwErrors, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 120:
					{
						return ((double) (this.x) );
					}
					
					
					default:
					{
						return base.__hx_getField_f(field, hash, throwErrors, handleProperties);
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
		
		
		public override void __hx_getFields(global::Array<object> baseArr) {
			baseArr.push("x");
			{
				base.__hx_getFields(baseArr);
			}
			
		}
		
		
	}
}

