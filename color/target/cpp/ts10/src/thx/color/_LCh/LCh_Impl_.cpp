// Generated by Haxe 3.3.0
#include <hxcpp.h>

#include "hxMath.h"
#ifndef INCLUDED_thx_ArrayFloats
#include <thx/ArrayFloats.h>
#endif
#ifndef INCLUDED_thx_Floats
#include <thx/Floats.h>
#endif
#ifndef INCLUDED_thx_color__LCh_LCh_Impl_
#include <thx/color/_LCh/LCh_Impl_.h>
#endif
#ifndef INCLUDED_thx_color__Lab_Lab_Impl_
#include <thx/color/_Lab/Lab_Impl_.h>
#endif
#ifndef INCLUDED_thx_color__Rgbx_Rgbx_Impl_
#include <thx/color/_Rgbx/Rgbx_Impl_.h>
#endif
#ifndef INCLUDED_thx_color__Rgbxa_Rgbxa_Impl_
#include <thx/color/_Rgbxa/Rgbxa_Impl_.h>
#endif
#ifndef INCLUDED_thx_color__Xyz_Xyz_Impl_
#include <thx/color/_Xyz/Xyz_Impl_.h>
#endif
#ifndef INCLUDED_thx_color_parse_ChannelInfo
#include <thx/color/parse/ChannelInfo.h>
#endif
#ifndef INCLUDED_thx_color_parse_ColorInfo
#include <thx/color/parse/ColorInfo.h>
#endif
#ifndef INCLUDED_thx_color_parse_ColorParser
#include <thx/color/parse/ColorParser.h>
#endif

namespace thx{
namespace color{
namespace _LCh{

void LCh_Impl__obj::__construct() { }

Dynamic LCh_Impl__obj::__CreateEmpty() { return new LCh_Impl__obj; }

hx::ObjectPtr< LCh_Impl__obj > LCh_Impl__obj::__new()
{
	hx::ObjectPtr< LCh_Impl__obj > _hx_result = new LCh_Impl__obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic LCh_Impl__obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< LCh_Impl__obj > _hx_result = new LCh_Impl__obj();
	_hx_result->__construct();
	return _hx_result;
}

::Array< Float > LCh_Impl__obj::create(Float lightness,Float chroma,Float hue){
            	HX_STACK_FRAME("thx.color._LCh.LCh_Impl_","create",0xa73d3b00,"thx.color._LCh.LCh_Impl_.create","thx/color/LCh.hx",34,0x11f20364)
            	HX_STACK_ARG(lightness,"lightness")
            	HX_STACK_ARG(chroma,"chroma")
            	HX_STACK_ARG(hue,"hue")
HXLINE(  34)		return ::Array_obj< Float >::__new(3)->init(0,lightness)->init(1,chroma)->init(2,hue);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(LCh_Impl__obj,create,return )

::Array< Float > LCh_Impl__obj::fromFloats(::Array< Float > arr){
            	HX_STACK_FRAME("thx.color._LCh.LCh_Impl_","fromFloats",0x8adc4e65,"thx.color._LCh.LCh_Impl_.fromFloats","thx/color/LCh.hx",40,0x11f20364)
            	HX_STACK_ARG(arr,"arr")
HXLINE(  41)		::thx::ArrayFloats_obj::resize(arr,(int)3,null());
HXLINE(  42)		return ::Array_obj< Float >::__new(3)->init(0,arr->__get((int)0))->init(1,arr->__get((int)1))->init(2,arr->__get((int)2));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(LCh_Impl__obj,fromFloats,return )

::Array< Float > LCh_Impl__obj::fromString(::String color){
            	HX_STACK_FRAME("thx.color._LCh.LCh_Impl_","fromString",0x5ab653df,"thx.color._LCh.LCh_Impl_.fromString","thx/color/LCh.hx",46,0x11f20364)
            	HX_STACK_ARG(color,"color")
HXLINE(  47)		HX_VARI(  ::thx::color::parse::ColorInfo,info) = ::thx::color::parse::ColorParser_obj::parseColor(color);
HXLINE(  48)		if (hx::IsNull( info )) {
HXLINE(  49)			return null();
            		}
HXLINE(  51)		try {
            			HX_STACK_CATCHABLE( ::Dynamic, 0);
HXLINE(  51)			::String _hx_switch_0 = info->name;
            			if (  (_hx_switch_0==HX_("hcl",11,41,4f,00)) ){
HXLINE(  55)				HX_VARI( ::Array< Float >,c) = ::thx::color::parse::ColorParser_obj::getFloatChannels(info->channels,(int)3,false);
HXLINE(  51)				return ::Array_obj< Float >::__new(3)->init(0,c->__get((int)2))->init(1,c->__get((int)1))->init(2,c->__get((int)0));
HXLINE(  54)				goto _hx_goto_0;
            			}
            			if (  (_hx_switch_0==HX_("cielch",72,78,7c,4d)) ||  (_hx_switch_0==HX_("lch",11,4a,52,00)) ){
HXLINE(  53)				HX_VARI( ::Array< Float >,channels) = ::thx::color::parse::ColorParser_obj::getFloatChannels(info->channels,(int)3,false);
HXLINE(  51)				return channels;
HXLINE(  53)				goto _hx_goto_0;
            			}
            			/* default */{
HXLINE(  51)				return null();
            			}
            			_hx_goto_0:;
            		}
            		catch( ::Dynamic _hx_e){
            			if (_hx_e.IsClass<  ::Dynamic >() ){
            				HX_STACK_BEGIN_CATCH
            				 ::Dynamic e = _hx_e;
HXLINE(  51)				return null();
            			}
            			else {
            				HX_STACK_DO_THROW(_hx_e);
            			}
            		}
HXDLIN(  51)		return null();
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(LCh_Impl__obj,fromString,return )

::Array< Float > LCh_Impl__obj::_new(::Array< Float > channels){
            	HX_STACK_FRAME("thx.color._LCh.LCh_Impl_","_new",0xa9712065,"thx.color._LCh.LCh_Impl_._new","thx/color/LCh.hx",62,0x11f20364)
            	HX_STACK_ARG(channels,"channels")
HXLINE(  62)		return channels;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(LCh_Impl__obj,_new,return )

 ::Dynamic LCh_Impl__obj::analogous(::Array< Float > this1,hx::Null< Float >  __o_spread){
Float spread = __o_spread.Default(((Float)30.0));
            	HX_STACK_FRAME("thx.color._LCh.LCh_Impl_","analogous",0x120a4ed9,"thx.color._LCh.LCh_Impl_.analogous","thx/color/LCh.hx",66,0x11f20364)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(spread,"spread")
HXLINE(  66)		return  ::Dynamic(hx::Anon_obj::Create(2)
            			->setFixed(0,HX_("_0",f1,52,00,00),::thx::color::_LCh::LCh_Impl__obj::rotate(this1,-(spread)))
            			->setFixed(1,HX_("_1",f2,52,00,00),::thx::color::_LCh::LCh_Impl__obj::rotate(this1,spread)));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(LCh_Impl__obj,analogous,return )

::Array< Float > LCh_Impl__obj::complement(::Array< Float > this1){
            	HX_STACK_FRAME("thx.color._LCh.LCh_Impl_","complement",0x03f668ea,"thx.color._LCh.LCh_Impl_.complement","thx/color/LCh.hx",72,0x11f20364)
            	HX_STACK_ARG(this1,"this1")
HXLINE(  72)		return ::thx::color::_LCh::LCh_Impl__obj::rotate(this1,(int)180);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(LCh_Impl__obj,complement,return )

::Array< Float > LCh_Impl__obj::interpolate(::Array< Float > this1,::Array< Float > other,Float t){
            	HX_STACK_FRAME("thx.color._LCh.LCh_Impl_","interpolate",0x92d1f23d,"thx.color._LCh.LCh_Impl_.interpolate","thx/color/LCh.hx",75,0x11f20364)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(other,"other")
            	HX_STACK_ARG(t,"t")
HXLINE(  75)		return ::Array_obj< Float >::__new(3)->init(0,::thx::Floats_obj::interpolate(t,this1->__get((int)0),other->__get((int)0)))->init(1,::thx::Floats_obj::interpolate(t,this1->__get((int)1),other->__get((int)1)))->init(2,::thx::Floats_obj::interpolateAngle(t,this1->__get((int)2),other->__get((int)2),(int)360));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(LCh_Impl__obj,interpolate,return )

::Array< Float > LCh_Impl__obj::interpolateWidest(::Array< Float > this1,::Array< Float > other,Float t){
            	HX_STACK_FRAME("thx.color._LCh.LCh_Impl_","interpolateWidest",0xb8f66991,"thx.color._LCh.LCh_Impl_.interpolateWidest","thx/color/LCh.hx",82,0x11f20364)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(other,"other")
            	HX_STACK_ARG(t,"t")
HXLINE(  82)		return ::Array_obj< Float >::__new(3)->init(0,::thx::Floats_obj::interpolate(t,this1->__get((int)0),other->__get((int)0)))->init(1,::thx::Floats_obj::interpolate(t,this1->__get((int)1),other->__get((int)1)))->init(2,::thx::Floats_obj::interpolateAngleWidest(t,this1->__get((int)2),other->__get((int)2),(int)360));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(LCh_Impl__obj,interpolateWidest,return )

::Array< Float > LCh_Impl__obj::min(::Array< Float > this1,::Array< Float > other){
            	HX_STACK_FRAME("thx.color._LCh.LCh_Impl_","min",0x1c5a530e,"thx.color._LCh.LCh_Impl_.min","thx/color/LCh.hx",89,0x11f20364)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(other,"other")
HXLINE(  89)		HX_VARI( Float,lightness) = ::Math_obj::min(this1->__get((int)0),other->__get((int)0));
HXDLIN(  89)		HX_VARI( Float,chroma) = ::Math_obj::min(this1->__get((int)1),other->__get((int)1));
HXDLIN(  89)		HX_VARI( Float,hue) = ::Math_obj::min(this1->__get((int)2),other->__get((int)2));
HXDLIN(  89)		return ::Array_obj< Float >::__new(3)->init(0,lightness)->init(1,chroma)->init(2,hue);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(LCh_Impl__obj,min,return )

::Array< Float > LCh_Impl__obj::max(::Array< Float > this1,::Array< Float > other){
            	HX_STACK_FRAME("thx.color._LCh.LCh_Impl_","max",0x1c5a4c20,"thx.color._LCh.LCh_Impl_.max","thx/color/LCh.hx",92,0x11f20364)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(other,"other")
HXLINE(  92)		HX_VARI( Float,lightness) = ::Math_obj::max(this1->__get((int)0),other->__get((int)0));
HXDLIN(  92)		HX_VARI( Float,chroma) = ::Math_obj::max(this1->__get((int)1),other->__get((int)1));
HXDLIN(  92)		HX_VARI( Float,hue) = ::Math_obj::max(this1->__get((int)2),other->__get((int)2));
HXDLIN(  92)		return ::Array_obj< Float >::__new(3)->init(0,lightness)->init(1,chroma)->init(2,hue);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(LCh_Impl__obj,max,return )

::Array< Float > LCh_Impl__obj::normalize(::Array< Float > this1){
            	HX_STACK_FRAME("thx.color._LCh.LCh_Impl_","normalize",0x1e74be09,"thx.color._LCh.LCh_Impl_.normalize","thx/color/LCh.hx",95,0x11f20364)
            	HX_STACK_ARG(this1,"this1")
HXLINE(  95)		HX_VARI( Float,hue) = ::thx::Floats_obj::wrapCircular(this1->__get((int)2),(int)360);
HXDLIN(  95)		HX_VAR_NAME( ::Array< Float >,this2,"this");
HXDLIN(  95)		HX_VARI( Float,v) = this1->__get((int)0);
HXDLIN(  95)		Float _hx_tmp;
HXDLIN(  95)		if ((v < (int)0)) {
HXLINE(  95)			_hx_tmp = (int)0;
            		}
            		else {
HXLINE(  95)			if ((v > (int)1)) {
HXLINE(  95)				_hx_tmp = (int)1;
            			}
            			else {
HXLINE(  95)				_hx_tmp = v;
            			}
            		}
HXDLIN(  95)		HX_VARI_NAME( Float,v1,"v") = this1->__get((int)1);
HXDLIN(  95)		Float _hx_tmp1;
HXDLIN(  95)		if ((v1 < (int)0)) {
HXLINE(  95)			_hx_tmp1 = (int)0;
            		}
            		else {
HXLINE(  95)			if ((v1 > (int)1)) {
HXLINE(  95)				_hx_tmp1 = (int)1;
            			}
            			else {
HXLINE(  95)				_hx_tmp1 = v1;
            			}
            		}
HXDLIN(  95)		this2 = ::Array_obj< Float >::__new(3)->init(0,_hx_tmp)->init(1,_hx_tmp1)->init(2,hue);
HXDLIN(  95)		return this2;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(LCh_Impl__obj,normalize,return )

::Array< Float > LCh_Impl__obj::rotate(::Array< Float > this1,Float angle){
            	HX_STACK_FRAME("thx.color._LCh.LCh_Impl_","rotate",0xf64e1a5f,"thx.color._LCh.LCh_Impl_.rotate","thx/color/LCh.hx",98,0x11f20364)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(angle,"angle")
HXLINE(  98)		return ::thx::color::_LCh::LCh_Impl__obj::normalize(::thx::color::_LCh::LCh_Impl__obj::withHue(this1,(this1->__get((int)2) + angle)));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(LCh_Impl__obj,rotate,return )

::Array< Float > LCh_Impl__obj::roundTo(::Array< Float > this1,Int decimals){
            	HX_STACK_FRAME("thx.color._LCh.LCh_Impl_","roundTo",0x29fb20e5,"thx.color._LCh.LCh_Impl_.roundTo","thx/color/LCh.hx",101,0x11f20364)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(decimals,"decimals")
HXLINE( 101)		HX_VARI( Float,lightness) = ::thx::Floats_obj::roundTo(this1->__get((int)0),decimals);
HXDLIN( 101)		HX_VARI( Float,chroma) = ::thx::Floats_obj::roundTo(this1->__get((int)1),decimals);
HXDLIN( 101)		HX_VARI( Float,hue) = ::thx::Floats_obj::roundTo(this1->__get((int)2),decimals);
HXDLIN( 101)		return ::Array_obj< Float >::__new(3)->init(0,lightness)->init(1,chroma)->init(2,hue);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(LCh_Impl__obj,roundTo,return )

 ::Dynamic LCh_Impl__obj::split(::Array< Float > this1,hx::Null< Float >  __o_spread){
Float spread = __o_spread.Default(((Float)144.0));
            	HX_STACK_FRAME("thx.color._LCh.LCh_Impl_","split",0x1ee68356,"thx.color._LCh.LCh_Impl_.split","thx/color/LCh.hx",104,0x11f20364)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(spread,"spread")
HXLINE( 104)		return  ::Dynamic(hx::Anon_obj::Create(2)
            			->setFixed(0,HX_("_0",f1,52,00,00),::thx::color::_LCh::LCh_Impl__obj::rotate(this1,-(spread)))
            			->setFixed(1,HX_("_1",f2,52,00,00),::thx::color::_LCh::LCh_Impl__obj::rotate(this1,spread)));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(LCh_Impl__obj,split,return )

 ::Dynamic LCh_Impl__obj::square(::Array< Float > this1){
            	HX_STACK_FRAME("thx.color._LCh.LCh_Impl_","square",0x841fd4a1,"thx.color._LCh.LCh_Impl_.square","thx/color/LCh.hx",110,0x11f20364)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 110)		return ::thx::color::_LCh::LCh_Impl__obj::tetrad(this1,(int)90);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(LCh_Impl__obj,square,return )

 ::Dynamic LCh_Impl__obj::tetrad(::Array< Float > this1,Float angle){
            	HX_STACK_FRAME("thx.color._LCh.LCh_Impl_","tetrad",0x010fdbd6,"thx.color._LCh.LCh_Impl_.tetrad","thx/color/LCh.hx",113,0x11f20364)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(angle,"angle")
HXLINE( 113)		return  ::Dynamic(hx::Anon_obj::Create(4)
            			->setFixed(0,HX_("_0",f1,52,00,00),::thx::color::_LCh::LCh_Impl__obj::rotate(this1,(int)0))
            			->setFixed(1,HX_("_1",f2,52,00,00),::thx::color::_LCh::LCh_Impl__obj::rotate(this1,angle))
            			->setFixed(2,HX_("_2",f3,52,00,00),::thx::color::_LCh::LCh_Impl__obj::rotate(this1,(int)180))
            			->setFixed(3,HX_("_3",f4,52,00,00),::thx::color::_LCh::LCh_Impl__obj::rotate(this1,((int)180 + angle))));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(LCh_Impl__obj,tetrad,return )

 ::Dynamic LCh_Impl__obj::triad(::Array< Float > this1){
            	HX_STACK_FRAME("thx.color._LCh.LCh_Impl_","triad",0xb39d374a,"thx.color._LCh.LCh_Impl_.triad","thx/color/LCh.hx",121,0x11f20364)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 121)		return  ::Dynamic(hx::Anon_obj::Create(3)
            			->setFixed(0,HX_("_0",f1,52,00,00),::thx::color::_LCh::LCh_Impl__obj::rotate(this1,(int)-120))
            			->setFixed(1,HX_("_1",f2,52,00,00),::thx::color::_LCh::LCh_Impl__obj::rotate(this1,(int)0))
            			->setFixed(2,HX_("_2",f3,52,00,00),::thx::color::_LCh::LCh_Impl__obj::rotate(this1,(int)120)));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(LCh_Impl__obj,triad,return )

::Array< Float > LCh_Impl__obj::withLightness(::Array< Float > this1,Float newlightness){
            	HX_STACK_FRAME("thx.color._LCh.LCh_Impl_","withLightness",0x4fe02203,"thx.color._LCh.LCh_Impl_.withLightness","thx/color/LCh.hx",128,0x11f20364)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(newlightness,"newlightness")
HXLINE( 128)		return ::Array_obj< Float >::__new(3)->init(0,newlightness)->init(1,this1->__get((int)1))->init(2,this1->__get((int)2));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(LCh_Impl__obj,withLightness,return )

::Array< Float > LCh_Impl__obj::withChroma(::Array< Float > this1,Float newchroma){
            	HX_STACK_FRAME("thx.color._LCh.LCh_Impl_","withChroma",0xb4bc5220,"thx.color._LCh.LCh_Impl_.withChroma","thx/color/LCh.hx",131,0x11f20364)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(newchroma,"newchroma")
HXLINE( 131)		return ::Array_obj< Float >::__new(3)->init(0,this1->__get((int)0))->init(1,newchroma)->init(2,this1->__get((int)2));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(LCh_Impl__obj,withChroma,return )

::Array< Float > LCh_Impl__obj::withHue(::Array< Float > this1,Float newhue){
            	HX_STACK_FRAME("thx.color._LCh.LCh_Impl_","withHue",0xfc4f49ce,"thx.color._LCh.LCh_Impl_.withHue","thx/color/LCh.hx",134,0x11f20364)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(newhue,"newhue")
HXLINE( 134)		return ::Array_obj< Float >::__new(3)->init(0,this1->__get((int)0))->init(1,this1->__get((int)1))->init(2,newhue);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(LCh_Impl__obj,withHue,return )

Bool LCh_Impl__obj::equals(::Array< Float > this1,::Array< Float > other){
            	HX_STACK_FRAME("thx.color._LCh.LCh_Impl_","equals",0xeb20c243,"thx.color._LCh.LCh_Impl_.equals","thx/color/LCh.hx",137,0x11f20364)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(other,"other")
HXLINE( 137)		return ::thx::color::_LCh::LCh_Impl__obj::nearEquals(this1,other,null());
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(LCh_Impl__obj,equals,return )

Bool LCh_Impl__obj::nearEquals(::Array< Float > this1,::Array< Float > other, ::Dynamic __o_tolerance){
 ::Dynamic tolerance = __o_tolerance.Default(((Float)1e-9));
            	HX_STACK_FRAME("thx.color._LCh.LCh_Impl_","nearEquals",0x04b3974b,"thx.color._LCh.LCh_Impl_.nearEquals","thx/color/LCh.hx",140,0x11f20364)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(other,"other")
            	HX_STACK_ARG(tolerance,"tolerance")
HXLINE( 140)		Bool _hx_tmp;
HXDLIN( 140)		Float _hx_tmp1 = ::Math_obj::abs(::thx::Floats_obj::angleDifference(this1->__get((int)0),other->__get((int)0),((Float)360.0)));
HXDLIN( 140)		if (hx::IsLessEq( _hx_tmp1,tolerance )) {
HXLINE( 140)			_hx_tmp = ::thx::Floats_obj::nearEquals(this1->__get((int)1),other->__get((int)1),tolerance);
            		}
            		else {
HXLINE( 140)			_hx_tmp = false;
            		}
HXDLIN( 140)		if (_hx_tmp) {
HXLINE( 140)			return ::thx::Floats_obj::nearEquals(this1->__get((int)2),other->__get((int)2),tolerance);
            		}
            		else {
HXLINE( 140)			return false;
            		}
HXDLIN( 140)		return false;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(LCh_Impl__obj,nearEquals,return )

::String LCh_Impl__obj::toString(::Array< Float > this1){
            	HX_STACK_FRAME("thx.color._LCh.LCh_Impl_","toString",0xe9bcadb0,"thx.color._LCh.LCh_Impl_.toString","thx/color/LCh.hx",143,0x11f20364)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 143)		return ((((((HX_("lch(",f7,84,ae,47) + this1->__get((int)0)) + HX_(",",2c,00,00,00)) + this1->__get((int)1)) + HX_(",",2c,00,00,00)) + this1->__get((int)2)) + HX_(")",29,00,00,00));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(LCh_Impl__obj,toString,return )

::String LCh_Impl__obj::toHclString(::Array< Float > this1){
            	HX_STACK_FRAME("thx.color._LCh.LCh_Impl_","toHclString",0x7bec1143,"thx.color._LCh.LCh_Impl_.toHclString","thx/color/LCh.hx",146,0x11f20364)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 146)		return ((((((HX_("hcl(",f7,ad,09,45) + this1->__get((int)2)) + HX_(",",2c,00,00,00)) + this1->__get((int)1)) + HX_(",",2c,00,00,00)) + this1->__get((int)0)) + HX_(")",29,00,00,00));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(LCh_Impl__obj,toHclString,return )

::Array< Float > LCh_Impl__obj::toLab(::Array< Float > this1){
            	HX_STACK_FRAME("thx.color._LCh.LCh_Impl_","toLab",0xb18b920e,"thx.color._LCh.LCh_Impl_.toLab","thx/color/LCh.hx",148,0x11f20364)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 149)		HX_VARI( Float,hradi) = (this1->__get((int)2) * ((Float)::Math_obj::PI / (Float)(int)180));
HXLINE( 150)		Float _hx_tmp = ::Math_obj::cos(hradi);
HXLINE( 149)		HX_VARI( Float,a) = (_hx_tmp * this1->__get((int)1));
HXLINE( 151)		Float _hx_tmp1 = ::Math_obj::sin(hradi);
HXLINE( 152)		return ::Array_obj< Float >::__new(3)->init(0,this1->__get((int)0))->init(1,a)->init(2,(_hx_tmp1 * this1->__get((int)1)));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(LCh_Impl__obj,toLab,return )

::Array< Float > LCh_Impl__obj::toLuv(::Array< Float > this1){
            	HX_STACK_FRAME("thx.color._LCh.LCh_Impl_","toLuv",0xb18ba38e,"thx.color._LCh.LCh_Impl_.toLuv","thx/color/LCh.hx",156,0x11f20364)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 156)		::Array< Float > _hx_tmp = ::thx::color::_LCh::LCh_Impl__obj::toRgbx(this1);
HXDLIN( 156)		return ::thx::color::_Rgbx::Rgbx_Impl__obj::toLuv(_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(LCh_Impl__obj,toLuv,return )

::Array< Float > LCh_Impl__obj::toCmy(::Array< Float > this1){
            	HX_STACK_FRAME("thx.color._LCh.LCh_Impl_","toCmy",0xb184c850,"thx.color._LCh.LCh_Impl_.toCmy","thx/color/LCh.hx",159,0x11f20364)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 159)		::Array< Float > _hx_tmp = ::thx::color::_LCh::LCh_Impl__obj::toRgbx(this1);
HXDLIN( 159)		return ::thx::color::_Rgbx::Rgbx_Impl__obj::toCmy(_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(LCh_Impl__obj,toCmy,return )

::Array< Float > LCh_Impl__obj::toCmyk(::Array< Float > this1){
            	HX_STACK_FRAME("thx.color._LCh.LCh_Impl_","toCmyk",0xa2aa7e1b,"thx.color._LCh.LCh_Impl_.toCmyk","thx/color/LCh.hx",162,0x11f20364)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 162)		::Array< Float > _hx_tmp = ::thx::color::_LCh::LCh_Impl__obj::toRgbx(this1);
HXDLIN( 162)		return ::thx::color::_Rgbx::Rgbx_Impl__obj::toCmyk(_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(LCh_Impl__obj,toCmyk,return )

::Array< Float > LCh_Impl__obj::toCubeHelix(::Array< Float > this1){
            	HX_STACK_FRAME("thx.color._LCh.LCh_Impl_","toCubeHelix",0x971fdbca,"thx.color._LCh.LCh_Impl_.toCubeHelix","thx/color/LCh.hx",165,0x11f20364)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 165)		HX_VARI_NAME( ::Array< Float >,this2,"this") = ::thx::color::_LCh::LCh_Impl__obj::toRgbx(this1);
HXDLIN( 165)		return ::thx::color::_Rgbx::Rgbx_Impl__obj::toCubeHelixWithGamma(this2,(int)1);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(LCh_Impl__obj,toCubeHelix,return )

Float LCh_Impl__obj::toGrey(::Array< Float > this1){
            	HX_STACK_FRAME("thx.color._LCh.LCh_Impl_","toGrey",0xa553127e,"thx.color._LCh.LCh_Impl_.toGrey","thx/color/LCh.hx",168,0x11f20364)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 168)		::Array< Float > _hx_tmp = ::thx::color::_LCh::LCh_Impl__obj::toRgbx(this1);
HXDLIN( 168)		return ::thx::color::_Rgbx::Rgbx_Impl__obj::toGrey(_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(LCh_Impl__obj,toGrey,return )

::Array< Float > LCh_Impl__obj::toHsl(::Array< Float > this1){
            	HX_STACK_FRAME("thx.color._LCh.LCh_Impl_","toHsl",0xb18898c2,"thx.color._LCh.LCh_Impl_.toHsl","thx/color/LCh.hx",171,0x11f20364)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 171)		::Array< Float > _hx_tmp = ::thx::color::_LCh::LCh_Impl__obj::toRgbx(this1);
HXDLIN( 171)		return ::thx::color::_Rgbx::Rgbx_Impl__obj::toHsl(_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(LCh_Impl__obj,toHsl,return )

::Array< Float > LCh_Impl__obj::toHsv(::Array< Float > this1){
            	HX_STACK_FRAME("thx.color._LCh.LCh_Impl_","toHsv",0xb18898cc,"thx.color._LCh.LCh_Impl_.toHsv","thx/color/LCh.hx",174,0x11f20364)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 174)		::Array< Float > _hx_tmp = ::thx::color::_LCh::LCh_Impl__obj::toRgbx(this1);
HXDLIN( 174)		return ::thx::color::_Rgbx::Rgbx_Impl__obj::toHsv(_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(LCh_Impl__obj,toHsv,return )

::Array< Float > LCh_Impl__obj::toHunterLab(::Array< Float > this1){
            	HX_STACK_FRAME("thx.color._LCh.LCh_Impl_","toHunterLab",0x63512cee,"thx.color._LCh.LCh_Impl_.toHunterLab","thx/color/LCh.hx",177,0x11f20364)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 177)		::Array< Float > _hx_tmp = ::thx::color::_LCh::LCh_Impl__obj::toXyz(this1);
HXDLIN( 177)		return ::thx::color::_Xyz::Xyz_Impl__obj::toHunterLab(_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(LCh_Impl__obj,toHunterLab,return )

Int LCh_Impl__obj::toRgb(::Array< Float > this1){
            	HX_STACK_FRAME("thx.color._LCh.LCh_Impl_","toRgb",0xb19024ce,"thx.color._LCh.LCh_Impl_.toRgb","thx/color/LCh.hx",180,0x11f20364)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 180)		::Array< Float > _hx_tmp = ::thx::color::_LCh::LCh_Impl__obj::toRgbx(this1);
HXDLIN( 180)		return ::thx::color::_Rgbx::Rgbx_Impl__obj::toRgb(_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(LCh_Impl__obj,toRgb,return )

Int LCh_Impl__obj::toRgba(::Array< Float > this1){
            	HX_STACK_FRAME("thx.color._LCh.LCh_Impl_","toRgba",0xac900fd3,"thx.color._LCh.LCh_Impl_.toRgba","thx/color/LCh.hx",183,0x11f20364)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 183)		::Array< Float > _hx_tmp = ::thx::color::_LCh::LCh_Impl__obj::toRgbxa(this1);
HXDLIN( 183)		return ::thx::color::_Rgbxa::Rgbxa_Impl__obj::toRgba(_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(LCh_Impl__obj,toRgba,return )

::Array< Float > LCh_Impl__obj::toRgbx(::Array< Float > this1){
            	HX_STACK_FRAME("thx.color._LCh.LCh_Impl_","toRgbx",0xac900fea,"thx.color._LCh.LCh_Impl_.toRgbx","thx/color/LCh.hx",186,0x11f20364)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 186)		::Array< Float > _hx_tmp = ::thx::color::_LCh::LCh_Impl__obj::toLab(this1);
HXDLIN( 186)		return ::thx::color::_Lab::Lab_Impl__obj::toRgbx(_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(LCh_Impl__obj,toRgbx,return )

::Array< Float > LCh_Impl__obj::toRgbxa(::Array< Float > this1){
            	HX_STACK_FRAME("thx.color._LCh.LCh_Impl_","toRgbxa",0x517ddd37,"thx.color._LCh.LCh_Impl_.toRgbxa","thx/color/LCh.hx",189,0x11f20364)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 189)		::Array< Float > _hx_tmp = ::thx::color::_LCh::LCh_Impl__obj::toRgbx(this1);
HXDLIN( 189)		return ::thx::color::_Rgbx::Rgbx_Impl__obj::toRgbxa(_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(LCh_Impl__obj,toRgbxa,return )

Float LCh_Impl__obj::toTemperature(::Array< Float > this1){
            	HX_STACK_FRAME("thx.color._LCh.LCh_Impl_","toTemperature",0x2dbb26f5,"thx.color._LCh.LCh_Impl_.toTemperature","thx/color/LCh.hx",192,0x11f20364)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 192)		::Array< Float > _hx_tmp = ::thx::color::_LCh::LCh_Impl__obj::toRgbx(this1);
HXDLIN( 192)		return ::thx::color::_Rgbx::Rgbx_Impl__obj::toTemperature(_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(LCh_Impl__obj,toTemperature,return )

::Array< Float > LCh_Impl__obj::toXyz(::Array< Float > this1){
            	HX_STACK_FRAME("thx.color._LCh.LCh_Impl_","toXyz",0xb194c21a,"thx.color._LCh.LCh_Impl_.toXyz","thx/color/LCh.hx",195,0x11f20364)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 195)		::Array< Float > _hx_tmp = ::thx::color::_LCh::LCh_Impl__obj::toLab(this1);
HXDLIN( 195)		return ::thx::color::_Lab::Lab_Impl__obj::toXyz(_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(LCh_Impl__obj,toXyz,return )

::Array< Float > LCh_Impl__obj::toYuv(::Array< Float > this1){
            	HX_STACK_FRAME("thx.color._LCh.LCh_Impl_","toYuv",0xb19580db,"thx.color._LCh.LCh_Impl_.toYuv","thx/color/LCh.hx",198,0x11f20364)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 198)		::Array< Float > _hx_tmp = ::thx::color::_LCh::LCh_Impl__obj::toRgbx(this1);
HXDLIN( 198)		return ::thx::color::_Rgbx::Rgbx_Impl__obj::toYuv(_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(LCh_Impl__obj,toYuv,return )

::Array< Float > LCh_Impl__obj::toYxy(::Array< Float > this1){
            	HX_STACK_FRAME("thx.color._LCh.LCh_Impl_","toYxy",0xb195837b,"thx.color._LCh.LCh_Impl_.toYxy","thx/color/LCh.hx",201,0x11f20364)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 201)		::Array< Float > _hx_tmp = ::thx::color::_LCh::LCh_Impl__obj::toLab(this1);
HXDLIN( 201)		return ::thx::color::_Lab::Lab_Impl__obj::toYxy(_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(LCh_Impl__obj,toYxy,return )

Float LCh_Impl__obj::get_lightness(::Array< Float > this1){
            	HX_STACK_FRAME("thx.color._LCh.LCh_Impl_","get_lightness",0x88697cc0,"thx.color._LCh.LCh_Impl_.get_lightness","thx/color/LCh.hx",204,0x11f20364)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 204)		return this1->__get((int)0);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(LCh_Impl__obj,get_lightness,return )

Float LCh_Impl__obj::get_chroma(::Array< Float > this1){
            	HX_STACK_FRAME("thx.color._LCh.LCh_Impl_","get_chroma",0xb9798f43,"thx.color._LCh.LCh_Impl_.get_chroma","thx/color/LCh.hx",206,0x11f20364)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 206)		return this1->__get((int)1);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(LCh_Impl__obj,get_chroma,return )

Float LCh_Impl__obj::get_hue(::Array< Float > this1){
            	HX_STACK_FRAME("thx.color._LCh.LCh_Impl_","get_hue",0xc3afc8cb,"thx.color._LCh.LCh_Impl_.get_hue","thx/color/LCh.hx",208,0x11f20364)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 208)		return this1->__get((int)2);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(LCh_Impl__obj,get_hue,return )


LCh_Impl__obj::LCh_Impl__obj()
{
}

bool LCh_Impl__obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 3:
		if (HX_FIELD_EQ(inName,"min") ) { outValue = min_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"max") ) { outValue = max_dyn(); return true; }
		break;
	case 4:
		if (HX_FIELD_EQ(inName,"_new") ) { outValue = _new_dyn(); return true; }
		break;
	case 5:
		if (HX_FIELD_EQ(inName,"split") ) { outValue = split_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"triad") ) { outValue = triad_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"toLab") ) { outValue = toLab_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"toLuv") ) { outValue = toLuv_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"toCmy") ) { outValue = toCmy_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"toHsl") ) { outValue = toHsl_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"toHsv") ) { outValue = toHsv_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"toRgb") ) { outValue = toRgb_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"toXyz") ) { outValue = toXyz_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"toYuv") ) { outValue = toYuv_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"toYxy") ) { outValue = toYxy_dyn(); return true; }
		break;
	case 6:
		if (HX_FIELD_EQ(inName,"create") ) { outValue = create_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"rotate") ) { outValue = rotate_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"square") ) { outValue = square_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"tetrad") ) { outValue = tetrad_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"equals") ) { outValue = equals_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"toCmyk") ) { outValue = toCmyk_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"toGrey") ) { outValue = toGrey_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"toRgba") ) { outValue = toRgba_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"toRgbx") ) { outValue = toRgbx_dyn(); return true; }
		break;
	case 7:
		if (HX_FIELD_EQ(inName,"roundTo") ) { outValue = roundTo_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"withHue") ) { outValue = withHue_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"toRgbxa") ) { outValue = toRgbxa_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"get_hue") ) { outValue = get_hue_dyn(); return true; }
		break;
	case 8:
		if (HX_FIELD_EQ(inName,"toString") ) { outValue = toString_dyn(); return true; }
		break;
	case 9:
		if (HX_FIELD_EQ(inName,"analogous") ) { outValue = analogous_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"normalize") ) { outValue = normalize_dyn(); return true; }
		break;
	case 10:
		if (HX_FIELD_EQ(inName,"fromFloats") ) { outValue = fromFloats_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"fromString") ) { outValue = fromString_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"complement") ) { outValue = complement_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"withChroma") ) { outValue = withChroma_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"nearEquals") ) { outValue = nearEquals_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"get_chroma") ) { outValue = get_chroma_dyn(); return true; }
		break;
	case 11:
		if (HX_FIELD_EQ(inName,"interpolate") ) { outValue = interpolate_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"toHclString") ) { outValue = toHclString_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"toCubeHelix") ) { outValue = toCubeHelix_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"toHunterLab") ) { outValue = toHunterLab_dyn(); return true; }
		break;
	case 13:
		if (HX_FIELD_EQ(inName,"withLightness") ) { outValue = withLightness_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"toTemperature") ) { outValue = toTemperature_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"get_lightness") ) { outValue = get_lightness_dyn(); return true; }
		break;
	case 17:
		if (HX_FIELD_EQ(inName,"interpolateWidest") ) { outValue = interpolateWidest_dyn(); return true; }
	}
	return false;
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *LCh_Impl__obj_sMemberStorageInfo = 0;
static hx::StaticInfo *LCh_Impl__obj_sStaticStorageInfo = 0;
#endif

static void LCh_Impl__obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(LCh_Impl__obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void LCh_Impl__obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(LCh_Impl__obj::__mClass,"__mClass");
};

#endif

hx::Class LCh_Impl__obj::__mClass;

static ::String LCh_Impl__obj_sStaticFields[] = {
	HX_HCSTRING("create","\xfc","\x66","\x0f","\x7c"),
	HX_HCSTRING("fromFloats","\x61","\x28","\x9a","\x84"),
	HX_HCSTRING("fromString","\xdb","\x2d","\x74","\x54"),
	HX_HCSTRING("_new","\x61","\x15","\x1f","\x3f"),
	HX_HCSTRING("analogous","\x5d","\xc8","\x36","\x9f"),
	HX_HCSTRING("complement","\xe6","\x42","\xb4","\xfd"),
	HX_HCSTRING("interpolate","\xc1","\xd4","\x32","\x1f"),
	HX_HCSTRING("interpolateWidest","\x15","\x07","\x3e","\x31"),
	HX_HCSTRING("min","\x92","\x11","\x53","\x00"),
	HX_HCSTRING("max","\xa4","\x0a","\x53","\x00"),
	HX_HCSTRING("normalize","\x8d","\x37","\xa1","\xab"),
	HX_HCSTRING("rotate","\x5b","\x46","\x20","\xcb"),
	HX_HCSTRING("roundTo","\x69","\x71","\x0f","\x8d"),
	HX_HCSTRING("split","\xda","\xea","\x6e","\x81"),
	HX_HCSTRING("square","\x9d","\x00","\xf2","\x58"),
	HX_HCSTRING("tetrad","\xd2","\x07","\xe2","\xd5"),
	HX_HCSTRING("triad","\xce","\x9e","\x25","\x16"),
	HX_HCSTRING("withLightness","\x87","\xad","\x21","\x60"),
	HX_HCSTRING("withChroma","\x1c","\x2c","\x7a","\xae"),
	HX_HCSTRING("withHue","\x52","\x9a","\x63","\x5f"),
	HX_HCSTRING("equals","\x3f","\xee","\xf2","\xbf"),
	HX_HCSTRING("nearEquals","\x47","\x71","\x71","\xfe"),
	HX_HCSTRING("toString","\xac","\xd0","\x6e","\x38"),
	HX_HCSTRING("toHclString","\xc7","\xf3","\x4c","\x08"),
	HX_HCSTRING("toLab","\x92","\xf9","\x13","\x14"),
	HX_HCSTRING("toLuv","\x12","\x0b","\x14","\x14"),
	HX_HCSTRING("toCmy","\xd4","\x2f","\x0d","\x14"),
	HX_HCSTRING("toCmyk","\x17","\xaa","\x7c","\x77"),
	HX_HCSTRING("toCubeHelix","\x4e","\xbe","\x80","\x23"),
	HX_HCSTRING("toGrey","\x7a","\x3e","\x25","\x7a"),
	HX_HCSTRING("toHsl","\x46","\x00","\x11","\x14"),
	HX_HCSTRING("toHsv","\x50","\x00","\x11","\x14"),
	HX_HCSTRING("toHunterLab","\x72","\x0f","\xb2","\xef"),
	HX_HCSTRING("toRgb","\x52","\x8c","\x18","\x14"),
	HX_HCSTRING("toRgba","\xcf","\x3b","\x62","\x81"),
	HX_HCSTRING("toRgbx","\xe6","\x3b","\x62","\x81"),
	HX_HCSTRING("toRgbxa","\xbb","\x2d","\x92","\xb4"),
	HX_HCSTRING("toTemperature","\x79","\xb2","\xfc","\x3d"),
	HX_HCSTRING("toXyz","\x9e","\x29","\x1d","\x14"),
	HX_HCSTRING("toYuv","\x5f","\xe8","\x1d","\x14"),
	HX_HCSTRING("toYxy","\xff","\xea","\x1d","\x14"),
	HX_HCSTRING("get_lightness","\x44","\x08","\xab","\x98"),
	HX_HCSTRING("get_chroma","\x3f","\x69","\x37","\xb3"),
	HX_HCSTRING("get_hue","\x4f","\x19","\xc4","\x26"),
	::String(null())
};

void LCh_Impl__obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.color._LCh.LCh_Impl_","\xea","\x33","\x46","\xb7");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &LCh_Impl__obj::__GetStatic;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = LCh_Impl__obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(LCh_Impl__obj_sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< LCh_Impl__obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = LCh_Impl__obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = LCh_Impl__obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = LCh_Impl__obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx
} // end namespace color
} // end namespace _LCh