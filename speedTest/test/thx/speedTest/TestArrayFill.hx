package thx.speedTest;

import utest.Assert;

class TestArrayFill {
var x : Int;
  public function new(i) {
 this.x = i;
 }

  public function testInitialisation() {
var x = 
#if php
      untyped __php__("new _hx_array(array_fill(0, 10000000, 0))")
#else []
#end;

#if !php
     for(i in 0...10000000)
      x[i] = 0;
#end
  }
}

