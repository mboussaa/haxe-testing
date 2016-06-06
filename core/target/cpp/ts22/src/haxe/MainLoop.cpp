// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_haxe_MainEvent
#include <haxe/MainEvent.h>
#endif
#ifndef INCLUDED_haxe_MainLoop
#include <haxe/MainLoop.h>
#endif
#ifndef INCLUDED_haxe_Timer
#include <haxe/Timer.h>
#endif

namespace haxe{

void MainLoop_obj::__construct() { }

Dynamic MainLoop_obj::__CreateEmpty() { return new MainLoop_obj; }

hx::ObjectPtr< MainLoop_obj > MainLoop_obj::__new()
{
	hx::ObjectPtr< MainLoop_obj > _hx_result = new MainLoop_obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic MainLoop_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< MainLoop_obj > _hx_result = new MainLoop_obj();
	_hx_result->__construct();
	return _hx_result;
}

 ::haxe::MainEvent MainLoop_obj::pending;

void MainLoop_obj::sortEvents(){
            	HX_STACK_FRAME("haxe.MainLoop","sortEvents",0x1a386640,"haxe.MainLoop.sortEvents","/usr/lib/haxe/std/haxe/MainLoop.hx",85,0x071890f9)
HXLINE(  89)		HX_VARI(  ::haxe::MainEvent,list) = ::haxe::MainLoop_obj::pending;
HXLINE(  91)		if (hx::IsNull( list )) {
HXLINE(  91)			return;
            		}
HXLINE(  93)		HX_VARI( Int,insize) = (int)1;
HXDLIN(  93)		HX_VAR( Int,nmerges);
HXDLIN(  93)		HX_VARI( Int,psize) = (int)0;
HXDLIN(  93)		HX_VARI( Int,qsize) = (int)0;
HXLINE(  94)		HX_VAR(  ::haxe::MainEvent,p);
HXDLIN(  94)		HX_VAR(  ::haxe::MainEvent,q);
HXDLIN(  94)		HX_VAR(  ::haxe::MainEvent,e);
HXDLIN(  94)		HX_VAR(  ::haxe::MainEvent,tail);
HXLINE(  96)		while(true){
HXLINE(  97)			p = list;
HXLINE(  98)			list = null();
HXLINE(  99)			tail = null();
HXLINE( 100)			nmerges = (int)0;
HXLINE( 101)			while(hx::IsNotNull( p )){
HXLINE( 102)				++nmerges;
HXLINE( 103)				q = p;
HXLINE( 104)				psize = (int)0;
HXLINE( 105)				{
HXLINE( 105)					HX_VARI( Int,_g1) = (int)0;
HXDLIN( 105)					HX_VARI( Int,_g) = insize;
HXDLIN( 105)					while((_g1 < _g)){
HXLINE( 105)						++_g1;
HXLINE( 106)						++psize;
HXLINE( 107)						q = q->next;
HXLINE( 108)						if (hx::IsNull( q )) {
HXLINE( 108)							goto _hx_goto_2;
            						}
            					}
            					_hx_goto_2:;
            				}
HXLINE( 110)				qsize = insize;
HXLINE( 111)				while(true){
HXLINE( 111)					Bool _hx_tmp;
HXDLIN( 111)					if ((psize <= (int)0)) {
HXLINE( 111)						if ((qsize > (int)0)) {
HXLINE( 111)							_hx_tmp = hx::IsNotNull( q );
            						}
            						else {
HXLINE( 111)							_hx_tmp = false;
            						}
            					}
            					else {
HXLINE( 111)						_hx_tmp = true;
            					}
HXDLIN( 111)					if (!(_hx_tmp)) {
HXLINE( 111)						goto _hx_goto_3;
            					}
HXLINE( 112)					Bool _hx_tmp1 = (psize == (int)0);
HXDLIN( 112)					if (_hx_tmp1) {
HXLINE( 113)						e = q;
HXLINE( 114)						q = q->next;
HXLINE( 115)						--qsize;
            					}
            					else {
HXLINE( 116)						Bool _hx_tmp2;
HXDLIN( 116)						Bool _hx_tmp3;
HXDLIN( 116)						if ((qsize != (int)0)) {
HXLINE( 116)							_hx_tmp3 = hx::IsNull( q );
            						}
            						else {
HXLINE( 116)							_hx_tmp3 = true;
            						}
HXDLIN( 116)						if (!(_hx_tmp3)) {
HXLINE( 116)							if ((p->priority <= q->priority)) {
HXLINE( 116)								if ((p->priority == q->priority)) {
HXLINE( 116)									_hx_tmp2 = (p->nextRun <= q->nextRun);
            								}
            								else {
HXLINE( 116)									_hx_tmp2 = false;
            								}
            							}
            							else {
HXLINE( 116)								_hx_tmp2 = true;
            							}
            						}
            						else {
HXLINE( 116)							_hx_tmp2 = true;
            						}
HXDLIN( 116)						if (_hx_tmp2) {
HXLINE( 117)							e = p;
HXLINE( 118)							p = p->next;
HXLINE( 119)							--psize;
            						}
            						else {
HXLINE( 121)							e = q;
HXLINE( 122)							q = q->next;
HXLINE( 123)							--qsize;
            						}
            					}
HXLINE( 125)					if (hx::IsNotNull( tail )) {
HXLINE( 126)						tail->next = e;
            					}
            					else {
HXLINE( 128)						list = e;
            					}
HXLINE( 129)					e->prev = tail;
HXLINE( 130)					tail = e;
            				}
            				_hx_goto_3:;
HXLINE( 132)				p = q;
            			}
HXLINE( 134)			tail->next = null();
HXLINE( 135)			if ((nmerges <= (int)1)) {
HXLINE( 136)				goto _hx_goto_0;
            			}
HXLINE( 137)			hx::MultEq(insize,(int)2);
            		}
            		_hx_goto_0:;
HXLINE( 139)		list->prev = null();
HXLINE( 140)		::haxe::MainLoop_obj::pending = list;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC0(MainLoop_obj,sortEvents,(void))

Float MainLoop_obj::tick(){
            	HX_STACK_FRAME("haxe.MainLoop","tick",0x9d5eafc6,"haxe.MainLoop.tick","/usr/lib/haxe/std/haxe/MainLoop.hx",146,0x071890f9)
HXLINE( 147)		::haxe::MainLoop_obj::sortEvents();
HXLINE( 148)		HX_VARI(  ::haxe::MainEvent,e) = ::haxe::MainLoop_obj::pending;
HXLINE( 149)		HX_VARI( Float,now) = ::haxe::Timer_obj::stamp();
HXLINE( 150)		HX_VARI( Float,wait) = ((Float)1e9);
HXLINE( 151)		while(hx::IsNotNull( e )){
HXLINE( 152)			HX_VARI(  ::haxe::MainEvent,next) = e->next;
HXLINE( 153)			HX_VARI( Float,wt) = (e->nextRun - now);
HXLINE( 154)			Bool _hx_tmp;
HXDLIN( 154)			if (!((e->nextRun < (int)0))) {
HXLINE( 154)				_hx_tmp = (wt <= (int)0);
            			}
            			else {
HXLINE( 154)				_hx_tmp = true;
            			}
HXDLIN( 154)			if (_hx_tmp) {
HXLINE( 155)				wait = (int)0;
HXLINE( 156)				if (hx::IsNotNull( e->f )) {
HXLINE( 156)					e->f();
            				}
            			}
            			else {
HXLINE( 157)				Bool _hx_tmp1 = (wait > wt);
HXDLIN( 157)				if (_hx_tmp1) {
HXLINE( 158)					wait = wt;
            				}
            			}
HXLINE( 159)			e = next;
            		}
HXLINE( 161)		return wait;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC0(MainLoop_obj,tick,return )


MainLoop_obj::MainLoop_obj()
{
}

bool MainLoop_obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 4:
		if (HX_FIELD_EQ(inName,"tick") ) { outValue = tick_dyn(); return true; }
		break;
	case 7:
		if (HX_FIELD_EQ(inName,"pending") ) { outValue = pending; return true; }
		break;
	case 10:
		if (HX_FIELD_EQ(inName,"sortEvents") ) { outValue = sortEvents_dyn(); return true; }
	}
	return false;
}

bool MainLoop_obj::__SetStatic(const ::String &inName,Dynamic &ioValue,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 7:
		if (HX_FIELD_EQ(inName,"pending") ) { pending=ioValue.Cast<  ::haxe::MainEvent >(); return true; }
	}
	return false;
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *MainLoop_obj_sMemberStorageInfo = 0;
static hx::StaticInfo MainLoop_obj_sStaticStorageInfo[] = {
	{hx::fsObject /*::haxe::MainEvent*/ ,(void *) &MainLoop_obj::pending,HX_HCSTRING("pending","\x57","\x98","\xec","\x2b")},
	{ hx::fsUnknown, 0, null()}
};
#endif

static void MainLoop_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(MainLoop_obj::__mClass,"__mClass");
	HX_MARK_MEMBER_NAME(MainLoop_obj::pending,"pending");
};

