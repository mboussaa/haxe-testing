<?php

// Generated by Haxe 3.3.0
class thx_fp_TreeBagImpl extends Enum {
	public static function Branch($left, $right) { return new thx_fp_TreeBagImpl("Branch", 2, array($left, $right)); }
	public static function Cons($x, $xs) { return new thx_fp_TreeBagImpl("Cons", 1, array($x, $xs)); }
	public static $hEmpty;
	public static $__constructors = array(2 => 'Branch', 1 => 'Cons', 0 => 'hEmpty');
	}
thx_fp_TreeBagImpl::$hEmpty = new thx_fp_TreeBagImpl("Empty", 0);