// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_TestDateTime
#define INCLUDED_thx_TestDateTime

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

#include <cpp/Int64.h>
HX_DECLARE_CLASS1(thx,TestDateTime)
HX_DECLARE_CLASS1(thx,TimePeriod)

namespace thx{


class HXCPP_CLASS_ATTRIBUTES TestDateTime_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef TestDateTime_obj OBJ_;
		TestDateTime_obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=true,const char *inName="thx.TestDateTime")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,true,"thx.TestDateTime"); }
		static hx::ObjectPtr< TestDateTime_obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~TestDateTime_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		hx::Val __SetField(const ::String &inString,const hx::Val &inValue, hx::PropertyAccess inCallProp);
		void __GetFields(Array< ::String> &outFields);
		static void __register();
		void __Mark(HX_MARK_PARAMS);
		void __Visit(HX_VISIT_PARAMS);
		::String __ToString() const { return HX_HCSTRING("TestDateTime","\xed","\x6f","\x24","\x15"); }

		 ::cpp::Int64Struct offset;
		::Array< ::Dynamic> date;
		::Array< ::Dynamic> tomorrow;
		::Array< ::Dynamic> dateutc;
		void testCreate();
		::Dynamic testCreate_dyn();

		void testEquals();
		::Dynamic testEquals_dyn();

		void testCompare();
		::Dynamic testCompare_dyn();

		void testToString();
		::Dynamic testToString_dyn();

		void testAdd();
		::Dynamic testAdd_dyn();

		void testOffset();
		::Dynamic testOffset_dyn();

		void testFromString();
		::Dynamic testFromString_dyn();

		void testLocalOffset();
		::Dynamic testLocalOffset_dyn();

		void testNow();
		::Dynamic testNow_dyn();

		void testSnapNext();
		::Dynamic testSnapNext_dyn();

		void testSnapPrev();
		::Dynamic testSnapPrev_dyn();

		void testSnapTo();
		::Dynamic testSnapTo_dyn();

		void assertSnapTo(::Array< ::Dynamic> expected,::Array< ::Dynamic> date,::hx::EnumBase period, ::Dynamic pos);
		::Dynamic assertSnapTo_dyn();

		void assertSnapPrev(::Array< ::Dynamic> expected,::Array< ::Dynamic> date,::hx::EnumBase period, ::Dynamic pos);
		::Dynamic assertSnapPrev_dyn();

		void assertSnapNext(::Array< ::Dynamic> expected,::Array< ::Dynamic> date,::hx::EnumBase period, ::Dynamic pos);
		::Dynamic assertSnapNext_dyn();

};

} // end namespace thx

#endif /* INCLUDED_thx_TestDateTime */ 
