// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_thx_color_TestRgbx
#include <thx/color/TestRgbx.h>
#endif
#ifndef INCLUDED_thx_color__Rgbx_Rgbx_Impl_
#include <thx/color/_Rgbx/Rgbx_Impl_.h>
#endif
#ifndef INCLUDED_thx_color__Rgbxa_Rgbxa_Impl_
#include <thx/color/_Rgbxa/Rgbxa_Impl_.h>
#endif
#ifndef INCLUDED_utest_Assert
#include <utest/Assert.h>
#endif

namespace thx{
namespace color{

void TestRgbx_obj::__construct(Int i){
            	HX_STACK_FRAME("thx.color.TestRgbx","new",0x9cae8564,"thx.color.TestRgbx.new","thx/color/TestRgbx.hx",9,0x51658f0a)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(i,"i")
HXLINE(   9)		this->x = i;
            	}

Dynamic TestRgbx_obj::__CreateEmpty() { return new TestRgbx_obj; }

hx::ObjectPtr< TestRgbx_obj > TestRgbx_obj::__new(Int i)
{
	hx::ObjectPtr< TestRgbx_obj > _hx_result = new TestRgbx_obj();
	_hx_result->__construct(i);
	return _hx_result;
}

Dynamic TestRgbx_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< TestRgbx_obj > _hx_result = new TestRgbx_obj();
	_hx_result->__construct(inArgs[0]);
	return _hx_result;
}

void TestRgbx_obj::testBasics(){
            	HX_STACK_FRAME("thx.color.TestRgbx","testBasics",0x007f2773,"thx.color.TestRgbx.testBasics","thx/color/TestRgbx.hx",13,0x51658f0a)
            	HX_STACK_THIS(this)
HXLINE(  13)		HX_VARI( Int,_g1) = (int)0;
HXDLIN(  13)		HX_VARI( Int,_g) = this->x;
HXDLIN(  13)		while((_g1 < _g)){
HXLINE(  13)			++_g1;
HXLINE(  14)			HX_VARI( ::Array< Float >,red) = ::Array_obj< Float >::__new(3)->init(0,(int)1)->init(1,(int)0)->init(2,(int)0);
HXLINE(  15)			Int _hx_tmp = ::thx::color::_Rgbx::Rgbx_Impl__obj::get_red(red);
HXDLIN(  15)			::utest::Assert_obj::equals((int)255,_hx_tmp,null(),hx::SourceInfo(HX_("TestRgbx.hx",81,48,06,11),15,HX_("thx.color.TestRgbx",72,43,e7,81),HX_("testBasics",f7,73,1f,6e)));
HXLINE(  16)			Int _hx_tmp1 = ::thx::color::_Rgbx::Rgbx_Impl__obj::get_green(red);
HXDLIN(  16)			::utest::Assert_obj::equals((int)0,_hx_tmp1,null(),hx::SourceInfo(HX_("TestRgbx.hx",81,48,06,11),16,HX_("thx.color.TestRgbx",72,43,e7,81),HX_("testBasics",f7,73,1f,6e)));
HXLINE(  17)			Int _hx_tmp2 = ::thx::color::_Rgbx::Rgbx_Impl__obj::get_blue(red);
HXDLIN(  17)			::utest::Assert_obj::equals((int)0,_hx_tmp2,null(),hx::SourceInfo(HX_("TestRgbx.hx",81,48,06,11),17,HX_("thx.color.TestRgbx",72,43,e7,81),HX_("testBasics",f7,73,1f,6e)));
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestRgbx_obj,testBasics,(void))

void TestRgbx_obj::testStrings(){
            	HX_STACK_FRAME("thx.color.TestRgbx","testStrings",0x3719d554,"thx.color.TestRgbx.testStrings","thx/color/TestRgbx.hx",21,0x51658f0a)
            	HX_STACK_THIS(this)
HXLINE(  21)		HX_VARI( Int,_g1) = (int)0;
HXDLIN(  21)		HX_VARI( Int,_g) = this->x;
HXDLIN(  21)		while((_g1 < _g)){
HXLINE(  21)			++_g1;
HXLINE(  22)			HX_VARI( ::Array< Float >,color) = ::Array_obj< Float >::__new(3)->init(0,(int)0)->init(1,(int)0)->init(2,(int)1);
HXLINE(  23)			::utest::Assert_obj::equals(HX_("rgb(0%,0%,100%)",1a,fe,9c,85),::thx::color::_Rgbx::Rgbx_Impl__obj::toCss3(color),null(),hx::SourceInfo(HX_("TestRgbx.hx",81,48,06,11),23,HX_("thx.color.TestRgbx",72,43,e7,81),HX_("testStrings",50,7c,bc,b5)));
HXLINE(  24)			::String _hx_tmp = ::thx::color::_Rgbx::Rgbx_Impl__obj::toHex(color,null());
HXDLIN(  24)			::utest::Assert_obj::equals(HX_("#0000FF",a3,4d,ab,a3),_hx_tmp,null(),hx::SourceInfo(HX_("TestRgbx.hx",81,48,06,11),24,HX_("thx.color.TestRgbx",72,43,e7,81),HX_("testStrings",50,7c,bc,b5)));
HXLINE(  25)			::utest::Assert_obj::equals(HX_("rgb(0%,0%,100%)",1a,fe,9c,85),::thx::color::_Rgbx::Rgbx_Impl__obj::toString(color),null(),hx::SourceInfo(HX_("TestRgbx.hx",81,48,06,11),25,HX_("thx.color.TestRgbx",72,43,e7,81),HX_("testStrings",50,7c,bc,b5)));
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestRgbx_obj,testStrings,(void))

void TestRgbx_obj::testFromString(){
            	HX_STACK_FRAME("thx.color.TestRgbx","testFromString",0xc1cc7649,"thx.color.TestRgbx.testFromString","thx/color/TestRgbx.hx",29,0x51658f0a)
            	HX_STACK_THIS(this)
HXLINE(  29)		HX_VARI( Int,_g1) = (int)0;
HXDLIN(  29)		HX_VARI( Int,_g) = this->x;
HXDLIN(  29)		while((_g1 < _g)){
HXLINE(  29)			++_g1;
HXLINE(  30)			Bool _hx_tmp = ::thx::color::_Rgbx::Rgbx_Impl__obj::equals(::Array_obj< Float >::__new(3)->init(0,(int)0)->init(1,(int)1)->init(2,(int)0),::thx::color::_Rgbx::Rgbx_Impl__obj::fromString(HX_("#00ff00",a3,b9,85,c7)));
HXDLIN(  30)			::utest::Assert_obj::isTrue(_hx_tmp,null(),hx::SourceInfo(HX_("TestRgbx.hx",81,48,06,11),30,HX_("thx.color.TestRgbx",72,43,e7,81),HX_("testFromString",cd,54,67,f4)));
HXLINE(  31)			Bool _hx_tmp1 = ::thx::color::_Rgbx::Rgbx_Impl__obj::equals(::Array_obj< Float >::__new(3)->init(0,(int)0)->init(1,(int)1)->init(2,(int)0),::thx::color::_Rgbx::Rgbx_Impl__obj::fromString(HX_("#0f0",f7,3c,47,17)));
HXDLIN(  31)			::utest::Assert_obj::isTrue(_hx_tmp1,null(),hx::SourceInfo(HX_("TestRgbx.hx",81,48,06,11),31,HX_("thx.color.TestRgbx",72,43,e7,81),HX_("testFromString",cd,54,67,f4)));
HXLINE(  32)			Bool _hx_tmp2 = ::thx::color::_Rgbx::Rgbx_Impl__obj::equals(::Array_obj< Float >::__new(3)->init(0,(int)0)->init(1,(int)1)->init(2,(int)0),::thx::color::_Rgbx::Rgbx_Impl__obj::fromString(HX_("rgb(0,100%,0)",ba,6c,03,29)));
HXDLIN(  32)			::utest::Assert_obj::isTrue(_hx_tmp2,null(),hx::SourceInfo(HX_("TestRgbx.hx",81,48,06,11),32,HX_("thx.color.TestRgbx",72,43,e7,81),HX_("testFromString",cd,54,67,f4)));
HXLINE(  33)			Bool _hx_tmp3 = ::thx::color::_Rgbx::Rgbx_Impl__obj::equals(::Array_obj< Float >::__new(3)->init(0,(int)0)->init(1,(int)1)->init(2,(int)0),::thx::color::_Rgbx::Rgbx_Impl__obj::fromString(HX_("rgb(0,255,0)",ca,b7,5a,37)));
HXDLIN(  33)			::utest::Assert_obj::isTrue(_hx_tmp3,null(),hx::SourceInfo(HX_("TestRgbx.hx",81,48,06,11),33,HX_("thx.color.TestRgbx",72,43,e7,81),HX_("testFromString",cd,54,67,f4)));
HXLINE(  34)			Bool _hx_tmp4 = ::thx::color::_Rgbxa::Rgbxa_Impl__obj::equals(::Array_obj< Float >::__new(4)->init(0,(int)0)->init(1,(int)1)->init(2,(int)0)->init(3,(int)1),::thx::color::_Rgbxa::Rgbxa_Impl__obj::fromString(HX_("#ff00ff00",a3,a1,be,4a)));
HXDLIN(  34)			::utest::Assert_obj::isTrue(_hx_tmp4,null(),hx::SourceInfo(HX_("TestRgbx.hx",81,48,06,11),34,HX_("thx.color.TestRgbx",72,43,e7,81),HX_("testFromString",cd,54,67,f4)));
HXLINE(  35)			Bool _hx_tmp5 = ::thx::color::_Rgbxa::Rgbxa_Impl__obj::equals(::Array_obj< Float >::__new(4)->init(0,(int)0)->init(1,(int)1)->init(2,(int)0)->init(3,(int)1),::thx::color::_Rgbxa::Rgbxa_Impl__obj::fromString(HX_("#f0f0",37,d6,96,6a)));
HXDLIN(  35)			::utest::Assert_obj::isTrue(_hx_tmp5,null(),hx::SourceInfo(HX_("TestRgbx.hx",81,48,06,11),35,HX_("thx.color.TestRgbx",72,43,e7,81),HX_("testFromString",cd,54,67,f4)));
HXLINE(  36)			Bool _hx_tmp6 = ::thx::color::_Rgbxa::Rgbxa_Impl__obj::equals(::Array_obj< Float >::__new(4)->init(0,(int)0)->init(1,(int)1)->init(2,(int)0)->init(3,((Float)0.5)),::thx::color::_Rgbxa::Rgbxa_Impl__obj::fromString(HX_("rgba(0,255,0,50%)",c5,4b,be,82)));
HXDLIN(  36)			::utest::Assert_obj::isTrue(_hx_tmp6,null(),hx::SourceInfo(HX_("TestRgbx.hx",81,48,06,11),36,HX_("thx.color.TestRgbx",72,43,e7,81),HX_("testFromString",cd,54,67,f4)));
HXLINE(  37)			Bool _hx_tmp7 = ::thx::color::_Rgbxa::Rgbxa_Impl__obj::equals(::Array_obj< Float >::__new(4)->init(0,(int)0)->init(1,(int)1)->init(2,(int)0)->init(3,((Float)0.5)),::thx::color::_Rgbxa::Rgbxa_Impl__obj::fromString(HX_("rgba(0,100%,0,0.5)",f6,4e,dc,b6)));
HXDLIN(  37)			::utest::Assert_obj::isTrue(_hx_tmp7,null(),hx::SourceInfo(HX_("TestRgbx.hx",81,48,06,11),37,HX_("thx.color.TestRgbx",72,43,e7,81),HX_("testFromString",cd,54,67,f4)));
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestRgbx_obj,testFromString,(void))


TestRgbx_obj::TestRgbx_obj()
{
}

hx::Val TestRgbx_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
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

hx::Val TestRgbx_obj::__SetField(const ::String &inName,const hx::Val &inValue,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 1:
		if (HX_FIELD_EQ(inName,"x") ) { x=inValue.Cast< Int >(); return inValue; }
	}
	return super::__SetField(inName,inValue,inCallProp);
}

void TestRgbx_obj::__GetFields(Array< ::String> &outFields)
{
	outFields->push(HX_HCSTRING("x","\x78","\x00","\x00","\x00"));
	super::__GetFields(outFields);
};

#if HXCPP_SCRIPTABLE
static hx::StorageInfo TestRgbx_obj_sMemberStorageInfo[] = {
	{hx::fsInt,(int)offsetof(TestRgbx_obj,x),HX_HCSTRING("x","\x78","\x00","\x00","\x00")},
	{ hx::fsUnknown, 0, null()}
};
static hx::StaticInfo *TestRgbx_obj_sStaticStorageInfo = 0;
#endif

static ::String TestRgbx_obj_sMemberFields[] = {
	HX_HCSTRING("x","\x78","\x00","\x00","\x00"),
	HX_HCSTRING("testBasics","\xf7","\x73","\x1f","\x6e"),
	HX_HCSTRING("testStrings","\x50","\x7c","\xbc","\xb5"),
	HX_HCSTRING("testFromString","\xcd","\x54","\x67","\xf4"),
	::String(null()) };

static void TestRgbx_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(TestRgbx_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void TestRgbx_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(TestRgbx_obj::__mClass,"__mClass");
};

#endif

hx::Class TestRgbx_obj::__mClass;

void TestRgbx_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.color.TestRgbx","\x72","\x43","\xe7","\x81");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &hx::Class_obj::GetNoStaticField;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = TestRgbx_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(0 /* sStaticFields */);
	__mClass->mMembers = hx::Class_obj::dupFunctions(TestRgbx_obj_sMemberFields);
	__mClass->mCanCast = hx::TCanCast< TestRgbx_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = TestRgbx_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = TestRgbx_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = TestRgbx_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx
} // end namespace color
