// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class Effects : global::haxe.lang.HxObject {
		
		static Effects() {
			global::thx.Effects.logger = ((global::haxe.lang.Function) (global::haxe.Log.trace) );
		}
		
		
		public Effects(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public Effects() {
			global::thx.Effects.__hx_ctor_thx_Effects(this);
		}
		
		
		public static void __hx_ctor_thx_Effects(global::thx.Effects __temp_me119) {
		}
		
		
		public static global::haxe.lang.Function logger;
		
		public static T tap<T, TAny>(T input, global::haxe.lang.Function f) {
			f.__hx_invoke1_o(default(double), input);
			return input;
		}
		
		
		public static T traced<T, TAny>(T input, global::haxe.lang.Function f) {
			unchecked {
				global::haxe.Log.trace.__hx_invoke2_o(default(double), global::haxe.lang.Runtime.toString(f.__hx_invoke1_o(default(double), input)), default(double), new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"traced", "thx.Effects", "Effects.hx"}, new int[]{1981972957}, new double[]{((double) (14) )}));
				return input;
			}
		}
		
		
		public static T log<T>(T input, object pos) {
			object a2 = pos;
			(new global::thx.Effects_log_19__Fun(a2)).__hx_invoke1_o(default(double), input);
			return global::haxe.lang.Runtime.genericCast<T>(input);
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::thx.Effects(global::haxe.lang.EmptyObject.EMPTY);
		}
		
		
		public static new object __hx_create(global::Array arr) {
			return new global::thx.Effects();
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class Effects_log_19__Fun : global::haxe.lang.Function {
		
		public Effects_log_19__Fun(object a2) : base(1, 0) {
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


