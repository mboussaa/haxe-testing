// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_fp__State_State_Impl_
#define INCLUDED_thx_fp__State_State_Impl_

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS3(thx,fp,_State,State_Impl_)

namespace thx{
namespace fp{
namespace _State{


class HXCPP_CLASS_ATTRIBUTES State_Impl__obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef State_Impl__obj OBJ_;
		State_Impl__obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="thx.fp._State.State_Impl_")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"thx.fp._State.State_Impl_"); }
		static hx::ObjectPtr< State_Impl__obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~State_Impl__obj();

		HX_DO_RTTI_ALL;
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("State_Impl_","\x51","\xad","\xb0","\x76"); }

		static  ::Dynamic _hx_void();
		static ::Dynamic _hx_void_dyn();

		static  ::Dynamic pure( ::Dynamic a);
		static ::Dynamic pure_dyn();

		static  ::Dynamic getState();
		static ::Dynamic getState_dyn();

		static  ::Dynamic putState( ::Dynamic s);
		static ::Dynamic putState_dyn();

		static  ::Dynamic map( ::Dynamic this1, ::Dynamic f);
		static ::Dynamic map_dyn();

		static  ::Dynamic ap( ::Dynamic this1, ::Dynamic s2);
		static ::Dynamic ap_dyn();

		static  ::Dynamic flatMap( ::Dynamic this1, ::Dynamic f);
		static ::Dynamic flatMap_dyn();

		static  ::Dynamic voided( ::Dynamic this1);
		static ::Dynamic voided_dyn();

		static  ::Dynamic then( ::Dynamic this1, ::Dynamic next);
		static ::Dynamic then_dyn();

		static  ::Dynamic foreachM( ::Dynamic this1, ::Dynamic f);
		static ::Dynamic foreachM_dyn();

		static  ::Dynamic modify( ::Dynamic this1, ::Dynamic f);
		static ::Dynamic modify_dyn();

		static  ::Dynamic run( ::Dynamic this1, ::Dynamic s);
		static ::Dynamic run_dyn();

		static  ::Dynamic runState( ::Dynamic this1, ::Dynamic s);
		static ::Dynamic runState_dyn();

		static  ::Dynamic ap2( ::Dynamic f, ::Dynamic s1, ::Dynamic s2);
		static ::Dynamic ap2_dyn();

		static  ::Dynamic ap3( ::Dynamic f, ::Dynamic s1, ::Dynamic s2, ::Dynamic s3);
		static ::Dynamic ap3_dyn();

		static  ::Dynamic ap4( ::Dynamic f, ::Dynamic s1, ::Dynamic s2, ::Dynamic s3, ::Dynamic s4);
		static ::Dynamic ap4_dyn();

		static  ::Dynamic ap5( ::Dynamic f, ::Dynamic s1, ::Dynamic s2, ::Dynamic s3, ::Dynamic s4, ::Dynamic s5);
		static ::Dynamic ap5_dyn();

		static  ::Dynamic ap6( ::Dynamic f, ::Dynamic s1, ::Dynamic s2, ::Dynamic s3, ::Dynamic s4, ::Dynamic s5, ::Dynamic s6);
		static ::Dynamic ap6_dyn();

		static  ::Dynamic ap7( ::Dynamic f, ::Dynamic s1, ::Dynamic s2, ::Dynamic s3, ::Dynamic s4, ::Dynamic s5, ::Dynamic s6, ::Dynamic s7);
		static ::Dynamic ap7_dyn();

		static  ::Dynamic ap8( ::Dynamic f, ::Dynamic s1, ::Dynamic s2, ::Dynamic s3, ::Dynamic s4, ::Dynamic s5, ::Dynamic s6, ::Dynamic s7, ::Dynamic s8);
		static ::Dynamic ap8_dyn();

};

} // end namespace thx
} // end namespace fp
} // end namespace _State

#endif /* INCLUDED_thx_fp__State_State_Impl_ */ 
