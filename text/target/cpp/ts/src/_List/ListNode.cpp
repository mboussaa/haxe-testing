// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED__List_ListNode
#include <_List/ListNode.h>
#endif

namespace _List{

void ListNode_obj::__construct( ::Dynamic item, ::_List::ListNode next){
            	HX_STACK_FRAME("_List.ListNode","new",0x20597943,"_List.ListNode.new","/usr/lib/haxe/std/List.hx",255,0xd5566cff)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(item,"item")
            	HX_STACK_ARG(next,"next")
HXLINE( 256)		this->item = item;
HXLINE( 257)		this->next = next;
            	}

Dynamic ListNode_obj::__CreateEmpty() { return new ListNode_obj; }

hx::ObjectPtr< ListNode_obj > ListNode_obj::__new( ::Dynamic item, ::_List::ListNode next)
{
	hx::ObjectPtr< ListNode_obj > _hx_result = new ListNode_obj();
	_hx_result->__construct(item,next);
	return _hx_result;
}

Dynamic ListNode_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< ListNode_obj > _hx_result = new ListNode_obj();
	_hx_result->__construct(inArgs[0],inArgs[1]);
	return _hx_result;
}


ListNode_obj::ListNode_obj()
{
}

void ListNode_obj::__Mark(HX_MARK_PARAMS)
{
	HX_MARK_BEGIN_CLASS(ListNode);
	HX_MARK_MEMBER_NAME(item,"item");
	HX_MARK_MEMBER_NAME(next,"next");
	HX_MARK_END_CLASS();
}

void ListNode_obj::__Visit(HX_VISIT_PARAMS)
{
	HX_VISIT_MEMBER_NAME(item,"item");
	HX_VISIT_MEMBER_NAME(next,"next");
}

hx::Val ListNode_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 4:
		if (HX_FIELD_EQ(inName,"item") ) { return hx::Val( item); }
		if (HX_FIELD_EQ(inName,"next") ) { return hx::Val( next); }
	}
	return super::__Field(inName,inCallProp);
}

hx::Val ListNode_obj::__SetField(const ::String &inName,const hx::Val &inValue,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 4:
		if (HX_FIELD_EQ(inName,"item") ) { item=inValue.Cast<  ::Dynamic >(); return inValue; }
		if (HX_FIELD_EQ(inName,"next") ) { next=inValue.Cast<  ::_List::ListNode >(); return inValue; }
	}
	return super::__SetField(inName,inValue,inCallProp);
}

void ListNode_obj::__GetFields(Array< ::String> &outFields)
{
	outFields->push(HX_HCSTRING("item","\x13","\xc5","\xbf","\x45"));
	outFields->push(HX_HCSTRING("next","\xf3","\x84","\x02","\x49"));
	super::__GetFields(outFields);
};

#if HXCPP_SCRIPTABLE
static hx::StorageInfo ListNode_obj_sMemberStorageInfo[] = {
	{hx::fsObject /*Dynamic*/ ,(int)offsetof(ListNode_obj,item),HX_HCSTRING("item","\x13","\xc5","\xbf","\x45")},
	{hx::fsObject /*::_List::ListNode*/ ,(int)offsetof(ListNode_obj,next),HX_HCSTRING("next","\xf3","\x84","\x02","\x49")},
	{ hx::fsUnknown, 0, null()}
};
static hx::StaticInfo *ListNode_obj_sStaticStorageInfo = 0;
#endif

static ::String ListNode_obj_sMemberFields[] = {
	HX_HCSTRING("item","\x13","\xc5","\xbf","\x45"),
	HX_HCSTRING("next","\xf3","\x84","\x02","\x49"),
	::String(null()) };

static void ListNode_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(ListNode_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void ListNode_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(ListNode_obj::__mClass,"__mClass");
};

#endif

hx::Class ListNode_obj::__mClass;

void ListNode_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("_List.ListNode","\xd1","\x1b","\xb5","\xda");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &hx::Class_obj::GetNoStaticField;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = ListNode_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(0 /* sStaticFields */);
	__mClass->mMembers = hx::Class_obj::dupFunctions(ListNode_obj_sMemberFields);
	__mClass->mCanCast = hx::TCanCast< ListNode_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = ListNode_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = ListNode_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = ListNode_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace _List
