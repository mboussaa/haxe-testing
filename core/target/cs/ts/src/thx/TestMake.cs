// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class TestMake : global::haxe.lang.HxObject {
		
		public TestMake(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public TestMake() {
			global::thx.TestMake.__hx_ctor_thx_TestMake(this);
		}
		
		
		public static void __hx_ctor_thx_TestMake(global::thx.TestMake __temp_me211) {
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::thx.TestMake(global::haxe.lang.EmptyObject.EMPTY);
		}
		
		
		public static new object __hx_create(global::Array arr) {
			return new global::thx.TestMake();
		}
		
		
		public virtual void testConstructorLiteral() {
			unchecked {
				global::utest.Assert.same(new global::haxe.lang.DynamicObject(new int[]{99, 100}, new object[]{"A", "D"}, new int[]{97, 98}, new double[]{0.2, ((double) (1) )}), ((object) ((( (( global::thx.TestMake_testConstructorLiteral_9__Fun.__hx_current != null )) ? (global::thx.TestMake_testConstructorLiteral_9__Fun.__hx_current) : (global::thx.TestMake_testConstructorLiteral_9__Fun.__hx_current = ((global::thx.TestMake_testConstructorLiteral_9__Fun) (new global::thx.TestMake_testConstructorLiteral_9__Fun()) )) )).__hx_invoke4_o(default(double), "A", ((double) (1) ), global::haxe.lang.Runtime.undefined, 0.2, global::haxe.lang.Runtime.undefined, default(double), "D")) ), default(global::haxe.lang.Null<bool>), null, default(global::haxe.lang.Null<double>), new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testConstructorLiteral", "thx.TestMake", "TestMake.hx"}, new int[]{1981972957}, new double[]{((double) (10) )}));
			}
		}
		
		
		public virtual void testConstructorFromTypedef() {
			unchecked {
				global::utest.Assert.same(new global::haxe.lang.DynamicObject(new int[]{99, 100}, new object[]{"A", "D"}, new int[]{97, 98}, new double[]{0.2, ((double) (1) )}), ((object) ((( (( global::thx.TestMake_testConstructorFromTypedef_19__Fun.__hx_current != null )) ? (global::thx.TestMake_testConstructorFromTypedef_19__Fun.__hx_current) : (global::thx.TestMake_testConstructorFromTypedef_19__Fun.__hx_current = ((global::thx.TestMake_testConstructorFromTypedef_19__Fun) (new global::thx.TestMake_testConstructorFromTypedef_19__Fun()) )) )).__hx_invoke4_o(default(double), "A", ((double) (1) ), global::haxe.lang.Runtime.undefined, 0.2, global::haxe.lang.Runtime.undefined, default(double), "D")) ), default(global::haxe.lang.Null<bool>), null, default(global::haxe.lang.Null<double>), new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testConstructorFromTypedef", "thx.TestMake", "TestMake.hx"}, new int[]{1981972957}, new double[]{((double) (20) )}));
			}
		}
		
		
		public override object __hx_getField(string field, int hash, bool throwErrors, bool isCheck, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 2021219865:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testConstructorFromTypedef", 2021219865)) );
					}
					
					
					case 199688327:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testConstructorLiteral", 199688327)) );
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
					case 2021219865:
					{
						this.testConstructorFromTypedef();
						break;
					}
					
					
					case 199688327:
					{
						this.testConstructorLiteral();
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



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class TestMake_testConstructorLiteral_9__Fun : global::haxe.lang.Function {
		
		public TestMake_testConstructorLiteral_9__Fun() : base(4, 0) {
		}
		
		
		public static global::thx.TestMake_testConstructorLiteral_9__Fun __hx_current;
		
		public override object __hx_invoke4_o(double __fn_float1, object __fn_dyn1, double __fn_float2, object __fn_dyn2, double __fn_float3, object __fn_dyn3, double __fn_float4, object __fn_dyn4) {
			string d = ( (( __fn_dyn4 == global::haxe.lang.Runtime.undefined )) ? (global::haxe.lang.Runtime.toString(__fn_float4)) : (global::haxe.lang.Runtime.toString(__fn_dyn4)) );
			double a = ( (( __fn_dyn3 == global::haxe.lang.Runtime.undefined )) ? (((double) (__fn_float3) )) : (((double) (global::haxe.lang.Runtime.toDouble(__fn_dyn3)) )) );
			int b = ( (( __fn_dyn2 == global::haxe.lang.Runtime.undefined )) ? (((int) (__fn_float2) )) : (((int) (global::haxe.lang.Runtime.toInt(__fn_dyn2)) )) );
			string c = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (global::haxe.lang.Runtime.toString(__fn_float1)) : (global::haxe.lang.Runtime.toString(__fn_dyn1)) );
			return new global::haxe.lang.DynamicObject(new int[]{99, 100}, new object[]{c, d}, new int[]{97, 98}, new double[]{a, ((double) (b) )});
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class TestMake_testConstructorFromTypedef_19__Fun : global::haxe.lang.Function {
		
		public TestMake_testConstructorFromTypedef_19__Fun() : base(4, 0) {
		}
		
		
		public static global::thx.TestMake_testConstructorFromTypedef_19__Fun __hx_current;
		
		public override object __hx_invoke4_o(double __fn_float1, object __fn_dyn1, double __fn_float2, object __fn_dyn2, double __fn_float3, object __fn_dyn3, double __fn_float4, object __fn_dyn4) {
			string d = ( (( __fn_dyn4 == global::haxe.lang.Runtime.undefined )) ? (global::haxe.lang.Runtime.toString(__fn_float4)) : (global::haxe.lang.Runtime.toString(__fn_dyn4)) );
			global::haxe.lang.Null<double> a = ( (( __fn_dyn3 == global::haxe.lang.Runtime.undefined )) ? (new global::haxe.lang.Null<double>(__fn_float3, true)) : (( (( __fn_dyn3 == null )) ? (default(global::haxe.lang.Null<double>)) : (global::haxe.lang.Null<object>.ofDynamic<double>(__fn_dyn3)) )) );
			int b = ( (( __fn_dyn2 == global::haxe.lang.Runtime.undefined )) ? (((int) (__fn_float2) )) : (((int) (global::haxe.lang.Runtime.toInt(__fn_dyn2)) )) );
			string c = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (global::haxe.lang.Runtime.toString(__fn_float1)) : (global::haxe.lang.Runtime.toString(__fn_dyn1)) );
			object obj = new global::haxe.lang.DynamicObject(new int[]{99, 100}, new object[]{c, d}, new int[]{98}, new double[]{((double) (b) )});
			if (a.hasValue) {
				global::haxe.lang.Runtime.setField(obj, "a", 97, (a).toDynamic());
			}
			
			return obj;
		}
		
		
	}
}

