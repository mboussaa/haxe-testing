// Generated by Haxe 3.3.0
#include <hxcpp.h>

#include "hxMath.h"
#ifndef INCLUDED_Std
#include <Std.h>
#endif
#ifndef INCLUDED_hxmath_frames_Frame2Default
#include <hxmath/frames/Frame2Default.h>
#endif
#ifndef INCLUDED_hxmath_frames_IFrame2
#include <hxmath/frames/IFrame2.h>
#endif
#ifndef INCLUDED_hxmath_math_Matrix3x2Default
#include <hxmath/math/Matrix3x2Default.h>
#endif
#ifndef INCLUDED_hxmath_math_Vector2Default
#include <hxmath/math/Vector2Default.h>
#endif

namespace hxmath{
namespace frames{

void Frame2Default_obj::__construct( ::hxmath::math::Vector2Default offset,hx::Null< Float >  __o_angleDegrees,hx::Null< Bool >  __o_isCached){
Float angleDegrees = __o_angleDegrees.Default(((Float)0.0));
Bool isCached = __o_isCached.Default(true);
            	HX_STACK_FRAME("hxmath.frames.Frame2Default","new",0xf55cde3c,"hxmath.frames.Frame2Default.new","hxmath/frames/Frame2Default.hx",11,0x4cfd6ed4)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(offset,"offset")
            	HX_STACK_ARG(angleDegrees,"angleDegrees")
            	HX_STACK_ARG(isCached,"isCached")
HXLINE(  35)		this->isDirty = true;
HXLINE(  32)		this->isCached = true;
HXLINE(  46)		 ::hxmath::math::Vector2Default _hx_tmp;
HXDLIN(  46)		if (hx::IsNull( offset )) {
HXLINE(  47)			_hx_tmp =  ::hxmath::math::Vector2Default_obj::__new(((Float)0.0),((Float)0.0));
            		}
            		else {
HXLINE(  48)			_hx_tmp = offset;
            		}
HXLINE(  46)		this->internalOffset = _hx_tmp;
HXLINE(  49)		this->internalAngleDegrees = angleDegrees;
HXLINE(  50)		this->isCached = isCached;
HXLINE(  51)		this->isDirty = true;
HXLINE(  52)		this->internalMatrix =  ::hxmath::math::Matrix3x2Default_obj::__new(((Float)1.0),((Float)0.0),((Float)0.0),((Float)1.0),((Float)0.0),((Float)0.0));
            	}

Dynamic Frame2Default_obj::__CreateEmpty() { return new Frame2Default_obj; }

hx::ObjectPtr< Frame2Default_obj > Frame2Default_obj::__new( ::hxmath::math::Vector2Default offset,hx::Null< Float >  __o_angleDegrees,hx::Null< Bool >  __o_isCached)
{
	hx::ObjectPtr< Frame2Default_obj > _hx_result = new Frame2Default_obj();
	_hx_result->__construct(offset,__o_angleDegrees,__o_isCached);
	return _hx_result;
}

Dynamic Frame2Default_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< Frame2Default_obj > _hx_result = new Frame2Default_obj();
	_hx_result->__construct(inArgs[0],inArgs[1],inArgs[2]);
	return _hx_result;
}

static ::hxmath::frames::IFrame2_obj _hx_hxmath_frames_Frame2Default__hx_hxmath_frames_IFrame2= {
	(  ::hxmath::math::Matrix3x2Default (hx::Object::*)())&::hxmath::frames::Frame2Default_obj::get_matrix,
	(  ::hxmath::math::Vector2Default (hx::Object::*)())&::hxmath::frames::Frame2Default_obj::get_offset,
	(  ::hxmath::math::Vector2Default (hx::Object::*)( ::hxmath::math::Vector2Default))&::hxmath::frames::Frame2Default_obj::set_offset,
	( Float (hx::Object::*)())&::hxmath::frames::Frame2Default_obj::get_angleDegrees,
	( Float (hx::Object::*)(Float))&::hxmath::frames::Frame2Default_obj::set_angleDegrees,
};

void *Frame2Default_obj::_hx_getInterface(int inHash) {
	switch(inHash) {
		case (int)0xca0d5ed0: return &_hx_hxmath_frames_Frame2Default__hx_hxmath_frames_IFrame2;
	}
	#ifdef HXCPP_SCRIPTABLE
	return super::_hx_getInterface(inHash);
	#else
	return 0;
	#endif
}

::String Frame2Default_obj::toString(){
            	HX_STACK_FRAME("hxmath.frames.Frame2Default","toString",0xfcfa0550,"hxmath.frames.Frame2Default.toString","hxmath/frames/Frame2Default.hx",57,0x4cfd6ed4)
            	HX_STACK_THIS(this)
HXLINE(  57)		::String _hx_tmp = ::Std_obj::string(this->internalOffset);
HXDLIN(  57)		return ((((HX_("Frame2 { offset: ",f9,e5,5b,b4) + _hx_tmp) + HX_(", angleDegrees: ",2e,a1,c4,9a)) + this->internalAngleDegrees) + HX_(" }",5d,1c,00,00));
            	}


HX_DEFINE_DYNAMIC_FUNC0(Frame2Default_obj,toString,return )

