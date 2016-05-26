// Generated by Haxe 3.3.0
#ifndef INCLUDED_IntIterator
#define INCLUDED_IntIterator

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS0(IntIterator)



class HXCPP_CLASS_ATTRIBUTES IntIterator_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef IntIterator_obj OBJ_;
		IntIterator_obj();

	public:
		void __construct(Int min,Int max);
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="IntIterator")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"IntIterator"); }
		static hx::ObjectPtr< IntIterator_obj > __new(Int min,Int max);
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~IntIterator_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		hx::Val __SetField(const ::String &inString,const hx::Val &inValue, hx::PropertyAccess inCallProp);
		void __GetFields(Array< ::String> &outFields);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("IntIterator","\xdd","\xb1","\x1b","\x62"); }

		Int min;
		Int max;
};


#endif /* INCLUDED_IntIterator */ 
