// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Arrays_unzip_972__Fun<T2, T1> extends haxe.lang.Function
{
	public Arrays_unzip_972__Fun(haxe.root.Array<T2> a2, haxe.root.Array<T1> a1)
	{
		//line 972 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		super(1, 0);
		//line 972 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		this.a2 = a2;
		//line 972 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		this.a1 = a1;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 972 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		java.lang.Object t = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((java.lang.Object) (__fn_float1) )) : (((java.lang.Object) (__fn_dyn1) )) );
		//line 973 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		this.a1.push(((T1) (haxe.lang.Runtime.getField(t, "_0", true)) ));
		//line 974 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		this.a2.push(((T2) (haxe.lang.Runtime.getField(t, "_1", true)) ));
		//line 972 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		return null;
	}
	
	
	public haxe.root.Array<T2> a2;
	
	public haxe.root.Array<T1> a1;
	
}


