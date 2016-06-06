// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_TestNulls
#define INCLUDED_thx_TestNulls

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS1(thx,TestNulls)

namespace thx{


class HXCPP_CLASS_ATTRIBUTES TestNulls_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef TestNulls_obj OBJ_;
		TestNulls_obj();

	public:
		void __construct(Int i);
		inline void *operator new(size_t inSize, bool inContainer=true,const char *inName="thx.TestNulls")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,true,"thx.TestNulls"); }
		static hx::ObjectPtr< TestNulls_obj > __new(Int i);
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~TestNulls_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		hx::Val __SetField(const ::String &inString,const hx::Val &inValue, hx::PropertyAccess inCallProp);
		static bool __SetStatic(const ::String &inString, Dynamic &ioValue, hx::PropertyAccess inCallProp);
		void __GetFields(Array< ::String> &outFields);
		static void __register();
		void __Mark(HX_MARK_PARAMS);
		void __Visit(HX_VISIT_PARAMS);
		::String __ToString() const { return HX_HCSTRING("TestNulls","\x3a","\x36","\x91","\x0e"); }

		static void __boot();
		static ::String ensureStaticField;
		::String withValue;
		::String withoutValue;
		::String getter;
		::String get_getter();
		::Dynamic get_getter_dyn();

		::String v;
		::String get_setter();
		::Dynamic get_setter_dyn();

		::String set_setter(::String v);
		::Dynamic set_setter_dyn();

		 ::Dynamic nested;
		 ::Dynamic empty;
		Int x;
		void setup();
		::Dynamic setup_dyn();

		void testOr();
		::Dynamic testOr_dyn();

		void testOpt();
		::Dynamic testOpt_dyn();

		void testOrWithIndex();
		::Dynamic testOrWithIndex_dyn();

		 ::Dynamic m;
		 ::Dynamic m2;
		void testOrMethod();
		::Dynamic testOrMethod_dyn();

		void testIsNull();
		::Dynamic testIsNull_dyn();

		void testNotNull();
		::Dynamic testNotNull_dyn();

		void testEnsure();
		::Dynamic testEnsure_dyn();

		::String ensureField;
};

} // end namespace thx

#endif /* INCLUDED_thx_TestNulls */ 