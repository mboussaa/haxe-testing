// Generated by Haxe 3.3.0
package thx.error;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ErrorWrapper extends thx.Error
{
	public ErrorWrapper(haxe.lang.EmptyObject empty)
	{
		//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public ErrorWrapper(java.lang.String message, java.lang.Object innerError, haxe.root.Array<haxe.StackItem> stack, java.lang.Object pos)
	{
		//line 14 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
		super(haxe.lang.EmptyObject.EMPTY);
		//line 14 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
		thx.error.ErrorWrapper.__hx_ctor_thx_error_ErrorWrapper(this, message, innerError, stack, pos);
	}
	
	
	public static void __hx_ctor_thx_error_ErrorWrapper(thx.error.ErrorWrapper __temp_me149, java.lang.String message, java.lang.Object innerError, haxe.root.Array<haxe.StackItem> stack, java.lang.Object pos)
	{
		//line 14 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
		thx.Error.__hx_ctor_thx_Error(__temp_me149, message, stack, pos);
		//line 16 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
		__temp_me149.innerError = innerError;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
		return new thx.error.ErrorWrapper(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
		return new thx.error.ErrorWrapper(haxe.lang.Runtime.toString(arr.__get(0)), arr.__get(1), ((haxe.root.Array<haxe.StackItem>) (arr.__get(2)) ), arr.__get(3));
	}
	
	
	public java.lang.Object innerError;
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
		{
			//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
			switch (field.hashCode())
			{
				case 799545682:
				{
					//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
					if (field.equals("innerError")) 
					{
						//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
						__temp_executeDef1 = false;
						//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
						this.innerError = ((java.lang.Object) (value) );
						//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
						return value;
					}
					
					//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
					break;
				}
				
				
			}
			
			//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
		{
			//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
			switch (field.hashCode())
			{
				case 799545682:
				{
					//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
					if (field.equals("innerError")) 
					{
						//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
						__temp_executeDef1 = false;
						//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
						this.innerError = ((java.lang.Object) (value) );
						//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
						return value;
					}
					
					//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
					break;
				}
				
				
			}
			
			//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
		{
			//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
			switch (field.hashCode())
			{
				case 799545682:
				{
					//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
					if (field.equals("innerError")) 
					{
						//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
						__temp_executeDef1 = false;
						//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
						return this.innerError;
					}
					
					//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
					break;
				}
				
				
			}
			
			//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
		{
			//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
			switch (field.hashCode())
			{
				case 799545682:
				{
					//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
					if (field.equals("innerError")) 
					{
						//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
						__temp_executeDef1 = false;
						//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
						return ((double) (haxe.lang.Runtime.toDouble(this.innerError)) );
					}
					
					//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
					break;
				}
				
				
			}
			
			//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
		baseArr.push("innerError");
		//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
		{
			//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/ErrorWrapper.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}

