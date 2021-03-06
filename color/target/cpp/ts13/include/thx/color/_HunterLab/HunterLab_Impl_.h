// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_color__HunterLab_HunterLab_Impl_
#define INCLUDED_thx_color__HunterLab_HunterLab_Impl_

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS3(thx,color,_HunterLab,HunterLab_Impl_)

namespace thx{
namespace color{
namespace _HunterLab{


class HXCPP_CLASS_ATTRIBUTES HunterLab_Impl__obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef HunterLab_Impl__obj OBJ_;
		HunterLab_Impl__obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="thx.color._HunterLab.HunterLab_Impl_")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"thx.color._HunterLab.HunterLab_Impl_"); }
		static hx::ObjectPtr< HunterLab_Impl__obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~HunterLab_Impl__obj();

		HX_DO_RTTI_ALL;
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("HunterLab_Impl_","\xad","\x70","\xe2","\x9f"); }

		static ::Array< Float > create(Float l,Float a,Float b);
		static ::Dynamic create_dyn();

		static ::Array< Float > fromFloats(::Array< Float > arr);
		static ::Dynamic fromFloats_dyn();

		static ::Array< Float > fromString(::String color);
		static ::Dynamic fromString_dyn();

		static ::Array< Float > _new(::Array< Float > channels);
		static ::Dynamic _new_dyn();

		static Float distance(::Array< Float > this1,::Array< Float > other);
		static ::Dynamic distance_dyn();

		static ::Array< Float > interpolate(::Array< Float > this1,::Array< Float > other,Float t);
		static ::Dynamic interpolate_dyn();

		static ::Array< Float > match(::Array< Float > this1, ::Dynamic palette);
		static ::Dynamic match_dyn();

		static ::Array< Float > min(::Array< Float > this1,::Array< Float > other);
		static ::Dynamic min_dyn();

		static ::Array< Float > max(::Array< Float > this1,::Array< Float > other);
		static ::Dynamic max_dyn();

		static ::Array< Float > roundTo(::Array< Float > this1,Int decimals);
		static ::Dynamic roundTo_dyn();

		static Bool equals(::Array< Float > this1,::Array< Float > other);
		static ::Dynamic equals_dyn();

		static Bool nearEquals(::Array< Float > this1,::Array< Float > other, ::Dynamic tolerance);
		static ::Dynamic nearEquals_dyn();

		static ::Array< Float > withL(::Array< Float > this1,Float newl);
		static ::Dynamic withL_dyn();

		static ::Array< Float > withA(::Array< Float > this1,Float newa);
		static ::Dynamic withA_dyn();

		static ::Array< Float > withB(::Array< Float > this1,Float newb);
		static ::Dynamic withB_dyn();

		static ::String toString(::Array< Float > this1);
		static ::Dynamic toString_dyn();

		static ::Array< Float > toLab(::Array< Float > this1);
		static ::Dynamic toLab_dyn();

		static ::Array< Float > toLCh(::Array< Float > this1);
		static ::Dynamic toLCh_dyn();

		static ::Array< Float > toLuv(::Array< Float > this1);
		static ::Dynamic toLuv_dyn();

		static ::Array< Float > toCmy(::Array< Float > this1);
		static ::Dynamic toCmy_dyn();

		static ::Array< Float > toCmyk(::Array< Float > this1);
		static ::Dynamic toCmyk_dyn();

		static ::Array< Float > toCubeHelix(::Array< Float > this1);
		static ::Dynamic toCubeHelix_dyn();

		static Float toGrey(::Array< Float > this1);
		static ::Dynamic toGrey_dyn();

		static ::Array< Float > toHsl(::Array< Float > this1);
		static ::Dynamic toHsl_dyn();

		static ::Array< Float > toHsv(::Array< Float > this1);
		static ::Dynamic toHsv_dyn();

		static Int toRgb(::Array< Float > this1);
		static ::Dynamic toRgb_dyn();

		static Int toRgba(::Array< Float > this1);
		static ::Dynamic toRgba_dyn();

		static ::Array< Float > toRgbx(::Array< Float > this1);
		static ::Dynamic toRgbx_dyn();

		static ::Array< Float > toRgbxa(::Array< Float > this1);
		static ::Dynamic toRgbxa_dyn();

		static Float toTemperature(::Array< Float > this1);
		static ::Dynamic toTemperature_dyn();

		static ::Array< Float > toXyz(::Array< Float > this1);
		static ::Dynamic toXyz_dyn();

		static ::Array< Float > toYuv(::Array< Float > this1);
		static ::Dynamic toYuv_dyn();

		static ::Array< Float > toYxy(::Array< Float > this1);
		static ::Dynamic toYxy_dyn();

		static Float get_l(::Array< Float > this1);
		static ::Dynamic get_l_dyn();

		static Float get_a(::Array< Float > this1);
		static ::Dynamic get_a_dyn();

		static Float get_b(::Array< Float > this1);
		static ::Dynamic get_b_dyn();

};

} // end namespace thx
} // end namespace color
} // end namespace _HunterLab

#endif /* INCLUDED_thx_color__HunterLab_HunterLab_Impl_ */ 
