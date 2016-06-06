// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_thx_Either
#include <thx/Either.h>
#endif
#ifndef INCLUDED_thx_Functions2
#include <thx/Functions2.h>
#endif
#ifndef INCLUDED_thx_NonEmptyList
#include <thx/NonEmptyList.h>
#endif
#ifndef INCLUDED_thx_TestValidation
#include <thx/TestValidation.h>
#endif
#ifndef INCLUDED_thx__Nel_Nel_Impl_
#include <thx/_Nel/Nel_Impl_.h>
#endif
#ifndef INCLUDED_thx__Validation_Validation_Impl_
#include <thx/_Validation/Validation_Impl_.h>
#endif
#ifndef INCLUDED_utest_Assert
#include <utest/Assert.h>
#endif

namespace thx{

void TestValidation_obj::__construct(Int i){
            	HX_STACK_FRAME("thx.TestValidation","new",0xfe908f67,"thx.TestValidation.new","thx/TestValidation.hx",17,0x371e88c8)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(i,"i")
HXLINE(  17)		this->x = i;
            	}

Dynamic TestValidation_obj::__CreateEmpty() { return new TestValidation_obj; }

hx::ObjectPtr< TestValidation_obj > TestValidation_obj::__new(Int i)
{
	hx::ObjectPtr< TestValidation_obj > _hx_result = new TestValidation_obj();
	_hx_result->__construct(i);
	return _hx_result;
}

Dynamic TestValidation_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< TestValidation_obj > _hx_result = new TestValidation_obj();
	_hx_result->__construct(inArgs[0]);
	return _hx_result;
}

Bool TestValidation_obj::or4(Bool b1,Bool b2,Bool b3,Bool b4){
            	HX_STACK_FRAME("thx.TestValidation","or4",0xfe915cb8,"thx.TestValidation.or4","thx/TestValidation.hx",21,0x371e88c8)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(b1,"b1")
            	HX_STACK_ARG(b2,"b2")
            	HX_STACK_ARG(b3,"b3")
            	HX_STACK_ARG(b4,"b4")
HXLINE(  21)		Bool _hx_tmp;
HXDLIN(  21)		Bool _hx_tmp1;
HXDLIN(  21)		if (!(b1)) {
HXLINE(  21)			_hx_tmp1 = b2;
            		}
            		else {
HXLINE(  21)			_hx_tmp1 = true;
            		}
HXDLIN(  21)		if (!(_hx_tmp1)) {
HXLINE(  21)			_hx_tmp = b3;
            		}
            		else {
HXLINE(  21)			_hx_tmp = true;
            		}
HXDLIN(  21)		if (!(_hx_tmp)) {
HXLINE(  21)			return b4;
            		}
            		else {
HXLINE(  21)			return true;
            		}
HXDLIN(  21)		return false;
            	}


HX_DEFINE_DYNAMIC_FUNC4(TestValidation_obj,or4,return )

Int TestValidation_obj::add(Int a,Int b){
            	HX_STACK_FRAME("thx.TestValidation","add",0xfe86b128,"thx.TestValidation.add","thx/TestValidation.hx",24,0x371e88c8)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(a,"a")
            	HX_STACK_ARG(b,"b")
HXLINE(  24)		return (a + b);
            	}


HX_DEFINE_DYNAMIC_FUNC2(TestValidation_obj,add,return )

