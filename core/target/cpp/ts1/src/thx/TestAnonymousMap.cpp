// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_haxe_IMap
#include <haxe/IMap.h>
#endif
#ifndef INCLUDED_haxe_ds_Option
#include <haxe/ds/Option.h>
#endif
#ifndef INCLUDED_thx_AnonymousMap
#include <thx/AnonymousMap.h>
#endif
#ifndef INCLUDED_thx_Iterators
#include <thx/Iterators.h>
#endif
#ifndef INCLUDED_thx_Options
#include <thx/Options.h>
#endif
#ifndef INCLUDED_thx_TestAnonymousMap
#include <thx/TestAnonymousMap.h>
#endif
#ifndef INCLUDED_utest_Assert
#include <utest/Assert.h>
#endif

namespace thx{

void TestAnonymousMap_obj::__construct(Int i){
            	HX_STACK_FRAME("thx.TestAnonymousMap","new",0x8e210d5d,"thx.TestAnonymousMap.new","thx/TestAnonymousMap.hx",17,0xe3033152)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(i,"i")
HXLINE(  17)		this->x = i;
            	}

Dynamic TestAnonymousMap_obj::__CreateEmpty() { return new TestAnonymousMap_obj; }

hx::ObjectPtr< TestAnonymousMap_obj > TestAnonymousMap_obj::__new(Int i)
{
	hx::ObjectPtr< TestAnonymousMap_obj > _hx_result = new TestAnonymousMap_obj();
	_hx_result->__construct(i);
	return _hx_result;
}

Dynamic TestAnonymousMap_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< TestAnonymousMap_obj > _hx_result = new TestAnonymousMap_obj();
	_hx_result->__construct(inArgs[0]);
	return _hx_result;
}

void TestAnonymousMap_obj::testFeatures(){
            	HX_STACK_FRAME("thx.TestAnonymousMap","testFeatures",0xd4224ed2,"thx.TestAnonymousMap.testFeatures","thx/TestAnonymousMap.hx",21,0xe3033152)
            	HX_STACK_THIS(this)
HXLINE(  21)		HX_VARI( Int,_g1) = (int)0;
HXDLIN(  21)		HX_VARI( Int,_g) = this->x;
HXDLIN(  21)		while((_g1 < _g)){
HXLINE(  21)			++_g1;
HXLINE(  22)			HX_VARI(  ::thx::AnonymousMap,map) =  ::thx::AnonymousMap_obj::__new( ::Dynamic(hx::Anon_obj::Create(2)
            				->setFixed(0,HX_("name",4b,72,ff,48),HX_("thx",84,60,58,00))
            				->setFixed(1,HX_("type",ba,f2,08,4d),HX_("library",fb,26,70,3f))));
HXLINE(  23)			 ::Dynamic _hx_tmp = map->get(HX_("name",4b,72,ff,48));
HXDLIN(  23)			::utest::Assert_obj::equals(HX_("thx",84,60,58,00),_hx_tmp,null(),hx::SourceInfo(HX_("TestAnonymousMap.hx",9d,bd,5f,f7),23,HX_("thx.TestAnonymousMap",eb,1a,26,aa),HX_("testFeatures",6f,93,de,85)));
HXLINE(  24)			Bool _hx_tmp1 = map->exists(HX_("type",ba,f2,08,4d));
HXDLIN(  24)			::utest::Assert_obj::isTrue(_hx_tmp1,null(),hx::SourceInfo(HX_("TestAnonymousMap.hx",9d,bd,5f,f7),24,HX_("thx.TestAnonymousMap",eb,1a,26,aa),HX_("testFeatures",6f,93,de,85)));
HXLINE(  25)			map->remove(HX_("type",ba,f2,08,4d));
HXLINE(  26)			Bool _hx_tmp2 = map->exists(HX_("type",ba,f2,08,4d));
HXDLIN(  26)			::utest::Assert_obj::isFalse(_hx_tmp2,null(),hx::SourceInfo(HX_("TestAnonymousMap.hx",9d,bd,5f,f7),26,HX_("thx.TestAnonymousMap",eb,1a,26,aa),HX_("testFeatures",6f,93,de,85)));
HXLINE(  27)			 ::Dynamic _hx_tmp3 = map->keys();
HXDLIN(  27)			::Array< ::String > _hx_tmp4 = ::thx::Iterators_obj::toArray(_hx_tmp3);
HXDLIN(  27)			::utest::Assert_obj::same(::cpp::VirtualArray_obj::__new(1)->init(0,HX_("name",4b,72,ff,48)),_hx_tmp4,null(),null(),null(),hx::SourceInfo(HX_("TestAnonymousMap.hx",9d,bd,5f,f7),27,HX_("thx.TestAnonymousMap",eb,1a,26,aa),HX_("testFeatures",6f,93,de,85)));
HXLINE(  28)			 ::Dynamic _hx_tmp5 = map->iterator();
HXDLIN(  28)			::cpp::VirtualArray _hx_tmp6 = ::thx::Iterators_obj::toArray(_hx_tmp5);
HXDLIN(  28)			::utest::Assert_obj::same(::cpp::VirtualArray_obj::__new(1)->init(0,HX_("thx",84,60,58,00)),_hx_tmp6,null(),null(),null(),hx::SourceInfo(HX_("TestAnonymousMap.hx",9d,bd,5f,f7),28,HX_("thx.TestAnonymousMap",eb,1a,26,aa),HX_("testFeatures",6f,93,de,85)));
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestAnonymousMap_obj,testFeatures,(void))

void TestAnonymousMap_obj::testGetOption(){
            	HX_STACK_FRAME("thx.TestAnonymousMap","testGetOption",0x080c1536,"thx.TestAnonymousMap.testGetOption","thx/TestAnonymousMap.hx",32,0xe3033152)
            	HX_STACK_THIS(this)
HXLINE(  32)		HX_VARI( Int,_g1) = (int)0;
HXDLIN(  32)		HX_VARI( Int,_g) = this->x;
HXDLIN(  32)		while((_g1 < _g)){
HXLINE(  32)			++_g1;
HXLINE(  33)			HX_VARI(  ::thx::AnonymousMap,map) =  ::thx::AnonymousMap_obj::__new( ::Dynamic(hx::Anon_obj::Create(1)
            				->setFixed(0,HX_("key1",b2,e1,06,47),(int)1)));
HXLINE(  35)			::hx::EnumBase _hx_tmp = map->getOption(HX_("key1",b2,e1,06,47));
HXDLIN(  35)			 ::Dynamic _hx_tmp1 = ::thx::Options_obj::get(_hx_tmp);
HXDLIN(  35)			::utest::Assert_obj::same(_hx_tmp1,(int)1,null(),null(),null(),hx::SourceInfo(HX_("TestAnonymousMap.hx",9d,bd,5f,f7),35,HX_("thx.TestAnonymousMap",eb,1a,26,aa),HX_("testGetOption",f9,d9,0b,db)));
HXLINE(  36)			::hx::EnumBase _hx_tmp2 = map->getOption(HX_("key2",b3,e1,06,47));
HXDLIN(  36)			Bool _hx_tmp3 = ::thx::Options_obj::toBool(_hx_tmp2);
HXDLIN(  36)			::utest::Assert_obj::same(_hx_tmp3,false,null(),null(),null(),hx::SourceInfo(HX_("TestAnonymousMap.hx",9d,bd,5f,f7),36,HX_("thx.TestAnonymousMap",eb,1a,26,aa),HX_("testGetOption",f9,d9,0b,db)));
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestAnonymousMap_obj,testGetOption,(void))


TestAnonymousMap_obj::TestAnonymousMap_obj()
{
}

hx::Val TestAnonymousMap_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 1:
		if (HX_FIELD_EQ(inName,"x") ) { return hx::Val( x); }
		break;
	case 12:
		if (HX_FIELD_EQ(inName,"testFeatures") ) { return hx::Val( testFeatures_dyn()); }
		break;
	case 13:
		if (HX_FIELD_EQ(inName,"testGetOption") ) { return hx::Val( testGetOption_dyn()); }
	}
	return super::__Field(inName,inCallProp);
}

