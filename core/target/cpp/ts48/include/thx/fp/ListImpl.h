// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_fp_ListImpl
#define INCLUDED_thx_fp_ListImpl

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS2(thx,fp,ListImpl)
namespace thx{
namespace fp{


class ListImpl_obj : public hx::EnumBase_obj
{
	typedef hx::EnumBase_obj super;
		typedef ListImpl_obj OBJ_;

	public:
		ListImpl_obj() {};
		HX_DO_ENUM_RTTI;
		static void __boot();
		static void __register();
		static bool __GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp);
		::String GetEnumName( ) const { return HX_HCSTRING("thx.fp.ListImpl","\x38","\xdf","\x03","\x7b"); }
		::String __ToString() const { return HX_HCSTRING("ListImpl.","\xf0","\x23","\x88","\x75") + _hx_tag; }

		static ::thx::fp::ListImpl Cons( ::Dynamic x,::hx::EnumBase xs);
		static ::Dynamic Cons_dyn();
		static ::thx::fp::ListImpl Nil;
		static inline ::thx::fp::ListImpl Nil_dyn() { return Nil; }
};

} // end namespace thx
} // end namespace fp

#endif /* INCLUDED_thx_fp_ListImpl */ 
