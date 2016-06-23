// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_AnonymousMap
#define INCLUDED_thx_AnonymousMap

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

#ifndef INCLUDED_haxe_IMap
#include <haxe/IMap.h>
#endif
HX_DECLARE_CLASS1(haxe,IMap)
HX_DECLARE_CLASS2(haxe,ds,Option)
HX_DECLARE_CLASS1(thx,AnonymousMap)

namespace thx{


class HXCPP_CLASS_ATTRIBUTES AnonymousMap_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef AnonymousMap_obj OBJ_;
		AnonymousMap_obj();

	public:
		void __construct( ::Dynamic o);
		inline void *operator new(size_t inSize, bool inContainer=true,const char *inName="thx.AnonymousMap")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,true,"thx.AnonymousMap"); }
		static hx::ObjectPtr< AnonymousMap_obj > __new( ::Dynamic o);
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~AnonymousMap_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		hx::Val __SetField(const ::String &inString,const hx::Val &inValue, hx::PropertyAccess inCallProp);
		void __GetFields(Array< ::String> &outFields);
		static void __register();
		void __Mark(HX_MARK_PARAMS);
		void __Visit(HX_VISIT_PARAMS);
		void *_hx_getInterface(int inHash);
		Bool remove_9314b24f( ::Dynamic k);

		Bool exists_9314b24f( ::Dynamic k);

		void set_41d0cb46( ::Dynamic k, ::Dynamic v);

		 ::Dynamic get_dc94b8fa( ::Dynamic k);
		::String __ToString() const { return HX_HCSTRING("AnonymousMap","\x4f","\xbc","\x6a","\xde"); }

		 ::Dynamic o;
		 ::Dynamic get(::String k);
		::Dynamic get_dyn();

		::hx::EnumBase getOption(::String k);
		::Dynamic getOption_dyn();

		 ::Dynamic getObject();
		::Dynamic getObject_dyn();

		void set(::String k, ::Dynamic v);
		::Dynamic set_dyn();

		Bool exists(::String k);
		::Dynamic exists_dyn();

		Bool remove(::String k);
		::Dynamic remove_dyn();

		 ::Dynamic keys();
		::Dynamic keys_dyn();

		 ::Dynamic iterator();
		::Dynamic iterator_dyn();

		virtual ::String toString();
		::Dynamic toString_dyn();

};

} // end namespace thx

#endif /* INCLUDED_thx_AnonymousMap */ 