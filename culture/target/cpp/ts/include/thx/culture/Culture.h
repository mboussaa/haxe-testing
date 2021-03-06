// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_culture_Culture
#define INCLUDED_thx_culture_Culture

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS1(haxe,IMap)
HX_DECLARE_CLASS2(haxe,ds,StringMap)
HX_DECLARE_CLASS2(thx,culture,Culture)
HX_DECLARE_CLASS2(thx,culture,DateFormatInfo)
HX_DECLARE_CLASS2(thx,culture,NumberFormatInfo)

namespace thx{
namespace culture{


class HXCPP_CLASS_ATTRIBUTES Culture_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef Culture_obj OBJ_;
		Culture_obj();

	public:
		void __construct(::String code, ::thx::culture::DateFormatInfo dateTime,::String ietf,Bool isNeutral,::String iso2,::String iso3,Bool isRightToLeft,Int lcid,::String nameCalendar,::String nameEnglish,::String nameNative,::String nameRegionEnglish,::String nameRegionNative, ::thx::culture::NumberFormatInfo number,::String separatorList,::String win3);
		inline void *operator new(size_t inSize, bool inContainer=true,const char *inName="thx.culture.Culture")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,true,"thx.culture.Culture"); }
		static hx::ObjectPtr< Culture_obj > __new(::String code, ::thx::culture::DateFormatInfo dateTime,::String ietf,Bool isNeutral,::String iso2,::String iso3,Bool isRightToLeft,Int lcid,::String nameCalendar,::String nameEnglish,::String nameNative,::String nameRegionEnglish,::String nameRegionNative, ::thx::culture::NumberFormatInfo number,::String separatorList,::String win3);
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~Culture_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		hx::Val __SetField(const ::String &inString,const hx::Val &inValue, hx::PropertyAccess inCallProp);
		static bool __SetStatic(const ::String &inString, Dynamic &ioValue, hx::PropertyAccess inCallProp);
		void __GetFields(Array< ::String> &outFields);
		static void __register();
		void __Mark(HX_MARK_PARAMS);
		void __Visit(HX_VISIT_PARAMS);
		static void __init__();

		::String __ToString() const { return HX_HCSTRING("Culture","\xce","\xdd","\x2b","\x26"); }

		static void __boot();
		static  ::thx::culture::Culture invariant;
		static  ::thx::culture::Culture fromObject( ::Dynamic o);
		static ::Dynamic fromObject_dyn();

		static  ::haxe::ds::StringMap cultures;
		static ::Array< ::Dynamic> list;
		static  ::thx::culture::Culture _hx_register( ::thx::culture::Culture culture);
		static ::Dynamic _hx_register_dyn();

		static  ::thx::culture::Culture getByCode(::String code);
		static ::Dynamic getByCode_dyn();

		static  ::thx::culture::Culture getByIso2(::String iso2);
		static ::Dynamic getByIso2_dyn();

		static  ::thx::culture::Culture getByIso3(::String iso3);
		static ::Dynamic getByIso3_dyn();

		static  ::Dynamic iterator();
		static ::Dynamic iterator_dyn();

		static ::String getCodeKey(::String key);
		static ::Dynamic getCodeKey_dyn();

		static ::String getIso2Key(::String key);
		static ::Dynamic getIso2Key_dyn();

		static ::String getIso3Key(::String key);
		static ::Dynamic getIso3Key_dyn();

		::String code;
		 ::thx::culture::DateFormatInfo dateTime;
		::String ietf;
		Bool isNeutral;
		::String iso2;
		::String iso3;
		Bool isRightToLeft;
		Int lcid;
		::String nameCalendar;
		::String nameDisplayEnglish;
		::String nameDisplayNative;
		::String nameEnglish;
		::String nameNative;
		::String nameRegionEnglish;
		::String nameRegionNative;
		 ::thx::culture::NumberFormatInfo number;
		::String separatorList;
		::String win3;
		 ::Dynamic toObject();
		::Dynamic toObject_dyn();

		::String get_nameDisplayEnglish();
		::Dynamic get_nameDisplayEnglish_dyn();

		::String get_nameDisplayNative();
		::Dynamic get_nameDisplayNative_dyn();

		virtual ::String toString();
		::Dynamic toString_dyn();

};

} // end namespace thx
} // end namespace culture

#endif /* INCLUDED_thx_culture_Culture */ 
