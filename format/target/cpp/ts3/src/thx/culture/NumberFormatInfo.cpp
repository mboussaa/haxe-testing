// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_thx_culture_NumberFormatInfo
#include <thx/culture/NumberFormatInfo.h>
#endif

namespace thx{
namespace culture{

void NumberFormatInfo_obj::__construct(Int decimalDigitsCurrency,Int decimalDigitsNumber,Int decimalDigitsPercent,::Array< Int > groupSizesCurrency,::Array< Int > groupSizesNumber,::Array< Int > groupSizesPercent,Int patternNegativeCurrency,Int patternNegativeNumber,Int patternNegativePercent,Int patternPositiveCurrency,Int patternPositivePercent,::String separatorDecimalCurrency,::String separatorDecimalNumber,::String separatorDecimalPercent,::String separatorGroupCurrency,::String separatorGroupNumber,::String separatorGroupPercent,::String signNegative,::String signPositive,::String symbolCurrency,::String symbolNaN,::String symbolNegativeInfinity,::String symbolPercent,::String symbolPermille,::String symbolPositiveInfinity){
            	HX_STACK_FRAME("thx.culture.NumberFormatInfo","new",0xda9c502a,"thx.culture.NumberFormatInfo.new","thx/culture/NumberFormatInfo.hx",58,0x1ffbe2c4)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(decimalDigitsCurrency,"decimalDigitsCurrency")
            	HX_STACK_ARG(decimalDigitsNumber,"decimalDigitsNumber")
            	HX_STACK_ARG(decimalDigitsPercent,"decimalDigitsPercent")
            	HX_STACK_ARG(groupSizesCurrency,"groupSizesCurrency")
            	HX_STACK_ARG(groupSizesNumber,"groupSizesNumber")
            	HX_STACK_ARG(groupSizesPercent,"groupSizesPercent")
            	HX_STACK_ARG(patternNegativeCurrency,"patternNegativeCurrency")
            	HX_STACK_ARG(patternNegativeNumber,"patternNegativeNumber")
            	HX_STACK_ARG(patternNegativePercent,"patternNegativePercent")
            	HX_STACK_ARG(patternPositiveCurrency,"patternPositiveCurrency")
            	HX_STACK_ARG(patternPositivePercent,"patternPositivePercent")
            	HX_STACK_ARG(separatorDecimalCurrency,"separatorDecimalCurrency")
            	HX_STACK_ARG(separatorDecimalNumber,"separatorDecimalNumber")
            	HX_STACK_ARG(separatorDecimalPercent,"separatorDecimalPercent")
            	HX_STACK_ARG(separatorGroupCurrency,"separatorGroupCurrency")
            	HX_STACK_ARG(separatorGroupNumber,"separatorGroupNumber")
            	HX_STACK_ARG(separatorGroupPercent,"separatorGroupPercent")
            	HX_STACK_ARG(signNegative,"signNegative")
            	HX_STACK_ARG(signPositive,"signPositive")
            	HX_STACK_ARG(symbolCurrency,"symbolCurrency")
            	HX_STACK_ARG(symbolNaN,"symbolNaN")
            	HX_STACK_ARG(symbolNegativeInfinity,"symbolNegativeInfinity")
            	HX_STACK_ARG(symbolPercent,"symbolPercent")
            	HX_STACK_ARG(symbolPermille,"symbolPermille")
            	HX_STACK_ARG(symbolPositiveInfinity,"symbolPositiveInfinity")
HXLINE(  59)		this->decimalDigitsCurrency = decimalDigitsCurrency;
HXLINE(  60)		this->decimalDigitsNumber = decimalDigitsNumber;
HXLINE(  61)		this->decimalDigitsPercent = decimalDigitsPercent;
HXLINE(  62)		this->groupSizesCurrency = groupSizesCurrency;
HXLINE(  63)		this->groupSizesNumber = groupSizesNumber;
HXLINE(  64)		this->groupSizesPercent = groupSizesPercent;
HXLINE(  65)		this->patternNegativeCurrency = patternNegativeCurrency;
HXLINE(  66)		this->patternNegativeNumber = patternNegativeNumber;
HXLINE(  67)		this->patternNegativePercent = patternNegativePercent;
HXLINE(  68)		this->patternPositiveCurrency = patternPositiveCurrency;
HXLINE(  69)		this->patternPositivePercent = patternPositivePercent;
HXLINE(  70)		this->separatorDecimalCurrency = separatorDecimalCurrency;
HXLINE(  71)		this->separatorDecimalNumber = separatorDecimalNumber;
HXLINE(  72)		this->separatorDecimalPercent = separatorDecimalPercent;
HXLINE(  73)		this->separatorGroupCurrency = separatorGroupCurrency;
HXLINE(  74)		this->separatorGroupNumber = separatorGroupNumber;
HXLINE(  75)		this->separatorGroupPercent = separatorGroupPercent;
HXLINE(  76)		this->signNegative = signNegative;
HXLINE(  77)		this->signPositive = signPositive;
HXLINE(  78)		this->symbolCurrency = symbolCurrency;
HXLINE(  79)		this->symbolNaN = symbolNaN;
HXLINE(  80)		this->symbolNegativeInfinity = symbolNegativeInfinity;
HXLINE(  81)		this->symbolPercent = symbolPercent;
HXLINE(  82)		this->symbolPermille = symbolPermille;
HXLINE(  83)		this->symbolPositiveInfinity = symbolPositiveInfinity;
            	}

Dynamic NumberFormatInfo_obj::__CreateEmpty() { return new NumberFormatInfo_obj; }

hx::ObjectPtr< NumberFormatInfo_obj > NumberFormatInfo_obj::__new(Int decimalDigitsCurrency,Int decimalDigitsNumber,Int decimalDigitsPercent,::Array< Int > groupSizesCurrency,::Array< Int > groupSizesNumber,::Array< Int > groupSizesPercent,Int patternNegativeCurrency,Int patternNegativeNumber,Int patternNegativePercent,Int patternPositiveCurrency,Int patternPositivePercent,::String separatorDecimalCurrency,::String separatorDecimalNumber,::String separatorDecimalPercent,::String separatorGroupCurrency,::String separatorGroupNumber,::String separatorGroupPercent,::String signNegative,::String signPositive,::String symbolCurrency,::String symbolNaN,::String symbolNegativeInfinity,::String symbolPercent,::String symbolPermille,::String symbolPositiveInfinity)
{
	hx::ObjectPtr< NumberFormatInfo_obj > _hx_result = new NumberFormatInfo_obj();
	_hx_result->__construct(decimalDigitsCurrency,decimalDigitsNumber,decimalDigitsPercent,groupSizesCurrency,groupSizesNumber,groupSizesPercent,patternNegativeCurrency,patternNegativeNumber,patternNegativePercent,patternPositiveCurrency,patternPositivePercent,separatorDecimalCurrency,separatorDecimalNumber,separatorDecimalPercent,separatorGroupCurrency,separatorGroupNumber,separatorGroupPercent,signNegative,signPositive,symbolCurrency,symbolNaN,symbolNegativeInfinity,symbolPercent,symbolPermille,symbolPositiveInfinity);
	return _hx_result;
}

Dynamic NumberFormatInfo_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< NumberFormatInfo_obj > _hx_result = new NumberFormatInfo_obj();
	_hx_result->__construct(inArgs[0],inArgs[1],inArgs[2],inArgs[3],inArgs[4],inArgs[5],inArgs[6],inArgs[7],inArgs[8],inArgs[9],inArgs[10],inArgs[11],inArgs[12],inArgs[13],inArgs[14],inArgs[15],inArgs[16],inArgs[17],inArgs[18],inArgs[19],inArgs[20],inArgs[21],inArgs[22],inArgs[23],inArgs[24]);
	return _hx_result;
}

