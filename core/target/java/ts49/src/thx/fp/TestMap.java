// Generated by Haxe 3.3.0
package thx.fp;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TestMap extends haxe.lang.HxObject
{
	public TestMap(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public TestMap(int i)
	{
		//line 12 "/shared/core/test/thx/fp/TestMap.hx"
		thx.fp.TestMap.__hx_ctor_thx_fp_TestMap(this, i);
	}
	
	
	public static void __hx_ctor_thx_fp_TestMap(thx.fp.TestMap __temp_me119, int i)
	{
		//line 13 "/shared/core/test/thx/fp/TestMap.hx"
		__temp_me119.x = i;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 10 "/shared/core/test/thx/fp/TestMap.hx"
		return new thx.fp.TestMap(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 10 "/shared/core/test/thx/fp/TestMap.hx"
		return new thx.fp.TestMap(((int) (haxe.lang.Runtime.toInt(arr.__get(0))) ));
	}
	
	
	public int x;
	
	public void testRemove()
	{
		//line 17 "/shared/core/test/thx/fp/TestMap.hx"
		int _g1 = 0;
		//line 17 "/shared/core/test/thx/fp/TestMap.hx"
		int _g = this.x;
		//line 17 "/shared/core/test/thx/fp/TestMap.hx"
		while (( _g1 < _g ))
		{
			//line 17 "/shared/core/test/thx/fp/TestMap.hx"
			 ++ _g1;
			//line 18 "/shared/core/test/thx/fp/TestMap.hx"
			thx.fp.MapImpl m = ((thx.fp.MapImpl) (thx.fp._Map.Map_Impl_.delete(((thx.fp.MapImpl) (thx.fp._Map.Map_Impl_.insert(((thx.fp.MapImpl) (thx.fp._Map.Map_Impl_.insert(((thx.fp.MapImpl) (thx.fp.MapImpl.Bin(1, "Y", 1, thx.fp.MapImpl.Tip, thx.fp.MapImpl.Tip)) ), haxe.lang.Runtime.toString("X"), ((java.lang.Object) (2) ), ((haxe.lang.Function) (thx.Strings.order) ))) ), haxe.lang.Runtime.toString("Z"), ((java.lang.Object) (3) ), ((haxe.lang.Function) (thx.Strings.order) ))) ), haxe.lang.Runtime.toString("X"), ((haxe.lang.Function) (thx.Strings.order) ))) );
			//line 22 "/shared/core/test/thx/fp/TestMap.hx"
			utest.Assert.same(haxe.ds.Option.Some(1), ((haxe.ds.Option) (thx.fp._Map.Map_Impl_.lookup(((thx.fp.MapImpl) (m) ), haxe.lang.Runtime.toString("Y"), ((haxe.lang.Function) (thx.Strings.order) ))) ), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.fp.TestMap", "TestMap.hx", "testRemove"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (22) )) )}));
			//line 23 "/shared/core/test/thx/fp/TestMap.hx"
			utest.Assert.same(haxe.ds.Option.Some(3), ((haxe.ds.Option) (thx.fp._Map.Map_Impl_.lookup(((thx.fp.MapImpl) (m) ), haxe.lang.Runtime.toString("Z"), ((haxe.lang.Function) (thx.Strings.order) ))) ), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.fp.TestMap", "TestMap.hx", "testRemove"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (23) )) )}));
			//line 24 "/shared/core/test/thx/fp/TestMap.hx"
			utest.Assert.equals(2, ((int) (thx.fp._Map.Map_Impl_.size(((thx.fp.MapImpl) (m) ))) ), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.fp.TestMap", "TestMap.hx", "testRemove"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (24) )) )}));
		}
		
	}
	
	
	public void testEmpty()
	{
		//line 28 "/shared/core/test/thx/fp/TestMap.hx"
		int _g1 = 0;
		//line 28 "/shared/core/test/thx/fp/TestMap.hx"
		int _g = this.x;
		//line 28 "/shared/core/test/thx/fp/TestMap.hx"
		while (( _g1 < _g ))
		{
			//line 28 "/shared/core/test/thx/fp/TestMap.hx"
			 ++ _g1;
			//line 29 "/shared/core/test/thx/fp/TestMap.hx"
			thx.fp.MapImpl m = ((thx.fp.MapImpl) (thx.fp.MapImpl.Tip) );
			//line 30 "/shared/core/test/thx/fp/TestMap.hx"
			utest.Assert.same(haxe.ds.Option.None, ((haxe.ds.Option) (thx.fp._Map.Map_Impl_.lookup(((thx.fp.MapImpl) (m) ), haxe.lang.Runtime.toString("some"), ((haxe.lang.Function) (thx.Strings.order) ))) ), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.fp.TestMap", "TestMap.hx", "testEmpty"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (30) )) )}));
			//line 31 "/shared/core/test/thx/fp/TestMap.hx"
			utest.Assert.equals(0, ((int) (thx.fp._Map.Map_Impl_.size(((thx.fp.MapImpl) (m) ))) ), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.fp.TestMap", "TestMap.hx", "testEmpty"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (31) )) )}));
		}
		
	}
	
	
	public void testSizes()
	{
		//line 35 "/shared/core/test/thx/fp/TestMap.hx"
		int _g1 = 0;
		//line 35 "/shared/core/test/thx/fp/TestMap.hx"
		int _g = this.x;
		//line 35 "/shared/core/test/thx/fp/TestMap.hx"
		while (( _g1 < _g ))
		{
			//line 35 "/shared/core/test/thx/fp/TestMap.hx"
			 ++ _g1;
			//line 36 "/shared/core/test/thx/fp/TestMap.hx"
			utest.Assert.equals(3, ((int) (thx.fp._Map.Map_Impl_.size(((thx.fp.MapImpl) (thx.fp._Map.Map_Impl_.insert(((thx.fp.MapImpl) (thx.fp._Map.Map_Impl_.insert(((thx.fp.MapImpl) (thx.fp.MapImpl.Bin(1, "B", 1, thx.fp.MapImpl.Tip, thx.fp.MapImpl.Tip)) ), haxe.lang.Runtime.toString("A"), ((java.lang.Object) (1) ), ((haxe.lang.Function) (thx.Strings.order) ))) ), haxe.lang.Runtime.toString("C"), ((java.lang.Object) (1) ), ((haxe.lang.Function) (thx.Strings.order) ))) ))) ), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.fp.TestMap", "TestMap.hx", "testSizes"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (36) )) )}));
			//line 37 "/shared/core/test/thx/fp/TestMap.hx"
			utest.Assert.equals(3, ((int) (thx.fp._Map.Map_Impl_.size(((thx.fp.MapImpl) (thx.fp._Map.Map_Impl_.insert(((thx.fp.MapImpl) (thx.fp._Map.Map_Impl_.insert(((thx.fp.MapImpl) (thx.fp.MapImpl.Bin(1, "A", 1, thx.fp.MapImpl.Tip, thx.fp.MapImpl.Tip)) ), haxe.lang.Runtime.toString("B"), ((java.lang.Object) (1) ), ((haxe.lang.Function) (thx.Strings.order) ))) ), haxe.lang.Runtime.toString("C"), ((java.lang.Object) (1) ), ((haxe.lang.Function) (thx.Strings.order) ))) ))) ), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.fp.TestMap", "TestMap.hx", "testSizes"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (37) )) )}));
			//line 38 "/shared/core/test/thx/fp/TestMap.hx"
			utest.Assert.equals(3, ((int) (thx.fp._Map.Map_Impl_.size(((thx.fp.MapImpl) (thx.fp._Map.Map_Impl_.insert(((thx.fp.MapImpl) (thx.fp._Map.Map_Impl_.insert(((thx.fp.MapImpl) (thx.fp.MapImpl.Bin(1, "C", 1, thx.fp.MapImpl.Tip, thx.fp.MapImpl.Tip)) ), haxe.lang.Runtime.toString("B"), ((java.lang.Object) (1) ), ((haxe.lang.Function) (thx.Strings.order) ))) ), haxe.lang.Runtime.toString("A"), ((java.lang.Object) (1) ), ((haxe.lang.Function) (thx.Strings.order) ))) ))) ), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.fp.TestMap", "TestMap.hx", "testSizes"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (38) )) )}));
			//line 39 "/shared/core/test/thx/fp/TestMap.hx"
			utest.Assert.equals(3, ((int) (thx.fp._Map.Map_Impl_.size(((thx.fp.MapImpl) (thx.fp._Map.Map_Impl_.insert(((thx.fp.MapImpl) (thx.fp._Map.Map_Impl_.insert(((thx.fp.MapImpl) (thx.fp.MapImpl.Bin(1, "B", 1, thx.fp.MapImpl.Tip, thx.fp.MapImpl.Tip)) ), haxe.lang.Runtime.toString("C"), ((java.lang.Object) (1) ), ((haxe.lang.Function) (thx.Strings.order) ))) ), haxe.lang.Runtime.toString("A"), ((java.lang.Object) (1) ), ((haxe.lang.Function) (thx.Strings.order) ))) ))) ), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.fp.TestMap", "TestMap.hx", "testSizes"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (39) )) )}));
			//line 40 "/shared/core/test/thx/fp/TestMap.hx"
			utest.Assert.equals(3, ((int) (thx.fp._Map.Map_Impl_.size(((thx.fp.MapImpl) (thx.fp._Map.Map_Impl_.insert(((thx.fp.MapImpl) (thx.fp._Map.Map_Impl_.insert(((thx.fp.MapImpl) (thx.fp.MapImpl.Bin(1, "C", 1, thx.fp.MapImpl.Tip, thx.fp.MapImpl.Tip)) ), haxe.lang.Runtime.toString("A"), ((java.lang.Object) (1) ), ((haxe.lang.Function) (thx.Strings.order) ))) ), haxe.lang.Runtime.toString("B"), ((java.lang.Object) (1) ), ((haxe.lang.Function) (thx.Strings.order) ))) ))) ), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.fp.TestMap", "TestMap.hx", "testSizes"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (40) )) )}));
			//line 41 "/shared/core/test/thx/fp/TestMap.hx"
			utest.Assert.equals(3, ((int) (thx.fp._Map.Map_Impl_.size(((thx.fp.MapImpl) (thx.fp._Map.Map_Impl_.insert(((thx.fp.MapImpl) (thx.fp._Map.Map_Impl_.insert(((thx.fp.MapImpl) (thx.fp.MapImpl.Bin(1, "A", 1, thx.fp.MapImpl.Tip, thx.fp.MapImpl.Tip)) ), haxe.lang.Runtime.toString("C"), ((java.lang.Object) (1) ), ((haxe.lang.Function) (thx.Strings.order) ))) ), haxe.lang.Runtime.toString("B"), ((java.lang.Object) (1) ), ((haxe.lang.Function) (thx.Strings.order) ))) ))) ), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.fp.TestMap", "TestMap.hx", "testSizes"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (41) )) )}));
			//line 43 "/shared/core/test/thx/fp/TestMap.hx"
			utest.Assert.equals(1, ((int) (thx.fp._Map.Map_Impl_.size(((thx.fp.MapImpl) (thx.fp._Map.Map_Impl_.insert(((thx.fp.MapImpl) (thx.fp._Map.Map_Impl_.insert(((thx.fp.MapImpl) (thx.fp.MapImpl.Bin(1, "A", 1, thx.fp.MapImpl.Tip, thx.fp.MapImpl.Tip)) ), haxe.lang.Runtime.toString("A"), ((java.lang.Object) (1) ), ((haxe.lang.Function) (thx.Strings.order) ))) ), haxe.lang.Runtime.toString("A"), ((java.lang.Object) (1) ), ((haxe.lang.Function) (thx.Strings.order) ))) ))) ), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.fp.TestMap", "TestMap.hx", "testSizes"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (43) )) )}));
		}
		
	}
	
	
	public void testFoldLeft()
	{
		//line 47 "/shared/core/test/thx/fp/TestMap.hx"
		int _g1 = 0;
		//line 47 "/shared/core/test/thx/fp/TestMap.hx"
		int _g = this.x;
		//line 47 "/shared/core/test/thx/fp/TestMap.hx"
		while (( _g1 < _g ))
		{
			//line 47 "/shared/core/test/thx/fp/TestMap.hx"
			 ++ _g1;
			//line 48 "/shared/core/test/thx/fp/TestMap.hx"
			thx.fp.MapImpl map = ((thx.fp.MapImpl) (thx.fp._Map.Map_Impl_.insert(((thx.fp.MapImpl) (thx.fp._Map.Map_Impl_.insert(((thx.fp.MapImpl) (thx.fp.MapImpl.Bin(1, "A", 1, thx.fp.MapImpl.Tip, thx.fp.MapImpl.Tip)) ), haxe.lang.Runtime.toString("B"), ((java.lang.Object) (2) ), ((haxe.lang.Function) (thx.Strings.order) ))) ), haxe.lang.Runtime.toString("C"), ((java.lang.Object) (3) ), ((haxe.lang.Function) (thx.Strings.order) ))) );
			//line 49 "/shared/core/test/thx/fp/TestMap.hx"
			haxe.root.Array<java.lang.Object> arr = ((haxe.root.Array<java.lang.Object>) (thx.fp._Map.Map_Impl_.foldLeft(((thx.fp.MapImpl) (map) ), ((java.lang.Object) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ), ((haxe.lang.Function) (( (( thx.fp.TestMap_testFoldLeft_49__Fun.__hx_current != null )) ? (thx.fp.TestMap_testFoldLeft_49__Fun.__hx_current) : (thx.fp.TestMap_testFoldLeft_49__Fun.__hx_current = ((thx.fp.TestMap_testFoldLeft_49__Fun) (new thx.fp.TestMap_testFoldLeft_49__Fun()) )) )) ))) );
			//line 53 "/shared/core/test/thx/fp/TestMap.hx"
			utest.Assert.same(new haxe.root.Array(new java.lang.Object[]{1, 2, 3}), ((haxe.root.Array<java.lang.Object>) (((haxe.root.Array) (thx.Arrays.order(((haxe.root.Array<java.lang.Object>) (((haxe.root.Array) (arr) )) ), ((haxe.lang.Function) (new haxe.lang.Closure(thx.Ints.class, "compare")) ))) )) ), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.fp.TestMap", "TestMap.hx", "testFoldLeft"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (53) )) )}));
		}
		
	}
	
	
	public void testFoldLeftKeys()
	{
		//line 57 "/shared/core/test/thx/fp/TestMap.hx"
		int _g1 = 0;
		//line 57 "/shared/core/test/thx/fp/TestMap.hx"
		int _g = this.x;
		//line 57 "/shared/core/test/thx/fp/TestMap.hx"
		while (( _g1 < _g ))
		{
			//line 57 "/shared/core/test/thx/fp/TestMap.hx"
			 ++ _g1;
			//line 58 "/shared/core/test/thx/fp/TestMap.hx"
			thx.fp.MapImpl map = ((thx.fp.MapImpl) (thx.fp._Map.Map_Impl_.insert(((thx.fp.MapImpl) (thx.fp._Map.Map_Impl_.insert(((thx.fp.MapImpl) (thx.fp.MapImpl.Bin(1, "A", 1, thx.fp.MapImpl.Tip, thx.fp.MapImpl.Tip)) ), haxe.lang.Runtime.toString("B"), ((java.lang.Object) (2) ), ((haxe.lang.Function) (thx.Strings.order) ))) ), haxe.lang.Runtime.toString("C"), ((java.lang.Object) (3) ), ((haxe.lang.Function) (thx.Strings.order) ))) );
			//line 59 "/shared/core/test/thx/fp/TestMap.hx"
			haxe.root.Array<java.lang.String> arr = ((haxe.root.Array<java.lang.String>) (thx.fp._Map.Map_Impl_.foldLeftKeys(((thx.fp.MapImpl) (map) ), ((java.lang.Object) (new haxe.root.Array<java.lang.String>(new java.lang.String[]{})) ), ((haxe.lang.Function) (( (( thx.fp.TestMap_testFoldLeftKeys_59__Fun.__hx_current != null )) ? (thx.fp.TestMap_testFoldLeftKeys_59__Fun.__hx_current) : (thx.fp.TestMap_testFoldLeftKeys_59__Fun.__hx_current = ((thx.fp.TestMap_testFoldLeftKeys_59__Fun) (new thx.fp.TestMap_testFoldLeftKeys_59__Fun()) )) )) ))) );
			//line 63 "/shared/core/test/thx/fp/TestMap.hx"
			utest.Assert.same(new haxe.root.Array(new java.lang.Object[]{"A", "B", "C"}), ((haxe.root.Array<java.lang.String>) (thx.Arrays.order(((haxe.root.Array<java.lang.String>) (arr) ), ((haxe.lang.Function) (new haxe.lang.Closure(thx.Strings.class, "compare")) ))) ), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.fp.TestMap", "TestMap.hx", "testFoldLeftKeys"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (63) )) )}));
		}
		
	}
	
	
	public void testSet()
	{
		//line 67 "/shared/core/test/thx/fp/TestMap.hx"
		int _g1 = 0;
		//line 67 "/shared/core/test/thx/fp/TestMap.hx"
		int _g = this.x;
		//line 67 "/shared/core/test/thx/fp/TestMap.hx"
		while (( _g1 < _g ))
		{
			//line 67 "/shared/core/test/thx/fp/TestMap.hx"
			 ++ _g1;
			//line 68 "/shared/core/test/thx/fp/TestMap.hx"
			thx.fp.MapImpl m = ((thx.fp.MapImpl) (thx.fp._Map.Map_Impl_.insert(((thx.fp.MapImpl) (thx.fp._Map.Map_Impl_.insert(((thx.fp.MapImpl) (thx.fp.MapImpl.Bin(1, "Y", 1, thx.fp.MapImpl.Tip, thx.fp.MapImpl.Tip)) ), haxe.lang.Runtime.toString("X"), ((java.lang.Object) (2) ), ((haxe.lang.Function) (thx.Strings.order) ))) ), haxe.lang.Runtime.toString("Z"), ((java.lang.Object) (3) ), ((haxe.lang.Function) (thx.Strings.order) ))) );
			//line 69 "/shared/core/test/thx/fp/TestMap.hx"
			utest.Assert.same(haxe.ds.Option.Some(2), ((haxe.ds.Option) (thx.fp._Map.Map_Impl_.lookup(((thx.fp.MapImpl) (m) ), haxe.lang.Runtime.toString("X"), ((haxe.lang.Function) (thx.Strings.order) ))) ), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.fp.TestMap", "TestMap.hx", "testSet"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (69) )) )}));
			//line 70 "/shared/core/test/thx/fp/TestMap.hx"
			utest.Assert.same(haxe.ds.Option.Some(1), ((haxe.ds.Option) (thx.fp._Map.Map_Impl_.lookup(((thx.fp.MapImpl) (m) ), haxe.lang.Runtime.toString("Y"), ((haxe.lang.Function) (thx.Strings.order) ))) ), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.fp.TestMap", "TestMap.hx", "testSet"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (70) )) )}));
			//line 71 "/shared/core/test/thx/fp/TestMap.hx"
			utest.Assert.same(haxe.ds.Option.Some(3), ((haxe.ds.Option) (thx.fp._Map.Map_Impl_.lookup(((thx.fp.MapImpl) (m) ), haxe.lang.Runtime.toString("Z"), ((haxe.lang.Function) (thx.Strings.order) ))) ), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.fp.TestMap", "TestMap.hx", "testSet"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (71) )) )}));
			//line 72 "/shared/core/test/thx/fp/TestMap.hx"
			utest.Assert.equals(3, ((int) (thx.fp._Map.Map_Impl_.size(((thx.fp.MapImpl) (m) ))) ), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.fp.TestMap", "TestMap.hx", "testSet"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (72) )) )}));
		}
		
	}
	
	
	public void testObjectSet()
	{
		//line 76 "/shared/core/test/thx/fp/TestMap.hx"
		int _g1 = 0;
		//line 76 "/shared/core/test/thx/fp/TestMap.hx"
		int _g = this.x;
		//line 76 "/shared/core/test/thx/fp/TestMap.hx"
		while (( _g1 < _g ))
		{
			//line 76 "/shared/core/test/thx/fp/TestMap.hx"
			 ++ _g1;
			//line 77 "/shared/core/test/thx/fp/TestMap.hx"
			thx.fp.CO a = new thx.fp.CO(haxe.lang.Runtime.toString("a"));
			//line 77 "/shared/core/test/thx/fp/TestMap.hx"
			thx.fp.CO b = new thx.fp.CO(haxe.lang.Runtime.toString("b"));
			//line 77 "/shared/core/test/thx/fp/TestMap.hx"
			thx.fp.CO c = new thx.fp.CO(haxe.lang.Runtime.toString("c"));
			//line 77 "/shared/core/test/thx/fp/TestMap.hx"
			thx.fp.MapImpl m = ((thx.fp.MapImpl) (thx.fp._Map.Map_Impl_.insert(((thx.fp.MapImpl) (thx.fp._Map.Map_Impl_.insert(((thx.fp.MapImpl) (thx.fp.MapImpl.Bin(1, a, 1, thx.fp.MapImpl.Tip, thx.fp.MapImpl.Tip)) ), ((thx.fp.CO) (b) ), ((java.lang.Object) (2) ), ((haxe.lang.Function) (thx._Ord.Ord_Impl_.forComparableOrd()) ))) ), ((thx.fp.CO) (c) ), ((java.lang.Object) (3) ), ((haxe.lang.Function) (thx._Ord.Ord_Impl_.forComparableOrd()) ))) );
			//line 84 "/shared/core/test/thx/fp/TestMap.hx"
			utest.Assert.same(haxe.ds.Option.Some(1), ((haxe.ds.Option) (thx.fp._Map.Map_Impl_.lookup(((thx.fp.MapImpl) (m) ), ((thx.fp.CO) (a) ), ((haxe.lang.Function) (thx._Ord.Ord_Impl_.forComparableOrd()) ))) ), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.fp.TestMap", "TestMap.hx", "testObjectSet"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (84) )) )}));
			//line 85 "/shared/core/test/thx/fp/TestMap.hx"
			utest.Assert.same(haxe.ds.Option.Some(2), ((haxe.ds.Option) (thx.fp._Map.Map_Impl_.lookup(((thx.fp.MapImpl) (m) ), ((thx.fp.CO) (b) ), ((haxe.lang.Function) (thx._Ord.Ord_Impl_.forComparableOrd()) ))) ), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.fp.TestMap", "TestMap.hx", "testObjectSet"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (85) )) )}));
			//line 86 "/shared/core/test/thx/fp/TestMap.hx"
			utest.Assert.same(haxe.ds.Option.Some(3), ((haxe.ds.Option) (thx.fp._Map.Map_Impl_.lookup(((thx.fp.MapImpl) (m) ), ((thx.fp.CO) (c) ), ((haxe.lang.Function) (thx._Ord.Ord_Impl_.forComparableOrd()) ))) ), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.fp.TestMap", "TestMap.hx", "testObjectSet"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (86) )) )}));
			//line 87 "/shared/core/test/thx/fp/TestMap.hx"
			utest.Assert.equals(3, ((int) (thx.fp._Map.Map_Impl_.size(((thx.fp.MapImpl) (m) ))) ), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.fp.TestMap", "TestMap.hx", "testObjectSet"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (87) )) )}));
		}
		
	}
	
	
	public void testObjectSet2()
	{
		//line 91 "/shared/core/test/thx/fp/TestMap.hx"
		int _g1 = 0;
		//line 91 "/shared/core/test/thx/fp/TestMap.hx"
		int _g = this.x;
		//line 91 "/shared/core/test/thx/fp/TestMap.hx"
		while (( _g1 < _g ))
		{
			//line 91 "/shared/core/test/thx/fp/TestMap.hx"
			 ++ _g1;
			//line 92 "/shared/core/test/thx/fp/TestMap.hx"
			thx.fp.CO2 a = new thx.fp.CO2(haxe.lang.Runtime.toString("a"));
			//line 92 "/shared/core/test/thx/fp/TestMap.hx"
			thx.fp.CO2 b = new thx.fp.CO2(haxe.lang.Runtime.toString("b"));
			//line 92 "/shared/core/test/thx/fp/TestMap.hx"
			thx.fp.CO2 c = new thx.fp.CO2(haxe.lang.Runtime.toString("c"));
			//line 92 "/shared/core/test/thx/fp/TestMap.hx"
			thx.fp.MapImpl m = ((thx.fp.MapImpl) (thx.fp._Map.Map_Impl_.insert(((thx.fp.MapImpl) (thx.fp._Map.Map_Impl_.insert(((thx.fp.MapImpl) (thx.fp.MapImpl.Bin(1, a, 1, thx.fp.MapImpl.Tip, thx.fp.MapImpl.Tip)) ), ((thx.fp.CO2) (b) ), ((java.lang.Object) (2) ), ((haxe.lang.Function) (thx._Ord.Ord_Impl_.forComparable()) ))) ), ((thx.fp.CO2) (c) ), ((java.lang.Object) (3) ), ((haxe.lang.Function) (thx._Ord.Ord_Impl_.forComparable()) ))) );
			//line 99 "/shared/core/test/thx/fp/TestMap.hx"
			utest.Assert.same(haxe.ds.Option.Some(1), ((haxe.ds.Option) (thx.fp._Map.Map_Impl_.lookup(((thx.fp.MapImpl) (m) ), ((thx.fp.CO2) (a) ), ((haxe.lang.Function) (thx._Ord.Ord_Impl_.forComparable()) ))) ), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.fp.TestMap", "TestMap.hx", "testObjectSet2"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (99) )) )}));
			//line 100 "/shared/core/test/thx/fp/TestMap.hx"
			utest.Assert.same(haxe.ds.Option.Some(2), ((haxe.ds.Option) (thx.fp._Map.Map_Impl_.lookup(((thx.fp.MapImpl) (m) ), ((thx.fp.CO2) (b) ), ((haxe.lang.Function) (thx._Ord.Ord_Impl_.forComparable()) ))) ), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.fp.TestMap", "TestMap.hx", "testObjectSet2"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (100) )) )}));
			//line 101 "/shared/core/test/thx/fp/TestMap.hx"
			utest.Assert.same(haxe.ds.Option.Some(3), ((haxe.ds.Option) (thx.fp._Map.Map_Impl_.lookup(((thx.fp.MapImpl) (m) ), ((thx.fp.CO2) (c) ), ((haxe.lang.Function) (thx._Ord.Ord_Impl_.forComparable()) ))) ), null, null, null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.fp.TestMap", "TestMap.hx", "testObjectSet2"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (101) )) )}));
			//line 102 "/shared/core/test/thx/fp/TestMap.hx"
			utest.Assert.equals(3, ((int) (thx.fp._Map.Map_Impl_.size(((thx.fp.MapImpl) (m) ))) ), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.fp.TestMap", "TestMap.hx", "testObjectSet2"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (102) )) )}));
		}
		
	}
	
	
	public void testFromNative()
	{
		//line 106 "/shared/core/test/thx/fp/TestMap.hx"
		int _g1 = 0;
		//line 106 "/shared/core/test/thx/fp/TestMap.hx"
		int _g = this.x;
		//line 106 "/shared/core/test/thx/fp/TestMap.hx"
		while (( _g1 < _g ))
		{
			//line 106 "/shared/core/test/thx/fp/TestMap.hx"
			 ++ _g1;
			//line 107 "/shared/core/test/thx/fp/TestMap.hx"
			haxe.ds.StringMap<java.lang.Object> _g2 = new haxe.ds.StringMap<java.lang.Object>();
			//line 107 "/shared/core/test/thx/fp/TestMap.hx"
			_g2.set("a", 1);
			//line 107 "/shared/core/test/thx/fp/TestMap.hx"
			_g2.set("b", 2);
			//line 107 "/shared/core/test/thx/fp/TestMap.hx"
			thx.fp.MapImpl map = ((thx.fp.MapImpl) (thx.fp.StringMap.fromNative(((haxe.IMap<java.lang.String, java.lang.Object>) (((haxe.IMap) (((haxe.IMap<java.lang.String, java.lang.Object>) (_g2) )) )) ))) );
			//line 109 "/shared/core/test/thx/fp/TestMap.hx"
			utest.Assert.equals(2, ((int) (thx.fp._Map.Map_Impl_.size(((thx.fp.MapImpl) (map) ))) ), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.fp.TestMap", "TestMap.hx", "testFromNative"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (109) )) )}));
			//line 110 "/shared/core/test/thx/fp/TestMap.hx"
			utest.Assert.isTrue(((boolean) (thx.Options.toBool(((haxe.ds.Option) (thx.fp._Map.Map_Impl_.lookup(((thx.fp.MapImpl) (map) ), haxe.lang.Runtime.toString("a"), ((haxe.lang.Function) (thx.Strings.order) ))) ))) ), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.fp.TestMap", "TestMap.hx", "testFromNative"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (110) )) )}));
			//line 111 "/shared/core/test/thx/fp/TestMap.hx"
			utest.Assert.isTrue(((boolean) (thx.Options.toBool(((haxe.ds.Option) (thx.fp._Map.Map_Impl_.lookup(((thx.fp.MapImpl) (map) ), haxe.lang.Runtime.toString("b"), ((haxe.lang.Function) (thx.Strings.order) ))) ))) ), null, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"thx.fp.TestMap", "TestMap.hx", "testFromNative"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (111) )) )}));
		}
		
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 10 "/shared/core/test/thx/fp/TestMap.hx"
		{
			//line 10 "/shared/core/test/thx/fp/TestMap.hx"
			boolean __temp_executeDef1 = true;
			//line 10 "/shared/core/test/thx/fp/TestMap.hx"
			switch (field.hashCode())
			{
				case 120:
				{
					//line 10 "/shared/core/test/thx/fp/TestMap.hx"
					if (field.equals("x")) 
					{
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						this.x = ((int) (value) );
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						return value;
					}
					
					//line 10 "/shared/core/test/thx/fp/TestMap.hx"
					break;
				}
				
				
			}
			
			//line 10 "/shared/core/test/thx/fp/TestMap.hx"
			if (__temp_executeDef1) 
			{
				//line 10 "/shared/core/test/thx/fp/TestMap.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 10 "/shared/core/test/thx/fp/TestMap.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 10 "/shared/core/test/thx/fp/TestMap.hx"
		{
			//line 10 "/shared/core/test/thx/fp/TestMap.hx"
			boolean __temp_executeDef1 = true;
			//line 10 "/shared/core/test/thx/fp/TestMap.hx"
			switch (field.hashCode())
			{
				case 120:
				{
					//line 10 "/shared/core/test/thx/fp/TestMap.hx"
					if (field.equals("x")) 
					{
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						this.x = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						return value;
					}
					
					//line 10 "/shared/core/test/thx/fp/TestMap.hx"
					break;
				}
				
				
			}
			
			//line 10 "/shared/core/test/thx/fp/TestMap.hx"
			if (__temp_executeDef1) 
			{
				//line 10 "/shared/core/test/thx/fp/TestMap.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 10 "/shared/core/test/thx/fp/TestMap.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 10 "/shared/core/test/thx/fp/TestMap.hx"
		{
			//line 10 "/shared/core/test/thx/fp/TestMap.hx"
			boolean __temp_executeDef1 = true;
			//line 10 "/shared/core/test/thx/fp/TestMap.hx"
			switch (field.hashCode())
			{
				case 1283358355:
				{
					//line 10 "/shared/core/test/thx/fp/TestMap.hx"
					if (field.equals("testFromNative")) 
					{
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testFromNative")) );
					}
					
					//line 10 "/shared/core/test/thx/fp/TestMap.hx"
					break;
				}
				
				
				case 120:
				{
					//line 10 "/shared/core/test/thx/fp/TestMap.hx"
					if (field.equals("x")) 
					{
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						return this.x;
					}
					
					//line 10 "/shared/core/test/thx/fp/TestMap.hx"
					break;
				}
				
				
				case 352797217:
				{
					//line 10 "/shared/core/test/thx/fp/TestMap.hx"
					if (field.equals("testObjectSet2")) 
					{
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testObjectSet2")) );
					}
					
					//line 10 "/shared/core/test/thx/fp/TestMap.hx"
					break;
				}
				
				
				case 1685124022:
				{
					//line 10 "/shared/core/test/thx/fp/TestMap.hx"
					if (field.equals("testRemove")) 
					{
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testRemove")) );
					}
					
					//line 10 "/shared/core/test/thx/fp/TestMap.hx"
					break;
				}
				
				
				case -819903439:
				{
					//line 10 "/shared/core/test/thx/fp/TestMap.hx"
					if (field.equals("testObjectSet")) 
					{
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testObjectSet")) );
					}
					
					//line 10 "/shared/core/test/thx/fp/TestMap.hx"
					break;
				}
				
				
				case -1204331557:
				{
					//line 10 "/shared/core/test/thx/fp/TestMap.hx"
					if (field.equals("testEmpty")) 
					{
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testEmpty")) );
					}
					
					//line 10 "/shared/core/test/thx/fp/TestMap.hx"
					break;
				}
				
				
				case -1422467472:
				{
					//line 10 "/shared/core/test/thx/fp/TestMap.hx"
					if (field.equals("testSet")) 
					{
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testSet")) );
					}
					
					//line 10 "/shared/core/test/thx/fp/TestMap.hx"
					break;
				}
				
				
				case -1191512288:
				{
					//line 10 "/shared/core/test/thx/fp/TestMap.hx"
					if (field.equals("testSizes")) 
					{
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testSizes")) );
					}
					
					//line 10 "/shared/core/test/thx/fp/TestMap.hx"
					break;
				}
				
				
				case 1096881006:
				{
					//line 10 "/shared/core/test/thx/fp/TestMap.hx"
					if (field.equals("testFoldLeftKeys")) 
					{
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testFoldLeftKeys")) );
					}
					
					//line 10 "/shared/core/test/thx/fp/TestMap.hx"
					break;
				}
				
				
				case 1007693402:
				{
					//line 10 "/shared/core/test/thx/fp/TestMap.hx"
					if (field.equals("testFoldLeft")) 
					{
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "testFoldLeft")) );
					}
					
					//line 10 "/shared/core/test/thx/fp/TestMap.hx"
					break;
				}
				
				
			}
			
			//line 10 "/shared/core/test/thx/fp/TestMap.hx"
			if (__temp_executeDef1) 
			{
				//line 10 "/shared/core/test/thx/fp/TestMap.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 10 "/shared/core/test/thx/fp/TestMap.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 10 "/shared/core/test/thx/fp/TestMap.hx"
		{
			//line 10 "/shared/core/test/thx/fp/TestMap.hx"
			boolean __temp_executeDef1 = true;
			//line 10 "/shared/core/test/thx/fp/TestMap.hx"
			switch (field.hashCode())
			{
				case 120:
				{
					//line 10 "/shared/core/test/thx/fp/TestMap.hx"
					if (field.equals("x")) 
					{
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						return ((double) (this.x) );
					}
					
					//line 10 "/shared/core/test/thx/fp/TestMap.hx"
					break;
				}
				
				
			}
			
			//line 10 "/shared/core/test/thx/fp/TestMap.hx"
			if (__temp_executeDef1) 
			{
				//line 10 "/shared/core/test/thx/fp/TestMap.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 10 "/shared/core/test/thx/fp/TestMap.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 10 "/shared/core/test/thx/fp/TestMap.hx"
		{
			//line 10 "/shared/core/test/thx/fp/TestMap.hx"
			boolean __temp_executeDef1 = true;
			//line 10 "/shared/core/test/thx/fp/TestMap.hx"
			switch (field.hashCode())
			{
				case 1283358355:
				{
					//line 10 "/shared/core/test/thx/fp/TestMap.hx"
					if (field.equals("testFromNative")) 
					{
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						this.testFromNative();
					}
					
					//line 10 "/shared/core/test/thx/fp/TestMap.hx"
					break;
				}
				
				
				case 1685124022:
				{
					//line 10 "/shared/core/test/thx/fp/TestMap.hx"
					if (field.equals("testRemove")) 
					{
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						this.testRemove();
					}
					
					//line 10 "/shared/core/test/thx/fp/TestMap.hx"
					break;
				}
				
				
				case 352797217:
				{
					//line 10 "/shared/core/test/thx/fp/TestMap.hx"
					if (field.equals("testObjectSet2")) 
					{
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						this.testObjectSet2();
					}
					
					//line 10 "/shared/core/test/thx/fp/TestMap.hx"
					break;
				}
				
				
				case -1204331557:
				{
					//line 10 "/shared/core/test/thx/fp/TestMap.hx"
					if (field.equals("testEmpty")) 
					{
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						this.testEmpty();
					}
					
					//line 10 "/shared/core/test/thx/fp/TestMap.hx"
					break;
				}
				
				
				case -819903439:
				{
					//line 10 "/shared/core/test/thx/fp/TestMap.hx"
					if (field.equals("testObjectSet")) 
					{
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						this.testObjectSet();
					}
					
					//line 10 "/shared/core/test/thx/fp/TestMap.hx"
					break;
				}
				
				
				case -1191512288:
				{
					//line 10 "/shared/core/test/thx/fp/TestMap.hx"
					if (field.equals("testSizes")) 
					{
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						this.testSizes();
					}
					
					//line 10 "/shared/core/test/thx/fp/TestMap.hx"
					break;
				}
				
				
				case -1422467472:
				{
					//line 10 "/shared/core/test/thx/fp/TestMap.hx"
					if (field.equals("testSet")) 
					{
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						this.testSet();
					}
					
					//line 10 "/shared/core/test/thx/fp/TestMap.hx"
					break;
				}
				
				
				case 1007693402:
				{
					//line 10 "/shared/core/test/thx/fp/TestMap.hx"
					if (field.equals("testFoldLeft")) 
					{
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						this.testFoldLeft();
					}
					
					//line 10 "/shared/core/test/thx/fp/TestMap.hx"
					break;
				}
				
				
				case 1096881006:
				{
					//line 10 "/shared/core/test/thx/fp/TestMap.hx"
					if (field.equals("testFoldLeftKeys")) 
					{
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						__temp_executeDef1 = false;
						//line 10 "/shared/core/test/thx/fp/TestMap.hx"
						this.testFoldLeftKeys();
					}
					
					//line 10 "/shared/core/test/thx/fp/TestMap.hx"
					break;
				}
				
				
			}
			
			//line 10 "/shared/core/test/thx/fp/TestMap.hx"
			if (__temp_executeDef1) 
			{
				//line 10 "/shared/core/test/thx/fp/TestMap.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 10 "/shared/core/test/thx/fp/TestMap.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 10 "/shared/core/test/thx/fp/TestMap.hx"
		baseArr.push("x");
		//line 10 "/shared/core/test/thx/fp/TestMap.hx"
		{
			//line 10 "/shared/core/test/thx/fp/TestMap.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}

