// Generated by Haxe 3.3.0
#ifndef INCLUDED_TS45
#define INCLUDED_TS45

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS0(TS45)
HX_DECLARE_CLASS1(utest,Runner)



class HXCPP_CLASS_ATTRIBUTES TS45_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef TS45_obj OBJ_;
		TS45_obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="TS45")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"TS45"); }
		static hx::ObjectPtr< TS45_obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~TS45_obj();

		HX_DO_RTTI_ALL;
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("TS45","\xc0","\x14","\xc5","\x37"); }

		static void addTests( ::utest::Runner runner);
		static ::Dynamic addTests_dyn();

		static void main();
		static ::Dynamic main_dyn();

};


#endif /* INCLUDED_TS45 */ 