// Generated by Haxe 3.3.0
#ifndef INCLUDED_hxmath_math__Vector4_Vector4_Impl_
#define INCLUDED_hxmath_math__Vector4_Vector4_Impl_

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS2(hxmath,math,Vector4Default)
HX_DECLARE_CLASS3(hxmath,math,_Vector4,Vector4_Impl_)

namespace hxmath{
namespace math{
namespace _Vector4{


class HXCPP_CLASS_ATTRIBUTES Vector4_Impl__obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef Vector4_Impl__obj OBJ_;
		Vector4_Impl__obj();
		void __construct();

	public:
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="hxmath.math._Vector4.Vector4_Impl_")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		static hx::ObjectPtr< Vector4_Impl__obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~Vector4_Impl__obj();

		HX_DO_RTTI_ALL;
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("Vector4_Impl_","\x51","\xe9","\xfa","\x04"); }

		static void __boot();
		static Int elementCount;
		static  ::hxmath::math::Vector4Default _new(Float x,Float y,Float z,Float w);
		static ::Dynamic _new_dyn();

		static  ::hxmath::math::Vector4Default fromArray(::Array< Float > rawData);
		static ::Dynamic fromArray_dyn();

		static  ::hxmath::math::Vector4Default fromVector4Shape( ::Dynamic other);
		static ::Dynamic fromVector4Shape_dyn();

		static Float dot( ::hxmath::math::Vector4Default a, ::hxmath::math::Vector4Default b);
		static ::Dynamic dot_dyn();

		static  ::hxmath::math::Vector4Default multiply( ::hxmath::math::Vector4Default a,Float s);
		static ::Dynamic multiply_dyn();

		static  ::hxmath::math::Vector4Default divide( ::hxmath::math::Vector4Default a,Float s);
		static ::Dynamic divide_dyn();

		static  ::hxmath::math::Vector4Default add( ::hxmath::math::Vector4Default a, ::hxmath::math::Vector4Default b);
		static ::Dynamic add_dyn();

		static  ::hxmath::math::Vector4Default subtract( ::hxmath::math::Vector4Default a, ::hxmath::math::Vector4Default b);
		static ::Dynamic subtract_dyn();

		static  ::hxmath::math::Vector4Default negate( ::hxmath::math::Vector4Default a);
		static ::Dynamic negate_dyn();

		static Bool equals( ::hxmath::math::Vector4Default a, ::hxmath::math::Vector4Default b);
		static ::Dynamic equals_dyn();

		static  ::hxmath::math::Vector4Default lerp( ::hxmath::math::Vector4Default a, ::hxmath::math::Vector4Default b,Float t);
		static ::Dynamic lerp_dyn();

		static  ::hxmath::math::Vector4Default max( ::hxmath::math::Vector4Default a, ::hxmath::math::Vector4Default b);
		static ::Dynamic max_dyn();

		static  ::hxmath::math::Vector4Default min( ::hxmath::math::Vector4Default a, ::hxmath::math::Vector4Default b);
		static ::Dynamic min_dyn();

		static  ::hxmath::math::Vector4Default project( ::hxmath::math::Vector4Default a, ::hxmath::math::Vector4Default b);
		static ::Dynamic project_dyn();

		static  ::hxmath::math::Vector4Default set( ::hxmath::math::Vector4Default this1,Float x,Float y,Float z,Float w);
		static ::Dynamic set_dyn();

		static  ::hxmath::math::Vector4Default multiplyWith( ::hxmath::math::Vector4Default this1,Float s);
		static ::Dynamic multiplyWith_dyn();

		static  ::hxmath::math::Vector4Default divideWith( ::hxmath::math::Vector4Default this1,Float s);
		static ::Dynamic divideWith_dyn();

		static  ::hxmath::math::Vector4Default addWith( ::hxmath::math::Vector4Default this1, ::hxmath::math::Vector4Default a);
		static ::Dynamic addWith_dyn();

		static  ::hxmath::math::Vector4Default subtractWith( ::hxmath::math::Vector4Default this1, ::hxmath::math::Vector4Default a);
		static ::Dynamic subtractWith_dyn();

		static  ::hxmath::math::Vector4Default maxWith( ::hxmath::math::Vector4Default this1, ::hxmath::math::Vector4Default a);
		static ::Dynamic maxWith_dyn();

		static  ::hxmath::math::Vector4Default minWith( ::hxmath::math::Vector4Default this1, ::hxmath::math::Vector4Default a);
		static ::Dynamic minWith_dyn();

		static  ::hxmath::math::Vector4Default projectOnto( ::hxmath::math::Vector4Default this1, ::hxmath::math::Vector4Default a);
		static ::Dynamic projectOnto_dyn();

		static void copyTo( ::hxmath::math::Vector4Default this1, ::hxmath::math::Vector4Default target);
		static ::Dynamic copyTo_dyn();

		static void copyToShape( ::hxmath::math::Vector4Default this1, ::Dynamic target);
		static ::Dynamic copyToShape_dyn();

		static void copyFromShape( ::hxmath::math::Vector4Default this1, ::Dynamic source);
		static ::Dynamic copyFromShape_dyn();

		static  ::hxmath::math::Vector4Default clone( ::hxmath::math::Vector4Default this1);
		static ::Dynamic clone_dyn();

		static Float getArrayElement( ::hxmath::math::Vector4Default this1,Int i);
		static ::Dynamic getArrayElement_dyn();

		static Float setArrayElement( ::hxmath::math::Vector4Default this1,Int i,Float value);
		static ::Dynamic setArrayElement_dyn();

		static  ::hxmath::math::Vector4Default applyScalarFunc( ::hxmath::math::Vector4Default this1, ::Dynamic func);
		static ::Dynamic applyScalarFunc_dyn();

		static Float distanceTo( ::hxmath::math::Vector4Default this1, ::hxmath::math::Vector4Default b);
		static ::Dynamic distanceTo_dyn();

		static  ::hxmath::math::Vector4Default normalize( ::hxmath::math::Vector4Default this1);
		static ::Dynamic normalize_dyn();

		static  ::hxmath::math::Vector4Default normalizeTo( ::hxmath::math::Vector4Default this1,Float newLength);
		static ::Dynamic normalizeTo_dyn();

		static  ::hxmath::math::Vector4Default clamp( ::hxmath::math::Vector4Default this1,Float min,Float max);
		static ::Dynamic clamp_dyn();

		static Float get_length( ::hxmath::math::Vector4Default this1);
		static ::Dynamic get_length_dyn();

		static Float get_lengthSq( ::hxmath::math::Vector4Default this1);
		static ::Dynamic get_lengthSq_dyn();

		static  ::hxmath::math::Vector4Default get_zero();
		static ::Dynamic get_zero_dyn();

		static  ::hxmath::math::Vector4Default get_xAxis();
		static ::Dynamic get_xAxis_dyn();

		static  ::hxmath::math::Vector4Default get_yAxis();
		static ::Dynamic get_yAxis_dyn();

		static  ::hxmath::math::Vector4Default get_zAxis();
		static ::Dynamic get_zAxis_dyn();

		static  ::hxmath::math::Vector4Default get_wAxis();
		static ::Dynamic get_wAxis_dyn();

};

} // end namespace hxmath
} // end namespace math
} // end namespace _Vector4

#endif /* INCLUDED_hxmath_math__Vector4_Vector4_Impl_ */ 
