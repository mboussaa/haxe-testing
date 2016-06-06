// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_TestConvert
#define INCLUDED_thx_TestConvert

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS1(thx,TestConvert)

namespace thx{


class HXCPP_CLASS_ATTRIBUTES TestConvert_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef TestConvert_obj OBJ_;
		TestConvert_obj();

	public:
		void __construct(Int i);
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="thx.TestConvert")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"thx.TestConvert"); }
		static hx::ObjectPtr< TestConvert_obj > __new(Int i);
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~TestConvert_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		hx::Val __SetField(const ::String &inString,const hx::Val &inValue, hx::PropertyAccess inCallProp);
		void __GetFields(Array< ::String> &outFields);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("TestConvert","\xa1","\x83","\xc5","\xbb"); }

		Int x;
		void testString();
		::Dynamic testString_dyn();

		void testInt();
		::Dynamic testInt_dyn();

		void testFloat();
		::Dynamic testFloat_dyn();

		void testBool();
		::Dynamic testBool_dyn();

		void testMap();
		::Dynamic testMap_dyn();

		void testDateTimeUtc();
		::Dynamic testDateTimeUtc_dyn();

};

} // end namespace thx

#endif /* INCLUDED_thx_TestConvert */ 