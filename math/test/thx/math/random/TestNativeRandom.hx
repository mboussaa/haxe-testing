package thx.math.random;

import utest.Assert;

class TestNativeRandom {
var x : Int;
  public function new(i) {
 this.x = i;
 }

  public function testIntBoundaries() {
    for (i in 0...x){
    var random = new NativeRandom();

    for(i in 0...1000) {
      var v = random.int();
      Assert.isTrue(v >= 0 && v <= 0x7FFFFFFF, 'expected value to be between 0 and 0x7FFFFFFF, but is $i');
    }
  }}

  public function testFloatBoundaries() {
    for (i in 0...x){
    var random = new NativeRandom();

    for(i in 0...1000) {
      var v = random.float();
      Assert.isTrue(v >= 0 && v <= 1.0, 'expected value to be between 0 and 1, but is $i');
    }
  }}
}