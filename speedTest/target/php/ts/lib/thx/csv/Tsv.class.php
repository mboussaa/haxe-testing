<?php

// Generated by Haxe 3.3.0
class thx_csv_Tsv {
	public function __construct(){}
	static $encodeOptions;
	static $decodeOptions;
	static function decode($csv) {
		return thx_csv_Dsv::decode($csv, thx_csv_Tsv::$decodeOptions);
	}
	static function decodeObjects($tsv) {
		$tmp = thx_csv_Dsv::decode($tsv, thx_csv_Tsv::$decodeOptions);
		return thx_csv_Dsv::arrayToObjects($tmp);
	}
	static function encode($data) {
		return thx_csv_Dsv::encode($data, thx_csv_Tsv::$encodeOptions);
	}
	static function encodeObjects($data) {
		return thx_csv_Dsv::encodeObjects($data, thx_csv_Tsv::$encodeOptions);
	}
	function __toString() { return 'thx.csv.Tsv'; }
}
thx_csv_Tsv::$encodeOptions = _hx_anonymous(array("delimiter" => "\x09", "quote" => "\"", "escapedQuote" => "\"\"", "newline" => "\x0A"));
thx_csv_Tsv::$decodeOptions = _hx_anonymous(array("delimiter" => "\x09", "quote" => "\"", "escapedQuote" => "\"\"", "trimValues" => false, "trimEmptyLines" => true));