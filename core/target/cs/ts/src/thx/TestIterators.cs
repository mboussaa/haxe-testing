// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class TestIterators : global::haxe.lang.HxObject {
		
		public TestIterators(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public TestIterators() {
			global::thx.TestIterators.__hx_ctor_thx_TestIterators(this);
		}
		
		
		public static void __hx_ctor_thx_TestIterators(global::thx.TestIterators __temp_me207) {
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::thx.TestIterators(global::haxe.lang.EmptyObject.EMPTY);
		}
		
		
		public static new object __hx_create(global::Array arr) {
			return new global::thx.TestIterators();
		}
		
		
		public virtual void testEquals() {
			unchecked {
				global::Array<int> a = new global::Array<int>(new int[]{1, 2, 3});
				global::Array<int> b = new global::Array<int>(new int[]{1, 2});
				global::Array<int> c = new global::Array<int>(new int[]{1, 2, 4});
				global::utest.Assert.isTrue(global::thx.Iterators.@equals<int>(((object) (new global::_Array.ArrayIterator<int>(((global::Array<int>) (a) ))) ), ((object) (new global::_Array.ArrayIterator<int>(((global::Array<int>) (a) ))) ), ((global::haxe.lang.Function) (null) )), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testEquals", "thx.TestIterators", "TestIterators.hx"}, new int[]{1981972957}, new double[]{((double) (19) )}));
				global::utest.Assert.isFalse(global::thx.Iterators.@equals<int>(((object) (new global::_Array.ArrayIterator<int>(((global::Array<int>) (a) ))) ), ((object) (new global::_Array.ArrayIterator<int>(((global::Array<int>) (b) ))) ), ((global::haxe.lang.Function) (null) )), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testEquals", "thx.TestIterators", "TestIterators.hx"}, new int[]{1981972957}, new double[]{((double) (20) )}));
				global::utest.Assert.isFalse(global::thx.Iterators.@equals<int>(((object) (new global::_Array.ArrayIterator<int>(((global::Array<int>) (a) ))) ), ((object) (new global::_Array.ArrayIterator<int>(((global::Array<int>) (c) ))) ), ((global::haxe.lang.Function) (null) )), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testEquals", "thx.TestIterators", "TestIterators.hx"}, new int[]{1981972957}, new double[]{((double) (21) )}));
			}
		}
		
		
		public virtual void testReduce() {
			unchecked {
				global::utest.Assert.@equals(17, ((int) (global::haxe.lang.Runtime.toInt(global::thx.Iterators.reduce<int, object>(((object) (new global::_Array.ArrayIterator<int>(((global::Array<int>) (new global::Array<int>(new int[]{2, 3, 5, 7})) ))) ), ((global::haxe.lang.Function) (( (( global::thx.TestIterators_testReduce_26__Fun.__hx_current != null )) ? (global::thx.TestIterators_testReduce_26__Fun.__hx_current) : (global::thx.TestIterators_testReduce_26__Fun.__hx_current = ((global::thx.TestIterators_testReduce_26__Fun) (new global::thx.TestIterators_testReduce_26__Fun()) )) )) ), ((object) (0) )))) ), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testReduce", "thx.TestIterators", "TestIterators.hx"}, new int[]{1981972957}, new double[]{((double) (26) )}));
			}
		}
		
		
		public override object __hx_getField(string field, int hash, bool throwErrors, bool isCheck, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 395211672:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testReduce", 395211672)) );
					}
					
					
					case 1491547185:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testEquals", 1491547185)) );
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
					case 395211672:
					{
						this.testReduce();
						break;
					}
					
					
					case 1491547185:
					{
						this.testEquals();
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
	public class TestIterators_testReduce_26__Fun : global::haxe.lang.Function {
		
		public TestIterators_testReduce_26__Fun() : base(2, 1) {
		}
		
		
		public static global::thx.TestIterators_testReduce_26__Fun __hx_current;
		
		public override double __hx_invoke2_f(double __fn_float1, object __fn_dyn1, double __fn_float2, object __fn_dyn2) {
			int b = ( (( __fn_dyn2 == global::haxe.lang.Runtime.undefined )) ? (((int) (__fn_float2) )) : (((int) (global::haxe.lang.Runtime.toInt(__fn_dyn2)) )) );
			int a = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((int) (__fn_float1) )) : (((int) (global::haxe.lang.Runtime.toInt(__fn_dyn1)) )) );
			return ((double) (( a + b )) );
		}
		
		
	}
}

