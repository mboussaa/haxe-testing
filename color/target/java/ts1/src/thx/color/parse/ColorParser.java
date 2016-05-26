// Generated by Haxe 3.3.0
package thx.color.parse;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ColorParser extends haxe.lang.HxObject
{
	static
	{
		//line 7 "/shared/color/src/thx/color/parse/ColorParser.hx"
		thx.color.parse.ColorParser.parser = new thx.color.parse.ColorParser();
		//line 24 "/shared/color/src/thx/color/parse/ColorParser.hx"
		thx.color.parse.ColorParser.isPureHex = new haxe.root.EReg("^([0-9a-f]{2}){3,4}$", "i");
	}
	
	public ColorParser(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public ColorParser()
	{
		//line 19 "/shared/color/src/thx/color/parse/ColorParser.hx"
		thx.color.parse.ColorParser.__hx_ctor_thx_color_parse_ColorParser(this);
	}
	
	
	public static void __hx_ctor_thx_color_parse_ColorParser(thx.color.parse.ColorParser __temp_me146)
	{
		//line 20 "/shared/color/src/thx/color/parse/ColorParser.hx"
		__temp_me146.pattern_color = new haxe.root.EReg("^\\s*([^(]+)\\s*\\(([^)]*)\\)\\s*$", "i");
		//line 21 "/shared/color/src/thx/color/parse/ColorParser.hx"
		__temp_me146.pattern_channel = new haxe.root.EReg("^\\s*(-?\\d*.\\d+|-?\\d+)(%|deg|rad)?\\s*$", "i");
	}
	
	
	public static thx.color.parse.ColorParser parser;
	
	public static thx.color.parse.ColorInfo parseColor(java.lang.String s)
	{
		//line 9 "/shared/color/src/thx/color/parse/ColorParser.hx"
		return thx.color.parse.ColorParser.parser.processColor(s);
	}
	
	
	public static thx.color.parse.ColorInfo parseHex(java.lang.String s)
	{
		//line 12 "/shared/color/src/thx/color/parse/ColorParser.hx"
		return thx.color.parse.ColorParser.parser.processHex(s);
	}
	
	
	public static thx.color.parse.ChannelInfo parseChannel(java.lang.String s)
	{
		//line 15 "/shared/color/src/thx/color/parse/ColorParser.hx"
		return thx.color.parse.ColorParser.parser.processChannel(s);
	}
	
	
	public static haxe.root.EReg isPureHex;
	
	public static haxe.root.Array<java.lang.Object> getFloatChannels(haxe.root.Array<thx.color.parse.ChannelInfo> channels, int length, boolean useInt8)
	{
		//line 100 "/shared/color/src/thx/color/parse/ColorParser.hx"
		if (( length != channels.length )) 
		{
			//line 101 "/shared/color/src/thx/color/parse/ColorParser.hx"
			throw haxe.lang.HaxeException.wrap(( ( ( "invalid number of channels, expected " + length ) + " but it is " ) + channels.length ));
		}
		
		//line 102 "/shared/color/src/thx/color/parse/ColorParser.hx"
		boolean a2 = useInt8;
		//line 102 "/shared/color/src/thx/color/parse/ColorParser.hx"
		return ((haxe.root.Array<java.lang.Object>) (((haxe.root.Array) (channels.map(((haxe.lang.Function) (new thx.color.parse.ColorParser_getFloatChannels_102__Fun(a2)) ))) )) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> getInt8Channels(haxe.root.Array<thx.color.parse.ChannelInfo> channels, int length)
	{
		//line 106 "/shared/color/src/thx/color/parse/ColorParser.hx"
		if (( length != channels.length )) 
		{
			//line 107 "/shared/color/src/thx/color/parse/ColorParser.hx"
			throw haxe.lang.HaxeException.wrap(( ( ( "invalid number of channels, expected " + length ) + " but it is " ) + channels.length ));
		}
		
		//line 108 "/shared/color/src/thx/color/parse/ColorParser.hx"
		return ((haxe.root.Array<java.lang.Object>) (((haxe.root.Array) (channels.map(((haxe.lang.Function) (new haxe.lang.Closure(thx.color.parse.ColorParser.class, "getInt8Channel")) ))) )) );
	}
	
	
	public static double getFloatChannel(thx.color.parse.ChannelInfo channel, java.lang.Object useInt8)
	{
		//line 112 "/shared/color/src/thx/color/parse/ColorParser.hx"
		boolean __temp_useInt8145 = ( (haxe.lang.Runtime.eq(useInt8, null)) ? (true) : (haxe.lang.Runtime.toBool(useInt8)) );
		//line 112 "/shared/color/src/thx/color/parse/ColorParser.hx"
		switch (channel.index)
		{
			case 0:
			{
				//line 119 "/shared/color/src/thx/color/parse/ColorParser.hx"
				double v = ((double) (haxe.lang.Runtime.toDouble(channel.params[0])) );
				//line 112 "/shared/color/src/thx/color/parse/ColorParser.hx"
				return ( v / 100 );
			}
			
			
			case 1:
			{
				//line 114 "/shared/color/src/thx/color/parse/ColorParser.hx"
				double v1 = ((double) (haxe.lang.Runtime.toDouble(channel.params[0])) );
				//line 112 "/shared/color/src/thx/color/parse/ColorParser.hx"
				return v1;
			}
			
			
			case 2:
			{
				//line 116 "/shared/color/src/thx/color/parse/ColorParser.hx"
				double v2 = ((double) (haxe.lang.Runtime.toDouble(channel.params[0])) );
				//line 112 "/shared/color/src/thx/color/parse/ColorParser.hx"
				return v2;
			}
			
			
			case 3:
			{
				//line 117 "/shared/color/src/thx/color/parse/ColorParser.hx"
				int v3 = ((int) (haxe.lang.Runtime.toInt(channel.params[0])) );
				//line 117 "/shared/color/src/thx/color/parse/ColorParser.hx"
				if (__temp_useInt8145) 
				{
					//line 112 "/shared/color/src/thx/color/parse/ColorParser.hx"
					return ( ((double) (v3) ) / 255 );
				}
				else
				{
					//line 118 "/shared/color/src/thx/color/parse/ColorParser.hx"
					int v4 = ((int) (haxe.lang.Runtime.toInt(channel.params[0])) );
					//line 112 "/shared/color/src/thx/color/parse/ColorParser.hx"
					return ((double) (v4) );
				}
				
			}
			
			
			case 4:
			{
				//line 115 "/shared/color/src/thx/color/parse/ColorParser.hx"
				int v5 = ((int) (haxe.lang.Runtime.toInt(channel.params[0])) );
				//line 112 "/shared/color/src/thx/color/parse/ColorParser.hx"
				return ((double) (v5) );
			}
			
			
			case 5:
			{
				//line 113 "/shared/color/src/thx/color/parse/ColorParser.hx"
				boolean v6 = haxe.lang.Runtime.toBool(channel.params[0]);
				//line 113 "/shared/color/src/thx/color/parse/ColorParser.hx"
				if (v6) 
				{
					//line 112 "/shared/color/src/thx/color/parse/ColorParser.hx"
					return ((double) (1) );
				}
				else
				{
					//line 112 "/shared/color/src/thx/color/parse/ColorParser.hx"
					return ((double) (0) );
				}
				
			}
			
			
		}
		
		//line 111 "/shared/color/src/thx/color/parse/ColorParser.hx"
		return 0.0;
	}
	
	
	public static int getInt8Channel(thx.color.parse.ChannelInfo channel)
	{
		//line 124 "/shared/color/src/thx/color/parse/ColorParser.hx"
		switch (channel.index)
		{
			case 0:
			{
				//line 127 "/shared/color/src/thx/color/parse/ColorParser.hx"
				double v = ((double) (haxe.lang.Runtime.toDouble(channel.params[0])) );
				//line 124 "/shared/color/src/thx/color/parse/ColorParser.hx"
				return ((int) (java.lang.Math.round(( ( 255 * v ) / 100 ))) );
			}
			
			
			case 3:
			{
				//line 126 "/shared/color/src/thx/color/parse/ColorParser.hx"
				int v1 = ((int) (haxe.lang.Runtime.toInt(channel.params[0])) );
				//line 124 "/shared/color/src/thx/color/parse/ColorParser.hx"
				return v1;
			}
			
			
			case 5:
			{
				//line 125 "/shared/color/src/thx/color/parse/ColorParser.hx"
				boolean v2 = haxe.lang.Runtime.toBool(channel.params[0]);
				//line 125 "/shared/color/src/thx/color/parse/ColorParser.hx"
				if (v2) 
				{
					//line 124 "/shared/color/src/thx/color/parse/ColorParser.hx"
					return 1;
				}
				else
				{
					//line 124 "/shared/color/src/thx/color/parse/ColorParser.hx"
					return 0;
				}
				
			}
			
			
			default:
			{
				//line 128 "/shared/color/src/thx/color/parse/ColorParser.hx"
				throw haxe.lang.HaxeException.wrap("unable to extract a valid int8 value");
			}
			
		}
		
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
		return new thx.color.parse.ColorParser(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
		return new thx.color.parse.ColorParser();
	}
	
	
	public haxe.root.EReg pattern_color;
	
	public haxe.root.EReg pattern_channel;
	
	public thx.color.parse.ColorInfo processHex(java.lang.String s)
	{
		//line 26 "/shared/color/src/thx/color/parse/ColorParser.hx"
		if ( ! (thx.color.parse.ColorParser.isPureHex.match(s)) ) 
		{
			//line 27 "/shared/color/src/thx/color/parse/ColorParser.hx"
			if (haxe.lang.Runtime.valEq(haxe.lang.StringExt.substr(s, 0, 1), "#")) 
			{
				//line 28 "/shared/color/src/thx/color/parse/ColorParser.hx"
				if (( s.length() == 4 )) 
				{
					//line 29 "/shared/color/src/thx/color/parse/ColorParser.hx"
					s = ( ( ( ( ( haxe.lang.StringExt.charAt(s, 1) + haxe.lang.StringExt.charAt(s, 1) ) + haxe.lang.StringExt.charAt(s, 2) ) + haxe.lang.StringExt.charAt(s, 2) ) + haxe.lang.StringExt.charAt(s, 3) ) + haxe.lang.StringExt.charAt(s, 3) );
				}
				else
				{
					//line 30 "/shared/color/src/thx/color/parse/ColorParser.hx"
					if (( s.length() == 5 )) 
					{
						//line 31 "/shared/color/src/thx/color/parse/ColorParser.hx"
						s = ( ( ( ( ( ( ( haxe.lang.StringExt.charAt(s, 1) + haxe.lang.StringExt.charAt(s, 1) ) + haxe.lang.StringExt.charAt(s, 2) ) + haxe.lang.StringExt.charAt(s, 2) ) + haxe.lang.StringExt.charAt(s, 3) ) + haxe.lang.StringExt.charAt(s, 3) ) + haxe.lang.StringExt.charAt(s, 4) ) + haxe.lang.StringExt.charAt(s, 4) );
					}
					else
					{
						//line 33 "/shared/color/src/thx/color/parse/ColorParser.hx"
						s = haxe.lang.StringExt.substr(s, 1, null);
					}
					
				}
				
			}
			else
			{
				//line 34 "/shared/color/src/thx/color/parse/ColorParser.hx"
				if (haxe.lang.Runtime.valEq(haxe.lang.StringExt.substr(s, 0, 2), "0x")) 
				{
					//line 35 "/shared/color/src/thx/color/parse/ColorParser.hx"
					s = haxe.lang.StringExt.substr(s, 2, null);
				}
				else
				{
					//line 37 "/shared/color/src/thx/color/parse/ColorParser.hx"
					return null;
				}
				
			}
			
		}
		
		//line 40 "/shared/color/src/thx/color/parse/ColorParser.hx"
		haxe.root.Array<thx.color.parse.ChannelInfo> channels = new haxe.root.Array<thx.color.parse.ChannelInfo>(new thx.color.parse.ChannelInfo[]{});
		//line 41 "/shared/color/src/thx/color/parse/ColorParser.hx"
		while (( s.length() > 0 ))
		{
			//line 42 "/shared/color/src/thx/color/parse/ColorParser.hx"
			channels.push(thx.color.parse.ChannelInfo.CIInt8(((int) (haxe.lang.Runtime.toInt(haxe.root.Std.parseInt(( "0x" + haxe.lang.StringExt.substr(s, 0, 2) )))) )));
			//line 43 "/shared/color/src/thx/color/parse/ColorParser.hx"
			s = haxe.lang.StringExt.substr(s, 2, null);
		}
		
		//line 45 "/shared/color/src/thx/color/parse/ColorParser.hx"
		if (( channels.length == 4 )) 
		{
			//line 46 "/shared/color/src/thx/color/parse/ColorParser.hx"
			return new thx.color.parse.ColorInfo("rgba", channels.slice(1, null).concat(new haxe.root.Array<thx.color.parse.ChannelInfo>(new thx.color.parse.ChannelInfo[]{channels.__get(0)})));
		}
		else
		{
			//line 48 "/shared/color/src/thx/color/parse/ColorParser.hx"
			return new thx.color.parse.ColorInfo("rgb", channels);
		}
		
	}
	
	
	public thx.color.parse.ColorInfo processColor(java.lang.String s)
	{
		//line 52 "/shared/color/src/thx/color/parse/ColorParser.hx"
		if ( ! (this.pattern_color.match(s)) ) 
		{
			//line 53 "/shared/color/src/thx/color/parse/ColorParser.hx"
			return null;
		}
		
		//line 55 "/shared/color/src/thx/color/parse/ColorParser.hx"
		java.lang.String name = this.pattern_color.matched(1);
		//line 56 "/shared/color/src/thx/color/parse/ColorParser.hx"
		if (( null == name )) 
		{
			//line 56 "/shared/color/src/thx/color/parse/ColorParser.hx"
			return null;
		}
		
		//line 58 "/shared/color/src/thx/color/parse/ColorParser.hx"
		name = name.toLowerCase();
		//line 60 "/shared/color/src/thx/color/parse/ColorParser.hx"
		java.lang.String m2 = this.pattern_color.matched(2);
		//line 60 "/shared/color/src/thx/color/parse/ColorParser.hx"
		haxe.root.Array<java.lang.String> s_channels = ( (( null == m2 )) ? (new haxe.root.Array<java.lang.String>(new java.lang.String[]{})) : (haxe.lang.StringExt.split(m2, ",")) );
		//line 60 "/shared/color/src/thx/color/parse/ColorParser.hx"
		haxe.root.Array<thx.color.parse.ChannelInfo> channels = new haxe.root.Array<thx.color.parse.ChannelInfo>(new thx.color.parse.ChannelInfo[]{});
		//line 60 "/shared/color/src/thx/color/parse/ColorParser.hx"
		thx.color.parse.ChannelInfo channel = null;
		//line 64 "/shared/color/src/thx/color/parse/ColorParser.hx"
		{
			//line 64 "/shared/color/src/thx/color/parse/ColorParser.hx"
			int _g = 0;
			//line 64 "/shared/color/src/thx/color/parse/ColorParser.hx"
			while (( _g < s_channels.length ))
			{
				//line 64 "/shared/color/src/thx/color/parse/ColorParser.hx"
				java.lang.String s_channel = s_channels.__get(_g);
				//line 64 "/shared/color/src/thx/color/parse/ColorParser.hx"
				 ++ _g;
				//line 65 "/shared/color/src/thx/color/parse/ColorParser.hx"
				channel = this.processChannel(s_channel);
				//line 66 "/shared/color/src/thx/color/parse/ColorParser.hx"
				if (( null == channel )) 
				{
					//line 66 "/shared/color/src/thx/color/parse/ColorParser.hx"
					return null;
				}
				
				//line 67 "/shared/color/src/thx/color/parse/ColorParser.hx"
				channels.push(channel);
			}
			
		}
		
		//line 69 "/shared/color/src/thx/color/parse/ColorParser.hx"
		return new thx.color.parse.ColorInfo(name, channels);
	}
	
	
	public thx.color.parse.ChannelInfo processChannel(java.lang.String s)
	{
		//line 73 "/shared/color/src/thx/color/parse/ColorParser.hx"
		if ( ! (this.pattern_channel.match(s)) ) 
		{
			//line 73 "/shared/color/src/thx/color/parse/ColorParser.hx"
			return null;
		}
		
		//line 74 "/shared/color/src/thx/color/parse/ColorParser.hx"
		java.lang.String value = this.pattern_channel.matched(1);
		//line 74 "/shared/color/src/thx/color/parse/ColorParser.hx"
		java.lang.String unit = this.pattern_channel.matched(2);
		//line 76 "/shared/color/src/thx/color/parse/ColorParser.hx"
		if (( unit == null )) 
		{
			//line 76 "/shared/color/src/thx/color/parse/ColorParser.hx"
			unit = "";
		}
		
		//line 77 "/shared/color/src/thx/color/parse/ColorParser.hx"
		try 
		{
			//line 77 "/shared/color/src/thx/color/parse/ColorParser.hx"
			{
				//line 77 "/shared/color/src/thx/color/parse/ColorParser.hx"
				java.lang.String __temp_svar3 = (unit);
				//line 77 "/shared/color/src/thx/color/parse/ColorParser.hx"
				int __temp_hash5 = __temp_svar3.hashCode();
				//line 77 "/shared/color/src/thx/color/parse/ColorParser.hx"
				boolean __temp_executeDef4 = true;
				//line 77 "/shared/color/src/thx/color/parse/ColorParser.hx"
				switch (__temp_hash5)
				{
					case 0:
					{
						//line 77 "/shared/color/src/thx/color/parse/ColorParser.hx"
						if (__temp_svar3.equals("")) 
						{
							//line 77 "/shared/color/src/thx/color/parse/ColorParser.hx"
							__temp_executeDef4 = false;
							//line 84 "/shared/color/src/thx/color/parse/ColorParser.hx"
							if (haxe.lang.Runtime.valEq(value, ( haxe.lang.Runtime.toString("") + haxe.lang.Runtime.toString(thx.Ints.parse(value, null)) ))) 
							{
								//line 85 "/shared/color/src/thx/color/parse/ColorParser.hx"
								java.lang.Object i = thx.Ints.parse(value, null);
								//line 86 "/shared/color/src/thx/color/parse/ColorParser.hx"
								if (haxe.lang.Runtime.eq(i, 0)) 
								{
									//line 77 "/shared/color/src/thx/color/parse/ColorParser.hx"
									return thx.color.parse.ChannelInfo.CIBool(false);
								}
								else
								{
									//line 88 "/shared/color/src/thx/color/parse/ColorParser.hx"
									if (haxe.lang.Runtime.eq(i, 1)) 
									{
										//line 77 "/shared/color/src/thx/color/parse/ColorParser.hx"
										return thx.color.parse.ChannelInfo.CIBool(true);
									}
									else
									{
										//line 90 "/shared/color/src/thx/color/parse/ColorParser.hx"
										if (( haxe.lang.Runtime.compare(i, 256) < 0 )) 
										{
											//line 77 "/shared/color/src/thx/color/parse/ColorParser.hx"
											return thx.color.parse.ChannelInfo.CIInt8(((int) (haxe.lang.Runtime.toInt(i)) ));
										}
										else
										{
											//line 77 "/shared/color/src/thx/color/parse/ColorParser.hx"
											return thx.color.parse.ChannelInfo.CIInt(((int) (haxe.lang.Runtime.toInt(i)) ));
										}
										
									}
									
								}
								
							}
							else
							{
								//line 93 "/shared/color/src/thx/color/parse/ColorParser.hx"
								if (thx.Floats.canParse(value)) 
								{
									//line 77 "/shared/color/src/thx/color/parse/ColorParser.hx"
									return thx.color.parse.ChannelInfo.CIFloat(thx.Floats.parse(value));
								}
								else
								{
									//line 77 "/shared/color/src/thx/color/parse/ColorParser.hx"
									return null;
								}
								
							}
							
						}
						
						//line 77 "/shared/color/src/thx/color/parse/ColorParser.hx"
						break;
					}
					
					
					case 112661:
					case 80885:
					{
						//line 77 "/shared/color/src/thx/color/parse/ColorParser.hx"
						if (( (( ( __temp_hash5 == 112661 ) && __temp_svar3.equals("rad") )) || __temp_svar3.equals("RAD") )) 
						{
							//line 77 "/shared/color/src/thx/color/parse/ColorParser.hx"
							__temp_executeDef4 = false;
							//line 82 "/shared/color/src/thx/color/parse/ColorParser.hx"
							if (thx.Floats.canParse(value)) 
							{
								//line 77 "/shared/color/src/thx/color/parse/ColorParser.hx"
								return thx.color.parse.ChannelInfo.CIDegree(( ( thx.Floats.parse(value) * 180 ) / java.lang.Math.PI ));
							}
							else
							{
								//line 77 "/shared/color/src/thx/color/parse/ColorParser.hx"
								return null;
							}
							
						}
						
						//line 77 "/shared/color/src/thx/color/parse/ColorParser.hx"
						break;
					}
					
					
					case 37:
					{
						//line 77 "/shared/color/src/thx/color/parse/ColorParser.hx"
						if (__temp_svar3.equals("%")) 
						{
							//line 77 "/shared/color/src/thx/color/parse/ColorParser.hx"
							__temp_executeDef4 = false;
							//line 78 "/shared/color/src/thx/color/parse/ColorParser.hx"
							if (thx.Floats.canParse(value)) 
							{
								//line 77 "/shared/color/src/thx/color/parse/ColorParser.hx"
								return thx.color.parse.ChannelInfo.CIPercent(thx.Floats.parse(value));
							}
							else
							{
								//line 77 "/shared/color/src/thx/color/parse/ColorParser.hx"
								return null;
							}
							
						}
						
						//line 77 "/shared/color/src/thx/color/parse/ColorParser.hx"
						break;
					}
					
					
					case 99334:
					case 67558:
					{
						//line 77 "/shared/color/src/thx/color/parse/ColorParser.hx"
						if (( (( ( __temp_hash5 == 99334 ) && __temp_svar3.equals("deg") )) || __temp_svar3.equals("DEG") )) 
						{
							//line 77 "/shared/color/src/thx/color/parse/ColorParser.hx"
							__temp_executeDef4 = false;
							//line 80 "/shared/color/src/thx/color/parse/ColorParser.hx"
							if (thx.Floats.canParse(value)) 
							{
								//line 77 "/shared/color/src/thx/color/parse/ColorParser.hx"
								return thx.color.parse.ChannelInfo.CIDegree(thx.Floats.parse(value));
							}
							else
							{
								//line 77 "/shared/color/src/thx/color/parse/ColorParser.hx"
								return null;
							}
							
						}
						
						//line 77 "/shared/color/src/thx/color/parse/ColorParser.hx"
						break;
					}
					
					
				}
				
				//line 77 "/shared/color/src/thx/color/parse/ColorParser.hx"
				if (__temp_executeDef4) 
				{
					//line 77 "/shared/color/src/thx/color/parse/ColorParser.hx"
					return null;
				}
				else
				{
					//line 77 "/shared/color/src/thx/color/parse/ColorParser.hx"
					throw null;
				}
				
			}
			
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 77 "/shared/color/src/thx/color/parse/ColorParser.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 96 "/shared/color/src/thx/color/parse/ColorParser.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 96 "/shared/color/src/thx/color/parse/ColorParser.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 96 "/shared/color/src/thx/color/parse/ColorParser.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 96 "/shared/color/src/thx/color/parse/ColorParser.hx"
			{
				//line 96 "/shared/color/src/thx/color/parse/ColorParser.hx"
				java.lang.Object e = __temp_catchall2;
				//line 96 "/shared/color/src/thx/color/parse/ColorParser.hx"
				return null;
			}
			
		}
		
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
		{
			//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
			switch (field.hashCode())
			{
				case 1775730516:
				{
					//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
					if (field.equals("pattern_channel")) 
					{
						//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
						__temp_executeDef1 = false;
						//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
						this.pattern_channel = ((haxe.root.EReg) (value) );
						//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
						return value;
					}
					
					//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
					break;
				}
				
				
				case -1870556684:
				{
					//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
					if (field.equals("pattern_color")) 
					{
						//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
						__temp_executeDef1 = false;
						//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
						this.pattern_color = ((haxe.root.EReg) (value) );
						//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
						return value;
					}
					
					//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
					break;
				}
				
				
			}
			
			//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
		{
			//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
			switch (field.hashCode())
			{
				case 654027668:
				{
					//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
					if (field.equals("processChannel")) 
					{
						//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
						__temp_executeDef1 = false;
						//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "processChannel")) );
					}
					
					//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
					break;
				}
				
				
				case -1870556684:
				{
					//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
					if (field.equals("pattern_color")) 
					{
						//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
						__temp_executeDef1 = false;
						//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
						return this.pattern_color;
					}
					
					//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
					break;
				}
				
				
				case 1967377972:
				{
					//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
					if (field.equals("processColor")) 
					{
						//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
						__temp_executeDef1 = false;
						//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "processColor")) );
					}
					
					//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
					break;
				}
				
				
				case 1775730516:
				{
					//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
					if (field.equals("pattern_channel")) 
					{
						//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
						__temp_executeDef1 = false;
						//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
						return this.pattern_channel;
					}
					
					//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
					break;
				}
				
				
				case 422162988:
				{
					//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
					if (field.equals("processHex")) 
					{
						//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
						__temp_executeDef1 = false;
						//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "processHex")) );
					}
					
					//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
					break;
				}
				
				
			}
			
			//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
		{
			//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
			switch (field.hashCode())
			{
				case 654027668:
				{
					//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
					if (field.equals("processChannel")) 
					{
						//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
						__temp_executeDef1 = false;
						//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
						return this.processChannel(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
					break;
				}
				
				
				case 422162988:
				{
					//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
					if (field.equals("processHex")) 
					{
						//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
						__temp_executeDef1 = false;
						//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
						return this.processHex(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
					break;
				}
				
				
				case 1967377972:
				{
					//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
					if (field.equals("processColor")) 
					{
						//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
						__temp_executeDef1 = false;
						//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
						return this.processColor(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
					break;
				}
				
				
			}
			
			//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
		baseArr.push("pattern_channel");
		//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
		baseArr.push("pattern_color");
		//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
		{
			//line 6 "/shared/color/src/thx/color/parse/ColorParser.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


