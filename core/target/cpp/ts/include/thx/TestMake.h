// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_TestMake
#define INCLUDED_thx_TestMake

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS1(thx,TestMake)

namespace thx{


class HXCPP_CLASS_ATTRIBUTES TestMake_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef TestMake_obj OBJ_;
		TestMake_obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="thx.TestMake")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"thx.TestMake"); }
		static hx::ObjectPtr< TestMake_obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~TestMake_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("TestMake","\x80","\x7b","\x3a","\x25"); }

		void testConstructorLiteral();
		::Dynamic testConstructorLiteral_dyn();

		void testConstructorFromTypedef();
		::Dynamic testConstructorFromTypedef_dyn();

};

} // end namespace thx

#endif /* INCLUDED_thx_TestMake */ 
