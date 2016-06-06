// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_fp_FloatMap
#define INCLUDED_thx_fp_FloatMap

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS2(haxe,ds,Option)
HX_DECLARE_CLASS2(thx,fp,FloatMap)
HX_DECLARE_CLASS2(thx,fp,MapImpl)

namespace thx{
namespace fp{


class HXCPP_CLASS_ATTRIBUTES FloatMap_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef FloatMap_obj OBJ_;
		FloatMap_obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="thx.fp.FloatMap")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"thx.fp.FloatMap"); }
		static hx::ObjectPtr< FloatMap_obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~FloatMap_obj();

		HX_DO_RTTI_ALL;
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("FloatMap","\x80","\x22","\x3c","\xb7"); }

		static Bool exists(::hx::EnumBase map,Float key);
		static ::Dynamic exists_dyn();

		static ::hx::EnumBase get(::hx::EnumBase map,Float key);
		static ::Dynamic get_dyn();

		static  ::Dynamic getAlt(::hx::EnumBase map,Float key, ::Dynamic alt);
		static ::Dynamic getAlt_dyn();

		static ::hx::EnumBase set(::hx::EnumBase map,Float key, ::Dynamic value);
		static ::Dynamic set_dyn();

		static ::hx::EnumBase remove(::hx::EnumBase map,Float key);
		static ::Dynamic remove_dyn();

		static ::hx::EnumBase merge(::hx::EnumBase a,::hx::EnumBase b);
		static ::Dynamic merge_dyn();

};

} // end namespace thx
} // end namespace fp

#endif /* INCLUDED_thx_fp_FloatMap */ 