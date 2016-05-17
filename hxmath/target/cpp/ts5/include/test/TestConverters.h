// Generated by Haxe 3.3.0
#ifndef INCLUDED_test_TestConverters
#define INCLUDED_test_TestConverters

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

#ifndef INCLUDED_test_MathTestCase
#include <test/MathTestCase.h>
#endif
HX_DECLARE_CLASS1(nanotest,NanoTestCase)
HX_DECLARE_CLASS1(test,MathTestCase)
HX_DECLARE_CLASS1(test,TestConverters)

namespace test{


class HXCPP_CLASS_ATTRIBUTES TestConverters_obj : public  ::test::MathTestCase_obj
{
	public:
		typedef  ::test::MathTestCase_obj super;
		typedef TestConverters_obj OBJ_;
		TestConverters_obj();
		void __construct();

	public:
		inline void *operator new(size_t inSize, bool inContainer=true,const char *inName="test.TestConverters")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		static hx::ObjectPtr< TestConverters_obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~TestConverters_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("TestConverters","\x65","\xbe","\x06","\x2f"); }

		void testShapeSimilarConversion();
		::Dynamic testShapeSimilarConversion_dyn();

		void testFlxPointConversion();
		::Dynamic testFlxPointConversion_dyn();

};

} // end namespace test

#endif /* INCLUDED_test_TestConverters */ 
