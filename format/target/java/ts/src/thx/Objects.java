// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Objects extends haxe.lang.HxObject
{
	public Objects(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Objects()
	{
		//line 12 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		thx.Objects.__hx_ctor_thx_Objects(this);
	}
	
	
	public static void __hx_ctor_thx_Objects(thx.Objects __temp_me123)
	{
	}
	
	
	public static int compare(java.lang.Object a, java.lang.Object b)
	{
		//line 20 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		int v = 0;
		//line 20 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		haxe.root.Array<java.lang.String> fields = haxe.root.Reflect.fields(a);
		//line 21 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		v = ((int) (thx.Arrays.compare(((haxe.root.Array<java.lang.String>) (fields) ), ((haxe.root.Array<java.lang.String>) (haxe.root.Reflect.fields(b)) ))) );
		//line 21 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		if (( v != 0 )) 
		{
			//line 22 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
			return v;
		}
		
		//line 23 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		{
			//line 23 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
			int _g = 0;
			//line 23 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
			while (( _g < fields.length ))
			{
				//line 23 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
				java.lang.String field = fields.__get(_g);
				//line 23 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
				 ++ _g;
				//line 24 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
				v = thx.Dynamics.compare(haxe.root.Reflect.field(a, field), haxe.root.Reflect.field(b, field));
				//line 24 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
				if (( v != 0 )) 
				{
					//line 25 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
					return v;
				}
				
			}
			
		}
		
		//line 27 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		return 0;
	}
	
	
	public static boolean isEmpty(java.lang.Object o)
	{
		//line 34 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		return ( haxe.root.Reflect.fields(o).length == 0 );
	}
	
	
	public static boolean exists(java.lang.Object o, java.lang.String name)
	{
		//line 40 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		return haxe.root.Reflect.hasField(o, name);
	}
	
	
	public static haxe.root.Array<java.lang.String> fields(java.lang.Object o)
	{
		//line 46 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		return haxe.root.Reflect.fields(o);
	}
	
	
	public static java.lang.Object combine(java.lang.Object first, java.lang.Object second)
	{
		//line 64 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		java.lang.Object to = new haxe.lang.DynamicObject(new java.lang.String[]{}, new java.lang.Object[]{}, new java.lang.String[]{}, new double[]{});
		//line 65 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		{
			//line 65 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
			int _g = 0;
			//line 65 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
			haxe.root.Array<java.lang.String> _g1 = haxe.root.Reflect.fields(first);
			//line 65 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
			while (( _g < _g1.length ))
			{
				//line 65 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
				java.lang.String field = _g1.__get(_g);
				//line 65 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
				 ++ _g;
				//line 66 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
				haxe.root.Reflect.setField(to, field, haxe.root.Reflect.field(first, field));
			}
			
		}
		
		//line 68 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		{
			//line 68 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
			int _g2 = 0;
			//line 68 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
			haxe.root.Array<java.lang.String> _g11 = haxe.root.Reflect.fields(second);
			//line 68 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
			while (( _g2 < _g11.length ))
			{
				//line 68 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
				java.lang.String field1 = _g11.__get(_g2);
				//line 68 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
				 ++ _g2;
				//line 69 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
				haxe.root.Reflect.setField(to, field1, haxe.root.Reflect.field(second, field1));
			}
			
		}
		
		//line 71 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		return to;
	}
	
	
	public static java.lang.Object assign(java.lang.Object to, java.lang.Object from, haxe.lang.Function replacef)
	{
		//line 81 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		if (( null == replacef )) 
		{
			//line 82 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
			replacef = ( (( thx.Objects_assign_82__Fun.__hx_current != null )) ? (thx.Objects_assign_82__Fun.__hx_current) : (thx.Objects_assign_82__Fun.__hx_current = ((thx.Objects_assign_82__Fun) (new thx.Objects_assign_82__Fun()) )) );
		}
		
		//line 83 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		{
			//line 83 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
			int _g = 0;
			//line 83 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
			haxe.root.Array<java.lang.String> _g1 = haxe.root.Reflect.fields(from);
			//line 83 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
			while (( _g < _g1.length ))
			{
				//line 83 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
				java.lang.String field1 = _g1.__get(_g);
				//line 83 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
				 ++ _g;
				//line 84 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
				java.lang.Object newv1 = haxe.root.Reflect.field(from, field1);
				//line 85 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
				if (haxe.root.Reflect.hasField(to, field1)) 
				{
					//line 86 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
					haxe.root.Reflect.setField(to, field1, ((java.lang.Object) (replacef.__hx_invoke3_o(0.0, field1, 0.0, haxe.root.Reflect.field(to, field1), 0.0, newv1)) ));
				}
				else
				{
					//line 88 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
					haxe.root.Reflect.setField(to, field1, newv1);
				}
				
			}
			
		}
		
		//line 91 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		return to;
	}
	
	
	public static java.lang.Object copyTo(java.lang.Object src, java.lang.Object dst, java.lang.Object cloneInstances)
	{
		//line 98 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		boolean __temp_cloneInstances121 = ( (haxe.lang.Runtime.eq(cloneInstances, null)) ? (false) : (haxe.lang.Runtime.toBool(cloneInstances)) );
		//line 99 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		{
			//line 99 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
			int _g = 0;
			//line 99 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
			haxe.root.Array<java.lang.String> _g1 = haxe.root.Reflect.fields(src);
			//line 99 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
			while (( _g < _g1.length ))
			{
				//line 99 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
				java.lang.String field = _g1.__get(_g);
				//line 99 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
				 ++ _g;
				//line 100 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
				java.lang.Object sv = thx.Dynamics.clone(haxe.root.Reflect.field(src, field), __temp_cloneInstances121);
				//line 101 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
				java.lang.Object dv = haxe.root.Reflect.field(dst, field);
				//line 102 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
				if (( ( haxe.root.Reflect.isObject(sv) && ( ((java.lang.Object) (null) ) == ((java.lang.Object) (((java.lang.Class) (haxe.root.Type.getClass(((java.lang.Object) (sv) ))) )) ) ) ) && (( haxe.root.Reflect.isObject(dv) && ( ((java.lang.Object) (null) ) == ((java.lang.Object) (((java.lang.Class) (haxe.root.Type.getClass(((java.lang.Object) (dv) ))) )) ) ) )) )) 
				{
					//line 103 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
					thx.Objects.copyTo(sv, dv, null);
				}
				else
				{
					//line 105 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
					haxe.root.Reflect.setField(dst, field, sv);
				}
				
			}
			
		}
		
		//line 108 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		return dst;
	}
	
	
	public static <T> T clone(T src, java.lang.Object cloneInstances)
	{
		//line 115 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		boolean __temp_cloneInstances122 = ( (haxe.lang.Runtime.eq(cloneInstances, null)) ? (false) : (haxe.lang.Runtime.toBool(cloneInstances)) );
		//line 115 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		return ((T) (thx.Dynamics.clone(src, __temp_cloneInstances122)) );
	}
	
	
	public static haxe.ds.StringMap toMap(java.lang.Object o)
	{
		//line 123 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		return ((haxe.ds.StringMap) (thx.Arrays.reduce(((haxe.root.Array<java.lang.Object>) (thx.Objects.tuples(o)) ), ((haxe.lang.Function) (( (( thx.Objects_toMap_123__Fun.__hx_current != null )) ? (thx.Objects_toMap_123__Fun.__hx_current) : (thx.Objects_toMap_123__Fun.__hx_current = ((thx.Objects_toMap_123__Fun) (new thx.Objects_toMap_123__Fun()) )) )) ), ((java.lang.Object) (new haxe.ds.StringMap()) ))) );
	}
	
	
	public static int size(java.lang.Object o)
	{
		//line 132 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		return haxe.root.Reflect.fields(o).length;
	}
	
	
	public static java.lang.String string(java.lang.Object o)
	{
		//line 141 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		return ( ( "{" + ((haxe.root.Array<java.lang.String>) (((haxe.root.Array) (haxe.root.Reflect.fields(o).map(((haxe.lang.Function) (new thx.Objects_string_143__Fun(o)) ))) )) ).join(", ") ) + "}" );
	}
	
	
	public static void stringImpl(java.lang.Object o, haxe.ds.ObjectMap<java.lang.Object, java.lang.Object> cache)
	{
	}
	
	
	public static haxe.root.Array values(java.lang.Object o)
	{
		//line 164 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		return ((haxe.root.Array<java.lang.Object>) (haxe.root.Reflect.fields(o).map(((haxe.lang.Function) (new thx.Objects_values_164__Fun(o)) ))) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> tuples(java.lang.Object o)
	{
		//line 171 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		return ((haxe.root.Array<java.lang.Object>) (haxe.root.Reflect.fields(o).map(((haxe.lang.Function) (new thx.Objects_tuples_171__Fun(o)) ))) );
	}
	
	
	public static boolean hasPath(java.lang.Object o, java.lang.String path)
	{
		//line 182 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		haxe.root.Array<java.lang.String> paths = haxe.lang.StringExt.split(path, ".");
		//line 183 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		java.lang.Object current = o;
		//line 185 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		{
			//line 185 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
			int _g = 0;
			//line 185 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
			while (( _g < paths.length ))
			{
				//line 185 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
				java.lang.String currentPath = paths.__get(_g);
				//line 185 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
				 ++ _g;
				//line 186 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
				if (thx.Strings.DIGITS.match(currentPath)) 
				{
					//line 187 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
					java.lang.Object index = haxe.root.Std.parseInt(currentPath);
					//line 188 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
					java.lang.Object value = ((java.lang.Object) (current) );
					//line 187 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
					haxe.root.Array arr = ( (( value instanceof haxe.root.Array )) ? (((haxe.root.Array) (value) )) : (null) );
					//line 189 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
					if (( ( null == arr ) || ( haxe.lang.Runtime.compare(arr.length, index) <= 0 ) )) 
					{
						//line 189 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
						return false;
					}
					
					//line 190 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
					current = arr.__get(((int) (haxe.lang.Runtime.toInt(index)) ));
				}
				else
				{
					//line 191 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
					if (haxe.root.Reflect.hasField(current, currentPath)) 
					{
						//line 192 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
						current = haxe.root.Reflect.field(current, currentPath);
					}
					else
					{
						//line 194 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
						return false;
					}
					
				}
				
			}
			
		}
		
		//line 197 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		return true;
	}
	
	
	public static boolean hasPathValue(java.lang.Object o, java.lang.String path)
	{
		//line 206 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		return ( ! (( thx.Objects.getPath(o, path) == null )) );
	}
	
	
	public static java.lang.Object getPath(java.lang.Object o, java.lang.String path)
	{
		//line 215 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		haxe.root.Array<java.lang.String> paths = haxe.lang.StringExt.split(path, ".");
		//line 216 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		java.lang.Object current = o;
		//line 217 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		{
			//line 217 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
			int _g = 0;
			//line 217 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
			while (( _g < paths.length ))
			{
				//line 217 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
				java.lang.String currentPath = paths.__get(_g);
				//line 217 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
				 ++ _g;
				//line 218 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
				if (thx.Strings.DIGITS.match(currentPath)) 
				{
					//line 219 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
					java.lang.Object index = haxe.root.Std.parseInt(currentPath);
					//line 220 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
					java.lang.Object value = ((java.lang.Object) (current) );
					//line 219 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
					haxe.root.Array arr = ( (( value instanceof haxe.root.Array )) ? (((haxe.root.Array) (value) )) : (null) );
					//line 221 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
					if (( null == arr )) 
					{
						//line 221 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
						return null;
					}
					
					//line 222 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
					current = arr.__get(((int) (haxe.lang.Runtime.toInt(index)) ));
				}
				else
				{
					//line 223 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
					if (haxe.root.Reflect.hasField(current, currentPath)) 
					{
						//line 224 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
						current = haxe.root.Reflect.field(current, currentPath);
					}
					else
					{
						//line 226 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
						return null;
					}
					
				}
				
			}
			
		}
		
		//line 229 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		return current;
	}
	
	
	public static haxe.ds.Option getPathOption(java.lang.Object o, java.lang.String path)
	{
		//line 236 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		java.lang.Object value = ((java.lang.Object) (thx.Objects.getPath(o, path)) );
		//line 236 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		if (( null == value )) 
		{
			//line 236 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
			return haxe.ds.Option.None;
		}
		else
		{
			//line 236 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
			return haxe.ds.Option.Some(value);
		}
		
	}
	
	
	public static java.lang.Object getPathOr(java.lang.Object o, java.lang.String path, java.lang.Object alt)
	{
		//line 247 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		haxe.root.Array<java.lang.String> paths = haxe.lang.StringExt.split(path, ".");
		//line 248 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		java.lang.Object current = o;
		//line 249 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		{
			//line 249 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
			int _g = 0;
			//line 249 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
			while (( _g < paths.length ))
			{
				//line 249 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
				java.lang.String currentPath = paths.__get(_g);
				//line 249 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
				 ++ _g;
				//line 250 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
				if (thx.Strings.DIGITS.match(currentPath)) 
				{
					//line 251 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
					java.lang.Object index = haxe.root.Std.parseInt(currentPath);
					//line 252 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
					java.lang.Object value = ((java.lang.Object) (current) );
					//line 251 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
					haxe.root.Array arr = ( (( value instanceof haxe.root.Array )) ? (((haxe.root.Array) (value) )) : (null) );
					//line 253 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
					if (( null == arr )) 
					{
						//line 253 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
						return null;
					}
					
					//line 254 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
					current = arr.__get(((int) (haxe.lang.Runtime.toInt(index)) ));
				}
				else
				{
					//line 255 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
					if (haxe.root.Reflect.hasField(current, currentPath)) 
					{
						//line 256 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
						current = haxe.root.Reflect.field(current, currentPath);
					}
					else
					{
						//line 258 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
						return alt;
					}
					
				}
				
			}
			
		}
		
		//line 261 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		return current;
	}
	
	
	public static <T> java.lang.Object setPath(java.lang.Object o, java.lang.String path, T val)
	{
		//line 273 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		haxe.root.Array<java.lang.String> paths = haxe.lang.StringExt.split(path, ".");
		//line 273 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		java.lang.Object current = o;
		//line 276 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		{
			//line 276 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
			int _g1 = 0;
			//line 276 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
			int _g = ( paths.length - 1 );
			//line 276 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
			while (( _g1 < _g ))
			{
				//line 276 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
				int i = _g1++;
				//line 277 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
				java.lang.String currentPath = paths.__get(i);
				//line 277 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
				java.lang.String nextPath = paths.__get(( i + 1 ));
				//line 280 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
				if (( thx.Strings.DIGITS.match(currentPath) || haxe.lang.Runtime.valEq(currentPath, "*") )) 
				{
					//line 281 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
					java.lang.Object index = ( (haxe.lang.Runtime.valEq(currentPath, "*")) ? (((haxe.root.Array) (current) ).length) : (haxe.root.Std.parseInt(currentPath)) );
					//line 286 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
					if (( ((java.lang.Object) (haxe.lang.Runtime.callField(current, "__get", new haxe.root.Array(new java.lang.Object[]{index}))) ) == null )) 
					{
						//line 287 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
						if (( thx.Strings.DIGITS.match(nextPath) || haxe.lang.Runtime.valEq(nextPath, "*") )) 
						{
							//line 288 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
							haxe.lang.Runtime.callField(current, "__set", new haxe.root.Array(new java.lang.Object[]{index, new haxe.root.Array(new java.lang.Object[]{})}));
						}
						else
						{
							//line 290 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
							haxe.lang.Runtime.callField(current, "__set", new haxe.root.Array(new java.lang.Object[]{index, new haxe.lang.DynamicObject(new java.lang.String[]{}, new java.lang.Object[]{}, new java.lang.String[]{}, new double[]{})}));
						}
						
					}
					
					//line 293 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
					current = ((java.lang.Object) (haxe.lang.Runtime.callField(current, "__get", new haxe.root.Array(new java.lang.Object[]{index}))) );
				}
				else
				{
					//line 295 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
					if ( ! (haxe.root.Reflect.hasField(current, currentPath)) ) 
					{
						//line 296 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
						if (( thx.Strings.DIGITS.match(nextPath) || haxe.lang.Runtime.valEq(nextPath, "*") )) 
						{
							//line 297 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
							haxe.root.Reflect.setField(current, currentPath, new haxe.root.Array(new java.lang.Object[]{}));
						}
						else
						{
							//line 299 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
							haxe.root.Reflect.setField(current, currentPath, new haxe.lang.DynamicObject(new java.lang.String[]{}, new java.lang.Object[]{}, new java.lang.String[]{}, new double[]{}));
						}
						
					}
					
					//line 302 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
					current = haxe.root.Reflect.field(current, currentPath);
				}
				
			}
			
		}
		
		//line 305 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		java.lang.String tmp = ((haxe.root.Array<java.lang.String>) (paths) ).__get(( paths.length - 1 ));
		//line 306 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		if (thx.Strings.DIGITS.match(tmp)) 
		{
			//line 307 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
			java.lang.Object index1 = haxe.root.Std.parseInt(tmp);
			//line 308 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
			haxe.lang.Runtime.callField(current, "__set", new haxe.root.Array(new java.lang.Object[]{index1, val}));
		}
		else
		{
			//line 309 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
			if (haxe.lang.Runtime.valEq(tmp, "*")) 
			{
				//line 310 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
				((haxe.root.Array) (current) ).push(val);
			}
			else
			{
				//line 312 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
				haxe.root.Reflect.setField(current, tmp, val);
			}
			
		}
		
		//line 314 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		return o;
	}
	
	
	public static java.lang.Object removePath(java.lang.Object o, java.lang.String path)
	{
		//line 323 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		haxe.root.Array<java.lang.String> paths = haxe.lang.StringExt.split(path, ".");
		//line 326 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		java.lang.String target = haxe.lang.Runtime.toString(paths.pop());
		//line 330 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		try 
		{
			//line 331 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
			java.lang.Object sub = ((java.lang.Object) (thx.Arrays.reduce(((haxe.root.Array<java.lang.String>) (paths) ), ((haxe.lang.Function) (( (( thx.Objects_removePath_331__Fun.__hx_current != null )) ? (thx.Objects_removePath_331__Fun.__hx_current) : (thx.Objects_removePath_331__Fun.__hx_current = ((thx.Objects_removePath_331__Fun) (new thx.Objects_removePath_331__Fun()) )) )) ), ((java.lang.Object) (o) ))) );
			//line 343 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
			if (( ! (( null == sub )) )) 
			{
				//line 344 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
				haxe.root.Reflect.deleteField(sub, target);
			}
			
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 330 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 345 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 345 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 345 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 345 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
			{
				//line 345 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
				java.lang.Object e = __temp_catchall2;
			}
			
		}
		
		
		//line 347 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		return o;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 12 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		return new thx.Objects(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 12 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Objects.hx"
		return new thx.Objects();
	}
	
	
}


