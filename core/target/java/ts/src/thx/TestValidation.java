// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TestValidation extends haxe.lang.HxObject
{
	public TestValidation(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public TestValidation()
	{
		//line 15 "/shared/core/thx/TestValidation.hx"
		thx.TestValidation.__hx_ctor_thx_TestValidation(this);
	}
	
	
	public static void __hx_ctor_thx_TestValidation(thx.TestValidation __temp_me209)
	{
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 14 "/shared/core/thx/TestValidation.hx"
		return new thx.TestValidation(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 14 "/shared/core/thx/TestValidation.hx"
		return new thx.TestValidation();
	}
	
	
	public boolean or4(boolean b1, boolean b2, boolean b3, boolean b4)
	{
		//line 18 "/shared/core/thx/TestValidation.hx"
		if ( ! ((( ( b1 || b2 ) || b3 ))) ) 
		{
			//line 18 "/shared/core/thx/TestValidation.hx"
			return b4;
		}
		else
		{
			//line 18 "/shared/core/thx/TestValidation.hx"
			return true;
		}
		
	}
	
	
	public int add(int a, int b)
	{
		//line 21 "/shared/core/thx/TestValidation.hx"
		return ( a + b );
	}
	
	
	public void testAp()
	{
		//line 24 "/shared/core/thx/TestValidation.hx"
		thx.Either l1 = thx.Either.Left(1);
		//line 25 "/shared/core/thx/TestValidation.hx"
		thx.Either rt = thx.Either.Right(true);
		//line 27 "/shared/core/thx/TestValidation.hx"
		thx.Either rbi = thx.Either.Right(( (( thx.TestValidation_testAp_27__Fun.__hx_current != null )) ? (thx.TestValidation_testAp_27__Fun.__hx_current) : (thx.TestValidation_testAp_27__Fun.__hx_current = ((thx.TestValidation_testAp_27__Fun) (new thx.TestValidation_testAp_27__Fun()) )) ));
		//line 29 "/shared/core/thx/TestValidation.hx"
		utest.Assert.same(l1, ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (l1) ), ((thx.Either) (rbi) ), ((haxe.lang.Function) (new haxe.lang.Closure(this, "add")) ))) ), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestValidation", "TestValidation.hx", "testAp"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (29) )) )}));
		//line 30 "/shared/core/thx/TestValidation.hx"
		utest.Assert.same(((thx.Either) (thx.Either.Right(1)) ), ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (rt) ), ((thx.Either) (rbi) ), ((haxe.lang.Function) (new haxe.lang.Closure(this, "add")) ))) ), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestValidation", "TestValidation.hx", "testAp"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (30) )) )}));
	}
	
	
	public void testVal4()
	{
		//line 36 "/shared/core/thx/TestValidation.hx"
		thx.Either t = thx.Either.Right(true);
		//line 37 "/shared/core/thx/TestValidation.hx"
		thx.Either f = thx.Either.Right(false);
		//line 38 "/shared/core/thx/TestValidation.hx"
		thx.Either err = thx.Either.Left(1);
		//line 40 "/shared/core/thx/TestValidation.hx"
		haxe.lang.Function s = ((haxe.lang.Function) (new haxe.lang.Closure(this, "add")) );
		//line 40 "/shared/core/thx/TestValidation.hx"
		haxe.lang.Function f1 = ((haxe.lang.Function) (new haxe.lang.Closure(this, "or4")) );
		//line 40 "/shared/core/thx/TestValidation.hx"
		haxe.lang.Function f2 = new thx.TestValidation_testVal4_40__Fun_2(f1);
		//line 40 "/shared/core/thx/TestValidation.hx"
		utest.Assert.same(t, ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (f) ), ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (f) ), ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (f) ), ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (t) ), ((thx.Either) (thx.Either.Right(((haxe.lang.Function) (thx.Functions2.curry(((haxe.lang.Function) (new thx.TestValidation_testVal4_40__Fun_0(f2)) ))) ))) ), ((haxe.lang.Function) (( (( thx.TestValidation_testVal4_40__Fun.__hx_current != null )) ? (thx.TestValidation_testVal4_40__Fun.__hx_current) : (thx.TestValidation_testVal4_40__Fun.__hx_current = ((thx.TestValidation_testVal4_40__Fun) (new thx.TestValidation_testVal4_40__Fun()) )) )) ))) ), ((haxe.lang.Function) (s) ))) ), ((haxe.lang.Function) (s) ))) ), ((haxe.lang.Function) (s) ))) ), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestValidation", "TestValidation.hx", "testVal4"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (40) )) )}));
		//line 41 "/shared/core/thx/TestValidation.hx"
		thx.Either tmp = ((thx.Either) (thx.Either.Left(2)) );
		//line 41 "/shared/core/thx/TestValidation.hx"
		haxe.lang.Function s1 = ((haxe.lang.Function) (new haxe.lang.Closure(this, "add")) );
		//line 41 "/shared/core/thx/TestValidation.hx"
		haxe.lang.Function f3 = ((haxe.lang.Function) (new haxe.lang.Closure(this, "or4")) );
		//line 41 "/shared/core/thx/TestValidation.hx"
		haxe.lang.Function f4 = new thx.TestValidation_testVal4_41__Fun_2(f3);
		//line 41 "/shared/core/thx/TestValidation.hx"
		utest.Assert.same(tmp, ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (err) ), ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (err) ), ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (f) ), ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (t) ), ((thx.Either) (thx.Either.Right(((haxe.lang.Function) (thx.Functions2.curry(((haxe.lang.Function) (new thx.TestValidation_testVal4_41__Fun_0(f4)) ))) ))) ), ((haxe.lang.Function) (( (( thx.TestValidation_testVal4_41__Fun.__hx_current != null )) ? (thx.TestValidation_testVal4_41__Fun.__hx_current) : (thx.TestValidation_testVal4_41__Fun.__hx_current = ((thx.TestValidation_testVal4_41__Fun) (new thx.TestValidation_testVal4_41__Fun()) )) )) ))) ), ((haxe.lang.Function) (s1) ))) ), ((haxe.lang.Function) (s1) ))) ), ((haxe.lang.Function) (s1) ))) ), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestValidation", "TestValidation.hx", "testVal4"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (41) )) )}));
	}
	
	
	public void testVal4Nel()
	{
		//line 45 "/shared/core/thx/TestValidation.hx"
		thx.Either t = thx.Either.Right(true);
		//line 46 "/shared/core/thx/TestValidation.hx"
		thx.Either err = thx.Either.Left(((thx.NonEmptyList) (thx._Nel.Nel_Impl_.pure(((java.lang.Object) (1) ))) ));
		//line 48 "/shared/core/thx/TestValidation.hx"
		thx.Either tmp = thx.Either.Left(((thx.NonEmptyList) (thx._Nel.Nel_Impl_.cons(((java.lang.Object) (1) ), ((thx.NonEmptyList) (thx._Nel.Nel_Impl_.pure(((java.lang.Object) (1) ))) ))) ));
		//line 48 "/shared/core/thx/TestValidation.hx"
		haxe.lang.Function s = ((haxe.lang.Function) (thx._Nel.Nel_Impl_.semigroup()) );
		//line 48 "/shared/core/thx/TestValidation.hx"
		haxe.lang.Function f = ((haxe.lang.Function) (new haxe.lang.Closure(this, "or4")) );
		//line 48 "/shared/core/thx/TestValidation.hx"
		haxe.lang.Function f1 = new thx.TestValidation_testVal4Nel_48__Fun_2(f);
		//line 48 "/shared/core/thx/TestValidation.hx"
		utest.Assert.same(tmp, ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (err) ), ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (err) ), ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (t) ), ((thx.Either) (thx._Validation.Validation_Impl_.ap(((thx.Either) (t) ), ((thx.Either) (thx.Either.Right(((haxe.lang.Function) (thx.Functions2.curry(((haxe.lang.Function) (new thx.TestValidation_testVal4Nel_48__Fun_0(f1)) ))) ))) ), ((haxe.lang.Function) (( (( thx.TestValidation_testVal4Nel_48__Fun.__hx_current != null )) ? (thx.TestValidation_testVal4Nel_48__Fun.__hx_current) : (thx.TestValidation_testVal4Nel_48__Fun.__hx_current = ((thx.TestValidation_testVal4Nel_48__Fun) (new thx.TestValidation_testVal4Nel_48__Fun()) )) )) ))) ), ((haxe.lang.Function) (s) ))) ), ((haxe.lang.Function) (s) ))) ), ((haxe.lang.Function) (s) ))) ), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestValidation", "TestValidation.hx", "testVal4Nel"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (48) )) )}));
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 14 "/shared/core/thx/TestValidation.hx"
		{
			//line 14 "/shared/core/thx/TestValidation.hx"
			boolean __temp_executeDef1 = true;
			//line 14 "/shared/core/thx/TestValidation.hx"
			switch (field.hashCode())
			{
				case -162951568:
				{
					//line 14 "/shared/core/thx/TestValidation.hx"
					if (field.equals("testVal4Nel")) 
					{
						//line 14 "/shared/core/thx/TestValidation.hx"
						__temp_executeDef1 = false;
						//line 14 "/shared/core/thx/TestValidation.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testVal4Nel")) );
					}
					
					//line 14 "/shared/core/thx/TestValidation.hx"
					break;
				}
				
				
				case 110257:
				{
					//line 14 "/shared/core/thx/TestValidation.hx"
					if (field.equals("or4")) 
					{
						//line 14 "/shared/core/thx/TestValidation.hx"
						__temp_executeDef1 = false;
						//line 14 "/shared/core/thx/TestValidation.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "or4")) );
					}
					
					//line 14 "/shared/core/thx/TestValidation.hx"
					break;
				}
				
				
				case -1146733339:
				{
					//line 14 "/shared/core/thx/TestValidation.hx"
					if (field.equals("testVal4")) 
					{
						//line 14 "/shared/core/thx/TestValidation.hx"
						__temp_executeDef1 = false;
						//line 14 "/shared/core/thx/TestValidation.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testVal4")) );
					}
					
					//line 14 "/shared/core/thx/TestValidation.hx"
					break;
				}
				
				
				case 96417:
				{
					//line 14 "/shared/core/thx/TestValidation.hx"
					if (field.equals("add")) 
					{
						//line 14 "/shared/core/thx/TestValidation.hx"
						__temp_executeDef1 = false;
						//line 14 "/shared/core/thx/TestValidation.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "add")) );
					}
					
					//line 14 "/shared/core/thx/TestValidation.hx"
					break;
				}
				
				
				case -877170591:
				{
					//line 14 "/shared/core/thx/TestValidation.hx"
					if (field.equals("testAp")) 
					{
						//line 14 "/shared/core/thx/TestValidation.hx"
						__temp_executeDef1 = false;
						//line 14 "/shared/core/thx/TestValidation.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testAp")) );
					}
					
					//line 14 "/shared/core/thx/TestValidation.hx"
					break;
				}
				
				
			}
			
			//line 14 "/shared/core/thx/TestValidation.hx"
			if (__temp_executeDef1) 
			{
				//line 14 "/shared/core/thx/TestValidation.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 14 "/shared/core/thx/TestValidation.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 14 "/shared/core/thx/TestValidation.hx"
		{
			//line 14 "/shared/core/thx/TestValidation.hx"
			boolean __temp_executeDef1 = true;
			//line 14 "/shared/core/thx/TestValidation.hx"
			switch (field.hashCode())
			{
				case -162951568:
				{
					//line 14 "/shared/core/thx/TestValidation.hx"
					if (field.equals("testVal4Nel")) 
					{
						//line 14 "/shared/core/thx/TestValidation.hx"
						__temp_executeDef1 = false;
						//line 14 "/shared/core/thx/TestValidation.hx"
						this.testVal4Nel();
					}
					
					//line 14 "/shared/core/thx/TestValidation.hx"
					break;
				}
				
				
				case 110257:
				{
					//line 14 "/shared/core/thx/TestValidation.hx"
					if (field.equals("or4")) 
					{
						//line 14 "/shared/core/thx/TestValidation.hx"
						__temp_executeDef1 = false;
						//line 14 "/shared/core/thx/TestValidation.hx"
						return this.or4(haxe.lang.Runtime.toBool(dynargs.__get(0)), haxe.lang.Runtime.toBool(dynargs.__get(1)), haxe.lang.Runtime.toBool(dynargs.__get(2)), haxe.lang.Runtime.toBool(dynargs.__get(3)));
					}
					
					//line 14 "/shared/core/thx/TestValidation.hx"
					break;
				}
				
				
				case -1146733339:
				{
					//line 14 "/shared/core/thx/TestValidation.hx"
					if (field.equals("testVal4")) 
					{
						//line 14 "/shared/core/thx/TestValidation.hx"
						__temp_executeDef1 = false;
						//line 14 "/shared/core/thx/TestValidation.hx"
						this.testVal4();
					}
					
					//line 14 "/shared/core/thx/TestValidation.hx"
					break;
				}
				
				
				case 96417:
				{
					//line 14 "/shared/core/thx/TestValidation.hx"
					if (field.equals("add")) 
					{
						//line 14 "/shared/core/thx/TestValidation.hx"
						__temp_executeDef1 = false;
						//line 14 "/shared/core/thx/TestValidation.hx"
						return this.add(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(1))) ));
					}
					
					//line 14 "/shared/core/thx/TestValidation.hx"
					break;
				}
				
				
				case -877170591:
				{
					//line 14 "/shared/core/thx/TestValidation.hx"
					if (field.equals("testAp")) 
					{
						//line 14 "/shared/core/thx/TestValidation.hx"
						__temp_executeDef1 = false;
						//line 14 "/shared/core/thx/TestValidation.hx"
						this.testAp();
					}
					
					//line 14 "/shared/core/thx/TestValidation.hx"
					break;
				}
				
				
			}
			
			//line 14 "/shared/core/thx/TestValidation.hx"
			if (__temp_executeDef1) 
			{
				//line 14 "/shared/core/thx/TestValidation.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 14 "/shared/core/thx/TestValidation.hx"
		return null;
	}
	
	
}

