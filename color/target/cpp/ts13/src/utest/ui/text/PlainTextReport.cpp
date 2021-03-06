// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_Std
#include <Std.h>
#endif
#ifndef INCLUDED_StringBuf
#include <StringBuf.h>
#endif
#ifndef INCLUDED_Sys
#include <Sys.h>
#endif
#ifndef INCLUDED__List_ListIterator
#include <_List/ListIterator.h>
#endif
#ifndef INCLUDED__List_ListNode
#include <_List/ListNode.h>
#endif
#ifndef INCLUDED_haxe_CallStack
#include <haxe/CallStack.h>
#endif
#ifndef INCLUDED_haxe_StackItem
#include <haxe/StackItem.h>
#endif
#ifndef INCLUDED_haxe_Timer
#include <haxe/Timer.h>
#endif
#ifndef INCLUDED_utest_Assertation
#include <utest/Assertation.h>
#endif
#ifndef INCLUDED_utest_Dispatcher
#include <utest/Dispatcher.h>
#endif
#ifndef INCLUDED_utest_Runner
#include <utest/Runner.h>
#endif
#ifndef INCLUDED_utest_ui_common_ClassResult
#include <utest/ui/common/ClassResult.h>
#endif
#ifndef INCLUDED_utest_ui_common_FixtureResult
#include <utest/ui/common/FixtureResult.h>
#endif
#ifndef INCLUDED_utest_ui_common_HeaderDisplayMode
#include <utest/ui/common/HeaderDisplayMode.h>
#endif
#ifndef INCLUDED_utest_ui_common_IReport
#include <utest/ui/common/IReport.h>
#endif
#ifndef INCLUDED_utest_ui_common_PackageResult
#include <utest/ui/common/PackageResult.h>
#endif
#ifndef INCLUDED_utest_ui_common_ReportTools
#include <utest/ui/common/ReportTools.h>
#endif
#ifndef INCLUDED_utest_ui_common_ResultAggregator
#include <utest/ui/common/ResultAggregator.h>
#endif
#ifndef INCLUDED_utest_ui_common_ResultStats
#include <utest/ui/common/ResultStats.h>
#endif
#ifndef INCLUDED_utest_ui_common_SuccessResultsDisplayMode
#include <utest/ui/common/SuccessResultsDisplayMode.h>
#endif
#ifndef INCLUDED_utest_ui_text_PlainTextReport
#include <utest/ui/text/PlainTextReport.h>
#endif

