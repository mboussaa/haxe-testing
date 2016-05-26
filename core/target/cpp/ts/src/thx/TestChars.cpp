// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_thx_TestChars
#include <thx/TestChars.h>
#endif
#ifndef INCLUDED_thx__Chars_Chars_Impl_
#include <thx/_Chars/Chars_Impl_.h>
#endif
#ifndef INCLUDED_utest_Assert
#include <utest/Assert.h>
#endif

namespace thx{

void TestChars_obj::__construct(){
            	HX_STACK_FRAME("thx.TestChars","new",0x0a49f813,"thx.TestChars.new","thx/TestChars.hx",8,0xce68683e)
            	HX_STACK_THIS(this)
            	}

Dynamic TestChars_obj::__CreateEmpty() { return new TestChars_obj; }

hx::ObjectPtr< TestChars_obj > TestChars_obj::__new()
{
	hx::ObjectPtr< TestChars_obj > _hx_result = new TestChars_obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic TestChars_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< TestChars_obj > _hx_result = new TestChars_obj();
	_hx_result->__construct();
	return _hx_result;
}

void TestChars_obj::testChars(){
            	HX_STACK_FRAME("thx.TestChars","testChars",0xcdc54b1e,"thx.TestChars.testChars","thx/TestChars.hx",10,0xce68683e)
            	HX_STACK_THIS(this)
HXLINE(  11)		HX_VARI( ::Array< Int >,t) = ::thx::_Chars::Chars_Impl__obj::fromString(HX_("a\xe2""\x98""\xba""b\xe2""\x98""\xba""\xe2""\x98""\xba""c\xe2""\x98""\xba""\xe2""\x98""\xba""\xe2""\x98""\xba""",00,32,31,d3));
HXLINE(  14)		::utest::Assert_obj::same(::Array_obj< Int >::__new(9)->init(0,(int)97)->init(1,(int)9786)->init(2,(int)98)->init(3,(int)9786)->init(4,(int)9786)->init(5,(int)99)->init(6,(int)9786)->init(7,(int)9786)->init(8,(int)9786),t,null(),null(),null(),hx::SourceInfo(HX_("TestChars.hx",93,c0,c6,f6),14,HX_("thx.TestChars",a1,f2,29,f7),HX_("testChars",2b,db,b5,0e)));
HXLINE(  15)		::String _hx_tmp = ::thx::_Chars::Chars_Impl__obj::toString(t);
HXDLIN(  15)		::utest::Assert_obj::equals(HX_("a\xe2""\x98""\xba""b\xe2""\x98""\xba""\xe2""\x98""\xba""c\xe2""\x98""\xba""\xe2""\x98""\xba""\xe2""\x98""\xba""",00,32,31,d3),_hx_tmp,null(),hx::SourceInfo(HX_("TestChars.hx",93,c0,c6,f6),15,HX_("thx.TestChars",a1,f2,29,f7),HX_("testChars",2b,db,b5,0e)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestChars_obj,testChars,(void))

void TestChars_obj::testArrayAccess(){
            	HX_STACK_FRAME("thx.TestChars","testArrayAccess",0x88c9851e,"thx.TestChars.testArrayAccess","thx/TestChars.hx",18,0xce68683e)
            	HX_STACK_THIS(this)
HXLINE(  19)		HX_VARI( ::Array< Int >,chars) = ::thx::_Chars::Chars_Impl__obj::fromString(HX_("a\xe2""\x98""\xba""b\xe2""\x98""\xba""\xe2""\x98""\xba""c\xe2""\x98""\xba""\xe2""\x98""\xba""\xe2""\x98""\xba""",00,32,31,d3));
HXLINE(  20)		::utest::Assert_obj::equals((int)9786,chars->__get((int)1),null(),hx::SourceInfo(HX_("TestChars.hx",93,c0,c6,f6),20,HX_("thx.TestChars",a1,f2,29,f7),HX_("testArrayAccess",eb,1c,1d,4d)));
HXLINE(  21)		::utest::Assert_obj::equals((int)99,chars->__get((int)5),null(),hx::SourceInfo(HX_("TestChars.hx",93,c0,c6,f6),21,HX_("thx.TestChars",a1,f2,29,f7),HX_("testArrayAccess",eb,1c,1d,4d)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestChars_obj,testArrayAccess,(void))


TestChars_obj::TestChars_obj()
{
}

hx::Val TestChars_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 9:
		if (HX_FIELD_EQ(inName,"testChars") ) { return hx::Val( testChars_dyn()); }
		break;
	case 15:
		if (HX_FIELD_EQ(inName,"testArrayAccess") ) { return hx::Val( testArrayAccess_dyn()); }
	}
	return super::__Field(inName,inCallProp);
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *TestChars_obj_sMemberStorageInfo = 0;
static hx::StaticInfo *TestChars_obj_sStaticStorageInfo = 0;
#endif

static ::String TestChars_obj_sMemberFields[] = {
	HX_HCSTRING("testChars","\x2b","\xdb","\xb5","\x0e"),
	HX_HCSTRING("testArrayAccess","\xeb","\x1c","\x1d","\x4d"),
	::String(null()) };

static void TestChars_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(TestChars_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void TestChars_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(TestChars_obj::__mClass,"__mClass");
};

#endif

hx::Class TestChars_obj::__mClass;

void TestChars_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.TestChars","\xa1","\xf2","\x29","\xf7");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &hx::Class_obj::GetNoStaticField;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = TestChars_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(0 /* sStaticFields */);
	__mClass->mMembers = hx::Class_obj::dupFunctions(TestChars_obj_sMemberFields);
	__mClass->mCanCast = hx::TCanCast< TestChars_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = TestChars_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = TestChars_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = TestChars_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx