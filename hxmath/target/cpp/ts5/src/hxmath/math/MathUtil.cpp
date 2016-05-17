// Generated by Haxe 3.3.0
#include <hxcpp.h>

#include "hxMath.h"
#ifndef INCLUDED_hxmath_math_MathUtil
#include <hxmath/math/MathUtil.h>
#endif
#ifndef INCLUDED_hxmath_math_Vector2Default
#include <hxmath/math/Vector2Default.h>
#endif

namespace hxmath{
namespace math{

void MathUtil_obj::__construct() { }

Dynamic MathUtil_obj::__CreateEmpty() { return new MathUtil_obj; }

hx::ObjectPtr< MathUtil_obj > MathUtil_obj::__new()
{
	hx::ObjectPtr< MathUtil_obj > _hx_result = new MathUtil_obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic MathUtil_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< MathUtil_obj > _hx_result = new MathUtil_obj();
	_hx_result->__construct();
	return _hx_result;
}

Float MathUtil_obj::eps;

Int MathUtil_obj::intMax(Int a,Int b){
            	HX_STACK_FRAME("hxmath.math.MathUtil","intMax",0x3f17b789,"hxmath.math.MathUtil.intMax","hxmath/math/MathUtil.hx",25,0x18154344)
            	HX_STACK_ARG(a,"a")
            	HX_STACK_ARG(b,"b")
HXLINE(  25)		if ((b > a)) {
HXLINE(  25)			return b;
            		}
            		else {
HXLINE(  25)			return a;
            		}
HXDLIN(  25)		return (int)0;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(MathUtil_obj,intMax,return )

Int MathUtil_obj::intMin(Int a,Int b){
            	HX_STACK_FRAME("hxmath.math.MathUtil","intMin",0x3f17be77,"hxmath.math.MathUtil.intMin","hxmath/math/MathUtil.hx",37,0x18154344)
            	HX_STACK_ARG(a,"a")
            	HX_STACK_ARG(b,"b")
HXLINE(  37)		if ((b < a)) {
HXLINE(  37)			return b;
            		}
            		else {
HXLINE(  37)			return a;
            		}
HXDLIN(  37)		return (int)0;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(MathUtil_obj,intMin,return )

Float MathUtil_obj::lerpCyclic(Float a,Float b,Float t,Float max){
            	HX_STACK_FRAME("hxmath.math.MathUtil","lerpCyclic",0x3685eee4,"hxmath.math.MathUtil.lerpCyclic","hxmath/math/MathUtil.hx",50,0x18154344)
            	HX_STACK_ARG(a,"a")
            	HX_STACK_ARG(b,"b")
            	HX_STACK_ARG(t,"t")
            	HX_STACK_ARG(max,"max")
HXLINE(  52)		Float _hx_tmp = ::Math_obj::abs((a - b));
HXDLIN(  52)		if ((_hx_tmp > (((Float)0.5) * max))) {
HXLINE(  55)			Bool _hx_tmp1 = (a < b);
HXDLIN(  55)			if (_hx_tmp1) {
HXLINE(  57)				hx::AddEq(a,max);
            			}
            			else {
HXLINE(  61)				hx::AddEq(b,max);
            			}
            		}
HXLINE(  65)		HX_VARI( Float,x) = (((((Float)1.0) - t) * a) + (t * b));
HXDLIN(  65)		if ((x < (int)0)) {
HXLINE(  65)			return (max - hx::Mod(-(x),max));
            		}
            		else {
HXLINE(  65)			return hx::Mod(x,max);
            		}
HXDLIN(  65)		return ((Float)0.);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC4(MathUtil_obj,lerpCyclic,return )

Int MathUtil_obj::sign(Float x,hx::Null< Float >  __o_w){
Float w = __o_w.Default(0);
            	HX_STACK_FRAME("hxmath.math.MathUtil","sign",0x79df85d1,"hxmath.math.MathUtil.sign","hxmath/math/MathUtil.hx",77,0x18154344)
            	HX_STACK_ARG(x,"x")
            	HX_STACK_ARG(w,"w")
HXLINE(  77)		Float _hx_tmp = ::Math_obj::abs(x);
HXDLIN(  77)		if ((_hx_tmp < w)) {
HXLINE(  79)			return (int)0;
            		}
            		else {
HXLINE(  83)			if ((x <= -(w))) {
HXLINE(  83)				return (int)-1;
            			}
            			else {
HXLINE(  83)				return (int)1;
            			}
            		}
HXLINE(  77)		return (int)0;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(MathUtil_obj,sign,return )

Float MathUtil_obj::rangeDistance(Float aStart,Float aWidth,Float bStart,Float bWidth){
            	HX_STACK_FRAME("hxmath.math.MathUtil","rangeDistance",0xee8d31fe,"hxmath.math.MathUtil.rangeDistance","hxmath/math/MathUtil.hx",98,0x18154344)
            	HX_STACK_ARG(aStart,"aStart")
            	HX_STACK_ARG(aWidth,"aWidth")
            	HX_STACK_ARG(bStart,"bStart")
            	HX_STACK_ARG(bWidth,"bWidth")
HXLINE(  98)		if (((aStart + aWidth) < bStart)) {
HXLINE( 100)			return (bStart - (aStart + aWidth));
            		}
            		else {
HXLINE( 102)			if (((bStart + bWidth) < aStart)) {
HXLINE( 104)				return (aStart - (bStart + bWidth));
            			}
            			else {
HXLINE( 108)				return (int)0;
            			}
            		}
HXLINE(  98)		return ((Float)0.);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC4(MathUtil_obj,rangeDistance,return )

Bool MathUtil_obj::openRangeContains(Float aStart,Float aWidth,Float x){
            	HX_STACK_FRAME("hxmath.math.MathUtil","openRangeContains",0xfd4194be,"hxmath.math.MathUtil.openRangeContains","hxmath/math/MathUtil.hx",122,0x18154344)
            	HX_STACK_ARG(aStart,"aStart")
            	HX_STACK_ARG(aWidth,"aWidth")
            	HX_STACK_ARG(x,"x")
HXLINE( 122)		if ((x > aStart)) {
HXLINE( 122)			return (x < (aStart + aWidth));
            		}
            		else {
HXLINE( 122)			return false;
            		}
HXDLIN( 122)		return false;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(MathUtil_obj,openRangeContains,return )

Bool MathUtil_obj::openRangesIntersect(Float aStart,Float aWidth,Float bStart,Float bWidth){
            	HX_STACK_FRAME("hxmath.math.MathUtil","openRangesIntersect",0x89cc162b,"hxmath.math.MathUtil.openRangesIntersect","hxmath/math/MathUtil.hx",137,0x18154344)
            	HX_STACK_ARG(aStart,"aStart")
            	HX_STACK_ARG(aWidth,"aWidth")
            	HX_STACK_ARG(bStart,"bStart")
            	HX_STACK_ARG(bWidth,"bWidth")
HXLINE( 137)		Bool _hx_tmp;
HXDLIN( 137)		if (!((aStart >= (bStart + bWidth)))) {
HXLINE( 138)			_hx_tmp = (bStart >= (aStart + aWidth));
            		}
            		else {
HXLINE( 137)			_hx_tmp = true;
            		}
HXDLIN( 137)		return !(_hx_tmp);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC4(MathUtil_obj,openRangesIntersect,return )

Bool MathUtil_obj::closedRangeContains(Float aStart,Float aWidth,Float x){
            	HX_STACK_FRAME("hxmath.math.MathUtil","closedRangeContains",0x0fb8bc9c,"hxmath.math.MathUtil.closedRangeContains","hxmath/math/MathUtil.hx",151,0x18154344)
            	HX_STACK_ARG(aStart,"aStart")
            	HX_STACK_ARG(aWidth,"aWidth")
            	HX_STACK_ARG(x,"x")
HXLINE( 151)		if ((x >= aStart)) {
HXLINE( 151)			return (x <= (aStart + aWidth));
            		}
            		else {
HXLINE( 151)			return false;
            		}
HXDLIN( 151)		return false;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(MathUtil_obj,closedRangeContains,return )

Float MathUtil_obj::radToDeg(Float rad){
            	HX_STACK_FRAME("hxmath.math.MathUtil","radToDeg",0x8f7c908a,"hxmath.math.MathUtil.radToDeg","hxmath/math/MathUtil.hx",161,0x18154344)
            	HX_STACK_ARG(rad,"rad")
HXLINE( 161)		return (((Float)(int)180 / (Float)::Math_obj::PI) * rad);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(MathUtil_obj,radToDeg,return )

Float MathUtil_obj::degToRad(Float deg){
            	HX_STACK_FRAME("hxmath.math.MathUtil","degToRad",0x482cdf08,"hxmath.math.MathUtil.degToRad","hxmath/math/MathUtil.hx",169,0x18154344)
            	HX_STACK_ARG(deg,"deg")
HXLINE( 169)		return (((Float)::Math_obj::PI / (Float)(int)180) * deg);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(MathUtil_obj,degToRad,return )

Float MathUtil_obj::wrap(Float x,Float n){
            	HX_STACK_FRAME("hxmath.math.MathUtil","wrap",0x7c8b2f5e,"hxmath.math.MathUtil.wrap","hxmath/math/MathUtil.hx",181,0x18154344)
            	HX_STACK_ARG(x,"x")
            	HX_STACK_ARG(n,"n")
HXLINE( 181)		if ((x < (int)0)) {
HXLINE( 185)			return (n - hx::Mod(-(x),n));
            		}
            		else {
HXLINE( 189)			return hx::Mod(x,n);
            		}
HXLINE( 181)		return ((Float)0.);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(MathUtil_obj,wrap,return )

Float MathUtil_obj::clamp(Float value,Float min,Float max){
            	HX_STACK_FRAME("hxmath.math.MathUtil","clamp",0xf5435ee7,"hxmath.math.MathUtil.clamp","hxmath/math/MathUtil.hx",202,0x18154344)
            	HX_STACK_ARG(value,"value")
            	HX_STACK_ARG(min,"min")
            	HX_STACK_ARG(max,"max")
HXLINE( 202)		if ((value < min)) {
HXLINE( 204)			return min;
            		}
            		else {
HXLINE( 206)			if ((value > max)) {
HXLINE( 208)				return max;
            			}
            			else {
HXLINE( 212)				return value;
            			}
            		}
HXLINE( 202)		return ((Float)0.);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(MathUtil_obj,clamp,return )

Int MathUtil_obj::orient2d( ::hxmath::math::Vector2Default a, ::hxmath::math::Vector2Default b, ::hxmath::math::Vector2Default c){
            	HX_STACK_FRAME("hxmath.math.MathUtil","orient2d",0x6fe5d08b,"hxmath.math.MathUtil.orient2d","hxmath/math/MathUtil.hx",226,0x18154344)
            	HX_STACK_ARG(a,"a")
            	HX_STACK_ARG(b,"b")
            	HX_STACK_ARG(c,"c")
HXLINE( 227)		HX_VARI( Float,result) = (((a->x - c->x) * (b->y - c->y)) - ((a->y - c->y) * (b->x - c->x)));
HXLINE( 231)		if ((result > (int)0)) {
HXLINE( 233)			return (int)1;
            		}
            		else {
HXLINE( 238)			if ((result < (int)0)) {
HXLINE( 240)				return (int)-1;
            			}
            			else {
HXLINE( 246)				return (int)0;
            			}
            		}
HXLINE( 231)		return null();
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(MathUtil_obj,orient2d,return )

Float MathUtil_obj::det2x2(Float m00,Float m10,Float m01,Float m11){
            	HX_STACK_FRAME("hxmath.math.MathUtil","det2x2",0x109f480d,"hxmath.math.MathUtil.det2x2","hxmath/math/MathUtil.hx",263,0x18154344)
            	HX_STACK_ARG(m00,"m00")
            	HX_STACK_ARG(m10,"m10")
            	HX_STACK_ARG(m01,"m01")
            	HX_STACK_ARG(m11,"m11")
HXLINE( 263)		return ((m00 * m11) - (m10 * m01));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC4(MathUtil_obj,det2x2,return )

Float MathUtil_obj::det3x3(Float m00,Float m10,Float m20,Float m01,Float m11,Float m21,Float m02,Float m12,Float m22){
            	HX_STACK_FRAME("hxmath.math.MathUtil","det3x3",0x10a00a4f,"hxmath.math.MathUtil.det3x3","hxmath/math/MathUtil.hx",285,0x18154344)
            	HX_STACK_ARG(m00,"m00")
            	HX_STACK_ARG(m10,"m10")
            	HX_STACK_ARG(m20,"m20")
            	HX_STACK_ARG(m01,"m01")
            	HX_STACK_ARG(m11,"m11")
            	HX_STACK_ARG(m21,"m21")
            	HX_STACK_ARG(m02,"m02")
            	HX_STACK_ARG(m12,"m12")
            	HX_STACK_ARG(m22,"m22")
HXLINE( 285)		return (((m00 * ((m11 * m22) - (m21 * m12))) - (m10 * ((m01 * m22) - (m21 * m02)))) + (m20 * ((m01 * m12) - (m11 * m02))));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC9(MathUtil_obj,det3x3,return )

Float MathUtil_obj::det4x4(Float m00,Float m10,Float m20,Float m30,Float m01,Float m11,Float m21,Float m31,Float m02,Float m12,Float m22,Float m32,Float m03,Float m13,Float m23,Float m33){
            	HX_STACK_FRAME("hxmath.math.MathUtil","det4x4",0x10a0cc91,"hxmath.math.MathUtil.det4x4","hxmath/math/MathUtil.hx",324,0x18154344)
            	HX_STACK_ARG(m00,"m00")
            	HX_STACK_ARG(m10,"m10")
            	HX_STACK_ARG(m20,"m20")
            	HX_STACK_ARG(m30,"m30")
            	HX_STACK_ARG(m01,"m01")
            	HX_STACK_ARG(m11,"m11")
            	HX_STACK_ARG(m21,"m21")
            	HX_STACK_ARG(m31,"m31")
            	HX_STACK_ARG(m02,"m02")
            	HX_STACK_ARG(m12,"m12")
            	HX_STACK_ARG(m22,"m22")
            	HX_STACK_ARG(m32,"m32")
            	HX_STACK_ARG(m03,"m03")
            	HX_STACK_ARG(m13,"m13")
            	HX_STACK_ARG(m23,"m23")
            	HX_STACK_ARG(m33,"m33")
HXLINE( 324)		return ((((m00 * (((m11 * ((m22 * m33) - (m32 * m23))) - (m21 * ((m12 * m33) - (m32 * m13)))) + (m31 * ((m12 * m23) - (m22 * m13))))) - (m10 * (((m01 * ((m22 * m33) - (m32 * m23))) - (m21 * ((m02 * m33) - (m32 * m03)))) + (m31 * ((m02 * m23) - (m22 * m03)))))) + (m20 * (((m01 * ((m12 * m33) - (m32 * m13))) - (m11 * ((m02 * m33) - (m32 * m03)))) + (m31 * ((m02 * m13) - (m12 * m03)))))) - (m30 * (((m01 * ((m12 * m23) - (m22 * m13))) - (m11 * ((m02 * m23) - (m22 * m03)))) + (m21 * ((m02 * m13) - (m12 * m03))))));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC16(MathUtil_obj,det4x4,return )


MathUtil_obj::MathUtil_obj()
{
}

bool MathUtil_obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 4:
		if (HX_FIELD_EQ(inName,"sign") ) { outValue = sign_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"wrap") ) { outValue = wrap_dyn(); return true; }
		break;
	case 5:
		if (HX_FIELD_EQ(inName,"clamp") ) { outValue = clamp_dyn(); return true; }
		break;
	case 6:
		if (HX_FIELD_EQ(inName,"intMax") ) { outValue = intMax_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"intMin") ) { outValue = intMin_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"det2x2") ) { outValue = det2x2_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"det3x3") ) { outValue = det3x3_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"det4x4") ) { outValue = det4x4_dyn(); return true; }
		break;
	case 8:
		if (HX_FIELD_EQ(inName,"radToDeg") ) { outValue = radToDeg_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"degToRad") ) { outValue = degToRad_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"orient2d") ) { outValue = orient2d_dyn(); return true; }
		break;
	case 10:
		if (HX_FIELD_EQ(inName,"lerpCyclic") ) { outValue = lerpCyclic_dyn(); return true; }
		break;
	case 13:
		if (HX_FIELD_EQ(inName,"rangeDistance") ) { outValue = rangeDistance_dyn(); return true; }
		break;
	case 17:
		if (HX_FIELD_EQ(inName,"openRangeContains") ) { outValue = openRangeContains_dyn(); return true; }
		break;
	case 19:
		if (HX_FIELD_EQ(inName,"openRangesIntersect") ) { outValue = openRangesIntersect_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"closedRangeContains") ) { outValue = closedRangeContains_dyn(); return true; }
	}
	return false;
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *MathUtil_obj_sMemberStorageInfo = 0;
static hx::StaticInfo MathUtil_obj_sStaticStorageInfo[] = {
	{hx::fsFloat,(void *) &MathUtil_obj::eps,HX_HCSTRING("eps","\xa8","\x05","\x4d","\x00")},
	{ hx::fsUnknown, 0, null()}
};
#endif

static void MathUtil_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(MathUtil_obj::__mClass,"__mClass");
	HX_MARK_MEMBER_NAME(MathUtil_obj::eps,"eps");
};

#ifdef HXCPP_VISIT_ALLOCS
static void MathUtil_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(MathUtil_obj::__mClass,"__mClass");
	HX_VISIT_MEMBER_NAME(MathUtil_obj::eps,"eps");
};

#endif

hx::Class MathUtil_obj::__mClass;

static ::String MathUtil_obj_sStaticFields[] = {
	HX_HCSTRING("eps","\xa8","\x05","\x4d","\x00"),
	HX_HCSTRING("intMax","\xf5","\x34","\x74","\x9e"),
	HX_HCSTRING("intMin","\xe3","\x3b","\x74","\x9e"),
	HX_HCSTRING("lerpCyclic","\x50","\x92","\xab","\xb9"),
	HX_HCSTRING("sign","\x3d","\x90","\x53","\x4c"),
	HX_HCSTRING("rangeDistance","\x12","\x7a","\xb2","\x35"),
	HX_HCSTRING("openRangeContains","\xd2","\x76","\xae","\x98"),
	HX_HCSTRING("openRangesIntersect","\x3f","\xa5","\xc4","\x83"),
	HX_HCSTRING("closedRangeContains","\xb0","\x4b","\xb1","\x09"),
	HX_HCSTRING("radToDeg","\xf6","\x40","\x04","\xdd"),
	HX_HCSTRING("degToRad","\x74","\x8f","\xb4","\x95"),
	HX_HCSTRING("wrap","\xca","\x39","\xff","\x4e"),
	HX_HCSTRING("clamp","\xfb","\x72","\x58","\x48"),
	HX_HCSTRING("orient2d","\xf7","\x80","\x6d","\xbd"),
	HX_HCSTRING("det2x2","\x79","\xc5","\xfb","\x6f"),
	HX_HCSTRING("det3x3","\xbb","\x87","\xfc","\x6f"),
	HX_HCSTRING("det4x4","\xfd","\x49","\xfd","\x6f"),
	::String(null())
};

void MathUtil_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("hxmath.math.MathUtil","\x5a","\x53","\x74","\xa5");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &MathUtil_obj::__GetStatic;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = MathUtil_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(MathUtil_obj_sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< MathUtil_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = MathUtil_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = MathUtil_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = MathUtil_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

void MathUtil_obj::__boot()
{
{
            	HX_STACK_FRAME("hxmath.math.MathUtil","boot",0x6ea779c6,"hxmath.math.MathUtil.boot","hxmath/math/MathUtil.hx",14,0x18154344)
HXLINE(  14)		eps = ((Float)1e-6);
            	}
}

} // end namespace hxmath
} // end namespace math
