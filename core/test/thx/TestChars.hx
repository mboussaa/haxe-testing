package thx;

import haxe.PosInfos;
import utest.Assert;
using thx.Chars;

class TestChars {
var x : Int;
  public function new(i) {
 this.x = i;
 }

  public function testChars() {
    for (i in 0...x){
    var s = "a☺b☺☺c☺☺☺",
        t : Chars = s,
        e = [97,9786,98,9786,9786,99,9786,9786,9786];
    Assert.same(e, t);
    Assert.equals(s, t.toString());
  }}

  public function testArrayAccess() {
    for (i in 0...x){
    var chars : Chars = "a☺b☺☺c☺☺☺";
    Assert.equals(9786, chars[1]);
    Assert.equals(99, chars[5]);
  }}
}
