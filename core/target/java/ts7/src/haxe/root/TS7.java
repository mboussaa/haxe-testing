// Generated by Haxe 3.3.0
package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TS7 extends haxe.lang.HxObject
{
	public static void main(String[] args)
	{
		Sys._args = args;
		main();
	}
	
	public TS7(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public TS7()
	{
		//line 4 "/shared/core/test/TS7.hx"
		haxe.root.TS7.__hx_ctor__TS7(this);
	}
	
	
	public static void __hx_ctor__TS7(haxe.root.TS7 __temp_me15)
	{
	}
	
	
	public static void addTests(utest.Runner runner)
	{
		//line 7 "/shared/core/test/TS7.hx"
		java.lang.String w = "";
		//line 8 "/shared/core/test/TS7.hx"
		{
			//line 8 "/shared/core/test/TS7.hx"
			int _g = 0;
			//line 8 "/shared/core/test/TS7.hx"
			haxe.root.Array<java.lang.String> _g1 = haxe.root.Sys.args();
			//line 8 "/shared/core/test/TS7.hx"
			while (( _g < _g1.length ))
			{
				//line 8 "/shared/core/test/TS7.hx"
				java.lang.String arg = _g1.__get(_g);
				//line 8 "/shared/core/test/TS7.hx"
				 ++ _g;
				//line 9 "/shared/core/test/TS7.hx"
				w = arg;
			}
			
		}
		
		//line 10 "/shared/core/test/TS7.hx"
		haxe.Log.trace.__hx_invoke2_o(0.0, ( "The value of loop_wrapper is " + w ), 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"TS7", "TS7.hx", "addTests"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (10) )) )}));
		//line 12 "/shared/core/test/TS7.hx"
		int x = ((int) (haxe.lang.Runtime.toInt(haxe.root.Std.parseInt(w))) );
		//line 19 "/shared/core/test/TS7.hx"
		runner.addCase(new thx.TestChar(((int) (x) )), null, null, null, null);
	}
	
	
	public static void main()
	{
		//line 73 "/shared/core/test/TS7.hx"
		utest.Runner runner = new utest.Runner();
		//line 74 "/shared/core/test/TS7.hx"
		haxe.root.TS7.addTests(runner);
		//line 75 "/shared/core/test/TS7.hx"
		utest.ui.Report.create(runner, null, null);
		//line 76 "/shared/core/test/TS7.hx"
		runner.run();
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 4 "/shared/core/test/TS7.hx"
		return new haxe.root.TS7(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 4 "/shared/core/test/TS7.hx"
		return new haxe.root.TS7();
	}
	
	
}

