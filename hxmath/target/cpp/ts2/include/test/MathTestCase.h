// Generated by Haxe 3.3.0
#ifndef INCLUDED_test_MathTestCase
#define INCLUDED_test_MathTestCase

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

#ifndef INCLUDED_nanotest_NanoTestCase
#include <nanotest/NanoTestCase.h>
#endif
HX_DECLARE_CLASS2(hxmath,frames,IFrame2)
HX_DECLARE_CLASS2(hxmath,frames,IFrame3)
HX_DECLARE_CLASS2(hxmath,math,IntVector2Default)
HX_DECLARE_CLASS2(hxmath,math,Matrix2x2Default)
HX_DECLARE_CLASS2(hxmath,math,Matrix3x2Default)
HX_DECLARE_CLASS2(hxmath,math,Matrix3x3Default)
HX_DECLARE_CLASS2(hxmath,math,Matrix4x4Default)
HX_DECLARE_CLASS2(hxmath,math,QuaternionDefault)
HX_DECLARE_CLASS2(hxmath,math,Vector2Default)
HX_DECLARE_CLASS2(hxmath,math,Vector3Default)
HX_DECLARE_CLASS2(hxmath,math,Vector4Default)
HX_DECLARE_CLASS1(nanotest,NanoTestCase)
HX_DECLARE_CLASS1(test,Distribution)
HX_DECLARE_CLASS1(test,MathTestCase)

namespace test{


class HXCPP_CLASS_ATTRIBUTES MathTestCase_obj : public  ::nanotest::NanoTestCase_obj
{
	public:
		typedef  ::nanotest::NanoTestCase_obj super;
		typedef MathTestCase_obj OBJ_;
		MathTestCase_obj();

	public:
		void __construct( ::Dynamic posInfos);
		inline void *operator new(size_t inSize, bool inContainer=true,const char *inName="test.MathTestCase")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,true,"test.MathTestCase"); }
		static hx::ObjectPtr< MathTestCase_obj > __new( ::Dynamic posInfos);
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~MathTestCase_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("MathTestCase","\x2a","\xf6","\x49","\x8d"); }

		Float randomFloat(hx::Null< Float >  center,hx::Null< Float >  width,hx::Null< Float >  precision);
		::Dynamic randomFloat_dyn();

		Int randomInt();
		::Dynamic randomInt_dyn();

		::Array< Float > randomArray(Int size, ::test::Distribution distribution);
		::Dynamic randomArray_dyn();

		void assertApproxEquals(Float expected,Float actual,hx::Null< Float >  tolerance, ::Dynamic p);
		::Dynamic assertApproxEquals_dyn();

		 ::hxmath::math::Vector2Default randomVector2(hx::Null< Float >  precision);
		::Dynamic randomVector2_dyn();

		 ::hxmath::math::Vector3Default randomVector3(hx::Null< Float >  precision);
		::Dynamic randomVector3_dyn();

		 ::hxmath::math::Vector4Default randomVector4(hx::Null< Float >  precision);
		::Dynamic randomVector4_dyn();

		 ::hxmath::math::Matrix2x2Default randomMatrix2x2(hx::Null< Float >  precision);
		::Dynamic randomMatrix2x2_dyn();

		 ::hxmath::math::Matrix3x2Default randomMatrix3x2(hx::Null< Float >  precision);
		::Dynamic randomMatrix3x2_dyn();

		 ::hxmath::math::Matrix3x3Default randomMatrix3x3(hx::Null< Float >  precision);
		::Dynamic randomMatrix3x3_dyn();

		 ::hxmath::math::Matrix4x4Default randomMatrix4x4(hx::Null< Float >  precision);
		::Dynamic randomMatrix4x4_dyn();

		 ::hxmath::math::QuaternionDefault randomQuaternion(hx::Null< Float >  precision);
		::Dynamic randomQuaternion_dyn();

		 ::hxmath::math::IntVector2Default randomIntVector2();
		::Dynamic randomIntVector2_dyn();

		Int randomShortVector2();
		::Dynamic randomShortVector2_dyn();

		::Dynamic randomFrame2(hx::Null< Float >  precision);
		::Dynamic randomFrame2_dyn();

		::Dynamic randomFrame3(hx::Null< Float >  precision);
		::Dynamic randomFrame3_dyn();

};

} // end namespace test

#endif /* INCLUDED_test_MathTestCase */ 
