// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_color_TestLuv
#define INCLUDED_thx_color_TestLuv

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS2(thx,color,TestLuv)

namespace thx{
namespace color{


class HXCPP_CLASS_ATTRIBUTES TestLuv_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef TestLuv_obj OBJ_;
		TestLuv_obj();

	public:
		void __construct(Int i);
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="thx.color.TestLuv")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"thx.color.TestLuv"); }
		static hx::ObjectPtr< TestLuv_obj > __new(Int i);
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~TestLuv_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		hx::Val __SetField(const ::String &inString,const hx::Val &inValue, hx::PropertyAccess inCallProp);
		void __GetFields(Array< ::String> &outFields);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("TestLuv","\x7b","\xf0","\x11","\x8b"); }

		Int x;
		void testBasics();
		::Dynamic testBasics_dyn();

		void testString();
		::Dynamic testString_dyn();

		void testParse();
		::Dynamic testParse_dyn();

		void testFromFloat();
		::Dynamic testFromFloat_dyn();

		void testXyz();
		::Dynamic testXyz_dyn();

};

} // end namespace thx
} // end namespace color

#endif /* INCLUDED_thx_color_TestLuv */ 