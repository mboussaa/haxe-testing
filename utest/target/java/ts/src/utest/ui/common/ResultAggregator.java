// Generated by Haxe 3.3.0
package utest.ui.common;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ResultAggregator extends haxe.lang.HxObject
{
	public ResultAggregator(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public ResultAggregator(utest.Runner runner, java.lang.Object flattenPackage)
	{
		//line 16 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
		utest.ui.common.ResultAggregator.__hx_ctor_utest_ui_common_ResultAggregator(this, runner, flattenPackage);
	}
	
	
	public static void __hx_ctor_utest_ui_common_ResultAggregator(utest.ui.common.ResultAggregator __temp_me56, utest.Runner runner, java.lang.Object flattenPackage)
	{
		//line 16 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
		boolean __temp_flattenPackage55 = ( (haxe.lang.Runtime.eq(flattenPackage, null)) ? (false) : (haxe.lang.Runtime.toBool(flattenPackage)) );
		//line 17 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
		if (( runner == null )) 
		{
			//line 17 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
			throw haxe.lang.HaxeException.wrap("runner argument is null");
		}
		
		//line 18 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
		__temp_me56.flattenPackage = __temp_flattenPackage55;
		//line 19 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
		__temp_me56.runner = runner;
		//line 20 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
		runner.onStart.add(((haxe.lang.Function) (new haxe.lang.Closure(__temp_me56, "start")) ));
		//line 21 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
		runner.onProgress.add(((haxe.lang.Function) (new haxe.lang.Closure(__temp_me56, "progress")) ));
		//line 22 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
		runner.onComplete.add(((haxe.lang.Function) (new haxe.lang.Closure(__temp_me56, "complete")) ));
		//line 24 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
		__temp_me56.onStart = new utest.Notifier();
		//line 25 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
		__temp_me56.onComplete = new utest.Dispatcher<utest.ui.common.PackageResult>();
		//line 26 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
		__temp_me56.onProgress = new utest.Dispatcher<java.lang.Object>();
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
		return new utest.ui.common.ResultAggregator(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
		return new utest.ui.common.ResultAggregator(((utest.Runner) (arr.__get(0)) ), arr.__get(1));
	}
	
	
	public utest.Runner runner;
	
	public boolean flattenPackage;
	
	public utest.ui.common.PackageResult root;
	
	public utest.Notifier onStart;
	
	public utest.Dispatcher<utest.ui.common.PackageResult> onComplete;
	
	public utest.Dispatcher<java.lang.Object> onProgress;
	
	public void start(utest.Runner runner)
	{
		//line 30 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
		this.root = new utest.ui.common.PackageResult(haxe.lang.Runtime.toString(null));
		//line 31 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
		this.onStart.dispatch();
	}
	
	
	public utest.ui.common.PackageResult getOrCreatePackage(java.lang.String pack, boolean flat, utest.ui.common.PackageResult ref)
	{
		//line 35 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
		if (( ref == null )) 
		{
			//line 35 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
			ref = this.root;
		}
		
		//line 36 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
		if (( ( pack == null ) || haxe.lang.Runtime.valEq(pack, "") )) 
		{
			//line 36 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
			return ref;
		}
		
		//line 37 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
		if (flat) 
		{
			//line 38 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
			if (ref.existsPackage(pack)) 
			{
				//line 39 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
				return ref.getPackage(pack);
			}
			
			//line 40 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
			utest.ui.common.PackageResult p = new utest.ui.common.PackageResult(haxe.lang.Runtime.toString(pack));
			//line 41 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
			ref.addPackage(p);
			//line 42 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
			return p;
		}
		else
		{
			//line 44 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
			haxe.root.Array<java.lang.String> parts = haxe.lang.StringExt.split(pack, ".");
			//line 45 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
			{
				//line 45 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
				int _g = 0;
				//line 45 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
				while (( _g < parts.length ))
				{
					//line 45 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					java.lang.String part = parts.__get(_g);
					//line 45 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					 ++ _g;
					//line 46 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					ref = this.getOrCreatePackage(part, true, ref);
				}
				
			}
			
			//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
			return ref;
		}
		
	}
	
	
	public utest.ui.common.ClassResult getOrCreateClass(utest.ui.common.PackageResult pack, java.lang.String cls, java.lang.String setup, java.lang.String teardown)
	{
		//line 53 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
		if (pack.existsClass(cls)) 
		{
			//line 53 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
			return pack.getClass(cls);
		}
		
		//line 54 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
		utest.ui.common.ClassResult c = new utest.ui.common.ClassResult(cls, setup, teardown);
		//line 55 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
		pack.addClass(c);
		//line 56 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
		return c;
	}
	
	
	public utest.ui.common.FixtureResult createFixture(utest.TestResult result)
	{
		//line 60 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
		utest.ui.common.FixtureResult f = new utest.ui.common.FixtureResult(haxe.lang.Runtime.toString(result.method));
		//line 61 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
		{
			//line 61 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
			_List.ListNode<utest.Assertation> _g_head = result.assertations.h;
			//line 61 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
			while (( _g_head != null ))
			{
				//line 61 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
				utest.Assertation val = _g_head.item;
				//line 59 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
				_g_head = _g_head.next;
				//line 62 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
				f.add(val);
			}
			
		}
		
		//line 63 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
		return f;
	}
	
	
	public void progress(java.lang.Object e)
	{
		//line 67 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
		this.root.addResult(((utest.TestResult) (haxe.lang.Runtime.getField(e, "result", true)) ), this.flattenPackage);
		//line 68 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
		this.onProgress.dispatch(e);
	}
	
	
	public void complete(utest.Runner runner)
	{
		//line 72 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
		this.onComplete.dispatch(this.root);
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
		{
			//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
			boolean __temp_executeDef1 = true;
			//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
			switch (field.hashCode())
			{
				case 1768875308:
				{
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					if (field.equals("onProgress")) 
					{
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						this.onProgress = ((utest.Dispatcher<java.lang.Object>) (value) );
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						return value;
					}
					
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					break;
				}
				
				
				case -919806160:
				{
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					if (field.equals("runner")) 
					{
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						this.runner = ((utest.Runner) (value) );
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						return value;
					}
					
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					break;
				}
				
				
				case -2124458952:
				{
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					if (field.equals("onComplete")) 
					{
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						this.onComplete = ((utest.Dispatcher<utest.ui.common.PackageResult>) (value) );
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						return value;
					}
					
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					break;
				}
				
				
				case 96198050:
				{
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					if (field.equals("flattenPackage")) 
					{
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						this.flattenPackage = haxe.lang.Runtime.toBool(value);
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						return value;
					}
					
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					break;
				}
				
				
				case -1336895037:
				{
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					if (field.equals("onStart")) 
					{
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						this.onStart = ((utest.Notifier) (value) );
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						return value;
					}
					
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					break;
				}
				
				
				case 3506402:
				{
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					if (field.equals("root")) 
					{
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						this.root = ((utest.ui.common.PackageResult) (value) );
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						return value;
					}
					
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					break;
				}
				
				
			}
			
			//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
			if (__temp_executeDef1) 
			{
				//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
		{
			//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
			boolean __temp_executeDef1 = true;
			//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
			switch (field.hashCode())
			{
				case -599445191:
				{
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					if (field.equals("complete")) 
					{
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "complete")) );
					}
					
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					break;
				}
				
				
				case -919806160:
				{
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					if (field.equals("runner")) 
					{
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						return this.runner;
					}
					
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					break;
				}
				
				
				case -1001078227:
				{
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					if (field.equals("progress")) 
					{
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "progress")) );
					}
					
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					break;
				}
				
				
				case 96198050:
				{
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					if (field.equals("flattenPackage")) 
					{
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						return this.flattenPackage;
					}
					
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					break;
				}
				
				
				case 1403067757:
				{
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					if (field.equals("createFixture")) 
					{
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "createFixture")) );
					}
					
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					break;
				}
				
				
				case 3506402:
				{
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					if (field.equals("root")) 
					{
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						return this.root;
					}
					
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					break;
				}
				
				
				case -642043837:
				{
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					if (field.equals("getOrCreateClass")) 
					{
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getOrCreateClass")) );
					}
					
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					break;
				}
				
				
				case -1336895037:
				{
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					if (field.equals("onStart")) 
					{
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						return this.onStart;
					}
					
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					break;
				}
				
				
				case -189516719:
				{
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					if (field.equals("getOrCreatePackage")) 
					{
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getOrCreatePackage")) );
					}
					
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					break;
				}
				
				
				case -2124458952:
				{
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					if (field.equals("onComplete")) 
					{
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						return this.onComplete;
					}
					
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					break;
				}
				
				
				case 109757538:
				{
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					if (field.equals("start")) 
					{
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "start")) );
					}
					
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					break;
				}
				
				
				case 1768875308:
				{
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					if (field.equals("onProgress")) 
					{
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						return this.onProgress;
					}
					
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					break;
				}
				
				
			}
			
			//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
			if (__temp_executeDef1) 
			{
				//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
		{
			//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
			boolean __temp_executeDef1 = true;
			//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
			switch (field.hashCode())
			{
				case -599445191:
				{
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					if (field.equals("complete")) 
					{
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						this.complete(((utest.Runner) (dynargs.__get(0)) ));
					}
					
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					break;
				}
				
				
				case 109757538:
				{
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					if (field.equals("start")) 
					{
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						this.start(((utest.Runner) (dynargs.__get(0)) ));
					}
					
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					break;
				}
				
				
				case -1001078227:
				{
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					if (field.equals("progress")) 
					{
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						this.progress(dynargs.__get(0));
					}
					
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					break;
				}
				
				
				case -189516719:
				{
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					if (field.equals("getOrCreatePackage")) 
					{
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						return this.getOrCreatePackage(haxe.lang.Runtime.toString(dynargs.__get(0)), haxe.lang.Runtime.toBool(dynargs.__get(1)), ((utest.ui.common.PackageResult) (dynargs.__get(2)) ));
					}
					
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					break;
				}
				
				
				case 1403067757:
				{
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					if (field.equals("createFixture")) 
					{
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						return this.createFixture(((utest.TestResult) (dynargs.__get(0)) ));
					}
					
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					break;
				}
				
				
				case -642043837:
				{
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					if (field.equals("getOrCreateClass")) 
					{
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						__temp_executeDef1 = false;
						//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
						return this.getOrCreateClass(((utest.ui.common.PackageResult) (dynargs.__get(0)) ), haxe.lang.Runtime.toString(dynargs.__get(1)), haxe.lang.Runtime.toString(dynargs.__get(2)), haxe.lang.Runtime.toString(dynargs.__get(3)));
					}
					
					//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
					break;
				}
				
				
			}
			
			//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
			if (__temp_executeDef1) 
			{
				//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
		baseArr.push("onProgress");
		//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
		baseArr.push("onComplete");
		//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
		baseArr.push("onStart");
		//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
		baseArr.push("root");
		//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
		baseArr.push("flattenPackage");
		//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
		baseArr.push("runner");
		//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
		{
			//line 7 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ResultAggregator.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


