// Generated by Haxe 3.3.0
package thx._TestEnums;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Sample extends haxe.lang.ParamEnum
{
	public Sample(int index, java.lang.Object[] params)
	{
		//line 100 "/usr/lib/haxe/std/java/internal/HxObject.hx"
		super(index, params);
	}
	
	
	public static final java.lang.String[] __hx_constructs = new java.lang.String[]{"A", "B"};
	
	public static final thx._TestEnums.Sample A = new thx._TestEnums.Sample(0, null);
	
	public static thx._TestEnums.Sample B(int v)
	{
		//line 46 "/shared/core/test/thx/TestEnums.hx"
		return new thx._TestEnums.Sample(1, new java.lang.Object[]{v});
	}
	
	
	@Override public java.lang.String getTag()
	{
		//line 44 "/shared/core/test/thx/TestEnums.hx"
		return thx._TestEnums.Sample.__hx_constructs[this.index];
	}
	
	
}

