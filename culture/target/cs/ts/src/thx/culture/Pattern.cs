// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx.culture {
	public class Pattern : global::haxe.lang.HxObject {
		
		static Pattern() {
			global::thx.culture.Pattern.currencyNegatives = new global::Array<object>(new object[]{"($n)", "-$n", "$-n", "$n-", "(n$)", "-n$", "n-$", "n$-", "-n $", "-$ n", "n $-", "$ n-", "$ -n", "n- $", "($ n)", "(n $)"});
			global::thx.culture.Pattern.currencyPositives = new global::Array<object>(new object[]{"$n", "n$", "$ n", "n $"});
			global::thx.culture.Pattern.numberNegatives = new global::Array<object>(new object[]{"(n)", "-n", "- n", "n-", "n -"});
			global::thx.culture.Pattern.percentNegatives = new global::Array<object>(new object[]{"-n %", "-n%", "-%n", "%-n", "%n-", "n-%", "n%-", "-%n", "n %-", "% n-", "% -n", "n- %"});
			global::thx.culture.Pattern.percentPositives = new global::Array<object>(new object[]{"n %", "n%", "%n", "% n"});
		}
		
		
		public Pattern(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public Pattern() {
			global::thx.culture.Pattern.__hx_ctor_thx_culture_Pattern(this);
		}
		
		
		public static void __hx_ctor_thx_culture_Pattern(global::thx.culture.Pattern __temp_me42) {
		}
		
		
		public static global::Array<object> currencyNegatives;
		
		public static global::Array<object> currencyPositives;
		
		public static global::Array<object> numberNegatives;
		
		public static global::Array<object> percentNegatives;
		
		public static global::Array<object> percentPositives;
		
		public static new object __hx_createEmpty() {
			return new global::thx.culture.Pattern(global::haxe.lang.EmptyObject.EMPTY);
		}
		
		
		public static new object __hx_create(global::Array arr) {
			return new global::thx.culture.Pattern();
		}
		
		
	}
}


