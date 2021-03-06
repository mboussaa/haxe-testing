// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Timer extends haxe.lang.HxObject
{
	static
	{
		//line 68 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Timer.hx"
		thx.Timer.timers = new haxe.ds.IntMap<haxe.Timer>();
		//line 69 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Timer.hx"
		thx.Timer._id = 0;
		//line 210 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Timer.hx"
		thx.Timer.FRAME_RATE = ((int) (java.lang.Math.round(16.6666666666666679)) );
	}
	
	public Timer(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Timer()
	{
		//line 21 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Timer.hx"
		thx.Timer.__hx_ctor_thx_Timer(this);
	}
	
	
	public static void __hx_ctor_thx_Timer(thx.Timer __temp_me154)
	{
	}
	
	
	public static haxe.lang.Function debounce(haxe.lang.Function callback, int delayms, java.lang.Object leading)
	{
		//line 27 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Timer.hx"
		boolean __temp_leading152 = ( (haxe.lang.Runtime.eq(leading, null)) ? (false) : (haxe.lang.Runtime.toBool(leading)) );
		//line 27 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Timer.hx"
		boolean[] leading1 = new boolean[]{__temp_leading152};
		//line 28 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Timer.hx"
		haxe.lang.Function[] cancel = new haxe.lang.Function[]{((haxe.lang.Function) (new haxe.lang.Closure(thx.Functions.class, "noop")) )};
		//line 29 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Timer.hx"
		haxe.lang.Function poll = new thx.Timer_debounce_29__Fun(delayms, cancel, callback);
		//line 33 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Timer.hx"
		return new thx.Timer_debounce_33__Fun(poll, leading1, callback);
	}
	
	
	public static haxe.lang.Function throttle(haxe.lang.Function callback, int delayms, java.lang.Object leading)
	{
		//line 47 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Timer.hx"
		boolean __temp_leading153 = ( (haxe.lang.Runtime.eq(leading, null)) ? (false) : (haxe.lang.Runtime.toBool(leading)) );
		//line 47 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Timer.hx"
		boolean[] leading1 = new boolean[]{__temp_leading153};
		//line 48 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Timer.hx"
		boolean[] waiting = new boolean[]{false};
		//line 49 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Timer.hx"
		haxe.lang.Function poll = new thx.Timer_throttle_49__Fun(waiting, delayms, callback);
		//line 53 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Timer.hx"
		return new thx.Timer_throttle_53__Fun(waiting, poll, leading1, callback);
	}
	
	
	public static haxe.ds.IntMap<haxe.Timer> timers;
	
	public static int _id;
	
	public static haxe.lang.Function repeat(haxe.lang.Function callback, int delayms)
	{
		//line 84 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Timer.hx"
		java.util.concurrent.ScheduledExecutorService executorService = java.util.concurrent.Executors.newSingleThreadScheduledExecutor();
		//line 85 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Timer.hx"
		java.util.concurrent.ScheduledFuture handler = executorService.scheduleAtFixedRate(((java.lang.Runnable) (new thx._Timer.TimerTask(callback)) ), ((long) (delayms) ), ((long) (delayms) ), ((java.util.concurrent.TimeUnit) (java.util.concurrent.TimeUnit.MILLISECONDS) ));
		//line 86 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Timer.hx"
		haxe.lang.Function f = ((haxe.lang.Function) (new haxe.lang.Closure(handler, "cancel")) );
		//line 86 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Timer.hx"
		return new thx.Timer_repeat_86__Fun(f);
	}
	
	
	public static haxe.lang.Function delay(haxe.lang.Function callback, int delayms)
	{
		//line 110 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Timer.hx"
		java.util.concurrent.ScheduledExecutorService executorService = java.util.concurrent.Executors.newSingleThreadScheduledExecutor();
		//line 111 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Timer.hx"
		java.util.concurrent.ScheduledFuture handler = executorService.schedule(((java.lang.Runnable) (new thx._Timer.TimerTask(callback)) ), ((long) (delayms) ), ((java.util.concurrent.TimeUnit) (java.util.concurrent.TimeUnit.MILLISECONDS) ));
		//line 112 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Timer.hx"
		haxe.lang.Function f = ((haxe.lang.Function) (new haxe.lang.Closure(handler, "cancel")) );
		//line 112 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Timer.hx"
		return new thx.Timer_delay_112__Fun(f);
	}
	
	
	public static haxe.lang.Function frame(haxe.lang.Function callback)
	{
		//line 169 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Timer.hx"
		double[] current = new double[]{((double) (( ((double) (java.lang.System.nanoTime()) ) / 1000000.0 )) )};
		//line 169 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Timer.hx"
		double[] next = new double[1];
		//line 169 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Timer.hx"
		haxe.lang.Function listener = new thx.Timer_frame_171__Fun(next, current, callback);
		//line 176 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Timer.hx"
		return thx.Timer.repeat(listener, thx.Timer.FRAME_RATE);
	}
	
	
	public static haxe.lang.Function nextFrame(haxe.lang.Function callback)
	{
		//line 206 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Timer.hx"
		return thx.Timer.delay(callback, thx.Timer.FRAME_RATE);
	}
	
	
	public static int FRAME_RATE;
	
	public static haxe.lang.Function immediate(haxe.lang.Function callback)
	{
		//line 222 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Timer.hx"
		return thx.Timer.delay(callback, 1);
	}
	
	
	public static void clear(java.lang.Object id)
	{
		//line 235 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Timer.hx"
		throw haxe.lang.HaxeException.wrap("platform does not support delays (Timer.clear)");
	}
	
	
	public static double time()
	{
		//line 260 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Timer.hx"
		return ( ((double) (java.lang.System.nanoTime()) ) / 1000000.0 );
	}
	
	
	public static java.lang.Object _resolution;
	
	public static double resolution()
	{
		//line 271 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Timer.hx"
		if (( ! (( null == thx.Timer._resolution )) )) 
		{
			//line 272 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Timer.hx"
			return ((double) (haxe.lang.Runtime.toDouble(thx.Timer._resolution)) );
		}
		
		//line 273 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Timer.hx"
		double start = ( ((double) (java.lang.System.nanoTime()) ) / 1000000.0 );
		//line 273 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Timer.hx"
		double end = 0.0;
		//line 275 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Timer.hx"
		while (true)
		{
			//line 277 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Timer.hx"
			end = ( ((double) (java.lang.System.nanoTime()) ) / 1000000.0 );
			//line 275 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Timer.hx"
			if ( ! ((( ( end - start ) == 0 ))) ) 
			{
				//line 275 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Timer.hx"
				break;
			}
			
		}
		
		//line 279 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Timer.hx"
		return ((double) (haxe.lang.Runtime.toDouble(thx.Timer._resolution = ( end - start ))) );
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 21 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Timer.hx"
		return new thx.Timer(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 21 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/Timer.hx"
		return new thx.Timer();
	}
	
	
}


