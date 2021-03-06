// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_EReg
#include <EReg.h>
#endif
#ifndef INCLUDED_Std
#include <Std.h>
#endif
#ifndef INCLUDED_Sys
#include <Sys.h>
#endif
#ifndef INCLUDED_TS3
#include <TS3.h>
#endif
#ifndef INCLUDED_haxe_Log
#include <haxe/Log.h>
#endif
#ifndef INCLUDED_thx_speedTest_TestArrayFill
#include <thx/speedTest/TestArrayFill.h>
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


void TS3_obj::__construct() { }

Dynamic TS3_obj::__CreateEmpty() { return new TS3_obj; }

hx::ObjectPtr< TS3_obj > TS3_obj::__new()
{
	hx::ObjectPtr< TS3_obj > _hx_result = new TS3_obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic TS3_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< TS3_obj > _hx_result = new TS3_obj();
	_hx_result->__construct();
	return _hx_result;
}

void TS3_obj::addTests( ::utest::Runner runner){
            	HX_STACK_FRAME("TS3","addTests",0x181623da,"TS3.addTests","TS3.hx",6,0x8215996a)
            	HX_STACK_ARG(runner,"runner")
HXLINE(   7)		HX_VARI( ::String,w) = HX_("",00,00,00,00);
HXLINE(   8)		{
HXLINE(   8)			HX_VARI( Int,_g) = (int)0;
HXDLIN(   8)			HX_VARI( ::Array< ::String >,_g1) = ::Sys_obj::args();
HXDLIN(   8)			while((_g < _g1->length)){
HXLINE(   8)				HX_VARI( ::String,arg) = _g1->__get(_g);
HXDLIN(   8)				++_g;
HXLINE(   9)				w = arg;
            			}
            		}
HXLINE(  10)		::haxe::Log_obj::trace((HX_("The value of loop_wrapper is ",79,76,58,6c) + w),hx::SourceInfo(HX_("TS3.hx",6a,99,15,82),10,HX_("TS3",d4,05,40,00),HX_("addTests",00,a6,f2,86)));
HXLINE(  12)		HX_VARI( Int,x) = ::Std_obj::parseInt(w);
HXLINE(  13)		runner->addCase( ::thx::speedTest::TestArrayFill_obj::__new(x),null(),null(),null(),null());
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(TS3_obj,addTests,(void))

void TS3_obj::main(){
            	HX_STACK_FRAME("TS3","main",0x68fb4113,"TS3.main","TS3.hx",16,0x8215996a)
HXLINE(  18)		HX_VARI(  ::utest::Runner,runner) =  ::utest::Runner_obj::__new();
HXLINE(  19)		::TS3_obj::addTests(runner);
HXLINE(  20)		::utest::ui::Report_obj::create(runner,null(),null());
HXLINE(  21)		runner->run();
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC0(TS3_obj,main,(void))


TS3_obj::TS3_obj()
{
}

bool TS3_obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
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
static hx::StorageInfo *TS3_obj_sMemberStorageInfo = 0;
static hx::StaticInfo *TS3_obj_sStaticStorageInfo = 0;
#endif

static void TS3_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(TS3_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void TS3_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(TS3_obj::__mClass,"__mClass");
};

#endif

hx::Class TS3_obj::__mClass;

static ::String TS3_obj_sStaticFields[] = {
	HX_HCSTRING("addTests","\x00","\xa6","\xf2","\x86"),
	HX_HCSTRING("main","\x39","\x38","\x56","\x48"),
	::String(null())
};

void TS3_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("TS3","\xd4","\x05","\x40","\x00");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &TS3_obj::__GetStatic;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = TS3_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(TS3_obj_sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< TS3_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = TS3_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = TS3_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = TS3_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

