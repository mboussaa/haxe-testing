// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_thx_TestPath
#include <thx/TestPath.h>
#endif
#ifndef INCLUDED_thx__Path_Path_Impl_
#include <thx/_Path/Path_Impl_.h>
#endif
#ifndef INCLUDED_utest_Assert
#include <utest/Assert.h>
#endif

namespace thx{

void TestPath_obj::__construct(){
            	HX_STACK_FRAME("thx.TestPath","new",0xf67c59d3,"thx.TestPath.new","thx/TestPath.hx",8,0x07286e9c)
            	HX_STACK_THIS(this)
            	}

Dynamic TestPath_obj::__CreateEmpty() { return new TestPath_obj; }

hx::ObjectPtr< TestPath_obj > TestPath_obj::__new()
{
	hx::ObjectPtr< TestPath_obj > _hx_result = new TestPath_obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic TestPath_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< TestPath_obj > _hx_result = new TestPath_obj();
	_hx_result->__construct();
	return _hx_result;
}

void TestPath_obj::testIsRelativeAndIsAbsolute(){
            	HX_STACK_FRAME("thx.TestPath","testIsRelativeAndIsAbsolute",0xb2f0d9c3,"thx.TestPath.testIsRelativeAndIsAbsolute","thx/TestPath.hx",10,0x07286e9c)
            	HX_STACK_THIS(this)
HXLINE(  11)		HX_VARI( ::Array< ::String >,rel) = ::thx::_Path::Path_Impl__obj::fromString(HX_("a/b",f4,c3,49,00));
HXDLIN(  11)		HX_VARI( ::Array< ::String >,abs) = ::thx::_Path::Path_Impl__obj::fromString(HX_("/a/b",25,cb,5a,1f));
HXLINE(  13)		::utest::Assert_obj::isTrue((rel->__get((int)1) == HX_("",00,00,00,00)),null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),13,HX_("thx.TestPath",61,74,98,56),HX_("testIsRelativeAndIsAbsolute",50,cf,f5,97)));
HXLINE(  14)		::utest::Assert_obj::isFalse((rel->__get((int)1) != HX_("",00,00,00,00)),null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),14,HX_("thx.TestPath",61,74,98,56),HX_("testIsRelativeAndIsAbsolute",50,cf,f5,97)));
HXLINE(  15)		::utest::Assert_obj::isTrue((abs->__get((int)1) != HX_("",00,00,00,00)),null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),15,HX_("thx.TestPath",61,74,98,56),HX_("testIsRelativeAndIsAbsolute",50,cf,f5,97)));
HXLINE(  16)		::utest::Assert_obj::isFalse((abs->__get((int)1) == HX_("",00,00,00,00)),null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),16,HX_("thx.TestPath",61,74,98,56),HX_("testIsRelativeAndIsAbsolute",50,cf,f5,97)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestPath_obj,testIsRelativeAndIsAbsolute,(void))

void TestPath_obj::testPathTo(){
            	HX_STACK_FRAME("thx.TestPath","testPathTo",0x575ac35f,"thx.TestPath.testPathTo","thx/TestPath.hx",19,0x07286e9c)
            	HX_STACK_THIS(this)
HXLINE(  20)		HX_VARI( ::Array< ::String >,path1) = ::thx::_Path::Path_Impl__obj::fromString(HX_("/a/b/c",b9,c7,ff,c3));
HXDLIN(  20)		HX_VARI( ::Array< ::String >,path2) = ::thx::_Path::Path_Impl__obj::fromString(HX_("/a/d",27,cb,5a,1f));
HXDLIN(  20)		HX_VARI( ::Array< ::String >,path3) = ::thx::_Path::Path_Impl__obj::fromString(HX_("/x/y/z",3e,93,48,02));
HXDLIN(  20)		HX_VARI( ::Array< ::String >,path4) = ::thx::_Path::Path_Impl__obj::fromString(HX_("a/b/c",48,d2,39,f9));
HXDLIN(  20)		HX_VARI( ::Array< ::String >,path5) = ::thx::_Path::Path_Impl__obj::fromString(HX_("x/y/z",cd,9d,82,37));
HXLINE(  25)		::Array< ::String > _hx_tmp = ::thx::_Path::Path_Impl__obj::pathTo(path1,path2);
HXDLIN(  25)		::String _hx_tmp1 = ::thx::_Path::Path_Impl__obj::toString(_hx_tmp);
HXDLIN(  25)		::utest::Assert_obj::equals(HX_("../../d",04,15,a6,0b),_hx_tmp1,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),25,HX_("thx.TestPath",61,74,98,56),HX_("testPathTo",72,e8,c6,07)));
HXLINE(  26)		::Array< ::String > _hx_tmp2 = ::thx::_Path::Path_Impl__obj::pathTo(path1,path3);
HXDLIN(  26)		::String _hx_tmp3 = ::thx::_Path::Path_Impl__obj::toString(_hx_tmp2);
HXDLIN(  26)		::utest::Assert_obj::equals(HX_("../../../x/y/z",de,2a,c0,c7),_hx_tmp3,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),26,HX_("thx.TestPath",61,74,98,56),HX_("testPathTo",72,e8,c6,07)));
HXLINE(  27)		::Array< ::String > _hx_tmp4 = ::thx::_Path::Path_Impl__obj::pathTo(path2,path1);
HXDLIN(  27)		::String _hx_tmp5 = ::thx::_Path::Path_Impl__obj::toString(_hx_tmp4);
HXDLIN(  27)		::utest::Assert_obj::equals(HX_("../b/c",a7,d5,34,00),_hx_tmp5,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),27,HX_("thx.TestPath",61,74,98,56),HX_("testPathTo",72,e8,c6,07)));
HXLINE(  29)		::Array< ::String > _hx_tmp6 = ::thx::_Path::Path_Impl__obj::pathTo(path1,path4);
HXDLIN(  29)		::String _hx_tmp7 = ::thx::_Path::Path_Impl__obj::toString(_hx_tmp6);
HXDLIN(  29)		::utest::Assert_obj::equals(HX_("/a/b/c/a/b/c",32,a0,91,4d),_hx_tmp7,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),29,HX_("thx.TestPath",61,74,98,56),HX_("testPathTo",72,e8,c6,07)));
HXLINE(  30)		::Array< ::String > _hx_tmp8 = ::thx::_Path::Path_Impl__obj::pathTo(path5,path2);
HXDLIN(  30)		::String _hx_tmp9 = ::thx::_Path::Path_Impl__obj::toString(_hx_tmp8);
HXDLIN(  30)		::utest::Assert_obj::equals(HX_("/a/d",27,cb,5a,1f),_hx_tmp9,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),30,HX_("thx.TestPath",61,74,98,56),HX_("testPathTo",72,e8,c6,07)));
HXLINE(  31)		::Array< ::String > _hx_tmp10 = ::thx::_Path::Path_Impl__obj::pathTo(path4,path5);
HXDLIN(  31)		::String _hx_tmp11 = ::thx::_Path::Path_Impl__obj::toString(_hx_tmp10);
HXDLIN(  31)		::utest::Assert_obj::equals(HX_("a/b/c/x/y/z",86,4b,b5,79),_hx_tmp11,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),31,HX_("thx.TestPath",61,74,98,56),HX_("testPathTo",72,e8,c6,07)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestPath_obj,testPathTo,(void))

