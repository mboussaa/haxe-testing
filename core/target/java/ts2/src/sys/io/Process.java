// Generated by Haxe 3.3.0
package sys.io;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Process extends haxe.lang.HxObject
{
	public Process(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Process()
	{
		//line 31 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
		sys.io.Process.__hx_ctor_sys_io_Process(this);
	}
	
	
	public static void __hx_ctor_sys_io_Process(sys.io.Process __temp_me31)
	{
	}
	
	
	public static java.lang.ProcessBuilder createProcessBuilder(java.lang.String cmd, haxe.root.Array<java.lang.String> args)
	{
		//line 40 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
		java.lang.String sysName = haxe.root.Sys.systemName();
		//line 41 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
		java.lang.String[] pargs = null;
		//line 42 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
		if (( args == null )) 
		{
			//line 43 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
			java.lang.String cmdStr = cmd;
			//line 44 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
			{
				//line 44 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
				java.lang.String __temp_svar1 = (sysName);
				//line 44 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
				boolean __temp_executeDef2 = true;
				//line 44 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
				switch (__temp_svar1.hashCode())
				{
					case -1280820637:
					{
						//line 44 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
						if (__temp_svar1.equals("Windows")) 
						{
							//line 44 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
							__temp_executeDef2 = false;
							//line 46 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
							pargs = new java.lang.String[3];
							//line 47 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
							java.lang.String _g = haxe.root.Sys.getEnv("COMSPEC");
							//line 48 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
							if (( _g == null )) 
							{
								//line 48 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
								cmd = "cmd.exe";
							}
							else
							{
								//line 49 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
								cmd = _g;
							}
							
							//line 47 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
							pargs[0] = cmd;
							//line 51 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
							pargs[1] = "/C";
							//line 52 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
							pargs[2] = ( ( "\"" + cmdStr ) + "\"" );
						}
						
						//line 44 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
						break;
					}
					
					
				}
				
				//line 53 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
				if (__temp_executeDef2) 
				{
					//line 54 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
					pargs = new java.lang.String[3];
					//line 55 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
					cmd = "/bin/sh";
					//line 55 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
					pargs[0] = "/bin/sh";
					//line 56 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
					pargs[1] = "-c";
					//line 57 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
					pargs[2] = cmdStr;
				}
				
			}
			
		}
		else
		{
			//line 60 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
			pargs = new java.lang.String[( args.length + 1 )];
			//line 61 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
			{
				//line 61 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
				java.lang.String __temp_svar3 = (sysName);
				//line 61 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
				boolean __temp_executeDef4 = true;
				//line 61 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
				switch (__temp_svar3.hashCode())
				{
					case -1280820637:
					{
						//line 61 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
						if (__temp_svar3.equals("Windows")) 
						{
							//line 61 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
							__temp_executeDef4 = false;
							//line 63 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
							pargs[0] = haxe.root.StringTools.quoteWinArg(cmd, false);
							//line 64 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
							{
								//line 64 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
								int _g1 = 0;
								//line 64 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
								int _g2 = args.length;
								//line 64 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
								while (( _g1 < _g2 ))
								{
									//line 64 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
									int i = _g1++;
									//line 66 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
									pargs[( i + 1 )] = haxe.root.StringTools.quoteWinArg(args.__get(i), false);
								}
								
							}
							
						}
						
						//line 61 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
						break;
					}
					
					
				}
				
				//line 68 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
				if (__temp_executeDef4) 
				{
					//line 69 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
					pargs[0] = cmd;
					//line 70 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
					{
						//line 70 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
						int _g11 = 0;
						//line 70 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
						int _g3 = args.length;
						//line 70 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
						while (( _g11 < _g3 ))
						{
							//line 70 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
							int i1 = _g11++;
							//line 72 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
							pargs[( i1 + 1 )] = args.__get(i1);
						}
						
					}
					
				}
				
			}
			
		}
		
		//line 77 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
		return new java.lang.ProcessBuilder(((java.lang.String[]) (pargs) ));
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 31 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
		return new sys.io.Process(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 31 "/usr/lib/haxe/std/java/_std/sys/io/Process.hx"
		return new sys.io.Process();
	}
	
	
}


