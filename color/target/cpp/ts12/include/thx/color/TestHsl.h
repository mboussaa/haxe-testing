// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_color_TestHsl
#define INCLUDED_thx_color_TestHsl

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS2(thx,color,TestHsl)

namespace thx{
namespace color{


class HXCPP_CLASS_ATTRIBUTES TestHsl_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef TestHsl_obj OBJ_;
		TestHsl_obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="thx.color.TestHsl")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"thx.color.TestHsl"); }
		static hx::ObjectPtr< TestHsl_obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~TestHsl_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("TestHsl","\xaf","\xe5","\x0e","\x8b"); }

		void testBasics();
		::Dynamic testBasics_dyn();

		void testStrings();
		::Dynamic testStrings_dyn();

		void testFromString();
		::Dynamic testFromString_dyn();

};

} // end namespace thx
} // end namespace color

#endif /* INCLUDED_thx_color_TestHsl */ 