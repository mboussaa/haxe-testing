// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace utest.ui.text {
	public class PrintReport : global::utest.ui.text.PlainTextReport {
		
		public PrintReport(global::haxe.lang.EmptyObject empty) : base(((global::haxe.lang.EmptyObject) (global::haxe.lang.EmptyObject.EMPTY) )) {
		}
		
		
		public PrintReport(global::utest.Runner runner) : base(global::haxe.lang.EmptyObject.EMPTY) {
			global::utest.ui.text.PrintReport.__hx_ctor_utest_ui_text_PrintReport(this, runner);
		}
		
		
		public static void __hx_ctor_utest_ui_text_PrintReport(global::utest.ui.text.PrintReport __temp_me161, global::utest.Runner runner) {
			global::utest.ui.text.PlainTextReport.__hx_ctor_utest_ui_text_PlainTextReport(__temp_me161, runner, ((global::haxe.lang.Function) (new global::haxe.lang.Closure(__temp_me161, "_handler", 2140014923)) ));
			__temp_me161.newline = "\n";
			__temp_me161.indent = "  ";
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::utest.ui.text.PrintReport(((global::haxe.lang.EmptyObject) (global::haxe.lang.EmptyObject.EMPTY) ));
		}
		
		
		public static new object __hx_create(global::Array arr) {
			return new global::utest.ui.text.PrintReport(((global::utest.Runner) (arr[0]) ));
		}
		
		
		public virtual void _handler(global::utest.ui.text.PlainTextReport report) {
			this._trace(report.getResults());
		}
		
		
		public virtual void _trace(string s) {
			unchecked {
				s = global::StringTools.replace(s, "  ", this.indent);
				s = global::StringTools.replace(s, "\n", this.newline);
				global::haxe.Log.trace.__hx_invoke2_o(default(double), s, default(double), new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"_trace", "utest.ui.text.PrintReport", "PrintReport.hx"}, new int[]{1981972957}, new double[]{((double) (57) )}));
			}
		}
		
		
		public override object __hx_getField(string field, int hash, bool throwErrors, bool isCheck, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 302437830:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "_trace", 302437830)) );
					}
					
					
					case 2140014923:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "_handler", 2140014923)) );
					}
					
					
					default:
					{
						return base.__hx_getField(field, hash, throwErrors, isCheck, handleProperties);
					}
					
				}
				
			}
		}
		
		
		public override object __hx_invokeField(string field, int hash, global::Array dynargs) {
			unchecked {
				switch (hash) {
					case 302437830:
					{
						this._trace(global::haxe.lang.Runtime.toString(dynargs[0]));
						break;
					}
					
					
					case 2140014923:
					{
						this._handler(((global::utest.ui.text.PlainTextReport) (dynargs[0]) ));
						break;
					}
					
					
					default:
					{
						return base.__hx_invokeField(field, hash, dynargs);
					}
					
				}
				
				return null;
			}
		}
		
		
	}
}


