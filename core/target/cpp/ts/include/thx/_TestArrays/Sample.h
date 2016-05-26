// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx__TestArrays_Sample
#define INCLUDED_thx__TestArrays_Sample

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS2(thx,_TestArrays,Sample)

namespace thx{
namespace _TestArrays{


class HXCPP_CLASS_ATTRIBUTES Sample_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef Sample_obj OBJ_;
		Sample_obj();

	public:
		void __construct(Int v);
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="thx._TestArrays.Sample")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"thx._TestArrays.Sample"); }
		static hx::ObjectPtr< Sample_obj > __new(Int v);
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~Sample_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		hx::Val __SetField(const ::String &inString,const hx::Val &inValue, hx::PropertyAccess inCallProp);
		void __GetFields(Array< ::String> &outFields);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("Sample","\x4a","\xd4","\xde","\x51"); }

		Int v;
		Int multiply(Int by);
		::Dynamic multiply_dyn();

};

} // end namespace thx
} // end namespace _TestArrays

#endif /* INCLUDED_thx__TestArrays_Sample */ 