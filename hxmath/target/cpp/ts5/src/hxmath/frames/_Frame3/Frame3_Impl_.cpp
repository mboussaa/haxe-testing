// Generated by Haxe 3.3.0
#include <hxcpp.h>

#include "hxMath.h"
#ifndef INCLUDED_hxmath_frames_Frame3Default
#include <hxmath/frames/Frame3Default.h>
#endif
#ifndef INCLUDED_hxmath_frames_IFrame3
#include <hxmath/frames/IFrame3.h>
#endif
#ifndef INCLUDED_hxmath_frames__Frame3_Frame3_Impl_
#include <hxmath/frames/_Frame3/Frame3_Impl_.h>
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
#ifndef INCLUDED_hxmath_math_Vector3Default
#include <hxmath/math/Vector3Default.h>
#endif

namespace hxmath{
namespace frames{
namespace _Frame3{

void Frame3_Impl__obj::__construct() { }

Dynamic Frame3_Impl__obj::__CreateEmpty() { return new Frame3_Impl__obj; }

hx::ObjectPtr< Frame3_Impl__obj > Frame3_Impl__obj::__new()
{
	hx::ObjectPtr< Frame3_Impl__obj > _hx_result = new Frame3_Impl__obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic Frame3_Impl__obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< Frame3_Impl__obj > _hx_result = new Frame3_Impl__obj();
	_hx_result->__construct();
	return _hx_result;
}

::Dynamic Frame3_Impl__obj::_new( ::hxmath::math::Vector3Default offset, ::hxmath::math::QuaternionDefault orientation){
            	HX_STACK_FRAME("hxmath.frames._Frame3.Frame3_Impl_","_new",0x5f2f962e,"hxmath.frames._Frame3.Frame3_Impl_._new","hxmath/frames/Frame3.hx",25,0xed0aca66)
            	HX_STACK_ARG(offset,"offset")
            	HX_STACK_ARG(orientation,"orientation")
HXLINE(  25)		HX_VARI_NAME( ::Dynamic,this1,"this") =  ::hxmath::frames::Frame3Default_obj::__new(offset,orientation,null());
HXDLIN(  25)		return this1;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Frame3_Impl__obj,_new,return )

