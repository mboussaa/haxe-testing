// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class MapIterator<A, B> extends haxe.lang.HxObject
{
	public MapIterator(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public MapIterator(java.lang.Object base, haxe.lang.Function f)
	{
		//line 353 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		thx.MapIterator.__hx_ctor_thx_MapIterator(((thx.MapIterator<A, B>) (this) ), ((java.lang.Object) (base) ), ((haxe.lang.Function) (f) ));
	}
	
	
	public static <A_c, B_c> void __hx_ctor_thx_MapIterator(thx.MapIterator<A_c, B_c> __temp_me98, java.lang.Object base, haxe.lang.Function f)
	{
		//line 354 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		__temp_me98.base = base;
		//line 355 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		__temp_me98.f = f;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		return new thx.MapIterator<java.lang.Object, java.lang.Object>(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		return new thx.MapIterator<java.lang.Object, java.lang.Object>(arr.__get(0), ((haxe.lang.Function) (arr.__get(1)) ));
	}
	
	
	public java.lang.Object base;
	
	public haxe.lang.Function f;
	
	public B next()
	{
		//line 359 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		return ((B) (this.f.__hx_invoke1_o(0.0, ((A) (haxe.lang.Runtime.callField(this.base, "next", null)) ))) );
	}
	
	
	public boolean hasNext()
	{
		//line 362 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		return haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(this.base, "hasNext", null));
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		{
			//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			boolean __temp_executeDef1 = true;
			//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			switch (field.hashCode())
			{
				case 3016401:
				{
					//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
					if (field.equals("base")) 
					{
						//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
						__temp_executeDef1 = false;
						//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
						this.base = ((java.lang.Object) (value) );
						//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
						return value;
					}
					
					//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
					break;
				}
				
				
			}
			
			//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			if (__temp_executeDef1) 
			{
				//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		{
			//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			boolean __temp_executeDef1 = true;
			//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			switch (field.hashCode())
			{
				case 102:
				{
					//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
					if (field.equals("f")) 
					{
						//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
						__temp_executeDef1 = false;
						//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
						this.f = ((haxe.lang.Function) (value) );
						//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
						return value;
					}
					
					//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
					break;
				}
				
				
				case 3016401:
				{
					//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
					if (field.equals("base")) 
					{
						//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
						__temp_executeDef1 = false;
						//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
						this.base = ((java.lang.Object) (value) );
						//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
						return value;
					}
					
					//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
					break;
				}
				
				
			}
			
			//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			if (__temp_executeDef1) 
			{
				//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		{
			//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			boolean __temp_executeDef1 = true;
			//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			switch (field.hashCode())
			{
				case 696759469:
				{
					//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
					if (field.equals("hasNext")) 
					{
						//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
						__temp_executeDef1 = false;
						//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "hasNext")) );
					}
					
					//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
					break;
				}
				
				
				case 3016401:
				{
					//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
					if (field.equals("base")) 
					{
						//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
						__temp_executeDef1 = false;
						//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
						return this.base;
					}
					
					//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
					break;
				}
				
				
				case 3377907:
				{
					//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
					if (field.equals("next")) 
					{
						//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
						__temp_executeDef1 = false;
						//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "next")) );
					}
					
					//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
					break;
				}
				
				
				case 102:
				{
					//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
					if (field.equals("f")) 
					{
						//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
						__temp_executeDef1 = false;
						//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
						return this.f;
					}
					
					//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
					break;
				}
				
				
			}
			
			//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			if (__temp_executeDef1) 
			{
				//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		{
			//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			boolean __temp_executeDef1 = true;
			//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			switch (field.hashCode())
			{
				case 3016401:
				{
					//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
					if (field.equals("base")) 
					{
						//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
						__temp_executeDef1 = false;
						//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
						return ((double) (haxe.lang.Runtime.toDouble(this.base)) );
					}
					
					//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
					break;
				}
				
				
			}
			
			//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			if (__temp_executeDef1) 
			{
				//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		{
			//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			boolean __temp_executeDef1 = true;
			//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			switch (field.hashCode())
			{
				case 696759469:
				{
					//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
					if (field.equals("hasNext")) 
					{
						//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
						__temp_executeDef1 = false;
						//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
						return this.hasNext();
					}
					
					//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
					break;
				}
				
				
				case 3377907:
				{
					//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
					if (field.equals("next")) 
					{
						//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
						__temp_executeDef1 = false;
						//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
						return this.next();
					}
					
					//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
					break;
				}
				
				
			}
			
			//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			if (__temp_executeDef1) 
			{
				//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		baseArr.push("f");
		//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		baseArr.push("base");
		//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
		{
			//line 349 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Iterators.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


