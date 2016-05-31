// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_EReg
#include <EReg.h>
#endif
#ifndef INCLUDED_haxe_Utf8
#include <haxe/Utf8.h>
#endif
#ifndef INCLUDED_thx_Arrays
#include <thx/Arrays.h>
#endif
#ifndef INCLUDED_thx_text_table_StringBlock
#include <thx/text/table/StringBlock.h>
#endif

namespace thx{
namespace text{
namespace table{

void StringBlock_obj::__construct(::Array< ::String > lines){
            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_0) HXARGC(2)
            		Int _hx_run(Int width,::String line){
            			HX_STACK_FRAME("thx.text.table.StringBlock","new",0xfb2c2857,"thx.text.table.StringBlock.new","thx/text/table/StringBlock.hx",24,0x5f0cdb1a)
            			HX_STACK_ARG(width,"width")
            			HX_STACK_ARG(line,"line")
HXLINE(  24)			HX_VARI( Int,b) = ::haxe::Utf8_obj::length(line);
HXDLIN(  24)			if ((width > b)) {
HXLINE(  24)				return width;
            			}
            			else {
HXLINE(  24)				return b;
            			}
HXDLIN(  24)			return (int)0;
            		}
            		HX_END_LOCAL_FUNC2(return)

            	HX_STACK_FRAME("thx.text.table.StringBlock","new",0xfb2c2857,"thx.text.table.StringBlock.new","thx/text/table/StringBlock.hx",22,0x5f0cdb1a)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(lines,"lines")
HXLINE(  23)		this->lines = lines;
HXLINE(  24)		this->width = ( (Int)(::thx::Arrays_obj::reduce(lines, ::Dynamic(new _hx_Closure_0()),(int)0)) );
HXLINE(  25)		this->height = lines->length;
            	}

Dynamic StringBlock_obj::__CreateEmpty() { return new StringBlock_obj; }

hx::ObjectPtr< StringBlock_obj > StringBlock_obj::__new(::Array< ::String > lines)
{
	hx::ObjectPtr< StringBlock_obj > _hx_result = new StringBlock_obj();
	_hx_result->__construct(lines);
	return _hx_result;
}

Dynamic StringBlock_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< StringBlock_obj > _hx_result = new StringBlock_obj();
	_hx_result->__construct(inArgs[0]);
	return _hx_result;
}

::Array< ::String > StringBlock_obj::getLine(Int index){
            	HX_STACK_FRAME("thx.text.table.StringBlock","getLine",0x757ee721,"thx.text.table.StringBlock.getLine","thx/text/table/StringBlock.hx",28,0x5f0cdb1a)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(index,"index")
HXLINE(  29)		if ((index >= this->height)) {
HXLINE(  30)			return ::Array_obj< ::String >::__new(0);
            		}
HXLINE(  31)		return this->lines->__get(index).split(HX_("",00,00,00,00));
            	}


HX_DEFINE_DYNAMIC_FUNC1(StringBlock_obj,getLine,return )

Int StringBlock_obj::symbolPos(::String s){
            	HX_STACK_FRAME("thx.text.table.StringBlock","symbolPos",0x776ab853,"thx.text.table.StringBlock.symbolPos","thx/text/table/StringBlock.hx",34,0x5f0cdb1a)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(s,"s")
HXLINE(  35)		HX_VARI( Int,max) = (int)0;
HXDLIN(  35)		HX_VAR( Int,pos);
HXLINE(  37)		{
HXLINE(  37)			HX_VARI( Int,_g) = (int)0;
HXDLIN(  37)			HX_VARI( ::Array< ::String >,_g1) = this->lines;
HXDLIN(  37)			while((_g < _g1->length)){
HXLINE(  37)				HX_VARI( ::String,line) = _g1->__get(_g);
HXDLIN(  37)				++_g;
HXLINE(  38)				pos = line.lastIndexOf(s,null());
HXLINE(  39)				if ((pos <= (int)0)) {
HXLINE(  40)					continue;
            				}
HXLINE(  41)				HX_VARI( Int,b) = (line.length - pos);
HXDLIN(  41)				Bool _hx_tmp = (max > b);
HXDLIN(  41)				if (_hx_tmp) {
HXLINE(  41)					max = max;
            				}
            				else {
HXLINE(  41)					max = b;
            				}
            			}
            		}
HXLINE(  43)		return max;
            	}


HX_DEFINE_DYNAMIC_FUNC1(StringBlock_obj,symbolPos,return )

::String StringBlock_obj::toString(){
            	HX_STACK_FRAME("thx.text.table.StringBlock","toString",0xbd213955,"thx.text.table.StringBlock.toString","thx/text/table/StringBlock.hx",47,0x5f0cdb1a)
            	HX_STACK_THIS(this)
HXLINE(  47)		return this->lines->join(HX_("\n",0a,00,00,00));
            	}


HX_DEFINE_DYNAMIC_FUNC0(StringBlock_obj,toString,return )

 ::thx::text::table::StringBlock StringBlock_obj::fromString(::String s){
            	HX_STACK_FRAME("thx.text.table.StringBlock","fromString",0x3910d2c4,"thx.text.table.StringBlock.fromString","thx/text/table/StringBlock.hx",9,0x5f0cdb1a)
            	HX_STACK_ARG(s,"s")
HXLINE(  10)		HX_VARI( ::Array< ::String >,lines) =  ::EReg_obj::__new(HX_("(\r\n|\n\r|\n|\r)",90,c1,8a,17),HX_("g",67,00,00,00))->split(s);
HXLINE(  11)		return  ::thx::text::table::StringBlock_obj::__new(lines);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(StringBlock_obj,fromString,return )

 ::thx::text::table::StringBlock StringBlock_obj::empty(){
            	HX_STACK_FRAME("thx.text.table.StringBlock","empty",0x1371be44,"thx.text.table.StringBlock.empty","thx/text/table/StringBlock.hx",15,0x5f0cdb1a)
HXLINE(  15)		return  ::thx::text::table::StringBlock_obj::__new(::Array_obj< ::String >::__new(0));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC0(StringBlock_obj,empty,return )


StringBlock_obj::StringBlock_obj()
{
}

void StringBlock_obj::__Mark(HX_MARK_PARAMS)
{
	HX_MARK_BEGIN_CLASS(StringBlock);
	HX_MARK_MEMBER_NAME(lines,"lines");
	HX_MARK_MEMBER_NAME(width,"width");
	HX_MARK_MEMBER_NAME(height,"height");
	HX_MARK_END_CLASS();
}

void StringBlock_obj::__Visit(HX_VISIT_PARAMS)
{
	HX_VISIT_MEMBER_NAME(lines,"lines");
	HX_VISIT_MEMBER_NAME(width,"width");
	HX_VISIT_MEMBER_NAME(height,"height");
}

hx::Val StringBlock_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 5:
		if (HX_FIELD_EQ(inName,"lines") ) { return hx::Val( lines); }
		if (HX_FIELD_EQ(inName,"width") ) { return hx::Val( width); }
		break;
	case 6:
		if (HX_FIELD_EQ(inName,"height") ) { return hx::Val( height); }
		break;
	case 7:
		if (HX_FIELD_EQ(inName,"getLine") ) { return hx::Val( getLine_dyn()); }
		break;
	case 8:
		if (HX_FIELD_EQ(inName,"toString") ) { return hx::Val( toString_dyn()); }
		break;
	case 9:
		if (HX_FIELD_EQ(inName,"symbolPos") ) { return hx::Val( symbolPos_dyn()); }
	}
	return super::__Field(inName,inCallProp);
}

bool StringBlock_obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 5:
		if (HX_FIELD_EQ(inName,"empty") ) { outValue = empty_dyn(); return true; }
		break;
	case 10:
		if (HX_FIELD_EQ(inName,"fromString") ) { outValue = fromString_dyn(); return true; }
	}
	return false;
}

hx::Val StringBlock_obj::__SetField(const ::String &inName,const hx::Val &inValue,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 5:
		if (HX_FIELD_EQ(inName,"lines") ) { lines=inValue.Cast< ::Array< ::String > >(); return inValue; }
		if (HX_FIELD_EQ(inName,"width") ) { width=inValue.Cast< Int >(); return inValue; }
		break;
	case 6:
		if (HX_FIELD_EQ(inName,"height") ) { height=inValue.Cast< Int >(); return inValue; }
	}
	return super::__SetField(inName,inValue,inCallProp);
}

void StringBlock_obj::__GetFields(Array< ::String> &outFields)
{
	outFields->push(HX_HCSTRING("lines","\xff","\xdd","\x01","\x75"));
	outFields->push(HX_HCSTRING("width","\x06","\xb6","\x62","\xca"));
	outFields->push(HX_HCSTRING("height","\xe7","\x07","\x4c","\x02"));
	super::__GetFields(outFields);
};

#if HXCPP_SCRIPTABLE
static hx::StorageInfo StringBlock_obj_sMemberStorageInfo[] = {
	{hx::fsObject /*Array< ::String >*/ ,(int)offsetof(StringBlock_obj,lines),HX_HCSTRING("lines","\xff","\xdd","\x01","\x75")},
	{hx::fsInt,(int)offsetof(StringBlock_obj,width),HX_HCSTRING("width","\x06","\xb6","\x62","\xca")},
	{hx::fsInt,(int)offsetof(StringBlock_obj,height),HX_HCSTRING("height","\xe7","\x07","\x4c","\x02")},
	{ hx::fsUnknown, 0, null()}
};
static hx::StaticInfo *StringBlock_obj_sStaticStorageInfo = 0;
#endif

static ::String StringBlock_obj_sMemberFields[] = {
	HX_HCSTRING("lines","\xff","\xdd","\x01","\x75"),
	HX_HCSTRING("width","\x06","\xb6","\x62","\xca"),
	HX_HCSTRING("height","\xe7","\x07","\x4c","\x02"),
	HX_HCSTRING("getLine","\xaa","\xc7","\x35","\x1a"),
	HX_HCSTRING("symbolPos","\x1c","\x8d","\x01","\xe0"),
	HX_HCSTRING("toString","\xac","\xd0","\x6e","\x38"),
	::String(null()) };

static void StringBlock_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(StringBlock_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void StringBlock_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(StringBlock_obj::__mClass,"__mClass");
};

#endif

hx::Class StringBlock_obj::__mClass;

static ::String StringBlock_obj_sStaticFields[] = {
	HX_HCSTRING("fromString","\xdb","\x2d","\x74","\x54"),
	HX_HCSTRING("empty","\x8d","\x3a","\xda","\x6f"),
	::String(null())
};

void StringBlock_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.text.table.StringBlock","\xe5","\xb0","\x15","\xcd");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &StringBlock_obj::__GetStatic;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = StringBlock_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(StringBlock_obj_sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(StringBlock_obj_sMemberFields);
	__mClass->mCanCast = hx::TCanCast< StringBlock_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = StringBlock_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = StringBlock_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = StringBlock_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx
} // end namespace text
} // end namespace table