// Generated by Haxe 3.3.0
package thx.text;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Table extends haxe.lang.HxObject
{
	public Table(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Table()
	{
		//line 74 "/shared/text/src/thx/text/Table.hx"
		thx.text.Table.__hx_ctor_thx_text_Table(this);
	}
	
	
	public static void __hx_ctor_thx_text_Table(thx.text.Table __temp_me151)
	{
		//line 75 "/shared/text/src/thx/text/Table.hx"
		__temp_me151._rows = new haxe.root.Array<thx.text.table.Row>(new thx.text.table.Row[]{});
		//line 76 "/shared/text/src/thx/text/Table.hx"
		__temp_me151._cols = new haxe.root.Array<thx.text.table.Col>(new thx.text.table.Col[]{});
		//line 77 "/shared/text/src/thx/text/Table.hx"
		__temp_me151.style = new thx.text.table.Style();
	}
	
	
	public static thx.text.Table fromData(haxe.root.Array<haxe.root.Array> data, java.lang.Object hasHeader, java.lang.String title)
	{
		//line 21 "/shared/text/src/thx/text/Table.hx"
		java.lang.Object __temp_hasHeader150 = ( (haxe.lang.Runtime.eq(hasHeader, null)) ? (((java.lang.Object) (true) )) : (hasHeader) );
		//line 22 "/shared/text/src/thx/text/Table.hx"
		int offset = ( (( title == null )) ? (0) : (1) );
		//line 22 "/shared/text/src/thx/text/Table.hx"
		thx.text.Table table = new thx.text.Table();
		//line 24 "/shared/text/src/thx/text/Table.hx"
		if (haxe.lang.Runtime.toBool((__temp_hasHeader150))) 
		{
			//line 25 "/shared/text/src/thx/text/Table.hx"
			table.ensureRow(offset).style.set_type(thx.text.table.CellType.Header);
		}
		
		//line 27 "/shared/text/src/thx/text/Table.hx"
		if (( null != title )) 
		{
			//line 28 "/shared/text/src/thx/text/Table.hx"
			table.ensureRow(0).style.set_type(thx.text.table.CellType.Header);
			//line 29 "/shared/text/src/thx/text/Table.hx"
			table.ensureRow(0).style.setAlign(thx.text.table.HAlign.Center);
			//line 30 "/shared/text/src/thx/text/Table.hx"
			table.set(((thx.text.table.CellValueImpl) (thx.text.table.CellValueImpl.StringCell(title)) ), 0, 0, thx.text.table.Span.FillRight);
		}
		
		//line 32 "/shared/text/src/thx/text/Table.hx"
		{
			//line 32 "/shared/text/src/thx/text/Table.hx"
			int _g1 = 0;
			//line 32 "/shared/text/src/thx/text/Table.hx"
			int _g = data.length;
			//line 32 "/shared/text/src/thx/text/Table.hx"
			while (( _g1 < _g ))
			{
				//line 32 "/shared/text/src/thx/text/Table.hx"
				int r = _g1++;
				//line 33 "/shared/text/src/thx/text/Table.hx"
				haxe.root.Array row = data.__get(r);
				//line 34 "/shared/text/src/thx/text/Table.hx"
				{
					//line 34 "/shared/text/src/thx/text/Table.hx"
					int _g3 = 0;
					//line 34 "/shared/text/src/thx/text/Table.hx"
					int _g2 = row.length;
					//line 34 "/shared/text/src/thx/text/Table.hx"
					while (( _g3 < _g2 ))
					{
						//line 34 "/shared/text/src/thx/text/Table.hx"
						int c = _g3++;
						//line 35 "/shared/text/src/thx/text/Table.hx"
						table.set(thx.text.table._CellValue.CellValue_Impl_.fromDynamic(row.__get(c)), ( r + offset ), c, null);
					}
					
				}
				
			}
			
		}
		
		//line 38 "/shared/text/src/thx/text/Table.hx"
		return table;
	}
	
	
	public static thx.text.Table fromObjects(haxe.root.Array<java.lang.Object> data, java.lang.String title)
	{
		//line 42 "/shared/text/src/thx/text/Table.hx"
		int offset = ( (( title == null )) ? (0) : (1) );
		//line 42 "/shared/text/src/thx/text/Table.hx"
		thx.text.Table table = new thx.text.Table();
		//line 42 "/shared/text/src/thx/text/Table.hx"
		haxe.ds.StringMap<java.lang.Object> headers = new haxe.ds.StringMap<java.lang.Object>();
		//line 42 "/shared/text/src/thx/text/Table.hx"
		int cols = 0;
		//line 46 "/shared/text/src/thx/text/Table.hx"
		if (( null != title )) 
		{
			//line 47 "/shared/text/src/thx/text/Table.hx"
			table.ensureRow(0).style.set_type(thx.text.table.CellType.Header);
			//line 48 "/shared/text/src/thx/text/Table.hx"
			table.ensureRow(0).style.setAlign(thx.text.table.HAlign.Center);
			//line 49 "/shared/text/src/thx/text/Table.hx"
			table.set(((thx.text.table.CellValueImpl) (thx.text.table.CellValueImpl.StringCell(title)) ), 0, 0, thx.text.table.Span.FillRight);
		}
		
		//line 51 "/shared/text/src/thx/text/Table.hx"
		table.ensureRow(offset).style.set_type(thx.text.table.CellType.Header);
		//line 52 "/shared/text/src/thx/text/Table.hx"
		{
			//line 52 "/shared/text/src/thx/text/Table.hx"
			int _g1 = 0;
			//line 52 "/shared/text/src/thx/text/Table.hx"
			int _g = data.length;
			//line 52 "/shared/text/src/thx/text/Table.hx"
			while (( _g1 < _g ))
			{
				//line 52 "/shared/text/src/thx/text/Table.hx"
				int r = _g1++;
				//line 53 "/shared/text/src/thx/text/Table.hx"
				haxe.root.Array<java.lang.String> fields = haxe.root.Reflect.fields(data.__get(r));
				//line 54 "/shared/text/src/thx/text/Table.hx"
				{
					//line 54 "/shared/text/src/thx/text/Table.hx"
					int _g2 = 0;
					//line 54 "/shared/text/src/thx/text/Table.hx"
					while (( _g2 < fields.length ))
					{
						//line 54 "/shared/text/src/thx/text/Table.hx"
						java.lang.String field = fields.__get(_g2);
						//line 54 "/shared/text/src/thx/text/Table.hx"
						 ++ _g2;
						//line 55 "/shared/text/src/thx/text/Table.hx"
						java.lang.Object col = ((java.lang.Object) (headers.get(field)) );
						//line 56 "/shared/text/src/thx/text/Table.hx"
						if (( null == col )) 
						{
							//line 57 "/shared/text/src/thx/text/Table.hx"
							col = cols++;
							//line 58 "/shared/text/src/thx/text/Table.hx"
							headers.set(field, col);
							//line 59 "/shared/text/src/thx/text/Table.hx"
							table.set(thx.text.table.CellValueImpl.StringCell(thx.Strings.humanize(field)), offset, ((int) (haxe.lang.Runtime.toInt(col)) ), null);
						}
						
						//line 61 "/shared/text/src/thx/text/Table.hx"
						table.set(thx.text.table._CellValue.CellValue_Impl_.fromDynamic(haxe.root.Reflect.field(data.__get(r), field)), ( ( r + offset ) + 1 ), ((int) (haxe.lang.Runtime.toInt(col)) ), null);
					}
					
				}
				
			}
			
		}
		
		//line 64 "/shared/text/src/thx/text/Table.hx"
		return table;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 20 "/shared/text/src/thx/text/Table.hx"
		return new thx.text.Table(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 20 "/shared/text/src/thx/text/Table.hx"
		return new thx.text.Table();
	}
	
	
	
	
	
	
	public thx.text.table.IStyle style;
	
	public haxe.root.Array<thx.text.table.Row> _rows;
	
	public haxe.root.Array<thx.text.table.Col> _cols;
	
	public thx.text.table.Cell set(thx.text.table.CellValueImpl value, int row, int col, thx.text.table.Span span)
	{
		//line 82 "/shared/text/src/thx/text/Table.hx"
		if (( null == span )) 
		{
			//line 83 "/shared/text/src/thx/text/Table.hx"
			span = thx.text.table.Span.NoSpan;
		}
		
		//line 84 "/shared/text/src/thx/text/Table.hx"
		thx.text.table.Row r = this.ensureRow(row);
		//line 84 "/shared/text/src/thx/text/Table.hx"
		thx.text.table.Col c = this.ensureCol(col);
		//line 84 "/shared/text/src/thx/text/Table.hx"
		thx.text.table.Cell cell = new thx.text.table.Cell(value, r, c, span);
		//line 87 "/shared/text/src/thx/text/Table.hx"
		c.setCell(row, cell);
		//line 88 "/shared/text/src/thx/text/Table.hx"
		return cell;
	}
	
	
	public thx.text.table.Cell get(int row, int col)
	{
		//line 92 "/shared/text/src/thx/text/Table.hx"
		thx.text.table.Col col1 = this.getCol(col);
		//line 93 "/shared/text/src/thx/text/Table.hx"
		if (( null == col1 )) 
		{
			//line 93 "/shared/text/src/thx/text/Table.hx"
			return null;
		}
		
		//line 94 "/shared/text/src/thx/text/Table.hx"
		return col1.get(row);
	}
	
	
	public thx.text.table.Col ensureCol(int index)
	{
		//line 98 "/shared/text/src/thx/text/Table.hx"
		{
			//line 98 "/shared/text/src/thx/text/Table.hx"
			int _g1 = this._cols.length;
			//line 98 "/shared/text/src/thx/text/Table.hx"
			int _g = ( index + 1 );
			//line 98 "/shared/text/src/thx/text/Table.hx"
			while (( _g1 < _g ))
			{
				//line 98 "/shared/text/src/thx/text/Table.hx"
				int i = _g1++;
				//line 99 "/shared/text/src/thx/text/Table.hx"
				this._cols.__set(i, new thx.text.table.Col(this, i));
			}
			
		}
		
		//line 100 "/shared/text/src/thx/text/Table.hx"
		return this._cols.__get(index);
	}
	
	
	public thx.text.table.Row ensureRow(int index)
	{
		//line 104 "/shared/text/src/thx/text/Table.hx"
		{
			//line 104 "/shared/text/src/thx/text/Table.hx"
			int _g1 = this._rows.length;
			//line 104 "/shared/text/src/thx/text/Table.hx"
			int _g = ( index + 1 );
			//line 104 "/shared/text/src/thx/text/Table.hx"
			while (( _g1 < _g ))
			{
				//line 104 "/shared/text/src/thx/text/Table.hx"
				int i = _g1++;
				//line 105 "/shared/text/src/thx/text/Table.hx"
				this._rows.__set(i, new thx.text.table.Row(this, i));
			}
			
		}
		
		//line 106 "/shared/text/src/thx/text/Table.hx"
		return this._rows.__get(index);
	}
	
	
	public thx.text.table.Col getCol(int index)
	{
		//line 110 "/shared/text/src/thx/text/Table.hx"
		return this._cols.__get(index);
	}
	
	
	public thx.text.table.Row getRow(int index)
	{
		//line 113 "/shared/text/src/thx/text/Table.hx"
		return this._rows.__get(index);
	}
	
	
	public haxe.root.Array<thx.text.table.Cell> toArray()
	{
		//line 116 "/shared/text/src/thx/text/Table.hx"
		haxe.root.Array<thx.text.table.Cell> collector = new haxe.root.Array<thx.text.table.Cell>(new thx.text.table.Cell[]{});
		//line 117 "/shared/text/src/thx/text/Table.hx"
		{
			//line 117 "/shared/text/src/thx/text/Table.hx"
			int _g = 0;
			//line 117 "/shared/text/src/thx/text/Table.hx"
			haxe.root.Array<thx.text.table.Row> _g1 = this._rows;
			//line 117 "/shared/text/src/thx/text/Table.hx"
			while (( _g < _g1.length ))
			{
				//line 117 "/shared/text/src/thx/text/Table.hx"
				thx.text.table.Row row = _g1.__get(_g);
				//line 117 "/shared/text/src/thx/text/Table.hx"
				 ++ _g;
				//line 118 "/shared/text/src/thx/text/Table.hx"
				{
					//line 118 "/shared/text/src/thx/text/Table.hx"
					java.lang.Object tmp = row.iterator();
					//line 118 "/shared/text/src/thx/text/Table.hx"
					while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(tmp, "hasNext", null)))
					{
						//line 118 "/shared/text/src/thx/text/Table.hx"
						thx.text.table.Cell cell = ((thx.text.table.Cell) (haxe.lang.Runtime.callField(tmp, "next", null)) );
						//line 119 "/shared/text/src/thx/text/Table.hx"
						collector.push(cell);
					}
					
				}
				
			}
			
		}
		
		//line 120 "/shared/text/src/thx/text/Table.hx"
		return collector;
	}
	
	
	@Override public java.lang.String toString()
	{
		//line 124 "/shared/text/src/thx/text/Table.hx"
		thx.text.table.Renderer renderer = new thx.text.table.Renderer(((java.lang.Object) (null) ));
		//line 125 "/shared/text/src/thx/text/Table.hx"
		return renderer.render(this);
	}
	
	
	public int get_rows()
	{
		//line 129 "/shared/text/src/thx/text/Table.hx"
		return this._rows.length;
	}
	
	
	public int get_cols()
	{
		//line 132 "/shared/text/src/thx/text/Table.hx"
		return this._cols.length;
	}
	
	
	public int set_rows(int value)
	{
		//line 135 "/shared/text/src/thx/text/Table.hx"
		this.ensureRow(( value + 1 ));
		//line 136 "/shared/text/src/thx/text/Table.hx"
		return value;
	}
	
	
	public int set_cols(int value)
	{
		//line 140 "/shared/text/src/thx/text/Table.hx"
		this.ensureCol(( value + 1 ));
		//line 141 "/shared/text/src/thx/text/Table.hx"
		return value;
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 20 "/shared/text/src/thx/text/Table.hx"
		{
			//line 20 "/shared/text/src/thx/text/Table.hx"
			boolean __temp_executeDef1 = true;
			//line 20 "/shared/text/src/thx/text/Table.hx"
			switch (field.hashCode())
			{
				case 3059443:
				{
					//line 20 "/shared/text/src/thx/text/Table.hx"
					if (field.equals("cols")) 
					{
						//line 20 "/shared/text/src/thx/text/Table.hx"
						__temp_executeDef1 = false;
						//line 20 "/shared/text/src/thx/text/Table.hx"
						this.set_cols(((int) (value) ));
						//line 20 "/shared/text/src/thx/text/Table.hx"
						return value;
					}
					
					//line 20 "/shared/text/src/thx/text/Table.hx"
					break;
				}
				
				
				case 3506649:
				{
					//line 20 "/shared/text/src/thx/text/Table.hx"
					if (field.equals("rows")) 
					{
						//line 20 "/shared/text/src/thx/text/Table.hx"
						__temp_executeDef1 = false;
						//line 20 "/shared/text/src/thx/text/Table.hx"
						this.set_rows(((int) (value) ));
						//line 20 "/shared/text/src/thx/text/Table.hx"
						return value;
					}
					
					//line 20 "/shared/text/src/thx/text/Table.hx"
					break;
				}
				
				
			}
			
			//line 20 "/shared/text/src/thx/text/Table.hx"
			if (__temp_executeDef1) 
			{
				//line 20 "/shared/text/src/thx/text/Table.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 20 "/shared/text/src/thx/text/Table.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 20 "/shared/text/src/thx/text/Table.hx"
		{
			//line 20 "/shared/text/src/thx/text/Table.hx"
			boolean __temp_executeDef1 = true;
			//line 20 "/shared/text/src/thx/text/Table.hx"
			switch (field.hashCode())
			{
				case 90793938:
				{
					//line 20 "/shared/text/src/thx/text/Table.hx"
					if (field.equals("_cols")) 
					{
						//line 20 "/shared/text/src/thx/text/Table.hx"
						__temp_executeDef1 = false;
						//line 20 "/shared/text/src/thx/text/Table.hx"
						this._cols = ((haxe.root.Array<thx.text.table.Col>) (value) );
						//line 20 "/shared/text/src/thx/text/Table.hx"
						return value;
					}
					
					//line 20 "/shared/text/src/thx/text/Table.hx"
					break;
				}
				
				
				case 3506649:
				{
					//line 20 "/shared/text/src/thx/text/Table.hx"
					if (field.equals("rows")) 
					{
						//line 20 "/shared/text/src/thx/text/Table.hx"
						__temp_executeDef1 = false;
						//line 20 "/shared/text/src/thx/text/Table.hx"
						this.set_rows(((int) (haxe.lang.Runtime.toInt(value)) ));
						//line 20 "/shared/text/src/thx/text/Table.hx"
						return value;
					}
					
					//line 20 "/shared/text/src/thx/text/Table.hx"
					break;
				}
				
				
				case 91241144:
				{
					//line 20 "/shared/text/src/thx/text/Table.hx"
					if (field.equals("_rows")) 
					{
						//line 20 "/shared/text/src/thx/text/Table.hx"
						__temp_executeDef1 = false;
						//line 20 "/shared/text/src/thx/text/Table.hx"
						this._rows = ((haxe.root.Array<thx.text.table.Row>) (value) );
						//line 20 "/shared/text/src/thx/text/Table.hx"
						return value;
					}
					
					//line 20 "/shared/text/src/thx/text/Table.hx"
					break;
				}
				
				
				case 3059443:
				{
					//line 20 "/shared/text/src/thx/text/Table.hx"
					if (field.equals("cols")) 
					{
						//line 20 "/shared/text/src/thx/text/Table.hx"
						__temp_executeDef1 = false;
						//line 20 "/shared/text/src/thx/text/Table.hx"
						this.set_cols(((int) (haxe.lang.Runtime.toInt(value)) ));
						//line 20 "/shared/text/src/thx/text/Table.hx"
						return value;
					}
					
					//line 20 "/shared/text/src/thx/text/Table.hx"
					break;
				}
				
				
				case 109780401:
				{
					//line 20 "/shared/text/src/thx/text/Table.hx"
					if (field.equals("style")) 
					{
						//line 20 "/shared/text/src/thx/text/Table.hx"
						__temp_executeDef1 = false;
						//line 20 "/shared/text/src/thx/text/Table.hx"
						this.style = ((thx.text.table.IStyle) (value) );
						//line 20 "/shared/text/src/thx/text/Table.hx"
						return value;
					}
					
					//line 20 "/shared/text/src/thx/text/Table.hx"
					break;
				}
				
				
			}
			
			//line 20 "/shared/text/src/thx/text/Table.hx"
			if (__temp_executeDef1) 
			{
				//line 20 "/shared/text/src/thx/text/Table.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 20 "/shared/text/src/thx/text/Table.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 20 "/shared/text/src/thx/text/Table.hx"
		{
			//line 20 "/shared/text/src/thx/text/Table.hx"
			boolean __temp_executeDef1 = true;
			//line 20 "/shared/text/src/thx/text/Table.hx"
			switch (field.hashCode())
			{
				case 1415059632:
				{
					//line 20 "/shared/text/src/thx/text/Table.hx"
					if (field.equals("set_cols")) 
					{
						//line 20 "/shared/text/src/thx/text/Table.hx"
						__temp_executeDef1 = false;
						//line 20 "/shared/text/src/thx/text/Table.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_cols")) );
					}
					
					//line 20 "/shared/text/src/thx/text/Table.hx"
					break;
				}
				
				
				case 3506649:
				{
					//line 20 "/shared/text/src/thx/text/Table.hx"
					if (field.equals("rows")) 
					{
						//line 20 "/shared/text/src/thx/text/Table.hx"
						__temp_executeDef1 = false;
						//line 20 "/shared/text/src/thx/text/Table.hx"
						return this.get_rows();
					}
					
					//line 20 "/shared/text/src/thx/text/Table.hx"
					break;
				}
				
				
				case 1415506838:
				{
					//line 20 "/shared/text/src/thx/text/Table.hx"
					if (field.equals("set_rows")) 
					{
						//line 20 "/shared/text/src/thx/text/Table.hx"
						__temp_executeDef1 = false;
						//line 20 "/shared/text/src/thx/text/Table.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_rows")) );
					}
					
					//line 20 "/shared/text/src/thx/text/Table.hx"
					break;
				}
				
				
				case 3059443:
				{
					//line 20 "/shared/text/src/thx/text/Table.hx"
					if (field.equals("cols")) 
					{
						//line 20 "/shared/text/src/thx/text/Table.hx"
						__temp_executeDef1 = false;
						//line 20 "/shared/text/src/thx/text/Table.hx"
						return this.get_cols();
					}
					
					//line 20 "/shared/text/src/thx/text/Table.hx"
					break;
				}
				
				
				case 1976172092:
				{
					//line 20 "/shared/text/src/thx/text/Table.hx"
					if (field.equals("get_cols")) 
					{
						//line 20 "/shared/text/src/thx/text/Table.hx"
						__temp_executeDef1 = false;
						//line 20 "/shared/text/src/thx/text/Table.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_cols")) );
					}
					
					//line 20 "/shared/text/src/thx/text/Table.hx"
					break;
				}
				
				
				case 109780401:
				{
					//line 20 "/shared/text/src/thx/text/Table.hx"
					if (field.equals("style")) 
					{
						//line 20 "/shared/text/src/thx/text/Table.hx"
						__temp_executeDef1 = false;
						//line 20 "/shared/text/src/thx/text/Table.hx"
						return this.style;
					}
					
					//line 20 "/shared/text/src/thx/text/Table.hx"
					break;
				}
				
				
				case 1976619298:
				{
					//line 20 "/shared/text/src/thx/text/Table.hx"
					if (field.equals("get_rows")) 
					{
						//line 20 "/shared/text/src/thx/text/Table.hx"
						__temp_executeDef1 = false;
						//line 20 "/shared/text/src/thx/text/Table.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_rows")) );
					}
					
					//line 20 "/shared/text/src/thx/text/Table.hx"
					break;
				}
				
				
				case 91241144:
				{
					//line 20 "/shared/text/src/thx/text/Table.hx"
					if (field.equals("_rows")) 
					{
						//line 20 "/shared/text/src/thx/text/Table.hx"
						__temp_executeDef1 = false;
						//line 20 "/shared/text/src/thx/text/Table.hx"
						return this._rows;
					}
					
					//line 20 "/shared/text/src/thx/text/Table.hx"
					break;
				}
				
				
				case -1776922004:
				{
					//line 20 "/shared/text/src/thx/text/Table.hx"
					if (field.equals("toString")) 
					{
						//line 20 "/shared/text/src/thx/text/Table.hx"
						__temp_executeDef1 = false;
						//line 20 "/shared/text/src/thx/text/Table.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toString")) );
					}
					
					//line 20 "/shared/text/src/thx/text/Table.hx"
					break;
				}
				
				
				case 90793938:
				{
					//line 20 "/shared/text/src/thx/text/Table.hx"
					if (field.equals("_cols")) 
					{
						//line 20 "/shared/text/src/thx/text/Table.hx"
						__temp_executeDef1 = false;
						//line 20 "/shared/text/src/thx/text/Table.hx"
						return this._cols;
					}
					
					//line 20 "/shared/text/src/thx/text/Table.hx"
					break;
				}
				
				
				case -1182381922:
				{
					//line 20 "/shared/text/src/thx/text/Table.hx"
					if (field.equals("toArray")) 
					{
						//line 20 "/shared/text/src/thx/text/Table.hx"
						__temp_executeDef1 = false;
						//line 20 "/shared/text/src/thx/text/Table.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toArray")) );
					}
					
					//line 20 "/shared/text/src/thx/text/Table.hx"
					break;
				}
				
				
				case 113762:
				{
					//line 20 "/shared/text/src/thx/text/Table.hx"
					if (field.equals("set")) 
					{
						//line 20 "/shared/text/src/thx/text/Table.hx"
						__temp_executeDef1 = false;
						//line 20 "/shared/text/src/thx/text/Table.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set")) );
					}
					
					//line 20 "/shared/text/src/thx/text/Table.hx"
					break;
				}
				
				
				case -1249351004:
				{
					//line 20 "/shared/text/src/thx/text/Table.hx"
					if (field.equals("getRow")) 
					{
						//line 20 "/shared/text/src/thx/text/Table.hx"
						__temp_executeDef1 = false;
						//line 20 "/shared/text/src/thx/text/Table.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getRow")) );
					}
					
					//line 20 "/shared/text/src/thx/text/Table.hx"
					break;
				}
				
				
				case 102230:
				{
					//line 20 "/shared/text/src/thx/text/Table.hx"
					if (field.equals("get")) 
					{
						//line 20 "/shared/text/src/thx/text/Table.hx"
						__temp_executeDef1 = false;
						//line 20 "/shared/text/src/thx/text/Table.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get")) );
					}
					
					//line 20 "/shared/text/src/thx/text/Table.hx"
					break;
				}
				
				
				case -1249365430:
				{
					//line 20 "/shared/text/src/thx/text/Table.hx"
					if (field.equals("getCol")) 
					{
						//line 20 "/shared/text/src/thx/text/Table.hx"
						__temp_executeDef1 = false;
						//line 20 "/shared/text/src/thx/text/Table.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getCol")) );
					}
					
					//line 20 "/shared/text/src/thx/text/Table.hx"
					break;
				}
				
				
				case -1286988702:
				{
					//line 20 "/shared/text/src/thx/text/Table.hx"
					if (field.equals("ensureCol")) 
					{
						//line 20 "/shared/text/src/thx/text/Table.hx"
						__temp_executeDef1 = false;
						//line 20 "/shared/text/src/thx/text/Table.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "ensureCol")) );
					}
					
					//line 20 "/shared/text/src/thx/text/Table.hx"
					break;
				}
				
				
				case -1286974276:
				{
					//line 20 "/shared/text/src/thx/text/Table.hx"
					if (field.equals("ensureRow")) 
					{
						//line 20 "/shared/text/src/thx/text/Table.hx"
						__temp_executeDef1 = false;
						//line 20 "/shared/text/src/thx/text/Table.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "ensureRow")) );
					}
					
					//line 20 "/shared/text/src/thx/text/Table.hx"
					break;
				}
				
				
			}
			
			//line 20 "/shared/text/src/thx/text/Table.hx"
			if (__temp_executeDef1) 
			{
				//line 20 "/shared/text/src/thx/text/Table.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 20 "/shared/text/src/thx/text/Table.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 20 "/shared/text/src/thx/text/Table.hx"
		{
			//line 20 "/shared/text/src/thx/text/Table.hx"
			boolean __temp_executeDef1 = true;
			//line 20 "/shared/text/src/thx/text/Table.hx"
			switch (field.hashCode())
			{
				case 3059443:
				{
					//line 20 "/shared/text/src/thx/text/Table.hx"
					if (field.equals("cols")) 
					{
						//line 20 "/shared/text/src/thx/text/Table.hx"
						__temp_executeDef1 = false;
						//line 20 "/shared/text/src/thx/text/Table.hx"
						return ((double) (this.get_cols()) );
					}
					
					//line 20 "/shared/text/src/thx/text/Table.hx"
					break;
				}
				
				
				case 3506649:
				{
					//line 20 "/shared/text/src/thx/text/Table.hx"
					if (field.equals("rows")) 
					{
						//line 20 "/shared/text/src/thx/text/Table.hx"
						__temp_executeDef1 = false;
						//line 20 "/shared/text/src/thx/text/Table.hx"
						return ((double) (this.get_rows()) );
					}
					
					//line 20 "/shared/text/src/thx/text/Table.hx"
					break;
				}
				
				
			}
			
			//line 20 "/shared/text/src/thx/text/Table.hx"
			if (__temp_executeDef1) 
			{
				//line 20 "/shared/text/src/thx/text/Table.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 20 "/shared/text/src/thx/text/Table.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 20 "/shared/text/src/thx/text/Table.hx"
		{
			//line 20 "/shared/text/src/thx/text/Table.hx"
			boolean __temp_executeDef1 = true;
			//line 20 "/shared/text/src/thx/text/Table.hx"
			switch (field.hashCode())
			{
				case 1415059632:
				{
					//line 20 "/shared/text/src/thx/text/Table.hx"
					if (field.equals("set_cols")) 
					{
						//line 20 "/shared/text/src/thx/text/Table.hx"
						__temp_executeDef1 = false;
						//line 20 "/shared/text/src/thx/text/Table.hx"
						return this.set_cols(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ));
					}
					
					//line 20 "/shared/text/src/thx/text/Table.hx"
					break;
				}
				
				
				case 113762:
				{
					//line 20 "/shared/text/src/thx/text/Table.hx"
					if (field.equals("set")) 
					{
						//line 20 "/shared/text/src/thx/text/Table.hx"
						__temp_executeDef1 = false;
						//line 20 "/shared/text/src/thx/text/Table.hx"
						return this.set(((thx.text.table.CellValueImpl) (dynargs.__get(0)) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(1))) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(2))) ), ((thx.text.table.Span) (dynargs.__get(3)) ));
					}
					
					//line 20 "/shared/text/src/thx/text/Table.hx"
					break;
				}
				
				
				case 1415506838:
				{
					//line 20 "/shared/text/src/thx/text/Table.hx"
					if (field.equals("set_rows")) 
					{
						//line 20 "/shared/text/src/thx/text/Table.hx"
						__temp_executeDef1 = false;
						//line 20 "/shared/text/src/thx/text/Table.hx"
						return this.set_rows(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ));
					}
					
					//line 20 "/shared/text/src/thx/text/Table.hx"
					break;
				}
				
				
				case 102230:
				{
					//line 20 "/shared/text/src/thx/text/Table.hx"
					if (field.equals("get")) 
					{
						//line 20 "/shared/text/src/thx/text/Table.hx"
						__temp_executeDef1 = false;
						//line 20 "/shared/text/src/thx/text/Table.hx"
						return this.get(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(1))) ));
					}
					
					//line 20 "/shared/text/src/thx/text/Table.hx"
					break;
				}
				
				
				case 1976172092:
				{
					//line 20 "/shared/text/src/thx/text/Table.hx"
					if (field.equals("get_cols")) 
					{
						//line 20 "/shared/text/src/thx/text/Table.hx"
						__temp_executeDef1 = false;
						//line 20 "/shared/text/src/thx/text/Table.hx"
						return this.get_cols();
					}
					
					//line 20 "/shared/text/src/thx/text/Table.hx"
					break;
				}
				
				
				case -1286988702:
				{
					//line 20 "/shared/text/src/thx/text/Table.hx"
					if (field.equals("ensureCol")) 
					{
						//line 20 "/shared/text/src/thx/text/Table.hx"
						__temp_executeDef1 = false;
						//line 20 "/shared/text/src/thx/text/Table.hx"
						return this.ensureCol(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ));
					}
					
					//line 20 "/shared/text/src/thx/text/Table.hx"
					break;
				}
				
				
				case 1976619298:
				{
					//line 20 "/shared/text/src/thx/text/Table.hx"
					if (field.equals("get_rows")) 
					{
						//line 20 "/shared/text/src/thx/text/Table.hx"
						__temp_executeDef1 = false;
						//line 20 "/shared/text/src/thx/text/Table.hx"
						return this.get_rows();
					}
					
					//line 20 "/shared/text/src/thx/text/Table.hx"
					break;
				}
				
				
				case -1286974276:
				{
					//line 20 "/shared/text/src/thx/text/Table.hx"
					if (field.equals("ensureRow")) 
					{
						//line 20 "/shared/text/src/thx/text/Table.hx"
						__temp_executeDef1 = false;
						//line 20 "/shared/text/src/thx/text/Table.hx"
						return this.ensureRow(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ));
					}
					
					//line 20 "/shared/text/src/thx/text/Table.hx"
					break;
				}
				
				
				case -1776922004:
				{
					//line 20 "/shared/text/src/thx/text/Table.hx"
					if (field.equals("toString")) 
					{
						//line 20 "/shared/text/src/thx/text/Table.hx"
						__temp_executeDef1 = false;
						//line 20 "/shared/text/src/thx/text/Table.hx"
						return this.toString();
					}
					
					//line 20 "/shared/text/src/thx/text/Table.hx"
					break;
				}
				
				
				case -1249365430:
				{
					//line 20 "/shared/text/src/thx/text/Table.hx"
					if (field.equals("getCol")) 
					{
						//line 20 "/shared/text/src/thx/text/Table.hx"
						__temp_executeDef1 = false;
						//line 20 "/shared/text/src/thx/text/Table.hx"
						return this.getCol(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ));
					}
					
					//line 20 "/shared/text/src/thx/text/Table.hx"
					break;
				}
				
				
				case -1182381922:
				{
					//line 20 "/shared/text/src/thx/text/Table.hx"
					if (field.equals("toArray")) 
					{
						//line 20 "/shared/text/src/thx/text/Table.hx"
						__temp_executeDef1 = false;
						//line 20 "/shared/text/src/thx/text/Table.hx"
						return this.toArray();
					}
					
					//line 20 "/shared/text/src/thx/text/Table.hx"
					break;
				}
				
				
				case -1249351004:
				{
					//line 20 "/shared/text/src/thx/text/Table.hx"
					if (field.equals("getRow")) 
					{
						//line 20 "/shared/text/src/thx/text/Table.hx"
						__temp_executeDef1 = false;
						//line 20 "/shared/text/src/thx/text/Table.hx"
						return this.getRow(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ));
					}
					
					//line 20 "/shared/text/src/thx/text/Table.hx"
					break;
				}
				
				
			}
			
			//line 20 "/shared/text/src/thx/text/Table.hx"
			if (__temp_executeDef1) 
			{
				//line 20 "/shared/text/src/thx/text/Table.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 20 "/shared/text/src/thx/text/Table.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 20 "/shared/text/src/thx/text/Table.hx"
		baseArr.push("_cols");
		//line 20 "/shared/text/src/thx/text/Table.hx"
		baseArr.push("_rows");
		//line 20 "/shared/text/src/thx/text/Table.hx"
		baseArr.push("style");
		//line 20 "/shared/text/src/thx/text/Table.hx"
		baseArr.push("cols");
		//line 20 "/shared/text/src/thx/text/Table.hx"
		baseArr.push("rows");
		//line 20 "/shared/text/src/thx/text/Table.hx"
		{
			//line 20 "/shared/text/src/thx/text/Table.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}

