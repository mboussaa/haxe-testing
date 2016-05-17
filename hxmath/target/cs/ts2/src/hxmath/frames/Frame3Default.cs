// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace hxmath.frames {
	public class Frame3Default : global::haxe.lang.HxObject, global::hxmath.frames.IFrame3 {
		
		public Frame3Default(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public Frame3Default(global::hxmath.math.Vector3Default offset, global::hxmath.math.QuaternionDefault orientation, global::haxe.lang.Null<bool> isCached) {
			global::hxmath.frames.Frame3Default.__hx_ctor_hxmath_frames_Frame3Default(this, offset, orientation, isCached);
		}
		
		
		public static void __hx_ctor_hxmath_frames_Frame3Default(global::hxmath.frames.Frame3Default __temp_me24, global::hxmath.math.Vector3Default offset, global::hxmath.math.QuaternionDefault orientation, global::haxe.lang.Null<bool> isCached) {
			unchecked {
				__temp_me24.isDirty = true;
				__temp_me24.isCached = true;
				bool __temp_isCached23 = ( ( ! (isCached.hasValue) ) ? (true) : ((isCached).@value) );
				__temp_me24.internalOffset = ( (( offset == null )) ? (((global::hxmath.math.Vector3Default) (new global::hxmath.math.Vector3Default(0.0, 0.0, 0.0)) )) : (offset) );
				__temp_me24.internalOrientation = ( (( orientation == null )) ? (((global::hxmath.math.QuaternionDefault) (new global::hxmath.math.QuaternionDefault(((double) (1) ), ((double) (0) ), ((double) (0) ), ((double) (0) ))) )) : (orientation) );
				__temp_me24.isCached = __temp_isCached23;
				__temp_me24.isDirty = true;
				__temp_me24.internalMatrix = ((global::hxmath.math.Matrix4x4Default) (new global::hxmath.math.Matrix4x4Default(1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0)) );
			}
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::hxmath.frames.Frame3Default(global::haxe.lang.EmptyObject.EMPTY);
		}
		
		
		public static new object __hx_create(global::Array arr) {
			unchecked {
				return new global::hxmath.frames.Frame3Default(((global::hxmath.math.Vector3Default) (arr[0]) ), ((global::hxmath.math.QuaternionDefault) (arr[1]) ), global::haxe.lang.Null<object>.ofDynamic<bool>(arr[2]));
			}
		}
		
		
		
		
		
		
		
		
		public global::hxmath.math.Matrix4x4Default internalMatrix;
		
		public global::hxmath.math.Vector3Default internalOffset;
		
		public global::hxmath.math.QuaternionDefault internalOrientation;
		
		public bool isCached;
		
		public bool isDirty;
		
		public virtual string toString() {
			return global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("Frame3 { offset: ", global::Std.@string(this.internalOffset)), ", orientation: "), global::Std.@string(this.internalOrientation)), " }");
		}
		
		
		public global::hxmath.math.Matrix4x4Default get_matrix() {
			unchecked {
				if ((  ! (this.isCached)  || this.isDirty )) {
					{
						global::hxmath.math.Matrix4x4Default matrix = this.internalMatrix;
						global::hxmath.math.Vector3Default offset = this.internalOffset;
						global::hxmath.math.QuaternionDefault orientation = this.internalOrientation;
						{
							double s = orientation.s;
							double x = orientation.x;
							double y = orientation.y;
							double z = orientation.z;
							matrix.m00 = ( 1 - ( 2 * (( ( y * y ) + ( z * z ) )) ) );
							matrix.m10 = ( 2 * (( ( x * y ) - ( s * z ) )) );
							matrix.m20 = ( 2 * (( ( s * y ) + ( x * z ) )) );
							matrix.m01 = ( 2 * (( ( x * y ) + ( s * z ) )) );
							matrix.m11 = ( 1 - ( 2 * (( ( x * x ) + ( z * z ) )) ) );
							matrix.m21 = ( 2 * (( ( y * z ) - ( s * x ) )) );
							matrix.m02 = ( 2 * (( ( x * z ) - ( s * y ) )) );
							matrix.m12 = ( 2 * (( ( y * z ) + ( s * x ) )) );
							matrix.m22 = ( 1 - ( 2 * (( ( x * x ) + ( y * y ) )) ) );
						}
						
						{
							double x1 = offset.x;
							double y1 = offset.y;
							double z1 = offset.z;
							matrix.m30 = x1;
							matrix.m31 = y1;
							matrix.m32 = z1;
							matrix.m33 = 1.0;
						}
						
					}
					
					this.isDirty = false;
				}
				
				return this.internalMatrix;
			}
		}
		
		
		public global::hxmath.math.Vector3Default get_offset() {
			return this.internalOffset;
		}
		
		
		public global::hxmath.math.Vector3Default set_offset(global::hxmath.math.Vector3Default offset) {
			this.internalOffset = offset;
			this.isDirty = true;
			return offset;
		}
		
		
		public global::hxmath.math.QuaternionDefault get_orientation() {
			return this.internalOrientation;
		}
		
		
		public global::hxmath.math.QuaternionDefault set_orientation(global::hxmath.math.QuaternionDefault orientation) {
			this.internalOrientation = orientation;
			this.isDirty = true;
			return orientation;
		}
		
		
		public override object __hx_setField(string field, int hash, object @value, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 1985344456:
					{
						this.isDirty = global::haxe.lang.Runtime.toBool(@value);
						return @value;
					}
					
					
					case 157023084:
					{
						this.isCached = global::haxe.lang.Runtime.toBool(@value);
						return @value;
					}
					
					
					case 1899208339:
					{
						this.internalOrientation = ((global::hxmath.math.QuaternionDefault) (@value) );
						return @value;
					}
					
					
					case 86965936:
					{
						this.internalOffset = ((global::hxmath.math.Vector3Default) (@value) );
						return @value;
					}
					
					
					case 1622646110:
					{
						this.internalMatrix = ((global::hxmath.math.Matrix4x4Default) (@value) );
						return @value;
					}
					
					
					case 2113859280:
					{
						this.set_orientation(((global::hxmath.math.QuaternionDefault) (@value) ));
						return @value;
					}
					
					
					case 1614780307:
					{
						this.set_offset(((global::hxmath.math.Vector3Default) (@value) ));
						return @value;
					}
					
					
					default:
					{
						return base.__hx_setField(field, hash, @value, handleProperties);
					}
					
				}
				
			}
		}
		
		
		public override object __hx_getField(string field, int hash, bool throwErrors, bool isCheck, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 984359795:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "set_orientation", 984359795)) );
					}
					
					
					case 1054910055:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "get_orientation", 1054910055)) );
					}
					
					
					case 1413785040:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "set_offset", 1413785040)) );
					}
					
					
					case 1355220828:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "get_offset", 1355220828)) );
					}
					
					
					case 743417354:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "get_matrix", 743417354)) );
					}
					
					
					case 946786476:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "toString", 946786476)) );
					}
					
					
					case 1985344456:
					{
						return this.isDirty;
					}
					
					
					case 157023084:
					{
						return this.isCached;
					}
					
					
					case 1899208339:
					{
						return this.internalOrientation;
					}
					
					
					case 86965936:
					{
						return this.internalOffset;
					}
					
					
					case 1622646110:
					{
						return this.internalMatrix;
					}
					
					
					case 2113859280:
					{
						return this.get_orientation();
					}
					
					
					case 1614780307:
					{
						return this.get_offset();
					}
					
					
					case 1002976833:
					{
						return this.get_matrix();
					}
					
					
					default:
					{
						return base.__hx_getField(field, hash, throwErrors, isCheck, handleProperties);
					}
					
				}
				
			}
		}
		
		
		public override object __hx_invokeField(string field, int hash, global::Array dynargs) {
			unchecked {
				switch (hash) {
					case 984359795:
					{
						return this.set_orientation(((global::hxmath.math.QuaternionDefault) (dynargs[0]) ));
					}
					
					
					case 1054910055:
					{
						return this.get_orientation();
					}
					
					
					case 1413785040:
					{
						return this.set_offset(((global::hxmath.math.Vector3Default) (dynargs[0]) ));
					}
					
					
					case 1355220828:
					{
						return this.get_offset();
					}
					
					
					case 743417354:
					{
						return this.get_matrix();
					}
					
					
					case 946786476:
					{
						return this.toString();
					}
					
					
					default:
					{
						return base.__hx_invokeField(field, hash, dynargs);
					}
					
				}
				
			}
		}
		
		
		public override void __hx_getFields(global::Array<object> baseArr) {
			baseArr.push("isDirty");
			baseArr.push("isCached");
			baseArr.push("internalOrientation");
			baseArr.push("internalOffset");
			baseArr.push("internalMatrix");
			baseArr.push("orientation");
			baseArr.push("offset");
			baseArr.push("matrix");
			{
				base.__hx_getFields(baseArr);
			}
			
		}
		
		
		public override string ToString(){
			return this.toString();
		}
		
		
	}
}


