// Generated by Haxe 3.3.0
package nanotest;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class NanoTestCase_run_43__Fun extends haxe.lang.Function
{
	public NanoTestCase_run_43__Fun(haxe.root.Array<java.lang.Object> results, haxe.lang.Function print, nanotest.NanoTestCase _gthis)
	{
		//line 43 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestCase.hx"
		super(0, 0);
		//line 43 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestCase.hx"
		this.results = results;
		//line 43 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestCase.hx"
		this.print = print;
		//line 43 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestCase.hx"
		this._gthis = _gthis;
	}
	
	
	@Override public java.lang.Object __hx_invoke0_o()
	{
		//line 44 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestCase.hx"
		if (haxe.lang.Runtime.toBool(haxe.lang.Runtime.getField(this._gthis.currentResult, "error", true))) 
		{
			//line 45 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestCase.hx"
			this.print.__hx_invoke1_o(0.0, "E");
		}
		else
		{
			//line 46 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestCase.hx"
			if (haxe.lang.Runtime.toBool(haxe.lang.Runtime.getField(this._gthis.currentResult, "failed", true))) 
			{
				//line 47 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestCase.hx"
				this.print.__hx_invoke1_o(0.0, "F");
			}
			else
			{
				//line 49 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestCase.hx"
				this.print.__hx_invoke1_o(0.0, ".");
			}
			
		}
		
		//line 51 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestCase.hx"
		this.results.push(this._gthis.currentResult);
		//line 52 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestCase.hx"
		this._gthis.currentResult = null;
		//line 43 "/usr/lib/haxe/lib/nanotest/1,0,0/nanotest/NanoTestCase.hx"
		return null;
	}
	
	
	public haxe.root.Array<java.lang.Object> results;
	
	public haxe.lang.Function print;
	
	public nanotest.NanoTestCase _gthis;
	
}


