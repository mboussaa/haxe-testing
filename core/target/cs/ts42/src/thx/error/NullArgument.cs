// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx.error {
	public class NullArgument : global::thx.Error {
		
		public NullArgument(global::haxe.lang.EmptyObject empty) : base(global::haxe.lang.EmptyObject.EMPTY) {
		}
		
		
		public NullArgument(string message, object posInfo) : base(global::haxe.lang.EmptyObject.EMPTY) {
			global::thx.error.NullArgument.__hx_ctor_thx_error_NullArgument(this, message, posInfo);
		}
		
		
		public static void __hx_ctor_thx_error_NullArgument(global::thx.error.NullArgument __temp_me182, string message, object posInfo) {
			global::thx.Error.__hx_ctor_thx_Error(__temp_me182, message, null, posInfo);
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::thx.error.NullArgument(global::haxe.lang.EmptyObject.EMPTY);
		}
		
		
		public static new object __hx_create(global::Array arr) {
			unchecked {
				return new global::thx.error.NullArgument(global::haxe.lang.Runtime.toString(arr[0]), arr[1]);
			}
		}
		
		
	}
}


