// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace haxe.lang {
	public sealed class FieldLookup {
		
		#pragma warning disable 628
		static FieldLookup() {
			global::haxe.lang.FieldLookup.length = ( global::haxe.lang.FieldLookup.fieldIds as global::System.Array ).Length;
		}
		
		
		public FieldLookup() {
		}
		
		
		protected static int[] fieldIds = new int[]{98, 102, 104, 105, 107, 109, 113, 116, 120, 21233, 21234, 21235, 21236, 21237, 21238, 1821933, 4745537, 4846113, 4849249, 4947370, 4949376, 5144726, 5193562, 5246191, 5343647, 5393365, 5442204, 5594513, 5594516, 5695307, 5741474, 5745035, 24046298, 26061316, 39622016, 42740551, 43435420, 52644165, 57219237, 63559312, 67859554, 67859999, 69718249, 72452854, 74822897, 76061764, 78447857, 87367608, 96903864, 99632527, 103479213, 109574339, 116192081, 142301684, 142895325, 143865495, 156956385, 159136996, 160217260, 212244564, 222029606, 240155668, 244830897, 265544154, 270118404, 286437776, 288025444, 288368849, 302437830, 302979532, 307312293, 314003042, 328878574, 334695532, 359333139, 399964207, 407283053, 409871691, 414504008, 418482770, 432527390, 432527391, 437335495, 440996547, 451001976, 452737314, 478746067, 480756972, 482248426, 484018937, 501039929, 506461556, 509857466, 520590566, 528448451, 530261339, 563316893, 596483356, 596496232, 623100778, 625308696, 641357653, 641535602, 674203586, 691754853, 724060212, 735026061, 735461151, 767112783, 815911746, 834174833, 843587180, 845339077, 872071561, 887574448, 891567758, 897845290, 910198946, 922671056, 927738905, 934297389, 946786476, 952638546, 959399230, 961866285, 971992536, 985194240, 992442663, 993950564, 995006396, 999967216, 1002257126, 1046660463, 1067353468, 1071652316, 1072885311, 1084792286, 1091627025, 1099121107, 1102421591, 1103412149, 1111933837, 1113806382, 1114501250, 1126920507, 1152408707, 1154932936, 1155848147, 1158359328, 1170141094, 1170195731, 1171632074, 1172057283, 1180350949, 1181037546, 1191633396, 1202718727, 1202920542, 1204816148, 1213952397, 1224901875, 1225397154, 1232990044, 1245800482, 1246877401, 1246881189, 1247723251, 1247875320, 1247875546, 1269755426, 1271070480, 1273207865, 1275922997, 1280345457, 1280549057, 1280845662, 1281091404, 1281093634, 1282943179, 1291299698, 1313416818, 1324905541, 1329111435, 1352786672, 1357975336, 1365803947, 1395555037, 1413779326, 1428431209, 1428901784, 1429408506, 1429887281, 1447008734, 1457436259, 1492589217, 1503837296, 1504438184, 1516540973, 1531583505, 1532710347, 1537812987, 1547539107, 1548166113, 1553877950, 1568593144, 1604324540, 1620824029, 1621420777, 1622659719, 1623148745, 1639293562, 1640272491, 1648581351, 1669413332, 1675742188, 1692511090, 1705629508, 1715176908, 1723805383, 1768164316, 1768548618, 1771130534, 1781145963, 1800886518, 1801622666, 1802291657, 1804873517, 1813879407, 1825405726, 1830310359, 1861441745, 1864494649, 1867552145, 1870897157, 1891834246, 1894671199, 1914813385, 1915412854, 1916009602, 1926178603, 1932118984, 1981972957, 2014410004, 2022294396, 2025055113, 2048392659, 2049945213, 2082663554, 2084789794, 2113364337, 2123232567, 2127021138, 2140014923, 2143813817};
		
		protected static string[] fields = new string[]{"b", "f", "h", "i", "k", "m", "q", "t", "x", "_0", "_1", "_2", "_3", "_4", "_5", "isGlobal", "__a", "add", "arr", "cls", "cur", "get", "has", "int", "key", "len", "map", "pop", "pos", "run", "set", "sum", "split", "teardown", "compareTo", "flags", "float", "match", "compare", "addSuccesses", "start", "stats", "failures", "executeMethod", "successes", "remove", "packageName", "filter", "merge", "startTime", "progress", "hasSetup", "target", "resize", "result", "warnings", "method", "matched", "addErrors", "newline", "setLoop", "stackToString", "compareArg", "append", "onPrecheck", "getPackage", "assertations", "string", "_trace", "methodName", "hasErrors", "packageNames", "iterator", "indent", "lastIndexOf", "totals", "hasNext", "onAddFailures", "setHandler", "innerError", "testSequence1", "testSequence2", "message", "onStart", "keysLoop", "reverse", "expireson", "nOccupied", "onTestComplete", "onAddWarnings", "insert", "dumpStack", "dispatch", "length", "getTime", "addAsync", "allOk", "balance", "setupName", "hasTeardownError", "nextRun", "displaySuccessResults", "methods", "getClass", "addPackage", "replace", "onAddErrors", "setTimeout", "onAddSuccesses", "onTimeout", "value", "asyncStack", "precheck", "aggregator", "onTested", "addHeader", "addFailures", "compareArgs", "cachedIndex", "checkTested", "globalPattern", "toString", "testFloatBoundaries", "identity", "packages", "addWarnings", "getResults", "methodNames", "priority", "hashes", "runner", "hasAsyncError", "displayHeader", "splice", "exists", "equals", "addResult", "base", "getFixture", "addClass", "copy", "bindHandler", "date", "done", "matchSub", "upperMatch", "removeLoop", "minBinding", "head", "isOk", "item", "handler", "getOrCreateClass", "testIntBoundaries", "join", "keys", "left", "list", "concat", "clear", "next", "noop", "hasTestError", "flattenPackage", "pack", "path", "prev", "pure", "push", "root", "matchedPos", "current", "execute", "seed", "size", "sort", "step", "stop", "quicksort", "recursive", "vals", "wire", "completed", "spliceVoid", "zero", "errors", "cachedKey", "hasTeardown", "handlers", "stackItems", "equality", "tested", "runNext", "hasFailures", "timeout", "classNames", "addFixture", "createFixture", "hasWarnings", "concatNative", "nBuckets", "className", "hasTimeoutError", "runFixture", "onComplete", "existsClass", "__unsafe_get", "__unsafe_set", "indents", "indexOf", "lookup", "isMethod", "fileName", "unbindHandler", "onProgress", "iteratorLoop", "toDynamic", "testLessThan", "regex", "right", "existsPackage", "classes", "__hx_constructs", "results", "fixtures", "checkMethod", "getClassName", "teardownName", "unwire", "customParams", "getOrCreatePackage", "addEvent", "onTestStart", "hasSetupError", "_height", "getPosition", "fixture", "__get", "__set", "testComplete", "error", "lineNumber", "subtract", "upperBound", "unshift", "_keys", "setup", "shift", "__hx_createEmpty", "addCase", "removeMinBinding", "slice", "_handler", "complete"};
		
		protected static int length;
		
		public static void addFields(int[] nids, string[] nfields) {
			unchecked {
				int[] cids = global::haxe.lang.FieldLookup.fieldIds;
				string[] cfields = global::haxe.lang.FieldLookup.fields;
				int nlen = ( nids as global::System.Array ).Length;
				int clen = global::haxe.lang.FieldLookup.length;
				if (( ( nfields as global::System.Array ).Length != nlen )) {
					throw global::haxe.lang.HaxeException.wrap(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("Different fields length: ", global::haxe.lang.Runtime.toString(nlen)), " and "), global::haxe.lang.Runtime.toString(( nfields as global::System.Array ).Length)));
				}
				
				bool needsChange = false;
				{
					int[] _g_arr = nids;
					uint _g_idx = ((uint) (0) );
					while (((bool) (( _g_idx < ( _g_arr as global::System.Array ).Length )) )) {
						if (( global::haxe.lang.FieldLookup.findHash(((int) (_g_arr[((int) (_g_idx++) )]) ), cids, clen) < 0 )) {
							needsChange = true;
							break;
						}
						
					}
					
				}
				
				if (needsChange) {
					lock(typeof(global::haxe.lang.FieldLookup)){
						int[] ansIds = new int[( clen + nlen )];
						string[] ansFields = new string[( clen + nlen )];
						int ci = 0;
						int ni = 0;
						int ansi = 0;
						while (true) {
							if ( ! ((( ( ci < clen ) && ( ni < nlen ) ))) ) {
								break;
							}
							
							if (( cids[ci] < nids[ni] )) {
								ansIds[ansi] = cids[ci];
								ansFields[ansi] = cfields[ci];
								ci = ( ci + 1 );
							}
							else {
								ansIds[ansi] = nids[ni];
								ansFields[ansi] = nfields[ni];
								ni = ( ni + 1 );
							}
							
							ansi = ( ansi + 1 );
						}
						
						if (( ci < clen )) {
							global::System.Array.Copy(((global::System.Array) (cids) ), ((int) (ci) ), ((global::System.Array) (ansIds) ), ((int) (ansi) ), ((int) (( clen - ci )) ));
							global::System.Array.Copy(((global::System.Array) (cfields) ), ((int) (ci) ), ((global::System.Array) (ansFields) ), ((int) (ansi) ), ((int) (( clen - ci )) ));
							ansi = ( ansi + (( clen - ci )) );
						}
						
						if (( ni < nlen )) {
							global::System.Array.Copy(((global::System.Array) (nids) ), ((int) (ni) ), ((global::System.Array) (ansIds) ), ((int) (ansi) ), ((int) (( nlen - ni )) ));
							global::System.Array.Copy(((global::System.Array) (nfields) ), ((int) (ni) ), ((global::System.Array) (ansFields) ), ((int) (ansi) ), ((int) (( nlen - ni )) ));
							ansi = ( ansi + (( nlen - ni )) );
						}
						
						global::haxe.lang.FieldLookup.fieldIds = ansIds;
						global::haxe.lang.FieldLookup.fields = ansFields;
						global::haxe.lang.FieldLookup.length = ansi;
					}
					;
				}
				
			}
		}
		
		
		public static int doHash(string s) {
			unchecked {
				int acc = 0;
				{
					int _g1 = 0;
					int _g = s.Length;
					while (( _g1 < _g )) {
						acc = ( ( ( 223 * (( acc >> 1 )) ) + ((int) (s[_g1++]) ) ) << 1 );
					}
					
				}
				
				return ((int) (( ((uint) (acc) ) >> 1 )) );
			}
		}
		
		
		public static string lookupHash(int key) {
			unchecked {
				int[] ids = global::haxe.lang.FieldLookup.fieldIds;
				int min = 0;
				int max = global::haxe.lang.FieldLookup.length;
				while (( min < max )) {
					int mid = ( min + ((int) (( (( max - min )) / 2 )) ) );
					int imid = ids[mid];
					if (( key < imid )) {
						max = mid;
					}
					else if (( key > imid )) {
						min = ( mid + 1 );
					}
					else {
						return global::haxe.lang.FieldLookup.fields[mid];
					}
					
				}
				
				throw global::haxe.lang.HaxeException.wrap(global::haxe.lang.Runtime.concat("Field not found for hash ", global::haxe.lang.Runtime.toString(key)));
			}
		}
		
		
		public static int hash(string s) {
			unchecked {
				if (string.Equals(s, null)) {
					return 0;
				}
				
				int acc = 0;
				{
					int _g1 = 0;
					int _g = s.Length;
					while (( _g1 < _g )) {
						acc = ( ( ( 223 * (( acc >> 1 )) ) + ((int) (s[_g1++]) ) ) << 1 );
					}
					
				}
				
				int key = ((int) (( ((uint) (acc) ) >> 1 )) );
				int[] ids = global::haxe.lang.FieldLookup.fieldIds;
				string[] fld = global::haxe.lang.FieldLookup.fields;
				int min = 0;
				int max = global::haxe.lang.FieldLookup.length;
				int len = global::haxe.lang.FieldLookup.length;
				while (( min < max )) {
					int mid = ((int) (( min + ( ((double) ((( max - min ))) ) / 2 ) )) );
					int imid = ids[mid];
					if (( key < imid )) {
						max = mid;
					}
					else if (( key > imid )) {
						min = ( mid + 1 );
					}
					else {
						if ( ! (string.Equals(fld[mid], s)) ) {
							return  ~ (key) ;
						}
						
						return key;
					}
					
				}
				
				lock(typeof(global::haxe.lang.FieldLookup)){
					if (( len != global::haxe.lang.FieldLookup.length )) {
						return global::haxe.lang.FieldLookup.hash(s);
					}
					
					global::haxe.lang.FieldLookup.insert<int>(ref global::haxe.lang.FieldLookup.fieldIds, ((int) (global::haxe.lang.FieldLookup.length) ), ((int) (min) ), ((int) (key) ));
					global::haxe.lang.FieldLookup.insert<string>(ref global::haxe.lang.FieldLookup.fields, ((int) (global::haxe.lang.FieldLookup.length) ), ((int) (min) ), ((string) (s) ));
					 ++ global::haxe.lang.FieldLookup.length;
				}
				;
				return key;
			}
		}
		
		
		public static int findHash(int hash, int[] hashs, int length) {
			unchecked {
				int min = 0;
				int max = length;
				while (( min < max )) {
					int mid = ((int) (( (( max + min )) / 2 )) );
					int imid = hashs[mid];
					if (( hash < imid )) {
						max = mid;
					}
					else if (( hash > imid )) {
						min = ( mid + 1 );
					}
					else {
						return mid;
					}
					
				}
				
				return  ~ (min) ;
			}
		}
		
		
		public static void @remove<T>(T[] a, int length, int pos) {
			unchecked {
				global::System.Array.Copy(((global::System.Array) (a) ), ((int) (( pos + 1 )) ), ((global::System.Array) (a) ), ((int) (pos) ), ((int) (( ( length - pos ) - 1 )) ));
				a[( length - 1 )] = default(T);
			}
		}
		
		
		public static void insert<T>(ref T[] a, int length, int pos, T x) {
			unchecked {
				int capacity = ( a as global::System.Array ).Length;
				if (( pos == length )) {
					if (( capacity == length )) {
						T[] newarr = new T[( (( length << 1 )) + 1 )];
						( a as global::System.Array ).CopyTo(((global::System.Array) (newarr) ), ((int) (0) ));
						a = ((T[]) (newarr) );
					}
					
				}
				else if (( pos == 0 )) {
					if (( capacity == length )) {
						T[] newarr1 = new T[( (( length << 1 )) + 1 )];
						global::System.Array.Copy(((global::System.Array) (a) ), ((int) (0) ), ((global::System.Array) (newarr1) ), ((int) (1) ), ((int) (length) ));
						a = ((T[]) (newarr1) );
					}
					else {
						global::System.Array.Copy(((global::System.Array) (a) ), ((int) (0) ), ((global::System.Array) (a) ), ((int) (1) ), ((int) (length) ));
					}
					
				}
				else if (( capacity == length )) {
					T[] newarr2 = new T[( (( length << 1 )) + 1 )];
					global::System.Array.Copy(((global::System.Array) (a) ), ((int) (0) ), ((global::System.Array) (newarr2) ), ((int) (0) ), ((int) (pos) ));
					global::System.Array.Copy(((global::System.Array) (a) ), ((int) (pos) ), ((global::System.Array) (newarr2) ), ((int) (( pos + 1 )) ), ((int) (( length - pos )) ));
					a = ((T[]) (newarr2) );
				}
				else {
					global::System.Array.Copy(((global::System.Array) (a) ), ((int) (pos) ), ((global::System.Array) (a) ), ((int) (( pos + 1 )) ), ((int) (( length - pos )) ));
					global::System.Array.Copy(((global::System.Array) (a) ), ((int) (0) ), ((global::System.Array) (a) ), ((int) (0) ), ((int) (pos) ));
				}
				
				a[pos] = x;
			}
		}
		
		
	}
}


