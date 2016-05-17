// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_haxe_Log
#include <haxe/Log.h>
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
#ifndef INCLUDED_hxmath_math_Vector2Default
#include <hxmath/math/Vector2Default.h>
#endif
#ifndef INCLUDED_nanotest_NanoTestAssertResult
#include <nanotest/NanoTestAssertResult.h>
#endif
#ifndef INCLUDED_nanotest_NanoTestCase
#include <nanotest/NanoTestCase.h>
#endif
#ifndef INCLUDED_test_MathTestCase
#include <test/MathTestCase.h>
#endif
#ifndef INCLUDED_test_TestStress
#include <test/TestStress.h>
#endif

namespace test{

void TestStress_obj::__construct( ::Dynamic posInfos){
            	HX_STACK_FRAME("test.TestStress","new",0xd854c2d4,"test.TestStress.new","test/TestStress.hx",7,0x4c41c67b)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(posInfos,"posInfos")
HXLINE(   8)		this->a = (int)5;
HXLINE(   7)		super::__construct(posInfos);
            	}

Dynamic TestStress_obj::__CreateEmpty() { return new TestStress_obj; }

hx::ObjectPtr< TestStress_obj > TestStress_obj::__new( ::Dynamic posInfos)
{
	hx::ObjectPtr< TestStress_obj > _hx_result = new TestStress_obj();
	_hx_result->__construct(posInfos);
	return _hx_result;
}

Dynamic TestStress_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< TestStress_obj > _hx_result = new TestStress_obj();
	_hx_result->__construct(inArgs[0]);
	return _hx_result;
}

