<?php

// Generated by Haxe 3.3.0
class thx_text_table_Span extends Enum {
	public static $FillBoth;
	public static $FillDown;
	public static $FillRight;
	public static $NoSpan;
	public static function SpanBoth($rows, $cols) { return new thx_text_table_Span("SpanBoth", 1, array($rows, $cols)); }
	public static function SpanDown($rows) { return new thx_text_table_Span("SpanDown", 3, array($rows)); }
	public static function SpanRight($cols) { return new thx_text_table_Span("SpanRight", 2, array($cols)); }
	public static $__constructors = array(6 => 'FillBoth', 5 => 'FillDown', 4 => 'FillRight', 0 => 'NoSpan', 1 => 'SpanBoth', 3 => 'SpanDown', 2 => 'SpanRight');
	}
thx_text_table_Span::$FillBoth = new thx_text_table_Span("FillBoth", 6);
thx_text_table_Span::$FillDown = new thx_text_table_Span("FillDown", 5);
thx_text_table_Span::$FillRight = new thx_text_table_Span("FillRight", 4);
thx_text_table_Span::$NoSpan = new thx_text_table_Span("NoSpan", 0);
