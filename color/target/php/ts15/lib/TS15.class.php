<?php

// Generated by Haxe 3.3.0
class TS15 {
	public function __construct(){}
	static function addTests($runner) {
		$runner->addCase(new thx_color_TestRgbx(), null, null, null, null);
	}
	static function main() {
		$runner = new utest_Runner();
		TS15::addTests($runner);
		utest_ui_Report::create($runner, null, null);
		$runner->run();
	}
	function __toString() { return 'TS15'; }
}