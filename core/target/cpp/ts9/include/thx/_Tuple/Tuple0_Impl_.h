// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx__Tuple_Tuple0_Impl_
#define INCLUDED_thx__Tuple_Tuple0_Impl_

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS1(thx,Nil)
HX_DECLARE_CLASS2(thx,_Tuple,Tuple0_Impl_)

namespace thx{
namespace _Tuple{


class HXCPP_CLASS_ATTRIBUTES Tuple0_Impl__obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef Tuple0_Impl__obj OBJ_;
		Tuple0_Impl__obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="thx._Tuple.Tuple0_Impl_")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"thx._Tuple.Tuple0_Impl_"); }
		static hx::ObjectPtr< Tuple0_Impl__obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~Tuple0_Impl__obj();

		HX_DO_RTTI_ALL;
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("Tuple0_Impl_","\xe8","\x41","\x5a","\x40"); }

		static ::hx::EnumBase _new();
		static ::Dynamic _new_dyn();

		static  ::Dynamic with(::hx::EnumBase this1, ::Dynamic v);
		static ::Dynamic with_dyn();

		static ::String toString(::hx::EnumBase this1);
		static ::Dynamic toString_dyn();

		static ::hx::EnumBase toNil(::hx::EnumBase this1);
		static ::Dynamic toNil_dyn();

		static ::hx::EnumBase nilToTuple(::hx::EnumBase v);
		static ::Dynamic nilToTuple_dyn();

};

} // end namespace thx
} // end namespace _Tuple

#endif /* INCLUDED_thx__Tuple_Tuple0_Impl_ */ 
