// Generated by Haxe 3.3.0
#ifndef INCLUDED_sys_io_FileOutput
#define INCLUDED_sys_io_FileOutput

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

#ifndef INCLUDED_haxe_io_Output
#include <haxe/io/Output.h>
#endif
HX_DECLARE_CLASS2(haxe,io,Bytes)
HX_DECLARE_CLASS2(haxe,io,Output)
HX_DECLARE_CLASS2(sys,io,FileOutput)
HX_DECLARE_CLASS2(sys,io,FileSeek)

namespace sys{
namespace io{


class HXCPP_CLASS_ATTRIBUTES FileOutput_obj : public ::haxe::io::Output_obj
{
	public:
		typedef ::haxe::io::Output_obj super;
		typedef FileOutput_obj OBJ_;
		FileOutput_obj();
		void __construct( ::Dynamic f);

	public:
		inline void *operator new(size_t inSize, bool inContainer=true,const char *inName="sys.io.FileOutput")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		static hx::ObjectPtr< FileOutput_obj > __new( ::Dynamic f);
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~FileOutput_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		hx::Val __SetField(const ::String &inString,const hx::Val &inValue, hx::PropertyAccess inCallProp);
		void __GetFields(Array< ::String> &outFields);
		static void __register();
		void __Mark(HX_MARK_PARAMS);
		void __Visit(HX_VISIT_PARAMS);
		::String __ToString() const { return HX_HCSTRING("FileOutput","\xbd","\x5a","\xb6","\xe3"); }

		 ::Dynamic _hx___f;
		void writeByte(Int c);

		Int writeBytes(::haxe::io::Bytes s,Int p,Int l);

		void flush();

		void close();

		void seek(Int p,::hx::EnumBase pos);
		::Dynamic seek_dyn();

		Int tell();
		::Dynamic tell_dyn();

};

} // end namespace sys
} // end namespace io

#endif /* INCLUDED_sys_io_FileOutput */ 
