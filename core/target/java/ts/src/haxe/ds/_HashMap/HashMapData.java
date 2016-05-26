// Generated by Haxe 3.3.0
package haxe.ds._HashMap;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class HashMapData<K, V> extends haxe.lang.HxObject
{
	public HashMapData(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public HashMapData()
	{
		//line 87 "/usr/lib/haxe/std/haxe/ds/HashMap.hx"
		haxe.ds._HashMap.HashMapData.__hx_ctor_haxe_ds__HashMap_HashMapData(((haxe.ds._HashMap.HashMapData<K, V>) (this) ));
	}
	
	
	public static <K_c, V_c> void __hx_ctor_haxe_ds__HashMap_HashMapData(haxe.ds._HashMap.HashMapData<K_c, V_c> __temp_me30)
	{
		//line 88 "/usr/lib/haxe/std/haxe/ds/HashMap.hx"
		__temp_me30.keys = new haxe.ds.IntMap<K_c>();
		//line 89 "/usr/lib/haxe/std/haxe/ds/HashMap.hx"
		__temp_me30.values = new haxe.ds.IntMap<V_c>();
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 84 "/usr/lib/haxe/std/haxe/ds/HashMap.hx"
		return new haxe.ds._HashMap.HashMapData<java.lang.Object, java.lang.Object>(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 84 "/usr/lib/haxe/std/haxe/ds/HashMap.hx"
		return new haxe.ds._HashMap.HashMapData<java.lang.Object, java.lang.Object>();
	}
	
	
	public haxe.ds.IntMap<K> keys;
	
	public haxe.ds.IntMap<V> values;
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 84 "/usr/lib/haxe/std/haxe/ds/HashMap.hx"
		{
			//line 84 "/usr/lib/haxe/std/haxe/ds/HashMap.hx"
			boolean __temp_executeDef1 = true;
			//line 84 "/usr/lib/haxe/std/haxe/ds/HashMap.hx"
			switch (field.hashCode())
			{
				case -823812830:
				{
					//line 84 "/usr/lib/haxe/std/haxe/ds/HashMap.hx"
					if (field.equals("values")) 
					{
						//line 84 "/usr/lib/haxe/std/haxe/ds/HashMap.hx"
						__temp_executeDef1 = false;
						//line 84 "/usr/lib/haxe/std/haxe/ds/HashMap.hx"
						this.values = ((haxe.ds.IntMap<V>) (value) );
						//line 84 "/usr/lib/haxe/std/haxe/ds/HashMap.hx"
						return value;
					}
					
					//line 84 "/usr/lib/haxe/std/haxe/ds/HashMap.hx"
					break;
				}
				
				
				case 3288564:
				{
					//line 84 "/usr/lib/haxe/std/haxe/ds/HashMap.hx"
					if (field.equals("keys")) 
					{
						//line 84 "/usr/lib/haxe/std/haxe/ds/HashMap.hx"
						__temp_executeDef1 = false;
						//line 84 "/usr/lib/haxe/std/haxe/ds/HashMap.hx"
						this.keys = ((haxe.ds.IntMap<K>) (value) );
						//line 84 "/usr/lib/haxe/std/haxe/ds/HashMap.hx"
						return value;
					}
					
					//line 84 "/usr/lib/haxe/std/haxe/ds/HashMap.hx"
					break;
				}
				
				
			}
			
			//line 84 "/usr/lib/haxe/std/haxe/ds/HashMap.hx"
			if (__temp_executeDef1) 
			{
				//line 84 "/usr/lib/haxe/std/haxe/ds/HashMap.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 84 "/usr/lib/haxe/std/haxe/ds/HashMap.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 84 "/usr/lib/haxe/std/haxe/ds/HashMap.hx"
		{
			//line 84 "/usr/lib/haxe/std/haxe/ds/HashMap.hx"
			boolean __temp_executeDef1 = true;
			//line 84 "/usr/lib/haxe/std/haxe/ds/HashMap.hx"
			switch (field.hashCode())
			{
				case -823812830:
				{
					//line 84 "/usr/lib/haxe/std/haxe/ds/HashMap.hx"
					if (field.equals("values")) 
					{
						//line 84 "/usr/lib/haxe/std/haxe/ds/HashMap.hx"
						__temp_executeDef1 = false;
						//line 84 "/usr/lib/haxe/std/haxe/ds/HashMap.hx"
						return this.values;
					}
					
					//line 84 "/usr/lib/haxe/std/haxe/ds/HashMap.hx"
					break;
				}
				
				
				case 3288564:
				{
					//line 84 "/usr/lib/haxe/std/haxe/ds/HashMap.hx"
					if (field.equals("keys")) 
					{
						//line 84 "/usr/lib/haxe/std/haxe/ds/HashMap.hx"
						__temp_executeDef1 = false;
						//line 84 "/usr/lib/haxe/std/haxe/ds/HashMap.hx"
						return this.keys;
					}
					
					//line 84 "/usr/lib/haxe/std/haxe/ds/HashMap.hx"
					break;
				}
				
				
			}
			
			//line 84 "/usr/lib/haxe/std/haxe/ds/HashMap.hx"
			if (__temp_executeDef1) 
			{
				//line 84 "/usr/lib/haxe/std/haxe/ds/HashMap.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 84 "/usr/lib/haxe/std/haxe/ds/HashMap.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 84 "/usr/lib/haxe/std/haxe/ds/HashMap.hx"
		baseArr.push("values");
		//line 84 "/usr/lib/haxe/std/haxe/ds/HashMap.hx"
		baseArr.push("keys");
		//line 84 "/usr/lib/haxe/std/haxe/ds/HashMap.hx"
		{
			//line 84 "/usr/lib/haxe/std/haxe/ds/HashMap.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


