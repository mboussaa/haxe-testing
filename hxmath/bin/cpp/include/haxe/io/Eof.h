// Generated by Haxe 3.3.0
#ifndef INCLUDED_haxe_io_Eof
#define INCLUDED_haxe_io_Eof

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS2(haxe,io,Eof)

namespace haxe{
namespace io{


class HXCPP_CLASS_ATTRIBUTES Eof_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef Eof_obj OBJ_;
		Eof_obj();
		void __construct();

	public:
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="haxe.io.Eof")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		static hx::ObjectPtr< Eof_obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~Eof_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("Eof","\x9c","\xbc","\x34","\x00"); }

		virtual ::String toString();
		::Dynamic toString_dyn();

};

} // end namespace haxe
} // end namespace io

#endif /* INCLUDED_haxe_io_Eof */ 
