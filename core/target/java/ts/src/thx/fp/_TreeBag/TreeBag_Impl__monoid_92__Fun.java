// Generated by Haxe 3.3.0
package thx.fp._TreeBag;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TreeBag_Impl__monoid_92__Fun<A> extends haxe.lang.Function
{
	public TreeBag_Impl__monoid_92__Fun()
	{
		//line 92 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/TreeBag.hx"
		super(2, 0);
	}
	
	
	@Override public java.lang.Object __hx_invoke2_o(double __fn_float1, java.lang.Object __fn_dyn1, double __fn_float2, java.lang.Object __fn_dyn2)
	{
		//line 92 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/TreeBag.hx"
		thx.fp.TreeBagImpl r = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (((thx.fp.TreeBagImpl) (((java.lang.Object) (__fn_float2) )) )) : (((thx.fp.TreeBagImpl) (__fn_dyn2) )) );
		//line 92 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/TreeBag.hx"
		thx.fp.TreeBagImpl l = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((thx.fp.TreeBagImpl) (((java.lang.Object) (__fn_float1) )) )) : (((thx.fp.TreeBagImpl) (__fn_dyn1) )) );
		//line 92 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/TreeBag.hx"
		switch (((thx.fp.TreeBagImpl) (l) ).index)
		{
			case 0:
			{
				//line 92 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/TreeBag.hx"
				switch (r.index)
				{
					case 0:
					{
						//line 92 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/TreeBag.hx"
						return thx.fp.TreeBagImpl.Empty;
					}
					
					
					default:
					{
						//line 92 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/TreeBag.hx"
						return r;
					}
					
				}
				
			}
			
			
			case 1:
			{
				//line 92 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/TreeBag.hx"
				switch (r.index)
				{
					case 0:
					{
						//line 92 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/TreeBag.hx"
						return ((thx.fp.TreeBagImpl) (l) );
					}
					
					
					default:
					{
						//line 92 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/TreeBag.hx"
						switch (((thx.fp.TreeBagImpl) (((thx.fp.TreeBagImpl) (l) ).params[1]) ).index)
						{
							case 0:
							{
								//line 92 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/TreeBag.hx"
								A x = ((A) (((thx.fp.TreeBagImpl) (l) ).params[0]) );
								//line 92 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/TreeBag.hx"
								return thx.fp.TreeBagImpl.Cons(x, r);
							}
							
							
							default:
							{
								//line 92 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/TreeBag.hx"
								return thx.fp.TreeBagImpl.Branch(((thx.fp.TreeBagImpl) (l) ), r);
							}
							
						}
						
					}
					
				}
				
			}
			
			
			default:
			{
				//line 92 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/TreeBag.hx"
				switch (r.index)
				{
					case 0:
					{
						//line 92 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/TreeBag.hx"
						return ((thx.fp.TreeBagImpl) (l) );
					}
					
					
					default:
					{
						//line 92 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/fp/TreeBag.hx"
						return thx.fp.TreeBagImpl.Branch(((thx.fp.TreeBagImpl) (l) ), r);
					}
					
				}
				
			}
			
		}
		
	}
	
	
}


