// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_format_TestFormat
#define INCLUDED_thx_format_TestFormat

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS2(thx,culture,Culture)
HX_DECLARE_CLASS2(thx,format,TestFormat)

namespace thx{
namespace format{


class HXCPP_CLASS_ATTRIBUTES TestFormat_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef TestFormat_obj OBJ_;
		TestFormat_obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="thx.format.TestFormat")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"thx.format.TestFormat"); }
		static hx::ObjectPtr< TestFormat_obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~TestFormat_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		static bool __SetStatic(const ::String &inString, Dynamic &ioValue, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("TestFormat","\x49","\xd9","\x33","\x0d"); }

		static void __boot();
		static  ::thx::culture::Culture it;
		void testF();
		::Dynamic testF_dyn();

};

} // end namespace thx
} // end namespace format

#endif /* INCLUDED_thx_format_TestFormat */ 
