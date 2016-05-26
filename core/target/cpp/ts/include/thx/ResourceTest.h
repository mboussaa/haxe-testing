// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_ResourceTest
#define INCLUDED_thx_ResourceTest

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

#ifndef INCLUDED_thx_StaticResource
#include <thx/StaticResource.h>
#endif
HX_DECLARE_CLASS1(thx,ResourceTest)
HX_DECLARE_CLASS1(thx,StaticResource)

namespace thx{


class HXCPP_CLASS_ATTRIBUTES ResourceTest_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef ResourceTest_obj OBJ_;
		ResourceTest_obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="thx.ResourceTest")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"thx.ResourceTest"); }
		static hx::ObjectPtr< ResourceTest_obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~ResourceTest_obj();

		HX_DO_RTTI_ALL;
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		static bool __SetStatic(const ::String &inString, Dynamic &ioValue, hx::PropertyAccess inCallProp);
		static void __register();
		void *_hx_getInterface(int inHash);
		::String __ToString() const { return HX_HCSTRING("ResourceTest","\x60","\x1c","\x6f","\x5c"); }

		static void __boot();
		static  ::Dynamic fileJson;
		static ::String fileText;
		static Int a;
		static  ::Dynamic b;
		static Bool c;
		static ::String d;
};

} // end namespace thx

#endif /* INCLUDED_thx_ResourceTest */ 
