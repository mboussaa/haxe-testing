// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_haxe_macro_ImportMode
#include <haxe/macro/ImportMode.h>
#endif
namespace haxe{
namespace macro{

::haxe::macro::ImportMode ImportMode_obj::IAll;

::haxe::macro::ImportMode ImportMode_obj::IAsName(::String alias)
{
	return hx::CreateEnum< ImportMode_obj >(HX_("IAsName",86,a5,be,43),1,1)->_hx_init(0,alias);
}

::haxe::macro::ImportMode ImportMode_obj::INormal;

bool ImportMode_obj::__GetStatic(const ::String &inName, ::Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	if (inName==HX_("IAll",58,44,72,30)) { outValue = ImportMode_obj::IAll; return true; }
	if (inName==HX_("IAsName",86,a5,be,43)) { outValue = ImportMode_obj::IAsName_dyn(); return true; }
	if (inName==HX_("INormal",50,c3,9c,40)) { outValue = ImportMode_obj::INormal; return true; }
	return super::__GetStatic(inName, outValue, inCallProp);
}

HX_DEFINE_CREATE_ENUM(ImportMode_obj)

int ImportMode_obj::__FindIndex(::String inName)
{
	if (inName==HX_("IAll",58,44,72,30)) return 2;
	if (inName==HX_("IAsName",86,a5,be,43)) return 1;
	if (inName==HX_("INormal",50,c3,9c,40)) return 0;
	return super::__FindIndex(inName);
}

STATIC_HX_DEFINE_DYNAMIC_FUNC1(ImportMode_obj,IAsName,return)

int ImportMode_obj::__FindArgCount(::String inName)
{
	if (inName==HX_("IAll",58,44,72,30)) return 0;
	if (inName==HX_("IAsName",86,a5,be,43)) return 1;
	if (inName==HX_("INormal",50,c3,9c,40)) return 0;
	return super::__FindArgCount(inName);
}

hx::Val ImportMode_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	if (inName==HX_("IAll",58,44,72,30)) return IAll;
	if (inName==HX_("IAsName",86,a5,be,43)) return IAsName_dyn();
	if (inName==HX_("INormal",50,c3,9c,40)) return INormal;
	return super::__Field(inName,inCallProp);
}

static ::String ImportMode_obj_sStaticFields[] = {
	HX_("INormal",50,c3,9c,40),
	HX_("IAsName",86,a5,be,43),
	HX_("IAll",58,44,72,30),
	::String(null())
};

static void ImportMode_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(ImportMode_obj::IAll,"IAll");
	HX_MARK_MEMBER_NAME(ImportMode_obj::INormal,"INormal");
};

#ifdef HXCPP_VISIT_ALLOCS
static void ImportMode_obj_sVisitStatic(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(ImportMode_obj::__mClass,"__mClass");
	HX_VISIT_MEMBER_NAME(ImportMode_obj::IAll,"IAll");
	HX_VISIT_MEMBER_NAME(ImportMode_obj::INormal,"INormal");
};
#endif

hx::Class ImportMode_obj::__mClass;

Dynamic __Create_ImportMode_obj() { return new ImportMode_obj; }

void ImportMode_obj::__register()
{

hx::Static(__mClass) = hx::_hx_RegisterClass(HX_HCSTRING("haxe.macro.ImportMode","\xf2","\x31","\xfd","\xac"), hx::TCanCast< ImportMode_obj >,ImportMode_obj_sStaticFields,0,
	&__Create_ImportMode_obj, &__Create,
	&super::__SGetClass(), &CreateImportMode_obj, ImportMode_obj_sMarkStatics
#ifdef HXCPP_VISIT_ALLOCS
    , ImportMode_obj_sVisitStatic
#endif
#ifdef HXCPP_SCRIPTABLE
    , 0
#endif
);
	__mClass->mGetStaticField = &ImportMode_obj::__GetStatic;
}

void ImportMode_obj::__boot()
{
IAll = hx::CreateEnum< ImportMode_obj >(HX_HCSTRING("IAll","\x58","\x44","\x72","\x30"),2,0);
INormal = hx::CreateEnum< ImportMode_obj >(HX_HCSTRING("INormal","\x50","\xc3","\x9c","\x40"),0,0);
}


} // end namespace haxe
} // end namespace macro
