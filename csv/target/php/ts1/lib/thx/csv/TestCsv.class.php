<?php

// Generated by Haxe 3.3.0
class thx_csv_TestCsv {
	public function __construct($i) {
		if(!php_Boot::$skip_constructor) {
		$this->x = $i;
	}}
	public $x;
	public function testEncode() {
		$_g1 = 0;
		$_g = $this->x;
		while($_g1 < $_g) {
			++$_g1;
			$tmp = thx_csv_Dsv::encode((new _hx_array(array((new _hx_array(array("1997", "Ford", "E350")))))), thx_csv_Csv::$encodeOptions);
			utest_Assert::same("1997,Ford,E350", $tmp, null, null, null, _hx_anonymous(array("fileName" => "TestCsv.hx", "lineNumber" => 13, "className" => "thx.csv.TestCsv", "methodName" => "testEncode")));
			$tmp1 = thx_csv_Dsv::encode((new _hx_array(array((new _hx_array(array("1997", "Ford", "E350", "Super, luxurious truck")))))), thx_csv_Csv::$encodeOptions);
			utest_Assert::same("1997,Ford,E350,\"Super, luxurious truck\"", $tmp1, null, null, null, _hx_anonymous(array("fileName" => "TestCsv.hx", "lineNumber" => 14, "className" => "thx.csv.TestCsv", "methodName" => "testEncode")));
			$tmp2 = thx_csv_Dsv::encode((new _hx_array(array((new _hx_array(array("1997", "Ford", "E350", "Super, \"luxurious\" truck")))))), thx_csv_Csv::$encodeOptions);
			utest_Assert::same("1997,Ford,E350,\"Super, \"\"luxurious\"\" truck\"", $tmp2, null, null, null, _hx_anonymous(array("fileName" => "TestCsv.hx", "lineNumber" => 15, "className" => "thx.csv.TestCsv", "methodName" => "testEncode")));
			$tmp3 = thx_csv_Dsv::encode((new _hx_array(array((new _hx_array(array("1997", "Ford", "E350", "Go get one now\x0Athey are going fast")))))), thx_csv_Csv::$encodeOptions);
			utest_Assert::same("1997,Ford,E350,\"Go get one now\x0Athey are going fast\"", $tmp3, null, null, null, _hx_anonymous(array("fileName" => "TestCsv.hx", "lineNumber" => 16, "className" => "thx.csv.TestCsv", "methodName" => "testEncode")));
			unset($tmp3,$tmp2,$tmp1,$tmp);
		}
	}
	public function testDecode() {
		$_g1 = 0;
		$_g = $this->x;
		while($_g1 < $_g) {
			++$_g1;
			$tmp = thx_csv_Dsv::decode("", thx_csv_Csv::$decodeOptions);
			utest_Assert::same((new _hx_array(array())), $tmp, null, null, null, _hx_anonymous(array("fileName" => "TestCsv.hx", "lineNumber" => 21, "className" => "thx.csv.TestCsv", "methodName" => "testDecode")));
			$tmp1 = thx_csv_Dsv::decode(",", thx_csv_Csv::$decodeOptions);
			utest_Assert::same((new _hx_array(array((new _hx_array(array("", "")))))), $tmp1, null, null, null, _hx_anonymous(array("fileName" => "TestCsv.hx", "lineNumber" => 22, "className" => "thx.csv.TestCsv", "methodName" => "testDecode")));
			$tmp2 = thx_csv_Dsv::decode("f,", thx_csv_Csv::$decodeOptions);
			utest_Assert::same((new _hx_array(array((new _hx_array(array("f", "")))))), $tmp2, null, null, null, _hx_anonymous(array("fileName" => "TestCsv.hx", "lineNumber" => 23, "className" => "thx.csv.TestCsv", "methodName" => "testDecode")));
			$tmp3 = thx_csv_Dsv::decode(",f", thx_csv_Csv::$decodeOptions);
			utest_Assert::same((new _hx_array(array((new _hx_array(array("", "f")))))), $tmp3, null, null, null, _hx_anonymous(array("fileName" => "TestCsv.hx", "lineNumber" => 24, "className" => "thx.csv.TestCsv", "methodName" => "testDecode")));
			$tmp4 = thx_csv_Dsv::decode("x,y", thx_csv_Csv::$decodeOptions);
			utest_Assert::same((new _hx_array(array((new _hx_array(array("x", "y")))))), $tmp4, null, null, null, _hx_anonymous(array("fileName" => "TestCsv.hx", "lineNumber" => 25, "className" => "thx.csv.TestCsv", "methodName" => "testDecode")));
			$tmp5 = thx_csv_Dsv::decode(",\x0A,", thx_csv_Csv::$decodeOptions);
			utest_Assert::same((new _hx_array(array((new _hx_array(array("", ""))), (new _hx_array(array("", "")))))), $tmp5, null, null, null, _hx_anonymous(array("fileName" => "TestCsv.hx", "lineNumber" => 26, "className" => "thx.csv.TestCsv", "methodName" => "testDecode")));
			$tmp6 = thx_csv_Dsv::decode(",\x0A\x0A,", thx_csv_Csv::$decodeOptions);
			utest_Assert::same((new _hx_array(array((new _hx_array(array("", ""))), (new _hx_array(array(""))), (new _hx_array(array("", "")))))), $tmp6, null, null, null, _hx_anonymous(array("fileName" => "TestCsv.hx", "lineNumber" => 27, "className" => "thx.csv.TestCsv", "methodName" => "testDecode")));
			$tmp7 = thx_csv_Dsv::decode(",\x0A\"\"\x0A,", thx_csv_Csv::$decodeOptions);
			utest_Assert::same((new _hx_array(array((new _hx_array(array("", ""))), (new _hx_array(array(""))), (new _hx_array(array("", "")))))), $tmp7, null, null, null, _hx_anonymous(array("fileName" => "TestCsv.hx", "lineNumber" => 28, "className" => "thx.csv.TestCsv", "methodName" => "testDecode")));
			utest_Assert::same((new _hx_array(array((new _hx_array(array("1997", "Ford", "E350")))))), (new _hx_array(array((new _hx_array(array("1997", "Ford", "E350")))))), null, null, null, _hx_anonymous(array("fileName" => "TestCsv.hx", "lineNumber" => 29, "className" => "thx.csv.TestCsv", "methodName" => "testDecode")));
			$tmp8 = thx_csv_Dsv::decode("1997,Ford,E350", thx_csv_Csv::$decodeOptions);
			utest_Assert::same((new _hx_array(array((new _hx_array(array("1997", "Ford", "E350")))))), $tmp8, null, null, null, _hx_anonymous(array("fileName" => "TestCsv.hx", "lineNumber" => 30, "className" => "thx.csv.TestCsv", "methodName" => "testDecode")));
			$tmp9 = thx_csv_Dsv::decode("\"1997\",\"Ford\",\"E350\"", thx_csv_Csv::$decodeOptions);
			utest_Assert::same((new _hx_array(array((new _hx_array(array("1997", "Ford", "E350")))))), $tmp9, null, null, null, _hx_anonymous(array("fileName" => "TestCsv.hx", "lineNumber" => 31, "className" => "thx.csv.TestCsv", "methodName" => "testDecode")));
			$tmp10 = thx_csv_Dsv::decode("1997,Ford,E350,\"Super, luxurious truck\"", thx_csv_Csv::$decodeOptions);
			utest_Assert::same((new _hx_array(array((new _hx_array(array("1997", "Ford", "E350", "Super, luxurious truck")))))), $tmp10, null, null, null, _hx_anonymous(array("fileName" => "TestCsv.hx", "lineNumber" => 32, "className" => "thx.csv.TestCsv", "methodName" => "testDecode")));
			$tmp11 = thx_csv_Dsv::decode("1997,Ford,E350,\"Super, \"\"luxurious\"\" truck\"", thx_csv_Csv::$decodeOptions);
			utest_Assert::same((new _hx_array(array((new _hx_array(array("1997", "Ford", "E350", "Super, \"luxurious\" truck")))))), $tmp11, null, null, null, _hx_anonymous(array("fileName" => "TestCsv.hx", "lineNumber" => 33, "className" => "thx.csv.TestCsv", "methodName" => "testDecode")));
			$tmp12 = thx_csv_Dsv::decode("1997,Ford,E350,\"Go get one now\x0Athey are going fast\"", thx_csv_Csv::$decodeOptions);
			utest_Assert::same((new _hx_array(array((new _hx_array(array("1997", "Ford", "E350", "Go get one now\x0Athey are going fast")))))), $tmp12, null, null, null, _hx_anonymous(array("fileName" => "TestCsv.hx", "lineNumber" => 34, "className" => "thx.csv.TestCsv", "methodName" => "testDecode")));
			unset($tmp9,$tmp8,$tmp7,$tmp6,$tmp5,$tmp4,$tmp3,$tmp2,$tmp12,$tmp11,$tmp10,$tmp1,$tmp);
		}
	}
	public function testIssue20160125() {
		$_g1 = 0;
		$_g = $this->x;
		while($_g1 < $_g) {
			++$_g1;
			$decoded = thx_csv_Dsv::decode("265671209,\"Dynagreen Environmental Protection Group Co., Ltd.\",1330,China,HKD,", thx_csv_Csv::$decodeOptions);
			$encoded = thx_csv_Dsv::encode($decoded, thx_csv_Csv::$encodeOptions);
			utest_Assert::same((new _hx_array(array((new _hx_array(array("265671209", "Dynagreen Environmental Protection Group Co., Ltd.", "1330", "China", "HKD", "")))))), $decoded, null, null, null, _hx_anonymous(array("fileName" => "TestCsv.hx", "lineNumber" => 42, "className" => "thx.csv.TestCsv", "methodName" => "testIssue20160125")));
			utest_Assert::same("265671209,\"Dynagreen Environmental Protection Group Co., Ltd.\",1330,China,HKD,", $encoded, null, null, null, _hx_anonymous(array("fileName" => "TestCsv.hx", "lineNumber" => 45, "className" => "thx.csv.TestCsv", "methodName" => "testIssue20160125")));
			unset($encoded,$decoded);
		}
	}
	public function testTerminalComma() {
		$_g1 = 0;
		$_g = $this->x;
		while($_g1 < $_g) {
			++$_g1;
			$decoded = thx_csv_Dsv::decode("Company ID,Name,Ticker,Country,Currency,\x0A24085,1-800-Flowers.com Inc.,FLWS,United States,USD,", thx_csv_Csv::$decodeOptions);
			$encoded = thx_csv_Dsv::encode($decoded, thx_csv_Csv::$encodeOptions);
			utest_Assert::same((new _hx_array(array((new _hx_array(array("Company ID", "Name", "Ticker", "Country", "Currency", ""))), (new _hx_array(array("24085", "1-800-Flowers.com Inc.", "FLWS", "United States", "USD", "")))))), $decoded, null, null, null, _hx_anonymous(array("fileName" => "TestCsv.hx", "lineNumber" => 54, "className" => "thx.csv.TestCsv", "methodName" => "testTerminalComma")));
			utest_Assert::same("Company ID,Name,Ticker,Country,Currency,\x0A24085,1-800-Flowers.com Inc.,FLWS,United States,USD,", $encoded, null, null, null, _hx_anonymous(array("fileName" => "TestCsv.hx", "lineNumber" => 58, "className" => "thx.csv.TestCsv", "methodName" => "testTerminalComma")));
			unset($encoded,$decoded);
		}
	}
	public function testRoundtrip() {
		$_g1 = 0;
		$_g = $this->x;
		while($_g1 < $_g) {
			++$_g1;
			$decoded = thx_csv_Dsv::decode("Year,Make,Model,Description,Price\x0A1997,Ford,E350,\"ac, abs, moon\",3000.00\x0A1999,Chevy,\"Venture \"\"Extended Edition\"\"\",\"\",4900.00\x0A1999,Chevy,\"Venture \"\"Extended Edition, Very Large\"\"\",,5000.00\x0A1996,Jeep,Grand Cherokee,\"MUST SELL!\x0Aair, moon roof, loaded\",4799.00", thx_csv_Csv::$decodeOptions);
			$encoded = thx_csv_Dsv::encode($decoded, thx_csv_Csv::$encodeOptions);
			utest_Assert::same((new _hx_array(array((new _hx_array(array("Year", "Make", "Model", "Description", "Price"))), (new _hx_array(array("1997", "Ford", "E350", "ac, abs, moon", "3000.00"))), (new _hx_array(array("1999", "Chevy", "Venture \"Extended Edition\"", "", "4900.00"))), (new _hx_array(array("1999", "Chevy", "Venture \"Extended Edition, Very Large\"", "", "5000.00"))), (new _hx_array(array("1996", "Jeep", "Grand Cherokee", "MUST SELL!\x0Aair, moon roof, loaded", "4799.00")))))), $decoded, null, null, null, _hx_anonymous(array("fileName" => "TestCsv.hx", "lineNumber" => 72, "className" => "thx.csv.TestCsv", "methodName" => "testRoundtrip")));
			utest_Assert::same("Year,Make,Model,Description,Price\x0A1997,Ford,E350,\"ac, abs, moon\",3000.00\x0A1999,Chevy,\"Venture \"\"Extended Edition\"\"\",,4900.00\x0A1999,Chevy,\"Venture \"\"Extended Edition, Very Large\"\"\",,5000.00\x0A1996,Jeep,Grand Cherokee,\"MUST SELL!\x0Aair, moon roof, loaded\",4799.00", $encoded, null, null, null, _hx_anonymous(array("fileName" => "TestCsv.hx", "lineNumber" => 79, "className" => "thx.csv.TestCsv", "methodName" => "testRoundtrip")));
			unset($encoded,$decoded);
		}
	}
	public function testSemicolon() {
		$_g1 = 0;
		$_g = $this->x;
		while($_g1 < $_g) {
			++$_g1;
			$encoded = thx_csv_Dsv::decode("Year;Make;Model;Length\x0A1997;Ford;E350;2,34\x0A2000;Mercury;Cougar;2,38", _hx_anonymous(array("quote" => "\"", "escapedQuote" => "\"\"", "delimiter" => ";", "trimValues" => false)));
			$decoded = thx_csv_Dsv::encode($encoded, _hx_anonymous(array("quote" => "\"", "escapedQuote" => "\"\"", "delimiter" => ";", "newline" => "\x0A")));
			utest_Assert::equals("Year;Make;Model;Length\x0A1997;Ford;E350;2,34\x0A2000;Mercury;Cougar;2,38", $decoded, null, _hx_anonymous(array("fileName" => "TestCsv.hx", "lineNumber" => 94, "className" => "thx.csv.TestCsv", "methodName" => "testSemicolon")));
			unset($encoded,$decoded);
		}
	}
	public function testAutoTrim() {
		$_g1 = 0;
		$_g = $this->x;
		while($_g1 < $_g) {
			++$_g1;
			$encoded = thx_csv_Dsv::decode("1997 , Ford, E350", _hx_anonymous(array("quote" => "\"", "escapedQuote" => "\"\"", "delimiter" => ",", "trimValues" => true)));
			utest_Assert::same((new _hx_array(array((new _hx_array(array("1997", "Ford", "E350")))))), $encoded, null, null, null, _hx_anonymous(array("fileName" => "TestCsv.hx", "lineNumber" => 101, "className" => "thx.csv.TestCsv", "methodName" => "testAutoTrim")));
			$encoded = thx_csv_Dsv::decode("1997 , Ford, E350", _hx_anonymous(array("quote" => "\"", "escapedQuote" => "\"\"", "delimiter" => ",", "trimValues" => false)));
			utest_Assert::same((new _hx_array(array((new _hx_array(array("1997 ", " Ford", " E350")))))), $encoded, null, null, null, _hx_anonymous(array("fileName" => "TestCsv.hx", "lineNumber" => 103, "className" => "thx.csv.TestCsv", "methodName" => "testAutoTrim")));
			$tmp = thx_csv_Dsv::decode("1997,Ford,E350,\" Super, luxurious truck \"", thx_csv_Csv::$decodeOptions);
			utest_Assert::same((new _hx_array(array((new _hx_array(array("1997", "Ford", "E350", " Super, luxurious truck ")))))), $tmp, null, null, null, _hx_anonymous(array("fileName" => "TestCsv.hx", "lineNumber" => 104, "className" => "thx.csv.TestCsv", "methodName" => "testAutoTrim")));
			unset($tmp,$encoded);
		}
	}
	public function testSurroundingWhitespaces() {
		$_g1 = 0;
		$_g = $this->x;
		while($_g1 < $_g) {
			++$_g1;
			$tmp = thx_csv_Dsv::decode("1997, \"Ford\" ,E350", thx_csv_Csv::$decodeOptions);
			utest_Assert::same((new _hx_array(array((new _hx_array(array("1997", " \"Ford\" ", "E350")))))), $tmp, null, null, null, _hx_anonymous(array("fileName" => "TestCsv.hx", "lineNumber" => 109, "className" => "thx.csv.TestCsv", "methodName" => "testSurroundingWhitespaces")));
			unset($tmp);
		}
	}
	public function testTsv() {
		$_g1 = 0;
		$_g = $this->x;
		while($_g1 < $_g) {
			++$_g1;
			$tmp = thx_csv_Dsv::decode("1997   Ford    E350", thx_csv_Tsv::$decodeOptions);
			utest_Assert::same((new _hx_array(array((new _hx_array(array("1997 ", " Ford ", " E350")))))), $tmp, null, null, null, _hx_anonymous(array("fileName" => "TestCsv.hx", "lineNumber" => 114, "className" => "thx.csv.TestCsv", "methodName" => "testTsv")));
			unset($tmp);
		}
	}
	public function __call($m, $a) {
		if(isset($this->$m) && is_callable($this->$m))
			return call_user_func_array($this->$m, $a);
		else if(isset($this->__dynamics[$m]) && is_callable($this->__dynamics[$m]))
			return call_user_func_array($this->__dynamics[$m], $a);
		else if('toString' == $m)
			return $this->__toString();
		else
			throw new HException('Unable to call <'.$m.'>');
	}
	function __toString() { return 'thx.csv.TestCsv'; }
}