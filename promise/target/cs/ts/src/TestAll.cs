// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
public class TestAll : global::haxe.lang.HxObject {
	
	public static void Main(){
		global::cs.Boot.init();
		main();
	}
	public TestAll(global::haxe.lang.EmptyObject empty) {
	}
	
	
	public TestAll() {
		global::TestAll.__hx_ctor__TestAll(this);
	}
	
	
	public static void __hx_ctor__TestAll(global::TestAll __temp_me20) {
	}
	
	
	public static void main() {
		global::utest.Runner runner = new global::utest.Runner();
		runner.addCase(new global::thx.promise.TestFuture(), null, null, null, null);
		runner.addCase(new global::thx.promise.TestPromise(), null, null, null, null);
		runner.addCase(new global::thx.promise.TestTryPromise(), null, null, null, null);
		global::utest.ui.Report.create(runner, null, null);
		runner.run();
	}
	
	
	public static new object __hx_createEmpty() {
		return new global::TestAll(global::haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static new object __hx_create(global::Array arr) {
		return new global::TestAll();
	}
	
	
}


