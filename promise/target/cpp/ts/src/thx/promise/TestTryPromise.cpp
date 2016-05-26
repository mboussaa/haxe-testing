// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_thx_Either
#include <thx/Either.h>
#endif
#ifndef INCLUDED_thx_Error
#include <thx/Error.h>
#endif
#ifndef INCLUDED_thx_Nil
#include <thx/Nil.h>
#endif
#ifndef INCLUDED_thx_promise_Future
#include <thx/promise/Future.h>
#endif
#ifndef INCLUDED_thx_promise_TestTryPromise
#include <thx/promise/TestTryPromise.h>
#endif
#ifndef INCLUDED_thx_promise__Promise_Promise_Impl_
#include <thx/promise/_Promise/Promise_Impl_.h>
#endif
#ifndef INCLUDED_utest_Assert
#include <utest/Assert.h>
#endif

namespace thx{
namespace promise{

void TestTryPromise_obj::__construct(){
            	HX_STACK_FRAME("thx.promise.TestTryPromise","new",0xeb061941,"thx.promise.TestTryPromise.new","thx/promise/TestTryPromise.hx",9,0x2466de0d)
            	HX_STACK_THIS(this)
            	}

Dynamic TestTryPromise_obj::__CreateEmpty() { return new TestTryPromise_obj; }

hx::ObjectPtr< TestTryPromise_obj > TestTryPromise_obj::__new()
{
	hx::ObjectPtr< TestTryPromise_obj > _hx_result = new TestTryPromise_obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic TestTryPromise_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< TestTryPromise_obj > _hx_result = new TestTryPromise_obj();
	_hx_result->__construct();
	return _hx_result;
}

void TestTryPromise_obj::testTryCreate(){
            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_0) HXARGC(2)
            		void _hx_run( ::Dynamic resolve, ::Dynamic reject){
            			HX_STACK_FRAME("thx.promise.TestTryPromise","testTryCreate",0x68366c06,"thx.promise.TestTryPromise.testTryCreate","thx/promise/TestTryPromise.hx",12,0x2466de0d)
            			HX_STACK_ARG(resolve,"resolve")
            			HX_STACK_ARG(reject,"reject")
HXLINE(  12)			HX_STACK_DO_THROW(HX_("oh boy",85,f3,ba,58));
            		}
            		HX_END_LOCAL_FUNC2((void))

            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_1) HXARGC(1)
            		void _hx_run( ::Dynamic _){
            			HX_STACK_FRAME("thx.promise.TestTryPromise","testTryCreate",0x68366c06,"thx.promise.TestTryPromise.testTryCreate","thx/promise/TestTryPromise.hx",13,0x2466de0d)
            			HX_STACK_ARG(_,"_")
HXLINE(  13)			::utest::Assert_obj::fail(HX_("exception triggered resolve",52,dd,24,13),hx::SourceInfo(HX_("TestTryPromise.hx",4c,09,d9,c2),13,HX_("thx.promise.TestTryPromise",cf,64,56,27),HX_("testTryCreate",e5,df,5d,99)));
            		}
            		HX_END_LOCAL_FUNC1((void))

            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_2) HXARGC(1)
            		void _hx_run( ::thx::Error _1){
            			HX_STACK_FRAME("thx.promise.TestTryPromise","testTryCreate",0x68366c06,"thx.promise.TestTryPromise.testTryCreate","thx/promise/TestTryPromise.hx",14,0x2466de0d)
            			HX_STACK_ARG(_1,"_1")
HXLINE(  14)			::utest::Assert_obj::pass(null(),hx::SourceInfo(HX_("TestTryPromise.hx",4c,09,d9,c2),14,HX_("thx.promise.TestTryPromise",cf,64,56,27),HX_("testTryCreate",e5,df,5d,99)));
            		}
            		HX_END_LOCAL_FUNC1((void))

            	HX_STACK_FRAME("thx.promise.TestTryPromise","testTryCreate",0x68366c06,"thx.promise.TestTryPromise.testTryCreate","thx/promise/TestTryPromise.hx",12,0x2466de0d)
            	HX_STACK_THIS(this)
HXLINE(  12)		 ::thx::promise::Future _hx_tmp = ::thx::promise::_Promise::Promise_Impl__obj::create( ::Dynamic(new _hx_Closure_0()));
HXDLIN(  12)		 ::thx::promise::Future _hx_tmp1 = ::thx::promise::_Promise::Promise_Impl__obj::success(_hx_tmp, ::Dynamic(new _hx_Closure_1()));
HXDLIN(  12)		 ::thx::promise::Future _hx_tmp2 = ::thx::promise::_Promise::Promise_Impl__obj::failure(_hx_tmp1, ::Dynamic(new _hx_Closure_2()));
HXDLIN(  12)		::thx::promise::_Promise::Promise_Impl__obj::always(_hx_tmp2,::utest::Assert_obj::createAsync(null(),null()));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestTryPromise_obj,testTryCreate,(void))

void TestTryPromise_obj::testTryEitherSuccess(){
            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_0) HXARGC(1)
            		void _hx_run(::hx::EnumBase _){
            			HX_STACK_FRAME("thx.promise.TestTryPromise","testTryEitherSuccess",0x65bf6334,"thx.promise.TestTryPromise.testTryEitherSuccess","thx/promise/TestTryPromise.hx",22,0x2466de0d)
            			HX_STACK_ARG(_,"_")
HXLINE(  22)			HX_STACK_DO_THROW(HX_("nops",84,14,0a,49));
            		}
            		HX_END_LOCAL_FUNC1((void))

            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_1) HXARGC(1)
            		void _hx_run( ::thx::Error _1){
            			HX_STACK_FRAME("thx.promise.TestTryPromise","testTryEitherSuccess",0x65bf6334,"thx.promise.TestTryPromise.testTryEitherSuccess","thx/promise/TestTryPromise.hx",23,0x2466de0d)
            			HX_STACK_ARG(_1,"_1")
HXLINE(  23)			::utest::Assert_obj::fail(HX_("no reason to get here",22,69,78,db),hx::SourceInfo(HX_("TestTryPromise.hx",4c,09,d9,c2),23,HX_("thx.promise.TestTryPromise",cf,64,56,27),HX_("testTryEitherSuccess",35,b9,ad,33)));
            		}
            		HX_END_LOCAL_FUNC1((void))

            		HX_BEGIN_LOCAL_FUNC_S1(hx::LocalFunc,_hx_Closure_2, ::Dynamic,done) HXARGC(1)
            		void _hx_run(::hx::EnumBase r){
            			HX_STACK_FRAME("thx.promise.TestTryPromise","testTryEitherSuccess",0x65bf6334,"thx.promise.TestTryPromise.testTryEitherSuccess","thx/promise/TestTryPromise.hx",25,0x2466de0d)
            			HX_STACK_ARG(r,"r")
HXLINE(  26)			Int _hx_tmp = ( ( ::hx::EnumBase)(r) )->_hx_getIndex();
HXDLIN(  26)			switch((int)(_hx_tmp)){
            				case (int)0: {
HXLINE(  27)					::utest::Assert_obj::pass(null(),hx::SourceInfo(HX_("TestTryPromise.hx",4c,09,d9,c2),27,HX_("thx.promise.TestTryPromise",cf,64,56,27),HX_("testTryEitherSuccess",35,b9,ad,33)));
            				}
            				break;
            				case (int)1: {
HXLINE(  28)					::utest::Assert_obj::fail(HX_("not good",6a,87,1d,ae),hx::SourceInfo(HX_("TestTryPromise.hx",4c,09,d9,c2),28,HX_("thx.promise.TestTryPromise",cf,64,56,27),HX_("testTryEitherSuccess",35,b9,ad,33)));
            				}
            				break;
            			}
HXLINE(  30)			done();
            		}
            		HX_END_LOCAL_FUNC1((void))

            	HX_STACK_FRAME("thx.promise.TestTryPromise","testTryEitherSuccess",0x65bf6334,"thx.promise.TestTryPromise.testTryEitherSuccess","thx/promise/TestTryPromise.hx",18,0x2466de0d)
            	HX_STACK_THIS(this)
HXLINE(  19)		HX_VARI(  ::Dynamic,done) = ::utest::Assert_obj::createAsync(null(),null());
HXLINE(  20)		::thx::promise::_Promise::Promise_Impl__obj::either(::thx::promise::_Promise::Promise_Impl__obj::nil, ::Dynamic(new _hx_Closure_0()), ::Dynamic(new _hx_Closure_1()))->then( ::Dynamic(new _hx_Closure_2(done)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestTryPromise_obj,testTryEitherSuccess,(void))

void TestTryPromise_obj::testTryEitherFailure(){
            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_0) HXARGC(1)
            		void _hx_run( ::Dynamic _){
            			HX_STACK_FRAME("thx.promise.TestTryPromise","testTryEitherFailure",0xc46badbb,"thx.promise.TestTryPromise.testTryEitherFailure","thx/promise/TestTryPromise.hx",38,0x2466de0d)
            			HX_STACK_ARG(_,"_")
HXLINE(  38)			::utest::Assert_obj::fail(HX_("no reason to get here",22,69,78,db),hx::SourceInfo(HX_("TestTryPromise.hx",4c,09,d9,c2),38,HX_("thx.promise.TestTryPromise",cf,64,56,27),HX_("testTryEitherFailure",bc,03,5a,92)));
            		}
            		HX_END_LOCAL_FUNC1((void))

            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_1) HXARGC(1)
            		void _hx_run( ::thx::Error _1){
            			HX_STACK_FRAME("thx.promise.TestTryPromise","testTryEitherFailure",0xc46badbb,"thx.promise.TestTryPromise.testTryEitherFailure","thx/promise/TestTryPromise.hx",39,0x2466de0d)
            			HX_STACK_ARG(_1,"_1")
HXLINE(  39)			HX_STACK_DO_THROW(HX_("nops",84,14,0a,49));
            		}
            		HX_END_LOCAL_FUNC1((void))

            		HX_BEGIN_LOCAL_FUNC_S1(hx::LocalFunc,_hx_Closure_2, ::Dynamic,done) HXARGC(1)
            		void _hx_run(::hx::EnumBase r){
            			HX_STACK_FRAME("thx.promise.TestTryPromise","testTryEitherFailure",0xc46badbb,"thx.promise.TestTryPromise.testTryEitherFailure","thx/promise/TestTryPromise.hx",41,0x2466de0d)
            			HX_STACK_ARG(r,"r")
HXLINE(  42)			Int _hx_tmp1 = ( ( ::hx::EnumBase)(r) )->_hx_getIndex();
HXDLIN(  42)			switch((int)(_hx_tmp1)){
            				case (int)0: {
HXLINE(  43)					::utest::Assert_obj::pass(null(),hx::SourceInfo(HX_("TestTryPromise.hx",4c,09,d9,c2),43,HX_("thx.promise.TestTryPromise",cf,64,56,27),HX_("testTryEitherFailure",bc,03,5a,92)));
            				}
            				break;
            				case (int)1: {
HXLINE(  44)					::utest::Assert_obj::fail(HX_("not good",6a,87,1d,ae),hx::SourceInfo(HX_("TestTryPromise.hx",4c,09,d9,c2),44,HX_("thx.promise.TestTryPromise",cf,64,56,27),HX_("testTryEitherFailure",bc,03,5a,92)));
            				}
            				break;
            			}
HXLINE(  46)			done();
            		}
            		HX_END_LOCAL_FUNC1((void))

            	HX_STACK_FRAME("thx.promise.TestTryPromise","testTryEitherFailure",0xc46badbb,"thx.promise.TestTryPromise.testTryEitherFailure","thx/promise/TestTryPromise.hx",34,0x2466de0d)
            	HX_STACK_THIS(this)
HXLINE(  35)		HX_VARI(  ::Dynamic,done) = ::utest::Assert_obj::createAsync(null(),null());
HXLINE(  36)		 ::thx::promise::Future _hx_tmp = ::thx::promise::_Promise::Promise_Impl__obj::fail(HX_("no go",a7,20,8b,9f),hx::SourceInfo(HX_("TestTryPromise.hx",4c,09,d9,c2),36,HX_("thx.promise.TestTryPromise",cf,64,56,27),HX_("testTryEitherFailure",bc,03,5a,92)));
HXDLIN(  36)		::thx::promise::_Promise::Promise_Impl__obj::either(_hx_tmp, ::Dynamic(new _hx_Closure_0()), ::Dynamic(new _hx_Closure_1()))->then( ::Dynamic(new _hx_Closure_2(done)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestTryPromise_obj,testTryEitherFailure,(void))

void TestTryPromise_obj::testTrySuccess(){
            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_0) HXARGC(1)
            		void _hx_run(::hx::EnumBase _){
            			HX_STACK_FRAME("thx.promise.TestTryPromise","testTrySuccess",0x6e4b8979,"thx.promise.TestTryPromise.testTrySuccess","thx/promise/TestTryPromise.hx",52,0x2466de0d)
            			HX_STACK_ARG(_,"_")
HXLINE(  52)			HX_STACK_DO_THROW(HX_("nops",84,14,0a,49));
            		}
            		HX_END_LOCAL_FUNC1((void))

            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_1) HXARGC(1)
            		void _hx_run(::hx::EnumBase _1){
            			HX_STACK_FRAME("thx.promise.TestTryPromise","testTrySuccess",0x6e4b8979,"thx.promise.TestTryPromise.testTrySuccess","thx/promise/TestTryPromise.hx",53,0x2466de0d)
            			HX_STACK_ARG(_1,"_1")
HXLINE(  53)			::utest::Assert_obj::fail(HX_("not piped to a failing promise",72,59,1a,c3),hx::SourceInfo(HX_("TestTryPromise.hx",4c,09,d9,c2),53,HX_("thx.promise.TestTryPromise",cf,64,56,27),HX_("testTrySuccess",ba,78,a9,3f)));
            		}
            		HX_END_LOCAL_FUNC1((void))

            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_2) HXARGC(1)
            		void _hx_run( ::thx::Error _2){
            			HX_STACK_FRAME("thx.promise.TestTryPromise","testTrySuccess",0x6e4b8979,"thx.promise.TestTryPromise.testTrySuccess","thx/promise/TestTryPromise.hx",54,0x2466de0d)
            			HX_STACK_ARG(_2,"_2")
HXLINE(  54)			::utest::Assert_obj::pass(null(),hx::SourceInfo(HX_("TestTryPromise.hx",4c,09,d9,c2),54,HX_("thx.promise.TestTryPromise",cf,64,56,27),HX_("testTrySuccess",ba,78,a9,3f)));
            		}
            		HX_END_LOCAL_FUNC1((void))

            	HX_STACK_FRAME("thx.promise.TestTryPromise","testTrySuccess",0x6e4b8979,"thx.promise.TestTryPromise.testTrySuccess","thx/promise/TestTryPromise.hx",51,0x2466de0d)
            	HX_STACK_THIS(this)
HXLINE(  51)		 ::thx::promise::Future _hx_tmp = ::thx::promise::_Promise::Promise_Impl__obj::success(::thx::promise::_Promise::Promise_Impl__obj::nil, ::Dynamic(new _hx_Closure_0()));
HXDLIN(  51)		 ::thx::promise::Future _hx_tmp1 = ::thx::promise::_Promise::Promise_Impl__obj::success(_hx_tmp, ::Dynamic(new _hx_Closure_1()));
HXDLIN(  51)		 ::thx::promise::Future _hx_tmp2 = ::thx::promise::_Promise::Promise_Impl__obj::failure(_hx_tmp1, ::Dynamic(new _hx_Closure_2()));
HXDLIN(  51)		::thx::promise::_Promise::Promise_Impl__obj::always(_hx_tmp2,::utest::Assert_obj::createAsync(null(),null()));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestTryPromise_obj,testTrySuccess,(void))

