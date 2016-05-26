// Generated by Haxe 3.3.0
package utest.ui.common;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class PackageResult extends haxe.lang.HxObject
{
	public PackageResult(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public PackageResult(java.lang.String packageName)
	{
		//line 13 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		utest.ui.common.PackageResult.__hx_ctor_utest_ui_common_PackageResult(this, packageName);
	}
	
	
	public static void __hx_ctor_utest_ui_common_PackageResult(utest.ui.common.PackageResult __temp_me267, java.lang.String packageName)
	{
		//line 14 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		__temp_me267.packageName = packageName;
		//line 15 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		__temp_me267.classes = new haxe.ds.StringMap<utest.ui.common.ClassResult>();
		//line 16 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		__temp_me267.packages = new haxe.ds.StringMap<utest.ui.common.PackageResult>();
		//line 17 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		__temp_me267.stats = new utest.ui.common.ResultStats();
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		return new utest.ui.common.PackageResult(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		return new utest.ui.common.PackageResult(haxe.lang.Runtime.toString(arr.__get(0)));
	}
	
	
	public java.lang.String packageName;
	
	public haxe.ds.StringMap<utest.ui.common.ClassResult> classes;
	
	public haxe.ds.StringMap<utest.ui.common.PackageResult> packages;
	
	public utest.ui.common.ResultStats stats;
	
	public void addResult(utest.TestResult result, boolean flattenPackage)
	{
		//line 21 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		utest.ui.common.PackageResult pack = this.getOrCreatePackage(result.pack, flattenPackage, this);
		//line 22 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		utest.ui.common.ClassResult cls = this.getOrCreateClass(pack, result.cls, result.setup, result.teardown);
		//line 23 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		utest.ui.common.FixtureResult fix = this.createFixture(result.method, result.assertations);
		//line 24 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		cls.add(fix);
	}
	
	
	public void addClass(utest.ui.common.ClassResult result)
	{
		//line 28 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		this.classes.set(result.className, result);
		//line 29 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		this.stats.wire(result.stats);
	}
	
	
	public void addPackage(utest.ui.common.PackageResult result)
	{
		//line 33 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		this.packages.set(result.packageName, result);
		//line 34 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		this.stats.wire(result.stats);
	}
	
	
	public boolean existsPackage(java.lang.String name)
	{
		//line 38 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		return this.packages.exists(name);
	}
	
	
	public boolean existsClass(java.lang.String name)
	{
		//line 42 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		return this.classes.exists(name);
	}
	
	
	public utest.ui.common.PackageResult getPackage(java.lang.String name)
	{
		//line 46 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		if (( ( this.packageName == null ) && haxe.lang.Runtime.valEq(name, "") )) 
		{
			//line 46 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
			return this;
		}
		
		//line 47 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		return ((utest.ui.common.PackageResult) (this.packages.get(name)) );
	}
	
	
	public utest.ui.common.ClassResult getClass(java.lang.String name)
	{
		//line 51 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		return ((utest.ui.common.ClassResult) (this.classes.get(name)) );
	}
	
	
	public haxe.root.Array<java.lang.String> classNames(java.lang.Object errorsHavePriority)
	{
		//line 54 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		boolean __temp_errorsHavePriority265 = ( (haxe.lang.Runtime.eq(errorsHavePriority, null)) ? (true) : (haxe.lang.Runtime.toBool(errorsHavePriority)) );
		//line 55 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		haxe.root.Array<java.lang.String> names = new haxe.root.Array<java.lang.String>(new java.lang.String[]{});
		//line 56 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		{
			//line 56 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
			java.lang.Object tmp = this.classes.keys();
			//line 56 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
			while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(tmp, "hasNext", null)))
			{
				//line 56 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
				java.lang.String name = haxe.lang.Runtime.toString(haxe.lang.Runtime.callField(tmp, "next", null));
				//line 57 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
				names.push(name);
			}
			
		}
		
		//line 58 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		if (__temp_errorsHavePriority265) 
		{
			//line 59 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
			utest.ui.common.PackageResult me = this;
			//line 60 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
			names.sort(new utest.ui.common.PackageResult_classNames_60__Fun(me));
		}
		else
		{
			//line 80 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
			names.sort(( (( utest.ui.common.PackageResult_classNames_80__Fun.__hx_current != null )) ? (utest.ui.common.PackageResult_classNames_80__Fun.__hx_current) : (utest.ui.common.PackageResult_classNames_80__Fun.__hx_current = ((utest.ui.common.PackageResult_classNames_80__Fun) (new utest.ui.common.PackageResult_classNames_80__Fun()) )) ));
		}
		
		//line 84 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		return names;
	}
	
	
	public haxe.root.Array<java.lang.String> packageNames(java.lang.Object errorsHavePriority)
	{
		//line 87 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		boolean __temp_errorsHavePriority266 = ( (haxe.lang.Runtime.eq(errorsHavePriority, null)) ? (true) : (haxe.lang.Runtime.toBool(errorsHavePriority)) );
		//line 88 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		haxe.root.Array<java.lang.String> names = new haxe.root.Array<java.lang.String>(new java.lang.String[]{});
		//line 89 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		if (( this.packageName == null )) 
		{
			//line 89 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
			names.push("");
		}
		
		//line 90 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		{
			//line 90 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
			java.lang.Object tmp = this.packages.keys();
			//line 90 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
			while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(tmp, "hasNext", null)))
			{
				//line 90 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
				java.lang.String name = haxe.lang.Runtime.toString(haxe.lang.Runtime.callField(tmp, "next", null));
				//line 91 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
				names.push(name);
			}
			
		}
		
		//line 92 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		if (__temp_errorsHavePriority266) 
		{
			//line 93 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
			utest.ui.common.PackageResult me = this;
			//line 94 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
			names.sort(new utest.ui.common.PackageResult_packageNames_94__Fun(me));
		}
		else
		{
			//line 114 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
			names.sort(( (( utest.ui.common.PackageResult_packageNames_114__Fun.__hx_current != null )) ? (utest.ui.common.PackageResult_packageNames_114__Fun.__hx_current) : (utest.ui.common.PackageResult_packageNames_114__Fun.__hx_current = ((utest.ui.common.PackageResult_packageNames_114__Fun) (new utest.ui.common.PackageResult_packageNames_114__Fun()) )) ));
		}
		
		//line 118 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		return names;
	}
	
	
	public utest.ui.common.FixtureResult createFixture(java.lang.String method, java.lang.Object assertations)
	{
		//line 122 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		utest.ui.common.FixtureResult f = new utest.ui.common.FixtureResult(haxe.lang.Runtime.toString(method));
		//line 123 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		{
			//line 123 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
			java.lang.Object tmp = ((java.lang.Object) (haxe.lang.Runtime.callField(assertations, "iterator", null)) );
			//line 123 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
			while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(tmp, "hasNext", null)))
			{
				//line 123 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
				utest.Assertation assertation = ((utest.Assertation) (haxe.lang.Runtime.callField(tmp, "next", null)) );
				//line 124 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
				f.add(assertation);
			}
			
		}
		
		//line 125 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		return f;
	}
	
	
	public utest.ui.common.ClassResult getOrCreateClass(utest.ui.common.PackageResult pack, java.lang.String cls, java.lang.String setup, java.lang.String teardown)
	{
		//line 129 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		if (pack.existsClass(cls)) 
		{
			//line 129 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
			return pack.getClass(cls);
		}
		
		//line 130 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		utest.ui.common.ClassResult c = new utest.ui.common.ClassResult(cls, setup, teardown);
		//line 131 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		pack.addClass(c);
		//line 132 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		return c;
	}
	
	
	public utest.ui.common.PackageResult getOrCreatePackage(java.lang.String pack, boolean flat, utest.ui.common.PackageResult ref)
	{
		//line 136 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		if (( ( pack == null ) || haxe.lang.Runtime.valEq(pack, "") )) 
		{
			//line 136 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
			return ref;
		}
		
		//line 137 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		if (flat) 
		{
			//line 138 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
			if (ref.existsPackage(pack)) 
			{
				//line 139 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
				return ref.getPackage(pack);
			}
			
			//line 140 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
			utest.ui.common.PackageResult p = new utest.ui.common.PackageResult(haxe.lang.Runtime.toString(pack));
			//line 141 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
			ref.addPackage(p);
			//line 142 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
			return p;
		}
		else
		{
			//line 144 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
			haxe.root.Array<java.lang.String> parts = haxe.lang.StringExt.split(pack, ".");
			//line 145 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
			{
				//line 145 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
				int _g = 0;
				//line 145 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
				while (( _g < parts.length ))
				{
					//line 145 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					java.lang.String part = parts.__get(_g);
					//line 145 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					 ++ _g;
					//line 146 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					ref = this.getOrCreatePackage(part, true, ref);
				}
				
			}
			
			//line 148 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
			return ref;
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		{
			//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
			switch (field.hashCode())
			{
				case 109757599:
				{
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					if (field.equals("stats")) 
					{
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						__temp_executeDef1 = false;
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						this.stats = ((utest.ui.common.ResultStats) (value) );
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						return value;
					}
					
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					break;
				}
				
				
				case 908759025:
				{
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					if (field.equals("packageName")) 
					{
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						__temp_executeDef1 = false;
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						this.packageName = haxe.lang.Runtime.toString(value);
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						return value;
					}
					
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					break;
				}
				
				
				case 750867693:
				{
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					if (field.equals("packages")) 
					{
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						__temp_executeDef1 = false;
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						this.packages = ((haxe.ds.StringMap<utest.ui.common.PackageResult>) (value) );
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						return value;
					}
					
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					break;
				}
				
				
				case 853620774:
				{
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					if (field.equals("classes")) 
					{
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						__temp_executeDef1 = false;
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						this.classes = ((haxe.ds.StringMap<utest.ui.common.ClassResult>) (value) );
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						return value;
					}
					
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					break;
				}
				
				
			}
			
			//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		{
			//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
			switch (field.hashCode())
			{
				case -189516719:
				{
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					if (field.equals("getOrCreatePackage")) 
					{
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						__temp_executeDef1 = false;
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getOrCreatePackage")) );
					}
					
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					break;
				}
				
				
				case 908759025:
				{
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					if (field.equals("packageName")) 
					{
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						__temp_executeDef1 = false;
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						return this.packageName;
					}
					
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					break;
				}
				
				
				case -642043837:
				{
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					if (field.equals("getOrCreateClass")) 
					{
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						__temp_executeDef1 = false;
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getOrCreateClass")) );
					}
					
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					break;
				}
				
				
				case 853620774:
				{
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					if (field.equals("classes")) 
					{
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						__temp_executeDef1 = false;
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						return this.classes;
					}
					
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					break;
				}
				
				
				case 1403067757:
				{
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					if (field.equals("createFixture")) 
					{
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						__temp_executeDef1 = false;
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "createFixture")) );
					}
					
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					break;
				}
				
				
				case 750867693:
				{
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					if (field.equals("packages")) 
					{
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						__temp_executeDef1 = false;
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						return this.packages;
					}
					
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					break;
				}
				
				
				case -1893241182:
				{
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					if (field.equals("packageNames")) 
					{
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						__temp_executeDef1 = false;
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "packageNames")) );
					}
					
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					break;
				}
				
				
				case 109757599:
				{
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					if (field.equals("stats")) 
					{
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						__temp_executeDef1 = false;
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						return this.stats;
					}
					
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					break;
				}
				
				
				case -306550608:
				{
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					if (field.equals("classNames")) 
					{
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						__temp_executeDef1 = false;
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "classNames")) );
					}
					
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					break;
				}
				
				
				case -41586658:
				{
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					if (field.equals("addResult")) 
					{
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						__temp_executeDef1 = false;
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "addResult")) );
					}
					
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					break;
				}
				
				
				case 1950568386:
				{
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					if (field.equals("getClass")) 
					{
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						__temp_executeDef1 = false;
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getClass")) );
					}
					
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					break;
				}
				
				
				case -1261929129:
				{
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					if (field.equals("addClass")) 
					{
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						__temp_executeDef1 = false;
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "addClass")) );
					}
					
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					break;
				}
				
				
				case 229797904:
				{
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					if (field.equals("getPackage")) 
					{
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						__temp_executeDef1 = false;
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getPackage")) );
					}
					
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					break;
				}
				
				
				case 1101171813:
				{
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					if (field.equals("addPackage")) 
					{
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						__temp_executeDef1 = false;
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "addPackage")) );
					}
					
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					break;
				}
				
				
				case 2069044860:
				{
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					if (field.equals("existsClass")) 
					{
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						__temp_executeDef1 = false;
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "existsClass")) );
					}
					
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					break;
				}
				
				
				case -1878427574:
				{
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					if (field.equals("existsPackage")) 
					{
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						__temp_executeDef1 = false;
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "existsPackage")) );
					}
					
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					break;
				}
				
				
			}
			
			//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		{
			//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
			switch (field.hashCode())
			{
				case -189516719:
				{
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					if (field.equals("getOrCreatePackage")) 
					{
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						__temp_executeDef1 = false;
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						return this.getOrCreatePackage(haxe.lang.Runtime.toString(dynargs.__get(0)), haxe.lang.Runtime.toBool(dynargs.__get(1)), ((utest.ui.common.PackageResult) (dynargs.__get(2)) ));
					}
					
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					break;
				}
				
				
				case -41586658:
				{
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					if (field.equals("addResult")) 
					{
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						__temp_executeDef1 = false;
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						this.addResult(((utest.TestResult) (dynargs.__get(0)) ), haxe.lang.Runtime.toBool(dynargs.__get(1)));
					}
					
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					break;
				}
				
				
				case -642043837:
				{
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					if (field.equals("getOrCreateClass")) 
					{
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						__temp_executeDef1 = false;
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						return this.getOrCreateClass(((utest.ui.common.PackageResult) (dynargs.__get(0)) ), haxe.lang.Runtime.toString(dynargs.__get(1)), haxe.lang.Runtime.toString(dynargs.__get(2)), haxe.lang.Runtime.toString(dynargs.__get(3)));
					}
					
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					break;
				}
				
				
				case -1261929129:
				{
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					if (field.equals("addClass")) 
					{
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						__temp_executeDef1 = false;
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						this.addClass(((utest.ui.common.ClassResult) (dynargs.__get(0)) ));
					}
					
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					break;
				}
				
				
				case 1403067757:
				{
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					if (field.equals("createFixture")) 
					{
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						__temp_executeDef1 = false;
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						return this.createFixture(haxe.lang.Runtime.toString(dynargs.__get(0)), dynargs.__get(1));
					}
					
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					break;
				}
				
				
				case 1101171813:
				{
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					if (field.equals("addPackage")) 
					{
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						__temp_executeDef1 = false;
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						this.addPackage(((utest.ui.common.PackageResult) (dynargs.__get(0)) ));
					}
					
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					break;
				}
				
				
				case -1893241182:
				{
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					if (field.equals("packageNames")) 
					{
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						__temp_executeDef1 = false;
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						return this.packageNames(dynargs.__get(0));
					}
					
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					break;
				}
				
				
				case -1878427574:
				{
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					if (field.equals("existsPackage")) 
					{
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						__temp_executeDef1 = false;
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						return this.existsPackage(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					break;
				}
				
				
				case -306550608:
				{
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					if (field.equals("classNames")) 
					{
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						__temp_executeDef1 = false;
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						return this.classNames(dynargs.__get(0));
					}
					
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					break;
				}
				
				
				case 2069044860:
				{
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					if (field.equals("existsClass")) 
					{
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						__temp_executeDef1 = false;
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						return this.existsClass(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					break;
				}
				
				
				case 1950568386:
				{
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					if (field.equals("getClass")) 
					{
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						__temp_executeDef1 = false;
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						return this.getClass(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					break;
				}
				
				
				case 229797904:
				{
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					if (field.equals("getPackage")) 
					{
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						__temp_executeDef1 = false;
						//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
						return this.getPackage(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
					break;
				}
				
				
			}
			
			//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		baseArr.push("stats");
		//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		baseArr.push("packages");
		//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		baseArr.push("classes");
		//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		baseArr.push("packageName");
		//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
		{
			//line 6 "/usr/lib/haxe/lib/utest/1,4,1/src/utest/ui/common/PackageResult.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


