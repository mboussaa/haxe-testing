// Generated by Haxe 3.3.0
#include <hxcpp.h>

#include "hxMath.h"
#ifndef INCLUDED_Date
#include <Date.h>
#endif
#ifndef INCLUDED_DateTools
#include <DateTools.h>
#endif
#ifndef INCLUDED_thx_Dates
#include <thx/Dates.h>
#endif
#ifndef INCLUDED_thx_TimePeriod
#include <thx/TimePeriod.h>
#endif
#ifndef INCLUDED_thx__Timestamp_Timestamp_Impl_
#include <thx/_Timestamp/Timestamp_Impl_.h>
#endif

namespace thx{
namespace _Timestamp{

void Timestamp_Impl__obj::__construct() { }

Dynamic Timestamp_Impl__obj::__CreateEmpty() { return new Timestamp_Impl__obj; }

hx::ObjectPtr< Timestamp_Impl__obj > Timestamp_Impl__obj::__new()
{
	hx::ObjectPtr< Timestamp_Impl__obj > _hx_result = new Timestamp_Impl__obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic Timestamp_Impl__obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< Timestamp_Impl__obj > _hx_result = new Timestamp_Impl__obj();
	_hx_result->__construct();
	return _hx_result;
}

Float Timestamp_Impl__obj::create(Int year, ::Dynamic month, ::Dynamic day, ::Dynamic hour, ::Dynamic minute, ::Dynamic second){
            	HX_STACK_FRAME("thx._Timestamp.Timestamp_Impl_","create",0xdd984141,"thx._Timestamp.Timestamp_Impl_.create","thx/Timestamp.hx",24,0xbd788b73)
            	HX_STACK_ARG(year,"year")
            	HX_STACK_ARG(month,"month")
            	HX_STACK_ARG(day,"day")
            	HX_STACK_ARG(hour,"hour")
            	HX_STACK_ARG(minute,"minute")
            	HX_STACK_ARG(second,"second")
HXLINE(  24)		return ::thx::Dates_obj::create(year,month,day,hour,minute,second)->getTime();
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC6(Timestamp_Impl__obj,create,return )

Float Timestamp_Impl__obj::now(){
            	HX_STACK_FRAME("thx._Timestamp.Timestamp_Impl_","now",0x1ff211b1,"thx._Timestamp.Timestamp_Impl_.now","thx/Timestamp.hx",27,0xbd788b73)
HXLINE(  27)		HX_VARI(  ::Date,d) = ::Date_obj::now();
HXDLIN(  27)		return d->getTime();
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC0(Timestamp_Impl__obj,now,return )

Float Timestamp_Impl__obj::fromDate( ::Date d){
            	HX_STACK_FRAME("thx._Timestamp.Timestamp_Impl_","fromDate",0x1956da3d,"thx._Timestamp.Timestamp_Impl_.fromDate","thx/Timestamp.hx",30,0xbd788b73)
            	HX_STACK_ARG(d,"d")
HXLINE(  30)		return d->getTime();
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Timestamp_Impl__obj,fromDate,return )

Float Timestamp_Impl__obj::fromString(::String s){
            	HX_STACK_FRAME("thx._Timestamp.Timestamp_Impl_","fromString",0x2f180ea0,"thx._Timestamp.Timestamp_Impl_.fromString","thx/Timestamp.hx",33,0xbd788b73)
            	HX_STACK_ARG(s,"s")
HXLINE(  33)		return ::Date_obj::fromString(s)->getTime();
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Timestamp_Impl__obj,fromString,return )

 ::Date Timestamp_Impl__obj::toDate(Float this1){
            	HX_STACK_FRAME("thx._Timestamp.Timestamp_Impl_","toDate",0xd9a59b8e,"thx._Timestamp.Timestamp_Impl_.toDate","thx/Timestamp.hx",36,0xbd788b73)
            	HX_STACK_ARG(this1,"this1")
HXLINE(  36)		return ::Date_obj::fromTime(this1);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Timestamp_Impl__obj,toDate,return )

::String Timestamp_Impl__obj::toString(Float this1){
            	HX_STACK_FRAME("thx._Timestamp.Timestamp_Impl_","toString",0xb1968631,"thx._Timestamp.Timestamp_Impl_.toString","thx/Timestamp.hx",39,0xbd788b73)
            	HX_STACK_ARG(this1,"this1")
HXLINE(  39)		return ::Date_obj::fromTime(this1)->toString();
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Timestamp_Impl__obj,toString,return )

Float Timestamp_Impl__obj::snapNext(Float this1,::hx::EnumBase period){
            	HX_STACK_FRAME("thx._Timestamp.Timestamp_Impl_","snapNext",0x8264a9e2,"thx._Timestamp.Timestamp_Impl_.snapNext","thx/Timestamp.hx",49,0xbd788b73)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(period,"period")
HXLINE(  49)		Int _hx_tmp = ( ( ::hx::EnumBase)(period) )->_hx_getIndex();
HXDLIN(  49)		switch((int)(_hx_tmp)){
            			case (int)0: {
HXLINE(  51)				Float _hx_tmp1 = ::Math_obj::fceil(((Float)this1 / (Float)((Float)1000.0)));
HXLINE(  49)				return (_hx_tmp1 * ((Float)1000.0));
            			}
            			break;
            			case (int)1: {
HXLINE(  53)				Float _hx_tmp2 = ::Math_obj::fceil(((Float)this1 / (Float)((Float)60000.0)));
HXLINE(  49)				return (_hx_tmp2 * ((Float)60000.0));
            			}
            			break;
            			case (int)2: {
HXLINE(  55)				Float _hx_tmp3 = ::Math_obj::fceil(((Float)this1 / (Float)((Float)3600000.0)));
HXLINE(  49)				return (_hx_tmp3 * ((Float)3600000.0));
            			}
            			break;
            			case (int)3: {
HXLINE(  57)				HX_VARI(  ::Date,d) = ::Date_obj::fromTime(this1);
HXLINE(  58)				HX_VARI( Int,year) = d->getFullYear();
HXDLIN(  58)				HX_VARI(  ::Dynamic,month) = d->getMonth();
HXDLIN(  58)				Int _hx_tmp4 = d->getDate();
HXLINE(  49)				return ::thx::Dates_obj::create(year,month,(_hx_tmp4 + (int)1),(int)0,(int)0,(int)0)->getTime();
            			}
            			break;
            			case (int)4: {
HXLINE(  60)				HX_VARI_NAME(  ::Date,d1,"d") = ::Date_obj::fromTime(this1);
HXDLIN(  60)				HX_VARI( Int,wd) = d1->getDay();
HXLINE(  62)				HX_VARI_NAME( Int,year1,"year") = d1->getFullYear();
HXDLIN(  62)				HX_VARI_NAME(  ::Dynamic,month1,"month") = d1->getMonth();
HXDLIN(  62)				Int _hx_tmp5 = d1->getDate();
HXLINE(  49)				return ::thx::Dates_obj::create(year1,month1,((_hx_tmp5 + (int)7) - wd),(int)0,(int)0,(int)0)->getTime();
            			}
            			break;
            			case (int)5: {
HXLINE(  64)				HX_VARI_NAME(  ::Date,d2,"d") = ::Date_obj::fromTime(this1);
HXLINE(  65)				HX_VARI_NAME( Int,year2,"year") = d2->getFullYear();
HXDLIN(  65)				Int _hx_tmp6 = d2->getMonth();
HXLINE(  49)				return ::thx::Dates_obj::create(year2,(_hx_tmp6 + (int)1),(int)1,(int)0,(int)0,(int)0)->getTime();
            			}
            			break;
            			case (int)6: {
HXLINE(  67)				HX_VARI_NAME(  ::Date,d3,"d") = ::Date_obj::fromTime(this1);
HXLINE(  68)				Int _hx_tmp7 = d3->getFullYear();
HXLINE(  49)				return ::thx::Dates_obj::create((_hx_tmp7 + (int)1),(int)0,(int)1,(int)0,(int)0,(int)0)->getTime();
            			}
            			break;
            		}
HXDLIN(  49)		return null();
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Timestamp_Impl__obj,snapNext,return )

Float Timestamp_Impl__obj::snapPrev(Float this1,::hx::EnumBase period){
            	HX_STACK_FRAME("thx._Timestamp.Timestamp_Impl_","snapPrev",0x83c0e3e2,"thx._Timestamp.Timestamp_Impl_.snapPrev","thx/Timestamp.hx",79,0xbd788b73)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(period,"period")
HXLINE(  79)		Int _hx_tmp = ( ( ::hx::EnumBase)(period) )->_hx_getIndex();
HXDLIN(  79)		switch((int)(_hx_tmp)){
            			case (int)0: {
HXLINE(  81)				Float _hx_tmp1 = ::Math_obj::ffloor(((Float)this1 / (Float)((Float)1000.0)));
HXLINE(  79)				return (_hx_tmp1 * ((Float)1000.0));
            			}
            			break;
            			case (int)1: {
HXLINE(  83)				Float _hx_tmp2 = ::Math_obj::ffloor(((Float)this1 / (Float)((Float)60000.0)));
HXLINE(  79)				return (_hx_tmp2 * ((Float)60000.0));
            			}
            			break;
            			case (int)2: {
HXLINE(  85)				Float _hx_tmp3 = ::Math_obj::ffloor(((Float)this1 / (Float)((Float)3600000.0)));
HXLINE(  79)				return (_hx_tmp3 * ((Float)3600000.0));
            			}
            			break;
            			case (int)3: {
HXLINE(  87)				HX_VARI(  ::Date,d) = ::Date_obj::fromTime(this1);
HXLINE(  88)				HX_VARI( Int,year) = d->getFullYear();
HXDLIN(  88)				HX_VARI(  ::Dynamic,month) = d->getMonth();
HXDLIN(  88)				HX_VARI(  ::Dynamic,day) = d->getDate();
HXLINE(  79)				return ::thx::Dates_obj::create(year,month,day,(int)0,(int)0,(int)0)->getTime();
            			}
            			break;
            			case (int)4: {
HXLINE(  90)				HX_VARI_NAME(  ::Date,d1,"d") = ::Date_obj::fromTime(this1);
HXDLIN(  90)				HX_VARI( Int,wd) = d1->getDay();
HXLINE(  92)				HX_VARI_NAME( Int,year1,"year") = d1->getFullYear();
HXDLIN(  92)				HX_VARI_NAME(  ::Dynamic,month1,"month") = d1->getMonth();
HXDLIN(  92)				Int _hx_tmp4 = d1->getDate();
HXLINE(  79)				return ::thx::Dates_obj::create(year1,month1,(_hx_tmp4 - wd),(int)0,(int)0,(int)0)->getTime();
            			}
            			break;
            			case (int)5: {
HXLINE(  94)				HX_VARI_NAME(  ::Date,d2,"d") = ::Date_obj::fromTime(this1);
HXLINE(  95)				HX_VARI_NAME( Int,year2,"year") = d2->getFullYear();
HXDLIN(  95)				HX_VARI_NAME(  ::Dynamic,month2,"month") = d2->getMonth();
HXLINE(  79)				return ::thx::Dates_obj::create(year2,month2,(int)1,(int)0,(int)0,(int)0)->getTime();
            			}
            			break;
            			case (int)6: {
HXLINE(  97)				HX_VARI_NAME(  ::Date,d3,"d") = ::Date_obj::fromTime(this1);
HXLINE(  98)				HX_VARI_NAME( Int,year3,"year") = d3->getFullYear();
HXLINE(  79)				return ::thx::Dates_obj::create(year3,(int)0,(int)1,(int)0,(int)0,(int)0)->getTime();
            			}
            			break;
            		}
HXDLIN(  79)		return null();
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Timestamp_Impl__obj,snapPrev,return )

Float Timestamp_Impl__obj::snapTo(Float this1,::hx::EnumBase period){
            	HX_STACK_FRAME("thx._Timestamp.Timestamp_Impl_","snapTo",0xf31a20aa,"thx._Timestamp.Timestamp_Impl_.snapTo","thx/Timestamp.hx",107,0xbd788b73)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(period,"period")
HXLINE( 107)		Int _hx_tmp = ( ( ::hx::EnumBase)(period) )->_hx_getIndex();
HXDLIN( 107)		switch((int)(_hx_tmp)){
            			case (int)0: {
HXLINE( 109)				Float _hx_tmp1 = ::Math_obj::fround(((Float)this1 / (Float)((Float)1000.0)));
HXLINE( 107)				return (_hx_tmp1 * ((Float)1000.0));
            			}
            			break;
            			case (int)1: {
HXLINE( 111)				Float _hx_tmp2 = ::Math_obj::fround(((Float)this1 / (Float)((Float)60000.0)));
HXLINE( 107)				return (_hx_tmp2 * ((Float)60000.0));
            			}
            			break;
            			case (int)2: {
HXLINE( 113)				Float _hx_tmp3 = ::Math_obj::fround(((Float)this1 / (Float)((Float)3600000.0)));
HXLINE( 107)				return (_hx_tmp3 * ((Float)3600000.0));
            			}
            			break;
            			case (int)3: {
HXLINE( 115)				HX_VARI(  ::Date,d) = ::Date_obj::fromTime(this1);
HXDLIN( 115)				HX_VAR( Int,mod);
HXLINE( 116)				Int _hx_tmp4 = d->getHours();
HXDLIN( 116)				if ((_hx_tmp4 >= (int)12)) {
HXLINE( 115)					mod = (int)1;
            				}
            				else {
HXLINE( 115)					mod = (int)0;
            				}
HXLINE( 117)				HX_VARI( Int,year) = d->getFullYear();
HXDLIN( 117)				HX_VARI(  ::Dynamic,month) = d->getMonth();
HXDLIN( 117)				Int _hx_tmp5 = d->getDate();
HXLINE( 107)				return ::thx::Dates_obj::create(year,month,(_hx_tmp5 + mod),(int)0,(int)0,(int)0)->getTime();
            			}
            			break;
            			case (int)4: {
HXLINE( 119)				HX_VARI_NAME(  ::Date,d1,"d") = ::Date_obj::fromTime(this1);
HXDLIN( 119)				HX_VARI( Int,wd) = d1->getDay();
HXDLIN( 119)				HX_VAR_NAME( Int,mod1,"mod");
HXLINE( 121)				if ((wd < (int)3)) {
HXLINE( 119)					mod1 = -(wd);
            				}
            				else {
HXLINE( 121)					if ((wd > (int)3)) {
HXLINE( 119)						mod1 = ((int)7 - wd);
            					}
            					else {
HXLINE( 121)						Int _hx_tmp6 = d1->getHours();
HXDLIN( 121)						if ((_hx_tmp6 < (int)12)) {
HXLINE( 119)							mod1 = -(wd);
            						}
            						else {
HXLINE( 119)							mod1 = ((int)7 - wd);
            						}
            					}
            				}
HXLINE( 122)				HX_VARI_NAME( Int,year1,"year") = d1->getFullYear();
HXDLIN( 122)				HX_VARI_NAME(  ::Dynamic,month1,"month") = d1->getMonth();
HXDLIN( 122)				Int _hx_tmp7 = d1->getDate();
HXLINE( 107)				return ::thx::Dates_obj::create(year1,month1,(_hx_tmp7 + mod1),(int)0,(int)0,(int)0)->getTime();
            			}
            			break;
            			case (int)5: {
HXLINE( 124)				HX_VARI_NAME(  ::Date,d2,"d") = ::Date_obj::fromTime(this1);
HXDLIN( 124)				HX_VAR_NAME( Int,mod2,"mod");
HXLINE( 125)				Int _hx_tmp8 = d2->getDate();
HXDLIN( 125)				Int _hx_tmp9 = ::DateTools_obj::getMonthDays(d2);
HXDLIN( 125)				Int _hx_tmp10 = ::Math_obj::round(((Float)_hx_tmp9 / (Float)(int)2));
HXDLIN( 125)				if ((_hx_tmp8 > _hx_tmp10)) {
HXLINE( 124)					mod2 = (int)1;
            				}
            				else {
HXLINE( 124)					mod2 = (int)0;
            				}
HXLINE( 126)				HX_VARI_NAME( Int,year2,"year") = d2->getFullYear();
HXDLIN( 126)				Int _hx_tmp11 = d2->getMonth();
HXLINE( 107)				return ::thx::Dates_obj::create(year2,(_hx_tmp11 + mod2),(int)1,(int)0,(int)0,(int)0)->getTime();
            			}
            			break;
            			case (int)6: {
HXLINE( 128)				HX_VARI_NAME(  ::Date,d3,"d") = ::Date_obj::fromTime(this1);
HXDLIN( 128)				HX_VAR_NAME( Int,mod3,"mod");
HXLINE( 129)				Int _hx_tmp12 = d3->getFullYear();
HXDLIN( 129)				Float _hx_tmp13 =  ::Date_obj::__new(_hx_tmp12,(int)6,(int)2,(int)0,(int)0,(int)0)->getTime();
HXDLIN( 129)				if ((this1 > _hx_tmp13)) {
HXLINE( 128)					mod3 = (int)1;
            				}
            				else {
HXLINE( 128)					mod3 = (int)0;
            				}
HXLINE( 130)				Int _hx_tmp14 = d3->getFullYear();
HXLINE( 107)				return ::thx::Dates_obj::create((_hx_tmp14 + mod3),(int)0,(int)1,(int)0,(int)0,(int)0)->getTime();
            			}
            			break;
            		}
HXDLIN( 107)		return null();
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Timestamp_Impl__obj,snapTo,return )

Float Timestamp_Impl__obj::r(Float t,Float v){
            	HX_STACK_FRAME("thx._Timestamp.Timestamp_Impl_","r",0xf44f4c4d,"thx._Timestamp.Timestamp_Impl_.r","thx/Timestamp.hx",134,0xbd788b73)
            	HX_STACK_ARG(t,"t")
            	HX_STACK_ARG(v,"v")
HXLINE( 134)		Float _hx_tmp = ::Math_obj::fround(((Float)t / (Float)v));
HXDLIN( 134)		return (_hx_tmp * v);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Timestamp_Impl__obj,r,return )

Float Timestamp_Impl__obj::f(Float t,Float v){
            	HX_STACK_FRAME("thx._Timestamp.Timestamp_Impl_","f",0xf44f4c41,"thx._Timestamp.Timestamp_Impl_.f","thx/Timestamp.hx",136,0xbd788b73)
            	HX_STACK_ARG(t,"t")
            	HX_STACK_ARG(v,"v")
HXLINE( 136)		Float _hx_tmp = ::Math_obj::ffloor(((Float)t / (Float)v));
HXDLIN( 136)		return (_hx_tmp * v);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Timestamp_Impl__obj,f,return )

Float Timestamp_Impl__obj::c(Float t,Float v){
            	HX_STACK_FRAME("thx._Timestamp.Timestamp_Impl_","c",0xf44f4c3e,"thx._Timestamp.Timestamp_Impl_.c","thx/Timestamp.hx",138,0xbd788b73)
            	HX_STACK_ARG(t,"t")
            	HX_STACK_ARG(v,"v")
HXLINE( 138)		Float _hx_tmp = ::Math_obj::fceil(((Float)t / (Float)v));
HXDLIN( 138)		return (_hx_tmp * v);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Timestamp_Impl__obj,c,return )


Timestamp_Impl__obj::Timestamp_Impl__obj()
{
}

bool Timestamp_Impl__obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 1:
		if (HX_FIELD_EQ(inName,"r") ) { outValue = r_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"f") ) { outValue = f_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"c") ) { outValue = c_dyn(); return true; }
		break;
	case 3:
		if (HX_FIELD_EQ(inName,"now") ) { outValue = now_dyn(); return true; }
		break;
	case 6:
		if (HX_FIELD_EQ(inName,"create") ) { outValue = create_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"toDate") ) { outValue = toDate_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"snapTo") ) { outValue = snapTo_dyn(); return true; }
		break;
	case 8:
		if (HX_FIELD_EQ(inName,"fromDate") ) { outValue = fromDate_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"toString") ) { outValue = toString_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"snapNext") ) { outValue = snapNext_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"snapPrev") ) { outValue = snapPrev_dyn(); return true; }
		break;
	case 10:
		if (HX_FIELD_EQ(inName,"fromString") ) { outValue = fromString_dyn(); return true; }
	}
	return false;
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *Timestamp_Impl__obj_sMemberStorageInfo = 0;
static hx::StaticInfo *Timestamp_Impl__obj_sStaticStorageInfo = 0;
#endif