namespace utest{
namespace ui{
namespace text{

void PlainTextReport_obj::__construct( ::utest::Runner runner, ::Dynamic outputHandler){
            	HX_STACK_FRAME("utest.ui.text.PlainTextReport","new",0xcc5287af,"utest.ui.text.PlainTextReport.new","utest/ui/text/PlainTextReport.hx",22,0xc942f442)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(runner,"runner")
            	HX_STACK_ARG(outputHandler,"outputHandler")
HXLINE(  23)		this->aggregator =  ::utest::ui::common::ResultAggregator_obj::__new(runner,true);
HXLINE(  24)		runner->onStart->add(this->start_dyn());
HXLINE(  25)		this->aggregator->onComplete->add(this->complete_dyn());
HXLINE(  26)		if (hx::IsNotNull( outputHandler )) {
HXLINE(  27)			this->setHandler(outputHandler);
            		}
HXLINE(  28)		this->displaySuccessResults = ::utest::ui::common::SuccessResultsDisplayMode_obj::AlwaysShowSuccessResults_dyn();
HXLINE(  29)		this->displayHeader = ::utest::ui::common::HeaderDisplayMode_obj::AlwaysShowHeader_dyn();
            	}

Dynamic PlainTextReport_obj::__CreateEmpty() { return new PlainTextReport_obj; }

hx::ObjectPtr< PlainTextReport_obj > PlainTextReport_obj::__new( ::utest::Runner runner, ::Dynamic outputHandler)
{
	hx::ObjectPtr< PlainTextReport_obj > _hx_result = new PlainTextReport_obj();
	_hx_result->__construct(runner,outputHandler);
	return _hx_result;
}

Dynamic PlainTextReport_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< PlainTextReport_obj > _hx_result = new PlainTextReport_obj();
	_hx_result->__construct(inArgs[0],inArgs[1]);
	return _hx_result;
}

static ::utest::ui::common::IReport_obj _hx_utest_ui_text_PlainTextReport__hx_utest_ui_common_IReport= {
	( void (hx::Object::*)( ::Dynamic))&::utest::ui::text::PlainTextReport_obj::setHandler,
};

void *PlainTextReport_obj::_hx_getInterface(int inHash) {
	switch(inHash) {
		case (int)0xe2747f97: return &_hx_utest_ui_text_PlainTextReport__hx_utest_ui_common_IReport;
	}
	#ifdef HXCPP_SCRIPTABLE
	return super::_hx_getInterface(inHash);
	#else
	return 0;
	#endif
}

void PlainTextReport_obj::setHandler( ::Dynamic handler){
            	HX_STACK_FRAME("utest.ui.text.PlainTextReport","setHandler",0x1e9c34d9,"utest.ui.text.PlainTextReport.setHandler","utest/ui/text/PlainTextReport.hx",33,0xc942f442)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(handler,"handler")
HXLINE(  33)		this->handler = handler;
            	}


HX_DEFINE_DYNAMIC_FUNC1(PlainTextReport_obj,setHandler,(void))

void PlainTextReport_obj::start( ::utest::Runner e){
            	HX_STACK_FRAME("utest.ui.text.PlainTextReport","start",0x56a1dd71,"utest.ui.text.PlainTextReport.start","utest/ui/text/PlainTextReport.hx",37,0xc942f442)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(e,"e")
HXLINE(  37)		this->startTime = this->getTime();
            	}


HX_DEFINE_DYNAMIC_FUNC1(PlainTextReport_obj,start,(void))

Float PlainTextReport_obj::getTime(){
            	HX_STACK_FRAME("utest.ui.text.PlainTextReport","getTime",0x934d8692,"utest.ui.text.PlainTextReport.getTime","utest/ui/text/PlainTextReport.hx",44,0xc942f442)
            	HX_STACK_THIS(this)
HXLINE(  44)		return ::haxe::Timer_obj::stamp();
            	}


HX_DEFINE_DYNAMIC_FUNC0(PlainTextReport_obj,getTime,return )

::String PlainTextReport_obj::indents(Int c){
            	HX_STACK_FRAME("utest.ui.text.PlainTextReport","indents",0x5485dd56,"utest.ui.text.PlainTextReport.indents","utest/ui/text/PlainTextReport.hx",47,0xc942f442)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(c,"c")
HXLINE(  48)		HX_VARI( ::String,s) = HX_("",00,00,00,00);
HXLINE(  49)		{
HXLINE(  49)			HX_VARI( Int,_g1) = (int)0;
HXDLIN(  49)			while((_g1 < c)){
HXLINE(  49)				++_g1;
HXLINE(  50)				hx::AddEq(s,this->indent);
            			}
            		}
HXLINE(  51)		return s;
            	}


HX_DEFINE_DYNAMIC_FUNC1(PlainTextReport_obj,indents,return )

::String PlainTextReport_obj::dumpStack(::Array< ::Dynamic> stack){
            	HX_STACK_FRAME("utest.ui.text.PlainTextReport","dumpStack",0xa9b19a03,"utest.ui.text.PlainTextReport.dumpStack","utest/ui/text/PlainTextReport.hx",54,0xc942f442)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(stack,"stack")
HXLINE(  55)		if ((stack->length == (int)0)) {
HXLINE(  56)			return HX_("",00,00,00,00);
            		}
HXLINE(  57)		HX_VARI( ::Array< ::String >,parts) = ::haxe::CallStack_obj::toString(stack).split(HX_("\n",0a,00,00,00));
HXDLIN(  57)		HX_VARI( ::Array< ::String >,r) = ::Array_obj< ::String >::__new(0);
HXLINE(  59)		{
HXLINE(  59)			HX_VARI( Int,_g) = (int)0;
HXDLIN(  59)			while((_g < parts->length)){
HXLINE(  59)				HX_VARI( ::String,part) = parts->__get(_g);
HXDLIN(  59)				++_g;
HXLINE(  60)				Int _hx_tmp = part.indexOf(HX_(" utest.",27,8f,05,08),null());
HXDLIN(  60)				if ((_hx_tmp >= (int)0)) {
HXLINE(  60)					continue;
            				}
HXLINE(  61)				r->push(part);
            			}
            		}
HXLINE(  63)		return r->join(this->newline);
            	}


HX_DEFINE_DYNAMIC_FUNC1(PlainTextReport_obj,dumpStack,return )

void PlainTextReport_obj::addHeader( ::StringBuf buf, ::utest::ui::common::PackageResult result){
            	HX_STACK_FRAME("utest.ui.text.PlainTextReport","addHeader",0x40a5db1d,"utest.ui.text.PlainTextReport.addHeader","utest/ui/text/PlainTextReport.hx",66,0xc942f442)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(buf,"buf")
            	HX_STACK_ARG(result,"result")
HXLINE(  67)		Bool _hx_tmp = !(::utest::ui::common::ReportTools_obj::hasHeader(hx::ObjectPtr<OBJ_>(this),result->stats));
HXDLIN(  67)		if (_hx_tmp) {
HXLINE(  68)			return;
            		}
HXLINE(  70)		HX_VARI( Float,end) = this->getTime();
HXLINE(  74)		Float _hx_tmp1 = ((end - this->startTime) * (int)1000);
HXDLIN(  74)		Int _hx_tmp2 = ::Std_obj::_hx_int(_hx_tmp1);
HXDLIN(  74)		HX_VARI( Float,time) = ((Float)_hx_tmp2 / (Float)(int)1000);
HXLINE(  77)		::String _hx_tmp3 = ((HX_("\nassertations: ",94,fc,1b,34) + result->stats->assertations) + this->newline);
HXDLIN(  77)		buf->add(_hx_tmp3);
HXLINE(  78)		::String _hx_tmp4 = ((HX_("successes: ",d7,c5,01,55) + result->stats->successes) + this->newline);
HXDLIN(  78)		buf->add(_hx_tmp4);
HXLINE(  79)		::String _hx_tmp5 = ((HX_("errors: ",11,37,51,df) + result->stats->errors) + this->newline);
HXDLIN(  79)		buf->add(_hx_tmp5);
HXLINE(  80)		::String _hx_tmp6 = ((HX_("failures: ",cf,cf,6c,3a) + result->stats->failures) + this->newline);
HXDLIN(  80)		buf->add(_hx_tmp6);
HXLINE(  81)		::String _hx_tmp7 = ((HX_("warnings: ",fd,7c,bf,3c) + result->stats->warnings) + this->newline);
HXDLIN(  81)		buf->add(_hx_tmp7);
HXLINE(  82)		buf->add(((HX_("execution time: ",7b,ab,70,df) + time) + this->newline));
HXLINE(  86)		buf->add(this->newline);
HXLINE(  87)		::String _hx_tmp8;
HXDLIN(  87)		if (result->stats->isOk) {
HXLINE(  87)			_hx_tmp8 = HX_("ALL TESTS OK (success: true)",74,ce,2a,bb);
            		}
            		else {
HXLINE(  87)			_hx_tmp8 = HX_("SOME TESTS FAILURES (success: false)",b3,42,96,fd);
            		}
HXDLIN(  87)		buf->add((HX_("results: ",1c,35,98,72) + _hx_tmp8));
HXLINE(  88)		buf->add(this->newline);
            	}


HX_DEFINE_DYNAMIC_FUNC2(PlainTextReport_obj,addHeader,(void))

::String PlainTextReport_obj::getResults(){
            	HX_STACK_FRAME("utest.ui.text.PlainTextReport","getResults",0x40a03f91,"utest.ui.text.PlainTextReport.getResults","utest/ui/text/PlainTextReport.hx",92,0xc942f442)
            	HX_STACK_THIS(this)
HXLINE(  93)		HX_VARI(  ::StringBuf,buf) =  ::StringBuf_obj::__new();
HXLINE(  94)		this->addHeader(buf,this->result);
HXLINE(  96)		{
HXLINE(  96)			HX_VARI( Int,_g) = (int)0;
HXDLIN(  96)			HX_VARI( ::Array< ::String >,_g1) = this->result->packageNames(null());
HXDLIN(  96)			while((_g < _g1->length)){
HXLINE(  96)				HX_VARI( ::String,pname) = _g1->__get(_g);
HXDLIN(  96)				++_g;
HXLINE(  97)				HX_VARI(  ::utest::ui::common::PackageResult,pack) = this->result->getPackage(pname);
HXLINE(  98)				Bool _hx_tmp = ::utest::ui::common::ReportTools_obj::skipResult(hx::ObjectPtr<OBJ_>(this),pack->stats,this->result->stats->isOk);
HXDLIN(  98)				if (_hx_tmp) {
HXLINE(  98)					continue;
            				}
HXLINE(  99)				{
HXLINE(  99)					HX_VARI( Int,_g2) = (int)0;
HXDLIN(  99)					HX_VARI( ::Array< ::String >,_g3) = pack->classNames(null());
HXDLIN(  99)					while((_g2 < _g3->length)){
HXLINE(  99)						HX_VARI( ::String,cname) = _g3->__get(_g2);
HXDLIN(  99)						++_g2;
HXLINE( 100)						HX_VARI(  ::utest::ui::common::ClassResult,cls) = pack->getClass(cname);
HXLINE( 101)						Bool _hx_tmp1 = ::utest::ui::common::ReportTools_obj::skipResult(hx::ObjectPtr<OBJ_>(this),cls->stats,this->result->stats->isOk);
HXDLIN( 101)						if (_hx_tmp1) {
HXLINE( 101)							continue;
            						}
HXLINE( 102)						::String _hx_tmp2;
HXDLIN( 102)						if ((pname == HX_("",00,00,00,00))) {
HXLINE( 102)							_hx_tmp2 = HX_("",00,00,00,00);
            						}
            						else {
HXLINE( 102)							_hx_tmp2 = (pname + HX_(".",2e,00,00,00));
            						}
HXDLIN( 102)						buf->add(((_hx_tmp2 + cname) + this->newline));
HXLINE( 103)						{
HXLINE( 103)							HX_VARI( Int,_g4) = (int)0;
HXDLIN( 103)							HX_VARI( ::Array< ::String >,_g5) = cls->methodNames(null());
HXDLIN( 103)							while((_g4 < _g5->length)){
HXLINE( 103)								HX_VARI( ::String,mname) = _g5->__get(_g4);
HXDLIN( 103)								++_g4;
HXLINE( 104)								HX_VARI(  ::utest::ui::common::FixtureResult,fix) = cls->get(mname);
HXLINE( 105)								Bool _hx_tmp3 = ::utest::ui::common::ReportTools_obj::skipResult(hx::ObjectPtr<OBJ_>(this),fix->stats,this->result->stats->isOk);
HXDLIN( 105)								if (_hx_tmp3) {
HXLINE( 105)									continue;
            								}
HXLINE( 106)								::String _hx_tmp4 = this->indents((int)1);
HXDLIN( 106)								buf->add(((_hx_tmp4 + mname) + HX_(": ",a6,32,00,00)));
HXLINE( 107)								Bool _hx_tmp5 = fix->stats->isOk;
HXDLIN( 107)								if (_hx_tmp5) {
HXLINE( 108)									buf->add(HX_("OK ",84,33,3c,00));
            								}
            								else {
HXLINE( 109)									Bool _hx_tmp6 = fix->stats->hasErrors;
HXDLIN( 109)									if (_hx_tmp6) {
HXLINE( 110)										buf->add(HX_("ERROR ",78,2f,eb,03));
            									}
            									else {
HXLINE( 111)										Bool _hx_tmp7 = fix->stats->hasFailures;
HXDLIN( 111)										if (_hx_tmp7) {
HXLINE( 112)											buf->add(HX_("FAILURE ",b6,60,ad,5d));
            										}
            										else {
HXLINE( 113)											Bool _hx_tmp8 = fix->stats->hasWarnings;
HXDLIN( 113)											if (_hx_tmp8) {
HXLINE( 114)												buf->add(HX_("WARNING ",64,c6,18,e2));
            											}
            										}
            									}
            								}
HXLINE( 116)								HX_VARI( ::String,messages) = HX_("",00,00,00,00);
HXLINE( 117)								{
HXLINE( 117)									HX_VARI(  ::_List::ListIterator,_g6) = fix->iterator();
HXDLIN( 117)									while(hx::IsNotNull( _g6->head )){
HXLINE( 117)										HX_VARI( ::hx::EnumBase,val) = _g6->head->item;
HXDLIN( 117)										_g6->head = _g6->head->next;
HXLINE( 118)										Int _hx_tmp9 = ( ( ::hx::EnumBase)(val) )->_hx_getIndex();
HXDLIN( 118)										switch((int)(_hx_tmp9)){
            											case (int)0: {
HXLINE( 120)												buf->add(HX_(".",2e,00,00,00));
            											}
            											break;
            											case (int)1: {
HXLINE( 122)												buf->add(HX_("F",46,00,00,00));
HXLINE( 123)												::String _hx_tmp10 = this->indents((int)2);
HXDLIN( 123)												hx::AddEq(messages,(((((_hx_tmp10 + HX_("line: ",9a,2f,a0,ec)) + ( (Int)(val->_hx_getObject(1)->__Field(HX_("lineNumber",dd,81,22,76),hx::paccDynamic)) )) + HX_(", ",74,26,00,00)) + val->_hx_getString(0)) + this->newline));
            											}
            											break;
            											case (int)2: {
HXLINE( 125)												buf->add(HX_("E",45,00,00,00));
HXLINE( 126)												::String _hx_tmp11 = this->indents((int)2);
HXDLIN( 126)												::String _hx_tmp12 = ::Std_obj::string(val->_hx_getObject(0));
HXDLIN( 126)												::String _hx_tmp13 = (_hx_tmp11 + _hx_tmp12);
HXDLIN( 126)												::String _hx_tmp14 = this->dumpStack(val->_hx_getObject(1).StaticCast< ::Array< ::Dynamic> >());
HXDLIN( 126)												hx::AddEq(messages,((_hx_tmp13 + _hx_tmp14) + this->newline));
            											}
            											break;
            											case (int)3: {
HXLINE( 128)												buf->add(HX_("S",53,00,00,00));
HXLINE( 129)												::String _hx_tmp15 = this->indents((int)2);
HXDLIN( 129)												::String _hx_tmp16 = ::Std_obj::string(val->_hx_getObject(0));
HXDLIN( 129)												::String _hx_tmp17 = (_hx_tmp15 + _hx_tmp16);
HXDLIN( 129)												::String _hx_tmp18 = this->dumpStack(val->_hx_getObject(1).StaticCast< ::Array< ::Dynamic> >());
HXDLIN( 129)												hx::AddEq(messages,((_hx_tmp17 + _hx_tmp18) + this->newline));
            											}
            											break;
            											case (int)4: {
HXLINE( 131)												buf->add(HX_("T",54,00,00,00));
HXLINE( 132)												::String _hx_tmp19 = this->indents((int)2);
HXDLIN( 132)												::String _hx_tmp20 = ::Std_obj::string(val->_hx_getObject(0));
HXDLIN( 132)												::String _hx_tmp21 = (_hx_tmp19 + _hx_tmp20);
HXDLIN( 132)												::String _hx_tmp22 = this->dumpStack(val->_hx_getObject(1).StaticCast< ::Array< ::Dynamic> >());
HXDLIN( 132)												hx::AddEq(messages,((_hx_tmp21 + _hx_tmp22) + this->newline));
            											}
            											break;
            											case (int)5: {
HXLINE( 134)												buf->add(HX_("O",4f,00,00,00));
HXLINE( 135)												::String _hx_tmp23 = this->indents((int)2);
HXDLIN( 135)												::String _hx_tmp24 = ((_hx_tmp23 + HX_("missed async calls: ",92,0a,bc,6d)) + val->_hx_getInt(0));
HXDLIN( 135)												::String _hx_tmp25 = this->dumpStack(val->_hx_getObject(1).StaticCast< ::Array< ::Dynamic> >());
HXDLIN( 135)												hx::AddEq(messages,((_hx_tmp24 + _hx_tmp25) + this->newline));
            											}
            											break;
            											case (int)6: {
HXLINE( 137)												buf->add(HX_("A",41,00,00,00));
HXLINE( 138)												::String _hx_tmp26 = this->indents((int)2);
HXDLIN( 138)												::String _hx_tmp27 = ::Std_obj::string(val->_hx_getObject(0));
HXDLIN( 138)												::String _hx_tmp28 = (_hx_tmp26 + _hx_tmp27);
HXDLIN( 138)												::String _hx_tmp29 = this->dumpStack(val->_hx_getObject(1).StaticCast< ::Array< ::Dynamic> >());
HXDLIN( 138)												hx::AddEq(messages,((_hx_tmp28 + _hx_tmp29) + this->newline));
            											}
            											break;
            											case (int)7: {
HXLINE( 140)												buf->add(HX_("W",57,00,00,00));
HXLINE( 141)												::String _hx_tmp30 = this->indents((int)2);
HXDLIN( 141)												hx::AddEq(messages,((_hx_tmp30 + val->_hx_getString(0)) + this->newline));
            											}
            											break;
            										}
            									}
            								}
HXLINE( 144)								buf->add(this->newline);
HXLINE( 145)								buf->add(messages);
            							}
            						}
            					}
            				}
            			}
            		}
HXLINE( 149)		return buf->b->join(HX_("",00,00,00,00));
            	}


HX_DEFINE_DYNAMIC_FUNC0(PlainTextReport_obj,getResults,return )

void PlainTextReport_obj::complete( ::utest::ui::common::PackageResult result){
            	HX_STACK_FRAME("utest.ui.text.PlainTextReport","complete",0x60436b0a,"utest.ui.text.PlainTextReport.complete","utest/ui/text/PlainTextReport.hx",152,0xc942f442)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(result,"result")
HXLINE( 153)		this->result = result;
HXLINE( 154)		this->handler(hx::ObjectPtr<OBJ_>(this));
HXLINE( 156)		Int _hx_tmp;
HXDLIN( 156)		if (result->stats->isOk) {
HXLINE( 156)			_hx_tmp = (int)0;
            		}
            		else {
HXLINE( 156)			_hx_tmp = (int)1;
            		}
HXDLIN( 156)		::Sys_obj::exit(_hx_tmp);
            	}


HX_DEFINE_DYNAMIC_FUNC1(PlainTextReport_obj,complete,(void))


PlainTextReport_obj::PlainTextReport_obj()
{
}

void PlainTextReport_obj::__Mark(HX_MARK_PARAMS)
{
	HX_MARK_BEGIN_CLASS(PlainTextReport);
	HX_MARK_MEMBER_NAME(displaySuccessResults,"displaySuccessResults");
	HX_MARK_MEMBER_NAME(displayHeader,"displayHeader");
	HX_MARK_MEMBER_NAME(handler,"handler");
	HX_MARK_MEMBER_NAME(aggregator,"aggregator");
	HX_MARK_MEMBER_NAME(newline,"newline");
	HX_MARK_MEMBER_NAME(indent,"indent");
	HX_MARK_MEMBER_NAME(startTime,"startTime");
	HX_MARK_MEMBER_NAME(result,"result");
	HX_MARK_END_CLASS();
}

void PlainTextReport_obj::__Visit(HX_VISIT_PARAMS)
{
	HX_VISIT_MEMBER_NAME(displaySuccessResults,"displaySuccessResults");
	HX_VISIT_MEMBER_NAME(displayHeader,"displayHeader");
	HX_VISIT_MEMBER_NAME(handler,"handler");
	HX_VISIT_MEMBER_NAME(aggregator,"aggregator");
	HX_VISIT_MEMBER_NAME(newline,"newline");
	HX_VISIT_MEMBER_NAME(indent,"indent");
	HX_VISIT_MEMBER_NAME(startTime,"startTime");
	HX_VISIT_MEMBER_NAME(result,"result");
}

hx::Val PlainTextReport_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 5:
		if (HX_FIELD_EQ(inName,"start") ) { return hx::Val( start_dyn()); }
		break;
	case 6:
		if (HX_FIELD_EQ(inName,"indent") ) { return hx::Val( indent); }
		if (HX_FIELD_EQ(inName,"result") ) { return hx::Val( result); }
		break;
	case 7:
		if (HX_FIELD_EQ(inName,"handler") ) { return hx::Val( handler); }
		if (HX_FIELD_EQ(inName,"newline") ) { return hx::Val( newline); }
		if (HX_FIELD_EQ(inName,"getTime") ) { return hx::Val( getTime_dyn()); }
		if (HX_FIELD_EQ(inName,"indents") ) { return hx::Val( indents_dyn()); }
		break;
	case 8:
		if (HX_FIELD_EQ(inName,"complete") ) { return hx::Val( complete_dyn()); }
		break;
	case 9:
		if (HX_FIELD_EQ(inName,"startTime") ) { return hx::Val( startTime); }
		if (HX_FIELD_EQ(inName,"dumpStack") ) { return hx::Val( dumpStack_dyn()); }
		if (HX_FIELD_EQ(inName,"addHeader") ) { return hx::Val( addHeader_dyn()); }
		break;
	case 10:
		if (HX_FIELD_EQ(inName,"aggregator") ) { return hx::Val( aggregator); }
		if (HX_FIELD_EQ(inName,"setHandler") ) { return hx::Val( setHandler_dyn()); }
		if (HX_FIELD_EQ(inName,"getResults") ) { return hx::Val( getResults_dyn()); }
		break;
	case 13:
		if (HX_FIELD_EQ(inName,"displayHeader") ) { return hx::Val( displayHeader); }
		break;
	case 21:
		if (HX_FIELD_EQ(inName,"displaySuccessResults") ) { return hx::Val( displaySuccessResults); }
	}
	return super::__Field(inName,inCallProp);
}

hx::Val PlainTextReport_obj::__SetField(const ::String &inName,const hx::Val &inValue,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 6:
		if (HX_FIELD_EQ(inName,"indent") ) { indent=inValue.Cast< ::String >(); return inValue; }
		if (HX_FIELD_EQ(inName,"result") ) { result=inValue.Cast<  ::utest::ui::common::PackageResult >(); return inValue; }
		break;
	case 7:
		if (HX_FIELD_EQ(inName,"handler") ) { handler=inValue.Cast<  ::Dynamic >(); return inValue; }
		if (HX_FIELD_EQ(inName,"newline") ) { newline=inValue.Cast< ::String >(); return inValue; }
		break;
	case 9:
		if (HX_FIELD_EQ(inName,"startTime") ) { startTime=inValue.Cast< Float >(); return inValue; }
		break;
	case 10:
		if (HX_FIELD_EQ(inName,"aggregator") ) { aggregator=inValue.Cast<  ::utest::ui::common::ResultAggregator >(); return inValue; }
		break;
	case 13:
		if (HX_FIELD_EQ(inName,"displayHeader") ) { displayHeader=inValue.Cast< ::hx::EnumBase >(); return inValue; }
		break;
	case 21:
		if (HX_FIELD_EQ(inName,"displaySuccessResults") ) { displaySuccessResults=inValue.Cast< ::hx::EnumBase >(); return inValue; }
	}
	return super::__SetField(inName,inValue,inCallProp);
}

void PlainTextReport_obj::__GetFields(Array< ::String> &outFields)
{
	outFields->push(HX_HCSTRING("displaySuccessResults","\x55","\x57","\x3a","\xa6"));
	outFields->push(HX_HCSTRING("displayHeader","\x6f","\xc5","\x62","\xbe"));
	outFields->push(HX_HCSTRING("aggregator","\x89","\xc1","\xfa","\x33"));
	outFields->push(HX_HCSTRING("newline","\x54","\x98","\xa6","\x0c"));
	outFields->push(HX_HCSTRING("indent","\x6c","\x0c","\xf3","\x93"));
	outFields->push(HX_HCSTRING("startTime","\x8f","\x45","\xf0","\x05"));
	outFields->push(HX_HCSTRING("result","\xdd","\x68","\x84","\x08"));
	super::__GetFields(outFields);
};

#if HXCPP_SCRIPTABLE
static hx::StorageInfo PlainTextReport_obj_sMemberStorageInfo[] = {
	{hx::fsObject /*::utest::ui::common::SuccessResultsDisplayMode*/ ,(int)offsetof(PlainTextReport_obj,displaySuccessResults),HX_HCSTRING("displaySuccessResults","\x55","\x57","\x3a","\xa6")},
	{hx::fsObject /*::utest::ui::common::HeaderDisplayMode*/ ,(int)offsetof(PlainTextReport_obj,displayHeader),HX_HCSTRING("displayHeader","\x6f","\xc5","\x62","\xbe")},
	{hx::fsObject /*Dynamic*/ ,(int)offsetof(PlainTextReport_obj,handler),HX_HCSTRING("handler","\xca","\xaf","\xd5","\x45")},
	{hx::fsObject /*::utest::ui::common::ResultAggregator*/ ,(int)offsetof(PlainTextReport_obj,aggregator),HX_HCSTRING("aggregator","\x89","\xc1","\xfa","\x33")},
	{hx::fsString,(int)offsetof(PlainTextReport_obj,newline),HX_HCSTRING("newline","\x54","\x98","\xa6","\x0c")},
	{hx::fsString,(int)offsetof(PlainTextReport_obj,indent),HX_HCSTRING("indent","\x6c","\x0c","\xf3","\x93")},
	{hx::fsFloat,(int)offsetof(PlainTextReport_obj,startTime),HX_HCSTRING("startTime","\x8f","\x45","\xf0","\x05")},
	{hx::fsObject /*::utest::ui::common::PackageResult*/ ,(int)offsetof(PlainTextReport_obj,result),HX_HCSTRING("result","\xdd","\x68","\x84","\x08")},
	{ hx::fsUnknown, 0, null()}
};
static hx::StaticInfo *PlainTextReport_obj_sStaticStorageInfo = 0;
#endif

static ::String PlainTextReport_obj_sMemberFields[] = {
	HX_HCSTRING("displaySuccessResults","\x55","\x57","\x3a","\xa6"),
	HX_HCSTRING("displayHeader","\x6f","\xc5","\x62","\xbe"),
	HX_HCSTRING("handler","\xca","\xaf","\xd5","\x45"),
	HX_HCSTRING("aggregator","\x89","\xc1","\xfa","\x33"),
	HX_HCSTRING("newline","\x54","\x98","\xa6","\x0c"),
	HX_HCSTRING("indent","\x6c","\x0c","\xf3","\x93"),
	HX_HCSTRING("setHandler","\x48","\xd4","\xb4","\x98"),
	HX_HCSTRING("startTime","\x8f","\x45","\xf0","\x05"),
	HX_HCSTRING("start","\x62","\x74","\x0b","\x84"),
	HX_HCSTRING("getTime","\xc3","\x7b","\x7f","\x1f"),
	HX_HCSTRING("indents","\x87","\xd2","\xb7","\xe0"),
	HX_HCSTRING("dumpStack","\x74","\xfd","\x2f","\x1e"),
	HX_HCSTRING("addHeader","\x8e","\x3e","\x24","\xb5"),
	HX_HCSTRING("result","\xdd","\x68","\x84","\x08"),
	HX_HCSTRING("getResults","\x00","\xdf","\xb8","\xba"),
	HX_HCSTRING("complete","\xb9","\x00","\xc8","\x7f"),
	::String(null()) };

static void PlainTextReport_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(PlainTextReport_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void PlainTextReport_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(PlainTextReport_obj::__mClass,"__mClass");
};

#endif

hx::Class PlainTextReport_obj::__mClass;

void PlainTextReport_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("utest.ui.text.PlainTextReport","\x3d","\x84","\x13","\xa4");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &hx::Class_obj::GetNoStaticField;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = PlainTextReport_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(0 /* sStaticFields */);
	__mClass->mMembers = hx::Class_obj::dupFunctions(PlainTextReport_obj_sMemberFields);
	__mClass->mCanCast = hx::TCanCast< PlainTextReport_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = PlainTextReport_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = PlainTextReport_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = PlainTextReport_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace utest
} // end namespace ui
} // end namespace text