 ::hxmath::math::Matrix3x2Default Frame2Default_obj::get_matrix(){
            	HX_STACK_FRAME("hxmath.frames.Frame2Default","get_matrix",0x118c4bae,"hxmath.frames.Frame2Default.get_matrix","hxmath/frames/Frame2Default.hx",61,0x4cfd6ed4)
            	HX_STACK_THIS(this)
HXLINE(  63)		Bool _hx_tmp;
HXDLIN(  63)		if (!(!(this->isCached))) {
HXLINE(  63)			_hx_tmp = this->isDirty;
            		}
            		else {
HXLINE(  63)			_hx_tmp = true;
            		}
HXDLIN(  63)		if (_hx_tmp) {
HXLINE(  65)			{
HXLINE(  65)				HX_VARI(  ::hxmath::math::Matrix3x2Default,matrix) = this->internalMatrix;
HXDLIN(  65)				HX_VARI(  ::hxmath::math::Vector2Default,offset) = this->internalOffset;
HXDLIN(  65)				HX_VARI( Float,angleDegrees) = this->internalAngleDegrees;
HXDLIN(  65)				{
HXLINE(  65)					HX_VARI( Float,angle) = (((Float)::Math_obj::PI / (Float)(int)180) * angleDegrees);
HXDLIN(  65)					HX_VARI( Float,s) = ::Math_obj::sin(angle);
HXDLIN(  65)					HX_VARI( Float,c) = ::Math_obj::cos(angle);
HXDLIN(  65)					matrix->a = c;
HXDLIN(  65)					matrix->b = -(s);
HXDLIN(  65)					matrix->c = s;
HXDLIN(  65)					matrix->d = c;
            				}
HXDLIN(  65)				{
HXLINE(  65)					HX_VARI( Float,x) = offset->x;
HXDLIN(  65)					HX_VARI( Float,y) = offset->y;
HXDLIN(  65)					matrix->tx = x;
HXDLIN(  65)					matrix->ty = y;
            				}
            			}
HXLINE(  66)			this->isDirty = false;
            		}
HXLINE(  69)		return this->internalMatrix;
            	}


HX_DEFINE_DYNAMIC_FUNC0(Frame2Default_obj,get_matrix,return )

 ::hxmath::math::Vector2Default Frame2Default_obj::get_offset(){
            	HX_STACK_FRAME("hxmath.frames.Frame2Default","get_offset",0xb603ad00,"hxmath.frames.Frame2Default.get_offset","hxmath/frames/Frame2Default.hx",74,0x4cfd6ed4)
            	HX_STACK_THIS(this)
HXLINE(  74)		return this->internalOffset;
            	}


HX_DEFINE_DYNAMIC_FUNC0(Frame2Default_obj,get_offset,return )

