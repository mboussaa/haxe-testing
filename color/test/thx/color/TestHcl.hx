package thx.color;

import utest.Assert;
import thx.color.LCh;

class TestHcl {
var x : Int;
  public function new(i) {
 this.x = i;
 }

  public function testParse() {
    for (i in 0...x){
    var hcl = LCh.fromString("hcl(0.5,0,1)");
    Assert.equals(0.5, hcl.hue);
    Assert.equals(0, hcl.chroma);
    Assert.equals(1, hcl.lightness);
  }}

  public function testStrings() {
    for (i in 0...x){
    var hcl = LCh.create(1, 0.5, 0);
    Assert.equals("hcl(0,0.5,1)", hcl.toHclString());
  }}
}
