// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_fp_IntSet
#define INCLUDED_thx_fp_IntSet

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS2(thx,fp,IntSet)
HX_DECLARE_CLASS2(thx,fp,SetImpl)

namespace thx{
namespace fp{


class HXCPP_CLASS_ATTRIBUTES IntSet_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef IntSet_obj OBJ_;
		IntSet_obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="thx.fp.IntSet")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"thx.fp.IntSet"); }
		static hx::ObjectPtr< IntSet_obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~IntSet_obj();

		HX_DO_RTTI_ALL;
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("IntSet","\x13","\x3a","\x0d","\xd3"); }

		static Bool exists(::hx::EnumBase set,Int value);
		static ::Dynamic exists_dyn();

		static ::hx::EnumBase set(::hx::EnumBase set,Int value);
		static ::Dynamic set_dyn();

};

} // end namespace thx
} // end namespace fp

#endif /* INCLUDED_thx_fp_IntSet */ 