hx::Val TestAnonymousMap_obj::__SetField(const ::String &inName,const hx::Val &inValue,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 1:
		if (HX_FIELD_EQ(inName,"x") ) { x=inValue.Cast< Int >(); return inValue; }
	}
	return super::__SetField(inName,inValue,inCallProp);
}

void TestAnonymousMap_obj::__GetFields(Array< ::String> &outFields)
{
	outFields->push(HX_HCSTRING("x","\x78","\x00","\x00","\x00"));
	super::__GetFields(outFields);
};

#if HXCPP_SCRIPTABLE
static hx::StorageInfo TestAnonymousMap_obj_sMemberStorageInfo[] = {
	{hx::fsInt,(int)offsetof(TestAnonymousMap_obj,x),HX_HCSTRING("x","\x78","\x00","\x00","\x00")},
	{ hx::fsUnknown, 0, null()}
};
static hx::StaticInfo *TestAnonymousMap_obj_sStaticStorageInfo = 0;
#endif

static ::String TestAnonymousMap_obj_sMemberFields[] = {
	HX_HCSTRING("x","\x78","\x00","\x00","\x00"),
	HX_HCSTRING("testFeatures","\x6f","\x93","\xde","\x85"),
	HX_HCSTRING("testGetOption","\xf9","\xd9","\x0b","\xdb"),
	::String(null()) };

static void TestAnonymousMap_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(TestAnonymousMap_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void TestAnonymousMap_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(TestAnonymousMap_obj::__mClass,"__mClass");
};

#endif

hx::Class TestAnonymousMap_obj::__mClass;

void TestAnonymousMap_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.TestAnonymousMap","\xeb","\x1a","\x26","\xaa");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &hx::Class_obj::GetNoStaticField;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = TestAnonymousMap_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(0 /* sStaticFields */);
	__mClass->mMembers = hx::Class_obj::dupFunctions(TestAnonymousMap_obj_sMemberFields);
	__mClass->mCanCast = hx::TCanCast< TestAnonymousMap_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = TestAnonymousMap_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = TestAnonymousMap_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = TestAnonymousMap_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx