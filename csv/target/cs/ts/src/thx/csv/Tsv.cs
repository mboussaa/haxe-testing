// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx.csv {
	public class Tsv : global::haxe.lang.HxObject {
		
		static Tsv() {
			global::thx.csv.Tsv.encodeOptions = new global::haxe.lang.DynamicObject(new int[]{103286535, 212244564, 1576149820, 2039415417}, new object[]{"\t", "\n", "\"", "\"\""}, new int[]{}, new double[]{});
			global::thx.csv.Tsv.decodeOptions = new global::haxe.lang.DynamicObject(new int[]{103286535, 142541748, 1071573604, 1576149820, 2039415417}, new object[]{"\t", true, false, "\"", "\"\""}, new int[]{}, new double[]{});
		}
		
		
		public Tsv(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public Tsv() {
			global::thx.csv.Tsv.__hx_ctor_thx_csv_Tsv(this);
		}
		
		
		public static void __hx_ctor_thx_csv_Tsv(global::thx.csv.Tsv __temp_me135) {
		}
		
		
		public static object encodeOptions;
		
		public static object decodeOptions;
		
		public static global::Array<object> decode(string csv) {
			return global::thx.csv.Dsv.decode(csv, global::thx.csv.Tsv.decodeOptions);
		}
		
		
		public static global::Array<object> decodeObjects(string tsv) {
			return global::thx.csv.Dsv.arrayToObjects(global::thx.csv.Dsv.decode(tsv, global::thx.csv.Tsv.decodeOptions));
		}
		
		
		public static string encode(global::Array<object> data) {
			return global::thx.csv.Dsv.encode(data, global::thx.csv.Tsv.encodeOptions);
		}
		
		
		public static string encodeObjects(global::Array<object> data) {
			return global::thx.csv.Dsv.encodeObjects(data, global::thx.csv.Tsv.encodeOptions);
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::thx.csv.Tsv(global::haxe.lang.EmptyObject.EMPTY);
		}
		
		
		public static new object __hx_create(global::Array arr) {
			return new global::thx.csv.Tsv();
		}
		
		
	}
}


