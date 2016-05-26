// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_EReg
#include <EReg.h>
#endif
#ifndef INCLUDED_Std
#include <Std.h>
#endif
#ifndef INCLUDED_StringBuf
#include <StringBuf.h>
#endif


void EReg_obj::__construct(::String r,::String opt){
            	HX_STACK_FRAME("EReg","new",0x8b859e81,"EReg.new","/usr/lib/haxe/std/cpp/_std/EReg.hx",30,0x16cad931)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(r,"r")
            	HX_STACK_ARG(opt,"opt")
HXLINE(  31)		HX_VARI( ::Array< ::String >,a) = opt.split(HX_("g",67,00,00,00));
HXLINE(  32)		this->global = (a->length > (int)1);
HXLINE(  33)		Bool _hx_tmp = this->global;
HXDLIN(  33)		if (_hx_tmp) {
HXLINE(  34)			opt = a->join(HX_("",00,00,00,00));
            		}
HXLINE(  35)		this->r = _hx_regexp_new_options(r,opt);
            	}

Dynamic EReg_obj::__CreateEmpty() { return new EReg_obj; }

hx::ObjectPtr< EReg_obj > EReg_obj::__new(::String r,::String opt)
{
	hx::ObjectPtr< EReg_obj > _hx_result = new EReg_obj();
	_hx_result->__construct(r,opt);
	return _hx_result;
}

Dynamic EReg_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< EReg_obj > _hx_result = new EReg_obj();
	_hx_result->__construct(inArgs[0],inArgs[1]);
	return _hx_result;
}

Bool EReg_obj::match(::String s){
            	HX_STACK_FRAME("EReg","match",0x18fda1a6,"EReg.match","/usr/lib/haxe/std/cpp/_std/EReg.hx",38,0x16cad931)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(s,"s")
HXLINE(  39)		HX_VARI( Bool,p) = _hx_regexp_match(this->r,s,(int)0,s.length);
HXLINE(  40)		if (p) {
HXLINE(  41)			this->last = s;
            		}
            		else {
HXLINE(  43)			this->last = null();
            		}
HXLINE(  44)		return p;
            	}


HX_DEFINE_DYNAMIC_FUNC1(EReg_obj,match,return )

::String EReg_obj::matched(Int n){
            	HX_STACK_FRAME("EReg","matched",0x8ce62f85,"EReg.matched","/usr/lib/haxe/std/cpp/_std/EReg.hx",49,0x16cad931)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(n,"n")
HXLINE(  49)		return _hx_regexp_matched(this->r,n);
            	}


HX_DEFINE_DYNAMIC_FUNC1(EReg_obj,matched,return )

::String EReg_obj::matchedLeft(){
            	HX_STACK_FRAME("EReg","matchedLeft",0x93fe0a2c,"EReg.matchedLeft","/usr/lib/haxe/std/cpp/_std/EReg.hx",52,0x16cad931)
            	HX_STACK_THIS(this)
HXLINE(  53)		HX_VARI(  ::Dynamic,p) = _hx_regexp_matched_pos(this->r,(int)0);
HXLINE(  54)		return this->last.substr((int)0, ::Dynamic(p->__Field(HX_("pos",94,5d,55,00),hx::paccDynamic)));
            	}


HX_DEFINE_DYNAMIC_FUNC0(EReg_obj,matchedLeft,return )

::String EReg_obj::matchedRight(){
            	HX_STACK_FRAME("EReg","matchedRight",0x6157ea17,"EReg.matchedRight","/usr/lib/haxe/std/cpp/_std/EReg.hx",57,0x16cad931)
            	HX_STACK_THIS(this)
HXLINE(  58)		HX_VARI(  ::Dynamic,p) = _hx_regexp_matched_pos(this->r,(int)0);
HXLINE(  59)		HX_VARI( Int,sz) = (( (Int)(p->__Field(HX_("pos",94,5d,55,00),hx::paccDynamic)) ) + ( (Int)(p->__Field(HX_("len",d5,4b,52,00),hx::paccDynamic)) ));
HXLINE(  60)		Int _hx_tmp = (this->last.length - sz);
HXDLIN(  60)		return this->last.substr(sz,_hx_tmp);
            	}


