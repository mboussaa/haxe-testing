// Generated by Haxe 3.3.0
package thx.promise;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TestTryPromise_testTryEitherSuccess_25__Fun extends haxe.lang.Function
{
	public TestTryPromise_testTryEitherSuccess_25__Fun(haxe.lang.Function done)
	{
		//line 25 "/shared/promise/test/thx/promise/TestTryPromise.hx"
		super(1, 0);
		//line 25 "/shared/promise/test/thx/promise/TestTryPromise.hx"
		this.done = done;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 25 "/shared/promise/test/thx/promise/TestTryPromise.hx"
		thx.Either r = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((thx.Either) (((java.lang.Object) (__fn_float1) )) )) : (((thx.Either) (__fn_dyn1) )) );
		//line 26 "/shared/promise/test/thx/promise/TestTryPromise.hx"
		switch (r.index)
		{
			case 0:
			{
				//line 27 "/shared/promise/test/thx/promise/TestTryPromise.hx"
				utest.Assert.pass(null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.promise.TestTryPromise", "TestTryPromise.hx", "testTryEitherSuccess"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (27) )) )}));
				//line 27 "/shared/promise/test/thx/promise/TestTryPromise.hx"
				break;
			}
			
			
			case 1:
			{
				//line 28 "/shared/promise/test/thx/promise/TestTryPromise.hx"
				utest.Assert.fail("not good", new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.promise.TestTryPromise", "TestTryPromise.hx", "testTryEitherSuccess"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (28) )) )}));
				//line 28 "/shared/promise/test/thx/promise/TestTryPromise.hx"
				break;
			}
			
			
		}
		
		//line 30 "/shared/promise/test/thx/promise/TestTryPromise.hx"
		this.done.__hx_invoke0_o();
		//line 25 "/shared/promise/test/thx/promise/TestTryPromise.hx"
		return null;
	}
	
	
	public haxe.lang.Function done;
	
}

