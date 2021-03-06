// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_hxmath_math_Matrix3x3Default
#include <hxmath/math/Matrix3x3Default.h>
#endif

namespace hxmath{
namespace math{

void Matrix3x3Default_obj::__construct(Float m00,Float m10,Float m20,Float m01,Float m11,Float m21,Float m02,Float m12,Float m22){
            	HX_STACK_FRAME("hxmath.math.Matrix3x3Default","new",0x2a760496,"hxmath.math.Matrix3x3Default.new","hxmath/math/Matrix3x3.hx",40,0xaae5f2a1)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(m00,"m00")
            	HX_STACK_ARG(m10,"m10")
            	HX_STACK_ARG(m20,"m20")
            	HX_STACK_ARG(m01,"m01")
            	HX_STACK_ARG(m11,"m11")
            	HX_STACK_ARG(m21,"m21")
            	HX_STACK_ARG(m02,"m02")
            	HX_STACK_ARG(m12,"m12")
            	HX_STACK_ARG(m22,"m22")
HXLINE(  41)		this->m00 = m00;
HXLINE(  42)		this->m10 = m10;
HXLINE(  43)		this->m20 = m20;
HXLINE(  45)		this->m01 = m01;
HXLINE(  46)		this->m11 = m11;
HXLINE(  47)		this->m21 = m21;
HXLINE(  49)		this->m02 = m02;
HXLINE(  50)		this->m12 = m12;
HXLINE(  51)		this->m22 = m22;
            	}

Dynamic Matrix3x3Default_obj::__CreateEmpty() { return new Matrix3x3Default_obj; }

hx::ObjectPtr< Matrix3x3Default_obj > Matrix3x3Default_obj::__new(Float m00,Float m10,Float m20,Float m01,Float m11,Float m21,Float m02,Float m12,Float m22)
{
	hx::ObjectPtr< Matrix3x3Default_obj > _hx_result = new Matrix3x3Default_obj();
	_hx_result->__construct(m00,m10,m20,m01,m11,m21,m02,m12,m22);
	return _hx_result;
}

Dynamic Matrix3x3Default_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< Matrix3x3Default_obj > _hx_result = new Matrix3x3Default_obj();
	_hx_result->__construct(inArgs[0],inArgs[1],inArgs[2],inArgs[3],inArgs[4],inArgs[5],inArgs[6],inArgs[7],inArgs[8]);
	return _hx_result;
}

::String Matrix3x3Default_obj::toString(){
            	HX_STACK_FRAME("hxmath.math.Matrix3x3Default","toString",0x391598b6,"hxmath.math.Matrix3x3Default.toString","hxmath/math/Matrix3x3.hx",56,0xaae5f2a1)
            	HX_STACK_THIS(this)
HXLINE(  56)		return ((((((((((((((((((HX_("[[",a0,4f,00,00) + this->m00) + HX_(", ",74,26,00,00)) + this->m10) + HX_(", ",74,26,00,00)) + this->m20) + HX_("], [",2a,57,9a,3d)) + this->m01) + HX_(", ",74,26,00,00)) + this->m11) + HX_(", ",74,26,00,00)) + this->m21) + HX_("], [",2a,57,9a,3d)) + this->m02) + HX_(", ",74,26,00,00)) + this->m12) + HX_(", ",74,26,00,00)) + this->m22) + HX_("]]",60,51,00,00));
            	}


HX_DEFINE_DYNAMIC_FUNC0(Matrix3x3Default_obj,toString,return )


Matrix3x3Default_obj::Matrix3x3Default_obj()
{
}

hx::Val Matrix3x3Default_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 3:
		if (HX_FIELD_EQ(inName,"m00") ) { return hx::Val( m00); }
		if (HX_FIELD_EQ(inName,"m01") ) { return hx::Val( m01); }
		if (HX_FIELD_EQ(inName,"m02") ) { return hx::Val( m02); }
		if (HX_FIELD_EQ(inName,"m10") ) { return hx::Val( m10); }
		if (HX_FIELD_EQ(inName,"m11") ) { return hx::Val( m11); }
		if (HX_FIELD_EQ(inName,"m12") ) { return hx::Val( m12); }
		if (HX_FIELD_EQ(inName,"m20") ) { return hx::Val( m20); }
		if (HX_FIELD_EQ(inName,"m21") ) { return hx::Val( m21); }
		if (HX_FIELD_EQ(inName,"m22") ) { return hx::Val( m22); }
		break;
	case 8:
		if (HX_FIELD_EQ(inName,"toString") ) { return hx::Val( toString_dyn()); }
	}
	return super::__Field(inName,inCallProp);
}

hx::Val Matrix3x3Default_obj::__SetField(const ::String &inName,const hx::Val &inValue,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 3:
		if (HX_FIELD_EQ(inName,"m00") ) { m00=inValue.Cast< Float >(); return inValue; }
		if (HX_FIELD_EQ(inName,"m01") ) { m01=inValue.Cast< Float >(); return inValue; }
		if (HX_FIELD_EQ(inName,"m02") ) { m02=inValue.Cast< Float >(); return inValue; }
		if (HX_FIELD_EQ(inName,"m10") ) { m10=inValue.Cast< Float >(); return inValue; }
		if (HX_FIELD_EQ(inName,"m11") ) { m11=inValue.Cast< Float >(); return inValue; }
		if (HX_FIELD_EQ(inName,"m12") ) { m12=inValue.Cast< Float >(); return inValue; }
		if (HX_FIELD_EQ(inName,"m20") ) { m20=inValue.Cast< Float >(); return inValue; }
		if (HX_FIELD_EQ(inName,"m21") ) { m21=inValue.Cast< Float >(); return inValue; }
		if (HX_FIELD_EQ(inName,"m22") ) { m22=inValue.Cast< Float >(); return inValue; }
	}
	return super::__SetField(inName,inValue,inCallProp);
}

void Matrix3x3Default_obj::__GetFields(Array< ::String> &outFields)
{
	outFields->push(HX_HCSTRING("m00","\xad","\xdf","\x52","\x00"));
	outFields->push(HX_HCSTRING("m01","\xae","\xdf","\x52","\x00"));
	outFields->push(HX_HCSTRING("m02","\xaf","\xdf","\x52","\x00"));
	outFields->push(HX_HCSTRING("m10","\x8c","\xe0","\x52","\x00"));
	outFields->push(HX_HCSTRING("m11","\x8d","\xe0","\x52","\x00"));
	outFields->push(HX_HCSTRING("m12","\x8e","\xe0","\x52","\x00"));
	outFields->push(HX_HCSTRING("m20","\x6b","\xe1","\x52","\x00"));
	outFields->push(HX_HCSTRING("m21","\x6c","\xe1","\x52","\x00"));
	outFields->push(HX_HCSTRING("m22","\x6d","\xe1","\x52","\x00"));
	super::__GetFields(outFields);
};

#if HXCPP_SCRIPTABLE
static hx::StorageInfo Matrix3x3Default_obj_sMemberStorageInfo[] = {
	{hx::fsFloat,(int)offsetof(Matrix3x3Default_obj,m00),HX_HCSTRING("m00","\xad","\xdf","\x52","\x00")},
	{hx::fsFloat,(int)offsetof(Matrix3x3Default_obj,m01),HX_HCSTRING("m01","\xae","\xdf","\x52","\x00")},
	{hx::fsFloat,(int)offsetof(Matrix3x3Default_obj,m02),HX_HCSTRING("m02","\xaf","\xdf","\x52","\x00")},
	{hx::fsFloat,(int)offsetof(Matrix3x3Default_obj,m10),HX_HCSTRING("m10","\x8c","\xe0","\x52","\x00")},
	{hx::fsFloat,(int)offsetof(Matrix3x3Default_obj,m11),HX_HCSTRING("m11","\x8d","\xe0","\x52","\x00")},
	{hx::fsFloat,(int)offsetof(Matrix3x3Default_obj,m12),HX_HCSTRING("m12","\x8e","\xe0","\x52","\x00")},
	{hx::fsFloat,(int)offsetof(Matrix3x3Default_obj,m20),HX_HCSTRING("m20","\x6b","\xe1","\x52","\x00")},
	{hx::fsFloat,(int)offsetof(Matrix3x3Default_obj,m21),HX_HCSTRING("m21","\x6c","\xe1","\x52","\x00")},
	{hx::fsFloat,(int)offsetof(Matrix3x3Default_obj,m22),HX_HCSTRING("m22","\x6d","\xe1","\x52","\x00")},
	{ hx::fsUnknown, 0, null()}
};
static hx::StaticInfo *Matrix3x3Default_obj_sStaticStorageInfo = 0;
#endif

static ::String Matrix3x3Default_obj_sMemberFields[] = {
	HX_HCSTRING("m00","\xad","\xdf","\x52","\x00"),
	HX_HCSTRING("m01","\xae","\xdf","\x52","\x00"),
	HX_HCSTRING("m02","\xaf","\xdf","\x52","\x00"),
	HX_HCSTRING("m10","\x8c","\xe0","\x52","\x00"),
	HX_HCSTRING("m11","\x8d","\xe0","\x52","\x00"),
	HX_HCSTRING("m12","\x8e","\xe0","\x52","\x00"),
	HX_HCSTRING("m20","\x6b","\xe1","\x52","\x00"),
	HX_HCSTRING("m21","\x6c","\xe1","\x52","\x00"),
	HX_HCSTRING("m22","\x6d","\xe1","\x52","\x00"),
	HX_HCSTRING("toString","\xac","\xd0","\x6e","\x38"),
	::String(null()) };

static void Matrix3x3Default_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(Matrix3x3Default_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void Matrix3x3Default_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(Matrix3x3Default_obj::__mClass,"__mClass");
};

#endif

hx::Class Matrix3x3Default_obj::__mClass;

void Matrix3x3Default_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("hxmath.math.Matrix3x3Default","\xa4","\xc1","\x0e","\xa9");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &hx::Class_obj::GetNoStaticField;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = Matrix3x3Default_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(0 /* sStaticFields */);
	__mClass->mMembers = hx::Class_obj::dupFunctions(Matrix3x3Default_obj_sMemberFields);
	__mClass->mCanCast = hx::TCanCast< Matrix3x3Default_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = Matrix3x3Default_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = Matrix3x3Default_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = Matrix3x3Default_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace hxmath
} // end namespace math
