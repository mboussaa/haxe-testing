// Generated by Haxe 3.3.0
#ifndef INCLUDED_hxmath_ds_IArray2
#define INCLUDED_hxmath_ds_IArray2

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS2(hxmath,ds,IArray2)

namespace hxmath{
namespace ds{


class HXCPP_CLASS_ATTRIBUTES IArray2_obj {
	public:
		typedef hx::Object super;
		HX_DO_INTERFACE_RTTI;

		 ::Dynamic (hx::Object :: *_hx_get_keys)(); 
		static inline  ::Dynamic get_keys( ::Dynamic _hx_) {
			return (_hx_.mPtr->*( static_cast< ::hxmath::ds::IArray2_obj *>(_hx_.mPtr->_hx_getInterface(0x733ae6db)))->_hx_get_keys)();
		}
		 ::Dynamic (hx::Object :: *_hx_iterator)(); 
		static inline  ::Dynamic iterator( ::Dynamic _hx_) {
			return (_hx_.mPtr->*( static_cast< ::hxmath::ds::IArray2_obj *>(_hx_.mPtr->_hx_getInterface(0x733ae6db)))->_hx_iterator)();
		}
		Bool (hx::Object :: *_hx_inBounds)(Int x,Int y); 
		static inline Bool inBounds( ::Dynamic _hx_,Int x,Int y) {
			return (_hx_.mPtr->*( static_cast< ::hxmath::ds::IArray2_obj *>(_hx_.mPtr->_hx_getInterface(0x733ae6db)))->_hx_inBounds)(x,y);
		}
		 ::Dynamic (hx::Object :: *_hx_get)(Int x,Int y); 
		static inline  ::Dynamic get( ::Dynamic _hx_,Int x,Int y) {
			return (_hx_.mPtr->*( static_cast< ::hxmath::ds::IArray2_obj *>(_hx_.mPtr->_hx_getInterface(0x733ae6db)))->_hx_get)(x,y);
		}
		 ::Dynamic (hx::Object :: *_hx_getByKey)(Int key); 
		static inline  ::Dynamic getByKey( ::Dynamic _hx_,Int key) {
			return (_hx_.mPtr->*( static_cast< ::hxmath::ds::IArray2_obj *>(_hx_.mPtr->_hx_getInterface(0x733ae6db)))->_hx_getByKey)(key);
		}
		void (hx::Object :: *_hx_set)(Int x,Int y, ::Dynamic item); 
		static inline void set( ::Dynamic _hx_,Int x,Int y, ::Dynamic item) {
			(_hx_.mPtr->*( static_cast< ::hxmath::ds::IArray2_obj *>(_hx_.mPtr->_hx_getInterface(0x733ae6db)))->_hx_set)(x,y,item);
		}
};

} // end namespace hxmath
} // end namespace ds

#endif /* INCLUDED_hxmath_ds_IArray2 */ 
