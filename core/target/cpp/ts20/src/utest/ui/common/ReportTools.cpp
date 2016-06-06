// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_utest_ui_common_HeaderDisplayMode
#include <utest/ui/common/HeaderDisplayMode.h>
#endif
#ifndef INCLUDED_utest_ui_common_IReport
#include <utest/ui/common/IReport.h>
#endif
#ifndef INCLUDED_utest_ui_common_ReportTools
#include <utest/ui/common/ReportTools.h>
#endif
#ifndef INCLUDED_utest_ui_common_ResultStats
#include <utest/ui/common/ResultStats.h>
#endif
#ifndef INCLUDED_utest_ui_common_SuccessResultsDisplayMode
#include <utest/ui/common/SuccessResultsDisplayMode.h>
#endif

namespace utest{
namespace ui{
namespace common{

void ReportTools_obj::__construct() { }

Dynamic ReportTools_obj::__CreateEmpty() { return new ReportTools_obj; }

hx::ObjectPtr< ReportTools_obj > ReportTools_obj::__new()
{
	hx::ObjectPtr< ReportTools_obj > _hx_result = new ReportTools_obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic ReportTools_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< ReportTools_obj > _hx_result = new ReportTools_obj();
	_hx_result->__construct();
	return _hx_result;
}

Bool ReportTools_obj::hasHeader(::Dynamic report, ::utest::ui::common::ResultStats stats){
            	HX_STACK_FRAME("utest.ui.common.ReportTools","hasHeader",0xa4a239b0,"utest.ui.common.ReportTools.hasHeader","utest/ui/common/ReportTools.hx",9,0xa50477e8)
            	HX_STACK_ARG(report,"report")
            	HX_STACK_ARG(stats,"stats")
HXLINE(   9)		Int _hx_tmp = ( ( ::hx::EnumBase)(report->__Field(HX_("displayHeader",6f,c5,62,be),hx::paccDynamic)) )->_hx_getIndex();
HXDLIN(   9)		switch((int)(_hx_tmp)){
            			case (int)0: {
HXLINE(  24)				return true;
            			}
            			break;
            			case (int)1: {
HXLINE(  12)				return false;
            			}
            			break;
            			case (int)2: {
HXLINE(  14)				if (!(stats->isOk)) {
HXLINE(  15)					return true;
            				}
HXLINE(  16)				Int _hx_tmp1 = ( ( ::hx::EnumBase)(report->__Field(HX_("displaySuccessResults",55,57,3a,a6),hx::paccDynamic)) )->_hx_getIndex();
HXDLIN(  16)				switch((int)(_hx_tmp1)){
            					case (int)0: case (int)2: {
HXLINE(  21)						return true;
            					}
            					break;
            					case (int)1: {
HXLINE(  19)						return false;
            					}
            					break;
            				}
            			}
            			break;
            		}
HXLINE(   9)		return false;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(ReportTools_obj,hasHeader,return )

Bool ReportTools_obj::skipResult(::Dynamic report, ::utest::ui::common::ResultStats stats,Bool isOk){
            	HX_STACK_FRAME("utest.ui.common.ReportTools","skipResult",0xec1c6373,"utest.ui.common.ReportTools.skipResult","utest/ui/common/ReportTools.hx",29,0xa50477e8)
            	HX_STACK_ARG(report,"report")
            	HX_STACK_ARG(stats,"stats")
            	HX_STACK_ARG(isOk,"isOk")
HXLINE(  30)		if (!(stats->isOk)) {
HXLINE(  30)			return false;
            		}
HXLINE(  31)		Int _hx_tmp = ( ( ::hx::EnumBase)(report->__Field(HX_("displaySuccessResults",55,57,3a,a6),hx::paccDynamic)) )->_hx_getIndex();
HXDLIN(  31)		switch((int)(_hx_tmp)){
            			case (int)0: {
HXLINE(  31)				return false;
            			}
            			break;
            			case (int)1: {
HXLINE(  31)				return true;
            			}
            			break;
            			case (int)2: {
HXLINE(  31)				return !(isOk);
            			}
            			break;
            		}
HXDLIN(  31)		return false;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(ReportTools_obj,skipResult,return )

Bool ReportTools_obj::hasOutput(::Dynamic report, ::utest::ui::common::ResultStats stats){
            	HX_STACK_FRAME("utest.ui.common.ReportTools","hasOutput",0xb4233f24,"utest.ui.common.ReportTools.hasOutput","utest/ui/common/ReportTools.hx",40,0xa50477e8)
            	HX_STACK_ARG(report,"report")
            	HX_STACK_ARG(stats,"stats")
HXLINE(  41)		if (!(stats->isOk)) {
HXLINE(  41)			return true;
            		}
HXLINE(  42)		return ::utest::ui::common::ReportTools_obj::hasHeader(report,stats);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(ReportTools_obj,hasOutput,return )


ReportTools_obj::ReportTools_obj()
{
}

bool ReportTools_obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 9:
		if (HX_FIELD_EQ(inName,"hasHeader") ) { outValue = hasHeader_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"hasOutput") ) { outValue = hasOutput_dyn(); return true; }
		break;
	case 10:
		if (HX_FIELD_EQ(inName,"skipResult") ) { outValue = skipResult_dyn(); return true; }
	}
	return false;
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *ReportTools_obj_sMemberStorageInfo = 0;
static hx::StaticInfo *ReportTools_obj_sStaticStorageInfo = 0;
#endif

static void ReportTools_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(ReportTools_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void ReportTools_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(ReportTools_obj::__mClass,"__mClass");
};

#endif

hx::Class ReportTools_obj::__mClass;

static ::String ReportTools_obj_sStaticFields[] = {
	HX_HCSTRING("hasHeader","\x87","\xbc","\xe8","\x3d"),
	HX_HCSTRING("skipResult","\xbc","\x5c","\x88","\x70"),
	HX_HCSTRING("hasOutput","\xfb","\xc1","\x69","\x4d"),
	::String(null())
};

void ReportTools_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("utest.ui.common.ReportTools","\x57","\x80","\xe1","\x94");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &ReportTools_obj::__GetStatic;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = ReportTools_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(ReportTools_obj_sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< ReportTools_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = ReportTools_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = ReportTools_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = ReportTools_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace utest
} // end namespace ui
} // end namespace common