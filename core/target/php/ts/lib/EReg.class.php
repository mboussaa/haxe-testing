<?php

// Generated by Haxe 3.3.0
class EReg {
	public function __construct($r, $opt) {
		if(!php_Boot::$skip_constructor) {
		$this->pattern = $r;
		$a = _hx_explode("g", $opt);
		$this->{"global"} = $a->length > 1;
		$tmp = $this->{"global"};
		if($tmp) {
			$opt = $a->join("");
		}
		$this->options = $opt;
		$this->re = '"' . str_replace('"','\\"',$r) . '"' . $opt;
	}}
	public $last;
	public $global;
	public $pattern;
	public $options;
	public $re;
	public $matches;
	public function match($s) {
		$p = preg_match($this->re, $s, $this->matches, PREG_OFFSET_CAPTURE);
		if($p > 0) {
			$this->last = $s;
		} else {
			$this->last = null;
		}
		return $p > 0;
	}
	public function matched($n) {
		$tmp = null;
		if($this->matches !== null) {
			$tmp = $n < 0;
		} else {
			$tmp = true;
		}
		if($tmp) {
			throw new HException("EReg::matched");
		}
		$tmp1 = count($this->matches);
		if($n >= $tmp1) {
			return null;
		}
		$tmp2 = $this->matches[$n][1] < 0;
		if($tmp2) {
			return null;
		}
		return $this->matches[$n][0];
	}
	public function matchedRight() {
		$tmp = count($this->matches);
		if($tmp === 0) {
			throw new HException("No string matched");
		}
		$tmp1 = $this->matches[0][1];
		$tmp2 = strlen($this->matches[0][0]);
		$x = $tmp1 + $tmp2;
		return _hx_substr($this->last, $x, null);
	}
	public function matchedPos() {
		$tmp = $this->matches[0][1];
		$tmp1 = strlen($this->matches[0][0]);
		return _hx_anonymous(array("pos" => $tmp, "len" => $tmp1));
	}
	public function matchSub($s, $pos, $len = null) {
		if($len === null) {
			$len = -1;
		}
		$p = preg_match($this->re, (($len < 0) ? $s : _hx_substr($s, 0, $pos + $len)), $this->matches, PREG_OFFSET_CAPTURE, $pos);
		if($p > 0) {
			$this->last = $s;
		} else {
			$this->last = null;
		}
		return $p > 0;
	}
	public function split($s) {
		return new _hx_array(preg_split($this->re, $s, $this->{"global"} ? -1 : 2));
	}
	public function replace($s, $by) {
		$by = str_replace("\\\$", "\\\\\$", $by);
		$by = str_replace("\$\$", "\\\$", $by);
		if(!preg_match('/\\([^?].*?\\)/', $this->re)) $by = preg_replace('/\$(\d+)/', '\\\$\1', $by);
		return preg_replace($this->re, $by, $s, (($this->{"global"}) ? -1 : 1));
	}
	public function map($s, $f) {
		$offset = 0;
		$buf = new StringBuf();
		while(true) {
			$tmp = $offset >= strlen($s);
			if($tmp) {
				break;
			} else {
				$tmp1 = !$this->matchSub($s, $offset, null);
				if($tmp1) {
					$tmp2 = _hx_substr($s, $offset, null);
					$buf->add($tmp2);
					break;
					unset($tmp2);
				}
				unset($tmp1);
			}
			$p = $this->matchedPos();
			$tmp3 = $p->pos - $offset;
			$tmp4 = _hx_substr($s, $offset, $tmp3);
			$buf->add($tmp4);
			$tmp5 = call_user_func_array($f, array($this));
			$buf->add($tmp5);
			$tmp6 = $p->len === 0;
			if($tmp6) {
				$tmp7 = _hx_substr($s, $p->pos, 1);
				$buf->add($tmp7);
				$offset = $p->pos + 1;
				unset($tmp7);
			} else {
				$offset = $p->pos + $p->len;
			}
			if(!$this->{"global"}) {
				break;
			}
			unset($tmp6,$tmp5,$tmp4,$tmp3,$tmp,$p);
		}
		$tmp8 = null;
		$tmp9 = null;
		if(!$this->{"global"}) {
			$tmp9 = $offset > 0;
		} else {
			$tmp9 = false;
		}
		if($tmp9) {
			$tmp8 = $offset < strlen($s);
		} else {
			$tmp8 = false;
		}
		if($tmp8) {
			$tmp10 = _hx_substr($s, $offset, null);
			$buf->add($tmp10);
		}
		return $buf->b;
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
	function __toString() { return 'EReg'; }
}
