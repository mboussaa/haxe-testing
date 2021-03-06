// Generated by Haxe 3.3.0
package thx.promise;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Future<T> extends haxe.lang.HxObject
{
	public Future(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Future()
	{
		//line 64 "/shared/promise/src/thx/promise/Future.hx"
		thx.promise.Future.__hx_ctor_thx_promise_Future(((thx.promise.Future<T>) (this) ));
	}
	
	
	public static <T_c> void __hx_ctor_thx_promise_Future(thx.promise.Future<T_c> __temp_me115)
	{
		//line 65 "/shared/promise/src/thx/promise/Future.hx"
		__temp_me115.handlers = new haxe.root.Array<haxe.lang.Function>(( (haxe.lang.Function[]) (new haxe.lang.Function[] {}) ));
		//line 66 "/shared/promise/src/thx/promise/Future.hx"
		__temp_me115.state = haxe.ds.Option.None;
	}
	
	
	public static <T1> thx.promise.Future<haxe.root.Array<T1>> sequence(haxe.root.Array<thx.promise.Future<T1>> arr)
	{
		//line 12 "/shared/promise/src/thx/promise/Future.hx"
		return ((thx.promise.Future<haxe.root.Array<T1>>) (((thx.promise.Future) (thx.promise.Future.create(((haxe.lang.Function) (new thx.promise.Future_sequence_12__Fun<T1>(arr)) ))) )) );
	}
	
	
	public static <T2> thx.promise.Future<thx.Nil> afterAll(haxe.root.Array<thx.promise.Future<T2>> arr)
	{
		//line 28 "/shared/promise/src/thx/promise/Future.hx"
		return ((thx.promise.Future<thx.Nil>) (((thx.promise.Future) (thx.promise.Future.create(((haxe.lang.Function) (new thx.promise.Future_afterAll_28__Fun<T2>(arr)) ))) )) );
	}
	
	
	public static <T3> thx.promise.Future<haxe.root.Array<T3>> all(haxe.root.Array<thx.promise.Future<T3>> arr)
	{
		//line 46 "/shared/promise/src/thx/promise/Future.hx"
		return ((thx.promise.Future<haxe.root.Array<T3>>) (thx.promise.Future.sequence(((haxe.root.Array<thx.promise.Future<T3>>) (arr) ))) );
	}
	
	
	public static <T4> thx.promise.Future<T4> create(haxe.lang.Function handler)
	{
		//line 49 "/shared/promise/src/thx/promise/Future.hx"
		thx.promise.Future<T4> future = new thx.promise.Future<T4>();
		//line 50 "/shared/promise/src/thx/promise/Future.hx"
		handler.__hx_invoke1_o(0.0, ((haxe.lang.Function) (new haxe.lang.Closure(future, "setState")) ));
		//line 51 "/shared/promise/src/thx/promise/Future.hx"
		return future;
	}
	
	
	public static <T5> thx.promise.Future<T5> flatten(thx.promise.Future<thx.promise.Future<T5>> future)
	{
		//line 55 "/shared/promise/src/thx/promise/Future.hx"
		return ((thx.promise.Future<T5>) (((thx.promise.Future) (thx.promise.Future.create(((haxe.lang.Function) (new thx.promise.Future_flatten_55__Fun<T5>(future)) ))) )) );
	}
	
	
	public static <T6> thx.promise.Future<T6> value(T6 v)
	{
		//line 60 "/shared/promise/src/thx/promise/Future.hx"
		return ((thx.promise.Future<T6>) (((thx.promise.Future) (thx.promise.Future.create(((haxe.lang.Function) (new thx.promise.Future_value_60__Fun<T6>(v)) ))) )) );
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 10 "/shared/promise/src/thx/promise/Future.hx"
		return new thx.promise.Future<java.lang.Object>(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 10 "/shared/promise/src/thx/promise/Future.hx"
		return new thx.promise.Future<java.lang.Object>();
	}
	
	
	public haxe.root.Array<haxe.lang.Function> handlers;
	
	public haxe.ds.Option state;
	
	public final boolean hasValue()
	{
		//line 79 "/shared/promise/src/thx/promise/Future.hx"
		return ((boolean) (thx.Options.toBool(((haxe.ds.Option) (this.state) ))) );
	}
	
	
	public <TOut> thx.promise.Future<TOut> map(haxe.lang.Function handler)
	{
		//line 81 "/shared/promise/src/thx/promise/Future.hx"
		thx.promise.Future<T> _gthis = this;
		//line 82 "/shared/promise/src/thx/promise/Future.hx"
		return ((thx.promise.Future<TOut>) (((thx.promise.Future) (thx.promise.Future.create(((haxe.lang.Function) (new thx.promise.Future_map_82__Fun<T, TOut>(handler, _gthis)) ))) )) );
	}
	
	
	public <TOut> thx.promise.Future<TOut> mapAsync(haxe.lang.Function handler)
	{
		//line 85 "/shared/promise/src/thx/promise/Future.hx"
		thx.promise.Future<T> _gthis = this;
		//line 86 "/shared/promise/src/thx/promise/Future.hx"
		return ((thx.promise.Future<TOut>) (((thx.promise.Future) (thx.promise.Future.create(((haxe.lang.Function) (new thx.promise.Future_mapAsync_86__Fun<T, TOut>(handler, _gthis)) ))) )) );
	}
	
	
	public <TOut> thx.promise.Future<thx.Either> mapPromise(haxe.lang.Function handler)
	{
		//line 90 "/shared/promise/src/thx/promise/Future.hx"
		thx.promise.Future<T> _gthis = this;
		//line 91 "/shared/promise/src/thx/promise/Future.hx"
		return ((thx.promise.Future<thx.Either>) (thx.promise._Promise.Promise_Impl_.create(((haxe.lang.Function) (new thx.promise.Future_mapPromise_91__Fun<T, TOut>(handler, _gthis)) ))) );
	}
	
	
	public thx.promise.Future<thx.Nil> nil()
	{
		//line 98 "/shared/promise/src/thx/promise/Future.hx"
		return ((thx.promise.Future<thx.Nil>) (((thx.promise.Future) (this.map(((haxe.lang.Function) (new thx.promise.Future_nil_98__Fun<T>()) ))) )) );
	}
	
	
	public final <TOut> thx.promise.Future<TOut> mapFuture(haxe.lang.Function handler)
	{
		//line 102 "/shared/promise/src/thx/promise/Future.hx"
		return ((thx.promise.Future<TOut>) (((thx.promise.Future) (this.flatMap(((haxe.lang.Function) (handler) ))) )) );
	}
	
	
	public <TOut> thx.promise.Future<TOut> flatMap(haxe.lang.Function handler)
	{
		//line 104 "/shared/promise/src/thx/promise/Future.hx"
		thx.promise.Future<T> _gthis = this;
		//line 105 "/shared/promise/src/thx/promise/Future.hx"
		return ((thx.promise.Future<TOut>) (((thx.promise.Future) (thx.promise.Future.create(((haxe.lang.Function) (new thx.promise.Future_flatMap_105__Fun<T, TOut>(handler, _gthis)) ))) )) );
	}
	
	
	public thx.promise.Future<T> then(haxe.lang.Function handler)
	{
		//line 109 "/shared/promise/src/thx/promise/Future.hx"
		this.handlers.push(handler);
		//line 110 "/shared/promise/src/thx/promise/Future.hx"
		this.update();
		//line 111 "/shared/promise/src/thx/promise/Future.hx"
		return this;
	}
	
	
	@Override public java.lang.String toString()
	{
		//line 114 "/shared/promise/src/thx/promise/Future.hx"
		return "Future";
	}
	
	
	public thx.promise.Future<T> setState(T newstate)
	{
		//line 117 "/shared/promise/src/thx/promise/Future.hx"
		{
			//line 117 "/shared/promise/src/thx/promise/Future.hx"
			haxe.ds.Option _g = this.state;
			//line 117 "/shared/promise/src/thx/promise/Future.hx"
			switch (_g.index)
			{
				case 0:
				{
					//line 120 "/shared/promise/src/thx/promise/Future.hx"
					T r = ((T) (_g.params[0]) );
					//line 121 "/shared/promise/src/thx/promise/Future.hx"
					throw haxe.lang.HaxeException.wrap(new thx.Error(( ( ( ( "future was already \"" + haxe.root.Std.string(r) ) + "\", can\'t apply the new state \"" ) + haxe.root.Std.string(newstate) ) + "\"" ), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.promise.Future", "Future.hx", "setState"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (121) )) )})));
				}
				
				
				case 1:
				{
					//line 119 "/shared/promise/src/thx/promise/Future.hx"
					this.state = haxe.ds.Option.Some(newstate);
					//line 119 "/shared/promise/src/thx/promise/Future.hx"
					break;
				}
				
				
			}
			
		}
		
		//line 123 "/shared/promise/src/thx/promise/Future.hx"
		this.update();
		//line 124 "/shared/promise/src/thx/promise/Future.hx"
		return this;
	}
	
	
	public void update()
	{
		//line 128 "/shared/promise/src/thx/promise/Future.hx"
		haxe.ds.Option _g = this.state;
		//line 128 "/shared/promise/src/thx/promise/Future.hx"
		switch (_g.index)
		{
			case 0:
			{
				//line 130 "/shared/promise/src/thx/promise/Future.hx"
				T result = ((T) (_g.params[0]) );
				//line 130 "/shared/promise/src/thx/promise/Future.hx"
				{
					//line 131 "/shared/promise/src/thx/promise/Future.hx"
					int index = -1;
					//line 132 "/shared/promise/src/thx/promise/Future.hx"
					while ((  ++ index < this.handlers.length ))
					{
						//line 133 "/shared/promise/src/thx/promise/Future.hx"
						haxe.lang.Function handler = this.handlers.__get(index);
						//line 134 "/shared/promise/src/thx/promise/Future.hx"
						handler.__hx_invoke1_o(0.0, result);
					}
					
					//line 136 "/shared/promise/src/thx/promise/Future.hx"
					this.handlers = new haxe.root.Array<haxe.lang.Function>(( (haxe.lang.Function[]) (new haxe.lang.Function[] {}) ));
				}
				
				//line 130 "/shared/promise/src/thx/promise/Future.hx"
				break;
			}
			
			
			case 1:
			{
				//line 129 "/shared/promise/src/thx/promise/Future.hx"
				break;
			}
			
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 10 "/shared/promise/src/thx/promise/Future.hx"
		{
			//line 10 "/shared/promise/src/thx/promise/Future.hx"
			boolean __temp_executeDef1 = true;
			//line 10 "/shared/promise/src/thx/promise/Future.hx"
			switch (field.hashCode())
			{
				case 109757585:
				{
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					if (field.equals("state")) 
					{
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						this.state = ((haxe.ds.Option) (value) );
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						return value;
					}
					
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					break;
				}
				
				
				case 2069097:
				{
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					if (field.equals("handlers")) 
					{
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						this.handlers = ((haxe.root.Array<haxe.lang.Function>) (value) );
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						return value;
					}
					
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					break;
				}
				
				
			}
			
			//line 10 "/shared/promise/src/thx/promise/Future.hx"
			if (__temp_executeDef1) 
			{
				//line 10 "/shared/promise/src/thx/promise/Future.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 10 "/shared/promise/src/thx/promise/Future.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 10 "/shared/promise/src/thx/promise/Future.hx"
		{
			//line 10 "/shared/promise/src/thx/promise/Future.hx"
			boolean __temp_executeDef1 = true;
			//line 10 "/shared/promise/src/thx/promise/Future.hx"
			switch (field.hashCode())
			{
				case -838846263:
				{
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					if (field.equals("update")) 
					{
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "update")) );
					}
					
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					break;
				}
				
				
				case 2069097:
				{
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					if (field.equals("handlers")) 
					{
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						return this.handlers;
					}
					
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					break;
				}
				
				
				case 1404470607:
				{
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					if (field.equals("setState")) 
					{
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setState")) );
					}
					
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					break;
				}
				
				
				case 109757585:
				{
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					if (field.equals("state")) 
					{
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						return this.state;
					}
					
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					break;
				}
				
				
				case -1776922004:
				{
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					if (field.equals("toString")) 
					{
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toString")) );
					}
					
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					break;
				}
				
				
				case 131964663:
				{
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					if (field.equals("hasValue")) 
					{
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "hasValue")) );
					}
					
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					break;
				}
				
				
				case 3558941:
				{
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					if (field.equals("then")) 
					{
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "then")) );
					}
					
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					break;
				}
				
				
				case 107868:
				{
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					if (field.equals("map")) 
					{
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "map")) );
					}
					
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					break;
				}
				
				
				case -778842333:
				{
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					if (field.equals("flatMap")) 
					{
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "flatMap")) );
					}
					
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					break;
				}
				
				
				case 151348864:
				{
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					if (field.equals("mapAsync")) 
					{
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "mapAsync")) );
					}
					
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					break;
				}
				
				
				case 541698623:
				{
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					if (field.equals("mapFuture")) 
					{
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "mapFuture")) );
					}
					
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					break;
				}
				
				
				case -192861153:
				{
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					if (field.equals("mapPromise")) 
					{
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "mapPromise")) );
					}
					
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					break;
				}
				
				
				case 109073:
				{
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					if (field.equals("nil")) 
					{
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "nil")) );
					}
					
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					break;
				}
				
				
			}
			
			//line 10 "/shared/promise/src/thx/promise/Future.hx"
			if (__temp_executeDef1) 
			{
				//line 10 "/shared/promise/src/thx/promise/Future.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 10 "/shared/promise/src/thx/promise/Future.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 10 "/shared/promise/src/thx/promise/Future.hx"
		{
			//line 10 "/shared/promise/src/thx/promise/Future.hx"
			boolean __temp_executeDef1 = true;
			//line 10 "/shared/promise/src/thx/promise/Future.hx"
			switch (field.hashCode())
			{
				case -838846263:
				{
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					if (field.equals("update")) 
					{
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						this.update();
					}
					
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					break;
				}
				
				
				case 131964663:
				{
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					if (field.equals("hasValue")) 
					{
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						return this.hasValue();
					}
					
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					break;
				}
				
				
				case 1404470607:
				{
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					if (field.equals("setState")) 
					{
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						return this.setState(((T) (dynargs.__get(0)) ));
					}
					
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					break;
				}
				
				
				case 107868:
				{
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					if (field.equals("map")) 
					{
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						return ((thx.promise.Future<java.lang.Object>) (this.map(((haxe.lang.Function) (dynargs.__get(0)) ))) );
					}
					
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					break;
				}
				
				
				case -1776922004:
				{
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					if (field.equals("toString")) 
					{
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						return this.toString();
					}
					
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					break;
				}
				
				
				case 151348864:
				{
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					if (field.equals("mapAsync")) 
					{
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						return ((thx.promise.Future<java.lang.Object>) (this.mapAsync(((haxe.lang.Function) (dynargs.__get(0)) ))) );
					}
					
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					break;
				}
				
				
				case 3558941:
				{
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					if (field.equals("then")) 
					{
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						return this.then(((haxe.lang.Function) (dynargs.__get(0)) ));
					}
					
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					break;
				}
				
				
				case -192861153:
				{
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					if (field.equals("mapPromise")) 
					{
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						return ((thx.promise.Future<thx.Either>) (this.mapPromise(((haxe.lang.Function) (dynargs.__get(0)) ))) );
					}
					
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					break;
				}
				
				
				case -778842333:
				{
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					if (field.equals("flatMap")) 
					{
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						return ((thx.promise.Future<java.lang.Object>) (this.flatMap(((haxe.lang.Function) (dynargs.__get(0)) ))) );
					}
					
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					break;
				}
				
				
				case 109073:
				{
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					if (field.equals("nil")) 
					{
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						return this.nil();
					}
					
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					break;
				}
				
				
				case 541698623:
				{
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					if (field.equals("mapFuture")) 
					{
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/promise/src/thx/promise/Future.hx"
						return ((thx.promise.Future<java.lang.Object>) (this.mapFuture(((haxe.lang.Function) (dynargs.__get(0)) ))) );
					}
					
					//line 10 "/shared/promise/src/thx/promise/Future.hx"
					break;
				}
				
				
			}
			
			//line 10 "/shared/promise/src/thx/promise/Future.hx"
			if (__temp_executeDef1) 
			{
				//line 10 "/shared/promise/src/thx/promise/Future.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 10 "/shared/promise/src/thx/promise/Future.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 10 "/shared/promise/src/thx/promise/Future.hx"
		baseArr.push("state");
		//line 10 "/shared/promise/src/thx/promise/Future.hx"
		baseArr.push("handlers");
		//line 10 "/shared/promise/src/thx/promise/Future.hx"
		{
			//line 10 "/shared/promise/src/thx/promise/Future.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


