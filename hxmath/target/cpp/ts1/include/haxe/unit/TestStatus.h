// Generated by Haxe 3.3.0
#ifndef INCLUDED_haxe_unit_TestStatus
#define INCLUDED_haxe_unit_TestStatus

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS2(haxe,unit,TestStatus)

namespace haxe{
namespace unit{


class HXCPP_CLASS_ATTRIBUTES TestStatus_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef TestStatus_obj OBJ_;
		TestStatus_obj();
		void __construct();

	public:
		inline void *operator new(size_t inSize, bool inContainer=true,const char *inName="haxe.unit.TestStatus")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		static hx::ObjectPtr< TestStatus_obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~TestStatus_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		hx::Val __SetField(const ::String &inString,const hx::Val &inValue, hx::PropertyAccess inCallProp);
		void __GetFields(Array< ::String> &outFields);
		static void __register();
		void __Mark(HX_MARK_PARAMS);
		void __Visit(HX_VISIT_PARAMS);
		::String __ToString() const { return HX_HCSTRING("TestStatus","\x44","\x31","\xa1","\x15"); }

		Bool done;
		Bool success;
		::String error;
		 ::Dynamic posInfos;
};

} // end namespace haxe
} // end namespace unit

#endif /* INCLUDED_haxe_unit_TestStatus */ 
