// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_StringTools
#include <StringTools.h>
#endif
#ifndef INCLUDED_thx__Decimal_Decimal_Impl_
#include <thx/_Decimal/Decimal_Impl_.h>
#endif
#ifndef INCLUDED_thx_bigint_BigIntImpl
#include <thx/bigint/BigIntImpl.h>
#endif
#ifndef INCLUDED_thx_bigint_DecimalImpl
#include <thx/bigint/DecimalImpl.h>
#endif
#ifndef INCLUDED_thx_culture_Culture
#include <thx/culture/Culture.h>
#endif
#ifndef INCLUDED_thx_culture_NumberFormatInfo
#include <thx/culture/NumberFormatInfo.h>
#endif
#ifndef INCLUDED_thx_format_BigIntFormat
#include <thx/format/BigIntFormat.h>
#endif
#ifndef INCLUDED_thx_format_DecimalFormat
#include <thx/format/DecimalFormat.h>
#endif
#ifndef INCLUDED_thx_format_Format
#include <thx/format/Format.h>
#endif

namespace thx{
namespace format{

void BigIntFormat_obj::__construct() { }

Dynamic BigIntFormat_obj::__CreateEmpty() { return new BigIntFormat_obj; }

hx::ObjectPtr< BigIntFormat_obj > BigIntFormat_obj::__new()
{
	hx::ObjectPtr< BigIntFormat_obj > _hx_result = new BigIntFormat_obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic BigIntFormat_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< BigIntFormat_obj > _hx_result = new BigIntFormat_obj();
	_hx_result->__construct();
	return _hx_result;
}

::String BigIntFormat_obj::binary(::Dynamic i, ::Dynamic __o_significantDigits){
 ::Dynamic significantDigits = __o_significantDigits.Default(1);
            	HX_STACK_FRAME("thx.format.BigIntFormat","binary",0x4150979c,"thx.format.BigIntFormat.binary","thx/format/BigIntFormat.hx",19,0xe5d57f0b)
            	HX_STACK_ARG(i,"i")
            	HX_STACK_ARG(significantDigits,"significantDigits")
HXLINE(  19)		Bool _hx_tmp;
HXDLIN(  19)		if (hx::IsEq( significantDigits,(int)0 )) {
HXLINE(  19)			_hx_tmp = ::thx::bigint::BigIntImpl_obj::isZero(i);
            		}
            		else {
HXLINE(  19)			_hx_tmp = false;
            		}
HXDLIN(  19)		if (_hx_tmp) {
HXLINE(  19)			return HX_("",00,00,00,00);
            		}
            		else {
HXLINE(  19)			::String _hx_tmp1 = ::thx::bigint::BigIntImpl_obj::toStringWithBase(i,(int)2);
HXDLIN(  19)			return ::StringTools_obj::lpad(_hx_tmp1,HX_("0",30,00,00,00),significantDigits);
            		}
HXDLIN(  19)		return null();
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(BigIntFormat_obj,binary,return )

::String BigIntFormat_obj::currency(::Dynamic i, ::Dynamic precision,::String symbol, ::thx::culture::Culture culture){
            	HX_STACK_FRAME("thx.format.BigIntFormat","currency",0x2f2c3fac,"thx.format.BigIntFormat.currency","thx/format/BigIntFormat.hx",26,0xe5d57f0b)
            	HX_STACK_ARG(i,"i")
            	HX_STACK_ARG(precision,"precision")
            	HX_STACK_ARG(symbol,"symbol")
            	HX_STACK_ARG(culture,"culture")
HXLINE(  26)		return ::thx::format::DecimalFormat_obj::currency(::thx::_Decimal::Decimal_Impl__obj::fromBigInt(i),precision,symbol,culture);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC4(BigIntFormat_obj,currency,return )

::String BigIntFormat_obj::customFormat(::Dynamic i,::String pattern, ::thx::culture::Culture culture){
            	HX_STACK_FRAME("thx.format.BigIntFormat","customFormat",0xe685e7a3,"thx.format.BigIntFormat.customFormat","thx/format/BigIntFormat.hx",46,0xe5d57f0b)
            	HX_STACK_ARG(i,"i")
            	HX_STACK_ARG(pattern,"pattern")
            	HX_STACK_ARG(culture,"culture")
HXLINE(  46)		return ::thx::format::DecimalFormat_obj::customFormat(::thx::_Decimal::Decimal_Impl__obj::fromBigInt(i),pattern,culture);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(BigIntFormat_obj,customFormat,return )

::String BigIntFormat_obj::decimal(::Dynamic i, ::Dynamic __o_significantDigits, ::thx::culture::Culture culture){
 ::Dynamic significantDigits = __o_significantDigits.Default(1);
            	HX_STACK_FRAME("thx.format.BigIntFormat","decimal",0x4ecf0096,"thx.format.BigIntFormat.decimal","thx/format/BigIntFormat.hx",52,0xe5d57f0b)
            	HX_STACK_ARG(i,"i")
            	HX_STACK_ARG(significantDigits,"significantDigits")
            	HX_STACK_ARG(culture,"culture")
HXLINE(  52)		return ::thx::format::DecimalFormat_obj::decimal(::thx::_Decimal::Decimal_Impl__obj::fromBigInt(i),significantDigits,culture);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(BigIntFormat_obj,decimal,return )

::String BigIntFormat_obj::exponential(::Dynamic i, ::Dynamic __o_precision, ::Dynamic __o_digits,::String __o_symbol, ::thx::culture::Culture culture){
 ::Dynamic precision = __o_precision.Default(6);
 ::Dynamic digits = __o_digits.Default(3);
::String symbol = __o_symbol.Default(HX_HCSTRING("e","\x65","\x00","\x00","\x00"));
            	HX_STACK_FRAME("thx.format.BigIntFormat","exponential",0xcb0d290a,"thx.format.BigIntFormat.exponential","thx/format/BigIntFormat.hx",58,0xe5d57f0b)
            	HX_STACK_ARG(i,"i")
            	HX_STACK_ARG(precision,"precision")
            	HX_STACK_ARG(digits,"digits")
            	HX_STACK_ARG(symbol,"symbol")
            	HX_STACK_ARG(culture,"culture")
HXLINE(  58)		return ::thx::format::DecimalFormat_obj::exponential(::thx::_Decimal::Decimal_Impl__obj::fromBigInt(i),precision,digits,symbol,culture);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC5(BigIntFormat_obj,exponential,return )

::String BigIntFormat_obj::fixed(::Dynamic i, ::Dynamic precision, ::thx::culture::Culture culture){
            	HX_STACK_FRAME("thx.format.BigIntFormat","fixed",0x93f3ca39,"thx.format.BigIntFormat.fixed","thx/format/BigIntFormat.hx",64,0xe5d57f0b)
            	HX_STACK_ARG(i,"i")
            	HX_STACK_ARG(precision,"precision")
            	HX_STACK_ARG(culture,"culture")
HXLINE(  64)		return ::thx::format::DecimalFormat_obj::fixed(::thx::_Decimal::Decimal_Impl__obj::fromBigInt(i),precision,culture);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(BigIntFormat_obj,fixed,return )

::String BigIntFormat_obj::format(::Dynamic i,::String pattern, ::thx::culture::Culture culture){
            	HX_STACK_FRAME("thx.format.BigIntFormat","format",0x51d36ad2,"thx.format.BigIntFormat.format","thx/format/BigIntFormat.hx",93,0xe5d57f0b)
            	HX_STACK_ARG(i,"i")
            	HX_STACK_ARG(pattern,"pattern")
            	HX_STACK_ARG(culture,"culture")
HXLINE(  93)		return ::thx::format::DecimalFormat_obj::format(::thx::_Decimal::Decimal_Impl__obj::fromBigInt(i),pattern,culture);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(BigIntFormat_obj,format,return )

::String BigIntFormat_obj::general(::Dynamic i, ::Dynamic significantDigits, ::thx::culture::Culture culture){
            	HX_STACK_FRAME("thx.format.BigIntFormat","general",0x1e56b72d,"thx.format.BigIntFormat.general","thx/format/BigIntFormat.hx",99,0xe5d57f0b)
            	HX_STACK_ARG(i,"i")
            	HX_STACK_ARG(significantDigits,"significantDigits")
            	HX_STACK_ARG(culture,"culture")
HXLINE(  99)		return ::thx::format::DecimalFormat_obj::general(::thx::_Decimal::Decimal_Impl__obj::fromBigInt(i),significantDigits,culture);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(BigIntFormat_obj,general,return )

::String BigIntFormat_obj::hex(::Dynamic i, ::Dynamic __o_significantDigits, ::thx::culture::Culture culture){
 ::Dynamic significantDigits = __o_significantDigits.Default(1);
            	HX_STACK_FRAME("thx.format.BigIntFormat","hex",0x05c8e860,"thx.format.BigIntFormat.hex","thx/format/BigIntFormat.hx",104,0xe5d57f0b)
            	HX_STACK_ARG(i,"i")
            	HX_STACK_ARG(significantDigits,"significantDigits")
            	HX_STACK_ARG(culture,"culture")
HXLINE( 106)		Bool _hx_tmp;
HXDLIN( 106)		if (hx::IsEq( significantDigits,(int)0 )) {
HXLINE( 106)			_hx_tmp = ::thx::bigint::BigIntImpl_obj::isZero(i);
            		}
            		else {
HXLINE( 106)			_hx_tmp = false;
            		}
HXDLIN( 106)		if (_hx_tmp) {
HXLINE( 106)			return HX_("",00,00,00,00);
            		}
            		else {
HXLINE( 106)			::String _hx_tmp1 = ::thx::format::BigIntFormat_obj::toBase(i,(int)16,culture);
HXDLIN( 106)			return ::StringTools_obj::lpad(_hx_tmp1,HX_("0",30,00,00,00),significantDigits);
            		}
HXDLIN( 106)		return null();
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(BigIntFormat_obj,hex,return )

::String BigIntFormat_obj::integer(::Dynamic i, ::thx::culture::Culture culture){
            	HX_STACK_FRAME("thx.format.BigIntFormat","integer",0x7f1709c3,"thx.format.BigIntFormat.integer","thx/format/BigIntFormat.hx",113,0xe5d57f0b)
            	HX_STACK_ARG(i,"i")
            	HX_STACK_ARG(culture,"culture")
HXLINE( 113)		return ::thx::format::BigIntFormat_obj::number(i,(int)0,culture);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(BigIntFormat_obj,integer,return )

::String BigIntFormat_obj::number(::Dynamic i, ::Dynamic precision, ::thx::culture::Culture culture){
            	HX_STACK_FRAME("thx.format.BigIntFormat","number",0xf5bf6264,"thx.format.BigIntFormat.number","thx/format/BigIntFormat.hx",120,0xe5d57f0b)
            	HX_STACK_ARG(i,"i")
            	HX_STACK_ARG(precision,"precision")
            	HX_STACK_ARG(culture,"culture")
HXLINE( 120)		return ::thx::format::DecimalFormat_obj::number(::thx::_Decimal::Decimal_Impl__obj::fromBigInt(i),precision,culture);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(BigIntFormat_obj,number,return )

::String BigIntFormat_obj::octal(::Dynamic i, ::Dynamic __o_significantDigits, ::thx::culture::Culture culture){
 ::Dynamic significantDigits = __o_significantDigits.Default(1);
            	HX_STACK_FRAME("thx.format.BigIntFormat","octal",0xbe94ae90,"thx.format.BigIntFormat.octal","thx/format/BigIntFormat.hx",126,0xe5d57f0b)
            	HX_STACK_ARG(i,"i")
            	HX_STACK_ARG(significantDigits,"significantDigits")
            	HX_STACK_ARG(culture,"culture")
HXLINE( 126)		Bool _hx_tmp;
HXDLIN( 126)		if (hx::IsEq( significantDigits,(int)0 )) {
HXLINE( 126)			_hx_tmp = ::thx::bigint::BigIntImpl_obj::isZero(i);
            		}
            		else {
HXLINE( 126)			_hx_tmp = false;
            		}
HXDLIN( 126)		if (_hx_tmp) {
HXLINE( 126)			return HX_("",00,00,00,00);
            		}
            		else {
HXLINE( 126)			::String _hx_tmp1 = ::thx::format::BigIntFormat_obj::toBase(i,(int)8,culture);
HXDLIN( 126)			return ::StringTools_obj::lpad(_hx_tmp1,HX_("0",30,00,00,00),significantDigits);
            		}
HXDLIN( 126)		return null();
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(BigIntFormat_obj,octal,return )

::String BigIntFormat_obj::percent(::Dynamic i, ::Dynamic decimals, ::thx::culture::Culture culture){
            	HX_STACK_FRAME("thx.format.BigIntFormat","percent",0xe0d5f6ca,"thx.format.BigIntFormat.percent","thx/format/BigIntFormat.hx",132,0xe5d57f0b)
            	HX_STACK_ARG(i,"i")
            	HX_STACK_ARG(decimals,"decimals")
            	HX_STACK_ARG(culture,"culture")
HXLINE( 132)		return ::thx::format::DecimalFormat_obj::percent(::thx::_Decimal::Decimal_Impl__obj::fromBigInt(i),decimals,culture);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(BigIntFormat_obj,percent,return )

::String BigIntFormat_obj::permille(::Dynamic i, ::Dynamic decimals, ::thx::culture::Culture culture){
            	HX_STACK_FRAME("thx.format.BigIntFormat","permille",0x9f071667,"thx.format.BigIntFormat.permille","thx/format/BigIntFormat.hx",138,0xe5d57f0b)
            	HX_STACK_ARG(i,"i")
            	HX_STACK_ARG(decimals,"decimals")
            	HX_STACK_ARG(culture,"culture")
HXLINE( 138)		return ::thx::format::DecimalFormat_obj::permille(::thx::_Decimal::Decimal_Impl__obj::fromBigInt(i),decimals,culture);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(BigIntFormat_obj,permille,return )

::String BigIntFormat_obj::printf(::Dynamic i,::String pattern, ::thx::culture::Culture culture){
            	HX_STACK_FRAME("thx.format.BigIntFormat","printf",0x05a6ab34,"thx.format.BigIntFormat.printf","thx/format/BigIntFormat.hx",195,0xe5d57f0b)
            	HX_STACK_ARG(i,"i")
            	HX_STACK_ARG(pattern,"pattern")
            	HX_STACK_ARG(culture,"culture")
HXLINE( 195)		return ::thx::format::DecimalFormat_obj::printf(::thx::_Decimal::Decimal_Impl__obj::fromBigInt(i),pattern,culture);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(BigIntFormat_obj,printf,return )

::String BigIntFormat_obj::toBase(::Dynamic value,Int base, ::thx::culture::Culture culture){
            	HX_STACK_FRAME("thx.format.BigIntFormat","toBase",0xcb0f2ec7,"thx.format.BigIntFormat.toBase","thx/format/BigIntFormat.hx",200,0xe5d57f0b)
            	HX_STACK_ARG(value,"value")
            	HX_STACK_ARG(base,"base")
            	HX_STACK_ARG(culture,"culture")
HXLINE( 201)		HX_VARI( ::String,s) = ::thx::bigint::BigIntImpl_obj::toStringWithBase(value,base);
HXLINE( 202)		if (!(( (Bool)(value->__Field(HX_("sign",3d,90,53,4c),hx::paccDynamic)) ))) {
HXLINE( 203)			return s;
            		}
HXLINE( 204)		::String _hx_tmp = s.substring((int)1,null());
HXDLIN( 204)		return (::thx::format::BigIntFormat_obj::numberFormat(culture)->signNegative + _hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(BigIntFormat_obj,toBase,return )

::String BigIntFormat_obj::unit(::Dynamic i,Int decimals,::String unitSymbol, ::thx::culture::Culture culture){
            	HX_STACK_FRAME("thx.format.BigIntFormat","unit",0x12a0f95f,"thx.format.BigIntFormat.unit","thx/format/BigIntFormat.hx",211,0xe5d57f0b)
            	HX_STACK_ARG(i,"i")
            	HX_STACK_ARG(decimals,"decimals")
            	HX_STACK_ARG(unitSymbol,"unitSymbol")
            	HX_STACK_ARG(culture,"culture")
HXLINE( 211)		return ::thx::format::DecimalFormat_obj::unit(::thx::_Decimal::Decimal_Impl__obj::fromBigInt(i),decimals,unitSymbol,culture);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC4(BigIntFormat_obj,unit,return )

 ::thx::culture::NumberFormatInfo BigIntFormat_obj::numberFormat( ::thx::culture::Culture culture){
            	HX_STACK_FRAME("thx.format.BigIntFormat","numberFormat",0xf6fa48bb,"thx.format.BigIntFormat.numberFormat","thx/format/BigIntFormat.hx",216,0xe5d57f0b)
            	HX_STACK_ARG(culture,"culture")
HXLINE( 216)		Bool _hx_tmp;
HXDLIN( 216)		if (hx::IsNotNull( culture )) {
HXLINE( 216)			_hx_tmp = hx::IsNotNull( culture->number );
            		}
            		else {
HXLINE( 216)			_hx_tmp = false;
            		}
HXDLIN( 216)		if (_hx_tmp) {
HXLINE( 216)			return culture->number;
            		}
            		else {
HXLINE( 216)			return ::thx::format::Format_obj::get_defaultCulture()->number;
            		}
HXDLIN( 216)		return null();
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(BigIntFormat_obj,numberFormat,return )


BigIntFormat_obj::BigIntFormat_obj()
{
}

bool BigIntFormat_obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 3:
		if (HX_FIELD_EQ(inName,"hex") ) { outValue = hex_dyn(); return true; }
		break;
	case 4:
		if (HX_FIELD_EQ(inName,"unit") ) { outValue = unit_dyn(); return true; }
		break;
	case 5:
		if (HX_FIELD_EQ(inName,"fixed") ) { outValue = fixed_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"octal") ) { outValue = octal_dyn(); return true; }
		break;
	case 6:
		if (HX_FIELD_EQ(inName,"binary") ) { outValue = binary_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"format") ) { outValue = format_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"number") ) { outValue = number_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"printf") ) { outValue = printf_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"toBase") ) { outValue = toBase_dyn(); return true; }
		break;
	case 7:
		if (HX_FIELD_EQ(inName,"decimal") ) { outValue = decimal_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"general") ) { outValue = general_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"integer") ) { outValue = integer_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"percent") ) { outValue = percent_dyn(); return true; }
		break;
	case 8:
		if (HX_FIELD_EQ(inName,"currency") ) { outValue = currency_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"permille") ) { outValue = permille_dyn(); return true; }
		break;
	case 11:
		if (HX_FIELD_EQ(inName,"exponential") ) { outValue = exponential_dyn(); return true; }
		break;
	case 12:
		if (HX_FIELD_EQ(inName,"customFormat") ) { outValue = customFormat_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"numberFormat") ) { outValue = numberFormat_dyn(); return true; }
	}
	return false;
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *BigIntFormat_obj_sMemberStorageInfo = 0;
static hx::StaticInfo *BigIntFormat_obj_sStaticStorageInfo = 0;
#endif

static void BigIntFormat_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(BigIntFormat_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void BigIntFormat_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(BigIntFormat_obj::__mClass,"__mClass");
};

#endif

hx::Class BigIntFormat_obj::__mClass;

static ::String BigIntFormat_obj_sStaticFields[] = {
	HX_HCSTRING("binary","\x01","\xbc","\x0b","\xed"),
	HX_HCSTRING("currency","\x51","\x07","\x45","\x9b"),
	HX_HCSTRING("customFormat","\xc8","\xe5","\x2b","\xfd"),
	HX_HCSTRING("decimal","\x91","\xb4","\xd3","\xe6"),
	HX_HCSTRING("exponential","\x85","\xf6","\x7a","\xf4"),
	HX_HCSTRING("fixed","\x74","\xf9","\xa1","\x00"),
	HX_HCSTRING("format","\x37","\x8f","\x8e","\xfd"),
	HX_HCSTRING("general","\x28","\x6b","\x5b","\xb6"),
	HX_HCSTRING("hex","\xdb","\x42","\x4f","\x00"),
	HX_HCSTRING("integer","\xbe","\xbd","\x1b","\x17"),
	HX_HCSTRING("number","\xc9","\x86","\x7a","\xa1"),
	HX_HCSTRING("octal","\xcb","\xdd","\x42","\x2b"),
	HX_HCSTRING("percent","\xc5","\xaa","\xda","\x78"),
	HX_HCSTRING("permille","\x0c","\xde","\x1f","\x0b"),
	HX_HCSTRING("printf","\x99","\xcf","\x61","\xb1"),
	HX_HCSTRING("toBase","\x2c","\x53","\xca","\x76"),
	HX_HCSTRING("unit","\x84","\xca","\xa9","\x4d"),
	HX_HCSTRING("numberFormat","\xe0","\x46","\xa0","\x0d"),
	::String(null())
};

void BigIntFormat_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.format.BigIntFormat","\x73","\x9f","\x41","\xc5");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &BigIntFormat_obj::__GetStatic;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = BigIntFormat_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(BigIntFormat_obj_sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< BigIntFormat_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = BigIntFormat_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = BigIntFormat_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = BigIntFormat_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx
} // end namespace format