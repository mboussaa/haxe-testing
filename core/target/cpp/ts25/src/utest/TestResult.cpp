// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_List
#include <List.h>
#endif
#ifndef INCLUDED_Type
#include <Type.h>
#endif
#ifndef INCLUDED__List_ListNode
#include <_List/ListNode.h>
#endif
#ifndef INCLUDED_utest_Assertation
#include <utest/Assertation.h>
#endif
#ifndef INCLUDED_utest_TestFixture
#include <utest/TestFixture.h>
#endif
#ifndef INCLUDED_utest_TestHandler
#include <utest/TestHandler.h>
#endif
#ifndef INCLUDED_utest_TestResult
#include <utest/TestResult.h>
#endif

namespace utest{

void TestResult_obj::__construct(){
            	HX_STACK_FRAME("utest.TestResult","new",0x21554ca8,"utest.TestResult.new","utest/TestResult.hx",13,0xf67c5327)
            	HX_STACK_THIS(this)
            	}

Dynamic TestResult_obj::__CreateEmpty() { return new TestResult_obj; }

hx::ObjectPtr< TestResult_obj > TestResult_obj::__new()
{
	hx::ObjectPtr< TestResult_obj > _hx_result = new TestResult_obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic TestResult_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< TestResult_obj > _hx_result = new TestResult_obj();
	_hx_result->__construct();
	return _hx_result;
}

Bool TestResult_obj::allOk(){
            	HX_STACK_FRAME("utest.TestResult","allOk",0xa322a6e5,"utest.TestResult.allOk","utest/TestResult.hx",27,0xf67c5327)
            	HX_STACK_THIS(this)
HXLINE(  28)		{
HXLINE(  28)			HX_VARI(  ::_List::ListNode,_g_head) = this->assertations->h;
HXDLIN(  28)			while(hx::IsNotNull( _g_head )){
HXLINE(  28)				HX_VARI( ::hx::EnumBase,val) = _g_head->item;
HXLINE(  27)				_g_head = _g_head->next;
HXLINE(  29)				Int _hx_tmp = ( ( ::hx::EnumBase)(val) )->_hx_getIndex();
HXDLIN(  29)				if ((_hx_tmp == (int)0)) {
HXLINE(  30)					goto _hx_goto_0;
            				}
            				else {
HXLINE(  31)					return false;
            				}
            			}
            			_hx_goto_0:;
            		}
HXLINE(  34)		return true;
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestResult_obj,allOk,return )

 ::utest::TestResult TestResult_obj::ofHandler( ::utest::TestHandler handler){
            	HX_STACK_FRAME("utest.TestResult","ofHandler",0xc33cb9bb,"utest.TestResult.ofHandler","utest/TestResult.hx",15,0xf67c5327)
            	HX_STACK_ARG(handler,"handler")
HXLINE(  16)		HX_VARI(  ::utest::TestResult,r) =  ::utest::TestResult_obj::__new();
HXLINE(  17)		hx::Class _hx_tmp = ::Type_obj::getClass(handler->fixture->target);
HXDLIN(  17)		HX_VARI( ::Array< ::String >,path) = ::Type_obj::getClassName(_hx_tmp).split(HX_(".",2e,00,00,00));
HXLINE(  18)		r->cls = ( (::String)(path->pop()) );
HXLINE(  19)		r->pack = path->join(HX_(".",2e,00,00,00));
HXLINE(  20)		r->method = handler->fixture->method;
HXLINE(  21)		r->setup = handler->fixture->setup;
HXLINE(  22)		r->teardown = handler->fixture->teardown;
HXLINE(  23)		r->assertations = handler->results;
HXLINE(  24)		return r;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(TestResult_obj,ofHandler,return )


TestResult_obj::TestResult_obj()
{
}

void TestResult_obj::__Mark(HX_MARK_PARAMS)
{
	HX_MARK_BEGIN_CLASS(TestResult);
	HX_MARK_MEMBER_NAME(pack,"pack");
	HX_MARK_MEMBER_NAME(cls,"cls");
	HX_MARK_MEMBER_NAME(method,"method");
	HX_MARK_MEMBER_NAME(setup,"setup");
	HX_MARK_MEMBER_NAME(teardown,"teardown");
	HX_MARK_MEMBER_NAME(assertations,"assertations");
	HX_MARK_END_CLASS();
}

void TestResult_obj::__Visit(HX_VISIT_PARAMS)
{
	HX_VISIT_MEMBER_NAME(pack,"pack");
	HX_VISIT_MEMBER_NAME(cls,"cls");
	HX_VISIT_MEMBER_NAME(method,"method");
	HX_VISIT_MEMBER_NAME(setup,"setup");
	HX_VISIT_MEMBER_NAME(teardown,"teardown");
	HX_VISIT_MEMBER_NAME(assertations,"assertations");
}

hx::Val TestResult_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 3:
		if (HX_FIELD_EQ(inName,"cls") ) { return hx::Val( cls); }
		break;
	case 4:
		if (HX_FIELD_EQ(inName,"pack") ) { return hx::Val( pack); }
		break;
	case 5:
		if (HX_FIELD_EQ(inName,"setup") ) { return hx::Val( setup); }
		if (HX_FIELD_EQ(inName,"allOk") ) { return hx::Val( allOk_dyn()); }
		break;
	case 6:
		if (HX_FIELD_EQ(inName,"method") ) { return hx::Val( method); }
		break;
	case 8:
		if (HX_FIELD_EQ(inName,"teardown") ) { return hx::Val( teardown); }
		break;
	case 12:
		if (HX_FIELD_EQ(inName,"assertations") ) { return hx::Val( assertations); }
	}
	return super::__Field(inName,inCallProp);
}

bool TestResult_obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 9:
		if (HX_FIELD_EQ(inName,"ofHandler") ) { outValue = ofHandler_dyn(); return true; }
	}
	return false;
}

hx::Val TestResult_obj::__SetField(const ::String &inName,const hx::Val &inValue,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 3:
		if (HX_FIELD_EQ(inName,"cls") ) { cls=inValue.Cast< ::String >(); return inValue; }
		break;
	case 4:
		if (HX_FIELD_EQ(inName,"pack") ) { pack=inValue.Cast< ::String >(); return inValue; }
		break;
	case 5:
		if (HX_FIELD_EQ(inName,"setup") ) { setup=inValue.Cast< ::String >(); return inValue; }
		break;
	case 6:
		if (HX_FIELD_EQ(inName,"method") ) { method=inValue.Cast< ::String >(); return inValue; }
		break;
	case 8:
		if (HX_FIELD_EQ(inName,"teardown") ) { teardown=inValue.Cast< ::String >(); return inValue; }
		break;
	case 12:
		if (HX_FIELD_EQ(inName,"assertations") ) { assertations=inValue.Cast<  ::List >(); return inValue; }
	}
	return super::__SetField(inName,inValue,inCallProp);
}

void TestResult_obj::__GetFields(Array< ::String> &outFields)
{
	outFields->push(HX_HCSTRING("pack","\xd9","\xd6","\x51","\x4a"));
	outFields->push(HX_HCSTRING("cls","\xaa","\x7d","\x4b","\x00"));
	outFields->push(HX_HCSTRING("method","\xe1","\xf6","\x5a","\x09"));
	outFields->push(HX_HCSTRING("setup","\x7d","\xae","\x2f","\x7a"));
	outFields->push(HX_HCSTRING("teardown","\x04","\xaa","\x8d","\x01"));
	outFields->push(HX_HCSTRING("assertations","\x64","\xeb","\x2a","\x91"));
	super::__GetFields(outFields);
};

#if HXCPP_SCRIPTABLE
static hx::StorageInfo TestResult_obj_sMemberStorageInfo[] = {
	{hx::fsString,(int)offsetof(TestResult_obj,pack),HX_HCSTRING("pack","\xd9","\xd6","\x51","\x4a")},
	{hx::fsString,(int)offsetof(TestResult_obj,cls),HX_HCSTRING("cls","\xaa","\x7d","\x4b","\x00")},
	{hx::fsString,(int)offsetof(TestResult_obj,method),HX_HCSTRING("method","\xe1","\xf6","\x5a","\x09")},
	{hx::fsString,(int)offsetof(TestResult_obj,setup),HX_HCSTRING("setup","\x7d","\xae","\x2f","\x7a")},
	{hx::fsString,(int)offsetof(TestResult_obj,teardown),HX_HCSTRING("teardown","\x04","\xaa","\x8d","\x01")},
	{hx::fsObject /*::List*/ ,(int)offsetof(TestResult_obj,assertations),HX_HCSTRING("assertations","\x64","\xeb","\x2a","\x91")},
	{ hx::fsUnknown, 0, null()}
};
static hx::StaticInfo *TestResult_obj_sStaticStorageInfo = 0;
#endif

static ::String TestResult_obj_sMemberFields[] = {
	HX_HCSTRING("pack","\xd9","\xd6","\x51","\x4a"),
	HX_HCSTRING("cls","\xaa","\x7d","\x4b","\x00"),
	HX_HCSTRING("method","\xe1","\xf6","\x5a","\x09"),
	HX_HCSTRING("setup","\x7d","\xae","\x2f","\x7a"),
	HX_HCSTRING("teardown","\x04","\xaa","\x8d","\x01"),
	HX_HCSTRING("assertations","\x64","\xeb","\x2a","\x91"),
	HX_HCSTRING("allOk","\x9d","\x88","\x93","\x21"),
	::String(null()) };

static void TestResult_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(TestResult_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void TestResult_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(TestResult_obj::__mClass,"__mClass");
};

#endif

hx::Class TestResult_obj::__mClass;

static ::String TestResult_obj_sStaticFields[] = {
	HX_HCSTRING("ofHandler","\x73","\xd7","\xec","\x53"),
	::String(null())
};

void TestResult_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("utest.TestResult","\xb6","\x18","\xc0","\xb9");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &TestResult_obj::__GetStatic;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = TestResult_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(TestResult_obj_sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(TestResult_obj_sMemberFields);
	__mClass->mCanCast = hx::TCanCast< TestResult_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = TestResult_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = TestResult_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = TestResult_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace utest
