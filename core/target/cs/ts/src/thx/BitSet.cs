// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx._BitSet {
	public sealed class BitSet_Impl_ {
		
		static BitSet_Impl_() {
			unchecked {
				global::thx._BitSet.BitSet_Impl_.blockSize = 32;
			}
		}
		
		
		public static int blockSize;
		
		
		
		public static global::Array<int> _new(int length) {
			unchecked {
				global::Array<int> this1 = new global::Array<int>(new int[]{length});
				global::thx.Arrays.resize<int>(((global::Array<int>) (this1) ), ((int) (( ( ((int) (( length / 32 )) ) + 1 ) + 1 )) ), ((int) (0) ));
				return ((global::Array<int>) (this1) );
			}
		}
		
		
		public static global::Array<int> empty(global::haxe.lang.Null<int> length) {
			unchecked {
				global::haxe.lang.Null<int> __temp_length86 = ( ( ! (length.hasValue) ) ? (new global::haxe.lang.Null<int>(0, true)) : (length) );
				int length1 = (__temp_length86).@value;
				global::Array<int> this1 = new global::Array<int>(new int[]{length1});
				global::thx.Arrays.resize<int>(((global::Array<int>) (this1) ), ((int) (( ( ((int) (( length1 / 32 )) ) + 1 ) + 1 )) ), ((int) (0) ));
				return ((global::Array<int>) (this1) );
			}
		}
		
		
		public static global::Array<int> fromBools(global::Array<bool> values) {
			unchecked {
				global::Array<int> this1 = new global::Array<int>(new int[]{0});
				global::thx.Arrays.resize<int>(((global::Array<int>) (this1) ), ((int) (( ( ((int) (0.0) ) + 1 ) + 1 )) ), ((int) (0) ));
				return ((global::Array<int>) (global::Array<object>.__hx_cast<int>(((global::Array) (global::thx.Arrays.reducei<bool, object>(((global::Array<bool>) (values) ), ((global::haxe.lang.Function) (( (( global::thx._BitSet.BitSet_Impl__fromBools_46__Fun.__hx_current != null )) ? (global::thx._BitSet.BitSet_Impl__fromBools_46__Fun.__hx_current) : (global::thx._BitSet.BitSet_Impl__fromBools_46__Fun.__hx_current = ((global::thx._BitSet.BitSet_Impl__fromBools_46__Fun) (new global::thx._BitSet.BitSet_Impl__fromBools_46__Fun()) )) )) ), ((global::Array<int>) (this1) ))) ))) );
			}
		}
		
		
		public static global::Array<int> fromString(string str) {
			unchecked {
				global::Array<object> chars = global::haxe.lang.StringExt.split(str, "");
				global::Array<int> this1 = new global::Array<int>(new int[]{0});
				global::thx.Arrays.resize<int>(((global::Array<int>) (this1) ), ((int) (( ( ((int) (0.0) ) + 1 ) + 1 )) ), ((int) (0) ));
				return ((global::Array<int>) (global::Array<object>.__hx_cast<int>(((global::Array) (global::thx.Arrays.reducei<object, object>(((global::Array<object>) (chars) ), ((global::haxe.lang.Function) (( (( global::thx._BitSet.BitSet_Impl__fromString_58__Fun.__hx_current != null )) ? (global::thx._BitSet.BitSet_Impl__fromString_58__Fun.__hx_current) : (global::thx._BitSet.BitSet_Impl__fromString_58__Fun.__hx_current = ((global::thx._BitSet.BitSet_Impl__fromString_58__Fun) (new global::thx._BitSet.BitSet_Impl__fromString_58__Fun()) )) )) ), ((global::Array<int>) (this1) ))) ))) );
			}
		}
		
		
		public static global::Array<bool> toBools(global::Array<int> this1) {
			return global::thx.Ints.range(global::thx._BitSet.BitSet_Impl_.get_length(this1), default(global::haxe.lang.Null<int>), default(global::haxe.lang.Null<int>)).map<bool>(((global::haxe.lang.Function) (new global::thx._BitSet.BitSet_Impl__toBools_69__Fun(this1)) ));
		}
		
		
		public static global::Array<int> toInt32s(global::Array<int> this1) {
			unchecked {
				return this1.slice(1, default(global::haxe.lang.Null<int>));
			}
		}
		
		
		public static bool at(global::Array<int> this1, int index) {
			unchecked {
				if (( ( index < 0 ) || ( index >= global::thx._BitSet.BitSet_Impl_.get_length(this1) ) )) {
					throw global::haxe.lang.HaxeException.wrap(new global::thx.Error(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("BitSet: index ", global::haxe.lang.Runtime.toString(index)), " out of bounds"), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"at", "thx._BitSet.BitSet_Impl_", "BitSet.hx"}, new int[]{1981972957}, new double[]{((double) (88) )})));
				}
				
				return ((bool) (( (((int) (( this1[( ((int) (global::System.Math.Floor(((double) (( ((double) (index) ) / 32 )) ))) ) + 1 )] & ( 1 << ( index % 32 ) ) )) )) != 0 )) );
			}
		}
		
		
		public static bool setAt(global::Array<int> this1, int index, bool @value) {
			unchecked {
				int blockIndex = ( ((int) (global::System.Math.Floor(((double) (( ((double) (index) ) / 32 )) ))) ) + 1 );
				if (( blockIndex >= this1.length )) {
					global::thx.Arrays.resize<int>(((global::Array<int>) (this1) ), ((int) (( blockIndex + 1 )) ), ((int) (0) ));
				}
				
				if (((bool) (( this1[0] <= index )) )) {
					this1[0] = ( index + 1 );
				}
				
				int bitIndex = ( index % 32 );
				if (@value) {
					this1[blockIndex] = ((int) (( this1[blockIndex] | ((int) (( 1 << bitIndex )) ) )) );
				}
				else {
					this1[blockIndex] = ((int) (( this1[blockIndex] &  ~ ((((int) (( 1 << bitIndex )) )))  )) );
				}
				
				return @value;
			}
		}
		
		
		public static global::Array<int> clone(global::Array<int> this1) {
			unchecked {
				global::Array<int> tmp = global::thx.Ints.range(global::thx._BitSet.BitSet_Impl_.get_length(this1), default(global::haxe.lang.Null<int>), default(global::haxe.lang.Null<int>));
				global::Array<int> this2 = new global::Array<int>(new int[]{0});
				global::thx.Arrays.resize<int>(((global::Array<int>) (this2) ), ((int) (( ( ((int) (0.0) ) + 1 ) + 1 )) ), ((int) (0) ));
				return ((global::Array<int>) (global::Array<object>.__hx_cast<int>(((global::Array) (global::thx.Arrays.reduce<int, object>(((global::Array<int>) (tmp) ), ((global::haxe.lang.Function) (new global::thx._BitSet.BitSet_Impl__clone_120__Fun(this1)) ), ((global::Array<int>) (this2) ))) ))) );
			}
		}
		
		
		public static global::Array<int> setAll(global::Array<int> this1, global::haxe.lang.Null<bool> @value) {
			global::haxe.lang.Null<bool> __temp_value87 = ( ( ! (@value.hasValue) ) ? (new global::haxe.lang.Null<bool>(true, true)) : (@value) );
			{
				int _g1 = 0;
				int _g = global::thx._BitSet.BitSet_Impl_.get_length(this1);
				while (( _g1 < _g )) {
					global::thx._BitSet.BitSet_Impl_.setAt(this1, _g1++, (__temp_value87).@value);
				}
				
			}
			
			return this1;
		}
		
		
		public static global::Array<int> clearAll(global::Array<int> this1) {
			{
				int _g1 = 0;
				int _g = global::thx._BitSet.BitSet_Impl_.get_length(((global::Array<int>) (this1) ));
				while (( _g1 < _g )) {
					global::thx._BitSet.BitSet_Impl_.setAt(((global::Array<int>) (this1) ), _g1++, false);
				}
				
			}
			
			return ((global::Array<int>) (this1) );
		}
		
		
		public static global::Array<int> concat(global::Array<int> this1, global::Array<int> right) {
			unchecked {
				global::Array<int> left = this1;
				int length = ( ((int) (global::thx._BitSet.BitSet_Impl_.get_length(left)) ) + ((int) (global::thx._BitSet.BitSet_Impl_.get_length(right)) ) );
				global::Array<int> this2 = new global::Array<int>(new int[]{length});
				global::thx.Arrays.resize<int>(((global::Array<int>) (this2) ), ((int) (( ( ((int) (( length / 32 )) ) + 1 ) + 1 )) ), ((int) (0) ));
				global::Array<int> result = ((global::Array<int>) (this2) );
				int index = 0;
				{
					int _g1 = 0;
					int _g = ((int) (global::thx._BitSet.BitSet_Impl_.get_length(left)) );
					while (( _g1 < _g )) {
						global::thx._BitSet.BitSet_Impl_.setAt(result, index++, global::thx._BitSet.BitSet_Impl_.at(left, _g1++));
					}
					
				}
				
				{
					int _g11 = 0;
					int _g2 = ((int) (global::thx._BitSet.BitSet_Impl_.get_length(right)) );
					while (( _g11 < _g2 )) {
						global::thx._BitSet.BitSet_Impl_.setAt(result, index++, global::thx._BitSet.BitSet_Impl_.at(right, _g11++));
					}
					
				}
				
				return result;
			}
		}
		
		
		public static global::Array<int> expand(global::Array<int> this1, int count) {
			unchecked {
				global::Array<bool> values = global::thx.Arrays.flatten<bool>(((global::Array<object>) (global::thx.Ints.range(global::thx._BitSet.BitSet_Impl_.get_length(this1), default(global::haxe.lang.Null<int>), default(global::haxe.lang.Null<int>)).map<object>(((global::haxe.lang.Function) (new global::thx._BitSet.BitSet_Impl__expand_163__Fun_0(this1, count)) ))) ));
				global::Array<int> this2 = new global::Array<int>(new int[]{0});
				global::thx.Arrays.resize<int>(((global::Array<int>) (this2) ), ((int) (( ( ((int) (0.0) ) + 1 ) + 1 )) ), ((int) (0) ));
				return ((global::Array<int>) (global::Array<object>.__hx_cast<int>(((global::Array) (global::thx.Arrays.reducei<bool, object>(((global::Array<bool>) (values) ), ((global::haxe.lang.Function) (( (( global::thx._BitSet.BitSet_Impl__expand_163__Fun.__hx_current != null )) ? (global::thx._BitSet.BitSet_Impl__expand_163__Fun.__hx_current) : (global::thx._BitSet.BitSet_Impl__expand_163__Fun.__hx_current = ((global::thx._BitSet.BitSet_Impl__expand_163__Fun) (new global::thx._BitSet.BitSet_Impl__expand_163__Fun()) )) )) ), ((global::Array<int>) (this2) ))) ))) );
			}
		}
		
		
		public static string toString(global::Array<int> this1) {
			return global::thx.Ints.range(global::thx._BitSet.BitSet_Impl_.get_length(this1), default(global::haxe.lang.Null<int>), default(global::haxe.lang.Null<int>)).map<object>(((global::haxe.lang.Function) (new global::thx._BitSet.BitSet_Impl__toString_172__Fun(this1)) )).@join("");
		}
		
		
		public static global::Array<int> and(global::Array<int> this1, global::Array<int> right) {
			return global::thx._BitSet.BitSet_Impl_.combine(this1, right, ( (( global::thx._BitSet.BitSet_Impl__and_183__Fun.__hx_current != null )) ? (global::thx._BitSet.BitSet_Impl__and_183__Fun.__hx_current) : (global::thx._BitSet.BitSet_Impl__and_183__Fun.__hx_current = ((global::thx._BitSet.BitSet_Impl__and_183__Fun) (new global::thx._BitSet.BitSet_Impl__and_183__Fun()) )) ));
		}
		
		
		public static global::Array<int> or(global::Array<int> this1, global::Array<int> right) {
			return global::thx._BitSet.BitSet_Impl_.combine(this1, right, ( (( global::thx._BitSet.BitSet_Impl__or_192__Fun.__hx_current != null )) ? (global::thx._BitSet.BitSet_Impl__or_192__Fun.__hx_current) : (global::thx._BitSet.BitSet_Impl__or_192__Fun.__hx_current = ((global::thx._BitSet.BitSet_Impl__or_192__Fun) (new global::thx._BitSet.BitSet_Impl__or_192__Fun()) )) ));
		}
		
		
		public static global::Array<int> xor(global::Array<int> this1, global::Array<int> right) {
			return global::thx._BitSet.BitSet_Impl_.combine(this1, right, ( (( global::thx._BitSet.BitSet_Impl__xor_201__Fun.__hx_current != null )) ? (global::thx._BitSet.BitSet_Impl__xor_201__Fun.__hx_current) : (global::thx._BitSet.BitSet_Impl__xor_201__Fun.__hx_current = ((global::thx._BitSet.BitSet_Impl__xor_201__Fun) (new global::thx._BitSet.BitSet_Impl__xor_201__Fun()) )) ));
		}
		
		
		public static global::Array<int> negate(global::Array<int> this1) {
			unchecked {
				global::Array<int> tmp = global::thx.Ints.range(global::thx._BitSet.BitSet_Impl_.get_length(this1), default(global::haxe.lang.Null<int>), default(global::haxe.lang.Null<int>));
				global::Array<int> this2 = new global::Array<int>(new int[]{0});
				global::thx.Arrays.resize<int>(((global::Array<int>) (this2) ), ((int) (( ( ((int) (0.0) ) + 1 ) + 1 )) ), ((int) (0) ));
				return ((global::Array<int>) (global::Array<object>.__hx_cast<int>(((global::Array) (global::thx.Arrays.reduce<int, object>(((global::Array<int>) (tmp) ), ((global::haxe.lang.Function) (new global::thx._BitSet.BitSet_Impl__negate_210__Fun(this1)) ), ((global::Array<int>) (this2) ))) ))) );
			}
		}
		
		
		public static bool @equals(global::Array<int> this1, global::Array<int> other) {
			if (((bool) (( global::thx._BitSet.BitSet_Impl_.get_length(this1) != global::thx._BitSet.BitSet_Impl_.get_length(other) )) )) {
				return false;
			}
			
			{
				int _g1 = 0;
				int _g = global::thx._BitSet.BitSet_Impl_.get_length(this1);
				while (( _g1 < _g )) {
					int i = _g1++;
					if (( global::thx._BitSet.BitSet_Impl_.at(this1, i) != global::thx._BitSet.BitSet_Impl_.at(other, i) )) {
						return false;
					}
					
				}
				
			}
			
			return true;
		}
		
		
		public static bool notEquals(global::Array<int> this1, global::Array<int> other) {
			return  ! (global::thx._BitSet.BitSet_Impl_.@equals(this1, other)) ;
		}
		
		
		public static global::Array<int> combine(global::Array<int> this1, global::Array<int> right, global::haxe.lang.Function combiner) {
			unchecked {
				global::Array<int> left = this1;
				int a = global::thx._BitSet.BitSet_Impl_.get_length(left);
				int b = global::thx._BitSet.BitSet_Impl_.get_length(right);
				global::Array<int> tmp = global::thx.Ints.range(( (( a > b )) ? (a) : (b) ), default(global::haxe.lang.Null<int>), default(global::haxe.lang.Null<int>));
				global::Array<int> this2 = new global::Array<int>(new int[]{0});
				global::thx.Arrays.resize<int>(((global::Array<int>) (this2) ), ((int) (( ( ((int) (0.0) ) + 1 ) + 1 )) ), ((int) (0) ));
				return ((global::Array<int>) (global::Array<object>.__hx_cast<int>(((global::Array) (global::thx.Arrays.reduce<int, object>(((global::Array<int>) (tmp) ), ((global::haxe.lang.Function) (new global::thx._BitSet.BitSet_Impl__combine_233__Fun(right, left, combiner)) ), ((global::Array<int>) (this2) ))) ))) );
			}
		}
		
		
		public static int get_length(global::Array<int> this1) {
			return this1[0];
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx._BitSet {
	public class BitSet_Impl__fromBools_46__Fun : global::haxe.lang.Function {
		
		public BitSet_Impl__fromBools_46__Fun() : base(3, 0) {
		}
		
		
		public static global::thx._BitSet.BitSet_Impl__fromBools_46__Fun __hx_current;
		
		public override object __hx_invoke3_o(double __fn_float1, object __fn_dyn1, double __fn_float2, object __fn_dyn2, double __fn_float3, object __fn_dyn3) {
			int i = ( (( __fn_dyn3 == global::haxe.lang.Runtime.undefined )) ? (((int) (__fn_float3) )) : (((int) (global::haxe.lang.Runtime.toInt(__fn_dyn3)) )) );
			bool @value = ( (( __fn_dyn2 == global::haxe.lang.Runtime.undefined )) ? (global::haxe.lang.Runtime.toBool(((object) (__fn_float2) ))) : (global::haxe.lang.Runtime.toBool(__fn_dyn2)) );
			global::Array<int> acc = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((global::Array<int>) (global::Array<object>.__hx_cast<int>(((global::Array) (((object) (__fn_float1) )) ))) )) : (((global::Array<int>) (global::Array<object>.__hx_cast<int>(((global::Array) (__fn_dyn1) ))) )) );
			global::thx._BitSet.BitSet_Impl_.setAt(acc, i, @value);
			return acc;
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx._BitSet {
	public class BitSet_Impl__fromString_58__Fun : global::haxe.lang.Function {
		
		public BitSet_Impl__fromString_58__Fun() : base(3, 0) {
		}
		
		
		public static global::thx._BitSet.BitSet_Impl__fromString_58__Fun __hx_current;
		
		public override object __hx_invoke3_o(double __fn_float1, object __fn_dyn1, double __fn_float2, object __fn_dyn2, double __fn_float3, object __fn_dyn3) {
			int i = ( (( __fn_dyn3 == global::haxe.lang.Runtime.undefined )) ? (((int) (__fn_float3) )) : (((int) (global::haxe.lang.Runtime.toInt(__fn_dyn3)) )) );
			string @char = ( (( __fn_dyn2 == global::haxe.lang.Runtime.undefined )) ? (global::haxe.lang.Runtime.toString(__fn_float2)) : (global::haxe.lang.Runtime.toString(__fn_dyn2)) );
			global::Array<int> acc = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((global::Array<int>) (global::Array<object>.__hx_cast<int>(((global::Array) (((object) (__fn_float1) )) ))) )) : (((global::Array<int>) (global::Array<object>.__hx_cast<int>(((global::Array) (__fn_dyn1) ))) )) );
			global::thx._BitSet.BitSet_Impl_.setAt(acc, i, string.Equals(@char, "1"));
			return acc;
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx._BitSet {
	public class BitSet_Impl__toBools_69__Fun : global::haxe.lang.Function {
		
		public BitSet_Impl__toBools_69__Fun(global::Array<int> this1) : base(1, 0) {
			this.this1 = this1;
		}
		
		
		public override object __hx_invoke1_o(double __fn_float1, object __fn_dyn1) {
			int index = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((int) (__fn_float1) )) : (((int) (global::haxe.lang.Runtime.toInt(__fn_dyn1)) )) );
			return global::thx._BitSet.BitSet_Impl_.at(this.this1, index);
		}
		
		
		public global::Array<int> this1;
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx._BitSet {
	public class BitSet_Impl__clone_120__Fun : global::haxe.lang.Function {
		
		public BitSet_Impl__clone_120__Fun(global::Array<int> this1) : base(2, 0) {
			this.this1 = this1;
		}
		
		
		public override object __hx_invoke2_o(double __fn_float1, object __fn_dyn1, double __fn_float2, object __fn_dyn2) {
			int i = ( (( __fn_dyn2 == global::haxe.lang.Runtime.undefined )) ? (((int) (__fn_float2) )) : (((int) (global::haxe.lang.Runtime.toInt(__fn_dyn2)) )) );
			global::Array<int> acc = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((global::Array<int>) (global::Array<object>.__hx_cast<int>(((global::Array) (((object) (__fn_float1) )) ))) )) : (((global::Array<int>) (global::Array<object>.__hx_cast<int>(((global::Array) (__fn_dyn1) ))) )) );
			global::thx._BitSet.BitSet_Impl_.setAt(acc, i, global::thx._BitSet.BitSet_Impl_.at(this.this1, i));
			return acc;
		}
		
		
		public global::Array<int> this1;
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx._BitSet {
	public class BitSet_Impl__expand_163__Fun_0 : global::haxe.lang.Function {
		
		public BitSet_Impl__expand_163__Fun_0(global::Array<int> this1, int count) : base(1, 0) {
			this.this1 = this1;
			this.count = count;
		}
		
		
		public override object __hx_invoke1_o(double __fn_float1, object __fn_dyn1) {
			unchecked {
				int index = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((int) (__fn_float1) )) : (((int) (global::haxe.lang.Runtime.toInt(__fn_dyn1)) )) );
				return global::thx.Arrays.create<bool>(((int) (( this.count + 1 )) ), ((bool) (global::thx._BitSet.BitSet_Impl_.at(this.this1, index)) ));
			}
		}
		
		
		public global::Array<int> this1;
		
		public int count;
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx._BitSet {
	public class BitSet_Impl__expand_163__Fun : global::haxe.lang.Function {
		
		public BitSet_Impl__expand_163__Fun() : base(3, 0) {
		}
		
		
		public static global::thx._BitSet.BitSet_Impl__expand_163__Fun __hx_current;
		
		public override object __hx_invoke3_o(double __fn_float1, object __fn_dyn1, double __fn_float2, object __fn_dyn2, double __fn_float3, object __fn_dyn3) {
			int i = ( (( __fn_dyn3 == global::haxe.lang.Runtime.undefined )) ? (((int) (__fn_float3) )) : (((int) (global::haxe.lang.Runtime.toInt(__fn_dyn3)) )) );
			bool @value = ( (( __fn_dyn2 == global::haxe.lang.Runtime.undefined )) ? (global::haxe.lang.Runtime.toBool(((object) (__fn_float2) ))) : (global::haxe.lang.Runtime.toBool(__fn_dyn2)) );
			global::Array<int> acc = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((global::Array<int>) (global::Array<object>.__hx_cast<int>(((global::Array) (((object) (__fn_float1) )) ))) )) : (((global::Array<int>) (global::Array<object>.__hx_cast<int>(((global::Array) (__fn_dyn1) ))) )) );
			global::thx._BitSet.BitSet_Impl_.setAt(acc, i, @value);
			return acc;
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx._BitSet {
	public class BitSet_Impl__toString_172__Fun : global::haxe.lang.Function {
		
		public BitSet_Impl__toString_172__Fun(global::Array<int> this1) : base(1, 0) {
			this.this1 = this1;
		}
		
		
		public override object __hx_invoke1_o(double __fn_float1, object __fn_dyn1) {
			int index = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((int) (__fn_float1) )) : (((int) (global::haxe.lang.Runtime.toInt(__fn_dyn1)) )) );
			if (global::thx._BitSet.BitSet_Impl_.at(this.this1, index)) {
				return "1";
			}
			else {
				return "0";
			}
			
		}
		
		
		public global::Array<int> this1;
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx._BitSet {
	public class BitSet_Impl__and_183__Fun : global::haxe.lang.Function {
		
		public BitSet_Impl__and_183__Fun() : base(2, 0) {
		}
		
		
		public static global::thx._BitSet.BitSet_Impl__and_183__Fun __hx_current;
		
		public override object __hx_invoke2_o(double __fn_float1, object __fn_dyn1, double __fn_float2, object __fn_dyn2) {
			bool r = ( (( __fn_dyn2 == global::haxe.lang.Runtime.undefined )) ? (global::haxe.lang.Runtime.toBool(((object) (__fn_float2) ))) : (global::haxe.lang.Runtime.toBool(__fn_dyn2)) );
			bool l = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (global::haxe.lang.Runtime.toBool(((object) (__fn_float1) ))) : (global::haxe.lang.Runtime.toBool(__fn_dyn1)) );
			if (l) {
				return r;
			}
			else {
				return false;
			}
			
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx._BitSet {
	public class BitSet_Impl__or_192__Fun : global::haxe.lang.Function {
		
		public BitSet_Impl__or_192__Fun() : base(2, 0) {
		}
		
		
		public static global::thx._BitSet.BitSet_Impl__or_192__Fun __hx_current;
		
		public override object __hx_invoke2_o(double __fn_float1, object __fn_dyn1, double __fn_float2, object __fn_dyn2) {
			bool r = ( (( __fn_dyn2 == global::haxe.lang.Runtime.undefined )) ? (global::haxe.lang.Runtime.toBool(((object) (__fn_float2) ))) : (global::haxe.lang.Runtime.toBool(__fn_dyn2)) );
			bool l = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (global::haxe.lang.Runtime.toBool(((object) (__fn_float1) ))) : (global::haxe.lang.Runtime.toBool(__fn_dyn1)) );
			if ( ! (l) ) {
				return r;
			}
			else {
				return true;
			}
			
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx._BitSet {
	public class BitSet_Impl__xor_201__Fun : global::haxe.lang.Function {
		
		public BitSet_Impl__xor_201__Fun() : base(2, 0) {
		}
		
		
		public static global::thx._BitSet.BitSet_Impl__xor_201__Fun __hx_current;
		
		public override object __hx_invoke2_o(double __fn_float1, object __fn_dyn1, double __fn_float2, object __fn_dyn2) {
			bool r = ( (( __fn_dyn2 == global::haxe.lang.Runtime.undefined )) ? (global::haxe.lang.Runtime.toBool(((object) (__fn_float2) ))) : (global::haxe.lang.Runtime.toBool(__fn_dyn2)) );
			bool l = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (global::haxe.lang.Runtime.toBool(((object) (__fn_float1) ))) : (global::haxe.lang.Runtime.toBool(__fn_dyn1)) );
			if ( ! ((( l &&  ! (r)  ))) ) {
				if ( ! (l) ) {
					return r;
				}
				else {
					return false;
				}
				
			}
			else {
				return true;
			}
			
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx._BitSet {
	public class BitSet_Impl__negate_210__Fun : global::haxe.lang.Function {
		
		public BitSet_Impl__negate_210__Fun(global::Array<int> this1) : base(2, 0) {
			this.this1 = this1;
		}
		
		
		public override object __hx_invoke2_o(double __fn_float1, object __fn_dyn1, double __fn_float2, object __fn_dyn2) {
			int i = ( (( __fn_dyn2 == global::haxe.lang.Runtime.undefined )) ? (((int) (__fn_float2) )) : (((int) (global::haxe.lang.Runtime.toInt(__fn_dyn2)) )) );
			global::Array<int> acc = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((global::Array<int>) (global::Array<object>.__hx_cast<int>(((global::Array) (((object) (__fn_float1) )) ))) )) : (((global::Array<int>) (global::Array<object>.__hx_cast<int>(((global::Array) (__fn_dyn1) ))) )) );
			global::thx._BitSet.BitSet_Impl_.setAt(acc, i,  ! (global::thx._BitSet.BitSet_Impl_.at(this.this1, i)) );
			return acc;
		}
		
		
		public global::Array<int> this1;
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx._BitSet {
	public class BitSet_Impl__combine_233__Fun : global::haxe.lang.Function {
		
		public BitSet_Impl__combine_233__Fun(global::Array<int> right, global::Array<int> left, global::haxe.lang.Function combiner) : base(2, 0) {
			this.right = right;
			this.left = left;
			this.combiner = combiner;
		}
		
		
		public override object __hx_invoke2_o(double __fn_float1, object __fn_dyn1, double __fn_float2, object __fn_dyn2) {
			int i = ( (( __fn_dyn2 == global::haxe.lang.Runtime.undefined )) ? (((int) (__fn_float2) )) : (((int) (global::haxe.lang.Runtime.toInt(__fn_dyn2)) )) );
			global::Array<int> acc = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (((global::Array<int>) (global::Array<object>.__hx_cast<int>(((global::Array) (((object) (__fn_float1) )) ))) )) : (((global::Array<int>) (global::Array<object>.__hx_cast<int>(((global::Array) (__fn_dyn1) ))) )) );
			global::thx._BitSet.BitSet_Impl_.setAt(acc, i, global::haxe.lang.Runtime.toBool(this.combiner.__hx_invoke2_o(default(double), global::thx._BitSet.BitSet_Impl_.at(this.left, i), default(double), global::thx._BitSet.BitSet_Impl_.at(this.right, i))));
			return acc;
		}
		
		
		public global::Array<int> right;
		
		public global::Array<int> left;
		
		public global::haxe.lang.Function combiner;
		
	}
}

