// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_Std
#include <Std.h>
#endif
#ifndef INCLUDED_thx_TestLambda
#include <thx/TestLambda.h>
#endif
#ifndef INCLUDED_utest_Assert
#include <utest/Assert.h>
#endif

namespace thx{

void TestLambda_obj::__construct(Int i){
            	HX_STACK_FRAME("thx.TestLambda","new",0x3d47a735,"thx.TestLambda.new","thx/TestLambda.hx",9,0xb2e1493a)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(i,"i")
HXLINE(   9)		this->x = i;
            	}

Dynamic TestLambda_obj::__CreateEmpty() { return new TestLambda_obj; }

hx::ObjectPtr< TestLambda_obj > TestLambda_obj::__new(Int i)
{
	hx::ObjectPtr< TestLambda_obj > _hx_result = new TestLambda_obj();
	_hx_result->__construct(i);
	return _hx_result;
}

Dynamic TestLambda_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< TestLambda_obj > _hx_result = new TestLambda_obj();
	_hx_result->__construct(inArgs[0]);
	return _hx_result;
}

void TestLambda_obj::testFunctions(){
            	HX_STACK_FRAME("thx.TestLambda","testFunctions",0x18a81abe,"thx.TestLambda.testFunctions","thx/TestLambda.hx",13,0xb2e1493a)
            	HX_STACK_THIS(this)
HXLINE(  13)		HX_VARI( Int,_g1) = (int)0;
HXDLIN(  13)		HX_VARI( Int,_g) = this->x;
HXDLIN(  13)		while((_g1 < _g)){
            			HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_0) HXARGC(1)
            			Int _hx_run( ::Dynamic _){
            				HX_STACK_FRAME("thx.TestLambda","testFunctions",0x18a81abe,"thx.TestLambda.testFunctions","thx/macro/lambda/SlambdaMacro.hx",86,0x8ba75432)
            				HX_STACK_ARG(_,"_")
HXLINE(  86)				return (_ + (int)1);
            			}
            			HX_END_LOCAL_FUNC1(return)

HXLINE(  13)			++_g1;
HXLINE(  14)			::Array< Int > _hx_tmp = ::Array_obj< Int >::__new(2)->init(0,(int)1)->init(1,(int)2)->map( ::Dynamic(new _hx_Closure_0()));
HXDLIN(  14)			::utest::Assert_obj::same(::cpp::VirtualArray_obj::__new(2)->init(0,(int)2)->init(1,(int)3),_hx_tmp,null(),null(),null(),hx::SourceInfo(HX_("TestLambda.hx",45,3b,10,dd),14,HX_("thx.TestLambda",c3,e8,d4,e6),HX_("testFunctions",a9,87,3d,e7)));
HXLINE(  16)			::utest::Assert_obj::equals((int)0,(int)0,null(),hx::SourceInfo(HX_("TestLambda.hx",45,3b,10,dd),16,HX_("thx.TestLambda",c3,e8,d4,e6),HX_("testFunctions",a9,87,3d,e7)));
HXLINE(  17)			::utest::Assert_obj::equals((int)2,(int)2,null(),hx::SourceInfo(HX_("TestLambda.hx",45,3b,10,dd),17,HX_("thx.TestLambda",c3,e8,d4,e6),HX_("testFunctions",a9,87,3d,e7)));
HXLINE(  18)			::utest::Assert_obj::equals((int)3,(int)3,null(),hx::SourceInfo(HX_("TestLambda.hx",45,3b,10,dd),18,HX_("thx.TestLambda",c3,e8,d4,e6),HX_("testFunctions",a9,87,3d,e7)));
HXLINE(  19)			::utest::Assert_obj::equals((int)6,(int)6,null(),hx::SourceInfo(HX_("TestLambda.hx",45,3b,10,dd),19,HX_("thx.TestLambda",c3,e8,d4,e6),HX_("testFunctions",a9,87,3d,e7)));
HXLINE(  20)			::utest::Assert_obj::equals((int)10,(int)10,null(),hx::SourceInfo(HX_("TestLambda.hx",45,3b,10,dd),20,HX_("thx.TestLambda",c3,e8,d4,e6),HX_("testFunctions",a9,87,3d,e7)));
HXLINE(  21)			::utest::Assert_obj::equals((int)15,(int)15,null(),hx::SourceInfo(HX_("TestLambda.hx",45,3b,10,dd),21,HX_("thx.TestLambda",c3,e8,d4,e6),HX_("testFunctions",a9,87,3d,e7)));
HXLINE(  23)			 ::Dynamic _hx_tmp1 = ::Std_obj::parseInt(HX_("1",31,00,00,00));
HXDLIN(  23)			::utest::Assert_obj::equals((int)1,_hx_tmp1,null(),hx::SourceInfo(HX_("TestLambda.hx",45,3b,10,dd),23,HX_("thx.TestLambda",c3,e8,d4,e6),HX_("testFunctions",a9,87,3d,e7)));
HXLINE(  24)			 ::Dynamic _hx_tmp2 = ::Std_obj::parseInt(HX_("1",31,00,00,00));
HXDLIN(  24)			::utest::Assert_obj::equals((int)1,_hx_tmp2,null(),hx::SourceInfo(HX_("TestLambda.hx",45,3b,10,dd),24,HX_("thx.TestLambda",c3,e8,d4,e6),HX_("testFunctions",a9,87,3d,e7)));
HXLINE(  25)			::utest::Assert_obj::equals((int)1,(int)1,null(),hx::SourceInfo(HX_("TestLambda.hx",45,3b,10,dd),25,HX_("thx.TestLambda",c3,e8,d4,e6),HX_("testFunctions",a9,87,3d,e7)));
HXLINE(  26)			::utest::Assert_obj::equals((int)3,(int)3,null(),hx::SourceInfo(HX_("TestLambda.hx",45,3b,10,dd),26,HX_("thx.TestLambda",c3,e8,d4,e6),HX_("testFunctions",a9,87,3d,e7)));
HXLINE(  27)			::utest::Assert_obj::equals((int)6,(int)6,null(),hx::SourceInfo(HX_("TestLambda.hx",45,3b,10,dd),27,HX_("thx.TestLambda",c3,e8,d4,e6),HX_("testFunctions",a9,87,3d,e7)));
HXLINE(  28)			::utest::Assert_obj::equals((int)10,(int)10,null(),hx::SourceInfo(HX_("TestLambda.hx",45,3b,10,dd),28,HX_("thx.TestLambda",c3,e8,d4,e6),HX_("testFunctions",a9,87,3d,e7)));
HXLINE(  29)			::utest::Assert_obj::equals((int)15,(int)15,null(),hx::SourceInfo(HX_("TestLambda.hx",45,3b,10,dd),29,HX_("thx.TestLambda",c3,e8,d4,e6),HX_("testFunctions",a9,87,3d,e7)));
HXLINE(  31)			::utest::Assert_obj::equals((int)1,(int)1,null(),hx::SourceInfo(HX_("TestLambda.hx",45,3b,10,dd),31,HX_("thx.TestLambda",c3,e8,d4,e6),HX_("testFunctions",a9,87,3d,e7)));
HXLINE(  32)			::utest::Assert_obj::equals((int)3,(int)3,null(),hx::SourceInfo(HX_("TestLambda.hx",45,3b,10,dd),32,HX_("thx.TestLambda",c3,e8,d4,e6),HX_("testFunctions",a9,87,3d,e7)));
HXLINE(  33)			::utest::Assert_obj::equals((int)6,(int)6,null(),hx::SourceInfo(HX_("TestLambda.hx",45,3b,10,dd),33,HX_("thx.TestLambda",c3,e8,d4,e6),HX_("testFunctions",a9,87,3d,e7)));
HXLINE(  34)			::utest::Assert_obj::equals((int)10,(int)10,null(),hx::SourceInfo(HX_("TestLambda.hx",45,3b,10,dd),34,HX_("thx.TestLambda",c3,e8,d4,e6),HX_("testFunctions",a9,87,3d,e7)));
HXLINE(  35)			::utest::Assert_obj::equals((int)15,(int)15,null(),hx::SourceInfo(HX_("TestLambda.hx",45,3b,10,dd),35,HX_("thx.TestLambda",c3,e8,d4,e6),HX_("testFunctions",a9,87,3d,e7)));
HXLINE(  37)			::utest::Assert_obj::equals(HX_("Test 1",03,91,ce,09),(HX_("Test ",6e,ef,c2,a0) + HX_("1",31,00,00,00)),null(),hx::SourceInfo(HX_("TestLambda.hx",45,3b,10,dd),37,HX_("thx.TestLambda",c3,e8,d4,e6),HX_("testFunctions",a9,87,3d,e7)));
HXLINE(  38)			::utest::Assert_obj::equals(HX_("Test 1+2",6a,3d,57,07),(((HX_("Test ",6e,ef,c2,a0) + HX_("1",31,00,00,00)) + HX_("+",2b,00,00,00)) + HX_("2",32,00,00,00)),null(),hx::SourceInfo(HX_("TestLambda.hx",45,3b,10,dd),38,HX_("thx.TestLambda",c3,e8,d4,e6),HX_("testFunctions",a9,87,3d,e7)));
HXLINE(  39)			::utest::Assert_obj::equals(HX_("BA",bf,39,00,00),(HX_("B",42,00,00,00) + HX_("A",41,00,00,00)),null(),hx::SourceInfo(HX_("TestLambda.hx",45,3b,10,dd),39,HX_("thx.TestLambda",c3,e8,d4,e6),HX_("testFunctions",a9,87,3d,e7)));
HXLINE(  40)			::utest::Assert_obj::equals(HX_("21",bf,2b,00,00),((HX_("",00,00,00,00) + (int)2) + HX_("1",31,00,00,00)),null(),hx::SourceInfo(HX_("TestLambda.hx",45,3b,10,dd),40,HX_("thx.TestLambda",c3,e8,d4,e6),HX_("testFunctions",a9,87,3d,e7)));
HXLINE(  41)			::utest::Assert_obj::equals(HX_("$_1$_0",bf,31,69,38),HX_("$_1$_0",bf,31,69,38),null(),hx::SourceInfo(HX_("TestLambda.hx",45,3b,10,dd),41,HX_("thx.TestLambda",c3,e8,d4,e6),HX_("testFunctions",a9,87,3d,e7)));
HXLINE(  42)			::utest::Assert_obj::equals(HX_("$_0",15,a4,1b,00),(HX_("$",24,00,00,00) + HX_("_0",f1,52,00,00)),null(),hx::SourceInfo(HX_("TestLambda.hx",45,3b,10,dd),42,HX_("thx.TestLambda",c3,e8,d4,e6),HX_("testFunctions",a9,87,3d,e7)));
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestLambda_obj,testFunctions,(void))

