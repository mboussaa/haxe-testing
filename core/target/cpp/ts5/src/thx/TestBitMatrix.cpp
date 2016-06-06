// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_thx_TestBitMatrix
#include <thx/TestBitMatrix.h>
#endif
#ifndef INCLUDED_thx__BitMatrix_BitMatrix_Impl_
#include <thx/_BitMatrix/BitMatrix_Impl_.h>
#endif
#ifndef INCLUDED_utest_Assert
#include <utest/Assert.h>
#endif

namespace thx{

void TestBitMatrix_obj::__construct(Int i){
            	HX_STACK_FRAME("thx.TestBitMatrix","new",0x35b7e4a4,"thx.TestBitMatrix.new","thx/TestBitMatrix.hx",8,0x8eac4d4d)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(i,"i")
HXLINE(   8)		this->x = i;
            	}

Dynamic TestBitMatrix_obj::__CreateEmpty() { return new TestBitMatrix_obj; }

hx::ObjectPtr< TestBitMatrix_obj > TestBitMatrix_obj::__new(Int i)
{
	hx::ObjectPtr< TestBitMatrix_obj > _hx_result = new TestBitMatrix_obj();
	_hx_result->__construct(i);
	return _hx_result;
}

Dynamic TestBitMatrix_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< TestBitMatrix_obj > _hx_result = new TestBitMatrix_obj();
	_hx_result->__construct(inArgs[0]);
	return _hx_result;
}

