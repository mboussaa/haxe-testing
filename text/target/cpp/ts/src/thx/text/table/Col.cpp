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

void Col_obj::__construct( ::thx::text::Table table,Int index){
            	HX_STACK_FRAME("thx.text.table.Col","new",0xef3642db,"thx.text.table.Col.new","thx/text/table/Col.hx",3,0x07f6f416)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(table,"table")
            	HX_STACK_ARG(index,"index")
HXLINE(   3)		super::__construct(table,index);
            	}

Dynamic Col_obj::__CreateEmpty() { return new Col_obj; }

hx::ObjectPtr< Col_obj > Col_obj::__new( ::thx::text::Table table,Int index)
{
	hx::ObjectPtr< Col_obj > _hx_result = new Col_obj();
	_hx_result->__construct(table,index);
	return _hx_result;
}

Dynamic Col_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< Col_obj > _hx_result = new Col_obj();
	_hx_result->__construct(inArgs[0],inArgs[1]);
	return _hx_result;
}

void Col_obj::setCell(Int rowIndex, ::thx::text::table::Cell cell){
            	HX_STACK_FRAME("thx.text.table.Col","setCell",0x8f8e2e5f,"thx.text.table.Col.setCell","thx/text/table/Col.hx",4,0x07f6f416)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(rowIndex,"rowIndex")
            	HX_STACK_ARG(cell,"cell")
HXLINE(   5)		this->super::_set(rowIndex,cell);
HXLINE(   6)		HX_VARI(  ::thx::text::table::Row,row) = this->table->ensureRow(rowIndex);
HXLINE(   7)		row->_set(this->index,cell);
            	}


HX_DEFINE_DYNAMIC_FUNC2(Col_obj,setCell,(void))

 ::thx::text::table::Cell Col_obj::set(::hx::EnumBase value,Int row,::hx::EnumBase span){
            	HX_STACK_FRAME("thx.text.table.Col","set",0xef3a0e1d,"thx.text.table.Col.set","thx/text/table/Col.hx",11,0x07f6f416)
            	HX_STACK_THIS(this)
            	HX_STACK_ARG(value,"value")
            	HX_STACK_ARG(row,"row")
            	HX_STACK_ARG(span,"span")
HXLINE(  11)		return this->table->set(value,row,this->index,span);
            	}


HX_DEFINE_DYNAMIC_FUNC3(Col_obj,set,return )


Col_obj::Col_obj()
{
}

hx::Val Col_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
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
static hx::StorageInfo *Col_obj_sMemberStorageInfo = 0;
static hx::StaticInfo *Col_obj_sStaticStorageInfo = 0;
#endif

static ::String Col_obj_sMemberFields[] = {
	HX_HCSTRING("setCell","\x64","\x62","\x41","\x07"),
	HX_HCSTRING("set","\xa2","\x9b","\x57","\x00"),
	::String(null()) };

static void Col_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(Col_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void Col_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(Col_obj::__mClass,"__mClass");
};

#endif

hx::Class Col_obj::__mClass;

void Col_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.text.table.Col","\x69","\x39","\xd7","\xcc");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &hx::Class_obj::GetNoStaticField;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = Col_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(0 /* sStaticFields */);
	__mClass->mMembers = hx::Class_obj::dupFunctions(Col_obj_sMemberFields);
	__mClass->mCanCast = hx::TCanCast< Col_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = Col_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = Col_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = Col_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx
} // end namespace text
} // end namespace table