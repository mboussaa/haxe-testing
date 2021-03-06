// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx__Decimal_Decimal_Impl_
#define INCLUDED_thx__Decimal_Decimal_Impl_

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

#include <cpp/Int64.h>
HX_DECLARE_CLASS2(thx,_Decimal,Decimal_Impl_)
HX_DECLARE_CLASS2(thx,bigint,BigIntImpl)
HX_DECLARE_CLASS2(thx,bigint,DecimalImpl)

namespace thx{
namespace _Decimal{


class HXCPP_CLASS_ATTRIBUTES Decimal_Impl__obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef Decimal_Impl__obj OBJ_;
		Decimal_Impl__obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="thx._Decimal.Decimal_Impl_")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"thx._Decimal.Decimal_Impl_"); }
		static hx::ObjectPtr< Decimal_Impl__obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~Decimal_Impl__obj();

		HX_DO_RTTI_ALL;
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("Decimal_Impl_","\xd1","\x83","\xb4","\x80"); }

		static void __boot();
		static  ::thx::bigint::DecimalImpl zero;
		static  ::thx::bigint::DecimalImpl one;
		static  ::thx::bigint::DecimalImpl fromInt64( ::cpp::Int64Struct value);
		static ::Dynamic fromInt64_dyn();

		static  ::thx::bigint::DecimalImpl fromBigInt(::Dynamic value);
		static ::Dynamic fromBigInt_dyn();

		static  ::thx::bigint::DecimalImpl fromInt(Int value);
		static ::Dynamic fromInt_dyn();

		static  ::thx::bigint::DecimalImpl fromFloat(Float value);
		static ::Dynamic fromFloat_dyn();

		static  ::thx::bigint::DecimalImpl fromString(::String value);
		static ::Dynamic fromString_dyn();

		static  ::thx::bigint::DecimalImpl randomBetween( ::thx::bigint::DecimalImpl a, ::thx::bigint::DecimalImpl b);
		static ::Dynamic randomBetween_dyn();

		static Int compare( ::thx::bigint::DecimalImpl a, ::thx::bigint::DecimalImpl b);
		static ::Dynamic compare_dyn();

		static Bool isZero( ::thx::bigint::DecimalImpl this1);
		static ::Dynamic isZero_dyn();

		static  ::thx::bigint::DecimalImpl abs( ::thx::bigint::DecimalImpl this1);
		static ::Dynamic abs_dyn();

		static Int compareTo( ::thx::bigint::DecimalImpl this1, ::thx::bigint::DecimalImpl that);
		static ::Dynamic compareTo_dyn();

		static Int compareAbs( ::thx::bigint::DecimalImpl this1, ::thx::bigint::DecimalImpl that);
		static ::Dynamic compareAbs_dyn();

		static  ::thx::bigint::DecimalImpl next( ::thx::bigint::DecimalImpl this1);
		static ::Dynamic next_dyn();

		static  ::thx::bigint::DecimalImpl prev( ::thx::bigint::DecimalImpl this1);
		static ::Dynamic prev_dyn();

		static  ::thx::bigint::DecimalImpl square( ::thx::bigint::DecimalImpl this1);
		static ::Dynamic square_dyn();

		static  ::thx::bigint::DecimalImpl pow( ::thx::bigint::DecimalImpl this1,Int exp);
		static ::Dynamic pow_dyn();

		static Bool isEven( ::thx::bigint::DecimalImpl this1);
		static ::Dynamic isEven_dyn();

		static Bool isOdd( ::thx::bigint::DecimalImpl this1);
		static ::Dynamic isOdd_dyn();

		static Bool isNegative( ::thx::bigint::DecimalImpl this1);
		static ::Dynamic isNegative_dyn();

		static Bool isPositive( ::thx::bigint::DecimalImpl this1);
		static ::Dynamic isPositive_dyn();

		static  ::thx::bigint::DecimalImpl max( ::thx::bigint::DecimalImpl this1, ::thx::bigint::DecimalImpl that);
		static ::Dynamic max_dyn();

		static  ::thx::bigint::DecimalImpl min( ::thx::bigint::DecimalImpl this1, ::thx::bigint::DecimalImpl that);
		static ::Dynamic min_dyn();

		static  ::thx::bigint::DecimalImpl ceil( ::thx::bigint::DecimalImpl this1);
		static ::Dynamic ceil_dyn();

		static  ::thx::bigint::DecimalImpl ceilTo( ::thx::bigint::DecimalImpl this1,Int decimals);
		static ::Dynamic ceilTo_dyn();

		static  ::thx::bigint::DecimalImpl floor( ::thx::bigint::DecimalImpl this1);
		static ::Dynamic floor_dyn();

		static  ::thx::bigint::DecimalImpl floorTo( ::thx::bigint::DecimalImpl this1,Int decimals);
		static ::Dynamic floorTo_dyn();

		static  ::thx::bigint::DecimalImpl round( ::thx::bigint::DecimalImpl this1);
		static ::Dynamic round_dyn();

		static  ::thx::bigint::DecimalImpl roundTo( ::thx::bigint::DecimalImpl this1,Int decimals);
		static ::Dynamic roundTo_dyn();

		static  ::thx::bigint::DecimalImpl scaleTo( ::thx::bigint::DecimalImpl this1,Int decimals);
		static ::Dynamic scaleTo_dyn();

		static  ::thx::bigint::DecimalImpl trim( ::thx::bigint::DecimalImpl this1, ::Dynamic mindecimals);
		static ::Dynamic trim_dyn();

		static Bool greaterThan( ::thx::bigint::DecimalImpl this1, ::thx::bigint::DecimalImpl that);
		static ::Dynamic greaterThan_dyn();

		static Bool greater( ::thx::bigint::DecimalImpl self, ::thx::bigint::DecimalImpl that);
		static ::Dynamic greater_dyn();

		static Bool greaterEqualsTo( ::thx::bigint::DecimalImpl this1, ::thx::bigint::DecimalImpl that);
		static ::Dynamic greaterEqualsTo_dyn();

		static Bool greaterEquals( ::thx::bigint::DecimalImpl self, ::thx::bigint::DecimalImpl that);
		static ::Dynamic greaterEquals_dyn();

		static Bool lessThan( ::thx::bigint::DecimalImpl this1, ::thx::bigint::DecimalImpl that);
		static ::Dynamic lessThan_dyn();

		static Bool less( ::thx::bigint::DecimalImpl self, ::thx::bigint::DecimalImpl that);
		static ::Dynamic less_dyn();

		static Bool lessEqualsTo( ::thx::bigint::DecimalImpl this1, ::thx::bigint::DecimalImpl that);
		static ::Dynamic lessEqualsTo_dyn();

		static Bool lessEquals( ::thx::bigint::DecimalImpl self, ::thx::bigint::DecimalImpl that);
		static ::Dynamic lessEquals_dyn();

		static Bool equalsTo( ::thx::bigint::DecimalImpl this1, ::thx::bigint::DecimalImpl that);
		static ::Dynamic equalsTo_dyn();

		static Bool equals( ::thx::bigint::DecimalImpl self, ::thx::bigint::DecimalImpl that);
		static ::Dynamic equals_dyn();

		static Bool notEqualsTo( ::thx::bigint::DecimalImpl this1, ::thx::bigint::DecimalImpl that);
		static ::Dynamic notEqualsTo_dyn();

		static Bool notEquals( ::thx::bigint::DecimalImpl self, ::thx::bigint::DecimalImpl that);
		static ::Dynamic notEquals_dyn();

		static  ::thx::bigint::DecimalImpl add( ::thx::bigint::DecimalImpl this1, ::thx::bigint::DecimalImpl that);
		static ::Dynamic add_dyn();

		static  ::thx::bigint::DecimalImpl subtract( ::thx::bigint::DecimalImpl this1, ::thx::bigint::DecimalImpl that);
		static ::Dynamic subtract_dyn();

		static  ::thx::bigint::DecimalImpl negate( ::thx::bigint::DecimalImpl this1);
		static ::Dynamic negate_dyn();

		static  ::thx::bigint::DecimalImpl preIncrement( ::thx::bigint::DecimalImpl this1);
		static ::Dynamic preIncrement_dyn();

		static  ::thx::bigint::DecimalImpl postIncrement( ::thx::bigint::DecimalImpl this1);
		static ::Dynamic postIncrement_dyn();

		static  ::thx::bigint::DecimalImpl preDecrement( ::thx::bigint::DecimalImpl this1);
		static ::Dynamic preDecrement_dyn();

		static  ::thx::bigint::DecimalImpl postDecrement( ::thx::bigint::DecimalImpl this1);
		static ::Dynamic postDecrement_dyn();

		static  ::thx::bigint::DecimalImpl multiply( ::thx::bigint::DecimalImpl this1, ::thx::bigint::DecimalImpl that);
		static ::Dynamic multiply_dyn();

		static  ::thx::bigint::DecimalImpl divide( ::thx::bigint::DecimalImpl this1, ::thx::bigint::DecimalImpl that);
		static ::Dynamic divide_dyn();

		static  ::thx::bigint::DecimalImpl modulo( ::thx::bigint::DecimalImpl this1, ::thx::bigint::DecimalImpl that);
		static ::Dynamic modulo_dyn();

		static Int toInt( ::thx::bigint::DecimalImpl this1);
		static ::Dynamic toInt_dyn();

		static  ::cpp::Int64Struct toInt64( ::thx::bigint::DecimalImpl this1);
		static ::Dynamic toInt64_dyn();

		static ::Dynamic toBigInt( ::thx::bigint::DecimalImpl this1);
		static ::Dynamic toBigInt_dyn();

		static Float toFloat( ::thx::bigint::DecimalImpl this1);
		static ::Dynamic toFloat_dyn();

		static ::String toString( ::thx::bigint::DecimalImpl this1);
		static ::Dynamic toString_dyn();

		static Int get_divisionScale();
		static ::Dynamic get_divisionScale_dyn();

		static Int set_divisionScale(Int v);
		static ::Dynamic set_divisionScale_dyn();

};

} // end namespace thx
} // end namespace _Decimal

#endif /* INCLUDED_thx__Decimal_Decimal_Impl_ */ 
