// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx__TestEnums_Sample
#define INCLUDED_thx__TestEnums_Sample

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS2(thx,_TestEnums,Sample)
namespace thx{
namespace _TestEnums{


class Sample_obj : public hx::EnumBase_obj
{
	typedef hx::EnumBase_obj super;
		typedef Sample_obj OBJ_;

	public:
		Sample_obj() {};
		HX_DO_ENUM_RTTI;
		static void __boot();
		static void __register();
		static bool __GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp);
		::String GetEnumName( ) const { return HX_HCSTRING("thx._TestEnums.Sample","\x6d","\x12","\xa8","\xd8"); }
		::String __ToString() const { return HX_HCSTRING("Sample.","\xa4","\xec","\x1a","\x51") + _hx_tag; }

		static ::thx::_TestEnums::Sample A;
		static inline ::thx::_TestEnums::Sample A_dyn() { return A; }
		static ::thx::_TestEnums::Sample B(Int v);
		static ::Dynamic B_dyn();
};

} // end namespace thx
} // end namespace _TestEnums

#endif /* INCLUDED_thx__TestEnums_Sample */ 
