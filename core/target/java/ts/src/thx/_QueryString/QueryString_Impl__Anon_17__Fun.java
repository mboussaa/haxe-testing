// Generated by Haxe 3.3.0
package thx._QueryString;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class QueryString_Impl__Anon_17__Fun extends haxe.lang.Function
{
	public QueryString_Impl__Anon_17__Fun()
	{
		//line 17 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/QueryString.hx"
		super(1, 0);
	}
	
	
	public static thx._QueryString.QueryString_Impl__Anon_17__Fun __hx_current;
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 17 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/QueryString.hx"
		java.lang.String s = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (haxe.lang.Runtime.toString(__fn_float1)) : (haxe.lang.Runtime.toString(__fn_dyn1)) );
		//line 17 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/QueryString.hx"
		return haxe.root.StringTools.replace(haxe.root.StringTools.urlDecode(s), "+", " ");
	}
	
	
}


