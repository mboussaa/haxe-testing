// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_Reflect
#include <Reflect.h>
#endif
#ifndef INCLUDED_Std
#include <Std.h>
#endif
#ifndef INCLUDED_StringTools
#include <StringTools.h>
#endif
#ifndef INCLUDED_haxe_IMap
#include <haxe/IMap.h>
#endif
#ifndef INCLUDED_haxe_ds_StringMap
#include <haxe/ds/StringMap.h>
#endif
#ifndef INCLUDED_thx_Arrays
#include <thx/Arrays.h>
#endif
#ifndef INCLUDED_thx_Iterators
#include <thx/Iterators.h>
#endif
#ifndef INCLUDED_thx_Maps
#include <thx/Maps.h>
#endif
#ifndef INCLUDED_thx_Objects
#include <thx/Objects.h>
#endif
#ifndef INCLUDED_thx__QueryString_QueryString_Impl_
#include <thx/_QueryString/QueryString_Impl_.h>
#endif

namespace thx{
namespace _QueryString{

void QueryString_Impl__obj::__construct() { }

Dynamic QueryString_Impl__obj::__CreateEmpty() { return new QueryString_Impl__obj; }

hx::ObjectPtr< QueryString_Impl__obj > QueryString_Impl__obj::__new()
{
	hx::ObjectPtr< QueryString_Impl__obj > _hx_result = new QueryString_Impl__obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic QueryString_Impl__obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< QueryString_Impl__obj > _hx_result = new QueryString_Impl__obj();
	_hx_result->__construct();
	return _hx_result;
}

::String QueryString_Impl__obj::separator;

::String QueryString_Impl__obj::assignment;

HX_BEGIN_DEFAULT_FUNC(__default_encodeURIComponent,QueryString_Impl__obj)
::String _hx_run(::String s){
            	HX_STACK_FRAME("thx._QueryString.QueryString_Impl_","__default_encodeURIComponent",0x3f6f0d84,"thx._QueryString.QueryString_Impl_.__default_encodeURIComponent","thx/QueryString.hx",16,0x5b2522f0)
            	HX_STACK_ARG(s,"s")
HXLINE(  16)		::String _hx_tmp = ::StringTools_obj::urlEncode(s);
HXDLIN(  16)		return ::StringTools_obj::replace(_hx_tmp,HX_("%20",23,3f,1c,00),HX_("+",2b,00,00,00));
            	}
HX_END_LOCAL_FUNC1(return )
HX_END_DEFAULT_FUNC

::Dynamic QueryString_Impl__obj::encodeURIComponent;

HX_BEGIN_DEFAULT_FUNC(__default_decodeURIComponent,QueryString_Impl__obj)
::String _hx_run(::String s){
            	HX_STACK_FRAME("thx._QueryString.QueryString_Impl_","__default_decodeURIComponent",0x9278bc9c,"thx._QueryString.QueryString_Impl_.__default_decodeURIComponent","thx/QueryString.hx",17,0x5b2522f0)
            	HX_STACK_ARG(s,"s")
HXLINE(  17)		::String _hx_tmp = ::StringTools_obj::urlDecode(s);
HXDLIN(  17)		return ::StringTools_obj::replace(_hx_tmp,HX_("+",2b,00,00,00),HX_(" ",20,00,00,00));
            	}
HX_END_LOCAL_FUNC1(return )
HX_END_DEFAULT_FUNC

::Dynamic QueryString_Impl__obj::decodeURIComponent;

 ::haxe::ds::StringMap QueryString_Impl__obj::empty(){
            	HX_STACK_FRAME("thx._QueryString.QueryString_Impl_","empty",0x80f49f2e,"thx._QueryString.QueryString_Impl_.empty","thx/QueryString.hx",20,0x5b2522f0)
HXLINE(  20)		return  ::haxe::ds::StringMap_obj::__new();
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC0(QueryString_Impl__obj,empty,return )

 ::haxe::ds::StringMap QueryString_Impl__obj::parseWithSymbols(::String s,::String separator,::String assignment, ::Dynamic decodeURIComponent){
            	HX_STACK_FRAME("thx._QueryString.QueryString_Impl_","parseWithSymbols",0xbd63c841,"thx._QueryString.QueryString_Impl_.parseWithSymbols","thx/QueryString.hx",23,0x5b2522f0)
            	HX_STACK_ARG(s,"s")
            	HX_STACK_ARG(separator,"separator")
            	HX_STACK_ARG(assignment,"assignment")
            	HX_STACK_ARG(decodeURIComponent,"decodeURIComponent")
HXLINE(  23)		if (hx::IsNull( s )) {
HXLINE(  23)			return  ::haxe::ds::StringMap_obj::__new();
            		}
            		else {
            			HX_BEGIN_LOCAL_FUNC_S2(hx::LocalFunc,_hx_Closure_0,::String,assignment, ::Dynamic,decodeURIComponent) HXARGC(2)
            			 ::haxe::ds::StringMap _hx_run( ::haxe::ds::StringMap qs,::String v){
            				HX_STACK_FRAME("thx._QueryString.QueryString_Impl_","parseWithSymbols",0xbd63c841,"thx._QueryString.QueryString_Impl_.parseWithSymbols","thx/QueryString.hx",32,0x5b2522f0)
            				HX_STACK_ARG(qs,"qs")
            				HX_STACK_ARG(v,"v")
HXLINE(  33)				HX_VARI( ::Array< ::String >,parts) = v.split(assignment);
HXLINE(  34)				if ((parts->__get((int)0) != HX_("",00,00,00,00))) {
HXLINE(  34)					::String _hx_tmp4 = ( (::String)(decodeURIComponent(parts->__get((int)0))) );
HXDLIN(  34)					::String _hx_tmp5;
HXDLIN(  34)					if (hx::IsNull( parts->__get((int)1) )) {
HXLINE(  34)						_hx_tmp5 = null();
            					}
            					else {
HXLINE(  34)						_hx_tmp5 = ( (::String)(decodeURIComponent(parts->__get((int)1))) );
            					}
HXDLIN(  34)					::thx::_QueryString::QueryString_Impl__obj::add(qs,_hx_tmp4,_hx_tmp5);
            				}
HXLINE(  35)				return qs;
            			}
            			HX_END_LOCAL_FUNC2(return)

HXLINE(  26)			Bool _hx_tmp = hx::IsNull( decodeURIComponent );
HXDLIN(  26)			if (_hx_tmp) {
HXLINE(  27)				decodeURIComponent = ::thx::_QueryString::QueryString_Impl__obj::decodeURIComponent;
            			}
HXLINE(  28)			Bool _hx_tmp1;
HXDLIN(  28)			Bool _hx_tmp2 = !(::StringTools_obj::startsWith(s,HX_("?",3f,00,00,00)));
HXDLIN(  28)			if (_hx_tmp2) {
HXLINE(  28)				_hx_tmp1 = ::StringTools_obj::startsWith(s,HX_("#",23,00,00,00));
            			}
            			else {
HXLINE(  28)				_hx_tmp1 = true;
            			}
HXDLIN(  28)			if (_hx_tmp1) {
HXLINE(  29)				s = s.substring((int)1,null());
            			}
HXLINE(  30)			s = ::StringTools_obj::ltrim(s);
HXLINE(  31)			::Array< ::String > _hx_tmp3 = s.split(separator);
HXLINE(  23)			return ( ( ::haxe::ds::StringMap)(::thx::Arrays_obj::reduce(_hx_tmp3, ::Dynamic(new _hx_Closure_0(assignment,decodeURIComponent)), ::haxe::ds::StringMap_obj::__new())) );
            		}
HXDLIN(  23)		return null();
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC4(QueryString_Impl__obj,parseWithSymbols,return )

 ::haxe::ds::StringMap QueryString_Impl__obj::parse(::String s){
            	HX_STACK_FRAME("thx._QueryString.QueryString_Impl_","parse",0xce6ff4d4,"thx._QueryString.QueryString_Impl_.parse","thx/QueryString.hx",42,0x5b2522f0)
            	HX_STACK_ARG(s,"s")
HXLINE(  42)		return ::thx::_QueryString::QueryString_Impl__obj::parseWithSymbols(s,::thx::_QueryString::QueryString_Impl__obj::separator,::thx::_QueryString::QueryString_Impl__obj::assignment,::thx::_QueryString::QueryString_Impl__obj::decodeURIComponent);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(QueryString_Impl__obj,parse,return )

 ::haxe::ds::StringMap QueryString_Impl__obj::fromObject( ::Dynamic o){
            		HX_BEGIN_LOCAL_FUNC_S1(hx::LocalFunc,_hx_Closure_1, ::haxe::ds::StringMap,qs) HXARGC(1)
            		void _hx_run( ::Dynamic t){
            			HX_STACK_FRAME("thx._QueryString.QueryString_Impl_","fromObject",0x18b3b788,"thx._QueryString.QueryString_Impl_.fromObject","thx/QueryString.hx",48,0x5b2522f0)
            			HX_STACK_ARG(t,"t")
HXLINE(  48)			Bool _hx_tmp2 = ::Std_obj::is( ::Dynamic(t->__Field(HX_("_1",f2,52,00,00),hx::paccDynamic)),hx::ArrayBase::__mClass);
HXDLIN(  48)			if (_hx_tmp2) {
            				HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_0) HXARGC(1)
            				::String _hx_run(::String _){
            					HX_STACK_FRAME("thx._QueryString.QueryString_Impl_","fromObject",0x18b3b788,"thx._QueryString.QueryString_Impl_.fromObject","thx/macro/lambda/SlambdaMacro.hx",86,0x8ba75432)
            					HX_STACK_ARG(_,"_")
HXLINE(  86)					return (HX_("",00,00,00,00) + _);
            				}
            				HX_END_LOCAL_FUNC1(return)

HXLINE(  49)				::Array< ::String > _hx_tmp3 = ( (::cpp::VirtualArray)( ::Dynamic(t->__Field(HX_("_1",f2,52,00,00),hx::paccDynamic))) )->map( ::Dynamic(new _hx_Closure_0()));
HXDLIN(  49)				::thx::_QueryString::QueryString_Impl__obj::setMany(qs,( (::String)(t->__Field(HX_("_0",f1,52,00,00),hx::paccDynamic)) ),_hx_tmp3);
            			}
            			else {
HXLINE(  51)				::String _hx_tmp4 = ::Std_obj::string( ::Dynamic(t->__Field(HX_("_1",f2,52,00,00),hx::paccDynamic)));
HXDLIN(  51)				::thx::_QueryString::QueryString_Impl__obj::set(qs,( (::String)(t->__Field(HX_("_0",f1,52,00,00),hx::paccDynamic)) ),(HX_("",00,00,00,00) + _hx_tmp4));
            			}
            		}
            		HX_END_LOCAL_FUNC1((void))

            	HX_STACK_FRAME("thx._QueryString.QueryString_Impl_","fromObject",0x18b3b788,"thx._QueryString.QueryString_Impl_.fromObject","thx/QueryString.hx",44,0x5b2522f0)
            	HX_STACK_ARG(o,"o")
HXLINE(  45)		HX_VARI(  ::haxe::ds::StringMap,qs) =  ::haxe::ds::StringMap_obj::__new();
HXLINE(  46)		Bool _hx_tmp = !(::Reflect_obj::isObject(o));
HXDLIN(  46)		if (_hx_tmp) {
HXLINE(  46)			::String _hx_tmp1 = ::Std_obj::string(o);
HXDLIN(  46)			HX_STACK_DO_THROW(((HX_("unable to convert ",e5,72,35,85) + _hx_tmp1) + HX_(" to QueryString",d4,93,e9,93)));
            		}
HXLINE(  47)		::thx::Objects_obj::tuples(o)->map( ::Dynamic(new _hx_Closure_1(qs)));
HXLINE(  54)		return qs;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(QueryString_Impl__obj,fromObject,return )

 ::Dynamic QueryString_Impl__obj::toObject( ::haxe::ds::StringMap this1){
            		HX_BEGIN_LOCAL_FUNC_S1(hx::LocalFunc,_hx_Closure_0, ::haxe::ds::StringMap,this1) HXARGC(2)
            		 ::Dynamic _hx_run( ::Dynamic o,::String key){
            			HX_STACK_FRAME("thx._QueryString.QueryString_Impl_","toObject",0xdb659c99,"thx._QueryString.QueryString_Impl_.toObject","thx/QueryString.hx",58,0x5b2522f0)
            			HX_STACK_ARG(o,"o")
            			HX_STACK_ARG(key,"key")
HXLINE(  59)			HX_VARI( ::Array< ::String >,v) = ( (::Array< ::String >)(this1->get(key)) );
HXLINE(  60)			Bool _hx_tmp1 = (v->length == (int)0);
HXDLIN(  60)			if (_hx_tmp1) {
HXLINE(  61)				::Reflect_obj::setField(o,key,null());
            			}
            			else {
HXLINE(  62)				Bool _hx_tmp2 = (v->length == (int)1);
HXDLIN(  62)				if (_hx_tmp2) {
HXLINE(  63)					::Reflect_obj::setField(o,key,v->__get((int)0));
            				}
            				else {
HXLINE(  65)					::Reflect_obj::setField(o,key,v);
            				}
            			}
HXLINE(  66)			return o;
            		}
            		HX_END_LOCAL_FUNC2(return)

            	HX_STACK_FRAME("thx._QueryString.QueryString_Impl_","toObject",0xdb659c99,"thx._QueryString.QueryString_Impl_.toObject","thx/QueryString.hx",58,0x5b2522f0)
            	HX_STACK_ARG(this1,"this1")
HXLINE(  58)		 ::Dynamic _hx_tmp = this1->keys();
HXDLIN(  58)		return ::thx::Iterators_obj::reduce(_hx_tmp, ::Dynamic(new _hx_Closure_0(this1)), ::Dynamic(hx::Anon_obj::Create(0)));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(QueryString_Impl__obj,toObject,return )

Bool QueryString_Impl__obj::isEmpty( ::haxe::ds::StringMap this1){
            	HX_STACK_FRAME("thx._QueryString.QueryString_Impl_","isEmpty",0x64556d24,"thx._QueryString.QueryString_Impl_.isEmpty","thx/QueryString.hx",71,0x5b2522f0)
            	HX_STACK_ARG(this1,"this1")
HXLINE(  71)		return !(( (Bool)( ::Dynamic(this1->iterator()->__Field(HX_("hasNext",6d,a5,46,18),hx::paccDynamic))()) ));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(QueryString_Impl__obj,isEmpty,return )

Bool QueryString_Impl__obj::isEmptyOrMono( ::haxe::ds::StringMap this1){
            	HX_STACK_FRAME("thx._QueryString.QueryString_Impl_","isEmptyOrMono",0xbbc38b2a,"thx._QueryString.QueryString_Impl_.isEmptyOrMono","thx/QueryString.hx",73,0x5b2522f0)
            	HX_STACK_ARG(this1,"this1")
HXLINE(  74)		 ::Dynamic _hx_tmp = this1->keys();
HXDLIN(  74)		HX_VARI( ::Array< ::String >,arr) = ::thx::Iterators_obj::toArray(_hx_tmp);
HXLINE(  75)		if ((arr->length == (int)0)) {
HXLINE(  76)			return true;
            		}
HXLINE(  77)		if ((arr->length != (int)1)) {
HXLINE(  78)			return false;
            		}
HXLINE(  79)		return (( (::Array< ::String >)(this1->get(arr->__get((int)0))) )->length == (int)0);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(QueryString_Impl__obj,isEmptyOrMono,return )

Bool QueryString_Impl__obj::exist( ::haxe::ds::StringMap this1,::String name){
            	HX_STACK_FRAME("thx._QueryString.QueryString_Impl_","exist",0x8834a758,"thx._QueryString.QueryString_Impl_.exist","thx/QueryString.hx",83,0x5b2522f0)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(name,"name")
HXLINE(  83)		return this1->exists(name);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(QueryString_Impl__obj,exist,return )

Bool QueryString_Impl__obj::remove( ::haxe::ds::StringMap this1,::String name){
            	HX_STACK_FRAME("thx._QueryString.QueryString_Impl_","remove",0xea864483,"thx._QueryString.QueryString_Impl_.remove","thx/QueryString.hx",86,0x5b2522f0)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(name,"name")
HXLINE(  86)		return this1->remove(name);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(QueryString_Impl__obj,remove,return )

Bool QueryString_Impl__obj::removeValue( ::haxe::ds::StringMap this1,::String name,::String value){
            	HX_STACK_FRAME("thx._QueryString.QueryString_Impl_","removeValue",0x99e96fee,"thx._QueryString.QueryString_Impl_.removeValue","thx/QueryString.hx",88,0x5b2522f0)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(name,"name")
            	HX_STACK_ARG(value,"value")
HXLINE(  89)		Bool _hx_tmp = !(this1->exists(name));
HXDLIN(  89)		if (_hx_tmp) {
HXLINE(  90)			return false;
            		}
HXLINE(  91)		return ( (::Array< ::String >)(this1->get(name)) )->remove(value);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(QueryString_Impl__obj,removeValue,return )

::Array< ::String > QueryString_Impl__obj::get( ::haxe::ds::StringMap this1,::String name){
            	HX_STACK_FRAME("thx._QueryString.QueryString_Impl_","get",0x7a78caf7,"thx._QueryString.QueryString_Impl_.get","thx/QueryString.hx",95,0x5b2522f0)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(name,"name")
HXLINE(  95)		return ( (::Array< ::String >)(this1->get(name)) );
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(QueryString_Impl__obj,get,return )

 ::haxe::ds::StringMap QueryString_Impl__obj::set( ::haxe::ds::StringMap this1,::String name,::String value){
            	HX_STACK_FRAME("thx._QueryString.QueryString_Impl_","set",0x7a81e603,"thx._QueryString.QueryString_Impl_.set","thx/QueryString.hx",97,0x5b2522f0)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(name,"name")
            	HX_STACK_ARG(value,"value")
HXLINE(  98)		this1->set(name,::Array_obj< ::String >::__new(1)->init(0,value));
HXLINE(  99)		return this1;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(QueryString_Impl__obj,set,return )

 ::haxe::ds::StringMap QueryString_Impl__obj::add( ::haxe::ds::StringMap this1,::String name,::String value){
            	HX_STACK_FRAME("thx._QueryString.QueryString_Impl_","add",0x7a743c82,"thx._QueryString.QueryString_Impl_.add","thx/QueryString.hx",102,0x5b2522f0)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(name,"name")
            	HX_STACK_ARG(value,"value")
HXLINE( 103)		HX_VARI( ::Array< ::String >,arr) = ( (::Array< ::String >)(this1->get(name)) );
HXLINE( 104)		if (hx::IsNull( arr )) {
HXLINE( 105)			if (hx::IsNull( value )) {
HXLINE( 105)				arr = ::Array_obj< ::String >::__new(0);
            			}
            			else {
HXLINE( 105)				arr = ::Array_obj< ::String >::__new(1)->init(0,value);
            			}
HXLINE( 106)			this1->set(name,arr);
            		}
            		else {
HXLINE( 107)			if (hx::IsNotNull( value )) {
HXLINE( 108)				arr->push(value);
            			}
            		}
HXLINE( 110)		return this1;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(QueryString_Impl__obj,add,return )

 ::haxe::ds::StringMap QueryString_Impl__obj::clone( ::haxe::ds::StringMap this1){
            	HX_STACK_FRAME("thx._QueryString.QueryString_Impl_","clone",0x597d77fe,"thx._QueryString.QueryString_Impl_.clone","thx/QueryString.hx",113,0x5b2522f0)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 114)		if (hx::IsNull( this1 )) {
HXLINE( 114)			return null();
            		}
HXLINE( 115)		HX_VARI(  ::haxe::ds::StringMap,map) =  ::haxe::ds::StringMap_obj::__new();
HXLINE( 116)		{
HXLINE( 116)			HX_VARI(  ::Dynamic,tmp) = this1->keys();
HXDLIN( 116)			while(true){
HXLINE( 116)				Bool _hx_tmp = !(( (Bool)( ::Dynamic(tmp->__Field(HX_("hasNext",6d,a5,46,18),hx::paccDynamic))()) ));
HXDLIN( 116)				if (_hx_tmp) {
HXLINE( 116)					goto _hx_goto_0;
            				}
HXDLIN( 116)				HX_VARI( ::String,key) = ( (::String)( ::Dynamic(tmp->__Field(HX_("next",f3,84,02,49),hx::paccDynamic))()) );
HXLINE( 117)				HX_VARI( ::Array< ::String >,value) = ( (::Array< ::String >)(this1->get(key)) )->copy();
HXDLIN( 117)				map->set(key,value);
            			}
            			_hx_goto_0:;
            		}
HXLINE( 118)		return map;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(QueryString_Impl__obj,clone,return )

 ::haxe::ds::StringMap QueryString_Impl__obj::setMany( ::haxe::ds::StringMap this1,::String name,::Array< ::String > values){
            	HX_STACK_FRAME("thx._QueryString.QueryString_Impl_","setMany",0x65d00c42,"thx._QueryString.QueryString_Impl_.setMany","thx/QueryString.hx",121,0x5b2522f0)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(name,"name")
            	HX_STACK_ARG(values,"values")
HXLINE( 122)		this1->set(name,values);
HXLINE( 123)		return this1;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(QueryString_Impl__obj,setMany,return )

::String QueryString_Impl__obj::toStringWithSymbols( ::haxe::ds::StringMap this1,::String separator,::String assignment, ::Dynamic encodeURIComponent){
            		HX_BEGIN_LOCAL_FUNC_S3(hx::LocalFunc,_hx_Closure_1, ::haxe::ds::StringMap,this1,::String,assignment, ::Dynamic,encodeURIComponent) HXARGC(1)
            		::Array< ::String > _hx_run(::String k){
            			HX_STACK_FRAME("thx._QueryString.QueryString_Impl_","toStringWithSymbols",0xfbb227ca,"thx._QueryString.QueryString_Impl_.toStringWithSymbols","thx/QueryString.hx",131,0x5b2522f0)
            			HX_STACK_ARG(k,"k")
HXLINE( 132)			HX_VARI( ::Array< ::String >,vs) = ( (::Array< ::String >)(this1->get(k)) );
HXDLIN( 132)			HX_VARI( ::String,ek) = ( (::String)(encodeURIComponent(k)) );
HXLINE( 134)			Bool _hx_tmp3 = (vs->length == (int)0);
HXDLIN( 134)			if (_hx_tmp3) {
HXLINE( 135)				return ::Array_obj< ::String >::__new(1)->init(0,ek);
            			}
            			else {
            				HX_BEGIN_LOCAL_FUNC_S3(hx::LocalFunc,_hx_Closure_0,::String,ek,::String,assignment, ::Dynamic,encodeURIComponent) HXARGC(1)
            				::String _hx_run(::String _){
            					HX_STACK_FRAME("thx._QueryString.QueryString_Impl_","toStringWithSymbols",0xfbb227ca,"thx._QueryString.QueryString_Impl_.toStringWithSymbols","thx/macro/lambda/SlambdaMacro.hx",86,0x8ba75432)
            					HX_STACK_ARG(_,"_")
HXLINE( 137)					::String _hx_tmp4 = ((HX_("",00,00,00,00) + ek) + assignment);
HXDLIN( 137)					::String _hx_tmp5 = ( (::String)(encodeURIComponent(_)) );
HXLINE(  86)					return (_hx_tmp4 + _hx_tmp5);
            				}
            				HX_END_LOCAL_FUNC1(return)

HXLINE( 137)				return vs->map( ::Dynamic(new _hx_Closure_0(ek,assignment,encodeURIComponent)));
            			}
HXLINE( 134)			return null();
            		}
            		HX_END_LOCAL_FUNC1(return)

            	HX_STACK_FRAME("thx._QueryString.QueryString_Impl_","toStringWithSymbols",0xfbb227ca,"thx._QueryString.QueryString_Impl_.toStringWithSymbols","thx/QueryString.hx",126,0x5b2522f0)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(separator,"separator")
            	HX_STACK_ARG(assignment,"assignment")
            	HX_STACK_ARG(encodeURIComponent,"encodeURIComponent")
HXLINE( 127)		if (hx::IsNull( this1 )) {
HXLINE( 128)			return null();
            		}
HXLINE( 129)		Bool _hx_tmp = hx::IsNull( encodeURIComponent );
HXDLIN( 129)		if (_hx_tmp) {
HXLINE( 130)			encodeURIComponent = ::thx::_QueryString::QueryString_Impl__obj::encodeURIComponent;
            		}
HXLINE( 131)		 ::Dynamic _hx_tmp1 = this1->keys();
HXDLIN( 131)		::Array< ::Dynamic> _hx_tmp2 = ::thx::Iterators_obj::map(_hx_tmp1, ::Dynamic(new _hx_Closure_1(this1,assignment,encodeURIComponent)));
HXDLIN( 131)		return ::thx::Arrays_obj::flatten(_hx_tmp2)->join(separator);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC4(QueryString_Impl__obj,toStringWithSymbols,return )

Bool QueryString_Impl__obj::equals( ::haxe::ds::StringMap this1, ::haxe::ds::StringMap other){
            	HX_STACK_FRAME("thx._QueryString.QueryString_Impl_","equals",0xa5f0967e,"thx._QueryString.QueryString_Impl_.equals","thx/QueryString.hx",142,0x5b2522f0)
            	HX_STACK_ARG(this1,"this1")
            	HX_STACK_ARG(other,"other")
HXLINE( 143)		HX_VARI( ::Array< ::Dynamic>,tuples) = ::thx::Maps_obj::tuples(other);
HXLINE( 144)		{
HXLINE( 144)			HX_VARI(  ::Dynamic,tmp) = this1->keys();
HXDLIN( 144)			while(true){
            				HX_BEGIN_LOCAL_FUNC_S1(hx::LocalFunc,_hx_Closure_0,::String,key) HXARGC(1)
            				Bool _hx_run( ::Dynamic item){
            					HX_STACK_FRAME("thx._QueryString.QueryString_Impl_","equals",0xa5f0967e,"thx._QueryString.QueryString_Impl_.equals","thx/QueryString.hx",145,0x5b2522f0)
            					HX_STACK_ARG(item,"item")
HXLINE( 145)					return (( (::String)(item->__Field(HX_("_0",f1,52,00,00),hx::paccDynamic)) ) == key);
            				}
            				HX_END_LOCAL_FUNC1(return)

HXLINE( 144)				Bool _hx_tmp = !(( (Bool)( ::Dynamic(tmp->__Field(HX_("hasNext",6d,a5,46,18),hx::paccDynamic))()) ));
HXDLIN( 144)				if (_hx_tmp) {
HXLINE( 144)					goto _hx_goto_1;
            				}
HXDLIN( 144)				HX_VARI( ::String,key) = ( (::String)( ::Dynamic(tmp->__Field(HX_("next",f3,84,02,49),hx::paccDynamic))()) );
HXLINE( 145)				HX_VARI(  ::Dynamic,t) = ::thx::Arrays_obj::find(tuples, ::Dynamic(new _hx_Closure_0(key)));
HXLINE( 146)				if (hx::IsNull( t )) {
HXLINE( 147)					return false;
            				}
HXLINE( 148)				Bool _hx_tmp1 = !(::thx::Arrays_obj::equals(( (::Array< ::String >)(this1->get(key)) ),( (::Array< ::String >)(t->__Field(HX_("_1",f2,52,00,00),hx::paccDynamic)) ),null()));
HXDLIN( 148)				if (_hx_tmp1) {
HXLINE( 149)					return false;
            				}
HXLINE( 150)				tuples->remove(t);
            			}
            			_hx_goto_1:;
            		}
HXLINE( 152)		return (tuples->length == (int)0);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(QueryString_Impl__obj,equals,return )

::String QueryString_Impl__obj::toString( ::haxe::ds::StringMap this1){
            	HX_STACK_FRAME("thx._QueryString.QueryString_Impl_","toString",0xd75646ab,"thx._QueryString.QueryString_Impl_.toString","thx/QueryString.hx",156,0x5b2522f0)
            	HX_STACK_ARG(this1,"this1")
HXLINE( 156)		return ::thx::_QueryString::QueryString_Impl__obj::toStringWithSymbols(this1,::thx::_QueryString::QueryString_Impl__obj::separator,::thx::_QueryString::QueryString_Impl__obj::assignment,::thx::_QueryString::QueryString_Impl__obj::encodeURIComponent);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(QueryString_Impl__obj,toString,return )


QueryString_Impl__obj::QueryString_Impl__obj()
{
}

bool QueryString_Impl__obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 3:
		if (HX_FIELD_EQ(inName,"get") ) { outValue = get_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"set") ) { outValue = set_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"add") ) { outValue = add_dyn(); return true; }
		break;
	case 5:
		if (HX_FIELD_EQ(inName,"empty") ) { outValue = empty_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"parse") ) { outValue = parse_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"exist") ) { outValue = exist_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"clone") ) { outValue = clone_dyn(); return true; }
		break;
	case 6:
		if (HX_FIELD_EQ(inName,"remove") ) { outValue = remove_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"equals") ) { outValue = equals_dyn(); return true; }
		break;
	case 7:
		if (HX_FIELD_EQ(inName,"isEmpty") ) { outValue = isEmpty_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"setMany") ) { outValue = setMany_dyn(); return true; }
		break;
	case 8:
		if (HX_FIELD_EQ(inName,"toObject") ) { outValue = toObject_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"toString") ) { outValue = toString_dyn(); return true; }
		break;
	case 10:
		if (HX_FIELD_EQ(inName,"fromObject") ) { outValue = fromObject_dyn(); return true; }
		break;
	case 11:
		if (HX_FIELD_EQ(inName,"removeValue") ) { outValue = removeValue_dyn(); return true; }
		break;
	case 13:
		if (HX_FIELD_EQ(inName,"isEmptyOrMono") ) { outValue = isEmptyOrMono_dyn(); return true; }
		break;
	case 16:
		if (HX_FIELD_EQ(inName,"parseWithSymbols") ) { outValue = parseWithSymbols_dyn(); return true; }
		break;
	case 19:
		if (HX_FIELD_EQ(inName,"toStringWithSymbols") ) { outValue = toStringWithSymbols_dyn(); return true; }
	}
	return false;
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *QueryString_Impl__obj_sMemberStorageInfo = 0;
static hx::StaticInfo QueryString_Impl__obj_sStaticStorageInfo[] = {
	{hx::fsString,(void *) &QueryString_Impl__obj::separator,HX_HCSTRING("separator","\x65","\x60","\x7f","\x31")},
	{hx::fsString,(void *) &QueryString_Impl__obj::assignment,HX_HCSTRING("assignment","\x4d","\xcf","\xcf","\x2b")},
	{hx::fsObject /*Dynamic*/ ,(void *) &QueryString_Impl__obj::encodeURIComponent,HX_HCSTRING("encodeURIComponent","\xe7","\x7a","\xc2","\x59")},
	{hx::fsObject /*Dynamic*/ ,(void *) &QueryString_Impl__obj::decodeURIComponent,HX_HCSTRING("decodeURIComponent","\xff","\x29","\xcc","\xac")},
	{ hx::fsUnknown, 0, null()}
};
#endif

static void QueryString_Impl__obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(QueryString_Impl__obj::__mClass,"__mClass");
	HX_MARK_MEMBER_NAME(QueryString_Impl__obj::separator,"separator");
	HX_MARK_MEMBER_NAME(QueryString_Impl__obj::assignment,"assignment");
	HX_MARK_MEMBER_NAME(QueryString_Impl__obj::encodeURIComponent,"encodeURIComponent");
	HX_MARK_MEMBER_NAME(QueryString_Impl__obj::decodeURIComponent,"decodeURIComponent");
};

#ifdef HXCPP_VISIT_ALLOCS
static void QueryString_Impl__obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(QueryString_Impl__obj::__mClass,"__mClass");
	HX_VISIT_MEMBER_NAME(QueryString_Impl__obj::separator,"separator");
	HX_VISIT_MEMBER_NAME(QueryString_Impl__obj::assignment,"assignment");
	HX_VISIT_MEMBER_NAME(QueryString_Impl__obj::encodeURIComponent,"encodeURIComponent");
	HX_VISIT_MEMBER_NAME(QueryString_Impl__obj::decodeURIComponent,"decodeURIComponent");
};

#endif

hx::Class QueryString_Impl__obj::__mClass;

static ::String QueryString_Impl__obj_sStaticFields[] = {
	HX_HCSTRING("separator","\x65","\x60","\x7f","\x31"),
	HX_HCSTRING("assignment","\x4d","\xcf","\xcf","\x2b"),
	HX_HCSTRING("encodeURIComponent","\xe7","\x7a","\xc2","\x59"),
	HX_HCSTRING("decodeURIComponent","\xff","\x29","\xcc","\xac"),
	HX_HCSTRING("empty","\x8d","\x3a","\xda","\x6f"),
	HX_HCSTRING("parseWithSymbols","\x42","\xbb","\x07","\xec"),
	HX_HCSTRING("parse","\x33","\x90","\x55","\xbd"),
	HX_HCSTRING("fromObject","\xc9","\x83","\x83","\x58"),
	HX_HCSTRING("toObject","\x9a","\x26","\x7e","\x3c"),
	HX_HCSTRING("isEmpty","\x43","\xde","\x5f","\x0c"),
	HX_HCSTRING("isEmptyOrMono","\x89","\x1d","\xd2","\x09"),
	HX_HCSTRING("exist","\xb7","\x42","\x1a","\x77"),
	HX_HCSTRING("remove","\x44","\x9c","\x88","\x04"),
	HX_HCSTRING("removeValue","\x8d","\x5c","\xec","\x2f"),
	HX_HCSTRING("get","\x96","\x80","\x4e","\x00"),
	HX_HCSTRING("set","\xa2","\x9b","\x57","\x00"),
	HX_HCSTRING("add","\x21","\xf2","\x49","\x00"),
	HX_HCSTRING("clone","\x5d","\x13","\x63","\x48"),
	HX_HCSTRING("setMany","\x61","\x7d","\xda","\x0d"),
	HX_HCSTRING("toStringWithSymbols","\x69","\x4b","\x71","\xf4"),
	HX_HCSTRING("equals","\x3f","\xee","\xf2","\xbf"),
	HX_HCSTRING("toString","\xac","\xd0","\x6e","\x38"),
	::String(null())
};

void QueryString_Impl__obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx._QueryString.QueryString_Impl_","\x4f","\xa6","\x4f","\x07");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &QueryString_Impl__obj::__GetStatic;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = QueryString_Impl__obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(QueryString_Impl__obj_sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< QueryString_Impl__obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = QueryString_Impl__obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = QueryString_Impl__obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = QueryString_Impl__obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

void QueryString_Impl__obj::__boot()
{
{
            	HX_STACK_FRAME("thx._QueryString.QueryString_Impl_","boot",0xabf24eb1,"thx._QueryString.QueryString_Impl_.boot","thx/QueryString.hx",14,0x5b2522f0)
HXLINE(  14)		separator = HX_("&",26,00,00,00);
            	}
{
            	HX_STACK_FRAME("thx._QueryString.QueryString_Impl_","boot",0xabf24eb1,"thx._QueryString.QueryString_Impl_.boot","thx/QueryString.hx",15,0x5b2522f0)
HXLINE(  15)		assignment = HX_("=",3d,00,00,00);
            	}
	encodeURIComponent = new __default_encodeURIComponent;

	decodeURIComponent = new __default_decodeURIComponent;

}

} // end namespace thx
} // end namespace _QueryString
