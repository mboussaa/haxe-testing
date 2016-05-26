// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_thx_Arrays
#include <thx/Arrays.h>
#endif
#ifndef INCLUDED_thx_Ints
#include <thx/Ints.h>
#endif
#ifndef INCLUDED_thx_OrderingImpl
#include <thx/OrderingImpl.h>
#endif
#ifndef INCLUDED_thx_Strings
#include <thx/Strings.h>
#endif
#ifndef INCLUDED_thx__Ord_Ord_Impl_
#include <thx/_Ord/Ord_Impl_.h>
#endif
#ifndef INCLUDED_thx_fp_ListImpl
#include <thx/fp/ListImpl.h>
#endif
#ifndef INCLUDED_thx_fp_SetImpl
#include <thx/fp/SetImpl.h>
#endif
#ifndef INCLUDED_thx_fp_TestSet
#include <thx/fp/TestSet.h>
#endif
#ifndef INCLUDED_thx_fp__List_List_Impl_
#include <thx/fp/_List/List_Impl_.h>
#endif
#ifndef INCLUDED_thx_fp__Set_Set_Impl_
#include <thx/fp/_Set/Set_Impl_.h>
#endif
#ifndef INCLUDED_utest_Assert
#include <utest/Assert.h>
#endif

namespace thx{
namespace fp{

void TestSet_obj::__construct(){
            	HX_STACK_FRAME("thx.fp.TestSet","new",0x2c2d96c8,"thx.fp.TestSet.new","thx/fp/TestSet.hx",8,0x8c111848)
            	HX_STACK_THIS(this)
            	}

Dynamic TestSet_obj::__CreateEmpty() { return new TestSet_obj; }

hx::ObjectPtr< TestSet_obj > TestSet_obj::__new()
{
	hx::ObjectPtr< TestSet_obj > _hx_result = new TestSet_obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic TestSet_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< TestSet_obj > _hx_result = new TestSet_obj();
	_hx_result->__construct();
	return _hx_result;
}

void TestSet_obj::testEmpty(){
            	HX_STACK_FRAME("thx.fp.TestSet","testEmpty",0xcc06fd43,"thx.fp.TestSet.testEmpty","thx/fp/TestSet.hx",10,0x8c111848)
            	HX_STACK_THIS(this)
HXLINE(  11)		HX_VARI( ::hx::EnumBase,set) = ::thx::fp::SetImpl_obj::Tip_dyn();
HXLINE(  12)		 ::Dynamic _hx_tmp = ::thx::_Ord::Ord_Impl__obj::fromIntComparison(::thx::Strings_obj::compare_dyn());
HXDLIN(  12)		Bool _hx_tmp1 = ::thx::fp::_Set::Set_Impl__obj::member(set,HX_("some",f4,22,58,4c),_hx_tmp);
HXDLIN(  12)		::utest::Assert_obj::isFalse(_hx_tmp1,null(),hx::SourceInfo(HX_("TestSet.hx",6e,62,f8,7e),12,HX_("thx.fp.TestSet",d6,d2,e0,3f),HX_("testEmpty",db,78,dc,38)));
HXLINE(  13)		Int _hx_tmp2 = ::thx::fp::_Set::Set_Impl__obj::size(set);
HXDLIN(  13)		::utest::Assert_obj::equals((int)0,_hx_tmp2,null(),hx::SourceInfo(HX_("TestSet.hx",6e,62,f8,7e),13,HX_("thx.fp.TestSet",d6,d2,e0,3f),HX_("testEmpty",db,78,dc,38)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestSet_obj,testEmpty,(void))

void TestSet_obj::testSizes(){
            	HX_STACK_FRAME("thx.fp.TestSet","testSizes",0xd905cb48,"thx.fp.TestSet.testSizes","thx/fp/TestSet.hx",16,0x8c111848)
            	HX_STACK_THIS(this)
HXLINE(  17)		HX_VARI( ::hx::EnumBase,set) = ::thx::fp::SetImpl_obj::Bin((int)1,HX_("B",42,00,00,00),::thx::fp::SetImpl_obj::Tip_dyn(),::thx::fp::SetImpl_obj::Tip_dyn());
HXDLIN(  17)		 ::Dynamic _hx_tmp = ::thx::_Ord::Ord_Impl__obj::fromIntComparison(::thx::Strings_obj::compare_dyn());
HXDLIN(  17)		HX_VARI_NAME( ::hx::EnumBase,set1,"set") = ::thx::fp::_Set::Set_Impl__obj::insert(set,HX_("A",41,00,00,00),_hx_tmp);
HXDLIN(  17)		 ::Dynamic _hx_tmp1 = ::thx::_Ord::Ord_Impl__obj::fromIntComparison(::thx::Strings_obj::compare_dyn());
HXDLIN(  17)		::hx::EnumBase _hx_tmp2 = ::thx::fp::_Set::Set_Impl__obj::insert(set1,HX_("C",43,00,00,00),_hx_tmp1);
HXDLIN(  17)		Int _hx_tmp3 = ::thx::fp::_Set::Set_Impl__obj::size(_hx_tmp2);
HXDLIN(  17)		::utest::Assert_obj::equals((int)3,_hx_tmp3,null(),hx::SourceInfo(HX_("TestSet.hx",6e,62,f8,7e),17,HX_("thx.fp.TestSet",d6,d2,e0,3f),HX_("testSizes",e0,46,db,45)));
HXLINE(  18)		HX_VARI_NAME( ::hx::EnumBase,set2,"set") = ::thx::fp::SetImpl_obj::Bin((int)1,HX_("A",41,00,00,00),::thx::fp::SetImpl_obj::Tip_dyn(),::thx::fp::SetImpl_obj::Tip_dyn());
HXDLIN(  18)		 ::Dynamic _hx_tmp4 = ::thx::_Ord::Ord_Impl__obj::fromIntComparison(::thx::Strings_obj::compare_dyn());
HXDLIN(  18)		HX_VARI_NAME( ::hx::EnumBase,set3,"set") = ::thx::fp::_Set::Set_Impl__obj::insert(set2,HX_("B",42,00,00,00),_hx_tmp4);
HXDLIN(  18)		 ::Dynamic _hx_tmp5 = ::thx::_Ord::Ord_Impl__obj::fromIntComparison(::thx::Strings_obj::compare_dyn());
HXDLIN(  18)		::hx::EnumBase _hx_tmp6 = ::thx::fp::_Set::Set_Impl__obj::insert(set3,HX_("C",43,00,00,00),_hx_tmp5);
HXDLIN(  18)		Int _hx_tmp7 = ::thx::fp::_Set::Set_Impl__obj::size(_hx_tmp6);
HXDLIN(  18)		::utest::Assert_obj::equals((int)3,_hx_tmp7,null(),hx::SourceInfo(HX_("TestSet.hx",6e,62,f8,7e),18,HX_("thx.fp.TestSet",d6,d2,e0,3f),HX_("testSizes",e0,46,db,45)));
HXLINE(  19)		HX_VARI_NAME( ::hx::EnumBase,set4,"set") = ::thx::fp::SetImpl_obj::Bin((int)1,HX_("C",43,00,00,00),::thx::fp::SetImpl_obj::Tip_dyn(),::thx::fp::SetImpl_obj::Tip_dyn());
HXDLIN(  19)		 ::Dynamic _hx_tmp8 = ::thx::_Ord::Ord_Impl__obj::fromIntComparison(::thx::Strings_obj::compare_dyn());
HXDLIN(  19)		HX_VARI_NAME( ::hx::EnumBase,set5,"set") = ::thx::fp::_Set::Set_Impl__obj::insert(set4,HX_("B",42,00,00,00),_hx_tmp8);
HXDLIN(  19)		 ::Dynamic _hx_tmp9 = ::thx::_Ord::Ord_Impl__obj::fromIntComparison(::thx::Strings_obj::compare_dyn());
HXDLIN(  19)		::hx::EnumBase _hx_tmp10 = ::thx::fp::_Set::Set_Impl__obj::insert(set5,HX_("A",41,00,00,00),_hx_tmp9);
HXDLIN(  19)		Int _hx_tmp11 = ::thx::fp::_Set::Set_Impl__obj::size(_hx_tmp10);
HXDLIN(  19)		::utest::Assert_obj::equals((int)3,_hx_tmp11,null(),hx::SourceInfo(HX_("TestSet.hx",6e,62,f8,7e),19,HX_("thx.fp.TestSet",d6,d2,e0,3f),HX_("testSizes",e0,46,db,45)));
HXLINE(  20)		HX_VARI_NAME( ::hx::EnumBase,set6,"set") = ::thx::fp::SetImpl_obj::Bin((int)1,HX_("B",42,00,00,00),::thx::fp::SetImpl_obj::Tip_dyn(),::thx::fp::SetImpl_obj::Tip_dyn());
HXDLIN(  20)		 ::Dynamic _hx_tmp12 = ::thx::_Ord::Ord_Impl__obj::fromIntComparison(::thx::Strings_obj::compare_dyn());
HXDLIN(  20)		HX_VARI_NAME( ::hx::EnumBase,set7,"set") = ::thx::fp::_Set::Set_Impl__obj::insert(set6,HX_("C",43,00,00,00),_hx_tmp12);
HXDLIN(  20)		 ::Dynamic _hx_tmp13 = ::thx::_Ord::Ord_Impl__obj::fromIntComparison(::thx::Strings_obj::compare_dyn());
HXDLIN(  20)		::hx::EnumBase _hx_tmp14 = ::thx::fp::_Set::Set_Impl__obj::insert(set7,HX_("A",41,00,00,00),_hx_tmp13);
HXDLIN(  20)		Int _hx_tmp15 = ::thx::fp::_Set::Set_Impl__obj::size(_hx_tmp14);
HXDLIN(  20)		::utest::Assert_obj::equals((int)3,_hx_tmp15,null(),hx::SourceInfo(HX_("TestSet.hx",6e,62,f8,7e),20,HX_("thx.fp.TestSet",d6,d2,e0,3f),HX_("testSizes",e0,46,db,45)));
HXLINE(  21)		HX_VARI_NAME( ::hx::EnumBase,set8,"set") = ::thx::fp::SetImpl_obj::Bin((int)1,HX_("C",43,00,00,00),::thx::fp::SetImpl_obj::Tip_dyn(),::thx::fp::SetImpl_obj::Tip_dyn());
HXDLIN(  21)		 ::Dynamic _hx_tmp16 = ::thx::_Ord::Ord_Impl__obj::fromIntComparison(::thx::Strings_obj::compare_dyn());
HXDLIN(  21)		HX_VARI_NAME( ::hx::EnumBase,set9,"set") = ::thx::fp::_Set::Set_Impl__obj::insert(set8,HX_("A",41,00,00,00),_hx_tmp16);
HXDLIN(  21)		 ::Dynamic _hx_tmp17 = ::thx::_Ord::Ord_Impl__obj::fromIntComparison(::thx::Strings_obj::compare_dyn());
HXDLIN(  21)		::hx::EnumBase _hx_tmp18 = ::thx::fp::_Set::Set_Impl__obj::insert(set9,HX_("B",42,00,00,00),_hx_tmp17);
HXDLIN(  21)		Int _hx_tmp19 = ::thx::fp::_Set::Set_Impl__obj::size(_hx_tmp18);
HXDLIN(  21)		::utest::Assert_obj::equals((int)3,_hx_tmp19,null(),hx::SourceInfo(HX_("TestSet.hx",6e,62,f8,7e),21,HX_("thx.fp.TestSet",d6,d2,e0,3f),HX_("testSizes",e0,46,db,45)));
HXLINE(  22)		HX_VARI_NAME( ::hx::EnumBase,set10,"set") = ::thx::fp::SetImpl_obj::Bin((int)1,HX_("A",41,00,00,00),::thx::fp::SetImpl_obj::Tip_dyn(),::thx::fp::SetImpl_obj::Tip_dyn());
HXDLIN(  22)		 ::Dynamic _hx_tmp20 = ::thx::_Ord::Ord_Impl__obj::fromIntComparison(::thx::Strings_obj::compare_dyn());
HXDLIN(  22)		HX_VARI_NAME( ::hx::EnumBase,set11,"set") = ::thx::fp::_Set::Set_Impl__obj::insert(set10,HX_("C",43,00,00,00),_hx_tmp20);
HXDLIN(  22)		 ::Dynamic _hx_tmp21 = ::thx::_Ord::Ord_Impl__obj::fromIntComparison(::thx::Strings_obj::compare_dyn());
HXDLIN(  22)		::hx::EnumBase _hx_tmp22 = ::thx::fp::_Set::Set_Impl__obj::insert(set11,HX_("B",42,00,00,00),_hx_tmp21);
HXDLIN(  22)		Int _hx_tmp23 = ::thx::fp::_Set::Set_Impl__obj::size(_hx_tmp22);
HXDLIN(  22)		::utest::Assert_obj::equals((int)3,_hx_tmp23,null(),hx::SourceInfo(HX_("TestSet.hx",6e,62,f8,7e),22,HX_("thx.fp.TestSet",d6,d2,e0,3f),HX_("testSizes",e0,46,db,45)));
HXLINE(  24)		HX_VARI_NAME( ::hx::EnumBase,set12,"set") = ::thx::fp::SetImpl_obj::Bin((int)1,HX_("A",41,00,00,00),::thx::fp::SetImpl_obj::Tip_dyn(),::thx::fp::SetImpl_obj::Tip_dyn());
HXDLIN(  24)		 ::Dynamic _hx_tmp24 = ::thx::_Ord::Ord_Impl__obj::fromIntComparison(::thx::Strings_obj::compare_dyn());
HXDLIN(  24)		HX_VARI_NAME( ::hx::EnumBase,set13,"set") = ::thx::fp::_Set::Set_Impl__obj::insert(set12,HX_("A",41,00,00,00),_hx_tmp24);
HXDLIN(  24)		 ::Dynamic _hx_tmp25 = ::thx::_Ord::Ord_Impl__obj::fromIntComparison(::thx::Strings_obj::compare_dyn());
HXDLIN(  24)		::hx::EnumBase _hx_tmp26 = ::thx::fp::_Set::Set_Impl__obj::insert(set13,HX_("A",41,00,00,00),_hx_tmp25);
HXDLIN(  24)		Int _hx_tmp27 = ::thx::fp::_Set::Set_Impl__obj::size(_hx_tmp26);
HXDLIN(  24)		::utest::Assert_obj::equals((int)1,_hx_tmp27,null(),hx::SourceInfo(HX_("TestSet.hx",6e,62,f8,7e),24,HX_("thx.fp.TestSet",d6,d2,e0,3f),HX_("testSizes",e0,46,db,45)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestSet_obj,testSizes,(void))

void TestSet_obj::testSet(){
            	HX_STACK_FRAME("thx.fp.TestSet","testSet",0x82a724d8,"thx.fp.TestSet.testSet","thx/fp/TestSet.hx",27,0x8c111848)
            	HX_STACK_THIS(this)
HXLINE(  28)		HX_VARI( ::hx::EnumBase,set) = ::thx::fp::SetImpl_obj::Bin((int)1,HX_("Y",59,00,00,00),::thx::fp::SetImpl_obj::Tip_dyn(),::thx::fp::SetImpl_obj::Tip_dyn());
HXDLIN(  28)		 ::Dynamic _hx_tmp = ::thx::_Ord::Ord_Impl__obj::fromIntComparison(::thx::Strings_obj::compare_dyn());
HXDLIN(  28)		HX_VARI_NAME( ::hx::EnumBase,set1,"set") = ::thx::fp::_Set::Set_Impl__obj::insert(set,HX_("X",58,00,00,00),_hx_tmp);
HXDLIN(  28)		 ::Dynamic _hx_tmp1 = ::thx::_Ord::Ord_Impl__obj::fromIntComparison(::thx::Strings_obj::compare_dyn());
HXDLIN(  28)		HX_VARI_NAME( ::hx::EnumBase,set2,"set") = ::thx::fp::_Set::Set_Impl__obj::insert(set1,HX_("Y",59,00,00,00),_hx_tmp1);
HXDLIN(  28)		 ::Dynamic _hx_tmp2 = ::thx::_Ord::Ord_Impl__obj::fromIntComparison(::thx::Strings_obj::compare_dyn());
HXDLIN(  28)		HX_VARI_NAME( ::hx::EnumBase,set3,"set") = ::thx::fp::_Set::Set_Impl__obj::insert(set2,HX_("Z",5a,00,00,00),_hx_tmp2);
HXDLIN(  28)		 ::Dynamic _hx_tmp3 = ::thx::_Ord::Ord_Impl__obj::fromIntComparison(::thx::Strings_obj::compare_dyn());
HXDLIN(  28)		HX_VARI( ::hx::EnumBase,m) = ::thx::fp::_Set::Set_Impl__obj::insert(set3,HX_("Z",5a,00,00,00),_hx_tmp3);
HXLINE(  29)		 ::Dynamic _hx_tmp4 = ::thx::_Ord::Ord_Impl__obj::fromIntComparison(::thx::Strings_obj::compare_dyn());
HXDLIN(  29)		Bool _hx_tmp5 = ::thx::fp::_Set::Set_Impl__obj::member(m,HX_("X",58,00,00,00),_hx_tmp4);
HXDLIN(  29)		::utest::Assert_obj::isTrue(_hx_tmp5,null(),hx::SourceInfo(HX_("TestSet.hx",6e,62,f8,7e),29,HX_("thx.fp.TestSet",d6,d2,e0,3f),HX_("testSet",70,0a,c6,bd)));
HXLINE(  30)		 ::Dynamic _hx_tmp6 = ::thx::_Ord::Ord_Impl__obj::fromIntComparison(::thx::Strings_obj::compare_dyn());
HXDLIN(  30)		Bool _hx_tmp7 = ::thx::fp::_Set::Set_Impl__obj::member(m,HX_("Y",59,00,00,00),_hx_tmp6);
HXDLIN(  30)		::utest::Assert_obj::isTrue(_hx_tmp7,null(),hx::SourceInfo(HX_("TestSet.hx",6e,62,f8,7e),30,HX_("thx.fp.TestSet",d6,d2,e0,3f),HX_("testSet",70,0a,c6,bd)));
HXLINE(  31)		 ::Dynamic _hx_tmp8 = ::thx::_Ord::Ord_Impl__obj::fromIntComparison(::thx::Strings_obj::compare_dyn());
HXDLIN(  31)		Bool _hx_tmp9 = ::thx::fp::_Set::Set_Impl__obj::member(m,HX_("Z",5a,00,00,00),_hx_tmp8);
HXDLIN(  31)		::utest::Assert_obj::isTrue(_hx_tmp9,null(),hx::SourceInfo(HX_("TestSet.hx",6e,62,f8,7e),31,HX_("thx.fp.TestSet",d6,d2,e0,3f),HX_("testSet",70,0a,c6,bd)));
HXLINE(  32)		 ::Dynamic _hx_tmp10 = ::thx::_Ord::Ord_Impl__obj::fromIntComparison(::thx::Strings_obj::compare_dyn());
HXDLIN(  32)		Bool _hx_tmp11 = ::thx::fp::_Set::Set_Impl__obj::member(m,HX_("W",57,00,00,00),_hx_tmp10);
HXDLIN(  32)		::utest::Assert_obj::isFalse(_hx_tmp11,null(),hx::SourceInfo(HX_("TestSet.hx",6e,62,f8,7e),32,HX_("thx.fp.TestSet",d6,d2,e0,3f),HX_("testSet",70,0a,c6,bd)));
HXLINE(  33)		Int _hx_tmp12 = ::thx::fp::_Set::Set_Impl__obj::size(m);
HXDLIN(  33)		::utest::Assert_obj::equals((int)3,_hx_tmp12,null(),hx::SourceInfo(HX_("TestSet.hx",6e,62,f8,7e),33,HX_("thx.fp.TestSet",d6,d2,e0,3f),HX_("testSet",70,0a,c6,bd)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestSet_obj,testSet,(void))

void TestSet_obj::testMapList(){
            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_0) HXARGC(1)
            		::String _hx_run(::String v){
            			HX_STACK_FRAME("thx.fp.TestSet","testMapList",0x7f9a2d50,"thx.fp.TestSet.testMapList","thx/fp/TestSet.hx",38,0x8c111848)
            			HX_STACK_ARG(v,"v")
HXLINE(  38)			return v.toLowerCase();
            		}
            		HX_END_LOCAL_FUNC1(return)

            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_1) HXARGC(2)
            		::Array< ::String > _hx_run(::Array< ::String > acc,::String a){
            			HX_STACK_FRAME("thx.fp.TestSet","testMapList",0x7f9a2d50,"thx.fp.TestSet.testMapList","thx/fp/TestSet.hx",40,0x8c111848)
            			HX_STACK_ARG(acc,"acc")
            			HX_STACK_ARG(a,"a")
HXLINE(  40)			acc->push(a);
HXDLIN(  40)			return acc;
            		}
            		HX_END_LOCAL_FUNC2(return)

            	HX_STACK_FRAME("thx.fp.TestSet","testMapList",0x7f9a2d50,"thx.fp.TestSet.testMapList","thx/fp/TestSet.hx",36,0x8c111848)
            	HX_STACK_THIS(this)
HXLINE(  37)		HX_VARI( ::hx::EnumBase,set) = ::thx::fp::SetImpl_obj::Bin((int)1,HX_("Y",59,00,00,00),::thx::fp::SetImpl_obj::Tip_dyn(),::thx::fp::SetImpl_obj::Tip_dyn());
HXDLIN(  37)		 ::Dynamic _hx_tmp = ::thx::_Ord::Ord_Impl__obj::fromIntComparison(::thx::Strings_obj::compare_dyn());
HXDLIN(  37)		HX_VARI_NAME( ::hx::EnumBase,set1,"set") = ::thx::fp::_Set::Set_Impl__obj::insert(set,HX_("X",58,00,00,00),_hx_tmp);
HXDLIN(  37)		 ::Dynamic _hx_tmp1 = ::thx::_Ord::Ord_Impl__obj::fromIntComparison(::thx::Strings_obj::compare_dyn());
HXDLIN(  37)		HX_VARI( ::hx::EnumBase,m) = ::thx::fp::_Set::Set_Impl__obj::insert(set1,HX_("Z",5a,00,00,00),_hx_tmp1);
HXDLIN(  37)		HX_VARI( ::hx::EnumBase,l) = ::thx::fp::_Set::Set_Impl__obj::mapList(m, ::Dynamic(new _hx_Closure_0()));
HXLINE(  40)		::Array< ::String > _hx_tmp2 = ( (::Array< ::String >)(::thx::fp::_List::List_Impl__obj::foldLeft(l,::Array_obj< ::String >::__new(0), ::Dynamic(new _hx_Closure_1()))) );
HXDLIN(  40)		::Array< ::String > _hx_tmp3 = ::thx::Arrays_obj::order(_hx_tmp2,::thx::Strings_obj::compare_dyn());
HXDLIN(  40)		::utest::Assert_obj::same(::cpp::VirtualArray_obj::__new(3)->init(0,HX_("x",78,00,00,00))->init(1,HX_("y",79,00,00,00))->init(2,HX_("z",7a,00,00,00)),_hx_tmp3,null(),null(),null(),hx::SourceInfo(HX_("TestSet.hx",6e,62,f8,7e),40,HX_("thx.fp.TestSet",d6,d2,e0,3f),HX_("testMapList",e8,be,77,e9)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestSet_obj,testMapList,(void))

void TestSet_obj::testFoldLeft(){
            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_0) HXARGC(2)
            		::Array< Int > _hx_run(::Array< Int > acc,Int v){
            			HX_STACK_FRAME("thx.fp.TestSet","testFoldLeft",0x021377b2,"thx.fp.TestSet.testFoldLeft","thx/fp/TestSet.hx",45,0x8c111848)
            			HX_STACK_ARG(acc,"acc")
            			HX_STACK_ARG(v,"v")
HXLINE(  46)			acc->push(v);
HXLINE(  47)			return acc;
            		}
            		HX_END_LOCAL_FUNC2(return)

            	HX_STACK_FRAME("thx.fp.TestSet","testFoldLeft",0x021377b2,"thx.fp.TestSet.testFoldLeft","thx/fp/TestSet.hx",43,0x8c111848)
            	HX_STACK_THIS(this)
HXLINE(  44)		HX_VARI( ::hx::EnumBase,set) = ::thx::fp::SetImpl_obj::Bin((int)1,(int)1,::thx::fp::SetImpl_obj::Tip_dyn(),::thx::fp::SetImpl_obj::Tip_dyn());
HXDLIN(  44)		 ::Dynamic _hx_tmp = ::thx::_Ord::Ord_Impl__obj::fromIntComparison(::thx::Ints_obj::compare_dyn());
HXDLIN(  44)		HX_VARI_NAME( ::hx::EnumBase,set1,"set") = ::thx::fp::_Set::Set_Impl__obj::insert(set,(int)2,_hx_tmp);
HXDLIN(  44)		 ::Dynamic _hx_tmp1 = ::thx::_Ord::Ord_Impl__obj::fromIntComparison(::thx::Ints_obj::compare_dyn());
HXDLIN(  44)		HX_VARI_NAME( ::hx::EnumBase,set2,"set") = ::thx::fp::_Set::Set_Impl__obj::insert(set1,(int)3,_hx_tmp1);
HXLINE(  45)		::Array< Int > _hx_tmp2 = ( (::Array< Int >)(::thx::fp::_Set::Set_Impl__obj::foldLeft(set2,::Array_obj< Int >::__new(0), ::Dynamic(new _hx_Closure_0()))) );
HXDLIN(  45)		::Array< Int > _hx_tmp3 = ::thx::Arrays_obj::order(_hx_tmp2,::thx::Ints_obj::compare_dyn());
HXDLIN(  45)		::utest::Assert_obj::same(::cpp::VirtualArray_obj::__new(3)->init(0,(int)1)->init(1,(int)2)->init(2,(int)3),_hx_tmp3,null(),null(),null(),hx::SourceInfo(HX_("TestSet.hx",6e,62,f8,7e),45,HX_("thx.fp.TestSet",d6,d2,e0,3f),HX_("testFoldLeft",1a,4b,15,3a)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestSet_obj,testFoldLeft,(void))

void TestSet_obj::testToList(){
            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_0) HXARGC(2)
            		::Array< ::String > _hx_run(::Array< ::String > acc,::String a){
            			HX_STACK_FRAME("thx.fp.TestSet","testToList",0xc86a2403,"thx.fp.TestSet.testToList","thx/fp/TestSet.hx",55,0x8c111848)
            			HX_STACK_ARG(acc,"acc")
            			HX_STACK_ARG(a,"a")
HXLINE(  55)			acc->push(a);
HXDLIN(  55)			return acc;
            		}
            		HX_END_LOCAL_FUNC2(return)

            	HX_STACK_FRAME("thx.fp.TestSet","testToList",0xc86a2403,"thx.fp.TestSet.testToList","thx/fp/TestSet.hx",51,0x8c111848)
            	HX_STACK_THIS(this)
HXLINE(  52)		HX_VARI( ::hx::EnumBase,set) = ::thx::fp::SetImpl_obj::Bin((int)1,HX_("Y",59,00,00,00),::thx::fp::SetImpl_obj::Tip_dyn(),::thx::fp::SetImpl_obj::Tip_dyn());
HXDLIN(  52)		 ::Dynamic _hx_tmp = ::thx::_Ord::Ord_Impl__obj::fromIntComparison(::thx::Strings_obj::compare_dyn());
HXDLIN(  52)		HX_VARI_NAME( ::hx::EnumBase,set1,"set") = ::thx::fp::_Set::Set_Impl__obj::insert(set,HX_("X",58,00,00,00),_hx_tmp);
HXDLIN(  52)		 ::Dynamic _hx_tmp1 = ::thx::_Ord::Ord_Impl__obj::fromIntComparison(::thx::Strings_obj::compare_dyn());
HXDLIN(  52)		HX_VARI( ::hx::EnumBase,m) = ::thx::fp::_Set::Set_Impl__obj::insert(set1,HX_("Z",5a,00,00,00),_hx_tmp1);
HXDLIN(  52)		HX_VARI( ::hx::EnumBase,l) = ::thx::fp::_Set::Set_Impl__obj::toList(m);
HXLINE(  55)		::Array< ::String > _hx_tmp2 = ( (::Array< ::String >)(::thx::fp::_List::List_Impl__obj::foldLeft(l,::Array_obj< ::String >::__new(0), ::Dynamic(new _hx_Closure_0()))) );
HXDLIN(  55)		::Array< ::String > _hx_tmp3 = ::thx::Arrays_obj::order(_hx_tmp2,::thx::Strings_obj::compare_dyn());
HXDLIN(  55)		::utest::Assert_obj::same(::cpp::VirtualArray_obj::__new(3)->init(0,HX_("X",58,00,00,00))->init(1,HX_("Y",59,00,00,00))->init(2,HX_("Z",5a,00,00,00)),_hx_tmp3,null(),null(),null(),hx::SourceInfo(HX_("TestSet.hx",6e,62,f8,7e),55,HX_("thx.fp.TestSet",d6,d2,e0,3f),HX_("testToList",6b,cd,60,96)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestSet_obj,testToList,(void))


TestSet_obj::TestSet_obj()
{
}

hx::Val TestSet_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 7:
		if (HX_FIELD_EQ(inName,"testSet") ) { return hx::Val( testSet_dyn()); }
		break;
	case 9:
		if (HX_FIELD_EQ(inName,"testEmpty") ) { return hx::Val( testEmpty_dyn()); }
		if (HX_FIELD_EQ(inName,"testSizes") ) { return hx::Val( testSizes_dyn()); }
		break;
	case 10:
		if (HX_FIELD_EQ(inName,"testToList") ) { return hx::Val( testToList_dyn()); }
		break;
	case 11:
		if (HX_FIELD_EQ(inName,"testMapList") ) { return hx::Val( testMapList_dyn()); }
		break;
	case 12:
		if (HX_FIELD_EQ(inName,"testFoldLeft") ) { return hx::Val( testFoldLeft_dyn()); }
	}
	return super::__Field(inName,inCallProp);
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *TestSet_obj_sMemberStorageInfo = 0;
static hx::StaticInfo *TestSet_obj_sStaticStorageInfo = 0;
#endif

static ::String TestSet_obj_sMemberFields[] = {
	HX_HCSTRING("testEmpty","\xdb","\x78","\xdc","\x38"),
	HX_HCSTRING("testSizes","\xe0","\x46","\xdb","\x45"),
	HX_HCSTRING("testSet","\x70","\x0a","\xc6","\xbd"),
	HX_HCSTRING("testMapList","\xe8","\xbe","\x77","\xe9"),
	HX_HCSTRING("testFoldLeft","\x1a","\x4b","\x15","\x3a"),
	HX_HCSTRING("testToList","\x6b","\xcd","\x60","\x96"),
	::String(null()) };

static void TestSet_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(TestSet_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void TestSet_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(TestSet_obj::__mClass,"__mClass");
};

#endif

hx::Class TestSet_obj::__mClass;

void TestSet_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.fp.TestSet","\xd6","\xd2","\xe0","\x3f");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &hx::Class_obj::GetNoStaticField;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = TestSet_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(0 /* sStaticFields */);
	__mClass->mMembers = hx::Class_obj::dupFunctions(TestSet_obj_sMemberFields);
	__mClass->mCanCast = hx::TCanCast< TestSet_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = TestSet_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = TestSet_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = TestSet_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx
} // end namespace fp