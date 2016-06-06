// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace utest.ui.common {
	public class FixtureResult : global::haxe.lang.HxObject {
		
		public FixtureResult(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public FixtureResult(string methodName) {
			global::utest.ui.common.FixtureResult.__hx_ctor_utest_ui_common_FixtureResult(this, methodName);
		}
		
		
		public static void __hx_ctor_utest_ui_common_FixtureResult(global::utest.ui.common.FixtureResult __temp_me149, string methodName) {
			__temp_me149.methodName = methodName;
			__temp_me149.list = new global::List<object>();
			__temp_me149.hasTestError = false;
			__temp_me149.hasSetupError = false;
			__temp_me149.hasTeardownError = false;
			__temp_me149.hasTimeoutError = false;
			__temp_me149.hasAsyncError = false;
			__temp_me149.stats = new global::utest.ui.common.ResultStats();
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::utest.ui.common.FixtureResult(((global::haxe.lang.EmptyObject) (global::haxe.lang.EmptyObject.EMPTY) ));
		}
		
		
		public static new object __hx_create(global::Array arr) {
			return new global::utest.ui.common.FixtureResult(global::haxe.lang.Runtime.toString(arr[0]));
		}
		
		
		public string methodName;
		
		public bool hasTestError;
		
		public bool hasSetupError;
		
		public bool hasTeardownError;
		
		public bool hasTimeoutError;
		
		public bool hasAsyncError;
		
		public global::utest.ui.common.ResultStats stats;
		
		public global::List<object> list;
		
		public virtual global::_List.ListIterator<object> iterator() {
			return new global::_List.ListIterator<object>(((global::_List.ListNode<object>) (this.list.h) ));
		}
		
		
		public virtual void @add(global::utest.Assertation assertation) {
			unchecked {
				this.list.@add(assertation);
				switch (assertation.index) {
					case 0:
					{
						this.stats.addSuccesses(1);
						break;
					}
					
					
					case 1:
					{
						this.stats.addFailures(1);
						break;
					}
					
					
					case 2:
					{
						this.stats.addErrors(1);
						break;
					}
					
					
					case 3:
					{
						this.stats.addErrors(1);
						this.hasSetupError = true;
						break;
					}
					
					
					case 4:
					{
						this.stats.addErrors(1);
						this.hasTeardownError = true;
						break;
					}
					
					
					case 5:
					{
						this.stats.addErrors(1);
						this.hasTimeoutError = true;
						break;
					}
					
					
					case 6:
					{
						this.stats.addErrors(1);
						this.hasAsyncError = true;
						break;
					}
					
					
					case 7:
					{
						this.stats.addWarnings(1);
						break;
					}
					
					
				}
				
			}
		}
		
		
		public override object __hx_setField(string field, int hash, object @value, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 1202920542:
					{
						this.list = ((global::List<object>) (global::List<object>.__hx_cast<object>(((global::List) (@value) ))) );
						return @value;
					}
					
					
					case 67859999:
					{
						this.stats = ((global::utest.ui.common.ResultStats) (@value) );
						return @value;
					}
					
					
					case 1002257126:
					{
						this.hasAsyncError = global::haxe.lang.Runtime.toBool(@value);
						return @value;
					}
					
					
					case 1548166113:
					{
						this.hasTimeoutError = global::haxe.lang.Runtime.toBool(@value);
						return @value;
					}
					
					
					case 623100778:
					{
						this.hasTeardownError = global::haxe.lang.Runtime.toBool(@value);
						return @value;
					}
					
					
					case 1870897157:
					{
						this.hasSetupError = global::haxe.lang.Runtime.toBool(@value);
						return @value;
					}
					
					
					case 1232990044:
					{
						this.hasTestError = global::haxe.lang.Runtime.toBool(@value);
						return @value;
					}
					
					
					case 302979532:
					{
						this.methodName = global::haxe.lang.Runtime.toString(@value);
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
					case 4846113:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "add", 4846113)) );
					}
					
					
					case 328878574:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "iterator", 328878574)) );
					}
					
					
					case 1202920542:
					{
						return this.list;
					}
					
					
					case 67859999:
					{
						return this.stats;
					}
					
					
					case 1002257126:
					{
						return this.hasAsyncError;
					}
					
					
					case 1548166113:
					{
						return this.hasTimeoutError;
					}
					
					
					case 623100778:
					{
						return this.hasTeardownError;
					}
					
					
					case 1870897157:
					{
						return this.hasSetupError;
					}
					
					
					case 1232990044:
					{
						return this.hasTestError;
					}
					
					
					case 302979532:
					{
						return this.methodName;
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
					case 4846113:
					{
						this.@add(((global::utest.Assertation) (dynargs[0]) ));
						break;
					}
					
					
					case 328878574:
					{
						return this.iterator();
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
			baseArr.push("list");
			baseArr.push("stats");
			baseArr.push("hasAsyncError");
			baseArr.push("hasTimeoutError");
			baseArr.push("hasTeardownError");
			baseArr.push("hasSetupError");
			baseArr.push("hasTestError");
			baseArr.push("methodName");
			{
				base.__hx_getFields(baseArr);
			}
			
		}
		
		
	}
}


