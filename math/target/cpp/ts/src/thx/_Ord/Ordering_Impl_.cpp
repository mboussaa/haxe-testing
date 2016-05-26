// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_thx_OrderingImpl
#include <thx/OrderingImpl.h>
#endif
#ifndef INCLUDED_thx__Ord_Ordering_Impl_
#include <thx/_Ord/Ordering_Impl_.h>
#endif

namespace thx{
namespace _Ord{

void Ordering_Impl__obj::__construct() { }

Dynamic Ordering_Impl__obj::__CreateEmpty() { return new Ordering_Impl__obj; }

hx::ObjectPtr< Ordering_Impl__obj > Ordering_Impl__obj::__new()
{
	hx::ObjectPtr< Ordering_Impl__obj > _hx_result = new Ordering_Impl__obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic Ordering_Impl__obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< Ordering_Impl__obj > _hx_result = new Ordering_Impl__obj();
	_hx_result->__construct();
	return _hx_result;
}

::hx::EnumBase Ordering_Impl__obj::fromInt(Int value){
            	HX_STACK_FRAME("thx._Ord.Ordering_Impl_","fromInt",0x5e4af94d,"thx._Ord.Ordering_Impl_.fromInt","thx/Ord.hx",9,0xc2038108)
            	HX_STACK_ARG(value,"value")
HXLINE(   9)		if ((value < (int)0)) {
HXLINE(   9)			return ::thx::OrderingImpl_obj::LT_dyn();
            		}
            		else {
HXLINE(   9)			if ((value > (int)0)) {
HXLINE(   9)				return ::thx::OrderingImpl_obj::GT_dyn();
            			}
            			else {
HXLINE(   9)				return ::thx::OrderingImpl_obj::EQ_dyn();
            			}
            		}
HXDLIN(   9)		return null();
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Ordering_Impl__obj,fromInt,return )

::hx::EnumBase Ordering_Impl__obj::fromFloat(Float value){
            	HX_STACK_FRAME("thx._Ord.Ordering_Impl_","fromFloat",0x066c057a,"thx._Ord.Ordering_Impl_.fromFloat","thx/Ord.hx",12,0xc2038108)
            	HX_STACK_ARG(value,"value")
HXLINE(  12)		if ((value < (int)0)) {
HXLINE(  12)			return ::thx::OrderingImpl_obj::LT_dyn();
            		}
            		else {
HXLINE(  12)			if ((value > (int)0)) {
HXLINE(  12)				return ::thx::OrderingImpl_obj::GT_dyn();
            			}
            			else {
HXLINE(  12)				return ::thx::OrderingImpl_obj::EQ_dyn();
            			}
            		}
HXDLIN(  12)		return null();
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Ordering_Impl__obj,fromFloat,return )

Int Ordering_Impl__obj::toInt(::hx::EnumBase this1){
            	HX_STACK_FRAME("thx._Ord.Ordering_Impl_","toInt",0x36c81fdc,"thx._Ord.Ordering_Impl_.toInt","thx/Ord.hx",15,0xc2038108)
            	HX_STACK_ARG(this1,"this1")
HXLINE(  15)		Int _hx_tmp = ( ( ::hx::EnumBase)(this1) )->_hx_getIndex();
HXDLIN(  15)		switch((int)(_hx_tmp)){
            			case (int)0: {
HXLINE(  15)				return (int)-1;
            			}
            			break;
            			case (int)1: {
HXLINE(  15)				return (int)1;
            			}
            			break;
            			case (int)2: {
HXLINE(  15)				return (int)0;
            			}
            			break;
            		}
HXDLIN(  15)		return (int)0;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Ordering_Impl__obj,toInt,return )


Ordering_Impl__obj::Ordering_Impl__obj()
{
}

bool Ordering_Impl__obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 5:
		if (HX_FIELD_EQ(inName,"toInt") ) { outValue = toInt_dyn(); return true; }
		break;
	case 7:
		if (HX_FIELD_EQ(inName,"fromInt") ) { outValue = fromInt_dyn(); return true; }
		break;
	case 9:
		if (HX_FIELD_EQ(inName,"fromFloat") ) { outValue = fromFloat_dyn(); return true; }
	}
	return false;
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *Ordering_Impl__obj_sMemberStorageInfo = 0;
static hx::StaticInfo *Ordering_Impl__obj_sStaticStorageInfo = 0;
#endif

static void Ordering_Impl__obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(Ordering_Impl__obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void Ordering_Impl__obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(Ordering_Impl__obj::__mClass,"__mClass");
};

#endif

hx::Class Ordering_Impl__obj::__mClass;

static ::String Ordering_Impl__obj_sStaticFields[] = {
	HX_HCSTRING("fromInt","\xa5","\xdd","\xfa","\x57"),
	HX_HCSTRING("fromFloat","\xd2","\xaf","\x1f","\xb7"),
	HX_HCSTRING("toInt","\x34","\xbe","\x11","\x14"),
	::String(null())
};

void Ordering_Impl__obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx._Ord.Ordering_Impl_","\x16","\x94","\xcc","\x61");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &Ordering_Impl__obj::__GetStatic;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = Ordering_Impl__obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(Ordering_Impl__obj_sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< Ordering_Impl__obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = Ordering_Impl__obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = Ordering_Impl__obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = Ordering_Impl__obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx
} // end namespace _Ord
