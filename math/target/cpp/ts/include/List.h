// Generated by Haxe 3.3.0
#ifndef INCLUDED_List
#define INCLUDED_List

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS0(List)
HX_DECLARE_CLASS1(_List,ListIterator)
HX_DECLARE_CLASS1(_List,ListNode)



class HXCPP_CLASS_ATTRIBUTES List_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef List_obj OBJ_;
		List_obj();

	public:
		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=true,const char *inName="List")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,true,"List"); }
		static hx::ObjectPtr< List_obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~List_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		hx::Val __SetField(const ::String &inString,const hx::Val &inValue, hx::PropertyAccess inCallProp);
		void __GetFields(Array< ::String> &outFields);
		static void __register();
		void __Mark(HX_MARK_PARAMS);
		void __Visit(HX_VISIT_PARAMS);
		::String __ToString() const { return HX_HCSTRING("List","\x7e","\x48","\x8c","\x32"); }

		 ::_List::ListNode h;
		 ::_List::ListNode q;
		Int length;
		void add( ::Dynamic item);
		::Dynamic add_dyn();

		Bool remove( ::Dynamic v);
		::Dynamic remove_dyn();

		 ::_List::ListIterator iterator();
		::Dynamic iterator_dyn();

};


#endif /* INCLUDED_List */ 
