// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class Maps : global::haxe.lang.HxObject {
		
		public Maps(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public Maps() {
			global::thx.Maps.__hx_ctor_thx_Maps(this);
		}
		
		
		public static void __hx_ctor_thx_Maps(global::thx.Maps __temp_me157) {
		}
		
		
		public static global::haxe.IMap<TKey, TValue> copyTo<TKey, TValue>(global::haxe.IMap<TKey, TValue> src, global::haxe.IMap<TKey, TValue> dst) {
			{
				object tmp = src.keys();
				while (global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(tmp, "hasNext", 407283053, null))) {
					TKey key = global::haxe.lang.Runtime.genericCast<TKey>(global::haxe.lang.Runtime.callField(tmp, "next", 1224901875, null));
					dst.@set(key, (src.@get(key)).@value);
				}
				
			}
			
			return dst;
		}
		
		
		public static global::Array<object> tuples<TKey, TValue>(global::haxe.IMap<TKey, TValue> map) {
			return global::thx.Iterators.map<TKey, object>(((object) (map.keys()) ), ((global::haxe.lang.Function) (new global::thx.Maps_tuples_32__Fun<TValue, TKey>(map)) ));
		}
		
		
		public static global::haxe.IMap<TKey, TValueB> mapValues<TKey, TValueA, TValueB>(global::haxe.IMap<TKey, TValueA> map, global::haxe.lang.Function f, global::haxe.IMap<TKey, TValueB> acc) {
			return ((global::haxe.IMap<TKey, TValueB>) (global::haxe.IMap__Statics_.__hx_cast<TKey, TValueB>(((global::haxe.IMap) (global::thx.Maps.reduce<TKey, TValueA, object>(((global::haxe.IMap<TKey, TValueA>) (map) ), ((global::haxe.lang.Function) (new global::thx.Maps_mapValues_40__Fun<TValueA, TValueB, TKey>(f)) ), ((object) (acc) ))) ))) );
		}
		
		
		public static TOut reduce<TKey, TValue, TOut>(global::haxe.IMap<TKey, TValue> map, global::haxe.lang.Function f, TOut acc) {
			return global::haxe.lang.Runtime.genericCast<TOut>(global::thx.Arrays.reduce<object, object>(((global::Array<object>) (global::thx.Maps.tuples<TKey, TValue>(((global::haxe.IMap<TKey, TValue>) (map) ))) ), ((global::haxe.lang.Function) (f) ), ((object) (acc) )));
		}
		
		
		public static global::Array<TValue> values<TKey, TValue>(global::haxe.IMap<TKey, TValue> map) {
			return ((global::Array<TValue>) (global::Array<object>.__hx_cast<TValue>(((global::Array) (global::thx.Iterators.map<TKey, object>(((object) (map.keys()) ), ((global::haxe.lang.Function) (new global::thx.Maps_values_55__Fun<TValue, TKey>(map)) ))) ))) );
		}
		
		
		public static global::haxe.ds.Option getOption<TKey, TValue>(global::haxe.IMap<TKey, TValue> map, TKey key) {
			global::haxe.lang.Null<TValue> @value = map.@get(key);
			if ( ! (@value.hasValue) ) {
				return global::haxe.ds.Option.None;
			}
			else {
				return global::haxe.ds.Option.Some((@value).toDynamic());
			}
			
		}
		
		
		public static object toObject<T>(global::haxe.ds.StringMap<T> map) {
			return global::thx.Arrays.reduce<object, object>(((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (global::thx.Maps.tuples<object, T>(((global::haxe.IMap<object, T>) (global::haxe.IMap__Statics_.__hx_cast<object, T>(((global::haxe.IMap) (map) ))) ))) ))) ), ((global::haxe.lang.Function) (new global::thx.Maps_toObject_69__Fun<T>()) ), ((object) (new global::haxe.lang.DynamicObject(new int[]{}, new object[]{}, new int[]{}, new double[]{})) ));
		}
		
		
		public static TValue getAlt<TKey, TValue>(global::haxe.IMap<TKey, TValue> map, TKey key, TValue alt) {
			global::haxe.lang.Null<TValue> v = ((global::haxe.lang.Null<TValue>) (map.@get(key)) );
			if ( ! (v.hasValue) ) {
				return alt;
			}
			else {
				return (v).@value;
			}
			
		}
		
		
		public static bool isMap(object v) {
			return ( v is global::haxe.IMap );
		}
		
		
		public static string @string<TKey, TValue>(global::haxe.IMap<TKey, TValue> m) {
			return global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("[", global::thx.Maps.tuples<TKey, TValue>(((global::haxe.IMap<TKey, TValue>) (m) )).map<object>(((global::haxe.lang.Function) (new global::thx.Maps_string_90__Fun<TValue, TKey>()) )).@join(", ")), "]");
		}
		
		
		public static global::haxe.IMap<TKey, TValue> merge<TKey, TValue>(global::haxe.IMap<TKey, TValue> dest, global::Array<object> sources) {
			return ((global::haxe.IMap<TKey, TValue>) (global::haxe.IMap__Statics_.__hx_cast<TKey, TValue>(((global::haxe.IMap) (global::thx.Arrays.reduce<object, object>(((global::Array<object>) (sources) ), ((global::haxe.lang.Function) (new global::thx.Maps_merge_106__Fun<TValue, TKey>()) ), ((object) (dest) ))) ))) );
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::thx.Maps(global::haxe.lang.EmptyObject.EMPTY);
		}
		
		
		public static new object __hx_create(global::Array arr) {
			return new global::thx.Maps();
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class Maps_tuples_32__Fun<TValue, TKey> : global::haxe.lang.Function {
		
		public Maps_tuples_32__Fun(global::haxe.IMap<TKey, TValue> map) : base(1, 0) {
			this.map = map;
		}
		
		
		public override object __hx_invoke1_o(double __fn_float1, object __fn_dyn1) {
			TKey key = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (global::haxe.lang.Runtime.genericCast<TKey>(((object) (__fn_float1) ))) : (global::haxe.lang.Runtime.genericCast<TKey>(__fn_dyn1)) );
			object __temp_stmt2 = null;
			{
				global::haxe.lang.Null<TValue> __temp_odecl1 = this.map.@get(key);
				__temp_stmt2 = new global::haxe.lang.DynamicObject(new int[]{21233, 21234}, new object[]{key, (__temp_odecl1).toDynamic()}, new int[]{}, new double[]{});
			}
			
			return ((object) (__temp_stmt2) );
		}
		
		
		public global::haxe.IMap<TKey, TValue> map;
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class Maps_mapValues_40__Fun<TValueA, TValueB, TKey> : global::haxe.lang.Function {
		
		public Maps_mapValues_40__Fun(global::haxe.lang.Function f) : base(2, 0) {
			this.f = f;
		}
		
		
		public override object __hx_invoke2_o(double __fn_float1, object __fn_dyn1, double __fn_float2, object __fn_dyn2) {
			object t = ( (( __fn_dyn2 == global::haxe.lang.Runtime.undefined )) ? (((object) (__fn_float2) )) : (((object) (__fn_dyn2) )) );
			global::haxe.IMap<TKey, TValueB> m = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((global::haxe.IMap<TKey, TValueB>) (global::haxe.IMap__Statics_.__hx_cast<TKey, TValueB>(((global::haxe.IMap) (((object) (__fn_float1) )) ))) )) : (((global::haxe.IMap<TKey, TValueB>) (global::haxe.IMap__Statics_.__hx_cast<TKey, TValueB>(((global::haxe.IMap) (__fn_dyn1) ))) )) );
			m.@set(global::haxe.lang.Runtime.genericCast<TKey>(global::haxe.lang.Runtime.getField(t, "_0", 21233, true)), global::haxe.lang.Runtime.genericCast<TValueB>(this.f.__hx_invoke1_o(default(double), global::haxe.lang.Runtime.genericCast<TValueA>(global::haxe.lang.Runtime.getField(t, "_1", 21234, true)))));
			return m;
		}
		
		
		public global::haxe.lang.Function f;
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class Maps_values_55__Fun<TValue, TKey> : global::haxe.lang.Function {
		
		public Maps_values_55__Fun(global::haxe.IMap<TKey, TValue> map) : base(1, 0) {
			this.map = map;
		}
		
		
		public override object __hx_invoke1_o(double __fn_float1, object __fn_dyn1) {
			TKey key = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (global::haxe.lang.Runtime.genericCast<TKey>(((object) (__fn_float1) ))) : (global::haxe.lang.Runtime.genericCast<TKey>(__fn_dyn1)) );
			return (this.map.@get(key)).toDynamic();
		}
		
		
		public global::haxe.IMap<TKey, TValue> map;
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class Maps_toObject_69__Fun<T> : global::haxe.lang.Function {
		
		public Maps_toObject_69__Fun() : base(2, 0) {
		}
		
		
		public override object __hx_invoke2_o(double __fn_float1, object __fn_dyn1, double __fn_float2, object __fn_dyn2) {
			object t = ( (( __fn_dyn2 == global::haxe.lang.Runtime.undefined )) ? (((object) (__fn_float2) )) : (((object) (__fn_dyn2) )) );
			object o = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((object) (__fn_float1) )) : (((object) (__fn_dyn1) )) );
			global::Reflect.setField(o, global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(t, "_0", 21233, true)), global::haxe.lang.Runtime.genericCast<T>(global::haxe.lang.Runtime.getField(t, "_1", 21234, true)));
			return o;
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class Maps_string_90__Fun<TValue, TKey> : global::haxe.lang.Function {
		
		public Maps_string_90__Fun() : base(1, 0) {
		}
		
		
		public override object __hx_invoke1_o(double __fn_float1, object __fn_dyn1) {
			object t = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((object) (__fn_float1) )) : (((object) (__fn_dyn1) )) );
			return global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::thx.Dynamics.@string(global::haxe.lang.Runtime.genericCast<TKey>(global::haxe.lang.Runtime.getField(t, "_0", 21233, true))), " => "), global::thx.Dynamics.@string(global::haxe.lang.Runtime.genericCast<TValue>(global::haxe.lang.Runtime.getField(t, "_1", 21234, true))));
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class Maps_merge_107__Fun<TValue, TKey> : global::haxe.lang.Function {
		
		public Maps_merge_107__Fun(global::haxe.IMap<TKey, TValue> source) : base(2, 0) {
			this.source = source;
		}
		
		
		public override object __hx_invoke2_o(double __fn_float1, object __fn_dyn1, double __fn_float2, object __fn_dyn2) {
			TKey key = ( (( __fn_dyn2 == global::haxe.lang.Runtime.undefined )) ? (global::haxe.lang.Runtime.genericCast<TKey>(((object) (__fn_float2) ))) : (global::haxe.lang.Runtime.genericCast<TKey>(__fn_dyn2)) );
			global::haxe.IMap<TKey, TValue> result1 = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((global::haxe.IMap<TKey, TValue>) (global::haxe.IMap__Statics_.__hx_cast<TKey, TValue>(((global::haxe.IMap) (((object) (__fn_float1) )) ))) )) : (((global::haxe.IMap<TKey, TValue>) (global::haxe.IMap__Statics_.__hx_cast<TKey, TValue>(((global::haxe.IMap) (__fn_dyn1) ))) )) );
			result1.@set(key, (this.source.@get(key)).@value);
			return result1;
		}
		
		
		public global::haxe.IMap<TKey, TValue> source;
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class Maps_merge_106__Fun<TValue, TKey> : global::haxe.lang.Function {
		
		public Maps_merge_106__Fun() : base(2, 0) {
		}
		
		
		public override object __hx_invoke2_o(double __fn_float1, object __fn_dyn1, double __fn_float2, object __fn_dyn2) {
			global::haxe.IMap<TKey, TValue> source = ( (( __fn_dyn2 == global::haxe.lang.Runtime.undefined )) ? (((global::haxe.IMap<TKey, TValue>) (global::haxe.IMap__Statics_.__hx_cast<TKey, TValue>(((global::haxe.IMap) (((object) (__fn_float2) )) ))) )) : (((global::haxe.IMap<TKey, TValue>) (global::haxe.IMap__Statics_.__hx_cast<TKey, TValue>(((global::haxe.IMap) (__fn_dyn2) ))) )) );
			global::haxe.IMap<TKey, TValue> result = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((global::haxe.IMap<TKey, TValue>) (global::haxe.IMap__Statics_.__hx_cast<TKey, TValue>(((global::haxe.IMap) (((object) (__fn_float1) )) ))) )) : (((global::haxe.IMap<TKey, TValue>) (global::haxe.IMap__Statics_.__hx_cast<TKey, TValue>(((global::haxe.IMap) (__fn_dyn1) ))) )) );
			return ((global::haxe.IMap<TKey, TValue>) (global::haxe.IMap__Statics_.__hx_cast<TKey, TValue>(((global::haxe.IMap) (global::thx.Iterators.reduce<TKey, object>(((object) (source.keys()) ), ((global::haxe.lang.Function) (new global::thx.Maps_merge_107__Fun<TValue, TKey>(source)) ), ((object) (result) ))) ))) );
		}
		
		
	}
}


