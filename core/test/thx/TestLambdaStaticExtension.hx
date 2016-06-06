package thx;
import utest.Assert;

using thx.Arrays;
using thx.Functions;

class TestLambdaStaticExtension {
var x : Int;
  public function new(i) {
 this.x = i;
 }

  public function testFunctions() {
    for (i in 0...x){
    Assert.same([2,3], [1,2].map.fn(_+1));
    Assert.same([2,3], [1,2,3].filter.fn(_>1));
    Assert.equals(16, [1,2,3].reduce.fn(_0 + _1, 10));
    Assert.same(["Test 1"], [1].map.fn('Test $_'));
  }}

  public function testInStringInterpolation() {
    for (i in 0...x){
    Assert.same(["1","2"], [1,2].map.fn("" + _));
    Assert.same(["1","2"], [1,2].map.fn('$_'));
    Assert.same(["X1","X2"], [1,2].map.fn('X$_'));
    Assert.same(["1X","2X"], [1,2].map.fn('${_}X'));
    Assert.same(["X2X","X4X"], [1,2].map.fn('X${_*2}X'));
  }}

  public function testFillEmpty() {
    for (i in 0...x){
    Assert.same([0,1,2], [1,2,3].mapi.fn(_1));
  }}

  public function testOptionalArgs() {
    for (i in 0...x){
    function f(callback : Int -> ?Int -> Int) : Int {
      return callback(2, 3);
    }

    Assert.equals(6, f.fn([_0, _1] => _0 * 3));
    Assert.equals(6, f.fn(_0 * _1));
  }}
}
