// Generated by Haxe 3.3.0
package utest;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TestResult extends haxe.lang.HxObject
{
	public TestResult(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public TestResult()
	{
		//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
		utest.TestResult.__hx_ctor_utest_TestResult(this);
	}
	
	
	public static void __hx_ctor_utest_TestResult(utest.TestResult __temp_me125)
	{
	}
	
	
	public static utest.TestResult ofHandler(utest.TestHandler handler)
	{
		//line 16 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
		utest.TestResult r = new utest.TestResult();
		//line 17 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
		haxe.root.Array<java.lang.String> path = haxe.lang.StringExt.split(haxe.root.Type.getClassName(((java.lang.Class) (haxe.root.Type.getClass(((java.lang.Object) (handler.fixture.target) ))) )), ".");
		//line 18 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
		r.cls = haxe.lang.Runtime.toString(path.pop());
		//line 19 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
		r.pack = path.join(".");
		//line 20 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
		r.method = handler.fixture.method;
		//line 21 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
		r.setup = handler.fixture.setup;
		//line 22 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
		r.teardown = handler.fixture.teardown;
		//line 23 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
		r.assertations = handler.results;
		//line 24 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
		return r;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
		return new utest.TestResult(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
		return new utest.TestResult();
	}
	
	
	public java.lang.String pack;
	
	public java.lang.String cls;
	
	public java.lang.String method;
	
	public java.lang.String setup;
	
	public java.lang.String teardown;
	
	public haxe.root.List<utest.Assertation> assertations;
	
	public boolean allOk()
	{
		//line 28 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
		{
			//line 28 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
			_List.ListNode<utest.Assertation> _g_head = this.assertations.h;
			//line 28 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
			{
				//line 28 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
				label1:
				//line 28 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
				while (( _g_head != null ))
				{
					//line 28 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
					utest.Assertation val = _g_head.item;
					//line 27 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
					_g_head = _g_head.next;
					//line 29 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
					switch (val.index)
					{
						case 0:
						{
							//line 30 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
							break label1;
						}
						
						
						default:
						{
							//line 31 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
							return false;
						}
						
					}
					
				}
				
			}
			
		}
		
		//line 34 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
		return true;
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
		{
			//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
			switch (field.hashCode())
			{
				case -272856348:
				{
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
					if (field.equals("assertations")) 
					{
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
						this.assertations = ((haxe.root.List<utest.Assertation>) (value) );
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
						return value;
					}
					
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
					break;
				}
				
				
				case 3432985:
				{
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
					if (field.equals("pack")) 
					{
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
						this.pack = haxe.lang.Runtime.toString(value);
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
						return value;
					}
					
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
					break;
				}
				
				
				case -1663474172:
				{
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
					if (field.equals("teardown")) 
					{
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
						this.teardown = haxe.lang.Runtime.toString(value);
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
						return value;
					}
					
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
					break;
				}
				
				
				case 98602:
				{
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
					if (field.equals("cls")) 
					{
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
						this.cls = haxe.lang.Runtime.toString(value);
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
						return value;
					}
					
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
					break;
				}
				
				
				case 109329021:
				{
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
					if (field.equals("setup")) 
					{
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
						this.setup = haxe.lang.Runtime.toString(value);
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
						return value;
					}
					
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
					break;
				}
				
				
				case -1077554975:
				{
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
					if (field.equals("method")) 
					{
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
						this.method = haxe.lang.Runtime.toString(value);
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
						return value;
					}
					
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
					break;
				}
				
				
			}
			
			//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
		{
			//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
			switch (field.hashCode())
			{
				case 92905309:
				{
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
					if (field.equals("allOk")) 
					{
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "allOk")) );
					}
					
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
					break;
				}
				
				
				case 3432985:
				{
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
					if (field.equals("pack")) 
					{
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
						return this.pack;
					}
					
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
					break;
				}
				
				
				case -272856348:
				{
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
					if (field.equals("assertations")) 
					{
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
						return this.assertations;
					}
					
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
					break;
				}
				
				
				case 98602:
				{
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
					if (field.equals("cls")) 
					{
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
						return this.cls;
					}
					
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
					break;
				}
				
				
				case -1663474172:
				{
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
					if (field.equals("teardown")) 
					{
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
						return this.teardown;
					}
					
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
					break;
				}
				
				
				case -1077554975:
				{
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
					if (field.equals("method")) 
					{
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
						return this.method;
					}
					
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
					break;
				}
				
				
				case 109329021:
				{
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
					if (field.equals("setup")) 
					{
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
						return this.setup;
					}
					
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
					break;
				}
				
				
			}
			
			//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
		{
			//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
			switch (field.hashCode())
			{
				case 92905309:
				{
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
					if (field.equals("allOk")) 
					{
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
						return this.allOk();
					}
					
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
					break;
				}
				
				
			}
			
			//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
		baseArr.push("assertations");
		//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
		baseArr.push("teardown");
		//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
		baseArr.push("setup");
		//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
		baseArr.push("method");
		//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
		baseArr.push("cls");
		//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
		baseArr.push("pack");
		//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
		{
			//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/TestResult.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


