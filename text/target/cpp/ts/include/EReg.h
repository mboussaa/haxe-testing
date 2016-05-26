// Generated by Haxe 3.3.0
#ifndef INCLUDED_EReg
#define INCLUDED_EReg

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS0(EReg)



class HXCPP_CLASS_ATTRIBUTES EReg_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef EReg_obj OBJ_;
		EReg_obj();

	public:
		void __construct(::String r,::String opt);
		inline void *operator new(size_t inSize, bool inContainer=true,const char *inName="EReg")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,true,"EReg"); }
		static hx::ObjectPtr< EReg_obj > __new(::String r,::String opt);
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~EReg_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		hx::Val __SetField(const ::String &inString,const hx::Val &inValue, hx::PropertyAccess inCallProp);
		void __GetFields(Array< ::String> &outFields);
		static void __register();
		void __Mark(HX_MARK_PARAMS);
		void __Visit(HX_VISIT_PARAMS);
		::String __ToString() const { return HX_HCSTRING("EReg","\x0f","\x4a","\xda","\x2d"); }

		 ::Dynamic r;
		::String last;
		Bool global;
		Bool match(::String s);
		::Dynamic match_dyn();

		::String matched(Int n);
		::Dynamic matched_dyn();

		::String matchedLeft();
		::Dynamic matchedLeft_dyn();

		::String matchedRight();
		::Dynamic matchedRight_dyn();

		Bool matchSub(::String s,Int pos,hx::Null< Int >  len);
		::Dynamic matchSub_dyn();

		::Array< ::String > split(::String s);
		::Dynamic split_dyn();

		::String replace(::String s,::String by);
		::Dynamic replace_dyn();

		::String map(::String s, ::Dynamic f);
		::Dynamic map_dyn();

};


#endif /* INCLUDED_EReg */ 
