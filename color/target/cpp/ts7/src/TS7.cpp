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
#ifndef INCLUDED_TS7
#include <TS7.h>
#endif
#ifndef INCLUDED_haxe_Log
#include <haxe/Log.h>
#endif
#ifndef INCLUDED_thx_color_TestCmy
#include <thx/color/TestCmy.h>
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


void TS7_obj::__construct() { }

Dynamic TS7_obj::__CreateEmpty() { return new TS7_obj; }

hx::ObjectPtr< TS7_obj > TS7_obj::__new()
{
	hx::ObjectPtr< TS7_obj > _hx_result = new TS7_obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic TS7_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< TS7_obj > _hx_result = new TS7_obj();
	_hx_result->__construct();
	return _hx_result;
}

void TS7_obj::addTests( ::utest::Runner runner){
            	HX_STACK_FRAME("TS7","addTests",0x19400356,"TS7.addTests","TS7.hx",7,0x84ba73e6)
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
HXLINE(  17)		::haxe::Log_obj::trace((HX_("The value of loop_wrapper is ",79,76,58,6c) + w),hx::SourceInfo(HX_("TS7.hx",e6,73,ba,84),17,HX_("TS7",d8,05,40,00),HX_("addTests",00,a6,f2,86)));
HXLINE(  19)		HX_VARI( Int,x) = ::Std_obj::parseInt(w);
HXLINE(  20)		runner->addCase( ::thx::color::TestCmy_obj::__new(x),null(),null(),null(),null());
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(TS7_obj,addTests,(void))

void TS7_obj::main(){
            	HX_STACK_FRAME("TS7","main",0x0268b28f,"TS7.main","TS7.hx",23,0x84ba73e6)
HXLINE(  25)		HX_VARI(  ::utest::Runner,runner) =  ::utest::Runner_obj::__new();
HXLINE(  26)		::TS7_obj::addTests(runner);
HXLINE(  27)		::utest::ui::Report_obj::create(runner,null(),null());
HXLINE(  28)		runner->run();
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC0(TS7_obj,main,(void))


TS7_obj::TS7_obj()
{
}

bool TS7_obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
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
static hx::StorageInfo *TS7_obj_sMemberStorageInfo = 0;
static hx::StaticInfo *TS7_obj_sStaticStorageInfo = 0;
#endif

static void TS7_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(TS7_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void TS7_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(TS7_obj::__mClass,"__mClass");
};

#endif

hx::Class TS7_obj::__mClass;

static ::String TS7_obj_sStaticFields[] = {
	HX_HCSTRING("addTests","\x00","\xa6","\xf2","\x86"),
	HX_HCSTRING("main","\x39","\x38","\x56","\x48"),
	::String(null())
};

void TS7_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("TS7","\xd8","\x05","\x40","\x00");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &TS7_obj::__GetStatic;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = TS7_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(TS7_obj_sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< TS7_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = TS7_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = TS7_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = TS7_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}
