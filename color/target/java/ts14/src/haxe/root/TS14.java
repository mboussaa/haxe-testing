// Generated by Haxe 3.3.0
package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TS14 extends haxe.lang.HxObject
{
	public static void main(String[] args)
	{
		Sys._args = args;
		main();
	}
	
	public TS14(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public TS14()
	{
		//line 4 "/shared/color/test/TS14.hx"
		haxe.root.TS14.__hx_ctor__TS14(this);
	}
	
	
	public static void __hx_ctor__TS14(haxe.root.TS14 __temp_me15)
	{
	}
	
	
	public static void addTests(utest.Runner runner)
	{
		//line 19 "/shared/color/test/TS14.hx"
		runner.addCase(new thx.color.TestRgb(), null, null, null, null);
	}
	
	
	public static void main()
	{
		//line 23 "/shared/color/test/TS14.hx"
		utest.Runner runner = new utest.Runner();
		//line 24 "/shared/color/test/TS14.hx"
		haxe.root.TS14.addTests(runner);
		//line 25 "/shared/color/test/TS14.hx"
		utest.ui.Report.create(runner, null, null);
		//line 26 "/shared/color/test/TS14.hx"
		runner.run();
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 4 "/shared/color/test/TS14.hx"
		return new haxe.root.TS14(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 4 "/shared/color/test/TS14.hx"
		return new haxe.root.TS14();
	}
	
	
}


