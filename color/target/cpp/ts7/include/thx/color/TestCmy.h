// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_color_TestCmy
#define INCLUDED_thx_color_TestCmy

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS2(thx,color,TestCmy)

namespace thx{
namespace color{


class HXCPP_CLASS_ATTRIBUTES TestCmy_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef TestCmy_obj OBJ_;
		TestCmy_obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="thx.color.TestCmy")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"thx.color.TestCmy"); }
		static hx::ObjectPtr< TestCmy_obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~TestCmy_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("TestCmy","\x3d","\x15","\x0b","\x8b"); }

		void testBasics();
		::Dynamic testBasics_dyn();

		void testString();
		::Dynamic testString_dyn();

		void testParse();
		::Dynamic testParse_dyn();

		void testFromFloat();
		::Dynamic testFromFloat_dyn();

};

} // end namespace thx
} // end namespace color

#endif /* INCLUDED_thx_color_TestCmy */ 