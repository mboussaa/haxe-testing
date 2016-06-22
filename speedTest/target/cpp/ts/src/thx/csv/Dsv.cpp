// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_Reflect
#include <Reflect.h>
#endif
#ifndef INCLUDED_StringTools
#include <StringTools.h>
#endif
#ifndef INCLUDED_haxe_IMap
#include <haxe/IMap.h>
#endif
#ifndef INCLUDED_haxe_ds_StringMap
#include <haxe/ds/StringMap.h>
#endif
#ifndef INCLUDED_thx_Strings
#include <thx/Strings.h>
#endif
#ifndef INCLUDED_thx_csv_Dsv
#include <thx/csv/Dsv.h>
#endif
#ifndef INCLUDED_thx_csv_core_Parser
#include <thx/csv/core/Parser.h>
#endif

namespace thx{
namespace csv{

void Dsv_obj::__construct() { }

Dynamic Dsv_obj::__CreateEmpty() { return new Dsv_obj; }

hx::ObjectPtr< Dsv_obj > Dsv_obj::__new()
{
	hx::ObjectPtr< Dsv_obj > _hx_result = new Dsv_obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic Dsv_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< Dsv_obj > _hx_result = new Dsv_obj();
	_hx_result->__construct();
	return _hx_result;
}

::Array< ::Dynamic> Dsv_obj::decode(::String dsv, ::Dynamic options){
            	HX_STACK_FRAME("thx.csv.Dsv","decode",0xd2164527,"thx.csv.Dsv.decode","thx/csv/Dsv.hx",6,0xdbb9748b)
            	HX_STACK_ARG(dsv,"dsv")
            	HX_STACK_ARG(options,"options")
HXLINE(   7)		if (hx::IsNull( ( (::String)(options->__Field(HX_("quote",3c,23,f2,5d),hx::paccDynamic)) ) )) {
HXLINE(   7)			options->__SetField(HX_("quote",3c,23,f2,5d),HX_("\"",22,00,00,00),hx::paccDynamic);
            		}
HXLINE(   8)		if (hx::IsNull( ( (::String)(options->__Field(HX_("escapedQuote",79,02,8f,79),hx::paccDynamic)) ) )) {
HXLINE(   8)			::String _hx_tmp;
HXDLIN(   8)			if ((( (::String)(options->__Field(HX_("quote",3c,23,f2,5d),hx::paccDynamic)) ) == HX_("\"",22,00,00,00))) {
HXLINE(   8)				_hx_tmp = HX_("\"\"",c0,1d,00,00);
            			}
            			else {
HXLINE(   8)				_hx_tmp = (HX_("\\",5c,00,00,00) + ( (::String)(options->__Field(HX_("quote",3c,23,f2,5d),hx::paccDynamic)) ));
            			}
HXDLIN(   8)			options->__SetField(HX_("escapedQuote",79,02,8f,79),_hx_tmp,hx::paccDynamic);
            		}
HXLINE(   9)		Bool _hx_tmp1 = hx::IsNull( options->__Field(HX_("trimValues",64,ea,de,bf),hx::paccDynamic) );
HXDLIN(   9)		if (_hx_tmp1) {
HXLINE(   9)			options->__SetField(HX_("trimValues",64,ea,de,bf),false,hx::paccDynamic);
            		}
HXLINE(  10)		Bool _hx_tmp2 = hx::IsNull( options->__Field(HX_("trimEmptyLines",b4,03,7f,08),hx::paccDynamic) );
HXDLIN(  10)		if (_hx_tmp2) {
HXLINE(  10)			options->__SetField(HX_("trimEmptyLines",b4,03,7f,08),true,hx::paccDynamic);
            		}
HXLINE(  11)		 ::Dynamic _hx_tmp3 = options->__Field(HX_("trimEmptyLines",b4,03,7f,08),hx::paccDynamic);
HXDLIN(  11)		if (_hx_tmp3) {
HXLINE(  12)			::String _hx_tmp4 = ::thx::Strings_obj::trimCharsLeft(dsv,HX_("\n\r",c3,08,00,00));
HXDLIN(  12)			dsv = ::thx::Strings_obj::trimCharsRight(_hx_tmp4,HX_("\n\r",c3,08,00,00));
            		}
HXLINE(  13)		HX_VAR( ::Array< ::Dynamic>,result);
HXDLIN(  13)		if ((dsv == HX_("",00,00,00,00))) {
HXLINE(  13)			result = ::Array_obj< ::Dynamic>::__new(0);
            		}
            		else {
HXLINE(  13)			result =  ::thx::csv::core::Parser_obj::__new( ::Dynamic(options->__Field(HX_("delimiter",07,07,28,86),hx::paccDynamic)), ::Dynamic(options->__Field(HX_("quote",3c,23,f2,5d),hx::paccDynamic)), ::Dynamic(options->__Field(HX_("escapedQuote",79,02,8f,79),hx::paccDynamic)))->parse(dsv);
            		}
HXLINE(  14)		 ::Dynamic _hx_tmp5 = options->__Field(HX_("trimValues",64,ea,de,bf),hx::paccDynamic);
HXDLIN(  14)		if (_hx_tmp5) {
HXLINE(  15)			HX_VARI( Int,_g) = (int)0;
HXDLIN(  15)			while((_g < result->length)){
HXLINE(  15)				HX_VARI( ::Array< ::String >,row) = result->__get(_g).StaticCast< ::Array< ::String > >();
HXDLIN(  15)				++_g;
HXLINE(  16)				{
HXLINE(  16)					HX_VARI( Int,_g2) = (int)0;
HXDLIN(  16)					HX_VARI( Int,_g1) = row->length;
HXDLIN(  16)					while((_g2 < _g1)){
HXLINE(  16)						HX_VARI( Int,i) = _g2++;
HXLINE(  17)						::String _hx_tmp6 = ::StringTools_obj::trim(row->__get(i));
HXDLIN(  17)						row[i] = _hx_tmp6;
            					}
            				}
            			}
            		}
HXLINE(  19)		return result;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Dsv_obj,decode,return )

::Array< ::Dynamic> Dsv_obj::decodeObjects(::String dsv, ::Dynamic options){
            	HX_STACK_FRAME("thx.csv.Dsv","decodeObjects",0xdbbc4e6d,"thx.csv.Dsv.decodeObjects","thx/csv/Dsv.hx",23,0xdbb9748b)
            	HX_STACK_ARG(dsv,"dsv")
            	HX_STACK_ARG(options,"options")
HXLINE(  23)		::Array< ::Dynamic> _hx_tmp = ::thx::csv::Dsv_obj::decode(dsv,options);
HXDLIN(  23)		return ::thx::csv::Dsv_obj::arrayToObjects(_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Dsv_obj,decodeObjects,return )

::Array< ::Dynamic> Dsv_obj::arrayToObjects(::Array< ::Dynamic> arr){
            	HX_STACK_FRAME("thx.csv.Dsv","arrayToObjects",0xfd8a20b9,"thx.csv.Dsv.arrayToObjects","thx/csv/Dsv.hx",25,0xdbb9748b)
            	HX_STACK_ARG(arr,"arr")
HXLINE(  26)		HX_VARI( ::Array< ::String >,columns) = arr->__get((int)0).StaticCast< ::Array< ::String > >();
HXLINE(  27)		if (hx::IsNull( columns )) {
HXLINE(  28)			return ::Array_obj< ::Dynamic>::__new(0);
            		}
HXLINE(  29)		HX_VARI( ::Array< ::Dynamic>,result) = ::Array_obj< ::Dynamic>::__new(0);
HXDLIN(  29)		HX_VARI( Int,len) = columns->length;
HXDLIN(  29)		HX_VAR( ::Array< ::String >,row);
HXDLIN(  29)		HX_VAR(  ::Dynamic,ob);
HXLINE(  33)		{
HXLINE(  33)			HX_VARI( Int,_g1) = (int)1;
HXDLIN(  33)			HX_VARI( Int,_g) = arr->length;
HXDLIN(  33)			while((_g1 < _g)){
HXLINE(  33)				HX_VARI( Int,r) = _g1++;
HXLINE(  34)				ob =  ::Dynamic(hx::Anon_obj::Create(0));
HXLINE(  35)				row = arr->__get(r).StaticCast< ::Array< ::String > >();
HXLINE(  36)				{
HXLINE(  36)					HX_VARI( Int,_g3) = (int)0;
HXDLIN(  36)					while((_g3 < len)){
HXLINE(  36)						HX_VARI( Int,i) = _g3++;
HXLINE(  37)						::Reflect_obj::setField(ob,columns->__get(i),row->__get(i));
            					}
            				}
HXLINE(  39)				result->push(ob);
            			}
            		}
HXLINE(  41)		return result;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Dsv_obj,arrayToObjects,return )

::String Dsv_obj::encode(::Array< ::Dynamic> data, ::Dynamic options){
            		HX_BEGIN_LOCAL_FUNC_S1(hx::LocalFunc,_hx_Closure_1, ::Dynamic,options) HXARGC(1)
            		::String _hx_run(::Array< ::String > row){
            			HX_BEGIN_LOCAL_FUNC_S1(hx::LocalFunc,_hx_Closure_0, ::Dynamic,options) HXARGC(1)
            			::String _hx_run(::String cell){
            				HX_STACK_FRAME("thx.csv.Dsv","encode",0x670cda0f,"thx.csv.Dsv.encode","thx/csv/Dsv.hx",51,0xdbb9748b)
            				HX_STACK_ARG(cell,"cell")
HXLINE(  51)				Bool _hx_tmp1 = ::thx::csv::Dsv_obj::requiresQuotes(cell, ::Dynamic(options->__Field(HX_("delimiter",07,07,28,86),hx::paccDynamic)), ::Dynamic(options->__Field(HX_("quote",3c,23,f2,5d),hx::paccDynamic)));
HXDLIN(  51)				if (_hx_tmp1) {
HXLINE(  52)					return ::thx::csv::Dsv_obj::applyQuotes(cell, ::Dynamic(options->__Field(HX_("quote",3c,23,f2,5d),hx::paccDynamic)), ::Dynamic(options->__Field(HX_("escapedQuote",79,02,8f,79),hx::paccDynamic)));
            				}
            				else {
HXLINE(  54)					return cell;
            				}
HXLINE(  51)				return null();
            			}
            			HX_END_LOCAL_FUNC1(return)

            			HX_STACK_FRAME("thx.csv.Dsv","encode",0x670cda0f,"thx.csv.Dsv.encode","thx/csv/Dsv.hx",50,0xdbb9748b)
            			HX_STACK_ARG(row,"row")
HXLINE(  50)			return row->map( ::Dynamic(new _hx_Closure_0(options)))->join( ::Dynamic(options->__Field(HX_("delimiter",07,07,28,86),hx::paccDynamic)));
            		}
            		HX_END_LOCAL_FUNC1(return)

            	HX_STACK_FRAME("thx.csv.Dsv","encode",0x670cda0f,"thx.csv.Dsv.encode","thx/csv/Dsv.hx",44,0xdbb9748b)
            	HX_STACK_ARG(data,"data")
            	HX_STACK_ARG(options,"options")
HXLINE(  45)		if (hx::IsNull( ( (::String)(options->__Field(HX_("quote",3c,23,f2,5d),hx::paccDynamic)) ) )) {
HXLINE(  45)			options->__SetField(HX_("quote",3c,23,f2,5d),HX_("\"",22,00,00,00),hx::paccDynamic);
            		}
HXLINE(  46)		if (hx::IsNull( ( (::String)(options->__Field(HX_("escapedQuote",79,02,8f,79),hx::paccDynamic)) ) )) {
HXLINE(  46)			::String _hx_tmp;
HXDLIN(  46)			if ((( (::String)(options->__Field(HX_("quote",3c,23,f2,5d),hx::paccDynamic)) ) == HX_("\"",22,00,00,00))) {
HXLINE(  46)				_hx_tmp = HX_("\"\"",c0,1d,00,00);
            			}
            			else {
HXLINE(  46)				_hx_tmp = (HX_("\\",5c,00,00,00) + ( (::String)(options->__Field(HX_("quote",3c,23,f2,5d),hx::paccDynamic)) ));
            			}
HXDLIN(  46)			options->__SetField(HX_("escapedQuote",79,02,8f,79),_hx_tmp,hx::paccDynamic);
            		}
HXLINE(  47)		if (hx::IsNull( ( (::String)(options->__Field(HX_("newline",54,98,a6,0c),hx::paccDynamic)) ) )) {
HXLINE(  47)			options->__SetField(HX_("newline",54,98,a6,0c),HX_("\n",0a,00,00,00),hx::paccDynamic);
            		}
HXLINE(  49)		return data->map( ::Dynamic(new _hx_Closure_1(options)))->join( ::Dynamic(options->__Field(HX_("newline",54,98,a6,0c),hx::paccDynamic)));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Dsv_obj,encode,return )

::String Dsv_obj::encodeObjects(::Array< ::Dynamic> data, ::Dynamic options){
            	HX_STACK_FRAME("thx.csv.Dsv","encodeObjects",0x7137a685,"thx.csv.Dsv.encodeObjects","thx/csv/Dsv.hx",60,0xdbb9748b)
            	HX_STACK_ARG(data,"data")
            	HX_STACK_ARG(options,"options")
HXLINE(  60)		::Array< ::Dynamic> _hx_tmp = ::thx::csv::Dsv_obj::objectsToArray(data,::Array_obj< ::String >::__new(0));
HXDLIN(  60)		return ::thx::csv::Dsv_obj::encode(_hx_tmp,options);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Dsv_obj,encodeObjects,return )

::Array< ::Dynamic> Dsv_obj::objectsToArray(::Array< ::Dynamic> objects,::Array< ::String > columns){
            	HX_STACK_FRAME("thx.csv.Dsv","objectsToArray",0x68d004a3,"thx.csv.Dsv.objectsToArray","thx/csv/Dsv.hx",62,0xdbb9748b)
            	HX_STACK_ARG(objects,"objects")
            	HX_STACK_ARG(columns,"columns")
HXLINE(  63)		if (hx::IsNull( columns )) {
HXLINE(  64)			return ::thx::csv::Dsv_obj::objectsToArray(objects,::Array_obj< ::String >::__new(0));
            		}
HXLINE(  65)		HX_VARI(  ::haxe::ds::StringMap,map) =  ::haxe::ds::StringMap_obj::__new();
HXDLIN(  65)		HX_VARI( ::Array< ::Dynamic>,result) = ::Array_obj< ::Dynamic>::__new(1)->init(0,columns);
HXDLIN(  65)		HX_VAR( ::Array< ::String >,collector);
HXDLIN(  65)		HX_VAR( ::Array< ::String >,row);
HXLINE(  69)		{
HXLINE(  69)			HX_VARI( Int,_g1) = (int)0;
HXDLIN(  69)			HX_VARI( Int,_g) = columns->length;
HXDLIN(  69)			while((_g1 < _g)){
HXLINE(  69)				HX_VARI( Int,i) = _g1++;
HXLINE(  70)				map->set(columns->__get(i),i);
            			}
            		}
HXLINE(  72)		{
HXLINE(  72)			HX_VARI_NAME( Int,_g2,"_g") = (int)0;
HXDLIN(  72)			while((_g2 < objects->length)){
HXLINE(  72)				HX_VARI(  ::Dynamic,object) = objects->__get(_g2);
HXDLIN(  72)				++_g2;
HXLINE(  73)				collector = ::Array_obj< ::String >::__new(0);
HXLINE(  74)				row = ::Array_obj< ::String >::__new(0);
HXLINE(  75)				{
HXLINE(  75)					HX_VARI_NAME( Int,_g11,"_g1") = (int)0;
HXDLIN(  75)					HX_VARI_NAME( ::Array< ::String >,_g21,"_g2") = ::Reflect_obj::fields(object);
HXDLIN(  75)					while((_g11 < _g21->length)){
HXLINE(  75)						HX_VARI( ::String,field) = _g21->__get(_g11);
HXDLIN(  75)						++_g11;
HXLINE(  76)						HX_VARI(  ::Dynamic,index) = map->get(field);
HXLINE(  77)						if (hx::IsNull( index )) {
HXLINE(  78)							collector->push(field);
            						}
            						else {
HXLINE(  80)							 ::Dynamic _hx_tmp = ::Reflect_obj::field(object,field);
HXDLIN(  80)							row[index] = _hx_tmp;
            						}
            					}
            				}
HXLINE(  83)				Bool _hx_tmp1 = (collector->length > (int)0);
HXDLIN(  83)				if (_hx_tmp1) {
HXLINE(  85)					::Array< ::String > _hx_tmp2 = columns->concat(collector);
HXDLIN(  85)					return ::thx::csv::Dsv_obj::objectsToArray(objects,_hx_tmp2);
            				}
            				else {
HXLINE(  87)					result->push(row);
            				}
            			}
            		}
HXLINE(  90)		return result;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Dsv_obj,objectsToArray,return )

Bool Dsv_obj::requiresQuotes(::String value,::String delimiter,::String quote){
            	HX_STACK_FRAME("thx.csv.Dsv","requiresQuotes",0x109686be,"thx.csv.Dsv.requiresQuotes","thx/csv/Dsv.hx",94,0xdbb9748b)
            	HX_STACK_ARG(value,"value")
            	HX_STACK_ARG(delimiter,"delimiter")
            	HX_STACK_ARG(quote,"quote")
HXLINE(  94)		Bool _hx_tmp;
HXDLIN(  94)		Bool _hx_tmp1;
HXDLIN(  94)		Int _hx_tmp2 = value.indexOf(delimiter,null());
HXDLIN(  94)		if ((_hx_tmp2 < (int)0)) {
HXLINE(  94)			Int _hx_tmp3 = value.indexOf(quote,null());
HXDLIN(  94)			_hx_tmp1 = (_hx_tmp3 >= (int)0);
            		}
            		else {
HXLINE(  94)			_hx_tmp1 = true;
            		}
HXDLIN(  94)		if (!(_hx_tmp1)) {
HXLINE(  94)			Int _hx_tmp4 = value.indexOf(HX_("\n",0a,00,00,00),null());
HXDLIN(  94)			_hx_tmp = (_hx_tmp4 >= (int)0);
            		}
            		else {
HXLINE(  94)			_hx_tmp = true;
            		}
HXDLIN(  94)		if (!(_hx_tmp)) {
HXLINE(  94)			Int _hx_tmp5 = value.indexOf(HX_("\r",0d,00,00,00),null());
HXDLIN(  94)			return (_hx_tmp5 >= (int)0);
            		}
            		else {
HXLINE(  94)			return true;
            		}
HXDLIN(  94)		return false;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(Dsv_obj,requiresQuotes,return )

::String Dsv_obj::applyQuotes(::String value,::String quote,::String escapedQuote){
            	HX_STACK_FRAME("thx.csv.Dsv","applyQuotes",0xf2f6032c,"thx.csv.Dsv.applyQuotes","thx/csv/Dsv.hx",97,0xdbb9748b)
            	HX_STACK_ARG(value,"value")
            	HX_STACK_ARG(quote,"quote")
            	HX_STACK_ARG(escapedQuote,"escapedQuote")
HXLINE(  98)		value = ::StringTools_obj::replace(value,quote,escapedQuote);
HXLINE(  99)		return (((HX_("",00,00,00,00) + quote) + value) + quote);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(Dsv_obj,applyQuotes,return )


Dsv_obj::Dsv_obj()
{
}

bool Dsv_obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 6:
		if (HX_FIELD_EQ(inName,"decode") ) { outValue = decode_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"encode") ) { outValue = encode_dyn(); return true; }
		break;
	case 11:
		if (HX_FIELD_EQ(inName,"applyQuotes") ) { outValue = applyQuotes_dyn(); return true; }
		break;
	case 13:
		if (HX_FIELD_EQ(inName,"decodeObjects") ) { outValue = decodeObjects_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"encodeObjects") ) { outValue = encodeObjects_dyn(); return true; }
		break;
	case 14:
		if (HX_FIELD_EQ(inName,"arrayToObjects") ) { outValue = arrayToObjects_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"objectsToArray") ) { outValue = objectsToArray_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"requiresQuotes") ) { outValue = requiresQuotes_dyn(); return true; }
	}
	return false;
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *Dsv_obj_sMemberStorageInfo = 0;
static hx::StaticInfo *Dsv_obj_sStaticStorageInfo = 0;
#endif

static void Dsv_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(Dsv_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void Dsv_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(Dsv_obj::__mClass,"__mClass");
};

#endif

hx::Class Dsv_obj::__mClass;

static ::String Dsv_obj_sStaticFields[] = {
	HX_HCSTRING("decode","\x2e","\x5d","\xed","\x64"),
	HX_HCSTRING("decodeObjects","\x46","\x55","\xd9","\xac"),
	HX_HCSTRING("arrayToObjects","\xc0","\x17","\xd3","\x25"),
	HX_HCSTRING("encode","\x16","\xf2","\xe3","\xf9"),
	HX_HCSTRING("encodeObjects","\x5e","\xad","\x54","\x42"),
	HX_HCSTRING("objectsToArray","\xaa","\xfb","\x18","\x91"),
	HX_HCSTRING("requiresQuotes","\xc5","\x7d","\xdf","\x38"),
	HX_HCSTRING("applyQuotes","\xc5","\x71","\xe7","\x11"),
	::String(null())
};

void Dsv_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.csv.Dsv","\x55","\xb3","\xfe","\xca");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &Dsv_obj::__GetStatic;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = Dsv_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(Dsv_obj_sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< Dsv_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = Dsv_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = Dsv_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = Dsv_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx
} // end namespace csv