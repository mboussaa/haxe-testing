// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TestAssert_testRaisesFailure_90__Fun extends haxe.lang.Function
{
	public TestAssert_testRaisesFailure_90__Fun(java.lang.Object test)
	{
		//line 90 "/shared/core/thx/TestAssert.hx"
		super(0, 0);
		//line 90 "/shared/core/thx/TestAssert.hx"
		this.test = test;
	}
	
	
	@Override public java.lang.Object __hx_invoke0_o()
	{
		//line 90 "/shared/core/thx/TestAssert.hx"
		throw haxe.lang.HaxeException.wrap(haxe.lang.Runtime.getField(this.test, "exception", true));
	}
	
	
	public java.lang.Object test;
	
}

