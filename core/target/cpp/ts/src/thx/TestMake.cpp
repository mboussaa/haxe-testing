// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_thx_TestMake
#include <thx/TestMake.h>
#endif
#ifndef INCLUDED_utest_Assert
#include <utest/Assert.h>
#endif

namespace thx{

void TestMake_obj::__construct(){
            	HX_STACK_FRAME("thx.TestMake","new",0xf77b069c,"thx.TestMake.new","thx/TestMake.hx",6,0x59d12df3)
            	HX_STACK_THIS(this)
            	}

Dynamic TestMake_obj::__CreateEmpty() { return new TestMake_obj; }

hx::ObjectPtr< TestMake_obj > TestMake_obj::__new()
{
	hx::ObjectPtr< TestMake_obj > _hx_result = new TestMake_obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic TestMake_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< TestMake_obj > _hx_result = new TestMake_obj();
	_hx_result->__construct();
	return _hx_result;
}

void TestMake_obj::testConstructorLiteral(){
            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_0) HXARGC(4)
            		 ::Dynamic _hx_run(::String c,Int b,Float a,::String d){
            			HX_STACK_FRAME("thx.TestMake","testConstructorLiteral",0x43701fcb,"thx.TestMake.testConstructorLiteral","thx/TestMake.hx",9,0x59d12df3)
            			HX_STACK_ARG(c,"c")
            			HX_STACK_ARG(b,"b")
            			HX_STACK_ARG(a,"a")
            			HX_STACK_ARG(d,"d")
HXLINE(   9)			return  ::Dynamic(hx::Anon_obj::Create(4)
            				->setFixed(0,HX_("a",61,00,00,00),a)
            				->setFixed(1,HX_("b",62,00,00,00),b)
            				->setFixed(2,HX_("c",63,00,00,00),c)
            				->setFixed(3,HX_("d",64,00,00,00),d));
            		}
            		HX_END_LOCAL_FUNC4(return)

            	HX_STACK_FRAME("thx.TestMake","testConstructorLiteral",0x43701fcb,"thx.TestMake.testConstructorLiteral","thx/TestMake.hx",8,0x59d12df3)
            	HX_STACK_THIS(this)
HXLINE(  15)		 ::Dynamic _hx_tmp =  ::Dynamic(new _hx_Closure_0())(HX_("A",41,00,00,00),(int)1,((Float)0.2),HX_("D",44,00,00,00));
HXLINE(  10)		::utest::Assert_obj::same( ::Dynamic(hx::Anon_obj::Create(4)
            			->setFixed(0,HX_("a",61,00,00,00),((Float)0.2))
            			->setFixed(1,HX_("b",62,00,00,00),(int)1)
            			->setFixed(2,HX_("c",63,00,00,00),HX_("A",41,00,00,00))
            			->setFixed(3,HX_("d",64,00,00,00),HX_("D",44,00,00,00))),_hx_tmp,null(),null(),null(),hx::SourceInfo(HX_("TestMake.hx",3e,f7,02,fd),10,HX_("thx.TestMake",aa,c8,9c,54),HX_("testConstructorLiteral",87,00,e7,8b)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestMake_obj,testConstructorLiteral,(void))

void TestMake_obj::testConstructorFromTypedef(){
            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_0) HXARGC(4)
            		 ::Dynamic _hx_run(::String c,Int b, ::Dynamic a,::String d){
            			HX_STACK_FRAME("thx.TestMake","testConstructorFromTypedef",0xbbbd6f5d,"thx.TestMake.testConstructorFromTypedef","thx/TestMake.hx",19,0x59d12df3)
            			HX_STACK_ARG(c,"c")
            			HX_STACK_ARG(b,"b")
            			HX_STACK_ARG(a,"a")
            			HX_STACK_ARG(d,"d")
HXLINE(  19)			HX_VARI(  ::Dynamic,obj) =  ::Dynamic(hx::Anon_obj::Create(3)
            				->setFixed(0,HX_("b",62,00,00,00),b)
            				->setFixed(1,HX_("c",63,00,00,00),c)
            				->setFixed(2,HX_("d",64,00,00,00),d));
HXDLIN(  19)			if (hx::IsNotNull( a )) {
HXLINE(  19)				obj->__SetField(HX_("a",61,00,00,00),a,hx::paccDynamic);
            			}
HXDLIN(  19)			return obj;
            		}
            		HX_END_LOCAL_FUNC4(return)

            	HX_STACK_FRAME("thx.TestMake","testConstructorFromTypedef",0xbbbd6f5d,"thx.TestMake.testConstructorFromTypedef","thx/TestMake.hx",18,0x59d12df3)
            	HX_STACK_THIS(this)
HXLINE(  19)		HX_VARI(  ::Dynamic,constructor) =  ::Dynamic(new _hx_Closure_0());
HXLINE(  25)		 ::Dynamic _hx_tmp = constructor(HX_("A",41,00,00,00),(int)1,((Float)0.2),HX_("D",44,00,00,00));
HXLINE(  20)		::utest::Assert_obj::same( ::Dynamic(hx::Anon_obj::Create(4)
            			->setFixed(0,HX_("a",61,00,00,00),((Float)0.2))
            			->setFixed(1,HX_("b",62,00,00,00),(int)1)
            			->setFixed(2,HX_("c",63,00,00,00),HX_("A",41,00,00,00))
            			->setFixed(3,HX_("d",64,00,00,00),HX_("D",44,00,00,00))),_hx_tmp,null(),null(),null(),hx::SourceInfo(HX_("TestMake.hx",3e,f7,02,fd),20,HX_("thx.TestMake",aa,c8,9c,54),HX_("testConstructorFromTypedef",19,5e,79,78)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestMake_obj,testConstructorFromTypedef,(void))


TestMake_obj::TestMake_obj()
{
}

hx::Val TestMake_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 22:
		if (HX_FIELD_EQ(inName,"testConstructorLiteral") ) { return hx::Val( testConstructorLiteral_dyn()); }
		break;
	case 26:
		if (HX_FIELD_EQ(inName,"testConstructorFromTypedef") ) { return hx::Val( testConstructorFromTypedef_dyn()); }
	}
	return super::__Field(inName,inCallProp);
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *TestMake_obj_sMemberStorageInfo = 0;
static hx::StaticInfo *TestMake_obj_sStaticStorageInfo = 0;
#endif

static ::String TestMake_obj_sMemberFields[] = {
	HX_HCSTRING("testConstructorLiteral","\x87","\x00","\xe7","\x8b"),
	HX_HCSTRING("testConstructorFromTypedef","\x19","\x5e","\x79","\x78"),
	::String(null()) };

static void TestMake_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(TestMake_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void TestMake_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(TestMake_obj::__mClass,"__mClass");
};

#endif

hx::Class TestMake_obj::__mClass;

void TestMake_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.TestMake","\xaa","\xc8","\x9c","\x54");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &hx::Class_obj::GetNoStaticField;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = TestMake_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(0 /* sStaticFields */);
	__mClass->mMembers = hx::Class_obj::dupFunctions(TestMake_obj_sMemberFields);
	__mClass->mCanCast = hx::TCanCast< TestMake_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = TestMake_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = TestMake_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = TestMake_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx