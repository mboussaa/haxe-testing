// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_thx_color_TestTemperature
#include <thx/color/TestTemperature.h>
#endif
#ifndef INCLUDED_thx_color__Temperature_Temperature_Impl_
#include <thx/color/_Temperature/Temperature_Impl_.h>
#endif
#ifndef INCLUDED_utest_Assert
#include <utest/Assert.h>
#endif

namespace thx{
namespace color{

void TestTemperature_obj::__construct(Int i){
            	HX_STACK_FRAME("thx.color.TestTemperature","new",0x2dbfcfdf,"thx.color.TestTemperature.new","thx/color/TestTemperature.hx",8,0xf5075fb3)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(i,"i")
HXLINE(   8)		this->x = i;
            	}

Dynamic TestTemperature_obj::__CreateEmpty() { return new TestTemperature_obj; }

hx::ObjectPtr< TestTemperature_obj > TestTemperature_obj::__new(Int i)
{
	hx::ObjectPtr< TestTemperature_obj > _hx_result = new TestTemperature_obj();
	_hx_result->__construct(i);
	return _hx_result;
}

Dynamic TestTemperature_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< TestTemperature_obj > _hx_result = new TestTemperature_obj();
	_hx_result->__construct(inArgs[0]);
	return _hx_result;
}

void TestTemperature_obj::testBasics(){
            	HX_STACK_FRAME("thx.color.TestTemperature","testBasics",0x33c7f258,"thx.color.TestTemperature.testBasics","thx/color/TestTemperature.hx",12,0xf5075fb3)
            	HX_STACK_THIS(this)
HXLINE(  12)		HX_VARI( Int,_g1) = (int)0;
HXDLIN(  12)		HX_VARI( Int,_g) = this->x;
HXDLIN(  12)		while((_g1 < _g)){
HXLINE(  12)			++_g1;
HXLINE(  13)			HX_VARI_NAME( Float,this1,"this") = (int)5000;
HXLINE(  14)			::utest::Assert_obj::equals((int)5000,this1,null(),hx::SourceInfo(HX_("TestTemperature.hx",1c,d3,52,74),14,HX_("thx.color.TestTemperature",6d,f4,cc,30),HX_("testBasics",f7,73,1f,6e)));
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestTemperature_obj,testBasics,(void))

void TestTemperature_obj::testStrings(){
            	HX_STACK_FRAME("thx.color.TestTemperature","testStrings",0xe38292cf,"thx.color.TestTemperature.testStrings","thx/color/TestTemperature.hx",18,0xf5075fb3)
            	HX_STACK_THIS(this)
HXLINE(  18)		HX_VARI( Int,_g1) = (int)0;
HXDLIN(  18)		HX_VARI( Int,_g) = this->x;
HXDLIN(  18)		while((_g1 < _g)){
HXLINE(  18)			++_g1;
HXLINE(  19)			HX_VARI_NAME( Float,this1,"this") = (int)5000;
HXLINE(  20)			::utest::Assert_obj::equals(HX_("temperature(5000)",ba,d4,cd,34),::thx::color::_Temperature::Temperature_Impl__obj::toString(this1),null(),hx::SourceInfo(HX_("TestTemperature.hx",1c,d3,52,74),20,HX_("thx.color.TestTemperature",6d,f4,cc,30),HX_("testStrings",50,7c,bc,b5)));
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestTemperature_obj,testStrings,(void))

void TestTemperature_obj::testFromString(){
            	HX_STACK_FRAME("thx.color.TestTemperature","testFromString",0x050517ae,"thx.color.TestTemperature.testFromString","thx/color/TestTemperature.hx",24,0xf5075fb3)
            	HX_STACK_THIS(this)
HXLINE(  24)		HX_VARI( Int,_g1) = (int)0;
HXDLIN(  24)		HX_VARI( Int,_g) = this->x;
HXDLIN(  24)		while((_g1 < _g)){
HXLINE(  24)			++_g1;
HXLINE(  25)			HX_VARI_NAME( Float,this1,"this") = (int)5000;
HXDLIN(  25)			Bool _hx_tmp = ::thx::color::_Temperature::Temperature_Impl__obj::equals(this1,::thx::color::_Temperature::Temperature_Impl__obj::fromString(HX_("temperature(5000)",ba,d4,cd,34)));
HXDLIN(  25)			::utest::Assert_obj::isTrue(_hx_tmp,null(),hx::SourceInfo(HX_("TestTemperature.hx",1c,d3,52,74),25,HX_("thx.color.TestTemperature",6d,f4,cc,30),HX_("testFromString",cd,54,67,f4)));
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestTemperature_obj,testFromString,(void))


TestTemperature_obj::TestTemperature_obj()
{
}

hx::Val TestTemperature_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 1:
		if (HX_FIELD_EQ(inName,"x") ) { return hx::Val( x); }
		break;
	case 10:
		if (HX_FIELD_EQ(inName,"testBasics") ) { return hx::Val( testBasics_dyn()); }
		break;
	case 11:
		if (HX_FIELD_EQ(inName,"testStrings") ) { return hx::Val( testStrings_dyn()); }
		break;
	case 14:
		if (HX_FIELD_EQ(inName,"testFromString") ) { return hx::Val( testFromString_dyn()); }
	}
	return super::__Field(inName,inCallProp);
}

hx::Val TestTemperature_obj::__SetField(const ::String &inName,const hx::Val &inValue,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 1:
		if (HX_FIELD_EQ(inName,"x") ) { x=inValue.Cast< Int >(); return inValue; }
	}
	return super::__SetField(inName,inValue,inCallProp);
}

void TestTemperature_obj::__GetFields(Array< ::String> &outFields)
{
	outFields->push(HX_HCSTRING("x","\x78","\x00","\x00","\x00"));
	super::__GetFields(outFields);
};

#if HXCPP_SCRIPTABLE
static hx::StorageInfo TestTemperature_obj_sMemberStorageInfo[] = {
	{hx::fsInt,(int)offsetof(TestTemperature_obj,x),HX_HCSTRING("x","\x78","\x00","\x00","\x00")},
	{ hx::fsUnknown, 0, null()}
};
static hx::StaticInfo *TestTemperature_obj_sStaticStorageInfo = 0;
#endif

static ::String TestTemperature_obj_sMemberFields[] = {
	HX_HCSTRING("x","\x78","\x00","\x00","\x00"),
	HX_HCSTRING("testBasics","\xf7","\x73","\x1f","\x6e"),
	HX_HCSTRING("testStrings","\x50","\x7c","\xbc","\xb5"),
	HX_HCSTRING("testFromString","\xcd","\x54","\x67","\xf4"),
	::String(null()) };

static void TestTemperature_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(TestTemperature_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void TestTemperature_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(TestTemperature_obj::__mClass,"__mClass");
};

#endif

hx::Class TestTemperature_obj::__mClass;

void TestTemperature_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.color.TestTemperature","\x6d","\xf4","\xcc","\x30");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &hx::Class_obj::GetNoStaticField;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = TestTemperature_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(0 /* sStaticFields */);
	__mClass->mMembers = hx::Class_obj::dupFunctions(TestTemperature_obj_sMemberFields);
	__mClass->mCanCast = hx::TCanCast< TestTemperature_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = TestTemperature_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = TestTemperature_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = TestTemperature_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx
} // end namespace color