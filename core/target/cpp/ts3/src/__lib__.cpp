// Generated by Haxe 3.3.0
#include <hxcpp.h>

#include <stdio.h>

extern "C" void __hxcpp_main();

extern "C" void __hxcpp_lib_main();

#ifndef INCLUDED_TS3
#include <TS3.h>
#endif
#ifndef INCLUDED_haxe_EntryPoint
#include <haxe/EntryPoint.h>
#endif


void __hxcpp_main() {
{
            	HX_STACK_FRAME("hxcpp","__hxcpp_main",0x10478780,"hxcpp.__hxcpp_main","?",1,0x0000003f)
HXLINE(   1)		::TS3_obj::main();
HXDLIN(   1)		::haxe::EntryPoint_obj::run();
            	}
	}

void __hxcpp_lib_main() {
	HX_TOP_OF_STACK
	hx::Boot();
	__boot_all();
	__hxcpp_main();
	}