HX_DEFINE_DYNAMIC_FUNC0(EReg_obj,matchedRight,return )

Bool EReg_obj::matchSub(::String s,Int pos,hx::Null< Int >  __o_len){
Int len = __o_len.Default(-1);
            	HX_STACK_FRAME("EReg","matchSub",0xbc75cb7a,"EReg.matchSub","/usr/lib/haxe/std/cpp/_std/EReg.hx",67,0x16cad931)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(s,"s")
            	HX_STACK_ARG(pos,"pos")
            	HX_STACK_ARG(len,"len")
HXLINE(  68)		Int _hx_tmp;
HXDLIN(  68)		if ((len < (int)0)) {
HXLINE(  68)			_hx_tmp = (s.length - pos);
            		}
            		else {
HXLINE(  68)			_hx_tmp = len;
            		}
HXDLIN(  68)		HX_VARI( Bool,p) = _hx_regexp_match(this->r,s,pos,_hx_tmp);
HXLINE(  69)		if (p) {
HXLINE(  70)			this->last = s;
            		}
            		else {
HXLINE(  72)			this->last = null();
            		}
HXLINE(  73)		return p;
            	}


HX_DEFINE_DYNAMIC_FUNC3(EReg_obj,matchSub,return )

::Array< ::String > EReg_obj::split(::String s){
            	HX_STACK_FRAME("EReg","split",0x9749433b,"EReg.split","/usr/lib/haxe/std/cpp/_std/EReg.hx",76,0x16cad931)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(s,"s")
HXLINE(  77)		HX_VARI( Int,pos) = (int)0;
HXLINE(  78)		HX_VARI( Int,len) = s.length;
HXLINE(  79)		HX_VARI( ::Array< ::String >,a) = ::Array_obj< ::String >::__new();
HXLINE(  80)		HX_VARI( Bool,first) = true;
HXLINE(  81)		while(_hx_regexp_match(this->r,s,pos,len)){
HXLINE(  84)			HX_VARI(  ::Dynamic,p) = _hx_regexp_matched_pos(this->r,(int)0);
HXLINE(  85)			Bool _hx_tmp;
HXDLIN(  85)			if ((( (Int)(p->__Field(HX_("len",d5,4b,52,00),hx::paccDynamic)) ) == (int)0)) {
HXLINE(  85)				_hx_tmp = !(first);
            			}
            			else {
HXLINE(  85)				_hx_tmp = false;
            			}
HXDLIN(  85)			if (_hx_tmp) {
HXLINE(  86)				if ((( (Int)(p->__Field(HX_("pos",94,5d,55,00),hx::paccDynamic)) ) == s.length)) {
HXLINE(  87)					goto _hx_goto_0;
            				}
HXLINE(  88)				hx::AddEq(hx::FieldRef((p).mPtr,HX_("pos",94,5d,55,00)),(int)1);
            			}
HXLINE(  90)			Int _hx_tmp1 = (( (Int)(p->__Field(HX_("pos",94,5d,55,00),hx::paccDynamic)) ) - pos);
HXDLIN(  90)			::String _hx_tmp2 = s.substr(pos,_hx_tmp1);
HXDLIN(  90)			a->push(_hx_tmp2);
HXLINE(  91)			HX_VARI( Int,tot) = ((( (Int)(p->__Field(HX_("pos",94,5d,55,00),hx::paccDynamic)) ) + ( (Int)(p->__Field(HX_("len",d5,4b,52,00),hx::paccDynamic)) )) - pos);
HXLINE(  92)			hx::AddEq(pos,tot);
HXLINE(  93)			hx::SubEq(len,tot);
HXLINE(  94)			first = false;
HXLINE(  81)			if (!(this->global)) {
HXLINE(  81)				goto _hx_goto_0;
            			}
            		}
            		_hx_goto_0:;
HXLINE(  96)		::String _hx_tmp3 = s.substr(pos,len);
HXDLIN(  96)		a->push(_hx_tmp3);
HXLINE(  97)		return a;
            	}


HX_DEFINE_DYNAMIC_FUNC1(EReg_obj,split,return )

::String EReg_obj::replace(::String s,::String by){
            	HX_STACK_FRAME("EReg","replace",0xae923ad5,"EReg.replace","/usr/lib/haxe/std/cpp/_std/EReg.hx",100,0x16cad931)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(s,"s")
            	HX_STACK_ARG(by,"by")
HXLINE( 101)		HX_VARI(  ::StringBuf,b) =  ::StringBuf_obj::__new();
HXLINE( 102)		HX_VARI( Int,pos) = (int)0;
HXLINE( 103)		HX_VARI( Int,len) = s.length;
HXLINE( 104)		HX_VARI( ::Array< ::String >,a) = by.split(HX_("$",24,00,00,00));
HXLINE( 105)		HX_VARI( Bool,first) = true;
HXLINE( 106)		while(_hx_regexp_match(this->r,s,pos,len)){
HXLINE( 109)			HX_VARI(  ::Dynamic,p) = _hx_regexp_matched_pos(this->r,(int)0);
HXLINE( 110)			Bool _hx_tmp;
HXDLIN( 110)			if ((( (Int)(p->__Field(HX_("len",d5,4b,52,00),hx::paccDynamic)) ) == (int)0)) {
HXLINE( 110)				_hx_tmp = !(first);
            			}
            			else {
HXLINE( 110)				_hx_tmp = false;
            			}
HXDLIN( 110)			if (_hx_tmp) {
HXLINE( 111)				if ((( (Int)(p->__Field(HX_("pos",94,5d,55,00),hx::paccDynamic)) ) == s.length)) {
HXLINE( 112)					goto _hx_goto_1;
            				}
HXLINE( 113)				hx::AddEq(hx::FieldRef((p).mPtr,HX_("pos",94,5d,55,00)),(int)1);
            			}
HXLINE( 115)			{
HXLINE( 115)				HX_VARI_NAME(  ::Dynamic,len1,"len") = (( (Int)(p->__Field(HX_("pos",94,5d,55,00),hx::paccDynamic)) ) - pos);
HXDLIN( 115)				::String _hx_tmp1 = s.substr(pos,len1);
HXDLIN( 115)				b->b->push(_hx_tmp1);
            			}
HXLINE( 116)			Bool _hx_tmp2 = (a->length > (int)0);
HXDLIN( 116)			if (_hx_tmp2) {
HXLINE( 117)				b->add(a->__get((int)0));
            			}
HXLINE( 118)			HX_VARI( Int,i) = (int)1;
HXLINE( 119)			while((i < a->length)){
HXLINE( 120)				HX_VARI( ::String,k) = a->__get(i);
HXLINE( 121)				HX_VARI(  ::Dynamic,c) = k.charCodeAt((int)0);
HXLINE( 123)				Bool _hx_tmp3;
HXDLIN( 123)				if (hx::IsGreaterEq( c,(int)49 )) {
HXLINE( 123)					_hx_tmp3 = hx::IsLessEq( c,(int)57 );
            				}
            				else {
HXLINE( 123)					_hx_tmp3 = false;
            				}
HXDLIN( 123)				if (_hx_tmp3) {
HXLINE( 124)					HX_VAR_NAME(  ::Dynamic,p1,"p");
HXDLIN( 124)					try {
            						HX_STACK_CATCHABLE(::String, 0);
HXLINE( 124)						 ::Dynamic _hx_tmp4 = this->r;
HXDLIN( 124)						Int _hx_tmp5 = ::Std_obj::_hx_int(c);
HXDLIN( 124)						p1 = _hx_regexp_matched_pos(_hx_tmp4,(_hx_tmp5 - (int)48));
            					}
            					catch( ::Dynamic _hx_e){
            						if (_hx_e.IsClass< ::String >() ){
            							HX_STACK_BEGIN_CATCH
            							::String e = _hx_e;
HXLINE( 124)							p1 = null();
            						}
            						else {
            							HX_STACK_DO_THROW(_hx_e);
            						}
            					}
HXLINE( 125)					if (hx::IsNull( p1 )) {
HXLINE( 126)						b->add(HX_("$",24,00,00,00));
HXLINE( 127)						b->add(k);
            					}
            					else {
HXLINE( 129)						{
HXLINE( 129)							HX_VARI_NAME( Int,pos1,"pos") = ( (Int)(p1->__Field(HX_("pos",94,5d,55,00),hx::paccDynamic)) );
HXDLIN( 129)							HX_VARI_NAME(  ::Dynamic,len2,"len") = p1->__Field(HX_("len",d5,4b,52,00),hx::paccDynamic);
HXDLIN( 129)							::String _hx_tmp6 = s.substr(pos1,len2);
HXDLIN( 129)							b->b->push(_hx_tmp6);
            						}
HXLINE( 130)						{
HXLINE( 130)							HX_VARI_NAME(  ::Dynamic,len3,"len") = (k.length - (int)1);
HXDLIN( 130)							::String _hx_tmp7 = k.substr((int)1,len3);
HXDLIN( 130)							b->b->push(_hx_tmp7);
            						}
            					}
            				}
            				else {
HXLINE( 132)					if (hx::IsNull( c )) {
HXLINE( 133)						b->add(HX_("$",24,00,00,00));
HXLINE( 134)						++i;
HXLINE( 135)						HX_VARI( ::String,k2) = a->__get(i);
HXLINE( 136)						Bool _hx_tmp8;
HXDLIN( 136)						if (hx::IsNotNull( k2 )) {
HXLINE( 136)							_hx_tmp8 = (k2.length > (int)0);
            						}
            						else {
HXLINE( 136)							_hx_tmp8 = false;
            						}
HXDLIN( 136)						if (_hx_tmp8) {
HXLINE( 137)							b->add(k2);
            						}
            					}
            					else {
HXLINE( 139)						b->add((HX_("$",24,00,00,00) + k));
            					}
            				}
HXLINE( 140)				++i;
            			}
HXLINE( 142)			HX_VARI( Int,tot) = ((( (Int)(p->__Field(HX_("pos",94,5d,55,00),hx::paccDynamic)) ) + ( (Int)(p->__Field(HX_("len",d5,4b,52,00),hx::paccDynamic)) )) - pos);
HXLINE( 143)			hx::AddEq(pos,tot);
HXLINE( 144)			hx::SubEq(len,tot);
HXLINE( 145)			first = false;
HXLINE( 106)			if (!(this->global)) {
HXLINE( 106)				goto _hx_goto_1;
            			}
            		}
            		_hx_goto_1:;
HXLINE( 147)		::String _hx_tmp9 = s.substr(pos,len);
HXDLIN( 147)		b->b->push(_hx_tmp9);
HXLINE( 148)		return b->b->join(HX_("",00,00,00,00));
            	}


HX_DEFINE_DYNAMIC_FUNC2(EReg_obj,replace,return )

::String EReg_obj::map(::String s, ::Dynamic f){
            	HX_STACK_FRAME("EReg","map",0x8b84d8bd,"EReg.map","/usr/lib/haxe/std/cpp/_std/EReg.hx",151,0x16cad931)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(s,"s")
            	HX_STACK_ARG(f,"f")
HXLINE( 152)		HX_VARI( Int,offset) = (int)0;
HXLINE( 153)		HX_VARI(  ::StringBuf,buf) =  ::StringBuf_obj::__new();
HXLINE( 154)		while(true){
HXLINE( 155)			Bool _hx_tmp = (offset >= s.length);
HXDLIN( 155)			if (_hx_tmp) {
HXLINE( 156)				goto _hx_goto_3;
            			}
            			else {
HXLINE( 157)				Bool _hx_tmp1 = !(this->matchSub(s,offset,null()));
HXDLIN( 157)				if (_hx_tmp1) {
HXLINE( 158)					::String _hx_tmp2 = s.substr(offset,null());
HXDLIN( 158)					buf->add(_hx_tmp2);
HXLINE( 159)					goto _hx_goto_3;
            				}
            			}
HXLINE( 161)			HX_VARI(  ::Dynamic,p) = _hx_regexp_matched_pos(this->r,(int)0);
HXLINE( 162)			Int _hx_tmp3 = (( (Int)(p->__Field(HX_("pos",94,5d,55,00),hx::paccDynamic)) ) - offset);
HXDLIN( 162)			::String _hx_tmp4 = s.substr(offset,_hx_tmp3);
HXDLIN( 162)			buf->add(_hx_tmp4);
HXLINE( 163)			::String _hx_tmp5 = ( (::String)(f(hx::ObjectPtr<OBJ_>(this))) );
HXDLIN( 163)			buf->add(_hx_tmp5);
HXLINE( 164)			Bool _hx_tmp6 = (( (Int)(p->__Field(HX_("len",d5,4b,52,00),hx::paccDynamic)) ) == (int)0);
HXDLIN( 164)			if (_hx_tmp6) {
HXLINE( 165)				::String _hx_tmp7 = s.substr( ::Dynamic(p->__Field(HX_("pos",94,5d,55,00),hx::paccDynamic)),(int)1);
HXDLIN( 165)				buf->add(_hx_tmp7);
HXLINE( 166)				offset = (( (Int)(p->__Field(HX_("pos",94,5d,55,00),hx::paccDynamic)) ) + (int)1);
            			}
            			else {
HXLINE( 169)				offset = (( (Int)(p->__Field(HX_("pos",94,5d,55,00),hx::paccDynamic)) ) + ( (Int)(p->__Field(HX_("len",d5,4b,52,00),hx::paccDynamic)) ));
            			}
HXLINE( 154)			if (!(this->global)) {
HXLINE( 154)				goto _hx_goto_3;
            			}
            		}
            		_hx_goto_3:;
HXLINE( 171)		Bool _hx_tmp8;
HXDLIN( 171)		Bool _hx_tmp9;
HXDLIN( 171)		if (!(this->global)) {
HXLINE( 171)			_hx_tmp9 = (offset > (int)0);
            		}
            		else {
HXLINE( 171)			_hx_tmp9 = false;
            		}
HXDLIN( 171)		if (_hx_tmp9) {
HXLINE( 171)			_hx_tmp8 = (offset < s.length);
            		}
            		else {
HXLINE( 171)			_hx_tmp8 = false;
            		}
HXDLIN( 171)		if (_hx_tmp8) {
HXLINE( 172)			::String _hx_tmp10 = s.substr(offset,null());
HXDLIN( 172)			buf->add(_hx_tmp10);
            		}
HXLINE( 173)		return buf->b->join(HX_("",00,00,00,00));
            	}


HX_DEFINE_DYNAMIC_FUNC2(EReg_obj,map,return )


EReg_obj::EReg_obj()
{
}

void EReg_obj::__Mark(HX_MARK_PARAMS)
{
	HX_MARK_BEGIN_CLASS(EReg);
	HX_MARK_MEMBER_NAME(r,"r");
	HX_MARK_MEMBER_NAME(last,"last");
	HX_MARK_MEMBER_NAME(global,"global");
	HX_MARK_END_CLASS();
}

void EReg_obj::__Visit(HX_VISIT_PARAMS)
{
	HX_VISIT_MEMBER_NAME(r,"r");
	HX_VISIT_MEMBER_NAME(last,"last");
	HX_VISIT_MEMBER_NAME(global,"global");
}

hx::Val EReg_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 1:
		if (HX_FIELD_EQ(inName,"r") ) { return hx::Val( r); }
		break;
	case 3:
		if (HX_FIELD_EQ(inName,"map") ) { return hx::Val( map_dyn()); }
		break;
	case 4:
		if (HX_FIELD_EQ(inName,"last") ) { return hx::Val( last); }
		break;
	case 5:
		if (HX_FIELD_EQ(inName,"match") ) { return hx::Val( match_dyn()); }
		if (HX_FIELD_EQ(inName,"split") ) { return hx::Val( split_dyn()); }
		break;
	case 6:
		if (HX_FIELD_EQ(inName,"global") ) { return hx::Val( global); }
		break;
	case 7:
		if (HX_FIELD_EQ(inName,"matched") ) { return hx::Val( matched_dyn()); }
		if (HX_FIELD_EQ(inName,"replace") ) { return hx::Val( replace_dyn()); }
		break;
	case 8:
		if (HX_FIELD_EQ(inName,"matchSub") ) { return hx::Val( matchSub_dyn()); }
		break;
	case 11:
		if (HX_FIELD_EQ(inName,"matchedLeft") ) { return hx::Val( matchedLeft_dyn()); }
		break;
	case 12:
		if (HX_FIELD_EQ(inName,"matchedRight") ) { return hx::Val( matchedRight_dyn()); }
	}
	return super::__Field(inName,inCallProp);
}

hx::Val EReg_obj::__SetField(const ::String &inName,const hx::Val &inValue,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 1:
		if (HX_FIELD_EQ(inName,"r") ) { r=inValue.Cast<  ::Dynamic >(); return inValue; }
		break;
	case 4:
		if (HX_FIELD_EQ(inName,"last") ) { last=inValue.Cast< ::String >(); return inValue; }
		break;
	case 6:
		if (HX_FIELD_EQ(inName,"global") ) { global=inValue.Cast< Bool >(); return inValue; }
	}
	return super::__SetField(inName,inValue,inCallProp);
}

void EReg_obj::__GetFields(Array< ::String> &outFields)
{
	outFields->push(HX_HCSTRING("r","\x72","\x00","\x00","\x00"));
	outFields->push(HX_HCSTRING("last","\x56","\x0a","\xad","\x47"));
	outFields->push(HX_HCSTRING("global","\x63","\x31","\xb2","\xa7"));
	super::__GetFields(outFields);
};

#if HXCPP_SCRIPTABLE
static hx::StorageInfo EReg_obj_sMemberStorageInfo[] = {
	{hx::fsObject /*Dynamic*/ ,(int)offsetof(EReg_obj,r),HX_HCSTRING("r","\x72","\x00","\x00","\x00")},
	{hx::fsString,(int)offsetof(EReg_obj,last),HX_HCSTRING("last","\x56","\x0a","\xad","\x47")},
	{hx::fsBool,(int)offsetof(EReg_obj,global),HX_HCSTRING("global","\x63","\x31","\xb2","\xa7")},
	{ hx::fsUnknown, 0, null()}
};
static hx::StaticInfo *EReg_obj_sStaticStorageInfo = 0;
#endif

static ::String EReg_obj_sMemberFields[] = {
	HX_HCSTRING("r","\x72","\x00","\x00","\x00"),
	HX_HCSTRING("last","\x56","\x0a","\xad","\x47"),
	HX_HCSTRING("global","\x63","\x31","\xb2","\xa7"),
	HX_HCSTRING("match","\x45","\x49","\x23","\x03"),
	HX_HCSTRING("matched","\xe4","\x3c","\x7c","\x89"),
	HX_HCSTRING("matchedLeft","\x0b","\xb3","\x2f","\x7c"),
	HX_HCSTRING("matchedRight","\x58","\x04","\x9a","\xa4"),
	HX_HCSTRING("matchSub","\x3b","\x71","\x2b","\xc3"),
	HX_HCSTRING("split","\xda","\xea","\x6e","\x81"),
	HX_HCSTRING("replace","\x34","\x48","\x28","\xab"),
	HX_HCSTRING("map","\x9c","\x0a","\x53","\x00"),
	::String(null()) };

static void EReg_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(EReg_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void EReg_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(EReg_obj::__mClass,"__mClass");
};

#endif

hx::Class EReg_obj::__mClass;

void EReg_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("EReg","\x0f","\x4a","\xda","\x2d");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &hx::Class_obj::GetNoStaticField;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = EReg_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(0 /* sStaticFields */);
	__mClass->mMembers = hx::Class_obj::dupFunctions(EReg_obj_sMemberFields);
	__mClass->mCanCast = hx::TCanCast< EReg_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = EReg_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = EReg_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = EReg_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

