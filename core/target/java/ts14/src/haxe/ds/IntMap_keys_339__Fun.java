// Generated by Haxe 3.3.0
package haxe.ds;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class IntMap_keys_339__Fun<T> extends haxe.lang.Function
{
	public IntMap_keys_339__Fun(int len, int[] i, haxe.ds.IntMap<T> _gthis)
	{
		//line 339 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
		super(0, 0);
		//line 339 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
		this.len = len;
		//line 339 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
		this.i = i;
		//line 339 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
		this._gthis = _gthis;
	}
	
	
	@Override public java.lang.Object __hx_invoke0_o()
	{
		//line 340 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
		{
			//line 340 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			int _g1 = this.i[0];
			//line 340 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			int _g = this.len;
			//line 340 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			while (( _g1 < _g ))
			{
				//line 340 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
				int j = _g1++;
				//line 342 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
				if (( (( ( this._gthis.flags[( j >> 4 )] >>> (( (( j & 15 )) << 1 )) ) & 3 )) == 0 )) 
				{
					//line 344 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					this.i[0] = j;
					//line 345 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					return true;
				}
				
			}
			
		}
		
		//line 348 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
		return false;
	}
	
	
	public int len;
	
	public int[] i;
	
	public haxe.ds.IntMap<T> _gthis;
	
}