void TestTryPromise_obj::testTryReject(){
            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_0) HXARGC(1)
            		void _hx_run( ::thx::Error _){
            			HX_STACK_FRAME("thx.promise.TestTryPromise","testTryReject",0xeeac5669,"thx.promise.TestTryPromise.testTryReject","thx/promise/TestTryPromise.hx",60,0x2466de0d)
            			HX_STACK_ARG(_,"_")
HXLINE(  60)			HX_STACK_DO_THROW(HX_("niet",6a,7d,05,49));
            		}
            		HX_END_LOCAL_FUNC1((void))

            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_1) HXARGC(1)
            		void _hx_run( ::Dynamic _1){
            			HX_STACK_FRAME("thx.promise.TestTryPromise","testTryReject",0xeeac5669,"thx.promise.TestTryPromise.testTryReject","thx/promise/TestTryPromise.hx",61,0x2466de0d)
            			HX_STACK_ARG(_1,"_1")
HXLINE(  61)			::utest::Assert_obj::fail(HX_("not piped to a failing promise",72,59,1a,c3),hx::SourceInfo(HX_("TestTryPromise.hx",4c,09,d9,c2),61,HX_("thx.promise.TestTryPromise",cf,64,56,27),HX_("testTryReject",48,ca,d3,1f)));
            		}
            		HX_END_LOCAL_FUNC1((void))

            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_2) HXARGC(1)
            		void _hx_run( ::thx::Error e){
            			HX_STACK_FRAME("thx.promise.TestTryPromise","testTryReject",0xeeac5669,"thx.promise.TestTryPromise.testTryReject","thx/promise/TestTryPromise.hx",62,0x2466de0d)
            			HX_STACK_ARG(e,"e")
HXLINE(  62)			::utest::Assert_obj::stringContains(HX_("niet",6a,7d,05,49),e->message,null(),hx::SourceInfo(HX_("TestTryPromise.hx",4c,09,d9,c2),62,HX_("thx.promise.TestTryPromise",cf,64,56,27),HX_("testTryReject",48,ca,d3,1f)));
            		}
            		HX_END_LOCAL_FUNC1((void))

            	HX_STACK_FRAME("thx.promise.TestTryPromise","testTryReject",0xeeac5669,"thx.promise.TestTryPromise.testTryReject","thx/promise/TestTryPromise.hx",59,0x2466de0d)
            	HX_STACK_THIS(this)
HXLINE(  59)		 ::thx::promise::Future _hx_tmp = ::thx::promise::_Promise::Promise_Impl__obj::fail(HX_("nops",84,14,0a,49),hx::SourceInfo(HX_("TestTryPromise.hx",4c,09,d9,c2),59,HX_("thx.promise.TestTryPromise",cf,64,56,27),HX_("testTryReject",48,ca,d3,1f)));
HXDLIN(  59)		 ::thx::promise::Future _hx_tmp1 = ::thx::promise::_Promise::Promise_Impl__obj::failure(_hx_tmp, ::Dynamic(new _hx_Closure_0()));
HXDLIN(  59)		 ::thx::promise::Future _hx_tmp2 = ::thx::promise::_Promise::Promise_Impl__obj::success(_hx_tmp1, ::Dynamic(new _hx_Closure_1()));
HXDLIN(  59)		 ::thx::promise::Future _hx_tmp3 = ::thx::promise::_Promise::Promise_Impl__obj::failure(_hx_tmp2, ::Dynamic(new _hx_Closure_2()));
HXDLIN(  59)		::thx::promise::_Promise::Promise_Impl__obj::always(_hx_tmp3,::utest::Assert_obj::createAsync(null(),null()));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestTryPromise_obj,testTryReject,(void))

void TestTryPromise_obj::testTryAlways(){
            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_0) HXARGC(0)
            		void _hx_run(){
            			HX_STACK_FRAME("thx.promise.TestTryPromise","testTryAlways",0x32fe13d9,"thx.promise.TestTryPromise.testTryAlways","thx/promise/TestTryPromise.hx",68,0x2466de0d)
HXLINE(  68)			HX_STACK_DO_THROW(HX_("bad",c5,b1,4a,00));
            		}
            		HX_END_LOCAL_FUNC0((void))

            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_1) HXARGC(1)
            		void _hx_run( ::thx::Error e){
            			HX_STACK_FRAME("thx.promise.TestTryPromise","testTryAlways",0x32fe13d9,"thx.promise.TestTryPromise.testTryAlways","thx/promise/TestTryPromise.hx",69,0x2466de0d)
            			HX_STACK_ARG(e,"e")
HXLINE(  69)			::utest::Assert_obj::stringContains(HX_("bad",c5,b1,4a,00),e->message,null(),hx::SourceInfo(HX_("TestTryPromise.hx",4c,09,d9,c2),69,HX_("thx.promise.TestTryPromise",cf,64,56,27),HX_("testTryAlways",b8,87,25,64)));
            		}
            		HX_END_LOCAL_FUNC1((void))

            	HX_STACK_FRAME("thx.promise.TestTryPromise","testTryAlways",0x32fe13d9,"thx.promise.TestTryPromise.testTryAlways","thx/promise/TestTryPromise.hx",67,0x2466de0d)
            	HX_STACK_THIS(this)
