// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_thx__TestArrays_Sample
#include <thx/_TestArrays/Sample.h>
#endif

namespace thx{
namespace _TestArrays{

void Sample_obj::__construct(Int v){
            	HX_STACK_FRAME("thx._TestArrays.Sample","new",0x5aa05c89,"thx._TestArrays.Sample.new","thx/TestArrays.hx",413,0xfbbb5567)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(v,"v")
HXLINE( 413)		this->v = v;
            	}

Dynamic Sample_obj::__CreateEmpty() { return new Sample_obj; }

hx::ObjectPtr< Sample_obj > Sample_obj::__new(Int v)
{
	hx::ObjectPtr< Sample_obj > _hx_result = new Sample_obj();
	_hx_result->__construct(v);
	return _hx_result;
}

Dynamic Sample_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< Sample_obj > _hx_result = new Sample_obj();
	_hx_result->__construct(inArgs[0]);
	return _hx_result;
}

Int Sample_obj::multiply(Int by){
            	HX_STACK_FRAME("thx._TestArrays.Sample","multiply",0xc7e6a15b,"thx._TestArrays.Sample.multiply","thx/TestArrays.hx",415,0xfbbb5567)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(by,"by")
HXLINE( 415)		return (this->v * by);
            	}


HX_DEFINE_DYNAMIC_FUNC1(Sample_obj,multiply,return )


Sample_obj::Sample_obj()
{
}

hx::Val Sample_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 1:
		if (HX_FIELD_EQ(inName,"v") ) { return hx::Val( v); }
		break;
	case 8:
		if (HX_FIELD_EQ(inName,"multiply") ) { return hx::Val( multiply_dyn()); }
	}
	return super::__Field(inName,inCallProp);
}

hx::Val Sample_obj::__SetField(const ::String &inName,const hx::Val &inValue,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 1:
		if (HX_FIELD_EQ(inName,"v") ) { v=inValue.Cast< Int >(); return inValue; }
	}
	return super::__SetField(inName,inValue,inCallProp);
}

void Sample_obj::__GetFields(Array< ::String> &outFields)
{
	outFields->push(HX_HCSTRING("v","\x76","\x00","\x00","\x00"));
	super::__GetFields(outFields);
};

#if HXCPP_SCRIPTABLE
static hx::StorageInfo Sample_obj_sMemberStorageInfo[] = {
	{hx::fsInt,(int)offsetof(Sample_obj,v),HX_HCSTRING("v","\x76","\x00","\x00","\x00")},
	{ hx::fsUnknown, 0, null()}
};
static hx::StaticInfo *Sample_obj_sStaticStorageInfo = 0;
#endif

static ::String Sample_obj_sMemberFields[] = {
	HX_HCSTRING("v","\x76","\x00","\x00","\x00"),
	HX_HCSTRING("multiply","\x24","\xe2","\x8c","\x9a"),
	::String(null()) };

static void Sample_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(Sample_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void Sample_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(Sample_obj::__mClass,"__mClass");
};

#endif

hx::Class Sample_obj::__mClass;

void Sample_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx._TestArrays.Sample","\x17","\x64","\x2b","\xfa");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &hx::Class_obj::GetNoStaticField;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = Sample_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(0 /* sStaticFields */);
	__mClass->mMembers = hx::Class_obj::dupFunctions(Sample_obj_sMemberFields);
	__mClass->mCanCast = hx::TCanCast< Sample_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = Sample_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = Sample_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = Sample_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx
} // end namespace _TestArrays