// Generated by Haxe 3.3.0
package utest._TestAssert;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Sample extends haxe.lang.ParamEnum
{
	public Sample(int index, java.lang.Object[] params)
	{
		//line 100 "/usr/lib/haxe/std/java/internal/HxObject.hx"
		super(index, params);
	}
	
	
	public static final java.lang.String[] __hx_constructs = new java.lang.String[]{"None", "Some", "Rec"};
	
	public static final utest._TestAssert.Sample None = new utest._TestAssert.Sample(0, null);
	
	public static utest._TestAssert.Sample Some(java.lang.String s)
	{
		//line 342 "/shared/utest/test/utest/TestAssert.hx"
		return new utest._TestAssert.Sample(1, new java.lang.Object[]{s});
	}
	
	
	public static utest._TestAssert.Sample Rec(utest._TestAssert.Sample s)
	{
		//line 343 "/shared/utest/test/utest/TestAssert.hx"
		return new utest._TestAssert.Sample(2, new java.lang.Object[]{s});
	}
	
	
	@Override public java.lang.String getTag()
	{
		//line 340 "/shared/utest/test/utest/TestAssert.hx"
		return utest._TestAssert.Sample.__hx_constructs[this.index];
	}
	
	
}


