// Generated by Haxe 3.3.0
package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TS2_main_33__Fun extends haxe.lang.Function
{
	public TS2_main_33__Fun(utest.TestResult[] r)
	{
		//line 33 "/shared/utest/test/TS2.hx"
		super(1, 0);
		//line 33 "/shared/utest/test/TS2.hx"
		this.r = r;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 33 "/shared/utest/test/TS2.hx"
		java.lang.Object o = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((java.lang.Object) (__fn_float1) )) : (((java.lang.Object) (__fn_dyn1) )) );
		//line 33 "/shared/utest/test/TS2.hx"
		if (( ((int) (haxe.lang.Runtime.getField_f(o, "done", true)) ) == ((int) (haxe.lang.Runtime.getField_f(o, "totals", true)) ) )) 
		{
			//line 33 "/shared/utest/test/TS2.hx"
			this.r[0] = ((utest.TestResult) (haxe.lang.Runtime.getField(o, "result", true)) );
		}
		
		//line 33 "/shared/utest/test/TS2.hx"
		return null;
	}
	
	
	public utest.TestResult[] r;
	
}

