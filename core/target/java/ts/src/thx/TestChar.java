// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TestChar extends haxe.lang.HxObject
{
	public TestChar(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public TestChar()
	{
		//line 8 "/shared/core/thx/TestChar.hx"
		thx.TestChar.__hx_ctor_thx_TestChar(this);
	}
	
	
	public static void __hx_ctor_thx_TestChar(thx.TestChar __temp_me166)
	{
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 7 "/shared/core/thx/TestChar.hx"
		return new thx.TestChar(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 7 "/shared/core/thx/TestChar.hx"
		return new thx.TestChar();
	}
	
	
	public void testChar()
	{
		//line 11 "/shared/core/thx/TestChar.hx"
		thx.Assert.isTrue(true, ( "Char value should be greater than zero: " + 120 ), new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx._Char.Char_Impl_", "Char.hx", "fromInt"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (19) )) )}));
		//line 11 "/shared/core/thx/TestChar.hx"
		int _char = ((int) (120) );
		//line 13 "/shared/core/thx/TestChar.hx"
		utest.Assert.equals(120, _char, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestChar", "TestChar.hx", "testChar"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (13) )) )}));
		//line 14 "/shared/core/thx/TestChar.hx"
		Character.toString((char) ((int) (_char) ));
		//line 14 "/shared/core/thx/TestChar.hx"
		utest.Assert.equals("x", "x", null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestChar", "TestChar.hx", "testChar"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (14) )) )}));
		//line 16 "/shared/core/thx/TestChar.hx"
		int i = ((int) (haxe.lang.Runtime.toInt(haxe.lang.StringExt.charCodeAt("y", 0))) );
		//line 16 "/shared/core/thx/TestChar.hx"
		thx.Assert.isTrue(( i >= 0 ), ( "Char value should be greater than zero: " + i ), new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx._Char.Char_Impl_", "Char.hx", "fromInt"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (19) )) )}));
		//line 16 "/shared/core/thx/TestChar.hx"
		_char = ((int) (i) );
		//line 18 "/shared/core/thx/TestChar.hx"
		utest.Assert.equals(121, _char, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestChar", "TestChar.hx", "testChar"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (18) )) )}));
		//line 19 "/shared/core/thx/TestChar.hx"
		utest.Assert.equals("y", Character.toString((char) ((int) (_char) )), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestChar", "TestChar.hx", "testChar"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (19) )) )}));
		//line 21 "/shared/core/thx/TestChar.hx"
		utest.Assert.equals(89, thx._Char.Char_Impl_.toUpperCase(_char), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestChar", "TestChar.hx", "testChar"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (21) )) )}));
		//line 22 "/shared/core/thx/TestChar.hx"
		utest.Assert.equals("Y", Character.toString((char) ((int) (thx._Char.Char_Impl_.toUpperCase(_char)) )), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestChar", "TestChar.hx", "testChar"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (22) )) )}));
		//line 24 "/shared/core/thx/TestChar.hx"
		_char = thx._Char.Char_Impl_.next(_char);
		//line 26 "/shared/core/thx/TestChar.hx"
		utest.Assert.equals(122, _char, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestChar", "TestChar.hx", "testChar"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (26) )) )}));
		//line 27 "/shared/core/thx/TestChar.hx"
		utest.Assert.equals("z", Character.toString((char) ((int) (_char) )), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestChar", "TestChar.hx", "testChar"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (27) )) )}));
		//line 29 "/shared/core/thx/TestChar.hx"
		utest.Assert.equals(121, thx._Char.Char_Impl_.prev(_char), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestChar", "TestChar.hx", "testChar"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (29) )) )}));
	}
	
	
	public void testControl()
	{
		//line 33 "/shared/core/thx/TestChar.hx"
		thx.Assert.isTrue(true, ( "Char value should be greater than zero: " + 7 ), new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx._Char.Char_Impl_", "Char.hx", "fromInt"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (19) )) )}));
		//line 33 "/shared/core/thx/TestChar.hx"
		utest.Assert.isTrue(thx._Char.Char_Impl_.isControl(((int) (7) )), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestChar", "TestChar.hx", "testControl"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (33) )) )}));
		//line 34 "/shared/core/thx/TestChar.hx"
		int i = ((int) (haxe.lang.Runtime.toInt(haxe.lang.StringExt.charCodeAt("x", 0))) );
		//line 34 "/shared/core/thx/TestChar.hx"
		thx.Assert.isTrue(( i >= 0 ), ( "Char value should be greater than zero: " + i ), new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx._Char.Char_Impl_", "Char.hx", "fromInt"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (19) )) )}));
		//line 34 "/shared/core/thx/TestChar.hx"
		utest.Assert.isFalse(thx._Char.Char_Impl_.isControl(((int) (i) )), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestChar", "TestChar.hx", "testControl"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (34) )) )}));
	}
	
	
	public void testUtf8()
	{
		//line 38 "/shared/core/thx/TestChar.hx"
		int i = ((int) (haxe.lang.Runtime.toInt(haxe.lang.StringExt.charCodeAt("\u263a", 0))) );
		//line 38 "/shared/core/thx/TestChar.hx"
		thx.Assert.isTrue(( i >= 0 ), ( "Char value should be greater than zero: " + i ), new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx._Char.Char_Impl_", "Char.hx", "fromInt"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (19) )) )}));
		//line 38 "/shared/core/thx/TestChar.hx"
		utest.Assert.equals(9786, ((int) (i) ), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestChar", "TestChar.hx", "testUtf8"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (38) )) )}));
		//line 39 "/shared/core/thx/TestChar.hx"
		thx.Assert.isTrue(true, ( "Char value should be greater than zero: " + 9786 ), new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx._Char.Char_Impl_", "Char.hx", "fromInt"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (19) )) )}));
		//line 39 "/shared/core/thx/TestChar.hx"
		utest.Assert.equals("\u263a", Character.toString((char) ((int) (9786) )), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestChar", "TestChar.hx", "testUtf8"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (39) )) )}));
	}
	
	
	public void testArrayToString()
	{
		//line 43 "/shared/core/thx/TestChar.hx"
		thx.Assert.isTrue(true, ( "Char value should be greater than zero: " + 120 ), new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx._Char.Char_Impl_", "Char.hx", "fromInt"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (19) )) )}));
		//line 43 "/shared/core/thx/TestChar.hx"
		int tmp = ((int) (120) );
		//line 43 "/shared/core/thx/TestChar.hx"
		thx.Assert.isTrue(true, ( "Char value should be greater than zero: " + 121 ), new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx._Char.Char_Impl_", "Char.hx", "fromInt"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (19) )) )}));
		//line 43 "/shared/core/thx/TestChar.hx"
		int tmp1 = ((int) (121) );
		//line 43 "/shared/core/thx/TestChar.hx"
		thx.Assert.isTrue(true, ( "Char value should be greater than zero: " + 122 ), new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx._Char.Char_Impl_", "Char.hx", "fromInt"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (19) )) )}));
		//line 43 "/shared/core/thx/TestChar.hx"
		haxe.root.Array<java.lang.Object> chars = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{tmp, tmp1, ((int) (122) )});
		//line 44 "/shared/core/thx/TestChar.hx"
		utest.Assert.equals("xyz", thx._Char.Char_Impl_.arrayToString(chars), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestChar", "TestChar.hx", "testArrayToString"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (44) )) )}));
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 7 "/shared/core/thx/TestChar.hx"
		{
			//line 7 "/shared/core/thx/TestChar.hx"
			boolean __temp_executeDef1 = true;
			//line 7 "/shared/core/thx/TestChar.hx"
			switch (field.hashCode())
			{
				case -907401101:
				{
					//line 7 "/shared/core/thx/TestChar.hx"
					if (field.equals("testArrayToString")) 
					{
						//line 7 "/shared/core/thx/TestChar.hx"
						__temp_executeDef1 = false;
						//line 7 "/shared/core/thx/TestChar.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testArrayToString")) );
					}
					
					//line 7 "/shared/core/thx/TestChar.hx"
					break;
				}
				
				
				case -1147292920:
				{
					//line 7 "/shared/core/thx/TestChar.hx"
					if (field.equals("testChar")) 
					{
						//line 7 "/shared/core/thx/TestChar.hx"
						__temp_executeDef1 = false;
						//line 7 "/shared/core/thx/TestChar.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testChar")) );
					}
					
					//line 7 "/shared/core/thx/TestChar.hx"
					break;
				}
				
				
				case -1146745053:
				{
					//line 7 "/shared/core/thx/TestChar.hx"
					if (field.equals("testUtf8")) 
					{
						//line 7 "/shared/core/thx/TestChar.hx"
						__temp_executeDef1 = false;
						//line 7 "/shared/core/thx/TestChar.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testUtf8")) );
					}
					
					//line 7 "/shared/core/thx/TestChar.hx"
					break;
				}
				
				
				case 558944363:
				{
					//line 7 "/shared/core/thx/TestChar.hx"
					if (field.equals("testControl")) 
					{
						//line 7 "/shared/core/thx/TestChar.hx"
						__temp_executeDef1 = false;
						//line 7 "/shared/core/thx/TestChar.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testControl")) );
					}
					
					//line 7 "/shared/core/thx/TestChar.hx"
					break;
				}
				
				
			}
			
			//line 7 "/shared/core/thx/TestChar.hx"
			if (__temp_executeDef1) 
			{
				//line 7 "/shared/core/thx/TestChar.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 7 "/shared/core/thx/TestChar.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 7 "/shared/core/thx/TestChar.hx"
		{
			//line 7 "/shared/core/thx/TestChar.hx"
			boolean __temp_executeDef1 = true;
			//line 7 "/shared/core/thx/TestChar.hx"
			switch (field.hashCode())
			{
				case -907401101:
				{
					//line 7 "/shared/core/thx/TestChar.hx"
					if (field.equals("testArrayToString")) 
					{
						//line 7 "/shared/core/thx/TestChar.hx"
						__temp_executeDef1 = false;
						//line 7 "/shared/core/thx/TestChar.hx"
						this.testArrayToString();
					}
					
					//line 7 "/shared/core/thx/TestChar.hx"
					break;
				}
				
				
				case -1147292920:
				{
					//line 7 "/shared/core/thx/TestChar.hx"
					if (field.equals("testChar")) 
					{
						//line 7 "/shared/core/thx/TestChar.hx"
						__temp_executeDef1 = false;
						//line 7 "/shared/core/thx/TestChar.hx"
						this.testChar();
					}
					
					//line 7 "/shared/core/thx/TestChar.hx"
					break;
				}
				
				
				case -1146745053:
				{
					//line 7 "/shared/core/thx/TestChar.hx"
					if (field.equals("testUtf8")) 
					{
						//line 7 "/shared/core/thx/TestChar.hx"
						__temp_executeDef1 = false;
						//line 7 "/shared/core/thx/TestChar.hx"
						this.testUtf8();
					}
					
					//line 7 "/shared/core/thx/TestChar.hx"
					break;
				}
				
				
				case 558944363:
				{
					//line 7 "/shared/core/thx/TestChar.hx"
					if (field.equals("testControl")) 
					{
						//line 7 "/shared/core/thx/TestChar.hx"
						__temp_executeDef1 = false;
						//line 7 "/shared/core/thx/TestChar.hx"
						this.testControl();
					}
					
					//line 7 "/shared/core/thx/TestChar.hx"
					break;
				}
				
				
			}
			
			//line 7 "/shared/core/thx/TestChar.hx"
			if (__temp_executeDef1) 
			{
				//line 7 "/shared/core/thx/TestChar.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 7 "/shared/core/thx/TestChar.hx"
		return null;
	}
	
	
}

