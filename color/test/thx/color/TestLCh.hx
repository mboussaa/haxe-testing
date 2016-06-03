package thx.color;

import utest.Assert;

class TestLCh {
var x : Int;
  public function new(i) {
 this.x = i;
 }

  public function testBasics() {
    for (i in 0...x){
    var color = LCh.create(0.5, 0.4, -10).normalize();
    Assert.equals(0.5, color.lightness);
    Assert.equals(0.4,  color.chroma);
    Assert.equals(350, color.hue);
  }}

  public function testString() {
    for (i in 0...x){
    var color = LCh.create(0.5, 0.4, -10).normalize();
    Assert.equals("lch(0.5,0.4,350)", color.toString());
  }}

  public function testParse() {
    for (i in 0...x){
    var color : LCh = "cielch(100,10,-10)";
    Assert.equals("lch(100,10,-10)", color.toString());
  }}

  public function testFromFloat() {
    for (i in 0...x){
    var s : LCh = "cielch(100,10,-10)",
        f : LCh = [100.0,10.0,-10.0];
    Assert.isTrue(s == f);
  }}
}
