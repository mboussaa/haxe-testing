// Generated by Haxe 3.3.0
#ifndef INCLUDED_hxmath_math_Vector3Default
#define INCLUDED_hxmath_math_Vector3Default

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS2(hxmath,math,Vector3Default)

namespace hxmath{
namespace math{


class HXCPP_CLASS_ATTRIBUTES Vector3Default_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef Vector3Default_obj OBJ_;
		Vector3Default_obj();

	public:
		void __construct(Float x,Float y,Float z);
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="hxmath.math.Vector3Default")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"hxmath.math.Vector3Default"); }
		static hx::ObjectPtr< Vector3Default_obj > __new(Float x,Float y,Float z);
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~Vector3Default_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		hx::Val __SetField(const ::String &inString,const hx::Val &inValue, hx::PropertyAccess inCallProp);
		void __GetFields(Array< ::String> &outFields);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("Vector3Default","\xb1","\xfc","\xe7","\xda"); }

		Float x;
		Float y;
		Float z;
		virtual ::String toString();
		::Dynamic toString_dyn();

};

} // end namespace hxmath
} // end namespace math

#endif /* INCLUDED_hxmath_math_Vector3Default */ 