void TestValidation_obj::testAp(){
            	HX_STACK_FRAME("thx.TestValidation","testAp",0xa8df593a,"thx.TestValidation.testAp","thx/TestValidation.hx",27,0x371e88c8)
            	HX_STACK_THIS(this)
HXLINE(  27)		HX_VARI( Int,_g1) = (int)0;
HXDLIN(  27)		HX_VARI( Int,_g) = this->x;
HXDLIN(  27)		while((_g1 < _g)){
            			HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_0) HXARGC(1)
            			Int _hx_run(Bool b){
            				HX_STACK_FRAME("thx.TestValidation","testAp",0xa8df593a,"thx.TestValidation.testAp","thx/TestValidation.hx",31,0x371e88c8)
            				HX_STACK_ARG(b,"b")
HXLINE(  31)				if (b) {
HXLINE(  31)					return (int)1;
            				}
            				else {
HXLINE(  31)					return (int)0;
            				}
HXDLIN(  31)				return (int)0;
            			}
            			HX_END_LOCAL_FUNC1(return)

HXLINE(  27)			++_g1;
HXLINE(  28)			HX_VARI( ::hx::EnumBase,l1) = ::thx::Either_obj::Left((int)1);
HXLINE(  29)			HX_VARI( ::hx::EnumBase,rt) = ::thx::Either_obj::Right(true);
HXLINE(  31)			HX_VARI( ::hx::EnumBase,rbi) = ::thx::Either_obj::Right( ::Dynamic(new _hx_Closure_0()));
HXLINE(  33)			::hx::EnumBase _hx_tmp = ::thx::_Validation::Validation_Impl__obj::ap(l1,rbi,this->add_dyn());
HXDLIN(  33)			::utest::Assert_obj::same(l1,_hx_tmp,null(),null(),null(),hx::SourceInfo(HX_("TestValidation.hx",53,dc,16,5e),33,HX_("thx.TestValidation",f5,4f,55,d8),HX_("testAp",e1,39,3a,d5)));
HXLINE(  34)			::hx::EnumBase _hx_tmp1 = ::thx::Either_obj::Right((int)1);
HXDLIN(  34)			::hx::EnumBase _hx_tmp2 = ::thx::_Validation::Validation_Impl__obj::ap(rt,rbi,this->add_dyn());
HXDLIN(  34)			::utest::Assert_obj::same(_hx_tmp1,_hx_tmp2,null(),null(),null(),hx::SourceInfo(HX_("TestValidation.hx",53,dc,16,5e),34,HX_("thx.TestValidation",f5,4f,55,d8),HX_("testAp",e1,39,3a,d5)));
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestValidation_obj,testAp,(void))

