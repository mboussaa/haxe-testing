// Generated by Haxe 3.3.0
package utest;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Notifier extends haxe.lang.HxObject
{
	public Notifier(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Notifier()
	{
		//line 52 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
		utest.Notifier.__hx_ctor_utest_Notifier(this);
	}
	
	
	public static void __hx_ctor_utest_Notifier(utest.Notifier __temp_me34)
	{
		//line 53 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
		__temp_me34.handlers = new haxe.root.Array<haxe.lang.Function>();
	}
	
	
	public static void stop()
	{
		//line 86 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
		throw haxe.lang.HaxeException.wrap(utest._Dispatcher.EventException.StopPropagation);
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
		return new utest.Notifier(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
		return new utest.Notifier();
	}
	
	
	public haxe.root.Array<haxe.lang.Function> handlers;
	
	public haxe.lang.Function add(haxe.lang.Function h)
	{
		//line 56 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
		this.handlers.push(h);
		//line 57 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
		return h;
	}
	
	
	public haxe.lang.Function remove(haxe.lang.Function h)
	{
		//line 61 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
		{
			//line 61 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
			int _g1 = 0;
			//line 61 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
			int _g = this.handlers.length;
			//line 61 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
			while (( _g1 < _g ))
			{
				//line 61 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
				int i = _g1++;
				//line 62 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
				if (haxe.root.Reflect.compareMethods(this.handlers.__get(i), h)) 
				{
					//line 63 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					return this.handlers.splice(i, 1).__get(0);
				}
				
			}
			
		}
		
		//line 64 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
		return null;
	}
	
	
	public void clear()
	{
		//line 68 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
		this.handlers = new haxe.root.Array<haxe.lang.Function>();
	}
	
	
	public boolean dispatch()
	{
		//line 71 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
		try 
		{
			//line 73 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
			haxe.root.Array<haxe.lang.Function> list = this.handlers.copy();
			//line 74 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
			{
				//line 74 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
				int _g = 0;
				//line 74 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
				while (( _g < list.length ))
				{
					//line 74 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					haxe.lang.Function l = list.__get(_g);
					//line 74 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					 ++ _g;
					//line 75 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					l.__hx_invoke0_o();
				}
				
			}
			
			//line 76 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
			return true;
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 71 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 78 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 78 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 78 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 78 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
			if (( __temp_catchall2 instanceof utest._Dispatcher.EventException )) 
			{
				//line 78 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
				utest._Dispatcher.EventException exc = ((utest._Dispatcher.EventException) (__temp_catchall2) );
				//line 78 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
				{
					//line 78 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					return false;
				}
				
			}
			else
			{
				//line 78 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
				throw haxe.lang.HaxeException.wrap(__temp_catchallException1);
			}
			
		}
		
		
	}
	
	
	public boolean has()
	{
		//line 83 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
		return ( this.handlers.length > 0 );
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
		{
			//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
			boolean __temp_executeDef1 = true;
			//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
			switch (field.hashCode())
			{
				case 2069097:
				{
					//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					if (field.equals("handlers")) 
					{
						//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						__temp_executeDef1 = false;
						//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						this.handlers = ((haxe.root.Array<haxe.lang.Function>) (value) );
						//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						return value;
					}
					
					//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					break;
				}
				
				
			}
			
			//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
			if (__temp_executeDef1) 
			{
				//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
		{
			//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
			boolean __temp_executeDef1 = true;
			//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
			switch (field.hashCode())
			{
				case 103066:
				{
					//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					if (field.equals("has")) 
					{
						//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						__temp_executeDef1 = false;
						//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "has")) );
					}
					
					//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					break;
				}
				
				
				case 2069097:
				{
					//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					if (field.equals("handlers")) 
					{
						//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						__temp_executeDef1 = false;
						//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						return this.handlers;
					}
					
					//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					break;
				}
				
				
				case 284771450:
				{
					//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					if (field.equals("dispatch")) 
					{
						//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						__temp_executeDef1 = false;
						//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "dispatch")) );
					}
					
					//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					break;
				}
				
				
				case 96417:
				{
					//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					if (field.equals("add")) 
					{
						//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						__temp_executeDef1 = false;
						//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "add")) );
					}
					
					//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					break;
				}
				
				
				case 94746189:
				{
					//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					if (field.equals("clear")) 
					{
						//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						__temp_executeDef1 = false;
						//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "clear")) );
					}
					
					//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					break;
				}
				
				
				case -934610812:
				{
					//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					if (field.equals("remove")) 
					{
						//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						__temp_executeDef1 = false;
						//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "remove")) );
					}
					
					//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					break;
				}
				
				
			}
			
			//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
			if (__temp_executeDef1) 
			{
				//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
		{
			//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
			boolean __temp_executeDef1 = true;
			//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
			switch (field.hashCode())
			{
				case 103066:
				{
					//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					if (field.equals("has")) 
					{
						//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						__temp_executeDef1 = false;
						//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						return this.has();
					}
					
					//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					break;
				}
				
				
				case 96417:
				{
					//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					if (field.equals("add")) 
					{
						//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						__temp_executeDef1 = false;
						//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						return this.add(((haxe.lang.Function) (dynargs.__get(0)) ));
					}
					
					//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					break;
				}
				
				
				case 284771450:
				{
					//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					if (field.equals("dispatch")) 
					{
						//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						__temp_executeDef1 = false;
						//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						return this.dispatch();
					}
					
					//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					break;
				}
				
				
				case -934610812:
				{
					//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					if (field.equals("remove")) 
					{
						//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						__temp_executeDef1 = false;
						//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						return this.remove(((haxe.lang.Function) (dynargs.__get(0)) ));
					}
					
					//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					break;
				}
				
				
				case 94746189:
				{
					//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					if (field.equals("clear")) 
					{
						//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						__temp_executeDef1 = false;
						//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
						this.clear();
					}
					
					//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
					break;
				}
				
				
			}
			
			//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
			if (__temp_executeDef1) 
			{
				//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
		baseArr.push("handlers");
		//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
		{
			//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Dispatcher.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


