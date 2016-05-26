// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_Lambda
#include <Lambda.h>
#endif
#ifndef INCLUDED_Reflect
#include <Reflect.h>
#endif
#ifndef INCLUDED_Type
#include <Type.h>
#endif
#ifndef INCLUDED_haxe_ds_Option
#include <haxe/ds/Option.h>
#endif
#ifndef INCLUDED_thx_Functions
#include <thx/Functions.h>
#endif
#ifndef INCLUDED_thx_Iterables
#include <thx/Iterables.h>
#endif
#ifndef INCLUDED_thx_Iterators
#include <thx/Iterators.h>
#endif
#ifndef INCLUDED_thx_Options
#include <thx/Options.h>
#endif
#ifndef INCLUDED_thx_OrderingImpl
#include <thx/OrderingImpl.h>
#endif
#ifndef INCLUDED_thx__Ord_Ord_Impl_
#include <thx/_Ord/Ord_Impl_.h>
#endif

namespace thx{

void Iterables_obj::__construct() { }

Dynamic Iterables_obj::__CreateEmpty() { return new Iterables_obj; }

hx::ObjectPtr< Iterables_obj > Iterables_obj::__new()
{
	hx::ObjectPtr< Iterables_obj > _hx_result = new Iterables_obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic Iterables_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< Iterables_obj > _hx_result = new Iterables_obj();
	_hx_result->__construct();
	return _hx_result;
}

Bool Iterables_obj::all( ::Dynamic it, ::Dynamic predicate){
            	HX_STACK_FRAME("thx.Iterables","all",0x5057662a,"thx.Iterables.all","thx/Iterables.hx",24,0x02619fa8)
            	HX_STACK_ARG(it,"it")
            	HX_STACK_ARG(predicate,"predicate")
HXLINE(  24)		 ::Dynamic _hx_tmp =  ::Dynamic(it->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN(  24)		return ::thx::Iterators_obj::all(_hx_tmp,predicate);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Iterables_obj,all,return )

Bool Iterables_obj::any( ::Dynamic it, ::Dynamic predicate){
            	HX_STACK_FRAME("thx.Iterables","any",0x505767f5,"thx.Iterables.any","thx/Iterables.hx",30,0x02619fa8)
            	HX_STACK_ARG(it,"it")
            	HX_STACK_ARG(predicate,"predicate")
HXLINE(  30)		 ::Dynamic _hx_tmp =  ::Dynamic(it->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN(  30)		return ::thx::Iterators_obj::any(_hx_tmp,predicate);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Iterables_obj,any,return )

void Iterables_obj::eachPair( ::Dynamic it, ::Dynamic handler){
            	HX_STACK_FRAME("thx.Iterables","eachPair",0xdf12cd12,"thx.Iterables.eachPair","thx/Iterables.hx",36,0x02619fa8)
            	HX_STACK_ARG(it,"it")
            	HX_STACK_ARG(handler,"handler")
HXLINE(  36)		 ::Dynamic _hx_tmp =  ::Dynamic(it->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN(  36)		::thx::Iterators_obj::eachPair(_hx_tmp,handler);
HXDLIN(  36)		return;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Iterables_obj,eachPair,(void))

Bool Iterables_obj::equals( ::Dynamic a, ::Dynamic b, ::Dynamic equality){
            	HX_STACK_FRAME("thx.Iterables","equals",0x483a8cd6,"thx.Iterables.equals","thx/Iterables.hx",44,0x02619fa8)
            	HX_STACK_ARG(a,"a")
            	HX_STACK_ARG(b,"b")
            	HX_STACK_ARG(equality,"equality")
HXLINE(  44)		 ::Dynamic _hx_tmp =  ::Dynamic(a->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN(  44)		 ::Dynamic _hx_tmp1 =  ::Dynamic(b->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN(  44)		return ::thx::Iterators_obj::equals(_hx_tmp,_hx_tmp1,equality);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(Iterables_obj,equals,return )

::cpp::VirtualArray Iterables_obj::filter( ::Dynamic it, ::Dynamic predicate){
            	HX_STACK_FRAME("thx.Iterables","filter",0x0d7cbe4f,"thx.Iterables.filter","thx/Iterables.hx",50,0x02619fa8)
            	HX_STACK_ARG(it,"it")
            	HX_STACK_ARG(predicate,"predicate")
HXLINE(  50)		 ::Dynamic _hx_tmp =  ::Dynamic(it->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN(  50)		return ::thx::Iterators_obj::filter(_hx_tmp,predicate);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Iterables_obj,filter,return )

 ::Dynamic Iterables_obj::find( ::Dynamic it, ::Dynamic predicate){
            	HX_STACK_FRAME("thx.Iterables","find",0xff6dcb10,"thx.Iterables.find","thx/Iterables.hx",56,0x02619fa8)
            	HX_STACK_ARG(it,"it")
            	HX_STACK_ARG(predicate,"predicate")
HXLINE(  56)		 ::Dynamic _hx_tmp =  ::Dynamic(it->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN(  56)		return ::thx::Iterators_obj::find(_hx_tmp,predicate);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Iterables_obj,find,return )

::hx::EnumBase Iterables_obj::findOption( ::Dynamic it, ::Dynamic predicate){
            	HX_STACK_FRAME("thx.Iterables","findOption",0x4dbebea5,"thx.Iterables.findOption","thx/Iterables.hx",62,0x02619fa8)
            	HX_STACK_ARG(it,"it")
            	HX_STACK_ARG(predicate,"predicate")
HXLINE(  62)		 ::Dynamic _hx_tmp =  ::Dynamic(it->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN(  62)		HX_VARI(  ::Dynamic,value) = ::thx::Iterators_obj::find(_hx_tmp,predicate);
HXDLIN(  62)		if (hx::IsNull( value )) {
HXLINE(  62)			return ::haxe::ds::Option_obj::None_dyn();
            		}
            		else {
HXLINE(  62)			return ::haxe::ds::Option_obj::Some(value);
            		}
HXDLIN(  62)		return null();
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Iterables_obj,findOption,return )

 ::Dynamic Iterables_obj::first( ::Dynamic it){
            	HX_STACK_FRAME("thx.Iterables","first",0x80a6f979,"thx.Iterables.first","thx/Iterables.hx",68,0x02619fa8)
            	HX_STACK_ARG(it,"it")
HXLINE(  68)		 ::Dynamic _hx_tmp =  ::Dynamic(it->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN(  68)		return ::thx::Iterators_obj::first(_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Iterables_obj,first,return )

 ::Dynamic Iterables_obj::get( ::Dynamic it,Int index){
            	HX_STACK_FRAME("thx.Iterables","get",0x505bed9f,"thx.Iterables.get","thx/Iterables.hx",74,0x02619fa8)
            	HX_STACK_ARG(it,"it")
            	HX_STACK_ARG(index,"index")
HXLINE(  74)		 ::Dynamic _hx_tmp =  ::Dynamic(it->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN(  74)		return ::thx::Iterators_obj::get(_hx_tmp,index);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Iterables_obj,get,return )

::hx::EnumBase Iterables_obj::getOption( ::Dynamic it,Int index){
            	HX_STACK_FRAME("thx.Iterables","getOption",0x196fb674,"thx.Iterables.getOption","thx/Iterables.hx",80,0x02619fa8)
            	HX_STACK_ARG(it,"it")
            	HX_STACK_ARG(index,"index")
HXLINE(  80)		 ::Dynamic _hx_tmp =  ::Dynamic(it->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN(  80)		HX_VARI(  ::Dynamic,value) = ::thx::Iterators_obj::get(_hx_tmp,index);
HXDLIN(  80)		if (hx::IsNull( value )) {
HXLINE(  80)			return ::haxe::ds::Option_obj::None_dyn();
            		}
            		else {
HXLINE(  80)			return ::haxe::ds::Option_obj::Some(value);
            		}
HXDLIN(  80)		return null();
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Iterables_obj,getOption,return )

 ::Dynamic Iterables_obj::last( ::Dynamic it){
            	HX_STACK_FRAME("thx.Iterables","last",0x035f052d,"thx.Iterables.last","thx/Iterables.hx",86,0x02619fa8)
            	HX_STACK_ARG(it,"it")
HXLINE(  86)		 ::Dynamic _hx_tmp =  ::Dynamic(it->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN(  86)		return ::thx::Iterators_obj::last(_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Iterables_obj,last,return )

Bool Iterables_obj::hasElements( ::Dynamic it){
            	HX_STACK_FRAME("thx.Iterables","hasElements",0x2fba39ba,"thx.Iterables.hasElements","thx/Iterables.hx",92,0x02619fa8)
            	HX_STACK_ARG(it,"it")
HXLINE(  92)		HX_VARI_NAME(  ::Dynamic,it1,"it") =  ::Dynamic(it->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN(  92)		return ( (Bool)( ::Dynamic(it1->__Field(HX_("hasNext",6d,a5,46,18),hx::paccDynamic))()) );
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Iterables_obj,hasElements,return )

Int Iterables_obj::indexOf( ::Dynamic it, ::Dynamic element){
            	HX_STACK_FRAME("thx.Iterables","indexOf",0x97226e52,"thx.Iterables.indexOf","thx/Iterables.hx",98,0x02619fa8)
            	HX_STACK_ARG(it,"it")
            	HX_STACK_ARG(element,"element")
HXLINE(  98)		 ::Dynamic _hx_tmp =  ::Dynamic(it->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN(  98)		return ::thx::Iterators_obj::indexOf(_hx_tmp,element);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Iterables_obj,indexOf,return )

Bool Iterables_obj::isEmpty( ::Dynamic it){
            	HX_STACK_FRAME("thx.Iterables","isEmpty",0xc2c303cc,"thx.Iterables.isEmpty","thx/Iterables.hx",104,0x02619fa8)
            	HX_STACK_ARG(it,"it")
HXLINE( 104)		HX_VARI_NAME(  ::Dynamic,it1,"it") =  ::Dynamic(it->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN( 104)		return !(( (Bool)( ::Dynamic(it1->__Field(HX_("hasNext",6d,a5,46,18),hx::paccDynamic))()) ));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Iterables_obj,isEmpty,return )

Bool Iterables_obj::isIterable( ::Dynamic v){
            	HX_STACK_FRAME("thx.Iterables","isIterable",0x072be6d3,"thx.Iterables.isIterable","thx/Iterables.hx",112,0x02619fa8)
            	HX_STACK_ARG(v,"v")
HXLINE( 113)		HX_VAR( ::Array< ::String >,fields);
HXDLIN( 113)		Bool _hx_tmp;
HXDLIN( 113)		Bool _hx_tmp1 = ::Reflect_obj::isObject(v);
HXDLIN( 113)		if (_hx_tmp1) {
HXLINE( 113)			hx::Class _hx_tmp2 = ::Type_obj::getClass(v);
HXDLIN( 113)			_hx_tmp = hx::IsNull( _hx_tmp2 );
            		}
            		else {
HXLINE( 113)			_hx_tmp = false;
            		}
HXDLIN( 113)		if (_hx_tmp) {
HXLINE( 113)			fields = ::Reflect_obj::fields(v);
            		}
            		else {
HXLINE( 113)			hx::Class _hx_tmp3 = ::Type_obj::getClass(v);
HXDLIN( 113)			fields = ::Type_obj::getInstanceFields(_hx_tmp3);
            		}
HXLINE( 114)		Bool _hx_tmp4 = !(::Lambda_obj::has(fields,HX_("iterator",ee,49,9a,93)));
HXDLIN( 114)		if (_hx_tmp4) {
HXLINE( 114)			return false;
            		}
HXLINE( 115)		 ::Dynamic _hx_tmp5 = ::Reflect_obj::field(v,HX_("iterator",ee,49,9a,93));
HXDLIN( 115)		return ::Reflect_obj::isFunction(_hx_tmp5);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Iterables_obj,isIterable,return )

::cpp::VirtualArray Iterables_obj::map( ::Dynamic it, ::Dynamic f){
            	HX_STACK_FRAME("thx.Iterables","map",0x506077a5,"thx.Iterables.map","thx/Iterables.hx",122,0x02619fa8)
            	HX_STACK_ARG(it,"it")
            	HX_STACK_ARG(f,"f")
HXLINE( 122)		 ::Dynamic _hx_tmp =  ::Dynamic(it->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN( 122)		return ::thx::Iterators_obj::map(_hx_tmp,f);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Iterables_obj,map,return )

 ::Dynamic Iterables_obj::fmap( ::Dynamic it, ::Dynamic f){
            		HX_BEGIN_LOCAL_FUNC_S2(hx::LocalFunc,_hx_Closure_0, ::Dynamic,f, ::Dynamic,it) HXARGC(0)
            		 ::Dynamic _hx_run(){
            			HX_STACK_FRAME("thx.Iterables","fmap",0xff70c8cd,"thx.Iterables.fmap","thx/Iterables.hx",128,0x02619fa8)
HXLINE( 128)			 ::Dynamic _hx_tmp =  ::Dynamic(it->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN( 128)			return ::thx::Iterators_obj::fmap(_hx_tmp,f);
            		}
            		HX_END_LOCAL_FUNC0(return)

            	HX_STACK_FRAME("thx.Iterables","fmap",0xff70c8cd,"thx.Iterables.fmap","thx/Iterables.hx",128,0x02619fa8)
            	HX_STACK_ARG(it,"it")
            	HX_STACK_ARG(f,"f")
HXLINE( 128)		return  ::Dynamic(hx::Anon_obj::Create(1)
            			->setFixed(0,HX_("iterator",ee,49,9a,93), ::Dynamic(new _hx_Closure_0(f,it))));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Iterables_obj,fmap,return )

::cpp::VirtualArray Iterables_obj::mapi( ::Dynamic it, ::Dynamic f){
            	HX_STACK_FRAME("thx.Iterables","mapi",0x04083924,"thx.Iterables.mapi","thx/Iterables.hx",134,0x02619fa8)
            	HX_STACK_ARG(it,"it")
            	HX_STACK_ARG(f,"f")
HXLINE( 134)		 ::Dynamic _hx_tmp =  ::Dynamic(it->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN( 134)		return ::thx::Iterators_obj::mapi(_hx_tmp,f);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Iterables_obj,mapi,return )

 ::Dynamic Iterables_obj::fmapi( ::Dynamic it, ::Dynamic f){
            		HX_BEGIN_LOCAL_FUNC_S2(hx::LocalFunc,_hx_Closure_0, ::Dynamic,f, ::Dynamic,it) HXARGC(0)
            		 ::Dynamic _hx_run(){
            			HX_STACK_FRAME("thx.Iterables","fmapi",0x833eeafc,"thx.Iterables.fmapi","thx/Iterables.hx",140,0x02619fa8)
HXLINE( 140)			 ::Dynamic _hx_tmp =  ::Dynamic(it->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN( 140)			return ::thx::Iterators_obj::fmapi(_hx_tmp,f);
            		}
            		HX_END_LOCAL_FUNC0(return)

            	HX_STACK_FRAME("thx.Iterables","fmapi",0x833eeafc,"thx.Iterables.fmapi","thx/Iterables.hx",140,0x02619fa8)
            	HX_STACK_ARG(it,"it")
            	HX_STACK_ARG(f,"f")
HXLINE( 140)		return  ::Dynamic(hx::Anon_obj::Create(1)
            			->setFixed(0,HX_("iterator",ee,49,9a,93), ::Dynamic(new _hx_Closure_0(f,it))));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Iterables_obj,fmapi,return )

::cpp::VirtualArray Iterables_obj::order( ::Dynamic it, ::Dynamic sort){
            	HX_STACK_FRAME("thx.Iterables","order",0xb52a71d7,"thx.Iterables.order","thx/Iterables.hx",146,0x02619fa8)
            	HX_STACK_ARG(it,"it")
            	HX_STACK_ARG(sort,"sort")
HXLINE( 146)		 ::Dynamic _hx_tmp =  ::Dynamic(it->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN( 146)		return ::thx::Iterators_obj::order(_hx_tmp,sort);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Iterables_obj,order,return )

 ::Dynamic Iterables_obj::reduce( ::Dynamic it, ::Dynamic callback, ::Dynamic initial){
            	HX_STACK_FRAME("thx.Iterables","reduce",0x86e1cc3d,"thx.Iterables.reduce","thx/Iterables.hx",152,0x02619fa8)
            	HX_STACK_ARG(it,"it")
            	HX_STACK_ARG(callback,"callback")
            	HX_STACK_ARG(initial,"initial")
HXLINE( 152)		 ::Dynamic _hx_tmp =  ::Dynamic(it->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN( 152)		return ::thx::Iterators_obj::reduce(_hx_tmp,callback,initial);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(Iterables_obj,reduce,return )

 ::Dynamic Iterables_obj::reducei( ::Dynamic it, ::Dynamic callback, ::Dynamic initial){
            	HX_STACK_FRAME("thx.Iterables","reducei",0x7eb0e98c,"thx.Iterables.reducei","thx/Iterables.hx",158,0x02619fa8)
            	HX_STACK_ARG(it,"it")
            	HX_STACK_ARG(callback,"callback")
            	HX_STACK_ARG(initial,"initial")
HXLINE( 158)		 ::Dynamic _hx_tmp =  ::Dynamic(it->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN( 158)		return ::thx::Iterators_obj::reducei(_hx_tmp,callback,initial);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(Iterables_obj,reducei,return )

::cpp::VirtualArray Iterables_obj::toArray( ::Dynamic it){
            	HX_STACK_FRAME("thx.Iterables","toArray",0xa876dfa7,"thx.Iterables.toArray","thx/Iterables.hx",164,0x02619fa8)
            	HX_STACK_ARG(it,"it")
HXLINE( 164)		 ::Dynamic _hx_tmp =  ::Dynamic(it->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN( 164)		return ::thx::Iterators_obj::toArray(_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Iterables_obj,toArray,return )

::hx::EnumBase Iterables_obj::minBy( ::Dynamic it, ::Dynamic f, ::Dynamic ord){
            	HX_STACK_FRAME("thx.Iterables","minBy",0x8871d552,"thx.Iterables.minBy","thx/Iterables.hx",170,0x02619fa8)
            	HX_STACK_ARG(it,"it")
            	HX_STACK_ARG(f,"f")
            	HX_STACK_ARG(ord,"ord")
HXLINE( 171)		HX_VARI( ::hx::EnumBase,found) = ::haxe::ds::Option_obj::None_dyn();
HXLINE( 172)		{
HXLINE( 172)			HX_VARI(  ::Dynamic,tmp) =  ::Dynamic(it->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN( 172)			while(true){
            				HX_BEGIN_LOCAL_FUNC_S3(hx::LocalFunc,_hx_Closure_0, ::Dynamic,a, ::Dynamic,ord, ::Dynamic,f) HXARGC(1)
            				Bool _hx_run( ::Dynamic a0){
            					HX_STACK_FRAME("thx.Iterables","minBy",0x8871d552,"thx.Iterables.minBy","thx/Iterables.hx",173,0x02619fa8)
            					HX_STACK_ARG(a0,"a0")
HXLINE( 173)					 ::Dynamic _hx_tmp2 = f(a0);
HXDLIN( 173)					 ::Dynamic _hx_tmp3 = f(a);
HXDLIN( 173)					::hx::EnumBase _hx_tmp4 = ord(_hx_tmp2,_hx_tmp3);
HXDLIN( 173)					return hx::IsEq( _hx_tmp4,::thx::OrderingImpl_obj::LT_dyn() );
            				}
            				HX_END_LOCAL_FUNC1(return)

HXLINE( 172)				Bool _hx_tmp = !(( (Bool)( ::Dynamic(tmp->__Field(HX_("hasNext",6d,a5,46,18),hx::paccDynamic))()) ));
HXDLIN( 172)				if (_hx_tmp) {
HXLINE( 172)					goto _hx_goto_0;
            				}
HXDLIN( 172)				HX_VARI(  ::Dynamic,a) =  ::Dynamic(tmp->__Field(HX_("next",f3,84,02,49),hx::paccDynamic))();
HXLINE( 173)				Bool _hx_tmp1 = ::thx::Options_obj::any(found, ::Dynamic(new _hx_Closure_0(a,ord,f)));
HXDLIN( 173)				if (_hx_tmp1) {
HXLINE( 173)					found = found;
            				}
            				else {
HXLINE( 173)					found = ::haxe::ds::Option_obj::Some(a);
            				}
            			}
            			_hx_goto_0:;
            		}
HXLINE( 175)		return found;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(Iterables_obj,minBy,return )

::hx::EnumBase Iterables_obj::maxBy( ::Dynamic it, ::Dynamic f, ::Dynamic ord){
            	HX_STACK_FRAME("thx.Iterables","maxBy",0x832fb6e4,"thx.Iterables.maxBy","thx/Iterables.hx",183,0x02619fa8)
            	HX_STACK_ARG(it,"it")
            	HX_STACK_ARG(f,"f")
            	HX_STACK_ARG(ord,"ord")
HXLINE( 183)		 ::Dynamic _hx_tmp = ::thx::_Ord::Ord_Impl__obj::inverse(ord);
HXDLIN( 183)		return ::thx::Iterables_obj::minBy(it,f,_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(Iterables_obj,maxBy,return )

::hx::EnumBase Iterables_obj::min( ::Dynamic it, ::Dynamic ord){
            	HX_STACK_FRAME("thx.Iterables","min",0x50607e9b,"thx.Iterables.min","thx/Iterables.hx",190,0x02619fa8)
            	HX_STACK_ARG(it,"it")
            	HX_STACK_ARG(ord,"ord")
HXLINE( 190)		return ::thx::Iterables_obj::minBy(it,::thx::Functions_obj::identity_dyn(),ord);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Iterables_obj,min,return )

::hx::EnumBase Iterables_obj::max( ::Dynamic it, ::Dynamic ord){
            	HX_STACK_FRAME("thx.Iterables","max",0x506077ad,"thx.Iterables.max","thx/Iterables.hx",197,0x02619fa8)
            	HX_STACK_ARG(it,"it")
            	HX_STACK_ARG(ord,"ord")
HXLINE( 197)		HX_VARI_NAME(  ::Dynamic,ord1,"ord") = ::thx::_Ord::Ord_Impl__obj::inverse(ord);
HXDLIN( 197)		return ::thx::Iterables_obj::minBy(it,::thx::Functions_obj::identity_dyn(),ord1);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Iterables_obj,max,return )

::hx::EnumBase Iterables_obj::extremaBy( ::Dynamic it, ::Dynamic f, ::Dynamic ord){
            	HX_STACK_FRAME("thx.Iterables","extremaBy",0x56b9e4a8,"thx.Iterables.extremaBy","thx/Iterables.hx",204,0x02619fa8)
            	HX_STACK_ARG(it,"it")
            	HX_STACK_ARG(f,"f")
            	HX_STACK_ARG(ord,"ord")
HXLINE( 205)		HX_VARI( ::hx::EnumBase,found) = ::haxe::ds::Option_obj::None_dyn();
HXLINE( 206)		{
HXLINE( 206)			HX_VARI(  ::Dynamic,tmp) =  ::Dynamic(it->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN( 206)			while(true){
HXLINE( 206)				Bool _hx_tmp = !(( (Bool)( ::Dynamic(tmp->__Field(HX_("hasNext",6d,a5,46,18),hx::paccDynamic))()) ));
HXDLIN( 206)				if (_hx_tmp) {
HXLINE( 206)					goto _hx_goto_1;
            				}
HXDLIN( 206)				HX_VARI(  ::Dynamic,a) =  ::Dynamic(tmp->__Field(HX_("next",f3,84,02,49),hx::paccDynamic))();
HXLINE( 207)				Int _hx_tmp1 = ( ( ::hx::EnumBase)(found) )->_hx_getIndex();
HXDLIN( 207)				switch((int)(_hx_tmp1)){
            					case (int)0: {
HXLINE( 209)						HX_VARI(  ::Dynamic,t) = found->_hx_getObject(0);
HXDLIN( 209)						 ::Dynamic _hx_tmp2 = f(a);
HXDLIN( 209)						 ::Dynamic _hx_tmp3 = f( ::Dynamic(t->__Field(HX_("_0",f1,52,00,00),hx::paccDynamic)));
HXDLIN( 209)						::hx::EnumBase _hx_tmp4 = ord(_hx_tmp2,_hx_tmp3);
HXDLIN( 209)						if (hx::IsEq( _hx_tmp4,::thx::OrderingImpl_obj::LT_dyn() )) {
HXLINE( 209)							found = ::haxe::ds::Option_obj::Some( ::Dynamic(hx::Anon_obj::Create(2)
            								->setFixed(0,HX_("_0",f1,52,00,00),a)
            								->setFixed(1,HX_("_1",f2,52,00,00), ::Dynamic(t->__Field(HX_("_1",f2,52,00,00),hx::paccDynamic)))));
            						}
            						else {
HXLINE( 210)							HX_VARI_NAME(  ::Dynamic,t1,"t") = found->_hx_getObject(0);
HXDLIN( 210)							 ::Dynamic _hx_tmp5 = f(a);
HXDLIN( 210)							 ::Dynamic _hx_tmp6 = f( ::Dynamic(t1->__Field(HX_("_1",f2,52,00,00),hx::paccDynamic)));
HXDLIN( 210)							::hx::EnumBase _hx_tmp7 = ord(_hx_tmp5,_hx_tmp6);
HXDLIN( 210)							if (hx::IsEq( _hx_tmp7,::thx::OrderingImpl_obj::GT_dyn() )) {
HXLINE( 210)								found = ::haxe::ds::Option_obj::Some( ::Dynamic(hx::Anon_obj::Create(2)
            									->setFixed(0,HX_("_0",f1,52,00,00), ::Dynamic(t1->__Field(HX_("_0",f1,52,00,00),hx::paccDynamic)))
            									->setFixed(1,HX_("_1",f2,52,00,00),a)));
            							}
            							else {
HXLINE( 211)								found = found;
            							}
            						}
            					}
            					break;
            					case (int)1: {
HXLINE( 208)						found = ::haxe::ds::Option_obj::Some( ::Dynamic(hx::Anon_obj::Create(2)
            							->setFixed(0,HX_("_0",f1,52,00,00),a)
            							->setFixed(1,HX_("_1",f2,52,00,00),a)));
            					}
            					break;
            					default:{
HXLINE( 211)						found = found;
            					}
            				}
            			}
            			_hx_goto_1:;
            		}
HXLINE( 214)		return found;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(Iterables_obj,extremaBy,return )

::hx::EnumBase Iterables_obj::extrema( ::Dynamic it, ::Dynamic ord){
            	HX_STACK_FRAME("thx.Iterables","extrema",0x2f50ec71,"thx.Iterables.extrema","thx/Iterables.hx",222,0x02619fa8)
            	HX_STACK_ARG(it,"it")
            	HX_STACK_ARG(ord,"ord")
HXLINE( 222)		return ::thx::Iterables_obj::extremaBy(it,::thx::Functions_obj::identity_dyn(),ord);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Iterables_obj,extrema,return )

 ::Dynamic Iterables_obj::unzip( ::Dynamic it){
            	HX_STACK_FRAME("thx.Iterables","unzip",0x26fdc771,"thx.Iterables.unzip","thx/Iterables.hx",228,0x02619fa8)
            	HX_STACK_ARG(it,"it")
HXLINE( 228)		 ::Dynamic _hx_tmp =  ::Dynamic(it->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN( 228)		return ::thx::Iterators_obj::unzip(_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Iterables_obj,unzip,return )

 ::Dynamic Iterables_obj::unzip3( ::Dynamic it){
            	HX_STACK_FRAME("thx.Iterables","unzip3",0xf710bba2,"thx.Iterables.unzip3","thx/Iterables.hx",233,0x02619fa8)
            	HX_STACK_ARG(it,"it")
HXLINE( 233)		 ::Dynamic _hx_tmp =  ::Dynamic(it->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN( 233)		return ::thx::Iterators_obj::unzip3(_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Iterables_obj,unzip3,return )

 ::Dynamic Iterables_obj::unzip4( ::Dynamic it){
            	HX_STACK_FRAME("thx.Iterables","unzip4",0xf710bba3,"thx.Iterables.unzip4","thx/Iterables.hx",239,0x02619fa8)
            	HX_STACK_ARG(it,"it")
HXLINE( 239)		 ::Dynamic _hx_tmp =  ::Dynamic(it->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN( 239)		return ::thx::Iterators_obj::unzip4(_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Iterables_obj,unzip4,return )

 ::Dynamic Iterables_obj::unzip5( ::Dynamic it){
            	HX_STACK_FRAME("thx.Iterables","unzip5",0xf710bba4,"thx.Iterables.unzip5","thx/Iterables.hx",245,0x02619fa8)
            	HX_STACK_ARG(it,"it")
HXLINE( 245)		 ::Dynamic _hx_tmp =  ::Dynamic(it->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN( 245)		return ::thx::Iterators_obj::unzip5(_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Iterables_obj,unzip5,return )

::Array< ::Dynamic> Iterables_obj::zip( ::Dynamic it1, ::Dynamic it2){
            	HX_STACK_FRAME("thx.Iterables","zip",0x506a5bea,"thx.Iterables.zip","thx/Iterables.hx",251,0x02619fa8)
            	HX_STACK_ARG(it1,"it1")
            	HX_STACK_ARG(it2,"it2")
HXLINE( 251)		 ::Dynamic _hx_tmp =  ::Dynamic(it1->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN( 251)		 ::Dynamic _hx_tmp1 =  ::Dynamic(it2->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN( 251)		return ::thx::Iterators_obj::zip(_hx_tmp,_hx_tmp1);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Iterables_obj,zip,return )

::Array< ::Dynamic> Iterables_obj::zip3( ::Dynamic it1, ::Dynamic it2, ::Dynamic it3){
            	HX_STACK_FRAME("thx.Iterables","zip3",0x0ca61109,"thx.Iterables.zip3","thx/Iterables.hx",257,0x02619fa8)
            	HX_STACK_ARG(it1,"it1")
            	HX_STACK_ARG(it2,"it2")
            	HX_STACK_ARG(it3,"it3")
HXLINE( 257)		 ::Dynamic _hx_tmp =  ::Dynamic(it1->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN( 257)		 ::Dynamic _hx_tmp1 =  ::Dynamic(it2->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN( 257)		 ::Dynamic _hx_tmp2 =  ::Dynamic(it3->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN( 257)		return ::thx::Iterators_obj::zip3(_hx_tmp,_hx_tmp1,_hx_tmp2);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(Iterables_obj,zip3,return )

::Array< ::Dynamic> Iterables_obj::zip4( ::Dynamic it1, ::Dynamic it2, ::Dynamic it3, ::Dynamic it4){
            	HX_STACK_FRAME("thx.Iterables","zip4",0x0ca6110a,"thx.Iterables.zip4","thx/Iterables.hx",263,0x02619fa8)
            	HX_STACK_ARG(it1,"it1")
            	HX_STACK_ARG(it2,"it2")
            	HX_STACK_ARG(it3,"it3")
            	HX_STACK_ARG(it4,"it4")
HXLINE( 263)		 ::Dynamic _hx_tmp =  ::Dynamic(it1->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN( 263)		 ::Dynamic _hx_tmp1 =  ::Dynamic(it2->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN( 263)		 ::Dynamic _hx_tmp2 =  ::Dynamic(it3->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN( 263)		 ::Dynamic _hx_tmp3 =  ::Dynamic(it4->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN( 263)		return ::thx::Iterators_obj::zip4(_hx_tmp,_hx_tmp1,_hx_tmp2,_hx_tmp3);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC4(Iterables_obj,zip4,return )

::Array< ::Dynamic> Iterables_obj::zip5( ::Dynamic it1, ::Dynamic it2, ::Dynamic it3, ::Dynamic it4, ::Dynamic it5){
            	HX_STACK_FRAME("thx.Iterables","zip5",0x0ca6110b,"thx.Iterables.zip5","thx/Iterables.hx",269,0x02619fa8)
            	HX_STACK_ARG(it1,"it1")
            	HX_STACK_ARG(it2,"it2")
            	HX_STACK_ARG(it3,"it3")
            	HX_STACK_ARG(it4,"it4")
            	HX_STACK_ARG(it5,"it5")
HXLINE( 269)		 ::Dynamic _hx_tmp =  ::Dynamic(it1->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN( 269)		 ::Dynamic _hx_tmp1 =  ::Dynamic(it2->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN( 269)		 ::Dynamic _hx_tmp2 =  ::Dynamic(it3->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN( 269)		 ::Dynamic _hx_tmp3 =  ::Dynamic(it4->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN( 269)		 ::Dynamic _hx_tmp4 =  ::Dynamic(it5->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN( 269)		return ::thx::Iterators_obj::zip5(_hx_tmp,_hx_tmp1,_hx_tmp2,_hx_tmp3,_hx_tmp4);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC5(Iterables_obj,zip5,return )


Iterables_obj::Iterables_obj()
{
}

bool Iterables_obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 3:
		if (HX_FIELD_EQ(inName,"all") ) { outValue = all_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"any") ) { outValue = any_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"get") ) { outValue = get_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"map") ) { outValue = map_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"min") ) { outValue = min_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"max") ) { outValue = max_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"zip") ) { outValue = zip_dyn(); return true; }
		break;
	case 4:
		if (HX_FIELD_EQ(inName,"find") ) { outValue = find_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"last") ) { outValue = last_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"fmap") ) { outValue = fmap_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"mapi") ) { outValue = mapi_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"zip3") ) { outValue = zip3_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"zip4") ) { outValue = zip4_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"zip5") ) { outValue = zip5_dyn(); return true; }
		break;
	case 5:
		if (HX_FIELD_EQ(inName,"first") ) { outValue = first_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"fmapi") ) { outValue = fmapi_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"order") ) { outValue = order_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"minBy") ) { outValue = minBy_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"maxBy") ) { outValue = maxBy_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"unzip") ) { outValue = unzip_dyn(); return true; }
		break;
	case 6:
		if (HX_FIELD_EQ(inName,"equals") ) { outValue = equals_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"filter") ) { outValue = filter_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"reduce") ) { outValue = reduce_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"unzip3") ) { outValue = unzip3_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"unzip4") ) { outValue = unzip4_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"unzip5") ) { outValue = unzip5_dyn(); return true; }
		break;
	case 7:
		if (HX_FIELD_EQ(inName,"indexOf") ) { outValue = indexOf_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"isEmpty") ) { outValue = isEmpty_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"reducei") ) { outValue = reducei_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"toArray") ) { outValue = toArray_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"extrema") ) { outValue = extrema_dyn(); return true; }
		break;
	case 8:
		if (HX_FIELD_EQ(inName,"eachPair") ) { outValue = eachPair_dyn(); return true; }
		break;
	case 9:
		if (HX_FIELD_EQ(inName,"getOption") ) { outValue = getOption_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"extremaBy") ) { outValue = extremaBy_dyn(); return true; }
		break;
	case 10:
		if (HX_FIELD_EQ(inName,"findOption") ) { outValue = findOption_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"isIterable") ) { outValue = isIterable_dyn(); return true; }
		break;
	case 11:
		if (HX_FIELD_EQ(inName,"hasElements") ) { outValue = hasElements_dyn(); return true; }
	}
	return false;
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *Iterables_obj_sMemberStorageInfo = 0;
static hx::StaticInfo *Iterables_obj_sStaticStorageInfo = 0;
#endif

static void Iterables_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(Iterables_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void Iterables_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(Iterables_obj::__mClass,"__mClass");
};

#endif

hx::Class Iterables_obj::__mClass;

static ::String Iterables_obj_sStaticFields[] = {
	HX_HCSTRING("all","\x21","\xf9","\x49","\x00"),
	HX_HCSTRING("any","\xec","\xfa","\x49","\x00"),
	HX_HCSTRING("eachPair","\xbb","\x1a","\xb5","\xfe"),
	HX_HCSTRING("equals","\x3f","\xee","\xf2","\xbf"),
	HX_HCSTRING("filter","\xb8","\x1f","\x35","\x85"),
	HX_HCSTRING("find","\x39","\xd0","\xbb","\x43"),
	HX_HCSTRING("findOption","\x8e","\x88","\xce","\x54"),
	HX_HCSTRING("first","\x30","\x78","\x9d","\x00"),
	HX_HCSTRING("get","\x96","\x80","\x4e","\x00"),
	HX_HCSTRING("getOption","\xab","\x5c","\xd1","\xa7"),
	HX_HCSTRING("last","\x56","\x0a","\xad","\x47"),
	HX_HCSTRING("hasElements","\xb1","\x1b","\x7b","\x56"),
	HX_HCSTRING("indexOf","\xc9","\x48","\xbf","\xe0"),
	HX_HCSTRING("isEmpty","\x43","\xde","\x5f","\x0c"),
	HX_HCSTRING("isIterable","\xbc","\xb0","\x3b","\x0e"),
	HX_HCSTRING("map","\x9c","\x0a","\x53","\x00"),
	HX_HCSTRING("fmap","\xf6","\xcd","\xbe","\x43"),
	HX_HCSTRING("mapi","\x4d","\x3e","\x56","\x48"),
	HX_HCSTRING("fmapi","\xb3","\x69","\x35","\x03"),
	HX_HCSTRING("order","\x8e","\xf0","\x20","\x35"),
	HX_HCSTRING("reduce","\xa6","\x2d","\x9a","\xfe"),
	HX_HCSTRING("reducei","\x03","\xc4","\x4d","\xc8"),
	HX_HCSTRING("toArray","\x1e","\xba","\x13","\xf2"),
	HX_HCSTRING("minBy","\x09","\x54","\x68","\x08"),
	HX_HCSTRING("maxBy","\x9b","\x35","\x26","\x03"),
	HX_HCSTRING("min","\x92","\x11","\x53","\x00"),
	HX_HCSTRING("max","\xa4","\x0a","\x53","\x00"),
	HX_HCSTRING("extremaBy","\xdf","\x8a","\x1b","\xe5"),
	HX_HCSTRING("extrema","\xe8","\xc6","\xed","\x78"),
	HX_HCSTRING("unzip","\x28","\x46","\xf4","\xa6"),
	HX_HCSTRING("unzip3","\x0b","\x1d","\xc9","\x6e"),
	HX_HCSTRING("unzip4","\x0c","\x1d","\xc9","\x6e"),
	HX_HCSTRING("unzip5","\x0d","\x1d","\xc9","\x6e"),
	HX_HCSTRING("zip","\xe1","\xee","\x5c","\x00"),
	HX_HCSTRING("zip3","\x32","\x16","\xf4","\x50"),
	HX_HCSTRING("zip4","\x33","\x16","\xf4","\x50"),
	HX_HCSTRING("zip5","\x34","\x16","\xf4","\x50"),
	::String(null())
};

void Iterables_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.Iterables","\xf7","\x54","\xf2","\x6f");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &Iterables_obj::__GetStatic;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = Iterables_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(Iterables_obj_sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< Iterables_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = Iterables_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = Iterables_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = Iterables_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx
