// Generated by Haxe 3.3.0
package thx.promise;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Promises extends haxe.lang.HxObject
{
	public Promises(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Promises()
	{
		//line 285 "/shared/promise/src/thx/promise/Promise.hx"
		thx.promise.Promises.__hx_ctor_thx_promise_Promises(this);
	}
	
	
	public static void __hx_ctor_thx_promise_Promises(thx.promise.Promises __temp_me123)
	{
	}
	
	
	public static <T1, T2, T3> thx.promise.Future<thx.Either> par(haxe.lang.Function f, thx.promise.Future<thx.Either> p1, thx.promise.Future<thx.Either> p2)
	{
		//line 287 "/shared/promise/src/thx/promise/Promise.hx"
		return ((thx.promise.Future<thx.Either>) (thx.promise._Promise.Promise_Impl_.create(((haxe.lang.Function) (new thx.promise.Promises_par_287__Fun<T2, T1, T3>(p2, p1, f)) ))) );
	}
	
	
	public static <T1, T2, T3, T4> thx.promise.Future<thx.Either> par3(haxe.lang.Function f, thx.promise.Future<thx.Either> p1, thx.promise.Future<thx.Either> p2, thx.promise.Future<thx.Either> p3)
	{
		//line 322 "/shared/promise/src/thx/promise/Promise.hx"
		haxe.lang.Function f1 = f;
		//line 322 "/shared/promise/src/thx/promise/Promise.hx"
		thx.promise.Future<thx.Either> tmp = ((thx.promise.Future<thx.Either>) (thx.promise.Promises.par(((haxe.lang.Function) (new thx.promise.Promises_par3_322__Fun_0<T3, T4, T2, T1>(f1)) ), ((thx.promise.Future<thx.Either>) (p1) ), ((thx.promise.Future<thx.Either>) (p2) ))) );
		//line 322 "/shared/promise/src/thx/promise/Promise.hx"
		return ((thx.promise.Future<thx.Either>) (thx.promise.Promises.par(((haxe.lang.Function) (new thx.promise.Promises_par3_322__Fun<T3, T4>()) ), ((thx.promise.Future<thx.Either>) (tmp) ), ((thx.promise.Future<thx.Either>) (p3) ))) );
	}
	
	
	public static <T1, T2, T3, T4, T5> thx.promise.Future<thx.Either> par4(haxe.lang.Function f, thx.promise.Future<thx.Either> p1, thx.promise.Future<thx.Either> p2, thx.promise.Future<thx.Either> p3, thx.promise.Future<thx.Either> p4)
	{
		//line 325 "/shared/promise/src/thx/promise/Promise.hx"
		haxe.lang.Function f1 = f;
		//line 325 "/shared/promise/src/thx/promise/Promise.hx"
		thx.promise.Future<thx.Either> tmp = ((thx.promise.Future<thx.Either>) (thx.promise.Promises.par3(((haxe.lang.Function) (new thx.promise.Promises_par4_325__Fun_0<T4, T5, T3, T2, T1>(f1)) ), ((thx.promise.Future<thx.Either>) (p1) ), ((thx.promise.Future<thx.Either>) (p2) ), ((thx.promise.Future<thx.Either>) (p3) ))) );
		//line 325 "/shared/promise/src/thx/promise/Promise.hx"
		return ((thx.promise.Future<thx.Either>) (thx.promise.Promises.par(((haxe.lang.Function) (new thx.promise.Promises_par4_325__Fun<T4, T5>()) ), ((thx.promise.Future<thx.Either>) (tmp) ), ((thx.promise.Future<thx.Either>) (p4) ))) );
	}
	
	
	public static <T1, T2, T3, T4, T5, T6> thx.promise.Future<thx.Either> par5(haxe.lang.Function f, thx.promise.Future<thx.Either> p1, thx.promise.Future<thx.Either> p2, thx.promise.Future<thx.Either> p3, thx.promise.Future<thx.Either> p4, thx.promise.Future<thx.Either> p5)
	{
		//line 328 "/shared/promise/src/thx/promise/Promise.hx"
		haxe.lang.Function f1 = f;
		//line 328 "/shared/promise/src/thx/promise/Promise.hx"
		thx.promise.Future<thx.Either> tmp = ((thx.promise.Future<thx.Either>) (thx.promise.Promises.par4(((haxe.lang.Function) (new thx.promise.Promises_par5_328__Fun_0<T5, T6, T4, T3, T2, T1>(f1)) ), ((thx.promise.Future<thx.Either>) (p1) ), ((thx.promise.Future<thx.Either>) (p2) ), ((thx.promise.Future<thx.Either>) (p3) ), ((thx.promise.Future<thx.Either>) (p4) ))) );
		//line 328 "/shared/promise/src/thx/promise/Promise.hx"
		return ((thx.promise.Future<thx.Either>) (thx.promise.Promises.par(((haxe.lang.Function) (new thx.promise.Promises_par5_328__Fun<T5, T6>()) ), ((thx.promise.Future<thx.Either>) (tmp) ), ((thx.promise.Future<thx.Either>) (p5) ))) );
	}
	
	
	public static <T1, T2, T3, T4, T5, T6, T7> thx.promise.Future<thx.Either> par6(haxe.lang.Function f, thx.promise.Future<thx.Either> p1, thx.promise.Future<thx.Either> p2, thx.promise.Future<thx.Either> p3, thx.promise.Future<thx.Either> p4, thx.promise.Future<thx.Either> p5, thx.promise.Future<thx.Either> p6)
	{
		//line 331 "/shared/promise/src/thx/promise/Promise.hx"
		haxe.lang.Function f1 = f;
		//line 331 "/shared/promise/src/thx/promise/Promise.hx"
		thx.promise.Future<thx.Either> tmp = ((thx.promise.Future<thx.Either>) (thx.promise.Promises.par5(((haxe.lang.Function) (new thx.promise.Promises_par6_331__Fun_0<T6, T7, T5, T4, T3, T2, T1>(f1)) ), ((thx.promise.Future<thx.Either>) (p1) ), ((thx.promise.Future<thx.Either>) (p2) ), ((thx.promise.Future<thx.Either>) (p3) ), ((thx.promise.Future<thx.Either>) (p4) ), ((thx.promise.Future<thx.Either>) (p5) ))) );
		//line 331 "/shared/promise/src/thx/promise/Promise.hx"
		return ((thx.promise.Future<thx.Either>) (thx.promise.Promises.par(((haxe.lang.Function) (new thx.promise.Promises_par6_331__Fun<T6, T7>()) ), ((thx.promise.Future<thx.Either>) (tmp) ), ((thx.promise.Future<thx.Either>) (p6) ))) );
	}
	
	
	public static <T1, T2> thx.promise.Future<thx.Either> join(thx.promise.Future<thx.Either> p1, thx.promise.Future<thx.Either> p2)
	{
		//line 334 "/shared/promise/src/thx/promise/Promise.hx"
		return ((thx.promise.Future<thx.Either>) (thx.promise.Promises.par(((haxe.lang.Function) (new haxe.lang.Closure(thx._Tuple.Tuple2_Impl_.class, "of")) ), ((thx.promise.Future<thx.Either>) (p1) ), ((thx.promise.Future<thx.Either>) (p2) ))) );
	}
	
	
	public static <T1, T2> thx.promise.Future<thx.Either> join2(thx.promise.Future<thx.Either> p1, thx.promise.Future<thx.Either> p2)
	{
		//line 338 "/shared/promise/src/thx/promise/Promise.hx"
		return ((thx.promise.Future<thx.Either>) (thx.promise.Promises.par(((haxe.lang.Function) (new haxe.lang.Closure(thx._Tuple.Tuple2_Impl_.class, "of")) ), ((thx.promise.Future<thx.Either>) (p1) ), ((thx.promise.Future<thx.Either>) (p2) ))) );
	}
	
	
	public static <T1, T2, T3> thx.promise.Future<thx.Either> join3(thx.promise.Future<thx.Either> p1, thx.promise.Future<thx.Either> p2, thx.promise.Future<thx.Either> p3)
	{
		//line 341 "/shared/promise/src/thx/promise/Promise.hx"
		return ((thx.promise.Future<thx.Either>) (thx.promise.Promises.par3(((haxe.lang.Function) (new haxe.lang.Closure(thx._Tuple.Tuple3_Impl_.class, "of")) ), ((thx.promise.Future<thx.Either>) (p1) ), ((thx.promise.Future<thx.Either>) (p2) ), ((thx.promise.Future<thx.Either>) (p3) ))) );
	}
	
	
	public static <T1, T2, T3, T4> thx.promise.Future<thx.Either> join4(thx.promise.Future<thx.Either> p1, thx.promise.Future<thx.Either> p2, thx.promise.Future<thx.Either> p3, thx.promise.Future<thx.Either> p4)
	{
		//line 344 "/shared/promise/src/thx/promise/Promise.hx"
		return ((thx.promise.Future<thx.Either>) (thx.promise.Promises.par4(((haxe.lang.Function) (new haxe.lang.Closure(thx._Tuple.Tuple4_Impl_.class, "of")) ), ((thx.promise.Future<thx.Either>) (p1) ), ((thx.promise.Future<thx.Either>) (p2) ), ((thx.promise.Future<thx.Either>) (p3) ), ((thx.promise.Future<thx.Either>) (p4) ))) );
	}
	
	
	public static <T1, T2, T3, T4, T5> thx.promise.Future<thx.Either> join5(thx.promise.Future<thx.Either> p1, thx.promise.Future<thx.Either> p2, thx.promise.Future<thx.Either> p3, thx.promise.Future<thx.Either> p4, thx.promise.Future<thx.Either> p5)
	{
		//line 347 "/shared/promise/src/thx/promise/Promise.hx"
		return ((thx.promise.Future<thx.Either>) (thx.promise.Promises.par5(((haxe.lang.Function) (new haxe.lang.Closure(thx._Tuple.Tuple5_Impl_.class, "of")) ), ((thx.promise.Future<thx.Either>) (p1) ), ((thx.promise.Future<thx.Either>) (p2) ), ((thx.promise.Future<thx.Either>) (p3) ), ((thx.promise.Future<thx.Either>) (p4) ), ((thx.promise.Future<thx.Either>) (p5) ))) );
	}
	
	
	public static <T1, T2, T3, T4, T5, T6> thx.promise.Future<thx.Either> join6(thx.promise.Future<thx.Either> p1, thx.promise.Future<thx.Either> p2, thx.promise.Future<thx.Either> p3, thx.promise.Future<thx.Either> p4, thx.promise.Future<thx.Either> p5, thx.promise.Future<thx.Either> p6)
	{
		//line 350 "/shared/promise/src/thx/promise/Promise.hx"
		return ((thx.promise.Future<thx.Either>) (thx.promise.Promises.par6(((haxe.lang.Function) (new haxe.lang.Closure(thx._Tuple.Tuple6_Impl_.class, "of")) ), ((thx.promise.Future<thx.Either>) (p1) ), ((thx.promise.Future<thx.Either>) (p2) ), ((thx.promise.Future<thx.Either>) (p3) ), ((thx.promise.Future<thx.Either>) (p4) ), ((thx.promise.Future<thx.Either>) (p5) ), ((thx.promise.Future<thx.Either>) (p6) ))) );
	}
	
	
	public static <T> thx.promise.Future<thx.Either> log(thx.promise.Future<thx.Either> promise, java.lang.String prefix)
	{
		//line 353 "/shared/promise/src/thx/promise/Promise.hx"
		if (( prefix == null )) 
		{
			//line 353 "/shared/promise/src/thx/promise/Promise.hx"
			prefix = "";
		}
		
		//line 353 "/shared/promise/src/thx/promise/Promise.hx"
		return ((thx.promise.Future<thx.Either>) (thx.promise._Promise.Promise_Impl_.either(((thx.promise.Future<thx.Either>) (promise) ), ((haxe.lang.Function) (new thx.promise.Promises_log_354__Fun<T>(prefix)) ), ((haxe.lang.Function) (new thx.promise.Promises_log_355__Fun(prefix)) ))) );
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 285 "/shared/promise/src/thx/promise/Promise.hx"
		return new thx.promise.Promises(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 285 "/shared/promise/src/thx/promise/Promise.hx"
		return new thx.promise.Promises();
	}
	
	
}


