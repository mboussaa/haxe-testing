// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx.math.random {
	public class PseudoRandom : global::haxe.lang.HxObject {
		
		public PseudoRandom(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public PseudoRandom(global::haxe.lang.Null<int> seed) {
			global::thx.math.random.PseudoRandom.__hx_ctor_thx_math_random_PseudoRandom(this, seed);
		}
		
		
		public static void __hx_ctor_thx_math_random_PseudoRandom(global::thx.math.random.PseudoRandom __temp_me39, global::haxe.lang.Null<int> seed) {
			unchecked {
				int __temp_seed38 = ( ( ! (seed.hasValue) ) ? (1) : ((seed).@value) );
				__temp_me39.seed = __temp_seed38;
			}
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::thx.math.random.PseudoRandom(((global::haxe.lang.EmptyObject) (global::haxe.lang.EmptyObject.EMPTY) ));
		}
		
		
		public static new object __hx_create(global::Array arr) {
			return new global::thx.math.random.PseudoRandom(global::haxe.lang.Null<object>.ofDynamic<int>(arr[0]));
		}
		
		
		public int seed;
		
		public virtual int @int() {
			unchecked {
				return ( (this.seed = ((int) (( ( this.seed * 48271.0 ) % 2147483647.0 )) )) & 1073741823 );
			}
		}
		
		
		public virtual double @float() {
			return ( this.@int() / 1073741823.0 );
		}
		
		
		public override double __hx_setField_f(string field, int hash, double @value, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 1280345457:
					{
						this.seed = ((int) (@value) );
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
					case 1280345457:
					{
						this.seed = ((int) (global::haxe.lang.Runtime.toInt(@value)) );
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
					case 43435420:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "float", 43435420)) );
					}
					
					
					case 5246191:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "int", 5246191)) );
					}
					
					
					case 1280345457:
					{
						return this.seed;
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
					case 1280345457:
					{
						return ((double) (this.seed) );
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
					case 43435420:
					{
						return this.@float();
					}
					
					
					case 5246191:
					{
						return this.@int();
					}
					
					
					default:
					{
						return base.__hx_invokeField(field, hash, dynargs);
					}
					
				}
				
			}
		}
		
		
		public override void __hx_getFields(global::Array<object> baseArr) {
			baseArr.push("seed");
			{
				base.__hx_getFields(baseArr);
			}
			
		}
		
		
	}
}

