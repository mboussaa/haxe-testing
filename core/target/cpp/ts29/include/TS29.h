// Generated by Haxe 3.3.0
#ifndef INCLUDED_TS29
#define INCLUDED_TS29

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS0(TS29)
HX_DECLARE_CLASS1(utest,Runner)



class HXCPP_CLASS_ATTRIBUTES TS29_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef TS29_obj OBJ_;
		TS29_obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="TS29")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"TS29"); }
		static hx::ObjectPtr< TS29_obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~TS29_obj();

		HX_DO_RTTI_ALL;
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("TS29","\x06","\x13","\xc5","\x37"); }

		static void addTests( ::utest::Runner runner);
		static ::Dynamic addTests_dyn();

		static void main();
		static ::Dynamic main_dyn();

};


#endif /* INCLUDED_TS29 */ 