 ::hxmath::math::Vector2Default Frame2Default_obj::set_offset( ::hxmath::math::Vector2Default offset){
            	HX_STACK_FRAME("hxmath.frames.Frame2Default","set_offset",0xb9814b74,"hxmath.frames.Frame2Default.set_offset","hxmath/frames/Frame2Default.hx",78,0x4cfd6ed4)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(offset,"offset")
HXLINE(  79)		this->internalOffset = offset;
HXLINE(  80)		this->isDirty = true;
HXLINE(  81)		return offset;
            	}


HX_DEFINE_DYNAMIC_FUNC1(Frame2Default_obj,set_offset,return )

Float Frame2Default_obj::get_angleDegrees(){
            	HX_STACK_FRAME("hxmath.frames.Frame2Default","get_angleDegrees",0x35a19d41,"hxmath.frames.Frame2Default.get_angleDegrees","hxmath/frames/Frame2Default.hx",86,0x4cfd6ed4)
            	HX_STACK_THIS(this)
HXLINE(  86)		return this->internalAngleDegrees;
            	}


HX_DEFINE_DYNAMIC_FUNC0(Frame2Default_obj,get_angleDegrees,return )

Float Frame2Default_obj::set_angleDegrees(Float angleDegrees){
            	HX_STACK_FRAME("hxmath.frames.Frame2Default","set_angleDegrees",0x8be38ab5,"hxmath.frames.Frame2Default.set_angleDegrees","hxmath/frames/Frame2Default.hx",90,0x4cfd6ed4)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(angleDegrees,"angleDegrees")
HXLINE(  91)		this->internalAngleDegrees = angleDegrees;
HXLINE(  92)		this->isDirty = true;
HXLINE(  93)		return angleDegrees;
            	}


HX_DEFINE_DYNAMIC_FUNC1(Frame2Default_obj,set_angleDegrees,return )


Frame2Default_obj::Frame2Default_obj()
{
}

void Frame2Default_obj::__Mark(HX_MARK_PARAMS)
{
	HX_MARK_BEGIN_CLASS(Frame2Default);
	HX_MARK_MEMBER_NAME(internalMatrix,"internalMatrix");
	HX_MARK_MEMBER_NAME(internalOffset,"internalOffset");
	HX_MARK_MEMBER_NAME(internalAngleDegrees,"internalAngleDegrees");
	HX_MARK_MEMBER_NAME(isCached,"isCached");
	HX_MARK_MEMBER_NAME(isDirty,"isDirty");
	HX_MARK_END_CLASS();
}

void Frame2Default_obj::__Visit(HX_VISIT_PARAMS)
{
	HX_VISIT_MEMBER_NAME(internalMatrix,"internalMatrix");
	HX_VISIT_MEMBER_NAME(internalOffset,"internalOffset");
	HX_VISIT_MEMBER_NAME(internalAngleDegrees,"internalAngleDegrees");
	HX_VISIT_MEMBER_NAME(isCached,"isCached");
	HX_VISIT_MEMBER_NAME(isDirty,"isDirty");
}

hx::Val Frame2Default_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 6:
		if (HX_FIELD_EQ(inName,"matrix") ) { if (inCallProp == hx::paccAlways) return hx::Val(get_matrix()); }
		if (HX_FIELD_EQ(inName,"offset") ) { if (inCallProp == hx::paccAlways) return hx::Val(get_offset()); }
		break;
	case 7:
		if (HX_FIELD_EQ(inName,"isDirty") ) { return hx::Val( isDirty); }
		break;
	case 8:
		if (HX_FIELD_EQ(inName,"isCached") ) { return hx::Val( isCached); }
		if (HX_FIELD_EQ(inName,"toString") ) { return hx::Val( toString_dyn()); }
		break;
	case 10:
		if (HX_FIELD_EQ(inName,"get_matrix") ) { return hx::Val( get_matrix_dyn()); }
		if (HX_FIELD_EQ(inName,"get_offset") ) { return hx::Val( get_offset_dyn()); }
		if (HX_FIELD_EQ(inName,"set_offset") ) { return hx::Val( set_offset_dyn()); }
		break;
	case 12:
		if (HX_FIELD_EQ(inName,"angleDegrees") ) { if (inCallProp == hx::paccAlways) return hx::Val(get_angleDegrees()); }
		break;
	case 14:
		if (HX_FIELD_EQ(inName,"internalMatrix") ) { return hx::Val( internalMatrix); }
		if (HX_FIELD_EQ(inName,"internalOffset") ) { return hx::Val( internalOffset); }
		break;
	case 16:
		if (HX_FIELD_EQ(inName,"get_angleDegrees") ) { return hx::Val( get_angleDegrees_dyn()); }
		if (HX_FIELD_EQ(inName,"set_angleDegrees") ) { return hx::Val( set_angleDegrees_dyn()); }
		break;
	case 20:
		if (HX_FIELD_EQ(inName,"internalAngleDegrees") ) { return hx::Val( internalAngleDegrees); }
	}
	return super::__Field(inName,inCallProp);
}

hx::Val Frame2Default_obj::__SetField(const ::String &inName,const hx::Val &inValue,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 6:
		if (HX_FIELD_EQ(inName,"offset") ) { if (inCallProp == hx::paccAlways) return hx::Val( set_offset(inValue) ); }
		break;
	case 7:
		if (HX_FIELD_EQ(inName,"isDirty") ) { isDirty=inValue.Cast< Bool >(); return inValue; }
		break;
	case 8:
		if (HX_FIELD_EQ(inName,"isCached") ) { isCached=inValue.Cast< Bool >(); return inValue; }
		break;
	case 12:
		if (HX_FIELD_EQ(inName,"angleDegrees") ) { if (inCallProp == hx::paccAlways) return hx::Val( set_angleDegrees(inValue) ); }
		break;
	case 14:
		if (HX_FIELD_EQ(inName,"internalMatrix") ) { internalMatrix=inValue.Cast<  ::hxmath::math::Matrix3x2Default >(); return inValue; }
		if (HX_FIELD_EQ(inName,"internalOffset") ) { internalOffset=inValue.Cast<  ::hxmath::math::Vector2Default >(); return inValue; }
		break;
	case 20:
		if (HX_FIELD_EQ(inName,"internalAngleDegrees") ) { internalAngleDegrees=inValue.Cast< Float >(); return inValue; }
	}
	return super::__SetField(inName,inValue,inCallProp);
}

