// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_Iterables
#define INCLUDED_thx_Iterables

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS2(haxe,ds,Option)
HX_DECLARE_CLASS1(thx,Iterables)
HX_DECLARE_CLASS1(thx,OrderingImpl)

namespace thx{


class HXCPP_CLASS_ATTRIBUTES Iterables_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef Iterables_obj OBJ_;
		Iterables_obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="thx.Iterables")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"thx.Iterables"); }
		static hx::ObjectPtr< Iterables_obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~Iterables_obj();

		HX_DO_RTTI_ALL;
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("Iterables","\x61","\x1d","\x51","\x29"); }

		static Bool all( ::Dynamic it, ::Dynamic predicate);
		static ::Dynamic all_dyn();

		static Bool any( ::Dynamic it, ::Dynamic predicate);
		static ::Dynamic any_dyn();

		static void eachPair( ::Dynamic it, ::Dynamic handler);
		static ::Dynamic eachPair_dyn();

		static Bool equals( ::Dynamic a, ::Dynamic b, ::Dynamic equality);
		static ::Dynamic equals_dyn();

		static ::cpp::VirtualArray filter( ::Dynamic it, ::Dynamic predicate);
		static ::Dynamic filter_dyn();

		static  ::Dynamic find( ::Dynamic it, ::Dynamic predicate);
		static ::Dynamic find_dyn();

		static ::hx::EnumBase findOption( ::Dynamic it, ::Dynamic predicate);
		static ::Dynamic findOption_dyn();

		static  ::Dynamic first( ::Dynamic it);
		static ::Dynamic first_dyn();

		static  ::Dynamic get( ::Dynamic it,Int index);
		static ::Dynamic get_dyn();

		static ::hx::EnumBase getOption( ::Dynamic it,Int index);
		static ::Dynamic getOption_dyn();

		static  ::Dynamic last( ::Dynamic it);
		static ::Dynamic last_dyn();

		static Bool hasElements( ::Dynamic it);
		static ::Dynamic hasElements_dyn();

		static Int indexOf( ::Dynamic it, ::Dynamic element);
		static ::Dynamic indexOf_dyn();

		static Bool isEmpty( ::Dynamic it);
		static ::Dynamic isEmpty_dyn();

		static Bool isIterable( ::Dynamic v);
		static ::Dynamic isIterable_dyn();

		static ::cpp::VirtualArray map( ::Dynamic it, ::Dynamic f);
		static ::Dynamic map_dyn();

		static  ::Dynamic fmap( ::Dynamic it, ::Dynamic f);
		static ::Dynamic fmap_dyn();

		static ::cpp::VirtualArray mapi( ::Dynamic it, ::Dynamic f);
		static ::Dynamic mapi_dyn();

		static  ::Dynamic fmapi( ::Dynamic it, ::Dynamic f);
		static ::Dynamic fmapi_dyn();

		static ::cpp::VirtualArray order( ::Dynamic it, ::Dynamic sort);
		static ::Dynamic order_dyn();

		static  ::Dynamic reduce( ::Dynamic it, ::Dynamic callback, ::Dynamic initial);
		static ::Dynamic reduce_dyn();

		static  ::Dynamic reducei( ::Dynamic it, ::Dynamic callback, ::Dynamic initial);
		static ::Dynamic reducei_dyn();

		static ::cpp::VirtualArray toArray( ::Dynamic it);
		static ::Dynamic toArray_dyn();

		static ::hx::EnumBase minBy( ::Dynamic it, ::Dynamic f, ::Dynamic ord);
		static ::Dynamic minBy_dyn();

		static ::hx::EnumBase maxBy( ::Dynamic it, ::Dynamic f, ::Dynamic ord);
		static ::Dynamic maxBy_dyn();

		static ::hx::EnumBase min( ::Dynamic it, ::Dynamic ord);
		static ::Dynamic min_dyn();

		static ::hx::EnumBase max( ::Dynamic it, ::Dynamic ord);
		static ::Dynamic max_dyn();

		static ::hx::EnumBase extremaBy( ::Dynamic it, ::Dynamic f, ::Dynamic ord);
		static ::Dynamic extremaBy_dyn();

		static ::hx::EnumBase extrema( ::Dynamic it, ::Dynamic ord);
		static ::Dynamic extrema_dyn();

		static  ::Dynamic unzip( ::Dynamic it);
		static ::Dynamic unzip_dyn();

		static  ::Dynamic unzip3( ::Dynamic it);
		static ::Dynamic unzip3_dyn();

		static  ::Dynamic unzip4( ::Dynamic it);
		static ::Dynamic unzip4_dyn();

		static  ::Dynamic unzip5( ::Dynamic it);
		static ::Dynamic unzip5_dyn();

		static ::Array< ::Dynamic> zip( ::Dynamic it1, ::Dynamic it2);
		static ::Dynamic zip_dyn();

		static ::Array< ::Dynamic> zip3( ::Dynamic it1, ::Dynamic it2, ::Dynamic it3);
		static ::Dynamic zip3_dyn();

		static ::Array< ::Dynamic> zip4( ::Dynamic it1, ::Dynamic it2, ::Dynamic it3, ::Dynamic it4);
		static ::Dynamic zip4_dyn();

		static ::Array< ::Dynamic> zip5( ::Dynamic it1, ::Dynamic it2, ::Dynamic it3, ::Dynamic it4, ::Dynamic it5);
		static ::Dynamic zip5_dyn();

};

} // end namespace thx

#endif /* INCLUDED_thx_Iterables */ 
