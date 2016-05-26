// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_thx_text_Table
#include <thx/text/Table.h>
#endif
#ifndef INCLUDED_thx_text_table_Cell
#include <thx/text/table/Cell.h>
#endif
#ifndef INCLUDED_thx_text_table_CellSet
#include <thx/text/table/CellSet.h>
#endif
#ifndef INCLUDED_thx_text_table_CellValueImpl
#include <thx/text/table/CellValueImpl.h>
#endif
#ifndef INCLUDED_thx_text_table_Col
#include <thx/text/table/Col.h>
#endif
#ifndef INCLUDED_thx_text_table_Row
#include <thx/text/table/Row.h>
#endif
#ifndef INCLUDED_thx_text_table_Span
#include <thx/text/table/Span.h>
#endif

namespace thx{
namespace text{
namespace table{

void Row_obj::__construct( ::thx::text::Table table,Int index){
            	HX_STACK_FRAME("thx.text.table.Row","new",0xb46099b5,"thx.text.table.Row.new","thx/text/table/Row.hx",3,0x0e96b67c)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(table,"table")
            	HX_STACK_ARG(index,"index")
HXLINE(   3)		super::__construct(table,index);
            	}

Dynamic Row_obj::__CreateEmpty() { return new Row_obj; }

hx::ObjectPtr< Row_obj > Row_obj::__new( ::thx::text::Table table,Int index)
{
	hx::ObjectPtr< Row_obj > _hx_result = new Row_obj();
	_hx_result->__construct(table,index);
	return _hx_result;
}

Dynamic Row_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< Row_obj > _hx_result = new Row_obj();
	_hx_result->__construct(inArgs[0],inArgs[1]);
	return _hx_result;
}

void Row_obj::setCell(Int colIndex, ::thx::text::table::Cell cell){
            	HX_STACK_FRAME("thx.text.table.Row","setCell",0x2cf5fa39,"thx.text.table.Row.setCell","thx/text/table/Row.hx",4,0x0e96b67c)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(colIndex,"colIndex")
            	HX_STACK_ARG(cell,"cell")
HXLINE(   5)		this->super::_set(colIndex,cell);
HXLINE(   6)		HX_VARI(  ::thx::text::table::Col,col) = this->table->ensureCol(colIndex);
HXLINE(   7)		col->_set(this->index,cell);
            	}


HX_DEFINE_DYNAMIC_FUNC2(Row_obj,setCell,(void))

 ::thx::text::table::Cell Row_obj::set(::hx::EnumBase value,Int col,::hx::EnumBase span){
            	HX_STACK_FRAME("thx.text.table.Row","set",0xb46464f7,"thx.text.table.Row.set","thx/text/table/Row.hx",11,0x0e96b67c)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(value,"value")
            	HX_STACK_ARG(col,"col")
            	HX_STACK_ARG(span,"span")
HXLINE(  11)		return this->table->set(value,this->index,col,span);
            	}


HX_DEFINE_DYNAMIC_FUNC3(Row_obj,set,return )


Row_obj::Row_obj()
{
}

hx::Val Row_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 3:
		if (HX_FIELD_EQ(inName,"set") ) { return hx::Val( set_dyn()); }
		break;
	case 7:
		if (HX_FIELD_EQ(inName,"setCell") ) { return hx::Val( setCell_dyn()); }
	}
	return super::__Field(inName,inCallProp);
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *Row_obj_sMemberStorageInfo = 0;
static hx::StaticInfo *Row_obj_sStaticStorageInfo = 0;
#endif

static ::String Row_obj_sMemberFields[] = {
	HX_HCSTRING("setCell","\x64","\x62","\x41","\x07"),
	HX_HCSTRING("set","\xa2","\x9b","\x57","\x00"),
	::String(null()) };

static void Row_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(Row_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void Row_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(Row_obj::__mClass,"__mClass");
};

#endif

hx::Class Row_obj::__mClass;

void Row_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.text.table.Row","\x43","\x9b","\xe2","\xcc");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &hx::Class_obj::GetNoStaticField;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = Row_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(0 /* sStaticFields */);
	__mClass->mMembers = hx::Class_obj::dupFunctions(Row_obj_sMemberFields);
	__mClass->mCanCast = hx::TCanCast< Row_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = Row_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = Row_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = Row_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx
} // end namespace text
} // end namespace table
