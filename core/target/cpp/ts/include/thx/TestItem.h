// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_TestItem
#define INCLUDED_thx_TestItem

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS1(thx,TestItem)

namespace thx{


class HXCPP_CLASS_ATTRIBUTES TestItem_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef TestItem_obj OBJ_;
		TestItem_obj();

	public:
		void __construct(Int code);
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="thx.TestItem")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"thx.TestItem"); }
		static hx::ObjectPtr< TestItem_obj > __new(Int code);
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~TestItem_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		hx::Val __SetField(const ::String &inString,const hx::Val &inValue, hx::PropertyAccess inCallProp);
		void __GetFields(Array< ::String> &outFields);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("TestItem","\xa5","\x06","\xa4","\x22"); }

		Int code;
		Int hashCode();
		::Dynamic hashCode_dyn();

		virtual ::String toString();
		::Dynamic toString_dyn();

};

} // end namespace thx

#endif /* INCLUDED_thx_TestItem */ 