// Generated by Haxe 3.3.0
#ifndef INCLUDED_utest_ui_common_FixtureResult
#define INCLUDED_utest_ui_common_FixtureResult

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS0(List)
HX_DECLARE_CLASS1(_List,ListIterator)
HX_DECLARE_CLASS1(utest,Assertation)
HX_DECLARE_CLASS3(utest,ui,common,FixtureResult)
HX_DECLARE_CLASS3(utest,ui,common,ResultStats)

namespace utest{
namespace ui{
namespace common{


class HXCPP_CLASS_ATTRIBUTES FixtureResult_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef FixtureResult_obj OBJ_;
		FixtureResult_obj();

	public:
		void __construct(::String methodName);
		inline void *operator new(size_t inSize, bool inContainer=true,const char *inName="utest.ui.common.FixtureResult")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,true,"utest.ui.common.FixtureResult"); }
		static hx::ObjectPtr< FixtureResult_obj > __new(::String methodName);
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~FixtureResult_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		hx::Val __SetField(const ::String &inString,const hx::Val &inValue, hx::PropertyAccess inCallProp);
		void __GetFields(Array< ::String> &outFields);
		static void __register();
		void __Mark(HX_MARK_PARAMS);
		void __Visit(HX_VISIT_PARAMS);
		::String __ToString() const { return HX_HCSTRING("FixtureResult","\x66","\x65","\x03","\x1a"); }

		::String methodName;
		Bool hasTestError;
		Bool hasSetupError;
		Bool hasTeardownError;
		Bool hasTimeoutError;
		Bool hasAsyncError;
		 ::utest::ui::common::ResultStats stats;
		 ::List list;
		 ::_List::ListIterator iterator();
		::Dynamic iterator_dyn();

		void add(::hx::EnumBase assertation);
		::Dynamic add_dyn();

};

} // end namespace utest
} // end namespace ui
} // end namespace common

#endif /* INCLUDED_utest_ui_common_FixtureResult */ 