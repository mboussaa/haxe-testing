// Generated by Haxe 3.3.0
package thx.csv;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Csv extends haxe.lang.HxObject
{
	static
	{
		//line 4 "/usr/lib/haxe/lib/thx,csv/0,2,0/src/thx/csv/Csv.hx"
		thx.csv.Csv.encodeOptions = new haxe.lang.DynamicObject(new java.lang.String[]{"delimiter", "escapedQuote", "newline", "quote"}, new java.lang.Object[]{",", "\"\"", "\n", "\""}, new java.lang.String[]{}, new double[]{});
		//line 10 "/usr/lib/haxe/lib/thx,csv/0,2,0/src/thx/csv/Csv.hx"
		thx.csv.Csv.decodeOptions = new haxe.lang.DynamicObject(new java.lang.String[]{"delimiter", "escapedQuote", "quote", "trimEmptyLines", "trimValues"}, new java.lang.Object[]{",", "\"\"", "\"", true, false}, new java.lang.String[]{}, new double[]{});
	}
	
	public Csv(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Csv()
	{
		//line 3 "/usr/lib/haxe/lib/thx,csv/0,2,0/src/thx/csv/Csv.hx"
		thx.csv.Csv.__hx_ctor_thx_csv_Csv(this);
	}
	
	
	public static void __hx_ctor_thx_csv_Csv(thx.csv.Csv __temp_me113)
	{
	}
	
	
	public static java.lang.Object encodeOptions;
	
	public static java.lang.Object decodeOptions;
	
	public static haxe.root.Array<haxe.root.Array<java.lang.String>> decode(java.lang.String csv)
	{
		//line 18 "/usr/lib/haxe/lib/thx,csv/0,2,0/src/thx/csv/Csv.hx"
		return thx.csv.Dsv.decode(csv, thx.csv.Csv.decodeOptions);
	}
	
	
	public static haxe.root.Array<java.lang.Object> decodeObjects(java.lang.String csv)
	{
		//line 21 "/usr/lib/haxe/lib/thx,csv/0,2,0/src/thx/csv/Csv.hx"
		return thx.csv.Dsv.arrayToObjects(thx.csv.Dsv.decode(csv, thx.csv.Csv.decodeOptions));
	}
	
	
	public static java.lang.String encode(haxe.root.Array<haxe.root.Array<java.lang.String>> data)
	{
		//line 24 "/usr/lib/haxe/lib/thx,csv/0,2,0/src/thx/csv/Csv.hx"
		return thx.csv.Dsv.encode(data, thx.csv.Csv.encodeOptions);
	}
	
	
	public static java.lang.String encodeObjects(haxe.root.Array<java.lang.Object> data)
	{
		//line 27 "/usr/lib/haxe/lib/thx,csv/0,2,0/src/thx/csv/Csv.hx"
		return thx.csv.Dsv.encodeObjects(data, thx.csv.Csv.encodeOptions);
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 3 "/usr/lib/haxe/lib/thx,csv/0,2,0/src/thx/csv/Csv.hx"
		return new thx.csv.Csv(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 3 "/usr/lib/haxe/lib/thx,csv/0,2,0/src/thx/csv/Csv.hx"
		return new thx.csv.Csv();
	}
	
	
}

