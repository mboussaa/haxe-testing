// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace nanotest {
	public class NanoTestStatus : global::haxe.lang.ParamEnum {
		
		public NanoTestStatus(int index, object[] @params) : base(index, @params) {
		}
		
		
		public static readonly string[] __hx_constructs = new string[]{"SUCCESS", "FAIL", "ERROR"};
		
		public static global::nanotest.NanoTestStatus SUCCESS(object posInfos) {
			return new global::nanotest.NanoTestStatus(0, new object[]{posInfos});
		}
		
		
		public static global::nanotest.NanoTestStatus FAIL(string message, object posInfos) {
			unchecked {
				return new global::nanotest.NanoTestStatus(1, new object[]{message, posInfos});
			}
		}
		
		
		public static global::nanotest.NanoTestStatus ERROR(string message, global::Array<object> callStack) {
			unchecked {
				return new global::nanotest.NanoTestStatus(2, new object[]{message, callStack});
			}
		}
		
		
		public override string getTag() {
			return global::nanotest.NanoTestStatus.__hx_constructs[this.index];
		}
		
		
	}
}


