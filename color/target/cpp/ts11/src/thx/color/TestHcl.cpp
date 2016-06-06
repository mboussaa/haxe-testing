// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_thx_color_TestHcl
#include <thx/color/TestHcl.h>
#endif
#ifndef INCLUDED_thx_color__LCh_LCh_Impl_
#include <thx/color/_LCh/LCh_Impl_.h>
#endif
#ifndef INCLUDED_utest_Assert
#include <utest/Assert.h>
#endif

namespace thx{
namespace color{

void TestHcl_obj::__construct(Int i){
            	HX_STACK_FRAME("thx.color.TestHcl","new",0x5546ae3c,"thx.color.TestHcl.new","thx/color/TestHcl.hx",9,0xf9df29f6)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(i,"i")
HXLINE(   9)		this->x = i;
            	}

Dynamic TestHcl_obj::__CreateEmpty() { return new TestHcl_obj; }

hx::ObjectPtr< TestHcl_obj > TestHcl_obj::__new(Int i)
{
	hx::ObjectPtr< TestHcl_obj > _hx_result = new TestHcl_obj();
	_hx_result->__construct(i);
	return _hx_result;
}

Dynamic TestHcl_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< TestHcl_obj > _hx_result = new TestHcl_obj();
	_hx_result->__construct(inArgs[0]);
	return _hx_result;
}

void TestHcl_obj::testParse(){
            	HX_STACK_FRAME("thx.color.TestHcl","testParse",0xe0c0795d,"thx.color.TestHcl.testParse","thx/color/TestHcl.hx",13,0xf9df29f6)
            	HX_STACK_THIS(this)
HXLINE(  13)		HX_VARI( Int,_g1) = (int)0;
HXDLIN(  13)		HX_VARI( Int,_g) = this->x;
HXDLIN(  13)		while((_g1 < _g)){
HXLINE(  13)			++_g1;
HXLINE(  14)			HX_VARI( ::Array< Float >,hcl) = ::thx::color::_LCh::LCh_Impl__obj::fromString(HX_("hcl(0.5,0,1)",20,2b,a3,79));
HXLINE(  15)			::utest::Assert_obj::equals(((Float)0.5),hcl->__get((int)2),null(),hx::SourceInfo(HX_("TestHcl.hx",5f,8c,f4,ec),15,HX_("thx.color.TestHcl",4a,20,54,0e),HX_("testParse",81,ce,57,86)));
HXLINE(  16)			::utest::Assert_obj::equals((int)0,hcl->__get((int)1),null(),hx::SourceInfo(HX_("TestHcl.hx",5f,8c,f4,ec),16,HX_("thx.color.TestHcl",4a,20,54,0e),HX_("testParse",81,ce,57,86)));
HXLINE(  17)			::utest::Assert_obj::equals((int)1,hcl->__get((int)0),null(),hx::SourceInfo(HX_("TestHcl.hx",5f,8c,f4,ec),17,HX_("thx.color.TestHcl",4a,20,54,0e),HX_("testParse",81,ce,57,86)));
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestHcl_obj,testParse,(void))

void TestHcl_obj::testStrings(){
            	HX_STACK_FRAME("thx.color.TestHcl","testStrings",0xfbca962c,"thx.color.TestHcl.testStrings","thx/color/TestHcl.hx",21,0xf9df29f6)
            	HX_STACK_THIS(this)
HXLINE(  21)		HX_VARI( Int,_g1) = (int)0;
HXDLIN(  21)		HX_VARI( Int,_g) = this->x;
HXDLIN(  21)		while((_g1 < _g)){
HXLINE(  21)			++_g1;
HXLINE(  23)			::utest::Assert_obj::equals(HX_("hcl(0,0.5,1)",e0,a9,ca,50),::thx::color::_LCh::LCh_Impl__obj::toHclString(::Array_obj< Float >::__new(3)->init(0,(int)1)->init(1,((Float)0.5))->init(2,(int)0)),null(),hx::SourceInfo(HX_("TestHcl.hx",5f,8c,f4,ec),23,HX_("thx.color.TestHcl",4a,20,54,0e),HX_("testStrings",50,7c,bc,b5)));
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestHcl_obj,testStrings,(void))


TestHcl_obj::TestHcl_obj()
{
}

hx::Val TestHcl_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 1:
		if (HX_FIELD_EQ(inName,"x") ) { return hx::Val( x); }
		break;
	case 9:
		if (HX_FIELD_EQ(inName,"testParse") ) { return hx::Val( testParse_dyn()); }
		break;
	case 11:
		if (HX_FIELD_EQ(inName,"testStrings") ) { return hx::Val( testStrings_dyn()); }
	}
	return super::__Field(inName,inCallProp);
}

hx::Val TestHcl_obj::__SetField(const ::String &inName,const hx::Val &inValue,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 1:
		if (HX_FIELD_EQ(inName,"x") ) { x=inValue.Cast< Int >(); return inValue; }
	}
	return super::__SetField(inName,inValue,inCallProp);
}

void TestHcl_obj::__GetFields(Array< ::String> &outFields)
{
	outFields->push(HX_HCSTRING("x","\x78","\x00","\x00","\x00"));
	super::__GetFields(outFields);
};

#if HXCPP_SCRIPTABLE
static hx::StorageInfo TestHcl_obj_sMemberStorageInfo[] = {
	{hx::fsInt,(int)offsetof(TestHcl_obj,x),HX_HCSTRING("x","\x78","\x00","\x00","\x00")},
	{ hx::fsUnknown, 0, null()}
};
static hx::StaticInfo *TestHcl_obj_sStaticStorageInfo = 0;
#endif

static ::String TestHcl_obj_sMemberFields[] = {
	HX_HCSTRING("x","\x78","\x00","\x00","\x00"),
	HX_HCSTRING("testParse","\x81","\xce","\x57","\x86"),
	HX_HCSTRING("testStrings","\x50","\x7c","\xbc","\xb5"),
	::String(null()) };

static void TestHcl_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(TestHcl_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void TestHcl_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(TestHcl_obj::__mClass,"__mClass");
};

#endif

hx::Class TestHcl_obj::__mClass;

void TestHcl_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.color.TestHcl","\x4a","\x20","\x54","\x0e");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &hx::Class_obj::GetNoStaticField;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = TestHcl_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(0 /* sStaticFields */);
	__mClass->mMembers = hx::Class_obj::dupFunctions(TestHcl_obj_sMemberFields);
	__mClass->mCanCast = hx::TCanCast< TestHcl_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = TestHcl_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = TestHcl_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = TestHcl_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx
} // end namespace color