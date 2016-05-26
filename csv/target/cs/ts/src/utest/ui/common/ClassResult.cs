// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace utest.ui.common {
	public class ClassResult : global::haxe.lang.HxObject {
		
		public ClassResult(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public ClassResult(string className, string setupName, string teardownName) {
			global::utest.ui.common.ClassResult.__hx_ctor_utest_ui_common_ClassResult(this, className, setupName, teardownName);
		}
		
		
		public static void __hx_ctor_utest_ui_common_ClassResult(global::utest.ui.common.ClassResult __temp_me151, string className, string setupName, string teardownName) {
			__temp_me151.fixtures = new global::haxe.ds.StringMap<object>();
			__temp_me151.className = className;
			__temp_me151.setupName = setupName;
			__temp_me151.hasSetup =  ! (string.Equals(setupName, null)) ;
			__temp_me151.teardownName = teardownName;
			__temp_me151.hasTeardown =  ! (string.Equals(teardownName, null)) ;
			__temp_me151.methods = 0;
			__temp_me151.stats = new global::utest.ui.common.ResultStats();
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::utest.ui.common.ClassResult(global::haxe.lang.EmptyObject.EMPTY);
		}
		
		
		public static new object __hx_create(global::Array arr) {
			unchecked {
				return new global::utest.ui.common.ClassResult(global::haxe.lang.Runtime.toString(arr[0]), global::haxe.lang.Runtime.toString(arr[1]), global::haxe.lang.Runtime.toString(arr[2]));
			}
		}
		
		
		public global::haxe.ds.StringMap<object> fixtures;
		
		public string className;
		
		public string setupName;
		
		public string teardownName;
		
		public bool hasSetup;
		
		public bool hasTeardown;
		
		public int methods;
		
		public global::utest.ui.common.ResultStats stats;
		
		public virtual void @add(global::utest.ui.common.FixtureResult result) {
			if (this.fixtures.exists(((string) (result.methodName) ))) {
				throw global::haxe.lang.HaxeException.wrap("invalid duplicated fixture result");
			}
			
			this.stats.wire(result.stats);
			this.methods++;
			this.fixtures.@set(((string) (result.methodName) ), ((object) (result) ));
		}
		
		
		public virtual global::utest.ui.common.FixtureResult @get(string method) {
			return ((global::utest.ui.common.FixtureResult) ((this.fixtures.@get(((string) (method) ))).@value) );
		}
		
		
		public virtual bool exists(string method) {
			return this.fixtures.exists(((string) (method) ));
		}
		
		
		public virtual global::Array<object> methodNames(global::haxe.lang.Null<bool> errorsHavePriority) {
			bool __temp_errorsHavePriority150 = ( ( ! (errorsHavePriority.hasValue) ) ? (true) : ((errorsHavePriority).@value) );
			global::Array<object> names = new global::Array<object>(new object[]{});
			{
				object tmp = ((object) (new global::haxe.ds._StringMap.StringMapKeyIterator<object>(((global::haxe.ds.StringMap<object>) (this.fixtures) ))) );
				while (global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(tmp, "hasNext", 407283053, null))) {
					names.push(global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.callField(tmp, "next", 1224901875, null)));
				}
				
			}
			
			if (__temp_errorsHavePriority150) {
				global::utest.ui.common.ClassResult me = this;
				names.sort(new global::utest.ui.common.ClassResult_methodNames_49__Fun(me));
			}
			else {
				names.sort(( (( global::utest.ui.common.ClassResult_methodNames_69__Fun.__hx_current != null )) ? (global::utest.ui.common.ClassResult_methodNames_69__Fun.__hx_current) : (global::utest.ui.common.ClassResult_methodNames_69__Fun.__hx_current = ((global::utest.ui.common.ClassResult_methodNames_69__Fun) (new global::utest.ui.common.ClassResult_methodNames_69__Fun()) )) ));
			}
			
			return names;
		}
		
		
		public override double __hx_setField_f(string field, int hash, double @value, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 641535602:
					{
						this.methods = ((int) (@value) );
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
					case 67859999:
					{
						this.stats = ((global::utest.ui.common.ResultStats) (@value) );
						return @value;
					}
					
					
					case 641535602:
					{
						this.methods = ((int) (global::haxe.lang.Runtime.toInt(@value)) );
						return @value;
					}
					
					
					case 1413779326:
					{
						this.hasTeardown = global::haxe.lang.Runtime.toBool(@value);
						return @value;
					}
					
					
					case 109574339:
					{
						this.hasSetup = global::haxe.lang.Runtime.toBool(@value);
						return @value;
					}
					
					
					case 1813879407:
					{
						this.teardownName = global::haxe.lang.Runtime.toString(@value);
						return @value;
					}
					
					
					case 596496232:
					{
						this.setupName = global::haxe.lang.Runtime.toString(@value);
						return @value;
					}
					
					
					case 1547539107:
					{
						this.className = global::haxe.lang.Runtime.toString(@value);
						return @value;
					}
					
					
					case 1801622666:
					{
						this.fixtures = ((global::haxe.ds.StringMap<object>) (global::haxe.ds.StringMap<object>.__hx_cast<object>(((global::haxe.ds.StringMap) (@value) ))) );
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
					case 992442663:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "methodNames", 992442663)) );
					}
					
					
					case 1071652316:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "exists", 1071652316)) );
					}
					
					
					case 5144726:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "get", 5144726)) );
					}
					
					
					case 4846113:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "add", 4846113)) );
					}
					
					
					case 67859999:
					{
						return this.stats;
					}
					
					
					case 641535602:
					{
						return this.methods;
					}
					
					
					case 1413779326:
					{
						return this.hasTeardown;
					}
					
					
					case 109574339:
					{
						return this.hasSetup;
					}
					
					
					case 1813879407:
					{
						return this.teardownName;
					}
					
					
					case 596496232:
					{
						return this.setupName;
					}
					
					
					case 1547539107:
					{
						return this.className;
					}
					
					
					case 1801622666:
					{
						return this.fixtures;
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
					case 641535602:
					{
						return ((double) (this.methods) );
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
					case 992442663:
					{
						return this.methodNames(global::haxe.lang.Null<object>.ofDynamic<bool>(dynargs[0]));
					}
					
					
					case 1071652316:
					{
						return this.exists(global::haxe.lang.Runtime.toString(dynargs[0]));
					}
					
					
					case 5144726:
					{
						return this.@get(global::haxe.lang.Runtime.toString(dynargs[0]));
					}
					
					
					case 4846113:
					{
						this.@add(((global::utest.ui.common.FixtureResult) (dynargs[0]) ));
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
			baseArr.push("stats");
			baseArr.push("methods");
			baseArr.push("hasTeardown");
			baseArr.push("hasSetup");
			baseArr.push("teardownName");
			baseArr.push("setupName");
			baseArr.push("className");
			baseArr.push("fixtures");
			{
				base.__hx_getFields(baseArr);
			}
			
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace utest.ui.common {
	public class ClassResult_methodNames_49__Fun : global::haxe.lang.Function {
		
		public ClassResult_methodNames_49__Fun(global::utest.ui.common.ClassResult me) : base(2, 1) {
			this.me = me;
		}
		
		
		public override double __hx_invoke2_f(double __fn_float1, object __fn_dyn1, double __fn_float2, object __fn_dyn2) {
			unchecked {
				string b = ( (( __fn_dyn2 == global::haxe.lang.Runtime.undefined )) ? (global::haxe.lang.Runtime.toString(__fn_float2)) : (global::haxe.lang.Runtime.toString(__fn_dyn2)) );
				string a = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (global::haxe.lang.Runtime.toString(__fn_float1)) : (global::haxe.lang.Runtime.toString(__fn_dyn1)) );
				global::utest.ui.common.ResultStats @as = this.me.@get(a).stats;
				global::utest.ui.common.ResultStats bs = this.me.@get(b).stats;
				if (@as.hasErrors) {
					if ( ! (bs.hasErrors) ) {
						return ((double) (-1) );
					}
					else if (( @as.errors == bs.errors )) {
						return ((double) (global::Reflect.compare<object>(((object) (a) ), ((object) (b) ))) );
					}
					else {
						return ((double) (global::Reflect.compare<int>(((int) (@as.errors) ), ((int) (bs.errors) ))) );
					}
					
				}
				else if (bs.hasErrors) {
					return ((double) (1) );
				}
				else if (@as.hasFailures) {
					if ( ! (bs.hasFailures) ) {
						return ((double) (-1) );
					}
					else if (( @as.failures == bs.failures )) {
						return ((double) (global::Reflect.compare<object>(((object) (a) ), ((object) (b) ))) );
					}
					else {
						return ((double) (global::Reflect.compare<int>(((int) (@as.failures) ), ((int) (bs.failures) ))) );
					}
					
				}
				else if (bs.hasFailures) {
					return ((double) (1) );
				}
				else if (@as.hasWarnings) {
					if ( ! (bs.hasWarnings) ) {
						return ((double) (-1) );
					}
					else if (( @as.warnings == bs.warnings )) {
						return ((double) (global::Reflect.compare<object>(((object) (a) ), ((object) (b) ))) );
					}
					else {
						return ((double) (global::Reflect.compare<int>(((int) (@as.warnings) ), ((int) (bs.warnings) ))) );
					}
					
				}
				else if (bs.hasWarnings) {
					return ((double) (1) );
				}
				else {
					return ((double) (global::Reflect.compare<object>(((object) (a) ), ((object) (b) ))) );
				}
				
			}
		}
		
		
		public global::utest.ui.common.ClassResult me;
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace utest.ui.common {
	public class ClassResult_methodNames_69__Fun : global::haxe.lang.Function {
		
		public ClassResult_methodNames_69__Fun() : base(2, 1) {
		}
		
		
		public static global::utest.ui.common.ClassResult_methodNames_69__Fun __hx_current;
		
		public override double __hx_invoke2_f(double __fn_float1, object __fn_dyn1, double __fn_float2, object __fn_dyn2) {
			string b1 = ( (( __fn_dyn2 == global::haxe.lang.Runtime.undefined )) ? (global::haxe.lang.Runtime.toString(__fn_float2)) : (global::haxe.lang.Runtime.toString(__fn_dyn2)) );
			string a1 = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (global::haxe.lang.Runtime.toString(__fn_float1)) : (global::haxe.lang.Runtime.toString(__fn_dyn1)) );
			return ((double) (global::Reflect.compare<object>(((object) (a1) ), ((object) (b1) ))) );
		}
		
		
	}
}


