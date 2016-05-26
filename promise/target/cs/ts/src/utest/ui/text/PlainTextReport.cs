// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace utest.ui.text {
	public class PlainTextReport : global::haxe.lang.HxObject, global::utest.ui.common.IReport<object> {
		
		public PlainTextReport(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public PlainTextReport(global::utest.Runner runner, global::haxe.lang.Function outputHandler) {
			global::utest.ui.text.PlainTextReport.__hx_ctor_utest_ui_text_PlainTextReport(this, runner, outputHandler);
		}
		
		
		public static void __hx_ctor_utest_ui_text_PlainTextReport(global::utest.ui.text.PlainTextReport __temp_me174, global::utest.Runner runner, global::haxe.lang.Function outputHandler) {
			__temp_me174.aggregator = new global::utest.ui.common.ResultAggregator(runner, new global::haxe.lang.Null<bool>(true, true));
			runner.onStart.@add(((global::haxe.lang.Function) (new global::haxe.lang.Closure(__temp_me174, "start", 67859554)) ));
			__temp_me174.aggregator.onComplete.@add(((global::haxe.lang.Function) (new global::haxe.lang.Closure(__temp_me174, "complete", 2143813817)) ));
			if (( null != outputHandler )) {
				__temp_me174.setHandler(outputHandler);
			}
			
			__temp_me174.displaySuccessResults = global::utest.ui.common.SuccessResultsDisplayMode.AlwaysShowSuccessResults;
			__temp_me174.displayHeader = global::utest.ui.common.HeaderDisplayMode.AlwaysShowHeader;
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::utest.ui.text.PlainTextReport(global::haxe.lang.EmptyObject.EMPTY);
		}
		
		
		public static new object __hx_create(global::Array arr) {
			unchecked {
				return new global::utest.ui.text.PlainTextReport(((global::utest.Runner) (arr[0]) ), ((global::haxe.lang.Function) (arr[1]) ));
			}
		}
		
		
		public virtual object utest_ui_common_IReport_cast<T_c>() {
			return this;
		}
		
		
		public global::utest.ui.common.SuccessResultsDisplayMode displaySuccessResults;
		
		public global::utest.ui.common.HeaderDisplayMode displayHeader;
		
		public global::haxe.lang.Function handler;
		
		public global::utest.ui.common.ResultAggregator aggregator;
		
		public string newline;
		
		public string indent;
		
		public virtual void setHandler(global::haxe.lang.Function handler) {
			this.handler = handler;
		}
		
		
		public double startTime;
		
		public virtual void start(global::utest.Runner e) {
			this.startTime = this.getTime();
		}
		
		
		public virtual double getTime() {
			return global::haxe.Timer.stamp();
		}
		
		
		public virtual string indents(int c) {
			string s = "";
			{
				int _g1 = 0;
				while (( _g1 < c )) {
					 ++ _g1;
					s = global::haxe.lang.Runtime.concat(s, this.indent);
				}
				
			}
			
			return s;
		}
		
		
		public virtual string dumpStack(global::Array<object> stack) {
			if (( stack.length == 0 )) {
				return "";
			}
			
			global::Array<object> parts = global::haxe.lang.StringExt.split(global::haxe.CallStack.toString(stack), "\n");
			global::Array<object> r = new global::Array<object>(new object[]{});
			{
				int _g = 0;
				while (( _g < parts.length )) {
					string part = global::haxe.lang.Runtime.toString(parts[_g]);
					 ++ _g;
					if (( global::haxe.lang.StringExt.indexOf(part, " utest.", default(global::haxe.lang.Null<int>)) >= 0 )) {
						continue;
					}
					
					r.push(part);
				}
				
			}
			
			return r.@join(this.newline);
		}
		
		
		public virtual void addHeader(global::StringBuf buf, global::utest.ui.common.PackageResult result) {
			unchecked {
				if ( ! (global::utest.ui.common.ReportTools.hasHeader(this, result.stats)) ) {
					return;
				}
				
				double time = ( ((double) (((int) (( (( this.getTime() - this.startTime )) * 1000 )) )) ) / 1000 );
				buf.b.Append(((string) (global::Std.@string(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("\nassertations: ", global::haxe.lang.Runtime.toString(result.stats.assertations)), this.newline))) ));
				buf.b.Append(((string) (global::Std.@string(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("successes: ", global::haxe.lang.Runtime.toString(result.stats.successes)), this.newline))) ));
				buf.b.Append(((string) (global::Std.@string(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("errors: ", global::haxe.lang.Runtime.toString(result.stats.errors)), this.newline))) ));
				buf.b.Append(((string) (global::Std.@string(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("failures: ", global::haxe.lang.Runtime.toString(result.stats.failures)), this.newline))) ));
				buf.b.Append(((string) (global::Std.@string(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("warnings: ", global::haxe.lang.Runtime.toString(result.stats.warnings)), this.newline))) ));
				buf.b.Append(((string) (global::Std.@string(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("execution time: ", global::haxe.lang.Runtime.toString(time)), this.newline))) ));
				buf.b.Append(((string) (global::Std.@string(this.newline)) ));
				buf.b.Append(((string) (global::Std.@string(global::haxe.lang.Runtime.concat("results: ", (( (result.stats.isOk) ? ("ALL TESTS OK (success: true)") : ("SOME TESTS FAILURES (success: false)") ))))) ));
				buf.b.Append(((string) (global::Std.@string(this.newline)) ));
			}
		}
		
		
		public global::utest.ui.common.PackageResult result;
		
		public virtual string getResults() {
			unchecked {
				global::StringBuf buf = new global::StringBuf();
				this.addHeader(buf, this.result);
				{
					int _g = 0;
					global::Array<object> _g1 = this.result.packageNames(default(global::haxe.lang.Null<bool>));
					while (( _g < _g1.length )) {
						string pname = global::haxe.lang.Runtime.toString(_g1[_g]);
						 ++ _g;
						global::utest.ui.common.PackageResult pack = this.result.getPackage(pname);
						if (global::utest.ui.common.ReportTools.skipResult(this, pack.stats, this.result.stats.isOk)) {
							continue;
						}
						
						{
							int _g2 = 0;
							global::Array<object> _g3 = pack.classNames(default(global::haxe.lang.Null<bool>));
							while (( _g2 < _g3.length )) {
								string cname = global::haxe.lang.Runtime.toString(_g3[_g2]);
								 ++ _g2;
								global::utest.ui.common.ClassResult cls = pack.getClass(cname);
								if (global::utest.ui.common.ReportTools.skipResult(this, cls.stats, this.result.stats.isOk)) {
									continue;
								}
								
								buf.b.Append(((string) (global::Std.@string(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat((( (string.Equals(pname, "")) ? ("") : (global::haxe.lang.Runtime.concat(pname, ".")) )), cname), this.newline))) ));
								{
									int _g4 = 0;
									global::Array<object> _g5 = cls.methodNames(default(global::haxe.lang.Null<bool>));
									while (( _g4 < _g5.length )) {
										string mname = global::haxe.lang.Runtime.toString(_g5[_g4]);
										 ++ _g4;
										global::utest.ui.common.FixtureResult fix = cls.@get(mname);
										if (global::utest.ui.common.ReportTools.skipResult(this, fix.stats, this.result.stats.isOk)) {
											continue;
										}
										
										buf.b.Append(((string) (global::Std.@string(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(this.indents(1), mname), ": "))) ));
										if (fix.stats.isOk) {
											buf.b.Append(((string) ("OK ") ));
										}
										else if (fix.stats.hasErrors) {
											buf.b.Append(((string) ("ERROR ") ));
										}
										else if (fix.stats.hasFailures) {
											buf.b.Append(((string) ("FAILURE ") ));
										}
										else if (fix.stats.hasWarnings) {
											buf.b.Append(((string) ("WARNING ") ));
										}
										
										string messages = "";
										{
											global::_List.ListIterator<object> _g6 = fix.iterator();
											while (( _g6.head != null )) {
												global::utest.Assertation val = ((global::utest.Assertation) (_g6.head.item) );
												_g6.head = _g6.head.next;
												switch (val.index) {
													case 0:
													{
														buf.b.Append(((string) (".") ));
														break;
													}
													
													
													case 1:
													{
														buf.b.Append(((string) ("F") ));
														messages = global::haxe.lang.Runtime.concat(messages, global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(this.indents(2), "line: "), global::haxe.lang.Runtime.toString(((int) (global::haxe.lang.Runtime.getField_f(val.@params[1], "lineNumber", 1981972957, true)) ))), ", "), global::haxe.lang.Runtime.toString(val.@params[0])), this.newline));
														break;
													}
													
													
													case 2:
													{
														buf.b.Append(((string) ("E") ));
														messages = global::haxe.lang.Runtime.concat(messages, global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(this.indents(2), global::Std.@string(val.@params[0])), this.dumpStack(((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (val.@params[1]) ))) ))), this.newline));
														break;
													}
													
													
													case 3:
													{
														buf.b.Append(((string) ("S") ));
														messages = global::haxe.lang.Runtime.concat(messages, global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(this.indents(2), global::Std.@string(val.@params[0])), this.dumpStack(((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (val.@params[1]) ))) ))), this.newline));
														break;
													}
													
													
													case 4:
													{
														buf.b.Append(((string) ("T") ));
														messages = global::haxe.lang.Runtime.concat(messages, global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(this.indents(2), global::Std.@string(val.@params[0])), this.dumpStack(((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (val.@params[1]) ))) ))), this.newline));
														break;
													}
													
													
													case 5:
													{
														buf.b.Append(((string) ("O") ));
														messages = global::haxe.lang.Runtime.concat(messages, global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(this.indents(2), "missed async calls: "), global::haxe.lang.Runtime.toString(((int) (global::haxe.lang.Runtime.toInt(val.@params[0])) ))), this.dumpStack(((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (val.@params[1]) ))) ))), this.newline));
														break;
													}
													
													
													case 6:
													{
														buf.b.Append(((string) ("A") ));
														messages = global::haxe.lang.Runtime.concat(messages, global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(this.indents(2), global::Std.@string(val.@params[0])), this.dumpStack(((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (val.@params[1]) ))) ))), this.newline));
														break;
													}
													
													
													case 7:
													{
														buf.b.Append(((string) ("W") ));
														messages = global::haxe.lang.Runtime.concat(messages, global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(this.indents(2), global::haxe.lang.Runtime.toString(val.@params[0])), this.newline));
														break;
													}
													
													
												}
												
											}
											
										}
										
										buf.b.Append(((string) (global::Std.@string(this.newline)) ));
										buf.b.Append(((string) (global::Std.@string(messages)) ));
									}
									
								}
								
							}
							
						}
						
					}
					
				}
				
				return buf.b.ToString();
			}
		}
		
		
		public virtual void complete(global::utest.ui.common.PackageResult result) {
			unchecked {
				this.result = result;
				this.handler.__hx_invoke1_o(default(double), this);
				global::System.Environment.Exit(((int) (( (result.stats.isOk) ? (0) : (1) )) ));
			}
		}
		
		
		public override double __hx_setField_f(string field, int hash, double @value, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 99632527:
					{
						this.startTime = ((double) (@value) );
						return @value;
					}
					
					
					default:
					{
						return base.__hx_setField_f(field, hash, @value, handleProperties);
					}
					
				}
				
			}
		}
		
		
		public override object __hx_setField(string field, int hash, object @value, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 142895325:
					{
						this.result = ((global::utest.ui.common.PackageResult) (@value) );
						return @value;
					}
					
					
					case 99632527:
					{
						this.startTime = ((double) (global::haxe.lang.Runtime.toDouble(@value)) );
						return @value;
					}
					
					
					case 334695532:
					{
						this.indent = global::haxe.lang.Runtime.toString(@value);
						return @value;
					}
					
					
					case 212244564:
					{
						this.newline = global::haxe.lang.Runtime.toString(@value);
						return @value;
					}
					
					
					case 872071561:
					{
						this.aggregator = ((global::utest.ui.common.ResultAggregator) (@value) );
						return @value;
					}
					
					
					case 1171632074:
					{
						this.handler = ((global::haxe.lang.Function) (@value) );
						return @value;
					}
					
					
					case 1046660463:
					{
						this.displayHeader = ((global::utest.ui.common.HeaderDisplayMode) (@value) );
						return @value;
					}
					
					
					case 641357653:
					{
						this.displaySuccessResults = ((global::utest.ui.common.SuccessResultsDisplayMode) (@value) );
						return @value;
					}
					
					
					default:
					{
						return base.__hx_setField(field, hash, @value, handleProperties);
					}
					
				}
				
			}
		}
		
		
		public override object __hx_getField(string field, int hash, bool throwErrors, bool isCheck, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 2143813817:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "complete", 2143813817)) );
					}
					
					
					case 985194240:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "getResults", 985194240)) );
					}
					
					
					case 142895325:
					{
						return this.result;
					}
					
					
					case 891567758:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "addHeader", 891567758)) );
					}
					
					
					case 506461556:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "dumpStack", 506461556)) );
					}
					
					
					case 1622659719:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "indents", 1622659719)) );
					}
					
					
					case 528448451:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "getTime", 528448451)) );
					}
					
					
					case 67859554:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "start", 67859554)) );
					}
					
					
					case 99632527:
					{
						return this.startTime;
					}
					
					
					case 414504008:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "setHandler", 414504008)) );
					}
					
					
					case 334695532:
					{
						return this.indent;
					}
					
					
					case 212244564:
					{
						return this.newline;
					}
					
					
					case 872071561:
					{
						return this.aggregator;
					}
					
					
					case 1171632074:
					{
						return this.handler;
					}
					
					
					case 1046660463:
					{
						return this.displayHeader;
					}
					
					
					case 641357653:
					{
						return this.displaySuccessResults;
					}
					
					
					default:
					{
						return base.__hx_getField(field, hash, throwErrors, isCheck, handleProperties);
					}
					
				}
				
			}
		}
		
		
		public override double __hx_getField_f(string field, int hash, bool throwErrors, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 99632527:
					{
						return this.startTime;
					}
					
					
					default:
					{
						return base.__hx_getField_f(field, hash, throwErrors, handleProperties);
					}
					
				}
				
			}
		}
		
		
		public override object __hx_invokeField(string field, int hash, global::Array dynargs) {
			unchecked {
				switch (hash) {
					case 2143813817:
					{
						this.complete(((global::utest.ui.common.PackageResult) (dynargs[0]) ));
						break;
					}
					
					
					case 985194240:
					{
						return this.getResults();
					}
					
					
					case 891567758:
					{
						this.addHeader(((global::StringBuf) (dynargs[0]) ), ((global::utest.ui.common.PackageResult) (dynargs[1]) ));
						break;
					}
					
					
					case 506461556:
					{
						return this.dumpStack(((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (dynargs[0]) ))) ));
					}
					
					
					case 1622659719:
					{
						return this.indents(((int) (global::haxe.lang.Runtime.toInt(dynargs[0])) ));
					}
					
					
					case 528448451:
					{
						return this.getTime();
					}
					
					
					case 67859554:
					{
						this.start(((global::utest.Runner) (dynargs[0]) ));
						break;
					}
					
					
					case 414504008:
					{
						this.setHandler(((global::haxe.lang.Function) (dynargs[0]) ));
						break;
					}
					
					
					default:
					{
						return base.__hx_invokeField(field, hash, dynargs);
					}
					
				}
				
				return null;
			}
		}
		
		
		public override void __hx_getFields(global::Array<object> baseArr) {
			baseArr.push("result");
			baseArr.push("startTime");
			baseArr.push("indent");
			baseArr.push("newline");
			baseArr.push("aggregator");
			baseArr.push("handler");
			baseArr.push("displayHeader");
			baseArr.push("displaySuccessResults");
			{
				base.__hx_getFields(baseArr);
			}
			
		}
		
		
	}
}


