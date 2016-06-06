// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_Functions
#define INCLUDED_thx_Functions

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS1(thx,Functions)

namespace thx{


class HXCPP_CLASS_ATTRIBUTES Functions_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef Functions_obj OBJ_;
		Functions_obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="thx.Functions")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"thx.Functions"); }
		static hx::ObjectPtr< Functions_obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~Functions_obj();

		HX_DO_RTTI_ALL;
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("Functions","\x3b","\xea","\xd5","\x55"); }

		static Bool equality( ::Dynamic a, ::Dynamic b);
		static ::Dynamic equality_dyn();

		static  ::Dynamic identity( ::Dynamic value);
		static ::Dynamic identity_dyn();

		static void noop();
		static ::Dynamic noop_dyn();

};

} // end namespace thx

#endif /* INCLUDED_thx_Functions */ 
