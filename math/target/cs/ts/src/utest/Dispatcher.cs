// Generated by Haxe 3.3.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace utest._Dispatcher {
	public class EventException : global::haxe.lang.Enum {
		
		public EventException(int index) : base(index) {
		}
		
		
		public static readonly string[] __hx_constructs = new string[]{"StopPropagation"};
		
		public static readonly global::utest._Dispatcher.EventException StopPropagation = new global::utest._Dispatcher.EventException(0);
		
		public override string getTag() {
			return global::utest._Dispatcher.EventException.__hx_constructs[this.index];
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace utest {
	public class Dispatcher<T> : global::haxe.lang.HxObject, global::utest.Dispatcher {
		
		public Dispatcher(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public Dispatcher() {
			global::utest.Dispatcher<object>.__hx_ctor_utest_Dispatcher<T>(((global::utest.Dispatcher<T>) (this) ));
		}
		
		
		public static void __hx_ctor_utest_Dispatcher<T_c>(global::utest.Dispatcher<T_c> __temp_me141) {
			__temp_me141.handlers = new global::Array<object>();
		}
		
		
		public static object __hx_cast<T_c_c>(global::utest.Dispatcher me) {
			return ( (( me != null )) ? (me.utest_Dispatcher_cast<T_c_c>()) : (null) );
		}
		
		
		public static void stop() {
			throw global::haxe.lang.HaxeException.wrap(global::utest._Dispatcher.EventException.StopPropagation);
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::utest.Dispatcher<object>(global::haxe.lang.EmptyObject.EMPTY);
		}
		
		
		public static new object __hx_create(global::Array arr) {
			return new global::utest.Dispatcher<object>();
		}
		
		
		public virtual object utest_Dispatcher_cast<T_c>() {
			if (global::haxe.lang.Runtime.eq(typeof(T), typeof(T_c))) {
				return this;
			}
			
			global::utest.Dispatcher<T_c> new_me = new global::utest.Dispatcher<T_c>(global::haxe.lang.EmptyObject.EMPTY);
			global::Array<object> fields = global::Reflect.fields(this);
			int i = 0;
			while (( i < fields.length )) {
				string field = global::haxe.lang.Runtime.toString(fields[i++]);
				global::Reflect.setField(new_me, field, global::Reflect.field(this, field));
			}
			
			return new_me;
		}
		
		
		public global::Array<object> handlers;
		
		public virtual global::haxe.lang.Function @add(global::haxe.lang.Function h) {
			this.handlers.push(h);
			return h;
		}
		
		
		public virtual global::haxe.lang.Function @remove(global::haxe.lang.Function h) {
			unchecked {
				{
					int _g1 = 0;
					int _g = this.handlers.length;
					while (( _g1 < _g )) {
						int i = _g1++;
						if (global::Reflect.compareMethods(((global::haxe.lang.Function) (this.handlers[i]) ), h)) {
							return ((global::haxe.lang.Function) (this.handlers.splice(i, 1)[0]) );
						}
						
					}
					
				}
				
				return null;
			}
		}
		
		
		public virtual void clear() {
			this.handlers = new global::Array<object>();
		}
		
		
		public virtual bool dispatch(T e) {
			try {
				global::Array<object> list = this.handlers.copy();
				{
					int _g = 0;
					while (( _g < list.length )) {
						global::haxe.lang.Function l = ((global::haxe.lang.Function) (list[_g]) );
						 ++ _g;
						l.__hx_invoke1_o(default(double), e);
					}
					
				}
				
				return true;
			}
			catch (global::System.Exception __temp_catchallException1){
				global::haxe.lang.Exceptions.exception = __temp_catchallException1;
				object __temp_catchall2 = __temp_catchallException1;
				if (( __temp_catchall2 is global::haxe.lang.HaxeException )) {
					__temp_catchall2 = ((global::haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
				}
				
				if (( __temp_catchall2 is global::utest._Dispatcher.EventException )) {
					global::utest._Dispatcher.EventException exc = ((global::utest._Dispatcher.EventException) (__temp_catchall2) );
					{
						return false;
					}
					
				}
				else {
					throw;
				}
				
			}
			
			
			return default(bool);
		}
		
		
		public virtual bool has() {
			return ( this.handlers.length > 0 );
		}
		
		
		public override object __hx_setField(string field, int hash, object @value, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 1428431209:
					{
						this.handlers = ((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (@value) ))) );
						return @value;
					}
					
					
					default:
					{
						return base.__hx_setField(field, hash, @value, handleProperties);
					}
					
				}
				
			}
		}
		
		
		public override object __hx_getField(string field, int hash, bool throwErrors, bool isCheck, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 5193562:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "has", 5193562)) );
					}
					
					
					case 509857466:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "dispatch", 509857466)) );
					}
					
					
					case 1213952397:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "clear", 1213952397)) );
					}
					
					
					case 76061764:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "remove", 76061764)) );
					}
					
					
					case 4846113:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "add", 4846113)) );
					}
					
					
					case 1428431209:
					{
						return this.handlers;
					}
					
					
					default:
					{
						return base.__hx_getField(field, hash, throwErrors, isCheck, handleProperties);
					}
					
				}
				
			}
		}
		
		
		public override object __hx_invokeField(string field, int hash, global::Array dynargs) {
			unchecked {
				switch (hash) {
					case 5193562:
					{
						return this.has();
					}
					
					
					case 509857466:
					{
						return this.dispatch(global::haxe.lang.Runtime.genericCast<T>(dynargs[0]));
					}
					
					
					case 1213952397:
					{
						this.clear();
						break;
					}
					
					
					case 76061764:
					{
						return this.@remove(((global::haxe.lang.Function) (dynargs[0]) ));
					}
					
					
					case 4846113:
					{
						return this.@add(((global::haxe.lang.Function) (dynargs[0]) ));
					}
					
					
					default:
					{
						return base.__hx_invokeField(field, hash, dynargs);
					}
					
				}
				
				return null;
			}
		}
		
		
		public override void __hx_getFields(global::Array<object> baseArr) {
			baseArr.push("handlers");
			{
				base.__hx_getFields(baseArr);
			}
			
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace utest {
	[global::haxe.lang.GenericInterface(typeof(global::utest.Dispatcher<object>))]
	public interface Dispatcher : global::haxe.lang.IHxObject, global::haxe.lang.IGenericObject {
		
		object utest_Dispatcher_cast<T_c>();
		
		void clear();
		
		bool has();
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace utest {
	public class Notifier : global::haxe.lang.HxObject {
		
		public Notifier(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public Notifier() {
			global::utest.Notifier.__hx_ctor_utest_Notifier(this);
		}
		
		
		public static void __hx_ctor_utest_Notifier(global::utest.Notifier __temp_me142) {
			__temp_me142.handlers = new global::Array<object>();
		}
		
		
		public static void stop() {
			throw global::haxe.lang.HaxeException.wrap(global::utest._Dispatcher.EventException.StopPropagation);
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::utest.Notifier(global::haxe.lang.EmptyObject.EMPTY);
		}
		
		
		public static new object __hx_create(global::Array arr) {
			return new global::utest.Notifier();
		}
		
		
		public global::Array<object> handlers;
		
		public virtual global::haxe.lang.Function @add(global::haxe.lang.Function h) {
			this.handlers.push(h);
			return h;
		}
		
		
		public virtual global::haxe.lang.Function @remove(global::haxe.lang.Function h) {
			unchecked {
				{
					int _g1 = 0;
					int _g = this.handlers.length;
					while (( _g1 < _g )) {
						int i = _g1++;
						if (global::Reflect.compareMethods(((global::haxe.lang.Function) (this.handlers[i]) ), h)) {
							return ((global::haxe.lang.Function) (this.handlers.splice(i, 1)[0]) );
						}
						
					}
					
				}
				
				return null;
			}
		}
		
		
		public virtual void clear() {
			this.handlers = new global::Array<object>();
		}
		
		
		public virtual bool dispatch() {
			try {
				global::Array<object> list = this.handlers.copy();
				{
					int _g = 0;
					while (( _g < list.length )) {
						global::haxe.lang.Function l = ((global::haxe.lang.Function) (list[_g]) );
						 ++ _g;
						l.__hx_invoke0_o();
					}
					
				}
				
				return true;
			}
			catch (global::System.Exception __temp_catchallException1){
				global::haxe.lang.Exceptions.exception = __temp_catchallException1;
				object __temp_catchall2 = __temp_catchallException1;
				if (( __temp_catchall2 is global::haxe.lang.HaxeException )) {
					__temp_catchall2 = ((global::haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
				}
				
				if (( __temp_catchall2 is global::utest._Dispatcher.EventException )) {
					global::utest._Dispatcher.EventException exc = ((global::utest._Dispatcher.EventException) (__temp_catchall2) );
					{
						return false;
					}
					
				}
				else {
					throw;
				}
				
			}
			
			
			return default(bool);
		}
		
		
		public virtual bool has() {
			return ( this.handlers.length > 0 );
		}
		
		
		public override object __hx_setField(string field, int hash, object @value, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 1428431209:
					{
						this.handlers = ((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (@value) ))) );
						return @value;
					}
					
					
					default:
					{
						return base.__hx_setField(field, hash, @value, handleProperties);
					}
					
				}
				
			}
		}
		
		
		public override object __hx_getField(string field, int hash, bool throwErrors, bool isCheck, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 5193562:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "has", 5193562)) );
					}
					
					
					case 509857466:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "dispatch", 509857466)) );
					}
					
					
					case 1213952397:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "clear", 1213952397)) );
					}
					
					
					case 76061764:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "remove", 76061764)) );
					}
					
					
					case 4846113:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "add", 4846113)) );
					}
					
					
					case 1428431209:
					{
						return this.handlers;
					}
					
					
					default:
					{
						return base.__hx_getField(field, hash, throwErrors, isCheck, handleProperties);
					}
					
				}
				
			}
		}
		
		
		public override object __hx_invokeField(string field, int hash, global::Array dynargs) {
			unchecked {
				switch (hash) {
					case 5193562:
					{
						return this.has();
					}
					
					
					case 509857466:
					{
						return this.dispatch();
					}
					
					
					case 1213952397:
					{
						this.clear();
						break;
					}
					
					
					case 76061764:
					{
						return this.@remove(((global::haxe.lang.Function) (dynargs[0]) ));
					}
					
					
					case 4846113:
					{
						return this.@add(((global::haxe.lang.Function) (dynargs[0]) ));
					}
					
					
					default:
					{
						return base.__hx_invokeField(field, hash, dynargs);
					}
					
				}
				
				return null;
			}
		}
		
		
		public override void __hx_getFields(global::Array<object> baseArr) {
			baseArr.push("handlers");
			{
				base.__hx_getFields(baseArr);
			}
			
		}
		
		
	}
}


