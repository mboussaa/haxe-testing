// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_Objects
#define INCLUDED_thx_Objects

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS1(haxe,IMap)
HX_DECLARE_CLASS2(haxe,ds,ObjectMap)
HX_DECLARE_CLASS2(haxe,ds,Option)
HX_DECLARE_CLASS2(haxe,ds,StringMap)
HX_DECLARE_CLASS1(thx,Objects)

namespace thx{


class HXCPP_CLASS_ATTRIBUTES Objects_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef Objects_obj OBJ_;
		Objects_obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="thx.Objects")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"thx.Objects"); }
		static hx::ObjectPtr< Objects_obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~Objects_obj();

		HX_DO_RTTI_ALL;
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("Objects","\xb4","\x90","\xa0","\x4f"); }

		static Int compare( ::Dynamic a, ::Dynamic b);
		static ::Dynamic compare_dyn();

		static Bool isEmpty( ::Dynamic o);
		static ::Dynamic isEmpty_dyn();

		static Bool exists( ::Dynamic o,::String name);
		static ::Dynamic exists_dyn();

		static ::Array< ::String > fields( ::Dynamic o);
		static ::Dynamic fields_dyn();

		static  ::Dynamic combine( ::Dynamic first, ::Dynamic second);
		static ::Dynamic combine_dyn();

		static  ::Dynamic assign( ::Dynamic to, ::Dynamic from, ::Dynamic replacef);
		static ::Dynamic assign_dyn();

		static  ::Dynamic copyTo( ::Dynamic src, ::Dynamic dst,hx::Null< Bool >  cloneInstances);
		static ::Dynamic copyTo_dyn();

		static  ::Dynamic clone( ::Dynamic src,hx::Null< Bool >  cloneInstances);
		static ::Dynamic clone_dyn();

		static  ::haxe::ds::StringMap toMap( ::Dynamic o);
		static ::Dynamic toMap_dyn();

		static Int size( ::Dynamic o);
		static ::Dynamic size_dyn();

		static ::String string( ::Dynamic o);
		static ::Dynamic string_dyn();

		static void stringImpl( ::Dynamic o, ::haxe::ds::ObjectMap cache);
		static ::Dynamic stringImpl_dyn();

		static ::cpp::VirtualArray values( ::Dynamic o);
		static ::Dynamic values_dyn();

		static ::Array< ::Dynamic> tuples( ::Dynamic o);
		static ::Dynamic tuples_dyn();

		static Bool hasPath( ::Dynamic o,::String path);
		static ::Dynamic hasPath_dyn();

		static Bool hasPathValue( ::Dynamic o,::String path);
		static ::Dynamic hasPathValue_dyn();

		static  ::Dynamic getPath( ::Dynamic o,::String path);
		static ::Dynamic getPath_dyn();

		static ::hx::EnumBase getPathOption( ::Dynamic o,::String path);
		static ::Dynamic getPathOption_dyn();

		static  ::Dynamic getPathOr( ::Dynamic o,::String path, ::Dynamic alt);
		static ::Dynamic getPathOr_dyn();

		static  ::Dynamic setPath( ::Dynamic o,::String path, ::Dynamic val);
		static ::Dynamic setPath_dyn();

		static  ::Dynamic removePath( ::Dynamic o,::String path);
		static ::Dynamic removePath_dyn();

};

} // end namespace thx

#endif /* INCLUDED_thx_Objects */ 
