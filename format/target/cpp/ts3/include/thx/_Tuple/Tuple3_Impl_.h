// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx__Tuple_Tuple3_Impl_
#define INCLUDED_thx__Tuple_Tuple3_Impl_

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS2(thx,_Tuple,Tuple3_Impl_)

namespace thx{
namespace _Tuple{


class HXCPP_CLASS_ATTRIBUTES Tuple3_Impl__obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef Tuple3_Impl__obj OBJ_;
		Tuple3_Impl__obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="thx._Tuple.Tuple3_Impl_")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"thx._Tuple.Tuple3_Impl_"); }
		static hx::ObjectPtr< Tuple3_Impl__obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~Tuple3_Impl__obj();

		HX_DO_RTTI_ALL;
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("Tuple3_Impl_","\x2b","\xa6","\x1a","\xbd"); }

		static  ::Dynamic of( ::Dynamic _0, ::Dynamic _1, ::Dynamic _2);
		static ::Dynamic of_dyn();

		static  ::Dynamic _new( ::Dynamic _0, ::Dynamic _1, ::Dynamic _2);
		static ::Dynamic _new_dyn();

		static  ::Dynamic flip( ::Dynamic this1);
		static ::Dynamic flip_dyn();

		static  ::Dynamic dropLeft( ::Dynamic this1);
		static ::Dynamic dropLeft_dyn();

		static  ::Dynamic dropRight( ::Dynamic this1);
		static ::Dynamic dropRight_dyn();

		static  ::Dynamic with( ::Dynamic this1, ::Dynamic v);
		static ::Dynamic with_dyn();

		static ::String toString( ::Dynamic this1);
		static ::Dynamic toString_dyn();

		static  ::Dynamic arrayToTuple3(::cpp::VirtualArray v);
		static ::Dynamic arrayToTuple3_dyn();

		static  ::Dynamic map( ::Dynamic this1, ::Dynamic f);
		static ::Dynamic map_dyn();

};

} // end namespace thx
} // end namespace _Tuple

#endif /* INCLUDED_thx__Tuple_Tuple3_Impl_ */ 
