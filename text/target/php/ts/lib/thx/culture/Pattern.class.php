<?php

// Generated by Haxe 3.3.0
class thx_culture_Pattern {
	public function __construct(){}
	static $currencyNegatives;
	static $currencyPositives;
	static $numberNegatives;
	static $percentNegatives;
	static $percentPositives;
	function __toString() { return 'thx.culture.Pattern'; }
}
thx_culture_Pattern::$currencyNegatives = (new _hx_array(array("(\$n)", "-\$n", "\$-n", "\$n-", "(n\$)", "-n\$", "n-\$", "n\$-", "-n \$", "-\$ n", "n \$-", "\$ n-", "\$ -n", "n- \$", "(\$ n)", "(n \$)")));
thx_culture_Pattern::$currencyPositives = (new _hx_array(array("\$n", "n\$", "\$ n", "n \$")));
thx_culture_Pattern::$numberNegatives = (new _hx_array(array("(n)", "-n", "- n", "n-", "n -")));
thx_culture_Pattern::$percentNegatives = (new _hx_array(array("-n %", "-n%", "-%n", "%-n", "%n-", "n-%", "n%-", "-%n", "n %-", "% n-", "% -n", "n- %")));
thx_culture_Pattern::$percentPositives = (new _hx_array(array("n %", "n%", "%n", "% n")));
