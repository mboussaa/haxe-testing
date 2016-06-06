// Generated by Haxe 3.3.0
#include <hxcpp.h>

#include "hxMath.h"
#ifndef INCLUDED_haxe_ds_Option
#include <haxe/ds/Option.h>
#endif
#ifndef INCLUDED_thx_ArrayFloats
#include <thx/ArrayFloats.h>
#endif
#ifndef INCLUDED_thx_Arrays
#include <thx/Arrays.h>
#endif
#ifndef INCLUDED_thx_Floats
#include <thx/Floats.h>
#endif
#ifndef INCLUDED_thx_Options
#include <thx/Options.h>
#endif
#ifndef INCLUDED_thx_OrderingImpl
#include <thx/OrderingImpl.h>
#endif

namespace thx{

void ArrayFloats_obj::__construct() { }

Dynamic ArrayFloats_obj::__CreateEmpty() { return new ArrayFloats_obj; }

hx::ObjectPtr< ArrayFloats_obj > ArrayFloats_obj::__new()
{
	hx::ObjectPtr< ArrayFloats_obj > _hx_result = new ArrayFloats_obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic ArrayFloats_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< ArrayFloats_obj > _hx_result = new ArrayFloats_obj();
	_hx_result->__construct();
	return _hx_result;
}

Float ArrayFloats_obj::average(::Array< Float > arr){
            	HX_STACK_FRAME("thx.ArrayFloats","average",0xbfd047b5,"thx.ArrayFloats.average","thx/Arrays.hx",1166,0x537e0999)
            	HX_STACK_ARG(arr,"arr")
HXLINE(1166)		 ::Dynamic _hx_tmp = ::thx::ArrayFloats_obj::sum(arr);
HXDLIN(1166)		return ((Float)_hx_tmp / (Float)arr->length);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(ArrayFloats_obj,average,return )

::Array< Float > ArrayFloats_obj::compact(::Array< ::Dynamic> arr){
            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_0) HXARGC(1)
            		Bool _hx_run( ::Dynamic v){
            			HX_STACK_FRAME("thx.ArrayFloats","compact",0xe05de1fb,"thx.ArrayFloats.compact","thx/Arrays.hx",1174,0x537e0999)
            			HX_STACK_ARG(v,"v")
HXLINE(1174)			if (hx::IsNotNull( v )) {
HXLINE(1174)				return ::Math_obj::isFinite(v);
            			}
            			else {
HXLINE(1174)				return false;
            			}
HXDLIN(1174)			return false;
            		}
            		HX_END_LOCAL_FUNC1(return)

            	HX_STACK_FRAME("thx.ArrayFloats","compact",0xe05de1fb,"thx.ArrayFloats.compact","thx/Arrays.hx",1174,0x537e0999)
            	HX_STACK_ARG(arr,"arr")
HXLINE(1174)		return arr->filter( ::Dynamic(new _hx_Closure_0()));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(ArrayFloats_obj,compact,return )

 ::Dynamic ArrayFloats_obj::max(::Array< Float > arr){
            	HX_STACK_FRAME("thx.ArrayFloats","max",0x2ed7d4fc,"thx.ArrayFloats.max","thx/Arrays.hx",1180,0x537e0999)
            	HX_STACK_ARG(arr,"arr")
HXLINE(1180)		::hx::EnumBase _hx_tmp = ::thx::Arrays_obj::maxBy(arr,::thx::Floats_obj::order);
HXDLIN(1180)		return ::thx::Options_obj::get(_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(ArrayFloats_obj,max,return )

 ::Dynamic ArrayFloats_obj::min(::Array< Float > arr){
            	HX_STACK_FRAME("thx.ArrayFloats","min",0x2ed7dbea,"thx.ArrayFloats.min","thx/Arrays.hx",1186,0x537e0999)
            	HX_STACK_ARG(arr,"arr")
HXLINE(1186)		::hx::EnumBase _hx_tmp = ::thx::Arrays_obj::minBy(arr,::thx::Floats_obj::order);
HXDLIN(1186)		return ::thx::Options_obj::get(_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(ArrayFloats_obj,min,return )

::Array< Float > ArrayFloats_obj::resize(::Array< Float > array,Int length,hx::Null< Float >  __o_fill){
Float fill = __o_fill.Default(((Float)0.0));
            	HX_STACK_FRAME("thx.ArrayFloats","resize",0x83bb969c,"thx.ArrayFloats.resize","thx/Arrays.hx",1194,0x537e0999)
            	HX_STACK_ARG(array,"array")
            	HX_STACK_ARG(length,"length")
            	HX_STACK_ARG(fill,"fill")
HXLINE(1195)		while((array->length < length)){
HXLINE(1196)			array->push(fill);
            		}
HXLINE(1197)		Int _hx_tmp = (array->length - length);
HXDLIN(1197)		array->removeRange(length,_hx_tmp);
HXLINE(1198)		return array;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(ArrayFloats_obj,resize,return )

Float ArrayFloats_obj::standardDeviation(::Array< Float > array){
            		HX_BEGIN_LOCAL_FUNC_S1(hx::LocalFunc,_hx_Closure_0,Float,mean) HXARGC(2)
            		Float _hx_run(Float acc,Float val){
            			HX_STACK_FRAME("thx.ArrayFloats","standardDeviation",0x8e584a9c,"thx.ArrayFloats.standardDeviation","thx/Arrays.hx",1209,0x537e0999)
            			HX_STACK_ARG(acc,"acc")
            			HX_STACK_ARG(val,"val")
HXLINE(1209)			Float _hx_tmp1 = ::Math_obj::pow((val - mean),(int)2);
HXDLIN(1209)			return (acc + _hx_tmp1);
            		}
            		HX_END_LOCAL_FUNC2(return)

            	HX_STACK_FRAME("thx.ArrayFloats","standardDeviation",0x8e584a9c,"thx.ArrayFloats.standardDeviation","thx/Arrays.hx",1204,0x537e0999)
            	HX_STACK_ARG(array,"array")
HXLINE(1205)		if ((array->length < (int)2)) {
HXLINE(1206)			return ((Float)0.0);
            		}
HXLINE(1207)		HX_VARI( Float,mean) = ::thx::ArrayFloats_obj::average(array);
HXLINE(1208)		Float _hx_tmp = ( (Float)(::thx::Arrays_obj::reduce(array, ::Dynamic(new _hx_Closure_0(mean)),(int)0)) );
HXLINE(1207)		HX_VARI( Float,variance) = ((Float)_hx_tmp / (Float)(array->length - (int)1));
HXLINE(1211)		return ::Math_obj::sqrt(variance);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(ArrayFloats_obj,standardDeviation,return )

 ::Dynamic ArrayFloats_obj::sum(::Array< Float > arr){
            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_0) HXARGC(2)
            		Float _hx_run(Float tot,Float v){
            			HX_STACK_FRAME("thx.ArrayFloats","sum",0x2edc73e3,"thx.ArrayFloats.sum","thx/Arrays.hx",1218,0x537e0999)
            			HX_STACK_ARG(tot,"tot")
            			HX_STACK_ARG(v,"v")
HXLINE(1218)			return (tot + v);
            		}
            		HX_END_LOCAL_FUNC2(return)

            	HX_STACK_FRAME("thx.ArrayFloats","sum",0x2edc73e3,"thx.ArrayFloats.sum","thx/Arrays.hx",1218,0x537e0999)
            	HX_STACK_ARG(arr,"arr")
HXLINE(1218)		return ( (Float)(::thx::Arrays_obj::reduce(arr, ::Dynamic(new _hx_Closure_0()),((Float)0.0))) );
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(ArrayFloats_obj,sum,return )


ArrayFloats_obj::ArrayFloats_obj()
{
}

bool ArrayFloats_obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 3:
		if (HX_FIELD_EQ(inName,"max") ) { outValue = max_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"min") ) { outValue = min_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"sum") ) { outValue = sum_dyn(); return true; }
		break;
	case 6:
		if (HX_FIELD_EQ(inName,"resize") ) { outValue = resize_dyn(); return true; }
		break;
	case 7:
		if (HX_FIELD_EQ(inName,"average") ) { outValue = average_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"compact") ) { outValue = compact_dyn(); return true; }
		break;
	case 17:
		if (HX_FIELD_EQ(inName,"standardDeviation") ) { outValue = standardDeviation_dyn(); return true; }
	}
	return false;
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *ArrayFloats_obj_sMemberStorageInfo = 0;
static hx::StaticInfo *ArrayFloats_obj_sStaticStorageInfo = 0;
#endif

static void ArrayFloats_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(ArrayFloats_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void ArrayFloats_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(ArrayFloats_obj::__mClass,"__mClass");
};

#endif

hx::Class ArrayFloats_obj::__mClass;

static ::String ArrayFloats_obj_sStaticFields[] = {
	HX_HCSTRING("average","\x5d","\x71","\xdb","\x62"),
	HX_HCSTRING("compact","\xa3","\x0b","\x69","\x83"),
	HX_HCSTRING("max","\xa4","\x0a","\x53","\x00"),
	HX_HCSTRING("min","\x92","\x11","\x53","\x00"),
	HX_HCSTRING("resize","\xf4","\x59","\x7b","\x08"),
	HX_HCSTRING("standardDeviation","\x44","\x16","\x47","\xbe"),
	HX_HCSTRING("sum","\x8b","\xa9","\x57","\x00"),
	::String(null())
};

void ArrayFloats_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.ArrayFloats","\xc6","\x1e","\xdf","\x2d");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &ArrayFloats_obj::__GetStatic;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = ArrayFloats_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(ArrayFloats_obj_sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< ArrayFloats_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = ArrayFloats_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = ArrayFloats_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = ArrayFloats_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx
