// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_Std
#include <Std.h>
#endif
#ifndef INCLUDED_thx__Tuple_Tuple6_Impl_
#include <thx/_Tuple/Tuple6_Impl_.h>
#endif

namespace thx{
namespace _Tuple{

void Tuple6_Impl__obj::__construct() { }

Dynamic Tuple6_Impl__obj::__CreateEmpty() { return new Tuple6_Impl__obj; }

hx::ObjectPtr< Tuple6_Impl__obj > Tuple6_Impl__obj::__new()
{
	hx::ObjectPtr< Tuple6_Impl__obj > _hx_result = new Tuple6_Impl__obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic Tuple6_Impl__obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< Tuple6_Impl__obj > _hx_result = new Tuple6_Impl__obj();
	_hx_result->__construct();
	return _hx_result;
}

 ::Dynamic Tuple6_Impl__obj::of( ::Dynamic _0, ::Dynamic _1, ::Dynamic _2, ::Dynamic _3, ::Dynamic _4, ::Dynamic _5){
            	HX_STACK_FRAME("thx._Tuple.Tuple6_Impl_","of",0x9b3c927c,"thx._Tuple.Tuple6_Impl_.of","thx/Tuple.hx",315,0x02554e01)
            	HX_STACK_ARG(_0,"_0")
            	HX_STACK_ARG(_1,"_1")
            	HX_STACK_ARG(_2,"_2")
            	HX_STACK_ARG(_3,"_3")
            	HX_STACK_ARG(_4,"_4")
            	HX_STACK_ARG(_5,"_5")
HXLINE( 315)		return  ::Dynamic(hx::Anon_obj::Create(6)
            			->setFixed(0,HX_("_0",f1,52,00,00),_0)
            			->setFixed(1,HX_("_1",f2,52,00,00),_1)
            			->setFixed(2,HX_("_2",f3,52,00,00),_2)
            			->setFixed(3,HX_("_3",f4,52,00,00),_3)
            			->setFixed(4,HX_("_4",f5,52,00,00),_4)
            			->setFixed(5,HX_("_5",f6,52,00,00),_5));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC6(Tuple6_Impl__obj,of,return )

 ::Dynamic Tuple6_Impl__obj::_new( ::Dynamic _0, ::Dynamic _1, ::Dynamic _2, ::Dynamic _3, ::Dynamic _4, ::Dynamic _5){
            	HX_STACK_FRAME("thx._Tuple.Tuple6_Impl_","_new",0x46d62a06,"thx._Tuple.Tuple6_Impl_._new","thx/Tuple.hx",320,0x02554e01)
            	HX_STACK_ARG(_0,"_0")
            	HX_STACK_ARG(_1,"_1")
            	HX_STACK_ARG(_2,"_2")
            	HX_STACK_ARG(_3,"_3")
            	HX_STACK_ARG(_4,"_4")
            	HX_STACK_ARG(_5,"_5")
HXLINE( 320)		return  ::Dynamic(hx::Anon_obj::Create(6)
            			->setFixed(0,HX_("_0",f1,52,00,00),_0)
            			->setFixed(1,HX_("_1",f2,52,00,00),_1)
            			->setFixed(2,HX_("_2",f3,52,00,00),_2)
            			->setFixed(3,HX_("_3",f4,52,00,00),_3)
            			->setFixed(4,HX_("_4",f5,52,00,00),_4)
            			->setFixed(5,HX_("_5",f6,52,00,00),_5));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC6(Tuple6_Impl__obj,_new,return )

 ::Dynamic Tuple6_Impl__obj::flip( ::Dynamic this1){
            	HX_STACK_FRAME("thx._Tuple.Tuple6_Impl_","flip",0x4b752752,"thx._Tuple.Tuple6_Impl_.flip","thx/Tuple.hx",327,0x02554e01)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 327)		return  ::Dynamic(hx::Anon_obj::Create(6)
            			->setFixed(0,HX_("_0",f1,52,00,00), ::Dynamic(this1->__Field(HX_("_5",f6,52,00,00),hx::paccDynamic)))
            			->setFixed(1,HX_("_1",f2,52,00,00), ::Dynamic(this1->__Field(HX_("_4",f5,52,00,00),hx::paccDynamic)))
            			->setFixed(2,HX_("_2",f3,52,00,00), ::Dynamic(this1->__Field(HX_("_3",f4,52,00,00),hx::paccDynamic)))
            			->setFixed(3,HX_("_3",f4,52,00,00), ::Dynamic(this1->__Field(HX_("_2",f3,52,00,00),hx::paccDynamic)))
            			->setFixed(4,HX_("_4",f5,52,00,00), ::Dynamic(this1->__Field(HX_("_1",f2,52,00,00),hx::paccDynamic)))
            			->setFixed(5,HX_("_5",f6,52,00,00), ::Dynamic(this1->__Field(HX_("_0",f1,52,00,00),hx::paccDynamic))));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Tuple6_Impl__obj,flip,return )

 ::Dynamic Tuple6_Impl__obj::dropLeft( ::Dynamic this1){
            	HX_STACK_FRAME("thx._Tuple.Tuple6_Impl_","dropLeft",0xa1397afb,"thx._Tuple.Tuple6_Impl_.dropLeft","thx/Tuple.hx",334,0x02554e01)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 334)		return  ::Dynamic(hx::Anon_obj::Create(5)
            			->setFixed(0,HX_("_0",f1,52,00,00), ::Dynamic(this1->__Field(HX_("_1",f2,52,00,00),hx::paccDynamic)))
            			->setFixed(1,HX_("_1",f2,52,00,00), ::Dynamic(this1->__Field(HX_("_2",f3,52,00,00),hx::paccDynamic)))
            			->setFixed(2,HX_("_2",f3,52,00,00), ::Dynamic(this1->__Field(HX_("_3",f4,52,00,00),hx::paccDynamic)))
            			->setFixed(3,HX_("_3",f4,52,00,00), ::Dynamic(this1->__Field(HX_("_4",f5,52,00,00),hx::paccDynamic)))
            			->setFixed(4,HX_("_4",f5,52,00,00), ::Dynamic(this1->__Field(HX_("_5",f6,52,00,00),hx::paccDynamic))));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Tuple6_Impl__obj,dropLeft,return )

 ::Dynamic Tuple6_Impl__obj::dropRight( ::Dynamic this1){
            	HX_STACK_FRAME("thx._Tuple.Tuple6_Impl_","dropRight",0xe81f2e68,"thx._Tuple.Tuple6_Impl_.dropRight","thx/Tuple.hx",341,0x02554e01)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 341)		return  ::Dynamic(hx::Anon_obj::Create(5)
            			->setFixed(0,HX_("_0",f1,52,00,00), ::Dynamic(this1->__Field(HX_("_0",f1,52,00,00),hx::paccDynamic)))
            			->setFixed(1,HX_("_1",f2,52,00,00), ::Dynamic(this1->__Field(HX_("_1",f2,52,00,00),hx::paccDynamic)))
            			->setFixed(2,HX_("_2",f3,52,00,00), ::Dynamic(this1->__Field(HX_("_2",f3,52,00,00),hx::paccDynamic)))
            			->setFixed(3,HX_("_3",f4,52,00,00), ::Dynamic(this1->__Field(HX_("_3",f4,52,00,00),hx::paccDynamic)))
            			->setFixed(4,HX_("_4",f5,52,00,00), ::Dynamic(this1->__Field(HX_("_4",f5,52,00,00),hx::paccDynamic))));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Tuple6_Impl__obj,dropRight,return )

::String Tuple6_Impl__obj::toString( ::Dynamic this1){
            	HX_STACK_FRAME("thx._Tuple.Tuple6_Impl_","toString",0xec5d9bd1,"thx._Tuple.Tuple6_Impl_.toString","thx/Tuple.hx",347,0x02554e01)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 347)		::String _hx_tmp = ::Std_obj::string( ::Dynamic(this1->__Field(HX_("_0",f1,52,00,00),hx::paccDynamic)));
HXDLIN( 347)		::String _hx_tmp1 = ((HX_("Tuple6(",1a,05,5d,31) + _hx_tmp) + HX_(",",2c,00,00,00));
HXDLIN( 347)		::String _hx_tmp2 = ::Std_obj::string( ::Dynamic(this1->__Field(HX_("_1",f2,52,00,00),hx::paccDynamic)));
HXDLIN( 347)		::String _hx_tmp3 = ((_hx_tmp1 + _hx_tmp2) + HX_(",",2c,00,00,00));
HXDLIN( 347)		::String _hx_tmp4 = ::Std_obj::string( ::Dynamic(this1->__Field(HX_("_2",f3,52,00,00),hx::paccDynamic)));
HXDLIN( 347)		::String _hx_tmp5 = ((_hx_tmp3 + _hx_tmp4) + HX_(",",2c,00,00,00));
HXDLIN( 347)		::String _hx_tmp6 = ::Std_obj::string( ::Dynamic(this1->__Field(HX_("_3",f4,52,00,00),hx::paccDynamic)));
HXDLIN( 347)		::String _hx_tmp7 = ((_hx_tmp5 + _hx_tmp6) + HX_(",",2c,00,00,00));
HXDLIN( 347)		::String _hx_tmp8 = ::Std_obj::string( ::Dynamic(this1->__Field(HX_("_4",f5,52,00,00),hx::paccDynamic)));
HXDLIN( 347)		::String _hx_tmp9 = ((_hx_tmp7 + _hx_tmp8) + HX_(",",2c,00,00,00));
HXDLIN( 347)		::String _hx_tmp10 = ::Std_obj::string( ::Dynamic(this1->__Field(HX_("_5",f6,52,00,00),hx::paccDynamic)));
HXDLIN( 347)		return ((_hx_tmp9 + _hx_tmp10) + HX_(")",29,00,00,00));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Tuple6_Impl__obj,toString,return )

 ::Dynamic Tuple6_Impl__obj::arrayToTuple6(::cpp::VirtualArray v){
            	HX_STACK_FRAME("thx._Tuple.Tuple6_Impl_","arrayToTuple6",0x3de42c7d,"thx._Tuple.Tuple6_Impl_.arrayToTuple6","thx/Tuple.hx",350,0x02554e01)
            	HX_STACK_ARG(v,"v")
HXLINE( 350)		return  ::Dynamic(hx::Anon_obj::Create(6)
            			->setFixed(0,HX_("_0",f1,52,00,00),v->__get((int)0))
            			->setFixed(1,HX_("_1",f2,52,00,00),v->__get((int)1))
            			->setFixed(2,HX_("_2",f3,52,00,00),v->__get((int)2))
            			->setFixed(3,HX_("_3",f4,52,00,00),v->__get((int)3))
            			->setFixed(4,HX_("_4",f5,52,00,00),v->__get((int)4))
            			->setFixed(5,HX_("_5",f6,52,00,00),v->__get((int)5)));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Tuple6_Impl__obj,arrayToTuple6,return )


