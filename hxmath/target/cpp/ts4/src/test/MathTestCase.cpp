// Generated by Haxe 3.3.0
#include <hxcpp.h>

#include "hxMath.h"
#ifndef INCLUDED_hxmath_frames_IFrame2
#include <hxmath/frames/IFrame2.h>
#endif
#ifndef INCLUDED_hxmath_frames_IFrame3
#include <hxmath/frames/IFrame3.h>
#endif
#ifndef INCLUDED_hxmath_frames__Frame2_Frame2_Impl_
#include <hxmath/frames/_Frame2/Frame2_Impl_.h>
#endif
#ifndef INCLUDED_hxmath_frames__Frame3_Frame3_Impl_
#include <hxmath/frames/_Frame3/Frame3_Impl_.h>
#endif
#ifndef INCLUDED_hxmath_math_IntVector2Default
#include <hxmath/math/IntVector2Default.h>
#endif
#ifndef INCLUDED_hxmath_math_Matrix2x2Default
#include <hxmath/math/Matrix2x2Default.h>
#endif
#ifndef INCLUDED_hxmath_math_Matrix3x2Default
#include <hxmath/math/Matrix3x2Default.h>
#endif
#ifndef INCLUDED_hxmath_math_Matrix3x3Default
#include <hxmath/math/Matrix3x3Default.h>
#endif
#ifndef INCLUDED_hxmath_math_Matrix4x4Default
#include <hxmath/math/Matrix4x4Default.h>
#endif
#ifndef INCLUDED_hxmath_math_QuaternionDefault
#include <hxmath/math/QuaternionDefault.h>
#endif
#ifndef INCLUDED_hxmath_math_Vector2Default
#include <hxmath/math/Vector2Default.h>
#endif
#ifndef INCLUDED_hxmath_math_Vector3Default
#include <hxmath/math/Vector3Default.h>
#endif
#ifndef INCLUDED_hxmath_math_Vector4Default
#include <hxmath/math/Vector4Default.h>
#endif
#ifndef INCLUDED_hxmath_math__IntVector2_IntVector2_Impl_
#include <hxmath/math/_IntVector2/IntVector2_Impl_.h>
#endif
#ifndef INCLUDED_hxmath_math__ShortVector2_ShortVector2_Impl_
#include <hxmath/math/_ShortVector2/ShortVector2_Impl_.h>
#endif
#ifndef INCLUDED_nanotest_NanoTestAssertResult
#include <nanotest/NanoTestAssertResult.h>
#endif
#ifndef INCLUDED_nanotest_NanoTestCase
#include <nanotest/NanoTestCase.h>
#endif
#ifndef INCLUDED_test_Distribution
#include <test/Distribution.h>
#endif
#ifndef INCLUDED_test_MathTestCase
#include <test/MathTestCase.h>
#endif

namespace test{

void MathTestCase_obj::__construct( ::Dynamic posInfos){
            	HX_STACK_FRAME("test.MathTestCase","new",0x4f646bb8,"test.MathTestCase.new","test/MathTestCase.hx",21,0x6bb49bd7)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(posInfos,"posInfos")
HXLINE(  21)		super::__construct(posInfos);
            	}

Dynamic MathTestCase_obj::__CreateEmpty() { return new MathTestCase_obj; }

hx::ObjectPtr< MathTestCase_obj > MathTestCase_obj::__new( ::Dynamic posInfos)
{
	hx::ObjectPtr< MathTestCase_obj > _hx_result = new MathTestCase_obj();
	_hx_result->__construct(posInfos);
	return _hx_result;
}

Dynamic MathTestCase_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< MathTestCase_obj > _hx_result = new MathTestCase_obj();
	_hx_result->__construct(inArgs[0]);
	return _hx_result;
}

Float MathTestCase_obj::randomFloat(hx::Null< Float >  __o_center,hx::Null< Float >  __o_width,hx::Null< Float >  __o_precision){
Float center = __o_center.Default(((Float)0.0));
Float width = __o_width.Default(((Float)1.0));
Float precision = __o_precision.Default(((Float)1e-4));
            	HX_STACK_FRAME("test.MathTestCase","randomFloat",0xf9cb9bf1,"test.MathTestCase.randomFloat","test/MathTestCase.hx",24,0x6bb49bd7)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(center,"center")
            	HX_STACK_ARG(width,"width")
            	HX_STACK_ARG(precision,"precision")
HXLINE(  26)		Float _hx_tmp = ::Math_obj::random();
HXLINE(  29)		Int _hx_tmp1 = ::Math_obj::floor(((Float)(((_hx_tmp - ((Float)0.5)) * width) + center) / (Float)precision));
HXDLIN(  29)		return (_hx_tmp1 * precision);
            	}


HX_DEFINE_DYNAMIC_FUNC3(MathTestCase_obj,randomFloat,return )

Int MathTestCase_obj::randomInt(){
            	HX_STACK_FRAME("test.MathTestCase","randomInt",0x6c9d3404,"test.MathTestCase.randomInt","test/MathTestCase.hx",34,0x6bb49bd7)
            	HX_STACK_THIS(this)
HXLINE(  34)		Float _hx_tmp = ::Math_obj::random();
HXDLIN(  34)		return ::Math_obj::floor((_hx_tmp * (int)10));
            	}


HX_DEFINE_DYNAMIC_FUNC0(MathTestCase_obj,randomInt,return )

::Array< Float > MathTestCase_obj::randomArray(Int size, ::test::Distribution distribution){
            	HX_STACK_FRAME("test.MathTestCase","randomArray",0x1cc443ee,"test.MathTestCase.randomArray","test/MathTestCase.hx",38,0x6bb49bd7)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(size,"size")
            	HX_STACK_ARG(distribution,"distribution")
HXLINE(  39)		HX_VARI( ::Array< Float >,data) = ::Array_obj< Float >::__new();
HXLINE(  40)		HX_VAR_NAME(  ::test::Distribution,distribution1,"distribution");
HXDLIN(  40)		if (hx::IsNull( distribution )) {
HXLINE(  40)			distribution1 =  ::test::Distribution_obj::__new();
            		}
            		else {
HXLINE(  40)			distribution1 = distribution;
            		}
HXLINE(  42)		{
HXLINE(  42)			HX_VARI( Int,_g1) = (int)0;
HXDLIN(  42)			while((_g1 < size)){
HXLINE(  42)				++_g1;
HXLINE(  44)				Float _hx_tmp = this->randomFloat(distribution1->center,distribution1->width,distribution1->precision);
HXDLIN(  44)				data->push(_hx_tmp);
            			}
            		}
HXLINE(  47)		return data;
            	}


HX_DEFINE_DYNAMIC_FUNC2(MathTestCase_obj,randomArray,return )

