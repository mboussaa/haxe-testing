// Generated by Haxe 3.3.0
package thx.text.table;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Span extends haxe.lang.ParamEnum
{
	public Span(int index, java.lang.Object[] params)
	{
		//line 100 "/usr/lib/haxe/std/java/internal/HxObject.hx"
		super(index, params);
	}
	
	
	public static final java.lang.String[] __hx_constructs = new java.lang.String[]{"NoSpan", "SpanBoth", "SpanRight", "SpanDown", "FillRight", "FillDown", "FillBoth"};
	
	public static final thx.text.table.Span NoSpan = new thx.text.table.Span(0, null);
	
	public static thx.text.table.Span SpanBoth(int rows, int cols)
	{
		//line 5 "/shared/text/src/thx/text/table/Span.hx"
		return new thx.text.table.Span(1, new java.lang.Object[]{rows, cols});
	}
	
	
	public static thx.text.table.Span SpanRight(int cols)
	{
		//line 6 "/shared/text/src/thx/text/table/Span.hx"
		return new thx.text.table.Span(2, new java.lang.Object[]{cols});
	}
	
	
	public static thx.text.table.Span SpanDown(int rows)
	{
		//line 7 "/shared/text/src/thx/text/table/Span.hx"
		return new thx.text.table.Span(3, new java.lang.Object[]{rows});
	}
	
	
	public static final thx.text.table.Span FillRight = new thx.text.table.Span(4, null);
	
	public static final thx.text.table.Span FillDown = new thx.text.table.Span(5, null);
	
	public static final thx.text.table.Span FillBoth = new thx.text.table.Span(6, null);
	
	@Override public java.lang.String getTag()
	{
		//line 3 "/shared/text/src/thx/text/table/Span.hx"
		return thx.text.table.Span.__hx_constructs[this.index];
	}
	
	
}

