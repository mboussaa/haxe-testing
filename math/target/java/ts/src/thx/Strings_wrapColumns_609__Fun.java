// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Strings_wrapColumns_609__Fun extends haxe.lang.Function
{
	public Strings_wrapColumns_609__Fun(java.lang.String newline, java.lang.String indent, int __temp_columns109)
	{
		//line 610 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Strings.hx"
		super(1, 0);
		//line 610 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Strings.hx"
		this.newline = newline;
		//line 610 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Strings.hx"
		this.indent = indent;
		//line 610 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Strings.hx"
		this.__temp_columns109 = __temp_columns109;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 609 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Strings.hx"
		java.lang.String part = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (haxe.lang.Runtime.toString(__fn_float1)) : (haxe.lang.Runtime.toString(__fn_dyn1)) );
		//line 610 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Strings.hx"
		return thx.Strings.wrapLine(thx.Strings.WSG.replace(part, " ").trim(), this.__temp_columns109, this.indent, this.newline);
	}
	
	
	public java.lang.String newline;
	
	public java.lang.String indent;
	
	public int __temp_columns109;
	
}


