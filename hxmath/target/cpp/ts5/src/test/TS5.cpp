// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_nanotest_NanoTestCase
#include <nanotest/NanoTestCase.h>
#endif
#ifndef INCLUDED_nanotest_NanoTestRunner
#include <nanotest/NanoTestRunner.h>
#endif
#ifndef INCLUDED_test_MathTestCase
#include <test/MathTestCase.h>
#endif
#ifndef INCLUDED_test_TS5
#include <test/TS5.h>
#endif
#ifndef INCLUDED_test_TestConverters
#include <test/TestConverters.h>
#endif

namespace test{

void TS5_obj::__construct() { }

Dynamic TS5_obj::__CreateEmpty() { return new TS5_obj; }

hx::ObjectPtr< TS5_obj > TS5_obj::__new()
{
	hx::ObjectPtr< TS5_obj > _hx_result = new TS5_obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic TS5_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< TS5_obj > _hx_result = new TS5_obj();
	_hx_result->__construct();
	return _hx_result;
}

Bool TS5_obj::main(){
            	HX_STACK_FRAME("test.TS5","main",0xae7a756d,"test.TS5.main","test/TS5.hx",11,0x15509a05)
HXLINE(  12)		HX_VARI(  ::nanotest::NanoTestRunner,runner) =  ::nanotest::NanoTestRunner_obj::__new(null());
HXLINE(  25)		runner->add( ::test::TestConverters_obj::__new());
HXLINE(  37)		return runner->run();
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC0(TS5_obj,main,return )


TS5_obj::TS5_obj()
{
}

bool TS5_obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 4:
		if (HX_FIELD_EQ(inName,"main") ) { outValue = main_dyn(); return true; }
	}
	return false;
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *TS5_obj_sMemberStorageInfo = 0;
static hx::StaticInfo *TS5_obj_sStaticStorageInfo = 0;
#endif

static void TS5_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(TS5_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void TS5_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(TS5_obj::__mClass,"__mClass");
};

#endif

hx::Class TS5_obj::__mClass;

static ::String TS5_obj_sStaticFields[] = {
	HX_HCSTRING("main","\x39","\x38","\x56","\x48"),
	::String(null())
};

void TS5_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("test.TS5","\xba","\x2f","\x01","\x37");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &TS5_obj::__GetStatic;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = TS5_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(TS5_obj_sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< TS5_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = TS5_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = TS5_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = TS5_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace test
