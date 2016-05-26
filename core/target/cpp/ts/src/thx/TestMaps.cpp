// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_haxe_IMap
#include <haxe/IMap.h>
#endif
#ifndef INCLUDED_haxe_Utf8
#include <haxe/Utf8.h>
#endif
#ifndef INCLUDED_haxe_ds_Option
#include <haxe/ds/Option.h>
#endif
#ifndef INCLUDED_haxe_ds_StringMap
#include <haxe/ds/StringMap.h>
#endif
#ifndef INCLUDED_thx_Arrays
#include <thx/Arrays.h>
#endif
#ifndef INCLUDED_thx_Ints
#include <thx/Ints.h>
#endif
#ifndef INCLUDED_thx_Iterators
#include <thx/Iterators.h>
#endif
#ifndef INCLUDED_thx_Maps
#include <thx/Maps.h>
#endif
#ifndef INCLUDED_thx_Options
#include <thx/Options.h>
#endif
#ifndef INCLUDED_thx_TestMaps
#include <thx/TestMaps.h>
#endif
#ifndef INCLUDED_utest_Assert
#include <utest/Assert.h>
#endif

namespace thx{

void TestMaps_obj::__construct(){
            	HX_STACK_FRAME("thx.TestMaps","new",0x06dff385,"thx.TestMaps.new","thx/TestMaps.hx",10,0x4413112a)
            	HX_STACK_THIS(this)
            	}

Dynamic TestMaps_obj::__CreateEmpty() { return new TestMaps_obj; }

hx::ObjectPtr< TestMaps_obj > TestMaps_obj::__new()
{
	hx::ObjectPtr< TestMaps_obj > _hx_result = new TestMaps_obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic TestMaps_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< TestMaps_obj > _hx_result = new TestMaps_obj();
	_hx_result->__construct();
	return _hx_result;
}

void TestMaps_obj::testTuples(){
            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_0) HXARGC(2)
            		Int _hx_run( ::Dynamic a, ::Dynamic b){
            			HX_STACK_FRAME("thx.TestMaps","testTuples",0x6f6eecd8,"thx.TestMaps.testTuples","thx/TestMaps.hx",19,0x4413112a)
            			HX_STACK_ARG(a,"a")
            			HX_STACK_ARG(b,"b")
HXLINE(  19)			return ::haxe::Utf8_obj::compare( ::Dynamic(a->__Field(HX_("_0",f1,52,00,00),hx::paccDynamic)), ::Dynamic(b->__Field(HX_("_0",f1,52,00,00),hx::paccDynamic)));
            		}
            		HX_END_LOCAL_FUNC2(return)

            	HX_STACK_FRAME("thx.TestMaps","testTuples",0x6f6eecd8,"thx.TestMaps.testTuples","thx/TestMaps.hx",12,0x4413112a)
            	HX_STACK_THIS(this)
HXLINE(  13)		HX_VARI(  ::haxe::ds::StringMap,_g) =  ::haxe::ds::StringMap_obj::__new();
HXDLIN(  13)		_g->set(HX_("key1",b2,e1,06,47),(int)1);
HXDLIN(  13)		_g->set(HX_("key2",b3,e1,06,47),(int)2);
HXLINE(  18)		HX_VARI( ::Array< ::Dynamic>,tuples) = ::thx::Maps_obj::tuples(_g);
HXLINE(  19)		tuples->sort( ::Dynamic(new _hx_Closure_0()));
HXLINE(  21)		::utest::Assert_obj::equals((int)2,tuples->length,null(),hx::SourceInfo(HX_("TestMaps.hx",75,da,44,e7),21,HX_("thx.TestMaps",13,cd,9c,54),HX_("testTuples",5d,31,96,22)));
HXLINE(  22)		::utest::Assert_obj::equals( ::Dynamic(tuples->__get((int)0)->__Field(HX_("_0",f1,52,00,00),hx::paccDynamic)),HX_("key1",b2,e1,06,47),null(),hx::SourceInfo(HX_("TestMaps.hx",75,da,44,e7),22,HX_("thx.TestMaps",13,cd,9c,54),HX_("testTuples",5d,31,96,22)));
HXLINE(  23)		::utest::Assert_obj::equals( ::Dynamic(tuples->__get((int)0)->__Field(HX_("_1",f2,52,00,00),hx::paccDynamic)),(int)1,null(),hx::SourceInfo(HX_("TestMaps.hx",75,da,44,e7),23,HX_("thx.TestMaps",13,cd,9c,54),HX_("testTuples",5d,31,96,22)));
HXLINE(  24)		::utest::Assert_obj::equals( ::Dynamic(tuples->__get((int)1)->__Field(HX_("_0",f1,52,00,00),hx::paccDynamic)),HX_("key2",b3,e1,06,47),null(),hx::SourceInfo(HX_("TestMaps.hx",75,da,44,e7),24,HX_("thx.TestMaps",13,cd,9c,54),HX_("testTuples",5d,31,96,22)));
HXLINE(  25)		::utest::Assert_obj::equals( ::Dynamic(tuples->__get((int)1)->__Field(HX_("_1",f2,52,00,00),hx::paccDynamic)),(int)2,null(),hx::SourceInfo(HX_("TestMaps.hx",75,da,44,e7),25,HX_("thx.TestMaps",13,cd,9c,54),HX_("testTuples",5d,31,96,22)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestMaps_obj,testTuples,(void))

void TestMaps_obj::testValues(){
            	HX_STACK_FRAME("thx.TestMaps","testValues",0xb584054f,"thx.TestMaps.testValues","thx/TestMaps.hx",28,0x4413112a)
            	HX_STACK_THIS(this)
HXLINE(  29)		HX_VARI(  ::haxe::ds::StringMap,_g) =  ::haxe::ds::StringMap_obj::__new();
HXDLIN(  29)		_g->set(HX_("key1",b2,e1,06,47),(int)1);
HXDLIN(  29)		_g->set(HX_("key2",b3,e1,06,47),(int)2);
HXDLIN(  29)		_g->set(HX_("key3",b4,e1,06,47),(int)3);
HXLINE(  34)		::Array< Int > _hx_tmp = ::thx::Maps_obj::values(_g);
HXDLIN(  34)		HX_VARI( ::Array< Int >,values) = ::thx::Arrays_obj::order(_hx_tmp,::thx::Ints_obj::compare_dyn());
HXLINE(  35)		::utest::Assert_obj::same(::cpp::VirtualArray_obj::__new(3)->init(0,(int)1)->init(1,(int)2)->init(2,(int)3),values,null(),null(),null(),hx::SourceInfo(HX_("TestMaps.hx",75,da,44,e7),35,HX_("thx.TestMaps",13,cd,9c,54),HX_("testValues",d4,49,ab,68)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestMaps_obj,testValues,(void))

void TestMaps_obj::testGetOption(){
            	HX_STACK_FRAME("thx.TestMaps","testGetOption",0x11673d5e,"thx.TestMaps.testGetOption","thx/TestMaps.hx",38,0x4413112a)
            	HX_STACK_THIS(this)
HXLINE(  39)		HX_VARI(  ::haxe::ds::StringMap,_g) =  ::haxe::ds::StringMap_obj::__new();
HXDLIN(  39)		_g->set(HX_("key1",b2,e1,06,47),(int)1);
HXLINE(  41)		::hx::EnumBase _hx_tmp = ::thx::Maps_obj::getOption(_g,HX_("key1",b2,e1,06,47));
HXDLIN(  41)		 ::Dynamic _hx_tmp1 = ::thx::Options_obj::get(_hx_tmp);
HXDLIN(  41)		::utest::Assert_obj::same(_hx_tmp1,(int)1,null(),null(),null(),hx::SourceInfo(HX_("TestMaps.hx",75,da,44,e7),41,HX_("thx.TestMaps",13,cd,9c,54),HX_("testGetOption",f9,d9,0b,db)));
HXLINE(  42)		::hx::EnumBase _hx_tmp2 = ::thx::Maps_obj::getOption(_g,HX_("key2",b3,e1,06,47));
HXDLIN(  42)		Bool _hx_tmp3 = ::thx::Options_obj::toBool(_hx_tmp2);
HXDLIN(  42)		::utest::Assert_obj::same(_hx_tmp3,false,null(),null(),null(),hx::SourceInfo(HX_("TestMaps.hx",75,da,44,e7),42,HX_("thx.TestMaps",13,cd,9c,54),HX_("testGetOption",f9,d9,0b,db)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestMaps_obj,testGetOption,(void))

void TestMaps_obj::testMerge(){
            	HX_STACK_FRAME("thx.TestMaps","testMerge",0xb82b6deb,"thx.TestMaps.testMerge","thx/TestMaps.hx",45,0x4413112a)
            	HX_STACK_THIS(this)
HXLINE(  46)		HX_VARI(  ::haxe::ds::StringMap,_g) =  ::haxe::ds::StringMap_obj::__new();
HXDLIN(  46)		_g->set(HX_("key1",b2,e1,06,47),(int)1);
HXDLIN(  46)		_g->set(HX_("key2",b3,e1,06,47),(int)1);
HXDLIN(  46)		_g->set(HX_("key3",b4,e1,06,47),(int)1);
HXLINE(  51)		HX_VARI(  ::haxe::ds::StringMap,_g1) =  ::haxe::ds::StringMap_obj::__new();
HXDLIN(  51)		_g1->set(HX_("key2",b3,e1,06,47),(int)2);
HXDLIN(  51)		_g1->set(HX_("key3",b4,e1,06,47),(int)2);
HXLINE(  55)		HX_VARI(  ::haxe::ds::StringMap,_g2) =  ::haxe::ds::StringMap_obj::__new();
HXDLIN(  55)		_g2->set(HX_("key3",b4,e1,06,47),(int)3);
HXLINE(  59)		HX_VARI( ::Dynamic,result1) = ::thx::Maps_obj::merge( ::haxe::ds::StringMap_obj::__new(),::Array_obj< ::Dynamic>::__new(3)->init(0,_g)->init(1,_g1)->init(2,_g2));
HXLINE(  60)		 ::Dynamic _hx_tmp = ::haxe::IMap_obj::keys(result1);
HXDLIN(  60)		::utest::Assert_obj::same((int)3,::thx::Iterators_obj::toArray(_hx_tmp)->get_length(),null(),null(),null(),hx::SourceInfo(HX_("TestMaps.hx",75,da,44,e7),60,HX_("thx.TestMaps",13,cd,9c,54),HX_("testMerge",06,e1,c8,ce)));
HXLINE(  61)		 ::Dynamic _hx_tmp1 = ::haxe::IMap_obj::get(result1,HX_("key1",b2,e1,06,47));
HXDLIN(  61)		::utest::Assert_obj::same((int)1,_hx_tmp1,null(),null(),null(),hx::SourceInfo(HX_("TestMaps.hx",75,da,44,e7),61,HX_("thx.TestMaps",13,cd,9c,54),HX_("testMerge",06,e1,c8,ce)));
HXLINE(  62)		 ::Dynamic _hx_tmp2 = ::haxe::IMap_obj::get(result1,HX_("key2",b3,e1,06,47));
HXDLIN(  62)		::utest::Assert_obj::same((int)2,_hx_tmp2,null(),null(),null(),hx::SourceInfo(HX_("TestMaps.hx",75,da,44,e7),62,HX_("thx.TestMaps",13,cd,9c,54),HX_("testMerge",06,e1,c8,ce)));
HXLINE(  63)		 ::Dynamic _hx_tmp3 = ::haxe::IMap_obj::get(result1,HX_("key3",b4,e1,06,47));
HXDLIN(  63)		::utest::Assert_obj::same((int)3,_hx_tmp3,null(),null(),null(),hx::SourceInfo(HX_("TestMaps.hx",75,da,44,e7),63,HX_("thx.TestMaps",13,cd,9c,54),HX_("testMerge",06,e1,c8,ce)));
HXLINE(  66)		HX_VARI(  ::haxe::ds::StringMap,_g3) =  ::haxe::ds::StringMap_obj::__new();
HXDLIN(  66)		_g3->set(HX_("mykey",b3,95,f9,12),(int)5);
HXDLIN(  66)		HX_VARI( ::Dynamic,result2) = ::thx::Maps_obj::merge(_g3,::Array_obj< ::Dynamic>::__new(0));
HXLINE(  67)		 ::Dynamic _hx_tmp4 = ::haxe::IMap_obj::keys(result2);
HXDLIN(  67)		::utest::Assert_obj::same((int)1,::thx::Iterators_obj::toArray(_hx_tmp4)->get_length(),null(),null(),null(),hx::SourceInfo(HX_("TestMaps.hx",75,da,44,e7),67,HX_("thx.TestMaps",13,cd,9c,54),HX_("testMerge",06,e1,c8,ce)));
HXLINE(  68)		 ::Dynamic _hx_tmp5 = ::haxe::IMap_obj::get(result2,HX_("mykey",b3,95,f9,12));
HXDLIN(  68)		::utest::Assert_obj::same((int)5,_hx_tmp5,null(),null(),null(),hx::SourceInfo(HX_("TestMaps.hx",75,da,44,e7),68,HX_("thx.TestMaps",13,cd,9c,54),HX_("testMerge",06,e1,c8,ce)));
HXLINE(  71)		 ::Dynamic _hx_tmp6 = _g->keys();
HXDLIN(  71)		::utest::Assert_obj::same((int)3,::thx::Iterators_obj::toArray(_hx_tmp6)->get_length(),null(),null(),null(),hx::SourceInfo(HX_("TestMaps.hx",75,da,44,e7),71,HX_("thx.TestMaps",13,cd,9c,54),HX_("testMerge",06,e1,c8,ce)));
HXLINE(  72)		::utest::Assert_obj::same((int)1,_g->get(HX_("key1",b2,e1,06,47)),null(),null(),null(),hx::SourceInfo(HX_("TestMaps.hx",75,da,44,e7),72,HX_("thx.TestMaps",13,cd,9c,54),HX_("testMerge",06,e1,c8,ce)));
HXLINE(  73)		::utest::Assert_obj::same((int)1,_g->get(HX_("key2",b3,e1,06,47)),null(),null(),null(),hx::SourceInfo(HX_("TestMaps.hx",75,da,44,e7),73,HX_("thx.TestMaps",13,cd,9c,54),HX_("testMerge",06,e1,c8,ce)));
HXLINE(  74)		::utest::Assert_obj::same((int)1,_g->get(HX_("key3",b4,e1,06,47)),null(),null(),null(),hx::SourceInfo(HX_("TestMaps.hx",75,da,44,e7),74,HX_("thx.TestMaps",13,cd,9c,54),HX_("testMerge",06,e1,c8,ce)));
HXLINE(  75)		 ::Dynamic _hx_tmp7 = _g1->keys();
HXDLIN(  75)		::utest::Assert_obj::same((int)2,::thx::Iterators_obj::toArray(_hx_tmp7)->get_length(),null(),null(),null(),hx::SourceInfo(HX_("TestMaps.hx",75,da,44,e7),75,HX_("thx.TestMaps",13,cd,9c,54),HX_("testMerge",06,e1,c8,ce)));
HXLINE(  76)		::utest::Assert_obj::same((int)2,_g1->get(HX_("key2",b3,e1,06,47)),null(),null(),null(),hx::SourceInfo(HX_("TestMaps.hx",75,da,44,e7),76,HX_("thx.TestMaps",13,cd,9c,54),HX_("testMerge",06,e1,c8,ce)));
HXLINE(  77)		::utest::Assert_obj::same((int)2,_g1->get(HX_("key3",b4,e1,06,47)),null(),null(),null(),hx::SourceInfo(HX_("TestMaps.hx",75,da,44,e7),77,HX_("thx.TestMaps",13,cd,9c,54),HX_("testMerge",06,e1,c8,ce)));
HXLINE(  78)		 ::Dynamic _hx_tmp8 = _g2->keys();
HXDLIN(  78)		::utest::Assert_obj::same((int)1,::thx::Iterators_obj::toArray(_hx_tmp8)->get_length(),null(),null(),null(),hx::SourceInfo(HX_("TestMaps.hx",75,da,44,e7),78,HX_("thx.TestMaps",13,cd,9c,54),HX_("testMerge",06,e1,c8,ce)));
HXLINE(  79)		::utest::Assert_obj::same((int)3,_g2->get(HX_("key3",b4,e1,06,47)),null(),null(),null(),hx::SourceInfo(HX_("TestMaps.hx",75,da,44,e7),79,HX_("thx.TestMaps",13,cd,9c,54),HX_("testMerge",06,e1,c8,ce)));
HXLINE(  83)		HX_VARI( ::Dynamic,result3) = ::thx::Maps_obj::merge(_g,::Array_obj< ::Dynamic>::__new(2)->init(0,_g1)->init(1,_g2));
HXLINE(  84)		 ::Dynamic _hx_tmp9 = ::haxe::IMap_obj::keys(result3);
HXDLIN(  84)		::utest::Assert_obj::same((int)3,::thx::Iterators_obj::toArray(_hx_tmp9)->get_length(),null(),null(),null(),hx::SourceInfo(HX_("TestMaps.hx",75,da,44,e7),84,HX_("thx.TestMaps",13,cd,9c,54),HX_("testMerge",06,e1,c8,ce)));
HXLINE(  85)		 ::Dynamic _hx_tmp10 = ::haxe::IMap_obj::get(result3,HX_("key1",b2,e1,06,47));
HXDLIN(  85)		::utest::Assert_obj::same((int)1,_hx_tmp10,null(),null(),null(),hx::SourceInfo(HX_("TestMaps.hx",75,da,44,e7),85,HX_("thx.TestMaps",13,cd,9c,54),HX_("testMerge",06,e1,c8,ce)));
HXLINE(  86)		 ::Dynamic _hx_tmp11 = ::haxe::IMap_obj::get(result3,HX_("key2",b3,e1,06,47));
HXDLIN(  86)		::utest::Assert_obj::same((int)2,_hx_tmp11,null(),null(),null(),hx::SourceInfo(HX_("TestMaps.hx",75,da,44,e7),86,HX_("thx.TestMaps",13,cd,9c,54),HX_("testMerge",06,e1,c8,ce)));
HXLINE(  87)		 ::Dynamic _hx_tmp12 = ::haxe::IMap_obj::get(result3,HX_("key3",b4,e1,06,47));
HXDLIN(  87)		::utest::Assert_obj::same((int)3,_hx_tmp12,null(),null(),null(),hx::SourceInfo(HX_("TestMaps.hx",75,da,44,e7),87,HX_("thx.TestMaps",13,cd,9c,54),HX_("testMerge",06,e1,c8,ce)));
HXLINE(  88)		 ::Dynamic _hx_tmp13 = _g->keys();
HXDLIN(  88)		::utest::Assert_obj::same((int)3,::thx::Iterators_obj::toArray(_hx_tmp13)->get_length(),null(),null(),null(),hx::SourceInfo(HX_("TestMaps.hx",75,da,44,e7),88,HX_("thx.TestMaps",13,cd,9c,54),HX_("testMerge",06,e1,c8,ce)));
HXLINE(  89)		::utest::Assert_obj::same((int)1,_g->get(HX_("key1",b2,e1,06,47)),null(),null(),null(),hx::SourceInfo(HX_("TestMaps.hx",75,da,44,e7),89,HX_("thx.TestMaps",13,cd,9c,54),HX_("testMerge",06,e1,c8,ce)));
HXLINE(  90)		::utest::Assert_obj::same((int)2,_g->get(HX_("key2",b3,e1,06,47)),null(),null(),null(),hx::SourceInfo(HX_("TestMaps.hx",75,da,44,e7),90,HX_("thx.TestMaps",13,cd,9c,54),HX_("testMerge",06,e1,c8,ce)));
HXLINE(  91)		::utest::Assert_obj::same((int)3,_g->get(HX_("key3",b4,e1,06,47)),null(),null(),null(),hx::SourceInfo(HX_("TestMaps.hx",75,da,44,e7),91,HX_("thx.TestMaps",13,cd,9c,54),HX_("testMerge",06,e1,c8,ce)));
HXLINE(  92)		 ::Dynamic _hx_tmp14 = _g1->keys();
HXDLIN(  92)		::utest::Assert_obj::same((int)2,::thx::Iterators_obj::toArray(_hx_tmp14)->get_length(),null(),null(),null(),hx::SourceInfo(HX_("TestMaps.hx",75,da,44,e7),92,HX_("thx.TestMaps",13,cd,9c,54),HX_("testMerge",06,e1,c8,ce)));
HXLINE(  93)		::utest::Assert_obj::same((int)2,_g1->get(HX_("key2",b3,e1,06,47)),null(),null(),null(),hx::SourceInfo(HX_("TestMaps.hx",75,da,44,e7),93,HX_("thx.TestMaps",13,cd,9c,54),HX_("testMerge",06,e1,c8,ce)));
HXLINE(  94)		::utest::Assert_obj::same((int)2,_g1->get(HX_("key3",b4,e1,06,47)),null(),null(),null(),hx::SourceInfo(HX_("TestMaps.hx",75,da,44,e7),94,HX_("thx.TestMaps",13,cd,9c,54),HX_("testMerge",06,e1,c8,ce)));
HXLINE(  95)		 ::Dynamic _hx_tmp15 = _g2->keys();
HXDLIN(  95)		::utest::Assert_obj::same((int)1,::thx::Iterators_obj::toArray(_hx_tmp15)->get_length(),null(),null(),null(),hx::SourceInfo(HX_("TestMaps.hx",75,da,44,e7),95,HX_("thx.TestMaps",13,cd,9c,54),HX_("testMerge",06,e1,c8,ce)));
HXLINE(  96)		::utest::Assert_obj::same((int)3,_g2->get(HX_("key3",b4,e1,06,47)),null(),null(),null(),hx::SourceInfo(HX_("TestMaps.hx",75,da,44,e7),96,HX_("thx.TestMaps",13,cd,9c,54),HX_("testMerge",06,e1,c8,ce)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestMaps_obj,testMerge,(void))


TestMaps_obj::TestMaps_obj()
{
}

hx::Val TestMaps_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 9:
		if (HX_FIELD_EQ(inName,"testMerge") ) { return hx::Val( testMerge_dyn()); }
		break;
	case 10:
		if (HX_FIELD_EQ(inName,"testTuples") ) { return hx::Val( testTuples_dyn()); }
		if (HX_FIELD_EQ(inName,"testValues") ) { return hx::Val( testValues_dyn()); }
		break;
	case 13:
		if (HX_FIELD_EQ(inName,"testGetOption") ) { return hx::Val( testGetOption_dyn()); }
	}
	return super::__Field(inName,inCallProp);
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *TestMaps_obj_sMemberStorageInfo = 0;
static hx::StaticInfo *TestMaps_obj_sStaticStorageInfo = 0;
#endif

static ::String TestMaps_obj_sMemberFields[] = {
	HX_HCSTRING("testTuples","\x5d","\x31","\x96","\x22"),
	HX_HCSTRING("testValues","\xd4","\x49","\xab","\x68"),
	HX_HCSTRING("testGetOption","\xf9","\xd9","\x0b","\xdb"),
	HX_HCSTRING("testMerge","\x06","\xe1","\xc8","\xce"),
	::String(null()) };

static void TestMaps_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(TestMaps_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void TestMaps_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(TestMaps_obj::__mClass,"__mClass");
};

#endif

hx::Class TestMaps_obj::__mClass;

void TestMaps_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.TestMaps","\x13","\xcd","\x9c","\x54");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &hx::Class_obj::GetNoStaticField;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = TestMaps_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(0 /* sStaticFields */);
	__mClass->mMembers = hx::Class_obj::dupFunctions(TestMaps_obj_sMemberFields);
	__mClass->mCanCast = hx::TCanCast< TestMaps_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = TestMaps_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = TestMaps_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = TestMaps_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx
