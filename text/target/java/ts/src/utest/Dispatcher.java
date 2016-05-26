// Generated by Haxe 3.3.0
package utest;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Dispatcher<T> extends haxe.lang.HxObject
{
	public Dispatcher(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Dispatcher()
	{
		//line 11 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
		utest.Dispatcher.__hx_ctor_utest_Dispatcher(((utest.Dispatcher<T>) (this) ));
	}
	
	
	public static <T_c> void __hx_ctor_utest_Dispatcher(utest.Dispatcher<T_c> __temp_me166)
	{
		//line 12 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
		__temp_me166.handlers = new haxe.root.Array<haxe.lang.Function>();
	}
	
	
	public static void stop()
	{
		//line 45 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
		throw haxe.lang.HaxeException.wrap(utest._Dispatcher.EventException.StopPropagation);
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
		return new utest.Dispatcher<java.lang.Object>(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
		return new utest.Dispatcher<java.lang.Object>();
	}
	
	
	public haxe.root.Array<haxe.lang.Function> handlers;
	
	public haxe.lang.Function add(haxe.lang.Function h)
	{
		//line 15 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
		this.handlers.push(h);
		//line 16 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
		return h;
	}
	
	
	public haxe.lang.Function remove(haxe.lang.Function h)
	{
		//line 20 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
		{
			//line 20 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
			int _g1 = 0;
			//line 20 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
			int _g = this.handlers.length;
			//line 20 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
			while (( _g1 < _g ))
			{
				//line 20 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
				int i = _g1++;
				//line 21 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
				if (haxe.root.Reflect.compareMethods(this.handlers.__get(i), h)) 
				{
					//line 22 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					return this.handlers.splice(i, 1).__get(0);
				}
				
			}
			
		}
		
		//line 23 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
		return null;
	}
	
	
	public void clear()
	{
		//line 27 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
		this.handlers = new haxe.root.Array<haxe.lang.Function>();
	}
	
	
	public boolean dispatch(T e)
	{
		//line 30 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
		try 
		{
			//line 32 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
			haxe.root.Array<haxe.lang.Function> list = this.handlers.copy();
			//line 33 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
			{
				//line 33 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
				int _g = 0;
				//line 33 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
				while (( _g < list.length ))
				{
					//line 33 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					haxe.lang.Function l = list.__get(_g);
					//line 33 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					 ++ _g;
					//line 34 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					l.__hx_invoke1_o(0.0, e);
				}
				
			}
			
			//line 35 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
			return true;
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 30 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 37 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 37 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 37 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 37 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
			if (( __temp_catchall2 instanceof utest._Dispatcher.EventException )) 
			{
				//line 37 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
				utest._Dispatcher.EventException exc = ((utest._Dispatcher.EventException) (__temp_catchall2) );
				//line 37 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
				{
					//line 37 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					return false;
				}
				
			}
			else
			{
				//line 37 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
				throw haxe.lang.HaxeException.wrap(__temp_catchallException1);
			}
			
		}
		
		
	}
	
	
	public boolean has()
	{
		//line 42 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
		return ( this.handlers.length > 0 );
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
		{
			//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
			boolean __temp_executeDef1 = true;
			//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
			switch (field.hashCode())
			{
				case 2069097:
				{
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					if (field.equals("handlers")) 
					{
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						this.handlers = ((haxe.root.Array<haxe.lang.Function>) (value) );
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						return value;
					}
					
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					break;
				}
				
				
			}
			
			//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
			if (__temp_executeDef1) 
			{
				//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
		{
			//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
			boolean __temp_executeDef1 = true;
			//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
			switch (field.hashCode())
			{
				case 103066:
				{
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					if (field.equals("has")) 
					{
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "has")) );
					}
					
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					break;
				}
				
				
				case 2069097:
				{
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					if (field.equals("handlers")) 
					{
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						return this.handlers;
					}
					
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					break;
				}
				
				
				case 284771450:
				{
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					if (field.equals("dispatch")) 
					{
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "dispatch")) );
					}
					
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					break;
				}
				
				
				case 96417:
				{
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					if (field.equals("add")) 
					{
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "add")) );
					}
					
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					break;
				}
				
				
				case 94746189:
				{
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					if (field.equals("clear")) 
					{
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "clear")) );
					}
					
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					break;
				}
				
				
				case -934610812:
				{
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					if (field.equals("remove")) 
					{
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "remove")) );
					}
					
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					break;
				}
				
				
			}
			
			//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
			if (__temp_executeDef1) 
			{
				//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
		{
			//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
			boolean __temp_executeDef1 = true;
			//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
			switch (field.hashCode())
			{
				case 103066:
				{
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					if (field.equals("has")) 
					{
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						return this.has();
					}
					
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					break;
				}
				
				
				case 96417:
				{
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					if (field.equals("add")) 
					{
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						return this.add(((haxe.lang.Function) (dynargs.__get(0)) ));
					}
					
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					break;
				}
				
				
				case 284771450:
				{
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					if (field.equals("dispatch")) 
					{
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						return this.dispatch(((T) (dynargs.__get(0)) ));
					}
					
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					break;
				}
				
				
				case -934610812:
				{
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					if (field.equals("remove")) 
					{
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						return this.remove(((haxe.lang.Function) (dynargs.__get(0)) ));
					}
					
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					break;
				}
				
				
				case 94746189:
				{
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					if (field.equals("clear")) 
					{
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						this.clear();
					}
					
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					break;
				}
				
				
			}
			
			//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
			if (__temp_executeDef1) 
			{
				//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
		baseArr.push("handlers");
		//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
		{
			//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


