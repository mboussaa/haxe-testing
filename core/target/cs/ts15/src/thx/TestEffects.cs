// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class TestEffects : global::haxe.lang.HxObject {
		
		public TestEffects(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public TestEffects(int i) {
			global::thx.TestEffects.__hx_ctor_thx_TestEffects(this, i);
		}
		
		
		public static void __hx_ctor_thx_TestEffects(global::thx.TestEffects __temp_me39, int i) {
			__temp_me39.x = i;
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::thx.TestEffects(((global::haxe.lang.EmptyObject) (global::haxe.lang.EmptyObject.EMPTY) ));
		}
		
		
		public static new object __hx_create(global::Array arr) {
			return new global::thx.TestEffects(((int) (global::haxe.lang.Runtime.toInt(arr[0])) ));
		}
		
		
		public int x;
		
		public object logged;
		
		public global::haxe.lang.Function oldLogger;
		
		public virtual void logger(object msg, object infos) {
			this.logged = msg;
		}
		
		
		public virtual void setup() {
			this.logged = null;
			this.oldLogger = global::thx.Effects.logger;
			global::thx.Effects.logger = ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "logger", 1550374544)) );
		}
		
		
		public virtual void teardown() {
			global::thx.Effects.logger = this.oldLogger;
		}
		
		
		public virtual void testEffectsLog() {
			unchecked {
				int _g1 = 0;
				int _g = this.x;
				while (( _g1 < _g )) {
					 ++ _g1;
					global::utest.Assert.isNull(this.logged, null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testEffectsLog", "thx.TestEffects", "TestEffects.hx"}, new int[]{1981972957}, new double[]{((double) (30) )}));
					object a2 = new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testEffectsLog", "thx.TestEffects", "TestEffects.hx"}, new int[]{1981972957}, new double[]{((double) (32) )});
					(new global::thx.TestEffects_testEffectsLog_32__Fun(a2)).__hx_invoke1_o(((double) (2) ), global::haxe.lang.Runtime.undefined);
					global::utest.Assert.@equals(2, 2, null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testEffectsLog", "thx.TestEffects", "TestEffects.hx"}, new int[]{1981972957}, new double[]{((double) (33) )}));
					global::utest.Assert.@equals(2, this.logged, null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testEffectsLog", "thx.TestEffects", "TestEffects.hx"}, new int[]{1981972957}, new double[]{((double) (34) )}));
				}
				
			}
		}
		
		
		public override double __hx_setField_f(string field, int hash, double @value, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 1550374530:
					{
						this.logged = ((object) (@value) );
						return @value;
					}
					
					
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
					case 1733581463:
					{
						this.oldLogger = ((global::haxe.lang.Function) (@value) );
						return @value;
					}
					
					
					case 1550374530:
					{
						this.logged = ((object) (@value) );
						return @value;
					}
					
					
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
					case 1738748884:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testEffectsLog", 1738748884)) );
					}
					
					
					case 26061316:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "teardown", 26061316)) );
					}
					
					
					case 2049945213:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "setup", 2049945213)) );
					}
					
					
					case 1550374544:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "logger", 1550374544)) );
					}
					
					
					case 1733581463:
					{
						return this.oldLogger;
					}
					
					
					case 1550374530:
					{
						return this.logged;
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
					case 1550374530:
					{
						return ((double) (global::haxe.lang.Runtime.toDouble(this.logged)) );
					}
					
					
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
					case 1738748884:
					{
						this.testEffectsLog();
						break;
					}
					
					
					case 26061316:
					{
						this.teardown();
						break;
					}
					
					
					case 2049945213:
					{
						this.setup();
						break;
					}
					
					
					case 1550374544:
					{
						this.logger(dynargs[0], dynargs[1]);
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
			baseArr.push("oldLogger");
			baseArr.push("logged");
			baseArr.push("x");
			{
				base.__hx_getFields(baseArr);
			}
			
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class TestEffects_testEffectsLog_32__Fun : global::haxe.lang.Function {
		
		public TestEffects_testEffectsLog_32__Fun(object a2) : base(1, 0) {
			this.a2 = a2;
		}
		
		
		public override object __hx_invoke1_o(double __fn_float1, object __fn_dyn1) {
			object a1 = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((object) (__fn_float1) )) : (((object) (__fn_dyn1) )) );
			global::thx.Effects.logger.__hx_invoke2_o(default(double), a1, default(double), this.a2);
			return null;
		}
		
		
		public object a2;
		
	}
}

