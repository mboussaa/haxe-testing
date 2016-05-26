// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_haxe_IMap
#include <haxe/IMap.h>
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
#ifndef INCLUDED_thx_Options
#include <thx/Options.h>
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
#ifndef INCLUDED_thx_fp_CO
#include <thx/fp/CO.h>
#endif
#ifndef INCLUDED_thx_fp_CO2
#include <thx/fp/CO2.h>
#endif
#ifndef INCLUDED_thx_fp_MapImpl
#include <thx/fp/MapImpl.h>
#endif
#ifndef INCLUDED_thx_fp_StringMap
#include <thx/fp/StringMap.h>
#endif
#ifndef INCLUDED_thx_fp_TestMap
#include <thx/fp/TestMap.h>
#endif
#ifndef INCLUDED_thx_fp__Map_Map_Impl_
#include <thx/fp/_Map/Map_Impl_.h>
#endif
#ifndef INCLUDED_utest_Assert
#include <utest/Assert.h>
#endif

namespace thx{
namespace fp{

void TestMap_obj::__construct(){
            	HX_STACK_FRAME("thx.fp.TestMap","new",0x4ba50ac2,"thx.fp.TestMap.new","thx/fp/TestMap.hx",11,0xd5adc18e)
            	HX_STACK_THIS(this)
            	}

Dynamic TestMap_obj::__CreateEmpty() { return new TestMap_obj; }

hx::ObjectPtr< TestMap_obj > TestMap_obj::__new()
{
	hx::ObjectPtr< TestMap_obj > _hx_result = new TestMap_obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic TestMap_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< TestMap_obj > _hx_result = new TestMap_obj();
	_hx_result->__construct();
	return _hx_result;
}

void TestMap_obj::testRemove(){
            	HX_STACK_FRAME("thx.fp.TestMap","testRemove",0xa1769814,"thx.fp.TestMap.testRemove","thx/fp/TestMap.hx",13,0xd5adc18e)
            	HX_STACK_THIS(this)
HXLINE(  14)		HX_VARI( ::hx::EnumBase,map) = ::thx::fp::MapImpl_obj::Bin((int)1,HX_("Y",59,00,00,00),(int)1,::thx::fp::MapImpl_obj::Tip_dyn(),::thx::fp::MapImpl_obj::Tip_dyn());
HXDLIN(  14)		HX_VARI_NAME( ::hx::EnumBase,map1,"map") = ::thx::fp::_Map::Map_Impl__obj::insert(map,HX_("X",58,00,00,00),(int)2,::thx::Strings_obj::order);
HXDLIN(  14)		HX_VARI_NAME( ::hx::EnumBase,map2,"map") = ::thx::fp::_Map::Map_Impl__obj::insert(map1,HX_("Z",5a,00,00,00),(int)3,::thx::Strings_obj::order);
HXDLIN(  14)		HX_VARI( ::hx::EnumBase,m) = ::thx::fp::_Map::Map_Impl__obj::_hx_delete(map2,HX_("X",58,00,00,00),::thx::Strings_obj::order);
HXLINE(  18)		::hx::EnumBase _hx_tmp = ::haxe::ds::Option_obj::Some((int)1);
HXDLIN(  18)		::hx::EnumBase _hx_tmp1 = ::thx::fp::_Map::Map_Impl__obj::lookup(m,HX_("Y",59,00,00,00),::thx::Strings_obj::order);
HXDLIN(  18)		::utest::Assert_obj::same(_hx_tmp,_hx_tmp1,null(),null(),null(),hx::SourceInfo(HX_("TestMap.hx",b4,0b,95,c8),18,HX_("thx.fp.TestMap",d0,41,dc,3f),HX_("testRemove",36,e2,7c,1d)));
HXLINE(  19)		::hx::EnumBase _hx_tmp2 = ::haxe::ds::Option_obj::Some((int)3);
HXDLIN(  19)		::hx::EnumBase _hx_tmp3 = ::thx::fp::_Map::Map_Impl__obj::lookup(m,HX_("Z",5a,00,00,00),::thx::Strings_obj::order);
HXDLIN(  19)		::utest::Assert_obj::same(_hx_tmp2,_hx_tmp3,null(),null(),null(),hx::SourceInfo(HX_("TestMap.hx",b4,0b,95,c8),19,HX_("thx.fp.TestMap",d0,41,dc,3f),HX_("testRemove",36,e2,7c,1d)));
HXLINE(  20)		Int _hx_tmp4 = ::thx::fp::_Map::Map_Impl__obj::size(m);
HXDLIN(  20)		::utest::Assert_obj::equals((int)2,_hx_tmp4,null(),hx::SourceInfo(HX_("TestMap.hx",b4,0b,95,c8),20,HX_("thx.fp.TestMap",d0,41,dc,3f),HX_("testRemove",36,e2,7c,1d)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestMap_obj,testRemove,(void))

void TestMap_obj::testEmpty(){
            	HX_STACK_FRAME("thx.fp.TestMap","testEmpty",0x1f0ca8bd,"thx.fp.TestMap.testEmpty","thx/fp/TestMap.hx",23,0xd5adc18e)
            	HX_STACK_THIS(this)
HXLINE(  24)		HX_VARI( ::hx::EnumBase,m) = ::thx::fp::MapImpl_obj::Tip_dyn();
HXLINE(  25)		::hx::EnumBase _hx_tmp = ::thx::fp::_Map::Map_Impl__obj::lookup(m,HX_("some",f4,22,58,4c),::thx::Strings_obj::order);
HXDLIN(  25)		::utest::Assert_obj::same(::haxe::ds::Option_obj::None_dyn(),_hx_tmp,null(),null(),null(),hx::SourceInfo(HX_("TestMap.hx",b4,0b,95,c8),25,HX_("thx.fp.TestMap",d0,41,dc,3f),HX_("testEmpty",db,78,dc,38)));
HXLINE(  26)		Int _hx_tmp1 = ::thx::fp::_Map::Map_Impl__obj::size(m);
HXDLIN(  26)		::utest::Assert_obj::equals((int)0,_hx_tmp1,null(),hx::SourceInfo(HX_("TestMap.hx",b4,0b,95,c8),26,HX_("thx.fp.TestMap",d0,41,dc,3f),HX_("testEmpty",db,78,dc,38)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestMap_obj,testEmpty,(void))

void TestMap_obj::testSizes(){
            	HX_STACK_FRAME("thx.fp.TestMap","testSizes",0x2c0b76c2,"thx.fp.TestMap.testSizes","thx/fp/TestMap.hx",29,0xd5adc18e)
            	HX_STACK_THIS(this)
HXLINE(  30)		HX_VARI( ::hx::EnumBase,map) = ::thx::fp::MapImpl_obj::Bin((int)1,HX_("B",42,00,00,00),(int)1,::thx::fp::MapImpl_obj::Tip_dyn(),::thx::fp::MapImpl_obj::Tip_dyn());
HXDLIN(  30)		HX_VARI_NAME( ::hx::EnumBase,map1,"map") = ::thx::fp::_Map::Map_Impl__obj::insert(map,HX_("A",41,00,00,00),(int)1,::thx::Strings_obj::order);
HXDLIN(  30)		::hx::EnumBase _hx_tmp = ::thx::fp::_Map::Map_Impl__obj::insert(map1,HX_("C",43,00,00,00),(int)1,::thx::Strings_obj::order);
HXDLIN(  30)		Int _hx_tmp1 = ::thx::fp::_Map::Map_Impl__obj::size(_hx_tmp);
HXDLIN(  30)		::utest::Assert_obj::equals((int)3,_hx_tmp1,null(),hx::SourceInfo(HX_("TestMap.hx",b4,0b,95,c8),30,HX_("thx.fp.TestMap",d0,41,dc,3f),HX_("testSizes",e0,46,db,45)));
HXLINE(  31)		HX_VARI_NAME( ::hx::EnumBase,map2,"map") = ::thx::fp::MapImpl_obj::Bin((int)1,HX_("A",41,00,00,00),(int)1,::thx::fp::MapImpl_obj::Tip_dyn(),::thx::fp::MapImpl_obj::Tip_dyn());
HXDLIN(  31)		HX_VARI_NAME( ::hx::EnumBase,map3,"map") = ::thx::fp::_Map::Map_Impl__obj::insert(map2,HX_("B",42,00,00,00),(int)1,::thx::Strings_obj::order);
HXDLIN(  31)		::hx::EnumBase _hx_tmp2 = ::thx::fp::_Map::Map_Impl__obj::insert(map3,HX_("C",43,00,00,00),(int)1,::thx::Strings_obj::order);
HXDLIN(  31)		Int _hx_tmp3 = ::thx::fp::_Map::Map_Impl__obj::size(_hx_tmp2);
HXDLIN(  31)		::utest::Assert_obj::equals((int)3,_hx_tmp3,null(),hx::SourceInfo(HX_("TestMap.hx",b4,0b,95,c8),31,HX_("thx.fp.TestMap",d0,41,dc,3f),HX_("testSizes",e0,46,db,45)));
HXLINE(  32)		HX_VARI_NAME( ::hx::EnumBase,map4,"map") = ::thx::fp::MapImpl_obj::Bin((int)1,HX_("C",43,00,00,00),(int)1,::thx::fp::MapImpl_obj::Tip_dyn(),::thx::fp::MapImpl_obj::Tip_dyn());
HXDLIN(  32)		HX_VARI_NAME( ::hx::EnumBase,map5,"map") = ::thx::fp::_Map::Map_Impl__obj::insert(map4,HX_("B",42,00,00,00),(int)1,::thx::Strings_obj::order);
HXDLIN(  32)		::hx::EnumBase _hx_tmp4 = ::thx::fp::_Map::Map_Impl__obj::insert(map5,HX_("A",41,00,00,00),(int)1,::thx::Strings_obj::order);
HXDLIN(  32)		Int _hx_tmp5 = ::thx::fp::_Map::Map_Impl__obj::size(_hx_tmp4);
HXDLIN(  32)		::utest::Assert_obj::equals((int)3,_hx_tmp5,null(),hx::SourceInfo(HX_("TestMap.hx",b4,0b,95,c8),32,HX_("thx.fp.TestMap",d0,41,dc,3f),HX_("testSizes",e0,46,db,45)));
HXLINE(  33)		HX_VARI_NAME( ::hx::EnumBase,map6,"map") = ::thx::fp::MapImpl_obj::Bin((int)1,HX_("B",42,00,00,00),(int)1,::thx::fp::MapImpl_obj::Tip_dyn(),::thx::fp::MapImpl_obj::Tip_dyn());
HXDLIN(  33)		HX_VARI_NAME( ::hx::EnumBase,map7,"map") = ::thx::fp::_Map::Map_Impl__obj::insert(map6,HX_("C",43,00,00,00),(int)1,::thx::Strings_obj::order);
HXDLIN(  33)		::hx::EnumBase _hx_tmp6 = ::thx::fp::_Map::Map_Impl__obj::insert(map7,HX_("A",41,00,00,00),(int)1,::thx::Strings_obj::order);
HXDLIN(  33)		Int _hx_tmp7 = ::thx::fp::_Map::Map_Impl__obj::size(_hx_tmp6);
HXDLIN(  33)		::utest::Assert_obj::equals((int)3,_hx_tmp7,null(),hx::SourceInfo(HX_("TestMap.hx",b4,0b,95,c8),33,HX_("thx.fp.TestMap",d0,41,dc,3f),HX_("testSizes",e0,46,db,45)));
HXLINE(  34)		HX_VARI_NAME( ::hx::EnumBase,map8,"map") = ::thx::fp::MapImpl_obj::Bin((int)1,HX_("C",43,00,00,00),(int)1,::thx::fp::MapImpl_obj::Tip_dyn(),::thx::fp::MapImpl_obj::Tip_dyn());
HXDLIN(  34)		HX_VARI_NAME( ::hx::EnumBase,map9,"map") = ::thx::fp::_Map::Map_Impl__obj::insert(map8,HX_("A",41,00,00,00),(int)1,::thx::Strings_obj::order);
HXDLIN(  34)		::hx::EnumBase _hx_tmp8 = ::thx::fp::_Map::Map_Impl__obj::insert(map9,HX_("B",42,00,00,00),(int)1,::thx::Strings_obj::order);
HXDLIN(  34)		Int _hx_tmp9 = ::thx::fp::_Map::Map_Impl__obj::size(_hx_tmp8);
HXDLIN(  34)		::utest::Assert_obj::equals((int)3,_hx_tmp9,null(),hx::SourceInfo(HX_("TestMap.hx",b4,0b,95,c8),34,HX_("thx.fp.TestMap",d0,41,dc,3f),HX_("testSizes",e0,46,db,45)));
HXLINE(  35)		HX_VARI_NAME( ::hx::EnumBase,map10,"map") = ::thx::fp::MapImpl_obj::Bin((int)1,HX_("A",41,00,00,00),(int)1,::thx::fp::MapImpl_obj::Tip_dyn(),::thx::fp::MapImpl_obj::Tip_dyn());
HXDLIN(  35)		HX_VARI_NAME( ::hx::EnumBase,map11,"map") = ::thx::fp::_Map::Map_Impl__obj::insert(map10,HX_("C",43,00,00,00),(int)1,::thx::Strings_obj::order);
HXDLIN(  35)		::hx::EnumBase _hx_tmp10 = ::thx::fp::_Map::Map_Impl__obj::insert(map11,HX_("B",42,00,00,00),(int)1,::thx::Strings_obj::order);
HXDLIN(  35)		Int _hx_tmp11 = ::thx::fp::_Map::Map_Impl__obj::size(_hx_tmp10);
HXDLIN(  35)		::utest::Assert_obj::equals((int)3,_hx_tmp11,null(),hx::SourceInfo(HX_("TestMap.hx",b4,0b,95,c8),35,HX_("thx.fp.TestMap",d0,41,dc,3f),HX_("testSizes",e0,46,db,45)));
HXLINE(  37)		HX_VARI_NAME( ::hx::EnumBase,map12,"map") = ::thx::fp::MapImpl_obj::Bin((int)1,HX_("A",41,00,00,00),(int)1,::thx::fp::MapImpl_obj::Tip_dyn(),::thx::fp::MapImpl_obj::Tip_dyn());
HXDLIN(  37)		HX_VARI_NAME( ::hx::EnumBase,map13,"map") = ::thx::fp::_Map::Map_Impl__obj::insert(map12,HX_("A",41,00,00,00),(int)1,::thx::Strings_obj::order);
HXDLIN(  37)		::hx::EnumBase _hx_tmp12 = ::thx::fp::_Map::Map_Impl__obj::insert(map13,HX_("A",41,00,00,00),(int)1,::thx::Strings_obj::order);
HXDLIN(  37)		Int _hx_tmp13 = ::thx::fp::_Map::Map_Impl__obj::size(_hx_tmp12);
HXDLIN(  37)		::utest::Assert_obj::equals((int)1,_hx_tmp13,null(),hx::SourceInfo(HX_("TestMap.hx",b4,0b,95,c8),37,HX_("thx.fp.TestMap",d0,41,dc,3f),HX_("testSizes",e0,46,db,45)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestMap_obj,testSizes,(void))

void TestMap_obj::testFoldLeft(){
            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_0) HXARGC(2)
            		::Array< Int > _hx_run(::Array< Int > arr1,Int v){
            			HX_STACK_FRAME("thx.fp.TestMap","testFoldLeft",0xf84eb478,"thx.fp.TestMap.testFoldLeft","thx/fp/TestMap.hx",42,0xd5adc18e)
            			HX_STACK_ARG(arr1,"arr1")
            			HX_STACK_ARG(v,"v")
HXLINE(  43)			arr1->push(v);
HXLINE(  44)			return arr1;
            		}
            		HX_END_LOCAL_FUNC2(return)

            	HX_STACK_FRAME("thx.fp.TestMap","testFoldLeft",0xf84eb478,"thx.fp.TestMap.testFoldLeft","thx/fp/TestMap.hx",40,0xd5adc18e)
            	HX_STACK_THIS(this)
HXLINE(  41)		HX_VARI( ::hx::EnumBase,map) = ::thx::fp::MapImpl_obj::Bin((int)1,HX_("A",41,00,00,00),(int)1,::thx::fp::MapImpl_obj::Tip_dyn(),::thx::fp::MapImpl_obj::Tip_dyn());
HXDLIN(  41)		HX_VARI_NAME( ::hx::EnumBase,map1,"map") = ::thx::fp::_Map::Map_Impl__obj::insert(map,HX_("B",42,00,00,00),(int)2,::thx::Strings_obj::order);
HXDLIN(  41)		HX_VARI_NAME( ::hx::EnumBase,map2,"map") = ::thx::fp::_Map::Map_Impl__obj::insert(map1,HX_("C",43,00,00,00),(int)3,::thx::Strings_obj::order);
HXLINE(  42)		HX_VARI( ::Array< Int >,arr) = ( (::Array< Int >)(::thx::fp::_Map::Map_Impl__obj::foldLeft(map2,::Array_obj< Int >::__new(0), ::Dynamic(new _hx_Closure_0()))) );
HXLINE(  46)		::Array< Int > _hx_tmp = ::thx::Arrays_obj::order(arr,::thx::Ints_obj::compare_dyn());
HXDLIN(  46)		::utest::Assert_obj::same(::cpp::VirtualArray_obj::__new(3)->init(0,(int)1)->init(1,(int)2)->init(2,(int)3),_hx_tmp,null(),null(),null(),hx::SourceInfo(HX_("TestMap.hx",b4,0b,95,c8),46,HX_("thx.fp.TestMap",d0,41,dc,3f),HX_("testFoldLeft",1a,4b,15,3a)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestMap_obj,testFoldLeft,(void))

void TestMap_obj::testFoldLeftKeys(){
            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_0) HXARGC(2)
            		::Array< ::String > _hx_run(::Array< ::String > arr1,::String k){
            			HX_STACK_FRAME("thx.fp.TestMap","testFoldLeftKeys",0xa1ae5e8c,"thx.fp.TestMap.testFoldLeftKeys","thx/fp/TestMap.hx",51,0xd5adc18e)
            			HX_STACK_ARG(arr1,"arr1")
            			HX_STACK_ARG(k,"k")
HXLINE(  52)			arr1->push(k);
HXLINE(  53)			return arr1;
            		}
            		HX_END_LOCAL_FUNC2(return)

            	HX_STACK_FRAME("thx.fp.TestMap","testFoldLeftKeys",0xa1ae5e8c,"thx.fp.TestMap.testFoldLeftKeys","thx/fp/TestMap.hx",49,0xd5adc18e)
            	HX_STACK_THIS(this)
HXLINE(  50)		HX_VARI( ::hx::EnumBase,map) = ::thx::fp::MapImpl_obj::Bin((int)1,HX_("A",41,00,00,00),(int)1,::thx::fp::MapImpl_obj::Tip_dyn(),::thx::fp::MapImpl_obj::Tip_dyn());
HXDLIN(  50)		HX_VARI_NAME( ::hx::EnumBase,map1,"map") = ::thx::fp::_Map::Map_Impl__obj::insert(map,HX_("B",42,00,00,00),(int)2,::thx::Strings_obj::order);
HXDLIN(  50)		HX_VARI_NAME( ::hx::EnumBase,map2,"map") = ::thx::fp::_Map::Map_Impl__obj::insert(map1,HX_("C",43,00,00,00),(int)3,::thx::Strings_obj::order);
HXLINE(  51)		HX_VARI( ::Array< ::String >,arr) = ( (::Array< ::String >)(::thx::fp::_Map::Map_Impl__obj::foldLeftKeys(map2,::Array_obj< ::String >::__new(0), ::Dynamic(new _hx_Closure_0()))) );
HXLINE(  55)		::Array< ::String > _hx_tmp = ::thx::Arrays_obj::order(arr,::thx::Strings_obj::compare_dyn());
HXDLIN(  55)		::utest::Assert_obj::same(::cpp::VirtualArray_obj::__new(3)->init(0,HX_("A",41,00,00,00))->init(1,HX_("B",42,00,00,00))->init(2,HX_("C",43,00,00,00)),_hx_tmp,null(),null(),null(),hx::SourceInfo(HX_("TestMap.hx",b4,0b,95,c8),55,HX_("thx.fp.TestMap",d0,41,dc,3f),HX_("testFoldLeftKeys",2e,ee,61,a0)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestMap_obj,testFoldLeftKeys,(void))

void TestMap_obj::testSet(){
            	HX_STACK_FRAME("thx.fp.TestMap","testSet",0x30811dd2,"thx.fp.TestMap.testSet","thx/fp/TestMap.hx",58,0xd5adc18e)
            	HX_STACK_THIS(this)
HXLINE(  59)		HX_VARI( ::hx::EnumBase,map) = ::thx::fp::MapImpl_obj::Bin((int)1,HX_("Y",59,00,00,00),(int)1,::thx::fp::MapImpl_obj::Tip_dyn(),::thx::fp::MapImpl_obj::Tip_dyn());
HXDLIN(  59)		HX_VARI_NAME( ::hx::EnumBase,map1,"map") = ::thx::fp::_Map::Map_Impl__obj::insert(map,HX_("X",58,00,00,00),(int)2,::thx::Strings_obj::order);
HXDLIN(  59)		HX_VARI( ::hx::EnumBase,m) = ::thx::fp::_Map::Map_Impl__obj::insert(map1,HX_("Z",5a,00,00,00),(int)3,::thx::Strings_obj::order);
HXLINE(  60)		::hx::EnumBase _hx_tmp = ::haxe::ds::Option_obj::Some((int)2);
HXDLIN(  60)		::hx::EnumBase _hx_tmp1 = ::thx::fp::_Map::Map_Impl__obj::lookup(m,HX_("X",58,00,00,00),::thx::Strings_obj::order);
HXDLIN(  60)		::utest::Assert_obj::same(_hx_tmp,_hx_tmp1,null(),null(),null(),hx::SourceInfo(HX_("TestMap.hx",b4,0b,95,c8),60,HX_("thx.fp.TestMap",d0,41,dc,3f),HX_("testSet",70,0a,c6,bd)));
HXLINE(  61)		::hx::EnumBase _hx_tmp2 = ::haxe::ds::Option_obj::Some((int)1);
HXDLIN(  61)		::hx::EnumBase _hx_tmp3 = ::thx::fp::_Map::Map_Impl__obj::lookup(m,HX_("Y",59,00,00,00),::thx::Strings_obj::order);
HXDLIN(  61)		::utest::Assert_obj::same(_hx_tmp2,_hx_tmp3,null(),null(),null(),hx::SourceInfo(HX_("TestMap.hx",b4,0b,95,c8),61,HX_("thx.fp.TestMap",d0,41,dc,3f),HX_("testSet",70,0a,c6,bd)));
HXLINE(  62)		::hx::EnumBase _hx_tmp4 = ::haxe::ds::Option_obj::Some((int)3);
HXDLIN(  62)		::hx::EnumBase _hx_tmp5 = ::thx::fp::_Map::Map_Impl__obj::lookup(m,HX_("Z",5a,00,00,00),::thx::Strings_obj::order);
HXDLIN(  62)		::utest::Assert_obj::same(_hx_tmp4,_hx_tmp5,null(),null(),null(),hx::SourceInfo(HX_("TestMap.hx",b4,0b,95,c8),62,HX_("thx.fp.TestMap",d0,41,dc,3f),HX_("testSet",70,0a,c6,bd)));
HXLINE(  63)		Int _hx_tmp6 = ::thx::fp::_Map::Map_Impl__obj::size(m);
HXDLIN(  63)		::utest::Assert_obj::equals((int)3,_hx_tmp6,null(),hx::SourceInfo(HX_("TestMap.hx",b4,0b,95,c8),63,HX_("thx.fp.TestMap",d0,41,dc,3f),HX_("testSet",70,0a,c6,bd)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestMap_obj,testSet,(void))

void TestMap_obj::testObjectSet(){
            	HX_STACK_FRAME("thx.fp.TestMap","testObjectSet",0x2abf9c53,"thx.fp.TestMap.testObjectSet","thx/fp/TestMap.hx",66,0xd5adc18e)
            	HX_STACK_THIS(this)
HXLINE(  67)		HX_VARI(  ::thx::fp::CO,a) =  ::thx::fp::CO_obj::__new(HX_("a",61,00,00,00));
HXDLIN(  67)		HX_VARI(  ::thx::fp::CO,b) =  ::thx::fp::CO_obj::__new(HX_("b",62,00,00,00));
HXDLIN(  67)		HX_VARI(  ::thx::fp::CO,c) =  ::thx::fp::CO_obj::__new(HX_("c",63,00,00,00));
HXLINE(  70)		HX_VARI( ::hx::EnumBase,map) = ::thx::fp::MapImpl_obj::Bin((int)1,a,(int)1,::thx::fp::MapImpl_obj::Tip_dyn(),::thx::fp::MapImpl_obj::Tip_dyn());
HXDLIN(  70)		 ::Dynamic _hx_tmp = ::thx::_Ord::Ord_Impl__obj::forComparableOrd();
HXDLIN(  70)		HX_VARI_NAME( ::hx::EnumBase,map1,"map") = ::thx::fp::_Map::Map_Impl__obj::insert(map,b,(int)2,_hx_tmp);
HXDLIN(  70)		 ::Dynamic _hx_tmp1 = ::thx::_Ord::Ord_Impl__obj::forComparableOrd();
HXLINE(  67)		HX_VARI( ::hx::EnumBase,m) = ::thx::fp::_Map::Map_Impl__obj::insert(map1,c,(int)3,_hx_tmp1);
HXLINE(  74)		::hx::EnumBase _hx_tmp2 = ::haxe::ds::Option_obj::Some((int)1);
HXDLIN(  74)		 ::Dynamic _hx_tmp3 = ::thx::_Ord::Ord_Impl__obj::forComparableOrd();
HXDLIN(  74)		::hx::EnumBase _hx_tmp4 = ::thx::fp::_Map::Map_Impl__obj::lookup(m,a,_hx_tmp3);
HXDLIN(  74)		::utest::Assert_obj::same(_hx_tmp2,_hx_tmp4,null(),null(),null(),hx::SourceInfo(HX_("TestMap.hx",b4,0b,95,c8),74,HX_("thx.fp.TestMap",d0,41,dc,3f),HX_("testObjectSet",71,d3,bc,76)));
HXLINE(  75)		::hx::EnumBase _hx_tmp5 = ::haxe::ds::Option_obj::Some((int)2);
HXDLIN(  75)		 ::Dynamic _hx_tmp6 = ::thx::_Ord::Ord_Impl__obj::forComparableOrd();
HXDLIN(  75)		::hx::EnumBase _hx_tmp7 = ::thx::fp::_Map::Map_Impl__obj::lookup(m,b,_hx_tmp6);
HXDLIN(  75)		::utest::Assert_obj::same(_hx_tmp5,_hx_tmp7,null(),null(),null(),hx::SourceInfo(HX_("TestMap.hx",b4,0b,95,c8),75,HX_("thx.fp.TestMap",d0,41,dc,3f),HX_("testObjectSet",71,d3,bc,76)));
HXLINE(  76)		::hx::EnumBase _hx_tmp8 = ::haxe::ds::Option_obj::Some((int)3);
HXDLIN(  76)		 ::Dynamic _hx_tmp9 = ::thx::_Ord::Ord_Impl__obj::forComparableOrd();
HXDLIN(  76)		::hx::EnumBase _hx_tmp10 = ::thx::fp::_Map::Map_Impl__obj::lookup(m,c,_hx_tmp9);
HXDLIN(  76)		::utest::Assert_obj::same(_hx_tmp8,_hx_tmp10,null(),null(),null(),hx::SourceInfo(HX_("TestMap.hx",b4,0b,95,c8),76,HX_("thx.fp.TestMap",d0,41,dc,3f),HX_("testObjectSet",71,d3,bc,76)));
HXLINE(  77)		Int _hx_tmp11 = ::thx::fp::_Map::Map_Impl__obj::size(m);
HXDLIN(  77)		::utest::Assert_obj::equals((int)3,_hx_tmp11,null(),hx::SourceInfo(HX_("TestMap.hx",b4,0b,95,c8),77,HX_("thx.fp.TestMap",d0,41,dc,3f),HX_("testObjectSet",71,d3,bc,76)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestMap_obj,testObjectSet,(void))

void TestMap_obj::testObjectSet2(){
            	HX_STACK_FRAME("thx.fp.TestMap","testObjectSet2",0x3ce92c7f,"thx.fp.TestMap.testObjectSet2","thx/fp/TestMap.hx",80,0xd5adc18e)
            	HX_STACK_THIS(this)
HXLINE(  81)		HX_VARI(  ::thx::fp::CO2,a) =  ::thx::fp::CO2_obj::__new(HX_("a",61,00,00,00));
HXDLIN(  81)		HX_VARI(  ::thx::fp::CO2,b) =  ::thx::fp::CO2_obj::__new(HX_("b",62,00,00,00));
HXDLIN(  81)		HX_VARI(  ::thx::fp::CO2,c) =  ::thx::fp::CO2_obj::__new(HX_("c",63,00,00,00));
HXLINE(  84)		HX_VARI( ::hx::EnumBase,map) = ::thx::fp::MapImpl_obj::Bin((int)1,a,(int)1,::thx::fp::MapImpl_obj::Tip_dyn(),::thx::fp::MapImpl_obj::Tip_dyn());
HXDLIN(  84)		 ::Dynamic _hx_tmp = ::thx::_Ord::Ord_Impl__obj::forComparable();
HXDLIN(  84)		HX_VARI_NAME( ::hx::EnumBase,map1,"map") = ::thx::fp::_Map::Map_Impl__obj::insert(map,b,(int)2,_hx_tmp);
HXDLIN(  84)		 ::Dynamic _hx_tmp1 = ::thx::_Ord::Ord_Impl__obj::forComparable();
HXLINE(  81)		HX_VARI( ::hx::EnumBase,m) = ::thx::fp::_Map::Map_Impl__obj::insert(map1,c,(int)3,_hx_tmp1);
HXLINE(  88)		::hx::EnumBase _hx_tmp2 = ::haxe::ds::Option_obj::Some((int)1);
HXDLIN(  88)		 ::Dynamic _hx_tmp3 = ::thx::_Ord::Ord_Impl__obj::forComparable();
HXDLIN(  88)		::hx::EnumBase _hx_tmp4 = ::thx::fp::_Map::Map_Impl__obj::lookup(m,a,_hx_tmp3);
HXDLIN(  88)		::utest::Assert_obj::same(_hx_tmp2,_hx_tmp4,null(),null(),null(),hx::SourceInfo(HX_("TestMap.hx",b4,0b,95,c8),88,HX_("thx.fp.TestMap",d0,41,dc,3f),HX_("testObjectSet2",a1,2f,7c,6e)));
HXLINE(  89)		::hx::EnumBase _hx_tmp5 = ::haxe::ds::Option_obj::Some((int)2);
HXDLIN(  89)		 ::Dynamic _hx_tmp6 = ::thx::_Ord::Ord_Impl__obj::forComparable();
HXDLIN(  89)		::hx::EnumBase _hx_tmp7 = ::thx::fp::_Map::Map_Impl__obj::lookup(m,b,_hx_tmp6);
HXDLIN(  89)		::utest::Assert_obj::same(_hx_tmp5,_hx_tmp7,null(),null(),null(),hx::SourceInfo(HX_("TestMap.hx",b4,0b,95,c8),89,HX_("thx.fp.TestMap",d0,41,dc,3f),HX_("testObjectSet2",a1,2f,7c,6e)));
HXLINE(  90)		::hx::EnumBase _hx_tmp8 = ::haxe::ds::Option_obj::Some((int)3);
HXDLIN(  90)		 ::Dynamic _hx_tmp9 = ::thx::_Ord::Ord_Impl__obj::forComparable();
HXDLIN(  90)		::hx::EnumBase _hx_tmp10 = ::thx::fp::_Map::Map_Impl__obj::lookup(m,c,_hx_tmp9);
HXDLIN(  90)		::utest::Assert_obj::same(_hx_tmp8,_hx_tmp10,null(),null(),null(),hx::SourceInfo(HX_("TestMap.hx",b4,0b,95,c8),90,HX_("thx.fp.TestMap",d0,41,dc,3f),HX_("testObjectSet2",a1,2f,7c,6e)));
HXLINE(  91)		Int _hx_tmp11 = ::thx::fp::_Map::Map_Impl__obj::size(m);
HXDLIN(  91)		::utest::Assert_obj::equals((int)3,_hx_tmp11,null(),hx::SourceInfo(HX_("TestMap.hx",b4,0b,95,c8),91,HX_("thx.fp.TestMap",d0,41,dc,3f),HX_("testObjectSet2",a1,2f,7c,6e)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestMap_obj,testObjectSet2,(void))

void TestMap_obj::testFromNative(){
            	HX_STACK_FRAME("thx.fp.TestMap","testFromNative",0xd3c0f271,"thx.fp.TestMap.testFromNative","thx/fp/TestMap.hx",94,0xd5adc18e)
            	HX_STACK_THIS(this)
HXLINE(  95)		HX_VARI(  ::haxe::ds::StringMap,_g) =  ::haxe::ds::StringMap_obj::__new();
HXDLIN(  95)		_g->set(HX_("a",61,00,00,00),(int)1);
HXDLIN(  95)		_g->set(HX_("b",62,00,00,00),(int)2);
HXDLIN(  95)		HX_VARI( ::hx::EnumBase,map) = ::thx::fp::StringMap_obj::fromNative(_g);
HXLINE(  97)		Int _hx_tmp = ::thx::fp::_Map::Map_Impl__obj::size(map);
HXDLIN(  97)		::utest::Assert_obj::equals((int)2,_hx_tmp,null(),hx::SourceInfo(HX_("TestMap.hx",b4,0b,95,c8),97,HX_("thx.fp.TestMap",d0,41,dc,3f),HX_("testFromNative",93,f5,53,05)));
HXLINE(  98)		::hx::EnumBase _hx_tmp1 = ::thx::fp::_Map::Map_Impl__obj::lookup(map,HX_("a",61,00,00,00),::thx::Strings_obj::order);
HXDLIN(  98)		Bool _hx_tmp2 = ::thx::Options_obj::toBool(_hx_tmp1);
HXDLIN(  98)		::utest::Assert_obj::isTrue(_hx_tmp2,null(),hx::SourceInfo(HX_("TestMap.hx",b4,0b,95,c8),98,HX_("thx.fp.TestMap",d0,41,dc,3f),HX_("testFromNative",93,f5,53,05)));
HXLINE(  99)		::hx::EnumBase _hx_tmp3 = ::thx::fp::_Map::Map_Impl__obj::lookup(map,HX_("b",62,00,00,00),::thx::Strings_obj::order);
HXDLIN(  99)		Bool _hx_tmp4 = ::thx::Options_obj::toBool(_hx_tmp3);
HXDLIN(  99)		::utest::Assert_obj::isTrue(_hx_tmp4,null(),hx::SourceInfo(HX_("TestMap.hx",b4,0b,95,c8),99,HX_("thx.fp.TestMap",d0,41,dc,3f),HX_("testFromNative",93,f5,53,05)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestMap_obj,testFromNative,(void))


TestMap_obj::TestMap_obj()
{
}

hx::Val TestMap_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
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
		if (HX_FIELD_EQ(inName,"testRemove") ) { return hx::Val( testRemove_dyn()); }
		break;
	case 12:
		if (HX_FIELD_EQ(inName,"testFoldLeft") ) { return hx::Val( testFoldLeft_dyn()); }
		break;
	case 13:
		if (HX_FIELD_EQ(inName,"testObjectSet") ) { return hx::Val( testObjectSet_dyn()); }
		break;
	case 14:
		if (HX_FIELD_EQ(inName,"testObjectSet2") ) { return hx::Val( testObjectSet2_dyn()); }
		if (HX_FIELD_EQ(inName,"testFromNative") ) { return hx::Val( testFromNative_dyn()); }
		break;
	case 16:
		if (HX_FIELD_EQ(inName,"testFoldLeftKeys") ) { return hx::Val( testFoldLeftKeys_dyn()); }
	}
	return super::__Field(inName,inCallProp);
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *TestMap_obj_sMemberStorageInfo = 0;
static hx::StaticInfo *TestMap_obj_sStaticStorageInfo = 0;
#endif

static ::String TestMap_obj_sMemberFields[] = {
	HX_HCSTRING("testRemove","\x36","\xe2","\x7c","\x1d"),
	HX_HCSTRING("testEmpty","\xdb","\x78","\xdc","\x38"),
	HX_HCSTRING("testSizes","\xe0","\x46","\xdb","\x45"),
	HX_HCSTRING("testFoldLeft","\x1a","\x4b","\x15","\x3a"),
	HX_HCSTRING("testFoldLeftKeys","\x2e","\xee","\x61","\xa0"),
	HX_HCSTRING("testSet","\x70","\x0a","\xc6","\xbd"),
	HX_HCSTRING("testObjectSet","\x71","\xd3","\xbc","\x76"),
	HX_HCSTRING("testObjectSet2","\xa1","\x2f","\x7c","\x6e"),
	HX_HCSTRING("testFromNative","\x93","\xf5","\x53","\x05"),
	::String(null()) };

static void TestMap_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(TestMap_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void TestMap_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(TestMap_obj::__mClass,"__mClass");
};

#endif

hx::Class TestMap_obj::__mClass;

void TestMap_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.fp.TestMap","\xd0","\x41","\xdc","\x3f");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &hx::Class_obj::GetNoStaticField;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = TestMap_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(0 /* sStaticFields */);
	__mClass->mMembers = hx::Class_obj::dupFunctions(TestMap_obj_sMemberFields);
	__mClass->mCanCast = hx::TCanCast< TestMap_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = TestMap_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = TestMap_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = TestMap_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx
} // end namespace fp
