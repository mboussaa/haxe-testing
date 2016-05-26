// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_text_table_CellSet
#define INCLUDED_thx_text_table_CellSet

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS1(haxe,IMap)
HX_DECLARE_CLASS2(haxe,ds,IntMap)
HX_DECLARE_CLASS2(thx,text,Table)
HX_DECLARE_CLASS3(thx,text,table,Cell)
HX_DECLARE_CLASS3(thx,text,table,CellSet)
HX_DECLARE_CLASS3(thx,text,table,IStyle)

namespace thx{
namespace text{
namespace table{


class HXCPP_CLASS_ATTRIBUTES CellSet_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef CellSet_obj OBJ_;
		CellSet_obj();

	public:
		void __construct( ::thx::text::Table table,Int index);
		inline void *operator new(size_t inSize, bool inContainer=true,const char *inName="thx.text.table.CellSet")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,true,"thx.text.table.CellSet"); }
		static hx::ObjectPtr< CellSet_obj > __new( ::thx::text::Table table,Int index);
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~CellSet_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		hx::Val __SetField(const ::String &inString,const hx::Val &inValue, hx::PropertyAccess inCallProp);
		void __GetFields(Array< ::String> &outFields);
		static void __register();
		void __Mark(HX_MARK_PARAMS);
		void __Visit(HX_VISIT_PARAMS);
		::String __ToString() const { return HX_HCSTRING("CellSet","\x00","\x8b","\x12","\xbb"); }

		 ::haxe::ds::IntMap values;
		Int size;
		 ::thx::text::Table table;
		Int index;
		::Dynamic style;
		 ::thx::text::table::Cell get(Int index);
		::Dynamic get_dyn();

		 ::Dynamic iterator();
		::Dynamic iterator_dyn();

		void _set(Int index, ::thx::text::table::Cell cell);
		::Dynamic _set_dyn();

};

} // end namespace thx
} // end namespace text
} // end namespace table

#endif /* INCLUDED_thx_text_table_CellSet */ 
