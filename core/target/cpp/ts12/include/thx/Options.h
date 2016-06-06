// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_Options
#define INCLUDED_thx_Options

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS2(haxe,ds,Option)
HX_DECLARE_CLASS1(thx,Either)
HX_DECLARE_CLASS1(thx,Options)

namespace thx{


class HXCPP_CLASS_ATTRIBUTES Options_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef Options_obj OBJ_;
		Options_obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="thx.Options")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"thx.Options"); }
		static hx::ObjectPtr< Options_obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~Options_obj();

		HX_DO_RTTI_ALL;
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("Options","\x3e","\x5b","\x4f","\xad"); }

		static ::hx::EnumBase ofValue( ::Dynamic value);
		static ::Dynamic ofValue_dyn();

		static ::hx::EnumBase maybe( ::Dynamic value);
		static ::Dynamic maybe_dyn();

		static Bool equals(::hx::EnumBase a,::hx::EnumBase b, ::Dynamic eq);
		static ::Dynamic equals_dyn();

		static Bool equalsValue(::hx::EnumBase a, ::Dynamic b, ::Dynamic eq);
		static ::Dynamic equalsValue_dyn();

		static ::hx::EnumBase map(::hx::EnumBase option, ::Dynamic callback);
		static ::Dynamic map_dyn();

		static ::hx::EnumBase ap(::hx::EnumBase option,::hx::EnumBase fopt);
		static ::Dynamic ap_dyn();

		static ::hx::EnumBase flatMap(::hx::EnumBase option, ::Dynamic callback);
		static ::Dynamic flatMap_dyn();

		static ::hx::EnumBase join(::hx::EnumBase option);
		static ::Dynamic join_dyn();

		static  ::Dynamic cata(::hx::EnumBase option, ::Dynamic ifNone, ::Dynamic f);
		static ::Dynamic cata_dyn();

		static  ::Dynamic foldLeft(::hx::EnumBase option, ::Dynamic b, ::Dynamic f);
		static ::Dynamic foldLeft_dyn();

		static  ::Dynamic foldMap(::hx::EnumBase option, ::Dynamic f, ::Dynamic m);
		static ::Dynamic foldMap_dyn();

		static ::hx::EnumBase filter(::hx::EnumBase option, ::Dynamic f);
		static ::Dynamic filter_dyn();

		static ::cpp::VirtualArray toArray(::hx::EnumBase option);
		static ::Dynamic toArray_dyn();

		static Bool toBool(::hx::EnumBase option);
		static ::Dynamic toBool_dyn();

		static Bool isNone(::hx::EnumBase option);
		static ::Dynamic isNone_dyn();

		static ::hx::EnumBase toOption( ::Dynamic value);
		static ::Dynamic toOption_dyn();

		static  ::Dynamic get(::hx::EnumBase option);
		static ::Dynamic get_dyn();

		static  ::Dynamic getOrElse(::hx::EnumBase option, ::Dynamic alt);
		static ::Dynamic getOrElse_dyn();

		static ::hx::EnumBase orElse(::hx::EnumBase option,::hx::EnumBase alt);
		static ::Dynamic orElse_dyn();

		static Bool all(::hx::EnumBase option, ::Dynamic f);
		static ::Dynamic all_dyn();

		static Bool any(::hx::EnumBase option, ::Dynamic f);
		static ::Dynamic any_dyn();

		static ::hx::EnumBase traverseValidation(::hx::EnumBase option, ::Dynamic f);
		static ::Dynamic traverseValidation_dyn();

		static ::hx::EnumBase toSuccess(::hx::EnumBase option, ::Dynamic error);
		static ::Dynamic toSuccess_dyn();

		static ::hx::EnumBase toSuccessNel(::hx::EnumBase option, ::Dynamic error);
		static ::Dynamic toSuccessNel_dyn();

		static ::hx::EnumBase toFailure(::hx::EnumBase error, ::Dynamic value);
		static ::Dynamic toFailure_dyn();

		static ::hx::EnumBase toFailureNel(::hx::EnumBase error, ::Dynamic value);
		static ::Dynamic toFailureNel_dyn();

		static ::hx::EnumBase ap2( ::Dynamic f,::hx::EnumBase v1,::hx::EnumBase v2);
		static ::Dynamic ap2_dyn();

		static ::hx::EnumBase ap3( ::Dynamic f,::hx::EnumBase v1,::hx::EnumBase v2,::hx::EnumBase v3);
		static ::Dynamic ap3_dyn();

		static ::hx::EnumBase ap4( ::Dynamic f,::hx::EnumBase v1,::hx::EnumBase v2,::hx::EnumBase v3,::hx::EnumBase v4);
		static ::Dynamic ap4_dyn();

		static ::hx::EnumBase ap5( ::Dynamic f,::hx::EnumBase v1,::hx::EnumBase v2,::hx::EnumBase v3,::hx::EnumBase v4,::hx::EnumBase v5);
		static ::Dynamic ap5_dyn();

		static ::hx::EnumBase ap6( ::Dynamic f,::hx::EnumBase v1,::hx::EnumBase v2,::hx::EnumBase v3,::hx::EnumBase v4,::hx::EnumBase v5,::hx::EnumBase v6);
		static ::Dynamic ap6_dyn();

		static ::hx::EnumBase ap7( ::Dynamic f,::hx::EnumBase v1,::hx::EnumBase v2,::hx::EnumBase v3,::hx::EnumBase v4,::hx::EnumBase v5,::hx::EnumBase v6,::hx::EnumBase v7);
		static ::Dynamic ap7_dyn();

		static ::hx::EnumBase ap8( ::Dynamic f,::hx::EnumBase v1,::hx::EnumBase v2,::hx::EnumBase v3,::hx::EnumBase v4,::hx::EnumBase v5,::hx::EnumBase v6,::hx::EnumBase v7,::hx::EnumBase v8);
		static ::Dynamic ap8_dyn();

};

} // end namespace thx

#endif /* INCLUDED_thx_Options */ 