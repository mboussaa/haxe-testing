// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
public class Sys : global::haxe.lang.HxObject {
	
	public Sys(global::haxe.lang.EmptyObject empty) {
	}
	
	
	public Sys() {
		global::Sys.__hx_ctor__Sys(this);
	}
	
	
	public static void __hx_ctor__Sys(global::Sys __temp_me20) {
	}
	
	
	public static readonly long epochTicks = new global::System.DateTime(1970, 1, 1).Ticks;
	
	public static double time() {
		return ( ((double) (((long) (( ((long) (global::System.DateTime.UtcNow.Ticks) ) - ((long) (global::Sys.epochTicks) ) )) )) ) / ((double) (global::System.TimeSpan.TicksPerSecond) ) );
	}
	
	
	public static new object __hx_createEmpty() {
		return new global::Sys(global::haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static new object __hx_create(global::Array arr) {
		return new global::Sys();
	}
	
	
}


