// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
public class StringBuf : global::haxe.lang.HxObject {
	
	public StringBuf(global::haxe.lang.EmptyObject empty) {
	}
	
	
	public StringBuf() {
		global::StringBuf.__hx_ctor__StringBuf(this);
	}
	
	
	public static void __hx_ctor__StringBuf(global::StringBuf __temp_me15) {
		__temp_me15.b = new global::System.Text.StringBuilder();
	}
	
	
	public static new object __hx_createEmpty() {
		return new global::StringBuf(global::haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static new object __hx_create(global::Array arr) {
		return new global::StringBuf();
	}
	
	
	public global::System.Text.StringBuilder b;
	
	
	
	public override object __hx_setField(string field, int hash, object @value, bool handleProperties) {
		unchecked {
			switch (hash) {
				case 98:
				{
					this.b = ((global::System.Text.StringBuilder) (@value) );
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
				case 98:
				{
					return this.b;
				}
				
				
				default:
				{
					return base.__hx_getField(field, hash, throwErrors, isCheck, handleProperties);
				}
				
			}
			
		}
	}
	
	
	public override void __hx_getFields(global::Array<object> baseArr) {
		baseArr.push("length");
		baseArr.push("b");
		{
			base.__hx_getFields(baseArr);
		}
		
	}
	
	
}


