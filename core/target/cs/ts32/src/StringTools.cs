// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
public class StringTools : global::haxe.lang.HxObject {
	
	public StringTools(global::haxe.lang.EmptyObject empty) {
	}
	
	
	public StringTools() {
		global::StringTools.__hx_ctor__StringTools(this);
	}
	
	
	public static void __hx_ctor__StringTools(global::StringTools __temp_me16) {
	}
	
	
	public static string replace(string s, string sub, string @by) {
		if (( sub.Length == 0 )) {
			return global::haxe.lang.StringExt.split(s, sub).@join(@by);
		}
		else {
			return s.Replace(sub, @by);
		}
		
	}
	
	
	public static new object __hx_createEmpty() {
		return new global::StringTools(global::haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static new object __hx_create(global::Array arr) {
		return new global::StringTools();
	}
	
	
}


