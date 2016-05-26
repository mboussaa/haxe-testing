// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_thx_Ints
#include <thx/Ints.h>
#endif
#ifndef INCLUDED_thx_TestInts
#include <thx/TestInts.h>
#endif
#ifndef INCLUDED_utest_Assert
#include <utest/Assert.h>
#endif

namespace thx{

void TestInts_obj::__construct(){
            	HX_STACK_FRAME("thx.TestInts","new",0xd81aa452,"thx.TestInts.new","thx/TestInts.hx",12,0x1dfb38fd)
            	HX_STACK_THIS(this)
            	}

Dynamic TestInts_obj::__CreateEmpty() { return new TestInts_obj; }

hx::ObjectPtr< TestInts_obj > TestInts_obj::__new()
{
	hx::ObjectPtr< TestInts_obj > _hx_result = new TestInts_obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic TestInts_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< TestInts_obj > _hx_result = new TestInts_obj();
	_hx_result->__construct();
	return _hx_result;
}

void TestInts_obj::testRange(){
            	HX_STACK_FRAME("thx.TestInts","testRange",0x1d93397d,"thx.TestInts.testRange","thx/TestInts.hx",14,0x1dfb38fd)
            	HX_STACK_THIS(this)
HXLINE(  15)		HX_VARI( ::Array< Int >,range) = ::thx::Ints_obj::range((int)2,(int)7,(int)1);
HXLINE(  16)		::utest::Assert_obj::same(::cpp::VirtualArray_obj::__new(5)->init(0,(int)2)->init(1,(int)3)->init(2,(int)4)->init(3,(int)5)->init(4,(int)6),range,null(),null(),null(),hx::SourceInfo(HX_("TestInts.hx",48,02,2d,c1),16,HX_("thx.TestInts",60,d3,01,52),HX_("testRange",0b,e4,21,ad)));
HXLINE(  17)		range = ::thx::Ints_obj::range((int)2,(int)7,(int)2);
HXLINE(  18)		::utest::Assert_obj::same(::cpp::VirtualArray_obj::__new(3)->init(0,(int)2)->init(1,(int)4)->init(2,(int)6),range,null(),null(),null(),hx::SourceInfo(HX_("TestInts.hx",48,02,2d,c1),18,HX_("thx.TestInts",60,d3,01,52),HX_("testRange",0b,e4,21,ad)));
HXLINE(  19)		range = ::thx::Ints_obj::range((int)2,(int)7,(int)3);
HXLINE(  20)		::utest::Assert_obj::same(::cpp::VirtualArray_obj::__new(2)->init(0,(int)2)->init(1,(int)5),range,null(),null(),null(),hx::SourceInfo(HX_("TestInts.hx",48,02,2d,c1),20,HX_("thx.TestInts",60,d3,01,52),HX_("testRange",0b,e4,21,ad)));
HXLINE(  22)		range = ::thx::Ints_obj::range((int)7,(int)2,(int)-2);
HXLINE(  23)		::utest::Assert_obj::same(::cpp::VirtualArray_obj::__new(3)->init(0,(int)7)->init(1,(int)5)->init(2,(int)3),range,null(),null(),null(),hx::SourceInfo(HX_("TestInts.hx",48,02,2d,c1),23,HX_("thx.TestInts",60,d3,01,52),HX_("testRange",0b,e4,21,ad)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestInts_obj,testRange,(void))

void TestInts_obj::testParse(){
            	HX_STACK_FRAME("thx.TestInts","testParse",0xf6c923f3,"thx.TestInts.testParse","thx/TestInts.hx",26,0x1dfb38fd)
            	HX_STACK_THIS(this)
HXLINE(  27)		HX_VARI( ::Array< ::Dynamic>,tests) = ::Array_obj< ::Dynamic>::__new(23)->init(0, ::Dynamic(hx::Anon_obj::Create(3)
            			->setFixed(0,HX_("b",62,00,00,00),(int)10)
            			->setFixed(1,HX_("e",65,00,00,00),(int)-50)
            			->setFixed(2,HX_("t",74,00,00,00),HX_("-50",c8,53,22,00))))->init(1, ::Dynamic(hx::Anon_obj::Create(3)
            			->setFixed(0,HX_("b",62,00,00,00),(int)10)
            			->setFixed(1,HX_("e",65,00,00,00),(int)50)
            			->setFixed(2,HX_("t",74,00,00,00),HX_("50",5b,2e,00,00))))->init(2, ::Dynamic(hx::Anon_obj::Create(3)
            			->setFixed(0,HX_("b",62,00,00,00),(int)10)
            			->setFixed(1,HX_("e",65,00,00,00),(int)1)
            			->setFixed(2,HX_("t",74,00,00,00),HX_("1",31,00,00,00))))->init(3, ::Dynamic(hx::Anon_obj::Create(3)
            			->setFixed(0,HX_("b",62,00,00,00),(int)10)
            			->setFixed(1,HX_("e",65,00,00,00),(int)1)
            			->setFixed(2,HX_("t",74,00,00,00),HX_("+1",a6,25,00,00))))->init(4, ::Dynamic(hx::Anon_obj::Create(3)
            			->setFixed(0,HX_("b",62,00,00,00),(int)10)
            			->setFixed(1,HX_("e",65,00,00,00),(int)-1)
            			->setFixed(2,HX_("t",74,00,00,00),HX_("-1",64,27,00,00))))->init(5, ::Dynamic(hx::Anon_obj::Create(3)
            			->setFixed(0,HX_("b",62,00,00,00),(int)10)
            			->setFixed(1,HX_("e",65,00,00,00),(int)1)
            			->setFixed(2,HX_("t",74,00,00,00),HX_(" 1 ",ef,72,18,00))))->init(6, ::Dynamic(hx::Anon_obj::Create(3)
            			->setFixed(0,HX_("b",62,00,00,00),(int)10)
            			->setFixed(1,HX_("e",65,00,00,00),(int)1)
            			->setFixed(2,HX_("t",74,00,00,00),HX_(" 1,234",38,79,49,1f))))->init(7, ::Dynamic(hx::Anon_obj::Create(3)
            			->setFixed(0,HX_("b",62,00,00,00),(int)16)
            			->setFixed(1,HX_("e",65,00,00,00),(int)15)
            			->setFixed(2,HX_("t",74,00,00,00),HX_(" 0xF",de,a8,4b,15))))->init(8, ::Dynamic(hx::Anon_obj::Create(3)
            			->setFixed(0,HX_("b",62,00,00,00),(int)8)
            			->setFixed(1,HX_("e",65,00,00,00),(int)15)
            			->setFixed(2,HX_("t",74,00,00,00),HX_("17",e6,2a,00,00))))->init(9, ::Dynamic(hx::Anon_obj::Create(3)
            			->setFixed(0,HX_("b",62,00,00,00),(int)10)
            			->setFixed(1,HX_("e",65,00,00,00),(int)15)
            			->setFixed(2,HX_("t",74,00,00,00),HX_("015",14,97,24,00))))->init(10, ::Dynamic(hx::Anon_obj::Create(3)
            			->setFixed(0,HX_("b",62,00,00,00),(int)2)
            			->setFixed(1,HX_("e",65,00,00,00),(int)15)
            			->setFixed(2,HX_("t",74,00,00,00),HX_("1111",c0,cd,88,20))))->init(11, ::Dynamic(hx::Anon_obj::Create(3)
            			->setFixed(0,HX_("b",62,00,00,00),(int)10)
            			->setFixed(1,HX_("e",65,00,00,00),(int)15)
            			->setFixed(2,HX_("t",74,00,00,00),HX_("15*3",ad,d0,8b,20))))->init(12, ::Dynamic(hx::Anon_obj::Create(3)
            			->setFixed(0,HX_("b",62,00,00,00),(int)10)
            			->setFixed(1,HX_("e",65,00,00,00),(int)15)
            			->setFixed(2,HX_("t",74,00,00,00),HX_("15e2",11,04,8c,20))))->init(13, ::Dynamic(hx::Anon_obj::Create(3)
            			->setFixed(0,HX_("b",62,00,00,00),(int)10)
            			->setFixed(1,HX_("e",65,00,00,00),(int)15)
            			->setFixed(2,HX_("t",74,00,00,00),HX_("15px",ec,0d,8c,20))))->init(14, ::Dynamic(hx::Anon_obj::Create(3)
            			->setFixed(0,HX_("b",62,00,00,00),(int)13)
            			->setFixed(1,HX_("e",65,00,00,00),(int)15)
            			->setFixed(2,HX_("t",74,00,00,00),HX_("12",e1,2a,00,00))))->init(15, ::Dynamic(hx::Anon_obj::Create(3)
            			->setFixed(0,HX_("b",62,00,00,00),(int)16)
            			->setFixed(1,HX_("e",65,00,00,00),(int)-15)
            			->setFixed(2,HX_("t",74,00,00,00),HX_("-0F",83,4f,22,00))))->init(16, ::Dynamic(hx::Anon_obj::Create(3)
            			->setFixed(0,HX_("b",62,00,00,00),(int)16)
            			->setFixed(1,HX_("e",65,00,00,00),(int)-15)
            			->setFixed(2,HX_("t",74,00,00,00),HX_("-0XF",11,53,e3,1d))))->init(17, ::Dynamic(hx::Anon_obj::Create(3)
            			->setFixed(0,HX_("b",62,00,00,00),(int)8)
            			->setFixed(1,HX_("e",65,00,00,00),(int)-15)
            			->setFixed(2,HX_("t",74,00,00,00),HX_(" -17",33,24,49,15))))->init(18, ::Dynamic(hx::Anon_obj::Create(3)
            			->setFixed(0,HX_("b",62,00,00,00),(int)10)
            			->setFixed(1,HX_("e",65,00,00,00),(int)-15)
            			->setFixed(2,HX_("t",74,00,00,00),HX_(" -15",31,24,49,15))))->init(19, ::Dynamic(hx::Anon_obj::Create(3)
            			->setFixed(0,HX_("b",62,00,00,00),(int)2)
            			->setFixed(1,HX_("e",65,00,00,00),(int)-15)
            			->setFixed(2,HX_("t",74,00,00,00),HX_("-1111",6d,e8,90,09))))->init(20, ::Dynamic(hx::Anon_obj::Create(3)
            			->setFixed(0,HX_("b",62,00,00,00),(int)10)
            			->setFixed(1,HX_("e",65,00,00,00),(int)-15)
            			->setFixed(2,HX_("t",74,00,00,00),HX_("-15e1",bd,1e,94,09))))->init(21, ::Dynamic(hx::Anon_obj::Create(3)
            			->setFixed(0,HX_("b",62,00,00,00),(int)13)
            			->setFixed(1,HX_("e",65,00,00,00),(int)-15)
            			->setFixed(2,HX_("t",74,00,00,00),HX_("-12",4e,50,22,00))))->init(22, ::Dynamic(hx::Anon_obj::Create(3)
            			->setFixed(0,HX_("b",62,00,00,00),(int)16)
            			->setFixed(1,HX_("e",65,00,00,00),(int)224)
            			->setFixed(2,HX_("t",74,00,00,00),HX_("0e0",5b,c4,24,00))));
HXLINE(  54)		{
HXLINE(  54)			HX_VARI( Int,_g) = (int)0;
HXDLIN(  54)			while((_g < tests->length)){
HXLINE(  54)				HX_VARI(  ::Dynamic,test) = tests->__get(_g);
HXDLIN(  54)				++_g;
HXLINE(  55)				Bool _hx_tmp = ::thx::Ints_obj::canParse( ::Dynamic(test->__Field(HX_("t",74,00,00,00),hx::paccDynamic)));
HXDLIN(  55)				::utest::Assert_obj::isTrue(_hx_tmp,(HX_("Ints.parse should not be able to parse ",c6,47,b5,7b) + ( (::String)(test->__Field(HX_("t",74,00,00,00),hx::paccDynamic)) )),hx::SourceInfo(HX_("TestInts.hx",48,02,2d,c1),55,HX_("thx.TestInts",60,d3,01,52),HX_("testParse",81,ce,57,86)));
HXLINE(  56)				Int _hx_tmp1 = ( (Int)(test->__Field(HX_("e",65,00,00,00),hx::paccDynamic)) );
HXDLIN(  56)				 ::Dynamic _hx_tmp2 = ::thx::Ints_obj::parse( ::Dynamic(test->__Field(HX_("t",74,00,00,00),hx::paccDynamic)), ::Dynamic(test->__Field(HX_("b",62,00,00,00),hx::paccDynamic)));
HXDLIN(  56)				::String _hx_tmp3 = ((((((HX_("expected ",a8,7a,f8,e9) + ( (Int)(test->__Field(HX_("e",65,00,00,00),hx::paccDynamic)) )) + HX_(" converting \"",b1,e6,bf,15)) + ( (::String)(test->__Field(HX_("t",74,00,00,00),hx::paccDynamic)) )) + HX_("\" with base ",93,68,95,07)) + ( (Int)(test->__Field(HX_("b",62,00,00,00),hx::paccDynamic)) )) + HX_(" but got ",b3,1a,6e,57));
HXDLIN(  56)				 ::Dynamic _hx_tmp4 = ::thx::Ints_obj::parse( ::Dynamic(test->__Field(HX_("t",74,00,00,00),hx::paccDynamic)), ::Dynamic(test->__Field(HX_("b",62,00,00,00),hx::paccDynamic)));
HXDLIN(  56)				::utest::Assert_obj::equals(_hx_tmp1,_hx_tmp2,(_hx_tmp3 + _hx_tmp4),hx::SourceInfo(HX_("TestInts.hx",48,02,2d,c1),56,HX_("thx.TestInts",60,d3,01,52),HX_("testParse",81,ce,57,86)));
            			}
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestInts_obj,testParse,(void))

void TestInts_obj::testToString(){
            	HX_STACK_FRAME("thx.TestInts","testToString",0xd22214ec,"thx.TestInts.testToString","thx/TestInts.hx",60,0x1dfb38fd)
            	HX_STACK_THIS(this)
HXLINE(  61)		HX_VARI( ::Array< ::Dynamic>,tests) = ::Array_obj< ::Dynamic>::__new(4)->init(0, ::Dynamic(hx::Anon_obj::Create(3)
            			->setFixed(0,HX_("b",62,00,00,00),(int)2)
            			->setFixed(1,HX_("e",65,00,00,00),HX_("1010",7e,0b,88,20))
            			->setFixed(2,HX_("t",74,00,00,00),(int)10)))->init(1, ::Dynamic(hx::Anon_obj::Create(3)
            			->setFixed(0,HX_("b",62,00,00,00),(int)8)
            			->setFixed(1,HX_("e",65,00,00,00),HX_("12",e1,2a,00,00))
            			->setFixed(2,HX_("t",74,00,00,00),(int)10)))->init(2, ::Dynamic(hx::Anon_obj::Create(3)
            			->setFixed(0,HX_("b",62,00,00,00),(int)10)
            			->setFixed(1,HX_("e",65,00,00,00),HX_("10",df,2a,00,00))
            			->setFixed(2,HX_("t",74,00,00,00),(int)10)))->init(3, ::Dynamic(hx::Anon_obj::Create(3)
            			->setFixed(0,HX_("b",62,00,00,00),(int)16)
            			->setFixed(1,HX_("e",65,00,00,00),HX_("a",61,00,00,00))
            			->setFixed(2,HX_("t",74,00,00,00),(int)10)));
HXLINE(  68)		{
HXLINE(  68)			HX_VARI( Int,_g) = (int)0;
HXDLIN(  68)			while((_g < tests->length)){
HXLINE(  68)				HX_VARI(  ::Dynamic,test) = tests->__get(_g);
HXDLIN(  68)				++_g;
HXLINE(  69)				::String _hx_tmp = ::thx::Ints_obj::toString( ::Dynamic(test->__Field(HX_("t",74,00,00,00),hx::paccDynamic)), ::Dynamic(test->__Field(HX_("b",62,00,00,00),hx::paccDynamic)));
HXDLIN(  69)				::utest::Assert_obj::equals( ::Dynamic(test->__Field(HX_("e",65,00,00,00),hx::paccDynamic)),_hx_tmp,null(),hx::SourceInfo(HX_("TestInts.hx",48,02,2d,c1),69,HX_("thx.TestInts",60,d3,01,52),HX_("testToString",1e,f7,75,ab)));
            			}
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestInts_obj,testToString,(void))


TestInts_obj::TestInts_obj()
{
}

hx::Val TestInts_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 9:
		if (HX_FIELD_EQ(inName,"testRange") ) { return hx::Val( testRange_dyn()); }
		if (HX_FIELD_EQ(inName,"testParse") ) { return hx::Val( testParse_dyn()); }
		break;
	case 12:
		if (HX_FIELD_EQ(inName,"testToString") ) { return hx::Val( testToString_dyn()); }
	}
	return super::__Field(inName,inCallProp);
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *TestInts_obj_sMemberStorageInfo = 0;
static hx::StaticInfo *TestInts_obj_sStaticStorageInfo = 0;
#endif

static ::String TestInts_obj_sMemberFields[] = {
	HX_HCSTRING("testRange","\x0b","\xe4","\x21","\xad"),
	HX_HCSTRING("testParse","\x81","\xce","\x57","\x86"),
	HX_HCSTRING("testToString","\x1e","\xf7","\x75","\xab"),
	::String(null()) };

static void TestInts_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(TestInts_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void TestInts_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(TestInts_obj::__mClass,"__mClass");
};

#endif

hx::Class TestInts_obj::__mClass;

void TestInts_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.TestInts","\x60","\xd3","\x01","\x52");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &hx::Class_obj::GetNoStaticField;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = TestInts_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(0 /* sStaticFields */);
	__mClass->mMembers = hx::Class_obj::dupFunctions(TestInts_obj_sMemberFields);
	__mClass->mCanCast = hx::TCanCast< TestInts_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = TestInts_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = TestInts_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = TestInts_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx
