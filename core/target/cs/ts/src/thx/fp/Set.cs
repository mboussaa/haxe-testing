// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx.fp._Set {
	public sealed class Set_Impl_ {
		
		static Set_Impl_() {
			unchecked {
				global::thx.fp._Set.Set_Impl_.delta = 4;
				global::thx.fp._Set.Set_Impl_.ratio = 4;
			}
		}
		
		
		public static global::thx.fp.SetImpl empty<X>() {
			return global::thx.fp.SetImpl.Tip;
		}
		
		
		public static global::thx.fp.SetImpl singleton<X>(X x) {
			unchecked {
				return global::thx.fp.SetImpl.Bin(1, x, global::thx.fp.SetImpl.Tip, global::thx.fp.SetImpl.Tip);
			}
		}
		
		
		public static global::thx.fp.SetImpl bin<X>(X x, global::thx.fp.SetImpl l, global::thx.fp.SetImpl r) {
			unchecked {
				return global::thx.fp.SetImpl.Bin(( ( global::thx.fp._Set.Set_Impl_.size<X>(((global::thx.fp.SetImpl) (l) )) + global::thx.fp._Set.Set_Impl_.size<X>(((global::thx.fp.SetImpl) (r) )) ) + 1 ), x, l, r);
			}
		}
		
		
		public static bool isEmpty<X>(global::thx.fp.SetImpl this1) {
			unchecked {
				switch (this1.index) {
					case 0:
					{
						return true;
					}
					
					
					case 1:
					{
						return false;
					}
					
					
				}
				
				return default(bool);
			}
		}
		
		
		public static int size<X>(global::thx.fp.SetImpl this1) {
			unchecked {
				switch (this1.index) {
					case 0:
					{
						return 0;
					}
					
					
					case 1:
					{
						return ((int) (global::haxe.lang.Runtime.toInt(this1.@params[0])) );
					}
					
					
				}
				
				return default(int);
			}
		}
		
		
		public static bool member<X>(global::thx.fp.SetImpl this1, X x, global::haxe.lang.Function comparator) {
			unchecked {
				switch (this1.index) {
					case 0:
					{
						return false;
					}
					
					
					case 1:
					{
						global::thx.fp.SetImpl r = ((global::thx.fp.SetImpl) (this1.@params[3]) );
						global::thx.fp.SetImpl l = ((global::thx.fp.SetImpl) (this1.@params[2]) );
						switch (((global::thx.OrderingImpl) (comparator.__hx_invoke2_o(default(double), x, default(double), global::haxe.lang.Runtime.genericCast<X>(this1.@params[1]))) ).index) {
							case 0:
							{
								return global::thx.fp._Set.Set_Impl_.member<X>(((global::thx.fp.SetImpl) (l) ), global::haxe.lang.Runtime.genericCast<X>(x), ((global::haxe.lang.Function) (comparator) ));
							}
							
							
							case 1:
							{
								return global::thx.fp._Set.Set_Impl_.member<X>(((global::thx.fp.SetImpl) (r) ), global::haxe.lang.Runtime.genericCast<X>(x), ((global::haxe.lang.Function) (comparator) ));
							}
							
							
							case 2:
							{
								return true;
							}
							
							
						}
						
						break;
					}
					
					
				}
				
				return default(bool);
			}
		}
		
		
		public static B foldLeft<B, X>(global::thx.fp.SetImpl this1, B b, global::haxe.lang.Function f) {
			unchecked {
				switch (this1.index) {
					case 0:
					{
						return b;
					}
					
					
					case 1:
					{
						return global::haxe.lang.Runtime.genericCast<B>(global::thx.fp._Set.Set_Impl_.foldLeft<object, X>(((global::thx.fp.SetImpl) (this1.@params[3]) ), global::haxe.lang.Runtime.genericCast<B>(global::thx.fp._Set.Set_Impl_.foldLeft<object, X>(((global::thx.fp.SetImpl) (this1.@params[2]) ), global::haxe.lang.Runtime.genericCast<B>(f.__hx_invoke2_o(default(double), b, default(double), global::haxe.lang.Runtime.genericCast<X>(this1.@params[1]))), ((global::haxe.lang.Function) (f) ))), ((global::haxe.lang.Function) (f) )));
					}
					
					
				}
				
				return default(B);
			}
		}
		
		
		public static global::thx.fp.SetImpl insert<X>(global::thx.fp.SetImpl this1, X x, global::haxe.lang.Function comparator) {
			unchecked {
				switch (this1.index) {
					case 0:
					{
						return ((global::thx.fp.SetImpl) (global::thx.fp.SetImpl.Bin(1, x, global::thx.fp.SetImpl.Tip, global::thx.fp.SetImpl.Tip)) );
					}
					
					
					case 1:
					{
						global::thx.fp.SetImpl r = ((global::thx.fp.SetImpl) (this1.@params[3]) );
						global::thx.fp.SetImpl l = ((global::thx.fp.SetImpl) (this1.@params[2]) );
						X y = global::haxe.lang.Runtime.genericCast<X>(this1.@params[1]);
						int sz = ((int) (global::haxe.lang.Runtime.toInt(this1.@params[0])) );
						switch (((global::thx.OrderingImpl) (comparator.__hx_invoke2_o(default(double), x, default(double), y)) ).index) {
							case 0:
							{
								return global::thx.fp._Set.Set_Impl_.balance<X>(((global::thx.fp.SetImpl) (l) ), global::haxe.lang.Runtime.genericCast<X>(y), ((global::thx.fp.SetImpl) (global::thx.fp._Set.Set_Impl_.insert<X>(((global::thx.fp.SetImpl) (l) ), global::haxe.lang.Runtime.genericCast<X>(x), ((global::haxe.lang.Function) (comparator) ))) ), ((global::thx.fp.SetImpl) (r) ));
							}
							
							
							case 1:
							{
								return global::thx.fp._Set.Set_Impl_.balance<X>(((global::thx.fp.SetImpl) (r) ), global::haxe.lang.Runtime.genericCast<X>(y), ((global::thx.fp.SetImpl) (l) ), ((global::thx.fp.SetImpl) (global::thx.fp._Set.Set_Impl_.insert<X>(((global::thx.fp.SetImpl) (r) ), global::haxe.lang.Runtime.genericCast<X>(x), ((global::haxe.lang.Function) (comparator) ))) ));
							}
							
							
							case 2:
							{
								return global::thx.fp.SetImpl.Bin(sz, x, l, r);
							}
							
							
						}
						
						break;
					}
					
					
				}
				
				return null;
			}
		}
		
		
		public static global::thx.fp.ListImpl mapList<Y, X>(global::thx.fp.SetImpl this1, global::haxe.lang.Function f) {
			unchecked {
				switch (this1.index) {
					case 0:
					{
						return ((global::thx.fp.ListImpl) (global::thx.fp.ListImpl.Nil) );
					}
					
					
					case 1:
					{
						return global::thx.fp.ListImpl.Cons(global::haxe.lang.Runtime.genericCast<Y>(f.__hx_invoke1_o(default(double), global::haxe.lang.Runtime.genericCast<X>(this1.@params[1]))), global::thx.fp._List.List_Impl_.concat<Y>(((global::thx.fp.ListImpl) (global::thx.fp._Set.Set_Impl_.mapList<object, X>(((global::thx.fp.SetImpl) (this1.@params[2]) ), ((global::haxe.lang.Function) (f) ))) ), ((global::thx.fp.ListImpl) (global::thx.fp._Set.Set_Impl_.mapList<object, X>(((global::thx.fp.SetImpl) (this1.@params[3]) ), ((global::haxe.lang.Function) (f) ))) )));
					}
					
					
				}
				
				return null;
			}
		}
		
		
		public static int delta;
		
		public static int ratio;
		
		public static global::thx.fp.SetImpl balance<X>(global::thx.fp.SetImpl this1, X x, global::thx.fp.SetImpl l, global::thx.fp.SetImpl r) {
			unchecked {
				int sl = global::thx.fp._Set.Set_Impl_.size<X>(((global::thx.fp.SetImpl) (l) ));
				int sr = global::thx.fp._Set.Set_Impl_.size<X>(((global::thx.fp.SetImpl) (r) ));
				int sx = ( ( sl + sr ) + 1 );
				if (( ( sl + sr ) <= 1 )) {
					return global::thx.fp.SetImpl.Bin(sx, x, l, r);
				}
				else if (( sr >= ( 4 * sl ) )) {
					return global::thx.fp._Set.Set_Impl_.rotateLeft<X>(global::haxe.lang.Runtime.genericCast<X>(x), ((global::thx.fp.SetImpl) (l) ), ((global::thx.fp.SetImpl) (r) ));
				}
				else if (( sl >= ( 4 * sr ) )) {
					return global::thx.fp._Set.Set_Impl_.rotateRight<X>(global::haxe.lang.Runtime.genericCast<X>(x), ((global::thx.fp.SetImpl) (l) ), ((global::thx.fp.SetImpl) (r) ));
				}
				else {
					return global::thx.fp.SetImpl.Bin(sx, x, l, r);
				}
				
			}
		}
		
		
		public static global::thx.fp.SetImpl rotateLeft<X>(X x, global::thx.fp.SetImpl l, global::thx.fp.SetImpl r) {
			unchecked {
				if (( r.index == 1 )) {
					global::thx.fp.SetImpl ry = ((global::thx.fp.SetImpl) (((global::thx.fp.SetImpl) (r) ).@params[3]) );
					global::thx.fp.SetImpl ly = ((global::thx.fp.SetImpl) (((global::thx.fp.SetImpl) (r) ).@params[2]) );
					if (( global::thx.fp._Set.Set_Impl_.size<X>(((global::thx.fp.SetImpl) (ly) )) < ( 4 * global::thx.fp._Set.Set_Impl_.size<X>(((global::thx.fp.SetImpl) (ry) )) ) )) {
						return global::thx.fp._Set.Set_Impl_.singleLeft<X>(global::haxe.lang.Runtime.genericCast<X>(x), ((global::thx.fp.SetImpl) (l) ), ((global::thx.fp.SetImpl) (r) ));
					}
					else {
						return global::thx.fp._Set.Set_Impl_.doubleLeft<X>(global::haxe.lang.Runtime.genericCast<X>(x), ((global::thx.fp.SetImpl) (l) ), ((global::thx.fp.SetImpl) (r) ));
					}
					
				}
				else {
					return global::thx.fp._Set.Set_Impl_.doubleLeft<X>(global::haxe.lang.Runtime.genericCast<X>(x), ((global::thx.fp.SetImpl) (l) ), ((global::thx.fp.SetImpl) (r) ));
				}
				
			}
		}
		
		
		public static global::thx.fp.SetImpl rotateRight<X>(X x, global::thx.fp.SetImpl l, global::thx.fp.SetImpl r) {
			unchecked {
				if (( l.index == 1 )) {
					global::thx.fp.SetImpl ry = ((global::thx.fp.SetImpl) (((global::thx.fp.SetImpl) (l) ).@params[3]) );
					global::thx.fp.SetImpl ly = ((global::thx.fp.SetImpl) (((global::thx.fp.SetImpl) (l) ).@params[2]) );
					if (( global::thx.fp._Set.Set_Impl_.size<X>(((global::thx.fp.SetImpl) (ry) )) < ( 4 * global::thx.fp._Set.Set_Impl_.size<X>(((global::thx.fp.SetImpl) (ly) )) ) )) {
						return global::thx.fp._Set.Set_Impl_.singleRight<X>(global::haxe.lang.Runtime.genericCast<X>(x), ((global::thx.fp.SetImpl) (l) ), ((global::thx.fp.SetImpl) (r) ));
					}
					else {
						return global::thx.fp._Set.Set_Impl_.doubleRight<X>(global::haxe.lang.Runtime.genericCast<X>(x), ((global::thx.fp.SetImpl) (l) ), ((global::thx.fp.SetImpl) (r) ));
					}
					
				}
				else {
					return global::thx.fp._Set.Set_Impl_.doubleRight<X>(global::haxe.lang.Runtime.genericCast<X>(x), ((global::thx.fp.SetImpl) (l) ), ((global::thx.fp.SetImpl) (r) ));
				}
				
			}
		}
		
		
		public static global::thx.fp.SetImpl singleLeft<X>(X x1, global::thx.fp.SetImpl t1, global::thx.fp.SetImpl r) {
			unchecked {
				if (( r.index == 1 )) {
					global::thx.fp.SetImpl t3 = ((global::thx.fp.SetImpl) (((global::thx.fp.SetImpl) (r) ).@params[3]) );
					global::thx.fp.SetImpl t2 = ((global::thx.fp.SetImpl) (((global::thx.fp.SetImpl) (r) ).@params[2]) );
					X x2 = global::haxe.lang.Runtime.genericCast<X>(((global::thx.fp.SetImpl) (r) ).@params[1]);
					global::thx.fp.SetImpl l = ((global::thx.fp.SetImpl) (global::thx.fp.SetImpl.Bin(( ( global::thx.fp._Set.Set_Impl_.size<X>(((global::thx.fp.SetImpl) (t1) )) + global::thx.fp._Set.Set_Impl_.size<X>(((global::thx.fp.SetImpl) (t2) )) ) + 1 ), x1, t1, t2)) );
					return global::thx.fp.SetImpl.Bin(( ( global::thx.fp._Set.Set_Impl_.size<X>(((global::thx.fp.SetImpl) (l) )) + global::thx.fp._Set.Set_Impl_.size<X>(((global::thx.fp.SetImpl) (t3) )) ) + 1 ), x2, l, t3);
				}
				else {
					throw global::haxe.lang.HaxeException.wrap(new global::thx.Error("damn it, this should never happen", null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"singleLeft", "thx.fp._Set.Set_Impl_", "Set.hx"}, new int[]{1981972957}, new double[]{((double) (91) )})));
				}
				
			}
		}
		
		
		public static global::thx.fp.SetImpl singleRight<X>(X x1, global::thx.fp.SetImpl l, global::thx.fp.SetImpl t3) {
			unchecked {
				if (( l.index == 1 )) {
					global::thx.fp.SetImpl t2 = ((global::thx.fp.SetImpl) (((global::thx.fp.SetImpl) (l) ).@params[3]) );
					global::thx.fp.SetImpl t1 = ((global::thx.fp.SetImpl) (((global::thx.fp.SetImpl) (l) ).@params[2]) );
					X x2 = global::haxe.lang.Runtime.genericCast<X>(((global::thx.fp.SetImpl) (l) ).@params[1]);
					global::thx.fp.SetImpl r = ((global::thx.fp.SetImpl) (global::thx.fp.SetImpl.Bin(( ( global::thx.fp._Set.Set_Impl_.size<X>(((global::thx.fp.SetImpl) (t2) )) + global::thx.fp._Set.Set_Impl_.size<X>(((global::thx.fp.SetImpl) (t3) )) ) + 1 ), x1, t2, t3)) );
					return global::thx.fp.SetImpl.Bin(( ( global::thx.fp._Set.Set_Impl_.size<X>(((global::thx.fp.SetImpl) (t1) )) + global::thx.fp._Set.Set_Impl_.size<X>(((global::thx.fp.SetImpl) (r) )) ) + 1 ), x2, t1, r);
				}
				else {
					throw global::haxe.lang.HaxeException.wrap(new global::thx.Error("damn it, this should never happen", null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"singleRight", "thx.fp._Set.Set_Impl_", "Set.hx"}, new int[]{1981972957}, new double[]{((double) (97) )})));
				}
				
			}
		}
		
		
		public static global::thx.fp.SetImpl doubleLeft<X>(X x1, global::thx.fp.SetImpl t1, global::thx.fp.SetImpl r) {
			unchecked {
				if (( r.index == 1 )) {
					if (( ((global::thx.fp.SetImpl) (((global::thx.fp.SetImpl) (r) ).@params[2]) ).index == 1 )) {
						global::thx.fp.SetImpl t4 = ((global::thx.fp.SetImpl) (((global::thx.fp.SetImpl) (r) ).@params[3]) );
						X x2 = global::haxe.lang.Runtime.genericCast<X>(((global::thx.fp.SetImpl) (r) ).@params[1]);
						global::thx.fp.SetImpl t3 = ((global::thx.fp.SetImpl) (((global::thx.fp.SetImpl) (((global::thx.fp.SetImpl) (r) ).@params[2]) ).@params[3]) );
						global::thx.fp.SetImpl t2 = ((global::thx.fp.SetImpl) (((global::thx.fp.SetImpl) (((global::thx.fp.SetImpl) (r) ).@params[2]) ).@params[2]) );
						X x3 = global::haxe.lang.Runtime.genericCast<X>(((global::thx.fp.SetImpl) (((global::thx.fp.SetImpl) (r) ).@params[2]) ).@params[1]);
						global::thx.fp.SetImpl l = ((global::thx.fp.SetImpl) (global::thx.fp.SetImpl.Bin(( ( global::thx.fp._Set.Set_Impl_.size<X>(((global::thx.fp.SetImpl) (t1) )) + global::thx.fp._Set.Set_Impl_.size<X>(((global::thx.fp.SetImpl) (t2) )) ) + 1 ), x1, t1, t2)) );
						global::thx.fp.SetImpl r1 = ((global::thx.fp.SetImpl) (global::thx.fp.SetImpl.Bin(( ( global::thx.fp._Set.Set_Impl_.size<X>(((global::thx.fp.SetImpl) (t3) )) + global::thx.fp._Set.Set_Impl_.size<X>(((global::thx.fp.SetImpl) (t4) )) ) + 1 ), x2, t3, t4)) );
						return global::thx.fp.SetImpl.Bin(( ( global::thx.fp._Set.Set_Impl_.size<X>(((global::thx.fp.SetImpl) (l) )) + global::thx.fp._Set.Set_Impl_.size<X>(((global::thx.fp.SetImpl) (r1) )) ) + 1 ), x3, l, r1);
					}
					else {
						throw global::haxe.lang.HaxeException.wrap(new global::thx.Error("damn it, this should never happen", null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"doubleLeft", "thx.fp._Set.Set_Impl_", "Set.hx"}, new int[]{1981972957}, new double[]{((double) (104) )})));
					}
					
				}
				else {
					throw global::haxe.lang.HaxeException.wrap(new global::thx.Error("damn it, this should never happen", null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"doubleLeft", "thx.fp._Set.Set_Impl_", "Set.hx"}, new int[]{1981972957}, new double[]{((double) (104) )})));
				}
				
			}
		}
		
		
		public static global::thx.fp.SetImpl doubleRight<X>(X x1, global::thx.fp.SetImpl l, global::thx.fp.SetImpl t4) {
			unchecked {
				if (( l.index == 1 )) {
					if (( ((global::thx.fp.SetImpl) (((global::thx.fp.SetImpl) (l) ).@params[3]) ).index == 1 )) {
						X x2 = global::haxe.lang.Runtime.genericCast<X>(((global::thx.fp.SetImpl) (l) ).@params[1]);
						global::thx.fp.SetImpl t1 = ((global::thx.fp.SetImpl) (((global::thx.fp.SetImpl) (l) ).@params[2]) );
						global::thx.fp.SetImpl t3 = ((global::thx.fp.SetImpl) (((global::thx.fp.SetImpl) (((global::thx.fp.SetImpl) (l) ).@params[3]) ).@params[3]) );
						global::thx.fp.SetImpl t2 = ((global::thx.fp.SetImpl) (((global::thx.fp.SetImpl) (((global::thx.fp.SetImpl) (l) ).@params[3]) ).@params[2]) );
						X x3 = global::haxe.lang.Runtime.genericCast<X>(((global::thx.fp.SetImpl) (((global::thx.fp.SetImpl) (l) ).@params[3]) ).@params[1]);
						global::thx.fp.SetImpl l1 = ((global::thx.fp.SetImpl) (global::thx.fp.SetImpl.Bin(( ( global::thx.fp._Set.Set_Impl_.size<X>(((global::thx.fp.SetImpl) (t1) )) + global::thx.fp._Set.Set_Impl_.size<X>(((global::thx.fp.SetImpl) (t2) )) ) + 1 ), x2, t1, t2)) );
						global::thx.fp.SetImpl r = ((global::thx.fp.SetImpl) (global::thx.fp.SetImpl.Bin(( ( global::thx.fp._Set.Set_Impl_.size<X>(((global::thx.fp.SetImpl) (t3) )) + global::thx.fp._Set.Set_Impl_.size<X>(((global::thx.fp.SetImpl) (t4) )) ) + 1 ), x1, t3, t4)) );
						return global::thx.fp.SetImpl.Bin(( ( global::thx.fp._Set.Set_Impl_.size<X>(((global::thx.fp.SetImpl) (l1) )) + global::thx.fp._Set.Set_Impl_.size<X>(((global::thx.fp.SetImpl) (r) )) ) + 1 ), x3, l1, r);
					}
					else {
						throw global::haxe.lang.HaxeException.wrap(new global::thx.Error("damn it, this should never happen", null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"doubleRight", "thx.fp._Set.Set_Impl_", "Set.hx"}, new int[]{1981972957}, new double[]{((double) (111) )})));
					}
					
				}
				else {
					throw global::haxe.lang.HaxeException.wrap(new global::thx.Error("damn it, this should never happen", null, new global::haxe.lang.DynamicObject(new int[]{302979532, 1547539107, 1648581351}, new object[]{"doubleRight", "thx.fp._Set.Set_Impl_", "Set.hx"}, new int[]{1981972957}, new double[]{((double) (111) )})));
				}
				
			}
		}
		
		
		public static global::thx.fp.ListImpl toList<X>(global::thx.fp.SetImpl this1) {
			unchecked {
				switch (this1.index) {
					case 0:
					{
						return ((global::thx.fp.ListImpl) (global::thx.fp.ListImpl.Nil) );
					}
					
					
					case 1:
					{
						return global::thx.fp.ListImpl.Cons(global::haxe.lang.Runtime.genericCast<X>(this1.@params[1]), global::thx.fp._List.List_Impl_.concat<X>(((global::thx.fp.ListImpl) (global::thx.fp._Set.Set_Impl_.toList<X>(((global::thx.fp.SetImpl) (this1.@params[2]) ))) ), ((global::thx.fp.ListImpl) (global::thx.fp._Set.Set_Impl_.toList<X>(((global::thx.fp.SetImpl) (this1.@params[3]) ))) )));
					}
					
					
				}
				
				return null;
			}
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace thx.fp {
	public class SetImpl : global::haxe.lang.ParamEnum {
		
		public SetImpl(int index, object[] @params) : base(index, @params) {
		}
		
		
		public static readonly string[] __hx_constructs = new string[]{"Tip", "Bin"};
		
		public static readonly global::thx.fp.SetImpl Tip = new global::thx.fp.SetImpl(0, null);
		
		public static global::thx.fp.SetImpl Bin(int size, object x, global::thx.fp.SetImpl l, global::thx.fp.SetImpl r) {
			unchecked {
				return new global::thx.fp.SetImpl(1, new object[]{size, x, l, r});
			}
		}
		
		
		public override string getTag() {
			return global::thx.fp.SetImpl.__hx_constructs[this.index];
		}
		
		
	}
}