void TestStress_obj::testDotProduct(){
            	HX_STACK_FRAME("test.TestStress","testDotProduct",0xc64148a4,"test.TestStress.testDotProduct","test/TestStress.hx",11,0x4c41c67b)
            	HX_STACK_THIS(this)
HXLINE(  12)		::haxe::Log_obj::trace(HX_("--Vector2 dot product--",a7,72,d1,67),hx::SourceInfo(HX_("TestStress.hx",38,84,4e,92),12,HX_("test.TestStress",e2,08,66,b9),HX_("testDotProduct",98,4e,e3,dd)));
HXLINE(  23)		HX_VARI( Int,time1Start) = this->a;
HXLINE(  24)		HX_VARI( Float,sum1) = ((Float)0.0);
HXLINE(  25)		{
HXLINE(  25)			HX_VARI( Int,_g1) = (int)0;
HXDLIN(  25)			while((_g1 < (int)10000000)){
HXLINE(  25)				HX_VARI( Int,i) = _g1++;
HXLINE(  27)				HX_VARI(  ::hxmath::math::Vector2Default,a) =  ::hxmath::math::Vector2Default_obj::__new((i * ((Float)1.2)),(i * ((Float)4.3)));
HXLINE(  28)				HX_VARI(  ::hxmath::math::Vector2Default,b) =  ::hxmath::math::Vector2Default_obj::__new((i * ((Float)1.1)),(i * ((Float)0.8)));
HXLINE(  29)				hx::AddEq(sum1,((a->x * b->x) + (a->y * b->y)));
            			}
            		}
HXLINE(  31)		HX_VARI( Int,time1End) = this->a;
HXLINE(  33)		HX_VARI( Int,time2Start) = this->a;
HXLINE(  34)		HX_VARI( Float,sum2) = ((Float)0.0);
HXLINE(  35)		{
HXLINE(  35)			HX_VARI_NAME( Int,_g11,"_g1") = (int)0;
HXDLIN(  35)			while((_g11 < (int)10000000)){
HXLINE(  35)				HX_VARI_NAME( Int,i1,"i") = _g11++;
HXLINE(  37)				HX_VARI_NAME(  ::hxmath::math::Vector2Default,a1,"a") =  ::hxmath::math::Vector2Default_obj::__new((i1 * ((Float)1.2)),(i1 * ((Float)4.3)));
HXLINE(  38)				HX_VARI_NAME(  ::hxmath::math::Vector2Default,b1,"b") =  ::hxmath::math::Vector2Default_obj::__new((i1 * ((Float)1.1)),(i1 * ((Float)0.8)));
HXLINE(  39)				hx::AddEq(sum2,((a1->x * b1->x) + (a1->y * b1->y)));
            			}
            		}
HXLINE(  41)		HX_VARI( Int,time2End) = this->a;
HXLINE(  43)		this->assertEquals(sum1,sum2,hx::SourceInfo(HX_("TestStress.hx",38,84,4e,92),43,HX_("test.TestStress",e2,08,66,b9),HX_("testDotProduct",98,4e,e3,dd)));
HXLINE(  45)		HX_VARI( Int,time1) = (time1End - time1Start);
HXLINE(  46)		HX_VARI( Int,time2) = (time2End - time2Start);
HXLINE(  48)		::haxe::Log_obj::trace((HX_("abstracts = ",b2,e0,89,1b) + time1),hx::SourceInfo(HX_("TestStress.hx",38,84,4e,92),48,HX_("test.TestStress",e2,08,66,b9),HX_("testDotProduct",98,4e,e3,dd)));
HXLINE(  49)		::haxe::Log_obj::trace((HX_("direct = ",da,d1,08,10) + time2),hx::SourceInfo(HX_("TestStress.hx",38,84,4e,92),49,HX_("test.TestStress",e2,08,66,b9),HX_("testDotProduct",98,4e,e3,dd)));
HXLINE(  50)		::haxe::Log_obj::trace((HX_("abstracts / direct = ",5a,6d,e0,8b) + ((Float)time1 / (Float)time2)),hx::SourceInfo(HX_("TestStress.hx",38,84,4e,92),50,HX_("test.TestStress",e2,08,66,b9),HX_("testDotProduct",98,4e,e3,dd)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestStress_obj,testDotProduct,(void))

void TestStress_obj::testMatrixProduct(){
            	HX_STACK_FRAME("test.TestStress","testMatrixProduct",0x4571acb0,"test.TestStress.testMatrixProduct","test/TestStress.hx",54,0x4c41c67b)
            	HX_STACK_THIS(this)
HXLINE(  55)		::haxe::Log_obj::trace(HX_("--Matrix3x3 matrix product--",a3,ee,f9,13),hx::SourceInfo(HX_("TestStress.hx",38,84,4e,92),55,HX_("test.TestStress",e2,08,66,b9),HX_("testMatrixProduct",3c,d7,68,0e)));
HXLINE(  65)		HX_VARI( Int,time1Start) = this->a;
HXLINE(  66)		HX_VARI( Float,sum1) = ((Float)0.0);
HXLINE(  67)		{
HXLINE(  67)			HX_VARI( Int,_g1) = (int)0;
HXDLIN(  67)			while((_g1 < (int)10000000)){
HXLINE(  67)				HX_VARI( Int,i) = _g1++;
HXLINE(  69)				HX_VARI(  ::hxmath::math::Matrix3x3Default,a) =  ::hxmath::math::Matrix3x3Default_obj::__new((i * ((Float)1.2)),(i * ((Float)4.3)),(i * ((Float)1.2)),(i * ((Float)4.3)),(i * ((Float)1.2)),(i * ((Float)4.3)),(i * ((Float)1.2)),(i * ((Float)4.3)),(i * ((Float)1.2)));
HXLINE(  73)				HX_VARI(  ::hxmath::math::Matrix3x3Default,b) =  ::hxmath::math::Matrix3x3Default_obj::__new((i * ((Float)1.1)),(i * ((Float)0.8)),(i * ((Float)1.1)),(i * ((Float)0.8)),(i * ((Float)1.1)),(i * ((Float)0.8)),(i * ((Float)1.1)),(i * ((Float)0.8)),(i * ((Float)1.1)));
HXLINE(  77)				HX_VARI(  ::hxmath::math::Matrix3x3Default,c) =  ::hxmath::math::Matrix3x3Default_obj::__new((((a->m00 * b->m00) + (a->m10 * b->m01)) + (a->m20 * b->m02)),(((a->m00 * b->m10) + (a->m10 * b->m11)) + (a->m20 * b->m12)),(((a->m00 * b->m20) + (a->m10 * b->m21)) + (a->m20 * b->m22)),(((a->m01 * b->m00) + (a->m11 * b->m01)) + (a->m21 * b->m02)),(((a->m01 * b->m10) + (a->m11 * b->m11)) + (a->m21 * b->m12)),(((a->m01 * b->m20) + (a->m11 * b->m21)) + (a->m21 * b->m22)),(((a->m02 * b->m00) + (a->m12 * b->m01)) + (a->m22 * b->m02)),(((a->m02 * b->m10) + (a->m12 * b->m11)) + (a->m22 * b->m12)),(((a->m02 * b->m20) + (a->m12 * b->m21)) + (a->m22 * b->m22)));
HXLINE(  78)				hx::AddEq(sum1,((((((((c->m00 + c->m10) + c->m20) + c->m01) + c->m11) + c->m21) + c->m02) + c->m12) + c->m22));
            			}
            		}
HXLINE(  83)		HX_VARI( Int,time1End) = this->a;
HXLINE(  85)		HX_VARI( Int,time2Start) = this->a;
HXLINE(  86)		HX_VARI( Float,sum2) = ((Float)0.0);
HXLINE(  87)		{
HXLINE(  87)			HX_VARI_NAME( Int,_g11,"_g1") = (int)0;
HXDLIN(  87)			while((_g11 < (int)10000000)){
HXLINE(  87)				HX_VARI_NAME( Int,i1,"i") = _g11++;
HXLINE(  89)				HX_VARI_NAME(  ::hxmath::math::Matrix3x3Default,a1,"a") =  ::hxmath::math::Matrix3x3Default_obj::__new((i1 * ((Float)1.2)),(i1 * ((Float)4.3)),(i1 * ((Float)1.2)),(i1 * ((Float)4.3)),(i1 * ((Float)1.2)),(i1 * ((Float)4.3)),(i1 * ((Float)1.2)),(i1 * ((Float)4.3)),(i1 * ((Float)1.2)));
HXLINE(  93)				HX_VARI_NAME(  ::hxmath::math::Matrix3x3Default,b1,"b") =  ::hxmath::math::Matrix3x3Default_obj::__new((i1 * ((Float)1.1)),(i1 * ((Float)0.8)),(i1 * ((Float)1.1)),(i1 * ((Float)0.8)),(i1 * ((Float)1.1)),(i1 * ((Float)0.8)),(i1 * ((Float)1.1)),(i1 * ((Float)0.8)),(i1 * ((Float)1.1)));
HXLINE(  97)				HX_VARI_NAME(  ::hxmath::math::Matrix3x3Default,c1,"c") =  ::hxmath::math::Matrix3x3Default_obj::__new((((a1->m00 * b1->m00) + (a1->m10 * b1->m01)) + (a1->m20 * b1->m02)),(((a1->m00 * b1->m10) + (a1->m10 * b1->m11)) + (a1->m20 * b1->m12)),(((a1->m00 * b1->m20) + (a1->m10 * b1->m21)) + (a1->m20 * b1->m22)),(((a1->m01 * b1->m00) + (a1->m11 * b1->m01)) + (a1->m21 * b1->m02)),(((a1->m01 * b1->m10) + (a1->m11 * b1->m11)) + (a1->m21 * b1->m12)),(((a1->m01 * b1->m20) + (a1->m11 * b1->m21)) + (a1->m21 * b1->m22)),(((a1->m02 * b1->m00) + (a1->m12 * b1->m01)) + (a1->m22 * b1->m02)),(((a1->m02 * b1->m10) + (a1->m12 * b1->m11)) + (a1->m22 * b1->m12)),(((a1->m02 * b1->m20) + (a1->m12 * b1->m21)) + (a1->m22 * b1->m22)));
HXLINE( 109)				hx::AddEq(sum2,((((((((c1->m00 + c1->m10) + c1->m20) + c1->m01) + c1->m11) + c1->m21) + c1->m02) + c1->m12) + c1->m22));
            			}
            		}
HXLINE( 114)		HX_VARI( Int,time2End) = this->a;
HXLINE( 116)		this->assertEquals(sum1,sum2,hx::SourceInfo(HX_("TestStress.hx",38,84,4e,92),116,HX_("test.TestStress",e2,08,66,b9),HX_("testMatrixProduct",3c,d7,68,0e)));
HXLINE( 118)		HX_VARI( Int,time1) = (time1End - time1Start);
HXLINE( 119)		HX_VARI( Int,time2) = (time2End - time2Start);
HXLINE( 121)		::haxe::Log_obj::trace((HX_("abstracts = ",b2,e0,89,1b) + time1),hx::SourceInfo(HX_("TestStress.hx",38,84,4e,92),121,HX_("test.TestStress",e2,08,66,b9),HX_("testMatrixProduct",3c,d7,68,0e)));
HXLINE( 122)		::haxe::Log_obj::trace((HX_("direct = ",da,d1,08,10) + time2),hx::SourceInfo(HX_("TestStress.hx",38,84,4e,92),122,HX_("test.TestStress",e2,08,66,b9),HX_("testMatrixProduct",3c,d7,68,0e)));
HXLINE( 123)		::haxe::Log_obj::trace((HX_("abstracts / direct = ",5a,6d,e0,8b) + ((Float)time1 / (Float)time2)),hx::SourceInfo(HX_("TestStress.hx",38,84,4e,92),123,HX_("test.TestStress",e2,08,66,b9),HX_("testMatrixProduct",3c,d7,68,0e)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestStress_obj,testMatrixProduct,(void))

void TestStress_obj::testMatrix3x2Constructor(){
            	HX_STACK_FRAME("test.TestStress","testMatrix3x2Constructor",0xa1236ecc,"test.TestStress.testMatrix3x2Constructor","test/TestStress.hx",127,0x4c41c67b)
            	HX_STACK_THIS(this)
HXLINE( 128)		::haxe::Log_obj::trace(HX_("--Matrix3x2 constructor--",46,20,b6,f2),hx::SourceInfo(HX_("TestStress.hx",38,84,4e,92),128,HX_("test.TestStress",e2,08,66,b9),HX_("testMatrix3x2Constructor",c0,ed,5b,83)));
HXLINE( 138)		HX_VARI( Int,abstractTimeStart) = this->a;
HXLINE( 139)		HX_VARI( Float,sum1) = ((Float)0.0);
HXLINE( 140)		{
HXLINE( 140)			HX_VARI( Int,_g1) = (int)0;
HXDLIN( 140)			while((_g1 < (int)50000000)){
HXLINE( 140)				HX_VARI( Int,i) = _g1++;
HXLINE( 142)				HX_VARI(  ::hxmath::math::Matrix3x2Default,m) =  ::hxmath::math::Matrix3x2Default_obj::__new((i * ((Float)1.2)),(i * ((Float)4.3)),(i * ((Float)1.2)),(i * ((Float)4.3)),(i * ((Float)1.2)),(i * ((Float)4.3)));
HXLINE( 145)				hx::AddEq(sum1,(((((m->a + m->b) + m->c) + m->d) + m->tx) + m->ty));
            			}
            		}
HXLINE( 147)		HX_VARI( Int,abstractTimeEnd) = this->a;
HXLINE( 149)		HX_VARI( Int,classTimeStart) = this->a;
HXLINE( 150)		HX_VARI( Float,sum2) = ((Float)0.0);
HXLINE( 151)		{
HXLINE( 151)			HX_VARI_NAME( Int,_g11,"_g1") = (int)0;
HXDLIN( 151)			while((_g11 < (int)50000000)){
HXLINE( 151)				HX_VARI_NAME( Int,i1,"i") = _g11++;
HXLINE( 153)				HX_VARI_NAME(  ::hxmath::math::Matrix3x2Default,m1,"m") =  ::hxmath::math::Matrix3x2Default_obj::__new((i1 * ((Float)1.2)),(i1 * ((Float)4.3)),(i1 * ((Float)1.2)),(i1 * ((Float)4.3)),(i1 * ((Float)1.2)),(i1 * ((Float)4.3)));
HXLINE( 156)				hx::AddEq(sum2,(((((m1->a + m1->b) + m1->c) + m1->d) + m1->tx) + m1->ty));
            			}
            		}
HXLINE( 158)		HX_VARI( Int,classTimeEnd) = this->a;
HXLINE( 160)		this->assertEquals(sum1,sum2,hx::SourceInfo(HX_("TestStress.hx",38,84,4e,92),160,HX_("test.TestStress",e2,08,66,b9),HX_("testMatrix3x2Constructor",c0,ed,5b,83)));
HXLINE( 162)		HX_VARI( Int,abstractTime) = (abstractTimeEnd - abstractTimeStart);
HXLINE( 163)		HX_VARI( Int,classTime) = (classTimeEnd - classTimeStart);
HXLINE( 165)		::haxe::Log_obj::trace((HX_("abstracts = ",b2,e0,89,1b) + abstractTime),hx::SourceInfo(HX_("TestStress.hx",38,84,4e,92),165,HX_("test.TestStress",e2,08,66,b9),HX_("testMatrix3x2Constructor",c0,ed,5b,83)));
HXLINE( 166)		::haxe::Log_obj::trace((HX_("direct = ",da,d1,08,10) + classTime),hx::SourceInfo(HX_("TestStress.hx",38,84,4e,92),166,HX_("test.TestStress",e2,08,66,b9),HX_("testMatrix3x2Constructor",c0,ed,5b,83)));
HXLINE( 167)		::haxe::Log_obj::trace((HX_("abstracts / direct = ",5a,6d,e0,8b) + ((Float)abstractTime / (Float)classTime)),hx::SourceInfo(HX_("TestStress.hx",38,84,4e,92),167,HX_("test.TestStress",e2,08,66,b9),HX_("testMatrix3x2Constructor",c0,ed,5b,83)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestStress_obj,testMatrix3x2Constructor,(void))

void TestStress_obj::testMatrix4x4Constructor(){
            	HX_STACK_FRAME("test.TestStress","testMatrix4x4Constructor",0xe74f9d69,"test.TestStress.testMatrix4x4Constructor","test/TestStress.hx",171,0x4c41c67b)
            	HX_STACK_THIS(this)
HXLINE( 172)		::haxe::Log_obj::trace(HX_("--Matrix4x4 constructor--",c9,31,a1,9f),hx::SourceInfo(HX_("TestStress.hx",38,84,4e,92),172,HX_("test.TestStress",e2,08,66,b9),HX_("testMatrix4x4Constructor",5d,1c,88,c9)));
HXLINE( 182)		HX_VARI( Int,abstractTimeStart) = this->a;
HXLINE( 183)		HX_VARI( Float,sum1) = ((Float)0.0);
HXLINE( 184)		{
HXLINE( 184)			HX_VARI( Int,_g1) = (int)0;
HXDLIN( 184)			while((_g1 < (int)50000000)){
HXLINE( 184)				HX_VARI( Int,i) = _g1++;
HXLINE( 186)				HX_VARI(  ::hxmath::math::Matrix4x4Default,a) =  ::hxmath::math::Matrix4x4Default_obj::__new((i * ((Float)1.2)),(i * ((Float)4.3)),(i * ((Float)1.2)),(i * ((Float)4.3)),(i * ((Float)1.2)),(i * ((Float)4.3)),(i * ((Float)1.2)),(i * ((Float)4.3)),(i * ((Float)1.2)),(i * ((Float)4.3)),(i * ((Float)1.2)),(i * ((Float)4.3)),(i * ((Float)1.2)),(i * ((Float)4.3)),(i * ((Float)1.2)),(i * ((Float)4.3)));
HXLINE( 191)				hx::AddEq(sum1,(((((((((((((((a->m00 + a->m10) + a->m20) + a->m30) + a->m01) + a->m11) + a->m21) + a->m31) + a->m02) + a->m12) + a->m22) + a->m32) + a->m03) + a->m13) + a->m23) + a->m33));
            			}
            		}
HXLINE( 197)		HX_VARI( Int,abstractTimeEnd) = this->a;
HXLINE( 199)		HX_VARI( Int,classTimeStart) = this->a;
HXLINE( 200)		HX_VARI( Float,sum2) = ((Float)0.0);
HXLINE( 201)		{
HXLINE( 201)			HX_VARI_NAME( Int,_g11,"_g1") = (int)0;
HXDLIN( 201)			while((_g11 < (int)50000000)){
HXLINE( 201)				HX_VARI_NAME( Int,i1,"i") = _g11++;
HXLINE( 203)				HX_VARI_NAME(  ::hxmath::math::Matrix4x4Default,a1,"a") =  ::hxmath::math::Matrix4x4Default_obj::__new((i1 * ((Float)1.2)),(i1 * ((Float)4.3)),(i1 * ((Float)1.2)),(i1 * ((Float)4.3)),(i1 * ((Float)1.2)),(i1 * ((Float)4.3)),(i1 * ((Float)1.2)),(i1 * ((Float)4.3)),(i1 * ((Float)1.2)),(i1 * ((Float)4.3)),(i1 * ((Float)1.2)),(i1 * ((Float)4.3)),(i1 * ((Float)1.2)),(i1 * ((Float)4.3)),(i1 * ((Float)1.2)),(i1 * ((Float)4.3)));
HXLINE( 208)				hx::AddEq(sum2,(((((((((((((((a1->m00 + a1->m10) + a1->m20) + a1->m30) + a1->m01) + a1->m11) + a1->m21) + a1->m31) + a1->m02) + a1->m12) + a1->m22) + a1->m32) + a1->m03) + a1->m13) + a1->m23) + a1->m33));
            			}
            		}
HXLINE( 214)		HX_VARI( Int,classTimeEnd) = this->a;
HXLINE( 216)		this->assertEquals(sum1,sum2,hx::SourceInfo(HX_("TestStress.hx",38,84,4e,92),216,HX_("test.TestStress",e2,08,66,b9),HX_("testMatrix4x4Constructor",5d,1c,88,c9)));
HXLINE( 218)		HX_VARI( Int,abstractTime) = (abstractTimeEnd - abstractTimeStart);
HXLINE( 219)		HX_VARI( Int,classTime) = (classTimeEnd - classTimeStart);
HXLINE( 221)		::haxe::Log_obj::trace((HX_("abstracts = ",b2,e0,89,1b) + abstractTime),hx::SourceInfo(HX_("TestStress.hx",38,84,4e,92),221,HX_("test.TestStress",e2,08,66,b9),HX_("testMatrix4x4Constructor",5d,1c,88,c9)));
HXLINE( 222)		::haxe::Log_obj::trace((HX_("direct = ",da,d1,08,10) + classTime),hx::SourceInfo(HX_("TestStress.hx",38,84,4e,92),222,HX_("test.TestStress",e2,08,66,b9),HX_("testMatrix4x4Constructor",5d,1c,88,c9)));
HXLINE( 223)		::haxe::Log_obj::trace((HX_("abstracts / direct = ",5a,6d,e0,8b) + ((Float)abstractTime / (Float)classTime)),hx::SourceInfo(HX_("TestStress.hx",38,84,4e,92),223,HX_("test.TestStress",e2,08,66,b9),HX_("testMatrix4x4Constructor",5d,1c,88,c9)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestStress_obj,testMatrix4x4Constructor,(void))


TestStress_obj::TestStress_obj()
{
}

hx::Val TestStress_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 1:
		if (HX_FIELD_EQ(inName,"a") ) { return hx::Val( a); }
		break;
	case 14:
		if (HX_FIELD_EQ(inName,"testDotProduct") ) { return hx::Val( testDotProduct_dyn()); }
		break;
	case 17:
		if (HX_FIELD_EQ(inName,"testMatrixProduct") ) { return hx::Val( testMatrixProduct_dyn()); }
		break;
	case 24:
		if (HX_FIELD_EQ(inName,"testMatrix3x2Constructor") ) { return hx::Val( testMatrix3x2Constructor_dyn()); }
		if (HX_FIELD_EQ(inName,"testMatrix4x4Constructor") ) { return hx::Val( testMatrix4x4Constructor_dyn()); }
	}
	return super::__Field(inName,inCallProp);
}

hx::Val TestStress_obj::__SetField(const ::String &inName,const hx::Val &inValue,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 1:
		if (HX_FIELD_EQ(inName,"a") ) { a=inValue.Cast< Int >(); return inValue; }
	}
	return super::__SetField(inName,inValue,inCallProp);
}

void TestStress_obj::__GetFields(Array< ::String> &outFields)
{
	outFields->push(HX_HCSTRING("a","\x61","\x00","\x00","\x00"));
	super::__GetFields(outFields);
};

#if HXCPP_SCRIPTABLE
static hx::StorageInfo TestStress_obj_sMemberStorageInfo[] = {
	{hx::fsInt,(int)offsetof(TestStress_obj,a),HX_HCSTRING("a","\x61","\x00","\x00","\x00")},
	{ hx::fsUnknown, 0, null()}
};
static hx::StaticInfo *TestStress_obj_sStaticStorageInfo = 0;
#endif

static ::String TestStress_obj_sMemberFields[] = {
	HX_HCSTRING("a","\x61","\x00","\x00","\x00"),
	HX_HCSTRING("testDotProduct","\x98","\x4e","\xe3","\xdd"),
	HX_HCSTRING("testMatrixProduct","\x3c","\xd7","\x68","\x0e"),
	HX_HCSTRING("testMatrix3x2Constructor","\xc0","\xed","\x5b","\x83"),
	HX_HCSTRING("testMatrix4x4Constructor","\x5d","\x1c","\x88","\xc9"),
	::String(null()) };

static void TestStress_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(TestStress_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void TestStress_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(TestStress_obj::__mClass,"__mClass");
};

#endif

hx::Class TestStress_obj::__mClass;

void TestStress_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("test.TestStress","\xe2","\x08","\x66","\xb9");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &hx::Class_obj::GetNoStaticField;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = TestStress_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(0 /* sStaticFields */);
	__mClass->mMembers = hx::Class_obj::dupFunctions(TestStress_obj_sMemberFields);
	__mClass->mCanCast = hx::TCanCast< TestStress_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = TestStress_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = TestStress_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = TestStress_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace test
