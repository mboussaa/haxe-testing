// Generated by Haxe 3.3.0
#ifndef INCLUDED_utest_ui_common_SuccessResultsDisplayMode
#define INCLUDED_utest_ui_common_SuccessResultsDisplayMode

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS3(utest,ui,common,SuccessResultsDisplayMode)
namespace utest{
namespace ui{
namespace common{


class SuccessResultsDisplayMode_obj : public hx::EnumBase_obj
{
	typedef hx::EnumBase_obj super;
		typedef SuccessResultsDisplayMode_obj OBJ_;

	public:
		SuccessResultsDisplayMode_obj() {};
		HX_DO_ENUM_RTTI;
		static void __boot();
		static void __register();
		static bool __GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp);
		::String GetEnumName( ) const { return HX_HCSTRING("utest.ui.common.SuccessResultsDisplayMode","\xa2","\x63","\x63","\xf8"); }
		::String __ToString() const { return HX_HCSTRING("SuccessResultsDisplayMode.","\xfc","\x53","\x6e","\x54") + _hx_tag; }

		static ::utest::ui::common::SuccessResultsDisplayMode AlwaysShowSuccessResults;
		static inline ::utest::ui::common::SuccessResultsDisplayMode AlwaysShowSuccessResults_dyn() { return AlwaysShowSuccessResults; }
		static ::utest::ui::common::SuccessResultsDisplayMode NeverShowSuccessResults;
		static inline ::utest::ui::common::SuccessResultsDisplayMode NeverShowSuccessResults_dyn() { return NeverShowSuccessResults; }
		static ::utest::ui::common::SuccessResultsDisplayMode ShowSuccessResultsWithNoErrors;
		static inline ::utest::ui::common::SuccessResultsDisplayMode ShowSuccessResultsWithNoErrors_dyn() { return ShowSuccessResultsWithNoErrors; }
};

} // end namespace utest
} // end namespace ui
} // end namespace common

#endif /* INCLUDED_utest_ui_common_SuccessResultsDisplayMode */ 
