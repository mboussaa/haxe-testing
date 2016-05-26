// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_math_random_PseudoRandom
#define INCLUDED_thx_math_random_PseudoRandom

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS3(thx,math,random,PseudoRandom)

namespace thx{
namespace math{
namespace random{


class HXCPP_CLASS_ATTRIBUTES PseudoRandom_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef PseudoRandom_obj OBJ_;
		PseudoRandom_obj();

	public:
		void __construct(hx::Null< Int >  __o_seed);
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="thx.math.random.PseudoRandom")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"thx.math.random.PseudoRandom"); }
		static hx::ObjectPtr< PseudoRandom_obj > __new(hx::Null< Int >  __o_seed);
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~PseudoRandom_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		hx::Val __SetField(const ::String &inString,const hx::Val &inValue, hx::PropertyAccess inCallProp);
		void __GetFields(Array< ::String> &outFields);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("PseudoRandom","\x41","\x60","\x19","\x01"); }

		Int seed;
		Int _hx_int();
		::Dynamic _hx_int_dyn();

		Float _hx_float();
		::Dynamic _hx_float_dyn();

};

} // end namespace thx
} // end namespace math
} // end namespace random

#endif /* INCLUDED_thx_math_random_PseudoRandom */ 
