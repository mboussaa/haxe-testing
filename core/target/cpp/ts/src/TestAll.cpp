// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_EReg
#include <EReg.h>
#endif
#ifndef INCLUDED_TestAll
#include <TestAll.h>
#endif
#ifndef INCLUDED_thx_TestAnonymousMap
#include <thx/TestAnonymousMap.h>
#endif
#ifndef INCLUDED_thx_TestArrays
#include <thx/TestArrays.h>
#endif
#ifndef INCLUDED_thx_TestAssert
#include <thx/TestAssert.h>
#endif
#ifndef INCLUDED_thx_TestBigInt
#include <thx/TestBigInt.h>
#endif
#ifndef INCLUDED_thx_TestBitMatrix
#include <thx/TestBitMatrix.h>
#endif
#ifndef INCLUDED_thx_TestBitSet
#include <thx/TestBitSet.h>
#endif
#ifndef INCLUDED_thx_TestChar
#include <thx/TestChar.h>
#endif
#ifndef INCLUDED_thx_TestChars
#include <thx/TestChars.h>
#endif
#ifndef INCLUDED_thx_TestConvert
#include <thx/TestConvert.h>
#endif
#ifndef INCLUDED_thx_TestDateTime
#include <thx/TestDateTime.h>
#endif
#ifndef INCLUDED_thx_TestDateTimeUtc
#include <thx/TestDateTimeUtc.h>
#endif
#ifndef INCLUDED_thx_TestDates
#include <thx/TestDates.h>
#endif
#ifndef INCLUDED_thx_TestDecimal
#include <thx/TestDecimal.h>
#endif
#ifndef INCLUDED_thx_TestDynamics
#include <thx/TestDynamics.h>
#endif
#ifndef INCLUDED_thx_TestERegs
#include <thx/TestERegs.h>
#endif
#ifndef INCLUDED_thx_TestEffects
#include <thx/TestEffects.h>
#endif
#ifndef INCLUDED_thx_TestEithers
#include <thx/TestEithers.h>
#endif
#ifndef INCLUDED_thx_TestEnums
#include <thx/TestEnums.h>
#endif
#ifndef INCLUDED_thx_TestError
#include <thx/TestError.h>
#endif
#ifndef INCLUDED_thx_TestFloats
#include <thx/TestFloats.h>
#endif
#ifndef INCLUDED_thx_TestFunctions
#include <thx/TestFunctions.h>
#endif
#ifndef INCLUDED_thx_TestHashSet
#include <thx/TestHashSet.h>
#endif
#ifndef INCLUDED_thx_TestInt64s
#include <thx/TestInt64s.h>
#endif
#ifndef INCLUDED_thx_TestInts
#include <thx/TestInts.h>
#endif
#ifndef INCLUDED_thx_TestIterables
#include <thx/TestIterables.h>
#endif
#ifndef INCLUDED_thx_TestIterators
#include <thx/TestIterators.h>
#endif
#ifndef INCLUDED_thx_TestLambda
#include <thx/TestLambda.h>
#endif
#ifndef INCLUDED_thx_TestLambdaStaticExtension
#include <thx/TestLambdaStaticExtension.h>
#endif
#ifndef INCLUDED_thx_TestLocalDate
#include <thx/TestLocalDate.h>
#endif
#ifndef INCLUDED_thx_TestMake
#include <thx/TestMake.h>
#endif
#ifndef INCLUDED_thx_TestNulls
#include <thx/TestNulls.h>
#endif
#ifndef INCLUDED_thx_TestObjects
#include <thx/TestObjects.h>
#endif
#ifndef INCLUDED_thx_TestOrderedMap
#include <thx/TestOrderedMap.h>
#endif
#ifndef INCLUDED_thx_TestOrderedSet
#include <thx/TestOrderedSet.h>
#endif
#ifndef INCLUDED_thx_TestPath
#include <thx/TestPath.h>
#endif
#ifndef INCLUDED_thx_TestQueryString
#include <thx/TestQueryString.h>
#endif
#ifndef INCLUDED_thx_TestRational
#include <thx/TestRational.h>
#endif
#ifndef INCLUDED_thx_TestReadonlyArray
#include <thx/TestReadonlyArray.h>
#endif
#ifndef INCLUDED_thx_TestSet
#include <thx/TestSet.h>
#endif
#ifndef INCLUDED_thx_TestStaticResource
#include <thx/TestStaticResource.h>
#endif
#ifndef INCLUDED_thx_TestStrings
#include <thx/TestStrings.h>
#endif
#ifndef INCLUDED_thx_TestThx
#include <thx/TestThx.h>
#endif
#ifndef INCLUDED_thx_TestTime
#include <thx/TestTime.h>
#endif
#ifndef INCLUDED_thx_TestTuple
#include <thx/TestTuple.h>
#endif
#ifndef INCLUDED_thx_TestUrl
#include <thx/TestUrl.h>
#endif
#ifndef INCLUDED_thx_TestValidation
#include <thx/TestValidation.h>
#endif
#ifndef INCLUDED_thx_fp_TestList
#include <thx/fp/TestList.h>
#endif
#ifndef INCLUDED_thx_fp_TestMap
#include <thx/fp/TestMap.h>
#endif
#ifndef INCLUDED_thx_fp_TestSet
#include <thx/fp/TestSet.h>
#endif
#ifndef INCLUDED_thx_fp_TestState
#include <thx/fp/TestState.h>
#endif
#ifndef INCLUDED_thx_fp_TestTreeBag
#include <thx/fp/TestTreeBag.h>
#endif
#ifndef INCLUDED_thx_fp_TestWriter
#include <thx/fp/TestWriter.h>
#endif
#ifndef INCLUDED_utest_Runner
#include <utest/Runner.h>
#endif
#ifndef INCLUDED_utest_ui_Report
#include <utest/ui/Report.h>
#endif
#ifndef INCLUDED_utest_ui_common_HeaderDisplayMode
#include <utest/ui/common/HeaderDisplayMode.h>
#endif
#ifndef INCLUDED_utest_ui_common_IReport
#include <utest/ui/common/IReport.h>
#endif
#ifndef INCLUDED_utest_ui_common_SuccessResultsDisplayMode
#include <utest/ui/common/SuccessResultsDisplayMode.h>
#endif


void TestAll_obj::__construct() { }

Dynamic TestAll_obj::__CreateEmpty() { return new TestAll_obj; }

hx::ObjectPtr< TestAll_obj > TestAll_obj::__new()
{
	hx::ObjectPtr< TestAll_obj > _hx_result = new TestAll_obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic TestAll_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< TestAll_obj > _hx_result = new TestAll_obj();
	_hx_result->__construct();
	return _hx_result;
}

void TestAll_obj::addTests( ::utest::Runner runner){
            	HX_STACK_FRAME("TestAll","addTests",0xcf57027f,"TestAll.addTests","TestAll.hx",5,0x4f103e4f)
            	HX_STACK_ARG(runner,"runner")
HXLINE(   6)		runner->addCase( ::thx::TestAnonymousMap_obj::__new(),null(),null(),null(),null());
HXLINE(   7)		runner->addCase( ::thx::TestArrays_obj::__new(),null(),null(),null(),null());
HXLINE(   8)		runner->addCase( ::thx::TestAssert_obj::__new(),null(),null(),null(),null());
HXLINE(   9)		runner->addCase( ::thx::TestBigInt_obj::__new(),null(),null(),null(),null());
HXLINE(  10)		runner->addCase( ::thx::TestBitMatrix_obj::__new(),null(),null(),null(),null());
HXLINE(  11)		runner->addCase( ::thx::TestBitSet_obj::__new(),null(),null(),null(),null());
HXLINE(  12)		runner->addCase( ::thx::TestChar_obj::__new(),null(),null(),null(),null());
HXLINE(  13)		runner->addCase( ::thx::TestChars_obj::__new(),null(),null(),null(),null());
HXLINE(  14)		runner->addCase( ::thx::TestConvert_obj::__new(),null(),null(),null(),null());
HXLINE(  15)		runner->addCase( ::thx::TestDates_obj::__new(),null(),null(),null(),null());
HXLINE(  16)		runner->addCase( ::thx::TestDateTime_obj::__new(),null(),null(),null(),null());
HXLINE(  17)		runner->addCase( ::thx::TestDateTimeUtc_obj::__new(),null(),null(),null(),null());
HXLINE(  18)		runner->addCase( ::thx::TestDecimal_obj::__new(),null(),null(),null(),null());
HXLINE(  19)		runner->addCase( ::thx::TestDynamics_obj::__new(),null(),null(),null(),null());
HXLINE(  20)		runner->addCase( ::thx::TestEffects_obj::__new(),null(),null(),null(),null());
HXLINE(  21)		runner->addCase( ::thx::TestEithers_obj::__new(),null(),null(),null(),null());
HXLINE(  22)		runner->addCase( ::thx::TestEnums_obj::__new(),null(),null(),null(),null());
HXLINE(  23)		runner->addCase( ::thx::TestERegs_obj::__new(),null(),null(),null(),null());
HXLINE(  24)		runner->addCase( ::thx::TestError_obj::__new(),null(),null(),null(),null());
HXLINE(  25)		runner->addCase( ::thx::TestFloats_obj::__new(),null(),null(),null(),null());
HXLINE(  26)		runner->addCase( ::thx::TestFunctions_obj::__new(),null(),null(),null(),null());
HXLINE(  27)		runner->addCase( ::thx::TestHashSet_obj::__new(),null(),null(),null(),null());
HXLINE(  28)		runner->addCase( ::thx::TestInt64s_obj::__new(),null(),null(),null(),null());
HXLINE(  29)		runner->addCase( ::thx::TestInts_obj::__new(),null(),null(),null(),null());
HXLINE(  30)		runner->addCase( ::thx::TestIterables_obj::__new(),null(),null(),null(),null());
HXLINE(  31)		runner->addCase( ::thx::TestIterators_obj::__new(),null(),null(),null(),null());
HXLINE(  32)		runner->addCase( ::thx::TestLocalDate_obj::__new(),null(),null(),null(),null());
HXLINE(  33)		runner->addCase( ::thx::TestOrderedMap_obj::__new(),null(),null(),null(),null());
HXLINE(  34)		runner->addCase( ::thx::TestOrderedSet_obj::__new(),null(),null(),null(),null());
HXLINE(  35)		runner->addCase( ::thx::TestMake_obj::__new(),null(),null(),null(),null());
HXLINE(  36)		runner->addCase( ::thx::TestNulls_obj::__new(),null(),null(),null(),null());
HXLINE(  37)		runner->addCase( ::thx::TestObjects_obj::__new(),null(),null(),null(),null());
HXLINE(  38)		runner->addCase( ::thx::TestPath_obj::__new(),null(),null(),null(),null());
HXLINE(  39)		runner->addCase( ::thx::TestRational_obj::__new(),null(),null(),null(),null());
HXLINE(  40)		runner->addCase( ::thx::TestReadonlyArray_obj::__new(),null(),null(),null(),null());
HXLINE(  41)		runner->addCase( ::thx::TestQueryString_obj::__new(),null(),null(),null(),null());
HXLINE(  42)		runner->addCase( ::thx::TestSet_obj::__new(),null(),null(),null(),null());
HXLINE(  43)		runner->addCase( ::thx::TestStaticResource_obj::__new(),null(),null(),null(),null());
HXLINE(  44)		runner->addCase( ::thx::TestStrings_obj::__new(),null(),null(),null(),null());
HXLINE(  45)		runner->addCase( ::thx::TestTime_obj::__new(),null(),null(),null(),null());
HXLINE(  46)		runner->addCase( ::thx::TestThx_obj::__new(),null(),null(),null(),null());
HXLINE(  47)		runner->addCase( ::thx::TestLambda_obj::__new(),null(),null(),null(),null());
HXLINE(  48)		runner->addCase( ::thx::TestLambdaStaticExtension_obj::__new(),null(),null(),null(),null());
HXLINE(  52)		runner->addCase( ::thx::TestTuple_obj::__new(),null(),null(),null(),null());
HXLINE(  53)		runner->addCase( ::thx::TestUrl_obj::__new(),null(),null(),null(),null());
HXLINE(  54)		runner->addCase( ::thx::TestValidation_obj::__new(),null(),null(),null(),null());
HXLINE(  56)		runner->addCase( ::thx::fp::TestList_obj::__new(),null(),null(),null(),null());
HXLINE(  57)		runner->addCase( ::thx::fp::TestMap_obj::__new(),null(),null(),null(),null());
HXLINE(  58)		runner->addCase( ::thx::fp::TestSet_obj::__new(),null(),null(),null(),null());
HXLINE(  59)		runner->addCase( ::thx::fp::TestState_obj::__new(),null(),null(),null(),null());
HXLINE(  60)		runner->addCase( ::thx::fp::TestWriter_obj::__new(),null(),null(),null(),null());
HXLINE(  61)		runner->addCase( ::thx::fp::TestTreeBag_obj::__new(),null(),null(),null(),null());
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(TestAll_obj,addTests,(void))

void TestAll_obj::main(){
            	HX_STACK_FRAME("TestAll","main",0x6594a938,"TestAll.main","TestAll.hx",64,0x4f103e4f)
HXLINE(  65)		HX_VARI(  ::utest::Runner,runner) =  ::utest::Runner_obj::__new();
HXLINE(  66)		::TestAll_obj::addTests(runner);
HXLINE(  67)		::utest::ui::Report_obj::create(runner,null(),null());
HXLINE(  68)		runner->run();
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC0(TestAll_obj,main,(void))


TestAll_obj::TestAll_obj()
{
}

bool TestAll_obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 4:
		if (HX_FIELD_EQ(inName,"main") ) { outValue = main_dyn(); return true; }
		break;
	case 8:
		if (HX_FIELD_EQ(inName,"addTests") ) { outValue = addTests_dyn(); return true; }
	}
	return false;
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *TestAll_obj_sMemberStorageInfo = 0;
static hx::StaticInfo *TestAll_obj_sStaticStorageInfo = 0;
#endif

static void TestAll_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(TestAll_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void TestAll_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(TestAll_obj::__mClass,"__mClass");
};

#endif

hx::Class TestAll_obj::__mClass;

static ::String TestAll_obj_sStaticFields[] = {
	HX_HCSTRING("addTests","\x00","\xa6","\xf2","\x86"),
	HX_HCSTRING("main","\x39","\x38","\x56","\x48"),
	::String(null())
};

void TestAll_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("TestAll","\xcf","\x8f","\x09","\x8b");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &TestAll_obj::__GetStatic;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = TestAll_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(TestAll_obj_sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< TestAll_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = TestAll_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = TestAll_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = TestAll_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

