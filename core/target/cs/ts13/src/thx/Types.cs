// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class Types : global::haxe.lang.HxObject {
		
		public Types(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public Types() {
			global::thx.Types.__hx_ctor_thx_Types(this);
		}
		
		
		public static void __hx_ctor_thx_Types(global::thx.Types __temp_me142) {
		}
		
		
		public static bool isAnonymousObject(object v) {
			if (global::Reflect.isObject(v)) {
				return global::haxe.lang.Runtime.typeEq(null, global::Type.getClass<object>(((object) (v) )));
			}
			else {
				return false;
			}
			
		}
		
		
		public static bool isPrimitive(object v) {
			unchecked {
				global::ValueType _g = global::Type.@typeof(v);
				switch (_g.index) {
					case 0:
					case 4:
					case 5:
					case 7:
					case 8:
					{
						return false;
					}
					
					
					case 1:
					case 2:
					case 3:
					{
						return true;
					}
					
					
					case 6:
					{
						return string.Equals(global::Type.getClassName(((global::System.Type) (_g.@params[0]) )), "String");
					}
					
					
				}
				
				return default(bool);
			}
		}
		
		
		public static bool isEnumValue(object v) {
			unchecked {
				if (( ((int) (global::haxe.lang.Runtime.toInt(global::Type.@typeof(v).index)) ) == 7 )) {
					return true;
				}
				else {
					return false;
				}
				
			}
		}
		
		
		public static bool hasSuperClass(global::System.Type cls, global::System.Type sup) {
			while ( ! (global::haxe.lang.Runtime.typeEq(null, cls)) ) {
				if (global::haxe.lang.Runtime.typeEq(cls, sup)) {
					return true;
				}
				
				cls = global::Type.getSuperClass(cls);
			}
			
			return false;
		}
		
		
		public static bool sameType<A, B>(A a, B b) {
			return string.Equals(global::thx.Types.toString(global::Type.@typeof(a)), global::thx.Types.toString(global::Type.@typeof(b)));
		}
		
		
		public static global::Array<object> typeInheritance(global::ValueType type) {
			unchecked {
				switch (type.index) {
					case 1:
					{
						return new global::Array<object>(new object[]{"Int"});
					}
					
					
					case 2:
					{
						return new global::Array<object>(new object[]{"Float"});
					}
					
					
					case 3:
					{
						return new global::Array<object>(new object[]{"Bool"});
					}
					
					
					case 4:
					{
						return new global::Array<object>(new object[]{"{}"});
					}
					
					
					case 5:
					{
						return new global::Array<object>(new object[]{"Function"});
					}
					
					
					case 6:
					{
						global::System.Type c = ((global::System.Type) (type.@params[0]) );
						global::Array<object> classes = new global::Array<object>(new object[]{});
						while ( ! (global::haxe.lang.Runtime.typeEq(null, c)) ) {
							classes.push(c);
							c = global::Type.getSuperClass(c);
						}
						
						return classes.map<object>(((global::haxe.lang.Function) (new global::haxe.lang.Closure(typeof(global::Type), "getClassName", 1804873517)) ));
					}
					
					
					case 7:
					{
						return new global::Array<object>(new object[]{global::Type.getEnumName(((global::System.Type) (type.@params[0]) ))});
					}
					
					
					default:
					{
						throw global::haxe.lang.HaxeException.wrap(global::haxe.lang.Runtime.concat("invalid type ", global::Std.@string(type)));
					}
					
				}
				
			}
		}
		
		
		public static string toString(global::ValueType type) {
			unchecked {
				switch (type.index) {
					case 0:
					{
						return "Null";
					}
					
					
					case 1:
					{
						return "Int";
					}
					
					
					case 2:
					{
						return "Float";
					}
					
					
					case 3:
					{
						return "Bool";
					}
					
					
					case 4:
					{
						return "{}";
					}
					
					
					case 5:
					{
						return "Function";
					}
					
					
					case 6:
					{
						return global::Type.getClassName(((global::System.Type) (type.@params[0]) ));
					}
					
					
					case 7:
					{
						return global::Type.getEnumName(((global::System.Type) (type.@params[0]) ));
					}
					
					
					default:
					{
						throw global::haxe.lang.HaxeException.wrap(global::haxe.lang.Runtime.concat("invalid type ", global::Std.@string(type)));
					}
					
				}
				
			}
		}
		
		
		public static global::Array<object> valueTypeInheritance<T>(T @value) {
			return global::thx.Types.typeInheritance(global::Type.@typeof(@value));
		}
		
		
		public static string valueTypeToString<T>(T @value) {
			return global::thx.Types.toString(global::Type.@typeof(@value));
		}
		
		
		public static string anyValueToString(object @value) {
			if (( @value is global::ValueType )) {
				return global::thx.Types.toString(((global::ValueType) (@value) ));
			}
			
			if (( @value is global::System.Type )) {
				return global::Type.getClassName(((global::System.Type) (@value) ));
			}
			
			if (( @value is global::System.Type )) {
				return global::Type.getEnumName(((global::System.Type) (@value) ));
			}
			
			return global::thx.Types.toString(global::Type.@typeof(((object) (@value) )));
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::thx.Types(global::haxe.lang.EmptyObject.EMPTY);
		}
		
		
		public static new object __hx_create(global::Array arr) {
			return new global::thx.Types();
		}
		
		
	}
}

