// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_Either
#define INCLUDED_thx_Either

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS1(thx,Either)
namespace thx{


class Either_obj : public hx::EnumBase_obj
{
	typedef hx::EnumBase_obj super;
		typedef Either_obj OBJ_;

	public:
		Either_obj() {};
		HX_DO_ENUM_RTTI;
		static void __boot();
		static void __register();
		static bool __GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp);
		::String GetEnumName( ) const { return HX_HCSTRING("thx.Either","\x0f","\xa0","\x00","\x75"); }
		::String __ToString() const { return HX_HCSTRING("Either.","\x29","\x67","\x48","\x40") + _hx_tag; }

		static ::thx::Either Left( ::Dynamic value);
		static ::Dynamic Left_dyn();
		static ::thx::Either Right( ::Dynamic value);
		static ::Dynamic Right_dyn();
};

} // end namespace thx

#endif /* INCLUDED_thx_Either */ 