 ::hxmath::math::Matrix4x4Default Frame3_Impl__obj::calculateMatrix( ::hxmath::math::Matrix4x4Default matrix, ::hxmath::math::Vector3Default offset, ::hxmath::math::QuaternionDefault orientation){
            	HX_STACK_FRAME("hxmath.frames._Frame3.Frame3_Impl_","calculateMatrix",0x87fc989a,"hxmath.frames._Frame3.Frame3_Impl_.calculateMatrix","hxmath/frames/Frame3.hx",39,0xed0aca66)
            	HX_STACK_ARG(matrix,"matrix")
            	HX_STACK_ARG(offset,"offset")
            	HX_STACK_ARG(orientation,"orientation")
HXLINE(  41)		{
HXLINE(  41)			HX_VARI( Float,s) = orientation->s;
HXDLIN(  41)			HX_VARI( Float,x) = orientation->x;
HXDLIN(  41)			HX_VARI( Float,y) = orientation->y;
HXDLIN(  41)			HX_VARI( Float,z) = orientation->z;
HXDLIN(  41)			matrix->m00 = ((int)1 - ((int)2 * ((y * y) + (z * z))));
HXDLIN(  41)			matrix->m10 = ((int)2 * ((x * y) - (s * z)));
HXDLIN(  41)			matrix->m20 = ((int)2 * ((s * y) + (x * z)));
HXDLIN(  41)			matrix->m01 = ((int)2 * ((x * y) + (s * z)));
HXDLIN(  41)			matrix->m11 = ((int)1 - ((int)2 * ((x * x) + (z * z))));
HXDLIN(  41)			matrix->m21 = ((int)2 * ((y * z) - (s * x)));
HXDLIN(  41)			matrix->m02 = ((int)2 * ((x * z) - (s * y)));
HXDLIN(  41)			matrix->m12 = ((int)2 * ((y * z) + (s * x)));
HXDLIN(  41)			matrix->m22 = ((int)1 - ((int)2 * ((x * x) + (y * y))));
            		}
HXLINE(  42)		{
HXLINE(  42)			HX_VARI_NAME( Float,x1,"x") = offset->x;
HXDLIN(  42)			HX_VARI_NAME( Float,y1,"y") = offset->y;
HXDLIN(  42)			HX_VARI_NAME( Float,z1,"z") = offset->z;
HXDLIN(  42)			matrix->m30 = x1;
HXDLIN(  42)			matrix->m31 = y1;
HXDLIN(  42)			matrix->m32 = z1;
HXDLIN(  42)			matrix->m33 = ((Float)1.0);
            		}
HXLINE(  43)		return matrix;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(Frame3_Impl__obj,calculateMatrix,return )

::Dynamic Frame3_Impl__obj::lerp(::Dynamic frameA,::Dynamic frameB,Float t){
            	HX_STACK_FRAME("hxmath.frames._Frame3.Frame3_Impl_","lerp",0x67c09344,"hxmath.frames._Frame3.Frame3_Impl_.lerp","hxmath/frames/Frame3.hx",56,0xed0aca66)
            	HX_STACK_ARG(frameA,"frameA")
            	HX_STACK_ARG(frameB,"frameB")
            	HX_STACK_ARG(t,"t")
HXLINE(  57)		HX_VARI(  ::hxmath::math::Vector3Default,a) = ( ( ::hxmath::math::Vector3Default)( ::Dynamic(frameA->__Field(HX_("get_offset",5c,07,c7,50),hx::paccDynamic))()) );
HXDLIN(  57)		HX_VARI(  ::hxmath::math::Vector3Default,b) = ( ( ::hxmath::math::Vector3Default)( ::Dynamic(frameB->__Field(HX_("get_offset",5c,07,c7,50),hx::paccDynamic))()) );
HXDLIN(  57)		 ::hxmath::math::Vector3Default _hx_tmp =  ::hxmath::math::Vector3Default_obj::__new((((((Float)1.0) - t) * a->x) + (t * b->x)),(((((Float)1.0) - t) * a->y) + (t * b->y)),(((((Float)1.0) - t) * a->z) + (t * b->z)));
HXLINE(  58)		HX_VARI_NAME(  ::hxmath::math::QuaternionDefault,a1,"a") = ( ( ::hxmath::math::QuaternionDefault)( ::Dynamic(frameA->__Field(HX_("get_orientation",67,a6,e0,be),hx::paccDynamic))()) );
HXDLIN(  58)		HX_VARI_NAME(  ::hxmath::math::QuaternionDefault,b1,"b") = ( ( ::hxmath::math::QuaternionDefault)( ::Dynamic(frameB->__Field(HX_("get_orientation",67,a6,e0,be),hx::paccDynamic))()) );
HXDLIN(  58)		HX_VARI( Float,s) = (((Float)1.0) - t);
HXDLIN(  58)		HX_VARI(  ::hxmath::math::QuaternionDefault,self) =  ::hxmath::math::QuaternionDefault_obj::__new(a1->s,a1->x,a1->y,a1->z);
HXDLIN(  58)		hx::MultEq(self->s,s);
HXDLIN(  58)		hx::MultEq(self->x,s);
HXDLIN(  58)		hx::MultEq(self->y,s);
HXDLIN(  58)		hx::MultEq(self->z,s);
HXDLIN(  58)		HX_VARI_NAME(  ::hxmath::math::QuaternionDefault,self1,"self") =  ::hxmath::math::QuaternionDefault_obj::__new(b1->s,b1->x,b1->y,b1->z);
HXDLIN(  58)		hx::MultEq(self1->s,t);
HXDLIN(  58)		hx::MultEq(self1->x,t);
HXDLIN(  58)		hx::MultEq(self1->y,t);
HXDLIN(  58)		hx::MultEq(self1->z,t);
HXDLIN(  58)		HX_VARI_NAME(  ::hxmath::math::QuaternionDefault,self2,"self") =  ::hxmath::math::QuaternionDefault_obj::__new(self->s,self->x,self->y,self->z);
HXDLIN(  58)		hx::AddEq(self2->s,self1->s);
HXDLIN(  58)		hx::AddEq(self2->x,self1->x);
HXDLIN(  58)		hx::AddEq(self2->y,self1->y);
HXDLIN(  58)		hx::AddEq(self2->z,self1->z);
HXLINE(  56)		return ::hxmath::frames::_Frame3::Frame3_Impl__obj::_new(_hx_tmp,self2);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(Frame3_Impl__obj,lerp,return )

::Dynamic Frame3_Impl__obj::concat(::Dynamic this1,::Dynamic other){
            	HX_STACK_FRAME("hxmath.frames._Frame3.Frame3_Impl_","concat",0x6d9c1721,"hxmath.frames._Frame3.Frame3_Impl_.concat","hxmath/frames/Frame3.hx",70,0xed0aca66)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(other,"other")
HXLINE(  71)		HX_VARI( ::Dynamic,self) = this1;
HXLINE(  72)		 ::hxmath::math::Vector3Default _hx_tmp = ( ( ::hxmath::math::Vector3Default)( ::Dynamic(self->__Field(HX_("get_offset",5c,07,c7,50),hx::paccDynamic))()) );
HXDLIN(  72)		 ::hxmath::math::QuaternionDefault _hx_tmp1 = ( ( ::hxmath::math::QuaternionDefault)( ::Dynamic(self->__Field(HX_("get_orientation",67,a6,e0,be),hx::paccDynamic))()) );
HXDLIN(  72)		HX_VARI_NAME( ::Dynamic,self1,"self") = ::hxmath::frames::_Frame3::Frame3_Impl__obj::_new(_hx_tmp,_hx_tmp1);
HXDLIN(  72)		HX_VARI_NAME(  ::hxmath::math::QuaternionDefault,this2,"this") = ( ( ::hxmath::math::QuaternionDefault)( ::Dynamic(self1->__Field(HX_("get_orientation",67,a6,e0,be),hx::paccDynamic))()) );
HXDLIN(  72)		HX_VARI(  ::hxmath::math::Vector3Default,u) = ( ( ::hxmath::math::Vector3Default)( ::Dynamic(other->__Field(HX_("get_offset",5c,07,c7,50),hx::paccDynamic))()) );
HXDLIN(  72)		HX_VARI_NAME(  ::hxmath::math::QuaternionDefault,self2,"self") = this2;
HXDLIN(  72)		HX_VARI( Float,a) = (((Float)2.0) * (((self2->x * u->x) + (self2->y * u->y)) + (self2->z * u->z)));
HXDLIN(  72)		HX_VARI( Float,b) = ((((self2->s * self2->s) - (self2->x * self2->x)) - (self2->y * self2->y)) - (self2->z * self2->z));
HXDLIN(  72)		HX_VARI( Float,c) = (((Float)2.0) * self2->s);
HXDLIN(  72)		HX_VARI_NAME(  ::hxmath::math::Vector3Default,this3,"this") =  ::hxmath::math::Vector3Default_obj::__new((((a * self2->x) + (b * u->x)) + (c * ((self2->y * u->z) - (self2->z * u->y)))),(((a * self2->y) + (b * u->y)) + (c * ((self2->z * u->x) - (self2->x * u->z)))),(((a * self2->z) + (b * u->z)) + (c * ((self2->x * u->y) - (self2->y * u->x)))));
HXDLIN(  72)		HX_VARI_NAME(  ::hxmath::math::Vector3Default,a1,"a") = ( ( ::hxmath::math::Vector3Default)( ::Dynamic(self1->__Field(HX_("get_offset",5c,07,c7,50),hx::paccDynamic))()) );
HXDLIN(  72)		HX_VARI_NAME(  ::hxmath::math::Vector3Default,self3,"self") = this3;
HXDLIN(  72)		hx::AddEq(self3->x,a1->x);
HXDLIN(  72)		hx::AddEq(self3->y,a1->y);
HXDLIN(  72)		hx::AddEq(self3->z,a1->z);
HXDLIN(  72)		HX_VARI_NAME(  ::hxmath::math::QuaternionDefault,a2,"a") = ( ( ::hxmath::math::QuaternionDefault)( ::Dynamic(self1->__Field(HX_("get_orientation",67,a6,e0,be),hx::paccDynamic))()) );
HXDLIN(  72)		HX_VARI_NAME(  ::hxmath::math::QuaternionDefault,b1,"b") = ( ( ::hxmath::math::QuaternionDefault)( ::Dynamic(other->__Field(HX_("get_orientation",67,a6,e0,be),hx::paccDynamic))()) );
HXDLIN(  72)		HX_VARI_NAME(  ::hxmath::math::QuaternionDefault,self4,"self") =  ::hxmath::math::QuaternionDefault_obj::__new(((((a2->s * b1->s) - (a2->x * b1->x)) - (a2->y * b1->y)) - (a2->z * b1->z)),((((a2->s * b1->x) + (b1->s * a2->x)) + (a2->y * b1->z)) - (a2->z * b1->y)),((((a2->s * b1->y) + (b1->s * a2->y)) + (a2->z * b1->x)) - (a2->x * b1->z)),((((a2->s * b1->z) + (b1->s * a2->z)) + (a2->x * b1->y)) - (a2->y * b1->x)));
HXDLIN(  72)		Float _hx_tmp2 = ((((self4->s * self4->s) + (self4->x * self4->x)) + (self4->y * self4->y)) + (self4->z * self4->z));
HXDLIN(  72)		Float _hx_tmp3 = ::Math_obj::sqrt(_hx_tmp2);
HXDLIN(  72)		HX_VARI( Float,_g) = ((Float)((Float)1.0) / (Float)_hx_tmp3);
HXDLIN(  72)		HX_VARI_NAME(  ::hxmath::math::QuaternionDefault,self5,"self") =  ::hxmath::math::QuaternionDefault_obj::__new(self4->s,self4->x,self4->y,self4->z);
HXDLIN(  72)		hx::MultEq(self5->s,_g);
HXDLIN(  72)		hx::MultEq(self5->x,_g);
HXDLIN(  72)		hx::MultEq(self5->y,_g);
HXDLIN(  72)		hx::MultEq(self5->z,_g);
HXDLIN(  72)		 ::Dynamic(self1->__Field(HX_("set_orientation",73,23,ac,ba),hx::paccDynamic))(self5);
HXDLIN(  72)		 ::Dynamic(self1->__Field(HX_("set_offset",d0,a5,44,54),hx::paccDynamic))(self3);
HXDLIN(  72)		return self1;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Frame3_Impl__obj,concat,return )

::Dynamic Frame3_Impl__obj::concatWith(::Dynamic this1,::Dynamic other){
            	HX_STACK_FRAME("hxmath.frames._Frame3.Frame3_Impl_","concatWith",0xdcfe5dc7,"hxmath.frames._Frame3.Frame3_Impl_.concatWith","hxmath/frames/Frame3.hx",85,0xed0aca66)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(other,"other")
HXLINE(  86)		HX_VARI( ::Dynamic,self) = this1;
HXLINE(  87)		HX_VARI_NAME(  ::hxmath::math::QuaternionDefault,this2,"this") = ( ( ::hxmath::math::QuaternionDefault)( ::Dynamic(self->__Field(HX_("get_orientation",67,a6,e0,be),hx::paccDynamic))()) );
HXDLIN(  87)		HX_VARI(  ::hxmath::math::Vector3Default,u) = ( ( ::hxmath::math::Vector3Default)( ::Dynamic(other->__Field(HX_("get_offset",5c,07,c7,50),hx::paccDynamic))()) );
HXDLIN(  87)		HX_VARI_NAME(  ::hxmath::math::QuaternionDefault,self1,"self") = this2;
HXDLIN(  87)		HX_VARI( Float,a) = (((Float)2.0) * (((self1->x * u->x) + (self1->y * u->y)) + (self1->z * u->z)));
HXDLIN(  87)		HX_VARI( Float,b) = ((((self1->s * self1->s) - (self1->x * self1->x)) - (self1->y * self1->y)) - (self1->z * self1->z));
HXDLIN(  87)		HX_VARI( Float,c) = (((Float)2.0) * self1->s);
HXDLIN(  87)		HX_VARI_NAME(  ::hxmath::math::Vector3Default,this3,"this") =  ::hxmath::math::Vector3Default_obj::__new((((a * self1->x) + (b * u->x)) + (c * ((self1->y * u->z) - (self1->z * u->y)))),(((a * self1->y) + (b * u->y)) + (c * ((self1->z * u->x) - (self1->x * u->z)))),(((a * self1->z) + (b * u->z)) + (c * ((self1->x * u->y) - (self1->y * u->x)))));
HXDLIN(  87)		HX_VARI_NAME(  ::hxmath::math::Vector3Default,a1,"a") = ( ( ::hxmath::math::Vector3Default)( ::Dynamic(self->__Field(HX_("get_offset",5c,07,c7,50),hx::paccDynamic))()) );
HXDLIN(  87)		HX_VARI_NAME(  ::hxmath::math::Vector3Default,self2,"self") = this3;
HXDLIN(  87)		hx::AddEq(self2->x,a1->x);
HXDLIN(  87)		hx::AddEq(self2->y,a1->y);
HXDLIN(  87)		hx::AddEq(self2->z,a1->z);
HXLINE(  90)		HX_VARI_NAME(  ::hxmath::math::QuaternionDefault,a2,"a") = ( ( ::hxmath::math::QuaternionDefault)( ::Dynamic(self->__Field(HX_("get_orientation",67,a6,e0,be),hx::paccDynamic))()) );
HXDLIN(  90)		HX_VARI_NAME(  ::hxmath::math::QuaternionDefault,b1,"b") = ( ( ::hxmath::math::QuaternionDefault)( ::Dynamic(other->__Field(HX_("get_orientation",67,a6,e0,be),hx::paccDynamic))()) );
HXDLIN(  90)		HX_VARI_NAME(  ::hxmath::math::QuaternionDefault,self3,"self") =  ::hxmath::math::QuaternionDefault_obj::__new(((((a2->s * b1->s) - (a2->x * b1->x)) - (a2->y * b1->y)) - (a2->z * b1->z)),((((a2->s * b1->x) + (b1->s * a2->x)) + (a2->y * b1->z)) - (a2->z * b1->y)),((((a2->s * b1->y) + (b1->s * a2->y)) + (a2->z * b1->x)) - (a2->x * b1->z)),((((a2->s * b1->z) + (b1->s * a2->z)) + (a2->x * b1->y)) - (a2->y * b1->x)));
HXDLIN(  90)		Float _hx_tmp = ((((self3->s * self3->s) + (self3->x * self3->x)) + (self3->y * self3->y)) + (self3->z * self3->z));
HXDLIN(  90)		Float _hx_tmp1 = ::Math_obj::sqrt(_hx_tmp);
HXDLIN(  90)		HX_VARI( Float,_g) = ((Float)((Float)1.0) / (Float)_hx_tmp1);
HXDLIN(  90)		HX_VARI_NAME(  ::hxmath::math::QuaternionDefault,self4,"self") =  ::hxmath::math::QuaternionDefault_obj::__new(self3->s,self3->x,self3->y,self3->z);
HXDLIN(  90)		hx::MultEq(self4->s,_g);
HXDLIN(  90)		hx::MultEq(self4->x,_g);
HXDLIN(  90)		hx::MultEq(self4->y,_g);
HXDLIN(  90)		hx::MultEq(self4->z,_g);
HXDLIN(  90)		 ::Dynamic(self->__Field(HX_("set_orientation",73,23,ac,ba),hx::paccDynamic))(self4);
HXLINE(  91)		 ::Dynamic(self->__Field(HX_("set_offset",d0,a5,44,54),hx::paccDynamic))(self2);
HXLINE(  92)		return self;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Frame3_Impl__obj,concatWith,return )

 ::hxmath::math::Vector3Default Frame3_Impl__obj::transformFrom(::Dynamic this1, ::hxmath::math::Vector3Default p){
            	HX_STACK_FRAME("hxmath.frames._Frame3.Frame3_Impl_","transformFrom",0x0691a289,"hxmath.frames._Frame3.Frame3_Impl_.transformFrom","hxmath/frames/Frame3.hx",102,0xed0aca66)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(p,"p")
HXLINE( 103)		HX_VARI( ::Dynamic,self) = this1;
HXLINE( 104)		HX_VARI_NAME(  ::hxmath::math::QuaternionDefault,this2,"this") = ( ( ::hxmath::math::QuaternionDefault)( ::Dynamic(self->__Field(HX_("get_orientation",67,a6,e0,be),hx::paccDynamic))()) );
HXDLIN( 104)		HX_VARI_NAME(  ::hxmath::math::QuaternionDefault,self1,"self") = this2;
HXDLIN( 104)		HX_VARI( Float,a) = (((Float)2.0) * (((self1->x * p->x) + (self1->y * p->y)) + (self1->z * p->z)));
HXDLIN( 104)		HX_VARI( Float,b) = ((((self1->s * self1->s) - (self1->x * self1->x)) - (self1->y * self1->y)) - (self1->z * self1->z));
HXDLIN( 104)		HX_VARI( Float,c) = (((Float)2.0) * self1->s);
HXDLIN( 104)		HX_VARI_NAME(  ::hxmath::math::Vector3Default,this3,"this") =  ::hxmath::math::Vector3Default_obj::__new((((a * self1->x) + (b * p->x)) + (c * ((self1->y * p->z) - (self1->z * p->y)))),(((a * self1->y) + (b * p->y)) + (c * ((self1->z * p->x) - (self1->x * p->z)))),(((a * self1->z) + (b * p->z)) + (c * ((self1->x * p->y) - (self1->y * p->x)))));
HXDLIN( 104)		HX_VARI_NAME(  ::hxmath::math::Vector3Default,a1,"a") = ( ( ::hxmath::math::Vector3Default)( ::Dynamic(self->__Field(HX_("get_offset",5c,07,c7,50),hx::paccDynamic))()) );
HXDLIN( 104)		HX_VARI_NAME(  ::hxmath::math::Vector3Default,self2,"self") = this3;
HXDLIN( 104)		hx::AddEq(self2->x,a1->x);
HXDLIN( 104)		hx::AddEq(self2->y,a1->y);
HXDLIN( 104)		hx::AddEq(self2->z,a1->z);
HXDLIN( 104)		return self2;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Frame3_Impl__obj,transformFrom,return )

 ::hxmath::math::Vector3Default Frame3_Impl__obj::transformTo(::Dynamic this1, ::hxmath::math::Vector3Default p){
            	HX_STACK_FRAME("hxmath.frames._Frame3.Frame3_Impl_","transformTo",0x3b2f8cda,"hxmath.frames._Frame3.Frame3_Impl_.transformTo","hxmath/frames/Frame3.hx",116,0xed0aca66)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(p,"p")
HXLINE( 117)		HX_VARI( ::Dynamic,self) = this1;
HXLINE( 118)		HX_VARI_NAME(  ::hxmath::math::QuaternionDefault,this2,"this") = ( ( ::hxmath::math::QuaternionDefault)( ::Dynamic(self->__Field(HX_("get_orientation",67,a6,e0,be),hx::paccDynamic))()) );
HXDLIN( 118)		HX_VARI_NAME(  ::hxmath::math::QuaternionDefault,self1,"self") = this2;
HXDLIN( 118)		HX_VARI_NAME(  ::hxmath::math::QuaternionDefault,self2,"self") =  ::hxmath::math::QuaternionDefault_obj::__new(self1->s,self1->x,self1->y,self1->z);
HXDLIN( 118)		self2->x = -(self2->x);
HXDLIN( 118)		self2->y = -(self2->y);
HXDLIN( 118)		self2->z = -(self2->z);
HXDLIN( 118)		HX_VARI_NAME(  ::hxmath::math::QuaternionDefault,self3,"self") = self2;
HXDLIN( 118)		Float _hx_tmp = ((((self3->s * self3->s) + (self3->x * self3->x)) + (self3->y * self3->y)) + (self3->z * self3->z));
HXDLIN( 118)		HX_VARI( Float,length) = ::Math_obj::sqrt(_hx_tmp);
HXDLIN( 118)		if ((length > ((Float)0.0))) {
HXLINE( 118)			HX_VARI( Float,k) = ((Float)((Float)1.0) / (Float)length);
HXDLIN( 118)			{
HXLINE( 118)				hx::MultEq(self3->s,k);
HXDLIN( 118)				hx::MultEq(self3->x,k);
HXDLIN( 118)				hx::MultEq(self3->y,k);
HXDLIN( 118)				hx::MultEq(self3->z,k);
            			}
            		}
HXDLIN( 118)		HX_VARI_NAME(  ::hxmath::math::QuaternionDefault,this3,"this") = self3;
HXLINE( 120)		HX_VARI(  ::hxmath::math::Vector3Default,b) = ( ( ::hxmath::math::Vector3Default)( ::Dynamic(self->__Field(HX_("get_offset",5c,07,c7,50),hx::paccDynamic))()) );
HXDLIN( 120)		HX_VARI_NAME(  ::hxmath::math::Vector3Default,self4,"self") =  ::hxmath::math::Vector3Default_obj::__new(p->x,p->y,p->z);
HXDLIN( 120)		hx::SubEq(self4->x,b->x);
HXDLIN( 120)		hx::SubEq(self4->y,b->y);
HXDLIN( 120)		hx::SubEq(self4->z,b->z);
HXLINE( 118)		HX_VARI_NAME(  ::hxmath::math::QuaternionDefault,self5,"self") = this3;
HXDLIN( 118)		HX_VARI( Float,a) = (((Float)2.0) * (((self5->x * self4->x) + (self5->y * self4->y)) + (self5->z * self4->z)));
HXDLIN( 118)		HX_VARI_NAME( Float,b1,"b") = ((((self5->s * self5->s) - (self5->x * self5->x)) - (self5->y * self5->y)) - (self5->z * self5->z));
HXDLIN( 118)		HX_VARI( Float,c) = (((Float)2.0) * self5->s);
HXDLIN( 118)		return  ::hxmath::math::Vector3Default_obj::__new((((a * self5->x) + (b1 * self4->x)) + (c * ((self5->y * self4->z) - (self5->z * self4->y)))),(((a * self5->y) + (b1 * self4->y)) + (c * ((self5->z * self4->x) - (self5->x * self4->z)))),(((a * self5->z) + (b1 * self4->z)) + (c * ((self5->x * self4->y) - (self5->y * self4->x)))));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Frame3_Impl__obj,transformTo,return )

 ::hxmath::math::Vector3Default Frame3_Impl__obj::linearTransformFrom(::Dynamic this1, ::hxmath::math::Vector3Default v){
            	HX_STACK_FRAME("hxmath.frames._Frame3.Frame3_Impl_","linearTransformFrom",0x6cdd85a4,"hxmath.frames._Frame3.Frame3_Impl_.linearTransformFrom","hxmath/frames/Frame3.hx",130,0xed0aca66)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(v,"v")
HXLINE( 131)		HX_VARI( ::Dynamic,self) = this1;
HXLINE( 132)		HX_VARI_NAME(  ::hxmath::math::QuaternionDefault,this2,"this") = ( ( ::hxmath::math::QuaternionDefault)( ::Dynamic(self->__Field(HX_("get_orientation",67,a6,e0,be),hx::paccDynamic))()) );
HXDLIN( 132)		HX_VARI_NAME(  ::hxmath::math::QuaternionDefault,self1,"self") = this2;
HXDLIN( 132)		HX_VARI( Float,a) = (((Float)2.0) * (((self1->x * v->x) + (self1->y * v->y)) + (self1->z * v->z)));
HXDLIN( 132)		HX_VARI( Float,b) = ((((self1->s * self1->s) - (self1->x * self1->x)) - (self1->y * self1->y)) - (self1->z * self1->z));
HXDLIN( 132)		HX_VARI( Float,c) = (((Float)2.0) * self1->s);
HXDLIN( 132)		return  ::hxmath::math::Vector3Default_obj::__new((((a * self1->x) + (b * v->x)) + (c * ((self1->y * v->z) - (self1->z * v->y)))),(((a * self1->y) + (b * v->y)) + (c * ((self1->z * v->x) - (self1->x * v->z)))),(((a * self1->z) + (b * v->z)) + (c * ((self1->x * v->y) - (self1->y * v->x)))));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Frame3_Impl__obj,linearTransformFrom,return )

 ::hxmath::math::Vector3Default Frame3_Impl__obj::linearTransformTo(::Dynamic this1, ::hxmath::math::Vector3Default v){
            	HX_STACK_FRAME("hxmath.frames._Frame3.Frame3_Impl_","linearTransformTo",0x34b4e335,"hxmath.frames._Frame3.Frame3_Impl_.linearTransformTo","hxmath/frames/Frame3.hx",143,0xed0aca66)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(v,"v")
HXLINE( 144)		HX_VARI( ::Dynamic,self) = this1;
HXLINE( 145)		HX_VARI_NAME(  ::hxmath::math::QuaternionDefault,this2,"this") = ( ( ::hxmath::math::QuaternionDefault)( ::Dynamic(self->__Field(HX_("get_orientation",67,a6,e0,be),hx::paccDynamic))()) );
HXDLIN( 145)		HX_VARI_NAME(  ::hxmath::math::QuaternionDefault,self1,"self") = this2;
HXDLIN( 145)		HX_VARI_NAME(  ::hxmath::math::QuaternionDefault,self2,"self") =  ::hxmath::math::QuaternionDefault_obj::__new(self1->s,self1->x,self1->y,self1->z);
HXDLIN( 145)		self2->x = -(self2->x);
HXDLIN( 145)		self2->y = -(self2->y);
HXDLIN( 145)		self2->z = -(self2->z);
HXDLIN( 145)		HX_VARI_NAME(  ::hxmath::math::QuaternionDefault,self3,"self") = self2;
HXDLIN( 145)		Float _hx_tmp = ((((self3->s * self3->s) + (self3->x * self3->x)) + (self3->y * self3->y)) + (self3->z * self3->z));
HXDLIN( 145)		HX_VARI( Float,length) = ::Math_obj::sqrt(_hx_tmp);
HXDLIN( 145)		if ((length > ((Float)0.0))) {
HXLINE( 145)			HX_VARI( Float,k) = ((Float)((Float)1.0) / (Float)length);
HXDLIN( 145)			{
HXLINE( 145)				hx::MultEq(self3->s,k);
HXDLIN( 145)				hx::MultEq(self3->x,k);
HXDLIN( 145)				hx::MultEq(self3->y,k);
HXDLIN( 145)				hx::MultEq(self3->z,k);
            			}
            		}
HXDLIN( 145)		HX_VARI_NAME(  ::hxmath::math::QuaternionDefault,self4,"self") = self3;
HXDLIN( 145)		HX_VARI( Float,a) = (((Float)2.0) * (((self4->x * v->x) + (self4->y * v->y)) + (self4->z * v->z)));
HXDLIN( 145)		HX_VARI( Float,b) = ((((self4->s * self4->s) - (self4->x * self4->x)) - (self4->y * self4->y)) - (self4->z * self4->z));
HXDLIN( 145)		HX_VARI( Float,c) = (((Float)2.0) * self4->s);
HXDLIN( 145)		return  ::hxmath::math::Vector3Default_obj::__new((((a * self4->x) + (b * v->x)) + (c * ((self4->y * v->z) - (self4->z * v->y)))),(((a * self4->y) + (b * v->y)) + (c * ((self4->z * v->x) - (self4->x * v->z)))),(((a * self4->z) + (b * v->z)) + (c * ((self4->x * v->y) - (self4->y * v->x)))));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Frame3_Impl__obj,linearTransformTo,return )

::Dynamic Frame3_Impl__obj::inverse(::Dynamic this1){
            	HX_STACK_FRAME("hxmath.frames._Frame3.Frame3_Impl_","inverse",0xaab18903,"hxmath.frames._Frame3.Frame3_Impl_.inverse","hxmath/frames/Frame3.hx",156,0xed0aca66)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 157)		HX_VARI( ::Dynamic,self) = this1;
HXLINE( 158)		HX_VARI_NAME(  ::hxmath::math::QuaternionDefault,this2,"this") = ( ( ::hxmath::math::QuaternionDefault)( ::Dynamic(self->__Field(HX_("get_orientation",67,a6,e0,be),hx::paccDynamic))()) );
HXDLIN( 158)		HX_VARI_NAME(  ::hxmath::math::QuaternionDefault,self1,"self") = this2;
HXDLIN( 158)		HX_VARI_NAME(  ::hxmath::math::QuaternionDefault,self2,"self") =  ::hxmath::math::QuaternionDefault_obj::__new(self1->s,self1->x,self1->y,self1->z);
HXDLIN( 158)		self2->x = -(self2->x);
HXDLIN( 158)		self2->y = -(self2->y);
HXDLIN( 158)		self2->z = -(self2->z);
HXDLIN( 158)		HX_VARI_NAME(  ::hxmath::math::QuaternionDefault,self3,"self") = self2;
HXDLIN( 158)		Float _hx_tmp = ((((self3->s * self3->s) + (self3->x * self3->x)) + (self3->y * self3->y)) + (self3->z * self3->z));
HXDLIN( 158)		HX_VARI( Float,length) = ::Math_obj::sqrt(_hx_tmp);
HXDLIN( 158)		if ((length > ((Float)0.0))) {
HXLINE( 158)			HX_VARI( Float,k) = ((Float)((Float)1.0) / (Float)length);
HXDLIN( 158)			{
HXLINE( 158)				hx::MultEq(self3->s,k);
HXDLIN( 158)				hx::MultEq(self3->x,k);
HXDLIN( 158)				hx::MultEq(self3->y,k);
HXDLIN( 158)				hx::MultEq(self3->z,k);
            			}
            		}
HXLINE( 162)		HX_VARI(  ::hxmath::math::Vector3Default,u) = ( ( ::hxmath::math::Vector3Default)( ::Dynamic(self->__Field(HX_("get_offset",5c,07,c7,50),hx::paccDynamic))()) );
HXDLIN( 162)		HX_VARI( Float,a) = (((Float)2.0) * (((self3->x * u->x) + (self3->y * u->y)) + (self3->z * u->z)));
HXDLIN( 162)		HX_VARI( Float,b) = ((((self3->s * self3->s) - (self3->x * self3->x)) - (self3->y * self3->y)) - (self3->z * self3->z));
HXDLIN( 162)		HX_VARI( Float,c) = (((Float)2.0) * self3->s);
HXDLIN( 162)		HX_VARI_NAME(  ::hxmath::math::Vector3Default,self4,"self") =  ::hxmath::math::Vector3Default_obj::__new((((a * self3->x) + (b * u->x)) + (c * ((self3->y * u->z) - (self3->z * u->y)))),(((a * self3->y) + (b * u->y)) + (c * ((self3->z * u->x) - (self3->x * u->z)))),(((a * self3->z) + (b * u->z)) + (c * ((self3->x * u->y) - (self3->y * u->x)))));
HXDLIN( 162)		self4->x = -(self4->x);
HXDLIN( 162)		self4->y = -(self4->y);
HXDLIN( 162)		self4->z = -(self4->z);
HXLINE( 161)		return ::hxmath::frames::_Frame3::Frame3_Impl__obj::_new(self4,self3);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Frame3_Impl__obj,inverse,return )

::Dynamic Frame3_Impl__obj::clone(::Dynamic this1){
            	HX_STACK_FRAME("hxmath.frames._Frame3.Frame3_Impl_","clone",0x36c345f0,"hxmath.frames._Frame3.Frame3_Impl_.clone","hxmath/frames/Frame3.hx",174,0xed0aca66)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 175)		HX_VARI( ::Dynamic,self) = this1;
HXLINE( 176)		 ::hxmath::math::Vector3Default _hx_tmp = ( ( ::hxmath::math::Vector3Default)( ::Dynamic(self->__Field(HX_("get_offset",5c,07,c7,50),hx::paccDynamic))()) );
HXDLIN( 176)		 ::hxmath::math::QuaternionDefault _hx_tmp1 = ( ( ::hxmath::math::QuaternionDefault)( ::Dynamic(self->__Field(HX_("get_orientation",67,a6,e0,be),hx::paccDynamic))()) );
HXDLIN( 176)		return ::hxmath::frames::_Frame3::Frame3_Impl__obj::_new(_hx_tmp,_hx_tmp1);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Frame3_Impl__obj,clone,return )

