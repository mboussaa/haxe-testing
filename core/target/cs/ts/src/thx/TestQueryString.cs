// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class TestQueryString : global::haxe.lang.HxObject {
		
		public TestQueryString(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public TestQueryString() {
			global::thx.TestQueryString.__hx_ctor_thx_TestQueryString(this);
		}
		
		
		public static void __hx_ctor_thx_TestQueryString(global::thx.TestQueryString __temp_me217) {
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::thx.TestQueryString(global::haxe.lang.EmptyObject.EMPTY);
		}
		
		
		public static new object __hx_create(global::Array arr) {
			return new global::thx.TestQueryString();
		}
		
		
		public virtual void testBasics() {
			unchecked {
				global::utest.Assert.same(new global::haxe.lang.DynamicObject(new int[]{5097222}, new object[]{"bar"}, new int[]{}, new double[]{}), global::thx._QueryString.QueryString_Impl_.toObject(global::thx._QueryString.QueryString_Impl_.parseWithSymbols("?foo=bar", global::thx._QueryString.QueryString_Impl_.separator, global::thx._QueryString.QueryString_Impl_.assignment, global::thx._QueryString.QueryString_Impl_.decodeURIComponent)), default(global::haxe.lang.Null<bool>), null, default(global::haxe.lang.Null<double>), new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testBasics", "thx.TestQueryString", "TestQueryString.hx"}, new int[]{1981972957}, new double[]{((double) (10) )}));
				global::utest.Assert.same(new global::haxe.lang.DynamicObject(new int[]{5097222}, new object[]{"bar"}, new int[]{}, new double[]{}), global::thx._QueryString.QueryString_Impl_.toObject(global::thx._QueryString.QueryString_Impl_.parseWithSymbols("#foo=bar", global::thx._QueryString.QueryString_Impl_.separator, global::thx._QueryString.QueryString_Impl_.assignment, global::thx._QueryString.QueryString_Impl_.decodeURIComponent)), default(global::haxe.lang.Null<bool>), null, default(global::haxe.lang.Null<double>), new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testBasics", "thx.TestQueryString", "TestQueryString.hx"}, new int[]{1981972957}, new double[]{((double) (15) )}));
				global::utest.Assert.same(new global::haxe.lang.DynamicObject(new int[]{5097222}, new object[]{"bar"}, new int[]{}, new double[]{}), global::thx._QueryString.QueryString_Impl_.toObject(global::thx._QueryString.QueryString_Impl_.parseWithSymbols("foo=bar", global::thx._QueryString.QueryString_Impl_.separator, global::thx._QueryString.QueryString_Impl_.assignment, global::thx._QueryString.QueryString_Impl_.decodeURIComponent)), default(global::haxe.lang.Null<bool>), null, default(global::haxe.lang.Null<double>), new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testBasics", "thx.TestQueryString", "TestQueryString.hx"}, new int[]{1981972957}, new double[]{((double) (20) )}));
				global::utest.Assert.same(new global::haxe.lang.DynamicObject(new int[]{5097222}, new object[]{null}, new int[]{}, new double[]{}), global::thx._QueryString.QueryString_Impl_.toObject(global::thx._QueryString.QueryString_Impl_.parseWithSymbols("foo", global::thx._QueryString.QueryString_Impl_.separator, global::thx._QueryString.QueryString_Impl_.assignment, global::thx._QueryString.QueryString_Impl_.decodeURIComponent)), default(global::haxe.lang.Null<bool>), null, default(global::haxe.lang.Null<double>), new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testBasics", "thx.TestQueryString", "TestQueryString.hx"}, new int[]{1981972957}, new double[]{((double) (25) )}));
				global::utest.Assert.@equals("foo", global::thx._QueryString.QueryString_Impl_.toStringWithSymbols(((global::haxe.ds.StringMap<object>) (global::thx._QueryString.QueryString_Impl_.parseWithSymbols("foo", global::thx._QueryString.QueryString_Impl_.separator, global::thx._QueryString.QueryString_Impl_.assignment, global::thx._QueryString.QueryString_Impl_.decodeURIComponent)) ), global::thx._QueryString.QueryString_Impl_.separator, global::thx._QueryString.QueryString_Impl_.assignment, global::thx._QueryString.QueryString_Impl_.encodeURIComponent), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testBasics", "thx.TestQueryString", "TestQueryString.hx"}, new int[]{1981972957}, new double[]{((double) (30) )}));
				global::utest.Assert.same(new global::haxe.lang.DynamicObject(new int[]{5097222, 5343647}, new object[]{null, null}, new int[]{}, new double[]{}), global::thx._QueryString.QueryString_Impl_.toObject(global::thx._QueryString.QueryString_Impl_.parseWithSymbols("foo&key", global::thx._QueryString.QueryString_Impl_.separator, global::thx._QueryString.QueryString_Impl_.assignment, global::thx._QueryString.QueryString_Impl_.decodeURIComponent)), default(global::haxe.lang.Null<bool>), null, default(global::haxe.lang.Null<double>), new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testBasics", "thx.TestQueryString", "TestQueryString.hx"}, new int[]{1981972957}, new double[]{((double) (35) )}));
				global::utest.Assert.same(new global::haxe.lang.DynamicObject(new int[]{5097222, 5343647}, new object[]{"bar", null}, new int[]{}, new double[]{}), global::thx._QueryString.QueryString_Impl_.toObject(global::thx._QueryString.QueryString_Impl_.parseWithSymbols("foo=bar&key", global::thx._QueryString.QueryString_Impl_.separator, global::thx._QueryString.QueryString_Impl_.assignment, global::thx._QueryString.QueryString_Impl_.decodeURIComponent)), default(global::haxe.lang.Null<bool>), null, default(global::haxe.lang.Null<double>), new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testBasics", "thx.TestQueryString", "TestQueryString.hx"}, new int[]{1981972957}, new double[]{((double) (40) )}));
				global::utest.Assert.same(new global::haxe.lang.DynamicObject(new int[]{}, new object[]{}, new int[]{}, new double[]{}), global::thx._QueryString.QueryString_Impl_.toObject(global::thx._QueryString.QueryString_Impl_.parseWithSymbols("?", global::thx._QueryString.QueryString_Impl_.separator, global::thx._QueryString.QueryString_Impl_.assignment, global::thx._QueryString.QueryString_Impl_.decodeURIComponent)), default(global::haxe.lang.Null<bool>), null, default(global::haxe.lang.Null<double>), new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testBasics", "thx.TestQueryString", "TestQueryString.hx"}, new int[]{1981972957}, new double[]{((double) (45) )}));
				global::utest.Assert.same(new global::haxe.lang.DynamicObject(new int[]{}, new object[]{}, new int[]{}, new double[]{}), global::thx._QueryString.QueryString_Impl_.toObject(global::thx._QueryString.QueryString_Impl_.parseWithSymbols("#", global::thx._QueryString.QueryString_Impl_.separator, global::thx._QueryString.QueryString_Impl_.assignment, global::thx._QueryString.QueryString_Impl_.decodeURIComponent)), default(global::haxe.lang.Null<bool>), null, default(global::haxe.lang.Null<double>), new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testBasics", "thx.TestQueryString", "TestQueryString.hx"}, new int[]{1981972957}, new double[]{((double) (50) )}));
				global::utest.Assert.same(new global::haxe.lang.DynamicObject(new int[]{}, new object[]{}, new int[]{}, new double[]{}), global::thx._QueryString.QueryString_Impl_.toObject(global::thx._QueryString.QueryString_Impl_.parseWithSymbols(" ", global::thx._QueryString.QueryString_Impl_.separator, global::thx._QueryString.QueryString_Impl_.assignment, global::thx._QueryString.QueryString_Impl_.decodeURIComponent)), default(global::haxe.lang.Null<bool>), null, default(global::haxe.lang.Null<double>), new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testBasics", "thx.TestQueryString", "TestQueryString.hx"}, new int[]{1981972957}, new double[]{((double) (55) )}));
				global::utest.Assert.same(new global::haxe.lang.DynamicObject(new int[]{5097222}, new object[]{new global::Array<object>(new object[]{"bar", "baz"})}, new int[]{}, new double[]{}), global::thx._QueryString.QueryString_Impl_.toObject(global::thx._QueryString.QueryString_Impl_.parseWithSymbols("foo=bar&foo=baz", global::thx._QueryString.QueryString_Impl_.separator, global::thx._QueryString.QueryString_Impl_.assignment, global::thx._QueryString.QueryString_Impl_.decodeURIComponent)), default(global::haxe.lang.Null<bool>), null, default(global::haxe.lang.Null<double>), new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testBasics", "thx.TestQueryString", "TestQueryString.hx"}, new int[]{1981972957}, new double[]{((double) (60) )}));
				global::utest.Assert.same(new global::haxe.lang.DynamicObject(new int[]{1914261701}, new object[]{"bar baz  "}, new int[]{}, new double[]{}), global::thx._QueryString.QueryString_Impl_.toObject(global::thx._QueryString.QueryString_Impl_.parseWithSymbols("foo+faz=bar+baz++", global::thx._QueryString.QueryString_Impl_.separator, global::thx._QueryString.QueryString_Impl_.assignment, global::thx._QueryString.QueryString_Impl_.decodeURIComponent)), default(global::haxe.lang.Null<bool>), null, default(global::haxe.lang.Null<double>), new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testBasics", "thx.TestQueryString", "TestQueryString.hx"}, new int[]{1981972957}, new double[]{((double) (65) )}));
				global::utest.Assert.@equals("foo=bar", global::thx._QueryString.QueryString_Impl_.toStringWithSymbols(((global::haxe.ds.StringMap<object>) (global::thx._QueryString.QueryString_Impl_.fromObject(new global::haxe.lang.DynamicObject(new int[]{5097222}, new object[]{"bar"}, new int[]{}, new double[]{}))) ), global::thx._QueryString.QueryString_Impl_.separator, global::thx._QueryString.QueryString_Impl_.assignment, global::thx._QueryString.QueryString_Impl_.encodeURIComponent), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testBasics", "thx.TestQueryString", "TestQueryString.hx"}, new int[]{1981972957}, new double[]{((double) (70) )}));
				global::haxe.ds.StringMap<object> qs = global::thx._QueryString.QueryString_Impl_.fromObject(new global::haxe.lang.DynamicObject(new int[]{4895187, 5097222}, new object[]{"baz", "bar"}, new int[]{}, new double[]{}));
				global::utest.Assert.same(new global::Array<object>(new object[]{"bar"}), ((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) ((((global::haxe.ds.StringMap<object>) (qs) ).@get(((string) ("foo") ))).@value) ))) ), default(global::haxe.lang.Null<bool>), null, default(global::haxe.lang.Null<double>), new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testBasics", "thx.TestQueryString", "TestQueryString.hx"}, new int[]{1981972957}, new double[]{((double) (76) )}));
				global::utest.Assert.same(new global::Array<object>(new object[]{"baz"}), ((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) ((((global::haxe.ds.StringMap<object>) (qs) ).@get(((string) ("bar") ))).@value) ))) ), default(global::haxe.lang.Null<bool>), null, default(global::haxe.lang.Null<double>), new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testBasics", "thx.TestQueryString", "TestQueryString.hx"}, new int[]{1981972957}, new double[]{((double) (77) )}));
				string qs1 = global::thx._QueryString.QueryString_Impl_.toStringWithSymbols(((global::haxe.ds.StringMap<object>) (global::thx._QueryString.QueryString_Impl_.fromObject(new global::haxe.lang.DynamicObject(new int[]{1914062777}, new object[]{"baz faz"}, new int[]{}, new double[]{}))) ), global::thx._QueryString.QueryString_Impl_.separator, global::thx._QueryString.QueryString_Impl_.assignment, global::thx._QueryString.QueryString_Impl_.encodeURIComponent);
				global::utest.Assert.isTrue(( string.Equals("foo%20bar=baz%20faz", qs1) || string.Equals("foo+bar=baz+faz", qs1) ), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testBasics", "thx.TestQueryString", "TestQueryString.hx"}, new int[]{1981972957}, new double[]{((double) (80) )}));
				string qs2 = global::thx._QueryString.QueryString_Impl_.toStringWithSymbols(((global::haxe.ds.StringMap<object>) (global::thx._QueryString.QueryString_Impl_.fromObject(new global::haxe.lang.DynamicObject(new int[]{4845666, 5097222}, new object[]{"abc", new global::Array<object>(new object[]{"bar", "baz"})}, new int[]{}, new double[]{}))) ), global::thx._QueryString.QueryString_Impl_.separator, global::thx._QueryString.QueryString_Impl_.assignment, global::thx._QueryString.QueryString_Impl_.encodeURIComponent);
				global::utest.Assert.isTrue(( ( ( ( ( string.Equals("abc=abc&foo=bar&foo=baz", qs2) || string.Equals("foo=bar&abc=abc&foo=baz", qs2) ) || string.Equals("foo=bar&foo=baz&abc=abc", qs2) ) || string.Equals("abc=abc&foo=baz&foo=bar", qs2) ) || string.Equals("foo=bar&abc=abc&foo=baz", qs2) ) || string.Equals("foo=bar&foo=baz&abc=abc", qs2) ), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testBasics", "thx.TestQueryString", "TestQueryString.hx"}, new int[]{1981972957}, new double[]{((double) (86) )}));
				string qs3 = global::thx._QueryString.QueryString_Impl_.toStringWithSymbols(((global::haxe.ds.StringMap<object>) (global::thx._QueryString.QueryString_Impl_.parseWithSymbols("a=b&c=d", global::thx._QueryString.QueryString_Impl_.separator, global::thx._QueryString.QueryString_Impl_.assignment, global::thx._QueryString.QueryString_Impl_.decodeURIComponent)) ), global::thx._QueryString.QueryString_Impl_.separator, global::thx._QueryString.QueryString_Impl_.assignment, global::thx._QueryString.QueryString_Impl_.encodeURIComponent);
				global::utest.Assert.isTrue(( string.Equals("a=b&c=d", qs3) || string.Equals("c=d&a=b", qs3) ), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testBasics", "thx.TestQueryString", "TestQueryString.hx"}, new int[]{1981972957}, new double[]{((double) (96) )}));
			}
		}
		
		
		public override object __hx_getField(string field, int hash, bool throwErrors, bool isCheck, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 1847555063:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testBasics", 1847555063)) );
					}
					
					
					default:
					{
						return base.__hx_getField(field, hash, throwErrors, isCheck, handleProperties);
					}
					
				}
				
			}
		}
		
		
		public override object __hx_invokeField(string field, int hash, global::Array dynargs) {
			unchecked {
				switch (hash) {
					case 1847555063:
					{
						this.testBasics();
						break;
					}
					
					
					default:
					{
						return base.__hx_invokeField(field, hash, dynargs);
					}
					
				}
				
				return null;
			}
		}
		
		
	}
}


