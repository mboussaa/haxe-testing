// Generated by Haxe 3.3.0
package utest;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TestFixture extends haxe.lang.HxObject
{
	public TestFixture(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public TestFixture(java.lang.Object target, java.lang.String method, java.lang.String setup, java.lang.String teardown)
	{
		//line 8 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
		utest.TestFixture.__hx_ctor_utest_TestFixture(this, target, method, setup, teardown);
	}
	
	
	public static void __hx_ctor_utest_TestFixture(utest.TestFixture __temp_me255, java.lang.Object target, java.lang.String method, java.lang.String setup, java.lang.String teardown)
	{
		//line 9 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
		__temp_me255.target = target;
		//line 10 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
		__temp_me255.method = method;
		//line 11 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
		__temp_me255.setup = setup;
		//line 12 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
		__temp_me255.teardown = teardown;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
		return new utest.TestFixture(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
		return new utest.TestFixture(arr.__get(0), haxe.lang.Runtime.toString(arr.__get(1)), haxe.lang.Runtime.toString(arr.__get(2)), haxe.lang.Runtime.toString(arr.__get(3)));
	}
	
	
	public java.lang.Object target;
	
	public java.lang.String method;
	
	public java.lang.String setup;
	
	public java.lang.String teardown;
	
	public void checkMethod(java.lang.String name, java.lang.String arg)
	{
		//line 16 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
		java.lang.Object field = haxe.root.Reflect.field(this.target, name);
		//line 17 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
		if (( field == null )) 
		{
			//line 17 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
			throw haxe.lang.HaxeException.wrap(( ( ( arg + " function " ) + name ) + " is not a field of target" ));
		}
		
		//line 18 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
		if ( ! (haxe.root.Reflect.isFunction(field)) ) 
		{
			//line 18 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
			throw haxe.lang.HaxeException.wrap(( ( ( arg + " function " ) + name ) + " is not a function" ));
		}
		
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
		{
			//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
			boolean __temp_executeDef1 = true;
			//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
			switch (field.hashCode())
			{
				case -880905839:
				{
					//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
					if (field.equals("target")) 
					{
						//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
						__temp_executeDef1 = false;
						//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
						this.target = ((java.lang.Object) (value) );
						//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
						return value;
					}
					
					//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
					break;
				}
				
				
			}
			
			//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
			if (__temp_executeDef1) 
			{
				//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
		{
			//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
			boolean __temp_executeDef1 = true;
			//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
			switch (field.hashCode())
			{
				case -1663474172:
				{
					//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
					if (field.equals("teardown")) 
					{
						//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
						__temp_executeDef1 = false;
						//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
						this.teardown = haxe.lang.Runtime.toString(value);
						//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
						return value;
					}
					
					//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
					break;
				}
				
				
				case -880905839:
				{
					//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
					if (field.equals("target")) 
					{
						//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
						__temp_executeDef1 = false;
						//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
						this.target = ((java.lang.Object) (value) );
						//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
						return value;
					}
					
					//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
					break;
				}
				
				
				case 109329021:
				{
					//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
					if (field.equals("setup")) 
					{
						//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
						__temp_executeDef1 = false;
						//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
						this.setup = haxe.lang.Runtime.toString(value);
						//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
						return value;
					}
					
					//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
					break;
				}
				
				
				case -1077554975:
				{
					//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
					if (field.equals("method")) 
					{
						//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
						__temp_executeDef1 = false;
						//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
						this.method = haxe.lang.Runtime.toString(value);
						//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
						return value;
					}
					
					//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
					break;
				}
				
				
			}
			
			//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
			if (__temp_executeDef1) 
			{
				//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
		{
			//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
			boolean __temp_executeDef1 = true;
			//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
			switch (field.hashCode())
			{
				case 583056393:
				{
					//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
					if (field.equals("checkMethod")) 
					{
						//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
						__temp_executeDef1 = false;
						//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "checkMethod")) );
					}
					
					//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
					break;
				}
				
				
				case -880905839:
				{
					//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
					if (field.equals("target")) 
					{
						//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
						__temp_executeDef1 = false;
						//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
						return this.target;
					}
					
					//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
					break;
				}
				
				
				case -1663474172:
				{
					//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
					if (field.equals("teardown")) 
					{
						//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
						__temp_executeDef1 = false;
						//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
						return this.teardown;
					}
					
					//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
					break;
				}
				
				
				case -1077554975:
				{
					//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
					if (field.equals("method")) 
					{
						//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
						__temp_executeDef1 = false;
						//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
						return this.method;
					}
					
					//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
					break;
				}
				
				
				case 109329021:
				{
					//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
					if (field.equals("setup")) 
					{
						//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
						__temp_executeDef1 = false;
						//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
						return this.setup;
					}
					
					//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
					break;
				}
				
				
			}
			
			//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
			if (__temp_executeDef1) 
			{
				//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
		{
			//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
			boolean __temp_executeDef1 = true;
			//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
			switch (field.hashCode())
			{
				case -880905839:
				{
					//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
					if (field.equals("target")) 
					{
						//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
						__temp_executeDef1 = false;
						//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
						return ((double) (haxe.lang.Runtime.toDouble(this.target)) );
					}
					
					//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
					break;
				}
				
				
			}
			
			//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
			if (__temp_executeDef1) 
			{
				//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
		{
			//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
			boolean __temp_executeDef1 = true;
			//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
			switch (field.hashCode())
			{
				case 583056393:
				{
					//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
					if (field.equals("checkMethod")) 
					{
						//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
						__temp_executeDef1 = false;
						//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
						this.checkMethod(haxe.lang.Runtime.toString(dynargs.__get(0)), haxe.lang.Runtime.toString(dynargs.__get(1)));
					}
					
					//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
					break;
				}
				
				
			}
			
			//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
			if (__temp_executeDef1) 
			{
				//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
		baseArr.push("teardown");
		//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
		baseArr.push("setup");
		//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
		baseArr.push("method");
		//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
		baseArr.push("target");
		//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
		{
			//line 3 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestFixture.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


