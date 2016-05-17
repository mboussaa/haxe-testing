// Generated by Haxe 3.3.0
#ifndef INCLUDED_nanotest_NanoTestCase
#define INCLUDED_nanotest_NanoTestCase

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS1(nanotest,NanoTestAssertResult)
HX_DECLARE_CLASS1(nanotest,NanoTestCase)

namespace nanotest{


class HXCPP_CLASS_ATTRIBUTES NanoTestCase_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef NanoTestCase_obj OBJ_;
		NanoTestCase_obj();
		void __construct( ::Dynamic posInfos);

	public:
		inline void *operator new(size_t inSize, bool inContainer=true,const char *inName="nanotest.NanoTestCase")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		static hx::ObjectPtr< NanoTestCase_obj > __new( ::Dynamic posInfos);
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~NanoTestCase_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		hx::Val __SetField(const ::String &inString,const hx::Val &inValue, hx::PropertyAccess inCallProp);
		void __GetFields(Array< ::String> &outFields);
		static void __register();
		void __Mark(HX_MARK_PARAMS);
		void __Visit(HX_VISIT_PARAMS);
		::String __ToString() const { return HX_HCSTRING("NanoTestCase","\x96","\x73","\xe4","\x11"); }

		static void __boot();
		static ::String ASSERT_TRUE_ERROR;
		static ::String ASSERT_FALSE_ERROR;
		static ::String ASSERT_THROWS_ERROR;
		static ::String ASSERT_THROWS_ILLEGAL_EXCEPTION( ::Dynamic actual);
		static ::Dynamic ASSERT_THROWS_ILLEGAL_EXCEPTION_dyn();

		static ::String ASSERT_EQUALS_ERROR( ::Dynamic expected, ::Dynamic actual);
		static ::Dynamic ASSERT_EQUALS_ERROR_dyn();

		static ::String ASSERT_NOT_EQUALS_ERROR( ::Dynamic expected, ::Dynamic actual);
		static ::Dynamic ASSERT_NOT_EQUALS_ERROR_dyn();

		static ::String format( ::Dynamic d);
		static ::Dynamic format_dyn();

		 ::Dynamic currentResult;
		 ::Dynamic posInfos;
		void globalTearDown();
		::Dynamic globalTearDown_dyn();

		void globalSetup();
		::Dynamic globalSetup_dyn();

		void tearDown();
		::Dynamic tearDown_dyn();

		void setup();
		::Dynamic setup_dyn();

		::Array< ::Dynamic> run( ::Dynamic print);
		::Dynamic run_dyn();

		 ::nanotest::NanoTestAssertResult assertTrue(Bool b, ::Dynamic p);
		::Dynamic assertTrue_dyn();

		 ::nanotest::NanoTestAssertResult assertFalse(Bool b, ::Dynamic p);
		::Dynamic assertFalse_dyn();

		 ::nanotest::NanoTestAssertResult assertEquals( ::Dynamic expected, ::Dynamic actual, ::Dynamic p);
		::Dynamic assertEquals_dyn();

		 ::nanotest::NanoTestAssertResult assertNotEquals( ::Dynamic notExpected, ::Dynamic actual, ::Dynamic p);
		::Dynamic assertNotEquals_dyn();

		 ::nanotest::NanoTestAssertResult assertThrows( ::Dynamic func, ::Dynamic isSuccess, ::Dynamic p);
		::Dynamic assertThrows_dyn();

		 ::nanotest::NanoTestAssertResult fail(::String message, ::Dynamic p);
		::Dynamic fail_dyn();

		 ::nanotest::NanoTestAssertResult success( ::Dynamic p);
		::Dynamic success_dyn();

		 ::nanotest::NanoTestAssertResult error( ::Dynamic e);
		::Dynamic error_dyn();

		void _openPreprocessResult();
		::Dynamic _openPreprocessResult_dyn();

};

} // end namespace nanotest

#endif /* INCLUDED_nanotest_NanoTestCase */ 
