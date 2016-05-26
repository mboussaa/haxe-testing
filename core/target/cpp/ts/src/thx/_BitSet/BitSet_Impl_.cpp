// Generated by Haxe 3.3.0
#include <hxcpp.h>

#include "hxMath.h"
#ifndef INCLUDED_Std
#include <Std.h>
#endif
#ifndef INCLUDED_haxe_StackItem
#include <haxe/StackItem.h>
#endif
#ifndef INCLUDED_thx_Arrays
#include <thx/Arrays.h>
#endif
#ifndef INCLUDED_thx_Error
#include <thx/Error.h>
#endif
#ifndef INCLUDED_thx_Ints
#include <thx/Ints.h>
#endif
#ifndef INCLUDED_thx__BitSet_BitSet_Impl_
#include <thx/_BitSet/BitSet_Impl_.h>
#endif

namespace thx{
namespace _BitSet{

void BitSet_Impl__obj::__construct() { }

Dynamic BitSet_Impl__obj::__CreateEmpty() { return new BitSet_Impl__obj; }

hx::ObjectPtr< BitSet_Impl__obj > BitSet_Impl__obj::__new()
{
	hx::ObjectPtr< BitSet_Impl__obj > _hx_result = new BitSet_Impl__obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic BitSet_Impl__obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< BitSet_Impl__obj > _hx_result = new BitSet_Impl__obj();
	_hx_result->__construct();
	return _hx_result;
}

Int BitSet_Impl__obj::blockSize;

::Array< Int > BitSet_Impl__obj::_new(Int length){
            	HX_STACK_FRAME("thx._BitSet.BitSet_Impl_","_new",0xfe1ba456,"thx._BitSet.BitSet_Impl_._new","thx/BitSet.hx",26,0x5a7aec5e)
            	HX_STACK_ARG(length,"length")
HXLINE(  26)		HX_VARI_NAME( ::Array< Int >,this1,"this") = ::Array_obj< Int >::__new(1)->init(0,length);
HXLINE(  29)		Int _hx_tmp = ::Std_obj::_hx_int(((Float)length / (Float)(int)32));
HXLINE(  30)		::thx::Arrays_obj::resize(this1,((_hx_tmp + (int)1) + (int)1),(int)0);
HXLINE(  26)		return this1;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(BitSet_Impl__obj,_new,return )

::Array< Int > BitSet_Impl__obj::empty( ::Dynamic __o_length){
 ::Dynamic length = __o_length.Default(0);
            	HX_STACK_FRAME("thx._BitSet.BitSet_Impl_","empty",0xcddac1f8,"thx._BitSet.BitSet_Impl_.empty","thx/BitSet.hx",38,0x5a7aec5e)
            	HX_STACK_ARG(length,"length")
HXLINE(  38)		HX_VARI_NAME( Int,length1,"length") = length;
HXDLIN(  38)		HX_VARI_NAME( ::Array< Int >,this1,"this") = ::Array_obj< Int >::__new(1)->init(0,length1);
HXDLIN(  38)		Int _hx_tmp = ::Std_obj::_hx_int(((Float)length1 / (Float)(int)32));
HXDLIN(  38)		::thx::Arrays_obj::resize(this1,((_hx_tmp + (int)1) + (int)1),(int)0);
HXDLIN(  38)		return this1;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(BitSet_Impl__obj,empty,return )

::Array< Int > BitSet_Impl__obj::fromBools(::Array< Bool > values){
            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_0) HXARGC(3)
            		::Array< Int > _hx_run(::Array< Int > acc,Bool value,Int i){
            			HX_STACK_FRAME("thx._BitSet.BitSet_Impl_","fromBools",0x7db1242a,"thx._BitSet.BitSet_Impl_.fromBools","thx/BitSet.hx",46,0x5a7aec5e)
            			HX_STACK_ARG(acc,"acc")
            			HX_STACK_ARG(value,"value")
            			HX_STACK_ARG(i,"i")
HXLINE(  47)			::thx::_BitSet::BitSet_Impl__obj::setAt(acc,i,value);
HXLINE(  48)			return acc;
            		}
            		HX_END_LOCAL_FUNC3(return)

            	HX_STACK_FRAME("thx._BitSet.BitSet_Impl_","fromBools",0x7db1242a,"thx._BitSet.BitSet_Impl_.fromBools","thx/BitSet.hx",46,0x5a7aec5e)
            	HX_STACK_ARG(values,"values")
HXLINE(  49)		HX_VARI_NAME( ::Array< Int >,this1,"this") = ::Array_obj< Int >::__new(1)->init(0,(int)0);
HXDLIN(  49)		::thx::Arrays_obj::resize(this1,(int)2,(int)0);
HXLINE(  46)		return ( (::Array< Int >)(::thx::Arrays_obj::reducei(values, ::Dynamic(new _hx_Closure_0()),this1)) );
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(BitSet_Impl__obj,fromBools,return )

::Array< Int > BitSet_Impl__obj::fromString(::String str){
            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_0) HXARGC(3)
            		::Array< Int > _hx_run(::Array< Int > acc,::String _hx_char,Int i){
            			HX_STACK_FRAME("thx._BitSet.BitSet_Impl_","fromString",0x2c59e290,"thx._BitSet.BitSet_Impl_.fromString","thx/BitSet.hx",58,0x5a7aec5e)
            			HX_STACK_ARG(acc,"acc")
            			HX_STACK_ARG(_hx_char,"_hx_char")
            			HX_STACK_ARG(i,"i")
HXLINE(  59)			::thx::_BitSet::BitSet_Impl__obj::setAt(acc,i,(_hx_char == HX_("1",31,00,00,00)));
HXLINE(  60)			return acc;
            		}
            		HX_END_LOCAL_FUNC3(return)

            	HX_STACK_FRAME("thx._BitSet.BitSet_Impl_","fromString",0x2c59e290,"thx._BitSet.BitSet_Impl_.fromString","thx/BitSet.hx",56,0x5a7aec5e)
            	HX_STACK_ARG(str,"str")
HXLINE(  57)		HX_VARI( ::Array< ::String >,chars) = str.split(HX_("",00,00,00,00));
HXLINE(  61)		HX_VARI_NAME( ::Array< Int >,this1,"this") = ::Array_obj< Int >::__new(1)->init(0,(int)0);
HXDLIN(  61)		::thx::Arrays_obj::resize(this1,(int)2,(int)0);
HXLINE(  58)		return ( (::Array< Int >)(::thx::Arrays_obj::reducei(chars, ::Dynamic(new _hx_Closure_0()),this1)) );
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(BitSet_Impl__obj,fromString,return )

::Array< Bool > BitSet_Impl__obj::toBools(::Array< Int > this1){
            		HX_BEGIN_LOCAL_FUNC_S1(hx::LocalFunc,_hx_Closure_0,::Array< Int >,this1) HXARGC(1)
            		Bool _hx_run(Int index){
            			HX_STACK_FRAME("thx._BitSet.BitSet_Impl_","toBools",0xc83de5b9,"thx._BitSet.BitSet_Impl_.toBools","thx/BitSet.hx",70,0x5a7aec5e)
            			HX_STACK_ARG(index,"index")
HXLINE(  70)			return ::thx::_BitSet::BitSet_Impl__obj::at(this1,index);
            		}
            		HX_END_LOCAL_FUNC1(return)

            	HX_STACK_FRAME("thx._BitSet.BitSet_Impl_","toBools",0xc83de5b9,"thx._BitSet.BitSet_Impl_.toBools","thx/BitSet.hx",69,0x5a7aec5e)
            	HX_STACK_ARG(this1,"this1")
HXLINE(  69)		return ::thx::Ints_obj::range(::thx::_BitSet::BitSet_Impl__obj::get_length(this1),null(),null())->map( ::Dynamic(new _hx_Closure_0(this1)));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(BitSet_Impl__obj,toBools,return )

::Array< Int > BitSet_Impl__obj::toInt32s(::Array< Int > this1){
            	HX_STACK_FRAME("thx._BitSet.BitSet_Impl_","toInt32s",0xaa26a6b5,"thx._BitSet.BitSet_Impl_.toInt32s","thx/BitSet.hx",75,0x5a7aec5e)
            	HX_STACK_ARG(this1,"this1")
HXLINE(  76)		HX_VARI( ::Array< Int >,parts) = this1->slice((int)1,null());
HXLINE(  79)		return parts;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(BitSet_Impl__obj,toInt32s,return )

Bool BitSet_Impl__obj::at(::Array< Int > this1,Int index){
            	HX_STACK_FRAME("thx._BitSet.BitSet_Impl_","at",0x3c67cca8,"thx._BitSet.BitSet_Impl_.at","thx/BitSet.hx",86,0x5a7aec5e)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(index,"index")
HXLINE(  87)		Bool _hx_tmp;
HXDLIN(  87)		if ((index >= (int)0)) {
HXLINE(  87)			_hx_tmp = (index >= ::thx::_BitSet::BitSet_Impl__obj::get_length(this1));
            		}
            		else {
HXLINE(  87)			_hx_tmp = true;
            		}
HXDLIN(  87)		if (_hx_tmp) {
HXLINE(  88)			HX_STACK_DO_THROW( ::thx::Error_obj::__new(((HX_("BitSet: index ",e9,11,52,8e) + index) + HX_(" out of bounds",2c,e4,47,e8)),null(),hx::SourceInfo(HX_("BitSet.hx",e9,3c,8f,53),88,HX_("thx._BitSet.BitSet_Impl_",99,35,ac,64),HX_("at",f3,54,00,00))));
            		}
HXLINE(  90)		Int _hx_tmp1 = ::Math_obj::floor(((Float)index / (Float)(int)32));
HXLINE(  93)		return (((int)this1->__get((_hx_tmp1 + (int)1)) & (int)((int)(int)1 << (int)hx::Mod(index,(int)32))) != (int)0);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(BitSet_Impl__obj,at,return )

Bool BitSet_Impl__obj::setAt(::Array< Int > this1,Int index,Bool value){
            	HX_STACK_FRAME("thx._BitSet.BitSet_Impl_","setAt",0xd83008a0,"thx._BitSet.BitSet_Impl_.setAt","thx/BitSet.hx",100,0x5a7aec5e)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(index,"index")
            	HX_STACK_ARG(value,"value")
HXLINE( 101)		Int _hx_tmp = ::Math_obj::floor(((Float)index / (Float)(int)32));
HXDLIN( 101)		HX_VARI( Int,blockIndex) = (_hx_tmp + (int)1);
HXLINE( 102)		Bool _hx_tmp1 = (blockIndex >= this1->length);
HXDLIN( 102)		if (_hx_tmp1) {
HXLINE( 103)			::thx::Arrays_obj::resize(this1,(blockIndex + (int)1),(int)0);
            		}
HXLINE( 105)		if ((this1->__get((int)0) <= index)) {
HXLINE( 106)			this1[(int)0] = (index + (int)1);
            		}
HXLINE( 107)		HX_VARI( Int,bitIndex) = hx::Mod(index,(int)32);
HXLINE( 108)		if (value) {
HXLINE( 109)			this1[blockIndex] = ((int)this1->__get(blockIndex) | (int)((int)(int)1 << (int)bitIndex));
            		}
            		else {
HXLINE( 111)			this1[blockIndex] = ((int)this1->__get(blockIndex) & (int)~(((int)(int)1 << (int)bitIndex)));
            		}
HXLINE( 113)		return value;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(BitSet_Impl__obj,setAt,return )

::Array< Int > BitSet_Impl__obj::clone(::Array< Int > this1){
            		HX_BEGIN_LOCAL_FUNC_S1(hx::LocalFunc,_hx_Closure_0,::Array< Int >,this1) HXARGC(2)
            		::Array< Int > _hx_run(::Array< Int > acc,Int i){
            			HX_STACK_FRAME("thx._BitSet.BitSet_Impl_","clone",0xa6639ac8,"thx._BitSet.BitSet_Impl_.clone","thx/BitSet.hx",120,0x5a7aec5e)
            			HX_STACK_ARG(acc,"acc")
            			HX_STACK_ARG(i,"i")
HXLINE( 121)			Bool _hx_tmp1 = ::thx::_BitSet::BitSet_Impl__obj::at(this1,i);
HXDLIN( 121)			::thx::_BitSet::BitSet_Impl__obj::setAt(acc,i,_hx_tmp1);
HXLINE( 122)			return acc;
            		}
            		HX_END_LOCAL_FUNC2(return)

            	HX_STACK_FRAME("thx._BitSet.BitSet_Impl_","clone",0xa6639ac8,"thx._BitSet.BitSet_Impl_.clone","thx/BitSet.hx",120,0x5a7aec5e)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 120)		::Array< Int > _hx_tmp = ::thx::Ints_obj::range(::thx::_BitSet::BitSet_Impl__obj::get_length(this1),null(),null());
HXLINE( 123)		HX_VARI_NAME( ::Array< Int >,this2,"this") = ::Array_obj< Int >::__new(1)->init(0,(int)0);
HXDLIN( 123)		::thx::Arrays_obj::resize(this2,(int)2,(int)0);
HXLINE( 120)		return ( (::Array< Int >)(::thx::Arrays_obj::reduce(_hx_tmp, ::Dynamic(new _hx_Closure_0(this1)),this2)) );
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(BitSet_Impl__obj,clone,return )

::Array< Int > BitSet_Impl__obj::setAll(::Array< Int > this1, ::Dynamic __o_value){
 ::Dynamic value = __o_value.Default(true);
            	HX_STACK_FRAME("thx._BitSet.BitSet_Impl_","setAll",0x51d77cd4,"thx._BitSet.BitSet_Impl_.setAll","thx/BitSet.hx",129,0x5a7aec5e)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(value,"value")
HXLINE( 130)		{
HXLINE( 130)			HX_VARI( Int,_g1) = (int)0;
HXDLIN( 130)			HX_VARI( Int,_g) = ::thx::_BitSet::BitSet_Impl__obj::get_length(this1);
HXDLIN( 130)			while((_g1 < _g)){
HXLINE( 130)				HX_VARI( Int,i) = _g1++;
HXLINE( 131)				::thx::_BitSet::BitSet_Impl__obj::setAt(this1,i,value);
            			}
            		}
HXLINE( 133)		return this1;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(BitSet_Impl__obj,setAll,return )

::Array< Int > BitSet_Impl__obj::clearAll(::Array< Int > this1){
            	HX_STACK_FRAME("thx._BitSet.BitSet_Impl_","clearAll",0x158da309,"thx._BitSet.BitSet_Impl_.clearAll","thx/BitSet.hx",140,0x5a7aec5e)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 140)		{
HXLINE( 140)			HX_VARI( Int,_g1) = (int)0;
HXDLIN( 140)			HX_VARI( Int,_g) = ::thx::_BitSet::BitSet_Impl__obj::get_length(this1);
HXDLIN( 140)			while((_g1 < _g)){
HXLINE( 140)				HX_VARI( Int,i) = _g1++;
HXDLIN( 140)				::thx::_BitSet::BitSet_Impl__obj::setAt(this1,i,false);
            			}
            		}
HXDLIN( 140)		return this1;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(BitSet_Impl__obj,clearAll,return )

::Array< Int > BitSet_Impl__obj::concat(::Array< Int > this1,::Array< Int > right){
            	HX_STACK_FRAME("thx._BitSet.BitSet_Impl_","concat",0xaa45ff49,"thx._BitSet.BitSet_Impl_.concat","thx/BitSet.hx",146,0x5a7aec5e)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(right,"right")
HXLINE( 147)		HX_VARI( ::Array< Int >,left) = this1;
HXLINE( 148)		HX_VARI( Int,length) = (::thx::_BitSet::BitSet_Impl__obj::get_length(left) + ::thx::_BitSet::BitSet_Impl__obj::get_length(right));
HXDLIN( 148)		HX_VARI_NAME( ::Array< Int >,this2,"this") = ::Array_obj< Int >::__new(1)->init(0,length);
HXDLIN( 148)		Int _hx_tmp = ::Std_obj::_hx_int(((Float)length / (Float)(int)32));
HXDLIN( 148)		::thx::Arrays_obj::resize(this2,((_hx_tmp + (int)1) + (int)1),(int)0);
HXDLIN( 148)		HX_VARI( ::Array< Int >,result) = this2;
HXLINE( 149)		HX_VARI( Int,index) = (int)0;
HXLINE( 150)		{
HXLINE( 150)			HX_VARI( Int,_g1) = (int)0;
HXDLIN( 150)			HX_VARI( Int,_g) = ::thx::_BitSet::BitSet_Impl__obj::get_length(left);
HXDLIN( 150)			while((_g1 < _g)){
HXLINE( 150)				HX_VARI( Int,leftIndex) = _g1++;
HXLINE( 151)				Int _hx_tmp1 = index++;
HXDLIN( 151)				Bool _hx_tmp2 = ::thx::_BitSet::BitSet_Impl__obj::at(left,leftIndex);
HXDLIN( 151)				::thx::_BitSet::BitSet_Impl__obj::setAt(result,_hx_tmp1,_hx_tmp2);
            			}
            		}
HXLINE( 153)		{
HXLINE( 153)			HX_VARI_NAME( Int,_g11,"_g1") = (int)0;
HXDLIN( 153)			HX_VARI_NAME( Int,_g2,"_g") = ::thx::_BitSet::BitSet_Impl__obj::get_length(right);
HXDLIN( 153)			while((_g11 < _g2)){
HXLINE( 153)				HX_VARI( Int,rightIndex) = _g11++;
HXLINE( 154)				Int _hx_tmp3 = index++;
HXDLIN( 154)				Bool _hx_tmp4 = ::thx::_BitSet::BitSet_Impl__obj::at(right,rightIndex);
HXDLIN( 154)				::thx::_BitSet::BitSet_Impl__obj::setAt(result,_hx_tmp3,_hx_tmp4);
            			}
            		}
HXLINE( 156)		return result;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(BitSet_Impl__obj,concat,return )

::Array< Int > BitSet_Impl__obj::expand(::Array< Int > this1,Int count){
            		HX_BEGIN_LOCAL_FUNC_S2(hx::LocalFunc,_hx_Closure_0,::Array< Int >,this1,Int,count) HXARGC(1)
            		::Array< Bool > _hx_run(Int index){
            			HX_STACK_FRAME("thx._BitSet.BitSet_Impl_","expand",0xa6e8e48f,"thx._BitSet.BitSet_Impl_.expand","thx/BitSet.hx",164,0x5a7aec5e)
            			HX_STACK_ARG(index,"index")
HXLINE( 164)			Int _hx_tmp1 = (count + (int)1);
HXDLIN( 164)			Bool _hx_tmp2 = ::thx::_BitSet::BitSet_Impl__obj::at(this1,index);
HXDLIN( 164)			return ::thx::Arrays_obj::create(_hx_tmp1,_hx_tmp2);
            		}
            		HX_END_LOCAL_FUNC1(return)

            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_1) HXARGC(3)
            		::Array< Int > _hx_run(::Array< Int > acc,Bool value,Int i){
            			HX_STACK_FRAME("thx._BitSet.BitSet_Impl_","expand",0xa6e8e48f,"thx._BitSet.BitSet_Impl_.expand","thx/BitSet.hx",163,0x5a7aec5e)
            			HX_STACK_ARG(acc,"acc")
            			HX_STACK_ARG(value,"value")
            			HX_STACK_ARG(i,"i")
HXLINE( 163)			::thx::_BitSet::BitSet_Impl__obj::setAt(acc,i,value);
HXDLIN( 163)			return acc;
            		}
            		HX_END_LOCAL_FUNC3(return)

            	HX_STACK_FRAME("thx._BitSet.BitSet_Impl_","expand",0xa6e8e48f,"thx._BitSet.BitSet_Impl_.expand","thx/BitSet.hx",163,0x5a7aec5e)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(count,"count")
HXLINE( 163)		HX_VARI( ::Array< Int >,array) = ::thx::Ints_obj::range(::thx::_BitSet::BitSet_Impl__obj::get_length(this1),null(),null());
HXDLIN( 163)		::Array< ::Dynamic> _hx_tmp = array->map( ::Dynamic(new _hx_Closure_0(this1,count)));
HXDLIN( 163)		HX_VARI( ::Array< Bool >,values) = ::thx::Arrays_obj::flatten(_hx_tmp);
HXDLIN( 163)		HX_VARI_NAME( ::Array< Int >,this2,"this") = ::Array_obj< Int >::__new(1)->init(0,(int)0);
HXDLIN( 163)		::thx::Arrays_obj::resize(this2,(int)2,(int)0);
HXDLIN( 163)		return ( (::Array< Int >)(::thx::Arrays_obj::reducei(values, ::Dynamic(new _hx_Closure_1()),this2)) );
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(BitSet_Impl__obj,expand,return )

::String BitSet_Impl__obj::toString(::Array< Int > this1){
            		HX_BEGIN_LOCAL_FUNC_S1(hx::LocalFunc,_hx_Closure_0,::Array< Int >,this1) HXARGC(1)
            		::String _hx_run(Int index){
            			HX_STACK_FRAME("thx._BitSet.BitSet_Impl_","toString",0x1cf67e21,"thx._BitSet.BitSet_Impl_.toString","thx/BitSet.hx",173,0x5a7aec5e)
            			HX_STACK_ARG(index,"index")
HXLINE( 173)			Bool _hx_tmp = ::thx::_BitSet::BitSet_Impl__obj::at(this1,index);
HXDLIN( 173)			if (_hx_tmp) {
HXLINE( 173)				return HX_("1",31,00,00,00);
            			}
            			else {
HXLINE( 173)				return HX_("0",30,00,00,00);
            			}
HXDLIN( 173)			return null();
            		}
            		HX_END_LOCAL_FUNC1(return)

            	HX_STACK_FRAME("thx._BitSet.BitSet_Impl_","toString",0x1cf67e21,"thx._BitSet.BitSet_Impl_.toString","thx/BitSet.hx",172,0x5a7aec5e)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 172)		return ::thx::Ints_obj::range(::thx::_BitSet::BitSet_Impl__obj::get_length(this1),null(),null())->map( ::Dynamic(new _hx_Closure_0(this1)))->join(HX_("",00,00,00,00));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(BitSet_Impl__obj,toString,return )

::Array< Int > BitSet_Impl__obj::_hx_and(::Array< Int > this1,::Array< Int > right){
            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_0) HXARGC(2)
            		Bool _hx_run(Bool l,Bool r){
            			HX_STACK_FRAME("thx._BitSet.BitSet_Impl_","and",0x9e6b4182,"thx._BitSet.BitSet_Impl_.and","thx/BitSet.hx",183,0x5a7aec5e)
            			HX_STACK_ARG(l,"l")
            			HX_STACK_ARG(r,"r")
HXLINE( 183)			if (l) {
HXLINE( 183)				return r;
            			}
            			else {
HXLINE( 183)				return false;
            			}
HXDLIN( 183)			return false;
            		}
            		HX_END_LOCAL_FUNC2(return)

            	HX_STACK_FRAME("thx._BitSet.BitSet_Impl_","and",0x9e6b4182,"thx._BitSet.BitSet_Impl_.and","thx/BitSet.hx",183,0x5a7aec5e)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(right,"right")
HXLINE( 183)		return ::thx::_BitSet::BitSet_Impl__obj::combine(this1,right, ::Dynamic(new _hx_Closure_0()));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(BitSet_Impl__obj,_hx_and,return )

::Array< Int > BitSet_Impl__obj::_hx_or(::Array< Int > this1,::Array< Int > right){
            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_0) HXARGC(2)
            		Bool _hx_run(Bool l,Bool r){
            			HX_STACK_FRAME("thx._BitSet.BitSet_Impl_","or",0x3c67d8d8,"thx._BitSet.BitSet_Impl_.or","thx/BitSet.hx",192,0x5a7aec5e)
            			HX_STACK_ARG(l,"l")
            			HX_STACK_ARG(r,"r")
HXLINE( 192)			if (!(l)) {
HXLINE( 192)				return r;
            			}
            			else {
HXLINE( 192)				return true;
            			}
HXDLIN( 192)			return false;
            		}
            		HX_END_LOCAL_FUNC2(return)

            	HX_STACK_FRAME("thx._BitSet.BitSet_Impl_","or",0x3c67d8d8,"thx._BitSet.BitSet_Impl_.or","thx/BitSet.hx",192,0x5a7aec5e)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(right,"right")
HXLINE( 192)		return ::thx::_BitSet::BitSet_Impl__obj::combine(this1,right, ::Dynamic(new _hx_Closure_0()));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(BitSet_Impl__obj,_hx_or,return )

::Array< Int > BitSet_Impl__obj::_hx_xor(::Array< Int > this1,::Array< Int > right){
            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_0) HXARGC(2)
            		Bool _hx_run(Bool l,Bool r){
            			HX_STACK_FRAME("thx._BitSet.BitSet_Impl_","xor",0x9e7cb646,"thx._BitSet.BitSet_Impl_.xor","thx/BitSet.hx",201,0x5a7aec5e)
            			HX_STACK_ARG(l,"l")
            			HX_STACK_ARG(r,"r")
HXLINE( 201)			Bool _hx_tmp;
HXDLIN( 201)			if (l) {
HXLINE( 201)				_hx_tmp = !(r);
            			}
            			else {
HXLINE( 201)				_hx_tmp = false;
            			}
HXDLIN( 201)			if (!(_hx_tmp)) {
HXLINE( 201)				if (!(l)) {
HXLINE( 201)					return r;
            				}
            				else {
HXLINE( 201)					return false;
            				}
            			}
            			else {
HXLINE( 201)				return true;
            			}
HXDLIN( 201)			return false;
            		}
            		HX_END_LOCAL_FUNC2(return)

            	HX_STACK_FRAME("thx._BitSet.BitSet_Impl_","xor",0x9e7cb646,"thx._BitSet.BitSet_Impl_.xor","thx/BitSet.hx",201,0x5a7aec5e)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(right,"right")
HXLINE( 201)		return ::thx::_BitSet::BitSet_Impl__obj::combine(this1,right, ::Dynamic(new _hx_Closure_0()));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(BitSet_Impl__obj,_hx_xor,return )

::Array< Int > BitSet_Impl__obj::negate(::Array< Int > this1){
            		HX_BEGIN_LOCAL_FUNC_S1(hx::LocalFunc,_hx_Closure_0,::Array< Int >,this1) HXARGC(2)
            		::Array< Int > _hx_run(::Array< Int > acc,Int i){
            			HX_STACK_FRAME("thx._BitSet.BitSet_Impl_","negate",0x498f37f7,"thx._BitSet.BitSet_Impl_.negate","thx/BitSet.hx",210,0x5a7aec5e)
            			HX_STACK_ARG(acc,"acc")
            			HX_STACK_ARG(i,"i")
HXLINE( 211)			::thx::_BitSet::BitSet_Impl__obj::setAt(acc,i,!(::thx::_BitSet::BitSet_Impl__obj::at(this1,i)));
HXLINE( 212)			return acc;
            		}
            		HX_END_LOCAL_FUNC2(return)

            	HX_STACK_FRAME("thx._BitSet.BitSet_Impl_","negate",0x498f37f7,"thx._BitSet.BitSet_Impl_.negate","thx/BitSet.hx",210,0x5a7aec5e)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 210)		::Array< Int > _hx_tmp = ::thx::Ints_obj::range(::thx::_BitSet::BitSet_Impl__obj::get_length(this1),null(),null());
HXLINE( 213)		HX_VARI_NAME( ::Array< Int >,this2,"this") = ::Array_obj< Int >::__new(1)->init(0,(int)0);
HXDLIN( 213)		::thx::Arrays_obj::resize(this2,(int)2,(int)0);
HXLINE( 210)		return ( (::Array< Int >)(::thx::Arrays_obj::reduce(_hx_tmp, ::Dynamic(new _hx_Closure_0(this1)),this2)) );
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(BitSet_Impl__obj,negate,return )

Bool BitSet_Impl__obj::equals(::Array< Int > this1,::Array< Int > other){
            	HX_STACK_FRAME("thx._BitSet.BitSet_Impl_","equals",0xa268e474,"thx._BitSet.BitSet_Impl_.equals","thx/BitSet.hx",217,0x5a7aec5e)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(other,"other")
HXLINE( 218)		if ((::thx::_BitSet::BitSet_Impl__obj::get_length(this1) != ::thx::_BitSet::BitSet_Impl__obj::get_length(other))) {
HXLINE( 218)			return false;
            		}
HXLINE( 219)		{
HXLINE( 219)			HX_VARI( Int,_g1) = (int)0;
HXDLIN( 219)			HX_VARI( Int,_g) = ::thx::_BitSet::BitSet_Impl__obj::get_length(this1);
HXDLIN( 219)			while((_g1 < _g)){
HXLINE( 219)				HX_VARI( Int,i) = _g1++;
HXLINE( 220)				Bool _hx_tmp = ::thx::_BitSet::BitSet_Impl__obj::at(this1,i);
HXDLIN( 220)				Bool _hx_tmp1 = ::thx::_BitSet::BitSet_Impl__obj::at(other,i);
HXDLIN( 220)				if ((_hx_tmp != _hx_tmp1)) {
HXLINE( 220)					return false;
            				}
            			}
            		}
HXLINE( 222)		return true;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(BitSet_Impl__obj,equals,return )

Bool BitSet_Impl__obj::notEquals(::Array< Int > this1,::Array< Int > other){
            	HX_STACK_FRAME("thx._BitSet.BitSet_Impl_","notEquals",0x4f0be49d,"thx._BitSet.BitSet_Impl_.notEquals","thx/BitSet.hx",227,0x5a7aec5e)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(other,"other")
HXLINE( 227)		return !(::thx::_BitSet::BitSet_Impl__obj::equals(this1,other));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(BitSet_Impl__obj,notEquals,return )

::Array< Int > BitSet_Impl__obj::combine(::Array< Int > this1,::Array< Int > right, ::Dynamic combiner){
            		HX_BEGIN_LOCAL_FUNC_S3(hx::LocalFunc,_hx_Closure_0,::Array< Int >,right,::Array< Int >,left, ::Dynamic,combiner) HXARGC(2)
            		::Array< Int > _hx_run(::Array< Int > acc,Int i){
            			HX_STACK_FRAME("thx._BitSet.BitSet_Impl_","combine",0xbeefa2aa,"thx._BitSet.BitSet_Impl_.combine","thx/BitSet.hx",233,0x5a7aec5e)
            			HX_STACK_ARG(acc,"acc")
            			HX_STACK_ARG(i,"i")
HXLINE( 234)			HX_VARI( Bool,leftBit) = ::thx::_BitSet::BitSet_Impl__obj::at(left,i);
HXLINE( 235)			HX_VARI( Bool,rightBit) = ::thx::_BitSet::BitSet_Impl__obj::at(right,i);
HXLINE( 236)			Bool _hx_tmp1 = ( (Bool)(combiner(leftBit,rightBit)) );
HXDLIN( 236)			::thx::_BitSet::BitSet_Impl__obj::setAt(acc,i,_hx_tmp1);
HXLINE( 237)			return acc;
            		}
            		HX_END_LOCAL_FUNC2(return)

            	HX_STACK_FRAME("thx._BitSet.BitSet_Impl_","combine",0xbeefa2aa,"thx._BitSet.BitSet_Impl_.combine","thx/BitSet.hx",230,0x5a7aec5e)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(right,"right")
            	HX_STACK_ARG(combiner,"combiner")
HXLINE( 231)		HX_VARI( ::Array< Int >,left) = this1;
HXLINE( 232)		HX_VARI( Int,a) = ::thx::_BitSet::BitSet_Impl__obj::get_length(left);
HXDLIN( 232)		HX_VARI( Int,b) = ::thx::_BitSet::BitSet_Impl__obj::get_length(right);
HXDLIN( 232)		HX_VAR( Int,length);
HXDLIN( 232)		if ((a > b)) {
HXLINE( 232)			length = a;
            		}
            		else {
HXLINE( 232)			length = b;
            		}
HXLINE( 233)		::Array< Int > _hx_tmp = ::thx::Ints_obj::range(length,null(),null());
HXLINE( 238)		HX_VARI_NAME( ::Array< Int >,this2,"this") = ::Array_obj< Int >::__new(1)->init(0,(int)0);
HXDLIN( 238)		::thx::Arrays_obj::resize(this2,(int)2,(int)0);
HXLINE( 233)		return ( (::Array< Int >)(::thx::Arrays_obj::reduce(_hx_tmp, ::Dynamic(new _hx_Closure_0(right,left,combiner)),this2)) );
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(BitSet_Impl__obj,combine,return )

Int BitSet_Impl__obj::get_length(::Array< Int > this1){
            	HX_STACK_FRAME("thx._BitSet.BitSet_Impl_","get_length",0x6774b964,"thx._BitSet.BitSet_Impl_.get_length","thx/BitSet.hx",242,0x5a7aec5e)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 242)		return this1->__get((int)0);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(BitSet_Impl__obj,get_length,return )


BitSet_Impl__obj::BitSet_Impl__obj()
{
}

bool BitSet_Impl__obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 2:
		if (HX_FIELD_EQ(inName,"at") ) { outValue = at_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"or") ) { outValue = _hx_or_dyn(); return true; }
		break;
	case 3:
		if (HX_FIELD_EQ(inName,"and") ) { outValue = _hx_and_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"xor") ) { outValue = _hx_xor_dyn(); return true; }
		break;
	case 4:
		if (HX_FIELD_EQ(inName,"_new") ) { outValue = _new_dyn(); return true; }
		break;
	case 5:
		if (HX_FIELD_EQ(inName,"empty") ) { outValue = empty_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"setAt") ) { outValue = setAt_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"clone") ) { outValue = clone_dyn(); return true; }
		break;
	case 6:
		if (HX_FIELD_EQ(inName,"setAll") ) { outValue = setAll_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"concat") ) { outValue = concat_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"expand") ) { outValue = expand_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"negate") ) { outValue = negate_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"equals") ) { outValue = equals_dyn(); return true; }
		break;
	case 7:
		if (HX_FIELD_EQ(inName,"toBools") ) { outValue = toBools_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"combine") ) { outValue = combine_dyn(); return true; }
		break;
	case 8:
		if (HX_FIELD_EQ(inName,"toInt32s") ) { outValue = toInt32s_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"clearAll") ) { outValue = clearAll_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"toString") ) { outValue = toString_dyn(); return true; }
		break;
	case 9:
		if (HX_FIELD_EQ(inName,"fromBools") ) { outValue = fromBools_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"notEquals") ) { outValue = notEquals_dyn(); return true; }
		break;
	case 10:
		if (HX_FIELD_EQ(inName,"fromString") ) { outValue = fromString_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"get_length") ) { outValue = get_length_dyn(); return true; }
	}
	return false;
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *BitSet_Impl__obj_sMemberStorageInfo = 0;
static hx::StaticInfo BitSet_Impl__obj_sStaticStorageInfo[] = {
	{hx::fsInt,(void *) &BitSet_Impl__obj::blockSize,HX_HCSTRING("blockSize","\xae","\x6c","\xe2","\x51")},
	{ hx::fsUnknown, 0, null()}
};
#endif

static void BitSet_Impl__obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(BitSet_Impl__obj::__mClass,"__mClass");
	HX_MARK_MEMBER_NAME(BitSet_Impl__obj::blockSize,"blockSize");
};

#ifdef HXCPP_VISIT_ALLOCS
static void BitSet_Impl__obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(BitSet_Impl__obj::__mClass,"__mClass");
	HX_VISIT_MEMBER_NAME(BitSet_Impl__obj::blockSize,"blockSize");
};

#endif

hx::Class BitSet_Impl__obj::__mClass;

static ::String BitSet_Impl__obj_sStaticFields[] = {
	HX_HCSTRING("blockSize","\xae","\x6c","\xe2","\x51"),
	HX_HCSTRING("_new","\x61","\x15","\x1f","\x3f"),
	HX_HCSTRING("empty","\x8d","\x3a","\xda","\x6f"),
	HX_HCSTRING("fromBools","\x3f","\x0b","\x81","\x6b"),
	HX_HCSTRING("fromString","\xdb","\x2d","\x74","\x54"),
	HX_HCSTRING("toBools","\x8e","\x6d","\x7c","\x83"),
	HX_HCSTRING("toInt32s","\x40","\xf9","\x9e","\xc5"),
	HX_HCSTRING("at","\xf3","\x54","\x00","\x00"),
	HX_HCSTRING("setAt","\x35","\x81","\x2f","\x7a"),
	HX_HCSTRING("clone","\x5d","\x13","\x63","\x48"),
	HX_HCSTRING("setAll","\x9f","\x86","\x61","\x6f"),
	HX_HCSTRING("clearAll","\x94","\xf5","\x05","\x31"),
	HX_HCSTRING("concat","\x14","\x09","\xd0","\xc7"),
	HX_HCSTRING("expand","\x5a","\xee","\x72","\xc4"),
	HX_HCSTRING("toString","\xac","\xd0","\x6e","\x38"),
	HX_HCSTRING("and","\xd7","\xfa","\x49","\x00"),
	HX_HCSTRING("or","\x23","\x61","\x00","\x00"),
	HX_HCSTRING("xor","\x9b","\x6f","\x5b","\x00"),
	HX_HCSTRING("negate","\xc2","\x41","\x19","\x67"),
	HX_HCSTRING("equals","\x3f","\xee","\xf2","\xbf"),
	HX_HCSTRING("notEquals","\xb2","\xcb","\xdb","\x3c"),
	HX_HCSTRING("combine","\x7f","\x2a","\x2e","\x7a"),
	HX_HCSTRING("get_length","\xaf","\x04","\x8f","\x8f"),
	::String(null())
};

void BitSet_Impl__obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx._BitSet.BitSet_Impl_","\x99","\x35","\xac","\x64");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &BitSet_Impl__obj::__GetStatic;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = BitSet_Impl__obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(BitSet_Impl__obj_sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< BitSet_Impl__obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = BitSet_Impl__obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = BitSet_Impl__obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = BitSet_Impl__obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

void BitSet_Impl__obj::__boot()
{
{
            	HX_STACK_FRAME("thx._BitSet.BitSet_Impl_","boot",0x00181327,"thx._BitSet.BitSet_Impl_.boot","thx/BitSet.hx",16,0x5a7aec5e)
HXLINE(  16)		blockSize = (int)32;
            	}
}

} // end namespace thx
} // end namespace _BitSet
