// Generated by Haxe 3.3.0
package thx.promise;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TestPromise_testAllMapToTupleFailure_391__Fun extends haxe.lang.Function
{
	public TestPromise_testAllMapToTupleFailure_391__Fun()
	{
		//line 391 "/shared/promise/test/thx/promise/TestPromise.hx"
		super(1, 0);
	}
	
	
	public static thx.promise.TestPromise_testAllMapToTupleFailure_391__Fun __hx_current;
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 391 "/shared/promise/test/thx/promise/TestPromise.hx"
		thx.Error err1 = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((thx.Error) (((java.lang.Object) (__fn_float1) )) )) : (((thx.Error) (__fn_dyn1) )) );
		//line 391 "/shared/promise/test/thx/promise/TestPromise.hx"
		return ((thx.promise.Future<thx.Either>) (thx.promise._Promise.Promise_Impl_.error(((thx.Error) (err1) ))) );
	}
	
	
}


