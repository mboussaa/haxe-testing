// Generated by Haxe 3.3.0
#ifndef INCLUDED_test_TS6
#define INCLUDED_test_TS6

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS1(test,TS6)

namespace test{


class HXCPP_CLASS_ATTRIBUTES TS6_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef TS6_obj OBJ_;
		TS6_obj();
		void __construct();

	public:
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="test.TS6")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		static hx::ObjectPtr< TS6_obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~TS6_obj();

		HX_DO_RTTI_ALL;
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("TS6","\xd7","\x05","\x40","\x00"); }

		static Bool main();
		static ::Dynamic main_dyn();

};

} // end namespace test

#endif /* INCLUDED_test_TS6 */ 
