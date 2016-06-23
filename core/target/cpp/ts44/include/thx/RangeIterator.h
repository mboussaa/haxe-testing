// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_RangeIterator
#define INCLUDED_thx_RangeIterator

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS1(thx,RangeIterator)

namespace thx{


class HXCPP_CLASS_ATTRIBUTES RangeIterator_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef RangeIterator_obj OBJ_;
		RangeIterator_obj();

	public:
		void __construct(Int start, ::Dynamic stop,hx::Null< Int >  __o_step);
		inline void *operator new(size_t inSize, bool inContainer=true,const char *inName="thx.RangeIterator")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,true,"thx.RangeIterator"); }
		static hx::ObjectPtr< RangeIterator_obj > __new(Int start, ::Dynamic stop,hx::Null< Int >  __o_step);
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~RangeIterator_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		hx::Val __SetField(const ::String &inString,const hx::Val &inValue, hx::PropertyAccess inCallProp);
		void __GetFields(Array< ::String> &outFields);
		static void __register();
		void __Mark(HX_MARK_PARAMS);
		void __Visit(HX_VISIT_PARAMS);
		::String __ToString() const { return HX_HCSTRING("RangeIterator","\xab","\x80","\x43","\xa5"); }

		Int current;
		 ::Dynamic stop;
		Int step;
		Bool hasNext();
		::Dynamic hasNext_dyn();

		Int next();
		::Dynamic next_dyn();

};

} // end namespace thx

#endif /* INCLUDED_thx_RangeIterator */ 