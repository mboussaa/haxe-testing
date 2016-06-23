// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_thx_TestOrderedSet
#include <thx/TestOrderedSet.h>
#endif
#ifndef INCLUDED_thx__OrderedSet_OrderedSet_Impl_
#include <thx/_OrderedSet/OrderedSet_Impl_.h>
#endif
#ifndef INCLUDED_utest_Assert
#include <utest/Assert.h>
#endif

namespace thx{

void TestOrderedSet_obj::__construct(Int i){
            	HX_STACK_FRAME("thx.TestOrderedSet","new",0x5ad53e63,"thx.TestOrderedSet.new","thx/TestOrderedSet.hx",8,0xef35cd4c)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(i,"i")
HXLINE(   8)		this->x = i;
            	}

Dynamic TestOrderedSet_obj::__CreateEmpty() { return new TestOrderedSet_obj; }

hx::ObjectPtr< TestOrderedSet_obj > TestOrderedSet_obj::__new(Int i)
{
	hx::ObjectPtr< TestOrderedSet_obj > _hx_result = new TestOrderedSet_obj();
	_hx_result->__construct(i);
	return _hx_result;
}

Dynamic TestOrderedSet_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< TestOrderedSet_obj > _hx_result = new TestOrderedSet_obj();
	_hx_result->__construct(inArgs[0]);
	return _hx_result;
}

