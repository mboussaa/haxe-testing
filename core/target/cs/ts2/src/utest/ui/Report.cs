// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace utest.ui {
	public class Report : global::haxe.lang.HxObject {
		
		public Report(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public Report() {
			global::utest.ui.Report.__hx_ctor_utest_ui_Report(this);
		}
		
		
		public static void __hx_ctor_utest_ui_Report(global::utest.ui.Report __temp_me48) {
		}
		
		
		public static global::utest.ui.common.IReport create(global::utest.Runner runner, global::utest.ui.common.SuccessResultsDisplayMode displaySuccessResults, global::utest.ui.common.HeaderDisplayMode headerDisplayMode) {
			global::utest.ui.common.IReport report = new global::utest.ui.text.PrintReport(((global::utest.Runner) (runner) ));
			if (( null == displaySuccessResults )) {
				global::haxe.lang.Runtime.setField(report, "displaySuccessResults", 641357653, global::utest.ui.common.SuccessResultsDisplayMode.ShowSuccessResultsWithNoErrors);
			}
			else {
				global::haxe.lang.Runtime.setField(report, "displaySuccessResults", 641357653, displaySuccessResults);
			}
			
			if (( null == headerDisplayMode )) {
				global::haxe.lang.Runtime.setField(report, "displayHeader", 1046660463, global::utest.ui.common.HeaderDisplayMode.ShowHeaderWithResults);
			}
			else {
				global::haxe.lang.Runtime.setField(report, "displayHeader", 1046660463, headerDisplayMode);
			}
			
			return report;
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::utest.ui.Report(global::haxe.lang.EmptyObject.EMPTY);
		}
		
		
		public static new object __hx_create(global::Array arr) {
			return new global::utest.ui.Report();
		}
		
		
	}
}


