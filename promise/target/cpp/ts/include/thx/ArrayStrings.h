// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_ArrayStrings
#define INCLUDED_thx_ArrayStrings

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS1(thx,ArrayStrings)

namespace thx{


class HXCPP_CLASS_ATTRIBUTES ArrayStrings_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef ArrayStrings_obj OBJ_;
		ArrayStrings_obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="thx.ArrayStrings")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"thx.ArrayStrings"); }
		static hx::ObjectPtr< ArrayStrings_obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~ArrayStrings_obj();

		HX_DO_RTTI_ALL;
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("ArrayStrings","\x09","\x6a","\x65","\x72"); }

		static ::Array< ::String > compact(::Array< ::String > arr);
		static ::Dynamic compact_dyn();

		static ::String max(::Array< ::String > arr);
		static ::Dynamic max_dyn();

		static ::String min(::Array< ::String > arr);
		static ::Dynamic min_dyn();

};

} // end namespace thx

#endif /* INCLUDED_thx_ArrayStrings */ 
