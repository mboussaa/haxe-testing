// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_utest_ui_common_SuccessResultsDisplayMode
#include <utest/ui/common/SuccessResultsDisplayMode.h>
#endif
#ifndef INCLUDED_utest_ui_common_HeaderDisplayMode
#include <utest/ui/common/HeaderDisplayMode.h>
#endif
#ifndef INCLUDED_utest__Dispatcher_EventException
#include <utest/_Dispatcher/EventException.h>
#endif
#ifndef INCLUDED_utest_Assertation
#include <utest/Assertation.h>
#endif
#ifndef INCLUDED_haxe_StackItem
#include <haxe/StackItem.h>
#endif
#ifndef INCLUDED_ValueType
#include <ValueType.h>
#endif
#ifndef INCLUDED_utest_TestHandler
#include <utest/TestHandler.h>
#endif
#ifndef INCLUDED_utest_Assert
#include <utest/Assert.h>
#endif
#ifndef INCLUDED_haxe_MainLoop
#include <haxe/MainLoop.h>
#endif
#ifndef INCLUDED_haxe_Log
#include <haxe/Log.h>
#endif
#ifndef INCLUDED_haxe_EntryPoint
#include <haxe/EntryPoint.h>
#endif
#ifndef INCLUDED_utest_ui_text_PrintReport
#include <utest/ui/text/PrintReport.h>
#endif
#ifndef INCLUDED_utest_ui_text_PlainTextReport
#include <utest/ui/text/PlainTextReport.h>
#endif
#ifndef INCLUDED_utest_ui_common_ResultStats
#include <utest/ui/common/ResultStats.h>
#endif
#ifndef INCLUDED_utest_ui_common_ResultAggregator
#include <utest/ui/common/ResultAggregator.h>
#endif
#ifndef INCLUDED_utest_ui_common_ReportTools
#include <utest/ui/common/ReportTools.h>
#endif
#ifndef INCLUDED_utest_ui_common_PackageResult
#include <utest/ui/common/PackageResult.h>
#endif
#ifndef INCLUDED_utest_ui_common_IReport
#include <utest/ui/common/IReport.h>
#endif
#ifndef INCLUDED_utest_ui_common_FixtureResult
#include <utest/ui/common/FixtureResult.h>
#endif
#ifndef INCLUDED_utest_ui_common_ClassResult
#include <utest/ui/common/ClassResult.h>
#endif
#ifndef INCLUDED_utest_ui_Report
#include <utest/ui/Report.h>
#endif
#ifndef INCLUDED_utest_TestResult
#include <utest/TestResult.h>
#endif
#ifndef INCLUDED_utest_TestFixture
#include <utest/TestFixture.h>
#endif
#ifndef INCLUDED_utest_Runner
#include <utest/Runner.h>
#endif
#ifndef INCLUDED_utest_Notifier
#include <utest/Notifier.h>
#endif
#ifndef INCLUDED_utest_Dispatcher
#include <utest/Dispatcher.h>
#endif
#ifndef INCLUDED_haxe_io_Eof
#include <haxe/io/Eof.h>
#endif
#ifndef INCLUDED_haxe_io_Bytes
#include <haxe/io/Bytes.h>
#endif
#ifndef INCLUDED_haxe_ds_StringMap
#include <haxe/ds/StringMap.h>
#endif
#ifndef INCLUDED_haxe_Timer
#include <haxe/Timer.h>
#endif
#ifndef INCLUDED_haxe_MainEvent
#include <haxe/MainEvent.h>
#endif
#ifndef INCLUDED_haxe_IMap
#include <haxe/IMap.h>
#endif
#ifndef INCLUDED_haxe_CallStack
#include <haxe/CallStack.h>
#endif
#ifndef INCLUDED_cpp_vm_Thread
#include <cpp/vm/Thread.h>
#endif
#ifndef INCLUDED_cpp_vm_Mutex
#include <cpp/vm/Mutex.h>
#endif
#ifndef INCLUDED_cpp_vm_Lock
#include <cpp/vm/Lock.h>
#endif
#ifndef INCLUDED_cpp_Lib
#include <cpp/Lib.h>
#endif
#ifndef INCLUDED_Type
#include <Type.h>
#endif
#ifndef INCLUDED_TS2
#include <TS2.h>
#endif
#ifndef INCLUDED_Sys
#include <Sys.h>
#endif
#ifndef INCLUDED_StringTools
#include <StringTools.h>
#endif
#ifndef INCLUDED_StringBuf
#include <StringBuf.h>
#endif
#ifndef INCLUDED_Std
#include <Std.h>
#endif
#ifndef INCLUDED_Reflect
#include <Reflect.h>
#endif
#ifndef INCLUDED__List_ListIterator
#include <_List/ListIterator.h>
#endif
#ifndef INCLUDED__List_ListNode
#include <_List/ListNode.h>
#endif
#ifndef INCLUDED_List
#include <List.h>
#endif
#ifndef INCLUDED_Lambda
#include <Lambda.h>
#endif
#ifndef INCLUDED_EReg
#include <EReg.h>
#endif
#ifndef INCLUDED_Date
#include <Date.h>
#endif

void __files__boot();

void __boot_all()
{
__files__boot();
hx::RegisterResources( hx::GetResources() );
::utest::ui::common::SuccessResultsDisplayMode_obj::__register();
::utest::ui::common::HeaderDisplayMode_obj::__register();
::utest::_Dispatcher::EventException_obj::__register();
::utest::Assertation_obj::__register();
::haxe::StackItem_obj::__register();
::ValueType_obj::__register();
::utest::TestHandler_obj::__register();
::utest::Assert_obj::__register();
::haxe::MainLoop_obj::__register();
::haxe::Log_obj::__register();
::haxe::EntryPoint_obj::__register();
::utest::ui::text::PrintReport_obj::__register();
::utest::ui::text::PlainTextReport_obj::__register();
::utest::ui::common::ResultStats_obj::__register();
::utest::ui::common::ResultAggregator_obj::__register();
::utest::ui::common::ReportTools_obj::__register();
::utest::ui::common::PackageResult_obj::__register();
::utest::ui::common::IReport_obj::__register();
::utest::ui::common::FixtureResult_obj::__register();
::utest::ui::common::ClassResult_obj::__register();
::utest::ui::Report_obj::__register();
::utest::TestResult_obj::__register();
::utest::TestFixture_obj::__register();
::utest::Runner_obj::__register();
::utest::Notifier_obj::__register();
::utest::Dispatcher_obj::__register();
::haxe::io::Eof_obj::__register();
::haxe::io::Bytes_obj::__register();
::haxe::ds::StringMap_obj::__register();
::haxe::Timer_obj::__register();
::haxe::MainEvent_obj::__register();
::haxe::IMap_obj::__register();
::haxe::CallStack_obj::__register();
::cpp::vm::Thread_obj::__register();
::cpp::vm::Mutex_obj::__register();
::cpp::vm::Lock_obj::__register();
::cpp::Lib_obj::__register();
::Type_obj::__register();
::TS2_obj::__register();
::Sys_obj::__register();
::StringTools_obj::__register();
::StringBuf_obj::__register();
::Std_obj::__register();
::Reflect_obj::__register();
::_List::ListIterator_obj::__register();
::_List::ListNode_obj::__register();
::List_obj::__register();
::Lambda_obj::__register();
::EReg_obj::__register();
::Date_obj::__register();
::utest::ui::common::SuccessResultsDisplayMode_obj::__boot();
::utest::ui::common::HeaderDisplayMode_obj::__boot();
::utest::_Dispatcher::EventException_obj::__boot();
::utest::Assertation_obj::__boot();
::haxe::StackItem_obj::__boot();
::ValueType_obj::__boot();
::haxe::Log_obj::__boot();
::haxe::EntryPoint_obj::__boot();
::haxe::MainLoop_obj::__boot();
::utest::Assert_obj::__boot();
::utest::TestHandler_obj::__boot();
}

