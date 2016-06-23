// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_fp__List_List_Impl_
#define INCLUDED_thx_fp__List_List_Impl_

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS2(thx,fp,ListImpl)
HX_DECLARE_CLASS3(thx,fp,_List,List_Impl_)

namespace thx{
namespace fp{
namespace _List{


class HXCPP_CLASS_ATTRIBUTES List_Impl__obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef List_Impl__obj OBJ_;
		List_Impl__obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="thx.fp._List.List_Impl_")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"thx.fp._List.List_Impl_"); }
		static hx::ObjectPtr< List_Impl__obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~List_Impl__obj();

		HX_DO_RTTI_ALL;
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("List_Impl_","\x9e","\xf7","\x0b","\x71"); }

		static ::hx::EnumBase empty();
		static ::Dynamic empty_dyn();

		static ::hx::EnumBase bin( ::Dynamic x,::hx::EnumBase xs);
		static ::Dynamic bin_dyn();

		static ::hx::EnumBase singleton( ::Dynamic x);
		static ::Dynamic singleton_dyn();

		static ::hx::EnumBase fromArray(::cpp::VirtualArray arr);
		static ::Dynamic fromArray_dyn();

		static  ::Dynamic foldLeft(::hx::EnumBase this1, ::Dynamic b, ::Dynamic f);
		static ::Dynamic foldLeft_dyn();

		static  ::Dynamic foldMap(::hx::EnumBase this1, ::Dynamic f, ::Dynamic m);
		static ::Dynamic foldMap_dyn();

		static ::hx::EnumBase flatMap(::hx::EnumBase this1, ::Dynamic f);
		static ::Dynamic flatMap_dyn();

		static ::hx::EnumBase concat(::hx::EnumBase this1,::hx::EnumBase that);
		static ::Dynamic concat_dyn();

		static ::hx::EnumBase prepend(::hx::EnumBase this1, ::Dynamic x);
		static ::Dynamic prepend_dyn();

		static ::cpp::VirtualArray toArray(::hx::EnumBase this1);
		static ::Dynamic toArray_dyn();

		static ::hx::EnumBase intersperse(::hx::EnumBase this1, ::Dynamic a);
		static ::Dynamic intersperse_dyn();

		static ::hx::EnumBase map(::hx::EnumBase this1, ::Dynamic f);
		static ::Dynamic map_dyn();

		static ::hx::EnumBase zipAp(::hx::EnumBase this1,::hx::EnumBase other);
		static ::Dynamic zipAp_dyn();

		static ::hx::EnumBase zip2Ap( ::Dynamic f,::hx::EnumBase ax,::hx::EnumBase bx);
		static ::Dynamic zip2Ap_dyn();

		static ::hx::EnumBase zip3Ap( ::Dynamic f,::hx::EnumBase ax,::hx::EnumBase bx,::hx::EnumBase cx);
		static ::Dynamic zip3Ap_dyn();

		static ::hx::EnumBase zip4Ap( ::Dynamic f,::hx::EnumBase ax,::hx::EnumBase bx,::hx::EnumBase cx,::hx::EnumBase dx);
		static ::Dynamic zip4Ap_dyn();

		static ::hx::EnumBase zip5Ap( ::Dynamic f,::hx::EnumBase ax,::hx::EnumBase bx,::hx::EnumBase cx,::hx::EnumBase dx,::hx::EnumBase ex);
		static ::Dynamic zip5Ap_dyn();

		static ::String toStringWithShow(::hx::EnumBase this1, ::Dynamic show);
		static ::Dynamic toStringWithShow_dyn();

};

} // end namespace thx
} // end namespace fp
} // end namespace _List

#endif /* INCLUDED_thx_fp__List_List_Impl_ */ 