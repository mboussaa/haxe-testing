// Generated by Haxe 3.3.0
package utest;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Runner extends haxe.lang.HxObject
{
	public Runner(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Runner()
	{
		//line 62 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		utest.Runner.__hx_ctor_utest_Runner(this);
	}
	
	
	public static void __hx_ctor_utest_Runner(utest.Runner __temp_me254)
	{
		//line 57 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		__temp_me254.globalPattern = null;
		//line 63 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		__temp_me254.fixtures = new haxe.root.Array<utest.TestFixture>();
		//line 64 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		__temp_me254.onProgress = new utest.Dispatcher<java.lang.Object>();
		//line 65 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		__temp_me254.onStart = new utest.Dispatcher<utest.Runner>();
		//line 66 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		__temp_me254.onComplete = new utest.Dispatcher<utest.Runner>();
		//line 67 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		__temp_me254.onPrecheck = new utest.Dispatcher<utest.TestHandler<utest.TestFixture>>();
		//line 68 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		__temp_me254.onTestStart = new utest.Dispatcher<utest.TestHandler<utest.TestFixture>>();
		//line 69 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		__temp_me254.onTestComplete = new utest.Dispatcher<utest.TestHandler<utest.TestFixture>>();
		//line 70 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		__temp_me254.length = 0;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		return new utest.Runner(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		return new utest.Runner();
	}
	
	
	public haxe.root.Array<utest.TestFixture> fixtures;
	
	public utest.Dispatcher<java.lang.Object> onProgress;
	
	public utest.Dispatcher<utest.Runner> onStart;
	
	public utest.Dispatcher<utest.Runner> onComplete;
	
	public utest.Dispatcher<utest.TestHandler<utest.TestFixture>> onPrecheck;
	
	public utest.Dispatcher<utest.TestHandler<utest.TestFixture>> onTestStart;
	
	public utest.Dispatcher<utest.TestHandler<utest.TestFixture>> onTestComplete;
	
	public int length;
	
	public haxe.root.EReg globalPattern;
	
	public void addCase(java.lang.Object test, java.lang.String setup, java.lang.String teardown, java.lang.String prefix, haxe.root.EReg pattern)
	{
		//line 82 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		if (( prefix == null )) 
		{
			//line 82 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
			prefix = "test";
		}
		
		//line 82 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		if (( teardown == null )) 
		{
			//line 82 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
			teardown = "teardown";
		}
		
		//line 82 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		if (( setup == null )) 
		{
			//line 82 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
			setup = "setup";
		}
		
		//line 83 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		if ( ! (haxe.root.Reflect.isObject(test)) ) 
		{
			//line 83 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
			throw haxe.lang.HaxeException.wrap("can\'t add a null object as a test case");
		}
		
		//line 84 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		if ( ! (this.isMethod(test, setup)) ) 
		{
			//line 85 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
			setup = null;
		}
		
		//line 86 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		if ( ! (this.isMethod(test, teardown)) ) 
		{
			//line 87 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
			teardown = null;
		}
		
		//line 88 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		haxe.root.Array<java.lang.String> fields = haxe.root.Type.getInstanceFields(((java.lang.Class) (haxe.root.Type.getClass(((java.lang.Object) (test) ))) ));
		//line 89 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		if (( ( this.globalPattern == null ) && ( pattern == null ) )) 
		{
			//line 90 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
			int _g = 0;
			//line 90 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
			while (( _g < fields.length ))
			{
				//line 90 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
				java.lang.String field = fields.__get(_g);
				//line 90 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
				 ++ _g;
				//line 91 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
				if ( ! (field.startsWith(prefix)) ) 
				{
					//line 91 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					continue;
				}
				
				//line 92 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
				if ( ! (this.isMethod(test, field)) ) 
				{
					//line 92 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					continue;
				}
				
				//line 93 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
				this.addFixture(new utest.TestFixture(test, field, setup, teardown));
			}
			
		}
		else
		{
			//line 96 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
			if (( this.globalPattern != null )) 
			{
				//line 96 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
				pattern = this.globalPattern;
			}
			else
			{
				//line 96 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
				pattern = pattern;
			}
			
			//line 97 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
			{
				//line 97 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
				int _g1 = 0;
				//line 97 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
				while (( _g1 < fields.length ))
				{
					//line 97 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					java.lang.String field1 = fields.__get(_g1);
					//line 97 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					 ++ _g1;
					//line 98 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					if ( ! (pattern.match(field1)) ) 
					{
						//line 98 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						continue;
					}
					
					//line 99 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					if ( ! (this.isMethod(test, field1)) ) 
					{
						//line 99 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						continue;
					}
					
					//line 100 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					this.addFixture(new utest.TestFixture(test, field1, setup, teardown));
				}
				
			}
			
		}
		
	}
	
	
	public void addFixture(utest.TestFixture fixture)
	{
		//line 106 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		this.fixtures.push(fixture);
		//line 107 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		this.length++;
	}
	
	
	public utest.TestFixture getFixture(int index)
	{
		//line 111 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		return this.fixtures.__get(index);
	}
	
	
	public boolean isMethod(java.lang.Object test, java.lang.String name)
	{
		//line 116 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		try 
		{
			//line 116 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
			return haxe.root.Reflect.isFunction(haxe.root.Reflect.field(test, name));
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 116 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 118 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 118 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 118 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 118 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
			{
				//line 118 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
				java.lang.Object e = __temp_catchall2;
				//line 118 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
				return false;
			}
			
		}
		
		
	}
	
	
	public void run()
	{
		//line 123 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		this.onStart.dispatch(this);
		//line 124 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		{
			//line 124 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
			int _g1 = 0;
			//line 124 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
			int _g = this.fixtures.length;
			//line 124 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
			while (( _g1 < _g ))
			{
				//line 124 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
				int i = _g1++;
				//line 126 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
				utest.TestHandler<utest.TestFixture> h = this.runFixture(this.fixtures.__get(i));
				//line 127 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
				this.onTestComplete.dispatch(h);
				//line 128 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
				java.lang.Object __temp_stmt2 = null;
				//line 128 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
				{
					//line 128 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					utest.TestResult __temp_odecl1 = utest.TestResult.ofHandler(((utest.TestHandler) (h) ));
					//line 128 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					__temp_stmt2 = new haxe.lang.DynamicObject(new java.lang.String[]{"result"}, new java.lang.Object[]{__temp_odecl1}, new java.lang.String[]{"done", "totals"}, new double[]{((double) (((double) (( i + 1 )) )) ), ((double) (((double) (this.length) )) )});
				}
				
				//line 128 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
				this.onProgress.dispatch(__temp_stmt2);
			}
			
		}
		
		//line 130 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		this.onComplete.dispatch(this);
	}
	
	
	public utest.TestHandler<utest.TestFixture> runFixture(utest.TestFixture fixture)
	{
		//line 134 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		utest.TestHandler<utest.TestFixture> handler = new utest.TestHandler<utest.TestFixture>(((utest.TestFixture) (fixture) ));
		//line 135 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		handler.onPrecheck.add(((haxe.lang.Function) (new haxe.lang.Closure(this.onPrecheck, "dispatch")) ));
		//line 136 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		this.onTestStart.dispatch(handler);
		//line 137 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		handler.execute();
		//line 138 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		return handler;
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		{
			//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
			switch (field.hashCode())
			{
				case -1106363674:
				{
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					if (field.equals("length")) 
					{
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						__temp_executeDef1 = false;
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						this.length = ((int) (value) );
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						return value;
					}
					
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					break;
				}
				
				
			}
			
			//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		{
			//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
			switch (field.hashCode())
			{
				case 2112795245:
				{
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					if (field.equals("globalPattern")) 
					{
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						__temp_executeDef1 = false;
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						this.globalPattern = ((haxe.root.EReg) (value) );
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						return value;
					}
					
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					break;
				}
				
				
				case -377141366:
				{
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					if (field.equals("fixtures")) 
					{
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						__temp_executeDef1 = false;
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						this.fixtures = ((haxe.root.Array<utest.TestFixture>) (value) );
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						return value;
					}
					
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					break;
				}
				
				
				case -1106363674:
				{
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					if (field.equals("length")) 
					{
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						__temp_executeDef1 = false;
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						this.length = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						return value;
					}
					
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					break;
				}
				
				
				case 1768875308:
				{
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					if (field.equals("onProgress")) 
					{
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						__temp_executeDef1 = false;
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						this.onProgress = ((utest.Dispatcher<java.lang.Object>) (value) );
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						return value;
					}
					
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					break;
				}
				
				
				case 2082190186:
				{
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					if (field.equals("onTestComplete")) 
					{
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						__temp_executeDef1 = false;
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						this.onTestComplete = ((utest.Dispatcher<utest.TestHandler<utest.TestFixture>>) (value) );
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						return value;
					}
					
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					break;
				}
				
				
				case -1336895037:
				{
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					if (field.equals("onStart")) 
					{
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						__temp_executeDef1 = false;
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						this.onStart = ((utest.Dispatcher<utest.Runner>) (value) );
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						return value;
					}
					
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					break;
				}
				
				
				case -1221994543:
				{
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					if (field.equals("onTestStart")) 
					{
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						__temp_executeDef1 = false;
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						this.onTestStart = ((utest.Dispatcher<utest.TestHandler<utest.TestFixture>>) (value) );
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						return value;
					}
					
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					break;
				}
				
				
				case -2124458952:
				{
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					if (field.equals("onComplete")) 
					{
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						__temp_executeDef1 = false;
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						this.onComplete = ((utest.Dispatcher<utest.Runner>) (value) );
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						return value;
					}
					
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					break;
				}
				
				
				case 1478591300:
				{
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					if (field.equals("onPrecheck")) 
					{
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						__temp_executeDef1 = false;
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						this.onPrecheck = ((utest.Dispatcher<utest.TestHandler<utest.TestFixture>>) (value) );
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						return value;
					}
					
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					break;
				}
				
				
			}
			
			//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		{
			//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
			switch (field.hashCode())
			{
				case 1605301502:
				{
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					if (field.equals("runFixture")) 
					{
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						__temp_executeDef1 = false;
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "runFixture")) );
					}
					
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					break;
				}
				
				
				case -377141366:
				{
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					if (field.equals("fixtures")) 
					{
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						__temp_executeDef1 = false;
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						return this.fixtures;
					}
					
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					break;
				}
				
				
				case 113291:
				{
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					if (field.equals("run")) 
					{
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						__temp_executeDef1 = false;
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "run")) );
					}
					
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					break;
				}
				
				
				case 1768875308:
				{
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					if (field.equals("onProgress")) 
					{
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						__temp_executeDef1 = false;
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						return this.onProgress;
					}
					
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					break;
				}
				
				
				case -403520853:
				{
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					if (field.equals("isMethod")) 
					{
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						__temp_executeDef1 = false;
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "isMethod")) );
					}
					
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					break;
				}
				
				
				case -1336895037:
				{
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					if (field.equals("onStart")) 
					{
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						__temp_executeDef1 = false;
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						return this.onStart;
					}
					
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					break;
				}
				
				
				case 193410515:
				{
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					if (field.equals("getFixture")) 
					{
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						__temp_executeDef1 = false;
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getFixture")) );
					}
					
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					break;
				}
				
				
				case -2124458952:
				{
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					if (field.equals("onComplete")) 
					{
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						__temp_executeDef1 = false;
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						return this.onComplete;
					}
					
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					break;
				}
				
				
				case 1064784424:
				{
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					if (field.equals("addFixture")) 
					{
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						__temp_executeDef1 = false;
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "addFixture")) );
					}
					
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					break;
				}
				
				
				case 1478591300:
				{
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					if (field.equals("onPrecheck")) 
					{
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						__temp_executeDef1 = false;
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						return this.onPrecheck;
					}
					
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					break;
				}
				
				
				case -1149096079:
				{
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					if (field.equals("addCase")) 
					{
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						__temp_executeDef1 = false;
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "addCase")) );
					}
					
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					break;
				}
				
				
				case -1221994543:
				{
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					if (field.equals("onTestStart")) 
					{
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						__temp_executeDef1 = false;
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						return this.onTestStart;
					}
					
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					break;
				}
				
				
				case 2112795245:
				{
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					if (field.equals("globalPattern")) 
					{
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						__temp_executeDef1 = false;
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						return this.globalPattern;
					}
					
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					break;
				}
				
				
				case 2082190186:
				{
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					if (field.equals("onTestComplete")) 
					{
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						__temp_executeDef1 = false;
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						return this.onTestComplete;
					}
					
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					break;
				}
				
				
				case -1106363674:
				{
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					if (field.equals("length")) 
					{
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						__temp_executeDef1 = false;
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						return this.length;
					}
					
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					break;
				}
				
				
			}
			
			//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		{
			//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
			switch (field.hashCode())
			{
				case -1106363674:
				{
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					if (field.equals("length")) 
					{
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						__temp_executeDef1 = false;
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						return ((double) (this.length) );
					}
					
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					break;
				}
				
				
			}
			
			//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		{
			//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
			switch (field.hashCode())
			{
				case 1605301502:
				{
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					if (field.equals("runFixture")) 
					{
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						__temp_executeDef1 = false;
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						return this.runFixture(((utest.TestFixture) (dynargs.__get(0)) ));
					}
					
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					break;
				}
				
				
				case -1149096079:
				{
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					if (field.equals("addCase")) 
					{
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						__temp_executeDef1 = false;
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						this.addCase(dynargs.__get(0), haxe.lang.Runtime.toString(dynargs.__get(1)), haxe.lang.Runtime.toString(dynargs.__get(2)), haxe.lang.Runtime.toString(dynargs.__get(3)), ((haxe.root.EReg) (dynargs.__get(4)) ));
					}
					
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					break;
				}
				
				
				case 113291:
				{
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					if (field.equals("run")) 
					{
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						__temp_executeDef1 = false;
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						this.run();
					}
					
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					break;
				}
				
				
				case 1064784424:
				{
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					if (field.equals("addFixture")) 
					{
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						__temp_executeDef1 = false;
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						this.addFixture(((utest.TestFixture) (dynargs.__get(0)) ));
					}
					
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					break;
				}
				
				
				case -403520853:
				{
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					if (field.equals("isMethod")) 
					{
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						__temp_executeDef1 = false;
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						return this.isMethod(dynargs.__get(0), haxe.lang.Runtime.toString(dynargs.__get(1)));
					}
					
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					break;
				}
				
				
				case 193410515:
				{
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					if (field.equals("getFixture")) 
					{
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						__temp_executeDef1 = false;
						//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
						return this.getFixture(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ));
					}
					
					//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
					break;
				}
				
				
			}
			
			//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		baseArr.push("globalPattern");
		//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		baseArr.push("length");
		//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		baseArr.push("onTestComplete");
		//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		baseArr.push("onTestStart");
		//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		baseArr.push("onPrecheck");
		//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		baseArr.push("onComplete");
		//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		baseArr.push("onStart");
		//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		baseArr.push("onProgress");
		//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		baseArr.push("fixtures");
		//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
		{
			//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/Runner.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


