// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_StringOrderedMap
#define INCLUDED_thx_StringOrderedMap

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

#ifndef INCLUDED_thx_OrderedMapImpl
#include <thx/OrderedMapImpl.h>
#endif
HX_DECLARE_CLASS1(haxe,IMap)
HX_DECLARE_CLASS1(thx,OrderedMapImpl)
HX_DECLARE_CLASS1(thx,StringOrderedMap)

namespace thx{


class HXCPP_CLASS_ATTRIBUTES StringOrderedMap_obj : public  ::thx::OrderedMapImpl_obj
{
	public:
		typedef  ::thx::OrderedMapImpl_obj super;
		typedef StringOrderedMap_obj OBJ_;
		StringOrderedMap_obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=true,const char *inName="thx.StringOrderedMap")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,true,"thx.StringOrderedMap"); }
		static hx::ObjectPtr< StringOrderedMap_obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~StringOrderedMap_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("StringOrderedMap","\x80","\x94","\x26","\x82"); }

		 ::thx::OrderedMapImpl empty();

};

} // end namespace thx

#endif /* INCLUDED_thx_StringOrderedMap */ 
