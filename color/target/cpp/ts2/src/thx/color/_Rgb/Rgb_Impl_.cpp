// Generated by Haxe 3.3.0
#include <hxcpp.h>

#include "hxMath.h"
#ifndef INCLUDED_StringTools
#include <StringTools.h>
#endif
#ifndef INCLUDED_thx_ArrayInts
#include <thx/ArrayInts.h>
#endif
#ifndef INCLUDED_thx_color__Lab_Lab_Impl_
#include <thx/color/_Lab/Lab_Impl_.h>
#endif
#ifndef INCLUDED_thx_color__Rgb_Rgb_Impl_
#include <thx/color/_Rgb/Rgb_Impl_.h>
#endif
#ifndef INCLUDED_thx_color__Rgba_Rgba_Impl_
#include <thx/color/_Rgba/Rgba_Impl_.h>
#endif
#ifndef INCLUDED_thx_color__Rgbx_Rgbx_Impl_
#include <thx/color/_Rgbx/Rgbx_Impl_.h>
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
namespace _Rgb{

void Rgb_Impl__obj::__construct() { }

Dynamic Rgb_Impl__obj::__CreateEmpty() { return new Rgb_Impl__obj; }

hx::ObjectPtr< Rgb_Impl__obj > Rgb_Impl__obj::__new()
{
	hx::ObjectPtr< Rgb_Impl__obj > _hx_result = new Rgb_Impl__obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic Rgb_Impl__obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< Rgb_Impl__obj > _hx_result = new Rgb_Impl__obj();
	_hx_result->__construct();
	return _hx_result;
}

Int Rgb_Impl__obj::create(Int red,Int green,Int blue){
            	HX_STACK_FRAME("thx.color._Rgb.Rgb_Impl_","create",0x638bd048,"thx.color._Rgb.Rgb_Impl_.create","thx/color/Rgb.hx",33,0x2e8bc808)
            	HX_STACK_ARG(red,"red")
            	HX_STACK_ARG(green,"green")
            	HX_STACK_ARG(blue,"blue")
HXLINE(  33)		return ((int)((int)((int)((int)red & (int)(int)255) << (int)(int)16) | (int)((int)((int)green & (int)(int)255) << (int)(int)8)) | (int)((int)blue & (int)(int)255));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(Rgb_Impl__obj,create,return )

Int Rgb_Impl__obj::createf(Float red,Float green,Float blue){
            	HX_STACK_FRAME("thx.color._Rgb.Rgb_Impl_","createf",0xb6ca6f1e,"thx.color._Rgb.Rgb_Impl_.createf","thx/color/Rgb.hx",36,0x2e8bc808)
            	HX_STACK_ARG(red,"red")
            	HX_STACK_ARG(green,"green")
            	HX_STACK_ARG(blue,"blue")
HXLINE(  36)		HX_VARI_NAME( Int,red1,"red") = ::Math_obj::round((red * (int)255));
HXDLIN(  36)		HX_VARI_NAME( Int,green1,"green") = ::Math_obj::round((green * (int)255));
HXDLIN(  36)		HX_VARI_NAME( Int,blue1,"blue") = ::Math_obj::round((blue * (int)255));
HXDLIN(  36)		return ((int)((int)((int)((int)red1 & (int)(int)255) << (int)(int)16) | (int)((int)((int)green1 & (int)(int)255) << (int)(int)8)) | (int)((int)blue1 & (int)(int)255));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(Rgb_Impl__obj,createf,return )

 ::Dynamic Rgb_Impl__obj::fromString(::String color){
            	HX_STACK_FRAME("thx.color._Rgb.Rgb_Impl_","fromString",0x7f4d2d27,"thx.color._Rgb.Rgb_Impl_.fromString","thx/color/Rgb.hx",38,0x2e8bc808)
            	HX_STACK_ARG(color,"color")
HXLINE(  39)		HX_VARI(  ::thx::color::parse::ColorInfo,info) = ::thx::color::parse::ColorParser_obj::parseHex(color);
HXLINE(  40)		if (hx::IsNull( info )) {
HXLINE(  41)			info = ::thx::color::parse::ColorParser_obj::parseColor(color);
            		}
HXLINE(  42)		if (hx::IsNull( info )) {
HXLINE(  43)			return null();
            		}
HXLINE(  45)		try {
            			HX_STACK_CATCHABLE( ::Dynamic, 0);
HXLINE(  45)			if ((info->name == HX_("rgb",0d,db,56,00))) {
HXLINE(  47)				::Array< Int > _hx_tmp = ::thx::color::parse::ColorParser_obj::getInt8Channels(info->channels,(int)3);
HXLINE(  45)				return ::thx::color::_Rgb::Rgb_Impl__obj::fromInts(_hx_tmp);
            			}
            			else {
HXLINE(  45)				return null();
            			}
            		}
            		catch( ::Dynamic _hx_e){
            			if (_hx_e.IsClass<  ::Dynamic >() ){
            				HX_STACK_BEGIN_CATCH
            				 ::Dynamic e = _hx_e;
HXLINE(  45)				return null();
            			}
            			else {
            				HX_STACK_DO_THROW(_hx_e);
            			}
            		}
HXDLIN(  45)		return null();
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Rgb_Impl__obj,fromString,return )

Int Rgb_Impl__obj::fromInts(::Array< Int > arr){
            	HX_STACK_FRAME("thx.color._Rgb.Rgb_Impl_","fromInts",0xb1e9677a,"thx.color._Rgb.Rgb_Impl_.fromInts","thx/color/Rgb.hx",53,0x2e8bc808)
            	HX_STACK_ARG(arr,"arr")
HXLINE(  54)		::thx::ArrayInts_obj::resize(arr,(int)3,null());
HXLINE(  55)		return ((int)((int)((int)((int)arr->__get((int)0) & (int)(int)255) << (int)(int)16) | (int)((int)((int)arr->__get((int)1) & (int)(int)255) << (int)(int)8)) | (int)((int)arr->__get((int)2) & (int)(int)255));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Rgb_Impl__obj,fromInts,return )

Int Rgb_Impl__obj::_new(Int rgb){
            	HX_STACK_FRAME("thx.color._Rgb.Rgb_Impl_","_new",0xab9653ad,"thx.color._Rgb.Rgb_Impl_._new","thx/color/Rgb.hx",58,0x2e8bc808)
            	HX_STACK_ARG(rgb,"rgb")
HXLINE(  58)		return rgb;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Rgb_Impl__obj,_new,return )

Int Rgb_Impl__obj::darker(Int this1,Float t){
            	HX_STACK_FRAME("thx.color._Rgb.Rgb_Impl_","darker",0x08b69faf,"thx.color._Rgb.Rgb_Impl_.darker","thx/color/Rgb.hx",66,0x2e8bc808)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(t,"t")
HXLINE(  66)		::Array< Float > _hx_tmp = ::thx::color::_Rgb::Rgb_Impl__obj::toRgbx(this1);
HXDLIN(  66)		return ::thx::color::_Rgbx::Rgbx_Impl__obj::toRgb(::thx::color::_Rgbx::Rgbx_Impl__obj::darker(_hx_tmp,t));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Rgb_Impl__obj,darker,return )

Int Rgb_Impl__obj::lighter(Int this1,Float t){
            	HX_STACK_FRAME("thx.color._Rgb.Rgb_Impl_","lighter",0xbf4303f7,"thx.color._Rgb.Rgb_Impl_.lighter","thx/color/Rgb.hx",69,0x2e8bc808)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(t,"t")
HXLINE(  69)		::Array< Float > _hx_tmp = ::thx::color::_Rgb::Rgb_Impl__obj::toRgbx(this1);
HXDLIN(  69)		return ::thx::color::_Rgbx::Rgbx_Impl__obj::toRgb(::thx::color::_Rgbx::Rgbx_Impl__obj::lighter(_hx_tmp,t));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Rgb_Impl__obj,lighter,return )

Int Rgb_Impl__obj::interpolate(Int this1,Int other,Float t){
            	HX_STACK_FRAME("thx.color._Rgb.Rgb_Impl_","interpolate",0x723937f5,"thx.color._Rgb.Rgb_Impl_.interpolate","thx/color/Rgb.hx",72,0x2e8bc808)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(other,"other")
            	HX_STACK_ARG(t,"t")
HXLINE(  72)		::Array< Float > _hx_tmp = ::thx::color::_Rgb::Rgb_Impl__obj::toRgbx(this1);
HXDLIN(  72)		::Array< Float > _hx_tmp1 = ::thx::color::_Rgb::Rgb_Impl__obj::toRgbx(other);
HXDLIN(  72)		return ::thx::color::_Rgbx::Rgbx_Impl__obj::toRgb(::thx::color::_Rgbx::Rgbx_Impl__obj::interpolate(_hx_tmp,_hx_tmp1,t));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(Rgb_Impl__obj,interpolate,return )

Int Rgb_Impl__obj::min(Int this1,Int other){
            	HX_STACK_FRAME("thx.color._Rgb.Rgb_Impl_","min",0x8f2920c6,"thx.color._Rgb.Rgb_Impl_.min","thx/color/Rgb.hx",75,0x2e8bc808)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(other,"other")
HXLINE(  75)		HX_VARI( Int,a) = ::thx::color::_Rgb::Rgb_Impl__obj::get_red(this1);
HXDLIN(  75)		HX_VARI( Int,b) = ::thx::color::_Rgb::Rgb_Impl__obj::get_red(other);
HXDLIN(  75)		HX_VAR( Int,red);
HXDLIN(  75)		if ((a < b)) {
HXLINE(  75)			red = a;
            		}
            		else {
HXLINE(  75)			red = b;
            		}
HXDLIN(  75)		HX_VARI_NAME( Int,a1,"a") = ::thx::color::_Rgb::Rgb_Impl__obj::get_green(this1);
HXDLIN(  75)		HX_VARI_NAME( Int,b1,"b") = ::thx::color::_Rgb::Rgb_Impl__obj::get_green(other);
HXDLIN(  75)		HX_VAR( Int,green);
HXDLIN(  75)		if ((a1 < b1)) {
HXLINE(  75)			green = a1;
            		}
            		else {
HXLINE(  75)			green = b1;
            		}
HXDLIN(  75)		HX_VARI_NAME( Int,a2,"a") = ::thx::color::_Rgb::Rgb_Impl__obj::get_blue(this1);
HXDLIN(  75)		HX_VARI_NAME( Int,b2,"b") = ::thx::color::_Rgb::Rgb_Impl__obj::get_blue(other);
HXDLIN(  75)		HX_VAR( Int,blue);
HXDLIN(  75)		if ((a2 < b2)) {
HXLINE(  75)			blue = a2;
            		}
            		else {
HXLINE(  75)			blue = b2;
            		}
HXDLIN(  75)		return ((int)((int)((int)((int)red & (int)(int)255) << (int)(int)16) | (int)((int)((int)green & (int)(int)255) << (int)(int)8)) | (int)((int)blue & (int)(int)255));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Rgb_Impl__obj,min,return )

Int Rgb_Impl__obj::max(Int this1,Int other){
            	HX_STACK_FRAME("thx.color._Rgb.Rgb_Impl_","max",0x8f2919d8,"thx.color._Rgb.Rgb_Impl_.max","thx/color/Rgb.hx",78,0x2e8bc808)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(other,"other")
HXLINE(  78)		HX_VARI( Int,a) = ::thx::color::_Rgb::Rgb_Impl__obj::get_red(this1);
HXDLIN(  78)		HX_VARI( Int,b) = ::thx::color::_Rgb::Rgb_Impl__obj::get_red(other);
HXDLIN(  78)		HX_VAR( Int,red);
HXDLIN(  78)		if ((a > b)) {
HXLINE(  78)			red = a;
            		}
            		else {
HXLINE(  78)			red = b;
            		}
HXDLIN(  78)		HX_VARI_NAME( Int,a1,"a") = ::thx::color::_Rgb::Rgb_Impl__obj::get_green(this1);
HXDLIN(  78)		HX_VARI_NAME( Int,b1,"b") = ::thx::color::_Rgb::Rgb_Impl__obj::get_green(other);
HXDLIN(  78)		HX_VAR( Int,green);
HXDLIN(  78)		if ((a1 > b1)) {
HXLINE(  78)			green = a1;
            		}
            		else {
HXLINE(  78)			green = b1;
            		}
HXDLIN(  78)		HX_VARI_NAME( Int,a2,"a") = ::thx::color::_Rgb::Rgb_Impl__obj::get_blue(this1);
HXDLIN(  78)		HX_VARI_NAME( Int,b2,"b") = ::thx::color::_Rgb::Rgb_Impl__obj::get_blue(other);
HXDLIN(  78)		HX_VAR( Int,blue);
HXDLIN(  78)		if ((a2 > b2)) {
HXLINE(  78)			blue = a2;
            		}
            		else {
HXLINE(  78)			blue = b2;
            		}
HXDLIN(  78)		return ((int)((int)((int)((int)red & (int)(int)255) << (int)(int)16) | (int)((int)((int)green & (int)(int)255) << (int)(int)8)) | (int)((int)blue & (int)(int)255));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Rgb_Impl__obj,max,return )

 ::Dynamic Rgb_Impl__obj::withAlpha(Int this1,Int alpha){
            	HX_STACK_FRAME("thx.color._Rgb.Rgb_Impl_","withAlpha",0x2d2b79ac,"thx.color._Rgb.Rgb_Impl_.withAlpha","thx/color/Rgb.hx",81,0x2e8bc808)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(alpha,"alpha")
HXLINE(  81)		return ::thx::color::_Rgba::Rgba_Impl__obj::fromInts(::Array_obj< Int >::__new(4)->init(0,::thx::color::_Rgb::Rgb_Impl__obj::get_red(this1))->init(1,::thx::color::_Rgb::Rgb_Impl__obj::get_green(this1))->init(2,::thx::color::_Rgb::Rgb_Impl__obj::get_blue(this1))->init(3,alpha));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Rgb_Impl__obj,withAlpha,return )

Int Rgb_Impl__obj::withAlphaf(Int this1,Float newalpha){
            	HX_STACK_FRAME("thx.color._Rgb.Rgb_Impl_","withAlphaf",0x58defd3a,"thx.color._Rgb.Rgb_Impl_.withAlphaf","thx/color/Rgb.hx",84,0x2e8bc808)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(newalpha,"newalpha")
HXLINE(  84)		Int _hx_tmp = ::thx::color::_Rgb::Rgb_Impl__obj::get_red(this1);
HXDLIN(  84)		Int _hx_tmp1 = ::thx::color::_Rgb::Rgb_Impl__obj::get_green(this1);
HXDLIN(  84)		Int _hx_tmp2 = ::thx::color::_Rgb::Rgb_Impl__obj::get_blue(this1);
HXDLIN(  84)		Int _hx_tmp3 = ::Math_obj::round(((int)255 * newalpha));
HXDLIN(  84)		return ::thx::color::_Rgba::Rgba_Impl__obj::fromInts(::Array_obj< Int >::__new(4)->init(0,_hx_tmp)->init(1,_hx_tmp1)->init(2,_hx_tmp2)->init(3,_hx_tmp3));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Rgb_Impl__obj,withAlphaf,return )

Int Rgb_Impl__obj::withRed(Int this1,Int newred){
            	HX_STACK_FRAME("thx.color._Rgb.Rgb_Impl_","withRed",0x04cadc1f,"thx.color._Rgb.Rgb_Impl_.withRed","thx/color/Rgb.hx",87,0x2e8bc808)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(newred,"newred")
HXLINE(  87)		return ::thx::color::_Rgb::Rgb_Impl__obj::fromInts(::Array_obj< Int >::__new(3)->init(0,newred)->init(1,::thx::color::_Rgb::Rgb_Impl__obj::get_green(this1))->init(2,::thx::color::_Rgb::Rgb_Impl__obj::get_blue(this1)));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Rgb_Impl__obj,withRed,return )

Int Rgb_Impl__obj::withGreen(Int this1,Int newgreen){
            	HX_STACK_FRAME("thx.color._Rgb.Rgb_Impl_","withGreen",0xa581e111,"thx.color._Rgb.Rgb_Impl_.withGreen","thx/color/Rgb.hx",90,0x2e8bc808)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(newgreen,"newgreen")
HXLINE(  90)		return ::thx::color::_Rgb::Rgb_Impl__obj::fromInts(::Array_obj< Int >::__new(3)->init(0,::thx::color::_Rgb::Rgb_Impl__obj::get_red(this1))->init(1,newgreen)->init(2,::thx::color::_Rgb::Rgb_Impl__obj::get_blue(this1)));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Rgb_Impl__obj,withGreen,return )

Int Rgb_Impl__obj::withBlue(Int this1,Int newblue){
            	HX_STACK_FRAME("thx.color._Rgb.Rgb_Impl_","withBlue",0x2227b40c,"thx.color._Rgb.Rgb_Impl_.withBlue","thx/color/Rgb.hx",93,0x2e8bc808)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(newblue,"newblue")
HXLINE(  93)		return ::thx::color::_Rgb::Rgb_Impl__obj::fromInts(::Array_obj< Int >::__new(3)->init(0,::thx::color::_Rgb::Rgb_Impl__obj::get_red(this1))->init(1,::thx::color::_Rgb::Rgb_Impl__obj::get_green(this1))->init(2,newblue));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Rgb_Impl__obj,withBlue,return )

::String Rgb_Impl__obj::toCss3(Int this1){
            	HX_STACK_FRAME("thx.color._Rgb.Rgb_Impl_","toCss3",0x5efd9b77,"thx.color._Rgb.Rgb_Impl_.toCss3","thx/color/Rgb.hx",96,0x2e8bc808)
            	HX_STACK_ARG(this1,"this1")
HXLINE(  96)		return ((((((HX_("rgb(",7b,d0,a8,4b) + ::thx::color::_Rgb::Rgb_Impl__obj::get_red(this1)) + HX_(",",2c,00,00,00)) + ::thx::color::_Rgb::Rgb_Impl__obj::get_green(this1)) + HX_(",",2c,00,00,00)) + ::thx::color::_Rgb::Rgb_Impl__obj::get_blue(this1)) + HX_(")",29,00,00,00));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Rgb_Impl__obj,toCss3,return )

::String Rgb_Impl__obj::toString(Int this1){
            	HX_STACK_FRAME("thx.color._Rgb.Rgb_Impl_","toString",0x46d124f8,"thx.color._Rgb.Rgb_Impl_.toString","thx/color/Rgb.hx",99,0x2e8bc808)
            	HX_STACK_ARG(this1,"this1")
HXLINE(  99)		return ::thx::color::_Rgb::Rgb_Impl__obj::toHex(this1,null());
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Rgb_Impl__obj,toString,return )

::String Rgb_Impl__obj::toHex(Int this1,::String __o_prefix){
::String prefix = __o_prefix.Default(HX_HCSTRING("#","\x23","\x00","\x00","\x00"));
            	HX_STACK_FRAME("thx.color._Rgb.Rgb_Impl_","toHex",0x8ff03854,"thx.color._Rgb.Rgb_Impl_.toHex","thx/color/Rgb.hx",102,0x2e8bc808)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(prefix,"prefix")
HXLINE( 102)		::String _hx_tmp = (HX_("",00,00,00,00) + prefix);
HXDLIN( 102)		::String _hx_tmp1 = ::StringTools_obj::hex(::thx::color::_Rgb::Rgb_Impl__obj::get_red(this1),(int)2);
HXDLIN( 102)		::String _hx_tmp2 = (_hx_tmp + _hx_tmp1);
HXDLIN( 102)		::String _hx_tmp3 = ::StringTools_obj::hex(::thx::color::_Rgb::Rgb_Impl__obj::get_green(this1),(int)2);
HXDLIN( 102)		::String _hx_tmp4 = (_hx_tmp2 + _hx_tmp3);
HXDLIN( 102)		::String _hx_tmp5 = ::StringTools_obj::hex(::thx::color::_Rgb::Rgb_Impl__obj::get_blue(this1),(int)2);
HXDLIN( 102)		return (_hx_tmp4 + _hx_tmp5);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Rgb_Impl__obj,toHex,return )

Bool Rgb_Impl__obj::equals(Int this1,Int other){
            	HX_STACK_FRAME("thx.color._Rgb.Rgb_Impl_","equals",0xa76f578b,"thx.color._Rgb.Rgb_Impl_.equals","thx/color/Rgb.hx",105,0x2e8bc808)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(other,"other")
HXLINE( 105)		Bool _hx_tmp;
HXDLIN( 105)		if ((::thx::color::_Rgb::Rgb_Impl__obj::get_red(this1) == ::thx::color::_Rgb::Rgb_Impl__obj::get_red(other))) {
HXLINE( 105)			_hx_tmp = (::thx::color::_Rgb::Rgb_Impl__obj::get_green(this1) == ::thx::color::_Rgb::Rgb_Impl__obj::get_green(other));
            		}
            		else {
HXLINE( 105)			_hx_tmp = false;
            		}
HXDLIN( 105)		if (_hx_tmp) {
HXLINE( 105)			return (::thx::color::_Rgb::Rgb_Impl__obj::get_blue(this1) == ::thx::color::_Rgb::Rgb_Impl__obj::get_blue(other));
            		}
            		else {
HXLINE( 105)			return false;
            		}
HXDLIN( 105)		return false;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Rgb_Impl__obj,equals,return )

::Array< Float > Rgb_Impl__obj::toLab(Int this1){
            	HX_STACK_FRAME("thx.color._Rgb.Rgb_Impl_","toLab",0x8ff33dc6,"thx.color._Rgb.Rgb_Impl_.toLab","thx/color/Rgb.hx",108,0x2e8bc808)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 108)		::Array< Float > _hx_tmp = ::thx::color::_Rgb::Rgb_Impl__obj::toXyz(this1);
HXDLIN( 108)		return ::thx::color::_Xyz::Xyz_Impl__obj::toLab(_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Rgb_Impl__obj,toLab,return )

::Array< Float > Rgb_Impl__obj::toLCh(Int this1){
            	HX_STACK_FRAME("thx.color._Rgb.Rgb_Impl_","toLCh",0x8ff323aa,"thx.color._Rgb.Rgb_Impl_.toLCh","thx/color/Rgb.hx",111,0x2e8bc808)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 111)		::Array< Float > _hx_tmp = ::thx::color::_Rgb::Rgb_Impl__obj::toLab(this1);
HXDLIN( 111)		return ::thx::color::_Lab::Lab_Impl__obj::toLCh(_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Rgb_Impl__obj,toLCh,return )

::Array< Float > Rgb_Impl__obj::toLuv(Int this1){
            	HX_STACK_FRAME("thx.color._Rgb.Rgb_Impl_","toLuv",0x8ff34f46,"thx.color._Rgb.Rgb_Impl_.toLuv","thx/color/Rgb.hx",114,0x2e8bc808)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 114)		::Array< Float > _hx_tmp = ::thx::color::_Rgb::Rgb_Impl__obj::toRgbx(this1);
HXDLIN( 114)		return ::thx::color::_Rgbx::Rgbx_Impl__obj::toLuv(_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Rgb_Impl__obj,toLuv,return )

::Array< Float > Rgb_Impl__obj::toCmy(Int this1){
            	HX_STACK_FRAME("thx.color._Rgb.Rgb_Impl_","toCmy",0x8fec7408,"thx.color._Rgb.Rgb_Impl_.toCmy","thx/color/Rgb.hx",117,0x2e8bc808)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 117)		::Array< Float > _hx_tmp = ::thx::color::_Rgb::Rgb_Impl__obj::toRgbx(this1);
HXDLIN( 117)		return ::thx::color::_Rgbx::Rgbx_Impl__obj::toCmy(_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Rgb_Impl__obj,toCmy,return )

::Array< Float > Rgb_Impl__obj::toCmyk(Int this1){
            	HX_STACK_FRAME("thx.color._Rgb.Rgb_Impl_","toCmyk",0x5ef91363,"thx.color._Rgb.Rgb_Impl_.toCmyk","thx/color/Rgb.hx",120,0x2e8bc808)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 120)		::Array< Float > _hx_tmp = ::thx::color::_Rgb::Rgb_Impl__obj::toRgbx(this1);
HXDLIN( 120)		return ::thx::color::_Rgbx::Rgbx_Impl__obj::toCmyk(_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Rgb_Impl__obj,toCmyk,return )

::Array< Float > Rgb_Impl__obj::toCubeHelix(Int this1){
            	HX_STACK_FRAME("thx.color._Rgb.Rgb_Impl_","toCubeHelix",0x76872182,"thx.color._Rgb.Rgb_Impl_.toCubeHelix","thx/color/Rgb.hx",123,0x2e8bc808)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 123)		HX_VARI_NAME( ::Array< Float >,this2,"this") = ::thx::color::_Rgb::Rgb_Impl__obj::toRgbx(this1);
HXDLIN( 123)		return ::thx::color::_Rgbx::Rgbx_Impl__obj::toCubeHelixWithGamma(this2,(int)1);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Rgb_Impl__obj,toCubeHelix,return )

Float Rgb_Impl__obj::toGrey(Int this1){
            	HX_STACK_FRAME("thx.color._Rgb.Rgb_Impl_","toGrey",0x61a1a7c6,"thx.color._Rgb.Rgb_Impl_.toGrey","thx/color/Rgb.hx",126,0x2e8bc808)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 126)		::Array< Float > _hx_tmp = ::thx::color::_Rgb::Rgb_Impl__obj::toRgbx(this1);
HXDLIN( 126)		return ::thx::color::_Rgbx::Rgbx_Impl__obj::toGrey(_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Rgb_Impl__obj,toGrey,return )

::Array< Float > Rgb_Impl__obj::toHsl(Int this1){
            	HX_STACK_FRAME("thx.color._Rgb.Rgb_Impl_","toHsl",0x8ff0447a,"thx.color._Rgb.Rgb_Impl_.toHsl","thx/color/Rgb.hx",129,0x2e8bc808)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 129)		::Array< Float > _hx_tmp = ::thx::color::_Rgb::Rgb_Impl__obj::toRgbx(this1);
HXDLIN( 129)		return ::thx::color::_Rgbx::Rgbx_Impl__obj::toHsl(_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Rgb_Impl__obj,toHsl,return )

::Array< Float > Rgb_Impl__obj::toHsv(Int this1){
            	HX_STACK_FRAME("thx.color._Rgb.Rgb_Impl_","toHsv",0x8ff04484,"thx.color._Rgb.Rgb_Impl_.toHsv","thx/color/Rgb.hx",132,0x2e8bc808)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 132)		::Array< Float > _hx_tmp = ::thx::color::_Rgb::Rgb_Impl__obj::toRgbx(this1);
HXDLIN( 132)		return ::thx::color::_Rgbx::Rgbx_Impl__obj::toHsv(_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Rgb_Impl__obj,toHsv,return )

::Array< Float > Rgb_Impl__obj::toHunterLab(Int this1){
            	HX_STACK_FRAME("thx.color._Rgb.Rgb_Impl_","toHunterLab",0x42b872a6,"thx.color._Rgb.Rgb_Impl_.toHunterLab","thx/color/Rgb.hx",135,0x2e8bc808)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 135)		::Array< Float > _hx_tmp = ::thx::color::_Rgb::Rgb_Impl__obj::toXyz(this1);
HXDLIN( 135)		return ::thx::color::_Xyz::Xyz_Impl__obj::toHunterLab(_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Rgb_Impl__obj,toHunterLab,return )

::Array< Float > Rgb_Impl__obj::toRgbx(Int this1){
            	HX_STACK_FRAME("thx.color._Rgb.Rgb_Impl_","toRgbx",0x68dea532,"thx.color._Rgb.Rgb_Impl_.toRgbx","thx/color/Rgb.hx",138,0x2e8bc808)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 138)		return ::thx::color::_Rgbx::Rgbx_Impl__obj::fromInts(::Array_obj< Int >::__new(3)->init(0,::thx::color::_Rgb::Rgb_Impl__obj::get_red(this1))->init(1,::thx::color::_Rgb::Rgb_Impl__obj::get_green(this1))->init(2,::thx::color::_Rgb::Rgb_Impl__obj::get_blue(this1)));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Rgb_Impl__obj,toRgbx,return )

 ::Dynamic Rgb_Impl__obj::toRgba(Int this1){
            	HX_STACK_FRAME("thx.color._Rgb.Rgb_Impl_","toRgba",0x68dea51b,"thx.color._Rgb.Rgb_Impl_.toRgba","thx/color/Rgb.hx",141,0x2e8bc808)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 141)		return ::thx::color::_Rgb::Rgb_Impl__obj::withAlpha(this1,(int)255);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Rgb_Impl__obj,toRgba,return )

::Array< Float > Rgb_Impl__obj::toRgbxa(Int this1){
            	HX_STACK_FRAME("thx.color._Rgb.Rgb_Impl_","toRgbxa",0x59f1e6ef,"thx.color._Rgb.Rgb_Impl_.toRgbxa","thx/color/Rgb.hx",144,0x2e8bc808)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 144)		return ::thx::color::_Rgba::Rgba_Impl__obj::toRgbxa(::thx::color::_Rgb::Rgb_Impl__obj::toRgba(this1));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Rgb_Impl__obj,toRgbxa,return )

Float Rgb_Impl__obj::toTemperature(Int this1){
            	HX_STACK_FRAME("thx.color._Rgb.Rgb_Impl_","toTemperature",0x29c94aad,"thx.color._Rgb.Rgb_Impl_.toTemperature","thx/color/Rgb.hx",147,0x2e8bc808)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 147)		::Array< Float > _hx_tmp = ::thx::color::_Rgb::Rgb_Impl__obj::toRgbx(this1);
HXDLIN( 147)		return ::thx::color::_Rgbx::Rgbx_Impl__obj::toTemperature(_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Rgb_Impl__obj,toTemperature,return )

::Array< Float > Rgb_Impl__obj::toYuv(Int this1){
            	HX_STACK_FRAME("thx.color._Rgb.Rgb_Impl_","toYuv",0x8ffd2c93,"thx.color._Rgb.Rgb_Impl_.toYuv","thx/color/Rgb.hx",150,0x2e8bc808)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 150)		::Array< Float > _hx_tmp = ::thx::color::_Rgb::Rgb_Impl__obj::toRgbx(this1);
HXDLIN( 150)		return ::thx::color::_Rgbx::Rgbx_Impl__obj::toYuv(_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Rgb_Impl__obj,toYuv,return )

::Array< Float > Rgb_Impl__obj::toYxy(Int this1){
            	HX_STACK_FRAME("thx.color._Rgb.Rgb_Impl_","toYxy",0x8ffd2f33,"thx.color._Rgb.Rgb_Impl_.toYxy","thx/color/Rgb.hx",153,0x2e8bc808)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 153)		::Array< Float > _hx_tmp = ::thx::color::_Rgb::Rgb_Impl__obj::toRgbx(this1);
HXDLIN( 153)		return ::thx::color::_Rgbx::Rgbx_Impl__obj::toYxy(_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Rgb_Impl__obj,toYxy,return )

::Array< Float > Rgb_Impl__obj::toXyz(Int this1){
            	HX_STACK_FRAME("thx.color._Rgb.Rgb_Impl_","toXyz",0x8ffc6dd2,"thx.color._Rgb.Rgb_Impl_.toXyz","thx/color/Rgb.hx",156,0x2e8bc808)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 156)		::Array< Float > _hx_tmp = ::thx::color::_Rgb::Rgb_Impl__obj::toRgbx(this1);
HXDLIN( 156)		return ::thx::color::_Rgbx::Rgbx_Impl__obj::toXyz(_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Rgb_Impl__obj,toXyz,return )

Int Rgb_Impl__obj::get_red(Int this1){
            	HX_STACK_FRAME("thx.color._Rgb.Rgb_Impl_","get_red",0xcc2b5b1c,"thx.color._Rgb.Rgb_Impl_.get_red","thx/color/Rgb.hx",159,0x2e8bc808)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 159)		return ((int)((int)this1 >> (int)(int)16) & (int)(int)255);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Rgb_Impl__obj,get_red,return )

Int Rgb_Impl__obj::get_green(Int this1){
            	HX_STACK_FRAME("thx.color._Rgb.Rgb_Impl_","get_green",0x653dd94e,"thx.color._Rgb.Rgb_Impl_.get_green","thx/color/Rgb.hx",161,0x2e8bc808)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 161)		return ((int)((int)this1 >> (int)(int)8) & (int)(int)255);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Rgb_Impl__obj,get_green,return )

Int Rgb_Impl__obj::get_blue(Int this1){
            	HX_STACK_FRAME("thx.color._Rgb.Rgb_Impl_","get_blue",0xcf36526f,"thx.color._Rgb.Rgb_Impl_.get_blue","thx/color/Rgb.hx",163,0x2e8bc808)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 163)		return ((int)this1 & (int)(int)255);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Rgb_Impl__obj,get_blue,return )


Rgb_Impl__obj::Rgb_Impl__obj()
{
}

bool Rgb_Impl__obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
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
		if (HX_FIELD_EQ(inName,"toHex") ) { outValue = toHex_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"toLab") ) { outValue = toLab_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"toLCh") ) { outValue = toLCh_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"toLuv") ) { outValue = toLuv_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"toCmy") ) { outValue = toCmy_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"toHsl") ) { outValue = toHsl_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"toHsv") ) { outValue = toHsv_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"toYuv") ) { outValue = toYuv_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"toYxy") ) { outValue = toYxy_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"toXyz") ) { outValue = toXyz_dyn(); return true; }
		break;
	case 6:
		if (HX_FIELD_EQ(inName,"create") ) { outValue = create_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"darker") ) { outValue = darker_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"toCss3") ) { outValue = toCss3_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"equals") ) { outValue = equals_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"toCmyk") ) { outValue = toCmyk_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"toGrey") ) { outValue = toGrey_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"toRgbx") ) { outValue = toRgbx_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"toRgba") ) { outValue = toRgba_dyn(); return true; }
		break;
	case 7:
		if (HX_FIELD_EQ(inName,"createf") ) { outValue = createf_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"lighter") ) { outValue = lighter_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"withRed") ) { outValue = withRed_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"toRgbxa") ) { outValue = toRgbxa_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"get_red") ) { outValue = get_red_dyn(); return true; }
		break;
	case 8:
		if (HX_FIELD_EQ(inName,"fromInts") ) { outValue = fromInts_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"withBlue") ) { outValue = withBlue_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"toString") ) { outValue = toString_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"get_blue") ) { outValue = get_blue_dyn(); return true; }
		break;
	case 9:
		if (HX_FIELD_EQ(inName,"withAlpha") ) { outValue = withAlpha_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"withGreen") ) { outValue = withGreen_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"get_green") ) { outValue = get_green_dyn(); return true; }
		break;
	case 10:
		if (HX_FIELD_EQ(inName,"fromString") ) { outValue = fromString_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"withAlphaf") ) { outValue = withAlphaf_dyn(); return true; }
		break;
	case 11:
		if (HX_FIELD_EQ(inName,"interpolate") ) { outValue = interpolate_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"toCubeHelix") ) { outValue = toCubeHelix_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"toHunterLab") ) { outValue = toHunterLab_dyn(); return true; }
		break;
	case 13:
		if (HX_FIELD_EQ(inName,"toTemperature") ) { outValue = toTemperature_dyn(); return true; }
	}
	return false;
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *Rgb_Impl__obj_sMemberStorageInfo = 0;
static hx::StaticInfo *Rgb_Impl__obj_sStaticStorageInfo = 0;
#endif

static void Rgb_Impl__obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(Rgb_Impl__obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void Rgb_Impl__obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(Rgb_Impl__obj::__mClass,"__mClass");
};

#endif

hx::Class Rgb_Impl__obj::__mClass;

static ::String Rgb_Impl__obj_sStaticFields[] = {
	HX_HCSTRING("create","\xfc","\x66","\x0f","\x7c"),
	HX_HCSTRING("createf","\xea","\xb5","\x6a","\x11"),
	HX_HCSTRING("fromString","\xdb","\x2d","\x74","\x54"),
	HX_HCSTRING("fromInts","\x2e","\x13","\x87","\xa3"),
	HX_HCSTRING("_new","\x61","\x15","\x1f","\x3f"),
	HX_HCSTRING("darker","\x63","\x36","\x3a","\x21"),
	HX_HCSTRING("lighter","\xc3","\x4a","\xe3","\x19"),
	HX_HCSTRING("interpolate","\xc1","\xd4","\x32","\x1f"),
	HX_HCSTRING("min","\x92","\x11","\x53","\x00"),
	HX_HCSTRING("max","\xa4","\x0a","\x53","\x00"),
	HX_HCSTRING("withAlpha","\x78","\x0b","\x84","\xa5"),
	HX_HCSTRING("withAlphaf","\xee","\xfd","\x05","\x2e"),
	HX_HCSTRING("withRed","\xeb","\x22","\x6b","\x5f"),
	HX_HCSTRING("withGreen","\xdd","\x72","\xda","\x1d"),
	HX_HCSTRING("withBlue","\xc0","\x5f","\xc5","\x13"),
	HX_HCSTRING("toCss3","\x2b","\x32","\x81","\x77"),
	HX_HCSTRING("toString","\xac","\xd0","\x6e","\x38"),
	HX_HCSTRING("toHex","\x20","\xf4","\x10","\x14"),
	HX_HCSTRING("equals","\x3f","\xee","\xf2","\xbf"),
	HX_HCSTRING("toLab","\x92","\xf9","\x13","\x14"),
	HX_HCSTRING("toLCh","\x76","\xdf","\x13","\x14"),
	HX_HCSTRING("toLuv","\x12","\x0b","\x14","\x14"),
	HX_HCSTRING("toCmy","\xd4","\x2f","\x0d","\x14"),
	HX_HCSTRING("toCmyk","\x17","\xaa","\x7c","\x77"),
	HX_HCSTRING("toCubeHelix","\x4e","\xbe","\x80","\x23"),
	HX_HCSTRING("toGrey","\x7a","\x3e","\x25","\x7a"),
	HX_HCSTRING("toHsl","\x46","\x00","\x11","\x14"),
	HX_HCSTRING("toHsv","\x50","\x00","\x11","\x14"),
	HX_HCSTRING("toHunterLab","\x72","\x0f","\xb2","\xef"),
	HX_HCSTRING("toRgbx","\xe6","\x3b","\x62","\x81"),
	HX_HCSTRING("toRgba","\xcf","\x3b","\x62","\x81"),
	HX_HCSTRING("toRgbxa","\xbb","\x2d","\x92","\xb4"),
	HX_HCSTRING("toTemperature","\x79","\xb2","\xfc","\x3d"),
	HX_HCSTRING("toYuv","\x5f","\xe8","\x1d","\x14"),
	HX_HCSTRING("toYxy","\xff","\xea","\x1d","\x14"),
	HX_HCSTRING("toXyz","\x9e","\x29","\x1d","\x14"),
	HX_HCSTRING("get_red","\xe8","\xa1","\xcb","\x26"),
	HX_HCSTRING("get_green","\x1a","\x6b","\x96","\xdd"),
	HX_HCSTRING("get_blue","\x23","\xfe","\xd3","\xc0"),
	::String(null())
};

void Rgb_Impl__obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.color._Rgb.Rgb_Impl_","\xa2","\xc5","\xbd","\x96");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &Rgb_Impl__obj::__GetStatic;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = Rgb_Impl__obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(Rgb_Impl__obj_sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< Rgb_Impl__obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = Rgb_Impl__obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = Rgb_Impl__obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = Rgb_Impl__obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx
} // end namespace color
} // end namespace _Rgb
