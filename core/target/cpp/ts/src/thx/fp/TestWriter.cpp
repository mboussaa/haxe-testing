// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_thx_Strings
#include <thx/Strings.h>
#endif
#ifndef INCLUDED_thx_Unit
#include <thx/Unit.h>
#endif
#ifndef INCLUDED_thx__Monoid_Monoid_Impl_
#include <thx/_Monoid/Monoid_Impl_.h>
#endif
#ifndef INCLUDED_thx__Tuple_Tuple3_Impl_
#include <thx/_Tuple/Tuple3_Impl_.h>
#endif
#ifndef INCLUDED_thx_fp_TestWriter
#include <thx/fp/TestWriter.h>
#endif
#ifndef INCLUDED_thx_fp__Writer_Writer_Impl_
#include <thx/fp/_Writer/Writer_Impl_.h>
#endif
#ifndef INCLUDED_utest_Assert
#include <utest/Assert.h>
#endif

namespace thx{
namespace fp{

void TestWriter_obj::__construct(){
            	HX_STACK_FRAME("thx.fp.TestWriter","new",0xec592471,"thx.fp.TestWriter.new","thx/fp/TestWriter.hx",11,0x4a22197f)
            	HX_STACK_THIS(this)
            	}

Dynamic TestWriter_obj::__CreateEmpty() { return new TestWriter_obj; }

hx::ObjectPtr< TestWriter_obj > TestWriter_obj::__new()
{
	hx::ObjectPtr< TestWriter_obj > _hx_result = new TestWriter_obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic TestWriter_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< TestWriter_obj > _hx_result = new TestWriter_obj();
	_hx_result->__construct();
	return _hx_result;
}

void TestWriter_obj::testMap(){
            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_0) HXARGC(1)
            		Int _hx_run(Int v){
            			HX_STACK_FRAME("thx.fp.TestWriter","testMap",0x02d0a9fb,"thx.fp.TestWriter.testMap","thx/fp/TestWriter.hx",14,0x4a22197f)
            			HX_STACK_ARG(v,"v")
HXLINE(  14)			return (v + (int)1);
            		}
            		HX_END_LOCAL_FUNC1(return)

            	HX_STACK_FRAME("thx.fp.TestWriter","testMap",0x02d0a9fb,"thx.fp.TestWriter.testMap","thx/fp/TestWriter.hx",13,0x4a22197f)
            	HX_STACK_THIS(this)
HXLINE(  14)		HX_VARI(  ::Dynamic,mw) = ::thx::Strings_obj::monoid;
HXDLIN(  14)		 ::Dynamic _hx_tmp = ::thx::_Tuple::Tuple3_Impl__obj::map(::thx::fp::_Writer::Writer_Impl__obj::_new( ::Dynamic(hx::Anon_obj::Create(3)
            			->setFixed(0,HX_("_0",f1,52,00,00),mw)
            			->setFixed(1,HX_("_1",f2,52,00,00),::thx::_Monoid::Monoid_Impl__obj::get_zero(mw))
            			->setFixed(2,HX_("_2",f3,52,00,00),(int)1))), ::Dynamic(new _hx_Closure_0()));
HXLINE(  15)		::utest::Assert_obj::same( ::Dynamic(hx::Anon_obj::Create(2)
            			->setFixed(0,HX_("_0",f1,52,00,00),HX_("",00,00,00,00))
            			->setFixed(1,HX_("_1",f2,52,00,00),(int)2)),::thx::fp::_Writer::Writer_Impl__obj::run(::thx::fp::_Writer::Writer_Impl__obj::_new(_hx_tmp)),null(),null(),null(),hx::SourceInfo(HX_("TestWriter.hx",19,2b,83,e4),15,HX_("thx.fp.TestWriter",ff,17,18,57),HX_("testMap",6a,79,c1,bd)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestWriter_obj,testMap,(void))

void TestWriter_obj::testFlatMap(){
            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_0) HXARGC(1)
            		Int _hx_run(::hx::EnumBase a){
            			HX_STACK_FRAME("thx.fp.TestWriter","testFlatMap",0xd5284b42,"thx.fp.TestWriter.testFlatMap","thx/fp/TestWriter.hx",19,0x4a22197f)
            			HX_STACK_ARG(a,"a")
HXLINE(  19)			return (int)1;
            		}
            		HX_END_LOCAL_FUNC1(return)

            		HX_BEGIN_LOCAL_FUNC_S1(hx::LocalFunc,_hx_Closure_2, ::Dynamic,s) HXARGC(1)
            		 ::Dynamic _hx_run(Int i){
            			HX_BEGIN_LOCAL_FUNC_S1(hx::LocalFunc,_hx_Closure_1,Int,i) HXARGC(1)
            			Int _hx_run(Int v){
            				HX_STACK_FRAME("thx.fp.TestWriter","testFlatMap",0xd5284b42,"thx.fp.TestWriter.testFlatMap","thx/fp/TestWriter.hx",22,0x4a22197f)
            				HX_STACK_ARG(v,"v")
HXLINE(  22)				return (i + v);
            			}
            			HX_END_LOCAL_FUNC1(return)

            			HX_STACK_FRAME("thx.fp.TestWriter","testFlatMap",0xd5284b42,"thx.fp.TestWriter.testFlatMap","thx/fp/TestWriter.hx",22,0x4a22197f)
            			HX_STACK_ARG(i,"i")
HXLINE(  22)			HX_VARI_NAME(  ::Dynamic,this1,"this") = ::thx::fp::_Writer::Writer_Impl__obj::log(s,HX_("b",62,00,00,00));
HXDLIN(  22)			 ::Dynamic _hx_tmp1 = ::thx::_Tuple::Tuple3_Impl__obj::map(this1, ::Dynamic(new _hx_Closure_1(i)));
HXDLIN(  22)			return ::thx::fp::_Writer::Writer_Impl__obj::_new(_hx_tmp1);
            		}
            		HX_END_LOCAL_FUNC1(return)

            	HX_STACK_FRAME("thx.fp.TestWriter","testFlatMap",0xd5284b42,"thx.fp.TestWriter.testFlatMap","thx/fp/TestWriter.hx",18,0x4a22197f)
            	HX_STACK_THIS(this)
HXLINE(  19)		 ::Dynamic _hx_tmp = ::thx::_Tuple::Tuple3_Impl__obj::map(::thx::fp::_Writer::Writer_Impl__obj::_new( ::Dynamic(hx::Anon_obj::Create(3)
            			->setFixed(0,HX_("_0",f1,52,00,00),::thx::Strings_obj::monoid)
            			->setFixed(1,HX_("_1",f2,52,00,00),HX_("a",61,00,00,00))
            			->setFixed(2,HX_("_2",f3,52,00,00),::thx::Unit_obj::unit_dyn()))), ::Dynamic(new _hx_Closure_0()));
HXDLIN(  19)		HX_VARI(  ::Dynamic,s) = ::thx::fp::_Writer::Writer_Impl__obj::_new(_hx_tmp);
HXLINE(  21)		HX_VARI(  ::Dynamic,f) =  ::Dynamic(new _hx_Closure_2(s));
HXLINE(  25)		 ::Dynamic _hx_tmp2 =  ::Dynamic(hx::Anon_obj::Create(2)
            			->setFixed(0,HX_("_0",f1,52,00,00),HX_("aab",82,ef,49,00))
            			->setFixed(1,HX_("_1",f2,52,00,00),(int)2));
HXDLIN(  25)		 ::Dynamic _hx_tmp3 = ::thx::fp::_Writer::Writer_Impl__obj::flatMap(s,f);
HXDLIN(  25)		::utest::Assert_obj::same(_hx_tmp2,::thx::fp::_Writer::Writer_Impl__obj::run(_hx_tmp3),null(),null(),null(),hx::SourceInfo(HX_("TestWriter.hx",19,2b,83,e4),25,HX_("thx.fp.TestWriter",ff,17,18,57),HX_("testFlatMap",31,fe,a6,a3)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestWriter_obj,testFlatMap,(void))


TestWriter_obj::TestWriter_obj()
{
}

hx::Val TestWriter_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 7:
		if (HX_FIELD_EQ(inName,"testMap") ) { return hx::Val( testMap_dyn()); }
		break;
	case 11:
		if (HX_FIELD_EQ(inName,"testFlatMap") ) { return hx::Val( testFlatMap_dyn()); }
	}
	return super::__Field(inName,inCallProp);
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *TestWriter_obj_sMemberStorageInfo = 0;
static hx::StaticInfo *TestWriter_obj_sStaticStorageInfo = 0;
#endif

static ::String TestWriter_obj_sMemberFields[] = {
	HX_HCSTRING("testMap","\x6a","\x79","\xc1","\xbd"),
	HX_HCSTRING("testFlatMap","\x31","\xfe","\xa6","\xa3"),
	::String(null()) };

static void TestWriter_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(TestWriter_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void TestWriter_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(TestWriter_obj::__mClass,"__mClass");
};

#endif

hx::Class TestWriter_obj::__mClass;

void TestWriter_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.fp.TestWriter","\xff","\x17","\x18","\x57");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &hx::Class_obj::GetNoStaticField;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = TestWriter_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(0 /* sStaticFields */);
	__mClass->mMembers = hx::Class_obj::dupFunctions(TestWriter_obj_sMemberFields);
	__mClass->mCanCast = hx::TCanCast< TestWriter_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = TestWriter_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = TestWriter_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = TestWriter_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx
} // end namespace fp