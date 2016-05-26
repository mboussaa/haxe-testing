// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_TestDateTimeUtc
#define INCLUDED_thx_TestDateTimeUtc

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

#include <cpp/Int64.h>
HX_DECLARE_CLASS1(thx,TestDateTimeUtc)
HX_DECLARE_CLASS1(thx,TimePeriod)

namespace thx{


class HXCPP_CLASS_ATTRIBUTES TestDateTimeUtc_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef TestDateTimeUtc_obj OBJ_;
		TestDateTimeUtc_obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=true,const char *inName="thx.TestDateTimeUtc")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,true,"thx.TestDateTimeUtc"); }
		static hx::ObjectPtr< TestDateTimeUtc_obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~TestDateTimeUtc_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		hx::Val __SetField(const ::String &inString,const hx::Val &inValue, hx::PropertyAccess inCallProp);
		void __GetFields(Array< ::String> &outFields);
		static void __register();
		void __Mark(HX_MARK_PARAMS);
		void __Visit(HX_VISIT_PARAMS);
		::String __ToString() const { return HX_HCSTRING("TestDateTimeUtc","\x37","\x67","\xf3","\xb4"); }

		 ::cpp::Int64Struct date;
		 ::cpp::Int64Struct tomorrow;
		void testCreate();
		::Dynamic testCreate_dyn();

		void testToString();
		::Dynamic testToString_dyn();

		void testOverflowing();
		::Dynamic testOverflowing_dyn();

		void testEquals();
		::Dynamic testEquals_dyn();

		void testCompare();
		::Dynamic testCompare_dyn();

		void testFromToDate();
		::Dynamic testFromToDate_dyn();

		void testFromToTime();
		::Dynamic testFromToTime_dyn();

		void testFromToString();
		::Dynamic testFromToString_dyn();

		void testAdd();
		::Dynamic testAdd_dyn();

		void testNow();
		::Dynamic testNow_dyn();

		void testSnapNext();
		::Dynamic testSnapNext_dyn();

		void testSnapPrev();
		::Dynamic testSnapPrev_dyn();

		void testSnapTo();
		::Dynamic testSnapTo_dyn();

		void assertSnapTo( ::cpp::Int64Struct expected, ::cpp::Int64Struct date,::hx::EnumBase period, ::Dynamic pos);
		::Dynamic assertSnapTo_dyn();

		void assertSnapPrev( ::cpp::Int64Struct expected, ::cpp::Int64Struct date,::hx::EnumBase period, ::Dynamic pos);
		::Dynamic assertSnapPrev_dyn();

		void assertSnapNext( ::cpp::Int64Struct expected, ::cpp::Int64Struct date,::hx::EnumBase period, ::Dynamic pos);
		::Dynamic assertSnapNext_dyn();

};

} // end namespace thx

#endif /* INCLUDED_thx_TestDateTimeUtc */ 
