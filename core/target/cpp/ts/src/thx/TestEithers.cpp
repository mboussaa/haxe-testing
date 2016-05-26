// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_haxe_ds_Option
#include <haxe/ds/Option.h>
#endif
#ifndef INCLUDED_thx_Either
#include <thx/Either.h>
#endif
#ifndef INCLUDED_thx_Eithers
#include <thx/Eithers.h>
#endif
#ifndef INCLUDED_thx_TestEithers
#include <thx/TestEithers.h>
#endif
#ifndef INCLUDED_utest_Assert
#include <utest/Assert.h>
#endif

namespace thx{

void TestEithers_obj::__construct(){
            	HX_STACK_FRAME("thx.TestEithers","new",0x7f77c044,"thx.TestEithers.new","thx/TestEithers.hx",8,0x0f3d936d)
            	HX_STACK_THIS(this)
            	}

Dynamic TestEithers_obj::__CreateEmpty() { return new TestEithers_obj; }

hx::ObjectPtr< TestEithers_obj > TestEithers_obj::__new()
{
	hx::ObjectPtr< TestEithers_obj > _hx_result = new TestEithers_obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic TestEithers_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< TestEithers_obj > _hx_result = new TestEithers_obj();
	_hx_result->__construct();
	return _hx_result;
}

void TestEithers_obj::testIsLeft(){
            	HX_STACK_FRAME("thx.TestEithers","testIsLeft",0x82c0a79f,"thx.TestEithers.testIsLeft","thx/TestEithers.hx",10,0x0f3d936d)
            	HX_STACK_THIS(this)
HXLINE(  11)		::hx::EnumBase _hx_tmp = ::thx::Either_obj::Left((int)123);
HXDLIN(  11)		Bool _hx_tmp1 = ::thx::Eithers_obj::isLeft(_hx_tmp);
HXDLIN(  11)		::utest::Assert_obj::isTrue(_hx_tmp1,null(),hx::SourceInfo(HX_("TestEithers.hx",02,6b,22,ce),11,HX_("thx.TestEithers",52,8e,01,2f),HX_("testIsLeft",03,13,0b,7e)));
HXLINE(  12)		::hx::EnumBase _hx_tmp2 = ::thx::Either_obj::Right((int)123);
HXDLIN(  12)		Bool _hx_tmp3 = ::thx::Eithers_obj::isLeft(_hx_tmp2);
HXDLIN(  12)		::utest::Assert_obj::isFalse(_hx_tmp3,null(),hx::SourceInfo(HX_("TestEithers.hx",02,6b,22,ce),12,HX_("thx.TestEithers",52,8e,01,2f),HX_("testIsLeft",03,13,0b,7e)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestEithers_obj,testIsLeft,(void))

void TestEithers_obj::testIsRight(){
            	HX_STACK_FRAME("thx.TestEithers","testIsRight",0x5cdf1144,"thx.TestEithers.testIsRight","thx/TestEithers.hx",15,0x0f3d936d)
            	HX_STACK_THIS(this)
HXLINE(  16)		::hx::EnumBase _hx_tmp = ::thx::Either_obj::Left((int)123);
HXDLIN(  16)		Bool _hx_tmp1 = ::thx::Eithers_obj::isRight(_hx_tmp);
HXDLIN(  16)		::utest::Assert_obj::isFalse(_hx_tmp1,null(),hx::SourceInfo(HX_("TestEithers.hx",02,6b,22,ce),16,HX_("thx.TestEithers",52,8e,01,2f),HX_("testIsRight",60,9d,b2,42)));
HXLINE(  17)		::hx::EnumBase _hx_tmp2 = ::thx::Either_obj::Right((int)123);
HXDLIN(  17)		Bool _hx_tmp3 = ::thx::Eithers_obj::isRight(_hx_tmp2);
HXDLIN(  17)		::utest::Assert_obj::isTrue(_hx_tmp3,null(),hx::SourceInfo(HX_("TestEithers.hx",02,6b,22,ce),17,HX_("thx.TestEithers",52,8e,01,2f),HX_("testIsRight",60,9d,b2,42)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestEithers_obj,testIsRight,(void))

void TestEithers_obj::testToLeft(){
            	HX_STACK_FRAME("thx.TestEithers","testToLeft",0x9b134db0,"thx.TestEithers.testToLeft","thx/TestEithers.hx",20,0x0f3d936d)
            	HX_STACK_THIS(this)
HXLINE(  21)		::hx::EnumBase _hx_tmp = ::thx::Either_obj::Left((int)123);
HXDLIN(  21)		HX_VARI( ::hx::EnumBase,_g) = ::thx::Eithers_obj::toLeft(_hx_tmp);
HXDLIN(  21)		 ::Dynamic _hx_tmp1;
HXDLIN(  21)		Int _hx_tmp2 = ( ( ::hx::EnumBase)(_g) )->_hx_getIndex();
HXDLIN(  21)		switch((int)(_hx_tmp2)){
            			case (int)0: {
HXLINE(  21)				_hx_tmp1 = ( (Int)(_g->_hx_getObject(0)) );
            			}
            			break;
            			case (int)1: {
HXLINE(  21)				_hx_tmp1 = null();
            			}
            			break;
            		}
HXDLIN(  21)		::utest::Assert_obj::same((int)123,_hx_tmp1,null(),null(),null(),hx::SourceInfo(HX_("TestEithers.hx",02,6b,22,ce),21,HX_("thx.TestEithers",52,8e,01,2f),HX_("testToLeft",14,b9,5d,96)));
HXLINE(  26)		::hx::EnumBase _hx_tmp3 = ::thx::Either_obj::Right((int)123);
HXDLIN(  26)		HX_VARI( ::hx::EnumBase,_g1) = ::thx::Eithers_obj::toLeft(_hx_tmp3);
HXDLIN(  26)		 ::Dynamic _hx_tmp4;
HXDLIN(  26)		Int _hx_tmp5 = ( ( ::hx::EnumBase)(_g1) )->_hx_getIndex();
HXDLIN(  26)		switch((int)(_hx_tmp5)){
            			case (int)0: {
HXLINE(  26)				_hx_tmp4 = _g1->_hx_getObject(0);
            			}
            			break;
            			case (int)1: {
HXLINE(  26)				_hx_tmp4 = null();
            			}
            			break;
            		}
HXDLIN(  26)		::utest::Assert_obj::isNull(_hx_tmp4,null(),hx::SourceInfo(HX_("TestEithers.hx",02,6b,22,ce),26,HX_("thx.TestEithers",52,8e,01,2f),HX_("testToLeft",14,b9,5d,96)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestEithers_obj,testToLeft,(void))

void TestEithers_obj::testToRight(){
            	HX_STACK_FRAME("thx.TestEithers","testToRight",0x8cddba13,"thx.TestEithers.testToRight","thx/TestEithers.hx",32,0x0f3d936d)
            	HX_STACK_THIS(this)
HXLINE(  33)		::hx::EnumBase _hx_tmp = ::thx::Either_obj::Right((int)123);
HXDLIN(  33)		HX_VARI( ::hx::EnumBase,_g) = ::thx::Eithers_obj::toRight(_hx_tmp);
HXDLIN(  33)		 ::Dynamic _hx_tmp1;
HXDLIN(  33)		Int _hx_tmp2 = ( ( ::hx::EnumBase)(_g) )->_hx_getIndex();
HXDLIN(  33)		switch((int)(_hx_tmp2)){
            			case (int)0: {
HXLINE(  33)				_hx_tmp1 = ( (Int)(_g->_hx_getObject(0)) );
            			}
            			break;
            			case (int)1: {
HXLINE(  33)				_hx_tmp1 = null();
            			}
            			break;
            		}
HXDLIN(  33)		::utest::Assert_obj::same((int)123,_hx_tmp1,null(),null(),null(),hx::SourceInfo(HX_("TestEithers.hx",02,6b,22,ce),33,HX_("thx.TestEithers",52,8e,01,2f),HX_("testToRight",2f,46,b1,72)));
HXLINE(  38)		::hx::EnumBase _hx_tmp3 = ::thx::Either_obj::Left((int)123);
HXDLIN(  38)		HX_VARI( ::hx::EnumBase,_g1) = ::thx::Eithers_obj::toRight(_hx_tmp3);
HXDLIN(  38)		 ::Dynamic _hx_tmp4;
HXDLIN(  38)		Int _hx_tmp5 = ( ( ::hx::EnumBase)(_g1) )->_hx_getIndex();
HXDLIN(  38)		switch((int)(_hx_tmp5)){
            			case (int)0: {
HXLINE(  38)				_hx_tmp4 = _g1->_hx_getObject(0);
            			}
            			break;
            			case (int)1: {
HXLINE(  38)				_hx_tmp4 = null();
            			}
            			break;
            		}
HXDLIN(  38)		::utest::Assert_obj::isNull(_hx_tmp4,null(),hx::SourceInfo(HX_("TestEithers.hx",02,6b,22,ce),38,HX_("thx.TestEithers",52,8e,01,2f),HX_("testToRight",2f,46,b1,72)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestEithers_obj,testToRight,(void))

void TestEithers_obj::testToLeftUnsafe(){
            	HX_STACK_FRAME("thx.TestEithers","testToLeftUnsafe",0xd583a9f6,"thx.TestEithers.testToLeftUnsafe","thx/TestEithers.hx",44,0x0f3d936d)
            	HX_STACK_THIS(this)
HXLINE(  45)		::hx::EnumBase _hx_tmp = ::thx::Either_obj::Left((int)123);
HXDLIN(  45)		 ::Dynamic _hx_tmp1 = ::thx::Eithers_obj::toLeftUnsafe(_hx_tmp);
HXDLIN(  45)		::utest::Assert_obj::same((int)123,_hx_tmp1,null(),null(),null(),hx::SourceInfo(HX_("TestEithers.hx",02,6b,22,ce),45,HX_("thx.TestEithers",52,8e,01,2f),HX_("testToLeftUnsafe",5a,b8,52,1b)));
HXLINE(  46)		::hx::EnumBase _hx_tmp2 = ::thx::Either_obj::Right((int)123);
HXDLIN(  46)		 ::Dynamic _hx_tmp3 = ::thx::Eithers_obj::toLeftUnsafe(_hx_tmp2);
HXDLIN(  46)		::utest::Assert_obj::same(null(),_hx_tmp3,null(),null(),null(),hx::SourceInfo(HX_("TestEithers.hx",02,6b,22,ce),46,HX_("thx.TestEithers",52,8e,01,2f),HX_("testToLeftUnsafe",5a,b8,52,1b)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestEithers_obj,testToLeftUnsafe,(void))

void TestEithers_obj::testToRightUnsafe(){
            	HX_STACK_FRAME("thx.TestEithers","testToRightUnsafe",0x5db40299,"thx.TestEithers.testToRightUnsafe","thx/TestEithers.hx",49,0x0f3d936d)
            	HX_STACK_THIS(this)
HXLINE(  50)		::hx::EnumBase _hx_tmp = ::thx::Either_obj::Right((int)123);
HXDLIN(  50)		 ::Dynamic _hx_tmp1 = ::thx::Eithers_obj::toRightUnsafe(_hx_tmp);
HXDLIN(  50)		::utest::Assert_obj::same((int)123,_hx_tmp1,null(),null(),null(),hx::SourceInfo(HX_("TestEithers.hx",02,6b,22,ce),50,HX_("thx.TestEithers",52,8e,01,2f),HX_("testToRightUnsafe",b5,8b,11,2d)));
HXLINE(  51)		::hx::EnumBase _hx_tmp2 = ::thx::Either_obj::Left((int)123);
HXDLIN(  51)		 ::Dynamic _hx_tmp3 = ::thx::Eithers_obj::toRightUnsafe(_hx_tmp2);
HXDLIN(  51)		::utest::Assert_obj::same(null(),_hx_tmp3,null(),null(),null(),hx::SourceInfo(HX_("TestEithers.hx",02,6b,22,ce),51,HX_("thx.TestEithers",52,8e,01,2f),HX_("testToRightUnsafe",b5,8b,11,2d)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestEithers_obj,testToRightUnsafe,(void))

void TestEithers_obj::testFlatMap(){
            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_0) HXARGC(1)
            		::hx::EnumBase _hx_run( ::Dynamic r){
            			HX_STACK_FRAME("thx.TestEithers","testFlatMap",0xbdd37215,"thx.TestEithers.testFlatMap","thx/TestEithers.hx",56,0x0f3d936d)
            			HX_STACK_ARG(r,"r")
HXLINE(  56)			return ::thx::Either_obj::Left((int)10);
            		}
            		HX_END_LOCAL_FUNC1(return)

            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_1) HXARGC(1)
            		::hx::EnumBase _hx_run( ::Dynamic r1){
            			HX_STACK_FRAME("thx.TestEithers","testFlatMap",0xbdd37215,"thx.TestEithers.testFlatMap","thx/TestEithers.hx",60,0x0f3d936d)
            			HX_STACK_ARG(r1,"r1")
HXLINE(  60)			return ::thx::Either_obj::Right((int)10);
            		}
            		HX_END_LOCAL_FUNC1(return)

            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_2) HXARGC(1)
            		::hx::EnumBase _hx_run(Int r2){
            			HX_STACK_FRAME("thx.TestEithers","testFlatMap",0xbdd37215,"thx.TestEithers.testFlatMap","thx/TestEithers.hx",64,0x0f3d936d)
            			HX_STACK_ARG(r2,"r2")
HXLINE(  64)			return ::thx::Either_obj::Left((int)10);
            		}
            		HX_END_LOCAL_FUNC1(return)

            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_3) HXARGC(1)
            		::hx::EnumBase _hx_run(Int r3){
            			HX_STACK_FRAME("thx.TestEithers","testFlatMap",0xbdd37215,"thx.TestEithers.testFlatMap","thx/TestEithers.hx",68,0x0f3d936d)
            			HX_STACK_ARG(r3,"r3")
HXLINE(  68)			return ::thx::Either_obj::Right((int)10);
            		}
            		HX_END_LOCAL_FUNC1(return)

            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_4) HXARGC(1)
            		::hx::EnumBase _hx_run( ::Dynamic r4){
            			HX_STACK_FRAME("thx.TestEithers","testFlatMap",0xbdd37215,"thx.TestEithers.testFlatMap","thx/TestEithers.hx",72,0x0f3d936d)
            			HX_STACK_ARG(r4,"r4")
HXLINE(  72)			return ::thx::Either_obj::Left((int)10);
            		}
            		HX_END_LOCAL_FUNC1(return)

            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_5) HXARGC(1)
            		::hx::EnumBase _hx_run( ::Dynamic r5){
            			HX_STACK_FRAME("thx.TestEithers","testFlatMap",0xbdd37215,"thx.TestEithers.testFlatMap","thx/TestEithers.hx",76,0x0f3d936d)
            			HX_STACK_ARG(r5,"r5")
HXLINE(  76)			return ::thx::Either_obj::Right((int)10);
            		}
            		HX_END_LOCAL_FUNC1(return)

            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_6) HXARGC(1)
            		::hx::EnumBase _hx_run(Int r6){
            			HX_STACK_FRAME("thx.TestEithers","testFlatMap",0xbdd37215,"thx.TestEithers.testFlatMap","thx/TestEithers.hx",80,0x0f3d936d)
            			HX_STACK_ARG(r6,"r6")
HXLINE(  80)			return ::thx::Either_obj::Left((int)10);
            		}
            		HX_END_LOCAL_FUNC1(return)

            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_7) HXARGC(1)
            		::hx::EnumBase _hx_run(Int r7){
            			HX_STACK_FRAME("thx.TestEithers","testFlatMap",0xbdd37215,"thx.TestEithers.testFlatMap","thx/TestEithers.hx",84,0x0f3d936d)
            			HX_STACK_ARG(r7,"r7")
HXLINE(  84)			return ::thx::Either_obj::Right((int)10);
            		}
            		HX_END_LOCAL_FUNC1(return)

            	HX_STACK_FRAME("thx.TestEithers","testFlatMap",0xbdd37215,"thx.TestEithers.testFlatMap","thx/TestEithers.hx",54,0x0f3d936d)
            	HX_STACK_THIS(this)
HXLINE(  55)		::hx::EnumBase _hx_tmp = ::thx::Either_obj::Left((int)5);
HXDLIN(  55)		::hx::EnumBase _hx_tmp1 = ::thx::Eithers_obj::flatMap(_hx_tmp, ::Dynamic(new _hx_Closure_0()));
HXDLIN(  55)		 ::Dynamic _hx_tmp2 = ::thx::Eithers_obj::toLeftUnsafe(_hx_tmp1);
HXDLIN(  55)		::utest::Assert_obj::same((int)5,_hx_tmp2,null(),null(),null(),hx::SourceInfo(HX_("TestEithers.hx",02,6b,22,ce),55,HX_("thx.TestEithers",52,8e,01,2f),HX_("testFlatMap",31,fe,a6,a3)));
HXLINE(  59)		::hx::EnumBase _hx_tmp3 = ::thx::Either_obj::Left((int)5);
HXDLIN(  59)		::hx::EnumBase _hx_tmp4 = ::thx::Eithers_obj::flatMap(_hx_tmp3, ::Dynamic(new _hx_Closure_1()));
HXDLIN(  59)		 ::Dynamic _hx_tmp5 = ::thx::Eithers_obj::toLeftUnsafe(_hx_tmp4);
HXDLIN(  59)		::utest::Assert_obj::same((int)5,_hx_tmp5,null(),null(),null(),hx::SourceInfo(HX_("TestEithers.hx",02,6b,22,ce),59,HX_("thx.TestEithers",52,8e,01,2f),HX_("testFlatMap",31,fe,a6,a3)));
HXLINE(  63)		::hx::EnumBase _hx_tmp6 = ::thx::Either_obj::Right((int)5);
HXDLIN(  63)		::hx::EnumBase _hx_tmp7 = ::thx::Eithers_obj::flatMap(_hx_tmp6, ::Dynamic(new _hx_Closure_2()));
HXDLIN(  63)		 ::Dynamic _hx_tmp8 = ::thx::Eithers_obj::toLeftUnsafe(_hx_tmp7);
HXDLIN(  63)		::utest::Assert_obj::same((int)10,_hx_tmp8,null(),null(),null(),hx::SourceInfo(HX_("TestEithers.hx",02,6b,22,ce),63,HX_("thx.TestEithers",52,8e,01,2f),HX_("testFlatMap",31,fe,a6,a3)));
HXLINE(  67)		::hx::EnumBase _hx_tmp9 = ::thx::Either_obj::Right((int)5);
HXDLIN(  67)		::hx::EnumBase _hx_tmp10 = ::thx::Eithers_obj::flatMap(_hx_tmp9, ::Dynamic(new _hx_Closure_3()));
HXDLIN(  67)		 ::Dynamic _hx_tmp11 = ::thx::Eithers_obj::toLeftUnsafe(_hx_tmp10);
HXDLIN(  67)		::utest::Assert_obj::same(null(),_hx_tmp11,null(),null(),null(),hx::SourceInfo(HX_("TestEithers.hx",02,6b,22,ce),67,HX_("thx.TestEithers",52,8e,01,2f),HX_("testFlatMap",31,fe,a6,a3)));
HXLINE(  71)		::hx::EnumBase _hx_tmp12 = ::thx::Either_obj::Left((int)5);
HXDLIN(  71)		::hx::EnumBase _hx_tmp13 = ::thx::Eithers_obj::flatMap(_hx_tmp12, ::Dynamic(new _hx_Closure_4()));
HXDLIN(  71)		 ::Dynamic _hx_tmp14 = ::thx::Eithers_obj::toRightUnsafe(_hx_tmp13);
HXDLIN(  71)		::utest::Assert_obj::same(null(),_hx_tmp14,null(),null(),null(),hx::SourceInfo(HX_("TestEithers.hx",02,6b,22,ce),71,HX_("thx.TestEithers",52,8e,01,2f),HX_("testFlatMap",31,fe,a6,a3)));
HXLINE(  75)		::hx::EnumBase _hx_tmp15 = ::thx::Either_obj::Left((int)5);
HXDLIN(  75)		::hx::EnumBase _hx_tmp16 = ::thx::Eithers_obj::flatMap(_hx_tmp15, ::Dynamic(new _hx_Closure_5()));
HXDLIN(  75)		 ::Dynamic _hx_tmp17 = ::thx::Eithers_obj::toRightUnsafe(_hx_tmp16);
HXDLIN(  75)		::utest::Assert_obj::same(null(),_hx_tmp17,null(),null(),null(),hx::SourceInfo(HX_("TestEithers.hx",02,6b,22,ce),75,HX_("thx.TestEithers",52,8e,01,2f),HX_("testFlatMap",31,fe,a6,a3)));
HXLINE(  79)		::hx::EnumBase _hx_tmp18 = ::thx::Either_obj::Right((int)5);
HXDLIN(  79)		::hx::EnumBase _hx_tmp19 = ::thx::Eithers_obj::flatMap(_hx_tmp18, ::Dynamic(new _hx_Closure_6()));
HXDLIN(  79)		 ::Dynamic _hx_tmp20 = ::thx::Eithers_obj::toRightUnsafe(_hx_tmp19);
HXDLIN(  79)		::utest::Assert_obj::same(null(),_hx_tmp20,null(),null(),null(),hx::SourceInfo(HX_("TestEithers.hx",02,6b,22,ce),79,HX_("thx.TestEithers",52,8e,01,2f),HX_("testFlatMap",31,fe,a6,a3)));
HXLINE(  83)		::hx::EnumBase _hx_tmp21 = ::thx::Either_obj::Right((int)5);
HXDLIN(  83)		::hx::EnumBase _hx_tmp22 = ::thx::Eithers_obj::flatMap(_hx_tmp21, ::Dynamic(new _hx_Closure_7()));
HXDLIN(  83)		 ::Dynamic _hx_tmp23 = ::thx::Eithers_obj::toRightUnsafe(_hx_tmp22);
HXDLIN(  83)		::utest::Assert_obj::same((int)10,_hx_tmp23,null(),null(),null(),hx::SourceInfo(HX_("TestEithers.hx",02,6b,22,ce),83,HX_("thx.TestEithers",52,8e,01,2f),HX_("testFlatMap",31,fe,a6,a3)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestEithers_obj,testFlatMap,(void))

void TestEithers_obj::testLeftMap(){
            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_0) HXARGC(1)
            		Int _hx_run(Int i){
            			HX_STACK_FRAME("thx.TestEithers","testLeftMap",0xcbd59a87,"thx.TestEithers.testLeftMap","thx/TestEithers.hx",92,0x0f3d936d)
            			HX_STACK_ARG(i,"i")
HXLINE(  92)			return (i + (int)1);
            		}
            		HX_END_LOCAL_FUNC1(return)

            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_1) HXARGC(1)
            		Int _hx_run(Int i1){
            			HX_STACK_FRAME("thx.TestEithers","testLeftMap",0xcbd59a87,"thx.TestEithers.testLeftMap","thx/TestEithers.hx",93,0x0f3d936d)
            			HX_STACK_ARG(i1,"i1")
HXLINE(  93)			return (i1 + (int)1);
            		}
            		HX_END_LOCAL_FUNC1(return)

            	HX_STACK_FRAME("thx.TestEithers","testLeftMap",0xcbd59a87,"thx.TestEithers.testLeftMap","thx/TestEithers.hx",88,0x0f3d936d)
            	HX_STACK_THIS(this)
HXLINE(  89)		HX_VARI( ::hx::EnumBase,l) = ::thx::Either_obj::Left((int)1);
HXLINE(  90)		HX_VARI( ::hx::EnumBase,rt) = ::thx::Either_obj::Right(true);
HXLINE(  91)		HX_VARI( ::hx::EnumBase,l2) = ::thx::Either_obj::Left((int)2);
HXLINE(  92)		::hx::EnumBase _hx_tmp = ::thx::Eithers_obj::leftMap(l, ::Dynamic(new _hx_Closure_0()));
HXDLIN(  92)		::utest::Assert_obj::same(l2,_hx_tmp,null(),null(),null(),hx::SourceInfo(HX_("TestEithers.hx",02,6b,22,ce),92,HX_("thx.TestEithers",52,8e,01,2f),HX_("testLeftMap",a3,26,a9,b1)));
HXLINE(  93)		::hx::EnumBase _hx_tmp1 = ::thx::Eithers_obj::leftMap(rt, ::Dynamic(new _hx_Closure_1()));
HXDLIN(  93)		::utest::Assert_obj::same(rt,_hx_tmp1,null(),null(),null(),hx::SourceInfo(HX_("TestEithers.hx",02,6b,22,ce),93,HX_("thx.TestEithers",52,8e,01,2f),HX_("testLeftMap",a3,26,a9,b1)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestEithers_obj,testLeftMap,(void))


TestEithers_obj::TestEithers_obj()
{
}

hx::Val TestEithers_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 10:
		if (HX_FIELD_EQ(inName,"testIsLeft") ) { return hx::Val( testIsLeft_dyn()); }
		if (HX_FIELD_EQ(inName,"testToLeft") ) { return hx::Val( testToLeft_dyn()); }
		break;
	case 11:
		if (HX_FIELD_EQ(inName,"testIsRight") ) { return hx::Val( testIsRight_dyn()); }
		if (HX_FIELD_EQ(inName,"testToRight") ) { return hx::Val( testToRight_dyn()); }
		if (HX_FIELD_EQ(inName,"testFlatMap") ) { return hx::Val( testFlatMap_dyn()); }
		if (HX_FIELD_EQ(inName,"testLeftMap") ) { return hx::Val( testLeftMap_dyn()); }
		break;
	case 16:
		if (HX_FIELD_EQ(inName,"testToLeftUnsafe") ) { return hx::Val( testToLeftUnsafe_dyn()); }
		break;
	case 17:
		if (HX_FIELD_EQ(inName,"testToRightUnsafe") ) { return hx::Val( testToRightUnsafe_dyn()); }
	}
	return super::__Field(inName,inCallProp);
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *TestEithers_obj_sMemberStorageInfo = 0;
static hx::StaticInfo *TestEithers_obj_sStaticStorageInfo = 0;
#endif

static ::String TestEithers_obj_sMemberFields[] = {
	HX_HCSTRING("testIsLeft","\x03","\x13","\x0b","\x7e"),
	HX_HCSTRING("testIsRight","\x60","\x9d","\xb2","\x42"),
	HX_HCSTRING("testToLeft","\x14","\xb9","\x5d","\x96"),
	HX_HCSTRING("testToRight","\x2f","\x46","\xb1","\x72"),
	HX_HCSTRING("testToLeftUnsafe","\x5a","\xb8","\x52","\x1b"),
	HX_HCSTRING("testToRightUnsafe","\xb5","\x8b","\x11","\x2d"),
	HX_HCSTRING("testFlatMap","\x31","\xfe","\xa6","\xa3"),
	HX_HCSTRING("testLeftMap","\xa3","\x26","\xa9","\xb1"),
	::String(null()) };

static void TestEithers_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(TestEithers_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void TestEithers_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(TestEithers_obj::__mClass,"__mClass");
};

#endif

hx::Class TestEithers_obj::__mClass;

void TestEithers_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.TestEithers","\x52","\x8e","\x01","\x2f");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &hx::Class_obj::GetNoStaticField;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = TestEithers_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(0 /* sStaticFields */);
	__mClass->mMembers = hx::Class_obj::dupFunctions(TestEithers_obj_sMemberFields);
	__mClass->mCanCast = hx::TCanCast< TestEithers_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = TestEithers_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = TestEithers_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = TestEithers_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx
