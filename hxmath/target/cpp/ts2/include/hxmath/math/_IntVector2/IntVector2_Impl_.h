// Generated by Haxe 3.3.0
#ifndef INCLUDED_hxmath_math__IntVector2_IntVector2_Impl_
#define INCLUDED_hxmath_math__IntVector2_IntVector2_Impl_

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS2(hxmath,math,IntVector2Default)
HX_DECLARE_CLASS2(hxmath,math,Vector2Default)
HX_DECLARE_CLASS3(hxmath,math,_IntVector2,IntVector2_Impl_)

namespace hxmath{
namespace math{
namespace _IntVector2{


class HXCPP_CLASS_ATTRIBUTES IntVector2_Impl__obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef IntVector2_Impl__obj OBJ_;
		IntVector2_Impl__obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="hxmath.math._IntVector2.IntVector2_Impl_")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"hxmath.math._IntVector2.IntVector2_Impl_"); }
		static hx::ObjectPtr< IntVector2_Impl__obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~IntVector2_Impl__obj();

		HX_DO_RTTI_ALL;
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("IntVector2_Impl_","\xa0","\x21","\x34","\xb9"); }

		static void __boot();
		static Int elementCount;
		static  ::hxmath::math::IntVector2Default _new(Int x,Int y);
		static ::Dynamic _new_dyn();

		static  ::hxmath::math::IntVector2Default fromArray(::Array< Int > rawData);
		static ::Dynamic fromArray_dyn();

		static  ::hxmath::math::Vector2Default toVector2( ::hxmath::math::IntVector2Default this1);
		static ::Dynamic toVector2_dyn();

		static Int dot( ::hxmath::math::IntVector2Default a, ::hxmath::math::IntVector2Default b);
		static ::Dynamic dot_dyn();

		static  ::hxmath::math::IntVector2Default multiply( ::hxmath::math::IntVector2Default a,Int s);
		static ::Dynamic multiply_dyn();

		static  ::hxmath::math::IntVector2Default add( ::hxmath::math::IntVector2Default a, ::hxmath::math::IntVector2Default b);
		static ::Dynamic add_dyn();

		static  ::hxmath::math::IntVector2Default subtract( ::hxmath::math::IntVector2Default a, ::hxmath::math::IntVector2Default b);
		static ::Dynamic subtract_dyn();

		static  ::hxmath::math::IntVector2Default negate( ::hxmath::math::IntVector2Default a);
		static ::Dynamic negate_dyn();

		static Bool equals( ::hxmath::math::IntVector2Default a, ::hxmath::math::IntVector2Default b);
		static ::Dynamic equals_dyn();

		static  ::hxmath::math::IntVector2Default max( ::hxmath::math::IntVector2Default a, ::hxmath::math::IntVector2Default b);
		static ::Dynamic max_dyn();

		static  ::hxmath::math::IntVector2Default min( ::hxmath::math::IntVector2Default a, ::hxmath::math::IntVector2Default b);
		static ::Dynamic min_dyn();

		static  ::hxmath::math::IntVector2Default set( ::hxmath::math::IntVector2Default this1,Int x,Int y);
		static ::Dynamic set_dyn();

		static  ::hxmath::math::IntVector2Default multiplyWith( ::hxmath::math::IntVector2Default this1,Int s);
		static ::Dynamic multiplyWith_dyn();

		static  ::hxmath::math::IntVector2Default addWith( ::hxmath::math::IntVector2Default this1, ::hxmath::math::IntVector2Default a);
		static ::Dynamic addWith_dyn();

		static  ::hxmath::math::IntVector2Default subtractWith( ::hxmath::math::IntVector2Default this1, ::hxmath::math::IntVector2Default a);
		static ::Dynamic subtractWith_dyn();

		static  ::hxmath::math::IntVector2Default maxWith( ::hxmath::math::IntVector2Default this1, ::hxmath::math::IntVector2Default a);
		static ::Dynamic maxWith_dyn();

		static  ::hxmath::math::IntVector2Default minWith( ::hxmath::math::IntVector2Default this1, ::hxmath::math::IntVector2Default a);
		static ::Dynamic minWith_dyn();

		static void copyTo( ::hxmath::math::IntVector2Default this1, ::hxmath::math::IntVector2Default target);
		static ::Dynamic copyTo_dyn();

		static  ::hxmath::math::IntVector2Default clone( ::hxmath::math::IntVector2Default this1);
		static ::Dynamic clone_dyn();

		static Int getArrayElement( ::hxmath::math::IntVector2Default this1,Int i);
		static ::Dynamic getArrayElement_dyn();

		static Int setArrayElement( ::hxmath::math::IntVector2Default this1,Int i,Int value);
		static ::Dynamic setArrayElement_dyn();

		static  ::hxmath::math::IntVector2Default applyNegate( ::hxmath::math::IntVector2Default this1);
		static ::Dynamic applyNegate_dyn();

		static  ::hxmath::math::IntVector2Default applyScalarFunc( ::hxmath::math::IntVector2Default this1, ::Dynamic func);
		static ::Dynamic applyScalarFunc_dyn();

		static  ::hxmath::math::IntVector2Default rotateLeft( ::hxmath::math::IntVector2Default this1);
		static ::Dynamic rotateLeft_dyn();

		static  ::hxmath::math::IntVector2Default rotateRight( ::hxmath::math::IntVector2Default this1);
		static ::Dynamic rotateRight_dyn();

		static  ::hxmath::math::IntVector2Default get_zero();
		static ::Dynamic get_zero_dyn();

		static  ::hxmath::math::IntVector2Default get_xAxis();
		static ::Dynamic get_xAxis_dyn();

		static  ::hxmath::math::IntVector2Default get_yAxis();
		static ::Dynamic get_yAxis_dyn();

		static Int get_lengthSq( ::hxmath::math::IntVector2Default this1);
		static ::Dynamic get_lengthSq_dyn();

		static  ::hxmath::math::IntVector2Default get_rotatedLeft( ::hxmath::math::IntVector2Default this1);
		static ::Dynamic get_rotatedLeft_dyn();

		static  ::hxmath::math::IntVector2Default get_rotatedRight( ::hxmath::math::IntVector2Default this1);
		static ::Dynamic get_rotatedRight_dyn();

};

} // end namespace hxmath
} // end namespace math
} // end namespace _IntVector2

#endif /* INCLUDED_hxmath_math__IntVector2_IntVector2_Impl_ */ 
