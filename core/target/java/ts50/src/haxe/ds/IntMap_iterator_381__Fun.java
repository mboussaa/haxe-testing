// Generated by Haxe 3.3.0
package haxe.ds;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class IntMap_iterator_381__Fun<T> extends haxe.lang.Function
{
	public IntMap_iterator_381__Fun(int[] i, haxe.ds.IntMap<T> _gthis)
	{
		//line 381 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
		super(0, 0);
		//line 381 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
		this.i = i;
		//line 381 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
		this._gthis = _gthis;
	}
	
	
	@Override public java.lang.Object __hx_invoke0_o()
	{
		//line 382 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
		T ret = this._gthis.vals[this.i[0]];
		//line 383 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
		this.i[0] = ( this.i[0] + 1 );
		//line 384 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
		return ret;
	}
	
	
	public int[] i;
	
	public haxe.ds.IntMap<T> _gthis;
	
}


