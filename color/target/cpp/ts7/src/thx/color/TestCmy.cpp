// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_thx_color_TestCmy
#include <thx/color/TestCmy.h>
#endif
#ifndef INCLUDED_thx_color__Cmy_Cmy_Impl_
#include <thx/color/_Cmy/Cmy_Impl_.h>
#endif
#ifndef INCLUDED_utest_Assert
#include <utest/Assert.h>
#endif

namespace thx{
namespace color{

void TestCmy_obj::__construct(){
            	HX_STACK_FRAME("thx.color.TestCmy","new",0x012282ba,"thx.color.TestCmy.new","thx/color/TestCmy.hx",6,0xc4afef38)
            	HX_STACK_THIS(this)
            	}

Dynamic TestCmy_obj::__CreateEmpty() { return new TestCmy_obj; }

hx::ObjectPtr< TestCmy_obj > TestCmy_obj::__new()
{
	hx::ObjectPtr< TestCmy_obj > _hx_result = new TestCmy_obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic TestCmy_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< TestCmy_obj > _hx_result = new TestCmy_obj();
	_hx_result->__construct();
	return _hx_result;
}

void TestCmy_obj::testBasics(){
            	HX_STACK_FRAME("thx.color.TestCmy","testBasics",0x722720dd,"thx.color.TestCmy.testBasics","thx/color/TestCmy.hx",8,0xc4afef38)
            	HX_STACK_THIS(this)
HXLINE(   9)		HX_VARI( ::Array< Float >,color) = ::Array_obj< Float >::__new(3)->init(0,((Float)0.5))->init(1,((Float)0.5))->init(2,((Float)0.5));
HXLINE(  10)		::utest::Assert_obj::equals(((Float)0.5),color->__get((int)0),null(),hx::SourceInfo(HX_("TestCmy.hx",a1,51,c5,b7),10,HX_("thx.color.TestCmy",c8,5d,50,0e),HX_("testBasics",f7,73,1f,6e)));
HXLINE(  11)		::utest::Assert_obj::equals(((Float)0.5),color->__get((int)1),null(),hx::SourceInfo(HX_("TestCmy.hx",a1,51,c5,b7),11,HX_("thx.color.TestCmy",c8,5d,50,0e),HX_("testBasics",f7,73,1f,6e)));
HXLINE(  12)		::utest::Assert_obj::equals(((Float)0.5),color->__get((int)2),null(),hx::SourceInfo(HX_("TestCmy.hx",a1,51,c5,b7),12,HX_("thx.color.TestCmy",c8,5d,50,0e),HX_("testBasics",f7,73,1f,6e)));
HXLINE(  14)		color = ::thx::color::_Cmy::Cmy_Impl__obj::normalize(::Array_obj< Float >::__new(3)->init(0,(int)2)->init(1,(int)-2)->init(2,(int)2));
HXLINE(  15)		::utest::Assert_obj::equals((int)1,color->__get((int)0),null(),hx::SourceInfo(HX_("TestCmy.hx",a1,51,c5,b7),15,HX_("thx.color.TestCmy",c8,5d,50,0e),HX_("testBasics",f7,73,1f,6e)));
HXLINE(  16)		::utest::Assert_obj::equals((int)0,color->__get((int)1),null(),hx::SourceInfo(HX_("TestCmy.hx",a1,51,c5,b7),16,HX_("thx.color.TestCmy",c8,5d,50,0e),HX_("testBasics",f7,73,1f,6e)));
HXLINE(  17)		::utest::Assert_obj::equals((int)1,color->__get((int)2),null(),hx::SourceInfo(HX_("TestCmy.hx",a1,51,c5,b7),17,HX_("thx.color.TestCmy",c8,5d,50,0e),HX_("testBasics",f7,73,1f,6e)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestCmy_obj,testBasics,(void))

void TestCmy_obj::testString(){
            	HX_STACK_FRAME("thx.color.TestCmy","testString",0x2e2c1ba9,"thx.color.TestCmy.testString","thx/color/TestCmy.hx",22,0xc4afef38)
            	HX_STACK_THIS(this)
HXLINE(  22)		::utest::Assert_obj::equals(HX_("cmy(0.5,0.5,0.5)",35,57,41,c6),::thx::color::_Cmy::Cmy_Impl__obj::toString(::Array_obj< Float >::__new(3)->init(0,((Float)0.5))->init(1,((Float)0.5))->init(2,((Float)0.5))),null(),hx::SourceInfo(HX_("TestCmy.hx",a1,51,c5,b7),22,HX_("thx.color.TestCmy",c8,5d,50,0e),HX_("testString",c3,6e,24,2a)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestCmy_obj,testString,(void))

void TestCmy_obj::testParse(){
            	HX_STACK_FRAME("thx.color.TestCmy","testParse",0xa0c3c05b,"thx.color.TestCmy.testParse","thx/color/TestCmy.hx",25,0xc4afef38)
            	HX_STACK_THIS(this)
HXLINE(  26)		HX_VARI( ::Array< Float >,color) = ::thx::color::_Cmy::Cmy_Impl__obj::fromString(HX_("cmy(0.5,0.5,0.5)",35,57,41,c6));
HXLINE(  27)		::utest::Assert_obj::equals(HX_("cmy(0.5,0.5,0.5)",35,57,41,c6),::thx::color::_Cmy::Cmy_Impl__obj::toString(color),null(),hx::SourceInfo(HX_("TestCmy.hx",a1,51,c5,b7),27,HX_("thx.color.TestCmy",c8,5d,50,0e),HX_("testParse",81,ce,57,86)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestCmy_obj,testParse,(void))

void TestCmy_obj::testFromFloat(){
            	HX_STACK_FRAME("thx.color.TestCmy","testFromFloat",0x2d6d13fa,"thx.color.TestCmy.testFromFloat","thx/color/TestCmy.hx",30,0xc4afef38)
            	HX_STACK_THIS(this)
HXLINE(  31)		HX_VARI( ::Array< Float >,s) = ::thx::color::_Cmy::Cmy_Impl__obj::fromString(HX_("cmy(0.5,0.5,0.5)",35,57,41,c6));
HXDLIN(  31)		HX_VARI( ::Array< Float >,f) = ::thx::color::_Cmy::Cmy_Impl__obj::fromFloats(::Array_obj< Float >::__new(3)->init(0,((Float)0.5))->init(1,((Float)0.5))->init(2,((Float)0.5)));
HXLINE(  33)		Bool _hx_tmp = ::thx::color::_Cmy::Cmy_Impl__obj::equals(s,f);
HXDLIN(  33)		::utest::Assert_obj::isTrue(_hx_tmp,null(),hx::SourceInfo(HX_("TestCmy.hx",a1,51,c5,b7),33,HX_("thx.color.TestCmy",c8,5d,50,0e),HX_("testFromFloat",20,2d,5a,ea)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestCmy_obj,testFromFloat,(void))


TestCmy_obj::TestCmy_obj()
{
}

hx::Val TestCmy_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 9:
		if (HX_FIELD_EQ(inName,"testParse") ) { return hx::Val( testParse_dyn()); }
		break;
	case 10:
		if (HX_FIELD_EQ(inName,"testBasics") ) { return hx::Val( testBasics_dyn()); }
		if (HX_FIELD_EQ(inName,"testString") ) { return hx::Val( testString_dyn()); }
		break;
	case 13:
		if (HX_FIELD_EQ(inName,"testFromFloat") ) { return hx::Val( testFromFloat_dyn()); }
	}
	return super::__Field(inName,inCallProp);
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *TestCmy_obj_sMemberStorageInfo = 0;
static hx::StaticInfo *TestCmy_obj_sStaticStorageInfo = 0;
#endif

static ::String TestCmy_obj_sMemberFields[] = {
	HX_HCSTRING("testBasics","\xf7","\x73","\x1f","\x6e"),
	HX_HCSTRING("testString","\xc3","\x6e","\x24","\x2a"),
	HX_HCSTRING("testParse","\x81","\xce","\x57","\x86"),
	HX_HCSTRING("testFromFloat","\x20","\x2d","\x5a","\xea"),
	::String(null()) };

static void TestCmy_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(TestCmy_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void TestCmy_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(TestCmy_obj::__mClass,"__mClass");
};

#endif

hx::Class TestCmy_obj::__mClass;

void TestCmy_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.color.TestCmy","\xc8","\x5d","\x50","\x0e");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &hx::Class_obj::GetNoStaticField;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = TestCmy_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(0 /* sStaticFields */);
	__mClass->mMembers = hx::Class_obj::dupFunctions(TestCmy_obj_sMemberFields);
	__mClass->mCanCast = hx::TCanCast< TestCmy_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = TestCmy_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = TestCmy_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = TestCmy_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx
} // end namespace color