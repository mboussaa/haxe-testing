<?php

// Generated by Haxe 3.3.0
class TS4 {
	public function __construct(){}
	static function addTests($runner) {
		$w = "";
		{
			$_g = 0;
			$_g1 = Sys::args();
			while($_g < $_g1->length) {
				$arg = $_g1[$_g];
				++$_g;
				$w = $arg;
				unset($arg);
			}
		}
		haxe_Log::trace("The value of loop_wrapper is " . _hx_string_or_null($w), _hx_anonymous(array("fileName" => "TS4.hx", "lineNumber" => 18, "className" => "TS4", "methodName" => "addTests")));
		$x = Std::parseInt($w);
		$runner->addCase(new thx_format_TestFormat($x), null, null, null, null);
	}
	static function main() {
		$runner = new utest_Runner();
		TS4::addTests($runner);
		utest_ui_Report::create($runner, null, null);
		$runner->run();
	}
	function __toString() { return 'TS4'; }
}
