// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx {
	public class TestPath : global::haxe.lang.HxObject {
		
		public TestPath(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public TestPath() {
			global::thx.TestPath.__hx_ctor_thx_TestPath(this);
		}
		
		
		public static void __hx_ctor_thx_TestPath(global::thx.TestPath __temp_me216) {
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::thx.TestPath(global::haxe.lang.EmptyObject.EMPTY);
		}
		
		
		public static new object __hx_create(global::Array arr) {
			return new global::thx.TestPath();
		}
		
		
		public virtual void testIsRelativeAndIsAbsolute() {
			unchecked {
				global::Array<object> rel = global::thx._Path.Path_Impl_.fromString("a/b");
				global::Array<object> abs = global::thx._Path.Path_Impl_.fromString("/a/b");
				global::utest.Assert.isTrue(string.Equals(global::haxe.lang.Runtime.toString(((global::Array<object>) (rel) )[1]), ""), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testIsRelativeAndIsAbsolute", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (13) )}));
				global::utest.Assert.isFalse( ! (string.Equals(global::haxe.lang.Runtime.toString(((global::Array<object>) (rel) )[1]), "")) , null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testIsRelativeAndIsAbsolute", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (14) )}));
				global::utest.Assert.isTrue( ! (string.Equals(global::haxe.lang.Runtime.toString(((global::Array<object>) (abs) )[1]), "")) , null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testIsRelativeAndIsAbsolute", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (15) )}));
				global::utest.Assert.isFalse(string.Equals(global::haxe.lang.Runtime.toString(((global::Array<object>) (abs) )[1]), ""), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testIsRelativeAndIsAbsolute", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (16) )}));
			}
		}
		
		
		public virtual void testPathTo() {
			unchecked {
				global::Array<object> path1 = global::thx._Path.Path_Impl_.fromString("/a/b/c");
				global::Array<object> path2 = global::thx._Path.Path_Impl_.fromString("/a/d");
				global::Array<object> path3 = global::thx._Path.Path_Impl_.fromString("/x/y/z");
				global::Array<object> path4 = global::thx._Path.Path_Impl_.fromString("a/b/c");
				global::Array<object> path5 = global::thx._Path.Path_Impl_.fromString("x/y/z");
				global::utest.Assert.@equals("../../d", global::thx._Path.Path_Impl_.toString(global::thx._Path.Path_Impl_.pathTo(path1, path2)), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testPathTo", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (25) )}));
				global::utest.Assert.@equals("../../../x/y/z", global::thx._Path.Path_Impl_.toString(global::thx._Path.Path_Impl_.pathTo(path1, path3)), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testPathTo", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (26) )}));
				global::utest.Assert.@equals("../b/c", global::thx._Path.Path_Impl_.toString(global::thx._Path.Path_Impl_.pathTo(path2, path1)), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testPathTo", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (27) )}));
				global::utest.Assert.@equals("/a/b/c/a/b/c", global::thx._Path.Path_Impl_.toString(global::thx._Path.Path_Impl_.pathTo(path1, path4)), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testPathTo", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (29) )}));
				global::utest.Assert.@equals("/a/d", global::thx._Path.Path_Impl_.toString(global::thx._Path.Path_Impl_.pathTo(path5, path2)), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testPathTo", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (30) )}));
				global::utest.Assert.@equals("a/b/c/x/y/z", global::thx._Path.Path_Impl_.toString(global::thx._Path.Path_Impl_.pathTo(path4, path5)), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testPathTo", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (31) )}));
			}
		}
		
		
		public virtual void testUp() {
			unchecked {
				global::utest.Assert.@equals("/a/b", global::thx._Path.Path_Impl_.toString(global::thx._Path.Path_Impl_.up(global::thx._Path.Path_Impl_.fromString("/a/b/c/"), default(global::haxe.lang.Null<int>))), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testUp", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (35) )}));
				global::utest.Assert.@equals("/", global::thx._Path.Path_Impl_.toString(global::thx._Path.Path_Impl_.up(global::thx._Path.Path_Impl_.fromString("/a"), new global::haxe.lang.Null<int>(2, true))), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testUp", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (36) )}));
			}
		}
		
		
		public virtual void testDir() {
			unchecked {
				global::utest.Assert.@equals("/a/b", global::thx._Path.Path_Impl_.dir(global::thx._Path.Path_Impl_.fromString("/a/b/c")), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testDir", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (40) )}));
				global::utest.Assert.@equals("a/b", global::thx._Path.Path_Impl_.dir(global::thx._Path.Path_Impl_.fromString("a/b/c")), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testDir", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (41) )}));
				global::utest.Assert.@equals(".", global::thx._Path.Path_Impl_.dir(global::thx._Path.Path_Impl_.fromString("a")), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testDir", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (42) )}));
				global::utest.Assert.@equals(".", global::thx._Path.Path_Impl_.dir(global::thx._Path.Path_Impl_.fromString("..")), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testDir", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (43) )}));
			}
		}
		
		
		public virtual void testBase() {
			unchecked {
				global::Array<object> path = global::thx._Path.Path_Impl_.fromString("/a/b.c");
				global::utest.Assert.@equals("b.c", global::thx._Path.Path_Impl_.@base(path, null), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testBase", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (48) )}));
				global::utest.Assert.@equals("b", global::thx._Path.Path_Impl_.@base(path, ".c"), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testBase", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (49) )}));
				global::utest.Assert.@equals("b.", global::thx._Path.Path_Impl_.@base(path, "c"), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testBase", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (50) )}));
				global::utest.Assert.@equals("b.c", global::thx._Path.Path_Impl_.@base(path, ".d"), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testBase", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (51) )}));
			}
		}
		
		
		public virtual void testExt() {
			unchecked {
				global::thx._Path.Path_Impl_.fromString("");
				global::utest.Assert.@equals("c", global::thx._Path.Path_Impl_.ext(global::thx._Path.Path_Impl_.fromString("/a/b.c")), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testExt", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (56) )}));
				global::utest.Assert.@equals("", global::thx._Path.Path_Impl_.ext(global::thx._Path.Path_Impl_.fromString("/a/b/c")), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testExt", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (57) )}));
			}
		}
		
		
		public virtual void testSep() {
			unchecked {
				global::Array<object> path = global::thx._Path.Path_Impl_.fromString("/path/to/file.png");
				global::Array<object> win = global::thx._Path.Path_Impl_.toWin32(path, "C:");
				global::utest.Assert.@equals("/", global::haxe.lang.Runtime.toString(((global::Array<object>) (path) )[0]), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testSep", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (63) )}));
				global::utest.Assert.@equals("\\", global::haxe.lang.Runtime.toString(((global::Array<object>) (win) )[0]), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testSep", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (64) )}));
				global::utest.Assert.isTrue(string.Equals(global::haxe.lang.Runtime.toString(((global::Array<object>) (path) )[0]), "/"), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testSep", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (65) )}));
				global::utest.Assert.isFalse(string.Equals(global::haxe.lang.Runtime.toString(((global::Array<object>) (path) )[0]), "\\"), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testSep", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (66) )}));
				global::utest.Assert.isTrue(string.Equals(global::haxe.lang.Runtime.toString(((global::Array<object>) (win) )[0]), "\\"), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testSep", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (67) )}));
				global::utest.Assert.isFalse(string.Equals(global::haxe.lang.Runtime.toString(((global::Array<object>) (win) )[0]), "/"), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testSep", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (68) )}));
			}
		}
		
		
		public virtual void testJoin() {
			unchecked {
				global::utest.Assert.@equals("/a/b/c", global::thx._Path.Path_Impl_.toString(global::thx._Path.Path_Impl_.@join(global::thx._Path.Path_Impl_.fromString("/a/x"), global::thx._Path.Path_Impl_.fromString("../b/c"))), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testJoin", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (72) )}));
				global::utest.Assert.@equals("../b/c", global::thx._Path.Path_Impl_.toString(global::thx._Path.Path_Impl_.@join(global::thx._Path.Path_Impl_.fromString("../x"), global::thx._Path.Path_Impl_.fromString("../b/c"))), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testJoin", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (73) )}));
				global::utest.Assert.@equals("/b/c", global::thx._Path.Path_Impl_.toString(global::thx._Path.Path_Impl_.@join(global::thx._Path.Path_Impl_.fromString("/a/x"), global::thx._Path.Path_Impl_.fromString("/b/c"))), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testJoin", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (74) )}));
			}
		}
		
		
		public virtual void testJoinString() {
			unchecked {
				global::utest.Assert.@equals("/a/b/c", global::thx._Path.Path_Impl_.toString(global::thx._Path.Path_Impl_.@join(global::thx._Path.Path_Impl_.fromString("/a/b"), global::thx._Path.Path_Impl_.fromString("c"))), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testJoinString", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (78) )}));
				global::utest.Assert.@equals("../d", global::thx._Path.Path_Impl_.toString(global::thx._Path.Path_Impl_.@join(global::thx._Path.Path_Impl_.fromString("../x"), global::thx._Path.Path_Impl_.fromString("../d"))), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testJoinString", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (79) )}));
			}
		}
		
		
		public virtual void testToWin32ToNix() {
			unchecked {
				global::Array<object> path = global::thx._Path.Path_Impl_.fromString("/path/to/file.png");
				global::Array<object> win = global::thx._Path.Path_Impl_.toWin32(path, null);
				global::utest.Assert.@equals("C:\\path\\to\\file.png", global::thx._Path.Path_Impl_.toString(win), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testToWin32ToNix", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (85) )}));
				global::utest.Assert.@equals("/path/to/file.png", global::thx._Path.Path_Impl_.toString(global::thx._Path.Path_Impl_.toNix(win)), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testToWin32ToNix", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (86) )}));
				path = global::thx._Path.Path_Impl_.fromString("path/to/file.png");
				win = global::thx._Path.Path_Impl_.toWin32(path, null);
				global::utest.Assert.@equals("path\\to\\file.png", global::thx._Path.Path_Impl_.toString(win), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testToWin32ToNix", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (90) )}));
				global::utest.Assert.@equals("path/to/file.png", global::thx._Path.Path_Impl_.toString(global::thx._Path.Path_Impl_.toNix(win)), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testToWin32ToNix", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (91) )}));
			}
		}
		
		
		public virtual void testNormalization() {
			unchecked {
				global::utest.Assert.@equals("c", global::thx._Path.Path_Impl_.toString(global::thx._Path.Path_Impl_.fromString("a/.././b/../c/.")), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testNormalization", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (95) )}));
				global::utest.Assert.@equals("a/c", global::thx._Path.Path_Impl_.toString(global::thx._Path.Path_Impl_.fromString("a/./b/../c/.")), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testNormalization", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (96) )}));
				global::utest.Assert.@equals("/b/c", global::thx._Path.Path_Impl_.toString(global::thx._Path.Path_Impl_.fromString("/a/.././b/./c/.")), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testNormalization", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (97) )}));
				global::utest.Assert.@equals("../../c", global::thx._Path.Path_Impl_.toString(global::thx._Path.Path_Impl_.fromString("a/../../../b/../c/.")), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testNormalization", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (98) )}));
			}
		}
		
		
		public virtual void testToString() {
			unchecked {
				global::utest.Assert.@equals(".", global::thx._Path.Path_Impl_.toString(global::thx._Path.Path_Impl_.fromString(".")), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testToString", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (102) )}));
				global::utest.Assert.@equals("..", global::thx._Path.Path_Impl_.toString(global::thx._Path.Path_Impl_.fromString("..")), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testToString", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (103) )}));
				global::utest.Assert.@equals("..", global::thx._Path.Path_Impl_.toString(global::thx._Path.Path_Impl_.fromString("../")), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testToString", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (104) )}));
				global::utest.Assert.@equals("/", global::thx._Path.Path_Impl_.toString(global::thx._Path.Path_Impl_.fromString("/../")), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testToString", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (105) )}));
				global::utest.Assert.@equals("/", global::thx._Path.Path_Impl_.toString(global::thx._Path.Path_Impl_.fromString("/")), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testToString", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (106) )}));
				global::utest.Assert.@equals("/a/a", global::thx._Path.Path_Impl_.toString(global::thx._Path.Path_Impl_.fromString("/a///a")), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testToString", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (107) )}));
				global::utest.Assert.@equals("/a/a", global::thx._Path.Path_Impl_.toString(global::thx._Path.Path_Impl_.fromString("/a/a/")), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testToString", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (108) )}));
				global::utest.Assert.@equals(".", global::thx._Path.Path_Impl_.toString(global::thx._Path.Path_Impl_.fromString("a/..")), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testToString", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (109) )}));
				global::utest.Assert.@equals("a", global::thx._Path.Path_Impl_.toString(global::thx._Path.Path_Impl_.fromString("a")), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testToString", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (110) )}));
			}
		}
		
		
		public virtual void testNormalize() {
			unchecked {
				global::Array<object> p = ((global::Array<object>) (new global::Array<object>(new object[]{"/", "/", "a/*>b"})) );
				global::utest.Assert.isFalse(global::thx._Path.Path_Impl_.isValid(p), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testNormalize", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (115) )}));
				p = global::thx._Path.Path_Impl_.normalize(p);
				global::utest.Assert.isTrue(global::thx._Path.Path_Impl_.isValid(p), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testNormalize", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (117) )}));
				global::utest.Assert.@equals("/a_*>b", global::thx._Path.Path_Impl_.toString(p), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testNormalize", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (118) )}));
				p = global::thx._Path.Path_Impl_.toWin32(p, null);
				global::utest.Assert.isFalse(global::thx._Path.Path_Impl_.isValid(p), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testNormalize", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (120) )}));
				p = global::thx._Path.Path_Impl_.normalize(p);
				global::utest.Assert.isTrue(global::thx._Path.Path_Impl_.isValid(p), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testNormalize", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (122) )}));
				global::utest.Assert.@equals("C:\\a___b", global::thx._Path.Path_Impl_.toString(p), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testNormalize", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (123) )}));
			}
		}
		
		
		public virtual void testRoot() {
			unchecked {
				global::Array<object> root = global::thx._Path.Path_Impl_.fromString("C:\\");
				global::utest.Assert.isFalse(string.Equals(global::haxe.lang.Runtime.toString(((global::Array<object>) (root) )[0]), "/"), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testRoot", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (128) )}));
				global::utest.Assert.isTrue(string.Equals(global::haxe.lang.Runtime.toString(((global::Array<object>) (root) )[0]), "\\"), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testRoot", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (129) )}));
				global::utest.Assert.isTrue( ! (string.Equals(global::haxe.lang.Runtime.toString(((global::Array<object>) (root) )[1]), "")) , null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testRoot", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (130) )}));
				global::utest.Assert.isFalse(string.Equals(global::haxe.lang.Runtime.toString(((global::Array<object>) (root) )[1]), ""), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testRoot", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (131) )}));
				global::utest.Assert.isTrue(global::thx._Path.Path_Impl_.isRoot(root), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testRoot", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (132) )}));
				global::utest.Assert.@equals("C:\\", global::thx._Path.Path_Impl_.toString(root), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testRoot", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (133) )}));
				global::utest.Assert.@equals(".", global::thx._Path.Path_Impl_.toString(((global::Array<object>) (new global::Array<object>(new object[]{global::haxe.lang.Runtime.toString(((global::Array<object>) (root) )[0]), ""}).concat(global::thx._Path.Path_Impl_.resolve(((global::Array<object>) (root) ).slice(2, default(global::haxe.lang.Null<int>)), false))) )), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testRoot", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (134) )}));
				root = global::thx._Path.Path_Impl_.fromString("/");
				global::utest.Assert.isTrue(string.Equals(global::haxe.lang.Runtime.toString(((global::Array<object>) (root) )[0]), "/"), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testRoot", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (137) )}));
				global::utest.Assert.isFalse(string.Equals(global::haxe.lang.Runtime.toString(((global::Array<object>) (root) )[0]), "\\"), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testRoot", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (138) )}));
				global::utest.Assert.isTrue( ! (string.Equals(global::haxe.lang.Runtime.toString(((global::Array<object>) (root) )[1]), "")) , null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testRoot", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (139) )}));
				global::utest.Assert.isFalse(string.Equals(global::haxe.lang.Runtime.toString(((global::Array<object>) (root) )[1]), ""), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testRoot", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (140) )}));
				global::utest.Assert.isTrue(global::thx._Path.Path_Impl_.isRoot(root), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testRoot", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (141) )}));
				global::utest.Assert.@equals("/", global::thx._Path.Path_Impl_.toString(root), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testRoot", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (142) )}));
				global::utest.Assert.@equals(".", global::thx._Path.Path_Impl_.toString(((global::Array<object>) (new global::Array<object>(new object[]{global::haxe.lang.Runtime.toString(((global::Array<object>) (root) )[0]), ""}).concat(global::thx._Path.Path_Impl_.resolve(((global::Array<object>) (root) ).slice(2, default(global::haxe.lang.Null<int>)), false))) )), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"testRoot", "thx.TestPath", "TestPath.hx"}, new int[]{1981972957}, new double[]{((double) (143) )}));
			}
		}
		
		
		public override object __hx_getField(string field, int hash, bool throwErrors, bool isCheck, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 1323398036:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testRoot", 1323398036)) );
					}
					
					
					case 1591456987:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testNormalize", 1591456987)) );
					}
					
					
					case 729151262:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testToString", 729151262)) );
					}
					
					
					case 552155691:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testNormalization", 552155691)) );
					}
					
					
					case 1800401972:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testToWin32ToNix", 1800401972)) );
					}
					
					
					case 1327743821:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testJoinString", 1327743821)) );
					}
					
					
					case 1234680156:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testJoin", 1234680156)) );
					}
					
					
					case 1036388972:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testSep", 1036388972)) );
					}
					
					
					case 1035697007:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testExt", 1035697007)) );
					}
					
					
					case 1145269635:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testBase", 1145269635)) );
					}
					
					
					case 1035643931:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testDir", 1035643931)) );
					}
					
					
					case 1429883725:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testUp", 1429883725)) );
					}
					
					
					case 130476146:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testPathTo", 130476146)) );
					}
					
					
					case 401985360:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "testIsRelativeAndIsAbsolute", 401985360)) );
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
					case 1323398036:
					{
						this.testRoot();
						break;
					}
					
					
					case 1591456987:
					{
						this.testNormalize();
						break;
					}
					
					
					case 729151262:
					{
						this.testToString();
						break;
					}
					
					
					case 552155691:
					{
						this.testNormalization();
						break;
					}
					
					
					case 1800401972:
					{
						this.testToWin32ToNix();
						break;
					}
					
					
					case 1327743821:
					{
						this.testJoinString();
						break;
					}
					
					
					case 1234680156:
					{
						this.testJoin();
						break;
					}
					
					
					case 1036388972:
					{
						this.testSep();
						break;
					}
					
					
					case 1035697007:
					{
						this.testExt();
						break;
					}
					
					
					case 1145269635:
					{
						this.testBase();
						break;
					}
					
					
					case 1035643931:
					{
						this.testDir();
						break;
					}
					
					
					case 1429883725:
					{
						this.testUp();
						break;
					}
					
					
					case 130476146:
					{
						this.testPathTo();
						break;
					}
					
					
					case 401985360:
					{
						this.testIsRelativeAndIsAbsolute();
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

