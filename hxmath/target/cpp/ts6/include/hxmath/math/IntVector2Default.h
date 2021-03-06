// Generated by Haxe 3.3.0
#ifndef INCLUDED_hxmath_math_IntVector2Default
#define INCLUDED_hxmath_math_IntVector2Default

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS2(hxmath,math,IntVector2Default)

namespace hxmath{
namespace math{


class HXCPP_CLASS_ATTRIBUTES IntVector2Default_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef IntVector2Default_obj OBJ_;
		IntVector2Default_obj();

	public:
		void __construct(Int x,Int y);
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="hxmath.math.IntVector2Default")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"hxmath.math.IntVector2Default"); }
		static hx::ObjectPtr< IntVector2Default_obj > __new(Int x,Int y);
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~IntVector2Default_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		hx::Val __SetField(const ::String &inString,const hx::Val &inValue, hx::PropertyAccess inCallProp);
		void __GetFields(Array< ::String> &outFields);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("IntVector2Default","\xa1","\x7b","\xf2","\x11"); }

		Int x;
		Int y;
		virtual ::String toString();
		::Dynamic toString_dyn();

};

} // end namespace hxmath
} // end namespace math

#endif /* INCLUDED_hxmath_math_IntVector2Default */ 