void TestValidation_obj::testVal4(){
            	HX_STACK_FRAME("thx.TestValidation","testVal4",0x302a133e,"thx.TestValidation.testVal4","thx/TestValidation.hx",40,0x371e88c8)
            	HX_STACK_THIS(this)
HXLINE(  40)		HX_VARI( Int,_g1) = (int)0;
HXDLIN(  40)		HX_VARI( Int,_g) = this->x;
HXDLIN(  40)		while((_g1 < _g)){
            			HX_BEGIN_LOCAL_FUNC_S1(hx::LocalFunc,_hx_Closure_1, ::Dynamic,f1) HXARGC(3)
            			 ::Dynamic _hx_run(Bool a,Bool b,Bool c){
            				HX_BEGIN_LOCAL_FUNC_S4(hx::LocalFunc,_hx_Closure_0,Bool,a,Bool,b,Bool,c, ::Dynamic,f1) HXARGC(1)
            				Bool _hx_run(Bool d){
            					HX_STACK_FRAME("thx.TestValidation","testVal4",0x302a133e,"thx.TestValidation.testVal4","thx/TestValidation.hx",45,0x371e88c8)
            					HX_STACK_ARG(d,"d")
HXLINE(  45)					return ( (Bool)(f1(a,b,c,d)) );
            				}
            				HX_END_LOCAL_FUNC1(return)

            				HX_STACK_FRAME("thx.TestValidation","testVal4",0x302a133e,"thx.TestValidation.testVal4","thx/TestValidation.hx",45,0x371e88c8)
            				HX_STACK_ARG(a,"a")
            				HX_STACK_ARG(b,"b")
            				HX_STACK_ARG(c,"c")
HXLINE(  45)				return  ::Dynamic(new _hx_Closure_0(a,b,c,f1));
            			}
            			HX_END_LOCAL_FUNC3(return)

            			HX_BEGIN_LOCAL_FUNC_S1(hx::LocalFunc,_hx_Closure_3, ::Dynamic,f2) HXARGC(2)
            			 ::Dynamic _hx_run(Bool a1,Bool b1){
            				HX_BEGIN_LOCAL_FUNC_S3(hx::LocalFunc,_hx_Closure_2,Bool,b1, ::Dynamic,f2,Bool,a1) HXARGC(1)
            				 ::Dynamic _hx_run(Bool c1){
            					HX_STACK_FRAME("thx.TestValidation","testVal4",0x302a133e,"thx.TestValidation.testVal4","thx/TestValidation.hx",45,0x371e88c8)
            					HX_STACK_ARG(c1,"c1")
HXLINE(  45)					return f2(a1,b1,c1);
            				}
            				HX_END_LOCAL_FUNC1(return)

            				HX_STACK_FRAME("thx.TestValidation","testVal4",0x302a133e,"thx.TestValidation.testVal4","thx/TestValidation.hx",45,0x371e88c8)
            				HX_STACK_ARG(a1,"a1")
            				HX_STACK_ARG(b1,"b1")
HXLINE(  45)				return  ::Dynamic(new _hx_Closure_2(b1,f2,a1));
            			}
            			HX_END_LOCAL_FUNC2(return)

            			HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_4) HXARGC(2)
            			Int _hx_run(Int e1,Int e2){
            				HX_STACK_FRAME("thx.TestValidation","testVal4",0x302a133e,"thx.TestValidation.testVal4","thx/TestValidation.hx",45,0x371e88c8)
            				HX_STACK_ARG(e1,"e1")
            				HX_STACK_ARG(e2,"e2")
HXLINE(  45)				HX_STACK_DO_THROW(HX_("Unreachable",f4,60,4c,63));
HXDLIN(  45)				return (int)0;
            			}
            			HX_END_LOCAL_FUNC2(return)

            			HX_BEGIN_LOCAL_FUNC_S1(hx::LocalFunc,_hx_Closure_6, ::Dynamic,f4) HXARGC(3)
            			 ::Dynamic _hx_run(Bool a2,Bool b2,Bool c2){
            				HX_BEGIN_LOCAL_FUNC_S4(hx::LocalFunc,_hx_Closure_5,Bool,a2,Bool,b2,Bool,c2, ::Dynamic,f4) HXARGC(1)
            				Bool _hx_run(Bool d1){
            					HX_STACK_FRAME("thx.TestValidation","testVal4",0x302a133e,"thx.TestValidation.testVal4","thx/TestValidation.hx",46,0x371e88c8)
            					HX_STACK_ARG(d1,"d1")
HXLINE(  46)					return ( (Bool)(f4(a2,b2,c2,d1)) );
            				}
            				HX_END_LOCAL_FUNC1(return)

            				HX_STACK_FRAME("thx.TestValidation","testVal4",0x302a133e,"thx.TestValidation.testVal4","thx/TestValidation.hx",46,0x371e88c8)
            				HX_STACK_ARG(a2,"a2")
            				HX_STACK_ARG(b2,"b2")
            				HX_STACK_ARG(c2,"c2")
HXLINE(  46)				return  ::Dynamic(new _hx_Closure_5(a2,b2,c2,f4));
            			}
            			HX_END_LOCAL_FUNC3(return)

            			HX_BEGIN_LOCAL_FUNC_S1(hx::LocalFunc,_hx_Closure_8, ::Dynamic,f5) HXARGC(2)
            			 ::Dynamic _hx_run(Bool a3,Bool b3){
            				HX_BEGIN_LOCAL_FUNC_S3(hx::LocalFunc,_hx_Closure_7,Bool,b3, ::Dynamic,f5,Bool,a3) HXARGC(1)
            				 ::Dynamic _hx_run(Bool c3){
            					HX_STACK_FRAME("thx.TestValidation","testVal4",0x302a133e,"thx.TestValidation.testVal4","thx/TestValidation.hx",46,0x371e88c8)
            					HX_STACK_ARG(c3,"c3")
HXLINE(  46)					return f5(a3,b3,c3);
            				}
            				HX_END_LOCAL_FUNC1(return)

            				HX_STACK_FRAME("thx.TestValidation","testVal4",0x302a133e,"thx.TestValidation.testVal4","thx/TestValidation.hx",46,0x371e88c8)
            				HX_STACK_ARG(a3,"a3")
            				HX_STACK_ARG(b3,"b3")
HXLINE(  46)				return  ::Dynamic(new _hx_Closure_7(b3,f5,a3));
            			}
            			HX_END_LOCAL_FUNC2(return)

            			HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_9) HXARGC(2)
            			Int _hx_run(Int e11,Int e21){
            				HX_STACK_FRAME("thx.TestValidation","testVal4",0x302a133e,"thx.TestValidation.testVal4","thx/TestValidation.hx",46,0x371e88c8)
            				HX_STACK_ARG(e11,"e11")
            				HX_STACK_ARG(e21,"e21")
HXLINE(  46)				HX_STACK_DO_THROW(HX_("Unreachable",f4,60,4c,63));
HXDLIN(  46)				return (int)0;
            			}
            			HX_END_LOCAL_FUNC2(return)

HXLINE(  40)			++_g1;
HXLINE(  41)			HX_VARI( ::hx::EnumBase,t) = ::thx::Either_obj::Right(true);
HXLINE(  42)			HX_VARI( ::hx::EnumBase,f) = ::thx::Either_obj::Right(false);
HXLINE(  43)			HX_VARI( ::hx::EnumBase,err) = ::thx::Either_obj::Left((int)1);
HXLINE(  45)			HX_VARI(  ::Dynamic,s) = this->add_dyn();
HXDLIN(  45)			HX_VARI_NAME(  ::Dynamic,f1,"f") = this->or4_dyn();
HXDLIN(  45)			HX_VARI_NAME(  ::Dynamic,f2,"f") =  ::Dynamic(new _hx_Closure_1(f1));
HXDLIN(  45)			 ::Dynamic _hx_tmp =  ::Dynamic(new _hx_Closure_3(f2));
HXDLIN(  45)			HX_VARI_NAME(  ::Dynamic,f3,"f") = ::thx::Functions2_obj::curry(_hx_tmp);
HXDLIN(  45)			::hx::EnumBase _hx_tmp1 = ::thx::Either_obj::Right(f3);
HXDLIN(  45)			::hx::EnumBase _hx_tmp2 = ::thx::_Validation::Validation_Impl__obj::ap(t,_hx_tmp1, ::Dynamic(new _hx_Closure_4()));
HXDLIN(  45)			::hx::EnumBase _hx_tmp3 = ::thx::_Validation::Validation_Impl__obj::ap(f,_hx_tmp2,s);
HXDLIN(  45)			::hx::EnumBase _hx_tmp4 = ::thx::_Validation::Validation_Impl__obj::ap(f,_hx_tmp3,s);
HXDLIN(  45)			::hx::EnumBase _hx_tmp5 = ::thx::_Validation::Validation_Impl__obj::ap(f,_hx_tmp4,s);
HXDLIN(  45)			::utest::Assert_obj::same(t,_hx_tmp5,null(),null(),null(),hx::SourceInfo(HX_("TestValidation.hx",53,dc,16,5e),45,HX_("thx.TestValidation",f5,4f,55,d8),HX_("testVal4",a5,ab,7b,51)));
HXLINE(  46)			::hx::EnumBase _hx_tmp6 = ::thx::Either_obj::Left((int)2);
HXDLIN(  46)			HX_VARI_NAME(  ::Dynamic,s1,"s") = this->add_dyn();
HXDLIN(  46)			HX_VARI_NAME(  ::Dynamic,f4,"f") = this->or4_dyn();
HXDLIN(  46)			HX_VARI_NAME(  ::Dynamic,f5,"f") =  ::Dynamic(new _hx_Closure_6(f4));
HXDLIN(  46)			 ::Dynamic _hx_tmp7 =  ::Dynamic(new _hx_Closure_8(f5));
HXDLIN(  46)			HX_VARI_NAME(  ::Dynamic,f6,"f") = ::thx::Functions2_obj::curry(_hx_tmp7);
HXDLIN(  46)			::hx::EnumBase _hx_tmp8 = ::thx::Either_obj::Right(f6);
HXDLIN(  46)			::hx::EnumBase _hx_tmp9 = ::thx::_Validation::Validation_Impl__obj::ap(t,_hx_tmp8, ::Dynamic(new _hx_Closure_9()));
HXDLIN(  46)			::hx::EnumBase _hx_tmp10 = ::thx::_Validation::Validation_Impl__obj::ap(f,_hx_tmp9,s1);
HXDLIN(  46)			::hx::EnumBase _hx_tmp11 = ::thx::_Validation::Validation_Impl__obj::ap(err,_hx_tmp10,s1);
HXDLIN(  46)			::hx::EnumBase _hx_tmp12 = ::thx::_Validation::Validation_Impl__obj::ap(err,_hx_tmp11,s1);
HXDLIN(  46)			::utest::Assert_obj::same(_hx_tmp6,_hx_tmp12,null(),null(),null(),hx::SourceInfo(HX_("TestValidation.hx",53,dc,16,5e),46,HX_("thx.TestValidation",f5,4f,55,d8),HX_("testVal4",a5,ab,7b,51)));
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestValidation_obj,testVal4,(void))

