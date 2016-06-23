// Generated by Haxe 3.3.0
package thx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TestOrderedMap extends haxe.lang.HxObject
{
	public TestOrderedMap(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public TestOrderedMap(int i)
	{
		//line 10 "/shared/core/test/thx/TestOrderedMap.hx"
		thx.TestOrderedMap.__hx_ctor_thx_TestOrderedMap(this, i);
	}
	
	
	public static void __hx_ctor_thx_TestOrderedMap(thx.TestOrderedMap __temp_me116, int i)
	{
		//line 11 "/shared/core/test/thx/TestOrderedMap.hx"
		__temp_me116.x = i;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
		return new thx.TestOrderedMap(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
		return new thx.TestOrderedMap(((int) (haxe.lang.Runtime.toInt(arr.__get(0))) ));
	}
	
	
	public int x;
	
	public void testBasics()
	{
		//line 16 "/shared/core/test/thx/TestOrderedMap.hx"
		int _g1 = 0;
		//line 16 "/shared/core/test/thx/TestOrderedMap.hx"
		int _g = this.x;
		//line 16 "/shared/core/test/thx/TestOrderedMap.hx"
		while (( _g1 < _g ))
		{
			//line 16 "/shared/core/test/thx/TestOrderedMap.hx"
			 ++ _g1;
			//line 17 "/shared/core/test/thx/TestOrderedMap.hx"
			thx.OrderedMapImpl<java.lang.String, java.lang.String> ml = ((thx.OrderedMapImpl<java.lang.String, java.lang.String>) (new thx.StringOrderedMap<java.lang.String>()) );
			//line 19 "/shared/core/test/thx/TestOrderedMap.hx"
			utest.Assert.equals(0, ml.length, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestOrderedMap", "TestOrderedMap.hx", "testBasics"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (19) )) )}));
			//line 20 "/shared/core/test/thx/TestOrderedMap.hx"
			utest.Assert.equals("[]", ml.toString(), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestOrderedMap", "TestOrderedMap.hx", "testBasics"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (20) )) )}));
			//line 22 "/shared/core/test/thx/TestOrderedMap.hx"
			ml.set("z", "Z");
			//line 23 "/shared/core/test/thx/TestOrderedMap.hx"
			ml.set("y", "Y");
			//line 24 "/shared/core/test/thx/TestOrderedMap.hx"
			ml.set("y", "Y");
			//line 25 "/shared/core/test/thx/TestOrderedMap.hx"
			ml.set("x", "X");
			//line 27 "/shared/core/test/thx/TestOrderedMap.hx"
			utest.Assert.equals(3, ml.length, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestOrderedMap", "TestOrderedMap.hx", "testBasics"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (27) )) )}));
			//line 28 "/shared/core/test/thx/TestOrderedMap.hx"
			utest.Assert.equals("[z => Z, y => Y, x => X]", ml.toString(), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestOrderedMap", "TestOrderedMap.hx", "testBasics"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (28) )) )}));
			//line 30 "/shared/core/test/thx/TestOrderedMap.hx"
			utest.Assert.isTrue(ml.remove("y"), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestOrderedMap", "TestOrderedMap.hx", "testBasics"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (30) )) )}));
			//line 31 "/shared/core/test/thx/TestOrderedMap.hx"
			utest.Assert.isFalse(ml.remove("y"), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestOrderedMap", "TestOrderedMap.hx", "testBasics"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (31) )) )}));
			//line 33 "/shared/core/test/thx/TestOrderedMap.hx"
			utest.Assert.equals(2, ml.length, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestOrderedMap", "TestOrderedMap.hx", "testBasics"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (33) )) )}));
			//line 34 "/shared/core/test/thx/TestOrderedMap.hx"
			utest.Assert.equals("[z => Z, x => X]", ml.toString(), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestOrderedMap", "TestOrderedMap.hx", "testBasics"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (34) )) )}));
			//line 36 "/shared/core/test/thx/TestOrderedMap.hx"
			ml.insert(1, "y", "Y");
			//line 38 "/shared/core/test/thx/TestOrderedMap.hx"
			utest.Assert.equals(3, ml.length, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestOrderedMap", "TestOrderedMap.hx", "testBasics"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (38) )) )}));
			//line 39 "/shared/core/test/thx/TestOrderedMap.hx"
			utest.Assert.equals("[z => Z, y => Y, x => X]", ml.toString(), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestOrderedMap", "TestOrderedMap.hx", "testBasics"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (39) )) )}));
			//line 41 "/shared/core/test/thx/TestOrderedMap.hx"
			utest.Assert.equals("y", haxe.lang.Runtime.toString(ml.keyAt(1)), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestOrderedMap", "TestOrderedMap.hx", "testBasics"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (41) )) )}));
			//line 42 "/shared/core/test/thx/TestOrderedMap.hx"
			utest.Assert.equals("Y", haxe.lang.Runtime.toString(((thx.OrderedMapImpl<java.lang.String, java.lang.String>) (ml) ).at(1)), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestOrderedMap", "TestOrderedMap.hx", "testBasics"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (42) )) )}));
			//line 44 "/shared/core/test/thx/TestOrderedMap.hx"
			utest.Assert.equals(1, ml.keyIndex("y"), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestOrderedMap", "TestOrderedMap.hx", "testBasics"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (44) )) )}));
			//line 45 "/shared/core/test/thx/TestOrderedMap.hx"
			utest.Assert.equals(1, ml.valueIndex("Y"), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestOrderedMap", "TestOrderedMap.hx", "testBasics"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (45) )) )}));
			//line 47 "/shared/core/test/thx/TestOrderedMap.hx"
			ml.removeAt(1);
			//line 49 "/shared/core/test/thx/TestOrderedMap.hx"
			utest.Assert.equals(2, ml.length, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestOrderedMap", "TestOrderedMap.hx", "testBasics"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (49) )) )}));
			//line 50 "/shared/core/test/thx/TestOrderedMap.hx"
			utest.Assert.equals("[z => Z, x => X]", ml.toString(), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestOrderedMap", "TestOrderedMap.hx", "testBasics"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (50) )) )}));
			//line 52 "/shared/core/test/thx/TestOrderedMap.hx"
			utest.Assert.same(new haxe.root.Array(new java.lang.Object[]{"Z", "X"}), ml.toArray(), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestOrderedMap", "TestOrderedMap.hx", "testBasics"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (52) )) )}));
			//line 53 "/shared/core/test/thx/TestOrderedMap.hx"
			utest.Assert.same(new haxe.root.Array(new java.lang.Object[]{"z", "x"}), ((haxe.root.Array<java.lang.String>) (((haxe.root.Array) (thx.Iterators.toArray(((java.lang.Object) (ml.keys()) ))) )) ), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestOrderedMap", "TestOrderedMap.hx", "testBasics"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (53) )) )}));
		}
		
	}
	
	
	public void testGetOption()
	{
		//line 57 "/shared/core/test/thx/TestOrderedMap.hx"
		int _g1 = 0;
		//line 57 "/shared/core/test/thx/TestOrderedMap.hx"
		int _g = this.x;
		//line 57 "/shared/core/test/thx/TestOrderedMap.hx"
		while (( _g1 < _g ))
		{
			//line 57 "/shared/core/test/thx/TestOrderedMap.hx"
			 ++ _g1;
			//line 58 "/shared/core/test/thx/TestOrderedMap.hx"
			thx.OrderedMapImpl<java.lang.String, java.lang.Object> m = ((thx.OrderedMapImpl<java.lang.String, java.lang.Object>) (new thx.StringOrderedMap<java.lang.Object>()) );
			//line 59 "/shared/core/test/thx/TestOrderedMap.hx"
			m.set("key1", 1);
			//line 61 "/shared/core/test/thx/TestOrderedMap.hx"
			java.lang.Object value = ((java.lang.Object) (((thx.OrderedMapImpl<java.lang.String, java.lang.Object>) (m) ).get("key1")) );
			//line 61 "/shared/core/test/thx/TestOrderedMap.hx"
			utest.Assert.same(((java.lang.Object) (thx.Options.get(((haxe.ds.Option) (( (( null == value )) ? (haxe.ds.Option.None) : (haxe.ds.Option.Some(value)) )) ))) ), 1, null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestOrderedMap", "TestOrderedMap.hx", "testGetOption"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (61) )) )}));
			//line 62 "/shared/core/test/thx/TestOrderedMap.hx"
			java.lang.Object value1 = ((java.lang.Object) (((thx.OrderedMapImpl<java.lang.String, java.lang.Object>) (m) ).get("key2")) );
			//line 62 "/shared/core/test/thx/TestOrderedMap.hx"
			utest.Assert.same(((boolean) (thx.Options.toBool(((haxe.ds.Option) (( (( null == value1 )) ? (haxe.ds.Option.None) : (haxe.ds.Option.Some(value1)) )) ))) ), false, null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestOrderedMap", "TestOrderedMap.hx", "testGetOption"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (62) )) )}));
		}
		
	}
	
	
	public void testToTuples()
	{
		//line 66 "/shared/core/test/thx/TestOrderedMap.hx"
		int _g1 = 0;
		//line 66 "/shared/core/test/thx/TestOrderedMap.hx"
		int _g = this.x;
		//line 66 "/shared/core/test/thx/TestOrderedMap.hx"
		while (( _g1 < _g ))
		{
			//line 66 "/shared/core/test/thx/TestOrderedMap.hx"
			 ++ _g1;
			//line 67 "/shared/core/test/thx/TestOrderedMap.hx"
			thx.OrderedMapImpl<java.lang.String, java.lang.Object> m = ((thx.OrderedMapImpl<java.lang.String, java.lang.Object>) (new thx.StringOrderedMap<java.lang.Object>()) );
			//line 68 "/shared/core/test/thx/TestOrderedMap.hx"
			m.set("foo", 10);
			//line 69 "/shared/core/test/thx/TestOrderedMap.hx"
			m.set("bar", 20);
			//line 70 "/shared/core/test/thx/TestOrderedMap.hx"
			m.insert(2, "baz", 30);
			//line 72 "/shared/core/test/thx/TestOrderedMap.hx"
			haxe.root.Array<java.lang.Object> tuples = m.tuples();
			//line 74 "/shared/core/test/thx/TestOrderedMap.hx"
			utest.Assert.same("foo", haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(((java.lang.Object) (tuples.__get(0)) ), "_0", true)), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestOrderedMap", "TestOrderedMap.hx", "testToTuples"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (74) )) )}));
			//line 75 "/shared/core/test/thx/TestOrderedMap.hx"
			utest.Assert.same(20, ((int) (haxe.lang.Runtime.getField_f(((java.lang.Object) (tuples.__get(1)) ), "_1", true)) ), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestOrderedMap", "TestOrderedMap.hx", "testToTuples"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (75) )) )}));
			//line 76 "/shared/core/test/thx/TestOrderedMap.hx"
			utest.Assert.same("baz", haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(((java.lang.Object) (tuples.__get(2)) ), "_0", true)), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestOrderedMap", "TestOrderedMap.hx", "testToTuples"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (76) )) )}));
			//line 77 "/shared/core/test/thx/TestOrderedMap.hx"
			utest.Assert.same(30, ((int) (haxe.lang.Runtime.getField_f(((java.lang.Object) (tuples.__get(2)) ), "_1", true)) ), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestOrderedMap", "TestOrderedMap.hx", "testToTuples"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (77) )) )}));
		}
		
	}
	
	
	public void testAbstract()
	{
		//line 81 "/shared/core/test/thx/TestOrderedMap.hx"
		int _g1 = 0;
		//line 81 "/shared/core/test/thx/TestOrderedMap.hx"
		int _g = this.x;
		//line 81 "/shared/core/test/thx/TestOrderedMap.hx"
		while (( _g1 < _g ))
		{
			//line 81 "/shared/core/test/thx/TestOrderedMap.hx"
			 ++ _g1;
			//line 82 "/shared/core/test/thx/TestOrderedMap.hx"
			thx.OrderedMapImpl<java.lang.String, java.lang.String> ml = ((thx.OrderedMapImpl<java.lang.String, java.lang.String>) (new thx.StringOrderedMap<java.lang.String>()) );
			//line 83 "/shared/core/test/thx/TestOrderedMap.hx"
			((thx.OrderedMapImpl<java.lang.String, java.lang.String>) (ml) ).setValue("k", "value");
			//line 84 "/shared/core/test/thx/TestOrderedMap.hx"
			utest.Assert.equals("value", haxe.lang.Runtime.toString(((thx.OrderedMapImpl<java.lang.String, java.lang.String>) (ml) ).get("k")), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestOrderedMap", "TestOrderedMap.hx", "testAbstract"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (84) )) )}));
			//line 85 "/shared/core/test/thx/TestOrderedMap.hx"
			utest.Assert.equals("value", haxe.lang.Runtime.toString(((thx.OrderedMapImpl<java.lang.String, java.lang.String>) (ml) ).at(0)), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestOrderedMap", "TestOrderedMap.hx", "testAbstract"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (85) )) )}));
			//line 86 "/shared/core/test/thx/TestOrderedMap.hx"
			utest.Assert.equals("value", haxe.lang.Runtime.toString(((thx.OrderedMapImpl<java.lang.String, java.lang.String>) (ml) ).at(0)), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestOrderedMap", "TestOrderedMap.hx", "testAbstract"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (86) )) )}));
			//line 88 "/shared/core/test/thx/TestOrderedMap.hx"
			haxe.lang.Function acceptMap = ( (( thx.TestOrderedMap_testAbstract_88__Fun.__hx_current != null )) ? (thx.TestOrderedMap_testAbstract_88__Fun.__hx_current) : (thx.TestOrderedMap_testAbstract_88__Fun.__hx_current = ((thx.TestOrderedMap_testAbstract_88__Fun) (new thx.TestOrderedMap_testAbstract_88__Fun()) )) );
			//line 91 "/shared/core/test/thx/TestOrderedMap.hx"
			acceptMap.__hx_invoke1_o(0.0, ml);
			//line 93 "/shared/core/test/thx/TestOrderedMap.hx"
			utest.Assert.notNull(((thx.OrderedMapImpl) (((thx.OrderedMapImpl) (new thx.IntOrderedMap()) )) ), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestOrderedMap", "TestOrderedMap.hx", "testAbstract"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (93) )) )}));
			//line 94 "/shared/core/test/thx/TestOrderedMap.hx"
			utest.Assert.notNull(((thx.OrderedMapImpl) (new thx.EnumValueOrderedMap()) ), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestOrderedMap", "TestOrderedMap.hx", "testAbstract"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (94) )) )}));
			//line 95 "/shared/core/test/thx/TestOrderedMap.hx"
			utest.Assert.notNull(((thx.OrderedMapImpl) (new thx.ObjectOrderedMap()) ), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestOrderedMap", "TestOrderedMap.hx", "testAbstract"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (95) )) )}));
		}
		
	}
	
	
	public void testEmpty()
	{
		//line 99 "/shared/core/test/thx/TestOrderedMap.hx"
		int _g1 = 0;
		//line 99 "/shared/core/test/thx/TestOrderedMap.hx"
		int _g = this.x;
		//line 99 "/shared/core/test/thx/TestOrderedMap.hx"
		while (( _g1 < _g ))
		{
			//line 99 "/shared/core/test/thx/TestOrderedMap.hx"
			 ++ _g1;
			//line 100 "/shared/core/test/thx/TestOrderedMap.hx"
			thx.OrderedMapImpl<java.lang.String, java.lang.String> ml = ((thx.OrderedMapImpl<java.lang.String, java.lang.String>) (new thx.StringOrderedMap<java.lang.String>()) );
			//line 101 "/shared/core/test/thx/TestOrderedMap.hx"
			((thx.OrderedMapImpl<java.lang.String, java.lang.String>) (ml) ).setValue("k", "value");
			//line 102 "/shared/core/test/thx/TestOrderedMap.hx"
			thx.OrderedMapImpl<java.lang.String, java.lang.String> e = ((thx.OrderedMapImpl<java.lang.String, java.lang.String>) (((thx.OrderedMapImpl<java.lang.String, java.lang.String>) (ml) ).empty()) );
			//line 103 "/shared/core/test/thx/TestOrderedMap.hx"
			utest.Assert.isNull(haxe.lang.Runtime.toString(((thx.OrderedMapImpl<java.lang.String, java.lang.String>) (e) ).get("k")), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestOrderedMap", "TestOrderedMap.hx", "testEmpty"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (103) )) )}));
		}
		
	}
	
	
	public void testCopyTo()
	{
		//line 107 "/shared/core/test/thx/TestOrderedMap.hx"
		int _g1 = 0;
		//line 107 "/shared/core/test/thx/TestOrderedMap.hx"
		int _g = this.x;
		//line 107 "/shared/core/test/thx/TestOrderedMap.hx"
		while (( _g1 < _g ))
		{
			//line 107 "/shared/core/test/thx/TestOrderedMap.hx"
			 ++ _g1;
			//line 108 "/shared/core/test/thx/TestOrderedMap.hx"
			thx.OrderedMapImpl<java.lang.String, java.lang.String> ml = ((thx.OrderedMapImpl<java.lang.String, java.lang.String>) (new thx.StringOrderedMap<java.lang.String>()) );
			//line 109 "/shared/core/test/thx/TestOrderedMap.hx"
			((thx.OrderedMapImpl<java.lang.String, java.lang.String>) (ml) ).setValue("k", "value");
			//line 110 "/shared/core/test/thx/TestOrderedMap.hx"
			thx.OrderedMapImpl<java.lang.String, java.lang.String> e = ((thx.OrderedMapImpl<java.lang.String, java.lang.String>) (((thx.OrderedMapImpl<java.lang.String, java.lang.String>) (ml) ).empty()) );
			//line 111 "/shared/core/test/thx/TestOrderedMap.hx"
			{
				//line 111 "/shared/core/test/thx/TestOrderedMap.hx"
				java.lang.Object tmp = ((thx.OrderedMapImpl<java.lang.String, java.lang.String>) (ml) ).keys();
				//line 111 "/shared/core/test/thx/TestOrderedMap.hx"
				while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(tmp, "hasNext", null)))
				{
					//line 111 "/shared/core/test/thx/TestOrderedMap.hx"
					java.lang.String key = haxe.lang.Runtime.toString(haxe.lang.Runtime.callField(tmp, "next", null));
					//line 111 "/shared/core/test/thx/TestOrderedMap.hx"
					e.set(key, haxe.lang.Runtime.toString(((thx.OrderedMapImpl<java.lang.String, java.lang.String>) (ml) ).get(key)));
				}
				
			}
			
			//line 112 "/shared/core/test/thx/TestOrderedMap.hx"
			utest.Assert.equals("value", haxe.lang.Runtime.toString(((thx.OrderedMapImpl<java.lang.String, java.lang.String>) (e) ).get("k")), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestOrderedMap", "TestOrderedMap.hx", "testCopyTo"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (112) )) )}));
		}
		
	}
	
	
	public void testClone()
	{
		//line 116 "/shared/core/test/thx/TestOrderedMap.hx"
		int _g1 = 0;
		//line 116 "/shared/core/test/thx/TestOrderedMap.hx"
		int _g = this.x;
		//line 116 "/shared/core/test/thx/TestOrderedMap.hx"
		while (( _g1 < _g ))
		{
			//line 116 "/shared/core/test/thx/TestOrderedMap.hx"
			 ++ _g1;
			//line 117 "/shared/core/test/thx/TestOrderedMap.hx"
			thx.OrderedMapImpl<java.lang.String, java.lang.String> ml = ((thx.OrderedMapImpl<java.lang.String, java.lang.String>) (new thx.StringOrderedMap<java.lang.String>()) );
			//line 118 "/shared/core/test/thx/TestOrderedMap.hx"
			((thx.OrderedMapImpl<java.lang.String, java.lang.String>) (ml) ).setValue("k", "value");
			//line 119 "/shared/core/test/thx/TestOrderedMap.hx"
			thx.OrderedMapImpl<java.lang.String, java.lang.String> that = ((thx.OrderedMapImpl<java.lang.String, java.lang.String>) (((thx.OrderedMapImpl<java.lang.String, java.lang.String>) (ml) ).empty()) );
			//line 119 "/shared/core/test/thx/TestOrderedMap.hx"
			{
				//line 119 "/shared/core/test/thx/TestOrderedMap.hx"
				java.lang.Object tmp = ((thx.OrderedMapImpl<java.lang.String, java.lang.String>) (ml) ).keys();
				//line 119 "/shared/core/test/thx/TestOrderedMap.hx"
				while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(tmp, "hasNext", null)))
				{
					//line 119 "/shared/core/test/thx/TestOrderedMap.hx"
					java.lang.String key = haxe.lang.Runtime.toString(haxe.lang.Runtime.callField(tmp, "next", null));
					//line 119 "/shared/core/test/thx/TestOrderedMap.hx"
					that.set(key, haxe.lang.Runtime.toString(((thx.OrderedMapImpl<java.lang.String, java.lang.String>) (ml) ).get(key)));
				}
				
			}
			
			//line 120 "/shared/core/test/thx/TestOrderedMap.hx"
			utest.Assert.equals("value", haxe.lang.Runtime.toString(((thx.OrderedMapImpl<java.lang.String, java.lang.String>) (that) ).get("k")), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.TestOrderedMap", "TestOrderedMap.hx", "testClone"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (120) )) )}));
		}
		
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
		{
			//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
			switch (field.hashCode())
			{
				case 120:
				{
					//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
					if (field.equals("x")) 
					{
						//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
						this.x = ((int) (value) );
						//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
						return value;
					}
					
					//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
					break;
				}
				
				
			}
			
			//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
		{
			//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
			switch (field.hashCode())
			{
				case 120:
				{
					//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
					if (field.equals("x")) 
					{
						//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
						this.x = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
						return value;
					}
					
					//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
					break;
				}
				
				
			}
			
			//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
		{
			//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
			switch (field.hashCode())
			{
				case -1206209557:
				{
					//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
					if (field.equals("testClone")) 
					{
						//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testClone")) );
					}
					
					//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
					break;
				}
				
				
				case 120:
				{
					//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
					if (field.equals("x")) 
					{
						//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
						return this.x;
					}
					
					//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
					break;
				}
				
				
				case 1265019906:
				{
					//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
					if (field.equals("testCopyTo")) 
					{
						//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testCopyTo")) );
					}
					
					//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
					break;
				}
				
				
				case 1223535927:
				{
					//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
					if (field.equals("testBasics")) 
					{
						//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testBasics")) );
					}
					
					//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
					break;
				}
				
				
				case -1204331557:
				{
					//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
					if (field.equals("testEmpty")) 
					{
						//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testEmpty")) );
					}
					
					//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
					break;
				}
				
				
				case 1355582201:
				{
					//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
					if (field.equals("testGetOption")) 
					{
						//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testGetOption")) );
					}
					
					//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
					break;
				}
				
				
				case -1847728428:
				{
					//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
					if (field.equals("testAbstract")) 
					{
						//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testAbstract")) );
					}
					
					//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
					break;
				}
				
				
				case -1033086280:
				{
					//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
					if (field.equals("testToTuples")) 
					{
						//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testToTuples")) );
					}
					
					//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
					break;
				}
				
				
			}
			
			//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
		{
			//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
			switch (field.hashCode())
			{
				case 120:
				{
					//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
					if (field.equals("x")) 
					{
						//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
						return ((double) (this.x) );
					}
					
					//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
					break;
				}
				
				
			}
			
			//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
		{
			//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
			switch (field.hashCode())
			{
				case -1206209557:
				{
					//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
					if (field.equals("testClone")) 
					{
						//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
						this.testClone();
					}
					
					//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
					break;
				}
				
				
				case 1223535927:
				{
					//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
					if (field.equals("testBasics")) 
					{
						//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
						this.testBasics();
					}
					
					//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
					break;
				}
				
				
				case 1265019906:
				{
					//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
					if (field.equals("testCopyTo")) 
					{
						//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
						this.testCopyTo();
					}
					
					//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
					break;
				}
				
				
				case 1355582201:
				{
					//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
					if (field.equals("testGetOption")) 
					{
						//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
						this.testGetOption();
					}
					
					//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
					break;
				}
				
				
				case -1204331557:
				{
					//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
					if (field.equals("testEmpty")) 
					{
						//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
						this.testEmpty();
					}
					
					//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
					break;
				}
				
				
				case -1033086280:
				{
					//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
					if (field.equals("testToTuples")) 
					{
						//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
						this.testToTuples();
					}
					
					//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
					break;
				}
				
				
				case -1847728428:
				{
					//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
					if (field.equals("testAbstract")) 
					{
						//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
						__temp_executeDef1 = false;
						//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
						this.testAbstract();
					}
					
					//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
					break;
				}
				
				
			}
			
			//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
		baseArr.push("x");
		//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
		{
			//line 8 "/shared/core/test/thx/TestOrderedMap.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}

