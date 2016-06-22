// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx.math.random._Random {
	public sealed class Random_Impl_ {
		
		public static int lessThan(object this1, int max) {
			return ((int) (( max * ((double) (global::haxe.lang.Runtime.toDouble(global::haxe.lang.Runtime.callField(this1, "float", 43435420, null))) ) )) );
		}
		
		
		public static int between(object this1, int min, int max) {
			unchecked {
				return ( ((int) (global::System.Math.Floor(((double) (( ((double) (global::haxe.lang.Runtime.toDouble(global::haxe.lang.Runtime.callField(this1, "float", 43435420, null))) ) * (( ( 1 + max ) - min )) )) ))) ) + min );
			}
		}
		
		
		public static int @int(object this1) {
			unchecked {
				return global::Std.random(2147483647);
			}
		}
		
		
		public static bool @bool(object this1) {
			unchecked {
				return ( ( global::thx.math.random._Random.Random_Impl_.@int(this1) % 2 ) == 0 );
			}
		}
		
		
		public static global::Array<T> shuffle<T>(object this1, global::Array<T> arr) {
			unchecked {
				global::Array<int> t = global::thx.Ints.range(arr.length, default(global::haxe.lang.Null<int>), default(global::haxe.lang.Null<int>));
				global::Array<T> array = new global::Array<T>(new T[]{});
				while (( t.length > 0 )) {
					int pos = global::thx.math.random._Random.Random_Impl_.lessThan(this1, t.length);
					int index = t[pos];
					t.splice(pos, 1);
					array.push(arr[index]);
				}
				
				return array;
			}
		}
		
		
	}
}

