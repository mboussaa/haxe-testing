// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_haxe_IMap
#include <haxe/IMap.h>
#endif
#ifndef INCLUDED_haxe_ds_Option
#include <haxe/ds/Option.h>
#endif
#ifndef INCLUDED_thx_Options
#include <thx/Options.h>
#endif
#ifndef INCLUDED_thx_OrderingImpl
#include <thx/OrderingImpl.h>
#endif
#ifndef INCLUDED_thx__Ord_Ord_Impl_
#include <thx/_Ord/Ord_Impl_.h>
#endif
#ifndef INCLUDED_thx_fp_ComparableMap
#include <thx/fp/ComparableMap.h>
#endif
#ifndef INCLUDED_thx_fp_MapImpl
#include <thx/fp/MapImpl.h>
#endif
#ifndef INCLUDED_thx_fp__Map_Map_Impl_
#include <thx/fp/_Map/Map_Impl_.h>
#endif

namespace thx{
namespace fp{

void ComparableMap_obj::__construct() { }

Dynamic ComparableMap_obj::__CreateEmpty() { return new ComparableMap_obj; }

hx::ObjectPtr< ComparableMap_obj > ComparableMap_obj::__new()
{
	hx::ObjectPtr< ComparableMap_obj > _hx_result = new ComparableMap_obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic ComparableMap_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< ComparableMap_obj > _hx_result = new ComparableMap_obj();
	_hx_result->__construct();
	return _hx_result;
}

Bool ComparableMap_obj::exists(::hx::EnumBase map, ::Dynamic key){
            	HX_STACK_FRAME("thx.fp.ComparableMap","exists",0x787f9b42,"thx.fp.ComparableMap.exists","thx/fp/Maps.hx",116,0x8274fa8d)
            	HX_STACK_ARG(map,"map")
            	HX_STACK_ARG(key,"key")
HXLINE( 116)		 ::Dynamic _hx_tmp = ::thx::_Ord::Ord_Impl__obj::forComparable();
HXDLIN( 116)		::hx::EnumBase _hx_tmp1 = ::thx::fp::_Map::Map_Impl__obj::lookup(map,key,_hx_tmp);
HXDLIN( 116)		return ::thx::Options_obj::toBool(_hx_tmp1);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(ComparableMap_obj,exists,return )

::hx::EnumBase ComparableMap_obj::get(::hx::EnumBase map, ::Dynamic key){
            	HX_STACK_FRAME("thx.fp.ComparableMap","get",0x3b074770,"thx.fp.ComparableMap.get","thx/fp/Maps.hx",119,0x8274fa8d)
            	HX_STACK_ARG(map,"map")
            	HX_STACK_ARG(key,"key")
HXLINE( 119)		 ::Dynamic _hx_tmp = ::thx::_Ord::Ord_Impl__obj::forComparable();
HXDLIN( 119)		return ::thx::fp::_Map::Map_Impl__obj::lookup(map,key,_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(ComparableMap_obj,get,return )

 ::Dynamic ComparableMap_obj::getAlt(::hx::EnumBase map, ::Dynamic key, ::Dynamic alt){
            	HX_STACK_FRAME("thx.fp.ComparableMap","getAlt",0x5bb8af99,"thx.fp.ComparableMap.getAlt","thx/fp/Maps.hx",122,0x8274fa8d)
            	HX_STACK_ARG(map,"map")
            	HX_STACK_ARG(key,"key")
            	HX_STACK_ARG(alt,"alt")
HXLINE( 122)		 ::Dynamic _hx_tmp = ::thx::_Ord::Ord_Impl__obj::forComparable();
HXDLIN( 122)		::hx::EnumBase _hx_tmp1 = ::thx::fp::_Map::Map_Impl__obj::lookup(map,key,_hx_tmp);
HXDLIN( 122)		return ::thx::Options_obj::getOrElse(_hx_tmp1,alt);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(ComparableMap_obj,getAlt,return )

::hx::EnumBase ComparableMap_obj::set(::hx::EnumBase map, ::Dynamic key, ::Dynamic value){
            	HX_STACK_FRAME("thx.fp.ComparableMap","set",0x3b10627c,"thx.fp.ComparableMap.set","thx/fp/Maps.hx",125,0x8274fa8d)
            	HX_STACK_ARG(map,"map")
            	HX_STACK_ARG(key,"key")
            	HX_STACK_ARG(value,"value")
HXLINE( 125)		 ::Dynamic _hx_tmp = ::thx::_Ord::Ord_Impl__obj::forComparable();
HXDLIN( 125)		return ::thx::fp::_Map::Map_Impl__obj::insert(map,key,value,_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(ComparableMap_obj,set,return )

::hx::EnumBase ComparableMap_obj::remove(::hx::EnumBase map, ::Dynamic key){
            	HX_STACK_FRAME("thx.fp.ComparableMap","remove",0xbd2819aa,"thx.fp.ComparableMap.remove","thx/fp/Maps.hx",128,0x8274fa8d)
            	HX_STACK_ARG(map,"map")
            	HX_STACK_ARG(key,"key")
HXLINE( 128)		 ::Dynamic _hx_tmp = ::thx::_Ord::Ord_Impl__obj::forComparable();
HXDLIN( 128)		return ::thx::fp::_Map::Map_Impl__obj::_hx_delete(map,key,_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(ComparableMap_obj,remove,return )

::hx::EnumBase ComparableMap_obj::fromNative(::Dynamic map){
            	HX_STACK_FRAME("thx.fp.ComparableMap","fromNative",0x2ae1f707,"thx.fp.ComparableMap.fromNative","thx/fp/Maps.hx",131,0x8274fa8d)
            	HX_STACK_ARG(map,"map")
HXLINE( 131)		 ::Dynamic _hx_tmp = ::thx::_Ord::Ord_Impl__obj::forComparable();
HXDLIN( 131)		return ::thx::fp::_Map::Map_Impl__obj::fromNative(map,_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(ComparableMap_obj,fromNative,return )

::hx::EnumBase ComparableMap_obj::merge(::hx::EnumBase a,::hx::EnumBase b){
            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_0) HXARGC(2)
            		::hx::EnumBase _hx_run(::hx::EnumBase acc, ::Dynamic t){
            			HX_STACK_FRAME("thx.fp.ComparableMap","merge",0xf5625412,"thx.fp.ComparableMap.merge","thx/fp/Maps.hx",134,0x8274fa8d)
            			HX_STACK_ARG(acc,"acc")
            			HX_STACK_ARG(t,"t")
HXLINE( 134)			 ::Dynamic _hx_tmp = ::thx::_Ord::Ord_Impl__obj::forComparable();
HXDLIN( 134)			return ::thx::fp::_Map::Map_Impl__obj::insert(acc, ::Dynamic(t->__Field(HX_("_0",f1,52,00,00),hx::paccDynamic)), ::Dynamic(t->__Field(HX_("_1",f2,52,00,00),hx::paccDynamic)),_hx_tmp);
            		}
            		HX_END_LOCAL_FUNC2(return)

            	HX_STACK_FRAME("thx.fp.ComparableMap","merge",0xf5625412,"thx.fp.ComparableMap.merge","thx/fp/Maps.hx",134,0x8274fa8d)
            	HX_STACK_ARG(a,"a")
            	HX_STACK_ARG(b,"b")
HXLINE( 134)		return ::thx::fp::_Map::Map_Impl__obj::foldLeftTuples(b,a, ::Dynamic(new _hx_Closure_0()));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(ComparableMap_obj,merge,return )


ComparableMap_obj::ComparableMap_obj()
{
}

bool ComparableMap_obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 3:
		if (HX_FIELD_EQ(inName,"get") ) { outValue = get_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"set") ) { outValue = set_dyn(); return true; }
		break;
	case 5:
		if (HX_FIELD_EQ(inName,"merge") ) { outValue = merge_dyn(); return true; }
		break;
	case 6:
		if (HX_FIELD_EQ(inName,"exists") ) { outValue = exists_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"getAlt") ) { outValue = getAlt_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"remove") ) { outValue = remove_dyn(); return true; }
		break;
	case 10:
		if (HX_FIELD_EQ(inName,"fromNative") ) { outValue = fromNative_dyn(); return true; }
	}
	return false;
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *ComparableMap_obj_sMemberStorageInfo = 0;
static hx::StaticInfo *ComparableMap_obj_sStaticStorageInfo = 0;
#endif

static void ComparableMap_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(ComparableMap_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void ComparableMap_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(ComparableMap_obj::__mClass,"__mClass");
};

#endif

hx::Class ComparableMap_obj::__mClass;

static ::String ComparableMap_obj_sStaticFields[] = {
	HX_HCSTRING("exists","\xdc","\x1d","\xe0","\xbf"),
	HX_HCSTRING("get","\x96","\x80","\x4e","\x00"),
	HX_HCSTRING("getAlt","\x33","\x32","\x19","\xa3"),
	HX_HCSTRING("set","\xa2","\x9b","\x57","\x00"),
	HX_HCSTRING("remove","\x44","\x9c","\x88","\x04"),
	HX_HCSTRING("fromNative","\xa1","\xce","\x60","\x65"),
	HX_HCSTRING("merge","\xb8","\xa2","\xc6","\x05"),
	::String(null())
};

void ComparableMap_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.fp.ComparableMap","\x48","\x32","\x76","\xab");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &ComparableMap_obj::__GetStatic;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = ComparableMap_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(ComparableMap_obj_sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< ComparableMap_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = ComparableMap_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = ComparableMap_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = ComparableMap_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx
} // end namespace fp