void Frame2Default_obj::__GetFields(Array< ::String> &outFields)
{
	outFields->push(HX_HCSTRING("matrix","\x41","\x36","\xc8","\xbb"));
	outFields->push(HX_HCSTRING("offset","\x93","\x97","\x3f","\x60"));
	outFields->push(HX_HCSTRING("angleDegrees","\x14","\x38","\x7c","\x3d"));
	outFields->push(HX_HCSTRING("internalMatrix","\x5e","\x9d","\xb7","\xe0"));
	outFields->push(HX_HCSTRING("internalOffset","\xb0","\xfe","\x2e","\x85"));
	outFields->push(HX_HCSTRING("internalAngleDegrees","\xf1","\x52","\x61","\x18"));
	outFields->push(HX_HCSTRING("isCached","\x6c","\xfb","\x5b","\x09"));
	outFields->push(HX_HCSTRING("isDirty","\xc8","\xf3","\x55","\x76"));
	super::__GetFields(outFields);
};

#if HXCPP_SCRIPTABLE
static hx::StorageInfo Frame2Default_obj_sMemberStorageInfo[] = {
	{hx::fsObject /*::hxmath::math::Matrix3x2Default*/ ,(int)offsetof(Frame2Default_obj,internalMatrix),HX_HCSTRING("internalMatrix","\x5e","\x9d","\xb7","\xe0")},
	{hx::fsObject /*::hxmath::math::Vector2Default*/ ,(int)offsetof(Frame2Default_obj,internalOffset),HX_HCSTRING("internalOffset","\xb0","\xfe","\x2e","\x85")},
	{hx::fsFloat,(int)offsetof(Frame2Default_obj,internalAngleDegrees),HX_HCSTRING("internalAngleDegrees","\xf1","\x52","\x61","\x18")},
	{hx::fsBool,(int)offsetof(Frame2Default_obj,isCached),HX_HCSTRING("isCached","\x6c","\xfb","\x5b","\x09")},
	{hx::fsBool,(int)offsetof(Frame2Default_obj,isDirty),HX_HCSTRING("isDirty","\xc8","\xf3","\x55","\x76")},
	{ hx::fsUnknown, 0, null()}
};
static hx::StaticInfo *Frame2Default_obj_sStaticStorageInfo = 0;
#endif

static ::String Frame2Default_obj_sMemberFields[] = {
	HX_HCSTRING("internalMatrix","\x5e","\x9d","\xb7","\xe0"),
	HX_HCSTRING("internalOffset","\xb0","\xfe","\x2e","\x85"),
	HX_HCSTRING("internalAngleDegrees","\xf1","\x52","\x61","\x18"),
	HX_HCSTRING("isCached","\x6c","\xfb","\x5b","\x09"),
	HX_HCSTRING("isDirty","\xc8","\xf3","\x55","\x76"),
	HX_HCSTRING("toString","\xac","\xd0","\x6e","\x38"),
	HX_HCSTRING("get_matrix","\x0a","\xa6","\x4f","\xac"),
	HX_HCSTRING("get_offset","\x5c","\x07","\xc7","\x50"),
	HX_HCSTRING("set_offset","\xd0","\xa5","\x44","\x54"),
	HX_HCSTRING("get_angleDegrees","\x9d","\x24","\x1b","\x42"),
	HX_HCSTRING("set_angleDegrees","\x11","\x12","\x5d","\x98"),
	::String(null()) };

static void Frame2Default_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(Frame2Default_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void Frame2Default_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(Frame2Default_obj::__mClass,"__mClass");
};

#endif

hx::Class Frame2Default_obj::__mClass;

void Frame2Default_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("hxmath.frames.Frame2Default","\x4a","\x50","\x92","\xfb");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &hx::Class_obj::GetNoStaticField;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = Frame2Default_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(0 /* sStaticFields */);
	__mClass->mMembers = hx::Class_obj::dupFunctions(Frame2Default_obj_sMemberFields);
	__mClass->mCanCast = hx::TCanCast< Frame2Default_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = Frame2Default_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = Frame2Default_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = Frame2Default_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace hxmath
} // end namespace frames
