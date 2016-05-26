// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_thx_Floats
#include <thx/Floats.h>
#endif
#ifndef INCLUDED_thx_OrderingImpl
#include <thx/OrderingImpl.h>
#endif
#ifndef INCLUDED_thx__Ord_Ord_Impl_
#include <thx/_Ord/Ord_Impl_.h>
#endif
#ifndef INCLUDED_thx_fp_FloatSet
#include <thx/fp/FloatSet.h>
#endif
#ifndef INCLUDED_thx_fp_SetImpl
#include <thx/fp/SetImpl.h>
#endif
#ifndef INCLUDED_thx_fp__Set_Set_Impl_
#include <thx/fp/_Set/Set_Impl_.h>
#endif

namespace thx{
namespace fp{

void FloatSet_obj::__construct() { }

Dynamic FloatSet_obj::__CreateEmpty() { return new FloatSet_obj; }

hx::ObjectPtr< FloatSet_obj > FloatSet_obj::__new()
{
	hx::ObjectPtr< FloatSet_obj > _hx_result = new FloatSet_obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic FloatSet_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< FloatSet_obj > _hx_result = new FloatSet_obj();
	_hx_result->__construct();
	return _hx_result;
}

Bool FloatSet_obj::exists(::hx::EnumBase set,Float value){
            	HX_STACK_FRAME("thx.fp.FloatSet","exists",0x9175744a,"thx.fp.FloatSet.exists","thx/fp/Sets.hx",15,0x62fd8693)
            	HX_STACK_ARG(set,"set")
            	HX_STACK_ARG(value,"value")
HXLINE(  15)		 ::Dynamic _hx_tmp = ::thx::_Ord::Ord_Impl__obj::fromIntComparison(::thx::Floats_obj::compare_dyn());
HXDLIN(  15)		return ::thx::fp::_Set::Set_Impl__obj::member(set,value,_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(FloatSet_obj,exists,return )

::hx::EnumBase FloatSet_obj::set(::hx::EnumBase set,Float value){
            	HX_STACK_FRAME("thx.fp.FloatSet","set",0x57ac1474,"thx.fp.FloatSet.set","thx/fp/Sets.hx",18,0x62fd8693)
            	HX_STACK_ARG(set,"set")
            	HX_STACK_ARG(value,"value")
HXLINE(  18)		 ::Dynamic _hx_tmp = ::thx::_Ord::Ord_Impl__obj::fromIntComparison(::thx::Floats_obj::compare_dyn());
HXDLIN(  18)		return ::thx::fp::_Set::Set_Impl__obj::insert(set,value,_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(FloatSet_obj,set,return )


FloatSet_obj::FloatSet_obj()
{
}

bool FloatSet_obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 3:
		if (HX_FIELD_EQ(inName,"set") ) { outValue = set_dyn(); return true; }
		break;
	case 6:
		if (HX_FIELD_EQ(inName,"exists") ) { outValue = exists_dyn(); return true; }
	}
	return false;
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *FloatSet_obj_sMemberStorageInfo = 0;
static hx::StaticInfo *FloatSet_obj_sStaticStorageInfo = 0;
#endif

static void FloatSet_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(FloatSet_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void FloatSet_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(FloatSet_obj::__mClass,"__mClass");
};

#endif

hx::Class FloatSet_obj::__mClass;

static ::String FloatSet_obj_sStaticFields[] = {
	HX_HCSTRING("exists","\xdc","\x1d","\xe0","\xbf"),
	HX_HCSTRING("set","\xa2","\x9b","\x57","\x00"),
	::String(null())
};

void FloatSet_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.fp.FloatSet","\x40","\x88","\xe3","\x32");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &FloatSet_obj::__GetStatic;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = FloatSet_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(FloatSet_obj_sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< FloatSet_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = FloatSet_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = FloatSet_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = FloatSet_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx
} // end namespace fp
