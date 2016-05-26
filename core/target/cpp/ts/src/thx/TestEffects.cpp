// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_thx_Effects
#include <thx/Effects.h>
#endif
#ifndef INCLUDED_thx_TestEffects
#include <thx/TestEffects.h>
#endif
#ifndef INCLUDED_utest_Assert
#include <utest/Assert.h>
#endif

namespace thx{

void TestEffects_obj::__construct(){
            	HX_STACK_FRAME("thx.TestEffects","new",0x83590f78,"thx.TestEffects.new","thx/TestEffects.hx",7,0x52fd26b9)
            	HX_STACK_THIS(this)
            	}

Dynamic TestEffects_obj::__CreateEmpty() { return new TestEffects_obj; }

hx::ObjectPtr< TestEffects_obj > TestEffects_obj::__new()
{
	hx::ObjectPtr< TestEffects_obj > _hx_result = new TestEffects_obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic TestEffects_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< TestEffects_obj > _hx_result = new TestEffects_obj();
	_hx_result->__construct();
	return _hx_result;
}

void TestEffects_obj::logger( ::Dynamic msg, ::Dynamic infos){
            	HX_STACK_FRAME("thx.TestEffects","logger",0x7ed21678,"thx.TestEffects.logger","thx/TestEffects.hx",12,0x52fd26b9)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(msg,"msg")
            	HX_STACK_ARG(infos,"infos")
HXLINE(  12)		this->logged = msg;
            	}


HX_DEFINE_DYNAMIC_FUNC2(TestEffects_obj,logger,(void))

void TestEffects_obj::setup(){
            	HX_STACK_FRAME("thx.TestEffects","setup",0xb854e395,"thx.TestEffects.setup","thx/TestEffects.hx",15,0x52fd26b9)
            	HX_STACK_THIS(this)
HXLINE(  16)		this->logged = null();
HXLINE(  17)		this->oldLogger = ::thx::Effects_obj::logger;
HXLINE(  18)		::thx::Effects_obj::logger = this->logger_dyn();
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestEffects_obj,setup,(void))

void TestEffects_obj::teardown(){
            	HX_STACK_FRAME("thx.TestEffects","teardown",0x80b4b3ec,"thx.TestEffects.teardown","thx/TestEffects.hx",22,0x52fd26b9)
            	HX_STACK_THIS(this)
HXLINE(  22)		::thx::Effects_obj::logger = this->oldLogger;
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestEffects_obj,teardown,(void))

void TestEffects_obj::testEffectsLog(){
            		HX_BEGIN_LOCAL_FUNC_S1(hx::LocalFunc,_hx_Closure_0, ::Dynamic,a2) HXARGC(1)
            		void _hx_run( ::Dynamic a1){
            			HX_STACK_FRAME("thx.TestEffects","testEffectsLog",0x2eaa9bbc,"thx.TestEffects.testEffectsLog","thx/TestEffects.hx",28,0x52fd26b9)
            			HX_STACK_ARG(a1,"a1")
HXLINE(  28)			::thx::Effects_obj::logger(a1,a2);
            		}
            		HX_END_LOCAL_FUNC1((void))

            	HX_STACK_FRAME("thx.TestEffects","testEffectsLog",0x2eaa9bbc,"thx.TestEffects.testEffectsLog","thx/TestEffects.hx",25,0x52fd26b9)
            	HX_STACK_THIS(this)
HXLINE(  26)		::utest::Assert_obj::isNull(this->logged,null(),hx::SourceInfo(HX_("TestEffects.hx",4e,fe,e1,11),26,HX_("thx.TestEffects",86,33,56,ea),HX_("testEffectsLog",d4,33,a3,67)));
HXLINE(  28)		HX_VARI(  ::Dynamic,a2) = hx::SourceInfo(HX_("TestEffects.hx",4e,fe,e1,11),28,HX_("thx.TestEffects",86,33,56,ea),HX_("testEffectsLog",d4,33,a3,67));
HXDLIN(  28)		 ::Dynamic(new _hx_Closure_0(a2))((int)2);
HXLINE(  29)		::utest::Assert_obj::equals((int)2,(int)2,null(),hx::SourceInfo(HX_("TestEffects.hx",4e,fe,e1,11),29,HX_("thx.TestEffects",86,33,56,ea),HX_("testEffectsLog",d4,33,a3,67)));
HXLINE(  30)		::utest::Assert_obj::equals((int)2,this->logged,null(),hx::SourceInfo(HX_("TestEffects.hx",4e,fe,e1,11),30,HX_("thx.TestEffects",86,33,56,ea),HX_("testEffectsLog",d4,33,a3,67)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestEffects_obj,testEffectsLog,(void))


TestEffects_obj::TestEffects_obj()
{
}

void TestEffects_obj::__Mark(HX_MARK_PARAMS)
{
	HX_MARK_BEGIN_CLASS(TestEffects);
	HX_MARK_MEMBER_NAME(logged,"logged");
	HX_MARK_MEMBER_NAME(oldLogger,"oldLogger");
	HX_MARK_END_CLASS();
}

void TestEffects_obj::__Visit(HX_VISIT_PARAMS)
{
	HX_VISIT_MEMBER_NAME(logged,"logged");
	HX_VISIT_MEMBER_NAME(oldLogger,"oldLogger");
}

hx::Val TestEffects_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 5:
		if (HX_FIELD_EQ(inName,"setup") ) { return hx::Val( setup_dyn()); }
		break;
	case 6:
		if (HX_FIELD_EQ(inName,"logged") ) { return hx::Val( logged); }
		if (HX_FIELD_EQ(inName,"logger") ) { return hx::Val( logger_dyn()); }
		break;
	case 8:
		if (HX_FIELD_EQ(inName,"teardown") ) { return hx::Val( teardown_dyn()); }
		break;
	case 9:
		if (HX_FIELD_EQ(inName,"oldLogger") ) { return hx::Val( oldLogger); }
		break;
	case 14:
		if (HX_FIELD_EQ(inName,"testEffectsLog") ) { return hx::Val( testEffectsLog_dyn()); }
	}
	return super::__Field(inName,inCallProp);
}

hx::Val TestEffects_obj::__SetField(const ::String &inName,const hx::Val &inValue,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 6:
		if (HX_FIELD_EQ(inName,"logged") ) { logged=inValue.Cast<  ::Dynamic >(); return inValue; }
		break;
	case 9:
		if (HX_FIELD_EQ(inName,"oldLogger") ) { oldLogger=inValue.Cast<  ::Dynamic >(); return inValue; }
	}
	return super::__SetField(inName,inValue,inCallProp);
}