 ::Dynamic NumberFormatInfo_obj::toObject(){
            	HX_STACK_FRAME("thx.culture.NumberFormatInfo","toObject",0x34202a90,"thx.culture.NumberFormatInfo.toObject","thx/culture/NumberFormatInfo.hx",87,0x1ffbe2c4)
            	HX_STACK_THIS(this)
HXLINE(  87)		return  ::Dynamic(hx::Anon_obj::Create(25)
            			->setFixed(0,HX_("patternNegativeCurrency",56,69,b3,82),this->patternNegativeCurrency)
            			->setFixed(1,HX_("separatorGroupNumber",03,9f,89,8b),this->separatorGroupNumber)
            			->setFixed(2,HX_("signNegative",d2,77,dd,90),this->signNegative)
            			->setFixed(3,HX_("symbolCurrency",c9,8a,97,92),this->symbolCurrency)
            			->setFixed(4,HX_("symbolPercent",4d,3e,49,c2),this->symbolPercent)
            			->setFixed(5,HX_("groupSizesNumber",fc,7b,1c,cd),this->groupSizesNumber)
            			->setFixed(6,HX_("decimalDigitsNumber",c0,3b,b5,d5),this->decimalDigitsNumber)
            			->setFixed(7,HX_("symbolNaN",43,fc,ff,df),this->symbolNaN)
            			->setFixed(8,HX_("patternNegativeNumber",8e,ed,2d,e8),this->patternNegativeNumber)
            			->setFixed(9,HX_("decimalDigitsPercent",ee,4d,fe,f7),this->decimalDigitsPercent)
            			->setFixed(10,HX_("symbolPermille",84,61,72,02),this->symbolPermille)
            			->setFixed(11,HX_("symbolPositiveInfinity",39,16,d7,06),this->symbolPositiveInfinity)
            			->setFixed(12,HX_("signPositive",16,f8,95,0a),this->signPositive)
            			->setFixed(13,HX_("separatorDecimalPercent",79,3d,cc,0c),this->separatorDecimalPercent)
            			->setFixed(14,HX_("patternNegativePercent",60,30,21,0f),this->patternNegativePercent)
            			->setFixed(15,HX_("patternPositivePercent",9c,00,df,26),this->patternPositivePercent)
            			->setFixed(16,HX_("patternPositiveCurrency",9a,cd,0b,31),this->patternPositiveCurrency)
            			->setFixed(17,HX_("symbolNegativeInfinity",f5,b1,7e,58),this->symbolNegativeInfinity)
            			->setFixed(18,HX_("decimalDigitsCurrency",08,28,50,5b),this->decimalDigitsCurrency)
            			->setFixed(19,HX_("separatorGroupPercent",4b,c5,00,5c),this->separatorGroupPercent)
            			->setFixed(20,HX_("separatorDecimalNumber",95,c6,00,63),this->separatorDecimalNumber)
            			->setFixed(21,HX_("groupSizesCurrency",44,ef,34,6b),this->groupSizesCurrency)
            			->setFixed(22,HX_("separatorGroupCurrency",0b,22,76,79),this->separatorGroupCurrency)
            			->setFixed(23,HX_("separatorDecimalCurrency",1d,d2,b3,7a),this->separatorDecimalCurrency)
            			->setFixed(24,HX_("groupSizesPercent",32,42,ef,7a),this->groupSizesPercent));
            	}


HX_DEFINE_DYNAMIC_FUNC0(NumberFormatInfo_obj,toObject,return )

