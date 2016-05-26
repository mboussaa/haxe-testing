// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx__OrderedSet_OrderedSet_Impl_
#define INCLUDED_thx__OrderedSet_OrderedSet_Impl_

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS2(thx,_OrderedSet,OrderedSet_Impl_)

namespace thx{
namespace _OrderedSet{


class HXCPP_CLASS_ATTRIBUTES OrderedSet_Impl__obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef OrderedSet_Impl__obj OBJ_;
		OrderedSet_Impl__obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="thx._OrderedSet.OrderedSet_Impl_")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"thx._OrderedSet.OrderedSet_Impl_"); }
		static hx::ObjectPtr< OrderedSet_Impl__obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~OrderedSet_Impl__obj();

		HX_DO_RTTI_ALL;
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("OrderedSet_Impl_","\xb5","\xfb","\x14","\xb6"); }

		static ::cpp::VirtualArray toOrderedSet(::cpp::VirtualArray arr);
		static ::Dynamic toOrderedSet_dyn();

		static ::cpp::VirtualArray arrayToOrderedSet(::cpp::VirtualArray arr);
		static ::Dynamic arrayToOrderedSet_dyn();

		static ::cpp::VirtualArray create(::cpp::VirtualArray arr);
		static ::Dynamic create_dyn();

		static ::cpp::VirtualArray _new(::cpp::VirtualArray arr);
		static ::Dynamic _new_dyn();

		static Bool add(::cpp::VirtualArray this1, ::Dynamic v);
		static ::Dynamic add_dyn();

		static ::cpp::VirtualArray copy(::cpp::VirtualArray this1);
		static ::Dynamic copy_dyn();

		static ::cpp::VirtualArray difference(::cpp::VirtualArray this1,::cpp::VirtualArray set);
		static ::Dynamic difference_dyn();

		static Bool exists(::cpp::VirtualArray this1, ::Dynamic v);
		static ::Dynamic exists_dyn();

		static  ::Dynamic get(::cpp::VirtualArray this1,Int index);
		static ::Dynamic get_dyn();

		static ::cpp::VirtualArray intersection(::cpp::VirtualArray this1,::cpp::VirtualArray set);
		static ::Dynamic intersection_dyn();

		static void push(::cpp::VirtualArray this1, ::Dynamic v);
		static ::Dynamic push_dyn();

		static void pushMany(::cpp::VirtualArray this1, ::Dynamic values);
		static ::Dynamic pushMany_dyn();

		static ::cpp::VirtualArray slice(::cpp::VirtualArray this1,Int pos, ::Dynamic end);
		static ::Dynamic slice_dyn();

		static ::cpp::VirtualArray splice(::cpp::VirtualArray this1,Int pos,Int len);
		static ::Dynamic splice_dyn();

		static ::cpp::VirtualArray _hx_union(::cpp::VirtualArray this1,::cpp::VirtualArray set);
		static ::Dynamic _hx_union_dyn();

		static ::cpp::VirtualArray unionArray(::cpp::VirtualArray this1,::cpp::VirtualArray set);
		static ::Dynamic unionArray_dyn();

		static ::cpp::VirtualArray toArray(::cpp::VirtualArray this1);
		static ::Dynamic toArray_dyn();

		static ::cpp::VirtualArray setToArray(::cpp::VirtualArray this1);
		static ::Dynamic setToArray_dyn();

		static ::String toString(::cpp::VirtualArray this1);
		static ::Dynamic toString_dyn();

};

} // end namespace thx
} // end namespace _OrderedSet

#endif /* INCLUDED_thx__OrderedSet_OrderedSet_Impl_ */ 