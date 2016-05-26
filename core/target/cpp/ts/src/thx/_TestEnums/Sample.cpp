// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_thx__TestEnums_Sample
#include <thx/_TestEnums/Sample.h>
#endif
namespace thx{
namespace _TestEnums{

::thx::_TestEnums::Sample Sample_obj::A;

::thx::_TestEnums::Sample Sample_obj::B(Int v)
{
	return hx::CreateEnum< Sample_obj >(HX_("B",42,00,00,00),1,1)->_hx_init(0,v);
}

bool Sample_obj::__GetStatic(const ::String &inName, ::Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	if (inName==HX_("A",41,00,00,00)) { outValue = Sample_obj::A; return true; }
	if (inName==HX_("B",42,00,00,00)) { outValue = Sample_obj::B_dyn(); return true; }
	return super::__GetStatic(inName, outValue, inCallProp);
}

HX_DEFINE_CREATE_ENUM(Sample_obj)

int Sample_obj::__FindIndex(::String inName)
{
	if (inName==HX_("A",41,00,00,00)) return 0;
	if (inName==HX_("B",42,00,00,00)) return 1;
	return super::__FindIndex(inName);
}

STATIC_HX_DEFINE_DYNAMIC_FUNC1(Sample_obj,B,return)

int Sample_obj::__FindArgCount(::String inName)
{
	if (inName==HX_("A",41,00,00,00)) return 0;
	if (inName==HX_("B",42,00,00,00)) return 1;
	return super::__FindArgCount(inName);
}

hx::Val Sample_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	if (inName==HX_("A",41,00,00,00)) return A;
	if (inName==HX_("B",42,00,00,00)) return B_dyn();
	return super::__Field(inName,inCallProp);
}

static ::String Sample_obj_sStaticFields[] = {
	HX_("A",41,00,00,00),
	HX_("B",42,00,00,00),
	::String(null())
};

static void Sample_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(Sample_obj::A,"A");
};

#ifdef HXCPP_VISIT_ALLOCS
static void Sample_obj_sVisitStatic(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(Sample_obj::__mClass,"__mClass");
	HX_VISIT_MEMBER_NAME(Sample_obj::A,"A");
};
#endif

hx::Class Sample_obj::__mClass;

Dynamic __Create_Sample_obj() { return new Sample_obj; }

void Sample_obj::__register()
{

hx::Static(__mClass) = hx::_hx_RegisterClass(HX_HCSTRING("thx._TestEnums.Sample","\x6d","\x12","\xa8","\xd8"), hx::TCanCast< Sample_obj >,Sample_obj_sStaticFields,0,
	&__Create_Sample_obj, &__Create,
	&super::__SGetClass(), &CreateSample_obj, Sample_obj_sMarkStatics
#ifdef HXCPP_VISIT_ALLOCS
    , Sample_obj_sVisitStatic
#endif
#ifdef HXCPP_SCRIPTABLE
    , 0
#endif
);
	__mClass->mGetStaticField = &Sample_obj::__GetStatic;
}

void Sample_obj::__boot()
{
A = hx::CreateEnum< Sample_obj >(HX_HCSTRING("A","\x41","\x00","\x00","\x00"),0,0);
}


} // end namespace thx
} // end namespace _TestEnums
