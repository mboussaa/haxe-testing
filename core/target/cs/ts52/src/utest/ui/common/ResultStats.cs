// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace utest.ui.common {
	public class ResultStats : global::haxe.lang.HxObject {
		
		public ResultStats(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public ResultStats() {
			global::utest.ui.common.ResultStats.__hx_ctor_utest_ui_common_ResultStats(this);
		}
		
		
		public static void __hx_ctor_utest_ui_common_ResultStats(global::utest.ui.common.ResultStats __temp_me156) {
			__temp_me156.assertations = 0;
			__temp_me156.successes = 0;
			__temp_me156.failures = 0;
			__temp_me156.errors = 0;
			__temp_me156.warnings = 0;
			__temp_me156.isOk = true;
			__temp_me156.hasFailures = false;
			__temp_me156.hasErrors = false;
			__temp_me156.hasWarnings = false;
			__temp_me156.onAddSuccesses = new global::utest.Dispatcher<int>();
			__temp_me156.onAddFailures = new global::utest.Dispatcher<int>();
			__temp_me156.onAddErrors = new global::utest.Dispatcher<int>();
			__temp_me156.onAddWarnings = new global::utest.Dispatcher<int>();
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::utest.ui.common.ResultStats(global::haxe.lang.EmptyObject.EMPTY);
		}
		
		
		public static new object __hx_create(global::Array arr) {
			return new global::utest.ui.common.ResultStats();
		}
		
		
		public int assertations;
		
		public int successes;
		
		public int failures;
		
		public int errors;
		
		public int warnings;
		
		public global::utest.Dispatcher<int> onAddSuccesses;
		
		public global::utest.Dispatcher<int> onAddFailures;
		
		public global::utest.Dispatcher<int> onAddErrors;
		
		public global::utest.Dispatcher<int> onAddWarnings;
		
		public bool isOk;
		
		public bool hasFailures;
		
		public bool hasErrors;
		
		public bool hasWarnings;
		
		public virtual void addSuccesses(int v) {
			if (( v == 0 )) {
				return;
			}
			
			this.assertations += v;
			this.successes += v;
			this.onAddSuccesses.dispatch(v);
		}
		
		
		public virtual void addFailures(int v) {
			if (( v == 0 )) {
				return;
			}
			
			this.assertations += v;
			this.failures += v;
			this.hasFailures = ( this.failures > 0 );
			this.isOk =  ! ((( ( this.hasFailures || this.hasErrors ) || this.hasWarnings ))) ;
			this.onAddFailures.dispatch(v);
		}
		
		
		public virtual void addErrors(int v) {
			if (( v == 0 )) {
				return;
			}
			
			this.assertations += v;
			this.errors += v;
			this.hasErrors = ( this.errors > 0 );
			this.isOk =  ! ((( ( this.hasFailures || this.hasErrors ) || this.hasWarnings ))) ;
			this.onAddErrors.dispatch(v);
		}
		
		
		public virtual void addWarnings(int v) {
			if (( v == 0 )) {
				return;
			}
			
			this.assertations += v;
			this.warnings += v;
			this.hasWarnings = ( this.warnings > 0 );
			this.isOk =  ! ((( ( this.hasFailures || this.hasErrors ) || this.hasWarnings ))) ;
			this.onAddWarnings.dispatch(v);
		}
		
		
		public virtual void sum(global::utest.ui.common.ResultStats other) {
			this.addSuccesses(other.successes);
			this.addFailures(other.failures);
			this.addErrors(other.errors);
			this.addWarnings(other.warnings);
		}
		
		
		public virtual void subtract(global::utest.ui.common.ResultStats other) {
			this.addSuccesses( - (other.successes) );
			this.addFailures( - (other.failures) );
			this.addErrors( - (other.errors) );
			this.addWarnings( - (other.warnings) );
		}
		
		
		public virtual void wire(global::utest.ui.common.ResultStats dependant) {
			dependant.onAddSuccesses.@add(((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "addSuccesses", 63559312)) ));
			dependant.onAddFailures.@add(((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "addFailures", 897845290)) ));
			dependant.onAddErrors.@add(((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "addErrors", 160217260)) ));
			dependant.onAddWarnings.@add(((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "addWarnings", 971992536)) ));
			this.sum(dependant);
		}
		
		
		public virtual void unwire(global::utest.ui.common.ResultStats dependant) {
			dependant.onAddSuccesses.@remove(((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "addSuccesses", 63559312)) ));
			dependant.onAddFailures.@remove(((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "addFailures", 897845290)) ));
			dependant.onAddErrors.@remove(((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "addErrors", 160217260)) ));
			dependant.onAddWarnings.@remove(((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "addWarnings", 971992536)) ));
			this.subtract(dependant);
		}
		
		
		public override double __hx_setField_f(string field, int hash, double @value, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 143865495:
					{
						this.warnings = ((int) (@value) );
						return @value;
					}
					
					
					case 1365803947:
					{
						this.errors = ((int) (@value) );
						return @value;
					}
					
					
					case 69718249:
					{
						this.failures = ((int) (@value) );
						return @value;
					}
					
					
					case 74822897:
					{
						this.successes = ((int) (@value) );
						return @value;
					}
					
					
					case 288025444:
					{
						this.assertations = ((int) (@value) );
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
					case 1531583505:
					{
						this.hasWarnings = global::haxe.lang.Runtime.toBool(@value);
						return @value;
					}
					
					
					case 307312293:
					{
						this.hasErrors = global::haxe.lang.Runtime.toBool(@value);
						return @value;
					}
					
					
					case 1457436259:
					{
						this.hasFailures = global::haxe.lang.Runtime.toBool(@value);
						return @value;
					}
					
					
					case 1170141094:
					{
						this.isOk = global::haxe.lang.Runtime.toBool(@value);
						return @value;
					}
					
					
					case 484018937:
					{
						this.onAddWarnings = ((global::utest.Dispatcher<int>) (global::utest.Dispatcher<object>.__hx_cast<int>(((global::utest.Dispatcher) (@value) ))) );
						return @value;
					}
					
					
					case 735026061:
					{
						this.onAddErrors = ((global::utest.Dispatcher<int>) (global::utest.Dispatcher<object>.__hx_cast<int>(((global::utest.Dispatcher) (@value) ))) );
						return @value;
					}
					
					
					case 409871691:
					{
						this.onAddFailures = ((global::utest.Dispatcher<int>) (global::utest.Dispatcher<object>.__hx_cast<int>(((global::utest.Dispatcher) (@value) ))) );
						return @value;
					}
					
					
					case 767112783:
					{
						this.onAddSuccesses = ((global::utest.Dispatcher<int>) (global::utest.Dispatcher<object>.__hx_cast<int>(((global::utest.Dispatcher) (@value) ))) );
						return @value;
					}
					
					
					case 143865495:
					{
						this.warnings = ((int) (global::haxe.lang.Runtime.toInt(@value)) );
						return @value;
					}
					
					
					case 1365803947:
					{
						this.errors = ((int) (global::haxe.lang.Runtime.toInt(@value)) );
						return @value;
					}
					
					
					case 69718249:
					{
						this.failures = ((int) (global::haxe.lang.Runtime.toInt(@value)) );
						return @value;
					}
					
					
					case 74822897:
					{
						this.successes = ((int) (global::haxe.lang.Runtime.toInt(@value)) );
						return @value;
					}
					
					
					case 288025444:
					{
						this.assertations = ((int) (global::haxe.lang.Runtime.toInt(@value)) );
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
					case 1825405726:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "unwire", 1825405726)) );
					}
					
					
					case 1324905541:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "wire", 1324905541)) );
					}
					
					
					case 2014410004:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "subtract", 2014410004)) );
					}
					
					
					case 5745035:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "sum", 5745035)) );
					}
					
					
					case 971992536:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "addWarnings", 971992536)) );
					}
					
					
					case 160217260:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "addErrors", 160217260)) );
					}
					
					
					case 897845290:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "addFailures", 897845290)) );
					}
					
					
					case 63559312:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "addSuccesses", 63559312)) );
					}
					
					
					case 1531583505:
					{
						return this.hasWarnings;
					}
					
					
					case 307312293:
					{
						return this.hasErrors;
					}
					
					
					case 1457436259:
					{
						return this.hasFailures;
					}
					
					
					case 1170141094:
					{
						return this.isOk;
					}
					
					
					case 484018937:
					{
						return this.onAddWarnings;
					}
					
					
					case 735026061:
					{
						return this.onAddErrors;
					}
					
					
					case 409871691:
					{
						return this.onAddFailures;
					}
					
					
					case 767112783:
					{
						return this.onAddSuccesses;
					}
					
					
					case 143865495:
					{
						return this.warnings;
					}
					
					
					case 1365803947:
					{
						return this.errors;
					}
					
					
					case 69718249:
					{
						return this.failures;
					}
					
					
					case 74822897:
					{
						return this.successes;
					}
					
					
					case 288025444:
					{
						return this.assertations;
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
					case 143865495:
					{
						return ((double) (this.warnings) );
					}
					
					
					case 1365803947:
					{
						return ((double) (this.errors) );
					}
					
					
					case 69718249:
					{
						return ((double) (this.failures) );
					}
					
					
					case 74822897:
					{
						return ((double) (this.successes) );
					}
					
					
					case 288025444:
					{
						return ((double) (this.assertations) );
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
					case 1825405726:
					{
						this.unwire(((global::utest.ui.common.ResultStats) (dynargs[0]) ));
						break;
					}
					
					
					case 1324905541:
					{
						this.wire(((global::utest.ui.common.ResultStats) (dynargs[0]) ));
						break;
					}
					
					
					case 2014410004:
					{
						this.subtract(((global::utest.ui.common.ResultStats) (dynargs[0]) ));
						break;
					}
					
					
					case 5745035:
					{
						this.sum(((global::utest.ui.common.ResultStats) (dynargs[0]) ));
						break;
					}
					
					
					case 971992536:
					{
						this.addWarnings(((int) (global::haxe.lang.Runtime.toInt(dynargs[0])) ));
						break;
					}
					
					
					case 160217260:
					{
						this.addErrors(((int) (global::haxe.lang.Runtime.toInt(dynargs[0])) ));
						break;
					}
					
					
					case 897845290:
					{
						this.addFailures(((int) (global::haxe.lang.Runtime.toInt(dynargs[0])) ));
						break;
					}
					
					
					case 63559312:
					{
						this.addSuccesses(((int) (global::haxe.lang.Runtime.toInt(dynargs[0])) ));
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
			baseArr.push("hasWarnings");
			baseArr.push("hasErrors");
			baseArr.push("hasFailures");
			baseArr.push("isOk");
			baseArr.push("onAddWarnings");
			baseArr.push("onAddErrors");
			baseArr.push("onAddFailures");
			baseArr.push("onAddSuccesses");
			baseArr.push("warnings");
			baseArr.push("errors");
			baseArr.push("failures");
			baseArr.push("successes");
			baseArr.push("assertations");
			{
				base.__hx_getFields(baseArr);
			}
			
		}
		
		
	}
}

