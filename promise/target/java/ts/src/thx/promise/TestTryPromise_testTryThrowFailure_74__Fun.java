// Generated by Haxe 3.3.0
package thx.promise;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TestTryPromise_testTryThrowFailure_74__Fun extends haxe.lang.Function
{
	public TestTryPromise_testTryThrowFailure_74__Fun(thx.promise.Future<thx.Either> _e)
	{
		//line 74 "/shared/promise/test/thx/promise/TestTryPromise.hx"
		super(0, 0);
		//line 74 "/shared/promise/test/thx/promise/TestTryPromise.hx"
		this._e = _e;
	}
	
	
	@Override public java.lang.Object __hx_invoke0_o()
	{
		//line 74 "/shared/promise/test/thx/promise/TestTryPromise.hx"
		return ((thx.promise.Future<thx.Either>) (thx.promise._Promise.Promise_Impl_.throwFailure(((thx.promise.Future<thx.Either>) (this._e) ))) );
	}
	
	
	public thx.promise.Future<thx.Either> _e;
	
}

