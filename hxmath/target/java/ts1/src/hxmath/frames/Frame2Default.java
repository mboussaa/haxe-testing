// Generated by Haxe 3.3.0
package hxmath.frames;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Frame2Default extends haxe.lang.HxObject implements hxmath.frames.IFrame2
{
	public Frame2Default(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Frame2Default(hxmath.math.Vector2Default offset, java.lang.Object angleDegrees, java.lang.Object isCached)
	{
		//line 44 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
		hxmath.frames.Frame2Default.__hx_ctor_hxmath_frames_Frame2Default(this, offset, angleDegrees, isCached);
	}
	
	
	public static void __hx_ctor_hxmath_frames_Frame2Default(hxmath.frames.Frame2Default __temp_me18, hxmath.math.Vector2Default offset, java.lang.Object angleDegrees, java.lang.Object isCached)
	{
		//line 35 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
		__temp_me18.isDirty = true;
		//line 32 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
		__temp_me18.isCached = true;
		//line 45 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
		boolean __temp_isCached17 = ( (haxe.lang.Runtime.eq(isCached, null)) ? (true) : (haxe.lang.Runtime.toBool(isCached)) );
		//line 45 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
		double __temp_angleDegrees16 = ( (haxe.lang.Runtime.eq(angleDegrees, null)) ? (0.0) : (((double) (haxe.lang.Runtime.toDouble(angleDegrees)) )) );
		//line 46 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
		hxmath.math.Vector2Default tmp = null;
		//line 46 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
		if (( offset == null )) 
		{
			//line 47 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
			hxmath.math.Vector2Default this1 = new hxmath.math.Vector2Default(0.0, 0.0);
			//line 47 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
			tmp = ((hxmath.math.Vector2Default) (this1) );
		}
		else
		{
			//line 48 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
			tmp = offset;
		}
		
		//line 46 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
		__temp_me18.internalOffset = tmp;
		//line 49 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
		__temp_me18.internalAngleDegrees = __temp_angleDegrees16;
		//line 50 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
		__temp_me18.isCached = __temp_isCached17;
		//line 51 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
		__temp_me18.isDirty = true;
		//line 52 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
		hxmath.math.Matrix3x2Default this2 = new hxmath.math.Matrix3x2Default(1.0, 0.0, 0.0, 1.0, 0.0, 0.0);
		//line 52 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
		__temp_me18.internalMatrix = ((hxmath.math.Matrix3x2Default) (this2) );
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
		return new hxmath.frames.Frame2Default(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
		return new hxmath.frames.Frame2Default(((hxmath.math.Vector2Default) (arr.__get(0)) ), arr.__get(1), arr.__get(2));
	}
	
	
	
	
	
	
	
	
	public hxmath.math.Matrix3x2Default internalMatrix;
	
	public hxmath.math.Vector2Default internalOffset;
	
	public double internalAngleDegrees;
	
	public boolean isCached;
	
	public boolean isDirty;
	
	@Override public java.lang.String toString()
	{
		//line 57 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
		return ( ( ( ( "Frame2 { offset: " + haxe.root.Std.string(this.internalOffset) ) + ", angleDegrees: " ) + haxe.lang.Runtime.toString(this.internalAngleDegrees) ) + " }" );
	}
	
	
	public final hxmath.math.Matrix3x2Default get_matrix()
	{
		//line 63 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
		if ((  ! (this.isCached)  || this.isDirty )) 
		{
			//line 65 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
			{
				//line 65 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
				hxmath.math.Matrix3x2Default matrix = this.internalMatrix;
				//line 65 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
				hxmath.math.Vector2Default offset = this.internalOffset;
				//line 65 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
				{
					//line 65 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					double angle = ( ( java.lang.Math.PI / 180 ) * this.internalAngleDegrees );
					//line 65 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					double s = java.lang.Math.sin(angle);
					//line 65 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					double c = java.lang.Math.cos(angle);
					//line 65 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					matrix.a = c;
					//line 65 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					matrix.b =  - (s) ;
					//line 65 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					matrix.c = s;
					//line 65 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					matrix.d = c;
				}
				
				//line 65 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
				{
					//line 65 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					double x = offset.x;
					//line 65 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					double y = offset.y;
					//line 65 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					matrix.tx = x;
					//line 65 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					matrix.ty = y;
				}
				
			}
			
			//line 66 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
			this.isDirty = false;
		}
		
		//line 69 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
		return this.internalMatrix;
	}
	
	
	public final hxmath.math.Vector2Default get_offset()
	{
		//line 74 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
		return this.internalOffset;
	}
	
	
	public final hxmath.math.Vector2Default set_offset(hxmath.math.Vector2Default offset)
	{
		//line 79 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
		this.internalOffset = offset;
		//line 80 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
		this.isDirty = true;
		//line 81 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
		return offset;
	}
	
	
	public final double get_angleDegrees()
	{
		//line 86 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
		return this.internalAngleDegrees;
	}
	
	
	public final double set_angleDegrees(double angleDegrees)
	{
		//line 91 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
		this.internalAngleDegrees = angleDegrees;
		//line 92 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
		this.isDirty = true;
		//line 93 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
		return angleDegrees;
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
		{
			//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
			switch (field.hashCode())
			{
				case 155610673:
				{
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					if (field.equals("internalAngleDegrees")) 
					{
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						this.internalAngleDegrees = ((double) (value) );
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						return value;
					}
					
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					break;
				}
				
				
				case 1983416020:
				{
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					if (field.equals("angleDegrees")) 
					{
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						this.set_angleDegrees(value);
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						return value;
					}
					
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					break;
				}
				
				
			}
			
			//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
		{
			//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
			switch (field.hashCode())
			{
				case 2056999112:
				{
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					if (field.equals("isDirty")) 
					{
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						this.isDirty = haxe.lang.Runtime.toBool(value);
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						return value;
					}
					
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					break;
				}
				
				
				case -1019779949:
				{
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					if (field.equals("offset")) 
					{
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						this.set_offset(((hxmath.math.Vector2Default) (value) ));
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						return value;
					}
					
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					break;
				}
				
				
				case -694013204:
				{
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					if (field.equals("isCached")) 
					{
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						this.isCached = haxe.lang.Runtime.toBool(value);
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						return value;
					}
					
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					break;
				}
				
				
				case 1983416020:
				{
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					if (field.equals("angleDegrees")) 
					{
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						this.set_angleDegrees(((double) (haxe.lang.Runtime.toDouble(value)) ));
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						return value;
					}
					
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					break;
				}
				
				
				case 155610673:
				{
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					if (field.equals("internalAngleDegrees")) 
					{
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						this.internalAngleDegrees = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						return value;
					}
					
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					break;
				}
				
				
				case 260016350:
				{
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					if (field.equals("internalMatrix")) 
					{
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						this.internalMatrix = ((hxmath.math.Matrix3x2Default) (value) );
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						return value;
					}
					
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					break;
				}
				
				
				case 321476016:
				{
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					if (field.equals("internalOffset")) 
					{
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						this.internalOffset = ((hxmath.math.Vector2Default) (value) );
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						return value;
					}
					
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					break;
				}
				
				
			}
			
			//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
		{
			//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
			switch (field.hashCode())
			{
				case 426697617:
				{
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					if (field.equals("set_angleDegrees")) 
					{
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_angleDegrees")) );
					}
					
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					break;
				}
				
				
				case -1081239615:
				{
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					if (field.equals("matrix")) 
					{
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						return this.get_matrix();
					}
					
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					break;
				}
				
				
				case -2036826851:
				{
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					if (field.equals("get_angleDegrees")) 
					{
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_angleDegrees")) );
					}
					
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					break;
				}
				
				
				case -1019779949:
				{
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					if (field.equals("offset")) 
					{
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						return this.get_offset();
					}
					
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					break;
				}
				
				
				case -1297263856:
				{
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					if (field.equals("set_offset")) 
					{
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_offset")) );
					}
					
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					break;
				}
				
				
				case 1983416020:
				{
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					if (field.equals("angleDegrees")) 
					{
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						return this.get_angleDegrees();
					}
					
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					break;
				}
				
				
				case 1060898204:
				{
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					if (field.equals("get_offset")) 
					{
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_offset")) );
					}
					
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					break;
				}
				
				
				case 260016350:
				{
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					if (field.equals("internalMatrix")) 
					{
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						return this.internalMatrix;
					}
					
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					break;
				}
				
				
				case 999438538:
				{
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					if (field.equals("get_matrix")) 
					{
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_matrix")) );
					}
					
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					break;
				}
				
				
				case 321476016:
				{
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					if (field.equals("internalOffset")) 
					{
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						return this.internalOffset;
					}
					
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					break;
				}
				
				
				case -1776922004:
				{
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					if (field.equals("toString")) 
					{
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toString")) );
					}
					
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					break;
				}
				
				
				case 155610673:
				{
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					if (field.equals("internalAngleDegrees")) 
					{
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						return this.internalAngleDegrees;
					}
					
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					break;
				}
				
				
				case 2056999112:
				{
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					if (field.equals("isDirty")) 
					{
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						return this.isDirty;
					}
					
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					break;
				}
				
				
				case -694013204:
				{
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					if (field.equals("isCached")) 
					{
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						return this.isCached;
					}
					
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					break;
				}
				
				
			}
			
			//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
		{
			//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
			switch (field.hashCode())
			{
				case 155610673:
				{
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					if (field.equals("internalAngleDegrees")) 
					{
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						return this.internalAngleDegrees;
					}
					
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					break;
				}
				
				
				case 1983416020:
				{
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					if (field.equals("angleDegrees")) 
					{
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						return this.get_angleDegrees();
					}
					
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					break;
				}
				
				
			}
			
			//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
		{
			//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
			switch (field.hashCode())
			{
				case 426697617:
				{
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					if (field.equals("set_angleDegrees")) 
					{
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						return this.set_angleDegrees(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ));
					}
					
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					break;
				}
				
				
				case -1776922004:
				{
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					if (field.equals("toString")) 
					{
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						return this.toString();
					}
					
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					break;
				}
				
				
				case -2036826851:
				{
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					if (field.equals("get_angleDegrees")) 
					{
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						return this.get_angleDegrees();
					}
					
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					break;
				}
				
				
				case 999438538:
				{
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					if (field.equals("get_matrix")) 
					{
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						return this.get_matrix();
					}
					
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					break;
				}
				
				
				case -1297263856:
				{
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					if (field.equals("set_offset")) 
					{
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						return this.set_offset(((hxmath.math.Vector2Default) (dynargs.__get(0)) ));
					}
					
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					break;
				}
				
				
				case 1060898204:
				{
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					if (field.equals("get_offset")) 
					{
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						__temp_executeDef1 = false;
						//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
						return this.get_offset();
					}
					
					//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
					break;
				}
				
				
			}
			
			//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
		baseArr.push("isDirty");
		//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
		baseArr.push("isCached");
		//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
		baseArr.push("internalAngleDegrees");
		//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
		baseArr.push("internalOffset");
		//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
		baseArr.push("internalMatrix");
		//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
		baseArr.push("angleDegrees");
		//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
		baseArr.push("offset");
		//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
		baseArr.push("matrix");
		//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
		{
			//line 11 "/shared/hxmath/hxmath/frames/Frame2Default.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


