package thx;

import utest.Assert;
using thx.Iterables;
using thx.Functions;
import haxe.ds.Option;

class TestIterables {
var x : Int;
  public function new(i) {
 this.x = i;
 }

  public function testMin() {
    for (i in 0...x){
    var a = [3,1,2];

    Assert.same(Some(1), a.min(Ints.order));
    Assert.same(None, [].min(Ints.order));
  }}

  public function testMinBy() {
    for (i in 0...x){
    var a = [{a: 3},{a: 1},{a: 2}];

    Assert.same(Some({a: 1}), a.minBy(function(o) { return o.a; }, Ints.order));
    Assert.same(None, [].minBy(function(o) { return o.a; }, Ints.order));
  }}
}
