// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
public class TS14 : global::haxe.lang.HxObject {
	
	public static void Main(){
		global::cs.Boot.init();
		main();
	}
	public TS14(global::haxe.lang.EmptyObject empty) {
	}
	
	
	public TS14() {
		global::TS14.__hx_ctor__TS14(this);
	}
	
	
	public static void __hx_ctor__TS14(global::TS14 __temp_me20) {
	}
	
	
	public static void addTests(global::utest.Runner runner) {
		runner.addCase(new global::thx.color.TestRgb(), null, null, null, null);
	}
	
	
	public static void main() {
		global::utest.Runner runner = new global::utest.Runner();
		global::TS14.addTests(runner);
		global::utest.ui.Report.create(runner, null, null);
		runner.run();
	}
	
	
	public static new object __hx_createEmpty() {
		return new global::TS14(global::haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static new object __hx_create(global::Array arr) {
		return new global::TS14();
	}
	
	
}

