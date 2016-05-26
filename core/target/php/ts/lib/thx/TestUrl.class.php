<?php

// Generated by Haxe 3.3.0
class thx_TestUrl {
	public function __construct() {}
	public function testBasics() {
		$url = thx__Url_Url_Impl_::fromString("http://user:password@www.example.com:8888/some/path/name.ext?a=b&c=d#hashtag/is/here");
		utest_Assert::equals("http", $url->protocol, null, _hx_anonymous(array("fileName" => "TestUrl.hx", "lineNumber" => 11, "className" => "thx.TestUrl", "methodName" => "testBasics")));
		utest_Assert::equals("user:password", $url->auth, null, _hx_anonymous(array("fileName" => "TestUrl.hx", "lineNumber" => 12, "className" => "thx.TestUrl", "methodName" => "testBasics")));
		$tmp = null;
		if($url->port !== null) {
			$tmp = ":" . _hx_string_rec($url->port, "");
		} else {
			$tmp = "";
		}
		utest_Assert::equals("www.example.com:8888", _hx_string_or_null($url->hostName) . _hx_string_or_null($tmp), null, _hx_anonymous(array("fileName" => "TestUrl.hx", "lineNumber" => 13, "className" => "thx.TestUrl", "methodName" => "testBasics")));
		utest_Assert::equals("www.example.com", $url->hostName, null, _hx_anonymous(array("fileName" => "TestUrl.hx", "lineNumber" => 14, "className" => "thx.TestUrl", "methodName" => "testBasics")));
		$tmp1 = null;
		$tmp2 = null;
		$tmp3 = null;
		if($url->search === null) {
			if($url->queryString !== null) {
				$tmp3 = !(!$url->queryString->iterator()->hasNext());
			} else {
				$tmp3 = false;
			}
		} else {
			$tmp3 = true;
		}
		if($tmp3) {
			$tmp4 = thx__Url_Url_Impl_::get_search($url);
			$tmp2 = "?" . _hx_string_or_null($tmp4);
		} else {
			$tmp2 = "";
		}
		if("/some/path/name.ext?a=b&c=d" !== _hx_string_or_null($url->pathName) . _hx_string_or_null($tmp2)) {
			$tmp5 = null;
			$tmp6 = null;
			if($url->search === null) {
				if($url->queryString !== null) {
					$tmp6 = !(!$url->queryString->iterator()->hasNext());
				} else {
					$tmp6 = false;
				}
			} else {
				$tmp6 = true;
			}
			if($tmp6) {
				$tmp7 = thx__Url_Url_Impl_::get_search($url);
				$tmp5 = "?" . _hx_string_or_null($tmp7);
			} else {
				$tmp5 = "";
			}
			$tmp1 = "/some/path/name.ext?c=d&a=b" === _hx_string_or_null($url->pathName) . _hx_string_or_null($tmp5);
		} else {
			$tmp1 = true;
		}
		utest_Assert::isTrue($tmp1, null, _hx_anonymous(array("fileName" => "TestUrl.hx", "lineNumber" => 16, "className" => "thx.TestUrl", "methodName" => "testBasics")));
		utest_Assert::equals("/some/path/name.ext", $url->pathName, null, _hx_anonymous(array("fileName" => "TestUrl.hx", "lineNumber" => 20, "className" => "thx.TestUrl", "methodName" => "testBasics")));
		utest_Assert::equals("hashtag/is/here", $url->hash, null, _hx_anonymous(array("fileName" => "TestUrl.hx", "lineNumber" => 21, "className" => "thx.TestUrl", "methodName" => "testBasics")));
	}
	public function testToString() {
		$urls = (new _hx_array(array("http://user:password@www.example.com:8888/some/path/name.ext?a=b#hashtag/is/here", "http://example.com", "irc://irc.example.com/channel", "www.example.com/foo", "news:rec.gardens.roses", "ldap://[2001:db8::7]/c=GB?objectClass?one", "mailto:John.Doe@example.com", "telnet://192.0.2.16:80/", "ldap://ldap.example.com/dc=example,dc=com", "ldap://ldap.example.com/cn=Barbara%20Jensen,dc=example,dc=com?cn,mail,telephoneNumber")));
		{
			$_g = 0;
			while($_g < $urls->length) {
				$url = $urls[$_g];
				++$_g;
				$tmp = thx__Url_Url_Impl_::parse($url, false);
				$tmp1 = thx__Url_Url_Impl_::toString($tmp);
				utest_Assert::equals($url, $tmp1, null, _hx_anonymous(array("fileName" => "TestUrl.hx", "lineNumber" => 38, "className" => "thx.TestUrl", "methodName" => "testToString")));
				unset($url,$tmp1,$tmp);
			}
		}
	}
	public function testAbsolute() {
		$url = thx__Url_Url_Impl_::fromString("http://example.com");
		utest_Assert::isTrue($url->hostName !== null, null, _hx_anonymous(array("fileName" => "TestUrl.hx", "lineNumber" => 43, "className" => "thx.TestUrl", "methodName" => "testAbsolute")));
		utest_Assert::isFalse($url->hostName === null, null, _hx_anonymous(array("fileName" => "TestUrl.hx", "lineNumber" => 44, "className" => "thx.TestUrl", "methodName" => "testAbsolute")));
		$url = thx__Url_Url_Impl_::fromString("example.com");
		utest_Assert::isTrue($url->hostName !== null, null, _hx_anonymous(array("fileName" => "TestUrl.hx", "lineNumber" => 47, "className" => "thx.TestUrl", "methodName" => "testAbsolute")));
		utest_Assert::isFalse($url->hostName === null, null, _hx_anonymous(array("fileName" => "TestUrl.hx", "lineNumber" => 48, "className" => "thx.TestUrl", "methodName" => "testAbsolute")));
		$url = thx__Url_Url_Impl_::fromString("/some/path");
		utest_Assert::isFalse($url->hostName !== null, null, _hx_anonymous(array("fileName" => "TestUrl.hx", "lineNumber" => 51, "className" => "thx.TestUrl", "methodName" => "testAbsolute")));
		utest_Assert::isTrue($url->hostName === null, null, _hx_anonymous(array("fileName" => "TestUrl.hx", "lineNumber" => 52, "className" => "thx.TestUrl", "methodName" => "testAbsolute")));
	}
	function __toString() { return 'thx.TestUrl'; }
}
