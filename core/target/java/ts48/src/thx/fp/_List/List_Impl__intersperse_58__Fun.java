// Generated by Haxe 3.3.0
package thx.fp._List;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class List_Impl__intersperse_58__Fun<A> extends haxe.lang.Function
{
	public List_Impl__intersperse_58__Fun(haxe.lang.Function[] go, A a)
	{
		//line 58 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
		super(1, 0);
		//line 58 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
		this.go = go;
		//line 58 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
		this.a = a;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 58 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
		thx.fp.ListImpl ls = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((thx.fp.ListImpl) (((java.lang.Object) (__fn_float1) )) )) : (((thx.fp.ListImpl) (__fn_dyn1) )) );
		//line 58 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
		switch (ls.index)
		{
			case 0:
			{
				//line 58 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
				return thx.fp.ListImpl.Nil;
			}
			
			
			case 1:
			{
				//line 59 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
				thx.fp.ListImpl xs = ((thx.fp.ListImpl) (ls.params[1]) );
				//line 59 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
				A x = ((A) (ls.params[0]) );
				//line 58 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
				return thx.fp.ListImpl.Cons(this.a, thx.fp.ListImpl.Cons(x, ((thx.fp.ListImpl) (this.go[0].__hx_invoke1_o(0.0, xs)) )));
			}
			
			
		}
		
		//line 58 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/List.hx"
		return null;
	}
	
	
	public haxe.lang.Function[] go;
	
	public A a;
	
}

