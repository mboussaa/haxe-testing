// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx.promise {
	public class TestFuture : global::haxe.lang.HxObject {
		
		public TestFuture(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public TestFuture(int i) {
			global::thx.promise.TestFuture.__hx_ctor_thx_promise_TestFuture(this, i);
		}
		
		
		public static void __hx_ctor_thx_promise_TestFuture(global::thx.promise.TestFuture __temp_me150, int i) {
			__temp_me150.x = i;
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::thx.promise.TestFuture(((global::haxe.lang.EmptyObject) (global::haxe.lang.EmptyObject.EMPTY) ));
		}
		
		
		public static new object __hx_create(global::Array arr) {
			return new global::thx.promise.TestFuture(((int) (global::haxe.lang.Runtime.toInt(arr[0])) ));
		}
		
		
		public int x;
		
		public virtual void testThenBefore() {
			unchecked {
				int _g1 = 0;
				int _g = this.x;
				while (( _g1 < _g )) {
					 ++ _g1;
					global::thx.promise.Future<object>.@value<int>(((int) (1) )).then(( (( global::thx.promise.TestFuture_testThenBefore_17__Fun.__hx_current != null )) ? (global::thx.promise.TestFuture_testThenBefore_17__Fun.__hx_current) : (global::thx.promise.TestFuture_testThenBefore_17__Fun.__hx_current = ((global::thx.promise.TestFuture_testThenBefore_17__Fun) (new global::thx.promise.TestFuture_testThenBefore_17__Fun()) )) ));
				}
				
			}
		}
		
		
		public virtual void testMap() {
			unchecked {
				int _g1 = 0;
				int _g = this.x;
				while (( _g1 < _g )) {
					 ++ _g1;
					global::thx.promise.Future<object>.@value<int>(((int) (1) )).map<object>(((global::haxe.lang.Function) (( (( global::thx.promise.TestFuture_testMap_57__Fun.__hx_current != null )) ? (global::thx.promise.TestFuture_testMap_57__Fun.__hx_current) : (global::thx.promise.TestFuture_testMap_57__Fun.__hx_current = ((global::thx.promise.TestFuture_testMap_57__Fun) (new global::thx.promise.TestFuture_testMap_57__Fun()) )) )) )).then(( (( global::thx.promise.TestFuture_testMap_58__Fun.__hx_current != null )) ? (global::thx.promise.TestFuture_testMap_58__Fun.__hx_current) : (global::thx.promise.TestFuture_testMap_58__Fun.__hx_current = ((global::thx.promise.TestFuture_testMap_58__Fun) (new global::thx.promise.TestFuture_testMap_58__Fun()) )) ));
				}
				
			}
		}
		
		
		public virtual void testMapAsync() {
			unchecked {
				int _g1 = 0;
				int _g = this.x;
				while (( _g1 < _g )) {
					 ++ _g1;
					global::thx.promise.Future<object>.@value<int>(((int) (1) )).mapAsync<object>(((global::haxe.lang.Function) (( (( global::thx.promise.TestFuture_testMapAsync_64__Fun.__hx_current != null )) ? (global::thx.promise.TestFuture_testMapAsync_64__Fun.__hx_current) : (global::thx.promise.TestFuture_testMapAsync_64__Fun.__hx_current = ((global::thx.promise.TestFuture_testMapAsync_64__Fun) (new global::thx.promise.TestFuture_testMapAsync_64__Fun()) )) )) )).then(( (( global::thx.promise.TestFuture_testMapAsync_65__Fun.__hx_current != null )) ? (global::thx.promise.TestFuture_testMapAsync_65__Fun.__hx_current) : (global::thx.promise.TestFuture_testMapAsync_65__Fun.__hx_current = ((global::thx.promise.TestFuture_testMapAsync_65__Fun) (new global::thx.promise.TestFuture_testMapAsync_65__Fun()) )) ));
				}
				
			}
		}
		
		
		public virtual void testFlatten() {
			unchecked {
				int _g1 = 0;
				int _g = this.x;
				while (( _g1 < _g )) {
					 ++ _g1;
					global::thx.promise.Future<object> future = global::thx.promise.Future<object>.@value<object>(((object) (global::thx.promise.Future<object>.@value<int>(((int) (1) ))) ));
					global::thx.promise.Future<object>.create<int>(((global::haxe.lang.Function) (new global::thx.promise.TestFuture_testFlatten_70__Fun(future)) )).then(( (( global::thx.promise.TestFuture_testFlatten_72__Fun.__hx_current != null )) ? (global::thx.promise.TestFuture_testFlatten_72__Fun.__hx_current) : (global::thx.promise.TestFuture_testFlatten_72__Fun.__hx_current = ((global::thx.promise.TestFuture_testFlatten_72__Fun) (new global::thx.promise.TestFuture_testFlatten_72__Fun()) )) ));
				}
				
			}
		}
		
		
		public virtual void testFlatMap() {
			unchecked {
				int _g1 = 0;
				int _g = this.x;
				while (( _g1 < _g )) {
					 ++ _g1;
					global::thx.promise.Future<object>.@value<int>(((int) (1) )).flatMap<object>(((global::haxe.lang.Function) (( (( global::thx.promise.TestFuture_testFlatMap_78__Fun.__hx_current != null )) ? (global::thx.promise.TestFuture_testFlatMap_78__Fun.__hx_current) : (global::thx.promise.TestFuture_testFlatMap_78__Fun.__hx_current = ((global::thx.promise.TestFuture_testFlatMap_78__Fun) (new global::thx.promise.TestFuture_testFlatMap_78__Fun()) )) )) )).then(( (( global::thx.promise.TestFuture_testFlatMap_79__Fun.__hx_current != null )) ? (global::thx.promise.TestFuture_testFlatMap_79__Fun.__hx_current) : (global::thx.promise.TestFuture_testFlatMap_79__Fun.__hx_current = ((global::thx.promise.TestFuture_testFlatMap_79__Fun) (new global::thx.promise.TestFuture_testFlatMap_79__Fun()) )) ));
				}
				
			}
		}
		
		
		public virtual void testTuple3() {
			unchecked {
				int _g1 = 0;
				int _g = this.x;
				while (( _g1 < _g )) {
					 ++ _g1;
					global::haxe.lang.Function done = ((global::haxe.lang.Function) (global::utest.Assert.createAsync.__hx_invoke2_o(default(double), null, default(double), (default(global::haxe.lang.Null<int>)).toDynamic())) );
					global::thx.promise.FutureTuple3.tuple<int, object, double>(((global::thx.promise.Future<object>) (global::thx.promise.Future<object>.__hx_cast<object>(((global::thx.promise.Future) (global::thx.promise.Future<object>.@value<object>(((object) (new global::haxe.lang.DynamicObject(new int[]{21234}, new object[]{"a"}, new int[]{21233, 21235}, new double[]{((double) (1) ), 0.2})) ))) ))) ), ((global::haxe.lang.Function) (new global::thx.promise.TestFuture_testTuple3_112__Fun(done)) ));
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
					case 580268317:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testTuple3", 580268317)) );
					}
					
					
					case 598146609:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testFlatMap", 598146609)) );
					}
					
					
					case 600086930:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testFlatten", 600086930)) );
					}
					
					
					case 277321074:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testMapAsync", 277321074)) );
					}
					
					
					case 1036089706:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testMap", 1036089706)) );
					}
					
					
					case 833287726:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testThenBefore", 833287726)) );
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
					case 580268317:
					{
						this.testTuple3();
						break;
					}
					
					
					case 598146609:
					{
						this.testFlatMap();
						break;
					}
					
					
					case 600086930:
					{
						this.testFlatten();
						break;
					}
					
					
					case 277321074:
					{
						this.testMapAsync();
						break;
					}
					
					
					case 1036089706:
					{
						this.testMap();
						break;
					}
					
					
					case 833287726:
					{
						this.testThenBefore();
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
namespace thx.promise {
	public class TestFuture_testThenBefore_17__Fun : global::haxe.lang.Function {
		
		public TestFuture_testThenBefore_17__Fun() : base(1, 0) {
		}
		
		
		public static global::thx.promise.TestFuture_testThenBefore_17__Fun __hx_current;
		
		public override object __hx_invoke1_o(double __fn_float1, object __fn_dyn1) {
			unchecked {
				int v = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((int) (__fn_float1) )) : (((int) (global::haxe.lang.Runtime.toInt(__fn_dyn1)) )) );
				global::utest.Assert.@equals(1, v, null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testThenBefore", "thx.promise.TestFuture", "TestFuture.hx"}, new int[]{1981972957}, new double[]{((double) (17) )}));
				return null;
			}
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx.promise {
	public class TestFuture_testMap_58__Fun : global::haxe.lang.Function {
		
		public TestFuture_testMap_58__Fun() : base(1, 0) {
		}
		
		
		public static global::thx.promise.TestFuture_testMap_58__Fun __hx_current;
		
		public override object __hx_invoke1_o(double __fn_float1, object __fn_dyn1) {
			unchecked {
				object a2 = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((object) (__fn_float1) )) : (((object) (__fn_dyn1) )) );
				global::utest.Assert.@equals("1", a2, global::haxe.lang.Runtime.toString(null), new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testMap", "thx.promise.TestFuture", "TestFuture.hx"}, new int[]{1981972957}, new double[]{((double) (58) )}));
				return null;
			}
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx.promise {
	public class TestFuture_testMap_57__Fun : global::haxe.lang.Function {
		
		public TestFuture_testMap_57__Fun() : base(1, 0) {
		}
		
		
		public static global::thx.promise.TestFuture_testMap_57__Fun __hx_current;
		
		public override object __hx_invoke1_o(double __fn_float1, object __fn_dyn1) {
			int i = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((int) (__fn_float1) )) : (((int) (global::haxe.lang.Runtime.toInt(__fn_dyn1)) )) );
			return global::haxe.lang.Runtime.concat("", global::haxe.lang.Runtime.toString(i));
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx.promise {
	public class TestFuture_testMapAsync_65__Fun : global::haxe.lang.Function {
		
		public TestFuture_testMapAsync_65__Fun() : base(1, 0) {
		}
		
		
		public static global::thx.promise.TestFuture_testMapAsync_65__Fun __hx_current;
		
		public override object __hx_invoke1_o(double __fn_float1, object __fn_dyn1) {
			unchecked {
				object a2 = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((object) (__fn_float1) )) : (((object) (__fn_dyn1) )) );
				global::utest.Assert.@equals("1", a2, global::haxe.lang.Runtime.toString(null), new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testMapAsync", "thx.promise.TestFuture", "TestFuture.hx"}, new int[]{1981972957}, new double[]{((double) (65) )}));
				return null;
			}
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx.promise {
	public class TestFuture_testMapAsync_64__Fun : global::haxe.lang.Function {
		
		public TestFuture_testMapAsync_64__Fun() : base(2, 0) {
		}
		
		
		public static global::thx.promise.TestFuture_testMapAsync_64__Fun __hx_current;
		
		public override object __hx_invoke2_o(double __fn_float1, object __fn_dyn1, double __fn_float2, object __fn_dyn2) {
			global::haxe.lang.Function callback = ( (( __fn_dyn2 == global::haxe.lang.Runtime.undefined )) ? (((global::haxe.lang.Function) (((object) (__fn_float2) )) )) : (((global::haxe.lang.Function) (__fn_dyn2) )) );
			int v = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((int) (__fn_float1) )) : (((int) (global::haxe.lang.Runtime.toInt(__fn_dyn1)) )) );
			callback.__hx_invoke1_o(default(double), global::haxe.lang.Runtime.concat("", global::haxe.lang.Runtime.toString(v)));
			return null;
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx.promise {
	public class TestFuture_testFlatten_72__Fun : global::haxe.lang.Function {
		
		public TestFuture_testFlatten_72__Fun() : base(1, 0) {
		}
		
		
		public static global::thx.promise.TestFuture_testFlatten_72__Fun __hx_current;
		
		public override object __hx_invoke1_o(double __fn_float1, object __fn_dyn1) {
			unchecked {
				object a2 = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((object) (__fn_float1) )) : (((object) (__fn_dyn1) )) );
				global::utest.Assert.@equals(1, a2, global::haxe.lang.Runtime.toString(null), new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testFlatten", "thx.promise.TestFuture", "TestFuture.hx"}, new int[]{1981972957}, new double[]{((double) (72) )}));
				return null;
			}
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx.promise {
	public class TestFuture_testFlatten_70__Fun_0 : global::haxe.lang.Function {
		
		public TestFuture_testFlatten_70__Fun_0(global::haxe.lang.Function callback) : base(1, 0) {
			this.callback = callback;
		}
		
		
		public override object __hx_invoke1_o(double __fn_float1, object __fn_dyn1) {
			global::thx.promise.Future<int> future1 = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((global::thx.promise.Future<int>) (global::thx.promise.Future<object>.__hx_cast<int>(((global::thx.promise.Future) (((object) (__fn_float1) )) ))) )) : (((global::thx.promise.Future<int>) (global::thx.promise.Future<object>.__hx_cast<int>(((global::thx.promise.Future) (__fn_dyn1) ))) )) );
			future1.then(this.callback);
			return null;
		}
		
		
		public global::haxe.lang.Function callback;
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx.promise {
	public class TestFuture_testFlatten_70__Fun : global::haxe.lang.Function {
		
		public TestFuture_testFlatten_70__Fun(global::thx.promise.Future<object> future) : base(1, 0) {
			this.future = future;
		}
		
		
		public override object __hx_invoke1_o(double __fn_float1, object __fn_dyn1) {
			global::haxe.lang.Function callback = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((global::haxe.lang.Function) (((object) (__fn_float1) )) )) : (((global::haxe.lang.Function) (__fn_dyn1) )) );
			this.future.then(new global::thx.promise.TestFuture_testFlatten_70__Fun_0(callback));
			return null;
		}
		
		
		public global::thx.promise.Future<object> future;
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx.promise {
	public class TestFuture_testFlatMap_79__Fun : global::haxe.lang.Function {
		
		public TestFuture_testFlatMap_79__Fun() : base(1, 0) {
		}
		
		
		public static global::thx.promise.TestFuture_testFlatMap_79__Fun __hx_current;
		
		public override object __hx_invoke1_o(double __fn_float1, object __fn_dyn1) {
			unchecked {
				object a2 = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((object) (__fn_float1) )) : (((object) (__fn_dyn1) )) );
				global::utest.Assert.@equals("1", a2, global::haxe.lang.Runtime.toString(null), new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testFlatMap", "thx.promise.TestFuture", "TestFuture.hx"}, new int[]{1981972957}, new double[]{((double) (79) )}));
				return null;
			}
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx.promise {
	public class TestFuture_testFlatMap_78__Fun : global::haxe.lang.Function {
		
		public TestFuture_testFlatMap_78__Fun() : base(1, 0) {
		}
		
		
		public static global::thx.promise.TestFuture_testFlatMap_78__Fun __hx_current;
		
		public override object __hx_invoke1_o(double __fn_float1, object __fn_dyn1) {
			int v = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((int) (__fn_float1) )) : (((int) (global::haxe.lang.Runtime.toInt(__fn_dyn1)) )) );
			return global::thx.promise.Future<object>.@value<object>(((object) (global::haxe.lang.Runtime.concat("", global::haxe.lang.Runtime.toString(v))) ));
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx.promise {
	public class TestFuture_testTuple3_112__Fun : global::haxe.lang.Function {
		
		public TestFuture_testTuple3_112__Fun(global::haxe.lang.Function done) : base(3, 0) {
			this.done = done;
		}
		
		
		public override object __hx_invoke3_o(double __fn_float1, object __fn_dyn1, double __fn_float2, object __fn_dyn2, double __fn_float3, object __fn_dyn3) {
			unchecked {
				double c = ( (( __fn_dyn3 == global::haxe.lang.Runtime.undefined )) ? (((double) (__fn_float3) )) : (((double) (global::haxe.lang.Runtime.toDouble(__fn_dyn3)) )) );
				string b = ( (( __fn_dyn2 == global::haxe.lang.Runtime.undefined )) ? (global::haxe.lang.Runtime.toString(__fn_float2)) : (global::haxe.lang.Runtime.toString(__fn_dyn2)) );
				int a = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((int) (__fn_float1) )) : (((int) (global::haxe.lang.Runtime.toInt(__fn_dyn1)) )) );
				global::utest.Assert.@equals(1, a, null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testTuple3", "thx.promise.TestFuture", "TestFuture.hx"}, new int[]{1981972957}, new double[]{((double) (113) )}));
				global::utest.Assert.@equals("a", b, null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testTuple3", "thx.promise.TestFuture", "TestFuture.hx"}, new int[]{1981972957}, new double[]{((double) (114) )}));
				global::utest.Assert.@equals(0.2, c, null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testTuple3", "thx.promise.TestFuture", "TestFuture.hx"}, new int[]{1981972957}, new double[]{((double) (115) )}));
				this.done.__hx_invoke0_o();
				return null;
			}
		}
		
		
		public global::haxe.lang.Function done;
		
	}
}