void MathTestCase_obj::assertApproxEquals(Float expected,Float actual,hx::Null< Float >  __o_tolerance, ::Dynamic p){
Float tolerance = __o_tolerance.Default(((Float)1e-6));
            	HX_STACK_FRAME("test.MathTestCase","assertApproxEquals",0x808ebd87,"test.MathTestCase.assertApproxEquals","test/MathTestCase.hx",52,0x6bb49bd7)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(expected,"expected")
            	HX_STACK_ARG(actual,"actual")
            	HX_STACK_ARG(tolerance,"tolerance")
            	HX_STACK_ARG(p,"p")
HXLINE(  52)		Float _hx_tmp = ::Math_obj::abs((expected - actual));
HXDLIN(  52)		if ((_hx_tmp < tolerance)) {
HXLINE(  54)			this->success(p);
            		}
            		else {
HXLINE(  58)			this->fail((((((HX_("expected ",a8,7a,f8,e9) + expected) + HX_(" +-",c2,6d,18,00)) + tolerance) + HX_(" but was ",36,e4,f6,61)) + actual),p);
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC4(MathTestCase_obj,assertApproxEquals,(void))

 ::hxmath::math::Vector2Default MathTestCase_obj::randomVector2(hx::Null< Float >  __o_precision){
Float precision = __o_precision.Default(((Float)1e-4));
            	HX_STACK_FRAME("test.MathTestCase","randomVector2",0xa973cfa4,"test.MathTestCase.randomVector2","test/MathTestCase.hx",63,0x6bb49bd7)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(precision,"precision")
HXLINE(  64)		HX_VARI(  ::test::Distribution,distribution) =  ::test::Distribution_obj::__new();
HXLINE(  65)		distribution->precision = precision;
HXLINE(  66)		HX_VARI( ::Array< Float >,rawData) = this->randomArray((int)2,distribution);
HXDLIN(  66)		if ((rawData->length != (int)2)) {
HXLINE(  66)			HX_STACK_DO_THROW(HX_("Invalid rawData.",25,ca,34,44));
            		}
HXDLIN(  66)		return  ::hxmath::math::Vector2Default_obj::__new(rawData->__get((int)0),rawData->__get((int)1));
            	}


HX_DEFINE_DYNAMIC_FUNC1(MathTestCase_obj,randomVector2,return )

 ::hxmath::math::Vector3Default MathTestCase_obj::randomVector3(hx::Null< Float >  __o_precision){
Float precision = __o_precision.Default(((Float)1e-4));
            	HX_STACK_FRAME("test.MathTestCase","randomVector3",0xa973cfa5,"test.MathTestCase.randomVector3","test/MathTestCase.hx",70,0x6bb49bd7)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(precision,"precision")
HXLINE(  71)		HX_VARI(  ::test::Distribution,distribution) =  ::test::Distribution_obj::__new();
HXLINE(  72)		distribution->precision = precision;
HXLINE(  73)		HX_VARI( ::Array< Float >,rawData) = this->randomArray((int)3,distribution);
HXDLIN(  73)		if ((rawData->length != (int)3)) {
HXLINE(  73)			HX_STACK_DO_THROW(HX_("Invalid rawData.",25,ca,34,44));
            		}
HXDLIN(  73)		return  ::hxmath::math::Vector3Default_obj::__new(rawData->__get((int)0),rawData->__get((int)1),rawData->__get((int)2));
            	}


HX_DEFINE_DYNAMIC_FUNC1(MathTestCase_obj,randomVector3,return )

 ::hxmath::math::Vector4Default MathTestCase_obj::randomVector4(hx::Null< Float >  __o_precision){
Float precision = __o_precision.Default(((Float)1e-4));
            	HX_STACK_FRAME("test.MathTestCase","randomVector4",0xa973cfa6,"test.MathTestCase.randomVector4","test/MathTestCase.hx",77,0x6bb49bd7)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(precision,"precision")
HXLINE(  78)		HX_VARI(  ::test::Distribution,distribution) =  ::test::Distribution_obj::__new();
HXLINE(  79)		distribution->precision = precision;
HXLINE(  80)		HX_VARI( ::Array< Float >,rawData) = this->randomArray((int)4,distribution);
HXDLIN(  80)		if ((rawData->length != (int)4)) {
HXLINE(  80)			HX_STACK_DO_THROW(HX_("Invalid rawData.",25,ca,34,44));
            		}
HXDLIN(  80)		return  ::hxmath::math::Vector4Default_obj::__new(rawData->__get((int)0),rawData->__get((int)1),rawData->__get((int)2),rawData->__get((int)3));
            	}


HX_DEFINE_DYNAMIC_FUNC1(MathTestCase_obj,randomVector4,return )

 ::hxmath::math::Matrix2x2Default MathTestCase_obj::randomMatrix2x2(hx::Null< Float >  __o_precision){
Float precision = __o_precision.Default(((Float)1e-4));
            	HX_STACK_FRAME("test.MathTestCase","randomMatrix2x2",0x0041e6a0,"test.MathTestCase.randomMatrix2x2","test/MathTestCase.hx",84,0x6bb49bd7)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(precision,"precision")
HXLINE(  85)		HX_VARI(  ::test::Distribution,distribution) =  ::test::Distribution_obj::__new();
HXLINE(  86)		distribution->precision = precision;
HXLINE(  87)		HX_VARI( ::Array< Float >,rawData) = this->randomArray((int)4,distribution);
HXDLIN(  87)		if ((rawData->length != (int)4)) {
HXLINE(  87)			HX_STACK_DO_THROW(HX_("Invalid rawData.",25,ca,34,44));
            		}
HXDLIN(  87)		return  ::hxmath::math::Matrix2x2Default_obj::__new(rawData->__get((int)0),rawData->__get((int)1),rawData->__get((int)2),rawData->__get((int)3));
            	}


HX_DEFINE_DYNAMIC_FUNC1(MathTestCase_obj,randomMatrix2x2,return )

 ::hxmath::math::Matrix3x2Default MathTestCase_obj::randomMatrix3x2(hx::Null< Float >  __o_precision){
Float precision = __o_precision.Default(((Float)1e-4));
            	HX_STACK_FRAME("test.MathTestCase","randomMatrix3x2",0x0042a8e1,"test.MathTestCase.randomMatrix3x2","test/MathTestCase.hx",91,0x6bb49bd7)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(precision,"precision")
HXLINE(  92)		HX_VARI(  ::test::Distribution,distribution) =  ::test::Distribution_obj::__new();
HXLINE(  93)		distribution->precision = precision;
HXLINE(  94)		HX_VARI( ::Array< Float >,rawData) = this->randomArray((int)6,distribution);
HXDLIN(  94)		if ((rawData->length != (int)6)) {
HXLINE(  94)			HX_STACK_DO_THROW(HX_("Invalid rawData.",25,ca,34,44));
            		}
HXDLIN(  94)		return  ::hxmath::math::Matrix3x2Default_obj::__new(rawData->__get((int)0),rawData->__get((int)1),rawData->__get((int)2),rawData->__get((int)3),rawData->__get((int)4),rawData->__get((int)5));
            	}


HX_DEFINE_DYNAMIC_FUNC1(MathTestCase_obj,randomMatrix3x2,return )

 ::hxmath::math::Matrix3x3Default MathTestCase_obj::randomMatrix3x3(hx::Null< Float >  __o_precision){
Float precision = __o_precision.Default(((Float)1e-4));
            	HX_STACK_FRAME("test.MathTestCase","randomMatrix3x3",0x0042a8e2,"test.MathTestCase.randomMatrix3x3","test/MathTestCase.hx",98,0x6bb49bd7)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(precision,"precision")
HXLINE(  99)		HX_VARI(  ::test::Distribution,distribution) =  ::test::Distribution_obj::__new();
HXLINE( 100)		distribution->precision = precision;
HXLINE( 101)		HX_VARI( ::Array< Float >,rawData) = this->randomArray((int)9,distribution);
HXDLIN( 101)		if ((rawData->length != (int)9)) {
HXLINE( 101)			HX_STACK_DO_THROW(HX_("Invalid rawData.",25,ca,34,44));
            		}
HXDLIN( 101)		return  ::hxmath::math::Matrix3x3Default_obj::__new(rawData->__get((int)0),rawData->__get((int)1),rawData->__get((int)2),rawData->__get((int)3),rawData->__get((int)4),rawData->__get((int)5),rawData->__get((int)6),rawData->__get((int)7),rawData->__get((int)8));
            	}


HX_DEFINE_DYNAMIC_FUNC1(MathTestCase_obj,randomMatrix3x3,return )

 ::hxmath::math::Matrix4x4Default MathTestCase_obj::randomMatrix4x4(hx::Null< Float >  __o_precision){
Float precision = __o_precision.Default(((Float)1e-4));
            	HX_STACK_FRAME("test.MathTestCase","randomMatrix4x4",0x00436b24,"test.MathTestCase.randomMatrix4x4","test/MathTestCase.hx",105,0x6bb49bd7)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(precision,"precision")
HXLINE( 106)		HX_VARI(  ::test::Distribution,distribution) =  ::test::Distribution_obj::__new();
HXLINE( 107)		distribution->precision = precision;
HXLINE( 108)		HX_VARI( ::Array< Float >,rawData) = this->randomArray((int)16,distribution);
HXDLIN( 108)		if ((rawData->length != (int)16)) {
HXLINE( 108)			HX_STACK_DO_THROW(HX_("Invalid rawData.",25,ca,34,44));
            		}
HXDLIN( 108)		return  ::hxmath::math::Matrix4x4Default_obj::__new(rawData->__get((int)0),rawData->__get((int)1),rawData->__get((int)2),rawData->__get((int)3),rawData->__get((int)4),rawData->__get((int)5),rawData->__get((int)6),rawData->__get((int)7),rawData->__get((int)8),rawData->__get((int)9),rawData->__get((int)10),rawData->__get((int)11),rawData->__get((int)12),rawData->__get((int)13),rawData->__get((int)14),rawData->__get((int)15));
            	}


HX_DEFINE_DYNAMIC_FUNC1(MathTestCase_obj,randomMatrix4x4,return )

 ::hxmath::math::QuaternionDefault MathTestCase_obj::randomQuaternion(hx::Null< Float >  __o_precision){
Float precision = __o_precision.Default(((Float)1e-4));
            	HX_STACK_FRAME("test.MathTestCase","randomQuaternion",0xe3a322a9,"test.MathTestCase.randomQuaternion","test/MathTestCase.hx",112,0x6bb49bd7)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(precision,"precision")
HXLINE( 113)		HX_VARI(  ::test::Distribution,distribution) =  ::test::Distribution_obj::__new();
HXLINE( 114)		distribution->precision = precision;
HXLINE( 115)		HX_VARI( ::Array< Float >,rawData) = this->randomArray((int)4,distribution);
HXDLIN( 115)		if ((rawData->length != (int)4)) {
HXLINE( 115)			HX_STACK_DO_THROW(HX_("Invalid rawData.",25,ca,34,44));
            		}
HXDLIN( 115)		return  ::hxmath::math::QuaternionDefault_obj::__new(rawData->__get((int)0),rawData->__get((int)1),rawData->__get((int)2),rawData->__get((int)3));
            	}


HX_DEFINE_DYNAMIC_FUNC1(MathTestCase_obj,randomQuaternion,return )

 ::hxmath::math::IntVector2Default MathTestCase_obj::randomIntVector2(){
            	HX_STACK_FRAME("test.MathTestCase","randomIntVector2",0xdce9366b,"test.MathTestCase.randomIntVector2","test/MathTestCase.hx",120,0x6bb49bd7)
            	HX_STACK_THIS(this)
HXLINE( 120)		Int _hx_tmp = this->randomInt();
HXDLIN( 120)		Int _hx_tmp1 = this->randomInt();
HXDLIN( 120)		return ::hxmath::math::_IntVector2::IntVector2_Impl__obj::_new(_hx_tmp,_hx_tmp1);
            	}


HX_DEFINE_DYNAMIC_FUNC0(MathTestCase_obj,randomIntVector2,return )

Int MathTestCase_obj::randomShortVector2(){
            	HX_STACK_FRAME("test.MathTestCase","randomShortVector2",0x0660333e,"test.MathTestCase.randomShortVector2","test/MathTestCase.hx",125,0x6bb49bd7)
            	HX_STACK_THIS(this)
HXLINE( 125)		Int _hx_tmp = this->randomInt();
HXDLIN( 125)		Int _hx_tmp1 = this->randomInt();
HXDLIN( 125)		return ::hxmath::math::_ShortVector2::ShortVector2_Impl__obj::_new(_hx_tmp,_hx_tmp1);
            	}


HX_DEFINE_DYNAMIC_FUNC0(MathTestCase_obj,randomShortVector2,return )

::Dynamic MathTestCase_obj::randomFrame2(hx::Null< Float >  __o_precision){
Float precision = __o_precision.Default(((Float)1e-4));
            	HX_STACK_FRAME("test.MathTestCase","randomFrame2",0x038c6370,"test.MathTestCase.randomFrame2","test/MathTestCase.hx",130,0x6bb49bd7)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(precision,"precision")
HXLINE( 130)		 ::hxmath::math::Vector2Default _hx_tmp = this->randomVector2(precision);
HXDLIN( 130)		Float _hx_tmp1 = this->randomFloat(((Float)0.0),((Float)1.0),precision);
HXDLIN( 130)		return ::hxmath::frames::_Frame2::Frame2_Impl__obj::_new(_hx_tmp,(_hx_tmp1 * ::Math_obj::PI));
            	}


HX_DEFINE_DYNAMIC_FUNC1(MathTestCase_obj,randomFrame2,return )

::Dynamic MathTestCase_obj::randomFrame3(hx::Null< Float >  __o_precision){
Float precision = __o_precision.Default(((Float)1e-4));
            	HX_STACK_FRAME("test.MathTestCase","randomFrame3",0x038c6371,"test.MathTestCase.randomFrame3","test/MathTestCase.hx",135,0x6bb49bd7)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(precision,"precision")
HXLINE( 135)		 ::hxmath::math::Vector3Default _hx_tmp = this->randomVector3(precision);
HXDLIN( 135)		HX_VARI_NAME(  ::hxmath::math::QuaternionDefault,this1,"this") = this->randomQuaternion(precision);
HXDLIN( 135)		HX_VARI(  ::hxmath::math::QuaternionDefault,self) = this1;
HXDLIN( 135)		Float _hx_tmp1 = ((((self->s * self->s) + (self->x * self->x)) + (self->y * self->y)) + (self->z * self->z));
HXDLIN( 135)		Float _hx_tmp2 = ::Math_obj::sqrt(_hx_tmp1);
HXDLIN( 135)		HX_VARI( Float,_g) = ((Float)((Float)1.0) / (Float)_hx_tmp2);
HXDLIN( 135)		HX_VARI_NAME(  ::hxmath::math::QuaternionDefault,self1,"self") =  ::hxmath::math::QuaternionDefault_obj::__new(self->s,self->x,self->y,self->z);
HXDLIN( 135)		hx::MultEq(self1->s,_g);
HXDLIN( 135)		hx::MultEq(self1->x,_g);
HXDLIN( 135)		hx::MultEq(self1->y,_g);
HXDLIN( 135)		hx::MultEq(self1->z,_g);
HXDLIN( 135)		return ::hxmath::frames::_Frame3::Frame3_Impl__obj::_new(_hx_tmp,self1);
            	}


HX_DEFINE_DYNAMIC_FUNC1(MathTestCase_obj,randomFrame3,return )


MathTestCase_obj::MathTestCase_obj()
{
}

hx::Val MathTestCase_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 9:
		if (HX_FIELD_EQ(inName,"randomInt") ) { return hx::Val( randomInt_dyn()); }
		break;
	case 11:
		if (HX_FIELD_EQ(inName,"randomFloat") ) { return hx::Val( randomFloat_dyn()); }
		if (HX_FIELD_EQ(inName,"randomArray") ) { return hx::Val( randomArray_dyn()); }
		break;
	case 12:
		if (HX_FIELD_EQ(inName,"randomFrame2") ) { return hx::Val( randomFrame2_dyn()); }
		if (HX_FIELD_EQ(inName,"randomFrame3") ) { return hx::Val( randomFrame3_dyn()); }
		break;
	case 13:
		if (HX_FIELD_EQ(inName,"randomVector2") ) { return hx::Val( randomVector2_dyn()); }
		if (HX_FIELD_EQ(inName,"randomVector3") ) { return hx::Val( randomVector3_dyn()); }
		if (HX_FIELD_EQ(inName,"randomVector4") ) { return hx::Val( randomVector4_dyn()); }
		break;
	case 15:
		if (HX_FIELD_EQ(inName,"randomMatrix2x2") ) { return hx::Val( randomMatrix2x2_dyn()); }
		if (HX_FIELD_EQ(inName,"randomMatrix3x2") ) { return hx::Val( randomMatrix3x2_dyn()); }
		if (HX_FIELD_EQ(inName,"randomMatrix3x3") ) { return hx::Val( randomMatrix3x3_dyn()); }
		if (HX_FIELD_EQ(inName,"randomMatrix4x4") ) { return hx::Val( randomMatrix4x4_dyn()); }
		break;
	case 16:
		if (HX_FIELD_EQ(inName,"randomQuaternion") ) { return hx::Val( randomQuaternion_dyn()); }
		if (HX_FIELD_EQ(inName,"randomIntVector2") ) { return hx::Val( randomIntVector2_dyn()); }
		break;
	case 18:
		if (HX_FIELD_EQ(inName,"assertApproxEquals") ) { return hx::Val( assertApproxEquals_dyn()); }
		if (HX_FIELD_EQ(inName,"randomShortVector2") ) { return hx::Val( randomShortVector2_dyn()); }
	}
	return super::__Field(inName,inCallProp);
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *MathTestCase_obj_sMemberStorageInfo = 0;
static hx::StaticInfo *MathTestCase_obj_sStaticStorageInfo = 0;
#endif

static ::String MathTestCase_obj_sMemberFields[] = {
	HX_HCSTRING("randomFloat","\x99","\xe8","\x2b","\x6d"),
	HX_HCSTRING("randomInt","\xac","\x86","\x45","\xa7"),
	HX_HCSTRING("randomArray","\x96","\x90","\x24","\x90"),
	HX_HCSTRING("assertApproxEquals","\xdf","\xd5","\x2a","\xbc"),
	HX_HCSTRING("randomVector2","\x4c","\x96","\xfe","\xee"),
	HX_HCSTRING("randomVector3","\x4d","\x96","\xfe","\xee"),
	HX_HCSTRING("randomVector4","\x4e","\x96","\xfe","\xee"),
	HX_HCSTRING("randomMatrix2x2","\x48","\xa7","\x09","\xd3"),
	HX_HCSTRING("randomMatrix3x2","\x89","\x69","\x0a","\xd3"),
	HX_HCSTRING("randomMatrix3x3","\x8a","\x69","\x0a","\xd3"),
	HX_HCSTRING("randomMatrix4x4","\xcc","\x2b","\x0b","\xd3"),
	HX_HCSTRING("randomQuaternion","\x01","\xf5","\xa3","\x7f"),
	HX_HCSTRING("randomIntVector2","\xc3","\x08","\xea","\x78"),
	HX_HCSTRING("randomShortVector2","\x96","\x4b","\xfc","\x41"),
	HX_HCSTRING("randomFrame2","\xc8","\x29","\x6f","\x84"),
	HX_HCSTRING("randomFrame3","\xc9","\x29","\x6f","\x84"),
	::String(null()) };

static void MathTestCase_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(MathTestCase_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void MathTestCase_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(MathTestCase_obj::__mClass,"__mClass");
};

#endif

hx::Class MathTestCase_obj::__mClass;

void MathTestCase_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("test.MathTestCase","\xc6","\x6f","\xee","\x25");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &hx::Class_obj::GetNoStaticField;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = MathTestCase_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(0 /* sStaticFields */);
	__mClass->mMembers = hx::Class_obj::dupFunctions(MathTestCase_obj_sMemberFields);
	__mClass->mCanCast = hx::TCanCast< MathTestCase_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = MathTestCase_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = MathTestCase_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = MathTestCase_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace test
