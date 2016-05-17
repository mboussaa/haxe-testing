// Generated by Haxe 3.3.0
package hxmath.frames;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Frame3Default extends haxe.lang.HxObject implements hxmath.frames.IFrame3
{
	public Frame3Default(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Frame3Default(hxmath.math.Vector3Default offset, hxmath.math.QuaternionDefault orientation, java.lang.Object isCached)
	{
		//line 45 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
		hxmath.frames.Frame3Default.__hx_ctor_hxmath_frames_Frame3Default(this, offset, orientation, isCached);
	}
	
	
	public static void __hx_ctor_hxmath_frames_Frame3Default(hxmath.frames.Frame3Default __temp_me16, hxmath.math.Vector3Default offset, hxmath.math.QuaternionDefault orientation, java.lang.Object isCached)
	{
		//line 36 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
		__temp_me16.isDirty = true;
		//line 33 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
		__temp_me16.isCached = true;
		//line 46 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
		boolean __temp_isCached15 = ( (haxe.lang.Runtime.eq(isCached, null)) ? (true) : (haxe.lang.Runtime.toBool(isCached)) );
		//line 47 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
		hxmath.math.Vector3Default tmp = null;
		//line 47 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
		if (( offset == null )) 
		{
			//line 48 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
			hxmath.math.Vector3Default this1 = new hxmath.math.Vector3Default(0.0, 0.0, 0.0);
			//line 48 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
			tmp = ((hxmath.math.Vector3Default) (this1) );
		}
		else
		{
			//line 49 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
			tmp = offset;
		}
		
		//line 47 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
		__temp_me16.internalOffset = tmp;
		//line 50 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
		hxmath.math.QuaternionDefault tmp1 = null;
		//line 50 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
		if (( orientation == null )) 
		{
			//line 51 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
			hxmath.math.QuaternionDefault this2 = new hxmath.math.QuaternionDefault(((double) (1) ), ((double) (0) ), ((double) (0) ), ((double) (0) ));
			//line 51 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
			tmp1 = ((hxmath.math.QuaternionDefault) (this2) );
		}
		else
		{
			//line 52 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
			tmp1 = orientation;
		}
		
		//line 50 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
		__temp_me16.internalOrientation = tmp1;
		//line 53 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
		__temp_me16.isCached = __temp_isCached15;
		//line 54 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
		__temp_me16.isDirty = true;
		//line 55 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
		hxmath.math.Matrix4x4Default this3 = new hxmath.math.Matrix4x4Default(1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0);
		//line 55 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
		__temp_me16.internalMatrix = ((hxmath.math.Matrix4x4Default) (this3) );
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
		return new hxmath.frames.Frame3Default(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
		return new hxmath.frames.Frame3Default(((hxmath.math.Vector3Default) (arr.__get(0)) ), ((hxmath.math.QuaternionDefault) (arr.__get(1)) ), arr.__get(2));
	}
	
	
	
	
	
	
	
	
	public hxmath.math.Matrix4x4Default internalMatrix;
	
	public hxmath.math.Vector3Default internalOffset;
	
	public hxmath.math.QuaternionDefault internalOrientation;
	
	public boolean isCached;
	
	public boolean isDirty;
	
	@Override public java.lang.String toString()
	{
		//line 60 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
		return ( ( ( ( "Frame3 { offset: " + haxe.root.Std.string(this.internalOffset) ) + ", orientation: " ) + haxe.root.Std.string(this.internalOrientation) ) + " }" );
	}
	
	
	public final hxmath.math.Matrix4x4Default get_matrix()
	{
		//line 66 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
		if ((  ! (this.isCached)  || this.isDirty )) 
		{
			//line 68 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
			{
				//line 68 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
				hxmath.math.Matrix4x4Default matrix = this.internalMatrix;
				//line 68 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
				hxmath.math.Vector3Default offset = this.internalOffset;
				//line 68 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
				hxmath.math.QuaternionDefault orientation = this.internalOrientation;
				//line 68 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
				{
					//line 68 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					double s = orientation.s;
					//line 68 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					double x = orientation.x;
					//line 68 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					double y = orientation.y;
					//line 68 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					double z = orientation.z;
					//line 68 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					matrix.m00 = ( 1 - ( 2 * (( ( y * y ) + ( z * z ) )) ) );
					//line 68 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					matrix.m10 = ( 2 * (( ( x * y ) - ( s * z ) )) );
					//line 68 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					matrix.m20 = ( 2 * (( ( s * y ) + ( x * z ) )) );
					//line 68 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					matrix.m01 = ( 2 * (( ( x * y ) + ( s * z ) )) );
					//line 68 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					matrix.m11 = ( 1 - ( 2 * (( ( x * x ) + ( z * z ) )) ) );
					//line 68 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					matrix.m21 = ( 2 * (( ( y * z ) - ( s * x ) )) );
					//line 68 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					matrix.m02 = ( 2 * (( ( x * z ) - ( s * y ) )) );
					//line 68 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					matrix.m12 = ( 2 * (( ( y * z ) + ( s * x ) )) );
					//line 68 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					matrix.m22 = ( 1 - ( 2 * (( ( x * x ) + ( y * y ) )) ) );
				}
				
				//line 68 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
				{
					//line 68 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					double x1 = offset.x;
					//line 68 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					double y1 = offset.y;
					//line 68 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					double z1 = offset.z;
					//line 68 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					matrix.m30 = x1;
					//line 68 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					matrix.m31 = y1;
					//line 68 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					matrix.m32 = z1;
					//line 68 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					matrix.m33 = 1.0;
				}
				
			}
			
			//line 69 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
			this.isDirty = false;
		}
		
		//line 72 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
		return this.internalMatrix;
	}
	
	
	public final hxmath.math.Vector3Default get_offset()
	{
		//line 77 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
		return this.internalOffset;
	}
	
	
	public final hxmath.math.Vector3Default set_offset(hxmath.math.Vector3Default offset)
	{
		//line 82 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
		this.internalOffset = offset;
		//line 83 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
		this.isDirty = true;
		//line 84 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
		return offset;
	}
	
	
	public final hxmath.math.QuaternionDefault get_orientation()
	{
		//line 89 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
		return this.internalOrientation;
	}
	
	
	public final hxmath.math.QuaternionDefault set_orientation(hxmath.math.QuaternionDefault orientation)
	{
		//line 94 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
		this.internalOrientation = orientation;
		//line 95 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
		this.isDirty = true;
		//line 96 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
		return orientation;
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
		{
			//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
			boolean __temp_executeDef1 = true;
			//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
			switch (field.hashCode())
			{
				case 2056999112:
				{
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					if (field.equals("isDirty")) 
					{
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						__temp_executeDef1 = false;
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						this.isDirty = haxe.lang.Runtime.toBool(value);
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						return value;
					}
					
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					break;
				}
				
				
				case -1019779949:
				{
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					if (field.equals("offset")) 
					{
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						__temp_executeDef1 = false;
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						this.set_offset(((hxmath.math.Vector3Default) (value) ));
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						return value;
					}
					
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					break;
				}
				
				
				case -694013204:
				{
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					if (field.equals("isCached")) 
					{
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						__temp_executeDef1 = false;
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						this.isCached = haxe.lang.Runtime.toBool(value);
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						return value;
					}
					
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					break;
				}
				
				
				case -1439500848:
				{
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					if (field.equals("orientation")) 
					{
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						__temp_executeDef1 = false;
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						this.set_orientation(((hxmath.math.QuaternionDefault) (value) ));
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						return value;
					}
					
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					break;
				}
				
				
				case 441200339:
				{
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					if (field.equals("internalOrientation")) 
					{
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						__temp_executeDef1 = false;
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						this.internalOrientation = ((hxmath.math.QuaternionDefault) (value) );
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						return value;
					}
					
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					break;
				}
				
				
				case 260016350:
				{
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					if (field.equals("internalMatrix")) 
					{
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						__temp_executeDef1 = false;
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						this.internalMatrix = ((hxmath.math.Matrix4x4Default) (value) );
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						return value;
					}
					
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					break;
				}
				
				
				case 321476016:
				{
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					if (field.equals("internalOffset")) 
					{
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						__temp_executeDef1 = false;
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						this.internalOffset = ((hxmath.math.Vector3Default) (value) );
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						return value;
					}
					
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					break;
				}
				
				
			}
			
			//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
			if (__temp_executeDef1) 
			{
				//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
		{
			//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
			boolean __temp_executeDef1 = true;
			//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
			switch (field.hashCode())
			{
				case 311397747:
				{
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					if (field.equals("set_orientation")) 
					{
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						__temp_executeDef1 = false;
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_orientation")) );
					}
					
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					break;
				}
				
				
				case -1081239615:
				{
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					if (field.equals("matrix")) 
					{
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						__temp_executeDef1 = false;
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						return this.get_matrix();
					}
					
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					break;
				}
				
				
				case -599354777:
				{
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					if (field.equals("get_orientation")) 
					{
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						__temp_executeDef1 = false;
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_orientation")) );
					}
					
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					break;
				}
				
				
				case -1019779949:
				{
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					if (field.equals("offset")) 
					{
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						__temp_executeDef1 = false;
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						return this.get_offset();
					}
					
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					break;
				}
				
				
				case -1297263856:
				{
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					if (field.equals("set_offset")) 
					{
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						__temp_executeDef1 = false;
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_offset")) );
					}
					
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					break;
				}
				
				
				case -1439500848:
				{
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					if (field.equals("orientation")) 
					{
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						__temp_executeDef1 = false;
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						return this.get_orientation();
					}
					
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					break;
				}
				
				
				case 1060898204:
				{
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					if (field.equals("get_offset")) 
					{
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						__temp_executeDef1 = false;
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_offset")) );
					}
					
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					break;
				}
				
				
				case 260016350:
				{
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					if (field.equals("internalMatrix")) 
					{
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						__temp_executeDef1 = false;
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						return this.internalMatrix;
					}
					
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					break;
				}
				
				
				case 999438538:
				{
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					if (field.equals("get_matrix")) 
					{
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						__temp_executeDef1 = false;
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_matrix")) );
					}
					
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					break;
				}
				
				
				case 321476016:
				{
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					if (field.equals("internalOffset")) 
					{
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						__temp_executeDef1 = false;
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						return this.internalOffset;
					}
					
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					break;
				}
				
				
				case -1776922004:
				{
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					if (field.equals("toString")) 
					{
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						__temp_executeDef1 = false;
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toString")) );
					}
					
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					break;
				}
				
				
				case 441200339:
				{
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					if (field.equals("internalOrientation")) 
					{
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						__temp_executeDef1 = false;
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						return this.internalOrientation;
					}
					
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					break;
				}
				
				
				case 2056999112:
				{
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					if (field.equals("isDirty")) 
					{
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						__temp_executeDef1 = false;
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						return this.isDirty;
					}
					
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					break;
				}
				
				
				case -694013204:
				{
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					if (field.equals("isCached")) 
					{
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						__temp_executeDef1 = false;
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						return this.isCached;
					}
					
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					break;
				}
				
				
			}
			
			//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
			if (__temp_executeDef1) 
			{
				//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
		{
			//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
			boolean __temp_executeDef1 = true;
			//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
			switch (field.hashCode())
			{
				case 311397747:
				{
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					if (field.equals("set_orientation")) 
					{
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						__temp_executeDef1 = false;
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						return this.set_orientation(((hxmath.math.QuaternionDefault) (dynargs.__get(0)) ));
					}
					
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					break;
				}
				
				
				case -1776922004:
				{
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					if (field.equals("toString")) 
					{
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						__temp_executeDef1 = false;
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						return this.toString();
					}
					
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					break;
				}
				
				
				case -599354777:
				{
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					if (field.equals("get_orientation")) 
					{
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						__temp_executeDef1 = false;
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						return this.get_orientation();
					}
					
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					break;
				}
				
				
				case 999438538:
				{
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					if (field.equals("get_matrix")) 
					{
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						__temp_executeDef1 = false;
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						return this.get_matrix();
					}
					
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					break;
				}
				
				
				case -1297263856:
				{
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					if (field.equals("set_offset")) 
					{
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						__temp_executeDef1 = false;
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						return this.set_offset(((hxmath.math.Vector3Default) (dynargs.__get(0)) ));
					}
					
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					break;
				}
				
				
				case 1060898204:
				{
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					if (field.equals("get_offset")) 
					{
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						__temp_executeDef1 = false;
						//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
						return this.get_offset();
					}
					
					//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
					break;
				}
				
				
			}
			
			//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
			if (__temp_executeDef1) 
			{
				//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
		baseArr.push("isDirty");
		//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
		baseArr.push("isCached");
		//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
		baseArr.push("internalOrientation");
		//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
		baseArr.push("internalOffset");
		//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
		baseArr.push("internalMatrix");
		//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
		baseArr.push("orientation");
		//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
		baseArr.push("offset");
		//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
		baseArr.push("matrix");
		//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
		{
			//line 12 "/shared/hxmath/hxmath/frames/Frame3Default.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


