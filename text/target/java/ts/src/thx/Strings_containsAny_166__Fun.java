// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Strings_containsAny_166__Fun extends haxe.lang.Function
{
	public Strings_containsAny_166__Fun(java.lang.String s1)
	{
		//line 166 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Strings.hx"
		super(1, 0);
		//line 166 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Strings.hx"
		this.s1 = s1;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 166 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Strings.hx"
		java.lang.String a1 = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (haxe.lang.Runtime.toString(__fn_float1)) : (haxe.lang.Runtime.toString(__fn_dyn1)) );
		//line 166 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Strings.hx"
		return thx.Strings.contains(this.s1, a1);
	}
	
	
	public java.lang.String s1;
	
}


