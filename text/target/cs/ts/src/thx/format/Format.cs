// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx.format {
	public class Format : global::haxe.lang.HxObject {
		
		public Format(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public Format() {
			global::thx.format.Format.__hx_ctor_thx_format_Format(this);
		}
		
		
		public static void __hx_ctor_thx_format_Format(global::thx.format.Format __temp_me160) {
		}
		
		
		public static global::thx.culture.Culture defaultCulture;
		
		public static global::thx.culture.Culture get_defaultCulture() {
			if (( null != global::thx.format.Format.defaultCulture )) {
				return global::thx.format.Format.defaultCulture;
			}
			else {
				return global::thx.culture.Culture.invariant;
			}
			
		}
		
		
		public static global::thx.culture.Culture set_defaultCulture(global::thx.culture.Culture culture) {
			global::thx.format.Format.defaultCulture = culture;
			return global::thx.format.Format.get_defaultCulture();
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::thx.format.Format(global::haxe.lang.EmptyObject.EMPTY);
		}
		
		
		public static new object __hx_create(global::Array arr) {
			return new global::thx.format.Format();
		}
		
		
	}
}


