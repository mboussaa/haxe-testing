// Generated by Haxe 3.3.0
package haxe;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Utf8 extends haxe.lang.HxObject
{
	public Utf8(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Utf8()
	{
		//line 28 "/usr/lib/haxe/std/haxe/Utf8.hx"
		haxe.Utf8.__hx_ctor_haxe_Utf8(this);
	}
	
	
	public static void __hx_ctor_haxe_Utf8(haxe.Utf8 __temp_me20)
	{
	}
	
	
	public static int compare(java.lang.String a, java.lang.String b)
	{
		//line 102 "/usr/lib/haxe/std/haxe/Utf8.hx"
		if (( a.compareTo(b) > 0 )) 
		{
			//line 102 "/usr/lib/haxe/std/haxe/Utf8.hx"
			return 1;
		}
		else
		{
			//line 102 "/usr/lib/haxe/std/haxe/Utf8.hx"
			if (haxe.lang.Runtime.valEq(a, b)) 
			{
				//line 102 "/usr/lib/haxe/std/haxe/Utf8.hx"
				return 0;
			}
			else
			{
				//line 102 "/usr/lib/haxe/std/haxe/Utf8.hx"
				return -1;
			}
			
		}
		
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 28 "/usr/lib/haxe/std/haxe/Utf8.hx"
		return new haxe.Utf8(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 28 "/usr/lib/haxe/std/haxe/Utf8.hx"
		return new haxe.Utf8();
	}
	
	
}


