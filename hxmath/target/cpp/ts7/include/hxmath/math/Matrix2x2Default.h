// Generated by Haxe 3.3.0
#ifndef INCLUDED_hxmath_math_Matrix2x2Default
#define INCLUDED_hxmath_math_Matrix2x2Default

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS2(hxmath,math,Matrix2x2Default)

namespace hxmath{
namespace math{


class HXCPP_CLASS_ATTRIBUTES Matrix2x2Default_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef Matrix2x2Default_obj OBJ_;
		Matrix2x2Default_obj();

	public:
		void __construct(Float a,Float b,Float c,Float d);
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="hxmath.math.Matrix2x2Default")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"hxmath.math.Matrix2x2Default"); }
		static hx::ObjectPtr< Matrix2x2Default_obj > __new(Float a,Float b,Float c,Float d);
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~Matrix2x2Default_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		hx::Val __SetField(const ::String &inString,const hx::Val &inValue, hx::PropertyAccess inCallProp);
		void __GetFields(Array< ::String> &outFields);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("Matrix2x2Default","\x56","\xba","\x7f","\x07"); }

		Float a;
		Float b;
		Float c;
		Float d;
		virtual ::String toString();
		::Dynamic toString_dyn();

};

} // end namespace hxmath
} // end namespace math

#endif /* INCLUDED_hxmath_math_Matrix2x2Default */ 
