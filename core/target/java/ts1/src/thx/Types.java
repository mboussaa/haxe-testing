// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Types extends haxe.lang.HxObject
{
	public Types(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Types()
	{
		//line 6 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
		thx.Types.__hx_ctor_thx_Types(this);
	}
	
	
	public static void __hx_ctor_thx_Types(thx.Types __temp_me113)
	{
	}
	
	
	public static boolean isAnonymousObject(java.lang.Object v)
	{
		//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
		if (haxe.root.Reflect.isObject(v)) 
		{
			//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
			return ( ((java.lang.Object) (null) ) == ((java.lang.Object) (((java.lang.Class) (haxe.root.Type.getClass(((java.lang.Object) (v) ))) )) ) );
		}
		else
		{
			//line 11 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
			return false;
		}
		
	}
	
	
	public static boolean isPrimitive(java.lang.Object v)
	{
		//line 17 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
		haxe.root.ValueType _g = haxe.root.Type.typeof(v);
		//line 17 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
		switch (_g.index)
		{
			case 0:
			case 4:
			case 5:
			case 7:
			case 8:
			{
				//line 17 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
				return false;
			}
			
			
			case 1:
			case 2:
			case 3:
			{
				//line 17 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
				return true;
			}
			
			
			case 6:
			{
				//line 20 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
				java.lang.Class c = ((java.lang.Class) (_g.params[0]) );
				//line 17 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
				return haxe.lang.Runtime.valEq(haxe.root.Type.getClassName(c), "String");
			}
			
			
		}
		
		//line 16 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
		return false;
	}
	
	
	public static boolean isEnumValue(java.lang.Object v)
	{
		//line 27 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
		haxe.root.ValueType _g = haxe.root.Type.typeof(v);
		//line 27 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
		switch (_g.index)
		{
			case 7:
			{
				//line 27 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
				return true;
			}
			
			
			default:
			{
				//line 27 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
				return false;
			}
			
		}
		
	}
	
	
	public static boolean hasSuperClass(java.lang.Class cls, java.lang.Class sup)
	{
		//line 38 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
		while (( ((java.lang.Object) (null) ) != ((java.lang.Object) (cls) ) ))
		{
			//line 39 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
			if (( ((java.lang.Object) (cls) ) == ((java.lang.Object) (sup) ) )) 
			{
				//line 40 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
				return true;
			}
			
			//line 41 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
			cls = haxe.root.Type.getSuperClass(cls);
		}
		
		//line 43 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
		return false;
	}
	
	
	public static <A, B> boolean sameType(A a, B b)
	{
		//line 50 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
		return haxe.lang.Runtime.valEq(thx.Types.toString(haxe.root.Type.typeof(a)), thx.Types.toString(haxe.root.Type.typeof(b)));
	}
	
	
	public static haxe.root.Array<java.lang.String> typeInheritance(haxe.root.ValueType type)
	{
		//line 57 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
		switch (type.index)
		{
			case 1:
			{
				//line 57 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
				return new haxe.root.Array<java.lang.String>(new java.lang.String[]{"Int"});
			}
			
			
			case 2:
			{
				//line 57 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
				return new haxe.root.Array<java.lang.String>(new java.lang.String[]{"Float"});
			}
			
			
			case 3:
			{
				//line 57 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
				return new haxe.root.Array<java.lang.String>(new java.lang.String[]{"Bool"});
			}
			
			
			case 4:
			{
				//line 57 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
				return new haxe.root.Array<java.lang.String>(new java.lang.String[]{"{}"});
			}
			
			
			case 5:
			{
				//line 57 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
				return new haxe.root.Array<java.lang.String>(new java.lang.String[]{"Function"});
			}
			
			
			case 6:
			{
				//line 63 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
				java.lang.Class c = ((java.lang.Class) (type.params[0]) );
				//line 64 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
				haxe.root.Array<java.lang.Class> classes = new haxe.root.Array<java.lang.Class>(new java.lang.Class[]{});
				//line 65 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
				while (( ((java.lang.Object) (null) ) != ((java.lang.Object) (c) ) ))
				{
					//line 66 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
					classes.push(c);
					//line 67 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
					c = haxe.root.Type.getSuperClass(c);
				}
				
				//line 57 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
				return ((haxe.root.Array<java.lang.String>) (((haxe.root.Array) (classes.map(((haxe.lang.Function) (new haxe.lang.Closure(haxe.root.Type.class, "getClassName")) ))) )) );
			}
			
			
			case 7:
			{
				//line 70 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
				java.lang.Class e = ((java.lang.Class) (type.params[0]) );
				//line 57 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
				return new haxe.root.Array<java.lang.String>(new java.lang.String[]{haxe.root.Type.getEnumName(e)});
			}
			
			
			default:
			{
				//line 71 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
				throw haxe.lang.HaxeException.wrap(( "invalid type " + haxe.root.Std.string(type) ));
			}
			
		}
		
	}
	
	
	public static java.lang.String toString(haxe.root.ValueType type)
	{
		//line 79 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
		switch (type.index)
		{
			case 0:
			{
				//line 79 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
				return "Null";
			}
			
			
			case 1:
			{
				//line 79 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
				return "Int";
			}
			
			
			case 2:
			{
				//line 79 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
				return "Float";
			}
			
			
			case 3:
			{
				//line 79 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
				return "Bool";
			}
			
			
			case 4:
			{
				//line 79 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
				return "{}";
			}
			
			
			case 5:
			{
				//line 79 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
				return "Function";
			}
			
			
			case 6:
			{
				//line 86 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
				java.lang.Class c = ((java.lang.Class) (type.params[0]) );
				//line 79 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
				return haxe.root.Type.getClassName(c);
			}
			
			
			case 7:
			{
				//line 87 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
				java.lang.Class e = ((java.lang.Class) (type.params[0]) );
				//line 79 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
				return haxe.root.Type.getEnumName(e);
			}
			
			
			default:
			{
				//line 88 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
				throw haxe.lang.HaxeException.wrap(( "invalid type " + haxe.root.Std.string(type) ));
			}
			
		}
		
	}
	
	
	public static <T> haxe.root.Array<java.lang.String> valueTypeInheritance(T value)
	{
		//line 97 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
		return thx.Types.typeInheritance(haxe.root.Type.typeof(value));
	}
	
	
	public static <T> java.lang.String valueTypeToString(T value)
	{
		//line 103 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
		return thx.Types.toString(haxe.root.Type.typeof(value));
	}
	
	
	public static java.lang.String anyValueToString(java.lang.Object value)
	{
		//line 109 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
		if (( value instanceof haxe.root.ValueType )) 
		{
			//line 110 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
			return thx.Types.toString(((haxe.root.ValueType) (value) ));
		}
		
		//line 111 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
		if (( value instanceof java.lang.Class )) 
		{
			//line 112 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
			return haxe.root.Type.getClassName(((java.lang.Class) (value) ));
		}
		
		//line 113 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
		if (( value instanceof java.lang.Class )) 
		{
			//line 114 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
			return haxe.root.Type.getEnumName(((java.lang.Class) (value) ));
		}
		
		//line 115 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
		return thx.Types.toString(haxe.root.Type.typeof(((java.lang.Object) (value) )));
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 6 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
		return new thx.Types(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 6 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Types.hx"
		return new thx.Types();
	}
	
	
}


