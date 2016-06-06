// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx._ReadonlyArray {
	public sealed class ReadonlyArray_Impl_ {
		
		public static global::Array<T> empty<T>() {
			return new global::Array<T>(new T[]{});
		}
		
		
		public static global::Array<T> flatten<T>(global::Array<object> array) {
			return ((global::Array<T>) (global::Array<object>.__hx_cast<T>(((global::Array) (global::thx.Arrays.reduce<object, object>(((global::Array<object>) (array) ), ((global::haxe.lang.Function) (new global::thx._ReadonlyArray.ReadonlyArray_Impl__flatten_16__Fun<T>()) ), ((object) (new global::Array<T>(new T[]{})) ))) ))) );
		}
		
		
		public static int indexOf<T>(global::Array<T> this1, T el, global::haxe.lang.Function eq) {
			unchecked {
				if (( null == eq )) {
					eq = ((global::haxe.lang.Function) (new global::haxe.lang.Closure(typeof(global::thx.Functions), "equality", 1429408506)) );
				}
				
				{
					int _g1 = 0;
					int _g = this1.length;
					while (( _g1 < _g )) {
						int i = _g1++;
						if (global::haxe.lang.Runtime.toBool(eq.__hx_invoke2_o(default(double), el, default(double), this1[i]))) {
							return i;
						}
						
					}
					
				}
				
				return -1;
			}
		}
		
		
		public static int lastIndexOf<T>(global::Array<T> this1, T el, global::haxe.lang.Function eq) {
			unchecked {
				if (( null == eq )) {
					eq = ((global::haxe.lang.Function) (new global::haxe.lang.Closure(typeof(global::thx.Functions), "equality", 1429408506)) );
				}
				
				int len = this1.length;
				{
					int _g1 = 0;
					while (( _g1 < len )) {
						int i = _g1++;
						if (global::haxe.lang.Runtime.toBool(eq.__hx_invoke2_o(default(double), el, default(double), this1[( ( len - i ) - 1 )]))) {
							return i;
						}
						
					}
					
				}
				
				return -1;
			}
		}
		
		
		public static T @get<T>(global::Array<T> this1, int index) {
			return this1[index];
		}
		
		
		public static global::haxe.lang.Null<T> head<T>(global::Array<T> this1) {
			return new global::haxe.lang.Null<T>(this1[0], true);
		}
		
		
		public static global::Array<T> tail<T>(global::Array<T> this1) {
			unchecked {
				return this1.slice(1, default(global::haxe.lang.Null<int>));
			}
		}
		
		
		public static B reduce<A, B, T>(global::Array<T> this1, global::Array<A> arr, global::haxe.lang.Function f, B initial) {
			{
				int _g = 0;
				while (( _g < arr.length )) {
					A v = arr[_g];
					 ++ _g;
					initial = global::haxe.lang.Runtime.genericCast<B>(f.__hx_invoke2_o(default(double), initial, default(double), v));
				}
				
			}
			
			return initial;
		}
		
		
		public static B reducei<A, B>(global::Array<A> array, global::haxe.lang.Function f, B initial) {
			{
				int _g1 = 0;
				int _g = array.length;
				while (( _g1 < _g )) {
					int i = _g1++;
					initial = global::haxe.lang.Runtime.genericCast<B>(f.__hx_invoke3_o(default(double), initial, default(double), global::haxe.lang.Runtime.genericCast<A>(((global::Array<A>) (array) )[i]), ((double) (i) ), global::haxe.lang.Runtime.undefined));
				}
				
			}
			
			return initial;
		}
		
		
		public static global::Array<T> reverse<T>(global::Array<T> this1) {
			global::Array<T> arr = this1.copy();
			arr.reverse();
			return arr;
		}
		
		
		public static global::Array<T> toArray<T>(global::Array<T> this1) {
			return this1.copy();
		}
		
		
		public static global::Array<T> @unsafe<T>(global::Array<T> this1) {
			return this1;
		}
		
		
		public static global::Array<T> concat<T>(global::Array<T> this1, global::Array<T> that) {
			return this1.concat(((global::Array<T>) (that) ));
		}
		
		
		public static global::Array<T> insertAt<T>(global::Array<T> this1, int pos, T el) {
			return this1.slice(0, new global::haxe.lang.Null<int>(pos, true)).concat(new global::Array<T>(new T[]{el})).concat(this1.slice(pos, default(global::haxe.lang.Null<int>)));
		}
		
		
		public static global::Array<T> insertAfter<T>(global::Array<T> this1, T @ref, T el, global::haxe.lang.Function eq) {
			unchecked {
				int pos = global::thx._ReadonlyArray.ReadonlyArray_Impl_.indexOf<T>(((global::Array<T>) (this1) ), global::haxe.lang.Runtime.genericCast<T>(@ref), ((global::haxe.lang.Function) (eq) ));
				if (( pos < 0 )) {
					pos = ( this1.length - 1 );
				}
				
				int pos1 = ( pos + 1 );
				return ((global::Array<T>) (this1) ).slice(0, new global::haxe.lang.Null<int>(pos1, true)).concat(new global::Array<T>(new T[]{el})).concat(((global::Array<T>) (this1) ).slice(pos1, default(global::haxe.lang.Null<int>)));
			}
		}
		
		
		public static global::Array<T> insertBefore<T>(global::Array<T> this1, T @ref, T el, global::haxe.lang.Function eq) {
			int pos = global::thx._ReadonlyArray.ReadonlyArray_Impl_.indexOf<T>(((global::Array<T>) (this1) ), global::haxe.lang.Runtime.genericCast<T>(@ref), ((global::haxe.lang.Function) (eq) ));
			return ((global::Array<T>) (this1) ).slice(0, new global::haxe.lang.Null<int>(pos, true)).concat(new global::Array<T>(new T[]{el})).concat(((global::Array<T>) (this1) ).slice(pos, default(global::haxe.lang.Null<int>)));
		}
		
		
		public static global::Array<T> replace<T>(global::Array<T> this1, T @ref, T el, global::haxe.lang.Function eq) {
			unchecked {
				int pos = global::thx._ReadonlyArray.ReadonlyArray_Impl_.indexOf<T>(((global::Array<T>) (this1) ), global::haxe.lang.Runtime.genericCast<T>(@ref), ((global::haxe.lang.Function) (eq) ));
				if (( pos < 0 )) {
					throw global::haxe.lang.HaxeException.wrap(new global::thx.Error("unable to find reference element", null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"replace", "thx._ReadonlyArray.ReadonlyArray_Impl_", "ReadonlyArray.hx"}, new int[]{1981972957}, new double[]{((double) (91) )})));
				}
				
				return ((global::Array<T>) (((global::Array<T>) (this1) ).slice(0, new global::haxe.lang.Null<int>(pos, true)).concat(new global::Array<T>(new T[]{el})).concat(((global::Array<T>) (this1) ).slice(( pos + 1 ), default(global::haxe.lang.Null<int>)))) );
			}
		}
		
		
		public static global::Array<T> replaceAt<T>(global::Array<T> this1, int pos, T el) {
			unchecked {
				return this1.slice(0, new global::haxe.lang.Null<int>(pos, true)).concat(new global::Array<T>(new T[]{el})).concat(this1.slice(( pos + 1 ), default(global::haxe.lang.Null<int>)));
			}
		}
		
		
		public static global::Array<T> @remove<T>(global::Array<T> this1, T el, global::haxe.lang.Function eq) {
			unchecked {
				int pos = global::thx._ReadonlyArray.ReadonlyArray_Impl_.indexOf<T>(((global::Array<T>) (this1) ), global::haxe.lang.Runtime.genericCast<T>(el), ((global::haxe.lang.Function) (eq) ));
				return ((global::Array<T>) (this1) ).slice(0, new global::haxe.lang.Null<int>(pos, true)).concat(((global::Array<T>) (this1) ).slice(( pos + 1 ), default(global::haxe.lang.Null<int>)));
			}
		}
		
		
		public static global::Array<T> removeAt<T>(global::Array<T> this1, int pos) {
			unchecked {
				return this1.slice(0, new global::haxe.lang.Null<int>(pos, true)).concat(this1.slice(( pos + 1 ), default(global::haxe.lang.Null<int>)));
			}
		}
		
		
		public static global::Array<T> prepend<T>(global::Array<T> this1, T el) {
			return new global::Array<T>(new T[]{el}).concat(this1);
		}
		
		
		public static global::Array<T> append<T>(global::Array<T> this1, T el) {
			return this1.concat(new global::Array<T>(new T[]{el}));
		}
		
		
		public static global::Array<T> unshift<T>(global::Array<T> this1, T el) {
			return ((global::Array<T>) (new global::Array<T>(new T[]{el}).concat(((global::Array<T>) (this1) ))) );
		}
		
		
		public static object shift<T>(global::Array<T> this1) {
			unchecked {
				if (( this1.length == 0 )) {
					return ((object) (new global::haxe.lang.DynamicObject(new int[]{21233, 21234}, new object[]{(default(global::haxe.lang.Null<T>)).toDynamic(), this1}, new int[]{}, new double[]{})) );
				}
				
				object __temp_stmt2 = null;
				{
					global::Array<T> __temp_odecl1 = ((global::Array<T>) (((global::Array<T>) (this1) ).slice(0, new global::haxe.lang.Null<int>(0, true)).concat(((global::Array<T>) (this1) ).slice(1, default(global::haxe.lang.Null<int>)))) );
					__temp_stmt2 = new global::haxe.lang.DynamicObject(new int[]{21233, 21234}, new object[]{this1[0], __temp_odecl1}, new int[]{}, new double[]{});
				}
				
				return ((object) (__temp_stmt2) );
			}
		}
		
		
		public static global::Array<T> push<T>(global::Array<T> this1, T el) {
			return ((global::Array<T>) (((global::Array<T>) (this1) ).concat(new global::Array<T>(new T[]{el}))) );
		}
		
		
		public static object pop<T>(global::Array<T> this1) {
			unchecked {
				if (( this1.length == 0 )) {
					return ((object) (new global::haxe.lang.DynamicObject(new int[]{21233, 21234}, new object[]{(default(global::haxe.lang.Null<T>)).toDynamic(), this1}, new int[]{}, new double[]{})) );
				}
				
				T @value = this1[( this1.length - 1 )];
				int pos = ( this1.length - 1 );
				global::Array<T> array = ((global::Array<T>) (this1) ).slice(0, new global::haxe.lang.Null<int>(pos, true)).concat(((global::Array<T>) (this1) ).slice(( pos + 1 ), default(global::haxe.lang.Null<int>)));
				return ((object) (new global::haxe.lang.DynamicObject(new int[]{21233, 21234}, new object[]{@value, array}, new int[]{}, new double[]{})) );
			}
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx._ReadonlyArray {
	public class ReadonlyArray_Impl__flatten_16__Fun<T> : global::haxe.lang.Function {
		
		public ReadonlyArray_Impl__flatten_16__Fun() : base(2, 0) {
		}
		
		
		public override object __hx_invoke2_o(double __fn_float1, object __fn_dyn1, double __fn_float2, object __fn_dyn2) {
			global::Array<T> element = ( (( __fn_dyn2 == global::haxe.lang.Runtime.undefined )) ? (((global::Array<T>) (global::Array<object>.__hx_cast<T>(((global::Array) (((object) (__fn_float2) )) ))) )) : (((global::Array<T>) (global::Array<object>.__hx_cast<T>(((global::Array) (__fn_dyn2) ))) )) );
			global::Array<T> acc = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((global::Array<T>) (global::Array<object>.__hx_cast<T>(((global::Array) (((object) (__fn_float1) )) ))) )) : (((global::Array<T>) (global::Array<object>.__hx_cast<T>(((global::Array) (__fn_dyn1) ))) )) );
			return ((global::Array<T>) (((global::Array<T>) (acc) ).concat(((global::Array<T>) (element) ))) );
		}
		
		
	}
}

