// Generated by Haxe 3.3.0
package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TS1 extends haxe.lang.HxObject
{
	public static void main(String[] args)
	{
		Sys._args = args;
		main();
	}
	
	public TS1(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public TS1()
	{
		//line 4 "/shared/thx.color/test/TS1.hx"
		haxe.root.TS1.__hx_ctor__TS1(this);
	}
	
	
	public static void __hx_ctor__TS1(haxe.root.TS1 __temp_me15)
	{
	}
	
	
	public static void addTests(utest.Runner runner)
	{
		//line 6 "/shared/thx.color/test/TS1.hx"
		runner.addCase(new thx.color.TestLab(), null, null, null, null);
	}
	
	
	public static void main()
	{
		//line 10 "/shared/thx.color/test/TS1.hx"
		utest.Runner runner = new utest.Runner();
		//line 11 "/shared/thx.color/test/TS1.hx"
		haxe.root.TS1.addTests(runner);
		//line 12 "/shared/thx.color/test/TS1.hx"
		utest.ui.Report.create(runner, null, null);
		//line 13 "/shared/thx.color/test/TS1.hx"
		runner.run();
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 4 "/shared/thx.color/test/TS1.hx"
		return new haxe.root.TS1(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 4 "/shared/thx.color/test/TS1.hx"
		return new haxe.root.TS1();
	}
	
	
}

