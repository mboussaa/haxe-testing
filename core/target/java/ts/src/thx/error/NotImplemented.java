// Generated by Haxe 3.3.0
package thx.error;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class NotImplemented extends thx.Error
{
	public NotImplemented(haxe.lang.EmptyObject empty)
	{
		//line 15 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/NotImplemented.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public NotImplemented(java.lang.Object posInfo)
	{
		//line 17 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/NotImplemented.hx"
		super(haxe.lang.EmptyObject.EMPTY);
		//line 17 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/NotImplemented.hx"
		thx.error.NotImplemented.__hx_ctor_thx_error_NotImplemented(this, posInfo);
	}
	
	
	public static void __hx_ctor_thx_error_NotImplemented(thx.error.NotImplemented __temp_me226, java.lang.Object posInfo)
	{
		//line 17 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/NotImplemented.hx"
		thx.Error.__hx_ctor_thx_Error(__temp_me226, ( ( ( ( "method " + haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(posInfo, "className", true)) ) + "." ) + haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(posInfo, "methodName", true)) ) + "() needs to be implemented" ), null, posInfo);
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 15 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/NotImplemented.hx"
		return new thx.error.NotImplemented(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 15 "/usr/lib/haxe/lib/thx,core/0,40,1/src/thx/error/NotImplemented.hx"
		return new thx.error.NotImplemented(((java.lang.Object) (arr.__get(0)) ));
	}
	
	
}


