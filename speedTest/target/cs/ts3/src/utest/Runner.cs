// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace utest {
	public class Runner : global::haxe.lang.HxObject {
		
		public Runner(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public Runner() {
			global::utest.Runner.__hx_ctor_utest_Runner(this);
		}
		
		
		public static void __hx_ctor_utest_Runner(global::utest.Runner __temp_me42) {
			__temp_me42.globalPattern = null;
			__temp_me42.fixtures = new global::Array<object>();
			__temp_me42.onProgress = new global::utest.Dispatcher<object>();
			__temp_me42.onStart = new global::utest.Dispatcher<object>();
			__temp_me42.onComplete = new global::utest.Dispatcher<object>();
			__temp_me42.onPrecheck = new global::utest.Dispatcher<object>();
			__temp_me42.onTestStart = new global::utest.Dispatcher<object>();
			__temp_me42.onTestComplete = new global::utest.Dispatcher<object>();
			__temp_me42.length = 0;
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::utest.Runner(global::haxe.lang.EmptyObject.EMPTY);
		}
		
		
		public static new object __hx_create(global::Array arr) {
			return new global::utest.Runner();
		}
		
		
		public global::Array<object> fixtures;
		
		public global::utest.Dispatcher<object> onProgress;
		
		public global::utest.Dispatcher<object> onStart;
		
		public global::utest.Dispatcher<object> onComplete;
		
		public global::utest.Dispatcher<object> onPrecheck;
		
		public global::utest.Dispatcher<object> onTestStart;
		
		public global::utest.Dispatcher<object> onTestComplete;
		
		public int length;
		
		public global::EReg globalPattern;
		
		public virtual void addCase(object test, string setup, string teardown, string prefix, global::EReg pattern) {
			if (string.Equals(prefix, null)) {
				prefix = "test";
			}
			
			if (string.Equals(teardown, null)) {
				teardown = "teardown";
			}
			
			if (string.Equals(setup, null)) {
				setup = "setup";
			}
			
			if ( ! (global::Reflect.isObject(test)) ) {
				throw global::haxe.lang.HaxeException.wrap("can\'t add a null object as a test case");
			}
			
			if ( ! (this.isMethod(test, setup)) ) {
				setup = null;
			}
			
			if ( ! (this.isMethod(test, teardown)) ) {
				teardown = null;
			}
			
			global::Array<object> fields = global::Type.getInstanceFields(global::Type.getClass<object>(((object) (test) )));
			if (( ( this.globalPattern == null ) && ( pattern == null ) )) {
				int _g = 0;
				while (( _g < fields.length )) {
					string field = global::haxe.lang.Runtime.toString(fields[_g]);
					 ++ _g;
					if ( ! (field.StartsWith(prefix)) ) {
						continue;
					}
					
					if ( ! (this.isMethod(test, field)) ) {
						continue;
					}
					
					this.addFixture(new global::utest.TestFixture(test, field, setup, teardown));
				}
				
			}
			else {
				if (( this.globalPattern != null )) {
					pattern = this.globalPattern;
				}
				else {
					pattern = pattern;
				}
				
				{
					int _g1 = 0;
					while (( _g1 < fields.length )) {
						string field1 = global::haxe.lang.Runtime.toString(fields[_g1]);
						 ++ _g1;
						if ( ! (pattern.match(field1)) ) {
							continue;
						}
						
						if ( ! (this.isMethod(test, field1)) ) {
							continue;
						}
						
						this.addFixture(new global::utest.TestFixture(test, field1, setup, teardown));
					}
					
				}
				
			}
			
		}
		
		
		public virtual void addFixture(global::utest.TestFixture fixture) {
			this.fixtures.push(fixture);
			this.length++;
		}
		
		
		public virtual global::utest.TestFixture getFixture(int index) {
			return ((global::utest.TestFixture) (this.fixtures[index]) );
		}
		
		
		public virtual bool isMethod(object test, string name) {
			try {
				return ( global::Reflect.field(test, name) is global::haxe.lang.Function );
			}
			catch (global::System.Exception __temp_catchallException1){
				global::haxe.lang.Exceptions.exception = __temp_catchallException1;
				object __temp_catchall2 = __temp_catchallException1;
				if (( __temp_catchall2 is global::haxe.lang.HaxeException )) {
					__temp_catchall2 = ((global::haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
				}
				
				{
					object e = __temp_catchall2;
					return false;
				}
				
			}
			
			
		}
		
		
		public int pos;
		
		public virtual void run() {
			this.pos = 0;
			this.onStart.dispatch(this);
			this.runNext();
		}
		
		
		public virtual void runNext() {
			if (( this.fixtures.length > this.pos )) {
				this.runFixture(((global::utest.TestFixture) (this.fixtures[this.pos++]) ));
			}
			else {
				this.onComplete.dispatch(this);
			}
			
		}
		
		
		public virtual void runFixture(global::utest.TestFixture fixture) {
			global::utest.TestHandler<object> handler = new global::utest.TestHandler<object>(((global::utest.TestFixture) (fixture) ));
			handler.onComplete.@add(((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testComplete", 1926178603)) ));
			handler.onPrecheck.@add(((global::haxe.lang.Function) (new global::haxe.lang.Closure(this.onPrecheck, "dispatch", 509857466)) ));
			this.onTestStart.dispatch(handler);
			handler.execute();
		}
		
		
		public virtual void testComplete(global::utest.TestHandler<object> h) {
			this.onTestComplete.dispatch(h);
			object __temp_stmt2 = null;
			{
				global::utest.TestResult __temp_odecl1 = global::utest.TestResult.ofHandler(h);
				__temp_stmt2 = new global::haxe.lang.DynamicObject(new int[]{142895325}, new object[]{__temp_odecl1}, new int[]{399964207, 1114501250}, new double[]{((double) (this.length) ), ((double) (this.pos) )});
			}
			
			this.onProgress.dispatch(__temp_stmt2);
			this.runNext();
		}
		
		
		public override double __hx_setField_f(string field, int hash, double @value, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 5594516:
					{
						this.pos = ((int) (@value) );
						return @value;
					}
					
					
					case 520590566:
					{
						this.length = ((int) (@value) );
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
					case 5594516:
					{
						this.pos = ((int) (global::haxe.lang.Runtime.toInt(@value)) );
						return @value;
					}
					
					
					case 934297389:
					{
						this.globalPattern = ((global::EReg) (@value) );
						return @value;
					}
					
					
					case 520590566:
					{
						this.length = ((int) (global::haxe.lang.Runtime.toInt(@value)) );
						return @value;
					}
					
					
					case 482248426:
					{
						this.onTestComplete = ((global::utest.Dispatcher<object>) (global::utest.Dispatcher<object>.__hx_cast<object>(((global::utest.Dispatcher) (@value) ))) );
						return @value;
					}
					
					
					case 1867552145:
					{
						this.onTestStart = ((global::utest.Dispatcher<object>) (global::utest.Dispatcher<object>.__hx_cast<object>(((global::utest.Dispatcher) (@value) ))) );
						return @value;
					}
					
					
					case 270118404:
					{
						this.onPrecheck = ((global::utest.Dispatcher<object>) (global::utest.Dispatcher<object>.__hx_cast<object>(((global::utest.Dispatcher) (@value) ))) );
						return @value;
					}
					
					
					case 1568593144:
					{
						this.onComplete = ((global::utest.Dispatcher<object>) (global::utest.Dispatcher<object>.__hx_cast<object>(((global::utest.Dispatcher) (@value) ))) );
						return @value;
					}
					
					
					case 440996547:
					{
						this.onStart = ((global::utest.Dispatcher<object>) (global::utest.Dispatcher<object>.__hx_cast<object>(((global::utest.Dispatcher) (@value) ))) );
						return @value;
					}
					
					
					case 1675742188:
					{
						this.onProgress = ((global::utest.Dispatcher<object>) (global::utest.Dispatcher<object>.__hx_cast<object>(((global::utest.Dispatcher) (@value) ))) );
						return @value;
					}
					
					
					case 1801622666:
					{
						this.fixtures = ((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (@value) ))) );
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
					case 1926178603:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testComplete", 1926178603)) );
					}
					
					
					case 1553877950:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "runFixture", 1553877950)) );
					}
					
					
					case 1447008734:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "runNext", 1447008734)) );
					}
					
					
					case 5695307:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "run", 5695307)) );
					}
					
					
					case 5594516:
					{
						return this.pos;
					}
					
					
					case 1640272491:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "isMethod", 1640272491)) );
					}
					
					
					case 1099121107:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "getFixture", 1099121107)) );
					}
					
					
					case 1504438184:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "addFixture", 1504438184)) );
					}
					
					
					case 2113364337:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "addCase", 2113364337)) );
					}
					
					
					case 934297389:
					{
						return this.globalPattern;
					}
					
					
					case 520590566:
					{
						return this.length;
					}
					
					
					case 482248426:
					{
						return this.onTestComplete;
					}
					
					
					case 1867552145:
					{
						return this.onTestStart;
					}
					
					
					case 270118404:
					{
						return this.onPrecheck;
					}
					
					
					case 1568593144:
					{
						return this.onComplete;
					}
					
					
					case 440996547:
					{
						return this.onStart;
					}
					
					
					case 1675742188:
					{
						return this.onProgress;
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
					case 5594516:
					{
						return ((double) (this.pos) );
					}
					
					
					case 520590566:
					{
						return ((double) (this.length) );
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
					case 1926178603:
					{
						this.testComplete(((global::utest.TestHandler<object>) (global::utest.TestHandler<object>.__hx_cast<object>(((global::utest.TestHandler) (dynargs[0]) ))) ));
						break;
					}
					
					
					case 1553877950:
					{
						this.runFixture(((global::utest.TestFixture) (dynargs[0]) ));
						break;
					}
					
					
					case 1447008734:
					{
						this.runNext();
						break;
					}
					
					
					case 5695307:
					{
						this.run();
						break;
					}
					
					
					case 1640272491:
					{
						return this.isMethod(dynargs[0], global::haxe.lang.Runtime.toString(dynargs[1]));
					}
					
					
					case 1099121107:
					{
						return this.getFixture(((int) (global::haxe.lang.Runtime.toInt(dynargs[0])) ));
					}
					
					
					case 1504438184:
					{
						this.addFixture(((global::utest.TestFixture) (dynargs[0]) ));
						break;
					}
					
					
					case 2113364337:
					{
						this.addCase(dynargs[0], global::haxe.lang.Runtime.toString(dynargs[1]), global::haxe.lang.Runtime.toString(dynargs[2]), global::haxe.lang.Runtime.toString(dynargs[3]), ((global::EReg) (dynargs[4]) ));
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
			baseArr.push("pos");
			baseArr.push("globalPattern");
			baseArr.push("length");
			baseArr.push("onTestComplete");
			baseArr.push("onTestStart");
			baseArr.push("onPrecheck");
			baseArr.push("onComplete");
			baseArr.push("onStart");
			baseArr.push("onProgress");
			baseArr.push("fixtures");
			{
				base.__hx_getFields(baseArr);
			}
			
		}
		
		
	}
}


