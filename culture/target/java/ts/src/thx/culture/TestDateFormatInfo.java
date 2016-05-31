// Generated by Haxe 3.3.0
package thx.culture;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TestDateFormatInfo extends haxe.lang.HxObject
{
	public TestDateFormatInfo(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public TestDateFormatInfo()
	{
		//line 6 "/shared/culture/thx/culture/TestDateFormatInfo.hx"
		thx.culture.TestDateFormatInfo.__hx_ctor_thx_culture_TestDateFormatInfo(this);
	}
	
	
	public static void __hx_ctor_thx_culture_TestDateFormatInfo(thx.culture.TestDateFormatInfo __temp_me38)
	{
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 5 "/shared/culture/thx/culture/TestDateFormatInfo.hx"
		return new thx.culture.TestDateFormatInfo(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 5 "/shared/culture/thx/culture/TestDateFormatInfo.hx"
		return new thx.culture.TestDateFormatInfo();
	}
	
	
	public void testInvariant()
	{
		//line 9 "/shared/culture/thx/culture/TestDateFormatInfo.hx"
		thx.culture.DateFormatInfo dt = thx.culture.DateFormatInfo.invariant;
		//line 11 "/shared/culture/thx/culture/TestDateFormatInfo.hx"
		utest.Assert.equals("Gregorian", dt.nameCalendar, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.culture.TestDateFormatInfo", "TestDateFormatInfo.hx", "testInvariant"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (11) )) )}));
		//line 12 "/shared/culture/thx/culture/TestDateFormatInfo.hx"
		utest.Assert.equals("Sunday", dt.firstDayOfWeekName, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.culture.TestDateFormatInfo", "TestDateFormatInfo.hx", "testInvariant"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (12) )) )}));
		//line 13 "/shared/culture/thx/culture/TestDateFormatInfo.hx"
		utest.Assert.equals("AM", dt.designatorAm, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.culture.TestDateFormatInfo", "TestDateFormatInfo.hx", "testInvariant"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (13) )) )}));
		//line 14 "/shared/culture/thx/culture/TestDateFormatInfo.hx"
		utest.Assert.equals("PM", dt.designatorPm, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.culture.TestDateFormatInfo", "TestDateFormatInfo.hx", "testInvariant"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (14) )) )}));
		//line 15 "/shared/culture/thx/culture/TestDateFormatInfo.hx"
		utest.Assert.equals("January", dt.nameMonths.__get(0), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.culture.TestDateFormatInfo", "TestDateFormatInfo.hx", "testInvariant"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (15) )) )}));
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 5 "/shared/culture/thx/culture/TestDateFormatInfo.hx"
		{
			//line 5 "/shared/culture/thx/culture/TestDateFormatInfo.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "/shared/culture/thx/culture/TestDateFormatInfo.hx"
			switch (field.hashCode())
			{
				case -1462059186:
				{
					//line 5 "/shared/culture/thx/culture/TestDateFormatInfo.hx"
					if (field.equals("testInvariant")) 
					{
						//line 5 "/shared/culture/thx/culture/TestDateFormatInfo.hx"
						__temp_executeDef1 = false;
						//line 5 "/shared/culture/thx/culture/TestDateFormatInfo.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testInvariant")) );
					}
					
					//line 5 "/shared/culture/thx/culture/TestDateFormatInfo.hx"
					break;
				}
				
				
			}
			
			//line 5 "/shared/culture/thx/culture/TestDateFormatInfo.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "/shared/culture/thx/culture/TestDateFormatInfo.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 5 "/shared/culture/thx/culture/TestDateFormatInfo.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 5 "/shared/culture/thx/culture/TestDateFormatInfo.hx"
		{
			//line 5 "/shared/culture/thx/culture/TestDateFormatInfo.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "/shared/culture/thx/culture/TestDateFormatInfo.hx"
			switch (field.hashCode())
			{
				case -1462059186:
				{
					//line 5 "/shared/culture/thx/culture/TestDateFormatInfo.hx"
					if (field.equals("testInvariant")) 
					{
						//line 5 "/shared/culture/thx/culture/TestDateFormatInfo.hx"
						__temp_executeDef1 = false;
						//line 5 "/shared/culture/thx/culture/TestDateFormatInfo.hx"
						this.testInvariant();
					}
					
					//line 5 "/shared/culture/thx/culture/TestDateFormatInfo.hx"
					break;
				}
				
				
			}
			
			//line 5 "/shared/culture/thx/culture/TestDateFormatInfo.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "/shared/culture/thx/culture/TestDateFormatInfo.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 5 "/shared/culture/thx/culture/TestDateFormatInfo.hx"
		return null;
	}
	
	
}

