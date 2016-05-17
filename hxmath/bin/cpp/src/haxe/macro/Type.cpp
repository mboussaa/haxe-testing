// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_haxe_macro_Type
#include <haxe/macro/Type.h>
#endif
namespace haxe{
namespace macro{

::haxe::macro::Type Type_obj::TAbstract( ::Dynamic t,::Array< ::Dynamic> params)
{
	return hx::CreateEnum< Type_obj >(HX_("TAbstract",56,f1,66,b9),8,2)->_hx_init(0,t)->_hx_init(1,params);
}

::haxe::macro::Type Type_obj::TAnonymous( ::Dynamic a)
{
	return hx::CreateEnum< Type_obj >(HX_("TAnonymous",79,49,55,32),5,1)->_hx_init(0,a);
}

::haxe::macro::Type Type_obj::TDynamic(::hx::EnumBase t)
{
	return hx::CreateEnum< Type_obj >(HX_("TDynamic",8b,39,f4,c7),6,1)->_hx_init(0,t);
}

::haxe::macro::Type Type_obj::TEnum( ::Dynamic t,::Array< ::Dynamic> params)
{
	return hx::CreateEnum< Type_obj >(HX_("TEnum",75,51,98,8b),1,2)->_hx_init(0,t)->_hx_init(1,params);
}

::haxe::macro::Type Type_obj::TFun(::Array< ::Dynamic> args,::hx::EnumBase ret)
{
	return hx::CreateEnum< Type_obj >(HX_("TFun",4b,70,bb,37),4,2)->_hx_init(0,args)->_hx_init(1,ret);
}

::haxe::macro::Type Type_obj::TInst( ::Dynamic t,::Array< ::Dynamic> params)
{
	return hx::CreateEnum< Type_obj >(HX_("TInst",3a,2a,3d,8e),2,2)->_hx_init(0,t)->_hx_init(1,params);
}

::haxe::macro::Type Type_obj::TLazy( ::Dynamic f)
{
	return hx::CreateEnum< Type_obj >(HX_("TLazy",e8,f6,2e,90),7,1)->_hx_init(0,f);
}

::haxe::macro::Type Type_obj::TMono( ::Dynamic t)
{
	return hx::CreateEnum< Type_obj >(HX_("TMono",97,c2,e2,90),0,1)->_hx_init(0,t);
}

::haxe::macro::Type Type_obj::TType( ::Dynamic t,::Array< ::Dynamic> params)
{
	return hx::CreateEnum< Type_obj >(HX_("TType",2e,d9,8a,95),3,2)->_hx_init(0,t)->_hx_init(1,params);
}

bool Type_obj::__GetStatic(const ::String &inName, ::Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	if (inName==HX_("TAbstract",56,f1,66,b9)) { outValue = Type_obj::TAbstract_dyn(); return true; }
	if (inName==HX_("TAnonymous",79,49,55,32)) { outValue = Type_obj::TAnonymous_dyn(); return true; }
	if (inName==HX_("TDynamic",8b,39,f4,c7)) { outValue = Type_obj::TDynamic_dyn(); return true; }
	if (inName==HX_("TEnum",75,51,98,8b)) { outValue = Type_obj::TEnum_dyn(); return true; }
	if (inName==HX_("TFun",4b,70,bb,37)) { outValue = Type_obj::TFun_dyn(); return true; }
	if (inName==HX_("TInst",3a,2a,3d,8e)) { outValue = Type_obj::TInst_dyn(); return true; }
	if (inName==HX_("TLazy",e8,f6,2e,90)) { outValue = Type_obj::TLazy_dyn(); return true; }
	if (inName==HX_("TMono",97,c2,e2,90)) { outValue = Type_obj::TMono_dyn(); return true; }
	if (inName==HX_("TType",2e,d9,8a,95)) { outValue = Type_obj::TType_dyn(); return true; }
	return super::__GetStatic(inName, outValue, inCallProp);
}

HX_DEFINE_CREATE_ENUM(Type_obj)

int Type_obj::__FindIndex(::String inName)
{
	if (inName==HX_("TAbstract",56,f1,66,b9)) return 8;
	if (inName==HX_("TAnonymous",79,49,55,32)) return 5;
	if (inName==HX_("TDynamic",8b,39,f4,c7)) return 6;
	if (inName==HX_("TEnum",75,51,98,8b)) return 1;
	if (inName==HX_("TFun",4b,70,bb,37)) return 4;
	if (inName==HX_("TInst",3a,2a,3d,8e)) return 2;
	if (inName==HX_("TLazy",e8,f6,2e,90)) return 7;
	if (inName==HX_("TMono",97,c2,e2,90)) return 0;
	if (inName==HX_("TType",2e,d9,8a,95)) return 3;
	return super::__FindIndex(inName);
}

STATIC_HX_DEFINE_DYNAMIC_FUNC2(Type_obj,TAbstract,return)

STATIC_HX_DEFINE_DYNAMIC_FUNC1(Type_obj,TAnonymous,return)

STATIC_HX_DEFINE_DYNAMIC_FUNC1(Type_obj,TDynamic,return)

STATIC_HX_DEFINE_DYNAMIC_FUNC2(Type_obj,TEnum,return)

STATIC_HX_DEFINE_DYNAMIC_FUNC2(Type_obj,TFun,return)

STATIC_HX_DEFINE_DYNAMIC_FUNC2(Type_obj,TInst,return)

STATIC_HX_DEFINE_DYNAMIC_FUNC1(Type_obj,TLazy,return)

STATIC_HX_DEFINE_DYNAMIC_FUNC1(Type_obj,TMono,return)

STATIC_HX_DEFINE_DYNAMIC_FUNC2(Type_obj,TType,return)

int Type_obj::__FindArgCount(::String inName)
{
	if (inName==HX_("TAbstract",56,f1,66,b9)) return 2;
	if (inName==HX_("TAnonymous",79,49,55,32)) return 1;
	if (inName==HX_("TDynamic",8b,39,f4,c7)) return 1;
	if (inName==HX_("TEnum",75,51,98,8b)) return 2;
	if (inName==HX_("TFun",4b,70,bb,37)) return 2;
	if (inName==HX_("TInst",3a,2a,3d,8e)) return 2;
	if (inName==HX_("TLazy",e8,f6,2e,90)) return 1;
	if (inName==HX_("TMono",97,c2,e2,90)) return 1;
	if (inName==HX_("TType",2e,d9,8a,95)) return 2;
	return super::__FindArgCount(inName);
}

hx::Val Type_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	if (inName==HX_("TAbstract",56,f1,66,b9)) return TAbstract_dyn();
	if (inName==HX_("TAnonymous",79,49,55,32)) return TAnonymous_dyn();
	if (inName==HX_("TDynamic",8b,39,f4,c7)) return TDynamic_dyn();
	if (inName==HX_("TEnum",75,51,98,8b)) return TEnum_dyn();
	if (inName==HX_("TFun",4b,70,bb,37)) return TFun_dyn();
	if (inName==HX_("TInst",3a,2a,3d,8e)) return TInst_dyn();
	if (inName==HX_("TLazy",e8,f6,2e,90)) return TLazy_dyn();
	if (inName==HX_("TMono",97,c2,e2,90)) return TMono_dyn();
	if (inName==HX_("TType",2e,d9,8a,95)) return TType_dyn();
	return super::__Field(inName,inCallProp);
}

static ::String Type_obj_sStaticFields[] = {
	HX_("TMono",97,c2,e2,90),
	HX_("TEnum",75,51,98,8b),
	HX_("TInst",3a,2a,3d,8e),
	HX_("TType",2e,d9,8a,95),
	HX_("TFun",4b,70,bb,37),
	HX_("TAnonymous",79,49,55,32),
	HX_("TDynamic",8b,39,f4,c7),
	HX_("TLazy",e8,f6,2e,90),
	HX_("TAbstract",56,f1,66,b9),
	::String(null())
};

static void Type_obj_sMarkStatics(HX_MARK_PARAMS) {
};

#ifdef HXCPP_VISIT_ALLOCS
static void Type_obj_sVisitStatic(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(Type_obj::__mClass,"__mClass");
};
#endif

hx::Class Type_obj::__mClass;

Dynamic __Create_Type_obj() { return new Type_obj; }

void Type_obj::__register()
{

hx::Static(__mClass) = hx::_hx_RegisterClass(HX_HCSTRING("haxe.macro.Type","\xc4","\x89","\xca","\x9a"), hx::TCanCast< Type_obj >,Type_obj_sStaticFields,0,
	&__Create_Type_obj, &__Create,
	&super::__SGetClass(), &CreateType_obj, Type_obj_sMarkStatics
#ifdef HXCPP_VISIT_ALLOCS
    , Type_obj_sVisitStatic
#endif
#ifdef HXCPP_SCRIPTABLE
    , 0
#endif
);
	__mClass->mGetStaticField = &Type_obj::__GetStatic;
}

void Type_obj::__boot()
{
}


} // end namespace haxe
} // end namespace macro
