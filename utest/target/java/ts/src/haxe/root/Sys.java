// Generated by Haxe 3.3.0
package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Sys extends haxe.lang.HxObject
{
	public Sys(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Sys()
	{
		//line 27 "/usr/lib/haxe/std/java/_std/Sys.hx"
		haxe.root.Sys.__hx_ctor__Sys(this);
	}
	
	
	public static void __hx_ctor__Sys(haxe.root.Sys __temp_me13)
	{
	}
	
	
	public static java.lang.String[] _args;
	
	public static haxe.ds.StringMap<java.lang.String> _env;
	
	public static java.lang.String _sysName;
	
	public static void print(java.lang.Object v)
	{
		//line 34 "/usr/lib/haxe/std/java/_std/Sys.hx"
		java.lang.System.out.print(((java.lang.Object) (v) ));
	}
	
	
	public static void println(java.lang.Object v)
	{
		//line 39 "/usr/lib/haxe/std/java/_std/Sys.hx"
		java.lang.System.out.println(((java.lang.Object) (v) ));
	}
	
	
	public static haxe.root.Array<java.lang.String> args()
	{
		//line 44 "/usr/lib/haxe/std/java/_std/Sys.hx"
		if (( haxe.root.Sys._args == null )) 
		{
			//line 45 "/usr/lib/haxe/std/java/_std/Sys.hx"
			return new haxe.root.Array<java.lang.String>(new java.lang.String[]{});
		}
		
		//line 46 "/usr/lib/haxe/std/java/_std/Sys.hx"
		return haxe.java.Lib.array_String(haxe.root.Sys._args);
	}
	
	
	public static java.lang.String getEnv(java.lang.String s)
	{
		//line 51 "/usr/lib/haxe/std/java/_std/Sys.hx"
		return java.lang.System.getenv(haxe.lang.Runtime.toString(s));
	}
	
	
	public static void putEnv(java.lang.String s, java.lang.String v)
	{
		//line 57 "/usr/lib/haxe/std/java/_std/Sys.hx"
		throw haxe.lang.HaxeException.wrap("Not implemented in this platform");
	}
	
	
	public static haxe.ds.StringMap<java.lang.String> environment()
	{
		//line 62 "/usr/lib/haxe/std/java/_std/Sys.hx"
		if (( haxe.root.Sys._env != null )) 
		{
			//line 63 "/usr/lib/haxe/std/java/_std/Sys.hx"
			return ((haxe.ds.StringMap<java.lang.String>) (haxe.root.Sys._env) );
		}
		
		//line 64 "/usr/lib/haxe/std/java/_std/Sys.hx"
		haxe.ds.StringMap<java.lang.String> _env = haxe.root.Sys._env = new haxe.ds.StringMap<java.lang.String>();
		//line 65 "/usr/lib/haxe/std/java/_std/Sys.hx"
		{
			//line 65 "/usr/lib/haxe/std/java/_std/Sys.hx"
			java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> tmp = java.lang.System.getenv().entrySet().iterator();
			//line 65 "/usr/lib/haxe/std/java/_std/Sys.hx"
			while (tmp.hasNext())
			{
				//line 65 "/usr/lib/haxe/std/java/_std/Sys.hx"
				java.util.Map.Entry<java.lang.String, java.lang.String> mv = tmp.next();
				//line 67 "/usr/lib/haxe/std/java/_std/Sys.hx"
				_env.set(mv.getKey(), mv.getValue());
			}
			
		}
		
		//line 70 "/usr/lib/haxe/std/java/_std/Sys.hx"
		return ((haxe.ds.StringMap<java.lang.String>) (_env) );
	}
	
	
	public static void sleep(double seconds)
	{
		//line 76 "/usr/lib/haxe/std/java/_std/Sys.hx"
		try 
		{
			//line 76 "/usr/lib/haxe/std/java/_std/Sys.hx"
			java.lang.Thread.sleep(((long) (( seconds * 1000 )) ));
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 76 "/usr/lib/haxe/std/java/_std/Sys.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 78 "/usr/lib/haxe/std/java/_std/Sys.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 78 "/usr/lib/haxe/std/java/_std/Sys.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 78 "/usr/lib/haxe/std/java/_std/Sys.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 78 "/usr/lib/haxe/std/java/_std/Sys.hx"
			{
				//line 78 "/usr/lib/haxe/std/java/_std/Sys.hx"
				java.lang.Object e = __temp_catchall2;
				//line 78 "/usr/lib/haxe/std/java/_std/Sys.hx"
				throw haxe.lang.HaxeException.wrap(e);
			}
			
		}
		
		
	}
	
	
	public static boolean setTimeLocale(java.lang.String loc)
	{
		//line 83 "/usr/lib/haxe/std/java/_std/Sys.hx"
		return false;
	}
	
	
	public static java.lang.String getCwd()
	{
		//line 88 "/usr/lib/haxe/std/java/_std/Sys.hx"
		return haxe.lang.StringExt.substr(new java.io.File(haxe.lang.Runtime.toString(".")).getAbsolutePath(), 0, -1);
	}
	
	
	public static void setCwd(java.lang.String s)
	{
		//line 94 "/usr/lib/haxe/std/java/_std/Sys.hx"
		throw haxe.lang.HaxeException.wrap("not implemented");
	}
	
	
	public static java.lang.String systemName()
	{
		//line 99 "/usr/lib/haxe/std/java/_std/Sys.hx"
		if (( haxe.root.Sys._sysName != null )) 
		{
			//line 99 "/usr/lib/haxe/std/java/_std/Sys.hx"
			return haxe.root.Sys._sysName;
		}
		
		//line 100 "/usr/lib/haxe/std/java/_std/Sys.hx"
		java.lang.String sname = java.lang.System.getProperty(haxe.lang.Runtime.toString("os.name")).toLowerCase();
		//line 101 "/usr/lib/haxe/std/java/_std/Sys.hx"
		if (( haxe.lang.StringExt.indexOf(sname, "win", null) >= 0 )) 
		{
			//line 102 "/usr/lib/haxe/std/java/_std/Sys.hx"
			return haxe.root.Sys._sysName = "Windows";
		}
		
		//line 103 "/usr/lib/haxe/std/java/_std/Sys.hx"
		if (( haxe.lang.StringExt.indexOf(sname, "mac", null) >= 0 )) 
		{
			//line 104 "/usr/lib/haxe/std/java/_std/Sys.hx"
			return haxe.root.Sys._sysName = "Mac";
		}
		
		//line 105 "/usr/lib/haxe/std/java/_std/Sys.hx"
		if (( haxe.lang.StringExt.indexOf(sname, "nux", null) >= 0 )) 
		{
			//line 106 "/usr/lib/haxe/std/java/_std/Sys.hx"
			return haxe.root.Sys._sysName = "Linux";
		}
		
		//line 107 "/usr/lib/haxe/std/java/_std/Sys.hx"
		if (( haxe.lang.StringExt.indexOf(sname, "nix", null) >= 0 )) 
		{
			//line 108 "/usr/lib/haxe/std/java/_std/Sys.hx"
			return haxe.root.Sys._sysName = "BSD";
		}
		
		//line 110 "/usr/lib/haxe/std/java/_std/Sys.hx"
		return haxe.root.Sys._sysName = java.lang.System.getProperty(haxe.lang.Runtime.toString("os.name"));
	}
	
	
	public static int command(java.lang.String cmd, haxe.root.Array<java.lang.String> args)
	{
		//line 114 "/usr/lib/haxe/std/java/_std/Sys.hx"
		try 
		{
			//line 115 "/usr/lib/haxe/std/java/_std/Sys.hx"
			java.lang.ProcessBuilder pb = sys.io.Process.createProcessBuilder(cmd, args);
			//line 117 "/usr/lib/haxe/std/java/_std/Sys.hx"
			pb.redirectErrorStream(((boolean) (true) ));
			//line 122 "/usr/lib/haxe/std/java/_std/Sys.hx"
			java.lang.Process proc = pb.start();
			//line 124 "/usr/lib/haxe/std/java/_std/Sys.hx"
			haxe.java.io.NativeInput reader = new haxe.java.io.NativeInput(((java.io.InputStream) (proc.getInputStream()) ));
			//line 127 "/usr/lib/haxe/std/java/_std/Sys.hx"
			try 
			{
				//line 127 "/usr/lib/haxe/std/java/_std/Sys.hx"
				while (true)
				{
					//line 128 "/usr/lib/haxe/std/java/_std/Sys.hx"
					java.lang.String ln = reader.readLine();
					//line 129 "/usr/lib/haxe/std/java/_std/Sys.hx"
					java.lang.System.out.println(((java.lang.Object) (ln) ));
				}
				
			}
			catch (java.lang.Throwable __temp_catchallException1)
			{
				//line 127 "/usr/lib/haxe/std/java/_std/Sys.hx"
				haxe.lang.Exceptions.setException(__temp_catchallException1);
				//line 132 "/usr/lib/haxe/std/java/_std/Sys.hx"
				java.lang.Object __temp_catchall2 = __temp_catchallException1;
				//line 132 "/usr/lib/haxe/std/java/_std/Sys.hx"
				if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
				{
					//line 132 "/usr/lib/haxe/std/java/_std/Sys.hx"
					__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
				}
				
				//line 132 "/usr/lib/haxe/std/java/_std/Sys.hx"
				if (( __temp_catchall2 instanceof haxe.io.Eof )) 
				{
					//line 132 "/usr/lib/haxe/std/java/_std/Sys.hx"
					haxe.io.Eof e = ((haxe.io.Eof) (__temp_catchall2) );
					//line 132 "/usr/lib/haxe/std/java/_std/Sys.hx"
					{
					}
					
				}
				else
				{
					//line 132 "/usr/lib/haxe/std/java/_std/Sys.hx"
					throw haxe.lang.HaxeException.wrap(__temp_catchallException1);
				}
				
			}
			
			
			//line 134 "/usr/lib/haxe/std/java/_std/Sys.hx"
			proc.waitFor();
			//line 135 "/usr/lib/haxe/std/java/_std/Sys.hx"
			int exitCode = proc.exitValue();
			//line 136 "/usr/lib/haxe/std/java/_std/Sys.hx"
			proc.destroy();
			//line 137 "/usr/lib/haxe/std/java/_std/Sys.hx"
			return exitCode;
		}
		catch (java.lang.Throwable typedException)
		{
			//line 113 "/usr/lib/haxe/std/java/_std/Sys.hx"
			throw haxe.lang.HaxeException.wrap(typedException);
		}
		
		
	}
	
	
	public static void exit(int code)
	{
		//line 142 "/usr/lib/haxe/std/java/_std/Sys.hx"
		java.lang.System.exit(((int) (code) ));
	}
	
	
	public static double time()
	{
		//line 147 "/usr/lib/haxe/std/java/_std/Sys.hx"
		return ((double) (((long) (( ((long) (java.lang.System.currentTimeMillis()) ) / ((long) (1000) ) )) )) );
	}
	
	
	public static double cpuTime()
	{
		//line 152 "/usr/lib/haxe/std/java/_std/Sys.hx"
		return ( ((double) (java.lang.System.nanoTime()) ) / 1000000000 );
	}
	
	
	public static java.lang.String executablePath()
	{
		//line 157 "/usr/lib/haxe/std/java/_std/Sys.hx"
		return haxe.root.Sys.getCwd();
	}
	
	
	public static java.lang.String programPath()
	{
		//line 161 "/usr/lib/haxe/std/java/_std/Sys.hx"
		try 
		{
			//line 161 "/usr/lib/haxe/std/java/_std/Sys.hx"
			return ((java.lang.Class) (((java.lang.Class) (haxe.root.Sys.class) )) ).getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
		}
		catch (java.lang.Throwable typedException)
		{
			//line 160 "/usr/lib/haxe/std/java/_std/Sys.hx"
			throw haxe.lang.HaxeException.wrap(typedException);
		}
		
		
	}
	
	
	public static int getChar(boolean echo)
	{
		//line 170 "/usr/lib/haxe/std/java/_std/Sys.hx"
		throw haxe.lang.HaxeException.wrap("Not implemented");
	}
	
	
	public static haxe.io.Input stdin()
	{
		//line 175 "/usr/lib/haxe/std/java/_std/Sys.hx"
		java.io.InputStream _in = ((java.io.InputStream) (haxe.lang.Runtime.getField(java.lang.System.class, "in", false)) );
		//line 176 "/usr/lib/haxe/std/java/_std/Sys.hx"
		return new haxe.java.io.NativeInput(((java.io.InputStream) (_in) ));
	}
	
	
	public static haxe.io.Output stdout()
	{
		//line 181 "/usr/lib/haxe/std/java/_std/Sys.hx"
		return new haxe.java.io.NativeOutput(((java.io.OutputStream) (java.lang.System.out) ));
	}
	
	
	public static haxe.io.Output stderr()
	{
		//line 186 "/usr/lib/haxe/std/java/_std/Sys.hx"
		return new haxe.java.io.NativeOutput(((java.io.OutputStream) (java.lang.System.err) ));
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 27 "/usr/lib/haxe/std/java/_std/Sys.hx"
		return new haxe.root.Sys(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 27 "/usr/lib/haxe/std/java/_std/Sys.hx"
		return new haxe.root.Sys();
	}
	
	
}


