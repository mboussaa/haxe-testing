// Generated by Haxe 3.3.0
package thx.culture;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Pattern extends haxe.lang.HxObject
{
	static
	{
		//line 4 "/usr/lib/haxe/lib/thx,culture/0,5,0/src/thx/culture/Pattern.hx"
		thx.culture.Pattern.currencyNegatives = new haxe.root.Array<java.lang.String>(new java.lang.String[]{"($n)", "-$n", "$-n", "$n-", "(n$)", "-n$", "n-$", "n$-", "-n $", "-$ n", "n $-", "$ n-", "$ -n", "n- $", "($ n)", "(n $)"});
		//line 5 "/usr/lib/haxe/lib/thx,culture/0,5,0/src/thx/culture/Pattern.hx"
		thx.culture.Pattern.currencyPositives = new haxe.root.Array<java.lang.String>(new java.lang.String[]{"$n", "n$", "$ n", "n $"});
		//line 6 "/usr/lib/haxe/lib/thx,culture/0,5,0/src/thx/culture/Pattern.hx"
		thx.culture.Pattern.numberNegatives = new haxe.root.Array<java.lang.String>(new java.lang.String[]{"(n)", "-n", "- n", "n-", "n -"});
		//line 7 "/usr/lib/haxe/lib/thx,culture/0,5,0/src/thx/culture/Pattern.hx"
		thx.culture.Pattern.percentNegatives = new haxe.root.Array<java.lang.String>(new java.lang.String[]{"-n %", "-n%", "-%n", "%-n", "%n-", "n-%", "n%-", "-%n", "n %-", "% n-", "% -n", "n- %"});
		//line 8 "/usr/lib/haxe/lib/thx,culture/0,5,0/src/thx/culture/Pattern.hx"
		thx.culture.Pattern.percentPositives = new haxe.root.Array<java.lang.String>(new java.lang.String[]{"n %", "n%", "%n", "% n"});
	}
	
	public Pattern(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Pattern()
	{
		//line 3 "/usr/lib/haxe/lib/thx,culture/0,5,0/src/thx/culture/Pattern.hx"
		thx.culture.Pattern.__hx_ctor_thx_culture_Pattern(this);
	}
	
	
	public static void __hx_ctor_thx_culture_Pattern(thx.culture.Pattern __temp_me128)
	{
	}
	
	
	public static haxe.root.Array<java.lang.String> currencyNegatives;
	
	public static haxe.root.Array<java.lang.String> currencyPositives;
	
	public static haxe.root.Array<java.lang.String> numberNegatives;
	
	public static haxe.root.Array<java.lang.String> percentNegatives;
	
	public static haxe.root.Array<java.lang.String> percentPositives;
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 3 "/usr/lib/haxe/lib/thx,culture/0,5,0/src/thx/culture/Pattern.hx"
		return new thx.culture.Pattern(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 3 "/usr/lib/haxe/lib/thx,culture/0,5,0/src/thx/culture/Pattern.hx"
		return new thx.culture.Pattern();
	}
	
	
}


