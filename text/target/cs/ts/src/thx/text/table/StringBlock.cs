// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx.text.table {
	public class StringBlock : global::haxe.lang.HxObject {
		
		public StringBlock(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public StringBlock(global::Array<object> lines) {
			global::thx.text.table.StringBlock.__hx_ctor_thx_text_table_StringBlock(this, lines);
		}
		
		
		public static void __hx_ctor_thx_text_table_StringBlock(global::thx.text.table.StringBlock __temp_me181, global::Array<object> lines) {
			__temp_me181.lines = lines;
			__temp_me181.width = ((int) (global::haxe.lang.Runtime.toInt(global::thx.Arrays.reduce<object, object>(((global::Array<object>) (lines) ), ((global::haxe.lang.Function) (( (( global::thx.text.table.StringBlock___hx_ctor_thx_text_table_StringBlock_24__Fun.__hx_current != null )) ? (global::thx.text.table.StringBlock___hx_ctor_thx_text_table_StringBlock_24__Fun.__hx_current) : (global::thx.text.table.StringBlock___hx_ctor_thx_text_table_StringBlock_24__Fun.__hx_current = ((global::thx.text.table.StringBlock___hx_ctor_thx_text_table_StringBlock_24__Fun) (new global::thx.text.table.StringBlock___hx_ctor_thx_text_table_StringBlock_24__Fun()) )) )) ), ((object) (0) )))) );
			__temp_me181.height = lines.length;
		}
		
		
		public static global::thx.text.table.StringBlock fromString(string s) {
			return new global::thx.text.table.StringBlock(((global::Array<object>) (new global::EReg("(\r\n|\n\r|\n|\r)", "g").split(s)) ));
		}
		
		
		public static global::thx.text.table.StringBlock empty() {
			return new global::thx.text.table.StringBlock(((global::Array<object>) (new global::Array<object>(new object[]{})) ));
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::thx.text.table.StringBlock(((global::haxe.lang.EmptyObject) (global::haxe.lang.EmptyObject.EMPTY) ));
		}
		
		
		public static new object __hx_create(global::Array arr) {
			return new global::thx.text.table.StringBlock(((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (arr[0]) ))) ));
		}
		
		
		public global::Array<object> lines;
		
		public int width;
		
		public int height;
		
		public virtual global::Array<object> getLine(int index) {
			if (( index >= this.height )) {
				return new global::Array<object>(new object[]{});
			}
			
			return global::haxe.lang.StringExt.split(global::haxe.lang.Runtime.toString(this.lines[index]), "");
		}
		
		
		public virtual int symbolPos(string s) {
			int max = 0;
			int pos = default(int);
			{
				int _g = 0;
				global::Array<object> _g1 = this.lines;
				while (( _g < _g1.length )) {
					string line = global::haxe.lang.Runtime.toString(_g1[_g]);
					 ++ _g;
					pos = global::haxe.lang.StringExt.lastIndexOf(line, s, default(global::haxe.lang.Null<int>));
					if (( pos <= 0 )) {
						continue;
					}
					
					int b = ( line.Length - pos );
					if (( max > b )) {
						max = max;
					}
					else {
						max = b;
					}
					
				}
				
			}
			
			return max;
		}
		
		
		public virtual string toString() {
			return this.lines.@join("\n");
		}
		
		
		public override double __hx_setField_f(string field, int hash, double @value, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 38537191:
					{
						this.height = ((int) (@value) );
						return @value;
					}
					
					
					case 1247983110:
					{
						this.width = ((int) (@value) );
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
					case 38537191:
					{
						this.height = ((int) (global::haxe.lang.Runtime.toInt(@value)) );
						return @value;
					}
					
					
					case 1247983110:
					{
						this.width = ((int) (global::haxe.lang.Runtime.toInt(@value)) );
						return @value;
					}
					
					
					case 1963056639:
					{
						this.lines = ((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (@value) ))) );
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
					case 946786476:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "toString", 946786476)) );
					}
					
					
					case 1610714396:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "symbolPos", 1610714396)) );
					}
					
					
					case 439732138:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "getLine", 439732138)) );
					}
					
					
					case 38537191:
					{
						return this.height;
					}
					
					
					case 1247983110:
					{
						return this.width;
					}
					
					
					case 1963056639:
					{
						return this.lines;
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
					case 38537191:
					{
						return ((double) (this.height) );
					}
					
					
					case 1247983110:
					{
						return ((double) (this.width) );
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
					case 946786476:
					{
						return this.toString();
					}
					
					
					case 1610714396:
					{
						return this.symbolPos(global::haxe.lang.Runtime.toString(dynargs[0]));
					}
					
					
					case 439732138:
					{
						return this.getLine(((int) (global::haxe.lang.Runtime.toInt(dynargs[0])) ));
					}
					
					
					default:
					{
						return base.__hx_invokeField(field, hash, dynargs);
					}
					
				}
				
			}
		}
		
		
		public override void __hx_getFields(global::Array<object> baseArr) {
			baseArr.push("height");
			baseArr.push("width");
			baseArr.push("lines");
			{
				base.__hx_getFields(baseArr);
			}
			
		}
		
		
		public override string ToString(){
			return this.toString();
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx.text.table {
	public class StringBlock___hx_ctor_thx_text_table_StringBlock_24__Fun : global::haxe.lang.Function {
		
		public StringBlock___hx_ctor_thx_text_table_StringBlock_24__Fun() : base(2, 1) {
		}
		
		
		public static global::thx.text.table.StringBlock___hx_ctor_thx_text_table_StringBlock_24__Fun __hx_current;
		
		public override double __hx_invoke2_f(double __fn_float1, object __fn_dyn1, double __fn_float2, object __fn_dyn2) {
			string line = ( (( __fn_dyn2 == global::haxe.lang.Runtime.undefined )) ? (global::haxe.lang.Runtime.toString(__fn_float2)) : (global::haxe.lang.Runtime.toString(__fn_dyn2)) );
			int width = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((int) (__fn_float1) )) : (((int) (global::haxe.lang.Runtime.toInt(__fn_dyn1)) )) );
			int b = line.Length;
			if (( width > b )) {
				return ((double) (width) );
			}
			else {
				return ((double) (b) );
			}
			
		}
		
		
	}
}


