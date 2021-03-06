// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_Ints
#define INCLUDED_thx_Ints

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS0(EReg)
HX_DECLARE_CLASS1(thx,Ints)
HX_DECLARE_CLASS1(thx,OrderingImpl)

namespace thx{


class HXCPP_CLASS_ATTRIBUTES Ints_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef Ints_obj OBJ_;
		Ints_obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="thx.Ints")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"thx.Ints"); }
		static hx::ObjectPtr< Ints_obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~Ints_obj();

		HX_DO_RTTI_ALL;
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		static bool __SetStatic(const ::String &inString, Dynamic &ioValue, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("Ints","\xc4","\x70","\x94","\x30"); }

		static void __boot();
		static  ::EReg pattern_parse;
		static Int abs(Int v);
		static ::Dynamic abs_dyn();

		static Bool canParse(::String s);
		static ::Dynamic canParse_dyn();

		static Int clamp(Int v,Int min,Int max);
		static ::Dynamic clamp_dyn();

		static Int clampSym(Int v,Int max);
		static ::Dynamic clampSym_dyn();

		static Int compare(Int a,Int b);
		static ::Dynamic compare_dyn();

		static Int gcd(Int m,Int n);
		static ::Dynamic gcd_dyn();

		static Int interpolate(Float f,Float a,Float b);
		static ::Dynamic interpolate_dyn();

		static Bool isEven(Int v);
		static ::Dynamic isEven_dyn();

		static Bool isOdd(Int v);
		static ::Dynamic isOdd_dyn();

		static ::String lpad(Int v,::String pad,Int len);
		static ::Dynamic lpad_dyn();

		static Int lcm(Int m,Int n);
		static ::Dynamic lcm_dyn();

		static ::String rpad(Int v,::String pad,Int len);
		static ::Dynamic rpad_dyn();

		static Int max(Int a,Int b);
		static ::Dynamic max_dyn();

		static Int min(Int a,Int b);
		static ::Dynamic min_dyn();

		static  ::Dynamic parse(::String s, ::Dynamic base);
		static ::Dynamic parse_dyn();

		static Int random(hx::Null< Int >  min,Int max);
		static ::Dynamic random_dyn();

		static ::Array< Int > range(Int start, ::Dynamic stop,hx::Null< Int >  step);
		static ::Dynamic range_dyn();

		static  ::Dynamic rangeIter(Int start, ::Dynamic stop,hx::Null< Int >  step);
		static ::Dynamic rangeIter_dyn();

		static ::String BASE;
		static ::String toString(Int value,Int base);
		static ::Dynamic toString_dyn();

		static ::String toBase(Int value,Int base);
		static ::Dynamic toBase_dyn();

		static Bool toBool(Int v);
		static ::Dynamic toBool_dyn();

		static Int toInt(::String s, ::Dynamic base);
		static ::Dynamic toInt_dyn();

		static Int sign(Int value);
		static ::Dynamic sign_dyn();

		static Int wrapCircular(Int v,Int max);
		static ::Dynamic wrapCircular_dyn();

		static  ::Dynamic order;
		static  ::Dynamic &order_dyn() { return order;}
		static  ::Dynamic monoid;
};

} // end namespace thx

#endif /* INCLUDED_thx_Ints */ 
