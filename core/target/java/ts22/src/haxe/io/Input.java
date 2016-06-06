// Generated by Haxe 3.3.0
package haxe.io;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Input extends haxe.lang.HxObject
{
	public Input(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Input()
	{
		//line 28 "/usr/lib/haxe/std/haxe/io/Input.hx"
		haxe.io.Input.__hx_ctor_haxe_io_Input(this);
	}
	
	
	public static void __hx_ctor_haxe_io_Input(haxe.io.Input __temp_me33)
	{
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 28 "/usr/lib/haxe/std/haxe/io/Input.hx"
		return new haxe.io.Input(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 28 "/usr/lib/haxe/std/haxe/io/Input.hx"
		return new haxe.io.Input();
	}
	
	
	public int readByte()
	{
		//line 50 "/usr/lib/haxe/std/haxe/io/Input.hx"
		throw haxe.lang.HaxeException.wrap("Not implemented");
	}
	
	
	public java.lang.String readLine()
	{
		//line 172 "/usr/lib/haxe/std/haxe/io/Input.hx"
		haxe.root.StringBuf buf = new haxe.root.StringBuf();
		//line 173 "/usr/lib/haxe/std/haxe/io/Input.hx"
		int last = 0;
		//line 174 "/usr/lib/haxe/std/haxe/io/Input.hx"
		java.lang.String s = null;
		//line 175 "/usr/lib/haxe/std/haxe/io/Input.hx"
		try 
		{
			//line 176 "/usr/lib/haxe/std/haxe/io/Input.hx"
			while (true)
			{
				//line 176 "/usr/lib/haxe/std/haxe/io/Input.hx"
				last = this.readByte();
				//line 176 "/usr/lib/haxe/std/haxe/io/Input.hx"
				if ( ! ((( last != 10 ))) ) 
				{
					//line 176 "/usr/lib/haxe/std/haxe/io/Input.hx"
					break;
				}
				
				//line 177 "/usr/lib/haxe/std/haxe/io/Input.hx"
				buf.addChar(last);
			}
			
			//line 178 "/usr/lib/haxe/std/haxe/io/Input.hx"
			s = buf.toString();
			//line 179 "/usr/lib/haxe/std/haxe/io/Input.hx"
			if (haxe.lang.Runtime.eq(haxe.lang.StringExt.charCodeAt(s, ( s.length() - 1 )), 13)) 
			{
				//line 179 "/usr/lib/haxe/std/haxe/io/Input.hx"
				s = haxe.lang.StringExt.substr(s, 0, -1);
			}
			
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 175 "/usr/lib/haxe/std/haxe/io/Input.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 180 "/usr/lib/haxe/std/haxe/io/Input.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 180 "/usr/lib/haxe/std/haxe/io/Input.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 180 "/usr/lib/haxe/std/haxe/io/Input.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 180 "/usr/lib/haxe/std/haxe/io/Input.hx"
			if (( __temp_catchall2 instanceof haxe.io.Eof )) 
			{
				//line 180 "/usr/lib/haxe/std/haxe/io/Input.hx"
				haxe.io.Eof e = ((haxe.io.Eof) (__temp_catchall2) );
				//line 180 "/usr/lib/haxe/std/haxe/io/Input.hx"
				{
					//line 181 "/usr/lib/haxe/std/haxe/io/Input.hx"
					s = buf.toString();
					//line 182 "/usr/lib/haxe/std/haxe/io/Input.hx"
					if (( s.length() == 0 )) 
					{
						//line 183 "/usr/lib/haxe/std/haxe/io/Input.hx"
						throw haxe.lang.HaxeException.wrap(e);
					}
					
				}
				
			}
			else
			{
				//line 180 "/usr/lib/haxe/std/haxe/io/Input.hx"
				throw haxe.lang.HaxeException.wrap(__temp_catchallException1);
			}
			
		}
		
		
		//line 185 "/usr/lib/haxe/std/haxe/io/Input.hx"
		return s;
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 28 "/usr/lib/haxe/std/haxe/io/Input.hx"
		{
			//line 28 "/usr/lib/haxe/std/haxe/io/Input.hx"
			boolean __temp_executeDef1 = true;
			//line 28 "/usr/lib/haxe/std/haxe/io/Input.hx"
			switch (field.hashCode())
			{
				case -867777878:
				{
					//line 28 "/usr/lib/haxe/std/haxe/io/Input.hx"
					if (field.equals("readLine")) 
					{
						//line 28 "/usr/lib/haxe/std/haxe/io/Input.hx"
						__temp_executeDef1 = false;
						//line 28 "/usr/lib/haxe/std/haxe/io/Input.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readLine")) );
					}
					
					//line 28 "/usr/lib/haxe/std/haxe/io/Input.hx"
					break;
				}
				
				
				case -868060226:
				{
					//line 28 "/usr/lib/haxe/std/haxe/io/Input.hx"
					if (field.equals("readByte")) 
					{
						//line 28 "/usr/lib/haxe/std/haxe/io/Input.hx"
						__temp_executeDef1 = false;
						//line 28 "/usr/lib/haxe/std/haxe/io/Input.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readByte")) );
					}
					
					//line 28 "/usr/lib/haxe/std/haxe/io/Input.hx"
					break;
				}
				
				
			}
			
			//line 28 "/usr/lib/haxe/std/haxe/io/Input.hx"
			if (__temp_executeDef1) 
			{
				//line 28 "/usr/lib/haxe/std/haxe/io/Input.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 28 "/usr/lib/haxe/std/haxe/io/Input.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 28 "/usr/lib/haxe/std/haxe/io/Input.hx"
		{
			//line 28 "/usr/lib/haxe/std/haxe/io/Input.hx"
			boolean __temp_executeDef1 = true;
			//line 28 "/usr/lib/haxe/std/haxe/io/Input.hx"
			switch (field.hashCode())
			{
				case -867777878:
				{
					//line 28 "/usr/lib/haxe/std/haxe/io/Input.hx"
					if (field.equals("readLine")) 
					{
						//line 28 "/usr/lib/haxe/std/haxe/io/Input.hx"
						__temp_executeDef1 = false;
						//line 28 "/usr/lib/haxe/std/haxe/io/Input.hx"
						return this.readLine();
					}
					
					//line 28 "/usr/lib/haxe/std/haxe/io/Input.hx"
					break;
				}
				
				
				case -868060226:
				{
					//line 28 "/usr/lib/haxe/std/haxe/io/Input.hx"
					if (field.equals("readByte")) 
					{
						//line 28 "/usr/lib/haxe/std/haxe/io/Input.hx"
						__temp_executeDef1 = false;
						//line 28 "/usr/lib/haxe/std/haxe/io/Input.hx"
						return this.readByte();
					}
					
					//line 28 "/usr/lib/haxe/std/haxe/io/Input.hx"
					break;
				}
				
				
			}
			
			//line 28 "/usr/lib/haxe/std/haxe/io/Input.hx"
			if (__temp_executeDef1) 
			{
				//line 28 "/usr/lib/haxe/std/haxe/io/Input.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 28 "/usr/lib/haxe/std/haxe/io/Input.hx"
				throw null;
			}
			
		}
		
	}
	
	
}