HXLINE(  67)		 ::thx::promise::Future _hx_tmp = ::thx::promise::_Promise::Promise_Impl__obj::always(::thx::promise::_Promise::Promise_Impl__obj::nil, ::Dynamic(new _hx_Closure_0()));
HXDLIN(  67)		 ::thx::promise::Future _hx_tmp1 = ::thx::promise::_Promise::Promise_Impl__obj::failure(_hx_tmp, ::Dynamic(new _hx_Closure_1()));
HXDLIN(  67)		::thx::promise::_Promise::Promise_Impl__obj::always(_hx_tmp1,::utest::Assert_obj::createAsync(null(),null()));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestTryPromise_obj,testTryAlways,(void))

void TestTryPromise_obj::testTryThrowFailure(){
            		HX_BEGIN_LOCAL_FUNC_S1(hx::LocalFunc,_hx_Closure_0, ::thx::promise::Future,_e) HXARGC(0)
            		 ::thx::promise::Future _hx_run(){
            			HX_STACK_FRAME("thx.promise.TestTryPromise","testTryThrowFailure",0x463d344e,"thx.promise.TestTryPromise.testTryThrowFailure","thx/promise/TestTryPromise.hx",74,0x2466de0d)
HXLINE(  74)			return ::thx::promise::_Promise::Promise_Impl__obj::throwFailure(_e);
            		}
            		HX_END_LOCAL_FUNC0(return)

            	HX_STACK_FRAME("thx.promise.TestTryPromise","testTryThrowFailure",0x463d344e,"thx.promise.TestTryPromise.testTryThrowFailure","thx/promise/TestTryPromise.hx",74,0x2466de0d)
            	HX_STACK_THIS(this)
HXLINE(  74)		HX_VARI(  ::thx::promise::Future,_e) = ::thx::promise::_Promise::Promise_Impl__obj::fail(HX_("meh",10,0e,53,00),hx::SourceInfo(HX_("TestTryPromise.hx",4c,09,d9,c2),74,HX_("thx.promise.TestTryPromise",cf,64,56,27),HX_("testTryThrowFailure",6d,59,2f,ac)));
HXDLIN(  74)		 ::Dynamic _hx_tmp =  ::Dynamic(new _hx_Closure_0(_e));
HXDLIN(  74)		::utest::Assert_obj::raises(_hx_tmp,hx::ClassOf< ::thx::Error >(),null(),null(),hx::SourceInfo(HX_("TestTryPromise.hx",4c,09,d9,c2),74,HX_("thx.promise.TestTryPromise",cf,64,56,27),HX_("testTryThrowFailure",6d,59,2f,ac)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestTryPromise_obj,testTryThrowFailure,(void))

void TestTryPromise_obj::testTryMap(){
            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_0) HXARGC(1)
            		 ::Dynamic _hx_run(::hx::EnumBase _){
            			HX_STACK_FRAME("thx.promise.TestTryPromise","testTryMap",0x933adb52,"thx.promise.TestTryPromise.testTryMap","thx/promise/TestTryPromise.hx",79,0x2466de0d)
            			HX_STACK_ARG(_,"_")
HXLINE(  79)			HX_STACK_DO_THROW(HX_("meh",10,0e,53,00));
HXDLIN(  79)			return null();
            		}
            		HX_END_LOCAL_FUNC1(return)

            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_1) HXARGC(1)
            		void _hx_run( ::thx::Error e){
            			HX_STACK_FRAME("thx.promise.TestTryPromise","testTryMap",0x933adb52,"thx.promise.TestTryPromise.testTryMap","thx/promise/TestTryPromise.hx",80,0x2466de0d)
            			HX_STACK_ARG(e,"e")
HXLINE(  80)			::utest::Assert_obj::stringContains(HX_("meh",10,0e,53,00),e->message,null(),hx::SourceInfo(HX_("TestTryPromise.hx",4c,09,d9,c2),80,HX_("thx.promise.TestTryPromise",cf,64,56,27),HX_("testTryMap",13,d6,3d,6e)));
            		}
            		HX_END_LOCAL_FUNC1((void))

            	HX_STACK_FRAME("thx.promise.TestTryPromise","testTryMap",0x933adb52,"thx.promise.TestTryPromise.testTryMap","thx/promise/TestTryPromise.hx",78,0x2466de0d)
            	HX_STACK_THIS(this)
HXLINE(  78)		 ::thx::promise::Future _hx_tmp = ::thx::promise::_Promise::Promise_Impl__obj::map(::thx::promise::_Promise::Promise_Impl__obj::nil, ::Dynamic(new _hx_Closure_0()));
HXDLIN(  78)		 ::thx::promise::Future _hx_tmp1 = ::thx::promise::_Promise::Promise_Impl__obj::failure(_hx_tmp, ::Dynamic(new _hx_Closure_1()));
HXDLIN(  78)		::thx::promise::_Promise::Promise_Impl__obj::always(_hx_tmp1,::utest::Assert_obj::createAsync(null(),null()));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestTryPromise_obj,testTryMap,(void))

void TestTryPromise_obj::testTryFlatMap(){
            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_0) HXARGC(1)
            		 ::thx::promise::Future _hx_run(::hx::EnumBase _){
            			HX_STACK_FRAME("thx.promise.TestTryPromise","testTryFlatMap",0x9cdb7419,"thx.promise.TestTryPromise.testTryFlatMap","thx/promise/TestTryPromise.hx",86,0x2466de0d)
            			HX_STACK_ARG(_,"_")
HXLINE(  86)			HX_STACK_DO_THROW(HX_("meh",10,0e,53,00));
HXDLIN(  86)			return null();
            		}
            		HX_END_LOCAL_FUNC1(return)

            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_1) HXARGC(1)
            		 ::thx::promise::Future _hx_run( ::thx::Error err){
            			HX_STACK_FRAME("thx.promise.TestTryPromise","testTryFlatMap",0x9cdb7419,"thx.promise.TestTryPromise.testTryFlatMap","thx/promise/TestTryPromise.hx",85,0x2466de0d)
            			HX_STACK_ARG(err,"err")
HXLINE(  85)			return ::thx::promise::_Promise::Promise_Impl__obj::error(err);
            		}
            		HX_END_LOCAL_FUNC1(return)

            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_2) HXARGC(1)
            		void _hx_run( ::thx::Error e){
            			HX_STACK_FRAME("thx.promise.TestTryPromise","testTryFlatMap",0x9cdb7419,"thx.promise.TestTryPromise.testTryFlatMap","thx/promise/TestTryPromise.hx",87,0x2466de0d)
            			HX_STACK_ARG(e,"e")
HXLINE(  87)			::utest::Assert_obj::stringContains(HX_("meh",10,0e,53,00),e->message,null(),hx::SourceInfo(HX_("TestTryPromise.hx",4c,09,d9,c2),87,HX_("thx.promise.TestTryPromise",cf,64,56,27),HX_("testTryFlatMap",5a,63,39,6e)));
            		}
            		HX_END_LOCAL_FUNC1((void))

            	HX_STACK_FRAME("thx.promise.TestTryPromise","testTryFlatMap",0x9cdb7419,"thx.promise.TestTryPromise.testTryFlatMap","thx/promise/TestTryPromise.hx",85,0x2466de0d)
            	HX_STACK_THIS(this)
HXLINE(  85)		 ::thx::promise::Future _hx_tmp = ::thx::promise::_Promise::Promise_Impl__obj::flatMapEither(::thx::promise::_Promise::Promise_Impl__obj::nil, ::Dynamic(new _hx_Closure_0()), ::Dynamic(new _hx_Closure_1()));
HXDLIN(  85)		 ::thx::promise::Future _hx_tmp1 = ::thx::promise::_Promise::Promise_Impl__obj::failure(_hx_tmp, ::Dynamic(new _hx_Closure_2()));
HXDLIN(  85)		::thx::promise::_Promise::Promise_Impl__obj::always(_hx_tmp1,::utest::Assert_obj::createAsync(null(),null()));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestTryPromise_obj,testTryFlatMap,(void))

void TestTryPromise_obj::testTryFlatMapEitherSuccess(){
            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_0) HXARGC(1)
            		 ::thx::promise::Future _hx_run(::hx::EnumBase _){
            			HX_STACK_FRAME("thx.promise.TestTryPromise","testTryFlatMapEitherSuccess",0x41bcd325,"thx.promise.TestTryPromise.testTryFlatMapEitherSuccess","thx/promise/TestTryPromise.hx",94,0x2466de0d)
            			HX_STACK_ARG(_,"_")
HXLINE(  94)			HX_STACK_DO_THROW(HX_("meh",10,0e,53,00));
HXDLIN(  94)			return null();
            		}
            		HX_END_LOCAL_FUNC1(return)

            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_1) HXARGC(1)
            		 ::thx::promise::Future _hx_run( ::thx::Error e){
            			HX_STACK_FRAME("thx.promise.TestTryPromise","testTryFlatMapEitherSuccess",0x41bcd325,"thx.promise.TestTryPromise.testTryFlatMapEitherSuccess","thx/promise/TestTryPromise.hx",95,0x2466de0d)
            			HX_STACK_ARG(e,"e")
HXLINE(  95)			HX_STACK_DO_THROW(HX_("mah",94,0a,53,00));
HXDLIN(  95)			return null();
            		}
            		HX_END_LOCAL_FUNC1(return)

            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_2) HXARGC(1)
            		void _hx_run( ::thx::Error e1){
            			HX_STACK_FRAME("thx.promise.TestTryPromise","testTryFlatMapEitherSuccess",0x41bcd325,"thx.promise.TestTryPromise.testTryFlatMapEitherSuccess","thx/promise/TestTryPromise.hx",97,0x2466de0d)
            			HX_STACK_ARG(e1,"e1")
HXLINE(  97)			::utest::Assert_obj::stringContains(HX_("meh",10,0e,53,00),e1->message,null(),hx::SourceInfo(HX_("TestTryPromise.hx",4c,09,d9,c2),97,HX_("thx.promise.TestTryPromise",cf,64,56,27),HX_("testTryFlatMapEitherSuccess",44,af,17,59)));
            		}
            		HX_END_LOCAL_FUNC1((void))

            	HX_STACK_FRAME("thx.promise.TestTryPromise","testTryFlatMapEitherSuccess",0x41bcd325,"thx.promise.TestTryPromise.testTryFlatMapEitherSuccess","thx/promise/TestTryPromise.hx",92,0x2466de0d)
            	HX_STACK_THIS(this)
HXLINE(  92)		 ::thx::promise::Future _hx_tmp = ::thx::promise::_Promise::Promise_Impl__obj::flatMapEither(::thx::promise::_Promise::Promise_Impl__obj::nil, ::Dynamic(new _hx_Closure_0()), ::Dynamic(new _hx_Closure_1()));
HXDLIN(  92)		 ::thx::promise::Future _hx_tmp1 = ::thx::promise::_Promise::Promise_Impl__obj::failure(_hx_tmp, ::Dynamic(new _hx_Closure_2()));
HXDLIN(  92)		::thx::promise::_Promise::Promise_Impl__obj::always(_hx_tmp1,::utest::Assert_obj::createAsync(null(),null()));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestTryPromise_obj,testTryFlatMapEitherSuccess,(void))

void TestTryPromise_obj::testTryFlatMapEitherFailure(){
            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_0) HXARGC(1)
            		 ::thx::promise::Future _hx_run( ::Dynamic _){
            			HX_STACK_FRAME("thx.promise.TestTryPromise","testTryFlatMapEitherFailure",0xa0691dac,"thx.promise.TestTryPromise.testTryFlatMapEitherFailure","thx/promise/TestTryPromise.hx",104,0x2466de0d)
            			HX_STACK_ARG(_,"_")
HXLINE( 104)			HX_STACK_DO_THROW(HX_("meh",10,0e,53,00));
HXDLIN( 104)			return null();
            		}
            		HX_END_LOCAL_FUNC1(return)

            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_1) HXARGC(1)
            		 ::thx::promise::Future _hx_run( ::thx::Error e){
            			HX_STACK_FRAME("thx.promise.TestTryPromise","testTryFlatMapEitherFailure",0xa0691dac,"thx.promise.TestTryPromise.testTryFlatMapEitherFailure","thx/promise/TestTryPromise.hx",105,0x2466de0d)
            			HX_STACK_ARG(e,"e")
HXLINE( 105)			HX_STACK_DO_THROW(HX_("mah",94,0a,53,00));
HXDLIN( 105)			return null();
            		}
            		HX_END_LOCAL_FUNC1(return)

            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_2) HXARGC(1)
            		void _hx_run( ::thx::Error e1){
            			HX_STACK_FRAME("thx.promise.TestTryPromise","testTryFlatMapEitherFailure",0xa0691dac,"thx.promise.TestTryPromise.testTryFlatMapEitherFailure","thx/promise/TestTryPromise.hx",107,0x2466de0d)
            			HX_STACK_ARG(e1,"e1")
HXLINE( 107)			::utest::Assert_obj::stringContains(HX_("mah",94,0a,53,00),e1->message,null(),hx::SourceInfo(HX_("TestTryPromise.hx",4c,09,d9,c2),107,HX_("thx.promise.TestTryPromise",cf,64,56,27),HX_("testTryFlatMapEitherFailure",cb,f9,c3,b7)));
            		}
            		HX_END_LOCAL_FUNC1((void))

            	HX_STACK_FRAME("thx.promise.TestTryPromise","testTryFlatMapEitherFailure",0xa0691dac,"thx.promise.TestTryPromise.testTryFlatMapEitherFailure","thx/promise/TestTryPromise.hx",102,0x2466de0d)
            	HX_STACK_THIS(this)
HXLINE( 102)		 ::thx::promise::Future _hx_tmp = ::thx::promise::_Promise::Promise_Impl__obj::fail(HX_("bah",c9,b1,4a,00),hx::SourceInfo(HX_("TestTryPromise.hx",4c,09,d9,c2),102,HX_("thx.promise.TestTryPromise",cf,64,56,27),HX_("testTryFlatMapEitherFailure",cb,f9,c3,b7)));
HXDLIN( 102)		 ::thx::promise::Future _hx_tmp1 = ::thx::promise::_Promise::Promise_Impl__obj::flatMapEither(_hx_tmp, ::Dynamic(new _hx_Closure_0()), ::Dynamic(new _hx_Closure_1()));
HXDLIN( 102)		 ::thx::promise::Future _hx_tmp2 = ::thx::promise::_Promise::Promise_Impl__obj::failure(_hx_tmp1, ::Dynamic(new _hx_Closure_2()));
HXDLIN( 102)		::thx::promise::_Promise::Promise_Impl__obj::always(_hx_tmp2,::utest::Assert_obj::createAsync(null(),null()));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestTryPromise_obj,testTryFlatMapEitherFailure,(void))

void TestTryPromise_obj::testTryRecoverNull(){
            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_0) HXARGC(0)
            		 ::thx::promise::Future _hx_run(){
            			HX_STACK_FRAME("thx.promise.TestTryPromise","testTryRecoverNull",0x7406b601,"thx.promise.TestTryPromise.testTryRecoverNull","thx/promise/TestTryPromise.hx",113,0x2466de0d)
HXLINE( 113)			HX_STACK_DO_THROW(HX_("meh",10,0e,53,00));
HXDLIN( 113)			return null();
            		}
            		HX_END_LOCAL_FUNC0(return)

            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_1) HXARGC(1)
            		void _hx_run( ::thx::Error e){
            			HX_STACK_FRAME("thx.promise.TestTryPromise","testTryRecoverNull",0x7406b601,"thx.promise.TestTryPromise.testTryRecoverNull","thx/promise/TestTryPromise.hx",114,0x2466de0d)
            			HX_STACK_ARG(e,"e")
HXLINE( 114)			::utest::Assert_obj::stringContains(HX_("meh",10,0e,53,00),e->message,null(),hx::SourceInfo(HX_("TestTryPromise.hx",4c,09,d9,c2),114,HX_("thx.promise.TestTryPromise",cf,64,56,27),HX_("testTryRecoverNull",c2,d9,93,e9)));
            		}
            		HX_END_LOCAL_FUNC1((void))

            	HX_STACK_FRAME("thx.promise.TestTryPromise","testTryRecoverNull",0x7406b601,"thx.promise.TestTryPromise.testTryRecoverNull","thx/promise/TestTryPromise.hx",112,0x2466de0d)
            	HX_STACK_THIS(this)
