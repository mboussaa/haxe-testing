// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_fp_CO2
#define INCLUDED_thx_fp_CO2

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS2(thx,fp,CO2)

namespace thx{
namespace fp{


class HXCPP_CLASS_ATTRIBUTES CO2_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef CO2_obj OBJ_;
		CO2_obj();

	public:
		void __construct(::String v);
		inline void *operator new(size_t inSize, bool inContainer=true,const char *inName="thx.fp.CO2")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,true,"thx.fp.CO2"); }
		static hx::ObjectPtr< CO2_obj > __new(::String v);
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~CO2_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		hx::Val __SetField(const ::String &inString,const hx::Val &inValue, hx::PropertyAccess inCallProp);
		void __GetFields(Array< ::String> &outFields);
		static void __register();
		void __Mark(HX_MARK_PARAMS);
		void __Visit(HX_VISIT_PARAMS);
		::String __ToString() const { return HX_HCSTRING("CO2","\x06","\x1c","\x33","\x00"); }

		::String v;
		Int compareTo( ::thx::fp::CO2 that);
		::Dynamic compareTo_dyn();

};

} // end namespace thx
} // end namespace fp

#endif /* INCLUDED_thx_fp_CO2 */ 