 ::hxmath::math::Matrix3x3Default Frame3_Impl__obj::get_linearMatrix(::Dynamic this1){
            	HX_STACK_FRAME("hxmath.frames._Frame3.Frame3_Impl_","get_linearMatrix",0xa8d6e2dc,"hxmath.frames._Frame3.Frame3_Impl_.get_linearMatrix","hxmath/frames/Frame3.hx",180,0xed0aca66)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 181)		HX_VARI( ::Dynamic,self) = this1;
HXLINE( 182)		HX_VARI_NAME(  ::hxmath::math::Matrix4x4Default,this2,"this") = ( ( ::hxmath::math::Matrix4x4Default)( ::Dynamic(self->__Field(HX_("get_matrix",0a,a6,4f,ac),hx::paccDynamic))()) );
HXDLIN( 182)		HX_VARI_NAME(  ::hxmath::math::Matrix4x4Default,self1,"self") = this2;
HXDLIN( 182)		return  ::hxmath::math::Matrix3x3Default_obj::__new(self1->m00,self1->m10,self1->m20,self1->m01,self1->m11,self1->m21,self1->m02,self1->m12,self1->m22);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Frame3_Impl__obj,get_linearMatrix,return )


Frame3_Impl__obj::Frame3_Impl__obj()
{
}

bool Frame3_Impl__obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 4:
		if (HX_FIELD_EQ(inName,"_new") ) { outValue = _new_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"lerp") ) { outValue = lerp_dyn(); return true; }
		break;
	case 5:
		if (HX_FIELD_EQ(inName,"clone") ) { outValue = clone_dyn(); return true; }
		break;
	case 6:
		if (HX_FIELD_EQ(inName,"concat") ) { outValue = concat_dyn(); return true; }
		break;
	case 7:
		if (HX_FIELD_EQ(inName,"inverse") ) { outValue = inverse_dyn(); return true; }
		break;
	case 10:
		if (HX_FIELD_EQ(inName,"concatWith") ) { outValue = concatWith_dyn(); return true; }
		break;
	case 11:
		if (HX_FIELD_EQ(inName,"transformTo") ) { outValue = transformTo_dyn(); return true; }
		break;
	case 13:
		if (HX_FIELD_EQ(inName,"transformFrom") ) { outValue = transformFrom_dyn(); return true; }
		break;
	case 15:
		if (HX_FIELD_EQ(inName,"calculateMatrix") ) { outValue = calculateMatrix_dyn(); return true; }
		break;
	case 16:
		if (HX_FIELD_EQ(inName,"get_linearMatrix") ) { outValue = get_linearMatrix_dyn(); return true; }
		break;
	case 17:
		if (HX_FIELD_EQ(inName,"linearTransformTo") ) { outValue = linearTransformTo_dyn(); return true; }
		break;
	case 19:
		if (HX_FIELD_EQ(inName,"linearTransformFrom") ) { outValue = linearTransformFrom_dyn(); return true; }
	}
	return false;
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *Frame3_Impl__obj_sMemberStorageInfo = 0;
static hx::StaticInfo *Frame3_Impl__obj_sStaticStorageInfo = 0;
#endif

static void Frame3_Impl__obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(Frame3_Impl__obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void Frame3_Impl__obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(Frame3_Impl__obj::__mClass,"__mClass");
};

#endif

hx::Class Frame3_Impl__obj::__mClass;

static ::String Frame3_Impl__obj_sStaticFields[] = {
	HX_HCSTRING("_new","\x61","\x15","\x1f","\x3f"),
	HX_HCSTRING("calculateMatrix","\x47","\x50","\xf2","\x70"),
	HX_HCSTRING("lerp","\x77","\x12","\xb0","\x47"),
	HX_HCSTRING("concat","\x14","\x09","\xd0","\xc7"),
	HX_HCSTRING("concatWith","\x3a","\xc5","\xdd","\x48"),
	HX_HCSTRING("transformFrom","\xf6","\x24","\x10","\x71"),
	HX_HCSTRING("transformTo","\x07","\xaa","\xca","\x32"),
	HX_HCSTRING("linearTransformFrom","\xd1","\x17","\xcd","\x64"),
	HX_HCSTRING("linearTransformTo","\x22","\xa0","\x49","\x90"),
	HX_HCSTRING("inverse","\xb0","\x4b","\xf1","\x3d"),
	HX_HCSTRING("clone","\x5d","\x13","\x63","\x48"),
	HX_HCSTRING("get_linearMatrix","\x8f","\xe2","\xe1","\x96"),
	::String(null())
};

void Frame3_Impl__obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("hxmath.frames._Frame3.Frame3_Impl_","\xc1","\x92","\xcd","\x5a");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &Frame3_Impl__obj::__GetStatic;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = Frame3_Impl__obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(Frame3_Impl__obj_sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< Frame3_Impl__obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = Frame3_Impl__obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = Frame3_Impl__obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = Frame3_Impl__obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace hxmath
} // end namespace frames
} // end namespace _Frame3
