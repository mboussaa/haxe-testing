// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_thx_fp_ListImpl
#include <thx/fp/ListImpl.h>
#endif
#ifndef INCLUDED_thx_fp_StringList
#include <thx/fp/StringList.h>
#endif
#ifndef INCLUDED_thx_fp__List_List_Impl_
#include <thx/fp/_List/List_Impl_.h>
#endif

namespace thx{
namespace fp{

void StringList_obj::__construct() { }

Dynamic StringList_obj::__CreateEmpty() { return new StringList_obj; }

hx::ObjectPtr< StringList_obj > StringList_obj::__new()
{
	hx::ObjectPtr< StringList_obj > _hx_result = new StringList_obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic StringList_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< StringList_obj > _hx_result = new StringList_obj();
	_hx_result->__construct();
	return _hx_result;
}

::String StringList_obj::toString(::hx::EnumBase l){
            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_0) HXARGC(2)
            		::String _hx_run(::String _0,::String _1){
            			HX_STACK_FRAME("thx.fp.StringList","toString",0x35521891,"thx.fp.StringList.toString","thx/macro/lambda/SlambdaMacro.hx",86,0x8ba75432)
            			HX_STACK_ARG(_0,"_0")
            			HX_STACK_ARG(_1,"_1")
HXLINE(  86)			return (_0 + _1);
            		}
            		HX_END_LOCAL_FUNC2(return)

            	HX_STACK_FRAME("thx.fp.StringList","toString",0x35521891,"thx.fp.StringList.toString","thx/fp/Lists.hx",8,0xab47d703)
            	HX_STACK_ARG(l,"l")
HXLINE(   8)		::hx::EnumBase _hx_tmp = ::thx::fp::_List::List_Impl__obj::intersperse(l,HX_(",",2c,00,00,00));
HXDLIN(   8)		::String _hx_tmp1 = ( (::String)(::thx::fp::_List::List_Impl__obj::foldLeft(_hx_tmp,HX_("",00,00,00,00), ::Dynamic(new _hx_Closure_0()))) );
HXDLIN(   8)		return ((HX_("[",5b,00,00,00) + _hx_tmp1) + HX_("]",5d,00,00,00));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(StringList_obj,toString,return )


StringList_obj::StringList_obj()
{
}

bool StringList_obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 8:
		if (HX_FIELD_EQ(inName,"toString") ) { outValue = toString_dyn(); return true; }
	}
	return false;
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *StringList_obj_sMemberStorageInfo = 0;
static hx::StaticInfo *StringList_obj_sStaticStorageInfo = 0;
#endif

static void StringList_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(StringList_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void StringList_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(StringList_obj::__mClass,"__mClass");
};

#endif

hx::Class StringList_obj::__mClass;

static ::String StringList_obj_sStaticFields[] = {
	HX_HCSTRING("toString","\xac","\xd0","\x6e","\x38"),
	::String(null())
};

void StringList_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.fp.StringList","\x29","\xa9","\xed","\xb9");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &StringList_obj::__GetStatic;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = StringList_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(StringList_obj_sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< StringList_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = StringList_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = StringList_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = StringList_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx
} // end namespace fp
