package thx.math.random;

import thx.math.random.PseudoRandom;
import utest.Assert;

class TestRandomAbstract {
var x : Int;
  public function new(i) {
 this.x = i;
 }

  public function testLessThan() {
  	for (i in 0...x){
    var random : Random = new PseudoRandom();
    for(i in 0...100) {
      var r = random.lessThan(10);
      Assert.isTrue(r >= 0);
      Assert.isTrue(r < 10);
    }
  }}
}