void TestPath_obj::testUp(){
            	HX_STACK_FRAME("thx.TestPath","testUp",0x0250ebba,"thx.TestPath.testUp","thx/TestPath.hx",34,0x07286e9c)
            	HX_STACK_THIS(this)
HXLINE(  35)		::Array< ::String > _hx_tmp = ::thx::_Path::Path_Impl__obj::up(::thx::_Path::Path_Impl__obj::fromString(HX_("/a/b/c/",56,fa,ce,bb)),null());
HXDLIN(  35)		::String _hx_tmp1 = ::thx::_Path::Path_Impl__obj::toString(_hx_tmp);
HXDLIN(  35)		::utest::Assert_obj::equals(HX_("/a/b",25,cb,5a,1f),_hx_tmp1,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),35,HX_("thx.TestPath",61,74,98,56),HX_("testUp",4d,4b,3a,d5)));
HXLINE(  36)		::Array< ::String > _hx_tmp2 = ::thx::_Path::Path_Impl__obj::up(::thx::_Path::Path_Impl__obj::fromString(HX_("/a",52,29,00,00)),(int)2);
HXDLIN(  36)		::String _hx_tmp3 = ::thx::_Path::Path_Impl__obj::toString(_hx_tmp2);
HXDLIN(  36)		::utest::Assert_obj::equals(HX_("/",2f,00,00,00),_hx_tmp3,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),36,HX_("thx.TestPath",61,74,98,56),HX_("testUp",4d,4b,3a,d5)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestPath_obj,testUp,(void))

void TestPath_obj::testDir(){
            	HX_STACK_FRAME("thx.TestPath","testDir",0x04706b0e,"thx.TestPath.testDir","thx/TestPath.hx",39,0x07286e9c)
            	HX_STACK_THIS(this)
HXLINE(  40)		::String _hx_tmp = ::thx::_Path::Path_Impl__obj::dir(::thx::_Path::Path_Impl__obj::fromString(HX_("/a/b/c",b9,c7,ff,c3)));
HXDLIN(  40)		::utest::Assert_obj::equals(HX_("/a/b",25,cb,5a,1f),_hx_tmp,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),40,HX_("thx.TestPath",61,74,98,56),HX_("testDir",1b,ac,ba,bd)));
HXLINE(  41)		::String _hx_tmp1 = ::thx::_Path::Path_Impl__obj::dir(::thx::_Path::Path_Impl__obj::fromString(HX_("a/b/c",48,d2,39,f9)));
HXDLIN(  41)		::utest::Assert_obj::equals(HX_("a/b",f4,c3,49,00),_hx_tmp1,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),41,HX_("thx.TestPath",61,74,98,56),HX_("testDir",1b,ac,ba,bd)));
HXLINE(  42)		::String _hx_tmp2 = ::thx::_Path::Path_Impl__obj::dir(::thx::_Path::Path_Impl__obj::fromString(HX_("a",61,00,00,00)));
HXDLIN(  42)		::utest::Assert_obj::equals(HX_(".",2e,00,00,00),_hx_tmp2,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),42,HX_("thx.TestPath",61,74,98,56),HX_("testDir",1b,ac,ba,bd)));
HXLINE(  43)		::String _hx_tmp3 = ::thx::_Path::Path_Impl__obj::dir(::thx::_Path::Path_Impl__obj::fromString(HX_("..",40,28,00,00)));
HXDLIN(  43)		::utest::Assert_obj::equals(HX_(".",2e,00,00,00),_hx_tmp3,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),43,HX_("thx.TestPath",61,74,98,56),HX_("testDir",1b,ac,ba,bd)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestPath_obj,testDir,(void))

void TestPath_obj::testBase(){
            	HX_STACK_FRAME("thx.TestPath","testBase",0xdc94c330,"thx.TestPath.testBase","thx/TestPath.hx",46,0x07286e9c)
            	HX_STACK_THIS(this)
HXLINE(  47)		HX_VARI( ::Array< ::String >,path) = ::thx::_Path::Path_Impl__obj::fromString(HX_("/a/b.c",da,c6,ff,c3));
HXLINE(  48)		::String _hx_tmp = ::thx::_Path::Path_Impl__obj::base(path,null());
HXDLIN(  48)		::utest::Assert_obj::equals(HX_("b.c",57,85,4a,00),_hx_tmp,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),48,HX_("thx.TestPath",61,74,98,56),HX_("testBase",83,6d,43,44)));
HXLINE(  49)		::String _hx_tmp1 = ::thx::_Path::Path_Impl__obj::base(path,HX_(".c",75,28,00,00));
HXDLIN(  49)		::utest::Assert_obj::equals(HX_("b",62,00,00,00),_hx_tmp1,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),49,HX_("thx.TestPath",61,74,98,56),HX_("testBase",83,6d,43,44)));
HXLINE(  50)		::String _hx_tmp2 = ::thx::_Path::Path_Impl__obj::base(path,HX_("c",63,00,00,00));
HXDLIN(  50)		::utest::Assert_obj::equals(HX_("b.",8c,55,00,00),_hx_tmp2,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),50,HX_("thx.TestPath",61,74,98,56),HX_("testBase",83,6d,43,44)));
HXLINE(  51)		::String _hx_tmp3 = ::thx::_Path::Path_Impl__obj::base(path,HX_(".d",76,28,00,00));
HXDLIN(  51)		::utest::Assert_obj::equals(HX_("b.c",57,85,4a,00),_hx_tmp3,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),51,HX_("thx.TestPath",61,74,98,56),HX_("testBase",83,6d,43,44)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestPath_obj,testBase,(void))

void TestPath_obj::testExt(){
            	HX_STACK_FRAME("thx.TestPath","testExt",0x04713a62,"thx.TestPath.testExt","thx/TestPath.hx",54,0x07286e9c)
            	HX_STACK_THIS(this)
HXLINE(  55)		::thx::_Path::Path_Impl__obj::fromString(HX_("",00,00,00,00));
HXLINE(  56)		::String _hx_tmp = ::thx::_Path::Path_Impl__obj::ext(::thx::_Path::Path_Impl__obj::fromString(HX_("/a/b.c",da,c6,ff,c3)));
HXDLIN(  56)		::utest::Assert_obj::equals(HX_("c",63,00,00,00),_hx_tmp,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),56,HX_("thx.TestPath",61,74,98,56),HX_("testExt",6f,7b,bb,bd)));
HXLINE(  57)		::String _hx_tmp1 = ::thx::_Path::Path_Impl__obj::ext(::thx::_Path::Path_Impl__obj::fromString(HX_("/a/b/c",b9,c7,ff,c3)));
HXDLIN(  57)		::utest::Assert_obj::equals(HX_("",00,00,00,00),_hx_tmp1,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),57,HX_("thx.TestPath",61,74,98,56),HX_("testExt",6f,7b,bb,bd)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestPath_obj,testExt,(void))

void TestPath_obj::testSep(){
            	HX_STACK_FRAME("thx.TestPath","testSep",0x047bc95f,"thx.TestPath.testSep","thx/TestPath.hx",60,0x07286e9c)
            	HX_STACK_THIS(this)
HXLINE(  61)		HX_VARI( ::Array< ::String >,path) = ::thx::_Path::Path_Impl__obj::fromString(HX_("/path/to/file.png",90,bb,9b,0e));
HXDLIN(  61)		HX_VARI( ::Array< ::String >,win) = ::thx::_Path::Path_Impl__obj::toWin32(path,HX_("C:",97,3a,00,00));
HXLINE(  63)		::utest::Assert_obj::equals(HX_("/",2f,00,00,00),path->__get((int)0),null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),63,HX_("thx.TestPath",61,74,98,56),HX_("testSep",6c,0a,c6,bd)));
HXLINE(  64)		::utest::Assert_obj::equals(HX_("\\",5c,00,00,00),win->__get((int)0),null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),64,HX_("thx.TestPath",61,74,98,56),HX_("testSep",6c,0a,c6,bd)));
HXLINE(  65)		::utest::Assert_obj::isTrue((path->__get((int)0) == HX_("/",2f,00,00,00)),null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),65,HX_("thx.TestPath",61,74,98,56),HX_("testSep",6c,0a,c6,bd)));
HXLINE(  66)		::utest::Assert_obj::isFalse((path->__get((int)0) == HX_("\\",5c,00,00,00)),null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),66,HX_("thx.TestPath",61,74,98,56),HX_("testSep",6c,0a,c6,bd)));
HXLINE(  67)		::utest::Assert_obj::isTrue((win->__get((int)0) == HX_("\\",5c,00,00,00)),null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),67,HX_("thx.TestPath",61,74,98,56),HX_("testSep",6c,0a,c6,bd)));
HXLINE(  68)		::utest::Assert_obj::isFalse((win->__get((int)0) == HX_("/",2f,00,00,00)),null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),68,HX_("thx.TestPath",61,74,98,56),HX_("testSep",6c,0a,c6,bd)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestPath_obj,testSep,(void))

