// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_thx_culture_Embed
#include <thx/culture/Embed.h>
#endif

namespace thx{
namespace culture{

void Embed_obj::__construct() { }

Dynamic Embed_obj::__CreateEmpty() { return new Embed_obj; }

hx::ObjectPtr< Embed_obj > Embed_obj::__new()
{
	hx::ObjectPtr< Embed_obj > _hx_result = new Embed_obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic Embed_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< Embed_obj > _hx_result = new Embed_obj();
	_hx_result->__construct();
	return _hx_result;
}


Embed_obj::Embed_obj()
{
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *Embed_obj_sMemberStorageInfo = 0;
static hx::StaticInfo *Embed_obj_sStaticStorageInfo = 0;
#endif

static void Embed_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(Embed_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void Embed_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(Embed_obj::__mClass,"__mClass");
};

#endif

hx::Class Embed_obj::__mClass;

void Embed_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.culture.Embed","\xcf","\x2d","\xd0","\x48");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &hx::Class_obj::GetNoStaticField;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = Embed_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(0 /* sStaticFields */);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< Embed_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = Embed_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = Embed_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = Embed_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx
} // end namespace culture
