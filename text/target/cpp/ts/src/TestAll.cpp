// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_EReg
#include <EReg.h>
#endif
#ifndef INCLUDED_TestAll
#include <TestAll.h>
#endif
#ifndef INCLUDED_thx_text_TestInflections
#include <thx/text/TestInflections.h>
#endif
#ifndef INCLUDED_thx_text_TestTable
#include <thx/text/TestTable.h>
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
            	HX_STACK_FRAME("TestAll","addTests",0xcf57027f,"TestAll.addTests","TestAll.hx",16,0x4f103e4f)
            	HX_STACK_ARG(runner,"runner")
HXLINE(  17)		runner->addCase( ::thx::text::TestInflections_obj::__new(),null(),null(),null(),null());
HXLINE(  18)		runner->addCase( ::thx::text::TestTable_obj::__new(),null(),null(),null(),null());
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(TestAll_obj,addTests,(void))

void TestAll_obj::main(){
            	HX_STACK_FRAME("TestAll","main",0x6594a938,"TestAll.main","TestAll.hx",21,0x4f103e4f)
HXLINE(  22)		HX_VARI(  ::utest::Runner,runner) =  ::utest::Runner_obj::__new();
HXLINE(  23)		::TestAll_obj::addTests(runner);
HXLINE(  24)		::utest::ui::Report_obj::create(runner,null(),null());
HXLINE(  25)		runner->run();
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

