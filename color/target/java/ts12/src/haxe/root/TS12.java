// Generated by Haxe 3.3.0
package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TS12 extends haxe.lang.HxObject
{
	public static void main(String[] args)
	{
		Sys._args = args;
		main();
	}
	
	public TS12(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public TS12()
	{
		//line 4 "/shared/color/test/TS12.hx"
		haxe.root.TS12.__hx_ctor__TS12(this);
	}
	
	
	public static void __hx_ctor__TS12(haxe.root.TS12 __temp_me15)
	{
	}
	
	
	public static void addTests(utest.Runner runner)
	{
		//line 17 "/shared/color/test/TS12.hx"
		runner.addCase(new thx.color.TestHsl(), null, null, null, null);
	}
	
	
	public static void main()
	{
		//line 21 "/shared/color/test/TS12.hx"
		utest.Runner runner = new utest.Runner();
		//line 22 "/shared/color/test/TS12.hx"
		haxe.root.TS12.addTests(runner);
		//line 23 "/shared/color/test/TS12.hx"
		utest.ui.Report.create(runner, null, null);
		//line 24 "/shared/color/test/TS12.hx"
		runner.run();
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 4 "/shared/color/test/TS12.hx"
		return new haxe.root.TS12(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 4 "/shared/color/test/TS12.hx"
		return new haxe.root.TS12();
	}
	
	
}


