// Generated by Haxe 3.3.0
package thx.promise;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TestFuture_testFlatten_60__Fun extends haxe.lang.Function
{
	public TestFuture_testFlatten_60__Fun(thx.promise.Future<thx.promise.Future<java.lang.Object>> future)
	{
		//line 60 "/shared/promise/test/thx/promise/TestFuture.hx"
		super(1, 0);
		//line 60 "/shared/promise/test/thx/promise/TestFuture.hx"
		this.future = future;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 60 "/shared/promise/test/thx/promise/TestFuture.hx"
		haxe.lang.Function callback = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((haxe.lang.Function) (((java.lang.Object) (__fn_float1) )) )) : (((haxe.lang.Function) (__fn_dyn1) )) );
		//line 60 "/shared/promise/test/thx/promise/TestFuture.hx"
		this.future.then(new thx.promise.TestFuture_testFlatten_60__Fun_0(callback));
		//line 60 "/shared/promise/test/thx/promise/TestFuture.hx"
		return null;
	}
	
	
	public thx.promise.Future<thx.promise.Future<java.lang.Object>> future;
	
}

