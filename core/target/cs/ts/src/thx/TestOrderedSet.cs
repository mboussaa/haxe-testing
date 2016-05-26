// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class TestOrderedSet : global::haxe.lang.HxObject {
		
		public TestOrderedSet(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public TestOrderedSet() {
			global::thx.TestOrderedSet.__hx_ctor_thx_TestOrderedSet(this);
		}
		
		
		public static void __hx_ctor_thx_TestOrderedSet(global::thx.TestOrderedSet __temp_me215) {
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::thx.TestOrderedSet(global::haxe.lang.EmptyObject.EMPTY);
		}
		
		
		public static new object __hx_create(global::Array arr) {
			return new global::thx.TestOrderedSet();
		}
		
		
		public virtual void testCreate() {
			unchecked {
				global::Array<int> @set = global::thx._OrderedSet.OrderedSet_Impl_.create<int>(((global::Array<int>) (null) ));
				global::utest.Assert.@equals(0, @set.length, null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testCreate", "thx.TestOrderedSet", "TestOrderedSet.hx"}, new int[]{1981972957}, new double[]{((double) (10) )}));
				global::thx._OrderedSet.OrderedSet_Impl_.@add<int>(((global::Array<int>) (@set) ), ((int) (1) ));
				global::thx._OrderedSet.OrderedSet_Impl_.@add<int>(((global::Array<int>) (@set) ), ((int) (1) ));
				global::utest.Assert.@equals(1, @set.length, null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testCreate", "thx.TestOrderedSet", "TestOrderedSet.hx"}, new int[]{1981972957}, new double[]{((double) (13) )}));
			}
		}
		
		
		public virtual void testOrderedSet() {
			unchecked {
				global::utest.Assert.same(new global::Array<object>(new object[]{1, 2, 3}), ((global::Array<int>) (global::thx._OrderedSet.OrderedSet_Impl_.toArray<int>(((global::Array<int>) (global::Array<object>.__hx_cast<int>(((global::Array) (global::thx._OrderedSet.OrderedSet_Impl_.toOrderedSet<object>(((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (new global::Array<int>(new int[]{1, 2, 2, 2, 3})) ))) ))) ))) ))) ), default(global::haxe.lang.Null<bool>), null, default(global::haxe.lang.Null<double>), new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testOrderedSet", "thx.TestOrderedSet", "TestOrderedSet.hx"}, new int[]{1981972957}, new double[]{((double) (18) )}));
			}
		}
		
		
		public virtual void testUnion() {
			unchecked {
				global::utest.Assert.same(new global::Array<object>(new object[]{1, 2, 3, 4}), ((global::Array<int>) (global::thx._OrderedSet.OrderedSet_Impl_.toArray<int>(((global::Array<int>) (global::thx._OrderedSet.OrderedSet_Impl_.toOrderedSet<int>(((global::Array<int>) (((global::Array<int>) (global::Array<object>.__hx_cast<int>(((global::Array) (global::thx._OrderedSet.OrderedSet_Impl_.toOrderedSet<object>(((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (new global::Array<int>(new int[]{1, 2, 3})) ))) ))) ))) ).concat(global::thx._OrderedSet.OrderedSet_Impl_.toArray<int>(((global::Array<int>) (global::Array<object>.__hx_cast<int>(((global::Array) (global::thx._OrderedSet.OrderedSet_Impl_.toOrderedSet<object>(((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (new global::Array<int>(new int[]{2, 2, 4})) ))) ))) ))) )))) ))) ))) ), default(global::haxe.lang.Null<bool>), null, default(global::haxe.lang.Null<double>), new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testUnion", "thx.TestOrderedSet", "TestOrderedSet.hx"}, new int[]{1981972957}, new double[]{((double) (24) )}));
			}
		}
		
		
		public virtual void testDifference() {
			unchecked {
				global::Array<int> s1 = ((global::Array<int>) (global::Array<object>.__hx_cast<int>(((global::Array) (global::thx._OrderedSet.OrderedSet_Impl_.toOrderedSet<object>(((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (new global::Array<int>(new int[]{1, 2, 3})) ))) ))) ))) );
				global::Array<int> s2 = ((global::Array<int>) (global::Array<object>.__hx_cast<int>(((global::Array) (global::thx._OrderedSet.OrderedSet_Impl_.toOrderedSet<object>(((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (new global::Array<int>(new int[]{2, 2, 4})) ))) ))) ))) );
				global::Array<int> result = ((global::Array<int>) (s1) ).copy();
				{
					object tmp = ((object) (new global::_Array.ArrayIterator<int>(((global::Array<int>) (s2) ))) );
					while (global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(tmp, "hasNext", 407283053, null))) {
						result.@remove(((int) (global::haxe.lang.Runtime.toInt(global::haxe.lang.Runtime.callField(tmp, "next", 1224901875, null))) ));
					}
					
				}
				
				global::utest.Assert.same(new global::Array<object>(new object[]{1, 3}), ((global::Array<int>) (global::thx._OrderedSet.OrderedSet_Impl_.toArray<int>(((global::Array<int>) (result) ))) ), default(global::haxe.lang.Null<bool>), null, default(global::haxe.lang.Null<double>), new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testDifference", "thx.TestOrderedSet", "TestOrderedSet.hx"}, new int[]{1981972957}, new double[]{((double) (30) )}));
			}
		}
		
		
		public virtual void testBooleans() {
			unchecked {
				global::Array<int> this1 = global::thx._OrderedSet.OrderedSet_Impl_.toOrderedSet<int>(((global::Array<int>) (((global::Array<int>) (global::Array<object>.__hx_cast<int>(((global::Array) (global::thx._OrderedSet.OrderedSet_Impl_.toOrderedSet<object>(((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (new global::Array<int>(new int[]{1, 2, 3})) ))) ))) ))) ).concat(global::thx._OrderedSet.OrderedSet_Impl_.toArray<int>(((global::Array<int>) (global::Array<object>.__hx_cast<int>(((global::Array) (global::thx._OrderedSet.OrderedSet_Impl_.toOrderedSet<object>(((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (new global::Array<int>(new int[]{2, 3, 4})) ))) ))) ))) )))) ));
				global::Array<int> @set = ((global::Array<int>) (global::Array<object>.__hx_cast<int>(((global::Array) (global::thx._OrderedSet.OrderedSet_Impl_.toOrderedSet<object>(((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (new global::Array<int>(new int[]{2, 3})) ))) ))) ))) );
				global::Array<int> result = ((global::Array<int>) (this1) ).copy();
				{
					object tmp = ((object) (new global::_Array.ArrayIterator<int>(((global::Array<int>) (@set) ))) );
					while (global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(tmp, "hasNext", 407283053, null))) {
						result.@remove(((int) (global::haxe.lang.Runtime.toInt(global::haxe.lang.Runtime.callField(tmp, "next", 1224901875, null))) ));
					}
					
				}
				
				global::utest.Assert.same(new global::Array<object>(new object[]{1, 4}), ((global::Array<int>) (result) ), default(global::haxe.lang.Null<bool>), null, default(global::haxe.lang.Null<double>), new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testBooleans", "thx.TestOrderedSet", "TestOrderedSet.hx"}, new int[]{1981972957}, new double[]{((double) (35) )}));
			}
		}
		
		
		public override object __hx_getField(string field, int hash, bool throwErrors, bool isCheck, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 873828157:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testBooleans", 873828157)) );
					}
					
					
					case 1719976687:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testDifference", 1719976687)) );
					}
					
					
					case 1877582685:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testUnion", 1877582685)) );
					}
					
					
					case 770356263:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testOrderedSet", 770356263)) );
					}
					
					
					case 352562414:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testCreate", 352562414)) );
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
					case 873828157:
					{
						this.testBooleans();
						break;
					}
					
					
					case 1719976687:
					{
						this.testDifference();
						break;
					}
					
					
					case 1877582685:
					{
						this.testUnion();
						break;
					}
					
					
					case 770356263:
					{
						this.testOrderedSet();
						break;
					}
					
					
					case 352562414:
					{
						this.testCreate();
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


