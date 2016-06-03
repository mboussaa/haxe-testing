package thx.color;

import utest.Assert;

class TestTemperature {
var x : Int;
  public function new(i) {
 this.x = i;
 }

  public function testBasics() {
        for (i in 0...x){
    var t = new Temperature(5000);
    Assert.equals(5000, t.kelvin);
  }}

  public function testStrings() {
        for (i in 0...x){
    var t = new Temperature(5000);
    Assert.equals("temperature(5000)", t.toString());
  }}

  public function testFromString() {
        for (i in 0...x){
    Assert.isTrue(new Temperature(5000).equals("temperature(5000)"));
  }}
}