void TestBitMatrix_obj::testNew(){
            	HX_STACK_FRAME("thx.TestBitMatrix","testNew",0x9fffc572,"thx.TestBitMatrix.testNew","thx/TestBitMatrix.hx",12,0x8eac4d4d)
            	HX_STACK_THIS(this)
HXLINE(  12)		HX_VARI( Int,_g1) = (int)0;
HXDLIN(  12)		HX_VARI( Int,_g) = this->x;
HXDLIN(  12)		while((_g1 < _g)){
HXLINE(  12)			++_g1;
HXLINE(  13)			HX_VARI( ::Array< ::Dynamic>,bits) = ::thx::_BitMatrix::BitMatrix_Impl__obj::_new(null(),null());
HXLINE(  14)			::utest::Assert_obj::same((int)0,::thx::_BitMatrix::BitMatrix_Impl__obj::get_bitSetCount(bits),null(),null(),null(),hx::SourceInfo(HX_("TestBitMatrix.hx",22,f4,25,72),14,HX_("thx.TestBitMatrix",b2,02,80,8c),HX_("testNew",2e,3f,c2,bd)));
HXLINE(  15)			::utest::Assert_obj::same((int)0,::thx::_BitMatrix::BitMatrix_Impl__obj::get_length(bits),null(),null(),null(),hx::SourceInfo(HX_("TestBitMatrix.hx",22,f4,25,72),15,HX_("thx.TestBitMatrix",b2,02,80,8c),HX_("testNew",2e,3f,c2,bd)));
HXLINE(  17)			bits = ::thx::_BitMatrix::BitMatrix_Impl__obj::_new((int)5,(int)10);
HXLINE(  18)			::utest::Assert_obj::same((int)5,::thx::_BitMatrix::BitMatrix_Impl__obj::get_bitSetCount(bits),null(),null(),null(),hx::SourceInfo(HX_("TestBitMatrix.hx",22,f4,25,72),18,HX_("thx.TestBitMatrix",b2,02,80,8c),HX_("testNew",2e,3f,c2,bd)));
HXLINE(  19)			::utest::Assert_obj::same((int)10,::thx::_BitMatrix::BitMatrix_Impl__obj::get_length(bits),null(),null(),null(),hx::SourceInfo(HX_("TestBitMatrix.hx",22,f4,25,72),19,HX_("thx.TestBitMatrix",b2,02,80,8c),HX_("testNew",2e,3f,c2,bd)));
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestBitMatrix_obj,testNew,(void))

void TestBitMatrix_obj::testBitMatrix(){
            	HX_STACK_FRAME("thx.TestBitMatrix","testBitMatrix",0x27458980,"thx.TestBitMatrix.testBitMatrix","thx/TestBitMatrix.hx",23,0x8eac4d4d)
            	HX_STACK_THIS(this)
HXLINE(  23)		HX_VARI( Int,_g1) = (int)0;
HXDLIN(  23)		HX_VARI( Int,_g) = this->x;
HXDLIN(  23)		while((_g1 < _g)){
            			HX_BEGIN_LOCAL_FUNC_S1(hx::LocalFunc,_hx_Closure_0,::Array< ::Dynamic>,bits) HXARGC(0)
            			void _hx_run(){
            				HX_STACK_FRAME("thx.TestBitMatrix","testBitMatrix",0x27458980,"thx.TestBitMatrix.testBitMatrix","thx/TestBitMatrix.hx",37,0x8eac4d4d)
HXLINE(  37)				::thx::_BitMatrix::BitMatrix_Impl__obj::setBitAt(bits,(int)3,(int)0,true);
            			}
            			HX_END_LOCAL_FUNC0((void))

HXLINE(  23)			++_g1;
HXLINE(  24)			HX_VARI( ::Array< ::Dynamic>,bits) = ::thx::_BitMatrix::BitMatrix_Impl__obj::_new((int)3,(int)3);
HXLINE(  25)			::thx::_BitMatrix::BitMatrix_Impl__obj::setBitAt(bits,(int)0,(int)0,true);
HXLINE(  26)			::thx::_BitMatrix::BitMatrix_Impl__obj::setBitAt(bits,(int)0,(int)1,true);
HXLINE(  27)			::thx::_BitMatrix::BitMatrix_Impl__obj::setBitAt(bits,(int)0,(int)2,true);
HXLINE(  28)			::thx::_BitMatrix::BitMatrix_Impl__obj::setBitAt(bits,(int)1,(int)0,false);
HXLINE(  29)			::thx::_BitMatrix::BitMatrix_Impl__obj::setBitAt(bits,(int)1,(int)1,false);
HXLINE(  30)			::thx::_BitMatrix::BitMatrix_Impl__obj::setBitAt(bits,(int)1,(int)2,false);
HXLINE(  31)			::thx::_BitMatrix::BitMatrix_Impl__obj::setBitAt(bits,(int)2,(int)0,true);
HXLINE(  32)			::thx::_BitMatrix::BitMatrix_Impl__obj::setBitAt(bits,(int)2,(int)1,false);
HXLINE(  33)			::thx::_BitMatrix::BitMatrix_Impl__obj::setBitAt(bits,(int)2,(int)2,true);
HXLINE(  34)			::String _hx_tmp = ::thx::_BitMatrix::BitMatrix_Impl__obj::toString(bits,null());
HXDLIN(  34)			::utest::Assert_obj::equals(HX_("111,000,101",9b,59,52,6b),_hx_tmp,null(),hx::SourceInfo(HX_("TestBitMatrix.hx",22,f4,25,72),34,HX_("thx.TestBitMatrix",b2,02,80,8c),HX_("testBitMatrix",3c,f8,6b,31)));
HXLINE(  37)			::utest::Assert_obj::raises( ::Dynamic(new _hx_Closure_0(bits)),null(),null(),null(),hx::SourceInfo(HX_("TestBitMatrix.hx",22,f4,25,72),37,HX_("thx.TestBitMatrix",b2,02,80,8c),HX_("testBitMatrix",3c,f8,6b,31)));
HXLINE(  40)			::thx::_BitMatrix::BitMatrix_Impl__obj::setBitAt(bits,(int)0,(int)3,true);
HXLINE(  41)			::String _hx_tmp1 = ::thx::_BitMatrix::BitMatrix_Impl__obj::toString(bits,null());
HXDLIN(  41)			::utest::Assert_obj::equals(HX_("1111,0000,1010",be,55,12,a4),_hx_tmp1,null(),hx::SourceInfo(HX_("TestBitMatrix.hx",22,f4,25,72),41,HX_("thx.TestBitMatrix",b2,02,80,8c),HX_("testBitMatrix",3c,f8,6b,31)));
HXLINE(  42)			::utest::Assert_obj::same((int)4,::thx::_BitMatrix::BitMatrix_Impl__obj::get_length(bits),null(),null(),null(),hx::SourceInfo(HX_("TestBitMatrix.hx",22,f4,25,72),42,HX_("thx.TestBitMatrix",b2,02,80,8c),HX_("testBitMatrix",3c,f8,6b,31)));
HXLINE(  44)			::thx::_BitMatrix::BitMatrix_Impl__obj::setBitAt(bits,(int)1,(int)4,true);
HXLINE(  45)			::String _hx_tmp2 = ::thx::_BitMatrix::BitMatrix_Impl__obj::toString(bits,null());
HXDLIN(  45)			::utest::Assert_obj::equals(HX_("11110,00001,10100",fb,43,6d,bb),_hx_tmp2,null(),hx::SourceInfo(HX_("TestBitMatrix.hx",22,f4,25,72),45,HX_("thx.TestBitMatrix",b2,02,80,8c),HX_("testBitMatrix",3c,f8,6b,31)));
HXLINE(  46)			::utest::Assert_obj::same((int)5,::thx::_BitMatrix::BitMatrix_Impl__obj::get_length(bits),null(),null(),null(),hx::SourceInfo(HX_("TestBitMatrix.hx",22,f4,25,72),46,HX_("thx.TestBitMatrix",b2,02,80,8c),HX_("testBitMatrix",3c,f8,6b,31)));
HXLINE(  48)			::thx::_BitMatrix::BitMatrix_Impl__obj::setBitAt(bits,(int)2,(int)5,true);
HXLINE(  49)			::String _hx_tmp3 = ::thx::_BitMatrix::BitMatrix_Impl__obj::toString(bits,null());
HXDLIN(  49)			::utest::Assert_obj::equals(HX_("111100,000010,101001",40,71,d2,1e),_hx_tmp3,null(),hx::SourceInfo(HX_("TestBitMatrix.hx",22,f4,25,72),49,HX_("thx.TestBitMatrix",b2,02,80,8c),HX_("testBitMatrix",3c,f8,6b,31)));
HXLINE(  50)			::utest::Assert_obj::same((int)6,::thx::_BitMatrix::BitMatrix_Impl__obj::get_length(bits),null(),null(),null(),hx::SourceInfo(HX_("TestBitMatrix.hx",22,f4,25,72),50,HX_("thx.TestBitMatrix",b2,02,80,8c),HX_("testBitMatrix",3c,f8,6b,31)));
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestBitMatrix_obj,testBitMatrix,(void))

void TestBitMatrix_obj::testClone(){
            	HX_STACK_FRAME("thx.TestBitMatrix","testClone",0x22c3f0ef,"thx.TestBitMatrix.testClone","thx/TestBitMatrix.hx",54,0x8eac4d4d)
            	HX_STACK_THIS(this)
HXLINE(  54)		HX_VARI( Int,_g1) = (int)0;
HXDLIN(  54)		HX_VARI( Int,_g) = this->x;
HXDLIN(  54)		while((_g1 < _g)){
HXLINE(  54)			++_g1;
HXLINE(  55)			HX_VARI( ::Array< ::Dynamic>,bits) = ::thx::_BitMatrix::BitMatrix_Impl__obj::_new((int)2,(int)3);
HXLINE(  56)			::thx::_BitMatrix::BitMatrix_Impl__obj::setBitAt(bits,(int)0,(int)0,true);
HXLINE(  57)			::thx::_BitMatrix::BitMatrix_Impl__obj::setBitAt(bits,(int)0,(int)1,true);
HXLINE(  58)			::thx::_BitMatrix::BitMatrix_Impl__obj::setBitAt(bits,(int)0,(int)2,true);
HXLINE(  59)			::thx::_BitMatrix::BitMatrix_Impl__obj::setBitAt(bits,(int)1,(int)0,false);
HXLINE(  60)			::thx::_BitMatrix::BitMatrix_Impl__obj::setBitAt(bits,(int)1,(int)1,false);
HXLINE(  61)			::thx::_BitMatrix::BitMatrix_Impl__obj::setBitAt(bits,(int)1,(int)2,false);
HXLINE(  62)			HX_VARI( ::Array< ::Dynamic>,clone) = ::thx::_BitMatrix::BitMatrix_Impl__obj::clone(bits);
HXLINE(  63)			::thx::_BitMatrix::BitMatrix_Impl__obj::setBitAt(clone,(int)0,(int)1,false);
HXLINE(  64)			::thx::_BitMatrix::BitMatrix_Impl__obj::setBitAt(clone,(int)1,(int)1,true);
HXLINE(  65)			::String _hx_tmp = ::thx::_BitMatrix::BitMatrix_Impl__obj::toString(bits,null());
HXDLIN(  65)			::utest::Assert_obj::same(HX_("111,000",55,cf,f4,e0),_hx_tmp,null(),null(),null(),hx::SourceInfo(HX_("TestBitMatrix.hx",22,f4,25,72),65,HX_("thx.TestBitMatrix",b2,02,80,8c),HX_("testClone",ab,51,65,11)));
HXLINE(  66)			::String _hx_tmp1 = ::thx::_BitMatrix::BitMatrix_Impl__obj::toString(clone,null());
HXDLIN(  66)			::utest::Assert_obj::same(HX_("101,010",d5,73,99,7a),_hx_tmp1,null(),null(),null(),hx::SourceInfo(HX_("TestBitMatrix.hx",22,f4,25,72),66,HX_("thx.TestBitMatrix",b2,02,80,8c),HX_("testClone",ab,51,65,11)));
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestBitMatrix_obj,testClone,(void))

void TestBitMatrix_obj::testFromToString(){
            	HX_STACK_FRAME("thx.TestBitMatrix","testFromToString",0x356f84e4,"thx.TestBitMatrix.testFromToString","thx/TestBitMatrix.hx",70,0x8eac4d4d)
            	HX_STACK_THIS(this)
HXLINE(  70)		HX_VARI( Int,_g1) = (int)0;
HXDLIN(  70)		HX_VARI( Int,_g) = this->x;
HXDLIN(  70)		while((_g1 < _g)){
HXLINE(  70)			++_g1;
HXLINE(  71)			HX_VARI( ::Array< ::Dynamic>,bits) = ::thx::_BitMatrix::BitMatrix_Impl__obj::fromString(HX_("000,111,101,010",fe,98,f9,f8),null());
HXLINE(  72)			::String _hx_tmp = ::thx::_BitMatrix::BitMatrix_Impl__obj::toString(bits,null());
HXDLIN(  72)			::utest::Assert_obj::same(HX_("000,111,101,010",fe,98,f9,f8),_hx_tmp,null(),null(),null(),hx::SourceInfo(HX_("TestBitMatrix.hx",22,f4,25,72),72,HX_("thx.TestBitMatrix",b2,02,80,8c),HX_("testFromToString",a8,f3,c5,b8)));
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestBitMatrix_obj,testFromToString,(void))

void TestBitMatrix_obj::testFromToBools(){
            	HX_STACK_FRAME("thx.TestBitMatrix","testFromToBools",0xbcdf2856,"thx.TestBitMatrix.testFromToBools","thx/TestBitMatrix.hx",76,0x8eac4d4d)
            	HX_STACK_THIS(this)
HXLINE(  76)		HX_VARI( Int,_g1) = (int)0;
HXDLIN(  76)		HX_VARI( Int,_g) = this->x;
HXDLIN(  76)		while((_g1 < _g)){
HXLINE(  76)			++_g1;
HXLINE(  77)			HX_VARI( ::Array< ::Dynamic>,bits) = ::thx::_BitMatrix::BitMatrix_Impl__obj::fromBools(::Array_obj< ::Dynamic>::__new(4)->init(0,::Array_obj< Bool >::__new(2)->init(0,true)->init(1,true))->init(1,::Array_obj< Bool >::__new(2)->init(0,false)->init(1,false))->init(2,::Array_obj< Bool >::__new(2)->init(0,true)->init(1,false))->init(3,::Array_obj< Bool >::__new(2)->init(0,false)->init(1,true)));
HXLINE(  78)			::Array< ::Dynamic> _hx_tmp = ::thx::_BitMatrix::BitMatrix_Impl__obj::toBools(bits);
HXDLIN(  78)			::utest::Assert_obj::same(::cpp::VirtualArray_obj::__new(4)->init(0,::cpp::VirtualArray_obj::__new(2)->init(0,true)->init(1,true))->init(1,::cpp::VirtualArray_obj::__new(2)->init(0,false)->init(1,false))->init(2,::cpp::VirtualArray_obj::__new(2)->init(0,true)->init(1,false))->init(3,::cpp::VirtualArray_obj::__new(2)->init(0,false)->init(1,true)),_hx_tmp,null(),null(),null(),hx::SourceInfo(HX_("TestBitMatrix.hx",22,f4,25,72),78,HX_("thx.TestBitMatrix",b2,02,80,8c),HX_("testFromToBools",12,be,8b,70)));
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestBitMatrix_obj,testFromToBools,(void))

void TestBitMatrix_obj::testConcat(){
            	HX_STACK_FRAME("thx.TestBitMatrix","testConcat",0x02310b42,"thx.TestBitMatrix.testConcat","thx/TestBitMatrix.hx",82,0x8eac4d4d)
            	HX_STACK_THIS(this)
HXLINE(  82)		HX_VARI( Int,_g1) = (int)0;
HXDLIN(  82)		HX_VARI( Int,_g) = this->x;
HXDLIN(  82)		while((_g1 < _g)){
            			HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_0) HXARGC(0)
            			void _hx_run(){
            				HX_STACK_FRAME("thx.TestBitMatrix","testConcat",0x02310b42,"thx.TestBitMatrix.testConcat","thx/TestBitMatrix.hx",96,0x8eac4d4d)
HXLINE(  97)				HX_VARI_NAME( ::Array< ::Dynamic>,b11,"b1") = ::thx::_BitMatrix::BitMatrix_Impl__obj::fromString(HX_("000,111",d5,2a,9e,bd),null());
HXLINE(  98)				HX_VARI_NAME( ::Array< ::Dynamic>,b21,"b2") = ::thx::_BitMatrix::BitMatrix_Impl__obj::fromString(HX_("000,111,000",d9,b2,8e,7a),null());
HXLINE(  99)				::thx::_BitMatrix::BitMatrix_Impl__obj::concat(b11,b21);
            			}
            			HX_END_LOCAL_FUNC0((void))

HXLINE(  82)			++_g1;
HXLINE(  83)			HX_VARI( ::Array< ::Dynamic>,b1) = ::thx::_BitMatrix::BitMatrix_Impl__obj::fromString(HX_("000,111,101,010",fe,98,f9,f8),null());
HXLINE(  84)			HX_VARI( ::Array< ::Dynamic>,b2) = ::thx::_BitMatrix::BitMatrix_Impl__obj::fromString(HX_("111,000,111,000",fe,18,a4,e8),null());
HXLINE(  85)			HX_VARI( ::Array< ::Dynamic>,b3) = ::thx::_BitMatrix::BitMatrix_Impl__obj::concat(b1,b2);
HXLINE(  86)			::String _hx_tmp = ::thx::_BitMatrix::BitMatrix_Impl__obj::toString(b1,null());
HXDLIN(  86)			::utest::Assert_obj::same(HX_("000,111,101,010",fe,98,f9,f8),_hx_tmp,null(),null(),null(),hx::SourceInfo(HX_("TestBitMatrix.hx",22,f4,25,72),86,HX_("thx.TestBitMatrix",b2,02,80,8c),HX_("testConcat",06,4f,c4,e0)));
HXLINE(  87)			::String _hx_tmp1 = ::thx::_BitMatrix::BitMatrix_Impl__obj::toString(b2,null());
HXDLIN(  87)			::utest::Assert_obj::same(HX_("111,000,111,000",fe,18,a4,e8),_hx_tmp1,null(),null(),null(),hx::SourceInfo(HX_("TestBitMatrix.hx",22,f4,25,72),87,HX_("thx.TestBitMatrix",b2,02,80,8c),HX_("testConcat",06,4f,c4,e0)));
HXLINE(  88)			::String _hx_tmp2 = ::thx::_BitMatrix::BitMatrix_Impl__obj::toString(b3,null());
HXDLIN(  88)			::utest::Assert_obj::same(HX_("000111,111000,101111,010000",ec,46,3f,e0),_hx_tmp2,null(),null(),null(),hx::SourceInfo(HX_("TestBitMatrix.hx",22,f4,25,72),88,HX_("thx.TestBitMatrix",b2,02,80,8c),HX_("testConcat",06,4f,c4,e0)));
HXLINE(  89)			::utest::Assert_obj::same((int)4,::thx::_BitMatrix::BitMatrix_Impl__obj::get_bitSetCount(b1),null(),null(),null(),hx::SourceInfo(HX_("TestBitMatrix.hx",22,f4,25,72),89,HX_("thx.TestBitMatrix",b2,02,80,8c),HX_("testConcat",06,4f,c4,e0)));
HXLINE(  90)			::utest::Assert_obj::same((int)4,::thx::_BitMatrix::BitMatrix_Impl__obj::get_bitSetCount(b2),null(),null(),null(),hx::SourceInfo(HX_("TestBitMatrix.hx",22,f4,25,72),90,HX_("thx.TestBitMatrix",b2,02,80,8c),HX_("testConcat",06,4f,c4,e0)));
HXLINE(  91)			::utest::Assert_obj::same((int)4,::thx::_BitMatrix::BitMatrix_Impl__obj::get_bitSetCount(b3),null(),null(),null(),hx::SourceInfo(HX_("TestBitMatrix.hx",22,f4,25,72),91,HX_("thx.TestBitMatrix",b2,02,80,8c),HX_("testConcat",06,4f,c4,e0)));
HXLINE(  92)			::utest::Assert_obj::same((int)3,::thx::_BitMatrix::BitMatrix_Impl__obj::get_length(b1),null(),null(),null(),hx::SourceInfo(HX_("TestBitMatrix.hx",22,f4,25,72),92,HX_("thx.TestBitMatrix",b2,02,80,8c),HX_("testConcat",06,4f,c4,e0)));
HXLINE(  93)			::utest::Assert_obj::same((int)3,::thx::_BitMatrix::BitMatrix_Impl__obj::get_length(b2),null(),null(),null(),hx::SourceInfo(HX_("TestBitMatrix.hx",22,f4,25,72),93,HX_("thx.TestBitMatrix",b2,02,80,8c),HX_("testConcat",06,4f,c4,e0)));
HXLINE(  94)			::utest::Assert_obj::same((int)6,::thx::_BitMatrix::BitMatrix_Impl__obj::get_length(b3),null(),null(),null(),hx::SourceInfo(HX_("TestBitMatrix.hx",22,f4,25,72),94,HX_("thx.TestBitMatrix",b2,02,80,8c),HX_("testConcat",06,4f,c4,e0)));
HXLINE(  96)			::utest::Assert_obj::raises( ::Dynamic(new _hx_Closure_0()),null(),null(),null(),hx::SourceInfo(HX_("TestBitMatrix.hx",22,f4,25,72),96,HX_("thx.TestBitMatrix",b2,02,80,8c),HX_("testConcat",06,4f,c4,e0)));
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestBitMatrix_obj,testConcat,(void))

void TestBitMatrix_obj::testExpand(){
            	HX_STACK_FRAME("thx.TestBitMatrix","testExpand",0xfed3f088,"thx.TestBitMatrix.testExpand","thx/TestBitMatrix.hx",104,0x8eac4d4d)
            	HX_STACK_THIS(this)
HXLINE( 104)		HX_VARI( Int,_g1) = (int)0;
HXDLIN( 104)		HX_VARI( Int,_g) = this->x;
HXDLIN( 104)		while((_g1 < _g)){
HXLINE( 104)			++_g1;
HXLINE( 105)			HX_VARI( ::Array< ::Dynamic>,b1) = ::thx::_BitMatrix::BitMatrix_Impl__obj::fromString(HX_("000,111,101,010",fe,98,f9,f8),null());
HXLINE( 106)			HX_VARI( ::Array< ::Dynamic>,b2) = ::thx::_BitMatrix::BitMatrix_Impl__obj::expand(b1,(int)1);
HXLINE( 107)			HX_VARI( ::Array< ::Dynamic>,b3) = ::thx::_BitMatrix::BitMatrix_Impl__obj::expand(b1,(int)3);
HXLINE( 108)			::String _hx_tmp = ::thx::_BitMatrix::BitMatrix_Impl__obj::toString(b1,null());
HXDLIN( 108)			::utest::Assert_obj::same(HX_("000,111,101,010",fe,98,f9,f8),_hx_tmp,null(),null(),null(),hx::SourceInfo(HX_("TestBitMatrix.hx",22,f4,25,72),108,HX_("thx.TestBitMatrix",b2,02,80,8c),HX_("testExpand",4c,34,67,dd)));
HXLINE( 109)			::String _hx_tmp1 = ::thx::_BitMatrix::BitMatrix_Impl__obj::toString(b2,null());
HXDLIN( 109)			::utest::Assert_obj::same(HX_("000000,111111,110011,001100",6c,dd,7a,bc),_hx_tmp1,null(),null(),null(),hx::SourceInfo(HX_("TestBitMatrix.hx",22,f4,25,72),109,HX_("thx.TestBitMatrix",b2,02,80,8c),HX_("testExpand",4c,34,67,dd)));
HXLINE( 110)			::String _hx_tmp2 = ::thx::_BitMatrix::BitMatrix_Impl__obj::toString(b3,null());
HXDLIN( 110)			::utest::Assert_obj::same(HX_("000000000000,111111111111,111100001111,000011110000",2c,c1,e5,bd),_hx_tmp2,null(),null(),null(),hx::SourceInfo(HX_("TestBitMatrix.hx",22,f4,25,72),110,HX_("thx.TestBitMatrix",b2,02,80,8c),HX_("testExpand",4c,34,67,dd)));
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestBitMatrix_obj,testExpand,(void))

void TestBitMatrix_obj::testAnd(){
            	HX_STACK_FRAME("thx.TestBitMatrix","testAnd",0x9ff5efe9,"thx.TestBitMatrix.testAnd","thx/TestBitMatrix.hx",114,0x8eac4d4d)
            	HX_STACK_THIS(this)
HXLINE( 114)		HX_VARI( Int,_g1) = (int)0;
HXDLIN( 114)		HX_VARI( Int,_g) = this->x;
HXDLIN( 114)		while((_g1 < _g)){
HXLINE( 114)			++_g1;
HXLINE( 115)			HX_VARI( ::Array< ::Dynamic>,b1) = ::thx::_BitMatrix::BitMatrix_Impl__obj::fromString(HX_("11,00",4c,6e,27,57),null());
HXLINE( 116)			HX_VARI( ::Array< ::Dynamic>,b2) = ::thx::_BitMatrix::BitMatrix_Impl__obj::fromString(HX_("10,10",8c,38,7e,56),null());
HXLINE( 117)			HX_VARI( ::Array< ::Dynamic>,actual) = ::thx::_BitMatrix::BitMatrix_Impl__obj::_hx_and(b1,b2);
HXLINE( 118)			HX_VARI( ::Array< ::Dynamic>,expected) = ::thx::_BitMatrix::BitMatrix_Impl__obj::fromString(HX_("10,00",ad,37,7e,56),null());
HXLINE( 119)			Bool _hx_tmp = ::thx::_BitMatrix::BitMatrix_Impl__obj::equals(expected,actual);
HXDLIN( 119)			::utest::Assert_obj::isTrue(_hx_tmp,null(),hx::SourceInfo(HX_("TestBitMatrix.hx",22,f4,25,72),119,HX_("thx.TestBitMatrix",b2,02,80,8c),HX_("testAnd",a5,69,b8,bd)));
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestBitMatrix_obj,testAnd,(void))

void TestBitMatrix_obj::testOr(){
            	HX_STACK_FRAME("thx.TestBitMatrix","testOr",0x7b8d3451,"thx.TestBitMatrix.testOr","thx/TestBitMatrix.hx",123,0x8eac4d4d)
            	HX_STACK_THIS(this)
HXLINE( 123)		HX_VARI( Int,_g1) = (int)0;
HXDLIN( 123)		HX_VARI( Int,_g) = this->x;
HXDLIN( 123)		while((_g1 < _g)){
HXLINE( 123)			++_g1;
HXLINE( 124)			HX_VARI( ::Array< ::Dynamic>,b1) = ::thx::_BitMatrix::BitMatrix_Impl__obj::fromString(HX_("11,00",4c,6e,27,57),null());
HXLINE( 125)			HX_VARI( ::Array< ::Dynamic>,b2) = ::thx::_BitMatrix::BitMatrix_Impl__obj::fromString(HX_("10,10",8c,38,7e,56),null());
HXLINE( 126)			HX_VARI( ::Array< ::Dynamic>,actual) = ::thx::_BitMatrix::BitMatrix_Impl__obj::_hx_or(b1,b2);
HXLINE( 127)			HX_VARI( ::Array< ::Dynamic>,expected) = ::thx::_BitMatrix::BitMatrix_Impl__obj::fromString(HX_("11,10",2b,6f,27,57),null());
HXLINE( 128)			Bool _hx_tmp = ::thx::_BitMatrix::BitMatrix_Impl__obj::equals(expected,actual);
HXDLIN( 128)			::utest::Assert_obj::isTrue(_hx_tmp,null(),hx::SourceInfo(HX_("TestBitMatrix.hx",22,f4,25,72),128,HX_("thx.TestBitMatrix",b2,02,80,8c),HX_("testOr",15,46,3a,d5)));
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestBitMatrix_obj,testOr,(void))

void TestBitMatrix_obj::testXor(){
            	HX_STACK_FRAME("thx.TestBitMatrix","testXor",0xa00764ad,"thx.TestBitMatrix.testXor","thx/TestBitMatrix.hx",132,0x8eac4d4d)
            	HX_STACK_THIS(this)
HXLINE( 132)		HX_VARI( Int,_g1) = (int)0;
HXDLIN( 132)		HX_VARI( Int,_g) = this->x;
HXDLIN( 132)		while((_g1 < _g)){
HXLINE( 132)			++_g1;
HXLINE( 133)			HX_VARI( ::Array< ::Dynamic>,b1) = ::thx::_BitMatrix::BitMatrix_Impl__obj::fromString(HX_("11,00",4c,6e,27,57),null());
HXLINE( 134)			HX_VARI( ::Array< ::Dynamic>,b2) = ::thx::_BitMatrix::BitMatrix_Impl__obj::fromString(HX_("10,10",8c,38,7e,56),null());
HXLINE( 135)			HX_VARI( ::Array< ::Dynamic>,actual) = ::thx::_BitMatrix::BitMatrix_Impl__obj::_hx_xor(b1,b2);
HXLINE( 136)			HX_VARI( ::Array< ::Dynamic>,expected) = ::thx::_BitMatrix::BitMatrix_Impl__obj::fromString(HX_("01,10",aa,da,c0,c3),null());
HXLINE( 137)			Bool _hx_tmp = ::thx::_BitMatrix::BitMatrix_Impl__obj::equals(expected,actual);
HXDLIN( 137)			::utest::Assert_obj::isTrue(_hx_tmp,null(),hx::SourceInfo(HX_("TestBitMatrix.hx",22,f4,25,72),137,HX_("thx.TestBitMatrix",b2,02,80,8c),HX_("testXor",69,de,c9,bd)));
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestBitMatrix_obj,testXor,(void))

void TestBitMatrix_obj::testNegate(){
            	HX_STACK_FRAME("thx.TestBitMatrix","testNegate",0xa17a43f0,"thx.TestBitMatrix.testNegate","thx/TestBitMatrix.hx",141,0x8eac4d4d)
            	HX_STACK_THIS(this)
HXLINE( 141)		HX_VARI( Int,_g1) = (int)0;
HXDLIN( 141)		HX_VARI( Int,_g) = this->x;
HXDLIN( 141)		while((_g1 < _g)){
HXLINE( 141)			++_g1;
HXLINE( 142)			HX_VARI( ::Array< ::Dynamic>,b1) = ::thx::_BitMatrix::BitMatrix_Impl__obj::fromString(HX_("11,00",4c,6e,27,57),null());
HXLINE( 143)			HX_VARI( ::Array< ::Dynamic>,actual) = ::thx::_BitMatrix::BitMatrix_Impl__obj::negate(b1);
HXLINE( 144)			HX_VARI( ::Array< ::Dynamic>,expected) = ::thx::_BitMatrix::BitMatrix_Impl__obj::fromString(HX_("00,11",0c,a4,17,c3),null());
HXLINE( 145)			Bool _hx_tmp = ::thx::_BitMatrix::BitMatrix_Impl__obj::equals(expected,actual);
HXDLIN( 145)			::utest::Assert_obj::isTrue(_hx_tmp,null(),hx::SourceInfo(HX_("TestBitMatrix.hx",22,f4,25,72),145,HX_("thx.TestBitMatrix",b2,02,80,8c),HX_("testNegate",b4,87,0d,80)));
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestBitMatrix_obj,testNegate,(void))


TestBitMatrix_obj::TestBitMatrix_obj()
{
}

hx::Val TestBitMatrix_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 1:
		if (HX_FIELD_EQ(inName,"x") ) { return hx::Val( x); }
		break;
	case 6:
		if (HX_FIELD_EQ(inName,"testOr") ) { return hx::Val( testOr_dyn()); }
		break;
	case 7:
		if (HX_FIELD_EQ(inName,"testNew") ) { return hx::Val( testNew_dyn()); }
		if (HX_FIELD_EQ(inName,"testAnd") ) { return hx::Val( testAnd_dyn()); }
		if (HX_FIELD_EQ(inName,"testXor") ) { return hx::Val( testXor_dyn()); }
		break;
	case 9:
		if (HX_FIELD_EQ(inName,"testClone") ) { return hx::Val( testClone_dyn()); }
		break;
	case 10:
		if (HX_FIELD_EQ(inName,"testConcat") ) { return hx::Val( testConcat_dyn()); }
		if (HX_FIELD_EQ(inName,"testExpand") ) { return hx::Val( testExpand_dyn()); }
		if (HX_FIELD_EQ(inName,"testNegate") ) { return hx::Val( testNegate_dyn()); }
		break;
	case 13:
		if (HX_FIELD_EQ(inName,"testBitMatrix") ) { return hx::Val( testBitMatrix_dyn()); }
		break;
	case 15:
		if (HX_FIELD_EQ(inName,"testFromToBools") ) { return hx::Val( testFromToBools_dyn()); }
		break;
	case 16:
		if (HX_FIELD_EQ(inName,"testFromToString") ) { return hx::Val( testFromToString_dyn()); }
	}
	return super::__Field(inName,inCallProp);
}

hx::Val TestBitMatrix_obj::__SetField(const ::String &inName,const hx::Val &inValue,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 1:
		if (HX_FIELD_EQ(inName,"x") ) { x=inValue.Cast< Int >(); return inValue; }
	}
	return super::__SetField(inName,inValue,inCallProp);
}

void TestBitMatrix_obj::__GetFields(Array< ::String> &outFields)
{
	outFields->push(HX_HCSTRING("x","\x78","\x00","\x00","\x00"));
	super::__GetFields(outFields);
};

#if HXCPP_SCRIPTABLE
static hx::StorageInfo TestBitMatrix_obj_sMemberStorageInfo[] = {
	{hx::fsInt,(int)offsetof(TestBitMatrix_obj,x),HX_HCSTRING("x","\x78","\x00","\x00","\x00")},
	{ hx::fsUnknown, 0, null()}
};
static hx::StaticInfo *TestBitMatrix_obj_sStaticStorageInfo = 0;
#endif

static ::String TestBitMatrix_obj_sMemberFields[] = {
	HX_HCSTRING("x","\x78","\x00","\x00","\x00"),
	HX_HCSTRING("testNew","\x2e","\x3f","\xc2","\xbd"),
	HX_HCSTRING("testBitMatrix","\x3c","\xf8","\x6b","\x31"),
	HX_HCSTRING("testClone","\xab","\x51","\x65","\x11"),
	HX_HCSTRING("testFromToString","\xa8","\xf3","\xc5","\xb8"),
	HX_HCSTRING("testFromToBools","\x12","\xbe","\x8b","\x70"),
	HX_HCSTRING("testConcat","\x06","\x4f","\xc4","\xe0"),
	HX_HCSTRING("testExpand","\x4c","\x34","\x67","\xdd"),
	HX_HCSTRING("testAnd","\xa5","\x69","\xb8","\xbd"),
	HX_HCSTRING("testOr","\x15","\x46","\x3a","\xd5"),
	HX_HCSTRING("testXor","\x69","\xde","\xc9","\xbd"),
	HX_HCSTRING("testNegate","\xb4","\x87","\x0d","\x80"),
	::String(null()) };

static void TestBitMatrix_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(TestBitMatrix_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void TestBitMatrix_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(TestBitMatrix_obj::__mClass,"__mClass");
};

#endif

hx::Class TestBitMatrix_obj::__mClass;

void TestBitMatrix_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.TestBitMatrix","\xb2","\x02","\x80","\x8c");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &hx::Class_obj::GetNoStaticField;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = TestBitMatrix_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(0 /* sStaticFields */);
	__mClass->mMembers = hx::Class_obj::dupFunctions(TestBitMatrix_obj_sMemberFields);
	__mClass->mCanCast = hx::TCanCast< TestBitMatrix_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = TestBitMatrix_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = TestBitMatrix_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = TestBitMatrix_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx