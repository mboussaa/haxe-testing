// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_thx_Nil
#include <thx/Nil.h>
#endif
#ifndef INCLUDED_thx__Tuple_Tuple0_Impl_
#include <thx/_Tuple/Tuple0_Impl_.h>
#endif

namespace thx{
namespace _Tuple{

void Tuple0_Impl__obj::__construct() { }

Dynamic Tuple0_Impl__obj::__CreateEmpty() { return new Tuple0_Impl__obj; }

hx::ObjectPtr< Tuple0_Impl__obj > Tuple0_Impl__obj::__new()
{
	hx::ObjectPtr< Tuple0_Impl__obj > _hx_result = new Tuple0_Impl__obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic Tuple0_Impl__obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< Tuple0_Impl__obj > _hx_result = new Tuple0_Impl__obj();
	_hx_result->__construct();
	return _hx_result;
}

::hx::EnumBase Tuple0_Impl__obj::_new(){
            	HX_STACK_FRAME("thx._Tuple.Tuple0_Impl_","_new",0xbc59984c,"thx._Tuple.Tuple0_Impl_._new","thx/Tuple.hx",12,0x02554e01)
HXLINE(  12)		return ::thx::Nil_obj::nil_dyn();
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC0(Tuple0_Impl__obj,_new,return )

 ::Dynamic Tuple0_Impl__obj::with(::hx::EnumBase this1, ::Dynamic v){
            	HX_STACK_FRAME("thx._Tuple.Tuple0_Impl_","with",0xcc32f8f1,"thx._Tuple.Tuple0_Impl_.with","thx/Tuple.hx",20,0x02554e01)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(v,"v")
HXLINE(  20)		return v;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Tuple0_Impl__obj,with,return )

::String Tuple0_Impl__obj::toString(::hx::EnumBase this1){
            	HX_STACK_FRAME("thx._Tuple.Tuple0_Impl_","toString",0x413ca517,"thx._Tuple.Tuple0_Impl_.toString","thx/Tuple.hx",26,0x02554e01)
            	HX_STACK_ARG(this1,"this1")
HXLINE(  26)		return HX_("Tuple0()",49,e4,02,00);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Tuple0_Impl__obj,toString,return )

::hx::EnumBase Tuple0_Impl__obj::toNil(::hx::EnumBase this1){
            	HX_STACK_FRAME("thx._Tuple.Tuple0_Impl_","toNil",0x2a0d8fcb,"thx._Tuple.Tuple0_Impl_.toNil","thx/Tuple.hx",32,0x02554e01)
            	HX_STACK_ARG(this1,"this1")
HXLINE(  32)		return this1;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Tuple0_Impl__obj,toNil,return )

::hx::EnumBase Tuple0_Impl__obj::nilToTuple(::hx::EnumBase v){
            	HX_STACK_FRAME("thx._Tuple.Tuple0_Impl_","nilToTuple",0x2f83cde7,"thx._Tuple.Tuple0_Impl_.nilToTuple","thx/Tuple.hx",38,0x02554e01)
            	HX_STACK_ARG(v,"v")
HXLINE(  38)		return ::thx::Nil_obj::nil_dyn();
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Tuple0_Impl__obj,nilToTuple,return )


Tuple0_Impl__obj::Tuple0_Impl__obj()
{
}

bool Tuple0_Impl__obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 4:
		if (HX_FIELD_EQ(inName,"_new") ) { outValue = _new_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"with") ) { outValue = with_dyn(); return true; }
		break;
	case 5:
		if (HX_FIELD_EQ(inName,"toNil") ) { outValue = toNil_dyn(); return true; }
		break;
	case 8:
		if (HX_FIELD_EQ(inName,"toString") ) { outValue = toString_dyn(); return true; }
		break;
	case 10:
		if (HX_FIELD_EQ(inName,"nilToTuple") ) { outValue = nilToTuple_dyn(); return true; }
	}
	return false;
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *Tuple0_Impl__obj_sMemberStorageInfo = 0;
static hx::StaticInfo *Tuple0_Impl__obj_sStaticStorageInfo = 0;
#endif

static void Tuple0_Impl__obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(Tuple0_Impl__obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void Tuple0_Impl__obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(Tuple0_Impl__obj::__mClass,"__mClass");
};

#endif

hx::Class Tuple0_Impl__obj::__mClass;

static ::String Tuple0_Impl__obj_sStaticFields[] = {
	HX_HCSTRING("_new","\x61","\x15","\x1f","\x3f"),
	HX_HCSTRING("with","\x06","\x76","\xf8","\x4e"),
	HX_HCSTRING("toString","\xac","\xd0","\x6e","\x38"),
	HX_HCSTRING("toNil","\x16","\x85","\x15","\x14"),
	HX_HCSTRING("nilToTuple","\xbc","\xc8","\x47","\xf8"),
	::String(null())
};

void Tuple0_Impl__obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx._Tuple.Tuple0_Impl_","\x63","\xc5","\xde","\xdd");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &Tuple0_Impl__obj::__GetStatic;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = Tuple0_Impl__obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(Tuple0_Impl__obj_sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< Tuple0_Impl__obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = Tuple0_Impl__obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = Tuple0_Impl__obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = Tuple0_Impl__obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx
} // end namespace _Tuple
