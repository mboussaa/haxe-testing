// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_text_table_BorderStyle
#define INCLUDED_thx_text_table_BorderStyle

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS3(thx,text,table,BorderStyle)
namespace thx{
namespace text{
namespace table{


class BorderStyle_obj : public hx::EnumBase_obj
{
	typedef hx::EnumBase_obj super;
		typedef BorderStyle_obj OBJ_;

	public:
		BorderStyle_obj() {};
		HX_DO_ENUM_RTTI;
		static void __boot();
		static void __register();
		static bool __GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp);
		::String GetEnumName( ) const { return HX_HCSTRING("thx.text.table.BorderStyle","\xce","\xfa","\xac","\x1d"); }
		::String __ToString() const { return HX_HCSTRING("BorderStyle.","\x09","\x6c","\x1e","\x3b") + _hx_tag; }

		static ::thx::text::table::BorderStyle Double;
		static inline ::thx::text::table::BorderStyle Double_dyn() { return Double; }
		static ::thx::text::table::BorderStyle None;
		static inline ::thx::text::table::BorderStyle None_dyn() { return None; }
		static ::thx::text::table::BorderStyle Normal;
		static inline ::thx::text::table::BorderStyle Normal_dyn() { return Normal; }
};

} // end namespace thx
} // end namespace text
} // end namespace table

#endif /* INCLUDED_thx_text_table_BorderStyle */ 