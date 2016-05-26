// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_TestStaticResource
#define INCLUDED_thx_TestStaticResource

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS1(thx,TestStaticResource)

namespace thx{


class HXCPP_CLASS_ATTRIBUTES TestStaticResource_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef TestStaticResource_obj OBJ_;
		TestStaticResource_obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="thx.TestStaticResource")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"thx.TestStaticResource"); }
		static hx::ObjectPtr< TestStaticResource_obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~TestStaticResource_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("TestStaticResource","\xae","\xff","\x97","\x15"); }

		void testBasics();
		::Dynamic testBasics_dyn();

		void testDir();
		::Dynamic testDir_dyn();

};

} // end namespace thx

#endif /* INCLUDED_thx_TestStaticResource */ 