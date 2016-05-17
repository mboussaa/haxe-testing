// Generated by Haxe 3.3.0
#include <hxcpp.h>

#include "cpp/Int64.h"
#ifndef INCLUDED_haxe_io_Bytes
#include <haxe/io/Bytes.h>
#endif
#ifndef INCLUDED_haxe_io_BytesBuffer
#include <haxe/io/BytesBuffer.h>
#endif
#ifndef INCLUDED_haxe_io_Error
#include <haxe/io/Error.h>
#endif
#ifndef INCLUDED_haxe_io_FPHelper
#include <haxe/io/FPHelper.h>
#endif

namespace haxe{
namespace io{

void BytesBuffer_obj::__construct(){
            	HX_STACK_FRAME("haxe.io.BytesBuffer","new",0x022790dd,"haxe.io.BytesBuffer.new","/usr/lib/haxe/std/haxe/io/BytesBuffer.hx",54,0x63ceceb4)
            	HX_STACK_THIS(this)
HXLINE(  54)		this->b = ::Array_obj< unsigned char >::__new();
            	}

Dynamic BytesBuffer_obj::__CreateEmpty() { return new BytesBuffer_obj; }

hx::ObjectPtr< BytesBuffer_obj > BytesBuffer_obj::__new()
{
	hx::ObjectPtr< BytesBuffer_obj > _hx_result = new BytesBuffer_obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic BytesBuffer_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< BytesBuffer_obj > _hx_result = new BytesBuffer_obj();
	_hx_result->__construct();
	return _hx_result;
}

Int BytesBuffer_obj::get_length(){
            	HX_STACK_FRAME("haxe.io.BytesBuffer","get_length",0x8154fdd2,"haxe.io.BytesBuffer.get_length","/usr/lib/haxe/std/haxe/io/BytesBuffer.hx",72,0x63ceceb4)
            	HX_STACK_THIS(this)
HXLINE(  72)		return this->b->length;
            	}


HX_DEFINE_DYNAMIC_FUNC0(BytesBuffer_obj,get_length,return )

void BytesBuffer_obj::addByte(Int byte){
            	HX_STACK_FRAME("haxe.io.BytesBuffer","addByte",0x4d2aa4c6,"haxe.io.BytesBuffer.addByte","/usr/lib/haxe/std/haxe/io/BytesBuffer.hx",84,0x63ceceb4)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(byte,"byte")
HXLINE(  84)		this->b->push(byte);
            	}


HX_DEFINE_DYNAMIC_FUNC1(BytesBuffer_obj,addByte,(void))

void BytesBuffer_obj::add(::haxe::io::Bytes src){
            	HX_STACK_FRAME("haxe.io.BytesBuffer","add",0x021db29e,"haxe.io.BytesBuffer.add","/usr/lib/haxe/std/haxe/io/BytesBuffer.hx",94,0x63ceceb4)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(src,"src")
HXLINE( 112)		::Array< unsigned char > b2 = src->b;
HX_STACK_VAR		(b2,"b2");
HXLINE( 113)		{
HXLINE( 113)			Int _g1 = (int)0;
HX_STACK_VAR			(_g1,"_g1");
HXDLIN( 113)			Int _g = src->length;
HX_STACK_VAR			(_g,"_g");
HXDLIN( 113)			while((_g1 < _g)){
HXLINE( 113)				Int i = _g1++;
HX_STACK_VAR				(i,"i");
HXLINE( 114)				this->b->push(b2->__get(i));
            			}
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC1(BytesBuffer_obj,add,(void))

void BytesBuffer_obj::addString(::String v){
            	HX_STACK_FRAME("haxe.io.BytesBuffer","addString",0xd2731a0f,"haxe.io.BytesBuffer.addString","/usr/lib/haxe/std/haxe/io/BytesBuffer.hx",124,0x63ceceb4)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(v,"v")
HXLINE( 124)		::haxe::io::Bytes src = ::haxe::io::Bytes_obj::ofString(v);
HX_STACK_VAR		(src,"src");
HXDLIN( 124)		::Array< unsigned char > b2 = src->b;
HX_STACK_VAR		(b2,"b2");
HXDLIN( 124)		{
HXLINE( 124)			Int _g1 = (int)0;
HX_STACK_VAR			(_g1,"_g1");
HXDLIN( 124)			Int _g = src->length;
HX_STACK_VAR			(_g,"_g");
HXDLIN( 124)			while((_g1 < _g)){
HXLINE( 124)				Int i = _g1++;
HX_STACK_VAR				(i,"i");
HXDLIN( 124)				this->b->push(b2->__get(i));
            			}
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC1(BytesBuffer_obj,addString,(void))

void BytesBuffer_obj::addInt32(Int v){
            	HX_STACK_FRAME("haxe.io.BytesBuffer","addInt32",0x38ae13d0,"haxe.io.BytesBuffer.addInt32","/usr/lib/haxe/std/haxe/io/BytesBuffer.hx",128,0x63ceceb4)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(v,"v")
HXLINE( 132)		this->b->push(((int)v & (int)(int)255));
HXLINE( 133)		this->b->push(((int)((int)v >> (int)(int)8) & (int)(int)255));
HXLINE( 134)		this->b->push(((int)((int)v >> (int)(int)16) & (int)(int)255));
HXLINE( 135)		this->b->push(hx::UShr(v,(int)24));
            	}


HX_DEFINE_DYNAMIC_FUNC1(BytesBuffer_obj,addInt32,(void))

void BytesBuffer_obj::addInt64(::cpp::Int64Struct v){
            	HX_STACK_FRAME("haxe.io.BytesBuffer","addInt64",0x38ae166f,"haxe.io.BytesBuffer.addInt64","/usr/lib/haxe/std/haxe/io/BytesBuffer.hx",139,0x63ceceb4)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(v,"v")
HXLINE( 140)		Int _hx_tmp = _hx_int64_low(v);
HX_STACK_VAR		(_hx_tmp,"_hx_tmp");
HXDLIN( 140)		this->addInt32(_hx_tmp);
HXLINE( 141)		Int _hx_tmp1 = _hx_int64_high(v);
HX_STACK_VAR		(_hx_tmp1,"_hx_tmp");
HXDLIN( 141)		this->addInt32(_hx_tmp1);
            	}


HX_DEFINE_DYNAMIC_FUNC1(BytesBuffer_obj,addInt64,(void))

void BytesBuffer_obj::addFloat(Float v){
            	HX_STACK_FRAME("haxe.io.BytesBuffer","addFloat",0x7d24461e,"haxe.io.BytesBuffer.addFloat","/usr/lib/haxe/std/haxe/io/BytesBuffer.hx",148,0x63ceceb4)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(v,"v")
HXLINE( 148)		Int _hx_tmp = ::haxe::io::FPHelper_obj::floatToI32(v);
HX_STACK_VAR		(_hx_tmp,"_hx_tmp");
HXDLIN( 148)		this->addInt32(_hx_tmp);
            	}


HX_DEFINE_DYNAMIC_FUNC1(BytesBuffer_obj,addFloat,(void))

void BytesBuffer_obj::addDouble(Float v){
            	HX_STACK_FRAME("haxe.io.BytesBuffer","addDouble",0xf40e1c4f,"haxe.io.BytesBuffer.addDouble","/usr/lib/haxe/std/haxe/io/BytesBuffer.hx",156,0x63ceceb4)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(v,"v")
HXLINE( 156)		::cpp::Int64Struct _hx_tmp = ::haxe::io::FPHelper_obj::doubleToI64(v);
HX_STACK_VAR		(_hx_tmp,"_hx_tmp");
HXDLIN( 156)		this->addInt64(_hx_tmp);
            	}


HX_DEFINE_DYNAMIC_FUNC1(BytesBuffer_obj,addDouble,(void))

void BytesBuffer_obj::addBytes(::haxe::io::Bytes src,Int pos,Int len){
            	HX_STACK_FRAME("haxe.io.BytesBuffer","addBytes",0x382588ed,"haxe.io.BytesBuffer.addBytes","/usr/lib/haxe/std/haxe/io/BytesBuffer.hx",160,0x63ceceb4)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(src,"src")
            	HX_STACK_ARG(pos,"pos")
            	HX_STACK_ARG(len,"len")
HXLINE( 162)		Bool _hx_tmp;
HX_STACK_VAR		(_hx_tmp,"_hx_tmp");
HXDLIN( 162)		Bool _hx_tmp1;
HX_STACK_VAR		(_hx_tmp1,"_hx_tmp");
HXDLIN( 162)		if ((pos >= (int)0)) {
HXLINE( 162)			_hx_tmp1 = (len < (int)0);
            		}
            		else {
HXLINE( 162)			_hx_tmp1 = true;
            		}
HXDLIN( 162)		if (!(_hx_tmp1)) {
HXLINE( 162)			_hx_tmp = ((pos + len) > src->length);
            		}
            		else {
HXLINE( 162)			_hx_tmp = true;
            		}
HXDLIN( 162)		if (_hx_tmp) {
HXLINE( 162)			HX_STACK_DO_THROW(::haxe::io::Error_obj::OutsideBounds_dyn());
            		}
HXLINE( 181)		::Array< unsigned char > b2 = src->b;
HX_STACK_VAR		(b2,"b2");
HXLINE( 182)		{
HXLINE( 182)			Int _g1 = pos;
HX_STACK_VAR			(_g1,"_g1");
HXDLIN( 182)			Int _g = (pos + len);
HX_STACK_VAR			(_g,"_g");
HXDLIN( 182)			while((_g1 < _g)){
HXLINE( 182)				Int i = _g1++;
HX_STACK_VAR				(i,"i");
HXLINE( 183)				this->b->push(b2->__get(i));
            			}
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC3(BytesBuffer_obj,addBytes,(void))

::haxe::io::Bytes BytesBuffer_obj::getBytes(){
            	HX_STACK_FRAME("haxe.io.BytesBuffer","getBytes",0x1e9f7258,"haxe.io.BytesBuffer.getBytes","/usr/lib/haxe/std/haxe/io/BytesBuffer.hx",191,0x63ceceb4)
            	HX_STACK_THIS(this)
HXLINE( 212)		::haxe::io::Bytes bytes = ::haxe::io::Bytes_obj::__new(this->b->length,this->b);
HX_STACK_VAR		(bytes,"bytes");
HXLINE( 214)		this->b = null();
HXLINE( 215)		return bytes;
            	}


HX_DEFINE_DYNAMIC_FUNC0(BytesBuffer_obj,getBytes,return )


BytesBuffer_obj::BytesBuffer_obj()
{
}

void BytesBuffer_obj::__Mark(HX_MARK_PARAMS)
{
	HX_MARK_BEGIN_CLASS(BytesBuffer);
	HX_MARK_MEMBER_NAME(b,"b");
	HX_MARK_END_CLASS();
}

void BytesBuffer_obj::__Visit(HX_VISIT_PARAMS)
{
	HX_VISIT_MEMBER_NAME(b,"b");
}

hx::Val BytesBuffer_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 1:
		if (HX_FIELD_EQ(inName,"b") ) { return hx::Val( b); }
		break;
	case 3:
		if (HX_FIELD_EQ(inName,"add") ) { return hx::Val( add_dyn()); }
		break;
	case 6:
		if (HX_FIELD_EQ(inName,"length") ) { if (inCallProp == hx::paccAlways) return hx::Val(get_length()); }
		break;
	case 7:
		if (HX_FIELD_EQ(inName,"addByte") ) { return hx::Val( addByte_dyn()); }
		break;
	case 8:
		if (HX_FIELD_EQ(inName,"addInt32") ) { return hx::Val( addInt32_dyn()); }
		if (HX_FIELD_EQ(inName,"addInt64") ) { return hx::Val( addInt64_dyn()); }
		if (HX_FIELD_EQ(inName,"addFloat") ) { return hx::Val( addFloat_dyn()); }
		if (HX_FIELD_EQ(inName,"addBytes") ) { return hx::Val( addBytes_dyn()); }
		if (HX_FIELD_EQ(inName,"getBytes") ) { return hx::Val( getBytes_dyn()); }
		break;
	case 9:
		if (HX_FIELD_EQ(inName,"addString") ) { return hx::Val( addString_dyn()); }
		if (HX_FIELD_EQ(inName,"addDouble") ) { return hx::Val( addDouble_dyn()); }
		break;
	case 10:
		if (HX_FIELD_EQ(inName,"get_length") ) { return hx::Val( get_length_dyn()); }
	}
	return super::__Field(inName,inCallProp);
}

hx::Val BytesBuffer_obj::__SetField(const ::String &inName,const hx::Val &inValue,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 1:
		if (HX_FIELD_EQ(inName,"b") ) { b=inValue.Cast< ::Array< unsigned char > >(); return inValue; }
	}
	return super::__SetField(inName,inValue,inCallProp);
}

void BytesBuffer_obj::__GetFields(Array< ::String> &outFields)
{
	outFields->push(HX_HCSTRING("b","\x62","\x00","\x00","\x00"));
	outFields->push(HX_HCSTRING("length","\xe6","\x94","\x07","\x9f"));
	super::__GetFields(outFields);
};

#if HXCPP_SCRIPTABLE
static hx::StorageInfo BytesBuffer_obj_sMemberStorageInfo[] = {
	{hx::fsObject /*Array< unsigned char >*/ ,(int)offsetof(BytesBuffer_obj,b),HX_HCSTRING("b","\x62","\x00","\x00","\x00")},
	{ hx::fsUnknown, 0, null()}
};
static hx::StaticInfo *BytesBuffer_obj_sStaticStorageInfo = 0;
#endif

static ::String BytesBuffer_obj_sMemberFields[] = {
	HX_HCSTRING("b","\x62","\x00","\x00","\x00"),
	HX_HCSTRING("get_length","\xaf","\x04","\x8f","\x8f"),
	HX_HCSTRING("addByte","\xc9","\x61","\x60","\x7d"),
	HX_HCSTRING("add","\x21","\xf2","\x49","\x00"),
	HX_HCSTRING("addString","\xd2","\x5d","\x54","\xc9"),
	HX_HCSTRING("addInt32","\x6d","\xb9","\x7d","\x37"),
	HX_HCSTRING("addInt64","\x0c","\xbc","\x7d","\x37"),
	HX_HCSTRING("addFloat","\xbb","\xeb","\xf3","\x7b"),
	HX_HCSTRING("addDouble","\x12","\x60","\xef","\xea"),
	HX_HCSTRING("addBytes","\x8a","\x2e","\xf5","\x36"),
	HX_HCSTRING("getBytes","\xf5","\x17","\x6f","\x1d"),
	::String(null()) };

static void BytesBuffer_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(BytesBuffer_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void BytesBuffer_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(BytesBuffer_obj::__mClass,"__mClass");
};

#endif

hx::Class BytesBuffer_obj::__mClass;

void BytesBuffer_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("haxe.io.BytesBuffer","\x6b","\xde","\xc4","\xa0");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &hx::Class_obj::GetNoStaticField;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = BytesBuffer_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(0 /* sStaticFields */);
	__mClass->mMembers = hx::Class_obj::dupFunctions(BytesBuffer_obj_sMemberFields);
	__mClass->mCanCast = hx::TCanCast< BytesBuffer_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = BytesBuffer_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = BytesBuffer_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = BytesBuffer_obj_sStaticStorageInfo;
#endif
	hx::RegisterClass(__mClass->mName, __mClass);
}

} // end namespace haxe
} // end namespace io
