// Generated by Haxe 3.3.0
#ifndef INCLUDED_hxmath_frames_IFrame2
#define INCLUDED_hxmath_frames_IFrame2

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS2(hxmath,frames,IFrame2)
HX_DECLARE_CLASS2(hxmath,math,Matrix3x2Default)
HX_DECLARE_CLASS2(hxmath,math,Vector2Default)

namespace hxmath{
namespace frames{


class HXCPP_CLASS_ATTRIBUTES IFrame2_obj {
	public:
		typedef hx::Object super;
		HX_DO_INTERFACE_RTTI;

		 ::hxmath::math::Matrix3x2Default (hx::Object :: *_hx_get_matrix)(); 
		static inline  ::hxmath::math::Matrix3x2Default get_matrix( ::Dynamic _hx_) {
			return (_hx_.mPtr->*( static_cast< ::hxmath::frames::IFrame2_obj *>(_hx_.mPtr->_hx_getInterface(0xca0d5ed0)))->_hx_get_matrix)();
		}
		 ::hxmath::math::Vector2Default (hx::Object :: *_hx_get_offset)(); 
		static inline  ::hxmath::math::Vector2Default get_offset( ::Dynamic _hx_) {
			return (_hx_.mPtr->*( static_cast< ::hxmath::frames::IFrame2_obj *>(_hx_.mPtr->_hx_getInterface(0xca0d5ed0)))->_hx_get_offset)();
		}
		 ::hxmath::math::Vector2Default (hx::Object :: *_hx_set_offset)( ::hxmath::math::Vector2Default value); 
		static inline  ::hxmath::math::Vector2Default set_offset( ::Dynamic _hx_, ::hxmath::math::Vector2Default value) {
			return (_hx_.mPtr->*( static_cast< ::hxmath::frames::IFrame2_obj *>(_hx_.mPtr->_hx_getInterface(0xca0d5ed0)))->_hx_set_offset)(value);
		}
		Float (hx::Object :: *_hx_get_angleDegrees)(); 
		static inline Float get_angleDegrees( ::Dynamic _hx_) {
			return (_hx_.mPtr->*( static_cast< ::hxmath::frames::IFrame2_obj *>(_hx_.mPtr->_hx_getInterface(0xca0d5ed0)))->_hx_get_angleDegrees)();
		}
		Float (hx::Object :: *_hx_set_angleDegrees)(Float value); 
		static inline Float set_angleDegrees( ::Dynamic _hx_,Float value) {
			return (_hx_.mPtr->*( static_cast< ::hxmath::frames::IFrame2_obj *>(_hx_.mPtr->_hx_getInterface(0xca0d5ed0)))->_hx_set_angleDegrees)(value);
		}
};

} // end namespace hxmath
} // end namespace frames

#endif /* INCLUDED_hxmath_frames_IFrame2 */ 
