// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class DynamicsT extends haxe.lang.HxObject
{
	public DynamicsT(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public DynamicsT()
	{
		//line 270 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Dynamics.hx"
		thx.DynamicsT.__hx_ctor_thx_DynamicsT(this);
	}
	
	
	public static void __hx_ctor_thx_DynamicsT(thx.DynamicsT __temp_me86)
	{
	}
	
	
	public static <T> boolean isEmpty(java.lang.Object o)
	{
		//line 275 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Dynamics.hx"
		return ( haxe.root.Reflect.fields(o).length == 0 );
	}
	
	
	public static <T> boolean exists(java.lang.Object o, java.lang.String name)
	{
		//line 281 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Dynamics.hx"
		return haxe.root.Reflect.hasField(o, name);
	}
	
	
	public static <T> haxe.root.Array<java.lang.String> fields(java.lang.Object o)
	{
		//line 287 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Dynamics.hx"
		return haxe.root.Reflect.fields(o);
	}
	
	
	public static <T> java.lang.Object merge(java.lang.Object to, java.lang.Object from, haxe.lang.Function replacef)
	{
		//line 296 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Dynamics.hx"
		if (( null == replacef )) 
		{
			//line 297 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Dynamics.hx"
			replacef = ( (( thx.DynamicsT_merge_297__Fun.__hx_current != null )) ? (thx.DynamicsT_merge_297__Fun.__hx_current) : (thx.DynamicsT_merge_297__Fun.__hx_current = ((thx.DynamicsT_merge_297__Fun) (new thx.DynamicsT_merge_297__Fun()) )) );
		}
		
		//line 298 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Dynamics.hx"
		{
			//line 298 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Dynamics.hx"
			int _g = 0;
			//line 298 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Dynamics.hx"
			haxe.root.Array<java.lang.String> _g1 = haxe.root.Reflect.fields(from);
			//line 298 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Dynamics.hx"
			while (( _g < _g1.length ))
			{
				//line 298 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Dynamics.hx"
				java.lang.String field1 = _g1.__get(_g);
				//line 298 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Dynamics.hx"
				 ++ _g;
				//line 299 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Dynamics.hx"
				java.lang.Object newv1 = haxe.root.Reflect.field(from, field1);
				//line 300 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Dynamics.hx"
				if (haxe.root.Reflect.hasField(to, field1)) 
				{
					//line 301 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Dynamics.hx"
					haxe.root.Reflect.setField(to, field1, ((java.lang.Object) (replacef.__hx_invoke3_o(0.0, field1, 0.0, haxe.root.Reflect.field(to, field1), 0.0, newv1)) ));
				}
				else
				{
					//line 303 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Dynamics.hx"
					haxe.root.Reflect.setField(to, field1, newv1);
				}
				
			}
			
		}
		
		//line 306 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Dynamics.hx"
		return to;
	}
	
	
	public static <T> int size(java.lang.Object o)
	{
		//line 323 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Dynamics.hx"
		return haxe.root.Reflect.fields(o).length;
	}
	
	
	public static <T> haxe.root.Array values(java.lang.Object o)
	{
		//line 329 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Dynamics.hx"
		return ((haxe.root.Array<java.lang.Object>) (haxe.root.Reflect.fields(o).map(((haxe.lang.Function) (new thx.DynamicsT_values_329__Fun<T>(o)) ))) );
	}
	
	
	public static <T> haxe.root.Array<java.lang.Object> tuples(java.lang.Object o)
	{
		//line 336 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Dynamics.hx"
		return ((haxe.root.Array<java.lang.Object>) (haxe.root.Reflect.fields(o).map(((haxe.lang.Function) (new thx.DynamicsT_tuples_336__Fun<T>(o)) ))) );
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 270 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Dynamics.hx"
		return new thx.DynamicsT(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 270 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Dynamics.hx"
		return new thx.DynamicsT();
	}
	
	
}