#ifdef HXCPP_VISIT_ALLOCS
static void MainLoop_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(MainLoop_obj::__mClass,"__mClass");
	HX_VISIT_MEMBER_NAME(MainLoop_obj::pending,"pending");
};

#endif

hx::Class MainLoop_obj::__mClass;

static ::String MainLoop_obj_sStaticFields[] = {
	HX_HCSTRING("pending","\x57","\x98","\xec","\x2b"),
	HX_HCSTRING("sortEvents","\x17","\xc5","\x4f","\xf3"),
	HX_HCSTRING("tick","\x5d","\xc3","\xfc","\x4c"),
	::String(null())
};

void MainLoop_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("haxe.MainLoop","\xa5","\xcc","\xab","\xe6");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &MainLoop_obj::__GetStatic;
	__mClass->mSetStaticField = &MainLoop_obj::__SetStatic;
	__mClass->mMarkFunc = MainLoop_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(MainLoop_obj_sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< MainLoop_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = MainLoop_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = MainLoop_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = MainLoop_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

void MainLoop_obj::__boot()
{
{
            	HX_STACK_FRAME("haxe.MainLoop","boot",0x917d709b,"haxe.MainLoop.boot","/usr/lib/haxe/std/haxe/MainLoop.hx",53,0x071890f9)
HXLINE(  53)		pending = null();
            	}
}

} // end namespace haxe