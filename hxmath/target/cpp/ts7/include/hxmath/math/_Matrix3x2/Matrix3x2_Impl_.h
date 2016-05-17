// Generated by Haxe 3.3.0
#ifndef INCLUDED_hxmath_math__Matrix3x2_Matrix3x2_Impl_
#define INCLUDED_hxmath_math__Matrix3x2_Matrix3x2_Impl_

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS2(hxmath,math,Matrix2x2Default)
HX_DECLARE_CLASS2(hxmath,math,Matrix3x2Default)
HX_DECLARE_CLASS2(hxmath,math,Vector2Default)
HX_DECLARE_CLASS2(hxmath,math,Vector3Default)
HX_DECLARE_CLASS3(hxmath,math,_Matrix3x2,Matrix3x2_Impl_)

namespace hxmath{
namespace math{
namespace _Matrix3x2{


class HXCPP_CLASS_ATTRIBUTES Matrix3x2_Impl__obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef Matrix3x2_Impl__obj OBJ_;
		Matrix3x2_Impl__obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="hxmath.math._Matrix3x2.Matrix3x2_Impl_")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"hxmath.math._Matrix3x2.Matrix3x2_Impl_"); }
		static hx::ObjectPtr< Matrix3x2_Impl__obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~Matrix3x2_Impl__obj();

		HX_DO_RTTI_ALL;
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("Matrix3x2_Impl_","\x8c","\x59","\x6d","\xb5"); }

		static void __boot();
		static Int elementCount;
		static  ::hxmath::math::Matrix3x2Default _new(Float a,Float b,Float c,Float d,Float tx,Float ty);
		static ::Dynamic _new_dyn();

		static  ::hxmath::math::Matrix3x2Default fromArray(::Array< Float > rawData);
		static ::Dynamic fromArray_dyn();

		static  ::hxmath::math::Matrix3x2Default fromMatrix3x2Shape( ::hxmath::math::Matrix3x2Default other);
		static ::Dynamic fromMatrix3x2Shape_dyn();

		static  ::hxmath::math::Matrix3x2Default multiplyScalar(Float s, ::hxmath::math::Matrix3x2Default m);
		static ::Dynamic multiplyScalar_dyn();

		static  ::hxmath::math::Vector2Default transform( ::hxmath::math::Matrix3x2Default m, ::hxmath::math::Vector2Default v);
		static ::Dynamic transform_dyn();

		static  ::hxmath::math::Matrix3x2Default concat( ::hxmath::math::Matrix3x2Default m, ::hxmath::math::Matrix3x2Default n);
		static ::Dynamic concat_dyn();

		static  ::hxmath::math::Matrix3x2Default add( ::hxmath::math::Matrix3x2Default m, ::hxmath::math::Matrix3x2Default n);
		static ::Dynamic add_dyn();

		static  ::hxmath::math::Matrix3x2Default subtract( ::hxmath::math::Matrix3x2Default m, ::hxmath::math::Matrix3x2Default n);
		static ::Dynamic subtract_dyn();

		static  ::hxmath::math::Matrix3x2Default negate( ::hxmath::math::Matrix3x2Default m);
		static ::Dynamic negate_dyn();

		static Bool equals( ::hxmath::math::Matrix3x2Default m, ::hxmath::math::Matrix3x2Default n);
		static ::Dynamic equals_dyn();

		static  ::hxmath::math::Matrix3x2Default rotate(Float angle);
		static ::Dynamic rotate_dyn();

		static  ::hxmath::math::Matrix3x2Default translate( ::hxmath::math::Vector2Default v);
		static ::Dynamic translate_dyn();

		static  ::hxmath::math::Matrix3x2Default orbit( ::hxmath::math::Vector2Default center,Float angle);
		static ::Dynamic orbit_dyn();

		static void copyTo( ::hxmath::math::Matrix3x2Default this1, ::hxmath::math::Matrix3x2Default target);
		static ::Dynamic copyTo_dyn();

		static void copyToShape( ::hxmath::math::Matrix3x2Default this1, ::Dynamic target);
		static ::Dynamic copyToShape_dyn();

		static void copyFromShape( ::hxmath::math::Matrix3x2Default this1, ::Dynamic source);
		static ::Dynamic copyFromShape_dyn();

		static  ::hxmath::math::Matrix3x2Default setRotate( ::hxmath::math::Matrix3x2Default this1,Float angle);
		static ::Dynamic setRotate_dyn();

		static  ::hxmath::math::Matrix3x2Default setTranslate( ::hxmath::math::Matrix3x2Default this1,Float x,Float y);
		static ::Dynamic setTranslate_dyn();

		static  ::hxmath::math::Matrix3x2Default set( ::hxmath::math::Matrix3x2Default this1,Float a,Float b,Float c,Float d,Float tx,Float ty);
		static ::Dynamic set_dyn();

		static  ::hxmath::math::Matrix3x2Default addWith( ::hxmath::math::Matrix3x2Default this1, ::hxmath::math::Matrix3x2Default m);
		static ::Dynamic addWith_dyn();

		static  ::hxmath::math::Matrix3x2Default subtractWith( ::hxmath::math::Matrix3x2Default this1, ::hxmath::math::Matrix3x2Default m);
		static ::Dynamic subtractWith_dyn();

		static  ::hxmath::math::Matrix3x2Default clone( ::hxmath::math::Matrix3x2Default this1);
		static ::Dynamic clone_dyn();

		static Float getArrayElement( ::hxmath::math::Matrix3x2Default this1,Int i);
		static ::Dynamic getArrayElement_dyn();

		static Float setArrayElement( ::hxmath::math::Matrix3x2Default this1,Int i,Float value);
		static ::Dynamic setArrayElement_dyn();

		static Float getElement( ::hxmath::math::Matrix3x2Default this1,Int column,Int row);
		static ::Dynamic getElement_dyn();

		static Float setElement( ::hxmath::math::Matrix3x2Default this1,Int column,Int row,Float value);
		static ::Dynamic setElement_dyn();

		static  ::hxmath::math::Vector2Default col( ::hxmath::math::Matrix3x2Default this1,Int index);
		static ::Dynamic col_dyn();

		static  ::hxmath::math::Vector3Default row( ::hxmath::math::Matrix3x2Default this1,Int index);
		static ::Dynamic row_dyn();

		static  ::hxmath::math::Matrix3x2Default applyScalarFunc( ::hxmath::math::Matrix3x2Default this1, ::Dynamic func);
		static ::Dynamic applyScalarFunc_dyn();

		static  ::hxmath::math::Matrix3x2Default applySubMatrixTranspose( ::hxmath::math::Matrix3x2Default this1);
		static ::Dynamic applySubMatrixTranspose_dyn();

		static  ::hxmath::math::Matrix3x2Default applyInvertFrame( ::hxmath::math::Matrix3x2Default this1);
		static ::Dynamic applyInvertFrame_dyn();

		static  ::hxmath::math::Matrix3x2Default get_zero();
		static ::Dynamic get_zero_dyn();

		static  ::hxmath::math::Matrix3x2Default get_identity();
		static ::Dynamic get_identity_dyn();

		static  ::hxmath::math::Vector2Default get_t( ::hxmath::math::Matrix3x2Default this1);
		static ::Dynamic get_t_dyn();

		static  ::hxmath::math::Vector2Default set_t( ::hxmath::math::Matrix3x2Default this1, ::hxmath::math::Vector2Default t);
		static ::Dynamic set_t_dyn();

		static  ::hxmath::math::Matrix2x2Default get_linearSubMatrix( ::hxmath::math::Matrix3x2Default this1);
		static ::Dynamic get_linearSubMatrix_dyn();

		static  ::hxmath::math::Matrix2x2Default set_linearSubMatrix( ::hxmath::math::Matrix3x2Default this1, ::hxmath::math::Matrix2x2Default value);
		static ::Dynamic set_linearSubMatrix_dyn();

};

} // end namespace hxmath
} // end namespace math
} // end namespace _Matrix3x2

#endif /* INCLUDED_hxmath_math__Matrix3x2_Matrix3x2_Impl_ */ 
