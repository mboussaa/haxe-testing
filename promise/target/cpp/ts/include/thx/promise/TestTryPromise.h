// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_promise_TestTryPromise
#define INCLUDED_thx_promise_TestTryPromise

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS2(thx,promise,TestTryPromise)

namespace thx{
namespace promise{


class HXCPP_CLASS_ATTRIBUTES TestTryPromise_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef TestTryPromise_obj OBJ_;
		TestTryPromise_obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="thx.promise.TestTryPromise")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"thx.promise.TestTryPromise"); }
		static hx::ObjectPtr< TestTryPromise_obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~TestTryPromise_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("TestTryPromise","\xb2","\xb4","\x9a","\x29"); }

		void testTryCreate();
		::Dynamic testTryCreate_dyn();

		void testTryEitherSuccess();
		::Dynamic testTryEitherSuccess_dyn();

		void testTryEitherFailure();
		::Dynamic testTryEitherFailure_dyn();

		void testTrySuccess();
		::Dynamic testTrySuccess_dyn();

		void testTryReject();
		::Dynamic testTryReject_dyn();

		void testTryAlways();
		::Dynamic testTryAlways_dyn();

		void testTryThrowFailure();
		::Dynamic testTryThrowFailure_dyn();

		void testTryMap();
		::Dynamic testTryMap_dyn();

		void testTryFlatMap();
		::Dynamic testTryFlatMap_dyn();

		void testTryFlatMapEitherSuccess();
		::Dynamic testTryFlatMapEitherSuccess_dyn();

		void testTryFlatMapEitherFailure();
		::Dynamic testTryFlatMapEitherFailure_dyn();

		void testTryRecoverNull();
		::Dynamic testTryRecoverNull_dyn();

};

} // end namespace thx
} // end namespace promise

#endif /* INCLUDED_thx_promise_TestTryPromise */ 
