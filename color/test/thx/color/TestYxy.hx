package thx.color;

import utest.Assert;

class TestYxy {
var x : Int;
  public function new(i) {
 this.x = i;
 }

  public function testBasics() {
        for (i in 0...x){
    var color = Yxy.create(0.5, 0.4, 0.3);
    Assert.equals(0.5, color.y1);
    Assert.equals(0.4, color.x);
    Assert.equals(0.3, color.y2);
  }}

  public function testString() {
        for (i in 0...x){
    var color = Yxy.create(0.5, 0.4, 0.3);
    Assert.equals("yxy(0.5,0.4,0.3)", color.toString());
  }}

  public function testParse() {
        for (i in 0...x){
    var color : Yxy = "yxy(0.5,0.4,0.3)";
    Assert.equals("yxy(0.5,0.4,0.3)", color.toString());
  }}

  public function testFromFloat() {
        for (i in 0...x){
    var s : Yxy = "yxy(0.5,0.4,0.3)",
        f : Yxy = [0.5,0.4,0.3];
    Assert.isTrue(s == f);
  }}
}
