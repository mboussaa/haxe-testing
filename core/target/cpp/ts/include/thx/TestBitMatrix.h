// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_TestBitMatrix
#define INCLUDED_thx_TestBitMatrix

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS1(thx,TestBitMatrix)

namespace thx{


class HXCPP_CLASS_ATTRIBUTES TestBitMatrix_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef TestBitMatrix_obj OBJ_;
		TestBitMatrix_obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="thx.TestBitMatrix")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"thx.TestBitMatrix"); }
		static hx::ObjectPtr< TestBitMatrix_obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~TestBitMatrix_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("TestBitMatrix","\x1c","\x48","\x5c","\x79"); }

		void testNew();
		::Dynamic testNew_dyn();

		void testBitMatrix();
		::Dynamic testBitMatrix_dyn();

		void testClone();
		::Dynamic testClone_dyn();

		void testFromToString();
		::Dynamic testFromToString_dyn();

		void testFromToBools();
		::Dynamic testFromToBools_dyn();

		void testConcat();
		::Dynamic testConcat_dyn();

		void testExpand();
		::Dynamic testExpand_dyn();

		void testAnd();
		::Dynamic testAnd_dyn();

		void testOr();
		::Dynamic testOr_dyn();

		void testXor();
		::Dynamic testXor_dyn();

		void testNegate();
		::Dynamic testNegate_dyn();

};

} // end namespace thx

#endif /* INCLUDED_thx_TestBitMatrix */ 
