// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class TestEnums : global::haxe.lang.HxObject {
		
		public TestEnums(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public TestEnums(int i) {
			global::thx.TestEnums.__hx_ctor_thx_TestEnums(this, i);
		}
		
		
		public static void __hx_ctor_thx_TestEnums(global::thx.TestEnums __temp_me131, int i) {
			__temp_me131.x = i;
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::thx.TestEnums(((global::haxe.lang.EmptyObject) (global::haxe.lang.EmptyObject.EMPTY) ));
		}
		
		
		public static new object __hx_create(global::Array arr) {
			return new global::thx.TestEnums(((int) (global::haxe.lang.Runtime.toInt(arr[0])) ));
		}
		
		
		public int x;
		
		public virtual void testIssue20151201() {
			unchecked {
				int _g1 = 0;
				int _g = this.x;
				while (( _g1 < _g )) {
					 ++ _g1;
					string s = global::thx.Enums.@string<object>(((object) (global::thx.Enum20151201.Test(new global::haxe.lang.DynamicObject(new int[]{422635611, 824807522}, new object[]{"2", "1"}, new int[]{}, new double[]{}))) ));
					global::utest.Assert.stringContains("oldId : \"1\"", s, null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testIssue20151201", "thx.TestEnums", "TestEnums.hx"}, new int[]{1981972957}, new double[]{((double) (20) )}));
					global::utest.Assert.stringContains("newId : \"2\"", s, null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testIssue20151201", "thx.TestEnums", "TestEnums.hx"}, new int[]{1981972957}, new double[]{((double) (21) )}));
					global::utest.Assert.stringContains(", ", s, null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testIssue20151201", "thx.TestEnums", "TestEnums.hx"}, new int[]{1981972957}, new double[]{((double) (22) )}));
					global::utest.Assert.isTrue(s.StartsWith("Test({"), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testIssue20151201", "thx.TestEnums", "TestEnums.hx"}, new int[]{1981972957}, new double[]{((double) (23) )}));
					global::utest.Assert.isTrue(s.EndsWith("})"), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testIssue20151201", "thx.TestEnums", "TestEnums.hx"}, new int[]{1981972957}, new double[]{((double) (24) )}));
				}
				
			}
		}
		
		
		public virtual void testCompare() {
			unchecked {
				int _g1 = 0;
				int _g = this.x;
				while (( _g1 < _g )) {
					 ++ _g1;
					global::utest.Assert.same(new global::Array<object>(new object[]{global::thx._TestEnums.Sample.A, global::thx._TestEnums.Sample.B(1), global::thx._TestEnums.Sample.B(2)}), global::thx.Arrays.order<object>(((global::Array<object>) (new global::Array<object>(new object[]{global::thx._TestEnums.Sample.B(2), global::thx._TestEnums.Sample.A, global::thx._TestEnums.Sample.B(1)})) ), ((global::haxe.lang.Function) (new global::haxe.lang.Closure(typeof(global::thx.Enums), "compare", 57219237)) )), default(global::haxe.lang.Null<bool>), null, default(global::haxe.lang.Null<double>), new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testCompare", "thx.TestEnums", "TestEnums.hx"}, new int[]{1981972957}, new double[]{((double) (29) )}));
				}
				
			}
		}
		
		
		public virtual void testString() {
			unchecked {
				int _g1 = 0;
				int _g = this.x;
				while (( _g1 < _g )) {
					 ++ _g1;
					global::utest.Assert.@equals("A", global::thx.Enums.@string<object>(((object) (global::thx._TestEnums.Sample.A) )), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testString", "thx.TestEnums", "TestEnums.hx"}, new int[]{1981972957}, new double[]{((double) (39) )}));
					global::utest.Assert.@equals("B(1)", global::thx.Enums.@string<object>(((object) (global::thx._TestEnums.Sample.B(1)) )), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testString", "thx.TestEnums", "TestEnums.hx"}, new int[]{1981972957}, new double[]{((double) (40) )}));
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
					case 707030723:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testString", 707030723)) );
					}
					
					
					case 1077020275:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testCompare", 1077020275)) );
					}
					
					
					case 809821035:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testIssue20151201", 809821035)) );
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
					case 707030723:
					{
						this.testString();
						break;
					}
					
					
					case 1077020275:
					{
						this.testCompare();
						break;
					}
					
					
					case 809821035:
					{
						this.testIssue20151201();
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
namespace thx._TestEnums {
	public class Sample : global::haxe.lang.ParamEnum {
		
		public Sample(int index, object[] @params) : base(index, @params) {
		}
		
		
		public static readonly string[] __hx_constructs = new string[]{"A", "B"};
		
		public static readonly global::thx._TestEnums.Sample A = new global::thx._TestEnums.Sample(0, null);
		
		public static global::thx._TestEnums.Sample B(int v) {
			unchecked {
				return new global::thx._TestEnums.Sample(1, new object[]{v});
			}
		}
		
		
		public override string getTag() {
			return global::thx._TestEnums.Sample.__hx_constructs[this.index];
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class Enum20151201 : global::haxe.lang.ParamEnum {
		
		public Enum20151201(int index, object[] @params) : base(index, @params) {
		}
		
		
		public static readonly string[] __hx_constructs = new string[]{"Test", "None"};
		
		public static global::thx.Enum20151201 Test(object obj) {
			return new global::thx.Enum20151201(0, new object[]{obj});
		}
		
		
		public static readonly global::thx.Enum20151201 None = new global::thx.Enum20151201(1, null);
		
		public override string getTag() {
			return global::thx.Enum20151201.__hx_constructs[this.index];
		}
		
		
	}
}

