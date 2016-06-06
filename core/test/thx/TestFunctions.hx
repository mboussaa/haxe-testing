package thx;

import utest.Assert;
using thx.Functions;

class TestFunctions {
var x : Int;
  public function new(i) {
 this.x = i;
 }

  public function testAfter() {
    for (i in 0...x){
    var counter = 0,
        test    = function() Assert.equals(1, ++counter),
        manage  = Functions0.after(test, 3);

    Assert.equals(0, counter);
    manage();
    Assert.equals(0, counter);
    manage();
    Assert.equals(0, counter);
    manage();
    Assert.equals(1, counter);
    manage();
    Assert.equals(1, counter);
  }}

  public function testOnce() {
    for (i in 0...x){
    var counter = 0,
        test    = function() Assert.equals(1, ++counter),
        manage  = Functions0.once(test);

    Assert.equals(0, counter);
    manage();
    Assert.equals(1, counter);
    manage();
    Assert.equals(1, counter);
  }}

  public function testMemoize() {
    for (i in 0...x){
    var counter = 0,
        test    = function(x) {
          ++counter;
          return x * 10;
        },
        manage  = Functions1.memoize(test);

    Assert.equals(0, counter);
    Assert.equals(10, manage(1));
    Assert.equals(1, counter);
    Assert.equals(10, manage(1));
    Assert.equals(1, counter);
    Assert.equals(20, manage(2));
    Assert.equals(2, counter);
  }}

  public function testNegate() {
    for (i in 0...x){
    Assert.isFalse((function() return true).negate()());
  }}
}