// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx.text.table {
	public class HAlign : global::haxe.lang.ParamEnum {
		
		public HAlign(int index, object[] @params) : base(index, @params) {
		}
		
		
		public static readonly string[] __hx_constructs = new string[]{"Left", "Right", "Center", "OnSymbol"};
		
		public static readonly global::thx.text.table.HAlign Left = new global::thx.text.table.HAlign(0, null);
		
		public static readonly global::thx.text.table.HAlign Right = new global::thx.text.table.HAlign(1, null);
		
		public static readonly global::thx.text.table.HAlign Center = new global::thx.text.table.HAlign(2, null);
		
		public static global::thx.text.table.HAlign OnSymbol(string symbol) {
			unchecked {
				return new global::thx.text.table.HAlign(3, new object[]{symbol});
			}
		}
		
		
		public override string getTag() {
			return global::thx.text.table.HAlign.__hx_constructs[this.index];
		}
		
		
	}
}


