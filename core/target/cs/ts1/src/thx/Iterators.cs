// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class Iterators : global::haxe.lang.HxObject {
		
		public Iterators(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public Iterators() {
			global::thx.Iterators.__hx_ctor_thx_Iterators(this);
		}
		
		
		public static void __hx_ctor_thx_Iterators(global::thx.Iterators __temp_me117) {
		}
		
		
		public static bool all<T>(object it, global::haxe.lang.Function predicate) {
			while (global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(it, "hasNext", 407283053, null))) {
				if ( ! (global::haxe.lang.Runtime.toBool(predicate.__hx_invoke1_o(default(double), global::haxe.lang.Runtime.genericCast<T>(global::haxe.lang.Runtime.callField(it, "next", 1224901875, null))))) ) {
					return false;
				}
				
			}
			
			return true;
		}
		
		
		public static bool any<T>(object it, global::haxe.lang.Function predicate) {
			while (global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(it, "hasNext", 407283053, null))) {
				if (global::haxe.lang.Runtime.toBool(predicate.__hx_invoke1_o(default(double), global::haxe.lang.Runtime.genericCast<T>(global::haxe.lang.Runtime.callField(it, "next", 1224901875, null))))) {
					return true;
				}
				
			}
			
			return false;
		}
		
		
		public static bool @equals<T>(object a, object b, global::haxe.lang.Function equality) {
			if (( null == equality )) {
				equality = ((global::haxe.lang.Function) (new global::haxe.lang.Closure(typeof(global::thx.Functions), "equality", 1429408506)) );
			}
			
			bool an = default(bool);
			bool bn = default(bool);
			while (true) {
				an = global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(a, "hasNext", 407283053, null));
				bn = global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(b, "hasNext", 407283053, null));
				if ((  ! (an)  &&  ! (bn)  )) {
					return true;
				}
				
				if ((  ! (an)  ||  ! (bn)  )) {
					return false;
				}
				
				if ( ! (global::haxe.lang.Runtime.toBool(equality.__hx_invoke2_o(default(double), global::haxe.lang.Runtime.genericCast<T>(global::haxe.lang.Runtime.callField(a, "next", 1224901875, null)), default(double), global::haxe.lang.Runtime.genericCast<T>(global::haxe.lang.Runtime.callField(b, "next", 1224901875, null))))) ) {
					return false;
				}
				
			}
			
			return default(bool);
		}
		
		
		public static global::haxe.lang.Null<T> @get<T>(object it, int index) {
			int pos = 0;
			while (global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(it, "hasNext", 407283053, null))) {
				T i = global::haxe.lang.Runtime.genericCast<T>(global::haxe.lang.Runtime.callField(it, "next", 1224901875, null));
				if (( pos++ == index )) {
					return new global::haxe.lang.Null<T>(i, true);
				}
				
			}
			
			return default(global::haxe.lang.Null<T>);
		}
		
		
		public static global::haxe.ds.Option getOption<T>(object it, int index) {
			global::haxe.lang.Null<T> @value = global::thx.Iterators.@get<T>(((object) (it) ), ((int) (index) ));
			if ( ! (@value.hasValue) ) {
				return global::haxe.ds.Option.None;
			}
			else {
				return global::haxe.ds.Option.Some((@value).toDynamic());
			}
			
		}
		
		
		public static void eachPair<TIn, TOut>(object it, global::haxe.lang.Function handler) {
			global::thx.Arrays.eachPair<TIn, object>(((global::Array<TIn>) (global::thx.Iterators.toArray<TIn>(((object) (it) ))) ), ((global::haxe.lang.Function) (handler) ));
		}
		
		
		public static global::Array<TElement> filter<TElement>(object it, global::haxe.lang.Function predicate) {
			return ((global::Array<TElement>) (global::Array<object>.__hx_cast<TElement>(((global::Array) (global::thx.Iterators.reduce<TElement, object>(((object) (it) ), ((global::haxe.lang.Function) (new global::thx.Iterators_filter_87__Fun<TElement>(predicate)) ), ((object) (new global::Array<TElement>(new TElement[]{})) ))) ))) );
		}
		
		
		public static global::haxe.lang.Null<T> find<T, TFind>(object it, global::haxe.lang.Function f) {
			while (global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(it, "hasNext", 407283053, null))) {
				T element = global::haxe.lang.Runtime.genericCast<T>(global::haxe.lang.Runtime.callField(it, "next", 1224901875, null));
				if (global::haxe.lang.Runtime.toBool(f.__hx_invoke1_o(default(double), element))) {
					return new global::haxe.lang.Null<T>(element, true);
				}
				
			}
			
			return default(global::haxe.lang.Null<T>);
		}
		
		
		public static global::haxe.ds.Option findOption<T, TFind>(object it, global::haxe.lang.Function f) {
			global::haxe.lang.Null<T> @value = global::thx.Iterators.find<T, object>(((object) (it) ), ((global::haxe.lang.Function) (f) ));
			if ( ! (@value.hasValue) ) {
				return global::haxe.ds.Option.None;
			}
			else {
				return global::haxe.ds.Option.Some((@value).toDynamic());
			}
			
		}
		
		
		public static global::haxe.lang.Null<T> first<T, TFind>(object it) {
			if (global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(it, "hasNext", 407283053, null))) {
				return new global::haxe.lang.Null<T>(global::haxe.lang.Runtime.genericCast<T>(global::haxe.lang.Runtime.callField(it, "next", 1224901875, null)), true);
			}
			else {
				return default(global::haxe.lang.Null<T>);
			}
			
		}
		
		
		public static bool hasElements<T>(object it) {
			return global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(it, "hasNext", 407283053, null));
		}
		
		
		public static int indexOf<T>(object it, T element) {
			unchecked {
				int pos = 0;
				while (global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(it, "hasNext", 407283053, null))) {
					if (global::haxe.lang.Runtime.eq(element, global::haxe.lang.Runtime.genericCast<T>(global::haxe.lang.Runtime.callField(it, "next", 1224901875, null)))) {
						return pos;
					}
					
					 ++ pos;
				}
				
				return -1;
			}
		}
		
		
		public static bool isEmpty<T>(object it) {
			return  ! (global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(it, "hasNext", 407283053, null))) ;
		}
		
		
		public static bool isIterator(object v) {
			global::Array<object> fields = ( (( global::Reflect.isObject(v) && global::haxe.lang.Runtime.typeEq(null, global::Type.getClass<object>(((object) (v) ))) )) ? (global::Reflect.fields(v)) : (global::Type.getInstanceFields(global::Type.getClass<object>(((object) (v) )))) );
			if ((  ! (global::Lambda.has<object>(((object) (fields) ), ((object) ("next") )))  ||  ! (global::Lambda.has<object>(((object) (fields) ), ((object) ("hasNext") )))  )) {
				return false;
			}
			
			if (( global::haxe.lang.Runtime.getField(v, "next", 1224901875, false) is global::haxe.lang.Function )) {
				return ( global::haxe.lang.Runtime.getField(v, "hasNext", 407283053, false) is global::haxe.lang.Function );
			}
			else {
				return false;
			}
			
		}
		
		
		public static global::haxe.lang.Null<T> last<T, TFind>(object it) {
			T buf = default(T);
			while (global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(it, "hasNext", 407283053, null))) {
				buf = global::haxe.lang.Runtime.genericCast<T>(global::haxe.lang.Runtime.callField(it, "next", 1224901875, null));
			}
			
			return new global::haxe.lang.Null<T>(buf, true);
		}
		
		
		public static void forEach<A>(object it, global::haxe.lang.Function proc) {
			while (global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(it, "hasNext", 407283053, null))) {
				proc.__hx_invoke1_o(default(double), global::haxe.lang.Runtime.genericCast<A>(global::haxe.lang.Runtime.callField(it, "next", 1224901875, null)));
			}
			
		}
		
		
		public static global::Array<S> map<T, S>(object it, global::haxe.lang.Function f) {
			global::Array<S> acc = new global::Array<S>(new S[]{});
			while (global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(it, "hasNext", 407283053, null))) {
				acc.push(global::haxe.lang.Runtime.genericCast<S>(f.__hx_invoke1_o(default(double), global::haxe.lang.Runtime.genericCast<T>(global::haxe.lang.Runtime.callField(it, "next", 1224901875, null)))));
			}
			
			return acc;
		}
		
		
		public static object fmap<T, S>(object it, global::haxe.lang.Function f) {
			return new global::thx.MapIterator<T, S>(it, f);
		}
		
		
		public static global::Array<S> mapi<T, S>(object it, global::haxe.lang.Function f) {
			global::Array<S> acc = new global::Array<S>(new S[]{});
			int i = 0;
			while (global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(it, "hasNext", 407283053, null))) {
				acc.push(global::haxe.lang.Runtime.genericCast<S>(f.__hx_invoke2_o(default(double), global::haxe.lang.Runtime.genericCast<T>(global::haxe.lang.Runtime.callField(it, "next", 1224901875, null)), ((double) (i++) ), global::haxe.lang.Runtime.undefined)));
			}
			
			return acc;
		}
		
		
		public static object fmapi<T, S>(object it, global::haxe.lang.Function f) {
			return new global::thx.MapIIterator<T, S>(it, f);
		}
		
		
		public static global::Array<T> order<T>(object it, global::haxe.lang.Function sort) {
			global::Array<T> n = global::thx.Iterators.toArray<T>(((object) (it) ));
			n.sort(sort);
			return n;
		}
		
		
		public static TAcc reduce<TElement, TAcc>(object it, global::haxe.lang.Function callback, TAcc initial) {
			TAcc result = initial;
			while (global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(it, "hasNext", 407283053, null))) {
				result = global::haxe.lang.Runtime.genericCast<TAcc>(callback.__hx_invoke2_o(default(double), result, default(double), global::haxe.lang.Runtime.genericCast<TElement>(global::haxe.lang.Runtime.callField(it, "next", 1224901875, null))));
			}
			
			return result;
		}
		
		
		public static TAcc reducei<TElement, TAcc>(object it, global::haxe.lang.Function callback, TAcc initial) {
			TAcc[] initial1 = new TAcc[]{initial};
			global::thx.Iterators.mapi<TElement, object>(((object) (it) ), ((global::haxe.lang.Function) (new global::thx.Iterators_reducei_231__Fun<TAcc, TElement>(initial1, callback)) ));
			return initial1[0];
		}
		
		
		public static B foldLeft<A, B>(object it, B zero, global::haxe.lang.Function f) {
			return global::thx.Iterators.reduce<A, B>(((object) (it) ), ((global::haxe.lang.Function) (f) ), global::haxe.lang.Runtime.genericCast<B>(zero));
		}
		
		
		public static B foldMap<A, B>(object it, global::haxe.lang.Function f, object m) {
			object tmp = global::thx.Iterators.fmap<A, B>(((object) (it) ), ((global::haxe.lang.Function) (f) ));
			B tmp1 = global::thx._Monoid.Monoid_Impl_.get_zero<B>(((object) (m) ));
			object _e = m;
			return global::thx.Iterators.foldLeft<B, B>(((object) (tmp) ), global::haxe.lang.Runtime.genericCast<B>(tmp1), ((global::haxe.lang.Function) (new global::thx.Iterators_foldMap_242__Fun<B>(_e)) ));
		}
		
		
		public static global::Array<T> toArray<T>(object it) {
			global::Array<T> elements = new global::Array<T>(new T[]{});
			while (global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(it, "hasNext", 407283053, null))) {
				elements.push(global::haxe.lang.Runtime.genericCast<T>(global::haxe.lang.Runtime.callField(it, "next", 1224901875, null)));
			}
			
			return elements;
		}
		
		
		public static object unzip<T1, T2>(object it) {
			global::Array<T1> a1 = new global::Array<T1>(new T1[]{});
			global::Array<T2> a2 = new global::Array<T2>(new T2[]{});
			global::thx.Iterators.forEach<object>(((object) (it) ), ((global::haxe.lang.Function) (new global::thx.Iterators_unzip_259__Fun<T2, T1>(a2, a1)) ));
			return ((object) (new global::haxe.lang.DynamicObject(new int[]{21233, 21234}, new object[]{a1, a2}, new int[]{}, new double[]{})) );
		}
		
		
		public static object unzip3<T1, T2, T3>(object it) {
			global::Array<T1> a1 = new global::Array<T1>(new T1[]{});
			global::Array<T2> a2 = new global::Array<T2>(new T2[]{});
			global::Array<T3> a3 = new global::Array<T3>(new T3[]{});
			global::thx.Iterators.forEach<object>(((object) (it) ), ((global::haxe.lang.Function) (new global::thx.Iterators_unzip3_271__Fun<T3, T2, T1>(a3, a2, a1)) ));
			return ((object) (new global::haxe.lang.DynamicObject(new int[]{21233, 21234, 21235}, new object[]{a1, a2, a3}, new int[]{}, new double[]{})) );
		}
		
		
		public static object unzip4<T1, T2, T3, T4>(object it) {
			global::Array<T1> a1 = new global::Array<T1>(new T1[]{});
			global::Array<T2> a2 = new global::Array<T2>(new T2[]{});
			global::Array<T3> a3 = new global::Array<T3>(new T3[]{});
			global::Array<T4> a4 = new global::Array<T4>(new T4[]{});
			global::thx.Iterators.forEach<object>(((object) (it) ), ((global::haxe.lang.Function) (new global::thx.Iterators_unzip4_284__Fun<T4, T3, T2, T1>(a4, a3, a2, a1)) ));
			return ((object) (new global::haxe.lang.DynamicObject(new int[]{21233, 21234, 21235, 21236}, new object[]{a1, a2, a3, a4}, new int[]{}, new double[]{})) );
		}
		
		
		public static object unzip5<T1, T2, T3, T4, T5>(object it) {
			global::Array<T1> a1 = new global::Array<T1>(new T1[]{});
			global::Array<T2> a2 = new global::Array<T2>(new T2[]{});
			global::Array<T3> a3 = new global::Array<T3>(new T3[]{});
			global::Array<T4> a4 = new global::Array<T4>(new T4[]{});
			global::Array<T5> a5 = new global::Array<T5>(new T5[]{});
			global::thx.Iterators.forEach<object>(((object) (it) ), ((global::haxe.lang.Function) (new global::thx.Iterators_unzip5_298__Fun<T5, T4, T3, T2, T1>(a5, a4, a3, a2, a1)) ));
			return ((object) (new global::haxe.lang.DynamicObject(new int[]{21233, 21234, 21235, 21236, 21237}, new object[]{a1, a2, a3, a4, a5}, new int[]{}, new double[]{})) );
		}
		
		
		public static global::Array<object> zip<T1, T2>(object it1, object it2) {
			global::Array<object> array = new global::Array<object>(new object[]{});
			while (( global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(it1, "hasNext", 407283053, null)) && global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(it2, "hasNext", 407283053, null)) )) {
				object __temp_stmt3 = null;
				{
					T1 __temp_odecl1 = global::haxe.lang.Runtime.genericCast<T1>(global::haxe.lang.Runtime.callField(it1, "next", 1224901875, null));
					T2 __temp_odecl2 = global::haxe.lang.Runtime.genericCast<T2>(global::haxe.lang.Runtime.callField(it2, "next", 1224901875, null));
					__temp_stmt3 = new global::haxe.lang.DynamicObject(new int[]{21233, 21234}, new object[]{__temp_odecl1, __temp_odecl2}, new int[]{}, new double[]{});
				}
				
				array.push(((object) (__temp_stmt3) ));
			}
			
			return array;
		}
		
		
		public static global::Array<object> zip3<T1, T2, T3>(object it1, object it2, object it3) {
			global::Array<object> array = new global::Array<object>(new object[]{});
			while (( ( global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(it1, "hasNext", 407283053, null)) && global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(it2, "hasNext", 407283053, null)) ) && global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(it3, "hasNext", 407283053, null)) )) {
				object __temp_stmt4 = null;
				{
					T1 __temp_odecl1 = global::haxe.lang.Runtime.genericCast<T1>(global::haxe.lang.Runtime.callField(it1, "next", 1224901875, null));
					T2 __temp_odecl2 = global::haxe.lang.Runtime.genericCast<T2>(global::haxe.lang.Runtime.callField(it2, "next", 1224901875, null));
					T3 __temp_odecl3 = global::haxe.lang.Runtime.genericCast<T3>(global::haxe.lang.Runtime.callField(it3, "next", 1224901875, null));
					__temp_stmt4 = new global::haxe.lang.DynamicObject(new int[]{21233, 21234, 21235}, new object[]{__temp_odecl1, __temp_odecl2, __temp_odecl3}, new int[]{}, new double[]{});
				}
				
				array.push(((object) (__temp_stmt4) ));
			}
			
			return array;
		}
		
		
		public static global::Array<object> zip4<T1, T2, T3, T4>(object it1, object it2, object it3, object it4) {
			global::Array<object> array = new global::Array<object>(new object[]{});
			while (( ( ( global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(it1, "hasNext", 407283053, null)) && global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(it2, "hasNext", 407283053, null)) ) && global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(it3, "hasNext", 407283053, null)) ) && global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(it4, "hasNext", 407283053, null)) )) {
				object __temp_stmt5 = null;
				{
					T1 __temp_odecl1 = global::haxe.lang.Runtime.genericCast<T1>(global::haxe.lang.Runtime.callField(it1, "next", 1224901875, null));
					T2 __temp_odecl2 = global::haxe.lang.Runtime.genericCast<T2>(global::haxe.lang.Runtime.callField(it2, "next", 1224901875, null));
					T3 __temp_odecl3 = global::haxe.lang.Runtime.genericCast<T3>(global::haxe.lang.Runtime.callField(it3, "next", 1224901875, null));
					T4 __temp_odecl4 = global::haxe.lang.Runtime.genericCast<T4>(global::haxe.lang.Runtime.callField(it4, "next", 1224901875, null));
					__temp_stmt5 = new global::haxe.lang.DynamicObject(new int[]{21233, 21234, 21235, 21236}, new object[]{__temp_odecl1, __temp_odecl2, __temp_odecl3, __temp_odecl4}, new int[]{}, new double[]{});
				}
				
				array.push(((object) (__temp_stmt5) ));
			}
			
			return array;
		}
		
		
		public static global::Array<object> zip5<T1, T2, T3, T4, T5>(object it1, object it2, object it3, object it4, object it5) {
			global::Array<object> array = new global::Array<object>(new object[]{});
			while (( ( ( ( global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(it1, "hasNext", 407283053, null)) && global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(it2, "hasNext", 407283053, null)) ) && global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(it3, "hasNext", 407283053, null)) ) && global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(it4, "hasNext", 407283053, null)) ) && global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(it5, "hasNext", 407283053, null)) )) {
				object __temp_stmt6 = null;
				{
					T1 __temp_odecl1 = global::haxe.lang.Runtime.genericCast<T1>(global::haxe.lang.Runtime.callField(it1, "next", 1224901875, null));
					T2 __temp_odecl2 = global::haxe.lang.Runtime.genericCast<T2>(global::haxe.lang.Runtime.callField(it2, "next", 1224901875, null));
					T3 __temp_odecl3 = global::haxe.lang.Runtime.genericCast<T3>(global::haxe.lang.Runtime.callField(it3, "next", 1224901875, null));
					T4 __temp_odecl4 = global::haxe.lang.Runtime.genericCast<T4>(global::haxe.lang.Runtime.callField(it4, "next", 1224901875, null));
					T5 __temp_odecl5 = global::haxe.lang.Runtime.genericCast<T5>(global::haxe.lang.Runtime.callField(it5, "next", 1224901875, null));
					__temp_stmt6 = new global::haxe.lang.DynamicObject(new int[]{21233, 21234, 21235, 21236, 21237}, new object[]{__temp_odecl1, __temp_odecl2, __temp_odecl3, __temp_odecl4, __temp_odecl5}, new int[]{}, new double[]{});
				}
				
				array.push(((object) (__temp_stmt6) ));
			}
			
			return array;
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::thx.Iterators(global::haxe.lang.EmptyObject.EMPTY);
		}
		
		
		public static new object __hx_create(global::Array arr) {
			return new global::thx.Iterators();
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class Iterators_filter_87__Fun<TElement> : global::haxe.lang.Function {
		
		public Iterators_filter_87__Fun(global::haxe.lang.Function predicate) : base(2, 0) {
			this.predicate = predicate;
		}
		
		
		public override object __hx_invoke2_o(double __fn_float1, object __fn_dyn1, double __fn_float2, object __fn_dyn2) {
			TElement element = ( (( __fn_dyn2 == global::haxe.lang.Runtime.undefined )) ? (global::haxe.lang.Runtime.genericCast<TElement>(((object) (__fn_float2) ))) : (global::haxe.lang.Runtime.genericCast<TElement>(__fn_dyn2)) );
			global::Array<TElement> acc = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((global::Array<TElement>) (global::Array<object>.__hx_cast<TElement>(((global::Array) (((object) (__fn_float1) )) ))) )) : (((global::Array<TElement>) (global::Array<object>.__hx_cast<TElement>(((global::Array) (__fn_dyn1) ))) )) );
			if (global::haxe.lang.Runtime.toBool(this.predicate.__hx_invoke1_o(default(double), element))) {
				acc.push(element);
			}
			
			return acc;
		}
		
		
		public global::haxe.lang.Function predicate;
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class Iterators_reducei_231__Fun<TAcc, TElement> : global::haxe.lang.Function {
		
		public Iterators_reducei_231__Fun(TAcc[] initial1, global::haxe.lang.Function callback) : base(2, 0) {
			this.initial1 = initial1;
			this.callback = callback;
		}
		
		
		public override object __hx_invoke2_o(double __fn_float1, object __fn_dyn1, double __fn_float2, object __fn_dyn2) {
			int i = ( (( __fn_dyn2 == global::haxe.lang.Runtime.undefined )) ? (((int) (__fn_float2) )) : (((int) (global::haxe.lang.Runtime.toInt(__fn_dyn2)) )) );
			TElement v = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (global::haxe.lang.Runtime.genericCast<TElement>(((object) (__fn_float1) ))) : (global::haxe.lang.Runtime.genericCast<TElement>(__fn_dyn1)) );
			this.initial1[0] = global::haxe.lang.Runtime.genericCast<TAcc>(this.callback.__hx_invoke3_o(default(double), this.initial1[0], default(double), v, ((double) (i) ), global::haxe.lang.Runtime.undefined));
			return null;
		}
		
		
		public TAcc[] initial1;
		
		public global::haxe.lang.Function callback;
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class Iterators_foldMap_242__Fun<B> : global::haxe.lang.Function {
		
		public Iterators_foldMap_242__Fun(object _e) : base(2, 0) {
			this._e = _e;
		}
		
		
		public override object __hx_invoke2_o(double __fn_float1, object __fn_dyn1, double __fn_float2, object __fn_dyn2) {
			B a1 = ( (( __fn_dyn2 == global::haxe.lang.Runtime.undefined )) ? (global::haxe.lang.Runtime.genericCast<B>(((object) (__fn_float2) ))) : (global::haxe.lang.Runtime.genericCast<B>(__fn_dyn2)) );
			B a0 = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (global::haxe.lang.Runtime.genericCast<B>(((object) (__fn_float1) ))) : (global::haxe.lang.Runtime.genericCast<B>(__fn_dyn1)) );
			return global::thx._Monoid.Monoid_Impl_.append<B>(((object) (this._e) ), global::haxe.lang.Runtime.genericCast<B>(a0), global::haxe.lang.Runtime.genericCast<B>(a1));
		}
		
		
		public object _e;
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class Iterators_unzip_259__Fun<T2, T1> : global::haxe.lang.Function {
		
		public Iterators_unzip_259__Fun(global::Array<T2> a2, global::Array<T1> a1) : base(1, 0) {
			this.a2 = a2;
			this.a1 = a1;
		}
		
		
		public override object __hx_invoke1_o(double __fn_float1, object __fn_dyn1) {
			object t = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((object) (__fn_float1) )) : (((object) (__fn_dyn1) )) );
			this.a1.push(global::haxe.lang.Runtime.genericCast<T1>(global::haxe.lang.Runtime.getField(t, "_0", 21233, true)));
			this.a2.push(global::haxe.lang.Runtime.genericCast<T2>(global::haxe.lang.Runtime.getField(t, "_1", 21234, true)));
			return null;
		}
		
		
		public global::Array<T2> a2;
		
		public global::Array<T1> a1;
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class Iterators_unzip3_271__Fun<T3, T2, T1> : global::haxe.lang.Function {
		
		public Iterators_unzip3_271__Fun(global::Array<T3> a3, global::Array<T2> a2, global::Array<T1> a1) : base(1, 0) {
			this.a3 = a3;
			this.a2 = a2;
			this.a1 = a1;
		}
		
		
		public override object __hx_invoke1_o(double __fn_float1, object __fn_dyn1) {
			object t = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((object) (__fn_float1) )) : (((object) (__fn_dyn1) )) );
			this.a1.push(global::haxe.lang.Runtime.genericCast<T1>(global::haxe.lang.Runtime.getField(t, "_0", 21233, true)));
			this.a2.push(global::haxe.lang.Runtime.genericCast<T2>(global::haxe.lang.Runtime.getField(t, "_1", 21234, true)));
			this.a3.push(global::haxe.lang.Runtime.genericCast<T3>(global::haxe.lang.Runtime.getField(t, "_2", 21235, true)));
			return null;
		}
		
		
		public global::Array<T3> a3;
		
		public global::Array<T2> a2;
		
		public global::Array<T1> a1;
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class Iterators_unzip4_284__Fun<T4, T3, T2, T1> : global::haxe.lang.Function {
		
		public Iterators_unzip4_284__Fun(global::Array<T4> a4, global::Array<T3> a3, global::Array<T2> a2, global::Array<T1> a1) : base(1, 0) {
			this.a4 = a4;
			this.a3 = a3;
			this.a2 = a2;
			this.a1 = a1;
		}
		
		
		public override object __hx_invoke1_o(double __fn_float1, object __fn_dyn1) {
			object t = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((object) (__fn_float1) )) : (((object) (__fn_dyn1) )) );
			this.a1.push(global::haxe.lang.Runtime.genericCast<T1>(global::haxe.lang.Runtime.getField(t, "_0", 21233, true)));
			this.a2.push(global::haxe.lang.Runtime.genericCast<T2>(global::haxe.lang.Runtime.getField(t, "_1", 21234, true)));
			this.a3.push(global::haxe.lang.Runtime.genericCast<T3>(global::haxe.lang.Runtime.getField(t, "_2", 21235, true)));
			this.a4.push(global::haxe.lang.Runtime.genericCast<T4>(global::haxe.lang.Runtime.getField(t, "_3", 21236, true)));
			return null;
		}
		
		
		public global::Array<T4> a4;
		
		public global::Array<T3> a3;
		
		public global::Array<T2> a2;
		
		public global::Array<T1> a1;
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class Iterators_unzip5_298__Fun<T5, T4, T3, T2, T1> : global::haxe.lang.Function {
		
		public Iterators_unzip5_298__Fun(global::Array<T5> a5, global::Array<T4> a4, global::Array<T3> a3, global::Array<T2> a2, global::Array<T1> a1) : base(1, 0) {
			this.a5 = a5;
			this.a4 = a4;
			this.a3 = a3;
			this.a2 = a2;
			this.a1 = a1;
		}
		
		
		public override object __hx_invoke1_o(double __fn_float1, object __fn_dyn1) {
			object t = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((object) (__fn_float1) )) : (((object) (__fn_dyn1) )) );
			this.a1.push(global::haxe.lang.Runtime.genericCast<T1>(global::haxe.lang.Runtime.getField(t, "_0", 21233, true)));
			this.a2.push(global::haxe.lang.Runtime.genericCast<T2>(global::haxe.lang.Runtime.getField(t, "_1", 21234, true)));
			this.a3.push(global::haxe.lang.Runtime.genericCast<T3>(global::haxe.lang.Runtime.getField(t, "_2", 21235, true)));
			this.a4.push(global::haxe.lang.Runtime.genericCast<T4>(global::haxe.lang.Runtime.getField(t, "_3", 21236, true)));
			this.a5.push(global::haxe.lang.Runtime.genericCast<T5>(global::haxe.lang.Runtime.getField(t, "_4", 21237, true)));
			return null;
		}
		
		
		public global::Array<T5> a5;
		
		public global::Array<T4> a4;
		
		public global::Array<T3> a3;
		
		public global::Array<T2> a2;
		
		public global::Array<T1> a1;
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class MapIterator<A, B> : global::haxe.lang.HxObject, global::thx.MapIterator {
		
		public MapIterator(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public MapIterator(object @base, global::haxe.lang.Function f) {
			global::thx.MapIterator<object, object>.__hx_ctor_thx_MapIterator<A, B>(((global::thx.MapIterator<A, B>) (this) ), ((object) (@base) ), ((global::haxe.lang.Function) (f) ));
		}
		
		
		public static void __hx_ctor_thx_MapIterator<A_c, B_c>(global::thx.MapIterator<A_c, B_c> __temp_me118, object @base, global::haxe.lang.Function f) {
			__temp_me118.@base = @base;
			__temp_me118.f = f;
		}
		
		
		public static object __hx_cast<A_c_c, B_c_c>(global::thx.MapIterator me) {
			return ( (( me != null )) ? (me.thx_MapIterator_cast<A_c_c, B_c_c>()) : (null) );
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::thx.MapIterator<object, object>(global::haxe.lang.EmptyObject.EMPTY);
		}
		
		
		public static new object __hx_create(global::Array arr) {
			unchecked {
				return new global::thx.MapIterator<object, object>(arr[0], ((global::haxe.lang.Function) (arr[1]) ));
			}
		}
		
		
		public virtual object thx_MapIterator_cast<A_c, B_c>() {
			if (( global::haxe.lang.Runtime.eq(typeof(A), typeof(A_c)) && global::haxe.lang.Runtime.eq(typeof(B), typeof(B_c)) )) {
				return this;
			}
			
			global::thx.MapIterator<A_c, B_c> new_me = new global::thx.MapIterator<A_c, B_c>(global::haxe.lang.EmptyObject.EMPTY);
			global::Array<object> fields = global::Reflect.fields(this);
			int i = 0;
			while (( i < fields.length )) {
				string field = global::haxe.lang.Runtime.toString(fields[i++]);
				global::Reflect.setField(new_me, field, global::Reflect.field(this, field));
			}
			
			return new_me;
		}
		
		
		public object @base;
		
		public global::haxe.lang.Function f;
		
		public virtual B next() {
			return global::haxe.lang.Runtime.genericCast<B>(this.f.__hx_invoke1_o(default(double), global::haxe.lang.Runtime.genericCast<A>(global::haxe.lang.Runtime.callField(this.@base, "next", 1224901875, null))));
		}
		
		
		public virtual bool hasNext() {
			return global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(this.@base, "hasNext", 407283053, null));
		}
		
		
		public override double __hx_setField_f(string field, int hash, double @value, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 1091627025:
					{
						this.@base = ((object) (@value) );
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
					case 102:
					{
						this.f = ((global::haxe.lang.Function) (@value) );
						return @value;
					}
					
					
					case 1091627025:
					{
						this.@base = ((object) (@value) );
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
					case 407283053:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "hasNext", 407283053)) );
					}
					
					
					case 1224901875:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "next", 1224901875)) );
					}
					
					
					case 102:
					{
						return this.f;
					}
					
					
					case 1091627025:
					{
						return this.@base;
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
					case 1091627025:
					{
						return ((double) (global::haxe.lang.Runtime.toDouble(this.@base)) );
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
					case 407283053:
					{
						return this.hasNext();
					}
					
					
					case 1224901875:
					{
						return this.next();
					}
					
					
					default:
					{
						return base.__hx_invokeField(field, hash, dynargs);
					}
					
				}
				
			}
		}
		
		
		public override void __hx_getFields(global::Array<object> baseArr) {
			baseArr.push("f");
			baseArr.push("base");
			{
				base.__hx_getFields(baseArr);
			}
			
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	[global::haxe.lang.GenericInterface(typeof(global::thx.MapIterator<object, object>))]
	public interface MapIterator : global::haxe.lang.IHxObject, global::haxe.lang.IGenericObject {
		
		object thx_MapIterator_cast<A_c, B_c>();
		
		bool hasNext();
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class MapIIterator<A, B> : global::haxe.lang.HxObject, global::thx.MapIIterator {
		
		public MapIIterator(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public MapIIterator(object @base, global::haxe.lang.Function f) {
			global::thx.MapIIterator<object, object>.__hx_ctor_thx_MapIIterator<A, B>(((global::thx.MapIIterator<A, B>) (this) ), ((object) (@base) ), ((global::haxe.lang.Function) (f) ));
		}
		
		
		public static void __hx_ctor_thx_MapIIterator<A_c, B_c>(global::thx.MapIIterator<A_c, B_c> __temp_me119, object @base, global::haxe.lang.Function f) {
			__temp_me119.i = 0;
			__temp_me119.@base = @base;
			__temp_me119.f = f;
		}
		
		
		public static object __hx_cast<A_c_c, B_c_c>(global::thx.MapIIterator me) {
			return ( (( me != null )) ? (me.thx_MapIIterator_cast<A_c_c, B_c_c>()) : (null) );
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::thx.MapIIterator<object, object>(global::haxe.lang.EmptyObject.EMPTY);
		}
		
		
		public static new object __hx_create(global::Array arr) {
			unchecked {
				return new global::thx.MapIIterator<object, object>(arr[0], ((global::haxe.lang.Function) (arr[1]) ));
			}
		}
		
		
		public virtual object thx_MapIIterator_cast<A_c, B_c>() {
			if (( global::haxe.lang.Runtime.eq(typeof(A), typeof(A_c)) && global::haxe.lang.Runtime.eq(typeof(B), typeof(B_c)) )) {
				return this;
			}
			
			global::thx.MapIIterator<A_c, B_c> new_me = new global::thx.MapIIterator<A_c, B_c>(global::haxe.lang.EmptyObject.EMPTY);
			global::Array<object> fields = global::Reflect.fields(this);
			int i = 0;
			while (( i < fields.length )) {
				string field = global::haxe.lang.Runtime.toString(fields[i++]);
				global::Reflect.setField(new_me, field, global::Reflect.field(this, field));
			}
			
			return new_me;
		}
		
		
		public object @base;
		
		public global::haxe.lang.Function f;
		
		public int i;
		
		public virtual B next() {
			B result = global::haxe.lang.Runtime.genericCast<B>(this.f.__hx_invoke2_o(default(double), global::haxe.lang.Runtime.genericCast<A>(global::haxe.lang.Runtime.callField(this.@base, "next", 1224901875, null)), ((double) (this.i) ), global::haxe.lang.Runtime.undefined));
			this.i++;
			return result;
		}
		
		
		public virtual bool hasNext() {
			return global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(this.@base, "hasNext", 407283053, null));
		}
		
		
		public override double __hx_setField_f(string field, int hash, double @value, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 105:
					{
						this.i = ((int) (@value) );
						return @value;
					}
					
					
					case 1091627025:
					{
						this.@base = ((object) (@value) );
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
					case 105:
					{
						this.i = ((int) (global::haxe.lang.Runtime.toInt(@value)) );
						return @value;
					}
					
					
					case 102:
					{
						this.f = ((global::haxe.lang.Function) (@value) );
						return @value;
					}
					
					
					case 1091627025:
					{
						this.@base = ((object) (@value) );
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
					case 407283053:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "hasNext", 407283053)) );
					}
					
					
					case 1224901875:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "next", 1224901875)) );
					}
					
					
					case 105:
					{
						return this.i;
					}
					
					
					case 102:
					{
						return this.f;
					}
					
					
					case 1091627025:
					{
						return this.@base;
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
					case 105:
					{
						return ((double) (this.i) );
					}
					
					
					case 1091627025:
					{
						return ((double) (global::haxe.lang.Runtime.toDouble(this.@base)) );
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
					case 407283053:
					{
						return this.hasNext();
					}
					
					
					case 1224901875:
					{
						return this.next();
					}
					
					
					default:
					{
						return base.__hx_invokeField(field, hash, dynargs);
					}
					
				}
				
			}
		}
		
		
		public override void __hx_getFields(global::Array<object> baseArr) {
			baseArr.push("i");
			baseArr.push("f");
			baseArr.push("base");
			{
				base.__hx_getFields(baseArr);
			}
			
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	[global::haxe.lang.GenericInterface(typeof(global::thx.MapIIterator<object, object>))]
	public interface MapIIterator : global::haxe.lang.IHxObject, global::haxe.lang.IGenericObject {
		
		object thx_MapIIterator_cast<A_c, B_c>();
		
		bool hasNext();
		
	}
}


