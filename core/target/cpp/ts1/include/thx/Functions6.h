// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_Functions6
#define INCLUDED_thx_Functions6

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS1(thx,Functions6)

namespace thx{


class HXCPP_CLASS_ATTRIBUTES Functions6_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef Functions6_obj OBJ_;
		Functions6_obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="thx.Functions6")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"thx.Functions6"); }
		static hx::ObjectPtr< Functions6_obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~Functions6_obj();

		HX_DO_RTTI_ALL;
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("Functions6","\x9b","\x09","\x57","\xc5"); }

		static  ::Dynamic curry( ::Dynamic f);
		static ::Dynamic curry_dyn();

};

} // end namespace thx

#endif /* INCLUDED_thx_Functions6 */ 
