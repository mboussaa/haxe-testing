// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class Timer : global::haxe.lang.HxObject {
		
		static Timer() {
			global::thx.Timer.timers = new global::haxe.ds.IntMap<object>();
			global::thx.Timer._id = 0;
			global::thx.Timer.FRAME_RATE = global::Math.round(16.6666666666666679);
		}
		
		
		public Timer(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public Timer() {
			global::thx.Timer.__hx_ctor_thx_Timer(this);
		}
		
		
		public static void __hx_ctor_thx_Timer(global::thx.Timer __temp_me239) {
		}
		
		
		public static global::haxe.lang.Function debounce(global::haxe.lang.Function callback, int delayms, global::haxe.lang.Null<bool> leading) {
			bool __temp_leading237 = ( ( ! (leading.hasValue) ) ? (false) : ((leading).@value) );
			bool[] leading1 = new bool[]{__temp_leading237};
			global::haxe.lang.Function[] cancel = new global::haxe.lang.Function[]{((global::haxe.lang.Function) (new global::haxe.lang.Closure(typeof(global::thx.Functions), "noop", 1225397154)) )};
			global::haxe.lang.Function poll = new global::thx.Timer_debounce_29__Fun(delayms, cancel, callback);
			return new global::thx.Timer_debounce_33__Fun(poll, leading1, callback);
		}
		
		
		public static global::haxe.lang.Function throttle(global::haxe.lang.Function callback, int delayms, global::haxe.lang.Null<bool> leading) {
			bool __temp_leading238 = ( ( ! (leading.hasValue) ) ? (false) : ((leading).@value) );
			bool[] leading1 = new bool[]{__temp_leading238};
			bool[] waiting = new bool[]{false};
			global::haxe.lang.Function poll = new global::thx.Timer_throttle_49__Fun(waiting, delayms, callback);
			return new global::thx.Timer_throttle_53__Fun(waiting, poll, leading1, callback);
		}
		
		
		public static global::haxe.ds.IntMap<object> timers;
		
		public static int _id;
		
		public static global::haxe.lang.Function repeat(global::haxe.lang.Function callback, int delayms) {
			throw global::haxe.lang.HaxeException.wrap("platform does not support delays (Timer.repeat)");
		}
		
		
		public static global::haxe.lang.Function delay(global::haxe.lang.Function callback, int delayms) {
			throw global::haxe.lang.HaxeException.wrap("platform does not support delays (Timer.delay)");
		}
		
		
		public static global::haxe.lang.Function frame(global::haxe.lang.Function callback) {
			unchecked {
				double[] current = new double[]{((double) (global::System.Environment.TickCount) )};
				double[] next = new double[1];
				return global::thx.Timer.repeat(new global::thx.Timer_frame_171__Fun(next, current, callback), global::thx.Timer.FRAME_RATE);
			}
		}
		
		
		public static global::haxe.lang.Function nextFrame(global::haxe.lang.Function callback) {
			return global::thx.Timer.delay(callback, global::thx.Timer.FRAME_RATE);
		}
		
		
		public static int FRAME_RATE;
		
		public static global::haxe.lang.Function immediate(global::haxe.lang.Function callback) {
			return global::thx.Timer.delay(callback, 0);
		}
		
		
		public static void clear(object id) {
			throw global::haxe.lang.HaxeException.wrap("platform does not support delays (Timer.clear)");
		}
		
		
		public static double time() {
			return ((double) (global::System.Environment.TickCount) );
		}
		
		
		public static global::haxe.lang.Null<double> _resolution;
		
		public static double resolution() {
			if (global::thx.Timer._resolution.hasValue) {
				return (global::thx.Timer._resolution).@value;
			}
			
			double start = ((double) (global::System.Environment.TickCount) );
			double end = default(double);
			while (true) {
				end = ((double) (global::System.Environment.TickCount) );
				if ( ! ((( ( end - start ) == 0 ))) ) {
					break;
				}
				
			}
			
			return (global::thx.Timer._resolution = new global::haxe.lang.Null<double>(( end - start ), true)).@value;
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::thx.Timer(global::haxe.lang.EmptyObject.EMPTY);
		}
		
		
		public static new object __hx_create(global::Array arr) {
			return new global::thx.Timer();
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class Timer_debounce_29__Fun : global::haxe.lang.Function {
		
		public Timer_debounce_29__Fun(int delayms, global::haxe.lang.Function[] cancel, global::haxe.lang.Function callback) : base(0, 0) {
			this.delayms = delayms;
			this.cancel = cancel;
			this.callback = callback;
		}
		
		
		public override object __hx_invoke0_o() {
			this.cancel[0].__hx_invoke0_o();
			this.cancel[0] = global::thx.Timer.delay(this.callback, this.delayms);
			return null;
		}
		
		
		public int delayms;
		
		public global::haxe.lang.Function[] cancel;
		
		public global::haxe.lang.Function callback;
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class Timer_debounce_33__Fun : global::haxe.lang.Function {
		
		public Timer_debounce_33__Fun(global::haxe.lang.Function poll, bool[] leading1, global::haxe.lang.Function callback) : base(0, 0) {
			this.poll = poll;
			this.leading1 = leading1;
			this.callback = callback;
		}
		
		
		public override object __hx_invoke0_o() {
			if (this.leading1[0]) {
				this.leading1[0] = false;
				this.callback.__hx_invoke0_o();
			}
			
			this.poll.__hx_invoke0_o();
			return null;
		}
		
		
		public global::haxe.lang.Function poll;
		
		public bool[] leading1;
		
		public global::haxe.lang.Function callback;
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class Timer_throttle_49__Fun : global::haxe.lang.Function {
		
		public Timer_throttle_49__Fun(bool[] waiting, int delayms, global::haxe.lang.Function callback) : base(0, 0) {
			this.waiting = waiting;
			this.delayms = delayms;
			this.callback = callback;
		}
		
		
		public override object __hx_invoke0_o() {
			this.waiting[0] = true;
			global::thx.Timer.delay(this.callback, this.delayms);
			return null;
		}
		
		
		public bool[] waiting;
		
		public int delayms;
		
		public global::haxe.lang.Function callback;
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class Timer_throttle_53__Fun : global::haxe.lang.Function {
		
		public Timer_throttle_53__Fun(bool[] waiting, global::haxe.lang.Function poll, bool[] leading1, global::haxe.lang.Function callback) : base(0, 0) {
			this.waiting = waiting;
			this.poll = poll;
			this.leading1 = leading1;
			this.callback = callback;
		}
		
		
		public override object __hx_invoke0_o() {
			if (this.leading1[0]) {
				this.leading1[0] = false;
				this.callback.__hx_invoke0_o();
				return null;
			}
			
			if (this.waiting[0]) {
				return null;
			}
			
			this.poll.__hx_invoke0_o();
			return null;
		}
		
		
		public bool[] waiting;
		
		public global::haxe.lang.Function poll;
		
		public bool[] leading1;
		
		public global::haxe.lang.Function callback;
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class Timer_frame_171__Fun : global::haxe.lang.Function {
		
		public Timer_frame_171__Fun(double[] next, double[] current, global::haxe.lang.Function callback) : base(0, 0) {
			this.next = next;
			this.current = current;
			this.callback = callback;
		}
		
		
		public override object __hx_invoke0_o() {
			this.next[0] = ((double) (global::System.Environment.TickCount) );
			this.callback.__hx_invoke1_o(( this.next[0] - this.current[0] ), global::haxe.lang.Runtime.undefined);
			this.current[0] = this.next[0];
			return null;
		}
		
		
		public double[] next;
		
		public double[] current;
		
		public global::haxe.lang.Function callback;
		
	}
}

