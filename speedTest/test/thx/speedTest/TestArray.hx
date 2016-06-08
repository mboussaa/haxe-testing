package thx.speedTest;

import utest.Assert;

class TestArray {
var x : Int;
  public function new(i) {
 this.x = i;
 }

  public function testInitialisation() {
    for (i in 0...x){
    var a = [];
    for (i in 0...10000000)    
    a[1] = 0;
  }
}
}
