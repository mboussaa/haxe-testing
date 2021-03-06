// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_Date
#include <Date.h>
#endif
#ifndef INCLUDED_Reflect
#include <Reflect.h>
#endif
#ifndef INCLUDED_Std
#include <Std.h>
#endif
#ifndef INCLUDED_Type
#include <Type.h>
#endif
#ifndef INCLUDED_ValueType
#include <ValueType.h>
#endif
#ifndef INCLUDED_haxe_IMap
#include <haxe/IMap.h>
#endif
#ifndef INCLUDED_haxe_Utf8
#include <haxe/Utf8.h>
#endif
#ifndef INCLUDED_thx_Arrays
#include <thx/Arrays.h>
#endif
#ifndef INCLUDED_thx_Bools
#include <thx/Bools.h>
#endif
#ifndef INCLUDED_thx_Dates
#include <thx/Dates.h>
#endif
#ifndef INCLUDED_thx_Dynamics
#include <thx/Dynamics.h>
#endif
#ifndef INCLUDED_thx_Enums
#include <thx/Enums.h>
#endif
#ifndef INCLUDED_thx_Iterables
#include <thx/Iterables.h>
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
#ifndef INCLUDED_thx_Types
#include <thx/Types.h>
#endif

namespace thx{

void Dynamics_obj::__construct() { }

Dynamic Dynamics_obj::__CreateEmpty() { return new Dynamics_obj; }

hx::ObjectPtr< Dynamics_obj > Dynamics_obj::__new()
{
	hx::ObjectPtr< Dynamics_obj > _hx_result = new Dynamics_obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic Dynamics_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< Dynamics_obj > _hx_result = new Dynamics_obj();
	_hx_result->__construct();
	return _hx_result;
}

Bool Dynamics_obj::equals( ::Dynamic a, ::Dynamic b){
            	HX_STACK_FRAME("thx.Dynamics","equals",0xa38b534f,"thx.Dynamics.equals","thx/Dynamics.hx",14,0xc7dc65bf)
            	HX_STACK_ARG(a,"a")
            	HX_STACK_ARG(b,"b")
HXLINE(  16)		Bool _hx_tmp = !(::thx::Types_obj::sameType(a,b));
HXDLIN(  16)		if (_hx_tmp) {
HXLINE(  17)			return false;
            		}
HXLINE(  20)		if (hx::IsEq( a,b )) {
HXLINE(  21)			return true;
            		}
HXLINE(  23)		HX_VARI( ::hx::EnumBase,_g) = ::Type_obj::_hx_typeof(a);
HXDLIN(  23)		HX_VARI(  ::hx::EnumBase,value) = ( ( ::hx::EnumBase)(_g) );
HXDLIN(  23)		Int _hx_tmp1 = value->_hx_getIndex();
HXDLIN(  23)		switch((int)(_hx_tmp1)){
            			case (int)0: case (int)1: case (int)2: case (int)3: {
HXLINE(  25)				return false;
            			}
            			break;
            			case (int)4: {
HXLINE( 115)				HX_VARI( ::Array< ::String >,fa) = ::Reflect_obj::fields(a);
HXDLIN( 115)				HX_VARI( ::Array< ::String >,fb) = ::Reflect_obj::fields(b);
HXLINE( 117)				{
HXLINE( 117)					HX_VARI_NAME( Int,_g1,"_g") = (int)0;
HXDLIN( 117)					while((_g1 < fa->length)){
HXLINE( 117)						HX_VARI( ::String,field) = fa->__get(_g1);
HXDLIN( 117)						++_g1;
HXLINE( 118)						fb->remove(field);
HXLINE( 119)						Bool _hx_tmp2 = !(::Reflect_obj::hasField(b,field));
HXDLIN( 119)						if (_hx_tmp2) {
HXLINE( 120)							return false;
            						}
HXLINE( 121)						HX_VARI(  ::Dynamic,va) = ::Reflect_obj::field(a,field);
HXLINE( 122)						Bool _hx_tmp3 = ::Reflect_obj::isFunction(va);
HXDLIN( 122)						if (_hx_tmp3) {
HXLINE( 123)							continue;
            						}
HXLINE( 124)						HX_VARI(  ::Dynamic,vb) = ::Reflect_obj::field(b,field);
HXLINE( 125)						Bool _hx_tmp4 = !(::thx::Dynamics_obj::equals(va,vb));
HXDLIN( 125)						if (_hx_tmp4) {
HXLINE( 126)							return false;
            						}
            					}
            				}
HXLINE( 128)				if ((fb->length > (int)0)) {
HXLINE( 129)					return false;
            				}
HXLINE( 132)				HX_VARI( Bool,t) = false;
HXLINE( 133)				Bool _hx_tmp5;
HXDLIN( 133)				t = ::thx::Iterators_obj::isIterator(a);
HXDLIN( 133)				if (!(t)) {
HXLINE( 133)					_hx_tmp5 = ::thx::Iterables_obj::isIterable(a);
            				}
            				else {
HXLINE( 133)					_hx_tmp5 = true;
            				}
HXDLIN( 133)				if (_hx_tmp5) {
HXLINE( 134)					Bool _hx_tmp6;
HXDLIN( 134)					if (t) {
HXLINE( 134)						_hx_tmp6 = !(::thx::Iterators_obj::isIterator(b));
            					}
            					else {
HXLINE( 134)						_hx_tmp6 = false;
            					}
HXDLIN( 134)					if (_hx_tmp6) {
HXLINE( 135)						return false;
            					}
HXLINE( 136)					Bool _hx_tmp7;
HXDLIN( 136)					if (!(t)) {
HXLINE( 136)						_hx_tmp7 = !(::thx::Iterables_obj::isIterable(b));
            					}
            					else {
HXLINE( 136)						_hx_tmp7 = false;
            					}
HXDLIN( 136)					if (_hx_tmp7) {
HXLINE( 137)						return false;
            					}
HXLINE( 140)					HX_VAR( ::cpp::VirtualArray,aa);
HXDLIN( 140)					if (t) {
HXLINE( 140)						aa = ::thx::Iterators_obj::toArray(a);
            					}
            					else {
HXLINE( 140)						 ::Dynamic _hx_tmp8 =  ::Dynamic(a->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN( 140)						aa = ::thx::Iterators_obj::toArray(_hx_tmp8);
            					}
HXLINE( 141)					HX_VAR( ::cpp::VirtualArray,ab);
HXDLIN( 141)					if (t) {
HXLINE( 141)						ab = ::thx::Iterators_obj::toArray(b);
            					}
            					else {
HXLINE( 141)						 ::Dynamic _hx_tmp9 =  ::Dynamic(b->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN( 141)						ab = ::thx::Iterators_obj::toArray(_hx_tmp9);
            					}
HXLINE( 142)					if ((aa->get_length() != ab->get_length())) {
HXLINE( 143)						return false;
            					}
HXLINE( 144)					{
HXLINE( 144)						HX_VARI_NAME( Int,_g11,"_g1") = (int)0;
HXDLIN( 144)						HX_VARI_NAME( Int,_g2,"_g") = aa->get_length();
HXDLIN( 144)						while((_g11 < _g2)){
HXLINE( 144)							HX_VARI( Int,i) = _g11++;
HXLINE( 145)							Bool _hx_tmp10 = !(::thx::Dynamics_obj::equals(aa->__get(i),ab->__get(i)));
HXDLIN( 145)							if (_hx_tmp10) {
HXLINE( 146)								return false;
            							}
            						}
            					}
HXLINE( 147)					return true;
            				}
HXLINE( 149)				return true;
            			}
            			break;
            			case (int)5: {
HXLINE(  27)				return ::Reflect_obj::compareMethods(a,b);
            			}
            			break;
            			case (int)6: {
HXLINE(  28)				HX_VARI( hx::Class,c) = _g->_hx_getObject(0).StaticCast< hx::Class >();
HXLINE(  29)				HX_VARI( ::String,ca) = ::Type_obj::getClassName(c);
HXLINE(  30)				hx::Class _hx_tmp11 = ::Type_obj::getClass(b);
HXLINE(  29)				HX_VARI( ::String,cb) = ::Type_obj::getClassName(_hx_tmp11);
HXLINE(  31)				if ((ca != cb)) {
HXLINE(  32)					return false;
            				}
HXLINE(  35)				Bool _hx_tmp12 = ::Std_obj::is(a,hx::ClassOf< ::String >());
HXDLIN(  35)				if (_hx_tmp12) {
HXLINE(  36)					return false;
            				}
HXLINE(  39)				Bool _hx_tmp13 = ::Std_obj::is(a,hx::ArrayBase::__mClass);
HXDLIN(  39)				if (_hx_tmp13) {
HXLINE(  40)					HX_VARI_NAME( ::cpp::VirtualArray,aa1,"aa") = ( (::cpp::VirtualArray)(a) );
HXDLIN(  40)					HX_VARI_NAME( ::cpp::VirtualArray,ab1,"ab") = ( (::cpp::VirtualArray)(b) );
HXLINE(  42)					if ((aa1->get_length() != ab1->get_length())) {
HXLINE(  43)						return false;
            					}
HXLINE(  44)					{
HXLINE(  44)						HX_VARI_NAME( Int,_g12,"_g1") = (int)0;
HXDLIN(  44)						HX_VARI_NAME( Int,_g3,"_g") = aa1->get_length();
HXDLIN(  44)						while((_g12 < _g3)){
HXLINE(  44)							HX_VARI_NAME( Int,i1,"i") = _g12++;
HXLINE(  45)							Bool _hx_tmp14 = !(::thx::Dynamics_obj::equals(aa1->__get(i1),ab1->__get(i1)));
HXDLIN(  45)							if (_hx_tmp14) {
HXLINE(  46)								return false;
            							}
            						}
            					}
HXLINE(  47)					return true;
            				}
HXLINE(  51)				Bool _hx_tmp15 = ::Std_obj::is(a,hx::ClassOf< ::Date >());
HXDLIN(  51)				if (_hx_tmp15) {
HXLINE(  52)					 ::Dynamic _hx_tmp16 =  ::Dynamic(a->__Field(HX_("getTime",c3,7b,7f,1f),hx::paccDynamic))();
HXDLIN(  52)					 ::Dynamic _hx_tmp17 =  ::Dynamic(b->__Field(HX_("getTime",c3,7b,7f,1f),hx::paccDynamic))();
HXDLIN(  52)					return hx::IsEq( _hx_tmp16,_hx_tmp17 );
            				}
HXLINE(  55)				Bool _hx_tmp18 = ::Std_obj::is(a,hx::ClassOf< ::haxe::IMap >());
HXDLIN(  55)				if (_hx_tmp18) {
HXLINE(  56)					HX_VARI( ::Dynamic,ha) = a;
HXDLIN(  56)					HX_VARI( ::Dynamic,hb) = b;
HXLINE(  58)					 ::Dynamic _hx_tmp19 = ::haxe::IMap_obj::keys(ha);
HXDLIN(  58)					HX_VARI( ::cpp::VirtualArray,ka) = ::thx::Iterators_obj::toArray(_hx_tmp19);
HXLINE(  59)					 ::Dynamic _hx_tmp20 = ::haxe::IMap_obj::keys(hb);
HXLINE(  58)					HX_VARI( ::cpp::VirtualArray,kb) = ::thx::Iterators_obj::toArray(_hx_tmp20);
HXLINE(  60)					if ((ka->get_length() != kb->get_length())) {
HXLINE(  61)						return false;
            					}
HXLINE(  62)					{
HXLINE(  62)						HX_VARI_NAME( Int,_g4,"_g") = (int)0;
HXDLIN(  62)						while((_g4 < ka->get_length())){
HXLINE(  62)							HX_VARI(  ::Dynamic,key) = ka->__get(_g4);
HXDLIN(  62)							++_g4;
HXLINE(  63)							Bool _hx_tmp21;
HXDLIN(  63)							Bool _hx_tmp22 = !(!(::haxe::IMap_obj::exists(hb,key)));
HXDLIN(  63)							if (_hx_tmp22) {
HXLINE(  63)								 ::Dynamic _hx_tmp23 = ::haxe::IMap_obj::get(ha,key);
HXDLIN(  63)								_hx_tmp21 = !(::thx::Dynamics_obj::equals(_hx_tmp23,::haxe::IMap_obj::get(hb,key)));
            							}
            							else {
HXLINE(  63)								_hx_tmp21 = true;
            							}
HXDLIN(  63)							if (_hx_tmp21) {
HXLINE(  64)								return false;
            							}
            						}
            					}
HXLINE(  65)					return true;
            				}
HXLINE(  69)				HX_VARI_NAME( Bool,t1,"t") = false;
HXLINE(  70)				Bool _hx_tmp24;
HXDLIN(  70)				t1 = ::thx::Iterators_obj::isIterator(a);
HXDLIN(  70)				if (!(t1)) {
HXLINE(  70)					_hx_tmp24 = ::thx::Iterables_obj::isIterable(a);
            				}
            				else {
HXLINE(  70)					_hx_tmp24 = true;
            				}
HXDLIN(  70)				if (_hx_tmp24) {
HXLINE(  71)					HX_VAR_NAME( ::cpp::VirtualArray,va1,"va");
HXDLIN(  71)					if (t1) {
HXLINE(  71)						va1 = ::thx::Iterators_obj::toArray(a);
            					}
            					else {
HXLINE(  71)						 ::Dynamic _hx_tmp25 =  ::Dynamic(a->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXDLIN(  71)						va1 = ::thx::Iterators_obj::toArray(_hx_tmp25);
            					}
HXDLIN(  71)					HX_VAR_NAME( ::cpp::VirtualArray,vb1,"vb");
HXLINE(  72)					if (t1) {
HXLINE(  71)						vb1 = ::thx::Iterators_obj::toArray(b);
            					}
            					else {
HXLINE(  72)						 ::Dynamic _hx_tmp26 =  ::Dynamic(b->__Field(HX_("iterator",ee,49,9a,93),hx::paccDynamic))();
HXLINE(  71)						vb1 = ::thx::Iterators_obj::toArray(_hx_tmp26);
            					}
HXLINE(  73)					if ((va1->get_length() != vb1->get_length())) {
HXLINE(  74)						return false;
            					}
HXLINE(  76)					{
HXLINE(  76)						HX_VARI_NAME( Int,_g13,"_g1") = (int)0;
HXDLIN(  76)						HX_VARI_NAME( Int,_g5,"_g") = va1->get_length();
HXDLIN(  76)						while((_g13 < _g5)){
HXLINE(  76)							HX_VARI_NAME( Int,i2,"i") = _g13++;
HXLINE(  77)							Bool _hx_tmp27 = !(::thx::Dynamics_obj::equals(va1->__get(i2),vb1->__get(i2)));
HXDLIN(  77)							if (_hx_tmp27) {
HXLINE(  78)								return false;
            							}
            						}
            					}
HXLINE(  79)					return true;
            				}
HXLINE(  83)				HX_VARI(  ::Dynamic,f) = null();
HXLINE(  84)				Bool _hx_tmp28;
HXDLIN(  84)				Bool _hx_tmp29 = ::Reflect_obj::hasField(a,HX_("equals",3f,ee,f2,bf));
HXDLIN(  84)				if (_hx_tmp29) {
HXLINE(  84)					f = ::Reflect_obj::field(a,HX_("equals",3f,ee,f2,bf));
HXDLIN(  84)					_hx_tmp28 = ::Reflect_obj::isFunction(f);
            				}
            				else {
HXLINE(  84)					_hx_tmp28 = false;
            				}
HXDLIN(  84)				if (_hx_tmp28) {
HXLINE(  85)					return ::Reflect_obj::callMethod(a,f,::cpp::VirtualArray_obj::__new(1)->init(0,b));
            				}
HXLINE(  88)				hx::Class _hx_tmp30 = ::Type_obj::getClass(a);
HXDLIN(  88)				HX_VARI( ::Array< ::String >,fields) = ::Type_obj::getInstanceFields(_hx_tmp30);
HXLINE(  89)				{
HXLINE(  89)					HX_VARI_NAME( Int,_g6,"_g") = (int)0;
HXDLIN(  89)					while((_g6 < fields->length)){
HXLINE(  89)						HX_VARI_NAME( ::String,field1,"field") = fields->__get(_g6);
HXDLIN(  89)						++_g6;
HXLINE(  90)						HX_VARI_NAME(  ::Dynamic,va2,"va") = ::Reflect_obj::field(a,field1);
HXLINE(  91)						Bool _hx_tmp31 = ::Reflect_obj::isFunction(va2);
HXDLIN(  91)						if (_hx_tmp31) {
HXLINE(  92)							continue;
            						}
HXLINE(  93)						HX_VARI_NAME(  ::Dynamic,vb2,"vb") = ::Reflect_obj::field(b,field1);
HXLINE(  94)						Bool _hx_tmp32 = !(::thx::Dynamics_obj::equals(va2,vb2));
HXDLIN(  94)						if (_hx_tmp32) {
HXLINE(  95)							return false;
            						}
            					}
            				}
HXLINE(  97)				return true;
            			}
            			break;
            			case (int)7: {
HXLINE(  98)				HX_VARI( hx::Class,e) = _g->_hx_getObject(0).StaticCast< hx::Class >();
HXLINE(  99)				HX_VARI( ::String,ea) = ::Type_obj::getEnumName(e);
HXDLIN(  99)				HX_VARI( hx::Class,teb) = ::Type_obj::getEnum(b);
HXDLIN(  99)				HX_VARI( ::String,eb) = ::Type_obj::getEnumName(teb);
HXLINE( 102)				if ((ea != eb)) {
HXLINE( 103)					return false;
            				}
HXLINE( 105)				HX_VARI_NAME(  ::hx::EnumBase,value1,"value") = ( ( ::hx::EnumBase)(a) );
HXDLIN( 105)				Int _hx_tmp33 = value1->_hx_getIndex();
HXDLIN( 105)				HX_VARI_NAME(  ::hx::EnumBase,value2,"value") = ( ( ::hx::EnumBase)(b) );
HXDLIN( 105)				Int _hx_tmp34 = value2->_hx_getIndex();
HXDLIN( 105)				if ((_hx_tmp33 != _hx_tmp34)) {
HXLINE( 106)					return false;
            				}
HXLINE( 107)				HX_VARI( ::cpp::VirtualArray,pa) = ::Type_obj::enumParameters(a);
HXDLIN( 107)				HX_VARI( ::cpp::VirtualArray,pb) = ::Type_obj::enumParameters(b);
HXLINE( 109)				{
HXLINE( 109)					HX_VARI_NAME( Int,_g14,"_g1") = (int)0;
HXDLIN( 109)					HX_VARI_NAME( Int,_g7,"_g") = pa->get_length();
HXDLIN( 109)					while((_g14 < _g7)){
HXLINE( 109)						HX_VARI_NAME( Int,i3,"i") = _g14++;
HXLINE( 110)						Bool _hx_tmp35 = !(::thx::Dynamics_obj::equals(pa->__get(i3),pb->__get(i3)));
HXDLIN( 110)						if (_hx_tmp35) {
HXLINE( 111)							return false;
            						}
            					}
            				}
HXLINE( 112)				return true;
            			}
            			break;
            			case (int)8: {
HXLINE( 151)				HX_STACK_DO_THROW(HX_("Unable to compare two unknown types",5c,3c,2b,f7));
            			}
            			break;
            		}
HXLINE(  23)		return false;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Dynamics_obj,equals,return )

 ::Dynamic Dynamics_obj::clone( ::Dynamic v, ::Dynamic __o_cloneInstances){
 ::Dynamic cloneInstances = __o_cloneInstances.Default(false);
            	HX_STACK_FRAME("thx.Dynamics","clone",0x4cda004d,"thx.Dynamics.clone","thx/Dynamics.hx",168,0xc7dc65bf)
            	HX_STACK_ARG(v,"v")
            	HX_STACK_ARG(cloneInstances,"cloneInstances")
HXLINE( 168)		HX_VARI( ::hx::EnumBase,_g) = ::Type_obj::_hx_typeof(v);
HXDLIN( 168)		Int _hx_tmp = ( ( ::hx::EnumBase)(_g) )->_hx_getIndex();
HXDLIN( 168)		switch((int)(_hx_tmp)){
            			case (int)0: {
HXLINE( 170)				return null();
            			}
            			break;
            			case (int)4: {
HXLINE( 174)				return ::thx::Objects_obj::copyTo(v, ::Dynamic(hx::Anon_obj::Create(0)),null());
            			}
            			break;
            			case (int)6: {
HXLINE( 175)				HX_VARI( hx::Class,c) = _g->_hx_getObject(0).StaticCast< hx::Class >();
HXLINE( 177)				::String _hx_switch_0 = ::Type_obj::getClassName(c);
            				if (  (_hx_switch_0==HX_("Array",79,dd,bc,b8)) ){
            					HX_BEGIN_LOCAL_FUNC_S1(hx::LocalFunc,_hx_Closure_0, ::Dynamic,cloneInstances) HXARGC(1)
            					 ::Dynamic _hx_run( ::Dynamic v1){
            						HX_STACK_FRAME("thx.Dynamics","clone",0x4cda004d,"thx.Dynamics.clone","thx/Dynamics.hx",180,0xc7dc65bf)
            						HX_STACK_ARG(v1,"v1")
HXLINE( 180)						return ::thx::Dynamics_obj::clone(v1,cloneInstances);
            					}
            					HX_END_LOCAL_FUNC1(return)

HXLINE( 179)					return ( (::cpp::VirtualArray)(v) )->map( ::Dynamic(new _hx_Closure_0(cloneInstances)));
HXDLIN( 179)					goto _hx_goto_8;
            				}
            				if (  (_hx_switch_0==HX_("Date",4e,82,3c,2d)) ||  (_hx_switch_0==HX_("String",f1,9c,c4,45)) ){
HXLINE( 183)					return v;
HXDLIN( 183)					goto _hx_goto_8;
            				}
            				/* default */{
HXLINE( 185)					if (cloneInstances) {
HXLINE( 186)						HX_VARI(  ::Dynamic,o) = ::Type_obj::createEmptyInstance(c);
HXLINE( 187)						{
HXLINE( 187)							HX_VARI_NAME( Int,_g1,"_g") = (int)0;
HXDLIN( 187)							HX_VARI_NAME( ::Array< ::String >,_g11,"_g1") = ::Type_obj::getInstanceFields(c);
HXDLIN( 187)							while((_g1 < _g11->length)){
HXLINE( 187)								HX_VARI( ::String,field) = _g11->__get(_g1);
HXDLIN( 187)								++_g1;
HXLINE( 188)								 ::Dynamic _hx_tmp1 = ::Reflect_obj::field(v,field);
HXDLIN( 188)								 ::Dynamic _hx_tmp2 = ::thx::Dynamics_obj::clone(_hx_tmp1,cloneInstances);
HXDLIN( 188)								::Reflect_obj::setField(o,field,_hx_tmp2);
            							}
            						}
HXLINE( 189)						return o;
            					}
            					else {
HXLINE( 191)						return v;
            					}
            				}
            				_hx_goto_8:;
            			}
            			break;
            			case (int)1: case (int)2: case (int)3: case (int)5: case (int)7: case (int)8: {
HXLINE( 172)				return v;
            			}
            			break;
            		}
HXLINE( 168)		return null();
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Dynamics_obj,clone,return )

Int Dynamics_obj::compare( ::Dynamic a, ::Dynamic b){
            	HX_STACK_FRAME("thx.Dynamics","compare",0xc5292195,"thx.Dynamics.compare","thx/Dynamics.hx",200,0xc7dc65bf)
            	HX_STACK_ARG(a,"a")
            	HX_STACK_ARG(b,"b")
HXLINE( 201)		Bool _hx_tmp;
HXDLIN( 201)		if (hx::IsNull( a )) {
HXLINE( 201)			_hx_tmp = hx::IsNull( b );
            		}
            		else {
HXLINE( 201)			_hx_tmp = false;
            		}
HXDLIN( 201)		if (_hx_tmp) {
HXLINE( 202)			return (int)0;
            		}
HXLINE( 203)		if (hx::IsNull( a )) {
HXLINE( 204)			return (int)-1;
            		}
HXLINE( 205)		if (hx::IsNull( b )) {
HXLINE( 206)			return (int)1;
            		}
HXLINE( 207)		Bool _hx_tmp1 = !(::thx::Types_obj::sameType(a,b));
HXDLIN( 207)		if (_hx_tmp1) {
HXLINE( 208)			::hx::EnumBase _hx_tmp2 = ::Type_obj::_hx_typeof(a);
HXDLIN( 208)			HX_VARI_NAME( ::String,a1,"a") = ::thx::Types_obj::toString(_hx_tmp2);
HXDLIN( 208)			::hx::EnumBase _hx_tmp3 = ::Type_obj::_hx_typeof(b);
HXDLIN( 208)			HX_VARI_NAME( ::String,b1,"b") = ::thx::Types_obj::toString(_hx_tmp3);
HXDLIN( 208)			return ::haxe::Utf8_obj::compare(a1,b1);
            		}
HXLINE( 209)		HX_VARI( ::hx::EnumBase,_g) = ::Type_obj::_hx_typeof(a);
HXDLIN( 209)		Int _hx_tmp4 = ( ( ::hx::EnumBase)(_g) )->_hx_getIndex();
HXDLIN( 209)		switch((int)(_hx_tmp4)){
            			case (int)1: {
HXLINE( 210)				return (( (Int)(a) ) - ( (Int)(b) ));
            			}
            			break;
            			case (int)2: {
HXLINE( 211)				HX_VARI_NAME( Float,a2,"a") = ( (Float)(a) );
HXDLIN( 211)				HX_VARI_NAME( Float,b2,"b") = ( (Float)(b) );
HXDLIN( 211)				if ((a2 < b2)) {
HXLINE( 211)					return (int)-1;
            				}
            				else {
HXLINE( 211)					if ((a2 > b2)) {
HXLINE( 211)						return (int)1;
            					}
            					else {
HXLINE( 211)						return (int)0;
            					}
            				}
            			}
            			break;
            			case (int)3: {
HXLINE( 212)				return ::thx::Bools_obj::compare(a,b);
            			}
            			break;
            			case (int)4: {
HXLINE( 213)				return ::thx::Objects_obj::compare(a,b);
            			}
            			break;
            			case (int)6: {
HXLINE( 216)				::String _hx_switch_0 = ::Type_obj::getClassName(_g->_hx_getObject(0).StaticCast< hx::Class >());
            				if (  (_hx_switch_0==HX_("Array",79,dd,bc,b8)) ){
HXLINE( 218)					return ::thx::Arrays_obj::compare(a,b);
HXDLIN( 218)					goto _hx_goto_9;
            				}
            				if (  (_hx_switch_0==HX_("Date",4e,82,3c,2d)) ){
HXLINE( 222)					return ::thx::Dates_obj::compare(a,b);
HXDLIN( 222)					goto _hx_goto_9;
            				}
            				if (  (_hx_switch_0==HX_("String",f1,9c,c4,45)) ){
HXLINE( 220)					return ::haxe::Utf8_obj::compare(( (::String)(a) ),( (::String)(b) ));
HXDLIN( 220)					goto _hx_goto_9;
            				}
            				/* default */{
HXLINE( 223)					Bool _hx_tmp5 = ::Reflect_obj::hasField(a,HX_("compare",a5,18,69,83));
HXDLIN( 223)					if (_hx_tmp5) {
HXLINE( 224)						 ::Dynamic _hx_tmp6 = ::Reflect_obj::field(a,HX_("compare",a5,18,69,83));
HXDLIN( 224)						return ::Reflect_obj::callMethod(a,_hx_tmp6,::cpp::VirtualArray_obj::__new(1)->init(0,b));
            					}
            					else {
HXLINE( 226)						::String _hx_tmp7 = ::Std_obj::string(a);
HXDLIN( 226)						::String _hx_tmp8 = ::Std_obj::string(b);
HXDLIN( 226)						return ::haxe::Utf8_obj::compare(_hx_tmp7,_hx_tmp8);
            					}
            				}
            				_hx_goto_9:;
            			}
            			break;
            			case (int)7: {
HXLINE( 229)				return ::thx::Enums_obj::compare(a,b);
            			}
            			break;
            			default:{
HXLINE( 231)				return (int)0;
            			}
            		}
HXLINE( 209)		return (int)0;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Dynamics_obj,compare,return )

::String Dynamics_obj::string( ::Dynamic v){
            	HX_STACK_FRAME("thx.Dynamics","string",0xf4c88de1,"thx.Dynamics.string","thx/Dynamics.hx",239,0xc7dc65bf)
            	HX_STACK_ARG(v,"v")
HXLINE( 239)		HX_VARI( ::hx::EnumBase,_g) = ::Type_obj::_hx_typeof(v);
HXDLIN( 239)		Int _hx_tmp = ( ( ::hx::EnumBase)(_g) )->_hx_getIndex();
HXDLIN( 239)		switch((int)(_hx_tmp)){
            			case (int)0: {
HXLINE( 241)				return HX_("null",87,9e,0e,49);
            			}
            			break;
            			case (int)1: case (int)2: case (int)3: {
HXLINE( 243)				::String _hx_tmp1 = ::Std_obj::string(v);
HXDLIN( 243)				return (HX_("",00,00,00,00) + _hx_tmp1);
            			}
            			break;
            			case (int)4: {
HXLINE( 245)				return ::thx::Objects_obj::string(v);
            			}
            			break;
            			case (int)5: {
HXLINE( 265)				return HX_("<function>",6a,22,77,c5);
            			}
            			break;
            			case (int)6: {
HXLINE( 247)				::String _hx_switch_0 = ::Type_obj::getClassName(_g->_hx_getObject(0).StaticCast< hx::Class >());
            				if (  (_hx_switch_0==HX_("Array",79,dd,bc,b8)) ){
HXLINE( 249)					return ::thx::Arrays_obj::string(v);
HXDLIN( 249)					goto _hx_goto_10;
            				}
            				if (  (_hx_switch_0==HX_("Date",4e,82,3c,2d)) ){
HXLINE( 253)					return ( ( ::Date)(v) )->toString();
HXDLIN( 253)					goto _hx_goto_10;
            				}
            				if (  (_hx_switch_0==HX_("String",f1,9c,c4,45)) ){
HXLINE( 251)					return v;
HXDLIN( 251)					goto _hx_goto_10;
            				}
            				/* default */{
HXLINE( 255)					Bool _hx_tmp2 = ::Std_obj::is(v,hx::ClassOf< ::haxe::IMap >());
HXDLIN( 255)					if (_hx_tmp2) {
HXLINE( 256)						return ::thx::Maps_obj::string(v);
            					}
            					else {
HXLINE( 258)						return ::Std_obj::string(v);
            					}
            				}
            				_hx_goto_10:;
            			}
            			break;
            			case (int)7: {
HXLINE( 261)				return ::thx::Enums_obj::string(v);
            			}
            			break;
            			case (int)8: {
HXLINE( 263)				return HX_("<unknown>",b0,91,d8,da);
            			}
            			break;
            		}
HXLINE( 239)		return null();
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Dynamics_obj,string,return )


Dynamics_obj::Dynamics_obj()
{
}

bool Dynamics_obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 5:
		if (HX_FIELD_EQ(inName,"clone") ) { outValue = clone_dyn(); return true; }
		break;
	case 6:
		if (HX_FIELD_EQ(inName,"equals") ) { outValue = equals_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"string") ) { outValue = string_dyn(); return true; }
		break;
	case 7:
		if (HX_FIELD_EQ(inName,"compare") ) { outValue = compare_dyn(); return true; }
	}
	return false;
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *Dynamics_obj_sMemberStorageInfo = 0;
static hx::StaticInfo *Dynamics_obj_sStaticStorageInfo = 0;
#endif

static void Dynamics_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(Dynamics_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void Dynamics_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(Dynamics_obj::__mClass,"__mClass");
};

#endif

hx::Class Dynamics_obj::__mClass;

static ::String Dynamics_obj_sStaticFields[] = {
	HX_HCSTRING("equals","\x3f","\xee","\xf2","\xbf"),
	HX_HCSTRING("clone","\x5d","\x13","\x63","\x48"),
	HX_HCSTRING("compare","\xa5","\x18","\x69","\x83"),
	HX_HCSTRING("string","\xd1","\x28","\x30","\x11"),
	::String(null())
};

void Dynamics_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.Dynamics","\x5e","\xf9","\xe9","\x25");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &Dynamics_obj::__GetStatic;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = Dynamics_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(Dynamics_obj_sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< Dynamics_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = Dynamics_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = Dynamics_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = Dynamics_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx
