// Generated by Haxe 3.3.0
#ifndef INCLUDED_hxmath_geom_Ray2
#define INCLUDED_hxmath_geom_Ray2

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS2(hxmath,geom,Ray2)
HX_DECLARE_CLASS2(hxmath,math,Vector2Default)

namespace hxmath{
namespace geom{


class HXCPP_CLASS_ATTRIBUTES Ray2_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef Ray2_obj OBJ_;
		Ray2_obj();
		void __construct( ::hxmath::math::Vector2Default origin, ::hxmath::math::Vector2Default normal);

	public:
		inline void *operator new(size_t inSize, bool inContainer=true,const char *inName="hxmath.geom.Ray2")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		static hx::ObjectPtr< Ray2_obj > __new( ::hxmath::math::Vector2Default origin, ::hxmath::math::Vector2Default normal);
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~Ray2_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		hx::Val __SetField(const ::String &inString,const hx::Val &inValue, hx::PropertyAccess inCallProp);
		void __GetFields(Array< ::String> &outFields);
		static void __register();
		void __Mark(HX_MARK_PARAMS);
		void __Visit(HX_VISIT_PARAMS);
		::String __ToString() const { return HX_HCSTRING("Ray2","\x28","\x83","\x7d","\x36"); }

		 ::hxmath::math::Vector2Default origin;
		 ::hxmath::math::Vector2Default normal;
		 ::hxmath::math::Vector2Default eval(Float t);
		::Dynamic eval_dyn();

		Float intersectPoint( ::hxmath::math::Vector2Default point,hx::Null< Float >  tolerance);
		::Dynamic intersectPoint_dyn();

		Int getClosestPoint(::Array< ::Dynamic> points,hx::Null< Float >  tolerance);
		::Dynamic getClosestPoint_dyn();

};

} // end namespace hxmath
} // end namespace geom

#endif /* INCLUDED_hxmath_geom_Ray2 */ 
