// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_TestInts
#define INCLUDED_thx_TestInts

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS1(thx,TestInts)

namespace thx{


class HXCPP_CLASS_ATTRIBUTES TestInts_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef TestInts_obj OBJ_;
		TestInts_obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="thx.TestInts")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"thx.TestInts"); }
		static hx::ObjectPtr< TestInts_obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~TestInts_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("TestInts","\x36","\x86","\x9f","\x22"); }

		void testRange();
		::Dynamic testRange_dyn();

		void testParse();
		::Dynamic testParse_dyn();

		void testToString();
		::Dynamic testToString_dyn();

};

} // end namespace thx

#endif /* INCLUDED_thx_TestInts */ 
