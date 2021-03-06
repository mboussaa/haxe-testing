// Generated by Haxe 3.3.0
package utest.ui.common;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ClassResult extends haxe.lang.HxObject
{
	public ClassResult(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public ClassResult(java.lang.String className, java.lang.String setupName, java.lang.String teardownName)
	{
		//line 16 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
		utest.ui.common.ClassResult.__hx_ctor_utest_ui_common_ClassResult(this, className, setupName, teardownName);
	}
	
	
	public static void __hx_ctor_utest_ui_common_ClassResult(utest.ui.common.ClassResult __temp_me187, java.lang.String className, java.lang.String setupName, java.lang.String teardownName)
	{
		//line 17 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
		__temp_me187.fixtures = new haxe.ds.StringMap<utest.ui.common.FixtureResult>();
		//line 18 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
		__temp_me187.className = className;
		//line 19 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
		__temp_me187.setupName = setupName;
		//line 20 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
		__temp_me187.hasSetup = ( setupName != null );
		//line 21 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
		__temp_me187.teardownName = teardownName;
		//line 22 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
		__temp_me187.hasTeardown = ( teardownName != null );
		//line 24 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
		__temp_me187.methods = 0;
		//line 25 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
		__temp_me187.stats = new utest.ui.common.ResultStats();
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
		return new utest.ui.common.ClassResult(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
		return new utest.ui.common.ClassResult(haxe.lang.Runtime.toString(arr.__get(0)), haxe.lang.Runtime.toString(arr.__get(1)), haxe.lang.Runtime.toString(arr.__get(2)));
	}
	
	
	public haxe.ds.StringMap<utest.ui.common.FixtureResult> fixtures;
	
	public java.lang.String className;
	
	public java.lang.String setupName;
	
	public java.lang.String teardownName;
	
	public boolean hasSetup;
	
	public boolean hasTeardown;
	
	public int methods;
	
	public utest.ui.common.ResultStats stats;
	
	public void add(utest.ui.common.FixtureResult result)
	{
		//line 29 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
		if (this.fixtures.exists(result.methodName)) 
		{
			//line 29 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
			throw haxe.lang.HaxeException.wrap("invalid duplicated fixture result");
		}
		
		//line 31 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
		this.stats.wire(result.stats);
		//line 33 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
		this.methods++;
		//line 34 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
		this.fixtures.set(result.methodName, result);
	}
	
	
	public utest.ui.common.FixtureResult get(java.lang.String method)
	{
		//line 38 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
		return ((utest.ui.common.FixtureResult) (this.fixtures.get(method)) );
	}
	
	
	public boolean exists(java.lang.String method)
	{
		//line 41 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
		return this.fixtures.exists(method);
	}
	
	
	public haxe.root.Array<java.lang.String> methodNames(java.lang.Object errorsHavePriority)
	{
		//line 43 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
		boolean __temp_errorsHavePriority186 = ( (haxe.lang.Runtime.eq(errorsHavePriority, null)) ? (true) : (haxe.lang.Runtime.toBool(errorsHavePriority)) );
		//line 44 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
		haxe.root.Array<java.lang.String> names = new haxe.root.Array<java.lang.String>(new java.lang.String[]{});
		//line 45 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
		{
			//line 45 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
			java.lang.Object tmp = this.fixtures.keys();
			//line 45 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
			while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(tmp, "hasNext", null)))
			{
				//line 45 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
				java.lang.String name = haxe.lang.Runtime.toString(haxe.lang.Runtime.callField(tmp, "next", null));
				//line 46 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
				names.push(name);
			}
			
		}
		
		//line 47 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
		if (__temp_errorsHavePriority186) 
		{
			//line 48 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
			utest.ui.common.ClassResult me = this;
			//line 49 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
			names.sort(new utest.ui.common.ClassResult_methodNames_49__Fun(me));
		}
		else
		{
			//line 69 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
			names.sort(( (( utest.ui.common.ClassResult_methodNames_69__Fun.__hx_current != null )) ? (utest.ui.common.ClassResult_methodNames_69__Fun.__hx_current) : (utest.ui.common.ClassResult_methodNames_69__Fun.__hx_current = ((utest.ui.common.ClassResult_methodNames_69__Fun) (new utest.ui.common.ClassResult_methodNames_69__Fun()) )) ));
		}
		
		//line 73 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
		return names;
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
		{
			//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
			switch (field.hashCode())
			{
				case 955534258:
				{
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					if (field.equals("methods")) 
					{
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						this.methods = ((int) (value) );
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						return value;
					}
					
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					break;
				}
				
				
			}
			
			//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
		{
			//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
			switch (field.hashCode())
			{
				case 109757599:
				{
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					if (field.equals("stats")) 
					{
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						this.stats = ((utest.ui.common.ResultStats) (value) );
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						return value;
					}
					
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					break;
				}
				
				
				case -377141366:
				{
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					if (field.equals("fixtures")) 
					{
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						this.fixtures = ((haxe.ds.StringMap<utest.ui.common.FixtureResult>) (value) );
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						return value;
					}
					
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					break;
				}
				
				
				case 955534258:
				{
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					if (field.equals("methods")) 
					{
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						this.methods = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						return value;
					}
					
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					break;
				}
				
				
				case -9888733:
				{
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					if (field.equals("className")) 
					{
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						this.className = haxe.lang.Runtime.toString(value);
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						return value;
					}
					
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					break;
				}
				
				
				case 1210983102:
				{
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					if (field.equals("hasTeardown")) 
					{
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						this.hasTeardown = haxe.lang.Runtime.toBool(value);
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						return value;
					}
					
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					break;
				}
				
				
				case 1558028968:
				{
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					if (field.equals("setupName")) 
					{
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						this.setupName = haxe.lang.Runtime.toString(value);
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						return value;
					}
					
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					break;
				}
				
				
				case 129320963:
				{
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					if (field.equals("hasSetup")) 
					{
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						this.hasSetup = haxe.lang.Runtime.toBool(value);
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						return value;
					}
					
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					break;
				}
				
				
				case 638825135:
				{
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					if (field.equals("teardownName")) 
					{
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						this.teardownName = haxe.lang.Runtime.toString(value);
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						return value;
					}
					
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					break;
				}
				
				
			}
			
			//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
		{
			//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
			switch (field.hashCode())
			{
				case -943228185:
				{
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					if (field.equals("methodNames")) 
					{
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "methodNames")) );
					}
					
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					break;
				}
				
				
				case -377141366:
				{
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					if (field.equals("fixtures")) 
					{
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						return this.fixtures;
					}
					
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					break;
				}
				
				
				case -1289358244:
				{
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					if (field.equals("exists")) 
					{
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "exists")) );
					}
					
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					break;
				}
				
				
				case -9888733:
				{
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					if (field.equals("className")) 
					{
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						return this.className;
					}
					
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					break;
				}
				
				
				case 102230:
				{
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					if (field.equals("get")) 
					{
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get")) );
					}
					
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					break;
				}
				
				
				case 1558028968:
				{
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					if (field.equals("setupName")) 
					{
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						return this.setupName;
					}
					
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					break;
				}
				
				
				case 96417:
				{
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					if (field.equals("add")) 
					{
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "add")) );
					}
					
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					break;
				}
				
				
				case 638825135:
				{
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					if (field.equals("teardownName")) 
					{
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						return this.teardownName;
					}
					
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					break;
				}
				
				
				case 109757599:
				{
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					if (field.equals("stats")) 
					{
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						return this.stats;
					}
					
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					break;
				}
				
				
				case 129320963:
				{
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					if (field.equals("hasSetup")) 
					{
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						return this.hasSetup;
					}
					
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					break;
				}
				
				
				case 955534258:
				{
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					if (field.equals("methods")) 
					{
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						return this.methods;
					}
					
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					break;
				}
				
				
				case 1210983102:
				{
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					if (field.equals("hasTeardown")) 
					{
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						return this.hasTeardown;
					}
					
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					break;
				}
				
				
			}
			
			//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
		{
			//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
			switch (field.hashCode())
			{
				case 955534258:
				{
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					if (field.equals("methods")) 
					{
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						return ((double) (this.methods) );
					}
					
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					break;
				}
				
				
			}
			
			//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
		{
			//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
			switch (field.hashCode())
			{
				case -943228185:
				{
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					if (field.equals("methodNames")) 
					{
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						return this.methodNames(dynargs.__get(0));
					}
					
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					break;
				}
				
				
				case 96417:
				{
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					if (field.equals("add")) 
					{
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						this.add(((utest.ui.common.FixtureResult) (dynargs.__get(0)) ));
					}
					
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					break;
				}
				
				
				case -1289358244:
				{
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					if (field.equals("exists")) 
					{
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						return this.exists(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					break;
				}
				
				
				case 102230:
				{
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					if (field.equals("get")) 
					{
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
						return this.get(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
					break;
				}
				
				
			}
			
			//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
		baseArr.push("stats");
		//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
		baseArr.push("methods");
		//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
		baseArr.push("hasTeardown");
		//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
		baseArr.push("hasSetup");
		//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
		baseArr.push("teardownName");
		//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
		baseArr.push("setupName");
		//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
		baseArr.push("className");
		//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
		baseArr.push("fixtures");
		//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
		{
			//line 5 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/ClassResult.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


