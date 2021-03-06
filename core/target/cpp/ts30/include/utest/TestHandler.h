// Generated by Haxe 3.3.0
#ifndef INCLUDED_utest_TestHandler
#define INCLUDED_utest_TestHandler

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS0(List)
HX_DECLARE_CLASS1(haxe,StackItem)
HX_DECLARE_CLASS1(utest,Dispatcher)
HX_DECLARE_CLASS1(utest,TestFixture)
HX_DECLARE_CLASS1(utest,TestHandler)

namespace utest{


class HXCPP_CLASS_ATTRIBUTES TestHandler_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef TestHandler_obj OBJ_;
		TestHandler_obj();

	public:
		void __construct( ::utest::TestFixture fixture);
		inline void *operator new(size_t inSize, bool inContainer=true,const char *inName="utest.TestHandler")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,true,"utest.TestHandler"); }
		static hx::ObjectPtr< TestHandler_obj > __new( ::utest::TestFixture fixture);
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~TestHandler_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		hx::Val __SetField(const ::String &inString,const hx::Val &inValue, hx::PropertyAccess inCallProp);
		void __GetFields(Array< ::String> &outFields);
		static void __register();
		void __Mark(HX_MARK_PARAMS);
		void __Visit(HX_VISIT_PARAMS);
		::String __ToString() const { return HX_HCSTRING("TestHandler","\x78","\x35","\xd1","\xe6"); }

		static void __boot();
		static Int POLLING_TIME;
		static ::Array< ::Dynamic> exceptionStack(hx::Null< Int >  pops);
		static ::Dynamic exceptionStack_dyn();

		 ::List results;
		 ::utest::TestFixture fixture;
		 ::List asyncStack;
		 ::utest::Dispatcher onTested;
		 ::utest::Dispatcher onTimeout;
		 ::utest::Dispatcher onComplete;
		 ::utest::Dispatcher onPrecheck;
		 ::Dynamic precheck;
		 ::Dynamic &precheck_dyn() { return precheck;}
		void execute();
		::Dynamic execute_dyn();

		void checkTested();
		::Dynamic checkTested_dyn();

		 ::Dynamic expireson;
		void setTimeout(Int timeout);
		::Dynamic setTimeout_dyn();

		void bindHandler();
		::Dynamic bindHandler_dyn();

		void unbindHandler();
		::Dynamic unbindHandler_dyn();

		 ::Dynamic addAsync( ::Dynamic f,hx::Null< Int >  timeout);
		::Dynamic addAsync_dyn();

		 ::Dynamic addEvent( ::Dynamic f,hx::Null< Int >  timeout);
		::Dynamic addEvent_dyn();

		void executeMethod(::String name);
		::Dynamic executeMethod_dyn();

		void tested();
		::Dynamic tested_dyn();

		void timeout();
		::Dynamic timeout_dyn();

		void completed();
		::Dynamic completed_dyn();

};

} // end namespace utest

#endif /* INCLUDED_utest_TestHandler */ 
