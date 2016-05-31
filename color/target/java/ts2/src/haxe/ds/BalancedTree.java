// Generated by Haxe 3.3.0
package haxe.ds;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class BalancedTree<K, V> extends haxe.lang.HxObject
{
	public BalancedTree(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public BalancedTree()
	{
		//line 41 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
		haxe.ds.BalancedTree.__hx_ctor_haxe_ds_BalancedTree(((haxe.ds.BalancedTree<K, V>) (this) ));
	}
	
	
	public static <K_c, V_c> void __hx_ctor_haxe_ds_BalancedTree(haxe.ds.BalancedTree<K_c, V_c> __temp_me16)
	{
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
		return new haxe.ds.BalancedTree<java.lang.Object, java.lang.Object>(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
		return new haxe.ds.BalancedTree<java.lang.Object, java.lang.Object>();
	}
	
	
	public haxe.ds.TreeNode<K, V> root;
	
	public void set(K key, V value)
	{
		//line 51 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
		this.root = this.setLoop(key, value, this.root);
	}
	
	
	public java.lang.Object get(K key)
	{
		//line 62 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
		haxe.ds.TreeNode<K, V> node = this.root;
		//line 63 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
		while (( node != null ))
		{
			//line 64 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
			int c = this.compare(key, node.key);
			//line 65 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
			if (( c == 0 )) 
			{
				//line 65 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
				return node.value;
			}
			
			//line 66 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
			if (( c < 0 )) 
			{
				//line 66 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
				node = node.left;
			}
			else
			{
				//line 67 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
				node = node.right;
			}
			
		}
		
		//line 69 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
		return null;
	}
	
	
	public boolean remove(K key)
	{
		//line 83 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
		try 
		{
			//line 84 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
			this.root = this.removeLoop(key, this.root);
			//line 85 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
			return true;
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 83 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 88 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 88 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 88 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 88 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
			if (( __temp_catchall2 instanceof java.lang.String )) 
			{
				//line 88 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
				java.lang.String e = haxe.lang.Runtime.toString(__temp_catchall2);
				//line 88 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
				{
					//line 88 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					return false;
				}
				
			}
			else
			{
				//line 88 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
				throw haxe.lang.HaxeException.wrap(__temp_catchallException1);
			}
			
		}
		
		
	}
	
	
	public boolean exists(K key)
	{
		//line 100 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
		haxe.ds.TreeNode<K, V> node = this.root;
		//line 101 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
		while (( node != null ))
		{
			//line 102 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
			int c = this.compare(key, node.key);
			//line 103 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
			if (( c == 0 )) 
			{
				//line 103 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
				return true;
			}
			else
			{
				//line 104 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
				if (( c < 0 )) 
				{
					//line 104 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					node = node.left;
				}
				else
				{
					//line 105 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					node = node.right;
				}
				
			}
			
		}
		
		//line 107 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
		return false;
	}
	
	
	public java.lang.Object iterator()
	{
		//line 116 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
		haxe.root.Array<V> ret = new haxe.root.Array<V>(( (V[]) (new java.lang.Object[] {}) ));
		//line 117 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
		this.iteratorLoop(this.root, ret);
		//line 118 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
		return ((java.lang.Object) (new _Array.ArrayIterator<V>(((haxe.root.Array<V>) (ret) ))) );
	}
	
	
	public java.lang.Object keys()
	{
		//line 127 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
		haxe.root.Array<K> ret = new haxe.root.Array<K>(( (K[]) (new java.lang.Object[] {}) ));
		//line 128 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
		this.keysLoop(this.root, ret);
		//line 129 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
		return ((java.lang.Object) (new _Array.ArrayIterator<K>(((haxe.root.Array<K>) (ret) ))) );
	}
	
	
	public haxe.ds.TreeNode<K, V> setLoop(K k, V v, haxe.ds.TreeNode<K, V> node)
	{
		//line 133 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
		if (( node == null )) 
		{
			//line 133 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
			return new haxe.ds.TreeNode<K, V>(null, k, v, null, null);
		}
		
		//line 134 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
		int c = this.compare(k, node.key);
		//line 135 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
		if (( c == 0 )) 
		{
			//line 135 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
			return new haxe.ds.TreeNode<K, V>(node.left, k, v, node.right, ( (( node == null )) ? (0) : (node._height) ));
		}
		else
		{
			//line 136 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
			if (( c < 0 )) 
			{
				//line 137 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
				haxe.ds.TreeNode<K, V> nl = this.setLoop(k, v, node.left);
				//line 135 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
				return this.balance(nl, node.key, node.value, node.right);
			}
			else
			{
				//line 140 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
				haxe.ds.TreeNode<K, V> nr = this.setLoop(k, v, node.right);
				//line 135 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
				return this.balance(node.left, node.key, node.value, nr);
			}
			
		}
		
	}
	
	
	public haxe.ds.TreeNode<K, V> removeLoop(K k, haxe.ds.TreeNode<K, V> node)
	{
		//line 146 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
		if (( node == null )) 
		{
			//line 146 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
			throw haxe.lang.HaxeException.wrap("Not_found");
		}
		
		//line 147 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
		int c = this.compare(k, node.key);
		//line 148 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
		if (( c == 0 )) 
		{
			//line 148 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
			return this.merge(node.left, node.right);
		}
		else
		{
			//line 149 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
			if (( c < 0 )) 
			{
				//line 148 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
				return this.balance(this.removeLoop(k, node.left), node.key, node.value, node.right);
			}
			else
			{
				//line 148 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
				return this.balance(node.left, node.key, node.value, this.removeLoop(k, node.right));
			}
			
		}
		
	}
	
	
	public void iteratorLoop(haxe.ds.TreeNode<K, V> node, haxe.root.Array<V> acc)
	{
		//line 154 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
		if (( node != null )) 
		{
			//line 155 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
			this.iteratorLoop(node.left, acc);
			//line 156 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
			acc.push(node.value);
			//line 157 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
			this.iteratorLoop(node.right, acc);
		}
		
	}
	
	
	public void keysLoop(haxe.ds.TreeNode<K, V> node, haxe.root.Array<K> acc)
	{
		//line 162 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
		if (( node != null )) 
		{
			//line 163 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
			this.keysLoop(node.left, acc);
			//line 164 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
			acc.push(node.key);
			//line 165 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
			this.keysLoop(node.right, acc);
		}
		
	}
	
	
	public haxe.ds.TreeNode<K, V> merge(haxe.ds.TreeNode<K, V> t1, haxe.ds.TreeNode<K, V> t2)
	{
		//line 170 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
		if (( t1 == null )) 
		{
			//line 170 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
			return t2;
		}
		
		//line 171 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
		if (( t2 == null )) 
		{
			//line 171 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
			return t1;
		}
		
		//line 172 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
		haxe.ds.TreeNode<K, V> t = this.minBinding(t2);
		//line 173 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
		return this.balance(t1, t.key, t.value, this.removeMinBinding(t2));
	}
	
	
	public haxe.ds.TreeNode<K, V> minBinding(haxe.ds.TreeNode<K, V> t)
	{
		//line 177 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
		if (( t == null )) 
		{
			//line 177 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
			throw haxe.lang.HaxeException.wrap("Not_found");
		}
		else
		{
			//line 178 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
			if (( t.left == null )) 
			{
				//line 177 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
				return t;
			}
			else
			{
				//line 177 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
				return this.minBinding(t.left);
			}
			
		}
		
	}
	
	
	public haxe.ds.TreeNode<K, V> removeMinBinding(haxe.ds.TreeNode<K, V> t)
	{
		//line 183 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
		if (( t.left == null )) 
		{
			//line 183 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
			return t.right;
		}
		else
		{
			//line 183 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
			return this.balance(this.removeMinBinding(t.left), t.key, t.value, t.right);
		}
		
	}
	
	
	public haxe.ds.TreeNode<K, V> balance(haxe.ds.TreeNode<K, V> l, K k, V v, haxe.ds.TreeNode<K, V> r)
	{
		//line 188 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
		int hl = ( (( l == null )) ? (0) : (l._height) );
		//line 189 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
		int hr = ( (( r == null )) ? (0) : (r._height) );
		//line 190 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
		if (( hl > ( hr + 2 ) )) 
		{
			//line 191 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
			haxe.ds.TreeNode<K, V> _this = l.left;
			//line 191 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
			int tmp = ( (( _this == null )) ? (0) : (_this._height) );
			//line 191 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
			haxe.ds.TreeNode<K, V> _this1 = l.right;
			//line 191 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
			if (( tmp >= (( (( _this1 == null )) ? (0) : (_this1._height) )) )) 
			{
				//line 190 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
				return new haxe.ds.TreeNode<K, V>(l.left, l.key, l.value, new haxe.ds.TreeNode<K, V>(l.right, k, v, r, null), null);
			}
			else
			{
				//line 190 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
				return new haxe.ds.TreeNode<K, V>(new haxe.ds.TreeNode<K, V>(l.left, l.key, l.value, l.right.left, null), l.right.key, l.right.value, new haxe.ds.TreeNode<K, V>(l.right.right, k, v, r, null), null);
			}
			
		}
		else
		{
			//line 193 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
			if (( hr > ( hl + 2 ) )) 
			{
				//line 194 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
				haxe.ds.TreeNode<K, V> _this2 = r.right;
				//line 194 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
				int tmp1 = ( (( _this2 == null )) ? (0) : (_this2._height) );
				//line 194 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
				haxe.ds.TreeNode<K, V> _this3 = r.left;
				//line 194 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
				if (( tmp1 > (( (( _this3 == null )) ? (0) : (_this3._height) )) )) 
				{
					//line 190 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					return new haxe.ds.TreeNode<K, V>(new haxe.ds.TreeNode<K, V>(l, k, v, r.left, null), r.key, r.value, r.right, null);
				}
				else
				{
					//line 190 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					return new haxe.ds.TreeNode<K, V>(new haxe.ds.TreeNode<K, V>(l, k, v, r.left.left, null), r.left.key, r.left.value, new haxe.ds.TreeNode<K, V>(r.left.right, r.key, r.value, r.right, null), null);
				}
				
			}
			else
			{
				//line 190 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
				return new haxe.ds.TreeNode<K, V>(l, k, v, r, ( (( (( hl > hr )) ? (hl) : (hr) )) + 1 ));
			}
			
		}
		
	}
	
	
	public int compare(K k1, K k2)
	{
		//line 202 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
		return ((int) (haxe.root.Reflect.compare(((K) (k1) ), ((K) (k2) ))) );
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
		{
			//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
			boolean __temp_executeDef1 = true;
			//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
			switch (field.hashCode())
			{
				case 3506402:
				{
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					if (field.equals("root")) 
					{
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						__temp_executeDef1 = false;
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						this.root = ((haxe.ds.TreeNode<K, V>) (value) );
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						return value;
					}
					
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					break;
				}
				
				
			}
			
			//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
			if (__temp_executeDef1) 
			{
				//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
		{
			//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
			boolean __temp_executeDef1 = true;
			//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
			switch (field.hashCode())
			{
				case 950484197:
				{
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					if (field.equals("compare")) 
					{
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						__temp_executeDef1 = false;
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "compare")) );
					}
					
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					break;
				}
				
				
				case 3506402:
				{
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					if (field.equals("root")) 
					{
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						__temp_executeDef1 = false;
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						return this.root;
					}
					
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					break;
				}
				
				
				case -339185956:
				{
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					if (field.equals("balance")) 
					{
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						__temp_executeDef1 = false;
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "balance")) );
					}
					
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					break;
				}
				
				
				case 113762:
				{
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					if (field.equals("set")) 
					{
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						__temp_executeDef1 = false;
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set")) );
					}
					
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					break;
				}
				
				
				case 277888887:
				{
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					if (field.equals("removeMinBinding")) 
					{
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						__temp_executeDef1 = false;
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "removeMinBinding")) );
					}
					
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					break;
				}
				
				
				case 102230:
				{
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					if (field.equals("get")) 
					{
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						__temp_executeDef1 = false;
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get")) );
					}
					
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					break;
				}
				
				
				case -757252141:
				{
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					if (field.equals("minBinding")) 
					{
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						__temp_executeDef1 = false;
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "minBinding")) );
					}
					
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					break;
				}
				
				
				case -934610812:
				{
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					if (field.equals("remove")) 
					{
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						__temp_executeDef1 = false;
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "remove")) );
					}
					
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					break;
				}
				
				
				case 103785528:
				{
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					if (field.equals("merge")) 
					{
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						__temp_executeDef1 = false;
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "merge")) );
					}
					
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					break;
				}
				
				
				case -1289358244:
				{
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					if (field.equals("exists")) 
					{
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						__temp_executeDef1 = false;
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "exists")) );
					}
					
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					break;
				}
				
				
				case 518409912:
				{
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					if (field.equals("keysLoop")) 
					{
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						__temp_executeDef1 = false;
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "keysLoop")) );
					}
					
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					break;
				}
				
				
				case 1182533742:
				{
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					if (field.equals("iterator")) 
					{
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						__temp_executeDef1 = false;
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "iterator")) );
					}
					
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					break;
				}
				
				
				case 527064114:
				{
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					if (field.equals("iteratorLoop")) 
					{
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						__temp_executeDef1 = false;
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "iteratorLoop")) );
					}
					
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					break;
				}
				
				
				case 3288564:
				{
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					if (field.equals("keys")) 
					{
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						__temp_executeDef1 = false;
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "keys")) );
					}
					
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					break;
				}
				
				
				case 1098338632:
				{
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					if (field.equals("removeLoop")) 
					{
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						__temp_executeDef1 = false;
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "removeLoop")) );
					}
					
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					break;
				}
				
				
				case 1984755238:
				{
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					if (field.equals("setLoop")) 
					{
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						__temp_executeDef1 = false;
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setLoop")) );
					}
					
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					break;
				}
				
				
			}
			
			//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
			if (__temp_executeDef1) 
			{
				//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
		{
			//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
			boolean __temp_executeDef1 = true;
			//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
			switch (field.hashCode())
			{
				case 950484197:
				{
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					if (field.equals("compare")) 
					{
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						__temp_executeDef1 = false;
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						return this.compare(((K) (dynargs.__get(0)) ), ((K) (dynargs.__get(1)) ));
					}
					
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					break;
				}
				
				
				case 113762:
				{
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					if (field.equals("set")) 
					{
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						__temp_executeDef1 = false;
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						this.set(((K) (dynargs.__get(0)) ), ((V) (dynargs.__get(1)) ));
					}
					
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					break;
				}
				
				
				case -339185956:
				{
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					if (field.equals("balance")) 
					{
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						__temp_executeDef1 = false;
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						return this.balance(((haxe.ds.TreeNode<K, V>) (dynargs.__get(0)) ), ((K) (dynargs.__get(1)) ), ((V) (dynargs.__get(2)) ), ((haxe.ds.TreeNode<K, V>) (dynargs.__get(3)) ));
					}
					
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					break;
				}
				
				
				case 102230:
				{
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					if (field.equals("get")) 
					{
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						__temp_executeDef1 = false;
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						return this.get(((K) (dynargs.__get(0)) ));
					}
					
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					break;
				}
				
				
				case 277888887:
				{
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					if (field.equals("removeMinBinding")) 
					{
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						__temp_executeDef1 = false;
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						return this.removeMinBinding(((haxe.ds.TreeNode<K, V>) (dynargs.__get(0)) ));
					}
					
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					break;
				}
				
				
				case -934610812:
				{
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					if (field.equals("remove")) 
					{
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						__temp_executeDef1 = false;
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						return this.remove(((K) (dynargs.__get(0)) ));
					}
					
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					break;
				}
				
				
				case -757252141:
				{
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					if (field.equals("minBinding")) 
					{
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						__temp_executeDef1 = false;
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						return this.minBinding(((haxe.ds.TreeNode<K, V>) (dynargs.__get(0)) ));
					}
					
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					break;
				}
				
				
				case -1289358244:
				{
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					if (field.equals("exists")) 
					{
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						__temp_executeDef1 = false;
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						return this.exists(((K) (dynargs.__get(0)) ));
					}
					
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					break;
				}
				
				
				case 103785528:
				{
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					if (field.equals("merge")) 
					{
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						__temp_executeDef1 = false;
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						return this.merge(((haxe.ds.TreeNode<K, V>) (dynargs.__get(0)) ), ((haxe.ds.TreeNode<K, V>) (dynargs.__get(1)) ));
					}
					
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					break;
				}
				
				
				case 1182533742:
				{
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					if (field.equals("iterator")) 
					{
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						__temp_executeDef1 = false;
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						return this.iterator();
					}
					
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					break;
				}
				
				
				case 518409912:
				{
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					if (field.equals("keysLoop")) 
					{
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						__temp_executeDef1 = false;
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						this.keysLoop(((haxe.ds.TreeNode<K, V>) (dynargs.__get(0)) ), ((haxe.root.Array<K>) (dynargs.__get(1)) ));
					}
					
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					break;
				}
				
				
				case 3288564:
				{
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					if (field.equals("keys")) 
					{
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						__temp_executeDef1 = false;
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						return this.keys();
					}
					
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					break;
				}
				
				
				case 527064114:
				{
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					if (field.equals("iteratorLoop")) 
					{
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						__temp_executeDef1 = false;
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						this.iteratorLoop(((haxe.ds.TreeNode<K, V>) (dynargs.__get(0)) ), ((haxe.root.Array<V>) (dynargs.__get(1)) ));
					}
					
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					break;
				}
				
				
				case 1984755238:
				{
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					if (field.equals("setLoop")) 
					{
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						__temp_executeDef1 = false;
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						return this.setLoop(((K) (dynargs.__get(0)) ), ((V) (dynargs.__get(1)) ), ((haxe.ds.TreeNode<K, V>) (dynargs.__get(2)) ));
					}
					
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					break;
				}
				
				
				case 1098338632:
				{
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					if (field.equals("removeLoop")) 
					{
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						__temp_executeDef1 = false;
						//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
						return this.removeLoop(((K) (dynargs.__get(0)) ), ((haxe.ds.TreeNode<K, V>) (dynargs.__get(1)) ));
					}
					
					//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
					break;
				}
				
				
			}
			
			//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
			if (__temp_executeDef1) 
			{
				//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
		baseArr.push("root");
		//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
		{
			//line 35 "/usr/lib/haxe/std/haxe/ds/BalancedTree.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


