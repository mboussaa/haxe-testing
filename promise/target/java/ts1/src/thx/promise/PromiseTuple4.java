// Generated by Haxe 3.3.0
package thx.promise;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class PromiseTuple4 extends haxe.lang.HxObject
{
	public PromiseTuple4(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public PromiseTuple4()
	{
		//line 398 "/shared/promise/src/thx/promise/Promise.hx"
		thx.promise.PromiseTuple4.__hx_ctor_thx_promise_PromiseTuple4(this);
	}
	
	
	public static void __hx_ctor_thx_promise_PromiseTuple4(thx.promise.PromiseTuple4 __temp_me126)
	{
	}
	
	
	public static <T1, T2, T3, T4, T5> thx.promise.Future<thx.Either> join(thx.promise.Future<thx.Either> p1, thx.promise.Future<thx.Either> p2)
	{
		//line 400 "/shared/promise/src/thx/promise/Promise.hx"
		return ((thx.promise.Future<thx.Either>) (thx.promise.Promises.par(((haxe.lang.Function) (new thx.promise.PromiseTuple4_join_400__Fun<T5, T4, T3, T2, T1>()) ), ((thx.promise.Future<thx.Either>) (p1) ), ((thx.promise.Future<thx.Either>) (p2) ))) );
	}
	
	
	public static <T1, T2, T3, T4, TOut> thx.promise.Future<thx.Either> mapTuplePromise(thx.promise.Future<thx.Either> promise, haxe.lang.Function success)
	{
		//line 403 "/shared/promise/src/thx/promise/Promise.hx"
		return ((thx.promise.Future<thx.Either>) (thx.promise._Promise.Promise_Impl_.flatMapEither(((thx.promise.Future<thx.Either>) (promise) ), ((haxe.lang.Function) (new thx.promise.PromiseTuple4_mapTuplePromise_403__Fun_0<TOut, T4, T3, T2, T1>(success)) ), ((haxe.lang.Function) (new thx.promise.PromiseTuple4_mapTuplePromise_403__Fun<TOut>()) ))) );
	}
	
	
	public static <T1, T2, T3, T4, TOut> thx.promise.Future<thx.Either> mapTuple(thx.promise.Future<thx.Either> promise, haxe.lang.Function success)
	{
		//line 408 "/shared/promise/src/thx/promise/Promise.hx"
		return ((thx.promise.Future<thx.Either>) (thx.promise._Promise.Promise_Impl_.map(((thx.promise.Future<thx.Either>) (promise) ), ((haxe.lang.Function) (new thx.promise.PromiseTuple4_mapTuple_408__Fun<TOut, T4, T3, T2, T1>(success)) ))) );
	}
	
	
	public static <T1, T2, T3, T4> thx.promise.Future<thx.Either> tuple(thx.promise.Future<thx.Either> promise, haxe.lang.Function success, haxe.lang.Function failure)
	{
		//line 413 "/shared/promise/src/thx/promise/Promise.hx"
		return ((thx.promise.Future<thx.Either>) (thx.promise._Promise.Promise_Impl_.either(((thx.promise.Future<thx.Either>) (promise) ), ((haxe.lang.Function) (new thx.promise.PromiseTuple4_tuple_414__Fun<T4, T3, T2, T1>(success)) ), ((haxe.lang.Function) (( (( null == failure )) ? (( (( thx.promise.PromiseTuple4_tuple_415__Fun.__hx_current != null )) ? (thx.promise.PromiseTuple4_tuple_415__Fun.__hx_current) : (thx.promise.PromiseTuple4_tuple_415__Fun.__hx_current = ((thx.promise.PromiseTuple4_tuple_415__Fun) (new thx.promise.PromiseTuple4_tuple_415__Fun()) )) )) : (failure) )) ))) );
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 398 "/shared/promise/src/thx/promise/Promise.hx"
		return new thx.promise.PromiseTuple4(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 398 "/shared/promise/src/thx/promise/Promise.hx"
		return new thx.promise.PromiseTuple4();
	}
	
	
}


