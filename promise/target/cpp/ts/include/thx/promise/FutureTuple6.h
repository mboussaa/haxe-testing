// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_promise_FutureTuple6
#define INCLUDED_thx_promise_FutureTuple6

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS2(thx,promise,Future)
HX_DECLARE_CLASS2(thx,promise,FutureTuple6)

namespace thx{
namespace promise{


class HXCPP_CLASS_ATTRIBUTES FutureTuple6_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef FutureTuple6_obj OBJ_;
		FutureTuple6_obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="thx.promise.FutureTuple6")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"thx.promise.FutureTuple6"); }
		static hx::ObjectPtr< FutureTuple6_obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~FutureTuple6_obj();

		HX_DO_RTTI_ALL;
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("FutureTuple6","\xf1","\x57","\xb7","\x88"); }

		static  ::thx::promise::Future mapTuple( ::thx::promise::Future future, ::Dynamic callback);
		static ::Dynamic mapTuple_dyn();

		static  ::thx::promise::Future mapTupleAsync( ::thx::promise::Future future, ::Dynamic callback);
		static ::Dynamic mapTupleAsync_dyn();

		static  ::thx::promise::Future mapTupleFuture( ::thx::promise::Future future, ::Dynamic callback);
		static ::Dynamic mapTupleFuture_dyn();

		static  ::thx::promise::Future tuple( ::thx::promise::Future future, ::Dynamic callback);
		static ::Dynamic tuple_dyn();

};

} // end namespace thx
} // end namespace promise

#endif /* INCLUDED_thx_promise_FutureTuple6 */ 