void TestEffects_obj::__GetFields(Array< ::String> &outFields)
{
	outFields->push(HX_HCSTRING("logged","\x82","\xd6","\x68","\x5c"));
	super::__GetFields(outFields);
};

#if HXCPP_SCRIPTABLE
static hx::StorageInfo TestEffects_obj_sMemberStorageInfo[] = {
	{hx::fsObject /*Dynamic*/ ,(int)offsetof(TestEffects_obj,logged),HX_HCSTRING("logged","\x82","\xd6","\x68","\x5c")},
	{hx::fsObject /*Dynamic*/ ,(int)offsetof(TestEffects_obj,oldLogger),HX_HCSTRING("oldLogger","\x97","\x5a","\x54","\x67")},
	{ hx::fsUnknown, 0, null()}
};
static hx::StaticInfo *TestEffects_obj_sStaticStorageInfo = 0;
#endif

static ::String TestEffects_obj_sMemberFields[] = {
	HX_HCSTRING("logged","\x82","\xd6","\x68","\x5c"),
	HX_HCSTRING("oldLogger","\x97","\x5a","\x54","\x67"),
	HX_HCSTRING("logger","\x90","\xd6","\x68","\x5c"),
	HX_HCSTRING("setup","\x7d","\xae","\x2f","\x7a"),
	HX_HCSTRING("teardown","\x04","\xaa","\x8d","\x01"),
	HX_HCSTRING("testEffectsLog","\xd4","\x33","\xa3","\x67"),
	::String(null()) };

static void TestEffects_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(TestEffects_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void TestEffects_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(TestEffects_obj::__mClass,"__mClass");
};

#endif

hx::Class TestEffects_obj::__mClass;

void TestEffects_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.TestEffects","\x86","\x33","\x56","\xea");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &hx::Class_obj::GetNoStaticField;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = TestEffects_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(0 /* sStaticFields */);
	__mClass->mMembers = hx::Class_obj::dupFunctions(TestEffects_obj_sMemberFields);
	__mClass->mCanCast = hx::TCanCast< TestEffects_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = TestEffects_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = TestEffects_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = TestEffects_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx
