<?php

// Generated by Haxe 3.3.0
class thx_text_table_CellValueImpl extends Enum {
	public static function BoolCell($v) { return new thx_text_table_CellValueImpl("BoolCell", 3, array($v)); }
	public static function DateTimeCell($v) { return new thx_text_table_CellValueImpl("DateTimeCell", 4, array($v)); }
	public static $hEmpty;
	public static function FloatCell($v) { return new thx_text_table_CellValueImpl("FloatCell", 1, array($v)); }
	public static function IntCell($v) { return new thx_text_table_CellValueImpl("IntCell", 0, array($v)); }
	public static $NA;
	public static function StringCell($v) { return new thx_text_table_CellValueImpl("StringCell", 2, array($v)); }
	public static function TimeCell($v) { return new thx_text_table_CellValueImpl("TimeCell", 5, array($v)); }
	public static $__constructors = array(3 => 'BoolCell', 4 => 'DateTimeCell', 6 => 'hEmpty', 1 => 'FloatCell', 0 => 'IntCell', 7 => 'NA', 2 => 'StringCell', 5 => 'TimeCell');
	}
thx_text_table_CellValueImpl::$hEmpty = new thx_text_table_CellValueImpl("Empty", 6);
thx_text_table_CellValueImpl::$NA = new thx_text_table_CellValueImpl("NA", 7);
