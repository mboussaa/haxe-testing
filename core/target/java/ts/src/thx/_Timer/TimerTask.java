// Generated by Haxe 3.3.0
package thx._Timer;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TimerTask extends java.util.TimerTask
{
	public TimerTask(haxe.lang.Function callback)
	{
		//line 337 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Timer.hx"
		super();
		//line 338 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Timer.hx"
		this.callback = callback;
	}
	
	
	public haxe.lang.Function callback;
	
	@Override public void run()
	{
		//line 342 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Timer.hx"
		this.callback.__hx_invoke0_o();
	}
	
	
}

