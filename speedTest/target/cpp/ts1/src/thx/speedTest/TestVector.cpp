// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_thx_speedTest_TestVector
#include <thx/speedTest/TestVector.h>
#endif

namespace thx{
namespace speedTest{

void TestVector_obj::__construct(Int i){
            	HX_STACK_FRAME("thx.speedTest.TestVector","new",0x6a5614c6,"thx.speedTest.TestVector.new","thx/speedTest/TestVector.hx",8,0x15d958e8)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(i,"i")
HXLINE(   8)		this->x = i;
            	}

Dynamic TestVector_obj::__CreateEmpty() { return new TestVector_obj; }

hx::ObjectPtr< TestVector_obj > TestVector_obj::__new(Int i)
{
	hx::ObjectPtr< TestVector_obj > _hx_result = new TestVector_obj();
	_hx_result->__construct(i);
	return _hx_result;
}

Dynamic TestVector_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< TestVector_obj > _hx_result = new TestVector_obj();
	_hx_result->__construct(inArgs[0]);
	return _hx_result;
}

void TestVector_obj::testInitialisation(){
            	HX_STACK_FRAME("thx.speedTest.TestVector","testInitialisation",0x426a34d3,"thx.speedTest.TestVector.testInitialisation","thx/speedTest/TestVector.hx",12,0x15d958e8)
            	HX_STACK_THIS(this)
HXLINE(  12)		HX_VARI( Int,_g1) = (int)0;
HXDLIN(  12)		HX_VARI( Int,_g) = this->x;
HXDLIN(  12)		while((_g1 < _g)){
HXLINE(  12)			++_g1;
HXLINE(  13)			HX_VARI_NAME( ::Array< Int >,this1,"this") = ::Array_obj< Int >::__new();
HXDLIN(  13)			_hx_array_set_size_exact(this1,(int)10000000);
HXDLIN(  13)			HX_VARI( ::Array< Int >,vec) = this1;
HXLINE(  14)			{
HXLINE(  14)				HX_VARI( Int,_g3) = (int)0;
HXDLIN(  14)				HX_VARI( Int,_g2) = vec->length;
HXDLIN(  14)				while((_g3 < _g2)){
HXLINE(  14)					HX_VARI( Int,i) = _g3++;
HXLINE(  15)					vec->__unsafe_set(i,(int)0);
            				}
            			}
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestVector_obj,testInitialisation,(void))


TestVector_obj::TestVector_obj()
{
}

hx::Val TestVector_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 1:
		if (HX_FIELD_EQ(inName,"x") ) { return hx::Val( x); }
		break;
	case 18:
		if (HX_FIELD_EQ(inName,"testInitialisation") ) { return hx::Val( testInitialisation_dyn()); }
	}
	return super::__Field(inName,inCallProp);
}

hx::Val TestVector_obj::__SetField(const ::String &inName,const hx::Val &inValue,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 1:
		if (HX_FIELD_EQ(inName,"x") ) { x=inValue.Cast< Int >(); return inValue; }
	}
	return super::__SetField(inName,inValue,inCallProp);
}

void TestVector_obj::__GetFields(Array< ::String> &outFields)
{
	outFields->push(HX_HCSTRING("x","\x78","\x00","\x00","\x00"));
	super::__GetFields(outFields);
};

#if HXCPP_SCRIPTABLE
static hx::StorageInfo TestVector_obj_sMemberStorageInfo[] = {
	{hx::fsInt,(int)offsetof(TestVector_obj,x),HX_HCSTRING("x","\x78","\x00","\x00","\x00")},
	{ hx::fsUnknown, 0, null()}
};
static hx::StaticInfo *TestVector_obj_sStaticStorageInfo = 0;
#endif

static ::String TestVector_obj_sMemberFields[] = {
	HX_HCSTRING("x","\x78","\x00","\x00","\x00"),
	HX_HCSTRING("testInitialisation","\x79","\x96","\x0f","\xf2"),
	::String(null()) };

static void TestVector_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(TestVector_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void TestVector_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(TestVector_obj::__mClass,"__mClass");
};

#endif

hx::Class TestVector_obj::__mClass;

void TestVector_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.speedTest.TestVector","\xd4","\xf9","\x36","\xa1");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &hx::Class_obj::GetNoStaticField;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = TestVector_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(0 /* sStaticFields */);
	__mClass->mMembers = hx::Class_obj::dupFunctions(TestVector_obj_sMemberFields);
	__mClass->mCanCast = hx::TCanCast< TestVector_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = TestVector_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = TestVector_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = TestVector_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx
} // end namespace speedTest