// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_ArrayFloats
#define INCLUDED_thx_ArrayFloats

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS1(thx,ArrayFloats)

namespace thx{


class HXCPP_CLASS_ATTRIBUTES ArrayFloats_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef ArrayFloats_obj OBJ_;
		ArrayFloats_obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="thx.ArrayFloats")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"thx.ArrayFloats"); }
		static hx::ObjectPtr< ArrayFloats_obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~ArrayFloats_obj();

		HX_DO_RTTI_ALL;
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("ArrayFloats","\xb0","\x55","\xd0","\x12"); }

		static Float average(::Array< Float > arr);
		static ::Dynamic average_dyn();

		static ::Array< Float > compact(::Array< ::Dynamic> arr);
		static ::Dynamic compact_dyn();

		static  ::Dynamic max(::Array< Float > arr);
		static ::Dynamic max_dyn();

		static  ::Dynamic min(::Array< Float > arr);
		static ::Dynamic min_dyn();

		static ::Array< Float > resize(::Array< Float > array,Int length,hx::Null< Float >  fill);
		static ::Dynamic resize_dyn();

		static Float standardDeviation(::Array< Float > array);
		static ::Dynamic standardDeviation_dyn();

		static  ::Dynamic sum(::Array< Float > arr);
		static ::Dynamic sum_dyn();

};

} // end namespace thx

#endif /* INCLUDED_thx_ArrayFloats */ 
