// Generated by Haxe 3.3.0
package test;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TS4 extends haxe.lang.HxObject
{
	public static void main(String[] args)
	{
		main();
	}
	
	public TS4(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public TS4()
	{
		//line 8 "/shared/hxmath/test/TS4.hx"
		test.TS4.__hx_ctor_test_TS4(this);
	}
	
	
	public static void __hx_ctor_test_TS4(test.TS4 __temp_me53)
	{
	}
	
	
	public static boolean main()
	{
		//line 12 "/shared/hxmath/test/TS4.hx"
		nanotest.NanoTestRunner runner = new nanotest.NanoTestRunner(((haxe.lang.Function) (null) ));
		//line 24 "/shared/hxmath/test/TS4.hx"
		{
			//line 24 "/shared/hxmath/test/TS4.hx"
			int _g = 0;
			//line 24 "/shared/hxmath/test/TS4.hx"
			while (( _g < 3000 ))
			{
				//line 24 "/shared/hxmath/test/TS4.hx"
				 ++ _g;
				//line 25 "/shared/hxmath/test/TS4.hx"
				runner.add(new test.TestMathUtil(((java.lang.Object) (new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"test.TS4", "TS4.hx", "main"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (25) )) )})) )));
			}
			
		}
		
		//line 38 "/shared/hxmath/test/TS4.hx"
		return runner.run();
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 8 "/shared/hxmath/test/TS4.hx"
		return new test.TS4(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 8 "/shared/hxmath/test/TS4.hx"
		return new test.TS4();
	}
	
	
}