void TestPath_obj::testJoin(){
            	HX_STACK_FRAME("thx.TestPath","testJoin",0xe1e90f09,"thx.TestPath.testJoin","thx/TestPath.hx",71,0x07286e9c)
            	HX_STACK_THIS(this)
HXLINE(  72)		::Array< ::String > _hx_tmp = ::thx::_Path::Path_Impl__obj::fromString(HX_("/a/x",3b,cb,5a,1f));
HXDLIN(  72)		::Array< ::String > _hx_tmp1 = ::thx::_Path::Path_Impl__obj::join(_hx_tmp,::thx::_Path::Path_Impl__obj::fromString(HX_("../b/c",a7,d5,34,00)));
HXDLIN(  72)		::String _hx_tmp2 = ::thx::_Path::Path_Impl__obj::toString(_hx_tmp1);
HXDLIN(  72)		::utest::Assert_obj::equals(HX_("/a/b/c",b9,c7,ff,c3),_hx_tmp2,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),72,HX_("thx.TestPath",61,74,98,56),HX_("testJoin",5c,b9,97,49)));
HXLINE(  73)		::Array< ::String > _hx_tmp3 = ::thx::_Path::Path_Impl__obj::fromString(HX_("../x",a9,e1,8a,1e));
HXDLIN(  73)		::Array< ::String > _hx_tmp4 = ::thx::_Path::Path_Impl__obj::join(_hx_tmp3,::thx::_Path::Path_Impl__obj::fromString(HX_("../b/c",a7,d5,34,00)));
HXDLIN(  73)		::String _hx_tmp5 = ::thx::_Path::Path_Impl__obj::toString(_hx_tmp4);
HXDLIN(  73)		::utest::Assert_obj::equals(HX_("../b/c",a7,d5,34,00),_hx_tmp5,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),73,HX_("thx.TestPath",61,74,98,56),HX_("testJoin",5c,b9,97,49)));
HXLINE(  74)		::Array< ::String > _hx_tmp6 = ::thx::_Path::Path_Impl__obj::fromString(HX_("/a/x",3b,cb,5a,1f));
HXDLIN(  74)		::Array< ::String > _hx_tmp7 = ::thx::_Path::Path_Impl__obj::join(_hx_tmp6,::thx::_Path::Path_Impl__obj::fromString(HX_("/b/c",67,8d,5b,1f)));
HXDLIN(  74)		::String _hx_tmp8 = ::thx::_Path::Path_Impl__obj::toString(_hx_tmp7);
HXDLIN(  74)		::utest::Assert_obj::equals(HX_("/b/c",67,8d,5b,1f),_hx_tmp8,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),74,HX_("thx.TestPath",61,74,98,56),HX_("testJoin",5c,b9,97,49)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestPath_obj,testJoin,(void))

void TestPath_obj::testJoinString(){
            	HX_STACK_FRAME("thx.TestPath","testJoinString",0x34a418ba,"thx.TestPath.testJoinString","thx/TestPath.hx",77,0x07286e9c)
            	HX_STACK_THIS(this)
HXLINE(  78)		::Array< ::String > _hx_tmp = ::thx::_Path::Path_Impl__obj::fromString(HX_("/a/b",25,cb,5a,1f));
HXDLIN(  78)		::Array< ::String > _hx_tmp1 = ::thx::_Path::Path_Impl__obj::join(_hx_tmp,::thx::_Path::Path_Impl__obj::fromString(HX_("c",63,00,00,00)));
HXDLIN(  78)		::String _hx_tmp2 = ::thx::_Path::Path_Impl__obj::toString(_hx_tmp1);
HXDLIN(  78)		::utest::Assert_obj::equals(HX_("/a/b/c",b9,c7,ff,c3),_hx_tmp2,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),78,HX_("thx.TestPath",61,74,98,56),HX_("testJoinString",4d,c3,23,4f)));
HXLINE(  79)		::Array< ::String > _hx_tmp3 = ::thx::_Path::Path_Impl__obj::fromString(HX_("../x",a9,e1,8a,1e));
HXDLIN(  79)		::Array< ::String > _hx_tmp4 = ::thx::_Path::Path_Impl__obj::join(_hx_tmp3,::thx::_Path::Path_Impl__obj::fromString(HX_("../d",95,e1,8a,1e)));
HXDLIN(  79)		::String _hx_tmp5 = ::thx::_Path::Path_Impl__obj::toString(_hx_tmp4);
HXDLIN(  79)		::utest::Assert_obj::equals(HX_("../d",95,e1,8a,1e),_hx_tmp5,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),79,HX_("thx.TestPath",61,74,98,56),HX_("testJoinString",4d,c3,23,4f)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestPath_obj,testJoinString,(void))

