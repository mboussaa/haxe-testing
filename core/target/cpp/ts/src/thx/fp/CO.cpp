// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_haxe_Utf8
#include <haxe/Utf8.h>
#endif
#ifndef INCLUDED_thx_OrderingImpl
#include <thx/OrderingImpl.h>
#endif
#ifndef INCLUDED_thx__Ord_Ordering_Impl_
#include <thx/_Ord/Ordering_Impl_.h>
#endif
#ifndef INCLUDED_thx_fp_CO
#include <thx/fp/CO.h>
#endif

namespace thx{
namespace fp{

void CO_obj::__construct(::String v){
            	HX_STACK_FRAME("thx.fp.CO","new",0x370af3d8,"thx.fp.CO.new","thx/fp/TestMap.hx",105,0xd5adc18e)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(v,"v")
HXLINE( 105)		this->v = v;
            	}

Dynamic CO_obj::__CreateEmpty() { return new CO_obj; }

hx::ObjectPtr< CO_obj > CO_obj::__new(::String v)
{
	hx::ObjectPtr< CO_obj > _hx_result = new CO_obj();
	_hx_result->__construct(v);
	return _hx_result;
}

Dynamic CO_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< CO_obj > _hx_result = new CO_obj();
	_hx_result->__construct(inArgs[0]);
	return _hx_result;
}

::hx::EnumBase CO_obj::compareTo( ::thx::fp::CO that){
            	HX_STACK_FRAME("thx.fp.CO","compareTo",0x899fa2f8,"thx.fp.CO.compareTo","thx/fp/TestMap.hx",107,0xd5adc18e)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(that,"that")
HXLINE( 107)		Int _hx_tmp = ::haxe::Utf8_obj::compare(this->v,that->v);
HXDLIN( 107)		return ::thx::_Ord::Ordering_Impl__obj::fromInt(_hx_tmp);
            	}


HX_DEFINE_DYNAMIC_FUNC1(CO_obj,compareTo,return )


CO_obj::CO_obj()
{
}

void CO_obj::__Mark(HX_MARK_PARAMS)
{
	HX_MARK_BEGIN_CLASS(CO);
	HX_MARK_MEMBER_NAME(v,"v");
	HX_MARK_END_CLASS();
}

void CO_obj::__Visit(HX_VISIT_PARAMS)
{
	HX_VISIT_MEMBER_NAME(v,"v");
}

hx::Val CO_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 1:
		if (HX_FIELD_EQ(inName,"v") ) { return hx::Val( v); }
		break;
	case 9:
		if (HX_FIELD_EQ(inName,"compareTo") ) { return hx::Val( compareTo_dyn()); }
	}
	return super::__Field(inName,inCallProp);
}

hx::Val CO_obj::__SetField(const ::String &inName,const hx::Val &inValue,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 1:
		if (HX_FIELD_EQ(inName,"v") ) { v=inValue.Cast< ::String >(); return inValue; }
	}
	return super::__SetField(inName,inValue,inCallProp);
}

void CO_obj::__GetFields(Array< ::String> &outFields)
{
	outFields->push(HX_HCSTRING("v","\x76","\x00","\x00","\x00"));
	super::__GetFields(outFields);
};

#if HXCPP_SCRIPTABLE
static hx::StorageInfo CO_obj_sMemberStorageInfo[] = {
	{hx::fsString,(int)offsetof(CO_obj,v),HX_HCSTRING("v","\x76","\x00","\x00","\x00")},
	{ hx::fsUnknown, 0, null()}
};
static hx::StaticInfo *CO_obj_sStaticStorageInfo = 0;
#endif

static ::String CO_obj_sMemberFields[] = {
	HX_HCSTRING("v","\x76","\x00","\x00","\x00"),
	HX_HCSTRING("compareTo","\x80","\x95","\x5c","\x02"),
	::String(null()) };

static void CO_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(CO_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void CO_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(CO_obj::__mClass,"__mClass");
};

#endif

hx::Class CO_obj::__mClass;

void CO_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.fp.CO","\xe6","\x67","\x66","\xb9");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &hx::Class_obj::GetNoStaticField;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = CO_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(0 /* sStaticFields */);
	__mClass->mMembers = hx::Class_obj::dupFunctions(CO_obj_sMemberFields);
	__mClass->mCanCast = hx::TCanCast< CO_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = CO_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = CO_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = CO_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx
} // end namespace fp
