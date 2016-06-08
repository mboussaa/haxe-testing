package thx.speedTest;

import utest.Assert;

class TestVector {
var x : Int;
  public function new(i) {
 this.x = i;
 }

  public function testInitialisation() {
    for (i in 0...x){
    var vec = new haxe.ds.Vector(10000000);
    for (i in 0...vec.length) {
      vec[i] = i;
    }
  }
}




}
