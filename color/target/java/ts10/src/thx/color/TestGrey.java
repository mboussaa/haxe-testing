// Generated by Haxe 3.3.0
package thx.color;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TestGrey extends nanotest.NanoTestCase
{
	public TestGrey(haxe.lang.EmptyObject empty)
	{
		//line 6 "/shared/color/test/thx/color/TestGrey.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public TestGrey(java.lang.Object posInfos)
	{
		//line 29 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestCase.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
		//line 29 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestCase.hx"
		thx.color.TestGrey.__hx_ctor_thx_color_TestGrey(this, posInfos);
	}
	
	
	public static void __hx_ctor_thx_color_TestGrey(thx.color.TestGrey __temp_me134, java.lang.Object posInfos)
	{
		//line 29 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestCase.hx"
		nanotest.NanoTestCase.__hx_ctor_nanotest_NanoTestCase(__temp_me134, posInfos);
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 6 "/shared/color/test/thx/color/TestGrey.hx"
		return new thx.color.TestGrey(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 6 "/shared/color/test/thx/color/TestGrey.hx"
		return new thx.color.TestGrey(((java.lang.Object) (arr.__get(0)) ));
	}
	
	
	public void testBasics()
	{
		//line 10 "/shared/color/test/thx/color/TestGrey.hx"
		double grey = ((double) (0.2) );
		//line 11 "/shared/color/test/thx/color/TestGrey.hx"
		this.assertEquals(((java.lang.Object) (0.2) ), ((double) (grey) ), ((java.lang.Object) (new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.color.TestGrey", "TestGrey.hx", "testBasics"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (11) )) )})) ));
	}
	
	
	public void testStrings()
	{
		//line 15 "/shared/color/test/thx/color/TestGrey.hx"
		double grey = ((double) (0.5) );
		//line 16 "/shared/color/test/thx/color/TestGrey.hx"
		this.assertEquals(haxe.lang.Runtime.toString("grey(50%)"), haxe.lang.Runtime.toString(thx.color._Grey.Grey_Impl_.toString(grey)), ((java.lang.Object) (new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.color.TestGrey", "TestGrey.hx", "testStrings"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (16) )) )})) ));
	}
	
	
	public void testFromString()
	{
		//line 20 "/shared/color/test/thx/color/TestGrey.hx"
		this.assertTrue(thx.color._Grey.Grey_Impl_.equals(((double) (0.2) ), ((double) (haxe.lang.Runtime.toDouble(thx.color._Grey.Grey_Impl_.fromString("grey(20%)"))) )), new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.color.TestGrey", "TestGrey.hx", "testFromString"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (20) )) )}));
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 6 "/shared/color/test/thx/color/TestGrey.hx"
		{
			//line 6 "/shared/color/test/thx/color/TestGrey.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "/shared/color/test/thx/color/TestGrey.hx"
			switch (field.hashCode())
			{
				case 1443991181:
				{
					//line 6 "/shared/color/test/thx/color/TestGrey.hx"
					if (field.equals("testFromString")) 
					{
						//line 6 "/shared/color/test/thx/color/TestGrey.hx"
						__temp_executeDef1 = false;
						//line 6 "/shared/color/test/thx/color/TestGrey.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testFromString")) );
					}
					
					//line 6 "/shared/color/test/thx/color/TestGrey.hx"
					break;
				}
				
				
				case 1223535927:
				{
					//line 6 "/shared/color/test/thx/color/TestGrey.hx"
					if (field.equals("testBasics")) 
					{
						//line 6 "/shared/color/test/thx/color/TestGrey.hx"
						__temp_executeDef1 = false;
						//line 6 "/shared/color/test/thx/color/TestGrey.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testBasics")) );
					}
					
					//line 6 "/shared/color/test/thx/color/TestGrey.hx"
					break;
				}
				
				
				case 2020609424:
				{
					//line 6 "/shared/color/test/thx/color/TestGrey.hx"
					if (field.equals("testStrings")) 
					{
						//line 6 "/shared/color/test/thx/color/TestGrey.hx"
						__temp_executeDef1 = false;
						//line 6 "/shared/color/test/thx/color/TestGrey.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testStrings")) );
					}
					
					//line 6 "/shared/color/test/thx/color/TestGrey.hx"
					break;
				}
				
				
			}
			
			//line 6 "/shared/color/test/thx/color/TestGrey.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "/shared/color/test/thx/color/TestGrey.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 6 "/shared/color/test/thx/color/TestGrey.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 6 "/shared/color/test/thx/color/TestGrey.hx"
		{
			//line 6 "/shared/color/test/thx/color/TestGrey.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "/shared/color/test/thx/color/TestGrey.hx"
			switch (field.hashCode())
			{
				case 1443991181:
				{
					//line 6 "/shared/color/test/thx/color/TestGrey.hx"
					if (field.equals("testFromString")) 
					{
						//line 6 "/shared/color/test/thx/color/TestGrey.hx"
						__temp_executeDef1 = false;
						//line 6 "/shared/color/test/thx/color/TestGrey.hx"
						this.testFromString();
					}
					
					//line 6 "/shared/color/test/thx/color/TestGrey.hx"
					break;
				}
				
				
				case 1223535927:
				{
					//line 6 "/shared/color/test/thx/color/TestGrey.hx"
					if (field.equals("testBasics")) 
					{
						//line 6 "/shared/color/test/thx/color/TestGrey.hx"
						__temp_executeDef1 = false;
						//line 6 "/shared/color/test/thx/color/TestGrey.hx"
						this.testBasics();
					}
					
					//line 6 "/shared/color/test/thx/color/TestGrey.hx"
					break;
				}
				
				
				case 2020609424:
				{
					//line 6 "/shared/color/test/thx/color/TestGrey.hx"
					if (field.equals("testStrings")) 
					{
						//line 6 "/shared/color/test/thx/color/TestGrey.hx"
						__temp_executeDef1 = false;
						//line 6 "/shared/color/test/thx/color/TestGrey.hx"
						this.testStrings();
					}
					
					//line 6 "/shared/color/test/thx/color/TestGrey.hx"
					break;
				}
				
				
			}
			
			//line 6 "/shared/color/test/thx/color/TestGrey.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "/shared/color/test/thx/color/TestGrey.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 6 "/shared/color/test/thx/color/TestGrey.hx"
		return null;
	}
	
	
}


