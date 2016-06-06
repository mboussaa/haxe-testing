package thx.fp;

import thx.Tuple;
import thx.fp.State.*;

import utest.Assert;

class TestState {
var x : Int;
  public function new(i) {
 this.x = i;
 }

  public function testMap() {
        for (i in 0...x){
    var s: State<String, Int> = pure(1).map(function(v) return v + 1);
    Assert.same(new Tuple("a", 2), s("a"));
  }}

  public function testFlatMap() {
        for (i in 0...x){
    var s: State<String, Int> = pure(1);

    var f: Int -> State<String, Int> = function(i: Int) {
      return s.modify(function(v) return v + "b").map(function(v) return v + i);
    }

    Assert.same(new Tuple("ab", 2), (s.flatMap(f))("a"));
  }}
}