void TestPath_obj::testToWin32ToNix(){
            	HX_STACK_FRAME("thx.TestPath","testToWin32ToNix",0x71a23ee1,"thx.TestPath.testToWin32ToNix","thx/TestPath.hx",82,0x07286e9c)
            	HX_STACK_THIS(this)
HXLINE(  83)		HX_VARI( ::Array< ::String >,path) = ::thx::_Path::Path_Impl__obj::fromString(HX_("/path/to/file.png",90,bb,9b,0e));
HXDLIN(  83)		HX_VARI( ::Array< ::String >,win) = ::thx::_Path::Path_Impl__obj::toWin32(path,null());
HXLINE(  85)		::String _hx_tmp = ::thx::_Path::Path_Impl__obj::toString(win);
HXDLIN(  85)		::utest::Assert_obj::equals(HX_("C:\\path\\to\\file.png",66,cb,9d,33),_hx_tmp,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),85,HX_("thx.TestPath",61,74,98,56),HX_("testToWin32ToNix",34,f4,4f,eb)));
HXLINE(  86)		::Array< ::String > _hx_tmp1 = ::thx::_Path::Path_Impl__obj::toNix(win);
HXDLIN(  86)		::String _hx_tmp2 = ::thx::_Path::Path_Impl__obj::toString(_hx_tmp1);
HXDLIN(  86)		::utest::Assert_obj::equals(HX_("/path/to/file.png",90,bb,9b,0e),_hx_tmp2,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),86,HX_("thx.TestPath",61,74,98,56),HX_("testToWin32ToNix",34,f4,4f,eb)));
HXLINE(  88)		path = ::thx::_Path::Path_Impl__obj::fromString(HX_("path/to/file.png",61,2d,d8,03));
HXLINE(  89)		win = ::thx::_Path::Path_Impl__obj::toWin32(path,null());
HXLINE(  90)		::String _hx_tmp3 = ::thx::_Path::Path_Impl__obj::toString(win);
HXDLIN(  90)		::utest::Assert_obj::equals(HX_("path\\to\\file.png",81,e7,ed,a6),_hx_tmp3,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),90,HX_("thx.TestPath",61,74,98,56),HX_("testToWin32ToNix",34,f4,4f,eb)));
HXLINE(  91)		::Array< ::String > _hx_tmp4 = ::thx::_Path::Path_Impl__obj::toNix(win);
HXDLIN(  91)		::String _hx_tmp5 = ::thx::_Path::Path_Impl__obj::toString(_hx_tmp4);
HXDLIN(  91)		::utest::Assert_obj::equals(HX_("path/to/file.png",61,2d,d8,03),_hx_tmp5,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),91,HX_("thx.TestPath",61,74,98,56),HX_("testToWin32ToNix",34,f4,4f,eb)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestPath_obj,testToWin32ToNix,(void))

void TestPath_obj::testNormalization(){
            	HX_STACK_FRAME("thx.TestPath","testNormalization",0x229846de,"thx.TestPath.testNormalization","thx/TestPath.hx",94,0x07286e9c)
            	HX_STACK_THIS(this)
HXLINE(  95)		::String _hx_tmp = ::thx::_Path::Path_Impl__obj::toString(::thx::_Path::Path_Impl__obj::fromString(HX_("a/.././b/../c/.",82,ad,a5,02)));
HXDLIN(  95)		::utest::Assert_obj::equals(HX_("c",63,00,00,00),_hx_tmp,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),95,HX_("thx.TestPath",61,74,98,56),HX_("testNormalization",2b,3a,e9,20)));
HXLINE(  96)		::String _hx_tmp1 = ::thx::_Path::Path_Impl__obj::toString(::thx::_Path::Path_Impl__obj::fromString(HX_("a/./b/../c/.",6f,20,08,62)));
HXDLIN(  96)		::utest::Assert_obj::equals(HX_("a/c",f5,c3,49,00),_hx_tmp1,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),96,HX_("thx.TestPath",61,74,98,56),HX_("testNormalization",2b,3a,e9,20)));
HXLINE(  97)		::String _hx_tmp2 = ::thx::_Path::Path_Impl__obj::toString(::thx::_Path::Path_Impl__obj::fromString(HX_("/a/.././b/./c/.",21,2c,ab,eb)));
HXDLIN(  97)		::utest::Assert_obj::equals(HX_("/b/c",67,8d,5b,1f),_hx_tmp2,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),97,HX_("thx.TestPath",61,74,98,56),HX_("testNormalization",2b,3a,e9,20)));
HXLINE(  98)		::String _hx_tmp3 = ::thx::_Path::Path_Impl__obj::toString(::thx::_Path::Path_Impl__obj::fromString(HX_("a/../../../b/../c/.",21,d0,78,84)));
HXDLIN(  98)		::utest::Assert_obj::equals(HX_("../../c",03,15,a6,0b),_hx_tmp3,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),98,HX_("thx.TestPath",61,74,98,56),HX_("testNormalization",2b,3a,e9,20)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestPath_obj,testNormalization,(void))

void TestPath_obj::testToString(){
            	HX_STACK_FRAME("thx.TestPath","testToString",0xebe8274b,"thx.TestPath.testToString","thx/TestPath.hx",101,0x07286e9c)
            	HX_STACK_THIS(this)
HXLINE( 102)		::String _hx_tmp = ::thx::_Path::Path_Impl__obj::toString(::thx::_Path::Path_Impl__obj::fromString(HX_(".",2e,00,00,00)));
HXDLIN( 102)		::utest::Assert_obj::equals(HX_(".",2e,00,00,00),_hx_tmp,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),102,HX_("thx.TestPath",61,74,98,56),HX_("testToString",1e,f7,75,ab)));
HXLINE( 103)		::String _hx_tmp1 = ::thx::_Path::Path_Impl__obj::toString(::thx::_Path::Path_Impl__obj::fromString(HX_("..",40,28,00,00)));
HXDLIN( 103)		::utest::Assert_obj::equals(HX_("..",40,28,00,00),_hx_tmp1,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),103,HX_("thx.TestPath",61,74,98,56),HX_("testToString",1e,f7,75,ab)));
HXLINE( 104)		::String _hx_tmp2 = ::thx::_Path::Path_Impl__obj::toString(::thx::_Path::Path_Impl__obj::fromString(HX_("../",ef,0f,23,00)));
HXDLIN( 104)		::utest::Assert_obj::equals(HX_("..",40,28,00,00),_hx_tmp2,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),104,HX_("thx.TestPath",61,74,98,56),HX_("testToString",1e,f7,75,ab)));
HXLINE( 105)		::String _hx_tmp3 = ::thx::_Path::Path_Impl__obj::toString(::thx::_Path::Path_Impl__obj::fromString(HX_("/../",20,17,34,1f)));
HXDLIN( 105)		::utest::Assert_obj::equals(HX_("/",2f,00,00,00),_hx_tmp3,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),105,HX_("thx.TestPath",61,74,98,56),HX_("testToString",1e,f7,75,ab)));
HXLINE( 106)		::String _hx_tmp4 = ::thx::_Path::Path_Impl__obj::toString(::thx::_Path::Path_Impl__obj::fromString(HX_("/",2f,00,00,00)));
HXDLIN( 106)		::utest::Assert_obj::equals(HX_("/",2f,00,00,00),_hx_tmp4,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),106,HX_("thx.TestPath",61,74,98,56),HX_("testToString",1e,f7,75,ab)));
HXLINE( 107)		::String _hx_tmp5 = ::thx::_Path::Path_Impl__obj::toString(::thx::_Path::Path_Impl__obj::fromString(HX_("/a///a",c4,14,d9,c3)));
HXDLIN( 107)		::utest::Assert_obj::equals(HX_("/a/a",24,cb,5a,1f),_hx_tmp5,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),107,HX_("thx.TestPath",61,74,98,56),HX_("testToString",1e,f7,75,ab)));
HXLINE( 108)		::String _hx_tmp6 = ::thx::_Path::Path_Impl__obj::toString(::thx::_Path::Path_Impl__obj::fromString(HX_("/a/a/",8b,f4,16,50)));
HXDLIN( 108)		::utest::Assert_obj::equals(HX_("/a/a",24,cb,5a,1f),_hx_tmp6,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),108,HX_("thx.TestPath",61,74,98,56),HX_("testToString",1e,f7,75,ab)));
HXLINE( 109)		::String _hx_tmp7 = ::thx::_Path::Path_Impl__obj::toString(::thx::_Path::Path_Impl__obj::fromString(HX_("a/..",6e,84,41,40)));
HXDLIN( 109)		::utest::Assert_obj::equals(HX_(".",2e,00,00,00),_hx_tmp7,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),109,HX_("thx.TestPath",61,74,98,56),HX_("testToString",1e,f7,75,ab)));
HXLINE( 110)		::String _hx_tmp8 = ::thx::_Path::Path_Impl__obj::toString(::thx::_Path::Path_Impl__obj::fromString(HX_("a",61,00,00,00)));
HXDLIN( 110)		::utest::Assert_obj::equals(HX_("a",61,00,00,00),_hx_tmp8,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),110,HX_("thx.TestPath",61,74,98,56),HX_("testToString",1e,f7,75,ab)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestPath_obj,testToString,(void))

void TestPath_obj::testNormalize(){
            	HX_STACK_FRAME("thx.TestPath","testNormalize",0x0253ac0e,"thx.TestPath.testNormalize","thx/TestPath.hx",113,0x07286e9c)
            	HX_STACK_THIS(this)
HXLINE( 114)		HX_VARI( ::Array< ::String >,p) = ::Array_obj< ::String >::__new(3)->init(0,HX_("/",2f,00,00,00))->init(1,HX_("/",2f,00,00,00))->init(2,HX_("a/*>b",20,61,0f,f9));
HXLINE( 115)		Bool _hx_tmp = ::thx::_Path::Path_Impl__obj::isValid(p);
HXDLIN( 115)		::utest::Assert_obj::isFalse(_hx_tmp,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),115,HX_("thx.TestPath",61,74,98,56),HX_("testNormalize",db,b4,db,de)));
HXLINE( 116)		p = ::thx::_Path::Path_Impl__obj::normalize(p);
HXLINE( 117)		Bool _hx_tmp1 = ::thx::_Path::Path_Impl__obj::isValid(p);
HXDLIN( 117)		::utest::Assert_obj::isTrue(_hx_tmp1,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),117,HX_("thx.TestPath",61,74,98,56),HX_("testNormalize",db,b4,db,de)));
HXLINE( 118)		::String _hx_tmp2 = ::thx::_Path::Path_Impl__obj::toString(p);
HXDLIN( 118)		::utest::Assert_obj::equals(HX_("/a_*>b",61,94,8f,e3),_hx_tmp2,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),118,HX_("thx.TestPath",61,74,98,56),HX_("testNormalize",db,b4,db,de)));
HXLINE( 119)		p = ::thx::_Path::Path_Impl__obj::toWin32(p,null());
HXLINE( 120)		Bool _hx_tmp3 = ::thx::_Path::Path_Impl__obj::isValid(p);
HXDLIN( 120)		::utest::Assert_obj::isFalse(_hx_tmp3,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),120,HX_("thx.TestPath",61,74,98,56),HX_("testNormalize",db,b4,db,de)));
HXLINE( 121)		p = ::thx::_Path::Path_Impl__obj::normalize(p);
HXLINE( 122)		Bool _hx_tmp4 = ::thx::_Path::Path_Impl__obj::isValid(p);
HXDLIN( 122)		::utest::Assert_obj::isTrue(_hx_tmp4,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),122,HX_("thx.TestPath",61,74,98,56),HX_("testNormalize",db,b4,db,de)));
HXLINE( 123)		::String _hx_tmp5 = ::thx::_Path::Path_Impl__obj::toString(p);
HXDLIN( 123)		::utest::Assert_obj::equals(HX_("C:\\a___b",1f,eb,d7,45),_hx_tmp5,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),123,HX_("thx.TestPath",61,74,98,56),HX_("testNormalize",db,b4,db,de)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestPath_obj,testNormalize,(void))

void TestPath_obj::testRoot(){
            	HX_STACK_FRAME("thx.TestPath","testRoot",0xe732c941,"thx.TestPath.testRoot","thx/TestPath.hx",126,0x07286e9c)
            	HX_STACK_THIS(this)
HXLINE( 127)		HX_VARI( ::Array< ::String >,root) = ::thx::_Path::Path_Impl__obj::fromString(HX_("C:\\",e5,09,33,00));
HXLINE( 128)		::utest::Assert_obj::isFalse((root->__get((int)0) == HX_("/",2f,00,00,00)),null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),128,HX_("thx.TestPath",61,74,98,56),HX_("testRoot",94,73,e1,4e)));
HXLINE( 129)		::utest::Assert_obj::isTrue((root->__get((int)0) == HX_("\\",5c,00,00,00)),null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),129,HX_("thx.TestPath",61,74,98,56),HX_("testRoot",94,73,e1,4e)));
HXLINE( 130)		::utest::Assert_obj::isTrue((root->__get((int)1) != HX_("",00,00,00,00)),null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),130,HX_("thx.TestPath",61,74,98,56),HX_("testRoot",94,73,e1,4e)));
HXLINE( 131)		::utest::Assert_obj::isFalse((root->__get((int)1) == HX_("",00,00,00,00)),null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),131,HX_("thx.TestPath",61,74,98,56),HX_("testRoot",94,73,e1,4e)));
HXLINE( 132)		Bool _hx_tmp = ::thx::_Path::Path_Impl__obj::isRoot(root);
HXDLIN( 132)		::utest::Assert_obj::isTrue(_hx_tmp,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),132,HX_("thx.TestPath",61,74,98,56),HX_("testRoot",94,73,e1,4e)));
HXLINE( 133)		::String _hx_tmp1 = ::thx::_Path::Path_Impl__obj::toString(root);
HXDLIN( 133)		::utest::Assert_obj::equals(HX_("C:\\",e5,09,33,00),_hx_tmp1,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),133,HX_("thx.TestPath",61,74,98,56),HX_("testRoot",94,73,e1,4e)));
HXLINE( 134)		HX_VARI( ::Array< ::String >,path) = root->slice((int)2,null());
HXDLIN( 134)		::String _hx_tmp2 = root->__get((int)0);
HXDLIN( 134)		::Array< ::String > _hx_tmp3 = ::thx::_Path::Path_Impl__obj::resolve(path,false);
HXDLIN( 134)		HX_VARI( ::Array< ::String >,parts) = ::Array_obj< ::String >::__new(2)->init(0,_hx_tmp2)->init(1,HX_("",00,00,00,00))->concat(_hx_tmp3);
HXDLIN( 134)		::String _hx_tmp4 = ::thx::_Path::Path_Impl__obj::toString(parts);
HXDLIN( 134)		::utest::Assert_obj::equals(HX_(".",2e,00,00,00),_hx_tmp4,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),134,HX_("thx.TestPath",61,74,98,56),HX_("testRoot",94,73,e1,4e)));
HXLINE( 136)		root = ::thx::_Path::Path_Impl__obj::fromString(HX_("/",2f,00,00,00));
HXLINE( 137)		::utest::Assert_obj::isTrue((root->__get((int)0) == HX_("/",2f,00,00,00)),null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),137,HX_("thx.TestPath",61,74,98,56),HX_("testRoot",94,73,e1,4e)));
HXLINE( 138)		::utest::Assert_obj::isFalse((root->__get((int)0) == HX_("\\",5c,00,00,00)),null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),138,HX_("thx.TestPath",61,74,98,56),HX_("testRoot",94,73,e1,4e)));
HXLINE( 139)		::utest::Assert_obj::isTrue((root->__get((int)1) != HX_("",00,00,00,00)),null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),139,HX_("thx.TestPath",61,74,98,56),HX_("testRoot",94,73,e1,4e)));
HXLINE( 140)		::utest::Assert_obj::isFalse((root->__get((int)1) == HX_("",00,00,00,00)),null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),140,HX_("thx.TestPath",61,74,98,56),HX_("testRoot",94,73,e1,4e)));
HXLINE( 141)		Bool _hx_tmp5 = ::thx::_Path::Path_Impl__obj::isRoot(root);
HXDLIN( 141)		::utest::Assert_obj::isTrue(_hx_tmp5,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),141,HX_("thx.TestPath",61,74,98,56),HX_("testRoot",94,73,e1,4e)));
HXLINE( 142)		::String _hx_tmp6 = ::thx::_Path::Path_Impl__obj::toString(root);
HXDLIN( 142)		::utest::Assert_obj::equals(HX_("/",2f,00,00,00),_hx_tmp6,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),142,HX_("thx.TestPath",61,74,98,56),HX_("testRoot",94,73,e1,4e)));
HXLINE( 143)		HX_VARI_NAME( ::Array< ::String >,path1,"path") = root->slice((int)2,null());
HXDLIN( 143)		::String _hx_tmp7 = root->__get((int)0);
HXDLIN( 143)		::Array< ::String > _hx_tmp8 = ::thx::_Path::Path_Impl__obj::resolve(path1,false);
HXDLIN( 143)		HX_VARI_NAME( ::Array< ::String >,parts1,"parts") = ::Array_obj< ::String >::__new(2)->init(0,_hx_tmp7)->init(1,HX_("",00,00,00,00))->concat(_hx_tmp8);
HXDLIN( 143)		::String _hx_tmp9 = ::thx::_Path::Path_Impl__obj::toString(parts1);
HXDLIN( 143)		::utest::Assert_obj::equals(HX_(".",2e,00,00,00),_hx_tmp9,null(),hx::SourceInfo(HX_("TestPath.hx",e7,37,5a,aa),143,HX_("thx.TestPath",61,74,98,56),HX_("testRoot",94,73,e1,4e)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestPath_obj,testRoot,(void))


TestPath_obj::TestPath_obj()
{
}

hx::Val TestPath_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 6:
		if (HX_FIELD_EQ(inName,"testUp") ) { return hx::Val( testUp_dyn()); }
		break;
	case 7:
		if (HX_FIELD_EQ(inName,"testDir") ) { return hx::Val( testDir_dyn()); }
		if (HX_FIELD_EQ(inName,"testExt") ) { return hx::Val( testExt_dyn()); }
		if (HX_FIELD_EQ(inName,"testSep") ) { return hx::Val( testSep_dyn()); }
		break;
	case 8:
		if (HX_FIELD_EQ(inName,"testBase") ) { return hx::Val( testBase_dyn()); }
		if (HX_FIELD_EQ(inName,"testJoin") ) { return hx::Val( testJoin_dyn()); }
		if (HX_FIELD_EQ(inName,"testRoot") ) { return hx::Val( testRoot_dyn()); }
		break;
	case 10:
		if (HX_FIELD_EQ(inName,"testPathTo") ) { return hx::Val( testPathTo_dyn()); }
		break;
	case 12:
		if (HX_FIELD_EQ(inName,"testToString") ) { return hx::Val( testToString_dyn()); }
		break;
	case 13:
		if (HX_FIELD_EQ(inName,"testNormalize") ) { return hx::Val( testNormalize_dyn()); }
		break;
	case 14:
		if (HX_FIELD_EQ(inName,"testJoinString") ) { return hx::Val( testJoinString_dyn()); }
		break;
	case 16:
		if (HX_FIELD_EQ(inName,"testToWin32ToNix") ) { return hx::Val( testToWin32ToNix_dyn()); }
		break;
	case 17:
		if (HX_FIELD_EQ(inName,"testNormalization") ) { return hx::Val( testNormalization_dyn()); }
		break;
	case 27:
		if (HX_FIELD_EQ(inName,"testIsRelativeAndIsAbsolute") ) { return hx::Val( testIsRelativeAndIsAbsolute_dyn()); }
	}
	return super::__Field(inName,inCallProp);
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *TestPath_obj_sMemberStorageInfo = 0;
static hx::StaticInfo *TestPath_obj_sStaticStorageInfo = 0;
#endif

static ::String TestPath_obj_sMemberFields[] = {
	HX_HCSTRING("testIsRelativeAndIsAbsolute","\x50","\xcf","\xf5","\x97"),
	HX_HCSTRING("testPathTo","\x72","\xe8","\xc6","\x07"),
	HX_HCSTRING("testUp","\x4d","\x4b","\x3a","\xd5"),
	HX_HCSTRING("testDir","\x1b","\xac","\xba","\xbd"),
	HX_HCSTRING("testBase","\x83","\x6d","\x43","\x44"),
	HX_HCSTRING("testExt","\x6f","\x7b","\xbb","\xbd"),
	HX_HCSTRING("testSep","\x6c","\x0a","\xc6","\xbd"),
	HX_HCSTRING("testJoin","\x5c","\xb9","\x97","\x49"),
	HX_HCSTRING("testJoinString","\x4d","\xc3","\x23","\x4f"),
	HX_HCSTRING("testToWin32ToNix","\x34","\xf4","\x4f","\xeb"),
	HX_HCSTRING("testNormalization","\x2b","\x3a","\xe9","\x20"),
	HX_HCSTRING("testToString","\x1e","\xf7","\x75","\xab"),
	HX_HCSTRING("testNormalize","\xdb","\xb4","\xdb","\xde"),
	HX_HCSTRING("testRoot","\x94","\x73","\xe1","\x4e"),
	::String(null()) };

static void TestPath_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(TestPath_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void TestPath_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(TestPath_obj::__mClass,"__mClass");
};

#endif

hx::Class TestPath_obj::__mClass;

void TestPath_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.TestPath","\x61","\x74","\x98","\x56");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &hx::Class_obj::GetNoStaticField;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = TestPath_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(0 /* sStaticFields */);
	__mClass->mMembers = hx::Class_obj::dupFunctions(TestPath_obj_sMemberFields);
	__mClass->mCanCast = hx::TCanCast< TestPath_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = TestPath_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = TestPath_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = TestPath_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx
