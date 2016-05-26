// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_thx_Enums
#include <thx/Enums.h>
#endif
#ifndef INCLUDED_thx_text_table_Border
#include <thx/text/table/Border.h>
#endif
#ifndef INCLUDED_thx_text_table_BorderStyle
#include <thx/text/table/BorderStyle.h>
#endif
#ifndef INCLUDED_thx_text_table_SymbolImpl
#include <thx/text/table/SymbolImpl.h>
#endif
#ifndef INCLUDED_thx_text_table__Canvas_Symbol_Impl_
#include <thx/text/table/_Canvas/Symbol_Impl_.h>
#endif

namespace thx{
namespace text{
namespace table{
namespace _Canvas{

void Symbol_Impl__obj::__construct() { }

Dynamic Symbol_Impl__obj::__CreateEmpty() { return new Symbol_Impl__obj; }

hx::ObjectPtr< Symbol_Impl__obj > Symbol_Impl__obj::__new()
{
	hx::ObjectPtr< Symbol_Impl__obj > _hx_result = new Symbol_Impl__obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic Symbol_Impl__obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< Symbol_Impl__obj > _hx_result = new Symbol_Impl__obj();
	_hx_result->__construct();
	return _hx_result;
}

::hx::EnumBase Symbol_Impl__obj::combine(::hx::EnumBase this1,::hx::EnumBase that){
            	HX_STACK_FRAME("thx.text.table._Canvas.Symbol_Impl_","combine",0xd1eee8f7,"thx.text.table._Canvas.Symbol_Impl_.combine","thx/text/table/Canvas.hx",375,0x1d860a4e)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(that,"that")
HXLINE( 376)		if (hx::IsNull( this1 )) {
HXLINE( 376)			return that;
            		}
HXLINE( 377)		if (hx::IsNull( that )) {
HXLINE( 377)			return this1;
            		}
HXLINE( 378)		Int _hx_tmp = ( ( ::hx::EnumBase)(this1) )->_hx_getIndex();
HXDLIN( 378)		switch((int)(_hx_tmp)){
            			case (int)0: {
HXLINE( 378)				return that;
            			}
            			break;
            			case (int)2: {
HXLINE( 378)				Int _hx_tmp1 = ( ( ::hx::EnumBase)(that) )->_hx_getIndex();
HXDLIN( 378)				switch((int)(_hx_tmp1)){
            					case (int)0: {
HXLINE( 378)						return this1;
            					}
            					break;
            					case (int)2: {
HXLINE( 380)						::hx::EnumBase _hx_tmp2 = ::thx::text::table::_Canvas::Symbol_Impl__obj::mergeBorders(this1->_hx_getObject(0).StaticCast< ::hx::EnumBase >(),that->_hx_getObject(0).StaticCast< ::hx::EnumBase >());
HXLINE( 378)						return ::thx::text::table::SymbolImpl_obj::Border(_hx_tmp2);
            					}
            					break;
            					default:{
HXLINE( 378)						return that;
            					}
            				}
            			}
            			break;
            			default:{
HXLINE( 378)				Int _hx_tmp3 = ( ( ::hx::EnumBase)(that) )->_hx_getIndex();
HXDLIN( 378)				if ((_hx_tmp3 == (int)0)) {
HXLINE( 378)					return this1;
            				}
            				else {
HXLINE( 378)					return that;
            				}
            			}
            		}
HXDLIN( 378)		return null();
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Symbol_Impl__obj,combine,return )

::hx::EnumBase Symbol_Impl__obj::mergeBorders(::hx::EnumBase b1,::hx::EnumBase b2){
            	HX_STACK_FRAME("thx.text.table._Canvas.Symbol_Impl_","mergeBorders",0x414f9cb7,"thx.text.table._Canvas.Symbol_Impl_.mergeBorders","thx/text/table/Canvas.hx",387,0x1d860a4e)
            	HX_STACK_ARG(b1,"b1")
            	HX_STACK_ARG(b2,"b2")
HXLINE( 387)		Int _hx_tmp = ( ( ::hx::EnumBase)(b1) )->_hx_getIndex();
HXDLIN( 387)		switch((int)(_hx_tmp)){
            			case (int)0: {
HXLINE( 387)				Int _hx_tmp1 = ( ( ::hx::EnumBase)(b2) )->_hx_getIndex();
HXDLIN( 387)				switch((int)(_hx_tmp1)){
            					case (int)0: {
HXLINE( 387)						return b1;
            					}
            					break;
            					case (int)1: {
HXLINE( 387)						return b2;
            					}
            					break;
            					case (int)2: {
HXLINE( 387)						return b2;
            					}
            					break;
            				}
            			}
            			break;
            			case (int)1: {
HXLINE( 387)				Int _hx_tmp2 = ( ( ::hx::EnumBase)(b2) )->_hx_getIndex();
HXDLIN( 387)				switch((int)(_hx_tmp2)){
            					case (int)0: {
HXLINE( 387)						return b1;
            					}
            					break;
            					case (int)1: {
HXLINE( 397)						HX_VARI( ::hx::EnumBase,t1) = b1->_hx_getObject(0).StaticCast< ::hx::EnumBase >();
HXDLIN( 397)						HX_VARI( ::hx::EnumBase,r1) = b1->_hx_getObject(1).StaticCast< ::hx::EnumBase >();
HXDLIN( 397)						HX_VARI_NAME( ::hx::EnumBase,b11,"b1") = b1->_hx_getObject(2).StaticCast< ::hx::EnumBase >();
HXDLIN( 397)						HX_VARI( ::hx::EnumBase,l1) = b1->_hx_getObject(3).StaticCast< ::hx::EnumBase >();
HXDLIN( 397)						HX_VARI( ::hx::EnumBase,l2) = b2->_hx_getObject(3).StaticCast< ::hx::EnumBase >();
HXDLIN( 397)						HX_VARI_NAME( ::hx::EnumBase,b21,"b2") = b2->_hx_getObject(2).StaticCast< ::hx::EnumBase >();
HXDLIN( 397)						HX_VARI( ::hx::EnumBase,r2) = b2->_hx_getObject(1).StaticCast< ::hx::EnumBase >();
HXLINE( 398)						::hx::EnumBase _hx_tmp3 = ::thx::Enums_obj::max(t1,b2->_hx_getObject(0).StaticCast< ::hx::EnumBase >());
HXDLIN( 398)						::hx::EnumBase _hx_tmp4 = ::thx::Enums_obj::max(r1,r2);
HXDLIN( 398)						::hx::EnumBase _hx_tmp5 = ::thx::Enums_obj::max(b11,b21);
HXDLIN( 398)						::hx::EnumBase _hx_tmp6 = ::thx::Enums_obj::max(l1,l2);
HXLINE( 387)						return ::thx::text::table::Border_obj::RemovableCross(_hx_tmp3,_hx_tmp4,_hx_tmp5,_hx_tmp6);
            					}
            					break;
            					case (int)2: {
HXLINE( 394)						HX_VARI_NAME( ::hx::EnumBase,t11,"t1") = b1->_hx_getObject(0).StaticCast< ::hx::EnumBase >();
HXDLIN( 394)						HX_VARI_NAME( ::hx::EnumBase,r11,"r1") = b1->_hx_getObject(1).StaticCast< ::hx::EnumBase >();
HXDLIN( 394)						HX_VARI_NAME( ::hx::EnumBase,b12,"b1") = b1->_hx_getObject(2).StaticCast< ::hx::EnumBase >();
HXDLIN( 394)						HX_VARI_NAME( ::hx::EnumBase,l11,"l1") = b1->_hx_getObject(3).StaticCast< ::hx::EnumBase >();
HXDLIN( 394)						HX_VARI_NAME( ::hx::EnumBase,l21,"l2") = b2->_hx_getObject(3).StaticCast< ::hx::EnumBase >();
HXDLIN( 394)						HX_VARI_NAME( ::hx::EnumBase,b22,"b2") = b2->_hx_getObject(2).StaticCast< ::hx::EnumBase >();
HXDLIN( 394)						HX_VARI_NAME( ::hx::EnumBase,r21,"r2") = b2->_hx_getObject(1).StaticCast< ::hx::EnumBase >();
HXLINE( 396)						::hx::EnumBase _hx_tmp7 = ::thx::Enums_obj::max(t11,b2->_hx_getObject(0).StaticCast< ::hx::EnumBase >());
HXDLIN( 396)						::hx::EnumBase _hx_tmp8 = ::thx::Enums_obj::max(r11,r21);
HXDLIN( 396)						::hx::EnumBase _hx_tmp9 = ::thx::Enums_obj::max(b12,b22);
HXDLIN( 396)						::hx::EnumBase _hx_tmp10 = ::thx::Enums_obj::max(l11,l21);
HXLINE( 387)						return ::thx::text::table::Border_obj::Cross(_hx_tmp7,_hx_tmp8,_hx_tmp9,_hx_tmp10);
            					}
            					break;
            				}
            			}
            			break;
            			case (int)2: {
HXLINE( 387)				Int _hx_tmp11 = ( ( ::hx::EnumBase)(b2) )->_hx_getIndex();
HXDLIN( 387)				switch((int)(_hx_tmp11)){
            					case (int)0: {
HXLINE( 387)						return b1;
            					}
            					break;
            					case (int)1: {
HXLINE( 395)						HX_VARI_NAME( ::hx::EnumBase,t12,"t1") = b1->_hx_getObject(0).StaticCast< ::hx::EnumBase >();
HXDLIN( 395)						HX_VARI_NAME( ::hx::EnumBase,r12,"r1") = b1->_hx_getObject(1).StaticCast< ::hx::EnumBase >();
HXDLIN( 395)						HX_VARI_NAME( ::hx::EnumBase,b13,"b1") = b1->_hx_getObject(2).StaticCast< ::hx::EnumBase >();
HXDLIN( 395)						HX_VARI_NAME( ::hx::EnumBase,l12,"l1") = b1->_hx_getObject(3).StaticCast< ::hx::EnumBase >();
HXDLIN( 395)						HX_VARI_NAME( ::hx::EnumBase,l22,"l2") = b2->_hx_getObject(3).StaticCast< ::hx::EnumBase >();
HXDLIN( 395)						HX_VARI_NAME( ::hx::EnumBase,b23,"b2") = b2->_hx_getObject(2).StaticCast< ::hx::EnumBase >();
HXDLIN( 395)						HX_VARI_NAME( ::hx::EnumBase,r22,"r2") = b2->_hx_getObject(1).StaticCast< ::hx::EnumBase >();
HXLINE( 396)						::hx::EnumBase _hx_tmp12 = ::thx::Enums_obj::max(t12,b2->_hx_getObject(0).StaticCast< ::hx::EnumBase >());
HXDLIN( 396)						::hx::EnumBase _hx_tmp13 = ::thx::Enums_obj::max(r12,r22);
HXDLIN( 396)						::hx::EnumBase _hx_tmp14 = ::thx::Enums_obj::max(b13,b23);
HXDLIN( 396)						::hx::EnumBase _hx_tmp15 = ::thx::Enums_obj::max(l12,l22);
HXLINE( 387)						return ::thx::text::table::Border_obj::Cross(_hx_tmp12,_hx_tmp13,_hx_tmp14,_hx_tmp15);
            					}
            					break;
            					case (int)2: {
HXLINE( 393)						HX_VARI_NAME( ::hx::EnumBase,t13,"t1") = b1->_hx_getObject(0).StaticCast< ::hx::EnumBase >();
HXDLIN( 393)						HX_VARI_NAME( ::hx::EnumBase,r13,"r1") = b1->_hx_getObject(1).StaticCast< ::hx::EnumBase >();
HXDLIN( 393)						HX_VARI_NAME( ::hx::EnumBase,b14,"b1") = b1->_hx_getObject(2).StaticCast< ::hx::EnumBase >();
HXDLIN( 393)						HX_VARI_NAME( ::hx::EnumBase,l13,"l1") = b1->_hx_getObject(3).StaticCast< ::hx::EnumBase >();
HXDLIN( 393)						HX_VARI_NAME( ::hx::EnumBase,l23,"l2") = b2->_hx_getObject(3).StaticCast< ::hx::EnumBase >();
HXDLIN( 393)						HX_VARI_NAME( ::hx::EnumBase,b24,"b2") = b2->_hx_getObject(2).StaticCast< ::hx::EnumBase >();
HXDLIN( 393)						HX_VARI_NAME( ::hx::EnumBase,r23,"r2") = b2->_hx_getObject(1).StaticCast< ::hx::EnumBase >();
HXLINE( 396)						::hx::EnumBase _hx_tmp16 = ::thx::Enums_obj::max(t13,b2->_hx_getObject(0).StaticCast< ::hx::EnumBase >());
HXDLIN( 396)						::hx::EnumBase _hx_tmp17 = ::thx::Enums_obj::max(r13,r23);
HXDLIN( 396)						::hx::EnumBase _hx_tmp18 = ::thx::Enums_obj::max(b14,b24);
HXDLIN( 396)						::hx::EnumBase _hx_tmp19 = ::thx::Enums_obj::max(l13,l23);
HXLINE( 387)						return ::thx::text::table::Border_obj::Cross(_hx_tmp16,_hx_tmp17,_hx_tmp18,_hx_tmp19);
            					}
            					break;
            				}
            			}
            			break;
            		}
HXDLIN( 387)		return null();
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Symbol_Impl__obj,mergeBorders,return )


Symbol_Impl__obj::Symbol_Impl__obj()
{
}

bool Symbol_Impl__obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 7:
		if (HX_FIELD_EQ(inName,"combine") ) { outValue = combine_dyn(); return true; }
		break;
	case 12:
		if (HX_FIELD_EQ(inName,"mergeBorders") ) { outValue = mergeBorders_dyn(); return true; }
	}
	return false;
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *Symbol_Impl__obj_sMemberStorageInfo = 0;
static hx::StaticInfo *Symbol_Impl__obj_sStaticStorageInfo = 0;
#endif

static void Symbol_Impl__obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(Symbol_Impl__obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void Symbol_Impl__obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(Symbol_Impl__obj::__mClass,"__mClass");
};

#endif

hx::Class Symbol_Impl__obj::__mClass;

static ::String Symbol_Impl__obj_sStaticFields[] = {
	HX_HCSTRING("combine","\x7f","\x2a","\x2e","\x7a"),
	HX_HCSTRING("mergeBorders","\x2f","\xce","\xad","\xe7"),
	::String(null())
};

void Symbol_Impl__obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.text.table._Canvas.Symbol_Impl_","\xe6","\xe6","\x75","\xaa");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &Symbol_Impl__obj::__GetStatic;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = Symbol_Impl__obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(Symbol_Impl__obj_sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< Symbol_Impl__obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = Symbol_Impl__obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = Symbol_Impl__obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = Symbol_Impl__obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx
} // end namespace text
} // end namespace table
} // end namespace _Canvas
