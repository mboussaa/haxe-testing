// Generated by Haxe 3.3.0
package thx._Path;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Path_Impl__asRelative_100__Fun extends haxe.lang.Function
{
	public Path_Impl__asRelative_100__Fun(boolean isAbsolute)
	{
		//line 100 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Path.hx"
		super(2, 0);
		//line 100 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Path.hx"
		this.isAbsolute = isAbsolute;
	}
	
	
	@Override public java.lang.Object __hx_invoke2_o(double __fn_float1, java.lang.Object __fn_dyn1, double __fn_float2, java.lang.Object __fn_dyn2)
	{
		//line 100 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Path.hx"
		java.lang.String s1 = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (haxe.lang.Runtime.toString(__fn_float2)) : (haxe.lang.Runtime.toString(__fn_dyn2)) );
		//line 100 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Path.hx"
		haxe.root.Array<java.lang.String> acc = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((haxe.root.Array<java.lang.String>) (((java.lang.Object) (__fn_float1) )) )) : (((haxe.root.Array<java.lang.String>) (__fn_dyn1) )) );
		//line 100 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Path.hx"
		if (( ( haxe.lang.Runtime.valEq(s1, "..") && ( acc.length > 0 ) ) &&  ! (haxe.lang.Runtime.valEq(haxe.lang.Runtime.toString(((haxe.root.Array<java.lang.String>) (acc) ).__get(( acc.length - 1 ))), ".."))  )) 
		{
			//line 100 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Path.hx"
			return acc.slice(0, ( acc.length - 1 ));
		}
		else
		{
			//line 100 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Path.hx"
			if (( haxe.lang.Runtime.valEq(s1, "..") && this.isAbsolute )) 
			{
				//line 100 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Path.hx"
				return acc;
			}
			else
			{
				//line 100 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Path.hx"
				return acc.concat(new haxe.root.Array<java.lang.String>(new java.lang.String[]{s1}));
			}
			
		}
		
	}
	
	
	public boolean isAbsolute;
	
}


