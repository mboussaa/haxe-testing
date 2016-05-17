// Generated by Haxe 3.3.0
#ifndef INCLUDED_hxmath_math_Matrix3x3Default
#define INCLUDED_hxmath_math_Matrix3x3Default

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS2(hxmath,math,Matrix3x3Default)

namespace hxmath{
namespace math{


class HXCPP_CLASS_ATTRIBUTES Matrix3x3Default_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef Matrix3x3Default_obj OBJ_;
		Matrix3x3Default_obj();
		void __construct(Float m00,Float m10,Float m20,Float m01,Float m11,Float m21,Float m02,Float m12,Float m22);

	public:
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="hxmath.math.Matrix3x3Default")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		static hx::ObjectPtr< Matrix3x3Default_obj > __new(Float m00,Float m10,Float m20,Float m01,Float m11,Float m21,Float m02,Float m12,Float m22);
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~Matrix3x3Default_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		hx::Val __SetField(const ::String &inString,const hx::Val &inValue, hx::PropertyAccess inCallProp);
		void __GetFields(Array< ::String> &outFields);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("Matrix3x3Default","\x54","\xa4","\xfc","\x00"); }

		Float m00;
		Float m01;
		Float m02;
		Float m10;
		Float m11;
		Float m12;
		Float m20;
		Float m21;
		Float m22;
		virtual ::String toString();
		::Dynamic toString_dyn();

};

} // end namespace hxmath
} // end namespace math

#endif /* INCLUDED_hxmath_math_Matrix3x3Default */ 
