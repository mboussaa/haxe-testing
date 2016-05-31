// Generated by Haxe 3.3.0
package thx.color.parse;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ColorInfo extends haxe.lang.HxObject
{
	public ColorInfo(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public ColorInfo(java.lang.String name, haxe.root.Array<thx.color.parse.ChannelInfo> channels)
	{
		//line 136 "/shared/color/src/thx/color/parse/ColorParser.hx"
		thx.color.parse.ColorInfo.__hx_ctor_thx_color_parse_ColorInfo(this, name, channels);
	}
	
	
	public static void __hx_ctor_thx_color_parse_ColorInfo(thx.color.parse.ColorInfo __temp_me141, java.lang.String name, haxe.root.Array<thx.color.parse.ChannelInfo> channels)
	{
		//line 137 "/shared/color/src/thx/color/parse/ColorParser.hx"
		__temp_me141.name = name;
		//line 138 "/shared/color/src/thx/color/parse/ColorParser.hx"
		__temp_me141.channels = channels;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
		return new thx.color.parse.ColorInfo(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
		return new thx.color.parse.ColorInfo(haxe.lang.Runtime.toString(arr.__get(0)), ((haxe.root.Array<thx.color.parse.ChannelInfo>) (arr.__get(1)) ));
	}
	
	
	public java.lang.String name;
	
	public haxe.root.Array<thx.color.parse.ChannelInfo> channels;
	
	@Override public java.lang.String toString()
	{
		//line 142 "/shared/color/src/thx/color/parse/ColorParser.hx"
		return ( ( ( "" + this.name ) + ", channels: " ) + haxe.root.Std.string(this.channels) );
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
		{
			//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
			boolean __temp_executeDef1 = true;
			//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
			switch (field.hashCode())
			{
				case 1432626128:
				{
					//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
					if (field.equals("channels")) 
					{
						//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
						__temp_executeDef1 = false;
						//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
						this.channels = ((haxe.root.Array<thx.color.parse.ChannelInfo>) (value) );
						//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
						return value;
					}
					
					//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
					break;
				}
				
				
				case 3373707:
				{
					//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
					if (field.equals("name")) 
					{
						//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
						__temp_executeDef1 = false;
						//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
						this.name = haxe.lang.Runtime.toString(value);
						//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
						return value;
					}
					
					//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
					break;
				}
				
				
			}
			
			//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
			if (__temp_executeDef1) 
			{
				//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
		{
			//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
			boolean __temp_executeDef1 = true;
			//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
			switch (field.hashCode())
			{
				case -1776922004:
				{
					//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
					if (field.equals("toString")) 
					{
						//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
						__temp_executeDef1 = false;
						//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toString")) );
					}
					
					//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
					break;
				}
				
				
				case 3373707:
				{
					//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
					if (field.equals("name")) 
					{
						//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
						__temp_executeDef1 = false;
						//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
						return this.name;
					}
					
					//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
					break;
				}
				
				
				case 1432626128:
				{
					//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
					if (field.equals("channels")) 
					{
						//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
						__temp_executeDef1 = false;
						//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
						return this.channels;
					}
					
					//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
					break;
				}
				
				
			}
			
			//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
			if (__temp_executeDef1) 
			{
				//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
		{
			//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
			boolean __temp_executeDef1 = true;
			//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
			switch (field.hashCode())
			{
				case -1776922004:
				{
					//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
					if (field.equals("toString")) 
					{
						//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
						__temp_executeDef1 = false;
						//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
						return this.toString();
					}
					
					//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
					break;
				}
				
				
			}
			
			//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
			if (__temp_executeDef1) 
			{
				//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
		baseArr.push("channels");
		//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
		baseArr.push("name");
		//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
		{
			//line 132 "/shared/color/src/thx/color/parse/ColorParser.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


