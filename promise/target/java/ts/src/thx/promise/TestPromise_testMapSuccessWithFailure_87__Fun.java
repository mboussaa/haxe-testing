// Generated by Haxe 3.3.0
package thx.promise;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TestPromise_testMapSuccessWithFailure_87__Fun extends haxe.lang.Function
{
	public TestPromise_testMapSuccessWithFailure_87__Fun(thx.Error err, haxe.lang.Function done)
	{
		//line 87 "/shared/promise/test/thx/promise/TestPromise.hx"
		super(1, 0);
		//line 87 "/shared/promise/test/thx/promise/TestPromise.hx"
		this.err = err;
		//line 87 "/shared/promise/test/thx/promise/TestPromise.hx"
		this.done = done;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 87 "/shared/promise/test/thx/promise/TestPromise.hx"
		thx.Error e = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((thx.Error) (((java.lang.Object) (__fn_float1) )) )) : (((thx.Error) (__fn_dyn1) )) );
		//line 88 "/shared/promise/test/thx/promise/TestPromise.hx"
		utest.Assert.equals(this.err, e, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.promise.TestPromise", "TestPromise.hx", "testMapSuccessWithFailure"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (88) )) )}));
		//line 89 "/shared/promise/test/thx/promise/TestPromise.hx"
		this.done.__hx_invoke0_o();
		//line 87 "/shared/promise/test/thx/promise/TestPromise.hx"
		return null;
	}
	
	
	public thx.Error err;
	
	public haxe.lang.Function done;
	
}


