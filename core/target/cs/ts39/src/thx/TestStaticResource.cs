// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class TestStaticResource : global::haxe.lang.HxObject {
		
		public TestStaticResource(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public TestStaticResource(int i) {
			global::thx.TestStaticResource.__hx_ctor_thx_TestStaticResource(this, i);
		}
		
		
		public static void __hx_ctor_thx_TestStaticResource(global::thx.TestStaticResource __temp_me38, int i) {
			__temp_me38.x = i;
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::thx.TestStaticResource(((global::haxe.lang.EmptyObject) (global::haxe.lang.EmptyObject.EMPTY) ));
		}
		
		
		public static new object __hx_create(global::Array arr) {
			return new global::thx.TestStaticResource(((int) (global::haxe.lang.Runtime.toInt(arr[0])) ));
		}
		
		
		public int x;
		
		public virtual void testBasics() {
			unchecked {
				int _g1 = 0;
				int _g = this.x;
				while (( _g1 < _g )) {
					 ++ _g1;
					global::utest.Assert.@equals(1, global::thx.ResourceTest.a, null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testBasics", "thx.TestStaticResource", "TestStaticResource.hx"}, new int[]{1981972957}, new double[]{((double) (13) )}));
					global::utest.Assert.notNull(global::thx.ResourceTest.b, null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testBasics", "thx.TestStaticResource", "TestStaticResource.hx"}, new int[]{1981972957}, new double[]{((double) (14) )}));
					global::utest.Assert.@equals("thx", global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(global::thx.ResourceTest.b, "s", 115, true)), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testBasics", "thx.TestStaticResource", "TestStaticResource.hx"}, new int[]{1981972957}, new double[]{((double) (15) )}));
					global::utest.Assert.isTrue(global::thx.ResourceTest.c, null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testBasics", "thx.TestStaticResource", "TestStaticResource.hx"}, new int[]{1981972957}, new double[]{((double) (16) )}));
					global::utest.Assert.@equals("haxe", global::thx.ResourceTest.d, null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testBasics", "thx.TestStaticResource", "TestStaticResource.hx"}, new int[]{1981972957}, new double[]{((double) (17) )}));
					global::utest.Assert.@equals("value", global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(global::thx.ResourceTest.fileJson, "some", 1280844532, true)), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testBasics", "thx.TestStaticResource", "TestStaticResource.hx"}, new int[]{1981972957}, new double[]{((double) (18) )}));
					global::utest.Assert.@equals("some text\n", global::thx.ResourceTest.fileText, null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testBasics", "thx.TestStaticResource", "TestStaticResource.hx"}, new int[]{1981972957}, new double[]{((double) (19) )}));
				}
				
			}
		}
		
		
		public virtual void testDir() {
			unchecked {
				int _g1 = 0;
				int _g = this.x;
				while (( _g1 < _g )) {
					 ++ _g1;
					global::utest.Assert.@equals("some text\n", global::thx.ResourceDir.text, null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testDir", "thx.TestStaticResource", "TestStaticResource.hx"}, new int[]{1981972957}, new double[]{((double) (24) )}));
					global::utest.Assert.@equals("value", global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(global::thx.ResourceDir.@object, "some", 1280844532, true)), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testDir", "thx.TestStaticResource", "TestStaticResource.hx"}, new int[]{1981972957}, new double[]{((double) (25) )}));
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
					case 1035643931:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testDir", 1035643931)) );
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
					case 1035643931:
					{
						this.testDir();
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



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class ResourceTest : global::haxe.lang.HxObject, global::thx.StaticResource {
		
		static ResourceTest() {
			unchecked {
				global::thx.ResourceTest.fileJson = new global::haxe.lang.DynamicObject(new int[]{1280844532}, new object[]{"value"}, new int[]{}, new double[]{});
				global::thx.ResourceTest.fileText = "some text\n";
				global::thx.ResourceTest.a = 1;
				global::thx.ResourceTest.b = new global::haxe.lang.DynamicObject(new int[]{115}, new object[]{"thx"}, new int[]{}, new double[]{});
				global::thx.ResourceTest.c = true;
				global::thx.ResourceTest.d = "haxe";
			}
		}
		
		
		public ResourceTest(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public ResourceTest() {
			global::thx.ResourceTest.__hx_ctor_thx_ResourceTest(this);
		}
		
		
		public static void __hx_ctor_thx_ResourceTest(global::thx.ResourceTest __temp_me39) {
		}
		
		
		public static object fileJson;
		
		public static string fileText;
		
		public static int a;
		
		public static object b;
		
		public static bool c;
		
		public static string d;
		
		public static new object __hx_createEmpty() {
			return new global::thx.ResourceTest(global::haxe.lang.EmptyObject.EMPTY);
		}
		
		
		public static new object __hx_create(global::Array arr) {
			return new global::thx.ResourceTest();
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class ResourceDir : global::haxe.lang.HxObject, global::thx.StaticResource {
		
		static ResourceDir() {
			global::thx.ResourceDir.text = "some text\n";
			global::thx.ResourceDir.@object = new global::haxe.lang.DynamicObject(new int[]{1280844532}, new object[]{"value"}, new int[]{}, new double[]{});
		}
		
		
		public ResourceDir(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public ResourceDir() {
			global::thx.ResourceDir.__hx_ctor_thx_ResourceDir(this);
		}
		
		
		public static void __hx_ctor_thx_ResourceDir(global::thx.ResourceDir __temp_me40) {
		}
		
		
		public static string text;
		
		public static object @object;
		
		public static new object __hx_createEmpty() {
			return new global::thx.ResourceDir(global::haxe.lang.EmptyObject.EMPTY);
		}
		
		
		public static new object __hx_create(global::Array arr) {
			return new global::thx.ResourceDir();
		}
		
		
	}
}

