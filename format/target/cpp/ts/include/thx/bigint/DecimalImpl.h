// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_bigint_DecimalImpl
#define INCLUDED_thx_bigint_DecimalImpl

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS2(thx,bigint,BigIntImpl)
HX_DECLARE_CLASS2(thx,bigint,DecimalImpl)

namespace thx{
namespace bigint{


class HXCPP_CLASS_ATTRIBUTES DecimalImpl_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef DecimalImpl_obj OBJ_;
		DecimalImpl_obj();

	public:
		void __construct(::Dynamic value,Int scale);
		inline void *operator new(size_t inSize, bool inContainer=true,const char *inName="thx.bigint.DecimalImpl")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,true,"thx.bigint.DecimalImpl"); }
		static hx::ObjectPtr< DecimalImpl_obj > __new(::Dynamic value,Int scale);
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~DecimalImpl_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		hx::Val __SetField(const ::String &inString,const hx::Val &inValue, hx::PropertyAccess inCallProp);
		static bool __SetStatic(const ::String &inString, Dynamic &ioValue, hx::PropertyAccess inCallProp);
		void __GetFields(Array< ::String> &outFields);
		static void __register();
		void __Mark(HX_MARK_PARAMS);
		void __Visit(HX_VISIT_PARAMS);
		::String __ToString() const { return HX_HCSTRING("DecimalImpl","\xf1","\x13","\x9e","\xfe"); }

		static void __boot();
		static  ::thx::bigint::DecimalImpl zero;
		static  ::thx::bigint::DecimalImpl one;
		static  ::thx::bigint::DecimalImpl ten;
		static  ::thx::bigint::DecimalImpl randomBetween( ::thx::bigint::DecimalImpl a, ::thx::bigint::DecimalImpl b);
		static ::Dynamic randomBetween_dyn();

		::Dynamic value;
		Int scale;
		 ::thx::bigint::DecimalImpl add( ::thx::bigint::DecimalImpl that);
		::Dynamic add_dyn();

		 ::thx::bigint::DecimalImpl subtract( ::thx::bigint::DecimalImpl that);
		::Dynamic subtract_dyn();

		 ::thx::bigint::DecimalImpl divide( ::thx::bigint::DecimalImpl that);
		::Dynamic divide_dyn();

		 ::thx::bigint::DecimalImpl divideWithScale( ::thx::bigint::DecimalImpl that,Int scale);
		::Dynamic divideWithScale_dyn();

		 ::thx::bigint::DecimalImpl moduloWithScale( ::thx::bigint::DecimalImpl that,Int scale);
		::Dynamic moduloWithScale_dyn();

		 ::thx::bigint::DecimalImpl multiply( ::thx::bigint::DecimalImpl that);
		::Dynamic multiply_dyn();

		 ::thx::bigint::DecimalImpl modulo( ::thx::bigint::DecimalImpl that);
		::Dynamic modulo_dyn();

		 ::thx::bigint::DecimalImpl abs();
		::Dynamic abs_dyn();

		 ::thx::bigint::DecimalImpl negate();
		::Dynamic negate_dyn();

		 ::thx::bigint::DecimalImpl next();
		::Dynamic next_dyn();

		 ::thx::bigint::DecimalImpl prev();
		::Dynamic prev_dyn();

		 ::thx::bigint::DecimalImpl pow(Int exp);
		::Dynamic pow_dyn();

		 ::thx::bigint::DecimalImpl ceilTo(Int newscale);
		::Dynamic ceilTo_dyn();

		 ::thx::bigint::DecimalImpl floorTo(Int newscale);
		::Dynamic floorTo_dyn();

		 ::thx::bigint::DecimalImpl roundTo(Int newscale);
		::Dynamic roundTo_dyn();

		 ::thx::bigint::DecimalImpl scaleTo(Int newscale);
		::Dynamic scaleTo_dyn();

		 ::thx::bigint::DecimalImpl square();
		::Dynamic square_dyn();

		Bool isNegative();
		::Dynamic isNegative_dyn();

		Bool isEven();
		::Dynamic isEven_dyn();

		Bool isOdd();
		::Dynamic isOdd_dyn();

		Bool isZero();
		::Dynamic isZero_dyn();

		Int compareTo( ::thx::bigint::DecimalImpl that);
		::Dynamic compareTo_dyn();

		Int compareToAbs( ::thx::bigint::DecimalImpl that);
		::Dynamic compareToAbs_dyn();

		 ::thx::bigint::DecimalImpl trim( ::Dynamic min);
		::Dynamic trim_dyn();

		Float toFloat();
		::Dynamic toFloat_dyn();

		Int toInt();
		::Dynamic toInt_dyn();

		virtual ::String toString();
		::Dynamic toString_dyn();

		 ::thx::bigint::DecimalImpl matchScale( ::thx::bigint::DecimalImpl that);
		::Dynamic matchScale_dyn();

};

} // end namespace thx
} // end namespace bigint

#endif /* INCLUDED_thx_bigint_DecimalImpl */ 
