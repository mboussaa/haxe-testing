// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx._Url {
	public sealed class Url_Impl_ {
		
		static Url_Impl_() {
			global::thx._Url.Url_Impl_.pattern = new global::EReg("^((((?:([^:/#\\?]+):)?(?:(//)?((?:(([^:@/#\\?]+)(?:[:]([^:@/#\\?]+))?)@)?(([^:/#\\?\\]\\[]+|\\[[^/\\]@#?]+\\])(?:[:]([0-9]+))?))?)?)?((/?(?:[^/\\?#]+/+)*)([^\\?#]*)))?(?:\\?([^#]+))?)(?:#(.*))?", "");
		}
		
		
		public static global::EReg pattern;
		
		public static object fromString(string s) {
			return global::thx._Url.Url_Impl_.parse(s, true);
		}
		
		
		public static object parse(string s, bool parseQueryString) {
			unchecked {
				if ( ! (global::thx._Url.Url_Impl_.pattern.match(s)) ) {
					throw global::haxe.lang.HaxeException.wrap(new global::thx.Error(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("unable to parse \"", s), "\" to Url"), null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"parse", "thx._Url.Url_Impl_", "Url.hx"}, new int[]{1981972957}, new double[]{((double) (21) )})));
				}
				
				string port = global::thx._Url.Url_Impl_.pattern.matched(12);
				object o = null;
				{
					string __temp_odecl1 = global::thx._Url.Url_Impl_.pattern.matched(4);
					bool __temp_odecl2 = string.Equals(global::thx._Url.Url_Impl_.pattern.matched(5), "//");
					string __temp_odecl3 = global::thx._Url.Url_Impl_.pattern.matched(7);
					string __temp_odecl4 = global::thx._Url.Url_Impl_.pattern.matched(11);
					global::haxe.lang.Null<int> __temp_odecl5 = ( (string.Equals(null, port)) ? (default(global::haxe.lang.Null<int>)) : (global::Std.parseInt(port)) );
					string __temp_odecl6 = global::thx._Url.Url_Impl_.pattern.matched(13);
					string __temp_odecl7 = global::thx._Url.Url_Impl_.pattern.matched(17);
					o = new global::haxe.lang.DynamicObject(new int[]{6510168, 48259563, 1034633683, 1050589840, 1081532264, 1158164430, 1247576961, 1660395368, 1666522617}, new object[]{__temp_odecl1, __temp_odecl2, __temp_odecl4, __temp_odecl6, __temp_odecl3, __temp_odecl7, (__temp_odecl5).toDynamic(), null, null}, new int[]{}, new double[]{});
				}
				
				global::thx._Url.Url_Impl_.set_search(o, global::thx._Url.Url_Impl_.pattern.matched(16));
				return o;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		public static bool @equals(object self, object that) {
			return global::thx._Url.Url_Impl_.equalsTo(self, that);
		}
		
		
		public static bool equalsTo(object this1, object that) {
			if (( ( ( ( ( ( ( string.Equals(global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(this1, "protocol", 6510168, true)), global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(((object) (that) ), "protocol", 6510168, true))) && ( global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.getField(this1, "slashes", 48259563, true)) == global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.getField(((object) (that) ), "slashes", 48259563, true)) ) ) && string.Equals(global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(this1, "auth", 1081532264, true)), global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(((object) (that) ), "auth", 1081532264, true))) ) && string.Equals(global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(this1, "hostName", 1034633683, true)), global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(((object) (that) ), "hostName", 1034633683, true))) ) && global::haxe.lang.Runtime.eq(((object) (global::haxe.lang.Runtime.getField(this1, "port", 1247576961, true)) ), ((object) (global::haxe.lang.Runtime.getField(((object) (that) ), "port", 1247576961, true)) )) ) && string.Equals(global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(this1, "pathName", 1050589840, true)), global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(((object) (that) ), "pathName", 1050589840, true))) ) && global::thx._QueryString.QueryString_Impl_.@equals(((global::haxe.ds.StringMap<object>) (global::haxe.ds.StringMap<object>.__hx_cast<object>(((global::haxe.ds.StringMap) (global::haxe.lang.Runtime.getField(this1, "queryString", 1666522617, true)) ))) ), ((global::haxe.ds.StringMap<object>) (global::haxe.ds.StringMap<object>.__hx_cast<object>(((global::haxe.ds.StringMap) (global::haxe.lang.Runtime.getField(((object) (that) ), "queryString", 1666522617, true)) ))) )) ) && string.Equals(global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(this1, "search", 1660395368, true)), global::thx._Url.Url_Impl_.get_search(that)) )) {
				return string.Equals(global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(this1, "hash", 1158164430, true)), global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(((object) (that) ), "hash", 1158164430, true)));
			}
			else {
				return false;
			}
			
		}
		
		
		public static object concatString(object this1, string that) {
			unchecked {
				object copy = global::thx._Url.Url_Impl_.clone(this1);
				if (global::thx.Strings.isEmpty(global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(((object) (this1) ), "pathName", 1050589840, true)))) {
					if ( ! (that.StartsWith("/")) ) {
						that = global::haxe.lang.Runtime.concat("/", that);
					}
					
					global::haxe.lang.Runtime.setField(((object) (copy) ), "pathName", 1050589840, that);
				}
				else {
					if (that.StartsWith("/")) {
						that = global::haxe.lang.StringExt.substring(that, 1, default(global::haxe.lang.Null<int>));
					}
					
					if (global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(((object) (this1) ), "pathName", 1050589840, true)).EndsWith("/")) {
						global::haxe.lang.Runtime.setField(((object) (copy) ), "pathName", 1050589840, global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(((object) (copy) ), "pathName", 1050589840, true)), that));
					}
					else {
						global::haxe.lang.Runtime.setField(((object) (copy) ), "pathName", 1050589840, global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(((object) (copy) ), "pathName", 1050589840, true)), "/"), that));
					}
					
				}
				
				return copy;
			}
		}
		
		
		public static string toString(object this1) {
			if ( ! (string.Equals(global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(((object) (this1) ), "hostName", 1034633683, true)), null)) ) {
				return global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("", (( ( ! (string.Equals(global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(((object) (this1) ), "protocol", 6510168, true)), null)) ) ? (global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(((object) (this1) ), "protocol", 6510168, true)), ":")) : ("") ))), (( (global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.getField(((object) (this1) ), "slashes", 48259563, true))) ? ("//") : ("") ))), (( ( ! (string.Equals(global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(((object) (this1) ), "auth", 1081532264, true)), null)) ) ? (global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(((object) (this1) ), "auth", 1081532264, true)), "@")) : ("") ))), (global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(((object) (this1) ), "hostName", 1034633683, true)), (( (global::haxe.lang.Null<object>.ofDynamic<int>(global::haxe.lang.Runtime.getField(((object) (this1) ), "port", 1247576961, true)).hasValue) ? (global::haxe.lang.Runtime.concat(":", global::haxe.lang.Runtime.toString((global::haxe.lang.Null<object>.ofDynamic<int>(global::haxe.lang.Runtime.getField(((object) (this1) ), "port", 1247576961, true))).toDynamic()))) : ("") ))))), (global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(((object) (this1) ), "pathName", 1050589840, true)), (( ((  ! (string.Equals(global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(((object) (this1) ), "search", 1660395368, true)), null))  || ( ( ((global::haxe.ds.StringMap<object>) (global::haxe.ds.StringMap<object>.__hx_cast<object>(((global::haxe.ds.StringMap) (global::haxe.lang.Runtime.getField(((object) (this1) ), "queryString", 1666522617, true)) ))) ) != null ) &&  ! (( ! (global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(((object) (new global::haxe.ds._StringMap.StringMapValueIterator<object>(((global::haxe.ds.StringMap<object>) (global::haxe.ds.StringMap<object>.__hx_cast<object>(((global::haxe.ds.StringMap) (global::haxe.lang.Runtime.getField(((object) (this1) ), "queryString", 1666522617, true)) ))) ))) ), "hasNext", 407283053, null))) ))  ) )) ? (global::haxe.lang.Runtime.concat("?", global::thx._Url.Url_Impl_.get_search(((object) (this1) )))) : ("") ))))), (( ( ! (string.Equals(global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(((object) (this1) ), "hash", 1158164430, true)), null)) ) ? (global::haxe.lang.Runtime.concat("#", global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(((object) (this1) ), "hash", 1158164430, true)))) : ("") )));
			}
			else {
				return global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("", (global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(((object) (this1) ), "pathName", 1050589840, true)), (( ((  ! (string.Equals(global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(((object) (this1) ), "search", 1660395368, true)), null))  || ( ( ((global::haxe.ds.StringMap<object>) (global::haxe.ds.StringMap<object>.__hx_cast<object>(((global::haxe.ds.StringMap) (global::haxe.lang.Runtime.getField(((object) (this1) ), "queryString", 1666522617, true)) ))) ) != null ) &&  ! (( ! (global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(((object) (new global::haxe.ds._StringMap.StringMapValueIterator<object>(((global::haxe.ds.StringMap<object>) (global::haxe.ds.StringMap<object>.__hx_cast<object>(((global::haxe.ds.StringMap) (global::haxe.lang.Runtime.getField(((object) (this1) ), "queryString", 1666522617, true)) ))) ))) ), "hasNext", 407283053, null))) ))  ) )) ? (global::haxe.lang.Runtime.concat("?", global::thx._Url.Url_Impl_.get_search(((object) (this1) )))) : ("") ))))), (( ( ! (string.Equals(global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(((object) (this1) ), "hash", 1158164430, true)), null)) ) ? (global::haxe.lang.Runtime.concat("#", global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(((object) (this1) ), "hash", 1158164430, true)))) : ("") )));
			}
			
		}
		
		
		public static object clone(object this1) {
			{
				string __temp_odecl1 = global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(((object) (this1) ), "protocol", 6510168, true));
				bool __temp_odecl2 = global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.getField(((object) (this1) ), "slashes", 48259563, true));
				string __temp_odecl3 = global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(((object) (this1) ), "auth", 1081532264, true));
				string __temp_odecl4 = global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(((object) (this1) ), "hostName", 1034633683, true));
				global::haxe.lang.Null<int> __temp_odecl5 = global::haxe.lang.Null<object>.ofDynamic<int>(global::haxe.lang.Runtime.getField(((object) (this1) ), "port", 1247576961, true));
				string __temp_odecl6 = global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(((object) (this1) ), "pathName", 1050589840, true));
				global::haxe.ds.StringMap<object> __temp_odecl7 = global::thx._QueryString.QueryString_Impl_.clone(((global::haxe.ds.StringMap<object>) (global::haxe.ds.StringMap<object>.__hx_cast<object>(((global::haxe.ds.StringMap) (global::haxe.lang.Runtime.getField(((object) (this1) ), "queryString", 1666522617, true)) ))) ));
				string __temp_odecl8 = global::thx._Url.Url_Impl_.get_search(this1);
				string __temp_odecl9 = global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(((object) (this1) ), "hash", 1158164430, true));
				return new global::haxe.lang.DynamicObject(new int[]{6510168, 48259563, 1034633683, 1050589840, 1081532264, 1158164430, 1247576961, 1660395368, 1666522617}, new object[]{__temp_odecl1, __temp_odecl2, __temp_odecl4, __temp_odecl6, __temp_odecl3, __temp_odecl9, (__temp_odecl5).toDynamic(), __temp_odecl8, __temp_odecl7}, new int[]{}, new double[]{});
			}
			
		}
		
		
		public static global::haxe.ds.StringMap<object> ensureQueryString(object this1) {
			if (( ((global::haxe.ds.StringMap<object>) (global::haxe.ds.StringMap<object>.__hx_cast<object>(((global::haxe.ds.StringMap) (global::haxe.lang.Runtime.getField(this1, "queryString", 1666522617, true)) ))) ) != null )) {
				return ((global::haxe.ds.StringMap<object>) (global::haxe.ds.StringMap<object>.__hx_cast<object>(((global::haxe.ds.StringMap) (global::haxe.lang.Runtime.getField(this1, "queryString", 1666522617, true)) ))) );
			}
			else {
				global::haxe.ds.StringMap<object> @value = new global::haxe.ds.StringMap<object>();
				if (( null != @value )) {
					global::haxe.lang.Runtime.setField(((object) (this1) ), "search", 1660395368, null);
				}
				
				return ((global::haxe.ds.StringMap<object>) (global::haxe.ds.StringMap<object>.__hx_cast<object>(((global::haxe.ds.StringMap) (global::haxe.lang.Runtime.setField(((object) (this1) ), "queryString", 1666522617, @value)) ))) );
			}
			
		}
		
		
		public static string get_auth(object this1) {
			return global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(this1, "auth", 1081532264, true));
		}
		
		
		public static string set_auth(object this1, string @value) {
			return global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.setField(this1, "auth", 1081532264, @value));
		}
		
		
		public static bool get_hasAuth(object this1) {
			return  ! (string.Equals(global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(this1, "auth", 1081532264, true)), null)) ;
		}
		
		
		public static bool get_hasHash(object this1) {
			return  ! (string.Equals(global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(this1, "hash", 1158164430, true)), null)) ;
		}
		
		
		public static bool get_hasPort(object this1) {
			return global::haxe.lang.Null<object>.ofDynamic<int>(global::haxe.lang.Runtime.getField(this1, "port", 1247576961, true)).hasValue;
		}
		
		
		public static bool get_hasProtocol(object this1) {
			return  ! (string.Equals(global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(this1, "protocol", 6510168, true)), null)) ;
		}
		
		
		public static bool get_hasQueryString(object this1) {
			if (( ((global::haxe.ds.StringMap<object>) (global::haxe.ds.StringMap<object>.__hx_cast<object>(((global::haxe.ds.StringMap) (global::haxe.lang.Runtime.getField(this1, "queryString", 1666522617, true)) ))) ) != null )) {
				return  ! (( ! (global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(((object) (new global::haxe.ds._StringMap.StringMapValueIterator<object>(((global::haxe.ds.StringMap<object>) (global::haxe.ds.StringMap<object>.__hx_cast<object>(((global::haxe.ds.StringMap) (global::haxe.lang.Runtime.getField(this1, "queryString", 1666522617, true)) ))) ))) ), "hasNext", 407283053, null))) )) ;
			}
			else {
				return false;
			}
			
		}
		
		
		public static bool get_hasSearch(object this1) {
			if (string.Equals(global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(this1, "search", 1660395368, true)), null)) {
				if (( ((global::haxe.ds.StringMap<object>) (global::haxe.ds.StringMap<object>.__hx_cast<object>(((global::haxe.ds.StringMap) (global::haxe.lang.Runtime.getField(((object) (this1) ), "queryString", 1666522617, true)) ))) ) != null )) {
					return  ! (( ! (global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(((object) (new global::haxe.ds._StringMap.StringMapValueIterator<object>(((global::haxe.ds.StringMap<object>) (global::haxe.ds.StringMap<object>.__hx_cast<object>(((global::haxe.ds.StringMap) (global::haxe.lang.Runtime.getField(((object) (this1) ), "queryString", 1666522617, true)) ))) ))) ), "hasNext", 407283053, null))) )) ;
				}
				else {
					return false;
				}
				
			}
			else {
				return true;
			}
			
		}
		
		
		public static string get_host(object this1) {
			return global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(this1, "hostName", 1034633683, true)), (( (global::haxe.lang.Null<object>.ofDynamic<int>(global::haxe.lang.Runtime.getField(((object) (this1) ), "port", 1247576961, true)).hasValue) ? (global::haxe.lang.Runtime.concat(":", global::haxe.lang.Runtime.toString((global::haxe.lang.Null<object>.ofDynamic<int>(global::haxe.lang.Runtime.getField(((object) (this1) ), "port", 1247576961, true))).toDynamic()))) : ("") )));
		}
		
		
		public static string set_host(object this1, string host) {
			unchecked {
				int p = global::haxe.lang.StringExt.indexOf(host, ":", default(global::haxe.lang.Null<int>));
				if (( p < 0 )) {
					global::haxe.lang.Runtime.setField(this1, "hostName", 1034633683, host);
					global::haxe.lang.Runtime.setField(this1, "port", 1247576961, (default(global::haxe.lang.Null<int>)).toDynamic());
				}
				else {
					global::haxe.lang.Runtime.setField(this1, "hostName", 1034633683, global::haxe.lang.StringExt.substring(host, 0, new global::haxe.lang.Null<int>(p, true)));
					global::haxe.lang.Runtime.setField(this1, "port", 1247576961, (global::Std.parseInt(global::haxe.lang.StringExt.substring(host, ( p + 1 ), default(global::haxe.lang.Null<int>)))).toDynamic());
				}
				
				return host;
			}
		}
		
		
		public static string get_hostName(object this1) {
			return global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(this1, "hostName", 1034633683, true));
		}
		
		
		public static string set_hostName(object this1, string hostName) {
			return global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.setField(this1, "hostName", 1034633683, hostName));
		}
		
		
		public static string get_href(object this1) {
			return global::thx._Url.Url_Impl_.toString(this1);
		}
		
		
		public static string set_href(object this1, string @value) {
			this1 = ((object) (global::thx._Url.Url_Impl_.parse(@value, true)) );
			return @value;
		}
		
		
		public static bool get_isAbsolute(object this1) {
			return  ! (string.Equals(global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(this1, "hostName", 1034633683, true)), null)) ;
		}
		
		
		public static bool get_isRelative(object this1) {
			return string.Equals(global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(this1, "hostName", 1034633683, true)), null);
		}
		
		
		public static string get_path(object this1) {
			return global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(this1, "pathName", 1050589840, true)), (( ((  ! (string.Equals(global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(((object) (this1) ), "search", 1660395368, true)), null))  || ( ( ((global::haxe.ds.StringMap<object>) (global::haxe.ds.StringMap<object>.__hx_cast<object>(((global::haxe.ds.StringMap) (global::haxe.lang.Runtime.getField(((object) (this1) ), "queryString", 1666522617, true)) ))) ) != null ) &&  ! (( ! (global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.callField(((object) (new global::haxe.ds._StringMap.StringMapValueIterator<object>(((global::haxe.ds.StringMap<object>) (global::haxe.ds.StringMap<object>.__hx_cast<object>(((global::haxe.ds.StringMap) (global::haxe.lang.Runtime.getField(((object) (this1) ), "queryString", 1666522617, true)) ))) ))) ), "hasNext", 407283053, null))) ))  ) )) ? (global::haxe.lang.Runtime.concat("?", global::thx._Url.Url_Impl_.get_search(this1))) : ("") )));
		}
		
		
		public static string set_path(object this1, string @value) {
			unchecked {
				int p = global::haxe.lang.StringExt.indexOf(@value, "?", default(global::haxe.lang.Null<int>));
				if (( p < 0 )) {
					global::haxe.lang.Runtime.setField(this1, "pathName", 1050589840, @value);
					global::haxe.lang.Runtime.setField(this1, "search", 1660395368, null);
					global::haxe.ds.StringMap<object>.__hx_cast<object>(((global::haxe.ds.StringMap) (global::haxe.lang.Runtime.setField(this1, "queryString", 1666522617, null)) ));
				}
				else {
					global::haxe.lang.Runtime.setField(this1, "pathName", 1050589840, global::haxe.lang.StringExt.substring(@value, 0, new global::haxe.lang.Null<int>(p, true)));
					global::thx._Url.Url_Impl_.set_search(this1, global::haxe.lang.StringExt.substring(@value, ( p + 1 ), default(global::haxe.lang.Null<int>)));
				}
				
				return @value;
			}
		}
		
		
		public static string get_pathName(object this1) {
			return global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(this1, "pathName", 1050589840, true));
		}
		
		
		public static string set_pathName(object this1, string @value) {
			return global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.setField(this1, "pathName", 1050589840, @value));
		}
		
		
		public static global::haxe.lang.Null<int> get_port(object this1) {
			return global::haxe.lang.Null<object>.ofDynamic<int>(global::haxe.lang.Runtime.getField(this1, "port", 1247576961, true));
		}
		
		
		public static global::haxe.lang.Null<int> set_port(object this1, global::haxe.lang.Null<int> @value) {
			return global::haxe.lang.Null<object>.ofDynamic<int>(global::haxe.lang.Runtime.setField(this1, "port", 1247576961, (@value).toDynamic()));
		}
		
		
		public static string get_protocol(object this1) {
			return global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(this1, "protocol", 6510168, true));
		}
		
		
		public static string set_protocol(object this1, string @value) {
			return global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.setField(this1, "protocol", 6510168, ( (string.Equals(null, @value)) ? (null) : (@value.ToLowerInvariant()) )));
		}
		
		
		public static string get_hash(object this1) {
			return global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(this1, "hash", 1158164430, true));
		}
		
		
		public static string set_hash(object this1, string @value) {
			return global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.setField(this1, "hash", 1158164430, @value));
		}
		
		
		public static bool get_slashes(object this1) {
			return global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.getField(this1, "slashes", 48259563, true));
		}
		
		
		public static bool set_slashes(object this1, bool @value) {
			return global::haxe.lang.Runtime.toBool(global::haxe.lang.Runtime.setField(this1, "slashes", 48259563, @value));
		}
		
		
		public static global::haxe.ds.StringMap<object> get_queryString(object this1) {
			return ((global::haxe.ds.StringMap<object>) (global::haxe.ds.StringMap<object>.__hx_cast<object>(((global::haxe.ds.StringMap) (global::haxe.lang.Runtime.getField(this1, "queryString", 1666522617, true)) ))) );
		}
		
		
		public static global::haxe.ds.StringMap<object> set_queryString(object this1, global::haxe.ds.StringMap<object> @value) {
			if (( null != @value )) {
				global::haxe.lang.Runtime.setField(this1, "search", 1660395368, null);
			}
			
			return ((global::haxe.ds.StringMap<object>) (global::haxe.ds.StringMap<object>.__hx_cast<object>(((global::haxe.ds.StringMap) (global::haxe.lang.Runtime.setField(this1, "queryString", 1666522617, @value)) ))) );
		}
		
		
		public static string get_search(object this1) {
			if ((  ! (string.Equals(null, global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(this1, "search", 1660395368, true))))  &&  ! (string.Equals("", global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(this1, "search", 1660395368, true))))  )) {
				return global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(this1, "search", 1660395368, true));
			}
			else {
				return global::thx._QueryString.QueryString_Impl_.toStringWithSymbols(((global::haxe.ds.StringMap<object>) (global::haxe.ds.StringMap<object>.__hx_cast<object>(((global::haxe.ds.StringMap) (global::haxe.lang.Runtime.getField(this1, "queryString", 1666522617, true)) ))) ), global::thx._QueryString.QueryString_Impl_.separator, global::thx._QueryString.QueryString_Impl_.assignment, global::thx._QueryString.QueryString_Impl_.encodeURIComponent);
			}
			
		}
		
		
		public static string set_search(object this1, string @value) {
			unchecked {
				global::haxe.ds.StringMap<object> qs = null;
				try {
					qs = global::thx._QueryString.QueryString_Impl_.parseWithSymbols(@value, global::thx._QueryString.QueryString_Impl_.separator, global::thx._QueryString.QueryString_Impl_.assignment, global::thx._QueryString.QueryString_Impl_.decodeURIComponent);
				}
				catch (global::System.Exception __temp_catchallException1){
					global::haxe.lang.Exceptions.exception = __temp_catchallException1;
					object __temp_catchall2 = __temp_catchallException1;
					if (( __temp_catchall2 is global::haxe.lang.HaxeException )) {
						__temp_catchall2 = ((global::haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
					}
					
					{
						object e = __temp_catchall2;
						qs = null;
					}
					
				}
				
				
				bool tmp = default(bool);
				if (( qs != null )) {
					global::Array<object> arr = global::thx.Iterators.toArray<object>(((object) (new global::haxe.ds._StringMap.StringMapKeyIterator<object>(((global::haxe.ds.StringMap<object>) (qs) ))) ));
					if (( arr.length == 0 )) {
						tmp = true;
					}
					else if (( arr.length != 1 )) {
						tmp = false;
					}
					else {
						tmp = ( ((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) ((((global::haxe.ds.StringMap<object>) (qs) ).@get(global::haxe.lang.Runtime.toString(arr[0]))).@value) ))) ).length == 0 );
					}
					
				}
				else {
					tmp = true;
				}
				
				if (tmp) {
					global::haxe.lang.Runtime.setField(this1, "search", 1660395368, @value);
					global::haxe.ds.StringMap<object>.__hx_cast<object>(((global::haxe.ds.StringMap) (global::haxe.lang.Runtime.setField(this1, "queryString", 1666522617, null)) ));
				}
				else {
					global::haxe.ds.StringMap<object>.__hx_cast<object>(((global::haxe.ds.StringMap) (global::haxe.lang.Runtime.setField(this1, "queryString", 1666522617, qs)) ));
					global::haxe.lang.Runtime.setField(this1, "search", 1660395368, null);
				}
				
				return @value;
			}
		}
		
		
	}
}

