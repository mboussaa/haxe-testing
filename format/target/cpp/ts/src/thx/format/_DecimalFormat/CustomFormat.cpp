// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_thx_format__DecimalFormat_CustomFormat
#include <thx/format/_DecimalFormat/CustomFormat.h>
#endif
namespace thx{
namespace format{
namespace _DecimalFormat{

::thx::format::_DecimalFormat::CustomFormat CustomFormat_obj::Hash(Bool first)
{
	return hx::CreateEnum< CustomFormat_obj >(HX_("Hash",ee,5b,e1,2f),1,1)->_hx_init(0,first);
}

::thx::format::_DecimalFormat::CustomFormat CustomFormat_obj::Literal(::String s)
{
	return hx::CreateEnum< CustomFormat_obj >(HX_("Literal",4f,d1,6c,61),0,1)->_hx_init(0,s);
}

::thx::format::_DecimalFormat::CustomFormat CustomFormat_obj::Zero(Bool first)
{
	return hx::CreateEnum< CustomFormat_obj >(HX_("Zero",48,3b,ca,3b),2,1)->_hx_init(0,first);
}

bool CustomFormat_obj::__GetStatic(const ::String &inName, ::Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	if (inName==HX_("Hash",ee,5b,e1,2f)) { outValue = CustomFormat_obj::Hash_dyn(); return true; }
	if (inName==HX_("Literal",4f,d1,6c,61)) { outValue = CustomFormat_obj::Literal_dyn(); return true; }
	if (inName==HX_("Zero",48,3b,ca,3b)) { outValue = CustomFormat_obj::Zero_dyn(); return true; }
	return super::__GetStatic(inName, outValue, inCallProp);
}

HX_DEFINE_CREATE_ENUM(CustomFormat_obj)

int CustomFormat_obj::__FindIndex(::String inName)
{
	if (inName==HX_("Hash",ee,5b,e1,2f)) return 1;
	if (inName==HX_("Literal",4f,d1,6c,61)) return 0;
	if (inName==HX_("Zero",48,3b,ca,3b)) return 2;
	return super::__FindIndex(inName);
}

STATIC_HX_DEFINE_DYNAMIC_FUNC1(CustomFormat_obj,Hash,return)

STATIC_HX_DEFINE_DYNAMIC_FUNC1(CustomFormat_obj,Literal,return)

STATIC_HX_DEFINE_DYNAMIC_FUNC1(CustomFormat_obj,Zero,return)

int CustomFormat_obj::__FindArgCount(::String inName)
{
	if (inName==HX_("Hash",ee,5b,e1,2f)) return 1;
	if (inName==HX_("Literal",4f,d1,6c,61)) return 1;
	if (inName==HX_("Zero",48,3b,ca,3b)) return 1;
	return super::__FindArgCount(inName);
}

hx::Val CustomFormat_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	if (inName==HX_("Hash",ee,5b,e1,2f)) return Hash_dyn();
	if (inName==HX_("Literal",4f,d1,6c,61)) return Literal_dyn();
	if (inName==HX_("Zero",48,3b,ca,3b)) return Zero_dyn();
	return super::__Field(inName,inCallProp);
}

static ::String CustomFormat_obj_sStaticFields[] = {
	HX_("Literal",4f,d1,6c,61),
	HX_("Hash",ee,5b,e1,2f),
	HX_("Zero",48,3b,ca,3b),
	::String(null())
};

static void CustomFormat_obj_sMarkStatics(HX_MARK_PARAMS) {
};

#ifdef HXCPP_VISIT_ALLOCS
static void CustomFormat_obj_sVisitStatic(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(CustomFormat_obj::__mClass,"__mClass");
};
#endif

hx::Class CustomFormat_obj::__mClass;

Dynamic __Create_CustomFormat_obj() { return new CustomFormat_obj; }

void CustomFormat_obj::__register()
{

hx::Static(__mClass) = hx::_hx_RegisterClass(HX_HCSTRING("thx.format._DecimalFormat.CustomFormat","\xa0","\xee","\xf4","\xa9"), hx::TCanCast< CustomFormat_obj >,CustomFormat_obj_sStaticFields,0,
	&__Create_CustomFormat_obj, &__Create,
	&super::__SGetClass(), &CreateCustomFormat_obj, CustomFormat_obj_sMarkStatics
#ifdef HXCPP_VISIT_ALLOCS
    , CustomFormat_obj_sVisitStatic
#endif
#ifdef HXCPP_SCRIPTABLE
    , 0
#endif
);
	__mClass->mGetStaticField = &CustomFormat_obj::__GetStatic;
}

void CustomFormat_obj::__boot()
{
}


} // end namespace thx
} // end namespace format
} // end namespace _DecimalFormat
