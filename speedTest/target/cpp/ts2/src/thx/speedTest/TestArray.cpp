// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_thx_speedTest_TestArray
#include <thx/speedTest/TestArray.h>
#endif

namespace thx{
namespace speedTest{

void TestArray_obj::__construct(Int i){
            	HX_STACK_FRAME("thx.speedTest.TestArray","new",0xaceb469a,"thx.speedTest.TestArray.new","thx/speedTest/TestArray.hx",8,0xded55058)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(i,"i")
HXLINE(   8)		this->x = i;
            	}

Dynamic TestArray_obj::__CreateEmpty() { return new TestArray_obj; }

hx::ObjectPtr< TestArray_obj > TestArray_obj::__new(Int i)
{
	hx::ObjectPtr< TestArray_obj > _hx_result = new TestArray_obj();
	_hx_result->__construct(i);
	return _hx_result;
}

Dynamic TestArray_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< TestArray_obj > _hx_result = new TestArray_obj();
	_hx_result->__construct(inArgs[0]);
	return _hx_result;
}

void TestArray_obj::testInitialisation(){
            	HX_STACK_FRAME("thx.speedTest.TestArray","testInitialisation",0x5b36317f,"thx.speedTest.TestArray.testInitialisation","thx/speedTest/TestArray.hx",12,0xded55058)
            	HX_STACK_THIS(this)
HXLINE(  12)		HX_VARI( Int,_g1) = (int)0;
HXDLIN(  12)		HX_VARI( Int,_g) = this->x;
HXDLIN(  12)		while((_g1 < _g)){
HXLINE(  12)			++_g1;
HXLINE(  13)			HX_VARI( ::Array< Int >,a) = ::Array_obj< Int >::__new(0);
HXLINE(  14)			{
HXLINE(  14)				HX_VARI( Int,_g2) = (int)0;
HXDLIN(  14)				while((_g2 < (int)10000000)){
HXLINE(  14)					++_g2;
HXLINE(  15)					a[(int)1] = (int)0;
            				}
            			}
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestArray_obj,testInitialisation,(void))


TestArray_obj::TestArray_obj()
{
}

hx::Val TestArray_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
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

hx::Val TestArray_obj::__SetField(const ::String &inName,const hx::Val &inValue,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 1:
		if (HX_FIELD_EQ(inName,"x") ) { x=inValue.Cast< Int >(); return inValue; }
	}
	return super::__SetField(inName,inValue,inCallProp);
}

void TestArray_obj::__GetFields(Array< ::String> &outFields)
{
	outFields->push(HX_HCSTRING("x","\x78","\x00","\x00","\x00"));
	super::__GetFields(outFields);
};

#if HXCPP_SCRIPTABLE
static hx::StorageInfo TestArray_obj_sMemberStorageInfo[] = {
	{hx::fsInt,(int)offsetof(TestArray_obj,x),HX_HCSTRING("x","\x78","\x00","\x00","\x00")},
	{ hx::fsUnknown, 0, null()}
};
static hx::StaticInfo *TestArray_obj_sStaticStorageInfo = 0;
#endif

static ::String TestArray_obj_sMemberFields[] = {
	HX_HCSTRING("x","\x78","\x00","\x00","\x00"),
	HX_HCSTRING("testInitialisation","\x79","\x96","\x0f","\xf2"),
	::String(null()) };

static void TestArray_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(TestArray_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void TestArray_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(TestArray_obj::__mClass,"__mClass");
};

#endif

hx::Class TestArray_obj::__mClass;

void TestArray_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.speedTest.TestArray","\xa8","\xb1","\xb1","\xb9");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &hx::Class_obj::GetNoStaticField;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = TestArray_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(0 /* sStaticFields */);
	__mClass->mMembers = hx::Class_obj::dupFunctions(TestArray_obj_sMemberFields);
	__mClass->mCanCast = hx::TCanCast< TestArray_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = TestArray_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = TestArray_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = TestArray_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx
} // end namespace speedTest
