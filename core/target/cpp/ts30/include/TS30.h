// Generated by Haxe 3.3.0
#ifndef INCLUDED_TS30
#define INCLUDED_TS30

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS0(TS30)
HX_DECLARE_CLASS1(utest,Runner)



class HXCPP_CLASS_ATTRIBUTES TS30_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef TS30_obj OBJ_;
		TS30_obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="TS30")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"TS30"); }
		static hx::ObjectPtr< TS30_obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~TS30_obj();

		HX_DO_RTTI_ALL;
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("TS30","\xdc","\x13","\xc5","\x37"); }

		static void addTests( ::utest::Runner runner);
		static ::Dynamic addTests_dyn();

		static void main();
		static ::Dynamic main_dyn();

};


#endif /* INCLUDED_TS30 */ 