void TestLambda_obj::testForms(){
            	HX_STACK_FRAME("thx.TestLambda","testForms",0x4d6b1d92,"thx.TestLambda.testForms","thx/TestLambda.hx",47,0xb2e1493a)
            	HX_STACK_THIS(this)
HXLINE(  47)		HX_VARI( Int,_g1) = (int)0;
HXDLIN(  47)		HX_VARI( Int,_g) = this->x;
HXDLIN(  47)		while((_g1 < _g)){
HXLINE(  47)			++_g1;
HXLINE(  48)			{
HXLINE(  49)				::utest::Assert_obj::equals((int)1,(int)1,null(),hx::SourceInfo(HX_("TestLambda.hx",45,3b,10,dd),49,HX_("thx.TestLambda",c3,e8,d4,e6),HX_("testForms",fd,f8,96,cd)));
HXLINE(  53)				::utest::Assert_obj::equals((int)1,(int)1,null(),hx::SourceInfo(HX_("TestLambda.hx",45,3b,10,dd),53,HX_("thx.TestLambda",c3,e8,d4,e6),HX_("testForms",fd,f8,96,cd)));
HXLINE(  56)				::utest::Assert_obj::equals((int)1,(int)1,null(),hx::SourceInfo(HX_("TestLambda.hx",45,3b,10,dd),56,HX_("thx.TestLambda",c3,e8,d4,e6),HX_("testForms",fd,f8,96,cd)));
HXLINE(  63)				::utest::Assert_obj::equals((int)0,(int)0,null(),hx::SourceInfo(HX_("TestLambda.hx",45,3b,10,dd),63,HX_("thx.TestLambda",c3,e8,d4,e6),HX_("testForms",fd,f8,96,cd)));
HXLINE(  67)				::utest::Assert_obj::equals((int)1,(int)1,null(),hx::SourceInfo(HX_("TestLambda.hx",45,3b,10,dd),67,HX_("thx.TestLambda",c3,e8,d4,e6),HX_("testForms",fd,f8,96,cd)));
HXLINE(  70)				::utest::Assert_obj::equals((int)1,(int)1,null(),hx::SourceInfo(HX_("TestLambda.hx",45,3b,10,dd),70,HX_("thx.TestLambda",c3,e8,d4,e6),HX_("testForms",fd,f8,96,cd)));
HXLINE(  74)				::utest::Assert_obj::equals((int)1,(int)1,null(),hx::SourceInfo(HX_("TestLambda.hx",45,3b,10,dd),74,HX_("thx.TestLambda",c3,e8,d4,e6),HX_("testForms",fd,f8,96,cd)));
HXLINE(  77)				::utest::Assert_obj::equals((int)1,(int)1,null(),hx::SourceInfo(HX_("TestLambda.hx",45,3b,10,dd),77,HX_("thx.TestLambda",c3,e8,d4,e6),HX_("testForms",fd,f8,96,cd)));
HXLINE(  81)				::utest::Assert_obj::equals((int)1,(int)1,null(),hx::SourceInfo(HX_("TestLambda.hx",45,3b,10,dd),81,HX_("thx.TestLambda",c3,e8,d4,e6),HX_("testForms",fd,f8,96,cd)));
HXLINE(  84)				::utest::Assert_obj::equals((int)1,(int)1,null(),hx::SourceInfo(HX_("TestLambda.hx",45,3b,10,dd),84,HX_("thx.TestLambda",c3,e8,d4,e6),HX_("testForms",fd,f8,96,cd)));
HXLINE(  86)				::utest::Assert_obj::equals(false,false,null(),hx::SourceInfo(HX_("TestLambda.hx",45,3b,10,dd),86,HX_("thx.TestLambda",c3,e8,d4,e6),HX_("testForms",fd,f8,96,cd)));
HXLINE(  87)				::utest::Assert_obj::equals(true,true,null(),hx::SourceInfo(HX_("TestLambda.hx",45,3b,10,dd),87,HX_("thx.TestLambda",c3,e8,d4,e6),HX_("testForms",fd,f8,96,cd)));
            			}
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestLambda_obj,testForms,(void))


TestLambda_obj::TestLambda_obj()
{
}

hx::Val TestLambda_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 1:
		if (HX_FIELD_EQ(inName,"x") ) { return hx::Val( x); }
		break;
	case 9:
		if (HX_FIELD_EQ(inName,"testForms") ) { return hx::Val( testForms_dyn()); }
		break;
	case 13:
		if (HX_FIELD_EQ(inName,"testFunctions") ) { return hx::Val( testFunctions_dyn()); }
	}
	return super::__Field(inName,inCallProp);
}

hx::Val TestLambda_obj::__SetField(const ::String &inName,const hx::Val &inValue,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 1:
		if (HX_FIELD_EQ(inName,"x") ) { x=inValue.Cast< Int >(); return inValue; }
	}
	return super::__SetField(inName,inValue,inCallProp);
}

void TestLambda_obj::__GetFields(Array< ::String> &outFields)
{
	outFields->push(HX_HCSTRING("x","\x78","\x00","\x00","\x00"));
	super::__GetFields(outFields);
};

#if HXCPP_SCRIPTABLE
static hx::StorageInfo TestLambda_obj_sMemberStorageInfo[] = {
	{hx::fsInt,(int)offsetof(TestLambda_obj,x),HX_HCSTRING("x","\x78","\x00","\x00","\x00")},
	{ hx::fsUnknown, 0, null()}
};
static hx::StaticInfo *TestLambda_obj_sStaticStorageInfo = 0;
#endif

static ::String TestLambda_obj_sMemberFields[] = {
	HX_HCSTRING("x","\x78","\x00","\x00","\x00"),
	HX_HCSTRING("testFunctions","\xa9","\x87","\x3d","\xe7"),
	HX_HCSTRING("testForms","\xfd","\xf8","\x96","\xcd"),
	::String(null()) };

static void TestLambda_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(TestLambda_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void TestLambda_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(TestLambda_obj::__mClass,"__mClass");
};

#endif

hx::Class TestLambda_obj::__mClass;

void TestLambda_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.TestLambda","\xc3","\xe8","\xd4","\xe6");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &hx::Class_obj::GetNoStaticField;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = TestLambda_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(0 /* sStaticFields */);
	__mClass->mMembers = hx::Class_obj::dupFunctions(TestLambda_obj_sMemberFields);
	__mClass->mCanCast = hx::TCanCast< TestLambda_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = TestLambda_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = TestLambda_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = TestLambda_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx