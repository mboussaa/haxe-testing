// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_haxe_macro_Access
#include <haxe/macro/Access.h>
#endif
namespace haxe{
namespace macro{

::haxe::macro::Access Access_obj::ADynamic;

::haxe::macro::Access Access_obj::AInline;

::haxe::macro::Access Access_obj::AMacro;

::haxe::macro::Access Access_obj::AOverride;

::haxe::macro::Access Access_obj::APrivate;

::haxe::macro::Access Access_obj::APublic;

::haxe::macro::Access Access_obj::AStatic;

bool Access_obj::__GetStatic(const ::String &inName, ::Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	if (inName==HX_("ADynamic",3e,c1,35,89)) { outValue = Access_obj::ADynamic; return true; }
	if (inName==HX_("AInline",7a,65,c7,5c)) { outValue = Access_obj::AInline; return true; }
	if (inName==HX_("AMacro",0b,54,76,93)) { outValue = Access_obj::AMacro; return true; }
	if (inName==HX_("AOverride",ad,87,25,b2)) { outValue = Access_obj::AOverride; return true; }
	if (inName==HX_("APrivate",c2,4e,8f,dc)) { outValue = Access_obj::APrivate; return true; }
	if (inName==HX_("APublic",ca,1b,7b,2a)) { outValue = Access_obj::APublic; return true; }
	if (inName==HX_("AStatic",cf,77,83,c9)) { outValue = Access_obj::AStatic; return true; }
	return super::__GetStatic(inName, outValue, inCallProp);
}

HX_DEFINE_CREATE_ENUM(Access_obj)

int Access_obj::__FindIndex(::String inName)
{
	if (inName==HX_("ADynamic",3e,c1,35,89)) return 4;
	if (inName==HX_("AInline",7a,65,c7,5c)) return 5;
	if (inName==HX_("AMacro",0b,54,76,93)) return 6;
	if (inName==HX_("AOverride",ad,87,25,b2)) return 3;
	if (inName==HX_("APrivate",c2,4e,8f,dc)) return 1;
	if (inName==HX_("APublic",ca,1b,7b,2a)) return 0;
	if (inName==HX_("AStatic",cf,77,83,c9)) return 2;
	return super::__FindIndex(inName);
}

int Access_obj::__FindArgCount(::String inName)
{
	if (inName==HX_("ADynamic",3e,c1,35,89)) return 0;
	if (inName==HX_("AInline",7a,65,c7,5c)) return 0;
	if (inName==HX_("AMacro",0b,54,76,93)) return 0;
	if (inName==HX_("AOverride",ad,87,25,b2)) return 0;
	if (inName==HX_("APrivate",c2,4e,8f,dc)) return 0;
	if (inName==HX_("APublic",ca,1b,7b,2a)) return 0;
	if (inName==HX_("AStatic",cf,77,83,c9)) return 0;
	return super::__FindArgCount(inName);
}

hx::Val Access_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	if (inName==HX_("ADynamic",3e,c1,35,89)) return ADynamic;
	if (inName==HX_("AInline",7a,65,c7,5c)) return AInline;
	if (inName==HX_("AMacro",0b,54,76,93)) return AMacro;
	if (inName==HX_("AOverride",ad,87,25,b2)) return AOverride;
	if (inName==HX_("APrivate",c2,4e,8f,dc)) return APrivate;
	if (inName==HX_("APublic",ca,1b,7b,2a)) return APublic;
	if (inName==HX_("AStatic",cf,77,83,c9)) return AStatic;
	return super::__Field(inName,inCallProp);
}

static ::String Access_obj_sStaticFields[] = {
	HX_("APublic",ca,1b,7b,2a),
	HX_("APrivate",c2,4e,8f,dc),
	HX_("AStatic",cf,77,83,c9),
	HX_("AOverride",ad,87,25,b2),
	HX_("ADynamic",3e,c1,35,89),
	HX_("AInline",7a,65,c7,5c),
	HX_("AMacro",0b,54,76,93),
	::String(null())
};

static void Access_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(Access_obj::ADynamic,"ADynamic");
	HX_MARK_MEMBER_NAME(Access_obj::AInline,"AInline");
	HX_MARK_MEMBER_NAME(Access_obj::AMacro,"AMacro");
	HX_MARK_MEMBER_NAME(Access_obj::AOverride,"AOverride");
	HX_MARK_MEMBER_NAME(Access_obj::APrivate,"APrivate");
	HX_MARK_MEMBER_NAME(Access_obj::APublic,"APublic");
	HX_MARK_MEMBER_NAME(Access_obj::AStatic,"AStatic");
};

#ifdef HXCPP_VISIT_ALLOCS
static void Access_obj_sVisitStatic(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(Access_obj::__mClass,"__mClass");
	HX_VISIT_MEMBER_NAME(Access_obj::ADynamic,"ADynamic");
	HX_VISIT_MEMBER_NAME(Access_obj::AInline,"AInline");
	HX_VISIT_MEMBER_NAME(Access_obj::AMacro,"AMacro");
	HX_VISIT_MEMBER_NAME(Access_obj::AOverride,"AOverride");
	HX_VISIT_MEMBER_NAME(Access_obj::APrivate,"APrivate");
	HX_VISIT_MEMBER_NAME(Access_obj::APublic,"APublic");
	HX_VISIT_MEMBER_NAME(Access_obj::AStatic,"AStatic");
};
#endif

hx::Class Access_obj::__mClass;

Dynamic __Create_Access_obj() { return new Access_obj; }

void Access_obj::__register()
{

hx::Static(__mClass) = hx::_hx_RegisterClass(HX_HCSTRING("haxe.macro.Access","\x2e","\x83","\xa3","\x7d"), hx::TCanCast< Access_obj >,Access_obj_sStaticFields,0,
	&__Create_Access_obj, &__Create,
	&super::__SGetClass(), &CreateAccess_obj, Access_obj_sMarkStatics
#ifdef HXCPP_VISIT_ALLOCS
    , Access_obj_sVisitStatic
#endif
#ifdef HXCPP_SCRIPTABLE
    , 0
#endif
);
	__mClass->mGetStaticField = &Access_obj::__GetStatic;
}

void Access_obj::__boot()
{
ADynamic = hx::CreateEnum< Access_obj >(HX_HCSTRING("ADynamic","\x3e","\xc1","\x35","\x89"),4,0);
AInline = hx::CreateEnum< Access_obj >(HX_HCSTRING("AInline","\x7a","\x65","\xc7","\x5c"),5,0);
AMacro = hx::CreateEnum< Access_obj >(HX_HCSTRING("AMacro","\x0b","\x54","\x76","\x93"),6,0);
AOverride = hx::CreateEnum< Access_obj >(HX_HCSTRING("AOverride","\xad","\x87","\x25","\xb2"),3,0);
APrivate = hx::CreateEnum< Access_obj >(HX_HCSTRING("APrivate","\xc2","\x4e","\x8f","\xdc"),1,0);
APublic = hx::CreateEnum< Access_obj >(HX_HCSTRING("APublic","\xca","\x1b","\x7b","\x2a"),0,0);
AStatic = hx::CreateEnum< Access_obj >(HX_HCSTRING("AStatic","\xcf","\x77","\x83","\xc9"),2,0);
}


} // end namespace haxe
} // end namespace macro
