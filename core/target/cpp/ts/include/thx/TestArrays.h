// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_TestArrays
#define INCLUDED_thx_TestArrays

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS1(thx,TestArrays)

namespace thx{


class HXCPP_CLASS_ATTRIBUTES TestArrays_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef TestArrays_obj OBJ_;
		TestArrays_obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="thx.TestArrays")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"thx.TestArrays"); }
		static hx::ObjectPtr< TestArrays_obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~TestArrays_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("TestArrays","\xcc","\xc2","\x95","\xc7"); }

		void testApplyIndexes();
		::Dynamic testApplyIndexes_dyn();

		void testRank();
		::Dynamic testRank_dyn();

		void testWith();
		::Dynamic testWith_dyn();

		void testCreate();
		::Dynamic testCreate_dyn();

		void testEach();
		::Dynamic testEach_dyn();

		void testEachi();
		::Dynamic testEachi_dyn();

		void testMap();
		::Dynamic testMap_dyn();

		void testMapi();
		::Dynamic testMapi_dyn();

		void testCrossMulti();
		::Dynamic testCrossMulti_dyn();

		void testMapField();
		::Dynamic testMapField_dyn();

		void testMapFieldOnFunction();
		::Dynamic testMapFieldOnFunction_dyn();

		void testUsingMapField();
		::Dynamic testUsingMapField_dyn();

		void testUsingMapFieldiOnFunction();
		::Dynamic testUsingMapFieldiOnFunction_dyn();

		void testFilterFn();
		::Dynamic testFilterFn_dyn();

		void testFind();
		::Dynamic testFind_dyn();

		void testFindOption();
		::Dynamic testFindOption_dyn();

		void testFindLast();
		::Dynamic testFindLast_dyn();

		void testFindFn();
		::Dynamic testFindFn_dyn();

		void testFindFnLast();
		::Dynamic testFindFnLast_dyn();

		void testIntersperse();
		::Dynamic testIntersperse_dyn();

		void testFn();
		::Dynamic testFn_dyn();

		void testMinFloats();
		::Dynamic testMinFloats_dyn();

		void testMinInts();
		::Dynamic testMinInts_dyn();

		void testMaxFloats();
		::Dynamic testMaxFloats_dyn();

		void testMaxInts();
		::Dynamic testMaxInts_dyn();

		void testAverageFloats();
		::Dynamic testAverageFloats_dyn();

		void testAverageInts();
		::Dynamic testAverageInts_dyn();

		void testMinString();
		::Dynamic testMinString_dyn();

		void testMaxStrings();
		::Dynamic testMaxStrings_dyn();

		void testCompactFloats();
		::Dynamic testCompactFloats_dyn();

		void testCompactStrings();
		::Dynamic testCompactStrings_dyn();

		void testFilterNullInt();
		::Dynamic testFilterNullInt_dyn();

		void testOrder();
		::Dynamic testOrder_dyn();

		void testOrderFn();
		::Dynamic testOrderFn_dyn();

		void testOrderFnObjectOfInt();
		::Dynamic testOrderFnObjectOfInt_dyn();

		void testOrderFnObjectOfFloat();
		::Dynamic testOrderFnObjectOfFloat_dyn();

		void testSortFn();
		::Dynamic testSortFn_dyn();

		void testContains();
		::Dynamic testContains_dyn();

		void testContainsAll();
		::Dynamic testContainsAll_dyn();

		void testContainsAny();
		::Dynamic testContainsAny_dyn();

		void testCount();
		::Dynamic testCount_dyn();

		void testGroupBy();
		::Dynamic testGroupBy_dyn();

		void testGroupByArray();
		::Dynamic testGroupByArray_dyn();

		void testGroupByInstance();
		::Dynamic testGroupByInstance_dyn();

		void testGroupByAnonymous();
		::Dynamic testGroupByAnonymous_dyn();

		void testMapRight();
		::Dynamic testMapRight_dyn();

		void testFnRight();
		::Dynamic testFnRight_dyn();

		void testReduceRight();
		::Dynamic testReduceRight_dyn();

		void testRotate();
		::Dynamic testRotate_dyn();

		void testDistinct();
		::Dynamic testDistinct_dyn();

		void testSplit();
		::Dynamic testSplit_dyn();

		void testSplitBy();
		::Dynamic testSplitBy_dyn();

		void testSplitByPad();
		::Dynamic testSplitByPad_dyn();

		void testTraverseOption();
		::Dynamic testTraverseOption_dyn();

		void testTraverseValidation();
		::Dynamic testTraverseValidation_dyn();

		void testZip5Ap();
		::Dynamic testZip5Ap_dyn();

};

} // end namespace thx

#endif /* INCLUDED_thx_TestArrays */ 
