// Generated by Haxe 3.3.0
#ifndef INCLUDED_test_TS2
#define INCLUDED_test_TS2

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS1(test,TS2)

namespace test{


class HXCPP_CLASS_ATTRIBUTES TS2_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef TS2_obj OBJ_;
		TS2_obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="test.TS2")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"test.TS2"); }
		static hx::ObjectPtr< TS2_obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~TS2_obj();

		HX_DO_RTTI_ALL;
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("TS2","\xd3","\x05","\x40","\x00"); }

		static Bool main();
		static ::Dynamic main_dyn();

};

} // end namespace test

#endif /* INCLUDED_test_TS2 */ 