void TestValidation_obj::testVal4Nel(){
            	HX_STACK_FRAME("thx.TestValidation","testVal4Nel",0x7e5a8fb7,"thx.TestValidation.testVal4Nel","thx/TestValidation.hx",50,0x371e88c8)
            	HX_STACK_THIS(this)
HXLINE(  50)		HX_VARI( Int,_g1) = (int)0;
HXDLIN(  50)		HX_VARI( Int,_g) = this->x;
HXDLIN(  50)		while((_g1 < _g)){
            			HX_BEGIN_LOCAL_FUNC_S1(hx::LocalFunc,_hx_Closure_1, ::Dynamic,f) HXARGC(3)
            			 ::Dynamic _hx_run(Bool a,Bool b,Bool c){
            				HX_BEGIN_LOCAL_FUNC_S4(hx::LocalFunc,_hx_Closure_0,Bool,a, ::Dynamic,f,Bool,b,Bool,c) HXARGC(1)
            				Bool _hx_run(Bool d){
            					HX_STACK_FRAME("thx.TestValidation","testVal4Nel",0x7e5a8fb7,"thx.TestValidation.testVal4Nel","thx/TestValidation.hx",54,0x371e88c8)
            					HX_STACK_ARG(d,"d")
HXLINE(  54)					return ( (Bool)(f(a,b,c,d)) );
            				}
            				HX_END_LOCAL_FUNC1(return)

            				HX_STACK_FRAME("thx.TestValidation","testVal4Nel",0x7e5a8fb7,"thx.TestValidation.testVal4Nel","thx/TestValidation.hx",54,0x371e88c8)
            				HX_STACK_ARG(a,"a")
            				HX_STACK_ARG(b,"b")
            				HX_STACK_ARG(c,"c")
HXLINE(  54)				return  ::Dynamic(new _hx_Closure_0(a,f,b,c));
            			}
            			HX_END_LOCAL_FUNC3(return)

            			HX_BEGIN_LOCAL_FUNC_S1(hx::LocalFunc,_hx_Closure_3, ::Dynamic,f1) HXARGC(2)
            			 ::Dynamic _hx_run(Bool a1,Bool b1){
            				HX_BEGIN_LOCAL_FUNC_S3(hx::LocalFunc,_hx_Closure_2,Bool,b1,Bool,a1, ::Dynamic,f1) HXARGC(1)
            				 ::Dynamic _hx_run(Bool c1){
            					HX_STACK_FRAME("thx.TestValidation","testVal4Nel",0x7e5a8fb7,"thx.TestValidation.testVal4Nel","thx/TestValidation.hx",54,0x371e88c8)
            					HX_STACK_ARG(c1,"c1")
HXLINE(  54)					return f1(a1,b1,c1);
            				}
            				HX_END_LOCAL_FUNC1(return)

            				HX_STACK_FRAME("thx.TestValidation","testVal4Nel",0x7e5a8fb7,"thx.TestValidation.testVal4Nel","thx/TestValidation.hx",54,0x371e88c8)
            				HX_STACK_ARG(a1,"a1")
            				HX_STACK_ARG(b1,"b1")
HXLINE(  54)				return  ::Dynamic(new _hx_Closure_2(b1,a1,f1));
            			}
            			HX_END_LOCAL_FUNC2(return)

            			HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_4) HXARGC(2)
            			::hx::EnumBase _hx_run(::hx::EnumBase e1,::hx::EnumBase e2){
            				HX_STACK_FRAME("thx.TestValidation","testVal4Nel",0x7e5a8fb7,"thx.TestValidation.testVal4Nel","thx/TestValidation.hx",54,0x371e88c8)
            				HX_STACK_ARG(e1,"e1")
            				HX_STACK_ARG(e2,"e2")
HXLINE(  54)				HX_STACK_DO_THROW(HX_("Unreachable",f4,60,4c,63));
HXDLIN(  54)				return null();
            			}
            			HX_END_LOCAL_FUNC2(return)

HXLINE(  50)			++_g1;
HXLINE(  51)			HX_VARI( ::hx::EnumBase,t) = ::thx::Either_obj::Right(true);
HXLINE(  52)			::hx::EnumBase _hx_tmp = ::thx::_Nel::Nel_Impl__obj::pure((int)1);
HXDLIN(  52)			HX_VARI( ::hx::EnumBase,err) = ::thx::Either_obj::Left(_hx_tmp);
HXLINE(  54)			::hx::EnumBase _hx_tmp1 = ::thx::_Nel::Nel_Impl__obj::pure((int)1);
HXDLIN(  54)			::hx::EnumBase _hx_tmp2 = ::thx::_Nel::Nel_Impl__obj::cons((int)1,_hx_tmp1);
HXDLIN(  54)			::hx::EnumBase _hx_tmp3 = ::thx::Either_obj::Left(_hx_tmp2);
HXDLIN(  54)			HX_VARI(  ::Dynamic,s) = ::thx::_Nel::Nel_Impl__obj::semigroup();
HXDLIN(  54)			HX_VARI(  ::Dynamic,f) = this->or4_dyn();
HXDLIN(  54)			HX_VARI_NAME(  ::Dynamic,f1,"f") =  ::Dynamic(new _hx_Closure_1(f));
HXDLIN(  54)			 ::Dynamic _hx_tmp4 =  ::Dynamic(new _hx_Closure_3(f1));
HXDLIN(  54)			HX_VARI_NAME(  ::Dynamic,f2,"f") = ::thx::Functions2_obj::curry(_hx_tmp4);
HXDLIN(  54)			::hx::EnumBase _hx_tmp5 = ::thx::Either_obj::Right(f2);
HXDLIN(  54)			::hx::EnumBase _hx_tmp6 = ::thx::_Validation::Validation_Impl__obj::ap(t,_hx_tmp5, ::Dynamic(new _hx_Closure_4()));
HXDLIN(  54)			::hx::EnumBase _hx_tmp7 = ::thx::_Validation::Validation_Impl__obj::ap(t,_hx_tmp6,s);
HXDLIN(  54)			::hx::EnumBase _hx_tmp8 = ::thx::_Validation::Validation_Impl__obj::ap(err,_hx_tmp7,s);
HXDLIN(  54)			::hx::EnumBase _hx_tmp9 = ::thx::_Validation::Validation_Impl__obj::ap(err,_hx_tmp8,s);
HXDLIN(  54)			::utest::Assert_obj::same(_hx_tmp3,_hx_tmp9,null(),null(),null(),hx::SourceInfo(HX_("TestValidation.hx",53,dc,16,5e),54,HX_("thx.TestValidation",f5,4f,55,d8),HX_("testVal4Nel",b0,f1,2c,02)));
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestValidation_obj,testVal4Nel,(void))


