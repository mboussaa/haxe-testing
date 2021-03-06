<?php

// Generated by Haxe 3.3.0
class utest_ui_Report {
	public function __construct(){}
	static function create($runner, $displaySuccessResults = null, $headerDisplayMode = null) {
		$report = null;
		$tmp = !php_Web::$isModNeko;
		if($tmp) {
			$report = new utest_ui_text_PrintReport($runner, null);
		} else {
			$report = new utest_ui_text_HtmlReport($runner, null, true);
		}
		if(null === $displaySuccessResults) {
			$report->displaySuccessResults = utest_ui_common_SuccessResultsDisplayMode::$ShowSuccessResultsWithNoErrors;
		} else {
			$report->displaySuccessResults = $displaySuccessResults;
		}
		if(null === $headerDisplayMode) {
			$report->displayHeader = utest_ui_common_HeaderDisplayMode::$ShowHeaderWithResults;
		} else {
			$report->displayHeader = $headerDisplayMode;
		}
		return $report;
	}
	function __toString() { return 'utest.ui.Report'; }
}
