// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
public sealed class EReg : global::haxe.lang.HxObject {
	
	public EReg(global::haxe.lang.EmptyObject empty) {
	}
	
	
	public EReg(string r, string opt) {
		global::EReg.__hx_ctor__EReg(this, r, opt);
	}
	
	
	public static void __hx_ctor__EReg(global::EReg __temp_me9, string r, string opt) {
		unchecked {
			int opts = ((int) (global::haxe.lang.Runtime.toInt(((object) (global::System.Text.RegularExpressions.RegexOptions.CultureInvariant) ))) );
			{
				int _g1 = 0;
				int _g = opt.Length;
				while (( _g1 < _g )) {
					int i = _g1++;
					{
						int _g2 = ((int) (opt[i]) );
						switch (_g2) {
							case 99:
							{
								opts |= ((int) (global::haxe.lang.Runtime.toInt(((object) (global::System.Text.RegularExpressions.RegexOptions.Compiled) ))) );
								break;
							}
							
							
							case 103:
							{
								__temp_me9.isGlobal = true;
								break;
							}
							
							
							case 105:
							{
								opts |= ((int) (global::haxe.lang.Runtime.toInt(((object) (global::System.Text.RegularExpressions.RegexOptions.IgnoreCase) ))) );
								break;
							}
							
							
							case 109:
							{
								opts |= ((int) (global::haxe.lang.Runtime.toInt(((object) (global::System.Text.RegularExpressions.RegexOptions.Multiline) ))) );
								break;
							}
							
							
						}
						
					}
					
				}
				
			}
			
			__temp_me9.regex = new global::System.Text.RegularExpressions.Regex(((string) (r) ), ((global::System.Text.RegularExpressions.RegexOptions) (((object) (opts) )) ));
		}
	}
	
	
	public static new object __hx_createEmpty() {
		return new global::EReg(global::haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static new object __hx_create(global::Array arr) {
		unchecked {
			return new global::EReg(global::haxe.lang.Runtime.toString(arr[0]), global::haxe.lang.Runtime.toString(arr[1]));
		}
	}
	
	
	public global::System.Text.RegularExpressions.Regex regex;
	
	public global::System.Text.RegularExpressions.Match m;
	
	public bool isGlobal;
	
	public string cur;
	
	public bool match(string s) {
		this.m = this.regex.Match(((string) (s) ));
		this.cur = s;
		return ( this.m as global::System.Text.RegularExpressions.Group ).Success;
	}
	
	
	public override object __hx_setField(string field, int hash, object @value, bool handleProperties) {
		unchecked {
			switch (hash) {
				case 4949376:
				{
					this.cur = global::haxe.lang.Runtime.toString(@value);
					return @value;
				}
				
				
				case 1821933:
				{
					this.isGlobal = global::haxe.lang.Runtime.toBool(@value);
					return @value;
				}
				
				
				case 109:
				{
					this.m = ((global::System.Text.RegularExpressions.Match) (@value) );
					return @value;
				}
				
				
				case 1723805383:
				{
					this.regex = ((global::System.Text.RegularExpressions.Regex) (@value) );
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
				case 52644165:
				{
					return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "match", 52644165)) );
				}
				
				
				case 4949376:
				{
					return this.cur;
				}
				
				
				case 1821933:
				{
					return this.isGlobal;
				}
				
				
				case 109:
				{
					return this.m;
				}
				
				
				case 1723805383:
				{
					return this.regex;
				}
				
				
				default:
				{
					return base.__hx_getField(field, hash, throwErrors, isCheck, handleProperties);
				}
				
			}
			
		}
	}
	
	
	public override object __hx_invokeField(string field, int hash, global::Array dynargs) {
		unchecked {
			switch (hash) {
				case 52644165:
				{
					return this.match(global::haxe.lang.Runtime.toString(dynargs[0]));
				}
				
				
				default:
				{
					return base.__hx_invokeField(field, hash, dynargs);
				}
				
			}
			
		}
	}
	
	
	public override void __hx_getFields(global::Array<object> baseArr) {
		baseArr.push("cur");
		baseArr.push("isGlobal");
		baseArr.push("m");
		baseArr.push("regex");
		{
			base.__hx_getFields(baseArr);
		}
		
	}
	
	
}

