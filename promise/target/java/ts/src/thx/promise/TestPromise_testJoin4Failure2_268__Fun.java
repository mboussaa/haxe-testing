// Generated by Haxe 3.3.0
package thx.promise;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TestPromise_testJoin4Failure2_268__Fun extends haxe.lang.Function
{
	public TestPromise_testJoin4Failure2_268__Fun(haxe.lang.Function done)
	{
		//line 268 "/shared/promise/test/thx/promise/TestPromise.hx"
		super(1, 0);
		//line 268 "/shared/promise/test/thx/promise/TestPromise.hx"
		this.done = done;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 268 "/shared/promise/test/thx/promise/TestPromise.hx"
		java.lang.Object tuple = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((java.lang.Object) (__fn_float1) )) : (((java.lang.Object) (__fn_dyn1) )) );
		//line 269 "/shared/promise/test/thx/promise/TestPromise.hx"
		utest.Assert.fail(null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.promise.TestPromise", "TestPromise.hx", "testJoin4Failure2"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (269) )) )}));
		//line 270 "/shared/promise/test/thx/promise/TestPromise.hx"
		this.done.__hx_invoke0_o();
		//line 268 "/shared/promise/test/thx/promise/TestPromise.hx"
		return null;
	}
	
	
	public haxe.lang.Function done;
	
}


