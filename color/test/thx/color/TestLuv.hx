package thx.color;

import utest.Assert;

class TestLuv {
var x : Int;
  public function new(i) {
 this.x = i;
 }

  public function testBasics() {
    for (i in 0...x){
    var color = Luv.create(0.5, 0.4, 0.6).normalize();
    Assert.equals(0.5, color.l);
    Assert.equals(0.4, color.u);
    Assert.equals(0.6, color.v);
  }}

  public function testString() {
    for (i in 0...x){
    var color = Luv.create(0.5, 0.4, 0.6).normalize();
    Assert.equals("cieluv(0.5,0.4,0.6)", color.toString());
  }}

  public function testParse() {
    for (i in 0...x){
    var color : Luv = "cieluv(0.5,0.4,0.6)";
    Assert.equals("cieluv(0.5,0.4,0.6)", color.toString());
  }}

  public function testFromFloat() {
    for (i in 0...x){
    var s : Luv = "cieluv(0.5,0.4,0.6)",
        f : Luv = [0.5,0.4,0.6];
    Assert.isTrue(s == f);
  }}

  public function testXyz() {
    for (i in 0...x){
    var luv = Luv.create(0.5, 0.4, 0.6),
        xyz = (luv : Xyz),
        out = (xyz : Luv);
    Assert.isTrue(luv.nearEquals(xyz));
  }}
}
