// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Arrays_traverseOption_916__Fun_0<U> extends haxe.lang.Function
{
	public Arrays_traverseOption_916__Fun_0(haxe.root.Array<U> ux)
	{
		//line 916 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		super(1, 0);
		//line 916 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		this.ux = ux;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 916 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		U u = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((U) (((java.lang.Object) (__fn_float1) )) )) : (((U) (__fn_dyn1) )) );
		//line 916 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		this.ux.push(u);
		//line 916 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Arrays.hx"
		return this.ux;
	}
	
	
	public haxe.root.Array<U> ux;
	
}