 ::thx::culture::NumberFormatInfo NumberFormatInfo_obj::invariant;

 ::thx::culture::NumberFormatInfo NumberFormatInfo_obj::fromObject( ::Dynamic o){
            	HX_STACK_FRAME("thx.culture.NumberFormatInfo","fromObject",0xffa6f13f,"thx.culture.NumberFormatInfo.fromObject","thx/culture/NumberFormatInfo.hx",116,0x1ffbe2c4)
            	HX_STACK_ARG(o,"o")
HXLINE( 116)		return  ::thx::culture::NumberFormatInfo_obj::__new( ::Dynamic(o->__Field(HX_("decimalDigitsCurrency",08,28,50,5b),hx::paccDynamic)), ::Dynamic(o->__Field(HX_("decimalDigitsNumber",c0,3b,b5,d5),hx::paccDynamic)), ::Dynamic(o->__Field(HX_("decimalDigitsPercent",ee,4d,fe,f7),hx::paccDynamic)), ::Dynamic(o->__Field(HX_("groupSizesCurrency",44,ef,34,6b),hx::paccDynamic)), ::Dynamic(o->__Field(HX_("groupSizesNumber",fc,7b,1c,cd),hx::paccDynamic)), ::Dynamic(o->__Field(HX_("groupSizesPercent",32,42,ef,7a),hx::paccDynamic)), ::Dynamic(o->__Field(HX_("patternNegativeCurrency",56,69,b3,82),hx::paccDynamic)), ::Dynamic(o->__Field(HX_("patternNegativeNumber",8e,ed,2d,e8),hx::paccDynamic)), ::Dynamic(o->__Field(HX_("patternNegativePercent",60,30,21,0f),hx::paccDynamic)), ::Dynamic(o->__Field(HX_("patternPositiveCurrency",9a,cd,0b,31),hx::paccDynamic)), ::Dynamic(o->__Field(HX_("patternPositivePercent",9c,00,df,26),hx::paccDynamic)), ::Dynamic(o->__Field(HX_("separatorDecimalCurrency",1d,d2,b3,7a),hx::paccDynamic)), ::Dynamic(o->__Field(HX_("separatorDecimalNumber",95,c6,00,63),hx::paccDynamic)), ::Dynamic(o->__Field(HX_("separatorDecimalPercent",79,3d,cc,0c),hx::paccDynamic)), ::Dynamic(o->__Field(HX_("separatorGroupCurrency",0b,22,76,79),hx::paccDynamic)), ::Dynamic(o->__Field(HX_("separatorGroupNumber",03,9f,89,8b),hx::paccDynamic)), ::Dynamic(o->__Field(HX_("separatorGroupPercent",4b,c5,00,5c),hx::paccDynamic)), ::Dynamic(o->__Field(HX_("signNegative",d2,77,dd,90),hx::paccDynamic)), ::Dynamic(o->__Field(HX_("signPositive",16,f8,95,0a),hx::paccDynamic)), ::Dynamic(o->__Field(HX_("symbolCurrency",c9,8a,97,92),hx::paccDynamic)), ::Dynamic(o->__Field(HX_("symbolNaN",43,fc,ff,df),hx::paccDynamic)), ::Dynamic(o->__Field(HX_("symbolNegativeInfinity",f5,b1,7e,58),hx::paccDynamic)), ::Dynamic(o->__Field(HX_("symbolPercent",4d,3e,49,c2),hx::paccDynamic)), ::Dynamic(o->__Field(HX_("symbolPermille",84,61,72,02),hx::paccDynamic)), ::Dynamic(o->__Field(HX_("symbolPositiveInfinity",39,16,d7,06),hx::paccDynamic)));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(NumberFormatInfo_obj,fromObject,return )


NumberFormatInfo_obj::NumberFormatInfo_obj()
{
}

void NumberFormatInfo_obj::__Mark(HX_MARK_PARAMS)
{
	HX_MARK_BEGIN_CLASS(NumberFormatInfo);
	HX_MARK_MEMBER_NAME(decimalDigitsCurrency,"decimalDigitsCurrency");
	HX_MARK_MEMBER_NAME(decimalDigitsNumber,"decimalDigitsNumber");
	HX_MARK_MEMBER_NAME(decimalDigitsPercent,"decimalDigitsPercent");
	HX_MARK_MEMBER_NAME(groupSizesCurrency,"groupSizesCurrency");
	HX_MARK_MEMBER_NAME(groupSizesNumber,"groupSizesNumber");
	HX_MARK_MEMBER_NAME(groupSizesPercent,"groupSizesPercent");
	HX_MARK_MEMBER_NAME(patternNegativeCurrency,"patternNegativeCurrency");
	HX_MARK_MEMBER_NAME(patternNegativeNumber,"patternNegativeNumber");
	HX_MARK_MEMBER_NAME(patternNegativePercent,"patternNegativePercent");
	HX_MARK_MEMBER_NAME(patternPositiveCurrency,"patternPositiveCurrency");
	HX_MARK_MEMBER_NAME(patternPositivePercent,"patternPositivePercent");
	HX_MARK_MEMBER_NAME(separatorDecimalCurrency,"separatorDecimalCurrency");
	HX_MARK_MEMBER_NAME(separatorDecimalNumber,"separatorDecimalNumber");
	HX_MARK_MEMBER_NAME(separatorDecimalPercent,"separatorDecimalPercent");
	HX_MARK_MEMBER_NAME(separatorGroupCurrency,"separatorGroupCurrency");
	HX_MARK_MEMBER_NAME(separatorGroupNumber,"separatorGroupNumber");
	HX_MARK_MEMBER_NAME(separatorGroupPercent,"separatorGroupPercent");
	HX_MARK_MEMBER_NAME(signNegative,"signNegative");
	HX_MARK_MEMBER_NAME(signPositive,"signPositive");
	HX_MARK_MEMBER_NAME(symbolCurrency,"symbolCurrency");
	HX_MARK_MEMBER_NAME(symbolNaN,"symbolNaN");
	HX_MARK_MEMBER_NAME(symbolNegativeInfinity,"symbolNegativeInfinity");
	HX_MARK_MEMBER_NAME(symbolPercent,"symbolPercent");
	HX_MARK_MEMBER_NAME(symbolPermille,"symbolPermille");
	HX_MARK_MEMBER_NAME(symbolPositiveInfinity,"symbolPositiveInfinity");
	HX_MARK_END_CLASS();
}

void NumberFormatInfo_obj::__Visit(HX_VISIT_PARAMS)
{
	HX_VISIT_MEMBER_NAME(decimalDigitsCurrency,"decimalDigitsCurrency");
	HX_VISIT_MEMBER_NAME(decimalDigitsNumber,"decimalDigitsNumber");
	HX_VISIT_MEMBER_NAME(decimalDigitsPercent,"decimalDigitsPercent");
	HX_VISIT_MEMBER_NAME(groupSizesCurrency,"groupSizesCurrency");
	HX_VISIT_MEMBER_NAME(groupSizesNumber,"groupSizesNumber");
	HX_VISIT_MEMBER_NAME(groupSizesPercent,"groupSizesPercent");
	HX_VISIT_MEMBER_NAME(patternNegativeCurrency,"patternNegativeCurrency");
	HX_VISIT_MEMBER_NAME(patternNegativeNumber,"patternNegativeNumber");
	HX_VISIT_MEMBER_NAME(patternNegativePercent,"patternNegativePercent");
	HX_VISIT_MEMBER_NAME(patternPositiveCurrency,"patternPositiveCurrency");
	HX_VISIT_MEMBER_NAME(patternPositivePercent,"patternPositivePercent");
	HX_VISIT_MEMBER_NAME(separatorDecimalCurrency,"separatorDecimalCurrency");
	HX_VISIT_MEMBER_NAME(separatorDecimalNumber,"separatorDecimalNumber");
	HX_VISIT_MEMBER_NAME(separatorDecimalPercent,"separatorDecimalPercent");
	HX_VISIT_MEMBER_NAME(separatorGroupCurrency,"separatorGroupCurrency");
	HX_VISIT_MEMBER_NAME(separatorGroupNumber,"separatorGroupNumber");
	HX_VISIT_MEMBER_NAME(separatorGroupPercent,"separatorGroupPercent");
	HX_VISIT_MEMBER_NAME(signNegative,"signNegative");
	HX_VISIT_MEMBER_NAME(signPositive,"signPositive");
	HX_VISIT_MEMBER_NAME(symbolCurrency,"symbolCurrency");
	HX_VISIT_MEMBER_NAME(symbolNaN,"symbolNaN");
	HX_VISIT_MEMBER_NAME(symbolNegativeInfinity,"symbolNegativeInfinity");
	HX_VISIT_MEMBER_NAME(symbolPercent,"symbolPercent");
	HX_VISIT_MEMBER_NAME(symbolPermille,"symbolPermille");
	HX_VISIT_MEMBER_NAME(symbolPositiveInfinity,"symbolPositiveInfinity");
}

hx::Val NumberFormatInfo_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 8:
		if (HX_FIELD_EQ(inName,"toObject") ) { return hx::Val( toObject_dyn()); }
		break;
	case 9:
		if (HX_FIELD_EQ(inName,"symbolNaN") ) { return hx::Val( symbolNaN); }
		break;
	case 12:
		if (HX_FIELD_EQ(inName,"signNegative") ) { return hx::Val( signNegative); }
		if (HX_FIELD_EQ(inName,"signPositive") ) { return hx::Val( signPositive); }
		break;
	case 13:
		if (HX_FIELD_EQ(inName,"symbolPercent") ) { return hx::Val( symbolPercent); }
		break;
	case 14:
		if (HX_FIELD_EQ(inName,"symbolCurrency") ) { return hx::Val( symbolCurrency); }
		if (HX_FIELD_EQ(inName,"symbolPermille") ) { return hx::Val( symbolPermille); }
		break;
	case 16:
		if (HX_FIELD_EQ(inName,"groupSizesNumber") ) { return hx::Val( groupSizesNumber); }
		break;
	case 17:
		if (HX_FIELD_EQ(inName,"groupSizesPercent") ) { return hx::Val( groupSizesPercent); }
		break;
	case 18:
		if (HX_FIELD_EQ(inName,"groupSizesCurrency") ) { return hx::Val( groupSizesCurrency); }
		break;
	case 19:
		if (HX_FIELD_EQ(inName,"decimalDigitsNumber") ) { return hx::Val( decimalDigitsNumber); }
		break;
	case 20:
		if (HX_FIELD_EQ(inName,"decimalDigitsPercent") ) { return hx::Val( decimalDigitsPercent); }
		if (HX_FIELD_EQ(inName,"separatorGroupNumber") ) { return hx::Val( separatorGroupNumber); }
		break;
	case 21:
		if (HX_FIELD_EQ(inName,"decimalDigitsCurrency") ) { return hx::Val( decimalDigitsCurrency); }
		if (HX_FIELD_EQ(inName,"patternNegativeNumber") ) { return hx::Val( patternNegativeNumber); }
		if (HX_FIELD_EQ(inName,"separatorGroupPercent") ) { return hx::Val( separatorGroupPercent); }
		break;
	case 22:
		if (HX_FIELD_EQ(inName,"patternNegativePercent") ) { return hx::Val( patternNegativePercent); }
		if (HX_FIELD_EQ(inName,"patternPositivePercent") ) { return hx::Val( patternPositivePercent); }
		if (HX_FIELD_EQ(inName,"separatorDecimalNumber") ) { return hx::Val( separatorDecimalNumber); }
		if (HX_FIELD_EQ(inName,"separatorGroupCurrency") ) { return hx::Val( separatorGroupCurrency); }
		if (HX_FIELD_EQ(inName,"symbolNegativeInfinity") ) { return hx::Val( symbolNegativeInfinity); }
		if (HX_FIELD_EQ(inName,"symbolPositiveInfinity") ) { return hx::Val( symbolPositiveInfinity); }
		break;
	case 23:
		if (HX_FIELD_EQ(inName,"patternNegativeCurrency") ) { return hx::Val( patternNegativeCurrency); }
		if (HX_FIELD_EQ(inName,"patternPositiveCurrency") ) { return hx::Val( patternPositiveCurrency); }
		if (HX_FIELD_EQ(inName,"separatorDecimalPercent") ) { return hx::Val( separatorDecimalPercent); }
		break;
	case 24:
		if (HX_FIELD_EQ(inName,"separatorDecimalCurrency") ) { return hx::Val( separatorDecimalCurrency); }
	}
	return super::__Field(inName,inCallProp);
}

bool NumberFormatInfo_obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 9:
		if (HX_FIELD_EQ(inName,"invariant") ) { outValue = invariant; return true; }
		break;
	case 10:
		if (HX_FIELD_EQ(inName,"fromObject") ) { outValue = fromObject_dyn(); return true; }
	}
	return false;
}

hx::Val NumberFormatInfo_obj::__SetField(const ::String &inName,const hx::Val &inValue,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 9:
		if (HX_FIELD_EQ(inName,"symbolNaN") ) { symbolNaN=inValue.Cast< ::String >(); return inValue; }
		break;
	case 12:
		if (HX_FIELD_EQ(inName,"signNegative") ) { signNegative=inValue.Cast< ::String >(); return inValue; }
		if (HX_FIELD_EQ(inName,"signPositive") ) { signPositive=inValue.Cast< ::String >(); return inValue; }
		break;
	case 13:
		if (HX_FIELD_EQ(inName,"symbolPercent") ) { symbolPercent=inValue.Cast< ::String >(); return inValue; }
		break;
	case 14:
		if (HX_FIELD_EQ(inName,"symbolCurrency") ) { symbolCurrency=inValue.Cast< ::String >(); return inValue; }
		if (HX_FIELD_EQ(inName,"symbolPermille") ) { symbolPermille=inValue.Cast< ::String >(); return inValue; }
		break;
	case 16:
		if (HX_FIELD_EQ(inName,"groupSizesNumber") ) { groupSizesNumber=inValue.Cast< ::Array< Int > >(); return inValue; }
		break;
	case 17:
		if (HX_FIELD_EQ(inName,"groupSizesPercent") ) { groupSizesPercent=inValue.Cast< ::Array< Int > >(); return inValue; }
		break;
	case 18:
		if (HX_FIELD_EQ(inName,"groupSizesCurrency") ) { groupSizesCurrency=inValue.Cast< ::Array< Int > >(); return inValue; }
		break;
	case 19:
		if (HX_FIELD_EQ(inName,"decimalDigitsNumber") ) { decimalDigitsNumber=inValue.Cast< Int >(); return inValue; }
		break;
	case 20:
		if (HX_FIELD_EQ(inName,"decimalDigitsPercent") ) { decimalDigitsPercent=inValue.Cast< Int >(); return inValue; }
		if (HX_FIELD_EQ(inName,"separatorGroupNumber") ) { separatorGroupNumber=inValue.Cast< ::String >(); return inValue; }
		break;
	case 21:
		if (HX_FIELD_EQ(inName,"decimalDigitsCurrency") ) { decimalDigitsCurrency=inValue.Cast< Int >(); return inValue; }
		if (HX_FIELD_EQ(inName,"patternNegativeNumber") ) { patternNegativeNumber=inValue.Cast< Int >(); return inValue; }
		if (HX_FIELD_EQ(inName,"separatorGroupPercent") ) { separatorGroupPercent=inValue.Cast< ::String >(); return inValue; }
		break;
	case 22:
		if (HX_FIELD_EQ(inName,"patternNegativePercent") ) { patternNegativePercent=inValue.Cast< Int >(); return inValue; }
		if (HX_FIELD_EQ(inName,"patternPositivePercent") ) { patternPositivePercent=inValue.Cast< Int >(); return inValue; }
		if (HX_FIELD_EQ(inName,"separatorDecimalNumber") ) { separatorDecimalNumber=inValue.Cast< ::String >(); return inValue; }
		if (HX_FIELD_EQ(inName,"separatorGroupCurrency") ) { separatorGroupCurrency=inValue.Cast< ::String >(); return inValue; }
		if (HX_FIELD_EQ(inName,"symbolNegativeInfinity") ) { symbolNegativeInfinity=inValue.Cast< ::String >(); return inValue; }
		if (HX_FIELD_EQ(inName,"symbolPositiveInfinity") ) { symbolPositiveInfinity=inValue.Cast< ::String >(); return inValue; }
		break;
	case 23:
		if (HX_FIELD_EQ(inName,"patternNegativeCurrency") ) { patternNegativeCurrency=inValue.Cast< Int >(); return inValue; }
		if (HX_FIELD_EQ(inName,"patternPositiveCurrency") ) { patternPositiveCurrency=inValue.Cast< Int >(); return inValue; }
		if (HX_FIELD_EQ(inName,"separatorDecimalPercent") ) { separatorDecimalPercent=inValue.Cast< ::String >(); return inValue; }
		break;
	case 24:
		if (HX_FIELD_EQ(inName,"separatorDecimalCurrency") ) { separatorDecimalCurrency=inValue.Cast< ::String >(); return inValue; }
	}
	return super::__SetField(inName,inValue,inCallProp);
}

bool NumberFormatInfo_obj::__SetStatic(const ::String &inName,Dynamic &ioValue,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 9:
		if (HX_FIELD_EQ(inName,"invariant") ) { invariant=ioValue.Cast<  ::thx::culture::NumberFormatInfo >(); return true; }
	}
	return false;
}

void NumberFormatInfo_obj::__GetFields(Array< ::String> &outFields)
{
	outFields->push(HX_HCSTRING("decimalDigitsCurrency","\x08","\x28","\x50","\x5b"));
	outFields->push(HX_HCSTRING("decimalDigitsNumber","\xc0","\x3b","\xb5","\xd5"));
	outFields->push(HX_HCSTRING("decimalDigitsPercent","\xee","\x4d","\xfe","\xf7"));
	outFields->push(HX_HCSTRING("groupSizesCurrency","\x44","\xef","\x34","\x6b"));
	outFields->push(HX_HCSTRING("groupSizesNumber","\xfc","\x7b","\x1c","\xcd"));
	outFields->push(HX_HCSTRING("groupSizesPercent","\x32","\x42","\xef","\x7a"));
	outFields->push(HX_HCSTRING("patternNegativeCurrency","\x56","\x69","\xb3","\x82"));
	outFields->push(HX_HCSTRING("patternNegativeNumber","\x8e","\xed","\x2d","\xe8"));
	outFields->push(HX_HCSTRING("patternNegativePercent","\x60","\x30","\x21","\x0f"));
	outFields->push(HX_HCSTRING("patternPositiveCurrency","\x9a","\xcd","\x0b","\x31"));
	outFields->push(HX_HCSTRING("patternPositivePercent","\x9c","\x00","\xdf","\x26"));
	outFields->push(HX_HCSTRING("separatorDecimalCurrency","\x1d","\xd2","\xb3","\x7a"));
	outFields->push(HX_HCSTRING("separatorDecimalNumber","\x95","\xc6","\x00","\x63"));
	outFields->push(HX_HCSTRING("separatorDecimalPercent","\x79","\x3d","\xcc","\x0c"));
	outFields->push(HX_HCSTRING("separatorGroupCurrency","\x0b","\x22","\x76","\x79"));
	outFields->push(HX_HCSTRING("separatorGroupNumber","\x03","\x9f","\x89","\x8b"));
	outFields->push(HX_HCSTRING("separatorGroupPercent","\x4b","\xc5","\x00","\x5c"));
	outFields->push(HX_HCSTRING("signNegative","\xd2","\x77","\xdd","\x90"));
	outFields->push(HX_HCSTRING("signPositive","\x16","\xf8","\x95","\x0a"));
	outFields->push(HX_HCSTRING("symbolCurrency","\xc9","\x8a","\x97","\x92"));
	outFields->push(HX_HCSTRING("symbolNaN","\x43","\xfc","\xff","\xdf"));
	outFields->push(HX_HCSTRING("symbolNegativeInfinity","\xf5","\xb1","\x7e","\x58"));
	outFields->push(HX_HCSTRING("symbolPercent","\x4d","\x3e","\x49","\xc2"));
	outFields->push(HX_HCSTRING("symbolPermille","\x84","\x61","\x72","\x02"));
	outFields->push(HX_HCSTRING("symbolPositiveInfinity","\x39","\x16","\xd7","\x06"));
	super::__GetFields(outFields);
};

