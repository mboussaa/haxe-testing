// Generated by Haxe 3.3.0
package thx.promise;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class PromiseTuple6 extends haxe.lang.HxObject
{
	public PromiseTuple6(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public PromiseTuple6()
	{
		//line 359 "/shared/promise/src/thx/promise/Promise.hx"
		thx.promise.PromiseTuple6.__hx_ctor_thx_promise_PromiseTuple6(this);
	}
	
	
	public static void __hx_ctor_thx_promise_PromiseTuple6(thx.promise.PromiseTuple6 __temp_me124)
	{
	}
	
	
	public static <T1, T2, T3, T4, T5, T6, TOut> thx.promise.Future<thx.Either> mapTuplePromise(thx.promise.Future<thx.Either> promise, haxe.lang.Function success)
	{
		//line 361 "/shared/promise/src/thx/promise/Promise.hx"
		return ((thx.promise.Future<thx.Either>) (thx.promise._Promise.Promise_Impl_.flatMapEither(((thx.promise.Future<thx.Either>) (promise) ), ((haxe.lang.Function) (new thx.promise.PromiseTuple6_mapTuplePromise_361__Fun_0<TOut, T6, T5, T4, T3, T2, T1>(success)) ), ((haxe.lang.Function) (new thx.promise.PromiseTuple6_mapTuplePromise_361__Fun<TOut>()) ))) );
	}
	
	
	public static <T1, T2, T3, T4, T5, T6, TOut> thx.promise.Future<thx.Either> mapTuple(thx.promise.Future<thx.Either> promise, haxe.lang.Function success)
	{
		//line 366 "/shared/promise/src/thx/promise/Promise.hx"
		return ((thx.promise.Future<thx.Either>) (thx.promise._Promise.Promise_Impl_.map(((thx.promise.Future<thx.Either>) (promise) ), ((haxe.lang.Function) (new thx.promise.PromiseTuple6_mapTuple_366__Fun<TOut, T6, T5, T4, T3, T2, T1>(success)) ))) );
	}
	
	
	public static <T1, T2, T3, T4, T5, T6> thx.promise.Future<thx.Either> tuple(thx.promise.Future<thx.Either> promise, haxe.lang.Function success, haxe.lang.Function failure)
	{
		//line 371 "/shared/promise/src/thx/promise/Promise.hx"
		return ((thx.promise.Future<thx.Either>) (thx.promise._Promise.Promise_Impl_.either(((thx.promise.Future<thx.Either>) (promise) ), ((haxe.lang.Function) (new thx.promise.PromiseTuple6_tuple_372__Fun<T6, T5, T4, T3, T2, T1>(success)) ), ((haxe.lang.Function) (( (( null == failure )) ? (( (( thx.promise.PromiseTuple6_tuple_373__Fun.__hx_current != null )) ? (thx.promise.PromiseTuple6_tuple_373__Fun.__hx_current) : (thx.promise.PromiseTuple6_tuple_373__Fun.__hx_current = ((thx.promise.PromiseTuple6_tuple_373__Fun) (new thx.promise.PromiseTuple6_tuple_373__Fun()) )) )) : (failure) )) ))) );
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 359 "/shared/promise/src/thx/promise/Promise.hx"
		return new thx.promise.PromiseTuple6(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 359 "/shared/promise/src/thx/promise/Promise.hx"
		return new thx.promise.PromiseTuple6();
	}
	
	
}


