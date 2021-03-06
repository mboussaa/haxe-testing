// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_Functions1
#define INCLUDED_thx_Functions1

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS1(thx,Functions1)

namespace thx{


class HXCPP_CLASS_ATTRIBUTES Functions1_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef Functions1_obj OBJ_;
		Functions1_obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="thx.Functions1")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"thx.Functions1"); }
		static hx::ObjectPtr< Functions1_obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~Functions1_obj();

		HX_DO_RTTI_ALL;
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("Functions1","\x96","\x09","\x57","\xc5"); }

		static  ::Dynamic compose( ::Dynamic fa, ::Dynamic fb);
		static ::Dynamic compose_dyn();

		static  ::Dynamic map( ::Dynamic fab, ::Dynamic fbc);
		static ::Dynamic map_dyn();

		static  ::Dynamic contramap( ::Dynamic fbc, ::Dynamic fab);
		static ::Dynamic contramap_dyn();

		static  ::Dynamic join( ::Dynamic fa, ::Dynamic fb);
		static ::Dynamic join_dyn();

		static  ::Dynamic memoize( ::Dynamic callback, ::Dynamic resolver);
		static ::Dynamic memoize_dyn();

		static  ::Dynamic negate( ::Dynamic callback);
		static ::Dynamic negate_dyn();

		static void noop( ::Dynamic _);
		static ::Dynamic noop_dyn();

		static  ::Dynamic times(Int n, ::Dynamic callback);
		static ::Dynamic times_dyn();

		static  ::Dynamic timesi(Int n, ::Dynamic callback);
		static ::Dynamic timesi_dyn();

		static  ::Dynamic swapArguments( ::Dynamic callback);
		static ::Dynamic swapArguments_dyn();

};

} // end namespace thx

#endif /* INCLUDED_thx_Functions1 */ 
