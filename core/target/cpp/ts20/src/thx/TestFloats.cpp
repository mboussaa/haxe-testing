// Generated by Haxe 3.3.0
#include <hxcpp.h>

#include "hxMath.h"
#ifndef INCLUDED_thx_Floats
#include <thx/Floats.h>
#endif
#ifndef INCLUDED_thx_TestFloats
#include <thx/TestFloats.h>
#endif
#ifndef INCLUDED_utest_Assert
#include <utest/Assert.h>
#endif

namespace thx{

void TestFloats_obj::__construct(Int i){
            	HX_STACK_FRAME("thx.TestFloats","new",0xd7a3ff85,"thx.TestFloats.new","thx/TestFloats.hx",15,0x65826aea)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(i,"i")
HXLINE(  15)		this->x = i;
            	}

Dynamic TestFloats_obj::__CreateEmpty() { return new TestFloats_obj; }

hx::ObjectPtr< TestFloats_obj > TestFloats_obj::__new(Int i)
{
	hx::ObjectPtr< TestFloats_obj > _hx_result = new TestFloats_obj();
	_hx_result->__construct(i);
	return _hx_result;
}

Dynamic TestFloats_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< TestFloats_obj > _hx_result = new TestFloats_obj();
	_hx_result->__construct(inArgs[0]);
	return _hx_result;
}

void TestFloats_obj::testNormalize(){
            	HX_STACK_FRAME("thx.TestFloats","testNormalize",0x70022440,"thx.TestFloats.testNormalize","thx/TestFloats.hx",19,0x65826aea)
            	HX_STACK_THIS(this)
HXLINE(  19)		HX_VARI( Int,_g1) = (int)0;
HXDLIN(  19)		HX_VARI( Int,_g) = this->x;
HXDLIN(  19)		while((_g1 < _g)){
HXLINE(  19)			++_g1;
HXLINE(  20)			::utest::Assert_obj::floatEquals(((Float)0.0),((Float)0.0),null(),null(),hx::SourceInfo(HX_("TestFloats.hx",f5,5c,b1,8f),20,HX_("thx.TestFloats",13,d9,6a,d7),HX_("testNormalize",db,b4,db,de)));
HXLINE(  21)			::utest::Assert_obj::floatEquals(((Float)1.0),((Float)1.0),null(),null(),hx::SourceInfo(HX_("TestFloats.hx",f5,5c,b1,8f),21,HX_("thx.TestFloats",13,d9,6a,d7),HX_("testNormalize",db,b4,db,de)));
HXLINE(  22)			::utest::Assert_obj::floatEquals(((Float)0.5),((Float)0.5),null(),null(),hx::SourceInfo(HX_("TestFloats.hx",f5,5c,b1,8f),22,HX_("thx.TestFloats",13,d9,6a,d7),HX_("testNormalize",db,b4,db,de)));
HXLINE(  23)			::utest::Assert_obj::floatEquals(((Float)0.0),(int)0,null(),null(),hx::SourceInfo(HX_("TestFloats.hx",f5,5c,b1,8f),23,HX_("thx.TestFloats",13,d9,6a,d7),HX_("testNormalize",db,b4,db,de)));
HXLINE(  24)			::utest::Assert_obj::floatEquals(((Float)1.0),(int)1,null(),null(),hx::SourceInfo(HX_("TestFloats.hx",f5,5c,b1,8f),24,HX_("thx.TestFloats",13,d9,6a,d7),HX_("testNormalize",db,b4,db,de)));
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestFloats_obj,testNormalize,(void))

void TestFloats_obj::testClamp(){
            	HX_STACK_FRAME("thx.TestFloats","testClamp",0xb8124a2e,"thx.TestFloats.testClamp","thx/TestFloats.hx",28,0x65826aea)
            	HX_STACK_THIS(this)
HXLINE(  28)		HX_VARI( Int,_g1) = (int)0;
HXDLIN(  28)		HX_VARI( Int,_g) = this->x;
HXDLIN(  28)		while((_g1 < _g)){
HXLINE(  28)			++_g1;
HXLINE(  29)			::utest::Assert_obj::floatEquals((int)10,(int)10,null(),null(),hx::SourceInfo(HX_("TestFloats.hx",f5,5c,b1,8f),29,HX_("thx.TestFloats",13,d9,6a,d7),HX_("testClamp",49,b1,5a,11)));
HXLINE(  30)			::utest::Assert_obj::floatEquals((int)10,(int)10,null(),null(),hx::SourceInfo(HX_("TestFloats.hx",f5,5c,b1,8f),30,HX_("thx.TestFloats",13,d9,6a,d7),HX_("testClamp",49,b1,5a,11)));
HXLINE(  31)			::utest::Assert_obj::floatEquals((int)50,(int)50,null(),null(),hx::SourceInfo(HX_("TestFloats.hx",f5,5c,b1,8f),31,HX_("thx.TestFloats",13,d9,6a,d7),HX_("testClamp",49,b1,5a,11)));
HXLINE(  32)			::utest::Assert_obj::floatEquals((int)100,(int)100,null(),null(),hx::SourceInfo(HX_("TestFloats.hx",f5,5c,b1,8f),32,HX_("thx.TestFloats",13,d9,6a,d7),HX_("testClamp",49,b1,5a,11)));
HXLINE(  33)			::utest::Assert_obj::floatEquals((int)100,(int)100,null(),null(),hx::SourceInfo(HX_("TestFloats.hx",f5,5c,b1,8f),33,HX_("thx.TestFloats",13,d9,6a,d7),HX_("testClamp",49,b1,5a,11)));
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestFloats_obj,testClamp,(void))

void TestFloats_obj::testClampSym(){
            	HX_STACK_FRAME("thx.TestFloats","testClampSym",0x279f2b79,"thx.TestFloats.testClampSym","thx/TestFloats.hx",37,0x65826aea)
            	HX_STACK_THIS(this)
HXLINE(  37)		HX_VARI( Int,_g1) = (int)0;
HXDLIN(  37)		HX_VARI( Int,_g) = this->x;
HXDLIN(  37)		while((_g1 < _g)){
HXLINE(  37)			++_g1;
HXLINE(  38)			HX_VARI( Float,min) = (int)-10;
HXDLIN(  38)			Float _hx_tmp;
HXDLIN(  38)			_hx_tmp = min;
HXDLIN(  38)			::utest::Assert_obj::floatEquals((int)-10,_hx_tmp,null(),null(),hx::SourceInfo(HX_("TestFloats.hx",f5,5c,b1,8f),38,HX_("thx.TestFloats",13,d9,6a,d7),HX_("testClampSym",3e,e7,29,f2)));
HXLINE(  39)			HX_VARI_NAME( Float,min1,"min") = (int)-10;
HXDLIN(  39)			Float _hx_tmp1;
HXDLIN(  39)			_hx_tmp1 = (int)10;
HXDLIN(  39)			::utest::Assert_obj::floatEquals((int)10,_hx_tmp1,null(),null(),hx::SourceInfo(HX_("TestFloats.hx",f5,5c,b1,8f),39,HX_("thx.TestFloats",13,d9,6a,d7),HX_("testClampSym",3e,e7,29,f2)));
HXLINE(  40)			HX_VARI_NAME( Float,min2,"min") = (int)-10;
HXDLIN(  40)			Float _hx_tmp2;
HXDLIN(  40)			_hx_tmp2 = (int)0;
HXDLIN(  40)			::utest::Assert_obj::floatEquals((int)0,_hx_tmp2,null(),null(),hx::SourceInfo(HX_("TestFloats.hx",f5,5c,b1,8f),40,HX_("thx.TestFloats",13,d9,6a,d7),HX_("testClampSym",3e,e7,29,f2)));
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestFloats_obj,testClampSym,(void))

void TestFloats_obj::testCompare(){
            	HX_STACK_FRAME("thx.TestFloats","testCompare",0xb6ad6298,"thx.TestFloats.testCompare","thx/TestFloats.hx",44,0x65826aea)
            	HX_STACK_THIS(this)
HXLINE(  44)		HX_VARI( Int,_g1) = (int)0;
HXDLIN(  44)		HX_VARI( Int,_g) = this->x;
HXDLIN(  44)		while((_g1 < _g)){
HXLINE(  44)			++_g1;
HXLINE(  45)			::utest::Assert_obj::equals((int)-1,(int)-1,null(),hx::SourceInfo(HX_("TestFloats.hx",f5,5c,b1,8f),45,HX_("thx.TestFloats",13,d9,6a,d7),HX_("testCompare",73,06,32,40)));
HXLINE(  46)			::utest::Assert_obj::equals((int)-1,(int)-1,null(),hx::SourceInfo(HX_("TestFloats.hx",f5,5c,b1,8f),46,HX_("thx.TestFloats",13,d9,6a,d7),HX_("testCompare",73,06,32,40)));
HXLINE(  47)			::utest::Assert_obj::equals((int)-1,(int)-1,null(),hx::SourceInfo(HX_("TestFloats.hx",f5,5c,b1,8f),47,HX_("thx.TestFloats",13,d9,6a,d7),HX_("testCompare",73,06,32,40)));
HXLINE(  48)			::utest::Assert_obj::equals((int)-1,(int)-1,null(),hx::SourceInfo(HX_("TestFloats.hx",f5,5c,b1,8f),48,HX_("thx.TestFloats",13,d9,6a,d7),HX_("testCompare",73,06,32,40)));
HXLINE(  49)			HX_VARI( Float,a) = -(::Math_obj::PI);
HXDLIN(  49)			HX_VARI( Float,b) = ::Math_obj::PI;
HXDLIN(  49)			Int _hx_tmp;
HXDLIN(  49)			if ((a < b)) {
HXLINE(  49)				_hx_tmp = (int)-1;
            			}
            			else {
HXLINE(  49)				if ((a > b)) {
HXLINE(  49)					_hx_tmp = (int)1;
            				}
            				else {
HXLINE(  49)					_hx_tmp = (int)0;
            				}
            			}
HXDLIN(  49)			::utest::Assert_obj::equals((int)-1,_hx_tmp,null(),hx::SourceInfo(HX_("TestFloats.hx",f5,5c,b1,8f),49,HX_("thx.TestFloats",13,d9,6a,d7),HX_("testCompare",73,06,32,40)));
HXLINE(  51)			::utest::Assert_obj::equals((int)0,(int)0,null(),hx::SourceInfo(HX_("TestFloats.hx",f5,5c,b1,8f),51,HX_("thx.TestFloats",13,d9,6a,d7),HX_("testCompare",73,06,32,40)));
HXLINE(  52)			::utest::Assert_obj::equals((int)0,(int)0,null(),hx::SourceInfo(HX_("TestFloats.hx",f5,5c,b1,8f),52,HX_("thx.TestFloats",13,d9,6a,d7),HX_("testCompare",73,06,32,40)));
HXLINE(  53)			::utest::Assert_obj::equals((int)0,(int)0,null(),hx::SourceInfo(HX_("TestFloats.hx",f5,5c,b1,8f),53,HX_("thx.TestFloats",13,d9,6a,d7),HX_("testCompare",73,06,32,40)));
HXLINE(  54)			HX_VARI_NAME( Float,a1,"a") = ::Math_obj::PI;
HXDLIN(  54)			HX_VARI_NAME( Float,b1,"b") = ::Math_obj::PI;
HXDLIN(  54)			Int _hx_tmp1;
HXDLIN(  54)			if ((a1 < b1)) {
HXLINE(  54)				_hx_tmp1 = (int)-1;
            			}
            			else {
HXLINE(  54)				if ((a1 > b1)) {
HXLINE(  54)					_hx_tmp1 = (int)1;
            				}
            				else {
HXLINE(  54)					_hx_tmp1 = (int)0;
            				}
            			}
HXDLIN(  54)			::utest::Assert_obj::equals((int)0,_hx_tmp1,null(),hx::SourceInfo(HX_("TestFloats.hx",f5,5c,b1,8f),54,HX_("thx.TestFloats",13,d9,6a,d7),HX_("testCompare",73,06,32,40)));
HXLINE(  56)			::utest::Assert_obj::equals((int)1,(int)1,null(),hx::SourceInfo(HX_("TestFloats.hx",f5,5c,b1,8f),56,HX_("thx.TestFloats",13,d9,6a,d7),HX_("testCompare",73,06,32,40)));
HXLINE(  57)			::utest::Assert_obj::equals((int)1,(int)1,null(),hx::SourceInfo(HX_("TestFloats.hx",f5,5c,b1,8f),57,HX_("thx.TestFloats",13,d9,6a,d7),HX_("testCompare",73,06,32,40)));
HXLINE(  58)			::utest::Assert_obj::equals((int)1,(int)1,null(),hx::SourceInfo(HX_("TestFloats.hx",f5,5c,b1,8f),58,HX_("thx.TestFloats",13,d9,6a,d7),HX_("testCompare",73,06,32,40)));
HXLINE(  59)			HX_VARI_NAME( Float,a2,"a") = ::Math_obj::PI;
HXDLIN(  59)			HX_VARI_NAME( Float,b2,"b") = -(::Math_obj::PI);
HXDLIN(  59)			Int _hx_tmp2;
HXDLIN(  59)			if ((a2 < b2)) {
HXLINE(  59)				_hx_tmp2 = (int)-1;
            			}
            			else {
HXLINE(  59)				if ((a2 > b2)) {
HXLINE(  59)					_hx_tmp2 = (int)1;
            				}
            				else {
HXLINE(  59)					_hx_tmp2 = (int)0;
            				}
            			}
HXDLIN(  59)			::utest::Assert_obj::equals((int)1,_hx_tmp2,null(),hx::SourceInfo(HX_("TestFloats.hx",f5,5c,b1,8f),59,HX_("thx.TestFloats",13,d9,6a,d7),HX_("testCompare",73,06,32,40)));
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestFloats_obj,testCompare,(void))

void TestFloats_obj::testRound(){
            	HX_STACK_FRAME("thx.TestFloats","testRound",0x5d1fcf81,"thx.TestFloats.testRound","thx/TestFloats.hx",63,0x65826aea)
            	HX_STACK_THIS(this)
HXLINE(  63)		HX_VARI( Int,_g1) = (int)0;
HXDLIN(  63)		HX_VARI( Int,_g) = this->x;
HXDLIN(  63)		while((_g1 < _g)){
HXLINE(  63)			++_g1;
HXLINE(  65)			Float _hx_tmp = ::thx::Floats_obj::roundTo(((Float)123.456),(int)1);
HXDLIN(  65)			::utest::Assert_obj::floatEquals(((Float)123.5),_hx_tmp,null(),null(),hx::SourceInfo(HX_("TestFloats.hx",f5,5c,b1,8f),65,HX_("thx.TestFloats",13,d9,6a,d7),HX_("testRound",9c,36,68,b6)));
HXLINE(  66)			Float _hx_tmp1 = ::thx::Floats_obj::roundTo(((Float)123.456),(int)2);
HXDLIN(  66)			::utest::Assert_obj::floatEquals(((Float)123.46),_hx_tmp1,null(),null(),hx::SourceInfo(HX_("TestFloats.hx",f5,5c,b1,8f),66,HX_("thx.TestFloats",13,d9,6a,d7),HX_("testRound",9c,36,68,b6)));
HXLINE(  67)			Float _hx_tmp2 = ::thx::Floats_obj::roundTo(((Float)123.456),(int)3);
HXDLIN(  67)			::utest::Assert_obj::floatEquals(((Float)123.456),_hx_tmp2,null(),null(),hx::SourceInfo(HX_("TestFloats.hx",f5,5c,b1,8f),67,HX_("thx.TestFloats",13,d9,6a,d7),HX_("testRound",9c,36,68,b6)));
HXLINE(  68)			Float _hx_tmp3 = ::thx::Floats_obj::roundTo(((Float)123.456),(int)4);
HXDLIN(  68)			::utest::Assert_obj::floatEquals(((Float)123.456),_hx_tmp3,null(),null(),hx::SourceInfo(HX_("TestFloats.hx",f5,5c,b1,8f),68,HX_("thx.TestFloats",13,d9,6a,d7),HX_("testRound",9c,36,68,b6)));
HXLINE(  71)			Float _hx_tmp4 = ::thx::Floats_obj::roundTo(((Float)1234567890.123456),(int)1);
HXDLIN(  71)			::utest::Assert_obj::floatEquals(((Float)1234567890.1),_hx_tmp4,null(),null(),hx::SourceInfo(HX_("TestFloats.hx",f5,5c,b1,8f),71,HX_("thx.TestFloats",13,d9,6a,d7),HX_("testRound",9c,36,68,b6)));
HXLINE(  72)			Float _hx_tmp5 = ::thx::Floats_obj::roundTo(((Float)1234567890.123456),(int)2);
HXDLIN(  72)			::utest::Assert_obj::floatEquals(((Float)1234567890.12),_hx_tmp5,null(),null(),hx::SourceInfo(HX_("TestFloats.hx",f5,5c,b1,8f),72,HX_("thx.TestFloats",13,d9,6a,d7),HX_("testRound",9c,36,68,b6)));
HXLINE(  73)			Float _hx_tmp6 = ::thx::Floats_obj::roundTo(((Float)1234567890.123456),(int)3);
HXDLIN(  73)			::utest::Assert_obj::floatEquals(((Float)1234567890.123),_hx_tmp6,null(),null(),hx::SourceInfo(HX_("TestFloats.hx",f5,5c,b1,8f),73,HX_("thx.TestFloats",13,d9,6a,d7),HX_("testRound",9c,36,68,b6)));
HXLINE(  74)			Float _hx_tmp7 = ::thx::Floats_obj::roundTo(((Float)1234567890.123456),(int)4);
HXDLIN(  74)			::utest::Assert_obj::floatEquals(((Float)1234567890.1235),_hx_tmp7,null(),null(),hx::SourceInfo(HX_("TestFloats.hx",f5,5c,b1,8f),74,HX_("thx.TestFloats",13,d9,6a,d7),HX_("testRound",9c,36,68,b6)));
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestFloats_obj,testRound,(void))

void TestFloats_obj::testAngleDifference(){
            	HX_STACK_FRAME("thx.TestFloats","testAngleDifference",0x2564fea3,"thx.TestFloats.testAngleDifference","thx/TestFloats.hx",78,0x65826aea)
            	HX_STACK_THIS(this)
HXLINE(  78)		HX_VARI( Int,_g1) = (int)0;
HXDLIN(  78)		HX_VARI( Int,_g) = this->x;
HXDLIN(  78)		while((_g1 < _g)){
HXLINE(  78)			++_g1;
HXLINE(  79)			HX_VARI( ::Array< ::Dynamic>,tests) = ::Array_obj< ::Dynamic>::__new(6)->init(0, ::Dynamic(hx::Anon_obj::Create(3)
            				->setFixed(0,HX_("a",61,00,00,00),(int)30)
            				->setFixed(1,HX_("b",62,00,00,00),(int)60)
            				->setFixed(2,HX_("d",64,00,00,00),(int)30)))->init(1, ::Dynamic(hx::Anon_obj::Create(3)
            				->setFixed(0,HX_("a",61,00,00,00),(int)60)
            				->setFixed(1,HX_("b",62,00,00,00),(int)30)
            				->setFixed(2,HX_("d",64,00,00,00),(int)-30)))->init(2, ::Dynamic(hx::Anon_obj::Create(3)
            				->setFixed(0,HX_("a",61,00,00,00),(int)0)
            				->setFixed(1,HX_("b",62,00,00,00),(int)190)
            				->setFixed(2,HX_("d",64,00,00,00),(int)-170)))->init(3, ::Dynamic(hx::Anon_obj::Create(3)
            				->setFixed(0,HX_("a",61,00,00,00),(int)190)
            				->setFixed(1,HX_("b",62,00,00,00),(int)0)
            				->setFixed(2,HX_("d",64,00,00,00),(int)170)))->init(4, ::Dynamic(hx::Anon_obj::Create(3)
            				->setFixed(0,HX_("a",61,00,00,00),(int)400)
            				->setFixed(1,HX_("b",62,00,00,00),(int)40)
            				->setFixed(2,HX_("d",64,00,00,00),(int)0)))->init(5, ::Dynamic(hx::Anon_obj::Create(3)
            				->setFixed(0,HX_("a",61,00,00,00),(int)760)
            				->setFixed(1,HX_("b",62,00,00,00),(int)40)
            				->setFixed(2,HX_("d",64,00,00,00),(int)0)));
HXLINE(  88)			{
HXLINE(  88)				HX_VARI( Int,_g2) = (int)0;
HXDLIN(  88)				while((_g2 < tests->length)){
HXLINE(  88)					HX_VARI(  ::Dynamic,test) = tests->__get(_g2);
HXDLIN(  88)					++_g2;
HXLINE(  89)					HX_VARI( Float,d) = ::thx::Floats_obj::angleDifference( ::Dynamic(test->__Field(HX_("a",61,00,00,00),hx::paccDynamic)), ::Dynamic(test->__Field(HX_("b",62,00,00,00),hx::paccDynamic)),null());
HXLINE(  90)					Int _hx_tmp = ( (Int)(test->__Field(HX_("d",64,00,00,00),hx::paccDynamic)) );
HXDLIN(  90)					::String _hx_tmp1 = ((((((HX_("expected distance between ",fb,03,33,44) + ( (Int)(test->__Field(HX_("a",61,00,00,00),hx::paccDynamic)) )) + HX_(" and ",89,11,44,ad)) + ( (Int)(test->__Field(HX_("b",62,00,00,00),hx::paccDynamic)) )) + HX_(" to be ",f8,9f,00,93)) + ( (Int)(test->__Field(HX_("d",64,00,00,00),hx::paccDynamic)) )) + HX_(" but it is ",60,e9,99,19));
HXDLIN(  90)					::utest::Assert_obj::equals(_hx_tmp,d,(_hx_tmp1 + d),hx::SourceInfo(HX_("TestFloats.hx",f5,5c,b1,8f),90,HX_("thx.TestFloats",13,d9,6a,d7),HX_("testAngleDifference",7e,75,49,fd)));
            				}
            			}
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestFloats_obj,testAngleDifference,(void))

void TestFloats_obj::testInterpolateAngle(){
            	HX_STACK_FRAME("thx.TestFloats","testInterpolateAngle",0x1c1762ff,"thx.TestFloats.testInterpolateAngle","thx/TestFloats.hx",95,0x65826aea)
            	HX_STACK_THIS(this)
HXLINE(  95)		HX_VARI( Int,_g1) = (int)0;
HXDLIN(  95)		HX_VARI( Int,_g) = this->x;
HXDLIN(  95)		while((_g1 < _g)){
HXLINE(  95)			++_g1;
HXLINE(  96)			HX_VARI( ::Array< ::Dynamic>,tests) = ::Array_obj< ::Dynamic>::__new(14)->init(0, ::Dynamic(hx::Anon_obj::Create(6)
            				->setFixed(0,HX_("a",61,00,00,00),(int)30)
            				->setFixed(1,HX_("b",62,00,00,00),(int)330)
            				->setFixed(2,HX_("l",6c,00,00,00),(int)180)
            				->setFixed(3,HX_("s",73,00,00,00),(int)0)
            				->setFixed(4,HX_("cw",b4,56,00,00),(int)180)
            				->setFixed(5,HX_("ccw",d7,75,4b,00),(int)0)))->init(1, ::Dynamic(hx::Anon_obj::Create(6)
            				->setFixed(0,HX_("a",61,00,00,00),(int)330)
            				->setFixed(1,HX_("b",62,00,00,00),(int)30)
            				->setFixed(2,HX_("l",6c,00,00,00),(int)180)
            				->setFixed(3,HX_("s",73,00,00,00),(int)0)
            				->setFixed(4,HX_("cw",b4,56,00,00),(int)0)
            				->setFixed(5,HX_("ccw",d7,75,4b,00),(int)180)))->init(2, ::Dynamic(hx::Anon_obj::Create(6)
            				->setFixed(0,HX_("a",61,00,00,00),(int)30)
            				->setFixed(1,HX_("b",62,00,00,00),(int)120)
            				->setFixed(2,HX_("l",6c,00,00,00),(int)255)
            				->setFixed(3,HX_("s",73,00,00,00),(int)75)
            				->setFixed(4,HX_("cw",b4,56,00,00),(int)75)
            				->setFixed(5,HX_("ccw",d7,75,4b,00),(int)255)))->init(3, ::Dynamic(hx::Anon_obj::Create(6)
            				->setFixed(0,HX_("a",61,00,00,00),(int)120)
            				->setFixed(1,HX_("b",62,00,00,00),(int)30)
            				->setFixed(2,HX_("l",6c,00,00,00),(int)255)
            				->setFixed(3,HX_("s",73,00,00,00),(int)75)
            				->setFixed(4,HX_("cw",b4,56,00,00),(int)255)
            				->setFixed(5,HX_("ccw",d7,75,4b,00),(int)75)))->init(4, ::Dynamic(hx::Anon_obj::Create(6)
            				->setFixed(0,HX_("a",61,00,00,00),(int)0)
            				->setFixed(1,HX_("b",62,00,00,00),(int)180)
            				->setFixed(2,HX_("l",6c,00,00,00),(int)270)
            				->setFixed(3,HX_("s",73,00,00,00),(int)90)
            				->setFixed(4,HX_("cw",b4,56,00,00),(int)90)
            				->setFixed(5,HX_("ccw",d7,75,4b,00),(int)270)))->init(5, ::Dynamic(hx::Anon_obj::Create(6)
            				->setFixed(0,HX_("a",61,00,00,00),(int)180)
            				->setFixed(1,HX_("b",62,00,00,00),(int)0)
            				->setFixed(2,HX_("l",6c,00,00,00),(int)90)
            				->setFixed(3,HX_("s",73,00,00,00),(int)270)
            				->setFixed(4,HX_("cw",b4,56,00,00),(int)270)
            				->setFixed(5,HX_("ccw",d7,75,4b,00),(int)90)))->init(6, ::Dynamic(hx::Anon_obj::Create(6)
            				->setFixed(0,HX_("a",61,00,00,00),(int)10)
            				->setFixed(1,HX_("b",62,00,00,00),(int)200)
            				->setFixed(2,HX_("l",6c,00,00,00),(int)105)
            				->setFixed(3,HX_("s",73,00,00,00),(int)285)
            				->setFixed(4,HX_("cw",b4,56,00,00),(int)105)
            				->setFixed(5,HX_("ccw",d7,75,4b,00),(int)285)))->init(7, ::Dynamic(hx::Anon_obj::Create(6)
            				->setFixed(0,HX_("a",61,00,00,00),(int)200)
            				->setFixed(1,HX_("b",62,00,00,00),(int)10)
            				->setFixed(2,HX_("l",6c,00,00,00),(int)105)
            				->setFixed(3,HX_("s",73,00,00,00),(int)285)
            				->setFixed(4,HX_("cw",b4,56,00,00),(int)285)
            				->setFixed(5,HX_("ccw",d7,75,4b,00),(int)105)))->init(8, ::Dynamic(hx::Anon_obj::Create(6)
            				->setFixed(0,HX_("a",61,00,00,00),(int)170)
            				->setFixed(1,HX_("b",62,00,00,00),(int)340)
            				->setFixed(2,HX_("l",6c,00,00,00),(int)75)
            				->setFixed(3,HX_("s",73,00,00,00),(int)255)
            				->setFixed(4,HX_("cw",b4,56,00,00),(int)255)
            				->setFixed(5,HX_("ccw",d7,75,4b,00),(int)75)))->init(9, ::Dynamic(hx::Anon_obj::Create(6)
            				->setFixed(0,HX_("a",61,00,00,00),(int)340)
            				->setFixed(1,HX_("b",62,00,00,00),(int)170)
            				->setFixed(2,HX_("l",6c,00,00,00),(int)75)
            				->setFixed(3,HX_("s",73,00,00,00),(int)255)
            				->setFixed(4,HX_("cw",b4,56,00,00),(int)75)
            				->setFixed(5,HX_("ccw",d7,75,4b,00),(int)255)))->init(10, ::Dynamic(hx::Anon_obj::Create(6)
            				->setFixed(0,HX_("a",61,00,00,00),(int)190)
            				->setFixed(1,HX_("b",62,00,00,00),(int)350)
            				->setFixed(2,HX_("l",6c,00,00,00),(int)90)
            				->setFixed(3,HX_("s",73,00,00,00),(int)270)
            				->setFixed(4,HX_("cw",b4,56,00,00),(int)270)
            				->setFixed(5,HX_("ccw",d7,75,4b,00),(int)90)))->init(11, ::Dynamic(hx::Anon_obj::Create(6)
            				->setFixed(0,HX_("a",61,00,00,00),(int)350)
            				->setFixed(1,HX_("b",62,00,00,00),(int)190)
            				->setFixed(2,HX_("l",6c,00,00,00),(int)90)
            				->setFixed(3,HX_("s",73,00,00,00),(int)270)
            				->setFixed(4,HX_("cw",b4,56,00,00),(int)90)
            				->setFixed(5,HX_("ccw",d7,75,4b,00),(int)270)))->init(12, ::Dynamic(hx::Anon_obj::Create(6)
            				->setFixed(0,HX_("a",61,00,00,00),(int)160)
            				->setFixed(1,HX_("b",62,00,00,00),(int)350)
            				->setFixed(2,HX_("l",6c,00,00,00),(int)255)
            				->setFixed(3,HX_("s",73,00,00,00),(int)75)
            				->setFixed(4,HX_("cw",b4,56,00,00),(int)255)
            				->setFixed(5,HX_("ccw",d7,75,4b,00),(int)75)))->init(13, ::Dynamic(hx::Anon_obj::Create(6)
            				->setFixed(0,HX_("a",61,00,00,00),(int)350)
            				->setFixed(1,HX_("b",62,00,00,00),(int)160)
            				->setFixed(2,HX_("l",6c,00,00,00),(int)255)
            				->setFixed(3,HX_("s",73,00,00,00),(int)75)
            				->setFixed(4,HX_("cw",b4,56,00,00),(int)75)
            				->setFixed(5,HX_("ccw",d7,75,4b,00),(int)255)));
HXLINE( 119)			{
HXLINE( 119)				HX_VARI( Int,_g2) = (int)0;
HXDLIN( 119)				while((_g2 < tests->length)){
HXLINE( 119)					HX_VARI(  ::Dynamic,test) = tests->__get(_g2);
HXDLIN( 119)					++_g2;
HXLINE( 120)					HX_VARI( Float,r) = ::thx::Floats_obj::interpolateAngle(((Float)0.5), ::Dynamic(test->__Field(HX_("a",61,00,00,00),hx::paccDynamic)), ::Dynamic(test->__Field(HX_("b",62,00,00,00),hx::paccDynamic)),null());
HXLINE( 121)					Int _hx_tmp = ( (Int)(test->__Field(HX_("s",73,00,00,00),hx::paccDynamic)) );
HXDLIN( 121)					::String _hx_tmp1 = ((((((HX_("circular interpolation (shortest) at 50% between ",cf,35,bb,32) + ( (Int)(test->__Field(HX_("a",61,00,00,00),hx::paccDynamic)) )) + HX_(" and ",89,11,44,ad)) + ( (Int)(test->__Field(HX_("b",62,00,00,00),hx::paccDynamic)) )) + HX_(" should be ",b0,2e,91,d5)) + ( (Int)(test->__Field(HX_("s",73,00,00,00),hx::paccDynamic)) )) + HX_(" but it is ",60,e9,99,19));
HXDLIN( 121)					::utest::Assert_obj::equals(_hx_tmp,r,(_hx_tmp1 + r),hx::SourceInfo(HX_("TestFloats.hx",f5,5c,b1,8f),121,HX_("thx.TestFloats",13,d9,6a,d7),HX_("testInterpolateAngle",c4,eb,1a,2c)));
HXLINE( 123)					r = ::thx::Floats_obj::interpolateAngleWidest(((Float)0.5), ::Dynamic(test->__Field(HX_("a",61,00,00,00),hx::paccDynamic)), ::Dynamic(test->__Field(HX_("b",62,00,00,00),hx::paccDynamic)),null());
HXLINE( 124)					Int _hx_tmp2 = ( (Int)(test->__Field(HX_("l",6c,00,00,00),hx::paccDynamic)) );
HXDLIN( 124)					::String _hx_tmp3 = ((((((HX_("circular interpolation (longest) at 50% between ",05,d8,45,d2) + ( (Int)(test->__Field(HX_("a",61,00,00,00),hx::paccDynamic)) )) + HX_(" and ",89,11,44,ad)) + ( (Int)(test->__Field(HX_("b",62,00,00,00),hx::paccDynamic)) )) + HX_(" should be ",b0,2e,91,d5)) + ( (Int)(test->__Field(HX_("l",6c,00,00,00),hx::paccDynamic)) )) + HX_(" but it is ",60,e9,99,19));
HXDLIN( 124)					::utest::Assert_obj::equals(_hx_tmp2,r,(_hx_tmp3 + r),hx::SourceInfo(HX_("TestFloats.hx",f5,5c,b1,8f),124,HX_("thx.TestFloats",13,d9,6a,d7),HX_("testInterpolateAngle",c4,eb,1a,2c)));
HXLINE( 126)					r = ::thx::Floats_obj::interpolateAngleCW(((Float)0.5), ::Dynamic(test->__Field(HX_("a",61,00,00,00),hx::paccDynamic)), ::Dynamic(test->__Field(HX_("b",62,00,00,00),hx::paccDynamic)),null());
HXLINE( 127)					Int _hx_tmp4 = ( (Int)(test->__Field(HX_("cw",b4,56,00,00),hx::paccDynamic)) );
HXDLIN( 127)					::String _hx_tmp5 = ((((((HX_("circular interpolation CW at 50% between ",0c,f3,4c,16) + ( (Int)(test->__Field(HX_("a",61,00,00,00),hx::paccDynamic)) )) + HX_(" and ",89,11,44,ad)) + ( (Int)(test->__Field(HX_("b",62,00,00,00),hx::paccDynamic)) )) + HX_(" should be ",b0,2e,91,d5)) + ( (Int)(test->__Field(HX_("cw",b4,56,00,00),hx::paccDynamic)) )) + HX_(" but it is ",60,e9,99,19));
HXDLIN( 127)					::utest::Assert_obj::equals(_hx_tmp4,r,(_hx_tmp5 + r),hx::SourceInfo(HX_("TestFloats.hx",f5,5c,b1,8f),127,HX_("thx.TestFloats",13,d9,6a,d7),HX_("testInterpolateAngle",c4,eb,1a,2c)));
HXLINE( 129)					r = ::thx::Floats_obj::interpolateAngleCCW(((Float)0.5), ::Dynamic(test->__Field(HX_("a",61,00,00,00),hx::paccDynamic)), ::Dynamic(test->__Field(HX_("b",62,00,00,00),hx::paccDynamic)),null());
HXLINE( 130)					Int _hx_tmp6 = ( (Int)(test->__Field(HX_("ccw",d7,75,4b,00),hx::paccDynamic)) );
HXDLIN( 130)					::String _hx_tmp7 = ((((((HX_("circular interpolation CCW at 50% between ",b5,74,10,e6) + ( (Int)(test->__Field(HX_("a",61,00,00,00),hx::paccDynamic)) )) + HX_(" and ",89,11,44,ad)) + ( (Int)(test->__Field(HX_("b",62,00,00,00),hx::paccDynamic)) )) + HX_(" should be ",b0,2e,91,d5)) + ( (Int)(test->__Field(HX_("ccw",d7,75,4b,00),hx::paccDynamic)) )) + HX_(" but it is ",60,e9,99,19));
HXDLIN( 130)					::utest::Assert_obj::equals(_hx_tmp6,r,(_hx_tmp7 + r),hx::SourceInfo(HX_("TestFloats.hx",f5,5c,b1,8f),130,HX_("thx.TestFloats",13,d9,6a,d7),HX_("testInterpolateAngle",c4,eb,1a,2c)));
            				}
            			}
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestFloats_obj,testInterpolateAngle,(void))


TestFloats_obj::TestFloats_obj()
{
}

hx::Val TestFloats_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 1:
		if (HX_FIELD_EQ(inName,"x") ) { return hx::Val( x); }
		break;
	case 9:
		if (HX_FIELD_EQ(inName,"testClamp") ) { return hx::Val( testClamp_dyn()); }
		if (HX_FIELD_EQ(inName,"testRound") ) { return hx::Val( testRound_dyn()); }
		break;
	case 11:
		if (HX_FIELD_EQ(inName,"testCompare") ) { return hx::Val( testCompare_dyn()); }
		break;
	case 12:
		if (HX_FIELD_EQ(inName,"testClampSym") ) { return hx::Val( testClampSym_dyn()); }
		break;
	case 13:
		if (HX_FIELD_EQ(inName,"testNormalize") ) { return hx::Val( testNormalize_dyn()); }
		break;
	case 19:
		if (HX_FIELD_EQ(inName,"testAngleDifference") ) { return hx::Val( testAngleDifference_dyn()); }
		break;
	case 20:
		if (HX_FIELD_EQ(inName,"testInterpolateAngle") ) { return hx::Val( testInterpolateAngle_dyn()); }
	}
	return super::__Field(inName,inCallProp);
}

hx::Val TestFloats_obj::__SetField(const ::String &inName,const hx::Val &inValue,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 1:
		if (HX_FIELD_EQ(inName,"x") ) { x=inValue.Cast< Int >(); return inValue; }
	}
	return super::__SetField(inName,inValue,inCallProp);
}

void TestFloats_obj::__GetFields(Array< ::String> &outFields)
{
	outFields->push(HX_HCSTRING("x","\x78","\x00","\x00","\x00"));
	super::__GetFields(outFields);
};

#if HXCPP_SCRIPTABLE
static hx::StorageInfo TestFloats_obj_sMemberStorageInfo[] = {
	{hx::fsInt,(int)offsetof(TestFloats_obj,x),HX_HCSTRING("x","\x78","\x00","\x00","\x00")},
	{ hx::fsUnknown, 0, null()}
};
static hx::StaticInfo *TestFloats_obj_sStaticStorageInfo = 0;
#endif

static ::String TestFloats_obj_sMemberFields[] = {
	HX_HCSTRING("x","\x78","\x00","\x00","\x00"),
	HX_HCSTRING("testNormalize","\xdb","\xb4","\xdb","\xde"),
	HX_HCSTRING("testClamp","\x49","\xb1","\x5a","\x11"),
	HX_HCSTRING("testClampSym","\x3e","\xe7","\x29","\xf2"),
	HX_HCSTRING("testCompare","\x73","\x06","\x32","\x40"),
	HX_HCSTRING("testRound","\x9c","\x36","\x68","\xb6"),
	HX_HCSTRING("testAngleDifference","\x7e","\x75","\x49","\xfd"),
	HX_HCSTRING("testInterpolateAngle","\xc4","\xeb","\x1a","\x2c"),
	::String(null()) };

static void TestFloats_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(TestFloats_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void TestFloats_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(TestFloats_obj::__mClass,"__mClass");
};

#endif

hx::Class TestFloats_obj::__mClass;

void TestFloats_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.TestFloats","\x13","\xd9","\x6a","\xd7");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &hx::Class_obj::GetNoStaticField;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = TestFloats_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(0 /* sStaticFields */);
	__mClass->mMembers = hx::Class_obj::dupFunctions(TestFloats_obj_sMemberFields);
	__mClass->mCanCast = hx::TCanCast< TestFloats_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = TestFloats_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = TestFloats_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = TestFloats_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx