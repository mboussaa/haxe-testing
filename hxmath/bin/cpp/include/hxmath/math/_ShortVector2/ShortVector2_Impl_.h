// Generated by Haxe 3.3.0
#ifndef INCLUDED_hxmath_math__ShortVector2_ShortVector2_Impl_
#define INCLUDED_hxmath_math__ShortVector2_ShortVector2_Impl_

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS2(hxmath,math,Vector2Default)
HX_DECLARE_CLASS3(hxmath,math,_ShortVector2,ShortVector2_Impl_)

namespace hxmath{
namespace math{
namespace _ShortVector2{


class HXCPP_CLASS_ATTRIBUTES ShortVector2_Impl__obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef ShortVector2_Impl__obj OBJ_;
		ShortVector2_Impl__obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="hxmath.math._ShortVector2.ShortVector2_Impl_")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"hxmath.math._ShortVector2.ShortVector2_Impl_"); }
		static hx::ObjectPtr< ShortVector2_Impl__obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~ShortVector2_Impl__obj();

		HX_DO_RTTI_ALL;
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("ShortVector2_Impl_","\xf3","\x7d","\xbc","\xc7"); }

		static void __boot();
		static Int elementCount;
		static Int bitsPerField;
		static Int fieldMax;
		static Int _new(Int x,Int y);
		static ::Dynamic _new_dyn();

		static Int fromArray(::Array< Int > rawData);
		static ::Dynamic fromArray_dyn();

		static Int dot(Int a,Int b);
		static ::Dynamic dot_dyn();

		static Int multiply(Int a,Int s);
		static ::Dynamic multiply_dyn();

		static Int add(Int a,Int b);
		static ::Dynamic add_dyn();

		static Int subtract(Int a,Int b);
		static ::Dynamic subtract_dyn();

		static Int negate(Int a);
		static ::Dynamic negate_dyn();

		static Int max(Int a,Int b);
		static ::Dynamic max_dyn();

		static Int min(Int a,Int b);
		static ::Dynamic min_dyn();

		static Int getArrayElement(Int this1,Int i);
		static ::Dynamic getArrayElement_dyn();

		static  ::hxmath::math::Vector2Default toVector2(Int this1);
		static ::Dynamic toVector2_dyn();

		static Bool indexInBounds(Int x,Int y);
		static ::Dynamic indexInBounds_dyn();

		static Int get_zero();
		static ::Dynamic get_zero_dyn();

		static Int get_xAxis();
		static ::Dynamic get_xAxis_dyn();

		static Int get_yAxis();
		static ::Dynamic get_yAxis_dyn();

		static Int get_x(Int this1);
		static ::Dynamic get_x_dyn();

		static Int get_y(Int this1);
		static ::Dynamic get_y_dyn();

		static Int get_lengthSq(Int this1);
		static ::Dynamic get_lengthSq_dyn();

		static Int get_rotatedLeft(Int this1);
		static ::Dynamic get_rotatedLeft_dyn();

		static Int get_rotatedRight(Int this1);
		static ::Dynamic get_rotatedRight_dyn();

};

} // end namespace hxmath
} // end namespace math
} // end namespace _ShortVector2

#endif /* INCLUDED_hxmath_math__ShortVector2_ShortVector2_Impl_ */ 
