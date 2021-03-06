<?php

// Generated by Haxe 3.3.0
class utest_ui_common_ReportTools {
	public function __construct(){}
	static function hasHeader($report, $stats) {
		switch($report->displayHeader->index) {
		case 0:{
			return true;
		}break;
		case 1:{
			return false;
		}break;
		case 2:{
			if(!$stats->isOk) {
				return true;
			}
			switch($report->displaySuccessResults->index) {
			case 0:case 2:{
				return true;
			}break;
			case 1:{
				return false;
			}break;
			}
		}break;
		}
	}
	static function skipResult($report, $stats, $isOk) {
		if(!$stats->isOk) {
			return false;
		}
		switch($report->displaySuccessResults->index) {
		case 0:{
			return false;
		}break;
		case 1:{
			return true;
		}break;
		case 2:{
			return !$isOk;
		}break;
		}
	}
	static function hasOutput($report, $stats) {
		if(!$stats->isOk) {
			return true;
		}
		return utest_ui_common_ReportTools::hasHeader($report, $stats);
	}
	function __toString() { return 'utest.ui.common.ReportTools'; }
}
