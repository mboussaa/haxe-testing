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
#ifndef INCLUDED_TS10
#include <TS10.h>
#endif
#ifndef INCLUDED_haxe_Log
#include <haxe/Log.h>
#endif
#ifndef INCLUDED_thx_color_TestGrey
#include <thx/color/TestGrey.h>
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


void TS10_obj::__construct() { }

Dynamic TS10_obj::__CreateEmpty() { return new TS10_obj; }

hx::ObjectPtr< TS10_obj > TS10_obj::__new()
{
	hx::ObjectPtr< TS10_obj > _hx_result = new TS10_obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic TS10_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< TS10_obj > _hx_result = new TS10_obj();
	_hx_result->__construct();
	return _hx_result;
}

void TS10_obj::addTests( ::utest::Runner runner){
            	HX_STACK_FRAME("TS10","addTests",0x5b163e50,"TS10.addTests","TS10.hx",7,0x2b29d760)
            	HX_STACK_ARG(runner,"runner")
HXLINE(  14)		HX_VARI( ::String,w) = HX_("",00,00,00,00);
HXLINE(  15)		{
HXLINE(  15)			HX_VARI( Int,_g) = (int)0;
HXDLIN(  15)			HX_VARI( ::Array< ::String >,_g1) = ::Sys_obj::args();
HXDLIN(  15)			while((_g < _g1->length)){
HXLINE(  15)				HX_VARI( ::String,arg) = _g1->__get(_g);
HXDLIN(  15)				++_g;
HXLINE(  16)				w = arg;
            			}
            		}
HXLINE(  17)		::haxe::Log_obj::trace((HX_("The value of loop_wrapper is ",79,76,58,6c) + w),hx::SourceInfo(HX_("TS10.hx",60,d7,29,2b),17,HX_("TS10",1e,12,c5,37),HX_("addTests",00,a6,f2,86)));
HXLINE(  19)		HX_VARI( Int,x) = ::Std_obj::parseInt(w);
HXLINE(  20)		runner->addCase( ::thx::color::TestGrey_obj::__new(x),null(),null(),null(),null());
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(TS10_obj,addTests,(void))

void TS10_obj::main(){
            	HX_STACK_FRAME("TS10","main",0xae136889,"TS10.main","TS10.hx",23,0x2b29d760)
HXLINE(  25)		HX_VARI(  ::utest::Runner,runner) =  ::utest::Runner_obj::__new();
HXLINE(  26)		::TS10_obj::addTests(runner);
HXLINE(  27)		::utest::ui::Report_obj::create(runner,null(),null());
HXLINE(  28)		runner->run();
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC0(TS10_obj,main,(void))


TS10_obj::TS10_obj()
{
}

bool TS10_obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
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
static hx::StorageInfo *TS10_obj_sMemberStorageInfo = 0;
static hx::StaticInfo *TS10_obj_sStaticStorageInfo = 0;
#endif

static void TS10_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(TS10_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void TS10_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(TS10_obj::__mClass,"__mClass");
};

#endif

hx::Class TS10_obj::__mClass;

static ::String TS10_obj_sStaticFields[] = {
	HX_HCSTRING("addTests","\x00","\xa6","\xf2","\x86"),
	HX_HCSTRING("main","\x39","\x38","\x56","\x48"),
	::String(null())
};

void TS10_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("TS10","\x1e","\x12","\xc5","\x37");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &TS10_obj::__GetStatic;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = TS10_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(TS10_obj_sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< TS10_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = TS10_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = TS10_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = TS10_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}
