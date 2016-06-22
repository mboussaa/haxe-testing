// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_thx_Nil
#include <thx/Nil.h>
#endif
#ifndef INCLUDED_thx_promise_Future
#include <thx/promise/Future.h>
#endif
#ifndef INCLUDED_thx_promise_FutureNil
#include <thx/promise/FutureNil.h>
#endif
#ifndef INCLUDED_thx_promise_Futures
#include <thx/promise/Futures.h>
#endif

namespace thx{
namespace promise{

void FutureNil_obj::__construct() { }

Dynamic FutureNil_obj::__CreateEmpty() { return new FutureNil_obj; }

hx::ObjectPtr< FutureNil_obj > FutureNil_obj::__new()
{
	hx::ObjectPtr< FutureNil_obj > _hx_result = new FutureNil_obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic FutureNil_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< FutureNil_obj > _hx_result = new FutureNil_obj();
	_hx_result->__construct();
	return _hx_result;
}

 ::thx::promise::Future FutureNil_obj::join( ::thx::promise::Future p1, ::thx::promise::Future p2){
            		HX_BEGIN_LOCAL_FUNC_S2(hx::LocalFunc,_hx_Closure_1, ::thx::promise::Future,p2, ::thx::promise::Future,p1) HXARGC(1)
            		void _hx_run( ::Dynamic callback){
            			HX_BEGIN_LOCAL_FUNC_S1(hx::LocalFunc,_hx_Closure_0, ::Dynamic,callback) HXARGC(1)
            			void _hx_run( ::Dynamic t){
            				HX_STACK_FRAME("thx.promise.FutureNil","join",0x11f1ad47,"thx.promise.FutureNil.join","thx/promise/Future.hx",280,0xf68a81fc)
            				HX_STACK_ARG(t,"t")
HXLINE( 280)				callback( ::Dynamic(t->__Field(HX_("_1",f2,52,00,00),hx::paccDynamic)));
            			}
            			HX_END_LOCAL_FUNC1((void))

            			HX_STACK_FRAME("thx.promise.FutureNil","join",0x11f1ad47,"thx.promise.FutureNil.join","thx/promise/Future.hx",279,0xf68a81fc)
            			HX_STACK_ARG(callback,"callback")
HXLINE( 279)			::thx::promise::Futures_obj::join(p1,p2)->then( ::Dynamic(new _hx_Closure_0(callback)));
            		}
            		HX_END_LOCAL_FUNC1((void))

            	HX_STACK_FRAME("thx.promise.FutureNil","join",0x11f1ad47,"thx.promise.FutureNil.join","thx/promise/Future.hx",278,0xf68a81fc)
            	HX_STACK_ARG(p1,"p1")
            	HX_STACK_ARG(p2,"p2")
HXLINE( 278)		return ::thx::promise::Future_obj::create( ::Dynamic(new _hx_Closure_1(p2,p1)));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(FutureNil_obj,join,return )

 ::thx::promise::Future FutureNil_obj::nil( ::thx::promise::Future p){
            		HX_BEGIN_LOCAL_FUNC_S1(hx::LocalFunc,_hx_Closure_1, ::thx::promise::Future,p) HXARGC(1)
            		void _hx_run( ::Dynamic callback){
            			HX_BEGIN_LOCAL_FUNC_S1(hx::LocalFunc,_hx_Closure_0, ::Dynamic,callback) HXARGC(1)
            			void _hx_run( ::Dynamic _){
            				HX_STACK_FRAME("thx.promise.FutureNil","nil",0x95547514,"thx.promise.FutureNil.nil","thx/promise/Future.hx",284,0xf68a81fc)
            				HX_STACK_ARG(_,"_")
HXLINE( 284)				callback(::thx::Nil_obj::nil_dyn());
            			}
            			HX_END_LOCAL_FUNC1((void))

            			HX_STACK_FRAME("thx.promise.FutureNil","nil",0x95547514,"thx.promise.FutureNil.nil","thx/promise/Future.hx",284,0xf68a81fc)
            			HX_STACK_ARG(callback,"callback")
HXLINE( 284)			p->then( ::Dynamic(new _hx_Closure_0(callback)));
            		}
            		HX_END_LOCAL_FUNC1((void))

            	HX_STACK_FRAME("thx.promise.FutureNil","nil",0x95547514,"thx.promise.FutureNil.nil","thx/promise/Future.hx",283,0xf68a81fc)
            	HX_STACK_ARG(p,"p")
HXLINE( 283)		return ::thx::promise::Future_obj::create( ::Dynamic(new _hx_Closure_1(p)));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(FutureNil_obj,nil,return )


FutureNil_obj::FutureNil_obj()
{
}

bool FutureNil_obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 3:
		if (HX_FIELD_EQ(inName,"nil") ) { outValue = nil_dyn(); return true; }
		break;
	case 4:
		if (HX_FIELD_EQ(inName,"join") ) { outValue = join_dyn(); return true; }
	}
	return false;
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *FutureNil_obj_sMemberStorageInfo = 0;
static hx::StaticInfo *FutureNil_obj_sStaticStorageInfo = 0;
#endif

static void FutureNil_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(FutureNil_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void FutureNil_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(FutureNil_obj::__mClass,"__mClass");
};

#endif

hx::Class FutureNil_obj::__mClass;

static ::String FutureNil_obj_sStaticFields[] = {
	HX_HCSTRING("join","\xea","\x33","\x65","\x46"),
	HX_HCSTRING("nil","\xd1","\xd3","\x53","\x00"),
	::String(null())
};

void FutureNil_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.promise.FutureNil","\x31","\x64","\xf4","\x23");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &FutureNil_obj::__GetStatic;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = FutureNil_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(FutureNil_obj_sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< FutureNil_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = FutureNil_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = FutureNil_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = FutureNil_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx
} // end namespace promise