HXLINE( 112)		 ::thx::promise::Future _hx_tmp = ::thx::promise::_Promise::Promise_Impl__obj::value(null());
HXDLIN( 112)		 ::thx::promise::Future _hx_tmp1 = ::thx::promise::_Promise::Promise_Impl__obj::recoverNull(_hx_tmp, ::Dynamic(new _hx_Closure_0()));
HXDLIN( 112)		 ::thx::promise::Future _hx_tmp2 = ::thx::promise::_Promise::Promise_Impl__obj::failure(_hx_tmp1, ::Dynamic(new _hx_Closure_1()));
HXDLIN( 112)		::thx::promise::_Promise::Promise_Impl__obj::always(_hx_tmp2,::utest::Assert_obj::createAsync(null(),null()));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestTryPromise_obj,testTryRecoverNull,(void))


TestTryPromise_obj::TestTryPromise_obj()
{
}

hx::Val TestTryPromise_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 10:
		if (HX_FIELD_EQ(inName,"testTryMap") ) { return hx::Val( testTryMap_dyn()); }
		break;
	case 13:
		if (HX_FIELD_EQ(inName,"testTryCreate") ) { return hx::Val( testTryCreate_dyn()); }
		if (HX_FIELD_EQ(inName,"testTryReject") ) { return hx::Val( testTryReject_dyn()); }
		if (HX_FIELD_EQ(inName,"testTryAlways") ) { return hx::Val( testTryAlways_dyn()); }
		break;
	case 14:
		if (HX_FIELD_EQ(inName,"testTrySuccess") ) { return hx::Val( testTrySuccess_dyn()); }
		if (HX_FIELD_EQ(inName,"testTryFlatMap") ) { return hx::Val( testTryFlatMap_dyn()); }
		break;
	case 18:
		if (HX_FIELD_EQ(inName,"testTryRecoverNull") ) { return hx::Val( testTryRecoverNull_dyn()); }
		break;
	case 19:
		if (HX_FIELD_EQ(inName,"testTryThrowFailure") ) { return hx::Val( testTryThrowFailure_dyn()); }
		break;
	case 20:
		if (HX_FIELD_EQ(inName,"testTryEitherSuccess") ) { return hx::Val( testTryEitherSuccess_dyn()); }
		if (HX_FIELD_EQ(inName,"testTryEitherFailure") ) { return hx::Val( testTryEitherFailure_dyn()); }
		break;
	case 27:
		if (HX_FIELD_EQ(inName,"testTryFlatMapEitherSuccess") ) { return hx::Val( testTryFlatMapEitherSuccess_dyn()); }
		if (HX_FIELD_EQ(inName,"testTryFlatMapEitherFailure") ) { return hx::Val( testTryFlatMapEitherFailure_dyn()); }
	}
	return super::__Field(inName,inCallProp);
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *TestTryPromise_obj_sMemberStorageInfo = 0;
static hx::StaticInfo *TestTryPromise_obj_sStaticStorageInfo = 0;
#endif

static ::String TestTryPromise_obj_sMemberFields[] = {
	HX_HCSTRING("testTryCreate","\xe5","\xdf","\x5d","\x99"),
	HX_HCSTRING("testTryEitherSuccess","\x35","\xb9","\xad","\x33"),
	HX_HCSTRING("testTryEitherFailure","\xbc","\x03","\x5a","\x92"),
	HX_HCSTRING("testTrySuccess","\xba","\x78","\xa9","\x3f"),
	HX_HCSTRING("testTryReject","\x48","\xca","\xd3","\x1f"),
	HX_HCSTRING("testTryAlways","\xb8","\x87","\x25","\x64"),
	HX_HCSTRING("testTryThrowFailure","\x6d","\x59","\x2f","\xac"),
	HX_HCSTRING("testTryMap","\x13","\xd6","\x3d","\x6e"),
	HX_HCSTRING("testTryFlatMap","\x5a","\x63","\x39","\x6e"),
	HX_HCSTRING("testTryFlatMapEitherSuccess","\x44","\xaf","\x17","\x59"),
	HX_HCSTRING("testTryFlatMapEitherFailure","\xcb","\xf9","\xc3","\xb7"),
	HX_HCSTRING("testTryRecoverNull","\xc2","\xd9","\x93","\xe9"),
	::String(null()) };

static void TestTryPromise_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(TestTryPromise_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void TestTryPromise_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(TestTryPromise_obj::__mClass,"__mClass");
};

#endif

hx::Class TestTryPromise_obj::__mClass;

void TestTryPromise_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.promise.TestTryPromise","\xcf","\x64","\x56","\x27");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &hx::Class_obj::GetNoStaticField;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = TestTryPromise_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(0 /* sStaticFields */);
	__mClass->mMembers = hx::Class_obj::dupFunctions(TestTryPromise_obj_sMemberFields);
	__mClass->mCanCast = hx::TCanCast< TestTryPromise_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = TestTryPromise_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = TestTryPromise_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = TestTryPromise_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx
} // end namespace promise
