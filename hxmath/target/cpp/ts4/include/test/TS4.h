// Generated by Haxe 3.3.0
#ifndef INCLUDED_test_TS4
#define INCLUDED_test_TS4

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS1(test,TS4)

namespace test{


class HXCPP_CLASS_ATTRIBUTES TS4_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef TS4_obj OBJ_;
		TS4_obj();
		void __construct();

	public:
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="test.TS4")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		static hx::ObjectPtr< TS4_obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~TS4_obj();

		HX_DO_RTTI_ALL;
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("TS4","\xd5","\x05","\x40","\x00"); }

		static Bool main();
		static ::Dynamic main_dyn();

};

} // end namespace test

#endif /* INCLUDED_test_TS4 */ 