void TestOrderedSet_obj::testCreate(){
            	HX_STACK_FRAME("thx.TestOrderedSet","testCreate",0x5543554b,"thx.TestOrderedSet.testCreate","thx/TestOrderedSet.hx",12,0xef35cd4c)
            	HX_STACK_THIS(this)
HXLINE(  12)		HX_VARI( Int,_g1) = (int)0;
HXDLIN(  12)		HX_VARI( Int,_g) = this->x;
HXDLIN(  12)		while((_g1 < _g)){
HXLINE(  12)			++_g1;
HXLINE(  13)			HX_VARI( ::Array< Int >,set) = ::thx::_OrderedSet::OrderedSet_Impl__obj::create(null());
HXLINE(  14)			::utest::Assert_obj::equals((int)0,set->length,null(),hx::SourceInfo(HX_("TestOrderedSet.hx",d7,20,2e,16),14,HX_("thx.TestOrderedSet",f1,d0,5f,04),HX_("testCreate",ee,ac,03,95)));
HXLINE(  15)			::thx::_OrderedSet::OrderedSet_Impl__obj::add(set,(int)1);
HXLINE(  16)			::thx::_OrderedSet::OrderedSet_Impl__obj::add(set,(int)1);
HXLINE(  17)			::utest::Assert_obj::equals((int)1,set->length,null(),hx::SourceInfo(HX_("TestOrderedSet.hx",d7,20,2e,16),17,HX_("thx.TestOrderedSet",f1,d0,5f,04),HX_("testCreate",ee,ac,03,95)));
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestOrderedSet_obj,testCreate,(void))

void TestOrderedSet_obj::testOrderedSet(){
            	HX_STACK_FRAME("thx.TestOrderedSet","testOrderedSet",0xd7624f04,"thx.TestOrderedSet.testOrderedSet","thx/TestOrderedSet.hx",21,0xef35cd4c)
            	HX_STACK_THIS(this)
HXLINE(  21)		HX_VARI( Int,_g1) = (int)0;
HXDLIN(  21)		HX_VARI( Int,_g) = this->x;
HXDLIN(  21)		while((_g1 < _g)){
HXLINE(  21)			++_g1;
HXLINE(  22)			HX_VARI( ::Array< Int >,set) = ::thx::_OrderedSet::OrderedSet_Impl__obj::toOrderedSet(::Array_obj< Int >::__new(5)->init(0,(int)1)->init(1,(int)2)->init(2,(int)2)->init(3,(int)2)->init(4,(int)3));
HXLINE(  23)			::utest::Assert_obj::same(::cpp::VirtualArray_obj::__new(3)->init(0,(int)1)->init(1,(int)2)->init(2,(int)3),::thx::_OrderedSet::OrderedSet_Impl__obj::toArray(set),null(),null(),null(),hx::SourceInfo(HX_("TestOrderedSet.hx",d7,20,2e,16),23,HX_("thx.TestOrderedSet",f1,d0,5f,04),HX_("testOrderedSet",27,b4,ea,ad)));
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestOrderedSet_obj,testOrderedSet,(void))

void TestOrderedSet_obj::testUnion(){
            	HX_STACK_FRAME("thx.TestOrderedSet","testUnion",0xd6f1f5a0,"thx.TestOrderedSet.testUnion","thx/TestOrderedSet.hx",27,0xef35cd4c)
            	HX_STACK_THIS(this)
HXLINE(  27)		HX_VARI( Int,_g1) = (int)0;
HXDLIN(  27)		HX_VARI( Int,_g) = this->x;
HXDLIN(  27)		while((_g1 < _g)){
HXLINE(  27)			++_g1;
HXLINE(  28)			HX_VARI( ::Array< Int >,s1) = ::thx::_OrderedSet::OrderedSet_Impl__obj::toOrderedSet(::Array_obj< Int >::__new(3)->init(0,(int)1)->init(1,(int)2)->init(2,(int)3));
HXDLIN(  28)			HX_VARI( ::Array< Int >,s2) = ::thx::_OrderedSet::OrderedSet_Impl__obj::toOrderedSet(::Array_obj< Int >::__new(3)->init(0,(int)2)->init(1,(int)2)->init(2,(int)4));
HXLINE(  30)			::Array< Int > _hx_tmp = ::thx::_OrderedSet::OrderedSet_Impl__obj::toArray(s2);
HXDLIN(  30)			::Array< Int > _hx_tmp1 = s1->concat(_hx_tmp);
HXDLIN(  30)			::Array< Int > _hx_tmp2 = ::thx::_OrderedSet::OrderedSet_Impl__obj::toOrderedSet(_hx_tmp1);
HXDLIN(  30)			::utest::Assert_obj::same(::cpp::VirtualArray_obj::__new(4)->init(0,(int)1)->init(1,(int)2)->init(2,(int)3)->init(3,(int)4),::thx::_OrderedSet::OrderedSet_Impl__obj::toArray(_hx_tmp2),null(),null(),null(),hx::SourceInfo(HX_("TestOrderedSet.hx",d7,20,2e,16),30,HX_("thx.TestOrderedSet",f1,d0,5f,04),HX_("testUnion",5d,a3,e9,6f)));
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestOrderedSet_obj,testUnion,(void))

void TestOrderedSet_obj::testDifference(){
            	HX_STACK_FRAME("thx.TestOrderedSet","testDifference",0x0ffc5dcc,"thx.TestOrderedSet.testDifference","thx/TestOrderedSet.hx",34,0xef35cd4c)
            	HX_STACK_THIS(this)
HXLINE(  34)		HX_VARI( Int,_g1) = (int)0;
HXDLIN(  34)		HX_VARI( Int,_g) = this->x;
HXDLIN(  34)		while((_g1 < _g)){
HXLINE(  34)			++_g1;
HXLINE(  35)			HX_VARI( ::Array< Int >,s1) = ::thx::_OrderedSet::OrderedSet_Impl__obj::toOrderedSet(::Array_obj< Int >::__new(3)->init(0,(int)1)->init(1,(int)2)->init(2,(int)3));
HXDLIN(  35)			HX_VARI( ::Array< Int >,s2) = ::thx::_OrderedSet::OrderedSet_Impl__obj::toOrderedSet(::Array_obj< Int >::__new(3)->init(0,(int)2)->init(1,(int)2)->init(2,(int)4));
HXLINE(  37)			HX_VARI( ::Array< Int >,result) = s1->copy();
HXDLIN(  37)			{
HXLINE(  37)				HX_VARI(  ::Dynamic,tmp) = s2->iterator();
HXDLIN(  37)				while(true){
HXLINE(  37)					Bool _hx_tmp = !(( (Bool)( ::Dynamic(tmp->__Field(HX_("hasNext",6d,a5,46,18),hx::paccDynamic))()) ));
HXDLIN(  37)					if (_hx_tmp) {
HXLINE(  37)						goto _hx_goto_4;
            					}
HXDLIN(  37)					HX_VARI( Int,item) = ( (Int)( ::Dynamic(tmp->__Field(HX_("next",f3,84,02,49),hx::paccDynamic))()) );
HXDLIN(  37)					result->remove(item);
            				}
            				_hx_goto_4:;
            			}
HXDLIN(  37)			::utest::Assert_obj::same(::cpp::VirtualArray_obj::__new(2)->init(0,(int)1)->init(1,(int)3),::thx::_OrderedSet::OrderedSet_Impl__obj::toArray(result),null(),null(),null(),hx::SourceInfo(HX_("TestOrderedSet.hx",d7,20,2e,16),37,HX_("thx.TestOrderedSet",f1,d0,5f,04),HX_("testDifference",ef,c2,84,e6)));
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestOrderedSet_obj,testDifference,(void))

void TestOrderedSet_obj::testBooleans(){
            	HX_STACK_FRAME("thx.TestOrderedSet","testBooleans",0x41d5c8da,"thx.TestOrderedSet.testBooleans","thx/TestOrderedSet.hx",41,0xef35cd4c)
            	HX_STACK_THIS(this)
HXLINE(  41)		HX_VARI( Int,_g1) = (int)0;
HXDLIN(  41)		HX_VARI( Int,_g) = this->x;
HXDLIN(  41)		while((_g1 < _g)){
HXLINE(  41)			++_g1;
HXLINE(  42)			HX_VARI_NAME( ::Array< Int >,this1,"this") = ::thx::_OrderedSet::OrderedSet_Impl__obj::toOrderedSet(::Array_obj< Int >::__new(3)->init(0,(int)1)->init(1,(int)2)->init(2,(int)3));
HXDLIN(  42)			HX_VARI( ::Array< Int >,set) = ::thx::_OrderedSet::OrderedSet_Impl__obj::toOrderedSet(::Array_obj< Int >::__new(3)->init(0,(int)2)->init(1,(int)3)->init(2,(int)4));
HXDLIN(  42)			::Array< Int > _hx_tmp = ::thx::_OrderedSet::OrderedSet_Impl__obj::toArray(set);
HXDLIN(  42)			::Array< Int > _hx_tmp1 = this1->concat(_hx_tmp);
HXDLIN(  42)			HX_VARI_NAME( ::Array< Int >,this2,"this") = ::thx::_OrderedSet::OrderedSet_Impl__obj::toOrderedSet(_hx_tmp1);
HXDLIN(  42)			HX_VARI_NAME( ::Array< Int >,set1,"set") = ::thx::_OrderedSet::OrderedSet_Impl__obj::toOrderedSet(::Array_obj< Int >::__new(2)->init(0,(int)2)->init(1,(int)3));
HXDLIN(  42)			HX_VARI( ::Array< Int >,result) = this2->copy();
HXDLIN(  42)			{
HXLINE(  42)				HX_VARI(  ::Dynamic,tmp) = set1->iterator();
HXDLIN(  42)				while(true){
HXLINE(  42)					Bool _hx_tmp2 = !(( (Bool)( ::Dynamic(tmp->__Field(HX_("hasNext",6d,a5,46,18),hx::paccDynamic))()) ));
HXDLIN(  42)					if (_hx_tmp2) {
HXLINE(  42)						goto _hx_goto_6;
            					}
HXDLIN(  42)					HX_VARI( Int,item) = ( (Int)( ::Dynamic(tmp->__Field(HX_("next",f3,84,02,49),hx::paccDynamic))()) );
HXDLIN(  42)					result->remove(item);
            				}
            				_hx_goto_6:;
            			}
HXLINE(  43)			::utest::Assert_obj::same(::cpp::VirtualArray_obj::__new(2)->init(0,(int)1)->init(1,(int)4),result,null(),null(),null(),hx::SourceInfo(HX_("TestOrderedSet.hx",d7,20,2e,16),43,HX_("thx.TestOrderedSet",f1,d0,5f,04),HX_("testBooleans",3d,8f,15,34)));
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestOrderedSet_obj,testBooleans,(void))


TestOrderedSet_obj::TestOrderedSet_obj()
{
}

hx::Val TestOrderedSet_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 1:
		if (HX_FIELD_EQ(inName,"x") ) { return hx::Val( x); }
		break;
	case 9:
		if (HX_FIELD_EQ(inName,"testUnion") ) { return hx::Val( testUnion_dyn()); }
		break;
	case 10:
		if (HX_FIELD_EQ(inName,"testCreate") ) { return hx::Val( testCreate_dyn()); }
		break;
	case 12:
		if (HX_FIELD_EQ(inName,"testBooleans") ) { return hx::Val( testBooleans_dyn()); }
		break;
	case 14:
		if (HX_FIELD_EQ(inName,"testOrderedSet") ) { return hx::Val( testOrderedSet_dyn()); }
		if (HX_FIELD_EQ(inName,"testDifference") ) { return hx::Val( testDifference_dyn()); }
	}
	return super::__Field(inName,inCallProp);
}

hx::Val TestOrderedSet_obj::__SetField(const ::String &inName,const hx::Val &inValue,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 1:
		if (HX_FIELD_EQ(inName,"x") ) { x=inValue.Cast< Int >(); return inValue; }
	}
	return super::__SetField(inName,inValue,inCallProp);
}

void TestOrderedSet_obj::__GetFields(Array< ::String> &outFields)
{
	outFields->push(HX_HCSTRING("x","\x78","\x00","\x00","\x00"));
	super::__GetFields(outFields);
};

#if HXCPP_SCRIPTABLE
static hx::StorageInfo TestOrderedSet_obj_sMemberStorageInfo[] = {
	{hx::fsInt,(int)offsetof(TestOrderedSet_obj,x),HX_HCSTRING("x","\x78","\x00","\x00","\x00")},
	{ hx::fsUnknown, 0, null()}
};
static hx::StaticInfo *TestOrderedSet_obj_sStaticStorageInfo = 0;
#endif

static ::String TestOrderedSet_obj_sMemberFields[] = {
	HX_HCSTRING("x","\x78","\x00","\x00","\x00"),
	HX_HCSTRING("testCreate","\xee","\xac","\x03","\x95"),
	HX_HCSTRING("testOrderedSet","\x27","\xb4","\xea","\xad"),
	HX_HCSTRING("testUnion","\x5d","\xa3","\xe9","\x6f"),
	HX_HCSTRING("testDifference","\xef","\xc2","\x84","\xe6"),
	HX_HCSTRING("testBooleans","\x3d","\x8f","\x15","\x34"),
	::String(null()) };

static void TestOrderedSet_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(TestOrderedSet_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void TestOrderedSet_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(TestOrderedSet_obj::__mClass,"__mClass");
};

#endif

hx::Class TestOrderedSet_obj::__mClass;

void TestOrderedSet_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.TestOrderedSet","\xf1","\xd0","\x5f","\x04");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &hx::Class_obj::GetNoStaticField;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = TestOrderedSet_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(0 /* sStaticFields */);
	__mClass->mMembers = hx::Class_obj::dupFunctions(TestOrderedSet_obj_sMemberFields);
	__mClass->mCanCast = hx::TCanCast< TestOrderedSet_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = TestOrderedSet_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = TestOrderedSet_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = TestOrderedSet_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx