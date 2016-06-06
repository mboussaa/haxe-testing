// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx._Set {
	public sealed class Set_Impl_ {
		
		public static global::haxe.ds.StringMap<bool> createString(object it) {
			global::haxe.ds.StringMap<bool> map = new global::haxe.ds.StringMap<bool>();
			global::haxe.ds.StringMap<bool> @set = ((global::haxe.ds.StringMap<bool>) (map) );
			if (( null != it )) {
				global::thx._Set.Set_Impl_.pushMany<object>(((global::haxe.IMap<object, bool>) (global::haxe.IMap__Statics_.__hx_cast<object, bool>(((global::haxe.IMap) (@set) ))) ), ((object) (it) ));
			}
			
			return @set;
		}
		
		
		public static global::haxe.ds.IntMap<bool> createInt(object it) {
			global::haxe.ds.IntMap<bool> map = new global::haxe.ds.IntMap<bool>();
			global::haxe.ds.IntMap<bool> @set = ((global::haxe.ds.IntMap<bool>) (map) );
			if (( null != it )) {
				global::thx._Set.Set_Impl_.pushMany<int>(((global::haxe.IMap<int, bool>) (@set) ), ((object) (it) ));
			}
			
			return @set;
		}
		
		
		public static global::haxe.ds.ObjectMap<object, bool> createObject(object it) {
			global::haxe.ds.ObjectMap<object, bool> map = new global::haxe.ds.ObjectMap<object, bool>();
			global::haxe.ds.ObjectMap<object, bool> @set = ((global::haxe.ds.ObjectMap<object, bool>) (map) );
			if (( null != it )) {
				global::thx._Set.Set_Impl_.pushMany<object>(((global::haxe.IMap<object, bool>) (@set) ), ((object) (it) ));
			}
			
			return @set;
		}
		
		
		public static global::haxe.ds.EnumValueMap<object, bool> createEnum(object arr) {
			global::haxe.ds.EnumValueMap<object, bool> map = new global::haxe.ds.EnumValueMap<object, bool>();
			global::haxe.ds.EnumValueMap<object, bool> @set = ((global::haxe.ds.EnumValueMap<object, bool>) (map) );
			if (( null != arr )) {
				global::thx._Set.Set_Impl_.pushMany<object>(((global::haxe.IMap<object, bool>) (@set) ), ((object) (arr) ));
			}
			
			return @set;
		}
		
		
		
		
		public static global::haxe.IMap<T, bool> _new<T>(global::haxe.IMap<T, bool> map) {
			return ((global::haxe.IMap<T, bool>) (map) );
		}
		
		
		public static bool @add<T>(global::haxe.IMap<T, bool> this1, T v) {
			if (this1.exists(v)) {
				return false;
			}
			else {
				this1.@set(v, true);
				return true;
			}
			
		}
		
		
		public static global::haxe.IMap<T, bool> copy<T>(global::haxe.IMap<T, bool> this1) {
			global::haxe.IMap<T, bool> inst = global::thx._Set.Set_Impl_.empty<T>(((global::haxe.IMap<T, bool>) (this1) ));
			{
				object tmp = this1.keys();
				while (global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(tmp, "hasNext", 407283053, null))) {
					((global::haxe.IMap<T, bool>) (inst) ).@set(global::haxe.lang.Runtime.genericCast<T>(global::haxe.lang.Runtime.callField(tmp, "next", 1224901875, null)), true);
				}
				
			}
			
			return inst;
		}
		
		
		public static global::haxe.IMap<T, bool> empty<T>(global::haxe.IMap<T, bool> this1) {
			return ((global::haxe.IMap<T, bool>) (global::haxe.IMap__Statics_.__hx_cast<T, bool>(((global::haxe.IMap) (global::Type.createInstance<object>(((global::System.Type) (global::Type.getClass<object>(((object) (this1) ))) ), ((global::Array) (new global::Array<object>(new object[]{})) ))) ))) );
		}
		
		
		public static global::haxe.IMap<T, bool> difference<T>(global::haxe.IMap<T, bool> this1, global::haxe.IMap<T, bool> @set) {
			global::haxe.IMap<T, bool> result = global::thx._Set.Set_Impl_.copy<T>(((global::haxe.IMap<T, bool>) (this1) ));
			{
				object tmp = global::thx._Set.Set_Impl_.iterator<T>(((global::haxe.IMap<T, bool>) (@set) ));
				while (global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(tmp, "hasNext", 407283053, null))) {
					((global::haxe.IMap<T, bool>) (result) ).@remove(global::haxe.lang.Runtime.genericCast<T>(global::haxe.lang.Runtime.callField(tmp, "next", 1224901875, null)));
				}
				
			}
			
			return result;
		}
		
		
		public static global::haxe.IMap<T, bool> filter<T>(global::haxe.IMap<T, bool> this1, global::haxe.lang.Function predicate) {
			global::haxe.IMap<T, bool> tmp = global::thx._Set.Set_Impl_.empty<T>(((global::haxe.IMap<T, bool>) (this1) ));
			return ((global::haxe.IMap<T, bool>) (global::haxe.IMap__Statics_.__hx_cast<T, bool>(((global::haxe.IMap) (global::thx._Set.Set_Impl_.reduce<object, T>(((global::haxe.IMap<T, bool>) (this1) ), ((global::haxe.lang.Function) (new global::thx._Set.Set_Impl__filter_101__Fun<T>(predicate)) ), ((object) (tmp) ))) ))) );
		}
		
		
		public static global::Array<TOut> map<TOut, T>(global::haxe.IMap<T, bool> this1, global::haxe.lang.Function f) {
			return ((global::Array<TOut>) (global::Array<object>.__hx_cast<TOut>(((global::Array) (global::thx._Set.Set_Impl_.reduce<object, T>(((global::haxe.IMap<T, bool>) (this1) ), ((global::haxe.lang.Function) (new global::thx._Set.Set_Impl__map_108__Fun<T, TOut>(f)) ), ((object) (new global::Array<TOut>(new TOut[]{})) ))) ))) );
		}
		
		
		public static bool exists<T>(global::haxe.IMap<T, bool> this1, T v) {
			return this1.exists(v);
		}
		
		
		public static bool @remove<T>(global::haxe.IMap<T, bool> this1, T v) {
			return this1.@remove(v);
		}
		
		
		public static global::haxe.IMap<T, bool> intersection<T>(global::haxe.IMap<T, bool> this1, global::haxe.IMap<T, bool> @set) {
			global::haxe.IMap<T, bool> result = global::thx._Set.Set_Impl_.empty<T>(((global::haxe.IMap<T, bool>) (this1) ));
			{
				object tmp = global::thx._Set.Set_Impl_.iterator<T>(((global::haxe.IMap<T, bool>) (this1) ));
				while (global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(tmp, "hasNext", 407283053, null))) {
					T item = global::haxe.lang.Runtime.genericCast<T>(global::haxe.lang.Runtime.callField(tmp, "next", 1224901875, null));
					if (((global::haxe.IMap<T, bool>) (@set) ).exists(item)) {
						((global::haxe.IMap<T, bool>) (result) ).@set(item, true);
					}
					
				}
				
			}
			
			return result;
		}
		
		
		public static void push<T>(global::haxe.IMap<T, bool> this1, T v) {
			this1.@set(v, true);
		}
		
		
		public static void pushMany<T>(global::haxe.IMap<T, bool> this1, object values) {
			object tmp = ((object) (global::haxe.lang.Runtime.callField(values, "iterator", 328878574, null)) );
			while (global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(tmp, "hasNext", 407283053, null))) {
				((global::haxe.IMap<T, bool>) (this1) ).@set(global::haxe.lang.Runtime.genericCast<T>(global::haxe.lang.Runtime.callField(tmp, "next", 1224901875, null)), true);
			}
			
		}
		
		
		public static TOut reduce<TOut, T>(global::haxe.IMap<T, bool> this1, global::haxe.lang.Function handler, TOut acc) {
			{
				object tmp = global::thx._Set.Set_Impl_.iterator<T>(((global::haxe.IMap<T, bool>) (this1) ));
				while (global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(tmp, "hasNext", 407283053, null))) {
					acc = global::haxe.lang.Runtime.genericCast<TOut>(handler.__hx_invoke2_o(default(double), acc, default(double), global::haxe.lang.Runtime.genericCast<T>(global::haxe.lang.Runtime.callField(tmp, "next", 1224901875, null))));
				}
				
			}
			
			return acc;
		}
		
		
		public static object iterator<T>(global::haxe.IMap<T, bool> this1) {
			return this1.keys();
		}
		
		
		public static global::haxe.IMap<T, bool> union<T>(global::haxe.IMap<T, bool> this1, global::haxe.IMap<T, bool> @set) {
			global::haxe.IMap<T, bool> newset = global::thx._Set.Set_Impl_.copy<T>(((global::haxe.IMap<T, bool>) (this1) ));
			global::thx._Set.Set_Impl_.pushMany<T>(((global::haxe.IMap<T, bool>) (newset) ), ((object) (global::thx._Set.Set_Impl_.toArray<T>(((global::haxe.IMap<T, bool>) (@set) ))) ));
			return newset;
		}
		
		
		public static global::Array<T> toArray<T>(global::haxe.IMap<T, bool> this1) {
			global::Array<T> arr = new global::Array<T>(new T[]{});
			{
				object tmp = this1.keys();
				while (global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(tmp, "hasNext", 407283053, null))) {
					arr.push(global::haxe.lang.Runtime.genericCast<T>(global::haxe.lang.Runtime.callField(tmp, "next", 1224901875, null)));
				}
				
			}
			
			return arr;
		}
		
		
		public static string toString<T>(global::haxe.IMap<T, bool> this1) {
			return global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("{", global::thx._Set.Set_Impl_.toArray<T>(((global::haxe.IMap<T, bool>) (this1) )).@join(", ")), "}");
		}
		
		
		public static int get_length<T>(global::haxe.IMap<T, bool> this1) {
			int l = 0;
			{
				object tmp = this1.iterator();
				while (global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(tmp, "hasNext", 407283053, null))) {
					global::haxe.lang.Runtime.callField(tmp, "next", 1224901875, null);
					 ++ l;
				}
				
			}
			
			return l;
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx._Set {
	public class Set_Impl__filter_101__Fun<T> : global::haxe.lang.Function {
		
		public Set_Impl__filter_101__Fun(global::haxe.lang.Function predicate) : base(2, 0) {
			this.predicate = predicate;
		}
		
		
		public override object __hx_invoke2_o(double __fn_float1, object __fn_dyn1, double __fn_float2, object __fn_dyn2) {
			T v = ( (( __fn_dyn2 == global::haxe.lang.Runtime.undefined )) ? (global::haxe.lang.Runtime.genericCast<T>(((object) (__fn_float2) ))) : (global::haxe.lang.Runtime.genericCast<T>(__fn_dyn2)) );
			global::haxe.IMap<T, bool> acc = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((global::haxe.IMap<T, bool>) (global::haxe.IMap__Statics_.__hx_cast<T, bool>(((global::haxe.IMap) (((object) (__fn_float1) )) ))) )) : (((global::haxe.IMap<T, bool>) (global::haxe.IMap__Statics_.__hx_cast<T, bool>(((global::haxe.IMap) (__fn_dyn1) ))) )) );
			if (global::haxe.lang.Runtime.toBool(this.predicate.__hx_invoke1_o(default(double), v))) {
				global::thx._Set.Set_Impl_.@add<T>(((global::haxe.IMap<T, bool>) (acc) ), global::haxe.lang.Runtime.genericCast<T>(v));
			}
			
			return acc;
		}
		
		
		public global::haxe.lang.Function predicate;
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx._Set {
	public class Set_Impl__map_108__Fun<T, TOut> : global::haxe.lang.Function {
		
		public Set_Impl__map_108__Fun(global::haxe.lang.Function f) : base(2, 0) {
			this.f = f;
		}
		
		
		public override object __hx_invoke2_o(double __fn_float1, object __fn_dyn1, double __fn_float2, object __fn_dyn2) {
			T v = ( (( __fn_dyn2 == global::haxe.lang.Runtime.undefined )) ? (global::haxe.lang.Runtime.genericCast<T>(((object) (__fn_float2) ))) : (global::haxe.lang.Runtime.genericCast<T>(__fn_dyn2)) );
			global::Array<TOut> acc = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((global::Array<TOut>) (global::Array<object>.__hx_cast<TOut>(((global::Array) (((object) (__fn_float1) )) ))) )) : (((global::Array<TOut>) (global::Array<object>.__hx_cast<TOut>(((global::Array) (__fn_dyn1) ))) )) );
			acc.push(global::haxe.lang.Runtime.genericCast<TOut>(this.f.__hx_invoke1_o(default(double), v)));
			return acc;
		}
		
		
		public global::haxe.lang.Function f;
		
	}
}

