// Generated by Haxe 3.3.0
package thx.promise;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TestFuture_testFlatten_60__Fun_0 extends haxe.lang.Function
{
	public TestFuture_testFlatten_60__Fun_0(haxe.lang.Function callback)
	{
		//line 60 "/shared/promise/test/thx/promise/TestFuture.hx"
		super(1, 0);
		//line 60 "/shared/promise/test/thx/promise/TestFuture.hx"
		this.callback = callback;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 60 "/shared/promise/test/thx/promise/TestFuture.hx"
		thx.promise.Future<java.lang.Object> future1 = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((thx.promise.Future<java.lang.Object>) (((java.lang.Object) (__fn_float1) )) )) : (((thx.promise.Future<java.lang.Object>) (__fn_dyn1) )) );
		//line 60 "/shared/promise/test/thx/promise/TestFuture.hx"
		future1.then(this.callback);
		//line 60 "/shared/promise/test/thx/promise/TestFuture.hx"
		return null;
	}
	
	
	public haxe.lang.Function callback;
	
}