#if HXCPP_SCRIPTABLE
static hx::StorageInfo NumberFormatInfo_obj_sMemberStorageInfo[] = {
	{hx::fsInt,(int)offsetof(NumberFormatInfo_obj,decimalDigitsCurrency),HX_HCSTRING("decimalDigitsCurrency","\x08","\x28","\x50","\x5b")},
	{hx::fsInt,(int)offsetof(NumberFormatInfo_obj,decimalDigitsNumber),HX_HCSTRING("decimalDigitsNumber","\xc0","\x3b","\xb5","\xd5")},
	{hx::fsInt,(int)offsetof(NumberFormatInfo_obj,decimalDigitsPercent),HX_HCSTRING("decimalDigitsPercent","\xee","\x4d","\xfe","\xf7")},
	{hx::fsObject /*Array< int >*/ ,(int)offsetof(NumberFormatInfo_obj,groupSizesCurrency),HX_HCSTRING("groupSizesCurrency","\x44","\xef","\x34","\x6b")},
	{hx::fsObject /*Array< int >*/ ,(int)offsetof(NumberFormatInfo_obj,groupSizesNumber),HX_HCSTRING("groupSizesNumber","\xfc","\x7b","\x1c","\xcd")},
	{hx::fsObject /*Array< int >*/ ,(int)offsetof(NumberFormatInfo_obj,groupSizesPercent),HX_HCSTRING("groupSizesPercent","\x32","\x42","\xef","\x7a")},
	{hx::fsInt,(int)offsetof(NumberFormatInfo_obj,patternNegativeCurrency),HX_HCSTRING("patternNegativeCurrency","\x56","\x69","\xb3","\x82")},
	{hx::fsInt,(int)offsetof(NumberFormatInfo_obj,patternNegativeNumber),HX_HCSTRING("patternNegativeNumber","\x8e","\xed","\x2d","\xe8")},
	{hx::fsInt,(int)offsetof(NumberFormatInfo_obj,patternNegativePercent),HX_HCSTRING("patternNegativePercent","\x60","\x30","\x21","\x0f")},
	{hx::fsInt,(int)offsetof(NumberFormatInfo_obj,patternPositiveCurrency),HX_HCSTRING("patternPositiveCurrency","\x9a","\xcd","\x0b","\x31")},
	{hx::fsInt,(int)offsetof(NumberFormatInfo_obj,patternPositivePercent),HX_HCSTRING("patternPositivePercent","\x9c","\x00","\xdf","\x26")},
	{hx::fsString,(int)offsetof(NumberFormatInfo_obj,separatorDecimalCurrency),HX_HCSTRING("separatorDecimalCurrency","\x1d","\xd2","\xb3","\x7a")},
	{hx::fsString,(int)offsetof(NumberFormatInfo_obj,separatorDecimalNumber),HX_HCSTRING("separatorDecimalNumber","\x95","\xc6","\x00","\x63")},
	{hx::fsString,(int)offsetof(NumberFormatInfo_obj,separatorDecimalPercent),HX_HCSTRING("separatorDecimalPercent","\x79","\x3d","\xcc","\x0c")},
	{hx::fsString,(int)offsetof(NumberFormatInfo_obj,separatorGroupCurrency),HX_HCSTRING("separatorGroupCurrency","\x0b","\x22","\x76","\x79")},
	{hx::fsString,(int)offsetof(NumberFormatInfo_obj,separatorGroupNumber),HX_HCSTRING("separatorGroupNumber","\x03","\x9f","\x89","\x8b")},
	{hx::fsString,(int)offsetof(NumberFormatInfo_obj,separatorGroupPercent),HX_HCSTRING("separatorGroupPercent","\x4b","\xc5","\x00","\x5c")},
	{hx::fsString,(int)offsetof(NumberFormatInfo_obj,signNegative),HX_HCSTRING("signNegative","\xd2","\x77","\xdd","\x90")},
	{hx::fsString,(int)offsetof(NumberFormatInfo_obj,signPositive),HX_HCSTRING("signPositive","\x16","\xf8","\x95","\x0a")},
	{hx::fsString,(int)offsetof(NumberFormatInfo_obj,symbolCurrency),HX_HCSTRING("symbolCurrency","\xc9","\x8a","\x97","\x92")},
	{hx::fsString,(int)offsetof(NumberFormatInfo_obj,symbolNaN),HX_HCSTRING("symbolNaN","\x43","\xfc","\xff","\xdf")},
	{hx::fsString,(int)offsetof(NumberFormatInfo_obj,symbolNegativeInfinity),HX_HCSTRING("symbolNegativeInfinity","\xf5","\xb1","\x7e","\x58")},
	{hx::fsString,(int)offsetof(NumberFormatInfo_obj,symbolPercent),HX_HCSTRING("symbolPercent","\x4d","\x3e","\x49","\xc2")},
	{hx::fsString,(int)offsetof(NumberFormatInfo_obj,symbolPermille),HX_HCSTRING("symbolPermille","\x84","\x61","\x72","\x02")},
	{hx::fsString,(int)offsetof(NumberFormatInfo_obj,symbolPositiveInfinity),HX_HCSTRING("symbolPositiveInfinity","\x39","\x16","\xd7","\x06")},
	{ hx::fsUnknown, 0, null()}
};
static hx::StaticInfo NumberFormatInfo_obj_sStaticStorageInfo[] = {
	{hx::fsObject /*::thx::culture::NumberFormatInfo*/ ,(void *) &NumberFormatInfo_obj::invariant,HX_HCSTRING("invariant","\x40","\x5b","\x93","\xf5")},
	{ hx::fsUnknown, 0, null()}
};
#endif

