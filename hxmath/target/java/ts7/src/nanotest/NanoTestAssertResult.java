// Generated by Haxe 3.3.0
package nanotest;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class NanoTestAssertResult extends haxe.lang.HxObject
{
	public NanoTestAssertResult(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public NanoTestAssertResult(java.lang.Object _result, int position)
	{
		//line 12 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
		nanotest.NanoTestAssertResult.__hx_ctor_nanotest_NanoTestAssertResult(this, _result, position);
	}
	
	
	public static void __hx_ctor_nanotest_NanoTestAssertResult(nanotest.NanoTestAssertResult __temp_me38, java.lang.Object _result, int position)
	{
		//line 13 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
		__temp_me38.result = _result;
		//line 14 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
		__temp_me38.position = position;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
		return new nanotest.NanoTestAssertResult(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
		return new nanotest.NanoTestAssertResult(arr.__get(0), ((int) (haxe.lang.Runtime.toInt(arr.__get(1))) ));
	}
	
	
	public java.lang.Object result;
	
	public int position;
	
	public nanotest.NanoTestAssertResult label(java.lang.Object d)
	{
		//line 18 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
		{
			//line 18 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
			nanotest.NanoTestStatus _g = ((haxe.root.Array<nanotest.NanoTestStatus>) (haxe.lang.Runtime.getField(this.result, "status", true)) ).__get(this.position);
			//line 18 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
			switch (_g.index)
			{
				case 0:
				{
					//line 19 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
					break;
				}
				
				
				case 1:
				{
					//line 18 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
					java.lang.Object p = _g.params[1];
					//line 18 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
					java.lang.String mes = haxe.lang.Runtime.toString(_g.params[0]);
					//line 21 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
					((haxe.root.Array<nanotest.NanoTestStatus>) (haxe.lang.Runtime.getField(this.result, "status", true)) ).__set(this.position, nanotest.NanoTestStatus.FAIL(( ( ( ( "" + mes ) + " [" ) + haxe.root.Std.string(d) ) + "]" ), p));
					//line 20 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
					break;
				}
				
				
				case 2:
				{
					//line 18 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
					haxe.root.Array<haxe.StackItem> p1 = ((haxe.root.Array<haxe.StackItem>) (_g.params[1]) );
					//line 18 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
					java.lang.String mes1 = haxe.lang.Runtime.toString(_g.params[0]);
					//line 23 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
					((haxe.root.Array<nanotest.NanoTestStatus>) (haxe.lang.Runtime.getField(this.result, "status", true)) ).__set(this.position, nanotest.NanoTestStatus.ERROR(( ( ( ( "" + mes1 ) + " [" ) + haxe.root.Std.string(d) ) + "]" ), p1));
					//line 22 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
					break;
				}
				
				
			}
			
		}
		
		//line 25 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
		return this;
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
		{
			//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
			boolean __temp_executeDef1 = true;
			//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
			switch (field.hashCode())
			{
				case 747804969:
				{
					//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
					if (field.equals("position")) 
					{
						//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
						this.position = ((int) (value) );
						//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
						return value;
					}
					
					//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
					break;
				}
				
				
				case -934426595:
				{
					//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
					if (field.equals("result")) 
					{
						//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
						this.result = ((java.lang.Object) (value) );
						//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
						return value;
					}
					
					//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
					break;
				}
				
				
			}
			
			//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
			if (__temp_executeDef1) 
			{
				//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
		{
			//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
			boolean __temp_executeDef1 = true;
			//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
			switch (field.hashCode())
			{
				case 747804969:
				{
					//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
					if (field.equals("position")) 
					{
						//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
						this.position = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
						return value;
					}
					
					//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
					break;
				}
				
				
				case -934426595:
				{
					//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
					if (field.equals("result")) 
					{
						//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
						this.result = ((java.lang.Object) (value) );
						//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
						return value;
					}
					
					//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
					break;
				}
				
				
			}
			
			//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
			if (__temp_executeDef1) 
			{
				//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
		{
			//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
			boolean __temp_executeDef1 = true;
			//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
			switch (field.hashCode())
			{
				case 102727412:
				{
					//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
					if (field.equals("label")) 
					{
						//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "label")) );
					}
					
					//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
					break;
				}
				
				
				case -934426595:
				{
					//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
					if (field.equals("result")) 
					{
						//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
						return this.result;
					}
					
					//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
					break;
				}
				
				
				case 747804969:
				{
					//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
					if (field.equals("position")) 
					{
						//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
						return this.position;
					}
					
					//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
					break;
				}
				
				
			}
			
			//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
			if (__temp_executeDef1) 
			{
				//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
		{
			//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
			boolean __temp_executeDef1 = true;
			//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
			switch (field.hashCode())
			{
				case 747804969:
				{
					//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
					if (field.equals("position")) 
					{
						//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
						return ((double) (this.position) );
					}
					
					//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
					break;
				}
				
				
				case -934426595:
				{
					//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
					if (field.equals("result")) 
					{
						//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
						return ((double) (haxe.lang.Runtime.toDouble(this.result)) );
					}
					
					//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
					break;
				}
				
				
			}
			
			//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
			if (__temp_executeDef1) 
			{
				//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
		{
			//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
			boolean __temp_executeDef1 = true;
			//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
			switch (field.hashCode())
			{
				case 102727412:
				{
					//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
					if (field.equals("label")) 
					{
						//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
						return this.label(dynargs.__get(0));
					}
					
					//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
					break;
				}
				
				
			}
			
			//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
			if (__temp_executeDef1) 
			{
				//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
		baseArr.push("position");
		//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
		baseArr.push("result");
		//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
		{
			//line 7 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestAssertResult.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


