// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace haxe.io {
	public class Bytes : global::haxe.lang.HxObject {
		
		public Bytes(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public Bytes(int length, byte[] b) {
			global::haxe.io.Bytes.__hx_ctor_haxe_io_Bytes(this, length, b);
		}
		
		
		public static void __hx_ctor_haxe_io_Bytes(global::haxe.io.Bytes __temp_me35, int length, byte[] b) {
			__temp_me35.length = length;
			__temp_me35.b = b;
		}
		
		
		public static global::haxe.io.Bytes alloc(int length) {
			return new global::haxe.io.Bytes(length, new byte[length]);
		}
		
		
		public static global::haxe.io.Bytes ofString(string s) {
			byte[] b = global::System.Text.Encoding.UTF8.GetBytes(((string) (s) ));
			return new global::haxe.io.Bytes(( b as global::System.Array ).Length, b);
		}
		
		
		public static global::haxe.io.Bytes ofData(byte[] b) {
			return new global::haxe.io.Bytes(( b as global::System.Array ).Length, b);
		}
		
		
		public static int fastGet(byte[] b, int pos) {
			return ((int) (b[pos]) );
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::haxe.io.Bytes(global::haxe.lang.EmptyObject.EMPTY);
		}
		
		
		public static new object __hx_create(global::Array arr) {
			unchecked {
				return new global::haxe.io.Bytes(((int) (global::haxe.lang.Runtime.toInt(arr[0])) ), ((byte[]) (arr[1]) ));
			}
		}
		
		
		public int length;
		
		public byte[] b;
		
		public override double __hx_setField_f(string field, int hash, double @value, bool handleProperties) {
			unchecked {
				switch (hash) {
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
					case 98:
					{
						this.b = ((byte[]) (@value) );
						return @value;
					}
					
					
					case 520590566:
					{
						this.length = ((int) (global::haxe.lang.Runtime.toInt(@value)) );
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
					
					
					case 520590566:
					{
						return this.length;
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
		
		
		public override void __hx_getFields(global::Array<object> baseArr) {
			baseArr.push("b");
			baseArr.push("length");
			{
				base.__hx_getFields(baseArr);
			}
			
		}
		
		
	}
}


