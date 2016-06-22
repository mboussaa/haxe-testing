// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_thx_Error
#include <thx/Error.h>
#endif
#ifndef INCLUDED_thx_promise_Future
#include <thx/promise/Future.h>
#endif
#ifndef INCLUDED_thx_promise_PromiseTuple4
#include <thx/promise/PromiseTuple4.h>
#endif
#ifndef INCLUDED_thx_promise_Promises
#include <thx/promise/Promises.h>
#endif
#ifndef INCLUDED_thx_promise__Promise_Promise_Impl_
#include <thx/promise/_Promise/Promise_Impl_.h>
#endif

namespace thx{
namespace promise{

void PromiseTuple4_obj::__construct() { }

Dynamic PromiseTuple4_obj::__CreateEmpty() { return new PromiseTuple4_obj; }

hx::ObjectPtr< PromiseTuple4_obj > PromiseTuple4_obj::__new()
{
	hx::ObjectPtr< PromiseTuple4_obj > _hx_result = new PromiseTuple4_obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic PromiseTuple4_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< PromiseTuple4_obj > _hx_result = new PromiseTuple4_obj();
	_hx_result->__construct();
	return _hx_result;
}

 ::thx::promise::Future PromiseTuple4_obj::join( ::thx::promise::Future p1, ::thx::promise::Future p2){
            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_0) HXARGC(2)
            		 ::Dynamic _hx_run( ::Dynamic f, ::Dynamic g){
            			HX_STACK_FRAME("thx.promise.PromiseTuple4","join",0xb71fe94e,"thx.promise.PromiseTuple4.join","thx/promise/Promise.hx",400,0xfca84942)
            			HX_STACK_ARG(f,"f")
            			HX_STACK_ARG(g,"g")
HXLINE( 400)			return  ::Dynamic(hx::Anon_obj::Create(5)
            				->setFixed(0,HX_("_0",f1,52,00,00), ::Dynamic(f->__Field(HX_("_0",f1,52,00,00),hx::paccDynamic)))
            				->setFixed(1,HX_("_1",f2,52,00,00), ::Dynamic(f->__Field(HX_("_1",f2,52,00,00),hx::paccDynamic)))
            				->setFixed(2,HX_("_2",f3,52,00,00), ::Dynamic(f->__Field(HX_("_2",f3,52,00,00),hx::paccDynamic)))
            				->setFixed(3,HX_("_3",f4,52,00,00), ::Dynamic(f->__Field(HX_("_3",f4,52,00,00),hx::paccDynamic)))
            				->setFixed(4,HX_("_4",f5,52,00,00),g));
            		}
            		HX_END_LOCAL_FUNC2(return)

            	HX_STACK_FRAME("thx.promise.PromiseTuple4","join",0xb71fe94e,"thx.promise.PromiseTuple4.join","thx/promise/Promise.hx",400,0xfca84942)
            	HX_STACK_ARG(p1,"p1")
            	HX_STACK_ARG(p2,"p2")
HXLINE( 400)		return ::thx::promise::Promises_obj::par( ::Dynamic(new _hx_Closure_0()),p1,p2);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(PromiseTuple4_obj,join,return )

 ::thx::promise::Future PromiseTuple4_obj::mapTuplePromise( ::thx::promise::Future promise, ::Dynamic success){
            		HX_BEGIN_LOCAL_FUNC_S1(hx::LocalFunc,_hx_Closure_0, ::Dynamic,success) HXARGC(1)
            		 ::thx::promise::Future _hx_run( ::Dynamic t){
            			HX_STACK_FRAME("thx.promise.PromiseTuple4","mapTuplePromise",0xe0da784b,"thx.promise.PromiseTuple4.mapTuplePromise","thx/promise/Promise.hx",404,0xfca84942)
            			HX_STACK_ARG(t,"t")
HXLINE( 404)			return ( ( ::thx::promise::Future)(success( ::Dynamic(t->__Field(HX_("_0",f1,52,00,00),hx::paccDynamic)), ::Dynamic(t->__Field(HX_("_1",f2,52,00,00),hx::paccDynamic)), ::Dynamic(t->__Field(HX_("_2",f3,52,00,00),hx::paccDynamic)), ::Dynamic(t->__Field(HX_("_3",f4,52,00,00),hx::paccDynamic)))) );
            		}
            		HX_END_LOCAL_FUNC1(return)

            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_1) HXARGC(1)
            		 ::thx::promise::Future _hx_run( ::thx::Error err){
            			HX_STACK_FRAME("thx.promise.PromiseTuple4","mapTuplePromise",0xe0da784b,"thx.promise.PromiseTuple4.mapTuplePromise","thx/promise/Promise.hx",403,0xfca84942)
            			HX_STACK_ARG(err,"err")
HXLINE( 403)			return ::thx::promise::_Promise::Promise_Impl__obj::error(err);
            		}
            		HX_END_LOCAL_FUNC1(return)

            	HX_STACK_FRAME("thx.promise.PromiseTuple4","mapTuplePromise",0xe0da784b,"thx.promise.PromiseTuple4.mapTuplePromise","thx/promise/Promise.hx",403,0xfca84942)
            	HX_STACK_ARG(promise,"promise")
            	HX_STACK_ARG(success,"success")
HXLINE( 403)		return ::thx::promise::_Promise::Promise_Impl__obj::flatMapEither(promise, ::Dynamic(new _hx_Closure_0(success)), ::Dynamic(new _hx_Closure_1()));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(PromiseTuple4_obj,mapTuplePromise,return )

 ::thx::promise::Future PromiseTuple4_obj::mapTuple( ::thx::promise::Future promise, ::Dynamic success){
            		HX_BEGIN_LOCAL_FUNC_S1(hx::LocalFunc,_hx_Closure_0, ::Dynamic,success) HXARGC(1)
            		 ::Dynamic _hx_run( ::Dynamic t){
            			HX_STACK_FRAME("thx.promise.PromiseTuple4","mapTuple",0x00344330,"thx.promise.PromiseTuple4.mapTuple","thx/promise/Promise.hx",409,0xfca84942)
            			HX_STACK_ARG(t,"t")
HXLINE( 409)			return success( ::Dynamic(t->__Field(HX_("_0",f1,52,00,00),hx::paccDynamic)), ::Dynamic(t->__Field(HX_("_1",f2,52,00,00),hx::paccDynamic)), ::Dynamic(t->__Field(HX_("_2",f3,52,00,00),hx::paccDynamic)), ::Dynamic(t->__Field(HX_("_3",f4,52,00,00),hx::paccDynamic)));
            		}
            		HX_END_LOCAL_FUNC1(return)

            	HX_STACK_FRAME("thx.promise.PromiseTuple4","mapTuple",0x00344330,"thx.promise.PromiseTuple4.mapTuple","thx/promise/Promise.hx",408,0xfca84942)
            	HX_STACK_ARG(promise,"promise")
            	HX_STACK_ARG(success,"success")
HXLINE( 408)		return ::thx::promise::_Promise::Promise_Impl__obj::map(promise, ::Dynamic(new _hx_Closure_0(success)));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(PromiseTuple4_obj,mapTuple,return )

 ::thx::promise::Future PromiseTuple4_obj::tuple( ::thx::promise::Future promise, ::Dynamic success, ::Dynamic failure){
            		HX_BEGIN_LOCAL_FUNC_S1(hx::LocalFunc,_hx_Closure_1, ::Dynamic,success) HXARGC(1)
            		void _hx_run( ::Dynamic t){
            			HX_STACK_FRAME("thx.promise.PromiseTuple4","tuple",0x4aca9e24,"thx.promise.PromiseTuple4.tuple","thx/promise/Promise.hx",414,0xfca84942)
            			HX_STACK_ARG(t,"t")
HXLINE( 414)			success( ::Dynamic(t->__Field(HX_("_0",f1,52,00,00),hx::paccDynamic)), ::Dynamic(t->__Field(HX_("_1",f2,52,00,00),hx::paccDynamic)), ::Dynamic(t->__Field(HX_("_2",f3,52,00,00),hx::paccDynamic)), ::Dynamic(t->__Field(HX_("_3",f4,52,00,00),hx::paccDynamic)));
            		}
            		HX_END_LOCAL_FUNC1((void))

            	HX_STACK_FRAME("thx.promise.PromiseTuple4","tuple",0x4aca9e24,"thx.promise.PromiseTuple4.tuple","thx/promise/Promise.hx",413,0xfca84942)
            	HX_STACK_ARG(promise,"promise")
            	HX_STACK_ARG(success,"success")
            	HX_STACK_ARG(failure,"failure")
HXLINE( 415)		 ::Dynamic _hx_tmp;
HXDLIN( 415)		if (hx::IsNull( failure )) {
            			HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_0) HXARGC(1)
            			void _hx_run( ::thx::Error _){
            				HX_STACK_FRAME("thx.promise.PromiseTuple4","tuple",0x4aca9e24,"thx.promise.PromiseTuple4.tuple","thx/promise/Promise.hx",415,0xfca84942)
            				HX_STACK_ARG(_,"_")
            			}
            			HX_END_LOCAL_FUNC1((void))

HXLINE( 415)			_hx_tmp =  ::Dynamic(new _hx_Closure_0());
            		}
            		else {
HXLINE( 415)			_hx_tmp = failure;
            		}
HXLINE( 413)		return ::thx::promise::_Promise::Promise_Impl__obj::either(promise, ::Dynamic(new _hx_Closure_1(success)),_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(PromiseTuple4_obj,tuple,return )


PromiseTuple4_obj::PromiseTuple4_obj()
{
}

bool PromiseTuple4_obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 4:
		if (HX_FIELD_EQ(inName,"join") ) { outValue = join_dyn(); return true; }
		break;
	case 5:
		if (HX_FIELD_EQ(inName,"tuple") ) { outValue = tuple_dyn(); return true; }
		break;
	case 8:
		if (HX_FIELD_EQ(inName,"mapTuple") ) { outValue = mapTuple_dyn(); return true; }
		break;
	case 15:
		if (HX_FIELD_EQ(inName,"mapTuplePromise") ) { outValue = mapTuplePromise_dyn(); return true; }
	}
	return false;
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *PromiseTuple4_obj_sMemberStorageInfo = 0;
static hx::StaticInfo *PromiseTuple4_obj_sStaticStorageInfo = 0;
#endif

static void PromiseTuple4_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(PromiseTuple4_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void PromiseTuple4_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(PromiseTuple4_obj::__mClass,"__mClass");
};

#endif

hx::Class PromiseTuple4_obj::__mClass;

static ::String PromiseTuple4_obj_sStaticFields[] = {
	HX_HCSTRING("join","\xea","\x33","\x65","\x46"),
	HX_HCSTRING("mapTuplePromise","\x2f","\x3b","\x0c","\xa4"),
	HX_HCSTRING("mapTuple","\xcc","\x0b","\x69","\x8f"),
	HX_HCSTRING("tuple","\x08","\x9c","\x26","\x18"),
	::String(null())
};

void PromiseTuple4_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.promise.PromiseTuple4","\x8a","\xa5","\x5d","\x6a");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &PromiseTuple4_obj::__GetStatic;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = PromiseTuple4_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(PromiseTuple4_obj_sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< PromiseTuple4_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = PromiseTuple4_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = PromiseTuple4_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = PromiseTuple4_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx
} // end namespace promise