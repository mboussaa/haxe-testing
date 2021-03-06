// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_Dynamics
#define INCLUDED_thx_Dynamics

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS1(thx,Dynamics)

namespace thx{


class HXCPP_CLASS_ATTRIBUTES Dynamics_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef Dynamics_obj OBJ_;
		Dynamics_obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="thx.Dynamics")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"thx.Dynamics"); }
		static hx::ObjectPtr< Dynamics_obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~Dynamics_obj();

		HX_DO_RTTI_ALL;
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("Dynamics","\x34","\xac","\x87","\xf6"); }

		static Bool equals( ::Dynamic a, ::Dynamic b);
		static ::Dynamic equals_dyn();

		static  ::Dynamic clone( ::Dynamic v, ::Dynamic cloneInstances);
		static ::Dynamic clone_dyn();

		static Int compare( ::Dynamic a, ::Dynamic b);
		static ::Dynamic compare_dyn();

		static ::String string( ::Dynamic v);
		static ::Dynamic string_dyn();

};

} // end namespace thx

#endif /* INCLUDED_thx_Dynamics */ 
