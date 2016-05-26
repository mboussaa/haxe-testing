// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_format_BigIntFormat
#define INCLUDED_thx_format_BigIntFormat

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS2(thx,bigint,BigIntImpl)
HX_DECLARE_CLASS2(thx,culture,Culture)
HX_DECLARE_CLASS2(thx,culture,NumberFormatInfo)
HX_DECLARE_CLASS2(thx,format,BigIntFormat)

namespace thx{
namespace format{


class HXCPP_CLASS_ATTRIBUTES BigIntFormat_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef BigIntFormat_obj OBJ_;
		BigIntFormat_obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="thx.format.BigIntFormat")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"thx.format.BigIntFormat"); }
		static hx::ObjectPtr< BigIntFormat_obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~BigIntFormat_obj();

		HX_DO_RTTI_ALL;
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("BigIntFormat","\xc6","\x48","\xeb","\xf0"); }

		static ::String binary(::Dynamic i, ::Dynamic significantDigits);
		static ::Dynamic binary_dyn();

		static ::String currency(::Dynamic i, ::Dynamic precision,::String symbol, ::thx::culture::Culture culture);
		static ::Dynamic currency_dyn();

		static ::String customFormat(::Dynamic i,::String pattern, ::thx::culture::Culture culture);
		static ::Dynamic customFormat_dyn();

		static ::String decimal(::Dynamic i, ::Dynamic significantDigits, ::thx::culture::Culture culture);
		static ::Dynamic decimal_dyn();

		static ::String exponential(::Dynamic i, ::Dynamic precision, ::Dynamic digits,::String symbol, ::thx::culture::Culture culture);
		static ::Dynamic exponential_dyn();

		static ::String fixed(::Dynamic i, ::Dynamic precision, ::thx::culture::Culture culture);
		static ::Dynamic fixed_dyn();

		static ::String format(::Dynamic i,::String pattern, ::thx::culture::Culture culture);
		static ::Dynamic format_dyn();

		static ::String general(::Dynamic i, ::Dynamic significantDigits, ::thx::culture::Culture culture);
		static ::Dynamic general_dyn();

		static ::String hex(::Dynamic i, ::Dynamic significantDigits, ::thx::culture::Culture culture);
		static ::Dynamic hex_dyn();

		static ::String integer(::Dynamic i, ::thx::culture::Culture culture);
		static ::Dynamic integer_dyn();

		static ::String number(::Dynamic i, ::Dynamic precision, ::thx::culture::Culture culture);
		static ::Dynamic number_dyn();

		static ::String octal(::Dynamic i, ::Dynamic significantDigits, ::thx::culture::Culture culture);
		static ::Dynamic octal_dyn();

		static ::String percent(::Dynamic i, ::Dynamic decimals, ::thx::culture::Culture culture);
		static ::Dynamic percent_dyn();

		static ::String permille(::Dynamic i, ::Dynamic decimals, ::thx::culture::Culture culture);
		static ::Dynamic permille_dyn();

		static ::String printf(::Dynamic i,::String pattern, ::thx::culture::Culture culture);
		static ::Dynamic printf_dyn();

		static ::String toBase(::Dynamic value,Int base, ::thx::culture::Culture culture);
		static ::Dynamic toBase_dyn();

		static ::String unit(::Dynamic i,Int decimals,::String unitSymbol, ::thx::culture::Culture culture);
		static ::Dynamic unit_dyn();

		static  ::thx::culture::NumberFormatInfo numberFormat( ::thx::culture::Culture culture);
		static ::Dynamic numberFormat_dyn();

};

} // end namespace thx
} // end namespace format

#endif /* INCLUDED_thx_format_BigIntFormat */ 
