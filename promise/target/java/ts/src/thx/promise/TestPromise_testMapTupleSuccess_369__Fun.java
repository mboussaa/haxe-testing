// Generated by Haxe 3.3.0
package thx.promise;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TestPromise_testMapTupleSuccess_369__Fun extends haxe.lang.Function
{
	public TestPromise_testMapTupleSuccess_369__Fun(haxe.lang.Function done)
	{
		//line 369 "/shared/promise/test/thx/promise/TestPromise.hx"
		super(1, 0);
		//line 369 "/shared/promise/test/thx/promise/TestPromise.hx"
		this.done = done;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 369 "/shared/promise/test/thx/promise/TestPromise.hx"
		double v = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((double) (__fn_float1) )) : (((double) (haxe.lang.Runtime.toDouble(__fn_dyn1)) )) );
		//line 370 "/shared/promise/test/thx/promise/TestPromise.hx"
		utest.Assert.equals(0.5, v, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.promise.TestPromise", "TestPromise.hx", "testMapTupleSuccess"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (370) )) )}));
		//line 371 "/shared/promise/test/thx/promise/TestPromise.hx"
		this.done.__hx_invoke0_o();
		//line 369 "/shared/promise/test/thx/promise/TestPromise.hx"
		return null;
	}
	
	
	public haxe.lang.Function done;
	
}

