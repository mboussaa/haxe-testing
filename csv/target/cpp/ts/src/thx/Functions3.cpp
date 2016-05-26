// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_Std
#include <Std.h>
#endif
#ifndef INCLUDED_haxe_IMap
#include <haxe/IMap.h>
#endif
#ifndef INCLUDED_haxe_ds_StringMap
#include <haxe/ds/StringMap.h>
#endif
#ifndef INCLUDED_thx_Functions3
#include <thx/Functions3.h>
#endif

namespace thx{

void Functions3_obj::__construct() { }

Dynamic Functions3_obj::__CreateEmpty() { return new Functions3_obj; }

hx::ObjectPtr< Functions3_obj > Functions3_obj::__new()
{
	hx::ObjectPtr< Functions3_obj > _hx_result = new Functions3_obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic Functions3_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< Functions3_obj > _hx_result = new Functions3_obj();
	_hx_result->__construct();
	return _hx_result;
}

 ::Dynamic Functions3_obj::memoize( ::Dynamic callback, ::Dynamic resolver){
            		HX_BEGIN_LOCAL_FUNC_S3(hx::LocalFunc,_hx_Closure_1, ::Dynamic,resolver, ::haxe::ds::StringMap,map, ::Dynamic,callback) HXARGC(3)
            		 ::Dynamic _hx_run( ::Dynamic v11, ::Dynamic v21, ::Dynamic v31){
            			HX_STACK_FRAME("thx.Functions3","memoize",0xa31c0bae,"thx.Functions3.memoize","thx/Functions.hx",214,0xe7fcd70e)
            			HX_STACK_ARG(v11,"v11")
            			HX_STACK_ARG(v21,"v21")
            			HX_STACK_ARG(v31,"v31")
HXLINE( 215)			HX_VARI( ::String,key) = ( (::String)(resolver(v11,v21,v31)) );
HXLINE( 216)			Bool _hx_tmp5 = map->exists(key);
HXDLIN( 216)			if (_hx_tmp5) {
HXLINE( 217)				return map->get(key);
            			}
HXLINE( 218)			HX_VARI(  ::Dynamic,result) = callback(v11,v21,v31);
HXLINE( 219)			map->set(key,result);
HXLINE( 220)			return result;
            		}
            		HX_END_LOCAL_FUNC3(return)

            	HX_STACK_FRAME("thx.Functions3","memoize",0xa31c0bae,"thx.Functions3.memoize","thx/Functions.hx",210,0xe7fcd70e)
            	HX_STACK_ARG(callback,"callback")
            	HX_STACK_ARG(resolver,"resolver")
HXLINE( 211)		if (hx::IsNull( resolver )) {
            			HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_0) HXARGC(3)
            			::String _hx_run( ::Dynamic v1, ::Dynamic v2, ::Dynamic v3){
            				HX_STACK_FRAME("thx.Functions3","memoize",0xa31c0bae,"thx.Functions3.memoize","thx/Functions.hx",212,0xe7fcd70e)
            				HX_STACK_ARG(v1,"v1")
            				HX_STACK_ARG(v2,"v2")
            				HX_STACK_ARG(v3,"v3")
HXLINE( 212)				::String _hx_tmp = ::Std_obj::string(v1);
HXDLIN( 212)				::String _hx_tmp1 = ((HX_("",00,00,00,00) + _hx_tmp) + HX_(":",3a,00,00,00));
HXDLIN( 212)				::String _hx_tmp2 = ::Std_obj::string(v2);
HXDLIN( 212)				::String _hx_tmp3 = ((_hx_tmp1 + _hx_tmp2) + HX_(":",3a,00,00,00));
HXDLIN( 212)				::String _hx_tmp4 = ::Std_obj::string(v3);
HXDLIN( 212)				return (_hx_tmp3 + _hx_tmp4);
            			}
            			HX_END_LOCAL_FUNC3(return)

HXLINE( 212)			resolver =  ::Dynamic(new _hx_Closure_0());
            		}
HXLINE( 213)		HX_VARI(  ::haxe::ds::StringMap,map) =  ::haxe::ds::StringMap_obj::__new();
HXLINE( 214)		return  ::Dynamic(new _hx_Closure_1(resolver,map,callback));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Functions3_obj,memoize,return )

 ::Dynamic Functions3_obj::negate( ::Dynamic callback){
            		HX_BEGIN_LOCAL_FUNC_S1(hx::LocalFunc,_hx_Closure_0, ::Dynamic,callback) HXARGC(3)
            		Bool _hx_run( ::Dynamic v1, ::Dynamic v2, ::Dynamic v3){
            			HX_STACK_FRAME("thx.Functions3","negate",0x06182f6e,"thx.Functions3.negate","thx/Functions.hx",229,0xe7fcd70e)
            			HX_STACK_ARG(v1,"v1")
            			HX_STACK_ARG(v2,"v2")
            			HX_STACK_ARG(v3,"v3")
HXLINE( 229)			return !(( (Bool)(callback(v1,v2,v3)) ));
            		}
            		HX_END_LOCAL_FUNC3(return)

            	HX_STACK_FRAME("thx.Functions3","negate",0x06182f6e,"thx.Functions3.negate","thx/Functions.hx",228,0xe7fcd70e)
            	HX_STACK_ARG(callback,"callback")
HXLINE( 228)		return  ::Dynamic(new _hx_Closure_0(callback));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Functions3_obj,negate,return )

 ::Dynamic Functions3_obj::curry( ::Dynamic f){
            		HX_BEGIN_LOCAL_FUNC_S1(hx::LocalFunc,_hx_Closure_1, ::Dynamic,f) HXARGC(2)
            		 ::Dynamic _hx_run( ::Dynamic a, ::Dynamic b){
            			HX_BEGIN_LOCAL_FUNC_S3(hx::LocalFunc,_hx_Closure_0, ::Dynamic,a, ::Dynamic,f, ::Dynamic,b) HXARGC(1)
            			 ::Dynamic _hx_run( ::Dynamic c){
            				HX_STACK_FRAME("thx.Functions3","curry",0x1ed7b51b,"thx.Functions3.curry","thx/Functions.hx",232,0xe7fcd70e)
            				HX_STACK_ARG(c,"c")
HXLINE( 232)				return f(a,b,c);
            			}
            			HX_END_LOCAL_FUNC1(return)

            			HX_STACK_FRAME("thx.Functions3","curry",0x1ed7b51b,"thx.Functions3.curry","thx/Functions.hx",232,0xe7fcd70e)
            			HX_STACK_ARG(a,"a")
            			HX_STACK_ARG(b,"b")
HXLINE( 232)			return  ::Dynamic(new _hx_Closure_0(a,f,b));
            		}
            		HX_END_LOCAL_FUNC2(return)

            	HX_STACK_FRAME("thx.Functions3","curry",0x1ed7b51b,"thx.Functions3.curry","thx/Functions.hx",232,0xe7fcd70e)
            	HX_STACK_ARG(f,"f")
HXLINE( 232)		return  ::Dynamic(new _hx_Closure_1(f));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Functions3_obj,curry,return )


Functions3_obj::Functions3_obj()
{
}

bool Functions3_obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 5:
		if (HX_FIELD_EQ(inName,"curry") ) { outValue = curry_dyn(); return true; }
		break;
	case 6:
		if (HX_FIELD_EQ(inName,"negate") ) { outValue = negate_dyn(); return true; }
		break;
	case 7:
		if (HX_FIELD_EQ(inName,"memoize") ) { outValue = memoize_dyn(); return true; }
	}
	return false;
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *Functions3_obj_sMemberStorageInfo = 0;
static hx::StaticInfo *Functions3_obj_sStaticStorageInfo = 0;
#endif

static void Functions3_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(Functions3_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void Functions3_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(Functions3_obj::__mClass,"__mClass");
};

#endif

hx::Class Functions3_obj::__mClass;

static ::String Functions3_obj_sStaticFields[] = {
	HX_HCSTRING("memoize","\xda","\x02","\x0b","\x23"),
	HX_HCSTRING("negate","\xc2","\x41","\x19","\x67"),
	HX_HCSTRING("curry","\x47","\x49","\x58","\x4e"),
	::String(null())
};

void Functions3_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.Functions3","\x42","\x75","\xc6","\x4b");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &Functions3_obj::__GetStatic;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = Functions3_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(Functions3_obj_sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< Functions3_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = Functions3_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = Functions3_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = Functions3_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx
