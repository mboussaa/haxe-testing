// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_fp_FloatList
#define INCLUDED_thx_fp_FloatList

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS2(thx,fp,FloatList)
HX_DECLARE_CLASS2(thx,fp,ListImpl)

namespace thx{
namespace fp{


class HXCPP_CLASS_ATTRIBUTES FloatList_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef FloatList_obj OBJ_;
		FloatList_obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="thx.fp.FloatList")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"thx.fp.FloatList"); }
		static hx::ObjectPtr< FloatList_obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~FloatList_obj();

		HX_DO_RTTI_ALL;
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("FloatList","\xfa","\xeb","\xbe","\x9c"); }

		static ::String toString(::hx::EnumBase l);
		static ::Dynamic toString_dyn();

};

} // end namespace thx
} // end namespace fp

#endif /* INCLUDED_thx_fp_FloatList */ 