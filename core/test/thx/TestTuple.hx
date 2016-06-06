package thx;

import utest.Assert;
import thx.Nil;
import thx.Tuple;

class TestTuple {
var x : Int;
  public function new(i) {
 this.x = i;
 }

  public function testTuple0() {
    for (i in 0...x){
    var t = new Tuple0();
    Assert.equals(nil, (t : Nil));
  }}

  public function testTuple1() {
    for (i in 0...x){
    var t = new Tuple1("thx");
    Assert.equals("thx", (t : String));
  }}

  public function testTuple2() {
    for (i in 0...x){
    var t = new Tuple2("thx", 7);
    Assert.equals("thx", t._0);
    Assert.equals(7, t._1);
    Assert.equals("thx", t.left);
    Assert.equals(7, t.right);
  }}
}