Tuple6_Impl__obj::Tuple6_Impl__obj()
{
}

bool Tuple6_Impl__obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 2:
		if (HX_FIELD_EQ(inName,"of") ) { outValue = of_dyn(); return true; }
		break;
	case 4:
		if (HX_FIELD_EQ(inName,"_new") ) { outValue = _new_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"flip") ) { outValue = flip_dyn(); return true; }
		break;
	case 8:
		if (HX_FIELD_EQ(inName,"dropLeft") ) { outValue = dropLeft_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"toString") ) { outValue = toString_dyn(); return true; }
		break;
	case 9:
		if (HX_FIELD_EQ(inName,"dropRight") ) { outValue = dropRight_dyn(); return true; }
		break;
	case 13:
		if (HX_FIELD_EQ(inName,"arrayToTuple6") ) { outValue = arrayToTuple6_dyn(); return true; }
	}
	return false;
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *Tuple6_Impl__obj_sMemberStorageInfo = 0;
static hx::StaticInfo *Tuple6_Impl__obj_sStaticStorageInfo = 0;
#endif

static void Tuple6_Impl__obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(Tuple6_Impl__obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void Tuple6_Impl__obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(Tuple6_Impl__obj::__mClass,"__mClass");
};

#endif

hx::Class Tuple6_Impl__obj::__mClass;

static ::String Tuple6_Impl__obj_sStaticFields[] = {
	HX_HCSTRING("of","\x17","\x61","\x00","\x00"),
	HX_HCSTRING("_new","\x61","\x15","\x1f","\x3f"),
	HX_HCSTRING("flip","\xad","\x12","\xbe","\x43"),
	HX_HCSTRING("dropLeft","\xd6","\xaf","\x4a","\xed"),
	HX_HCSTRING("dropRight","\x2d","\x39","\x1c","\x2b"),
	HX_HCSTRING("toString","\xac","\xd0","\x6e","\x38"),
	HX_HCSTRING("arrayToTuple6","\xc2","\x7d","\x1e","\xb3"),
	::String(null())
};

void Tuple6_Impl__obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx._Tuple.Tuple6_Impl_","\xe9","\x8d","\x5f","\xd7");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &Tuple6_Impl__obj::__GetStatic;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = Tuple6_Impl__obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(Tuple6_Impl__obj_sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< Tuple6_Impl__obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = Tuple6_Impl__obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = Tuple6_Impl__obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = Tuple6_Impl__obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx
} // end namespace _Tuple