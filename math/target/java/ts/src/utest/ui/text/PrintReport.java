// Generated by Haxe 3.3.0
package utest.ui.text;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class PrintReport extends utest.ui.text.PlainTextReport
{
	public PrintReport(haxe.lang.EmptyObject empty)
	{
		//line 18 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/text/PrintReport.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public PrintReport(utest.Runner runner)
	{
		//line 45 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/text/PrintReport.hx"
		super(haxe.lang.EmptyObject.EMPTY);
		//line 45 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/text/PrintReport.hx"
		utest.ui.text.PrintReport.__hx_ctor_utest_ui_text_PrintReport(this, runner);
	}
	
	
	public static void __hx_ctor_utest_ui_text_PrintReport(utest.ui.text.PrintReport __temp_me142, utest.Runner runner)
	{
		//line 45 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/text/PrintReport.hx"
		utest.ui.text.PlainTextReport.__hx_ctor_utest_ui_text_PlainTextReport(__temp_me142, runner, ((haxe.lang.Function) (new haxe.lang.Closure(__temp_me142, "_handler")) ));
		//line 46 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/text/PrintReport.hx"
		__temp_me142.newline = "\n";
		//line 47 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/text/PrintReport.hx"
		__temp_me142.indent = "  ";
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 18 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/text/PrintReport.hx"
		return new utest.ui.text.PrintReport(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 18 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/text/PrintReport.hx"
		return new utest.ui.text.PrintReport(((utest.Runner) (arr.__get(0)) ));
	}
	
	
	public void _handler(utest.ui.text.PlainTextReport report)
	{
		//line 51 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/text/PrintReport.hx"
		this._trace(report.getResults());
	}
	
	
	public void _trace(java.lang.String s)
	{
		//line 55 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/text/PrintReport.hx"
		s = haxe.root.StringTools.replace(s, "  ", this.indent);
		//line 56 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/text/PrintReport.hx"
		s = haxe.root.StringTools.replace(s, "\n", this.newline);
		//line 57 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/text/PrintReport.hx"
		haxe.Log.trace.__hx_invoke2_o(0.0, s, 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"utest.ui.text.PrintReport", "PrintReport.hx", "_trace"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (57) )) )}));
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 18 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/text/PrintReport.hx"
		{
			//line 18 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/text/PrintReport.hx"
			boolean __temp_executeDef1 = true;
			//line 18 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/text/PrintReport.hx"
			switch (field.hashCode())
			{
				case -1464576954:
				{
					//line 18 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/text/PrintReport.hx"
					if (field.equals("_trace")) 
					{
						//line 18 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/text/PrintReport.hx"
						__temp_executeDef1 = false;
						//line 18 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/text/PrintReport.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "_trace")) );
					}
					
					//line 18 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/text/PrintReport.hx"
					break;
				}
				
				
				case -1243939317:
				{
					//line 18 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/text/PrintReport.hx"
					if (field.equals("_handler")) 
					{
						//line 18 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/text/PrintReport.hx"
						__temp_executeDef1 = false;
						//line 18 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/text/PrintReport.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "_handler")) );
					}
					
					//line 18 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/text/PrintReport.hx"
					break;
				}
				
				
			}
			
			//line 18 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/text/PrintReport.hx"
			if (__temp_executeDef1) 
			{
				//line 18 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/text/PrintReport.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 18 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/text/PrintReport.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 18 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/text/PrintReport.hx"
		{
			//line 18 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/text/PrintReport.hx"
			boolean __temp_executeDef1 = true;
			//line 18 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/text/PrintReport.hx"
			switch (field.hashCode())
			{
				case -1464576954:
				{
					//line 18 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/text/PrintReport.hx"
					if (field.equals("_trace")) 
					{
						//line 18 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/text/PrintReport.hx"
						__temp_executeDef1 = false;
						//line 18 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/text/PrintReport.hx"
						this._trace(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 18 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/text/PrintReport.hx"
					break;
				}
				
				
				case -1243939317:
				{
					//line 18 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/text/PrintReport.hx"
					if (field.equals("_handler")) 
					{
						//line 18 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/text/PrintReport.hx"
						__temp_executeDef1 = false;
						//line 18 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/text/PrintReport.hx"
						this._handler(((utest.ui.text.PlainTextReport) (dynargs.__get(0)) ));
					}
					
					//line 18 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/text/PrintReport.hx"
					break;
				}
				
				
			}
			
			//line 18 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/text/PrintReport.hx"
			if (__temp_executeDef1) 
			{
				//line 18 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/text/PrintReport.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 18 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/text/PrintReport.hx"
		return null;
	}
	
	
}


