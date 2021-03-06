// Generated by Haxe 3.3.0
#ifndef INCLUDED_utest_ui_text_PlainTextReport
#define INCLUDED_utest_ui_text_PlainTextReport

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

#ifndef INCLUDED_utest_ui_common_IReport
#include <utest/ui/common/IReport.h>
#endif
HX_DECLARE_CLASS0(StringBuf)
HX_DECLARE_CLASS1(haxe,StackItem)
HX_DECLARE_CLASS1(utest,Runner)
HX_DECLARE_CLASS3(utest,ui,common,HeaderDisplayMode)
HX_DECLARE_CLASS3(utest,ui,common,IReport)
HX_DECLARE_CLASS3(utest,ui,common,PackageResult)
HX_DECLARE_CLASS3(utest,ui,common,ResultAggregator)
HX_DECLARE_CLASS3(utest,ui,common,SuccessResultsDisplayMode)
HX_DECLARE_CLASS3(utest,ui,text,PlainTextReport)

namespace utest{
namespace ui{
namespace text{


class HXCPP_CLASS_ATTRIBUTES PlainTextReport_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef PlainTextReport_obj OBJ_;
		PlainTextReport_obj();

	public:
		void __construct( ::utest::Runner runner, ::Dynamic outputHandler);
		inline void *operator new(size_t inSize, bool inContainer=true,const char *inName="utest.ui.text.PlainTextReport")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,true,"utest.ui.text.PlainTextReport"); }
		static hx::ObjectPtr< PlainTextReport_obj > __new( ::utest::Runner runner, ::Dynamic outputHandler);
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~PlainTextReport_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		hx::Val __SetField(const ::String &inString,const hx::Val &inValue, hx::PropertyAccess inCallProp);
		void __GetFields(Array< ::String> &outFields);
		static void __register();
		void __Mark(HX_MARK_PARAMS);
		void __Visit(HX_VISIT_PARAMS);
		void *_hx_getInterface(int inHash);
		::String __ToString() const { return HX_HCSTRING("PlainTextReport","\xcb","\x73","\xec","\xa8"); }

		::hx::EnumBase displaySuccessResults;
		::hx::EnumBase displayHeader;
		 ::Dynamic handler;
		 ::Dynamic &handler_dyn() { return handler;}
		 ::utest::ui::common::ResultAggregator aggregator;
		::String newline;
		::String indent;
		void setHandler( ::Dynamic handler);
		::Dynamic setHandler_dyn();

		Float startTime;
		void start( ::utest::Runner e);
		::Dynamic start_dyn();

		Float getTime();
		::Dynamic getTime_dyn();

		::String indents(Int c);
		::Dynamic indents_dyn();

		::String dumpStack(::Array< ::Dynamic> stack);
		::Dynamic dumpStack_dyn();

		void addHeader( ::StringBuf buf, ::utest::ui::common::PackageResult result);
		::Dynamic addHeader_dyn();

		 ::utest::ui::common::PackageResult result;
		::String getResults();
		::Dynamic getResults_dyn();

		void complete( ::utest::ui::common::PackageResult result);
		::Dynamic complete_dyn();

};

} // end namespace utest
} // end namespace ui
} // end namespace text

#endif /* INCLUDED_utest_ui_text_PlainTextReport */ 