TestValidation_obj::TestValidation_obj()
{
}

hx::Val TestValidation_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 1:
		if (HX_FIELD_EQ(inName,"x") ) { return hx::Val( x); }
		break;
	case 3:
		if (HX_FIELD_EQ(inName,"or4") ) { return hx::Val( or4_dyn()); }
		if (HX_FIELD_EQ(inName,"add") ) { return hx::Val( add_dyn()); }
		break;
	case 6:
		if (HX_FIELD_EQ(inName,"testAp") ) { return hx::Val( testAp_dyn()); }
		break;
	case 8:
		if (HX_FIELD_EQ(inName,"testVal4") ) { return hx::Val( testVal4_dyn()); }
		break;
	case 11:
		if (HX_FIELD_EQ(inName,"testVal4Nel") ) { return hx::Val( testVal4Nel_dyn()); }
	}
	return super::__Field(inName,inCallProp);
}

hx::Val TestValidation_obj::__SetField(const ::String &inName,const hx::Val &inValue,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 1:
		if (HX_FIELD_EQ(inName,"x") ) { x=inValue.Cast< Int >(); return inValue; }
	}
	return super::__SetField(inName,inValue,inCallProp);
}

void TestValidation_obj::__GetFields(Array< ::String> &outFields)
{
	outFields->push(HX_HCSTRING("x","\x78","\x00","\x00","\x00"));
	super::__GetFields(outFields);
};

