// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_haxe_StackItem
#include <haxe/StackItem.h>
#endif
#ifndef INCLUDED_thx_Error
#include <thx/Error.h>
#endif
#ifndef INCLUDED_thx_error_AssertError
#include <thx/error/AssertError.h>
#endif

namespace thx{
namespace error{

void AssertError_obj::__construct(::String msg, ::Dynamic pos){
            	HX_STACK_FRAME("thx.error.AssertError","new",0x025b08e4,"thx.error.AssertError.new","thx/error/AssertError.hx",9,0x025ba54e)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(msg,"msg")
            	HX_STACK_ARG(pos,"pos")
HXLINE(  10)		Bool _hx_tmp = hx::IsNull( msg );
HXDLIN(  10)		if (_hx_tmp) {
HXLINE(  11)			msg = HX_("expected true",f6,95,12,31);
            		}
HXLINE(  12)		super::__construct(msg,null(),pos);
            	}

Dynamic AssertError_obj::__CreateEmpty() { return new AssertError_obj; }

hx::ObjectPtr< AssertError_obj > AssertError_obj::__new(::String msg, ::Dynamic pos)
{
	hx::ObjectPtr< AssertError_obj > _hx_result = new AssertError_obj();
	_hx_result->__construct(msg,pos);
	return _hx_result;
}

Dynamic AssertError_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< AssertError_obj > _hx_result = new AssertError_obj();
	_hx_result->__construct(inArgs[0],inArgs[1]);
	return _hx_result;
}


AssertError_obj::AssertError_obj()
{
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *AssertError_obj_sMemberStorageInfo = 0;
static hx::StaticInfo *AssertError_obj_sStaticStorageInfo = 0;
#endif

static void AssertError_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(AssertError_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void AssertError_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(AssertError_obj::__mClass,"__mClass");
};

#endif

hx::Class AssertError_obj::__mClass;

void AssertError_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.error.AssertError","\xf2","\x06","\x2c","\x1f");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &hx::Class_obj::GetNoStaticField;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = AssertError_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(0 /* sStaticFields */);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< AssertError_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = AssertError_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = AssertError_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = AssertError_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx
} // end namespace error