static ::String NumberFormatInfo_obj_sMemberFields[] = {
	HX_HCSTRING("decimalDigitsCurrency","\x08","\x28","\x50","\x5b"),
	HX_HCSTRING("decimalDigitsNumber","\xc0","\x3b","\xb5","\xd5"),
	HX_HCSTRING("decimalDigitsPercent","\xee","\x4d","\xfe","\xf7"),
	HX_HCSTRING("groupSizesCurrency","\x44","\xef","\x34","\x6b"),
	HX_HCSTRING("groupSizesNumber","\xfc","\x7b","\x1c","\xcd"),
	HX_HCSTRING("groupSizesPercent","\x32","\x42","\xef","\x7a"),
	HX_HCSTRING("patternNegativeCurrency","\x56","\x69","\xb3","\x82"),
	HX_HCSTRING("patternNegativeNumber","\x8e","\xed","\x2d","\xe8"),
	HX_HCSTRING("patternNegativePercent","\x60","\x30","\x21","\x0f"),
	HX_HCSTRING("patternPositiveCurrency","\x9a","\xcd","\x0b","\x31"),
	HX_HCSTRING("patternPositivePercent","\x9c","\x00","\xdf","\x26"),
	HX_HCSTRING("separatorDecimalCurrency","\x1d","\xd2","\xb3","\x7a"),
	HX_HCSTRING("separatorDecimalNumber","\x95","\xc6","\x00","\x63"),
	HX_HCSTRING("separatorDecimalPercent","\x79","\x3d","\xcc","\x0c"),
	HX_HCSTRING("separatorGroupCurrency","\x0b","\x22","\x76","\x79"),
	HX_HCSTRING("separatorGroupNumber","\x03","\x9f","\x89","\x8b"),
	HX_HCSTRING("separatorGroupPercent","\x4b","\xc5","\x00","\x5c"),
	HX_HCSTRING("signNegative","\xd2","\x77","\xdd","\x90"),
	HX_HCSTRING("signPositive","\x16","\xf8","\x95","\x0a"),
	HX_HCSTRING("symbolCurrency","\xc9","\x8a","\x97","\x92"),
	HX_HCSTRING("symbolNaN","\x43","\xfc","\xff","\xdf"),
	HX_HCSTRING("symbolNegativeInfinity","\xf5","\xb1","\x7e","\x58"),
	HX_HCSTRING("symbolPercent","\x4d","\x3e","\x49","\xc2"),
	HX_HCSTRING("symbolPermille","\x84","\x61","\x72","\x02"),
	HX_HCSTRING("symbolPositiveInfinity","\x39","\x16","\xd7","\x06"),
	HX_HCSTRING("toObject","\x9a","\x26","\x7e","\x3c"),
	::String(null()) };

static void NumberFormatInfo_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(NumberFormatInfo_obj::__mClass,"__mClass");
	HX_MARK_MEMBER_NAME(NumberFormatInfo_obj::invariant,"invariant");
};

#ifdef HXCPP_VISIT_ALLOCS
static void NumberFormatInfo_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(NumberFormatInfo_obj::__mClass,"__mClass");
	HX_VISIT_MEMBER_NAME(NumberFormatInfo_obj::invariant,"invariant");
};

#endif

hx::Class NumberFormatInfo_obj::__mClass;

static ::String NumberFormatInfo_obj_sStaticFields[] = {
	HX_HCSTRING("invariant","\x40","\x5b","\x93","\xf5"),
	HX_HCSTRING("fromObject","\xc9","\x83","\x83","\x58"),
	::String(null())
};

void NumberFormatInfo_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.culture.NumberFormatInfo","\x38","\xb3","\x9a","\x6e");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &NumberFormatInfo_obj::__GetStatic;
	__mClass->mSetStaticField = &NumberFormatInfo_obj::__SetStatic;
	__mClass->mMarkFunc = NumberFormatInfo_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(NumberFormatInfo_obj_sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(NumberFormatInfo_obj_sMemberFields);
	__mClass->mCanCast = hx::TCanCast< NumberFormatInfo_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = NumberFormatInfo_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = NumberFormatInfo_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = NumberFormatInfo_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

void NumberFormatInfo_obj::__boot()
{
{
            	HX_STACK_FRAME("thx.culture.NumberFormatInfo","boot",0x6642d528,"thx.culture.NumberFormatInfo.boot","thx/culture/NumberFormatInfo.hx",4,0x1ffbe2c4)
HXLINE(   4)		invariant =  ::thx::culture::NumberFormatInfo_obj::__new((int)2,(int)2,(int)2,::Array_obj< Int >::__new(1)->init(0,(int)3),::Array_obj< Int >::__new(1)->init(0,(int)3),::Array_obj< Int >::__new(1)->init(0,(int)3),(int)0,(int)1,(int)0,(int)0,(int)0,HX_(".",2e,00,00,00),HX_(".",2e,00,00,00),HX_(".",2e,00,00,00),HX_(",",2c,00,00,00),HX_(",",2c,00,00,00),HX_(",",2c,00,00,00),HX_("-",2d,00,00,00),HX_("+",2b,00,00,00),HX_("\xc2""\xa4""",a2,a9,00,00),HX_("NaN",9b,84,3b,00),HX_("-Infinity",35,48,8a,c8),HX_("%",25,00,00,00),HX_("\xe2""\x80""\xb0""",92,ed,ab,00),HX_("Infinity",08,d3,1a,b4));
            	}
}

} // end namespace thx
} // end namespace culture