static void Timestamp_Impl__obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(Timestamp_Impl__obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void Timestamp_Impl__obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(Timestamp_Impl__obj::__mClass,"__mClass");
};

#endif

hx::Class Timestamp_Impl__obj::__mClass;

static ::String Timestamp_Impl__obj_sStaticFields[] = {
	HX_HCSTRING("create","\xfc","\x66","\x0f","\x7c"),
	HX_HCSTRING("now","\x16","\xd9","\x53","\x00"),
	HX_HCSTRING("fromDate","\xb8","\x24","\x2f","\xa0"),
	HX_HCSTRING("fromString","\xdb","\x2d","\x74","\x54"),
	HX_HCSTRING("toDate","\x49","\xc1","\x1c","\x78"),
	HX_HCSTRING("toString","\xac","\xd0","\x6e","\x38"),
	HX_HCSTRING("snapNext","\x5d","\xf4","\x3c","\x09"),
	HX_HCSTRING("snapPrev","\x5d","\x2e","\x99","\x0a"),
	HX_HCSTRING("snapTo","\x65","\x46","\x91","\x91"),
	HX_HCSTRING("r","\x72","\x00","\x00","\x00"),
	HX_HCSTRING("f","\x66","\x00","\x00","\x00"),
	HX_HCSTRING("c","\x63","\x00","\x00","\x00"),
	::String(null())
};

void Timestamp_Impl__obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx._Timestamp.Timestamp_Impl_","\x89","\x6f","\x6d","\x6a");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &Timestamp_Impl__obj::__GetStatic;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = Timestamp_Impl__obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(Timestamp_Impl__obj_sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< Timestamp_Impl__obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = Timestamp_Impl__obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = Timestamp_Impl__obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = Timestamp_Impl__obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx
} // end namespace _Timestamp
