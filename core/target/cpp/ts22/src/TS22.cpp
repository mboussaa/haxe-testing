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
#ifndef INCLUDED_TS22
#include <TS22.h>
#endif
#ifndef INCLUDED_haxe_Log
#include <haxe/Log.h>
#endif
#ifndef INCLUDED_thx_TestHashSet
#include <thx/TestHashSet.h>
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


void TS22_obj::__construct() { }

Dynamic TS22_obj::__CreateEmpty() { return new TS22_obj; }

hx::ObjectPtr< TS22_obj > TS22_obj::__new()
{
	hx::ObjectPtr< TS22_obj > _hx_result = new TS22_obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic TS22_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< TS22_obj > _hx_result = new TS22_obj();
	_hx_result->__construct();
	return _hx_result;
}

void TS22_obj::addTests( ::utest::Runner runner){
            	HX_STACK_FRAME("TS22","addTests",0x5c89994f,"TS22.addTests","TS22.hx",5,0xbfe2d91f)
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
HXLINE(  10)		::haxe::Log_obj::trace((HX_("The value of loop_wrapper is ",79,76,58,6c) + w),hx::SourceInfo(HX_("TS22.hx",1f,d9,e2,bf),10,HX_("TS22",ff,12,c5,37),HX_("addTests",00,a6,f2,86)));
HXLINE(  12)		HX_VARI( Int,x) = ::Std_obj::parseInt(w);
HXLINE(  34)		runner->addCase( ::thx::TestHashSet_obj::__new(x),null(),null(),null(),null());
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(TS22_obj,addTests,(void))

void TS22_obj::main(){
            	HX_STACK_FRAME("TS22","main",0xa45f9808,"TS22.main","TS22.hx",72,0xbfe2d91f)
HXLINE(  73)		HX_VARI(  ::utest::Runner,runner) =  ::utest::Runner_obj::__new();
HXLINE(  74)		::TS22_obj::addTests(runner);
HXLINE(  75)		::utest::ui::Report_obj::create(runner,null(),null());
HXLINE(  76)		runner->run();
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC0(TS22_obj,main,(void))


TS22_obj::TS22_obj()
{
}

bool TS22_obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
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
static hx::StorageInfo *TS22_obj_sMemberStorageInfo = 0;
static hx::StaticInfo *TS22_obj_sStaticStorageInfo = 0;
#endif

static void TS22_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(TS22_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void TS22_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(TS22_obj::__mClass,"__mClass");
};

#endif

hx::Class TS22_obj::__mClass;

static ::String TS22_obj_sStaticFields[] = {
	HX_HCSTRING("addTests","\x00","\xa6","\xf2","\x86"),
	HX_HCSTRING("main","\x39","\x38","\x56","\x48"),
	::String(null())
};

void TS22_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("TS22","\xff","\x12","\xc5","\x37");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &TS22_obj::__GetStatic;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = TS22_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(TS22_obj_sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< TS22_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = TS22_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = TS22_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = TS22_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}
