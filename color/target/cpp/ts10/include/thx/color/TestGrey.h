// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_color_TestGrey
#define INCLUDED_thx_color_TestGrey

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS2(thx,color,TestGrey)

namespace thx{
namespace color{


class HXCPP_CLASS_ATTRIBUTES TestGrey_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef TestGrey_obj OBJ_;
		TestGrey_obj();

	public:
		void __construct(Int i);
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="thx.color.TestGrey")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"thx.color.TestGrey"); }
		static hx::ObjectPtr< TestGrey_obj > __new(Int i);
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~TestGrey_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		hx::Val __SetField(const ::String &inString,const hx::Val &inValue, hx::PropertyAccess inCallProp);
		void __GetFields(Array< ::String> &outFields);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("TestGrey","\xf1","\x14","\x50","\x21"); }

		Int x;
		void testBasics();
		::Dynamic testBasics_dyn();

		void testStrings();
		::Dynamic testStrings_dyn();

		void testFromString();
		::Dynamic testFromString_dyn();

};

} // end namespace thx
} // end namespace color

#endif /* INCLUDED_thx_color_TestGrey */ 