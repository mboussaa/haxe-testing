// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_text_table_DefaultStyle
#define INCLUDED_thx_text_table_DefaultStyle

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

#ifndef INCLUDED_thx_text_table_IStyle
#include <thx/text/table/IStyle.h>
#endif
#include <cpp/Int64.h>
HX_DECLARE_CLASS2(thx,culture,Culture)
HX_DECLARE_CLASS3(thx,text,table,CellType)
HX_DECLARE_CLASS3(thx,text,table,CellValueImpl)
HX_DECLARE_CLASS3(thx,text,table,DefaultStyle)
HX_DECLARE_CLASS3(thx,text,table,HAlign)
HX_DECLARE_CLASS3(thx,text,table,IStyle)
HX_DECLARE_CLASS3(thx,text,table,StringBlock)

namespace thx{
namespace text{
namespace table{


class HXCPP_CLASS_ATTRIBUTES DefaultStyle_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef DefaultStyle_obj OBJ_;
		DefaultStyle_obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="thx.text.table.DefaultStyle")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"thx.text.table.DefaultStyle"); }
		static hx::ObjectPtr< DefaultStyle_obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~DefaultStyle_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		hx::Val __SetField(const ::String &inString,const hx::Val &inValue, hx::PropertyAccess inCallProp);
		static bool __SetStatic(const ::String &inString, Dynamic &ioValue, hx::PropertyAccess inCallProp);
		void __GetFields(Array< ::String> &outFields);
		static void __register();
		void *_hx_getInterface(int inHash);
		::String __ToString() const { return HX_HCSTRING("DefaultStyle","\xd0","\x2c","\x8b","\x01"); }

		static void __boot();
		static  ::thx::text::table::DefaultStyle instance;
		static ::hx::EnumBase defaultType;
		static  ::Dynamic defaultMaxHeight;
		static Int defaultMinHeight;
		static  ::Dynamic defaultMaxWidth;
		static Int defaultMinWidth;
		static  ::thx::culture::Culture defaultCulture;
		static ::Dynamic defaultIntFormatter;
		static inline ::Dynamic &defaultIntFormatter_dyn() {return defaultIntFormatter; }

		static ::Dynamic defaultFloatFormatter;
		static inline ::Dynamic &defaultFloatFormatter_dyn() {return defaultFloatFormatter; }

		static ::Dynamic defaultStringFormatter;
		static inline ::Dynamic &defaultStringFormatter_dyn() {return defaultStringFormatter; }

		static ::Dynamic defaultBoolFormatter;
		static inline ::Dynamic &defaultBoolFormatter_dyn() {return defaultBoolFormatter; }

		static ::Dynamic defaultDateTimeFormatter;
		static inline ::Dynamic &defaultDateTimeFormatter_dyn() {return defaultDateTimeFormatter; }

		static ::Dynamic defaultTimeFormatter;
		static inline ::Dynamic &defaultTimeFormatter_dyn() {return defaultTimeFormatter; }

		static ::Dynamic defaultNAFormatter;
		static inline ::Dynamic &defaultNAFormatter_dyn() {return defaultNAFormatter; }

		static ::Dynamic defaultEmptyFormatter;
		static inline ::Dynamic &defaultEmptyFormatter_dyn() {return defaultEmptyFormatter; }

		static ::Dynamic defaultFormatter;
		static inline ::Dynamic &defaultFormatter_dyn() {return defaultFormatter; }

		static ::Dynamic defaultAligner;
		static inline ::Dynamic &defaultAligner_dyn() {return defaultAligner; }

		void setAlign(::hx::EnumBase align);
		::Dynamic setAlign_dyn();

		::hx::EnumBase get_type();
		::Dynamic get_type_dyn();

		::hx::EnumBase set_type(::hx::EnumBase value);
		::Dynamic set_type_dyn();

		 ::Dynamic get_maxHeight();
		::Dynamic get_maxHeight_dyn();

		 ::Dynamic set_maxHeight( ::Dynamic value);
		::Dynamic set_maxHeight_dyn();

		Int get_minHeight();
		::Dynamic get_minHeight_dyn();

		Int set_minHeight(Int value);
		::Dynamic set_minHeight_dyn();

		 ::Dynamic get_maxWidth();
		::Dynamic get_maxWidth_dyn();

		 ::Dynamic set_maxWidth( ::Dynamic value);
		::Dynamic set_maxWidth_dyn();

		Int get_minWidth();
		::Dynamic get_minWidth_dyn();

		Int set_minWidth(Int value);
		::Dynamic set_minWidth_dyn();

		 ::Dynamic get_formatter();
		::Dynamic get_formatter_dyn();

		 ::Dynamic set_formatter( ::Dynamic value);
		::Dynamic set_formatter_dyn();

		 ::Dynamic get_aligner();
		::Dynamic get_aligner_dyn();

		 ::Dynamic set_aligner( ::Dynamic value);
		::Dynamic set_aligner_dyn();

};

} // end namespace thx
} // end namespace text
} // end namespace table

#endif /* INCLUDED_thx_text_table_DefaultStyle */ 
