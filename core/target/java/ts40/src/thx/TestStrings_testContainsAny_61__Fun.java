// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TestStrings_testContainsAny_61__Fun extends haxe.lang.Function
{
	public TestStrings_testContainsAny_61__Fun()
	{
		//line 61 "/shared/core/test/thx/TestStrings.hx"
		super(1, 0);
	}
	
	
	public static thx.TestStrings_testContainsAny_61__Fun __hx_current;
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 61 "/shared/core/test/thx/TestStrings.hx"
		java.lang.String a16 = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (haxe.lang.Runtime.toString(__fn_float1)) : (haxe.lang.Runtime.toString(__fn_dyn1)) );
		//line 61 "/shared/core/test/thx/TestStrings.hx"
		return thx.Strings.contains("test", a16);
	}
	
	
}

