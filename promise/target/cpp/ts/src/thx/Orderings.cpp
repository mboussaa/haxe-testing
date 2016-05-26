// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_thx_OrderingImpl
#include <thx/OrderingImpl.h>
#endif
#ifndef INCLUDED_thx_Orderings
#include <thx/Orderings.h>
#endif

namespace thx{

void Orderings_obj::__construct() { }

Dynamic Orderings_obj::__CreateEmpty() { return new Orderings_obj; }

hx::ObjectPtr< Orderings_obj > Orderings_obj::__new()
{
	hx::ObjectPtr< Orderings_obj > _hx_result = new Orderings_obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic Orderings_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< Orderings_obj > _hx_result = new Orderings_obj();
	_hx_result->__construct();
	return _hx_result;
}

 ::Dynamic Orderings_obj::monoid;

::hx::EnumBase Orderings_obj::negate(::hx::EnumBase o){
            	HX_STACK_FRAME("thx.Orderings","negate",0x2d59dcbb,"thx.Orderings.negate","thx/Ord.hx",36,0xc2038108)
            	HX_STACK_ARG(o,"o")
HXLINE(  36)		Int _hx_tmp = ( ( ::hx::EnumBase)(o) )->_hx_getIndex();
HXDLIN(  36)		switch((int)(_hx_tmp)){
            			case (int)0: {
HXLINE(  36)				return ::thx::OrderingImpl_obj::GT_dyn();
            			}
            			break;
            			case (int)1: {
HXLINE(  36)				return ::thx::OrderingImpl_obj::LT_dyn();
            			}
            			break;
            			case (int)2: {
HXLINE(  36)				return ::thx::OrderingImpl_obj::EQ_dyn();
            			}
            			break;
            		}
HXDLIN(  36)		return null();
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Orderings_obj,negate,return )


Orderings_obj::Orderings_obj()
{
}

bool Orderings_obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 6:
		if (HX_FIELD_EQ(inName,"monoid") ) { outValue = monoid; return true; }
		if (HX_FIELD_EQ(inName,"negate") ) { outValue = negate_dyn(); return true; }
	}
	return false;
}

bool Orderings_obj::__SetStatic(const ::String &inName,Dynamic &ioValue,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 6:
		if (HX_FIELD_EQ(inName,"monoid") ) { monoid=ioValue.Cast<  ::Dynamic >(); return true; }
	}
	return false;
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *Orderings_obj_sMemberStorageInfo = 0;
static hx::StaticInfo Orderings_obj_sStaticStorageInfo[] = {
	{hx::fsObject /*Dynamic*/ ,(void *) &Orderings_obj::monoid,HX_HCSTRING("monoid","\xbe","\xc6","\x6a","\xc7")},
	{ hx::fsUnknown, 0, null()}
};
#endif

static void Orderings_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(Orderings_obj::__mClass,"__mClass");
	HX_MARK_MEMBER_NAME(Orderings_obj::monoid,"monoid");
};

#ifdef HXCPP_VISIT_ALLOCS
static void Orderings_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(Orderings_obj::__mClass,"__mClass");
	HX_VISIT_MEMBER_NAME(Orderings_obj::monoid,"monoid");
};

#endif

hx::Class Orderings_obj::__mClass;

static ::String Orderings_obj_sStaticFields[] = {
	HX_HCSTRING("monoid","\xbe","\xc6","\x6a","\xc7"),
	HX_HCSTRING("negate","\xc2","\x41","\x19","\x67"),
	::String(null())
};

void Orderings_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.Orderings","\x55","\xa0","\x6e","\x61");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &Orderings_obj::__GetStatic;
	__mClass->mSetStaticField = &Orderings_obj::__SetStatic;
	__mClass->mMarkFunc = Orderings_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(Orderings_obj_sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< Orderings_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = Orderings_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = Orderings_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = Orderings_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

void Orderings_obj::__boot()
{
{
            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_0) HXARGC(2)
            		::hx::EnumBase _hx_run(::hx::EnumBase o0,::hx::EnumBase o1){
            			HX_STACK_FRAME("thx.Orderings","boot",0x836d3eeb,"thx.Orderings.boot","thx/Ord.hx",29,0xc2038108)
            			HX_STACK_ARG(o0,"o0")
            			HX_STACK_ARG(o1,"o1")
HXLINE(  29)			Int _hx_tmp = ( ( ::hx::EnumBase)(o0) )->_hx_getIndex();
HXDLIN(  29)			switch((int)(_hx_tmp)){
            				case (int)0: {
HXLINE(  29)					return ::thx::OrderingImpl_obj::LT_dyn();
            				}
            				break;
            				case (int)1: {
HXLINE(  29)					return ::thx::OrderingImpl_obj::GT_dyn();
            				}
            				break;
            				case (int)2: {
HXLINE(  29)					return o1;
            				}
            				break;
            			}
HXDLIN(  29)			return null();
            		}
            		HX_END_LOCAL_FUNC2(return)

            	HX_STACK_FRAME("thx.Orderings","boot",0x836d3eeb,"thx.Orderings.boot","thx/Ord.hx",27,0xc2038108)
HXLINE(  27)		monoid =  ::Dynamic(hx::Anon_obj::Create(2)
            			->setFixed(0,HX_("append",da,e1,d3,8f), ::Dynamic(new _hx_Closure_0()))
            			->setFixed(1,HX_("zero",28,0f,f1,50),::thx::OrderingImpl_obj::EQ_dyn()));
            	}
}

} // end namespace thx
