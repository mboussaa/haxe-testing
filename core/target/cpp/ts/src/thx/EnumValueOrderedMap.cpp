// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_haxe_IMap
#include <haxe/IMap.h>
#endif
#ifndef INCLUDED_haxe_ds_BalancedTree
#include <haxe/ds/BalancedTree.h>
#endif
#ifndef INCLUDED_haxe_ds_EnumValueMap
#include <haxe/ds/EnumValueMap.h>
#endif
#ifndef INCLUDED_thx_EnumValueOrderedMap
#include <thx/EnumValueOrderedMap.h>
#endif
#ifndef INCLUDED_thx_OrderedMapImpl
#include <thx/OrderedMapImpl.h>
#endif

namespace thx{

void EnumValueOrderedMap_obj::__construct(){
            	HX_STACK_FRAME("thx.EnumValueOrderedMap","new",0x48164367,"thx.EnumValueOrderedMap.new","thx/OrderedMap.hx",51,0x84082bc4)
            	HX_STACK_THIS(this)
HXLINE(  51)		super::__construct( ::haxe::ds::EnumValueMap_obj::__new());
            	}

Dynamic EnumValueOrderedMap_obj::__CreateEmpty() { return new EnumValueOrderedMap_obj; }

hx::ObjectPtr< EnumValueOrderedMap_obj > EnumValueOrderedMap_obj::__new()
{
	hx::ObjectPtr< EnumValueOrderedMap_obj > _hx_result = new EnumValueOrderedMap_obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic EnumValueOrderedMap_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< EnumValueOrderedMap_obj > _hx_result = new EnumValueOrderedMap_obj();
	_hx_result->__construct();
	return _hx_result;
}

 ::thx::OrderedMapImpl EnumValueOrderedMap_obj::empty(){
            	HX_STACK_FRAME("thx.EnumValueOrderedMap","empty",0x0364bd54,"thx.EnumValueOrderedMap.empty","thx/OrderedMap.hx",54,0x84082bc4)
            	HX_STACK_THIS(this)
HXLINE(  54)		return  ::thx::EnumValueOrderedMap_obj::__new();
            	}



EnumValueOrderedMap_obj::EnumValueOrderedMap_obj()
{
}

hx::Val EnumValueOrderedMap_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 5:
		if (HX_FIELD_EQ(inName,"empty") ) { return hx::Val( empty_dyn()); }
	}
	return super::__Field(inName,inCallProp);
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *EnumValueOrderedMap_obj_sMemberStorageInfo = 0;
static hx::StaticInfo *EnumValueOrderedMap_obj_sStaticStorageInfo = 0;
#endif

static ::String EnumValueOrderedMap_obj_sMemberFields[] = {
	HX_HCSTRING("empty","\x8d","\x3a","\xda","\x6f"),
	::String(null()) };

static void EnumValueOrderedMap_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(EnumValueOrderedMap_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void EnumValueOrderedMap_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(EnumValueOrderedMap_obj::__mClass,"__mClass");
};

#endif

hx::Class EnumValueOrderedMap_obj::__mClass;

void EnumValueOrderedMap_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.EnumValueOrderedMap","\xf5","\x03","\xf1","\x97");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &hx::Class_obj::GetNoStaticField;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = EnumValueOrderedMap_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(0 /* sStaticFields */);
	__mClass->mMembers = hx::Class_obj::dupFunctions(EnumValueOrderedMap_obj_sMemberFields);
	__mClass->mCanCast = hx::TCanCast< EnumValueOrderedMap_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = EnumValueOrderedMap_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = EnumValueOrderedMap_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = EnumValueOrderedMap_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx
