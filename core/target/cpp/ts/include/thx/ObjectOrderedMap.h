// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_ObjectOrderedMap
#define INCLUDED_thx_ObjectOrderedMap

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

#ifndef INCLUDED_thx_OrderedMapImpl
#include <thx/OrderedMapImpl.h>
#endif
HX_DECLARE_CLASS1(haxe,IMap)
HX_DECLARE_CLASS1(thx,ObjectOrderedMap)
HX_DECLARE_CLASS1(thx,OrderedMapImpl)

namespace thx{


class HXCPP_CLASS_ATTRIBUTES ObjectOrderedMap_obj : public  ::thx::OrderedMapImpl_obj
{
	public:
		typedef  ::thx::OrderedMapImpl_obj super;
		typedef ObjectOrderedMap_obj OBJ_;
		ObjectOrderedMap_obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=true,const char *inName="thx.ObjectOrderedMap")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,true,"thx.ObjectOrderedMap"); }
		static hx::ObjectPtr< ObjectOrderedMap_obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~ObjectOrderedMap_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("ObjectOrderedMap","\xee","\xdf","\x59","\x77"); }

		 ::thx::OrderedMapImpl empty();

};

} // end namespace thx

#endif /* INCLUDED_thx_ObjectOrderedMap */ 
