// Generated by Haxe 3.3.0
package thx.promise._Promise;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Promise_Impl__create_80__Fun<T> extends haxe.lang.Function
{
	public Promise_Impl__create_80__Fun(haxe.lang.Function callback)
	{
		//line 81 "/shared/promise/src/thx/promise/Promise.hx"
		super(1, 0);
		//line 81 "/shared/promise/src/thx/promise/Promise.hx"
		this.callback = callback;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 80 "/shared/promise/src/thx/promise/Promise.hx"
		haxe.lang.Function cb = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((haxe.lang.Function) (((java.lang.Object) (__fn_float1) )) )) : (((haxe.lang.Function) (__fn_dyn1) )) );
		//line 82 "/shared/promise/src/thx/promise/Promise.hx"
		try 
		{
			//line 82 "/shared/promise/src/thx/promise/Promise.hx"
			this.callback.__hx_invoke2_o(0.0, new thx.promise._Promise.Promise_Impl__create_83__Fun<T>(cb), 0.0, new thx.promise._Promise.Promise_Impl__create_84__Fun<T>(cb));
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 82 "/shared/promise/src/thx/promise/Promise.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 87 "/shared/promise/src/thx/promise/Promise.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 87 "/shared/promise/src/thx/promise/Promise.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 87 "/shared/promise/src/thx/promise/Promise.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 87 "/shared/promise/src/thx/promise/Promise.hx"
			{
				//line 87 "/shared/promise/src/thx/promise/Promise.hx"
				java.lang.Object e1 = __temp_catchall2;
				//line 87 "/shared/promise/src/thx/promise/Promise.hx"
				cb.__hx_invoke1_o(0.0, ((thx.Either) (thx.Either.Left(thx.Error.fromDynamic(e1, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.promise._Promise.Promise_Impl_", "Promise.hx", "create"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (87) )) )})))) ));
			}
			
		}
		
		
		//line 81 "/shared/promise/src/thx/promise/Promise.hx"
		return null;
	}
	
	
	public haxe.lang.Function callback;
	
}


