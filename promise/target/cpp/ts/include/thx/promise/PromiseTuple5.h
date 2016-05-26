// Generated by Haxe 3.3.0
#ifndef INCLUDED_thx_promise_PromiseTuple5
#define INCLUDED_thx_promise_PromiseTuple5

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS1(thx,Error)
HX_DECLARE_CLASS2(thx,promise,Future)
HX_DECLARE_CLASS2(thx,promise,PromiseTuple5)

namespace thx{
namespace promise{


class HXCPP_CLASS_ATTRIBUTES PromiseTuple5_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef PromiseTuple5_obj OBJ_;
		PromiseTuple5_obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="thx.promise.PromiseTuple5")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"thx.promise.PromiseTuple5"); }
		static hx::ObjectPtr< PromiseTuple5_obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~PromiseTuple5_obj();

		HX_DO_RTTI_ALL;
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("PromiseTuple5","\x08","\x23","\x67","\xb0"); }

		static  ::thx::promise::Future join( ::thx::promise::Future p1, ::thx::promise::Future p2);
		static ::Dynamic join_dyn();

		static  ::thx::promise::Future mapTuplePromise( ::thx::promise::Future promise, ::Dynamic success);
		static ::Dynamic mapTuplePromise_dyn();

		static  ::thx::promise::Future mapTuple( ::thx::promise::Future promise, ::Dynamic success);
		static ::Dynamic mapTuple_dyn();

		static  ::thx::promise::Future tuple( ::thx::promise::Future promise, ::Dynamic success, ::Dynamic failure);
		static ::Dynamic tuple_dyn();

};

} // end namespace thx
} // end namespace promise

#endif /* INCLUDED_thx_promise_PromiseTuple5 */ 