#if HXCPP_SCRIPTABLE
static hx::StorageInfo TestValidation_obj_sMemberStorageInfo[] = {
	{hx::fsInt,(int)offsetof(TestValidation_obj,x),HX_HCSTRING("x","\x78","\x00","\x00","\x00")},
	{ hx::fsUnknown, 0, null()}
};
static hx::StaticInfo *TestValidation_obj_sStaticStorageInfo = 0;
#endif

static ::String TestValidation_obj_sMemberFields[] = {
	HX_HCSTRING("x","\x78","\x00","\x00","\x00"),
	HX_HCSTRING("or4","\xb1","\x9d","\x54","\x00"),
	HX_HCSTRING("add","\x21","\xf2","\x49","\x00"),
	HX_HCSTRING("testAp","\xe1","\x39","\x3a","\xd5"),
	HX_HCSTRING("testVal4","\xa5","\xab","\x7b","\x51"),
	HX_HCSTRING("testVal4Nel","\xb0","\xf1","\x2c","\x02"),
	::String(null()) };

static void TestValidation_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(TestValidation_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void TestValidation_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(TestValidation_obj::__mClass,"__mClass");
};

#endif

hx::Class TestValidation_obj::__mClass;

void TestValidation_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.TestValidation","\xf5","\x4f","\x55","\xd8");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &hx::Class_obj::GetNoStaticField;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = TestValidation_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(0 /* sStaticFields */);
	__mClass->mMembers = hx::Class_obj::dupFunctions(TestValidation_obj_sMemberFields);
	__mClass->mCanCast = hx::TCanCast< TestValidation_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = TestValidation_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = TestValidation_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = TestValidation_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx