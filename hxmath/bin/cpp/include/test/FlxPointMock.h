// Generated by Haxe 3.3.0
#ifndef INCLUDED_test_FlxPointMock
#define INCLUDED_test_FlxPointMock

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS1(test,FlxPointMock)

namespace test{


class HXCPP_CLASS_ATTRIBUTES FlxPointMock_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef FlxPointMock_obj OBJ_;
		FlxPointMock_obj();

	public:
		void __construct(hx::Null< Float >  __o_X,hx::Null< Float >  __o_Y);
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="test.FlxPointMock")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"test.FlxPointMock"); }
		static hx::ObjectPtr< FlxPointMock_obj > __new(hx::Null< Float >  __o_X,hx::Null< Float >  __o_Y);
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~FlxPointMock_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		hx::Val __SetField(const ::String &inString,const hx::Val &inValue, hx::PropertyAccess inCallProp);
		void __GetFields(Array< ::String> &outFields);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("FlxPointMock","\x48","\x64","\xaa","\x3a"); }

		Float x;
		Float y;
		Float set_x(Float value);
		::Dynamic set_x_dyn();

		Float set_y(Float value);
		::Dynamic set_y_dyn();

		virtual ::String toString();
		::Dynamic toString_dyn();

};

} // end namespace test

#endif /* INCLUDED_test_FlxPointMock */ 
