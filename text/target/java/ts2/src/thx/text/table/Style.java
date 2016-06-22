// Generated by Haxe 3.3.0
package thx.text.table;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Style extends haxe.lang.HxObject implements thx.text.table.IStyle
{
	public Style(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Style()
	{
		//line 19 "/shared/text/src/thx/text/table/Style.hx"
		thx.text.table.Style.__hx_ctor_thx_text_table_Style(this);
	}
	
	
	public static void __hx_ctor_thx_text_table_Style(thx.text.table.Style __temp_me160)
	{
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 11 "/shared/text/src/thx/text/table/Style.hx"
		return new thx.text.table.Style(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 11 "/shared/text/src/thx/text/table/Style.hx"
		return new thx.text.table.Style();
	}
	
	
	public thx.text.table.CellType type;
	
	public java.lang.Object maxHeight;
	
	public int minHeight;
	
	public java.lang.Object maxWidth;
	
	public int minWidth;
	
	public haxe.lang.Function formatter;
	
	public haxe.lang.Function aligner;
	
	public void setAlign(thx.text.table.HAlign align)
	{
		//line 22 "/shared/text/src/thx/text/table/Style.hx"
		this.set_aligner(new thx.text.table.Style_setAlign_22__Fun(align));
	}
	
	
	public thx.text.table.CellType get_type()
	{
		//line 25 "/shared/text/src/thx/text/table/Style.hx"
		return this.type;
	}
	
	
	public thx.text.table.CellType set_type(thx.text.table.CellType value)
	{
		//line 28 "/shared/text/src/thx/text/table/Style.hx"
		return this.type = value;
	}
	
	
	public java.lang.Object get_maxHeight()
	{
		//line 31 "/shared/text/src/thx/text/table/Style.hx"
		return this.maxHeight;
	}
	
	
	public java.lang.Object set_maxHeight(java.lang.Object value)
	{
		//line 34 "/shared/text/src/thx/text/table/Style.hx"
		return this.maxHeight = value;
	}
	
	
	public int get_minHeight()
	{
		//line 37 "/shared/text/src/thx/text/table/Style.hx"
		return this.minHeight;
	}
	
	
	public int set_minHeight(int value)
	{
		//line 40 "/shared/text/src/thx/text/table/Style.hx"
		return this.minHeight = value;
	}
	
	
	public java.lang.Object get_maxWidth()
	{
		//line 43 "/shared/text/src/thx/text/table/Style.hx"
		return this.maxWidth;
	}
	
	
	public java.lang.Object set_maxWidth(java.lang.Object value)
	{
		//line 46 "/shared/text/src/thx/text/table/Style.hx"
		return this.maxWidth = value;
	}
	
	
	public int get_minWidth()
	{
		//line 49 "/shared/text/src/thx/text/table/Style.hx"
		return this.minWidth;
	}
	
	
	public int set_minWidth(int value)
	{
		//line 52 "/shared/text/src/thx/text/table/Style.hx"
		return this.minWidth = value;
	}
	
	
	public haxe.lang.Function get_formatter()
	{
		//line 55 "/shared/text/src/thx/text/table/Style.hx"
		return this.formatter;
	}
	
	
	public haxe.lang.Function set_formatter(haxe.lang.Function value)
	{
		//line 58 "/shared/text/src/thx/text/table/Style.hx"
		return this.formatter = value;
	}
	
	
	public haxe.lang.Function get_aligner()
	{
		//line 61 "/shared/text/src/thx/text/table/Style.hx"
		return this.aligner;
	}
	
	
	public haxe.lang.Function set_aligner(haxe.lang.Function value)
	{
		//line 64 "/shared/text/src/thx/text/table/Style.hx"
		return this.aligner = value;
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 11 "/shared/text/src/thx/text/table/Style.hx"
		{
			//line 11 "/shared/text/src/thx/text/table/Style.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "/shared/text/src/thx/text/table/Style.hx"
			switch (field.hashCode())
			{
				case -1375815020:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("minWidth")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						if (handleProperties) 
						{
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							this.set_minWidth(((int) (value) ));
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							return value;
						}
						else
						{
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							this.minWidth = ((int) (value) );
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							return value;
						}
						
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case -906066005:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("maxHeight")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						if (handleProperties) 
						{
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							this.set_maxHeight(value);
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							return value;
						}
						else
						{
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							this.maxHeight = ((java.lang.Object) (value) );
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							return value;
						}
						
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case 400381634:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("maxWidth")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						if (handleProperties) 
						{
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							this.set_maxWidth(value);
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							return value;
						}
						else
						{
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							this.maxWidth = ((java.lang.Object) (value) );
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							return value;
						}
						
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case -133587431:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("minHeight")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						if (handleProperties) 
						{
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							this.set_minHeight(((int) (value) ));
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							return value;
						}
						else
						{
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							this.minHeight = ((int) (value) );
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							return value;
						}
						
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
			}
			
			//line 11 "/shared/text/src/thx/text/table/Style.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "/shared/text/src/thx/text/table/Style.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 11 "/shared/text/src/thx/text/table/Style.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 11 "/shared/text/src/thx/text/table/Style.hx"
		{
			//line 11 "/shared/text/src/thx/text/table/Style.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "/shared/text/src/thx/text/table/Style.hx"
			switch (field.hashCode())
			{
				case -914360718:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("aligner")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						if (handleProperties) 
						{
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							this.set_aligner(((haxe.lang.Function) (value) ));
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							return value;
						}
						else
						{
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							this.aligner = ((haxe.lang.Function) (value) );
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							return value;
						}
						
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case 3575610:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("type")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						if (handleProperties) 
						{
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							this.set_type(((thx.text.table.CellType) (value) ));
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							return value;
						}
						else
						{
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							this.type = ((thx.text.table.CellType) (value) );
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							return value;
						}
						
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case 1811591370:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("formatter")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						if (handleProperties) 
						{
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							this.set_formatter(((haxe.lang.Function) (value) ));
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							return value;
						}
						else
						{
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							this.formatter = ((haxe.lang.Function) (value) );
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							return value;
						}
						
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case -906066005:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("maxHeight")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						if (handleProperties) 
						{
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							this.set_maxHeight(value);
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							return value;
						}
						else
						{
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							this.maxHeight = ((java.lang.Object) (value) );
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							return value;
						}
						
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case -1375815020:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("minWidth")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						if (handleProperties) 
						{
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							this.set_minWidth(((int) (haxe.lang.Runtime.toInt(value)) ));
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							return value;
						}
						else
						{
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							this.minWidth = ((int) (haxe.lang.Runtime.toInt(value)) );
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							return value;
						}
						
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case -133587431:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("minHeight")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						if (handleProperties) 
						{
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							this.set_minHeight(((int) (haxe.lang.Runtime.toInt(value)) ));
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							return value;
						}
						else
						{
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							this.minHeight = ((int) (haxe.lang.Runtime.toInt(value)) );
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							return value;
						}
						
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case 400381634:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("maxWidth")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						if (handleProperties) 
						{
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							this.set_maxWidth(value);
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							return value;
						}
						else
						{
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							this.maxWidth = ((java.lang.Object) (value) );
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							return value;
						}
						
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
			}
			
			//line 11 "/shared/text/src/thx/text/table/Style.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "/shared/text/src/thx/text/table/Style.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 11 "/shared/text/src/thx/text/table/Style.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 11 "/shared/text/src/thx/text/table/Style.hx"
		{
			//line 11 "/shared/text/src/thx/text/table/Style.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "/shared/text/src/thx/text/table/Style.hx"
			switch (field.hashCode())
			{
				case -926427243:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("set_aligner")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_aligner")) );
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case 3575610:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("type")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						if (handleProperties) 
						{
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							return this.get_type();
						}
						else
						{
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							return this.type;
						}
						
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case -837847415:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("get_aligner")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_aligner")) );
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case -906066005:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("maxHeight")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						if (handleProperties) 
						{
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							return this.get_maxHeight();
						}
						else
						{
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							return this.maxHeight;
						}
						
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case -1194404563:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("set_formatter")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_formatter")) );
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case -133587431:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("minHeight")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						if (handleProperties) 
						{
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							return this.get_minHeight();
						}
						else
						{
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							return this.minHeight;
						}
						
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case -1968535775:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("get_formatter")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_formatter")) );
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case 400381634:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("maxWidth")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						if (handleProperties) 
						{
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							return this.get_maxWidth();
						}
						else
						{
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							return this.maxWidth;
						}
						
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case -1749877295:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("set_minWidth")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_minWidth")) );
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case -1375815020:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("minWidth")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						if (handleProperties) 
						{
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							return this.get_minWidth();
						}
						else
						{
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							return this.minWidth;
						}
						
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case 996097373:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("get_minWidth")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_minWidth")) );
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case 1811591370:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("formatter")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						if (handleProperties) 
						{
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							return this.get_formatter();
						}
						else
						{
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							return this.formatter;
						}
						
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case 26319359:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("set_maxWidth")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_maxWidth")) );
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case -914360718:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("aligner")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						if (handleProperties) 
						{
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							return this.get_aligner();
						}
						else
						{
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							return this.aligner;
						}
						
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case -1522673269:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("get_maxWidth")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_maxWidth")) );
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case 1387616195:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("setAlign")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setAlign")) );
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case 1155383932:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("set_minHeight")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_minHeight")) );
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case 1976688259:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("get_type")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_type")) );
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case 381252720:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("get_minHeight")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_minHeight")) );
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case 1415575799:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("set_type")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_type")) );
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case 382905358:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("set_maxHeight")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_maxHeight")) );
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case -391225854:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("get_maxHeight")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_maxHeight")) );
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
			}
			
			//line 11 "/shared/text/src/thx/text/table/Style.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "/shared/text/src/thx/text/table/Style.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 11 "/shared/text/src/thx/text/table/Style.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 11 "/shared/text/src/thx/text/table/Style.hx"
		{
			//line 11 "/shared/text/src/thx/text/table/Style.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "/shared/text/src/thx/text/table/Style.hx"
			switch (field.hashCode())
			{
				case -1375815020:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("minWidth")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						if (handleProperties) 
						{
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							return ((double) (this.get_minWidth()) );
						}
						else
						{
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							return ((double) (this.minWidth) );
						}
						
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case -906066005:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("maxHeight")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						if (handleProperties) 
						{
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							return ((double) (haxe.lang.Runtime.toDouble(this.get_maxHeight())) );
						}
						else
						{
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							return ((double) (haxe.lang.Runtime.toDouble(this.maxHeight)) );
						}
						
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case 400381634:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("maxWidth")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						if (handleProperties) 
						{
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							return ((double) (haxe.lang.Runtime.toDouble(this.get_maxWidth())) );
						}
						else
						{
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							return ((double) (haxe.lang.Runtime.toDouble(this.maxWidth)) );
						}
						
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case -133587431:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("minHeight")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						if (handleProperties) 
						{
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							return ((double) (this.get_minHeight()) );
						}
						else
						{
							//line 11 "/shared/text/src/thx/text/table/Style.hx"
							return ((double) (this.minHeight) );
						}
						
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
			}
			
			//line 11 "/shared/text/src/thx/text/table/Style.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "/shared/text/src/thx/text/table/Style.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 11 "/shared/text/src/thx/text/table/Style.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 11 "/shared/text/src/thx/text/table/Style.hx"
		{
			//line 11 "/shared/text/src/thx/text/table/Style.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "/shared/text/src/thx/text/table/Style.hx"
			switch (field.hashCode())
			{
				case -926427243:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("set_aligner")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						return this.set_aligner(((haxe.lang.Function) (dynargs.__get(0)) ));
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case 1387616195:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("setAlign")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						this.setAlign(((thx.text.table.HAlign) (dynargs.__get(0)) ));
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case -837847415:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("get_aligner")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						return this.get_aligner();
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case 1976688259:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("get_type")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						return this.get_type();
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case -1194404563:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("set_formatter")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						return this.set_formatter(((haxe.lang.Function) (dynargs.__get(0)) ));
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case 1415575799:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("set_type")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						return this.set_type(((thx.text.table.CellType) (dynargs.__get(0)) ));
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case -1968535775:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("get_formatter")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						return this.get_formatter();
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case -391225854:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("get_maxHeight")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						return this.get_maxHeight();
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case -1749877295:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("set_minWidth")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						return this.set_minWidth(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ));
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case 382905358:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("set_maxHeight")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						return this.set_maxHeight(dynargs.__get(0));
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case 996097373:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("get_minWidth")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						return this.get_minWidth();
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case 381252720:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("get_minHeight")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						return this.get_minHeight();
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case 26319359:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("set_maxWidth")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						return this.set_maxWidth(dynargs.__get(0));
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case 1155383932:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("set_minHeight")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						return this.set_minHeight(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ));
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
				case -1522673269:
				{
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					if (field.equals("get_maxWidth")) 
					{
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/text/src/thx/text/table/Style.hx"
						return this.get_maxWidth();
					}
					
					//line 11 "/shared/text/src/thx/text/table/Style.hx"
					break;
				}
				
				
			}
			
			//line 11 "/shared/text/src/thx/text/table/Style.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "/shared/text/src/thx/text/table/Style.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 11 "/shared/text/src/thx/text/table/Style.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 11 "/shared/text/src/thx/text/table/Style.hx"
		baseArr.push("aligner");
		//line 11 "/shared/text/src/thx/text/table/Style.hx"
		baseArr.push("formatter");
		//line 11 "/shared/text/src/thx/text/table/Style.hx"
		baseArr.push("minWidth");
		//line 11 "/shared/text/src/thx/text/table/Style.hx"
		baseArr.push("maxWidth");
		//line 11 "/shared/text/src/thx/text/table/Style.hx"
		baseArr.push("minHeight");
		//line 11 "/shared/text/src/thx/text/table/Style.hx"
		baseArr.push("maxHeight");
		//line 11 "/shared/text/src/thx/text/table/Style.hx"
		baseArr.push("type");
		//line 11 "/shared/text/src/thx/text/table/Style.hx"
		{
			//line 11 "/shared/text/src/thx/text/table/Style.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}

